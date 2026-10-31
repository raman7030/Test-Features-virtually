package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.۬ܳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: MAIE */
/* JADX INFO: loaded from: classes4.dex */
public class C13182 extends AbstractC20250 {

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public C4553 f39407 = new C4553();

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76954;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector, m11556("descPath"));
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector);
        mo23259("...");
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public final C17222 mo2780() {
        String[] strArrM11558 = m11558("ARG_PATHS");
        String strM11556 = m11556("targetPath");
        this.f39407.m13401(m11526(), (AbstractC3163) m11553(), strArrM11558, strM11556, new C3305(this));
        return m11545();
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        if (c17222.m40526() && m11542(c16560)) {
            c16560.m39041();
        }
        List listM13400 = this.f39407.m13400();
        if (listM13400.isEmpty() || !m11525(c16561)) {
            return;
        }
        c16561.m39000((Collection) listM13400);
        c16561.m39015();
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        AbstractC3163 abstractC3163M13404 = this.f39407.m13404();
        if (abstractC3163M13404 != null) {
            C15528.m36595(abstractC3163M13404.mo9688());
        }
    }
}
