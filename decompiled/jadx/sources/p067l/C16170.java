package p067l;

/* JADX INFO: renamed from: l.ܳ۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6PC */
/* JADX INFO: loaded from: classes4.dex */
public final class C16170 extends C18231 {
    @Override // p067l.C18231
    /* JADX INFO: renamed from: ᩳ */
    public final void mo28299(AbstractC11527 abstractC11527) {
    }

    @Override // p067l.C18231
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC2808 mo28297(AbstractC11527 abstractC11527) {
        throw new C18902(abstractC11527);
    }

    @Override // p067l.C18231
    /* JADX INFO: renamed from: ֫ */
    public final void mo28298(AbstractC11527 abstractC11527, C4821 c4821) {
        int i = 0;
        while (abstractC11527.m26581().getType() != -1) {
            int type = abstractC11527.m26581().getType();
            if (i != 0 || (type != 93 && type != 92)) {
                if (type == 87 || type == 89 || type == 91) {
                    i++;
                }
                if (type == 88 || type == 90 || type == 92) {
                    if (i == 0) {
                        return;
                    } else {
                        i--;
                    }
                }
                abstractC11527.mo11991();
            } else {
                if (abstractC11527.m26580().f65695 == null) {
                    abstractC11527.mo11991();
                    return;
                }
                return;
            }
        }
    }
}
