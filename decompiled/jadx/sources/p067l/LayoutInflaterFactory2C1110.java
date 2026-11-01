package p067l;

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
import com.alipay.sdk.p010m.p050t0.C0215b;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.C0719o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۚܳ */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes3.dex */
public final class LayoutInflaterFactory2C1110 extends AbstractC1499 implements InterfaceC1834, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: ֡֫ */
    public OnBackInvokedDispatcher f19656;

    /* JADX INFO: renamed from: ֨֫ */
    public boolean f19657;

    /* JADX INFO: renamed from: ֫֫ */
    public PopupWindow f19658;

    /* JADX INFO: renamed from: ֫ۧ */
    public C0865 f19659;

    /* JADX INFO: renamed from: ۖ֫ */
    public final Context f19660;

    /* JADX INFO: renamed from: ۖۧ */
    public Window f19661;

    /* JADX INFO: renamed from: ۗ֫ */
    public int f19662;

    /* JADX INFO: renamed from: ۘ֫ */
    public boolean f19663;

    /* JADX INFO: renamed from: ۘۧ */
    public boolean f19664;

    /* JADX INFO: renamed from: ۙ֫ */
    public final Object f19665;

    /* JADX INFO: renamed from: ۚ֫ */
    public Configuration f19666;

    /* JADX INFO: renamed from: ۛ֫ */
    public int f19667;

    /* JADX INFO: renamed from: ۜ֫ */
    public C1285 f19668;

    /* JADX INFO: renamed from: ۜۧ */
    public Rect f19669;

    /* JADX INFO: renamed from: ۟ */
    public AbstractC1018 f19670;

    /* JADX INFO: renamed from: ۟֫ */
    public boolean f19671;

    /* JADX INFO: renamed from: ۠֫ */
    public C1612 f19672;

    /* JADX INFO: renamed from: ۡ֫ */
    public boolean f19673;

    /* JADX INFO: renamed from: ۡۧ */
    public CharSequence f19674;

    /* JADX INFO: renamed from: ۢ֫ */
    public OnBackInvokedCallback f19675;

    /* JADX INFO: renamed from: ۢۧ */
    public int f19676;

    /* JADX INFO: renamed from: ۤ֫ */
    public boolean f19677;

    /* JADX INFO: renamed from: ۧ֫ */
    public C1959 f19678;

    /* JADX INFO: renamed from: ۧۧ */
    public C1810[] f19679;

    /* JADX INFO: renamed from: ۨ֫ */
    public boolean f19680;

    /* JADX INFO: renamed from: ۫֫ */
    public final Runnable f19681;

    /* JADX INFO: renamed from: ۬֫ */
    public boolean f19682;

    /* JADX INFO: renamed from: ܰ */
    public C1390 f19683;

    /* JADX INFO: renamed from: ܰ֫ */
    public boolean f19684;

    /* JADX INFO: renamed from: ܳ֫ */
    public AppCompatViewInflater f19685;

    /* JADX INFO: renamed from: ܳۧ */
    public ViewGroup f19686;

    /* JADX INFO: renamed from: ܶ֫ */
    public boolean f19687;

    /* JADX INFO: renamed from: ܺ֫ */
    public boolean f19688;

    /* JADX INFO: renamed from: ܺۧ */
    public TextView f19689;

    /* JADX INFO: renamed from: ܽ֫ */
    public int f19690;

    /* JADX INFO: renamed from: ܽۧ */
    public C1810 f19691;

    /* JADX INFO: renamed from: ܿ֫ */
    public final Object f19692;

    /* JADX INFO: renamed from: ܿۧ */
    public View f19693;

    /* JADX INFO: renamed from: ᩳ֫ */
    public boolean f19694;

    /* JADX INFO: renamed from: ᩳۧ */
    public Runnable f19695;

    /* JADX INFO: renamed from: ᩴ֫ */
    public InterfaceC1812 f19696;

    /* JADX INFO: renamed from: ᩵֫ */
    public boolean f19697;

    /* JADX INFO: renamed from: ᩶֫ */
    public boolean f19698;

    /* JADX INFO: renamed from: ᩷֫ */
    public C1040 f19699;

    /* JADX INFO: renamed from: ᩷ۧ */
    public Rect f19700;

    /* JADX INFO: renamed from: ᩸֫ */
    public boolean f19701;

    /* JADX INFO: renamed from: ᩹֫ */
    public boolean f19702;

    /* JADX INFO: renamed from: ᩺ */
    public AbstractC1360 f19703;

    /* JADX INFO: renamed from: ᩺֫ */
    public C1228 f19704;

    /* JADX INFO: renamed from: ᩻֫ */
    public C1320 f19705;

    /* JADX INFO: renamed from: ᩻ۧ */
    public boolean f19706;

    /* JADX INFO: renamed from: ᩵ۧ */
    public static final C1012 f19655 = new C1012();

    /* JADX INFO: renamed from: ֡ۧ */
    public static final int[] f19653 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: ᩴۧ */
    public static final boolean f19654 = !"robolectric".equals(Build.FINGERPRINT);

    public LayoutInflaterFactory2C1110(ActivityC0904 activityC0904, ActivityC0904 activityC0905) {
        this(activityC0904, null, activityC0905, activityC0904);
    }

    public LayoutInflaterFactory2C1110(DialogC1250 dialogC1250, DialogC1250 dialogC1251) {
        this(dialogC1250.getContext(), dialogC1250.getWindow(), dialogC1251, dialogC1250);
    }

    public LayoutInflaterFactory2C1110(Context context, Window window, InterfaceC1254 interfaceC1254, Object obj) {
        ActivityC0904 activityC0904;
        this.f19672 = null;
        this.f19702 = true;
        this.f19667 = -100;
        this.f19681 = new RunnableC1464(this);
        this.f19660 = context;
        this.f19692 = interfaceC1254;
        this.f19665 = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof ActivityC0904) {
                        activityC0904 = (ActivityC0904) context;
                        break;
                    } else if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                activityC0904 = null;
                break;
            }
            if (activityC0904 != null) {
                this.f19667 = activityC0904.m6357().mo17376();
            }
        }
        if (this.f19667 == -100) {
            String name = this.f19665.getClass().getName();
            C1012 c1012 = f19655;
            Integer num = (Integer) c1012.getOrDefault(name, null);
            if (num != null) {
                this.f19667 = num.intValue();
                c1012.remove(this.f19665.getClass().getName());
            }
        }
        if (window != null) {
            m17328(window);
        }
        C1138.m18627();
    }

    /* JADX INFO: renamed from: ۙ */
    public final void m17358() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.f19656 != null && (m17359(0).f65681 || this.f19670 != null)) {
                z = true;
            }
            if (z && this.f19675 == null) {
                this.f19675 = C1880.m50081((Object) this.f19656, this);
            } else {
                if (z || (onBackInvokedCallback = this.f19675) == null) {
                    return;
                }
                C1880.m50083(this.f19656, onBackInvokedCallback);
                this.f19675 = null;
            }
        }
    }

    @Override // p067l.AbstractC1499
    /* JADX INFO: renamed from: ֫ */
    public final Context mo17342(Context context) {
        this.f19673 = true;
        int iM34247 = this.f19667;
        if (iM34247 == -100) {
            iM34247 = AbstractC1499.m34247();
        }
        int iM17340 = m17340(context, iM34247);
        if (AbstractC1499.m34244(context)) {
            AbstractC1499.m34245(context);
        }
        C1037 c1037M17339 = m17339(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(m17327(context, iM17340, c1037M17339, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C1473) {
            try {
                ((C1473) context).m33110(m17327(context, iM17340, c1037M17339, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f19654) {
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
                    if (!C12826.equals(configuration3.locale, configuration4.locale)) {
                        configuration.locale = configuration4.locale;
                    }
                } else {
                    C1565.m36975(configuration3, configuration4, configuration);
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
                    C2020.m54801(configuration3, configuration4, configuration);
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
        Configuration configurationM17327 = m17327(context, iM17340, c1037M17339, configuration, true);
        C1473 c1473 = new C1473(context, bin.p000mt.plus.R.style.MT_Protector);
        c1473.m33110(configurationM17327);
        try {
            if (context.getTheme() != null) {
                C1829.m48057(c1473.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return c1473;
    }

    @Override // p067l.AbstractC1499
    /* JADX INFO: renamed from: ᩷ */
    public final void mo17379() {
        String strM44861;
        this.f19673 = true;
        m17331(false, true);
        m17338();
        Object obj = this.f19665;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strM44861 = C1748.m44861(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strM44861 = null;
            }
            if (strM44861 != null) {
                AbstractC1360 abstractC1360 = this.f19703;
                if (abstractC1360 == null) {
                    this.f19657 = true;
                } else {
                    abstractC1360.mo28325(true);
                }
            }
            AbstractC1499.m34238(this);
        }
        this.f19666 = new Configuration(this.f19660.getResources().getConfiguration());
        this.f19663 = true;
    }

    @Override // p067l.AbstractC1499
    /* JADX INFO: renamed from: ۡ */
    public final void mo17362() {
        m17332();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m17354(int i, KeyEvent keyEvent) {
        m17337();
        AbstractC1360 abstractC1360 = this.f19703;
        if (abstractC1360 == null || !abstractC1360.mo28322(i, keyEvent)) {
            C1810 c1810 = this.f19691;
            if (c1810 != null && m17330(c1810, keyEvent.getKeyCode(), keyEvent)) {
                C1810 c1811 = this.f19691;
                if (c1811 != null) {
                    c1811.f65693 = true;
                    return true;
                }
            } else {
                if (this.f19691 == null) {
                    C1810 c1810M17359 = m17359(0);
                    m17336(c1810M17359, keyEvent);
                    boolean zM17330 = m17330(c1810M17359, keyEvent.getKeyCode(), keyEvent);
                    c1810M17359.f65692 = false;
                    if (zM17330) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // p067l.AbstractC1499
    /* JADX INFO: renamed from: ۘ */
    public final void mo17357() {
        m17337();
        AbstractC1360 abstractC1360 = this.f19703;
        if (abstractC1360 != null) {
            abstractC1360.mo28332(false);
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m17364(int i) {
        if (i == 108) {
            m17337();
            AbstractC1360 abstractC1360 = this.f19703;
            if (abstractC1360 != null) {
                abstractC1360.mo28320(false);
                return;
            }
            return;
        }
        if (i == 0) {
            C1810 c1810M17359 = m17359(i);
            if (c1810M17359.f65681) {
                m17353(c1810M17359, false);
            }
        }
    }

    @Override // p067l.AbstractC1499
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC1360 mo17369() {
        m17337();
        return this.f19703;
    }

    /* JADX INFO: renamed from: ܶ */
    public final Context m17370() {
        m17337();
        AbstractC1360 abstractC1360 = this.f19703;
        Context contextMo28331 = abstractC1360 != null ? abstractC1360.mo28331() : null;
        return contextMo28331 == null ? this.f19660 : contextMo28331;
    }

    @Override // p067l.AbstractC1499
    /* JADX INFO: renamed from: ܺ */
    public final void mo17371() {
        m17337();
        AbstractC1360 abstractC1360 = this.f19703;
        if (abstractC1360 != null) {
            abstractC1360.mo28332(true);
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m17380(int i) {
        if (i == 108) {
            m17337();
            AbstractC1360 abstractC1360 = this.f19703;
            if (abstractC1360 != null) {
                abstractC1360.mo28320(true);
            }
        }
    }

    @Override // p067l.AbstractC1499
    /* JADX INFO: renamed from: ۜ */
    public final void mo17360() {
        if (this.f19703 != null) {
            m17337();
            if (this.f19703.mo28330()) {
                return;
            }
            m17333(0);
        }
    }

    @Override // p067l.InterfaceC1834
    public final boolean onMenuItemSelected(C0994 c0994, MenuItem menuItem) {
        C1810 c1810M17365;
        Window.Callback callback = this.f19661.getCallback();
        if (callback == null || this.f19697 || (c1810M17365 = m17365(c0994.getRootMenu())) == null) {
            return false;
        }
        return callback.onMenuItemSelected(c1810M17365.f65689, menuItem);
    }

    /* JADX INFO: renamed from: ۫ */
    private void m17337() {
        m17332();
        if (this.f19698 && this.f19703 == null) {
            Object obj = this.f19665;
            if (obj instanceof Activity) {
                this.f19703 = new C1718((Activity) obj, this.f19684);
            } else if (obj instanceof Dialog) {
                this.f19703 = new C1718((Dialog) obj);
            }
            AbstractC1360 abstractC1360 = this.f19703;
            if (abstractC1360 != null) {
                abstractC1360.mo28325(this.f19657);
            }
        }
    }

    @Override // p067l.AbstractC1499
    /* JADX INFO: renamed from: ֫ */
    public final void mo17352(C1326 c1326) {
        CharSequence title;
        Object obj = this.f19665;
        if (obj instanceof Activity) {
            m17337();
            AbstractC1360 abstractC1360 = this.f19703;
            if (abstractC1360 instanceof C1718) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f19704 = null;
            if (abstractC1360 != null) {
                abstractC1360.mo28333();
            }
            this.f19703 = null;
            if (c1326 == null) {
                this.f19705.m26568((InterfaceC0935) null);
            } else {
                if (obj instanceof Activity) {
                    title = ((Activity) obj).getTitle();
                } else {
                    title = this.f19674;
                }
                C1425 c1425 = new C1425(c1326, title, this.f19705);
                this.f19703 = c1425;
                this.f19705.m26568(c1425.f38083);
                c1326.setBackInvokedCallbackEnabled(true);
            }
            mo17360();
        }
    }

    @Override // p067l.AbstractC1499
    /* JADX INFO: renamed from: ܿ */
    public final MenuInflater mo17374() {
        if (this.f19704 == null) {
            m17337();
            AbstractC1360 abstractC1360 = this.f19703;
            this.f19704 = new C1228(abstractC1360 != null ? abstractC1360.mo28331() : this.f19660);
        }
        return this.f19704;
    }

    @Override // p067l.AbstractC1499
    /* JADX INFO: renamed from: ֫ */
    public final View mo17343(int i) {
        m17332();
        return this.f19661.findViewById(i);
    }

    @Override // p067l.AbstractC1499
    /* JADX INFO: renamed from: ֫ */
    public final void mo17347(Configuration configuration) {
        if (this.f19698 && this.f19706) {
            m17337();
            AbstractC1360 abstractC1360 = this.f19703;
            if (abstractC1360 != null) {
                abstractC1360.mo28327();
            }
        }
        C1138 c1138M18626 = C1138.m18626();
        Context context = this.f19660;
        c1138M18626.m18629(context);
        this.f19666 = new Configuration(context.getResources().getConfiguration());
        m17331(false, false);
    }

    @Override // p067l.AbstractC1499
    /* JADX INFO: renamed from: ۖ */
    public final void mo17356() {
        m17331(true, false);
    }

    @Override // p067l.AbstractC1499
    /* JADX INFO: renamed from: ֫ */
    public final void mo17348(View view) {
        m17332();
        ViewGroup viewGroup = (ViewGroup) this.f19686.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f19705.m26566(this.f19661.getCallback());
    }

    @Override // p067l.AbstractC1499
    /* JADX INFO: renamed from: ܽ */
    public final void mo17373(int i) {
        m17332();
        ViewGroup viewGroup = (ViewGroup) this.f19686.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f19660).inflate(i, viewGroup);
        this.f19705.m26566(this.f19661.getCallback());
    }

    @Override // p067l.AbstractC1499
    /* JADX INFO: renamed from: ۧ */
    public final void mo17366(View view, ViewGroup.LayoutParams layoutParams) {
        m17332();
        ViewGroup viewGroup = (ViewGroup) this.f19686.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f19705.m26566(this.f19661.getCallback());
    }

    @Override // p067l.AbstractC1499
    /* JADX INFO: renamed from: ֫ */
    public final void mo17349(View view, ViewGroup.LayoutParams layoutParams) {
        m17332();
        ((ViewGroup) this.f19686.findViewById(R.id.content)).addView(view, layoutParams);
        this.f19705.m26566(this.f19661.getCallback());
    }

    @Override // p067l.AbstractC1499
    /* JADX INFO: renamed from: ۢ */
    public final void mo17363() {
        Object obj = this.f19665;
        boolean z = obj instanceof Activity;
        if (z) {
            AbstractC1499.m34241(this);
        }
        if (this.f19682) {
            this.f19661.getDecorView().removeCallbacks(this.f19681);
        }
        this.f19697 = true;
        int i = this.f19667;
        C1012 c1012 = f19655;
        if (i != -100 && z && ((Activity) obj).isChangingConfigurations()) {
            c1012.put(obj.getClass().getName(), Integer.valueOf(this.f19667));
        } else {
            c1012.remove(obj.getClass().getName());
        }
        AbstractC1360 abstractC1360 = this.f19703;
        if (abstractC1360 != null) {
            abstractC1360.mo28333();
        }
        C1040 c1040 = this.f19699;
        if (c1040 != null) {
            c1040.m10217();
        }
        C1285 c1285 = this.f19668;
        if (c1285 != null) {
            c1285.m10217();
        }
    }

    @Override // p067l.AbstractC1499
    /* JADX INFO: renamed from: ܿ */
    public final void mo17375(int i) {
        this.f19676 = i;
    }

    /* JADX INFO: renamed from: ۬ */
    private void m17338() {
        if (this.f19661 == null) {
            Object obj = this.f19665;
            if (obj instanceof Activity) {
                m17328(((Activity) obj).getWindow());
            }
        }
        if (this.f19661 == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX INFO: renamed from: ֫ */
    private void m17328(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.f19661 != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof C1320) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        C1320 c1320 = new C1320(this, callback);
        this.f19705 = c1320;
        window.setCallback(c1320);
        C1970 c1970M53128 = C1970.m53128(this.f19660, (AttributeSet) null, f19653);
        Drawable drawableM53145 = c1970M53128.m53145(0);
        if (drawableM53145 != null) {
            window.setBackgroundDrawable(drawableM53145);
        }
        c1970M53128.m53146();
        this.f19661 = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f19656) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f19675) != null) {
            C1880.m50083(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f19675 = null;
        }
        Object obj = this.f19665;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f19656 = C1880.m50082(activity);
            } else {
                this.f19656 = null;
            }
        } else {
            this.f19656 = null;
        }
        m17358();
    }

    /* JADX INFO: renamed from: ۗ */
    private void m17332() {
        ViewGroup viewGroup;
        CharSequence title;
        if (this.f19706) {
            return;
        }
        Context context = this.f19660;
        int[] iArr = C1010.f13512;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            mo17368(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, false)) {
            mo17368(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            mo17368(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            mo17368(10);
        }
        this.f19677 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m17338();
        this.f19661.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (!this.f19664) {
            if (this.f19677) {
                viewGroup = (ViewGroup) layoutInflaterFrom.inflate(bin.p000mt.plus.R.layout.MT_Protector, (ViewGroup) null);
                this.f19684 = false;
                this.f19698 = false;
            } else if (this.f19698) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(bin.p000mt.plus.R.attr.MT_Protector, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C1473(context, typedValue.resourceId) : context).inflate(bin.p000mt.plus.R.layout.MT_Protector, (ViewGroup) null);
                InterfaceC1812 interfaceC1812 = (InterfaceC1812) viewGroup.findViewById(bin.p000mt.plus.R.id.MT_Protector);
                this.f19696 = interfaceC1812;
                interfaceC1812.mo28466(this.f19661.getCallback());
                if (this.f19684) {
                    this.f19696.mo28464(109);
                }
                if (this.f19701) {
                    this.f19696.mo28464(2);
                }
                if (this.f19687) {
                    this.f19696.mo28464(5);
                }
            } else {
                viewGroup = null;
            }
        } else {
            viewGroup = this.f19671 ? (ViewGroup) layoutInflaterFrom.inflate(bin.p000mt.plus.R.layout.MT_Protector, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(bin.p000mt.plus.R.layout.MT_Protector, (ViewGroup) null);
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f19698 + ", windowActionBarOverlay: " + this.f19684 + ", android:windowIsFloating: " + this.f19677 + ", windowActionModeOverlay: " + this.f19671 + ", windowNoTitle: " + this.f19664 + " }");
        }
        C1717.m43556(viewGroup, new C1359(this));
        if (this.f19696 == null) {
            this.f19689 = (TextView) viewGroup.findViewById(bin.p000mt.plus.R.id.MT_Protector);
        }
        int i = C1956.f75466;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        C1777 c1777 = (C1777) viewGroup.findViewById(bin.p000mt.plus.R.id.MT_Protector);
        ViewGroup viewGroup2 = (ViewGroup) this.f19661.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                c1777.addView(childAt);
            }
            viewGroup2.setId(-1);
            c1777.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f19661.setContentView(viewGroup);
        c1777.m45816(new C1149(this));
        this.f19686 = viewGroup;
        Object obj = this.f19665;
        if (obj instanceof Activity) {
            title = ((Activity) obj).getTitle();
        } else {
            title = this.f19674;
        }
        if (!TextUtils.isEmpty(title)) {
            InterfaceC1812 interfaceC1813 = this.f19696;
            if (interfaceC1813 == null) {
                AbstractC1360 abstractC1360 = this.f19703;
                if (abstractC1360 != null) {
                    abstractC1360.mo28319(title);
                } else {
                    TextView textView = this.f19689;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            } else {
                interfaceC1813.mo28467(title);
            }
        }
        C1777 c1778 = (C1777) this.f19686.findViewById(R.id.content);
        View decorView = this.f19661.getDecorView();
        c1778.m45815(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, c1778.m45820());
        typedArrayObtainStyledAttributes2.getValue(C0254q.f1218h, c1778.m45818());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, c1778.m45819());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, c1778.m45821());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(UMErrorCode.E_UM_BE_NOT_MAINPROCESS)) {
            typedArrayObtainStyledAttributes2.getValue(UMErrorCode.E_UM_BE_NOT_MAINPROCESS, c1778.m45814());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(UMErrorCode.E_UM_BE_EMPTY_URL_PATH)) {
            typedArrayObtainStyledAttributes2.getValue(UMErrorCode.E_UM_BE_EMPTY_URL_PATH, c1778.m45817());
        }
        typedArrayObtainStyledAttributes2.recycle();
        c1778.requestLayout();
        this.f19706 = true;
        C1810 c1810M17359 = m17359(0);
        if (this.f19697 || c1810M17359.f65686 != null) {
            return;
        }
        m17333(108);
    }

    @Override // p067l.AbstractC1499
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo17368(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.f19664 && i == 108) {
            return false;
        }
        if (this.f19698 && i == 1) {
            this.f19698 = false;
        }
        if (i == 1) {
            m17334();
            this.f19664 = true;
            return true;
        }
        if (i == 2) {
            m17334();
            this.f19701 = true;
            return true;
        }
        if (i == 5) {
            m17334();
            this.f19687 = true;
            return true;
        }
        if (i == 10) {
            m17334();
            this.f19671 = true;
            return true;
        }
        if (i == 108) {
            m17334();
            this.f19698 = true;
            return true;
        }
        if (i == 109) {
            m17334();
            this.f19684 = true;
            return true;
        }
        return this.f19661.requestFeature(i);
    }

    @Override // p067l.AbstractC1499
    /* JADX INFO: renamed from: ֫ */
    public final void mo17350(CharSequence charSequence) {
        this.f19674 = charSequence;
        InterfaceC1812 interfaceC1812 = this.f19696;
        if (interfaceC1812 == null) {
            AbstractC1360 abstractC1360 = this.f19703;
            if (abstractC1360 != null) {
                abstractC1360.mo28319(charSequence);
                return;
            }
            TextView textView = this.f19689;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        interfaceC1812.mo28467(charSequence);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.۠ܿ] */
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC1018 m17344(C1158 c1158) {
        AbstractC1018 abstractC1018OnWindowStartingSupportActionMode;
        AbstractC1018 abstractC1018 = this.f19670;
        if (abstractC1018 != null) {
            abstractC1018.mo12804();
        }
        C1740 c1740 = new C1740(this, c1158);
        m17337();
        AbstractC1360 abstractC1360 = this.f19703;
        ?? r1 = this.f19692;
        if (abstractC1360 != null) {
            AbstractC1018 abstractC1018Mo28316 = abstractC1360.mo28316(c1740);
            this.f19670 = abstractC1018Mo28316;
            if (abstractC1018Mo28316 != null && r1 != 0) {
                r1.onSupportActionModeStarted(abstractC1018Mo28316);
            }
        }
        if (this.f19670 == null) {
            C1612 c1612 = this.f19672;
            if (c1612 != null) {
                c1612.m38758();
            }
            AbstractC1018 abstractC1019 = this.f19670;
            if (abstractC1019 != null) {
                abstractC1019.mo12804();
            }
            if (r1 == 0 || this.f19697) {
                abstractC1018OnWindowStartingSupportActionMode = null;
            } else {
                try {
                    abstractC1018OnWindowStartingSupportActionMode = r1.onWindowStartingSupportActionMode(c1740);
                } catch (AbstractMethodError unused) {
                    abstractC1018OnWindowStartingSupportActionMode = null;
                }
            }
            if (abstractC1018OnWindowStartingSupportActionMode != null) {
                this.f19670 = abstractC1018OnWindowStartingSupportActionMode;
            } else {
                if (this.f19678 == null) {
                    if (this.f19677) {
                        TypedValue typedValue = new TypedValue();
                        Context context = this.f19660;
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(bin.p000mt.plus.R.attr.MT_Protector, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            C1473 c1473 = new C1473(context, 0);
                            c1473.getTheme().setTo(themeNewTheme);
                            context = c1473;
                        }
                        this.f19678 = new C1959(context, null);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, bin.p000mt.plus.R.attr.MT_Protector);
                        this.f19658 = popupWindow;
                        C3129.m5336(popupWindow, 2);
                        this.f19658.setContentView(this.f19678);
                        this.f19658.setWidth(-1);
                        context.getTheme().resolveAttribute(bin.p000mt.plus.R.attr.MT_Protector, typedValue, true);
                        this.f19678.mo6960(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.f19658.setHeight(-2);
                        this.f19695 = new RunnableC1989(this);
                    } else {
                        C1606 c1606 = (C1606) this.f19686.findViewById(bin.p000mt.plus.R.id.MT_Protector);
                        if (c1606 != null) {
                            c1606.m38611(LayoutInflater.from(m17370()));
                            this.f19678 = (C1959) c1606.m38610();
                        }
                    }
                }
                if (this.f19678 != null) {
                    C1612 c1613 = this.f19672;
                    if (c1613 != null) {
                        c1613.m38758();
                    }
                    this.f19678.m52860();
                    C1368 c1368 = new C1368(this.f19678.getContext(), this.f19678, c1740);
                    if (c1740.m44482(c1368, c1368.mo12816())) {
                        c1368.mo12819();
                        this.f19678.m52854(c1368);
                        this.f19670 = c1368;
                        if (m17378()) {
                            this.f19678.setAlpha(0.0f);
                            C1612 c1612M43544 = C1717.m43544(this.f19678);
                            c1612M43544.m38759(1.0f);
                            this.f19672 = c1612M43544;
                            c1612M43544.m38762(new C1534(this));
                        } else {
                            this.f19678.setAlpha(1.0f);
                            this.f19678.setVisibility(0);
                            if (this.f19678.getParent() instanceof View) {
                                C1717.m43585((View) this.f19678.getParent());
                            }
                        }
                        if (this.f19658 != null) {
                            this.f19661.getDecorView().post(this.f19695);
                        }
                    } else {
                        this.f19670 = null;
                    }
                }
            }
            AbstractC1018 abstractC10110 = this.f19670;
            if (abstractC10110 != null && r1 != 0) {
                r1.onSupportActionModeStarted(abstractC10110);
            }
            m17358();
            this.f19670 = this.f19670;
        }
        m17358();
        return this.f19670;
    }

    /* JADX INFO: renamed from: ᩶ */
    public final boolean m17378() {
        ViewGroup viewGroup;
        return this.f19706 && (viewGroup = this.f19686) != null && viewGroup.isLaidOut();
    }

    /* JADX INFO: renamed from: ᩸ */
    public final boolean m17381() {
        return this.f19702;
    }

    /* JADX INFO: renamed from: ᩹ */
    public final boolean m17382() {
        boolean z = this.f19680;
        this.f19680 = false;
        C1810 c1810M17359 = m17359(0);
        if (!c1810M17359.f65681) {
            AbstractC1018 abstractC1018 = this.f19670;
            if (abstractC1018 == null) {
                m17337();
                AbstractC1360 abstractC1360 = this.f19703;
                if (abstractC1360 == null || !abstractC1360.mo28326()) {
                    return false;
                }
            } else {
                abstractC1018.mo12804();
                return true;
            }
        } else if (!z) {
            m17353(c1810M17359, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00ca  */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m17355(KeyEvent keyEvent) {
        View decorView;
        boolean zMo28474;
        boolean zM17336;
        AudioManager audioManager;
        Object obj = this.f19665;
        if (((!(obj instanceof InterfaceC1238) && !(obj instanceof DialogC1250)) || (decorView = this.f19661.getDecorView()) == null || !C1588.m37714(decorView, keyEvent)) && (keyEvent.getKeyCode() != 82 || !this.f19705.m26569(this.f19661.getCallback(), keyEvent))) {
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode == 4) {
                    this.f19680 = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        C1810 c1810M17359 = m17359(0);
                        if (!c1810M17359.f65681) {
                            m17336(c1810M17359, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.f19670 == null) {
                        C1810 c1810M173510 = m17359(0);
                        InterfaceC1812 interfaceC1812 = this.f19696;
                        Context context = this.f19660;
                        if (interfaceC1812 != null && interfaceC1812.mo28470() && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            if (!this.f19696.mo28478()) {
                                if (this.f19697 || !m17336(c1810M173510, keyEvent)) {
                                    zMo28474 = false;
                                } else {
                                    zMo28474 = this.f19696.mo28476();
                                }
                            } else {
                                zMo28474 = this.f19696.mo28474();
                            }
                        } else {
                            boolean z = c1810M173510.f65681;
                            if (z || c1810M173510.f65693) {
                                m17353(c1810M173510, true);
                                zMo28474 = z;
                            } else if (c1810M173510.f65692) {
                                if (c1810M173510.f65680) {
                                    c1810M173510.f65692 = false;
                                    zM17336 = m17336(c1810M173510, keyEvent);
                                } else {
                                    zM17336 = true;
                                }
                                if (zM17336) {
                                    m17329(c1810M173510, keyEvent);
                                    zMo28474 = true;
                                } else {
                                    zMo28474 = false;
                                }
                            } else {
                                zMo28474 = false;
                            }
                        }
                        if (zMo28474 && (audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio")) != null) {
                            audioManager.playSoundEffect(0);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (!m17382()) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (this.f19685 == null) {
            int[] iArr = C1010.f13512;
            Context context2 = this.f19660;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f19685 = new AppCompatViewInflater();
            } else {
                try {
                    this.f19685 = (AppCompatViewInflater) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable unused) {
                    this.f19685 = new AppCompatViewInflater();
                }
            }
        }
        AppCompatViewInflater appCompatViewInflater = this.f19685;
        int i = C1256.f28490;
        return appCompatViewInflater.createView(view, str, context, attributeSet, false, false, true, false);
    }

    @Override // p067l.AbstractC1499
    /* JADX INFO: renamed from: ᩻ */
    public final void mo17383() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f19660);
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
    /* JADX INFO: renamed from: ֫ */
    private void m17329(C1810 c1810, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = c1810.f65681;
        int i2 = c1810.f65689;
        if (z || this.f19697) {
            return;
        }
        Context context = this.f19660;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f19661.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, c1810.f65686)) {
            m17353(c1810, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && m17336(c1810, keyEvent)) {
            ViewGroup viewGroup = c1810.f65687;
            if (viewGroup != null && !c1810.f65679) {
                View view = c1810.f65684;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i = -1;
                }
                c1810.f65693 = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, 0, 0, C0215b.f1000c, 8519680, -3);
                layoutParams2.gravity = c1810.f65685;
                layoutParams2.windowAnimations = c1810.f65691;
                windowManager.addView(c1810.f65687, layoutParams2);
                c1810.f65681 = true;
                if (i2 == 0) {
                    m17358();
                }
            }
            if (viewGroup != null) {
                if (c1810.f65679 && viewGroup.getChildCount() > 0) {
                    c1810.f65687.removeAllViews();
                }
            } else {
                Context contextM17370 = m17370();
                TypedValue typedValue = new TypedValue();
                Resources.Theme themeNewTheme = contextM17370.getResources().newTheme();
                themeNewTheme.setTo(contextM17370.getTheme());
                themeNewTheme.resolveAttribute(bin.p000mt.plus.R.attr.MT_Protector, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    themeNewTheme.applyStyle(i3, true);
                }
                themeNewTheme.resolveAttribute(bin.p000mt.plus.R.attr.MT_Protector, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    themeNewTheme.applyStyle(i4, true);
                } else {
                    themeNewTheme.applyStyle(bin.p000mt.plus.R.style.MT_Protector, true);
                }
                C1473 c1473 = new C1473(contextM17370, 0);
                c1473.getTheme().setTo(themeNewTheme);
                c1810.f65682 = c1473;
                TypedArray typedArrayObtainStyledAttributes = c1473.obtainStyledAttributes(C1010.f13512);
                c1810.f65678 = typedArrayObtainStyledAttributes.getResourceId(86, 0);
                c1810.f65691 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                typedArrayObtainStyledAttributes.recycle();
                c1810.f65687 = new C1775(this, c1810.f65682);
                c1810.f65685 = 81;
            }
            View view2 = c1810.f65684;
            if (view2 != null) {
                c1810.f65690 = view2;
            } else {
                if (c1810.f65686 != null) {
                    if (this.f19659 == null) {
                        this.f19659 = new C0865(this);
                    }
                    C0865 c0865 = this.f19659;
                    if (c1810.f65683 == null) {
                        C1904 c1904 = new C1904(c1810.f65682);
                        c1810.f65683 = c1904;
                        c1904.setCallback(c0865);
                        c1810.f65686.addMenuPresenter(c1810.f65683);
                    }
                    View view3 = (View) c1810.f65683.m50840(c1810.f65687);
                    c1810.f65690 = view3;
                    if (view3 != null) {
                    }
                }
                c1810.f65679 = true;
                return;
            }
            if (c1810.f65690 != null && (c1810.f65684 != null || c1810.f65683.m50839().getCount() > 0)) {
                ViewGroup.LayoutParams layoutParams3 = c1810.f65690.getLayoutParams();
                if (layoutParams3 == null) {
                    layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                }
                c1810.f65687.setBackgroundResource(c1810.f65678);
                ViewParent parent = c1810.f65690.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(c1810.f65690);
                }
                c1810.f65687.addView(c1810.f65690, layoutParams3);
                if (!c1810.f65690.hasFocus()) {
                    c1810.f65690.requestFocus();
                }
            }
            c1810.f65679 = true;
            return;
            i = -2;
            c1810.f65693 = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i, -2, 0, 0, C0215b.f1000c, 8519680, -3);
            layoutParams4.gravity = c1810.f65685;
            layoutParams4.windowAnimations = c1810.f65691;
            windowManager.addView(c1810.f65687, layoutParams4);
            c1810.f65681 = true;
            if (i2 == 0) {
                m17358();
            }
        }
    }

    @Override // p067l.InterfaceC1834
    public final void onMenuModeChange(C0994 c0994) {
        InterfaceC1812 interfaceC1812 = this.f19696;
        if (interfaceC1812 != null && interfaceC1812.mo28470() && (!ViewConfiguration.get(this.f19660).hasPermanentMenuKey() || this.f19696.mo28475())) {
            Window.Callback callback = this.f19661.getCallback();
            if (!this.f19696.mo28478()) {
                if (callback == null || this.f19697) {
                    return;
                }
                if (this.f19682 && (1 & this.f19662) != 0) {
                    View decorView = this.f19661.getDecorView();
                    Runnable runnable = this.f19681;
                    decorView.removeCallbacks(runnable);
                    ((RunnableC1464) runnable).run();
                }
                C1810 c1810M17359 = m17359(0);
                C0994 c0995 = c1810M17359.f65686;
                if (c0995 == null || c1810M17359.f65680 || !callback.onPreparePanel(0, c1810M17359.f65684, c0995)) {
                    return;
                }
                callback.onMenuOpened(108, c1810M17359.f65686);
                this.f19696.mo28476();
                return;
            }
            this.f19696.mo28474();
            if (this.f19697) {
                return;
            }
            callback.onPanelClosed(108, m17359(0).f65686);
            return;
        }
        C1810 c1810M173510 = m17359(0);
        c1810M173510.f65679 = true;
        m17353(c1810M173510, false);
        m17329(c1810M173510, (KeyEvent) null);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:82:0x010e  */
    /* JADX INFO: renamed from: ۧ */
    private boolean m17336(C1810 c1810, KeyEvent keyEvent) {
        C0994 c0994;
        InterfaceC1812 interfaceC1812;
        InterfaceC1812 interfaceC1813;
        Resources.Theme themeNewTheme;
        InterfaceC1812 interfaceC1814;
        InterfaceC1812 interfaceC1815;
        if (!this.f19697) {
            boolean z = c1810.f65692;
            int i = c1810.f65689;
            if (z) {
                return true;
            }
            C1810 c1811 = this.f19691;
            if (c1811 != null && c1811 != c1810) {
                m17353(c1811, false);
            }
            Window.Callback callback = this.f19661.getCallback();
            if (callback != null) {
                c1810.f65684 = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (interfaceC1815 = this.f19696) != null) {
                interfaceC1815.mo28477();
            }
            if (c1810.f65684 == null && (!z2 || !(this.f19703 instanceof C1425))) {
                C0994 c0995 = c1810.f65686;
                if (c0995 == null || c1810.f65680) {
                    if (c0995 == null) {
                        Context context = this.f19660;
                        if ((i == 0 || i == 108) && this.f19696 != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(bin.p000mt.plus.R.attr.MT_Protector, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(bin.p000mt.plus.R.attr.MT_Protector, typedValue, true);
                            } else {
                                theme.resolveAttribute(bin.p000mt.plus.R.attr.MT_Protector, typedValue, true);
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
                                C1473 c1473 = new C1473(context, 0);
                                c1473.getTheme().setTo(themeNewTheme);
                                context = c1473;
                            }
                        }
                        C0994 c0996 = new C0994(context);
                        c0996.setCallback(this);
                        C0994 c0997 = c1810.f65686;
                        if (c0996 != c0997) {
                            if (c0997 != null) {
                                c0997.removeMenuPresenter(c1810.f65683);
                            }
                            c1810.f65686 = c0996;
                            C1904 c1904 = c1810.f65683;
                            if (c1904 != null) {
                                c0996.addMenuPresenter(c1904);
                            }
                        }
                        if (c1810.f65686 != null) {
                            if (z2 && (interfaceC1813 = this.f19696) != null) {
                                if (this.f19683 == null) {
                                    this.f19683 = new C1390(this);
                                }
                                interfaceC1813.mo28465(c1810.f65686, this.f19683);
                            }
                            c1810.f65686.stopDispatchingItemsChanged();
                            if (!callback.onCreatePanelMenu(i, c1810.f65686)) {
                                c1810.f65680 = false;
                            } else {
                                c0994 = c1810.f65686;
                                if (c0994 != null) {
                                    if (c0994 != null) {
                                        c0994.removeMenuPresenter(c1810.f65683);
                                    }
                                    c1810.f65686 = null;
                                }
                                if (z2 && (interfaceC1812 = this.f19696) != null) {
                                    interfaceC1812.mo28465(null, this.f19683);
                                }
                            }
                        }
                    } else {
                        if (z2) {
                            if (this.f19683 == null) {
                                this.f19683 = new C1390(this);
                            }
                            interfaceC1813.mo28465(c1810.f65686, this.f19683);
                        }
                        c1810.f65686.stopDispatchingItemsChanged();
                        if (!callback.onCreatePanelMenu(i, c1810.f65686)) {
                            c1810.f65680 = false;
                        } else {
                            c0994 = c1810.f65686;
                            if (c0994 != null) {
                                if (c0994 != null) {
                                    c0994.removeMenuPresenter(c1810.f65683);
                                }
                                c1810.f65686 = null;
                            }
                            if (z2) {
                                interfaceC1812.mo28465(null, this.f19683);
                            }
                        }
                    }
                }
                c1810.f65686.stopDispatchingItemsChanged();
                Bundle bundle = c1810.f65688;
                if (bundle != null) {
                    c1810.f65686.restoreActionViewStates(bundle);
                    c1810.f65688 = null;
                }
                if (!callback.onPreparePanel(0, c1810.f65684, c1810.f65686)) {
                    if (z2 && (interfaceC1814 = this.f19696) != null) {
                        interfaceC1814.mo28465(null, this.f19683);
                    }
                    c1810.f65686.startDispatchingItemsChanged();
                    return false;
                }
                c1810.f65686.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                c1810.f65686.startDispatchingItemsChanged();
            }
            c1810.f65692 = true;
            c1810.f65693 = false;
            this.f19691 = c1810;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17351(C0994 c0994) {
        if (this.f19688) {
            return;
        }
        this.f19688 = true;
        this.f19696.mo28480();
        Window.Callback callback = this.f19661.getCallback();
        if (callback != null && !this.f19697) {
            callback.onPanelClosed(108, c0994);
        }
        this.f19688 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17353(C1810 c1810, boolean z) {
        ViewGroup viewGroup;
        InterfaceC1812 interfaceC1812;
        if (z && c1810.f65689 == 0 && (interfaceC1812 = this.f19696) != null && interfaceC1812.mo28478()) {
            m17351(c1810.f65686);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f19660.getSystemService("window");
        if (windowManager != null && c1810.f65681 && (viewGroup = c1810.f65687) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                m17346(c1810.f65689, c1810, (C0994) null);
            }
        }
        c1810.f65692 = false;
        c1810.f65693 = false;
        c1810.f65681 = false;
        c1810.f65690 = null;
        c1810.f65679 = true;
        if (this.f19691 == c1810) {
            this.f19691 = null;
        }
        if (c1810.f65689 == 0) {
            m17358();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17346(int i, C1810 c1810, C0994 c0994) {
        if (c0994 == null) {
            if (c1810 == null && i >= 0) {
                C1810[] c1810Arr = this.f19679;
                if (i < c1810Arr.length) {
                    c1810 = c1810Arr[i];
                }
            }
            if (c1810 != null) {
                c0994 = c1810.f65686;
            }
        }
        if ((c1810 == null || c1810.f65681) && !this.f19697) {
            this.f19705.m26567(this.f19661.getCallback(), i, c0994);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C1810 m17365(C0994 c0994) {
        C1810[] c1810Arr = this.f19679;
        int length = c1810Arr != null ? c1810Arr.length : 0;
        for (int i = 0; i < length; i++) {
            C1810 c1810 = c1810Arr[i];
            if (c1810 != null && c1810.f65686 == c0994) {
                return c1810;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۜ */
    public final C1810 m17359(int i) {
        C1810[] c1810Arr = this.f19679;
        if (c1810Arr == null || c1810Arr.length <= i) {
            C1810[] c1810Arr2 = new C1810[i + 1];
            if (c1810Arr != null) {
                System.arraycopy(c1810Arr, 0, c1810Arr2, 0, c1810Arr.length);
            }
            this.f19679 = c1810Arr2;
            c1810Arr = c1810Arr2;
        }
        C1810 c1810 = c1810Arr[i];
        if (c1810 != null) {
            return c1810;
        }
        C1810 c1811 = new C1810();
        c1811.f65689 = i;
        c1811.f65679 = false;
        c1810Arr[i] = c1811;
        return c1811;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m17330(C1810 c1810, int i, KeyEvent keyEvent) {
        C0994 c0994;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c1810.f65692 || m17336(c1810, keyEvent)) && (c0994 = c1810.f65686) != null) {
            return c0994.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۡ */
    private void m17333(int i) {
        this.f19662 = (1 << i) | this.f19662;
        if (this.f19682) {
            return;
        }
        View decorView = this.f19661.getDecorView();
        int i2 = C1717.f57146;
        decorView.postOnAnimation(this.f19681);
        this.f19682 = true;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m17384(int i) {
        C1810 c1810M17359 = m17359(i);
        if (c1810M17359.f65686 != null) {
            Bundle bundle = new Bundle();
            c1810M17359.f65686.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                c1810M17359.f65688 = bundle;
            }
            c1810M17359.f65686.stopDispatchingItemsChanged();
            c1810M17359.f65686.clear();
        }
        c1810M17359.f65680 = true;
        c1810M17359.f65679 = true;
        if ((i == 108 || i == 0) && this.f19696 != null) {
            C1810 c1810M173510 = m17359(0);
            c1810M173510.f65692 = false;
            m17336(c1810M173510, (KeyEvent) null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m17341(C1914 c1914) {
        boolean z;
        boolean z2;
        int iM5542;
        int iM51174 = c1914.m51174();
        C1959 c1959 = this.f19678;
        if (c1959 == null || !(c1959.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f19678.getLayoutParams();
            boolean z3 = true;
            if (this.f19678.isShown()) {
                if (this.f19669 == null) {
                    this.f19669 = new Rect();
                    this.f19700 = new Rect();
                }
                Rect rect = this.f19669;
                Rect rect2 = this.f19700;
                rect.set(c1914.m51172(), c1914.m51174(), c1914.m51182(), c1914.m51183());
                C1956.m52733(this.f19686, rect, rect2);
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                C1914 c1914M43586 = C1717.m43586(this.f19686);
                int iM51172 = c1914M43586 == null ? 0 : c1914M43586.m51172();
                int iM51182 = c1914M43586 == null ? 0 : c1914M43586.m51182();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                Context context = this.f19660;
                if (i > 0 && this.f19693 == null) {
                    View view = new View(context);
                    this.f19693 = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iM51172;
                    layoutParams.rightMargin = iM51182;
                    this.f19686.addView(this.f19693, -1, layoutParams);
                } else {
                    View view2 = this.f19693;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != iM51172 || marginLayoutParams2.rightMargin != iM51182) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = iM51172;
                            marginLayoutParams2.rightMargin = iM51182;
                            this.f19693.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.f19693;
                z3 = view3 != null;
                if (z3 && view3.getVisibility() != 0) {
                    View view4 = this.f19693;
                    if ((view4.getWindowSystemUiVisibility() & 8192) != 0) {
                        iM5542 = C0886.m5542(context, bin.p000mt.plus.R.color.MT_Protector);
                    } else {
                        iM5542 = C0886.m5542(context, bin.p000mt.plus.R.color.MT_Protector);
                    }
                    view4.setBackgroundColor(iM5542);
                }
                if (!this.f19671 && z3) {
                    iM51174 = 0;
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
                this.f19678.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = this.f19693;
        if (view5 != null) {
            view5.setVisibility(z ? 0 : 8);
        }
        return iM51174;
    }

    /* JADX INFO: renamed from: ۤ */
    private void m17334() {
        if (this.f19706) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX INFO: renamed from: ۠ */
    public final void m17361() {
        InterfaceC1812 interfaceC1812 = this.f19696;
        if (interfaceC1812 != null) {
            interfaceC1812.mo28480();
        }
        if (this.f19658 != null) {
            this.f19661.getDecorView().removeCallbacks(this.f19695);
            if (this.f19658.isShowing()) {
                try {
                    this.f19658.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f19658 = null;
        }
        C1612 c1612 = this.f19672;
        if (c1612 != null) {
            c1612.m38758();
        }
        C0994 c0994 = m17359(0).f65686;
        if (c0994 != null) {
            c0994.close();
        }
    }

    @Override // p067l.AbstractC1499
    /* JADX INFO: renamed from: ܽ */
    public final Context mo17372() {
        return this.f19660;
    }

    @Override // p067l.AbstractC1499
    /* JADX INFO: renamed from: ֫ */
    public final void mo17345() {
        final Context context = this.f19660;
        if (AbstractC1499.m34244(context) && AbstractC1499.m34239() != null && !AbstractC1499.m34239().equals(AbstractC1499.m34236())) {
            AbstractC1499.f42714.execute(new Runnable() { // from class: l.ܶܿ
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1499.m34245(context);
                }
            });
        }
        m17331(true, true);
    }

    @Override // p067l.AbstractC1499
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo17367() {
        return m17331(true, true);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    private boolean m17331(boolean z, boolean z2) {
        int i;
        boolean z3;
        int i2;
        if (this.f19697) {
            return false;
        }
        int iM34247 = this.f19667;
        if (iM34247 == -100) {
            iM34247 = AbstractC1499.m34247();
        }
        Context context = this.f19660;
        int iM17340 = m17340(context, iM34247);
        int i3 = Build.VERSION.SDK_INT;
        C1037 c1037M17339 = i3 < 33 ? m17339(context) : null;
        if (!z2 && c1037M17339 != null) {
            c1037M17339 = m17335(context.getResources().getConfiguration());
        }
        Configuration configurationM17327 = m17327(context, iM17340, c1037M17339, null, false);
        boolean z4 = this.f19694;
        boolean z5 = true;
        Object obj = this.f19665;
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
                        this.f19690 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    this.f19690 = 0;
                }
                this.f19694 = true;
                i = this.f19690;
            }
        } else {
            this.f19694 = true;
            i = this.f19690;
        }
        Configuration configuration = this.f19666;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i4 = configuration.uiMode & 48;
        int i5 = configurationM17327.uiMode & 48;
        C1037 c1037M17335 = m17335(configuration);
        C1037 c1037M17336 = c1037M17339 == null ? null : m17335(configurationM17327);
        int i6 = i4 != i5 ? 512 : 0;
        if (c1037M17336 != null && !c1037M17335.equals(c1037M17336)) {
            i6 |= C0719o.a.f2914t;
        }
        if (((~i) & i6) != 0 && z && this.f19673 && ((f19654 || this.f19663) && (obj instanceof Activity))) {
            final Activity activity = (Activity) obj;
            if (activity.isChild()) {
                z3 = false;
            } else {
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 31 && (i6 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationM17327.getLayoutDirection());
                }
                if (i7 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new Runnable() { // from class: l.ۜ᩹
                        @Override // java.lang.Runnable
                        public final void run() {
                            Activity activity2 = activity;
                            if (activity2.isFinishing() || C1261.m24105(activity2)) {
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
            if (c1037M17336 != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    C1565.m36976(configuration2, c1037M17336);
                } else {
                    configuration2.setLocale(c1037M17336.m13897(0));
                    configuration2.setLayoutDirection(c1037M17336.m13897(0));
                }
            }
            resources.updateConfiguration(configuration2, null);
            int i8 = Build.VERSION.SDK_INT;
            if (i8 < 26) {
                C1075.m15645(resources);
            }
            int i9 = this.f19676;
            if (i9 != 0) {
                context.setTheme(i9);
                if (i8 >= 23) {
                    context.getTheme().applyStyle(this.f19676, true);
                }
            }
            if (z6 && (obj instanceof Activity)) {
                Activity activity2 = (Activity) obj;
                if (activity2 instanceof InterfaceC24784) {
                    if (((InterfaceC24784) activity2).getLifecycle().mo21805().m35142(EnumC15415.CREATED)) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f19663 && !this.f19697) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (c1037M17336 != null) {
            C1037 c1037M17337 = m17335(context.getResources().getConfiguration());
            if (Build.VERSION.SDK_INT >= 24) {
                C1565.m36977(c1037M17337);
            } else {
                Locale.setDefault(c1037M17337.m13897(0));
            }
        }
        if (iM34247 != 0) {
            C1040 c1040 = this.f19699;
            if (c1040 != null) {
                c1040.m10217();
            }
        } else {
            if (this.f19699 == null) {
                this.f19699 = new C1040(this, C1215.m22135(context));
            }
            this.f19699.m10220();
        }
        if (iM34247 != 3) {
            C1285 c1285 = this.f19668;
            if (c1285 != null) {
                c1285.m10217();
            }
        } else {
            if (this.f19668 == null) {
                this.f19668 = new C1285(this, context);
            }
            this.f19668.m10220();
        }
        return z5;
    }

    /* JADX INFO: renamed from: ܿ */
    public static C1037 m17339(Context context) {
        C1037 c1037M34239;
        C1037 c1037M13894;
        Locale localeM13897;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (c1037M34239 = AbstractC1499.m34239()) == null) {
            return null;
        }
        C1037 c1037M17335 = m17335(context.getApplicationContext().getResources().getConfiguration());
        if (i >= 24) {
            if (c1037M34239.m13898()) {
                c1037M13894 = C1037.m13896();
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (int i2 = 0; i2 < c1037M17335.m13899() + c1037M34239.m13899(); i2++) {
                    if (i2 < c1037M34239.m13899()) {
                        localeM13897 = c1037M34239.m13897(i2);
                    } else {
                        localeM13897 = c1037M17335.m13897(i2 - c1037M34239.m13899());
                    }
                    if (localeM13897 != null) {
                        linkedHashSet.add(localeM13897);
                    }
                }
                c1037M13894 = C1037.m13895((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
            }
        } else if (c1037M34239.m13898()) {
            c1037M13894 = C1037.m13896();
        } else {
            c1037M13894 = C1037.m13894(C1705.m43004(c1037M34239.m13897(0)));
        }
        return c1037M13894.m13898() ? c1037M17335 : c1037M13894;
    }

    @Override // p067l.AbstractC1499
    /* JADX INFO: renamed from: ᩳ */
    public final void mo17377(int i) {
        if (this.f19667 != i) {
            this.f19667 = i;
            if (this.f19673) {
                m17331(true, true);
            }
        }
    }

    @Override // p067l.AbstractC1499
    /* JADX INFO: renamed from: ᩳ */
    public final int mo17376() {
        return this.f19667;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C1037 m17335(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C1565.m36974(configuration);
        }
        return C1037.m13894(C1705.m43004(configuration.locale));
    }

    /* JADX INFO: renamed from: ֫ */
    public static Configuration m17327(Context context, int i, C1037 c1037, Configuration configuration, boolean z) {
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
        if (c1037 != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                C1565.m36976(configuration2, c1037);
                return configuration2;
            }
            configuration2.setLocale(c1037.m13897(0));
            configuration2.setLayoutDirection(c1037.m13897(0));
        }
        return configuration2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m17340(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f19668 == null) {
                            this.f19668 = new C1285(this, context);
                        }
                        return this.f19668.m25010();
                    }
                } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    if (this.f19699 == null) {
                        this.f19699 = new C1040(this, C1215.m22135(context));
                    }
                    return this.f19699.m13957();
                }
            }
            return i;
        }
        return -1;
    }
}
