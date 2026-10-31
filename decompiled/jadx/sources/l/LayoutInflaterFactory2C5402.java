package l;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AppCompatViewInflater;
import com.alipay.sdk.m.t0.b;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes3.dex */
public final class LayoutInflaterFactory2C5402 extends AbstractC13246 implements InterfaceC19994, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public OnBackInvokedDispatcher f16818;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public boolean f16819;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public PopupWindow f16820;

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public C0462 f16821;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final Context f16822;

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public Window f16823;

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public int f16824;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public boolean f16825;

    /* JADX INFO: renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public boolean f16826;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public final Object f16827;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public Configuration f16828;

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public int f16829;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public C8930 f16830;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public Rect f16831;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC3557 f16832;

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public boolean f16833;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public C15530 f16834;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public boolean f16835;

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public CharSequence f16836;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public OnBackInvokedCallback f16837;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public int f16838;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public boolean f16839;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C22524 f16840;

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public C19514[] f16841;

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public boolean f16842;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final Runnable f16843;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public boolean f16844;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C11047 f16845;

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public boolean f16846;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public AppCompatViewInflater f16847;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public ViewGroup f16848;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public boolean f16849;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public boolean f16850;

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public TextView f16851;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public int f16852;

    /* JADX INFO: renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public C19514 f16853;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final Object f16854;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public View f16855;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public boolean f16856;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public Runnable f16857;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC19556 f16858;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public boolean f16859;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public boolean f16860;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public C3991 f16861;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public Rect f16862;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public boolean f16863;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public boolean f16864;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public AbstractC10446 f16865;

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public C7790 f16866;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public C9636 f16867;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public boolean f16868;

    /* JADX INFO: renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public static final C3432 f16817 = new C3432();

    /* JADX INFO: renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f16815 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public static final boolean f16816 = !"robolectric".equals(Build.FINGERPRINT);

    public LayoutInflaterFactory2C5402(ActivityC1252 activityC1252, ActivityC1252 activityC1253) {
        this(activityC1252, null, activityC1253, activityC1252);
    }

    public LayoutInflaterFactory2C5402(DialogC8224 dialogC8224, DialogC8224 dialogC8225) {
        this(dialogC8224.getContext(), dialogC8224.getWindow(), dialogC8225, dialogC8224);
    }

    public LayoutInflaterFactory2C5402(Context context, Window window, InterfaceC8308 interfaceC8308, Object obj) {
        ActivityC1252 activityC1252;
        this.f16834 = null;
        this.f16864 = true;
        this.f16829 = -100;
        this.f16843 = new RunnableC12541(this);
        this.f16822 = context;
        this.f16854 = interfaceC8308;
        this.f16827 = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof ActivityC1252) {
                        activityC1252 = (ActivityC1252) context;
                        break;
                    } else if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                activityC1252 = null;
                break;
            }
            if (activityC1252 != null) {
                this.f16829 = activityC1252.m4113().mo15465();
            }
        }
        if (this.f16829 == -100) {
            String name = this.f16827.getClass().getName();
            C3432 c3432 = f16817;
            Integer num = (Integer) c3432.getOrDefault(name, null);
            if (num != null) {
                this.f16829 = num.intValue();
                c3432.remove(this.f16827.getClass().getName());
            }
        }
        if (window != null) {
            m15417(window);
        }
        C5965.m16701();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15447() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.f16818 != null && (m15448(0).f63061 || this.f16832 != null)) {
                z = true;
            }
            if (z && this.f16837 == null) {
                this.f16837 = C20925.m47751((Object) this.f16818, this);
            } else {
                if (z || (onBackInvokedCallback = this.f16837) == null) {
                    return;
                }
                C20925.m47753(this.f16818, onBackInvokedCallback);
                this.f16837 = null;
            }
        }
    }

    @Override // l.AbstractC13246
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Context mo15431(Context context) {
        this.f16835 = true;
        int iM32148 = this.f16829;
        if (iM32148 == -100) {
            iM32148 = AbstractC13246.m32148();
        }
        int iM15429 = m15429(context, iM32148);
        if (AbstractC13246.m32145(context)) {
            AbstractC13246.m32146(context);
        }
        C3931 c3931M15428 = m15428(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(m15416(context, iM15429, c3931M15428, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C12729) {
            try {
                ((C12729) context).m31026(m15416(context, iM15429, c3931M15428, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f16816) {
            return context;
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f = configuration3.fontScale;
                float f2 = configuration4.fontScale;
                if (f != f2) {
                    configuration.fontScale = f2;
                }
                int i = configuration3.mcc;
                int i2 = configuration4.mcc;
                if (i != i2) {
                    configuration.mcc = i2;
                }
                int i3 = configuration3.mnc;
                int i4 = configuration4.mnc;
                if (i3 != i4) {
                    configuration.mnc = i4;
                }
                int i5 = Build.VERSION.SDK_INT;
                if (i5 < 24) {
                    if (!C11003.equals(configuration3.locale, configuration4.locale)) {
                        configuration.locale = configuration4.locale;
                    }
                } else {
                    C14573.m34824(configuration3, configuration4, configuration);
                }
                int i6 = configuration3.touchscreen;
                int i7 = configuration4.touchscreen;
                if (i6 != i7) {
                    configuration.touchscreen = i7;
                }
                int i8 = configuration3.keyboard;
                int i9 = configuration4.keyboard;
                if (i8 != i9) {
                    configuration.keyboard = i9;
                }
                int i10 = configuration3.keyboardHidden;
                int i11 = configuration4.keyboardHidden;
                if (i10 != i11) {
                    configuration.keyboardHidden = i11;
                }
                int i12 = configuration3.navigation;
                int i13 = configuration4.navigation;
                if (i12 != i13) {
                    configuration.navigation = i13;
                }
                int i14 = configuration3.navigationHidden;
                int i15 = configuration4.navigationHidden;
                if (i14 != i15) {
                    configuration.navigationHidden = i15;
                }
                int i16 = configuration3.orientation;
                int i17 = configuration4.orientation;
                if (i16 != i17) {
                    configuration.orientation = i17;
                }
                int i18 = configuration3.screenLayout & 15;
                int i19 = configuration4.screenLayout & 15;
                if (i18 != i19) {
                    configuration.screenLayout |= i19;
                }
                int i20 = configuration3.screenLayout & 192;
                int i21 = configuration4.screenLayout & 192;
                if (i20 != i21) {
                    configuration.screenLayout |= i21;
                }
                int i22 = configuration3.screenLayout & 48;
                int i23 = configuration4.screenLayout & 48;
                if (i22 != i23) {
                    configuration.screenLayout |= i23;
                }
                int i24 = configuration3.screenLayout & 768;
                int i25 = configuration4.screenLayout & 768;
                if (i24 != i25) {
                    configuration.screenLayout |= i25;
                }
                if (i5 >= 26) {
                    C23746.m52392(configuration3, configuration4, configuration);
                }
                int i26 = configuration3.uiMode & 15;
                int i27 = configuration4.uiMode & 15;
                if (i26 != i27) {
                    configuration.uiMode |= i27;
                }
                int i28 = configuration3.uiMode & 48;
                int i29 = configuration4.uiMode & 48;
                if (i28 != i29) {
                    configuration.uiMode |= i29;
                }
                int i30 = configuration3.screenWidthDp;
                int i31 = configuration4.screenWidthDp;
                if (i30 != i31) {
                    configuration.screenWidthDp = i31;
                }
                int i32 = configuration3.screenHeightDp;
                int i33 = configuration4.screenHeightDp;
                if (i32 != i33) {
                    configuration.screenHeightDp = i33;
                }
                int i34 = configuration3.smallestScreenWidthDp;
                int i35 = configuration4.smallestScreenWidthDp;
                if (i34 != i35) {
                    configuration.smallestScreenWidthDp = i35;
                }
                int i36 = configuration3.densityDpi;
                int i37 = configuration4.densityDpi;
                if (i36 != i37) {
                    configuration.densityDpi = i37;
                }
            }
        }
        Configuration configurationM15416 = m15416(context, iM15429, c3931M15428, configuration, true);
        C12729 c12729 = new C12729(context, bin.mt.plus.R.style.MT_Protector);
        c12729.m31026(configurationM15416);
        try {
            if (context.getTheme() != null) {
                C19892.m45746(c12729.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return c12729;
    }

    @Override // l.AbstractC13246
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo15468() {
        String strM42602;
        this.f16835 = true;
        m15420(false, true);
        m15427();
        Object obj = this.f16827;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strM42602 = C18270.m42602(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strM42602 = null;
            }
            if (strM42602 != null) {
                AbstractC10446 abstractC10446 = this.f16865;
                if (abstractC10446 == null) {
                    this.f16819 = true;
                } else {
                    abstractC10446.mo26296(true);
                }
            }
            AbstractC13246.m32139(this);
        }
        this.f16828 = new Configuration(this.f16822.getResources().getConfiguration());
        this.f16825 = true;
    }

    @Override // l.AbstractC13246
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void mo15451() {
        m15421();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m15443(int i, KeyEvent keyEvent) {
        m15426();
        AbstractC10446 abstractC10446 = this.f16865;
        if (abstractC10446 == null || !abstractC10446.mo26293(i, keyEvent)) {
            C19514 c19514 = this.f16853;
            if (c19514 != null && m15419(c19514, keyEvent.getKeyCode(), keyEvent)) {
                C19514 c19515 = this.f16853;
                if (c19515 != null) {
                    c19515.f63073 = true;
                    return true;
                }
            } else {
                if (this.f16853 == null) {
                    C19514 c19514M15448 = m15448(0);
                    m15425(c19514M15448, keyEvent);
                    boolean zM15419 = m15419(c19514M15448, keyEvent.getKeyCode(), keyEvent);
                    c19514M15448.f63072 = false;
                    if (zM15419) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC13246
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void mo15446() {
        m15426();
        AbstractC10446 abstractC10446 = this.f16865;
        if (abstractC10446 != null) {
            abstractC10446.mo26303(false);
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m15453(int i) {
        if (i == 108) {
            m15426();
            AbstractC10446 abstractC10446 = this.f16865;
            if (abstractC10446 != null) {
                abstractC10446.mo26291(false);
                return;
            }
            return;
        }
        if (i == 0) {
            C19514 c19514M15448 = m15448(i);
            if (c19514M15448.f63061) {
                m15442(c19514M15448, false);
            }
        }
    }

    @Override // l.AbstractC13246
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC10446 mo15458() {
        m15426();
        return this.f16865;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final Context m15459() {
        m15426();
        AbstractC10446 abstractC10446 = this.f16865;
        Context contextMo26302 = abstractC10446 != null ? abstractC10446.mo26302() : null;
        return contextMo26302 == null ? this.f16822 : contextMo26302;
    }

    @Override // l.AbstractC13246
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void mo15460() {
        m15426();
        AbstractC10446 abstractC10446 = this.f16865;
        if (abstractC10446 != null) {
            abstractC10446.mo26303(true);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m15469(int i) {
        if (i == 108) {
            m15426();
            AbstractC10446 abstractC10446 = this.f16865;
            if (abstractC10446 != null) {
                abstractC10446.mo26291(true);
            }
        }
    }

    @Override // l.AbstractC13246
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void mo15449() {
        if (this.f16865 != null) {
            m15426();
            if (this.f16865.mo26301()) {
                return;
            }
            m15422(0);
        }
    }

    @Override // l.InterfaceC19994
    public final boolean onMenuItemSelected(C3060 c3060, MenuItem menuItem) {
        C19514 c19514M15454;
        Window.Callback callback = this.f16823.getCallback();
        if (callback == null || this.f16859 || (c19514M15454 = m15454(c3060.getRootMenu())) == null) {
            return false;
        }
        return callback.onMenuItemSelected(c19514M15454.f63069, menuItem);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m15426() {
        m15421();
        if (this.f16860 && this.f16865 == null) {
            Object obj = this.f16827;
            if (obj instanceof Activity) {
                this.f16865 = new C17668((Activity) obj, this.f16846);
            } else if (obj instanceof Dialog) {
                this.f16865 = new C17668((Dialog) obj);
            }
            AbstractC10446 abstractC10446 = this.f16865;
            if (abstractC10446 != null) {
                abstractC10446.mo26296(this.f16819);
            }
        }
    }

    @Override // l.AbstractC13246
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo15441(C9762 c9762) {
        CharSequence title;
        Object obj = this.f16827;
        if (obj instanceof Activity) {
            m15426();
            AbstractC10446 abstractC10446 = this.f16865;
            if (abstractC10446 instanceof C17668) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f16866 = null;
            if (abstractC10446 != null) {
                abstractC10446.mo26304();
            }
            this.f16865 = null;
            if (c9762 == null) {
                this.f16867.m24554((InterfaceC1874) null);
            } else {
                if (obj instanceof Activity) {
                    title = ((Activity) obj).getTitle();
                } else {
                    title = this.f16836;
                }
                C11752 c11752 = new C11752(c9762, title, this.f16867);
                this.f16865 = c11752;
                this.f16867.m24554(c11752.f35084);
                c9762.setBackInvokedCallbackEnabled(true);
            }
            mo15449();
        }
    }

    @Override // l.AbstractC13246
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final MenuInflater mo15463() {
        if (this.f16866 == null) {
            m15426();
            AbstractC10446 abstractC10446 = this.f16865;
            this.f16866 = new C7790(abstractC10446 != null ? abstractC10446.mo26302() : this.f16822);
        }
        return this.f16866;
    }

    @Override // l.AbstractC13246
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View mo15432(int i) {
        m15421();
        return this.f16823.findViewById(i);
    }

    @Override // l.AbstractC13246
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo15436(Configuration configuration) {
        if (this.f16860 && this.f16868) {
            m15426();
            AbstractC10446 abstractC10446 = this.f16865;
            if (abstractC10446 != null) {
                abstractC10446.mo26298();
            }
        }
        C5965 c5965M16700 = C5965.m16700();
        Context context = this.f16822;
        c5965M16700.m16703(context);
        this.f16828 = new Configuration(context.getResources().getConfiguration());
        m15420(false, false);
    }

    @Override // l.AbstractC13246
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo15445() {
        m15420(true, false);
    }

    @Override // l.AbstractC13246
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo15437(View view) {
        m15421();
        ViewGroup viewGroup = (ViewGroup) this.f16848.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f16867.m24552(this.f16823.getCallback());
    }

    @Override // l.AbstractC13246
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo15462(int i) {
        m15421();
        ViewGroup viewGroup = (ViewGroup) this.f16848.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f16822).inflate(i, viewGroup);
        this.f16867.m24552(this.f16823.getCallback());
    }

    @Override // l.AbstractC13246
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo15455(View view, ViewGroup.LayoutParams layoutParams) {
        m15421();
        ViewGroup viewGroup = (ViewGroup) this.f16848.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f16867.m24552(this.f16823.getCallback());
    }

    @Override // l.AbstractC13246
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo15438(View view, ViewGroup.LayoutParams layoutParams) {
        m15421();
        ((ViewGroup) this.f16848.findViewById(R.id.content)).addView(view, layoutParams);
        this.f16867.m24552(this.f16823.getCallback());
    }

    @Override // l.AbstractC13246
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void mo15452() {
        Object obj = this.f16827;
        boolean z = obj instanceof Activity;
        if (z) {
            AbstractC13246.m32142(this);
        }
        if (this.f16844) {
            this.f16823.getDecorView().removeCallbacks(this.f16843);
        }
        this.f16859 = true;
        int i = this.f16829;
        C3432 c3432 = f16817;
        if (i != -100 && z && ((Activity) obj).isChangingConfigurations()) {
            c3432.put(obj.getClass().getName(), Integer.valueOf(this.f16829));
        } else {
            c3432.remove(obj.getClass().getName());
        }
        AbstractC10446 abstractC10446 = this.f16865;
        if (abstractC10446 != null) {
            abstractC10446.mo26304();
        }
        C3991 c3991 = this.f16861;
        if (c3991 != null) {
            c3991.m8178();
        }
        C8930 c8930 = this.f16830;
        if (c8930 != null) {
            c8930.m8178();
        }
    }

    @Override // l.AbstractC13246
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo15464(int i) {
        this.f16838 = i;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m15427() {
        if (this.f16823 == null) {
            Object obj = this.f16827;
            if (obj instanceof Activity) {
                m15417(((Activity) obj).getWindow());
            }
        }
        if (this.f16823 == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15417(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.f16823 != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof C9636) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        C9636 c9636 = new C9636(this, callback);
        this.f16867 = c9636;
        window.setCallback(c9636);
        C22733 c22733M50795 = C22733.m50795(this.f16822, (AttributeSet) null, f16815);
        Drawable drawableM50812 = c22733M50795.m50812(0);
        if (drawableM50812 != null) {
            window.setBackgroundDrawable(drawableM50812);
        }
        c22733M50795.m50813();
        this.f16823 = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f16818) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f16837) != null) {
            C20925.m47753(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f16837 = null;
        }
        Object obj = this.f16827;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f16818 = C20925.m47752(activity);
            } else {
                this.f16818 = null;
            }
        } else {
            this.f16818 = null;
        }
        m15447();
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m15421() {
        ViewGroup viewGroup;
        CharSequence title;
        if (this.f16868) {
            return;
        }
        Context context = this.f16822;
        int[] iArr = C3390.f10705;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            mo15457(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, false)) {
            mo15457(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            mo15457(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            mo15457(10);
        }
        this.f16839 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m15427();
        this.f16823.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (!this.f16826) {
            if (this.f16839) {
                viewGroup = (ViewGroup) layoutInflaterFrom.inflate(bin.mt.plus.R.layout.MT_Protector, (ViewGroup) null);
                this.f16846 = false;
                this.f16860 = false;
            } else if (this.f16860) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(bin.mt.plus.R.attr.MT_Protector, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C12729(context, typedValue.resourceId) : context).inflate(bin.mt.plus.R.layout.MT_Protector, (ViewGroup) null);
                InterfaceC19556 interfaceC19556 = (InterfaceC19556) viewGroup.findViewById(bin.mt.plus.R.id.MT_Protector);
                this.f16858 = interfaceC19556;
                interfaceC19556.mo26433(this.f16823.getCallback());
                if (this.f16846) {
                    this.f16858.mo26431(109);
                }
                if (this.f16863) {
                    this.f16858.mo26431(2);
                }
                if (this.f16849) {
                    this.f16858.mo26431(5);
                }
            } else {
                viewGroup = null;
            }
        } else {
            viewGroup = this.f16833 ? (ViewGroup) layoutInflaterFrom.inflate(bin.mt.plus.R.layout.MT_Protector, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(bin.mt.plus.R.layout.MT_Protector, (ViewGroup) null);
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f16860 + ", windowActionBarOverlay: " + this.f16846 + ", android:windowIsFloating: " + this.f16839 + ", windowActionModeOverlay: " + this.f16833 + ", windowNoTitle: " + this.f16826 + " }");
        }
        C17648.m41310(viewGroup, new C10425(this));
        if (this.f16858 == null) {
            this.f16851 = (TextView) viewGroup.findViewById(bin.mt.plus.R.id.MT_Protector);
        }
        int i = C22461.f72738;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        C18850 c18850 = (C18850) viewGroup.findViewById(bin.mt.plus.R.id.MT_Protector);
        ViewGroup viewGroup2 = (ViewGroup) this.f16823.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                c18850.addView(childAt);
            }
            viewGroup2.setId(-1);
            c18850.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f16823.setContentView(viewGroup);
        c18850.m43550(new C6191(this));
        this.f16848 = viewGroup;
        Object obj = this.f16827;
        if (obj instanceof Activity) {
            title = ((Activity) obj).getTitle();
        } else {
            title = this.f16836;
        }
        if (!TextUtils.isEmpty(title)) {
            InterfaceC19556 interfaceC19557 = this.f16858;
            if (interfaceC19557 == null) {
                AbstractC10446 abstractC10446 = this.f16865;
                if (abstractC10446 != null) {
                    abstractC10446.mo26290(title);
                } else {
                    TextView textView = this.f16851;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            } else {
                interfaceC19557.mo26434(title);
            }
        }
        C18850 c18851 = (C18850) this.f16848.findViewById(R.id.content);
        View decorView = this.f16823.getDecorView();
        c18851.m43549(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, c18851.m43554());
        typedArrayObtainStyledAttributes2.getValue(q.h, c18851.m43552());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, c18851.m43553());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, c18851.m43555());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(UMErrorCode.E_UM_BE_NOT_MAINPROCESS)) {
            typedArrayObtainStyledAttributes2.getValue(UMErrorCode.E_UM_BE_NOT_MAINPROCESS, c18851.m43548());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(UMErrorCode.E_UM_BE_EMPTY_URL_PATH)) {
            typedArrayObtainStyledAttributes2.getValue(UMErrorCode.E_UM_BE_EMPTY_URL_PATH, c18851.m43551());
        }
        typedArrayObtainStyledAttributes2.recycle();
        c18851.requestLayout();
        this.f16868 = true;
        C19514 c19514M15448 = m15448(0);
        if (this.f16859 || c19514M15448.f63066 != null) {
            return;
        }
        m15422(108);
    }

    @Override // l.AbstractC13246
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo15457(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.f16826 && i == 108) {
            return false;
        }
        if (this.f16860 && i == 1) {
            this.f16860 = false;
        }
        if (i == 1) {
            m15423();
            this.f16826 = true;
            return true;
        }
        if (i == 2) {
            m15423();
            this.f16863 = true;
            return true;
        }
        if (i == 5) {
            m15423();
            this.f16849 = true;
            return true;
        }
        if (i == 10) {
            m15423();
            this.f16833 = true;
            return true;
        }
        if (i == 108) {
            m15423();
            this.f16860 = true;
            return true;
        }
        if (i == 109) {
            m15423();
            this.f16846 = true;
            return true;
        }
        return this.f16823.requestFeature(i);
    }

    @Override // l.AbstractC13246
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo15439(CharSequence charSequence) {
        this.f16836 = charSequence;
        InterfaceC19556 interfaceC19556 = this.f16858;
        if (interfaceC19556 == null) {
            AbstractC10446 abstractC10446 = this.f16865;
            if (abstractC10446 != null) {
                abstractC10446.mo26290(charSequence);
                return;
            }
            TextView textView = this.f16851;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        interfaceC19556.mo26434(charSequence);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.۠ܿ] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC3557 m15433(C6379 c6379) {
        AbstractC3557 abstractC3557OnWindowStartingSupportActionMode;
        AbstractC3557 abstractC3557 = this.f16832;
        if (abstractC3557 != null) {
            abstractC3557.mo10824();
        }
        C18102 c18102 = new C18102(this, c6379);
        m15426();
        AbstractC10446 abstractC10446 = this.f16865;
        ?? r1 = this.f16854;
        if (abstractC10446 != null) {
            AbstractC3557 abstractC3557Mo26287 = abstractC10446.mo26287(c18102);
            this.f16832 = abstractC3557Mo26287;
            if (abstractC3557Mo26287 != null && r1 != 0) {
                r1.onSupportActionModeStarted(abstractC3557Mo26287);
            }
        }
        if (this.f16832 == null) {
            C15530 c15530 = this.f16834;
            if (c15530 != null) {
                c15530.m36598();
            }
            AbstractC3557 abstractC3558 = this.f16832;
            if (abstractC3558 != null) {
                abstractC3558.mo10824();
            }
            if (r1 == 0 || this.f16859) {
                abstractC3557OnWindowStartingSupportActionMode = null;
            } else {
                try {
                    abstractC3557OnWindowStartingSupportActionMode = r1.onWindowStartingSupportActionMode(c18102);
                } catch (AbstractMethodError unused) {
                    abstractC3557OnWindowStartingSupportActionMode = null;
                }
            }
            if (abstractC3557OnWindowStartingSupportActionMode != null) {
                this.f16832 = abstractC3557OnWindowStartingSupportActionMode;
            } else {
                if (this.f16840 == null) {
                    if (this.f16839) {
                        TypedValue typedValue = new TypedValue();
                        Context context = this.f16822;
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(bin.mt.plus.R.attr.MT_Protector, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            C12729 c12729 = new C12729(context, 0);
                            c12729.getTheme().setTo(themeNewTheme);
                            context = c12729;
                        }
                        this.f16840 = new C22524(context, null);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, bin.mt.plus.R.attr.MT_Protector);
                        this.f16820 = popupWindow;
                        C0801.m3023(popupWindow, 2);
                        this.f16820.setContentView(this.f16840);
                        this.f16820.setWidth(-1);
                        context.getTheme().resolveAttribute(bin.mt.plus.R.attr.MT_Protector, typedValue, true);
                        this.f16840.mo4722(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.f16820.setHeight(-2);
                        this.f16857 = new RunnableC23124(this);
                    } else {
                        C15404 c15404 = (C15404) this.f16848.findViewById(bin.mt.plus.R.id.MT_Protector);
                        if (c15404 != null) {
                            c15404.m36453(LayoutInflater.from(m15459()));
                            this.f16840 = (C22524) c15404.m36452();
                        }
                    }
                }
                if (this.f16840 != null) {
                    C15530 c15531 = this.f16834;
                    if (c15531 != null) {
                        c15531.m36598();
                    }
                    this.f16840.m50518();
                    C10613 c10613 = new C10613(this.f16840.getContext(), this.f16840, c18102);
                    if (c18102.m42223(c10613, c10613.mo10836())) {
                        c10613.mo10839();
                        this.f16840.m50512(c10613);
                        this.f16832 = c10613;
                        if (m15467()) {
                            this.f16840.setAlpha(0.0f);
                            C15530 c15530M41298 = C17648.m41298(this.f16840);
                            c15530M41298.m36599(1.0f);
                            this.f16834 = c15530M41298;
                            c15530M41298.m36602(new C13951(this));
                        } else {
                            this.f16840.setAlpha(1.0f);
                            this.f16840.setVisibility(0);
                            if (this.f16840.getParent() instanceof View) {
                                C17648.m41339((View) this.f16840.getParent());
                            }
                        }
                        if (this.f16820 != null) {
                            this.f16823.getDecorView().post(this.f16857);
                        }
                    } else {
                        this.f16832 = null;
                    }
                }
            }
            AbstractC3557 abstractC3559 = this.f16832;
            if (abstractC3559 != null && r1 != 0) {
                r1.onSupportActionModeStarted(abstractC3559);
            }
            m15447();
            this.f16832 = this.f16832;
        }
        m15447();
        return this.f16832;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m15467() {
        ViewGroup viewGroup;
        return this.f16868 && (viewGroup = this.f16848) != null && viewGroup.isLaidOut();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m15470() {
        return this.f16864;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m15471() {
        boolean z = this.f16842;
        this.f16842 = false;
        C19514 c19514M15448 = m15448(0);
        if (!c19514M15448.f63061) {
            AbstractC3557 abstractC3557 = this.f16832;
            if (abstractC3557 == null) {
                m15426();
                AbstractC10446 abstractC10446 = this.f16865;
                if (abstractC10446 == null || !abstractC10446.mo26297()) {
                    return false;
                }
            } else {
                abstractC3557.mo10824();
                return true;
            }
        } else if (!z) {
            m15442(c19514M15448, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00ca  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m15444(KeyEvent keyEvent) {
        View decorView;
        boolean zMo26441;
        boolean zM15425;
        AudioManager audioManager;
        Object obj = this.f16827;
        if (((!(obj instanceof InterfaceC7979) && !(obj instanceof DialogC8224)) || (decorView = this.f16823.getDecorView()) == null || !C15033.m35557(decorView, keyEvent)) && (keyEvent.getKeyCode() != 82 || !this.f16867.m24555(this.f16823.getCallback(), keyEvent))) {
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode == 4) {
                    this.f16842 = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        C19514 c19514M15448 = m15448(0);
                        if (!c19514M15448.f63061) {
                            m15425(c19514M15448, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.f16832 == null) {
                        C19514 c19514M15449 = m15448(0);
                        InterfaceC19556 interfaceC19556 = this.f16858;
                        Context context = this.f16822;
                        if (interfaceC19556 != null && interfaceC19556.mo26437() && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            if (!this.f16858.mo26445()) {
                                if (this.f16859 || !m15425(c19514M15449, keyEvent)) {
                                    zMo26441 = false;
                                } else {
                                    zMo26441 = this.f16858.mo26443();
                                }
                            } else {
                                zMo26441 = this.f16858.mo26441();
                            }
                        } else {
                            boolean z = c19514M15449.f63061;
                            if (z || c19514M15449.f63073) {
                                m15442(c19514M15449, true);
                                zMo26441 = z;
                            } else if (c19514M15449.f63072) {
                                if (c19514M15449.f63060) {
                                    c19514M15449.f63072 = false;
                                    zM15425 = m15425(c19514M15449, keyEvent);
                                } else {
                                    zM15425 = true;
                                }
                                if (zM15425) {
                                    m15418(c19514M15449, keyEvent);
                                    zMo26441 = true;
                                } else {
                                    zMo26441 = false;
                                }
                            } else {
                                zMo26441 = false;
                            }
                        }
                        if (zMo26441 && (audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio")) != null) {
                            audioManager.playSoundEffect(0);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (!m15471()) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (this.f16847 == null) {
            int[] iArr = C3390.f10705;
            Context context2 = this.f16822;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f16847 = new AppCompatViewInflater();
            } else {
                try {
                    this.f16847 = (AppCompatViewInflater) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable unused) {
                    this.f16847 = new AppCompatViewInflater();
                }
            }
        }
        AppCompatViewInflater appCompatViewInflater = this.f16847;
        int i = C8350.f25576;
        return appCompatViewInflater.createView(view, str, context, attributeSet, false, false, true, false);
    }

    @Override // l.AbstractC13246
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void mo15472() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f16822);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            layoutInflaterFrom.getFactory2();
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0196  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15418(C19514 c19514, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = c19514.f63061;
        int i2 = c19514.f63069;
        if (z || this.f16859) {
            return;
        }
        Context context = this.f16822;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f16823.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, c19514.f63066)) {
            m15442(c19514, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && m15425(c19514, keyEvent)) {
            ViewGroup viewGroup = c19514.f63067;
            if (viewGroup != null && !c19514.f63059) {
                View view = c19514.f63064;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i = -1;
                }
                c19514.f63073 = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, 0, 0, b.c, 8519680, -3);
                layoutParams2.gravity = c19514.f63065;
                layoutParams2.windowAnimations = c19514.f63071;
                windowManager.addView(c19514.f63067, layoutParams2);
                c19514.f63061 = true;
                if (i2 == 0) {
                    m15447();
                }
            }
            if (viewGroup != null) {
                if (c19514.f63059 && viewGroup.getChildCount() > 0) {
                    c19514.f63067.removeAllViews();
                }
            } else {
                Context contextM15459 = m15459();
                TypedValue typedValue = new TypedValue();
                Resources.Theme themeNewTheme = contextM15459.getResources().newTheme();
                themeNewTheme.setTo(contextM15459.getTheme());
                themeNewTheme.resolveAttribute(bin.mt.plus.R.attr.MT_Protector, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    themeNewTheme.applyStyle(i3, true);
                }
                themeNewTheme.resolveAttribute(bin.mt.plus.R.attr.MT_Protector, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    themeNewTheme.applyStyle(i4, true);
                } else {
                    themeNewTheme.applyStyle(bin.mt.plus.R.style.MT_Protector, true);
                }
                C12729 c12729 = new C12729(contextM15459, 0);
                c12729.getTheme().setTo(themeNewTheme);
                c19514.f63062 = c12729;
                TypedArray typedArrayObtainStyledAttributes = c12729.obtainStyledAttributes(C3390.f10705);
                c19514.f63058 = typedArrayObtainStyledAttributes.getResourceId(86, 0);
                c19514.f63071 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                typedArrayObtainStyledAttributes.recycle();
                c19514.f63067 = new C18808(this, c19514.f63062);
                c19514.f63065 = 81;
            }
            View view2 = c19514.f63064;
            if (view2 != null) {
                c19514.f63070 = view2;
            } else {
                if (c19514.f63066 != null) {
                    if (this.f16821 == null) {
                        this.f16821 = new C0462(this);
                    }
                    C0462 c0462 = this.f16821;
                    if (c19514.f63063 == null) {
                        C21405 c21405 = new C21405(c19514.f63062);
                        c19514.f63063 = c21405;
                        c21405.setCallback(c0462);
                        c19514.f63066.addMenuPresenter(c19514.f63063);
                    }
                    View view3 = (View) c19514.f63063.m48504(c19514.f63067);
                    c19514.f63070 = view3;
                    if (view3 != null) {
                    }
                }
                c19514.f63059 = true;
                return;
            }
            if (c19514.f63070 != null && (c19514.f63064 != null || c19514.f63063.m48503().getCount() > 0)) {
                ViewGroup.LayoutParams layoutParams3 = c19514.f63070.getLayoutParams();
                if (layoutParams3 == null) {
                    layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                }
                c19514.f63067.setBackgroundResource(c19514.f63058);
                ViewParent parent = c19514.f63070.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(c19514.f63070);
                }
                c19514.f63067.addView(c19514.f63070, layoutParams3);
                if (!c19514.f63070.hasFocus()) {
                    c19514.f63070.requestFocus();
                }
            }
            c19514.f63059 = true;
            return;
            i = -2;
            c19514.f63073 = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i, -2, 0, 0, b.c, 8519680, -3);
            layoutParams4.gravity = c19514.f63065;
            layoutParams4.windowAnimations = c19514.f63071;
            windowManager.addView(c19514.f63067, layoutParams4);
            c19514.f63061 = true;
            if (i2 == 0) {
                m15447();
            }
        }
    }

    @Override // l.InterfaceC19994
    public final void onMenuModeChange(C3060 c3060) {
        InterfaceC19556 interfaceC19556 = this.f16858;
        if (interfaceC19556 != null && interfaceC19556.mo26437() && (!ViewConfiguration.get(this.f16822).hasPermanentMenuKey() || this.f16858.mo26442())) {
            Window.Callback callback = this.f16823.getCallback();
            if (!this.f16858.mo26445()) {
                if (callback == null || this.f16859) {
                    return;
                }
                if (this.f16844 && (1 & this.f16824) != 0) {
                    View decorView = this.f16823.getDecorView();
                    Runnable runnable = this.f16843;
                    decorView.removeCallbacks(runnable);
                    ((RunnableC12541) runnable).run();
                }
                C19514 c19514M15448 = m15448(0);
                C3060 c3061 = c19514M15448.f63066;
                if (c3061 == null || c19514M15448.f63060 || !callback.onPreparePanel(0, c19514M15448.f63064, c3061)) {
                    return;
                }
                callback.onMenuOpened(108, c19514M15448.f63066);
                this.f16858.mo26443();
                return;
            }
            this.f16858.mo26441();
            if (this.f16859) {
                return;
            }
            callback.onPanelClosed(108, m15448(0).f63066);
            return;
        }
        C19514 c19514M15449 = m15448(0);
        c19514M15449.f63059 = true;
        m15442(c19514M15449, false);
        m15418(c19514M15449, (KeyEvent) null);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:82:0x010e  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m15425(C19514 c19514, KeyEvent keyEvent) {
        C3060 c3060;
        InterfaceC19556 interfaceC19556;
        InterfaceC19556 interfaceC19557;
        Resources.Theme themeNewTheme;
        InterfaceC19556 interfaceC19558;
        InterfaceC19556 interfaceC19559;
        if (!this.f16859) {
            boolean z = c19514.f63072;
            int i = c19514.f63069;
            if (z) {
                return true;
            }
            C19514 c19515 = this.f16853;
            if (c19515 != null && c19515 != c19514) {
                m15442(c19515, false);
            }
            Window.Callback callback = this.f16823.getCallback();
            if (callback != null) {
                c19514.f63064 = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (interfaceC19559 = this.f16858) != null) {
                interfaceC19559.mo26444();
            }
            if (c19514.f63064 == null && (!z2 || !(this.f16865 instanceof C11752))) {
                C3060 c3061 = c19514.f63066;
                if (c3061 == null || c19514.f63060) {
                    if (c3061 == null) {
                        Context context = this.f16822;
                        if ((i == 0 || i == 108) && this.f16858 != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(bin.mt.plus.R.attr.MT_Protector, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(bin.mt.plus.R.attr.MT_Protector, typedValue, true);
                            } else {
                                theme.resolveAttribute(bin.mt.plus.R.attr.MT_Protector, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                C12729 c12729 = new C12729(context, 0);
                                c12729.getTheme().setTo(themeNewTheme);
                                context = c12729;
                            }
                        }
                        C3060 c3062 = new C3060(context);
                        c3062.setCallback(this);
                        C3060 c3063 = c19514.f63066;
                        if (c3062 != c3063) {
                            if (c3063 != null) {
                                c3063.removeMenuPresenter(c19514.f63063);
                            }
                            c19514.f63066 = c3062;
                            C21405 c21405 = c19514.f63063;
                            if (c21405 != null) {
                                c3062.addMenuPresenter(c21405);
                            }
                        }
                        if (c19514.f63066 != null) {
                            if (z2 && (interfaceC19557 = this.f16858) != null) {
                                if (this.f16845 == null) {
                                    this.f16845 = new C11047(this);
                                }
                                interfaceC19557.mo26432(c19514.f63066, this.f16845);
                            }
                            c19514.f63066.stopDispatchingItemsChanged();
                            if (!callback.onCreatePanelMenu(i, c19514.f63066)) {
                                c19514.f63060 = false;
                            } else {
                                c3060 = c19514.f63066;
                                if (c3060 != null) {
                                    if (c3060 != null) {
                                        c3060.removeMenuPresenter(c19514.f63063);
                                    }
                                    c19514.f63066 = null;
                                }
                                if (z2 && (interfaceC19556 = this.f16858) != null) {
                                    interfaceC19556.mo26432(null, this.f16845);
                                }
                            }
                        }
                    } else {
                        if (z2) {
                            if (this.f16845 == null) {
                                this.f16845 = new C11047(this);
                            }
                            interfaceC19557.mo26432(c19514.f63066, this.f16845);
                        }
                        c19514.f63066.stopDispatchingItemsChanged();
                        if (!callback.onCreatePanelMenu(i, c19514.f63066)) {
                            c19514.f63060 = false;
                        } else {
                            c3060 = c19514.f63066;
                            if (c3060 != null) {
                                if (c3060 != null) {
                                    c3060.removeMenuPresenter(c19514.f63063);
                                }
                                c19514.f63066 = null;
                            }
                            if (z2) {
                                interfaceC19556.mo26432(null, this.f16845);
                            }
                        }
                    }
                }
                c19514.f63066.stopDispatchingItemsChanged();
                Bundle bundle = c19514.f63068;
                if (bundle != null) {
                    c19514.f63066.restoreActionViewStates(bundle);
                    c19514.f63068 = null;
                }
                if (!callback.onPreparePanel(0, c19514.f63064, c19514.f63066)) {
                    if (z2 && (interfaceC19558 = this.f16858) != null) {
                        interfaceC19558.mo26432(null, this.f16845);
                    }
                    c19514.f63066.startDispatchingItemsChanged();
                    return false;
                }
                c19514.f63066.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                c19514.f63066.startDispatchingItemsChanged();
            }
            c19514.f63072 = true;
            c19514.f63073 = false;
            this.f16853 = c19514;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15440(C3060 c3060) {
        if (this.f16850) {
            return;
        }
        this.f16850 = true;
        this.f16858.mo26447();
        Window.Callback callback = this.f16823.getCallback();
        if (callback != null && !this.f16859) {
            callback.onPanelClosed(108, c3060);
        }
        this.f16850 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15442(C19514 c19514, boolean z) {
        ViewGroup viewGroup;
        InterfaceC19556 interfaceC19556;
        if (z && c19514.f63069 == 0 && (interfaceC19556 = this.f16858) != null && interfaceC19556.mo26445()) {
            m15440(c19514.f63066);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f16822.getSystemService("window");
        if (windowManager != null && c19514.f63061 && (viewGroup = c19514.f63067) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                m15435(c19514.f63069, c19514, (C3060) null);
            }
        }
        c19514.f63072 = false;
        c19514.f63073 = false;
        c19514.f63061 = false;
        c19514.f63070 = null;
        c19514.f63059 = true;
        if (this.f16853 == c19514) {
            this.f16853 = null;
        }
        if (c19514.f63069 == 0) {
            m15447();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15435(int i, C19514 c19514, C3060 c3060) {
        if (c3060 == null) {
            if (c19514 == null && i >= 0) {
                C19514[] c19514Arr = this.f16841;
                if (i < c19514Arr.length) {
                    c19514 = c19514Arr[i];
                }
            }
            if (c19514 != null) {
                c3060 = c19514.f63066;
            }
        }
        if ((c19514 == null || c19514.f63061) && !this.f16859) {
            this.f16867.m24553(this.f16823.getCallback(), i, c3060);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19514 m15454(C3060 c3060) {
        C19514[] c19514Arr = this.f16841;
        int length = c19514Arr != null ? c19514Arr.length : 0;
        for (int i = 0; i < length; i++) {
            C19514 c19514 = c19514Arr[i];
            if (c19514 != null && c19514.f63066 == c3060) {
                return c19514;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C19514 m15448(int i) {
        C19514[] c19514Arr = this.f16841;
        if (c19514Arr == null || c19514Arr.length <= i) {
            C19514[] c19514Arr2 = new C19514[i + 1];
            if (c19514Arr != null) {
                System.arraycopy(c19514Arr, 0, c19514Arr2, 0, c19514Arr.length);
            }
            this.f16841 = c19514Arr2;
            c19514Arr = c19514Arr2;
        }
        C19514 c19514 = c19514Arr[i];
        if (c19514 != null) {
            return c19514;
        }
        C19514 c19515 = new C19514();
        c19515.f63069 = i;
        c19515.f63059 = false;
        c19514Arr[i] = c19515;
        return c19515;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m15419(C19514 c19514, int i, KeyEvent keyEvent) {
        C3060 c3060;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c19514.f63072 || m15425(c19514, keyEvent)) && (c3060 = c19514.f63066) != null) {
            return c3060.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m15422(int i) {
        this.f16824 = (1 << i) | this.f16824;
        if (this.f16844) {
            return;
        }
        View decorView = this.f16823.getDecorView();
        int i2 = C17648.f53953;
        decorView.postOnAnimation(this.f16843);
        this.f16844 = true;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m15473(int i) {
        C19514 c19514M15448 = m15448(i);
        if (c19514M15448.f63066 != null) {
            Bundle bundle = new Bundle();
            c19514M15448.f63066.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                c19514M15448.f63068 = bundle;
            }
            c19514M15448.f63066.stopDispatchingItemsChanged();
            c19514M15448.f63066.clear();
        }
        c19514M15448.f63060 = true;
        c19514M15448.f63059 = true;
        if ((i == 108 || i == 0) && this.f16858 != null) {
            C19514 c19514M15449 = m15448(0);
            c19514M15449.f63072 = false;
            m15425(c19514M15449, (KeyEvent) null);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m15430(C21610 c21610) {
        boolean z;
        boolean z2;
        int iM3228;
        int iM48826 = c21610.m48826();
        C22524 c22524 = this.f16840;
        if (c22524 == null || !(c22524.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f16840.getLayoutParams();
            boolean z3 = true;
            if (this.f16840.isShown()) {
                if (this.f16831 == null) {
                    this.f16831 = new Rect();
                    this.f16862 = new Rect();
                }
                Rect rect = this.f16831;
                Rect rect2 = this.f16862;
                rect.set(c21610.m48824(), c21610.m48826(), c21610.m48834(), c21610.m48835());
                C22461.m50392(this.f16848, rect, rect2);
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                C21610 c21610M41340 = C17648.m41340(this.f16848);
                int iM48824 = c21610M41340 == null ? 0 : c21610M41340.m48824();
                int iM48834 = c21610M41340 == null ? 0 : c21610M41340.m48834();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                Context context = this.f16822;
                if (i > 0 && this.f16855 == null) {
                    View view = new View(context);
                    this.f16855 = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iM48824;
                    layoutParams.rightMargin = iM48834;
                    this.f16848.addView(this.f16855, -1, layoutParams);
                } else {
                    View view2 = this.f16855;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != iM48824 || marginLayoutParams2.rightMargin != iM48834) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = iM48824;
                            marginLayoutParams2.rightMargin = iM48834;
                            this.f16855.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.f16855;
                z3 = view3 != null;
                if (z3 && view3.getVisibility() != 0) {
                    View view4 = this.f16855;
                    if ((view4.getWindowSystemUiVisibility() & 8192) != 0) {
                        iM3228 = C0881.m3228(context, bin.mt.plus.R.color.MT_Protector);
                    } else {
                        iM3228 = C0881.m3228(context, bin.mt.plus.R.color.MT_Protector);
                    }
                    view4.setBackgroundColor(iM3228);
                }
                if (!this.f16833 && z3) {
                    iM48826 = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.f16840.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = this.f16855;
        if (view5 != null) {
            view5.setVisibility(z ? 0 : 8);
        }
        return iM48826;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m15423() {
        if (this.f16868) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m15450() {
        InterfaceC19556 interfaceC19556 = this.f16858;
        if (interfaceC19556 != null) {
            interfaceC19556.mo26447();
        }
        if (this.f16820 != null) {
            this.f16823.getDecorView().removeCallbacks(this.f16857);
            if (this.f16820.isShowing()) {
                try {
                    this.f16820.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f16820 = null;
        }
        C15530 c15530 = this.f16834;
        if (c15530 != null) {
            c15530.m36598();
        }
        C3060 c3060 = m15448(0).f63066;
        if (c3060 != null) {
            c3060.close();
        }
    }

    @Override // l.AbstractC13246
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Context mo15461() {
        return this.f16822;
    }

    @Override // l.AbstractC13246
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo15434() {
        final Context context = this.f16822;
        if (AbstractC13246.m32145(context) && AbstractC13246.m32140() != null && !AbstractC13246.m32140().equals(AbstractC13246.m32137())) {
            AbstractC13246.f39650.execute(new Runnable() { // from class: l.ܶܿ
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC13246.m32146(context);
                }
            });
        }
        m15420(true, true);
    }

    @Override // l.AbstractC13246
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo15456() {
        return m15420(true, true);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m15420(boolean z, boolean z2) {
        int i;
        boolean z3;
        int i2;
        if (this.f16859) {
            return false;
        }
        int iM32148 = this.f16829;
        if (iM32148 == -100) {
            iM32148 = AbstractC13246.m32148();
        }
        Context context = this.f16822;
        int iM15429 = m15429(context, iM32148);
        int i3 = Build.VERSION.SDK_INT;
        C3931 c3931M15428 = i3 < 33 ? m15428(context) : null;
        if (!z2 && c3931M15428 != null) {
            c3931M15428 = m15424(context.getResources().getConfiguration());
        }
        Configuration configurationM15416 = m15416(context, iM15429, c3931M15428, null, false);
        boolean z4 = this.f16856;
        boolean z5 = true;
        Object obj = this.f16827;
        if (!z4 && (obj instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                if (i3 >= 29) {
                    i2 = 269221888;
                } else {
                    i2 = i3 >= 24 ? 786432 : 0;
                }
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i2);
                    if (activityInfo != null) {
                        this.f16852 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    this.f16852 = 0;
                }
                this.f16856 = true;
                i = this.f16852;
            }
        } else {
            this.f16856 = true;
            i = this.f16852;
        }
        Configuration configuration = this.f16828;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i4 = configuration.uiMode & 48;
        int i5 = configurationM15416.uiMode & 48;
        C3931 c3931M15424 = m15424(configuration);
        C3931 c3931M15425 = c3931M15428 == null ? null : m15424(configurationM15416);
        int i6 = i4 != i5 ? 512 : 0;
        if (c3931M15425 != null && !c3931M15424.equals(c3931M15425)) {
            i6 |= o.a.t;
        }
        if (((~i) & i6) != 0 && z && this.f16835 && ((f16816 || this.f16825) && (obj instanceof Activity))) {
            final Activity activity = (Activity) obj;
            if (activity.isChild()) {
                z3 = false;
            } else {
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 31 && (i6 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationM15416.getLayoutDirection());
                }
                if (i7 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new Runnable() { // from class: l.ۜ᩹
                        @Override // java.lang.Runnable
                        public final void run() {
                            Activity activity2 = activity;
                            if (activity2.isFinishing() || C8455.m22136(activity2)) {
                                return;
                            }
                            activity2.recreate();
                        }
                    });
                }
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i6 == 0) {
            z5 = z3;
        } else {
            boolean z6 = (i6 & i) == i6;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i5;
            if (c3931M15425 != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    C14573.m34825(configuration2, c3931M15425);
                } else {
                    configuration2.setLocale(c3931M15425.m11977(0));
                    configuration2.setLayoutDirection(c3931M15425.m11977(0));
                }
            }
            resources.updateConfiguration(configuration2, null);
            int i8 = Build.VERSION.SDK_INT;
            if (i8 < 26) {
                C4696.m13770(resources);
            }
            int i9 = this.f16838;
            if (i9 != 0) {
                context.setTheme(i9);
                if (i8 >= 23) {
                    context.getTheme().applyStyle(this.f16838, true);
                }
            }
            if (z6 && (obj instanceof Activity)) {
                Activity activity2 = (Activity) obj;
                if (activity2 instanceof InterfaceC23586) {
                    if (((InterfaceC23586) activity2).getLifecycle().mo19832().m33028(EnumC13728.CREATED)) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f16825 && !this.f16859) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (c3931M15425 != null) {
            C3931 c3931M15426 = m15424(context.getResources().getConfiguration());
            if (Build.VERSION.SDK_INT >= 24) {
                C14573.m34826(c3931M15426);
            } else {
                Locale.setDefault(c3931M15426.m11977(0));
            }
        }
        if (iM32148 != 0) {
            C3991 c3991 = this.f16861;
            if (c3991 != null) {
                c3991.m8178();
            }
        } else {
            if (this.f16861 == null) {
                this.f16861 = new C3991(this, C7518.m20159(context));
            }
            this.f16861.m8181();
        }
        if (iM32148 != 3) {
            C8930 c8930 = this.f16830;
            if (c8930 != null) {
                c8930.m8178();
            }
        } else {
            if (this.f16830 == null) {
                this.f16830 = new C8930(this, context);
            }
            this.f16830.m8181();
        }
        return z5;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C3931 m15428(Context context) {
        C3931 c3931M32140;
        C3931 c3931M11974;
        Locale localeM11977;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (c3931M32140 = AbstractC13246.m32140()) == null) {
            return null;
        }
        C3931 c3931M15424 = m15424(context.getApplicationContext().getResources().getConfiguration());
        if (i >= 24) {
            if (c3931M32140.m11978()) {
                c3931M11974 = C3931.m11976();
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (int i2 = 0; i2 < c3931M15424.m11979() + c3931M32140.m11979(); i2++) {
                    if (i2 < c3931M32140.m11979()) {
                        localeM11977 = c3931M32140.m11977(i2);
                    } else {
                        localeM11977 = c3931M15424.m11977(i2 - c3931M32140.m11979());
                    }
                    if (localeM11977 != null) {
                        linkedHashSet.add(localeM11977);
                    }
                }
                c3931M11974 = C3931.m11975((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
            }
        } else if (c3931M32140.m11978()) {
            c3931M11974 = C3931.m11976();
        } else {
            c3931M11974 = C3931.m11974(C17396.m40747(c3931M32140.m11977(0)));
        }
        return c3931M11974.m11978() ? c3931M15424 : c3931M11974;
    }

    @Override // l.AbstractC13246
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo15466(int i) {
        if (this.f16829 != i) {
            this.f16829 = i;
            if (this.f16835) {
                m15420(true, true);
            }
        }
    }

    @Override // l.AbstractC13246
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int mo15465() {
        return this.f16829;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3931 m15424(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C14573.m34823(configuration);
        }
        return C3931.m11974(C17396.m40747(configuration.locale));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Configuration m15416(Context context, int i, C3931 c3931, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (c3931 != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                C14573.m34825(configuration2, c3931);
                return configuration2;
            }
            configuration2.setLocale(c3931.m11977(0));
            configuration2.setLayoutDirection(c3931.m11977(0));
        }
        return configuration2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m15429(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f16830 == null) {
                            this.f16830 = new C8930(this, context);
                        }
                        return this.f16830.m23036();
                    }
                } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    if (this.f16861 == null) {
                        this.f16861 = new C3991(this, C7518.m20159(context));
                    }
                    return this.f16861.m12037();
                }
            }
            return i;
        }
        return -1;
    }
}
