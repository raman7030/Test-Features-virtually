package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۛ֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QI */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5742 implements Function {
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
        InterfaceC15086 interfaceC15086 = (InterfaceC15086) obj;
        int i = AbstractC17299.f53000;
        interfaceC15086.getClass();
        return new C16324(interfaceC15086);
    }
}
