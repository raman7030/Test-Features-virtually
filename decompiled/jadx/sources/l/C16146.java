package l;

import android.content.Intent;
import android.view.MenuItem;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܺ᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C16146 implements InterfaceC2343, InterfaceC22001, InterfaceC12766, InterfaceC18862, InterfaceC14930, InterfaceC7875, InterfaceC3969 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49741;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f49742;

    public /* synthetic */ C16146(int i, Object obj) {
        this.f49741 = i;
        this.f49742 = obj;
    }

    @Override // l.InterfaceC2343
    /* JADX INFO: renamed from: ֫ */
    public void mo6264(int i) {
        AbstractC3817 abstractC3817;
        switch (this.f49741) {
            case 1:
                abstractC3817 = (C1766) this.f49742;
                break;
            default:
                abstractC3817 = (C5422) this.f49742;
                break;
        }
        abstractC3817.mo11538(i);
    }

    @Override // l.InterfaceC7875
    /* JADX INFO: renamed from: ֫ */
    public void mo6265(C21282 c21282) {
        ((C5921) this.f49742).f18159.suppressLayout(false);
    }

    @Override // l.InterfaceC3969
    /* JADX INFO: renamed from: ۧ */
    public String mo12011() {
        return C16475.m38802((C16475) this.f49742);
    }

    @Override // l.InterfaceC14930
    public boolean onMenuItemClick(MenuItem menuItem) {
        AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) this.f49742;
        if (menuItem.getItemId() != R.string.MT_Protector) {
            menuItem.setChecked(!menuItem.isChecked());
            ApplicationC20075.f65008.edit().putBoolean("kasb", menuItem.isChecked()).apply();
            return true;
        }
        Intent intent = new Intent(abstractActivityC3346, (Class<?>) ActivityC22062.class);
        intent.putExtra("fromDialog", true);
        abstractActivityC3346.startActivity(intent);
        return true;
    }

    @Override // l.InterfaceC12061
    /* JADX INFO: renamed from: ֫ */
    public void mo8487(AbstractC15440 abstractC15440) {
        abstractC15440.m36496((C10130) this.f49742);
    }

    @Override // l.InterfaceC22001
    /* JADX INFO: renamed from: ۧ */
    public InterfaceC2245 mo17661(int i) {
        return ((AbstractC15440) ((ArrayList) this.f49742).get(i)).mo23557("r");
    }

    @Override // l.InterfaceC18862
    /* JADX INFO: renamed from: ۧ */
    public void mo6267(AbstractC15440 abstractC15440) {
        new ViewOnClickListenerC7642((C16560) this.f49742).m20438(abstractC15440, false);
    }
}
