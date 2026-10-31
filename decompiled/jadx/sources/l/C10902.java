package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۧۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V9U9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10902 extends AbstractC1729 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static InterfaceC2148 f32776 = C11321.m27962(C10902.class.getName());

    public C10902(C8806 c8806) {
        super(c8806);
    }

    @Override // l.AbstractC1729
    /* JADX INFO: renamed from: ۧ */
    public final String mo5781() {
        return C9045.m23341(new StringBuilder("RecordReaper("), m5776() != null ? m5776().getName() : "", MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (m5776().m22750() || m5776().m22741()) {
            return;
        }
        f32776.mo7095(mo5781(), "{}.run() JmDNS reaping cache");
        m5776().m22718();
    }
}
