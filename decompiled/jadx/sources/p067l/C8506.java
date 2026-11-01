package p067l;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p058y.C0240c;
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
public final class C8506 {

    /* JADX INFO: renamed from: ۖ */
    public static final ScheduledExecutorService f22827;

    /* JADX INFO: renamed from: ۘ */
    public static final ThreadPoolExecutor f22828;

    /* JADX INFO: renamed from: ᩴ */
    public static final AtomicInteger f22829 = new AtomicInteger();

    /* JADX INFO: renamed from: ֫ */
    public boolean f22830;

    /* JADX INFO: renamed from: ۜ */
    public final WeakReference f22831;

    /* JADX INFO: renamed from: ۡ */
    public ScheduledFuture f22832;

    /* JADX INFO: renamed from: ۢ */
    public Future f22833;

    /* JADX INFO: renamed from: ۧ */
    public boolean f22834;

    /* JADX INFO: renamed from: ܳ */
    public InterfaceC21800 f22835;

    /* JADX INFO: renamed from: ܺ */
    public final ThreadPoolExecutor f22836;

    /* JADX INFO: renamed from: ܽ */
    public ScheduledFuture f22837;

    /* JADX INFO: renamed from: ܿ */
    public final Object f22838;

    /* JADX INFO: renamed from: ᩳ */
    public volatile int f22839;

    /* JADX INFO: renamed from: ᩷ */
    public volatile C15881 f22840;

    /* JADX INFO: renamed from: ᩻ */
    public C13259 f22841;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(64), new ThreadFactoryC13358());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f22828 = threadPoolExecutor;
        f22827 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC12017());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17893 m19797(Context context, int i, int i2) {
        String string;
        C15881 c15881 = this.f22840;
        int iM25817 = c15881.f45981.m25817();
        switch (C12530.f35157[c15881.f45980.ordinal()]) {
            case 1:
            case 2:
                string = "…";
                break;
            case 3:
                string = iM25817 != 0 ? context.getString(R.string.MT_Protector, Integer.valueOf(iM25817)) : context.getString(R.string.MT_Protector);
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
        boolean z = c15881.f45980 == EnumC24599.SEARCHING || c15881.f45980 == EnumC24599.IDLE;
        if (string != null) {
            return new C17893(string, iM25817, !z, z);
        }
        int iM25819 = c15881.f45981.m25819(i, i2);
        StringBuilder sb = new StringBuilder();
        sb.append(iM25817);
        sb.append(c15881.f45980 == EnumC24599.LIMIT_REACHED ? BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX : "");
        String string2 = sb.toString();
        if (iM25819 != -1) {
            string2 = iM25819 + "/" + string2;
        }
        return new C17893(string2, iM25817, iM25817 == 0 && c15881.f45980 == EnumC24599.COMPLETE, false);
    }

    public C8506(C14146 c14146) {
        ThreadPoolExecutor threadPoolExecutor = f22828;
        this.f22838 = new Object();
        this.f22840 = C15881.m36010(null, 0, 0);
        this.f22831 = new WeakReference(c14146);
        C12826.requireNonNull(threadPoolExecutor);
        this.f22836 = threadPoolExecutor;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ Thread m19781(Runnable runnable) {
        Thread thread = new Thread(runnable, "Search-Highlight-Worker-" + f22829.incrementAndGet());
        thread.setDaemon(true);
        return thread;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19800(InterfaceC9768 interfaceC9768, C13259 c13259) {
        C12826.requireNonNull(interfaceC9768, TextBundle.TEXT_ENTRY);
        synchronized (this.f22838) {
            m19796();
            this.f22841 = c13259;
            this.f22835 = interfaceC9768;
            this.f22840 = C15881.m36010(interfaceC9768, interfaceC9768.mo28581(), interfaceC9768.length());
            if (!this.f22830 && !this.f22834) {
                m19795(interfaceC9768);
            }
        }
        m19794();
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m19804() {
        return this.f22840.f45981.m25817() != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19799(Canvas canvas, int i, int i2, float f, float f2, C3831 c3831, C23929 c23929, InterfaceC12786 interfaceC12786) {
        int iM25824;
        C11189 c11189 = this.f22840.f45981;
        if (c11189.m25817() == 0 || i == i2) {
            return;
        }
        float fM48686 = 0.0f;
        int iM25822 = c11189.m25822(i);
        int i3 = i;
        while (iM25822 < c11189.m25817() && (iM25824 = c11189.m25824(iM25822)) < i2) {
            int iMax = Math.max(i, iM25824);
            int iMin = Math.min(i2, c11189.m25818(iM25822));
            if (i3 < iMax) {
                fM48686 += ((C21484) interfaceC12786).m48686(i3, fM48686, iMax);
            }
            float f3 = fM48686;
            float fM48687 = f3 + ((C21484) interfaceC12786).m48686(iMax, f3, iMin);
            int i4 = c23929.f75985;
            if (i4 == 0) {
                c3831.setColor(c23929.f75967);
                canvas.drawRect(f3, f, fM48687, f2, c3831);
            } else {
                c3831.setColor(i4);
                canvas.drawRect(f3, f, fM48687, f2, c3831);
                c3831.setColor(c23929.f75967);
                float fM29939 = C13076.m29939(1.0f);
                canvas.drawRect(f3 + fM29939, f + fM29939, fM48687 - fM29939, f2 - fM29939, c3831);
            }
            iM25822++;
            i3 = iMin;
            fM48686 = fM48687;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19798() {
        synchronized (this.f22838) {
            m19796();
            this.f22841 = null;
            InterfaceC21800 interfaceC21800 = this.f22835;
            int length = 0;
            int iMo28581 = interfaceC21800 == null ? 0 : interfaceC21800.mo28581();
            if (interfaceC21800 != null) {
                length = interfaceC21800.length();
            }
            this.f22840 = C15881.m36010(interfaceC21800, iMo28581, length);
        }
        m19794();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m19805() {
        m19798();
        synchronized (this.f22838) {
            this.f22840 = new C15881(this.f22840.f45979, this.f22840.f45978, this.f22840.f45981, EnumC24599.INVALID_PATTERN, 0);
        }
        m19794();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19802(InterfaceC21800 interfaceC21800, int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return;
        }
        synchronized (this.f22838) {
            if (this.f22841 == null) {
                return;
            }
            m19796();
            this.f22835 = interfaceC21800;
            if (!this.f22830 && !this.f22834) {
                int iMo28581 = interfaceC21800.mo28581();
                int length = interfaceC21800.length();
                long j = (((long) length) - ((long) i3)) + ((long) i2);
                C15881 c15881 = this.f22840;
                if (j >= 0 && j <= 2147483647L && c15881.f45979 == interfaceC21800 && c15881.f45978 + 1 == iMo28581 && c15881.f45981.m25821() == ((int) j)) {
                    c15881.f45981.m25820(i, i2, i3);
                    this.f22840 = new C15881(interfaceC21800, iMo28581, c15881.f45981, c15881.f45980, 0);
                } else {
                    this.f22840 = C15881.m36010(interfaceC21800, iMo28581, length);
                }
                m19795(interfaceC21800);
                m19794();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m19803(InterfaceC21800 interfaceC21800) {
        boolean z;
        synchronized (this.f22838) {
            m19796();
            z = true;
            this.f22830 = true;
            this.f22835 = interfaceC21800;
            if (this.f22840.f45981.m25817() == 0) {
                z = false;
            }
            this.f22840 = C15881.m36010(interfaceC21800, interfaceC21800.mo28581(), interfaceC21800.length());
        }
        if (z) {
            m19794();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19801(InterfaceC21800 interfaceC21800) {
        synchronized (this.f22838) {
            m19796();
            this.f22830 = false;
            this.f22835 = interfaceC21800;
            this.f22840 = C15881.m36010(interfaceC21800, interfaceC21800.mo28581(), interfaceC21800.length());
            if (this.f22841 != null && !this.f22834) {
                m19795(interfaceC21800);
            }
        }
        m19794();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m19807(InterfaceC21800 interfaceC21800) {
        synchronized (this.f22838) {
            m19796();
            this.f22835 = interfaceC21800;
            this.f22834 = true;
            this.f22840 = C15881.m36010(interfaceC21800, interfaceC21800.mo28581(), interfaceC21800.length());
        }
        m19794();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m19806(InterfaceC21800 interfaceC21800) {
        synchronized (this.f22838) {
            if (this.f22835 != interfaceC21800) {
                return;
            }
            m19796();
            this.f22834 = false;
            this.f22840 = C15881.m36010(interfaceC21800, interfaceC21800.mo28581(), interfaceC21800.length());
            if (this.f22841 != null && !this.f22830) {
                m19795(interfaceC21800);
            }
            m19794();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private void m19795(InterfaceC21800 interfaceC21800) {
        int i;
        int i2;
        int iMo28581 = interfaceC21800.mo28581();
        int length = interfaceC21800.length();
        C14146 c14146 = (C14146) this.f22831.get();
        C14698 c14698M32582 = c14146 != null ? c14146.m32582() : null;
        boolean z = c14698M32582 != null && (i = c14698M32582.f41923) >= 0 && i < (i2 = c14698M32582.f41922) && i2 <= length;
        int i3 = z ? c14698M32582.f41923 : -1;
        int i4 = z ? c14698M32582.f41922 : -1;
        int i5 = this.f22839 + 1;
        this.f22839 = i5;
        C18564 c18564 = new C18564(i5, this.f22841, interfaceC21800, iMo28581, length, i3, i4);
        this.f22840 = new C15881(this.f22835, iMo28581, this.f22840.f45981, EnumC24599.SEARCHING, 0);
        this.f22837 = f22827.schedule(new RunnableC10637(1, this, c18564), 100L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m19790(final C8506 c8506, final C18564 c18564) {
        synchronized (c8506.f22838) {
            if (c8506.m19793(c18564) && C18564.m42255(c18564)) {
                RejectedExecutionException e = null;
                c8506.f22837 = null;
                try {
                    final Future<?> futureSubmit = c8506.f22836.submit(new Runnable() { // from class: l.᩺۟ᩳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8506.m19784(this.f76473, c18564);
                        }
                    });
                    c8506.f22833 = futureSubmit;
                    c8506.f22832 = f22827.schedule(new Runnable() { // from class: l.ܰ۟ᩳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8506.m19785(this.f43908, c18564, futureSubmit);
                        }
                    }, 3500L, TimeUnit.MILLISECONDS);
                } catch (RejectedExecutionException e2) {
                    e = e2;
                }
                if (e != null) {
                    c8506.m19787(c18564, e);
                    return;
                }
                return;
            }
            c8506.m19791(c18564);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[LOOP:0: B:89:0x0069->B:100:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00c0 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:6:0x001c, B:11:0x002c, B:13:0x0032, B:15:0x003c, B:18:0x0048, B:20:0x0059, B:21:0x0064, B:23:0x0069, B:24:0x006d, B:29:0x007a, B:32:0x0081, B:34:0x0087, B:65:0x00de, B:44:0x00a1, B:48:0x00af, B:50:0x00b3, B:51:0x00b6, B:52:0x00bb, B:55:0x00c0, B:57:0x00cb, B:35:0x008a, B:37:0x0090, B:38:0x0093, B:40:0x0099, B:41:0x009c, B:58:0x00ce, B:60:0x00d3, B:62:0x00d7, B:64:0x00db, B:72:0x00f8, B:73:0x00f9), top: B:86:0x001c, inners: #3, #5 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00cb A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public static void m19784(final C8506 c8506, final C18564 c18564) {
        EnumC24599 enumC24599;
        C21918 c21918 = new C21918();
        EnumC24599 enumC245910 = EnumC24599.IDLE;
        if (c8506.f22839 == c18564.f55406) {
            Runnable runnable = new Runnable() { // from class: l.۟۟ᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    C8506.m19792(this.f25409, c18564);
                }
            };
            try {
                C9729 c9729Mo28589 = c18564.f55408.mo28589();
                try {
                    c9729Mo28589.m22746(runnable);
                    if (!(c8506.f22839 == c18564.f55406) || !C18564.m42255(c18564) || c9729Mo28589.m22747() != c18564.f55407 || c9729Mo28589.length() != c18564.f55412) {
                        c8506.m19786(c18564);
                    } else {
                        C13929 c13929Matcher = c18564.f55409.matcher((CharSequence) c9729Mo28589);
                        c13929Matcher.m31664(runnable);
                        if (C18564.m42249(c18564)) {
                            c13929Matcher.m56472region(c18564.f55410, c18564.f55411);
                        }
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        int i = 0;
                        while (true) {
                            try {
                                try {
                                    boolean zFind = c13929Matcher.find();
                                    if ((c8506.f22839 == c18564.f55406) && C18564.m42255(c18564)) {
                                        if (c13929Matcher.m31668()) {
                                            enumC24599 = EnumC24599.TIMED_OUT;
                                        } else if (c13929Matcher.m31678()) {
                                            enumC24599 = EnumC24599.RESOURCE_LIMIT;
                                        } else {
                                            enumC24599 = c13929Matcher.m31673() ? EnumC24599.FAILED : EnumC24599.COMPLETE;
                                        }
                                        if (!zFind) {
                                            break;
                                        }
                                        int iStart = c13929Matcher.start();
                                        int iEnd = c13929Matcher.end();
                                        if (iStart != iEnd) {
                                            if (i == 9999) {
                                                if (enumC24599 != EnumC24599.COMPLETE) {
                                                    break;
                                                }
                                                enumC24599 = EnumC24599.LIMIT_REACHED;
                                                break;
                                            }
                                            c21918.m49455(iStart, iEnd);
                                            i++;
                                            if (enumC24599 == EnumC24599.COMPLETE) {
                                                break;
                                                break;
                                            } else if (SystemClock.uptimeMillis() - jUptimeMillis > C0240c.f1145a) {
                                                enumC24599 = EnumC24599.TIMED_OUT;
                                                break;
                                            }
                                        } else if (enumC24599 == EnumC24599.COMPLETE) {
                                            break;
                                        } else if (SystemClock.uptimeMillis() - jUptimeMillis > C0240c.f1145a) {
                                            enumC24599 = EnumC24599.TIMED_OUT;
                                            break;
                                        }
                                    }
                                    c8506.m19786(c18564);
                                } catch (RuntimeException e) {
                                    enumC24599 = e instanceof C6138 ? EnumC24599.RESOURCE_LIMIT : EnumC24599.FAILED;
                                }
                            } catch (CancellationException e2) {
                                throw e2;
                            }
                        }
                        C19235 c19235 = new C19235(c18564, c21918.m49454(c18564.f55412), enumC24599);
                        c9729Mo28589.close();
                        try {
                            c8506.m19789(c19235);
                            return;
                        } catch (RuntimeException e3) {
                            c8506.m19787(c18564, e3);
                            return;
                        }
                    }
                    c9729Mo28589.close();
                } catch (Throwable th) {
                    try {
                        c9729Mo28589.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (CancellationException unused) {
                c8506.m19786(c18564);
            } catch (RuntimeException e4) {
                c8506.m19787(c18564, e4);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m19785(C8506 c8506, C18564 c18564, Future future) {
        boolean z;
        synchronized (c8506.f22838) {
            if (!c8506.m19793(c18564) || future.isDone()) {
                z = false;
            } else {
                c8506.m19788(c18564, EnumC24599.TIMED_OUT);
                z = true;
                c8506.f22839++;
                c8506.f22833 = null;
                c8506.f22832 = null;
            }
        }
        if (z) {
            c8506.m19782(future);
            c8506.m19794();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m19789(final C19235 c19235) {
        synchronized (this.f22838) {
            if (m19793(c19235.f57490) && C18564.m42255(c19235.f57490)) {
                ScheduledFuture scheduledFuture = this.f22832;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.f22832 = null;
                }
                final C14146 c14146 = (C14146) this.f22831.get();
                if (c14146 == null || !c14146.post(new Runnable() { // from class: l.֫֫ܿ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8506.m19783(this.f8167, c14146, c19235);
                    }
                })) {
                    m19786(c19235.f57490);
                    return;
                }
                return;
            }
            m19791(c19235.f57490);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m19783(C8506 c8506, C14146 c14146, C19235 c19235) {
        synchronized (c8506.f22838) {
            C18564 c18564 = c19235.f57490;
            if (c8506.m19793(c18564) && C18564.m42255(c18564) && c14146.m32500() == c18564.f55408) {
                c8506.f22839++;
                c8506.f22833 = null;
                c8506.f22840 = new C15881(c18564.f55408, c18564.f55407, c19235.f57492, c19235.f57491, 0);
                c14146.m32487();
                c14146.invalidate();
                return;
            }
            c8506.m19791(c18564);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m19786(C18564 c18564) {
        synchronized (this.f22838) {
            m19791(c18564);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m19787(C18564 c18564, RuntimeException runtimeException) {
        synchronized (this.f22838) {
            if (m19793(c18564)) {
                Future future = this.f22833;
                if (future != null) {
                    m19782(future);
                }
                m19791(c18564);
                m19788(c18564, runtimeException instanceof C6138 ? EnumC24599.RESOURCE_LIMIT : EnumC24599.FAILED);
                m19794();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m19788(C18564 c18564, EnumC24599 enumC24599) {
        C15881 c15881 = this.f22840;
        if (c15881.f45979 == c18564.f55408 && c15881.f45978 == c18564.f55407) {
            this.f22840 = new C15881(c15881.f45979, c15881.f45978, c15881.f45981, enumC24599, 0);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m19782(Future future) {
        future.cancel(false);
        if (future instanceof Runnable) {
            this.f22836.remove((Runnable) future);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m19791(C18564 c18564) {
        if (m19793(c18564)) {
            m19788(c18564, EnumC24599.IDLE);
            this.f22839++;
            this.f22837 = null;
            this.f22833 = null;
            ScheduledFuture scheduledFuture = this.f22832;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.f22832 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m19792(C8506 c8506, C18564 c18564) {
        if (c8506.f22839 != c18564.f55406 || Thread.currentThread().isInterrupted()) {
            throw new CancellationException("Search highlight canceled");
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private boolean m19793(C18564 c18564) {
        return this.f22839 == c18564.f55406 && this.f22841 == c18564.f55409 && this.f22835 == c18564.f55408 && !this.f22830 && !this.f22834;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m19796() {
        this.f22839++;
        if (this.f22840.f45980 == EnumC24599.SEARCHING) {
            this.f22840 = new C15881(this.f22840.f45979, this.f22840.f45978, this.f22840.f45981, EnumC24599.IDLE, 0);
        }
        ScheduledFuture scheduledFuture = this.f22837;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f22837 = null;
        }
        Future future = this.f22833;
        if (future != null) {
            m19782(future);
            this.f22833 = null;
        }
        ScheduledFuture scheduledFuture2 = this.f22832;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            this.f22832 = null;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private void m19794() {
        final C14146 c14146 = (C14146) this.f22831.get();
        if (c14146 != null) {
            c14146.post(new Runnable() { // from class: l.ۛ۟ᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    C14146 c14147 = c14146;
                    c14147.m32487();
                    c14147.invalidate();
                }
            });
        }
    }
}
