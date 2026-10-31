package l;

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
public final class C9459 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f28698 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C1315 f28699 = new C1315(200);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23569 m24305(AbstractC13921 abstractC13921, InterfaceC17889 interfaceC17889, int i) {
        boolean z = abstractC13921 instanceof AbstractC3163;
        if (z || (abstractC13921 instanceof C2499)) {
            String str = "hls-corrupt:" + C20892.m47725(abstractC13921, interfaceC17889, "short-lived");
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C1315 c1315 = f28699;
            synchronized (c1315) {
                Long l2 = (Long) c1315.m4553(str);
                if (l2 != null) {
                    if (jElapsedRealtime < l2.longValue() || jElapsedRealtime - l2.longValue() >= 30000) {
                        c1315.m4558(str);
                    } else {
                        return new C23569(EnumC6636.CORRUPT, null);
                    }
                }
                ExecutorService executorService = z ? C1802.f6209 : C1802.f6207;
                final C13484 c13484 = new C13484(interfaceC17889, abstractC13921);
                Future futureSubmit = executorService.submit(new Callable() { // from class: l.ۗ֨ۜ
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return c13484.m32518();
                    }
                });
                try {
                    C23569 c23569 = (C23569) futureSubmit.get(Math.max(1, i), TimeUnit.SECONDS);
                    if (c23569.m52038() == EnumC6636.CORRUPT) {
                        m24308(str);
                    }
                    return c23569;
                } catch (InterruptedException unused) {
                    futureSubmit.cancel(true);
                    c13484.m32517();
                    Thread.currentThread().interrupt();
                    return new C23569(EnumC6636.CANCELED, null);
                } catch (ExecutionException unused2) {
                    futureSubmit.cancel(true);
                    c13484.m32517();
                    return new C23569(EnumC6636.TRANSIENT_FAILURE, null);
                } catch (TimeoutException unused3) {
                    futureSubmit.cancel(true);
                    c13484.m32517();
                    return new C23569(EnumC6636.TIMEOUT, null);
                }
            }
        }
        return new C23569(EnumC6636.UNSUPPORTED, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24308(String str) {
        C1315 c1315 = f28699;
        synchronized (c1315) {
            c1315.m4554(str, Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23569 m24306(AbstractC13921 abstractC13921, InterfaceC17889 interfaceC17889, C11369 c11369) {
        C23569 c23569;
        try {
            try {
                try {
                    C17925 c17925M41935 = C17925.m41935(interfaceC17889, abstractC13921);
                    try {
                        c11369.m28127(c17925M41935);
                        try {
                            c11369.m28128();
                            C17219 c17219M24304 = m24304(c17925M41935.f54749, c17925M41935.f54748, c17925M41935.f54750, c11369);
                            Bitmap bitmapM31773 = C13110.m31773(c17219M24304.f52825);
                            if (bitmapM31773 != null) {
                                c11369.m28128();
                                c23569 = new C23569(EnumC6636.SUCCESS, bitmapM31773);
                            } else {
                                c11369.m28128();
                                Bitmap bitmapM24302 = m24302(c17219M24304, c17925M41935.m41936(), C11266.m27878(32.0f), c11369);
                                if (bitmapM24302 != null) {
                                    c11369.m28128();
                                    C13110.m31775(c17219M24304.f52825, bitmapM24302);
                                    c23569 = new C23569(EnumC6636.SUCCESS, bitmapM24302);
                                } else {
                                    c23569 = new C23569(EnumC6636.TRANSIENT_FAILURE, null);
                                }
                            }
                            c11369.m28129(c17925M41935);
                            c17925M41935.close();
                            return c23569;
                        } catch (Throwable th) {
                            c11369.m28129(c17925M41935);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            c17925M41935.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (C10870 | C11826 | C20748 unused) {
                    return new C23569(EnumC6636.UNSUPPORTED, null);
                }
            } catch (IOException | RuntimeException unused2) {
                return new C23569(EnumC6636.TRANSIENT_FAILURE, null);
            }
        } catch (InterruptedIOException unused3) {
            return new C23569(EnumC6636.CANCELED, null);
        } catch (C9080 unused4) {
            return new C23569(EnumC6636.CORRUPT, null);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17219 m24304(InterfaceC15097 interfaceC15097, C16513 c16513, Uri uri, C11369 c11369) throws IOException {
        C4951 c4951;
        String str;
        C1697 c1697M24303;
        m24311(uri);
        C1697 c1697M24304 = m24303(interfaceC15097, uri, new C23295(), c11369);
        AbstractC10596 abstractC10596 = c1697M24304.f5885;
        if (abstractC10596 instanceof C12712) {
            C12712 c12712 = (C12712) abstractC10596;
            if (!c12712.f38253.isEmpty() || !c12712.f38261.isEmpty()) {
                throw new C20748("External video renditions or session DRM are unsupported");
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C13417 c13417 : c12712.f38258) {
                C8353 c8353 = c13417.f40104;
                String str2 = c8353.f25619;
                if ((c8353.f25608 & 16384) == 0 && c13417.f40103 == null) {
                    String strM24804 = C9786.m24804(str2);
                    String strM24797 = C9786.m24797(str2);
                    boolean z = c8353.f25633 > 0 || c8353.f25609 > 0;
                    if (strM24804 != null || z) {
                        arrayList.add(c13417);
                    } else if (strM24797 == null) {
                        arrayList2.add(c13417);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = arrayList2;
            }
            C13417 c13418 = (C13417) C5378.stream(arrayList).min(C15254.thenComparing(C15254.thenComparingLong(C8200.comparingLong(new C21247()), new C21952()), new C19836())).orElseThrow(new C4313());
            Uri uri2 = c13418.f40105;
            m24311(uri2);
            c1697M24303 = m24303(interfaceC15097, uri2, new C23295(c12712, null), c11369);
            AbstractC10596 abstractC10597 = c1697M24303.f5885;
            if (!(abstractC10597 instanceof C4951)) {
                throw new C20748("Nested multivariant playlists are unsupported");
            }
            c4951 = (C4951) abstractC10597;
            C8353 c8354 = c13418.f40104;
            str = uri2 + "|" + c8354.f25619 + "|" + c8354.f25623 + "|" + c8354.f25615 + "|" + c8354.f25633 + "x" + c8354.f25609;
        } else {
            AbstractC10596 abstractC10598 = c1697M24304.f5885;
            if (!(abstractC10598 instanceof C4951)) {
                throw new C20748("Unsupported HLS playlist type");
            }
            c4951 = (C4951) abstractC10598;
            str = "direct";
            c1697M24303 = c1697M24304;
        }
        for (C21885 c21885 : c4951.f15593) {
            if (!c21885.f73017) {
                EnumC20541 enumC20541M36760 = C15600.m36760(c4951, c21885);
                if (enumC20541M36760 == null) {
                    throw new C20748("HLS playlist is not eligible for thumbnails");
                }
                C21885 c21886 = c21885.f73015;
                C14396 c14396M38892 = c21886 != null ? c16513.m38892(c4951, c21886) : null;
                C14396 c14396M38893 = c16513.m38892(c4951, c21885);
                if (enumC20541M36760 == EnumC20541.FRAGMENTED_MP4 && c14396M38892 == null) {
                    throw new C20748("Fragmented MP4 initialization is missing");
                }
                if (c14396M38892 != null && c14396M38892.f43361 > C13132.FOREVER_NS - c14396M38893.f43361) {
                    throw new C20748("HLS thumbnail resource length overflows");
                }
                MessageDigest messageDigestM34534 = C14460.m34534();
                m24309(messageDigestM34534, "hls-thumb-v1");
                m24309(messageDigestM34534, c1697M24304.f5884.toString());
                m24309(messageDigestM34534, c1697M24304.f5883);
                m24309(messageDigestM34534, c1697M24303.f5884.toString());
                m24309(messageDigestM34534, c1697M24303.f5883);
                m24309(messageDigestM34534, str);
                m24309(messageDigestM34534, enumC20541M36760.name());
                m24310(messageDigestM34534, c14396M38892);
                m24310(messageDigestM34534, c14396M38893);
                return new C17219(enumC20541M36760, c14396M38892, c14396M38893, "hls_thumb_v1_".concat(C14460.m34531(messageDigestM34534.digest())));
            }
        }
        throw new C20748("HLS media segment is missing");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1697 m24303(InterfaceC15097 interfaceC15097, Uri uri, C23295 c23295, C11369 c11369) throws IOException {
        m24311(uri);
        InterfaceC21449 interfaceC21449Mo6247 = interfaceC15097.mo6247();
        C4515 c4515 = new C4515();
        c4515.m13281(uri);
        c4515.m13279(1);
        C20038 c20038 = new C20038(interfaceC21449Mo6247, c4515.m13278());
        MessageDigest messageDigestM34534 = C14460.m34534();
        C9958 c9958M28125 = c11369.m28125(c20038);
        try {
            c11369.m28128();
            c20038.m46233();
            Uri uriMo1621 = interfaceC21449Mo6247.mo1621();
            if (uriMo1621 != null) {
                uri = uriMo1621;
            }
            m24311(uri);
            AbstractC10596 abstractC10596M51688 = c23295.m51688(uri, new C7135(new DigestInputStream(new C22657(c20038), messageDigestM34534)));
            c11369.m28128();
            C1697 c1697 = new C1697(abstractC10596M51688, uri, C14460.m34531(messageDigestM34534.digest()));
            c9958M28125.close();
            return c1697;
        } catch (Throwable th) {
            try {
                c9958M28125.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m24302(final C17219 c17219, final InterfaceC15097 interfaceC15097, int i, final C11369 c11369) throws Throwable {
        Throwable th;
        int width;
        Bitmap frameAtTime;
        int iMin;
        if (c17219.f52826 == EnumC20541.MPEG_TS) {
            C12053 c12053M29427 = C12053.m29427(c17219.f52828.f43360, new InterfaceC5703() { // from class: l.۬֨ۜ
                @Override // l.InterfaceC5703
                /* JADX INFO: renamed from: ֫ */
                public final InterfaceC7505 mo16113() {
                    C4871 c4871M34388 = c17219.f52828.m34388(interfaceC15097);
                    return new C5724(c4871M34388, c11369.m28125(c4871M34388));
                }
            }, true);
            C11003.requireNonNull(c11369);
            return C23068.m51226(c12053M29427, i, new InterfaceC19899() { // from class: l.۫֨ۜ
                @Override // l.InterfaceC19899
                /* JADX INFO: renamed from: ֫ */
                public final void mo21195() throws InterruptedIOException {
                    c11369.m28128();
                }
            });
        }
        if (Build.VERSION.SDK_INT < 23 || c17219.f52827 == null) {
            throw new C20748("Fragmented MP4 thumbnails require Android M");
        }
        C14396 c14396 = c17219.f52827;
        if (c14396 == null) {
            throw new C20748("Fragmented MP4 initialization is missing");
        }
        C14396 c14397 = c17219.f52828;
        C4871 c4871M34388 = c14396.m34388(interfaceC15097);
        C4871 c4871 = null;
        bitmapM40780 = null;
        Bitmap bitmapM40780 = null;
        C17137 c17137 = null;
        try {
            C4871 c4871M34389 = c14397.m34388(interfaceC15097);
            try {
                C8671 c8671 = new C8671(c4871M34388, c4871M34389);
                C5724 c5724 = new C5724(c8671, c11369.m28125(c8671));
                long j = c14396.f43361;
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    c11369.m28128();
                    C5205 c5205M1536 = C0265.m1536(c5724, j);
                    if (c5205M1536.m14976() != 0) {
                        C17137 c17138 = new C17137(c5724, j, c5205M1536.m14978(0), c5205M1536.m14979(0));
                        try {
                            mediaMetadataRetriever.setDataSource(c17138);
                            c11369.m28128();
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
                                frameAtTime = mediaMetadataRetriever.getFrameAtTime(c5205M1536.m14980(), 2);
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
                                frameAtTime = C4437.m13163(mediaMetadataRetriever, c5205M1536.m14980(), iArr[0], iArr[1]);
                            }
                            c11369.m28128();
                            if (frameAtTime != null) {
                                if (width <= 0) {
                                    width = frameAtTime.getWidth();
                                }
                                if (height <= 0) {
                                    height = frameAtTime.getHeight();
                                }
                                bitmapM40780 = C17447.m40780(frameAtTime, i, width, height);
                            }
                            try {
                                mediaMetadataRetriever.release();
                            } catch (Throwable unused3) {
                            }
                            C0349.m1793(c17138);
                        } catch (Throwable th2) {
                            th = th2;
                            c5724 = null;
                            c17137 = c17138;
                            try {
                                mediaMetadataRetriever.release();
                            } catch (Throwable unused4) {
                            }
                            if (c17137 != null) {
                                C0349.m1793(c17137);
                                throw th;
                            }
                            C0349.m1793(c5724);
                            throw th;
                        }
                    } else {
                        try {
                            mediaMetadataRetriever.release();
                        } catch (Throwable unused5) {
                        }
                        C0349.m1793(c5724);
                    }
                    return bitmapM40780;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException | Error | RuntimeException e) {
                th = e;
                c4871 = c4871M34389;
                if (c4871 != null) {
                    try {
                        c4871.close();
                    } catch (IOException e2) {
                        th.addSuppressed(e2);
                    }
                }
                try {
                    c4871M34388.close();
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24310(MessageDigest messageDigest, C14396 c14396) {
        if (c14396 == null) {
            m24309(messageDigest, "none");
            return;
        }
        m24309(messageDigest, c14396.f43363.toString());
        m24309(messageDigest, c14396.f43360);
        m24309(messageDigest, Long.toString(c14396.f43362));
        m24309(messageDigest, Long.toString(c14396.f43361));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24309(MessageDigest messageDigest, String str) {
        if (str != null) {
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
        }
        messageDigest.update((byte) 0);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m24311(Uri uri) throws C20748 {
        String scheme = uri.getScheme();
        if (scheme == null || !"mt_media".equals(scheme.toLowerCase(Locale.ROOT)) || uri.getAuthority() != null) {
            throw new C20748("HLS thumbnail URI must stay in the current visitor");
        }
    }
}
