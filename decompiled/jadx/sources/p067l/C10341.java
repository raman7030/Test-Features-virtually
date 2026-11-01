package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۠᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10341 extends AbstractC21348 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C17045 f28638;

    @Override // p067l.AbstractC16652, p067l.InterfaceC16847
    public final int characteristics() {
        return 16464;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10341(C17045 c17045, int i, int i2) {
        super(i, i2);
        this.f28638 = c17045;
    }

    @Override // p067l.AbstractC16652
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7515(int i) {
        return this.f28638.f50425.f72519[i];
    }

    @Override // p067l.AbstractC16652
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9948 mo7516(int i, int i2) {
        return new C10341(this.f28638, i, i2);
    }

    @Override // p067l.AbstractC16652, p067l.AbstractC25073, p067l.InterfaceC16847
    public final void forEachRemaining(Consumer consumer) {
        C23082 c23082 = this.f28638.f50425;
        Object[] objArr = c23082.f72519;
        int i = c23082.f72520;
        while (true) {
            int i2 = this.f48922;
            if (i2 >= i) {
                return;
            }
            this.f48922 = i2 + 1;
            consumer.accept(objArr[i2]);
        }
    }
}
