package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩳۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: FBFP */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18003 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f56153;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC9701 f56154;

    public /* synthetic */ C18003(AbstractC9701 abstractC9701, int i) {
        this.f56153 = i;
        this.f56154 = abstractC9701;
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
        switch (this.f56153) {
            case 0:
                return Boolean.valueOf(((C20826) this.f56154).f35264.m25968(((Integer) obj).intValue()));
            default:
                C3392 c3392 = (C3392) this.f56154;
                c3392.getClass();
                return c3392.m24663(9, ((C22442) obj).toString());
        }
    }
}
