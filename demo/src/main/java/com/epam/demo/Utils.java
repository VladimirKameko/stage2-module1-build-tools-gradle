package com.epam.demo;

import java.util.ArrayList;
import java.util.List;

import com.epam.utils.StringUtils;

public class Utils {

    public static boolean isAllPositiveNumbers(List<String> args) {

        for (String st : args) {
            if (!StringUtils.isPositiveNumber(st))
                return false;
        }
        return true;
    }
}