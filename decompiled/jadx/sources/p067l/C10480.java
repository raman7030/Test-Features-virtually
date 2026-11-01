package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۡ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1NC */
/* JADX INFO: loaded from: classes4.dex */
public final class C10480 implements InterfaceC12631, InterfaceC14185 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C20539 f28982;

    /* JADX INFO: renamed from: ᩸ */
    public int f28983 = -1;

    /* JADX INFO: renamed from: ᩹ */
    public int f28984;

    public C10480(C20539 c20539, int i) {
        this.f28982 = c20539;
        this.f28984 = i;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f28984 < this.f28982.f63464;
    }

    @Override // p067l.InterfaceC16514
    public final boolean hasPrevious() {
        return this.f28984 > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f28982.f63463;
        int i = this.f28984;
        this.f28984 = i + 1;
        this.f28983 = i;
        return objArr[i];
    }

    @Override // p067l.InterfaceC16514
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f28982.f63463;
        int i = this.f28984 - 1;
        this.f28984 = i;
        this.f28983 = i;
        return objArr[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f28984;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f28984 - 1;
    }

    @Override // p067l.InterfaceC12631, java.util.ListIterator
    public final void add(Object obj) {
        int i = this.f28984;
        this.f28984 = i + 1;
        this.f28982.add(i, obj);
        this.f28983 = -1;
    }

    @Override // p067l.InterfaceC12631, java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f28983;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f28982.set(i, obj);
    }

    @Override // p067l.InterfaceC12631, java.util.Iterator, java.util.ListIterator
    public final void remove() {
        int i = this.f28983;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f28982.remove(i);
        int i2 = this.f28983;
        int i3 = this.f28984;
        if (i2 < i3) {
            this.f28984 = i3 - 1;
        }
        this.f28983 = -1;
    }

    @Override // java.util.Iterator, p067l.InterfaceC14185
    public final void forEachRemaining(Consumer consumer) {
        C20539 c20539 = this.f28982;
        Object[] objArr = c20539.f63463;
        while (true) {
            int i = this.f28984;
            if (i >= c20539.f63464) {
                return;
            }
            this.f28984 = i + 1;
            this.f28983 = i;
            consumer.accept(objArr[i]);
        }
    }
}
