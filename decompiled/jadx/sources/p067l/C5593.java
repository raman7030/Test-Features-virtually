package p067l;

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
public final class C5593 implements InterfaceC19004 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractC16321 f13546;

    /* JADX INFO: renamed from: ۜ */
    public ContentObserver f13547;

    /* JADX INFO: renamed from: ۧ */
    public final Context f13548;

    /* JADX INFO: renamed from: ܳ */
    public Handler f13549;

    /* JADX INFO: renamed from: ܽ */
    public ThreadPoolExecutor f13550;

    /* JADX INFO: renamed from: ܿ */
    public final Object f13551 = new Object();

    /* JADX INFO: renamed from: ᩳ */
    public final C21687 f13552;

    /* JADX INFO: renamed from: ᩷ */
    public final C1422 f13553;

    /* JADX INFO: renamed from: ᩻ */
    public ThreadPoolExecutor f13554;

    public C5593(Context context, C1422 c1422, C21687 c21687) {
        C1524.m35169(context, "Context cannot be null");
        this.f13548 = context.getApplicationContext();
        this.f13553 = c1422;
        this.f13552 = c21687;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12387(ThreadPoolExecutor threadPoolExecutor) {
        synchronized (this.f13551) {
            this.f13550 = threadPoolExecutor;
        }
    }

    @Override // p067l.InterfaceC19004
    /* JADX INFO: renamed from: ֫ */
    public final void mo10453(AbstractC16321 abstractC16321) {
        synchronized (this.f13551) {
            this.f13546 = abstractC16321;
        }
        m12388();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12388() {
        synchronized (this.f13551) {
            if (this.f13546 == null) {
                return;
            }
            if (this.f13550 == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC21647("emojiCompat"));
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                this.f13554 = threadPoolExecutor;
                this.f13550 = threadPoolExecutor;
            }
            this.f13550.execute(new Runnable() { // from class: l.ۙᩳ֫
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18036.m12386();
                }
            });
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private C1699 m12385() {
        try {
            C21687 c21687 = this.f13552;
            Context context = this.f13548;
            C1422 c1422 = this.f13553;
            c21687.getClass();
            C1734 c1734M54520 = C2014.m54520(context, c1422);
            if (c1734M54520.m44271() != 0) {
                throw new RuntimeException("fetchFonts failed (" + c1734M54520.m44271() + MotionUtils.EASING_TYPE_FORMAT_END);
            }
            C1699[] c1699ArrM44270 = c1734M54520.m44270();
            if (c1699ArrM44270 == null || c1699ArrM44270.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c1699ArrM44270[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m12384() {
        synchronized (this.f13551) {
            this.f13546 = null;
            ContentObserver contentObserver = this.f13547;
            if (contentObserver != null) {
                C21687 c21687 = this.f13552;
                Context context = this.f13548;
                c21687.getClass();
                context.getContentResolver().unregisterContentObserver(contentObserver);
                this.f13547 = null;
            }
            Handler handler = this.f13549;
            if (handler != null) {
                handler.removeCallbacks(null);
            }
            this.f13549 = null;
            ThreadPoolExecutor threadPoolExecutor = this.f13554;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.shutdown();
            }
            this.f13550 = null;
            this.f13554 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12386() {
        synchronized (this.f13551) {
            if (this.f13546 == null) {
                return;
            }
            try {
                C1699 c1699M12385 = m12385();
                int iM42812 = c1699M12385.m42812();
                if (iM42812 == 2) {
                    synchronized (this.f13551) {
                    }
                }
                if (iM42812 != 0) {
                    throw new RuntimeException("fetchFonts result is not OK. (" + iM42812 + MotionUtils.EASING_TYPE_FORMAT_END);
                }
                try {
                    int i = C1107.f19501;
                    Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                    C21687 c21687 = this.f13552;
                    Context context = this.f13548;
                    c21687.getClass();
                    Typeface typefaceM20366 = C1178.m20366(context, new C1699[]{c1699M12385}, 0);
                    MappedByteBuffer mappedByteBufferM4336 = C0863.m4336(this.f13548, c1699M12385.m42814());
                    if (mappedByteBufferM4336 == null || typefaceM20366 == null) {
                        throw new RuntimeException("Unable to open file.");
                    }
                    C24368 c24368M53718 = C24368.m53718(typefaceM20366, mappedByteBufferM4336);
                    Trace.endSection();
                    synchronized (this.f13551) {
                        AbstractC16321 abstractC16321 = this.f13546;
                        if (abstractC16321 != null) {
                            abstractC16321.mo30959(c24368M53718);
                        }
                    }
                    m12384();
                } catch (Throwable th) {
                    int i2 = C1107.f19501;
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                synchronized (this.f13551) {
                    AbstractC16321 abstractC16322 = this.f13546;
                    if (abstractC16322 != null) {
                        abstractC16322.mo30958(th2);
                    }
                    m12384();
                }
            }
        }
    }
}
