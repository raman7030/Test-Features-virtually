package l;

import java.util.List;

/* JADX INFO: renamed from: l.۫۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes3.dex */
public final class C12412 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C15859 f37382 = new C15859();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C22686 f37383;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f37384;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f37385;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f37386;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C20736 f37387;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f37388;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f37389;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC7785 f37390;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30580(C12392 c12392, List list) {
        C20736 c20736;
        int i;
        int i2;
        return this.f37386 && this.f37390 == c12392.m30436() && this.f37389 == this.f37390.mo26548() && this.f37384 == list && this.f37383 == c12392.f37245 && (c20736 = this.f37387) == c12392.f37258.f9998 && c20736 != null && (i = this.f37385) >= 0 && i <= (i2 = this.f37388) && i2 < c20736.size();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30579(InterfaceC0467 interfaceC0467, boolean z, float[] fArr, int i) {
        int iMo2066 = interfaceC0467.mo2066(z);
        int iMo2070 = interfaceC0467.mo2070(z);
        int iM47348 = this.f37387.m47348(iMo2066);
        if (iM47348 != -1) {
            float fM24484 = this.f37383.m24484();
            int iM47366 = this.f37387.m47366(iM47348);
            if (iMo2066 == iMo2070) {
                float fM24491 = this.f37383.m24491() / 16.0f;
                float f = iM47366 * fM24484;
                fArr[i] = f - fM24491;
                fArr[i + 1] = f + fM24491;
                return true;
            }
            if (iMo2070 > iMo2066 + 1 && (iM47348 = this.f37387.m47348(iMo2070 - 1)) == -1) {
                return false;
            }
            int iM47365 = this.f37387.m47365(iM47348);
            fArr[i] = iM47366 * fM24484;
            fArr[i + 1] = (iM47365 + 1) * fM24484;
            return true;
        }
        if (iMo2066 != this.f37387.m47368().f35064 + 1) {
            return false;
        }
        float fM24485 = this.f37383.m24484();
        float fM24492 = this.f37383.m24491() / 16.0f;
        float size = this.f37387.size() * fM24485;
        fArr[i] = (size - fM24492) - fM24492;
        fArr[i + 1] = size;
        return true;
    }
}
