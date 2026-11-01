package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۤ᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12358 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f34484;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f34485;

    public /* synthetic */ C12358(int i, Object obj) {
        this.f34484 = i;
        this.f34485 = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo56417andThen(Function function) {
        return C22038.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C22038.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f34484) {
            case 0:
                AbstractC6462 abstractC6462 = (AbstractC6462) obj;
                return abstractC6462.mo14805() ? abstractC6462 : ((C11216) this.f34485).f31200.m19503(abstractC6462);
            default:
                return ((C8374) this.f34485).m19431((InterfaceC10057) obj);
        }
    }
}
