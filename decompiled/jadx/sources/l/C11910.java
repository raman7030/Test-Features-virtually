package l;

import android.text.Layout;

/* JADX INFO: renamed from: l.ۨ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8SE */
/* JADX INFO: loaded from: classes3.dex */
public final class C11910 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public CharSequence f35605;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f35597 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f35596 = 0;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f35599 = 2;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f35600 = -3.4028235E38f;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f35604 = 1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f35602 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f35603 = -3.4028235E38f;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f35601 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f35606 = 1.0f;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f35598 = Integer.MIN_VALUE;

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21927 m29043() {
        Layout.Alignment alignment;
        float f = this.f35603;
        float f2 = -3.4028235E38f;
        if (f == -3.4028235E38f) {
            int i = this.f35599;
            if (i != 4) {
                f = i != 5 ? 0.5f : 1.0f;
            } else {
                f = 0.0f;
            }
        }
        int i2 = this.f35601;
        if (i2 == Integer.MIN_VALUE) {
            int i3 = this.f35599;
            if (i3 == 1) {
                i2 = 0;
            } else if (i3 == 3) {
                i2 = 2;
            } else if (i3 == 4) {
                i2 = 0;
            } else if (i3 != 5) {
                i2 = 1;
            } else {
                i2 = 2;
            }
        }
        C21927 c21927 = new C21927();
        int i4 = this.f35599;
        if (i4 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i4 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i4 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 != 5) {
            C8083.m21451(i4, "Unknown textAlignment: ");
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        c21927.m49394(alignment);
        float f3 = this.f35600;
        int i5 = this.f35604;
        if (f3 != -3.4028235E38f && i5 == 0 && (f3 < 0.0f || f3 > 1.0f)) {
            f2 = 1.0f;
        } else if (f3 != -3.4028235E38f) {
            f2 = f3;
        } else if (i5 == 0) {
            f2 = 1.0f;
        }
        c21927.m49385(f2, i5);
        c21927.m49386(this.f35602);
        c21927.m49391(f);
        c21927.m49393(i2);
        float f4 = this.f35606;
        if (i2 == 0) {
            f = 1.0f - f;
        } else if (i2 == 1) {
            f = f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
        } else if (i2 != 2) {
            throw new IllegalStateException(String.valueOf(i2));
        }
        c21927.m49401(Math.min(f4, f));
        c21927.m49397(this.f35598);
        CharSequence charSequence = this.f35605;
        if (charSequence != null) {
            c21927.m49389(charSequence);
        }
        return c21927;
    }
}
