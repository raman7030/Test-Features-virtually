package l;

import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۛܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes3.dex */
public final class C6124 extends AbstractC4071 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21214 f18762;

    @Override // l.AbstractC4071, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C6124(C21214 c21214) {
        this.f18762 = c21214;
    }

    @Override // l.AbstractC4071, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final InterfaceC1290 iterator() {
        return new C24035(this.f18762);
    }

    @Override // l.AbstractC4071, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16791 spliterator() {
        return new C7102(this.f18762);
    }

    @Override // l.AbstractC4071, l.InterfaceC0584
    /* JADX INFO: renamed from: ۧ */
    public final void mo2423(InterfaceC4113 interfaceC4113) {
        C21214 c21214 = this.f18762;
        int[] iArr = c21214.f68352;
        float[] fArr = c21214.f68349;
        if (c21214.f68353) {
            interfaceC4113.mo12346(fArr[c21214.f68348]);
        }
        int i = c21214.f68348;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (iArr[i2] != 0) {
                interfaceC4113.mo12346(fArr[i2]);
            }
            i = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f18762.f68347;
    }

    @Override // l.InterfaceC11169
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean mo17038(float f) {
        return this.f18762.m48159(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f18762.clear();
    }
}
