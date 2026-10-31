package l;

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
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ܿܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 53XL */
/* JADX INFO: loaded from: classes4.dex */
public final class C17447 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Paint f53302 = new Paint(1);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int f53303 = C11266.m27878(32.0f);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static WeakReference f53304;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m40782(InterfaceC11098 interfaceC11098) {
        int i;
        Bitmap bitmapM40788;
        if (interfaceC11098 != null) {
            final BitmapFactory.Options options = new BitmapFactory.Options();
            try {
                final C18153 c18153 = new C18153(interfaceC11098);
                int iMax = 1;
                try {
                    options.inJustDecodeBounds = true;
                    C10164 c10164M16613 = C5930.m16613(c18153.f56451, new InterfaceC12985() { // from class: l.ۨۡۡ
                        @Override // l.InterfaceC12985
                        public final BitmapFactory.Options read() throws IOException {
                            InputStream inputStreamM42261 = c18153.m42261(true);
                            BitmapFactory.Options options2 = options;
                            BitmapFactory.decodeStream(inputStreamM42261, null, options2);
                            return options2;
                        }
                    });
                    EnumC12280 enumC12280 = c10164M16613.f30567;
                    if (enumC12280 != EnumC12280.UNKNOWN) {
                        if (enumC12280 == EnumC12280.SVG) {
                            bitmapM40788 = m40781(c18153.m42261(false));
                        } else if (enumC12280 != EnumC12280.TGA) {
                            if (c10164M16613.f30566 == null) {
                                BitmapFactory.decodeStream(c18153.m42261(true), null, options);
                            }
                            int i2 = options.outWidth;
                            int i3 = options.outHeight;
                            if (i2 > 0 && i3 > 0) {
                                try {
                                    int iM20384 = new C7605(c18153.m42261(true), 0).m20384();
                                    if (iM20384 == 3) {
                                        i = 180;
                                    } else if (iM20384 != 6) {
                                        i = iM20384 != 8 ? 0 : BottomAppBarTopEdgeTreatment.ANGLE_UP;
                                    } else {
                                        i = 90;
                                    }
                                } catch (Exception unused) {
                                }
                                int i4 = f53303;
                                if (i2 <= i3 && i2 > i4) {
                                    iMax = Math.max(1, i2 / i4);
                                } else if (i2 >= i3 && i3 > i4) {
                                    iMax = Math.max(1, i3 / i4);
                                }
                                options.inJustDecodeBounds = false;
                                options.inSampleSize = iMax;
                                options.inPreferredConfig = Bitmap.Config.ARGB_4444;
                                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(c18153.m42261(false), null, options);
                                if (bitmapDecodeStream != null) {
                                    Bitmap bitmapM40786 = m40786(bitmapDecodeStream, i4, i2, i3);
                                    if (i != 0) {
                                        Matrix matrix = new Matrix();
                                        matrix.postRotate(i);
                                        bitmapM40786 = Bitmap.createBitmap(bitmapM40786, 0, 0, bitmapM40786.getWidth(), bitmapM40786.getHeight(), matrix, false);
                                    }
                                    m40791(bitmapM40786);
                                    c18153.close();
                                    return bitmapM40786;
                                }
                                c18153.close();
                            }
                        } else if (interfaceC11098.length() <= 268435456) {
                            bitmapM40788 = m40788(c18153.m42261(false));
                            m40791(bitmapM40788);
                        }
                        c18153.close();
                        return bitmapM40788;
                    }
                    c18153.close();
                    return null;
                } catch (Throwable th) {
                    try {
                        c18153.close();
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
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Bitmap m40788(InputStream inputStream) throws Throwable {
        float f;
        float f2;
        float f3;
        int i;
        Bitmap bitmapM50894;
        Bitmap bitmap;
        Bitmap bitmapCreateBitmap;
        C10104 c10104M50895 = C22803.m50895(inputStream);
        int i2 = c10104M50895.f30421;
        int i3 = c10104M50895.f30424;
        int iMax = Math.max(i2, i3);
        int iMin = Math.min(i2, i3);
        int i4 = f53303;
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
                        bitmapM50894 = C22803.m50894(inputStream, c10104M50895, rect, i, new C22886());
                        bitmap = null;
                        bitmapCreateBitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
                        float f5 = iMin2 * f;
                        float f6 = iMin3 * f;
                        Paint paint = new Paint();
                        paint.setFilterBitmap(false);
                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapM50894, (Rect) null, new RectF((f4 - f5) / 2.0f, (f4 - f6) / 2.0f, (f5 + f4) / 2.0f, (f4 + f6) / 2.0f), paint);
                        bitmapM50894.recycle();
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
                    bitmapM50894 = C22803.m50894(inputStream, c10104M50895, rect2, i, new C22886());
                    bitmap = null;
                    bitmapCreateBitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
                    float f8 = iMin4 * f;
                    float f9 = iMin5 * f;
                    Paint paint2 = new Paint();
                    paint2.setFilterBitmap(false);
                    new Canvas(bitmapCreateBitmap).drawBitmap(bitmapM50894, (Rect) null, new RectF((f7 - f8) / 2.0f, (f7 - f9) / 2.0f, (f8 + f7) / 2.0f, (f7 + f9) / 2.0f), paint2);
                    bitmapM50894.recycle();
                    return bitmapCreateBitmap;
                }
                f3 = i4;
                f2 = iMin;
                Paint paint3 = new Paint();
                paint3.setFilterBitmap(false);
                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapM50894, (Rect) null, new RectF((f7 - f8) / 2.0f, (f7 - f9) / 2.0f, (f8 + f7) / 2.0f, (f7 + f9) / 2.0f), paint3);
                bitmapM50894.recycle();
                return bitmapCreateBitmap;
            } catch (Throwable th) {
                th = th;
                bitmap = bitmapCreateBitmap;
                bitmapM50894.recycle();
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
        bitmapM50894 = C22803.m50894(inputStream, c10104M50895, rect3, i, new C22886());
        bitmap = null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Bitmap m40789(InterfaceC11098 interfaceC11098) {
        C12534 c12534;
        XmlResourceParserC10269 xmlResourceParserC10269M35994;
        C15518 c15518M36587;
        if (interfaceC11098 != null) {
            try {
                if (interfaceC11098.length() <= 153600) {
                    InputStream inputStreamMo10616 = interfaceC11098.mo10616();
                    try {
                        inputStreamMo10616.mark(4);
                        if ((inputStreamMo10616.read() & 255) == 3 && (inputStreamMo10616.read() & 255) == 0) {
                            inputStreamMo10616.reset();
                            if (interfaceC11098 instanceof InterfaceC13713) {
                                c12534 = ((InterfaceC13713) interfaceC11098).mo10617();
                                int i = C15518.f47426;
                                xmlResourceParserC10269M35994 = C15206.m35970(inputStreamMo10616).m35994();
                            } else {
                                c12534 = new C12534();
                                int i2 = C15518.f47426;
                                xmlResourceParserC10269M35994 = C15206.m35970(inputStreamMo10616).m35994();
                            }
                            try {
                                c15518M36587 = C15518.m36587(xmlResourceParserC10269M35994, c12534, false);
                            } catch (Exception unused) {
                                c15518M36587 = null;
                            }
                            inputStreamMo10616.close();
                            if (c15518M36587 != null) {
                                int i3 = f53303;
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(bitmapCreateBitmap);
                                Rect rectCopyBounds = c15518M36587.copyBounds();
                                int intrinsicWidth = c15518M36587.getIntrinsicWidth();
                                int intrinsicHeight = c15518M36587.getIntrinsicHeight();
                                if (intrinsicWidth > intrinsicHeight) {
                                    int i4 = (int) ((i3 / intrinsicWidth) * intrinsicHeight);
                                    int i5 = (i3 - i4) / 2;
                                    c15518M36587.setBounds(0, i5, i3, i4 + i5);
                                } else {
                                    int i6 = (int) ((i3 / intrinsicHeight) * intrinsicWidth);
                                    int i7 = (i3 - i6) / 2;
                                    c15518M36587.setBounds(i7, 0, i6 + i7, i3);
                                }
                                c15518M36587.draw(canvas);
                                c15518M36587.setBounds(rectCopyBounds);
                                m40791(bitmapCreateBitmap);
                                return bitmapCreateBitmap;
                            }
                        }
                        inputStreamMo10616.close();
                        return null;
                    } catch (Throwable th) {
                        try {
                            inputStreamMo10616.close();
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m40781(InputStream inputStream) {
        int i;
        try {
            C16312 c16312M38394 = C16312.m38394(inputStream);
            RectF rectFM38408 = c16312M38394.m38408();
            int iM38410 = (int) c16312M38394.m38410();
            int iM38405 = (int) c16312M38394.m38405();
            if (iM38410 == -1 && iM38405 == -1) {
                iM38410 = (int) (rectFM38408.right - rectFM38408.left);
                iM38405 = (int) (rectFM38408.bottom - rectFM38408.top);
            } else if (rectFM38408 == null) {
                c16312M38394.m38400(iM38410, iM38405);
            }
            if (iM38410 > 0 && iM38405 > 0) {
                int i2 = f53303;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                RectF rectF = new RectF();
                if (iM38410 > iM38405) {
                    float f = i2;
                    i = (int) ((f / iM38410) * iM38405);
                    int i3 = (i2 - i) / 2;
                    rectF.set(0.0f, i3, f, i3 + i);
                } else {
                    float f2 = i2;
                    int i4 = (int) ((f2 / iM38405) * iM38410);
                    int i5 = (i2 - i4) / 2;
                    rectF.set(i5, 0.0f, i5 + i4, f2);
                    i = i2;
                    i2 = i4;
                }
                c16312M38394.m38406(i2);
                c16312M38394.m38399(i);
                c16312M38394.m38402(canvas, rectF);
                m40791(bitmapCreateBitmap);
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
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static Bitmap m40793(AbstractC15440 abstractC15440) {
        AbstractC15440 abstractC15440M36527;
        Bitmap frameAtTime;
        boolean zM43871 = C19025.m43871(abstractC15440.mo23554());
        int i = f53303;
        if (!zM43871) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    if (abstractC15440.m36488()) {
                        mediaMetadataRetriever.setDataSource(abstractC15440.mo23544());
                    } else if (abstractC15440.mo31568()) {
                        mediaMetadataRetriever.setDataSource(C4925.m14335(), abstractC15440.mo31567());
                    } else if (Build.VERSION.SDK_INT >= 23) {
                        mediaMetadataRetriever.setDataSource(new C22907(abstractC15440));
                    } else {
                        if (abstractC15440.mo23127() <= 524288) {
                            abstractC15440M36527 = C16293.f50111.m36527();
                            try {
                                abstractC15440.m36500(abstractC15440M36527, (C17558) null, (InterfaceC5627) null);
                                mediaMetadataRetriever.setDataSource(abstractC15440M36527.mo23554());
                                frameAtTime = mediaMetadataRetriever.getFrameAtTime(-1L);
                                mediaMetadataRetriever.release();
                                if (abstractC15440M36527 != null) {
                                    abstractC15440M36527.mo23552();
                                }
                            } catch (Throwable unused) {
                                try {
                                    mediaMetadataRetriever.release();
                                } catch (Exception unused2) {
                                }
                                if (abstractC15440M36527 != null) {
                                    abstractC15440M36527.mo23552();
                                }
                                frameAtTime = null;
                            }
                            if (frameAtTime == null) {
                                return null;
                            }
                            return m40786(frameAtTime, i, frameAtTime.getWidth(), frameAtTime.getHeight());
                        }
                        mediaMetadataRetriever.setDataSource(abstractC15440.mo23554());
                    }
                    mediaMetadataRetriever.release();
                } catch (Exception unused3) {
                }
                abstractC15440M36527 = null;
                frameAtTime = mediaMetadataRetriever.getFrameAtTime(-1L);
                if (abstractC15440M36527 != null) {
                    abstractC15440M36527.mo23552();
                }
            } catch (Throwable unused4) {
                abstractC15440M36527 = null;
            }
            if (frameAtTime == null) {
                return null;
            }
            return m40786(frameAtTime, i, frameAtTime.getWidth(), frameAtTime.getHeight());
        }
        return C19025.m43862(abstractC15440, i).m24923();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C9853 m40792(AbstractC15440 abstractC15440) {
        return C19025.m43862(abstractC15440, f53303);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Bitmap m40787(MediaDataSource mediaDataSource) {
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
                return m40786(frameAtTime, f53303, frameAtTime.getWidth(), frameAtTime.getHeight());
            }
        } catch (Exception unused3) {
            frameAtTime = null;
        }
        if (frameAtTime == null) {
            return null;
        }
        return m40786(frameAtTime, f53303, frameAtTime.getWidth(), frameAtTime.getHeight());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9853 m40784(MediaDataSource mediaDataSource) {
        return C19025.m43860(mediaDataSource, f53303);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m40780(Bitmap bitmap, int i, int i2, int i3) {
        return m40786(bitmap, i, i2, i3);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Bitmap m40794(AbstractC15440 abstractC15440) throws Throwable {
        C18090 c18090;
        C18090 c18091 = null;
        try {
            c18090 = new C18090(abstractC15440);
            try {
                Bitmap bitmapM39283 = C16709.m39283(c18090);
                if (bitmapM39283 != null) {
                    m40785(bitmapM39283);
                    C0349.m1793(c18090);
                    return bitmapM39283;
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                th = th;
                c18091 = c18090;
                C0349.m1793(c18091);
                throw th;
            }
        } catch (IOException unused2) {
            c18090 = null;
        } catch (Throwable th2) {
            th = th2;
        }
        C0349.m1793(c18090);
        WeakReference weakReference = f53304;
        Bitmap bitmap = weakReference != null ? (Bitmap) weakReference.get() : null;
        if (bitmap != null) {
            return bitmap;
        }
        Drawable drawableM14305 = C4925.m14305(R.drawable.MT_Protector);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i = f53303;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect rectCopyBounds = drawableM14305.copyBounds();
        drawableM14305.setBounds(0, 0, i, i);
        drawableM14305.draw(canvas);
        drawableM14305.setBounds(rectCopyBounds);
        f53304 = new WeakReference(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m40783(AbstractC15440 abstractC15440) {
        C4021 c4021M43525 = C18838.m43525(abstractC15440);
        if (c4021M43525 == null) {
            return null;
        }
        Drawable drawableM12090 = c4021M43525.m12090();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i = f53303;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect rectCopyBounds = drawableM12090.copyBounds();
        int intrinsicWidth = drawableM12090.getIntrinsicWidth();
        int intrinsicHeight = drawableM12090.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            intrinsicWidth = i;
            intrinsicHeight = intrinsicWidth;
        }
        try {
            drawableM12090.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            float f = i;
            canvas.scale(f / intrinsicWidth, f / intrinsicHeight);
            drawableM12090.draw(canvas);
            drawableM12090.setBounds(rectCopyBounds);
            m40785(bitmapCreateBitmap);
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            drawableM12090.setBounds(rectCopyBounds);
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
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Bitmap m40790(AbstractC15440 abstractC15440) throws Throwable {
        ?? r0;
        JSONObject jSONObject;
        String string;
        ?? r1;
        C3545 entry;
        ?? M36535 = "base.apk";
        ?? r4 = 0;
        try {
            try {
                ?? c18090 = new C18090(abstractC15440);
                try {
                    try {
                        jSONObject = new JSONObject(new String(c18090.m42193(c18090.m42211("manifest.json"), null), StandardCharsets.UTF_8));
                    } catch (Throwable th) {
                        th = th;
                        M36535 = 0;
                    }
                } catch (Exception unused) {
                    jSONObject = null;
                }
                int i = 0;
                if (jSONObject != null && jSONObject.contains("icon")) {
                    try {
                        byte[] bArrM42193 = c18090.m42193(c18090.getEntry(jSONObject.getString("icon")), null);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(C4925.m14338(), BitmapFactory.decodeByteArray(bArrM42193, 0, bArrM42193.length));
                        int i2 = f53303;
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        Rect rectCopyBounds = bitmapDrawable.copyBounds();
                        bitmapDrawable.setBounds(0, 0, i2, i2);
                        bitmapDrawable.draw(canvas);
                        bitmapDrawable.setBounds(rectCopyBounds);
                        m40785(bitmapCreateBitmap);
                        c18090.close();
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
                if (string != null || c18090.getEntry("base.apk") == null) {
                    r1 = string;
                }
                if (r1 == 0) {
                    C16646 c16646Min = C5378.stream(c18090.m42210()).map(new C6639(2)).filter(new C0065(5)).min(C8200.comparingInt(new C15318()));
                    if (c16646Min.isPresent()) {
                        r1 = M36535;
                        r1 = (String) c16646Min.get();
                    }
                }
                if (r1 != 0 && (entry = c18090.getEntry(r1)) != null) {
                    M36535 = C16293.f50113.m36535(".apk");
                    try {
                        M36535.m36493(c18090.m42189(entry));
                        Bitmap bitmapM40783 = m40783((AbstractC15440) M36535);
                        c18090.close();
                        M36535.mo23552();
                        return bitmapM40783;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    c18090.close();
                    return null;
                }
                try {
                    c18090.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th;
            } catch (Exception unused4) {
                r0 = M36535;
                if (r0 != 0) {
                    r0.mo23552();
                }
                return null;
            } catch (Throwable th4) {
                th = th4;
                r4 = M36535;
                if (r4 != 0) {
                    r4.mo23552();
                }
                throw th;
            }
        } catch (Exception unused5) {
            r0 = 0;
            if (r0 != 0) {
                r0.mo23552();
            }
        } catch (Throwable th5) {
            th = th5;
            if (r4 != 0) {
                r4.mo23552();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m40791(Bitmap bitmap) {
        int iM20003;
        if (C10289.m26045(bitmap) <= 0.9f && (iM20003 = C7466.m20003(bitmap)) != 0) {
            if (C7466.m20006(iM20003, -328966)) {
                C10289.m26046(bitmap, 2.5f, 1, 1, -1442840576);
            } else if (C7466.m20006(iM20003, -13619152)) {
                C10289.m26046(bitmap, 3.5f, 1, 1, -1);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40785(Bitmap bitmap) {
        int iM20003;
        if (C10289.m26045(bitmap) <= 0.9f && (iM20003 = C7466.m20003(bitmap)) != 0) {
            if (C7466.m20006(iM20003, -328966)) {
                C10289.m26046(bitmap, 1.0f, 0, 0, -1434419072);
            } else if (C7466.m20006(iM20003, -13619152)) {
                C10289.m26046(bitmap, 2.0f, 0, 0, -1432313696);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0038  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Bitmap m40786(Bitmap bitmap, int i, int i2, int i3) {
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
            new Canvas(bitmapCreateBitmap2).drawBitmap(bitmap, (i - width) / 2.0f, (i - height) / 2.0f, f53302);
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
        new Canvas(bitmapCreateBitmap4).drawBitmap(bitmap, (i - width) / 2.0f, (i - height) / 2.0f, f53302);
        bitmap.recycle();
        return bitmapCreateBitmap4;
    }
}
