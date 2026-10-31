package l;

import android.view.MenuItem;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩴۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R77X */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18499 implements InterfaceC14930, InterfaceC7305, InterfaceC16348, InterfaceC23206 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f57334;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f57335;

    public /* synthetic */ C18499(Object obj, Object obj2) {
        this.f57334 = obj;
        this.f57335 = obj2;
    }

    @Override // l.InterfaceC23206
    public /* synthetic */ void onCanceled() {
    }

    @Override // l.InterfaceC16348
    /* JADX INFO: renamed from: ֫ */
    public C3059 mo22666(String str, String str2, String str3) {
        return C0859.m3152((C0859) this.f57334, (AbstractC15440) this.f57335, str, str2, str3);
    }

    @Override // l.InterfaceC23206
    /* JADX INFO: renamed from: ֫ */
    public void mo8486(String str) {
        C5839.m16352((C5839) this.f57334, (AbstractActivityC3346) this.f57335, str);
    }

    @Override // l.InterfaceC14930
    public boolean onMenuItemClick(MenuItem menuItem) {
        InterfaceC5711 interfaceC5711 = (InterfaceC5711) this.f57334;
        C5732 c5732 = (C5732) this.f57335;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            ApplicationC20075.f65008.edit().putString("dsai", interfaceC5711.mo8896().flattenToString()).apply();
            C21374.m48457(R.string.MT_Protector);
            return true;
        }
        if (itemId != R.string.MT_Protector) {
            return true;
        }
        c5732.m16165(interfaceC5711);
        return true;
    }

    @Override // l.InterfaceC7305
    /* JADX INFO: renamed from: ֫ */
    public void mo10987(final C10211 c10211) {
        final C16560 c16560 = (C16560) this.f57334;
        final C2450 c2450 = (C2450) this.f57335;
        c10211.m25619();
        c16560.m39044().m39738(c16560, c16560.m39025(), new InterfaceC7305() { // from class: l.ۡ֡ܳ
            @Override // l.InterfaceC7305
            /* JADX INFO: renamed from: ֫ */
            public final void mo10987(C10211 c10212) {
                String name;
                String name2;
                c10212.m25619();
                C10211 c10213 = c10211;
                AbstractC15440 abstractC15440M25622 = c10213.m25622();
                AbstractC15440 abstractC15440M25623 = c10212.m25622();
                C2450 c2451 = c2450;
                boolean zM39064 = c2451.m7921().m39064();
                if (abstractC15440M25622.getName().equals(abstractC15440M25623.getName())) {
                    int i = R.string.MT_Protector;
                    name = C4925.m14306(zM39064 ? R.string.MT_Protector : R.string.MT_Protector, abstractC15440M25622.getName());
                    if (!zM39064) {
                        i = R.string.MT_Protector;
                    }
                    name2 = C4925.m14306(i, abstractC15440M25623.getName());
                } else {
                    name = abstractC15440M25622.getName();
                    name2 = abstractC15440M25623.getName();
                }
                C7309 c7309 = new C7309(c10213.m25622(), c10212.m25622(), name, name2, c2451.m7922(), c16560.m39044());
                if (!zM39064) {
                    c7309.m19594();
                }
                C12492.m30659(c2451.m7921(), c7309);
            }
        });
    }
}
