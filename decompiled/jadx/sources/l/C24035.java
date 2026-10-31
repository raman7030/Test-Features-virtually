package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes.dex */
public final class C24035 extends AbstractC17685 implements InterfaceC1290, InterfaceC12433 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21214 f77868;

    @Override // l.AbstractC17685, l.InterfaceC6667, l.InterfaceC14529, java.util.Iterator, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C5524.m15661(this, consumer);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Float.valueOf(nextFloat());
    }

    @Override // l.AbstractC17685
    /* JADX INFO: renamed from: ֫ */
    public final void mo20219(int i, Object obj) {
        ((InterfaceC4113) obj).mo12346(this.f77868.f68349[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24035(C21214 c21214) {
        super(c21214);
        this.f77868 = c21214;
    }

    @Override // l.InterfaceC1290
    public final float nextFloat() {
        return this.f77868.f68349[m41419()];
    }
}
