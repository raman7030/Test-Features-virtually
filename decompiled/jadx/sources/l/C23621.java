package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩻ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1QM */
/* JADX INFO: loaded from: classes2.dex */
public final class C23621 implements InterfaceC15132, InterfaceC12433 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15859 f76543;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f76544 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f76545;

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        mo5654((Integer) obj);
    }

    @Override // java.util.Iterator, l.InterfaceC6667, l.InterfaceC14529, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C23600.m52077(this, consumer);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        mo5656((Integer) obj);
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo5654(Integer num) {
        C8078.m21441((InterfaceC15132) this, num);
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo5656(Integer num) {
        C8078.m21444((InterfaceC15132) this, num);
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final Object previous() {
        return Integer.valueOf(mo5655());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Integer next() {
        return C23600.m52076(this);
    }

    public C23621(int i, C15859 c15859) {
        this.f76543 = c15859;
        this.f76545 = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f76545 < this.f76543.f49021;
    }

    @Override // java.util.ListIterator, l.InterfaceC14884
    public final boolean hasPrevious() {
        return this.f76545 > 0;
    }

    @Override // l.InterfaceC14529
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f76543.f49020;
        int i = this.f76545;
        this.f76545 = i + 1;
        this.f76544 = i;
        return iArr[i];
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ۖ֫ */
    public final int mo5655() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f76543.f49020;
        int i = this.f76545 - 1;
        this.f76545 = i;
        this.f76544 = i;
        return iArr[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f76545;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f76545 - 1;
    }

    @Override // l.InterfaceC15132
    public final void add(int i) {
        int i2 = this.f76545;
        this.f76545 = i2 + 1;
        this.f76543.add(i2, i);
        this.f76544 = -1;
    }

    @Override // l.InterfaceC15132
    /* JADX INFO: renamed from: ֫ */
    public final void mo5653(int i) {
        int i2 = this.f76544;
        if (i2 == -1) {
            throw new IllegalStateException();
        }
        this.f76543.set(i2, i);
    }

    @Override // l.InterfaceC15132, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f76544;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f76543.mo3542(i);
        int i2 = this.f76544;
        int i3 = this.f76545;
        if (i2 < i3) {
            this.f76545 = i3 - 1;
        }
        this.f76544 = -1;
    }

    @Override // l.InterfaceC20881
    public final void forEachRemaining(IntConsumer intConsumer) {
        C15859 c15859 = this.f76543;
        int[] iArr = c15859.f49020;
        while (true) {
            int i = this.f76545;
            if (i >= c15859.f49021) {
                return;
            }
            this.f76545 = i + 1;
            this.f76544 = i;
            intConsumer.accept(iArr[i]);
        }
    }
}
