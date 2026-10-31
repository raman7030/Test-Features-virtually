package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: W9ZS */
/* JADX INFO: loaded from: classes4.dex */
public final class C9491 extends AbstractC20780 {
    @Override // l.AbstractC20780
    /* JADX INFO: renamed from: ᩻ */
    public final String mo18202() {
        return "probing";
    }

    public C9491(C8806 c8806) {
        super(c8806, AbstractC20780.m47575());
        EnumC7394 enumC7394 = EnumC7394.f22762;
        m47580(enumC7394);
        m47577(enumC7394);
    }

    @Override // l.AbstractC1729
    /* JADX INFO: renamed from: ۧ */
    public final String mo5781() {
        return C9045.m23341(new StringBuilder("Prober("), m5776() != null ? m5776().getName() : "", MotionUtils.EASING_TYPE_FORMAT_END);
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
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo18200() {
        return (m5776().m22750() || m5776().m22741()) ? false : true;
    }

    @Override // l.AbstractC20780
    /* JADX INFO: renamed from: ܿ */
    public final C14780 mo18199() {
        return new C14780(0);
    }

    @Override // l.AbstractC20780
    /* JADX INFO: renamed from: ֫ */
    public final C14780 mo18196(C14780 c14780) throws IOException {
        c14780.m35162(C19015.m43857(m5776().m22739().m20692(), EnumC11628.TYPE_ANY, EnumC5983.CLASS_IN, false));
        Iterator it = m5776().m22739().m20682(EnumC5983.CLASS_ANY, false, m47581()).iterator();
        while (it.hasNext()) {
            c14780 = m5779(c14780, (AbstractC22542) it.next());
        }
        return c14780;
    }

    @Override // l.AbstractC20780
    /* JADX INFO: renamed from: ֫ */
    public final C14780 mo18197(C20095 c20095, C14780 c14780) {
        String strMo25450 = c20095.mo25450();
        EnumC11628 enumC11628 = EnumC11628.TYPE_ANY;
        EnumC5983 enumC5983 = EnumC5983.CLASS_IN;
        return m5779(m5778(c14780, C19015.m43857(strMo25450, enumC11628, enumC5983, false)), new C15485(c20095.mo25450(), enumC5983, false, m47581(), c20095.mo25458(), c20095.mo25453(), c20095.mo25454(), m5776().m22739().m20692()));
    }

    @Override // l.AbstractC20780
    /* JADX INFO: renamed from: ᩷ */
    public final void mo18201() {
        m5776().m22754();
    }

    @Override // l.AbstractC20780
    /* JADX INFO: renamed from: ܽ */
    public final void mo18198() {
        m47580(m47578().m19911());
        if (m47578().m19915()) {
            return;
        }
        cancel();
        m5776().mo22738();
    }
}
