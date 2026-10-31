package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۠᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8388 extends AbstractC19970 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15442 f25725;

    @Override // l.AbstractC15029, l.InterfaceC15234
    public final int characteristics() {
        return 16464;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8388(C15442 c15442, int i, int i2) {
        super(i, i2);
        this.f25725 = c15442;
    }

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5286(int i) {
        return this.f25725.f47296.f69811[i];
    }

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC7975 mo5287(int i, int i2) {
        return new C8388(this.f25725, i, i2);
    }

    @Override // l.AbstractC15029, l.AbstractC23889, l.InterfaceC15234
    public final void forEachRemaining(Consumer consumer) {
        C21794 c21794 = this.f25725.f47296;
        Object[] objArr = c21794.f69811;
        int i = c21794.f69812;
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
