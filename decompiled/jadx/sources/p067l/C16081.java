package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܳۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 69WC */
/* JADX INFO: loaded from: classes4.dex */
public final class C16081 extends AbstractC19435 {

    /* JADX INFO: renamed from: ۙ */
    public final String f47320;

    @Override // p067l.AbstractC19435
    /* JADX INFO: renamed from: ܽ */
    public final String mo36590() {
        return "querying service";
    }

    public C16081(C10738 c10738, String str) {
        super(c10738);
        this.f47320 = str;
    }

    @Override // p067l.AbstractC4012
    /* JADX INFO: renamed from: ۧ */
    public final String mo7991() {
        return C10965.m25286(new StringBuilder("ServiceResolver("), m7986() != null ? m7986().getName() : "", MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // p067l.AbstractC19435
    /* JADX INFO: renamed from: ֫ */
    public final C16416 mo36588(C16416 c16416) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (AbstractC12000 abstractC12000 : ((ConcurrentMapC12768) m7986().m24721()).values()) {
            c16416 = m7990(c16416, new C10382(abstractC12000.mo27466(), EnumC8055.CLASS_IN, false, C14760.f42088, abstractC12000.mo27470()), jCurrentTimeMillis);
        }
        return c16416;
    }

    @Override // p067l.AbstractC19435
    /* JADX INFO: renamed from: ۧ */
    public final C16416 mo36589(C16416 c16416) {
        return m7988(c16416, C20441.m46125(this.f47320, EnumC13420.TYPE_PTR, EnumC8055.CLASS_IN, false));
    }
}
