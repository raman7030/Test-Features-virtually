package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: W9ZS */
/* JADX INFO: loaded from: classes4.dex */
public final class C11389 extends AbstractC22118 {
    @Override // p067l.AbstractC22118
    /* JADX INFO: renamed from: ᩻ */
    public final String mo20150() {
        return "probing";
    }

    public C11389(C10738 c10738) {
        super(c10738, AbstractC22118.m49903());
        EnumC9396 enumC9396 = EnumC9396.f25674;
        m49908(enumC9396);
        m49905(enumC9396);
    }

    @Override // p067l.AbstractC4012
    /* JADX INFO: renamed from: ۧ */
    public final String mo7991() {
        return C10965.m25286(new StringBuilder("Prober("), m7986() != null ? m7986().getName() : "", MotionUtils.EASING_TYPE_FORMAT_END);
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
        return new C16416(0);
    }

    @Override // p067l.AbstractC22118
    /* JADX INFO: renamed from: ֫ */
    public final C16416 mo20144(C16416 c16416) throws IOException {
        c16416.m37309(C20441.m46125(m7986().m24709().m22672(), EnumC13420.TYPE_ANY, EnumC8055.CLASS_IN, false));
        Iterator it = m7986().m24709().m22662(EnumC8055.CLASS_ANY, false, m49909()).iterator();
        while (it.hasNext()) {
            c16416 = m7989(c16416, (AbstractC23793) it.next());
        }
        return c16416;
    }

    @Override // p067l.AbstractC22118
    /* JADX INFO: renamed from: ֫ */
    public final C16416 mo20145(C21467 c21467, C16416 c16416) {
        String strMo27470 = c21467.mo27470();
        EnumC13420 enumC13420 = EnumC13420.TYPE_ANY;
        EnumC8055 enumC8055 = EnumC8055.CLASS_IN;
        return m7989(m7988(c16416, C20441.m46125(strMo27470, enumC13420, enumC8055, false)), new C17086(c21467.mo27470(), enumC8055, false, m49909(), c21467.mo27478(), c21467.mo27473(), c21467.mo27474(), m7986().m24709().m22672()));
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
        if (m49906().m21888()) {
            return;
        }
        cancel();
        m7986().mo24708();
    }
}
