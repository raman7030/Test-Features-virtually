package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۜۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes3.dex */
public final class C6481 extends AbstractC19970 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20593 f20014;

    @Override // l.AbstractC15029, l.InterfaceC15234
    public final int characteristics() {
        return 16464;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6481(C20593 c20593, int i, int i2) {
        super(i, i2);
        this.f20014 = c20593;
    }

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5286(int i) {
        return this.f20014.f66296.f28191[i];
    }

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC7975 mo5287(int i, int i2) {
        return new C6481(this.f20014, i, i2);
    }

    @Override // l.AbstractC15029, l.AbstractC23889, l.InterfaceC15234
    public final void forEachRemaining(Consumer consumer) {
        C9304 c9304 = this.f20014.f66296;
        Object[] objArr = c9304.f28191;
        int i = c9304.f28192;
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
