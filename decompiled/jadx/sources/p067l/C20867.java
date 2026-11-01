package p067l;

/* JADX INFO: renamed from: l.᩵۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R68J */
/* JADX INFO: loaded from: classes4.dex */
public final class C20867 {

    /* JADX INFO: renamed from: ֫ */
    public final C1012 f65553 = new C1012();

    /* JADX INFO: renamed from: ۧ */
    public final C1117 f65554 = new C1117();

    /* JADX INFO: renamed from: ۧ */
    public final C13236 m47161(AbstractC5462 abstractC5462) {
        return m47158(abstractC5462, 4);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13236 m47159(AbstractC5462 abstractC5462) {
        return m47158(abstractC5462, 8);
    }

    /* JADX INFO: renamed from: ֫ */
    private C13236 m47158(AbstractC5462 abstractC5462, int i) {
        C6114 c6114;
        C13236 c13236;
        C1012 c1012 = this.f65553;
        int iM12518 = c1012.m12518(abstractC5462);
        if (iM12518 >= 0 && (c6114 = (C6114) c1012.m12521(iM12518)) != null) {
            int i2 = c6114.f15367;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                c6114.f15367 = i3;
                if (i == 4) {
                    c13236 = c6114.f15369;
                } else if (i == 8) {
                    c13236 = c6114.f15368;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    c1012.m12523(iM12518);
                    c6114.f15367 = 0;
                    c6114.f15369 = null;
                    c6114.f15368 = null;
                    C6114.f15366.mo18733(c6114);
                }
                return c13236;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m47162(AbstractC5462 abstractC5462) {
        C6114 c6114 = (C6114) this.f65553.getOrDefault(abstractC5462, null);
        if (c6114 == null) {
            return;
        }
        c6114.f15367 &= -2;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m47163(AbstractC5462 abstractC5462) {
        C1117 c1117 = this.f65554;
        int iM17614 = c1117.m17614();
        while (true) {
            iM17614--;
            if (iM17614 < 0) {
                break;
            } else if (abstractC5462 == c1117.m17616(iM17614)) {
                c1117.m17615(iM17614);
                break;
            }
        }
        C6114 c6114 = (C6114) this.f65553.remove(abstractC5462);
        if (c6114 != null) {
            c6114.f15367 = 0;
            c6114.f15369 = null;
            c6114.f15368 = null;
            C6114.f15366.mo18733(c6114);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47160(AbstractC5462 abstractC5462, C13236 c13236) {
        C1012 c1012 = this.f65553;
        C6114 c6114M13913 = (C6114) c1012.getOrDefault(abstractC5462, null);
        if (c6114M13913 == null) {
            c6114M13913 = C6114.m13913();
            c1012.put(abstractC5462, c6114M13913);
        }
        c6114M13913.f15368 = c13236;
        c6114M13913.f15367 |= 8;
    }
}
