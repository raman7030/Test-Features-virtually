package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩷᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7ER */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC21209 extends AbstractActivityC0772 {
    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "CommonPasswordsTextEditor";
    }

    @Override // l.AbstractActivityC0772
    /* JADX INFO: renamed from: ۨ */
    public final String mo2947() {
        return "CommonPasswords.txt";
    }

    @Override // l.AbstractActivityC0772
    /* JADX INFO: renamed from: ᩳ֫ */
    public final boolean mo2953() {
        return true;
    }

    @Override // l.AbstractActivityC0772
    /* JADX INFO: renamed from: ܽ֫ */
    public final String mo2951() {
        return getString(R.string.MT_Protector);
    }

    @Override // l.AbstractActivityC0772
    /* JADX INFO: renamed from: ֫֫ */
    public final String mo2944() {
        int i = C7017.f21654;
        return "syntax:INTERNAL:".concat("CommonPasswords");
    }

    @Override // l.AbstractActivityC0772
    /* JADX INFO: renamed from: ܿ֫ */
    public final String mo2952() {
        List<C12511> listM26220 = C10395.m26220();
        ArrayList arrayList = new ArrayList();
        synchronized (listM26220) {
            for (C12511 c12511 : listM26220) {
                arrayList.add(new C12511(c12511.f37581, c12511.f37580));
            }
        }
        return C24030.m52874(arrayList);
    }

    @Override // l.AbstractActivityC0772
    /* JADX INFO: renamed from: ܽ */
    public final void mo2950(String str) {
        C10395.m26218(C24030.m52875(str));
    }

    @Override // l.AbstractActivityC0772
    /* JADX INFO: renamed from: ֫ */
    public final void mo2943(Exception exc) {
        if (exc instanceof C7097) {
            this.f2867.m30372(((C7097) exc).m19099() - 1);
        }
    }
}
