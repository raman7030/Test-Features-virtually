package p067l;

import android.view.View;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֫۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes2.dex */
public final class C3989 implements InterfaceC17399 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ Main f8673;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ AbstractC17043 f8674;

    public C3989(AbstractC17043 abstractC17043, Main main) {
        this.f8674 = abstractC17043;
        this.f8673 = main;
    }

    @Override // p067l.InterfaceC17399
    /* JADX INFO: renamed from: ֫ */
    public final void mo7949(C7816 c7816, InterfaceC7796 interfaceC7796, C11169 c11169) {
        c7816.m18085(interfaceC7796, this.f8674, true);
    }

    @Override // p067l.InterfaceC17399
    /* JADX INFO: renamed from: ֫ */
    public final void mo7948(View view, C7816 c7816, InterfaceC7796 interfaceC7796, C11169 c11169) {
        C1898 c1898 = new C1898(this.f8673, view, 0);
        C0994 c0994M50638 = c1898.m50638();
        c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c1898.m50636(new C19950(interfaceC7796, c7816));
        c1898.m50639();
    }
}
