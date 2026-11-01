package p067l;

import android.content.Intent;
import android.view.MenuItem;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܺ᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17714 implements InterfaceC4595, InterfaceC23278, InterfaceC14501, InterfaceC20295, InterfaceC1583, InterfaceC1233, InterfaceC6141 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f52907;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f52908;

    public /* synthetic */ C17714(int i, Object obj) {
        this.f52907 = i;
        this.f52908 = obj;
    }

    @Override // p067l.InterfaceC4595
    /* JADX INFO: renamed from: ֫ */
    public void mo8466(int i) {
        AbstractC5996 abstractC5996;
        switch (this.f52907) {
            case 1:
                abstractC5996 = (C4047) this.f52908;
                break;
            default:
                abstractC5996 = (C7522) this.f52908;
                break;
        }
        abstractC5996.mo13474(i);
    }

    @Override // p067l.InterfaceC1233
    /* JADX INFO: renamed from: ֫ */
    public void mo8467(C1898 c1898) {
        ((C7996) this.f52908).f21013.suppressLayout(false);
    }

    @Override // p067l.InterfaceC6141
    /* JADX INFO: renamed from: ۧ */
    public String mo13935() {
        return C18026.m41028((C18026) this.f52908);
    }

    @Override // p067l.InterfaceC1583
    public boolean onMenuItemClick(MenuItem menuItem) {
        AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) this.f52908;
        if (menuItem.getItemId() != R.string.MT_Protector) {
            menuItem.setChecked(!menuItem.isChecked());
            ApplicationC21448.f67649.edit().putBoolean("kasb", menuItem.isChecked()).apply();
            return true;
        }
        Intent intent = new Intent(abstractActivityC5549, (Class<?>) ActivityC23336.class);
        intent.putExtra("fromDialog", true);
        abstractActivityC5549.startActivity(intent);
        return true;
    }

    @Override // p067l.InterfaceC13831
    /* JADX INFO: renamed from: ֫ */
    public void mo10534(AbstractC17043 abstractC17043) {
        abstractC17043.m38654((C11996) this.f52908);
    }

    @Override // p067l.InterfaceC23278
    /* JADX INFO: renamed from: ۧ */
    public InterfaceC4502 mo19606(int i) {
        return ((AbstractC17043) ((ArrayList) this.f52908).get(i)).mo25508("r");
    }

    @Override // p067l.InterfaceC20295
    /* JADX INFO: renamed from: ۧ */
    public void mo8469(AbstractC17043 abstractC17043) {
        new ViewOnClickListenerC9632((C18107) this.f52908).m22417(abstractC17043, false);
    }
}
