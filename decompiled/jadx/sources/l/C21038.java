package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.᩷ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21038 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f67883;

    public /* synthetic */ C21038(int i) {
        this.f67883 = i;
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
        switch (this.f67883) {
            case 0:
                return (C21080) ((AbstractC12612) obj);
            default:
                return ((C20661) obj).f66452;
        }
    }
}
