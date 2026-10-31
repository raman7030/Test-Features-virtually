package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩹ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22127 extends AbstractC19970 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20011 f71821;

    @Override // l.AbstractC15029, l.InterfaceC15234
    public final int characteristics() {
        return 16464;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22127(C20011 c20011, int i, int i2) {
        super(i, i2);
        this.f71821 = c20011;
    }

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5286(int i) {
        return this.f71821.f64825.f14279[i];
    }

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC7975 mo5287(int i, int i2) {
        return new C22127(this.f71821, i, i2);
    }

    @Override // l.AbstractC15029, l.AbstractC23889, l.InterfaceC15234
    public final void forEachRemaining(Consumer consumer) {
        C4488 c4488 = this.f71821.f64825;
        Object[] objArr = c4488.f14279;
        int i = c4488.f14280;
        while (true) {
            int i2 = this.f45806;
            if (i2 >= i) {
                return;
            }
            this.f45806 = i2 + 1;
            consumer.accept(objArr[i2]);
        }
    }
}
