package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩵᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21071 extends AbstractC21348 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C2964 f66205;

    @Override // p067l.AbstractC16652, p067l.InterfaceC16847
    public final int characteristics() {
        return 16465;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21071(C2964 c2964, int i, int i2) {
        super(i, i2);
        this.f66205 = c2964;
    }

    @Override // p067l.AbstractC16652
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7515(int i) {
        return this.f66205.f5174.f72524[i];
    }

    @Override // p067l.AbstractC16652
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9948 mo7516(int i, int i2) {
        return new C21071(this.f66205, i, i2);
    }

    @Override // p067l.AbstractC16652, p067l.AbstractC25073, p067l.InterfaceC16847
    public final void forEachRemaining(Consumer consumer) {
        C23082 c23082 = this.f66205.f5174;
        Object[] objArr = c23082.f72524;
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
