package p067l;

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
public final class C6149 extends AbstractC24196 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19370 f15433;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC24196 f15434;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC15599 f15435;

    public C6149(AbstractC24196 abstractC24196, AbstractC15599 abstractC15599, InterfaceC19370 interfaceC19370) {
        this.f15434 = abstractC24196;
        this.f15435 = abstractC15599;
        this.f15433 = interfaceC19370;
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ᩻ */
    public final String mo8382() {
        return this.f15434.mo8382();
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ᩳ */
    public final String mo8379() {
        return this.f15434.mo8379();
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ᩴ */
    public final InputStream mo8380() {
        return this.f15434.mo8380();
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ᩵ */
    public final C13468 mo8381() {
        return this.f15434.mo8381();
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo8376() {
        return this.f15434.mo8376();
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo8377() {
        return this.f15434.mo8377();
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ܽ */
    public final File mo13948() {
        return this.f15434.mo13948();
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ֫ */
    public final void mo8375(OutputStream outputStream, boolean z, InterfaceC18588 interfaceC18588) throws IOException {
        this.f15434.mo8375(outputStream, z, interfaceC18588);
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
    /* JADX INFO: renamed from: ֫ */
    public final C23526 m13947(C21358 c21358, long j, C22502 c22502) throws Throwable {
        C21358 c21359;
        MediaMetadataRetriever mediaMetadataRetriever;
        Bitmap bitmapCreateBitmap;
        C23369 c23369M48382;
        C4808 c4808;
        C23369 c23369M48383;
        boolean z;
        C4808 c4808M10144;
        int i;
        Bitmap bitmapCreateScaledBitmap;
        AbstractC24196.m53499(c22502);
        MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
        try {
            try {
                AbstractC15599 abstractC15599 = this.f15435;
                boolean z2 = abstractC15599 instanceof C4744;
                int i2 = 0;
                InterfaceC19370 interfaceC19370 = this.f15433;
                if (z2) {
                    AbstractC17043 abstractC17043Mo26445 = interfaceC19370.mo26445();
                    if (Build.VERSION.SDK_INT >= 23) {
                        c4808M10144 = C4808.m10145(mediaMetadataRetriever2, abstractC17043Mo26445, c22502);
                    } else {
                        if (abstractC17043Mo26445.m38646()) {
                            mediaMetadataRetriever2.setDataSource(abstractC17043Mo26445.mo25495());
                        } else if (abstractC17043Mo26445.mo33653()) {
                            mediaMetadataRetriever2.setDataSource(C7050.m16232(), abstractC17043Mo26445.mo33652());
                        } else {
                            c4808M10144 = null;
                            z = false;
                        }
                        c4808M10144 = null;
                    }
                    z = true;
                } else {
                    if (Build.VERSION.SDK_INT >= 23 && (abstractC15599 instanceof AbstractC5375)) {
                        AbstractC5375 abstractC5375 = (AbstractC5375) abstractC15599;
                        if (abstractC5375.mo11733() && interfaceC19370.getSize() > 0) {
                            c4808M10144 = C4808.m10144(mediaMetadataRetriever2, abstractC5375, interfaceC19370, c22502);
                            z = true;
                        }
                    }
                    z = false;
                    c4808M10144 = null;
                }
                c4808 = c4808M10144;
                try {
                    if (z) {
                        try {
                            try {
                                AbstractC24196.m53499(c22502);
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
                                    c21359 = c21358;
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
                                                c21359 = c21358;
                                                try {
                                                    c23369M48382 = c21359.m48382(j3);
                                                    if (c23369M48382 != null) {
                                                        if (i3 >= 27) {
                                                            try {
                                                                bitmapCreateBitmap = mediaMetadataRetriever2.getScaledFrameAtTime(-1L, 2, iMax, iMax2);
                                                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                                                try {
                                                                    AbstractC24196.m53499(c22502);
                                                                    if (bitmapCreateBitmap != null) {
                                                                        if (i3 < 27 && dMin < 1.0d) {
                                                                            double dMin2 = Math.min(1.0d, Math.sqrt(j2 / ((((double) bitmapCreateBitmap.getWidth()) * 8.0d) * ((double) bitmapCreateBitmap.getHeight()))));
                                                                            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, Math.max(1, (int) (((double) bitmapCreateBitmap.getWidth()) * dMin2)), Math.max(1, (int) (((double) bitmapCreateBitmap.getHeight()) * dMin2)), true);
                                                                            if (bitmapCreateScaledBitmap != bitmapCreateBitmap) {
                                                                                bitmapCreateBitmap.recycle();
                                                                            }
                                                                            bitmapCreateBitmap = bitmapCreateScaledBitmap;
                                                                        }
                                                                        if (bitmapCreateBitmap.getAllocationByteCount() <= j && c23369M48382.m52021(bitmapCreateBitmap.getAllocationByteCount())) {
                                                                            C23526 c23526 = new C23526(bitmapCreateBitmap, c23369M48382, 1);
                                                                            try {
                                                                                mediaMetadataRetriever.release();
                                                                            } catch (Exception unused3) {
                                                                            }
                                                                            if (c4808 != null) {
                                                                                try {
                                                                                    C10927.m25187((Object) c4808);
                                                                                } catch (Exception unused4) {
                                                                                }
                                                                            }
                                                                            return c23526;
                                                                        }
                                                                    }
                                                                } catch (IOException | RuntimeException unused5) {
                                                                    if (bitmapCreateBitmap != null) {
                                                                        bitmapCreateBitmap.recycle();
                                                                    }
                                                                    if (c23369M48382 != null) {
                                                                        c23369M48382.close();
                                                                    }
                                                                    try {
                                                                        mediaMetadataRetriever.release();
                                                                    } catch (Exception unused6) {
                                                                    }
                                                                    if (c4808 != null) {
                                                                        try {
                                                                            C10927.m25187((Object) c4808);
                                                                        } catch (Exception unused7) {
                                                                        }
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    if (bitmapCreateBitmap != null) {
                                                                        bitmapCreateBitmap.recycle();
                                                                    }
                                                                    if (c23369M48382 != null) {
                                                                        c23369M48382.close();
                                                                    }
                                                                    try {
                                                                        mediaMetadataRetriever.release();
                                                                    } catch (Exception unused8) {
                                                                    }
                                                                    if (c4808 != null) {
                                                                        throw th;
                                                                    }
                                                                    try {
                                                                        C10927.m25187((Object) c4808);
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
                                                                if (c23369M48382 != null) {
                                                                    c23369M48382.close();
                                                                }
                                                                mediaMetadataRetriever.release();
                                                                if (c4808 != null) {
                                                                    C10927.m25187((Object) c4808);
                                                                }
                                                                AbstractC24196.m53499(c22502);
                                                                c23369M48383 = c21359.m48382(57600L);
                                                                if (c23369M48383 == null) {
                                                                    throw new C3409("No room for video placeholder");
                                                                }
                                                                try {
                                                                    bitmapCreateBitmap = Bitmap.createBitmap(DHParameters.DEFAULT_MINIMUM_LENGTH, 90, Bitmap.Config.ARGB_8888);
                                                                    bitmapCreateBitmap.eraseColor(-12303292);
                                                                    return new C23526(bitmapCreateBitmap, c23369M48383, 1);
                                                                } catch (OutOfMemoryError | RuntimeException e) {
                                                                    if (bitmapCreateBitmap != null) {
                                                                        bitmapCreateBitmap.recycle();
                                                                    }
                                                                    c23369M48383.close();
                                                                    throw e;
                                                                }
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                                                bitmapCreateBitmap = null;
                                                                if (bitmapCreateBitmap != null) {
                                                                    bitmapCreateBitmap.recycle();
                                                                }
                                                                if (c23369M48382 != null) {
                                                                    c23369M48382.close();
                                                                }
                                                                mediaMetadataRetriever.release();
                                                                if (c4808 != null) {
                                                                    throw th;
                                                                }
                                                                C10927.m25187((Object) c4808);
                                                                throw th;
                                                            }
                                                        } else {
                                                            mediaMetadataRetriever = mediaMetadataRetriever2;
                                                            try {
                                                                bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(-1L);
                                                                AbstractC24196.m53499(c22502);
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
                                                                        C23526 c23527 = new C23526(bitmapCreateBitmap, c23369M48382, 1);
                                                                        mediaMetadataRetriever.release();
                                                                        if (c4808 != null) {
                                                                            C10927.m25187((Object) c4808);
                                                                        }
                                                                        return c23527;
                                                                    }
                                                                }
                                                            } catch (IOException | RuntimeException unused11) {
                                                                bitmapCreateBitmap = null;
                                                                if (bitmapCreateBitmap != null) {
                                                                    bitmapCreateBitmap.recycle();
                                                                }
                                                                if (c23369M48382 != null) {
                                                                    c23369M48382.close();
                                                                }
                                                                mediaMetadataRetriever.release();
                                                                if (c4808 != null) {
                                                                    C10927.m25187((Object) c4808);
                                                                }
                                                                AbstractC24196.m53499(c22502);
                                                                c23369M48383 = c21359.m48382(57600L);
                                                                if (c23369M48383 == null) {
                                                                    throw new C3409("No room for video placeholder");
                                                                }
                                                                bitmapCreateBitmap = Bitmap.createBitmap(DHParameters.DEFAULT_MINIMUM_LENGTH, 90, Bitmap.Config.ARGB_8888);
                                                                bitmapCreateBitmap.eraseColor(-12303292);
                                                                return new C23526(bitmapCreateBitmap, c23369M48383, 1);
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                bitmapCreateBitmap = null;
                                                                if (bitmapCreateBitmap != null) {
                                                                    bitmapCreateBitmap.recycle();
                                                                }
                                                                if (c23369M48382 != null) {
                                                                    c23369M48382.close();
                                                                }
                                                                mediaMetadataRetriever.release();
                                                                if (c4808 != null) {
                                                                    throw th;
                                                                }
                                                                C10927.m25187((Object) c4808);
                                                                throw th;
                                                            }
                                                        }
                                                        AbstractC24196.m53499(c22502);
                                                        c23369M48383 = c21359.m48382(57600L);
                                                        if (c23369M48383 == null) {
                                                            throw new C3409("No room for video placeholder");
                                                        }
                                                        bitmapCreateBitmap = Bitmap.createBitmap(DHParameters.DEFAULT_MINIMUM_LENGTH, 90, Bitmap.Config.ARGB_8888);
                                                        bitmapCreateBitmap.eraseColor(-12303292);
                                                        return new C23526(bitmapCreateBitmap, c23369M48383, 1);
                                                    }
                                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                                    bitmapCreateBitmap = null;
                                                } catch (IOException | RuntimeException unused12) {
                                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                                    bitmapCreateBitmap = null;
                                                    c23369M48382 = null;
                                                    if (bitmapCreateBitmap != null) {
                                                        bitmapCreateBitmap.recycle();
                                                    }
                                                    if (c23369M48382 != null) {
                                                        c23369M48382.close();
                                                    }
                                                    mediaMetadataRetriever.release();
                                                    if (c4808 != null) {
                                                        C10927.m25187((Object) c4808);
                                                    }
                                                    AbstractC24196.m53499(c22502);
                                                    c23369M48383 = c21359.m48382(57600L);
                                                    if (c23369M48383 == null) {
                                                        throw new C3409("No room for video placeholder");
                                                    }
                                                    bitmapCreateBitmap = Bitmap.createBitmap(DHParameters.DEFAULT_MINIMUM_LENGTH, 90, Bitmap.Config.ARGB_8888);
                                                    bitmapCreateBitmap.eraseColor(-12303292);
                                                    return new C23526(bitmapCreateBitmap, c23369M48383, 1);
                                                }
                                            } else {
                                                c21359 = c21358;
                                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                            }
                                        } catch (IOException | RuntimeException unused13) {
                                            c21359 = c21358;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        mediaMetadataRetriever = mediaMetadataRetriever2;
                                        bitmapCreateBitmap = null;
                                        c23369M48382 = null;
                                        if (bitmapCreateBitmap != null) {
                                            bitmapCreateBitmap.recycle();
                                        }
                                        if (c23369M48382 != null) {
                                            c23369M48382.close();
                                        }
                                        mediaMetadataRetriever.release();
                                        if (c4808 != null) {
                                            throw th;
                                        }
                                        C10927.m25187((Object) c4808);
                                        throw th;
                                    }
                                }
                                bitmapCreateBitmap = null;
                                c23369M48382 = null;
                            } catch (Throwable th5) {
                                th = th5;
                                mediaMetadataRetriever = mediaMetadataRetriever2;
                            }
                        } catch (IOException | RuntimeException unused14) {
                            c21359 = c21358;
                            mediaMetadataRetriever = mediaMetadataRetriever2;
                        }
                    } else {
                        c21359 = c21358;
                        mediaMetadataRetriever = mediaMetadataRetriever2;
                        bitmapCreateBitmap = null;
                        c23369M48382 = null;
                    }
                    mediaMetadataRetriever.release();
                } catch (Exception unused15) {
                }
                if (bitmapCreateBitmap != null) {
                    bitmapCreateBitmap.recycle();
                }
                if (c23369M48382 != null) {
                    c23369M48382.close();
                }
                if (c4808 != null) {
                    C10927.m25187((Object) c4808);
                }
            } catch (Throwable th6) {
                th = th6;
                mediaMetadataRetriever = mediaMetadataRetriever2;
                bitmapCreateBitmap = null;
                c23369M48382 = null;
                c4808 = null;
            }
        } catch (IOException | RuntimeException unused16) {
            c21359 = c21358;
            mediaMetadataRetriever = mediaMetadataRetriever2;
            bitmapCreateBitmap = null;
            c23369M48382 = null;
            c4808 = null;
        }
        AbstractC24196.m53499(c22502);
        c23369M48383 = c21359.m48382(57600L);
        if (c23369M48383 == null) {
            throw new C3409("No room for video placeholder");
        }
        bitmapCreateBitmap = Bitmap.createBitmap(DHParameters.DEFAULT_MINIMUM_LENGTH, 90, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(-12303292);
        return new C23526(bitmapCreateBitmap, c23369M48383, 1);
    }
}
