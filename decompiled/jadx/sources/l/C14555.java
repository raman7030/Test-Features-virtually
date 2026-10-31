package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14555 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44574;

    public /* synthetic */ C14555(int i) {
        this.f44574 = i;
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
        switch (this.f44574) {
            case 0:
                return ((C0052) obj).f17562.toString();
            default:
                return ((C20661) obj).f66522;
        }
    }
}
