package p067l;

/* JADX INFO: renamed from: l.᩷᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X9MQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C22473 extends AbstractC10402 {

    /* JADX INFO: renamed from: ᩶ */
    public int f70885;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC17797 f70886;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22473(InterfaceC17797 interfaceC17797, InterfaceC13575 interfaceC13575) {
        super(interfaceC13575);
        this.f70886 = interfaceC17797;
        C13045.m29862((Object) interfaceC13575, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // p067l.AbstractC5038
    /* JADX INFO: renamed from: ۧ */
    public final Object mo10745(Object obj) throws Throwable {
        int i = this.f70885;
        if (i != 0) {
            if (i == 1) {
                this.f70885 = 2;
                C20086.m45502(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f70885 = 1;
        C20086.m45502(obj);
        InterfaceC17797 interfaceC17797 = this.f70886;
        C13045.m29862((Object) interfaceC17797, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        C11704.m26909(1, interfaceC17797);
        return interfaceC17797.invoke(this);
    }
}
