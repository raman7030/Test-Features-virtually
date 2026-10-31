package l;

import java.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֫᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes3.dex */
public final class C2163 extends AbstractC6208 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21214 f7152;

    @Override // l.AbstractC6208, l.AbstractC21731, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C2163(C21214 c21214) {
        this.f7152 = c21214;
    }

    @Override // l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC6667 iterator() {
        return new C7535(this.f7152);
    }

    @Override // l.AbstractC6208, l.AbstractC21731, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16749 spliterator() {
        return new C11336(this.f7152);
    }

    @Override // l.AbstractC21731, l.InterfaceC14427
    public final void forEach(IntConsumer intConsumer) {
        C21214 c21214 = this.f7152;
        int[] iArr = c21214.f68352;
        if (c21214.f68353) {
            intConsumer.accept(iArr[c21214.f68348]);
        }
        int i = c21214.f68348;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int i3 = iArr[i2];
            if (i3 != 0) {
                intConsumer.accept(i3);
            }
            i = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7152.f68347;
    }

    @Override // l.InterfaceC1043
    public final boolean contains(int i) {
        return this.f7152.mo21825(i);
    }

    @Override // l.AbstractC6208
    public final boolean remove(int i) {
        C21214 c21214 = this.f7152;
        int i2 = c21214.f68347;
        c21214.remove(i);
        return c21214.f68347 != i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f7152.clear();
    }
}
