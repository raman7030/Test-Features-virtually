package l;

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
import bin.mt.plus.R;
import com.umeng.analytics.pro.o;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes4.dex */
public class ViewOnLayoutChangeListenerC7738 extends AbstractActivityC3346 implements InterfaceC9171, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f23938 = 0;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public int f23939;

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public C0640 f23940;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public View f23942;

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC16225 f23943;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public TextView f23944;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public BinderC11993 f23945;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public C5652 f23946;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f23941 = new ArrayList();

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public ServiceConnection f23947 = new ServiceConnectionC23260(this);

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "TerminalActivity";
    }

    @Override // l.ActivityC2124
    /* JADX INFO: renamed from: ۘ */
    public final int mo7027() {
        SharedPreferences sharedPreferences = ApplicationC20075.f65010;
        return (sharedPreferences == null || !sharedPreferences.getBoolean("term_keep_dark", true)) ? -100 : 2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20721(AbstractActivityC3346 abstractActivityC3346, boolean z) {
        Window window = abstractActivityC3346.getWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            window.setStatusBarColor(C4369.m13089(abstractActivityC3346.getResources(), R.color.MT_Protector, abstractActivityC3346.getTheme()));
        } else {
            window.setStatusBarColor(C4369.m13089(abstractActivityC3346.getResources(), R.color.MT_Protector, abstractActivityC3346.getTheme()));
            View decorView = window.getDecorView();
            int i2 = i >= 26 ? o.a.y : 8192;
            if (z) {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (~i2));
            } else {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | i2);
            }
        }
        if (i >= 27) {
            window.setNavigationBarColor(C4369.m13089(abstractActivityC3346.getResources(), R.color.MT_Protector, abstractActivityC3346.getTheme()));
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.f10581 = false;
        setTheme(C18080.m42142());
        super.onCreate(bundle);
        m10241(R.layout.MT_Protector);
        m10241(R.string.MT_Protector);
        boolean zM48208 = C21238.m48208(this);
        C11288.f33814 = zM48208;
        m20721(this, zM48208);
        runOnUiThread(new RunnableC18352(3, this, new RunnableC3505(0, this)));
        this.f23943 = new ViewOnClickListenerC16225(this, this);
        this.f23946 = C8474.m22148(this, new C7385(6, this));
        View viewM10241 = m10241(R.id.MT_Protector);
        this.f23942 = viewM10241;
        this.f23944 = (TextView) viewM10241.findViewById(R.id.MT_Protector);
        this.f23942.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC13382(0, this));
        this.f23942.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC10893(5, this));
        C0881.m3232(this, new Intent(this, (Class<?>) ServiceC23281.class));
        bindService(new Intent(this, (Class<?>) ServiceC23281.class), this.f23947, 64);
        C0640 c0640 = (C0640) m10241(R.id.MT_Protector);
        this.f23940 = c0640;
        c0640.addOnLayoutChangeListener(this);
        m20738();
        this.f23940.m2649(new C10561(this));
        C4211.m12705((AbstractActivityC3346) this, (Runnable) new RunnableC20699(8, this), false);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m20739(ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7738) {
        viewOnLayoutChangeListenerC7738.m20738();
        AbstractC13246 abstractC13246M4113 = viewOnLayoutChangeListenerC7738.m4113();
        SharedPreferences sharedPreferences = ApplicationC20075.f65010;
        abstractC13246M4113.mo15466((sharedPreferences == null || !sharedPreferences.getBoolean("term_keep_dark", true)) ? -100 : 2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20722(ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7738) {
        BinderC11993 binderC11993 = viewOnLayoutChangeListenerC7738.f23945;
        if (binderC11993 != null) {
            String strM29320 = binderC11993.m29320();
            if (!TextUtils.isEmpty(strM29320)) {
                viewOnLayoutChangeListenerC7738.f23945.m29317(strM29320.length() - strM29320.lastIndexOf("\n"));
                viewOnLayoutChangeListenerC7738.f23945.m29309(viewOnLayoutChangeListenerC7738.f23944.getText().toString() + "\r");
            }
        }
        viewOnLayoutChangeListenerC7738.f23942.setVisibility(8);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m20738() {
        int i;
        try {
            i = Integer.parseInt(ApplicationC20075.f65010.getString("term_font_size", "12"));
        } catch (Exception unused) {
            i = 12;
        }
        this.f23939 = i;
        this.f23940.m2646(i);
        this.f23940.m2647(C14814.m35218());
    }

    @Override // l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        runOnUiThread(new RunnableC18352(3, this, new RunnableC5622(0, this)));
    }

    @Override // l.InterfaceC9171
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo20746(View view) {
        C21282 c21282 = new C21282(this, view, 0);
        C3060 c3060M48304 = c21282.m48304();
        BinderC11993 binderC11993 = this.f23945;
        if (binderC11993 != null) {
            ServiceC23281 serviceC23281 = binderC11993.f35906;
            if (serviceC23281.f74756 != null || serviceC23281.f74755 != null) {
                c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            } else {
                c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            }
            c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
            c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        }
        c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        BinderC11993 binderC11994 = this.f23945;
        if (binderC11994 != null && binderC11994.m29315()) {
            c3060M48304.add(0, android.R.string.paste, 0, android.R.string.paste).setIcon(R.drawable.MT_Protector).setEnabled(this.f23940.m2651());
        }
        c21282.m48302(new C12677(0, this));
        c3060M48304.setOptionalIconsVisible(true);
        c21282.m48305();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20724(final ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7738, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 17039371) {
            viewOnLayoutChangeListenerC7738.f23940.m2654();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            viewOnLayoutChangeListenerC7738.f23946.m15941(ActivityC4232.class);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C19258 c19258BuildDialog = viewOnLayoutChangeListenerC7738.buildDialog();
            c19258BuildDialog.m44433(R.string.MT_Protector);
            c19258BuildDialog.m44416(R.string.MT_Protector);
            c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC22555(0, viewOnLayoutChangeListenerC7738));
            c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258BuildDialog.m44438();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            C19258 c19258BuildDialog2 = viewOnLayoutChangeListenerC7738.buildDialog();
            c19258BuildDialog2.m44433(R.string.MT_Protector);
            c19258BuildDialog2.m44416(R.string.MT_Protector);
            c19258BuildDialog2.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC20173(2, viewOnLayoutChangeListenerC7738));
            c19258BuildDialog2.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258BuildDialog2.m44440(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩶᩸ۢ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    int i2 = ViewOnLayoutChangeListenerC7738.f23938;
                    this.f65938.finish();
                }
            });
            c19258BuildDialog2.m44438();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            ServiceC23281 serviceC23281 = viewOnLayoutChangeListenerC7738.f23945.f35906;
            if (serviceC23281.f74756 != null || serviceC23281.f74755 != null) {
                menuItem.setIcon(R.drawable.MT_Protector);
                viewOnLayoutChangeListenerC7738.f23945.m29319(true);
            } else {
                menuItem.setIcon(R.drawable.MT_Protector);
                viewOnLayoutChangeListenerC7738.f23945.m29313(true);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m20744(ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7738) {
        BinderC11993 binderC11993 = viewOnLayoutChangeListenerC7738.f23945;
        if (binderC11993 != null) {
            binderC11993.m29318(viewOnLayoutChangeListenerC7738.f23940, ApplicationC20075.f65010.getBoolean("term_create_session_as_root", false));
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20745(ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7738) {
        BinderC11993 binderC11993 = viewOnLayoutChangeListenerC7738.f23945;
        if (binderC11993 == null || binderC11993.m29314(viewOnLayoutChangeListenerC7738.f23940)) {
            viewOnLayoutChangeListenerC7738.finish();
        }
    }

    @Override // l.InterfaceC9171
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void mo20747() {
        BinderC11993 binderC11993 = this.f23945;
        if (binderC11993 == null) {
            return;
        }
        final CharSequence[] charSequenceArrM29322 = binderC11993.m29322();
        C19258 c19258BuildDialog = buildDialog();
        c19258BuildDialog.m44429(charSequenceArrM29322, this.f23945.m29321(), new DialogInterfaceOnClickListenerC9630(this, 2));
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44434(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֨᩸ۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ViewOnLayoutChangeListenerC7738.m20741(this.f5029);
            }
        });
        c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        dialogInterfaceC0206M44438.m1448().setOnClickListener(new View.OnClickListener() { // from class: l.۠᩸ۢ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewOnLayoutChangeListenerC7738.m20728(this.f25844, dialogInterfaceC0206M44438, view);
            }
        });
        dialogInterfaceC0206M44438.m1443().setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: l.ܶ᩸ۢ
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
                ViewOnLayoutChangeListenerC7738.m20730(this.f47389, charSequenceArrM29322, dialogInterfaceC0206M44438, i);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20723(ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7738, DialogInterface dialogInterface, int i) {
        viewOnLayoutChangeListenerC7738.f23945.m29310(viewOnLayoutChangeListenerC7738.f23940, i);
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m20741(ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7738) {
        viewOnLayoutChangeListenerC7738.f23945.m29312(viewOnLayoutChangeListenerC7738.f23940, ApplicationC20075.f65010.getBoolean("term_create_session_as_root", false), false, viewOnLayoutChangeListenerC7738.f23939);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20728(ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7738, DialogInterfaceC0206 dialogInterfaceC0206, View view) {
        C21282 c21282 = new C21282(viewOnLayoutChangeListenerC7738, view, 0);
        C3060 c3060M48304 = c21282.m48304();
        if (C2094.m6880() != null) {
            c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setEnabled(viewOnLayoutChangeListenerC7738.f23945.m29323() > 1);
        c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c21282.m48302(new C4916(viewOnLayoutChangeListenerC7738, dialogInterfaceC0206));
        c21282.m48305();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20727(ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7738, DialogInterfaceC0206 dialogInterfaceC0206, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            viewOnLayoutChangeListenerC7738.f23945.m29312(viewOnLayoutChangeListenerC7738.f23940, ApplicationC20075.f65010.getBoolean("term_create_session_as_root", false), true, viewOnLayoutChangeListenerC7738.f23939);
            dialogInterfaceC0206.dismiss();
        } else if (itemId == R.string.MT_Protector) {
            viewOnLayoutChangeListenerC7738.f23945.m29306();
            viewOnLayoutChangeListenerC7738.finish();
        } else if (itemId == R.string.MT_Protector) {
            viewOnLayoutChangeListenerC7738.f23945.m29316();
            dialogInterfaceC0206.dismiss();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20730(ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7738, CharSequence[] charSequenceArr, DialogInterfaceC0206 dialogInterfaceC0206, int i) {
        C6327 c6327 = new C6327(viewOnLayoutChangeListenerC7738, viewOnLayoutChangeListenerC7738, i, charSequenceArr, dialogInterfaceC0206);
        c6327.m5519(R.string.MT_Protector);
        c6327.m5522(viewOnLayoutChangeListenerC7738.f23945.m29305(i));
        c6327.m5526();
        c6327.m5525();
        c6327.m5527();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static void m20733(final ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7738) {
        final String stringExtra;
        viewOnLayoutChangeListenerC7738.f23945.m29311(viewOnLayoutChangeListenerC7738.f23940, ApplicationC20075.f65010.getBoolean("term_create_session_as_root", false));
        if (viewOnLayoutChangeListenerC7738.m10243() || (stringExtra = viewOnLayoutChangeListenerC7738.getIntent().getStringExtra("PATH")) == null || stringExtra.isEmpty()) {
            return;
        }
        C1802.f6208.submit(new Runnable() { // from class: l.᩸᩸ۢ
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnLayoutChangeListenerC7738.m20726(this.f70005, stringExtra);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20726(ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7738, String str) {
        for (int i = 15; i > 0; i--) {
            BinderC11993 binderC11993 = viewOnLayoutChangeListenerC7738.f23945;
            if (binderC11993 == null) {
                return;
            }
            if (!TextUtils.isEmpty(binderC11993.m29320())) {
                viewOnLayoutChangeListenerC7738.runOnUiThread(new RunnableC13486(2, viewOnLayoutChangeListenerC7738, new File(str).getPath()));
                return;
            }
            SystemClock.sleep(200L);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20737(ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7738, String str) {
        viewOnLayoutChangeListenerC7738.f23944.setText("cd " + C9255.m23755(str));
        viewOnLayoutChangeListenerC7738.f23942.setVisibility(0);
        TextView textView = (TextView) viewOnLayoutChangeListenerC7738.f23942.findViewById(R.id.MT_Protector);
        textView.setTag(5);
        new RunnableC14087(viewOnLayoutChangeListenerC7738, textView).run();
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unbindService(this.f23947);
        BinderC11993 binderC11993 = this.f23945;
        if (binderC11993 != null) {
            binderC11993.m29307(0, 0, false);
        }
        BinderC11993 binderC11994 = this.f23945;
        if (binderC11994 != null && !binderC11994.m29325()) {
            C0881.m3232(this, new Intent(this, (Class<?>) ServiceC23281.class).setAction("bin.mt.term.TerminalService.ACTION_EXIT"));
        }
        C4925.m14309(500L, new RunnableC0318(2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20725(ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7738, Runnable runnable) {
        if (viewOnLayoutChangeListenerC7738.f23945 != null) {
            runnable.run();
        } else {
            viewOnLayoutChangeListenerC7738.f23941.add(runnable);
        }
    }
}
