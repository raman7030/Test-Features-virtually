package l;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗ֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: G8HR */
/* JADX INFO: loaded from: classes2.dex */
public final class C2877 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final String f9170;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final String f9171;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final String f9172;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final String f9173;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String f9174;

    static {
        String str = C3603.f11424;
        f9174 = Integer.toString(0, 36);
        f9170 = Integer.toString(1, 36);
        f9171 = Integer.toString(2, 36);
        f9173 = Integer.toString(3, 36);
        f9172 = Integer.toString(4, 36);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m8801(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (C9933 c9933 : (C9933[]) spanned.getSpans(0, spanned.length(), C9933.class)) {
            arrayList.add(m8800(spanned, c9933, 1, c9933.m25041()));
        }
        for (C5699 c5699 : (C5699[]) spanned.getSpans(0, spanned.length(), C5699.class)) {
            arrayList.add(m8800(spanned, c5699, 2, c5699.m16109()));
        }
        for (C12754 c12754 : (C12754[]) spanned.getSpans(0, spanned.length(), C12754.class)) {
            arrayList.add(m8800(spanned, c12754, 3, null));
        }
        for (C11344 c11344 : (C11344[]) spanned.getSpans(0, spanned.length(), C11344.class)) {
            arrayList.add(m8800(spanned, c11344, 4, c11344.m28052()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8802(Bundle bundle, SpannableString spannableString) {
        int i = bundle.getInt(f9174);
        int i2 = bundle.getInt(f9170);
        int i3 = bundle.getInt(f9171);
        int i4 = bundle.getInt(f9173, -1);
        Bundle bundle2 = bundle.getBundle(f9172);
        if (i4 == 1) {
            bundle2.getClass();
            spannableString.setSpan(C9933.m25040(bundle2), i, i2, i3);
            return;
        }
        if (i4 == 2) {
            bundle2.getClass();
            spannableString.setSpan(C5699.m16108(bundle2), i, i2, i3);
        } else if (i4 == 3) {
            spannableString.setSpan(new C12754(), i, i2, i3);
        } else {
            if (i4 != 4) {
                return;
            }
            bundle2.getClass();
            spannableString.setSpan(C11344.m28051(bundle2), i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bundle m8800(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f9174, spanned.getSpanStart(obj));
        bundle2.putInt(f9170, spanned.getSpanEnd(obj));
        bundle2.putInt(f9171, spanned.getSpanFlags(obj));
        bundle2.putInt(f9173, i);
        if (bundle != null) {
            bundle2.putBundle(f9172, bundle);
        }
        return bundle2;
    }
}
