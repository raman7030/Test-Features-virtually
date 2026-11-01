package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes.dex */
public final class C24601 extends AbstractC17224 implements InterfaceC17480, InterfaceC14185 {

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C20579 f77897;

    @Override // p067l.AbstractC17224, java.util.Iterator, p067l.InterfaceC14185
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C10776.m24825(this, consumer);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Character.valueOf(mo9752());
    }

    @Override // p067l.AbstractC17224
    /* JADX INFO: renamed from: ֫ */
    public final void mo13104(int i, Object obj) {
        ((InterfaceC24857) obj).mo20276(this.f77897.f63607[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24601(C20579 c20579) {
        super(c20579);
        this.f77897 = c20579;
    }

    @Override // p067l.InterfaceC17480
    /* JADX INFO: renamed from: ֡ۧ */
    public final char mo9752() {
        return this.f77897.f63607[m38995()];
    }
}
