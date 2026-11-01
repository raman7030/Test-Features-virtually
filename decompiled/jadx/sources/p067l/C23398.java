package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩹ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23398 extends AbstractC21348 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C21387 f74543;

    @Override // p067l.AbstractC16652, p067l.InterfaceC16847
    public final int characteristics() {
        return 16464;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23398(C21387 c21387, int i, int i2) {
        super(i, i2);
        this.f74543 = c21387;
    }

    @Override // p067l.AbstractC16652
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7515(int i) {
        return this.f74543.f67467.f17106[i];
    }

    @Override // p067l.AbstractC16652
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9948 mo7516(int i, int i2) {
        return new C23398(this.f74543, i, i2);
    }

    @Override // p067l.AbstractC16652, p067l.AbstractC25073, p067l.InterfaceC16847
    public final void forEachRemaining(Consumer consumer) {
        C6634 c6634 = this.f74543.f67467;
        Object[] objArr = c6634.f17106;
        int i = c6634.f17107;
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
