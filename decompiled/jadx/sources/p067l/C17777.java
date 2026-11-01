package p067l;

/* JADX INFO: renamed from: l.ܺ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X9MQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C17777 extends AbstractC20461 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ InterfaceC21152 f53083;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Object f53084;

    /* JADX INFO: renamed from: ۬ */
    public int f53085;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17777(InterfaceC13575 interfaceC13575, InterfaceC16436 interfaceC16436, InterfaceC21152 interfaceC21152, Object obj) {
        super(interfaceC13575, interfaceC16436);
        this.f53083 = interfaceC21152;
        this.f53084 = obj;
        C13045.m29862((Object) interfaceC13575, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // p067l.AbstractC5038
    /* JADX INFO: renamed from: ۧ */
    public final Object mo10745(Object obj) throws Throwable {
        int i = this.f53085;
        if (i != 0) {
            if (i == 1) {
                this.f53085 = 2;
                C20086.m45502(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.f53085 = 1;
        C20086.m45502(obj);
        InterfaceC21152 interfaceC21152 = this.f53083;
        C13045.m29862((Object) interfaceC21152, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        C11704.m26909(2, interfaceC21152);
        return interfaceC21152.mo9100(this.f53084, this);
    }
}
