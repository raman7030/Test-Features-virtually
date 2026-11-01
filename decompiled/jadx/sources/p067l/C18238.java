package p067l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ܽܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C18238 extends AbstractC12875 implements InterfaceC4317 {

    /* JADX INFO: renamed from: ۗ */
    public final AbstractC12875 f54445;

    /* JADX INFO: renamed from: ۙ */
    public final boolean f54446;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C23603 f54447;

    /* JADX INFO: renamed from: ۬ */
    public Collection f54448;

    /* JADX INFO: renamed from: ᩶ */
    public final String f54449;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f54450;

    /* JADX INFO: renamed from: ᩹ */
    public final String f54451;

    @Override // p067l.InterfaceC4317
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo8852() {
        return getName().matches("\\bMODULE\\b");
    }

    public C18238(C23603 c23603, AbstractC12875 abstractC12875, String str, String str2, Collection collection, boolean z) {
        this.f54447 = c23603;
        this.f54445 = abstractC12875;
        this.f54449 = str;
        this.f54451 = str2;
        this.f54448 = collection;
        this.f54446 = z;
    }

    @Override // p067l.InterfaceC4317
    public final String getName() {
        return this.f54449;
    }

    @Override // p067l.InterfaceC4317
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8853() {
        return this.f54446;
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22380(EnumC2483 enumC2483, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ܽ */
    public final Collection mo8427() {
        return C21562.unmodifiableCollection(this.f54448);
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final void mo22379(Iterable iterable) {
        this.f54445.mo25023(iterable, this.f54451);
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final void mo25023(Iterable iterable, String str) {
        throw new UnsupportedOperationException("not supported for " + this.f54449);
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ᩳ */
    public final String mo29501() {
        return this.f54451;
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22381(InterfaceC22097 interfaceC22097) {
        return C23603.m52418(this.f54447, this.f54448, interfaceC22097);
    }

    public final String toString() {
        return this.f54449;
    }
}
