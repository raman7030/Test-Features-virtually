package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۨ֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QI */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11387 implements Function {
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
        InterfaceC22900 interfaceC22900 = (InterfaceC22900) obj;
        int i = AbstractC17299.f53000;
        interfaceC22900.getClass();
        return new C10681(interfaceC22900);
    }
}
