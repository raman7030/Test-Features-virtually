package l;

/* JADX INFO: renamed from: l.۟ۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 49A2 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC7208 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m19291() {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19292(InterfaceC16233 interfaceC16233, InterfaceC11791 interfaceC11791) {
        int i = C13557.f40462[ordinal()];
        if (i == 1) {
            try {
                C16462.m38766(C8058.f24861, C22412.m50339(C22412.m50338(interfaceC16233, interfaceC11791)));
                return;
            } catch (Throwable th) {
                interfaceC11791.mo8683(C18642.m43235(th));
                throw th;
            }
        }
        if (i == 2) {
            C11233.m27805(interfaceC16233, "<this>");
            C11233.m27805(interfaceC11791, "completion");
            C22412.m50339(C22412.m50338(interfaceC16233, interfaceC11791)).mo8683(C8058.f24861);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                throw new C8764();
            }
            return;
        }
        C11233.m27805(interfaceC11791, "completion");
        try {
            InterfaceC14801 context = interfaceC11791.getContext();
            Object objM31441 = C12934.m31441(context, null);
            try {
                C9822.m24894(1, interfaceC16233);
                Object objInvoke = interfaceC16233.invoke(interfaceC11791);
                C12934.m31440(context, objM31441);
                if (objInvoke != EnumC7041.COROUTINE_SUSPENDED) {
                    interfaceC11791.mo8683(objInvoke);
                }
            } catch (Throwable th2) {
                C12934.m31440(context, objM31441);
                throw th2;
            }
        } catch (Throwable th3) {
            interfaceC11791.mo8683(C18642.m43235(th3));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19293(InterfaceC19763 interfaceC19763, Object obj, InterfaceC11791 interfaceC11791) {
        int i = C13557.f40462[ordinal()];
        if (i == 1) {
            try {
                C16462.m38766(C8058.f24861, C22412.m50339(C22412.m50340(interfaceC19763, obj, interfaceC11791)));
                return;
            } catch (Throwable th) {
                interfaceC11791.mo8683(C18642.m43235(th));
                throw th;
            }
        }
        if (i == 2) {
            C11233.m27805(interfaceC19763, "<this>");
            C11233.m27805(interfaceC11791, "completion");
            C22412.m50339(C22412.m50340(interfaceC19763, obj, interfaceC11791)).mo8683(C8058.f24861);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                throw new C8764();
            }
            return;
        }
        C11233.m27805(interfaceC11791, "completion");
        try {
            InterfaceC14801 context = interfaceC11791.getContext();
            Object objM31441 = C12934.m31441(context, null);
            try {
                C9822.m24894(2, interfaceC19763);
                Object objMo6973 = interfaceC19763.mo6973(obj, interfaceC11791);
                C12934.m31440(context, objM31441);
                if (objMo6973 != EnumC7041.COROUTINE_SUSPENDED) {
                    interfaceC11791.mo8683(objMo6973);
                }
            } catch (Throwable th2) {
                C12934.m31440(context, objM31441);
                throw th2;
            }
        } catch (Throwable th3) {
            interfaceC11791.mo8683(C18642.m43235(th3));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m19294() {
        return this == LAZY;
    }
}
