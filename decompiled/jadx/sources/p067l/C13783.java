package p067l;

/* JADX INFO: renamed from: l.ۨ᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7EF */
/* JADX INFO: loaded from: classes4.dex */
public final class C13783 extends C18882 {

    /* JADX INFO: renamed from: ۙ */
    public AbstractC15359 f38965;

    /* JADX INFO: renamed from: ᩶ */
    public C13902 f38966;

    /* JADX INFO: renamed from: ᩸ */
    public C6091 f38967;

    /* JADX INFO: renamed from: ᩹ */
    public C8655 f38968;

    /* JADX INFO: renamed from: ֫ */
    public final void m31419(C8655 c8655) {
        this.f38968 = c8655;
        this.f38967 = c8655.f9120;
        this.f38965 = null;
        this.f38966 = null;
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m31426(EnumC19222 enumC19222) {
        this.f38965 = null;
        this.f38966 = null;
        m42972(enumC19222);
        C13902 c13902 = this.f38966;
        if (c13902 != null) {
            throw c13902;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC15359 m31423() {
        return this.f38965;
    }

    /* JADX INFO: renamed from: ۖ */
    private int m31417(EnumC19222 enumC19222) {
        C8655 c8655 = this.f38968;
        if (c8655.f23232 != EnumC16818.f49668) {
            this.f38966 = C20865.m47156(this.f38967, c8655.f23240, "Incorrect TypeAnnotation \"{0}\" argument: (expected Integer),  \"{1}\"", new Object[]{enumC19222.m43791(), this.f38968.f23232});
            return -1;
        }
        int i = c8655.f23237;
        try {
            c8655.m20078();
            return i;
        } catch (C13902 e) {
            this.f38966 = e;
            return i;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private boolean m31418() {
        return this.f38966 != null;
    }

    @Override // p067l.C18882
    /* JADX INFO: renamed from: ᩷ */
    public final void mo31430(EnumC19222 enumC19222) {
        this.f38967.m48090("Type Param Target: ", new Object[0]);
        int iM31417 = m31417(enumC19222);
        if (m31418()) {
            return;
        }
        this.f38965 = new C24077(enumC19222, iM31417);
    }

    @Override // p067l.C18882
    /* JADX INFO: renamed from: ᩻ */
    public final void mo31431(EnumC19222 enumC19222) {
        this.f38967.m48090("SuperType Target: ", new Object[0]);
        int iM31417 = m31417(enumC19222);
        if (m31418()) {
            return;
        }
        this.f38965 = new C14019(enumC19222, iM31417);
    }

    @Override // p067l.C18882
    /* JADX INFO: renamed from: ۡ */
    public final void mo31421(EnumC19222 enumC19222) {
        this.f38967.m48090("TypeParam Bound Target: ", new Object[0]);
        int iM31417 = m31417(enumC19222);
        if (m31418()) {
            return;
        }
        int iM31418 = m31417(enumC19222);
        if (m31418()) {
            return;
        }
        this.f38965 = new C13349(enumC19222, iM31417, iM31418);
    }

    @Override // p067l.C18882
    /* JADX INFO: renamed from: ܽ */
    public final void mo31427(EnumC19222 enumC19222) {
        this.f38967.m48090("Empty Target: ", new Object[0]);
        if (m31418()) {
            return;
        }
        this.f38965 = new C22737(enumC19222);
    }

    @Override // p067l.C18882
    /* JADX INFO: renamed from: ܿ */
    public final void mo31428(EnumC19222 enumC19222) {
        this.f38967.m48090("MethodParam Target: ", new Object[0]);
        int iM31417 = m31417(enumC19222);
        if (m31418()) {
            return;
        }
        this.f38965 = new C23407(enumC19222, iM31417);
    }

    @Override // p067l.C18882
    /* JADX INFO: renamed from: ۜ */
    public final void mo31420(EnumC19222 enumC19222) {
        this.f38967.m48090("Throws Target: ", new Object[0]);
        int iM31417 = m31417(enumC19222);
        if (m31418()) {
            return;
        }
        this.f38965 = new C12008(enumC19222, iM31417);
    }

    @Override // p067l.C18882
    /* JADX INFO: renamed from: ᩳ */
    public final void mo31429(EnumC19222 enumC19222) {
        this.f38967.m48090("LocalVar Target: ", new Object[0]);
        C5302 c5302 = new C5302(enumC19222, 0);
        this.f38965 = c5302;
        do {
            C8655 c8655 = this.f38968;
            EnumC16818 enumC16818 = c8655.f23232;
            if (enumC16818 == EnumC16818.f49679 || enumC16818 == EnumC16818.f49567) {
                return;
            }
            try {
                c8655.m20084(EnumC16818.f49767);
            } catch (C13902 e) {
                this.f38966 = e;
            }
            if (m31418()) {
                return;
            }
            int iM31417 = m31417(enumC19222);
            if (m31418()) {
                return;
            }
            int iM31418 = m31417(enumC19222);
            if (m31418()) {
                return;
            }
            c5302.m11480(iM31417, iM31418, m31417(enumC19222));
            try {
                this.f38968.m20084(EnumC16818.f49567);
            } catch (C13902 e2) {
                this.f38966 = e2;
            }
        } while (!m31418());
    }

    @Override // p067l.C18882
    /* JADX INFO: renamed from: ۧ */
    public final void mo31424(EnumC19222 enumC19222) {
        this.f38967.m48090("Catch Target: ", new Object[0]);
        this.f38965 = new C16700(enumC19222, m31417(enumC19222));
    }

    @Override // p067l.C18882
    /* JADX INFO: renamed from: ܳ */
    public final void mo31425(EnumC19222 enumC19222) {
        this.f38967.m48090("Offset Target: ", new Object[0]);
        int iM31417 = m31417(enumC19222);
        if (m31418()) {
            return;
        }
        this.f38965 = new C14689(enumC19222, iM31417);
    }

    @Override // p067l.C18882
    /* JADX INFO: renamed from: ۢ */
    public final void mo31422(EnumC19222 enumC19222) {
        this.f38967.m48090("TypeArg Target: ", new Object[0]);
        int iM31417 = m31417(enumC19222);
        if (m31418()) {
            return;
        }
        int iM31418 = m31417(enumC19222);
        if (m31418()) {
            return;
        }
        this.f38965 = new C7984(enumC19222, iM31417, iM31418);
    }
}
