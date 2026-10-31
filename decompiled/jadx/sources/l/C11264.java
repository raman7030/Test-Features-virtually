package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۧ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B749 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11264 implements InterfaceC21830 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f33757;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C18319 f33758;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f33759 = new HashMap();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f33760;

    @Override // l.InterfaceC21830
    /* JADX INFO: renamed from: ֫ */
    public final void mo3430(InterfaceC9505 interfaceC9505) {
    }

    @Override // l.InterfaceC21830
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19383 mo3429(int i, int i2) {
        InterfaceC19383 c19714;
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f33759;
        InterfaceC19383 interfaceC19383 = (InterfaceC19383) map.get(numValueOf);
        if (interfaceC19383 != null) {
            return interfaceC19383;
        }
        if (i2 == 2) {
            C18319 c18319 = new C18319();
            this.f33757++;
            this.f33758 = c18319;
            c19714 = c18319;
        } else {
            c19714 = new C19714();
        }
        map.put(Integer.valueOf(i), c19714);
        return c19714;
    }

    @Override // l.InterfaceC21830
    /* JADX INFO: renamed from: ܳ */
    public final void mo3431() {
        this.f33760 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m27875() {
        C18319 c18319;
        return this.f33760 && this.f33757 == 1 && (c18319 = this.f33758) != null && c18319.f56960 && this.f33758.f56961 != -9223372036854775807L && this.f33758.f56959;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m27876() {
        C18319 c18319 = this.f33758;
        if (c18319 == null) {
            return -9223372036854775807L;
        }
        return c18319.f56961;
    }
}
