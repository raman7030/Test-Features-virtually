package p067l;

import android.view.MenuItem;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ᩴۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R77X */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19950 implements InterfaceC1583, InterfaceC9311, InterfaceC17905, InterfaceC24424 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f60556;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f60557;

    public /* synthetic */ C19950(Object obj, Object obj2) {
        this.f60556 = obj;
        this.f60557 = obj2;
    }

    @Override // p067l.InterfaceC24424
    public /* synthetic */ void onCanceled() {
    }

    @Override // p067l.InterfaceC17905
    /* JADX INFO: renamed from: ֫ */
    public C5276 mo24636(String str, String str2, String str3) {
        return C3185.m5466((C3185) this.f60556, (AbstractC17043) this.f60557, str, str2, str3);
    }

    @Override // p067l.InterfaceC24424
    /* JADX INFO: renamed from: ֫ */
    public void mo10533(String str) {
        C7918.m18277((C7918) this.f60556, (AbstractActivityC5549) this.f60557, str);
    }

    @Override // p067l.InterfaceC1583
    public boolean onMenuItemClick(MenuItem menuItem) {
        InterfaceC7796 interfaceC7796 = (InterfaceC7796) this.f60556;
        C7816 c7816 = (C7816) this.f60557;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            ApplicationC21448.f67649.edit().putString("dsai", interfaceC7796.mo10963().flattenToString()).apply();
            C22682.m50793(R.string.MT_Protector);
            return true;
        }
        if (itemId != R.string.MT_Protector) {
            return true;
        }
        c7816.m18084(interfaceC7796);
        return true;
    }

    @Override // p067l.InterfaceC9311
    /* JADX INFO: renamed from: ֫ */
    public void mo12963(final C12073 c12073) {
        final C18107 c18107 = (C18107) this.f60556;
        final C4697 c4697 = (C4697) this.f60557;
        c12073.m27641();
        c18107.m41270().m41979(c18107, c18107.m41251(), new InterfaceC9311() { // from class: l.ۡ֡ܳ
            @Override // p067l.InterfaceC9311
            /* JADX INFO: renamed from: ֫ */
            public final void mo12963(C12073 c12074) {
                String name;
                String name2;
                c12074.m27641();
                C12073 c12075 = c12073;
                AbstractC17043 abstractC17043M27644 = c12075.m27644();
                AbstractC17043 abstractC17043M27645 = c12074.m27644();
                C4697 c4698 = c4697;
                boolean zM41290 = c4698.m9969().m41290();
                if (abstractC17043M27644.getName().equals(abstractC17043M27645.getName())) {
                    int i = R.string.MT_Protector;
                    name = C7050.m16203(zM41290 ? R.string.MT_Protector : R.string.MT_Protector, abstractC17043M27644.getName());
                    if (!zM41290) {
                        i = R.string.MT_Protector;
                    }
                    name2 = C7050.m16203(i, abstractC17043M27645.getName());
                } else {
                    name = abstractC17043M27644.getName();
                    name2 = abstractC17043M27645.getName();
                }
                C9315 c9315 = new C9315(c12075.m27644(), c12074.m27644(), name, name2, c4698.m9970(), c18107.m41270());
                if (!zM41290) {
                    c9315.m21562();
                }
                C14241.m32724(c4698.m9969(), c9315);
            }
        });
    }
}
