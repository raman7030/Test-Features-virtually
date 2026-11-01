package p067l;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.֡ܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJL */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2833 {

    /* JADX INFO: renamed from: ֫ */
    public String f4874;

    /* JADX INFO: renamed from: ۜ */
    public C3783 f4875;

    /* JADX INFO: renamed from: ۡ */
    public C20548 f4876;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC4454 f4878;

    /* JADX INFO: renamed from: ܳ */
    public C19325 f4879;

    /* JADX INFO: renamed from: ܺ */
    public boolean f4880;

    /* JADX INFO: renamed from: ܽ */
    public C3092 f4881;

    /* JADX INFO: renamed from: ܿ */
    public C12501 f4882;

    /* JADX INFO: renamed from: ᩷ */
    public ArrayList f4884;

    /* JADX INFO: renamed from: ᩻ */
    public HashMap f4885;

    /* JADX INFO: renamed from: ۢ */
    public C11160 f4877 = new C11160();

    /* JADX INFO: renamed from: ᩳ */
    public C21889 f4883 = new C21889();

    /* JADX INFO: renamed from: ֫ */
    public abstract List mo4518(String str, C21199 c21199, String str2, C12501 c12501);

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo4525(AbstractC4454 abstractC4454);

    /* JADX INFO: renamed from: ۧ */
    public abstract C3783 mo4527();

    /* JADX INFO: renamed from: ۧ */
    public boolean mo4528(String str) {
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo4521(StringReader stringReader, String str, C12501 c12501) {
        if (str == null) {
            throw new C15832("The parameter 'baseUri' must not be null.");
        }
        C3092 c3092 = new C3092(str);
        this.f4881 = c3092;
        c3092.m5238(c12501);
        this.f4882 = c12501;
        this.f4875 = c12501.m28802();
        this.f4879 = new C19325(stringReader, 32768);
        this.f4880 = c12501.m28801();
        C19325 c19325 = this.f4879;
        c12501.m28800();
        c19325.m44040(this.f4880);
        this.f4878 = null;
        this.f4876 = new C20548(this.f4879, c12501.m28798());
        this.f4884 = new ArrayList(32);
        this.f4885 = new HashMap();
        this.f4874 = str;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m4529() {
        AbstractC4454 abstractC4454M46463;
        C20548 c20548 = this.f4876;
        EnumC17193 enumC17193 = EnumC17193.EOF;
        do {
            abstractC4454M46463 = c20548.m46463();
            mo4525(abstractC4454M46463);
            abstractC4454M46463.mo9338();
        } while (abstractC4454M46463.f9999 != enumC17193);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m4531(String str) {
        AbstractC4454 abstractC4454 = this.f4878;
        C11160 c11160 = this.f4877;
        if (abstractC4454 == c11160) {
            C11160 c11161 = new C11160();
            c11161.m24225(str);
            mo4525(c11161);
        } else {
            c11160.mo9338();
            c11160.m24225(str);
            mo4525(c11160);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m4526(C17173 c17173) {
        AbstractC4454 abstractC4454 = this.f4878;
        C11160 c11160 = this.f4877;
        if (abstractC4454 == c11160) {
            C11160 c11161 = new C11160();
            c11161.f29032 = "input";
            c11161.f29033 = c17173;
            c11161.f29037 = C24550.m54147("input");
            return mo4525(c11161);
        }
        c11160.mo9338();
        c11160.f29032 = "input";
        c11160.f29033 = c17173;
        c11160.f29037 = C24550.m54147("input");
        return mo4525(c11160);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m4530(String str) {
        AbstractC4454 abstractC4454 = this.f4878;
        C21889 c21889 = this.f4883;
        if (abstractC4454 == c21889) {
            C21889 c218810 = new C21889();
            c218810.m24225(str);
            return mo4525(c218810);
        }
        c21889.mo9338();
        c21889.m24225(str);
        return mo4525(c21889);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C21199 m4520() {
        int size = this.f4884.size();
        return size > 0 ? (C21199) this.f4884.get(size - 1) : this.f4881;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m4524(String str) {
        C21199 c21199M4520;
        return (this.f4884.size() == 0 || (c21199M4520 = m4520()) == null || !c21199M4520.m47899().equals(str)) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17864 m4519(String str, C3783 c3783) {
        C17864 c17864 = (C17864) this.f4885.get(str);
        if (c17864 != null) {
            return c17864;
        }
        C17864 c17864M40572 = C17864.m40572(str, c3783);
        this.f4885.put(str, c17864M40572);
        return c17864M40572;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4522(AbstractC13152 abstractC13152, AbstractC4454 abstractC4454) {
        m4517(abstractC13152, abstractC4454, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4523(C21199 c21199, AbstractC4454 abstractC4454) {
        m4517((AbstractC13152) c21199, abstractC4454, false);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m4517(AbstractC13152 abstractC13152, AbstractC4454 abstractC4454, boolean z) {
        int iM9331;
        if (!this.f4880 || abstractC4454 == null || (iM9331 = abstractC4454.m9331()) == -1) {
            return;
        }
        C9128 c9128 = new C9128(iM9331, this.f4879.m44037(iM9331), this.f4879.m44024(iM9331));
        int iM9329 = abstractC4454.m9329();
        new C3902(c9128, new C9128(iM9329, this.f4879.m44037(iM9329), this.f4879.m44024(iM9329))).m7708(abstractC13152, z);
    }
}
