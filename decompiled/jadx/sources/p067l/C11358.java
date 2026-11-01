package p067l;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.ۢ۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes3.dex */
public final class C11358 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f31647 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final C0907 f31648 = new C0907(200);

    /* JADX INFO: renamed from: ֫ */
    public static C24768 m26315(AbstractC15599 abstractC15599, InterfaceC19370 interfaceC19370, int i) {
        boolean z = abstractC15599 instanceof AbstractC5375;
        if (z || (abstractC15599 instanceof C4744)) {
            String str = "hls-corrupt:" + C22224.m50055(abstractC15599, interfaceC19370, "short-lived");
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C0907 c0907 = f31648;
            synchronized (c0907) {
                Long l2 = (Long) c0907.m6785(str);
                if (l2 != null) {
                    if (jElapsedRealtime < l2.longValue() || jElapsedRealtime - l2.longValue() >= 30000) {
                        c0907.m6790(str);
                    } else {
                        return new C24768(EnumC8675.CORRUPT, null);
                    }
                }
                ExecutorService executorService = z ? C4081.f8988 : C4081.f8986;
                final C15183 c15183 = new C15183(interfaceC19370, abstractC15599);
                Future futureSubmit = executorService.submit(new Callable() { // from class: l.ۗ֨ۜ
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return c15183.m34620();
                    }
                });
                try {
                    C24768 c24768 = (C24768) futureSubmit.get(Math.max(1, i), TimeUnit.SECONDS);
                    if (c24768.m54440() == EnumC8675.CORRUPT) {
                        m26318(str);
                    }
                    return c24768;
                } catch (InterruptedException unused) {
                    futureSubmit.cancel(true);
                    c15183.m34619();
                    Thread.currentThread().interrupt();
                    return new C24768(EnumC8675.CANCELED, null);
                } catch (ExecutionException unused2) {
                    futureSubmit.cancel(true);
                    c15183.m34619();
                    return new C24768(EnumC8675.TRANSIENT_FAILURE, null);
                } catch (TimeoutException unused3) {
                    futureSubmit.cancel(true);
                    c15183.m34619();
                    return new C24768(EnumC8675.TIMEOUT, null);
                }
            }
        }
        return new C24768(EnumC8675.UNSUPPORTED, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26318(String str) {
        C0907 c0907 = f31648;
        synchronized (c0907) {
            c0907.m6786(str, Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24768 m26316(AbstractC15599 abstractC15599, InterfaceC19370 interfaceC19370, C13173 c13173) {
        C24768 c24768;
        try {
            try {
                try {
                    C19404 c19404M44184 = C19404.m44184(interfaceC19370, abstractC15599);
                    try {
                        c13173.m30171(c19404M44184);
                        try {
                            c13173.m30172();
                            C18733 c18733M26314 = m26314(c19404M44184.f57946, c19404M44184.f57945, c19404M44184.f57947, c13173);
                            Bitmap bitmapM33864 = C14828.m33864(c18733M26314.f56007);
                            if (bitmapM33864 != null) {
                                c13173.m30172();
                                c24768 = new C24768(EnumC8675.SUCCESS, bitmapM33864);
                            } else {
                                c13173.m30172();
                                Bitmap bitmapM26312 = m26312(c18733M26314, c19404M44184.m44185(), C13076.m29939(32.0f), c13173);
                                if (bitmapM26312 != null) {
                                    c13173.m30172();
                                    C14828.m33866(c18733M26314.f56007, bitmapM26312);
                                    c24768 = new C24768(EnumC8675.SUCCESS, bitmapM26312);
                                } else {
                                    c24768 = new C24768(EnumC8675.TRANSIENT_FAILURE, null);
                                }
                            }
                            c13173.m30173(c19404M44184);
                            c19404M44184.close();
                            return c24768;
                        } catch (Throwable th) {
                            c13173.m30173(c19404M44184);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            c19404M44184.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (C12699 | C13608 | C22087 unused) {
                    return new C24768(EnumC8675.UNSUPPORTED, null);
                }
            } catch (IOException | RuntimeException unused2) {
                return new C24768(EnumC8675.TRANSIENT_FAILURE, null);
            }
        } catch (InterruptedIOException unused3) {
            return new C24768(EnumC8675.CANCELED, null);
        } catch (C10998 unused4) {
            return new C24768(EnumC8675.CORRUPT, null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18733 m26314(InterfaceC16716 interfaceC16716, C18062 c18062, Uri uri, C13173 c13173) throws IOException {
        C7074 c7074;
        String str;
        C3981 c3981M26313;
        m26321(uri);
        C3981 c3981M26314 = m26313(interfaceC16716, uri, new C24508(), c13173);
        AbstractC12439 abstractC12439 = c3981M26314.f8664;
        if (abstractC12439 instanceof C14450) {
            C14450 c14450 = (C14450) abstractC12439;
            if (!c14450.f41282.isEmpty() || !c14450.f41290.isEmpty()) {
                throw new C22087("External video renditions or session DRM are unsupported");
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C15120 c15120 : c14450.f41287) {
                C10307 c10307 = c15120.f43173;
                String str2 = c10307.f28533;
                if ((c10307.f28522 & 16384) == 0 && c15120.f43172 == null) {
                    String strM26819 = C11669.m26819(str2);
                    String strM26812 = C11669.m26812(str2);
                    boolean z = c10307.f28547 > 0 || c10307.f28523 > 0;
                    if (strM26819 != null || z) {
                        arrayList.add(c15120);
                    } else if (strM26812 == null) {
                        arrayList2.add(c15120);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = arrayList2;
            }
            C15120 c15121 = (C15120) C7480.stream(arrayList).min(C16866.thenComparing(C16866.thenComparingLong(C10162.comparingLong(new C22561()), new C23231()), new C21220())).orElseThrow(new C6467());
            Uri uri2 = c15121.f43174;
            m26321(uri2);
            c3981M26313 = m26313(interfaceC16716, uri2, new C24508(c14450, null), c13173);
            AbstractC12439 abstractC124310 = c3981M26313.f8664;
            if (!(abstractC124310 instanceof C7074)) {
                throw new C22087("Nested multivariant playlists are unsupported");
            }
            c7074 = (C7074) abstractC124310;
            C10307 c10308 = c15121.f43173;
            str = uri2 + "|" + c10308.f28533 + "|" + c10308.f28537 + "|" + c10308.f28529 + "|" + c10308.f28547 + "x" + c10308.f28523;
        } else {
            AbstractC12439 abstractC124311 = c3981M26314.f8664;
            if (!(abstractC124311 instanceof C7074)) {
                throw new C22087("Unsupported HLS playlist type");
            }
            c7074 = (C7074) abstractC124311;
            str = "direct";
            c3981M26313 = c3981M26314;
        }
        for (C23168 c23168 : c7074.f18427) {
            if (!c23168.f75744) {
                EnumC21890 enumC21890M38921 = C17194.m38921(c7074, c23168);
                if (enumC21890M38921 == null) {
                    throw new C22087("HLS playlist is not eligible for thumbnails");
                }
                C23168 c23169 = c23168.f75742;
                C16050 c16050M41118 = c23169 != null ? c18062.m41118(c7074, c23169) : null;
                C16050 c16050M41119 = c18062.m41118(c7074, c23168);
                if (enumC21890M38921 == EnumC21890.FRAGMENTED_MP4 && c16050M41118 == null) {
                    throw new C22087("Fragmented MP4 initialization is missing");
                }
                if (c16050M41118 != null && c16050M41118.f46454 > C14849.FOREVER_NS - c16050M41119.f46454) {
                    throw new C22087("HLS thumbnail resource length overflows");
                }
                MessageDigest messageDigestM36668 = C16111.m36668();
                m26319(messageDigestM36668, "hls-thumb-v1");
                m26319(messageDigestM36668, c3981M26314.f8663.toString());
                m26319(messageDigestM36668, c3981M26314.f8662);
                m26319(messageDigestM36668, c3981M26313.f8663.toString());
                m26319(messageDigestM36668, c3981M26313.f8662);
                m26319(messageDigestM36668, str);
                m26319(messageDigestM36668, enumC21890M38921.name());
                m26320(messageDigestM36668, c16050M41118);
                m26320(messageDigestM36668, c16050M41119);
                return new C18733(enumC21890M38921, c16050M41118, c16050M41119, "hls_thumb_v1_".concat(C16111.m36665(messageDigestM36668.digest())));
            }
        }
        throw new C22087("HLS media segment is missing");
    }

    /* JADX INFO: renamed from: ֫ */
    public static C3981 m26313(InterfaceC16716 interfaceC16716, Uri uri, C24508 c24508, C13173 c13173) throws IOException {
        m26321(uri);
        InterfaceC22753 interfaceC22753Mo8449 = interfaceC16716.mo8449();
        C6659 c6659 = new C6659();
        c6659.m15164(uri);
        c6659.m15162(1);
        C21412 c21412 = new C21412(interfaceC22753Mo8449, c6659.m15161());
        MessageDigest messageDigestM36668 = C16111.m36668();
        C11832 c11832M30169 = c13173.m30169(c21412);
        try {
            c13173.m30172();
            c21412.m48549();
            Uri uriMo4021 = interfaceC22753Mo8449.mo4021();
            if (uriMo4021 != null) {
                uri = uriMo4021;
            }
            m26321(uri);
            AbstractC12439 abstractC12439M54084 = c24508.m54084(uri, new C9149(new DigestInputStream(new C23901(c21412), messageDigestM36668)));
            c13173.m30172();
            C3981 c3981 = new C3981(abstractC12439M54084, uri, C16111.m36665(messageDigestM36668.digest()));
            c11832M30169.close();
            return c3981;
        } catch (Throwable th) {
            try {
                c11832M30169.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Bitmap m26312(final C18733 c18733, final InterfaceC16716 interfaceC16716, int i, final C13173 c13173) throws Throwable {
        Throwable th;
        int width;
        Bitmap frameAtTime;
        int iMin;
        if (c18733.f56008 == EnumC21890.MPEG_TS) {
            C13823 c13823M31489 = C13823.m31489(c18733.f56010.f46453, new InterfaceC7788() { // from class: l.۬֨ۜ
                @Override // p067l.InterfaceC7788
                /* JADX INFO: renamed from: ֫ */
                public final InterfaceC9501 mo18032() {
                    C6998 c6998M36522 = c18733.f56010.m36522(interfaceC16716);
                    return new C7808(c6998M36522, c13173.m30169(c6998M36522));
                }
            }, true);
            C12826.requireNonNull(c13173);
            return C24292.m53619(c13823M31489, i, new InterfaceC21280() { // from class: l.۫֨ۜ
                @Override // p067l.InterfaceC21280
                /* JADX INFO: renamed from: ֫ */
                public final void mo23161() throws InterruptedIOException {
                    c13173.m30172();
                }
            });
        }
        if (Build.VERSION.SDK_INT < 23 || c18733.f56009 == null) {
            throw new C22087("Fragmented MP4 thumbnails require Android M");
        }
        C16050 c16050 = c18733.f56009;
        if (c16050 == null) {
            throw new C22087("Fragmented MP4 initialization is missing");
        }
        C16050 c16051 = c18733.f56010;
        C6998 c6998M36522 = c16050.m36522(interfaceC16716);
        C6998 c6998 = null;
        bitmapM43038 = null;
        Bitmap bitmapM43038 = null;
        C18655 c18655 = null;
        try {
            C6998 c6998M36523 = c16051.m36522(interfaceC16716);
            try {
                C10609 c10609 = new C10609(c6998M36522, c6998M36523);
                C7808 c7808 = new C7808(c10609, c13173.m30169(c10609));
                long j = c16050.f46454;
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    c13173.m30172();
                    C7315 c7315M3934 = C2620.m3934(c7808, j);
                    if (c7315M3934.m16886() != 0) {
                        C18655 c18656 = new C18655(c7808, j, c7315M3934.m16888(0), c7315M3934.m16889(0));
                        try {
                            mediaMetadataRetriever.setDataSource(c18656);
                            c13173.m30172();
                            int height = -1;
                            try {
                                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                                width = strExtractMetadata == null ? -1 : Integer.parseInt(strExtractMetadata);
                                if (width <= 0) {
                                    width = -1;
                                }
                            } catch (RuntimeException unused) {
                            }
                            try {
                                String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                                int i2 = strExtractMetadata2 == null ? -1 : Integer.parseInt(strExtractMetadata2);
                                if (i2 > 0) {
                                    height = i2;
                                }
                            } catch (RuntimeException unused2) {
                            }
                            if (width <= 0 || height <= 0) {
                                frameAtTime = mediaMetadataRetriever.getFrameAtTime(c7315M3934.m16890(), 2);
                            } else {
                                int iMax = Math.max(1, i);
                                double d = ((double) width) / ((double) height);
                                if (d >= 1.0d) {
                                    int iMin2 = Math.min(iMax * 3, Math.max(iMax, (int) Math.ceil(((double) iMax) * d)));
                                    iMin = iMax;
                                    iMax = iMin2;
                                } else {
                                    iMin = Math.min(iMax * 3, Math.max(iMax, (int) Math.ceil(((double) iMax) / d)));
                                }
                                int[] iArr = {iMax, iMin};
                                frameAtTime = C6585.m15044(mediaMetadataRetriever, c7315M3934.m16890(), iArr[0], iArr[1]);
                            }
                            c13173.m30172();
                            if (frameAtTime != null) {
                                if (width <= 0) {
                                    width = frameAtTime.getWidth();
                                }
                                if (height <= 0) {
                                    height = frameAtTime.getHeight();
                                }
                                bitmapM43038 = C18950.m43038(frameAtTime, i, width, height);
                            }
                            try {
                                mediaMetadataRetriever.release();
                            } catch (Throwable unused3) {
                            }
                            C2700.m4192(c18656);
                        } catch (Throwable th2) {
                            th = th2;
                            c7808 = null;
                            c18655 = c18656;
                            try {
                                mediaMetadataRetriever.release();
                            } catch (Throwable unused4) {
                            }
                            if (c18655 != null) {
                                C2700.m4192(c18655);
                                throw th;
                            }
                            C2700.m4192(c7808);
                            throw th;
                        }
                    } else {
                        try {
                            mediaMetadataRetriever.release();
                        } catch (Throwable unused5) {
                        }
                        C2700.m4192(c7808);
                    }
                    return bitmapM43038;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException | Error | RuntimeException e) {
                th = e;
                c6998 = c6998M36523;
                if (c6998 != null) {
                    try {
                        c6998.close();
                    } catch (IOException e2) {
                        th.addSuppressed(e2);
                    }
                }
                try {
                    c6998M36522.close();
                    throw th;
                } catch (IOException e3) {
                    th.addSuppressed(e3);
                    throw th;
                }
            }
        } catch (IOException | Error | RuntimeException e4) {
            th = e4;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26320(MessageDigest messageDigest, C16050 c16050) {
        if (c16050 == null) {
            m26319(messageDigest, "none");
            return;
        }
        m26319(messageDigest, c16050.f46456.toString());
        m26319(messageDigest, c16050.f46453);
        m26319(messageDigest, Long.toString(c16050.f46455));
        m26319(messageDigest, Long.toString(c16050.f46454));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26319(MessageDigest messageDigest, String str) {
        if (str != null) {
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
        }
        messageDigest.update((byte) 0);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m26321(Uri uri) throws C22087 {
        String scheme = uri.getScheme();
        if (scheme == null || !"mt_media".equals(scheme.toLowerCase(Locale.ROOT)) || uri.getAuthority() != null) {
            throw new C22087("HLS thumbnail URI must stay in the current visitor");
        }
    }
}
