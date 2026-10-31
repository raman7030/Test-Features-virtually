package l;

import android.content.res.Configuration;

/* JADX INFO: renamed from: l.᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes.dex */
public final class C23746 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52392(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        int i = configuration.colorMode & 3;
        int i2 = configuration2.colorMode & 3;
        if (i != i2) {
            configuration3.colorMode |= i2;
        }
        int i3 = configuration.colorMode & 12;
        int i4 = configuration2.colorMode & 12;
        if (i3 != i4) {
            configuration3.colorMode |= i4;
        }
    }
}
