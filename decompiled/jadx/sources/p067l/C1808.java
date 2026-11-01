package p067l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩵۬ */
/* JADX INFO: compiled from: P5Z7 */
/* JADX INFO: loaded from: classes4.dex */
public class C1808 {
    /* JADX INFO: renamed from: ֫ */
    public Typeface mo10084(Context context, C1304 c1304, Resources resources, int i) {
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public Typeface mo10085(Context context, C1699[] c1699Arr, int i) {
        throw null;
    }

    public C1808() {
        new ConcurrentMapC12768();
    }

    /* JADX INFO: renamed from: ֫ */
    public C1699 mo10086(int i, C1699[] c1699Arr) {
        C1038 c1038 = new C1038();
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        C1699 c1699 = null;
        int i3 = Integer.MAX_VALUE;
        for (C1699 c16910 : c1699Arr) {
            int iAbs = (Math.abs(c1038.mo13917(c16910) - i2) * 2) + (c1038.mo13916(c16910) == z ? 0 : 1);
            if (c1699 == null || i3 > iAbs) {
                c1699 = c16910;
                i3 = iAbs;
            }
        }
        return c1699;
    }

    /* JADX INFO: renamed from: ֫ */
    public Typeface mo10083(Context context, InputStream inputStream) {
        File fileM4335 = C0863.m4335(context);
        if (fileM4335 == null) {
            return null;
        }
        try {
            if (C0863.m4339(fileM4335, inputStream)) {
                return Typeface.createFromFile(fileM4335.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM4335.delete();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public Typeface mo10082(Context context, Resources resources, int i, String str, int i2) {
        File fileM4335 = C0863.m4335(context);
        if (fileM4335 == null) {
            return null;
        }
        try {
            if (C0863.m4338(fileM4335, resources, i)) {
                return Typeface.createFromFile(fileM4335.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM4335.delete();
        }
    }
}
