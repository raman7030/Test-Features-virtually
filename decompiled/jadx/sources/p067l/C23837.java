package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 8459 */
/* JADX INFO: loaded from: classes.dex */
public final class C23837 extends C15854 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractC21195 f75737;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C24507 f75738;

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3801(C10471 c10471) {
        m52905(c10471, c10471.f28960, this.f75737);
        super.mo3801(c10471);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3805(C11281 c11281) {
        C13818 c13818 = c11281.f31438;
        if (c13818.f20407.f20405 == EnumC3600.f7354) {
            m52905(c11281, c13818, this.f75737);
        }
        super.mo3805(c11281);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3617(C7650 c7650) {
        AbstractC21195 abstractC21195 = this.f75737;
        this.f75737 = c7650.f20027;
        try {
            super.mo3617(c7650);
        } finally {
            this.f75737 = abstractC21195;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52905(AbstractC7257 abstractC7257, AbstractC7783 abstractC7783, AbstractC21195 abstractC21195) {
        C24507 c24507;
        AbstractC6462 abstractC6462M19502 = abstractC21195.f20406;
        while (abstractC6462M19502 != AbstractC6462.f16700) {
            Iterator it = abstractC6462M19502.f16705.mo17983().mo22457(abstractC7783.f20408, null, EnumC3620.NON_RECURSIVE).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c24507 = this.f75738;
                if (zHasNext) {
                    AbstractC7783 abstractC7784 = (AbstractC7783) it.next();
                    if (abstractC7783.f20405 == abstractC7784.f20405 && c24507.f77549.m19490(c24507.f77549.m19459(abstractC7783.f20406), c24507.f77549.m19459(abstractC7784.f20406)) && abstractC7783 != abstractC7784 && (abstractC7783.mo18003() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) != (abstractC7784.mo18003() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) && (abstractC7783.mo18003() & 2147483648L) == 0 && (abstractC7784.mo18003() & 2147483648L) == 0) {
                        if ((abstractC7784.mo18003() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
                            abstractC7783 = abstractC7784;
                        }
                        if (abstractC7783.f20406.mo14812()) {
                            return;
                        }
                        C23623 c23623 = c24507.f77557;
                        AbstractC7783 abstractC7783M17991 = abstractC7783.m17991();
                        AbstractC7783 abstractC7783M17992 = abstractC7783.m17991();
                        C13370 c13370 = C13665.f38450;
                        c23623.m9352(abstractC7257, C8300.m19122(abstractC7783M17991, new C13370("compiler", "synthetic.name.conflict", abstractC7783, abstractC7783M17992)));
                        return;
                    }
                }
            }
            abstractC6462M19502 = c24507.f77549.m19502(abstractC6462M19502);
        }
    }

    public C23837(C24507 c24507) {
        this.f75738 = c24507;
    }
}
