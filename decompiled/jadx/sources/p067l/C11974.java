package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۤۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8EC */
/* JADX INFO: loaded from: classes3.dex */
public final class C11974 {

    /* JADX INFO: renamed from: ֫ */
    public final C16055 f33389;

    /* JADX INFO: renamed from: ۧ */
    public final C18107 f33390;

    public C11974(C18107 c18107) {
        this.f33390 = c18107;
        C16055 c16055 = new C16055(c18107.m41282());
        c16055.m36554();
        c16055.m36551();
        this.f33389 = c16055;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27410(C13985 c13985) {
        String name = c13985.getName();
        C16055 c16055 = this.f33389;
        c16055.m36538(name, (ViewOnLongClickListenerC11837) null);
        c16055.m36528(R.string.MT_Protector, c13985.m31784().getName());
        if (c13985.getSize() != -1) {
            c16055.m36549(c13985.getSize()).m21096(8);
        }
        c16055.m36530(c13985.m31783());
        c16055.m36542();
        C8126.m18836(c16055.m36543(), this.f33390, c13985);
    }
}
