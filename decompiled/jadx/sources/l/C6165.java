package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۛܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X1VL */
/* JADX INFO: loaded from: classes3.dex */
public final class C6165 implements InterfaceC6667, InterfaceC12433 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f18957;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23098 f18958;

    @Override // l.InterfaceC20881
    public /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((IntConsumer) obj);
    }

    @Override // l.InterfaceC6667, l.InterfaceC14529, java.util.Iterator, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C23600.m52077(this, consumer);
    }

    @Override // l.InterfaceC14529
    public /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C17352.$default$forEachRemaining((InterfaceC14529) this, intConsumer);
    }

    public C6165(C23098 c23098) {
        this.f18958 = c23098;
    }

    @Override // l.InterfaceC14529
    public final int nextInt() {
        int i = this.f18957;
        C23098 c23098 = this.f18958;
        if (i >= c23098.f74325) {
            throw new IndexOutOfBoundsException();
        }
        int i2 = this.f18957;
        this.f18957 = i2 + 1;
        if (i2 == 0) {
            return c23098.f74329;
        }
        if (i2 == 1) {
            return c23098.f74327;
        }
        if (i2 == 2) {
            return c23098.f74332;
        }
        if (i2 == 3) {
            return c23098.f74324;
        }
        if (i2 == 4) {
            return c23098.f74331;
        }
        return (this.f18957 - 4) + c23098.f74331;
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18957 < this.f18958.f74325;
    }
}
