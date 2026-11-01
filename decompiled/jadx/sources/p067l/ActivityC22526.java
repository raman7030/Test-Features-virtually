package p067l;

import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩷᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7ER */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC22526 extends AbstractActivityC3102 {
    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "CommonPasswordsTextEditor";
    }

    @Override // p067l.AbstractActivityC3102
    /* JADX INFO: renamed from: ۨ */
    public final String mo5276() {
        return "CommonPasswords.txt";
    }

    @Override // p067l.AbstractActivityC3102
    /* JADX INFO: renamed from: ᩳ֫ */
    public final boolean mo5282() {
        return true;
    }

    @Override // p067l.AbstractActivityC3102
    /* JADX INFO: renamed from: ܽ֫ */
    public final String mo5280() {
        return getString(R.string.MT_Protector);
    }

    @Override // p067l.AbstractActivityC3102
    /* JADX INFO: renamed from: ֫֫ */
    public final String mo5273() {
        int i = C9038.f24535;
        return "syntax:INTERNAL:".concat("CommonPasswords");
    }

    @Override // p067l.AbstractActivityC3102
    /* JADX INFO: renamed from: ܿ֫ */
    public final String mo5281() {
        List<C14259> listM28249 = C12248.m28249();
        ArrayList arrayList = new ArrayList();
        synchronized (listM28249) {
            for (C14259 c14259 : listM28249) {
                arrayList.add(new C14259(c14259.f40605, c14259.f40604));
            }
        }
        return C25207.m55280(arrayList);
    }

    @Override // p067l.AbstractActivityC3102
    /* JADX INFO: renamed from: ܽ */
    public final void mo5279(String str) {
        C12248.m28247(C25207.m55281(str));
    }

    @Override // p067l.AbstractActivityC3102
    /* JADX INFO: renamed from: ֫ */
    public final void mo5272(Exception exc) {
        if (exc instanceof C9114) {
            this.f5639.m32436(((C9114) exc).m21057() - 1);
        }
    }
}
