package l;

import com.umeng.analytics.pro.am;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: l.۟۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I67E */
/* JADX INFO: loaded from: classes3.dex */
public final class C7335 extends C11069 {
    @Override // l.C11069, l.AbstractC8246
    /* JADX INFO: renamed from: ܿ */
    public final void mo12088() {
    }

    @Override // l.C11069, l.AbstractC8246
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1618(C3438 c3438) throws IOException {
        int iMo19046 = ((InterfaceC8835) this.f33245).mo19046();
        c3438.getClass();
        c3438.write(".array-data ", 0, 12);
        c3438.m10510(((InterfaceC8835) this.f33245).mo19046());
        c3438.write(10);
        c3438.m10512();
        List<Number> listMo19045 = ((InterfaceC8835) this.f33245).mo19045();
        String str = iMo19046 != 1 ? iMo19046 != 2 ? "" : am.aB : am.aI;
        boolean z = this.f33244.f4289.f72438;
        for (Number number : listMo19045) {
            C4718.m13817(c3438, number.longValue());
            c3438.write(str, 0, str.length());
            if (z) {
                if (iMo19046 == 8) {
                    C11069.m27456(c3438, number.longValue());
                } else if (iMo19046 == 4) {
                    int iIntValue = number.intValue();
                    if (!m27459(c3438, iIntValue)) {
                        C11069.m27458(c3438, iIntValue);
                    }
                }
            }
            c3438.write("\n", 0, 1);
        }
        c3438.m10508();
        c3438.write(".end array-data", 0, 15);
        return true;
    }
}
