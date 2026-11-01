package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۧ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B749 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13074 implements InterfaceC23116 {

    /* JADX INFO: renamed from: ۙ */
    public int f36757;

    /* JADX INFO: renamed from: ᩶ */
    public C19779 f36758;

    /* JADX INFO: renamed from: ᩸ */
    public final HashMap f36759 = new HashMap();

    /* JADX INFO: renamed from: ᩹ */
    public boolean f36760;

    @Override // p067l.InterfaceC23116
    /* JADX INFO: renamed from: ֫ */
    public final void mo5733(InterfaceC11402 interfaceC11402) {
    }

    @Override // p067l.InterfaceC23116
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20790 mo5732(int i, int i2) {
        InterfaceC20790 c21105;
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f36759;
        InterfaceC20790 interfaceC20790 = (InterfaceC20790) map.get(numValueOf);
        if (interfaceC20790 != null) {
            return interfaceC20790;
        }
        if (i2 == 2) {
            C19779 c19779 = new C19779();
            this.f36757++;
            this.f36758 = c19779;
            c21105 = c19779;
        } else {
            c21105 = new C21105();
        }
        map.put(Integer.valueOf(i), c21105);
        return c21105;
    }

    @Override // p067l.InterfaceC23116
    /* JADX INFO: renamed from: ܳ */
    public final void mo5734() {
        this.f36760 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m29936() {
        C19779 c19779;
        return this.f36760 && this.f36757 == 1 && (c19779 = this.f36758) != null && c19779.f60178 && this.f36758.f60179 != -9223372036854775807L && this.f36758.f60177;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m29937() {
        C19779 c19779 = this.f36758;
        if (c19779 == null) {
            return -9223372036854775807L;
        }
        return c19779.f60179;
    }
}
