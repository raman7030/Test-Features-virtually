package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܳ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes4.dex */
public final class C15883 extends AbstractC17224 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۫ */
    public final C11191 f45982;

    public C15883(C20579 c20579) {
        super(c20579);
        this.f45982 = new C11191(c20579);
    }

    @Override // p067l.AbstractC17224
    /* JADX INFO: renamed from: ֫ */
    public final void mo13104(int i, Object obj) {
        C11191 c11191 = this.f45982;
        c11191.f31071 = i;
        ((Consumer) obj).accept(c11191);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iM38995 = m38995();
        C11191 c11191 = this.f45982;
        c11191.f31071 = iM38995;
        return c11191;
    }
}
