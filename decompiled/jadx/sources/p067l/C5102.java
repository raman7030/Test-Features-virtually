package p067l;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗ֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: G8HR */
/* JADX INFO: loaded from: classes2.dex */
public final class C5102 {

    /* JADX INFO: renamed from: ֫ */
    public static final String f11968;

    /* JADX INFO: renamed from: ۧ */
    public static final String f11969;

    /* JADX INFO: renamed from: ܽ */
    public static final String f11970;

    /* JADX INFO: renamed from: ܿ */
    public static final String f11971;

    /* JADX INFO: renamed from: ᩳ */
    public static final String f11972;

    static {
        String str = C5792.f14228;
        f11972 = Integer.toString(0, 36);
        f11968 = Integer.toString(1, 36);
        f11969 = Integer.toString(2, 36);
        f11971 = Integer.toString(3, 36);
        f11970 = Integer.toString(4, 36);
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m10868(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (C11808 c11808 : (C11808[]) spanned.getSpans(0, spanned.length(), C11808.class)) {
            arrayList.add(m10867(spanned, c11808, 1, c11808.m27058()));
        }
        for (C7784 c7784 : (C7784[]) spanned.getSpans(0, spanned.length(), C7784.class)) {
            arrayList.add(m10867(spanned, c7784, 2, c7784.m18028()));
        }
        for (C14489 c14489 : (C14489[]) spanned.getSpans(0, spanned.length(), C14489.class)) {
            arrayList.add(m10867(spanned, c14489, 3, null));
        }
        for (C13149 c13149 : (C13149[]) spanned.getSpans(0, spanned.length(), C13149.class)) {
            arrayList.add(m10867(spanned, c13149, 4, c13149.m30097()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10869(Bundle bundle, SpannableString spannableString) {
        int i = bundle.getInt(f11972);
        int i2 = bundle.getInt(f11968);
        int i3 = bundle.getInt(f11969);
        int i4 = bundle.getInt(f11971, -1);
        Bundle bundle2 = bundle.getBundle(f11970);
        if (i4 == 1) {
            bundle2.getClass();
            spannableString.setSpan(C11808.m27057(bundle2), i, i2, i3);
            return;
        }
        if (i4 == 2) {
            bundle2.getClass();
            spannableString.setSpan(C7784.m18027(bundle2), i, i2, i3);
        } else if (i4 == 3) {
            spannableString.setSpan(new C14489(), i, i2, i3);
        } else {
            if (i4 != 4) {
                return;
            }
            bundle2.getClass();
            spannableString.setSpan(C13149.m30096(bundle2), i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Bundle m10867(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f11972, spanned.getSpanStart(obj));
        bundle2.putInt(f11968, spanned.getSpanEnd(obj));
        bundle2.putInt(f11969, spanned.getSpanFlags(obj));
        bundle2.putInt(f11971, i);
        if (bundle != null) {
            bundle2.putBundle(f11970, bundle);
        }
        return bundle2;
    }
}
