package l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ܽۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AY1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16462 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C15050 f50602 = new C15050("UNDEFINED");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C15050 f50601 = new C15050("REUSABLE_CLAIMED");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m38766(Object obj, InterfaceC11791 interfaceC11791) {
        if (!(interfaceC11791 instanceof C10819)) {
            interfaceC11791.mo8683(obj);
            return;
        }
        C10819 c10819 = (C10819) interfaceC11791;
        AbstractC2975 abstractC2975 = c10819.f32541;
        AbstractC19036 abstractC19036 = c10819.f32539;
        Throwable thM11584 = C3825.m11584(obj);
        Object c18497 = thM11584 == null ? obj : new C18497(thM11584, false);
        abstractC19036.getContext();
        if (abstractC2975.mo9084()) {
            c10819.f32540 = c18497;
            c10819.f21073 = 1;
            abstractC2975.mo6030(abstractC19036.getContext(), c10819);
            return;
        }
        AbstractC2557 abstractC2557M8046 = C2537.m8046();
        if (abstractC2557M8046.m8096()) {
            c10819.f32540 = c18497;
            c10819.f21073 = 1;
            abstractC2557M8046.m8092((AbstractC6790) c10819);
            return;
        }
        abstractC2557M8046.m8093(true);
        try {
            InterfaceC10318 interfaceC10318 = (InterfaceC10318) abstractC19036.getContext().mo9082(InterfaceC10318.f31060);
            if (interfaceC10318 == null || interfaceC10318.mo26070()) {
                Object obj2 = c10819.f32542;
                InterfaceC14801 context = abstractC19036.getContext();
                Object objM31441 = C12934.m31441(context, obj2);
                C18765 c18765M49559 = objM31441 != C12934.f38800 ? C22025.m49559(abstractC19036, context) : null;
                try {
                    abstractC19036.mo8683(obj);
                    C8058 c8058 = C8058.f24861;
                    if (c18765M49559 != null) {
                        throw null;
                    }
                    C12934.m31440(context, objM31441);
                } catch (Throwable th) {
                    if (c18765M49559 != null) {
                        throw null;
                    }
                    C12934.m31440(context, objM31441);
                    throw th;
                }
            } else {
                CancellationException cancellationExceptionMo26071 = interfaceC10318.mo26071();
                c10819.mo17993(c18497, cancellationExceptionMo26071);
                c10819.mo8683(C18642.m43235((Throwable) cancellationExceptionMo26071));
            }
            while (abstractC2557M8046.m8098()) {
            }
        } catch (Throwable th2) {
            try {
                c10819.m18435(th2, (Throwable) null);
            } finally {
                abstractC2557M8046.m8094();
            }
        }
    }
}
