package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.֨۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3286 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f6405;

    public /* synthetic */ C3286(int i) {
        this.f6405 = i;
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
        switch (this.f6405) {
            case 0:
                return ((C22004) obj).f69151;
            default:
                return ((C11281) obj).f31433;
        }
    }
}
