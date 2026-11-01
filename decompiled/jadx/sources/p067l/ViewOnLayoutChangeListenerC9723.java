package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.TextView;
import bin.p000mt.plus.R;
import com.umeng.analytics.pro.C0719o;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes4.dex */
public class ViewOnLayoutChangeListenerC9723 extends AbstractActivityC5549 implements InterfaceC11085, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ۖۧ */
    public static final /* synthetic */ int f26851 = 0;

    /* JADX INFO: renamed from: ۜۧ */
    public int f26852;

    /* JADX INFO: renamed from: ۡۧ */
    public C2977 f26853;

    /* JADX INFO: renamed from: ܳۧ */
    public View f26855;

    /* JADX INFO: renamed from: ܺۧ */
    public ViewOnClickListenerC17789 f26856;

    /* JADX INFO: renamed from: ܿۧ */
    public TextView f26857;

    /* JADX INFO: renamed from: ᩳۧ */
    public BinderC13767 f26858;

    /* JADX INFO: renamed from: ᩷ۧ */
    public C7741 f26859;

    /* JADX INFO: renamed from: ۢۧ */
    public ArrayList f26854 = new ArrayList();

    /* JADX INFO: renamed from: ᩻ۧ */
    public ServiceConnection f26860 = new ServiceConnectionC24475(this);

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "TerminalActivity";
    }

    @Override // p067l.ActivityC4388
    /* JADX INFO: renamed from: ۘ */
    public final int mo9138() {
        SharedPreferences sharedPreferences = ApplicationC21448.f67650;
        return (sharedPreferences == null || !sharedPreferences.getBoolean("term_keep_dark", true)) ? -100 : 2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22701(AbstractActivityC5549 abstractActivityC5549, boolean z) {
        Window window = abstractActivityC5549.getWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            window.setStatusBarColor(C1059.m14953(abstractActivityC5549.getResources(), R.color.MT_Protector, abstractActivityC5549.getTheme()));
        } else {
            window.setStatusBarColor(C1059.m14953(abstractActivityC5549.getResources(), R.color.MT_Protector, abstractActivityC5549.getTheme()));
            View decorView = window.getDecorView();
            int i2 = i >= 26 ? C0719o.a.f2919y : 8192;
            if (z) {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (~i2));
            } else {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | i2);
            }
        }
        if (i >= 27) {
            window.setNavigationBarColor(C1059.m14953(abstractActivityC5549.getResources(), R.color.MT_Protector, abstractActivityC5549.getTheme()));
        }
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.f13389 = false;
        setTheme(C19552.m44401());
        super.onCreate(bundle);
        m12277(R.layout.MT_Protector);
        m12277(R.string.MT_Protector);
        boolean zM50539 = C22553.m50539(this);
        C13097.f36813 = zM50539;
        m22701(this, zM50539);
        runOnUiThread(new RunnableC19811(3, this, new RunnableC5700(0, this)));
        this.f26856 = new ViewOnClickListenerC17789(this, this);
        this.f26859 = C10423.m24117(this, new C9387(6, this));
        View viewM12277 = m12277(R.id.MT_Protector);
        this.f26855 = viewM12277;
        this.f26857 = (TextView) viewM12277.findViewById(R.id.MT_Protector);
        this.f26855.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC15087(0, this));
        this.f26855.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC12721(5, this));
        C0886.m5546(this, new Intent(this, (Class<?>) ServiceC24495.class));
        bindService(new Intent(this, (Class<?>) ServiceC24495.class), this.f26860, 64);
        C2977 c2977 = (C2977) m12277(R.id.MT_Protector);
        this.f26853 = c2977;
        c2977.addOnLayoutChangeListener(this);
        m22718();
        this.f26853.m4989(new C12406(this));
        C6371.m14581((AbstractActivityC5549) this, (Runnable) new RunnableC22041(8, this), false);
    }

    /* JADX INFO: renamed from: ܳ */
    public static void m22719(ViewOnLayoutChangeListenerC9723 viewOnLayoutChangeListenerC9723) {
        viewOnLayoutChangeListenerC9723.m22718();
        AbstractC1499 abstractC1499M6357 = viewOnLayoutChangeListenerC9723.m6357();
        SharedPreferences sharedPreferences = ApplicationC21448.f67650;
        abstractC1499M6357.mo17377((sharedPreferences == null || !sharedPreferences.getBoolean("term_keep_dark", true)) ? -100 : 2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m22702(ViewOnLayoutChangeListenerC9723 viewOnLayoutChangeListenerC9723) {
        BinderC13767 binderC13767 = viewOnLayoutChangeListenerC9723.f26858;
        if (binderC13767 != null) {
            String strM31375 = binderC13767.m31375();
            if (!TextUtils.isEmpty(strM31375)) {
                viewOnLayoutChangeListenerC9723.f26858.m31372(strM31375.length() - strM31375.lastIndexOf("\n"));
                viewOnLayoutChangeListenerC9723.f26858.m31364(viewOnLayoutChangeListenerC9723.f26857.getText().toString() + "\r");
            }
        }
        viewOnLayoutChangeListenerC9723.f26855.setVisibility(8);
    }

    /* JADX INFO: renamed from: ۨ */
    private void m22718() {
        int i;
        try {
            i = Integer.parseInt(ApplicationC21448.f67650.getString("term_font_size", "12"));
        } catch (Exception unused) {
            i = 12;
        }
        this.f26852 = i;
        this.f26853.m4986(i);
        this.f26853.m4987(C16448.m37366());
    }

    @Override // p067l.ActivityC0904, p067l.ActivityC3069, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        runOnUiThread(new RunnableC19811(3, this, new RunnableC7712(0, this)));
    }

    @Override // p067l.InterfaceC11085
    /* JADX INFO: renamed from: ֫ */
    public final void mo22726(View view) {
        C1898 c1898 = new C1898(this, view, 0);
        C0994 c0994M50638 = c1898.m50638();
        BinderC13767 binderC13767 = this.f26858;
        if (binderC13767 != null) {
            ServiceC24495 serviceC24495 = binderC13767.f38916;
            if (serviceC24495.f77500 != null || serviceC24495.f77499 != null) {
                c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            } else {
                c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            }
            c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        }
        c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        BinderC13767 binderC13768 = this.f26858;
        if (binderC13768 != null && binderC13768.m31370()) {
            c0994M50638.add(0, android.R.string.paste, 0, android.R.string.paste).setIcon(R.drawable.MT_Protector).setEnabled(this.f26853.m4991());
        }
        c1898.m50636(new C14417(0, this));
        c0994M50638.setOptionalIconsVisible(true);
        c1898.m50639();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22704(final ViewOnLayoutChangeListenerC9723 viewOnLayoutChangeListenerC9723, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 17039371) {
            viewOnLayoutChangeListenerC9723.f26853.m4994();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            viewOnLayoutChangeListenerC9723.f26859.m17869(ActivityC6391.class);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C20671 c20671BuildDialog = viewOnLayoutChangeListenerC9723.buildDialog();
            c20671BuildDialog.m46727(R.string.MT_Protector);
            c20671BuildDialog.m46710(R.string.MT_Protector);
            c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC23805(0, viewOnLayoutChangeListenerC9723));
            c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671BuildDialog.m46732();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C20671 c20671BuildDialog2 = viewOnLayoutChangeListenerC9723.buildDialog();
            c20671BuildDialog2.m46727(R.string.MT_Protector);
            c20671BuildDialog2.m46710(R.string.MT_Protector);
            c20671BuildDialog2.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC21541(2, viewOnLayoutChangeListenerC9723));
            c20671BuildDialog2.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671BuildDialog2.m46734(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩶᩸ۢ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    int i2 = ViewOnLayoutChangeListenerC9723.f26851;
                    this.f68613.finish();
                }
            });
            c20671BuildDialog2.m46732();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            ServiceC24495 serviceC24495 = viewOnLayoutChangeListenerC9723.f26858.f38916;
            if (serviceC24495.f77500 != null || serviceC24495.f77499 != null) {
                menuItem.setIcon(R.drawable.MT_Protector);
                viewOnLayoutChangeListenerC9723.f26858.m31374(true);
            } else {
                menuItem.setIcon(R.drawable.MT_Protector);
                viewOnLayoutChangeListenerC9723.f26858.m31368(true);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public static void m22724(ViewOnLayoutChangeListenerC9723 viewOnLayoutChangeListenerC9723) {
        BinderC13767 binderC13767 = viewOnLayoutChangeListenerC9723.f26858;
        if (binderC13767 != null) {
            binderC13767.m31373(viewOnLayoutChangeListenerC9723.f26853, ApplicationC21448.f67650.getBoolean("term_create_session_as_root", false));
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public static /* synthetic */ void m22725(ViewOnLayoutChangeListenerC9723 viewOnLayoutChangeListenerC9723) {
        BinderC13767 binderC13767 = viewOnLayoutChangeListenerC9723.f26858;
        if (binderC13767 == null || binderC13767.m31369(viewOnLayoutChangeListenerC9723.f26853)) {
            viewOnLayoutChangeListenerC9723.finish();
        }
    }

    @Override // p067l.InterfaceC11085
    /* JADX INFO: renamed from: ܳ */
    public final void mo22727() {
        BinderC13767 binderC13767 = this.f26858;
        if (binderC13767 == null) {
            return;
        }
        final CharSequence[] charSequenceArrM31377 = binderC13767.m31377();
        C20671 c20671BuildDialog = buildDialog();
        c20671BuildDialog.m46723(charSequenceArrM31377, this.f26858.m31376(), new DialogInterfaceOnClickListenerC11521(this, 2));
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֨᩸ۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ViewOnLayoutChangeListenerC9723.m22721(this.f7801);
            }
        });
        c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        dialogInterfaceC2564M46732.m3861().setOnClickListener(new View.OnClickListener() { // from class: l.۠᩸ۢ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewOnLayoutChangeListenerC9723.m22708(this.f28757, dialogInterfaceC2564M46732, view);
            }
        });
        dialogInterfaceC2564M46732.m3856().setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: l.ܶ᩸ۢ
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
                ViewOnLayoutChangeListenerC9723.m22710(this.f50520, charSequenceArrM31377, dialogInterfaceC2564M46732, i);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m22703(ViewOnLayoutChangeListenerC9723 viewOnLayoutChangeListenerC9723, DialogInterface dialogInterface, int i) {
        viewOnLayoutChangeListenerC9723.f26858.m31365(viewOnLayoutChangeListenerC9723.f26853, i);
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m22721(ViewOnLayoutChangeListenerC9723 viewOnLayoutChangeListenerC9723) {
        viewOnLayoutChangeListenerC9723.f26858.m31367(viewOnLayoutChangeListenerC9723.f26853, ApplicationC21448.f67650.getBoolean("term_create_session_as_root", false), false, viewOnLayoutChangeListenerC9723.f26852);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22708(ViewOnLayoutChangeListenerC9723 viewOnLayoutChangeListenerC9723, DialogInterfaceC2564 dialogInterfaceC2564, View view) {
        C1898 c1898 = new C1898(viewOnLayoutChangeListenerC9723, view, 0);
        C0994 c0994M50638 = c1898.m50638();
        if (C4359.m9006() != null) {
            c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setEnabled(viewOnLayoutChangeListenerC9723.f26858.m31378() > 1);
        c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c1898.m50636(new C7041(viewOnLayoutChangeListenerC9723, dialogInterfaceC2564));
        c1898.m50639();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22707(ViewOnLayoutChangeListenerC9723 viewOnLayoutChangeListenerC9723, DialogInterfaceC2564 dialogInterfaceC2564, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            viewOnLayoutChangeListenerC9723.f26858.m31367(viewOnLayoutChangeListenerC9723.f26853, ApplicationC21448.f67650.getBoolean("term_create_session_as_root", false), true, viewOnLayoutChangeListenerC9723.f26852);
            dialogInterfaceC2564.dismiss();
        } else if (itemId == R.string.MT_Protector) {
            viewOnLayoutChangeListenerC9723.f26858.m31361();
            viewOnLayoutChangeListenerC9723.finish();
        } else if (itemId == R.string.MT_Protector) {
            viewOnLayoutChangeListenerC9723.f26858.m31371();
            dialogInterfaceC2564.dismiss();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m22710(ViewOnLayoutChangeListenerC9723 viewOnLayoutChangeListenerC9723, CharSequence[] charSequenceArr, DialogInterfaceC2564 dialogInterfaceC2564, int i) {
        C8382 c8382 = new C8382(viewOnLayoutChangeListenerC9723, viewOnLayoutChangeListenerC9723, i, charSequenceArr, dialogInterfaceC2564);
        c8382.m7749(R.string.MT_Protector);
        c8382.m7752(viewOnLayoutChangeListenerC9723.f26858.m31360(i));
        c8382.m7756();
        c8382.m7755();
        c8382.m7757();
    }

    /* JADX INFO: renamed from: ۜ */
    public static void m22713(final ViewOnLayoutChangeListenerC9723 viewOnLayoutChangeListenerC9723) {
        final String stringExtra;
        viewOnLayoutChangeListenerC9723.f26858.m31366(viewOnLayoutChangeListenerC9723.f26853, ApplicationC21448.f67650.getBoolean("term_create_session_as_root", false));
        if (viewOnLayoutChangeListenerC9723.m12279() || (stringExtra = viewOnLayoutChangeListenerC9723.getIntent().getStringExtra("PATH")) == null || stringExtra.isEmpty()) {
            return;
        }
        C4081.f8987.submit(new Runnable() { // from class: l.᩸᩸ۢ
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnLayoutChangeListenerC9723.m22706(this.f72714, stringExtra);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m22706(ViewOnLayoutChangeListenerC9723 viewOnLayoutChangeListenerC9723, String str) {
        for (int i = 15; i > 0; i--) {
            BinderC13767 binderC13767 = viewOnLayoutChangeListenerC9723.f26858;
            if (binderC13767 == null) {
                return;
            }
            if (!TextUtils.isEmpty(binderC13767.m31375())) {
                viewOnLayoutChangeListenerC9723.runOnUiThread(new RunnableC15185(2, viewOnLayoutChangeListenerC9723, new File(str).getPath()));
                return;
            }
            SystemClock.sleep(200L);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m22717(ViewOnLayoutChangeListenerC9723 viewOnLayoutChangeListenerC9723, String str) {
        viewOnLayoutChangeListenerC9723.f26857.setText("cd " + C11164.m25756(str));
        viewOnLayoutChangeListenerC9723.f26855.setVisibility(0);
        TextView textView = (TextView) viewOnLayoutChangeListenerC9723.f26855.findViewById(R.id.MT_Protector);
        textView.setTag(5);
        new RunnableC15757(viewOnLayoutChangeListenerC9723, textView).run();
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC0904, p067l.ActivityC3069, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unbindService(this.f26860);
        BinderC13767 binderC13767 = this.f26858;
        if (binderC13767 != null) {
            binderC13767.m31362(0, 0, false);
        }
        BinderC13767 binderC13768 = this.f26858;
        if (binderC13768 != null && !binderC13768.m31380()) {
            C0886.m5546(this, new Intent(this, (Class<?>) ServiceC24495.class).setAction("bin.mt.term.TerminalService.ACTION_EXIT"));
        }
        C7050.m16206(500L, new RunnableC2671(2));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m22705(ViewOnLayoutChangeListenerC9723 viewOnLayoutChangeListenerC9723, Runnable runnable) {
        if (viewOnLayoutChangeListenerC9723.f26858 != null) {
            runnable.run();
        } else {
            viewOnLayoutChangeListenerC9723.f26854.add(runnable);
        }
    }
}
