package p067l;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import bin.p000mt.plugin.api.util.ResultCallback;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֨֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAPA */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC3102 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ۘۧ */
    public static final /* synthetic */ int f5632 = 0;

    /* JADX INFO: renamed from: ۖۧ */
    public InterfaceMenuItemC1528 f5633;

    /* JADX INFO: renamed from: ۜۧ */
    public boolean f5634 = true;

    /* JADX INFO: renamed from: ۡۧ */
    public InterfaceMenuItemC1528 f5635;

    /* JADX INFO: renamed from: ۢۧ */
    public InterfaceMenuItemC1528 f5636;

    /* JADX INFO: renamed from: ܳۧ */
    public C17143 f5637;

    /* JADX INFO: renamed from: ܺۧ */
    public C6456 f5638;

    /* JADX INFO: renamed from: ܿۧ */
    public C14146 f5639;

    /* JADX INFO: renamed from: ᩳۧ */
    public InterfaceMenuItemC1528 f5640;

    /* JADX INFO: renamed from: ᩷ۧ */
    public View f5641;

    /* JADX INFO: renamed from: ᩻ۧ */
    public InterfaceMenuItemC1528 f5642;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo5272(Exception exc);

    /* JADX INFO: renamed from: ֫֫ */
    public abstract String mo5273();

    /* JADX INFO: renamed from: ۟ */
    public int mo5274() {
        return R.string.MT_Protector;
    }

    /* JADX INFO: renamed from: ۧ֫ */
    public int mo5275() {
        return -1;
    }

    /* JADX INFO: renamed from: ۨ */
    public abstract String mo5276();

    /* JADX INFO: renamed from: ܰ */
    public String mo5277() {
        return null;
    }

    /* JADX INFO: renamed from: ܳ֫ */
    public void mo5278() {
    }

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo5279(String str);

    /* JADX INFO: renamed from: ܽ֫ */
    public abstract String mo5280();

    /* JADX INFO: renamed from: ܿ֫ */
    public abstract String mo5281();

    /* JADX INFO: renamed from: ᩳ֫ */
    public abstract boolean mo5282();

    /* JADX INFO: renamed from: ᩺ */
    public String mo5284() {
        return null;
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m12250();
        m12277(R.layout.MT_Protector);
        m12277(R.id.MT_Protector).setVisibility(8);
        C1326 c1326 = (C1326) m12277(R.id.MT_Protector);
        this.f13392 = c1326;
        m12263(c1326);
        C16267.m37071(this.f13392).setTextSize(17.0f);
        C1428 onBackPressedDispatcher = getOnBackPressedDispatcher();
        AbstractC0868 c5785 = new C5785(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m30940(c5785);
        ProgressBar progressBar = (ProgressBar) m12277(R.id.MT_Protector);
        C12245 c12245 = new C12245(this);
        c12245.m28234(false);
        c12245.m28232();
        progressBar.setIndeterminateDrawable(c12245);
        this.f5641 = m12277(R.id.MT_Protector);
        C14146 c14146 = (C14146) m12277(R.id.MT_Protector);
        this.f5639 = c14146;
        m12272(c14146);
        this.f5638 = new C6456(this, this.f5639);
        C17143 c17143 = new C17143(this, this.f5639, "code", new C11110(this));
        this.f5637 = c17143;
        c17143.m38844(this, this.f5638, ActivityC12551.class);
        if (this instanceof ActivityC17993) {
            this.f5637.m38846();
        }
        this.f5639.m32399(new C4444(0, progressBar));
        this.f5639.m32398(new C19867(this));
        this.f5639.m32402(new C20538(this));
        if (mo5282()) {
            setTitle(mo5280());
            this.f5637.m38838(mo5273());
            String strMo5277 = mo5277();
            if (strMo5277 != null) {
                this.f5637.m38848(strMo5277);
            }
            new C2431(this).m22250();
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        int iMo5275 = mo5275();
        if (iMo5275 == -1) {
            menu.findItem(R.id.MT_Protector).setVisible(false);
        } else {
            menu.findItem(R.id.MT_Protector).setTitle(iMo5275);
        }
        this.f5636 = (InterfaceMenuItemC1528) menu.findItem(R.id.MT_Protector);
        this.f5633 = (InterfaceMenuItemC1528) menu.findItem(R.id.MT_Protector);
        this.f5635 = (InterfaceMenuItemC1528) menu.findItem(R.id.MT_Protector);
        this.f5640 = (InterfaceMenuItemC1528) menu.findItem(R.id.MT_Protector);
        this.f5642 = (InterfaceMenuItemC1528) menu.findItem(R.id.MT_Protector);
        this.f5636.setEnabled(this.f5639.m32360());
        this.f5633.setEnabled(this.f5639.m32447());
        this.f5635.setEnabled(this.f5639.m32361());
        menu.findItem(R.id.MT_Protector).setChecked(this.f5639.m32505());
        menu.findItem(R.id.MT_Protector).setVisible(false);
        this.f5637.m38836(menu.findItem(R.id.MT_Protector));
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.more) {
            if (this.f5634) {
                this.f5634 = false;
                menuItem.getSubMenu().findItem(R.id.MT_Protector).setChecked(this.f5639.m32501());
            }
            this.f5640.setEnabled(this.f5639.m32438());
            this.f5642.setEnabled(this.f5639.m32578());
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m5266(false, (ResultCallback) null);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            mo5278();
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            if (itemId == R.id.MT_Protector) {
                m5271();
                return true;
            }
            this.f5637.m38851(menuItem);
            return true;
        }
        C14146 c14146 = this.f5639;
        c14146.m32471(!c14146.m32505());
        menuItem.setChecked(this.f5639.m32505());
        this.f5637.m38854();
        this.f5638.m14752();
        return true;
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC3069, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f5637.m38845()) {
            this.f5638.m14752();
        }
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC0904, p067l.ActivityC3069, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f5637.m38856();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m5264(AbstractActivityC3102 abstractActivityC3102) {
        abstractActivityC3102.m5266(true, (ResultCallback) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m5266(boolean z, ResultCallback resultCallback) {
        if (this.f5639.m32361()) {
            new C7126(this, z, resultCallback).m22250();
        } else if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // p067l.ActivityC4388
    /* JADX INFO: renamed from: ᩴ */
    public final void mo5283() {
        m5271();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻֫ */
    public void m5271() {
        if (this.f5639.m32361()) {
            int i = DialogInterfaceC2564.f4230;
            C20671 c20671 = new C20671(this);
            c20671.m46730(mo5280());
            c20671.m46710(mo5274());
            c20671.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC10479(0, this));
            c20671.m46728(R.string.MT_Protector, new DialogInterfaceOnClickListenerC17183(0, this));
            c20671.m46732();
            return;
        }
        finish();
    }
}
