package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۧ᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: E43E */
/* JADX INFO: loaded from: classes3.dex */
public final class C13134 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC4297 f36896;

    /* JADX INFO: renamed from: ܽ */
    public C10471 f36898;

    /* JADX INFO: renamed from: ۧ */
    public C20271 f36897 = new C20271();

    /* JADX INFO: renamed from: ᩳ */
    public HashMap f36899 = new HashMap();

    public C13134(C10471 c10471, InterfaceC4297 interfaceC4297) {
        this.f36898 = c10471;
        this.f36896 = interfaceC4297;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30040(Object obj, int i, int i2, int i3) {
        C15555 c15555 = new C15555();
        c15555.f44441 = obj;
        c15555.f44439 = i;
        c15555.f44440 = i2;
        c15555.f44438 = i3;
        this.f36897.m45777(c15555);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m30039(C16525 c16525, InterfaceC15575 interfaceC15575, C23623 c23623) {
        int iM30036;
        int iM30037;
        new C9521(this).m22144(this.f36898);
        int i = 0;
        for (C4848 c4848M45783 = this.f36897.m45783(); c4848M45783.m10293(); c4848M45783 = c4848M45783.f11035) {
            C15555 c15555 = (C15555) c4848M45783.f11034;
            int i2 = c15555.f44440;
            int i3 = c15555.f44438;
            if (i2 != i3) {
                C4416 c4416 = (C4416) this.f36899.get(c15555.f44441);
                if (c4416 != null) {
                    int i4 = c4416.f9922;
                    if (i4 != -1 && c4416.f9921 != -1 && (iM30036 = m30036(i4, interfaceC15575, c23623)) != -1 && (iM30037 = m30036(c4416.f9921, interfaceC15575, c23623)) != -1) {
                        c16525.m37503(c15555.f44440);
                        c16525.m37503(i3 - 1);
                        c16525.m37504(iM30036);
                        c16525.m37504(iM30037);
                        c16525.m37503(c15555.f44439);
                        i++;
                    }
                } else {
                    C1446.m31702("CRT: tree source positions are undefined");
                    throw null;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m30036(int i, InterfaceC15575 interfaceC15575, C23623 c23623) {
        int iMo22240 = interfaceC15575.mo22240(i);
        int iMo8997 = interfaceC15575.mo8997(i);
        if (iMo22240 < 1) {
            throw new IllegalArgumentException("line must be greater than 0");
        }
        if (iMo8997 < 1) {
            throw new IllegalArgumentException("column must be greater than 0");
        }
        int i2 = (iMo22240 > 4194303 || iMo8997 > 1023) ? -1 : (iMo22240 << 10) + iMo8997;
        if (i2 == -1) {
            C12895 c12895 = C15675.f45417;
            c23623.m9347(i, new C12895("compiler", "position.overflow", Integer.valueOf(iMo22240)));
        }
        return i2;
    }
}
