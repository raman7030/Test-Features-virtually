package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.۬᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: W8GP */
/* JADX INFO: loaded from: classes3.dex */
public final class C13396 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f40045;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f40046;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8353 f40047;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f40048;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C8353 f40049;

    public C13396(String str, C8353 c8353, C8353 c8354, int i, int i2) {
        C22632.m50631(i == 0 || i2 == 0);
        if (!TextUtils.isEmpty(str)) {
            this.f40045 = str;
            c8353.getClass();
            this.f40049 = c8353;
            c8354.getClass();
            this.f40047 = c8354;
            this.f40048 = i;
            this.f40046 = i2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C13396.class == obj.getClass()) {
            C13396 c13396 = (C13396) obj;
            if (this.f40048 == c13396.f40048 && this.f40046 == c13396.f40046 && this.f40045.equals(c13396.f40045) && this.f40049.equals(c13396.f40049) && this.f40047.equals(c13396.f40047)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f40047.hashCode() + ((this.f40049.hashCode() + C11010.m27349((((this.f40048 + 527) * 31) + this.f40046) * 31, 31, this.f40045)) * 31);
    }
}
