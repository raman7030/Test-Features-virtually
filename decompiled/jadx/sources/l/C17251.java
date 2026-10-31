package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 19WG */
/* JADX INFO: loaded from: classes5.dex */
public final class C17251 extends AbstractC17957 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20095 f52885;

    public C17251(C8806 c8806, C20095 c20095) {
        super(c8806);
        this.f52885 = c20095;
        c20095.m46326(m5776());
        m5776().m22732(c20095, C19015.m43857(c20095.mo25450(), EnumC11628.TYPE_ANY, EnumC5983.CLASS_IN, false));
    }

    @Override // l.AbstractC1729
    /* JADX INFO: renamed from: ۧ */
    public final String mo5781() {
        return C9045.m23341(new StringBuilder("ServiceInfoResolver("), m5776() != null ? m5776().getName() : "", MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // java.util.TimerTask
    public final boolean cancel() {
        boolean zCancel = super.cancel();
        C20095 c20095 = this.f52885;
        if (!c20095.mo25464()) {
            m5776().m22730((InterfaceC16897) c20095);
        }
        return zCancel;
    }

    @Override // l.AbstractC17957
    /* JADX INFO: renamed from: ֫ */
    public final C14780 mo34455(C14780 c14780) throws IOException {
        C20095 c20095 = this.f52885;
        if (!c20095.mo25457()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C22833 c22833M22755 = m5776().m22755();
            String strMo25450 = c20095.mo25450();
            EnumC11628 enumC11628 = EnumC11628.TYPE_SRV;
            EnumC5983 enumC5983 = EnumC5983.CLASS_IN;
            c14780 = m5780(m5780(c14780, (AbstractC22542) c22833M22755.m50942(strMo25450, enumC11628, enumC5983), jCurrentTimeMillis), (AbstractC22542) m5776().m22755().m50942(c20095.mo25450(), EnumC11628.TYPE_TXT, enumC5983), jCurrentTimeMillis);
            if (c20095.mo25462().length() > 0) {
                Iterator it = m5776().m22755().m50945(c20095.mo25462(), EnumC11628.TYPE_A, enumC5983).iterator();
                while (it.hasNext()) {
                    c14780 = m5780(c14780, (AbstractC22542) ((AbstractC13660) it.next()), jCurrentTimeMillis);
                }
                Iterator it2 = m5776().m22755().m50945(c20095.mo25462(), EnumC11628.TYPE_AAAA, EnumC5983.CLASS_IN).iterator();
                while (it2.hasNext()) {
                    c14780 = m5780(c14780, (AbstractC22542) ((AbstractC13660) it2.next()), jCurrentTimeMillis);
                }
            }
        }
        return c14780;
    }

    @Override // l.AbstractC17957
    /* JADX INFO: renamed from: ۧ */
    public final C14780 mo34456(C14780 c14780) throws IOException {
        C20095 c20095 = this.f52885;
        if (c20095.mo25457()) {
            return c14780;
        }
        String strMo25450 = c20095.mo25450();
        EnumC11628 enumC11628 = EnumC11628.TYPE_SRV;
        EnumC5983 enumC5983 = EnumC5983.CLASS_IN;
        C14780 c14780M5778 = m5778(m5778(c14780, C19015.m43857(strMo25450, enumC11628, enumC5983, false)), C19015.m43857(c20095.mo25450(), EnumC11628.TYPE_TXT, enumC5983, false));
        return c20095.mo25462().length() > 0 ? m5778(m5778(c14780M5778, C19015.m43857(c20095.mo25462(), EnumC11628.TYPE_A, enumC5983, false)), C19015.m43857(c20095.mo25462(), EnumC11628.TYPE_AAAA, enumC5983, false)) : c14780M5778;
    }

    @Override // l.AbstractC17957
    /* JADX INFO: renamed from: ܽ */
    public final String mo34457() {
        StringBuilder sb = new StringBuilder("querying service info: ");
        C20095 c20095 = this.f52885;
        sb.append(c20095 != null ? c20095.mo25450() : "null");
        return sb.toString();
    }
}
