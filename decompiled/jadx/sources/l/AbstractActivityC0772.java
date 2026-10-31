package l;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import bin.mt.plugin.api.util.ResultCallback;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֨֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAPA */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC0772 extends AbstractActivityC3346 {

    /* JADX INFO: renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f2860 = 0;

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC13827 f2861;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public boolean f2862 = true;

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC13827 f2863;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC13827 f2864;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public C15545 f2865;

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public C4301 f2866;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public C12392 f2867;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC13827 f2868;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public View f2869;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC13827 f2870;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo2943(Exception exc);

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public abstract String mo2944();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int mo2945() {
        return R.string.MT_Protector;
    }

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int mo2946() {
        return -1;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public abstract String mo2947();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String mo2948() {
        return null;
    }

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public void mo2949() {
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract void mo2950(String str);

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public abstract String mo2951();

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public abstract String mo2952();

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public abstract boolean mo2953();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String mo2955() {
        return null;
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m10214();
        m10241(R.layout.MT_Protector);
        m10241(R.id.MT_Protector).setVisibility(8);
        C9762 c9762 = (C9762) m10241(R.id.MT_Protector);
        this.f10584 = c9762;
        m10227(c9762);
        C14624.m34924(this.f10584).setTextSize(17.0f);
        C11815 onBackPressedDispatcher = getOnBackPressedDispatcher();
        AbstractC0525 c3595 = new C3595(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m28891(c3595);
        ProgressBar progressBar = (ProgressBar) m10241(R.id.MT_Protector);
        C10392 c10392 = new C10392(this);
        c10392.m26205(false);
        c10392.m26203();
        progressBar.setIndeterminateDrawable(c10392);
        this.f2869 = m10241(R.id.MT_Protector);
        C12392 c12392 = (C12392) m10241(R.id.MT_Protector);
        this.f2867 = c12392;
        m10236(c12392);
        this.f2866 = new C4301(this, this.f2867);
        C15545 c15545 = new C15545(this, this.f2867, "code", new C9197(this));
        this.f2865 = c15545;
        c15545.m36683(this, this.f2866, ActivityC10714.class);
        if (this instanceof ActivityC16440) {
            this.f2865.m36685();
        }
        this.f2867.m30335(new C2184(0, progressBar));
        this.f2867.m30334(new C18412(this));
        this.f2867.m30338(new C19118(this));
        if (mo2953()) {
            setTitle(mo2951());
            this.f2865.m36677(mo2944());
            String strMo2948 = mo2948();
            if (strMo2948 != null) {
                this.f2865.m36687(strMo2948);
            }
            new C0066(this).m20274();
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        int iMo2946 = mo2946();
        if (iMo2946 == -1) {
            menu.findItem(R.id.MT_Protector).setVisible(false);
        } else {
            menu.findItem(R.id.MT_Protector).setTitle(iMo2946);
        }
        this.f2864 = (InterfaceMenuItemC13827) menu.findItem(R.id.MT_Protector);
        this.f2861 = (InterfaceMenuItemC13827) menu.findItem(R.id.MT_Protector);
        this.f2863 = (InterfaceMenuItemC13827) menu.findItem(R.id.MT_Protector);
        this.f2868 = (InterfaceMenuItemC13827) menu.findItem(R.id.MT_Protector);
        this.f2870 = (InterfaceMenuItemC13827) menu.findItem(R.id.MT_Protector);
        this.f2864.setEnabled(this.f2867.m30296());
        this.f2861.setEnabled(this.f2867.m30383());
        this.f2863.setEnabled(this.f2867.m30297());
        menu.findItem(R.id.MT_Protector).setChecked(this.f2867.m30441());
        menu.findItem(R.id.MT_Protector).setVisible(false);
        this.f2865.m36675(menu.findItem(R.id.MT_Protector));
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.more) {
            if (this.f2862) {
                this.f2862 = false;
                menuItem.getSubMenu().findItem(R.id.MT_Protector).setChecked(this.f2867.m30437());
            }
            this.f2868.setEnabled(this.f2867.m30374());
            this.f2870.setEnabled(this.f2867.m30514());
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m2937(false, (ResultCallback) null);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            mo2949();
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            if (itemId == R.id.MT_Protector) {
                m2942();
                return true;
            }
            this.f2865.m36690(menuItem);
            return true;
        }
        C12392 c12392 = this.f2867;
        c12392.m30407(!c12392.m30441());
        menuItem.setChecked(this.f2867.m30441());
        this.f2865.m36693();
        this.f2866.m12888();
        return true;
    }

    @Override // l.AbstractActivityC3346, l.ActivityC0737, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f2865.m36684()) {
            this.f2866.m12888();
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f2865.m36695();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m2935(AbstractActivityC0772 abstractActivityC0772) {
        abstractActivityC0772.m2937(true, (ResultCallback) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m2937(boolean z, ResultCallback resultCallback) {
        if (this.f2867.m30297()) {
            new C5006(this, z, resultCallback).m20274();
        } else if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // l.ActivityC2124
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo2954() {
        m2942();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public void m2942() {
        if (this.f2867.m30297()) {
            int i = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(this);
            c19258.m44436(mo2951());
            c19258.m44416(mo2945());
            c19258.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC8534(0, this));
            c19258.m44434(R.string.MT_Protector, new DialogInterfaceOnClickListenerC15588(0, this));
            c19258.m44438();
            return;
        }
        finish();
    }
}
