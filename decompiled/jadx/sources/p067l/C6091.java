package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۘۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7CX */
/* JADX INFO: loaded from: classes3.dex */
public final class C6091 extends AbstractC21279 {

    /* JADX INFO: renamed from: ۜ */
    public C17489 f15307;

    public C6091() {
        throw null;
    }

    public C6091(AbstractC23290 abstractC23290) {
        super(abstractC23290);
    }

    @Override // p067l.AbstractC21279
    /* JADX INFO: renamed from: ֫ */
    public final void mo13867(InterfaceC24904 interfaceC24904) throws IOException {
        try {
            super.mo13867(interfaceC24904);
            this.f15307 = new C17489(this, m48072());
        } catch (IOException e) {
            mo13866("Cannot read {0}", interfaceC24904);
            throw e;
        }
    }

    @Override // p067l.AbstractC21279
    /* JADX INFO: renamed from: ۧ */
    public final void mo13869(long j, String str, Object... objArr) {
        ((C7196) m48082()).m16535(j, str, objArr);
    }

    @Override // p067l.AbstractC21279, p067l.InterfaceC5185
    /* JADX INFO: renamed from: ֫ */
    public final void mo11117(long j, String str, Object... objArr) {
        ((C7196) m48082()).mo11117(j, str, objArr);
    }

    @Override // p067l.AbstractC21279
    /* JADX INFO: renamed from: ܿ */
    public final void mo4612(String str, Object... objArr) {
        ((C7196) m48082()).m16535(2147483647L, str, objArr);
    }

    @Override // p067l.AbstractC21279
    /* JADX INFO: renamed from: ֫ */
    public final void mo13866(String str, Object... objArr) {
        ((C7196) m48082()).mo11117(2147483647L, str, objArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m13865(long j) {
        ((C7196) m48082()).getClass();
        return j >> 32;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m13870(String str, Object... objArr) {
        mo13866(str, objArr);
        throw new Error();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m13871(long j, String str, Object... objArr) {
        mo11117(j, str, objArr);
        throw new Error();
    }

    /* JADX INFO: renamed from: ۘ */
    public final long m13868() {
        C17489 c17489 = this.f15307;
        if (c17489 == null) {
            return 0L;
        }
        return c17489.f47648;
    }
}
