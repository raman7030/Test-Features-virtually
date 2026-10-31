package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۘۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7CX */
/* JADX INFO: loaded from: classes3.dex */
public final class C3917 extends AbstractC19898 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C15910 f12499;

    public C3917() {
        throw null;
    }

    public C3917(AbstractC22014 abstractC22014) {
        super(abstractC22014);
    }

    @Override // l.AbstractC19898
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo11947(InterfaceC23712 interfaceC23712) throws IOException {
        try {
            super.mo11947(interfaceC23712);
            this.f12499 = new C15910(this, m45760());
        } catch (IOException e) {
            mo11946("Cannot read {0}", interfaceC23712);
            throw e;
        }
    }

    @Override // l.AbstractC19898
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo11949(long j, String str, Object... objArr) {
        ((C5080) m45770()).m14627(j, str, objArr);
    }

    @Override // l.AbstractC19898, l.InterfaceC2964
    /* JADX INFO: renamed from: ֫ */
    public final void mo9065(long j, String str, Object... objArr) {
        ((C5080) m45770()).mo9065(j, str, objArr);
    }

    @Override // l.AbstractC19898
    /* JADX INFO: renamed from: ܿ */
    public final void mo2245(String str, Object... objArr) {
        ((C5080) m45770()).m14627(2147483647L, str, objArr);
    }

    @Override // l.AbstractC19898
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo11946(String str, Object... objArr) {
        ((C5080) m45770()).mo9065(2147483647L, str, objArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m11945(long j) {
        ((C5080) m45770()).getClass();
        return j >> 32;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m11950(String str, Object... objArr) {
        mo11946(str, objArr);
        throw new Error();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m11951(long j, String str, Object... objArr) {
        mo9065(j, str, objArr);
        throw new Error();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long m11948() {
        C15910 c15910 = this.f12499;
        if (c15910 == null) {
            return 0L;
        }
        return c15910.f44542;
    }
}
