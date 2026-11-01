package p067l;

/* JADX INFO: renamed from: l.ۖۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: QAND */
/* JADX INFO: loaded from: classes2.dex */
public final class C4722 implements InterfaceC20816 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ InterfaceC20816 f10675;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C25114 f10676;

    public C4722(C6063 c6063, C25114 c25114, InterfaceC20816 interfaceC20816) {
        this.f10676 = c25114;
        this.f10675 = interfaceC20816;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p067l.InterfaceC20816
    /* JADX INFO: renamed from: ֫ */
    public final Object mo10002(Object obj, AbstractC20461 abstractC20461) throws Throwable {
        C17461 c17461;
        if (abstractC20461 instanceof C17461) {
            c17461 = (C17461) abstractC20461;
            int i = c17461.f52202;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17461.f52202 = i - Integer.MIN_VALUE;
            } else {
                c17461 = new C17461(this, abstractC20461);
            }
        } else {
            c17461 = new C17461(this, abstractC20461);
        }
        Object obj2 = c17461.f52201;
        EnumC9061 enumC9061 = EnumC9061.COROUTINE_SUSPENDED;
        int i2 = c17461.f52202;
        if (i2 == 0) {
            C20086.m45502(obj2);
            C25114 c25114 = this.f10676;
            Object obj3 = c25114.f80364;
            if (obj3 != C6733.f17479 && C13045.m29864(obj3, obj)) {
                return C10027.f27775;
            }
            c25114.f80364 = obj;
            c17461.f52202 = 1;
            if (this.f10675.mo10002(obj, c17461) == enumC9061) {
                return enumC9061;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C20086.m45502(obj2);
        }
        return C10027.f27775;
    }
}
