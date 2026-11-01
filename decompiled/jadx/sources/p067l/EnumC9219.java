package p067l;

/* JADX INFO: renamed from: l.۟ۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 49A2 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC9219 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* JADX INFO: renamed from: ܿ */
    public static /* synthetic */ void m21239() {
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21240(InterfaceC17797 interfaceC17797, InterfaceC13575 interfaceC13575) {
        int i = C15253.f43540[ordinal()];
        if (i == 1) {
            try {
                C18014.m40992(C10027.f27775, C23669.m52679(C23669.m52678(interfaceC17797, interfaceC13575)));
                return;
            } catch (Throwable th) {
                interfaceC13575.mo10744(C20086.m45501(th));
                throw th;
            }
        }
        if (i == 2) {
            C13045.m29867(interfaceC17797, "<this>");
            C13045.m29867(interfaceC13575, "completion");
            C23669.m52679(C23669.m52678(interfaceC17797, interfaceC13575)).mo10744(C10027.f27775);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                throw new C10698();
            }
            return;
        }
        C13045.m29867(interfaceC13575, "completion");
        try {
            InterfaceC16436 context = interfaceC13575.getContext();
            Object objM33528 = C14661.m33528(context, null);
            try {
                C11704.m26909(1, interfaceC17797);
                Object objInvoke = interfaceC17797.invoke(interfaceC13575);
                C14661.m33527(context, objM33528);
                if (objInvoke != EnumC9061.COROUTINE_SUSPENDED) {
                    interfaceC13575.mo10744(objInvoke);
                }
            } catch (Throwable th2) {
                C14661.m33527(context, objM33528);
                throw th2;
            }
        } catch (Throwable th3) {
            interfaceC13575.mo10744(C20086.m45501(th3));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21241(InterfaceC21152 interfaceC21152, Object obj, InterfaceC13575 interfaceC13575) {
        int i = C15253.f43540[ordinal()];
        if (i == 1) {
            try {
                C18014.m40992(C10027.f27775, C23669.m52679(C23669.m52680(interfaceC21152, obj, interfaceC13575)));
                return;
            } catch (Throwable th) {
                interfaceC13575.mo10744(C20086.m45501(th));
                throw th;
            }
        }
        if (i == 2) {
            C13045.m29867(interfaceC21152, "<this>");
            C13045.m29867(interfaceC13575, "completion");
            C23669.m52679(C23669.m52680(interfaceC21152, obj, interfaceC13575)).mo10744(C10027.f27775);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                throw new C10698();
            }
            return;
        }
        C13045.m29867(interfaceC13575, "completion");
        try {
            InterfaceC16436 context = interfaceC13575.getContext();
            Object objM33528 = C14661.m33528(context, null);
            try {
                C11704.m26909(2, interfaceC21152);
                Object objMo9100 = interfaceC21152.mo9100(obj, interfaceC13575);
                C14661.m33527(context, objM33528);
                if (objMo9100 != EnumC9061.COROUTINE_SUSPENDED) {
                    interfaceC13575.mo10744(objMo9100);
                }
            } catch (Throwable th2) {
                C14661.m33527(context, objM33528);
                throw th2;
            }
        } catch (Throwable th3) {
            interfaceC13575.mo10744(C20086.m45501(th3));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m21242() {
        return this == LAZY;
    }
}
