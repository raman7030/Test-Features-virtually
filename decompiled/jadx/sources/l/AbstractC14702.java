package l;

/* JADX INFO: renamed from: l.ܳᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B8IO */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14702 implements InterfaceC1318 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20369 f44904 = new C20369();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo34995(long j, int i, boolean z);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34996(C11197 c11197) {
        mo4566(AbstractC14545.of((Object) c11197));
    }

    @Override // l.InterfaceC1318
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo4589(int i) {
        return mo4609().m43763(i);
    }

    @Override // l.InterfaceC1318
    /* JADX INFO: renamed from: ܿ */
    public final void mo4601() {
        mo4570(true);
    }

    @Override // l.InterfaceC1318
    public final void pause() {
        mo4570(false);
    }

    @Override // l.InterfaceC1318
    public final boolean isPlaying() {
        return mo4603() == 3 && mo4607() && mo4560() == 0;
    }

    @Override // l.InterfaceC1318
    /* JADX INFO: renamed from: ۡ */
    public final void mo4581() {
        mo34995(-9223372036854775807L, mo4579(), false);
    }

    @Override // l.InterfaceC1318
    /* JADX INFO: renamed from: ᩳ֫ */
    public final void mo4604() {
        long currentPosition = getCurrentPosition() + (-mo4596());
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        mo34995(Math.max(currentPosition, 0L), mo4579(), false);
    }

    @Override // l.InterfaceC1318
    /* JADX INFO: renamed from: ܽ֫ */
    public final void mo4600() {
        long currentPosition = getCurrentPosition() + mo4610();
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        mo34995(Math.max(currentPosition, 0L), mo4579(), false);
    }

    @Override // l.InterfaceC1318
    /* JADX INFO: renamed from: ܺ */
    public final void mo4598() {
        int iMo14108;
        int iMo14109;
        if (mo4576().m14110() || mo4608()) {
            m34994(7);
            return;
        }
        boolean zM34997 = m34997();
        if (m34999() && !m34998()) {
            if (!zM34997) {
                m34994(7);
                return;
            }
            AbstractC4846 abstractC4846Mo4576 = mo4576();
            if (abstractC4846Mo4576.m14110()) {
                iMo14109 = -1;
            } else {
                int iMo4579 = mo4579();
                int iMo4578 = mo4578();
                if (iMo4578 == 1) {
                    iMo4578 = 0;
                }
                iMo14109 = abstractC4846Mo4576.mo14108(iMo4579, iMo4578, mo4571());
            }
            if (iMo14109 == -1) {
                m34994(7);
                return;
            } else if (iMo14109 == mo4579()) {
                mo34995(-9223372036854775807L, mo4579(), true);
                return;
            } else {
                mo34995(-9223372036854775807L, iMo14109, false);
                return;
            }
        }
        if (!zM34997 || getCurrentPosition() > mo4575()) {
            mo34995(0L, mo4579(), false);
            return;
        }
        AbstractC4846 abstractC4846Mo4577 = mo4576();
        if (abstractC4846Mo4577.m14110()) {
            iMo14108 = -1;
        } else {
            int iMo45710 = mo4579();
            int iMo45711 = mo4578();
            if (iMo45711 == 1) {
                iMo45711 = 0;
            }
            iMo14108 = abstractC4846Mo4577.mo14108(iMo45710, iMo45711, mo4571());
        }
        if (iMo14108 == -1) {
            m34994(7);
        } else if (iMo14108 == mo4579()) {
            mo34995(-9223372036854775807L, mo4579(), true);
        } else {
            mo34995(-9223372036854775807L, iMo14108, false);
        }
    }

    @Override // l.InterfaceC1318
    /* JADX INFO: renamed from: ܶ */
    public final void mo4597() {
        int iMo14096;
        if (mo4576().m14110() || mo4608()) {
            m34994(9);
            return;
        }
        if (!m35001()) {
            if (!m34999() || !m35000()) {
                m34994(9);
                return;
            } else {
                mo34995(-9223372036854775807L, mo4579(), false);
                return;
            }
        }
        AbstractC4846 abstractC4846Mo4576 = mo4576();
        if (abstractC4846Mo4576.m14110()) {
            iMo14096 = -1;
        } else {
            int iMo4579 = mo4579();
            int iMo4578 = mo4578();
            if (iMo4578 == 1) {
                iMo4578 = 0;
            }
            iMo14096 = abstractC4846Mo4576.mo14096(iMo4579, iMo4578, mo4571());
        }
        if (iMo14096 == -1) {
            m34994(9);
        } else if (iMo14096 != mo4579()) {
            mo34995(-9223372036854775807L, iMo14096, false);
        } else {
            mo34995(-9223372036854775807L, mo4579(), true);
        }
    }

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final boolean m35001() {
        int iMo14096;
        AbstractC4846 abstractC4846Mo4576 = mo4576();
        if (abstractC4846Mo4576.m14110()) {
            iMo14096 = -1;
        } else {
            int iMo4579 = mo4579();
            int iMo4578 = mo4578();
            if (iMo4578 == 1) {
                iMo4578 = 0;
            }
            iMo14096 = abstractC4846Mo4576.mo14096(iMo4579, iMo4578, mo4571());
        }
        return iMo14096 != -1;
    }

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final boolean m34997() {
        int iMo14108;
        AbstractC4846 abstractC4846Mo4576 = mo4576();
        if (abstractC4846Mo4576.m14110()) {
            iMo14108 = -1;
        } else {
            int iMo4579 = mo4579();
            int iMo4578 = mo4578();
            if (iMo4578 == 1) {
                iMo4578 = 0;
            }
            iMo14108 = abstractC4846Mo4576.mo14108(iMo4579, iMo4578, mo4571());
        }
        return iMo14108 != -1;
    }

    @Override // l.InterfaceC1318
    /* JADX INFO: renamed from: ܳ */
    public final C11197 mo4595() {
        AbstractC4846 abstractC4846Mo4576 = mo4576();
        if (abstractC4846Mo4576.m14110()) {
            return null;
        }
        return abstractC4846Mo4576.mo14103(mo4579(), this.f44904, 0L).f65753;
    }

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final boolean m35000() {
        AbstractC4846 abstractC4846Mo4576 = mo4576();
        return !abstractC4846Mo4576.m14110() && abstractC4846Mo4576.mo14103(mo4579(), this.f44904, 0L).f65759;
    }

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final boolean m34999() {
        AbstractC4846 abstractC4846Mo4576 = mo4576();
        return !abstractC4846Mo4576.m14110() && abstractC4846Mo4576.mo14103(mo4579(), this.f44904, 0L).m46687();
    }

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final boolean m34998() {
        AbstractC4846 abstractC4846Mo4576 = mo4576();
        return !abstractC4846Mo4576.m14110() && abstractC4846Mo4576.mo14103(mo4579(), this.f44904, 0L).f65764;
    }

    @Override // l.InterfaceC1318
    /* JADX INFO: renamed from: ۬ */
    public final long mo4593() {
        AbstractC4846 abstractC4846Mo4576 = mo4576();
        if (abstractC4846Mo4576.m14110()) {
            return -9223372036854775807L;
        }
        return C3603.m11037(abstractC4846Mo4576.mo14103(mo4579(), this.f44904, 0L).f65755);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m34994(int i) {
        mo34995(-9223372036854775807L, -1, false);
    }

    @Override // l.InterfaceC1318
    public final void seekTo(long j) {
        mo34995(j, mo4579(), false);
    }
}
