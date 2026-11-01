package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܽۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25I */
/* JADX INFO: loaded from: classes5.dex */
public class C18112 implements InterfaceC16750, InterfaceC14185 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C16100 f54102;

    /* JADX INFO: renamed from: ۙ */
    public C12749 f54103;

    /* JADX INFO: renamed from: ᩶ */
    public C12749 f54104;

    /* JADX INFO: renamed from: ᩸ */
    public C12749 f54105;

    /* JADX INFO: renamed from: ᩹ */
    public int f54106 = 0;

    @Override // p067l.InterfaceC16750
    public final /* synthetic */ void add(int i) {
        C10046.m23408();
        throw null;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo7884((Integer) obj);
    }

    @Override // p067l.InterfaceC22214
    public /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((IntConsumer) obj);
    }

    @Override // java.util.Iterator, p067l.InterfaceC8705, p067l.InterfaceC16177, p067l.InterfaceC14185
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C24798.m54480(this, consumer);
    }

    @Override // p067l.InterfaceC16177
    public /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C18860.$default$forEachRemaining((InterfaceC16177) this, intConsumer);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo7886((Integer) obj);
    }

    @Override // p067l.InterfaceC16750
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo7883(int i) {
        C10046.m23411();
        throw null;
    }

    @Override // p067l.InterfaceC16750
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo7884(Integer num) {
        C10046.m23409((InterfaceC16750) this, num);
    }

    @Override // p067l.InterfaceC16750
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo7886(Integer num) {
        C10046.m23412((InterfaceC16750) this, num);
    }

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final Object previous() {
        return Integer.valueOf(mo7885());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Integer next() {
        return C24798.m54479(this);
    }

    public C18112(C16100 c16100) {
        this.f54102 = c16100;
        this.f54104 = c16100.f47383;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f54104 != null;
    }

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final boolean hasPrevious() {
        return this.f54103 != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo41297() {
        this.f54104 = this.f54104.m29281();
    }

    @Override // p067l.InterfaceC16177
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C12749 c12749 = this.f54104;
        this.f54103 = c12749;
        this.f54105 = c12749;
        this.f54106++;
        mo41297();
        return this.f54105.f35807;
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo41298() {
        this.f54103 = this.f54103.m29283();
    }

    @Override // p067l.InterfaceC16750
    /* JADX INFO: renamed from: ۖ֫ */
    public final int mo7885() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C12749 c12749 = this.f54103;
        this.f54104 = c12749;
        this.f54105 = c12749;
        this.f54106--;
        mo41298();
        return this.f54105.f35807;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f54106;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f54106 - 1;
    }

    @Override // p067l.InterfaceC16750, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        C12749 c12749 = this.f54105;
        if (c12749 == null) {
            throw new IllegalStateException();
        }
        if (c12749 == this.f54103) {
            this.f54106--;
        }
        this.f54103 = c12749;
        this.f54104 = c12749;
        mo41298();
        mo41297();
        this.f54102.remove(this.f54105.f35807);
        this.f54105 = null;
    }
}
