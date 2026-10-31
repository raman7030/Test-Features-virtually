package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۗ᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7EF */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3543 implements Function {
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
        return C13803.of(((InterfaceC1800) obj).getLength());
    }
}
