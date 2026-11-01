package p067l;

import android.text.Layout;

/* JADX INFO: renamed from: l.ۨ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8SE */
/* JADX INFO: loaded from: classes3.dex */
public final class C13688 {

    /* JADX INFO: renamed from: ᩷ */
    public CharSequence f38614;

    /* JADX INFO: renamed from: ۜ */
    public long f38606 = 0;

    /* JADX INFO: renamed from: ֫ */
    public long f38605 = 0;

    /* JADX INFO: renamed from: ۢ */
    public int f38608 = 2;

    /* JADX INFO: renamed from: ۧ */
    public float f38609 = -3.4028235E38f;

    /* JADX INFO: renamed from: ᩳ */
    public int f38613 = 1;

    /* JADX INFO: renamed from: ܽ */
    public int f38611 = 0;

    /* JADX INFO: renamed from: ܿ */
    public float f38612 = -3.4028235E38f;

    /* JADX INFO: renamed from: ܳ */
    public int f38610 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ᩻ */
    public float f38615 = 1.0f;

    /* JADX INFO: renamed from: ۡ */
    public int f38607 = Integer.MIN_VALUE;

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX INFO: renamed from: ֫ */
    public final C23207 m31095() {
        Layout.Alignment alignment;
        float f = this.f38612;
        float f2 = -3.4028235E38f;
        if (f == -3.4028235E38f) {
            int i = this.f38608;
            if (i != 4) {
                f = i != 5 ? 0.5f : 1.0f;
            } else {
                f = 0.0f;
            }
        }
        int i2 = this.f38610;
        if (i2 == Integer.MIN_VALUE) {
            int i3 = this.f38608;
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
        C23207 c23207 = new C23207();
        int i4 = this.f38608;
        if (i4 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i4 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i4 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 != 5) {
            C10050.m23419(i4, "Unknown textAlignment: ");
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        c23207.m51731(alignment);
        float f3 = this.f38609;
        int i5 = this.f38613;
        if (f3 != -3.4028235E38f && i5 == 0 && (f3 < 0.0f || f3 > 1.0f)) {
            f2 = 1.0f;
        } else if (f3 != -3.4028235E38f) {
            f2 = f3;
        } else if (i5 == 0) {
            f2 = 1.0f;
        }
        c23207.m51722(f2, i5);
        c23207.m51723(this.f38611);
        c23207.m51728(f);
        c23207.m51730(i2);
        float f4 = this.f38615;
        if (i2 == 0) {
            f = 1.0f - f;
        } else if (i2 == 1) {
            f = f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
        } else if (i2 != 2) {
            throw new IllegalStateException(String.valueOf(i2));
        }
        c23207.m51738(Math.min(f4, f));
        c23207.m51734(this.f38607);
        CharSequence charSequence = this.f38614;
        if (charSequence != null) {
            c23207.m51726(charSequence);
        }
        return c23207;
    }
}
