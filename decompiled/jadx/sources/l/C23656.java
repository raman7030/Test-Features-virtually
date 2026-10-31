package l;

import android.util.Pair;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.᩻ۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68QN */
/* JADX INFO: loaded from: classes2.dex */
public final class C23656 extends AbstractC23114 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f76636;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f76637;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C22485 f76638;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f76639;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final C20369 f76640;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public C17306 f76641;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final boolean f76642;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public C18012 f76643;

    public C23656(InterfaceC3901 interfaceC3901, boolean z) {
        super(interfaceC3901);
        this.f76642 = z && interfaceC3901.mo11885();
        this.f76640 = new C20369();
        this.f76638 = new C22485();
        AbstractC4846 abstractC4846Mo11886 = interfaceC3901.mo11886();
        if (abstractC4846Mo11886 != null) {
            this.f76641 = C17306.m40616(abstractC4846Mo11886, (Object) null, (Object) null);
            this.f76639 = true;
        } else {
            this.f76641 = C17306.m40617(interfaceC3901.mo9817());
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC4846 m52186() {
        return this.f76641;
    }

    @Override // l.AbstractC23114, l.AbstractC9277, l.InterfaceC3901
    /* JADX INFO: renamed from: ֫ */
    public final void mo9822(C11197 c11197) {
        if (this.f76639) {
            this.f76641 = this.f76641.m40618((AbstractC4846) new C10415(this.f76641.f40320, c11197));
        } else {
            this.f76641 = C17306.m40617(c11197);
        }
        this.f74351.mo9822(c11197);
    }

    @Override // l.AbstractC23114
    /* JADX INFO: renamed from: ۡ */
    public final void mo51296() {
        if (this.f76642) {
            return;
        }
        this.f76637 = true;
        m51297();
    }

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ֫ */
    public final C18012 mo9816(C15894 c15894, InterfaceC21725 interfaceC21725, long j) {
        C18012 c18012 = new C18012(c15894, interfaceC21725, j);
        c18012.m42061(this.f74351);
        if (this.f76636) {
            Object obj = c15894.f49112;
            if (this.f76641.f53014 != null && obj.equals(C17306.f53013)) {
                obj = this.f76641.f53014;
            }
            c18012.m42062(c15894.m37668(obj));
            return c18012;
        }
        this.f76643 = c18012;
        if (!this.f76637) {
            this.f76637 = true;
            m51297();
        }
        return c18012;
    }

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ֫ */
    public final void mo9821(InterfaceC9546 interfaceC9546) {
        ((C18012) interfaceC9546).m42066();
        if (interfaceC9546 == this.f76643) {
            this.f76643 = null;
        }
    }

    @Override // l.AbstractC21272, l.AbstractC9277
    /* JADX INFO: renamed from: ᩷ */
    public final void mo9824() {
        this.f76636 = false;
        this.f76637 = false;
        super.mo9824();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // l.AbstractC23114
    /* JADX INFO: renamed from: ۧ */
    public final void mo14564(AbstractC4846 abstractC4846) {
        long j;
        C17306 c17306M40616;
        C15894 c15894M37668;
        C17306 c17306M40617;
        if (this.f76636) {
            this.f76641 = this.f76641.m40618(abstractC4846);
            C18012 c18012 = this.f76643;
            if (c18012 != null) {
                m52185(c18012.m42065());
            }
        } else if (abstractC4846.m14110()) {
            if (this.f76639) {
                c17306M40617 = this.f76641.m40618(abstractC4846);
            } else {
                c17306M40617 = C17306.m40616(abstractC4846, C20369.f65748, C17306.f53013);
            }
            this.f76641 = c17306M40617;
        } else {
            C20369 c20369 = this.f76640;
            abstractC4846.m14106(0, c20369);
            long j2 = c20369.f65749;
            Object obj = c20369.f65761;
            C18012 c18013 = this.f76643;
            if (c18013 != null) {
                long jM42063 = c18013.m42063();
                C17306 c17306 = this.f76641;
                Object obj2 = this.f76643.f56178.f49112;
                C22485 c22485 = this.f76638;
                c17306.mo14105(obj2, c22485);
                long j3 = c22485.f72804 + jM42063;
                this.f76641.mo14103(0, c20369, 0L);
                if (j3 != c20369.f65749) {
                    j = j3;
                } else {
                    j = j2;
                }
            } else {
                j = j2;
            }
            Pair pairM14100 = abstractC4846.m14100(this.f76640, this.f76638, 0, j);
            Object obj3 = pairM14100.first;
            long jLongValue = ((Long) pairM14100.second).longValue();
            if (this.f76639) {
                c17306M40616 = this.f76641.m40618(abstractC4846);
            } else {
                c17306M40616 = C17306.m40616(abstractC4846, obj, obj3);
            }
            this.f76641 = c17306M40616;
            C18012 c18014 = this.f76643;
            if (c18014 != null && m52185(jLongValue)) {
                C15894 c15894 = c18014.f56178;
                Object obj4 = c15894.f49112;
                if (this.f76641.f53014 != null && obj4.equals(C17306.f53013)) {
                    obj4 = this.f76641.f53014;
                }
                c15894M37668 = c15894.m37668(obj4);
            }
            this.f76639 = true;
            this.f76636 = true;
            m23794(this.f76641);
            if (c15894M37668 != null) {
                C18012 c18015 = this.f76643;
                c18015.getClass();
                c18015.m42062(c15894M37668);
            }
        }
        c15894M37668 = null;
        this.f76639 = true;
        this.f76636 = true;
        m23794(this.f76641);
        if (c15894M37668 != null) {
            C18012 c18016 = this.f76643;
            c18016.getClass();
            c18016.m42062(c15894M37668);
        }
    }

    @Override // l.AbstractC23114
    /* JADX INFO: renamed from: ܽ */
    public final C15894 mo51298(C15894 c15894) {
        Object obj = c15894.f49112;
        if (this.f76641.f53014 != null && this.f76641.f53014.equals(obj)) {
            obj = C17306.f53013;
        }
        return c15894.m37668(obj);
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m52185(long j) {
        C18012 c18012 = this.f76643;
        int iMo14098 = this.f76641.mo14098(c18012.f56178.f49112);
        if (iMo14098 == -1) {
            return false;
        }
        C17306 c17306 = this.f76641;
        C22485 c22485 = this.f76638;
        c17306.mo14104(iMo14098, c22485, false);
        long j2 = c22485.f72801;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        c18012.m42064(j);
        return true;
    }
}
