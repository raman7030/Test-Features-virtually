package l;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۜܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5GW */
/* JADX INFO: loaded from: classes2.dex */
public class C6807 extends View {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public long f21108;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C11041 f21109;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10607 f21110;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f21111;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final int f21112;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f21113;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public boolean f21114;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public boolean f21115;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public HandlerC17390 f21116;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public long f21117;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C4690 f21118;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C0923 f21119;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C7701 f21120;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C18618 f21121;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public boolean f21122;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public int f21123;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public float f21124;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public float f21125;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f21126;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public long f21127;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C16684 f21128;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C14567 f21129;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC5396 f21130;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public boolean f21131;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private synchronized boolean m18468() {
        return this.f21131 || this.f21128 != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C16684 m18472(Runnable runnable, Runnable runnable2) {
        if (!this.f21131 && this.f21128 == null) {
            C16684 c16684 = new C16684(this, runnable, runnable2);
            this.f21128 = c16684;
            return c16684;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m18482(boolean z) {
        this.f21131 = z;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final synchronized C14567 m18488() {
        if (this.f21129 != null) {
            return null;
        }
        C14567 c14567 = new C14567(this);
        this.f21129 = c14567;
        return c14567;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m18491() {
        return this.f21128 != null;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m18497() {
        return this.f21129 != null;
    }

    public C6807(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C6807(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21113 = SystemClock.uptimeMillis();
        this.f21117 = 0L;
        this.f21108 = 0L;
        setSaveEnabled(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f21116 = new HandlerC17390(this);
        this.f21121 = new C18618(context);
        this.f21119 = new C0923(context, new C18096(this, context));
        this.f21112 = ViewConfiguration.get(context).getScaledOverflingDistance();
        C11041 c11041 = new C11041(this);
        this.f21109 = c11041;
        this.f21110 = new C10607(this, c11041);
        this.f21118 = new C4690(this);
        C7701 c7701 = new C7701(this);
        c7701.m20615(3500);
        c7701.m20613(new C14127(this));
        this.f21120 = c7701;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18460(final C6807 c6807, MenuItem menuItem) {
        C11041 c11041 = c6807.f21109;
        try {
            int itemId = menuItem.getItemId();
            if ((itemId == R.string.MT_Protector || itemId == R.string.MT_Protector) && c6807.m18468()) {
                C21374.m48457(R.string.MT_Protector);
                return;
            }
            if (itemId == R.string.MT_Protector) {
                c11041.m27393((byte[]) null);
            } else if (itemId == R.string.MT_Protector) {
                c11041.m27405();
            } else if (itemId == 17039361) {
                if (c11041.m27407()) {
                    C21374.m48457(R.string.MT_Protector);
                } else {
                    C14567 c14567M18488 = c6807.m18488();
                    if (c14567M18488 == null) {
                        C21374.m48457(R.string.MT_Protector);
                    } else {
                        new C10857(new C16500(), c6807, c6807.getContext(), c14567M18488).m20274();
                    }
                }
            } else if (itemId == R.string.MT_Protector) {
                int i = C9902.f29951;
                final C18368 c18368M42801 = C18368.m42801(c6807);
                if (c18368M42801 != null) {
                    Context context = c6807.getContext();
                    int i2 = DialogInterfaceC0206.f1451;
                    C19258 c19258 = new C19258(context);
                    c19258.m44418(R.array.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۫ۨܿ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            C18368 c18368 = c18368M42801;
                            C6807 c6808 = this.f37166;
                            if (c18368.m42802(c6808)) {
                                C14567 c14567M18489 = c6808.m18488();
                                if (c14567M18489 == null) {
                                    C21374.m48457(R.string.MT_Protector);
                                    return;
                                }
                                if (!c18368.m42802(c6808)) {
                                    c14567M18489.close();
                                    return;
                                }
                                if (i3 < 5 && C9902.m25004(c18368.f57066, c18368.f57062, i3) > 524288) {
                                    c14567M18489.close();
                                    C21374.m48457(R.string.MT_Protector);
                                } else {
                                    Context context2 = c6808.getContext();
                                    new C11686(c18368, context2 instanceof AbstractActivityC3346 ? (AbstractActivityC3346) context2 : null, c14567M18489, c6808, i3, context2).m20274();
                                }
                            }
                        }
                    });
                    DialogInterfaceC0206 dialogInterfaceC0206M44415 = c19258.m44415();
                    dialogInterfaceC0206M44415.m1445().setDimAmount(0.0f);
                    dialogInterfaceC0206M44415.m1449();
                }
            } else if (itemId == R.string.MT_Protector) {
                C21273.m48293(c6807);
            } else if (itemId == 17039371) {
                C9446 c9446 = new C9446();
                final C8740 c8740 = new C8740(c6807);
                C16684 c16684M18472 = c6807.m18472(new RunnableC17206(c9446), new Runnable() { // from class: l.ܳ۟ܿ
                    @Override // java.lang.Runnable
                    public final void run() {
                        c8740.m22607();
                    }
                });
                if (c16684M18472 == null) {
                    C21374.m48457(R.string.MT_Protector);
                } else {
                    new C20735(c8740, c6807, c9446, c16684M18472).m20274();
                }
            }
            c6807.invalidate();
        } catch (IOException e) {
            c6807.m18479(e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18490(int i) {
        C11041 c11041 = this.f21109;
        c11041.m27392(i, true);
        m18464();
        m18483(c11041.m27418());
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m18495() {
        C14567 c14567;
        synchronized (this) {
            c14567 = this.f21129;
        }
        if (c14567 != null) {
            c14567.m34821();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m18493() {
        C16684 c16684;
        synchronized (this) {
            c16684 = this.f21128;
        }
        if (c16684 == null) {
            return false;
        }
        c16684.m39220();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m18484(Runnable runnable) {
        C16684 c16684;
        synchronized (this) {
            c16684 = this.f21128;
        }
        if (c16684 == null) {
            return false;
        }
        c16684.m39217(runnable);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18462(C6807 c6807, C16684 c16684) {
        synchronized (c6807) {
            if (c6807.f21128 == c16684) {
                c6807.f21128 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18461(C6807 c6807, C14567 c14567) {
        synchronized (c6807) {
            if (c6807.f21129 == c14567) {
                c6807.f21129 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m18485(byte[] bArr) {
        if (m18468()) {
            return false;
        }
        try {
            this.f21109.m27393(bArr);
            invalidate();
            return true;
        } catch (IOException e) {
            m18479(e);
            return false;
        } catch (C7161 unused) {
            C21374.m48457(R.string.MT_Protector);
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18177 m18473(C18177 c18177) {
        ViewOnClickListenerC5396 viewOnClickListenerC5396;
        HandlerC17390 handlerC17390 = this.f21116;
        handlerC17390.removeMessages(2);
        handlerC17390.removeMessages(3);
        this.f21120.m20608();
        m18495();
        C18618 c18618 = this.f21121;
        if (!c18618.m43167()) {
            c18618.m43162();
        }
        boolean z = this.f21115;
        this.f21115 = false;
        this.f21114 = false;
        this.f21108 = 0L;
        handlerC17390.f53228 = false;
        C18177 c18177M27390 = this.f21109.m27390(c18177);
        this.f21127 = 0L;
        this.f21122 = false;
        if (z && (viewOnClickListenerC5396 = this.f21130) != null) {
            viewOnClickListenerC5396.m15388(false);
        }
        invalidate();
        return c18177M27390;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18476(int i, int i2) {
        C4690 c4690;
        C11041 c11041 = this.f21109;
        c11041.m27409(i, i2);
        invalidate();
        int iM27418 = c11041.m27418();
        int iM27404 = c11041.m27404();
        if (getHeight() == 0 || (c4690 = this.f21118) == null) {
            return;
        }
        long jM13762 = c4690.m13762();
        long j = this.f21127;
        int iM27413 = iM27418 / c11041.m27413();
        long jM13758 = c4690.m13758(iM27413);
        if (j <= jM13758) {
            jM13758 = c4690.m13749(iM27413);
            if (j >= jM13758) {
                jM13758 = j;
            }
        }
        if (jM13758 > jM13762) {
            jM13758 = jM13762;
        }
        int iM27414 = iM27404 / c11041.m27413();
        if (iM27413 != iM27414) {
            long jM13759 = c4690.m13758(iM27414);
            if (j <= jM13759) {
                jM13759 = c4690.m13749(iM27414);
                if (j >= jM13759) {
                    jM13759 = j;
                }
            }
            if (jM13759 <= jM13762) {
                jM13762 = jM13759;
            }
            if (j == jM13758 && j != jM13762) {
                jM13758 = jM13762;
            } else if (j == jM13758 || j != jM13762) {
                if (j == jM13758) {
                    jM13758 = j;
                } else if (j > jM13758 && j > jM13762) {
                    jM13758 = Math.min(jM13758, jM13762);
                } else if (j >= jM13758 || j >= jM13762) {
                    jM13758 = j;
                } else {
                    jM13758 = Math.max(jM13758, jM13762);
                }
            }
        }
        if (j != jM13758) {
            C18618 c18618 = this.f21121;
            if (!c18618.m43167()) {
                c18618.m43162();
            }
            c18618.m43163(j, jM13758 - j);
            invalidate();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m18492(int i) {
        if (m18468()) {
            return;
        }
        C11041 c11041 = this.f21109;
        if (c11041.m27406()) {
            return;
        }
        try {
            c11041.m27391(i);
            m18464();
            invalidate();
            m18483(c11041.m27418());
        } catch (IOException e) {
            m18479(e);
        } catch (C7161 unused) {
            C21374.m48457(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long m18494() {
        return this.f21127;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18478(long j) {
        this.f21127 = j;
        invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C4690 c4690 = this.f21118;
        boolean zM13765 = c4690.m13765();
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = this.f21111;
        int iM13748 = 0;
        C10607 c10607 = this.f21110;
        boolean z2 = (i5 == i6 || c10607.f31845 == 0) ? false : true;
        C11041 c11041 = this.f21109;
        if (z2) {
            iM13748 = c4690.m13748(0.0f, this.f21127 + ((long) c4690.m13766()), false);
            this.f21111 = i5;
            if (getResources().getConfiguration().orientation == 1) {
                c11041.m27408(8);
            } else {
                c11041.m27408(16);
            }
            c10607.m26628(i5);
        } else {
            c10607.m26629(i5);
        }
        if (zM13765) {
            if (m18483(c11041.m27418())) {
                return;
            }
            long jM13762 = c4690.m13762();
            if (this.f21127 > jM13762) {
                m18478(jM13762);
                return;
            }
            return;
        }
        if (!z2) {
            long jM13763 = c4690.m13762();
            if (this.f21127 > jM13763) {
                m18478(jM13763);
                return;
            }
            return;
        }
        long jMin = Math.min(c4690.m13758(iM13748 / c11041.m27413()), c4690.m13762());
        C18618 c18618 = this.f21121;
        if (!c18618.m43167()) {
            c18618.m43162();
        }
        long j = this.f21127;
        c18618.m43163(j, jMin - j);
        invalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m18483(int i) {
        C4690 c4690;
        if (getHeight() == 0 || (c4690 = this.f21118) == null) {
            return false;
        }
        int iM27413 = i / this.f21109.m27413();
        long jM13758 = c4690.m13758(iM27413);
        long jM13762 = c4690.m13762();
        long j = this.f21127;
        if (j <= jM13758) {
            jM13758 = c4690.m13749(iM27413);
            if (j >= jM13758) {
                jM13758 = j;
            }
        }
        if (jM13758 <= jM13762) {
            jM13762 = jM13758;
        }
        if (j == jM13762) {
            return false;
        }
        C18618 c18618 = this.f21121;
        if (!c18618.m43167()) {
            c18618.m43162();
        }
        c18618.m43163(j, jM13762 - j);
        invalidate();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        float f;
        ViewOnClickListenerC5396 viewOnClickListenerC5396;
        if (this.f21114) {
            z = true;
            z2 = true;
        } else {
            z = isFocused() && (SystemClock.uptimeMillis() - this.f21113) % 1000 < 500;
            z2 = isFocused() && SystemClock.uptimeMillis() - this.f21117 < 3500;
        }
        if (this.f21115) {
            f = 1.0f;
        } else {
            int iUptimeMillis = (int) (SystemClock.uptimeMillis() - this.f21108);
            if (iUptimeMillis < 0) {
                f = 0.0f;
            } else if (iUptimeMillis <= 1500) {
                f = 1.0f;
            } else {
                int i = iUptimeMillis - 1500;
                if (i < 300) {
                    f = 1.0f - (i / 300.0f);
                } else {
                    f = 0.0f;
                }
            }
        }
        try {
            this.f21118.m13751(canvas, z, z2, f, this.f21115);
            this.f21122 = false;
        } catch (IOException e) {
            canvas.drawColor(this.f21110.f31858);
            if (this.f21122 || (viewOnClickListenerC5396 = this.f21130) == null) {
                return;
            }
            this.f21122 = true;
            viewOnClickListenerC5396.m15384(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18463(C6807 c6807, boolean z) {
        if (z) {
            HandlerC17390 handlerC17390 = c6807.f21116;
            handlerC17390.removeMessages(2);
            handlerC17390.sendEmptyMessageDelayed(2, 250L);
            return;
        }
        c6807.m18459(-1, false);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m18467(C6807 c6807) {
        c6807.m18459(-1, false);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00e7  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m18459(int i, boolean z) {
        int iM27404;
        boolean z2;
        boolean z3 = true;
        HandlerC17390 handlerC17390 = this.f21116;
        if (handlerC17390 != null) {
            handlerC17390.removeMessages(1);
        }
        C7701 c7701 = this.f21120;
        c7701.m20617();
        C11041 c11041 = this.f21109;
        if (c11041.m27406()) {
            c7701.m20610(R.string.MT_Protector);
            c7701.m20610(android.R.string.copy);
            c7701.m20610(R.string.MT_Protector);
            if (!m18468()) {
                c7701.m20610(R.string.MT_Protector);
                c7701.m20610(R.string.MT_Protector);
            }
        } else {
            c7701.m20610(R.string.MT_Protector);
        }
        if (!m18468() && C11041.m27382()) {
            c7701.m20610(android.R.string.paste);
        }
        C11562 c11562 = new C11562();
        C4690 c4690 = this.f21118;
        if (i != -1) {
            iM27404 = i;
            z2 = true;
        } else {
            if (c4690.m13752(c11562)) {
                c11562.f34504 = ((c11562.f34503 + c11562.f34504) / 2) + 1;
                i = -2;
            } else {
                i = c11041.m27418();
                iM27404 = c11041.m27404();
                c4690.m13750(i, c11562, false);
                long j = c11562.f34505;
                long j2 = this.f21127;
                if (j - j2 < 0 || c11562.f34502 - j2 > getHeight()) {
                    if (i != iM27404) {
                        c4690.m13750(iM27404, c11562, true);
                        long j3 = c11562.f34505;
                        long j4 = this.f21127;
                        if (j3 - j4 >= 0 && c11562.f34502 - j4 <= getHeight()) {
                            z2 = false;
                        }
                    }
                    i = -1;
                }
            }
            iM27404 = i;
            z2 = true;
        }
        if (iM27404 == -1) {
            c7701.m20611(getWidth() / 2, (c7701.m20614() + getHeight()) / 2);
            return;
        }
        if (iM27404 >= 0) {
            c4690.m13750(iM27404, c11562, z);
        }
        C10607 c10607 = this.f21110;
        if (z2) {
            if (c11562.f34505 - this.f21127 < c7701.m20614()) {
                z3 = false;
            } else {
                z3 = z2;
            }
        } else if ((c11562.f34502 - this.f21127) + ((long) c7701.m20614()) + ((long) c10607.f31838.getIntrinsicHeight()) <= getHeight()) {
            z3 = z2;
        }
        if (z3) {
            int i2 = c11562.f34504;
            long j5 = c11562.f34505 - this.f21127;
            int i3 = (int) j5;
            if (j5 != i3) {
                throw new ArithmeticException();
            }
            c7701.m20611(i2, i3);
            return;
        }
        int i4 = c11562.f34504;
        long jM20614 = (c11562.f34502 - this.f21127) + ((long) c7701.m20614()) + ((long) c10607.f31838.getIntrinsicHeight());
        int i5 = (int) jM20614;
        if (jM20614 != i5) {
            throw new ArithmeticException();
        }
        c7701.m20611(i4, i5);
    }

    @Override // android.view.View
    public final void computeScroll() {
        C18618 c18618 = this.f21121;
        if (c18618.m43165()) {
            m18465();
            m18478(c18618.m43166());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void m18464() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.f21113 = jUptimeMillis;
        this.f21117 = jUptimeMillis;
        this.f21116.m40745();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public void m18465() {
        this.f21108 = SystemClock.uptimeMillis();
        HandlerC17390 handlerC17390 = this.f21116;
        handlerC17390.removeMessages(3);
        handlerC17390.sendEmptyMessageDelayed(3, 1500L);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21116.m40744();
        m18493();
        m18495();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            m18464();
        } else {
            this.f21116.m40744();
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a9 A[PHI: r5
      0x00a9: PHI (r5v5 double) = (r5v3 double), (r5v4 double) binds: [B:36:0x00a7, B:39:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        if (r0 != 6) goto L87;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        C10607 c10607 = this.f21110;
        C11041 c11041 = this.f21109;
        C4690 c4690 = this.f21118;
        if (action == 0) {
            this.f21120.m20608();
            C18618 c18618 = this.f21121;
            if (!c18618.m43167()) {
                c18618.m43162();
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (c4690.m13754()) {
                if (c11041.m27406()) {
                    RectF rectFM13763 = c4690.m13763();
                    if (rectFM13763.contains(x, y)) {
                        float f = rectFM13763.left;
                        this.f21125 = ((((rectFM13763.right - f) * 3.0f) / 4.0f) + f) - x;
                        this.f21124 = (rectFM13763.top - y) - (c10607.f31845 / 2.0f);
                        this.f21114 = true;
                        this.f21126 = c11041.m27404();
                        return true;
                    }
                    RectF rectFM13760 = c4690.m13760();
                    if (rectFM13760.contains(x, y)) {
                        float f2 = rectFM13760.left;
                        this.f21125 = (((rectFM13760.right - f2) / 4.0f) + f2) - x;
                        this.f21124 = (rectFM13760.top - y) - (c10607.f31845 / 2.0f);
                        this.f21114 = true;
                        this.f21126 = c11041.m27418();
                        return true;
                    }
                } else {
                    RectF rectFM13764 = c4690.m13764();
                    if (rectFM13764.contains(x, y)) {
                        this.f21125 = ((rectFM13764.left + rectFM13764.right) / 2.0f) - x;
                        this.f21124 = (rectFM13764.top - y) - (c10607.f31845 / 2.0f);
                        this.f21114 = true;
                        return true;
                    }
                }
            }
            if (c4690.m13756()) {
                C14792 c14792M13759 = c4690.m13759();
                if (c14792M13759.m35177(x, y)) {
                    this.f21115 = true;
                    this.f21124 = (c14792M13759.f45166 - y) - c4690.m13766();
                    invalidate();
                    ViewOnClickListenerC5396 viewOnClickListenerC5396 = this.f21130;
                    if (viewOnClickListenerC5396 != null) {
                        viewOnClickListenerC5396.m15388(true);
                    }
                    return true;
                }
            }
            this.f21119.m3331(motionEvent);
            return true;
        }
        if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action != 5) {
                    }
                    return true;
                }
            } else {
                if (this.f21114) {
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    int iM13748 = c4690.m13748(x2 + this.f21125, this.f21127 + ((long) ((int) (this.f21124 + y2))), true);
                    if (c11041.m27406()) {
                        c11041.m27409(iM13748, this.f21126);
                        this.f21123 = iM13748;
                    } else {
                        c11041.m27392(iM13748, c4690.m13753());
                    }
                    float fM13755 = c4690.m13755() - this.f21124;
                    if (y2 < fM13755) {
                        long j = (long) ((this.f21127 - fM13755) + y2);
                        if (j < 0) {
                            j = 0;
                        }
                        m18478(j);
                        return true;
                    }
                    float fM13747 = c4690.m13747();
                    if (y2 > fM13747) {
                        m18478(Math.min((long) ((this.f21127 - fM13747) + y2), c4690.m13762()));
                        return true;
                    }
                    invalidate();
                    return true;
                }
                if (this.f21115) {
                    double y3 = (motionEvent.getY() + this.f21124) / ((getHeight() - c4690.m13766()) - c10607.f31843);
                    double d = 0.0d;
                    if (y3 < 0.0d) {
                        y3 = d;
                    } else {
                        d = 1.0d;
                        if (y3 > 1.0d) {
                            y3 = d;
                        }
                    }
                    m18478((long) (c4690.m13762() * y3));
                    return true;
                }
            }
            this.f21119.m3331(motionEvent);
            return true;
        }
        if (this.f21114) {
            m18464();
            this.f21114 = false;
            if (action != 3 && c11041.m27406()) {
                int i = this.f21123;
                m18459(i, i > this.f21126);
                return true;
            }
        } else {
            if (this.f21115) {
                m18465();
                this.f21115 = false;
                invalidate();
                ViewOnClickListenerC5396 viewOnClickListenerC5397 = this.f21130;
                if (viewOnClickListenerC5397 != null) {
                    viewOnClickListenerC5397.m15388(false);
                    return true;
                }
            }
            this.f21119.m3331(motionEvent);
            return true;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m18486() {
        this.f21109.m27401();
        this.f21122 = false;
        invalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18480(ViewOnClickListenerC5396 viewOnClickListenerC5396) {
        this.f21130 = viewOnClickListenerC5396;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18477(int i, int i2, boolean z) {
        this.f21113 = SystemClock.uptimeMillis();
        ViewOnClickListenerC5396 viewOnClickListenerC5396 = this.f21130;
        if (viewOnClickListenerC5396 != null) {
            viewOnClickListenerC5396.m15383(i, i2, this.f21109.m27415(), z);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18489() {
        ViewOnClickListenerC5396 viewOnClickListenerC5396 = this.f21130;
        if (viewOnClickListenerC5396 != null) {
            viewOnClickListenerC5396.m15396();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18475() {
        ViewOnClickListenerC5396 viewOnClickListenerC5396 = this.f21130;
        if (viewOnClickListenerC5396 != null) {
            C11041 c11041 = this.f21109;
            viewOnClickListenerC5396.m15389(c11041.m27410(), c11041.m27394(), c11041.m27414().m42394());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18479(IOException iOException) {
        ViewOnClickListenerC5396 viewOnClickListenerC5396 = this.f21130;
        if (viewOnClickListenerC5396 != null) {
            viewOnClickListenerC5396.m15384(iOException);
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m18487() {
        if (m18468()) {
            return;
        }
        C11041 c11041 = this.f21109;
        c11041.m27403();
        invalidate();
        m18483(c11041.m27418());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m18496() {
        if (m18468()) {
            return;
        }
        C11041 c11041 = this.f21109;
        c11041.m27417();
        invalidate();
        m18483(c11041.m27418());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23740 m18474(C4607 c4607) {
        if (c4607 != null) {
            return new C23740(c4607.m13518(), c4607.m13520(), 0, this.f21127, c4607.m13519(), c4607.m13517());
        }
        long j = this.f21127;
        C11041 c11041 = this.f21109;
        return new C23740(c11041.m27418(), c11041.m27404(), 0, j, c11041.m27412(), c11041.m27406());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18481(C23740 c23740) {
        C11003.requireNonNull(c23740, "state");
        boolean z = c23740.f76869;
        boolean z2 = c23740.f76867;
        C11041 c11041 = this.f21109;
        int iM27415 = c11041.m27415();
        int i = c23740.f76871;
        int i2 = c23740.f76870;
        if (iM27415 >= 0) {
            long j = c23740.f76868;
            if (j >= 0) {
                if (z2) {
                    if (iM27415 == 0 || i2 < 0 || i < i2 || i >= iM27415) {
                        throw new IllegalArgumentException("Invalid range selection");
                    }
                } else if (i2 < 0 || i2 != i || i2 > iM27415 || (i2 == iM27415 && !z)) {
                    throw new IllegalArgumentException("Invalid cursor selection");
                }
                this.f21127 = Math.min(j, this.f21118.m13762());
                if (z2) {
                    c11041.m27409(i2, i);
                } else {
                    c11041.m27392(i2, z);
                }
                invalidate();
                return;
            }
        }
        throw new IllegalArgumentException("Negative UI state value");
    }
}
