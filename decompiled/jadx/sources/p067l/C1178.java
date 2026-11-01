package p067l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;

/* JADX INFO: renamed from: l.ۜ۬ */
/* JADX INFO: compiled from: 857F */
/* JADX INFO: loaded from: classes2.dex */
public final class C1178 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f23904 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final C0907 f23905;

    /* JADX INFO: renamed from: ܽ */
    public static final C1808 f23906;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f23906 = new C0968();
        } else if (i >= 28) {
            f23906 = new C1633();
        } else if (i >= 26) {
            f23906 = new C1283();
        } else if (i >= 24 && C1318.m26544()) {
            f23906 = new C1318();
        } else {
            f23906 = new C1878();
        }
        f23905 = new C0907(16);
    }

    /* JADX INFO: renamed from: ۧ */
    public static Typeface m20368(Resources resources, int i, String str, int i2, int i3) {
        return (Typeface) f23905.m6785(m20367(resources, i, str, i2, i3));
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m20367(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    /* JADX INFO: renamed from: ֫ */
    public static Typeface m20365(Context context, InterfaceC1864 interfaceC1864, Resources resources, int i, String str, int i2, int i3, AbstractC1584 abstractC1584, boolean z) {
        Typeface typefaceMo10084;
        Typeface typefaceCreate;
        if (interfaceC1864 instanceof C1619) {
            C1619 c1619 = (C1619) interfaceC1864;
            String strM39020 = c1619.m39020();
            if (strM39020 == null || strM39020.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(strM39020, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                if (abstractC1584 != null) {
                    abstractC1584.callbackSuccessAsync(typefaceCreate, null);
                }
                return typefaceCreate;
            }
            typefaceMo10084 = C2014.m54519(context, c1619.m39019(), i3, !z ? abstractC1584 != null : c1619.m39018() != 0, z ? c1619.m39021() : -1, AbstractC1584.m37567((Handler) null), new C2018(abstractC1584));
        } else {
            typefaceMo10084 = f23906.mo10084(context, (C1304) interfaceC1864, resources, i3);
            if (abstractC1584 != null) {
                if (typefaceMo10084 != null) {
                    abstractC1584.callbackSuccessAsync(typefaceMo10084, null);
                } else {
                    abstractC1584.callbackFailAsync(-3, null);
                }
            }
        }
        if (typefaceMo10084 != null) {
            f23905.m6786(m20367(resources, i, str, i2, i3), typefaceMo10084);
        }
        return typefaceMo10084;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Typeface m20364(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface typefaceMo10082 = f23906.mo10082(context, resources, i, str, i3);
        if (typefaceMo10082 != null) {
            f23905.m6786(m20367(resources, i, str, i2, i3), typefaceMo10082);
        }
        return typefaceMo10082;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Typeface m20366(Context context, C1699[] c1699Arr, int i) {
        return f23906.mo10085(context, c1699Arr, i);
    }
}
