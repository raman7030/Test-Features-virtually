package p067l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ۜ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AXS */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8822 extends AbstractRunnableC16159 {

    /* JADX INFO: renamed from: ᩶ */
    public int f23951;

    /* JADX INFO: renamed from: ֫ */
    public abstract InterfaceC13575 mo19941();

    /* JADX INFO: renamed from: ֫ */
    public void mo19942(Object obj, CancellationException cancellationException) {
    }

    /* JADX INFO: renamed from: ܽ */
    public abstract Object mo19952();

    /* JADX INFO: renamed from: ܽ */
    public Object mo19953(Object obj) {
        return obj;
    }

    public AbstractC8822(int i) {
        this.f23951 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20384(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            C12710.m29224(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        C13045.m29861(th);
        C7878.m18198(new C4128("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), mo19941().getContext());
    }

    /* JADX INFO: renamed from: ۧ */
    public Throwable mo19949(Object obj) {
        C19948 c19948 = obj instanceof C19948 ? (C19948) obj : null;
        if (c19948 != null) {
            return c19948.f60554;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    @Override // java.lang.Runnable
    public final void run() {
        Object objM45501;
        InterfaceC12175 interfaceC12175;
        Object objM45502;
        InterfaceC24877 interfaceC24877 = this.f47600;
        try {
            C12651 c12651 = (C12651) mo19941();
            AbstractC20461 abstractC20461 = c12651.f35515;
            Object obj = c12651.f35518;
            InterfaceC16436 context = abstractC20461.getContext();
            Object objM33528 = C14661.m33528(context, obj);
            C20203 c20203M51895 = objM33528 != C14661.f41844 ? C23301.m51895(abstractC20461, context) : null;
            try {
                InterfaceC16436 context2 = abstractC20461.getContext();
                Object objMo19952 = mo19952();
                Throwable thMo19949 = mo19949(objMo19952);
                if (thMo19949 == null) {
                    int i = this.f23951;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        C14186 c14186 = InterfaceC12175.f34023;
                        interfaceC12175 = (InterfaceC12175) context2.mo11134(C14186.f40444);
                    } else {
                        interfaceC12175 = null;
                    }
                } else {
                    interfaceC12175 = null;
                }
                if (interfaceC12175 != null && !interfaceC12175.mo28094()) {
                    CancellationException cancellationExceptionMo28095 = interfaceC12175.mo28095();
                    mo19942(objMo19952, cancellationExceptionMo28095);
                    abstractC20461.mo10744(C20086.m45501((Throwable) cancellationExceptionMo28095));
                } else if (thMo19949 != null) {
                    abstractC20461.mo10744(C20086.m45501(thMo19949));
                } else {
                    abstractC20461.mo10744(mo19953(objMo19952));
                }
                C10027 c10027 = C10027.f27775;
                if (c20203M51895 == null) {
                    C14661.m33527(context, objM33528);
                    try {
                        interfaceC24877.getClass();
                        objM45502 = C10027.f27775;
                    } catch (Throwable th) {
                        objM45502 = C20086.m45501(th);
                    }
                    m20384((Throwable) null, C6004.m13520(objM45502));
                    return;
                }
                throw null;
            } catch (Throwable th2) {
                if (c20203M51895 != null) {
                    throw null;
                }
                C14661.m33527(context, objM33528);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                interfaceC24877.getClass();
                objM45501 = C10027.f27775;
            } catch (Throwable th4) {
                objM45501 = C20086.m45501(th4);
            }
            m20384(th3, C6004.m13520(objM45501));
        }
    }
}
