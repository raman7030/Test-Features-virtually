package p067l;

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
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.alipay.sdk.app.OpenAuthTask;
import com.alipay.sdk.p010m.p035m.C0168b;
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
public final class C11245 {

    /* JADX INFO: renamed from: ۚ᩷֨, reason: not valid java name and contains not printable characters */
    private static final short[] f82102 = {61, -4870, -4892, -4894, -4893, -4887, -4890, -4893, -4894, -4934, -4954, -4934, -4930, -4954, -4935, -4936, -4922, -4889, -4868, -4895, -4882, -4879, -4924, -4889, -4885, -4887, -4892, -4914, -4895, -4892, -4883, -4917, -4896, -4887, -4890, -4881, -4883, -4884, -4952, -4868, -4889, -4889, -4952, -4882, -4887, -4869, -4868, -4956, -4952, -4895, -4881, -4890, -4889, -4870, -4883, -4884, -4951};

    /* JADX INFO: renamed from: ۧ֫ */
    public static String f31272;

    /* JADX INFO: renamed from: ܽ֫ */
    public static long f31273;

    /* JADX INFO: renamed from: ᩳ֫ */
    public static long f31274;

    /* JADX INFO: renamed from: ֡ */
    public FloatingActionButton f31275;

    /* JADX INFO: renamed from: ֨ */
    public C11575 f31276;

    /* JADX INFO: renamed from: ֫֫ */
    public C20124 f31278;

    /* JADX INFO: renamed from: ۚ */
    public C11400 f31283;

    /* JADX INFO: renamed from: ۛ */
    public FloatingActionButton f31284;

    /* JADX INFO: renamed from: ۜ */
    public C14784 f31285;

    /* JADX INFO: renamed from: ۟ */
    public C24790 f31286;

    /* JADX INFO: renamed from: ۠ */
    public C18107 f31287;

    /* JADX INFO: renamed from: ۡ */
    public C23449 f31288;

    /* JADX INFO: renamed from: ۤ */
    public FloatingActionButton f31290;

    /* JADX INFO: renamed from: ۧ */
    public C7654 f31291;

    /* JADX INFO: renamed from: ۨ */
    public C11400 f31292;

    /* JADX INFO: renamed from: ۬ */
    public TextView f31294;

    /* JADX INFO: renamed from: ܰ */
    public C18107 f31295;

    /* JADX INFO: renamed from: ܺ */
    public C23449 f31298;

    /* JADX INFO: renamed from: ܽ */
    public C16407 f31299;

    /* JADX INFO: renamed from: ܿ */
    public boolean f31300;

    /* JADX INFO: renamed from: ᩳ */
    public C21103 f31301;

    /* JADX INFO: renamed from: ᩵ */
    public FloatingActionButton f31303;

    /* JADX INFO: renamed from: ᩶ */
    public ViewGroup f31304;

    /* JADX INFO: renamed from: ᩷ */
    public String f31305;

    /* JADX INFO: renamed from: ᩸ */
    public Main f31306;

    /* JADX INFO: renamed from: ᩹ */
    public ViewGroup f31307;

    /* JADX INFO: renamed from: ᩺ */
    public C11575 f31308;

    /* JADX INFO: renamed from: ۗ */
    public final ArrayList f31280 = new ArrayList();

    /* JADX INFO: renamed from: ۘ */
    public boolean f31281 = true;

    /* JADX INFO: renamed from: ֫ */
    public final C13746 f31277 = new C13746();

    /* JADX INFO: renamed from: ۖ */
    public final RunnableC9194 f31279 = new Runnable() { // from class: l.۟ۖܳ
        @Override // java.lang.Runnable
        public final void run() {
            this.f24859.m26077();
        }
    };

    /* JADX INFO: renamed from: ۢ */
    public ViewOnClickListenerC3868 f31289 = new View.OnClickListener() { // from class: l.֫ۘܳ
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C11245.m26041(this.f8366, view);
        }
    };

    /* JADX INFO: renamed from: ܶ */
    public C10748 f31297 = C10748.m24756(200);

    /* JADX INFO: renamed from: ܳ */
    public boolean f31296 = false;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f31309 = false;

    /* JADX INFO: renamed from: ۙ */
    public final C10748 f31282 = C10748.m24756(50);

    /* JADX INFO: renamed from: ᩴ */
    public boolean f31302 = true;

    /* JADX INFO: renamed from: ۫ */
    public boolean f31293 = true;

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m26041(C11245 c11245, View view) {
        C18107 c18107 = c11245.f31295;
        C18107 c18108 = c11245.f31287;
        int id = view.getId();
        if (id == R.id.MT_Protector) {
            c11245.m26086(true);
            c18108.m41250();
            return;
        }
        if (id == R.id.MT_Protector) {
            c11245.m26086(false);
            c18107.m41250();
        } else if (id == R.id.MT_Protector) {
            c11245.m26086(true);
            c18108.m41239();
        } else if (id == R.id.MT_Protector) {
            c11245.m26086(false);
            c18107.m41239();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.۟ۖܳ] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.֫ۘܳ] */
    public C11245(Main main, Bundle bundle) {
        this.f31306 = main;
        this.f31288 = (C23449) main.m12277(R.id.MT_Protector);
        this.f31298 = (C23449) main.m12277(R.id.MT_Protector);
        this.f31301 = (C21103) main.m12277(R.id.MT_Protector);
        this.f31283 = (C11400) main.m12277(R.id.MT_Protector);
        this.f31292 = (C11400) main.m12277(R.id.MT_Protector);
        C14784 c14784 = (C14784) main.m12277(R.id.MT_Protector);
        this.f31285 = c14784;
        this.f31292.m26366(c14784);
        this.f31299 = (C16407) main.m12277(R.id.MT_Protector);
        this.f31307 = (ViewGroup) main.m12277(R.id.MT_Protector);
        this.f31304 = (ViewGroup) main.m12277(R.id.MT_Protector);
        this.f31307.setOnClickListener(new ViewOnClickListenerC8346(2, this));
        int i = 0;
        this.f31304.setOnClickListener(new ViewOnClickListenerC19291(i, this));
        this.f31301.m47718(this.f31285);
        this.f31301.m47719(this.f31299);
        this.f31299.m37264(new C18620());
        C11575 c11575 = (C11575) main.m12277(R.id.MT_Protector);
        this.f31276 = c11575;
        c11575.m26648(true);
        c11575.m26647(new C23132(this));
        C11575 c11576 = (C11575) main.m12277(R.id.MT_Protector);
        this.f31308 = c11576;
        c11576.m26648(false);
        c11576.m26647(new C5171(i, this));
        this.f31294 = (TextView) main.m12277(R.id.MT_Protector);
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: l.۬ۖܳ
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                C11245.m26040(this.f41559, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        };
        this.f31276.addOnLayoutChangeListener(onLayoutChangeListener);
        this.f31308.addOnLayoutChangeListener(onLayoutChangeListener);
        final int iM29939 = C13076.m29939(25.0f);
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: l.۫ۖܳ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C11245.m26045(this.f39215, iM29939, view, motionEvent);
            }
        };
        this.f31283.m26365(onTouchListener);
        this.f31292.m26365(onTouchListener);
        this.f31291 = new C7654(this, main);
        this.f31301.m47717();
        this.f31301.m47715(R.drawable.MT_Protector, R.drawable.MT_Protector);
        this.f31301.m47715(R.drawable.MT_Protector, R.drawable.MT_Protector);
        this.f31301.m47726(R.drawable.MT_Protector, 45);
        C20124 c20124 = new C20124(this.f31301);
        this.f31278 = c20124;
        this.f31301.m47716(c20124).m40333();
        this.f31301.m47715(R.drawable.MT_Protector, R.drawable.MT_Protector);
        this.f31301.setOnClickListener(new ViewOnClickListenerC13218(0, this));
        this.f31301.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.᩺ۖܳ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C11245.m26039(this.f76076);
                return true;
            }
        });
        this.f31306.m122(new Runnable() { // from class: l.ۛۖܳ
            @Override // java.lang.Runnable
            public final void run() {
                C11245.m26046(this.f20591);
            }
        });
        main.getLifecycle().mo21806(new C11877(0, this));
        boolean z = this.f31281;
        if (bundle == null || !bundle.containsKey("WindowManagerData")) {
            boolean zEquals = C12826.equals(ApplicationC21448.f67650.getString("load_path_left", "0"), "0");
            boolean zEquals2 = C12826.equals(ApplicationC21448.f67650.getString("load_path_right", "0"), "0");
            String strMo25505 = C17853.f53287.mo25505();
            String string = ApplicationC21448.f67649.getString("home_path_left", strMo25505);
            String string2 = ApplicationC21448.f67649.getString("home_path_right", strMo25505);
            String string3 = ApplicationC21448.f67649.getString("last_path_left", string);
            String string4 = ApplicationC21448.f67649.getString("last_path_right", string2);
            string = zEquals ? string : string3;
            String str = zEquals2 ? string2 : string4;
            this.f31287 = new C18107(this, this.f31283, new C18310(string), true, null);
            this.f31295 = new C18107(this, this.f31292, new C18310(str), false, null);
        } else {
            C14677 c14677M33572 = C14677.m33572(bundle.getByteArray("WindowManagerData"));
            boolean zM33585 = c14677M33572.m33585();
            C18310.m41731(c14677M33572);
            this.f31287 = new C18107(this, this.f31283, C15345.m34926(c14677M33572), true, c14677M33572);
            this.f31295 = new C18107(this, this.f31292, C15345.m34926(c14677M33572), false, c14677M33572);
            int iM33581 = c14677M33572.m33581();
            for (int i2 = 0; i2 < iM33581; i2++) {
                this.f31277.add(C15345.m34926(c14677M33572));
            }
            C14084.m31971(1000);
            z = zM33585;
        }
        this.f31287.m41232(this.f31295);
        this.f31295.m41232(this.f31287);
        this.f31287.m41237(true);
        this.f31295.m41237(false);
        m26101();
        m26086(z);
        this.f31306.getLifecycle().mo21806(new InterfaceC18749() { // from class: l.ܽۘܳ
            @Override // p067l.InterfaceC18749
            /* JADX INFO: renamed from: ֫ */
            public final void mo4562(InterfaceC24784 interfaceC24784, EnumC24133 enumC24133) {
                C11245.m26048(this.f53604, enumC24133);
            }
        });
        C9269.f25170.m4066(main, new InterfaceC3326() { // from class: l.ۧۘܳ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                C11245.m26042(this.f35353, (EnumC15303) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static void m26042(C11245 c11245, EnumC15303 enumC15303) {
        if (enumC15303.m34841()) {
            return;
        }
        C18107 c18107 = c11245.f31295;
        C18107 c18108 = c11245.f31287;
        C13746 c13746 = c11245.f31277;
        c13746.m31299();
        try {
            int size = c13746.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                AbstractC18422 abstractC18422 = (AbstractC18422) c13746.get(size);
                if ((abstractC18422 instanceof C7367) && !(((AbstractC5375) abstractC18422.mo8217()).m11734() instanceof C4209)) {
                    c13746.m31299();
                    try {
                        c11245.m26059(size);
                        c13746.m31298();
                    } catch (Throwable th) {
                        c13746.m31298();
                        throw th;
                    }
                }
            }
            if (c18108.m41261(C0168b.f616k) && !(((AbstractC5375) c18108.m41270().mo8217()).m11734() instanceof C4209)) {
                c11245.m26068(c18108);
            }
            if (c18107.m41261(C0168b.f616k) && !(((AbstractC5375) c18107.m41270().mo8217()).m11734() instanceof C4209)) {
                c11245.m26068(c18107);
            }
            c13746.m31298();
        } catch (Throwable th2) {
            c13746.m31298();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m26048(C11245 c11245, EnumC24133 enumC24133) {
        if (enumC24133 == EnumC24133.ON_PAUSE) {
            if (f31272 != null) {
                if (SystemClock.uptimeMillis() < f31273) {
                    c11245.f31305 = f31272;
                    f31274 = SystemClock.uptimeMillis() + 200;
                }
                f31272 = null;
                return;
            }
            return;
        }
        if (enumC24133 != EnumC24133.ON_RESUME || c11245.f31305 == null) {
            return;
        }
        if (SystemClock.uptimeMillis() > f31274) {
            c11245.m26079().f54068.m31985(c11245.f31305);
        }
        c11245.f31305 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26044(InterfaceC19370 interfaceC19370, int i) {
        f31272 = interfaceC19370.getPath();
        f31273 = SystemClock.uptimeMillis() + ((long) i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m26083() {
        this.f31277.m31299();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m26092() {
        this.f31277.m31298();
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m26047(C11245 c11245, View view) {
        if (c11245.f31287.m41266()) {
            return;
        }
        view.setVisibility(8);
    }

    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ void m26053(C11245 c11245, View view) {
        if (c11245.f31295.m41266()) {
            return;
        }
        view.setVisibility(8);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m26040(C11245 c11245, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        c11245.m26056(false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m26045(C11245 c11245, int i, View view, MotionEvent motionEvent) {
        if (!c11245.f31285.m33753(8388611)) {
            if (motionEvent.getAction() == 0) {
                c11245.m26056(true);
                if (view != c11245.f31283) {
                    c11245.f31276.m4587();
                    c11245.m26086(false);
                } else if (motionEvent.getX() >= i) {
                    c11245.f31308.m4587();
                    c11245.m26086(true);
                }
            }
            if (view == c11245.f31283) {
                return c11245.f31287.f54068.f39923.onTouch(view, motionEvent);
            }
            return c11245.f31295.f54068.f39923.onTouch(view, motionEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26043(C11245 c11245, EnumC24133 enumC24133) {
        if (enumC24133 == EnumC24133.ON_PAUSE) {
            c11245.m26056(false);
            AbstractC18422 abstractC18422M41270 = c11245.f31287.m41270();
            AbstractC18422 abstractC18422M41271 = c11245.f31295.m41270();
            C13746<AbstractC18422> c13746 = c11245.f31277;
            c13746.m31299();
            try {
                if (!(abstractC18422M41270 instanceof C18310)) {
                    for (AbstractC18422 abstractC18422 : c13746) {
                        if (abstractC18422 instanceof C18310) {
                            abstractC18422M41270 = abstractC18422;
                        }
                    }
                }
                if (!(abstractC18422M41271 instanceof C18310)) {
                    for (AbstractC18422 abstractC18423 : c13746) {
                        if (abstractC18423 != abstractC18422M41270 && (abstractC18423 instanceof C18310)) {
                            abstractC18422M41271 = abstractC18423;
                        }
                    }
                }
                c13746.m31298();
                ApplicationC21448.f67649.edit().putString("last_path_left", abstractC18422M41270.m41983()).putString("last_path_right", abstractC18422M41271.m41983()).apply();
            } catch (Throwable th) {
                c13746.m31298();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public final int m26091() {
        return this.f31291.m17719();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m26046(C11245 c11245) {
        c11245.m26056(false);
        c11245.f31283.setSelector(C21272.m48050());
        c11245.f31292.setSelector(C21272.m48050());
        c11245.f31287.f54068.m31987();
        c11245.f31295.f54068.m31987();
        c11245.f31301.m47721();
        c11245.f31276.m26646(C23223.f72985);
        c11245.f31308.m26646(C23223.f72985);
        c11245.m26058(true);
        c11245.m26058(false);
        float fIntBitsToFloat = Float.intBitsToFloat(C22553.m50541(c11245.f31306.getTheme(), R.attr.MT_Protector));
        c11245.f31288.setAlpha(fIntBitsToFloat);
        c11245.f31298.setAlpha(fIntBitsToFloat);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(C23223.f72969, PorterDuff.Mode.SRC_IN);
        ((ProgressBar) c11245.f31307.getChildAt(0)).getIndeterminateDrawable().setColorFilter(porterDuffColorFilter);
        ((ProgressBar) c11245.f31304.getChildAt(0)).getIndeterminateDrawable().setColorFilter(porterDuffColorFilter);
        Button button = (Button) c11245.f31307.getChildAt(1);
        Button button2 = new Button(c11245.f31306);
        button.setTextColor(button2.getTextColors());
        button.setBackground(button2.getBackground());
        ((TextView) c11245.f31307.getChildAt(2)).setTextColor(C23223.f72972);
        Button button3 = (Button) c11245.f31304.getChildAt(1);
        Button button4 = new Button(c11245.f31306);
        button3.setTextColor(button4.getTextColors());
        button3.setBackground(button4.getBackground());
        ((TextView) c11245.f31304.getChildAt(2)).setTextColor(C23223.f72972);
        c11245.f31291.m17721();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26070(C18107 c18107, AbstractC18422 abstractC18422) {
        C13746 c13746 = this.f31277;
        c13746.m31299();
        try {
            AbstractC18422 abstractC18422M41270 = c18107.m41270();
            if (abstractC18422M41270.mo37384()) {
                c13746.add(abstractC18422M41270);
                abstractC18422M41270.mo17070();
            } else {
                if (abstractC18422M41270.m41973() == 0) {
                    throw new RuntimeException("Can not close the FileVisitor which has no parent id.");
                }
                abstractC18422M41270.m41985();
            }
            c18107.m41260(abstractC18422);
            c13746.m31298();
            C8009.m18592();
        } catch (Throwable th) {
            c13746.m31298();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public final void m26068(C18107 c18107) {
        AbstractC18422 abstractC18422;
        C13746 c13746 = this.f31277;
        c13746.m31299();
        try {
            if (c13746.isEmpty()) {
                throw new IllegalStateException("No background visitor.");
            }
            AbstractC18422 abstractC18422M41270 = c18107.m41270();
            if (abstractC18422M41270.m41973() == 0) {
                throw new RuntimeException("Can not close the FileVisitor which has no parent id.");
            }
            int iM41973 = abstractC18422M41270.m41973();
            abstractC18422M41270.m41985();
            if (iM41973 == 0) {
                abstractC18422 = null;
                break;
            }
            Iterator<E> it = c13746.iterator();
            while (true) {
                if (!it.hasNext()) {
                    abstractC18422 = null;
                    break;
                }
                abstractC18422 = (AbstractC18422) it.next();
                if (abstractC18422.m41987() == iM41973) {
                    it.remove();
                    break;
                }
            }
            if (abstractC18422 == null) {
                Iterator<E> it2 = c13746.iterator();
                while (it2.hasNext()) {
                    AbstractC18422 abstractC18423 = (AbstractC18422) it2.next();
                    if (abstractC18423 instanceof C18310) {
                        it2.remove();
                        abstractC18422 = abstractC18423;
                        break;
                    }
                }
            }
            if (abstractC18422 == null) {
                abstractC18422 = (AbstractC18422) c13746.remove(c13746.size() - 1);
            }
            c18107.m41260(abstractC18422);
            abstractC18422.mo8215(c18107);
            c13746.m31298();
            C8009.m18592();
        } catch (Throwable th) {
            c13746.m31298();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۧ */
    public final void m26085(C18107 c18107) {
        AbstractC18422 abstractC18422;
        C13746 c13746 = this.f31277;
        c13746.m31299();
        try {
            if (c13746.isEmpty()) {
                throw new IllegalStateException("No background visitor.");
            }
            AbstractC18422 abstractC18422M41270 = c18107.m41270();
            int iM41973 = abstractC18422M41270.m41973();
            if (iM41973 == 0) {
                abstractC18422 = null;
                break;
            }
            Iterator<E> it = c13746.iterator();
            while (true) {
                if (!it.hasNext()) {
                    abstractC18422 = null;
                    break;
                }
                abstractC18422 = (AbstractC18422) it.next();
                if (abstractC18422.m41987() == iM41973) {
                    it.remove();
                    break;
                }
            }
            if (abstractC18422 == null) {
                Iterator<E> it2 = c13746.iterator();
                while (it2.hasNext()) {
                    AbstractC18422 abstractC18423 = (AbstractC18422) it2.next();
                    if (abstractC18423 instanceof C18310) {
                        it2.remove();
                        abstractC18422 = abstractC18423;
                        break;
                    }
                }
            }
            if (abstractC18422 == null) {
                abstractC18422 = (AbstractC18422) c13746.remove(c13746.size() - 1);
            }
            c13746.add(abstractC18422M41270);
            c18107.m41260(abstractC18422);
            abstractC18422M41270.mo17070();
            abstractC18422.mo8215(c18107);
            c13746.m31298();
            C8009.m18592();
        } catch (Throwable th) {
            c13746.m31298();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26069(C18107 c18107, int i, boolean z) {
        C13746 c13746 = this.f31277;
        c13746.m31299();
        try {
            boolean zM26049 = m26049(c18107, i, z);
            c13746.m31298();
            if (zM26049) {
                C8009.m18592();
            }
        } catch (Throwable th) {
            c13746.m31298();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m26094(int i) {
        C18107 c18107M26079 = m26079();
        C13746 c13746 = this.f31277;
        c13746.m31299();
        try {
            boolean zM26049 = m26049(c18107M26079, m26054(i), true);
            c13746.m31298();
            if (zM26049) {
                C8009.m18592();
            }
            return zM26049;
        } catch (Throwable th) {
            c13746.m31298();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m26075(int i) {
        C13746 c13746 = this.f31277;
        c13746.m31299();
        try {
            return m26059(m26054(i));
        } finally {
            c13746.m31298();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۧ */
    public final boolean m26088(int i) {
        C13746 c13746 = this.f31277;
        c13746.m31299();
        try {
            int iM26054 = m26054(i);
            boolean z = false;
            if (iM26054 >= 0 && iM26054 < c13746.size() && ((AbstractC18422) c13746.get(iM26054)).m41973() != 0) {
                z = true;
            }
            return z;
        } finally {
            c13746.m31298();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private int m26054(int i) {
        C13746 c13746 = this.f31277;
        int size = c13746.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((AbstractC18422) c13746.get(i2)).m41987() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۧ */
    private boolean m26049(C18107 c18107, int i, boolean z) {
        if (i < 0) {
            return false;
        }
        C13746 c13746 = this.f31277;
        if (i >= c13746.size()) {
            return false;
        }
        AbstractC18422 abstractC18422M41270 = c18107.m41270();
        AbstractC18422 abstractC18422 = (AbstractC18422) c13746.remove(i);
        if (abstractC18422M41270.mo37384()) {
            c13746.add(abstractC18422M41270);
            abstractC18422M41270.mo17070();
        } else {
            if (abstractC18422M41270.m41973() == 0) {
                throw new RuntimeException("Can not close the FileVisitor which has no parent id.");
            }
            abstractC18422M41270.m41985();
        }
        if (z) {
            c18107.m41260(abstractC18422);
        } else {
            c18107.m41273(abstractC18422);
        }
        abstractC18422.mo8215(c18107);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩳ */
    private boolean m26059(int i) {
        if (i < 0) {
            return false;
        }
        C13746 c13746 = this.f31277;
        if (i >= c13746.size()) {
            return false;
        }
        AbstractC18422 abstractC18422 = (AbstractC18422) c13746.remove(i);
        if (abstractC18422.m41973() == 0) {
            throw new RuntimeException("Can not close the FileVisitor which has no parent id.");
        }
        abstractC18422.m41985();
        return true;
    }

    /* JADX INFO: renamed from: ۠ */
    public final void m26080() {
        C18107 c18107 = this.f31287;
        if (c18107.m41266()) {
            return;
        }
        C18107 c18108 = this.f31295;
        if (c18108.m41266()) {
            return;
        }
        m26056(false);
        C19449 c19449M41245 = c18107.m41245();
        c18107.m41234(c18108.m41245());
        c18108.m41234(c19449M41245);
        if (!c18107.m41265()) {
            m26073(true, false);
        } else {
            m26087(true, false);
        }
        if (!c18108.m41265()) {
            m26073(false, false);
        } else {
            m26087(false, false);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m26052(C11245 c11245) {
        if (c11245.f31297.m24763()) {
            return;
        }
        C18107 c18107M26079 = c11245.m26079();
        if (c11245.f31301.m47727()) {
            int iM47731 = c11245.f31301.m47731();
            if (iM47731 == 0) {
                c18107M26079.m41257();
                return;
            }
            if (iM47731 == 1) {
                c18107M26079.m41286();
                return;
            }
            if (iM47731 == 2) {
                if (c18107M26079.m41270().mo17066()) {
                    new ViewOnClickListenerC10495(c18107M26079).m24241();
                    return;
                } else {
                    if (c18107M26079.m41265()) {
                        return;
                    }
                    c18107M26079.f54069.m39706();
                    return;
                }
            }
            if (iM47731 != 3) {
                if (iM47731 != 4) {
                    return;
                }
                c11245.f31306.getOnBackPressedDispatcher().m30941();
                return;
            } else {
                if (c18107M26079.m41270().mo8212()) {
                    c18107M26079.m41270().mo8203(c18107M26079, c18107M26079.m41252());
                    return;
                }
                return;
            }
        }
        if (c11245.f31301.m47733()) {
            int iM47732 = c11245.f31301.m47731();
            if (iM47732 == 0) {
                int i = ApplicationC21448.f67649.getInt("swipe_select_count", 0);
                if (i < 3) {
                    ApplicationC21448.f67649.edit().mo27875(i + 1, "swipe_select_count").apply();
                }
                c18107M26079.m41292();
                return;
            }
            if (iM47732 == 1) {
                c18107M26079.m41287();
                return;
            }
            if (iM47732 == 2) {
                c18107M26079.m41267();
            } else if (iM47732 == 3) {
                c18107M26079.m41255();
            } else {
                if (iM47732 != 4) {
                    return;
                }
                c11245.f31306.m12253(R.string.MT_Protector, R.string.MT_Protector, false);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m26039(C11245 c11245) {
        int iM47731 = c11245.f31301.m47731();
        if (!c11245.f31301.m47727()) {
            if (c11245.f31301.m47733()) {
                if (iM47731 == 3) {
                    c11245.m26079().m41249();
                    return;
                } else {
                    c11245.f31301.m47729(iM47731, new int[]{R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector}[iM47731]);
                    return;
                }
            }
            return;
        }
        if (iM47731 == 0) {
            c11245.f31301.m47729(0, R.string.MT_Protector);
            return;
        }
        if (iM47731 == 1) {
            c11245.f31301.m47729(1, R.string.MT_Protector);
            return;
        }
        if (iM47731 == 2) {
            c11245.f31301.m47729(2, c11245.m26079().m41270().mo17066() ? R.string.MT_Protector : R.string.MT_Protector);
            return;
        }
        if (iM47731 == 3) {
            c11245.f31301.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
            c11245.m26093(false);
        } else {
            if (iM47731 != 4) {
                return;
            }
            new C2447(c11245.m26079()).m3439();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m26074() {
        if (!this.f31299.m37272()) {
            C7654 c7654 = this.f31291;
            if (c7654 != null && c7654.m17720()) {
                return true;
            }
            this.f31299.m37269();
            return true;
        }
        return m26079().m41238();
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m26095() {
        this.f31299.m37269();
    }

    /* JADX INFO: renamed from: ᩸ */
    public final void m26101() {
        C18107 c18107M26079 = m26079();
        if (c18107M26079.f54069.m39714()) {
            this.f31301.m47723();
            return;
        }
        AbstractC11044 abstractC11044M47714 = this.f31301.m47714(0);
        abstractC11044M47714.getClass();
        ((C17748) abstractC11044M47714).m40332(c18107M26079.m41274());
        AbstractC11044 abstractC11044M47715 = this.f31301.m47714(1);
        abstractC11044M47715.getClass();
        ((C17748) abstractC11044M47715).m40332(c18107M26079.m41280());
        AbstractC11044 abstractC11044M47716 = this.f31301.m47714(2);
        abstractC11044M47716.getClass();
        ((C6350) abstractC11044M47716).m14511(!c18107M26079.m41265() || c18107M26079.m41270().mo17066());
        AbstractC11044 abstractC11044M47717 = this.f31301.m47714(3);
        abstractC11044M47717.getClass();
        ((C17748) abstractC11044M47717).m40332(c18107M26079.m41270().mo8212());
        this.f31301.m47732();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m26086(boolean z) {
        if (this.f31281 == z) {
            return;
        }
        m26056(false);
        this.f31281 = z;
        this.f31288.m52152(1.0f);
        this.f31298.m52152(1.0f);
        this.f31283.setAlpha(1.0f);
        this.f31292.setAlpha(1.0f);
        this.f31288.setVisibility(z ? 0 : 8);
        this.f31298.setVisibility(z ? 8 : 0);
        this.f31278.m45562(z);
        this.f31287.m41237(z);
        this.f31295.m41237(!z);
        m26101();
        m26102();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26072(boolean z, float f) {
        if (this.f31281 == z) {
            return;
        }
        if (f == 0.0f) {
            this.f31288.setVisibility(!z ? 0 : 8);
            this.f31298.setVisibility(z ? 0 : 8);
            this.f31288.m52152(1.0f);
            this.f31298.m52152(1.0f);
            this.f31283.setAlpha(1.0f);
            this.f31292.setAlpha(1.0f);
            return;
        }
        (z ? this.f31292 : this.f31283).setAlpha(1.0f - (0.5f * f));
        if (z) {
            this.f31288.m52152(f);
            this.f31298.m52152(1.0f - f);
        } else {
            this.f31288.m52152(1.0f - f);
            this.f31298.m52152(f);
        }
        if (this.f31288.getVisibility() != 0) {
            this.f31288.setVisibility(0);
        }
        if (this.f31298.getVisibility() != 0) {
            this.f31298.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: ᩵ */
    public final boolean m26098() {
        return this.f31281;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26071(C24790 c24790) {
        this.f31286 = c24790;
        c24790.m54458(new C24655(this));
        m26102();
    }

    /* JADX INFO: renamed from: ᩴ */
    public final void m26097() {
        C24790 c24790 = this.f31286;
        if (c24790 != null) {
            c24790.m54465();
        }
    }

    /* JADX INFO: renamed from: ᩹ */
    public final void m26102() {
        if (this.f31286 == null) {
            return;
        }
        C11403 c11403 = m26079().f54070;
        if (c11403.m26377()) {
            this.f31286.m54461(false);
            this.f31286.m54457(c11403.m26376());
        } else {
            this.f31286.m54465();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m26093(boolean z) {
        if (this.f31286 == null) {
            return;
        }
        if (z) {
            C7129.m16404();
        }
        this.f31286.m54461(true);
        C11403 c11403 = m26079().f54070;
        if (c11403.m26377()) {
            return;
        }
        this.f31286.m54457((String) null);
        c11403.m26375(true);
    }

    /* JADX INFO: renamed from: ᩶ */
    public final void m26099() {
        this.f31287.f54068.m31987();
        this.f31295.f54068.m31987();
    }

    /* JADX INFO: renamed from: ۜ */
    public final C18107 m26079() {
        return this.f31281 ? this.f31287 : this.f31295;
    }

    /* JADX INFO: renamed from: ܶ */
    public final void m26090() {
        m26086(!this.f31281);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final C18107 m26100() {
        return this.f31287;
    }

    /* JADX INFO: renamed from: ۡ */
    public final C18107 m26081() {
        return this.f31295;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m26084(String str) {
        this.f31306.setTitle(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26065(CharSequence charSequence) {
        this.f31306.m12276().setSubtitle(charSequence);
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m26076() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f31306.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f31306.getWindow().getDecorView().getWindowToken(), 0);
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public final Main m26082() {
        return this.f31306;
    }

    /* JADX INFO: renamed from: ֫ */
    public final ViewGroup m26063(boolean z) {
        return z ? this.f31307 : this.f31304;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26066(Runnable runnable) {
        this.f31280.add(runnable);
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
    /* JADX INFO: renamed from: ֨ */
    public void m26062() throws Throwable {
        int i;
        boolean z;
        int iM55979;
        AbstractC18422 abstractC18422;
        int i2;
        int i3;
        int i4;
        int i5;
        int iM559710;
        String str;
        AbstractC18422 abstractC18423;
        InterfaceC14100 interfaceC14100;
        short[] sArr;
        boolean z2;
        int i6;
        int iM559711;
        int i7;
        int i8;
        String strM56318;
        int i9;
        int i10;
        int iM55680;
        int i11;
        int i12;
        int i13;
        int iM559712;
        int i14;
        C11245 c11245 = this;
        int i15 = 0;
        int i16 = 945577175;
        int i17 = C0992.f81922;
        int i18 = RunnableC1014.f81941;
        int iM55681 = C0873.m55680("ۙۖ") ^ i18;
        int i19 = ((iM55681 ^ i17) * (-23423)) ^ (-1784038781);
        int i20 = iM55681 ^ 1552979298;
        PrintStream printStream = null;
        ArrayList arrayList = null;
        Throwable th = null;
        AbstractC18422 abstractC18424 = null;
        Object it = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        boolean zM55886 = false;
        boolean zMo8213 = false;
        boolean zMo8214 = false;
        boolean zMo8215 = false;
        boolean z3 = false;
        InterfaceC14100 interfaceC14101 = null;
        boolean zMo8208 = false;
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
        C13746 c13746 = null;
        Iterator it2 = null;
        final AbstractC18422 abstractC18425 = null;
        int i25 = 0;
        boolean zM55887 = false;
        C18107 c18107 = null;
        C18107 c18108 = null;
        while (true) {
            boolean z7 = false;
            while (true) {
                i16 = i20 ^ (i19 & (((i16 ^ i17) * (-20445)) >> 31));
                switch (i16) {
                    case -2123056728:
                    case -1162132828:
                        zMo8213 = C0947.m56000(c18107).mo8213();
                        iM559712 = (C0873.m55680("ۡۗ") + i17) * 23;
                        i10 = ((iM559712 ^ i18) * (-8469)) ^ (-867856070);
                        i14 = 93670584;
                        i20 = iM559712 ^ i14;
                        i19 = i10;
                        break;
                    case -2101590574:
                    case 1126911275:
                        if (z4) {
                            iM559712 = (C0873.m55680("᩷ܺ") ^ i18) * 9;
                            i10 = ((iM559712 ^ i17) * 20763) ^ 398848601;
                            i14 = -37497803;
                        } else {
                            iM559712 = C0946.m55979("᩷᩻") ^ i17;
                            i10 = ((iM559712 ^ i18) * (-11539)) ^ 766222383;
                            i14 = -144317736;
                        }
                        i20 = iM559712 ^ i14;
                        i19 = i10;
                        break;
                    case -2006177301:
                    case 1936264226:
                        boolean z8 = c11245.f31281;
                        int iM55682 = (C0873.m55680("᩹ۧ") + i18) * (-71);
                        z3 = z8;
                        i19 = ((iM55682 ^ i17) * 3997) ^ (-778261793);
                        i20 = iM55682 ^ 397330393;
                        break;
                    case -1992932804:
                    case -1504711084:
                        if (zMo8208) {
                            iM559712 = (C0946.m55979("᩶᩵") + i18) * (-37);
                            i10 = ((iM559712 ^ i17) * 16453) ^ 120686476;
                            i14 = -1886740021;
                        } else {
                            iM559712 = (C0946.m55979("᩻۟") + i17) * 11;
                            i10 = ((iM559712 ^ i18) * (-21515)) ^ (-1930878057);
                            i14 = 1933351249;
                        }
                        i20 = iM559712 ^ i14;
                        i19 = i10;
                        break;
                    case -1977546820:
                    case 498344538:
                        i13 = i25 + 1;
                        int iM559713 = (C0946.m55979("᩷۬") ^ i17) * 89;
                        int i26 = i13;
                        i19 = ((iM559713 ^ i18) * (-5897)) ^ 662569506;
                        i20 = iM559713 ^ 1551940679;
                        abstractC18425 = abstractC18425;
                        i23 = i23;
                        i15 = i15;
                        i25 = i26;
                        break;
                    case -1933458757:
                    case -1861471081:
                        interfaceC14100 = interfaceC14101;
                        i = i23;
                        abstractC18423 = abstractC18425;
                        z2 = z7;
                        sArr = sArr3;
                        i6 = i24;
                        strM56318 = C1048.m56318(sArr, i6, 15, i);
                        if (C1194.f82045 == 0) {
                            int iM55683 = C0873.m55680("ۗ۠") ^ i17;
                            i19 = ((iM55683 ^ i18) * (-14779)) ^ 1315114758;
                            i20 = iM55683 ^ (-872669210);
                            sArr3 = sArr;
                            i24 = i6;
                            z7 = z2;
                            interfaceC14101 = interfaceC14100;
                            abstractC18425 = abstractC18423;
                            str2 = strM56318;
                            i23 = i;
                        } else {
                            int iM55684 = C0873.m55680("ۗۜ") ^ i18;
                            String str3 = strM56318;
                            i19 = ((iM55684 ^ i17) * 21747) ^ (-912800304);
                            sArr3 = sArr;
                            i24 = i6;
                            z7 = z2;
                            interfaceC14101 = interfaceC14100;
                            abstractC18425 = abstractC18423;
                            str2 = str3;
                            i20 = iM55684 ^ (-946604422);
                            i23 = i;
                            c11245 = this;
                        }
                        break;
                    case -1929743797:
                    case 807891432:
                        C8009.m18592();
                        iM559712 = C0946.m55979("᩷᩻") ^ i17;
                        i10 = ((iM559712 ^ i18) * (-11539)) ^ 766222383;
                        i14 = -144317736;
                        i20 = iM559712 ^ i14;
                        i19 = i10;
                        break;
                    case -1875985516:
                    case 1087285577:
                        if (C1404.f82149 < 0) {
                            str = str2;
                            i = i23;
                            abstractC18423 = abstractC18425;
                            interfaceC14100 = interfaceC14101;
                            sArr = sArr3;
                            z2 = z7;
                            i6 = i24;
                            iM559711 = C0946.m55979("ᩳ᩹") ^ i18;
                            i7 = ((iM559711 ^ i17) * 13087) ^ 816534242;
                            i8 = -1553660065;
                            i20 = iM559711 ^ i8;
                            i19 = i7;
                            sArr3 = sArr;
                            i24 = i6;
                            z7 = z2;
                            interfaceC14101 = interfaceC14100;
                            abstractC18425 = abstractC18423;
                            str2 = str;
                            c11245 = this;
                            i23 = i;
                        } else {
                            iM559712 = C0946.m55979("֡ۛ") ^ i17;
                            i10 = ((iM559712 ^ i18) * 5003) ^ (-1700271695);
                            i14 = -246717893;
                            i20 = iM559712 ^ i14;
                            i19 = i10;
                        }
                        break;
                    case -1808651190:
                    case -1501961934:
                        C0882.m55710();
                        C0992.m56107();
                        return;
                    case -1803120965:
                    case 1901785275:
                        C1036.m56259(new RunnableC17202(0));
                        return;
                    case -1746700980:
                    case -1727833402:
                        C1194.m56396();
                        if (C0890.f81849 != 0) {
                            iM559712 = C0946.m55979("֡ۛ") ^ i17;
                            i10 = ((iM559712 ^ i18) * 5003) ^ (-1700271695);
                            i14 = -246717893;
                            i20 = iM559712 ^ i14;
                            i19 = i10;
                        } else {
                            strM56318 = str2;
                            i = i23;
                            abstractC18423 = abstractC18425;
                            interfaceC14100 = interfaceC14101;
                            sArr = sArr3;
                            z2 = z7;
                            i6 = i24;
                            int iM55685 = C0873.m55680("ۗۜ") ^ i18;
                            String str4 = strM56318;
                            i19 = ((iM55685 ^ i17) * 21747) ^ (-912800304);
                            sArr3 = sArr;
                            i24 = i6;
                            z7 = z2;
                            interfaceC14101 = interfaceC14100;
                            abstractC18425 = abstractC18423;
                            str2 = str4;
                            i20 = iM55685 ^ (-946604422);
                            i23 = i;
                            c11245 = this;
                        }
                        break;
                    case -1734177569:
                    case 738878140:
                        C0882.m55724((Runnable) C1017.m56196(arrayList, i25));
                        if (C0917.f81868) {
                            iM559712 = C0946.m55979("ۘ᩸") ^ i17;
                            i10 = ((iM559712 ^ i18) * (-30917)) ^ 1098826130;
                            i14 = 2106580164;
                        } else {
                            iM559712 = (C0873.m55680("ܽ᩺") ^ i17) * (-57);
                            i10 = ((iM559712 ^ i18) * 32049) ^ 1085132944;
                            i14 = 179927201;
                        }
                        i20 = iM559712 ^ i14;
                        i19 = i10;
                        break;
                    case -1733646711:
                    case -1613596715:
                        z5 = false;
                        iM559712 = C0946.m55979("ܿۚ") ^ i18;
                        i10 = ((iM559712 ^ i17) * (-67)) ^ 1318116322;
                        i14 = 1132807204;
                        i20 = iM559712 ^ i14;
                        i19 = i10;
                        break;
                    case -1718608136:
                    case 1734138696:
                        c18108.m41262();
                        c18107.m41262();
                        iM559712 = C0873.m55680("ۢᩴ") ^ i17;
                        i10 = ((iM559712 ^ i18) * 28497) ^ (-473638564);
                        i14 = -437279795;
                        i20 = iM559712 ^ i14;
                        i19 = i10;
                        break;
                    case -1626233928:
                    case 354028171:
                        c11245.m26068(c18107);
                        iM559712 = (i17 - C0946.m55979("ۛ֡")) * (-65);
                        i10 = ((iM559712 ^ i18) * (-4541)) ^ 179699789;
                        i14 = 848952127;
                        i20 = iM559712 ^ i14;
                        i19 = i10;
                        break;
                    case -1621641392:
                    case -1492977188:
                        AbstractC18422 abstractC18426 = (AbstractC18422) C0955.m56035(it2);
                        try {
                            zMo8214 = abstractC18426.mo8213();
                            int iM559714 = (i18 - C0946.m55979("֫ܶ")) * 109;
                            i20 = iM559714 ^ 1351064598;
                            i19 = ((iM559714 ^ i17) * (-2513)) ^ 1424271908;
                            abstractC18424 = abstractC18426;
                        } catch (Throwable th2) {
                            th = th2;
                            abstractC18424 = abstractC18426;
                            iM559712 = C0946.m55979("ۡܳ") ^ i17;
                            i10 = ((iM559712 ^ i18) * 27809) ^ 1362497367;
                            i14 = -855319843;
                            i20 = iM559712 ^ i14;
                            i19 = i10;
                        }
                        break;
                    case -1596175611:
                    case 639445902:
                        if (C0992.f81922 < 0) {
                            iM559712 = C0946.m55979("֡ۛ") ^ i17;
                            i10 = ((iM559712 ^ i18) * 5003) ^ (-1700271695);
                            i14 = -246717893;
                        } else {
                            iM559712 = C0946.m55979("ۖ᩹") ^ i18;
                            i10 = ((iM559712 ^ i17) * (-15995)) ^ (-2098415456);
                            i14 = -899812239;
                        }
                        i20 = iM559712 ^ i14;
                        i19 = i10;
                        break;
                    case -1574802101:
                    case 233791095:
                        it2 = c13746.iterator();
                        iM559712 = C0873.m55680("ܺ֡") ^ i18;
                        i10 = ((iM559712 ^ i17) * 31487) ^ 229727678;
                        i14 = 1345698137;
                        i20 = iM559712 ^ i14;
                        i19 = i10;
                        break;
                    case -1553061562:
                    case 1915651475:
                        i = i23;
                        abstractC18422 = abstractC18425;
                        c13746 = c11245.f31277;
                        if (c13746.m31297()) {
                            iM55979 = (i17 - C0946.m55979("ܿ᩶")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i2 = ((iM55979 ^ i18) * (-15329)) ^ 925147014;
                            i3 = 2043084972;
                        } else {
                            iM55979 = C0873.m55680("ܰۜ") ^ i18;
                            i2 = ((iM55979 ^ i17) * 12885) ^ (-177675649);
                            i3 = 772951039;
                        }
                        i20 = iM55979 ^ i3;
                        i19 = i2;
                        abstractC18425 = abstractC18422;
                        i23 = i;
                        break;
                    case -1528485805:
                    case -1030978412:
                        C1024.m56209();
                        if (C1017.f81942 < 0) {
                            i = i23;
                            z = z7;
                            iM559710 = (C0946.m55979("ۧ᩷") ^ i17) * (-37);
                            i5 = ((iM559710 ^ i18) * (-29403)) ^ 1712710023;
                            i4 = 261520013;
                            i20 = iM559710 ^ i4;
                            abstractC18425 = abstractC18425;
                            str2 = str2;
                            i23 = i;
                            boolean z9 = z;
                            interfaceC14101 = interfaceC14101;
                            i19 = i5;
                            z7 = z9;
                        } else {
                            i = i23;
                            abstractC18422 = abstractC18425;
                            iM55979 = C0946.m55979("۫֫") ^ i18;
                            i2 = ((iM55979 ^ i17) * (-10235)) ^ 1801917178;
                            i3 = -1053402488;
                            i20 = iM55979 ^ i3;
                            i19 = i2;
                            abstractC18425 = abstractC18422;
                            i23 = i;
                        }
                        break;
                    case -1472263667:
                    case -135935221:
                        C1071.m56343();
                        if (C0949.f81897 < 0) {
                            str = str2;
                            i = i23;
                            abstractC18423 = abstractC18425;
                            interfaceC14100 = interfaceC14101;
                            sArr = sArr3;
                            z2 = z7;
                            i6 = i24;
                            iM559711 = (i17 - C0946.m55979("᩸ᩳ")) * 27;
                            i7 = ((iM559711 ^ i18) * (-9973)) ^ (-1803003678);
                            i8 = 1769044487;
                            i20 = iM559711 ^ i8;
                            i19 = i7;
                            sArr3 = sArr;
                            i24 = i6;
                            z7 = z2;
                            interfaceC14101 = interfaceC14100;
                            abstractC18425 = abstractC18423;
                            str2 = str;
                            c11245 = this;
                            i23 = i;
                        } else {
                            iM559712 = C0946.m55979("ۖ᩹") ^ i18;
                            i10 = ((iM559712 ^ i17) * (-15995)) ^ (-2098415456);
                            i14 = -899812239;
                            i20 = iM559712 ^ i14;
                            i19 = i10;
                        }
                        break;
                    case -1438664395:
                    case 1329928668:
                        str = str2;
                        i = i23;
                        abstractC18423 = abstractC18425;
                        interfaceC14100 = interfaceC14101;
                        sArr = sArr3;
                        z2 = z7;
                        i6 = i24;
                        i22 = i21 + 1;
                        s2 = 1;
                        if (C1003.f81929 <= 0) {
                            iM559711 = C0946.m55979("ᩳ᩹") ^ i18;
                            i7 = ((iM559711 ^ i17) * 13087) ^ 816534242;
                            i8 = -1553660065;
                        } else {
                            iM559711 = C0873.m55680("ܳۢ") ^ i17;
                            i7 = ((iM559711 ^ i18) * 8555) ^ 1728729686;
                            i8 = 181783464;
                        }
                        i20 = iM559711 ^ i8;
                        i19 = i7;
                        sArr3 = sArr;
                        i24 = i6;
                        z7 = z2;
                        interfaceC14101 = interfaceC14100;
                        abstractC18425 = abstractC18423;
                        str2 = str;
                        c11245 = this;
                        i23 = i;
                        break;
                    case -1426646470:
                    case -1103723894:
                        z6 = true;
                        iM559712 = C0946.m55979("ۡܰ") ^ i18;
                        i10 = ((iM559712 ^ i17) * (-19895)) ^ 1545435242;
                        i14 = -1815215058;
                        i20 = iM559712 ^ i14;
                        i19 = i10;
                        break;
                    case -1414538942:
                    case -1051347078:
                        if (z3) {
                            iM559712 = (C0946.m55979("᩺ۤ") ^ i18) * 39;
                            i10 = ((iM559712 ^ i17) * 23763) ^ 707600920;
                            i14 = -1021851464;
                        } else {
                            iM559712 = C0946.m55979("֨᩺") ^ i17;
                            i10 = ((iM559712 ^ i18) * 30991) ^ 278472657;
                            i14 = 1949392602;
                        }
                        i20 = iM559712 ^ i14;
                        i19 = i10;
                        break;
                    case -1414015041:
                    case 1831952169:
                        C1044.m56286();
                        if (C1012.f81938 >= 0) {
                            iM559712 = (i17 - C0873.m55680("ܽᩳ")) * (-107);
                            i10 = ((iM559712 ^ i18) * (-29457)) ^ (-1174813941);
                            i14 = 973555054;
                            i20 = iM559712 ^ i14;
                            i19 = i10;
                        } else {
                            strM56318 = str2;
                            i = i23;
                            abstractC18423 = abstractC18425;
                            interfaceC14100 = interfaceC14101;
                            sArr = sArr3;
                            z2 = z7;
                            i6 = i24;
                            int iM55686 = C0873.m55680("ۗۜ") ^ i18;
                            String str5 = strM56318;
                            i19 = ((iM55686 ^ i17) * 21747) ^ (-912800304);
                            sArr3 = sArr;
                            i24 = i6;
                            z7 = z2;
                            interfaceC14101 = interfaceC14100;
                            abstractC18425 = abstractC18423;
                            str2 = str5;
                            i20 = iM55686 ^ (-946604422);
                            i23 = i;
                            c11245 = this;
                        }
                        break;
                    case -1297615419:
                    case 1543661106:
                        if (zMo8213) {
                            z5 = z6;
                            iM559712 = C0946.m55979("ܿۚ") ^ i18;
                            i10 = ((iM559712 ^ i17) * (-67)) ^ 1318116322;
                            i14 = 1132807204;
                        } else {
                            iM559712 = (C0946.m55979("۟۠") + i17) * 45;
                            i10 = ((iM559712 ^ i18) * 29929) ^ 681516963;
                            i14 = 1520059909;
                        }
                        i20 = iM559712 ^ i14;
                        i19 = i10;
                        break;
                    case -1196112102:
                    case 44067578:
                        AbstractC18422 abstractC18427 = (AbstractC18422) C0955.m56035(it);
                        try {
                            zMo8208 = abstractC18427.mo8208();
                            int iM559715 = (C0946.m55979("ۗ᩶") ^ i17) * (-89);
                            i20 = iM559715 ^ (-338379403);
                            i19 = ((iM559715 ^ i18) * (-27927)) ^ 333575660;
                            abstractC18425 = abstractC18427;
                        } catch (Throwable th3) {
                            th = th3;
                            abstractC18425 = abstractC18427;
                            iM559712 = C0946.m55979("ۡܳ") ^ i17;
                            i10 = ((iM559712 ^ i18) * 27809) ^ 1362497367;
                            i14 = -855319843;
                            i20 = iM559712 ^ i14;
                            i19 = i10;
                        }
                        break;
                    case -1063223222:
                    case -650923399:
                        return;
                    case -1055873254:
                    case -265272152:
                        arrayList = c11245.f31280;
                        if (i25 < C1012.m56137(arrayList)) {
                            iM559712 = (C0946.m55979("ܺ۬") ^ i18) * (-109);
                            i10 = ((iM559712 ^ i17) * 5025) ^ 1743771902;
                            i14 = 1665264177;
                        } else {
                            iM559712 = (C0946.m55979("᩶ۖ") + i18) * (-9);
                            i10 = ((iM559712 ^ i17) * 14343) ^ 1198349591;
                            i14 = 1809662578;
                        }
                        i20 = iM559712 ^ i14;
                        i19 = i10;
                        break;
                    case -1029404568:
                    case 1034043429:
                        C17994 c17994 = C19336.f57728;
                        c18107.m41228((List) c17994);
                        c18108.m41228((List) c17994);
                        return;
                    case -998754636:
                    case 27365980:
                        i = i23;
                        abstractC18422 = abstractC18425;
                        C1025.m56229(c18107, "");
                        RunnableC0871.m55675(c18108, "");
                        if (C1404.f82149 >= 0) {
                            iM55979 = C0946.m55979("۫֫") ^ i18;
                            i2 = ((iM55979 ^ i17) * (-10235)) ^ 1801917178;
                            i3 = -1053402488;
                        } else {
                            iM55979 = C0946.m55979("ۜᩳ") ^ i17;
                            i2 = ((iM55979 ^ i18) * 30857) ^ 1942983383;
                            i3 = 788917903;
                        }
                        i20 = iM55979 ^ i3;
                        i19 = i2;
                        abstractC18425 = abstractC18422;
                        i23 = i;
                        break;
                    case -979297189:
                    case 1882453426:
                        if (zM55886) {
                            iM559712 = (C0946.m55979("۠᩷") + i18) * 115;
                            i10 = ((iM559712 ^ i17) * (-10777)) ^ (-1432116888);
                            i14 = 1541733456;
                        } else {
                            iM559712 = C0873.m55680("۫ᩴ") ^ i18;
                            i10 = ((iM559712 ^ i17) * (-17063)) ^ (-842445416);
                            i14 = -526482196;
                        }
                        i20 = iM559712 ^ i14;
                        i19 = i10;
                        break;
                    case -967656067:
                    case 643648767:
                        break;
                    case -806572615:
                    case 560840532:
                        if (zMo8215) {
                            z4 = z5;
                            iM559712 = C0873.m55680("ܰᩴ") ^ i17;
                            i10 = ((iM559712 ^ i18) * 1431) ^ (-1067768970);
                            i14 = -1631028074;
                        } else {
                            iM559712 = (C0873.m55680("֨ܺ") + i18) * 17;
                            i10 = ((iM559712 ^ i17) * (-18585)) ^ 1304316045;
                            i14 = -585919283;
                        }
                        i20 = iM559712 ^ i14;
                        i19 = i10;
                        break;
                    case -656517748:
                    case 139380207:
                        it = c13746.iterator();
                        iM559712 = (C0946.m55979("᩻۟") + i17) * 11;
                        i10 = ((iM559712 ^ i18) * (-21515)) ^ (-1930878057);
                        i14 = 1933351249;
                        i20 = iM559712 ^ i14;
                        i19 = i10;
                        break;
                    case -645220902:
                    case -187178707:
                        z4 = false;
                        iM559712 = C0873.m55680("ܰᩴ") ^ i17;
                        i10 = ((iM559712 ^ i18) * 1431) ^ (-1067768970);
                        i14 = -1631028074;
                        i20 = iM559712 ^ i14;
                        i19 = i10;
                        break;
                    case -609736026:
                    case 449258956:
                        RunnableC0938.m55927(c13746);
                        c11245.f31296 = z7;
                        return;
                    case -599017673:
                    case -506511726:
                        str = str2;
                        i = i23;
                        abstractC18423 = abstractC18425;
                        interfaceC14100 = interfaceC14101;
                        sArr = sArr3;
                        z2 = z7;
                        i6 = i24;
                        if (c11245.f31296) {
                            iM559711 = (C0873.m55680("ܶۚ") ^ i18) * (-43);
                            i7 = ((iM559711 ^ i17) * 13699) ^ 1819111380;
                            i8 = 1292510583;
                        } else {
                            iM559711 = C0946.m55979("ۚ۟") ^ i18;
                            i7 = ((iM559711 ^ i17) * (-14615)) ^ (-1996428467);
                            i8 = 269399011;
                        }
                        i20 = iM559711 ^ i8;
                        i19 = i7;
                        sArr3 = sArr;
                        i24 = i6;
                        z7 = z2;
                        interfaceC14101 = interfaceC14100;
                        abstractC18425 = abstractC18423;
                        str2 = str;
                        c11245 = this;
                        i23 = i;
                        break;
                    case -583388566:
                    case 886026027:
                        abstractC18424.m41985();
                        it2.remove();
                        iM559712 = C0873.m55680("ᩴܺ") ^ i17;
                        i10 = ((iM559712 ^ i18) * (-24709)) ^ (-93696439);
                        i14 = 1402220604;
                        i20 = iM559712 ^ i14;
                        i19 = i10;
                        break;
                    case -533975924:
                    case 443211998:
                        if (zMo8214) {
                            iM559712 = C0946.m55979("ۡܰ") ^ i18;
                            i10 = ((iM559712 ^ i17) * (-19895)) ^ 1545435242;
                            i14 = -1815215058;
                        } else {
                            iM559712 = (C0946.m55979("۠۟") + i17) * (-57);
                            i10 = ((iM559712 ^ i18) * (-13333)) ^ 1343601293;
                            i14 = -873627741;
                        }
                        i20 = iM559712 ^ i14;
                        i19 = i10;
                        break;
                    case -533899644:
                    case 1341678590:
                        i = i23;
                        abstractC18422 = abstractC18425;
                        if (C1044.m56281(c11245.f31282)) {
                            iM55979 = (C0873.m55680("۠ۨ") ^ i18) * 37;
                            i2 = ((iM55979 ^ i17) * 5911) ^ 1767849977;
                            i3 = 1850498610;
                        } else {
                            iM55979 = C0873.m55680("֫ܺ") ^ i18;
                            i2 = ((iM55979 ^ i17) * (-18011)) ^ 798145650;
                            i3 = 661579235;
                        }
                        i20 = iM55979 ^ i3;
                        i19 = i2;
                        abstractC18425 = abstractC18422;
                        i23 = i;
                        break;
                    case -470311865:
                    case -411786153:
                        str = str2;
                        i = i23;
                        abstractC18423 = abstractC18425;
                        interfaceC14100 = interfaceC14101;
                        sArr = sArr3;
                        z2 = z7;
                        i6 = i24;
                        int i27 = s + s2;
                        if (i22 - (i27 * i27) > 0) {
                            iM559711 = C0873.m55680("᩶ᩴ") ^ i17;
                            i7 = ((iM559711 ^ i18) * (-12515)) ^ 1422711126;
                            i8 = -18842187;
                        } else {
                            iM559711 = C0946.m55979("֡ᩴ") ^ i18;
                            i7 = ((iM559711 ^ i17) * 21037) ^ (-1067157575);
                            i8 = 1030730954;
                        }
                        i20 = iM559711 ^ i8;
                        i19 = i7;
                        sArr3 = sArr;
                        i24 = i6;
                        z7 = z2;
                        interfaceC14101 = interfaceC14100;
                        abstractC18425 = abstractC18423;
                        str2 = str;
                        c11245 = this;
                        i23 = i;
                        break;
                    case -444796231:
                    case 1670895411:
                        c13746.m31299();
                        iM559712 = (i17 - C0873.m55680("ۜۡ")) * (-89);
                        i10 = ((iM559712 ^ i18) * 6283) ^ (-958407652);
                        i14 = 1858863802;
                        i20 = iM559712 ^ i14;
                        i19 = i10;
                        break;
                    case -290547006:
                    case 699642793:
                        c18107.m41262();
                        c18108.m41262();
                        iM559712 = C0873.m55680("ۢᩴ") ^ i17;
                        i10 = ((iM559712 ^ i18) * 28497) ^ (-473638564);
                        i14 = -437279795;
                        i20 = iM559712 ^ i14;
                        i19 = i10;
                        break;
                    case -232516116:
                    case 1461077956:
                        zM55886 = C0930.m55886(it2);
                        iM559712 = C0873.m55680("ܳ᩺") ^ i17;
                        i10 = ((iM559712 ^ i18) * 2117) ^ (-1681330805);
                        i14 = -1651341851;
                        i20 = iM559712 ^ i14;
                        i19 = i10;
                        break;
                    case -201998333:
                    case 480479968:
                        printStream.println(C0937.m55921(sArr4, i15, 41, i23));
                        return;
                    case -152456981:
                    case 836735315:
                        z6 = false;
                        iM559712 = C0946.m55979("ۡܰ") ^ i18;
                        i10 = ((iM559712 ^ i17) * (-19895)) ^ 1545435242;
                        i14 = -1815215058;
                        i20 = iM559712 ^ i14;
                        i19 = i10;
                        break;
                    case -90461317:
                    case 1332722590:
                        str = str2;
                        i = i23;
                        abstractC18423 = abstractC18425;
                        interfaceC14100 = interfaceC14101;
                        sArr = sArr3;
                        z2 = z7;
                        i6 = i24;
                        s = sArr2[c];
                        if (C0894.f81854 < 0) {
                            iM559711 = C0946.m55979("ۤ᩹") ^ i17;
                            i7 = ((iM559711 ^ i18) * 22331) ^ 170531527;
                            i8 = -430169591;
                            i20 = iM559711 ^ i8;
                            i19 = i7;
                            sArr3 = sArr;
                            i24 = i6;
                            z7 = z2;
                            interfaceC14101 = interfaceC14100;
                            abstractC18425 = abstractC18423;
                            str2 = str;
                            c11245 = this;
                            i23 = i;
                        } else {
                            strM56318 = str;
                            int iM55687 = C0873.m55680("ۗۜ") ^ i18;
                            String str6 = strM56318;
                            i19 = ((iM55687 ^ i17) * 21747) ^ (-912800304);
                            sArr3 = sArr;
                            i24 = i6;
                            z7 = z2;
                            interfaceC14101 = interfaceC14100;
                            abstractC18425 = abstractC18423;
                            str2 = str6;
                            i20 = iM55687 ^ (-946604422);
                            i23 = i;
                            c11245 = this;
                        }
                        break;
                    case 201153516:
                    case 241190323:
                        str = str2;
                        i = i23;
                        abstractC18423 = abstractC18425;
                        interfaceC14100 = interfaceC14101;
                        sArr = sArr3;
                        z2 = z7;
                        i6 = i24;
                        i21 = s * 2;
                        if (C0863.f81833 <= 0) {
                            iM559711 = (C0946.m55979("ܶ᩹") ^ i18) * 27;
                            i7 = ((iM559711 ^ i17) * (-4589)) ^ (-1532132041);
                            i8 = 1188709132;
                        } else {
                            iM559711 = C0873.m55680("ۨ᩷") ^ i18;
                            i7 = ((iM559711 ^ i17) * (-7315)) ^ (-843410557);
                            i8 = 783230206;
                        }
                        i20 = iM559711 ^ i8;
                        i19 = i7;
                        sArr3 = sArr;
                        i24 = i6;
                        z7 = z2;
                        interfaceC14101 = interfaceC14100;
                        abstractC18425 = abstractC18423;
                        str2 = str;
                        c11245 = this;
                        i23 = i;
                        break;
                    case 323140347:
                    case 1570614042:
                        i9 = 10612;
                        int iM55688 = (i18 - C0873.m55680("ۧۧ")) * 69;
                        i10 = ((iM55688 ^ i17) * (-24539)) ^ 32314928;
                        i20 = iM55688 ^ (-1203351434);
                        c11245 = this;
                        sArr3 = sArr3;
                        i24 = i24;
                        z7 = z7;
                        interfaceC14101 = interfaceC14101;
                        abstractC18425 = abstractC18425;
                        str2 = str2;
                        i23 = i9;
                        i19 = i10;
                        break;
                    case 327759884:
                    case 1723944400:
                        ServiceConnectionC1013.m56157();
                        if (C0866.f81837 < 0) {
                            i = i23;
                            abstractC18422 = abstractC18425;
                            iM55979 = C0946.m55979("۫֫") ^ i18;
                            i2 = ((iM55979 ^ i17) * (-10235)) ^ 1801917178;
                            i3 = -1053402488;
                            i20 = iM55979 ^ i3;
                            i19 = i2;
                            abstractC18425 = abstractC18422;
                            i23 = i;
                        } else {
                            iM559712 = (i17 - C0873.m55680("ܽᩳ")) * (-107);
                            i10 = ((iM559712 ^ i18) * (-29457)) ^ (-1174813941);
                            i14 = 973555054;
                            i20 = iM559712 ^ i14;
                            i19 = i10;
                        }
                        break;
                    case 359242838:
                    case 1619026943:
                        RunnableC0897.m55784();
                        if (C1404.f82149 >= 0) {
                            iM559712 = (i17 - C0873.m55680("ܽᩳ")) * (-107);
                            i10 = ((iM559712 ^ i18) * (-29457)) ^ (-1174813941);
                            i14 = 973555054;
                        } else {
                            iM559712 = C0946.m55979("ۘ᩸") ^ i17;
                            i10 = ((iM559712 ^ i18) * (-30917)) ^ 1098826130;
                            i14 = 2106580164;
                        }
                        i20 = iM559712 ^ i14;
                        i19 = i10;
                        break;
                    case 485121681:
                    case 1448269037:
                        C1194.m56396();
                        strM56318 = str2;
                        i = i23;
                        abstractC18423 = abstractC18425;
                        interfaceC14100 = interfaceC14101;
                        sArr = sArr3;
                        z2 = z7;
                        i6 = i24;
                        int iM55689 = C0873.m55680("ۗۜ") ^ i18;
                        String str7 = strM56318;
                        i19 = ((iM55689 ^ i17) * 21747) ^ (-912800304);
                        sArr3 = sArr;
                        i24 = i6;
                        z7 = z2;
                        interfaceC14101 = interfaceC14100;
                        abstractC18425 = abstractC18423;
                        str2 = str7;
                        i20 = iM55689 ^ (-946604422);
                        i23 = i;
                        c11245 = this;
                        break;
                    case 547721055:
                    case 1848445319:
                        C0894.m55761(c13746);
                        throw th;
                    case 577728242:
                    case 617347102:
                        zMo8215 = C1048.m56309(c18108).mo8213();
                        iM559712 = (i18 - C0873.m55680("᩵ᩴ")) * (-57);
                        i10 = ((iM559712 ^ i17) * (-29073)) ^ 1194595619;
                        i14 = -57141157;
                        i20 = iM559712 ^ i14;
                        i19 = i10;
                        break;
                    case 581454535:
                    case 1461667247:
                        try {
                            C0946.m55973(C4081.f8987, new Runnable() { // from class: l.ۙۖܳ
                                @Override // java.lang.Runnable
                                public final void run() {
                                    try {
                                        abstractC18425.mo16732(false);
                                    } catch (IOException unused) {
                                    }
                                }
                            });
                            iM559712 = (C0946.m55979("᩻۟") + i17) * 11;
                            i10 = ((iM559712 ^ i18) * (-21515)) ^ (-1930878057);
                            i14 = 1933351249;
                        } catch (Throwable th4) {
                            th = th4;
                            iM559712 = C0946.m55979("ۡܳ") ^ i17;
                            i10 = ((iM559712 ^ i18) * 27809) ^ 1362497367;
                            i14 = -855319843;
                        }
                        i20 = iM559712 ^ i14;
                        i19 = i10;
                        break;
                    case 655490518:
                    case 1571839202:
                        c11245.m26068(c18108);
                        iM559712 = C0946.m55979("ᩴ᩻") ^ i18;
                        i10 = ((iM559712 ^ i17) * (-10673)) ^ 1429127601;
                        i14 = -1791073785;
                        i20 = iM559712 ^ i14;
                        i19 = i10;
                        break;
                    case 741541393:
                    case 1031439314:
                        str = str2;
                        i = i23;
                        abstractC18423 = abstractC18425;
                        interfaceC14100 = interfaceC14101;
                        sArr = sArr3;
                        z2 = z7;
                        i6 = i24;
                        sArr2 = f82102;
                        if (C0947.f81895) {
                            iM559711 = (C0946.m55979("ܶ᩹") ^ i18) * 27;
                            i7 = ((iM559711 ^ i17) * (-4589)) ^ (-1532132041);
                            i8 = 1188709132;
                        } else {
                            iM559711 = C0946.m55979("᩻۫") ^ i17;
                            i7 = ((iM559711 ^ i18) * (-8261)) ^ 611395911;
                            i8 = -722793730;
                        }
                        i20 = iM559711 ^ i8;
                        i19 = i7;
                        sArr3 = sArr;
                        i24 = i6;
                        z7 = z2;
                        interfaceC14101 = interfaceC14100;
                        abstractC18425 = abstractC18423;
                        str2 = str;
                        c11245 = this;
                        i23 = i;
                        break;
                    case 900869225:
                    case 1183096481:
                        c11245.f31296 = true;
                        i13 = 0;
                        int iM559716 = (C0946.m55979("᩷۬") ^ i17) * 89;
                        int i28 = i13;
                        i19 = ((iM559716 ^ i18) * (-5897)) ^ 662569506;
                        i20 = iM559716 ^ 1551940679;
                        abstractC18425 = abstractC18425;
                        i23 = i23;
                        i15 = i15;
                        i25 = i28;
                        break;
                    case 961132766:
                    case 1035693926:
                        str = str2;
                        i = i23;
                        abstractC18423 = abstractC18425;
                        interfaceC14100 = interfaceC14101;
                        sArr = sArr3;
                        z2 = z7;
                        i6 = i24;
                        c = 0;
                        if (C0898.f81858 <= 0) {
                            iM559711 = (i17 - C0946.m55979("᩸ᩳ")) * 27;
                            i7 = ((iM559711 ^ i18) * (-9973)) ^ (-1803003678);
                            i8 = 1769044487;
                        } else {
                            iM559711 = C0946.m55979("۫ۙ") ^ i18;
                            i7 = ((iM559711 ^ i17) * 7707) ^ 303910884;
                            i8 = 780512125;
                        }
                        i20 = iM559711 ^ i8;
                        i19 = i7;
                        sArr3 = sArr;
                        i24 = i6;
                        z7 = z2;
                        interfaceC14101 = interfaceC14100;
                        abstractC18425 = abstractC18423;
                        str2 = str;
                        c11245 = this;
                        i23 = i;
                        break;
                    case 1085714619:
                    case 1552265620:
                        i9 = 60552;
                        int iM556810 = (i18 - C0873.m55680("ۧۧ")) * 69;
                        i10 = ((iM556810 ^ i17) * (-24539)) ^ 32314928;
                        i20 = iM556810 ^ (-1203351434);
                        c11245 = this;
                        sArr3 = sArr3;
                        i24 = i24;
                        z7 = z7;
                        interfaceC14101 = interfaceC14101;
                        abstractC18425 = abstractC18425;
                        str2 = str2;
                        i23 = i9;
                        i19 = i10;
                        break;
                    case 1160308717:
                    case 1821212223:
                        zM55887 = C0930.m55886(it);
                        iM559712 = (C0873.m55680("ۖ۠") + i18) * (-41);
                        i10 = ((iM559712 ^ i17) * (-31619)) ^ 1056387199;
                        i14 = 884099300;
                        i20 = iM559712 ^ i14;
                        i19 = i10;
                        break;
                    case 1506287895:
                    case 1710246933:
                        if (zM55887) {
                            iM559712 = C0873.m55680("ܰۡ") ^ i17;
                            i10 = ((iM559712 ^ i18) * (-32759)) ^ (-1482285908);
                            i14 = -285145413;
                        } else {
                            iM559712 = C0873.m55680("ۖۙ") ^ i18;
                            i10 = ((iM559712 ^ i17) * 23733) ^ (-1612651185);
                            i14 = -480881988;
                        }
                        i20 = iM559712 ^ i14;
                        i19 = i10;
                        break;
                    case 1910809867:
                    case 1982599838:
                        z = z7;
                        str2 = str2;
                        i = i23;
                        abstractC18425 = abstractC18425;
                        interfaceC14101 = ApplicationC21448.f67649;
                        sArr3 = f82102;
                        i24 = 1;
                        if (ServiceConnectionC1013.f81940 >= 0) {
                            iM559710 = (C0946.m55979("ۧ᩷") ^ i17) * (-37);
                            i5 = ((iM559710 ^ i18) * (-29403)) ^ 1712710023;
                            i4 = 261520013;
                        } else {
                            iM559710 = C0873.m55680("ᩴ᩺") ^ i17;
                            i5 = ((iM559710 ^ i18) * 3615) ^ (-258163543);
                            i4 = 1633879501;
                        }
                        i20 = iM559710 ^ i4;
                        abstractC18425 = abstractC18425;
                        str2 = str2;
                        i23 = i;
                        boolean z10 = z;
                        interfaceC14101 = interfaceC14101;
                        i19 = i5;
                        z7 = z10;
                        break;
                    default:
                        i = i23;
                        printStream = System.out;
                        sArr4 = f82102;
                        i15 = 16;
                        if (C1024.m56209() < 0) {
                            iM55979 = C0946.m55979("ܺ᩵") ^ i17;
                            abstractC18422 = abstractC18425;
                            i2 = ((iM55979 ^ i18) * 20601) ^ 342816021;
                            i3 = 508867464;
                            i20 = iM55979 ^ i3;
                            i19 = i2;
                            abstractC18425 = abstractC18422;
                            i23 = i;
                        } else {
                            z = z7;
                            iM559710 = (C0946.m55979("ۧ᩷") ^ i17) * (-37);
                            i5 = ((iM559710 ^ i18) * (-29403)) ^ 1712710023;
                            i4 = 261520013;
                            i20 = iM559710 ^ i4;
                            abstractC18425 = abstractC18425;
                            str2 = str2;
                            i23 = i;
                            boolean z11 = z;
                            interfaceC14101 = interfaceC14101;
                            i19 = i5;
                            z7 = z11;
                        }
                        break;
                }
            }
            int i29 = i23;
            AbstractC18422 abstractC18428 = abstractC18425;
            InterfaceC14100 interfaceC14102 = interfaceC14101;
            String str8 = str2;
            boolean zM56326 = C1053.m56326(interfaceC14102, str8, false);
            C18107 c18109 = c11245.f31295;
            C18107 c181010 = c11245.f31287;
            if (zM56326) {
                iM55680 = C0946.m55979("֫ۖ") ^ i18;
                i11 = ((iM55680 ^ i17) * 11361) ^ (-212176898);
                i12 = -1517138542;
            } else {
                iM55680 = C0873.m55680("֡᩸") ^ i17;
                i11 = ((iM55680 ^ i18) * 15263) ^ 1561798467;
                i12 = -1617967980;
            }
            i20 = iM55680 ^ i12;
            i19 = i11;
            interfaceC14101 = interfaceC14102;
            abstractC18425 = abstractC18428;
            i23 = i29;
            str2 = str8;
            c18108 = c18109;
            c18107 = c181010;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26067(String str) {
        C18107 c18107 = this.f31295;
        C18107 c18108 = this.f31287;
        if (this.f31309) {
            return;
        }
        C13746<AbstractC18422> c13746 = this.f31277;
        if (c13746.m31297()) {
            C7050.m16212(new RunnableC23549(2, str));
            return;
        }
        this.f31309 = true;
        c13746.m31299();
        try {
            Iterator<E> it = c13746.iterator();
            boolean z = false;
            while (it.hasNext()) {
                AbstractC18422 abstractC18422 = (AbstractC18422) it.next();
                if (!abstractC18422.mo8213()) {
                    abstractC18422.m41985();
                    it.remove();
                    z = true;
                }
            }
            if (!c18108.m41270().mo8213()) {
                m26068(c18108);
                z = false;
            }
            if (!c18107.m41270().mo8213()) {
                m26068(c18107);
                z = false;
            }
            if (this.f31281) {
                c18108.m41277(str);
                c18107.m41277(str);
            } else {
                c18107.m41277(str);
                c18108.m41277(str);
            }
            for (final AbstractC18422 abstractC18423 : c13746) {
                if (abstractC18423.mo17073(str)) {
                    C4081.f8987.execute(new Runnable() { // from class: l.ܰۖܳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                abstractC18423.mo16732(false);
                            } catch (IOException unused) {
                            }
                        }
                    });
                }
            }
            if (z) {
                C8009.m18592();
            }
            c13746.m31298();
            this.f31309 = false;
        } catch (Throwable th) {
            c13746.m31298();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۚ */
    public final void m26078() {
        boolean z = this.f31281;
        C18107 c18107 = this.f31295;
        C18107 c18108 = this.f31287;
        if (z) {
            c18108.m41270().mo8215(c18108);
            c18107.m41270().mo8215(c18107);
        } else {
            c18107.m41270().mo8215(c18107);
            c18108.m41270().mo8215(c18108);
        }
    }

    /* JADX INFO: renamed from: ֡ */
    public final void m26061() {
        this.f31300 = true;
        m26056(false);
        this.f31287.m41276();
        this.f31295.m41276();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C13746 m26103() {
        return this.f31277;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܳ */
    public final int m26089() {
        C13746 c13746 = this.f31277;
        c13746.m31299();
        for (int i = 0; i < c13746.size(); i++) {
            try {
                if (((AbstractC18422) c13746.get(i)) instanceof C18310) {
                    return i;
                }
            } finally {
                c13746.m31298();
            }
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m26058(boolean z) {
        FloatingActionButton floatingActionButton = z ? this.f31275 : this.f31284;
        FloatingActionButton floatingActionButton2 = z ? this.f31303 : this.f31290;
        if (floatingActionButton == null) {
            return;
        }
        floatingActionButton.setBackgroundTintList(ColorStateList.valueOf(C23223.f72969));
        floatingActionButton2.setBackgroundTintList(ColorStateList.valueOf(C23223.f72999));
        floatingActionButton.setImageTintList(ColorStateList.valueOf(C23223.f73003));
        floatingActionButton2.setImageTintList(ColorStateList.valueOf(C23223.f73003));
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m26038(FloatingActionButton floatingActionButton) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) floatingActionButton.getLayoutParams();
        return (floatingActionButton.getHeight() != 0 ? floatingActionButton.getHeight() : floatingActionButton.getMeasuredHeight()) + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26073(boolean z, boolean z2) {
        m26056(true);
        if (z) {
            if (this.f31302) {
                return;
            } else {
                this.f31302 = true;
            }
        } else if (this.f31293) {
            return;
        } else {
            this.f31293 = true;
        }
        FloatingActionButton floatingActionButton = z ? this.f31275 : this.f31284;
        FloatingActionButton floatingActionButton2 = z ? this.f31303 : this.f31290;
        AnimatorSet duration = new AnimatorSet().setDuration(200L);
        if (z2) {
            duration.playTogether(ObjectAnimator.ofFloat(floatingActionButton, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(floatingActionButton2, "alpha", 1.0f, 0.0f));
        } else {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, "translationY", 0.0f, m26038(floatingActionButton));
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton2, "translationY", 0.0f, m26038(floatingActionButton2));
            duration.setInterpolator(new AccelerateInterpolator());
            duration.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        }
        duration.addListener(new C21974(floatingActionButton, floatingActionButton2));
        duration.start();
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m26077() {
        m26056(true);
    }

    /* JADX INFO: renamed from: ܿ */
    private void m26056(boolean z) {
        this.f31294.removeCallbacks(this.f31279);
        this.f31294.animate().setListener(null).cancel();
        if (!z || this.f31294.getVisibility() != 0 || this.f31294.getAlpha() == 0.0f) {
            this.f31294.setVisibility(8);
            this.f31294.setAlpha(1.0f);
        } else {
            this.f31294.animate().alpha(0.0f).setDuration(200L).setInterpolator(new AccelerateInterpolator()).setListener(new C8562(this)).start();
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private void m26050(boolean z) {
        AccessibilityManager accessibilityManager;
        C18107 c18107 = z ? this.f31287 : this.f31295;
        if (!this.f31300 && this.f31281 == z && c18107.m41265() && this.f31306.getLifecycle().mo21805().m35142(EnumC15415.RESUMED)) {
            int iM29939 = C13076.m29939(12.0f);
            ViewGroup viewGroup = (ViewGroup) this.f31294.getParent();
            int width = ((viewGroup.getWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight()) - (iM29939 * 2);
            int iM47728 = this.f31301.m47728();
            if (!this.f31301.isShown() || width <= 0 || iM47728 <= 0) {
                return;
            }
            this.f31294.setBackgroundResource(C22553.m50542(this.f31306.getTheme(), R.attr.MT_Protector));
            this.f31294.setTextColor(C22553.m50538(this.f31306.getTheme(), R.attr.MT_Protector));
            this.f31294.setMaxWidth(width);
            this.f31294.setTextSize(2, 14.0f);
            this.f31294.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            if (this.f31294.getLineCount() > 1) {
                this.f31294.setTextSize(2, 13.0f);
            }
            TextView textView = this.f31294;
            textView.setMinHeight(C13076.m29939(24.0f) + textView.getLineHeight());
            this.f31294.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            C1680 c1680 = (C1680) this.f31294.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c1680).bottomMargin = Math.max(0, (iM47728 - this.f31294.getMeasuredHeight()) / 2) + (this.f31301.getHeight() - iM47728);
            this.f31294.setLayoutParams(c1680);
            this.f31294.animate().setListener(null).cancel();
            this.f31294.setAlpha(0.0f);
            this.f31294.setVisibility(0);
            this.f31294.animate().alpha(1.0f).setDuration(200L).setInterpolator(new DecelerateInterpolator()).start();
            int i = Build.VERSION.SDK_INT;
            int recommendedTimeoutMillis = OpenAuthTask.SYS_ERR;
            if (i >= 29 && (accessibilityManager = (AccessibilityManager) this.f31306.getSystemService("accessibility")) != null) {
                recommendedTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(OpenAuthTask.SYS_ERR, 2);
            }
            this.f31294.postDelayed(this.f31279, recommendedTimeoutMillis);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m26087(boolean z, boolean z2) {
        if (z2) {
            m26056(false);
        }
        if (!z ? this.f31293 : this.f31302) {
            if (z2) {
                m26050(z);
                return;
            }
            return;
        }
        if ((z ? this.f31275 : this.f31284) == null) {
            int i = z ? R.id.MT_Protector : R.id.MT_Protector;
            Main main = this.f31306;
            FloatingActionButton floatingActionButton = (FloatingActionButton) ((ViewStub) main.m12277(i)).inflate();
            ViewOnClickListenerC3868 viewOnClickListenerC3868 = this.f31289;
            floatingActionButton.setOnClickListener(viewOnClickListenerC3868);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            floatingActionButton.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            FloatingActionButton floatingActionButton2 = (FloatingActionButton) ((ViewStub) main.m12277(z ? R.id.MT_Protector : R.id.MT_Protector)).inflate();
            floatingActionButton2.setOnClickListener(viewOnClickListenerC3868);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            floatingActionButton2.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
            if (z) {
                this.f31303 = floatingActionButton;
                this.f31275 = floatingActionButton2;
            } else {
                this.f31290 = floatingActionButton;
                this.f31284 = floatingActionButton2;
            }
            m26058(z);
        }
        if (z) {
            this.f31302 = false;
        } else {
            this.f31293 = false;
        }
        FloatingActionButton floatingActionButton3 = z ? this.f31275 : this.f31284;
        FloatingActionButton floatingActionButton4 = z ? this.f31303 : this.f31290;
        floatingActionButton3.setVisibility(0);
        floatingActionButton4.setVisibility(0);
        float fM26038 = m26038(floatingActionButton3);
        floatingActionButton3.setTranslationY(fM26038);
        floatingActionButton3.setAlpha(1.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton3, "translationY", fM26038, 0.0f);
        float fM26039 = m26038(floatingActionButton4);
        floatingActionButton4.setTranslationY(fM26039);
        floatingActionButton4.setAlpha(1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton4, "translationY", fM26039, 0.0f);
        AnimatorSet duration = new AnimatorSet().setDuration(200L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        if (z2) {
            m26050(z);
        }
        duration.start();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26064(Bundle bundle) {
        C18107 c18107 = this.f31295;
        C18107 c18108 = this.f31287;
        C11996 c11996 = new C11996();
        c11996.m27445(this.f31281);
        C18310.m41735(c11996);
        C13746<AbstractC18422> c13746 = this.f31277;
        c13746.m31299();
        try {
            AbstractC18422 abstractC18422M41270 = c18108.m41270();
            c11996.m27459(abstractC18422M41270.mo8204());
            abstractC18422M41270.mo8201(c11996);
            c18108.m41230(c11996);
            AbstractC18422 abstractC18422M41271 = c18107.m41270();
            c11996.m27459(abstractC18422M41271.mo8204());
            abstractC18422M41271.mo8201(c11996);
            c18107.m41230(c11996);
            c11996.mo15113(c13746.size());
            for (AbstractC18422 abstractC18422 : c13746) {
                c11996.m27459(abstractC18422.mo8204());
                abstractC18422.mo8201(c11996);
            }
            c13746.m31298();
            bundle.putByteArray("WindowManagerData", c11996.m27447());
        } catch (Throwable th) {
            c13746.m31298();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m26096() {
        C13746 c13746 = this.f31277;
        c13746.m31299();
        try {
            this.f31287.m41270().m41985();
            this.f31295.m41270().m41985();
            Iterator it = new ArrayList(c13746).iterator();
            while (it.hasNext()) {
                ((AbstractC18422) it.next()).m41985();
            }
            c13746.m31298();
        } catch (Throwable th) {
            c13746.m31298();
            throw th;
        }
    }
}
