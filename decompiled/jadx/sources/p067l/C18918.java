package p067l;

import java.util.Spliterator;

/* JADX INFO: renamed from: l.ܿܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18918 extends AbstractC3052 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C7519 f56449;

    @Override // p067l.AbstractC3052, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C18918(C7519 c7519) {
        this.f56449 = c7519;
    }

    @Override // p067l.AbstractC3052, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC15122 iterator() {
        return new C20931(this.f56449);
    }

    @Override // p067l.AbstractC3052, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return new C2824(this.f56449);
    }

    @Override // p067l.InterfaceC5735
    /* JADX INFO: renamed from: ۧ */
    public final void mo12741(InterfaceC21829 interfaceC21829) {
        C7519 c7519 = this.f56449;
        int[] iArr = c7519.f19744;
        byte[] bArr = c7519.f19741;
        if (c7519.f19745) {
            interfaceC21829.mo16295(bArr[c7519.f19740]);
        }
        int i = c7519.f19740;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (iArr[i2] != 0) {
                interfaceC21829.mo16295(bArr[i2]);
            }
            i = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f56449.f19739;
    }

    @Override // p067l.InterfaceC10429
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo24120(byte b) {
        return this.f56449.m17420(b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f56449.clear();
    }
}
