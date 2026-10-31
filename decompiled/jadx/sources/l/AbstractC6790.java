package l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ۜ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AXS */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6790 extends AbstractRunnableC14510 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f21073;

    /* JADX INFO: renamed from: ֫ */
    public abstract InterfaceC11791 mo17992();

    /* JADX INFO: renamed from: ֫ */
    public void mo17993(Object obj, CancellationException cancellationException) {
    }

    /* JADX INFO: renamed from: ܽ */
    public abstract Object mo18003();

    /* JADX INFO: renamed from: ܽ */
    public Object mo18004(Object obj) {
        return obj;
    }

    public AbstractC6790(int i) {
        this.f21073 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18435(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            C10881.m27179(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        C11233.m27799(th);
        C5797.m16273(new C1851("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), mo17992().getContext());
    }

    /* JADX INFO: renamed from: ۧ */
    public Throwable mo18000(Object obj) {
        C18497 c18497 = obj instanceof C18497 ? (C18497) obj : null;
        if (c18497 != null) {
            return c18497.f57332;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    @Override // java.lang.Runnable
    public final void run() {
        Object objM43235;
        InterfaceC10318 interfaceC10318;
        Object objM43236;
        InterfaceC23683 interfaceC23683 = this.f44494;
        try {
            C10819 c10819 = (C10819) mo17992();
            AbstractC19036 abstractC19036 = c10819.f32539;
            Object obj = c10819.f32542;
            InterfaceC14801 context = abstractC19036.getContext();
            Object objM31441 = C12934.m31441(context, obj);
            C18765 c18765M49559 = objM31441 != C12934.f38800 ? C22025.m49559(abstractC19036, context) : null;
            try {
                InterfaceC14801 context2 = abstractC19036.getContext();
                Object objMo18003 = mo18003();
                Throwable thMo18000 = mo18000(objMo18003);
                if (thMo18000 == null) {
                    int i = this.f21073;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        C12434 c12434 = InterfaceC10318.f31060;
                        interfaceC10318 = (InterfaceC10318) context2.mo9082(C12434.f37427);
                    } else {
                        interfaceC10318 = null;
                    }
                } else {
                    interfaceC10318 = null;
                }
                if (interfaceC10318 != null && !interfaceC10318.mo26070()) {
                    CancellationException cancellationExceptionMo26071 = interfaceC10318.mo26071();
                    mo17993(objMo18003, cancellationExceptionMo26071);
                    abstractC19036.mo8683(C18642.m43235((Throwable) cancellationExceptionMo26071));
                } else if (thMo18000 != null) {
                    abstractC19036.mo8683(C18642.m43235(thMo18000));
                } else {
                    abstractC19036.mo8683(mo18004(objMo18003));
                }
                C8058 c8058 = C8058.f24861;
                if (c18765M49559 == null) {
                    C12934.m31440(context, objM31441);
                    try {
                        interfaceC23683.getClass();
                        objM43236 = C8058.f24861;
                    } catch (Throwable th) {
                        objM43236 = C18642.m43235(th);
                    }
                    m18435((Throwable) null, C3825.m11584(objM43236));
                    return;
                }
                throw null;
            } catch (Throwable th2) {
                if (c18765M49559 != null) {
                    throw null;
                }
                C12934.m31440(context, objM31441);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                interfaceC23683.getClass();
                objM43235 = C8058.f24861;
            } catch (Throwable th4) {
                objM43235 = C18642.m43235(th4);
            }
            m18435(th3, C3825.m11584(objM43235));
        }
    }
}
