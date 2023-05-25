package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.List;

public class StringUtils {

    public static boolean isPositiveNumber(String str) {
        if(str == null){
            return false;
        }
        if(str.length() > 1 && str.charAt(0) == '0' && str.charAt(1) != '.'){
            return false;
        }
        return NumberUtils.toDouble(str) > 0;
    }
}
