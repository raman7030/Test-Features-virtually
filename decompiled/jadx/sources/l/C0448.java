package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.֡ܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0448 implements Function {
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
        C1426 c1426 = (C1426) obj;
        EnumC12358 enumC12358 = EnumC12358.CONSTANT_NULL;
        return new C22442(c1426.m4929(), (String) c1426.f20043);
    }
}
