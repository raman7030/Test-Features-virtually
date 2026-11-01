package p067l;

import android.view.MenuItem;
import android.view.View;
import bin.p000mt.plus.R;
import com.alipay.sdk.app.OpenAuthTask;

/* JADX INFO: renamed from: l.۟֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes3.dex */
public final class C9157 implements InterfaceC17399 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC19370 f24805;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C18107 f24806;

    public C9157(C18107 c18107, InterfaceC19370 interfaceC19370) {
        this.f24806 = c18107;
        this.f24805 = interfaceC19370;
    }

    @Override // p067l.InterfaceC17399
    /* JADX INFO: renamed from: ֫ */
    public final void mo7949(C7816 c7816, InterfaceC7796 interfaceC7796, C11169 c11169) {
        C18107 c18107 = this.f24806;
        InterfaceC19370 interfaceC19370 = this.f24805;
        if (c11169 != null) {
            c11169.m25785(c18107, interfaceC19370);
        } else if (C11840.m27140(c18107, interfaceC19370)) {
            C11245.m26044(interfaceC19370, OpenAuthTask.Duplex);
            C11840.m27139(c18107, interfaceC19370, interfaceC7796.mo10963());
        } else {
            C20966.m47304(c18107, interfaceC19370, new C21875(interfaceC19370, c7816, interfaceC7796));
        }
    }

    @Override // p067l.InterfaceC17399
    /* JADX INFO: renamed from: ֫ */
    public final void mo7948(View view, final C7816 c7816, final InterfaceC7796 interfaceC7796, final C11169 c11169) {
        final String strMo39128 = this.f24805.mo39128();
        C1898 c1898 = new C1898(this.f24806.m41282(), view, 0);
        C0994 c0994M50638 = c1898.m50638();
        c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setEnabled(!strMo39128.isEmpty());
        if (interfaceC7796 != null) {
            c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        final C18107 c18107 = this.f24806;
        c1898.m50636(new InterfaceC1583() { // from class: l.ܰ֨ܿ
            @Override // p067l.InterfaceC1583
            public final boolean onMenuItemClick(MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                InterfaceC7796 interfaceC7797 = interfaceC7796;
                if (itemId != R.string.MT_Protector) {
                    if (itemId != R.string.MT_Protector) {
                        return true;
                    }
                    c7816.m18084(interfaceC7797);
                    return true;
                }
                C11169 c111610 = c11169;
                String str = strMo39128;
                if (c111610 != null) {
                    C4463.m9377(str, c111610);
                } else {
                    C4463.m9376(str, interfaceC7797);
                }
                C18107 c18108 = c18107;
                c18108.m41278();
                c18108.m41252().m41278();
                C22682.m50793(R.string.MT_Protector);
                return true;
            }
        });
        c1898.m50639();
    }
}
