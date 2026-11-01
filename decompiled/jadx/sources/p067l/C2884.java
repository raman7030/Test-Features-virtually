package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H32 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2884 implements InterfaceC5607, InterfaceC14185 {

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC5607 f4982;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C3555 f4983;

    @Override // java.util.Iterator, p067l.InterfaceC14185
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C7619.m17576(this, consumer);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        add(((Float) obj).floatValue());
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        mo4646(((Float) obj).floatValue());
    }

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final Object previous() {
        return Float.valueOf(mo4648());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return Float.valueOf(nextFloat());
    }

    @Override // p067l.InterfaceC22214
    /* JADX INFO: renamed from: ܽ */
    public final void forEachRemaining(InterfaceC6278 interfaceC6278) {
        C12826.requireNonNull(interfaceC6278);
        while (hasNext()) {
            interfaceC6278.mo14251(nextFloat());
        }
    }

    public C2884(C3555 c3555, InterfaceC5607 interfaceC5607) {
        this.f4983 = c3555;
        this.f4982 = interfaceC5607;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4982.nextIndex() - this.f4983.f7212;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4982.previousIndex() - this.f4983.f7212;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f4982.nextIndex() < this.f4983.f7211;
    }

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final boolean hasPrevious() {
        return this.f4982.previousIndex() >= this.f4983.f7212;
    }

    @Override // p067l.InterfaceC3595
    public final float nextFloat() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return this.f4982.nextFloat();
    }

    @Override // p067l.InterfaceC5607
    /* JADX INFO: renamed from: ᩹ */
    public final float mo4648() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        return this.f4982.mo4648();
    }

    @Override // p067l.InterfaceC5607
    public final void add(float f) {
        this.f4982.add(f);
    }

    @Override // p067l.InterfaceC5607
    /* JADX INFO: renamed from: ܽ */
    public final void mo4646(float f) {
        this.f4982.mo4646(f);
    }

    @Override // p067l.InterfaceC5607, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f4982.remove();
    }
}
