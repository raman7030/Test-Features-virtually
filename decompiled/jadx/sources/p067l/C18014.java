package p067l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ܽۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AY1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18014 {

    /* JADX INFO: renamed from: ۧ */
    public static final C16672 f53780 = new C16672("UNDEFINED");

    /* JADX INFO: renamed from: ֫ */
    public static final C16672 f53779 = new C16672("REUSABLE_CLAIMED");

    /* JADX INFO: renamed from: ֫ */
    public static final void m40992(Object obj, InterfaceC13575 interfaceC13575) {
        if (!(interfaceC13575 instanceof C12651)) {
            interfaceC13575.mo10744(obj);
            return;
        }
        C12651 c12651 = (C12651) interfaceC13575;
        AbstractC5196 abstractC5196 = c12651.f35517;
        AbstractC20461 abstractC20461 = c12651.f35515;
        Throwable thM13520 = C6004.m13520(obj);
        Object c19948 = thM13520 == null ? obj : new C19948(thM13520, false);
        abstractC20461.getContext();
        if (abstractC5196.mo11136()) {
            c12651.f35516 = c19948;
            c12651.f23951 = 1;
            abstractC5196.mo8227(abstractC20461.getContext(), c12651);
            return;
        }
        AbstractC4799 abstractC4799M10076 = C4780.m10076();
        if (abstractC4799M10076.m10128()) {
            c12651.f35516 = c19948;
            c12651.f23951 = 1;
            abstractC4799M10076.m10124((AbstractC8822) c12651);
            return;
        }
        abstractC4799M10076.m10125(true);
        try {
            InterfaceC12175 interfaceC12175 = (InterfaceC12175) abstractC20461.getContext().mo11134(InterfaceC12175.f34023);
            if (interfaceC12175 == null || interfaceC12175.mo28094()) {
                Object obj2 = c12651.f35518;
                InterfaceC16436 context = abstractC20461.getContext();
                Object objM33528 = C14661.m33528(context, obj2);
                C20203 c20203M51895 = objM33528 != C14661.f41844 ? C23301.m51895(abstractC20461, context) : null;
                try {
                    abstractC20461.mo10744(obj);
                    C10027 c10027 = C10027.f27775;
                    if (c20203M51895 != null) {
                        throw null;
                    }
                    C14661.m33527(context, objM33528);
                } catch (Throwable th) {
                    if (c20203M51895 != null) {
                        throw null;
                    }
                    C14661.m33527(context, objM33528);
                    throw th;
                }
            } else {
                CancellationException cancellationExceptionMo28095 = interfaceC12175.mo28095();
                c12651.mo19942(c19948, cancellationExceptionMo28095);
                c12651.mo10744(C20086.m45501((Throwable) cancellationExceptionMo28095));
            }
            while (abstractC4799M10076.m10130()) {
            }
        } catch (Throwable th2) {
            try {
                c12651.m20384(th2, (Throwable) null);
            } finally {
                abstractC4799M10076.m10126();
            }
        }
    }
}
