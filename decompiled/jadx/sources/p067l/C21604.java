package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ܳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: O8BF */
/* JADX INFO: loaded from: classes5.dex */
public class C21604 extends AbstractC21614 {

    /* JADX INFO: renamed from: ۛ֫ */
    public static final /* synthetic */ int f68092 = 0;

    /* JADX INFO: renamed from: ۗ֫ */
    public AbstractC17043 f68093;

    /* JADX INFO: renamed from: ۬֫ */
    public C13146 f68096 = new C13146();

    /* JADX INFO: renamed from: ۤ֫ */
    public C6696 f68094 = new C6696();

    /* JADX INFO: renamed from: ۫֫ */
    public boolean f68095 = true;

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79719;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        if (m13488("streamMode")) {
            return C7050.m16203(R.string.MT_Protector, m13467("targetPath"));
        }
        return this.f68095 ? C7050.m16203(R.string.MT_Protector, C7050.m16224(R.string.MT_Protector).toLowerCase()) : C7050.m16203(R.string.MT_Protector, m13467("targetPath"));
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        m13472(R.string.MT_Protector);
        mo25203("...");
        if (m13488("streamMode")) {
            return;
        }
        m48819(m13471("ARG_MSG_FROM"), C7050.m16224(R.string.MT_Protector).toLowerCase());
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() throws Exception {
        AbstractC15599 abstractC15599;
        String[] strArrM13494 = m13494("ARG_PATHS");
        String strM13492 = m13492("targetPath");
        AbstractC5375 abstractC5375 = (AbstractC5375) m13462();
        AbstractC5375 abstractC5376 = (AbstractC5375) m13489();
        boolean zM13488 = m13488("streamMode");
        if (zM13488) {
            abstractC15599 = abstractC5375;
        } else {
            AbstractC17043 abstractC17043M38693 = C17853.f53278.m38693("");
            this.f68093 = abstractC17043M38693;
            abstractC17043M38693.m38666();
            this.f68096.m30072(abstractC5375, abstractC5376, strM13492, strArrM13494, this.f68093.mo25505(), new C16908(this));
            if (mo3924()) {
                return C18736.m42768();
            }
            m13472(R.string.MT_Protector);
            mo25203("...");
            m48822(false);
            m48819(C7050.m16224(R.string.MT_Protector).toLowerCase(), m13471("ARG_MSG_TO"));
            C21094 c21094 = new C21094(this.f68096.m30071());
            strArrM13494 = (String[]) C7480.stream(c21094.mo9708("/", true)).map(new C4251(2)).toArray(new C10204());
            this.f68094.m15290(new C22945(this));
            abstractC15599 = c21094;
        }
        C23615 c23615 = new C23615(this, zM13488);
        this.f68094.m15289(abstractC15599, abstractC5376, strArrM13494, strM13492, c23615);
        return m13481();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        if (c18736.m42773() && m13478(c18107)) {
            c18107.m41267();
        }
        List listM15288 = this.f68094.m15288();
        if (listM15288.isEmpty() || !m13461(c18108)) {
            return;
        }
        c18108.m41226((Collection) listM15288);
        c18108.m41241();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        AbstractC17043 abstractC17043 = this.f68093;
        if (abstractC17043 != null) {
            abstractC17043.mo25503();
        }
        C17127.m38756();
        AbstractC5375 abstractC5375M15292 = this.f68094.m15292();
        if (abstractC5375M15292 != null) {
            C17127.m38755(abstractC5375M15292.mo11732());
        }
    }
}
