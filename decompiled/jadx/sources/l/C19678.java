package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩵᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19678 extends AbstractC19970 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0626 f63584;

    @Override // l.AbstractC15029, l.InterfaceC15234
    public final int characteristics() {
        return 16465;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19678(C0626 c0626, int i, int i2) {
        super(i, i2);
        this.f63584 = c0626;
    }

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5286(int i) {
        return this.f63584.f2401.f69816[i];
    }

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC7975 mo5287(int i, int i2) {
        return new C19678(this.f63584, i, i2);
    }

    @Override // l.AbstractC15029, l.AbstractC23889, l.InterfaceC15234
    public final void forEachRemaining(Consumer consumer) {
        C21794 c21794 = this.f63584.f2401;
        Object[] objArr = c21794.f69816;
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
