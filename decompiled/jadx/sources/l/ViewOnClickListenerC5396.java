package l;

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
import bin.mt.plus.R;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ۚܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GL */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC5396 extends AbstractActivityC3346 implements View.OnClickListener, InterfaceC8126, InterfaceC2452 {

    /* JADX INFO: renamed from: ۖܽ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f16757 = 0;

    /* JADX INFO: renamed from: ۖܿ۫, reason: not valid java name and contains not printable characters */
    private static final short[] f16758;

    /* JADX INFO: renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public volatile boolean f16759;

    /* JADX INFO: renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public String f16760;

    /* JADX INFO: renamed from: ֫ܽ, reason: not valid java name and contains not printable characters */
    public C3551 f16761;

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public boolean f16762;

    /* JADX INFO: renamed from: ۙۧ, reason: not valid java name and contains not printable characters */
    public View f16765;

    /* JADX INFO: renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f16766;

    /* JADX INFO: renamed from: ۜܽ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC19156 f16769;

    /* JADX INFO: renamed from: ۟ۧ, reason: not valid java name and contains not printable characters */
    public String f16770;

    /* JADX INFO: renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public TextView f16771;

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public boolean f16772;

    /* JADX INFO: renamed from: ۡܽ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC13827 f16773;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public volatile boolean f16774;

    /* JADX INFO: renamed from: ۢܽ, reason: not valid java name and contains not printable characters */
    public C8218 f16775;

    /* JADX INFO: renamed from: ۤۧ, reason: not valid java name and contains not printable characters */
    public View f16776;

    /* JADX INFO: renamed from: ۧܽ, reason: not valid java name and contains not printable characters */
    public boolean f16777;

    /* JADX INFO: renamed from: ۨۧ, reason: not valid java name and contains not printable characters */
    public View f16778;

    /* JADX INFO: renamed from: ۫ۧ, reason: not valid java name and contains not printable characters */
    public C15794 f16779;

    /* JADX INFO: renamed from: ۬ۧ, reason: not valid java name and contains not printable characters */
    public C15794 f16780;

    /* JADX INFO: renamed from: ܰۧ, reason: not valid java name and contains not printable characters */
    public boolean f16781;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public ObjectAnimator f16782;

    /* JADX INFO: renamed from: ܳܽ, reason: not valid java name and contains not printable characters */
    public View f16783;

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public volatile boolean f16785;

    /* JADX INFO: renamed from: ܽܽ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC13827 f16787;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public C0456 f16788;

    /* JADX INFO: renamed from: ܿܽ, reason: not valid java name and contains not printable characters */
    public InterfaceMenuItemC13827 f16789;

    /* JADX INFO: renamed from: ᩳܽ, reason: not valid java name and contains not printable characters */
    public boolean f16791;

    /* JADX INFO: renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public C13064 f16792;

    /* JADX INFO: renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public C6807 f16793;

    /* JADX INFO: renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public boolean f16794;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public boolean f16795;

    /* JADX INFO: renamed from: ᩷ܽ, reason: not valid java name and contains not printable characters */
    public C23034 f16796;

    /* JADX INFO: renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public InputMethodManager f16797;

    /* JADX INFO: renamed from: ᩹ۧ, reason: not valid java name and contains not printable characters */
    public C20213 f16798;

    /* JADX INFO: renamed from: ᩻ܽ, reason: not valid java name and contains not printable characters */
    public boolean f16801;

    /* JADX INFO: renamed from: ۛۧ, reason: not valid java name and contains not printable characters */
    public boolean f16767 = true;

    /* JADX INFO: renamed from: ۗۧ, reason: not valid java name and contains not printable characters */
    public boolean f16763 = true;

    /* JADX INFO: renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public boolean f16784 = true;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public long f16768 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public Executor f16800 = C12723.m31003();

    /* JADX INFO: renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public Executor f16764 = AsyncTask.THREAD_POOL_EXECUTOR;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public final C18802 f16790 = new C18802();

    /* JADX INFO: renamed from: ᩺ۧ, reason: not valid java name and contains not printable characters */
    public boolean f16799 = false;

    /* JADX INFO: renamed from: ܺܽ, reason: not valid java name and contains not printable characters */
    public boolean f16786 = true;

    static {
        ApplicationC12518.m30701(66);
        f16758 = new short[]{4474, 4844, -730, -14506, 2044, -9655, 6951};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public native void m15374(boolean z);

    @Override // l.InterfaceC8126
    public final void onDrawerSlide(View view, float f) {
    }

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "HexEditor";
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m10241(R.layout.MT_Protector);
        m10241(R.string.MT_Protector);
        this.f16769 = ViewOnClickListenerC19156.m44222(this);
        this.f16798 = new C20213(this);
        C9762 c9762 = (C9762) m10241(R.id.MT_Protector);
        this.f10584 = c9762;
        m10227(c9762);
        C11815 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C15978 c15978 = new C15978(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m28891(c15978);
        this.f16765 = m10241(R.id.MT_Protector);
        this.f16776 = m10241(R.id.MT_Protector);
        this.f16783 = m10241(R.id.MT_Protector);
        this.f16793 = (C6807) m10241(R.id.MT_Protector);
        this.f16771 = (TextView) m10241(R.id.MT_Protector);
        this.f16780 = (C15794) m10241(R.id.MT_Protector);
        this.f16779 = (C15794) m10241(R.id.MT_Protector);
        C13064 c13064 = (C13064) m10241(R.id.MT_Protector);
        this.f16792 = c13064;
        c13064.m31651(this);
        m15377(R.id.MT_Protector);
        m15377(R.id.button1);
        m15377(R.id.button2);
        m15377(R.id.MT_Protector);
        m15377(R.id.MT_Protector);
        m15377(R.id.MT_Protector);
        m15377(R.id.MT_Protector);
        m15377(R.id.MT_Protector);
        m15377(R.id.MT_Protector);
        m15377(R.id.MT_Protector);
        m15377(R.id.MT_Protector);
        m15377(R.id.MT_Protector);
        m15377(R.id.MT_Protector);
        m15377(R.id.MT_Protector);
        m15377(R.id.MT_Protector);
        m15377(R.id.MT_Protector);
        TextView textView = (TextView) m10241(R.id.MT_Protector);
        this.f16793.getClass();
        textView.setTypeface(C10607.f31833);
        TextView textView2 = (TextView) m10241(R.id.MT_Protector);
        this.f16793.getClass();
        textView2.setTypeface(C10607.f31833);
        this.f16771.setOnClickListener(this);
        this.f16793.m18480(this);
        View viewM10241 = m10241(R.id.MT_Protector);
        this.f16778 = viewM10241;
        viewM10241.setOnClickListener(this);
        if (getResources().getConfiguration().orientation != 1) {
            this.f16783.setVisibility(0);
            this.f16780.m37253(16);
            this.f16779.m37253(2);
            m15378(true);
        }
        Intent intent = getIntent();
        if ("android.intent.action.VIEW".equals(intent.getAction()) || "android.intent.action.EDIT".equals(intent.getAction())) {
            if (C16999.m39873((AbstractActivityC3346) this)) {
                return;
            }
            this.f16766 = C16999.m39862(getIntent());
            this.f16777 = intent.getBooleanExtra("readOnly", false);
            this.f16760 = this.f16766.getName();
            m15382();
            C3551 c3551 = null;
            this.f16770 = bundle == null ? null : bundle.getString("hex_session_token");
            if (bundle != null && bundle.getBoolean("hex_ui_present", false)) {
                c3551 = new C3551(bundle.getBoolean("hex_ui_keyboard_showing"), bundle.getBoolean("hex_ui_keyboard_enable"), bundle.getBoolean("hex_ui_hex_mode"), C23740.m52388(bundle.getLong("hex_ui_scroll"), bundle.getInt("hex_ui_selection_start"), bundle.getInt("hex_ui_selection_end"), bundle.getBoolean("hex_ui_select_hex_first"), bundle.getBoolean("hex_ui_multi_select")));
            }
            this.f16761 = c3551;
            new C2846(this, this.f16770, false, false).m20274();
            return;
        }
        finish();
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean m15393() {
        return this.f16777 || this.f16781;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15387(C18177 c18177, C23034 c23034, C8218 c8218, boolean z, boolean z2) {
        try {
            if (this.f16785 || isFinishing()) {
                try {
                    c18177.close();
                } catch (IOException unused) {
                }
                if (c23034 == null || m15391(c23034)) {
                } else {
                    c23034.m51197();
                }
            } else {
                boolean zM15393 = m15393();
                this.f16781 = z2;
                this.f16793.m18482(m15393());
                C18177 c18177M18473 = this.f16793.m18473(c18177);
                C23034 c23035 = this.f16796;
                this.f16796 = c23034;
                this.f16775 = c8218;
                this.f16762 = z;
                this.f16791 = false;
                C3551 c3551 = this.f16761;
                this.f16761 = null;
                this.f16770 = null;
                if (c3551 != null) {
                    this.f16767 = c3551.f11287;
                    this.f16763 = c3551.f11286;
                    this.f16784 = c3551.f11285;
                    try {
                        this.f16793.m18481(c3551.f11288);
                    } catch (IllegalArgumentException unused2) {
                        m15383(this.f16793.f21109.m27418(), this.f16793.f21109.m27404(), this.f16793.f21109.m27415(), this.f16793.f21109.m27406());
                    }
                    this.f16778.setAlpha(this.f16763 ? 1.0f : 0.3f);
                    if (!this.f16767) {
                        this.f16776.setVisibility(8);
                        this.f16765.setVisibility(4);
                    }
                }
                if (c23034 == null || !c23034.m51203()) {
                    this.f16768 = Long.MIN_VALUE;
                    this.f16795 = false;
                } else {
                    this.f16768 = c18177.m42385();
                    this.f16795 = c18177.m42394();
                }
                if (zM15393 && !m15393()) {
                    this.f16763 = true;
                    this.f16767 = true;
                }
                boolean zM15394 = m15393();
                this.f16793.m18482(zM15394);
                this.f16769.m44234(zM15394);
                m10241(R.id.MT_Protector).setVisibility(this.f16781 ? 0 : 8);
                m15382();
                ObjectAnimator objectAnimator = this.f16782;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                    this.f16782 = null;
                }
                this.f16765.setTranslationY(0.0f);
                this.f16778.setEnabled(!zM15394);
                if (zM15394) {
                    this.f16763 = false;
                    this.f16778.setAlpha(0.3f);
                    this.f16767 = false;
                    this.f16776.setVisibility(8);
                    this.f16765.setVisibility(8);
                    m10232();
                } else {
                    this.f16778.setAlpha(this.f16763 ? 1.0f : 0.3f);
                    this.f16776.setVisibility(this.f16767 ? 0 : 8);
                    this.f16765.setVisibility(this.f16767 ? 0 : 4);
                    if (m4111() != null) {
                        m4111().mo26300(false);
                    }
                    this.f10584.setNavigationIcon((Drawable) null);
                }
                this.f10584.setNavigationOnClickListener(zM15394 ? new ViewOnClickListenerC8924(0, this) : null);
                this.f16798.m46453();
                invalidateOptionsMenu();
                m15386(c18177, c8218);
                if (c18177M18473 != null && c18177M18473 != c18177) {
                    try {
                        c18177M18473.close();
                    } catch (IOException unused3) {
                    }
                }
                if (c23035 == null || c23035 == c23034) {
                    return;
                }
                if (c23034 != null && c23035.m51200().equals(c23034.m51200())) {
                } else {
                    c23035.m51197();
                }
            }
        } catch (IOException unused4) {
        }
    }

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    private void m15382() {
        if (this.f16781) {
            setTitle(this.f16760);
            this.f10584.setSubtitle(getString(R.string.MT_Protector));
        } else if (this.f16777) {
            setTitle(this.f16760);
            this.f10584.setSubtitle((CharSequence) null);
        } else {
            setTitle(R.string.MT_Protector);
            this.f10584.setSubtitle(this.f16799 ? C9045.m23341(new StringBuilder(), this.f16760, " *") : this.f16760);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m15391(C23034 c23034) {
        return this.f16774 && !(this.f16759 || isFinishing()) && c23034 != null && c23034.m51196();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m15401() {
        return this.f16774;
    }

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final boolean m15400() {
        return this.f16785 || isFinishing() || isDestroyed();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m15390(Object obj, C18177 c18177) {
        C6807 c6807;
        return (this.f16785 || isFinishing() || isDestroyed() || (c6807 = this.f16793) == null || c6807.f21109.m27414() != c18177 || !this.f16790.m43451(obj, c18177)) ? false : true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15394(Object obj, C18177 c18177) {
        this.f16790.m43453(obj, c18177);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15385(C8218 c8218) {
        this.f16775 = c8218;
        C23034 c23034 = this.f16796;
        this.f16768 = Long.MIN_VALUE;
        this.f16795 = false;
        if (c23034 == null) {
            this.f16774 = false;
            this.f16772 = false;
        } else {
            try {
                if (this.f16762) {
                    this.f16774 = false;
                    this.f16772 = false;
                    this.f16796 = null;
                    c23034.m51197();
                } else {
                    this.f16768 = this.f16793.f21109.m27414().m42385();
                    this.f16795 = false;
                }
            } catch (IOException unused) {
            }
        }
        this.f16793.m18486();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15395(C8218 c8218) {
        if (c8218 != null) {
            this.f16775 = c8218;
        }
        m15369(false);
    }

    @Override // l.AbstractActivityC3346, l.ActivityC0737, android.app.Activity
    public final void onResume() {
        C6807 c6807;
        C23034 c23034;
        super.onResume();
        boolean z = this.f16774;
        boolean z2 = this.f16772;
        boolean zM51203 = false;
        this.f16774 = false;
        this.f16772 = false;
        if (z && z2 && !this.f16785 && !this.f16791 && (c23034 = this.f16796) != null && this.f16775 != null) {
            if (c23034.m51198()) {
                zM51203 = true;
            } else {
                try {
                    this.f16793.f21109.m27414().m42396();
                } catch (IOException unused) {
                    zM51203 = this.f16796.m51203();
                }
            }
            if (zM51203) {
                String strM51200 = this.f16796.m51200();
                this.f16770 = strM51200;
                this.f16791 = true;
                new C2846(this, strM51200, true, true).m20274();
            }
        }
        if (this.f16791 || this.f16775 == null || (c6807 = this.f16793) == null) {
            return;
        }
        C18177 c18177M27414 = c6807.f21109.m27414();
        if (this.f16790.m43452(c18177M27414)) {
            return;
        }
        try {
            c18177M27414.m42396();
            m15386(c18177M27414, this.f16775);
        } catch (IOException e) {
            m15384(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15386(C18177 c18177, C8218 c8218) {
        if (this.f16785 || this.f16791 || this.f16788 != null || this.f16790.m43452(c18177)) {
            return;
        }
        C0456 c0456 = new C0456(this, c18177, c8218);
        this.f16788 = c0456;
        try {
            c0456.m20274();
        } catch (RuntimeException unused) {
            this.f16788 = null;
            m10235(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final void m15392() {
        C6807 c6807;
        C18177 c18177M27414;
        this.f16770 = null;
        this.f16791 = false;
        if (this.f16785 || (c6807 = this.f16793) == null || this.f16775 == null || (c18177M27414 = c6807.f21109.m27414()) == null) {
            return;
        }
        m15386(c18177M27414, this.f16775);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m15397() {
        C6807 c6807;
        if (this.f16785 || !this.f16791 || (c6807 = this.f16793) == null) {
            return false;
        }
        C18177 c18177M27414 = c6807.f21109.m27414();
        try {
            c18177M27414.m42396();
            return !this.f16785 && this.f16793.f21109.m27414() == c18177M27414;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m15377(int i) {
        TextView textView = (TextView) m10241(i);
        textView.setOnClickListener(this);
        this.f16793.getClass();
        textView.setTypeface(C10607.f31833);
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC1252, l.ActivityC23809, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws Throwable {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            this.f16783.setVisibility(8);
            this.f16780.m37253(8);
            this.f16779.m37253(1);
            m15378(false);
            return;
        }
        this.f16783.setVisibility(0);
        this.f16780.m37253(16);
        this.f16779.m37253(2);
        m15378(true);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m15378(boolean z) {
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

    @Override // l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C20836 c20836M42387;
        Throwable th;
        Throwable th2;
        boolean z;
        long j;
        C23034 c23034M51185;
        boolean z2;
        boolean z3 = this.f16772;
        this.f16774 = false;
        this.f16772 = false;
        ViewOnClickListenerC19156 viewOnClickListenerC19156 = this.f16769;
        if (viewOnClickListenerC19156 != null) {
            viewOnClickListenerC19156.m44233();
        }
        C6807 c6807 = this.f16793;
        if (c6807 != null) {
            c6807.m18495();
            this.f16793.m18493();
        }
        C6807 c6808 = this.f16793;
        C18177 c18177M27414 = c6808 == null ? null : c6808.f21109.m27414();
        C8218 c8218 = this.f16775;
        if (c8218 == null || c18177M27414 == null) {
            c20836M42387 = null;
            th = null;
        } else {
            try {
                c20836M42387 = c18177M27414.m42387();
                th = null;
            } catch (Throwable th3) {
                th = th3;
                c20836M42387 = null;
            }
            this.f16761 = new C3551(this.f16767, this.f16763, this.f16784, this.f16793.m18474(c20836M42387 == null ? null : c20836M42387.m47651()));
        }
        C3551 c3551 = this.f16761;
        if (c3551 != null) {
            bundle.putBoolean("hex_ui_present", true);
            bundle.putBoolean("hex_ui_keyboard_showing", c3551.f11287);
            bundle.putBoolean("hex_ui_keyboard_enable", c3551.f11286);
            bundle.putBoolean("hex_ui_hex_mode", c3551.f11285);
            C23740 c23740 = c3551.f11288;
            bundle.putLong("hex_ui_scroll", c23740.f76868);
            bundle.putInt("hex_ui_selection_start", c23740.f76870);
            bundle.putInt("hex_ui_selection_end", c23740.f76871);
            bundle.putBoolean("hex_ui_select_hex_first", c23740.f76869);
            bundle.putBoolean("hex_ui_multi_select", c23740.f76867);
        }
        String str = this.f16770;
        if (str != null && (this.f16775 == null || this.f16791)) {
            bundle.putString("hex_session_token", str);
            this.f16774 = true;
        } else {
            C23034 c23034 = this.f16796;
            if (!this.f16791 && c18177M27414 != null && c8218 != null && c20836M42387 != null) {
                try {
                    boolean z4 = !m15393() && c20836M42387.m47649();
                    long jM47650 = c20836M42387.m47650();
                    if (!z4 && this.f16762) {
                        this.f16768 = Long.MIN_VALUE;
                        this.f16795 = false;
                        if (c23034 != null) {
                            this.f16796 = null;
                            c23034.m51197();
                        }
                    } else if (c23034 != null && this.f16768 == jM47650 && this.f16795 == z4 && c23034.m51196()) {
                        bundle.putString("hex_session_token", c23034.m51200());
                        this.f16774 = true;
                        this.f16772 = z3;
                    } else {
                        if (c23034 == null) {
                            c23034M51185 = C23034.m51185();
                            z2 = true;
                        } else {
                            c23034M51185 = c23034;
                            z2 = false;
                        }
                        try {
                            C6101 c6101M31004 = C12723.m31004(c23034M51185, c8218, this.f16762, c18177M27414, z4, this.f16781, !this.f16790.m43452(c18177M27414), this.f16800);
                            bundle.putString("hex_session_token", c23034M51185.m51200());
                            this.f16774 = true;
                            this.f16772 = true;
                            this.f16768 = c6101M31004.m17016();
                            this.f16795 = z4;
                            if (z2) {
                                this.f16796 = c23034M51185;
                            }
                        } catch (Throwable th4) {
                            c23034 = c23034M51185;
                            j = Long.MIN_VALUE;
                            boolean z5 = z2;
                            th2 = th4;
                            z = z5;
                            this.f16768 = j;
                            this.f16795 = false;
                            if (z) {
                                try {
                                    c23034.m51197();
                                } catch (IOException e) {
                                    th2.addSuppressed(e);
                                }
                            } else if (c23034 != null) {
                                try {
                                    c23034.m51199();
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
                this.f16768 = Long.MIN_VALUE;
                this.f16795 = false;
                if (c23034 != null) {
                    try {
                        c23034.m51199();
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
        this.f16787 = (InterfaceMenuItemC13827) menu.findItem(R.id.MT_Protector);
        this.f16773 = (InterfaceMenuItemC13827) menu.findItem(R.id.MT_Protector);
        this.f16789 = (InterfaceMenuItemC13827) menu.findItem(R.id.MT_Protector);
        boolean zM42394 = this.f16793.f21109.m27414().m42394();
        boolean zM27410 = this.f16793.f21109.m27410();
        boolean zM27394 = this.f16793.f21109.m27394();
        this.f16789.setEnabled(zM42394);
        this.f16773.setEnabled(zM27410);
        this.f16787.setEnabled(zM27394);
        if (!m15393()) {
            return true;
        }
        this.f16789.setVisible(false);
        this.f16773.setVisible(false);
        this.f16787.setVisible(false);
        menu.findItem(R.id.MT_Protector).setVisible(false);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            this.f16793.m18487();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            this.f16793.m18496();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m15374(false);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m15376();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            if (this.f16792.m31666(8388613)) {
                this.f16792.m31647(8388613);
            }
            this.f16792.m31665(8388611);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            if (this.f16792.m31666(8388611)) {
                this.f16792.m31647(8388611);
            }
            this.f16792.m31665(8388613);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            C1434.m4945(this.f16793);
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            return false;
        }
        final C6807 c6807 = this.f16793;
        Context context = c6807.getContext();
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (!clipboardManager.hasPrimaryClip()) {
            C21374.m48462(R.string.MT_Protector, 0).m48468();
            return true;
        }
        final CharSequence text = clipboardManager.getText();
        if (TextUtils.isEmpty(text)) {
            C21374.m48462(R.string.MT_Protector, 0).m48468();
            return true;
        }
        final C12972 c12972M31538 = C12972.m31538(c6807);
        if (c12972M31538 == null) {
            return true;
        }
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(context);
        c19258.m44418(R.array.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩵۟ܿ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C6807 c6808 = c6807;
                C11003.requireNonNull(c6808, "editView");
                CharSequence charSequence = text;
                C11003.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
                C12972 c12972 = c12972M31538;
                if (c12972.m31539(c6808)) {
                    C22145 c22145 = new C22145();
                    final C12267 c12267 = new C12267(c6808, c12972);
                    C16684 c16684M18472 = c6808.m18472(new RunnableC0272(c22145), new Runnable() { // from class: l.ۚ۟ܿ
                        @Override // java.lang.Runnable
                        public final void run() {
                            c12267.m29799();
                        }
                    });
                    if (c16684M18472 == null) {
                        C21374.m48457(R.string.MT_Protector);
                    } else if (!c12972.m31539(c6808)) {
                        c16684M18472.close();
                    } else {
                        new C21440(c6808, c22145, c12972, c16684M18472, c12267, charSequence, i2).m20274();
                    }
                }
            }
        });
        DialogInterfaceC0206 dialogInterfaceC0206M44415 = c19258.m44415();
        dialogInterfaceC0206M44415.m1445().setDimAmount(0.0f);
        dialogInterfaceC0206M44415.m1449();
        return true;
    }

    @Override // l.ActivityC2124
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2954() {
        m15376();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public void m15376() {
        if (C23196.m51454() && this.f16793.f21109.m27414().m42394()) {
            int i = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(this);
            c19258.m44436(this.f16760);
            c19258.m44416(R.string.MT_Protector);
            int i2 = 0;
            c19258.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC20919(this, i2));
            c19258.m44434(R.string.MT_Protector, new DialogInterfaceOnClickListenerC9630(this, i2));
            c19258.m44438();
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    public final void finish() {
        this.f16759 = true;
        C23034 c23034 = this.f16796;
        String str = this.f16770;
        this.f16796 = null;
        this.f16770 = null;
        if (c23034 != null) {
            try {
                c23034.m51197();
            } catch (IOException unused) {
            }
        }
        if (str != null && (c23034 == null || !str.equals(c23034.m51200()))) {
            try {
                C23034.m51183(str);
            } catch (IOException unused2) {
            }
        }
        super.finish();
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onDestroy() {
        boolean z = true;
        this.f16785 = true;
        ViewOnClickListenerC19156 viewOnClickListenerC19156 = this.f16769;
        if (viewOnClickListenerC19156 != null) {
            viewOnClickListenerC19156.m44233();
        }
        C6807 c6807 = this.f16793;
        if (c6807 != null) {
            c6807.m18495();
            boolean zM18493 = this.f16793.m18493();
            C18177 c18177M27414 = this.f16793.f21109.m27414();
            if (c18177M27414 != null) {
                RunnableC19508 runnableC19508 = new RunnableC19508(c18177M27414);
                if (!zM18493) {
                    runnableC19508.run();
                } else {
                    try {
                        this.f16764.execute(runnableC19508);
                    } catch (Error | RuntimeException unused) {
                        if (!this.f16793.m18484(runnableC19508)) {
                            runnableC19508.run();
                        }
                    }
                }
            }
        }
        C11041.m27374(getCacheDir());
        C23034 c23034 = this.f16796;
        if (c23034 != null) {
            boolean z2 = this.f16774;
            if (!this.f16759 && !isFinishing()) {
                z = false;
            }
            if (!z2 || z || !c23034.m51196()) {
                this.f16796 = null;
                try {
                    c23034.m51197();
                } catch (IOException unused2) {
                }
            }
        }
        super.onDestroy();
    }

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    private void m15371() {
        if (this.f16793.f21109.m27406() || m15393() || this.f16767) {
            return;
        }
        this.f16767 = true;
        ObjectAnimator objectAnimator = this.f16782;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f16782 = null;
        }
        View view = this.f16765;
        view.setTranslationY(view.getHeight());
        this.f16765.setVisibility(0);
        View view2 = this.f16765;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, "translationY", view2.getHeight(), 0.0f);
        this.f16782 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
        this.f16782.setInterpolator(new DecelerateInterpolator());
        this.f16782.addListener(new C2574(this));
        this.f16782.start();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m15398() {
        if (this.f16767) {
            this.f16767 = false;
            ObjectAnimator objectAnimator = this.f16782;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.f16782 = null;
            }
            this.f16776.setVisibility(8);
            View view = this.f16765;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", 0.0f, view.getHeight());
            this.f16782 = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(200L);
            this.f16782.setInterpolator(new AccelerateInterpolator());
            this.f16782.addListener(new C3985(this));
            this.f16782.start();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.MT_Protector) {
            this.f16793.m18492(0);
            return;
        }
        if (id == R.id.button1) {
            this.f16793.m18492(1);
            return;
        }
        if (id == R.id.button2) {
            this.f16793.m18492(2);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f16793.m18492(3);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f16793.m18492(4);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f16793.m18492(5);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f16793.m18492(6);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f16793.m18492(7);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f16793.m18492(8);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f16793.m18492(9);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f16793.m18492(10);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f16793.m18492(11);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f16793.m18492(12);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f16793.m18492(13);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f16793.m18492(14);
            return;
        }
        if (id == R.id.MT_Protector) {
            this.f16793.m18492(15);
            return;
        }
        if (id != R.id.MT_Protector) {
            if (id == R.id.MT_Protector) {
                this.f16784 = !this.f16784;
                m15383(this.f16793.f21109.m27418(), this.f16793.f21109.m27404(), this.f16793.f21109.m27415(), this.f16793.f21109.m27406());
                return;
            }
            return;
        }
        if (this.f16763) {
            this.f16763 = false;
            this.f16778.setAlpha(0.3f);
            m15398();
        } else {
            this.f16763 = true;
            this.f16778.setAlpha(1.0f);
            m15371();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15383(int i, int i2, int i3, boolean z) {
        if (z) {
            if (this.f16763) {
                m15398();
            }
            this.f16771.setText(String.format(Locale.ENGLISH, this.f16784 ? "Sel: %Xh - %Xh  Len: %Xh  Size: %Xh [HEX]" : "Sel: %d - %d  Len: %d  Size: %d [DEC]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf((i2 - i) + 1), Integer.valueOf(i3)));
        } else {
            if (i < i3) {
                String str = this.f16784 ? "Val: %Xh  Pos: %Xh  Size: %Xh [HEX]" : "Val: %d  Pos: %d  Size: %d [DEC]";
                try {
                    byte[] bArr = new byte[1];
                    this.f16793.f21109.m27414().m42392(i, 1, bArr);
                    this.f16771.setText(String.format(Locale.ENGLISH, str, Integer.valueOf(bArr[0] & 255), Integer.valueOf(i), Integer.valueOf(i3)));
                    return;
                } catch (IOException e) {
                    m15384(e);
                    return;
                }
            }
            this.f16771.setText(String.format(Locale.ENGLISH, this.f16784 ? "Size: %Xh [HEX]" : "Size: %d [DEC]", Integer.valueOf(i3)));
        }
    }

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final void m15396() {
        if (this.f16763) {
            m15371();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15384(IOException iOException) {
        C18177 c18177M27414 = this.f16793.f21109.m27414();
        if (!(iOException instanceof C5519) && !c18177M27414.m42395()) {
            m10223(iOException, (DialogInterface.OnDismissListener) null);
        } else {
            m15369(true);
        }
    }

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final void m15399() {
        m15369(false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m15369(boolean z) {
        if (this.f16791 || this.f16785) {
            return;
        }
        this.f16791 = true;
        ViewOnClickListenerC19156 viewOnClickListenerC19156 = this.f16769;
        if (viewOnClickListenerC19156 != null) {
            viewOnClickListenerC19156.m44233();
        }
        this.f16793.m18495();
        this.f16793.m18493();
        String strM51200 = null;
        this.f16761 = new C3551(this.f16767, this.f16763, this.f16784, this.f16793.m18474((C4607) null));
        C23034 c23034 = this.f16796;
        if (z && c23034 != null && c23034.m51203()) {
            strM51200 = c23034.m51200();
        }
        this.f16770 = strM51200;
        new C2846(this, strM51200, true, false).m20274();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15389(boolean z, boolean z2, boolean z3) {
        if (this.f16799 != z3) {
            this.f16799 = z3;
            this.f10584.setSubtitle(z3 ? C9045.m23341(new StringBuilder(), this.f16760, " *") : this.f16760);
        }
        InterfaceMenuItemC13827 interfaceMenuItemC13827 = this.f16789;
        if (interfaceMenuItemC13827 != null) {
            interfaceMenuItemC13827.setEnabled(z3);
        }
        InterfaceMenuItemC13827 interfaceMenuItemC13828 = this.f16773;
        if (interfaceMenuItemC13828 != null) {
            interfaceMenuItemC13828.setEnabled(z);
        }
        InterfaceMenuItemC13827 interfaceMenuItemC13829 = this.f16787;
        if (interfaceMenuItemC13829 != null) {
            interfaceMenuItemC13829.setEnabled(z2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15388(boolean z) {
        C13064 c13064;
        int i;
        if (z) {
            c13064 = this.f16792;
            i = 1;
        } else {
            c13064 = this.f16792;
            i = 0;
        }
        c13064.m31648(i, 3);
        c13064.m31648(i, 5);
    }

    @Override // l.InterfaceC8126
    public final void onDrawerOpened(View view) {
        if (view.getId() == R.id.MT_Protector) {
            this.f16801 = true;
        } else {
            this.f16794 = true;
        }
    }

    @Override // l.InterfaceC8126
    public final void onDrawerClosed(View view) {
        if (view.getId() == R.id.MT_Protector) {
            this.f16801 = false;
        } else {
            this.f16794 = false;
        }
    }

    @Override // l.InterfaceC8126
    public final void onDrawerStateChanged(int i) {
        if (i == 2 && this.f16801) {
            this.f16769.m44235();
            if (this.f16797 == null) {
                InputMethodManager inputMethodManager = (InputMethodManager) getApplicationContext().getSystemService("input_method");
                this.f16797 = inputMethodManager;
                if (inputMethodManager == null) {
                    return;
                }
            }
            this.f16797.hideSoftInputFromWindow(this.f16793.getWindowToken(), 0);
            return;
        }
        if (i != 0) {
            if (this.f16794 || !this.f16786) {
                return;
            }
            this.f16798.m46453();
            this.f16786 = false;
            return;
        }
        this.f16786 = true;
    }

    @Override // l.InterfaceC2452
    /* JADX INFO: renamed from: ֫ */
    public final void mo1728(C16040 c16040) {
        if (((C11955) c16040.m37919()).m29191()) {
            C11955 c11955 = new C11955();
            c11955.m29154(this.f16793.f21109.m27414());
            c16040.m37918(c11955);
        } else {
            C11955 c11956 = new C11955();
            c11956.m29152(this.f16793.f21109.m27415());
            c16040.m37918(c11956);
        }
    }
}
