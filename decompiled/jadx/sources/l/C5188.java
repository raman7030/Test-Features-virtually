package l;

import java.nio.FloatBuffer;

/* JADX INFO: renamed from: l.ۚۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8I9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5188 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f16263;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final FloatBuffer f16264;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final FloatBuffer f16265;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f16266;

    public C5188(C18594 c18594) {
        float[] fArr = c18594.f57675;
        this.f16266 = fArr.length / 3;
        this.f16265 = C3728.m11334(fArr);
        this.f16264 = C3728.m11334(c18594.f57673);
        int i = c18594.f57672;
        if (i == 1) {
            this.f16263 = 5;
        } else if (i == 2) {
            this.f16263 = 6;
        } else {
            this.f16263 = 4;
        }
    }
}
