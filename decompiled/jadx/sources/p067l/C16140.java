package p067l;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܳۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16140 extends C11863 implements InterfaceC9611 {
    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void accept(double d) {
        AbstractC11111.m25611m();
        throw null;
    }

    @Override // p067l.InterfaceC2925
    public final /* synthetic */ void accept(int i) {
        AbstractC11111.m25618t();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void m45213n(Object obj) {
        mo4235l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C4603.$default$andThen(this, longConsumer);
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean mo4233f() {
        return false;
    }

    @Override // p067l.InterfaceC16336
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void mo4235l(Long l2) {
        AbstractC11111.m25616r(this, l2);
    }

    @Override // p067l.InterfaceC10873
    public final /* bridge */ /* synthetic */ InterfaceC7324 build() {
        build();
        return this;
    }

    @Override // p067l.InterfaceC9611, p067l.InterfaceC10873
    public final InterfaceC8169 build() {
        int i = this.f33067b;
        long[] jArr = this.f33066a;
        if (i >= jArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f33067b), Integer.valueOf(jArr.length)));
    }

    @Override // p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        long[] jArr = this.f33066a;
        if (j != jArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(jArr.length)));
        }
        this.f33067b = 0;
    }

    @Override // p067l.InterfaceC2925
    public final void accept(long j) {
        int i = this.f33067b;
        long[] jArr = this.f33066a;
        if (i < jArr.length) {
            this.f33067b = i + 1;
            jArr[i] = j;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(jArr.length)));
    }

    @Override // p067l.InterfaceC2925
    public final void end() {
        int i = this.f33067b;
        long[] jArr = this.f33066a;
        if (i < jArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f33067b), Integer.valueOf(jArr.length)));
        }
    }

    @Override // p067l.C11863
    public final String toString() {
        long[] jArr = this.f33066a;
        return String.format("LongFixedNodeBuilder[%d][%s]", Integer.valueOf(jArr.length - this.f33067b), Arrays.toString(jArr));
    }
}
