package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۘᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6298 extends AbstractC21348 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C20380 f15915;

    @Override // p067l.AbstractC16652, p067l.InterfaceC16847
    public final int characteristics() {
        return 16465;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6298(C20380 c20380, int i, int i2) {
        super(i, i2);
        this.f15915 = c20380;
    }

    @Override // p067l.AbstractC16652
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7515(int i) {
        return this.f15915.f62993.f28591[i];
    }

    @Override // p067l.AbstractC16652
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9948 mo7516(int i, int i2) {
        return new C6298(this.f15915, i, i2);
    }

    @Override // p067l.AbstractC16652, p067l.AbstractC25073, p067l.InterfaceC16847
    public final void forEachRemaining(Consumer consumer) {
        C10321 c10321 = this.f15915.f62993;
        Object[] objArr = c10321.f28591;
        int i = c10321.f28587;
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
