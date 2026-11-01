package p067l;

/* JADX INFO: renamed from: l.ܳᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B8IO */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16341 implements InterfaceC3621 {

    /* JADX INFO: renamed from: ֫ */
    public final C21727 f48018 = new C21727();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo37142(long j, int i, boolean z);

    /* JADX INFO: renamed from: ֫ */
    public final void m37143(C13010 c13010) {
        mo6798(AbstractC16192.m36873of((Object) c13010));
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6821(int i) {
        return mo6841().m46030(i);
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ܿ */
    public final void mo6833() {
        mo6802(true);
    }

    @Override // p067l.InterfaceC3621
    public final void pause() {
        mo6802(false);
    }

    @Override // p067l.InterfaceC3621
    public final boolean isPlaying() {
        return mo6835() == 3 && mo6839() && mo6792() == 0;
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ۡ */
    public final void mo6813() {
        mo37142(-9223372036854775807L, mo6811(), false);
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ᩳ֫ */
    public final void mo6836() {
        long currentPosition = getCurrentPosition() + (-mo6828());
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        mo37142(Math.max(currentPosition, 0L), mo6811(), false);
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ܽ֫ */
    public final void mo6832() {
        long currentPosition = getCurrentPosition() + mo6842();
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        mo37142(Math.max(currentPosition, 0L), mo6811(), false);
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ܺ */
    public final void mo6830() {
        int iMo15988;
        int iMo15989;
        if (mo6808().m15990() || mo6840()) {
            m37141(7);
            return;
        }
        boolean zM37144 = m37144();
        if (m37146() && !m37145()) {
            if (!zM37144) {
                m37141(7);
                return;
            }
            AbstractC6974 abstractC6974Mo6808 = mo6808();
            if (abstractC6974Mo6808.m15990()) {
                iMo15989 = -1;
            } else {
                int iMo6811 = mo6811();
                int iMo6810 = mo6810();
                if (iMo6810 == 1) {
                    iMo6810 = 0;
                }
                iMo15989 = abstractC6974Mo6808.mo15988(iMo6811, iMo6810, mo6803());
            }
            if (iMo15989 == -1) {
                m37141(7);
                return;
            } else if (iMo15989 == mo6811()) {
                mo37142(-9223372036854775807L, mo6811(), true);
                return;
            } else {
                mo37142(-9223372036854775807L, iMo15989, false);
                return;
            }
        }
        if (!zM37144 || getCurrentPosition() > mo6807()) {
            mo37142(0L, mo6811(), false);
            return;
        }
        AbstractC6974 abstractC6974Mo6809 = mo6808();
        if (abstractC6974Mo6809.m15990()) {
            iMo15988 = -1;
        } else {
            int iMo6812 = mo6811();
            int iMo6813 = mo6810();
            if (iMo6813 == 1) {
                iMo6813 = 0;
            }
            iMo15988 = abstractC6974Mo6809.mo15988(iMo6812, iMo6813, mo6803());
        }
        if (iMo15988 == -1) {
            m37141(7);
        } else if (iMo15988 == mo6811()) {
            mo37142(-9223372036854775807L, mo6811(), true);
        } else {
            mo37142(-9223372036854775807L, iMo15988, false);
        }
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ܶ */
    public final void mo6829() {
        int iMo15976;
        if (mo6808().m15990() || mo6840()) {
            m37141(9);
            return;
        }
        if (!m37148()) {
            if (!m37146() || !m37147()) {
                m37141(9);
                return;
            } else {
                mo37142(-9223372036854775807L, mo6811(), false);
                return;
            }
        }
        AbstractC6974 abstractC6974Mo6808 = mo6808();
        if (abstractC6974Mo6808.m15990()) {
            iMo15976 = -1;
        } else {
            int iMo6811 = mo6811();
            int iMo6810 = mo6810();
            if (iMo6810 == 1) {
                iMo6810 = 0;
            }
            iMo15976 = abstractC6974Mo6808.mo15976(iMo6811, iMo6810, mo6803());
        }
        if (iMo15976 == -1) {
            m37141(9);
        } else if (iMo15976 != mo6811()) {
            mo37142(-9223372036854775807L, iMo15976, false);
        } else {
            mo37142(-9223372036854775807L, mo6811(), true);
        }
    }

    /* JADX INFO: renamed from: ᩻֫ */
    public final boolean m37148() {
        int iMo15976;
        AbstractC6974 abstractC6974Mo6808 = mo6808();
        if (abstractC6974Mo6808.m15990()) {
            iMo15976 = -1;
        } else {
            int iMo6811 = mo6811();
            int iMo6810 = mo6810();
            if (iMo6810 == 1) {
                iMo6810 = 0;
            }
            iMo15976 = abstractC6974Mo6808.mo15976(iMo6811, iMo6810, mo6803());
        }
        return iMo15976 != -1;
    }

    /* JADX INFO: renamed from: ۜ֫ */
    public final boolean m37144() {
        int iMo15988;
        AbstractC6974 abstractC6974Mo6808 = mo6808();
        if (abstractC6974Mo6808.m15990()) {
            iMo15988 = -1;
        } else {
            int iMo6811 = mo6811();
            int iMo6810 = mo6810();
            if (iMo6810 == 1) {
                iMo6810 = 0;
            }
            iMo15988 = abstractC6974Mo6808.mo15988(iMo6811, iMo6810, mo6803());
        }
        return iMo15988 != -1;
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ܳ */
    public final C13010 mo6827() {
        AbstractC6974 abstractC6974Mo6808 = mo6808();
        if (abstractC6974Mo6808.m15990()) {
            return null;
        }
        return abstractC6974Mo6808.mo15983(mo6811(), this.f48018, 0L).f68429;
    }

    /* JADX INFO: renamed from: ᩷֫ */
    public final boolean m37147() {
        AbstractC6974 abstractC6974Mo6808 = mo6808();
        return !abstractC6974Mo6808.m15990() && abstractC6974Mo6808.mo15983(mo6811(), this.f48018, 0L).f68435;
    }

    /* JADX INFO: renamed from: ۢ֫ */
    public final boolean m37146() {
        AbstractC6974 abstractC6974Mo6808 = mo6808();
        return !abstractC6974Mo6808.m15990() && abstractC6974Mo6808.mo15983(mo6811(), this.f48018, 0L).m49010();
    }

    /* JADX INFO: renamed from: ۡ֫ */
    public final boolean m37145() {
        AbstractC6974 abstractC6974Mo6808 = mo6808();
        return !abstractC6974Mo6808.m15990() && abstractC6974Mo6808.mo15983(mo6811(), this.f48018, 0L).f68440;
    }

    @Override // p067l.InterfaceC3621
    /* JADX INFO: renamed from: ۬ */
    public final long mo6825() {
        AbstractC6974 abstractC6974Mo6808 = mo6808();
        if (abstractC6974Mo6808.m15990()) {
            return -9223372036854775807L;
        }
        return C5792.m13013(abstractC6974Mo6808.mo15983(mo6811(), this.f48018, 0L).f68431);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m37141(int i) {
        mo37142(-9223372036854775807L, -1, false);
    }

    @Override // p067l.InterfaceC3621
    public final void seekTo(long j) {
        mo37142(j, mo6811(), false);
    }
}
