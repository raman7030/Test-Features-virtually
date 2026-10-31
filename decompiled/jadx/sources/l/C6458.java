package l;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.c;
import com.google.android.material.badge.BadgeDrawable;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ۜ֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4H6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6458 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final ScheduledExecutorService f19954;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f19955;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f19956 = new AtomicInteger();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f19957;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final WeakReference f19958;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f19959;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Future f19960;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f19961;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC20445 f19962;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ThreadPoolExecutor f19963;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f19964;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f19965;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile int f19966;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile C14218 f19967;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C11459 f19968;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(64), new ThreadFactoryC11563());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f19955 = threadPoolExecutor;
        f19954 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC10152());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16335 m17850(Context context, int i, int i2) {
        String string;
        C14218 c14218 = this.f19967;
        int iM23808 = c14218.f42891.m23808();
        switch (C10692.f32186[c14218.f42890.ordinal()]) {
            case 1:
            case 2:
                string = "…";
                break;
            case 3:
                string = iM23808 != 0 ? context.getString(R.string.MT_Protector, Integer.valueOf(iM23808)) : context.getString(R.string.MT_Protector);
                break;
            case 4:
                string = context.getString(R.string.MT_Protector);
                break;
            case 5:
                string = context.getString(R.string.MT_Protector);
                break;
            case 6:
                string = context.getString(R.string.MT_Protector);
                break;
            default:
                string = null;
                break;
        }
        boolean z = c14218.f42890 == EnumC23391.SEARCHING || c14218.f42890 == EnumC23391.IDLE;
        if (string != null) {
            return new C16335(string, iM23808, !z, z);
        }
        int iM23810 = c14218.f42891.m23810(i, i2);
        StringBuilder sb = new StringBuilder();
        sb.append(iM23808);
        sb.append(c14218.f42890 == EnumC23391.LIMIT_REACHED ? BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX : "");
        String string2 = sb.toString();
        if (iM23810 != -1) {
            string2 = iM23810 + "/" + string2;
        }
        return new C16335(string2, iM23808, iM23808 == 0 && c14218.f42890 == EnumC23391.COMPLETE, false);
    }

    public C6458(C12392 c12392) {
        ThreadPoolExecutor threadPoolExecutor = f19955;
        this.f19965 = new Object();
        this.f19967 = C14218.m33878(null, 0, 0);
        this.f19958 = new WeakReference(c12392);
        C11003.requireNonNull(threadPoolExecutor);
        this.f19963 = threadPoolExecutor;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Thread m17834(Runnable runnable) {
        Thread thread = new Thread(runnable, "Search-Highlight-Worker-" + f19956.incrementAndGet());
        thread.setDaemon(true);
        return thread;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17853(InterfaceC7785 interfaceC7785, C11459 c11459) {
        C11003.requireNonNull(interfaceC7785, TextBundle.TEXT_ENTRY);
        synchronized (this.f19965) {
            m17849();
            this.f19968 = c11459;
            this.f19962 = interfaceC7785;
            this.f19967 = C14218.m33878(interfaceC7785, interfaceC7785.mo26548(), interfaceC7785.length());
            if (!this.f19957 && !this.f19961) {
                m17848(interfaceC7785);
            }
        }
        m17847();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m17857() {
        return this.f19967.f42891.m23808() != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17852(Canvas canvas, int i, int i2, float f, float f2, C1539 c1539, C22686 c22686, InterfaceC10961 interfaceC10961) {
        int iM23815;
        C9281 c9281 = this.f19967.f42891;
        if (c9281.m23808() == 0 || i == i2) {
            return;
        }
        float fM46370 = 0.0f;
        int iM23813 = c9281.m23813(i);
        int i3 = i;
        while (iM23813 < c9281.m23808() && (iM23815 = c9281.m23815(iM23813)) < i2) {
            int iMax = Math.max(i, iM23815);
            int iMin = Math.min(i2, c9281.m23809(iM23813));
            if (i3 < iMax) {
                fM46370 += ((C20113) interfaceC10961).m46370(i3, fM46370, iMax);
            }
            float f3 = fM46370;
            float fM46371 = f3 + ((C20113) interfaceC10961).m46370(iMax, f3, iMin);
            int i4 = c22686.f73260;
            if (i4 == 0) {
                c1539.setColor(c22686.f73242);
                canvas.drawRect(f3, f, fM46371, f2, c1539);
            } else {
                c1539.setColor(i4);
                canvas.drawRect(f3, f, fM46371, f2, c1539);
                c1539.setColor(c22686.f73242);
                float fM27878 = C11266.m27878(1.0f);
                canvas.drawRect(f3 + fM27878, f + fM27878, fM46371 - fM27878, f2 - fM27878, c1539);
            }
            iM23813++;
            i3 = iMin;
            fM46370 = fM46371;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17851() {
        synchronized (this.f19965) {
            m17849();
            this.f19968 = null;
            InterfaceC20445 interfaceC20445 = this.f19962;
            int length = 0;
            int iMo26548 = interfaceC20445 == null ? 0 : interfaceC20445.mo26548();
            if (interfaceC20445 != null) {
                length = interfaceC20445.length();
            }
            this.f19967 = C14218.m33878(interfaceC20445, iMo26548, length);
        }
        m17847();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m17858() {
        m17851();
        synchronized (this.f19965) {
            this.f19967 = new C14218(this.f19967.f42889, this.f19967.f42888, this.f19967.f42891, EnumC23391.INVALID_PATTERN, 0);
        }
        m17847();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17855(InterfaceC20445 interfaceC20445, int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return;
        }
        synchronized (this.f19965) {
            if (this.f19968 == null) {
                return;
            }
            m17849();
            this.f19962 = interfaceC20445;
            if (!this.f19957 && !this.f19961) {
                int iMo26548 = interfaceC20445.mo26548();
                int length = interfaceC20445.length();
                long j = (((long) length) - ((long) i3)) + ((long) i2);
                C14218 c14218 = this.f19967;
                if (j >= 0 && j <= 2147483647L && c14218.f42889 == interfaceC20445 && c14218.f42888 + 1 == iMo26548 && c14218.f42891.m23812() == ((int) j)) {
                    c14218.f42891.m23811(i, i2, i3);
                    this.f19967 = new C14218(interfaceC20445, iMo26548, c14218.f42891, c14218.f42890, 0);
                } else {
                    this.f19967 = C14218.m33878(interfaceC20445, iMo26548, length);
                }
                m17848(interfaceC20445);
                m17847();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m17856(InterfaceC20445 interfaceC20445) {
        boolean z;
        synchronized (this.f19965) {
            m17849();
            z = true;
            this.f19957 = true;
            this.f19962 = interfaceC20445;
            if (this.f19967.f42891.m23808() == 0) {
                z = false;
            }
            this.f19967 = C14218.m33878(interfaceC20445, interfaceC20445.mo26548(), interfaceC20445.length());
        }
        if (z) {
            m17847();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17854(InterfaceC20445 interfaceC20445) {
        synchronized (this.f19965) {
            m17849();
            this.f19957 = false;
            this.f19962 = interfaceC20445;
            this.f19967 = C14218.m33878(interfaceC20445, interfaceC20445.mo26548(), interfaceC20445.length());
            if (this.f19968 != null && !this.f19961) {
                m17848(interfaceC20445);
            }
        }
        m17847();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m17860(InterfaceC20445 interfaceC20445) {
        synchronized (this.f19965) {
            m17849();
            this.f19962 = interfaceC20445;
            this.f19961 = true;
            this.f19967 = C14218.m33878(interfaceC20445, interfaceC20445.mo26548(), interfaceC20445.length());
        }
        m17847();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m17859(InterfaceC20445 interfaceC20445) {
        synchronized (this.f19965) {
            if (this.f19962 != interfaceC20445) {
                return;
            }
            m17849();
            this.f19961 = false;
            this.f19967 = C14218.m33878(interfaceC20445, interfaceC20445.mo26548(), interfaceC20445.length());
            if (this.f19968 != null && !this.f19957) {
                m17848(interfaceC20445);
            }
            m17847();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m17848(InterfaceC20445 interfaceC20445) {
        int i;
        int i2;
        int iMo26548 = interfaceC20445.mo26548();
        int length = interfaceC20445.length();
        C12392 c12392 = (C12392) this.f19958.get();
        C12973 c12973M30518 = c12392 != null ? c12392.m30518() : null;
        boolean z = c12973M30518 != null && (i = c12973M30518.f38879) >= 0 && i < (i2 = c12973M30518.f38878) && i2 <= length;
        int i3 = z ? c12973M30518.f38879 : -1;
        int i4 = z ? c12973M30518.f38878 : -1;
        int i5 = this.f19966 + 1;
        this.f19966 = i5;
        C17041 c17041 = new C17041(i5, this.f19968, interfaceC20445, iMo26548, length, i3, i4);
        this.f19967 = new C14218(this.f19962, iMo26548, this.f19967.f42891, EnumC23391.SEARCHING, 0);
        this.f19964 = f19954.schedule(new RunnableC8700(1, this, c17041), 100L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m17843(final C6458 c6458, final C17041 c17041) {
        synchronized (c6458.f19965) {
            if (c6458.m17846(c17041) && C17041.m40010(c17041)) {
                RejectedExecutionException e = null;
                c6458.f19964 = null;
                try {
                    final Future<?> futureSubmit = c6458.f19963.submit(new Runnable() { // from class: l.᩺۟ᩳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6458.m17837(this.f73742, c17041);
                        }
                    });
                    c6458.f19960 = futureSubmit;
                    c6458.f19959 = f19954.schedule(new Runnable() { // from class: l.ܰ۟ᩳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6458.m17838(this.f40828, c17041, futureSubmit);
                        }
                    }, 3500L, TimeUnit.MILLISECONDS);
                } catch (RejectedExecutionException e2) {
                    e = e2;
                }
                if (e != null) {
                    c6458.m17840(c17041, e);
                    return;
                }
                return;
            }
            c6458.m17844(c17041);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[LOOP:0: B:89:0x0069->B:100:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00c0 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:6:0x001c, B:11:0x002c, B:13:0x0032, B:15:0x003c, B:18:0x0048, B:20:0x0059, B:21:0x0064, B:23:0x0069, B:24:0x006d, B:29:0x007a, B:32:0x0081, B:34:0x0087, B:65:0x00de, B:44:0x00a1, B:48:0x00af, B:50:0x00b3, B:51:0x00b6, B:52:0x00bb, B:55:0x00c0, B:57:0x00cb, B:35:0x008a, B:37:0x0090, B:38:0x0093, B:40:0x0099, B:41:0x009c, B:58:0x00ce, B:60:0x00d3, B:62:0x00d7, B:64:0x00db, B:72:0x00f8, B:73:0x00f9), top: B:86:0x001c, inners: #3, #5 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00cb A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17837(final C6458 c6458, final C17041 c17041) {
        EnumC23391 enumC23391;
        C20570 c20570 = new C20570();
        EnumC23391 enumC23392 = EnumC23391.IDLE;
        if (c6458.f19966 == c17041.f52224) {
            Runnable runnable = new Runnable() { // from class: l.۟۟ᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    C6458.m17845(this.f22518, c17041);
                }
            };
            try {
                C7744 c7744Mo26556 = c17041.f52226.mo26556();
                try {
                    c7744Mo26556.m20766(runnable);
                    if (!(c6458.f19966 == c17041.f52224) || !C17041.m40010(c17041) || c7744Mo26556.m20767() != c17041.f52225 || c7744Mo26556.length() != c17041.f52230) {
                        c6458.m17839(c17041);
                    } else {
                        C12164 c12164Matcher = c17041.f52227.matcher((CharSequence) c7744Mo26556);
                        c12164Matcher.m29599(runnable);
                        if (C17041.m40004(c17041)) {
                            c12164Matcher.m29614region(c17041.f52228, c17041.f52229);
                        }
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        int i = 0;
                        while (true) {
                            try {
                                try {
                                    boolean zFind = c12164Matcher.find();
                                    if ((c6458.f19966 == c17041.f52224) && C17041.m40010(c17041)) {
                                        if (c12164Matcher.m29603()) {
                                            enumC23391 = EnumC23391.TIMED_OUT;
                                        } else if (c12164Matcher.m29613()) {
                                            enumC23391 = EnumC23391.RESOURCE_LIMIT;
                                        } else {
                                            enumC23391 = c12164Matcher.m29608() ? EnumC23391.FAILED : EnumC23391.COMPLETE;
                                        }
                                        if (!zFind) {
                                            break;
                                        }
                                        int iStart = c12164Matcher.start();
                                        int iEnd = c12164Matcher.end();
                                        if (iStart != iEnd) {
                                            if (i == 9999) {
                                                if (enumC23391 != EnumC23391.COMPLETE) {
                                                    break;
                                                }
                                                enumC23391 = EnumC23391.LIMIT_REACHED;
                                                break;
                                            }
                                            c20570.m47131(iStart, iEnd);
                                            i++;
                                            if (enumC23391 == EnumC23391.COMPLETE) {
                                                break;
                                                break;
                                            } else if (SystemClock.uptimeMillis() - jUptimeMillis > c.a) {
                                                enumC23391 = EnumC23391.TIMED_OUT;
                                                break;
                                            }
                                        } else if (enumC23391 == EnumC23391.COMPLETE) {
                                            break;
                                        } else if (SystemClock.uptimeMillis() - jUptimeMillis > c.a) {
                                            enumC23391 = EnumC23391.TIMED_OUT;
                                            break;
                                        }
                                    }
                                    c6458.m17839(c17041);
                                } catch (RuntimeException e) {
                                    enumC23391 = e instanceof C3966 ? EnumC23391.RESOURCE_LIMIT : EnumC23391.FAILED;
                                }
                            } catch (CancellationException e2) {
                                throw e2;
                            }
                        }
                        C17747 c17747 = new C17747(c17041, c20570.m47130(c17041.f52230), enumC23391);
                        c7744Mo26556.close();
                        try {
                            c6458.m17842(c17747);
                            return;
                        } catch (RuntimeException e3) {
                            c6458.m17840(c17041, e3);
                            return;
                        }
                    }
                    c7744Mo26556.close();
                } catch (Throwable th) {
                    try {
                        c7744Mo26556.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (CancellationException unused) {
                c6458.m17839(c17041);
            } catch (RuntimeException e4) {
                c6458.m17840(c17041, e4);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17838(C6458 c6458, C17041 c17041, Future future) {
        boolean z;
        synchronized (c6458.f19965) {
            if (!c6458.m17846(c17041) || future.isDone()) {
                z = false;
            } else {
                c6458.m17841(c17041, EnumC23391.TIMED_OUT);
                z = true;
                c6458.f19966++;
                c6458.f19960 = null;
                c6458.f19959 = null;
            }
        }
        if (z) {
            c6458.m17835(future);
            c6458.m17847();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17842(final C17747 c17747) {
        synchronized (this.f19965) {
            if (m17846(c17747.f54298) && C17041.m40010(c17747.f54298)) {
                ScheduledFuture scheduledFuture = this.f19959;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.f19959 = null;
                }
                final C12392 c12392 = (C12392) this.f19958.get();
                if (c12392 == null || !c12392.post(new Runnable() { // from class: l.֫֫ܿ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6458.m17836(this.f5386, c12392, c17747);
                    }
                })) {
                    m17839(c17747.f54298);
                    return;
                }
                return;
            }
            m17844(c17747.f54298);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17836(C6458 c6458, C12392 c12392, C17747 c17747) {
        synchronized (c6458.f19965) {
            C17041 c17041 = c17747.f54298;
            if (c6458.m17846(c17041) && C17041.m40010(c17041) && c12392.m30436() == c17041.f52226) {
                c6458.f19966++;
                c6458.f19960 = null;
                c6458.f19967 = new C14218(c17041.f52226, c17041.f52225, c17747.f54300, c17747.f54299, 0);
                c12392.m30423();
                c12392.invalidate();
                return;
            }
            c6458.m17844(c17041);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17839(C17041 c17041) {
        synchronized (this.f19965) {
            m17844(c17041);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17840(C17041 c17041, RuntimeException runtimeException) {
        synchronized (this.f19965) {
            if (m17846(c17041)) {
                Future future = this.f19960;
                if (future != null) {
                    m17835(future);
                }
                m17844(c17041);
                m17841(c17041, runtimeException instanceof C3966 ? EnumC23391.RESOURCE_LIMIT : EnumC23391.FAILED);
                m17847();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17841(C17041 c17041, EnumC23391 enumC23391) {
        C14218 c14218 = this.f19967;
        if (c14218.f42889 == c17041.f52226 && c14218.f42888 == c17041.f52225) {
            this.f19967 = new C14218(c14218.f42889, c14218.f42888, c14218.f42891, enumC23391, 0);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17835(Future future) {
        future.cancel(false);
        if (future instanceof Runnable) {
            this.f19963.remove((Runnable) future);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m17844(C17041 c17041) {
        if (m17846(c17041)) {
            m17841(c17041, EnumC23391.IDLE);
            this.f19966++;
            this.f19964 = null;
            this.f19960 = null;
            ScheduledFuture scheduledFuture = this.f19959;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.f19959 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m17845(C6458 c6458, C17041 c17041) {
        if (c6458.f19966 != c17041.f52224 || Thread.currentThread().isInterrupted()) {
            throw new CancellationException("Search highlight canceled");
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m17846(C17041 c17041) {
        return this.f19966 == c17041.f52224 && this.f19968 == c17041.f52227 && this.f19962 == c17041.f52226 && !this.f19957 && !this.f19961;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m17849() {
        this.f19966++;
        if (this.f19967.f42890 == EnumC23391.SEARCHING) {
            this.f19967 = new C14218(this.f19967.f42889, this.f19967.f42888, this.f19967.f42891, EnumC23391.IDLE, 0);
        }
        ScheduledFuture scheduledFuture = this.f19964;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f19964 = null;
        }
        Future future = this.f19960;
        if (future != null) {
            m17835(future);
            this.f19960 = null;
        }
        ScheduledFuture scheduledFuture2 = this.f19959;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            this.f19959 = null;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m17847() {
        final C12392 c12392 = (C12392) this.f19958.get();
        if (c12392 != null) {
            c12392.post(new Runnable() { // from class: l.ۛ۟ᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    C12392 c12393 = c12392;
                    c12393.m30423();
                    c12393.invalidate();
                }
            });
        }
    }
}
