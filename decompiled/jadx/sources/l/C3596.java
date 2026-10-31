package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۘ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1NC */
/* JADX INFO: loaded from: classes3.dex */
public final class C3596 extends AbstractC3036 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18413 f11412;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3596(C18413 c18413) {
        super(c18413.f51683);
        this.f11412 = c18413;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3596(C18413 c18413, int i, int i2) {
        super(i, i2);
        this.f11412 = c18413;
    }

    @Override // l.AbstractC3036
    /* JADX INFO: renamed from: ۧ */
    public final int mo9287() {
        return this.f11412.f51682;
    }

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5286(int i) {
        return this.f11412.f57160.f60231[i];
    }

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC7975 mo5287(int i, int i2) {
        return new C3596(this.f11412, i, i2);
    }

    @Override // l.AbstractC15029, l.InterfaceC15234
    public final boolean tryAdvance(Consumer consumer) {
        if (this.f45806 >= mo9286()) {
            return false;
        }
        Object[] objArr = this.f11412.f57160.f60231;
        int i = this.f45806;
        this.f45806 = i + 1;
        consumer.n(objArr[i]);
        return true;
    }

    @Override // l.AbstractC15029, l.AbstractC23889, l.InterfaceC15234
    public final void forEachRemaining(Consumer consumer) {
        Object[] objArr = this.f11412.f57160.f60231;
        int iMo9286 = mo9286();
        while (true) {
            int i = this.f45806;
            if (i >= iMo9286) {
                return;
            }
            this.f45806 = i + 1;
            consumer.n(objArr[i]);
        }
    }
}
