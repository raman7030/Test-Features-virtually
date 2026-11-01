package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.᩺ܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24248 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f76838;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f76839;

    public /* synthetic */ C24248(int i, Object obj) {
        this.f76838 = i;
        this.f76839 = obj;
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
        switch (this.f76838) {
            case 0:
                return ((AbstractC16026) obj).m39363((C17130) this.f76839);
            default:
                C11281 c11281 = (C11281) obj;
                C18537 c18537 = ((C6106) this.f76839).f15359.f62478.f40357;
                return c18537.m42163(c11281.f31435, c11281.f31433, c18537.m42191(), (AbstractC14355) null);
        }
    }
}
