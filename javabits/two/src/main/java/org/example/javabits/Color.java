package org.example.javabits;

import java.util.Arrays;

public enum Color {
    Red ("#FF0000"),
    Green ("#00FF00"),
    Blue ("#0000FF"),
    Yellow ("#FFFF00");

    public final String hexValue;

    Color (String hexValue) {
        this.hexValue = hexValue;
    }

    public String getHexValue() {
        return this.hexValue;
    }

    public Color getColorFromHexCode(String hexCode) throws EnumConstantNotPresentException {
        for (var color : Color.values()) {
            if (color.hexValue.equalsIgnoreCase(hexCode))
                return color;
        }
        throw new EnumConstantNotPresentException(Color.class, String.format("No matching color found for hex %s. Supported Colors are: %s", hexCode, Arrays.toString(Color.values())));
    }
}