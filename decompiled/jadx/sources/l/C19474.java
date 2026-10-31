package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩵۬, reason: contains not printable characters */
/* JADX INFO: compiled from: P5Z7 */
/* JADX INFO: loaded from: classes4.dex */
public class C19474 {
    /* JADX INFO: renamed from: ֫ */
    public Typeface mo8053(Context context, C9308 c9308, Resources resources, int i) {
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public Typeface mo8054(Context context, C17275[] c17275Arr, int i) {
        throw null;
    }

    public C19474() {
        new ConcurrentMapC10942();
    }

    /* JADX INFO: renamed from: ֫ */
    public C17275 mo8055(int i, C17275[] c17275Arr) {
        C3951 c3951 = new C3951();
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        C17275 c17275 = null;
        int i3 = Integer.MAX_VALUE;
        for (C17275 c17276 : c17275Arr) {
            int iAbs = (Math.abs(c3951.mo11996(c17276) - i2) * 2) + (c3951.mo11995(c17276) == z ? 0 : 1);
            if (c17275 == null || i3 > iAbs) {
                c17275 = c17276;
                i3 = iAbs;
            }
        }
        return c17275;
    }

    /* JADX INFO: renamed from: ֫ */
    public Typeface mo8052(Context context, InputStream inputStream) {
        File fileM1946 = C0422.m1946(context);
        if (fileM1946 == null) {
            return null;
        }
        try {
            if (C0422.m1950(fileM1946, inputStream)) {
                return Typeface.createFromFile(fileM1946.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM1946.delete();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public Typeface mo8051(Context context, Resources resources, int i, String str, int i2) {
        File fileM1946 = C0422.m1946(context);
        if (fileM1946 == null) {
            return null;
        }
        try {
            if (C0422.m1949(fileM1946, resources, i)) {
                return Typeface.createFromFile(fileM1946.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM1946.delete();
        }
    }
}
