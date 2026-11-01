package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 19WG */
/* JADX INFO: loaded from: classes5.dex */
public final class C18764 extends AbstractC19435 {

    /* JADX INFO: renamed from: ۙ */
    public final C21467 f56067;

    public C18764(C10738 c10738, C21467 c21467) {
        super(c10738);
        this.f56067 = c21467;
        c21467.m48642(m7986());
        m7986().m24702(c21467, C20441.m46125(c21467.mo27470(), EnumC13420.TYPE_ANY, EnumC8055.CLASS_IN, false));
    }

    @Override // p067l.AbstractC4012
    /* JADX INFO: renamed from: ۧ */
    public final String mo7991() {
        return C10965.m25286(new StringBuilder("ServiceInfoResolver("), m7986() != null ? m7986().getName() : "", MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // java.util.TimerTask
    public final boolean cancel() {
        boolean zCancel = super.cancel();
        C21467 c21467 = this.f56067;
        if (!c21467.mo27484()) {
            m7986().m24700((InterfaceC18428) c21467);
        }
        return zCancel;
    }

    @Override // p067l.AbstractC19435
    /* JADX INFO: renamed from: ֫ */
    public final C16416 mo36588(C16416 c16416) throws IOException {
        C21467 c21467 = this.f56067;
        if (!c21467.mo27477()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C24069 c24069M24725 = m7986().m24725();
            String strMo27470 = c21467.mo27470();
            EnumC13420 enumC13420 = EnumC13420.TYPE_SRV;
            EnumC8055 enumC8055 = EnumC8055.CLASS_IN;
            c16416 = m7990(m7990(c16416, (AbstractC23793) c24069M24725.m53332(strMo27470, enumC13420, enumC8055), jCurrentTimeMillis), (AbstractC23793) m7986().m24725().m53332(c21467.mo27470(), EnumC13420.TYPE_TXT, enumC8055), jCurrentTimeMillis);
            if (c21467.mo27482().length() > 0) {
                Iterator it = m7986().m24725().m53335(c21467.mo27482(), EnumC13420.TYPE_A, enumC8055).iterator();
                while (it.hasNext()) {
                    c16416 = m7990(c16416, (AbstractC23793) ((AbstractC15351) it.next()), jCurrentTimeMillis);
                }
                Iterator it2 = m7986().m24725().m53335(c21467.mo27482(), EnumC13420.TYPE_AAAA, EnumC8055.CLASS_IN).iterator();
                while (it2.hasNext()) {
                    c16416 = m7990(c16416, (AbstractC23793) ((AbstractC15351) it2.next()), jCurrentTimeMillis);
                }
            }
        }
        return c16416;
    }

    @Override // p067l.AbstractC19435
    /* JADX INFO: renamed from: ۧ */
    public final C16416 mo36589(C16416 c16416) throws IOException {
        C21467 c21467 = this.f56067;
        if (c21467.mo27477()) {
            return c16416;
        }
        String strMo27470 = c21467.mo27470();
        EnumC13420 enumC13420 = EnumC13420.TYPE_SRV;
        EnumC8055 enumC8055 = EnumC8055.CLASS_IN;
        C16416 c16416M7988 = m7988(m7988(c16416, C20441.m46125(strMo27470, enumC13420, enumC8055, false)), C20441.m46125(c21467.mo27470(), EnumC13420.TYPE_TXT, enumC8055, false));
        return c21467.mo27482().length() > 0 ? m7988(m7988(c16416M7988, C20441.m46125(c21467.mo27482(), EnumC13420.TYPE_A, enumC8055, false)), C20441.m46125(c21467.mo27482(), EnumC13420.TYPE_AAAA, enumC8055, false)) : c16416M7988;
    }

    @Override // p067l.AbstractC19435
    /* JADX INFO: renamed from: ܽ */
    public final String mo36590() {
        StringBuilder sb = new StringBuilder("querying service info: ");
        C21467 c21467 = this.f56067;
        sb.append(c21467 != null ? c21467.mo27470() : "null");
        return sb.toString();
    }
}
