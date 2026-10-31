package org.bouncycastle.crypto.constraints;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class Utils {
    public static void addAliases(Set set) {
        if (set.contains("RC4")) {
            set.add("ARC4");
        } else if (set.contains("ARC4")) {
            set.add("RC4");
        }
    }
}
