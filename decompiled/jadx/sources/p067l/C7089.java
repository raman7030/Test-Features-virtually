package p067l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import bin.p000mt.plus.R;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: l.ۙ᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FR */
/* JADX INFO: loaded from: classes3.dex */
public class C7089 extends AbstractC16003 implements InterfaceC2787 {

    /* JADX INFO: renamed from: ۛ */
    public static final C20125 f18481 = new C20125();

    /* JADX INFO: renamed from: ۗ */
    public C20856 f18482;

    /* JADX INFO: renamed from: ۙ */
    public AbstractC6620 f18483;

    /* JADX INFO: renamed from: ۤ */
    public C2798 f18484;

    /* JADX INFO: renamed from: ۫ */
    public C5946 f18485;

    /* JADX INFO: renamed from: ۬ */
    public String f18486;

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ֡ */
    public final boolean mo16322() {
        return false;
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ۜ */
    public final String mo16323() {
        return null;
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ܳ */
    public final int mo16324() {
        return R.drawable.MT_Protector;
    }

    public C7089() {
        super(R.layout.MT_Protector);
        setHasOptionsMenu(true);
        m36367("000000-0000-0000-0000-000000000001");
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ܺ */
    public final String mo16325() {
        return C7050.m16224(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC16003
    /* JADX INFO: renamed from: ᩷ */
    public final String mo16326() {
        return C7050.m16224(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC16003, p067l.ComponentCallbacksC11117
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C5946 c5946 = (C5946) new C6874(requireActivity()).m15765(C5946.class);
        this.f18485 = c5946;
        c5946.m13347().m4066(this, new InterfaceC3326() { // from class: l.ܶ᩺᩷
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                C7089.m16319(this.f51071, (C20856) obj);
            }
        });
        this.f18483 = new C23183(this, getChildFragmentManager());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m16319(C7089 c7089, C20856 c20856) {
        c7089.f18482 = c20856;
        c7089.f18486 = c20856.m47133();
        if (c7089.isHidden()) {
            return;
        }
        c7089.m36360(new C10442(c7089, false));
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onViewCreated(View view, Bundle bundle) {
        C2798 c2798 = (C2798) view.findViewById(R.id.MT_Protector);
        this.f18484 = c2798;
        c2798.m4406(this.f18483);
        this.f18484.m4405(new C23853(this));
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(this.f18484);
        tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C21842(this));
        C5946 c5946 = this.f18485;
        InterfaceC24784 viewLifecycleOwner = getViewLifecycleOwner();
        C2798 c2799 = this.f18484;
        C12826.requireNonNull(c2799);
        c5946.m13345(viewLifecycleOwner, new C9512(2, c2799));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m16320(C7089 c7089, boolean z, ActivityC18686 activityC18686) {
        if (!z) {
            activityC18686.setTitle(R.string.MT_Protector);
            activityC18686.m42585((CharSequence) c7089.f18486);
        } else {
            activityC18686.m42585((CharSequence) null);
        }
    }

    @Override // p067l.AbstractC16003, p067l.ComponentCallbacksC11117
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        m36360(new C10442(this, z));
    }

    @Override // p067l.AbstractC16003, p067l.ComponentCallbacksC11117
    public final void onResume() {
        super.onResume();
        if (isHidden()) {
            return;
        }
        m36360(new C10442(this, false));
    }

    @Override // p067l.InterfaceC2787
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4372() {
        if (this.f18484 == null) {
            return false;
        }
        InterfaceC6699 interfaceC6699M16809 = getChildFragmentManager().m16809("android:switcher:" + this.f18484.getId() + ":" + this.f18484.m4415());
        return (interfaceC6699M16809 instanceof InterfaceC2787) && ((InterfaceC2787) interfaceC6699M16809).mo4372();
    }

    @Override // p067l.ComponentCallbacksC11117
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        ActivityC18686 activityC18686 = (ActivityC18686) requireActivity();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            activityC18686.m42602();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            activityC18686.m42606();
            return true;
        }
        boolean z = false;
        if (itemId == R.id.more) {
            boolean z2 = this.f18482 != null && this.f18484.m4415() == 0;
            MenuItem menuItemFindItem = menuItem.getSubMenu().findItem(R.id.MT_Protector);
            if (z2 && !this.f18482.m47148().isEmpty()) {
                z = true;
            }
            menuItemFindItem.setVisible(z);
            menuItem.getSubMenu().findItem(R.id.MT_Protector).setVisible(z2);
            return true;
        }
        if (itemId == R.id.MT_Protector || itemId == R.id.MT_Protector) {
            this.f18485.m13318(itemId);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            activityC18686.m42590(false);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            C20856 c20856 = this.f18482;
            if (c20856 != null) {
                c20856.m38425(activityC18686);
            }
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            if (itemId == R.id.MT_Protector) {
                activityC18686.m42597();
                return true;
            }
            return super.onOptionsItemSelected(menuItem);
        }
        ActivityC18686 activityC18687 = (ActivityC18686) requireActivity();
        View viewM12252 = activityC18687.m12252(R.layout.MT_Protector);
        C0990 c0990 = (C0990) viewM12252.findViewById(R.id.MT_Protector);
        c0990.setChecked(ApplicationC21448.f67649.getBoolean("psri", true));
        C20671 c20671BuildDialog = activityC18687.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC22354(3, c0990));
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        C7204.m16545(c20671BuildDialog.m46732());
        return true;
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.MT_Protector, menu);
        MenuItem menuItemFindItem = ((InterfaceMenuC1983) menu).findItem(R.id.more).getSubMenu().findItem(R.id.MT_Protector);
        C7350 c7350M13354 = this.f18485.m13354();
        InterfaceC24784 viewLifecycleOwner = getViewLifecycleOwner();
        C12826.requireNonNull(menuItemFindItem);
        c7350M13354.m4066(viewLifecycleOwner, new C20733(menuItemFindItem));
    }
}
