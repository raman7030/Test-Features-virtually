package p067l;

/* JADX INFO: renamed from: l.۟ᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7AT */
/* JADX INFO: loaded from: classes3.dex */
public final class C9620 {

    /* JADX INFO: renamed from: ֫ */
    public final String f26489;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f26490;

    public C9620(String str, boolean z) {
        this.f26489 = str;
        this.f26490 = z;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX INFO: renamed from: ֫ */
    public static C9620 m22402(int i, int i2, CharSequence charSequence) {
        if (i >= i2) {
            return new C9620("", i < i2);
        }
        StringBuilder sb = new StringBuilder(Math.min(i2 - i, 480));
        for (int i3 = 0; i < i2 && i3 < 240; i3++) {
            int i4 = i + 1;
            char cCharAt = charSequence.charAt(i);
            sb.append(cCharAt);
            if (!Character.isHighSurrogate(cCharAt) || i4 >= i2) {
                i = i4;
            } else {
                char cCharAt2 = charSequence.charAt(i4);
                if (Character.isLowSurrogate(cCharAt2)) {
                    sb.append(cCharAt2);
                    i += 2;
                } else {
                    i = i4;
                }
            }
        }
        return new C9620(sb.toString(), i < i2);
    }
}
