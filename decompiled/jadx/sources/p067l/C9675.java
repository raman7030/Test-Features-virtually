package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.۟᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9675 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f26649;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f26650;

    public /* synthetic */ C9675(int i, Object obj) {
        this.f26649 = i;
        this.f26650 = obj;
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
        switch (this.f26649) {
            case 0:
                AbstractC6462 abstractC6462 = (AbstractC6462) obj;
                return abstractC6462.mo14805() ? ((C11216) this.f26650).f31200.m19436(abstractC6462).f20406 : abstractC6462;
            default:
                return ((AbstractC5298) obj).mo11457((AbstractC6462) this.f26650);
        }
    }
}
