package p067l;

/* JADX INFO: renamed from: l.ۡۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10757 implements InterfaceC20145 {
    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo24766(C14779 c14779, InterfaceC13575 interfaceC13575);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p067l.InterfaceC20145
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13686(InterfaceC20816 interfaceC20816, InterfaceC13575 interfaceC13575) throws Throwable {
        C11428 c11428;
        Throwable th;
        C14779 c14779;
        if (interfaceC13575 instanceof C11428) {
            c11428 = (C11428) interfaceC13575;
            int i = c11428.f31870;
            if ((i & Integer.MIN_VALUE) != 0) {
                c11428.f31870 = i - Integer.MIN_VALUE;
            } else {
                c11428 = new C11428(this, (AbstractC20461) interfaceC13575);
            }
        } else {
            c11428 = new C11428(this, (AbstractC20461) interfaceC13575);
        }
        Object obj = c11428.f31873;
        Object obj2 = EnumC9061.COROUTINE_SUSPENDED;
        int i2 = c11428.f31870;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c14779 = c11428.f31871;
            try {
                C20086.m45502(obj);
                c14779.mo10748();
                return C10027.f27775;
            } catch (Throwable th2) {
                th = th2;
                c14779.mo10748();
                throw th;
            }
        }
        C20086.m45502(obj);
        C14779 c147710 = new C14779(interfaceC20816, c11428.getContext());
        try {
            c11428.f31871 = c147710;
            c11428.f31870 = 1;
            if (mo24766(c147710, (InterfaceC13575) c11428) == obj2) {
                return obj2;
            }
            c14779 = c147710;
            c14779.mo10748();
            return C10027.f27775;
        } catch (Throwable th3) {
            th = th3;
            c14779 = c147710;
            c14779.mo10748();
            throw th;
        }
    }
}
