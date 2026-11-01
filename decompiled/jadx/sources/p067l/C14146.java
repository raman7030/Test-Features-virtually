package p067l;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.os.TransactionTooLargeException;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.MetaKeyKeyListener;
import android.text.method.TextKeyListener;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.OverScroller;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p050t0.C0215b;
import com.umeng.analytics.pro.C0719o;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.p066io.UncheckedIOException;
import java.text.BreakIterator;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.۫ۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes.dex */
public class C14146 extends View implements InterfaceC18226 {

    /* JADX INFO: renamed from: ܳܿ */
    public static final float f40185;

    /* JADX INFO: renamed from: ᩻ܿ */
    public static final TextKeyListener f40186;

    /* JADX INFO: renamed from: ֡֫ */
    public volatile int f40187;

    /* JADX INFO: renamed from: ֡ۧ */
    public boolean f40188;

    /* JADX INFO: renamed from: ֡ܽ */
    public boolean f40189;

    /* JADX INFO: renamed from: ֡ᩳ */
    public C8506 f40190;

    /* JADX INFO: renamed from: ֨֫ */
    public int f40191;

    /* JADX INFO: renamed from: ֨ۧ */
    public int f40192;

    /* JADX INFO: renamed from: ֨ܽ */
    public boolean f40193;

    /* JADX INFO: renamed from: ֨ᩳ */
    public C16827 f40194;

    /* JADX INFO: renamed from: ֫֫ */
    public ClipboardManager f40195;

    /* JADX INFO: renamed from: ֫ۧ */
    public C8377 f40196;

    /* JADX INFO: renamed from: ֫ܽ */
    public ArrayList f40197;

    /* JADX INFO: renamed from: ֫ܿ */
    public C24047 f40198;

    /* JADX INFO: renamed from: ֫ᩳ */
    public final ArrayDeque f40199;

    /* JADX INFO: renamed from: ۖ֫ */
    public final C4404 f40200;

    /* JADX INFO: renamed from: ۖۧ */
    public float f40201;

    /* JADX INFO: renamed from: ۖܽ */
    public boolean f40202;

    /* JADX INFO: renamed from: ۖᩳ */
    public final AtomicInteger f40203;

    /* JADX INFO: renamed from: ۗ */
    public volatile boolean f40204;

    /* JADX INFO: renamed from: ۗ֫ */
    public C4145 f40205;

    /* JADX INFO: renamed from: ۗۧ */
    public EdgeEffect f40206;

    /* JADX INFO: renamed from: ۗܽ */
    public C4404 f40207;

    /* JADX INFO: renamed from: ۗᩳ */
    public InterfaceC23850 f40208;

    /* JADX INFO: renamed from: ۘ֫ */
    public boolean f40209;

    /* JADX INFO: renamed from: ۘۧ */
    public long f40210;

    /* JADX INFO: renamed from: ۘܽ */
    public volatile boolean f40211;

    /* JADX INFO: renamed from: ۘᩳ */
    public InterfaceC9768 f40212;

    /* JADX INFO: renamed from: ۙ */
    public boolean f40213;

    /* JADX INFO: renamed from: ۙ֫ */
    public boolean f40214;

    /* JADX INFO: renamed from: ۙۧ */
    public C23416 f40215;

    /* JADX INFO: renamed from: ۙܽ */
    public boolean f40216;

    /* JADX INFO: renamed from: ۙᩳ */
    public int f40217;

    /* JADX INFO: renamed from: ۚ֫ */
    public float f40218;

    /* JADX INFO: renamed from: ۚۧ */
    public final AtomicInteger f40219;

    /* JADX INFO: renamed from: ۚܽ */
    public boolean f40220;

    /* JADX INFO: renamed from: ۚᩳ */
    public boolean f40221;

    /* JADX INFO: renamed from: ۛ */
    public AbstractActivityC5549 f40222;

    /* JADX INFO: renamed from: ۛ֫ */
    public int f40223;

    /* JADX INFO: renamed from: ۛۧ */
    public HandlerC15329 f40224;

    /* JADX INFO: renamed from: ۛܽ */
    public int f40225;

    /* JADX INFO: renamed from: ۛᩳ */
    public InterfaceC7441 f40226;

    /* JADX INFO: renamed from: ۜ֫ */
    public long f40227;

    /* JADX INFO: renamed from: ۜۧ */
    public boolean f40228;

    /* JADX INFO: renamed from: ۜܽ */
    public final int[] f40229;

    /* JADX INFO: renamed from: ۜᩳ */
    public float f40230;

    /* JADX INFO: renamed from: ۟ */
    public boolean f40231;

    /* JADX INFO: renamed from: ۟֫ */
    public ViewOnTouchListenerC18840 f40232;

    /* JADX INFO: renamed from: ۟ۧ */
    public EdgeEffect f40233;

    /* JADX INFO: renamed from: ۟ܽ */
    public final Object f40234;

    /* JADX INFO: renamed from: ۟ᩳ */
    public volatile long f40235;

    /* JADX INFO: renamed from: ۠֫ */
    public float f40236;

    /* JADX INFO: renamed from: ۠ۧ */
    public boolean f40237;

    /* JADX INFO: renamed from: ۠ܽ */
    public float f40238;

    /* JADX INFO: renamed from: ۠ᩳ */
    public C22864 f40239;

    /* JADX INFO: renamed from: ۡ֫ */
    public int f40240;

    /* JADX INFO: renamed from: ۡۧ */
    public long f40241;

    /* JADX INFO: renamed from: ۡܽ */
    public C10676 f40242;

    /* JADX INFO: renamed from: ۡᩳ */
    public int f40243;

    /* JADX INFO: renamed from: ۢ֫ */
    public int f40244;

    /* JADX INFO: renamed from: ۢۧ */
    public C6100 f40245;

    /* JADX INFO: renamed from: ۢܽ */
    public final Matrix f40246;

    /* JADX INFO: renamed from: ۢᩳ */
    public final ArrayList f40247;

    /* JADX INFO: renamed from: ۤ */
    public int f40248;

    /* JADX INFO: renamed from: ۤ֫ */
    public InterfaceC9749 f40249;

    /* JADX INFO: renamed from: ۤۧ */
    public final CursorAnchorInfo.Builder f40250;

    /* JADX INFO: renamed from: ۤܽ */
    public long f40251;

    /* JADX INFO: renamed from: ۤᩳ */
    public C8898 f40252;

    /* JADX INFO: renamed from: ۧ֫ */
    public AbstractC23000 f40253;

    /* JADX INFO: renamed from: ۧۧ */
    public boolean f40254;

    /* JADX INFO: renamed from: ۧܽ */
    public ArrayList f40255;

    /* JADX INFO: renamed from: ۧܿ */
    public final C10748 f40256;

    /* JADX INFO: renamed from: ۧᩳ */
    public volatile long f40257;

    /* JADX INFO: renamed from: ۨ */
    public boolean f40258;

    /* JADX INFO: renamed from: ۨ֫ */
    public int f40259;

    /* JADX INFO: renamed from: ۨۧ */
    public C23416 f40260;

    /* JADX INFO: renamed from: ۨܽ */
    public volatile C23534 f40261;

    /* JADX INFO: renamed from: ۨᩳ */
    public C23929 f40262;

    /* JADX INFO: renamed from: ۫ */
    public InterfaceC16176 f40263;

    /* JADX INFO: renamed from: ۫֫ */
    public volatile C6495 f40264;

    /* JADX INFO: renamed from: ۫ۧ */
    public C8801 f40265;

    /* JADX INFO: renamed from: ۫ܽ */
    public int[] f40266;

    /* JADX INFO: renamed from: ۫ᩳ */
    public volatile C5429 f40267;

    /* JADX INFO: renamed from: ۬ */
    public int f40268;

    /* JADX INFO: renamed from: ۬֫ */
    public RuntimeException f40269;

    /* JADX INFO: renamed from: ۬ۧ */
    public final BreakIterator f40270;

    /* JADX INFO: renamed from: ۬ܽ */
    public InterfaceC3299 f40271;

    /* JADX INFO: renamed from: ۬ᩳ */
    public C16273 f40272;

    /* JADX INFO: renamed from: ܰ */
    public volatile boolean f40273;

    /* JADX INFO: renamed from: ܰ֫ */
    public C0888 f40274;

    /* JADX INFO: renamed from: ܰۧ */
    public AbstractC5390 f40275;

    /* JADX INFO: renamed from: ܰܽ */
    public ViewTreeObserverOnGlobalLayoutListenerC3417 f40276;

    /* JADX INFO: renamed from: ܰᩳ */
    public final Object f40277;

    /* JADX INFO: renamed from: ܳ֫ */
    public boolean f40278;

    /* JADX INFO: renamed from: ܳۧ */
    public boolean f40279;

    /* JADX INFO: renamed from: ܳܽ */
    public long f40280;

    /* JADX INFO: renamed from: ܳᩳ */
    public final RectF f40281;

    /* JADX INFO: renamed from: ܶ֫ */
    public final Rect f40282;

    /* JADX INFO: renamed from: ܶۧ */
    public int f40283;

    /* JADX INFO: renamed from: ܶܽ */
    public boolean f40284;

    /* JADX INFO: renamed from: ܶᩳ */
    public volatile C21523 f40285;

    /* JADX INFO: renamed from: ܺ֫ */
    public int f40286;

    /* JADX INFO: renamed from: ܺۧ */
    public float f40287;

    /* JADX INFO: renamed from: ܺܽ */
    public int f40288;

    /* JADX INFO: renamed from: ܺᩳ */
    public final CopyOnWriteArrayList f40289;

    /* JADX INFO: renamed from: ܽ֫ */
    public C23495 f40290;

    /* JADX INFO: renamed from: ܽۧ */
    public InputMethodManager f40291;

    /* JADX INFO: renamed from: ܽܽ */
    public EdgeEffect f40292;

    /* JADX INFO: renamed from: ܽܿ */
    public boolean f40293;

    /* JADX INFO: renamed from: ܽᩳ */
    public volatile transient boolean f40294;

    /* JADX INFO: renamed from: ܿ֫ */
    public int f40295;

    /* JADX INFO: renamed from: ܿۧ */
    public volatile boolean f40296;

    /* JADX INFO: renamed from: ܿܽ */
    public long f40297;

    /* JADX INFO: renamed from: ܿܿ */
    public C14146 f40298;

    /* JADX INFO: renamed from: ܿᩳ */
    public final RectF f40299;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final ArrayList f40300;

    /* JADX INFO: renamed from: ᩳۧ */
    public final AtomicInteger f40301;

    /* JADX INFO: renamed from: ᩳܽ */
    public OverScroller f40302;

    /* JADX INFO: renamed from: ᩳܿ */
    public final AtomicInteger f40303;

    /* JADX INFO: renamed from: ᩳᩳ */
    public volatile boolean f40304;

    /* JADX INFO: renamed from: ᩴ֫ */
    public boolean f40305;

    /* JADX INFO: renamed from: ᩴۧ */
    public float f40306;

    /* JADX INFO: renamed from: ᩴܽ */
    public boolean f40307;

    /* JADX INFO: renamed from: ᩴᩳ */
    public boolean f40308;

    /* JADX INFO: renamed from: ᩵֫ */
    public ArrayList f40309;

    /* JADX INFO: renamed from: ᩵ۧ */
    public float f40310;

    /* JADX INFO: renamed from: ᩵ܽ */
    public boolean f40311;

    /* JADX INFO: renamed from: ᩵ᩳ */
    public boolean f40312;

    /* JADX INFO: renamed from: ᩶ */
    public C14816 f40313;

    /* JADX INFO: renamed from: ᩶֫ */
    public C15486 f40314;

    /* JADX INFO: renamed from: ᩶ۧ */
    public int f40315;

    /* JADX INFO: renamed from: ᩶ܽ */
    public InterfaceC2746 f40316;

    /* JADX INFO: renamed from: ᩶ᩳ */
    public boolean f40317;

    /* JADX INFO: renamed from: ᩷֫ */
    public InterfaceC20853 f40318;

    /* JADX INFO: renamed from: ᩷ۧ */
    public volatile C6100 f40319;

    /* JADX INFO: renamed from: ᩷ܽ */
    public EdgeEffect f40320;

    /* JADX INFO: renamed from: ᩷ᩳ */
    public volatile boolean f40321;

    /* JADX INFO: renamed from: ᩸ */
    public Runnable f40322;

    /* JADX INFO: renamed from: ᩸֫ */
    public final Rect f40323;

    /* JADX INFO: renamed from: ᩸ۧ */
    public boolean f40324;

    /* JADX INFO: renamed from: ᩸ܽ */
    public boolean f40325;

    /* JADX INFO: renamed from: ᩸ᩳ */
    public long f40326;

    /* JADX INFO: renamed from: ᩹ */
    public Runnable f40327;

    /* JADX INFO: renamed from: ᩹֫ */
    public C9688 f40328;

    /* JADX INFO: renamed from: ᩹ۧ */
    public int f40329;

    /* JADX INFO: renamed from: ᩹ܽ */
    public int f40330;

    /* JADX INFO: renamed from: ᩹ᩳ */
    public long f40331;

    /* JADX INFO: renamed from: ᩺ */
    public C24894 f40332;

    /* JADX INFO: renamed from: ᩺֫ */
    public boolean f40333;

    /* JADX INFO: renamed from: ᩺ۧ */
    public C16157 f40334;

    /* JADX INFO: renamed from: ᩺ܽ */
    public C14816 f40335;

    /* JADX INFO: renamed from: ᩺ᩳ */
    public C15371 f40336;

    /* JADX INFO: renamed from: ᩻֫ */
    public boolean f40337;

    /* JADX INFO: renamed from: ᩻ۧ */
    public boolean f40338;

    /* JADX INFO: renamed from: ᩻ܽ */
    public InterfaceC9768 f40339;

    /* JADX INFO: renamed from: ᩻ᩳ */
    public final Rect f40340;

    /* JADX INFO: renamed from: ֫ */
    public static int m32185(int i, int i2, int i3) {
        if (i3 >= i2 && i >= i2) {
            return i > i3 ? i3 : i;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ֫ */
    private synchronized boolean m32216(C2628 c2628, C2628 c2629, int i, long j) {
        boolean z = this.f40294;
        this.f40294 = true;
        try {
            if (!this.f40211 && this.f40339 == c2628) {
                int iM32508 = m32508();
                int iM32512 = m32512();
                if (!c2628.m3993(i, j, new RunnableC16000(this, c2629, c2628, 0))) {
                    c2629.close();
                    this.f40294 = z;
                    return false;
                }
                try {
                    this.f40190.m19807(c2629);
                    this.f40252.m20521();
                    this.f40332.m54669();
                    this.f40275.mo10199(c2629);
                    m32235();
                    c2629.setSelection(iM32508, iM32512);
                    C23929 c23929 = this.f40262;
                    if (c23929.f75992) {
                        m32381(c23929.f76022, true);
                    }
                    this.f40190.m19806(c2629);
                    this.f40252.m20546(c2629);
                    m32469();
                    c2628.setReadOnly(false);
                    this.f40294 = z;
                    return true;
                } catch (Throwable th) {
                    c2628.setReadOnly(false);
                    throw th;
                }
            }
            c2629.close();
            this.f40294 = z;
            return false;
        } catch (Throwable th2) {
            this.f40294 = z;
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ᩶ᩳ */
    private native void m32339();

    /* JADX INFO: renamed from: ᩹ᩳ */
    private native void m32350();

    /* JADX INFO: renamed from: ֡֫ */
    public int mo27915() {
        return 917505;
    }

    /* JADX INFO: renamed from: ֫ */
    public native void mo27918(C14677 c14677);

    /* JADX INFO: renamed from: ֫ */
    public native void m32407(AbstractC23000 abstractC23000);

    /* JADX INFO: renamed from: ֫֫ */
    public native void m32424();

    /* JADX INFO: renamed from: ֫ܽ */
    public boolean mo27920() {
        return false;
    }

    /* JADX INFO: renamed from: ۖ֫ */
    public int mo27921() {
        return 0;
    }

    /* JADX INFO: renamed from: ۘܽ */
    public boolean mo27924() {
        return true;
    }

    /* JADX INFO: renamed from: ۚܽ */
    public final synchronized void m32450() {
        if (!this.f40307) {
            InterfaceC9768 interfaceC9768 = this.f40339;
            if (interfaceC9768 instanceof C2628) {
                C2628 c2628 = (C2628) interfaceC9768;
                this.f40211 = true;
                if (c2628 instanceof C7836) {
                    ((C7836) c2628).m18124();
                }
                if (this.f40248 != 0) {
                    m32526();
                    return;
                }
                if (isAttachedToWindow()) {
                    return;
                }
                this.f40307 = true;
                m32502();
                this.f40300.clear();
                m32526();
                this.f40252.m20535();
                this.f40318 = null;
                m32323((CharSequence) new C2628(""));
                this.f40252.m20535();
                this.f40224.m34890();
                AbstractC5390 abstractC5390 = this.f40275;
                if (abstractC5390 != null) {
                    abstractC5390.f12819 = true;
                }
                c2628.close();
            }
        }
    }

    /* JADX INFO: renamed from: ۛܽ */
    public boolean mo27926() {
        return false;
    }

    /* JADX INFO: renamed from: ۡܽ */
    public void mo27928() {
    }

    /* JADX INFO: renamed from: ۢ */
    public void mo27930(int i) {
    }

    /* JADX INFO: renamed from: ۧ */
    public native void m32492(String str);

    /* JADX INFO: renamed from: ۨ */
    public final synchronized void m32503() {
        int i = this.f40248;
        if (i <= 0) {
            throw new IllegalStateException("No background text task");
        }
        this.f40248 = i - 1;
        if (this.f40211) {
            m32450();
        }
    }

    /* JADX INFO: renamed from: ܶۧ */
    public boolean mo27938() {
        return true;
    }

    /* JADX INFO: renamed from: ܿ */
    public final synchronized void m32549() {
        if (this.f40211) {
            throw new IllegalStateException("Text view is released");
        }
        this.f40248++;
    }

    /* JADX INFO: renamed from: ᩵֫ */
    public int mo27942() {
        return 33554433;
    }

    /* JADX INFO: renamed from: ᩸ܽ */
    public boolean mo27947() {
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m32208(C14146 c14146, C21405 c21405, Runnable runnable) {
        c14146.getClass();
        try {
            c14146.m32403(c21405);
            try {
                runnable.run();
            } finally {
                c14146.m32288();
            }
        } catch (Throwable th) {
            try {
                runnable.run();
                throw th;
            } finally {
                c14146.m32288();
            }
        }
    }

    public C14146(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C14146(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40331 = 0L;
        this.f40326 = 0L;
        this.f40225 = 0;
        this.f40297 = SystemClock.uptimeMillis();
        this.f40280 = 0L;
        this.f40288 = 0;
        this.f40244 = 0;
        this.f40243 = 0;
        this.f40203 = new AtomicInteger();
        this.f40238 = -1.0f;
        this.f40213 = true;
        this.f40254 = false;
        this.f40317 = false;
        this.f40217 = 0;
        this.f40305 = false;
        this.f40299 = new RectF();
        this.f40223 = -1;
        this.f40259 = -1;
        this.f40315 = -1;
        this.f40329 = -1;
        this.f40281 = new RectF();
        this.f40340 = new Rect();
        this.f40214 = true;
        C4404 c4404 = new C4404(this);
        this.f40200 = c4404;
        this.f40316 = c4404;
        this.f40266 = new int[2];
        this.f40247 = new ArrayList();
        this.f40294 = false;
        this.f40204 = false;
        this.f40257 = -1L;
        this.f40304 = false;
        this.f40300 = new ArrayList();
        this.f40301 = new AtomicInteger();
        this.f40290 = new C23495();
        this.f40282 = new Rect();
        this.f40323 = new Rect();
        this.f40227 = -1L;
        this.f40295 = 255;
        this.f40289 = new CopyOnWriteArrayList();
        this.f40219 = new AtomicInteger();
        this.f40321 = false;
        this.f40270 = BreakIterator.getWordInstance();
        this.f40199 = new ArrayDeque();
        this.f40234 = new Object();
        this.f40277 = new Object();
        this.f40339 = new C2628("");
        this.f40265 = new C8801(this);
        this.f40224 = new HandlerC15329(this);
        this.f40309 = new ArrayList();
        this.f40196 = new C8377();
        this.f40215 = new C23416();
        this.f40260 = new C23416();
        this.f40197 = new ArrayList();
        this.f40255 = new ArrayList();
        this.f40256 = C10748.m24756(300);
        this.f40250 = new CursorAnchorInfo.Builder();
        this.f40246 = new Matrix();
        this.f40229 = new int[2];
        this.f40303 = new AtomicInteger();
        this.f40228 = false;
        this.f40314 = C15486.f44207;
        setSaveEnabled(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        if (!isInEditMode()) {
            this.f40291 = (InputMethodManager) context.getSystemService("input_method");
            this.f40195 = (ClipboardManager) context.getSystemService("clipboard");
        } else {
            C15517.m35312();
        }
        C23929 c23929 = new C23929(this);
        if (!isInEditMode()) {
            c23929.m53009();
        }
        if (i2 >= 24) {
            setPointerIcon(PointerIcon.getSystemIcon(context, 1008));
        }
        this.f40262 = c23929;
        this.f40205 = new C4145();
        this.f40252 = new C8898(this);
        this.f40190 = new C8506(this);
        this.f40332 = new C24894(this);
        if (!mo27938()) {
            this.f40339.mo3999().m54766(0L);
        }
        this.f40339.setSelection(0);
        this.f40320 = new EdgeEffect(context);
        this.f40206 = new EdgeEffect(context);
        m32190(AbstractC5390.m11789(this, this.f40339, c23929, this.f40217), true);
        setLongClickable(true);
        this.f40302 = new OverScroller(context);
        ViewOnTouchListenerC18840 viewOnTouchListenerC18840 = new ViewOnTouchListenerC18840(this, context);
        this.f40232 = viewOnTouchListenerC18840;
        this.f40274 = new C0888(context, viewOnTouchListenerC18840);
        setOnTouchListener(viewOnTouchListenerC18840);
        Activity activityM17221 = C7453.m17221(context);
        if (activityM17221 instanceof AbstractActivityC5549) {
            this.f40222 = (AbstractActivityC5549) activityM17221;
        }
        m32285();
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo27940() {
        if (isInEditMode()) {
            return;
        }
        C9688 c9688 = this.f40328;
        if (c9688 != null) {
            c9688.m22588();
        }
        this.f40328 = null;
        this.f40262.m53009();
        C24047 c24047 = this.f40198;
        if (c24047 != null) {
            ViewTreeObserverOnPreDrawListenerC10518[] viewTreeObserverOnPreDrawListenerC10518Arr = c24047.f76377;
            viewTreeObserverOnPreDrawListenerC10518Arr[0].m24253();
            viewTreeObserverOnPreDrawListenerC10518Arr[1].m24253();
            viewTreeObserverOnPreDrawListenerC10518Arr[2].m24253();
        }
    }

    /* JADX INFO: renamed from: ᩹ܽ */
    public final void m32597() {
        try {
            this.f40305 = true;
            AbstractC5390 abstractC5390 = this.f40275;
            abstractC5390.m11829();
            if (abstractC5390 instanceof C4816) {
                this.f40275 = new C4816(this, this.f40339, this.f40262);
            } else {
                if (!(abstractC5390 instanceof C18976)) {
                    throw new RuntimeException(String.valueOf(abstractC5390));
                }
                C18976 c18976 = new C18976(this, this.f40339, this.f40262, ((C18976) abstractC5390).m43130());
                this.f40275 = c18976;
                if (c18976.mo10196() == 0.0f) {
                    this.f40275.mo11827((int) abstractC5390.mo10196());
                }
            }
            while (this.f40275.mo11814()) {
                SystemClock.sleep(100L);
            }
            this.f40275.mo10191(abstractC5390.f12806);
            this.f40305 = false;
            m32187(m32454(getScrollX()), m32585(this.f40187), true);
            this.f40238 = -1.0f;
        } catch (Throwable th) {
            this.f40305 = false;
            m32187(m32454(getScrollX()), m32585(this.f40187), true);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32385(InterfaceC3299 interfaceC3299) {
        this.f40271 = interfaceC3299;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, this.f40187);
    }

    @Override // android.view.View
    public final void setScrollX(int i) {
        m32187(i, this.f40187, true);
    }

    /* JADX INFO: renamed from: ۡ֫ */
    public final int m32472() {
        return this.f40187;
    }

    @Override // android.view.View
    public final void setScrollY(int i) {
        m32187(getScrollX(), i, true);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        m32187(getScrollX() + i, this.f40187 + i2, true);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        if (this.f40293) {
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ܺ */
    private void m32306(int i, int i2) {
        AbstractC5390 abstractC5390;
        int scrollX = getScrollX();
        int i3 = this.f40187;
        boolean z = this.f40237;
        InterfaceC9768 interfaceC9768 = this.f40212;
        InterfaceC9768 interfaceC9769 = this.f40339;
        if (interfaceC9768 != interfaceC9769) {
            this.f40212 = interfaceC9769;
            this.f40237 = false;
        }
        if (Math.abs(i2) + ((long) getHeight()) > 65536 || ((abstractC5390 = this.f40275) != null && abstractC5390.f12815 == this.f40339 && abstractC5390.m11833() > 65536.0d)) {
            this.f40237 = true;
        }
        this.f40187 = i2;
        this.f40293 = true;
        try {
            super.scrollTo(i, this.f40237 ? 0 : i2);
            this.f40293 = false;
            if (i != scrollX || i2 != i3) {
                super.onScrollChanged(i, i2, scrollX, i3);
            }
            if (z == this.f40237 && i == scrollX && i2 == i3) {
                return;
            }
            invalidate();
        } catch (Throwable th) {
            this.f40293 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m32194(C14146 c14146, int i, int i2) {
        c14146.m32187(i, i2, true);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        m32187(i, i2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m32187(int i, int i2, boolean z) {
        int scrollX;
        int i3;
        if (z) {
            m32245();
            m32255();
            this.f40219.incrementAndGet();
        }
        if (this.f40305) {
            return;
        }
        InterfaceC3299 interfaceC3299 = this.f40271;
        if (interfaceC3299 != null) {
            scrollX = getScrollX();
            i3 = this.f40187;
        } else {
            scrollX = 0;
            i3 = 0;
        }
        try {
            m32306(i, i2);
            if (interfaceC3299 != null) {
                interfaceC3299.mo5747(scrollX, i3, i, i2);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m32456(int i, int i2) {
        m32245();
        m32255();
        this.f40219.incrementAndGet();
        this.f40224.removeMessages(1);
        if (!this.f40302.isFinished()) {
            this.f40302.forceFinished(true);
        }
        int scrollX = getScrollX();
        int i3 = this.f40187;
        if (scrollX == i && i3 == i2) {
            return;
        }
        if (scrollX != i) {
            i = m32454(i);
        }
        if (i3 != i2) {
            i2 = m32585(i2);
        }
        try {
            m32306(i, i2);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m32475(int i, int i2) {
        m32245();
        this.f40219.incrementAndGet();
        int scrollX = getScrollX();
        int i3 = this.f40187;
        if (i == -1) {
            i = this.f40302.isFinished() ? scrollX : this.f40302.getFinalX();
        }
        if (i2 == -1) {
            i2 = this.f40302.isFinished() ? i3 : this.f40302.getFinalY();
        }
        m32255();
        m32468();
        this.f40302.startScroll(scrollX, i3, i - scrollX, i2 - i3);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m32190(AbstractC5390 abstractC5390, boolean z) {
        int iM26496;
        int i;
        int i2;
        m32308();
        AbstractC5390 abstractC5391 = this.f40275;
        if (abstractC5391 != abstractC5390) {
            if (abstractC5391 != null) {
                abstractC5391.m11829();
            }
            m32316("Session layout changed");
        }
        if (abstractC5391 != null) {
            abstractC5390.mo10191(abstractC5391.f12806);
        }
        int iM32585 = 0;
        if (z && abstractC5391 != null && (abstractC5390 instanceof C4816)) {
            int iM11803 = abstractC5391.m11803(this.f40187 + 1);
            C13533 c13533 = abstractC5391.f12798.get(iM11803);
            i2 = c13533.f38061;
            i = c13533.f38063;
            iM26496 = (int) (this.f40187 - (this.f40262.m26496() * iM11803));
        } else {
            iM26496 = 0;
            i = 0;
            i2 = 0;
        }
        if (abstractC5391 != abstractC5390 && (abstractC5391 instanceof C18976)) {
            ((C18976) abstractC5391).m43129();
        }
        this.f40275 = abstractC5390;
        if (abstractC5390.mo10193()) {
            this.f40233 = new EdgeEffect(getContext());
            this.f40292 = new EdgeEffect(getContext());
            if (this.f40333) {
                C18439.m42005(this.f40233);
                C18439.m42005(this.f40292);
            }
        } else {
            this.f40233 = null;
            this.f40292 = null;
        }
        if (z && abstractC5391 != null && (abstractC5390 instanceof C4816)) {
            while (i < abstractC5390.f12798.size()) {
                C13533 c13534 = abstractC5390.f12798.get(i);
                if (c13534.f38061 == i2 || c13534.f38062 > i2) {
                    iM32585 = m32585(((int) (this.f40262.m26496() * i)) + iM26496);
                    break;
                }
                i++;
            }
            if (this.f40335 == null) {
                m32187(getScrollX(), iM32585, true);
            }
        }
        this.f40238 = -1.0f;
        m32235();
    }

    /* JADX INFO: renamed from: ۚ */
    public final void m32445(int i) {
        C23929 c23929 = this.f40262;
        c23929.m53010(c23929.f32005.getTextSize(), i);
        m32353();
        this.f40275.mo10206();
        this.f40238 = -1.0f;
        invalidate();
    }

    /* JADX INFO: renamed from: ᩺֫ */
    public static void m32352(C14146 c14146) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = c14146.f40233;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = c14146.f40233.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = c14146.f40320;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= c14146.f40320.isFinished();
        }
        EdgeEffect edgeEffect3 = c14146.f40292;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= c14146.f40292.isFinished();
        }
        EdgeEffect edgeEffect4 = c14146.f40206;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= c14146.f40206.isFinished();
        }
        if (zIsFinished) {
            int i = C1717.f57146;
            c14146.postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ᩺ܽ */
    public final void m32601() {
        this.f40280 = SystemClock.uptimeMillis();
        invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32394(InterfaceC10005 interfaceC10005) {
        this.f40255.add(interfaceC10005);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32396(C12491 c12491) {
        this.f40255.remove(c12491);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32375(int i, int i2) {
        if (m32583()) {
            return;
        }
        ArrayList arrayList = this.f40255;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((InterfaceC10005) arrayList.get(i3)).mo4046(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۗۧ */
    public final boolean m32434() {
        if (m32583()) {
            return true;
        }
        AbstractC5390 abstractC5390 = this.f40275;
        return abstractC5390 != null && abstractC5390.mo11814();
    }

    /* JADX INFO: renamed from: ۗ */
    public final String m32432() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Session diagnostics require the main thread");
        }
        StringBuilder sb = new StringBuilder("viewSize=");
        sb.append(getWidth());
        sb.append("x");
        sb.append(getHeight());
        sb.append("\nattached=");
        sb.append(isAttachedToWindow());
        sb.append("\npreparing=");
        sb.append(this.f40294);
        sb.append("\npreparingManual=");
        sb.append(this.f40304);
        sb.append("\nawaitingPrepareFinish=");
        sb.append(this.f40204);
        sb.append("\nrestoringInstanceState=");
        sb.append(this.f40321);
        sb.append("\ncancelPrepare=");
        sb.append(this.f40273);
        sb.append("\ncontentLoading=");
        sb.append(this.f40278);
        sb.append("\nlargeChange=");
        sb.append(m32583());
        sb.append("\npendingScroll=");
        boolean z = false;
        sb.append(this.f40261 != null);
        sb.append("\nlayout=");
        AbstractC5390 abstractC5390 = this.f40275;
        sb.append(abstractC5390 == null ? "null" : abstractC5390.getClass().getName());
        sb.append("\nlayoutLoading=");
        AbstractC5390 abstractC5391 = this.f40275;
        sb.append(abstractC5391 != null && abstractC5391.mo11814());
        sb.append("\ntextPrepared=");
        C16827 c16827 = this.f40194;
        if (c16827 != null && c16827.f49809) {
            z = true;
        }
        sb.append(z);
        sb.append("\nsoftWrap=");
        return C5410.m11876(this.f40217, "\n", sb);
    }

    /* JADX INFO: renamed from: ᩳܽ */
    public final boolean m32569() {
        if (m32583() || this.f40294 || this.f40204 || this.f40304 || this.f40321) {
            return false;
        }
        AbstractC5390 abstractC5390 = this.f40275;
        return abstractC5390.f12815 == this.f40339 && abstractC5390.m11801() && !this.f40275.f12798.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚᩳ */
    public boolean m32238() {
        return m32569() && !m32434() && !this.f40278 && this.f40261 == null && this.f40194 == null;
    }

    /* JADX INFO: renamed from: ܿ֫ */
    public final AbstractC23000 m32555() {
        return this.f40253;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m32561(int i, int i2) {
        AbstractC23000 abstractC23000 = this.f40253;
        if (abstractC23000 == null || !abstractC23000.m51383()) {
            AtomicInteger atomicInteger = this.f40303;
            atomicInteger.incrementAndGet();
            try {
                if (this.f40213) {
                    C8377 c8377 = this.f40196;
                    InterfaceC9768 interfaceC9768 = this.f40339;
                    c8377.getClass();
                    int i3 = i <= 0 ? 0 : i - 1;
                    int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC9768, '\n', i3);
                    if (iIndexOf == -1) {
                        iIndexOf = interfaceC9768.length();
                    }
                    StringBuilder sb = new StringBuilder(C23929.f75950);
                    for (int iLastIndexOf = TextUtils.lastIndexOf(interfaceC9768, '\n', i3) + 1; iLastIndexOf < iIndexOf; iLastIndexOf++) {
                        char cCharAt = interfaceC9768.charAt(iLastIndexOf);
                        if (cCharAt != ' ' && cCharAt != '\t') {
                            break;
                        }
                        sb.append(cCharAt);
                    }
                    interfaceC9768.replace(i, i2, sb.toString());
                    if (i != i2) {
                        interfaceC9768.setSelection(sb.length() + i);
                    }
                } else {
                    this.f40339.replace(i, i2, C23929.f75950);
                    if (i != i2) {
                        mo27941(i + 1);
                    }
                }
                invalidate();
            } finally {
                atomicInteger.decrementAndGet();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32377(TextWatcher textWatcher) {
        this.f40197.add(textWatcher);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32383(C2430 c2430) {
        C8123.m18820(this.f40197, c2430);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m32484(int i) {
        int iM11834 = this.f40275.m11834(i);
        if (this.f40275.mo10193()) {
            return iM11834;
        }
        try {
            return this.f40275.f12798.get(iM11834).f38063;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m32414(int i, int[] iArr) {
        if (i >= 0 && i <= this.f40339.length()) {
            if (iArr.length < 2) {
                throw new IllegalArgumentException("lineColumn.length < 2");
            }
            try {
                if (m32583()) {
                    C9729 c9729Mo28589 = this.f40339.mo28589();
                    try {
                        int iM22745 = c9729Mo28589.m22745(i);
                        iArr[0] = iM22745;
                        iArr[1] = i - c9729Mo28589.m22748(iM22745);
                        c9729Mo28589.close();
                        return true;
                    } catch (Throwable th) {
                        try {
                            c9729Mo28589.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                int iM49693 = this.f40275.f12798.m49693(this.f40275.m11834(i));
                iArr[0] = this.f40275.f12798.m49684(iM49693);
                iArr[1] = i - this.f40275.f12798.m49682(iM49693);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m32535(int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            try {
                if (m32583()) {
                    C9729 c9729Mo28589 = this.f40339.mo28589();
                    try {
                        if (i < c9729Mo28589.m22749()) {
                            long jM22748 = ((long) c9729Mo28589.m22748(i)) + ((long) i2);
                            int i3 = jM22748 > ((long) c9729Mo28589.length()) ? -1 : (int) jM22748;
                            c9729Mo28589.close();
                            return i3;
                        }
                        c9729Mo28589.close();
                        return -1;
                    } catch (Throwable th) {
                        try {
                            c9729Mo28589.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                C22076 c22076 = this.f40275.f12798;
                int iM49675 = c22076.m49675(i);
                int iM49693 = iM49675 == -1 ? -1 : c22076.m49693(iM49675);
                if (iM49693 != -1) {
                    long j = ((long) this.f40275.f12798.get(iM49693).f38061) + ((long) i2);
                    if (j <= this.f40339.length()) {
                        return (int) j;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX INFO: renamed from: ܽ */
    public final Point m32536(int i) {
        ?? Mo10193;
        int iM49682;
        int i2 = -1;
        if (m32583()) {
            int[] iArr = new int[2];
            return m32414(i, iArr) ? new Point(iArr[0] + 1, iArr[1] + 1) : new Point(-1, -1);
        }
        int iM11834 = this.f40275.m11834(i);
        try {
            Mo10193 = this.f40275.mo10193();
            try {
                if (Mo10193 != 0) {
                    int i3 = iM11834 + 1;
                    iM49682 = this.f40275.f12798.m49682(iM11834);
                    Mo10193 = i3;
                } else {
                    int iM49693 = this.f40275.f12798.m49693(iM11834);
                    int iM49684 = this.f40275.f12798.m49684(iM49693) + 1;
                    iM49682 = this.f40275.f12798.m49682(iM49693);
                    Mo10193 = iM49684;
                }
                i2 = (i - iM49682) + 1;
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            Mo10193 = -1;
        }
        return new Point(Mo10193, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32399(InterfaceC16176 interfaceC16176) {
        InterfaceC16176 interfaceC16177 = this.f40263;
        if (interfaceC16177 == interfaceC16176) {
            return;
        }
        if (this.f40268 != 0 && interfaceC16177 != null) {
            interfaceC16177.mo9277(false);
        }
        this.f40263 = interfaceC16176;
        if (this.f40268 == 0 || interfaceC16176 == null) {
            return;
        }
        interfaceC16176.mo9277(true);
    }

    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ void m32311(C14146 c14146) {
        InterfaceC16176 interfaceC16176;
        int i = c14146.f40268 + 1;
        c14146.f40268 = i;
        if (i != 1 || (interfaceC16176 = c14146.f40263) == null) {
            return;
        }
        interfaceC16176.mo9277(true);
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m32268(C14146 c14146) {
        InterfaceC16176 interfaceC16176;
        int i = c14146.f40268 - 1;
        c14146.f40268 = i;
        if (i != 0 || (interfaceC16176 = c14146.f40263) == null) {
            return;
        }
        interfaceC16176.mo9277(false);
    }

    /* JADX INFO: renamed from: ᩵ܽ */
    public final void m32580() {
        C22746 c22746M32344;
        if (m32434() || (c22746M32344 = m32344(m32508())) == null) {
            return;
        }
        C23416 c23416 = this.f40215;
        C22746 c22746M52094 = c23416.m52094();
        if (c22746M52094 != null && Math.abs(c22746M52094.f71724 - c22746M32344.f71724) <= 3) {
            c23416.m52095();
        }
        this.f40260.m52090();
        c23416.m52093(c22746M32344);
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m32519(int i, int i2) {
        if (m32434()) {
            return;
        }
        C22746 c22746M32344 = m32344(i);
        C22746 c22746M32345 = m32344(i2);
        if (c22746M32344 != null) {
            int i3 = c22746M32344.f71724;
            if (c22746M32345 == null || i3 == c22746M32345.f71724) {
                return;
            }
            C23416 c23416 = this.f40215;
            C22746 c22746M52094 = c23416.m52094();
            if (c22746M52094 != null && Math.abs(c22746M52094.f71724 - i3) <= 3) {
                c23416.m52095();
            }
            this.f40260.m52090();
            c23416.m52093(c22746M32344);
        }
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m32438() {
        return this.f40215.m52096();
    }

    /* JADX INFO: renamed from: ᩵ */
    public final boolean m32578() {
        return this.f40260.m52096();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m32559() {
        C22746 c22746M32344;
        if (m32434()) {
            return;
        }
        C23416 c23416 = this.f40215;
        if (c23416.m52096() && (c22746M32344 = m32344(m32508())) != null) {
            this.f40260.m52093(c22746M32344);
            m32212(c23416.m52095());
        }
    }

    /* JADX INFO: renamed from: ܽ֫ */
    public final void m32545() {
        C22746 c22746M32344;
        if (m32434()) {
            return;
        }
        C23416 c23416 = this.f40260;
        if (c23416.m52096() && (c22746M32344 = m32344(m32508())) != null) {
            this.f40215.m52093(c22746M32344);
            m32212(c23416.m52095());
        }
    }

    /* JADX INFO: renamed from: ᩸ */
    private C22746 m32344(int i) {
        int[] iArr = new int[2];
        if (m32414(i, iArr)) {
            return new C22746(iArr[0], iArr[1]);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m32212(C22746 c22746) {
        int i = c22746.f71724;
        int i2 = c22746.f71723;
        if (i < 0 || i2 < 0 || this.f40275.f12798.isEmpty()) {
            return;
        }
        int i3 = this.f40275.f12798.m49695().f38063;
        if (i > i3) {
            i = i3;
        }
        int iM32535 = m32535(i, i2);
        if (iM32535 == -1) {
            iM32535 = this.f40339.length();
        }
        this.f40339.setSelection(iM32535);
        this.f40238 = -1.0f;
        m32291();
        m32413(iM32535, false);
        m32601();
        requestFocus();
    }

    /* JADX INFO: renamed from: ۚ */
    public final boolean m32447() {
        return !m32505() && this.f40339.mo3999().m54767();
    }

    /* JADX INFO: renamed from: ֡ */
    public final boolean m32360() {
        return !m32505() && this.f40339.mo3999().m54765();
    }

    /* JADX INFO: renamed from: ܽᩳ */
    public final void m32548() {
        m32191(this.f40339, false);
    }

    /* JADX INFO: renamed from: ֡ܽ */
    public final void m32362() {
        m32191(this.f40339, true);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m32191(InterfaceC9768 interfaceC9768, boolean z) {
        InterfaceC9768 interfaceC9769 = this.f40339;
        try {
            boolean z2 = true;
            boolean z3 = (!this.f40228 || this.f40319 == null || this.f40319.f15339) ? false : true;
            if (m32505()) {
                return;
            }
            if (!m32434() || z3) {
                this.f40238 = -1.0f;
                if (this.f40228 || !interfaceC9768.mo3999().m54759(z)) {
                    z2 = false;
                }
                if (z2) {
                    m32426();
                }
                try {
                    if (z) {
                        interfaceC9768.mo3995();
                    } else {
                        interfaceC9768.mo3997();
                    }
                    if (z2) {
                        m32461();
                    }
                    if (this.f40339 != interfaceC9768) {
                        return;
                    }
                    this.f40297 = SystemClock.uptimeMillis();
                    m32291();
                    InterfaceC20853 interfaceC20853 = this.f40318;
                    if (interfaceC20853 != null) {
                        interfaceC20853.mo5042(this.f40339.isChanged());
                        this.f40318.mo5043(m32447(), m32360());
                    }
                    m32409(false);
                    invalidate();
                } catch (Throwable th) {
                    if (z2) {
                        m32461();
                    }
                    throw th;
                }
            }
        } catch (UncheckedIOException | C6138 e) {
            if (!m32421(interfaceC9769, e)) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ᩴܽ */
    public final void m32575() {
        m32565(false);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m32565(boolean z) {
        this.f40339.mo3999().m54746(z);
        InterfaceC20853 interfaceC20853 = this.f40318;
        if (interfaceC20853 != null) {
            interfaceC20853.mo5043(m32447(), m32360());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32402(InterfaceC20853 interfaceC20853) {
        this.f40318 = interfaceC20853;
    }

    /* JADX INFO: renamed from: ֨ܽ */
    public final void m32367() {
        this.f40339.mo3999().m54752();
        InterfaceC20853 interfaceC20853 = this.f40318;
        if (interfaceC20853 != null) {
            interfaceC20853.mo5043(m32447(), m32360());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32380(String str) {
        String string = C23929.m53007(str).toString();
        int iM32508 = m32508();
        int iM32512 = m32512();
        if (iM32508 > iM32512) {
            iM32512 = iM32508;
            iM32508 = iM32512;
        }
        this.f40339.replace(iM32508, iM32512, string);
        mo27941(string.length() + iM32508);
        m32409(false);
    }

    /* JADX INFO: renamed from: ᩳۧ */
    public final int m32568() {
        return this.f40262.m26504();
    }

    /* JADX INFO: renamed from: ܽۧ */
    public final int m32546() {
        return this.f40262.f76000;
    }

    /* JADX INFO: renamed from: ۢ֫ */
    public final int m32477() {
        return this.f40275.m11819() ? this.f40275.f12820.size() : this.f40275.f12798.size();
    }

    /* JADX INFO: renamed from: ֨֫ */
    public final int m32365() {
        if (!m32583()) {
            if (this.f40275.f12798.size() == 0) {
                return 1;
            }
            AbstractC5390 abstractC5390 = this.f40275;
            return abstractC5390.f12798.get(abstractC5390.f12798.size() - 1).f38063 + 1;
        }
        C9729 c9729Mo28589 = this.f40339.mo28589();
        try {
            int iM22749 = (int) c9729Mo28589.m22749();
            c9729Mo28589.close();
            return iM22749;
        } catch (Throwable th) {
            try {
                c9729Mo28589.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m32521(int i) {
        if (m32583()) {
            int iM32535 = m32535(i, 0);
            if (iM32535 >= 0) {
                mo27941(iM32535);
                return true;
            }
        } else if (i < m32365()) {
            C13533 c13533 = this.f40275.f12798.get(i);
            int i2 = i;
            while (c13533.f38063 < i) {
                i2++;
                c13533 = this.f40275.f12798.get(i2);
            }
            int i3 = c13533.f38061;
            m32519(m32508(), i3);
            mo27941(i3);
            m32413(i3, false);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m32551(boolean z) {
        this.f40213 = z;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m32587(boolean z) {
        this.f40254 = z;
    }

    /* JADX INFO: renamed from: ᩸ۧ */
    public final boolean m32593() {
        return this.f40254;
    }

    /* JADX INFO: renamed from: ۚ */
    public final void m32446(boolean z) {
        m32440();
        this.f40317 = z;
    }

    /* JADX INFO: renamed from: ۧܽ */
    public final boolean m32501() {
        return this.f40317;
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m32436(int i) {
        if (!m32583()) {
            if (i >= this.f40275.f12798.size()) {
                return;
            }
            C13533 c13533 = this.f40275.f12798.get(i);
            int i2 = i;
            while (c13533.f38063 < i && (i2 = i2 + 1) < this.f40275.f12798.size()) {
                c13533 = this.f40275.f12798.get(i2);
            }
            int i3 = c13533.f38061;
            int i4 = c13533.f38062;
            while (true) {
                i2++;
                if (i2 < this.f40275.f12798.size()) {
                    C13533 c13534 = this.f40275.f12798.get(i2);
                    if (c13534.f38063 != i) {
                        break;
                    } else {
                        i4 = c13534.f38062;
                    }
                } else {
                    break;
                }
            }
            mo27944(i3, i4);
            m32413(i3, false);
            return;
        }
        C9729 c9729Mo28589 = this.f40339.mo28589();
        if (i >= 0) {
            try {
                if (i < c9729Mo28589.m22749()) {
                    int iM22748 = c9729Mo28589.m22748(i);
                    int i5 = i + 1;
                    mo27944(iM22748, ((long) i5) < c9729Mo28589.m22749() ? c9729Mo28589.m22748(i5) - 1 : c9729Mo28589.length());
                    c9729Mo28589.close();
                    return;
                }
            } catch (Throwable th) {
                try {
                    c9729Mo28589.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        c9729Mo28589.close();
    }

    /* JADX INFO: renamed from: ۘ֫ */
    public final C4145 m32439() {
        return this.f40205;
    }

    /* JADX INFO: renamed from: ᩴۧ */
    public final void m32574() {
        int i = this.f40288 + 1;
        this.f40288 = i;
        this.f40244 = i;
        C21523 c21523 = this.f40285;
        if (c21523 == null || c21523.f67908.mo28581() == c21523.f67907) {
            return;
        }
        m32316("Session text changed before view was ready");
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m32520(boolean z) {
        if (z) {
            this.f40203.incrementAndGet();
        }
        this.f40339.mo3998(z);
        this.f40243 = z ? -1 : this.f40244;
        InterfaceC20853 interfaceC20853 = this.f40318;
        if (interfaceC20853 != null) {
            interfaceC20853.mo5042(z);
        }
    }

    /* JADX INFO: renamed from: ܺܽ */
    public final void m32534() {
        this.f40339.mo3998(false);
        this.f40243 = this.f40244;
        if (this.f40318 != null) {
            post(new Runnable() { // from class: l.ۖۛᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10336.f40318.mo5042(false);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ᩹ */
    public final C10123 m32594() {
        return new C10123(this);
    }

    /* JADX INFO: renamed from: ᩺ۧ */
    public final boolean m32600() {
        return (this.f40294 || this.f40204 || this.f40304 || this.f40321 || this.f40339.mo4003()) ? false : true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m32498(C10123 c10123) {
        return this.f40339 == c10123.f28067 && this.f40339.mo28581() == c10123.f28068 && this.f40244 == c10123.f28066 && this.f40203.get() == c10123.f28064 && this.f40262.f76018.equals(c10123.f28065);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m32422(C10123 c10123) {
        if (m32498(c10123)) {
            m32520(false);
            if (this.f40339 == c10123.f28067 && this.f40339.mo28581() == c10123.f28068 && this.f40244 == c10123.f28066 && !this.f40339.isChanged()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֡ۧ */
    public final boolean m32361() {
        return this.f40339.isChanged();
    }

    /* JADX INFO: renamed from: ᩴᩳ */
    private void m32333() {
        C23929 c23929 = this.f40262;
        if (c23929.f75988 && c23929.f75989) {
            boolean z = c23929.f76016;
            RectF rectF = this.f40299;
            if (z) {
                rectF.left -= this.f40275.f12800;
            } else {
                rectF.right += this.f40275.f12800;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32376(RectF rectF, int i) {
        this.f40275.m11823(rectF, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32409(boolean z) {
        if (m32583()) {
            return;
        }
        HandlerC15329 handlerC15329 = this.f40224;
        if (z) {
            handlerC15329.removeMessages(1);
            m32355(Selection.getSelectionEnd(this.f40339), true);
        } else {
            if (handlerC15329.hasMessages(1)) {
                return;
            }
            handlerC15329.sendEmptyMessage(1);
        }
    }

    /* JADX INFO: renamed from: ۠ܽ */
    public final void m32468() {
        this.f40224.removeMessages(1);
    }

    /* JADX INFO: renamed from: ֨ᩳ */
    private boolean m32183() {
        if (!m32569() || this.f40275.mo11814() || m32458() <= 0 || m32606() <= 0) {
            return false;
        }
        AbstractC5390 abstractC5390 = this.f40275;
        return !(abstractC5390 instanceof C18976) || ((C18976) abstractC5390).m43132(m32458());
    }

    /* JADX INFO: renamed from: ۡ */
    private boolean m32252(int i, int i2) {
        m32255();
        boolean zM32583 = m32583();
        OverScroller overScroller = this.f40302;
        AtomicInteger atomicInteger = this.f40219;
        if (zM32583) {
            atomicInteger.incrementAndGet();
            overScroller.forceFinished(true);
            this.f40335 = new C14816(this, i, i2);
            return false;
        }
        if (!m32569()) {
            return false;
        }
        atomicInteger.incrementAndGet();
        overScroller.forceFinished(true);
        if (m32183()) {
            return true;
        }
        this.f40335 = new C14816(this, i, i2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۡᩳ */
    public void m32255() {
        this.f40335 = null;
        if (this.f40313 != null) {
            this.f40313 = null;
            this.f40302.forceFinished(true);
        }
    }

    /* JADX INFO: renamed from: ܺᩳ */
    private void m32308() {
        if (this.f40313 == null) {
            return;
        }
        OverScroller overScroller = this.f40302;
        if (!overScroller.isFinished() && this.f40313.m33846(this)) {
            this.f40335 = this.f40313;
        }
        this.f40313 = null;
        overScroller.forceFinished(true);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m32265(int i, int i2, int i3, int i4) {
        this.f40313 = new C14816(this, i, i2);
        this.f40338 = false;
        this.f40302.startScroll(getScrollX(), this.f40187, i3 - getScrollX(), i4 - this.f40187);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻ᩳ */
    public boolean m32357() {
        C14816 c14816 = this.f40335;
        if (c14816 != null) {
            if (!c14816.m33846(this)) {
                m32255();
                return false;
            }
            if (m32183()) {
                C14816 c14817 = this.f40335;
                int i = c14817.f42263;
                int iMax = Math.max(0, Math.min(c14817.f42267, this.f40339.length()));
                m32255();
                if (i == 1) {
                    m32413(iMax, true);
                    return true;
                }
                if (i == 2) {
                    m32494(true);
                    return true;
                }
                if (i == 3) {
                    m32491(iMax, true);
                    return true;
                }
                if (i != 4) {
                    return true;
                }
                m32542(true);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m32428(int i) {
        if (this.f40335 == null && this.f40313 == null) {
            m32187(0, i, false);
        }
    }

    /* JADX INFO: renamed from: ܳۧ */
    public final int m32523() {
        return Math.min(this.f40262.f75984, Math.max(0, m32606() / 2));
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m32413(int i, boolean z) {
        this.f40224.removeMessages(1);
        return m32355(i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d5  */
    /* JADX INFO: renamed from: ᩻ */
    public boolean m32355(int i, boolean z) {
        boolean z2;
        int iM32585;
        int iM32454;
        if (!m32252(1, i)) {
            return false;
        }
        if (!z && (!isAttachedToWindow() || getVisibility() != 0)) {
            z = true;
        }
        this.f40302.forceFinished(true);
        try {
            this.f40275.mo10190(this.f40299, i);
            m32333();
            int scrollX = getScrollX();
            int iM32586 = this.f40187;
            int i2 = this.f40223;
            if (i2 != -1) {
                scrollX = m32454(i2);
                this.f40223 = -1;
                z2 = true;
            } else {
                z2 = false;
            }
            int i3 = this.f40259;
            if (i3 != -1) {
                iM32586 = m32585(i3);
                this.f40259 = -1;
                z2 = true;
            }
            if (this.f40275.mo10193()) {
                float fMax = Math.max(this.f40262.m26496(), this.f40262.f75956.getIntrinsicWidth());
                float f = this.f40299.left;
                float f2 = scrollX;
                if (f < f2 + fMax) {
                    iM32454 = m32454((int) (f - fMax));
                } else {
                    float fMax2 = Math.max(m32458() - fMax, 0.0f);
                    float f3 = this.f40299.right;
                    if (f3 > f2 + fMax2) {
                        iM32454 = m32454((int) (f3 - fMax2));
                    } else {
                        iM32454 = m32454(scrollX);
                        if (iM32454 == scrollX) {
                            scrollX = iM32454;
                        }
                    }
                }
                scrollX = iM32454;
                z2 = true;
            }
            float f4 = this.f40299.top;
            float f5 = iM32586;
            if (f4 < f5) {
                iM32585 = m32585((int) f4);
            } else {
                float fMax3 = Math.max(m32606() - m32523(), 0);
                float f6 = this.f40299.bottom;
                if (f6 > f5 + fMax3) {
                    iM32585 = m32585((int) (f6 - fMax3));
                } else {
                    iM32585 = m32585(iM32586);
                    if (iM32585 != iM32586) {
                    }
                    if (z2) {
                        if (z) {
                            m32187(scrollX, iM32585, true);
                        } else {
                            m32265(1, i, scrollX, iM32585);
                        }
                    }
                    postInvalidate();
                    return z2;
                }
            }
            z2 = true;
            if (z2) {
                if (z) {
                    m32187(scrollX, iM32585, true);
                } else {
                    m32265(1, i, scrollX, iM32585);
                }
            }
            postInvalidate();
            return z2;
        } catch (IndexOutOfBoundsException unused) {
            this.f40259 = -1;
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x007c  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ܶ */
    public void m32302(int i) {
        int iM32454;
        boolean z;
        if (!m32583() && this.f40275.mo10193()) {
            m32255();
            this.f40224.removeMessages(1);
            this.f40302.forceFinished(true);
            try {
                this.f40275.mo10190(this.f40299, i);
                m32333();
                int scrollX = getScrollX();
                float fMax = Math.max(this.f40262.m26496(), this.f40262.f75956.getIntrinsicWidth());
                float f = this.f40299.left;
                float f2 = scrollX;
                if (f < f2 + fMax) {
                    iM32454 = m32454((int) (f - fMax));
                } else {
                    float fMax2 = Math.max(m32458() - fMax, 0.0f);
                    float f3 = this.f40299.right;
                    if (f3 > f2 + fMax2) {
                        iM32454 = m32454((int) (f3 - fMax2));
                    } else {
                        int iM32455 = m32454(scrollX);
                        if (iM32455 != scrollX) {
                            iM32454 = iM32455;
                        } else {
                            iM32454 = iM32455;
                            z = false;
                        }
                        if (z) {
                            m32187(iM32454, this.f40187, true);
                            invalidate();
                        }
                    }
                }
                z = true;
                if (z) {
                    m32187(iM32454, this.f40187, true);
                    invalidate();
                }
            } catch (IndexOutOfBoundsException unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX INFO: renamed from: ۧ */
    public final void m32491(int i, boolean z) {
        boolean z2;
        int i2;
        this.f40224.removeMessages(1);
        if (m32252(3, i)) {
            if (!z && (!isAttachedToWindow() || getVisibility() != 0)) {
                z = true;
            }
            try {
                this.f40275.mo10190(this.f40299, i);
                m32333();
                int scrollX = getScrollX();
                int i3 = this.f40187;
                if (this.f40275.mo10193()) {
                    float fMax = Math.max(this.f40275.mo10195(), m32458() / 3);
                    float f = this.f40299.left;
                    float f2 = scrollX;
                    if (f < f2 + fMax) {
                        i2 = (int) (f - fMax);
                        if (i2 < 0) {
                            i2 = 0;
                        }
                    } else {
                        float fMax2 = Math.max(m32458() - fMax, 0.0f);
                        float f3 = this.f40299.right;
                        if (f3 > f2 + fMax2) {
                            i2 = (int) (f3 - fMax2);
                        } else {
                            z2 = false;
                            i2 = scrollX;
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                    i2 = scrollX;
                }
                RectF rectF = this.f40299;
                int iM32585 = m32585(Math.max((int) (((rectF.top + rectF.bottom) / 2.0f) - (m32606() / 2.0f)), (int) ((this.f40299.bottom + m32523()) - m32606())));
                if (iM32585 != i3) {
                    z2 = true;
                } else {
                    iM32585 = i3;
                }
                int iM32454 = m32454(i2);
                int iM32586 = m32585(iM32585);
                if (z2 | ((iM32454 == scrollX && iM32586 == i3) ? false : true)) {
                    if (z) {
                        m32187(iM32454, iM32586, true);
                    } else {
                        m32265(3, i, iM32454, iM32586);
                    }
                }
                postInvalidate();
            } catch (IndexOutOfBoundsException unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0080  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00df  */
    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:53:0x0105  */
    /* JADX WARN: Code duplicated, block: B:57:0x0117  */
    /* JADX WARN: Code duplicated, block: B:61:0x011e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0124  */
    /* JADX WARN: Code duplicated, block: B:66:0x0128  */
    /* JADX INFO: renamed from: ۧ */
    public final void m32494(boolean z) {
        boolean z2;
        int i;
        float f;
        float f2;
        float fMax;
        float f3;
        int i2;
        int iM32454;
        int iM32585;
        boolean z3;
        float f4;
        float f5;
        float fMax2;
        float f6;
        this.f40224.removeMessages(1);
        if (m32252(2, 0)) {
            if (!z && (!isAttachedToWindow() || getVisibility() != 0)) {
                z = true;
            }
            this.f40302.forceFinished(true);
            int iM32508 = m32508();
            int iM32512 = m32512();
            if (iM32508 == iM32512) {
                m32409(z);
                return;
            }
            if (iM32508 <= iM32512) {
                iM32512 = iM32508;
                iM32508 = iM32512;
            }
            int scrollX = getScrollX();
            int i3 = this.f40187;
            float fMo10195 = this.f40275.mo10195();
            this.f40275.mo10190(this.f40299, iM32508);
            m32333();
            if (this.f40275.mo10193()) {
                float f7 = this.f40299.left;
                float f8 = scrollX;
                if (f7 < f8 + fMo10195) {
                    scrollX = (int) (f7 - fMo10195);
                    z2 = true;
                    if (scrollX < 0) {
                        scrollX = 0;
                    }
                } else {
                    float fMax3 = Math.max(m32458() - fMo10195, 0.0f);
                    float f9 = this.f40299.right;
                    if (f9 > f8 + fMax3) {
                        scrollX = (int) (f9 - fMax3);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
            } else {
                z2 = false;
            }
            float f10 = this.f40299.top;
            float f11 = i3;
            if (f10 >= f11) {
                float fMax4 = Math.max(m32606() - m32523(), 0);
                float f12 = this.f40299.bottom;
                if (f12 > f11 + fMax4) {
                    i = (int) (f12 - fMax4);
                }
                this.f40275.mo10190(this.f40299, iM32512);
                m32333();
                if (this.f40275.mo10193()) {
                    f4 = this.f40299.left;
                    f5 = scrollX;
                    if (f4 < f5 + fMo10195) {
                        scrollX = (int) (f4 - fMo10195);
                        z2 = true;
                        if (scrollX < 0) {
                            scrollX = 0;
                        }
                    } else {
                        fMax2 = Math.max(m32458() - fMo10195, 0.0f);
                        f6 = this.f40299.right;
                        if (f6 > f5 + fMax2) {
                            scrollX = (int) (f6 - fMax2);
                            z2 = true;
                        }
                    }
                }
                f = this.f40299.top;
                f2 = i3;
                if (f < f2) {
                    fMax = Math.max(m32606() - m32523(), 0);
                    f3 = this.f40299.bottom;
                    if (f3 > f2 + fMax) {
                        i2 = (int) (f3 - fMax);
                    }
                    iM32454 = m32454(scrollX);
                    iM32585 = m32585(i3);
                    if (iM32454 == getScrollX() || iM32585 != this.f40187) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z2 | z3) {
                        if (z) {
                            m32187(iM32454, iM32585, true);
                        } else {
                            m32265(2, 0, iM32454, iM32585);
                        }
                    }
                    postInvalidate();
                }
                i2 = (int) f;
                i3 = i2;
                z2 = true;
                iM32454 = m32454(scrollX);
                iM32585 = m32585(i3);
                if (iM32454 == getScrollX()) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (z2 | z3) {
                    if (z) {
                        m32187(iM32454, iM32585, true);
                    } else {
                        m32265(2, 0, iM32454, iM32585);
                    }
                }
                postInvalidate();
            }
            i = (int) f10;
            i3 = i;
            z2 = true;
            this.f40275.mo10190(this.f40299, iM32512);
            m32333();
            if (this.f40275.mo10193()) {
                f4 = this.f40299.left;
                f5 = scrollX;
                if (f4 < f5 + fMo10195) {
                    scrollX = (int) (f4 - fMo10195);
                    z2 = true;
                    if (scrollX < 0) {
                        scrollX = 0;
                    }
                } else {
                    fMax2 = Math.max(m32458() - fMo10195, 0.0f);
                    f6 = this.f40299.right;
                    if (f6 > f5 + fMax2) {
                        scrollX = (int) (f6 - fMax2);
                        z2 = true;
                    }
                }
            }
            f = this.f40299.top;
            f2 = i3;
            if (f < f2) {
                fMax = Math.max(m32606() - m32523(), 0);
                f3 = this.f40299.bottom;
                if (f3 > f2 + fMax) {
                    i2 = (int) (f3 - fMax);
                }
                iM32454 = m32454(scrollX);
                iM32585 = m32585(i3);
                if (iM32454 == getScrollX()) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (z2 | z3) {
                    if (z) {
                        m32187(iM32454, iM32585, true);
                    } else {
                        m32265(2, 0, iM32454, iM32585);
                    }
                }
                postInvalidate();
            }
            i2 = (int) f;
            i3 = i2;
            z2 = true;
            iM32454 = m32454(scrollX);
            iM32585 = m32585(i3);
            if (iM32454 == getScrollX()) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (z2 | z3) {
                if (z) {
                    m32187(iM32454, iM32585, true);
                } else {
                    m32265(2, 0, iM32454, iM32585);
                }
            }
            postInvalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX INFO: renamed from: ܽ */
    public final void m32542(boolean z) {
        boolean z2;
        int iM32585;
        this.f40224.removeMessages(1);
        if (m32252(4, 0)) {
            if (!z && (!isAttachedToWindow() || getVisibility() != 0)) {
                z = true;
            }
            this.f40302.forceFinished(true);
            int iM32508 = m32508();
            int iM32512 = m32512();
            if (iM32508 == iM32512) {
                m32491(iM32508, z);
                return;
            }
            if (iM32508 <= iM32512) {
                iM32512 = iM32508;
                iM32508 = iM32512;
            }
            int scrollX = getScrollX();
            int i = this.f40187;
            float fMax = Math.max(this.f40275.mo10195(), m32458() / 3);
            this.f40275.mo10190(this.f40299, iM32508);
            m32333();
            float f = this.f40299.bottom;
            if (this.f40275.mo10193()) {
                float f2 = this.f40299.left;
                float f3 = scrollX;
                if (f2 < f3 + fMax) {
                    scrollX = (int) (f2 - fMax);
                    if (scrollX < 0) {
                        scrollX = 0;
                    }
                } else {
                    float fMax2 = Math.max(m32458() - fMax, 0.0f);
                    float f4 = this.f40299.right;
                    if (f4 > f3 + fMax2) {
                        scrollX = (int) (f4 - fMax2);
                    } else {
                        z2 = false;
                    }
                }
                z2 = true;
            } else {
                z2 = false;
            }
            this.f40275.mo10190(this.f40299, iM32512);
            m32333();
            float f5 = this.f40299.top;
            if (this.f40275.mo10193()) {
                float f6 = this.f40299.left;
                float f7 = scrollX;
                if (f6 < f7 + fMax) {
                    scrollX = (int) (f6 - fMax);
                    if (scrollX < 0) {
                        scrollX = 0;
                    }
                } else {
                    float fMax3 = Math.max(m32458() - fMax, 0.0f);
                    float f8 = this.f40299.right;
                    if (f8 > f7 + fMax3) {
                        scrollX = (int) (f8 - fMax3);
                    }
                }
                z2 = true;
            }
            if (f - f5 >= m32606() ? (iM32585 = m32585((int) f5)) != this.f40187 : (iM32585 = m32585((int) (((f5 + f) / 2.0f) - (m32606() / 2.0f)))) != this.f40187) {
                i = iM32585;
                z2 = true;
            }
            int iM32454 = m32454(scrollX);
            int iM32586 = m32585(i);
            if (((iM32454 == getScrollX() && iM32586 == this.f40187) ? false : true) | z2) {
                if (z) {
                    m32187(iM32454, iM32586, true);
                } else {
                    m32265(4, 0, iM32454, iM32586);
                }
            }
            postInvalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۬ᩳ */
    public void m32291() {
        this.f40329 = -1;
        this.f40315 = -1;
    }

    /* JADX INFO: renamed from: ᩴ */
    public void mo27941(int i) {
        BaseInputConnection.removeComposingSpans(this.f40339);
        this.f40339.setSelection(i);
        m32291();
        this.f40238 = -1.0f;
        invalidate();
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo27944(int i, int i2) {
        BaseInputConnection.removeComposingSpans(this.f40339);
        this.f40339.setSelection(i, i2);
        m32291();
        this.f40238 = -1.0f;
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0027  */
    /* JADX INFO: renamed from: ᩵ */
    public final void m32576(int i) {
        if (i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException();
        }
        int i2 = this.f40217;
        if (i2 != i) {
            if (i2 == 0 || i == 0) {
                m32190(AbstractC5390.m11789(this, this.f40339, this.f40262, i), true);
            } else {
                AbstractC5390 abstractC5390 = this.f40275;
                if (!(abstractC5390 instanceof C18976)) {
                    m32190(AbstractC5390.m11789(this, this.f40339, this.f40262, i), true);
                } else {
                    ((C18976) abstractC5390).m43127(i == 1);
                }
            }
            this.f40217 = i;
            m32428(this.f40187);
            invalidate();
        }
    }

    /* JADX INFO: renamed from: ᩵ */
    public final void m32577(boolean z) {
        C23929 c23929 = this.f40262;
        if (c23929.f75986 != z) {
            c23929.f75986 = z;
            AbstractC5390 abstractC5390 = this.f40275;
            if (abstractC5390 instanceof C18976) {
                C18976 c18976 = (C18976) abstractC5390;
                c18976.m43127(c18976.m43130());
                m32428(this.f40187);
                invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ۛ֫ */
    public final int m32452() {
        return this.f40217;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m32539(float f) {
        m32488(f * this.f40262.f32000);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32373(float f) {
        if (f < 0.8f || f > 2.0f) {
            throw new IllegalArgumentException("Line spacing must be between 0.8 and 2.0");
        }
        if (this.f40262.m26512() == f) {
            return;
        }
        this.f40302.forceFinished(true);
        float fM26496 = this.f40262.m26496();
        double d = fM26496 > 0.0f ? ((double) this.f40187) / ((double) fM26496) : 0.0d;
        this.f40219.incrementAndGet();
        this.f40262.mo26489(f);
        AbstractC5390 abstractC5390 = this.f40275;
        if (abstractC5390 instanceof C4816) {
            ((C4816) abstractC5390).m10201();
        }
        m32353();
        m32456(getScrollX(), m32585((int) Math.min(2147483647L, Math.round(d * ((double) this.f40262.m26496())))));
        this.f40238 = -1.0f;
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: ۜۧ */
    public final float m32459() {
        C23929 c23929 = this.f40262;
        return c23929.f32005.getTextSize() / c23929.f32000;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m32488(float f) {
        this.f40262.m53015(f);
        m32353();
        this.f40275.mo10206();
        this.f40238 = -1.0f;
        invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32374(float f, int i) {
        C23929 c23929 = this.f40262;
        c23929.m53010(f * c23929.f32000, i);
        m32353();
        this.f40275.mo10206();
        this.f40238 = -1.0f;
        invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32381(String str, boolean z) {
        if (!this.f40304 && !this.f40321) {
            this.f40267 = null;
        }
        this.f40252.m20548();
        if (str == null) {
            str = "Text";
        }
        if (this.f40252.m20530(str)) {
            this.f40252.m20527((CharSequence) this.f40339);
            C23929 c23929 = this.f40262;
            c23929.f76022 = str;
            c23929.f75992 = true;
        } else if (str.startsWith(".") && this.f40252.m20518(str)) {
            this.f40252.m20527((CharSequence) this.f40339);
            C23929 c239210 = this.f40262;
            c239210.f76022 = str;
            c239210.f75992 = true;
        } else {
            this.f40262.f75992 = false;
        }
        if (this.f40262.f75992 && this.f40252.m20523()) {
            this.f40332.m54661(this.f40252.m20536());
        } else {
            this.f40332.m54661(C24894.f79502);
        }
        this.f40275.mo11828();
        m32469();
        if (z) {
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: ܽܽ */
    public final boolean m32547() {
        if ((!m32583() || m32443()) && !this.f40294) {
            return ((this.f40204 && this.f40257 != this.f40235) || this.f40304 || this.f40321) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۛۧ */
    public final boolean m32453() {
        return (((!this.f40294 || !this.f40204) && (!m32583() || m32443())) || this.f40304 || this.f40321) ? false : true;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m32553(int i, int i2) {
        if (m32583() || !this.f40275.mo11835(i, i2)) {
            return false;
        }
        if (this.f40258) {
            return true;
        }
        m32469();
        invalidate();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m32423(int[] iArr) {
        return m32221(iArr, false, 0, 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m32412(int i, int i2, int[] iArr) {
        return m32221(iArr, true, i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m32221(int[] iArr, boolean z, int i, int i2) {
        if (iArr == null || (iArr.length & 1) != 0) {
            throw new IllegalArgumentException("Invalid syntax dirty ranges");
        }
        boolean z2 = this.f40258;
        this.f40258 = true;
        try {
            return m32280(iArr, z, i, i2);
        } finally {
            this.f40258 = z2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m32220(boolean z, int i, int i2, int i3, int i4, int i5, int i6) {
        C24894 c24894;
        boolean z2 = this.f40258;
        this.f40258 = true;
        try {
            if (!(m32553(i, i2) && (i3 < 0 || m32553(i3, i4)))) {
                return false;
            }
            if (!z2) {
                if (z && (c24894 = this.f40332) != null) {
                    c24894.m54658(m32508(), m32512(), i5, i6);
                } else {
                    m32469();
                }
                invalidate();
            }
            return true;
        } finally {
            this.f40258 = z2;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m32280(int[] iArr, boolean z, int i, int i2) {
        boolean zM32220;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 3;
            if (i4 >= iArr.length) {
                if (i3 >= iArr.length) {
                    return true;
                }
                if (z) {
                    return m32220(true, iArr[i3], iArr[i3 + 1], -1, -1, i, i2);
                }
                return m32553(iArr[i3], iArr[i3 + 1]);
            }
            if (!z) {
                zM32220 = m32220(false, iArr[i3], iArr[i3 + 1], iArr[i3 + 2], iArr[i4], 0, 0);
            } else {
                zM32220 = m32220(true, iArr[i3], iArr[i3 + 1], iArr[i3 + 2], iArr[i4], i, i2);
            }
            if (!zM32220) {
                return false;
            }
            i3 += 4;
        }
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m32429(boolean z) {
        this.f40262.m26506(z);
        this.f40238 = -1.0f;
    }

    /* JADX INFO: renamed from: ֡ */
    public final void m32359(boolean z) {
        this.f40262.m26509(z);
        this.f40238 = -1.0f;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final void m32571(boolean z) {
        C23929 c23929 = this.f40262;
        if (c23929.f75988 != z) {
            c23929.f75988 = z;
        }
        this.f40238 = -1.0f;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m32605(boolean z) {
        C23929 c23929 = this.f40262;
        if (c23929.f75989 != z) {
            c23929.f75989 = z;
        }
        this.f40238 = -1.0f;
    }

    /* JADX INFO: renamed from: ۠֫ */
    public final int m32466() {
        return this.f40192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨᩳ */
    public void m32285() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            post(new RunnableC16670(0, this));
        } else {
            setPadding(getPaddingLeft(), getPaddingTop() - this.f40192, getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        C23929 c23929 = this.f40262;
        int iMax = Math.max(0, (c23929 == null ? 0 : (int) Math.ceil(Math.max(0.0f, c23929.m26508() - c23929.m26513()))) - i2);
        this.f40192 = iMax;
        super.setPadding(i, i2 + iMax, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩺ᩳ */
    public void m32353() {
        m32285();
        C10676 c10676 = this.f40242;
        if (c10676 != null) {
            c10676.m24582(this.f40262.m26496());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖᩳ */
    public void m32226() {
        C10676 c10676 = this.f40242;
        if (c10676 != null) {
            c10676.m24581();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m32264(int i, int i2, int i3) {
        if (isInEditMode()) {
            return;
        }
        if (this.f40242 == null) {
            this.f40242 = new C10676(this);
            m32353();
        }
        this.f40242.m24583(i, i2, i3);
    }

    /* JADX INFO: renamed from: ۫ܽ */
    public final void m32510() {
        this.f40214 = false;
    }

    /* JADX INFO: renamed from: ۠ۧ */
    public final boolean m32467() {
        return this.f40214;
    }

    /* JADX INFO: renamed from: ᩳ֫ */
    public final AbstractActivityC5549 m32567() {
        return this.f40222;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ۧۛᩳ] */
    /* JADX INFO: renamed from: ֫ */
    public final void m32382(ArrayList arrayList) {
        arrayList.addAll(C6846.m15686());
        arrayList.add(new C5272(this, new InterfaceC1489() { // from class: l.ۧۛᩳ
            @Override // p067l.InterfaceC1489
            public final void accept(Object obj) {
                TextKeyListener textKeyListener = C14146.f40186;
                this.f35513.m32470(R.string.MT_Protector);
            }
        }));
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m32470(int i) {
        int i2;
        AbstractActivityC5549 abstractActivityC5549 = this.f40222;
        if (i == R.string.MT_Protector) {
            abstractActivityC5549.m12269().m4835(this);
            return;
        }
        if (i == R.string.MT_Protector) {
            C16353.m37157(this);
            return;
        }
        if (i == R.string.MT_Protector) {
            i2 = android.R.id.startSelectingText;
        } else if (i == 17039373) {
            i2 = android.R.id.selectAll;
        } else if (i == 17039363) {
            i2 = android.R.id.cut;
        } else {
            if (i == 17039361) {
                int iM32508 = m32508();
                int iM32512 = m32512();
                int iMin = Math.min(iM32508, iM32512);
                int iMax = Math.max(iM32508, iM32512);
                if (iMin == iMax || !m32416(this.f40339.subSequence(iMin, iMax))) {
                    return;
                }
                mo27941(iM32512);
                m32409(false);
                m32464();
                return;
            }
            if (i == 17039371) {
                i2 = android.R.id.paste;
            } else {
                if (i == R.string.MT_Protector) {
                    InterfaceC23850 interfaceC23850 = this.f40208;
                    if (interfaceC23850 != null) {
                        interfaceC23850.mo13664();
                    }
                } else if (i == R.string.MT_Protector) {
                    if (this.f40208 != null) {
                        int iM32509 = m32508();
                        int iM32513 = m32512();
                        int iMin2 = Math.min(iM32509, iM32513);
                        int iMax2 = Math.max(iM32509, iM32513);
                        C23929 c23929 = this.f40262;
                        c23929.f75975 = iMin2;
                        c23929.f75954 = iMax2;
                        mo27941(iMin2);
                        this.f40208.mo13671(true, true);
                        m32529();
                        return;
                    }
                } else {
                    if (i == R.string.MT_Protector) {
                        getContext().startActivity(new Intent(getContext(), (Class<?>) ActivityC11800.class));
                        return;
                    }
                    if (i == R.string.MT_Protector) {
                        C24204.m53510(this);
                        return;
                    }
                    if (i == R.string.MT_Protector) {
                        int iM325010 = m32508();
                        int iM32514 = m32512();
                        this.f40339.delete(Math.min(iM325010, iM32514), Math.max(iM325010, iM32514));
                        invalidate();
                    } else {
                        if (i == R.string.MT_Protector) {
                            try {
                                String strM32442 = m32442();
                                if (strM32442 != null) {
                                    Intent intent = new Intent();
                                    intent.setAction("android.intent.action.SEND");
                                    intent.putExtra("android.intent.extra.TEXT", strM32442);
                                    intent.setType("text/plain");
                                    getContext().startActivity(Intent.createChooser(intent, null));
                                    return;
                                }
                                return;
                            } catch (Exception e) {
                                Throwable cause = e;
                                while (!TransactionTooLargeException.class.isInstance(cause)) {
                                    cause = cause.getCause();
                                    if (cause == null) {
                                        if (abstractActivityC5549 != null) {
                                            abstractActivityC5549.m12259(e, (DialogInterface.OnDismissListener) null);
                                            return;
                                        } else {
                                            C22682.m50795((CharSequence) e.toString());
                                            return;
                                        }
                                    }
                                }
                                C22682.m50793(R.string.MT_Protector);
                                return;
                            }
                        }
                        if (i == R.string.MT_Protector) {
                            try {
                                C8898.m20502(abstractActivityC5549, this.f40339, this.f40272.m37073(), this.f40272.m37072(), Integer.parseInt(this.f40272.m37074().m51551().split("\\|")[1]));
                            } catch (Exception e2) {
                                abstractActivityC5549.m12259(e2, (DialogInterface.OnDismissListener) null);
                            }
                        } else if (i == R.string.MT_Protector) {
                            String strM32443 = m32442();
                            if (strM32443 != null) {
                                String strM20989 = C9072.m20989(strM32443);
                                if (abstractActivityC5549 == null) {
                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(strM20989));
                                    intent2.addFlags(268435456);
                                    try {
                                        C7050.m16232().startActivity(intent2);
                                        return;
                                    } catch (Throwable th) {
                                        C22682.m50795((CharSequence) th.toString());
                                        return;
                                    }
                                }
                                abstractActivityC5549.m12273(strM20989);
                                return;
                            }
                            return;
                        }
                    }
                }
                i2 = -1;
            }
        }
        if (i2 > 0) {
            m32530(i2);
        }
    }

    /* JADX INFO: renamed from: ᩷֫ */
    public final C4404 m32588() {
        return this.f40200;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32384(InterfaceC2746 interfaceC2746) {
        this.f40316 = interfaceC2746;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m32278(MotionEvent motionEvent) {
        return (motionEvent.getSource() & C0719o.a.f2912r) == 8194;
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m32279(int[] iArr) {
        int i;
        int i2;
        if (!isInEditMode()) {
            if (this.f40328 == null) {
                C9688 c9688 = new C9688(this);
                c9688.m22595(4500);
                c9688.m22593(new InterfaceC15722() { // from class: l.ܰۤᩳ
                    @Override // p067l.InterfaceC15722
                    public final void onMenuItemClick(MenuItem menuItem) {
                        TextKeyListener textKeyListener = C14146.f40186;
                        C14146 c14146 = this.f44139;
                        c14146.getClass();
                        CharSequence title = menuItem.getTitle();
                        if (title instanceof C17833) {
                            ((C17833) title).m40496().mo10846(c14146);
                        }
                    }
                });
                this.f40328 = c9688;
            }
            this.f40328.m22597();
            this.f40328.m22592((C8072) null);
            ArrayList<AbstractC5094> arrayList = new ArrayList();
            InterfaceC2746 interfaceC2746 = this.f40316;
            if (interfaceC2746 != null) {
                interfaceC2746.mo3487(arrayList);
            }
            boolean z = (m32434() || this.f40262.f75997) ? false : true;
            boolean z2 = this.f40339.length() == 0;
            int iM32508 = m32508();
            int iM32512 = m32512();
            if (iM32508 > iM32512) {
                i2 = iM32508;
                i = iM32512;
            } else {
                i = iM32508;
                i2 = iM32512;
            }
            if (iArr != null) {
                iArr[0] = i;
                iArr[1] = i2;
            }
            ArrayList arrayList2 = new ArrayList();
            Map mapM15688 = C6846.m15688();
            for (AbstractC5094 abstractC5094 : arrayList) {
                Integer num = (Integer) mapM15688.get(abstractC5094.mo10845());
                if (num != null && abstractC5094.mo10847(this, z, z2, i, i2)) {
                    C14382 c14382M22587 = this.f40328.m22587(abstractC5094.mo10848(), num.intValue());
                    c14382M22587.m32990(abstractC5094.mo10844(getContext()));
                    if (num.intValue() >= 300) {
                        c14382M22587.m32989();
                    }
                    if (abstractC5094.mo10849()) {
                        arrayList2.add(abstractC5094);
                    }
                }
            }
            if (!this.f40328.m22596()) {
                if (!arrayList2.isEmpty()) {
                    this.f40328.m22592(new C8072(0, arrayList2));
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ed  */
    /* JADX INFO: renamed from: ֨ */
    public final void m32363(int i) {
        boolean z;
        boolean z2;
        int[] iArr = new int[2];
        if (m32279(iArr)) {
            boolean z3 = false;
            int i2 = iArr[0];
            int i3 = iArr[1];
            RectF rectF = this.f40281;
            Rect rect = this.f40340;
            getWindowVisibleDisplayFrame(rect);
            getLocationOnScreen(this.f40266);
            int i4 = rect.top;
            int i5 = this.f40266[1];
            int i6 = i4 - i5;
            int i7 = rect.bottom - i5;
            if (i != -1) {
                z = true;
            } else {
                if (this.f40275.m11813(rectF)) {
                    rectF.left = ((rectF.left + rectF.right) / 2.0f) + 1.0f;
                    i = -2;
                } else {
                    this.f40275.m11823(rectF, i2);
                    if (rectF.top - this.f40187 < 0.0f || rectF.bottom - this.f40187 > m32606()) {
                        if (i2 != i3) {
                            try {
                                this.f40275.m11823(rectF, i3);
                            } catch (IndexOutOfBoundsException unused) {
                            }
                            if (rectF.top - this.f40187 >= 0.0f && rectF.bottom - this.f40187 <= m32606()) {
                                i = i3;
                                z = false;
                            }
                        }
                        i = -1;
                    } else {
                        i = i2;
                    }
                }
                z = true;
            }
            if (i == -1) {
                this.f40328.m22589(C23223.m51760(0.8f, 0.86f));
                this.f40328.m22591(getWidth() / 2, (this.f40328.m22594() + getHeight()) / 2);
                return;
            }
            if (i >= 0) {
                this.f40275.mo10190(rectF, i);
            }
            rectF.offset(getPaddingLeft(), getPaddingTop());
            if (i != i3 || i2 == i3 || this.f40275.m11838(i2, i3)) {
                z2 = false;
            } else {
                z2 = true;
                z = false;
            }
            if (z) {
                if ((rectF.top - this.f40187) - this.f40328.m22594() >= i6) {
                    z3 = z;
                }
            } else if ((rectF.bottom - this.f40187) + this.f40328.m22594() + this.f40262.f75956.getIntrinsicHeight() > i7) {
                z3 = true;
            } else {
                z3 = z;
            }
            boolean z4 = (z3 || !mo27924() || ((float) getHeight()) - (rectF.bottom - ((float) this.f40187)) >= ((float) C13076.m29939(92.0f))) ? z3 : true;
            if (z4 && z2) {
                this.f40328.m22589(C23223.m51760(0.8f, 0.86f));
            }
            int scrollX = ((int) rectF.left) - getScrollX();
            int intrinsicHeight = z4 ? ((int) rectF.top) - this.f40187 : this.f40262.f75956.getIntrinsicHeight() + this.f40328.m22594() + (((int) rectF.bottom) - this.f40187);
            if (scrollX < 0 || scrollX > getWidth()) {
                scrollX = getWidth() / 2;
            }
            if (intrinsicHeight < i6 || intrinsicHeight > i7) {
                intrinsicHeight = getHeight() / 2;
            }
            this.f40328.m22591(scrollX, intrinsicHeight);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m32562(int i, boolean z) {
        int[] iArrM32544 = m32544(i, z);
        m32519(m32508(), iArrM32544[0]);
        mo27944(iArrM32544[0], iArrM32544[1]);
    }

    /* JADX INFO: renamed from: ܽ */
    public final int[] m32544(int i, boolean z) {
        int[] iArrM20531;
        C8898 c8898 = this.f40252;
        if (c8898.m20524() && (iArrM20531 = c8898.m20531(i)) != null) {
            return iArrM20531;
        }
        int[] iArrM32243 = m32243(i, z);
        int i2 = iArrM32243[0];
        int i3 = iArrM32243[1];
        if (i2 == i3) {
            return iArrM32243;
        }
        String strSubstring = TextUtils.substring(this.f40339, i2, i3);
        BreakIterator breakIterator = this.f40270;
        breakIterator.setText(strSubstring);
        int i4 = i - i2;
        try {
            int iPreceding = breakIterator.preceding(i4);
            if (iPreceding < 0) {
                iPreceding = 0;
            }
            int next = breakIterator.next();
            iArrM32243[0] = iPreceding + i2;
            iArrM32243[1] = i2 + next;
            return iArrM32243;
        } catch (Exception unused) {
            int i5 = i4 + i2;
            iArrM32243[0] = i5;
            iArrM32243[1] = i5;
            return iArrM32243;
        }
    }

    /* JADX INFO: renamed from: ۜ */
    private int[] m32243(int i, boolean z) {
        int i2;
        int length;
        int iM11834 = this.f40275.m11834(i);
        if (iM11834 != 0) {
            C13533 c13533 = this.f40275.f12798.get(iM11834);
            int i3 = c13533.f38061;
            int i4 = c13533.f38063;
            int i5 = iM11834 - 1;
            while (true) {
                if (i5 >= 0) {
                    C13533 c13534 = this.f40275.f12798.get(i5);
                    if (c13534.f38063 != i4) {
                        if (z) {
                            i2 = c13534.f38062;
                            break;
                        }
                    } else {
                        i3 = c13534.f38061;
                        if (Math.abs(i - i3) <= 10000) {
                            i5--;
                        }
                    }
                }
                i2 = i3;
                break;
            }
        } else {
            i2 = 0;
        }
        if (iM11834 == this.f40275.f12798.size() - 1) {
            length = this.f40339.length();
        } else {
            C13533 c13535 = this.f40275.f12798.get(iM11834);
            int i6 = c13535.f38062;
            int i7 = c13535.f38063;
            do {
                iM11834++;
                if (iM11834 >= this.f40275.f12798.size()) {
                    break;
                }
                C13533 c13536 = this.f40275.f12798.get(iM11834);
                if (c13536.f38063 == i7) {
                    i6 = c13536.f38062;
                } else if (z) {
                    length = c13536.f38061;
                }
            } while (Math.abs(i6 - i) <= 10000);
            length = i6;
        }
        return new int[]{i2, length};
    }

    /* JADX INFO: renamed from: ۧۧ */
    public final InterfaceC9768 m32500() {
        return this.f40339;
    }

    /* JADX INFO: renamed from: ܿ */
    private void m32317(InterfaceC9768 interfaceC9768) {
        boolean z;
        if (!mo27938()) {
            interfaceC9768.mo3999().m54766(0L);
        }
        synchronized (this.f40277) {
            z = this.f40339 != interfaceC9768;
            if (z) {
                this.f40261 = null;
                m32255();
                this.f40219.incrementAndGet();
            }
            if (z) {
                this.f40264 = null;
                this.f40269 = null;
                this.f40251 = 0L;
                this.f40319 = null;
            }
            this.f40339 = interfaceC9768;
        }
        if (z) {
            AbstractC5390 abstractC5390 = this.f40275;
            if (abstractC5390 != null) {
                abstractC5390.m11829();
            }
            m32316("Session view owner changed");
            if (this.f40289.isEmpty()) {
                return;
            }
            C7050.m16212(new RunnableC9966(0, this));
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m32324(InterfaceC9768 interfaceC9768) {
        synchronized (this.f40247) {
            Iterator it = this.f40247.iterator();
            while (it.hasNext()) {
                if (((InterfaceC9768) it.next()) == interfaceC9768) {
                    return;
                }
            }
            this.f40247.add(interfaceC9768);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙᩳ */
    public void m32235() {
        AbstractC5390 abstractC5390;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C7050.m16212(new RunnableC22707(0, this));
            return;
        }
        synchronized (this.f40247) {
            int size = this.f40247.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                InterfaceC9768 interfaceC9768 = (InterfaceC9768) this.f40247.get(size);
                if (interfaceC9768 != this.f40339 && ((abstractC5390 = this.f40275) == null || interfaceC9768 != abstractC5390.f12815)) {
                    this.f40247.remove(size);
                    interfaceC9768.mo14910(false);
                }
            }
        }
        if (this.f40188 && !this.f40294 && this.f40275.f12815 == this.f40339) {
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ܿܽ */
    public final boolean m32557() {
        return this.f40211;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32400(AbstractC17043 abstractC17043) {
        if (this.f40339.mo4005()) {
            return;
        }
        InterfaceC9768 interfaceC9768 = this.f40339;
        if (interfaceC9768 instanceof C6495) {
            throw new IllegalStateException("Session already owns storage");
        }
        C2628 c2628 = (C2628) interfaceC9768;
        while (this.f40339 == c2628 && !this.f40211) {
            int iMo28581 = c2628.mo28581();
            long jMo4004 = c2628.mo4004();
            C7836 c7836M18121 = C7836.m18121(abstractC17043);
            try {
                C16195 c16195M54775 = c2628.mo3999().m54775();
                try {
                    c7836M18121.mo3999().m54744(c16195M54775);
                    c7836M18121.mo4001(c2628.mo4004());
                    c7836M18121.m18122();
                    c16195M54775.close();
                    if (m32216(c2628, c7836M18121, iMo28581, jMo4004)) {
                        return;
                    } else {
                        c7836M18121.mo4006();
                    }
                } catch (Throwable th) {
                    try {
                        c16195M54775.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException | Error | RuntimeException e) {
                c7836M18121.close();
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۬ */
    public final FutureC5767 m32511() {
        InterfaceC9768 interfaceC9768 = this.f40339;
        if (!(interfaceC9768 instanceof C7836)) {
            return FutureC5767.m12882(null);
        }
        C7836 c7836 = (C7836) interfaceC9768;
        return c7836.m4002().m12897(new RunnableC10637(0, this, c7836), C4081.f8988);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m32203(C14146 c14146, C7836 c7836) {
        while (c14146.f40339 == c7836 && !c14146.f40211) {
            try {
                if (c14146.m32216(c7836, C2628.m3988(c7836), c7836.mo28581(), c7836.mo4004())) {
                    break;
                }
            } catch (IOException e) {
                throw new C15154(e);
            }
        }
        try {
            c7836.mo4006();
        } catch (IOException e2) {
            throw new C15154(e2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m32200(C14146 c14146, C2628 c2628, C2628 c2629) {
        C8801 c8801 = c14146.f40265;
        c2628.mo3991(c14146.f40249);
        c2628.mo3990(c2629.mo3989());
        for (Object obj : c2629.getSpans(0, c2629.length(), Object.class)) {
            if (obj != c8801 && obj != Selection.SELECTION_START && obj != Selection.SELECTION_END) {
                c2628.setSpan(obj, c2629.getSpanStart(obj), c2629.getSpanEnd(obj), c2629.getSpanFlags(obj));
            }
        }
        c2628.setFilters(c2629.getFilters());
        c2628.setSpan(c8801, 0, c2628.length(), 8388626);
        c14146.m32317(c2628);
    }

    /* JADX INFO: renamed from: ܿᩳ */
    public final void m32558() {
        if (this.f40202) {
            return;
        }
        if (this.f40339.length() != 0 || (this.f40339 instanceof C6495)) {
            throw new IllegalStateException("Memory text mode must be selected before loading text");
        }
        this.f40202 = true;
        m32323((CharSequence) new C2628(""));
        ComponentCallbacks2 componentCallbacks2M17221 = C7453.m17221(getContext());
        if (componentCallbacks2M17221 instanceof InterfaceC24784) {
            ((InterfaceC24784) componentCallbacks2M17221).getLifecycle().mo21806(new C14659(new WeakReference(this)));
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private InterfaceC9768 m32309(CharSequence charSequence) {
        if (!this.f40202 || (charSequence instanceof C2628) || (charSequence instanceof C6495)) {
            return charSequence instanceof InterfaceC9768 ? (InterfaceC9768) charSequence : new C2628(charSequence);
        }
        return new C2628(charSequence);
    }

    /* JADX INFO: renamed from: ᩷ܽ */
    public final int m32590() {
        return this.f40339.length();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32403(C21405 c21405) {
        synchronized (this.f40234) {
            m32276(c21405);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32404(final C21405 c21405, final Runnable runnable) {
        synchronized (this.f40199) {
            this.f40199.addLast(new Runnable() { // from class: l.᩷ۛᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    C14146.m32208(this.f69350, c21405, runnable);
                }
            });
            if (this.f40322 == null) {
                m32288();
            }
        }
    }

    /* JADX INFO: renamed from: ۫ᩳ */
    private void m32288() {
        C22864 c22864;
        synchronized (this.f40199) {
            this.f40322 = null;
            if (this.f40319 == null && ((c22864 = this.f40239) == null || !c22864.f71993)) {
                Runnable runnable = (Runnable) this.f40199.pollFirst();
                this.f40322 = runnable;
                if (runnable != null) {
                    try {
                        C4081.f8987.submit(runnable);
                    } catch (RuntimeException e) {
                        this.f40199.addFirst(this.f40322);
                        this.f40322 = null;
                        throw e;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m32217(final InterfaceC9768 interfaceC9768, final AbstractC5390 abstractC5390, final AbstractC5390 abstractC5391, final int i) {
        boolean zBooleanValue;
        FutureTask futureTask = new FutureTask(new Callable() { // from class: l.֡ۛᩳ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C14146.m32186(this.f4278, interfaceC9768, abstractC5390, abstractC5391, i);
            }
        });
        if (Looper.myLooper() == Looper.getMainLooper()) {
            futureTask.run();
        } else {
            C7050.m16212(futureTask);
        }
        boolean z = false;
        while (true) {
            try {
                try {
                    zBooleanValue = ((Boolean) futureTask.get()).booleanValue();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    }
                    if (cause instanceof Error) {
                        throw ((Error) cause);
                    }
                    throw new RuntimeException(cause);
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Boolean m32186(C14146 c14146, InterfaceC9768 interfaceC9768, AbstractC5390 abstractC5390, AbstractC5390 abstractC5391, int i) {
        synchronized (c14146.f40277) {
            if (c14146.f40339 == interfaceC9768 && c14146.f40275 == abstractC5390 && abstractC5391.m11801()) {
                c14146.f40217 = i;
                c14146.m32190(abstractC5391, true);
                c14146.f40252.m20533(interfaceC9768);
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m32276(final C21405 c21405) {
        AbstractC5390 abstractC5390;
        if (c21405.f67517 != this.f40262.m26512()) {
            FutureTask futureTask = new FutureTask(new Callable() { // from class: l.ۘۛᩳ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    TextKeyListener textKeyListener = C14146.f40186;
                    C14146 c14146 = this.f14657;
                    c14146.getClass();
                    c14146.m32373(c21405.f67517);
                    return null;
                }
            });
            if (Looper.myLooper() == Looper.getMainLooper()) {
                futureTask.run();
            } else {
                C7050.m16212(futureTask);
            }
            boolean z = false;
            while (true) {
                try {
                    try {
                        futureTask.get();
                        break;
                    } catch (Throwable th) {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (InterruptedException unused) {
                    z = true;
                } catch (ExecutionException e) {
                    throw new IllegalStateException("Cannot apply line spacing", e.getCause());
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        this.f40224.removeMessages(1);
        this.f40302.forceFinished(true);
        this.f40238 = -1.0f;
        this.f40252.m20520();
        m32346();
        this.f40294 = true;
        boolean z2 = c21405.f67504;
        AbstractC5390 abstractC5391 = null;
        if (z2 != c21405.f67512) {
            if (z2) {
                m32381(c21405.f67502, false);
            } else {
                m32381((String) null, false);
            }
        }
        int i = c21405.f67509;
        boolean z3 = (i == c21405.f67514 && c21405.f67522 == c21405.f67523 && (i != 1 || C12826.equals(c21405.f67518, c21405.f67516))) ? false : true;
        boolean z4 = c21405.f67521;
        C23929 c23929 = this.f40262;
        boolean z5 = z4 != c23929.f75988;
        boolean z6 = c21405.f67524 != c23929.m26511();
        boolean z7 = c21405.f67505 != this.f40262.m26482();
        boolean z8 = c21405.f67510;
        C23929 c239210 = this.f40262;
        boolean z9 = z8 != c239210.f75986;
        int i2 = c21405.f67519;
        int i3 = this.f40217;
        boolean z10 = i2 != i3 || (i3 != 0 && z9);
        boolean z11 = c21405.f67507 != c239210.m26497();
        if (!z3 && !z5 && !z6 && !z7 && !z10 && !z11) {
            this.f40294 = false;
            this.f40252.m20546(this.f40339);
            m32229();
            m32295(this.f40187, false);
            return;
        }
        if (z3) {
            C23929 c239211 = this.f40262;
            c239211.m53010(c21405.f67522 * c239211.f32000, c21405.f67509);
            m32353();
        }
        if (z5) {
            this.f40262.f75988 = c21405.f67521;
        }
        if (z6) {
            this.f40262.m26506(c21405.f67524);
        }
        if (z7) {
            this.f40262.m26509(c21405.f67505);
        }
        if (z9) {
            this.f40262.f75986 = c21405.f67510;
        }
        if (z11) {
            this.f40262.m26490(c21405.f67507);
        }
        if (z3 || z6 || z7 || z10 || z11 || (z5 && c21405.f67519 != 0)) {
            int i4 = c21405.f67519;
            for (int i5 = 0; i5 < 2; i5++) {
                InterfaceC9768 interfaceC9768 = this.f40339;
                interfaceC9768.setReadOnly(true);
                try {
                    AbstractC5390 abstractC5392 = this.f40275;
                    abstractC5392.mo10198();
                    AbstractC5390 abstractC5390M11789 = AbstractC5390.m11789(this, interfaceC9768, this.f40262, i4);
                    if (!m32217(interfaceC9768, abstractC5392, abstractC5390M11789, i4)) {
                        abstractC5390M11789.mo10198();
                        interfaceC9768.setReadOnly(false);
                    } else {
                        interfaceC9768.setReadOnly(false);
                        abstractC5391 = abstractC5390M11789;
                        break;
                    }
                } catch (Throwable th2) {
                    interfaceC9768.setReadOnly(false);
                    throw th2;
                }
            }
            abstractC5390 = abstractC5391;
        } else {
            abstractC5390 = this.f40275;
        }
        if (abstractC5390 == null && m32583()) {
            this.f40217 = c21405.f67519;
        }
        if (abstractC5390 instanceof C18976) {
            final C18976 c18976 = (C18976) abstractC5390;
            post(new Runnable() { // from class: l.ᩴۛᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    TextKeyListener textKeyListener = C14146.f40186;
                    C14146 c14146 = this.f60860;
                    int iM32458 = c14146.m32458();
                    AbstractC5390 abstractC5393 = c14146.f40275;
                    C18976 c18977 = c18976;
                    if (abstractC5393 != c18977 || iM32458 <= 0 || c18977.mo10196() == iM32458) {
                        return;
                    }
                    c18977.mo11827(iM32458);
                }
            });
        }
        this.f40294 = false;
        this.f40252.m20546(this.f40339);
        m32229();
        m32295(this.f40187, false);
    }

    /* JADX INFO: renamed from: ᩶ۧ */
    public final boolean m32583() {
        C6100 c6100 = this.f40319;
        return c6100 != null && c6100.f15330 == this.f40339;
    }

    /* JADX INFO: renamed from: ۙۧ */
    public final boolean m32443() {
        C6100 c6100 = this.f40319;
        return c6100 != null && c6100.f15329 != null && c6100.f15329.f17535 && this.f40275 == c6100.f15329.f17534 && c6100.m13891(this.f40275) && this.f40275.mo10186(new C6731(getScrollX(), this.f40187, m32458(), m32606())) > 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m32496(AbstractC5390 abstractC5390) {
        C6100 c6100 = this.f40319;
        if (m32543(abstractC5390)) {
            return true;
        }
        return c6100 != null && c6100.m13891(abstractC5390);
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m32554(AbstractC5390 abstractC5390) {
        C6100 c6100 = this.f40319;
        C16827 c16827 = this.f40194;
        if (c16827 == null || c16827.f49806 == null || c16827.f49806.f17534 != abstractC5390) {
            return (c6100 == null || c6100.f15329 == null || c6100.f15329.f17534 != abstractC5390) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c4, code lost:
    
        if (r0 == false) goto L67;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m32411(int i, int i2, int i3, int i4) {
        boolean z;
        if (m32583()) {
            this.f40319.m13887(i, i2, i3, i4);
            return true;
        }
        if (!this.f40211 && this.f40319 == null && (i2 != 0 || i3 != 0)) {
            this.f40251 = ((long) i2) + ((long) i3) + this.f40251;
            if (!this.f40231) {
                this.f40231 = true;
                C7050.m16212(new RunnableC24165(0, this));
            }
            boolean z2 = this.f40275.mo11814() || this.f40294 || this.f40304 || this.f40204 || this.f40321 || this.f40275.m11825() != i4;
            if (!this.f40228 && !z2 && this.f40251 < 100000) {
                AbstractC5390 abstractC5390 = this.f40275;
                if (abstractC5390 instanceof C18976) {
                    C18976 c18976 = (C18976) abstractC5390;
                    if (!c18976.f12837.f75988 || c18976.f12821.mo27920() || Math.max(c18976.m11826(), c18976.f12815.length()) < 100000) {
                        z = false;
                    } else {
                        C9729 c9729Mo28589 = c18976.f12815.mo28589();
                        try {
                            float length = String.valueOf(c9729Mo28589.m22749()).length() + 1;
                            C23929 c23929 = c18976.f12837;
                            z = ((int) ((length + c23929.f75979) * c23929.f75970)) != c18976.f12800;
                            c9729Mo28589.close();
                        } catch (Throwable th) {
                            try {
                                c9729Mo28589.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }
            }
            C6100 c6100 = new C6100(this, this.f40339, this.f40275);
            this.f40319 = c6100;
            c6100.m13887(i, i2, i3, i4);
            m32468();
            this.f40302.forceFinished(true);
            MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            try {
                this.f40274.m5650(motionEventObtain);
                motionEventObtain.recycle();
                ViewOnTouchListenerC18840.m42908(this.f40232);
                this.f40275.m11829();
                this.f40190.m19807(this.f40339);
                this.f40252.m20520();
                this.f40332.m54669();
                postInvalidate();
                C7050.m16212(new RunnableC13437(c6100));
                return true;
            } catch (Throwable th3) {
                motionEventObtain.recycle();
                throw th3;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static /* synthetic */ void m32325(C14146 c14146) {
        c14146.f40231 = false;
        if (c14146.f40228) {
            return;
        }
        c14146.f40251 = 0L;
    }

    /* JADX INFO: renamed from: ֫ۧ */
    public static void m32223(C14146 c14146) {
        synchronized (c14146.f40199) {
            if (c14146.f40322 == null) {
                c14146.m32288();
            }
        }
    }

    /* JADX INFO: renamed from: ᩻ܽ */
    public final C20182 m32608() {
        return m32602(this.f40217);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C20182 m32602(int i) {
        C20182 c20182;
        synchronized (this.f40262) {
            Typeface typeface = this.f40262.f32005.getTypeface();
            float textSize = this.f40262.f32005.getTextSize();
            float textScaleX = this.f40262.f32005.getTextScaleX();
            float textSkewX = this.f40262.f32005.getTextSkewX();
            int iM26497 = this.f40262.m26497();
            boolean zM26511 = this.f40262.m26511();
            boolean zM26482 = this.f40262.m26482();
            boolean z = i != 0 && this.f40262.f75988;
            C23929 c23929 = this.f40262;
            c20182 = new C20182(typeface, textSize, textScaleX, textSkewX, iM26497, zM26511, zM26482, z, c23929.f76016, c23929.f75989, c23929.f75986, i, this.f40252.m20550());
        }
        return c20182;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸ᩳ */
    public void m32346() {
        C5429 c5429 = new C5429();
        c5429.f12954 = -1;
        c5429.f12950 = -1L;
        this.f40267 = c5429;
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m32476(boolean z) {
        if (z) {
            m32346();
        }
        this.f40304 = z;
        if (z) {
            this.f40252.m20520();
        } else {
            this.f40267 = null;
            this.f40252.m20538(this.f40339);
        }
        postInvalidate();
        if (z) {
            return;
        }
        m32229();
    }

    /* JADX INFO: renamed from: ۧ֫ */
    public final void m32499() {
        this.f40304 = false;
        this.f40252.m20546(this.f40339);
        m32295(this.f40187, false);
        postInvalidate();
        m32229();
    }

    /* JADX INFO: renamed from: ֫ */
    public final CharSequence m32369(CharSequence charSequence, InterfaceC18588 interfaceC18588) {
        try {
            return m32263((AbstractC17043) null, interfaceC18588, charSequence);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32401(AbstractC17043 abstractC17043, CharSequence charSequence) {
        m32370(abstractC17043, new C11308(), charSequence);
    }

    /* JADX INFO: renamed from: ֫ */
    public final CharSequence m32370(AbstractC17043 abstractC17043, InterfaceC18588 interfaceC18588, CharSequence charSequence) {
        if (this.f40211 || interfaceC18588.mo3924()) {
            return charSequence;
        }
        if (!this.f40211 && abstractC17043 != null) {
            InterfaceC9768 interfaceC9768 = this.f40339;
            if ((interfaceC9768 instanceof C7836) && ((C7836) interfaceC9768).m18123(abstractC17043)) {
                m32511().m12907();
            }
        }
        return m32263(abstractC17043, interfaceC18588, charSequence);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a0 A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:102:0x01a8 A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:104:0x01bd A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01c1 A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01ca A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:117:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0089 A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x009a A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ae A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b3 A[Catch: all -> 0x0203, TRY_LEAVE, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00e2 A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e9 A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:69:0x011d A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:72:0x012b A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:79:0x013f A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0153 A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0167 A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0172 A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0180 A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0198 A[Catch: all -> 0x0203, TryCatch #0 {all -> 0x0203, blocks: (B:13:0x002b, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:21:0x0041, B:24:0x0049, B:25:0x004f, B:27:0x0053, B:29:0x0057, B:34:0x0063, B:36:0x0067, B:38:0x006b, B:41:0x0072, B:42:0x0079, B:43:0x007a, B:45:0x007e, B:47:0x0083, B:51:0x00a6, B:53:0x00ae, B:57:0x00cd, B:59:0x00d1, B:61:0x00d5, B:63:0x00db, B:64:0x00e2, B:66:0x00e9, B:67:0x00ec, B:69:0x011d, B:70:0x0120, B:72:0x012b, B:74:0x012f, B:77:0x0137, B:79:0x013f, B:80:0x014d, B:82:0x0153, B:84:0x015b, B:86:0x016e, B:88:0x0172, B:90:0x0176, B:94:0x0180, B:95:0x0188, B:97:0x0198, B:98:0x019b, B:100:0x01a0, B:106:0x01c1, B:108:0x01ca, B:110:0x01ce, B:112:0x01d2, B:114:0x01d8, B:102:0x01a8, B:104:0x01bd, B:85:0x0167, B:54:0x00b3, B:55:0x00b7, B:122:0x01ed, B:123:0x01f0, B:49:0x0089, B:50:0x009a), top: B:133:0x002b }] */
    /* JADX INFO: renamed from: ۧ */
    private CharSequence m32263(AbstractC17043 abstractC17043, InterfaceC18588 interfaceC18588, CharSequence charSequence) {
        C16827 c16827;
        int iMo3989;
        C7836 c7836M18121;
        InterfaceC9768 interfaceC9768;
        InterfaceC9768 interfaceC9769;
        InterfaceC9768 interfaceC97610;
        InterfaceC9768 interfaceC97611;
        int length;
        InterfaceC9768 interfaceC9768M32309;
        C6495 c6495;
        if (this.f40211 || interfaceC18588.mo3924()) {
            return charSequence;
        }
        synchronized (this.f40277) {
            this.f40273 = false;
            m32346();
            this.f40294 = true;
            this.f40235++;
            this.f40204 = true;
        }
        postInvalidate();
        this.f40252.m20520();
        try {
            if (!this.f40275.mo10193()) {
                while (getWidth() <= 0) {
                    if (!this.f40273 && !this.f40211 && !interfaceC18588.mo3924()) {
                        SystemClock.sleep(10L);
                    }
                }
                if (!this.f40273 && !this.f40211 && !interfaceC18588.mo3924()) {
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    c16827 = this.f40194;
                    if (c16827 != null && (charSequence != c16827.f49811 || this.f40275 != c16827.f49805)) {
                        throw new IllegalStateException("Session layout preparation was superseded");
                    }
                    if (charSequence instanceof C6495) {
                        c6495 = (C6495) charSequence;
                        if (c16827 != null || c16827.f49810.f12122 == null) {
                            this.f40262.f76018 = c6495.mo3999().m54753().m16594();
                        }
                    } else {
                        this.f40262.f76018 = C23929.m53008(charSequence);
                        charSequence = C23929.m53007(charSequence);
                    }
                    iMo3989 = this.f40339.mo3989();
                    if (abstractC17043 == null) {
                        c7836M18121 = C7836.m18121(abstractC17043);
                        try {
                            c7836M18121.replace(0, c7836M18121.length(), charSequence);
                            c7836M18121.mo3999().m54752();
                            c7836M18121.mo3998(false);
                            c7836M18121.m18122();
                            interfaceC9768 = c7836M18121;
                        } catch (Error | RuntimeException e) {
                            c7836M18121.close();
                            throw e;
                        }
                    } else {
                        interfaceC9768M32309 = m32309(charSequence);
                    }
                    if (abstractC17043 == null && (this.f40273 || this.f40211 || interfaceC18588.mo3924())) {
                        interfaceC9768 = interfaceC9768M32309;
                        interfaceC9768 = interfaceC9768M32309;
                        interfaceC9768 = interfaceC9768M32309;
                        ((C7836) interfaceC9768).close();
                    } else {
                        interfaceC9768 = interfaceC9768M32309;
                        interfaceC9768 = interfaceC9768M32309;
                        interfaceC9769 = this.f40339;
                        m32317(interfaceC9768);
                        if (interfaceC9769 != interfaceC9768) {
                            m32324(interfaceC9769);
                        }
                        this.f40190.m19807(this.f40339);
                        this.f40252.m20521();
                        this.f40332.m54669();
                        this.f40339.mo3991(this.f40249);
                        this.f40339.mo3990(iMo3989);
                        InterfaceC9768 interfaceC97612 = this.f40339;
                        interfaceC97612.setSpan(this.f40265, 0, interfaceC97612.length(), 8388626);
                        interfaceC97610 = this.f40339;
                        if (!(interfaceC97610 instanceof C6495)) {
                            interfaceC97610.setSelection(0);
                        }
                        this.f40238 = -1.0f;
                        m32291();
                        if (!this.f40273 && !this.f40211 && !interfaceC18588.mo3924()) {
                            if (this.f40252.m20523()) {
                                this.f40252.m20527((CharSequence) this.f40339);
                                this.f40252.m20551(this.f40339);
                            }
                            if (!this.f40262.f75992 && this.f40252.m20524()) {
                                this.f40332.m54661(this.f40252.m20536());
                            } else {
                                this.f40332.m54661(C24894.f79502);
                            }
                            if (!this.f40273 && !this.f40211 && !interfaceC18588.mo3924()) {
                                if (c16827 != null) {
                                    c16827.f49813 = this.f40339.mo28581();
                                }
                                this.f40275.mo10199(this.f40339);
                                m32574();
                                interfaceC97611 = this.f40339;
                                if (!(interfaceC97611 instanceof C6495)) {
                                    interfaceC97611.mo3998(true);
                                }
                                this.f40243 = -1;
                                if (c16827 != null || !c16827.f49810.m11018()) {
                                    length = this.f40339.length();
                                    int i = SharedPreferencesOnSharedPreferenceChangeListenerC23180.f72813;
                                    if (length > C7050.f18355.getInt("smooth_mode_threshold", 200000)) {
                                        this.f40317 = true;
                                    }
                                }
                                if (c16827 == null) {
                                    m32295(Math.max(0, 0), true);
                                }
                                if (c16827 != null && !this.f40273 && !this.f40211 && !interfaceC18588.mo3924()) {
                                    c16827.f49809 = true;
                                }
                                this.f40294 = false;
                                m32235();
                                m32229();
                                if (!this.f40273) {
                                    postInvalidate();
                                }
                                return charSequence;
                            }
                        }
                    }
                }
            } else if (!this.f40273) {
                if (charSequence == null) {
                    charSequence = "";
                }
                c16827 = this.f40194;
                if (c16827 != null) {
                    throw new IllegalStateException("Session layout preparation was superseded");
                }
                if (charSequence instanceof C6495) {
                    c6495 = (C6495) charSequence;
                    if (c16827 != null) {
                        this.f40262.f76018 = c6495.mo3999().m54753().m16594();
                    } else {
                        this.f40262.f76018 = c6495.mo3999().m54753().m16594();
                    }
                } else {
                    this.f40262.f76018 = C23929.m53008(charSequence);
                    charSequence = C23929.m53007(charSequence);
                }
                iMo3989 = this.f40339.mo3989();
                if (abstractC17043 == null) {
                    c7836M18121 = C7836.m18121(abstractC17043);
                    c7836M18121.replace(0, c7836M18121.length(), charSequence);
                    c7836M18121.mo3999().m54752();
                    c7836M18121.mo3998(false);
                    c7836M18121.m18122();
                    interfaceC9768 = c7836M18121;
                } else {
                    interfaceC9768M32309 = m32309(charSequence);
                }
                if (abstractC17043 == null) {
                    interfaceC9768 = interfaceC9768M32309;
                    interfaceC9768 = interfaceC9768M32309;
                    interfaceC9769 = this.f40339;
                    m32317(interfaceC9768);
                    if (interfaceC9769 != interfaceC9768) {
                        m32324(interfaceC9769);
                    }
                    this.f40190.m19807(this.f40339);
                    this.f40252.m20521();
                    this.f40332.m54669();
                    this.f40339.mo3991(this.f40249);
                    this.f40339.mo3990(iMo3989);
                    InterfaceC9768 interfaceC97613 = this.f40339;
                    interfaceC97613.setSpan(this.f40265, 0, interfaceC97613.length(), 8388626);
                    interfaceC97610 = this.f40339;
                    if (!(interfaceC97610 instanceof C6495)) {
                        interfaceC97610.setSelection(0);
                    }
                    this.f40238 = -1.0f;
                    m32291();
                    if (!this.f40273) {
                        if (this.f40252.m20523()) {
                            this.f40252.m20527((CharSequence) this.f40339);
                            this.f40252.m20551(this.f40339);
                        }
                        if (!this.f40262.f75992) {
                            this.f40332.m54661(C24894.f79502);
                        } else {
                            this.f40332.m54661(C24894.f79502);
                        }
                        if (!this.f40273) {
                            if (c16827 != null) {
                                c16827.f49813 = this.f40339.mo28581();
                            }
                            this.f40275.mo10199(this.f40339);
                            m32574();
                            interfaceC97611 = this.f40339;
                            if (!(interfaceC97611 instanceof C6495)) {
                                interfaceC97611.mo3998(true);
                            }
                            this.f40243 = -1;
                            if (c16827 != null) {
                                length = this.f40339.length();
                                int i2 = SharedPreferencesOnSharedPreferenceChangeListenerC23180.f72813;
                                if (length > C7050.f18355.getInt("smooth_mode_threshold", 200000)) {
                                    this.f40317 = true;
                                }
                            } else {
                                length = this.f40339.length();
                                int i3 = SharedPreferencesOnSharedPreferenceChangeListenerC23180.f72813;
                                if (length > C7050.f18355.getInt("smooth_mode_threshold", 200000)) {
                                    this.f40317 = true;
                                }
                            }
                            if (c16827 == null) {
                                m32295(Math.max(0, 0), true);
                            }
                            if (c16827 != null) {
                                c16827.f49809 = true;
                            }
                            this.f40294 = false;
                            m32235();
                            m32229();
                            if (!this.f40273) {
                                postInvalidate();
                            }
                            return charSequence;
                        }
                    }
                } else {
                    interfaceC9768 = interfaceC9768M32309;
                    interfaceC9768 = interfaceC9768M32309;
                    interfaceC9769 = this.f40339;
                    m32317(interfaceC9768);
                    if (interfaceC9769 != interfaceC9768) {
                        m32324(interfaceC9769);
                    }
                    this.f40190.m19807(this.f40339);
                    this.f40252.m20521();
                    this.f40332.m54669();
                    this.f40339.mo3991(this.f40249);
                    this.f40339.mo3990(iMo3989);
                    InterfaceC9768 interfaceC97614 = this.f40339;
                    interfaceC97614.setSpan(this.f40265, 0, interfaceC97614.length(), 8388626);
                    interfaceC97610 = this.f40339;
                    if (!(interfaceC97610 instanceof C6495)) {
                        interfaceC97610.setSelection(0);
                    }
                    this.f40238 = -1.0f;
                    m32291();
                    if (!this.f40273) {
                        if (this.f40252.m20523()) {
                            this.f40252.m20527((CharSequence) this.f40339);
                            this.f40252.m20551(this.f40339);
                        }
                        if (!this.f40262.f75992) {
                            this.f40332.m54661(C24894.f79502);
                        } else {
                            this.f40332.m54661(C24894.f79502);
                        }
                        if (!this.f40273) {
                            if (c16827 != null) {
                                c16827.f49813 = this.f40339.mo28581();
                            }
                            this.f40275.mo10199(this.f40339);
                            m32574();
                            interfaceC97611 = this.f40339;
                            if (!(interfaceC97611 instanceof C6495)) {
                                interfaceC97611.mo3998(true);
                            }
                            this.f40243 = -1;
                            if (c16827 != null) {
                                length = this.f40339.length();
                                int i4 = SharedPreferencesOnSharedPreferenceChangeListenerC23180.f72813;
                                if (length > C7050.f18355.getInt("smooth_mode_threshold", 200000)) {
                                    this.f40317 = true;
                                }
                            } else {
                                length = this.f40339.length();
                                int i5 = SharedPreferencesOnSharedPreferenceChangeListenerC23180.f72813;
                                if (length > C7050.f18355.getInt("smooth_mode_threshold", 200000)) {
                                    this.f40317 = true;
                                }
                            }
                            if (c16827 == null) {
                                m32295(Math.max(0, 0), true);
                            }
                            if (c16827 != null) {
                                c16827.f49809 = true;
                            }
                            this.f40294 = false;
                            m32235();
                            m32229();
                            if (!this.f40273) {
                                postInvalidate();
                            }
                            return charSequence;
                        }
                    }
                }
            }
            this.f40267 = null;
            this.f40204 = false;
            this.f40252.m20508();
            this.f40294 = false;
            m32235();
            m32229();
            return charSequence;
        } catch (Throwable th) {
            this.f40267 = null;
            this.f40204 = false;
            this.f40252.m20508();
            this.f40294 = false;
            m32235();
            m32229();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private void m32295(int i, boolean z) {
        if (Looper.myLooper() != Looper.getMainLooper() && this.f40262.f75992 && this.f40252.m20524()) {
            if (z || !(this.f40294 || this.f40304 || this.f40321)) {
                InterfaceC9768 interfaceC9768 = this.f40339;
                AbstractC5390 abstractC5390 = this.f40275;
                long j = this.f40235;
                while (abstractC5390.mo11814()) {
                    try {
                        if (interfaceC9768 != this.f40339 || j != this.f40235) {
                            return;
                        }
                        if (z && this.f40273) {
                            return;
                        } else {
                            Thread.sleep(10L);
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                synchronized (this.f40277) {
                    if (interfaceC9768 == this.f40339 && abstractC5390 == this.f40275 && abstractC5390.f12815 == interfaceC9768 && j == this.f40235 && !abstractC5390.mo11814() && ((!z || !this.f40273) && (z || (!this.f40294 && !this.f40304 && !this.f40321)))) {
                        int iM32606 = m32606();
                        long jMo11822 = (!z || interfaceC9768.length() <= 1000000 || iM32606 <= 0) ? 0L : abstractC5390.mo11822(i, iM32606);
                        this.f40252.m20515(interfaceC9768, (int) (jMo11822 >>> 32), (int) jMo11822);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩹֫ */
    public final String m32595() {
        return this.f40262.f76018;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m32563(String str) {
        this.f40262.f76018 = str;
    }

    /* JADX INFO: renamed from: ܶ */
    public final void m32526() {
        m32316("Session text preparation was canceled");
        this.f40267 = null;
        this.f40273 = true;
        this.f40204 = false;
        this.f40252.m20508();
        this.f40275.f12826 = true;
        this.f40275.f12819 = true;
        C6100 c6100 = this.f40319;
        if (c6100 != null) {
            c6100.f15335 = true;
            RunnableC11522 runnableC11522 = new RunnableC11522(1, c6100);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnableC11522.run();
            } else {
                C7050.m16212(runnableC11522);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final FutureC5767 m32538(InterfaceC9768 interfaceC9768) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Initial highlight readiness requires the foreground thread");
        }
        AbstractC5390 abstractC5390 = this.f40275;
        int iMo28581 = interfaceC9768.mo28581();
        long jUptimeMillis = SystemClock.uptimeMillis() + 500;
        FutureC5767 futureC5767 = new FutureC5767();
        new RunnableC13989(this, futureC5767, interfaceC9768, abstractC5390, iMo28581, jUptimeMillis).run();
        return futureC5767;
    }

    /* JADX INFO: renamed from: ۧ */
    public final FutureC5767 m32485(C6495 c6495, C22864 c22864) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Session readiness requires the foreground thread");
        }
        FutureC5767 futureC5767 = new FutureC5767();
        C7050.m16212(new RunnableC11978(this, futureC5767, c22864, c6495));
        return futureC5767;
    }

    /* JADX INFO: renamed from: ֨ */
    private C22864 m32181(boolean z) {
        C22864 c22864;
        synchronized (this.f40199) {
            if (this.f40239 != null) {
                throw new IllegalStateException("Session task is already active");
            }
            c22864 = new C22864(z);
            this.f40239 = c22864;
        }
        return c22864;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C22864 m32603() {
        C22864 c22864M32181;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Session preparation requires the main thread");
        }
        synchronized (this.f40199) {
            if (this.f40239 != null || this.f40322 != null || !this.f40199.isEmpty() || !m32569() || m32434() || this.f40261 != null || this.f40339.mo4003()) {
                throw new IllegalStateException("View is busy before session preparation");
            }
            c22864M32181 = m32181(true);
            m32476(true);
        }
        return c22864M32181;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C22864 m32371(C6495 c6495) {
        if (Looper.myLooper() != Looper.getMainLooper() || this.f40339 != c6495) {
            throw new IllegalStateException("Session close requires its foreground owner");
        }
        return m32181(false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m32420(C6495 c6495, C22864 c22864) {
        if (Looper.myLooper() != Looper.getMainLooper() || this.f40339 != c6495 || c22864 == null || c22864 != this.f40239) {
            throw new IllegalStateException("Session close requires its foreground task");
        }
        if (!c6495.m14911()) {
            return false;
        }
        synchronized (this.f40199) {
            if (this.f40322 == null && this.f40199.isEmpty() && !this.f40294 && !this.f40204 && !this.f40321 && this.f40261 == null && !m32434() && !this.f40339.mo4003()) {
                c22864.f71993 = true;
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32406(C22864 c22864) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Session preparation requires the main thread");
        }
        synchronized (this.f40199) {
            if (c22864 != null) {
                if (c22864 == this.f40239) {
                    m32277(c22864);
                    this.f40239 = null;
                    m32288();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32393(InterfaceC9768 interfaceC9768) {
        if (Looper.myLooper() != Looper.getMainLooper() || this.f40294 || m32434()) {
            throw new IllegalStateException("Session preparation is still reading the view");
        }
        if (this.f40339 != interfaceC9768) {
            return;
        }
        InterfaceC20853 interfaceC20853 = this.f40318;
        this.f40318 = null;
        try {
            mo27932("");
        } finally {
            this.f40318 = interfaceC20853;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 13111. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ֫ */
    private void m32188(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instruction units count: 1311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C14146.m32188(android.graphics.Canvas):void");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32372() {
        this.f40267 = null;
        if (this.f40204) {
            this.f40204 = false;
            RunnableC8625 runnableC8625 = new RunnableC8625(0, this, this.f40339);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnableC8625.run();
            } else {
                post(runnableC8625);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m32204(C14146 c14146, InterfaceC9768 interfaceC9768) {
        if (c14146.f40339 == interfaceC9768 && c14146.m32547()) {
            c14146.requestLayout();
            c14146.invalidate();
            c14146.f40190.m19806(interfaceC9768);
            c14146.f40252.m20546(interfaceC9768);
            c14146.m32229();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo27932(CharSequence charSequence) {
        m32323(charSequence);
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m32323(CharSequence charSequence) {
        this.f40267 = null;
        this.f40204 = false;
        if (charSequence == null) {
            charSequence = "";
        }
        if (charSequence instanceof C6495) {
            this.f40262.f76018 = ((C6495) charSequence).mo3999().m54753().m16594();
        } else {
            this.f40262.f76018 = C23929.m53008(charSequence);
            charSequence = C23929.m53007(charSequence);
        }
        int iMo3989 = this.f40339.mo3989();
        InterfaceC9768 interfaceC9768M32309 = m32309(charSequence);
        InterfaceC9768 interfaceC9768 = this.f40339;
        m32317(interfaceC9768M32309);
        this.f40190.m19807(this.f40339);
        this.f40252.m20521();
        this.f40332.m54669();
        if (interfaceC9768 != interfaceC9768M32309) {
            interfaceC9768.mo14910(false);
        }
        this.f40339.mo3991(this.f40249);
        this.f40339.mo3990(iMo3989);
        InterfaceC9768 interfaceC9769 = this.f40339;
        interfaceC9769.setSpan(this.f40265, 0, interfaceC9769.length(), 8388626);
        InterfaceC9768 interfaceC97610 = this.f40339;
        if (!(interfaceC97610 instanceof C6495)) {
            interfaceC97610.mo3999().m54752();
        }
        if (this.f40252.m20523()) {
            this.f40252.m20527((CharSequence) this.f40339);
        }
        if (this.f40262.f75992 && this.f40252.m20524()) {
            this.f40332.m54661(this.f40252.m20536());
        } else {
            this.f40332.m54661(C24894.f79502);
        }
        this.f40275.mo10199(this.f40339);
        m32235();
        this.f40190.m19806(this.f40339);
        m32469();
        m32574();
        InterfaceC9768 interfaceC97611 = this.f40339;
        if (!(interfaceC97611 instanceof C6495)) {
            m32520(false);
            this.f40339.setSelection(0);
        } else {
            InterfaceC20853 interfaceC20853 = this.f40318;
            if (interfaceC20853 != null) {
                interfaceC20853.mo5042(((C6495) interfaceC97611).isChanged());
            }
        }
        this.f40238 = -1.0f;
        m32291();
        if (!isInEditMode()) {
            int length = this.f40339.length();
            int i = SharedPreferencesOnSharedPreferenceChangeListenerC23180.f72813;
            if (length > C7050.f18355.getInt("smooth_mode_threshold", 200000)) {
                this.f40317 = true;
            }
        }
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: ۧᩳ */
    public final void m32502() {
        this.f40296 = true;
        this.f40301.incrementAndGet();
        C16157 c16157 = this.f40334;
        if (c16157 != null) {
            c16157.f47589 = 0;
            c16157.f47593 = false;
            c16157.f47592 = false;
            c16157.f47591 = -1;
            c16157.f47590 = -1;
        }
        this.f40286 = 0;
        this.f40240 = 0;
    }

    /* JADX INFO: renamed from: ۗܽ */
    public final void m32435() {
        this.f40296 = false;
        if (!isFocused() || m32505()) {
            return;
        }
        if (C12799.m29347()) {
            m32444();
        } else {
            C7050.m16212(new RunnableC24718(0, this));
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m32566(int i) {
        return i == this.f40301.get() && !this.f40296;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m32552(int i) {
        return m32566(i) && !m32505() && m32238();
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m32427() {
        this.f40275.mo10199(this.f40339);
        m32235();
        this.f40238 = -1.0f;
        m32291();
        requestLayout();
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.f40262.f75997 || this.f40296) {
            return null;
        }
        if (this.f40334 == null) {
            C16157 c16157 = new C16157();
            new ExtractedText();
            this.f40334 = c16157;
        }
        editorInfo.imeOptions = mo27942();
        editorInfo.inputType = mo27915();
        C23591 c23591 = new C23591(this, this.f40301.get());
        this.f40300.add(c23591);
        return new InputConnectionC21580(c23591);
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m32471(boolean z) {
        C23929 c23929 = this.f40262;
        if (c23929.f75997 != z) {
            c23929.f75997 = z;
            if (z) {
                m32440();
            } else {
                m32444();
            }
            InterfaceC20853 interfaceC20853 = this.f40318;
            if (interfaceC20853 != null) {
                interfaceC20853.mo5043(m32447(), m32360());
            }
        }
    }

    /* JADX INFO: renamed from: ۨۧ */
    public final boolean m32505() {
        return this.f40262.f75997 || this.f40264 == this.f40339;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32391(C8328 c8328) {
        this.f40226 = c8328;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m32421(final InterfaceC9768 interfaceC9768, final RuntimeException runtimeException) {
        if (!(interfaceC9768 instanceof C6495)) {
            return false;
        }
        C6495 c6495 = (C6495) interfaceC9768;
        if (!(runtimeException instanceof UncheckedIOException) && !(runtimeException instanceof C6138)) {
            return false;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C7050.m16212(new Runnable() { // from class: l.ۙۛᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    TextKeyListener textKeyListener = C14146.f40186;
                    this.f17057.m32421(interfaceC9768, runtimeException);
                }
            });
            return true;
        }
        if (this.f40339 == interfaceC9768 && this.f40264 != interfaceC9768) {
            this.f40264 = c6495;
            this.f40269 = runtimeException;
            m32502();
            this.f40190.m19798();
            this.f40252.m20520();
            invalidate();
            C7050.m16212(new RunnableC10817(this, interfaceC9768, c6495, runtimeException, 1));
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m32205(C14146 c14146, InterfaceC9768 interfaceC9768, C6495 c6495, RuntimeException runtimeException) {
        InterfaceC7441 interfaceC7441;
        if (c14146.f40339 == interfaceC9768 && c14146.f40264 == interfaceC9768 && (interfaceC7441 = c14146.f40226) != null) {
            C23631.m52497((C23631) ((C8328) interfaceC7441).f22276, c6495, runtimeException);
        }
    }

    /* JADX INFO: renamed from: ۬ܽ */
    public final void m32513() {
        C23929 c23929 = this.f40262;
        if (!c23929.f76021) {
            c23929.f76021 = true;
            if (m32505()) {
                invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ֡ */
    public final void m32358(int i) {
        this.f40262.m26490(i);
        this.f40238 = -1.0f;
    }

    /* JADX INFO: renamed from: ֫ۧ */
    public final int m32425() {
        return this.f40262.m26497();
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m32437(boolean z) {
        C23929 c23929 = this.f40262;
        if (c23929.m26494() != z) {
            c23929.m26491(z);
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m32457(boolean z) {
        C23929 c23929 = this.f40262;
        if (c23929.m26510() != z) {
            c23929.m26502(z);
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: ۬ۧ */
    public boolean mo27936() {
        return this.f40262.f75953;
    }

    /* JADX INFO: renamed from: ᩶ܽ */
    public final void m32584() {
        this.f40238 = -1.0f;
    }

    /* JADX INFO: renamed from: ܽۧ */
    public static void m32315(C14146 c14146) {
        c14146.f40220 = true;
        c14146.f40193 = false;
        if (!c14146.isFocused()) {
            c14146.requestFocus();
            c14146.invalidate();
        }
        c14146.m32507();
    }

    /* JADX INFO: renamed from: ᩹֫ */
    public static void m32349(C14146 c14146) {
        c14146.f40220 = false;
        c14146.f40193 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܿ */
    public boolean m32321(float f, float f2) {
        return f >= ((float) getPaddingLeft()) && f <= ((float) (getWidth() - getPaddingRight())) && f2 >= ((float) getPaddingTop()) && f2 <= ((float) (getHeight() - getPaddingBottom()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public void m32310(MotionEvent motionEvent) {
        if (m32434()) {
            return;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (m32321(x, y)) {
            int iM11804 = this.f40275.m11804((getScrollX() + x) - getPaddingLeft(), (this.f40187 + y) - getPaddingTop());
            int iM32508 = m32508();
            int iM32512 = m32512();
            int iMin = Math.min(iM32508, iM32512);
            int iMax = Math.max(iM32508, iM32512);
            if (iMin == iMax || iMin > iM11804 || iM11804 > iMax) {
                mo27941(iM11804);
            }
            this.f40280 = SystemClock.uptimeMillis();
            m32464();
            if (m32279((int[]) null)) {
                this.f40328.m22591((int) x, (int) y);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f6  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float scrollX;
        int actionMasked;
        if (!m32583()) {
            if (Build.VERSION.SDK_INT < 23 || !m32278(motionEvent) || (((actionMasked = motionEvent.getActionMasked()) != 11 && actionMasked != 12) || motionEvent.getActionButton() != 2)) {
                boolean z = (motionEvent.getMetaState() & 4096) != 0;
                if ((motionEvent.getSource() & 2) == 0 && motionEvent.getAction() == 8) {
                    m32258();
                    float fM32592 = 0.0f;
                    if (z) {
                        float axisValue = (motionEvent.getAxisValue(9) / 20.0f) + 1.0f;
                        float textSize = this.f40262.f32005.getTextSize();
                        if (this.f40262.m53015(axisValue * textSize)) {
                            float textSize2 = this.f40262.f32005.getTextSize() / textSize;
                            this.f40275.mo10187(textSize);
                            if (this.f40275.mo10193()) {
                                float x = motionEvent.getX();
                                scrollX = ((getScrollX() + x) * textSize2) - x;
                                if (scrollX < 0.0f) {
                                    scrollX = 0.0f;
                                } else {
                                    float fM32527 = m32527();
                                    if (scrollX > fM32527) {
                                        scrollX = fM32527;
                                    }
                                }
                            } else {
                                scrollX = 0.0f;
                            }
                            float y = motionEvent.getY();
                            float f = ((this.f40187 + y) * textSize2) - y;
                            if (f >= 0.0f) {
                                fM32592 = m32592();
                                if (f <= fM32592) {
                                    fM32592 = f;
                                }
                            }
                            m32187((int) scrollX, (int) fM32592, true);
                            invalidate();
                            this.f40224.removeMessages(7);
                            this.f40224.sendEmptyMessageDelayed(7, 200L);
                            return true;
                        }
                    } else {
                        float axisValue2 = this.f40275.mo10193() ? motionEvent.getAxisValue(10) : 0.0f;
                        float axisValue3 = motionEvent.getAxisValue(9);
                        m32187(m32454((int) ((this.f40262.m26507() * axisValue2) + getScrollX())), m32585((int) (this.f40187 - (this.f40262.m26496() * axisValue3))), true);
                        if (axisValue2 != 0.0f) {
                            m32506();
                        }
                        if (axisValue3 != 0.0f) {
                            m32517();
                        }
                    }
                } else {
                    return super.onGenericMotionEvent(motionEvent);
                }
            } else if (actionMasked == 11) {
                if (!this.f40220) {
                    this.f40220 = true;
                    this.f40193 = false;
                    if (!isFocused()) {
                        requestFocus();
                        invalidate();
                    }
                    m32507();
                    m32310(motionEvent);
                    return true;
                }
            } else if (actionMasked == 12) {
                if (this.f40220 && !this.f40193) {
                    this.f40220 = false;
                    this.f40193 = false;
                    return true;
                }
            } else {
                if ((motionEvent.getMetaState() & 4096) != 0) {
                }
                if ((motionEvent.getSource() & 2) == 0) {
                }
                return super.onGenericMotionEvent(motionEvent);
            }
        } else if (motionEvent.getAction() == 8 && (motionEvent.getMetaState() & 4096) == 0) {
            this.f40319.m13886((int) (motionEvent.getAxisValue(10) * this.f40262.m26507()), (int) (motionEvent.getAxisValue(9) * (-this.f40262.m26496())));
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0078  */
    /* JADX WARN: Code duplicated, block: B:38:0x007f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0088  */
    /* JADX WARN: Code duplicated, block: B:43:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bb  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a7, code lost:
    
        if (r6 <= r7) goto L56;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        float fM32336;
        C16427 c16427;
        float f;
        float f2;
        if (Build.VERSION.SDK_INT < 24 || motionEvent == null || !m32278(motionEvent)) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        float x = (motionEvent.getX(i) + getScrollX()) - getPaddingLeft();
        float fM11821 = this.f40275.m11821(motionEvent.getY(i));
        if (!this.f40312 && !this.f40308) {
            boolean z = this.f40275.f12829;
            C23929 c23929 = this.f40262;
            if (!z) {
                if (this.f40275.f12828) {
                    fM32336 = m32336();
                    if (fM32336 > 0.0f) {
                        c16427 = this.f40275.f12797;
                        f = c23929.f75963 * fM32336;
                        if (x >= c16427.f48277 && x <= c16427.f48281) {
                            f2 = c16427.f48276;
                            if (fM11821 >= f2 - f) {
                            }
                        }
                    }
                }
                if (m32328(x)) {
                    return PointerIcon.getSystemIcon(getContext(), 1000);
                }
                return PointerIcon.getSystemIcon(getContext(), 1008);
            }
            float fM32179 = m32179();
            if (fM32179 > 0.0f) {
                C16427 c16428 = this.f40275.f12799;
                if (fM11821 < c16428.f48280 || fM11821 > c16428.f48276) {
                    if (this.f40275.f12828) {
                        fM32336 = m32336();
                        if (fM32336 > 0.0f) {
                            c16427 = this.f40275.f12797;
                            f = c23929.f75963 * fM32336;
                            if (x >= c16427.f48277) {
                                f2 = c16427.f48276;
                                if (fM11821 >= f2 - f) {
                                }
                            }
                        }
                    }
                    if (m32328(x)) {
                        return PointerIcon.getSystemIcon(getContext(), 1000);
                    }
                    return PointerIcon.getSystemIcon(getContext(), 1008);
                }
                float f3 = c23929.f75963 * fM32179;
                if (c23929.f76016) {
                    float f4 = c16428.f48281;
                    if (x < f4 - f3 || x > f4) {
                        if (this.f40275.f12828) {
                            fM32336 = m32336();
                            if (fM32336 > 0.0f) {
                                c16427 = this.f40275.f12797;
                                f = c23929.f75963 * fM32336;
                                if (x >= c16427.f48277) {
                                    f2 = c16427.f48276;
                                    if (fM11821 >= f2 - f) {
                                    }
                                }
                            }
                        }
                        if (m32328(x)) {
                            return PointerIcon.getSystemIcon(getContext(), 1000);
                        }
                        return PointerIcon.getSystemIcon(getContext(), 1008);
                    }
                } else {
                    float f5 = c16428.f48277;
                    if (x < f5 || x > f5 + f3) {
                        if (this.f40275.f12828) {
                            fM32336 = m32336();
                            if (fM32336 > 0.0f) {
                                c16427 = this.f40275.f12797;
                                f = c23929.f75963 * fM32336;
                                if (x >= c16427.f48277) {
                                    f2 = c16427.f48276;
                                    if (fM11821 >= f2 - f) {
                                    }
                                }
                            }
                        }
                        if (m32328(x)) {
                            return PointerIcon.getSystemIcon(getContext(), 1000);
                        }
                        return PointerIcon.getSystemIcon(getContext(), 1008);
                    }
                }
            } else {
                if (this.f40275.f12828) {
                    fM32336 = m32336();
                    if (fM32336 > 0.0f) {
                        c16427 = this.f40275.f12797;
                        f = c23929.f75963 * fM32336;
                        if (x >= c16427.f48277) {
                            f2 = c16427.f48276;
                            if (fM11821 >= f2 - f) {
                            }
                        }
                    }
                }
                if (m32328(x)) {
                    return PointerIcon.getSystemIcon(getContext(), 1000);
                }
                return PointerIcon.getSystemIcon(getContext(), 1008);
            }
        }
        return PointerIcon.getSystemIcon(getContext(), C0215b.f1000c);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int i;
        if (m32278(motionEvent)) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 10) {
                m32342();
            } else if (actionMasked == 9 || actionMasked == 7) {
                this.f40287 = motionEvent.getX();
                float y = motionEvent.getY();
                this.f40201 = y;
                int iM32294 = m32294(this.f40287, y);
                int i2 = iM32294 & 1;
                boolean z = i2 != 0 && m32179() > 0.0f;
                int i3 = iM32294 & 2;
                boolean z2 = i3 != 0 && m32336() > 0.0f;
                if (z && z2) {
                    if (this.f40326 >= this.f40331) {
                        z = false;
                    } else {
                        z2 = false;
                    }
                }
                this.f40189 = z;
                this.f40311 = z2;
                if (z) {
                    m32304();
                }
                if (this.f40311) {
                    m32251();
                }
                if (iM32294 == 0) {
                    m32258();
                }
                if (i3 != 0) {
                    i = 2;
                } else {
                    i = i2 != 0 ? 1 : 0;
                }
                if (i == 0 || (i != 1 ? !(i != 2 || m32336() <= 0.0f) : m32179() > 0.0f)) {
                    m32258();
                } else if (this.f40225 != i) {
                    this.f40225 = i;
                    HandlerC15329 handlerC15329 = this.f40224;
                    handlerC15329.removeMessages(8);
                    handlerC15329.sendEmptyMessageDelayed(8, 300L);
                }
            }
        }
        return m32278(motionEvent) || super.onHoverEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ܳ */
    private int m32294(float f, float f2) {
        int i = 0;
        if (!m32583() && !this.f40304 && !this.f40294 && !this.f40275.f12798.isEmpty()) {
            int iM32458 = m32458();
            int iM32606 = m32606();
            int scrollX = getScrollX();
            int i2 = this.f40187;
            if (m32214(this.f40323, scrollX, i2, iM32458, iM32606)) {
                float paddingLeft = (f + scrollX) - getPaddingLeft();
                float paddingTop = f2 - getPaddingTop();
                AbstractC5390 abstractC5390 = this.f40275;
                Rect rect = this.f40323;
                int i3 = rect.left;
                int i4 = rect.top - i2;
                int iWidth = rect.width();
                int iHeight = this.f40323.height();
                C23929 c23929 = abstractC5390.f12837;
                int iMo27921 = abstractC5390.f12821.mo27921();
                int i5 = iM32606 + iMo27921;
                if (iM32458 > 0 && iM32606 > 0 && i5 > 0 && iWidth > 0 && iHeight > 0) {
                    int i6 = iWidth + i3;
                    int i7 = iHeight + i4 + iMo27921;
                    double dM11833 = abstractC5390.m11833();
                    if (dM11833 > 0.0d) {
                        double d = i5;
                        if (dM11833 - d > 0.0d && c23929.f75974 && dM11833 / d > 3.0d && (!c23929.f76016 ? !(paddingLeft < i3 || paddingLeft > c23929.f75963 + i3 || paddingTop < i4 || paddingTop > i7) : !(paddingLeft < i6 - c23929.f75963 || paddingLeft > i6 || paddingTop < i4 || paddingTop > i7))) {
                            i = 1;
                        }
                    }
                    float fMo10196 = abstractC5390.mo10196();
                    if (abstractC5390.mo10193() && fMo10196 > 0.0f) {
                        float f3 = iM32458;
                        if (fMo10196 - f3 > 0.0f && c23929.f75951 && fMo10196 / f3 > 3.0f) {
                            if (c23929.f75988 && c23929.f75989) {
                                if (c23929.f76016) {
                                    i3 += abstractC5390.f12800;
                                } else {
                                    i6 -= abstractC5390.f12800;
                                }
                            }
                            if (i6 >= i3 && paddingLeft >= i3 && paddingLeft <= i6 && paddingTop >= i7 - c23929.f75963 && paddingTop <= i7) {
                                return i | 2;
                            }
                        }
                    }
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۧۧ */
    public static void m32282(C14146 c14146) {
        int i;
        int i2 = c14146.f40225;
        c14146.f40225 = 0;
        if (i2 == 0) {
            return;
        }
        int iM32294 = c14146.m32294(c14146.f40287, c14146.f40201);
        if ((iM32294 & 2) != 0) {
            i = 2;
        } else {
            i = (iM32294 & 1) != 0 ? 1 : 0;
        }
        if (i != i2) {
            c14146.f40189 = false;
            c14146.f40311 = false;
        } else if (i2 == 1) {
            c14146.m32517();
            c14146.f40189 = true;
            c14146.f40311 = false;
        } else if (i2 == 2) {
            c14146.m32506();
            c14146.f40189 = false;
            c14146.f40311 = true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m32196(C14146 c14146, int i, MotionEvent motionEvent) {
        c14146.f40287 = motionEvent.getX();
        float y = motionEvent.getY();
        c14146.f40201 = y;
        if ((c14146.m32294(c14146.f40287, y) & i) != 0) {
            c14146.f40189 = i == 1;
            c14146.f40311 = i == 2;
        } else {
            c14146.f40189 = false;
            c14146.f40311 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۢᩳ */
    public void m32258() {
        this.f40225 = 0;
        this.f40224.removeMessages(8);
    }

    /* JADX INFO: renamed from: ܶ֫ */
    public static void m32303(C14146 c14146) {
        c14146.f40189 = false;
        c14146.f40311 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷ᩳ */
    public void m32342() {
        m32258();
        this.f40189 = false;
        this.f40311 = false;
    }

    /* JADX INFO: renamed from: ֡ᩳ */
    private float m32179() {
        if (this.f40312) {
            return 1.0f;
        }
        return m32184(this.f40331);
    }

    /* JADX INFO: renamed from: ᩵ᩳ */
    private float m32336() {
        if (this.f40308) {
            return 1.0f;
        }
        return m32184(this.f40326);
    }

    /* JADX INFO: renamed from: ֫ */
    public static float m32184(long j) {
        int iUptimeMillis = (int) (SystemClock.uptimeMillis() - j);
        if (iUptimeMillis < 0) {
            return 0.0f;
        }
        if (iUptimeMillis <= 1500) {
            return 1.0f;
        }
        int i = iUptimeMillis - 1500;
        if (i < 300) {
            return 1.0f - (i / 300.0f);
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ */
    public boolean m32328(float f) {
        C23929 c23929 = this.f40262;
        if (!c23929.f75988) {
            return false;
        }
        if (c23929.f75989) {
            if (c23929.f76016) {
                return f - ((float) getScrollX()) <= ((float) this.f40275.f12800);
            }
            return f - ((float) getScrollX()) >= ((float) (m32458() - this.f40275.f12800));
        }
        if (c23929.f76016) {
            return f <= ((float) this.f40275.f12800);
        }
        return f >= this.f40275.mo10196() - ((float) this.f40275.f12800);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!m32238()) {
            return false;
        }
        C6495 c6495 = this.f40264;
        InterfaceC9768 interfaceC9768 = this.f40339;
        if (c6495 == interfaceC9768) {
            return false;
        }
        try {
            return m32213(i, keyEvent);
        } catch (UncheckedIOException | C6138 e) {
            if (m32421(interfaceC9768, e)) {
                return false;
            }
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x017b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0181  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e8  */
    /* JADX INFO: renamed from: ֫ */
    private boolean m32213(int i, KeyEvent keyEvent) {
        int iIndexOf;
        int iM11807;
        int length;
        KeyEvent keyEvent2 = keyEvent == null ? new KeyEvent(0, i) : keyEvent;
        boolean z = MetaKeyKeyListener.getMetaState(this.f40339, 1) == 1;
        boolean zIsCtrlPressed = keyEvent2.isCtrlPressed();
        boolean zIsAltPressed = keyEvent2.isAltPressed();
        boolean z2 = z || MetaKeyKeyListener.getMetaState(this.f40339, 2048) != 0;
        int iM32508 = m32508();
        int iM32512 = m32512();
        int iMin = Math.min(iM32508, iM32512);
        int iMax = Math.max(iM32508, iM32512);
        if (i != 29) {
            if (i != 31) {
                if (i != 34) {
                    if (i != 50) {
                        if (i != 63) {
                            if (i != 112) {
                                if (i != 46) {
                                    if (i != 47) {
                                        if (i != 66) {
                                            if (i != 67) {
                                                if (i == 92) {
                                                    int iM11834 = this.f40275.m11834(iM32512);
                                                    if (iM11834 > 0) {
                                                        int iM32606 = (int) (m32606() / this.f40262.m26496());
                                                        int iMax2 = Math.max(0, iM11834 - iM32606);
                                                        C9729 c9729Mo28589 = this.f40339.mo28589();
                                                        try {
                                                            float fM26499 = this.f40238;
                                                            if (fM26499 < 0.0f) {
                                                                fM26499 = this.f40262.m26499(c9729Mo28589, this.f40275.f12798.get(iM11834).f38061, iM32512, 0.0f) + this.f40275.m11836(iM11834);
                                                                this.f40238 = fM26499;
                                                            }
                                                            int iM11808 = this.f40275.m11807(c9729Mo28589, iMax2, fM26499);
                                                            c9729Mo28589.close();
                                                            if (z2) {
                                                                this.f40339.setSelection(m32508(), iM11808);
                                                            } else {
                                                                this.f40339.setSelection(iM11808);
                                                                m32464();
                                                            }
                                                            this.f40280 = 0L;
                                                            int iM11803 = this.f40275.m11803(this.f40187 + 1) - iM32606;
                                                            if (iM11803 < 0) {
                                                                iM11803 = 0;
                                                            }
                                                            this.f40259 = (int) (this.f40262.m26496() * iM11803);
                                                            m32413(iM11808, false);
                                                            m32507();
                                                            m32291();
                                                            invalidate();
                                                            return true;
                                                        } catch (Throwable th) {
                                                            try {
                                                                c9729Mo28589.close();
                                                                throw th;
                                                            } catch (Throwable th2) {
                                                                th.addSuppressed(th2);
                                                                throw th;
                                                            }
                                                        }
                                                    }
                                                } else if (i == 93) {
                                                    int iM11835 = this.f40275.m11834(iM32512);
                                                    int size = this.f40275.f12798.size() - 1;
                                                    if (iM11835 < size) {
                                                        int iM32607 = (int) (m32606() / this.f40262.m26496());
                                                        int iMin2 = Math.min(size, iM11835 + iM32607);
                                                        C9729 c9729Mo285810 = this.f40339.mo28589();
                                                        try {
                                                            float fM264910 = this.f40238;
                                                            if (fM264910 < 0.0f) {
                                                                fM264910 = this.f40262.m26499(c9729Mo285810, this.f40275.f12798.get(iM11835).f38061, iM32512, 0.0f) + this.f40275.m11836(iM11835);
                                                                this.f40238 = fM264910;
                                                            }
                                                            int iM11809 = this.f40275.m11807(c9729Mo285810, iMin2, fM264910);
                                                            c9729Mo285810.close();
                                                            if (z2) {
                                                                this.f40339.setSelection(m32508(), iM11809);
                                                            } else {
                                                                this.f40339.setSelection(iM11809);
                                                                m32464();
                                                            }
                                                            this.f40280 = 0L;
                                                            int iM11804 = this.f40275.m11803(this.f40187 + 1) + iM32607;
                                                            if (iM11804 <= size) {
                                                                size = iM11804;
                                                            }
                                                            this.f40259 = (int) (this.f40262.m26496() * size);
                                                            m32413(iM11809, false);
                                                            m32291();
                                                            m32507();
                                                            invalidate();
                                                            return true;
                                                        } catch (Throwable th3) {
                                                            try {
                                                                c9729Mo285810.close();
                                                                throw th3;
                                                            } catch (Throwable th4) {
                                                                th3.addSuppressed(th4);
                                                                throw th3;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (i == 122) {
                                                        if (zIsCtrlPressed) {
                                                            C24204.m53521(this, z2);
                                                            return true;
                                                        }
                                                        C24204.m53519(this, z2);
                                                        return true;
                                                    }
                                                    if (i == 123) {
                                                        if (zIsCtrlPressed) {
                                                            C24204.m53514(this, z2);
                                                            return true;
                                                        }
                                                        C24204.m53517(this, z2);
                                                        return true;
                                                    }
                                                    switch (i) {
                                                        case 19:
                                                            int iM11836 = this.f40275.m11834(iM32512);
                                                            if (iM11836 > 0) {
                                                                C9729 c9729Mo285811 = this.f40339.mo28589();
                                                                try {
                                                                    float fM264911 = this.f40238;
                                                                    if (fM264911 < 0.0f) {
                                                                        fM264911 = this.f40262.m26499(c9729Mo285811, this.f40275.f12798.get(iM11836).f38061, iM32512, 0.0f) + this.f40275.m11836(iM11836);
                                                                        this.f40238 = fM264911;
                                                                    }
                                                                    iM11807 = this.f40275.m11807(c9729Mo285811, iM11836 - 1, fM264911);
                                                                    c9729Mo285811.close();
                                                                } catch (Throwable th5) {
                                                                    try {
                                                                        c9729Mo285811.close();
                                                                        throw th5;
                                                                    } catch (Throwable th6) {
                                                                        th5.addSuppressed(th6);
                                                                        throw th5;
                                                                    }
                                                                }
                                                            } else {
                                                                iM11807 = 0;
                                                            }
                                                            if (z2) {
                                                                this.f40339.setSelection(m32508(), iM11807);
                                                            } else {
                                                                this.f40339.setSelection(iM11807);
                                                                m32464();
                                                            }
                                                            this.f40280 = 0L;
                                                            m32413(iM11807, false);
                                                            m32507();
                                                            m32291();
                                                            invalidate();
                                                            return true;
                                                        case 20:
                                                            int iM11837 = this.f40275.m11834(iM32512);
                                                            if (iM11837 < this.f40275.f12798.size() - 1) {
                                                                C9729 c9729Mo285812 = this.f40339.mo28589();
                                                                try {
                                                                    float fM264912 = this.f40238;
                                                                    if (fM264912 < 0.0f) {
                                                                        fM264912 = this.f40262.m26499(c9729Mo285812, this.f40275.f12798.get(iM11837).f38061, iM32512, 0.0f) + this.f40275.m11836(iM11837);
                                                                        this.f40238 = fM264912;
                                                                    }
                                                                    length = this.f40275.m11807(c9729Mo285812, iM11837 + 1, fM264912);
                                                                    c9729Mo285812.close();
                                                                } catch (Throwable th7) {
                                                                    try {
                                                                        c9729Mo285812.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                }
                                                            } else {
                                                                length = this.f40339.length();
                                                            }
                                                            if (z2) {
                                                                this.f40339.setSelection(m32508(), length);
                                                            } else {
                                                                this.f40339.setSelection(length);
                                                                m32464();
                                                            }
                                                            this.f40280 = 0L;
                                                            m32413(length, false);
                                                            m32507();
                                                            m32291();
                                                            invalidate();
                                                            return true;
                                                        case 21:
                                                            if (!zIsCtrlPressed || !zIsAltPressed) {
                                                                this.f40275.m11815();
                                                                if (zIsCtrlPressed) {
                                                                    int[] iArrM32243 = m32243(iM32512, true);
                                                                    String strSubstring = TextUtils.substring(this.f40339, iArrM32243[0], iArrM32243[1]);
                                                                    int i2 = iArrM32243[0];
                                                                    int iPreceding = iM32512 - i2;
                                                                    BreakIterator breakIterator = this.f40270;
                                                                    try {
                                                                        breakIterator.setText(strSubstring);
                                                                        do {
                                                                            iPreceding = breakIterator.preceding(iPreceding);
                                                                            if (iPreceding == -1) {
                                                                                iPreceding = 0;
                                                                            }
                                                                            iMin = i2 + iPreceding;
                                                                            if (z2) {
                                                                                this.f40339.setSelection(iM32508, iMin);
                                                                            } else {
                                                                                this.f40339.setSelection(iMin);
                                                                                m32464();
                                                                            }
                                                                        } while (!((iPreceding < 0 || iPreceding >= strSubstring.length()) ? false : Character.isLetterOrDigit(Character.codePointAt(strSubstring, iPreceding))));
                                                                    } catch (Exception unused) {
                                                                    }
                                                                    iMin = i2 + iPreceding;
                                                                    if (z2) {
                                                                        this.f40339.setSelection(iM32508, iMin);
                                                                    } else {
                                                                        this.f40339.setSelection(iMin);
                                                                        m32464();
                                                                    }
                                                                } else if (z2) {
                                                                    iMin = C23669.m52677(iM32512, this.f40339);
                                                                    this.f40339.setSelection(iM32508, iMin);
                                                                } else if (iM32508 != iM32512) {
                                                                    this.f40339.setSelection(iMin);
                                                                    m32464();
                                                                } else {
                                                                    iMin = C23669.m52677(iM32508, this.f40339);
                                                                    this.f40339.setSelection(iMin);
                                                                    m32464();
                                                                }
                                                                this.f40280 = 0L;
                                                                m32413(iMin, false);
                                                                m32507();
                                                                this.f40238 = -1.0f;
                                                                m32291();
                                                                invalidate();
                                                                return true;
                                                            }
                                                            break;
                                                        case 22:
                                                            if (zIsCtrlPressed && zIsAltPressed) {
                                                                return true;
                                                            }
                                                            this.f40275.m11815();
                                                            if (zIsCtrlPressed) {
                                                                int[] iArrM32244 = m32243(iM32512, true);
                                                                String strSubstring2 = TextUtils.substring(this.f40339, iArrM32244[0], iArrM32244[1]);
                                                                int i3 = iArrM32244[0];
                                                                int length2 = iM32512 - i3;
                                                                BreakIterator breakIterator2 = this.f40270;
                                                                try {
                                                                    breakIterator2.setText(strSubstring2);
                                                                    do {
                                                                        length2 = breakIterator2.following(length2);
                                                                        if (length2 == -1) {
                                                                            length2 = strSubstring2.length();
                                                                            break;
                                                                        }
                                                                        iMax = i3 + length2;
                                                                        if (z2) {
                                                                            this.f40339.setSelection(iM32508, iMax);
                                                                        } else {
                                                                            this.f40339.setSelection(iMax);
                                                                            m32464();
                                                                        }
                                                                    } while (!((length2 <= 0 || length2 > strSubstring2.length()) ? false : Character.isLetterOrDigit(Character.codePointBefore(strSubstring2, length2))));
                                                                } catch (Exception unused2) {
                                                                    length2 = strSubstring2.length();
                                                                }
                                                                iMax = i3 + length2;
                                                                if (z2) {
                                                                    this.f40339.setSelection(iM32508, iMax);
                                                                } else {
                                                                    this.f40339.setSelection(iMax);
                                                                    m32464();
                                                                }
                                                            } else if (z2) {
                                                                InterfaceC9768 interfaceC9768 = this.f40339;
                                                                iMax = C23669.m52676(iM32512, interfaceC9768.length(), interfaceC9768);
                                                                this.f40339.setSelection(iM32508, iMax);
                                                            } else if (iM32508 != iM32512) {
                                                                this.f40339.setSelection(iMax);
                                                                m32464();
                                                            } else {
                                                                InterfaceC9768 interfaceC9769 = this.f40339;
                                                                iMax = C23669.m52676(iM32508, interfaceC9769.length(), interfaceC9769);
                                                                this.f40339.setSelection(iMax);
                                                                m32464();
                                                            }
                                                            this.f40280 = 0L;
                                                            m32413(iMax, false);
                                                            m32507();
                                                            this.f40238 = -1.0f;
                                                            m32291();
                                                            invalidate();
                                                            return true;
                                                        default:
                                                            switch (i) {
                                                                case 52:
                                                                    if (zIsCtrlPressed && !z && !zIsAltPressed) {
                                                                        if (m32508() == m32512()) {
                                                                            C24204.m53513(this);
                                                                            return true;
                                                                        }
                                                                        m32530(android.R.id.cut);
                                                                        return true;
                                                                    }
                                                                    break;
                                                                case 53:
                                                                    if (zIsCtrlPressed && !z && !zIsAltPressed) {
                                                                        if (!m32360()) {
                                                                            return true;
                                                                        }
                                                                        m32362();
                                                                        return true;
                                                                    }
                                                                    break;
                                                                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                                                    if (zIsCtrlPressed && !z && !zIsAltPressed) {
                                                                        if (!m32447()) {
                                                                            return true;
                                                                        }
                                                                        m32548();
                                                                        return true;
                                                                    }
                                                                    break;
                                                                default:
                                                                    switch (i) {
                                                                        case 57:
                                                                        case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                                                        case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                                                        case 60:
                                                                            break;
                                                                        case 61:
                                                                            if (this.f40262.f75997) {
                                                                                return true;
                                                                            }
                                                                            try {
                                                                                if (z) {
                                                                                    C24204.m53516(this);
                                                                                } else {
                                                                                    C24204.m53523(this);
                                                                                }
                                                                                this.f40303.decrementAndGet();
                                                                                return true;
                                                                            } catch (Throwable th9) {
                                                                                this.f40303.decrementAndGet();
                                                                                throw th9;
                                                                            }
                                                                        default:
                                                                            switch (i) {
                                                                                case 277:
                                                                                    m32530(android.R.id.cut);
                                                                                    return true;
                                                                                case 278:
                                                                                    m32530(android.R.id.copy);
                                                                                    return true;
                                                                                case 279:
                                                                                    m32530(android.R.id.paste);
                                                                                    return true;
                                                                            }
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            } else if (!this.f40262.f75997 && this.f40339.length() > 0) {
                                                if (iMin == iMax) {
                                                    iMin = C23669.m52677(iMax, this.f40339);
                                                }
                                                this.f40303.incrementAndGet();
                                                try {
                                                    this.f40339.delete(iMin, iMax);
                                                    this.f40303.decrementAndGet();
                                                    invalidate();
                                                    return true;
                                                } catch (Throwable th10) {
                                                    this.f40303.decrementAndGet();
                                                    throw th10;
                                                }
                                            }
                                        } else if (!mo27920() && !this.f40262.f75997) {
                                            m32561(iMin, iMax);
                                            invalidate();
                                            return true;
                                        }
                                    } else if (zIsCtrlPressed && !z && !zIsAltPressed) {
                                        this.f40314.mo24065(null);
                                        return true;
                                    }
                                } else if (zIsCtrlPressed && !z && !zIsAltPressed) {
                                    InterfaceC23850 interfaceC23850 = this.f40208;
                                    if (interfaceC23850 != null) {
                                        interfaceC23850.mo13676();
                                        interfaceC23850.mo13672(true);
                                        return true;
                                    }
                                }
                            } else if (!this.f40262.f75997 && this.f40339.length() > 0) {
                                if (iMin == iMax) {
                                    InterfaceC9768 interfaceC97610 = this.f40339;
                                    iMax = C23669.m52676(iMax, interfaceC97610.length(), interfaceC97610);
                                }
                                this.f40303.incrementAndGet();
                                try {
                                    this.f40339.delete(iMin, iMax);
                                    this.f40303.decrementAndGet();
                                    invalidate();
                                    return true;
                                } catch (Throwable th11) {
                                    this.f40303.decrementAndGet();
                                    throw th11;
                                }
                            }
                            return true;
                        }
                        f40186.onKeyDown(this, this.f40339, i, keyEvent2);
                        MetaKeyKeyListener.adjustMetaAfterKeypress(this.f40339);
                        return true;
                    }
                    if (zIsCtrlPressed && !z && !zIsAltPressed) {
                        m32530(android.R.id.paste);
                        return true;
                    }
                } else if (zIsCtrlPressed && !z && !zIsAltPressed) {
                    InterfaceC23850 interfaceC23851 = this.f40208;
                    if (interfaceC23851 == null) {
                        return true;
                    }
                    interfaceC23851.mo13664();
                    return true;
                }
            } else if (zIsCtrlPressed && !z && !zIsAltPressed) {
                if (m32508() == m32512()) {
                    C24204.m53506(this);
                    return true;
                }
                m32530(android.R.id.copy);
                return true;
            }
        } else if (zIsCtrlPressed && !z && !zIsAltPressed) {
            m32530(android.R.id.selectAll);
            return true;
        }
        if (!this.f40262.f75997 && !zIsCtrlPressed) {
            this.f40303.incrementAndGet();
            try {
                boolean z3 = keyEvent2.isCapsLockOn() != keyEvent2.isShiftPressed();
                if (29 <= i && i <= 54) {
                    this.f40339.replace(iMin, iMax, String.valueOf((char) (((z3 ? 65 : 97) + i) - 29)));
                    int i4 = iMin + 1;
                    mo27941(i4);
                    m32413(i4, false);
                    return true;
                }
                if (7 <= i && i <= 16) {
                    this.f40339.replace(iMin, iMax, String.valueOf(z3 ? ")!@#$%^&*(".charAt(i - 7) : (char) (i + 41)));
                    int i5 = iMin + 1;
                    mo27941(i5);
                    m32413(i5, false);
                    return true;
                }
                char displayLabel = keyEvent2.getDisplayLabel();
                if (displayLabel != 0) {
                    if (z3 && (iIndexOf = "`-=[]\\;',./".indexOf(displayLabel)) != -1) {
                        displayLabel = "~_+{}|:\"<>?".charAt(iIndexOf);
                    }
                    this.f40339.replace(iMin, iMax, String.valueOf(displayLabel));
                    int i6 = iMin + 1;
                    mo27941(i6);
                    m32413(i6, false);
                    return true;
                }
            } finally {
                this.f40303.decrementAndGet();
            }
        }
        return super.onKeyDown(i, keyEvent2);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 63) {
            if (i == 66) {
                if (mo27920()) {
                    View viewFocusSearch = focusSearch(130);
                    if (viewFocusSearch != null) {
                        viewFocusSearch.requestFocus();
                        return true;
                    }
                    m32440();
                }
                return true;
            }
            switch (i) {
                case 57:
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                case 60:
                    break;
                default:
                    return super.onKeyUp(i, keyEvent);
            }
        }
        f40186.onKeyUp(this, this.f40339, i, keyEvent);
        return true;
    }

    /* JADX INFO: renamed from: ۫֫ */
    public final int m32508() {
        int selectionStart = Selection.getSelectionStart(this.f40339);
        if (selectionStart < 0) {
            return 0;
        }
        return selectionStart > this.f40339.length() ? this.f40339.length() : selectionStart;
    }

    /* JADX INFO: renamed from: ۬֫ */
    public final int m32512() {
        int selectionEnd = Selection.getSelectionEnd(this.f40339);
        if (selectionEnd < 0) {
            return 0;
        }
        return selectionEnd > this.f40339.length() ? this.f40339.length() : selectionEnd;
    }

    /* JADX INFO: renamed from: ۗ֫ */
    public final int[] m32433() {
        int iM32508 = m32508();
        int iM32512 = m32512();
        if (iM32508 > iM32512) {
            iM32512 = iM32508;
            iM32508 = iM32512;
        }
        return new int[]{iM32508, iM32512};
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32378(View view, boolean z, boolean z2) {
        view.setVisibility(z ? 0 : 8);
        m32410(z, z2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32410(boolean z, boolean z2) {
        if (z) {
            this.f40278 = true;
            this.f40337 = false;
            this.f40227 = -1L;
        } else if (this.f40278) {
            this.f40278 = false;
            this.f40337 = z2;
            this.f40227 = -1L;
        } else if (!z2) {
            this.f40337 = false;
            this.f40227 = -1L;
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ܳ֫ */
    public final int m32522() {
        return this.f40295;
    }

    /* JADX INFO: renamed from: ۚۧ */
    public final boolean m32449() {
        return this.f40278;
    }

    /* JADX INFO: renamed from: ۛᩳ */
    private int m32241() {
        if (!this.f40337) {
            return 255;
        }
        if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
            this.f40337 = false;
            return 255;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f40227 < 0) {
            this.f40227 = jUptimeMillis;
        }
        float fMin = Math.min(1.0f, (jUptimeMillis - this.f40227) / 100.0f);
        if (fMin >= 1.0f) {
            this.f40337 = false;
        } else {
            postInvalidateOnAnimation();
        }
        return Math.round(((fMin * 0.5f) + 0.5f) * 255.0f);
    }

    /* JADX INFO: renamed from: ۢܽ */
    public final void m32479() {
        this.f40267 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d9, code lost:
    
        r0.f12951 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00db, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m32389(AbstractC5390 abstractC5390, int i, int i2) {
        boolean zM20549;
        C5429 c5429 = this.f40267;
        if (c5429 == null || this.f40278 || this.f40295 == 0 || abstractC5390 != this.f40275 || abstractC5390.f12815 != this.f40339 || this.f40294 || this.f40304 || this.f40321) {
            return;
        }
        if (!this.f40262.f75992 || !this.f40252.m20524() || this.f40339.length() == 0) {
            this.f40267 = null;
            return;
        }
        C16689 c16689M20550 = this.f40252.m20550();
        if (c16689M20550 == null) {
            this.f40267 = null;
            return;
        }
        int iM51556 = c16689M20550.m37819().m51556();
        if (c5429.f12955 == null) {
            InterfaceC9768 interfaceC9768 = this.f40339;
            c5429.f12955 = interfaceC9768;
            c5429.f12952 = interfaceC9768.mo28581();
            c5429.f12953 = c16689M20550;
            c5429.f12949 = iM51556;
            c5429.f12947 = C23223.m51768();
        }
        InterfaceC9768 interfaceC9769 = c5429.f12955;
        InterfaceC9768 interfaceC97610 = this.f40339;
        if (interfaceC9769 != interfaceC97610 || c5429.f12952 != interfaceC97610.mo28581() || c5429.f12953 != c16689M20550 || c5429.f12949 != iM51556 || c5429.f12947 != C23223.m51768()) {
            this.f40267 = null;
            return;
        }
        boolean z = this.f40339.length() > 1000000;
        if (z) {
            int i3 = c5429.f12954;
            if (i3 == -1) {
                c5429.f12954 = i;
                c5429.f12948 = i2;
            } else if (i3 != i || c5429.f12948 != i2) {
                this.f40267 = null;
                return;
            }
        }
        if (z) {
            zM20549 = this.f40252.m20543(i, i2);
        } else {
            zM20549 = this.f40252.m20549();
        }
        if (!zM20549) {
            if (c5429.f12950 < 0) {
                if (z) {
                }
            }
            this.f40267 = null;
        } else if (m32547()) {
            if (!c5429.f12951) {
                this.f40267 = null;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (c5429.f12950 < 0) {
                c5429.f12950 = jUptimeMillis;
            }
            float fMin = Math.min(1.0f, (jUptimeMillis - c5429.f12950) / 300.0f);
            this.f40252.m20509(fMin, c5429.f12949);
            if (fMin < 1.0f) {
                postInvalidateOnAnimation();
            } else {
                this.f40267 = null;
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        InterfaceC9768 interfaceC9768 = this.f40339;
        int saveCount = canvas.getSaveCount();
        try {
            try {
                m32188(canvas);
                canvas.restoreToCount(saveCount);
            } catch (Throwable th) {
                canvas.restoreToCount(saveCount);
                throw th;
            }
        } catch (UncheckedIOException | C6138 e) {
            if (!m32421(interfaceC9768, e)) {
                throw e;
            }
            canvas.restoreToCount(saveCount);
        }
    }

    /* JADX INFO: renamed from: ۤᩳ */
    private void m32261() {
        int scrollX = getScrollX();
        int i = this.f40187;
        ViewOnTouchListenerC18840 viewOnTouchListenerC18840 = this.f40232;
        boolean z = true;
        boolean z2 = viewOnTouchListenerC18840 != null && viewOnTouchListenerC18840.f56273;
        if ((this.f40221 || this.f40284 || this.f40324 || z2) && this.f40191 != 0) {
            int iUptimeMillis = ((int) ((((int) (SystemClock.uptimeMillis() - this.f40241)) / 20.0f) * this.f40191)) + i;
            int iM32585 = m32585(iUptimeMillis);
            if (iM32585 != i) {
                this.f40302.forceFinished(true);
                this.f40224.removeMessages(1);
                m32187(scrollX, iM32585, true);
                this.f40241 = SystemClock.uptimeMillis();
                postInvalidateOnAnimation();
                if (this.f40324) {
                    m32489(this.f40306, this.f40310);
                } else if (z2) {
                    this.f40232.m42906(this.f40306, this.f40310);
                } else if (this.f40221) {
                    m32560(this.f40306, this.f40310);
                } else {
                    m32540(this.f40306, this.f40310);
                }
            } else {
                if (iUptimeMillis == iM32585) {
                    postInvalidateOnAnimation();
                }
                z = false;
            }
        } else {
            z = false;
        }
        if (this.f40279 != z) {
            this.f40279 = z;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m32214(Rect rect, int i, int i2, int i3, int i4) {
        if (i3 > 0 && i4 > 0) {
            if (!mo27926()) {
                rect.set(i, i2, i3 + i, i4 + i2);
                return true;
            }
            Rect rect2 = this.f40282;
            if (!getLocalVisibleRect(rect2)) {
                return false;
            }
            rect2.offset(0, i2 - getScrollY());
            int iMax = Math.max(0, i);
            int iMax2 = Math.max(0, i2);
            int iMax3 = Math.max(iMax, i + i3);
            int iMax4 = Math.max(iMax2, i2 + i4);
            int iM32185 = m32185(rect2.left - getPaddingLeft(), iMax, iMax3);
            int iM32186 = m32185(rect2.top - getPaddingTop(), iMax2, iMax4);
            int iM32187 = m32185(rect2.right - getPaddingLeft(), iMax, iMax3);
            int iM32188 = m32185(rect2.bottom - getPaddingTop(), iMax2, iMax4);
            int iMax5 = Math.max(iM32187 - iM32185, 0);
            int iMax6 = Math.max(iM32188 - iM32186, 0);
            if (iMax5 != 0 && iMax6 != 0) {
                rect.set(iM32185, iM32186, iMax5 + iM32185, iMax6 + iM32186);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܶ֫ */
    public final int m32527() {
        int iM32458 = m32458();
        if (iM32458 <= 0) {
            return 0;
        }
        return Math.max((int) (this.f40275.mo10196() - iM32458), 0);
    }

    /* JADX INFO: renamed from: ᩸֫ */
    public final int m32592() {
        int iM32606 = m32606();
        if (iM32606 <= 0) {
            return 0;
        }
        return Math.max((int) (this.f40275.m11833() - ((double) iM32606)), 0);
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m32454(int i) {
        if (i < 0) {
            return 0;
        }
        int iM32527 = m32527();
        return i > iM32527 ? iM32527 : i;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m32585(int i) {
        if (i < 0) {
            return 0;
        }
        int iM32592 = m32592();
        return i > iM32592 ? iM32592 : i;
    }

    /* JADX INFO: renamed from: ֨ */
    public final boolean m32364() {
        OverScroller overScroller = this.f40302;
        if (!overScroller.isFinished()) {
            float currVelocity = overScroller.getCurrVelocity();
            if (currVelocity == 0.0f || currVelocity >= 5000.0f) {
                return false;
            }
        }
        InterfaceC20143 interfaceC20143 = this.f40262.f75978;
        if (m32465()) {
            return interfaceC20143 == null || interfaceC20143.mo23640();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠ */
    public final boolean m32465() {
        return !this.f40312 || SystemClock.uptimeMillis() - this.f40210 >= 100;
    }

    /* JADX INFO: renamed from: ۬֫ */
    public static void m32290(C14146 c14146) {
        if (c14146.f40312) {
            c14146.f40312 = false;
            c14146.f40224.removeMessages(6);
            c14146.invalidate();
            InterfaceC20143 interfaceC20143 = c14146.f40262.f75978;
            if (interfaceC20143 != null) {
                interfaceC20143.mo23635();
            }
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f40209) {
            return;
        }
        InterfaceC9768 interfaceC9768 = this.f40339;
        try {
            m32306(getScrollX(), this.f40187);
            m32357();
            m32261();
            C14816 c14816 = this.f40313;
            if (c14816 != null && !c14816.m33846(this)) {
                m32255();
            }
            if (this.f40302.computeScrollOffset()) {
                int scrollX = getScrollX();
                int i = this.f40187;
                int currX = this.f40302.getCurrX();
                int currY = this.f40302.getCurrY();
                if (currY != i) {
                    m32517();
                    if (this.f40338 && this.f40262.f76009) {
                        if (i > 0 && currY <= 0) {
                            this.f40320.onAbsorb((int) this.f40302.getCurrVelocity());
                        } else {
                            int iM32592 = m32592();
                            if (i < iM32592 && currY >= iM32592) {
                                this.f40206.onAbsorb((int) this.f40302.getCurrVelocity());
                            }
                        }
                    }
                }
                if (currX != scrollX) {
                    m32506();
                    if (this.f40338 && (edgeEffect = this.f40233) != null && this.f40292 != null && this.f40262.f76009) {
                        if (scrollX > 0 && currX <= 0) {
                            edgeEffect.onAbsorb((int) this.f40302.getCurrVelocity());
                        } else {
                            int iM32527 = m32527();
                            if (scrollX < iM32527 && currX >= iM32527) {
                                this.f40292.onAbsorb((int) this.f40302.getCurrVelocity());
                            }
                        }
                    }
                }
                m32245();
                this.f40219.incrementAndGet();
                m32187(currX, currY, false);
                invalidate();
            }
            if (this.f40302.isFinished()) {
                this.f40313 = null;
            }
        } catch (UncheckedIOException | C6138 e) {
            if (!m32421(interfaceC9768, e)) {
                throw e;
            }
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m32507();
        this.f40232.f56272 = 0L;
        if (z || this.f40188) {
            m32232();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘᩳ */
    public void m32232() {
        m32308();
        if (m32583() || this.f40294 || this.f40275.f12815 != this.f40339) {
            this.f40188 = true;
            return;
        }
        if (this.f40321) {
            if (isAttachedToWindow()) {
                C7050.m16213(new Runnable() { // from class: l.ܿۛᩳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f55775.m32232();
                    }
                }, 100L);
                return;
            }
            return;
        }
        this.f40188 = false;
        boolean zM11839 = this.f40275.m11839();
        boolean zM11816 = this.f40275.m11816();
        int scrollX = getScrollX();
        if (this.f40275.mo10193()) {
            scrollX = m32454(scrollX);
        } else {
            this.f40275.mo11827(m32458());
        }
        if (this.f40294) {
            return;
        }
        this.f40302.forceFinished(true);
        m32187(scrollX, m32585(this.f40187), false);
        if (!m32357() && this.f40335 == null && this.f40261 == null) {
            if (zM11839 || zM11816) {
                int iM32508 = m32508();
                int iM32512 = m32512();
                if (iM32508 > iM32512) {
                    iM32512 = iM32508;
                    iM32508 = iM32512;
                }
                if (!zM11839) {
                    iM32508 = iM32512;
                }
                m32413(iM32508, false);
                m32507();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m32416(CharSequence charSequence) {
        try {
            this.f40195.setPrimaryClip(ClipData.newPlainText(null, charSequence));
            return true;
        } catch (Throwable unused) {
            C22682.m50793(R.string.MT_Protector);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۡۧ */
    public final boolean m32473() {
        try {
            return this.f40195.hasPrimaryClip();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m32530(int i) {
        C6495 c6495 = this.f40264;
        InterfaceC9768 interfaceC9768 = this.f40339;
        if (c6495 == interfaceC9768) {
            return;
        }
        try {
            m32348(i);
        } catch (UncheckedIOException | C6138 e) {
            if (!m32421(interfaceC9768, e)) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ᩹ */
    private void m32348(int i) {
        String string;
        int iM32508 = m32508();
        int iM32512 = m32512();
        if (iM32508 > iM32512) {
            iM32512 = iM32508;
            iM32508 = iM32512;
        }
        boolean z = this.f40262.f75997;
        if (z && i == 16908320) {
            i = android.R.id.copy;
        }
        HandlerC15329 handlerC15329 = this.f40224;
        if (i != 16908328) {
            switch (i) {
                case android.R.id.selectAll:
                    if (this.f40339.length() > 0) {
                        mo27944(0, this.f40339.length());
                        handlerC15329.sendEmptyMessageDelayed(2, m32413(this.f40339.length(), false) ? 250L : 50L);
                    }
                    break;
                case android.R.id.cut:
                    if (iM32508 != iM32512 && m32416(this.f40339.subSequence(iM32508, iM32512))) {
                        this.f40339.delete(iM32508, iM32512);
                        invalidate();
                        m32480();
                        break;
                    }
                    break;
                case android.R.id.copy:
                    if (iM32508 != iM32512 && m32416(this.f40339.subSequence(iM32508, iM32512))) {
                        m32480();
                        break;
                    }
                    break;
                case android.R.id.paste:
                    if (!z && m32473()) {
                        try {
                            CharSequence text = this.f40195.getText();
                            string = text != null ? text.toString() : "";
                        } catch (Throwable th) {
                            string = th.toString();
                        }
                        String string2 = C23929.m53007(string).toString();
                        this.f40339.replace(iM32508, iM32512, string2);
                        mo27941(string2.length() + iM32508);
                        m32409(false);
                        m32480();
                        break;
                    }
                    break;
                default:
                    switch (i) {
                        case android.R.id.undo:
                            m32548();
                            break;
                        case android.R.id.redo:
                            m32362();
                            break;
                        default:
                            System.out.println("onTextContextMenuItem: " + i);
                            break;
                    }
                    break;
            }
            return;
        }
        m32562(m32508(), true);
        handlerC15329.sendEmptyMessageDelayed(2, 100L);
    }

    /* JADX INFO: renamed from: ۟ܽ */
    public final void m32464() {
        this.f40297 = SystemClock.uptimeMillis();
        HandlerC15329 handlerC15329 = this.f40224;
        handlerC15329.removeMessages(4);
        handlerC15329.sendEmptyMessageAtTime(4, SystemClock.uptimeMillis() + 500);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        m32350();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        m32339();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        AbstractC5390 abstractC5390;
        super.onWindowVisibilityChanged(i);
        if (i == 0 || (abstractC5390 = this.f40275) == null) {
            return;
        }
        abstractC5390.m11829();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        AbstractC5390 abstractC5390;
        super.onVisibilityChanged(view, i);
        if (i == 0 || (abstractC5390 = this.f40275) == null) {
            return;
        }
        abstractC5390.m11829();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        HandlerC15329 handlerC15329 = this.f40224;
        if (z) {
            handlerC15329.m34891();
            m32464();
            return;
        }
        m32342();
        handlerC15329.m34890();
        this.f40297 = 0L;
        this.f40280 = 0L;
        invalidate();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            m32342();
            m32451();
            m32507();
        } else {
            this.f40297 = SystemClock.uptimeMillis();
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m32495(ExtractedTextRequest extractedTextRequest, ExtractedText extractedText) {
        InterfaceC9768 interfaceC9768;
        int iM22748;
        int i;
        if (extractedTextRequest == null || (interfaceC9768 = this.f40339) == null) {
            return false;
        }
        extractedText.startOffset = 0;
        int length = interfaceC9768.length();
        if (this.f40317) {
            int[] iArrM32433 = m32433();
            iM22748 = iArrM32433[0];
            int i2 = iArrM32433[1];
            if (i2 - iM22748 > 10000) {
                length = iM22748 + 10000;
            } else {
                if (iM22748 >= 1000) {
                    C9729 c9729Mo28589 = interfaceC9768.mo28589();
                    try {
                        iM22748 = c9729Mo28589.m22748(c9729Mo28589.m22745(iM22748 - 999));
                        c9729Mo28589.close();
                    } catch (Throwable th) {
                        try {
                            c9729Mo28589.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    iM22748 = 0;
                }
                if (i2 - iM22748 <= 10000) {
                    i = iM22748 + 10000;
                } else {
                    int i3 = iArrM32433[1];
                    int i4 = iArrM32433[0];
                    int i5 = (10000 - (i3 - i4)) / 2;
                    int i6 = i3 + i5;
                    iM22748 = i4 - i5;
                    i = i6;
                }
                if (iM22748 < 0) {
                    iM22748 = 0;
                }
                if (i <= length) {
                    length = i;
                }
            }
            extractedText.partialEndOffset = -1;
            extractedText.partialStartOffset = -1;
            extractedText.startOffset = iM22748;
        } else {
            extractedText.partialEndOffset = -1;
            extractedText.partialStartOffset = -1;
            iM22748 = 0;
        }
        extractedText.text = interfaceC9768.mo28590(iM22748, length);
        extractedText.flags = 0;
        if (MetaKeyKeyListener.getMetaState(this.f40339, 2048) != 0) {
            extractedText.flags |= 2;
        }
        if (mo27920()) {
            extractedText.flags |= 1;
        }
        extractedText.selectionStart = m32508() - extractedText.startOffset;
        extractedText.selectionEnd = m32512() - extractedText.startOffset;
        if (Build.VERSION.SDK_INT >= 28) {
            extractedText.hint = this.f40275.f12806;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m32415(ExtractedTextRequest extractedTextRequest, ExtractedText extractedText) {
        InterfaceC9768 interfaceC9768 = this.f40339;
        try {
            return m32495(extractedTextRequest, extractedText);
        } catch (UncheckedIOException | C6138 e) {
            if (m32421(interfaceC9768, e)) {
                return false;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m32518() {
        C16157 c16157 = this.f40334;
        if (c16157 != null) {
            int i = c16157.f47589 + 1;
            c16157.f47589 = i;
            if (i == 1) {
                if (c16157.f47593) {
                    c16157.f47591 = 0;
                    c16157.f47590 = this.f40339.length();
                } else {
                    c16157.f47591 = -1;
                    c16157.f47590 = -1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩺ */
    public final void m32598() {
        int i;
        boolean z;
        C16157 c16157 = this.f40334;
        if (c16157 != null && (i = c16157.f47589) > 0) {
            int i2 = i - 1;
            c16157.f47589 = i2;
            if (i2 == 0 && (((z = c16157.f47593) || c16157.f47592) && c16157 != null && (z || c16157.f47592))) {
                c16157.f47593 = false;
                c16157.f47592 = false;
            }
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ᩸ */
    public final C5154 m32591() {
        if (Looper.myLooper() != Looper.getMainLooper() || this.f40339.length() != 0 || this.f40294 || this.f40204 || this.f40321 || this.f40261 != null || this.f40275.mo11814() || this.f40339.mo4003()) {
            throw new IllegalStateException("Initial session state requires an idle empty foreground view");
        }
        return C5154.m11003(0, 0, this.f40217, this.f40317, this.f40213, this.f40254, this.f40262, this.f40215, this.f40260);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32388(C5154 c5154, C21405 c21405, C6495 c6495, C22864 c22864) {
        if (Looper.myLooper() != Looper.getMainLooper() || c22864 == null || c22864 != this.f40239 || !c22864.f71993 || this.f40294 || this.f40204 || m32434() || this.f40194 != null) {
            throw new IllegalStateException("Session layout configuration requires its idle reserved view");
        }
        if (c5154.f12125 > c6495.length() || c5154.f12116 > c6495.length()) {
            throw new IllegalArgumentException("Session search range exceeds text length");
        }
        C5154 c5154M11003 = C5154.m11003(getScrollX(), this.f40187, this.f40217, this.f40317, this.f40213, this.f40254, this.f40262, this.f40215, this.f40260);
        C16827 c16827 = new C16827(c22864, c5154, c21405, c6495, this.f40339, this.f40275, c5154M11003);
        this.f40194 = c16827;
        try {
            m32267(c5154, c21405);
            AbstractC5390 abstractC5390M11789 = AbstractC5390.m11789(this, c16827.f49814, this.f40262, this.f40217);
            c16827.f49805 = abstractC5390M11789;
            m32190(abstractC5390M11789, true);
        } catch (Error | RuntimeException e) {
            m32267(c5154M11003, (C21405) null);
            if (this.f40275 == c16827.f49805) {
                m32190(c16827.f49815, true);
            }
            this.f40194 = null;
            c16827.f49814.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m32417(C5154 c5154) {
        C16827 c16827 = this.f40194;
        if (c16827 == null) {
            return false;
        }
        if (c16827.f49810 == c5154) {
            C6495 c6495 = c16827.f49811;
            InterfaceC9768 interfaceC9768 = this.f40339;
            if (c6495 == interfaceC9768 && c16827.f49805 == this.f40275 && c16827.f49809 && c16827.f49813 == interfaceC9768.mo28581() && !c16827.f49817 && c16827.f49808 == this.f40239) {
                c16827.f49817 = true;
                m32189(c5154, c16827.f49816, c16827);
                return true;
            }
        }
        throw new IllegalStateException("Prepared session layout does not belong to this restoration");
    }

    /* JADX INFO: renamed from: ۧ */
    private void m32277(C22864 c22864) {
        AbstractC5390 abstractC5390;
        C16827 c16827 = this.f40194;
        if (c16827 != null) {
            C5154 c5154 = c16827.f49812;
            C2628 c2628 = c16827.f49814;
            if (c16827.f49808 != c22864) {
                return;
            }
            this.f40194 = null;
            try {
                if (this.f40339 == c16827.f49818 && (abstractC5390 = this.f40275) == c16827.f49805 && abstractC5390.f12815 == c2628) {
                    m32267(c5154, (C21405) null);
                    m32190(c16827.f49815, true);
                    m32187(c5154.f12118, c5154.f12117, true);
                }
            } finally {
                c2628.close();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C6731 m32486(InterfaceC9768 interfaceC9768) {
        int scrollX;
        C16827 c16827 = this.f40194;
        if (c16827 == null) {
            return null;
        }
        C5154 c5154 = c16827.f49810;
        if (c16827.f49811 != interfaceC9768) {
            return null;
        }
        int iM32262 = m32262(c5154);
        if (c16827.f49816 == null && this.f40275.mo10193()) {
            scrollX = c5154.m11018() ? c5154.f12118 : getScrollX();
        } else {
            scrollX = 0;
        }
        return new C6731(Math.max(0, scrollX), Math.max(0, iM32262), m32458(), m32606());
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m32419(C6495 c6495, C5486 c5486) {
        C22864 c22864;
        C16827 c16827 = this.f40194;
        if (Looper.myLooper() != Looper.getMainLooper() || c16827 == null || c16827.f49811 != c6495 || c6495 != this.f40339 || c16827.f49805 != this.f40275 || !c16827.f49809 || c16827.f49817 || this.f40294 || this.f40273 || c16827.f49813 != c6495.mo28581() || (c22864 = c16827.f49808) != this.f40239 || !c22864.f71993) {
            return false;
        }
        if ((c5486 != null && c5486.f13129) || c16827.f49810.f12125 >= 0 || !this.f40275.mo11814()) {
            return false;
        }
        C6731 c6731M32486 = m32486((InterfaceC9768) c6495);
        if (c6731M32486.m15389() <= 0 || c6731M32486.m15388() <= 0 || !this.f40275.mo10200(c6731M32486) || !this.f40275.mo11824(Math.max(m32508(), m32512()))) {
            return false;
        }
        AbstractC5390 abstractC5390 = this.f40275;
        c16827.f49806 = new C6770(abstractC5390, abstractC5390.mo10197(), c6731M32486);
        c16827.f49807 = true;
        return true;
    }

    /* JADX INFO: renamed from: ܰ */
    public final void m32514() {
        C16827 c16827 = this.f40194;
        if (c16827 != null) {
            c16827.f49807 = false;
        }
    }

    /* JADX INFO: renamed from: ۤ֫ */
    public final Throwable m32481() {
        return this.f40264 == this.f40339 ? this.f40269 : this.f40275.mo10204();
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m32543(AbstractC5390 abstractC5390) {
        C16827 c16827 = this.f40194;
        C6770 c6770 = c16827 == null ? null : c16827.f49806;
        if (c6770 == null) {
            return false;
        }
        C6495 c6495 = c16827.f49811;
        InterfaceC9768 interfaceC9768 = this.f40339;
        return c6495 == interfaceC9768 && c16827.f49813 == interfaceC9768.mo28581() && abstractC5390 == this.f40275 && c6770.f17534 == abstractC5390 && !this.f40273 && c6770.f17533 == c6770.f17534.mo10197() && c6770.f17536.m15389() == m32458() && c6770.f17536.m15388() == m32606() && c6770.f17534.mo10200(c6770.f17536);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m32497(C6495 c6495) {
        C16827 c16827 = this.f40194;
        if (Looper.myLooper() != Looper.getMainLooper() || c16827 == null || c16827.f49811 != c6495 || !c16827.f49817 || !m32543(this.f40275) || getScrollX() != c16827.f49806.f17536.m15390() || this.f40187 != c16827.f49806.f17536.m15391()) {
            return false;
        }
        c16827.f49806.f17535 = true;
        postInvalidate();
        return true;
    }

    /* JADX INFO: renamed from: ۙ */
    public final void m32441() {
        C16827 c16827 = this.f40194;
        if ((Looper.myLooper() != Looper.getMainLooper() || c16827 == null || !c16827.f49807 || !m32543(this.f40275) || this.f40294 || this.f40204 || this.f40339.mo4003() || c16827.f49808 != this.f40239) && !m32463()) {
            throw new IllegalStateException("Session view restoration requires an idle foreground owner");
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private int m32262(C5154 c5154) {
        if (!c5154.m11018()) {
            return this.f40187;
        }
        float f = this.f40230;
        if (f > 0.0f) {
            return (int) Math.min(2147483647L, Math.round((((double) c5154.f12117) / ((double) f)) * ((double) this.f40262.m26496())));
        }
        return c5154.f12117;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m32267(C5154 c5154, C21405 c21405) {
        C14873 c14873 = c5154.f12122;
        C23929 c23929 = this.f40262;
        if (c14873 != null) {
            c14873.m33978(c23929);
        }
        C14873 c14874 = c5154.f12122;
        float fM26496 = 0.0f;
        if (c14874 != null) {
            float f = c14874.f42384;
            fM26496 = f > 0.0f ? f : c23929.m26496();
        }
        this.f40230 = fM26496;
        if (c5154.m11018()) {
            this.f40217 = c5154.f12115;
            this.f40317 = c5154.f12121;
            this.f40213 = c5154.f12114;
            this.f40254 = c5154.f12120;
        }
        if (c21405 != null) {
            c23929.mo26489(c21405.f67517);
            int i = c21405.f67509;
            if (i != c21405.f67514 || c21405.f67522 != c21405.f67523 || (i == 1 && !C12826.equals(c21405.f67518, c21405.f67516))) {
                c23929.m53010(c21405.f67522 * c23929.f32000, c21405.f67509);
            }
            boolean z = c21405.f67504;
            if (z != c21405.f67512) {
                c23929.f75992 = z;
                if (z) {
                    c23929.f76022 = c21405.f67502;
                }
            }
            c23929.f75988 = c21405.f67521;
            c23929.m26506(c21405.f67524);
            c23929.m26509(c21405.f67505);
            c23929.f75986 = c21405.f67510;
            c23929.m26490(c21405.f67507);
            this.f40217 = c21405.f67519;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32387(C5154 c5154, C21405 c21405) {
        m32189(c5154, c21405, (C16827) null);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m32189(C5154 c5154, C21405 c21405, C16827 c16827) {
        int scrollX;
        m32441();
        if (c5154.f12125 > this.f40339.length() || c5154.f12116 > this.f40339.length()) {
            throw new IllegalArgumentException("Session search range exceeds text length");
        }
        m32502();
        this.f40321 = true;
        this.f40252.m20520();
        if (c16827 == null) {
            try {
                m32267(c5154, c21405);
            } catch (Throwable th) {
                this.f40321 = false;
                m32435();
                this.f40190.m19806(this.f40339);
                this.f40252.m20546(this.f40339);
                m32229();
                throw th;
            }
        }
        m32353();
        if (c5154.m11019()) {
            C23929 c23929 = this.f40262;
            c23929.f75975 = c5154.f12125;
            c23929.f75954 = c5154.f12116;
        }
        c5154.m11016(this.f40215, this.f40260);
        this.f40302.forceFinished(true);
        this.f40224.removeMessages(1);
        this.f40252.m20521();
        this.f40332.m54669();
        if (c16827 == null) {
            m32190(AbstractC5390.m11789(this, this.f40339, this.f40262, this.f40217), true);
        }
        this.f40238 = -1.0f;
        m32291();
        this.f40219.incrementAndGet();
        if (c21405 == null) {
            scrollX = c5154.m11018() ? c5154.f12118 : getScrollX();
        } else {
            scrollX = 0;
        }
        int iM32262 = m32262(c5154);
        AbstractC5390 abstractC5390 = this.f40275;
        InterfaceC9768 interfaceC9768 = this.f40339;
        this.f40261 = new C23534(abstractC5390, interfaceC9768, interfaceC9768.mo28581(), scrollX, iM32262);
        m32187(m32454(scrollX), m32585(iM32262), true);
        m32296(this.f40275);
        C23929 c239210 = this.f40262;
        if (c239210.f75992) {
            m32381(c239210.f76022, true);
        } else if (c21405 != null && c21405.f67504 != c21405.f67512) {
            m32381((String) null, false);
        }
        m32529();
        this.f40321 = false;
        m32435();
        this.f40190.m19806(this.f40339);
        this.f40252.m20546(this.f40339);
        m32229();
        if (this.f40262.f75992 && this.f40252.m20523()) {
            this.f40332.m54661(this.f40252.m20536());
        } else {
            this.f40332.m54661(C24894.f79502);
        }
        m32469();
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: ۟ۧ */
    public final boolean m32463() {
        if (Looper.myLooper() != Looper.getMainLooper() || !(this.f40339 instanceof C6495) || m32583() || this.f40294 || this.f40204 || this.f40321 || this.f40261 != null) {
            return false;
        }
        C16827 c16827 = this.f40194;
        return ((c16827 != null && !c16827.f49809) || this.f40275.mo11814() || this.f40339.mo4003()) ? false : true;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m32572() {
        if (Looper.myLooper() != Looper.getMainLooper() || !(this.f40339 instanceof C6495) || this.f40294 || this.f40204 || this.f40321) {
            return false;
        }
        C16827 c16827 = this.f40194;
        return (c16827 == null || c16827.f49809) && !this.f40339.mo4003();
    }

    /* JADX INFO: renamed from: ᩶ */
    public final C5154 m32581() {
        if (m32572()) {
            return C5154.m11003(getScrollX(), this.f40187, this.f40217, this.f40317, this.f40213, this.f40254, this.f40262, this.f40215, this.f40260);
        }
        throw new IllegalStateException("Session view state requires a stable foreground owner");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32390(RunnableC7265 runnableC7265) {
        this.f40289.add(runnableC7265);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m32493(RunnableC7265 runnableC7265) {
        this.f40289.remove(runnableC7265);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۗᩳ */
    public void m32229() {
        if (!this.f40289.isEmpty()) {
            C7050.m16212(new RunnableC9966(0, this));
        }
        synchronized (this.f40277) {
            final C21523 c21523 = this.f40285;
            if (c21523 != null && !c21523.f67904) {
                c21523.f67904 = true;
                C7050.m16212(new Runnable() { // from class: l.᩹ۛᩳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C14146.m32209(this.f74488, c21523);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m32192(C14146 c14146) {
        Iterator it = c14146.f40289.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final FutureC5767 m32537(C6495 c6495) {
        C21523 c21523;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Session view readiness requires the foreground thread");
        }
        synchronized (this.f40277) {
            if (this.f40339 != c6495) {
                throw new IllegalStateException("Session readiness owner is not installed in the view");
            }
            if (c6495.mo4003()) {
                throw new IllegalStateException("Cannot await view readiness during text replacement");
            }
            c21523 = this.f40285;
            if (c21523 == null) {
                c21523 = new C21523(c6495, this.f40275, c6495.mo28581());
                this.f40285 = c21523;
            }
        }
        m32229();
        return c21523.f67905.m12898((InterfaceC22729) new C7284());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m32209(C14146 c14146, C21523 c21523) {
        synchronized (c14146.f40277) {
            if (c14146.f40285 != c21523) {
                return;
            }
            c21523.f67904 = false;
            InterfaceC9768 interfaceC9768 = c14146.f40339;
            boolean z = (interfaceC9768 == c21523.f67908 && c14146.f40275 == c21523.f67906 && interfaceC9768.mo28581() == c21523.f67907) ? false : true;
            if (z || !(c14146.m32583() || c14146.f40294 || c14146.f40204 || c14146.f40321 || c14146.f40304 || c14146.f40261 != null || c14146.f40275.mo11814() || c14146.f40339.mo4003())) {
                c14146.f40285 = null;
                Throwable thM32481 = c14146.m32481();
                if (!z && thM32481 != null) {
                    c21523.f67905.m12891(thM32481);
                } else if (z) {
                    c21523.f67905.m12891((Throwable) new CancellationException("Session view preparation was superseded"));
                } else {
                    c21523.f67905.m12889((Object) null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private void m32316(final String str) {
        final C21523 c21523;
        synchronized (this.f40277) {
            c21523 = this.f40285;
            this.f40285 = null;
        }
        if (c21523 != null) {
            C7050.m16212(new Runnable() { // from class: l.֨ۛᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    TextKeyListener textKeyListener = C14146.f40186;
                    c21523.f67905.m12891((Throwable) new CancellationException(str));
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۜᩳ */
    private void m32245() {
        if (this.f40261 == null || this.f40321) {
            return;
        }
        this.f40261 = null;
        this.f40219.incrementAndGet();
        m32229();
    }

    /* JADX INFO: renamed from: ۜܽ */
    public final int m32460() {
        return this.f40219.get();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m32418(AbstractC5390 abstractC5390) {
        C23534 c23534 = this.f40261;
        return c23534 != null && c23534.f74971 == abstractC5390;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m32564(AbstractC5390 abstractC5390) {
        if (this.f40261 != null) {
            C7050.m16212(new RunnableC18012(0, this, abstractC5390));
        }
        m32229();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ */
    public void m32296(AbstractC5390 abstractC5390) {
        C23534 c23534 = this.f40261;
        if (c23534 == null || c23534.f74971 != abstractC5390) {
            return;
        }
        if (this.f40275 != abstractC5390 || this.f40339 != c23534.f74972 || this.f40339.mo28581() != c23534.f74973) {
            this.f40261 = null;
            m32229();
        } else {
            if (abstractC5390.mo11814()) {
                return;
            }
            this.f40261 = null;
            this.f40219.incrementAndGet();
            if (abstractC5390 instanceof C4816) {
                ((C4816) abstractC5390).m10208(c23534.f74975, m32458());
            }
            m32187(m32454(c23534.f74975), m32585(c23534.f74974), true);
            m32229();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32395(C11996 c11996, boolean z) {
        if (this.f40339 instanceof C6495) {
            throw new IllegalStateException("Session text requires the session recovery protocol");
        }
        c11996.writeInt(-249340294);
        c11996.m27456();
        c11996.writeByte(0);
        c11996.m27456();
        this.f40339.mo3992(c11996);
        c11996.writeInt(this.f40339.mo14913());
        c11996.m27438();
        c11996.writeByte(1);
        c11996.m27456();
        c11996.writeInt(this.f40288);
        c11996.writeInt(this.f40243);
        c11996.writeInt(this.f40244);
        c11996.m27438();
        c11996.writeByte(2);
        c11996.m27456();
        c11996.writeInt(m32508());
        c11996.writeInt(m32512());
        c11996.writeInt(getScrollX());
        c11996.writeInt(this.f40187);
        c11996.writeByte((byte) this.f40217);
        c11996.m27445(this.f40317);
        c11996.m27445(this.f40213);
        c11996.m27445(this.f40254);
        c11996.m27438();
        c11996.writeByte(10);
        c11996.m27456();
        c11996.m27451(this.f40339.mo4004());
        c11996.m27451(this.f40339.mo3999().m54732());
        c11996.m27438();
        c11996.writeByte(11);
        c11996.m27456();
        this.f40215.m52091(c11996);
        this.f40260.m52091(c11996);
        c11996.m27438();
        c11996.writeByte(4);
        c11996.m27456();
        this.f40262.m53012(c11996);
        c11996.m27438();
        c11996.writeByte(7);
        c11996.m27456();
        c11996.writeInt(this.f40262.f75975);
        c11996.writeInt(this.f40262.f75954);
        c11996.m27438();
        c11996.writeByte(5);
        c11996.m27456();
        this.f40275.mo10192(c11996);
        c11996.m27438();
        if (z) {
            c11996.writeByte(9);
            c11996.m27456();
            this.f40252.m20513(c11996);
            c11996.m27438();
        }
        c11996.writeByte(-1);
        c11996.m27438();
        c11996.writeInt(-249340294);
    }

    /* JADX WARN: Code duplicated, block: B:152:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x0015 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۧ */
    private void m32274(C14677 c14677) {
        String str;
        int iM12622;
        InterfaceC9768 c2628;
        InterfaceC9768 interfaceC9768;
        C7836 c7836M18116;
        AbstractC5390 c18976;
        String str2;
        if (!c14677.m33577(-249340294)) {
            throw new RuntimeException("Bad instance state magic");
        }
        int iM33575 = c14677.m33575() + c14677.readInt();
        boolean z = false;
        boolean z2 = false;
        while (true) {
            byte b = c14677.readByte();
            C23416 c23416 = this.f40260;
            C23416 c23417 = this.f40215;
            C8898 c8898 = this.f40252;
            C23929 c23929 = this.f40262;
            if (b != -1) {
                int iM33576 = c14677.m33575() + c14677.readInt();
                switch (b) {
                    case 0:
                        int iMo3989 = this.f40339.mo3989();
                        int iM33587 = c14677.m33587();
                        boolean z3 = iM33587 == -500019884 || iM33587 == -483177132;
                        if (z3) {
                            C2628 c2628M3986 = C2628.m3986(c14677, iM33576 - 4);
                            iM12622 = c2628M3986.hashCode();
                            interfaceC9768 = c2628M3986;
                        } else {
                            if (c14677.m33587() == -500018348) {
                                c7836M18116 = C7836.m18116(c14677, this.f40249);
                                iM12622 = c7836M18116.hashCode();
                                if (this.f40202) {
                                    try {
                                        try {
                                            interfaceC9768 = c7836M18116;
                                            c2628 = C2628.m3988(c7836M18116);
                                            c7836M18116.close();
                                        } catch (IOException e) {
                                            throw new UncheckedIOException(e);
                                        }
                                    } catch (Throwable th) {
                                        c7836M18116.close();
                                        throw th;
                                    }
                                }
                            } else {
                                C5666 c5666M34421 = C15053.m34421(c14677, this.f40249);
                                iM12622 = c5666M34421.m12622();
                                c2628 = new C2628(c5666M34421.m12623());
                            }
                            interfaceC9768 = c2628;
                        }
                        interfaceC9768 = c7836M18116;
                        int i = c14677.readInt();
                        if (z3 && i != iM12622) {
                            interfaceC9768.mo14910(false);
                            throw new IllegalArgumentException("Memory text state checksum mismatch");
                        }
                        InterfaceC9768 interfaceC9769 = this.f40339;
                        m32317(interfaceC9768);
                        this.f40190.m19807(this.f40339);
                        c8898.m20521();
                        this.f40332.m54669();
                        interfaceC9769.mo14910(false);
                        this.f40339.mo3990(iMo3989);
                        InterfaceC9768 interfaceC97610 = this.f40339;
                        interfaceC97610.setSpan(this.f40265, 0, interfaceC97610.length(), 8388626);
                        z = i != iM12622;
                        if (c14677.m33575() != iM33576) {
                            c14677.seek(iM33576);
                        }
                        break;
                        break;
                    case 1:
                        this.f40288 = c14677.readInt();
                        this.f40243 = c14677.readInt();
                        int i2 = c14677.readInt();
                        this.f40244 = i2;
                        this.f40339.mo3998(this.f40243 != i2);
                        if (c14677.m33575() != iM33576) {
                            c14677.seek(iM33576);
                        }
                        break;
                    case 2:
                        this.f40339.setSelection(c14677.readInt(), c14677.readInt());
                        this.f40302.forceFinished(true);
                        HandlerC15329 handlerC15329 = this.f40224;
                        handlerC15329.removeMessages(1);
                        final int i3 = c14677.readInt();
                        final int i4 = c14677.readInt();
                        m32187(i3, i4, true);
                        handlerC15329.post(new Runnable() { // from class: l.᩵ۛᩳ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C14146.m32194(this.f63903, i3, i4);
                            }
                        });
                        this.f40217 = c14677.readByte() & 255;
                        this.f40317 = c14677.m33585();
                        this.f40213 = c14677.m33585();
                        this.f40254 = c14677.m33585();
                        this.f40238 = -1.0f;
                        m32291();
                        if (c14677.m33575() != iM33576) {
                            c14677.seek(iM33576);
                        }
                        break;
                    case 3:
                        m32275(c14677, iM33576);
                        m32275(c14677, iM33576);
                        c23417.m52092(c14677);
                        c23416.m52092(c14677);
                        if (c14677.m33575() != iM33576) {
                            c14677.seek(iM33576);
                        }
                        break;
                    case 4:
                        c23929.getClass();
                        c23929.f76018 = c14677.m33591();
                        c23929.f75988 = c14677.m33585();
                        c23929.m53010(c14677.m33582(), c14677.readByte());
                        c23929.m26490(c14677.m33581());
                        c23929.m26491(c14677.m33585());
                        c23929.m26502(c14677.m33585());
                        c23929.f75952 = c14677.m33585();
                        c23929.f75997 = c14677.m33585();
                        boolean zM33585 = c14677.m33585();
                        c23929.f75992 = zM33585;
                        if (zM33585) {
                            c23929.f76022 = c14677.m33591();
                        }
                        int i5 = c14677.available() > 4 ? c14677.readInt() : 0;
                        if (i5 < 591749667) {
                            c23929.mo26489(1.0f);
                        } else {
                            c23929.m26506(c14677.m33585());
                            if (i5 >= 591749669) {
                                c23929.m26509(c14677.m33585());
                            }
                            if (i5 >= 591749668) {
                                c23929.f75986 = c14677.m33585();
                            }
                            Integer numValueOf = null;
                            Integer numValueOf2 = (i5 < 591749670 || !c14677.m33585()) ? null : Integer.valueOf(c14677.readInt());
                            if (i5 >= 591749671 && c14677.m33585()) {
                                numValueOf = Integer.valueOf(c14677.readInt());
                            }
                            c23929.mo26489(i5 >= 591749672 ? c14677.m33582() : 1.0f);
                            if (i5 >= 591749672) {
                                c14677.m33582();
                            }
                            c23929.m53014(numValueOf2);
                            c23929.m53011(numValueOf);
                        }
                        if (c14677.m33575() != iM33576) {
                            c14677.seek(iM33576);
                        }
                        break;
                    case 5:
                        if (c14677.readByte() == 0) {
                            c18976 = new C4816(this, this.f40339, c23929, c14677);
                        } else {
                            c18976 = new C18976(this, this.f40339, c23929, c14677);
                        }
                        m32190(c18976, true);
                        if (c14677.m33575() != iM33576) {
                            c14677.seek(iM33576);
                        }
                        break;
                    case 6:
                    case 8:
                        c14677.seek(iM33576);
                        if (c23929.f75992) {
                            str2 = c23929.f76022;
                            m32381(str2, true);
                            z2 = true;
                            if (c14677.m33575() != iM33576) {
                                c14677.seek(iM33576);
                            }
                        } else if (c14677.m33575() != iM33576) {
                            c14677.seek(iM33576);
                        }
                        break;
                    case 7:
                        c23929.f75975 = c14677.readInt();
                        c23929.f75954 = c14677.readInt();
                        m32529();
                        if (c14677.m33575() != iM33576) {
                            c14677.seek(iM33576);
                        }
                        break;
                    case 9:
                        if (z) {
                            c14677.seek(iM33576);
                        } else if (!c8898.m20519(c14677, iM33576) && c23929.f75992) {
                            str2 = c23929.f76022;
                            m32381(str2, true);
                            z2 = true;
                        }
                        if (c14677.m33575() != iM33576) {
                            c14677.seek(iM33576);
                        }
                        break;
                    case 10:
                        this.f40339.mo4001(c14677.readLong());
                        if (c14677.readLong() != this.f40339.mo3999().m54732()) {
                            this.f40339.mo3998(true);
                        }
                        if (c14677.m33575() != iM33576) {
                            c14677.seek(iM33576);
                        }
                        break;
                    case 11:
                        c23417.m52092(c14677);
                        c23416.m52092(c14677);
                        if (c14677.m33575() != iM33576) {
                            c14677.seek(iM33576);
                        }
                        break;
                    default:
                        System.out.println("Unknown instance state record type: " + ((int) b));
                        c14677.seek((long) iM33576);
                        break;
                }
            } else {
                if (z) {
                    System.out.println("Text's fastHashCode changed, reset all.");
                    c23417.m52090();
                    c23416.m52090();
                    m32597();
                    if (!z2) {
                        str = c23929.f76022;
                        m32381(str, true);
                    }
                } else {
                    this.f40275.m11837();
                    this.f40275.mo11827(m32458());
                    if (!z2 && c23929.f75992 && (!c8898.m20524() || !c8898.m20517((CharSequence) this.f40339))) {
                        str = c23929.f76022;
                        m32381(str, true);
                    }
                }
                if (c14677.m33575() != iM33575) {
                    c14677.seek(iM33575);
                }
                if (c14677.readInt() != -249340294) {
                    throw new RuntimeException();
                }
                postInvalidate();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m32275(C14677 c14677, int i) {
        int i2 = c14677.readInt();
        if (i2 < 0 || i2 > (i - c14677.m33575()) / 12) {
            throw new IllegalArgumentException("Invalid legacy undo count");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = c14677.readInt();
            if (i4 < 0 || i4 > (i - c14677.m33575()) / 28) {
                throw new IllegalArgumentException("Invalid legacy undo changes");
            }
            for (int i5 = 0; i5 < i4; i5++) {
                if (i - c14677.m33575() < 28) {
                    throw new IllegalArgumentException("Truncated legacy undo change");
                }
                c14677.skipBytes(20);
                for (int i6 = 0; i6 < 2; i6++) {
                    if (i - c14677.m33575() < 4) {
                        throw new IllegalArgumentException("Truncated legacy undo text");
                    }
                    int i7 = c14677.readInt();
                    if (i7 < 0 || i7 > i - c14677.m33575()) {
                        throw new IllegalArgumentException("Invalid legacy undo text length");
                    }
                    c14677.skipBytes(i7);
                }
            }
            if (i - c14677.m33575() < 8) {
                throw new IllegalArgumentException("Truncated legacy undo time");
            }
            c14677.skipBytes(8);
        }
    }

    static {
        ApplicationC14266.m56479(98);
        f40186 = new TextKeyListener(TextKeyListener.Capitalize.NONE, false);
        f40185 = C13076.m29939(120.0f);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32405(InterfaceC22825 interfaceC22825) {
        this.f40309.add(interfaceC22825);
    }

    /* JADX INFO: renamed from: ۫ */
    public final void m32507() {
        AbstractC23000 abstractC23000 = this.f40253;
        if (abstractC23000 != null) {
            abstractC23000.m51384();
        }
        ArrayList arrayList = this.f40309;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC22825) arrayList.get(i)).mo3486();
        }
        m32480();
    }

    /* JADX INFO: renamed from: ۠ */
    public static int m32248(int i) {
        float f = i;
        float f2 = f / f40185;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return (int) (f * f2 * 0.5f);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m32490(int i, int i2) {
        m32255();
        m32245();
        this.f40224.removeMessages(1);
        this.f40302.forceFinished(true);
        m32306(i, i2);
    }

    /* JADX INFO: renamed from: ᩷ۧ */
    public final int m32589() {
        return this.f40275.f12798.get(this.f40275.m11803(this.f40187 + 1)).f38061;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܶᩳ */
    public void m32304() {
        this.f40331 = SystemClock.uptimeMillis();
        HandlerC15329 handlerC15329 = this.f40224;
        handlerC15329.removeMessages(3);
        handlerC15329.sendEmptyMessageDelayed(3, 1500L);
        postInvalidate();
    }

    /* JADX INFO: renamed from: ۨܽ */
    public final void m32506() {
        if (this.f40275.mo10193()) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            int i = (int) (jUptimeMillis - this.f40331);
            this.f40189 = false;
            if (i >= 0 && i <= 1500) {
                this.f40224.removeMessages(3);
                this.f40331 = jUptimeMillis - 1500;
                postInvalidate();
            }
            m32251();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۠ᩳ */
    public void m32251() {
        if (this.f40275.mo10193()) {
            this.f40326 = SystemClock.uptimeMillis();
            HandlerC15329 handlerC15329 = this.f40224;
            handlerC15329.removeMessages(5);
            handlerC15329.sendEmptyMessageDelayed(5, 1500L);
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: ܰܽ */
    public final void m32517() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i = (int) (jUptimeMillis - this.f40326);
        this.f40311 = false;
        if (i >= 0 && i <= 1500) {
            this.f40224.removeMessages(5);
            this.f40326 = jUptimeMillis - 1500;
            postInvalidate();
        }
        m32304();
    }

    /* JADX INFO: renamed from: ۖۧ */
    public final void m32430() {
        this.f40326 = 0L;
        this.f40331 = 0L;
        m32342();
        postInvalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m32368(int i) {
        C23929 c23929 = this.f40262;
        if (c23929.f75992) {
            C8898 c8898 = this.f40252;
            if (c8898.m20524()) {
                return c8898.m20544(i, c23929.m26504());
            }
        }
        return c23929.m26504();
    }

    /* JADX INFO: renamed from: ۨ֫ */
    public final String m32504() {
        return this.f40252.m20522();
    }

    /* JADX INFO: renamed from: ۟֫ */
    public final List m32462() {
        int[] iArrM32433 = m32433();
        int iM53512 = C24204.m53512(iArrM32433[0], this.f40339);
        int iM53504 = C24204.m53504(iArrM32433[1], this.f40339);
        if (iM53504 < this.f40339.length()) {
            iM53504++;
        }
        return this.f40252.m20526(iM53512, iM53504);
    }

    /* JADX INFO: renamed from: ᩺֫ */
    public final InterfaceC18702 m32599() {
        return this.f40252.m20545();
    }

    /* JADX INFO: renamed from: ܰ֫ */
    public final InterfaceC8644 m32515() {
        return this.f40252.m20541();
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m32474() {
        m32375(m32508(), m32512());
        InterfaceC20853 interfaceC20853 = this.f40318;
        if (interfaceC20853 != null) {
            interfaceC20853.mo5043(m32447(), m32360());
            this.f40318.mo5042(this.f40339.isChanged());
        }
        m32469();
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m32469() {
        if (this.f40264 == this.f40339 || this.f40332 == null) {
            return;
        }
        int iM32508 = m32508();
        int iM32512 = m32512();
        long jM20525 = this.f40252.m20525();
        if (jM20525 == Long.MIN_VALUE) {
            this.f40332.m54663(iM32508, iM32512);
        } else if (jM20525 == -1) {
            this.f40332.m54657(iM32508, iM32512);
        } else {
            this.f40332.m54658(iM32508, iM32512, (int) (jM20525 >>> 32), (int) jM20525);
        }
    }

    /* JADX INFO: renamed from: ۖܽ */
    public final void m32431() {
        C24894 c24894 = this.f40332;
        if (c24894 != null) {
            c24894.m54657(m32508(), m32512());
        }
    }

    /* JADX INFO: renamed from: ᩵ۧ */
    public final void m32579() {
        C24894 c24894 = this.f40332;
        if (c24894 != null) {
            c24894.m54669();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32397(C15371 c15371) {
        this.f40336 = c15371;
    }

    /* JADX INFO: renamed from: ܿۧ */
    public final String m32556() {
        C15371 c15371 = this.f40336;
        if (c15371 == null) {
            return m32442();
        }
        return C9842.m23031(c15371.f43916);
    }

    /* JADX INFO: renamed from: ۙ֫ */
    public final String m32442() {
        InterfaceC9768 interfaceC9768 = this.f40339;
        int selectionStart = Selection.getSelectionStart(interfaceC9768);
        int selectionEnd = Selection.getSelectionEnd(interfaceC9768);
        if (selectionStart == selectionEnd || selectionStart == -1 || selectionEnd == -1) {
            return null;
        }
        if (selectionStart < selectionEnd) {
            return interfaceC9768.subSequence(selectionStart, selectionEnd).toString();
        }
        return interfaceC9768.subSequence(selectionEnd, selectionStart).toString();
    }

    /* JADX INFO: renamed from: ۤ */
    public final void m32480() {
        C9688 c9688 = this.f40328;
        if (c9688 != null) {
            c9688.m22588();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32392(InterfaceC9749 interfaceC9749) {
        this.f40249 = interfaceC9749;
        this.f40339.mo3991(interfaceC9749);
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m32455() {
        int iM54655;
        int iM32508 = m32508();
        if (iM32508 != m32512() || (iM54655 = this.f40332.m54655(iM32508)) == -1) {
            return;
        }
        mo27941(iM54655);
        this.f40297 = SystemClock.uptimeMillis();
        m32413(iM54655, false);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m32586() {
        int[] iArrM54664;
        int iM32508 = m32508();
        if (iM32508 != m32512() || (iArrM54664 = this.f40332.m54664(iM32508)) == null) {
            return;
        }
        mo27944(iArrM54664[0], iArrM54664[1] + 1);
        m32601();
        m32494(false);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m32487() {
        Runnable runnable = this.f40327;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32379(Runnable runnable) {
        this.f40327 = runnable;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32408(InterfaceC23850 interfaceC23850) {
        this.f40208 = interfaceC23850;
    }

    /* JADX INFO: renamed from: ܺۧ */
    public final boolean m32533() {
        return this.f40208 != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32386(C4404 c4404) {
        this.f40207 = c4404;
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m32529() {
        C4404 c4404 = this.f40207;
        if (c4404 != null) {
            C23929 c23929 = this.f40262;
            int i = c23929.f75975;
            int i2 = c23929.f75954;
            C17143.m38818((C17143) c4404.f9894, i != i2 && i >= 0 && i2 >= 0);
        }
    }

    /* JADX INFO: renamed from: ܶܽ */
    public final void m32528() {
        C23929 c23929 = this.f40262;
        int i = c23929.f75975;
        int i2 = c23929.f75954;
        if (i == i2 || i < 0 || i2 < 0) {
            return;
        }
        c23929.f75954 = -1;
        c23929.f75975 = -1;
        m32529();
        invalidate();
    }

    /* JADX INFO: renamed from: ᩶֫ */
    public final C14698 m32582() {
        C23929 c23929 = this.f40262;
        int i = c23929.f75975;
        int i2 = c23929.f75954;
        if (i == i2 || i < 0 || i2 < 0) {
            return null;
        }
        C14698 c14698 = new C14698();
        c14698.f41923 = i;
        c14698.f41922 = i2;
        return c14698;
    }

    /* JADX INFO: renamed from: ֨ۧ */
    public final boolean m32366() {
        EdgeEffect edgeEffect = this.f40233;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            return false;
        }
        EdgeEffect edgeEffect2 = this.f40292;
        if (edgeEffect2 != null && !edgeEffect2.isFinished()) {
            return false;
        }
        EdgeEffect edgeEffect3 = this.f40320;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            return false;
        }
        EdgeEffect edgeEffect4 = this.f40206;
        return edgeEffect4 == null || edgeEffect4.isFinished();
    }

    /* JADX INFO: renamed from: ۚ֫ */
    public final float m32448() {
        return this.f40262.m26496();
    }

    /* JADX INFO: renamed from: ܳᩳ */
    public final void m32525() {
        C24047 c24047 = this.f40198;
        if (c24047 != null) {
            c24047.m53294();
        }
        this.f40198 = new C24047(this);
        if (this.f40276 == null) {
            this.f40276 = new ViewTreeObserverOnGlobalLayoutListenerC3417(this);
            if (isAttachedToWindow()) {
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                viewTreeObserver.addOnGlobalLayoutListener(this.f40276);
                viewTreeObserver.addOnScrollChangedListener(this.f40276);
            }
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ᩻ۧ */
    public final C24047 m32607() {
        return this.f40198;
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m32531(boolean z) {
        this.f40221 = z;
        if (z) {
            return;
        }
        m32226();
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m32550(int i, boolean z) {
        this.f40284 = z;
        if (z) {
            this.f40330 = i;
        } else {
            m32226();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m32489(float f, float f2) {
        int i;
        this.f40306 = f;
        this.f40310 = f2;
        int iM32508 = m32508();
        int iM32512 = m32512();
        if (iM32508 <= iM32512) {
            iM32512 = iM32508;
            iM32508 = iM32512;
        }
        int iM11804 = this.f40275.m11804(getScrollX() + f, this.f40187 + f2);
        if (this.f40283 != iM11804 && (i = this.f40330) != iM11804) {
            this.f40283 = -1;
            if (i > iM11804) {
                if (iM32512 != iM11804) {
                    this.f40339.setSelection(iM11804, i);
                    invalidate();
                }
            } else if (iM32508 != iM11804) {
                this.f40339.setSelection(i, iM11804);
                invalidate();
            }
        }
        if (mo27936()) {
            m32264((int) (f + getPaddingLeft()), (int) (f2 + getPaddingTop()), this.f40262.f75999);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m32560(float f, float f2) {
        this.f40306 = f;
        this.f40310 = f2;
        int iM11804 = this.f40275.m11804(getScrollX() + f, this.f40187 + f2);
        if (iM11804 != Selection.getSelectionStart(this.f40339)) {
            this.f40339.setSelection(iM11804);
            invalidate();
            m32302(iM11804);
        }
        this.f40280 = SystemClock.uptimeMillis();
        m32464();
        int iM26496 = (int) this.f40262.m26496();
        boolean z = f2 < ((float) (-iM26496)) || f2 > ((float) (m32606() + iM26496));
        if (mo27936()) {
            if (!z) {
                m32264((int) (f + getPaddingLeft()), (int) (f2 + getPaddingTop()), 0);
            } else {
                m32226();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m32540(float f, float f2) {
        this.f40306 = f;
        this.f40310 = f2;
        int iM32508 = m32508();
        int iM32512 = m32512();
        if (iM32508 <= iM32512) {
            iM32512 = iM32508;
            iM32508 = iM32512;
        }
        int iM11804 = this.f40275.m11804(getScrollX() + f, this.f40187 + f2);
        int i = this.f40330;
        boolean z = true;
        if (i != iM11804) {
            if (i > iM11804) {
                if (iM32512 != iM11804) {
                    this.f40339.setSelection(iM11804, i);
                    m32302(iM11804);
                    if (!this.f40325) {
                        this.f40325 = true;
                    }
                }
            } else if (iM32508 != iM11804) {
                this.f40339.setSelection(i, iM11804);
                m32302(iM11804);
                if (this.f40325) {
                    this.f40325 = false;
                }
            }
            this.f40280 = SystemClock.uptimeMillis();
            invalidate();
        }
        int iM26496 = (int) this.f40262.m26496();
        if (f2 >= (-iM26496) && f2 <= m32606() + iM26496) {
            z = false;
        }
        if (mo27936()) {
            if (!z) {
                m32264((int) (f + getPaddingLeft()), (int) (f2 + getPaddingTop()), 0);
            } else {
                m32226();
            }
        }
    }

    /* JADX INFO: renamed from: ۜ֫ */
    public final int m32458() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX INFO: renamed from: ᩻֫ */
    public final int m32606() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* JADX INFO: renamed from: ۘۧ */
    public final void m32440() {
        this.f40291.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    /* JADX INFO: renamed from: ۙܽ */
    public final void m32444() {
        this.f40291.restartInput(this);
    }

    /* JADX INFO: renamed from: ۛ */
    public final void m32451() {
        C24047 c24047 = this.f40198;
        if (c24047 != null) {
            this.f40280 = 0L;
            c24047.m53294();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m32541(String str) {
        this.f40275.mo10191(str);
        invalidate();
    }

    /* JADX INFO: renamed from: ᩴ֫ */
    public final String m32573() {
        return this.f40275.f12806;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        return this.f40275 == null ? getHeight() : Math.max(getHeight(), (int) this.f40275.m11833());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setScrollY(this.f40187);
        accessibilityEvent.setMaxScrollY(this.f40275 == null ? 0 : m32592());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEditable(true);
    }

    @Override // android.view.View
    public final CharSequence getAccessibilityClassName() {
        return EditText.class.getName();
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (Build.VERSION.SDK_INT < 34 || !isAccessibilityDataSensitive() || accessibilityEvent.isAccessibilityDataSensitive()) {
            CharSequence charSequenceSubSequence = this.f40339;
            if (TextUtils.isEmpty(charSequenceSubSequence)) {
                charSequenceSubSequence = this.f40275.f12806;
            }
            if (charSequenceSubSequence != null) {
                int i = 10000;
                if (charSequenceSubSequence.length() > 10000) {
                    if (Character.isHighSurrogate(charSequenceSubSequence.charAt(9999)) && Character.isLowSurrogate(charSequenceSubSequence.charAt(10000))) {
                        i = 9999;
                    }
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, i);
                }
            }
            if (TextUtils.isEmpty(charSequenceSubSequence)) {
                return;
            }
            accessibilityEvent.getText().add(charSequenceSubSequence);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        int action = dragEvent.getAction();
        if (action == 4 || action == 6 || (!m32505() && m32238())) {
            switch (action) {
                case 1:
                    ClipDescription clipDescription = dragEvent.getClipDescription();
                    if (clipDescription != null && (clipDescription.hasMimeType("text/plain") || clipDescription.hasMimeType("text/html"))) {
                        return true;
                    }
                    break;
                case 2:
                    float x = dragEvent.getX();
                    float y = dragEvent.getY();
                    int iM11804 = this.f40275.m11804(getScrollX() + x, this.f40187 + y);
                    if (iM11804 != m32508() || iM11804 != m32512()) {
                        this.f40339.setSelection(iM11804);
                        m32413(iM11804, true);
                    }
                    invalidate();
                    if (mo27936()) {
                        m32264((int) x, (int) y, this.f40262.f75999);
                        return true;
                    }
                    return true;
                case 3:
                    ClipData clipData = dragEvent.getClipData();
                    if (clipData.getItemCount() > 0) {
                        CharSequence charSequenceM53007 = C23929.m53007(clipData.getItemAt(0).getText());
                        int[] iArrM32433 = m32433();
                        this.f40339.replace(iArrM32433[0], iArrM32433[1], charSequenceM53007);
                        int length = charSequenceM53007.length() + iArrM32433[0];
                        iArrM32433[1] = length;
                        mo27944(iArrM32433[0], length);
                        invalidate();
                        return true;
                    }
                    return true;
                case 4:
                    if (mo27936()) {
                        m32226();
                    }
                    this.f40216 = false;
                    invalidate();
                    return true;
                case 5:
                    if (mo27936()) {
                        m32264((int) dragEvent.getX(), (int) dragEvent.getY(), this.f40262.f75999);
                    }
                    this.f40216 = true;
                    invalidate();
                    return true;
                case 6:
                    if (mo27936()) {
                        m32226();
                    }
                    this.f40216 = false;
                    invalidate();
                    return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰۧ */
    public final boolean m32516() {
        return this.f40221;
    }

    /* JADX INFO: renamed from: ۫ۧ */
    public final boolean m32509() {
        return this.f40284;
    }

    /* JADX INFO: renamed from: ۤۧ */
    public final boolean m32482() {
        return this.f40325;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m32206(C14146 c14146, C14146 c14147) {
        if (c14146 == c14147) {
            throw new IllegalArgumentException();
        }
        c14146.f40298 = c14147;
        c14147.f40298 = c14146;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m32272(C14146 c14146, C14146 c14147) {
        if (c14146.f40312) {
            c14147.f40331 = SystemClock.uptimeMillis();
        } else if (c14147.f40312) {
            c14146.f40331 = SystemClock.uptimeMillis();
        } else {
            long jMax = Math.max(c14146.f40331, c14147.f40331);
            c14147.f40331 = jMax;
            c14146.f40331 = jMax;
        }
        if (c14146.f40308) {
            c14147.f40326 = SystemClock.uptimeMillis();
        } else {
            if (c14147.f40308) {
                c14146.f40326 = SystemClock.uptimeMillis();
                return;
            }
            long jMax2 = Math.max(c14146.f40326, c14147.f40326);
            c14147.f40326 = jMax2;
            c14146.f40326 = jMax2;
        }
    }

    /* JADX INFO: renamed from: ۤܽ */
    public final void m32483() {
        if (!this.f40333) {
            this.f40333 = true;
            C18439.m42005(this.f40320);
            C18439.m42005(this.f40206);
            EdgeEffect edgeEffect = this.f40233;
            if (edgeEffect != null) {
                C18439.m42005(edgeEffect);
            }
            EdgeEffect edgeEffect2 = this.f40292;
            if (edgeEffect2 != null) {
                C18439.m42005(edgeEffect2);
            }
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m32604(int i, int i2) {
        this.f40286 = i;
        this.f40240 = i2;
        this.f40256.m24762();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r7v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX INFO: renamed from: ᩳᩳ */
    public final void m32570() {
        boolean z;
        boolean z2;
        boolean z3;
        ?? r1;
        int i;
        if ((this.f40286 & 3) == 0 || this.f40275 == null || m32434() || !this.f40291.isActive(this)) {
            return;
        }
        int i2 = this.f40240;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            z2 = (i2 & 4) != 0;
            z3 = (i2 & 8) != 0;
            z = (i2 & 16) != 0;
        } else {
            z = false;
            z2 = false;
            z3 = false;
        }
        boolean z4 = (z2 || z3 || z) ? false : true;
        boolean z5 = z2 | z4;
        boolean z6 = z3 | z4;
        boolean z7 = z | z4;
        CursorAnchorInfo.Builder builder = this.f40250;
        builder.reset();
        int iM32508 = m32508();
        builder.setSelectionRange(iM32508, m32512());
        if (i3 >= 29) {
            this.f40246.reset();
            transformMatrixToGlobal(this.f40246);
            builder.setMatrix(this.f40246);
        } else {
            this.f40246.set(getMatrix());
            getLocationOnScreen(this.f40229);
            Matrix matrix = this.f40246;
            int[] iArr = this.f40229;
            matrix.postTranslate(iArr[0], iArr[1]);
            builder.setMatrix(this.f40246);
        }
        if (z5 && i3 >= 34) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(rectF).setHandwritingBounds(new RectF(-getHandwritingBoundsOffsetLeft(), -getHandwritingBoundsOffsetTop(), getHandwritingBoundsOffsetRight() + getWidth(), getHandwritingBoundsOffsetBottom() + getHeight())).build());
        }
        if (z6 || z7) {
            float paddingLeft = getPaddingLeft() - getScrollX();
            float paddingTop = getPaddingTop() - this.f40187;
            RectF rectF2 = new RectF();
            RectF rectF3 = new RectF(getPaddingLeft(), getPaddingRight(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            if (z6) {
                InterfaceC9768 interfaceC9768 = this.f40339;
                int composingSpanStart = BaseInputConnection.getComposingSpanStart(interfaceC9768);
                int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(interfaceC9768);
                if (composingSpanEnd < composingSpanStart) {
                    i = composingSpanStart;
                    composingSpanStart = composingSpanEnd;
                } else {
                    i = composingSpanEnd;
                }
                if (composingSpanStart >= 0 && composingSpanStart < i) {
                    builder.setComposingText(composingSpanStart, interfaceC9768.subSequence(composingSpanStart, i));
                    int i4 = composingSpanStart;
                    while (i4 < i) {
                        this.f40275.mo10190(rectF2, i4);
                        rectF2.offset(paddingLeft, paddingTop);
                        ?? Intersects = RectF.intersects(rectF3, rectF2);
                        if (!rectF3.contains(rectF2)) {
                            Intersects = (Intersects == true ? 1 : 0) | 2;
                        }
                        builder.addCharacterBounds(i4, rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, Intersects == true ? 1 : 0);
                        i4++;
                        i = i;
                    }
                }
            }
            if (z7 && iM32508 >= 0) {
                this.f40275.mo10190(rectF2, iM32508);
                rectF2.offset(paddingLeft, paddingTop);
                boolean zIntersects = RectF.intersects(rectF3, rectF2);
                if (!rectF3.contains(rectF2)) {
                    r1 = zIntersects;
                    r1 = (zIntersects ? 1 : 0) | 2;
                }
                r1 = zIntersects;
                float f = rectF2.left;
                float f2 = rectF2.top;
                builder.setInsertionMarkerLocation(f, f2, this.f40262.m26513() + f2, rectF2.bottom, r1 == true ? 1 : 0);
            }
        }
        this.f40291.updateCursorAnchorInfo(this, builder.build());
        this.f40286 &= -2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m32199(C14146 c14146, Runnable runnable) {
        if (c14146.m32434()) {
            if (c14146.isAttachedToWindow()) {
                C7050.m16206(100L, runnable);
                return;
            }
            return;
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: ۢۧ */
    public final AtomicInteger m32478() {
        return this.f40303;
    }

    /* JADX INFO: renamed from: ܳܽ */
    public final boolean m32524() {
        return this.f40303.get() > 0;
    }

    /* JADX INFO: renamed from: ᩹ۧ */
    public final boolean m32596() {
        return this.f40228;
    }

    /* JADX INFO: renamed from: ֫ᩳ */
    public final void m32426() {
        if (this.f40228) {
            throw new IllegalStateException();
        }
        this.f40339.getClass();
        this.f40228 = true;
        this.f40190.m19803(this.f40339);
        this.f40252.m20520();
    }

    /* JADX INFO: renamed from: ۟ */
    public final void m32461() {
        if (!this.f40228) {
            throw new IllegalStateException();
        }
        this.f40228 = false;
        if (m32583()) {
            this.f40190.m19801(this.f40339);
            this.f40339.mo4000();
            C6100 c6100 = this.f40319;
            C12826.requireNonNull(c6100);
            C7050.m16212(new RunnableC13437(c6100));
            return;
        }
        if (this.f40252.m20524()) {
            this.f40252.m20528((InterfaceC21800) this.f40339);
        }
        this.f40190.m19801(this.f40339);
        this.f40339.mo4000();
        m32375(m32508(), m32512());
        m32469();
        this.f40238 = -1.0f;
    }

    @Override // p067l.InterfaceC18226
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22048(float f, float f2) {
        AbstractC5390 abstractC5390 = this.f40275;
        boolean z = abstractC5390.f12829;
        boolean z2 = abstractC5390.f12828;
        if (!z && !z2) {
            return false;
        }
        int[] iArr = this.f40266;
        getLocationOnScreen(iArr);
        float scrollX = ((f + getScrollX()) - getPaddingLeft()) - iArr[0];
        float fM11821 = this.f40275.m11821(f2 - iArr[1]);
        if (z && this.f40275.f12799.m37324(scrollX, fM11821)) {
            return true;
        }
        return z2 && this.f40275.f12797.m37324(scrollX, fM11821);
    }

    /* JADX INFO: renamed from: ܺ֫ */
    public final C15486 m32532() {
        return this.f40314;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32398(C15486 c15486) {
        this.f40314 = c15486;
    }
}
