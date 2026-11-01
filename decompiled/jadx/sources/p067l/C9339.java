package p067l;

import com.umeng.analytics.pro.C0655am;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: l.۟۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I67E */
/* JADX INFO: loaded from: classes3.dex */
public final class C9339 extends C12888 {
    @Override // p067l.C12888, p067l.AbstractC10205
    /* JADX INFO: renamed from: ܿ */
    public final void mo14008() {
    }

    @Override // p067l.C12888, p067l.AbstractC10205
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4018(C5636 c5636) throws IOException {
        int iMo21004 = ((InterfaceC10765) this.f36247).mo21004();
        c5636.getClass();
        c5636.write(".array-data ", 0, 12);
        c5636.m12534(((InterfaceC10765) this.f36247).mo21004());
        c5636.write(10);
        c5636.m12536();
        List<Number> listMo21003 = ((InterfaceC10765) this.f36247).mo21003();
        String str = iMo21004 != 1 ? iMo21004 != 2 ? "" : C0655am.f2274aB : C0655am.f2281aI;
        boolean z = this.f36246.f7058.f75164;
        for (Number number : listMo21003) {
            C6852.m15693(c5636, number.longValue());
            c5636.write(str, 0, str.length());
            if (z) {
                if (iMo21004 == 8) {
                    C12888.m29518(c5636, number.longValue());
                } else if (iMo21004 == 4) {
                    int iIntValue = number.intValue();
                    if (!m29521(c5636, iIntValue)) {
                        C12888.m29520(c5636, iIntValue);
                    }
                }
            }
            c5636.write("\n", 0, 1);
        }
        c5636.m12532();
        c5636.write(".end array-data", 0, 15);
        return true;
    }
}
