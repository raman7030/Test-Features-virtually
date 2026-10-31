package com.google.android.material.internal;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class ManufacturerUtils {
    public static final String LGE = "lge";
    public static final String MEIZU = "meizu";
    public static final String SAMSUNG = "samsung";

    public static boolean isMeizuDevice() {
        return getManufacturer().equals(MEIZU);
    }

    public static boolean isLGEDevice() {
        return getManufacturer().equals(LGE);
    }

    public static boolean isSamsungDevice() {
        return getManufacturer().equals(SAMSUNG);
    }

    public static boolean isDateInputKeyboardMissingSeparatorCharacters() {
        return isLGEDevice() || isSamsungDevice();
    }

    public static String getManufacturer() {
        String str = Build.MANUFACTURER;
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }
}
