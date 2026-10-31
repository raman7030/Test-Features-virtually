package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.۟ܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8WE */
/* JADX INFO: loaded from: classes3.dex */
public final class C7569 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f23375;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f23376;

    public C7569(String str, String str2) {
        this.f23375 = C6554.m18061(50, str);
        this.f23376 = C6554.m18061(10000, str2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m20289() {
        if (TextUtils.isEmpty(this.f23375)) {
            return C6554.m18061(50, this.f23376);
        }
        return this.f23375;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m20291() {
        return this.f23375;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20290(String str) {
        this.f23375 = TextUtils.isEmpty(str) ? null : C6554.m18061(50, str);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m20293() {
        return this.f23376;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m20292(String str) {
        this.f23376 = str;
    }
}
