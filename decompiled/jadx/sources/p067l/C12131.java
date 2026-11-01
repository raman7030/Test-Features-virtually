package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۤۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes4.dex */
public class C12131 extends AbstractC8202 {

    /* JADX INFO: renamed from: ܺ֫ */
    public List f33906 = new ArrayList();

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79710;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        return C7050.m16203(R.string.MT_Protector, m13453("output"));
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        m13472(R.string.MT_Protector);
        mo13456("...");
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() throws Exception {
        ArrayList arrayList;
        EnumC22742 enumC22742;
        AbstractC17043 abstractC17043M13451 = m13451("output");
        String[] strArrM13494 = m13494("ARG_PATHS");
        String strM13492 = m13492("password");
        int iM13484 = m13484("level");
        boolean zM13488 = m13488("headerEncryption");
        boolean zM13489 = m13488("deleteSources");
        long jM13463 = m13463("splitSize");
        boolean zM134810 = m13488("replaceExisting");
        C4045 c4045M55251 = C25187.m55251((AbstractC5996) this, strArrM13494, false);
        if (mo3924()) {
            return C18736.m42768();
        }
        C23412 c23412M52082 = C23412.m52082(abstractC17043M13451, zM134810 || jM13463 != -1);
        AbstractC17043 abstractC17043M52089 = c23412M52082.m52089();
        ArrayList arrayList2 = new ArrayList();
        C23611 c23611 = new C23611();
        c23611.f75147 = c4045M55251.f8893.size();
        c23611.f75145 = iM13484;
        c23611.f75146 = zM13488;
        try {
            try {
                C14893.m34098(c23611, new C14142(this, jM13463, abstractC17043M52089, arrayList2, strM13492, c4045M55251));
                if (mo3924()) {
                    C25187.m55252(arrayList2);
                    abstractC17043M52089.mo29990();
                    return C18736.m42768();
                }
                if (jM13463 == -1) {
                    enumC22742 = EnumC22742.NONE;
                } else {
                    enumC22742 = EnumC22742.SEVEN_ZIP;
                }
                this.f33906 = c23412M52082.m52088(arrayList2, enumC22742);
                if (mo3924()) {
                    return C18736.m42768();
                }
                if (zM13489) {
                    C25187.m55254(this, strArrM13494, this.f33906, c4045M55251.m8104());
                }
                return C18736.m42767();
            } catch (Exception e) {
                e = e;
                arrayList = arrayList2;
                C25187.m55252(arrayList);
                abstractC17043M52089.mo29990();
                throw e;
            }
        } catch (Exception e2) {
            e = e2;
            arrayList = arrayList2;
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        boolean zM13488 = m13488("compressToAnother");
        C25187.m55255(c18736, zM13488, zM13488 ? m13461(c18108) : m13478(c18107), c18107, c18108, C25187.m55250(this.f33906));
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        C17127.m38756();
    }
}
