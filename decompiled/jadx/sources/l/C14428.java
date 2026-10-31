package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܳۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 69WC */
/* JADX INFO: loaded from: classes4.dex */
public final class C14428 extends AbstractC17957 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f44226;

    @Override // l.AbstractC17957
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String mo34457() {
        return "querying service";
    }

    public C14428(C8806 c8806, String str) {
        super(c8806);
        this.f44226 = str;
    }

    @Override // l.AbstractC1729
    /* JADX INFO: renamed from: ۧ */
    public final String mo5781() {
        return C9045.m23341(new StringBuilder("ServiceResolver("), m5776() != null ? m5776().getName() : "", MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // l.AbstractC17957
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14780 mo34455(C14780 c14780) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (AbstractC10134 abstractC10134 : ((ConcurrentMapC10942) m5776().m22751()).values()) {
            c14780 = m5780(c14780, new C8431(abstractC10134.mo25446(), EnumC5983.CLASS_IN, false, C13038.f39042, abstractC10134.mo25450()), jCurrentTimeMillis);
        }
        return c14780;
    }

    @Override // l.AbstractC17957
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14780 mo34456(C14780 c14780) {
        return m5778(c14780, C19015.m43857(this.f44226, EnumC11628.TYPE_PTR, EnumC5983.CLASS_IN, false));
    }
}
