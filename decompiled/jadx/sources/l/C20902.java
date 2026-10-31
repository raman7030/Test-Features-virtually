package l;

/* JADX INFO: renamed from: l.᩷۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AXS */
/* JADX INFO: loaded from: classes4.dex */
public final class C20902 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m47741(C6502 c6502, InterfaceC11791 interfaceC11791, boolean z) {
        Object objMo18003 = c6502.mo18003();
        Throwable thMo18000 = c6502.mo18000(objMo18003);
        Object objM43235 = thMo18000 != null ? C18642.m43235(thMo18000) : c6502.mo18004(objMo18003);
        if (z) {
            C10819 c10819 = (C10819) interfaceC11791;
            AbstractC19036 abstractC19036 = c10819.f32539;
            Object obj = c10819.f32542;
            InterfaceC14801 context = abstractC19036.getContext();
            Object objM31441 = C12934.m31441(context, obj);
            C18765 c18765M49559 = objM31441 != C12934.f38800 ? C22025.m49559(abstractC19036, context) : null;
            try {
                c10819.f32539.mo8683(objM43235);
                C8058 c8058 = C8058.f24861;
                if (c18765M49559 == null) {
                    C12934.m31440(context, objM31441);
                    return;
                }
                throw null;
            } catch (Throwable th) {
                if (c18765M49559 != null) {
                    throw null;
                }
                C12934.m31440(context, objM31441);
                throw th;
            }
        }
        interfaceC11791.mo8683(objM43235);
    }
}
