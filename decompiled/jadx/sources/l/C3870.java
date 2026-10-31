package l;

import android.text.SpannableStringBuilder;

/* JADX INFO: renamed from: l.ۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: S2ZO */
/* JADX INFO: loaded from: classes2.dex */
public final class C3870 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final String f12377;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C3870 f12378;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C3870 f12379;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f12380 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final String f12381;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final InterfaceC15157 f12382;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC15157 f12383;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f12384;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f12385;

    static {
        InterfaceC15157 interfaceC15157 = C3164.f9956;
        f12382 = interfaceC15157;
        f12377 = Character.toString((char) 8206);
        f12381 = Character.toString((char) 8207);
        f12379 = new C3870(false, 2, interfaceC15157);
        f12378 = new C3870(true, 2, interfaceC15157);
    }

    public C3870(boolean z, int i, InterfaceC15157 interfaceC15157) {
        this.f12385 = z;
        this.f12384 = i;
        this.f12383 = interfaceC15157;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m11693(String str) {
        if (str == null) {
            return null;
        }
        return m11692(str, this.f12383).toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SpannableStringBuilder m11692(CharSequence charSequence, InterfaceC15157 interfaceC15157) {
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean zMo35861 = ((AbstractC20098) interfaceC15157).mo35861(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = this.f12384 & 2;
        String str2 = "";
        String str3 = f12381;
        String str4 = f12377;
        boolean z = this.f12385;
        if (i != 0) {
            boolean zMo35862 = ((AbstractC20098) (zMo35861 ? C3164.f9959 : C3164.f9958)).mo35861(charSequence.length(), charSequence);
            if (z || !(zMo35862 || new C2459(charSequence).m7928() == 1)) {
                str = (!z || (zMo35862 && new C2459(charSequence).m7928() != -1)) ? "" : str3;
            } else {
                str = str4;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (zMo35861 != z) {
            spannableStringBuilder.append(zMo35861 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zMo35863 = ((AbstractC20098) (zMo35861 ? C3164.f9959 : C3164.f9958)).mo35861(charSequence.length(), charSequence);
        if (!z && (zMo35863 || new C2459(charSequence).m7929() == 1)) {
            str2 = str4;
        } else if (z && (!zMo35863 || new C2459(charSequence).m7929() == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SpannableStringBuilder m11691(CharSequence charSequence) {
        return m11692(charSequence, this.f12383);
    }
}
