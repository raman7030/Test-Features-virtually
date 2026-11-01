package p067l;

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
import bin.p000mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۜܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5GW */
/* JADX INFO: loaded from: classes2.dex */
public class C8838 extends View {

    /* JADX INFO: renamed from: ֫֫ */
    public long f23985;

    /* JADX INFO: renamed from: ۗ */
    public final C12862 f23986;

    /* JADX INFO: renamed from: ۙ */
    public final C12450 f23987;

    /* JADX INFO: renamed from: ۛ */
    public int f23988;

    /* JADX INFO: renamed from: ۜ֫ */
    public final int f23989;

    /* JADX INFO: renamed from: ۟ */
    public long f23990;

    /* JADX INFO: renamed from: ۡ֫ */
    public boolean f23991;

    /* JADX INFO: renamed from: ۢ֫ */
    public boolean f23992;

    /* JADX INFO: renamed from: ۤ */
    public HandlerC18896 f23993;

    /* JADX INFO: renamed from: ۧ֫ */
    public long f23994;

    /* JADX INFO: renamed from: ۨ */
    public final C6826 f23995;

    /* JADX INFO: renamed from: ۫ */
    public C0888 f23996;

    /* JADX INFO: renamed from: ۬ */
    public final C9688 f23997;

    /* JADX INFO: renamed from: ܰ */
    public C20063 f23998;

    /* JADX INFO: renamed from: ܳ֫ */
    public boolean f23999;

    /* JADX INFO: renamed from: ܽ֫ */
    public int f24000;

    /* JADX INFO: renamed from: ܿ֫ */
    public float f24001;

    /* JADX INFO: renamed from: ᩳ֫ */
    public float f24002;

    /* JADX INFO: renamed from: ᩶ */
    public int f24003;

    /* JADX INFO: renamed from: ᩷֫ */
    public long f24004;

    /* JADX INFO: renamed from: ᩸ */
    public C18225 f24005;

    /* JADX INFO: renamed from: ᩹ */
    public C16213 f24006;

    /* JADX INFO: renamed from: ᩺ */
    public ViewOnClickListenerC7497 f24007;

    /* JADX INFO: renamed from: ᩻֫ */
    public boolean f24008;

    /* JADX INFO: renamed from: ܺ */
    private synchronized boolean m20417() {
        return this.f24008 || this.f24005 != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C18225 m20421(Runnable runnable, Runnable runnable2) {
        if (!this.f24008 && this.f24005 == null) {
            C18225 c18225 = new C18225(this, runnable, runnable2);
            this.f24005 = c18225;
            return c18225;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m20431(boolean z) {
        this.f24008 = z;
    }

    /* JADX INFO: renamed from: ۢ */
    public final synchronized C16213 m20437() {
        if (this.f24006 != null) {
            return null;
        }
        C16213 c16213 = new C16213(this);
        this.f24006 = c16213;
        return c16213;
    }

    /* JADX INFO: renamed from: ܳ */
    public final synchronized boolean m20440() {
        return this.f24005 != null;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final synchronized boolean m20446() {
        return this.f24006 != null;
    }

    public C8838(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C8838(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23990 = SystemClock.uptimeMillis();
        this.f23994 = 0L;
        this.f23985 = 0L;
        setSaveEnabled(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f23993 = new HandlerC18896(this);
        this.f23998 = new C20063(context);
        this.f23996 = new C0888(context, new C19567(this, context));
        this.f23989 = ViewConfiguration.get(context).getScaledOverflingDistance();
        C12862 c12862 = new C12862(this);
        this.f23986 = c12862;
        this.f23987 = new C12450(this, c12862);
        this.f23995 = new C6826(this);
        C9688 c9688 = new C9688(this);
        c9688.m22595(3500);
        c9688.m22593(new C15795(this));
        this.f23997 = c9688;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20409(final C8838 c8838, MenuItem menuItem) {
        C12862 c12862 = c8838.f23986;
        try {
            int itemId = menuItem.getItemId();
            if ((itemId == R.string.MT_Protector || itemId == R.string.MT_Protector) && c8838.m20417()) {
                C22682.m50793(R.string.MT_Protector);
                return;
            }
            if (itemId == R.string.MT_Protector) {
                c12862.m29455((byte[]) null);
            } else if (itemId == R.string.MT_Protector) {
                c12862.m29467();
            } else if (itemId == 17039361) {
                if (c12862.m29469()) {
                    C22682.m50793(R.string.MT_Protector);
                } else {
                    C16213 c16213M20437 = c8838.m20437();
                    if (c16213M20437 == null) {
                        C22682.m50793(R.string.MT_Protector);
                    } else {
                        new C12687(new C18050(), c8838, c8838.getContext(), c16213M20437).m22250();
                    }
                }
            } else if (itemId == R.string.MT_Protector) {
                int i = C11780.f32909;
                final C19826 c19826M45073 = C19826.m45073(c8838);
                if (c19826M45073 != null) {
                    Context context = c8838.getContext();
                    int i2 = DialogInterfaceC2564.f4230;
                    C20671 c20671 = new C20671(context);
                    c20671.m46712(R.array.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۫ۨܿ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            C19826 c19826 = c19826M45073;
                            C8838 c8839 = this.f40183;
                            if (c19826.m45074(c8839)) {
                                C16213 c16213M20438 = c8839.m20437();
                                if (c16213M20438 == null) {
                                    C22682.m50793(R.string.MT_Protector);
                                    return;
                                }
                                if (!c19826.m45074(c8839)) {
                                    c16213M20438.close();
                                    return;
                                }
                                if (i3 < 5 && C11780.m27019(c19826.f60285, c19826.f60281, i3) > 524288) {
                                    c16213M20438.close();
                                    C22682.m50793(R.string.MT_Protector);
                                } else {
                                    Context context2 = c8839.getContext();
                                    new C13475(c19826, context2 instanceof AbstractActivityC5549 ? (AbstractActivityC5549) context2 : null, c16213M20438, c8839, i3, context2).m22250();
                                }
                            }
                        }
                    });
                    DialogInterfaceC2564 dialogInterfaceC2564M46709 = c20671.m46709();
                    dialogInterfaceC2564M46709.m3858().setDimAmount(0.0f);
                    dialogInterfaceC2564M46709.m3862();
                }
            } else if (itemId == R.string.MT_Protector) {
                C22586.m50624(c8838);
            } else if (itemId == 17039371) {
                C11346 c11346 = new C11346();
                final C10675 c10675 = new C10675(c8838);
                C18225 c18225M20421 = c8838.m20421(new RunnableC18721(c11346), new Runnable() { // from class: l.ܳ۟ܿ
                    @Override // java.lang.Runnable
                    public final void run() {
                        c10675.m24576();
                    }
                });
                if (c18225M20421 == null) {
                    C22682.m50793(R.string.MT_Protector);
                } else {
                    new C22075(c10675, c8838, c11346, c18225M20421).m22250();
                }
            }
            c8838.invalidate();
        } catch (IOException e) {
            c8838.m20428(e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m20439(int i) {
        C12862 c12862 = this.f23986;
        c12862.m29454(i, true);
        m20413();
        m20432(c12862.m29480());
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m20444() {
        C16213 c16213;
        synchronized (this) {
            c16213 = this.f24006;
        }
        if (c16213 != null) {
            c16213.m36970();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m20442() {
        C18225 c18225;
        synchronized (this) {
            c18225 = this.f24005;
        }
        if (c18225 == null) {
            return false;
        }
        c18225.m41455();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m20433(Runnable runnable) {
        C18225 c18225;
        synchronized (this) {
            c18225 = this.f24005;
        }
        if (c18225 == null) {
            return false;
        }
        c18225.m41452(runnable);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20411(C8838 c8838, C18225 c18225) {
        synchronized (c8838) {
            if (c8838.f24005 == c18225) {
                c8838.f24005 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20410(C8838 c8838, C16213 c16213) {
        synchronized (c8838) {
            if (c8838.f24006 == c16213) {
                c8838.f24006 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m20434(byte[] bArr) {
        if (m20417()) {
            return false;
        }
        try {
            this.f23986.m29455(bArr);
            invalidate();
            return true;
        } catch (IOException e) {
            m20428(e);
            return false;
        } catch (C9174 unused) {
            C22682.m50793(R.string.MT_Protector);
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19644 m20422(C19644 c19644) {
        ViewOnClickListenerC7497 viewOnClickListenerC7497;
        HandlerC18896 handlerC18896 = this.f23993;
        handlerC18896.removeMessages(2);
        handlerC18896.removeMessages(3);
        this.f23997.m22588();
        m20444();
        C20063 c20063 = this.f23998;
        if (!c20063.m45432()) {
            c20063.m45427();
        }
        boolean z = this.f23992;
        this.f23992 = false;
        this.f23991 = false;
        this.f23985 = 0L;
        handlerC18896.f56413 = false;
        C19644 c19644M29452 = this.f23986.m29452(c19644);
        this.f24004 = 0L;
        this.f23999 = false;
        if (z && (viewOnClickListenerC7497 = this.f24007) != null) {
            viewOnClickListenerC7497.m17299(false);
        }
        invalidate();
        return c19644M29452;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX INFO: renamed from: ֫ */
    public final void m20425(int i, int i2) {
        C6826 c6826;
        C12862 c12862 = this.f23986;
        c12862.m29471(i, i2);
        invalidate();
        int iM29480 = c12862.m29480();
        int iM29466 = c12862.m29466();
        if (getHeight() == 0 || (c6826 = this.f23995) == null) {
            return;
        }
        long jM15637 = c6826.m15637();
        long j = this.f24004;
        int iM29475 = iM29480 / c12862.m29475();
        long jM15633 = c6826.m15633(iM29475);
        if (j <= jM15633) {
            jM15633 = c6826.m15624(iM29475);
            if (j >= jM15633) {
                jM15633 = j;
            }
        }
        if (jM15633 > jM15637) {
            jM15633 = jM15637;
        }
        int iM29476 = iM29466 / c12862.m29475();
        if (iM29475 != iM29476) {
            long jM15634 = c6826.m15633(iM29476);
            if (j <= jM15634) {
                jM15634 = c6826.m15624(iM29476);
                if (j >= jM15634) {
                    jM15634 = j;
                }
            }
            if (jM15634 <= jM15637) {
                jM15637 = jM15634;
            }
            if (j == jM15633 && j != jM15637) {
                jM15633 = jM15637;
            } else if (j == jM15633 || j != jM15637) {
                if (j == jM15633) {
                    jM15633 = j;
                } else if (j > jM15633 && j > jM15637) {
                    jM15633 = Math.min(jM15633, jM15637);
                } else if (j >= jM15633 || j >= jM15637) {
                    jM15633 = j;
                } else {
                    jM15633 = Math.max(jM15633, jM15637);
                }
            }
        }
        if (j != jM15633) {
            C20063 c20063 = this.f23998;
            if (!c20063.m45432()) {
                c20063.m45427();
            }
            c20063.m45428(j, jM15633 - j);
            invalidate();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m20441(int i) {
        if (m20417()) {
            return;
        }
        C12862 c12862 = this.f23986;
        if (c12862.m29468()) {
            return;
        }
        try {
            c12862.m29453(i);
            m20413();
            invalidate();
            m20432(c12862.m29480());
        } catch (IOException e) {
            m20428(e);
        } catch (C9174 unused) {
            C22682.m50793(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final long m20443() {
        return this.f24004;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20427(long j) {
        this.f24004 = j;
        invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C6826 c6826 = this.f23995;
        boolean zM15640 = c6826.m15640();
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = this.f23988;
        int iM15623 = 0;
        C12450 c12450 = this.f23987;
        boolean z2 = (i5 == i6 || c12450.f34816 == 0) ? false : true;
        C12862 c12862 = this.f23986;
        if (z2) {
            iM15623 = c6826.m15623(0.0f, this.f24004 + ((long) c6826.m15641()), false);
            this.f23988 = i5;
            if (getResources().getConfiguration().orientation == 1) {
                c12862.m29470(8);
            } else {
                c12862.m29470(16);
            }
            c12450.m28667(i5);
        } else {
            c12450.m28668(i5);
        }
        if (zM15640) {
            if (m20432(c12862.m29480())) {
                return;
            }
            long jM15637 = c6826.m15637();
            if (this.f24004 > jM15637) {
                m20427(jM15637);
                return;
            }
            return;
        }
        if (!z2) {
            long jM15638 = c6826.m15637();
            if (this.f24004 > jM15638) {
                m20427(jM15638);
                return;
            }
            return;
        }
        long jMin = Math.min(c6826.m15633(iM15623 / c12862.m29475()), c6826.m15637());
        C20063 c20063 = this.f23998;
        if (!c20063.m45432()) {
            c20063.m45427();
        }
        long j = this.f24004;
        c20063.m45428(j, jMin - j);
        invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m20432(int i) {
        C6826 c6826;
        if (getHeight() == 0 || (c6826 = this.f23995) == null) {
            return false;
        }
        int iM29475 = i / this.f23986.m29475();
        long jM15633 = c6826.m15633(iM29475);
        long jM15637 = c6826.m15637();
        long j = this.f24004;
        if (j <= jM15633) {
            jM15633 = c6826.m15624(iM29475);
            if (j >= jM15633) {
                jM15633 = j;
            }
        }
        if (jM15633 <= jM15637) {
            jM15637 = jM15633;
        }
        if (j == jM15637) {
            return false;
        }
        C20063 c20063 = this.f23998;
        if (!c20063.m45432()) {
            c20063.m45427();
        }
        c20063.m45428(j, jM15637 - j);
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
        ViewOnClickListenerC7497 viewOnClickListenerC7497;
        if (this.f23991) {
            z = true;
            z2 = true;
        } else {
            z = isFocused() && (SystemClock.uptimeMillis() - this.f23990) % 1000 < 500;
            z2 = isFocused() && SystemClock.uptimeMillis() - this.f23994 < 3500;
        }
        if (this.f23992) {
            f = 1.0f;
        } else {
            int iUptimeMillis = (int) (SystemClock.uptimeMillis() - this.f23985);
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
            this.f23995.m15626(canvas, z, z2, f, this.f23992);
            this.f23999 = false;
        } catch (IOException e) {
            canvas.drawColor(this.f23987.f34829);
            if (this.f23999 || (viewOnClickListenerC7497 = this.f24007) == null) {
                return;
            }
            this.f23999 = true;
            viewOnClickListenerC7497.m17295(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20412(C8838 c8838, boolean z) {
        if (z) {
            HandlerC18896 handlerC18896 = c8838.f23993;
            handlerC18896.removeMessages(2);
            handlerC18896.sendEmptyMessageDelayed(2, 250L);
            return;
        }
        c8838.m20408(-1, false);
    }

    /* JADX INFO: renamed from: ܳ */
    public static void m20416(C8838 c8838) {
        c8838.m20408(-1, false);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00e7  */
    /* JADX INFO: renamed from: ֫ */
    private void m20408(int i, boolean z) {
        int iM29466;
        boolean z2;
        boolean z3 = true;
        HandlerC18896 handlerC18896 = this.f23993;
        if (handlerC18896 != null) {
            handlerC18896.removeMessages(1);
        }
        C9688 c9688 = this.f23997;
        c9688.m22597();
        C12862 c12862 = this.f23986;
        if (c12862.m29468()) {
            c9688.m22590(R.string.MT_Protector);
            c9688.m22590(android.R.string.copy);
            c9688.m22590(R.string.MT_Protector);
            if (!m20417()) {
                c9688.m22590(R.string.MT_Protector);
                c9688.m22590(R.string.MT_Protector);
            }
        } else {
            c9688.m22590(R.string.MT_Protector);
        }
        if (!m20417() && C12862.m29444()) {
            c9688.m22590(android.R.string.paste);
        }
        C13357 c13357 = new C13357();
        C6826 c6826 = this.f23995;
        if (i != -1) {
            iM29466 = i;
            z2 = true;
        } else {
            if (c6826.m15627(c13357)) {
                c13357.f37500 = ((c13357.f37499 + c13357.f37500) / 2) + 1;
                i = -2;
            } else {
                i = c12862.m29480();
                iM29466 = c12862.m29466();
                c6826.m15625(i, c13357, false);
                long j = c13357.f37501;
                long j2 = this.f24004;
                if (j - j2 < 0 || c13357.f37498 - j2 > getHeight()) {
                    if (i != iM29466) {
                        c6826.m15625(iM29466, c13357, true);
                        long j3 = c13357.f37501;
                        long j4 = this.f24004;
                        if (j3 - j4 >= 0 && c13357.f37498 - j4 <= getHeight()) {
                            z2 = false;
                        }
                    }
                    i = -1;
                }
            }
            iM29466 = i;
            z2 = true;
        }
        if (iM29466 == -1) {
            c9688.m22591(getWidth() / 2, (c9688.m22594() + getHeight()) / 2);
            return;
        }
        if (iM29466 >= 0) {
            c6826.m15625(iM29466, c13357, z);
        }
        C12450 c12450 = this.f23987;
        if (z2) {
            if (c13357.f37501 - this.f24004 < c9688.m22594()) {
                z3 = false;
            } else {
                z3 = z2;
            }
        } else if ((c13357.f37498 - this.f24004) + ((long) c9688.m22594()) + ((long) c12450.f34809.getIntrinsicHeight()) <= getHeight()) {
            z3 = z2;
        }
        if (z3) {
            int i2 = c13357.f37500;
            long j5 = c13357.f37501 - this.f24004;
            int i3 = (int) j5;
            if (j5 != i3) {
                throw new ArithmeticException();
            }
            c9688.m22591(i2, i3);
            return;
        }
        int i4 = c13357.f37500;
        long jM22594 = (c13357.f37498 - this.f24004) + ((long) c9688.m22594()) + ((long) c12450.f34809.getIntrinsicHeight());
        int i5 = (int) jM22594;
        if (jM22594 != i5) {
            throw new ArithmeticException();
        }
        c9688.m22591(i4, i5);
    }

    @Override // android.view.View
    public final void computeScroll() {
        C20063 c20063 = this.f23998;
        if (c20063.m45430()) {
            m20414();
            m20427(c20063.m45431());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ */
    public void m20413() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.f23990 = jUptimeMillis;
        this.f23994 = jUptimeMillis;
        this.f23993.m42999();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ */
    public void m20414() {
        this.f23985 = SystemClock.uptimeMillis();
        HandlerC18896 handlerC18896 = this.f23993;
        handlerC18896.removeMessages(3);
        handlerC18896.sendEmptyMessageDelayed(3, 1500L);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23993.m42998();
        m20442();
        m20444();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            m20413();
        } else {
            this.f23993.m42998();
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
        C12450 c12450 = this.f23987;
        C12862 c12862 = this.f23986;
        C6826 c6826 = this.f23995;
        if (action == 0) {
            this.f23997.m22588();
            C20063 c20063 = this.f23998;
            if (!c20063.m45432()) {
                c20063.m45427();
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (c6826.m15629()) {
                if (c12862.m29468()) {
                    RectF rectFM15638 = c6826.m15638();
                    if (rectFM15638.contains(x, y)) {
                        float f = rectFM15638.left;
                        this.f24002 = ((((rectFM15638.right - f) * 3.0f) / 4.0f) + f) - x;
                        this.f24001 = (rectFM15638.top - y) - (c12450.f34816 / 2.0f);
                        this.f23991 = true;
                        this.f24003 = c12862.m29466();
                        return true;
                    }
                    RectF rectFM15635 = c6826.m15635();
                    if (rectFM15635.contains(x, y)) {
                        float f2 = rectFM15635.left;
                        this.f24002 = (((rectFM15635.right - f2) / 4.0f) + f2) - x;
                        this.f24001 = (rectFM15635.top - y) - (c12450.f34816 / 2.0f);
                        this.f23991 = true;
                        this.f24003 = c12862.m29480();
                        return true;
                    }
                } else {
                    RectF rectFM15639 = c6826.m15639();
                    if (rectFM15639.contains(x, y)) {
                        this.f24002 = ((rectFM15639.left + rectFM15639.right) / 2.0f) - x;
                        this.f24001 = (rectFM15639.top - y) - (c12450.f34816 / 2.0f);
                        this.f23991 = true;
                        return true;
                    }
                }
            }
            if (c6826.m15631()) {
                C16427 c16427M15634 = c6826.m15634();
                if (c16427M15634.m37324(x, y)) {
                    this.f23992 = true;
                    this.f24001 = (c16427M15634.f48280 - y) - c6826.m15641();
                    invalidate();
                    ViewOnClickListenerC7497 viewOnClickListenerC7497 = this.f24007;
                    if (viewOnClickListenerC7497 != null) {
                        viewOnClickListenerC7497.m17299(true);
                    }
                    return true;
                }
            }
            this.f23996.m5650(motionEvent);
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
                if (this.f23991) {
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    int iM15623 = c6826.m15623(x2 + this.f24002, this.f24004 + ((long) ((int) (this.f24001 + y2))), true);
                    if (c12862.m29468()) {
                        c12862.m29471(iM15623, this.f24003);
                        this.f24000 = iM15623;
                    } else {
                        c12862.m29454(iM15623, c6826.m15628());
                    }
                    float fM15630 = c6826.m15630() - this.f24001;
                    if (y2 < fM15630) {
                        long j = (long) ((this.f24004 - fM15630) + y2);
                        if (j < 0) {
                            j = 0;
                        }
                        m20427(j);
                        return true;
                    }
                    float fM15622 = c6826.m15622();
                    if (y2 > fM15622) {
                        m20427(Math.min((long) ((this.f24004 - fM15622) + y2), c6826.m15637()));
                        return true;
                    }
                    invalidate();
                    return true;
                }
                if (this.f23992) {
                    double y3 = (motionEvent.getY() + this.f24001) / ((getHeight() - c6826.m15641()) - c12450.f34814);
                    double d = 0.0d;
                    if (y3 < 0.0d) {
                        y3 = d;
                    } else {
                        d = 1.0d;
                        if (y3 > 1.0d) {
                            y3 = d;
                        }
                    }
                    m20427((long) (c6826.m15637() * y3));
                    return true;
                }
            }
            this.f23996.m5650(motionEvent);
            return true;
        }
        if (this.f23991) {
            m20413();
            this.f23991 = false;
            if (action != 3 && c12862.m29468()) {
                int i = this.f24000;
                m20408(i, i > this.f24003);
                return true;
            }
        } else {
            if (this.f23992) {
                m20414();
                this.f23992 = false;
                invalidate();
                ViewOnClickListenerC7497 viewOnClickListenerC7498 = this.f24007;
                if (viewOnClickListenerC7498 != null) {
                    viewOnClickListenerC7498.m17299(false);
                    return true;
                }
            }
            this.f23996.m5650(motionEvent);
            return true;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m20435() {
        this.f23986.m29463();
        this.f23999 = false;
        invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20429(ViewOnClickListenerC7497 viewOnClickListenerC7497) {
        this.f24007 = viewOnClickListenerC7497;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20426(int i, int i2, boolean z) {
        this.f23990 = SystemClock.uptimeMillis();
        ViewOnClickListenerC7497 viewOnClickListenerC7497 = this.f24007;
        if (viewOnClickListenerC7497 != null) {
            viewOnClickListenerC7497.m17294(i, i2, this.f23986.m29477(), z);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m20438() {
        ViewOnClickListenerC7497 viewOnClickListenerC7497 = this.f24007;
        if (viewOnClickListenerC7497 != null) {
            viewOnClickListenerC7497.m17307();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20424() {
        ViewOnClickListenerC7497 viewOnClickListenerC7497 = this.f24007;
        if (viewOnClickListenerC7497 != null) {
            C12862 c12862 = this.f23986;
            viewOnClickListenerC7497.m17300(c12862.m29472(), c12862.m29456(), c12862.m29476().m44655());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20428(IOException iOException) {
        ViewOnClickListenerC7497 viewOnClickListenerC7497 = this.f24007;
        if (viewOnClickListenerC7497 != null) {
            viewOnClickListenerC7497.m17295(iOException);
        }
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m20436() {
        if (m20417()) {
            return;
        }
        C12862 c12862 = this.f23986;
        c12862.m29465();
        invalidate();
        m20432(c12862.m29480());
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m20445() {
        if (m20417()) {
            return;
        }
        C12862 c12862 = this.f23986;
        c12862.m29479();
        invalidate();
        m20432(c12862.m29480());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24931 m20423(C6747 c6747) {
        if (c6747 != null) {
            return new C24931(c6747.m15407(), c6747.m15409(), 0, this.f24004, c6747.m15408(), c6747.m15406());
        }
        long j = this.f24004;
        C12862 c12862 = this.f23986;
        return new C24931(c12862.m29480(), c12862.m29466(), 0, j, c12862.m29474(), c12862.m29468());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20430(C24931 c24931) {
        C12826.requireNonNull(c24931, "state");
        boolean z = c24931.f79620;
        boolean z2 = c24931.f79618;
        C12862 c12862 = this.f23986;
        int iM29477 = c12862.m29477();
        int i = c24931.f79622;
        int i2 = c24931.f79621;
        if (iM29477 >= 0) {
            long j = c24931.f79619;
            if (j >= 0) {
                if (z2) {
                    if (iM29477 == 0 || i2 < 0 || i < i2 || i >= iM29477) {
                        throw new IllegalArgumentException("Invalid range selection");
                    }
                } else if (i2 < 0 || i2 != i || i2 > iM29477 || (i2 == iM29477 && !z)) {
                    throw new IllegalArgumentException("Invalid cursor selection");
                }
                this.f24004 = Math.min(j, this.f23995.m15637());
                if (z2) {
                    c12862.m29471(i2, i);
                } else {
                    c12862.m29454(i2, z);
                }
                invalidate();
                return;
            }
        }
        throw new IllegalArgumentException("Negative UI state value");
    }
}
