package l;

/* JADX INFO: renamed from: l.ܺᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: LBEV */
/* JADX INFO: loaded from: classes5.dex */
public class C16123 extends C17535 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C21064 f49668;

    public C16123(int i) {
        super(i);
        this.f49668 = new C21064(i);
    }

    public C16123(C17246 c17246) {
        super(c17246.size());
        this.f49668 = c17246.f49668.m47913();
        int size = c17246.size();
        for (int i = 0; i < size; i++) {
            m40981(i, c17246.m40978(i));
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m38023() {
        C21064 c21064 = this.f49668;
        int size = c21064.size();
        do {
            size--;
            if (size < 0) {
                break;
            }
        } while (c21064.get(size) < 0);
        int i = size + 1;
        c21064.m47918(i);
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m38024(int i, C0538 c0538) {
        m38025(i, (InterfaceC9069) c0538);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m38027(int i) {
        C21064 c21064 = this.f49668;
        if (i >= c21064.size()) {
            return -1;
        }
        return c21064.get(i);
    }

    @Override // l.C17535
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo38026() {
        super.mo38026();
        int size = size();
        for (int i = 0; i < size; i++) {
            this.f49668.set(((InterfaceC9069) m40978(i)).mo2269(), i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38025(int i, InterfaceC9069 interfaceC9069) {
        InterfaceC9069 interfaceC90610 = (InterfaceC9069) m40990(i);
        m40981(i, (Object) interfaceC9069);
        C21064 c21064 = this.f49668;
        if (interfaceC90610 != null) {
            c21064.set(interfaceC90610.mo2269(), -1);
        }
        if (interfaceC9069 != null) {
            int iMo2269 = interfaceC9069.mo2269();
            int size = c21064.size();
            for (int i2 = 0; i2 <= iMo2269 - size; i2++) {
                c21064.add(-1);
            }
            c21064.set(iMo2269, i);
        }
    }
}
