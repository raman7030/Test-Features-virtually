package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 43ZG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14375 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f43316;

    public /* synthetic */ C14375(int i) {
        this.f43316 = i;
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
        switch (this.f43316) {
            case 0:
                return C4860.m14172("\"", ((EnumC15204) obj).m35967(), "\"");
            default:
                return ((C17863) ((C15869) obj).f49042).m41837();
        }
    }
}
