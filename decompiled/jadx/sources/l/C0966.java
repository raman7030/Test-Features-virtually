package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.֨۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0966 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f3630;

    public /* synthetic */ C0966(int i) {
        this.f3630 = i;
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
        switch (this.f3630) {
            case 0:
                return ((C20661) obj).f66469;
            default:
                return ((C9378) obj).f28484;
        }
    }
}
