package l;

/* JADX INFO: renamed from: l.ܺ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X9MQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C16212 extends AbstractC19036 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC19763 f49913;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f49914;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f49915;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16212(InterfaceC11791 interfaceC11791, InterfaceC14801 interfaceC14801, InterfaceC19763 interfaceC19763, Object obj) {
        super(interfaceC11791, interfaceC14801);
        this.f49913 = interfaceC19763;
        this.f49914 = obj;
        C11233.m27800((Object) interfaceC11791, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // l.AbstractC2808
    /* JADX INFO: renamed from: ۧ */
    public final Object mo8684(Object obj) throws Throwable {
        int i = this.f49915;
        if (i != 0) {
            if (i == 1) {
                this.f49915 = 2;
                C18642.m43236(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f49915 = 1;
        C18642.m43236(obj);
        InterfaceC19763 interfaceC19763 = this.f49913;
        C11233.m27800((Object) interfaceC19763, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        C9822.m24894(2, interfaceC19763);
        return interfaceC19763.mo6973(this.f49914, this);
    }
}
