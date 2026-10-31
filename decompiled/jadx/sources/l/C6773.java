package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;

/* JADX INFO: renamed from: l.ۜ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 857F */
/* JADX INFO: loaded from: classes2.dex */
public final class C6773 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f21030 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C1315 f21031;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C19474 f21032;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f21032 = new C2540();
        } else if (i >= 28) {
            f21032 = new C15944();
        } else if (i >= 26) {
            f21032 = new C8890();
        } else if (i >= 24 && C9596.m24532()) {
            f21032 = new C9596();
        } else {
            f21032 = new C20885();
        }
        f21031 = new C1315(16);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Typeface m18420(Resources resources, int i, String str, int i2, int i3) {
        return (Typeface) f21031.m4553(m18419(resources, i, str, i2, i3));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m18419(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Typeface m18417(Context context, InterfaceC20597 interfaceC20597, Resources resources, int i, String str, int i2, int i3, AbstractC14951 abstractC14951, boolean z) {
        Typeface typefaceMo8053;
        Typeface typefaceCreate;
        if (interfaceC20597 instanceof C15656) {
            C15656 c15656 = (C15656) interfaceC20597;
            String strM36854 = c15656.m36854();
            if (strM36854 == null || strM36854.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(strM36854, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                if (abstractC14951 != null) {
                    abstractC14951.callbackSuccessAsync(typefaceCreate, null);
                }
                return typefaceCreate;
            }
            typefaceMo8053 = C23625.m52116(context, c15656.m36853(), i3, !z ? abstractC14951 != null : c15656.m36852() != 0, z ? c15656.m36855() : -1, AbstractC14951.m35415((Handler) null), new C23706(abstractC14951));
        } else {
            typefaceMo8053 = f21032.mo8053(context, (C9308) interfaceC20597, resources, i3);
            if (abstractC14951 != null) {
                if (typefaceMo8053 != null) {
                    abstractC14951.callbackSuccessAsync(typefaceMo8053, null);
                } else {
                    abstractC14951.callbackFailAsync(-3, null);
                }
            }
        }
        if (typefaceMo8053 != null) {
            f21031.m4554(m18419(resources, i, str, i2, i3), typefaceMo8053);
        }
        return typefaceMo8053;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Typeface m18416(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface typefaceMo8051 = f21032.mo8051(context, resources, i, str, i3);
        if (typefaceMo8051 != null) {
            f21031.m4554(m18419(resources, i, str, i2, i3), typefaceMo8051);
        }
        return typefaceMo8051;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Typeface m18418(Context context, C17275[] c17275Arr, int i) {
        return f21032.mo8054(context, c17275Arr, i);
    }
}
