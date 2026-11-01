package p067l;

import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۛܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes3.dex */
public final class C8189 extends AbstractC6238 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C22531 f21617;

    @Override // p067l.AbstractC6238, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C8189(C22531 c22531) {
        this.f21617 = c22531;
    }

    @Override // p067l.AbstractC6238, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final InterfaceC3595 iterator() {
        return new C25212(this.f21617);
    }

    @Override // p067l.AbstractC6238, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18327 spliterator() {
        return new C9119(this.f21617);
    }

    @Override // p067l.AbstractC6238, p067l.InterfaceC2924
    /* JADX INFO: renamed from: ۧ */
    public final void mo4794(InterfaceC6278 interfaceC6278) {
        C22531 c22531 = this.f21617;
        int[] iArr = c22531.f71035;
        float[] fArr = c22531.f71032;
        if (c22531.f71036) {
            interfaceC6278.mo14251(fArr[c22531.f71031]);
        }
        int i = c22531.f71031;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (iArr[i2] != 0) {
                interfaceC6278.mo14251(fArr[i2]);
            }
            i = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f21617.f71030;
    }

    @Override // p067l.InterfaceC12984
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo18969(float f) {
        return this.f21617.m50490(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f21617.clear();
    }
}
