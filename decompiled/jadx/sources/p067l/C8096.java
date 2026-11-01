package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۛۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 22BV */
/* JADX INFO: loaded from: classes3.dex */
public final class C8096 extends AbstractC11994 {

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C18310 f21353;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8096(C18310 c18310) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f21353 = c18310;
    }

    @Override // p067l.AbstractC11994
    /* JADX INFO: renamed from: ֫ */
    public final void mo7575(C18107 c18107) {
        boolean zM41290 = c18107.m41290();
        ApplicationC21448.f67649.edit().putString(zM41290 ? "home_path_left" : "home_path_right", this.f21353.m41982()).apply();
        ApplicationC21448.f67650.edit().putString(zM41290 ? "load_path_left" : "load_path_right", "0").apply();
        C22682.m50793(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC11994
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo11888() {
        return !this.f21353.mo41741();
    }
}
