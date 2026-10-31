package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K185 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6668 extends AbstractC20780 {
    @Override // l.AbstractC20780
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean mo18200() {
        return true;
    }

    @Override // l.AbstractC20780
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String mo18202() {
        return "canceling";
    }

    public C6668(C8806 c8806) {
        super(c8806, 0);
        EnumC7394 enumC7394 = EnumC7394.f22763;
        m47580(enumC7394);
        m47577(enumC7394);
    }

    @Override // l.AbstractC1729
    /* JADX INFO: renamed from: ۧ */
    public final String mo5781() {
        return C9045.m23341(new StringBuilder("Canceler("), m5776() != null ? m5776().getName() : "", MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // l.AbstractC1729
    public final String toString() {
        return mo5781() + " state: " + m47578();
    }

    @Override // java.util.TimerTask
    public final boolean cancel() {
        m47579();
        return super.cancel();
    }

    @Override // l.AbstractC20780
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C14780 mo18199() {
        return new C14780(33792);
    }

    @Override // l.AbstractC20780
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14780 mo18196(C14780 c14780) throws IOException {
        Iterator it = m5776().m22739().m20682(EnumC5983.CLASS_ANY, true, m47581()).iterator();
        while (it.hasNext()) {
            c14780 = m5777(c14780, (C11254) null, (AbstractC22542) it.next());
        }
        return c14780;
    }

    @Override // l.AbstractC20780
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14780 mo18197(C20095 c20095, C14780 c14780) throws IOException {
        Iterator it = c20095.m46322(EnumC5983.CLASS_ANY, m47581(), m5776().m22739()).iterator();
        while (it.hasNext()) {
            c14780 = m5777(c14780, (C11254) null, (AbstractC22542) it.next());
        }
        return c14780;
    }

    @Override // l.AbstractC20780
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo18201() {
        m5776().m22754();
    }

    @Override // l.AbstractC20780
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo18198() {
        m47580(m47578().m19911());
        if (m47578().m19918()) {
            return;
        }
        cancel();
    }
}
