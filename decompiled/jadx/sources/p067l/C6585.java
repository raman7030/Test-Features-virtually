package p067l;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.ۙۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B75R */
/* JADX INFO: loaded from: classes2.dex */
public final class C6585 {

    /* JADX INFO: renamed from: ֫ */
    public final Executor f16999;

    /* JADX INFO: renamed from: ۜ */
    public final C21545 f17000;

    /* JADX INFO: renamed from: ۧ */
    public final Object f17001;

    /* JADX INFO: renamed from: ܳ */
    public C21338 f17002;

    /* JADX INFO: renamed from: ܽ */
    public final ArrayDeque f17003;

    /* JADX INFO: renamed from: ܿ */
    public C21338 f17004;

    /* JADX INFO: renamed from: ᩳ */
    public C21338 f17005;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f17006;

    public C6585() {
        ExecutorService executorService = C4081.f8987;
        C21545 c21545 = new C21545();
        this.f17001 = new Object();
        this.f17003 = new ArrayDeque();
        this.f16999 = executorService;
        this.f17000 = c21545;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15068(C17194 c17194, int i, C18122 c18122) {
        InterfaceC9501 interfaceC9501;
        synchronized (this.f17001) {
            C21338 c21338 = this.f17002;
            interfaceC9501 = null;
            if (c21338 == null || c21338.f67284 != i || !C12826.equals(c21338.f67281, c17194.m38925())) {
                if (c21338 != null) {
                    boolean z = true;
                    c21338.f67272 = true;
                    c21338.f67282++;
                    InterfaceC9501 interfaceC9502 = c21338.f67271;
                    if (interfaceC9502 == null) {
                        z = false;
                    }
                    c21338.f67271 = null;
                    if (c21338 != this.f17005 && (c21338 == this.f17004 || c21338.f67273 != null || z || !c21338.f67279.isEmpty())) {
                        this.f17003.addLast(c21338);
                    }
                    interfaceC9501 = interfaceC9502;
                }
                this.f17002 = new C21338(c17194, i, c18122);
                if (!this.f17006) {
                    m15058();
                }
            } else {
                c21338.f67280 = c17194;
                c21338.f67277 = c18122;
            }
        }
        if (interfaceC9501 != null) {
            this.f16999.execute(new RunnableC19997(interfaceC9501));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15066(int i, int i2) {
        synchronized (this.f17001) {
            C21338 c21338 = this.f17002;
            if (c21338 == null) {
                return;
            }
            c21338.f67275 = new C22679(c21338.f67280, c21338.f67282, c21338.f67277, Math.max(1, i), Math.max(1, i2));
            if (!this.f17006) {
                m15058();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15065() {
        InterfaceC9501 interfaceC9501;
        synchronized (this.f17001) {
            C21338 c21338 = this.f17002;
            interfaceC9501 = null;
            if (c21338 != null) {
                c21338.f67275 = null;
                c21338.f67282++;
                InterfaceC9501 interfaceC9502 = c21338.f67271;
                c21338.f67271 = null;
                interfaceC9501 = interfaceC9502;
            }
        }
        if (interfaceC9501 != null) {
            this.f16999.execute(new RunnableC19997(interfaceC9501));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15067(Runnable runnable) {
        synchronized (this.f17001) {
            C21338 c21338 = this.f17002;
            if (c21338 == null) {
                this.f16999.execute(runnable);
                return;
            }
            c21338.f67272 = true;
            c21338.f67279.addLast(runnable);
            c21338.f67275 = null;
            c21338.f67282++;
            InterfaceC9501 interfaceC9501 = c21338.f67271;
            c21338.f67271 = null;
            if (!this.f17006) {
                m15058();
            }
            if (interfaceC9501 != null) {
                this.f16999.execute(new RunnableC19997(interfaceC9501));
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m15058() {
        final C21338 c21338 = (C21338) this.f17003.pollFirst();
        Executor executor = this.f16999;
        if (c21338 != null) {
            this.f17006 = true;
            this.f17004 = c21338;
            this.f17005 = c21338;
            executor.execute(new Runnable() { // from class: l.ܺۚۜ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51639.m15064(c21338);
                }
            });
            return;
        }
        final C21338 c21339 = this.f17002;
        if (c21339 == null) {
            return;
        }
        if (c21339.f67272) {
            this.f17006 = true;
            this.f17004 = c21339;
            this.f17005 = c21339;
            executor.execute(new Runnable() { // from class: l.ۖۚۜ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10245.m15064(c21339);
                }
            });
            return;
        }
        final C22679 c22679 = c21339.f67275;
        if (c22679 == null) {
            return;
        }
        c21339.f67275 = null;
        this.f17006 = true;
        this.f17004 = c21339;
        this.f17005 = null;
        executor.execute(new Runnable() { // from class: l.ۘۚۜ
            @Override // java.lang.Runnable
            public final void run() {
                C6585.m15050(this.f14602, c21339, c22679);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m15050(final C6585 c6585, final C21338 c21338, final C22679 c22679) {
        C2561 c2561M15057 = C2561.f4224;
        try {
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    c2561M15057 = c6585.m15057(c21338, c22679);
                }
            } catch (Throwable th) {
                c6585.m15056(c21338, c22679);
                throw th;
            }
        } catch (Throwable unused) {
            m15060(c21338);
        }
        c6585.m15056(c21338, c22679);
        final Bitmap bitmapM3777 = c2561M15057.m3777();
        final C15243 c15243M3776 = c2561M15057.m3776();
        C7050.m16212(new Runnable() { // from class: l.᩵ۚۜ
            @Override // java.lang.Runnable
            public final void run() {
                C6585.m15051(this.f63849, c21338, c22679, bitmapM3777, c15243M3776);
            }
        });
        c6585.m15063(c21338);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m15051(C6585 c6585, C21338 c21338, C22679 c22679, Bitmap bitmap, C15243 c15243) {
        synchronized (c6585.f17001) {
            if (c6585.f17002 == c21338 && c21338.f67282 == c22679.m50771() && !c21338.f67272) {
                c22679.m50768().mo8094(c21338.f67284, bitmap);
                if (c15243 != null) {
                    c22679.m50768().mo8095(c21338.f67284, c15243);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m15056(C21338 c21338, C22679 c22679) {
        synchronized (this.f17001) {
            if (c21338.f67282 == c22679.m50771()) {
                return;
            }
            m15060(c21338);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private C2561 m15057(C21338 c21338, C22679 c22679) throws IOException {
        MediaMetadataRetriever mediaMetadataRetriever;
        C17194 c17194 = (C17194) c22679.m50770();
        C18655 c18655 = null;
        C15243 c15243M8323 = null;
        c18655 = null;
        if (c17194.m38924() == EnumC21890.MPEG_TS) {
            C2561 c2561 = c21338.f67274;
            if (c2561 != null && c21338.f67276 == c22679.m50772() && c21338.f67283 == c22679.m50769()) {
                return c2561;
            }
            InterfaceC9501 interfaceC9501M38927 = ((C17194) c22679.m50770()).m38927();
            C9938 c9938 = new C9938();
            try {
                C3232 c3232M15048 = m15048(c21338, c22679, interfaceC9501M38927, c9938);
                Throwable thM5583 = c3232M15048.m5583(c9938.m23237());
                if (thM5583 != null) {
                    m15062(thM5583);
                    throw null;
                }
                int iM50771 = c22679.m50771();
                synchronized (this.f17001) {
                    if (this.f17002 != c21338 || c21338.f67272 || c21338.f67282 != iM50771) {
                        throw new InterruptedIOException("HLS preview read was canceled");
                    }
                }
                if (c9938.m23237()) {
                    C2561 c2561M15047 = m15047(c21338, c22679, c9938, c3232M15048.f6260);
                    c9938.close();
                    return c2561M15047;
                }
                C2561 c2562 = C2561.f4224;
                c9938.close();
                return c2562;
            } catch (Throwable th) {
                try {
                    c9938.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        int iM50772 = c22679.m50771();
        if (c21338.f67278 == null) {
            try {
                C10609 c10609M38928 = c17194.m38928();
                try {
                    m15055(c21338, c10609M38928, iM50772);
                    c21338.f67278 = C2620.m3934(c10609M38928, c10609M38928.m24427());
                    c10609M38928.close();
                    m15054(c21338);
                } catch (Throwable th3) {
                    try {
                        c10609M38928.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (Throwable th5) {
                m15054(c21338);
                throw th5;
            }
        }
        C7315 c7315 = c21338.f67278;
        if (c7315 == null || c7315.m16886() == 0) {
            return C2561.f4224;
        }
        long jM16890 = c7315.m16890() + c17194.m38926();
        int iM16887 = c7315.m16887(jM16890);
        int iM50773 = c22679.m50771();
        C7315 c7316 = c21338.f67278;
        C12826.requireNonNull(c7316);
        long jM16888 = c7316.m16888(iM16887);
        C23349 c23349 = c21338.f67273;
        if (c23349 == null || c23349.f74442 != jM16888) {
            m15060(c21338);
            C10609 c10609M38929 = c17194.m38928();
            MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
            try {
                m15055(c21338, c10609M38929, iM50773);
                long jM24427 = c10609M38929.m24427();
                long jM16889 = c7316.m16889(iM16887);
                mediaMetadataRetriever = mediaMetadataRetriever2;
                try {
                    C18655 c18656 = new C18655(c10609M38929, jM24427, jM16888, jM16889);
                    try {
                        mediaMetadataRetriever.setDataSource(c18656);
                        C23349 c233410 = new C23349(jM16888, mediaMetadataRetriever, c18656, c10609M38929);
                        c21338.f67273 = c233410;
                        m15054(c21338);
                        c23349 = c233410;
                    } catch (Throwable th6) {
                        th = th6;
                        c18655 = c18656;
                        try {
                            mediaMetadataRetriever.release();
                        } catch (Throwable unused) {
                        }
                        try {
                            C2700.m4192(c18655);
                            if (c18655 == null) {
                                C2700.m4192(c10609M38929);
                            }
                            if (th instanceof IOException) {
                                throw th;
                            }
                            throw new IOException("Failed to open HLS preview fragment", th);
                        } catch (Throwable th7) {
                            m15054(c21338);
                            throw th7;
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
            } catch (Throwable th9) {
                th = th9;
                mediaMetadataRetriever = mediaMetadataRetriever2;
            }
        }
        int iM50774 = c22679.m50772();
        int iM50769 = c22679.m50769();
        int iM50775 = c22679.m50771();
        InterfaceC9501 interfaceC9501 = c23349.f74440;
        MediaMetadataRetriever mediaMetadataRetriever3 = c23349.f74441;
        m15055(c21338, interfaceC9501, iM50775);
        try {
            Bitmap bitmapM15044 = m15044(mediaMetadataRetriever3, jM16890, iM50774, iM50769);
            try {
                int i = Integer.parseInt(mediaMetadataRetriever3.extractMetadata(18));
                int i2 = Integer.parseInt(mediaMetadataRetriever3.extractMetadata(19));
                String strExtractMetadata = mediaMetadataRetriever3.extractMetadata(24);
                c15243M8323 = C4118.m8323(i, i2, strExtractMetadata == null ? 0 : Integer.parseInt(strExtractMetadata), 1.0f);
            } catch (RuntimeException unused2) {
            }
            return new C2561(bitmapM15044, c15243M8323);
        } finally {
            m15054(c21338);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C3232 m15048(C21338 c21338, C22679 c22679, InterfaceC9501 interfaceC9501, C9938 c9938) {
        C8339 c8339;
        C7256 c7256;
        C3232 c3232 = new C3232();
        C7256 c7257 = null;
        e = null;
        c7257 = null;
        try {
            try {
                m15055(c21338, interfaceC9501, c22679.m50771());
                if (((C19108) interfaceC9501).length() > 0) {
                    c8339 = new C8339(interfaceC9501);
                    try {
                        this.f17000.getClass();
                        c7256 = new C7256();
                    } catch (Throwable th) {
                        try {
                            c3232.f6262 = th;
                            c7256 = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    try {
                        if (c3232.f6262 == null) {
                            try {
                                c7256.m16613(c8339);
                            } catch (Throwable th3) {
                                e = th3;
                            }
                            try {
                                c8339.m19266();
                                IOException iOException = (IOException) m15046(e, IOException.class);
                                if (iOException != null) {
                                    e = iOException;
                                }
                            } catch (IOException e) {
                                e = e;
                            }
                            if (e != null) {
                                c3232.m5584(e);
                            } else {
                                int iM50771 = c22679.m50771();
                                synchronized (this.f17001) {
                                    if (this.f17002 != c21338 || c21338.f67272 || c21338.f67282 != iM50771) {
                                        throw new InterruptedIOException("HLS preview read was canceled");
                                    }
                                }
                                m15053(c7256, c8339, c9938, c3232, c22679.m50772(), c22679.m50769());
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        c7257 = c7256;
                        c3232.m5584(th);
                        c7256 = c7257;
                    }
                    m15052(c7256, c8339, interfaceC9501, c3232);
                    return c3232;
                }
                m15052((C7256) null, (C8339) null, interfaceC9501, c3232);
                m15054(c21338);
                return c3232;
            } catch (Throwable th5) {
                th = th5;
                c8339 = null;
            }
            c3232.m5584(th);
            c7256 = c7257;
            m15052(c7256, c8339, interfaceC9501, c3232);
            return c3232;
        } finally {
            m15052(c7257, c8339, interfaceC9501, c3232);
            m15054(c21338);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m15053(C7256 c7256, C8339 c8339, C9938 c9938, C3232 c3232, int i, int i2) {
        IOException e;
        Bitmap bitmapM16611;
        try {
            bitmapM16611 = c7256.m16611(i, i2);
            e = null;
        } catch (Throwable th) {
            e = th;
            bitmapM16611 = null;
        }
        if (bitmapM16611 != null) {
            c9938.m23236(bitmapM16611);
        }
        try {
            c8339.m19266();
            IOException iOException = (IOException) m15046(e, IOException.class);
            if (iOException != null) {
                e = iOException;
            }
        } catch (IOException e2) {
            e = e2;
        }
        if (e != null) {
            c3232.m5584(e);
            return;
        }
        if (c9938.m23237()) {
            int i3 = Integer.parseInt(c7256.m16612(18));
            int i4 = Integer.parseInt(c7256.m16612(19));
            String strM16612 = c7256.m16612(24);
            c3232.f6260 = C4118.m8323(i3, i4, strM16612 == null ? 0 : Integer.parseInt(strM16612), 1.0f);
            e = null;
            try {
                c8339.m19266();
                IOException iOException2 = (IOException) m15046(e, IOException.class);
                if (iOException2 != null) {
                    e = iOException2;
                }
            } catch (IOException e3) {
                e = e3;
            }
            if (e == null) {
                return;
            }
            if (m15046(e, InterruptedIOException.class) != null || m15046(e, C5776.class) != null || m15046(e, Error.class) != null) {
                c3232.m5584(e);
            } else {
                c3232.f6260 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m15052(C7256 c7256, C8339 c8339, InterfaceC9501 interfaceC9501, C3232 c3232) {
        ArrayList arrayList = c3232.f6261;
        if (c7256 != null) {
            try {
                c7256.close();
            } catch (Throwable th) {
                arrayList.add(th);
            }
        }
        if (c8339 != null) {
            try {
                c8339.close();
                return;
            } catch (Throwable th2) {
                arrayList.add(th2);
                return;
            }
        }
        try {
            ((C19108) interfaceC9501).close();
        } catch (Throwable th3) {
            arrayList.add(th3);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m15055(C21338 c21338, InterfaceC9501 interfaceC9501, int i) {
        synchronized (this.f17001) {
            if (this.f17002 != c21338 || c21338.f67272 || c21338.f67282 != i) {
                throw new InterruptedIOException("HLS preview read was canceled");
            }
            c21338.f67271 = interfaceC9501;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m15054(C21338 c21338) {
        synchronized (this.f17001) {
            c21338.f67271 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ */
    public void m15064(C21338 c21338) {
        ArrayList arrayList;
        m15060(c21338);
        synchronized (this.f17001) {
            arrayList = new ArrayList(c21338.f67279);
            c21338.f67279.clear();
            if (this.f17002 == c21338) {
                this.f17002 = null;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException unused) {
            }
        }
        m15063(c21338);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m15063(C21338 c21338) {
        synchronized (this.f17001) {
            if (this.f17004 == c21338) {
                this.f17004 = null;
            }
            if (this.f17005 == c21338) {
                this.f17005 = null;
            }
            this.f17006 = false;
            m15058();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m15060(C21338 c21338) {
        C23349 c23349 = c21338.f67273;
        c21338.f67273 = null;
        if (c23349 != null) {
            try {
                c23349.f74441.release();
            } catch (Throwable unused) {
            }
            C2700.m4192(c23349.f74439);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Bitmap m15044(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 27) {
            return mediaMetadataRetriever.getScaledFrameAtTime(j, 2, i, i2);
        }
        return m15043(mediaMetadataRetriever.getFrameAtTime(j, 2), i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Bitmap m15043(Bitmap bitmap, int i, int i2) {
        if (bitmap == null || (bitmap.getWidth() <= i && bitmap.getHeight() <= i2)) {
            return bitmap;
        }
        float fMin = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        try {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.max(1, Math.round(bitmap.getWidth() * fMin)), Math.max(1, Math.round(bitmap.getHeight() * fMin)), true);
            if (bitmapCreateScaledBitmap != bitmap) {
                bitmap.recycle();
            }
            return bitmapCreateScaledBitmap;
        } catch (Throwable th) {
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C2561 m15047(C21338 c21338, C22679 c22679, C9938 c9938, C15243 c15243) {
        C2561 c2561;
        synchronized (this.f17001) {
            int iM50771 = c22679.m50771();
            if (this.f17002 == c21338 && !c21338.f67272 && c21338.f67282 == iM50771) {
                c2561 = new C2561(c9938.take(), c15243);
                c21338.f67274 = c2561;
                c21338.f67276 = c22679.m50772();
                c21338.f67283 = c22679.m50769();
            } else {
                throw new InterruptedIOException("HLS preview read was canceled");
            }
        }
        return c2561;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m15061(Throwable th) {
        return (m15046(th, InterruptedIOException.class) == null && m15046(th, C5776.class) == null) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Throwable m15046(Throwable th, Class cls) {
        while (th != null) {
            if (cls.isInstance(th)) {
                return (Throwable) cls.cast(th);
            }
            Throwable cause = th.getCause();
            if (cause == th) {
                return null;
            }
            th = cause;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m15062(Throwable th) throws IOException {
        Error error = (Error) m15046(th, Error.class);
        if (error != null) {
            throw error;
        }
        IOException iOException = (IOException) m15046(th, IOException.class);
        if (iOException != null) {
            throw iOException;
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        throw new IOException("Failed to load HLS MPEG-TS preview frame", th);
    }
}
