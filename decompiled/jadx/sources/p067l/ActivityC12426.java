package p067l;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۤ᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1R8 */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC12426 extends AbstractActivityC5549 implements InterfaceC11085 {

    /* JADX INFO: renamed from: ۢۧ */
    public static final /* synthetic */ int f34729 = 0;

    /* JADX INFO: renamed from: ۜۧ */
    public ViewOnClickListenerC17789 f34730;

    /* JADX INFO: renamed from: ܳۧ */
    public C14853 f34731;

    /* JADX INFO: renamed from: ܿۧ */
    public final AbstractC0868 f34732 = new C15107(this);

    /* JADX INFO: renamed from: ᩳۧ */
    public C7741 f34733;

    /* JADX INFO: renamed from: ᩷ۧ */
    public C14437 f34734;

    /* JADX INFO: renamed from: ᩻ۧ */
    public C2977 f34735;

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "ScriptExecutor";
    }

    @Override // p067l.ActivityC4388
    /* JADX INFO: renamed from: ۘ */
    public final int mo9138() {
        SharedPreferences sharedPreferences = ApplicationC21448.f67650;
        return (sharedPreferences == null || !sharedPreferences.getBoolean("term_keep_dark", true)) ? -100 : 2;
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AbstractC17043 abstractC17043M42109;
        this.f13389 = false;
        setTheme(C19552.m44401());
        super.onCreate(bundle);
        m12277(R.layout.MT_Protector);
        m12277(R.string.MT_Protector);
        this.f34734 = (C14437) new C6874(this).m15765(C14437.class);
        boolean zM50539 = C22553.m50539(this);
        C13097.f36813 = zM50539;
        ViewOnLayoutChangeListenerC9723.m22701(this, zM50539);
        C19071 c19071 = this.f34734.f41247;
        if (c19071 != null && c19071.m43346() != null) {
            this.f34734.f41247.m43346().f57113.m42015();
        }
        this.f34730 = new ViewOnClickListenerC17789(this, this);
        TextView textView = (TextView) m12277(R.id.MT_Protector);
        textView.setTypeface(Typeface.DEFAULT);
        textView.setText("Im");
        try {
            abstractC17043M42109 = C18524.m42105(getIntent());
        } catch (NullPointerException unused) {
            String stringExtra = getIntent().getStringExtra(MotionUtils.EASING_TYPE_PATH);
            if (stringExtra != null) {
                abstractC17043M42109 = C18524.m42109(stringExtra, new String[0]);
            } else {
                finish();
                return;
            }
        }
        this.f34733 = C10423.m24117(this, new C21144(this, abstractC17043M42109));
        this.f34735 = (C2977) m12277(R.id.MT_Protector);
        m28636();
        this.f34735.m4989(new C21814(this));
        m28633(abstractC17043M42109);
        getOnBackPressedDispatcher().m30943(this, this.f34732);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m28632(ActivityC12426 activityC12426, AbstractC17043 abstractC17043) {
        activityC12426.m28636();
        AbstractC1499 abstractC1499M6357 = activityC12426.m6357();
        SharedPreferences sharedPreferences = ApplicationC21448.f67650;
        abstractC1499M6357.mo17377((sharedPreferences == null || !sharedPreferences.getBoolean("term_keep_dark", true)) ? -100 : 2);
        if (activityC12426.f34734.f41245) {
            activityC12426.m28633(abstractC17043);
        }
    }

    /* JADX INFO: renamed from: ۨ */
    private void m28636() {
        int i;
        C2977 c2977 = this.f34735;
        try {
            i = Integer.parseInt(ApplicationC21448.f67650.getString("term_font_size", "12"));
        } catch (Exception unused) {
            i = 12;
        }
        c2977.m4986(i);
        this.f34735.m4987(C16448.m37366());
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC0904, p067l.ActivityC3069, android.app.Activity
    public final void onDestroy() {
        C14437 c14437 = this.f34734;
        if (c14437 != null) {
            c14437.f41249 = false;
            c14437.f41248++;
        }
        C14853 c14853 = this.f34731;
        if (c14853 != null) {
            c14853.m33949();
            this.f34731 = null;
        }
        super.onDestroy();
        C7050.m16206(500L, new RunnableC3708());
    }

    /* JADX INFO: renamed from: ֫ */
    private void m28633(final AbstractC17043 abstractC17043) {
        final Intent intent = getIntent();
        if (this.f34734.f41247 == null && "bin.mt.plus.ACTION_SHORTCUT".equals(intent.getAction())) {
            C14437 c14437 = this.f34734;
            if (c14437.f41249) {
                return;
            }
            c14437.f41249 = true;
            final int i = c14437.f41248 + 1;
            c14437.f41248 = i;
            C14853 c14853 = this.f34731;
            if (c14853 != null) {
                c14853.m33949();
            }
            C14853 c14854 = new C14853(this, R.string.MT_Protector);
            c14854.m33958(500);
            this.f34731 = c14854;
            final Context applicationContext = getApplicationContext();
            C4081.f8987.execute(new Runnable() { // from class: l.ܶ᩹ۢ
                @Override // java.lang.Runnable
                public final void run() {
                    final boolean zM35428;
                    Context context = applicationContext;
                    final Intent intent2 = intent;
                    int i2 = ActivityC12426.f34729;
                    try {
                        zM35428 = ActivityC15577.m35428(context, intent2);
                    } catch (Exception unused) {
                        zM35428 = false;
                    }
                    final ActivityC12426 activityC12426 = this.f50571;
                    final int i3 = i;
                    final AbstractC17043 abstractC17044 = abstractC17043;
                    C7050.m16212(new Runnable() { // from class: l.᩸᩹ۢ
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActivityC12426.m28630(activityC12426, i3, zM35428, abstractC17044, intent2);
                        }
                    });
                }
            });
            return;
        }
        m28634(abstractC17043, intent);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m28630(ActivityC12426 activityC12426, int i, boolean z, AbstractC17043 abstractC17043, Intent intent) {
        C14437 c14437 = activityC12426.f34734;
        if (i != c14437.f41248) {
            return;
        }
        c14437.f41249 = false;
        C14853 c14853 = activityC12426.f34731;
        if (c14853 != null) {
            c14853.m33949();
            activityC12426.f34731 = null;
        }
        if (activityC12426.isFinishing() || activityC12426.isDestroyed()) {
            return;
        }
        if (!z) {
            C22682.m50799(R.string.MT_Protector);
            activityC12426.finish();
        } else {
            activityC12426.m28634(abstractC17043, intent);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m28634(AbstractC17043 abstractC17043, Intent intent) {
        boolean booleanExtra;
        boolean z;
        C19071 c19071 = this.f34734.f41247;
        if (c19071 == null) {
            boolean z2 = false;
            if ("bin.mt.plus.ACTION_SHORTCUT".equals(intent.getAction())) {
                booleanExtra = intent.getBooleanExtra("ewrp", false);
                z = !intent.getBooleanExtra("ewse", true);
                this.f34734.f41246 = intent.getBooleanExtra("eae", false);
            } else {
                booleanExtra = ApplicationC21448.f67649.getBoolean("ewrp", false);
                z = !ApplicationC21448.f67649.getBoolean("ewse", true);
                this.f34734.f41246 = false;
            }
            if (z && C4359.m9006() == null) {
                C20671 c20671BuildDialog = buildDialog();
                c20671BuildDialog.m46727(R.string.MT_Protector);
                c20671BuildDialog.m46710(R.string.MT_Protector);
                c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC8824(2, this));
                c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterfaceOnClickListenerC24050(3, this));
                c20671BuildDialog.m46722(false);
                c20671BuildDialog.m46732();
                return;
            }
            String strM38669 = abstractC17043.m38669();
            String strMo25505 = abstractC17043.mo25505();
            try {
                InputStream inputStreamMo29987 = abstractC17043.mo29987();
                try {
                    int i = inputStreamMo29987.read();
                    int i2 = inputStreamMo29987.read();
                    int i3 = inputStreamMo29987.read();
                    int i4 = inputStreamMo29987.read();
                    if ((i | i2 | i3 | i4) < 0) {
                        inputStreamMo29987.close();
                    } else {
                        boolean z3 = (i & 255) == 127 && (i2 & 255) == 69 && (i3 & 255) == 76 && (i4 & 255) == 70;
                        inputStreamMo29987.close();
                        z2 = z3;
                    }
                } catch (Throwable th) {
                    if (inputStreamMo29987 != null) {
                        try {
                            inputStreamMo29987.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException unused) {
            }
            StringBuilder sb = new StringBuilder("cd ");
            sb.append(C11164.m25756(strM38669));
            sb.append(" || exit $?; trap '' INT; (trap - INT; exec ");
            if (z2) {
                sb.append(C11164.m25756(strMo25505));
            } else {
                sb.append("sh ");
                sb.append(C11164.m25756(strMo25505));
            }
            sb.append("); _mt_status=$?; exit $_mt_status\r");
            String string = sb.toString();
            this.f34734.f41247 = C3017.m5105(null, booleanExtra, !z);
            this.f34735.m4990(this.f34734.f41247);
            C7050.m16212(new RunnableC7061(this, string));
        } else {
            this.f34735.m4990(c19071);
        }
        C14437 c14437 = this.f34734;
        if (c14437.f41246) {
            c14437.f41247.m43339().m4066(this, new InterfaceC3326() { // from class: l.۠᩹ۢ
                @Override // p067l.InterfaceC3326
                /* JADX INFO: renamed from: ֫ */
                public final void mo4017(Object obj) {
                    int i5 = ActivityC12426.f34729;
                    if (((Boolean) obj).booleanValue()) {
                        return;
                    }
                    this.f28805.finish();
                }
            });
        }
        C7350 c7350M43339 = this.f34734.f41247.m43339();
        AbstractC0868 abstractC0868 = this.f34732;
        C12826.requireNonNull(abstractC0868);
        c7350M43339.m4066(this, new C17618(2, abstractC0868));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m28629(ActivityC12426 activityC12426) {
        activityC12426.f34734.f41245 = true;
        Intent intent = new Intent(activityC12426, (Class<?>) ActivityC6391.class);
        intent.putExtra("scriptSettings", true);
        activityC12426.f34733.m17868(intent);
    }

    @Override // p067l.InterfaceC11085
    /* JADX INFO: renamed from: ֫ */
    public final void mo22726(View view) {
        boolean z = false;
        C1898 c1898 = new C1898(this, view, 0);
        C0994 c0994M50638 = c1898.m50638();
        c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        MenuItem icon = c0994M50638.add(0, android.R.string.paste, 0, android.R.string.paste).setIcon(R.drawable.MT_Protector);
        C19071 c19071 = this.f34734.f41247;
        if (c19071 != null && c19071.m43344() && this.f34735.m4991()) {
            z = true;
        }
        icon.setEnabled(z);
        c1898.m50636(new C6395(10, this));
        c0994M50638.setOptionalIconsVisible(true);
        c1898.m50639();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m28631(ActivityC12426 activityC12426, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 17039371) {
            activityC12426.f34735.m4994();
            return;
        }
        if (itemId == R.string.MT_Protector) {
            activityC12426.f34734.f41245 = false;
            Intent intent = new Intent(activityC12426, (Class<?>) ActivityC6391.class);
            intent.putExtra("scriptSettings", true);
            activityC12426.f34733.m17868(intent);
            return;
        }
        if (itemId == R.string.MT_Protector) {
            activityC12426.f34734.f41247.m43343();
            activityC12426.finish();
        }
    }

    @Override // p067l.InterfaceC11085
    /* JADX INFO: renamed from: ܳ */
    public final void mo22727() {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.toggleSoftInput(0, 2);
        }
    }
}
