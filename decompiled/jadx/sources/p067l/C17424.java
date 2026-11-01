package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܺۡ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: TAIM */
/* JADX INFO: loaded from: classes4.dex */
public final class C17424 extends AbstractC11994 {
    @Override // p067l.AbstractC11994
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo27429() {
        return true;
    }

    @Override // p067l.AbstractC11994
    /* JADX INFO: renamed from: ֫ */
    public final void mo7575(C18107 c18107) {
        boolean zM17059 = C7367.m17059();
        ApplicationC21448.f67650.edit().putBoolean("show_hidden_file", !zM17059).apply();
        if (!zM17059) {
            C22682.m50793(R.string.MT_Protector);
        } else {
            C22682.m50793(R.string.MT_Protector);
        }
        C17127.m38755((String) null);
    }

    @Override // p067l.AbstractC11994
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo27428() {
        return C7367.m17059();
    }
}
