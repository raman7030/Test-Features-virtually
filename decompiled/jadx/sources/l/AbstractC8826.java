package l;

/* JADX INFO: renamed from: l.ۡۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8826 implements InterfaceC18704 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract Object mo22796(C13058 c13058, InterfaceC11791 interfaceC11791);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l.InterfaceC18704
    /* JADX INFO: renamed from: ֫ */
    public final Object mo11750(InterfaceC19410 interfaceC19410, InterfaceC11791 interfaceC11791) throws Throwable {
        C9532 c9532;
        Throwable th;
        C13058 c13058;
        if (interfaceC11791 instanceof C9532) {
            c9532 = (C9532) interfaceC11791;
            int i = c9532.f28924;
            if ((i & Integer.MIN_VALUE) != 0) {
                c9532.f28924 = i - Integer.MIN_VALUE;
            } else {
                c9532 = new C9532(this, (AbstractC19036) interfaceC11791);
            }
        } else {
            c9532 = new C9532(this, (AbstractC19036) interfaceC11791);
        }
        Object obj = c9532.f28927;
        Object obj2 = EnumC7041.COROUTINE_SUSPENDED;
        int i2 = c9532.f28924;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c13058 = c9532.f28925;
            try {
                C18642.m43236(obj);
                c13058.mo8687();
                return C8058.f24861;
            } catch (Throwable th2) {
                th = th2;
                c13058.mo8687();
                throw th;
            }
        }
        C18642.m43236(obj);
        C13058 c13059 = new C13058(interfaceC19410, c9532.getContext());
        try {
            c9532.f28925 = c13059;
            c9532.f28924 = 1;
            if (mo22796(c13059, (InterfaceC11791) c9532) == obj2) {
                return obj2;
            }
            c13058 = c13059;
            c13058.mo8687();
            return C8058.f24861;
        } catch (Throwable th3) {
            th = th3;
            c13058 = c13059;
            c13058.mo8687();
            throw th;
        }
    }
}
