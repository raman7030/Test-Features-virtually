package l;

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
public final class C4437 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Executor f14174;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C20177 f14175;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f14176;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C19960 f14177;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f14178;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C19960 f14179;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C19960 f14180;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f14181;

    public C4437() {
        ExecutorService executorService = C1802.f6208;
        C20177 c20177 = new C20177();
        this.f14176 = new Object();
        this.f14178 = new ArrayDeque();
        this.f14174 = executorService;
        this.f14175 = c20177;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13187(C15600 c15600, int i, C16576 c16576) {
        InterfaceC7505 interfaceC7505;
        synchronized (this.f14176) {
            C19960 c19960 = this.f14177;
            interfaceC7505 = null;
            if (c19960 == null || c19960.f64643 != i || !C11003.equals(c19960.f64640, c15600.m36764())) {
                if (c19960 != null) {
                    boolean z = true;
                    c19960.f64631 = true;
                    c19960.f64641++;
                    InterfaceC7505 interfaceC7506 = c19960.f64630;
                    if (interfaceC7506 == null) {
                        z = false;
                    }
                    c19960.f64630 = null;
                    if (c19960 != this.f14180 && (c19960 == this.f14179 || c19960.f64632 != null || z || !c19960.f64638.isEmpty())) {
                        this.f14178.addLast(c19960);
                    }
                    interfaceC7505 = interfaceC7506;
                }
                this.f14177 = new C19960(c15600, i, c16576);
                if (!this.f14181) {
                    m13177();
                }
            } else {
                c19960.f64639 = c15600;
                c19960.f64636 = c16576;
            }
        }
        if (interfaceC7505 != null) {
            this.f14174.execute(new RunnableC18549(interfaceC7505));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13185(int i, int i2) {
        synchronized (this.f14176) {
            C19960 c19960 = this.f14177;
            if (c19960 == null) {
                return;
            }
            c19960.f64634 = new C21371(c19960.f64639, c19960.f64641, c19960.f64636, Math.max(1, i), Math.max(1, i2));
            if (!this.f14181) {
                m13177();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13184() {
        InterfaceC7505 interfaceC7505;
        synchronized (this.f14176) {
            C19960 c19960 = this.f14177;
            interfaceC7505 = null;
            if (c19960 != null) {
                c19960.f64634 = null;
                c19960.f64641++;
                InterfaceC7505 interfaceC7506 = c19960.f64630;
                c19960.f64630 = null;
                interfaceC7505 = interfaceC7506;
            }
        }
        if (interfaceC7505 != null) {
            this.f14174.execute(new RunnableC18549(interfaceC7505));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13186(Runnable runnable) {
        synchronized (this.f14176) {
            C19960 c19960 = this.f14177;
            if (c19960 == null) {
                this.f14174.execute(runnable);
                return;
            }
            c19960.f64631 = true;
            c19960.f64638.addLast(runnable);
            c19960.f64634 = null;
            c19960.f64641++;
            InterfaceC7505 interfaceC7505 = c19960.f64630;
            c19960.f64630 = null;
            if (!this.f14181) {
                m13177();
            }
            if (interfaceC7505 != null) {
                this.f14174.execute(new RunnableC18549(interfaceC7505));
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m13177() {
        final C19960 c19960 = (C19960) this.f14178.pollFirst();
        Executor executor = this.f14174;
        if (c19960 != null) {
            this.f14181 = true;
            this.f14179 = c19960;
            this.f14180 = c19960;
            executor.execute(new Runnable() { // from class: l.ܺۚۜ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48499.m13183(c19960);
                }
            });
            return;
        }
        final C19960 c19961 = this.f14177;
        if (c19961 == null) {
            return;
        }
        if (c19961.f64631) {
            this.f14181 = true;
            this.f14179 = c19961;
            this.f14180 = c19961;
            executor.execute(new Runnable() { // from class: l.ۖۚۜ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7453.m13183(c19961);
                }
            });
            return;
        }
        final C21371 c21371 = c19961.f64634;
        if (c21371 == null) {
            return;
        }
        c19961.f64634 = null;
        this.f14181 = true;
        this.f14179 = c19961;
        this.f14180 = null;
        executor.execute(new Runnable() { // from class: l.ۘۚۜ
            @Override // java.lang.Runnable
            public final void run() {
                C4437.m13169(this.f11795, c19961, c21371);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13169(final C4437 c4437, final C19960 c19960, final C21371 c21371) {
        C0203 c0203M13176 = C0203.f1445;
        try {
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    c0203M13176 = c4437.m13176(c19960, c21371);
                }
            } catch (Throwable th) {
                c4437.m13175(c19960, c21371);
                throw th;
            }
        } catch (Throwable unused) {
            m13179(c19960);
        }
        c4437.m13175(c19960, c21371);
        final Bitmap bitmapM1364 = c0203M13176.m1364();
        final C13547 c13547M1363 = c0203M13176.m1363();
        C4925.m14315(new Runnable() { // from class: l.᩵ۚۜ
            @Override // java.lang.Runnable
            public final void run() {
                C4437.m13170(this.f60618, c19960, c21371, bitmapM1364, c13547M1363);
            }
        });
        c4437.m13182(c19960);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13170(C4437 c4437, C19960 c19960, C21371 c21371, Bitmap bitmap, C13547 c13547) {
        synchronized (c4437.f14176) {
            if (c4437.f14177 == c19960 && c19960.f64641 == c21371.m48435() && !c19960.f64631) {
                c21371.m48432().mo5884(c19960.f64643, bitmap);
                if (c13547 != null) {
                    c21371.m48432().mo5885(c19960.f64643, c13547);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13175(C19960 c19960, C21371 c21371) {
        synchronized (this.f14176) {
            if (c19960.f64641 == c21371.m48435()) {
                return;
            }
            m13179(c19960);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C0203 m13176(C19960 c19960, C21371 c21371) throws IOException {
        MediaMetadataRetriever mediaMetadataRetriever;
        C15600 c15600 = (C15600) c21371.m48434();
        C17137 c17137 = null;
        C13547 c13547M6125 = null;
        c17137 = null;
        if (c15600.m36763() == EnumC20541.MPEG_TS) {
            C0203 c0203 = c19960.f64633;
            if (c0203 != null && c19960.f64635 == c21371.m48436() && c19960.f64642 == c21371.m48433()) {
                return c0203;
            }
            InterfaceC7505 interfaceC7505M36766 = ((C15600) c21371.m48434()).m36766();
            C7965 c7965 = new C7965();
            try {
                C0909 c0909M13167 = m13167(c19960, c21371, interfaceC7505M36766, c7965);
                Throwable thM3264 = c0909M13167.m3264(c7965.m21271());
                if (thM3264 != null) {
                    m13181(thM3264);
                    throw null;
                }
                int iM48435 = c21371.m48435();
                synchronized (this.f14176) {
                    if (this.f14177 != c19960 || c19960.f64631 || c19960.f64641 != iM48435) {
                        throw new InterruptedIOException("HLS preview read was canceled");
                    }
                }
                if (c7965.m21271()) {
                    C0203 c0203M13166 = m13166(c19960, c21371, c7965, c0909M13167.f3485);
                    c7965.close();
                    return c0203M13166;
                }
                C0203 c0204 = C0203.f1445;
                c7965.close();
                return c0204;
            } catch (Throwable th) {
                try {
                    c7965.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        int iM48436 = c21371.m48435();
        if (c19960.f64637 == null) {
            try {
                C8671 c8671M36767 = c15600.m36767();
                try {
                    m13174(c19960, c8671M36767, iM48436);
                    c19960.f64637 = C0265.m1536(c8671M36767, c8671M36767.m22458());
                    c8671M36767.close();
                    m13173(c19960);
                } catch (Throwable th3) {
                    try {
                        c8671M36767.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (Throwable th5) {
                m13173(c19960);
                throw th5;
            }
        }
        C5205 c5205 = c19960.f64637;
        if (c5205 == null || c5205.m14976() == 0) {
            return C0203.f1445;
        }
        long jM14980 = c5205.m14980() + c15600.m36765();
        int iM14977 = c5205.m14977(jM14980);
        int iM48437 = c21371.m48435();
        C5205 c5206 = c19960.f64637;
        C11003.requireNonNull(c5206);
        long jM14978 = c5206.m14978(iM14977);
        C22076 c22076 = c19960.f64632;
        if (c22076 == null || c22076.f71721 != jM14978) {
            m13179(c19960);
            C8671 c8671M36768 = c15600.m36767();
            MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
            try {
                m13174(c19960, c8671M36768, iM48437);
                long jM22458 = c8671M36768.m22458();
                long jM14979 = c5206.m14979(iM14977);
                mediaMetadataRetriever = mediaMetadataRetriever2;
                try {
                    C17137 c17138 = new C17137(c8671M36768, jM22458, jM14978, jM14979);
                    try {
                        mediaMetadataRetriever.setDataSource(c17138);
                        C22076 c22077 = new C22076(jM14978, mediaMetadataRetriever, c17138, c8671M36768);
                        c19960.f64632 = c22077;
                        m13173(c19960);
                        c22076 = c22077;
                    } catch (Throwable th6) {
                        th = th6;
                        c17137 = c17138;
                        try {
                            mediaMetadataRetriever.release();
                        } catch (Throwable unused) {
                        }
                        try {
                            C0349.m1793(c17137);
                            if (c17137 == null) {
                                C0349.m1793(c8671M36768);
                            }
                            if (th instanceof IOException) {
                                throw th;
                            }
                            throw new IOException("Failed to open HLS preview fragment", th);
                        } catch (Throwable th7) {
                            m13173(c19960);
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
        int iM48438 = c21371.m48436();
        int iM48433 = c21371.m48433();
        int iM48439 = c21371.m48435();
        InterfaceC7505 interfaceC7505 = c22076.f71719;
        MediaMetadataRetriever mediaMetadataRetriever3 = c22076.f71720;
        m13174(c19960, interfaceC7505, iM48439);
        try {
            Bitmap bitmapM13163 = m13163(mediaMetadataRetriever3, jM14980, iM48438, iM48433);
            try {
                int i = Integer.parseInt(mediaMetadataRetriever3.extractMetadata(18));
                int i2 = Integer.parseInt(mediaMetadataRetriever3.extractMetadata(19));
                String strExtractMetadata = mediaMetadataRetriever3.extractMetadata(24);
                c13547M6125 = C1841.m6125(i, i2, strExtractMetadata == null ? 0 : Integer.parseInt(strExtractMetadata), 1.0f);
            } catch (RuntimeException unused2) {
            }
            return new C0203(bitmapM13163, c13547M6125);
        } finally {
            m13173(c19960);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C0909 m13167(C19960 c19960, C21371 c21371, InterfaceC7505 interfaceC7505, C7965 c7965) {
        C6282 c6282;
        C5143 c5143;
        C0909 c0909 = new C0909();
        C5143 c5144 = null;
        e = null;
        c5144 = null;
        try {
            try {
                m13174(c19960, interfaceC7505, c21371.m48435());
                if (((C17613) interfaceC7505).length() > 0) {
                    c6282 = new C6282(interfaceC7505);
                    try {
                        this.f14175.getClass();
                        c5143 = new C5143();
                    } catch (Throwable th) {
                        try {
                            c0909.f3487 = th;
                            c5143 = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    try {
                        if (c0909.f3487 == null) {
                            try {
                                c5143.m14705(c6282);
                            } catch (Throwable th3) {
                                e = th3;
                            }
                            try {
                                c6282.m17327();
                                IOException iOException = (IOException) m13165(e, IOException.class);
                                if (iOException != null) {
                                    e = iOException;
                                }
                            } catch (IOException e) {
                                e = e;
                            }
                            if (e != null) {
                                c0909.m3265(e);
                            } else {
                                int iM48435 = c21371.m48435();
                                synchronized (this.f14176) {
                                    if (this.f14177 != c19960 || c19960.f64631 || c19960.f64641 != iM48435) {
                                        throw new InterruptedIOException("HLS preview read was canceled");
                                    }
                                }
                                m13172(c5143, c6282, c7965, c0909, c21371.m48436(), c21371.m48433());
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        c5144 = c5143;
                        c0909.m3265(th);
                        c5143 = c5144;
                    }
                    m13171(c5143, c6282, interfaceC7505, c0909);
                    return c0909;
                }
                m13171((C5143) null, (C6282) null, interfaceC7505, c0909);
                m13173(c19960);
                return c0909;
            } catch (Throwable th5) {
                th = th5;
                c6282 = null;
            }
            c0909.m3265(th);
            c5143 = c5144;
            m13171(c5143, c6282, interfaceC7505, c0909);
            return c0909;
        } finally {
            m13171(c5144, c6282, interfaceC7505, c0909);
            m13173(c19960);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13172(C5143 c5143, C6282 c6282, C7965 c7965, C0909 c0909, int i, int i2) {
        IOException e;
        Bitmap bitmapM14703;
        try {
            bitmapM14703 = c5143.m14703(i, i2);
            e = null;
        } catch (Throwable th) {
            e = th;
            bitmapM14703 = null;
        }
        if (bitmapM14703 != null) {
            c7965.m21270(bitmapM14703);
        }
        try {
            c6282.m17327();
            IOException iOException = (IOException) m13165(e, IOException.class);
            if (iOException != null) {
                e = iOException;
            }
        } catch (IOException e2) {
            e = e2;
        }
        if (e != null) {
            c0909.m3265(e);
            return;
        }
        if (c7965.m21271()) {
            int i3 = Integer.parseInt(c5143.m14704(18));
            int i4 = Integer.parseInt(c5143.m14704(19));
            String strM14704 = c5143.m14704(24);
            c0909.f3485 = C1841.m6125(i3, i4, strM14704 == null ? 0 : Integer.parseInt(strM14704), 1.0f);
            e = null;
            try {
                c6282.m17327();
                IOException iOException2 = (IOException) m13165(e, IOException.class);
                if (iOException2 != null) {
                    e = iOException2;
                }
            } catch (IOException e3) {
                e = e3;
            }
            if (e == null) {
                return;
            }
            if (m13165(e, InterruptedIOException.class) != null || m13165(e, C3586.class) != null || m13165(e, Error.class) != null) {
                c0909.m3265(e);
            } else {
                c0909.f3485 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13171(C5143 c5143, C6282 c6282, InterfaceC7505 interfaceC7505, C0909 c0909) {
        ArrayList arrayList = c0909.f3486;
        if (c5143 != null) {
            try {
                c5143.close();
            } catch (Throwable th) {
                arrayList.add(th);
            }
        }
        if (c6282 != null) {
            try {
                c6282.close();
                return;
            } catch (Throwable th2) {
                arrayList.add(th2);
                return;
            }
        }
        try {
            ((C17613) interfaceC7505).close();
        } catch (Throwable th3) {
            arrayList.add(th3);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13174(C19960 c19960, InterfaceC7505 interfaceC7505, int i) {
        synchronized (this.f14176) {
            if (this.f14177 != c19960 || c19960.f64631 || c19960.f64641 != i) {
                throw new InterruptedIOException("HLS preview read was canceled");
            }
            c19960.f64630 = interfaceC7505;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13173(C19960 c19960) {
        synchronized (this.f14176) {
            c19960.f64630 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m13183(C19960 c19960) {
        ArrayList arrayList;
        m13179(c19960);
        synchronized (this.f14176) {
            arrayList = new ArrayList(c19960.f64638);
            c19960.f64638.clear();
            if (this.f14177 == c19960) {
                this.f14177 = null;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException unused) {
            }
        }
        m13182(c19960);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m13182(C19960 c19960) {
        synchronized (this.f14176) {
            if (this.f14179 == c19960) {
                this.f14179 = null;
            }
            if (this.f14180 == c19960) {
                this.f14180 = null;
            }
            this.f14181 = false;
            m13177();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m13179(C19960 c19960) {
        C22076 c22076 = c19960.f64632;
        c19960.f64632 = null;
        if (c22076 != null) {
            try {
                c22076.f71720.release();
            } catch (Throwable unused) {
            }
            C0349.m1793(c22076.f71718);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m13163(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 27) {
            return mediaMetadataRetriever.getScaledFrameAtTime(j, 2, i, i2);
        }
        return m13162(mediaMetadataRetriever.getFrameAtTime(j, 2), i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m13162(Bitmap bitmap, int i, int i2) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C0203 m13166(C19960 c19960, C21371 c21371, C7965 c7965, C13547 c13547) {
        C0203 c0203;
        synchronized (this.f14176) {
            int iM48435 = c21371.m48435();
            if (this.f14177 == c19960 && !c19960.f64631 && c19960.f64641 == iM48435) {
                c0203 = new C0203(c7965.take(), c13547);
                c19960.f64633 = c0203;
                c19960.f64635 = c21371.m48436();
                c19960.f64642 = c21371.m48433();
            } else {
                throw new InterruptedIOException("HLS preview read was canceled");
            }
        }
        return c0203;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m13180(Throwable th) {
        return (m13165(th, InterruptedIOException.class) == null && m13165(th, C3586.class) == null) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Throwable m13165(Throwable th, Class cls) {
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m13181(Throwable th) throws IOException {
        Error error = (Error) m13165(th, Error.class);
        if (error != null) {
            throw error;
        }
        IOException iOException = (IOException) m13165(th, IOException.class);
        if (iOException != null) {
            throw iOException;
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        throw new IOException("Failed to load HLS MPEG-TS preview frame", th);
    }
}
