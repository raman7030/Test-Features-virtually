package l;

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
import bin.mt.plus.R;
import com.alipay.sdk.m.t0.b;
import com.umeng.analytics.pro.o;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.ref.WeakReference;
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
public class C12392 extends View implements InterfaceC16685 {

    /* JADX INFO: renamed from: ܳܿ, reason: not valid java name and contains not printable characters */
    public static final float f37168;

    /* JADX INFO: renamed from: ᩻ܿ, reason: not valid java name and contains not printable characters */
    public static final TextKeyListener f37169;

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public volatile int f37170;

    /* JADX INFO: renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public boolean f37171;

    /* JADX INFO: renamed from: ֡ܽ, reason: not valid java name and contains not printable characters */
    public boolean f37172;

    /* JADX INFO: renamed from: ֡ᩳ, reason: not valid java name and contains not printable characters */
    public C6458 f37173;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public int f37174;

    /* JADX INFO: renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public int f37175;

    /* JADX INFO: renamed from: ֨ܽ, reason: not valid java name and contains not printable characters */
    public boolean f37176;

    /* JADX INFO: renamed from: ֨ᩳ, reason: not valid java name and contains not printable characters */
    public C15213 f37177;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public ClipboardManager f37178;

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public C6322 f37179;

    /* JADX INFO: renamed from: ֫ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f37180;

    /* JADX INFO: renamed from: ֫ܿ, reason: not valid java name and contains not printable characters */
    public C22810 f37181;

    /* JADX INFO: renamed from: ֫ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f37182;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final C2141 f37183;

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public float f37184;

    /* JADX INFO: renamed from: ۖܽ, reason: not valid java name and contains not printable characters */
    public boolean f37185;

    /* JADX INFO: renamed from: ۖᩳ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f37186;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public volatile boolean f37187;

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public C1869 f37188;

    /* JADX INFO: renamed from: ۗۧ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f37189;

    /* JADX INFO: renamed from: ۗܽ, reason: not valid java name and contains not printable characters */
    public C2141 f37190;

    /* JADX INFO: renamed from: ۗᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC22602 f37191;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public boolean f37192;

    /* JADX INFO: renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public long f37193;

    /* JADX INFO: renamed from: ۘܽ, reason: not valid java name and contains not printable characters */
    public volatile boolean f37194;

    /* JADX INFO: renamed from: ۘᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC7785 f37195;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f37196;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public boolean f37197;

    /* JADX INFO: renamed from: ۙۧ, reason: not valid java name and contains not printable characters */
    public C22146 f37198;

    /* JADX INFO: renamed from: ۙܽ, reason: not valid java name and contains not printable characters */
    public boolean f37199;

    /* JADX INFO: renamed from: ۙᩳ, reason: not valid java name and contains not printable characters */
    public int f37200;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public float f37201;

    /* JADX INFO: renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f37202;

    /* JADX INFO: renamed from: ۚܽ, reason: not valid java name and contains not printable characters */
    public boolean f37203;

    /* JADX INFO: renamed from: ۚᩳ, reason: not valid java name and contains not printable characters */
    public boolean f37204;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public AbstractActivityC3346 f37205;

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public int f37206;

    /* JADX INFO: renamed from: ۛۧ, reason: not valid java name and contains not printable characters */
    public HandlerC13637 f37207;

    /* JADX INFO: renamed from: ۛܽ, reason: not valid java name and contains not printable characters */
    public int f37208;

    /* JADX INFO: renamed from: ۛᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC5337 f37209;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public long f37210;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public boolean f37211;

    /* JADX INFO: renamed from: ۜܽ, reason: not valid java name and contains not printable characters */
    public final int[] f37212;

    /* JADX INFO: renamed from: ۜᩳ, reason: not valid java name and contains not printable characters */
    public float f37213;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f37214;

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public ViewOnTouchListenerC17331 f37215;

    /* JADX INFO: renamed from: ۟ۧ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f37216;

    /* JADX INFO: renamed from: ۟ܽ, reason: not valid java name and contains not printable characters */
    public final Object f37217;

    /* JADX INFO: renamed from: ۟ᩳ, reason: not valid java name and contains not printable characters */
    public volatile long f37218;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public float f37219;

    /* JADX INFO: renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public boolean f37220;

    /* JADX INFO: renamed from: ۠ܽ, reason: not valid java name and contains not printable characters */
    public float f37221;

    /* JADX INFO: renamed from: ۠ᩳ, reason: not valid java name and contains not printable characters */
    public C21565 f37222;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public int f37223;

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public long f37224;

    /* JADX INFO: renamed from: ۡܽ, reason: not valid java name and contains not printable characters */
    public C8741 f37225;

    /* JADX INFO: renamed from: ۡᩳ, reason: not valid java name and contains not printable characters */
    public int f37226;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public int f37227;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public C3926 f37228;

    /* JADX INFO: renamed from: ۢܽ, reason: not valid java name and contains not printable characters */
    public final Matrix f37229;

    /* JADX INFO: renamed from: ۢᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f37230;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f37231;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC7765 f37232;

    /* JADX INFO: renamed from: ۤۧ, reason: not valid java name and contains not printable characters */
    public final CursorAnchorInfo.Builder f37233;

    /* JADX INFO: renamed from: ۤܽ, reason: not valid java name and contains not printable characters */
    public long f37234;

    /* JADX INFO: renamed from: ۤᩳ, reason: not valid java name and contains not printable characters */
    public C6870 f37235;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public AbstractC21708 f37236;

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public boolean f37237;

    /* JADX INFO: renamed from: ۧܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f37238;

    /* JADX INFO: renamed from: ۧܿ, reason: not valid java name and contains not printable characters */
    public final C8817 f37239;

    /* JADX INFO: renamed from: ۧᩳ, reason: not valid java name and contains not printable characters */
    public volatile long f37240;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f37241;

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public int f37242;

    /* JADX INFO: renamed from: ۨۧ, reason: not valid java name and contains not printable characters */
    public C22146 f37243;

    /* JADX INFO: renamed from: ۨܽ, reason: not valid java name and contains not printable characters */
    public volatile C22270 f37244;

    /* JADX INFO: renamed from: ۨᩳ, reason: not valid java name and contains not printable characters */
    public C22686 f37245;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC14528 f37246;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public volatile C4342 f37247;

    /* JADX INFO: renamed from: ۫ۧ, reason: not valid java name and contains not printable characters */
    public C6768 f37248;

    /* JADX INFO: renamed from: ۫ܽ, reason: not valid java name and contains not printable characters */
    public int[] f37249;

    /* JADX INFO: renamed from: ۫ᩳ, reason: not valid java name and contains not printable characters */
    public volatile C3220 f37250;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f37251;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public RuntimeException f37252;

    /* JADX INFO: renamed from: ۬ۧ, reason: not valid java name and contains not printable characters */
    public final BreakIterator f37253;

    /* JADX INFO: renamed from: ۬ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC0979 f37254;

    /* JADX INFO: renamed from: ۬ᩳ, reason: not valid java name and contains not printable characters */
    public C14630 f37255;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f37256;

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public C0923 f37257;

    /* JADX INFO: renamed from: ܰۧ, reason: not valid java name and contains not printable characters */
    public AbstractC3179 f37258;

    /* JADX INFO: renamed from: ܰܽ, reason: not valid java name and contains not printable characters */
    public ViewTreeObserverOnGlobalLayoutListenerC1103 f37259;

    /* JADX INFO: renamed from: ܰᩳ, reason: not valid java name and contains not printable characters */
    public final Object f37260;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public boolean f37261;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public boolean f37262;

    /* JADX INFO: renamed from: ܳܽ, reason: not valid java name and contains not printable characters */
    public long f37263;

    /* JADX INFO: renamed from: ܳᩳ, reason: not valid java name and contains not printable characters */
    public final RectF f37264;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public final Rect f37265;

    /* JADX INFO: renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public int f37266;

    /* JADX INFO: renamed from: ܶܽ, reason: not valid java name and contains not printable characters */
    public boolean f37267;

    /* JADX INFO: renamed from: ܶᩳ, reason: not valid java name and contains not printable characters */
    public volatile C20154 f37268;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public int f37269;

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public float f37270;

    /* JADX INFO: renamed from: ܺܽ, reason: not valid java name and contains not printable characters */
    public int f37271;

    /* JADX INFO: renamed from: ܺᩳ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f37272;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public C22229 f37273;

    /* JADX INFO: renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public InputMethodManager f37274;

    /* JADX INFO: renamed from: ܽܽ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f37275;

    /* JADX INFO: renamed from: ܽܿ, reason: not valid java name and contains not printable characters */
    public boolean f37276;

    /* JADX INFO: renamed from: ܽᩳ, reason: not valid java name and contains not printable characters */
    public volatile transient boolean f37277;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f37278;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public volatile boolean f37279;

    /* JADX INFO: renamed from: ܿܽ, reason: not valid java name and contains not printable characters */
    public long f37280;

    /* JADX INFO: renamed from: ܿܿ, reason: not valid java name and contains not printable characters */
    public C12392 f37281;

    /* JADX INFO: renamed from: ܿᩳ, reason: not valid java name and contains not printable characters */
    public final RectF f37282;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f37283;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f37284;

    /* JADX INFO: renamed from: ᩳܽ, reason: not valid java name and contains not printable characters */
    public OverScroller f37285;

    /* JADX INFO: renamed from: ᩳܿ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f37286;

    /* JADX INFO: renamed from: ᩳᩳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f37287;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public boolean f37288;

    /* JADX INFO: renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public float f37289;

    /* JADX INFO: renamed from: ᩴܽ, reason: not valid java name and contains not printable characters */
    public boolean f37290;

    /* JADX INFO: renamed from: ᩴᩳ, reason: not valid java name and contains not printable characters */
    public boolean f37291;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public ArrayList f37292;

    /* JADX INFO: renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public float f37293;

    /* JADX INFO: renamed from: ᩵ܽ, reason: not valid java name and contains not printable characters */
    public boolean f37294;

    /* JADX INFO: renamed from: ᩵ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f37295;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C13097 f37296;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public C13802 f37297;

    /* JADX INFO: renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public int f37298;

    /* JADX INFO: renamed from: ᩶ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC0397 f37299;

    /* JADX INFO: renamed from: ᩶ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f37300;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public InterfaceC19449 f37301;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public volatile C3926 f37302;

    /* JADX INFO: renamed from: ᩷ܽ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f37303;

    /* JADX INFO: renamed from: ᩷ᩳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f37304;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Runnable f37305;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public final Rect f37306;

    /* JADX INFO: renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public boolean f37307;

    /* JADX INFO: renamed from: ᩸ܽ, reason: not valid java name and contains not printable characters */
    public boolean f37308;

    /* JADX INFO: renamed from: ᩸ᩳ, reason: not valid java name and contains not printable characters */
    public long f37309;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Runnable f37310;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public C7701 f37311;

    /* JADX INFO: renamed from: ᩹ۧ, reason: not valid java name and contains not printable characters */
    public int f37312;

    /* JADX INFO: renamed from: ᩹ܽ, reason: not valid java name and contains not printable characters */
    public int f37313;

    /* JADX INFO: renamed from: ᩹ᩳ, reason: not valid java name and contains not printable characters */
    public long f37314;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C23701 f37315;

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public boolean f37316;

    /* JADX INFO: renamed from: ᩺ۧ, reason: not valid java name and contains not printable characters */
    public C14508 f37317;

    /* JADX INFO: renamed from: ᩺ܽ, reason: not valid java name and contains not printable characters */
    public C13097 f37318;

    /* JADX INFO: renamed from: ᩺ᩳ, reason: not valid java name and contains not printable characters */
    public C13681 f37319;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public boolean f37320;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public boolean f37321;

    /* JADX INFO: renamed from: ᩻ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC7785 f37322;

    /* JADX INFO: renamed from: ᩻ᩳ, reason: not valid java name and contains not printable characters */
    public final Rect f37323;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m30121(int i, int i2, int i3) {
        if (i3 >= i2 && i >= i2) {
            return i > i3 ? i3 : i;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized boolean m30152(C0273 c0273, C0273 c0274, int i, long j) {
        boolean z = this.f37277;
        this.f37277 = true;
        try {
            if (!this.f37194 && this.f37322 == c0273) {
                int iM30444 = m30444();
                int iM30448 = m30448();
                if (!c0273.m1595(i, j, new RunnableC14343(this, c0274, c0273, 0))) {
                    c0274.close();
                    this.f37277 = z;
                    return false;
                }
                try {
                    this.f37173.m17860(c0274);
                    this.f37235.m18572();
                    this.f37315.m52265();
                    this.f37258.mo8166(c0274);
                    m30171();
                    c0274.setSelection(iM30444, iM30448);
                    C22686 c22686 = this.f37245;
                    if (c22686.f73267) {
                        m30317(c22686.f73297, true);
                    }
                    this.f37173.m17859(c0274);
                    this.f37235.m18597(c0274);
                    m30405();
                    c0273.setReadOnly(false);
                    this.f37277 = z;
                    return true;
                } catch (Throwable th) {
                    c0273.setReadOnly(false);
                    throw th;
                }
            }
            c0274.close();
            this.f37277 = z;
            return false;
        } catch (Throwable th2) {
            this.f37277 = z;
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ᩶ᩳ, reason: not valid java name and contains not printable characters */
    private native void m30275();

    /* JADX INFO: renamed from: ᩹ᩳ, reason: not valid java name and contains not printable characters */
    private native void m30286();

    /* JADX INFO: renamed from: ֡֫ */
    public int mo25893() {
        return 917505;
    }

    /* JADX INFO: renamed from: ֫ */
    public native void mo25896(C12951 c12951);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public native void m30343(AbstractC21708 abstractC21708);

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public native void m30360();

    /* JADX INFO: renamed from: ֫ܽ */
    public boolean mo25898() {
        return false;
    }

    /* JADX INFO: renamed from: ۖ֫ */
    public int mo25899() {
        return 0;
    }

    /* JADX INFO: renamed from: ۘܽ */
    public boolean mo25902() {
        return true;
    }

    /* JADX INFO: renamed from: ۚܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m30386() {
        if (!this.f37290) {
            InterfaceC7785 interfaceC7785 = this.f37322;
            if (interfaceC7785 instanceof C0273) {
                C0273 c0273 = (C0273) interfaceC7785;
                this.f37194 = true;
                if (c0273 instanceof C5753) {
                    ((C5753) c0273).m16205();
                }
                if (this.f37231 != 0) {
                    m30462();
                    return;
                }
                if (isAttachedToWindow()) {
                    return;
                }
                this.f37290 = true;
                m30438();
                this.f37283.clear();
                m30462();
                this.f37235.m18586();
                this.f37301 = null;
                m30259((CharSequence) new C0273(""));
                this.f37235.m18586();
                this.f37207.m32775();
                AbstractC3179 abstractC3179 = this.f37258;
                if (abstractC3179 != null) {
                    abstractC3179.f10019 = true;
                }
                c0273.close();
            }
        }
    }

    /* JADX INFO: renamed from: ۛܽ */
    public boolean mo25904() {
        return false;
    }

    /* JADX INFO: renamed from: ۡܽ */
    public void mo25906() {
    }

    /* JADX INFO: renamed from: ۢ */
    public void mo25908(int i) {
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public native void m30428(String str);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized void m30439() {
        int i = this.f37231;
        if (i <= 0) {
            throw new IllegalStateException("No background text task");
        }
        this.f37231 = i - 1;
        if (this.f37194) {
            m30386();
        }
    }

    /* JADX INFO: renamed from: ܶۧ */
    public boolean mo25916() {
        return true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final synchronized void m30485() {
        if (this.f37194) {
            throw new IllegalStateException("Text view is released");
        }
        this.f37231++;
    }

    /* JADX INFO: renamed from: ᩵֫ */
    public int mo25920() {
        return 33554433;
    }

    /* JADX INFO: renamed from: ᩸ܽ */
    public boolean mo25925() {
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30144(C12392 c12392, C20030 c20030, Runnable runnable) {
        c12392.getClass();
        try {
            c12392.m30339(c20030);
            try {
                runnable.run();
            } finally {
                c12392.m30224();
            }
        } catch (Throwable th) {
            try {
                runnable.run();
                throw th;
            } finally {
                c12392.m30224();
            }
        }
    }

    public C12392(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C12392(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37314 = 0L;
        this.f37309 = 0L;
        this.f37208 = 0;
        this.f37280 = SystemClock.uptimeMillis();
        this.f37263 = 0L;
        this.f37271 = 0;
        this.f37227 = 0;
        this.f37226 = 0;
        this.f37186 = new AtomicInteger();
        this.f37221 = -1.0f;
        this.f37196 = true;
        this.f37237 = false;
        this.f37300 = false;
        this.f37200 = 0;
        this.f37288 = false;
        this.f37282 = new RectF();
        this.f37206 = -1;
        this.f37242 = -1;
        this.f37298 = -1;
        this.f37312 = -1;
        this.f37264 = new RectF();
        this.f37323 = new Rect();
        this.f37197 = true;
        C2141 c2141 = new C2141(this);
        this.f37183 = c2141;
        this.f37299 = c2141;
        this.f37249 = new int[2];
        this.f37230 = new ArrayList();
        this.f37277 = false;
        this.f37187 = false;
        this.f37240 = -1L;
        this.f37287 = false;
        this.f37283 = new ArrayList();
        this.f37284 = new AtomicInteger();
        this.f37273 = new C22229();
        this.f37265 = new Rect();
        this.f37306 = new Rect();
        this.f37210 = -1L;
        this.f37278 = 255;
        this.f37272 = new CopyOnWriteArrayList();
        this.f37202 = new AtomicInteger();
        this.f37304 = false;
        this.f37253 = BreakIterator.getWordInstance();
        this.f37182 = new ArrayDeque();
        this.f37217 = new Object();
        this.f37260 = new Object();
        this.f37322 = new C0273("");
        this.f37248 = new C6768(this);
        this.f37207 = new HandlerC13637(this);
        this.f37292 = new ArrayList();
        this.f37179 = new C6322();
        this.f37198 = new C22146();
        this.f37243 = new C22146();
        this.f37180 = new ArrayList();
        this.f37238 = new ArrayList();
        this.f37239 = C8817.m22786(300);
        this.f37233 = new CursorAnchorInfo.Builder();
        this.f37229 = new Matrix();
        this.f37212 = new int[2];
        this.f37286 = new AtomicInteger();
        this.f37211 = false;
        this.f37297 = C13802.f41129;
        setSaveEnabled(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        if (!isInEditMode()) {
            this.f37274 = (InputMethodManager) context.getSystemService("input_method");
            this.f37178 = (ClipboardManager) context.getSystemService("clipboard");
        } else {
            C13835.m33194();
        }
        C22686 c22686 = new C22686(this);
        if (!isInEditMode()) {
            c22686.m50683();
        }
        if (i2 >= 24) {
            setPointerIcon(PointerIcon.getSystemIcon(context, 1008));
        }
        this.f37245 = c22686;
        this.f37188 = new C1869();
        this.f37235 = new C6870(this);
        this.f37173 = new C6458(this);
        this.f37315 = new C23701(this);
        if (!mo25916()) {
            this.f37322.mo1601().m52363(0L);
        }
        this.f37322.setSelection(0);
        this.f37303 = new EdgeEffect(context);
        this.f37189 = new EdgeEffect(context);
        m30126(AbstractC3179.m9745(this, this.f37322, c22686, this.f37200), true);
        setLongClickable(true);
        this.f37285 = new OverScroller(context);
        ViewOnTouchListenerC17331 viewOnTouchListenerC17331 = new ViewOnTouchListenerC17331(this, context);
        this.f37215 = viewOnTouchListenerC17331;
        this.f37257 = new C0923(context, viewOnTouchListenerC17331);
        setOnTouchListener(viewOnTouchListenerC17331);
        Activity activityM15313 = C5350.m15313(context);
        if (activityM15313 instanceof AbstractActivityC3346) {
            this.f37205 = (AbstractActivityC3346) activityM15313;
        }
        m30221();
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo25918() {
        if (isInEditMode()) {
            return;
        }
        C7701 c7701 = this.f37311;
        if (c7701 != null) {
            c7701.m20608();
        }
        this.f37311 = null;
        this.f37245.m50683();
        C22810 c22810 = this.f37181;
        if (c22810 != null) {
            ViewTreeObserverOnPreDrawListenerC8575[] viewTreeObserverOnPreDrawListenerC8575Arr = c22810.f73647;
            viewTreeObserverOnPreDrawListenerC8575Arr[0].m22284();
            viewTreeObserverOnPreDrawListenerC8575Arr[1].m22284();
            viewTreeObserverOnPreDrawListenerC8575Arr[2].m22284();
        }
    }

    /* JADX INFO: renamed from: ᩹ܽ, reason: not valid java name and contains not printable characters */
    public final void m30533() {
        try {
            this.f37288 = true;
            AbstractC3179 abstractC3179 = this.f37258;
            abstractC3179.m9785();
            if (abstractC3179 instanceof C2575) {
                this.f37258 = new C2575(this, this.f37322, this.f37245);
            } else {
                if (!(abstractC3179 instanceof C17474)) {
                    throw new RuntimeException(String.valueOf(abstractC3179));
                }
                C17474 c17474 = new C17474(this, this.f37322, this.f37245, ((C17474) abstractC3179).m40872());
                this.f37258 = c17474;
                if (c17474.mo8163() == 0.0f) {
                    this.f37258.mo9783((int) abstractC3179.mo8163());
                }
            }
            while (this.f37258.mo9770()) {
                SystemClock.sleep(100L);
            }
            this.f37258.mo8158(abstractC3179.f10006);
            this.f37288 = false;
            m30123(m30390(getScrollX()), m30521(this.f37170), true);
            this.f37221 = -1.0f;
        } catch (Throwable th) {
            this.f37288 = false;
            m30123(m30390(getScrollX()), m30521(this.f37170), true);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30321(InterfaceC0979 interfaceC0979) {
        this.f37254 = interfaceC0979;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, this.f37170);
    }

    @Override // android.view.View
    public final void setScrollX(int i) {
        m30123(i, this.f37170, true);
    }

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final int m30408() {
        return this.f37170;
    }

    @Override // android.view.View
    public final void setScrollY(int i) {
        m30123(getScrollX(), i, true);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        m30123(getScrollX() + i, this.f37170 + i2, true);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        if (this.f37276) {
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m30242(int i, int i2) {
        AbstractC3179 abstractC3179;
        int scrollX = getScrollX();
        int i3 = this.f37170;
        boolean z = this.f37220;
        InterfaceC7785 interfaceC7785 = this.f37195;
        InterfaceC7785 interfaceC7786 = this.f37322;
        if (interfaceC7785 != interfaceC7786) {
            this.f37195 = interfaceC7786;
            this.f37220 = false;
        }
        if (Math.abs(i2) + ((long) getHeight()) > 65536 || ((abstractC3179 = this.f37258) != null && abstractC3179.f10015 == this.f37322 && abstractC3179.m9789() > 65536.0d)) {
            this.f37220 = true;
        }
        this.f37170 = i2;
        this.f37276 = true;
        try {
            super.scrollTo(i, this.f37220 ? 0 : i2);
            this.f37276 = false;
            if (i != scrollX || i2 != i3) {
                super.onScrollChanged(i, i2, scrollX, i3);
            }
            if (z == this.f37220 && i == scrollX && i2 == i3) {
                return;
            }
            invalidate();
        } catch (Throwable th) {
            this.f37276 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30130(C12392 c12392, int i, int i2) {
        c12392.m30123(i, i2, true);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        m30123(i, i2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m30123(int i, int i2, boolean z) {
        int scrollX;
        int i3;
        if (z) {
            m30181();
            m30191();
            this.f37202.incrementAndGet();
        }
        if (this.f37288) {
            return;
        }
        InterfaceC0979 interfaceC0979 = this.f37254;
        if (interfaceC0979 != null) {
            scrollX = getScrollX();
            i3 = this.f37170;
        } else {
            scrollX = 0;
            i3 = 0;
        }
        try {
            m30242(i, i2);
            if (interfaceC0979 != null) {
                interfaceC0979.mo3444(scrollX, i3, i, i2);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m30392(int i, int i2) {
        m30181();
        m30191();
        this.f37202.incrementAndGet();
        this.f37207.removeMessages(1);
        if (!this.f37285.isFinished()) {
            this.f37285.forceFinished(true);
        }
        int scrollX = getScrollX();
        int i3 = this.f37170;
        if (scrollX == i && i3 == i2) {
            return;
        }
        if (scrollX != i) {
            i = m30390(i);
        }
        if (i3 != i2) {
            i2 = m30521(i2);
        }
        try {
            m30242(i, i2);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m30411(int i, int i2) {
        m30181();
        this.f37202.incrementAndGet();
        int scrollX = getScrollX();
        int i3 = this.f37170;
        if (i == -1) {
            i = this.f37285.isFinished() ? scrollX : this.f37285.getFinalX();
        }
        if (i2 == -1) {
            i2 = this.f37285.isFinished() ? i3 : this.f37285.getFinalY();
        }
        m30191();
        m30404();
        this.f37285.startScroll(scrollX, i3, i - scrollX, i2 - i3);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m30126(AbstractC3179 abstractC3179, boolean z) {
        int iM24484;
        int i;
        int i2;
        m30244();
        AbstractC3179 abstractC31710 = this.f37258;
        if (abstractC31710 != abstractC3179) {
            if (abstractC31710 != null) {
                abstractC31710.m9785();
            }
            m30252("Session layout changed");
        }
        if (abstractC31710 != null) {
            abstractC3179.mo8158(abstractC31710.f10006);
        }
        int iM30521 = 0;
        if (z && abstractC31710 != null && (abstractC3179 instanceof C2575)) {
            int iM9759 = abstractC31710.m9759(this.f37170 + 1);
            C11747 c11747 = abstractC31710.f9998.get(iM9759);
            i2 = c11747.f35062;
            i = c11747.f35064;
            iM24484 = (int) (this.f37170 - (this.f37245.m24484() * iM9759));
        } else {
            iM24484 = 0;
            i = 0;
            i2 = 0;
        }
        if (abstractC31710 != abstractC3179 && (abstractC31710 instanceof C17474)) {
            ((C17474) abstractC31710).m40871();
        }
        this.f37258 = abstractC3179;
        if (abstractC3179.mo8160()) {
            this.f37216 = new EdgeEffect(getContext());
            this.f37275 = new EdgeEffect(getContext());
            if (this.f37316) {
                C16909.m39764(this.f37216);
                C16909.m39764(this.f37275);
            }
        } else {
            this.f37216 = null;
            this.f37275 = null;
        }
        if (z && abstractC31710 != null && (abstractC3179 instanceof C2575)) {
            while (i < abstractC3179.f9998.size()) {
                C11747 c11748 = abstractC3179.f9998.get(i);
                if (c11748.f35062 == i2 || c11748.f35063 > i2) {
                    iM30521 = m30521(((int) (this.f37245.m24484() * i)) + iM24484);
                    break;
                }
                i++;
            }
            if (this.f37318 == null) {
                m30123(getScrollX(), iM30521, true);
            }
        }
        this.f37221 = -1.0f;
        m30171();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m30381(int i) {
        C22686 c22686 = this.f37245;
        c22686.m50684(c22686.f29058.getTextSize(), i);
        m30289();
        this.f37258.mo8173();
        this.f37221 = -1.0f;
        invalidate();
    }

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public static void m30288(C12392 c12392) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = c12392.f37216;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = c12392.f37216.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = c12392.f37303;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= c12392.f37303.isFinished();
        }
        EdgeEffect edgeEffect3 = c12392.f37275;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= c12392.f37275.isFinished();
        }
        EdgeEffect edgeEffect4 = c12392.f37189;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= c12392.f37189.isFinished();
        }
        if (zIsFinished) {
            int i = C17648.f53953;
            c12392.postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ᩺ܽ, reason: not valid java name and contains not printable characters */
    public final void m30537() {
        this.f37263 = SystemClock.uptimeMillis();
        invalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30330(InterfaceC8035 interfaceC8035) {
        this.f37238.add(interfaceC8035);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30332(C10651 c10651) {
        this.f37238.remove(c10651);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30311(int i, int i2) {
        if (m30519()) {
            return;
        }
        ArrayList arrayList = this.f37238;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((InterfaceC8035) arrayList.get(i3)).mo1646(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۗۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30370() {
        if (m30519()) {
            return true;
        }
        AbstractC3179 abstractC3179 = this.f37258;
        return abstractC3179 != null && abstractC3179.mo9770();
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String m30368() {
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
        sb.append(this.f37277);
        sb.append("\npreparingManual=");
        sb.append(this.f37287);
        sb.append("\nawaitingPrepareFinish=");
        sb.append(this.f37187);
        sb.append("\nrestoringInstanceState=");
        sb.append(this.f37304);
        sb.append("\ncancelPrepare=");
        sb.append(this.f37256);
        sb.append("\ncontentLoading=");
        sb.append(this.f37261);
        sb.append("\nlargeChange=");
        sb.append(m30519());
        sb.append("\npendingScroll=");
        boolean z = false;
        sb.append(this.f37244 != null);
        sb.append("\nlayout=");
        AbstractC3179 abstractC3179 = this.f37258;
        sb.append(abstractC3179 == null ? "null" : abstractC3179.getClass().getName());
        sb.append("\nlayoutLoading=");
        AbstractC3179 abstractC31710 = this.f37258;
        sb.append(abstractC31710 != null && abstractC31710.mo9770());
        sb.append("\ntextPrepared=");
        C15213 c15213 = this.f37177;
        if (c15213 != null && c15213.f46686) {
            z = true;
        }
        sb.append(z);
        sb.append("\nsoftWrap=");
        return C3200.m9831(this.f37200, "\n", sb);
    }

    /* JADX INFO: renamed from: ᩳܽ, reason: not valid java name and contains not printable characters */
    public final boolean m30505() {
        if (m30519() || this.f37277 || this.f37187 || this.f37287 || this.f37304) {
            return false;
        }
        AbstractC3179 abstractC3179 = this.f37258;
        return abstractC3179.f10015 == this.f37322 && abstractC3179.m9757() && !this.f37258.f9998.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚᩳ, reason: not valid java name and contains not printable characters */
    public boolean m30174() {
        return m30505() && !m30370() && !this.f37261 && this.f37244 == null && this.f37177 == null;
    }

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC21708 m30491() {
        return this.f37236;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m30497(int i, int i2) {
        AbstractC21708 abstractC21708 = this.f37236;
        if (abstractC21708 == null || !abstractC21708.m49034()) {
            AtomicInteger atomicInteger = this.f37286;
            atomicInteger.incrementAndGet();
            try {
                if (this.f37196) {
                    C6322 c6322 = this.f37179;
                    InterfaceC7785 interfaceC7785 = this.f37322;
                    c6322.getClass();
                    int i3 = i <= 0 ? 0 : i - 1;
                    int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC7785, '\n', i3);
                    if (iIndexOf == -1) {
                        iIndexOf = interfaceC7785.length();
                    }
                    StringBuilder sb = new StringBuilder(C22686.f73225);
                    for (int iLastIndexOf = TextUtils.lastIndexOf(interfaceC7785, '\n', i3) + 1; iLastIndexOf < iIndexOf; iLastIndexOf++) {
                        char cCharAt = interfaceC7785.charAt(iLastIndexOf);
                        if (cCharAt != ' ' && cCharAt != '\t') {
                            break;
                        }
                        sb.append(cCharAt);
                    }
                    interfaceC7785.replace(i, i2, sb.toString());
                    if (i != i2) {
                        interfaceC7785.setSelection(sb.length() + i);
                    }
                } else {
                    this.f37322.replace(i, i2, C22686.f73225);
                    if (i != i2) {
                        mo25919(i + 1);
                    }
                }
                invalidate();
            } finally {
                atomicInteger.decrementAndGet();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30313(TextWatcher textWatcher) {
        this.f37180.add(textWatcher);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30319(C0065 c0065) {
        C6055.m16891(this.f37180, c0065);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m30420(int i) {
        int iM9790 = this.f37258.m9790(i);
        if (this.f37258.mo8160()) {
            return iM9790;
        }
        try {
            return this.f37258.f9998.get(iM9790).f35064;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30350(int i, int[] iArr) {
        if (i >= 0 && i <= this.f37322.length()) {
            if (iArr.length < 2) {
                throw new IllegalArgumentException("lineColumn.length < 2");
            }
            try {
                if (m30519()) {
                    C7744 c7744Mo26556 = this.f37322.mo26556();
                    try {
                        int iM20765 = c7744Mo26556.m20765(i);
                        iArr[0] = iM20765;
                        iArr[1] = i - c7744Mo26556.m20768(iM20765);
                        c7744Mo26556.close();
                        return true;
                    } catch (Throwable th) {
                        try {
                            c7744Mo26556.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                int iM47366 = this.f37258.f9998.m47366(this.f37258.m9790(i));
                iArr[0] = this.f37258.f9998.m47357(iM47366);
                iArr[1] = i - this.f37258.f9998.m47355(iM47366);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m30471(int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            try {
                if (m30519()) {
                    C7744 c7744Mo26556 = this.f37322.mo26556();
                    try {
                        if (i < c7744Mo26556.m20769()) {
                            long jM20768 = ((long) c7744Mo26556.m20768(i)) + ((long) i2);
                            int i3 = jM20768 > ((long) c7744Mo26556.length()) ? -1 : (int) jM20768;
                            c7744Mo26556.close();
                            return i3;
                        }
                        c7744Mo26556.close();
                        return -1;
                    } catch (Throwable th) {
                        try {
                            c7744Mo26556.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                C20736 c20736 = this.f37258.f9998;
                int iM47348 = c20736.m47348(i);
                int iM47366 = iM47348 == -1 ? -1 : c20736.m47366(iM47348);
                if (iM47366 != -1) {
                    long j = ((long) this.f37258.f9998.get(iM47366).f35062) + ((long) i2);
                    if (j <= this.f37322.length()) {
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
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Point m30472(int i) {
        ?? Mo8160;
        int iM47355;
        int i2 = -1;
        if (m30519()) {
            int[] iArr = new int[2];
            return m30350(i, iArr) ? new Point(iArr[0] + 1, iArr[1] + 1) : new Point(-1, -1);
        }
        int iM9790 = this.f37258.m9790(i);
        try {
            Mo8160 = this.f37258.mo8160();
            try {
                if (Mo8160 != 0) {
                    int i3 = iM9790 + 1;
                    iM47355 = this.f37258.f9998.m47355(iM9790);
                    Mo8160 = i3;
                } else {
                    int iM47366 = this.f37258.f9998.m47366(iM9790);
                    int iM47357 = this.f37258.f9998.m47357(iM47366) + 1;
                    iM47355 = this.f37258.f9998.m47355(iM47366);
                    Mo8160 = iM47357;
                }
                i2 = (i - iM47355) + 1;
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            Mo8160 = -1;
        }
        return new Point(Mo8160, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30335(InterfaceC14528 interfaceC14528) {
        InterfaceC14528 interfaceC14529 = this.f37246;
        if (interfaceC14529 == interfaceC14528) {
            return;
        }
        if (this.f37251 != 0 && interfaceC14529 != null) {
            interfaceC14529.mo7198(false);
        }
        this.f37246 = interfaceC14528;
        if (this.f37251 == 0 || interfaceC14528 == null) {
            return;
        }
        interfaceC14528.mo7198(true);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30247(C12392 c12392) {
        InterfaceC14528 interfaceC14528;
        int i = c12392.f37251 + 1;
        c12392.f37251 = i;
        if (i != 1 || (interfaceC14528 = c12392.f37246) == null) {
            return;
        }
        interfaceC14528.mo7198(true);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30204(C12392 c12392) {
        InterfaceC14528 interfaceC14528;
        int i = c12392.f37251 - 1;
        c12392.f37251 = i;
        if (i != 0 || (interfaceC14528 = c12392.f37246) == null) {
            return;
        }
        interfaceC14528.mo7198(false);
    }

    /* JADX INFO: renamed from: ᩵ܽ, reason: not valid java name and contains not printable characters */
    public final void m30516() {
        C21441 c21441M30280;
        if (m30370() || (c21441M30280 = m30280(m30444())) == null) {
            return;
        }
        C22146 c22146 = this.f37198;
        C21441 c21441M49756 = c22146.m49756();
        if (c21441M49756 != null && Math.abs(c21441M49756.f69027 - c21441M30280.f69027) <= 3) {
            c22146.m49757();
        }
        this.f37243.m49752();
        c22146.m49755(c21441M30280);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m30455(int i, int i2) {
        if (m30370()) {
            return;
        }
        C21441 c21441M30280 = m30280(i);
        C21441 c21441M30281 = m30280(i2);
        if (c21441M30280 != null) {
            int i3 = c21441M30280.f69027;
            if (c21441M30281 == null || i3 == c21441M30281.f69027) {
                return;
            }
            C22146 c22146 = this.f37198;
            C21441 c21441M49756 = c22146.m49756();
            if (c21441M49756 != null && Math.abs(c21441M49756.f69027 - i3) <= 3) {
                c22146.m49757();
            }
            this.f37243.m49752();
            c22146.m49755(c21441M30280);
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m30374() {
        return this.f37198.m49758();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m30514() {
        return this.f37243.m49758();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m30495() {
        C21441 c21441M30280;
        if (m30370()) {
            return;
        }
        C22146 c22146 = this.f37198;
        if (c22146.m49758() && (c21441M30280 = m30280(m30444())) != null) {
            this.f37243.m49755(c21441M30280);
            m30148(c22146.m49757());
        }
    }

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final void m30481() {
        C21441 c21441M30280;
        if (m30370()) {
            return;
        }
        C22146 c22146 = this.f37243;
        if (c22146.m49758() && (c21441M30280 = m30280(m30444())) != null) {
            this.f37198.m49755(c21441M30280);
            m30148(c22146.m49757());
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private C21441 m30280(int i) {
        int[] iArr = new int[2];
        if (m30350(i, iArr)) {
            return new C21441(iArr[0], iArr[1]);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m30148(C21441 c21441) {
        int i = c21441.f69027;
        int i2 = c21441.f69026;
        if (i < 0 || i2 < 0 || this.f37258.f9998.isEmpty()) {
            return;
        }
        int i3 = this.f37258.f9998.m47368().f35064;
        if (i > i3) {
            i = i3;
        }
        int iM30471 = m30471(i, i2);
        if (iM30471 == -1) {
            iM30471 = this.f37322.length();
        }
        this.f37322.setSelection(iM30471);
        this.f37221 = -1.0f;
        m30227();
        m30349(iM30471, false);
        m30537();
        requestFocus();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m30383() {
        return !m30441() && this.f37322.mo1601().m52364();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m30296() {
        return !m30441() && this.f37322.mo1601().m52362();
    }

    /* JADX INFO: renamed from: ܽᩳ, reason: not valid java name and contains not printable characters */
    public final void m30484() {
        m30127(this.f37322, false);
    }

    /* JADX INFO: renamed from: ֡ܽ, reason: not valid java name and contains not printable characters */
    public final void m30298() {
        m30127(this.f37322, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m30127(InterfaceC7785 interfaceC7785, boolean z) {
        InterfaceC7785 interfaceC7786 = this.f37322;
        try {
            boolean z2 = true;
            boolean z3 = (!this.f37211 || this.f37302 == null || this.f37302.f12532) ? false : true;
            if (m30441()) {
                return;
            }
            if (!m30370() || z3) {
                this.f37221 = -1.0f;
                if (this.f37211 || !interfaceC7785.mo1601().m52356(z)) {
                    z2 = false;
                }
                if (z2) {
                    m30362();
                }
                try {
                    if (z) {
                        interfaceC7785.mo1597();
                    } else {
                        interfaceC7785.mo1599();
                    }
                    if (z2) {
                        m30397();
                    }
                    if (this.f37322 != interfaceC7785) {
                        return;
                    }
                    this.f37280 = SystemClock.uptimeMillis();
                    m30227();
                    InterfaceC19449 interfaceC19449 = this.f37301;
                    if (interfaceC19449 != null) {
                        interfaceC19449.mo2703(this.f37322.isChanged());
                        this.f37301.mo2704(m30383(), m30296());
                    }
                    m30345(false);
                    invalidate();
                } catch (Throwable th) {
                    if (z2) {
                        m30397();
                    }
                    throw th;
                }
            }
        } catch (UncheckedIOException | C3966 e) {
            if (!m30357(interfaceC7786, e)) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ᩴܽ, reason: not valid java name and contains not printable characters */
    public final void m30511() {
        m30501(false);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m30501(boolean z) {
        this.f37322.mo1601().m52343(z);
        InterfaceC19449 interfaceC19449 = this.f37301;
        if (interfaceC19449 != null) {
            interfaceC19449.mo2704(m30383(), m30296());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30338(InterfaceC19449 interfaceC19449) {
        this.f37301 = interfaceC19449;
    }

    /* JADX INFO: renamed from: ֨ܽ, reason: not valid java name and contains not printable characters */
    public final void m30303() {
        this.f37322.mo1601().m52349();
        InterfaceC19449 interfaceC19449 = this.f37301;
        if (interfaceC19449 != null) {
            interfaceC19449.mo2704(m30383(), m30296());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30316(String str) {
        String string = C22686.m50681(str).toString();
        int iM30444 = m30444();
        int iM30448 = m30448();
        if (iM30444 > iM30448) {
            iM30448 = iM30444;
            iM30444 = iM30448;
        }
        this.f37322.replace(iM30444, iM30448, string);
        mo25919(string.length() + iM30444);
        m30345(false);
    }

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public final int m30504() {
        return this.f37245.m24492();
    }

    /* JADX INFO: renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public final int m30482() {
        return this.f37245.f73275;
    }

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final int m30413() {
        return this.f37258.m9775() ? this.f37258.f10020.size() : this.f37258.f9998.size();
    }

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public final int m30301() {
        if (!m30519()) {
            if (this.f37258.f9998.size() == 0) {
                return 1;
            }
            AbstractC3179 abstractC3179 = this.f37258;
            return abstractC3179.f9998.get(abstractC3179.f9998.size() - 1).f35064 + 1;
        }
        C7744 c7744Mo26556 = this.f37322.mo26556();
        try {
            int iM20769 = (int) c7744Mo26556.m20769();
            c7744Mo26556.close();
            return iM20769;
        } catch (Throwable th) {
            try {
                c7744Mo26556.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m30457(int i) {
        if (m30519()) {
            int iM30471 = m30471(i, 0);
            if (iM30471 >= 0) {
                mo25919(iM30471);
                return true;
            }
        } else if (i < m30301()) {
            C11747 c11747 = this.f37258.f9998.get(i);
            int i2 = i;
            while (c11747.f35064 < i) {
                i2++;
                c11747 = this.f37258.f9998.get(i2);
            }
            int i3 = c11747.f35062;
            m30455(m30444(), i3);
            mo25919(i3);
            m30349(i3, false);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m30487(boolean z) {
        this.f37196 = z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m30523(boolean z) {
        this.f37237 = z;
    }

    /* JADX INFO: renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30529() {
        return this.f37237;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m30382(boolean z) {
        m30376();
        this.f37300 = z;
    }

    /* JADX INFO: renamed from: ۧܽ, reason: not valid java name and contains not printable characters */
    public final boolean m30437() {
        return this.f37300;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m30372(int i) {
        if (!m30519()) {
            if (i >= this.f37258.f9998.size()) {
                return;
            }
            C11747 c11747 = this.f37258.f9998.get(i);
            int i2 = i;
            while (c11747.f35064 < i && (i2 = i2 + 1) < this.f37258.f9998.size()) {
                c11747 = this.f37258.f9998.get(i2);
            }
            int i3 = c11747.f35062;
            int i4 = c11747.f35063;
            while (true) {
                i2++;
                if (i2 < this.f37258.f9998.size()) {
                    C11747 c11748 = this.f37258.f9998.get(i2);
                    if (c11748.f35064 != i) {
                        break;
                    } else {
                        i4 = c11748.f35063;
                    }
                } else {
                    break;
                }
            }
            mo25922(i3, i4);
            m30349(i3, false);
            return;
        }
        C7744 c7744Mo26556 = this.f37322.mo26556();
        if (i >= 0) {
            try {
                if (i < c7744Mo26556.m20769()) {
                    int iM20768 = c7744Mo26556.m20768(i);
                    int i5 = i + 1;
                    mo25922(iM20768, ((long) i5) < c7744Mo26556.m20769() ? c7744Mo26556.m20768(i5) - 1 : c7744Mo26556.length());
                    c7744Mo26556.close();
                    return;
                }
            } catch (Throwable th) {
                try {
                    c7744Mo26556.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        c7744Mo26556.close();
    }

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final C1869 m30375() {
        return this.f37188;
    }

    /* JADX INFO: renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public final void m30510() {
        int i = this.f37271 + 1;
        this.f37271 = i;
        this.f37227 = i;
        C20154 c20154 = this.f37268;
        if (c20154 == null || c20154.f65266.mo26548() == c20154.f65265) {
            return;
        }
        m30252("Session text changed before view was ready");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m30456(boolean z) {
        if (z) {
            this.f37186.incrementAndGet();
        }
        this.f37322.mo1600(z);
        this.f37226 = z ? -1 : this.f37227;
        InterfaceC19449 interfaceC19449 = this.f37301;
        if (interfaceC19449 != null) {
            interfaceC19449.mo2703(z);
        }
    }

    /* JADX INFO: renamed from: ܺܽ, reason: not valid java name and contains not printable characters */
    public final void m30470() {
        this.f37322.mo1600(false);
        this.f37226 = this.f37227;
        if (this.f37301 != null) {
            post(new Runnable() { // from class: l.ۖۛᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7545.f37301.mo2703(false);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C8159 m30530() {
        return new C8159(this);
    }

    /* JADX INFO: renamed from: ᩺ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30536() {
        return (this.f37277 || this.f37187 || this.f37287 || this.f37304 || this.f37322.mo1605()) ? false : true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30434(C8159 c8159) {
        return this.f37322 == c8159.f25156 && this.f37322.mo26548() == c8159.f25157 && this.f37227 == c8159.f25155 && this.f37186.get() == c8159.f25153 && this.f37245.f73293.equals(c8159.f25154);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30358(C8159 c8159) {
        if (m30434(c8159)) {
            m30456(false);
            if (this.f37322 == c8159.f25156 && this.f37322.mo26548() == c8159.f25157 && this.f37227 == c8159.f25155 && !this.f37322.isChanged()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30297() {
        return this.f37322.isChanged();
    }

    /* JADX INFO: renamed from: ᩴᩳ, reason: not valid java name and contains not printable characters */
    private void m30269() {
        C22686 c22686 = this.f37245;
        if (c22686.f73263 && c22686.f73264) {
            boolean z = c22686.f73291;
            RectF rectF = this.f37282;
            if (z) {
                rectF.left -= this.f37258.f10000;
            } else {
                rectF.right += this.f37258.f10000;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30312(RectF rectF, int i) {
        this.f37258.m9779(rectF, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30345(boolean z) {
        if (m30519()) {
            return;
        }
        HandlerC13637 handlerC13637 = this.f37207;
        if (z) {
            handlerC13637.removeMessages(1);
            m30291(Selection.getSelectionEnd(this.f37322), true);
        } else {
            if (handlerC13637.hasMessages(1)) {
                return;
            }
            handlerC13637.sendEmptyMessage(1);
        }
    }

    /* JADX INFO: renamed from: ۠ܽ, reason: not valid java name and contains not printable characters */
    public final void m30404() {
        this.f37207.removeMessages(1);
    }

    /* JADX INFO: renamed from: ֨ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m30119() {
        if (!m30505() || this.f37258.mo9770() || m30394() <= 0 || m30542() <= 0) {
            return false;
        }
        AbstractC3179 abstractC3179 = this.f37258;
        return !(abstractC3179 instanceof C17474) || ((C17474) abstractC3179).m40874(m30394());
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private boolean m30188(int i, int i2) {
        m30191();
        boolean zM30519 = m30519();
        OverScroller overScroller = this.f37285;
        AtomicInteger atomicInteger = this.f37202;
        if (zM30519) {
            atomicInteger.incrementAndGet();
            overScroller.forceFinished(true);
            this.f37318 = new C13097(this, i, i2);
            return false;
        }
        if (!m30505()) {
            return false;
        }
        atomicInteger.incrementAndGet();
        overScroller.forceFinished(true);
        if (m30119()) {
            return true;
        }
        this.f37318 = new C13097(this, i, i2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۡᩳ, reason: not valid java name and contains not printable characters */
    public void m30191() {
        this.f37318 = null;
        if (this.f37296 != null) {
            this.f37296 = null;
            this.f37285.forceFinished(true);
        }
    }

    /* JADX INFO: renamed from: ܺᩳ, reason: not valid java name and contains not printable characters */
    private void m30244() {
        if (this.f37296 == null) {
            return;
        }
        OverScroller overScroller = this.f37285;
        if (!overScroller.isFinished() && this.f37296.m31756(this)) {
            this.f37318 = this.f37296;
        }
        this.f37296 = null;
        overScroller.forceFinished(true);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m30201(int i, int i2, int i3, int i4) {
        this.f37296 = new C13097(this, i, i2);
        this.f37321 = false;
        this.f37285.startScroll(getScrollX(), this.f37170, i3 - getScrollX(), i4 - this.f37170);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻ᩳ, reason: not valid java name and contains not printable characters */
    public boolean m30293() {
        C13097 c13097 = this.f37318;
        if (c13097 != null) {
            if (!c13097.m31756(this)) {
                m30191();
                return false;
            }
            if (m30119()) {
                C13097 c13098 = this.f37318;
                int i = c13098.f39215;
                int iMax = Math.max(0, Math.min(c13098.f39219, this.f37322.length()));
                m30191();
                if (i == 1) {
                    m30349(iMax, true);
                    return true;
                }
                if (i == 2) {
                    m30430(true);
                    return true;
                }
                if (i == 3) {
                    m30427(iMax, true);
                    return true;
                }
                if (i != 4) {
                    return true;
                }
                m30478(true);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m30364(int i) {
        if (this.f37318 == null && this.f37296 == null) {
            m30123(0, i, false);
        }
    }

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public final int m30459() {
        return Math.min(this.f37245.f73259, Math.max(0, m30542() / 2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30349(int i, boolean z) {
        this.f37207.removeMessages(1);
        return m30291(i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d5  */
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean m30291(int i, boolean z) {
        boolean z2;
        int iM30521;
        int iM30390;
        if (!m30188(1, i)) {
            return false;
        }
        if (!z && (!isAttachedToWindow() || getVisibility() != 0)) {
            z = true;
        }
        this.f37285.forceFinished(true);
        try {
            this.f37258.mo8157(this.f37282, i);
            m30269();
            int scrollX = getScrollX();
            int iM30522 = this.f37170;
            int i2 = this.f37206;
            if (i2 != -1) {
                scrollX = m30390(i2);
                this.f37206 = -1;
                z2 = true;
            } else {
                z2 = false;
            }
            int i3 = this.f37242;
            if (i3 != -1) {
                iM30522 = m30521(i3);
                this.f37242 = -1;
                z2 = true;
            }
            if (this.f37258.mo8160()) {
                float fMax = Math.max(this.f37245.m24484(), this.f37245.f73231.getIntrinsicWidth());
                float f = this.f37282.left;
                float f2 = scrollX;
                if (f < f2 + fMax) {
                    iM30390 = m30390((int) (f - fMax));
                } else {
                    float fMax2 = Math.max(m30394() - fMax, 0.0f);
                    float f3 = this.f37282.right;
                    if (f3 > f2 + fMax2) {
                        iM30390 = m30390((int) (f3 - fMax2));
                    } else {
                        iM30390 = m30390(scrollX);
                        if (iM30390 == scrollX) {
                            scrollX = iM30390;
                        }
                    }
                }
                scrollX = iM30390;
                z2 = true;
            }
            float f4 = this.f37282.top;
            float f5 = iM30522;
            if (f4 < f5) {
                iM30521 = m30521((int) f4);
            } else {
                float fMax3 = Math.max(m30542() - m30459(), 0);
                float f6 = this.f37282.bottom;
                if (f6 > f5 + fMax3) {
                    iM30521 = m30521((int) (f6 - fMax3));
                } else {
                    iM30521 = m30521(iM30522);
                    if (iM30521 != iM30522) {
                    }
                    if (z2) {
                        if (z) {
                            m30123(scrollX, iM30521, true);
                        } else {
                            m30201(1, i, scrollX, iM30521);
                        }
                    }
                    postInvalidate();
                    return z2;
                }
            }
            z2 = true;
            if (z2) {
                if (z) {
                    m30123(scrollX, iM30521, true);
                } else {
                    m30201(1, i, scrollX, iM30521);
                }
            }
            postInvalidate();
            return z2;
        } catch (IndexOutOfBoundsException unused) {
            this.f37242 = -1;
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x007c  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public void m30238(int i) {
        int iM30390;
        boolean z;
        if (!m30519() && this.f37258.mo8160()) {
            m30191();
            this.f37207.removeMessages(1);
            this.f37285.forceFinished(true);
            try {
                this.f37258.mo8157(this.f37282, i);
                m30269();
                int scrollX = getScrollX();
                float fMax = Math.max(this.f37245.m24484(), this.f37245.f73231.getIntrinsicWidth());
                float f = this.f37282.left;
                float f2 = scrollX;
                if (f < f2 + fMax) {
                    iM30390 = m30390((int) (f - fMax));
                } else {
                    float fMax2 = Math.max(m30394() - fMax, 0.0f);
                    float f3 = this.f37282.right;
                    if (f3 > f2 + fMax2) {
                        iM30390 = m30390((int) (f3 - fMax2));
                    } else {
                        int iM30391 = m30390(scrollX);
                        if (iM30391 != scrollX) {
                            iM30390 = iM30391;
                        } else {
                            iM30390 = iM30391;
                            z = false;
                        }
                        if (z) {
                            m30123(iM30390, this.f37170, true);
                            invalidate();
                        }
                    }
                }
                z = true;
                if (z) {
                    m30123(iM30390, this.f37170, true);
                    invalidate();
                }
            } catch (IndexOutOfBoundsException unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m30427(int i, boolean z) {
        boolean z2;
        int i2;
        this.f37207.removeMessages(1);
        if (m30188(3, i)) {
            if (!z && (!isAttachedToWindow() || getVisibility() != 0)) {
                z = true;
            }
            try {
                this.f37258.mo8157(this.f37282, i);
                m30269();
                int scrollX = getScrollX();
                int i3 = this.f37170;
                if (this.f37258.mo8160()) {
                    float fMax = Math.max(this.f37258.mo8162(), m30394() / 3);
                    float f = this.f37282.left;
                    float f2 = scrollX;
                    if (f < f2 + fMax) {
                        i2 = (int) (f - fMax);
                        if (i2 < 0) {
                            i2 = 0;
                        }
                    } else {
                        float fMax2 = Math.max(m30394() - fMax, 0.0f);
                        float f3 = this.f37282.right;
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
                RectF rectF = this.f37282;
                int iM30521 = m30521(Math.max((int) (((rectF.top + rectF.bottom) / 2.0f) - (m30542() / 2.0f)), (int) ((this.f37282.bottom + m30459()) - m30542())));
                if (iM30521 != i3) {
                    z2 = true;
                } else {
                    iM30521 = i3;
                }
                int iM30390 = m30390(i2);
                int iM30522 = m30521(iM30521);
                if (z2 | ((iM30390 == scrollX && iM30522 == i3) ? false : true)) {
                    if (z) {
                        m30123(iM30390, iM30522, true);
                    } else {
                        m30201(3, i, iM30390, iM30522);
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
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m30430(boolean z) {
        boolean z2;
        int i;
        float f;
        float f2;
        float fMax;
        float f3;
        int i2;
        int iM30390;
        int iM30521;
        boolean z3;
        float f4;
        float f5;
        float fMax2;
        float f6;
        this.f37207.removeMessages(1);
        if (m30188(2, 0)) {
            if (!z && (!isAttachedToWindow() || getVisibility() != 0)) {
                z = true;
            }
            this.f37285.forceFinished(true);
            int iM30444 = m30444();
            int iM30448 = m30448();
            if (iM30444 == iM30448) {
                m30345(z);
                return;
            }
            if (iM30444 <= iM30448) {
                iM30448 = iM30444;
                iM30444 = iM30448;
            }
            int scrollX = getScrollX();
            int i3 = this.f37170;
            float fMo8162 = this.f37258.mo8162();
            this.f37258.mo8157(this.f37282, iM30444);
            m30269();
            if (this.f37258.mo8160()) {
                float f7 = this.f37282.left;
                float f8 = scrollX;
                if (f7 < f8 + fMo8162) {
                    scrollX = (int) (f7 - fMo8162);
                    z2 = true;
                    if (scrollX < 0) {
                        scrollX = 0;
                    }
                } else {
                    float fMax3 = Math.max(m30394() - fMo8162, 0.0f);
                    float f9 = this.f37282.right;
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
            float f10 = this.f37282.top;
            float f11 = i3;
            if (f10 >= f11) {
                float fMax4 = Math.max(m30542() - m30459(), 0);
                float f12 = this.f37282.bottom;
                if (f12 > f11 + fMax4) {
                    i = (int) (f12 - fMax4);
                }
                this.f37258.mo8157(this.f37282, iM30448);
                m30269();
                if (this.f37258.mo8160()) {
                    f4 = this.f37282.left;
                    f5 = scrollX;
                    if (f4 < f5 + fMo8162) {
                        scrollX = (int) (f4 - fMo8162);
                        z2 = true;
                        if (scrollX < 0) {
                            scrollX = 0;
                        }
                    } else {
                        fMax2 = Math.max(m30394() - fMo8162, 0.0f);
                        f6 = this.f37282.right;
                        if (f6 > f5 + fMax2) {
                            scrollX = (int) (f6 - fMax2);
                            z2 = true;
                        }
                    }
                }
                f = this.f37282.top;
                f2 = i3;
                if (f < f2) {
                    fMax = Math.max(m30542() - m30459(), 0);
                    f3 = this.f37282.bottom;
                    if (f3 > f2 + fMax) {
                        i2 = (int) (f3 - fMax);
                    }
                    iM30390 = m30390(scrollX);
                    iM30521 = m30521(i3);
                    if (iM30390 == getScrollX() || iM30521 != this.f37170) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z2 | z3) {
                        if (z) {
                            m30123(iM30390, iM30521, true);
                        } else {
                            m30201(2, 0, iM30390, iM30521);
                        }
                    }
                    postInvalidate();
                }
                i2 = (int) f;
                i3 = i2;
                z2 = true;
                iM30390 = m30390(scrollX);
                iM30521 = m30521(i3);
                if (iM30390 == getScrollX()) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (z2 | z3) {
                    if (z) {
                        m30123(iM30390, iM30521, true);
                    } else {
                        m30201(2, 0, iM30390, iM30521);
                    }
                }
                postInvalidate();
            }
            i = (int) f10;
            i3 = i;
            z2 = true;
            this.f37258.mo8157(this.f37282, iM30448);
            m30269();
            if (this.f37258.mo8160()) {
                f4 = this.f37282.left;
                f5 = scrollX;
                if (f4 < f5 + fMo8162) {
                    scrollX = (int) (f4 - fMo8162);
                    z2 = true;
                    if (scrollX < 0) {
                        scrollX = 0;
                    }
                } else {
                    fMax2 = Math.max(m30394() - fMo8162, 0.0f);
                    f6 = this.f37282.right;
                    if (f6 > f5 + fMax2) {
                        scrollX = (int) (f6 - fMax2);
                        z2 = true;
                    }
                }
            }
            f = this.f37282.top;
            f2 = i3;
            if (f < f2) {
                fMax = Math.max(m30542() - m30459(), 0);
                f3 = this.f37282.bottom;
                if (f3 > f2 + fMax) {
                    i2 = (int) (f3 - fMax);
                }
                iM30390 = m30390(scrollX);
                iM30521 = m30521(i3);
                if (iM30390 == getScrollX()) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (z2 | z3) {
                    if (z) {
                        m30123(iM30390, iM30521, true);
                    } else {
                        m30201(2, 0, iM30390, iM30521);
                    }
                }
                postInvalidate();
            }
            i2 = (int) f;
            i3 = i2;
            z2 = true;
            iM30390 = m30390(scrollX);
            iM30521 = m30521(i3);
            if (iM30390 == getScrollX()) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (z2 | z3) {
                if (z) {
                    m30123(iM30390, iM30521, true);
                } else {
                    m30201(2, 0, iM30390, iM30521);
                }
            }
            postInvalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m30478(boolean z) {
        boolean z2;
        int iM30521;
        this.f37207.removeMessages(1);
        if (m30188(4, 0)) {
            if (!z && (!isAttachedToWindow() || getVisibility() != 0)) {
                z = true;
            }
            this.f37285.forceFinished(true);
            int iM30444 = m30444();
            int iM30448 = m30448();
            if (iM30444 == iM30448) {
                m30427(iM30444, z);
                return;
            }
            if (iM30444 <= iM30448) {
                iM30448 = iM30444;
                iM30444 = iM30448;
            }
            int scrollX = getScrollX();
            int i = this.f37170;
            float fMax = Math.max(this.f37258.mo8162(), m30394() / 3);
            this.f37258.mo8157(this.f37282, iM30444);
            m30269();
            float f = this.f37282.bottom;
            if (this.f37258.mo8160()) {
                float f2 = this.f37282.left;
                float f3 = scrollX;
                if (f2 < f3 + fMax) {
                    scrollX = (int) (f2 - fMax);
                    if (scrollX < 0) {
                        scrollX = 0;
                    }
                } else {
                    float fMax2 = Math.max(m30394() - fMax, 0.0f);
                    float f4 = this.f37282.right;
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
            this.f37258.mo8157(this.f37282, iM30448);
            m30269();
            float f5 = this.f37282.top;
            if (this.f37258.mo8160()) {
                float f6 = this.f37282.left;
                float f7 = scrollX;
                if (f6 < f7 + fMax) {
                    scrollX = (int) (f6 - fMax);
                    if (scrollX < 0) {
                        scrollX = 0;
                    }
                } else {
                    float fMax3 = Math.max(m30394() - fMax, 0.0f);
                    float f8 = this.f37282.right;
                    if (f8 > f7 + fMax3) {
                        scrollX = (int) (f8 - fMax3);
                    }
                }
                z2 = true;
            }
            if (f - f5 >= m30542() ? (iM30521 = m30521((int) f5)) != this.f37170 : (iM30521 = m30521((int) (((f5 + f) / 2.0f) - (m30542() / 2.0f)))) != this.f37170) {
                i = iM30521;
                z2 = true;
            }
            int iM30390 = m30390(scrollX);
            int iM30522 = m30521(i);
            if (((iM30390 == getScrollX() && iM30522 == this.f37170) ? false : true) | z2) {
                if (z) {
                    m30123(iM30390, iM30522, true);
                } else {
                    m30201(4, 0, iM30390, iM30522);
                }
            }
            postInvalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۬ᩳ, reason: not valid java name and contains not printable characters */
    public void m30227() {
        this.f37312 = -1;
        this.f37298 = -1;
    }

    /* JADX INFO: renamed from: ᩴ */
    public void mo25919(int i) {
        BaseInputConnection.removeComposingSpans(this.f37322);
        this.f37322.setSelection(i);
        m30227();
        this.f37221 = -1.0f;
        invalidate();
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo25922(int i, int i2) {
        BaseInputConnection.removeComposingSpans(this.f37322);
        this.f37322.setSelection(i, i2);
        m30227();
        this.f37221 = -1.0f;
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0027  */
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m30512(int i) {
        if (i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException();
        }
        int i2 = this.f37200;
        if (i2 != i) {
            if (i2 == 0 || i == 0) {
                m30126(AbstractC3179.m9745(this, this.f37322, this.f37245, i), true);
            } else {
                AbstractC3179 abstractC3179 = this.f37258;
                if (!(abstractC3179 instanceof C17474)) {
                    m30126(AbstractC3179.m9745(this, this.f37322, this.f37245, i), true);
                } else {
                    ((C17474) abstractC3179).m40869(i == 1);
                }
            }
            this.f37200 = i;
            m30364(this.f37170);
            invalidate();
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m30513(boolean z) {
        C22686 c22686 = this.f37245;
        if (c22686.f73261 != z) {
            c22686.f73261 = z;
            AbstractC3179 abstractC3179 = this.f37258;
            if (abstractC3179 instanceof C17474) {
                C17474 c17474 = (C17474) abstractC3179;
                c17474.m40869(c17474.m40872());
                m30364(this.f37170);
                invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public final int m30388() {
        return this.f37200;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m30475(float f) {
        m30424(f * this.f37245.f29053);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30309(float f) {
        if (f < 0.8f || f > 2.0f) {
            throw new IllegalArgumentException("Line spacing must be between 0.8 and 2.0");
        }
        if (this.f37245.m24500() == f) {
            return;
        }
        this.f37285.forceFinished(true);
        float fM24484 = this.f37245.m24484();
        double d = fM24484 > 0.0f ? ((double) this.f37170) / ((double) fM24484) : 0.0d;
        this.f37202.incrementAndGet();
        this.f37245.mo24477(f);
        AbstractC3179 abstractC3179 = this.f37258;
        if (abstractC3179 instanceof C2575) {
            ((C2575) abstractC3179).m8168();
        }
        m30289();
        m30392(getScrollX(), m30521((int) Math.min(2147483647L, Math.round(d * ((double) this.f37245.m24484())))));
        this.f37221 = -1.0f;
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public final float m30395() {
        C22686 c22686 = this.f37245;
        return c22686.f29058.getTextSize() / c22686.f29053;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m30424(float f) {
        this.f37245.m50689(f);
        m30289();
        this.f37258.mo8173();
        this.f37221 = -1.0f;
        invalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30310(float f, int i) {
        C22686 c22686 = this.f37245;
        c22686.m50684(f * c22686.f29053, i);
        m30289();
        this.f37258.mo8173();
        this.f37221 = -1.0f;
        invalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30317(String str, boolean z) {
        if (!this.f37287 && !this.f37304) {
            this.f37250 = null;
        }
        this.f37235.m18599();
        if (str == null) {
            str = "Text";
        }
        if (this.f37235.m18581(str)) {
            this.f37235.m18578((CharSequence) this.f37322);
            C22686 c22686 = this.f37245;
            c22686.f73297 = str;
            c22686.f73267 = true;
        } else if (str.startsWith(".") && this.f37235.m18569(str)) {
            this.f37235.m18578((CharSequence) this.f37322);
            C22686 c22687 = this.f37245;
            c22687.f73297 = str;
            c22687.f73267 = true;
        } else {
            this.f37245.f73267 = false;
        }
        if (this.f37245.f73267 && this.f37235.m18574()) {
            this.f37315.m52257(this.f37235.m18587());
        } else {
            this.f37315.m52257(C23701.f76752);
        }
        this.f37258.mo9784();
        m30405();
        if (z) {
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: ܽܽ, reason: not valid java name and contains not printable characters */
    public final boolean m30483() {
        if ((!m30519() || m30379()) && !this.f37277) {
            return ((this.f37187 && this.f37240 != this.f37218) || this.f37287 || this.f37304) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۛۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30389() {
        return (((!this.f37277 || !this.f37187) && (!m30519() || m30379())) || this.f37287 || this.f37304) ? false : true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m30489(int i, int i2) {
        if (m30519() || !this.f37258.mo9791(i, i2)) {
            return false;
        }
        if (this.f37241) {
            return true;
        }
        m30405();
        invalidate();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30359(int[] iArr) {
        return m30157(iArr, false, 0, 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30348(int i, int i2, int[] iArr) {
        return m30157(iArr, true, i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m30157(int[] iArr, boolean z, int i, int i2) {
        if (iArr == null || (iArr.length & 1) != 0) {
            throw new IllegalArgumentException("Invalid syntax dirty ranges");
        }
        boolean z2 = this.f37241;
        this.f37241 = true;
        try {
            return m30216(iArr, z, i, i2);
        } finally {
            this.f37241 = z2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m30156(boolean z, int i, int i2, int i3, int i4, int i5, int i6) {
        C23701 c23701;
        boolean z2 = this.f37241;
        this.f37241 = true;
        try {
            if (!(m30489(i, i2) && (i3 < 0 || m30489(i3, i4)))) {
                return false;
            }
            if (!z2) {
                if (z && (c23701 = this.f37315) != null) {
                    c23701.m52254(m30444(), m30448(), i5, i6);
                } else {
                    m30405();
                }
                invalidate();
            }
            return true;
        } finally {
            this.f37241 = z2;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m30216(int[] iArr, boolean z, int i, int i2) {
        boolean zM30156;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 3;
            if (i4 >= iArr.length) {
                if (i3 >= iArr.length) {
                    return true;
                }
                if (z) {
                    return m30156(true, iArr[i3], iArr[i3 + 1], -1, -1, i, i2);
                }
                return m30489(iArr[i3], iArr[i3 + 1]);
            }
            if (!z) {
                zM30156 = m30156(false, iArr[i3], iArr[i3 + 1], iArr[i3 + 2], iArr[i4], 0, 0);
            } else {
                zM30156 = m30156(true, iArr[i3], iArr[i3 + 1], iArr[i3 + 2], iArr[i4], i, i2);
            }
            if (!zM30156) {
                return false;
            }
            i3 += 4;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m30365(boolean z) {
        this.f37245.m24494(z);
        this.f37221 = -1.0f;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m30295(boolean z) {
        this.f37245.m24497(z);
        this.f37221 = -1.0f;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m30507(boolean z) {
        C22686 c22686 = this.f37245;
        if (c22686.f73263 != z) {
            c22686.f73263 = z;
        }
        this.f37221 = -1.0f;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m30541(boolean z) {
        C22686 c22686 = this.f37245;
        if (c22686.f73264 != z) {
            c22686.f73264 = z;
        }
        this.f37221 = -1.0f;
    }

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public final int m30402() {
        return this.f37175;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨᩳ, reason: not valid java name and contains not printable characters */
    public void m30221() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            post(new RunnableC15048(0, this));
        } else {
            setPadding(getPaddingLeft(), getPaddingTop() - this.f37175, getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        C22686 c22686 = this.f37245;
        int iMax = Math.max(0, (c22686 == null ? 0 : (int) Math.ceil(Math.max(0.0f, c22686.m24496() - c22686.m24501()))) - i2);
        this.f37175 = iMax;
        super.setPadding(i, i2 + iMax, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩺ᩳ, reason: not valid java name and contains not printable characters */
    public void m30289() {
        m30221();
        C8741 c8741 = this.f37225;
        if (c8741 != null) {
            c8741.m22613(this.f37245.m24484());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖᩳ, reason: not valid java name and contains not printable characters */
    public void m30162() {
        C8741 c8741 = this.f37225;
        if (c8741 != null) {
            c8741.m22612();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m30200(int i, int i2, int i3) {
        if (isInEditMode()) {
            return;
        }
        if (this.f37225 == null) {
            this.f37225 = new C8741(this);
            m30289();
        }
        this.f37225.m22614(i, i2, i3);
    }

    /* JADX INFO: renamed from: ۫ܽ, reason: not valid java name and contains not printable characters */
    public final void m30446() {
        this.f37197 = false;
    }

    /* JADX INFO: renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30403() {
        return this.f37197;
    }

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 m30503() {
        return this.f37205;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ۧۛᩳ] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30318(ArrayList arrayList) {
        arrayList.addAll(C4711.m13810());
        arrayList.add(new C3055(this, new InterfaceC13041() { // from class: l.ۧۛᩳ
            @Override // l.InterfaceC13041
            public final void accept(Object obj) {
                TextKeyListener textKeyListener = C12392.f37169;
                this.f32537.m30406(R.string.MT_Protector);
            }
        }));
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m30406(int i) {
        int i2;
        AbstractActivityC3346 abstractActivityC3346 = this.f37205;
        if (i == R.string.MT_Protector) {
            abstractActivityC3346.m10233().m2479(this);
            return;
        }
        if (i == R.string.MT_Protector) {
            C14714.m35010(this);
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
                int iM30444 = m30444();
                int iM30448 = m30448();
                int iMin = Math.min(iM30444, iM30448);
                int iMax = Math.max(iM30444, iM30448);
                if (iMin == iMax || !m30352(this.f37322.subSequence(iMin, iMax))) {
                    return;
                }
                mo25919(iM30448);
                m30345(false);
                m30400();
                return;
            }
            if (i == 17039371) {
                i2 = android.R.id.paste;
            } else {
                if (i == R.string.MT_Protector) {
                    InterfaceC22602 interfaceC22602 = this.f37191;
                    if (interfaceC22602 != null) {
                        interfaceC22602.mo11728();
                    }
                } else if (i == R.string.MT_Protector) {
                    if (this.f37191 != null) {
                        int iM30445 = m30444();
                        int iM30449 = m30448();
                        int iMin2 = Math.min(iM30445, iM30449);
                        int iMax2 = Math.max(iM30445, iM30449);
                        C22686 c22686 = this.f37245;
                        c22686.f73250 = iMin2;
                        c22686.f73229 = iMax2;
                        mo25919(iMin2);
                        this.f37191.mo11735(true, true);
                        m30465();
                        return;
                    }
                } else {
                    if (i == R.string.MT_Protector) {
                        getContext().startActivity(new Intent(getContext(), (Class<?>) ActivityC9923.class));
                        return;
                    }
                    if (i == R.string.MT_Protector) {
                        C22975.m51118(this);
                        return;
                    }
                    if (i == R.string.MT_Protector) {
                        int iM30446 = m30444();
                        int iM304410 = m30448();
                        this.f37322.delete(Math.min(iM30446, iM304410), Math.max(iM30446, iM304410));
                        invalidate();
                    } else {
                        if (i == R.string.MT_Protector) {
                            try {
                                String strM30378 = m30378();
                                if (strM30378 != null) {
                                    Intent intent = new Intent();
                                    intent.setAction("android.intent.action.SEND");
                                    intent.putExtra("android.intent.extra.TEXT", strM30378);
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
                                        if (abstractActivityC3346 != null) {
                                            abstractActivityC3346.m10223(e, (DialogInterface.OnDismissListener) null);
                                            return;
                                        } else {
                                            C21374.m48459((CharSequence) e.toString());
                                            return;
                                        }
                                    }
                                }
                                C21374.m48457(R.string.MT_Protector);
                                return;
                            }
                        }
                        if (i == R.string.MT_Protector) {
                            try {
                                C6870.m18553(abstractActivityC3346, this.f37322, this.f37255.m34926(), this.f37255.m34925(), Integer.parseInt(this.f37255.m34927().m49200().split("\\|")[1]));
                            } catch (Exception e2) {
                                abstractActivityC3346.m10223(e2, (DialogInterface.OnDismissListener) null);
                            }
                        } else if (i == R.string.MT_Protector) {
                            String strM30379 = m30378();
                            if (strM30379 != null) {
                                String strM19032 = C7053.m19032(strM30379);
                                if (abstractActivityC3346 == null) {
                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(strM19032));
                                    intent2.addFlags(268435456);
                                    try {
                                        C4925.m14335().startActivity(intent2);
                                        return;
                                    } catch (Throwable th) {
                                        C21374.m48459((CharSequence) th.toString());
                                        return;
                                    }
                                }
                                abstractActivityC3346.m10237(strM19032);
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
            m30466(i2);
        }
    }

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final C2141 m30524() {
        return this.f37183;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30320(InterfaceC0397 interfaceC0397) {
        this.f37299 = interfaceC0397;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m30214(MotionEvent motionEvent) {
        return (motionEvent.getSource() & o.a.r) == 8194;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m30215(int[] iArr) {
        int i;
        int i2;
        if (!isInEditMode()) {
            if (this.f37311 == null) {
                C7701 c7701 = new C7701(this);
                c7701.m20615(4500);
                c7701.m20613(new InterfaceC14050() { // from class: l.ܰۤᩳ
                    @Override // l.InterfaceC14050
                    public final void onMenuItemClick(MenuItem menuItem) {
                        TextKeyListener textKeyListener = C12392.f37169;
                        C12392 c12392 = this.f41062;
                        c12392.getClass();
                        CharSequence title = menuItem.getTitle();
                        if (title instanceof C16271) {
                            ((C16271) title).m38282().mo8779(c12392);
                        }
                    }
                });
                this.f37311 = c7701;
            }
            this.f37311.m20617();
            this.f37311.m20612((C6001) null);
            ArrayList<AbstractC2867> arrayList = new ArrayList();
            InterfaceC0397 interfaceC0397 = this.f37299;
            if (interfaceC0397 != null) {
                interfaceC0397.mo1091(arrayList);
            }
            boolean z = (m30370() || this.f37245.f73272) ? false : true;
            boolean z2 = this.f37322.length() == 0;
            int iM30444 = m30444();
            int iM30448 = m30448();
            if (iM30444 > iM30448) {
                i2 = iM30444;
                i = iM30448;
            } else {
                i = iM30444;
                i2 = iM30448;
            }
            if (iArr != null) {
                iArr[0] = i;
                iArr[1] = i2;
            }
            ArrayList arrayList2 = new ArrayList();
            Map mapM13812 = C4711.m13812();
            for (AbstractC2867 abstractC2867 : arrayList) {
                Integer num = (Integer) mapM13812.get(abstractC2867.mo8778());
                if (num != null && abstractC2867.mo8780(this, z, z2, i, i2)) {
                    C12640 c12640M20607 = this.f37311.m20607(abstractC2867.mo8781(), num.intValue());
                    c12640M20607.m30912(abstractC2867.mo8777(getContext()));
                    if (num.intValue() >= 300) {
                        c12640M20607.m30911();
                    }
                    if (abstractC2867.mo8782()) {
                        arrayList2.add(abstractC2867);
                    }
                }
            }
            if (!this.f37311.m20616()) {
                if (!arrayList2.isEmpty()) {
                    this.f37311.m20612(new C6001(0, arrayList2));
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ed  */
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m30299(int i) {
        boolean z;
        boolean z2;
        int[] iArr = new int[2];
        if (m30215(iArr)) {
            boolean z3 = false;
            int i2 = iArr[0];
            int i3 = iArr[1];
            RectF rectF = this.f37264;
            Rect rect = this.f37323;
            getWindowVisibleDisplayFrame(rect);
            getLocationOnScreen(this.f37249);
            int i4 = rect.top;
            int i5 = this.f37249[1];
            int i6 = i4 - i5;
            int i7 = rect.bottom - i5;
            if (i != -1) {
                z = true;
            } else {
                if (this.f37258.m9769(rectF)) {
                    rectF.left = ((rectF.left + rectF.right) / 2.0f) + 1.0f;
                    i = -2;
                } else {
                    this.f37258.m9779(rectF, i2);
                    if (rectF.top - this.f37170 < 0.0f || rectF.bottom - this.f37170 > m30542()) {
                        if (i2 != i3) {
                            try {
                                this.f37258.m9779(rectF, i3);
                            } catch (IndexOutOfBoundsException unused) {
                            }
                            if (rectF.top - this.f37170 >= 0.0f && rectF.bottom - this.f37170 <= m30542()) {
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
                this.f37311.m20609(C21943.m49423(0.8f, 0.86f));
                this.f37311.m20611(getWidth() / 2, (this.f37311.m20614() + getHeight()) / 2);
                return;
            }
            if (i >= 0) {
                this.f37258.mo8157(rectF, i);
            }
            rectF.offset(getPaddingLeft(), getPaddingTop());
            if (i != i3 || i2 == i3 || this.f37258.m9794(i2, i3)) {
                z2 = false;
            } else {
                z2 = true;
                z = false;
            }
            if (z) {
                if ((rectF.top - this.f37170) - this.f37311.m20614() >= i6) {
                    z3 = z;
                }
            } else if ((rectF.bottom - this.f37170) + this.f37311.m20614() + this.f37245.f73231.getIntrinsicHeight() > i7) {
                z3 = true;
            } else {
                z3 = z;
            }
            boolean z4 = (z3 || !mo25902() || ((float) getHeight()) - (rectF.bottom - ((float) this.f37170)) >= ((float) C11266.m27878(92.0f))) ? z3 : true;
            if (z4 && z2) {
                this.f37311.m20609(C21943.m49423(0.8f, 0.86f));
            }
            int scrollX = ((int) rectF.left) - getScrollX();
            int intrinsicHeight = z4 ? ((int) rectF.top) - this.f37170 : this.f37245.f73231.getIntrinsicHeight() + this.f37311.m20614() + (((int) rectF.bottom) - this.f37170);
            if (scrollX < 0 || scrollX > getWidth()) {
                scrollX = getWidth() / 2;
            }
            if (intrinsicHeight < i6 || intrinsicHeight > i7) {
                intrinsicHeight = getHeight() / 2;
            }
            this.f37311.m20611(scrollX, intrinsicHeight);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m30498(int i, boolean z) {
        int[] iArrM30480 = m30480(i, z);
        m30455(m30444(), iArrM30480[0]);
        mo25922(iArrM30480[0], iArrM30480[1]);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] m30480(int i, boolean z) {
        int[] iArrM18582;
        C6870 c6870 = this.f37235;
        if (c6870.m18575() && (iArrM18582 = c6870.m18582(i)) != null) {
            return iArrM18582;
        }
        int[] iArrM30179 = m30179(i, z);
        int i2 = iArrM30179[0];
        int i3 = iArrM30179[1];
        if (i2 == i3) {
            return iArrM30179;
        }
        String strSubstring = TextUtils.substring(this.f37322, i2, i3);
        BreakIterator breakIterator = this.f37253;
        breakIterator.setText(strSubstring);
        int i4 = i - i2;
        try {
            int iPreceding = breakIterator.preceding(i4);
            if (iPreceding < 0) {
                iPreceding = 0;
            }
            int next = breakIterator.next();
            iArrM30179[0] = iPreceding + i2;
            iArrM30179[1] = i2 + next;
            return iArrM30179;
        } catch (Exception unused) {
            int i5 = i4 + i2;
            iArrM30179[0] = i5;
            iArrM30179[1] = i5;
            return iArrM30179;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private int[] m30179(int i, boolean z) {
        int i2;
        int length;
        int iM9790 = this.f37258.m9790(i);
        if (iM9790 != 0) {
            C11747 c11747 = this.f37258.f9998.get(iM9790);
            int i3 = c11747.f35062;
            int i4 = c11747.f35064;
            int i5 = iM9790 - 1;
            while (true) {
                if (i5 >= 0) {
                    C11747 c11748 = this.f37258.f9998.get(i5);
                    if (c11748.f35064 != i4) {
                        if (z) {
                            i2 = c11748.f35063;
                            break;
                        }
                    } else {
                        i3 = c11748.f35062;
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
        if (iM9790 == this.f37258.f9998.size() - 1) {
            length = this.f37322.length();
        } else {
            C11747 c11749 = this.f37258.f9998.get(iM9790);
            int i6 = c11749.f35063;
            int i7 = c11749.f35064;
            do {
                iM9790++;
                if (iM9790 >= this.f37258.f9998.size()) {
                    break;
                }
                C11747 c117410 = this.f37258.f9998.get(iM9790);
                if (c117410.f35064 == i7) {
                    i6 = c117410.f35063;
                } else if (z) {
                    length = c117410.f35062;
                }
            } while (Math.abs(i6 - i) <= 10000);
            length = i6;
        }
        return new int[]{i2, length};
    }

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7785 m30436() {
        return this.f37322;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m30253(InterfaceC7785 interfaceC7785) {
        boolean z;
        if (!mo25916()) {
            interfaceC7785.mo1601().m52363(0L);
        }
        synchronized (this.f37260) {
            z = this.f37322 != interfaceC7785;
            if (z) {
                this.f37244 = null;
                m30191();
                this.f37202.incrementAndGet();
            }
            if (z) {
                this.f37247 = null;
                this.f37252 = null;
                this.f37234 = 0L;
                this.f37302 = null;
            }
            this.f37322 = interfaceC7785;
        }
        if (z) {
            AbstractC3179 abstractC3179 = this.f37258;
            if (abstractC3179 != null) {
                abstractC3179.m9785();
            }
            m30252("Session view owner changed");
            if (this.f37272.isEmpty()) {
                return;
            }
            C4925.m14315(new RunnableC7994(0, this));
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m30260(InterfaceC7785 interfaceC7785) {
        synchronized (this.f37230) {
            Iterator it = this.f37230.iterator();
            while (it.hasNext()) {
                if (((InterfaceC7785) it.next()) == interfaceC7785) {
                    return;
                }
            }
            this.f37230.add(interfaceC7785);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙᩳ, reason: not valid java name and contains not printable characters */
    public void m30171() {
        AbstractC3179 abstractC3179;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C4925.m14315(new RunnableC21400(0, this));
            return;
        }
        synchronized (this.f37230) {
            int size = this.f37230.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                InterfaceC7785 interfaceC7785 = (InterfaceC7785) this.f37230.get(size);
                if (interfaceC7785 != this.f37322 && ((abstractC3179 = this.f37258) == null || interfaceC7785 != abstractC3179.f10015)) {
                    this.f37230.remove(size);
                    interfaceC7785.mo13046(false);
                }
            }
        }
        if (this.f37171 && !this.f37277 && this.f37258.f10015 == this.f37322) {
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ܿܽ, reason: not valid java name and contains not printable characters */
    public final boolean m30493() {
        return this.f37194;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30336(AbstractC15440 abstractC15440) {
        if (this.f37322.mo1607()) {
            return;
        }
        InterfaceC7785 interfaceC7785 = this.f37322;
        if (interfaceC7785 instanceof C4342) {
            throw new IllegalStateException("Session already owns storage");
        }
        C0273 c0273 = (C0273) interfaceC7785;
        while (this.f37322 == c0273 && !this.f37194) {
            int iMo26548 = c0273.mo26548();
            long jMo1606 = c0273.mo1606();
            C5753 c5753M16202 = C5753.m16202(abstractC15440);
            try {
                C14548 c14548M52372 = c0273.mo1601().m52372();
                try {
                    c5753M16202.mo1601().m52341(c14548M52372);
                    c5753M16202.mo1603(c0273.mo1606());
                    c5753M16202.m16203();
                    c14548M52372.close();
                    if (m30152(c0273, c5753M16202, iMo26548, jMo1606)) {
                        return;
                    } else {
                        c5753M16202.mo1608();
                    }
                } catch (Throwable th) {
                    try {
                        c14548M52372.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException | Error | RuntimeException e) {
                c5753M16202.close();
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m30447() {
        InterfaceC7785 interfaceC7785 = this.f37322;
        if (!(interfaceC7785 instanceof C5753)) {
            return FutureC3575.m10905(null);
        }
        C5753 c5753 = (C5753) interfaceC7785;
        return c5753.m1604().m10920(new RunnableC8700(0, this, c5753), C1802.f6209);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30139(C12392 c12392, C5753 c5753) {
        while (c12392.f37322 == c5753 && !c12392.f37194) {
            try {
                if (c12392.m30152(c5753, C0273.m1590(c5753), c5753.mo26548(), c5753.mo1606())) {
                    break;
                }
            } catch (IOException e) {
                throw new C13452(e);
            }
        }
        try {
            c5753.mo1608();
        } catch (IOException e2) {
            throw new C13452(e2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30136(C12392 c12392, C0273 c0273, C0273 c0274) {
        C6768 c6768 = c12392.f37248;
        c0273.mo1593(c12392.f37232);
        c0273.mo1592(c0274.mo1591());
        for (Object obj : c0274.getSpans(0, c0274.length(), Object.class)) {
            if (obj != c6768 && obj != Selection.SELECTION_START && obj != Selection.SELECTION_END) {
                c0273.setSpan(obj, c0274.getSpanStart(obj), c0274.getSpanEnd(obj), c0274.getSpanFlags(obj));
            }
        }
        c0273.setFilters(c0274.getFilters());
        c0273.setSpan(c6768, 0, c0273.length(), 8388626);
        c12392.m30253(c0273);
    }

    /* JADX INFO: renamed from: ܿᩳ, reason: not valid java name and contains not printable characters */
    public final void m30494() {
        if (this.f37185) {
            return;
        }
        if (this.f37322.length() != 0 || (this.f37322 instanceof C4342)) {
            throw new IllegalStateException("Memory text mode must be selected before loading text");
        }
        this.f37185 = true;
        m30259((CharSequence) new C0273(""));
        ComponentCallbacks2 componentCallbacks2M15313 = C5350.m15313(getContext());
        if (componentCallbacks2M15313 instanceof InterfaceC23586) {
            ((InterfaceC23586) componentCallbacks2M15313).getLifecycle().mo19833(new C12932(new WeakReference(this)));
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private InterfaceC7785 m30245(CharSequence charSequence) {
        if (!this.f37185 || (charSequence instanceof C0273) || (charSequence instanceof C4342)) {
            return charSequence instanceof InterfaceC7785 ? (InterfaceC7785) charSequence : new C0273(charSequence);
        }
        return new C0273(charSequence);
    }

    /* JADX INFO: renamed from: ᩷ܽ, reason: not valid java name and contains not printable characters */
    public final int m30526() {
        return this.f37322.length();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30339(C20030 c20030) {
        synchronized (this.f37217) {
            m30212(c20030);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30340(final C20030 c20030, final Runnable runnable) {
        synchronized (this.f37182) {
            this.f37182.addLast(new Runnable() { // from class: l.᩷ۛᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    C12392.m30144(this.f66669, c20030, runnable);
                }
            });
            if (this.f37305 == null) {
                m30224();
            }
        }
    }

    /* JADX INFO: renamed from: ۫ᩳ, reason: not valid java name and contains not printable characters */
    private void m30224() {
        C21565 c21565;
        synchronized (this.f37182) {
            this.f37305 = null;
            if (this.f37302 == null && ((c21565 = this.f37222) == null || !c21565.f69292)) {
                Runnable runnable = (Runnable) this.f37182.pollFirst();
                this.f37305 = runnable;
                if (runnable != null) {
                    try {
                        C1802.f6208.submit(runnable);
                    } catch (RuntimeException e) {
                        this.f37182.addFirst(this.f37305);
                        this.f37305 = null;
                        throw e;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m30153(final InterfaceC7785 interfaceC7785, final AbstractC3179 abstractC3179, final AbstractC3179 abstractC31710, final int i) {
        boolean zBooleanValue;
        FutureTask futureTask = new FutureTask(new Callable() { // from class: l.֡ۛᩳ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C12392.m30122(this.f1499, interfaceC7785, abstractC3179, abstractC31710, i);
            }
        });
        if (Looper.myLooper() == Looper.getMainLooper()) {
            futureTask.run();
        } else {
            C4925.m14315(futureTask);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Boolean m30122(C12392 c12392, InterfaceC7785 interfaceC7785, AbstractC3179 abstractC3179, AbstractC3179 abstractC31710, int i) {
        synchronized (c12392.f37260) {
            if (c12392.f37322 == interfaceC7785 && c12392.f37258 == abstractC3179 && abstractC31710.m9757()) {
                c12392.f37200 = i;
                c12392.m30126(abstractC31710, true);
                c12392.f37235.m18584(interfaceC7785);
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m30212(final C20030 c20030) {
        AbstractC3179 abstractC3179;
        if (c20030.f64875 != this.f37245.m24500()) {
            FutureTask futureTask = new FutureTask(new Callable() { // from class: l.ۘۛᩳ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    TextKeyListener textKeyListener = C12392.f37169;
                    C12392 c12392 = this.f11851;
                    c12392.getClass();
                    c12392.m30309(c20030.f64875);
                    return null;
                }
            });
            if (Looper.myLooper() == Looper.getMainLooper()) {
                futureTask.run();
            } else {
                C4925.m14315(futureTask);
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
        this.f37207.removeMessages(1);
        this.f37285.forceFinished(true);
        this.f37221 = -1.0f;
        this.f37235.m18571();
        m30282();
        this.f37277 = true;
        boolean z2 = c20030.f64862;
        AbstractC3179 abstractC31710 = null;
        if (z2 != c20030.f64870) {
            if (z2) {
                m30317(c20030.f64860, false);
            } else {
                m30317((String) null, false);
            }
        }
        int i = c20030.f64867;
        boolean z3 = (i == c20030.f64872 && c20030.f64880 == c20030.f64881 && (i != 1 || C11003.equals(c20030.f64876, c20030.f64874))) ? false : true;
        boolean z4 = c20030.f64879;
        C22686 c22686 = this.f37245;
        boolean z5 = z4 != c22686.f73263;
        boolean z6 = c20030.f64882 != c22686.m24499();
        boolean z7 = c20030.f64863 != this.f37245.m24470();
        boolean z8 = c20030.f64868;
        C22686 c22687 = this.f37245;
        boolean z9 = z8 != c22687.f73261;
        int i2 = c20030.f64877;
        int i3 = this.f37200;
        boolean z10 = i2 != i3 || (i3 != 0 && z9);
        boolean z11 = c20030.f64865 != c22687.m24485();
        if (!z3 && !z5 && !z6 && !z7 && !z10 && !z11) {
            this.f37277 = false;
            this.f37235.m18597(this.f37322);
            m30165();
            m30231(this.f37170, false);
            return;
        }
        if (z3) {
            C22686 c22688 = this.f37245;
            c22688.m50684(c20030.f64880 * c22688.f29053, c20030.f64867);
            m30289();
        }
        if (z5) {
            this.f37245.f73263 = c20030.f64879;
        }
        if (z6) {
            this.f37245.m24494(c20030.f64882);
        }
        if (z7) {
            this.f37245.m24497(c20030.f64863);
        }
        if (z9) {
            this.f37245.f73261 = c20030.f64868;
        }
        if (z11) {
            this.f37245.m24478(c20030.f64865);
        }
        if (z3 || z6 || z7 || z10 || z11 || (z5 && c20030.f64877 != 0)) {
            int i4 = c20030.f64877;
            for (int i5 = 0; i5 < 2; i5++) {
                InterfaceC7785 interfaceC7785 = this.f37322;
                interfaceC7785.setReadOnly(true);
                try {
                    AbstractC3179 abstractC31711 = this.f37258;
                    abstractC31711.mo8165();
                    AbstractC3179 abstractC3179M9745 = AbstractC3179.m9745(this, interfaceC7785, this.f37245, i4);
                    if (!m30153(interfaceC7785, abstractC31711, abstractC3179M9745, i4)) {
                        abstractC3179M9745.mo8165();
                        interfaceC7785.setReadOnly(false);
                    } else {
                        interfaceC7785.setReadOnly(false);
                        abstractC31710 = abstractC3179M9745;
                        break;
                    }
                } catch (Throwable th2) {
                    interfaceC7785.setReadOnly(false);
                    throw th2;
                }
            }
            abstractC3179 = abstractC31710;
        } else {
            abstractC3179 = this.f37258;
        }
        if (abstractC3179 == null && m30519()) {
            this.f37200 = c20030.f64877;
        }
        if (abstractC3179 instanceof C17474) {
            final C17474 c17474 = (C17474) abstractC3179;
            post(new Runnable() { // from class: l.ᩴۛᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    TextKeyListener textKeyListener = C12392.f37169;
                    C12392 c12392 = this.f57637;
                    int iM30394 = c12392.m30394();
                    AbstractC3179 abstractC31712 = c12392.f37258;
                    C17474 c17475 = c17474;
                    if (abstractC31712 != c17475 || iM30394 <= 0 || c17475.mo8163() == iM30394) {
                        return;
                    }
                    c17475.mo9783(iM30394);
                }
            });
        }
        this.f37277 = false;
        this.f37235.m18597(this.f37322);
        m30165();
        m30231(this.f37170, false);
    }

    /* JADX INFO: renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30519() {
        C3926 c3926 = this.f37302;
        return c3926 != null && c3926.f12523 == this.f37322;
    }

    /* JADX INFO: renamed from: ۙۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30379() {
        C3926 c3926 = this.f37302;
        return c3926 != null && c3926.f12522 != null && c3926.f12522.f14707 && this.f37258 == c3926.f12522.f14706 && c3926.m11971(this.f37258) && this.f37258.mo8153(new C4590(getScrollX(), this.f37170, m30394(), m30542())) > 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30432(AbstractC3179 abstractC3179) {
        C3926 c3926 = this.f37302;
        if (m30479(abstractC3179)) {
            return true;
        }
        return c3926 != null && c3926.m11971(abstractC3179);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m30490(AbstractC3179 abstractC3179) {
        C3926 c3926 = this.f37302;
        C15213 c15213 = this.f37177;
        if (c15213 == null || c15213.f46683 == null || c15213.f46683.f14706 != abstractC3179) {
            return (c3926 == null || c3926.f12522 == null || c3926.f12522.f14706 != abstractC3179) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c4, code lost:
    
        if (r0 == false) goto L67;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m30347(int i, int i2, int i3, int i4) {
        boolean z;
        if (m30519()) {
            this.f37302.m11967(i, i2, i3, i4);
            return true;
        }
        if (!this.f37194 && this.f37302 == null && (i2 != 0 || i3 != 0)) {
            this.f37234 = ((long) i2) + ((long) i3) + this.f37234;
            if (!this.f37214) {
                this.f37214 = true;
                C4925.m14315(new RunnableC22934(0, this));
            }
            boolean z2 = this.f37258.mo9770() || this.f37277 || this.f37287 || this.f37187 || this.f37304 || this.f37258.m9781() != i4;
            if (!this.f37211 && !z2 && this.f37234 < 100000) {
                AbstractC3179 abstractC3179 = this.f37258;
                if (abstractC3179 instanceof C17474) {
                    C17474 c17474 = (C17474) abstractC3179;
                    if (!c17474.f10037.f73263 || c17474.f10021.mo25898() || Math.max(c17474.m9782(), c17474.f10015.length()) < 100000) {
                        z = false;
                    } else {
                        C7744 c7744Mo26556 = c17474.f10015.mo26556();
                        try {
                            float length = String.valueOf(c7744Mo26556.m20769()).length() + 1;
                            C22686 c22686 = c17474.f10037;
                            z = ((int) ((length + c22686.f73254) * c22686.f73245)) != c17474.f10000;
                            c7744Mo26556.close();
                        } catch (Throwable th) {
                            try {
                                c7744Mo26556.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }
            }
            C3926 c3926 = new C3926(this, this.f37322, this.f37258);
            this.f37302 = c3926;
            c3926.m11967(i, i2, i3, i4);
            m30404();
            this.f37285.forceFinished(true);
            MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            try {
                this.f37257.m3331(motionEventObtain);
                motionEventObtain.recycle();
                ViewOnTouchListenerC17331.m40657(this.f37215);
                this.f37258.m9785();
                this.f37173.m17860(this.f37322);
                this.f37235.m18571();
                this.f37315.m52265();
                postInvalidate();
                C4925.m14315(new RunnableC11646(c3926));
                return true;
            } catch (Throwable th3) {
                motionEventObtain.recycle();
                throw th3;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30261(C12392 c12392) {
        c12392.f37214 = false;
        if (c12392.f37211) {
            return;
        }
        c12392.f37234 = 0L;
    }

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public static void m30159(C12392 c12392) {
        synchronized (c12392.f37182) {
            if (c12392.f37305 == null) {
                c12392.m30224();
            }
        }
    }

    /* JADX INFO: renamed from: ᩻ܽ, reason: not valid java name and contains not printable characters */
    public final C18743 m30544() {
        return m30538(this.f37200);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C18743 m30538(int i) {
        C18743 c18743;
        synchronized (this.f37245) {
            Typeface typeface = this.f37245.f29058.getTypeface();
            float textSize = this.f37245.f29058.getTextSize();
            float textScaleX = this.f37245.f29058.getTextScaleX();
            float textSkewX = this.f37245.f29058.getTextSkewX();
            int iM24485 = this.f37245.m24485();
            boolean zM24499 = this.f37245.m24499();
            boolean zM24470 = this.f37245.m24470();
            boolean z = i != 0 && this.f37245.f73263;
            C22686 c22686 = this.f37245;
            c18743 = new C18743(typeface, textSize, textScaleX, textSkewX, iM24485, zM24499, zM24470, z, c22686.f73291, c22686.f73264, c22686.f73261, i, this.f37235.m18601());
        }
        return c18743;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸ᩳ, reason: not valid java name and contains not printable characters */
    public void m30282() {
        C3220 c3220 = new C3220();
        c3220.f10148 = -1;
        c3220.f10144 = -1L;
        this.f37250 = c3220;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m30412(boolean z) {
        if (z) {
            m30282();
        }
        this.f37287 = z;
        if (z) {
            this.f37235.m18571();
        } else {
            this.f37250 = null;
            this.f37235.m18589(this.f37322);
        }
        postInvalidate();
        if (z) {
            return;
        }
        m30165();
    }

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final void m30435() {
        this.f37287 = false;
        this.f37235.m18597(this.f37322);
        m30231(this.f37170, false);
        postInvalidate();
        m30165();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence m30305(CharSequence charSequence, InterfaceC17066 interfaceC17066) {
        try {
            return m30199((AbstractC15440) null, interfaceC17066, charSequence);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30337(AbstractC15440 abstractC15440, CharSequence charSequence) {
        m30306(abstractC15440, new C9406(), charSequence);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence m30306(AbstractC15440 abstractC15440, InterfaceC17066 interfaceC17066, CharSequence charSequence) {
        if (this.f37194 || interfaceC17066.mo1526()) {
            return charSequence;
        }
        if (!this.f37194 && abstractC15440 != null) {
            InterfaceC7785 interfaceC7785 = this.f37322;
            if ((interfaceC7785 instanceof C5753) && ((C5753) interfaceC7785).m16204(abstractC15440)) {
                m30447().m10930();
            }
        }
        return m30199(abstractC15440, interfaceC17066, charSequence);
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
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private CharSequence m30199(AbstractC15440 abstractC15440, InterfaceC17066 interfaceC17066, CharSequence charSequence) {
        C15213 c15213;
        int iMo1591;
        C5753 c5753M16202;
        InterfaceC7785 interfaceC7785;
        InterfaceC7785 interfaceC7786;
        InterfaceC7785 interfaceC7787;
        InterfaceC7785 interfaceC7788;
        int length;
        InterfaceC7785 interfaceC7785M30245;
        C4342 c4342;
        if (this.f37194 || interfaceC17066.mo1526()) {
            return charSequence;
        }
        synchronized (this.f37260) {
            this.f37256 = false;
            m30282();
            this.f37277 = true;
            this.f37218++;
            this.f37187 = true;
        }
        postInvalidate();
        this.f37235.m18571();
        try {
            if (!this.f37258.mo8160()) {
                while (getWidth() <= 0) {
                    if (!this.f37256 && !this.f37194 && !interfaceC17066.mo1526()) {
                        SystemClock.sleep(10L);
                    }
                }
                if (!this.f37256 && !this.f37194 && !interfaceC17066.mo1526()) {
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    c15213 = this.f37177;
                    if (c15213 != null && (charSequence != c15213.f46688 || this.f37258 != c15213.f46682)) {
                        throw new IllegalStateException("Session layout preparation was superseded");
                    }
                    if (charSequence instanceof C4342) {
                        c4342 = (C4342) charSequence;
                        if (c15213 != null || c15213.f46687.f9323 == null) {
                            this.f37245.f73293 = c4342.mo1601().m52350().m14686();
                        }
                    } else {
                        this.f37245.f73293 = C22686.m50682(charSequence);
                        charSequence = C22686.m50681(charSequence);
                    }
                    iMo1591 = this.f37322.mo1591();
                    if (abstractC15440 == null) {
                        c5753M16202 = C5753.m16202(abstractC15440);
                        try {
                            c5753M16202.replace(0, c5753M16202.length(), charSequence);
                            c5753M16202.mo1601().m52349();
                            c5753M16202.mo1600(false);
                            c5753M16202.m16203();
                            interfaceC7785 = c5753M16202;
                        } catch (Error | RuntimeException e) {
                            c5753M16202.close();
                            throw e;
                        }
                    } else {
                        interfaceC7785M30245 = m30245(charSequence);
                    }
                    if (abstractC15440 == null && (this.f37256 || this.f37194 || interfaceC17066.mo1526())) {
                        interfaceC7785 = interfaceC7785M30245;
                        interfaceC7785 = interfaceC7785M30245;
                        interfaceC7785 = interfaceC7785M30245;
                        ((C5753) interfaceC7785).close();
                    } else {
                        interfaceC7785 = interfaceC7785M30245;
                        interfaceC7785 = interfaceC7785M30245;
                        interfaceC7786 = this.f37322;
                        m30253(interfaceC7785);
                        if (interfaceC7786 != interfaceC7785) {
                            m30260(interfaceC7786);
                        }
                        this.f37173.m17860(this.f37322);
                        this.f37235.m18572();
                        this.f37315.m52265();
                        this.f37322.mo1593(this.f37232);
                        this.f37322.mo1592(iMo1591);
                        InterfaceC7785 interfaceC7789 = this.f37322;
                        interfaceC7789.setSpan(this.f37248, 0, interfaceC7789.length(), 8388626);
                        interfaceC7787 = this.f37322;
                        if (!(interfaceC7787 instanceof C4342)) {
                            interfaceC7787.setSelection(0);
                        }
                        this.f37221 = -1.0f;
                        m30227();
                        if (!this.f37256 && !this.f37194 && !interfaceC17066.mo1526()) {
                            if (this.f37235.m18574()) {
                                this.f37235.m18578((CharSequence) this.f37322);
                                this.f37235.m18602(this.f37322);
                            }
                            if (!this.f37245.f73267 && this.f37235.m18575()) {
                                this.f37315.m52257(this.f37235.m18587());
                            } else {
                                this.f37315.m52257(C23701.f76752);
                            }
                            if (!this.f37256 && !this.f37194 && !interfaceC17066.mo1526()) {
                                if (c15213 != null) {
                                    c15213.f46690 = this.f37322.mo26548();
                                }
                                this.f37258.mo8166(this.f37322);
                                m30510();
                                interfaceC7788 = this.f37322;
                                if (!(interfaceC7788 instanceof C4342)) {
                                    interfaceC7788.mo1600(true);
                                }
                                this.f37226 = -1;
                                if (c15213 != null || !c15213.f46687.m8950()) {
                                    length = this.f37322.length();
                                    int i = SharedPreferencesOnSharedPreferenceChangeListenerC21897.f70101;
                                    if (length > C4925.f15523.getInt("smooth_mode_threshold", 200000)) {
                                        this.f37300 = true;
                                    }
                                }
                                if (c15213 == null) {
                                    m30231(Math.max(0, 0), true);
                                }
                                if (c15213 != null && !this.f37256 && !this.f37194 && !interfaceC17066.mo1526()) {
                                    c15213.f46686 = true;
                                }
                                this.f37277 = false;
                                m30171();
                                m30165();
                                if (!this.f37256) {
                                    postInvalidate();
                                }
                                return charSequence;
                            }
                        }
                    }
                }
            } else if (!this.f37256) {
                if (charSequence == null) {
                    charSequence = "";
                }
                c15213 = this.f37177;
                if (c15213 != null) {
                    throw new IllegalStateException("Session layout preparation was superseded");
                }
                if (charSequence instanceof C4342) {
                    c4342 = (C4342) charSequence;
                    if (c15213 != null) {
                        this.f37245.f73293 = c4342.mo1601().m52350().m14686();
                    } else {
                        this.f37245.f73293 = c4342.mo1601().m52350().m14686();
                    }
                } else {
                    this.f37245.f73293 = C22686.m50682(charSequence);
                    charSequence = C22686.m50681(charSequence);
                }
                iMo1591 = this.f37322.mo1591();
                if (abstractC15440 == null) {
                    c5753M16202 = C5753.m16202(abstractC15440);
                    c5753M16202.replace(0, c5753M16202.length(), charSequence);
                    c5753M16202.mo1601().m52349();
                    c5753M16202.mo1600(false);
                    c5753M16202.m16203();
                    interfaceC7785 = c5753M16202;
                } else {
                    interfaceC7785M30245 = m30245(charSequence);
                }
                if (abstractC15440 == null) {
                    interfaceC7785 = interfaceC7785M30245;
                    interfaceC7785 = interfaceC7785M30245;
                    interfaceC7786 = this.f37322;
                    m30253(interfaceC7785);
                    if (interfaceC7786 != interfaceC7785) {
                        m30260(interfaceC7786);
                    }
                    this.f37173.m17860(this.f37322);
                    this.f37235.m18572();
                    this.f37315.m52265();
                    this.f37322.mo1593(this.f37232);
                    this.f37322.mo1592(iMo1591);
                    InterfaceC7785 interfaceC77810 = this.f37322;
                    interfaceC77810.setSpan(this.f37248, 0, interfaceC77810.length(), 8388626);
                    interfaceC7787 = this.f37322;
                    if (!(interfaceC7787 instanceof C4342)) {
                        interfaceC7787.setSelection(0);
                    }
                    this.f37221 = -1.0f;
                    m30227();
                    if (!this.f37256) {
                        if (this.f37235.m18574()) {
                            this.f37235.m18578((CharSequence) this.f37322);
                            this.f37235.m18602(this.f37322);
                        }
                        if (!this.f37245.f73267) {
                            this.f37315.m52257(C23701.f76752);
                        } else {
                            this.f37315.m52257(C23701.f76752);
                        }
                        if (!this.f37256) {
                            if (c15213 != null) {
                                c15213.f46690 = this.f37322.mo26548();
                            }
                            this.f37258.mo8166(this.f37322);
                            m30510();
                            interfaceC7788 = this.f37322;
                            if (!(interfaceC7788 instanceof C4342)) {
                                interfaceC7788.mo1600(true);
                            }
                            this.f37226 = -1;
                            if (c15213 != null) {
                                length = this.f37322.length();
                                int i2 = SharedPreferencesOnSharedPreferenceChangeListenerC21897.f70101;
                                if (length > C4925.f15523.getInt("smooth_mode_threshold", 200000)) {
                                    this.f37300 = true;
                                }
                            } else {
                                length = this.f37322.length();
                                int i3 = SharedPreferencesOnSharedPreferenceChangeListenerC21897.f70101;
                                if (length > C4925.f15523.getInt("smooth_mode_threshold", 200000)) {
                                    this.f37300 = true;
                                }
                            }
                            if (c15213 == null) {
                                m30231(Math.max(0, 0), true);
                            }
                            if (c15213 != null) {
                                c15213.f46686 = true;
                            }
                            this.f37277 = false;
                            m30171();
                            m30165();
                            if (!this.f37256) {
                                postInvalidate();
                            }
                            return charSequence;
                        }
                    }
                } else {
                    interfaceC7785 = interfaceC7785M30245;
                    interfaceC7785 = interfaceC7785M30245;
                    interfaceC7786 = this.f37322;
                    m30253(interfaceC7785);
                    if (interfaceC7786 != interfaceC7785) {
                        m30260(interfaceC7786);
                    }
                    this.f37173.m17860(this.f37322);
                    this.f37235.m18572();
                    this.f37315.m52265();
                    this.f37322.mo1593(this.f37232);
                    this.f37322.mo1592(iMo1591);
                    InterfaceC7785 interfaceC77811 = this.f37322;
                    interfaceC77811.setSpan(this.f37248, 0, interfaceC77811.length(), 8388626);
                    interfaceC7787 = this.f37322;
                    if (!(interfaceC7787 instanceof C4342)) {
                        interfaceC7787.setSelection(0);
                    }
                    this.f37221 = -1.0f;
                    m30227();
                    if (!this.f37256) {
                        if (this.f37235.m18574()) {
                            this.f37235.m18578((CharSequence) this.f37322);
                            this.f37235.m18602(this.f37322);
                        }
                        if (!this.f37245.f73267) {
                            this.f37315.m52257(C23701.f76752);
                        } else {
                            this.f37315.m52257(C23701.f76752);
                        }
                        if (!this.f37256) {
                            if (c15213 != null) {
                                c15213.f46690 = this.f37322.mo26548();
                            }
                            this.f37258.mo8166(this.f37322);
                            m30510();
                            interfaceC7788 = this.f37322;
                            if (!(interfaceC7788 instanceof C4342)) {
                                interfaceC7788.mo1600(true);
                            }
                            this.f37226 = -1;
                            if (c15213 != null) {
                                length = this.f37322.length();
                                int i4 = SharedPreferencesOnSharedPreferenceChangeListenerC21897.f70101;
                                if (length > C4925.f15523.getInt("smooth_mode_threshold", 200000)) {
                                    this.f37300 = true;
                                }
                            } else {
                                length = this.f37322.length();
                                int i5 = SharedPreferencesOnSharedPreferenceChangeListenerC21897.f70101;
                                if (length > C4925.f15523.getInt("smooth_mode_threshold", 200000)) {
                                    this.f37300 = true;
                                }
                            }
                            if (c15213 == null) {
                                m30231(Math.max(0, 0), true);
                            }
                            if (c15213 != null) {
                                c15213.f46686 = true;
                            }
                            this.f37277 = false;
                            m30171();
                            m30165();
                            if (!this.f37256) {
                                postInvalidate();
                            }
                            return charSequence;
                        }
                    }
                }
            }
            this.f37250 = null;
            this.f37187 = false;
            this.f37235.m18559();
            this.f37277 = false;
            m30171();
            m30165();
            return charSequence;
        } catch (Throwable th) {
            this.f37250 = null;
            this.f37187 = false;
            this.f37235.m18559();
            this.f37277 = false;
            m30171();
            m30165();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m30231(int i, boolean z) {
        if (Looper.myLooper() != Looper.getMainLooper() && this.f37245.f73267 && this.f37235.m18575()) {
            if (z || !(this.f37277 || this.f37287 || this.f37304)) {
                InterfaceC7785 interfaceC7785 = this.f37322;
                AbstractC3179 abstractC3179 = this.f37258;
                long j = this.f37218;
                while (abstractC3179.mo9770()) {
                    try {
                        if (interfaceC7785 != this.f37322 || j != this.f37218) {
                            return;
                        }
                        if (z && this.f37256) {
                            return;
                        } else {
                            Thread.sleep(10L);
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                synchronized (this.f37260) {
                    if (interfaceC7785 == this.f37322 && abstractC3179 == this.f37258 && abstractC3179.f10015 == interfaceC7785 && j == this.f37218 && !abstractC3179.mo9770() && ((!z || !this.f37256) && (z || (!this.f37277 && !this.f37287 && !this.f37304)))) {
                        int iM30542 = m30542();
                        long jMo9778 = (!z || interfaceC7785.length() <= 1000000 || iM30542 <= 0) ? 0L : abstractC3179.mo9778(i, iM30542);
                        this.f37235.m18566(interfaceC7785, (int) (jMo9778 >>> 32), (int) jMo9778);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public final String m30531() {
        return this.f37245.f73293;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m30499(String str) {
        this.f37245.f73293 = str;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m30462() {
        m30252("Session text preparation was canceled");
        this.f37250 = null;
        this.f37256 = true;
        this.f37187 = false;
        this.f37235.m18559();
        this.f37258.f10026 = true;
        this.f37258.f10019 = true;
        C3926 c3926 = this.f37302;
        if (c3926 != null) {
            c3926.f12528 = true;
            RunnableC9631 runnableC9631 = new RunnableC9631(1, c3926);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnableC9631.run();
            } else {
                C4925.m14315(runnableC9631);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m30474(InterfaceC7785 interfaceC7785) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Initial highlight readiness requires the foreground thread");
        }
        AbstractC3179 abstractC3179 = this.f37258;
        int iMo26548 = interfaceC7785.mo26548();
        long jUptimeMillis = SystemClock.uptimeMillis() + 500;
        FutureC3575 futureC3575 = new FutureC3575();
        new RunnableC12227(this, futureC3575, interfaceC7785, abstractC3179, iMo26548, jUptimeMillis).run();
        return futureC3575;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m30421(C4342 c4342, C21565 c21565) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Session readiness requires the foreground thread");
        }
        FutureC3575 futureC3575 = new FutureC3575();
        C4925.m14315(new RunnableC10111(this, futureC3575, c21565, c4342));
        return futureC3575;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private C21565 m30117(boolean z) {
        C21565 c21565;
        synchronized (this.f37182) {
            if (this.f37222 != null) {
                throw new IllegalStateException("Session task is already active");
            }
            c21565 = new C21565(z);
            this.f37222 = c21565;
        }
        return c21565;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C21565 m30539() {
        C21565 c21565M30117;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Session preparation requires the main thread");
        }
        synchronized (this.f37182) {
            if (this.f37222 != null || this.f37305 != null || !this.f37182.isEmpty() || !m30505() || m30370() || this.f37244 != null || this.f37322.mo1605()) {
                throw new IllegalStateException("View is busy before session preparation");
            }
            c21565M30117 = m30117(true);
            m30412(true);
        }
        return c21565M30117;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21565 m30307(C4342 c4342) {
        if (Looper.myLooper() != Looper.getMainLooper() || this.f37322 != c4342) {
            throw new IllegalStateException("Session close requires its foreground owner");
        }
        return m30117(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30356(C4342 c4342, C21565 c21565) {
        if (Looper.myLooper() != Looper.getMainLooper() || this.f37322 != c4342 || c21565 == null || c21565 != this.f37222) {
            throw new IllegalStateException("Session close requires its foreground task");
        }
        if (!c4342.m13047()) {
            return false;
        }
        synchronized (this.f37182) {
            if (this.f37305 == null && this.f37182.isEmpty() && !this.f37277 && !this.f37187 && !this.f37304 && this.f37244 == null && !m30370() && !this.f37322.mo1605()) {
                c21565.f69292 = true;
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30342(C21565 c21565) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Session preparation requires the main thread");
        }
        synchronized (this.f37182) {
            if (c21565 != null) {
                if (c21565 == this.f37222) {
                    m30213(c21565);
                    this.f37222 = null;
                    m30224();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30329(InterfaceC7785 interfaceC7785) {
        if (Looper.myLooper() != Looper.getMainLooper() || this.f37277 || m30370()) {
            throw new IllegalStateException("Session preparation is still reading the view");
        }
        if (this.f37322 != interfaceC7785) {
            return;
        }
        InterfaceC19449 interfaceC19449 = this.f37301;
        this.f37301 = null;
        try {
            mo25910("");
        } finally {
            this.f37301 = interfaceC19449;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 13111. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m30124(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instruction units count: 1311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12392.m30124(android.graphics.Canvas):void");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30308() {
        this.f37250 = null;
        if (this.f37187) {
            this.f37187 = false;
            RunnableC6583 runnableC6583 = new RunnableC6583(0, this, this.f37322);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnableC6583.run();
            } else {
                post(runnableC6583);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30140(C12392 c12392, InterfaceC7785 interfaceC7785) {
        if (c12392.f37322 == interfaceC7785 && c12392.m30483()) {
            c12392.requestLayout();
            c12392.invalidate();
            c12392.f37173.m17859(interfaceC7785);
            c12392.f37235.m18597(interfaceC7785);
            c12392.m30165();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo25910(CharSequence charSequence) {
        m30259(charSequence);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m30259(CharSequence charSequence) {
        this.f37250 = null;
        this.f37187 = false;
        if (charSequence == null) {
            charSequence = "";
        }
        if (charSequence instanceof C4342) {
            this.f37245.f73293 = ((C4342) charSequence).mo1601().m52350().m14686();
        } else {
            this.f37245.f73293 = C22686.m50682(charSequence);
            charSequence = C22686.m50681(charSequence);
        }
        int iMo1591 = this.f37322.mo1591();
        InterfaceC7785 interfaceC7785M30245 = m30245(charSequence);
        InterfaceC7785 interfaceC7785 = this.f37322;
        m30253(interfaceC7785M30245);
        this.f37173.m17860(this.f37322);
        this.f37235.m18572();
        this.f37315.m52265();
        if (interfaceC7785 != interfaceC7785M30245) {
            interfaceC7785.mo13046(false);
        }
        this.f37322.mo1593(this.f37232);
        this.f37322.mo1592(iMo1591);
        InterfaceC7785 interfaceC7786 = this.f37322;
        interfaceC7786.setSpan(this.f37248, 0, interfaceC7786.length(), 8388626);
        InterfaceC7785 interfaceC7787 = this.f37322;
        if (!(interfaceC7787 instanceof C4342)) {
            interfaceC7787.mo1601().m52349();
        }
        if (this.f37235.m18574()) {
            this.f37235.m18578((CharSequence) this.f37322);
        }
        if (this.f37245.f73267 && this.f37235.m18575()) {
            this.f37315.m52257(this.f37235.m18587());
        } else {
            this.f37315.m52257(C23701.f76752);
        }
        this.f37258.mo8166(this.f37322);
        m30171();
        this.f37173.m17859(this.f37322);
        m30405();
        m30510();
        InterfaceC7785 interfaceC7788 = this.f37322;
        if (!(interfaceC7788 instanceof C4342)) {
            m30456(false);
            this.f37322.setSelection(0);
        } else {
            InterfaceC19449 interfaceC19449 = this.f37301;
            if (interfaceC19449 != null) {
                interfaceC19449.mo2703(((C4342) interfaceC7788).isChanged());
            }
        }
        this.f37221 = -1.0f;
        m30227();
        if (!isInEditMode()) {
            int length = this.f37322.length();
            int i = SharedPreferencesOnSharedPreferenceChangeListenerC21897.f70101;
            if (length > C4925.f15523.getInt("smooth_mode_threshold", 200000)) {
                this.f37300 = true;
            }
        }
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: ۧᩳ, reason: not valid java name and contains not printable characters */
    public final void m30438() {
        this.f37279 = true;
        this.f37284.incrementAndGet();
        C14508 c14508 = this.f37317;
        if (c14508 != null) {
            c14508.f44488 = 0;
            c14508.f44492 = false;
            c14508.f44491 = false;
            c14508.f44490 = -1;
            c14508.f44489 = -1;
        }
        this.f37269 = 0;
        this.f37223 = 0;
    }

    /* JADX INFO: renamed from: ۗܽ, reason: not valid java name and contains not printable characters */
    public final void m30371() {
        this.f37279 = false;
        if (!isFocused() || m30441()) {
            return;
        }
        if (C10975.m27285()) {
            m30380();
        } else {
            C4925.m14315(new RunnableC23516(0, this));
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m30502(int i) {
        return i == this.f37284.get() && !this.f37279;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m30488(int i) {
        return m30502(i) && !m30441() && m30174();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m30363() {
        this.f37258.mo8166(this.f37322);
        m30171();
        this.f37221 = -1.0f;
        m30227();
        requestLayout();
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.f37245.f73272 || this.f37279) {
            return null;
        }
        if (this.f37317 == null) {
            C14508 c14508 = new C14508();
            new ExtractedText();
            this.f37317 = c14508;
        }
        editorInfo.imeOptions = mo25920();
        editorInfo.inputType = mo25893();
        C22330 c22330 = new C22330(this, this.f37284.get());
        this.f37283.add(c22330);
        return new InputConnectionC20214(c22330);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m30407(boolean z) {
        C22686 c22686 = this.f37245;
        if (c22686.f73272 != z) {
            c22686.f73272 = z;
            if (z) {
                m30376();
            } else {
                m30380();
            }
            InterfaceC19449 interfaceC19449 = this.f37301;
            if (interfaceC19449 != null) {
                interfaceC19449.mo2704(m30383(), m30296());
            }
        }
    }

    /* JADX INFO: renamed from: ۨۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30441() {
        return this.f37245.f73272 || this.f37247 == this.f37322;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30327(C6270 c6270) {
        this.f37209 = c6270;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30357(final InterfaceC7785 interfaceC7785, final RuntimeException runtimeException) {
        if (!(interfaceC7785 instanceof C4342)) {
            return false;
        }
        C4342 c4342 = (C4342) interfaceC7785;
        if (!(runtimeException instanceof UncheckedIOException) && !(runtimeException instanceof C3966)) {
            return false;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C4925.m14315(new Runnable() { // from class: l.ۙۛᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    TextKeyListener textKeyListener = C12392.f37169;
                    this.f14233.m30357(interfaceC7785, runtimeException);
                }
            });
            return true;
        }
        if (this.f37322 == interfaceC7785 && this.f37247 != interfaceC7785) {
            this.f37247 = c4342;
            this.f37252 = runtimeException;
            m30438();
            this.f37173.m17851();
            this.f37235.m18571();
            invalidate();
            C4925.m14315(new RunnableC8889(this, interfaceC7785, c4342, runtimeException, 1));
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30141(C12392 c12392, InterfaceC7785 interfaceC7785, C4342 c4342, RuntimeException runtimeException) {
        InterfaceC5337 interfaceC5337;
        if (c12392.f37322 == interfaceC7785 && c12392.f37247 == interfaceC7785 && (interfaceC5337 = c12392.f37209) != null) {
            C22372.m50157((C22372) ((C6270) interfaceC5337).f19413, c4342, runtimeException);
        }
    }

    /* JADX INFO: renamed from: ۬ܽ, reason: not valid java name and contains not printable characters */
    public final void m30449() {
        C22686 c22686 = this.f37245;
        if (!c22686.f73296) {
            c22686.f73296 = true;
            if (m30441()) {
                invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m30294(int i) {
        this.f37245.m24478(i);
        this.f37221 = -1.0f;
    }

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public final int m30361() {
        return this.f37245.m24485();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m30373(boolean z) {
        C22686 c22686 = this.f37245;
        if (c22686.m24482() != z) {
            c22686.m24479(z);
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m30393(boolean z) {
        C22686 c22686 = this.f37245;
        if (c22686.m24498() != z) {
            c22686.m24490(z);
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: ۬ۧ */
    public boolean mo25914() {
        return this.f37245.f73228;
    }

    /* JADX INFO: renamed from: ᩶ܽ, reason: not valid java name and contains not printable characters */
    public final void m30520() {
        this.f37221 = -1.0f;
    }

    /* JADX INFO: renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public static void m30251(C12392 c12392) {
        c12392.f37203 = true;
        c12392.f37176 = false;
        if (!c12392.isFocused()) {
            c12392.requestFocus();
            c12392.invalidate();
        }
        c12392.m30443();
    }

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public static void m30285(C12392 c12392) {
        c12392.f37203 = false;
        c12392.f37176 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean m30257(float f, float f2) {
        return f >= ((float) getPaddingLeft()) && f <= ((float) (getWidth() - getPaddingRight())) && f2 >= ((float) getPaddingTop()) && f2 <= ((float) (getHeight() - getPaddingBottom()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m30246(MotionEvent motionEvent) {
        if (m30370()) {
            return;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (m30257(x, y)) {
            int iM9760 = this.f37258.m9760((getScrollX() + x) - getPaddingLeft(), (this.f37170 + y) - getPaddingTop());
            int iM30444 = m30444();
            int iM30448 = m30448();
            int iMin = Math.min(iM30444, iM30448);
            int iMax = Math.max(iM30444, iM30448);
            if (iMin == iMax || iMin > iM9760 || iM9760 > iMax) {
                mo25919(iM9760);
            }
            this.f37263 = SystemClock.uptimeMillis();
            m30400();
            if (m30215((int[]) null)) {
                this.f37311.m20611((int) x, (int) y);
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
        if (!m30519()) {
            if (Build.VERSION.SDK_INT < 23 || !m30214(motionEvent) || (((actionMasked = motionEvent.getActionMasked()) != 11 && actionMasked != 12) || motionEvent.getActionButton() != 2)) {
                boolean z = (motionEvent.getMetaState() & 4096) != 0;
                if ((motionEvent.getSource() & 2) == 0 && motionEvent.getAction() == 8) {
                    m30194();
                    float fM30528 = 0.0f;
                    if (z) {
                        float axisValue = (motionEvent.getAxisValue(9) / 20.0f) + 1.0f;
                        float textSize = this.f37245.f29058.getTextSize();
                        if (this.f37245.m50689(axisValue * textSize)) {
                            float textSize2 = this.f37245.f29058.getTextSize() / textSize;
                            this.f37258.mo8154(textSize);
                            if (this.f37258.mo8160()) {
                                float x = motionEvent.getX();
                                scrollX = ((getScrollX() + x) * textSize2) - x;
                                if (scrollX < 0.0f) {
                                    scrollX = 0.0f;
                                } else {
                                    float fM30463 = m30463();
                                    if (scrollX > fM30463) {
                                        scrollX = fM30463;
                                    }
                                }
                            } else {
                                scrollX = 0.0f;
                            }
                            float y = motionEvent.getY();
                            float f = ((this.f37170 + y) * textSize2) - y;
                            if (f >= 0.0f) {
                                fM30528 = m30528();
                                if (f <= fM30528) {
                                    fM30528 = f;
                                }
                            }
                            m30123((int) scrollX, (int) fM30528, true);
                            invalidate();
                            this.f37207.removeMessages(7);
                            this.f37207.sendEmptyMessageDelayed(7, 200L);
                            return true;
                        }
                    } else {
                        float axisValue2 = this.f37258.mo8160() ? motionEvent.getAxisValue(10) : 0.0f;
                        float axisValue3 = motionEvent.getAxisValue(9);
                        m30123(m30390((int) ((this.f37245.m24495() * axisValue2) + getScrollX())), m30521((int) (this.f37170 - (this.f37245.m24484() * axisValue3))), true);
                        if (axisValue2 != 0.0f) {
                            m30442();
                        }
                        if (axisValue3 != 0.0f) {
                            m30453();
                        }
                    }
                } else {
                    return super.onGenericMotionEvent(motionEvent);
                }
            } else if (actionMasked == 11) {
                if (!this.f37203) {
                    this.f37203 = true;
                    this.f37176 = false;
                    if (!isFocused()) {
                        requestFocus();
                        invalidate();
                    }
                    m30443();
                    m30246(motionEvent);
                    return true;
                }
            } else if (actionMasked == 12) {
                if (this.f37203 && !this.f37176) {
                    this.f37203 = false;
                    this.f37176 = false;
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
            this.f37302.m11966((int) (motionEvent.getAxisValue(10) * this.f37245.m24495()), (int) (motionEvent.getAxisValue(9) * (-this.f37245.m24484())));
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
        float fM30272;
        C14792 c14792;
        float f;
        float f2;
        if (Build.VERSION.SDK_INT < 24 || motionEvent == null || !m30214(motionEvent)) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        float x = (motionEvent.getX(i) + getScrollX()) - getPaddingLeft();
        float fM9777 = this.f37258.m9777(motionEvent.getY(i));
        if (!this.f37295 && !this.f37291) {
            boolean z = this.f37258.f10029;
            C22686 c22686 = this.f37245;
            if (!z) {
                if (this.f37258.f10028) {
                    fM30272 = m30272();
                    if (fM30272 > 0.0f) {
                        c14792 = this.f37258.f9997;
                        f = c22686.f73238 * fM30272;
                        if (x >= c14792.f45163 && x <= c14792.f45167) {
                            f2 = c14792.f45162;
                            if (fM9777 >= f2 - f) {
                            }
                        }
                    }
                }
                if (m30264(x)) {
                    return PointerIcon.getSystemIcon(getContext(), 1000);
                }
                return PointerIcon.getSystemIcon(getContext(), 1008);
            }
            float fM30115 = m30115();
            if (fM30115 > 0.0f) {
                C14792 c14793 = this.f37258.f9999;
                if (fM9777 < c14793.f45166 || fM9777 > c14793.f45162) {
                    if (this.f37258.f10028) {
                        fM30272 = m30272();
                        if (fM30272 > 0.0f) {
                            c14792 = this.f37258.f9997;
                            f = c22686.f73238 * fM30272;
                            if (x >= c14792.f45163) {
                                f2 = c14792.f45162;
                                if (fM9777 >= f2 - f) {
                                }
                            }
                        }
                    }
                    if (m30264(x)) {
                        return PointerIcon.getSystemIcon(getContext(), 1000);
                    }
                    return PointerIcon.getSystemIcon(getContext(), 1008);
                }
                float f3 = c22686.f73238 * fM30115;
                if (c22686.f73291) {
                    float f4 = c14793.f45167;
                    if (x < f4 - f3 || x > f4) {
                        if (this.f37258.f10028) {
                            fM30272 = m30272();
                            if (fM30272 > 0.0f) {
                                c14792 = this.f37258.f9997;
                                f = c22686.f73238 * fM30272;
                                if (x >= c14792.f45163) {
                                    f2 = c14792.f45162;
                                    if (fM9777 >= f2 - f) {
                                    }
                                }
                            }
                        }
                        if (m30264(x)) {
                            return PointerIcon.getSystemIcon(getContext(), 1000);
                        }
                        return PointerIcon.getSystemIcon(getContext(), 1008);
                    }
                } else {
                    float f5 = c14793.f45163;
                    if (x < f5 || x > f5 + f3) {
                        if (this.f37258.f10028) {
                            fM30272 = m30272();
                            if (fM30272 > 0.0f) {
                                c14792 = this.f37258.f9997;
                                f = c22686.f73238 * fM30272;
                                if (x >= c14792.f45163) {
                                    f2 = c14792.f45162;
                                    if (fM9777 >= f2 - f) {
                                    }
                                }
                            }
                        }
                        if (m30264(x)) {
                            return PointerIcon.getSystemIcon(getContext(), 1000);
                        }
                        return PointerIcon.getSystemIcon(getContext(), 1008);
                    }
                }
            } else {
                if (this.f37258.f10028) {
                    fM30272 = m30272();
                    if (fM30272 > 0.0f) {
                        c14792 = this.f37258.f9997;
                        f = c22686.f73238 * fM30272;
                        if (x >= c14792.f45163) {
                            f2 = c14792.f45162;
                            if (fM9777 >= f2 - f) {
                            }
                        }
                    }
                }
                if (m30264(x)) {
                    return PointerIcon.getSystemIcon(getContext(), 1000);
                }
                return PointerIcon.getSystemIcon(getContext(), 1008);
            }
        }
        return PointerIcon.getSystemIcon(getContext(), b.c);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int i;
        if (m30214(motionEvent)) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 10) {
                m30278();
            } else if (actionMasked == 9 || actionMasked == 7) {
                this.f37270 = motionEvent.getX();
                float y = motionEvent.getY();
                this.f37184 = y;
                int iM30230 = m30230(this.f37270, y);
                int i2 = iM30230 & 1;
                boolean z = i2 != 0 && m30115() > 0.0f;
                int i3 = iM30230 & 2;
                boolean z2 = i3 != 0 && m30272() > 0.0f;
                if (z && z2) {
                    if (this.f37309 >= this.f37314) {
                        z = false;
                    } else {
                        z2 = false;
                    }
                }
                this.f37172 = z;
                this.f37294 = z2;
                if (z) {
                    m30240();
                }
                if (this.f37294) {
                    m30187();
                }
                if (iM30230 == 0) {
                    m30194();
                }
                if (i3 != 0) {
                    i = 2;
                } else {
                    i = i2 != 0 ? 1 : 0;
                }
                if (i == 0 || (i != 1 ? !(i != 2 || m30272() <= 0.0f) : m30115() > 0.0f)) {
                    m30194();
                } else if (this.f37208 != i) {
                    this.f37208 = i;
                    HandlerC13637 handlerC13637 = this.f37207;
                    handlerC13637.removeMessages(8);
                    handlerC13637.sendEmptyMessageDelayed(8, 300L);
                }
            }
        }
        return m30214(motionEvent) || super.onHoverEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private int m30230(float f, float f2) {
        int i = 0;
        if (!m30519() && !this.f37287 && !this.f37277 && !this.f37258.f9998.isEmpty()) {
            int iM30394 = m30394();
            int iM30542 = m30542();
            int scrollX = getScrollX();
            int i2 = this.f37170;
            if (m30150(this.f37306, scrollX, i2, iM30394, iM30542)) {
                float paddingLeft = (f + scrollX) - getPaddingLeft();
                float paddingTop = f2 - getPaddingTop();
                AbstractC3179 abstractC3179 = this.f37258;
                Rect rect = this.f37306;
                int i3 = rect.left;
                int i4 = rect.top - i2;
                int iWidth = rect.width();
                int iHeight = this.f37306.height();
                C22686 c22686 = abstractC3179.f10037;
                int iMo25899 = abstractC3179.f10021.mo25899();
                int i5 = iM30542 + iMo25899;
                if (iM30394 > 0 && iM30542 > 0 && i5 > 0 && iWidth > 0 && iHeight > 0) {
                    int i6 = iWidth + i3;
                    int i7 = iHeight + i4 + iMo25899;
                    double dM9789 = abstractC3179.m9789();
                    if (dM9789 > 0.0d) {
                        double d = i5;
                        if (dM9789 - d > 0.0d && c22686.f73249 && dM9789 / d > 3.0d && (!c22686.f73291 ? !(paddingLeft < i3 || paddingLeft > c22686.f73238 + i3 || paddingTop < i4 || paddingTop > i7) : !(paddingLeft < i6 - c22686.f73238 || paddingLeft > i6 || paddingTop < i4 || paddingTop > i7))) {
                            i = 1;
                        }
                    }
                    float fMo8163 = abstractC3179.mo8163();
                    if (abstractC3179.mo8160() && fMo8163 > 0.0f) {
                        float f3 = iM30394;
                        if (fMo8163 - f3 > 0.0f && c22686.f73226 && fMo8163 / f3 > 3.0f) {
                            if (c22686.f73263 && c22686.f73264) {
                                if (c22686.f73291) {
                                    i3 += abstractC3179.f10000;
                                } else {
                                    i6 -= abstractC3179.f10000;
                                }
                            }
                            if (i6 >= i3 && paddingLeft >= i3 && paddingLeft <= i6 && paddingTop >= i7 - c22686.f73238 && paddingTop <= i7) {
                                return i | 2;
                            }
                        }
                    }
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public static void m30218(C12392 c12392) {
        int i;
        int i2 = c12392.f37208;
        c12392.f37208 = 0;
        if (i2 == 0) {
            return;
        }
        int iM30230 = c12392.m30230(c12392.f37270, c12392.f37184);
        if ((iM30230 & 2) != 0) {
            i = 2;
        } else {
            i = (iM30230 & 1) != 0 ? 1 : 0;
        }
        if (i != i2) {
            c12392.f37172 = false;
            c12392.f37294 = false;
        } else if (i2 == 1) {
            c12392.m30453();
            c12392.f37172 = true;
            c12392.f37294 = false;
        } else if (i2 == 2) {
            c12392.m30442();
            c12392.f37172 = false;
            c12392.f37294 = true;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30132(C12392 c12392, int i, MotionEvent motionEvent) {
        c12392.f37270 = motionEvent.getX();
        float y = motionEvent.getY();
        c12392.f37184 = y;
        if ((c12392.m30230(c12392.f37270, y) & i) != 0) {
            c12392.f37172 = i == 1;
            c12392.f37294 = i == 2;
        } else {
            c12392.f37172 = false;
            c12392.f37294 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۢᩳ, reason: not valid java name and contains not printable characters */
    public void m30194() {
        this.f37208 = 0;
        this.f37207.removeMessages(8);
    }

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public static void m30239(C12392 c12392) {
        c12392.f37172 = false;
        c12392.f37294 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷ᩳ, reason: not valid java name and contains not printable characters */
    public void m30278() {
        m30194();
        this.f37172 = false;
        this.f37294 = false;
    }

    /* JADX INFO: renamed from: ֡ᩳ, reason: not valid java name and contains not printable characters */
    private float m30115() {
        if (this.f37295) {
            return 1.0f;
        }
        return m30120(this.f37314);
    }

    /* JADX INFO: renamed from: ᩵ᩳ, reason: not valid java name and contains not printable characters */
    private float m30272() {
        if (this.f37291) {
            return 1.0f;
        }
        return m30120(this.f37309);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m30120(long j) {
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
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean m30264(float f) {
        C22686 c22686 = this.f37245;
        if (!c22686.f73263) {
            return false;
        }
        if (c22686.f73264) {
            if (c22686.f73291) {
                return f - ((float) getScrollX()) <= ((float) this.f37258.f10000);
            }
            return f - ((float) getScrollX()) >= ((float) (m30394() - this.f37258.f10000));
        }
        if (c22686.f73291) {
            return f <= ((float) this.f37258.f10000);
        }
        return f >= this.f37258.mo8163() - ((float) this.f37258.f10000);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!m30174()) {
            return false;
        }
        C4342 c4342 = this.f37247;
        InterfaceC7785 interfaceC7785 = this.f37322;
        if (c4342 == interfaceC7785) {
            return false;
        }
        try {
            return m30149(i, keyEvent);
        } catch (UncheckedIOException | C3966 e) {
            if (m30357(interfaceC7785, e)) {
                return false;
            }
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x017b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0181  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e8  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m30149(int i, KeyEvent keyEvent) {
        int iIndexOf;
        int iM9763;
        int length;
        KeyEvent keyEvent2 = keyEvent == null ? new KeyEvent(0, i) : keyEvent;
        boolean z = MetaKeyKeyListener.getMetaState(this.f37322, 1) == 1;
        boolean zIsCtrlPressed = keyEvent2.isCtrlPressed();
        boolean zIsAltPressed = keyEvent2.isAltPressed();
        boolean z2 = z || MetaKeyKeyListener.getMetaState(this.f37322, 2048) != 0;
        int iM30444 = m30444();
        int iM30448 = m30448();
        int iMin = Math.min(iM30444, iM30448);
        int iMax = Math.max(iM30444, iM30448);
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
                                                    int iM9790 = this.f37258.m9790(iM30448);
                                                    if (iM9790 > 0) {
                                                        int iM30542 = (int) (m30542() / this.f37245.m24484());
                                                        int iMax2 = Math.max(0, iM9790 - iM30542);
                                                        C7744 c7744Mo26556 = this.f37322.mo26556();
                                                        try {
                                                            float fM24487 = this.f37221;
                                                            if (fM24487 < 0.0f) {
                                                                fM24487 = this.f37245.m24487(c7744Mo26556, this.f37258.f9998.get(iM9790).f35062, iM30448, 0.0f) + this.f37258.m9792(iM9790);
                                                                this.f37221 = fM24487;
                                                            }
                                                            int iM9764 = this.f37258.m9763(c7744Mo26556, iMax2, fM24487);
                                                            c7744Mo26556.close();
                                                            if (z2) {
                                                                this.f37322.setSelection(m30444(), iM9764);
                                                            } else {
                                                                this.f37322.setSelection(iM9764);
                                                                m30400();
                                                            }
                                                            this.f37263 = 0L;
                                                            int iM9759 = this.f37258.m9759(this.f37170 + 1) - iM30542;
                                                            if (iM9759 < 0) {
                                                                iM9759 = 0;
                                                            }
                                                            this.f37242 = (int) (this.f37245.m24484() * iM9759);
                                                            m30349(iM9764, false);
                                                            m30443();
                                                            m30227();
                                                            invalidate();
                                                            return true;
                                                        } catch (Throwable th) {
                                                            try {
                                                                c7744Mo26556.close();
                                                                throw th;
                                                            } catch (Throwable th2) {
                                                                th.addSuppressed(th2);
                                                                throw th;
                                                            }
                                                        }
                                                    }
                                                } else if (i == 93) {
                                                    int iM9791 = this.f37258.m9790(iM30448);
                                                    int size = this.f37258.f9998.size() - 1;
                                                    if (iM9791 < size) {
                                                        int iM30543 = (int) (m30542() / this.f37245.m24484());
                                                        int iMin2 = Math.min(size, iM9791 + iM30543);
                                                        C7744 c7744Mo26557 = this.f37322.mo26556();
                                                        try {
                                                            float fM24488 = this.f37221;
                                                            if (fM24488 < 0.0f) {
                                                                fM24488 = this.f37245.m24487(c7744Mo26557, this.f37258.f9998.get(iM9791).f35062, iM30448, 0.0f) + this.f37258.m9792(iM9791);
                                                                this.f37221 = fM24488;
                                                            }
                                                            int iM9765 = this.f37258.m9763(c7744Mo26557, iMin2, fM24488);
                                                            c7744Mo26557.close();
                                                            if (z2) {
                                                                this.f37322.setSelection(m30444(), iM9765);
                                                            } else {
                                                                this.f37322.setSelection(iM9765);
                                                                m30400();
                                                            }
                                                            this.f37263 = 0L;
                                                            int iM97510 = this.f37258.m9759(this.f37170 + 1) + iM30543;
                                                            if (iM97510 <= size) {
                                                                size = iM97510;
                                                            }
                                                            this.f37242 = (int) (this.f37245.m24484() * size);
                                                            m30349(iM9765, false);
                                                            m30227();
                                                            m30443();
                                                            invalidate();
                                                            return true;
                                                        } catch (Throwable th3) {
                                                            try {
                                                                c7744Mo26557.close();
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
                                                            C22975.m51129(this, z2);
                                                            return true;
                                                        }
                                                        C22975.m51127(this, z2);
                                                        return true;
                                                    }
                                                    if (i == 123) {
                                                        if (zIsCtrlPressed) {
                                                            C22975.m51122(this, z2);
                                                            return true;
                                                        }
                                                        C22975.m51125(this, z2);
                                                        return true;
                                                    }
                                                    switch (i) {
                                                        case 19:
                                                            int iM9792 = this.f37258.m9790(iM30448);
                                                            if (iM9792 > 0) {
                                                                C7744 c7744Mo26558 = this.f37322.mo26556();
                                                                try {
                                                                    float fM24489 = this.f37221;
                                                                    if (fM24489 < 0.0f) {
                                                                        fM24489 = this.f37245.m24487(c7744Mo26558, this.f37258.f9998.get(iM9792).f35062, iM30448, 0.0f) + this.f37258.m9792(iM9792);
                                                                        this.f37221 = fM24489;
                                                                    }
                                                                    iM9763 = this.f37258.m9763(c7744Mo26558, iM9792 - 1, fM24489);
                                                                    c7744Mo26558.close();
                                                                } catch (Throwable th5) {
                                                                    try {
                                                                        c7744Mo26558.close();
                                                                        throw th5;
                                                                    } catch (Throwable th6) {
                                                                        th5.addSuppressed(th6);
                                                                        throw th5;
                                                                    }
                                                                }
                                                            } else {
                                                                iM9763 = 0;
                                                            }
                                                            if (z2) {
                                                                this.f37322.setSelection(m30444(), iM9763);
                                                            } else {
                                                                this.f37322.setSelection(iM9763);
                                                                m30400();
                                                            }
                                                            this.f37263 = 0L;
                                                            m30349(iM9763, false);
                                                            m30443();
                                                            m30227();
                                                            invalidate();
                                                            return true;
                                                        case 20:
                                                            int iM9793 = this.f37258.m9790(iM30448);
                                                            if (iM9793 < this.f37258.f9998.size() - 1) {
                                                                C7744 c7744Mo26559 = this.f37322.mo26556();
                                                                try {
                                                                    float fM244810 = this.f37221;
                                                                    if (fM244810 < 0.0f) {
                                                                        fM244810 = this.f37245.m24487(c7744Mo26559, this.f37258.f9998.get(iM9793).f35062, iM30448, 0.0f) + this.f37258.m9792(iM9793);
                                                                        this.f37221 = fM244810;
                                                                    }
                                                                    length = this.f37258.m9763(c7744Mo26559, iM9793 + 1, fM244810);
                                                                    c7744Mo26559.close();
                                                                } catch (Throwable th7) {
                                                                    try {
                                                                        c7744Mo26559.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                }
                                                            } else {
                                                                length = this.f37322.length();
                                                            }
                                                            if (z2) {
                                                                this.f37322.setSelection(m30444(), length);
                                                            } else {
                                                                this.f37322.setSelection(length);
                                                                m30400();
                                                            }
                                                            this.f37263 = 0L;
                                                            m30349(length, false);
                                                            m30443();
                                                            m30227();
                                                            invalidate();
                                                            return true;
                                                        case 21:
                                                            if (!zIsCtrlPressed || !zIsAltPressed) {
                                                                this.f37258.m9771();
                                                                if (zIsCtrlPressed) {
                                                                    int[] iArrM30179 = m30179(iM30448, true);
                                                                    String strSubstring = TextUtils.substring(this.f37322, iArrM30179[0], iArrM30179[1]);
                                                                    int i2 = iArrM30179[0];
                                                                    int iPreceding = iM30448 - i2;
                                                                    BreakIterator breakIterator = this.f37253;
                                                                    try {
                                                                        breakIterator.setText(strSubstring);
                                                                        do {
                                                                            iPreceding = breakIterator.preceding(iPreceding);
                                                                            if (iPreceding == -1) {
                                                                                iPreceding = 0;
                                                                            }
                                                                            iMin = i2 + iPreceding;
                                                                            if (z2) {
                                                                                this.f37322.setSelection(iM30444, iMin);
                                                                            } else {
                                                                                this.f37322.setSelection(iMin);
                                                                                m30400();
                                                                            }
                                                                        } while (!((iPreceding < 0 || iPreceding >= strSubstring.length()) ? false : Character.isLetterOrDigit(Character.codePointAt(strSubstring, iPreceding))));
                                                                    } catch (Exception unused) {
                                                                    }
                                                                    iMin = i2 + iPreceding;
                                                                    if (z2) {
                                                                        this.f37322.setSelection(iM30444, iMin);
                                                                    } else {
                                                                        this.f37322.setSelection(iMin);
                                                                        m30400();
                                                                    }
                                                                } else if (z2) {
                                                                    iMin = C22412.m50337(iM30448, this.f37322);
                                                                    this.f37322.setSelection(iM30444, iMin);
                                                                } else if (iM30444 != iM30448) {
                                                                    this.f37322.setSelection(iMin);
                                                                    m30400();
                                                                } else {
                                                                    iMin = C22412.m50337(iM30444, this.f37322);
                                                                    this.f37322.setSelection(iMin);
                                                                    m30400();
                                                                }
                                                                this.f37263 = 0L;
                                                                m30349(iMin, false);
                                                                m30443();
                                                                this.f37221 = -1.0f;
                                                                m30227();
                                                                invalidate();
                                                                return true;
                                                            }
                                                            break;
                                                        case 22:
                                                            if (zIsCtrlPressed && zIsAltPressed) {
                                                                return true;
                                                            }
                                                            this.f37258.m9771();
                                                            if (zIsCtrlPressed) {
                                                                int[] iArrM301710 = m30179(iM30448, true);
                                                                String strSubstring2 = TextUtils.substring(this.f37322, iArrM301710[0], iArrM301710[1]);
                                                                int i3 = iArrM301710[0];
                                                                int length2 = iM30448 - i3;
                                                                BreakIterator breakIterator2 = this.f37253;
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
                                                                            this.f37322.setSelection(iM30444, iMax);
                                                                        } else {
                                                                            this.f37322.setSelection(iMax);
                                                                            m30400();
                                                                        }
                                                                    } while (!((length2 <= 0 || length2 > strSubstring2.length()) ? false : Character.isLetterOrDigit(Character.codePointBefore(strSubstring2, length2))));
                                                                } catch (Exception unused2) {
                                                                    length2 = strSubstring2.length();
                                                                }
                                                                iMax = i3 + length2;
                                                                if (z2) {
                                                                    this.f37322.setSelection(iM30444, iMax);
                                                                } else {
                                                                    this.f37322.setSelection(iMax);
                                                                    m30400();
                                                                }
                                                            } else if (z2) {
                                                                InterfaceC7785 interfaceC7785 = this.f37322;
                                                                iMax = C22412.m50336(iM30448, interfaceC7785.length(), interfaceC7785);
                                                                this.f37322.setSelection(iM30444, iMax);
                                                            } else if (iM30444 != iM30448) {
                                                                this.f37322.setSelection(iMax);
                                                                m30400();
                                                            } else {
                                                                InterfaceC7785 interfaceC7786 = this.f37322;
                                                                iMax = C22412.m50336(iM30444, interfaceC7786.length(), interfaceC7786);
                                                                this.f37322.setSelection(iMax);
                                                                m30400();
                                                            }
                                                            this.f37263 = 0L;
                                                            m30349(iMax, false);
                                                            m30443();
                                                            this.f37221 = -1.0f;
                                                            m30227();
                                                            invalidate();
                                                            return true;
                                                        default:
                                                            switch (i) {
                                                                case 52:
                                                                    if (zIsCtrlPressed && !z && !zIsAltPressed) {
                                                                        if (m30444() == m30448()) {
                                                                            C22975.m51121(this);
                                                                            return true;
                                                                        }
                                                                        m30466(android.R.id.cut);
                                                                        return true;
                                                                    }
                                                                    break;
                                                                case 53:
                                                                    if (zIsCtrlPressed && !z && !zIsAltPressed) {
                                                                        if (!m30296()) {
                                                                            return true;
                                                                        }
                                                                        m30298();
                                                                        return true;
                                                                    }
                                                                    break;
                                                                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                                                    if (zIsCtrlPressed && !z && !zIsAltPressed) {
                                                                        if (!m30383()) {
                                                                            return true;
                                                                        }
                                                                        m30484();
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
                                                                            if (this.f37245.f73272) {
                                                                                return true;
                                                                            }
                                                                            try {
                                                                                if (z) {
                                                                                    C22975.m51124(this);
                                                                                } else {
                                                                                    C22975.m51131(this);
                                                                                }
                                                                                this.f37286.decrementAndGet();
                                                                                return true;
                                                                            } catch (Throwable th9) {
                                                                                this.f37286.decrementAndGet();
                                                                                throw th9;
                                                                            }
                                                                        default:
                                                                            switch (i) {
                                                                                case 277:
                                                                                    m30466(android.R.id.cut);
                                                                                    return true;
                                                                                case 278:
                                                                                    m30466(android.R.id.copy);
                                                                                    return true;
                                                                                case 279:
                                                                                    m30466(android.R.id.paste);
                                                                                    return true;
                                                                            }
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            } else if (!this.f37245.f73272 && this.f37322.length() > 0) {
                                                if (iMin == iMax) {
                                                    iMin = C22412.m50337(iMax, this.f37322);
                                                }
                                                this.f37286.incrementAndGet();
                                                try {
                                                    this.f37322.delete(iMin, iMax);
                                                    this.f37286.decrementAndGet();
                                                    invalidate();
                                                    return true;
                                                } catch (Throwable th10) {
                                                    this.f37286.decrementAndGet();
                                                    throw th10;
                                                }
                                            }
                                        } else if (!mo25898() && !this.f37245.f73272) {
                                            m30497(iMin, iMax);
                                            invalidate();
                                            return true;
                                        }
                                    } else if (zIsCtrlPressed && !z && !zIsAltPressed) {
                                        this.f37297.mo22095(null);
                                        return true;
                                    }
                                } else if (zIsCtrlPressed && !z && !zIsAltPressed) {
                                    InterfaceC22602 interfaceC22602 = this.f37191;
                                    if (interfaceC22602 != null) {
                                        interfaceC22602.mo11740();
                                        interfaceC22602.mo11736(true);
                                        return true;
                                    }
                                }
                            } else if (!this.f37245.f73272 && this.f37322.length() > 0) {
                                if (iMin == iMax) {
                                    InterfaceC7785 interfaceC7787 = this.f37322;
                                    iMax = C22412.m50336(iMax, interfaceC7787.length(), interfaceC7787);
                                }
                                this.f37286.incrementAndGet();
                                try {
                                    this.f37322.delete(iMin, iMax);
                                    this.f37286.decrementAndGet();
                                    invalidate();
                                    return true;
                                } catch (Throwable th11) {
                                    this.f37286.decrementAndGet();
                                    throw th11;
                                }
                            }
                            return true;
                        }
                        f37169.onKeyDown(this, this.f37322, i, keyEvent2);
                        MetaKeyKeyListener.adjustMetaAfterKeypress(this.f37322);
                        return true;
                    }
                    if (zIsCtrlPressed && !z && !zIsAltPressed) {
                        m30466(android.R.id.paste);
                        return true;
                    }
                } else if (zIsCtrlPressed && !z && !zIsAltPressed) {
                    InterfaceC22602 interfaceC22603 = this.f37191;
                    if (interfaceC22603 == null) {
                        return true;
                    }
                    interfaceC22603.mo11728();
                    return true;
                }
            } else if (zIsCtrlPressed && !z && !zIsAltPressed) {
                if (m30444() == m30448()) {
                    C22975.m51114(this);
                    return true;
                }
                m30466(android.R.id.copy);
                return true;
            }
        } else if (zIsCtrlPressed && !z && !zIsAltPressed) {
            m30466(android.R.id.selectAll);
            return true;
        }
        if (!this.f37245.f73272 && !zIsCtrlPressed) {
            this.f37286.incrementAndGet();
            try {
                boolean z3 = keyEvent2.isCapsLockOn() != keyEvent2.isShiftPressed();
                if (29 <= i && i <= 54) {
                    this.f37322.replace(iMin, iMax, String.valueOf((char) (((z3 ? 65 : 97) + i) - 29)));
                    int i4 = iMin + 1;
                    mo25919(i4);
                    m30349(i4, false);
                    return true;
                }
                if (7 <= i && i <= 16) {
                    this.f37322.replace(iMin, iMax, String.valueOf(z3 ? ")!@#$%^&*(".charAt(i - 7) : (char) (i + 41)));
                    int i5 = iMin + 1;
                    mo25919(i5);
                    m30349(i5, false);
                    return true;
                }
                char displayLabel = keyEvent2.getDisplayLabel();
                if (displayLabel != 0) {
                    if (z3 && (iIndexOf = "`-=[]\\;',./".indexOf(displayLabel)) != -1) {
                        displayLabel = "~_+{}|:\"<>?".charAt(iIndexOf);
                    }
                    this.f37322.replace(iMin, iMax, String.valueOf(displayLabel));
                    int i6 = iMin + 1;
                    mo25919(i6);
                    m30349(i6, false);
                    return true;
                }
            } finally {
                this.f37286.decrementAndGet();
            }
        }
        return super.onKeyDown(i, keyEvent2);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 63) {
            if (i == 66) {
                if (mo25898()) {
                    View viewFocusSearch = focusSearch(130);
                    if (viewFocusSearch != null) {
                        viewFocusSearch.requestFocus();
                        return true;
                    }
                    m30376();
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
        f37169.onKeyUp(this, this.f37322, i, keyEvent);
        return true;
    }

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final int m30444() {
        int selectionStart = Selection.getSelectionStart(this.f37322);
        if (selectionStart < 0) {
            return 0;
        }
        return selectionStart > this.f37322.length() ? this.f37322.length() : selectionStart;
    }

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public final int m30448() {
        int selectionEnd = Selection.getSelectionEnd(this.f37322);
        if (selectionEnd < 0) {
            return 0;
        }
        return selectionEnd > this.f37322.length() ? this.f37322.length() : selectionEnd;
    }

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public final int[] m30369() {
        int iM30444 = m30444();
        int iM30448 = m30448();
        if (iM30444 > iM30448) {
            iM30448 = iM30444;
            iM30444 = iM30448;
        }
        return new int[]{iM30444, iM30448};
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30314(View view, boolean z, boolean z2) {
        view.setVisibility(z ? 0 : 8);
        m30346(z, z2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30346(boolean z, boolean z2) {
        if (z) {
            this.f37261 = true;
            this.f37320 = false;
            this.f37210 = -1L;
        } else if (this.f37261) {
            this.f37261 = false;
            this.f37320 = z2;
            this.f37210 = -1L;
        } else if (!z2) {
            this.f37320 = false;
            this.f37210 = -1L;
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final int m30458() {
        return this.f37278;
    }

    /* JADX INFO: renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30385() {
        return this.f37261;
    }

    /* JADX INFO: renamed from: ۛᩳ, reason: not valid java name and contains not printable characters */
    private int m30177() {
        if (!this.f37320) {
            return 255;
        }
        if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
            this.f37320 = false;
            return 255;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f37210 < 0) {
            this.f37210 = jUptimeMillis;
        }
        float fMin = Math.min(1.0f, (jUptimeMillis - this.f37210) / 100.0f);
        if (fMin >= 1.0f) {
            this.f37320 = false;
        } else {
            postInvalidateOnAnimation();
        }
        return Math.round(((fMin * 0.5f) + 0.5f) * 255.0f);
    }

    /* JADX INFO: renamed from: ۢܽ, reason: not valid java name and contains not printable characters */
    public final void m30415() {
        this.f37250 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d9, code lost:
    
        r0.f10145 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00db, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m30325(AbstractC3179 abstractC3179, int i, int i2) {
        boolean zM18600;
        C3220 c3220 = this.f37250;
        if (c3220 == null || this.f37261 || this.f37278 == 0 || abstractC3179 != this.f37258 || abstractC3179.f10015 != this.f37322 || this.f37277 || this.f37287 || this.f37304) {
            return;
        }
        if (!this.f37245.f73267 || !this.f37235.m18575() || this.f37322.length() == 0) {
            this.f37250 = null;
            return;
        }
        C15068 c15068M18601 = this.f37235.m18601();
        if (c15068M18601 == null) {
            this.f37250 = null;
            return;
        }
        int iM49205 = c15068M18601.m35661().m49205();
        if (c3220.f10149 == null) {
            InterfaceC7785 interfaceC7785 = this.f37322;
            c3220.f10149 = interfaceC7785;
            c3220.f10146 = interfaceC7785.mo26548();
            c3220.f10147 = c15068M18601;
            c3220.f10143 = iM49205;
            c3220.f10141 = C21943.m49431();
        }
        InterfaceC7785 interfaceC7786 = c3220.f10149;
        InterfaceC7785 interfaceC7787 = this.f37322;
        if (interfaceC7786 != interfaceC7787 || c3220.f10146 != interfaceC7787.mo26548() || c3220.f10147 != c15068M18601 || c3220.f10143 != iM49205 || c3220.f10141 != C21943.m49431()) {
            this.f37250 = null;
            return;
        }
        boolean z = this.f37322.length() > 1000000;
        if (z) {
            int i3 = c3220.f10148;
            if (i3 == -1) {
                c3220.f10148 = i;
                c3220.f10142 = i2;
            } else if (i3 != i || c3220.f10142 != i2) {
                this.f37250 = null;
                return;
            }
        }
        if (z) {
            zM18600 = this.f37235.m18594(i, i2);
        } else {
            zM18600 = this.f37235.m18600();
        }
        if (!zM18600) {
            if (c3220.f10144 < 0) {
                if (z) {
                }
            }
            this.f37250 = null;
        } else if (m30483()) {
            if (!c3220.f10145) {
                this.f37250 = null;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (c3220.f10144 < 0) {
                c3220.f10144 = jUptimeMillis;
            }
            float fMin = Math.min(1.0f, (jUptimeMillis - c3220.f10144) / 300.0f);
            this.f37235.m18560(fMin, c3220.f10143);
            if (fMin < 1.0f) {
                postInvalidateOnAnimation();
            } else {
                this.f37250 = null;
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        InterfaceC7785 interfaceC7785 = this.f37322;
        int saveCount = canvas.getSaveCount();
        try {
            try {
                m30124(canvas);
                canvas.restoreToCount(saveCount);
            } catch (Throwable th) {
                canvas.restoreToCount(saveCount);
                throw th;
            }
        } catch (UncheckedIOException | C3966 e) {
            if (!m30357(interfaceC7785, e)) {
                throw e;
            }
            canvas.restoreToCount(saveCount);
        }
    }

    /* JADX INFO: renamed from: ۤᩳ, reason: not valid java name and contains not printable characters */
    private void m30197() {
        int scrollX = getScrollX();
        int i = this.f37170;
        ViewOnTouchListenerC17331 viewOnTouchListenerC17331 = this.f37215;
        boolean z = true;
        boolean z2 = viewOnTouchListenerC17331 != null && viewOnTouchListenerC17331.f53091;
        if ((this.f37204 || this.f37267 || this.f37307 || z2) && this.f37174 != 0) {
            int iUptimeMillis = ((int) ((((int) (SystemClock.uptimeMillis() - this.f37224)) / 20.0f) * this.f37174)) + i;
            int iM30521 = m30521(iUptimeMillis);
            if (iM30521 != i) {
                this.f37285.forceFinished(true);
                this.f37207.removeMessages(1);
                m30123(scrollX, iM30521, true);
                this.f37224 = SystemClock.uptimeMillis();
                postInvalidateOnAnimation();
                if (this.f37307) {
                    m30425(this.f37289, this.f37293);
                } else if (z2) {
                    this.f37215.m40655(this.f37289, this.f37293);
                } else if (this.f37204) {
                    m30496(this.f37289, this.f37293);
                } else {
                    m30476(this.f37289, this.f37293);
                }
            } else {
                if (iUptimeMillis == iM30521) {
                    postInvalidateOnAnimation();
                }
                z = false;
            }
        } else {
            z = false;
        }
        if (this.f37262 != z) {
            this.f37262 = z;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m30150(Rect rect, int i, int i2, int i3, int i4) {
        if (i3 > 0 && i4 > 0) {
            if (!mo25904()) {
                rect.set(i, i2, i3 + i, i4 + i2);
                return true;
            }
            Rect rect2 = this.f37265;
            if (!getLocalVisibleRect(rect2)) {
                return false;
            }
            rect2.offset(0, i2 - getScrollY());
            int iMax = Math.max(0, i);
            int iMax2 = Math.max(0, i2);
            int iMax3 = Math.max(iMax, i + i3);
            int iMax4 = Math.max(iMax2, i2 + i4);
            int iM30121 = m30121(rect2.left - getPaddingLeft(), iMax, iMax3);
            int iM30122 = m30121(rect2.top - getPaddingTop(), iMax2, iMax4);
            int iM30123 = m30121(rect2.right - getPaddingLeft(), iMax, iMax3);
            int iM30124 = m30121(rect2.bottom - getPaddingTop(), iMax2, iMax4);
            int iMax5 = Math.max(iM30123 - iM30121, 0);
            int iMax6 = Math.max(iM30124 - iM30122, 0);
            if (iMax5 != 0 && iMax6 != 0) {
                rect.set(iM30121, iM30122, iMax5 + iM30121, iMax6 + iM30122);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public final int m30463() {
        int iM30394 = m30394();
        if (iM30394 <= 0) {
            return 0;
        }
        return Math.max((int) (this.f37258.mo8163() - iM30394), 0);
    }

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public final int m30528() {
        int iM30542 = m30542();
        if (iM30542 <= 0) {
            return 0;
        }
        return Math.max((int) (this.f37258.m9789() - ((double) iM30542)), 0);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m30390(int i) {
        if (i < 0) {
            return 0;
        }
        int iM30463 = m30463();
        return i > iM30463 ? iM30463 : i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m30521(int i) {
        if (i < 0) {
            return 0;
        }
        int iM30528 = m30528();
        return i > iM30528 ? iM30528 : i;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m30300() {
        OverScroller overScroller = this.f37285;
        if (!overScroller.isFinished()) {
            float currVelocity = overScroller.getCurrVelocity();
            if (currVelocity == 0.0f || currVelocity >= 5000.0f) {
                return false;
            }
        }
        InterfaceC18702 interfaceC18702 = this.f37245.f73253;
        if (m30401()) {
            return interfaceC18702 == null || interfaceC18702.mo21671();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m30401() {
        return !this.f37295 || SystemClock.uptimeMillis() - this.f37193 >= 100;
    }

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public static void m30226(C12392 c12392) {
        if (c12392.f37295) {
            c12392.f37295 = false;
            c12392.f37207.removeMessages(6);
            c12392.invalidate();
            InterfaceC18702 interfaceC18702 = c12392.f37245.f73253;
            if (interfaceC18702 != null) {
                interfaceC18702.mo21666();
            }
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f37192) {
            return;
        }
        InterfaceC7785 interfaceC7785 = this.f37322;
        try {
            m30242(getScrollX(), this.f37170);
            m30293();
            m30197();
            C13097 c13097 = this.f37296;
            if (c13097 != null && !c13097.m31756(this)) {
                m30191();
            }
            if (this.f37285.computeScrollOffset()) {
                int scrollX = getScrollX();
                int i = this.f37170;
                int currX = this.f37285.getCurrX();
                int currY = this.f37285.getCurrY();
                if (currY != i) {
                    m30453();
                    if (this.f37321 && this.f37245.f73284) {
                        if (i > 0 && currY <= 0) {
                            this.f37303.onAbsorb((int) this.f37285.getCurrVelocity());
                        } else {
                            int iM30528 = m30528();
                            if (i < iM30528 && currY >= iM30528) {
                                this.f37189.onAbsorb((int) this.f37285.getCurrVelocity());
                            }
                        }
                    }
                }
                if (currX != scrollX) {
                    m30442();
                    if (this.f37321 && (edgeEffect = this.f37216) != null && this.f37275 != null && this.f37245.f73284) {
                        if (scrollX > 0 && currX <= 0) {
                            edgeEffect.onAbsorb((int) this.f37285.getCurrVelocity());
                        } else {
                            int iM30463 = m30463();
                            if (scrollX < iM30463 && currX >= iM30463) {
                                this.f37275.onAbsorb((int) this.f37285.getCurrVelocity());
                            }
                        }
                    }
                }
                m30181();
                this.f37202.incrementAndGet();
                m30123(currX, currY, false);
                invalidate();
            }
            if (this.f37285.isFinished()) {
                this.f37296 = null;
            }
        } catch (UncheckedIOException | C3966 e) {
            if (!m30357(interfaceC7785, e)) {
                throw e;
            }
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m30443();
        this.f37215.f53090 = 0L;
        if (z || this.f37171) {
            m30168();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘᩳ, reason: not valid java name and contains not printable characters */
    public void m30168() {
        m30244();
        if (m30519() || this.f37277 || this.f37258.f10015 != this.f37322) {
            this.f37171 = true;
            return;
        }
        if (this.f37304) {
            if (isAttachedToWindow()) {
                C4925.m14316(new Runnable() { // from class: l.ܿۛᩳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f52593.m30168();
                    }
                }, 100L);
                return;
            }
            return;
        }
        this.f37171 = false;
        boolean zM9795 = this.f37258.m9795();
        boolean zM9772 = this.f37258.m9772();
        int scrollX = getScrollX();
        if (this.f37258.mo8160()) {
            scrollX = m30390(scrollX);
        } else {
            this.f37258.mo9783(m30394());
        }
        if (this.f37277) {
            return;
        }
        this.f37285.forceFinished(true);
        m30123(scrollX, m30521(this.f37170), false);
        if (!m30293() && this.f37318 == null && this.f37244 == null) {
            if (zM9795 || zM9772) {
                int iM30444 = m30444();
                int iM30448 = m30448();
                if (iM30444 > iM30448) {
                    iM30448 = iM30444;
                    iM30444 = iM30448;
                }
                if (!zM9795) {
                    iM30444 = iM30448;
                }
                m30349(iM30444, false);
                m30443();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30352(CharSequence charSequence) {
        try {
            this.f37178.setPrimaryClip(ClipData.newPlainText(null, charSequence));
            return true;
        } catch (Throwable unused) {
            C21374.m48457(R.string.MT_Protector);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30409() {
        try {
            return this.f37178.hasPrimaryClip();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m30466(int i) {
        C4342 c4342 = this.f37247;
        InterfaceC7785 interfaceC7785 = this.f37322;
        if (c4342 == interfaceC7785) {
            return;
        }
        try {
            m30284(i);
        } catch (UncheckedIOException | C3966 e) {
            if (!m30357(interfaceC7785, e)) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m30284(int i) {
        String string;
        int iM30444 = m30444();
        int iM30448 = m30448();
        if (iM30444 > iM30448) {
            iM30448 = iM30444;
            iM30444 = iM30448;
        }
        boolean z = this.f37245.f73272;
        if (z && i == 16908320) {
            i = android.R.id.copy;
        }
        HandlerC13637 handlerC13637 = this.f37207;
        if (i != 16908328) {
            switch (i) {
                case android.R.id.selectAll:
                    if (this.f37322.length() > 0) {
                        mo25922(0, this.f37322.length());
                        handlerC13637.sendEmptyMessageDelayed(2, m30349(this.f37322.length(), false) ? 250L : 50L);
                    }
                    break;
                case android.R.id.cut:
                    if (iM30444 != iM30448 && m30352(this.f37322.subSequence(iM30444, iM30448))) {
                        this.f37322.delete(iM30444, iM30448);
                        invalidate();
                        m30416();
                        break;
                    }
                    break;
                case android.R.id.copy:
                    if (iM30444 != iM30448 && m30352(this.f37322.subSequence(iM30444, iM30448))) {
                        m30416();
                        break;
                    }
                    break;
                case android.R.id.paste:
                    if (!z && m30409()) {
                        try {
                            CharSequence text = this.f37178.getText();
                            string = text != null ? text.toString() : "";
                        } catch (Throwable th) {
                            string = th.toString();
                        }
                        String string2 = C22686.m50681(string).toString();
                        this.f37322.replace(iM30444, iM30448, string2);
                        mo25919(string2.length() + iM30444);
                        m30345(false);
                        m30416();
                        break;
                    }
                    break;
                default:
                    switch (i) {
                        case android.R.id.undo:
                            m30484();
                            break;
                        case android.R.id.redo:
                            m30298();
                            break;
                        default:
                            System.out.println("onTextContextMenuItem: " + i);
                            break;
                    }
                    break;
            }
            return;
        }
        m30498(m30444(), true);
        handlerC13637.sendEmptyMessageDelayed(2, 100L);
    }

    /* JADX INFO: renamed from: ۟ܽ, reason: not valid java name and contains not printable characters */
    public final void m30400() {
        this.f37280 = SystemClock.uptimeMillis();
        HandlerC13637 handlerC13637 = this.f37207;
        handlerC13637.removeMessages(4);
        handlerC13637.sendEmptyMessageAtTime(4, SystemClock.uptimeMillis() + 500);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        m30286();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        m30275();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        AbstractC3179 abstractC3179;
        super.onWindowVisibilityChanged(i);
        if (i == 0 || (abstractC3179 = this.f37258) == null) {
            return;
        }
        abstractC3179.m9785();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        AbstractC3179 abstractC3179;
        super.onVisibilityChanged(view, i);
        if (i == 0 || (abstractC3179 = this.f37258) == null) {
            return;
        }
        abstractC3179.m9785();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        HandlerC13637 handlerC13637 = this.f37207;
        if (z) {
            handlerC13637.m32776();
            m30400();
            return;
        }
        m30278();
        handlerC13637.m32775();
        this.f37280 = 0L;
        this.f37263 = 0L;
        invalidate();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            m30278();
            m30387();
            m30443();
        } else {
            this.f37280 = SystemClock.uptimeMillis();
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30431(ExtractedTextRequest extractedTextRequest, ExtractedText extractedText) {
        InterfaceC7785 interfaceC7785;
        int iM20768;
        int i;
        if (extractedTextRequest == null || (interfaceC7785 = this.f37322) == null) {
            return false;
        }
        extractedText.startOffset = 0;
        int length = interfaceC7785.length();
        if (this.f37300) {
            int[] iArrM30369 = m30369();
            iM20768 = iArrM30369[0];
            int i2 = iArrM30369[1];
            if (i2 - iM20768 > 10000) {
                length = iM20768 + 10000;
            } else {
                if (iM20768 >= 1000) {
                    C7744 c7744Mo26556 = interfaceC7785.mo26556();
                    try {
                        iM20768 = c7744Mo26556.m20768(c7744Mo26556.m20765(iM20768 - 999));
                        c7744Mo26556.close();
                    } catch (Throwable th) {
                        try {
                            c7744Mo26556.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    iM20768 = 0;
                }
                if (i2 - iM20768 <= 10000) {
                    i = iM20768 + 10000;
                } else {
                    int i3 = iArrM30369[1];
                    int i4 = iArrM30369[0];
                    int i5 = (10000 - (i3 - i4)) / 2;
                    int i6 = i3 + i5;
                    iM20768 = i4 - i5;
                    i = i6;
                }
                if (iM20768 < 0) {
                    iM20768 = 0;
                }
                if (i <= length) {
                    length = i;
                }
            }
            extractedText.partialEndOffset = -1;
            extractedText.partialStartOffset = -1;
            extractedText.startOffset = iM20768;
        } else {
            extractedText.partialEndOffset = -1;
            extractedText.partialStartOffset = -1;
            iM20768 = 0;
        }
        extractedText.text = interfaceC7785.mo26557(iM20768, length);
        extractedText.flags = 0;
        if (MetaKeyKeyListener.getMetaState(this.f37322, 2048) != 0) {
            extractedText.flags |= 2;
        }
        if (mo25898()) {
            extractedText.flags |= 1;
        }
        extractedText.selectionStart = m30444() - extractedText.startOffset;
        extractedText.selectionEnd = m30448() - extractedText.startOffset;
        if (Build.VERSION.SDK_INT >= 28) {
            extractedText.hint = this.f37258.f10006;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30351(ExtractedTextRequest extractedTextRequest, ExtractedText extractedText) {
        InterfaceC7785 interfaceC7785 = this.f37322;
        try {
            return m30431(extractedTextRequest, extractedText);
        } catch (UncheckedIOException | C3966 e) {
            if (m30357(interfaceC7785, e)) {
                return false;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m30454() {
        C14508 c14508 = this.f37317;
        if (c14508 != null) {
            int i = c14508.f44488 + 1;
            c14508.f44488 = i;
            if (i == 1) {
                if (c14508.f44492) {
                    c14508.f44490 = 0;
                    c14508.f44489 = this.f37322.length();
                } else {
                    c14508.f44490 = -1;
                    c14508.f44489 = -1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m30534() {
        int i;
        boolean z;
        C14508 c14508 = this.f37317;
        if (c14508 != null && (i = c14508.f44488) > 0) {
            int i2 = i - 1;
            c14508.f44488 = i2;
            if (i2 == 0 && (((z = c14508.f44492) || c14508.f44491) && c14508 != null && (z || c14508.f44491))) {
                c14508.f44492 = false;
                c14508.f44491 = false;
            }
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C2931 m30527() {
        if (Looper.myLooper() != Looper.getMainLooper() || this.f37322.length() != 0 || this.f37277 || this.f37187 || this.f37304 || this.f37244 != null || this.f37258.mo9770() || this.f37322.mo1605()) {
            throw new IllegalStateException("Initial session state requires an idle empty foreground view");
        }
        return C2931.m8935(0, 0, this.f37200, this.f37300, this.f37196, this.f37237, this.f37245, this.f37198, this.f37243);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30324(C2931 c2931, C20030 c20030, C4342 c4342, C21565 c21565) {
        if (Looper.myLooper() != Looper.getMainLooper() || c21565 == null || c21565 != this.f37222 || !c21565.f69292 || this.f37277 || this.f37187 || m30370() || this.f37177 != null) {
            throw new IllegalStateException("Session layout configuration requires its idle reserved view");
        }
        if (c2931.f9326 > c4342.length() || c2931.f9317 > c4342.length()) {
            throw new IllegalArgumentException("Session search range exceeds text length");
        }
        C2931 c2931M8935 = C2931.m8935(getScrollX(), this.f37170, this.f37200, this.f37300, this.f37196, this.f37237, this.f37245, this.f37198, this.f37243);
        C15213 c15213 = new C15213(c21565, c2931, c20030, c4342, this.f37322, this.f37258, c2931M8935);
        this.f37177 = c15213;
        try {
            m30203(c2931, c20030);
            AbstractC3179 abstractC3179M9745 = AbstractC3179.m9745(this, c15213.f46691, this.f37245, this.f37200);
            c15213.f46682 = abstractC3179M9745;
            m30126(abstractC3179M9745, true);
        } catch (Error | RuntimeException e) {
            m30203(c2931M8935, (C20030) null);
            if (this.f37258 == c15213.f46682) {
                m30126(c15213.f46692, true);
            }
            this.f37177 = null;
            c15213.f46691.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30353(C2931 c2931) {
        C15213 c15213 = this.f37177;
        if (c15213 == null) {
            return false;
        }
        if (c15213.f46687 == c2931) {
            C4342 c4342 = c15213.f46688;
            InterfaceC7785 interfaceC7785 = this.f37322;
            if (c4342 == interfaceC7785 && c15213.f46682 == this.f37258 && c15213.f46686 && c15213.f46690 == interfaceC7785.mo26548() && !c15213.f46694 && c15213.f46685 == this.f37222) {
                c15213.f46694 = true;
                m30125(c2931, c15213.f46693, c15213);
                return true;
            }
        }
        throw new IllegalStateException("Prepared session layout does not belong to this restoration");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m30213(C21565 c21565) {
        AbstractC3179 abstractC3179;
        C15213 c15213 = this.f37177;
        if (c15213 != null) {
            C2931 c2931 = c15213.f46689;
            C0273 c0273 = c15213.f46691;
            if (c15213.f46685 != c21565) {
                return;
            }
            this.f37177 = null;
            try {
                if (this.f37322 == c15213.f46695 && (abstractC3179 = this.f37258) == c15213.f46682 && abstractC3179.f10015 == c0273) {
                    m30203(c2931, (C20030) null);
                    m30126(c15213.f46692, true);
                    m30123(c2931.f9319, c2931.f9318, true);
                }
            } finally {
                c0273.close();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C4590 m30422(InterfaceC7785 interfaceC7785) {
        int scrollX;
        C15213 c15213 = this.f37177;
        if (c15213 == null) {
            return null;
        }
        C2931 c2931 = c15213.f46687;
        if (c15213.f46688 != interfaceC7785) {
            return null;
        }
        int iM30198 = m30198(c2931);
        if (c15213.f46693 == null && this.f37258.mo8160()) {
            scrollX = c2931.m8950() ? c2931.f9319 : getScrollX();
        } else {
            scrollX = 0;
        }
        return new C4590(Math.max(0, scrollX), Math.max(0, iM30198), m30394(), m30542());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30355(C4342 c4342, C3280 c3280) {
        C21565 c21565;
        C15213 c15213 = this.f37177;
        if (Looper.myLooper() != Looper.getMainLooper() || c15213 == null || c15213.f46688 != c4342 || c4342 != this.f37322 || c15213.f46682 != this.f37258 || !c15213.f46686 || c15213.f46694 || this.f37277 || this.f37256 || c15213.f46690 != c4342.mo26548() || (c21565 = c15213.f46685) != this.f37222 || !c21565.f69292) {
            return false;
        }
        if ((c3280 != null && c3280.f10322) || c15213.f46687.f9326 >= 0 || !this.f37258.mo9770()) {
            return false;
        }
        C4590 c4590M30422 = m30422((InterfaceC7785) c4342);
        if (c4590M30422.m13500() <= 0 || c4590M30422.m13499() <= 0 || !this.f37258.mo8167(c4590M30422) || !this.f37258.mo9780(Math.max(m30444(), m30448()))) {
            return false;
        }
        AbstractC3179 abstractC3179 = this.f37258;
        c15213.f46683 = new C4631(abstractC3179, abstractC3179.mo8164(), c4590M30422);
        c15213.f46684 = true;
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m30450() {
        C15213 c15213 = this.f37177;
        if (c15213 != null) {
            c15213.f46684 = false;
        }
    }

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public final Throwable m30417() {
        return this.f37247 == this.f37322 ? this.f37252 : this.f37258.mo8171();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m30479(AbstractC3179 abstractC3179) {
        C15213 c15213 = this.f37177;
        C4631 c4631 = c15213 == null ? null : c15213.f46683;
        if (c4631 == null) {
            return false;
        }
        C4342 c4342 = c15213.f46688;
        InterfaceC7785 interfaceC7785 = this.f37322;
        return c4342 == interfaceC7785 && c15213.f46690 == interfaceC7785.mo26548() && abstractC3179 == this.f37258 && c4631.f14706 == abstractC3179 && !this.f37256 && c4631.f14705 == c4631.f14706.mo8164() && c4631.f14708.m13500() == m30394() && c4631.f14708.m13499() == m30542() && c4631.f14706.mo8167(c4631.f14708);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30433(C4342 c4342) {
        C15213 c15213 = this.f37177;
        if (Looper.myLooper() != Looper.getMainLooper() || c15213 == null || c15213.f46688 != c4342 || !c15213.f46694 || !m30479(this.f37258) || getScrollX() != c15213.f46683.f14708.m13501() || this.f37170 != c15213.f46683.f14708.m13502()) {
            return false;
        }
        c15213.f46683.f14707 = true;
        postInvalidate();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30377() {
        C15213 c15213 = this.f37177;
        if ((Looper.myLooper() != Looper.getMainLooper() || c15213 == null || !c15213.f46684 || !m30479(this.f37258) || this.f37277 || this.f37187 || this.f37322.mo1605() || c15213.f46685 != this.f37222) && !m30399()) {
            throw new IllegalStateException("Session view restoration requires an idle foreground owner");
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m30198(C2931 c2931) {
        if (!c2931.m8950()) {
            return this.f37170;
        }
        float f = this.f37213;
        if (f > 0.0f) {
            return (int) Math.min(2147483647L, Math.round((((double) c2931.f9318) / ((double) f)) * ((double) this.f37245.m24484())));
        }
        return c2931.f9318;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m30203(C2931 c2931, C20030 c20030) {
        C13157 c13157 = c2931.f9323;
        C22686 c22686 = this.f37245;
        if (c13157 != null) {
            c13157.m31885(c22686);
        }
        C13157 c13158 = c2931.f9323;
        float fM24484 = 0.0f;
        if (c13158 != null) {
            float f = c13158.f39329;
            fM24484 = f > 0.0f ? f : c22686.m24484();
        }
        this.f37213 = fM24484;
        if (c2931.m8950()) {
            this.f37200 = c2931.f9316;
            this.f37300 = c2931.f9322;
            this.f37196 = c2931.f9315;
            this.f37237 = c2931.f9321;
        }
        if (c20030 != null) {
            c22686.mo24477(c20030.f64875);
            int i = c20030.f64867;
            if (i != c20030.f64872 || c20030.f64880 != c20030.f64881 || (i == 1 && !C11003.equals(c20030.f64876, c20030.f64874))) {
                c22686.m50684(c20030.f64880 * c22686.f29053, c20030.f64867);
            }
            boolean z = c20030.f64862;
            if (z != c20030.f64870) {
                c22686.f73267 = z;
                if (z) {
                    c22686.f73297 = c20030.f64860;
                }
            }
            c22686.f73263 = c20030.f64879;
            c22686.m24494(c20030.f64882);
            c22686.m24497(c20030.f64863);
            c22686.f73261 = c20030.f64868;
            c22686.m24478(c20030.f64865);
            this.f37200 = c20030.f64877;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30323(C2931 c2931, C20030 c20030) {
        m30125(c2931, c20030, (C15213) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m30125(C2931 c2931, C20030 c20030, C15213 c15213) {
        int scrollX;
        m30377();
        if (c2931.f9326 > this.f37322.length() || c2931.f9317 > this.f37322.length()) {
            throw new IllegalArgumentException("Session search range exceeds text length");
        }
        m30438();
        this.f37304 = true;
        this.f37235.m18571();
        if (c15213 == null) {
            try {
                m30203(c2931, c20030);
            } catch (Throwable th) {
                this.f37304 = false;
                m30371();
                this.f37173.m17859(this.f37322);
                this.f37235.m18597(this.f37322);
                m30165();
                throw th;
            }
        }
        m30289();
        if (c2931.m8951()) {
            C22686 c22686 = this.f37245;
            c22686.f73250 = c2931.f9326;
            c22686.f73229 = c2931.f9317;
        }
        c2931.m8948(this.f37198, this.f37243);
        this.f37285.forceFinished(true);
        this.f37207.removeMessages(1);
        this.f37235.m18572();
        this.f37315.m52265();
        if (c15213 == null) {
            m30126(AbstractC3179.m9745(this, this.f37322, this.f37245, this.f37200), true);
        }
        this.f37221 = -1.0f;
        m30227();
        this.f37202.incrementAndGet();
        if (c20030 == null) {
            scrollX = c2931.m8950() ? c2931.f9319 : getScrollX();
        } else {
            scrollX = 0;
        }
        int iM30198 = m30198(c2931);
        AbstractC3179 abstractC3179 = this.f37258;
        InterfaceC7785 interfaceC7785 = this.f37322;
        this.f37244 = new C22270(abstractC3179, interfaceC7785, interfaceC7785.mo26548(), scrollX, iM30198);
        m30123(m30390(scrollX), m30521(iM30198), true);
        m30232(this.f37258);
        C22686 c22687 = this.f37245;
        if (c22687.f73267) {
            m30317(c22687.f73297, true);
        } else if (c20030 != null && c20030.f64862 != c20030.f64870) {
            m30317((String) null, false);
        }
        m30465();
        this.f37304 = false;
        m30371();
        this.f37173.m17859(this.f37322);
        this.f37235.m18597(this.f37322);
        m30165();
        if (this.f37245.f73267 && this.f37235.m18574()) {
            this.f37315.m52257(this.f37235.m18587());
        } else {
            this.f37315.m52257(C23701.f76752);
        }
        m30405();
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: ۟ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30399() {
        if (Looper.myLooper() != Looper.getMainLooper() || !(this.f37322 instanceof C4342) || m30519() || this.f37277 || this.f37187 || this.f37304 || this.f37244 != null) {
            return false;
        }
        C15213 c15213 = this.f37177;
        return ((c15213 != null && !c15213.f46686) || this.f37258.mo9770() || this.f37322.mo1605()) ? false : true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m30508() {
        if (Looper.myLooper() != Looper.getMainLooper() || !(this.f37322 instanceof C4342) || this.f37277 || this.f37187 || this.f37304) {
            return false;
        }
        C15213 c15213 = this.f37177;
        return (c15213 == null || c15213.f46686) && !this.f37322.mo1605();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C2931 m30517() {
        if (m30508()) {
            return C2931.m8935(getScrollX(), this.f37170, this.f37200, this.f37300, this.f37196, this.f37237, this.f37245, this.f37198, this.f37243);
        }
        throw new IllegalStateException("Session view state requires a stable foreground owner");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30326(RunnableC5152 runnableC5152) {
        this.f37272.add(runnableC5152);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m30429(RunnableC5152 runnableC5152) {
        this.f37272.remove(runnableC5152);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۗᩳ, reason: not valid java name and contains not printable characters */
    public void m30165() {
        if (!this.f37272.isEmpty()) {
            C4925.m14315(new RunnableC7994(0, this));
        }
        synchronized (this.f37260) {
            final C20154 c20154 = this.f37268;
            if (c20154 != null && !c20154.f65262) {
                c20154.f65262 = true;
                C4925.m14315(new Runnable() { // from class: l.᩹ۛᩳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C12392.m30145(this.f71768, c20154);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30128(C12392 c12392) {
        Iterator it = c12392.f37272.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m30473(C4342 c4342) {
        C20154 c20154;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Session view readiness requires the foreground thread");
        }
        synchronized (this.f37260) {
            if (this.f37322 != c4342) {
                throw new IllegalStateException("Session readiness owner is not installed in the view");
            }
            if (c4342.mo1605()) {
                throw new IllegalStateException("Cannot await view readiness during text replacement");
            }
            c20154 = this.f37268;
            if (c20154 == null) {
                c20154 = new C20154(c4342, this.f37258, c4342.mo26548());
                this.f37268 = c20154;
            }
        }
        m30165();
        return c20154.f65263.m10921((InterfaceC21423) new C5172());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30145(C12392 c12392, C20154 c20154) {
        synchronized (c12392.f37260) {
            if (c12392.f37268 != c20154) {
                return;
            }
            c20154.f65262 = false;
            InterfaceC7785 interfaceC7785 = c12392.f37322;
            boolean z = (interfaceC7785 == c20154.f65266 && c12392.f37258 == c20154.f65264 && interfaceC7785.mo26548() == c20154.f65265) ? false : true;
            if (z || !(c12392.m30519() || c12392.f37277 || c12392.f37187 || c12392.f37304 || c12392.f37287 || c12392.f37244 != null || c12392.f37258.mo9770() || c12392.f37322.mo1605())) {
                c12392.f37268 = null;
                Throwable thM30417 = c12392.m30417();
                if (!z && thM30417 != null) {
                    c20154.f65263.m10914(thM30417);
                } else if (z) {
                    c20154.f65263.m10914((Throwable) new CancellationException("Session view preparation was superseded"));
                } else {
                    c20154.f65263.m10912((Object) null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m30252(final String str) {
        final C20154 c20154;
        synchronized (this.f37260) {
            c20154 = this.f37268;
            this.f37268 = null;
        }
        if (c20154 != null) {
            C4925.m14315(new Runnable() { // from class: l.֨ۛᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    TextKeyListener textKeyListener = C12392.f37169;
                    c20154.f65263.m10914((Throwable) new CancellationException(str));
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۜᩳ, reason: not valid java name and contains not printable characters */
    private void m30181() {
        if (this.f37244 == null || this.f37304) {
            return;
        }
        this.f37244 = null;
        this.f37202.incrementAndGet();
        m30165();
    }

    /* JADX INFO: renamed from: ۜܽ, reason: not valid java name and contains not printable characters */
    public final int m30396() {
        return this.f37202.get();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30354(AbstractC3179 abstractC3179) {
        C22270 c22270 = this.f37244;
        return c22270 != null && c22270.f72248 == abstractC3179;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m30500(AbstractC3179 abstractC3179) {
        if (this.f37244 != null) {
            C4925.m14315(new RunnableC16460(0, this, abstractC3179));
        }
        m30165();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m30232(AbstractC3179 abstractC3179) {
        C22270 c22270 = this.f37244;
        if (c22270 == null || c22270.f72248 != abstractC3179) {
            return;
        }
        if (this.f37258 != abstractC3179 || this.f37322 != c22270.f72249 || this.f37322.mo26548() != c22270.f72250) {
            this.f37244 = null;
            m30165();
        } else {
            if (abstractC3179.mo9770()) {
                return;
            }
            this.f37244 = null;
            this.f37202.incrementAndGet();
            if (abstractC3179 instanceof C2575) {
                ((C2575) abstractC3179).m8175(c22270.f72252, m30394());
            }
            m30123(m30390(c22270.f72252), m30521(c22270.f72251), true);
            m30165();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30331(C10130 c10130, boolean z) {
        if (this.f37322 instanceof C4342) {
            throw new IllegalStateException("Session text requires the session recovery protocol");
        }
        c10130.writeInt(-249340294);
        c10130.m25436();
        c10130.writeByte(0);
        c10130.m25436();
        this.f37322.mo1594(c10130);
        c10130.writeInt(this.f37322.mo13049());
        c10130.m25418();
        c10130.writeByte(1);
        c10130.m25436();
        c10130.writeInt(this.f37271);
        c10130.writeInt(this.f37226);
        c10130.writeInt(this.f37227);
        c10130.m25418();
        c10130.writeByte(2);
        c10130.m25436();
        c10130.writeInt(m30444());
        c10130.writeInt(m30448());
        c10130.writeInt(getScrollX());
        c10130.writeInt(this.f37170);
        c10130.writeByte((byte) this.f37200);
        c10130.m25425(this.f37300);
        c10130.m25425(this.f37196);
        c10130.m25425(this.f37237);
        c10130.m25418();
        c10130.writeByte(10);
        c10130.m25436();
        c10130.m25431(this.f37322.mo1606());
        c10130.m25431(this.f37322.mo1601().m52329());
        c10130.m25418();
        c10130.writeByte(11);
        c10130.m25436();
        this.f37198.m49753(c10130);
        this.f37243.m49753(c10130);
        c10130.m25418();
        c10130.writeByte(4);
        c10130.m25436();
        this.f37245.m50686(c10130);
        c10130.m25418();
        c10130.writeByte(7);
        c10130.m25436();
        c10130.writeInt(this.f37245.f73250);
        c10130.writeInt(this.f37245.f73229);
        c10130.m25418();
        c10130.writeByte(5);
        c10130.m25436();
        this.f37258.mo8159(c10130);
        c10130.m25418();
        if (z) {
            c10130.writeByte(9);
            c10130.m25436();
            this.f37235.m18564(c10130);
            c10130.m25418();
        }
        c10130.writeByte(-1);
        c10130.m25418();
        c10130.writeInt(-249340294);
    }

    /* JADX WARN: Code duplicated, block: B:152:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x0015 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m30210(C12951 c12951) {
        String str;
        int iM10614;
        InterfaceC7785 c0273;
        InterfaceC7785 interfaceC7785;
        C5753 c5753M16197;
        AbstractC3179 c17474;
        String str2;
        if (!c12951.m31490(-249340294)) {
            throw new RuntimeException("Bad instance state magic");
        }
        int iM31488 = c12951.m31488() + c12951.readInt();
        boolean z = false;
        boolean z2 = false;
        while (true) {
            byte b = c12951.readByte();
            C22146 c22146 = this.f37243;
            C22146 c22147 = this.f37198;
            C6870 c6870 = this.f37235;
            C22686 c22686 = this.f37245;
            if (b != -1) {
                int iM31489 = c12951.m31488() + c12951.readInt();
                switch (b) {
                    case 0:
                        int iMo1591 = this.f37322.mo1591();
                        int iM31500 = c12951.m31500();
                        boolean z3 = iM31500 == -500019884 || iM31500 == -483177132;
                        if (z3) {
                            C0273 c0273M1588 = C0273.m1588(c12951, iM31489 - 4);
                            iM10614 = c0273M1588.hashCode();
                            interfaceC7785 = c0273M1588;
                        } else {
                            if (c12951.m31500() == -500018348) {
                                c5753M16197 = C5753.m16197(c12951, this.f37232);
                                iM10614 = c5753M16197.hashCode();
                                if (this.f37185) {
                                    try {
                                        try {
                                            interfaceC7785 = c5753M16197;
                                            c0273 = C0273.m1590(c5753M16197);
                                            c5753M16197.close();
                                        } catch (IOException e) {
                                            throw new UncheckedIOException(e);
                                        }
                                    } catch (Throwable th) {
                                        c5753M16197.close();
                                        throw th;
                                    }
                                }
                            } else {
                                C3469 c3469M32320 = C13346.m32320(c12951, this.f37232);
                                iM10614 = c3469M32320.m10614();
                                c0273 = new C0273(c3469M32320.m10615());
                            }
                            interfaceC7785 = c0273;
                        }
                        interfaceC7785 = c5753M16197;
                        int i = c12951.readInt();
                        if (z3 && i != iM10614) {
                            interfaceC7785.mo13046(false);
                            throw new IllegalArgumentException("Memory text state checksum mismatch");
                        }
                        InterfaceC7785 interfaceC7786 = this.f37322;
                        m30253(interfaceC7785);
                        this.f37173.m17860(this.f37322);
                        c6870.m18572();
                        this.f37315.m52265();
                        interfaceC7786.mo13046(false);
                        this.f37322.mo1592(iMo1591);
                        InterfaceC7785 interfaceC7787 = this.f37322;
                        interfaceC7787.setSpan(this.f37248, 0, interfaceC7787.length(), 8388626);
                        z = i != iM10614;
                        if (c12951.m31488() != iM31489) {
                            c12951.seek(iM31489);
                        }
                        break;
                        break;
                    case 1:
                        this.f37271 = c12951.readInt();
                        this.f37226 = c12951.readInt();
                        int i2 = c12951.readInt();
                        this.f37227 = i2;
                        this.f37322.mo1600(this.f37226 != i2);
                        if (c12951.m31488() != iM31489) {
                            c12951.seek(iM31489);
                        }
                        break;
                    case 2:
                        this.f37322.setSelection(c12951.readInt(), c12951.readInt());
                        this.f37285.forceFinished(true);
                        HandlerC13637 handlerC13637 = this.f37207;
                        handlerC13637.removeMessages(1);
                        final int i3 = c12951.readInt();
                        final int i4 = c12951.readInt();
                        m30123(i3, i4, true);
                        handlerC13637.post(new Runnable() { // from class: l.᩵ۛᩳ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C12392.m30130(this.f60673, i3, i4);
                            }
                        });
                        this.f37200 = c12951.readByte() & 255;
                        this.f37300 = c12951.m31498();
                        this.f37196 = c12951.m31498();
                        this.f37237 = c12951.m31498();
                        this.f37221 = -1.0f;
                        m30227();
                        if (c12951.m31488() != iM31489) {
                            c12951.seek(iM31489);
                        }
                        break;
                    case 3:
                        m30211(c12951, iM31489);
                        m30211(c12951, iM31489);
                        c22147.m49754(c12951);
                        c22146.m49754(c12951);
                        if (c12951.m31488() != iM31489) {
                            c12951.seek(iM31489);
                        }
                        break;
                    case 4:
                        c22686.getClass();
                        c22686.f73293 = c12951.m31504();
                        c22686.f73263 = c12951.m31498();
                        c22686.m50684(c12951.m31495(), c12951.readByte());
                        c22686.m24478(c12951.m31494());
                        c22686.m24479(c12951.m31498());
                        c22686.m24490(c12951.m31498());
                        c22686.f73227 = c12951.m31498();
                        c22686.f73272 = c12951.m31498();
                        boolean zM31498 = c12951.m31498();
                        c22686.f73267 = zM31498;
                        if (zM31498) {
                            c22686.f73297 = c12951.m31504();
                        }
                        int i5 = c12951.available() > 4 ? c12951.readInt() : 0;
                        if (i5 < 591749667) {
                            c22686.mo24477(1.0f);
                        } else {
                            c22686.m24494(c12951.m31498());
                            if (i5 >= 591749669) {
                                c22686.m24497(c12951.m31498());
                            }
                            if (i5 >= 591749668) {
                                c22686.f73261 = c12951.m31498();
                            }
                            Integer numValueOf = null;
                            Integer numValueOf2 = (i5 < 591749670 || !c12951.m31498()) ? null : Integer.valueOf(c12951.readInt());
                            if (i5 >= 591749671 && c12951.m31498()) {
                                numValueOf = Integer.valueOf(c12951.readInt());
                            }
                            c22686.mo24477(i5 >= 591749672 ? c12951.m31495() : 1.0f);
                            if (i5 >= 591749672) {
                                c12951.m31495();
                            }
                            c22686.m50688(numValueOf2);
                            c22686.m50685(numValueOf);
                        }
                        if (c12951.m31488() != iM31489) {
                            c12951.seek(iM31489);
                        }
                        break;
                    case 5:
                        if (c12951.readByte() == 0) {
                            c17474 = new C2575(this, this.f37322, c22686, c12951);
                        } else {
                            c17474 = new C17474(this, this.f37322, c22686, c12951);
                        }
                        m30126(c17474, true);
                        if (c12951.m31488() != iM31489) {
                            c12951.seek(iM31489);
                        }
                        break;
                    case 6:
                    case 8:
                        c12951.seek(iM31489);
                        if (c22686.f73267) {
                            str2 = c22686.f73297;
                            m30317(str2, true);
                            z2 = true;
                            if (c12951.m31488() != iM31489) {
                                c12951.seek(iM31489);
                            }
                        } else if (c12951.m31488() != iM31489) {
                            c12951.seek(iM31489);
                        }
                        break;
                    case 7:
                        c22686.f73250 = c12951.readInt();
                        c22686.f73229 = c12951.readInt();
                        m30465();
                        if (c12951.m31488() != iM31489) {
                            c12951.seek(iM31489);
                        }
                        break;
                    case 9:
                        if (z) {
                            c12951.seek(iM31489);
                        } else if (!c6870.m18570(c12951, iM31489) && c22686.f73267) {
                            str2 = c22686.f73297;
                            m30317(str2, true);
                            z2 = true;
                        }
                        if (c12951.m31488() != iM31489) {
                            c12951.seek(iM31489);
                        }
                        break;
                    case 10:
                        this.f37322.mo1603(c12951.readLong());
                        if (c12951.readLong() != this.f37322.mo1601().m52329()) {
                            this.f37322.mo1600(true);
                        }
                        if (c12951.m31488() != iM31489) {
                            c12951.seek(iM31489);
                        }
                        break;
                    case 11:
                        c22147.m49754(c12951);
                        c22146.m49754(c12951);
                        if (c12951.m31488() != iM31489) {
                            c12951.seek(iM31489);
                        }
                        break;
                    default:
                        System.out.println("Unknown instance state record type: " + ((int) b));
                        c12951.seek((long) iM31489);
                        break;
                }
            } else {
                if (z) {
                    System.out.println("Text's fastHashCode changed, reset all.");
                    c22147.m49752();
                    c22146.m49752();
                    m30533();
                    if (!z2) {
                        str = c22686.f73297;
                        m30317(str, true);
                    }
                } else {
                    this.f37258.m9793();
                    this.f37258.mo9783(m30394());
                    if (!z2 && c22686.f73267 && (!c6870.m18575() || !c6870.m18568((CharSequence) this.f37322))) {
                        str = c22686.f73297;
                        m30317(str, true);
                    }
                }
                if (c12951.m31488() != iM31488) {
                    c12951.seek(iM31488);
                }
                if (c12951.readInt() != -249340294) {
                    throw new RuntimeException();
                }
                postInvalidate();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m30211(C12951 c12951, int i) {
        int i2 = c12951.readInt();
        if (i2 < 0 || i2 > (i - c12951.m31488()) / 12) {
            throw new IllegalArgumentException("Invalid legacy undo count");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = c12951.readInt();
            if (i4 < 0 || i4 > (i - c12951.m31488()) / 28) {
                throw new IllegalArgumentException("Invalid legacy undo changes");
            }
            for (int i5 = 0; i5 < i4; i5++) {
                if (i - c12951.m31488() < 28) {
                    throw new IllegalArgumentException("Truncated legacy undo change");
                }
                c12951.skipBytes(20);
                for (int i6 = 0; i6 < 2; i6++) {
                    if (i - c12951.m31488() < 4) {
                        throw new IllegalArgumentException("Truncated legacy undo text");
                    }
                    int i7 = c12951.readInt();
                    if (i7 < 0 || i7 > i - c12951.m31488()) {
                        throw new IllegalArgumentException("Invalid legacy undo text length");
                    }
                    c12951.skipBytes(i7);
                }
            }
            if (i - c12951.m31488() < 8) {
                throw new IllegalArgumentException("Truncated legacy undo time");
            }
            c12951.skipBytes(8);
        }
    }

    static {
        ApplicationC12518.m30701(98);
        f37169 = new TextKeyListener(TextKeyListener.Capitalize.NONE, false);
        f37168 = C11266.m27878(120.0f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30341(InterfaceC21524 interfaceC21524) {
        this.f37292.add(interfaceC21524);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m30443() {
        AbstractC21708 abstractC21708 = this.f37236;
        if (abstractC21708 != null) {
            abstractC21708.m49035();
        }
        ArrayList arrayList = this.f37292;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC21524) arrayList.get(i)).mo1090();
        }
        m30416();
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static int m30184(int i) {
        float f = i;
        float f2 = f / f37168;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return (int) (f * f2 * 0.5f);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m30426(int i, int i2) {
        m30191();
        m30181();
        this.f37207.removeMessages(1);
        this.f37285.forceFinished(true);
        m30242(i, i2);
    }

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public final int m30525() {
        return this.f37258.f9998.get(this.f37258.m9759(this.f37170 + 1)).f35062;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܶᩳ, reason: not valid java name and contains not printable characters */
    public void m30240() {
        this.f37314 = SystemClock.uptimeMillis();
        HandlerC13637 handlerC13637 = this.f37207;
        handlerC13637.removeMessages(3);
        handlerC13637.sendEmptyMessageDelayed(3, 1500L);
        postInvalidate();
    }

    /* JADX INFO: renamed from: ۨܽ, reason: not valid java name and contains not printable characters */
    public final void m30442() {
        if (this.f37258.mo8160()) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            int i = (int) (jUptimeMillis - this.f37314);
            this.f37172 = false;
            if (i >= 0 && i <= 1500) {
                this.f37207.removeMessages(3);
                this.f37314 = jUptimeMillis - 1500;
                postInvalidate();
            }
            m30187();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۠ᩳ, reason: not valid java name and contains not printable characters */
    public void m30187() {
        if (this.f37258.mo8160()) {
            this.f37309 = SystemClock.uptimeMillis();
            HandlerC13637 handlerC13637 = this.f37207;
            handlerC13637.removeMessages(5);
            handlerC13637.sendEmptyMessageDelayed(5, 1500L);
            postInvalidate();
        }
    }

    /* JADX INFO: renamed from: ܰܽ, reason: not valid java name and contains not printable characters */
    public final void m30453() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i = (int) (jUptimeMillis - this.f37309);
        this.f37294 = false;
        if (i >= 0 && i <= 1500) {
            this.f37207.removeMessages(5);
            this.f37309 = jUptimeMillis - 1500;
            postInvalidate();
        }
        m30240();
    }

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public final void m30366() {
        this.f37309 = 0L;
        this.f37314 = 0L;
        m30278();
        postInvalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m30304(int i) {
        C22686 c22686 = this.f37245;
        if (c22686.f73267) {
            C6870 c6870 = this.f37235;
            if (c6870.m18575()) {
                return c6870.m18595(i, c22686.m24492());
            }
        }
        return c22686.m24492();
    }

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public final String m30440() {
        return this.f37235.m18573();
    }

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public final List m30398() {
        int[] iArrM30369 = m30369();
        int iM51120 = C22975.m51120(iArrM30369[0], this.f37322);
        int iM51112 = C22975.m51112(iArrM30369[1], this.f37322);
        if (iM51112 < this.f37322.length()) {
            iM51112++;
        }
        return this.f37235.m18577(iM51120, iM51112);
    }

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC17186 m30535() {
        return this.f37235.m18596();
    }

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC6603 m30451() {
        return this.f37235.m18592();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m30410() {
        m30311(m30444(), m30448());
        InterfaceC19449 interfaceC19449 = this.f37301;
        if (interfaceC19449 != null) {
            interfaceC19449.mo2704(m30383(), m30296());
            this.f37301.mo2703(this.f37322.isChanged());
        }
        m30405();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m30405() {
        if (this.f37247 == this.f37322 || this.f37315 == null) {
            return;
        }
        int iM30444 = m30444();
        int iM30448 = m30448();
        long jM18576 = this.f37235.m18576();
        if (jM18576 == Long.MIN_VALUE) {
            this.f37315.m52259(iM30444, iM30448);
        } else if (jM18576 == -1) {
            this.f37315.m52253(iM30444, iM30448);
        } else {
            this.f37315.m52254(iM30444, iM30448, (int) (jM18576 >>> 32), (int) jM18576);
        }
    }

    /* JADX INFO: renamed from: ۖܽ, reason: not valid java name and contains not printable characters */
    public final void m30367() {
        C23701 c23701 = this.f37315;
        if (c23701 != null) {
            c23701.m52253(m30444(), m30448());
        }
    }

    /* JADX INFO: renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public final void m30515() {
        C23701 c23701 = this.f37315;
        if (c23701 != null) {
            c23701.m52265();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30333(C13681 c13681) {
        this.f37319 = c13681;
    }

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public final String m30492() {
        C13681 c13681 = this.f37319;
        if (c13681 == null) {
            return m30378();
        }
        return C7864.m21066(c13681.f40834);
    }

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public final String m30378() {
        InterfaceC7785 interfaceC7785 = this.f37322;
        int selectionStart = Selection.getSelectionStart(interfaceC7785);
        int selectionEnd = Selection.getSelectionEnd(interfaceC7785);
        if (selectionStart == selectionEnd || selectionStart == -1 || selectionEnd == -1) {
            return null;
        }
        if (selectionStart < selectionEnd) {
            return interfaceC7785.subSequence(selectionStart, selectionEnd).toString();
        }
        return interfaceC7785.subSequence(selectionEnd, selectionStart).toString();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m30416() {
        C7701 c7701 = this.f37311;
        if (c7701 != null) {
            c7701.m20608();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30328(InterfaceC7765 interfaceC7765) {
        this.f37232 = interfaceC7765;
        this.f37322.mo1593(interfaceC7765);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m30391() {
        int iM52251;
        int iM30444 = m30444();
        if (iM30444 != m30448() || (iM52251 = this.f37315.m52251(iM30444)) == -1) {
            return;
        }
        mo25919(iM52251);
        this.f37280 = SystemClock.uptimeMillis();
        m30349(iM52251, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m30522() {
        int[] iArrM52260;
        int iM30444 = m30444();
        if (iM30444 != m30448() || (iArrM52260 = this.f37315.m52260(iM30444)) == null) {
            return;
        }
        mo25922(iArrM52260[0], iArrM52260[1] + 1);
        m30537();
        m30430(false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m30423() {
        Runnable runnable = this.f37310;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30315(Runnable runnable) {
        this.f37310 = runnable;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30344(InterfaceC22602 interfaceC22602) {
        this.f37191 = interfaceC22602;
    }

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30469() {
        return this.f37191 != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30322(C2141 c2141) {
        this.f37190 = c2141;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m30465() {
        C2141 c2141 = this.f37190;
        if (c2141 != null) {
            C22686 c22686 = this.f37245;
            int i = c22686.f73250;
            int i2 = c22686.f73229;
            C15545.m36657((C15545) c2141.f7109, i != i2 && i >= 0 && i2 >= 0);
        }
    }

    /* JADX INFO: renamed from: ܶܽ, reason: not valid java name and contains not printable characters */
    public final void m30464() {
        C22686 c22686 = this.f37245;
        int i = c22686.f73250;
        int i2 = c22686.f73229;
        if (i == i2 || i < 0 || i2 < 0) {
            return;
        }
        c22686.f73229 = -1;
        c22686.f73250 = -1;
        m30465();
        invalidate();
    }

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public final C12973 m30518() {
        C22686 c22686 = this.f37245;
        int i = c22686.f73250;
        int i2 = c22686.f73229;
        if (i == i2 || i < 0 || i2 < 0) {
            return null;
        }
        C12973 c12973 = new C12973();
        c12973.f38879 = i;
        c12973.f38878 = i2;
        return c12973;
    }

    /* JADX INFO: renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30302() {
        EdgeEffect edgeEffect = this.f37216;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            return false;
        }
        EdgeEffect edgeEffect2 = this.f37275;
        if (edgeEffect2 != null && !edgeEffect2.isFinished()) {
            return false;
        }
        EdgeEffect edgeEffect3 = this.f37303;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            return false;
        }
        EdgeEffect edgeEffect4 = this.f37189;
        return edgeEffect4 == null || edgeEffect4.isFinished();
    }

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final float m30384() {
        return this.f37245.m24484();
    }

    /* JADX INFO: renamed from: ܳᩳ, reason: not valid java name and contains not printable characters */
    public final void m30461() {
        C22810 c22810 = this.f37181;
        if (c22810 != null) {
            c22810.m50904();
        }
        this.f37181 = new C22810(this);
        if (this.f37259 == null) {
            this.f37259 = new ViewTreeObserverOnGlobalLayoutListenerC1103(this);
            if (isAttachedToWindow()) {
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                viewTreeObserver.addOnGlobalLayoutListener(this.f37259);
                viewTreeObserver.addOnScrollChangedListener(this.f37259);
            }
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public final C22810 m30543() {
        return this.f37181;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m30467(boolean z) {
        this.f37204 = z;
        if (z) {
            return;
        }
        m30162();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m30486(int i, boolean z) {
        this.f37267 = z;
        if (z) {
            this.f37313 = i;
        } else {
            m30162();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m30425(float f, float f2) {
        int i;
        this.f37289 = f;
        this.f37293 = f2;
        int iM30444 = m30444();
        int iM30448 = m30448();
        if (iM30444 <= iM30448) {
            iM30448 = iM30444;
            iM30444 = iM30448;
        }
        int iM9760 = this.f37258.m9760(getScrollX() + f, this.f37170 + f2);
        if (this.f37266 != iM9760 && (i = this.f37313) != iM9760) {
            this.f37266 = -1;
            if (i > iM9760) {
                if (iM30448 != iM9760) {
                    this.f37322.setSelection(iM9760, i);
                    invalidate();
                }
            } else if (iM30444 != iM9760) {
                this.f37322.setSelection(i, iM9760);
                invalidate();
            }
        }
        if (mo25914()) {
            m30200((int) (f + getPaddingLeft()), (int) (f2 + getPaddingTop()), this.f37245.f73274);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m30496(float f, float f2) {
        this.f37289 = f;
        this.f37293 = f2;
        int iM9760 = this.f37258.m9760(getScrollX() + f, this.f37170 + f2);
        if (iM9760 != Selection.getSelectionStart(this.f37322)) {
            this.f37322.setSelection(iM9760);
            invalidate();
            m30238(iM9760);
        }
        this.f37263 = SystemClock.uptimeMillis();
        m30400();
        int iM24484 = (int) this.f37245.m24484();
        boolean z = f2 < ((float) (-iM24484)) || f2 > ((float) (m30542() + iM24484));
        if (mo25914()) {
            if (!z) {
                m30200((int) (f + getPaddingLeft()), (int) (f2 + getPaddingTop()), 0);
            } else {
                m30162();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m30476(float f, float f2) {
        this.f37289 = f;
        this.f37293 = f2;
        int iM30444 = m30444();
        int iM30448 = m30448();
        if (iM30444 <= iM30448) {
            iM30448 = iM30444;
            iM30444 = iM30448;
        }
        int iM9760 = this.f37258.m9760(getScrollX() + f, this.f37170 + f2);
        int i = this.f37313;
        boolean z = true;
        if (i != iM9760) {
            if (i > iM9760) {
                if (iM30448 != iM9760) {
                    this.f37322.setSelection(iM9760, i);
                    m30238(iM9760);
                    if (!this.f37308) {
                        this.f37308 = true;
                    }
                }
            } else if (iM30444 != iM9760) {
                this.f37322.setSelection(i, iM9760);
                m30238(iM9760);
                if (this.f37308) {
                    this.f37308 = false;
                }
            }
            this.f37263 = SystemClock.uptimeMillis();
            invalidate();
        }
        int iM24484 = (int) this.f37245.m24484();
        if (f2 >= (-iM24484) && f2 <= m30542() + iM24484) {
            z = false;
        }
        if (mo25914()) {
            if (!z) {
                m30200((int) (f + getPaddingLeft()), (int) (f2 + getPaddingTop()), 0);
            } else {
                m30162();
            }
        }
    }

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final int m30394() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final int m30542() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* JADX INFO: renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public final void m30376() {
        this.f37274.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    /* JADX INFO: renamed from: ۙܽ, reason: not valid java name and contains not printable characters */
    public final void m30380() {
        this.f37274.restartInput(this);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void m30387() {
        C22810 c22810 = this.f37181;
        if (c22810 != null) {
            this.f37263 = 0L;
            c22810.m50904();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m30477(String str) {
        this.f37258.mo8158(str);
        invalidate();
    }

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final String m30509() {
        return this.f37258.f10006;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        return this.f37258 == null ? getHeight() : Math.max(getHeight(), (int) this.f37258.m9789());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setScrollY(this.f37170);
        accessibilityEvent.setMaxScrollY(this.f37258 == null ? 0 : m30528());
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
            CharSequence charSequenceSubSequence = this.f37322;
            if (TextUtils.isEmpty(charSequenceSubSequence)) {
                charSequenceSubSequence = this.f37258.f10006;
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
        if (action == 4 || action == 6 || (!m30441() && m30174())) {
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
                    int iM9760 = this.f37258.m9760(getScrollX() + x, this.f37170 + y);
                    if (iM9760 != m30444() || iM9760 != m30448()) {
                        this.f37322.setSelection(iM9760);
                        m30349(iM9760, true);
                    }
                    invalidate();
                    if (mo25914()) {
                        m30200((int) x, (int) y, this.f37245.f73274);
                        return true;
                    }
                    return true;
                case 3:
                    ClipData clipData = dragEvent.getClipData();
                    if (clipData.getItemCount() > 0) {
                        CharSequence charSequenceM50681 = C22686.m50681(clipData.getItemAt(0).getText());
                        int[] iArrM30369 = m30369();
                        this.f37322.replace(iArrM30369[0], iArrM30369[1], charSequenceM50681);
                        int length = charSequenceM50681.length() + iArrM30369[0];
                        iArrM30369[1] = length;
                        mo25922(iArrM30369[0], length);
                        invalidate();
                        return true;
                    }
                    return true;
                case 4:
                    if (mo25914()) {
                        m30162();
                    }
                    this.f37199 = false;
                    invalidate();
                    return true;
                case 5:
                    if (mo25914()) {
                        m30200((int) dragEvent.getX(), (int) dragEvent.getY(), this.f37245.f73274);
                    }
                    this.f37199 = true;
                    invalidate();
                    return true;
                case 6:
                    if (mo25914()) {
                        m30162();
                    }
                    this.f37199 = false;
                    invalidate();
                    return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30452() {
        return this.f37204;
    }

    /* JADX INFO: renamed from: ۫ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30445() {
        return this.f37267;
    }

    /* JADX INFO: renamed from: ۤۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30418() {
        return this.f37308;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30142(C12392 c12392, C12392 c12393) {
        if (c12392 == c12393) {
            throw new IllegalArgumentException();
        }
        c12392.f37281 = c12393;
        c12393.f37281 = c12392;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m30208(C12392 c12392, C12392 c12393) {
        if (c12392.f37295) {
            c12393.f37314 = SystemClock.uptimeMillis();
        } else if (c12393.f37295) {
            c12392.f37314 = SystemClock.uptimeMillis();
        } else {
            long jMax = Math.max(c12392.f37314, c12393.f37314);
            c12393.f37314 = jMax;
            c12392.f37314 = jMax;
        }
        if (c12392.f37291) {
            c12393.f37309 = SystemClock.uptimeMillis();
        } else {
            if (c12393.f37291) {
                c12392.f37309 = SystemClock.uptimeMillis();
                return;
            }
            long jMax2 = Math.max(c12392.f37309, c12393.f37309);
            c12393.f37309 = jMax2;
            c12392.f37309 = jMax2;
        }
    }

    /* JADX INFO: renamed from: ۤܽ, reason: not valid java name and contains not printable characters */
    public final void m30419() {
        if (!this.f37316) {
            this.f37316 = true;
            C16909.m39764(this.f37303);
            C16909.m39764(this.f37189);
            EdgeEffect edgeEffect = this.f37216;
            if (edgeEffect != null) {
                C16909.m39764(edgeEffect);
            }
            EdgeEffect edgeEffect2 = this.f37275;
            if (edgeEffect2 != null) {
                C16909.m39764(edgeEffect2);
            }
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m30540(int i, int i2) {
        this.f37269 = i;
        this.f37223 = i2;
        this.f37239.m22792();
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
    /* JADX INFO: renamed from: ᩳᩳ, reason: not valid java name and contains not printable characters */
    public final void m30506() {
        boolean z;
        boolean z2;
        boolean z3;
        ?? r1;
        int i;
        if ((this.f37269 & 3) == 0 || this.f37258 == null || m30370() || !this.f37274.isActive(this)) {
            return;
        }
        int i2 = this.f37223;
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
        CursorAnchorInfo.Builder builder = this.f37233;
        builder.reset();
        int iM30444 = m30444();
        builder.setSelectionRange(iM30444, m30448());
        if (i3 >= 29) {
            this.f37229.reset();
            transformMatrixToGlobal(this.f37229);
            builder.setMatrix(this.f37229);
        } else {
            this.f37229.set(getMatrix());
            getLocationOnScreen(this.f37212);
            Matrix matrix = this.f37229;
            int[] iArr = this.f37212;
            matrix.postTranslate(iArr[0], iArr[1]);
            builder.setMatrix(this.f37229);
        }
        if (z5 && i3 >= 34) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(rectF).setHandwritingBounds(new RectF(-getHandwritingBoundsOffsetLeft(), -getHandwritingBoundsOffsetTop(), getHandwritingBoundsOffsetRight() + getWidth(), getHandwritingBoundsOffsetBottom() + getHeight())).build());
        }
        if (z6 || z7) {
            float paddingLeft = getPaddingLeft() - getScrollX();
            float paddingTop = getPaddingTop() - this.f37170;
            RectF rectF2 = new RectF();
            RectF rectF3 = new RectF(getPaddingLeft(), getPaddingRight(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            if (z6) {
                InterfaceC7785 interfaceC7785 = this.f37322;
                int composingSpanStart = BaseInputConnection.getComposingSpanStart(interfaceC7785);
                int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(interfaceC7785);
                if (composingSpanEnd < composingSpanStart) {
                    i = composingSpanStart;
                    composingSpanStart = composingSpanEnd;
                } else {
                    i = composingSpanEnd;
                }
                if (composingSpanStart >= 0 && composingSpanStart < i) {
                    builder.setComposingText(composingSpanStart, interfaceC7785.subSequence(composingSpanStart, i));
                    int i4 = composingSpanStart;
                    while (i4 < i) {
                        this.f37258.mo8157(rectF2, i4);
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
            if (z7 && iM30444 >= 0) {
                this.f37258.mo8157(rectF2, iM30444);
                rectF2.offset(paddingLeft, paddingTop);
                boolean zIntersects = RectF.intersects(rectF3, rectF2);
                if (!rectF3.contains(rectF2)) {
                    r1 = zIntersects;
                    r1 = (zIntersects ? 1 : 0) | 2;
                }
                r1 = zIntersects;
                float f = rectF2.left;
                float f2 = rectF2.top;
                builder.setInsertionMarkerLocation(f, f2, this.f37245.m24501() + f2, rectF2.bottom, r1 == true ? 1 : 0);
            }
        }
        this.f37274.updateCursorAnchorInfo(this, builder.build());
        this.f37269 &= -2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30135(C12392 c12392, Runnable runnable) {
        if (c12392.m30370()) {
            if (c12392.isAttachedToWindow()) {
                C4925.m14309(100L, runnable);
                return;
            }
            return;
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger m30414() {
        return this.f37286;
    }

    /* JADX INFO: renamed from: ܳܽ, reason: not valid java name and contains not printable characters */
    public final boolean m30460() {
        return this.f37286.get() > 0;
    }

    /* JADX INFO: renamed from: ᩹ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30532() {
        return this.f37211;
    }

    /* JADX INFO: renamed from: ֫ᩳ, reason: not valid java name and contains not printable characters */
    public final void m30362() {
        if (this.f37211) {
            throw new IllegalStateException();
        }
        this.f37322.getClass();
        this.f37211 = true;
        this.f37173.m17856(this.f37322);
        this.f37235.m18571();
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void m30397() {
        if (!this.f37211) {
            throw new IllegalStateException();
        }
        this.f37211 = false;
        if (m30519()) {
            this.f37173.m17854(this.f37322);
            this.f37322.mo1602();
            C3926 c3926 = this.f37302;
            C11003.requireNonNull(c3926);
            C4925.m14315(new RunnableC11646(c3926));
            return;
        }
        if (this.f37235.m18575()) {
            this.f37235.m18579((InterfaceC20445) this.f37322);
        }
        this.f37173.m17854(this.f37322);
        this.f37322.mo1602();
        m30311(m30444(), m30448());
        m30405();
        this.f37221 = -1.0f;
    }

    @Override // l.InterfaceC16685
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20073(float f, float f2) {
        AbstractC3179 abstractC3179 = this.f37258;
        boolean z = abstractC3179.f10029;
        boolean z2 = abstractC3179.f10028;
        if (!z && !z2) {
            return false;
        }
        int[] iArr = this.f37249;
        getLocationOnScreen(iArr);
        float scrollX = ((f + getScrollX()) - getPaddingLeft()) - iArr[0];
        float fM9777 = this.f37258.m9777(f2 - iArr[1]);
        if (z && this.f37258.f9999.m35177(scrollX, fM9777)) {
            return true;
        }
        return z2 && this.f37258.f9997.m35177(scrollX, fM9777);
    }

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final C13802 m30468() {
        return this.f37297;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30334(C13802 c13802) {
        this.f37297 = c13802;
    }
}
