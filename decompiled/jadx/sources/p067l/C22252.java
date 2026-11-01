package p067l;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩷ܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22252 extends C24521 implements InterfaceC23693 {
    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void accept(double d) {
        AbstractC11111.m25611m();
        throw null;
    }

    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void accept(long j) {
        AbstractC11111.m25619u();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m45213n(Object obj) {
        mo6025d((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C11309.$default$andThen(this, intConsumer);
    }

    @Override // p067l.InterfaceC12274
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void mo6025d(Integer num) {
        AbstractC11111.m25614p(this, num);
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean mo4233f() {
        return false;
    }

    @Override // p067l.InterfaceC10873
    public final /* bridge */ /* synthetic */ InterfaceC7324 build() {
        build();
        return this;
    }

    @Override // p067l.InterfaceC23693, p067l.InterfaceC10873
    public final InterfaceC8840 build() {
        int i = this.f77670b;
        int[] iArr = this.f77669a;
        if (i >= iArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f77670b), Integer.valueOf(iArr.length)));
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        int[] iArr = this.f77669a;
        if (j != iArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(iArr.length)));
        }
        this.f77670b = 0;
    }

    @Override // p067l.InterfaceC2925
    public final void accept(int i) {
        int i2 = this.f77670b;
        int[] iArr = this.f77669a;
        if (i2 < iArr.length) {
            this.f77670b = i2 + 1;
            iArr[i2] = i;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(iArr.length)));
    }

    @Override // p067l.InterfaceC2925
    public final void end() {
        int i = this.f77670b;
        int[] iArr = this.f77669a;
        if (i < iArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f77670b), Integer.valueOf(iArr.length)));
        }
    }

    @Override // p067l.C24521
    public final String toString() {
        int[] iArr = this.f77669a;
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(iArr.length - this.f77670b), Arrays.toString(iArr));
    }
}
