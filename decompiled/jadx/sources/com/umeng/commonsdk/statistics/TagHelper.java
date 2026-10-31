package com.umeng.commonsdk.statistics;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class TagHelper {
    public static Object lock = new Object();
    public static Map moduleTags = new HashMap();

    public static void setModuleTag(String str, String str2) {
        synchronized (lock) {
            try {
                try {
                    if (moduleTags.size() >= 30) {
                        return;
                    }
                    if (!moduleTags.containsKey(str)) {
                        moduleTags.put(str, str2);
                    }
                } catch (Throwable unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void deleteModuleTag(String str) {
        synchronized (lock) {
            try {
                if (moduleTags.containsKey(str)) {
                    moduleTags.remove(str);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static Map getModuleTags() {
        HashMap map = new HashMap();
        synchronized (lock) {
            if (moduleTags.size() > 0) {
                for (Map.Entry entry : moduleTags.entrySet()) {
                    map.put((String) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        return map;
    }
}
