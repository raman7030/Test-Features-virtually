package p067l;

import android.text.SpannableStringBuilder;

/* JADX INFO: renamed from: l.ۘۤ */
/* JADX INFO: compiled from: S2ZO */
/* JADX INFO: loaded from: classes2.dex */
public final class C1034 {

    /* JADX INFO: renamed from: ۜ */
    public static final String f15184;

    /* JADX INFO: renamed from: ܳ */
    public static final C1034 f15185;

    /* JADX INFO: renamed from: ܿ */
    public static final C1034 f15186;

    /* JADX INFO: renamed from: ᩳ */
    public static final /* synthetic */ int f15187 = 0;

    /* JADX INFO: renamed from: ᩷ */
    public static final String f15188;

    /* JADX INFO: renamed from: ᩻ */
    public static final InterfaceC1594 f15189;

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC1594 f15190;

    /* JADX INFO: renamed from: ۧ */
    public final int f15191;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f15192;

    static {
        InterfaceC1594 interfaceC1594 = C0999.f12759;
        f15189 = interfaceC1594;
        f15184 = Character.toString((char) 8206);
        f15188 = Character.toString((char) 8207);
        f15186 = new C1034(false, 2, interfaceC1594);
        f15185 = new C1034(true, 2, interfaceC1594);
    }

    public C1034(boolean z, int i, InterfaceC1594 interfaceC1594) {
        this.f15192 = z;
        this.f15191 = i;
        this.f15190 = interfaceC1594;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m13629(String str) {
        if (str == null) {
            return null;
        }
        return m13628(str, this.f15190).toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final SpannableStringBuilder m13628(CharSequence charSequence, InterfaceC1594 interfaceC1594) {
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean zMo38019 = ((AbstractC1839) interfaceC1594).mo38019(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = this.f15191 & 2;
        String str2 = "";
        String str3 = f15188;
        String str4 = f15184;
        boolean z = this.f15192;
        if (i != 0) {
            boolean zMo380110 = ((AbstractC1839) (zMo38019 ? C0999.f12762 : C0999.f12761)).mo38019(charSequence.length(), charSequence);
            if (z || !(zMo380110 || new C0964(charSequence).m9976() == 1)) {
                str = (!z || (zMo380110 && new C0964(charSequence).m9976() != -1)) ? "" : str3;
            } else {
                str = str4;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (zMo38019 != z) {
            spannableStringBuilder.append(zMo38019 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zMo380111 = ((AbstractC1839) (zMo38019 ? C0999.f12762 : C0999.f12761)).mo38019(charSequence.length(), charSequence);
        if (!z && (zMo380111 || new C0964(charSequence).m9977() == 1)) {
            str2 = str4;
        } else if (z && (!zMo380111 || new C0964(charSequence).m9977() == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: ֫ */
    public final SpannableStringBuilder m13627(CharSequence charSequence) {
        return m13628(charSequence, this.f15190);
    }
}
