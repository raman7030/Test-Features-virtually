package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۛܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AHA */
/* JADX INFO: loaded from: classes3.dex */
public class C6211 extends AbstractC6138 {

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public AbstractC3163 f19049;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f19050 = new ArrayList();

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76966;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector, m11517("targetPath"));
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector);
        mo11520("...");
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        if (m11542(c16560)) {
            ArrayList arrayList = this.f19050;
            if (arrayList.isEmpty()) {
                return;
            }
            c16560.m39000((Collection) arrayList);
            c16560.m39015();
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36595(this.f19049.mo9688());
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public final C17222 mo2780() throws Exception {
        String[] strArrM11558 = m11558("ARG_PATHS");
        String strM11556 = m11556("targetPath");
        this.f19049 = (AbstractC3163) m11526();
        int i = 0;
        while (i < strArrM11558.length) {
            if (mo1526()) {
                return C17222.m40521();
            }
            String str = strArrM11558[i];
            String strM24404 = C9523.m24404(str);
            mo11520(strM24404);
            i++;
            m11541(i, strArrM11558.length);
            try {
                this.f19049.mo9684(str, C9523.m24393(strM11556, strM24404));
                this.f19050.add(strM24404);
            } catch (Exception e) {
                throw new Exception(C4925.m14306(R.string.MT_Protector, strM24404), e);
            }
        }
        return C17222.m40520();
    }
}
