package l;

import android.os.Bundle;
import java.io.IOException;
import java.io.UncheckedIOException;

/* JADX INFO: renamed from: l.ۚ۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6QO */
/* JADX INFO: loaded from: classes2.dex */
public final class C5213 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m14989(Bundle bundle, String str) {
        return bundle.containsKey(str) || bundle.containsKey(str.concat("Path"));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m14990(Bundle bundle, String str) {
        byte[] byteArray = bundle.getByteArray(str);
        if (byteArray != null) {
            return byteArray;
        }
        String string = bundle.getString(str.concat("Path"));
        if (string == null) {
            throw new IllegalArgumentException("Missing memory view state");
        }
        AbstractC15440 abstractC15440M39866 = C16999.m39866(string, new String[0]);
        try {
            return abstractC15440M39866.m36506();
        } catch (IOException e) {
            if (abstractC15440M39866.mo23120()) {
                throw new UncheckedIOException(e);
            }
            return null;
        }
    }
}
