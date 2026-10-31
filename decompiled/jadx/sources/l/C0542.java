package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H32 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0542 implements InterfaceC3407, InterfaceC12433 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC3407 f2209;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1248 f2210;

    @Override // java.util.Iterator, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C5524.m15661(this, consumer);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        add(((Float) obj).floatValue());
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        mo2279(((Float) obj).floatValue());
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final Object previous() {
        return Float.valueOf(mo2281());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return Float.valueOf(nextFloat());
    }

    @Override // l.InterfaceC20881
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void forEachRemaining(InterfaceC4113 interfaceC4113) {
        C11003.requireNonNull(interfaceC4113);
        while (hasNext()) {
            interfaceC4113.mo12346(nextFloat());
        }
    }

    public C0542(C1248 c1248, InterfaceC3407 interfaceC3407) {
        this.f2210 = c1248;
        this.f2209 = interfaceC3407;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2209.nextIndex() - this.f2210.f4443;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2209.previousIndex() - this.f2210.f4443;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f2209.nextIndex() < this.f2210.f4442;
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final boolean hasPrevious() {
        return this.f2209.previousIndex() >= this.f2210.f4443;
    }

    @Override // l.InterfaceC1290
    public final float nextFloat() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return this.f2209.nextFloat();
    }

    @Override // l.InterfaceC3407
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final float mo2281() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        return this.f2209.mo2281();
    }

    @Override // l.InterfaceC3407
    public final void add(float f) {
        this.f2209.add(f);
    }

    @Override // l.InterfaceC3407
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo2279(float f) {
        this.f2209.mo2279(f);
    }

    @Override // l.InterfaceC3407, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f2209.remove();
    }
}
