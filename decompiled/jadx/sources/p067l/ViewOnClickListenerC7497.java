package p067l;

import android.animation.ObjectAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ۚܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GL */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC7497 extends AbstractActivityC5549 implements View.OnClickListener, InterfaceC10091, InterfaceC4699 {

    /* JADX INFO: renamed from: ۖܽ */
    public static final /* synthetic */ int f19594 = 0;

    /* JADX INFO: renamed from: ۖܿ۫, reason: not valid java name and contains not printable characters */
    private static final short[] f81999;

    /* JADX INFO: renamed from: ֡ۧ */
    public volatile boolean f19595;

    /* JADX INFO: renamed from: ֨ۧ */
    public String f19596;

    /* JADX INFO: renamed from: ֫ܽ */
    public C5744 f19597;

    /* JADX INFO: renamed from: ۖۧ */
    public boolean f19598;

    /* JADX INFO: renamed from: ۙۧ */
    public View f19601;

    /* JADX INFO: renamed from: ۚۧ */
    public AbstractC17043 f19602;

    /* JADX INFO: renamed from: ۜܽ */
    public ViewOnClickListenerC20574 f19605;

    /* JADX INFO: renamed from: ۟ۧ */
    public String f19606;

    /* JADX INFO: renamed from: ۠ۧ */
    public TextView f19607;

    /* JADX INFO: renamed from: ۡۧ */
    public boolean f19608;

    /* JADX INFO: renamed from: ۡܽ */
    public InterfaceMenuItemC1528 f19609;

    /* JADX INFO: renamed from: ۢۧ */
    public volatile boolean f19610;

    /* JADX INFO: renamed from: ۢܽ */
    public C10179 f19611;

    /* JADX INFO: renamed from: ۤۧ */
    public View f19612;

    /* JADX INFO: renamed from: ۧܽ */
    public boolean f19613;

    /* JADX INFO: renamed from: ۨۧ */
    public View f19614;

    /* JADX INFO: renamed from: ۫ۧ */
    public C17379 f19615;

    /* JADX INFO: renamed from: ۬ۧ */
    public C17379 f19616;

    /* JADX INFO: renamed from: ܰۧ */
    public boolean f19617;

    /* JADX INFO: renamed from: ܳۧ */
    public ObjectAnimator f19618;

    /* JADX INFO: renamed from: ܳܽ */
    public View f19619;

    /* JADX INFO: renamed from: ܺۧ */
    public volatile boolean f19621;

    /* JADX INFO: renamed from: ܽܽ */
    public InterfaceMenuItemC1528 f19623;

    /* JADX INFO: renamed from: ܿۧ */
    public C2802 f19624;

    /* JADX INFO: renamed from: ܿܽ */
    public InterfaceMenuItemC1528 f19625;

    /* JADX INFO: renamed from: ᩳܽ */
    public boolean f19627;

    /* JADX INFO: renamed from: ᩴۧ */
    public C14784 f19628;

    /* JADX INFO: renamed from: ᩵ۧ */
    public C8838 f19629;

    /* JADX INFO: renamed from: ᩶ۧ */
    public boolean f19630;

    /* JADX INFO: renamed from: ᩷ۧ */
    public boolean f19631;

    /* JADX INFO: renamed from: ᩷ܽ */
    public C24260 f19632;

    /* JADX INFO: renamed from: ᩸ۧ */
    public InputMethodManager f19633;

    /* JADX INFO: renamed from: ᩹ۧ */
    public C21579 f19634;

    /* JADX INFO: renamed from: ᩻ܽ */
    public boolean f19637;

    /* JADX INFO: renamed from: ۛۧ */
    public boolean f19603 = true;

    /* JADX INFO: renamed from: ۗۧ */
    public boolean f19599 = true;

    /* JADX INFO: renamed from: ܶۧ */
    public boolean f19620 = true;

    /* JADX INFO: renamed from: ۜۧ */
    public long f19604 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: ᩻ۧ */
    public Executor f19636 = C14461.m33083();

    /* JADX INFO: renamed from: ۘۧ */
    public Executor f19600 = AsyncTask.THREAD_POOL_EXECUTOR;

    /* JADX INFO: renamed from: ᩳۧ */
    public final C20238 f19626 = new C20238();

    /* JADX INFO: renamed from: ᩺ۧ */
    public boolean f19635 = false;

    /* JADX INFO: renamed from: ܺܽ */
    public boolean f19622 = true;

    static {
        ApplicationC14266.m56479(66);
        f81999 = new short[]{4474, 4844, -730, -14506, 2044, -9655, 6951};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public native void m17285(boolean z);

    @Override // p067l.InterfaceC10091
    public final void onDrawerSlide(View view, float f) {
    }

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "HexEditor";
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m12277(R.layout.MT_Protector);
        m12277(R.string.MT_Protector);
        this.f19605 = ViewOnClickListenerC20574.m46516(this);
        this.f19634 = new C21579(this);
        C1326 c1326 = (C1326) m12277(R.id.MT_Protector);
        this.f13392 = c1326;
        m12263(c1326);
        C1428 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C17554 c17554 = new C17554(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m30940(c17554);
        this.f19601 = m12277(R.id.MT_Protector);
        this.f19612 = m12277(R.id.MT_Protector);
        this.f19619 = m12277(R.id.MT_Protector);
        this.f19629 = (C8838) m12277(R.id.MT_Protector);
        this.f19607 = (TextView) m12277(R.id.MT_Protector);
        this.f19616 = (C17379) m12277(R.id.MT_Protector);
        this.f19615 = (C17379) m12277(R.id.MT_Protector);
        C14784 c14784 = (C14784) m12277(R.id.MT_Protector);
        this.f19628 = c14784;
        c14784.m33738(this);
        m17288(R.id.MT_Protector);
        m17288(R.id.button1);
        m17288(R.id.button2);
        m17288(R.id.MT_Protector);
        m17288(R.id.MT_Protector);
        m17288(R.id.MT_Protector);
        m17288(R.id.MT_Protector);
        m17288(R.id.MT_Protector);
        m17288(R.id.MT_Protector);
        m17288(R.id.MT_Protector);
        m17288(R.id.MT_Protector);
        m17288(R.id.MT_Protector);
        m17288(R.id.MT_Protector);
        m17288(R.id.MT_Protector);
        m17288(R.id.MT_Protector);
        m17288(R.id.MT_Protector);
        TextView textView = (TextView) m12277(R.id.MT_Protector);
        this.f19629.getClass();
        textView.setTypeface(C12450.f34804);
        TextView textView2 = (TextView) m12277(R.id.MT_Protector);
        this.f19629.getClass();
        textView2.setTypeface(C12450.f34804);
        this.f19607.setOnClickListener(this);
        this.f19629.m20429(this);
        View viewM12277 = m12277(R.id.MT_Protector);
        this.f19614 = viewM12277;
        viewM12277.setOnClickListener(this);
        if (getResources().getConfiguration().orientation != 1) {
            this.f19619.setVisibility(0);
            this.f19616.m39423(16);
            this.f19615.m39423(2);
            m17289(true);
        }
        Intent intent = getIntent();
        if ("android.intent.action.VIEW".equals(intent.getAction()) || "android.intent.action.EDIT".equals(intent.getAction())) {
            if (C18524.m42116((AbstractActivityC5549) this)) {
                return;
            }
            this.f19602 = C18524.m42105(getIntent());
            this.f19613 = intent.getBooleanExtra("readOnly", false);
            this.f19596 = this.f19602.getName();
            m17293();
            C5744 c5744 = null;
            this.f19606 = bundle == null ? null : bundle.getString("hex_session_token");
            if (bundle != null && bundle.getBoolean("hex_ui_present", false)) {
                c5744 = new C5744(bundle.getBoolean("hex_ui_keyboard_showing"), bundle.getBoolean("hex_ui_keyboard_enable"), bundle.getBoolean("hex_ui_hex_mode"), C24931.m54795(bundle.getLong("hex_ui_scroll"), bundle.getInt("hex_ui_selection_start"), bundle.getInt("hex_ui_selection_end"), bundle.getBoolean("hex_ui_select_hex_first"), bundle.getBoolean("hex_ui_multi_select")));
            }
            this.f19597 = c5744;
            new C5074(this, this.f19606, false, false).m22250();
            return;
        }
        finish();
    }

    /* JADX INFO: renamed from: ۟ */
    public final boolean m17304() {
        return this.f19613 || this.f19617;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17298(C19644 c19644, C24260 c24260, C10179 c10179, boolean z, boolean z2) {
        try {
            if (this.f19621 || isFinishing()) {
                try {
                    c19644.close();
                } catch (IOException unused) {
                }
                if (c24260 == null || m17302(c24260)) {
                } else {
                    c24260.m53590();
                }
            } else {
                boolean zM17304 = m17304();
                this.f19617 = z2;
                this.f19629.m20431(m17304());
                C19644 c19644M20422 = this.f19629.m20422(c19644);
                C24260 c24261 = this.f19632;
                this.f19632 = c24260;
                this.f19611 = c10179;
                this.f19598 = z;
                this.f19627 = false;
                C5744 c5744 = this.f19597;
                this.f19597 = null;
                this.f19606 = null;
                if (c5744 != null) {
                    this.f19603 = c5744.f14093;
                    this.f19599 = c5744.f14092;
                    this.f19620 = c5744.f14091;
                    try {
                        this.f19629.m20430(c5744.f14094);
                    } catch (IllegalArgumentException unused2) {
                        m17294(this.f19629.f23986.m29480(), this.f19629.f23986.m29466(), this.f19629.f23986.m29477(), this.f19629.f23986.m29468());
                    }
                    this.f19614.setAlpha(this.f19599 ? 1.0f : 0.3f);
                    if (!this.f19603) {
                        this.f19612.setVisibility(8);
                        this.f19601.setVisibility(4);
                    }
                }
                if (c24260 == null || !c24260.m53596()) {
                    this.f19604 = Long.MIN_VALUE;
                    this.f19631 = false;
                } else {
                    this.f19604 = c19644.m44646();
                    this.f19631 = c19644.m44655();
                }
                if (zM17304 && !m17304()) {
                    this.f19599 = true;
                    this.f19603 = true;
                }
                boolean zM17305 = m17304();
                this.f19629.m20431(zM17305);
                this.f19605.m46528(zM17305);
                m12277(R.id.MT_Protector).setVisibility(this.f19617 ? 0 : 8);
                m17293();
                ObjectAnimator objectAnimator = this.f19618;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                    this.f19618 = null;
                }
                this.f19601.setTranslationY(0.0f);
                this.f19614.setEnabled(!zM17305);
                if (zM17305) {
                    this.f19599 = false;
                    this.f19614.setAlpha(0.3f);
                    this.f19603 = false;
                    this.f19612.setVisibility(8);
                    this.f19601.setVisibility(8);
                    m12268();
                } else {
                    this.f19614.setAlpha(this.f19599 ? 1.0f : 0.3f);
                    this.f19612.setVisibility(this.f19603 ? 0 : 8);
                    this.f19601.setVisibility(this.f19603 ? 0 : 4);
                    if (m6355() != null) {
                        m6355().mo28329(false);
                    }
                    this.f13392.setNavigationIcon((Drawable) null);
                }
                this.f13392.setNavigationOnClickListener(zM17305 ? new ViewOnClickListenerC10850(0, this) : null);
                this.f19634.m48772();
                invalidateOptionsMenu();
                m17297(c19644, c10179);
                if (c19644M20422 != null && c19644M20422 != c19644) {
                    try {
                        c19644M20422.close();
                    } catch (IOException unused3) {
                    }
                }
                if (c24261 == null || c24261 == c24260) {
                    return;
                }
                if (c24260 != null && c24261.m53593().equals(c24260.m53593())) {
                } else {
                    c24261.m53590();
                }
            }
        } catch (IOException unused4) {
        }
    }

    /* JADX INFO: renamed from: ᩻֫ */
    private void m17293() {
        if (this.f19617) {
            setTitle(this.f19596);
            this.f13392.setSubtitle(getString(R.string.MT_Protector));
        } else if (this.f19613) {
            setTitle(this.f19596);
            this.f13392.setSubtitle((CharSequence) null);
        } else {
            setTitle(R.string.MT_Protector);
            this.f13392.setSubtitle(this.f19635 ? C10965.m25286(new StringBuilder(), this.f19596, " *") : this.f19596);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m17302(C24260 c24260) {
        return this.f19610 && !(this.f19595 || isFinishing()) && c24260 != null && c24260.m53589();
    }

    /* JADX INFO: renamed from: ᩺ */
    public final boolean m17312() {
        return this.f19610;
    }

    /* JADX INFO: renamed from: ᩳ֫ */
    public final boolean m17311() {
        return this.f19621 || isFinishing() || isDestroyed();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m17301(Object obj, C19644 c19644) {
        C8838 c8838;
        return (this.f19621 || isFinishing() || isDestroyed() || (c8838 = this.f19629) == null || c8838.f23986.m29476() != c19644 || !this.f19626.m45720(obj, c19644)) ? false : true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m17305(Object obj, C19644 c19644) {
        this.f19626.m45722(obj, c19644);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17296(C10179 c10179) {
        this.f19611 = c10179;
        C24260 c24260 = this.f19632;
        this.f19604 = Long.MIN_VALUE;
        this.f19631 = false;
        if (c24260 == null) {
            this.f19610 = false;
            this.f19608 = false;
        } else {
            try {
                if (this.f19598) {
                    this.f19610 = false;
                    this.f19608 = false;
                    this.f19632 = null;
                    c24260.m53590();
                } else {
                    this.f19604 = this.f19629.f23986.m29476().m44646();
                    this.f19631 = false;
                }
            } catch (IOException unused) {
            }
        }
        this.f19629.m20435();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m17306(C10179 c10179) {
        if (c10179 != null) {
            this.f19611 = c10179;
        }
        m17280(false);
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC3069, android.app.Activity
    public final void onResume() {
        C8838 c8838;
        C24260 c24260;
        super.onResume();
        boolean z = this.f19610;
        boolean z2 = this.f19608;
        boolean zM53596 = false;
        this.f19610 = false;
        this.f19608 = false;
        if (z && z2 && !this.f19621 && !this.f19627 && (c24260 = this.f19632) != null && this.f19611 != null) {
            if (c24260.m53591()) {
                zM53596 = true;
            } else {
                try {
                    this.f19629.f23986.m29476().m44657();
                } catch (IOException unused) {
                    zM53596 = this.f19632.m53596();
                }
            }
            if (zM53596) {
                String strM53593 = this.f19632.m53593();
                this.f19606 = strM53593;
                this.f19627 = true;
                new C5074(this, strM53593, true, true).m22250();
            }
        }
        if (this.f19627 || this.f19611 == null || (c8838 = this.f19629) == null) {
            return;
        }
        C19644 c19644M29476 = c8838.f23986.m29476();
        if (this.f19626.m45721(c19644M29476)) {
            return;
        }
        try {
            c19644M29476.m44657();
            m17297(c19644M29476, this.f19611);
        } catch (IOException e) {
            m17295(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17297(C19644 c19644, C10179 c10179) {
        if (this.f19621 || this.f19627 || this.f19624 != null || this.f19626.m45721(c19644)) {
            return;
        }
        C2802 c2802 = new C2802(this, c19644, c10179);
        this.f19624 = c2802;
        try {
            c2802.m22250();
        } catch (RuntimeException unused) {
            this.f19624 = null;
            m12271(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ֫֫ */
    public final void m17303() {
        C8838 c8838;
        C19644 c19644M29476;
        this.f19606 = null;
        this.f19627 = false;
        if (this.f19621 || (c8838 = this.f19629) == null || this.f19611 == null || (c19644M29476 = c8838.f23986.m29476()) == null) {
            return;
        }
        m17297(c19644M29476, this.f19611);
    }

    /* JADX INFO: renamed from: ۨ */
    public final boolean m17308() {
        C8838 c8838;
        if (this.f19621 || !this.f19627 || (c8838 = this.f19629) == null) {
            return false;
        }
        C19644 c19644M29476 = c8838.f23986.m29476();
        try {
            c19644M29476.m44657();
            return !this.f19621 && this.f19629.f23986.m29476() == c19644M29476;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m17288(int i) {
        TextView textView = (TextView) m12277(i);
        textView.setOnClickListener(this);
        this.f19629.getClass();
        textView.setTypeface(C12450.f34804);
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC0904, p067l.ActivityC2023, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws Throwable {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            this.f19619.setVisibility(8);
            this.f19616.m39423(8);
            this.f19615.m39423(1);
            m17289(false);
            return;
        }
        this.f19619.setVisibility(0);
        this.f19616.m39423(16);
        this.f19615.m39423(2);
        m17289(true);
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m17289(boolean z) {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (z) {
            int i = attributes.flags;
            if ((i & 1024) != 0) {
                return;
            } else {
                attributes.flags = i | 1024;
            }
        } else {
            int i2 = attributes.flags;
            if ((i2 & 1024) == 0) {
                return;
            } else {
                attributes.flags = i2 ^ 1024;
            }
        }
        getWindow().setAttributes(attributes);
    }

    @Override // p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C22171 c22171M44648;
        Throwable th;
        Throwable th2;
        boolean z;
        long j;
        C24260 c24260M53578;
        boolean z2;
        boolean z3 = this.f19608;
        this.f19610 = false;
        this.f19608 = false;
        ViewOnClickListenerC20574 viewOnClickListenerC20574 = this.f19605;
        if (viewOnClickListenerC20574 != null) {
            viewOnClickListenerC20574.m46527();
        }
        C8838 c8838 = this.f19629;
        if (c8838 != null) {
            c8838.m20444();
            this.f19629.m20442();
        }
        C8838 c8839 = this.f19629;
        C19644 c19644M29476 = c8839 == null ? null : c8839.f23986.m29476();
        C10179 c10179 = this.f19611;
        if (c10179 == null || c19644M29476 == null) {
            c22171M44648 = null;
            th = null;
        } else {
            try {
                c22171M44648 = c19644M29476.m44648();
                th = null;
            } catch (Throwable th3) {
                th = th3;
                c22171M44648 = null;
            }
            this.f19597 = new C5744(this.f19603, this.f19599, this.f19620, this.f19629.m20423(c22171M44648 == null ? null : c22171M44648.m49979()));
        }
        C5744 c5744 = this.f19597;
        if (c5744 != null) {
            bundle.putBoolean("hex_ui_present", true);
            bundle.putBoolean("hex_ui_keyboard_showing", c5744.f14093);
            bundle.putBoolean("hex_ui_keyboard_enable", c5744.f14092);
            bundle.putBoolean("hex_ui_hex_mode", c5744.f14091);
            C24931 c24931 = c5744.f14094;
            bundle.putLong("hex_ui_scroll", c24931.f79619);
            bundle.putInt("hex_ui_selection_start", c24931.f79621);
            bundle.putInt("hex_ui_selection_end", c24931.f79622);
            bundle.putBoolean("hex_ui_select_hex_first", c24931.f79620);
            bundle.putBoolean("hex_ui_multi_select", c24931.f79618);
        }
        String str = this.f19606;
        if (str != null && (this.f19611 == null || this.f19627)) {
            bundle.putString("hex_session_token", str);
            this.f19610 = true;
        } else {
            C24260 c24260 = this.f19632;
            if (!this.f19627 && c19644M29476 != null && c10179 != null && c22171M44648 != null) {
                try {
                    boolean z4 = !m17304() && c22171M44648.m49977();
                    long jM49978 = c22171M44648.m49978();
                    if (!z4 && this.f19598) {
                        this.f19604 = Long.MIN_VALUE;
                        this.f19631 = false;
                        if (c24260 != null) {
                            this.f19632 = null;
                            c24260.m53590();
                        }
                    } else if (c24260 != null && this.f19604 == jM49978 && this.f19631 == z4 && c24260.m53589()) {
                        bundle.putString("hex_session_token", c24260.m53593());
                        this.f19610 = true;
                        this.f19608 = z3;
                    } else {
                        if (c24260 == null) {
                            c24260M53578 = C24260.m53578();
                            z2 = true;
                        } else {
                            c24260M53578 = c24260;
                            z2 = false;
                        }
                        try {
                            C8167 c8167M33084 = C14461.m33084(c24260M53578, c10179, this.f19598, c19644M29476, z4, this.f19617, !this.f19626.m45721(c19644M29476), this.f19636);
                            bundle.putString("hex_session_token", c24260M53578.m53593());
                            this.f19610 = true;
                            this.f19608 = true;
                            this.f19604 = c8167M33084.m18947();
                            this.f19631 = z4;
                            if (z2) {
                                this.f19632 = c24260M53578;
                            }
                        } catch (Throwable th4) {
                            c24260 = c24260M53578;
                            j = Long.MIN_VALUE;
                            boolean z5 = z2;
                            th2 = th4;
                            z = z5;
                            this.f19604 = j;
                            this.f19631 = false;
                            if (z) {
                                try {
                                    c24260.m53590();
                                } catch (IOException e) {
                                    th2.addSuppressed(e);
                                }
                            } else if (c24260 != null) {
                                try {
                                    c24260.m53592();
                                } catch (IOException e2) {
                                    th2.addSuppressed(e2);
                                }
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    z = false;
                    j = Long.MIN_VALUE;
                }
            } else if (th != null) {
                this.f19604 = Long.MIN_VALUE;
                this.f19631 = false;
                if (c24260 != null) {
                    try {
                        c24260.m53592();
                    } catch (IOException e3) {
                        th.addSuppressed(e3);
                    }
                }
            }
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        this.f19623 = (InterfaceMenuItemC1528) menu.findItem(R.id.MT_Protector);
        this.f19609 = (InterfaceMenuItemC1528) menu.findItem(R.id.MT_Protector);
        this.f19625 = (InterfaceMenuItemC1528) menu.findItem(R.id.MT_Protector);
        boolean zM44655 = this.f19629.f23986.m29476().m44655();
        boolean zM29472 = this.f19629.f23986.m29472();
        boolean zM29456 = this.f19629.f23986.m29456();
        this.f19625.setEnabled(zM44655);
        this.f19609.setEnabled(zM29472);
        this.f19623.setEnabled(zM29456);
        if (!m17304()) {
            return true;
        }
        this.f19625.setVisible(false);
        this.f19609.setVisible(false);
        this.f19623.setVisible(false);
        menu.findItem(R.id.MT_Protector).setVisible(false);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            this.f19629.m20436();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            this.f19629.m20445();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m17285(false);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m17287();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            if (this.f19628.m33753(8388613)) {
                this.f19628.m33734(8388613);
            }
            this.f19628.m33752(8388611);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            if (this.f19628.m33753(8388611)) {
                this.f19628.m33734(8388611);
            }
            this.f19628.m33752(8388613);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            C3732.m7188(this.f19629);
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            return false;
        }
        final C8838 c8838 = this.f19629;
        Context context = c8838.getContext();
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (!clipboardManager.hasPrimaryClip()) {
            C22682.m50798(R.string.MT_Protector, 0).m50804();
            return true;
        }
        final CharSequence text = clipboardManager.getText();
        if (TextUtils.isEmpty(text)) {
            C22682.m50798(R.string.MT_Protector, 0).m50804();
            return true;
        }
        final C14697 c14697M33623 = C14697.m33623(c8838);
        if (c14697M33623 == null) {
            return true;
        }
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(context);
        c20671.m46712(R.array.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩵۟ܿ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C8838 c8839 = c8838;
                C12826.requireNonNull(c8839, "editView");
                CharSequence charSequence = text;
                C12826.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
                C14697 c14697 = c14697M33623;
                if (c14697.m33624(c8839)) {
                    C23415 c23415 = new C23415();
                    final C14027 c14027 = new C14027(c8839, c14697);
                    C18225 c18225M20421 = c8839.m20421(new RunnableC2627(c23415), new Runnable() { // from class: l.ۚ۟ܿ
                        @Override // java.lang.Runnable
                        public final void run() {
                            c14027.m31861();
                        }
                    });
                    if (c18225M20421 == null) {
                        C22682.m50793(R.string.MT_Protector);
                    } else if (!c14697.m33624(c8839)) {
                        c18225M20421.close();
                    } else {
                        new C22745(c8839, c23415, c14697, c18225M20421, c14027, charSequence, i2).m22250();
                    }
                }
            }
        });
        DialogInterfaceC2564 dialogInterfaceC2564M46709 = c20671.m46709();
        dialogInterfaceC2564M46709.m3858().setDimAmount(0.0f);
        dialogInterfaceC2564M46709.m3862();
        return true;
    }

    @Override // p067l.ActivityC4388
    /* JADX INFO: renamed from: ᩴ */
    public final void mo5283() {
        m17287();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܿ֫ */
    public void m17287() {
        if (C24414.m53850() && this.f19629.f23986.m29476().m44655()) {
            int i = DialogInterfaceC2564.f4230;
            C20671 c20671 = new C20671(this);
            c20671.m46730(this.f19596);
            c20671.m46710(R.string.MT_Protector);
            int i2 = 0;
            c20671.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC22250(this, i2));
            c20671.m46728(R.string.MT_Protector, new DialogInterfaceOnClickListenerC11521(this, i2));
            c20671.m46732();
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    public final void finish() {
        this.f19595 = true;
        C24260 c24260 = this.f19632;
        String str = this.f19606;
        this.f19632 = null;
        this.f19606 = null;
        if (c24260 != null) {
            try {
                c24260.m53590();
            } catch (IOException unused) {
            }
        }
        if (str != null && (c24260 == null || !str.equals(c24260.m53593()))) {
            try {
                C24260.m53576(str);
            } catch (IOException unused2) {
            }
        }
        super.finish();
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC0904, p067l.ActivityC3069, android.app.Activity
    public final void onDestroy() {
        boolean z = true;
        this.f19621 = true;
        ViewOnClickListenerC20574 viewOnClickListenerC20574 = this.f19605;
        if (viewOnClickListenerC20574 != null) {
            viewOnClickListenerC20574.m46527();
        }
        C8838 c8838 = this.f19629;
        if (c8838 != null) {
            c8838.m20444();
            boolean zM20442 = this.f19629.m20442();
            C19644 c19644M29476 = this.f19629.f23986.m29476();
            if (c19644M29476 != null) {
                RunnableC20909 runnableC20909 = new RunnableC20909(c19644M29476);
                if (!zM20442) {
                    runnableC20909.run();
                } else {
                    try {
                        this.f19600.execute(runnableC20909);
                    } catch (Error | RuntimeException unused) {
                        if (!this.f19629.m20433(runnableC20909)) {
                            runnableC20909.run();
                        }
                    }
                }
            }
        }
        C12862.m29436(getCacheDir());
        C24260 c24260 = this.f19632;
        if (c24260 != null) {
            boolean z2 = this.f19610;
            if (!this.f19595 && !isFinishing()) {
                z = false;
            }
            if (!z2 || z || !c24260.m53589()) {
                this.f19632 = null;
                try {
                    c24260.m53590();
                } catch (IOException unused2) {
                }
            }
        }
        super.onDestroy();
    }

    /* JADX INFO: renamed from: ܳ֫ */
    private void m17282() {
        if (this.f19629.f23986.m29468() || m17304() || this.f19603) {
            return;
        }
        this.f19603 = true;
        ObjectAnimator objectAnimator = this.f19618;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f19618 = null;
        }
        View view = this.f19601;
        view.setTranslationY(view.getHeight());
        this.f19601.setVisibility(0);
        View view2 = this.f19601;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, "translationY", view2.getHeight(), 0.0f);
        this.f19618 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
        this.f19618.setInterpolator(new DecelerateInterpolator());
        this.f19618.addListener(new C4815(this));
        this.f19618.start();
    }

    /* JADX INFO: renamed from: ܰ */
    public final void m17309() {
        if (this.f19603) {
            this.f19603 = false;
            ObjectAnimator objectAnimator = this.f19618;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.f19618 = null;
            }
            this.f19612.setVisibility(8);
            View view = this.f19601;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", 0.0f, view.getHeight());
            this.f19618 = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(200L);
            this.f19618.setInterpolator(new AccelerateInterpolator());
            this.f19618.addListener(new C6156(this));
            this.f19618.start();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.MT_Protector) {
            this.f19629.m20441(0);
            return;
        }
        if (id == R.id.button1) {
            this.f19629.m20441(1);
            return;
        }
        if (id == R.id.button2) {
            this.f19629.m20441(2);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f19629.m20441(3);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f19629.m20441(4);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f19629.m20441(5);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f19629.m20441(6);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f19629.m20441(7);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f19629.m20441(8);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f19629.m20441(9);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f19629.m20441(10);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f19629.m20441(11);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f19629.m20441(12);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f19629.m20441(13);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f19629.m20441(14);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f19629.m20441(15);
            return;
        }
        if (id != R.id.MT_Protector) {
            if (id == R.id.MT_Protector) {
                this.f19620 = !this.f19620;
                m17294(this.f19629.f23986.m29480(), this.f19629.f23986.m29466(), this.f19629.f23986.m29477(), this.f19629.f23986.m29468());
                return;
            }
            return;
        }
        if (this.f19599) {
            this.f19599 = false;
            this.f19614.setAlpha(0.3f);
            m17309();
        } else {
            this.f19599 = true;
            this.f19614.setAlpha(1.0f);
            m17282();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17294(int i, int i2, int i3, boolean z) {
        if (z) {
            if (this.f19599) {
                m17309();
            }
            this.f19607.setText(String.format(Locale.ENGLISH, this.f19620 ? "Sel: %Xh - %Xh  Len: %Xh  Size: %Xh [HEX]" : "Sel: %d - %d  Len: %d  Size: %d [DEC]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf((i2 - i) + 1), Integer.valueOf(i3)));
        } else {
            if (i < i3) {
                String str = this.f19620 ? "Val: %Xh  Pos: %Xh  Size: %Xh [HEX]" : "Val: %d  Pos: %d  Size: %d [DEC]";
                try {
                    byte[] bArr = new byte[1];
                    this.f19629.f23986.m29476().m44653(i, 1, bArr);
                    this.f19607.setText(String.format(Locale.ENGLISH, str, Integer.valueOf(bArr[0] & 255), Integer.valueOf(i), Integer.valueOf(i3)));
                    return;
                } catch (IOException e) {
                    m17295(e);
                    return;
                }
            }
            this.f19607.setText(String.format(Locale.ENGLISH, this.f19620 ? "Size: %Xh [HEX]" : "Size: %d [DEC]", Integer.valueOf(i3)));
        }
    }

    /* JADX INFO: renamed from: ۧ֫ */
    public final void m17307() {
        if (this.f19599) {
            m17282();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17295(IOException iOException) {
        C19644 c19644M29476 = this.f19629.f23986.m29476();
        if (!(iOException instanceof C7614) && !c19644M29476.m44656()) {
            m12259(iOException, (DialogInterface.OnDismissListener) null);
        } else {
            m17280(true);
        }
    }

    /* JADX INFO: renamed from: ܽ֫ */
    public final void m17310() {
        m17280(false);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m17280(boolean z) {
        if (this.f19627 || this.f19621) {
            return;
        }
        this.f19627 = true;
        ViewOnClickListenerC20574 viewOnClickListenerC20574 = this.f19605;
        if (viewOnClickListenerC20574 != null) {
            viewOnClickListenerC20574.m46527();
        }
        this.f19629.m20444();
        this.f19629.m20442();
        String strM53593 = null;
        this.f19597 = new C5744(this.f19603, this.f19599, this.f19620, this.f19629.m20423((C6747) null));
        C24260 c24260 = this.f19632;
        if (z && c24260 != null && c24260.m53596()) {
            strM53593 = c24260.m53593();
        }
        this.f19606 = strM53593;
        new C5074(this, strM53593, true, false).m22250();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17300(boolean z, boolean z2, boolean z3) {
        if (this.f19635 != z3) {
            this.f19635 = z3;
            this.f13392.setSubtitle(z3 ? C10965.m25286(new StringBuilder(), this.f19596, " *") : this.f19596);
        }
        InterfaceMenuItemC1528 interfaceMenuItemC1528 = this.f19625;
        if (interfaceMenuItemC1528 != null) {
            interfaceMenuItemC1528.setEnabled(z3);
        }
        InterfaceMenuItemC1528 interfaceMenuItemC1529 = this.f19609;
        if (interfaceMenuItemC1529 != null) {
            interfaceMenuItemC1529.setEnabled(z);
        }
        InterfaceMenuItemC1528 interfaceMenuItemC15210 = this.f19623;
        if (interfaceMenuItemC15210 != null) {
            interfaceMenuItemC15210.setEnabled(z2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17299(boolean z) {
        C14784 c14784;
        int i;
        if (z) {
            c14784 = this.f19628;
            i = 1;
        } else {
            c14784 = this.f19628;
            i = 0;
        }
        c14784.m33735(i, 3);
        c14784.m33735(i, 5);
    }

    @Override // p067l.InterfaceC10091
    public final void onDrawerOpened(View view) {
        if (view.getId() == R.id.MT_Protector) {
            this.f19637 = true;
        } else {
            this.f19630 = true;
        }
    }

    @Override // p067l.InterfaceC10091
    public final void onDrawerClosed(View view) {
        if (view.getId() == R.id.MT_Protector) {
            this.f19637 = false;
        } else {
            this.f19630 = false;
        }
    }

    @Override // p067l.InterfaceC10091
    public final void onDrawerStateChanged(int i) {
        if (i == 2 && this.f19637) {
            this.f19605.m46529();
            if (this.f19633 == null) {
                InputMethodManager inputMethodManager = (InputMethodManager) getApplicationContext().getSystemService("input_method");
                this.f19633 = inputMethodManager;
                if (inputMethodManager == null) {
                    return;
                }
            }
            this.f19633.hideSoftInputFromWindow(this.f19629.getWindowToken(), 0);
            return;
        }
        if (i != 0) {
            if (this.f19630 || !this.f19622) {
                return;
            }
            this.f19634.m48772();
            this.f19622 = false;
            return;
        }
        this.f19622 = true;
    }

    @Override // p067l.InterfaceC4699
    /* JADX INFO: renamed from: ֫ */
    public final void mo4126(C17613 c17613) {
        if (((C13731) c17613.m40106()).m31245()) {
            C13731 c13731 = new C13731();
            c13731.m31208(this.f19629.f23986.m29476());
            c17613.m40105(c13731);
        } else {
            C13731 c13732 = new C13731();
            c13732.m31206(this.f19629.f23986.m29477());
            c17613.m40105(c13732);
        }
    }
}
