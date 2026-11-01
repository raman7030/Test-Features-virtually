package p067l;

import android.os.Bundle;
import java.io.IOException;
import java.p066io.UncheckedIOException;

/* JADX INFO: renamed from: l.ۚ۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6QO */
/* JADX INFO: loaded from: classes2.dex */
public final class C7323 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m16899(Bundle bundle, String str) {
        return bundle.containsKey(str) || bundle.containsKey(str.concat("Path"));
    }

    /* JADX INFO: renamed from: ۧ */
    public static byte[] m16900(Bundle bundle, String str) {
        byte[] byteArray = bundle.getByteArray(str);
        if (byteArray != null) {
            return byteArray;
        }
        String string = bundle.getString(str.concat("Path"));
        if (string == null) {
            throw new IllegalArgumentException("Missing memory view state");
        }
        AbstractC17043 abstractC17043M42109 = C18524.m42109(string, new String[0]);
        try {
            return abstractC17043M42109.m38664();
        } catch (IOException e) {
            if (abstractC17043M42109.mo25094()) {
                throw new UncheckedIOException(e);
            }
            return null;
        }
    }
}
