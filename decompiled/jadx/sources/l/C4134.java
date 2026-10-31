package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۘᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4134 extends AbstractC19970 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18951 f13101;

    @Override // l.AbstractC15029, l.InterfaceC15234
    public final int characteristics() {
        return 16465;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4134(C18951 c18951, int i, int i2) {
        super(i, i2);
        this.f13101 = c18951;
    }

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5286(int i) {
        return this.f13101.f59763.f25678[i];
    }

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC7975 mo5287(int i, int i2) {
        return new C4134(this.f13101, i, i2);
    }

    @Override // l.AbstractC15029, l.AbstractC23889, l.InterfaceC15234
    public final void forEachRemaining(Consumer consumer) {
        C8367 c8367 = this.f13101.f59763;
        Object[] objArr = c8367.f25678;
        int i = c8367.f25674;
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
