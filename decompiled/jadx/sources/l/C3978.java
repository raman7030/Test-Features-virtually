package l;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ۘܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6K0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3978 extends AbstractC22967 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC17889 f12622;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC22967 f12623;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC13921 f12624;

    public C3978(AbstractC22967 abstractC22967, AbstractC13921 abstractC13921, InterfaceC17889 interfaceC17889) {
        this.f12623 = abstractC22967;
        this.f12624 = abstractC13921;
        this.f12622 = interfaceC17889;
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ᩻ */
    public final String mo6180() {
        return this.f12623.mo6180();
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ᩳ */
    public final String mo6177() {
        return this.f12623.mo6177();
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ᩴ */
    public final InputStream mo6178() {
        return this.f12623.mo6178();
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ᩵ */
    public final C11679 mo6179() {
        return this.f12623.mo6179();
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo6174() {
        return this.f12623.mo6174();
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo6175() {
        return this.f12623.mo6175();
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final File mo12024() {
        return this.f12623.mo12024();
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ֫ */
    public final void mo6173(OutputStream outputStream, boolean z, InterfaceC17066 interfaceC17066) throws IOException {
        this.f12623.mo6173(outputStream, z, interfaceC17066);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019c  */
    /* JADX WARN: Code duplicated, block: B:115:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:117:0x01be  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:128:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:147:0x0216  */
    /* JADX WARN: Code duplicated, block: B:157:0x01c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x0178 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x01e2 A[EXC_TOP_SPLITTER, PHI: r5 r12 r13
      0x01e2: PHI (r5v4 android.graphics.Bitmap) = (r5v3 android.graphics.Bitmap), (r5v39 android.graphics.Bitmap) binds: [B:132:0x01e0, B:110:0x01af] A[DONT_GENERATE, DONT_INLINE]
      0x01e2: PHI (r12v4 l.ۖܰۜ) = (r12v3 l.ۖܰۜ), (r12v6 l.ۖܰۜ) binds: [B:132:0x01e0, B:110:0x01af] A[DONT_GENERATE, DONT_INLINE]
      0x01e2: PHI (r13v2 l.᩶ۛۜ) = (r13v1 l.᩶ۛۜ), (r13v14 l.᩶ۛۜ) binds: [B:132:0x01e0, B:110:0x01af] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x01f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0110  */
    /* JADX WARN: Code duplicated, block: B:72:0x0153 A[Catch: all -> 0x017c, IOException | RuntimeException -> 0x017e, TryCatch #21 {IOException | RuntimeException -> 0x017e, all -> 0x017c, blocks: (B:64:0x010b, B:70:0x011a, B:72:0x0153, B:74:0x0157, B:76:0x0160, B:78:0x016b), top: B:184:0x010b }] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22262 m12023(C19981 c19981, long j, C21184 c21184) throws Throwable {
        C19981 c19982;
        MediaMetadataRetriever mediaMetadataRetriever;
        Bitmap bitmapCreateBitmap;
        C22097 c22097M46068;
        C2567 c2567;
        C22097 c22097M46069;
        boolean z;
        C2567 c2567M8111;
        int i;
        Bitmap bitmapCreateScaledBitmap;
        AbstractC22967.m51107(c21184);
        MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
        try {
            try {
                AbstractC13921 abstractC13921 = this.f12624;
                boolean z2 = abstractC13921 instanceof C2499;
                int i2 = 0;
                InterfaceC17889 interfaceC17889 = this.f12622;
                if (z2) {
                    AbstractC15440 abstractC15440Mo24433 = interfaceC17889.mo24433();
                    if (Build.VERSION.SDK_INT >= 23) {
                        c2567M8111 = C2567.m8112(mediaMetadataRetriever2, abstractC15440Mo24433, c21184);
                    } else {
                        if (abstractC15440Mo24433.m36488()) {
                            mediaMetadataRetriever2.setDataSource(abstractC15440Mo24433.mo23544());
                        } else if (abstractC15440Mo24433.mo31568()) {
                            mediaMetadataRetriever2.setDataSource(C4925.m14335(), abstractC15440Mo24433.mo31567());
                        } else {
                            c2567M8111 = null;
                            z = false;
                        }
                        c2567M8111 = null;
                    }
                    z = true;
                } else {
                    if (Build.VERSION.SDK_INT >= 23 && (abstractC13921 instanceof AbstractC3163)) {
                        AbstractC3163 abstractC3163 = (AbstractC3163) abstractC13921;
                        if (abstractC3163.mo9689() && interfaceC17889.getSize() > 0) {
                            c2567M8111 = C2567.m8111(mediaMetadataRetriever2, abstractC3163, interfaceC17889, c21184);
                            z = true;
                        }
                    }
                    z = false;
                    c2567M8111 = null;
                }
                c2567 = c2567M8111;
                try {
                    if (z) {
                        try {
                            try {
                                AbstractC22967.m51107(c21184);
                                try {
                                    i = Integer.parseInt(mediaMetadataRetriever2.extractMetadata(18));
                                } catch (NumberFormatException unused) {
                                    i = 0;
                                }
                                try {
                                    i2 = Integer.parseInt(mediaMetadataRetriever2.extractMetadata(19));
                                } catch (NumberFormatException unused2) {
                                }
                                if (i <= 0 || i2 <= 0) {
                                    c19982 = c19981;
                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                } else {
                                    double d = i;
                                    double d2 = i2;
                                    try {
                                        try {
                                            double dMin = Math.min(1.0d, Math.min(1280.0d / ((double) Math.max(i, i2)), Math.sqrt(Math.min(j, 4194304L) / ((d * 8.0d) * d2))));
                                            int iMax = Math.max(1, (int) (d * dMin));
                                            int iMax2 = Math.max(1, (int) (d2 * dMin));
                                            long j2 = ((long) iMax) * 8 * ((long) iMax2);
                                            int i3 = Build.VERSION.SDK_INT;
                                            long j3 = i3 >= 27 ? j2 : (((long) i) * 8 * ((long) i2)) + j2;
                                            if (j3 <= j) {
                                                c19982 = c19981;
                                                try {
                                                    c22097M46068 = c19982.m46068(j3);
                                                    if (c22097M46068 != null) {
                                                        if (i3 >= 27) {
                                                            try {
                                                                bitmapCreateBitmap = mediaMetadataRetriever2.getScaledFrameAtTime(-1L, 2, iMax, iMax2);
                                                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                                                try {
                                                                    AbstractC22967.m51107(c21184);
                                                                    if (bitmapCreateBitmap != null) {
                                                                        if (i3 < 27 && dMin < 1.0d) {
                                                                            double dMin2 = Math.min(1.0d, Math.sqrt(j2 / ((((double) bitmapCreateBitmap.getWidth()) * 8.0d) * ((double) bitmapCreateBitmap.getHeight()))));
                                                                            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, Math.max(1, (int) (((double) bitmapCreateBitmap.getWidth()) * dMin2)), Math.max(1, (int) (((double) bitmapCreateBitmap.getHeight()) * dMin2)), true);
                                                                            if (bitmapCreateScaledBitmap != bitmapCreateBitmap) {
                                                                                bitmapCreateBitmap.recycle();
                                                                            }
                                                                            bitmapCreateBitmap = bitmapCreateScaledBitmap;
                                                                        }
                                                                        if (bitmapCreateBitmap.getAllocationByteCount() <= j && c22097M46068.m49683(bitmapCreateBitmap.getAllocationByteCount())) {
                                                                            C22262 c22262 = new C22262(bitmapCreateBitmap, c22097M46068, 1);
                                                                            try {
                                                                                mediaMetadataRetriever.release();
                                                                            } catch (Exception unused3) {
                                                                            }
                                                                            if (c2567 != null) {
                                                                                try {
                                                                                    C9005.m23243((Object) c2567);
                                                                                } catch (Exception unused4) {
                                                                                }
                                                                            }
                                                                            return c22262;
                                                                        }
                                                                    }
                                                                } catch (IOException | RuntimeException unused5) {
                                                                    if (bitmapCreateBitmap != null) {
                                                                        bitmapCreateBitmap.recycle();
                                                                    }
                                                                    if (c22097M46068 != null) {
                                                                        c22097M46068.close();
                                                                    }
                                                                    try {
                                                                        mediaMetadataRetriever.release();
                                                                    } catch (Exception unused6) {
                                                                    }
                                                                    if (c2567 != null) {
                                                                        try {
                                                                            C9005.m23243((Object) c2567);
                                                                        } catch (Exception unused7) {
                                                                        }
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    if (bitmapCreateBitmap != null) {
                                                                        bitmapCreateBitmap.recycle();
                                                                    }
                                                                    if (c22097M46068 != null) {
                                                                        c22097M46068.close();
                                                                    }
                                                                    try {
                                                                        mediaMetadataRetriever.release();
                                                                    } catch (Exception unused8) {
                                                                    }
                                                                    if (c2567 != null) {
                                                                        throw th;
                                                                    }
                                                                    try {
                                                                        C9005.m23243((Object) c2567);
                                                                        throw th;
                                                                    } catch (Exception unused9) {
                                                                        throw th;
                                                                    }
                                                                }
                                                            } catch (IOException | RuntimeException unused10) {
                                                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                                                bitmapCreateBitmap = null;
                                                                if (bitmapCreateBitmap != null) {
                                                                    bitmapCreateBitmap.recycle();
                                                                }
                                                                if (c22097M46068 != null) {
                                                                    c22097M46068.close();
                                                                }
                                                                mediaMetadataRetriever.release();
                                                                if (c2567 != null) {
                                                                    C9005.m23243((Object) c2567);
                                                                }
                                                                AbstractC22967.m51107(c21184);
                                                                c22097M46069 = c19982.m46068(57600L);
                                                                if (c22097M46069 == null) {
                                                                    throw new C1095("No room for video placeholder");
                                                                }
                                                                try {
                                                                    bitmapCreateBitmap = Bitmap.createBitmap(DHParameters.DEFAULT_MINIMUM_LENGTH, 90, Bitmap.Config.ARGB_8888);
                                                                    bitmapCreateBitmap.eraseColor(-12303292);
                                                                    return new C22262(bitmapCreateBitmap, c22097M46069, 1);
                                                                } catch (OutOfMemoryError | RuntimeException e) {
                                                                    if (bitmapCreateBitmap != null) {
                                                                        bitmapCreateBitmap.recycle();
                                                                    }
                                                                    c22097M46069.close();
                                                                    throw e;
                                                                }
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                                                bitmapCreateBitmap = null;
                                                                if (bitmapCreateBitmap != null) {
                                                                    bitmapCreateBitmap.recycle();
                                                                }
                                                                if (c22097M46068 != null) {
                                                                    c22097M46068.close();
                                                                }
                                                                mediaMetadataRetriever.release();
                                                                if (c2567 != null) {
                                                                    throw th;
                                                                }
                                                                C9005.m23243((Object) c2567);
                                                                throw th;
                                                            }
                                                        } else {
                                                            mediaMetadataRetriever = mediaMetadataRetriever2;
                                                            try {
                                                                bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(-1L);
                                                                AbstractC22967.m51107(c21184);
                                                                if (bitmapCreateBitmap != null) {
                                                                    if (i3 < 27) {
                                                                        double dMin3 = Math.min(1.0d, Math.sqrt(j2 / ((((double) bitmapCreateBitmap.getWidth()) * 8.0d) * ((double) bitmapCreateBitmap.getHeight()))));
                                                                        bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, Math.max(1, (int) (((double) bitmapCreateBitmap.getWidth()) * dMin3)), Math.max(1, (int) (((double) bitmapCreateBitmap.getHeight()) * dMin3)), true);
                                                                        if (bitmapCreateScaledBitmap != bitmapCreateBitmap) {
                                                                            bitmapCreateBitmap.recycle();
                                                                        }
                                                                        bitmapCreateBitmap = bitmapCreateScaledBitmap;
                                                                    }
                                                                    if (bitmapCreateBitmap.getAllocationByteCount() <= j) {
                                                                        C22262 c22263 = new C22262(bitmapCreateBitmap, c22097M46068, 1);
                                                                        mediaMetadataRetriever.release();
                                                                        if (c2567 != null) {
                                                                            C9005.m23243((Object) c2567);
                                                                        }
                                                                        return c22263;
                                                                    }
                                                                }
                                                            } catch (IOException | RuntimeException unused11) {
                                                                bitmapCreateBitmap = null;
                                                                if (bitmapCreateBitmap != null) {
                                                                    bitmapCreateBitmap.recycle();
                                                                }
                                                                if (c22097M46068 != null) {
                                                                    c22097M46068.close();
                                                                }
                                                                mediaMetadataRetriever.release();
                                                                if (c2567 != null) {
                                                                    C9005.m23243((Object) c2567);
                                                                }
                                                                AbstractC22967.m51107(c21184);
                                                                c22097M46069 = c19982.m46068(57600L);
                                                                if (c22097M46069 == null) {
                                                                    throw new C1095("No room for video placeholder");
                                                                }
                                                                bitmapCreateBitmap = Bitmap.createBitmap(DHParameters.DEFAULT_MINIMUM_LENGTH, 90, Bitmap.Config.ARGB_8888);
                                                                bitmapCreateBitmap.eraseColor(-12303292);
                                                                return new C22262(bitmapCreateBitmap, c22097M46069, 1);
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                bitmapCreateBitmap = null;
                                                                if (bitmapCreateBitmap != null) {
                                                                    bitmapCreateBitmap.recycle();
                                                                }
                                                                if (c22097M46068 != null) {
                                                                    c22097M46068.close();
                                                                }
                                                                mediaMetadataRetriever.release();
                                                                if (c2567 != null) {
                                                                    throw th;
                                                                }
                                                                C9005.m23243((Object) c2567);
                                                                throw th;
                                                            }
                                                        }
                                                        AbstractC22967.m51107(c21184);
                                                        c22097M46069 = c19982.m46068(57600L);
                                                        if (c22097M46069 == null) {
                                                            throw new C1095("No room for video placeholder");
                                                        }
                                                        bitmapCreateBitmap = Bitmap.createBitmap(DHParameters.DEFAULT_MINIMUM_LENGTH, 90, Bitmap.Config.ARGB_8888);
                                                        bitmapCreateBitmap.eraseColor(-12303292);
                                                        return new C22262(bitmapCreateBitmap, c22097M46069, 1);
                                                    }
                                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                                    bitmapCreateBitmap = null;
                                                } catch (IOException | RuntimeException unused12) {
                                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                                    bitmapCreateBitmap = null;
                                                    c22097M46068 = null;
                                                    if (bitmapCreateBitmap != null) {
                                                        bitmapCreateBitmap.recycle();
                                                    }
                                                    if (c22097M46068 != null) {
                                                        c22097M46068.close();
                                                    }
                                                    mediaMetadataRetriever.release();
                                                    if (c2567 != null) {
                                                        C9005.m23243((Object) c2567);
                                                    }
                                                    AbstractC22967.m51107(c21184);
                                                    c22097M46069 = c19982.m46068(57600L);
                                                    if (c22097M46069 == null) {
                                                        throw new C1095("No room for video placeholder");
                                                    }
                                                    bitmapCreateBitmap = Bitmap.createBitmap(DHParameters.DEFAULT_MINIMUM_LENGTH, 90, Bitmap.Config.ARGB_8888);
                                                    bitmapCreateBitmap.eraseColor(-12303292);
                                                    return new C22262(bitmapCreateBitmap, c22097M46069, 1);
                                                }
                                            } else {
                                                c19982 = c19981;
                                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                            }
                                        } catch (IOException | RuntimeException unused13) {
                                            c19982 = c19981;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        mediaMetadataRetriever = mediaMetadataRetriever2;
                                        bitmapCreateBitmap = null;
                                        c22097M46068 = null;
                                        if (bitmapCreateBitmap != null) {
                                            bitmapCreateBitmap.recycle();
                                        }
                                        if (c22097M46068 != null) {
                                            c22097M46068.close();
                                        }
                                        mediaMetadataRetriever.release();
                                        if (c2567 != null) {
                                            throw th;
                                        }
                                        C9005.m23243((Object) c2567);
                                        throw th;
                                    }
                                }
                                bitmapCreateBitmap = null;
                                c22097M46068 = null;
                            } catch (Throwable th5) {
                                th = th5;
                                mediaMetadataRetriever = mediaMetadataRetriever2;
                            }
                        } catch (IOException | RuntimeException unused14) {
                            c19982 = c19981;
                            mediaMetadataRetriever = mediaMetadataRetriever2;
                        }
                    } else {
                        c19982 = c19981;
                        mediaMetadataRetriever = mediaMetadataRetriever2;
                        bitmapCreateBitmap = null;
                        c22097M46068 = null;
                    }
                    mediaMetadataRetriever.release();
                } catch (Exception unused15) {
                }
                if (bitmapCreateBitmap != null) {
                    bitmapCreateBitmap.recycle();
                }
                if (c22097M46068 != null) {
                    c22097M46068.close();
                }
                if (c2567 != null) {
                    C9005.m23243((Object) c2567);
                }
            } catch (Throwable th6) {
                th = th6;
                mediaMetadataRetriever = mediaMetadataRetriever2;
                bitmapCreateBitmap = null;
                c22097M46068 = null;
                c2567 = null;
            }
        } catch (IOException | RuntimeException unused16) {
            c19982 = c19981;
            mediaMetadataRetriever = mediaMetadataRetriever2;
            bitmapCreateBitmap = null;
            c22097M46068 = null;
            c2567 = null;
        }
        AbstractC22967.m51107(c21184);
        c22097M46069 = c19982.m46068(57600L);
        if (c22097M46069 == null) {
            throw new C1095("No room for video placeholder");
        }
        bitmapCreateBitmap = Bitmap.createBitmap(DHParameters.DEFAULT_MINIMUM_LENGTH, 90, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(-12303292);
        return new C22262(bitmapCreateBitmap, c22097M46069, 1);
    }
}
