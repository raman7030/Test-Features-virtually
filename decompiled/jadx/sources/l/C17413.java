package l;

import java.util.Spliterator;

/* JADX INFO: renamed from: l.ܿܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17413 extends AbstractC0719 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5419 f53262;

    @Override // l.AbstractC0719, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C17413(C5419 c5419) {
        this.f53262 = c5419;
    }

    @Override // l.AbstractC0719, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC13419 iterator() {
        return new C19531(this.f53262);
    }

    @Override // l.AbstractC0719, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return new C0479(this.f53262);
    }

    @Override // l.InterfaceC3542
    /* JADX INFO: renamed from: ۧ */
    public final void mo10760(InterfaceC20476 interfaceC20476) {
        C5419 c5419 = this.f53262;
        int[] iArr = c5419.f16906;
        byte[] bArr = c5419.f16903;
        if (c5419.f16907) {
            interfaceC20476.mo14392(bArr[c5419.f16902]);
        }
        int i = c5419.f16902;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (iArr[i2] != 0) {
                interfaceC20476.mo14392(bArr[i2]);
            }
            i = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f53262.f16901;
    }

    @Override // l.InterfaceC8481
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo22151(byte b) {
        return this.f53262.m15509(b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f53262.clear();
    }
}
