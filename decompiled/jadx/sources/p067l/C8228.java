package p067l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۛܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X1VL */
/* JADX INFO: loaded from: classes3.dex */
public final class C8228 implements InterfaceC8705, InterfaceC14185 {

    /* JADX INFO: renamed from: ᩸ */
    public int f21816;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C24321 f21817;

    @Override // p067l.InterfaceC22214
    public /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((IntConsumer) obj);
    }

    @Override // p067l.InterfaceC8705, p067l.InterfaceC16177, java.util.Iterator, p067l.InterfaceC14185
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C24798.m54480(this, consumer);
    }

    @Override // p067l.InterfaceC16177
    public /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C18860.$default$forEachRemaining((InterfaceC16177) this, intConsumer);
    }

    public C8228(C24321 c24321) {
        this.f21817 = c24321;
    }

    @Override // p067l.InterfaceC16177
    public final int nextInt() {
        int i = this.f21816;
        C24321 c24321 = this.f21817;
        if (i >= c24321.f77071) {
            throw new IndexOutOfBoundsException();
        }
        int i2 = this.f21816;
        this.f21816 = i2 + 1;
        if (i2 == 0) {
            return c24321.f77075;
        }
        if (i2 == 1) {
            return c24321.f77073;
        }
        if (i2 == 2) {
            return c24321.f77078;
        }
        if (i2 == 3) {
            return c24321.f77070;
        }
        if (i2 == 4) {
            return c24321.f77077;
        }
        return (this.f21816 - 4) + c24321.f77077;
    }

    @Override // java.util.Iterator
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21816 < this.f21817.f77071;
    }
}
