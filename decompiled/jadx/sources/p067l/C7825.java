package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۛ֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QI */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7825 implements Function {
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
        InterfaceC16706 interfaceC16706 = (InterfaceC16706) obj;
        int i = AbstractC18809.f56181;
        interfaceC16706.getClass();
        return new C17882(interfaceC16706);
    }
}
