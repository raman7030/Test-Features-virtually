package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBSC */
/* JADX INFO: loaded from: classes5.dex */
public final class C21661 implements InterfaceC5607, InterfaceC14185 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C12273 f68230;

    /* JADX INFO: renamed from: ᩸ */
    public int f68231 = -1;

    /* JADX INFO: renamed from: ᩹ */
    public int f68232;

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

    public C21661(C12273 c12273, int i) {
        this.f68230 = c12273;
        this.f68232 = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f68232 < this.f68230.f34290;
    }

    @Override // java.util.ListIterator, p067l.InterfaceC16514
    public final boolean hasPrevious() {
        return this.f68232 > 0;
    }

    @Override // p067l.InterfaceC3595
    public final float nextFloat() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        float[] fArr = this.f68230.f34289;
        int i = this.f68232;
        this.f68232 = i + 1;
        this.f68231 = i;
        return fArr[i];
    }

    @Override // p067l.InterfaceC5607
    /* JADX INFO: renamed from: ᩹ */
    public final float mo4648() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        float[] fArr = this.f68230.f34289;
        int i = this.f68232 - 1;
        this.f68232 = i;
        this.f68231 = i;
        return fArr[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f68232;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f68232 - 1;
    }

    @Override // p067l.InterfaceC5607
    public final void add(float f) {
        int i = this.f68232;
        this.f68232 = i + 1;
        this.f68230.mo6348(f, i);
        this.f68231 = -1;
    }

    @Override // p067l.InterfaceC5607
    /* JADX INFO: renamed from: ܽ */
    public final void mo4646(float f) {
        int i = this.f68231;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f68230.mo6343(f, i);
    }

    @Override // p067l.InterfaceC5607, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f68231;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f68230.mo6349(i);
        int i2 = this.f68231;
        int i3 = this.f68232;
        if (i2 < i3) {
            this.f68232 = i3 - 1;
        }
        this.f68231 = -1;
    }

    @Override // p067l.InterfaceC22214
    /* JADX INFO: renamed from: ܽ */
    public final void forEachRemaining(InterfaceC6278 interfaceC6278) {
        C12273 c12273 = this.f68230;
        float[] fArr = c12273.f34289;
        while (true) {
            int i = this.f68232;
            if (i >= c12273.f34290) {
                return;
            }
            this.f68232 = i + 1;
            this.f68231 = i;
            interfaceC6278.mo14251(fArr[i]);
        }
    }
}
