package p067l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.۬᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1UX */
/* JADX INFO: loaded from: classes3.dex */
public final class C15046 {

    /* JADX INFO: renamed from: ֫ */
    public CharSequence f42974;

    public C15046(String str) {
        this.f42974 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34418(StringBuilder sb) {
        this.f42974 = sb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15046.class != obj.getClass()) {
            return false;
        }
        return TextUtils.equals(this.f42974, ((C15046) obj).f42974);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f42974;
        if (charSequence instanceof String) {
            return charSequence.hashCode();
        }
        int length = charSequence.length();
        int iCharAt = 0;
        for (int i = 0; i < length; i++) {
            iCharAt = (iCharAt * 31) + this.f42974.charAt(i);
        }
        return iCharAt;
    }
}
