package l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Trace;
import com.google.android.material.motion.MotionUtils;
import java.nio.MappedByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۗᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: CB25 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3393 implements InterfaceC17504 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC14681 f10739;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ContentObserver f10740;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Context f10741;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Handler f10742;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ThreadPoolExecutor f10743;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f10744 = new Object();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C20327 f10745;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C11692 f10746;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public ThreadPoolExecutor f10747;

    public C3393(Context context, C11692 c11692, C20327 c20327) {
        C13746.m33055(context, "Context cannot be null");
        this.f10741 = context.getApplicationContext();
        this.f10746 = c11692;
        this.f10745 = c20327;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10348(ThreadPoolExecutor threadPoolExecutor) {
        synchronized (this.f10744) {
            this.f10743 = threadPoolExecutor;
        }
    }

    @Override // l.InterfaceC17504
    /* JADX INFO: renamed from: ֫ */
    public final void mo8407(AbstractC14681 abstractC14681) {
        synchronized (this.f10744) {
            this.f10739 = abstractC14681;
        }
        m10349();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10349() {
        synchronized (this.f10744) {
            if (this.f10739 == null) {
                return;
            }
            if (this.f10743 == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC20285("emojiCompat"));
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                this.f10747 = threadPoolExecutor;
                this.f10743 = threadPoolExecutor;
            }
            this.f10743.execute(new Runnable() { // from class: l.ۙᩳ֫
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15203.m10347();
                }
            });
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C17275 m10346() {
        try {
            C20327 c20327 = this.f10745;
            Context context = this.f10741;
            C11692 c11692 = this.f10746;
            c20327.getClass();
            C17981 c17981M52117 = C23625.m52117(context, c11692);
            if (c17981M52117.m42022() != 0) {
                throw new RuntimeException("fetchFonts failed (" + c17981M52117.m42022() + MotionUtils.EASING_TYPE_FORMAT_END);
            }
            C17275[] c17275ArrM42021 = c17981M52117.m42021();
            if (c17275ArrM42021 == null || c17275ArrM42021.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c17275ArrM42021[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m10345() {
        synchronized (this.f10744) {
            this.f10739 = null;
            ContentObserver contentObserver = this.f10740;
            if (contentObserver != null) {
                C20327 c20327 = this.f10745;
                Context context = this.f10741;
                c20327.getClass();
                context.getContentResolver().unregisterContentObserver(contentObserver);
                this.f10740 = null;
            }
            Handler handler = this.f10742;
            if (handler != null) {
                handler.removeCallbacks(null);
            }
            this.f10742 = null;
            ThreadPoolExecutor threadPoolExecutor = this.f10747;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.shutdown();
            }
            this.f10743 = null;
            this.f10747 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10347() {
        synchronized (this.f10744) {
            if (this.f10739 == null) {
                return;
            }
            try {
                C17275 c17275M10346 = m10346();
                int iM40563 = c17275M10346.m40563();
                if (iM40563 == 2) {
                    synchronized (this.f10744) {
                    }
                }
                if (iM40563 != 0) {
                    throw new RuntimeException("fetchFonts result is not OK. (" + iM40563 + MotionUtils.EASING_TYPE_FORMAT_END);
                }
                try {
                    int i = C5342.f16662;
                    Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                    C20327 c20327 = this.f10745;
                    Context context = this.f10741;
                    c20327.getClass();
                    Typeface typefaceM18418 = C6773.m18418(context, new C17275[]{c17275M10346}, 0);
                    MappedByteBuffer mappedByteBufferM1947 = C0422.m1947(this.f10741, c17275M10346.m40565());
                    if (mappedByteBufferM1947 == null || typefaceM18418 == null) {
                        throw new RuntimeException("Unable to open file.");
                    }
                    C23148 c23148M51323 = C23148.m51323(typefaceM18418, mappedByteBufferM1947);
                    Trace.endSection();
                    synchronized (this.f10744) {
                        AbstractC14681 abstractC14681 = this.f10739;
                        if (abstractC14681 != null) {
                            abstractC14681.mo28910(c23148M51323);
                        }
                    }
                    m10345();
                } catch (Throwable th) {
                    int i2 = C5342.f16662;
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                synchronized (this.f10744) {
                    AbstractC14681 abstractC14682 = this.f10739;
                    if (abstractC14682 != null) {
                        abstractC14682.mo28909(th2);
                    }
                    m10345();
                }
            }
        }
    }
}
