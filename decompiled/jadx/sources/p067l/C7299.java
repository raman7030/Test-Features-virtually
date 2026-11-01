package p067l;

import java.nio.FloatBuffer;

/* JADX INFO: renamed from: l.ۚۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8I9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7299 {

    /* JADX INFO: renamed from: ֫ */
    public final int f19104;

    /* JADX INFO: renamed from: ۧ */
    public final FloatBuffer f19105;

    /* JADX INFO: renamed from: ܽ */
    public final FloatBuffer f19106;

    /* JADX INFO: renamed from: ᩳ */
    public final int f19107;

    public C7299(C20040 c20040) {
        float[] fArr = c20040.f60898;
        this.f19107 = fArr.length / 3;
        this.f19106 = C5911.m13286(fArr);
        this.f19105 = C5911.m13286(c20040.f60896);
        int i = c20040.f60895;
        if (i == 1) {
            this.f19104 = 5;
        } else if (i == 2) {
            this.f19104 = 6;
        } else {
            this.f19104 = 4;
        }
    }
}
