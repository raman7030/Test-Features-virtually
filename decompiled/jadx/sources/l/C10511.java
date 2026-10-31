package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۤ᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10511 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f31522;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f31523;

    public /* synthetic */ C10511(int i, Object obj) {
        this.f31522 = i;
        this.f31523 = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f31522) {
            case 0:
                AbstractC4308 abstractC4308 = (AbstractC4308) obj;
                return abstractC4308.mo12941() ? abstractC4308 : ((C9310) this.f31523).f28251.m17563(abstractC4308);
            default:
                return ((C6319) this.f31523).m17491((InterfaceC8090) obj);
        }
    }
}
