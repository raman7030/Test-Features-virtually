package p067l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۚᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7639 extends AbstractC24993 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C3615 f19992;

    @Override // p067l.AbstractC19629, p067l.InterfaceC16847
    public final int characteristics() {
        return 16720;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7639(C3615 c3615, int i, int i2) {
        super(i, i2);
        this.f19992 = c3615;
    }

    @Override // p067l.AbstractC19629
    /* JADX INFO: renamed from: ֫ */
    public final int mo5713(int i) {
        return this.f19992.f7483.f28586[i];
    }

    @Override // p067l.AbstractC19629
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC18287 mo5714(int i, int i2) {
        return new C7639(this.f19992, i, i2);
    }

    @Override // p067l.AbstractC24362, p067l.InterfaceC3437
    public final void forEachRemaining(IntConsumer intConsumer) {
        C10321 c10321 = this.f19992.f7483;
        int[] iArr = c10321.f28586;
        int i = c10321.f28587;
        while (true) {
            int i2 = this.f59683;
            if (i2 >= i) {
                return;
            }
            this.f59683 = i2 + 1;
            intConsumer.accept(iArr[i2]);
        }
    }
}
