package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.᩺ܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23022 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74099;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f74100;

    public /* synthetic */ C23022(int i, Object obj) {
        this.f74099 = i;
        this.f74100 = obj;
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
        switch (this.f74099) {
            case 0:
                return ((AbstractC14371) obj).m37193((C15532) this.f74100);
            default:
                C9378 c9378 = (C9378) obj;
                C17013 c17013 = ((C3933) this.f74100).f12551.f59255.f37342;
                return c17013.m39920(c9378.f28486, c9378.f28484, c17013.m39948(), (AbstractC12612) null);
        }
    }
}
