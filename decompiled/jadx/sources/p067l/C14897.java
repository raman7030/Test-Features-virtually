package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.۬ܳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: MAIE */
/* JADX INFO: loaded from: classes4.dex */
public class C14897 extends AbstractC21614 {

    /* JADX INFO: renamed from: ۗ֫ */
    public C6696 f42471 = new C6696();

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79706;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        return C7050.m16203(R.string.MT_Protector, m13492("descPath"));
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        m13472(R.string.MT_Protector);
        mo25203("...");
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() {
        String[] strArrM13494 = m13494("ARG_PATHS");
        String strM13492 = m13492("targetPath");
        this.f42471.m15289(m13462(), (AbstractC5375) m13489(), strArrM13494, strM13492, new C5510(this));
        return m13481();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        if (c18736.m42773() && m13478(c18107)) {
            c18107.m41267();
        }
        List listM15288 = this.f42471.m15288();
        if (listM15288.isEmpty() || !m13461(c18108)) {
            return;
        }
        c18108.m41226((Collection) listM15288);
        c18108.m41241();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        AbstractC5375 abstractC5375M15292 = this.f42471.m15292();
        if (abstractC5375M15292 != null) {
            C17127.m38755(abstractC5375M15292.mo11732());
        }
    }
}
