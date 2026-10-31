package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBSC */
/* JADX INFO: loaded from: classes5.dex */
public final class C20299 implements InterfaceC3407, InterfaceC12433 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10421 f65555;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f65556 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f65557;

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

    public C20299(C10421 c10421, int i) {
        this.f65555 = c10421;
        this.f65557 = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f65557 < this.f65555.f31325;
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final boolean hasPrevious() {
        return this.f65557 > 0;
    }

    @Override // l.InterfaceC1290
    public final float nextFloat() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        float[] fArr = this.f65555.f31324;
        int i = this.f65557;
        this.f65557 = i + 1;
        this.f65556 = i;
        return fArr[i];
    }

    @Override // l.InterfaceC3407
    /* JADX INFO: renamed from: ᩹ */
    public final float mo2281() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        float[] fArr = this.f65555.f31324;
        int i = this.f65557 - 1;
        this.f65557 = i;
        this.f65556 = i;
        return fArr[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f65557;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f65557 - 1;
    }

    @Override // l.InterfaceC3407
    public final void add(float f) {
        int i = this.f65557;
        this.f65557 = i + 1;
        this.f65555.mo4104(f, i);
        this.f65556 = -1;
    }

    @Override // l.InterfaceC3407
    /* JADX INFO: renamed from: ܽ */
    public final void mo2279(float f) {
        int i = this.f65556;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f65555.mo4099(f, i);
    }

    @Override // l.InterfaceC3407, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f65556;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f65555.mo4105(i);
        int i2 = this.f65556;
        int i3 = this.f65557;
        if (i2 < i3) {
            this.f65557 = i3 - 1;
        }
        this.f65556 = -1;
    }

    @Override // l.InterfaceC20881
    /* JADX INFO: renamed from: ܽ */
    public final void forEachRemaining(InterfaceC4113 interfaceC4113) {
        C10421 c10421 = this.f65555;
        float[] fArr = c10421.f31324;
        while (true) {
            int i = this.f65557;
            if (i >= c10421.f31325) {
                return;
            }
            this.f65557 = i + 1;
            this.f65556 = i;
            interfaceC4113.mo12346(fArr[i]);
        }
    }
}
