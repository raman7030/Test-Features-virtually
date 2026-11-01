package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻ۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: U9V0 */
/* JADX INFO: loaded from: classes.dex */
public final class C24799 extends AbstractC22118 {
    @Override // p067l.AbstractC22118
    /* JADX INFO: renamed from: ᩻ */
    public final String mo20150() {
        return "announcing";
    }

    public C24799(C10738 c10738) {
        super(c10738, AbstractC22118.m49903());
        EnumC9396 enumC9396 = EnumC9396.f25671;
        m49908(enumC9396);
        m49905(enumC9396);
    }

    @Override // p067l.AbstractC4012
    /* JADX INFO: renamed from: ۧ */
    public final String mo7991() {
        return C10965.m25286(new StringBuilder("Announcer("), m7986() != null ? m7986().getName() : "", MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // p067l.AbstractC4012
    public final String toString() {
        return mo7991() + " state: " + m49906();
    }

    @Override // java.util.TimerTask
    public final boolean cancel() {
        m49907();
        return super.cancel();
    }

    @Override // p067l.AbstractC22118
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo20148() {
        return (m7986().m24720() || m7986().m24711()) ? false : true;
    }

    @Override // p067l.AbstractC22118
    /* JADX INFO: renamed from: ܿ */
    public final C16416 mo20147() {
        return new C16416(33792);
    }

    @Override // p067l.AbstractC22118
    /* JADX INFO: renamed from: ֫ */
    public final C16416 mo20144(C16416 c16416) throws IOException {
        Iterator it = m7986().m24709().m22662(EnumC8055.CLASS_ANY, true, m49909()).iterator();
        while (it.hasNext()) {
            c16416 = m7987(c16416, (C13065) null, (AbstractC23793) it.next());
        }
        return c16416;
    }

    @Override // p067l.AbstractC22118
    /* JADX INFO: renamed from: ֫ */
    public final C16416 mo20145(C21467 c21467, C16416 c16416) throws IOException {
        Iterator it = c21467.m48638(EnumC8055.CLASS_ANY, m49909(), m7986().m24709()).iterator();
        while (it.hasNext()) {
            c16416 = m7987(c16416, (C13065) null, (AbstractC23793) it.next());
        }
        return c16416;
    }

    @Override // p067l.AbstractC22118
    /* JADX INFO: renamed from: ᩷ */
    public final void mo20149() {
        m7986().m24724();
    }

    @Override // p067l.AbstractC22118
    /* JADX INFO: renamed from: ܽ */
    public final void mo20146() {
        m49908(m49906().m21884());
        if (m49906().m21889()) {
            return;
        }
        cancel();
        m7986().mo24723();
    }
}
