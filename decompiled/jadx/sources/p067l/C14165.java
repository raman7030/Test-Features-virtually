package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.۫۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes3.dex */
public final class C14165 {

    /* JADX INFO: renamed from: ֫ */
    public C17441 f40396 = new C17441();

    /* JADX INFO: renamed from: ۜ */
    public C23929 f40397;

    /* JADX INFO: renamed from: ۧ */
    public List f40398;

    /* JADX INFO: renamed from: ܳ */
    public int f40399;

    /* JADX INFO: renamed from: ܽ */
    public boolean f40400;

    /* JADX INFO: renamed from: ܿ */
    public C22076 f40401;

    /* JADX INFO: renamed from: ᩳ */
    public int f40402;

    /* JADX INFO: renamed from: ᩷ */
    public int f40403;

    /* JADX INFO: renamed from: ᩻ */
    public InterfaceC9768 f40404;

    /* JADX INFO: renamed from: ֫ */
    public final boolean m32644(C14146 c14146, List list) {
        C22076 c22076;
        int i;
        int i2;
        return this.f40400 && this.f40404 == c14146.m32500() && this.f40403 == this.f40404.mo28581() && this.f40398 == list && this.f40397 == c14146.f40262 && (c22076 = this.f40401) == c14146.f40275.f12798 && c22076 != null && (i = this.f40399) >= 0 && i <= (i2 = this.f40402) && i2 < c22076.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m32643(InterfaceC2812 interfaceC2812, boolean z, float[] fArr, int i) {
        int iMo4446 = interfaceC2812.mo4446(z);
        int iMo4450 = interfaceC2812.mo4450(z);
        int iM49675 = this.f40401.m49675(iMo4446);
        if (iM49675 != -1) {
            float fM26496 = this.f40397.m26496();
            int iM49693 = this.f40401.m49693(iM49675);
            if (iMo4446 == iMo4450) {
                float fM26503 = this.f40397.m26503() / 16.0f;
                float f = iM49693 * fM26496;
                fArr[i] = f - fM26503;
                fArr[i + 1] = f + fM26503;
                return true;
            }
            if (iMo4450 > iMo4446 + 1 && (iM49675 = this.f40401.m49675(iMo4450 - 1)) == -1) {
                return false;
            }
            int iM49692 = this.f40401.m49692(iM49675);
            fArr[i] = iM49693 * fM26496;
            fArr[i + 1] = (iM49692 + 1) * fM26496;
            return true;
        }
        if (iMo4446 != this.f40401.m49695().f38063 + 1) {
            return false;
        }
        float fM26497 = this.f40397.m26496();
        float fM26504 = this.f40397.m26503() / 16.0f;
        float size = this.f40401.size() * fM26497;
        fArr[i] = (size - fM26504) - fM26504;
        fArr[i + 1] = size;
        return true;
    }
}
