package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۡ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1NC */
/* JADX INFO: loaded from: classes4.dex */
public final class C8535 implements InterfaceC10798, InterfaceC12433 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19119 f26067;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f26068 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f26069;

    public C8535(C19119 c19119, int i) {
        this.f26067 = c19119;
        this.f26069 = i;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f26069 < this.f26067.f60232;
    }

    @Override // l.InterfaceC14884
    public final boolean hasPrevious() {
        return this.f26069 > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f26067.f60231;
        int i = this.f26069;
        this.f26069 = i + 1;
        this.f26068 = i;
        return objArr[i];
    }

    @Override // l.InterfaceC14884
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f26067.f60231;
        int i = this.f26069 - 1;
        this.f26069 = i;
        this.f26068 = i;
        return objArr[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f26069;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f26069 - 1;
    }

    @Override // l.InterfaceC10798, java.util.ListIterator
    public final void add(Object obj) {
        int i = this.f26069;
        this.f26069 = i + 1;
        this.f26067.add(i, obj);
        this.f26068 = -1;
    }

    @Override // l.InterfaceC10798, java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f26068;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f26067.set(i, obj);
    }

    @Override // l.InterfaceC10798, java.util.Iterator, java.util.ListIterator
    public final void remove() {
        int i = this.f26068;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f26067.remove(i);
        int i2 = this.f26068;
        int i3 = this.f26069;
        if (i2 < i3) {
            this.f26069 = i3 - 1;
        }
        this.f26068 = -1;
    }

    @Override // java.util.Iterator, l.InterfaceC12433
    public final void forEachRemaining(Consumer consumer) {
        C19119 c19119 = this.f26067;
        Object[] objArr = c19119.f60231;
        while (true) {
            int i = this.f26069;
            if (i >= c19119.f60232) {
                return;
            }
            this.f26069 = i + 1;
            this.f26068 = i;
            consumer.accept(objArr[i]);
        }
    }
}
