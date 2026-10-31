package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 22BV */
/* JADX INFO: loaded from: classes3.dex */
public final class C6026 extends AbstractC10128 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16773 f18497;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6026(C16773 c16773) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f18497 = c16773;
    }

    @Override // l.AbstractC10128
    /* JADX INFO: renamed from: ֫ */
    public final void mo5346(C16560 c16560) {
        boolean zM39064 = c16560.m39064();
        ApplicationC20075.f65008.edit().putString(zM39064 ? "home_path_left" : "home_path_right", this.f18497.m39741()).apply();
        ApplicationC20075.f65010.edit().putString(zM39064 ? "load_path_left" : "load_path_right", "0").apply();
        C21374.m48457(R.string.MT_Protector);
    }

    @Override // l.AbstractC10128
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo9841() {
        return !this.f18497.mo39505();
    }
}
