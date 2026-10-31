package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺۡ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: TAIM */
/* JADX INFO: loaded from: classes4.dex */
public final class C15841 extends AbstractC10128 {
    @Override // l.AbstractC10128
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo25409() {
        return true;
    }

    @Override // l.AbstractC10128
    /* JADX INFO: renamed from: ֫ */
    public final void mo5346(C16560 c16560) {
        boolean zM15156 = C5259.m15156();
        ApplicationC20075.f65010.edit().putBoolean("show_hidden_file", !zM15156).apply();
        if (!zM15156) {
            C21374.m48457(R.string.MT_Protector);
        } else {
            C21374.m48457(R.string.MT_Protector);
        }
        C15528.m36595((String) null);
    }

    @Override // l.AbstractC10128
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo25408() {
        return C5259.m15156();
    }
}
