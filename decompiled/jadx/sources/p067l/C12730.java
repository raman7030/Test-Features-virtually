package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۧۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V9U9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12730 extends AbstractC4012 {

    /* JADX INFO: renamed from: ᩹ */
    public static InterfaceC4410 f35754 = C13128.m30023(C12730.class.getName());

    public C12730(C10738 c10738) {
        super(c10738);
    }

    @Override // p067l.AbstractC4012
    /* JADX INFO: renamed from: ۧ */
    public final String mo7991() {
        return C10965.m25286(new StringBuilder("RecordReaper("), m7986() != null ? m7986().getName() : "", MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (m7986().m24720() || m7986().m24711()) {
            return;
        }
        f35754.mo9190(mo7991(), "{}.run() JmDNS reaping cache");
        m7986().m24688();
    }
}
