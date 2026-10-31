package l;

/* JADX INFO: renamed from: l.ۢ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X9MQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C9864 extends AbstractC19036 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f29836;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC16233 f29837;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9864(InterfaceC11791 interfaceC11791, InterfaceC14801 interfaceC14801, InterfaceC16233 interfaceC16233) {
        super(interfaceC11791, interfaceC14801);
        this.f29837 = interfaceC16233;
        C11233.m27800((Object) interfaceC11791, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // l.AbstractC2808
    /* JADX INFO: renamed from: ۧ */
    public final Object mo8684(Object obj) throws Throwable {
        int i = this.f29836;
        if (i != 0) {
            if (i == 1) {
                this.f29836 = 2;
                C18642.m43236(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f29836 = 1;
        C18642.m43236(obj);
        InterfaceC16233 interfaceC16233 = this.f29837;
        C11233.m27800((Object) interfaceC16233, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        C9822.m24894(1, interfaceC16233);
        return interfaceC16233.invoke(this);
    }
}
