package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3246 {

    /* JADX INFO: renamed from: ֫ */
    public int f6323;

    /* JADX INFO: renamed from: ۧ */
    public int f6324;

    /* JADX INFO: renamed from: ܽ */
    public final int f6325;

    /* JADX INFO: renamed from: ܿ */
    public int f6326;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C9952 f6327;

    public C3246(C9952 c9952, int i) {
        this.f6327 = c9952;
        this.f6325 = i;
    }

    /* JADX INFO: renamed from: ܽ */
    public static AbstractC22732 m5657(C3246 c3246) {
        C9952 c9952 = c3246.f6327;
        return new C20011(c3246, c9952.f27561, c3246.f6325, c9952.f27555);
    }

    /* JADX INFO: renamed from: ۧ */
    private int m5654() {
        if (this.f6324 == 0) {
            C9952 c9952 = this.f6327;
            C20168 c20168M13859 = c9952.f27561.m33504().m13859(this.f6325);
            for (int i = 0; i < c9952.f27555; i++) {
                c20168M13859.m45635();
            }
            this.f6324 = c20168M13859.m45631();
        }
        return this.f6324;
    }

    /* JADX INFO: renamed from: ۧ */
    public static Iterator m5655(C3246 c3246) {
        C9952 c9952 = c3246.f6327;
        return new C20682(c3246, c9952.f27561, c3246.m5654(), c9952.f27558);
    }

    /* JADX INFO: renamed from: ֫ */
    private int m5651() {
        if (this.f6323 == 0) {
            C9952 c9952 = this.f6327;
            C20168 c20168M13859 = c9952.f27561.m33504().m13859(m5654());
            for (int i = 0; i < c9952.f27558; i++) {
                c20168M13859.m45635();
            }
            this.f6323 = c20168M13859.m45631();
        }
        return this.f6323;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Iterator m5652(C3246 c3246) {
        C9952 c9952 = c3246.f6327;
        return new C2575(c3246, c9952.f27561, c3246.m5651(), c9952.f27554);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static Iterator m5659(C3246 c3246) {
        C9952 c9952 = c3246.f6327;
        C14645 c14645 = c9952.f27561;
        if (c3246.f6326 == 0) {
            C20168 c20168M13859 = c14645.m33504().m13859(c3246.m5651());
            for (int i = 0; i < c9952.f27554; i++) {
                c20168M13859.m45635();
            }
            c3246.f6326 = c20168M13859.m45631();
        }
        return new C7270(c14645, c3246.f6326, c9952.f27564);
    }
}
