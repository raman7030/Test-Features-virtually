package p067l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.plus.R;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ܿܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 53XL */
/* JADX INFO: loaded from: classes4.dex */
public final class C18950 {

    /* JADX INFO: renamed from: ֫ */
    public static final Paint f56490 = new Paint(1);

    /* JADX INFO: renamed from: ۧ */
    public static final int f56491 = C13076.m29939(32.0f);

    /* JADX INFO: renamed from: ܽ */
    public static WeakReference f56492;

    /* JADX INFO: renamed from: ֫ */
    public static Bitmap m43040(InterfaceC12916 interfaceC12916) {
        int i;
        Bitmap bitmapM43046;
        if (interfaceC12916 != null) {
            final BitmapFactory.Options options = new BitmapFactory.Options();
            try {
                final C19621 c19621 = new C19621(interfaceC12916);
                int iMax = 1;
                try {
                    options.inJustDecodeBounds = true;
                    C12028 c12028M18539 = C8004.m18539(c19621.f59666, new InterfaceC14709() { // from class: l.ۨۡۡ
                        @Override // p067l.InterfaceC14709
                        public final BitmapFactory.Options read() throws IOException {
                            InputStream inputStreamM44522 = c19621.m44522(true);
                            BitmapFactory.Options options2 = options;
                            BitmapFactory.decodeStream(inputStreamM44522, null, options2);
                            return options2;
                        }
                    });
                    EnumC14039 enumC14039 = c12028M18539.f33529;
                    if (enumC14039 != EnumC14039.UNKNOWN) {
                        if (enumC14039 == EnumC14039.SVG) {
                            bitmapM43046 = m43039(c19621.m44522(false));
                        } else if (enumC14039 != EnumC14039.TGA) {
                            if (c12028M18539.f33528 == null) {
                                BitmapFactory.decodeStream(c19621.m44522(true), null, options);
                            }
                            int i2 = options.outWidth;
                            int i3 = options.outHeight;
                            if (i2 > 0 && i3 > 0) {
                                try {
                                    int iM22363 = new C9596(c19621.m44522(true), 0).m22363();
                                    if (iM22363 == 3) {
                                        i = 180;
                                    } else if (iM22363 != 6) {
                                        i = iM22363 != 8 ? 0 : BottomAppBarTopEdgeTreatment.ANGLE_UP;
                                    } else {
                                        i = 90;
                                    }
                                } catch (Exception unused) {
                                }
                                int i4 = f56491;
                                if (i2 <= i3 && i2 > i4) {
                                    iMax = Math.max(1, i2 / i4);
                                } else if (i2 >= i3 && i3 > i4) {
                                    iMax = Math.max(1, i3 / i4);
                                }
                                options.inJustDecodeBounds = false;
                                options.inSampleSize = iMax;
                                options.inPreferredConfig = Bitmap.Config.ARGB_4444;
                                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(c19621.m44522(false), null, options);
                                if (bitmapDecodeStream != null) {
                                    Bitmap bitmapM43044 = m43044(bitmapDecodeStream, i4, i2, i3);
                                    if (i != 0) {
                                        Matrix matrix = new Matrix();
                                        matrix.postRotate(i);
                                        bitmapM43044 = Bitmap.createBitmap(bitmapM43044, 0, 0, bitmapM43044.getWidth(), bitmapM43044.getHeight(), matrix, false);
                                    }
                                    m43049(bitmapM43044);
                                    c19621.close();
                                    return bitmapM43044;
                                }
                                c19621.close();
                            }
                        } else if (interfaceC12916.length() <= 268435456) {
                            bitmapM43046 = m43046(c19621.m44522(false));
                            m43049(bitmapM43046);
                        }
                        c19621.close();
                        return bitmapM43046;
                    }
                    c19621.close();
                    return null;
                } catch (Throwable th) {
                    try {
                        c19621.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005f A[LOOP:0: B:12:0x0052->B:14:0x005f, LOOP_END] */
    /* JADX INFO: renamed from: ۧ */
    public static Bitmap m43046(InputStream inputStream) throws Throwable {
        float f;
        float f2;
        float f3;
        int i;
        Bitmap bitmapM53284;
        Bitmap bitmap;
        Bitmap bitmapCreateBitmap;
        C11971 c11971M53285 = C24040.m53285(inputStream);
        int i2 = c11971M53285.f33380;
        int i3 = c11971M53285.f33383;
        int iMax = Math.max(i2, i3);
        int iMin = Math.min(i2, i3);
        int i4 = f56491;
        try {
            try {
                if (iMax <= 500) {
                    if (iMax > i4) {
                        f2 = iMin;
                        if (iMax / f2 > 3.0f) {
                            f3 = i4 / 3.0f;
                        }
                        float f4 = i4;
                        double d = f4 / f;
                        int iMin2 = Math.min(i2, (int) Math.ceil(d));
                        int iMin3 = Math.min(i3, (int) Math.ceil(d));
                        int i5 = (i2 - iMin2) / 2;
                        int i6 = (i3 - iMin3) / 2;
                        Rect rect = new Rect(i5, i6, i5 + iMin2, i6 + iMin3);
                        i = 1;
                        while (i * 2.0f * f <= 1.0f) {
                            i *= 2;
                        }
                        bitmapM53284 = C24040.m53284(inputStream, c11971M53285, rect, i, new C24119());
                        bitmap = null;
                        bitmapCreateBitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
                        float f5 = iMin2 * f;
                        float f6 = iMin3 * f;
                        Paint paint = new Paint();
                        paint.setFilterBitmap(false);
                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapM53284, (Rect) null, new RectF((f4 - f5) / 2.0f, (f4 - f6) / 2.0f, (f5 + f4) / 2.0f, (f4 + f6) / 2.0f), paint);
                        bitmapM53284.recycle();
                        return bitmapCreateBitmap;
                    }
                    f = i4 / iMax;
                    float f7 = i4;
                    double d2 = f7 / f;
                    int iMin4 = Math.min(i2, (int) Math.ceil(d2));
                    int iMin5 = Math.min(i3, (int) Math.ceil(d2));
                    int i7 = (i2 - iMin4) / 2;
                    int i8 = (i3 - iMin5) / 2;
                    Rect rect2 = new Rect(i7, i8, i7 + iMin4, i8 + iMin5);
                    i = 1;
                    while (i * 2.0f * f <= 1.0f) {
                        i *= 2;
                    }
                    bitmapM53284 = C24040.m53284(inputStream, c11971M53285, rect2, i, new C24119());
                    bitmap = null;
                    bitmapCreateBitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
                    float f8 = iMin4 * f;
                    float f9 = iMin5 * f;
                    Paint paint2 = new Paint();
                    paint2.setFilterBitmap(false);
                    new Canvas(bitmapCreateBitmap).drawBitmap(bitmapM53284, (Rect) null, new RectF((f7 - f8) / 2.0f, (f7 - f9) / 2.0f, (f8 + f7) / 2.0f, (f7 + f9) / 2.0f), paint2);
                    bitmapM53284.recycle();
                    return bitmapCreateBitmap;
                }
                f3 = i4;
                f2 = iMin;
                Paint paint3 = new Paint();
                paint3.setFilterBitmap(false);
                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapM53284, (Rect) null, new RectF((f7 - f8) / 2.0f, (f7 - f9) / 2.0f, (f8 + f7) / 2.0f, (f7 + f9) / 2.0f), paint3);
                bitmapM53284.recycle();
                return bitmapCreateBitmap;
            } catch (Throwable th) {
                th = th;
                bitmap = bitmapCreateBitmap;
                bitmapM53284.recycle();
                if (bitmap != null) {
                    bitmap.recycle();
                }
                throw th;
            }
            bitmapCreateBitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
            float f10 = iMin4 * f;
            float f11 = iMin5 * f;
        } catch (Throwable th2) {
            th = th2;
        }
        f = f3 / f2;
        float f12 = i4;
        double d3 = f12 / f;
        int iMin6 = Math.min(i2, (int) Math.ceil(d3));
        int iMin7 = Math.min(i3, (int) Math.ceil(d3));
        int i9 = (i2 - iMin6) / 2;
        int i10 = (i3 - iMin7) / 2;
        Rect rect3 = new Rect(i9, i10, i9 + iMin6, i10 + iMin7);
        i = 1;
        while (i * 2.0f * f <= 1.0f) {
            i *= 2;
        }
        bitmapM53284 = C24040.m53284(inputStream, c11971M53285, rect3, i, new C24119());
        bitmap = null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static Bitmap m43047(InterfaceC12916 interfaceC12916) {
        C14281 c14281;
        XmlResourceParserC12128 xmlResourceParserC12128M38154;
        C17117 c17117M38746;
        if (interfaceC12916 != null) {
            try {
                if (interfaceC12916.length() <= 153600) {
                    InputStream inputStreamMo12627 = interfaceC12916.mo12627();
                    try {
                        inputStreamMo12627.mark(4);
                        if ((inputStreamMo12627.read() & 255) == 3 && (inputStreamMo12627.read() & 255) == 0) {
                            inputStreamMo12627.reset();
                            if (interfaceC12916 instanceof InterfaceC15401) {
                                c14281 = ((InterfaceC15401) interfaceC12916).mo12628();
                                int i = C17117.f50558;
                                xmlResourceParserC12128M38154 = C16820.m38130(inputStreamMo12627).m38154();
                            } else {
                                c14281 = new C14281();
                                int i2 = C17117.f50558;
                                xmlResourceParserC12128M38154 = C16820.m38130(inputStreamMo12627).m38154();
                            }
                            try {
                                c17117M38746 = C17117.m38746(xmlResourceParserC12128M38154, c14281, false);
                            } catch (Exception unused) {
                                c17117M38746 = null;
                            }
                            inputStreamMo12627.close();
                            if (c17117M38746 != null) {
                                int i3 = f56491;
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(bitmapCreateBitmap);
                                Rect rectCopyBounds = c17117M38746.copyBounds();
                                int intrinsicWidth = c17117M38746.getIntrinsicWidth();
                                int intrinsicHeight = c17117M38746.getIntrinsicHeight();
                                if (intrinsicWidth > intrinsicHeight) {
                                    int i4 = (int) ((i3 / intrinsicWidth) * intrinsicHeight);
                                    int i5 = (i3 - i4) / 2;
                                    c17117M38746.setBounds(0, i5, i3, i4 + i5);
                                } else {
                                    int i6 = (int) ((i3 / intrinsicHeight) * intrinsicWidth);
                                    int i7 = (i3 - i6) / 2;
                                    c17117M38746.setBounds(i7, 0, i6 + i7, i3);
                                }
                                c17117M38746.draw(canvas);
                                c17117M38746.setBounds(rectCopyBounds);
                                m43049(bitmapCreateBitmap);
                                return bitmapCreateBitmap;
                            }
                        }
                        inputStreamMo12627.close();
                        return null;
                    } catch (Throwable th) {
                        try {
                            inputStreamMo12627.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Bitmap m43039(InputStream inputStream) {
        int i;
        try {
            C17871 c17871M40609 = C17871.m40609(inputStream);
            RectF rectFM40623 = c17871M40609.m40623();
            int iM40625 = (int) c17871M40609.m40625();
            int iM40620 = (int) c17871M40609.m40620();
            if (iM40625 == -1 && iM40620 == -1) {
                iM40625 = (int) (rectFM40623.right - rectFM40623.left);
                iM40620 = (int) (rectFM40623.bottom - rectFM40623.top);
            } else if (rectFM40623 == null) {
                c17871M40609.m40615(iM40625, iM40620);
            }
            if (iM40625 > 0 && iM40620 > 0) {
                int i2 = f56491;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                RectF rectF = new RectF();
                if (iM40625 > iM40620) {
                    float f = i2;
                    i = (int) ((f / iM40625) * iM40620);
                    int i3 = (i2 - i) / 2;
                    rectF.set(0.0f, i3, f, i3 + i);
                } else {
                    float f2 = i2;
                    int i4 = (int) ((f2 / iM40620) * iM40625);
                    int i5 = (i2 - i4) / 2;
                    rectF.set(i5, 0.0f, i5 + i4, f2);
                    i = i2;
                    i2 = i4;
                }
                c17871M40609.m40621(i2);
                c17871M40609.m40614(i);
                c17871M40609.m40617(canvas, rectF);
                m43049(bitmapCreateBitmap);
                return bitmapCreateBitmap;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:39:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ܿ */
    public static Bitmap m43051(AbstractC17043 abstractC17043) {
        AbstractC17043 abstractC17043M38685;
        Bitmap frameAtTime;
        boolean zM46139 = C20450.m46139(abstractC17043.mo25505());
        int i = f56491;
        if (!zM46139) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    if (abstractC17043.m38646()) {
                        mediaMetadataRetriever.setDataSource(abstractC17043.mo25495());
                    } else if (abstractC17043.mo33653()) {
                        mediaMetadataRetriever.setDataSource(C7050.m16232(), abstractC17043.mo33652());
                    } else if (Build.VERSION.SDK_INT >= 23) {
                        mediaMetadataRetriever.setDataSource(new C24139(abstractC17043));
                    } else {
                        if (abstractC17043.mo25101() <= 524288) {
                            abstractC17043M38685 = C17853.f53278.m38685();
                            try {
                                abstractC17043.m38658(abstractC17043M38685, (C19056) null, (InterfaceC7717) null);
                                mediaMetadataRetriever.setDataSource(abstractC17043M38685.mo25505());
                                frameAtTime = mediaMetadataRetriever.getFrameAtTime(-1L);
                                mediaMetadataRetriever.release();
                                if (abstractC17043M38685 != null) {
                                    abstractC17043M38685.mo25503();
                                }
                            } catch (Throwable unused) {
                                try {
                                    mediaMetadataRetriever.release();
                                } catch (Exception unused2) {
                                }
                                if (abstractC17043M38685 != null) {
                                    abstractC17043M38685.mo25503();
                                }
                                frameAtTime = null;
                            }
                            if (frameAtTime == null) {
                                return null;
                            }
                            return m43044(frameAtTime, i, frameAtTime.getWidth(), frameAtTime.getHeight());
                        }
                        mediaMetadataRetriever.setDataSource(abstractC17043.mo25505());
                    }
                    mediaMetadataRetriever.release();
                } catch (Exception unused3) {
                }
                abstractC17043M38685 = null;
                frameAtTime = mediaMetadataRetriever.getFrameAtTime(-1L);
                if (abstractC17043M38685 != null) {
                    abstractC17043M38685.mo25503();
                }
            } catch (Throwable unused4) {
                abstractC17043M38685 = null;
            }
            if (frameAtTime == null) {
                return null;
            }
            return m43044(frameAtTime, i, frameAtTime.getWidth(), frameAtTime.getHeight());
        }
        return C20450.m46130(abstractC17043, i).m26938();
    }

    /* JADX INFO: renamed from: ܽ */
    public static C11733 m43050(AbstractC17043 abstractC17043) {
        return C20450.m46130(abstractC17043, f56491);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۧ */
    public static Bitmap m43045(MediaDataSource mediaDataSource) {
        Bitmap frameAtTime;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(mediaDataSource);
                frameAtTime = mediaMetadataRetriever.getFrameAtTime(-1L);
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception unused) {
                }
            } catch (Throwable unused2) {
                mediaMetadataRetriever.release();
                frameAtTime = null;
                if (frameAtTime == null) {
                    return null;
                }
                return m43044(frameAtTime, f56491, frameAtTime.getWidth(), frameAtTime.getHeight());
            }
        } catch (Exception unused3) {
            frameAtTime = null;
        }
        if (frameAtTime == null) {
            return null;
        }
        return m43044(frameAtTime, f56491, frameAtTime.getWidth(), frameAtTime.getHeight());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11733 m43042(MediaDataSource mediaDataSource) {
        return C20450.m46128(mediaDataSource, f56491);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Bitmap m43038(Bitmap bitmap, int i, int i2, int i3) {
        return m43044(bitmap, i, i2, i3);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static Bitmap m43052(AbstractC17043 abstractC17043) throws Throwable {
        C19561 c19561;
        C19561 c19562 = null;
        try {
            c19561 = new C19561(abstractC17043);
            try {
                Bitmap bitmapM41519 = C18249.m41519(c19561);
                if (bitmapM41519 != null) {
                    m43043(bitmapM41519);
                    C2700.m4192(c19561);
                    return bitmapM41519;
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                th = th;
                c19562 = c19561;
                C2700.m4192(c19562);
                throw th;
            }
        } catch (IOException unused2) {
            c19561 = null;
        } catch (Throwable th2) {
            th = th2;
        }
        C2700.m4192(c19561);
        WeakReference weakReference = f56492;
        Bitmap bitmap = weakReference != null ? (Bitmap) weakReference.get() : null;
        if (bitmap != null) {
            return bitmap;
        }
        Drawable drawableM16202 = C7050.m16202(R.drawable.MT_Protector);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i = f56491;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect rectCopyBounds = drawableM16202.copyBounds();
        drawableM16202.setBounds(0, 0, i, i);
        drawableM16202.draw(canvas);
        drawableM16202.setBounds(rectCopyBounds);
        f56492 = new WeakReference(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Bitmap m43041(AbstractC17043 abstractC17043) {
        C6190 c6190M45791 = C20272.m45791(abstractC17043);
        if (c6190M45791 == null) {
            return null;
        }
        Drawable drawableM14010 = c6190M45791.m14010();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i = f56491;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect rectCopyBounds = drawableM14010.copyBounds();
        int intrinsicWidth = drawableM14010.getIntrinsicWidth();
        int intrinsicHeight = drawableM14010.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            intrinsicWidth = i;
            intrinsicHeight = intrinsicWidth;
        }
        try {
            drawableM14010.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            float f = i;
            canvas.scale(f / intrinsicWidth, f / intrinsicHeight);
            drawableM14010.draw(canvas);
            drawableM14010.setBounds(rectCopyBounds);
            m43043(bitmapCreateBitmap);
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            drawableM14010.setBounds(rectCopyBounds);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x011d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0124  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11, types: [l.ܶ᩵ܿ] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ܶ᩵ܿ] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.ܶ᩵ܿ] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r5v0, types: [l.ᩳܰۡ] */
    /* JADX INFO: renamed from: ۧ */
    public static Bitmap m43048(AbstractC17043 abstractC17043) throws Throwable {
        ?? r0;
        JSONObject jSONObject;
        String string;
        ?? r1;
        C5738 entry;
        ?? M38693 = "base.apk";
        ?? r4 = 0;
        try {
            try {
                ?? c19561 = new C19561(abstractC17043);
                try {
                    try {
                        jSONObject = new JSONObject(new String(c19561.m44452(c19561.m44470("manifest.json"), null), StandardCharsets.UTF_8));
                    } catch (Throwable th) {
                        th = th;
                        M38693 = 0;
                    }
                } catch (Exception unused) {
                    jSONObject = null;
                }
                int i = 0;
                if (jSONObject != null && jSONObject.contains("icon")) {
                    try {
                        byte[] bArrM44452 = c19561.m44452(c19561.getEntry(jSONObject.getString("icon")), null);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(C7050.m16235(), BitmapFactory.decodeByteArray(bArrM44452, 0, bArrM44452.length));
                        int i2 = f56491;
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        Rect rectCopyBounds = bitmapDrawable.copyBounds();
                        bitmapDrawable.setBounds(0, 0, i2, i2);
                        bitmapDrawable.draw(canvas);
                        bitmapDrawable.setBounds(rectCopyBounds);
                        m43043(bitmapCreateBitmap);
                        c19561.close();
                        return bitmapCreateBitmap;
                    } catch (Exception unused2) {
                    }
                }
                if (jSONObject == null || !jSONObject.contains("split_apks")) {
                    string = null;
                    break;
                }
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("split_apks");
                    int size = jSONArray.size();
                    while (true) {
                        if (i >= size) {
                            string = null;
                            break;
                        }
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        if (jSONObject2.contains("id") && jSONObject2.getString("id").equals("base")) {
                            string = jSONObject2.getString("file");
                            break;
                        }
                        i++;
                        string = null;
                        break;
                    }
                } catch (Exception unused3) {
                }
                if (string != null || c19561.getEntry("base.apk") == null) {
                    r1 = string;
                }
                if (r1 == 0) {
                    C18189 c18189Min = C7480.stream(c19561.m44469()).map(new C8678(2)).filter(new C2430(5)).min(C10162.comparingInt(new C16927()));
                    if (c18189Min.isPresent()) {
                        r1 = M38693;
                        r1 = (String) c18189Min.get();
                    }
                }
                if (r1 != 0 && (entry = c19561.getEntry(r1)) != null) {
                    M38693 = C17853.f53280.m38693(".apk");
                    try {
                        M38693.m38651(c19561.m44448(entry));
                        Bitmap bitmapM43041 = m43041((AbstractC17043) M38693);
                        c19561.close();
                        M38693.mo25503();
                        return bitmapM43041;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    c19561.close();
                    return null;
                }
                try {
                    c19561.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th;
            } catch (Exception unused4) {
                r0 = M38693;
                if (r0 != 0) {
                    r0.mo25503();
                }
                return null;
            } catch (Throwable th4) {
                th = th4;
                r4 = M38693;
                if (r4 != 0) {
                    r4.mo25503();
                }
                throw th;
            }
        } catch (Exception unused5) {
            r0 = 0;
            if (r0 != 0) {
                r0.mo25503();
            }
        } catch (Throwable th5) {
            th = th5;
            if (r4 != 0) {
                r4.mo25503();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m43049(Bitmap bitmap) {
        int iM21978;
        if (C12147.m28069(bitmap) <= 0.9f && (iM21978 = C9464.m21978(bitmap)) != 0) {
            if (C9464.m21981(iM21978, -328966)) {
                C12147.m28070(bitmap, 2.5f, 1, 1, -1442840576);
            } else if (C9464.m21981(iM21978, -13619152)) {
                C12147.m28070(bitmap, 3.5f, 1, 1, -1);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43043(Bitmap bitmap) {
        int iM21978;
        if (C12147.m28069(bitmap) <= 0.9f && (iM21978 = C9464.m21978(bitmap)) != 0) {
            if (C9464.m21981(iM21978, -328966)) {
                C12147.m28070(bitmap, 1.0f, 0, 0, -1434419072);
            } else if (C9464.m21981(iM21978, -13619152)) {
                C12147.m28070(bitmap, 2.0f, 0, 0, -1432313696);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0038  */
    /* JADX INFO: renamed from: ۧ */
    public static Bitmap m43044(Bitmap bitmap, int i, int i2, int i3) {
        float f;
        float f2;
        float f3;
        float f4;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > height) {
            f = width;
            f2 = height;
        } else {
            f = height;
            f2 = width;
        }
        if (Math.max(i2, i3) <= 500) {
            float f5 = i;
            if (f < f5) {
                f3 = f5 / f;
            } else if (f <= f5) {
                f3 = 1.0f;
            } else if (f / f2 <= 3.0f) {
                f3 = f5 / f;
            } else {
                f4 = f5 / 3.0f;
            }
            if (f3 != 1.0f) {
                Matrix matrix = new Matrix();
                matrix.postScale(f3, f3);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                bitmap.recycle();
                width = bitmapCreateBitmap.getWidth();
                height = bitmapCreateBitmap.getHeight();
                bitmap = bitmapCreateBitmap;
            }
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            new Canvas(bitmapCreateBitmap2).drawBitmap(bitmap, (i - width) / 2.0f, (i - height) / 2.0f, f56490);
            bitmap.recycle();
            return bitmapCreateBitmap2;
        }
        f4 = i;
        f3 = f4 / f2;
        if (f3 != 1.0f) {
            Matrix matrix2 = new Matrix();
            matrix2.postScale(f3, f3);
            Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix2, true);
            bitmap.recycle();
            width = bitmapCreateBitmap3.getWidth();
            height = bitmapCreateBitmap3.getHeight();
            bitmap = bitmapCreateBitmap3;
        }
        Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap4).drawBitmap(bitmap, (i - width) / 2.0f, (i - height) / 2.0f, f56490);
        bitmap.recycle();
        return bitmapCreateBitmap4;
    }
}
