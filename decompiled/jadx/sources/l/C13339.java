package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.۬᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1UX */
/* JADX INFO: loaded from: classes3.dex */
public final class C13339 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public CharSequence f39908;

    public C13339(String str) {
        this.f39908 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32317(StringBuilder sb) {
        this.f39908 = sb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13339.class != obj.getClass()) {
            return false;
        }
        return TextUtils.equals(this.f39908, ((C13339) obj).f39908);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f39908;
        if (charSequence instanceof String) {
            return charSequence.hashCode();
        }
        int length = charSequence.length();
        int iCharAt = 0;
        for (int i = 0; i < length; i++) {
            iCharAt = (iCharAt * 31) + this.f39908.charAt(i);
        }
        return iCharAt;
    }
}
