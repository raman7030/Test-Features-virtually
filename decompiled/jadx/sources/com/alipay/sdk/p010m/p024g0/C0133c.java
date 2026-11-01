package com.alipay.sdk.p010m.p024g0;

import android.os.Environment;
import java.io.File;

/* JADX INFO: renamed from: com.alipay.sdk.m.g0.c */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0133c {
    /* JADX INFO: renamed from: a */
    public static String m673a(String str) {
        try {
            if (!m675a()) {
                return null;
            }
            File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), str);
            if (!file.exists()) {
                return null;
            }
            file.delete();
            return "";
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m674a(String str, String str2) {
        try {
            if (m675a()) {
                File file = new File(Environment.getExternalStorageDirectory(), str);
                if (file.exists() && file.isFile()) {
                    file.delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m675a() {
        String externalStorageState = Environment.getExternalStorageState();
        if (externalStorageState == null || externalStorageState.length() <= 0) {
            return false;
        }
        return (externalStorageState.equals("mounted") || externalStorageState.equals("mounted_ro")) && Environment.getExternalStorageDirectory() != null;
    }
}
