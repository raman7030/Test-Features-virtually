package l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.app.OpenAuthTask;
import com.alipay.sdk.m.m.b;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۢۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J26J */
/* JADX INFO: loaded from: classes3.dex */
public final class C9340 {

    /* JADX INFO: renamed from: ۚ᩷֨, reason: not valid java name and contains not printable characters */
    private static final short[] f28322 = {61, -4870, -4892, -4894, -4893, -4887, -4890, -4893, -4894, -4934, -4954, -4934, -4930, -4954, -4935, -4936, -4922, -4889, -4868, -4895, -4882, -4879, -4924, -4889, -4885, -4887, -4892, -4914, -4895, -4892, -4883, -4917, -4896, -4887, -4890, -4881, -4883, -4884, -4952, -4868, -4889, -4889, -4952, -4882, -4887, -4869, -4868, -4956, -4952, -4895, -4881, -4890, -4889, -4870, -4883, -4884, -4951};

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static String f28323;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static long f28324;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static long f28325;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f28326;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C9687 f28327;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C18682 f28329;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C9503 f28334;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f28335;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C13064 f28336;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C23592 f28337;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C16560 f28338;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C22181 f28339;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f28341;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C5561 f28342;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C9503 f28343;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public TextView f28345;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C16560 f28346;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C22181 f28349;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C14771 f28350;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f28351;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C19712 f28352;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f28354;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ViewGroup f28355;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f28356;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Main f28357;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ViewGroup f28358;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C9687 f28359;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ArrayList f28331 = new ArrayList();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f28332 = true;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11971 f28328 = new C11971();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final RunnableC7182 f28330 = new Runnable() { // from class: l.۟ۖܳ
        @Override // java.lang.Runnable
        public final void run() {
            this.f21980.m24068();
        }
    };

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC1578 f28340 = new View.OnClickListener() { // from class: l.֫ۘܳ
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C9340.m24032(this.f5586, view);
        }
    };

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C8817 f28348 = C8817.m22786(200);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f28347 = false;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f28360 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8817 f28333 = C8817.m22786(50);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f28353 = true;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f28344 = true;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24032(C9340 c9340, View view) {
        C16560 c16560 = c9340.f28346;
        C16560 c16561 = c9340.f28338;
        int id = view.getId();
        if (id == R.id.MT_Protector) {
            c9340.m24077(true);
            c16561.m39024();
            return;
        }
        if (id == R.id.MT_Protector) {
            c9340.m24077(false);
            c16560.m39024();
        } else if (id == R.id.MT_Protector) {
            c9340.m24077(true);
            c16561.m39013();
        } else if (id == R.id.MT_Protector) {
            c9340.m24077(false);
            c16560.m39013();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.۟ۖܳ] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.֫ۘܳ] */
    public C9340(Main main, Bundle bundle) {
        this.f28357 = main;
        this.f28339 = (C22181) main.m10241(R.id.MT_Protector);
        this.f28349 = (C22181) main.m10241(R.id.MT_Protector);
        this.f28352 = (C19712) main.m10241(R.id.MT_Protector);
        this.f28334 = (C9503) main.m10241(R.id.MT_Protector);
        this.f28343 = (C9503) main.m10241(R.id.MT_Protector);
        C13064 c13064 = (C13064) main.m10241(R.id.MT_Protector);
        this.f28336 = c13064;
        this.f28343.m24356(c13064);
        this.f28350 = (C14771) main.m10241(R.id.MT_Protector);
        this.f28358 = (ViewGroup) main.m10241(R.id.MT_Protector);
        this.f28355 = (ViewGroup) main.m10241(R.id.MT_Protector);
        this.f28358.setOnClickListener(new ViewOnClickListenerC6289(2, this));
        int i = 0;
        this.f28355.setOnClickListener(new ViewOnClickListenerC17806(i, this));
        this.f28352.m45414(this.f28336);
        this.f28352.m45415(this.f28350);
        this.f28350.m35117(new C17100());
        C9687 c9687 = (C9687) main.m10241(R.id.MT_Protector);
        this.f28327 = c9687;
        c9687.m24634(true);
        c9687.m24633(new C21847(this));
        C9687 c9688 = (C9687) main.m10241(R.id.MT_Protector);
        this.f28359 = c9688;
        c9688.m24634(false);
        c9688.m24633(new C2949(i, this));
        this.f28345 = (TextView) main.m10241(R.id.MT_Protector);
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: l.۬ۖܳ
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                C9340.m24031(this.f38516, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        };
        this.f28327.addOnLayoutChangeListener(onLayoutChangeListener);
        this.f28359.addOnLayoutChangeListener(onLayoutChangeListener);
        final int iM27878 = C11266.m27878(25.0f);
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: l.۫ۖܳ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C9340.m24036(this.f36203, iM27878, view, motionEvent);
            }
        };
        this.f28334.m24355(onTouchListener);
        this.f28343.m24355(onTouchListener);
        this.f28342 = new C5561(this, main);
        this.f28352.m45413();
        this.f28352.m45411(R.drawable.MT_Protector, R.drawable.MT_Protector);
        this.f28352.m45411(R.drawable.MT_Protector, R.drawable.MT_Protector);
        this.f28352.m45422(R.drawable.MT_Protector, 45);
        C18682 c18682 = new C18682(this.f28352);
        this.f28329 = c18682;
        this.f28352.m45412(c18682).m38121();
        this.f28352.m45411(R.drawable.MT_Protector, R.drawable.MT_Protector);
        this.f28352.setOnClickListener(new ViewOnClickListenerC11416(0, this));
        this.f28352.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.᩺ۖܳ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C9340.m24030(this.f73351);
                return true;
            }
        });
        this.f28357.m124(new Runnable() { // from class: l.ۛۖܳ
            @Override // java.lang.Runnable
            public final void run() {
                C9340.m24037(this.f17744);
            }
        });
        main.getLifecycle().mo19833(new C10005(0, this));
        boolean z = this.f28332;
        if (bundle == null || !bundle.containsKey("WindowManagerData")) {
            boolean zEquals = C11003.equals(ApplicationC20075.f65010.getString("load_path_left", "0"), "0");
            boolean zEquals2 = C11003.equals(ApplicationC20075.f65010.getString("load_path_right", "0"), "0");
            String strMo23554 = C16293.f50120.mo23554();
            String string = ApplicationC20075.f65008.getString("home_path_left", strMo23554);
            String string2 = ApplicationC20075.f65008.getString("home_path_right", strMo23554);
            String string3 = ApplicationC20075.f65008.getString("last_path_left", string);
            String string4 = ApplicationC20075.f65008.getString("last_path_right", string2);
            string = zEquals ? string : string3;
            String str = zEquals2 ? string2 : string4;
            this.f28338 = new C16560(this, this.f28334, new C16773(string), true, null);
            this.f28346 = new C16560(this, this.f28343, new C16773(str), false, null);
        } else {
            C12951 c12951M31485 = C12951.m31485(bundle.getByteArray("WindowManagerData"));
            boolean zM31498 = c12951M31485.m31498();
            C16773.m39495(c12951M31485);
            this.f28338 = new C16560(this, this.f28334, C13654.m32811(c12951M31485), true, c12951M31485);
            this.f28346 = new C16560(this, this.f28343, C13654.m32811(c12951M31485), false, c12951M31485);
            int iM31494 = c12951M31485.m31494();
            for (int i2 = 0; i2 < iM31494; i2++) {
                this.f28328.add(C13654.m32811(c12951M31485));
            }
            C12327.m29911(1000);
            z = zM31498;
        }
        this.f28338.m39006(this.f28346);
        this.f28346.m39006(this.f28338);
        this.f28338.m39011(true);
        this.f28346.m39011(false);
        m24092();
        m24077(z);
        this.f28357.getLifecycle().mo19833(new InterfaceC17236() { // from class: l.ܽۘܳ
            @Override // l.InterfaceC17236
            /* JADX INFO: renamed from: ֫ */
            public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
                C9340.m24039(this.f50432, enumC22901);
            }
        });
        C7261.f22281.m1668(main, new InterfaceC1008() { // from class: l.ۧۘܳ
            @Override // l.InterfaceC1008
            /* JADX INFO: renamed from: ֫ */
            public final void mo1617(Object obj) {
                C9340.m24033(this.f32378, (EnumC13610) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24033(C9340 c9340, EnumC13610 enumC13610) {
        if (enumC13610.m32729()) {
            return;
        }
        C16560 c16560 = c9340.f28346;
        C16560 c16561 = c9340.f28338;
        C11971 c11971 = c9340.f28328;
        c11971.m29245();
        try {
            int size = c11971.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                AbstractC16891 abstractC16891 = (AbstractC16891) c11971.get(size);
                if ((abstractC16891 instanceof C5259) && !(((AbstractC3163) abstractC16891.mo6020()).m9690() instanceof C1936)) {
                    c11971.m29245();
                    try {
                        c9340.m24050(size);
                        c11971.m29244();
                    } catch (Throwable th) {
                        c11971.m29244();
                        throw th;
                    }
                }
            }
            if (c16561.m39035(b.k) && !(((AbstractC3163) c16561.m39044().mo6020()).m9690() instanceof C1936)) {
                c9340.m24059(c16561);
            }
            if (c16560.m39035(b.k) && !(((AbstractC3163) c16560.m39044().mo6020()).m9690() instanceof C1936)) {
                c9340.m24059(c16560);
            }
            c11971.m29244();
        } catch (Throwable th2) {
            c11971.m29244();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24039(C9340 c9340, EnumC22901 enumC22901) {
        if (enumC22901 == EnumC22901.ON_PAUSE) {
            if (f28323 != null) {
                if (SystemClock.uptimeMillis() < f28324) {
                    c9340.f28356 = f28323;
                    f28325 = SystemClock.uptimeMillis() + 200;
                }
                f28323 = null;
                return;
            }
            return;
        }
        if (enumC22901 != EnumC22901.ON_RESUME || c9340.f28356 == null) {
            return;
        }
        if (SystemClock.uptimeMillis() > f28325) {
            c9340.m24070().f50891.m29925(c9340.f28356);
        }
        c9340.f28356 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24035(InterfaceC17889 interfaceC17889, int i) {
        f28323 = interfaceC17889.getPath();
        f28324 = SystemClock.uptimeMillis() + ((long) i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24074() {
        this.f28328.m29245();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m24083() {
        this.f28328.m29244();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24038(C9340 c9340, View view) {
        if (c9340.f28338.m39040()) {
            return;
        }
        view.setVisibility(8);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24044(C9340 c9340, View view) {
        if (c9340.f28346.m39040()) {
            return;
        }
        view.setVisibility(8);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24031(C9340 c9340, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        c9340.m24047(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m24036(C9340 c9340, int i, View view, MotionEvent motionEvent) {
        if (!c9340.f28336.m31666(8388611)) {
            if (motionEvent.getAction() == 0) {
                c9340.m24047(true);
                if (view != c9340.f28334) {
                    c9340.f28327.m2220();
                    c9340.m24077(false);
                } else if (motionEvent.getX() >= i) {
                    c9340.f28359.m2220();
                    c9340.m24077(true);
                }
            }
            if (view == c9340.f28334) {
                return c9340.f28338.f50891.f36909.onTouch(view, motionEvent);
            }
            return c9340.f28346.f50891.f36909.onTouch(view, motionEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24034(C9340 c9340, EnumC22901 enumC22901) {
        if (enumC22901 == EnumC22901.ON_PAUSE) {
            c9340.m24047(false);
            AbstractC16891 abstractC16891M39044 = c9340.f28338.m39044();
            AbstractC16891 abstractC16891M39045 = c9340.f28346.m39044();
            C11971<AbstractC16891> c11971 = c9340.f28328;
            c11971.m29245();
            try {
                if (!(abstractC16891M39044 instanceof C16773)) {
                    for (AbstractC16891 abstractC16891 : c11971) {
                        if (abstractC16891 instanceof C16773) {
                            abstractC16891M39044 = abstractC16891;
                        }
                    }
                }
                if (!(abstractC16891M39045 instanceof C16773)) {
                    for (AbstractC16891 abstractC16892 : c11971) {
                        if (abstractC16892 != abstractC16891M39044 && (abstractC16892 instanceof C16773)) {
                            abstractC16891M39045 = abstractC16892;
                        }
                    }
                }
                c11971.m29244();
                ApplicationC20075.f65008.edit().putString("last_path_left", abstractC16891M39044.m39742()).putString("last_path_right", abstractC16891M39045.m39742()).apply();
            } catch (Throwable th) {
                c11971.m29244();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m24082() {
        return this.f28342.m15804();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m24037(C9340 c9340) {
        c9340.m24047(false);
        c9340.f28334.setSelector(C19890.m45739());
        c9340.f28343.setSelector(C19890.m45739());
        c9340.f28338.f50891.m29927();
        c9340.f28346.f50891.m29927();
        c9340.f28352.m45417();
        c9340.f28327.m24632(C21943.f70274);
        c9340.f28359.m24632(C21943.f70274);
        c9340.m24049(true);
        c9340.m24049(false);
        float fIntBitsToFloat = Float.intBitsToFloat(C21238.m48210(c9340.f28357.getTheme(), R.attr.MT_Protector));
        c9340.f28339.setAlpha(fIntBitsToFloat);
        c9340.f28349.setAlpha(fIntBitsToFloat);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(C21943.f70257, PorterDuff.Mode.SRC_IN);
        ((ProgressBar) c9340.f28358.getChildAt(0)).getIndeterminateDrawable().setColorFilter(porterDuffColorFilter);
        ((ProgressBar) c9340.f28355.getChildAt(0)).getIndeterminateDrawable().setColorFilter(porterDuffColorFilter);
        Button button = (Button) c9340.f28358.getChildAt(1);
        Button button2 = new Button(c9340.f28357);
        button.setTextColor(button2.getTextColors());
        button.setBackground(button2.getBackground());
        ((TextView) c9340.f28358.getChildAt(2)).setTextColor(C21943.f70260);
        Button button3 = (Button) c9340.f28355.getChildAt(1);
        Button button4 = new Button(c9340.f28357);
        button3.setTextColor(button4.getTextColors());
        button3.setBackground(button4.getBackground());
        ((TextView) c9340.f28355.getChildAt(2)).setTextColor(C21943.f70260);
        c9340.f28342.m15806();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24061(C16560 c16560, AbstractC16891 abstractC16891) {
        C11971 c11971 = this.f28328;
        c11971.m29245();
        try {
            AbstractC16891 abstractC16891M39044 = c16560.m39044();
            if (abstractC16891M39044.mo35229()) {
                c11971.add(abstractC16891M39044);
                abstractC16891M39044.mo15167();
            } else {
                if (abstractC16891M39044.m39732() == 0) {
                    throw new RuntimeException("Can not close the FileVisitor which has no parent id.");
                }
                abstractC16891M39044.m39744();
            }
            c16560.m39034(abstractC16891);
            c11971.m29244();
            C5935.m16666();
        } catch (Throwable th) {
            c11971.m29244();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24059(C16560 c16560) {
        AbstractC16891 abstractC16891;
        C11971 c11971 = this.f28328;
        c11971.m29245();
        try {
            if (c11971.isEmpty()) {
                throw new IllegalStateException("No background visitor.");
            }
            AbstractC16891 abstractC16891M39044 = c16560.m39044();
            if (abstractC16891M39044.m39732() == 0) {
                throw new RuntimeException("Can not close the FileVisitor which has no parent id.");
            }
            int iM39732 = abstractC16891M39044.m39732();
            abstractC16891M39044.m39744();
            if (iM39732 == 0) {
                abstractC16891 = null;
                break;
            }
            Iterator<E> it = c11971.iterator();
            while (true) {
                if (!it.hasNext()) {
                    abstractC16891 = null;
                    break;
                }
                abstractC16891 = (AbstractC16891) it.next();
                if (abstractC16891.m39746() == iM39732) {
                    it.remove();
                    break;
                }
            }
            if (abstractC16891 == null) {
                Iterator<E> it2 = c11971.iterator();
                while (it2.hasNext()) {
                    AbstractC16891 abstractC16892 = (AbstractC16891) it2.next();
                    if (abstractC16892 instanceof C16773) {
                        it2.remove();
                        abstractC16891 = abstractC16892;
                        break;
                    }
                }
            }
            if (abstractC16891 == null) {
                abstractC16891 = (AbstractC16891) c11971.remove(c11971.size() - 1);
            }
            c16560.m39034(abstractC16891);
            abstractC16891.mo6018(c16560);
            c11971.m29244();
            C5935.m16666();
        } catch (Throwable th) {
            c11971.m29244();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24076(C16560 c16560) {
        AbstractC16891 abstractC16891;
        C11971 c11971 = this.f28328;
        c11971.m29245();
        try {
            if (c11971.isEmpty()) {
                throw new IllegalStateException("No background visitor.");
            }
            AbstractC16891 abstractC16891M39044 = c16560.m39044();
            int iM39732 = abstractC16891M39044.m39732();
            if (iM39732 == 0) {
                abstractC16891 = null;
                break;
            }
            Iterator<E> it = c11971.iterator();
            while (true) {
                if (!it.hasNext()) {
                    abstractC16891 = null;
                    break;
                }
                abstractC16891 = (AbstractC16891) it.next();
                if (abstractC16891.m39746() == iM39732) {
                    it.remove();
                    break;
                }
            }
            if (abstractC16891 == null) {
                Iterator<E> it2 = c11971.iterator();
                while (it2.hasNext()) {
                    AbstractC16891 abstractC16892 = (AbstractC16891) it2.next();
                    if (abstractC16892 instanceof C16773) {
                        it2.remove();
                        abstractC16891 = abstractC16892;
                        break;
                    }
                }
            }
            if (abstractC16891 == null) {
                abstractC16891 = (AbstractC16891) c11971.remove(c11971.size() - 1);
            }
            c11971.add(abstractC16891M39044);
            c16560.m39034(abstractC16891);
            abstractC16891M39044.mo15167();
            abstractC16891.mo6018(c16560);
            c11971.m29244();
            C5935.m16666();
        } catch (Throwable th) {
            c11971.m29244();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24060(C16560 c16560, int i, boolean z) {
        C11971 c11971 = this.f28328;
        c11971.m29245();
        try {
            boolean zM24040 = m24040(c16560, i, z);
            c11971.m29244();
            if (zM24040) {
                C5935.m16666();
            }
        } catch (Throwable th) {
            c11971.m29244();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m24085(int i) {
        C16560 c16560M24070 = m24070();
        C11971 c11971 = this.f28328;
        c11971.m29245();
        try {
            boolean zM24040 = m24040(c16560M24070, m24045(i), true);
            c11971.m29244();
            if (zM24040) {
                C5935.m16666();
            }
            return zM24040;
        } catch (Throwable th) {
            c11971.m29244();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m24066(int i) {
        C11971 c11971 = this.f28328;
        c11971.m29245();
        try {
            return m24050(m24045(i));
        } finally {
            c11971.m29244();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m24079(int i) {
        C11971 c11971 = this.f28328;
        c11971.m29245();
        try {
            int iM24045 = m24045(i);
            boolean z = false;
            if (iM24045 >= 0 && iM24045 < c11971.size() && ((AbstractC16891) c11971.get(iM24045)).m39732() != 0) {
                z = true;
            }
            return z;
        } finally {
            c11971.m29244();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private int m24045(int i) {
        C11971 c11971 = this.f28328;
        int size = c11971.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((AbstractC16891) c11971.get(i2)).m39746() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m24040(C16560 c16560, int i, boolean z) {
        if (i < 0) {
            return false;
        }
        C11971 c11971 = this.f28328;
        if (i >= c11971.size()) {
            return false;
        }
        AbstractC16891 abstractC16891M39044 = c16560.m39044();
        AbstractC16891 abstractC16891 = (AbstractC16891) c11971.remove(i);
        if (abstractC16891M39044.mo35229()) {
            c11971.add(abstractC16891M39044);
            abstractC16891M39044.mo15167();
        } else {
            if (abstractC16891M39044.m39732() == 0) {
                throw new RuntimeException("Can not close the FileVisitor which has no parent id.");
            }
            abstractC16891M39044.m39744();
        }
        if (z) {
            c16560.m39034(abstractC16891);
        } else {
            c16560.m39047(abstractC16891);
        }
        abstractC16891.mo6018(c16560);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m24050(int i) {
        if (i < 0) {
            return false;
        }
        C11971 c11971 = this.f28328;
        if (i >= c11971.size()) {
            return false;
        }
        AbstractC16891 abstractC16891 = (AbstractC16891) c11971.remove(i);
        if (abstractC16891.m39732() == 0) {
            throw new RuntimeException("Can not close the FileVisitor which has no parent id.");
        }
        abstractC16891.m39744();
        return true;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m24071() {
        C16560 c16560 = this.f28338;
        if (c16560.m39040()) {
            return;
        }
        C16560 c16561 = this.f28346;
        if (c16561.m39040()) {
            return;
        }
        m24047(false);
        C17972 c17972M39019 = c16560.m39019();
        c16560.m39008(c16561.m39019());
        c16561.m39008(c17972M39019);
        if (!c16560.m39039()) {
            m24064(true, false);
        } else {
            m24078(true, false);
        }
        if (!c16561.m39039()) {
            m24064(false, false);
        } else {
            m24078(false, false);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m24043(C9340 c9340) {
        if (c9340.f28348.m22793()) {
            return;
        }
        C16560 c16560M24070 = c9340.m24070();
        if (c9340.f28352.m45423()) {
            int iM45427 = c9340.f28352.m45427();
            if (iM45427 == 0) {
                c16560M24070.m39031();
                return;
            }
            if (iM45427 == 1) {
                c16560M24070.m39060();
                return;
            }
            if (iM45427 == 2) {
                if (c16560M24070.m39044().mo15163()) {
                    new ViewOnClickListenerC8551(c16560M24070).m22273();
                    return;
                } else {
                    if (c16560M24070.m39039()) {
                        return;
                    }
                    c16560M24070.f50892.m37534();
                    return;
                }
            }
            if (iM45427 != 3) {
                if (iM45427 != 4) {
                    return;
                }
                c9340.f28357.getOnBackPressedDispatcher().m28892();
                return;
            } else {
                if (c16560M24070.m39044().mo6015()) {
                    c16560M24070.m39044().mo6006(c16560M24070, c16560M24070.m39026());
                    return;
                }
                return;
            }
        }
        if (c9340.f28352.m45429()) {
            int iM45428 = c9340.f28352.m45427();
            if (iM45428 == 0) {
                int i = ApplicationC20075.f65008.getInt("swipe_select_count", 0);
                if (i < 3) {
                    ApplicationC20075.f65008.edit().mo25853(i + 1, "swipe_select_count").apply();
                }
                c16560M24070.m39066();
                return;
            }
            if (iM45428 == 1) {
                c16560M24070.m39061();
                return;
            }
            if (iM45428 == 2) {
                c16560M24070.m39041();
            } else if (iM45428 == 3) {
                c16560M24070.m39029();
            } else {
                if (iM45428 != 4) {
                    return;
                }
                c9340.f28357.m10217(R.string.MT_Protector, R.string.MT_Protector, false);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24030(C9340 c9340) {
        int iM45427 = c9340.f28352.m45427();
        if (!c9340.f28352.m45423()) {
            if (c9340.f28352.m45429()) {
                if (iM45427 == 3) {
                    c9340.m24070().m39023();
                    return;
                } else {
                    c9340.f28352.m45425(iM45427, new int[]{R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector}[iM45427]);
                    return;
                }
            }
            return;
        }
        if (iM45427 == 0) {
            c9340.f28352.m45425(0, R.string.MT_Protector);
            return;
        }
        if (iM45427 == 1) {
            c9340.f28352.m45425(1, R.string.MT_Protector);
            return;
        }
        if (iM45427 == 2) {
            c9340.f28352.m45425(2, c9340.m24070().m39044().mo15163() ? R.string.MT_Protector : R.string.MT_Protector);
            return;
        }
        if (iM45427 == 3) {
            c9340.f28352.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
            c9340.m24084(false);
        } else {
            if (iM45427 != 4) {
                return;
            }
            new C0083(c9340.m24070()).m1043();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m24065() {
        if (!this.f28350.m35125()) {
            C5561 c5561 = this.f28342;
            if (c5561 != null && c5561.m15805()) {
                return true;
            }
            this.f28350.m35122();
            return true;
        }
        return m24070().m39012();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m24086() {
        this.f28350.m35122();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m24092() {
        C16560 c16560M24070 = m24070();
        if (c16560M24070.f50892.m37542()) {
            this.f28352.m45419();
            return;
        }
        AbstractC9128 abstractC9128M45410 = this.f28352.m45410(0);
        abstractC9128M45410.getClass();
        ((C16182) abstractC9128M45410).m38120(c16560M24070.m39048());
        AbstractC9128 abstractC9128M45411 = this.f28352.m45410(1);
        abstractC9128M45411.getClass();
        ((C16182) abstractC9128M45411).m38120(c16560M24070.m39054());
        AbstractC9128 abstractC9128M45412 = this.f28352.m45410(2);
        abstractC9128M45412.getClass();
        ((C4189) abstractC9128M45412).m12635(!c16560M24070.m39039() || c16560M24070.m39044().mo15163());
        AbstractC9128 abstractC9128M45413 = this.f28352.m45410(3);
        abstractC9128M45413.getClass();
        ((C16182) abstractC9128M45413).m38120(c16560M24070.m39044().mo6015());
        this.f28352.m45428();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24077(boolean z) {
        if (this.f28332 == z) {
            return;
        }
        m24047(false);
        this.f28332 = z;
        this.f28339.m49825(1.0f);
        this.f28349.m49825(1.0f);
        this.f28334.setAlpha(1.0f);
        this.f28343.setAlpha(1.0f);
        this.f28339.setVisibility(z ? 0 : 8);
        this.f28349.setVisibility(z ? 8 : 0);
        this.f28329.m43296(z);
        this.f28338.m39011(z);
        this.f28346.m39011(!z);
        m24092();
        m24093();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24063(boolean z, float f) {
        if (this.f28332 == z) {
            return;
        }
        if (f == 0.0f) {
            this.f28339.setVisibility(!z ? 0 : 8);
            this.f28349.setVisibility(z ? 0 : 8);
            this.f28339.m49825(1.0f);
            this.f28349.m49825(1.0f);
            this.f28334.setAlpha(1.0f);
            this.f28343.setAlpha(1.0f);
            return;
        }
        (z ? this.f28343 : this.f28334).setAlpha(1.0f - (0.5f * f));
        if (z) {
            this.f28339.m49825(f);
            this.f28349.m49825(1.0f - f);
        } else {
            this.f28339.m49825(1.0f - f);
            this.f28349.m49825(f);
        }
        if (this.f28339.getVisibility() != 0) {
            this.f28339.setVisibility(0);
        }
        if (this.f28349.getVisibility() != 0) {
            this.f28349.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m24089() {
        return this.f28332;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24062(C23592 c23592) {
        this.f28337 = c23592;
        c23592.m52055(new C23450(this));
        m24093();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m24088() {
        C23592 c23592 = this.f28337;
        if (c23592 != null) {
            c23592.m52062();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m24093() {
        if (this.f28337 == null) {
            return;
        }
        C9506 c9506 = m24070().f50893;
        if (c9506.m24367()) {
            this.f28337.m52058(false);
            this.f28337.m52054(c9506.m24366());
        } else {
            this.f28337.m52062();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m24084(boolean z) {
        if (this.f28337 == null) {
            return;
        }
        if (z) {
            C5009.m14500();
        }
        this.f28337.m52058(true);
        C9506 c9506 = m24070().f50893;
        if (c9506.m24367()) {
            return;
        }
        this.f28337.m52054((String) null);
        c9506.m24365(true);
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m24090() {
        this.f28338.f50891.m29927();
        this.f28346.f50891.m29927();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C16560 m24070() {
        return this.f28332 ? this.f28338 : this.f28346;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m24081() {
        m24077(!this.f28332);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C16560 m24091() {
        return this.f28338;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C16560 m24072() {
        return this.f28346;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24075(String str) {
        this.f28357.setTitle(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24056(CharSequence charSequence) {
        this.f28357.m10240().setSubtitle(charSequence);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m24067() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f28357.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f28357.getWindow().getDecorView().getWindowToken(), 0);
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Main m24073() {
        return this.f28357;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ViewGroup m24054(boolean z) {
        return z ? this.f28358 : this.f28355;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24057(Runnable runnable) {
        this.f28331.add(runnable);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:196:0x0933 A[PHI: r2 r3 r4 r21 r26 r29 r32 r34 r40
      0x0933: PHI (r2v20 short[]) = (r2v17 short[]), (r2v21 short[]) binds: [B:195:0x0931, B:182:0x086d] A[DONT_GENERATE, DONT_INLINE]
      0x0933: PHI (r3v13 int) = (r3v10 int), (r3v14 int) binds: [B:195:0x0931, B:182:0x086d] A[DONT_GENERATE, DONT_INLINE]
      0x0933: PHI (r4v14 int) = (r4v11 int), (r4v15 int) binds: [B:195:0x0931, B:182:0x086d] A[DONT_GENERATE, DONT_INLINE]
      0x0933: PHI (r21v12 boolean) = (r21v9 boolean), (r21v13 boolean) binds: [B:195:0x0931, B:182:0x086d] A[DONT_GENERATE, DONT_INLINE]
      0x0933: PHI (r26v5 short[]) = (r26v4 short[]), (r26v3 short[]) binds: [B:195:0x0931, B:182:0x086d] A[DONT_GENERATE, DONT_INLINE]
      0x0933: PHI (r29v4 int) = (r29v3 int), (r29v5 int) binds: [B:195:0x0931, B:182:0x086d] A[DONT_GENERATE, DONT_INLINE]
      0x0933: PHI (r32v13 l.۫ۤۡ) = (r32v10 l.۫ۤۡ), (r32v14 l.۫ۤۡ) binds: [B:195:0x0931, B:182:0x086d] A[DONT_GENERATE, DONT_INLINE]
      0x0933: PHI (r34v15 l.ܽ᩷ܳ) = (r34v12 l.ܽ᩷ܳ), (r34v16 l.ܽ᩷ܳ) binds: [B:195:0x0931, B:182:0x086d] A[DONT_GENERATE, DONT_INLINE]
      0x0933: PHI (r40v9 java.lang.String) = (r40v6 java.lang.String), (r40v10 java.lang.String) binds: [B:195:0x0931, B:182:0x086d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public void m24053() throws Throwable {
        int i;
        boolean z;
        int iM6981;
        AbstractC16891 abstractC16891;
        int i2;
        int i3;
        int i4;
        int i5;
        int iM6982;
        String str;
        AbstractC16891 abstractC16892;
        InterfaceC12344 interfaceC12344;
        short[] sArr;
        boolean z2;
        int i6;
        int iM6983;
        int i7;
        int i8;
        String strM12578;
        int i9;
        int i10;
        int iM2566;
        int i11;
        int i12;
        int i13;
        int iM6984;
        int i14;
        C9340 c9340 = this;
        int i15 = 0;
        int i16 = 945577175;
        int i17 = C3019.f9544;
        int i18 = RunnableC3474.f10992;
        int iM2567 = C0630.m2566("ۙۖ") ^ i18;
        int i19 = ((iM2567 ^ i17) * (-23423)) ^ (-1784038781);
        int i20 = iM2567 ^ 1552979298;
        PrintStream printStream = null;
        ArrayList arrayList = null;
        Throwable th = null;
        AbstractC16891 abstractC16893 = null;
        Object it = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        boolean zM5910 = false;
        boolean zMo6016 = false;
        boolean zMo6017 = false;
        boolean zMo6018 = false;
        boolean z3 = false;
        InterfaceC12344 interfaceC12345 = null;
        boolean zMo6011 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        char c = 0;
        short s = 0;
        int i21 = 0;
        int i22 = 0;
        short s2 = 0;
        int i23 = 0;
        int i24 = 0;
        String str2 = null;
        C11971 c11971 = null;
        Iterator it2 = null;
        final AbstractC16891 abstractC16894 = null;
        int i25 = 0;
        boolean zM5911 = false;
        C16560 c16560 = null;
        C16560 c16561 = null;
        while (true) {
            boolean z7 = false;
            while (true) {
                i16 = i20 ^ (i19 & (((i16 ^ i17) * (-20445)) >> 31));
                switch (i16) {
                    case -2123056728:
                    case -1162132828:
                        zMo6016 = C2126.m7043(c16560).mo6016();
                        iM6984 = (C0630.m2566("ۡۗ") + i17) * 23;
                        i10 = ((iM6984 ^ i18) * (-8469)) ^ (-867856070);
                        i14 = 93670584;
                        i20 = iM6984 ^ i14;
                        i19 = i10;
                        break;
                    case -2101590574:
                    case 1126911275:
                        if (z4) {
                            iM6984 = (C0630.m2566("᩷ܺ") ^ i18) * 9;
                            i10 = ((iM6984 ^ i17) * 20763) ^ 398848601;
                            i14 = -37497803;
                        } else {
                            iM6984 = C2105.m6981("᩷᩻") ^ i17;
                            i10 = ((iM6984 ^ i18) * (-11539)) ^ 766222383;
                            i14 = -144317736;
                        }
                        i20 = iM6984 ^ i14;
                        i19 = i10;
                        break;
                    case -2006177301:
                    case 1936264226:
                        boolean z8 = c9340.f28332;
                        int iM2568 = (C0630.m2566("᩹ۧ") + i18) * (-71);
                        z3 = z8;
                        i19 = ((iM2568 ^ i17) * 3997) ^ (-778261793);
                        i20 = iM2568 ^ 397330393;
                        break;
                    case -1992932804:
                    case -1504711084:
                        if (zMo6011) {
                            iM6984 = (C2105.m6981("᩶᩵") + i18) * (-37);
                            i10 = ((iM6984 ^ i17) * 16453) ^ 120686476;
                            i14 = -1886740021;
                        } else {
                            iM6984 = (C2105.m6981("᩻۟") + i17) * 11;
                            i10 = ((iM6984 ^ i18) * (-21515)) ^ (-1930878057);
                            i14 = 1933351249;
                        }
                        i20 = iM6984 ^ i14;
                        i19 = i10;
                        break;
                    case -1977546820:
                    case 498344538:
                        i13 = i25 + 1;
                        int iM6985 = (C2105.m6981("᩷۬") ^ i17) * 89;
                        int i26 = i13;
                        i19 = ((iM6985 ^ i18) * (-5897)) ^ 662569506;
                        i20 = iM6985 ^ 1551940679;
                        abstractC16894 = abstractC16894;
                        i23 = i23;
                        i15 = i15;
                        i25 = i26;
                        break;
                    case -1933458757:
                    case -1861471081:
                        interfaceC12344 = interfaceC12345;
                        i = i23;
                        abstractC16892 = abstractC16894;
                        z2 = z7;
                        sArr = sArr3;
                        i6 = i24;
                        strM12578 = C4159.m12578(sArr, i6, 15, i);
                        if (C7106.f21815 == 0) {
                            int iM2569 = C0630.m2566("ۗ۠") ^ i17;
                            i19 = ((iM2569 ^ i18) * (-14779)) ^ 1315114758;
                            i20 = iM2569 ^ (-872669210);
                            sArr3 = sArr;
                            i24 = i6;
                            z7 = z2;
                            interfaceC12345 = interfaceC12344;
                            abstractC16894 = abstractC16892;
                            str2 = strM12578;
                            i23 = i;
                        } else {
                            int iM25610 = C0630.m2566("ۗۜ") ^ i18;
                            String str3 = strM12578;
                            i19 = ((iM25610 ^ i17) * 21747) ^ (-912800304);
                            sArr3 = sArr;
                            i24 = i6;
                            z7 = z2;
                            interfaceC12345 = interfaceC12344;
                            abstractC16894 = abstractC16892;
                            str2 = str3;
                            i20 = iM25610 ^ (-946604422);
                            i23 = i;
                            c9340 = this;
                        }
                        break;
                    case -1929743797:
                    case 807891432:
                        C5935.m16666();
                        iM6984 = C2105.m6981("᩷᩻") ^ i17;
                        i10 = ((iM6984 ^ i18) * (-11539)) ^ 766222383;
                        i14 = -144317736;
                        i20 = iM6984 ^ i14;
                        i19 = i10;
                        break;
                    case -1875985516:
                    case 1087285577:
                        if (C11340.f33930 < 0) {
                            str = str2;
                            i = i23;
                            abstractC16892 = abstractC16894;
                            interfaceC12344 = interfaceC12345;
                            sArr = sArr3;
                            z2 = z7;
                            i6 = i24;
                            iM6983 = C2105.m6981("ᩳ᩹") ^ i18;
                            i7 = ((iM6983 ^ i17) * 13087) ^ 816534242;
                            i8 = -1553660065;
                            i20 = iM6983 ^ i8;
                            i19 = i7;
                            sArr3 = sArr;
                            i24 = i6;
                            z7 = z2;
                            interfaceC12345 = interfaceC12344;
                            abstractC16894 = abstractC16892;
                            str2 = str;
                            c9340 = this;
                            i23 = i;
                        } else {
                            iM6984 = C2105.m6981("֡ۛ") ^ i17;
                            i10 = ((iM6984 ^ i18) * 5003) ^ (-1700271695);
                            i14 = -246717893;
                            i20 = iM6984 ^ i14;
                            i19 = i10;
                        }
                        break;
                    case -1808651190:
                    case -1501961934:
                        C0798.m2998();
                        C3019.m9255();
                        return;
                    case -1803120965:
                    case 1901785275:
                        C3911.m11926(new RunnableC15608(0));
                        return;
                    case -1746700980:
                    case -1727833402:
                        C7106.m19120();
                        if (C0964.f3626 != 0) {
                            iM6984 = C2105.m6981("֡ۛ") ^ i17;
                            i10 = ((iM6984 ^ i18) * 5003) ^ (-1700271695);
                            i14 = -246717893;
                            i20 = iM6984 ^ i14;
                            i19 = i10;
                        } else {
                            strM12578 = str2;
                            i = i23;
                            abstractC16892 = abstractC16894;
                            interfaceC12344 = interfaceC12345;
                            sArr = sArr3;
                            z2 = z7;
                            i6 = i24;
                            int iM25611 = C0630.m2566("ۗۜ") ^ i18;
                            String str4 = strM12578;
                            i19 = ((iM25611 ^ i17) * 21747) ^ (-912800304);
                            sArr3 = sArr;
                            i24 = i6;
                            z7 = z2;
                            interfaceC12345 = interfaceC12344;
                            abstractC16894 = abstractC16892;
                            str2 = str4;
                            i20 = iM25611 ^ (-946604422);
                            i23 = i;
                            c9340 = this;
                        }
                        break;
                    case -1734177569:
                    case 738878140:
                        C0798.m3012((Runnable) C3537.m10755(arrayList, i25));
                        if (C1504.f5354) {
                            iM6984 = C2105.m6981("ۘ᩸") ^ i17;
                            i10 = ((iM6984 ^ i18) * (-30917)) ^ 1098826130;
                            i14 = 2106580164;
                        } else {
                            iM6984 = (C0630.m2566("ܽ᩺") ^ i17) * (-57);
                            i10 = ((iM6984 ^ i18) * 32049) ^ 1085132944;
                            i14 = 179927201;
                        }
                        i20 = iM6984 ^ i14;
                        i19 = i10;
                        break;
                    case -1733646711:
                    case -1613596715:
                        z5 = false;
                        iM6984 = C2105.m6981("ܿۚ") ^ i18;
                        i10 = ((iM6984 ^ i17) * (-67)) ^ 1318116322;
                        i14 = 1132807204;
                        i20 = iM6984 ^ i14;
                        i19 = i10;
                        break;
                    case -1718608136:
                    case 1734138696:
                        c16561.m39036();
                        c16560.m39036();
                        iM6984 = C0630.m2566("ۢᩴ") ^ i17;
                        i10 = ((iM6984 ^ i18) * 28497) ^ (-473638564);
                        i14 = -437279795;
                        i20 = iM6984 ^ i14;
                        i19 = i10;
                        break;
                    case -1626233928:
                    case 354028171:
                        c9340.m24059(c16560);
                        iM6984 = (i17 - C2105.m6981("ۛ֡")) * (-65);
                        i10 = ((iM6984 ^ i18) * (-4541)) ^ 179699789;
                        i14 = 848952127;
                        i20 = iM6984 ^ i14;
                        i19 = i10;
                        break;
                    case -1621641392:
                    case -1492977188:
                        AbstractC16891 abstractC16895 = (AbstractC16891) C2272.m7513(it2);
                        try {
                            zMo6017 = abstractC16895.mo6016();
                            int iM6986 = (i18 - C2105.m6981("֫ܶ")) * 109;
                            i20 = iM6986 ^ 1351064598;
                            i19 = ((iM6986 ^ i17) * (-2513)) ^ 1424271908;
                            abstractC16893 = abstractC16895;
                        } catch (Throwable th2) {
                            th = th2;
                            abstractC16893 = abstractC16895;
                            iM6984 = C2105.m6981("ۡܳ") ^ i17;
                            i10 = ((iM6984 ^ i18) * 27809) ^ 1362497367;
                            i14 = -855319843;
                            i20 = iM6984 ^ i14;
                            i19 = i10;
                        }
                        break;
                    case -1596175611:
                    case 639445902:
                        if (C3019.f9544 < 0) {
                            iM6984 = C2105.m6981("֡ۛ") ^ i17;
                            i10 = ((iM6984 ^ i18) * 5003) ^ (-1700271695);
                            i14 = -246717893;
                        } else {
                            iM6984 = C2105.m6981("ۖ᩹") ^ i18;
                            i10 = ((iM6984 ^ i17) * (-15995)) ^ (-2098415456);
                            i14 = -899812239;
                        }
                        i20 = iM6984 ^ i14;
                        i19 = i10;
                        break;
                    case -1574802101:
                    case 233791095:
                        it2 = c11971.iterator();
                        iM6984 = C0630.m2566("ܺ֡") ^ i18;
                        i10 = ((iM6984 ^ i17) * 31487) ^ 229727678;
                        i14 = 1345698137;
                        i20 = iM6984 ^ i14;
                        i19 = i10;
                        break;
                    case -1553061562:
                    case 1915651475:
                        i = i23;
                        abstractC16891 = abstractC16894;
                        c11971 = c9340.f28328;
                        if (c11971.m29243()) {
                            iM6981 = (i17 - C2105.m6981("ܿ᩶")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i2 = ((iM6981 ^ i18) * (-15329)) ^ 925147014;
                            i3 = 2043084972;
                        } else {
                            iM6981 = C0630.m2566("ܰۜ") ^ i18;
                            i2 = ((iM6981 ^ i17) * 12885) ^ (-177675649);
                            i3 = 772951039;
                        }
                        i20 = iM6981 ^ i3;
                        i19 = i2;
                        abstractC16894 = abstractC16891;
                        i23 = i;
                        break;
                    case -1528485805:
                    case -1030978412:
                        C3663.m11168();
                        if (C3537.f11231 < 0) {
                            i = i23;
                            z = z7;
                            iM6982 = (C2105.m6981("ۧ᩷") ^ i17) * (-37);
                            i5 = ((iM6982 ^ i18) * (-29403)) ^ 1712710023;
                            i4 = 261520013;
                            i20 = iM6982 ^ i4;
                            abstractC16894 = abstractC16894;
                            str2 = str2;
                            i23 = i;
                            boolean z9 = z;
                            interfaceC12345 = interfaceC12345;
                            i19 = i5;
                            z7 = z9;
                        } else {
                            i = i23;
                            abstractC16891 = abstractC16894;
                            iM6981 = C2105.m6981("۫֫") ^ i18;
                            i2 = ((iM6981 ^ i17) * (-10235)) ^ 1801917178;
                            i3 = -1053402488;
                            i20 = iM6981 ^ i3;
                            i19 = i2;
                            abstractC16894 = abstractC16891;
                            i23 = i;
                        }
                        break;
                    case -1472263667:
                    case -135935221:
                        C4616.m13552();
                        if (C2167.f7158 < 0) {
                            str = str2;
                            i = i23;
                            abstractC16892 = abstractC16894;
                            interfaceC12344 = interfaceC12345;
                            sArr = sArr3;
                            z2 = z7;
                            i6 = i24;
                            iM6983 = (i17 - C2105.m6981("᩸ᩳ")) * 27;
                            i7 = ((iM6983 ^ i18) * (-9973)) ^ (-1803003678);
                            i8 = 1769044487;
                            i20 = iM6983 ^ i8;
                            i19 = i7;
                            sArr3 = sArr;
                            i24 = i6;
                            z7 = z2;
                            interfaceC12345 = interfaceC12344;
                            abstractC16894 = abstractC16892;
                            str2 = str;
                            c9340 = this;
                            i23 = i;
                        } else {
                            iM6984 = C2105.m6981("ۖ᩹") ^ i18;
                            i10 = ((iM6984 ^ i17) * (-15995)) ^ (-2098415456);
                            i14 = -899812239;
                            i20 = iM6984 ^ i14;
                            i19 = i10;
                        }
                        break;
                    case -1438664395:
                    case 1329928668:
                        str = str2;
                        i = i23;
                        abstractC16892 = abstractC16894;
                        interfaceC12344 = interfaceC12345;
                        sArr = sArr3;
                        z2 = z7;
                        i6 = i24;
                        i22 = i21 + 1;
                        s2 = 1;
                        if (C3245.f10203 <= 0) {
                            iM6983 = C2105.m6981("ᩳ᩹") ^ i18;
                            i7 = ((iM6983 ^ i17) * 13087) ^ 816534242;
                            i8 = -1553660065;
                        } else {
                            iM6983 = C0630.m2566("ܳۢ") ^ i17;
                            i7 = ((iM6983 ^ i18) * 8555) ^ 1728729686;
                            i8 = 181783464;
                        }
                        i20 = iM6983 ^ i8;
                        i19 = i7;
                        sArr3 = sArr;
                        i24 = i6;
                        z7 = z2;
                        interfaceC12345 = interfaceC12344;
                        abstractC16894 = abstractC16892;
                        str2 = str;
                        c9340 = this;
                        i23 = i;
                        break;
                    case -1426646470:
                    case -1103723894:
                        z6 = true;
                        iM6984 = C2105.m6981("ۡܰ") ^ i18;
                        i10 = ((iM6984 ^ i17) * (-19895)) ^ 1545435242;
                        i14 = -1815215058;
                        i20 = iM6984 ^ i14;
                        i19 = i10;
                        break;
                    case -1414538942:
                    case -1051347078:
                        if (z3) {
                            iM6984 = (C2105.m6981("᩺ۤ") ^ i18) * 39;
                            i10 = ((iM6984 ^ i17) * 23763) ^ 707600920;
                            i14 = -1021851464;
                        } else {
                            iM6984 = C2105.m6981("֨᩺") ^ i17;
                            i10 = ((iM6984 ^ i18) * 30991) ^ 278472657;
                            i14 = 1949392602;
                        }
                        i20 = iM6984 ^ i14;
                        i19 = i10;
                        break;
                    case -1414015041:
                    case 1831952169:
                        C4075.m12263();
                        if (C3432.f10845 >= 0) {
                            iM6984 = (i17 - C0630.m2566("ܽᩳ")) * (-107);
                            i10 = ((iM6984 ^ i18) * (-29457)) ^ (-1174813941);
                            i14 = 973555054;
                            i20 = iM6984 ^ i14;
                            i19 = i10;
                        } else {
                            strM12578 = str2;
                            i = i23;
                            abstractC16892 = abstractC16894;
                            interfaceC12344 = interfaceC12345;
                            sArr = sArr3;
                            z2 = z7;
                            i6 = i24;
                            int iM25612 = C0630.m2566("ۗۜ") ^ i18;
                            String str5 = strM12578;
                            i19 = ((iM25612 ^ i17) * 21747) ^ (-912800304);
                            sArr3 = sArr;
                            i24 = i6;
                            z7 = z2;
                            interfaceC12345 = interfaceC12344;
                            abstractC16894 = abstractC16892;
                            str2 = str5;
                            i20 = iM25612 ^ (-946604422);
                            i23 = i;
                            c9340 = this;
                        }
                        break;
                    case -1297615419:
                    case 1543661106:
                        if (zMo6016) {
                            z5 = z6;
                            iM6984 = C2105.m6981("ܿۚ") ^ i18;
                            i10 = ((iM6984 ^ i17) * (-67)) ^ 1318116322;
                            i14 = 1132807204;
                        } else {
                            iM6984 = (C2105.m6981("۟۠") + i17) * 45;
                            i10 = ((iM6984 ^ i18) * 29929) ^ 681516963;
                            i14 = 1520059909;
                        }
                        i20 = iM6984 ^ i14;
                        i19 = i10;
                        break;
                    case -1196112102:
                    case 44067578:
                        AbstractC16891 abstractC16896 = (AbstractC16891) C2272.m7513(it);
                        try {
                            zMo6011 = abstractC16896.mo6011();
                            int iM6987 = (C2105.m6981("ۗ᩶") ^ i17) * (-89);
                            i20 = iM6987 ^ (-338379403);
                            i19 = ((iM6987 ^ i18) * (-27927)) ^ 333575660;
                            abstractC16894 = abstractC16896;
                        } catch (Throwable th3) {
                            th = th3;
                            abstractC16894 = abstractC16896;
                            iM6984 = C2105.m6981("ۡܳ") ^ i17;
                            i10 = ((iM6984 ^ i18) * 27809) ^ 1362497367;
                            i14 = -855319843;
                            i20 = iM6984 ^ i14;
                            i19 = i10;
                        }
                        break;
                    case -1063223222:
                    case -650923399:
                        return;
                    case -1055873254:
                    case -265272152:
                        arrayList = c9340.f28331;
                        if (i25 < C3432.m10481(arrayList)) {
                            iM6984 = (C2105.m6981("ܺ۬") ^ i18) * (-109);
                            i10 = ((iM6984 ^ i17) * 5025) ^ 1743771902;
                            i14 = 1665264177;
                        } else {
                            iM6984 = (C2105.m6981("᩶ۖ") + i18) * (-9);
                            i10 = ((iM6984 ^ i17) * 14343) ^ 1198349591;
                            i14 = 1809662578;
                        }
                        i20 = iM6984 ^ i14;
                        i19 = i10;
                        break;
                    case -1029404568:
                    case 1034043429:
                        C16441 c16441 = C17853.f54530;
                        c16560.m39002((List) c16441);
                        c16561.m39002((List) c16441);
                        return;
                    case -998754636:
                    case 27365980:
                        i = i23;
                        abstractC16891 = abstractC16894;
                        C3683.m11221(c16560, "");
                        RunnableC0588.m2444(c16561, "");
                        if (C11340.f33930 >= 0) {
                            iM6981 = C2105.m6981("۫֫") ^ i18;
                            i2 = ((iM6981 ^ i17) * (-10235)) ^ 1801917178;
                            i3 = -1053402488;
                        } else {
                            iM6981 = C2105.m6981("ۜᩳ") ^ i17;
                            i2 = ((iM6981 ^ i18) * 30857) ^ 1942983383;
                            i3 = 788917903;
                        }
                        i20 = iM6981 ^ i3;
                        i19 = i2;
                        abstractC16894 = abstractC16891;
                        i23 = i;
                        break;
                    case -979297189:
                    case 1882453426:
                        if (zM5910) {
                            iM6984 = (C2105.m6981("۠᩷") + i18) * 115;
                            i10 = ((iM6984 ^ i17) * (-10777)) ^ (-1432116888);
                            i14 = 1541733456;
                        } else {
                            iM6984 = C0630.m2566("۫ᩴ") ^ i18;
                            i10 = ((iM6984 ^ i17) * (-17063)) ^ (-842445416);
                            i14 = -526482196;
                        }
                        i20 = iM6984 ^ i14;
                        i19 = i10;
                        break;
                    case -967656067:
                    case 643648767:
                        break;
                    case -806572615:
                    case 560840532:
                        if (zMo6018) {
                            z4 = z5;
                            iM6984 = C0630.m2566("ܰᩴ") ^ i17;
                            i10 = ((iM6984 ^ i18) * 1431) ^ (-1067768970);
                            i14 = -1631028074;
                        } else {
                            iM6984 = (C0630.m2566("֨ܺ") + i18) * 17;
                            i10 = ((iM6984 ^ i17) * (-18585)) ^ 1304316045;
                            i14 = -585919283;
                        }
                        i20 = iM6984 ^ i14;
                        i19 = i10;
                        break;
                    case -656517748:
                    case 139380207:
                        it = c11971.iterator();
                        iM6984 = (C2105.m6981("᩻۟") + i17) * 11;
                        i10 = ((iM6984 ^ i18) * (-21515)) ^ (-1930878057);
                        i14 = 1933351249;
                        i20 = iM6984 ^ i14;
                        i19 = i10;
                        break;
                    case -645220902:
                    case -187178707:
                        z4 = false;
                        iM6984 = C0630.m2566("ܰᩴ") ^ i17;
                        i10 = ((iM6984 ^ i18) * 1431) ^ (-1067768970);
                        i14 = -1631028074;
                        i20 = iM6984 ^ i14;
                        i19 = i10;
                        break;
                    case -609736026:
                    case 449258956:
                        RunnableC1937.m6376(c11971);
                        c9340.f28347 = z7;
                        return;
                    case -599017673:
                    case -506511726:
                        str = str2;
                        i = i23;
                        abstractC16892 = abstractC16894;
                        interfaceC12344 = interfaceC12345;
                        sArr = sArr3;
                        z2 = z7;
                        i6 = i24;
                        if (c9340.f28347) {
                            iM6983 = (C0630.m2566("ܶۚ") ^ i18) * (-43);
                            i7 = ((iM6983 ^ i17) * 13699) ^ 1819111380;
                            i8 = 1292510583;
                        } else {
                            iM6983 = C2105.m6981("ۚ۟") ^ i18;
                            i7 = ((iM6983 ^ i17) * (-14615)) ^ (-1996428467);
                            i8 = 269399011;
                        }
                        i20 = iM6983 ^ i8;
                        i19 = i7;
                        sArr3 = sArr;
                        i24 = i6;
                        z7 = z2;
                        interfaceC12345 = interfaceC12344;
                        abstractC16894 = abstractC16892;
                        str2 = str;
                        c9340 = this;
                        i23 = i;
                        break;
                    case -583388566:
                    case 886026027:
                        abstractC16893.m39744();
                        it2.remove();
                        iM6984 = C0630.m2566("ᩴܺ") ^ i17;
                        i10 = ((iM6984 ^ i18) * (-24709)) ^ (-93696439);
                        i14 = 1402220604;
                        i20 = iM6984 ^ i14;
                        i19 = i10;
                        break;
                    case -533975924:
                    case 443211998:
                        if (zMo6017) {
                            iM6984 = C2105.m6981("ۡܰ") ^ i18;
                            i10 = ((iM6984 ^ i17) * (-19895)) ^ 1545435242;
                            i14 = -1815215058;
                        } else {
                            iM6984 = (C2105.m6981("۠۟") + i17) * (-57);
                            i10 = ((iM6984 ^ i18) * (-13333)) ^ 1343601293;
                            i14 = -873627741;
                        }
                        i20 = iM6984 ^ i14;
                        i19 = i10;
                        break;
                    case -533899644:
                    case 1341678590:
                        i = i23;
                        abstractC16891 = abstractC16894;
                        if (C4075.m12257(c9340.f28333)) {
                            iM6981 = (C0630.m2566("۠ۨ") ^ i18) * 37;
                            i2 = ((iM6981 ^ i17) * 5911) ^ 1767849977;
                            i3 = 1850498610;
                        } else {
                            iM6981 = C0630.m2566("֫ܺ") ^ i18;
                            i2 = ((iM6981 ^ i17) * (-18011)) ^ 798145650;
                            i3 = 661579235;
                        }
                        i20 = iM6981 ^ i3;
                        i19 = i2;
                        abstractC16894 = abstractC16891;
                        i23 = i;
                        break;
                    case -470311865:
                    case -411786153:
                        str = str2;
                        i = i23;
                        abstractC16892 = abstractC16894;
                        interfaceC12344 = interfaceC12345;
                        sArr = sArr3;
                        z2 = z7;
                        i6 = i24;
                        int i27 = s + s2;
                        if (i22 - (i27 * i27) > 0) {
                            iM6983 = C0630.m2566("᩶ᩴ") ^ i17;
                            i7 = ((iM6983 ^ i18) * (-12515)) ^ 1422711126;
                            i8 = -18842187;
                        } else {
                            iM6983 = C2105.m6981("֡ᩴ") ^ i18;
                            i7 = ((iM6983 ^ i17) * 21037) ^ (-1067157575);
                            i8 = 1030730954;
                        }
                        i20 = iM6983 ^ i8;
                        i19 = i7;
                        sArr3 = sArr;
                        i24 = i6;
                        z7 = z2;
                        interfaceC12345 = interfaceC12344;
                        abstractC16894 = abstractC16892;
                        str2 = str;
                        c9340 = this;
                        i23 = i;
                        break;
                    case -444796231:
                    case 1670895411:
                        c11971.m29245();
                        iM6984 = (i17 - C0630.m2566("ۜۡ")) * (-89);
                        i10 = ((iM6984 ^ i18) * 6283) ^ (-958407652);
                        i14 = 1858863802;
                        i20 = iM6984 ^ i14;
                        i19 = i10;
                        break;
                    case -290547006:
                    case 699642793:
                        c16560.m39036();
                        c16561.m39036();
                        iM6984 = C0630.m2566("ۢᩴ") ^ i17;
                        i10 = ((iM6984 ^ i18) * 28497) ^ (-473638564);
                        i14 = -437279795;
                        i20 = iM6984 ^ i14;
                        i19 = i10;
                        break;
                    case -232516116:
                    case 1461077956:
                        zM5910 = C1773.m5910(it2);
                        iM6984 = C0630.m2566("ܳ᩺") ^ i17;
                        i10 = ((iM6984 ^ i18) * 2117) ^ (-1681330805);
                        i14 = -1651341851;
                        i20 = iM6984 ^ i14;
                        i19 = i10;
                        break;
                    case -201998333:
                    case 480479968:
                        printStream.println(C1916.m6311(sArr4, i15, 41, i23));
                        return;
                    case -152456981:
                    case 836735315:
                        z6 = false;
                        iM6984 = C2105.m6981("ۡܰ") ^ i18;
                        i10 = ((iM6984 ^ i17) * (-19895)) ^ 1545435242;
                        i14 = -1815215058;
                        i20 = iM6984 ^ i14;
                        i19 = i10;
                        break;
                    case -90461317:
                    case 1332722590:
                        str = str2;
                        i = i23;
                        abstractC16892 = abstractC16894;
                        interfaceC12344 = interfaceC12345;
                        sArr = sArr3;
                        z2 = z7;
                        i6 = i24;
                        s = sArr2[c];
                        if (C1047.f3863 < 0) {
                            iM6983 = C2105.m6981("ۤ᩹") ^ i17;
                            i7 = ((iM6983 ^ i18) * 22331) ^ 170531527;
                            i8 = -430169591;
                            i20 = iM6983 ^ i8;
                            i19 = i7;
                            sArr3 = sArr;
                            i24 = i6;
                            z7 = z2;
                            interfaceC12345 = interfaceC12344;
                            abstractC16894 = abstractC16892;
                            str2 = str;
                            c9340 = this;
                            i23 = i;
                        } else {
                            strM12578 = str;
                            int iM25613 = C0630.m2566("ۗۜ") ^ i18;
                            String str6 = strM12578;
                            i19 = ((iM25613 ^ i17) * 21747) ^ (-912800304);
                            sArr3 = sArr;
                            i24 = i6;
                            z7 = z2;
                            interfaceC12345 = interfaceC12344;
                            abstractC16894 = abstractC16892;
                            str2 = str6;
                            i20 = iM25613 ^ (-946604422);
                            i23 = i;
                            c9340 = this;
                        }
                        break;
                    case 201153516:
                    case 241190323:
                        str = str2;
                        i = i23;
                        abstractC16892 = abstractC16894;
                        interfaceC12344 = interfaceC12345;
                        sArr = sArr3;
                        z2 = z7;
                        i6 = i24;
                        i21 = s * 2;
                        if (C0422.f1886 <= 0) {
                            iM6983 = (C2105.m6981("ܶ᩹") ^ i18) * 27;
                            i7 = ((iM6983 ^ i17) * (-4589)) ^ (-1532132041);
                            i8 = 1188709132;
                        } else {
                            iM6983 = C0630.m2566("ۨ᩷") ^ i18;
                            i7 = ((iM6983 ^ i17) * (-7315)) ^ (-843410557);
                            i8 = 783230206;
                        }
                        i20 = iM6983 ^ i8;
                        i19 = i7;
                        sArr3 = sArr;
                        i24 = i6;
                        z7 = z2;
                        interfaceC12345 = interfaceC12344;
                        abstractC16894 = abstractC16892;
                        str2 = str;
                        c9340 = this;
                        i23 = i;
                        break;
                    case 323140347:
                    case 1570614042:
                        i9 = 10612;
                        int iM25614 = (i18 - C0630.m2566("ۧۧ")) * 69;
                        i10 = ((iM25614 ^ i17) * (-24539)) ^ 32314928;
                        i20 = iM25614 ^ (-1203351434);
                        c9340 = this;
                        sArr3 = sArr3;
                        i24 = i24;
                        z7 = z7;
                        interfaceC12345 = interfaceC12345;
                        abstractC16894 = abstractC16894;
                        str2 = str2;
                        i23 = i9;
                        i19 = i10;
                        break;
                    case 327759884:
                    case 1723944400:
                        ServiceConnectionC3453.m10564();
                        if (C0483.f2088 < 0) {
                            i = i23;
                            abstractC16891 = abstractC16894;
                            iM6981 = C2105.m6981("۫֫") ^ i18;
                            i2 = ((iM6981 ^ i17) * (-10235)) ^ 1801917178;
                            i3 = -1053402488;
                            i20 = iM6981 ^ i3;
                            i19 = i2;
                            abstractC16894 = abstractC16891;
                            i23 = i;
                        } else {
                            iM6984 = (i17 - C0630.m2566("ܽᩳ")) * (-107);
                            i10 = ((iM6984 ^ i18) * (-29457)) ^ (-1174813941);
                            i14 = 973555054;
                            i20 = iM6984 ^ i14;
                            i19 = i10;
                        }
                        break;
                    case 359242838:
                    case 1619026943:
                        RunnableC1108.m3790();
                        if (C11340.f33930 >= 0) {
                            iM6984 = (i17 - C0630.m2566("ܽᩳ")) * (-107);
                            i10 = ((iM6984 ^ i18) * (-29457)) ^ (-1174813941);
                            i14 = 973555054;
                        } else {
                            iM6984 = C2105.m6981("ۘ᩸") ^ i17;
                            i10 = ((iM6984 ^ i18) * (-30917)) ^ 1098826130;
                            i14 = 2106580164;
                        }
                        i20 = iM6984 ^ i14;
                        i19 = i10;
                        break;
                    case 485121681:
                    case 1448269037:
                        C7106.m19120();
                        strM12578 = str2;
                        i = i23;
                        abstractC16892 = abstractC16894;
                        interfaceC12344 = interfaceC12345;
                        sArr = sArr3;
                        z2 = z7;
                        i6 = i24;
                        int iM25615 = C0630.m2566("ۗۜ") ^ i18;
                        String str7 = strM12578;
                        i19 = ((iM25615 ^ i17) * 21747) ^ (-912800304);
                        sArr3 = sArr;
                        i24 = i6;
                        z7 = z2;
                        interfaceC12345 = interfaceC12344;
                        abstractC16894 = abstractC16892;
                        str2 = str7;
                        i20 = iM25615 ^ (-946604422);
                        i23 = i;
                        c9340 = this;
                        break;
                    case 547721055:
                    case 1848445319:
                        C1047.m3591(c11971);
                        throw th;
                    case 577728242:
                    case 617347102:
                        zMo6018 = C4159.m12569(c16561).mo6016();
                        iM6984 = (i18 - C0630.m2566("᩵ᩴ")) * (-57);
                        i10 = ((iM6984 ^ i17) * (-29073)) ^ 1194595619;
                        i14 = -57141157;
                        i20 = iM6984 ^ i14;
                        i19 = i10;
                        break;
                    case 581454535:
                    case 1461667247:
                        try {
                            C2105.m6975(C1802.f6208, new Runnable() { // from class: l.ۙۖܳ
                                @Override // java.lang.Runnable
                                public final void run() {
                                    try {
                                        abstractC16894.mo14824(false);
                                    } catch (IOException unused) {
                                    }
                                }
                            });
                            iM6984 = (C2105.m6981("᩻۟") + i17) * 11;
                            i10 = ((iM6984 ^ i18) * (-21515)) ^ (-1930878057);
                            i14 = 1933351249;
                        } catch (Throwable th4) {
                            th = th4;
                            iM6984 = C2105.m6981("ۡܳ") ^ i17;
                            i10 = ((iM6984 ^ i18) * 27809) ^ 1362497367;
                            i14 = -855319843;
                        }
                        i20 = iM6984 ^ i14;
                        i19 = i10;
                        break;
                    case 655490518:
                    case 1571839202:
                        c9340.m24059(c16561);
                        iM6984 = C2105.m6981("ᩴ᩻") ^ i18;
                        i10 = ((iM6984 ^ i17) * (-10673)) ^ 1429127601;
                        i14 = -1791073785;
                        i20 = iM6984 ^ i14;
                        i19 = i10;
                        break;
                    case 741541393:
                    case 1031439314:
                        str = str2;
                        i = i23;
                        abstractC16892 = abstractC16894;
                        interfaceC12344 = interfaceC12345;
                        sArr = sArr3;
                        z2 = z7;
                        i6 = i24;
                        sArr2 = f28322;
                        if (C2126.f7087) {
                            iM6983 = (C2105.m6981("ܶ᩹") ^ i18) * 27;
                            i7 = ((iM6983 ^ i17) * (-4589)) ^ (-1532132041);
                            i8 = 1188709132;
                        } else {
                            iM6983 = C2105.m6981("᩻۫") ^ i17;
                            i7 = ((iM6983 ^ i18) * (-8261)) ^ 611395911;
                            i8 = -722793730;
                        }
                        i20 = iM6983 ^ i8;
                        i19 = i7;
                        sArr3 = sArr;
                        i24 = i6;
                        z7 = z2;
                        interfaceC12345 = interfaceC12344;
                        abstractC16894 = abstractC16892;
                        str2 = str;
                        c9340 = this;
                        i23 = i;
                        break;
                    case 900869225:
                    case 1183096481:
                        c9340.f28347 = true;
                        i13 = 0;
                        int iM6988 = (C2105.m6981("᩷۬") ^ i17) * 89;
                        int i28 = i13;
                        i19 = ((iM6988 ^ i18) * (-5897)) ^ 662569506;
                        i20 = iM6988 ^ 1551940679;
                        abstractC16894 = abstractC16894;
                        i23 = i23;
                        i15 = i15;
                        i25 = i28;
                        break;
                    case 961132766:
                    case 1035693926:
                        str = str2;
                        i = i23;
                        abstractC16892 = abstractC16894;
                        interfaceC12344 = interfaceC12345;
                        sArr = sArr3;
                        z2 = z7;
                        i6 = i24;
                        c = 0;
                        if (C1128.f4106 <= 0) {
                            iM6983 = (i17 - C2105.m6981("᩸ᩳ")) * 27;
                            i7 = ((iM6983 ^ i18) * (-9973)) ^ (-1803003678);
                            i8 = 1769044487;
                        } else {
                            iM6983 = C2105.m6981("۫ۙ") ^ i18;
                            i7 = ((iM6983 ^ i17) * 7707) ^ 303910884;
                            i8 = 780512125;
                        }
                        i20 = iM6983 ^ i8;
                        i19 = i7;
                        sArr3 = sArr;
                        i24 = i6;
                        z7 = z2;
                        interfaceC12345 = interfaceC12344;
                        abstractC16894 = abstractC16892;
                        str2 = str;
                        c9340 = this;
                        i23 = i;
                        break;
                    case 1085714619:
                    case 1552265620:
                        i9 = 60552;
                        int iM25616 = (i18 - C0630.m2566("ۧۧ")) * 69;
                        i10 = ((iM25616 ^ i17) * (-24539)) ^ 32314928;
                        i20 = iM25616 ^ (-1203351434);
                        c9340 = this;
                        sArr3 = sArr3;
                        i24 = i24;
                        z7 = z7;
                        interfaceC12345 = interfaceC12345;
                        abstractC16894 = abstractC16894;
                        str2 = str2;
                        i23 = i9;
                        i19 = i10;
                        break;
                    case 1160308717:
                    case 1821212223:
                        zM5911 = C1773.m5910(it);
                        iM6984 = (C0630.m2566("ۖ۠") + i18) * (-41);
                        i10 = ((iM6984 ^ i17) * (-31619)) ^ 1056387199;
                        i14 = 884099300;
                        i20 = iM6984 ^ i14;
                        i19 = i10;
                        break;
                    case 1506287895:
                    case 1710246933:
                        if (zM5911) {
                            iM6984 = C0630.m2566("ܰۡ") ^ i17;
                            i10 = ((iM6984 ^ i18) * (-32759)) ^ (-1482285908);
                            i14 = -285145413;
                        } else {
                            iM6984 = C0630.m2566("ۖۙ") ^ i18;
                            i10 = ((iM6984 ^ i17) * 23733) ^ (-1612651185);
                            i14 = -480881988;
                        }
                        i20 = iM6984 ^ i14;
                        i19 = i10;
                        break;
                    case 1910809867:
                    case 1982599838:
                        z = z7;
                        str2 = str2;
                        i = i23;
                        abstractC16894 = abstractC16894;
                        interfaceC12345 = ApplicationC20075.f65008;
                        sArr3 = f28322;
                        i24 = 1;
                        if (ServiceConnectionC3453.f10921 >= 0) {
                            iM6982 = (C2105.m6981("ۧ᩷") ^ i17) * (-37);
                            i5 = ((iM6982 ^ i18) * (-29403)) ^ 1712710023;
                            i4 = 261520013;
                        } else {
                            iM6982 = C0630.m2566("ᩴ᩺") ^ i17;
                            i5 = ((iM6982 ^ i18) * 3615) ^ (-258163543);
                            i4 = 1633879501;
                        }
                        i20 = iM6982 ^ i4;
                        abstractC16894 = abstractC16894;
                        str2 = str2;
                        i23 = i;
                        boolean z10 = z;
                        interfaceC12345 = interfaceC12345;
                        i19 = i5;
                        z7 = z10;
                        break;
                    default:
                        i = i23;
                        printStream = System.out;
                        sArr4 = f28322;
                        i15 = 16;
                        if (C3663.m11168() < 0) {
                            iM6981 = C2105.m6981("ܺ᩵") ^ i17;
                            abstractC16891 = abstractC16894;
                            i2 = ((iM6981 ^ i18) * 20601) ^ 342816021;
                            i3 = 508867464;
                            i20 = iM6981 ^ i3;
                            i19 = i2;
                            abstractC16894 = abstractC16891;
                            i23 = i;
                        } else {
                            z = z7;
                            iM6982 = (C2105.m6981("ۧ᩷") ^ i17) * (-37);
                            i5 = ((iM6982 ^ i18) * (-29403)) ^ 1712710023;
                            i4 = 261520013;
                            i20 = iM6982 ^ i4;
                            abstractC16894 = abstractC16894;
                            str2 = str2;
                            i23 = i;
                            boolean z11 = z;
                            interfaceC12345 = interfaceC12345;
                            i19 = i5;
                            z7 = z11;
                        }
                        break;
                }
            }
            int i29 = i23;
            AbstractC16891 abstractC16897 = abstractC16894;
            InterfaceC12344 interfaceC12346 = interfaceC12345;
            String str8 = str2;
            boolean zM12818 = C4263.m12818(interfaceC12346, str8, false);
            C16560 c16562 = c9340.f28346;
            C16560 c16563 = c9340.f28338;
            if (zM12818) {
                iM2566 = C2105.m6981("֫ۖ") ^ i18;
                i11 = ((iM2566 ^ i17) * 11361) ^ (-212176898);
                i12 = -1517138542;
            } else {
                iM2566 = C0630.m2566("֡᩸") ^ i17;
                i11 = ((iM2566 ^ i18) * 15263) ^ 1561798467;
                i12 = -1617967980;
            }
            i20 = iM2566 ^ i12;
            i19 = i11;
            interfaceC12345 = interfaceC12346;
            abstractC16894 = abstractC16897;
            i23 = i29;
            str2 = str8;
            c16561 = c16562;
            c16560 = c16563;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24058(String str) {
        C16560 c16560 = this.f28346;
        C16560 c16561 = this.f28338;
        if (this.f28360) {
            return;
        }
        C11971<AbstractC16891> c11971 = this.f28328;
        if (c11971.m29243()) {
            C4925.m14315(new RunnableC22286(2, str));
            return;
        }
        this.f28360 = true;
        c11971.m29245();
        try {
            Iterator<E> it = c11971.iterator();
            boolean z = false;
            while (it.hasNext()) {
                AbstractC16891 abstractC16891 = (AbstractC16891) it.next();
                if (!abstractC16891.mo6016()) {
                    abstractC16891.m39744();
                    it.remove();
                    z = true;
                }
            }
            if (!c16561.m39044().mo6016()) {
                m24059(c16561);
                z = false;
            }
            if (!c16560.m39044().mo6016()) {
                m24059(c16560);
                z = false;
            }
            if (this.f28332) {
                c16561.m39051(str);
                c16560.m39051(str);
            } else {
                c16560.m39051(str);
                c16561.m39051(str);
            }
            for (final AbstractC16891 abstractC16892 : c11971) {
                if (abstractC16892.mo15170(str)) {
                    C1802.f6208.execute(new Runnable() { // from class: l.ܰۖܳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                abstractC16892.mo14824(false);
                            } catch (IOException unused) {
                            }
                        }
                    });
                }
            }
            if (z) {
                C5935.m16666();
            }
            c11971.m29244();
            this.f28360 = false;
        } catch (Throwable th) {
            c11971.m29244();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m24069() {
        boolean z = this.f28332;
        C16560 c16560 = this.f28346;
        C16560 c16561 = this.f28338;
        if (z) {
            c16561.m39044().mo6018(c16561);
            c16560.m39044().mo6018(c16560);
        } else {
            c16560.m39044().mo6018(c16560);
            c16561.m39044().mo6018(c16561);
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m24052() {
        this.f28351 = true;
        m24047(false);
        this.f28338.m39050();
        this.f28346.m39050();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C11971 m24094() {
        return this.f28328;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m24080() {
        C11971 c11971 = this.f28328;
        c11971.m29245();
        for (int i = 0; i < c11971.size(); i++) {
            try {
                if (((AbstractC16891) c11971.get(i)) instanceof C16773) {
                    return i;
                }
            } finally {
                c11971.m29244();
            }
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m24049(boolean z) {
        FloatingActionButton floatingActionButton = z ? this.f28326 : this.f28335;
        FloatingActionButton floatingActionButton2 = z ? this.f28354 : this.f28341;
        if (floatingActionButton == null) {
            return;
        }
        floatingActionButton.setBackgroundTintList(ColorStateList.valueOf(C21943.f70257));
        floatingActionButton2.setBackgroundTintList(ColorStateList.valueOf(C21943.f70288));
        floatingActionButton.setImageTintList(ColorStateList.valueOf(C21943.f70292));
        floatingActionButton2.setImageTintList(ColorStateList.valueOf(C21943.f70292));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m24029(FloatingActionButton floatingActionButton) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) floatingActionButton.getLayoutParams();
        return (floatingActionButton.getHeight() != 0 ? floatingActionButton.getHeight() : floatingActionButton.getMeasuredHeight()) + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24064(boolean z, boolean z2) {
        m24047(true);
        if (z) {
            if (this.f28353) {
                return;
            } else {
                this.f28353 = true;
            }
        } else if (this.f28344) {
            return;
        } else {
            this.f28344 = true;
        }
        FloatingActionButton floatingActionButton = z ? this.f28326 : this.f28335;
        FloatingActionButton floatingActionButton2 = z ? this.f28354 : this.f28341;
        AnimatorSet duration = new AnimatorSet().setDuration(200L);
        if (z2) {
            duration.playTogether(ObjectAnimator.ofFloat(floatingActionButton, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(floatingActionButton2, "alpha", 1.0f, 0.0f));
        } else {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, "translationY", 0.0f, m24029(floatingActionButton));
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton2, "translationY", 0.0f, m24029(floatingActionButton2));
            duration.setInterpolator(new AccelerateInterpolator());
            duration.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        }
        duration.addListener(new C20629(floatingActionButton, floatingActionButton2));
        duration.start();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m24068() {
        m24047(true);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m24047(boolean z) {
        this.f28345.removeCallbacks(this.f28330);
        this.f28345.animate().setListener(null).cancel();
        if (!z || this.f28345.getVisibility() != 0 || this.f28345.getAlpha() == 0.0f) {
            this.f28345.setVisibility(8);
            this.f28345.setAlpha(1.0f);
        } else {
            this.f28345.animate().alpha(0.0f).setDuration(200L).setInterpolator(new AccelerateInterpolator()).setListener(new C6517(this)).start();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m24041(boolean z) {
        AccessibilityManager accessibilityManager;
        C16560 c16560 = z ? this.f28338 : this.f28346;
        if (!this.f28351 && this.f28332 == z && c16560.m39039() && this.f28357.getLifecycle().mo19832().m33028(EnumC13728.RESUMED)) {
            int iM27878 = C11266.m27878(12.0f);
            ViewGroup viewGroup = (ViewGroup) this.f28345.getParent();
            int width = ((viewGroup.getWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight()) - (iM27878 * 2);
            int iM45424 = this.f28352.m45424();
            if (!this.f28352.isShown() || width <= 0 || iM45424 <= 0) {
                return;
            }
            this.f28345.setBackgroundResource(C21238.m48211(this.f28357.getTheme(), R.attr.MT_Protector));
            this.f28345.setTextColor(C21238.m48207(this.f28357.getTheme(), R.attr.MT_Protector));
            this.f28345.setMaxWidth(width);
            this.f28345.setTextSize(2, 14.0f);
            this.f28345.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            if (this.f28345.getLineCount() > 1) {
                this.f28345.setTextSize(2, 13.0f);
            }
            TextView textView = this.f28345;
            textView.setMinHeight(C11266.m27878(24.0f) + textView.getLineHeight());
            this.f28345.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            C16900 c16900 = (C16900) this.f28345.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c16900).bottomMargin = Math.max(0, (iM45424 - this.f28345.getMeasuredHeight()) / 2) + (this.f28352.getHeight() - iM45424);
            this.f28345.setLayoutParams(c16900);
            this.f28345.animate().setListener(null).cancel();
            this.f28345.setAlpha(0.0f);
            this.f28345.setVisibility(0);
            this.f28345.animate().alpha(1.0f).setDuration(200L).setInterpolator(new DecelerateInterpolator()).start();
            int i = Build.VERSION.SDK_INT;
            int recommendedTimeoutMillis = OpenAuthTask.SYS_ERR;
            if (i >= 29 && (accessibilityManager = (AccessibilityManager) this.f28357.getSystemService("accessibility")) != null) {
                recommendedTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(OpenAuthTask.SYS_ERR, 2);
            }
            this.f28345.postDelayed(this.f28330, recommendedTimeoutMillis);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24078(boolean z, boolean z2) {
        if (z2) {
            m24047(false);
        }
        if (!z ? this.f28344 : this.f28353) {
            if (z2) {
                m24041(z);
                return;
            }
            return;
        }
        if ((z ? this.f28326 : this.f28335) == null) {
            int i = z ? R.id.MT_Protector : R.id.MT_Protector;
            Main main = this.f28357;
            FloatingActionButton floatingActionButton = (FloatingActionButton) ((ViewStub) main.m10241(i)).inflate();
            ViewOnClickListenerC1578 viewOnClickListenerC1578 = this.f28340;
            floatingActionButton.setOnClickListener(viewOnClickListenerC1578);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            floatingActionButton.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            FloatingActionButton floatingActionButton2 = (FloatingActionButton) ((ViewStub) main.m10241(z ? R.id.MT_Protector : R.id.MT_Protector)).inflate();
            floatingActionButton2.setOnClickListener(viewOnClickListenerC1578);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            floatingActionButton2.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
            if (z) {
                this.f28354 = floatingActionButton;
                this.f28326 = floatingActionButton2;
            } else {
                this.f28341 = floatingActionButton;
                this.f28335 = floatingActionButton2;
            }
            m24049(z);
        }
        if (z) {
            this.f28353 = false;
        } else {
            this.f28344 = false;
        }
        FloatingActionButton floatingActionButton3 = z ? this.f28326 : this.f28335;
        FloatingActionButton floatingActionButton4 = z ? this.f28354 : this.f28341;
        floatingActionButton3.setVisibility(0);
        floatingActionButton4.setVisibility(0);
        float fM24029 = m24029(floatingActionButton3);
        floatingActionButton3.setTranslationY(fM24029);
        floatingActionButton3.setAlpha(1.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton3, "translationY", fM24029, 0.0f);
        float fM240210 = m24029(floatingActionButton4);
        floatingActionButton4.setTranslationY(fM240210);
        floatingActionButton4.setAlpha(1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton4, "translationY", fM240210, 0.0f);
        AnimatorSet duration = new AnimatorSet().setDuration(200L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        if (z2) {
            m24041(z);
        }
        duration.start();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24055(Bundle bundle) {
        C16560 c16560 = this.f28346;
        C16560 c16561 = this.f28338;
        C10130 c10130 = new C10130();
        c10130.m25425(this.f28332);
        C16773.m39499(c10130);
        C11971<AbstractC16891> c11971 = this.f28328;
        c11971.m29245();
        try {
            AbstractC16891 abstractC16891M39044 = c16561.m39044();
            c10130.m25439(abstractC16891M39044.mo6007());
            abstractC16891M39044.mo6004(c10130);
            c16561.m39004(c10130);
            AbstractC16891 abstractC16891M39045 = c16560.m39044();
            c10130.m25439(abstractC16891M39045.mo6007());
            abstractC16891M39045.mo6004(c10130);
            c16560.m39004(c10130);
            c10130.mo13231(c11971.size());
            for (AbstractC16891 abstractC16891 : c11971) {
                c10130.m25439(abstractC16891.mo6007());
                abstractC16891.mo6004(c10130);
            }
            c11971.m29244();
            bundle.putByteArray("WindowManagerData", c10130.m25427());
        } catch (Throwable th) {
            c11971.m29244();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m24087() {
        C11971 c11971 = this.f28328;
        c11971.m29245();
        try {
            this.f28338.m39044().m39744();
            this.f28346.m39044().m39744();
            Iterator it = new ArrayList(c11971).iterator();
            while (it.hasNext()) {
                ((AbstractC16891) it.next()).m39744();
            }
            c11971.m29244();
        } catch (Throwable th) {
            c11971.m29244();
            throw th;
        }
    }
}
