package l;

/* JADX INFO: renamed from: l.ۡ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X9MQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C9158 extends AbstractC8452 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f27716;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC19763 f27717;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27718;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9158(InterfaceC19763 interfaceC19763, Object obj, InterfaceC11791 interfaceC11791) {
        super(interfaceC11791);
        this.f27717 = interfaceC19763;
        this.f27718 = obj;
        C11233.m27800((Object) interfaceC11791, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // l.AbstractC2808
    /* JADX INFO: renamed from: ۧ */
    public final Object mo8684(Object obj) throws Throwable {
        int i = this.f27716;
        if (i != 0) {
            if (i == 1) {
                this.f27716 = 2;
                C18642.m43236(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f27716 = 1;
        C18642.m43236(obj);
        InterfaceC19763 interfaceC19763 = this.f27717;
        C11233.m27800((Object) interfaceC19763, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        C9822.m24894(2, interfaceC19763);
        return interfaceC19763.mo6973(this.f27718, this);
    }
}
