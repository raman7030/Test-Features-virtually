package l;

import com.alipay.sdk.m.u0.b;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 041R */
/* JADX INFO: loaded from: classes.dex */
public final class C22463 implements InterfaceC9330 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C20661 f72742;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C4824 f72743;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C2903 f72744;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C4824 f72745;

    @Override // l.InterfaceC9330
    /* JADX INFO: renamed from: ֫ */
    public final void mo24016(C10741 c10741) {
    }

    @Override // l.InterfaceC9330
    /* JADX INFO: renamed from: ֫ */
    public final void mo24017(C14267 c14267) {
    }

    @Override // l.InterfaceC9330
    /* JADX INFO: renamed from: ֫ */
    public final void mo24019(C17090 c17090) {
    }

    public C22463(C2903 c2903) {
        this.f72744 = c2903;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4824 m50393(C4824 c4824, C2609 c2609) {
        if (this.f72742 == null) {
            this.f72742 = C20661.m47250(this.f72744);
        }
        this.f72743 = c4824;
        this.f72745 = null;
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C16384 c16384 = (C16384) it.next();
            c16384.getClass();
            mo24018(c16384);
        }
        C4824 c4825 = this.f72745;
        return c4825 == null ? c4824 : c4825;
    }

    @Override // l.InterfaceC9330
    /* JADX INFO: renamed from: ֫ */
    public final void mo24020(C17796 c17796) {
        EnumC20347 enumC20347M46670;
        if (c17796.f26338.f13890 != this.f72742.f66533.f13890 || (enumC20347M46670 = EnumC20347.m46670((String) c17796.f54417)) == null) {
            return;
        }
        if (this.f72745 == null) {
            this.f72745 = new C4824(this.f72743);
        }
        this.f72745.f15250.add(enumC20347M46670);
        this.f72745.f15251.remove(enumC20347M46670);
    }

    @Override // l.InterfaceC9330
    /* JADX INFO: renamed from: ֫ */
    public final void mo24018(C16384 c16384) {
        if (c16384.f26338.f13890 == this.f72742.f66471.f13890) {
            for (C2609 c2609 = c16384.f50417; c2609.m8249(); c2609 = c2609.f8241) {
                C23069 c23069 = (C23069) c2609.f8240;
                if (((C3581) c23069.f74207).f17562.toString().equals(b.d)) {
                    ((AbstractC8624) c23069.f74208).mo5382(this);
                }
            }
        }
    }

    @Override // l.InterfaceC9330
    /* JADX INFO: renamed from: ֫ */
    public final void mo24015(C1568 c1568) {
        for (AbstractC8624 abstractC8624 : c1568.f5564) {
            abstractC8624.mo5382(this);
        }
    }
}
