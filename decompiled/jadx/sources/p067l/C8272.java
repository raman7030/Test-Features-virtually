package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۛܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AHA */
/* JADX INFO: loaded from: classes3.dex */
public class C8272 extends AbstractC8202 {

    /* JADX INFO: renamed from: ۖ֫ */
    public AbstractC5375 f21912;

    /* JADX INFO: renamed from: ܺ֫ */
    public ArrayList f21913 = new ArrayList();

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79718;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        return C7050.m16203(R.string.MT_Protector, m13453("targetPath"));
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        m13472(R.string.MT_Protector);
        mo13456("...");
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        if (m13478(c18107)) {
            ArrayList arrayList = this.f21913;
            if (arrayList.isEmpty()) {
                return;
            }
            c18107.m41226((Collection) arrayList);
            c18107.m41241();
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        C17127.m38755(this.f21912.mo11732());
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() throws Exception {
        String[] strArrM13494 = m13494("ARG_PATHS");
        String strM13492 = m13492("targetPath");
        this.f21912 = (AbstractC5375) m13462();
        int i = 0;
        while (i < strArrM13494.length) {
            if (mo3924()) {
                return C18736.m42768();
            }
            String str = strArrM13494[i];
            String strM26414 = C11419.m26414(str);
            mo13456(strM26414);
            i++;
            m13477(i, strArrM13494.length);
            try {
                this.f21912.mo11728(str, C11419.m26403(strM13492, strM26414));
                this.f21913.add(strM26414);
            } catch (Exception e) {
                throw new Exception(C7050.m16203(R.string.MT_Protector, strM26414), e);
            }
        }
        return C18736.m42767();
    }
}
