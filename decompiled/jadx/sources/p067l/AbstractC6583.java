package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88A4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6583 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f16997 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C5242 f16998;

    /* JADX INFO: renamed from: ֫ */
    public abstract C11948 mo15039(Long l2);

    public AbstractC6583(C5242 c5242) {
        this.f16998 = c5242;
    }

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList m15041() {
        return this.f16997;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15040() {
        C18534 c18534M7391;
        C19205[] c19205ArrM35978;
        C17600 c17600 = new C17600();
        while (true) {
            C13289 c13289M49353 = this.f16998.m49353(mo15039(c17600.getValue()), EnumC23347.ERROR_MORE_DATA, EnumC23347.ERROR_SUCCESS);
            AbstractC3782 abstractC3782M53194 = c13289M49353.m53194();
            if (abstractC3782M53194 != null && (c18534M7391 = abstractC3782M53194.m7391()) != null && (c19205ArrM35978 = c18534M7391.m35978()) != null) {
                for (C19205 c19205 : c19205ArrM35978) {
                    C17863 c17863 = (C17863) c19205;
                    C14629 c14629 = null;
                    if (c17863 != null) {
                        C24569 c24569M43741 = c17863.m43741();
                        String strM19735 = c24569M43741 == null ? null : c24569M43741.m19735();
                        int iM40571 = c17863.m40571();
                        C24569 c24569M40570 = c17863.m40570();
                        c14629 = new C14629(strM19735, iM40571, c24569M40570 != null ? c24569M40570.m19735() : null);
                    }
                    this.f16997.add(c14629);
                }
            }
            if (EnumC23347.ERROR_SUCCESS.m52006(c13289M49353.m37708())) {
                return;
            }
            Long lM53193 = c13289M49353.m53193();
            if (lM53193 == null) {
                throw new C4630("NetrShareEnum resume handle null.");
            }
            if (lM53193.longValue() == c17600.getValue().longValue()) {
                throw new C4630("NetrShareEnum resume handle not updated.");
            }
            c17600.m40081(lM53193);
        }
    }
}
