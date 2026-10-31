package l;

/* JADX INFO: renamed from: l.ܳ۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6PC */
/* JADX INFO: loaded from: classes4.dex */
public final class C14522 extends C16691 {
    @Override // l.C16691
    /* JADX INFO: renamed from: ᩳ */
    public final void mo26270(AbstractC9637 abstractC9637) {
    }

    @Override // l.C16691
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC0463 mo26268(AbstractC9637 abstractC9637) {
        throw new C17397(abstractC9637);
    }

    @Override // l.C16691
    /* JADX INFO: renamed from: ֫ */
    public final void mo26269(AbstractC9637 abstractC9637, C2581 c2581) {
        int i = 0;
        while (abstractC9637.m24567().getType() != -1) {
            int type = abstractC9637.m24567().getType();
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
                abstractC9637.mo9958();
            } else {
                if (abstractC9637.m24566().f63075 == null) {
                    abstractC9637.mo9958();
                    return;
                }
                return;
            }
        }
    }
}
