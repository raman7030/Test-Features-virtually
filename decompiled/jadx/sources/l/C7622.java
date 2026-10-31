package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.۟ܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: G7TD */
/* JADX INFO: loaded from: classes4.dex */
public class C7622 extends AbstractC20250 {

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public C4553 f23565 = new C4553();

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76966;
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
        AbstractC13921 abstractC13921M11526 = m11526();
        AbstractC3163 abstractC3163 = (AbstractC3163) m11553();
        this.f23565.m13405();
        this.f23565.m13401(abstractC13921M11526, abstractC3163, strArrM11558, strM11556, new C13971(this));
        return m11545();
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        if (c17222.m40526() && m11542(c16560)) {
            c16560.m39041();
            c16560.m39015();
        }
        List listM13400 = this.f23565.m13400();
        if (listM13400.isEmpty() || !m11525(c16561)) {
            return;
        }
        c16561.m39000((Collection) listM13400);
        c16561.m39015();
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C4553 c4553 = this.f23565;
        AbstractC3163 abstractC3163M13404 = c4553.m13404();
        C15528.m36595(abstractC3163M13404.mo9688());
        AbstractC13921 abstractC13921M13403 = c4553.m13403();
        if (abstractC13921M13403 instanceof C2499) {
            C15528.m36596();
        } else if (abstractC13921M13403 instanceof AbstractC3163) {
            AbstractC3163 abstractC3163 = (AbstractC3163) abstractC13921M13403;
            if (abstractC3163.mo9688().equals(abstractC3163M13404.mo9688())) {
                return;
            }
            C15528.m36595(abstractC3163.mo9688());
        }
    }
}
