package l;

/* JADX INFO: renamed from: l.ۖۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: QAND */
/* JADX INFO: loaded from: classes2.dex */
public final class C2476 implements InterfaceC19410 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC19410 f7887;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23932 f7888;

    public C2476(C3887 c3887, C23932 c23932, InterfaceC19410 interfaceC19410) {
        this.f7888 = c23932;
        this.f7887 = interfaceC19410;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l.InterfaceC19410
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo7954(Object obj, AbstractC19036 abstractC19036) throws Throwable {
        C15880 c15880;
        if (abstractC19036 instanceof C15880) {
            c15880 = (C15880) abstractC19036;
            int i = c15880.f49062;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15880.f49062 = i - Integer.MIN_VALUE;
            } else {
                c15880 = new C15880(this, abstractC19036);
            }
        } else {
            c15880 = new C15880(this, abstractC19036);
        }
        Object obj2 = c15880.f49061;
        EnumC7041 enumC7041 = EnumC7041.COROUTINE_SUSPENDED;
        int i2 = c15880.f49062;
        if (i2 == 0) {
            C18642.m43236(obj2);
            C23932 c23932 = this.f7888;
            Object obj3 = c23932.f77612;
            if (obj3 != C4592.f14651 && C11233.m27802(obj3, obj)) {
                return C8058.f24861;
            }
            c23932.f77612 = obj;
            c15880.f49062 = 1;
            if (this.f7887.mo7954(obj, c15880) == enumC7041) {
                return enumC7041;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C18642.m43236(obj2);
        }
        return C8058.f24861;
    }
}
