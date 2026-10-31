package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 8459 */
/* JADX INFO: loaded from: classes.dex */
public final class C22589 extends C14190 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC19810 f73010;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23294 f73011;

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1388(C8526 c8526) {
        m50563(c8526, c8526.f26045, this.f73010);
        super.mo1388(c8526);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1392(C9378 c9378) {
        C12048 c12048 = c9378.f28489;
        if (c12048.f17561.f17559 == EnumC1296.f4582) {
            m50563(c9378, c12048, this.f73010);
        }
        super.mo1392(c9378);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1215(C5557 c5557) {
        AbstractC19810 abstractC19810 = this.f73010;
        this.f73010 = c5557.f17186;
        try {
            super.mo1215(c5557);
        } finally {
            this.f73010 = abstractC19810;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50563(AbstractC5144 abstractC5144, AbstractC5698 abstractC5698, AbstractC19810 abstractC19810) {
        C23294 c23294;
        AbstractC4308 abstractC4308M17562 = abstractC19810.f17560;
        while (abstractC4308M17562 != AbstractC4308.f13885) {
            Iterator it = abstractC4308M17562.f13890.mo16064().mo20477(abstractC5698.f17562, null, EnumC1317.NON_RECURSIVE).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c23294 = this.f73011;
                if (zHasNext) {
                    AbstractC5698 abstractC5699 = (AbstractC5698) it.next();
                    if (abstractC5698.f17559 == abstractC5699.f17559 && c23294.f74804.m17550(c23294.f74804.m17519(abstractC5698.f17560), c23294.f74804.m17519(abstractC5699.f17560)) && abstractC5698 != abstractC5699 && (abstractC5698.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) != (abstractC5699.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) && (abstractC5698.mo16084() & 2147483648L) == 0 && (abstractC5699.mo16084() & 2147483648L) == 0) {
                        if ((abstractC5699.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
                            abstractC5698 = abstractC5699;
                        }
                        if (abstractC5698.f17560.mo12948()) {
                            return;
                        }
                        C22364 c22364 = c23294.f74812;
                        AbstractC5698 abstractC5698M16072 = abstractC5698.m16072();
                        AbstractC5698 abstractC5698M16073 = abstractC5698.m16072();
                        C11576 c11576 = C11886.f35440;
                        c22364.m7273(abstractC5144, C6241.m17184(abstractC5698M16072, new C11576("compiler", "synthetic.name.conflict", abstractC5698, abstractC5698M16073)));
                        return;
                    }
                }
            }
            abstractC4308M17562 = c23294.f74804.m17562(abstractC4308M17562);
        }
    }

    public C22589(C23294 c23294) {
        this.f73011 = c23294;
    }
}
