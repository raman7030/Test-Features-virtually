package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩳۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: FBFP */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19478 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f59350;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractC11588 f59351;

    public /* synthetic */ C19478(AbstractC11588 abstractC11588, int i) {
        this.f59350 = i;
        this.f59351 = abstractC11588;
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
        switch (this.f59350) {
            case 0:
                return Boolean.valueOf(((C22161) this.f59351).f38266.m27990(((Integer) obj).intValue()));
            default:
                C5592 c5592 = (C5592) this.f59351;
                c5592.getClass();
                return c5592.m26677(9, ((C23697) obj).toString());
        }
    }
}
