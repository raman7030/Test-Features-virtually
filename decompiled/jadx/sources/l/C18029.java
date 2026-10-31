package l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.util.Xml;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import net.engio.mbassy.listener.MessageHandler;
import org.bouncycastle.crypto.prng.X931RNG;
import org.simpleframework.xml.stream.DocumentReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ᩳۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6MB */
/* JADX INFO: loaded from: classes4.dex */
public final class C18029 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22802 m42083(final AbstractC22967 abstractC22967, final C9895 c9895) {
        m42086(c9895);
        C11679 c11679Mo6179 = abstractC22967.mo6179();
        final C20146 c20146 = C20146.f65246;
        C4623.m13568(c11679Mo6179, c20146);
        C8151 c8151M13566 = C4623.m13566(abstractC22967, c20146);
        try {
            C10164 c10164M16613 = C5930.m16613(c8151M13566, new InterfaceC12985() { // from class: l.۫ۛۜ
                @Override // l.InterfaceC12985
                public final BitmapFactory.Options read() {
                    return C18029.m42079(c9895, abstractC22967, c20146);
                }
            });
            c8151M13566.m21622();
            c8151M13566.close();
            abstractC22967.m51108(c11679Mo6179);
            m42086(c9895);
            return new C22802(c11679Mo6179, c10164M16613);
        } catch (Throwable th) {
            try {
                c8151M13566.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ BitmapFactory.Options m42079(C9895 c9895, AbstractC22967 abstractC22967, C20146 c20146) throws InterruptedIOException {
        m42086(c9895);
        return C4623.m13570(abstractC22967, c20146);
    }

    /* JADX WARN: Code duplicated, block: B:170:0x0295  */
    /* JADX WARN: Code duplicated, block: B:74:0x0114 A[Catch: all -> 0x00e1, TRY_ENTER, TryCatch #1 {all -> 0x00e1, blocks: (B:27:0x0099, B:28:0x00a0, B:74:0x0114, B:75:0x0117, B:53:0x00eb, B:55:0x00f3, B:57:0x00f7, B:59:0x00fb, B:60:0x00fd, B:61:0x00fe, B:62:0x0105, B:63:0x0106, B:64:0x0108, B:65:0x0109, B:66:0x010b, B:40:0x00da, B:41:0x00dd), top: B:183:0x0099 }] */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
    
        r21.m51108(r7);
        l.AbstractC22967.m51107(r28);
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C13629 m42081(AbstractC22967 abstractC22967, C22802 c22802, final C19981 c19981, long j, final long j2, final C9189 c9189) {
        EnumC12280 enumC12280;
        long j3;
        C11679 c11679;
        int i;
        C13629 c13629M42080;
        final AbstractC22967 c13089;
        C5329 c5329;
        m42086(c9189);
        if (j <= 0 || j2 <= 0) {
            throw new IllegalArgumentException("Format allocation limit must be positive");
        }
        C11679 c116710 = c22802.f73631;
        abstractC22967.m51108(c116710);
        long jMin = c116710.f34804;
        EnumC12280 enumC12281 = c22802.f73630.f30567;
        if (enumC12281 == EnumC12280.BITMAP || enumC12281 == EnumC12280.TGA || enumC12281 == EnumC12280.UNKNOWN || (enumC12281 == (enumC12280 = EnumC12280.ANIMATED_WEBP) && Build.VERSION.SDK_INT < 28)) {
            return null;
        }
        long jMin2 = Math.min(j, c19981.m46067());
        if (enumC12281 == EnumC12280.GIF) {
            File fileMo17660 = abstractC22967.mo17660();
            if (fileMo17660 == null) {
                c13089 = abstractC22967;
            } else {
                File absoluteFile = fileMo17660.getAbsoluteFile();
                c13089 = new C13089(absoluteFile, "file:" + absoluteFile.getPath());
            }
            final C11679 c11679Mo6179 = fileMo17660 == null ? c116710 : c13089.mo6179();
            final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC8857());
            scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
            FutureTask futureTask = new FutureTask(new Callable() { // from class: l.ܺۨۜ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C5329.m15265(c13089, c11679Mo6179, c19981, j2, c9189, scheduledThreadPoolExecutor);
                }
            });
            scheduledThreadPoolExecutor.execute(futureTask);
            boolean z = false;
            boolean z2 = false;
            while (true) {
                try {
                    try {
                        try {
                            c5329 = (C5329) futureTask.get();
                            try {
                                try {
                                    break;
                                } catch (InterruptedException unused) {
                                    z = true;
                                } catch (ExecutionException e) {
                                    e = e;
                                    Throwable cause = e.getCause();
                                    if (cause instanceof IOException) {
                                        throw ((IOException) cause);
                                    }
                                    if (cause instanceof RuntimeException) {
                                        throw ((RuntimeException) cause);
                                    }
                                    if (cause instanceof Error) {
                                        throw ((Error) cause);
                                    }
                                    throw new IOException("GIF worker failed", cause);
                                }
                            } catch (IOException | Error | RuntimeException e2) {
                                c5329.mo3344(null);
                                throw e2;
                            }
                        } catch (Throwable th) {
                            if (z2) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (IOException | Error | RuntimeException e3) {
                        e = e3;
                        z = true;
                        if (!z) {
                            scheduledThreadPoolExecutor.shutdown();
                        }
                        throw e;
                    }
                } catch (IOException e4) {
                    e = e4;
                    if (!z) {
                        scheduledThreadPoolExecutor.shutdown();
                    }
                    throw e;
                } catch (Error e5) {
                    e = e5;
                    if (!z) {
                        scheduledThreadPoolExecutor.shutdown();
                    }
                    throw e;
                } catch (InterruptedException unused2) {
                } catch (RuntimeException e6) {
                    e = e6;
                    if (!z) {
                        scheduledThreadPoolExecutor.shutdown();
                    }
                    throw e;
                } catch (ExecutionException e7) {
                    e = e7;
                }
                z2 = true;
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
            return new C13629(new C15205(abstractC22967.mo6180(), c5329.f16627, c5329.f16621, 1, "image/gif", c116710), c5329);
        }
        if (enumC12281 == enumC12280 && Build.VERSION.SDK_INT >= 28) {
            C10328 c10328M26103 = C10328.m26103(abstractC22967, c116710, c19981, j2, c9189);
            return new C13629(new C15205(abstractC22967.mo6180(), c10328M26103.f31099, c10328M26103.f31077, c10328M26103.f31101, "image/webp", c116710), c10328M26103);
        }
        long jM46067 = c19981.m46067();
        long jMin3 = Math.min(X931RNG.BLOCK128_RESEED_MAX, jM46067 / 2);
        int i2 = (jMin > 0L ? 1 : (jMin == 0L ? 0 : -1));
        if (i2 < 0) {
            jMin = Math.min(X931RNG.BLOCK64_RESEED_MAX, jMin3);
        }
        if (jMin <= 0) {
            throw new IOException("Special image input is empty");
        }
        if (jMin > X931RNG.BLOCK128_RESEED_MAX) {
            throw new C11514("Special image input exceeds byte limit");
        }
        if (jMin >= jM46067) {
            throw new C1095("Special image input exceeds allocation limit");
        }
        C22097 c22097M42082 = m42082(c19981, jMin);
        try {
            byte[] bArr = new byte[(int) jMin];
            abstractC22967.m51108(c116710);
            InputStream inputStreamMo6178 = abstractC22967.mo6178();
            int i3 = 0;
            C19981 c19982 = c19981;
            while (true) {
                try {
                    m42086(c9189);
                    if (i3 == bArr.length) {
                        int i4 = inputStreamMo6178.read();
                        if (i4 < 0) {
                            j3 = jMin2;
                            c11679 = c116710;
                            break;
                        }
                        if (i2 >= 0) {
                            throw new IOException("Special image input size changed");
                        }
                        j3 = jMin2;
                        if (bArr.length >= 8388608) {
                            throw new C11514("Special image input exceeds byte limit");
                        }
                        if (bArr.length >= jMin3) {
                            throw new C1095("Input growth exceeds allocation limit");
                        }
                        int iMin = (int) Math.min(jMin3, ((long) bArr.length) * 2);
                        C11679 c116711 = c116710;
                        long j4 = iMin;
                        if (((long) bArr.length) + j4 > jM46067) {
                            throw new C1095("Input growth exceeds allocation limit");
                        }
                        C22097 c22097M42083 = m42082(c19982, j4);
                        try {
                            byte[] bArr2 = new byte[iMin];
                            System.arraycopy(bArr, 0, bArr2, 0, i3);
                            int i5 = i3 + 1;
                            bArr2[i3] = (byte) i4;
                            c22097M42082.close();
                            c22097M42082 = c22097M42083;
                            i3 = i5;
                            bArr = bArr2;
                            c11679 = c116711;
                            i2 = i2;
                            jMin3 = jMin3;
                            c116710 = c11679;
                            jMin2 = j3;
                        } catch (Throwable th2) {
                            c22097M42083.close();
                            throw th2;
                        }
                    } else {
                        j3 = jMin2;
                        c11679 = c116710;
                        int i6 = inputStreamMo6178.read(bArr, i3, bArr.length - i3);
                        if (i6 < 0) {
                            break;
                        }
                        if (i6 == 0) {
                            int i7 = inputStreamMo6178.read();
                            if (i7 < 0) {
                                break;
                            }
                            i = i3 + 1;
                            bArr[i3] = (byte) i7;
                        } else {
                            i = i3 + i6;
                        }
                        c19982 = c19981;
                        i3 = i;
                        i2 = i2;
                        jMin3 = jMin3;
                        c116710 = c11679;
                        jMin2 = j3;
                    }
                } catch (Throwable th3) {
                    if (inputStreamMo6178 == null) {
                        throw th3;
                    }
                    try {
                        inputStreamMo6178.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
                if (c22097M42082 != null) {
                    c22097M42082.close();
                }
                throw th;
            }
            if (inputStreamMo6178 != null) {
                inputStreamMo6178.close();
            }
            C11679 c116712 = c11679;
            abstractC22967.m51108(c116712);
            C10103 c10103 = new C10103(bArr, i3, c22097M42082);
            try {
                m42086(c9189);
                c13629M42080 = m42080(abstractC22967, c116712, c10103, c19981, j3, c9189);
                try {
                    abstractC22967.m51108(c116712);
                    m42086(c9189);
                    c10103.close();
                    return c13629M42080;
                } catch (Throwable th5) {
                    th = th5;
                    if (c13629M42080 != null) {
                        try {
                            c13629M42080.m32759(null);
                        } catch (Throwable th6) {
                            try {
                                c10103.close();
                                throw th6;
                            } catch (Throwable th7) {
                                th6.addSuppressed(th7);
                                throw th6;
                            }
                        }
                    }
                    throw th;
                }
            } catch (Throwable th8) {
                th = th8;
                c13629M42080 = null;
            }
        } catch (Throwable th9) {
            if (c22097M42082 != null) {
                c22097M42082.close();
            }
            throw th9;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m42089(String str, int i, byte[] bArr) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            bArr[i + i2] = (byte) str.charAt(i2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42084(int i, int i2, byte[] bArr) {
        for (int i3 = 0; i3 < 3; i3++) {
            bArr[i + i3] = (byte) (i2 >>> (i3 * 8));
        }
    }

    /* JADX WARN: Code duplicated, block: B:142:0x025a A[Catch: XmlPullParserException -> 0x06fe, TryCatch #9 {XmlPullParserException -> 0x06fe, blocks: (B:3:0x0008, B:6:0x004e, B:8:0x0055, B:11:0x0062, B:12:0x0069, B:17:0x0073, B:20:0x0085, B:22:0x008b, B:25:0x0092, B:26:0x0099, B:27:0x009a, B:29:0x00a0, B:31:0x00a6, B:33:0x00b0, B:35:0x00b6, B:42:0x00c4, B:46:0x00ce, B:278:0x047a, B:47:0x00e1, B:49:0x00e9, B:52:0x0106, B:54:0x010e, B:56:0x0116, B:58:0x011e, B:60:0x0124, B:62:0x012a, B:64:0x0132, B:66:0x0138, B:71:0x0142, B:74:0x0150, B:76:0x0158, B:81:0x0162, B:84:0x016a, B:87:0x0172, B:89:0x0178, B:91:0x017e, B:94:0x0186, B:95:0x01a5, B:97:0x01ab, B:99:0x01de, B:102:0x01e7, B:150:0x0279, B:152:0x027f, B:154:0x0285, B:155:0x028e, B:157:0x0294, B:159:0x029c, B:160:0x029f, B:162:0x02a5, B:164:0x02ab, B:167:0x02b4, B:169:0x02ba, B:171:0x02c0, B:173:0x02c6, B:175:0x02cc, B:177:0x02d2, B:179:0x02d8, B:184:0x02e7, B:189:0x02f7, B:191:0x02fd, B:193:0x0303, B:195:0x030b, B:197:0x0313, B:204:0x032d, B:207:0x0339, B:209:0x0343, B:211:0x034b, B:213:0x0353, B:215:0x0359, B:217:0x0361, B:224:0x037c, B:226:0x0382, B:231:0x0392, B:233:0x039c, B:247:0x03e2, B:239:0x03b8, B:240:0x03bf, B:242:0x03c5, B:244:0x03d1, B:245:0x03dc, B:246:0x03e1, B:234:0x03a7, B:235:0x03ac, B:198:0x0317, B:200:0x031f, B:248:0x03f2, B:249:0x03f9, B:104:0x01f7, B:106:0x01fd, B:144:0x025f, B:114:0x0217, B:135:0x0241, B:138:0x024a, B:140:0x0252, B:142:0x025a, B:145:0x0264, B:251:0x03ff, B:252:0x0406, B:253:0x0407, B:255:0x041c, B:256:0x0423, B:259:0x0431, B:261:0x0435, B:262:0x0438, B:269:0x0446, B:271:0x0460, B:275:0x0470, B:276:0x0477, B:281:0x0495, B:285:0x04da, B:416:0x06f6, B:417:0x06fd), top: B:423:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:402:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:404:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:406:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:408:0x06de  */
    /* JADX WARN: Code duplicated, block: B:410:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:412:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:414:0x06f2  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13629 m42080(AbstractC22967 abstractC22967, C11679 c11679, C10103 c10103, C19981 c19981, long j, C9189 c9189) throws Throwable {
        C17383 c17383;
        Picture pictureM38396;
        C22097 c22097M42082;
        C22097 c22097M42083;
        Bitmap bitmapCreateBitmap;
        C22097 c22097M42084;
        C17383 c17384;
        C17383 c17385;
        C17383 c17386;
        C17383 c17387;
        boolean z;
        C17383 c17388;
        int i;
        int i2;
        long j2;
        String str;
        ArrayList arrayList;
        String str2;
        String str3;
        String str4;
        byte[] bArr = c10103.f30411;
        try {
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            int i3 = 0;
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
            int i4 = 1;
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            int i5 = c10103.f30410;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i5), null);
            C7280 c7280 = new C7280(0);
            ArrayDeque arrayDeque = new ArrayDeque();
            HashMap map = new HashMap();
            arrayDeque.push(c7280);
            int eventType = xmlPullParserNewPullParser.getEventType();
            int i6 = 0;
            int i7 = 0;
            long j3 = 0;
            long length = 0;
            long j4 = 0;
            int i8 = 0;
            boolean z2 = false;
            boolean z3 = true;
            while (eventType != i4) {
                m42086(c9189);
                if (eventType == 10 && xmlPullParserNewPullParser.getText().contains("<!ENTITY")) {
                    throw new C1801("SVG entity declarations are not supported");
                }
                if (eventType == 2) {
                    if (i8 == 0) {
                        String namespace = xmlPullParserNewPullParser.getNamespace();
                        if (!"svg".equals(xmlPullParserNewPullParser.getName()) || (namespace != null && !namespace.isEmpty() && !"http://www.w3.org/2000/svg".equals(namespace))) {
                            throw new IOException("Image XML root is not SVG");
                        }
                    }
                    i8++;
                    if (i8 > 8192 || (i6 = i6 + 1) > 64) {
                        throw new C11514("SVG structure exceeds safe render limits");
                    }
                    String name = xmlPullParserNewPullParser.getName();
                    String namespace2 = xmlPullParserNewPullParser.getNamespace();
                    boolean z4 = namespace2 == null || namespace2.isEmpty() || "http://www.w3.org/2000/svg".equals(namespace2);
                    if (i7 != 0 || (z4 && !C12785.m31098(name))) {
                        i7++;
                    } else if (!z4) {
                        arrayDeque.push((C7280) arrayDeque.peek());
                        i5 = i5;
                        bArr = bArr;
                        arrayDeque = arrayDeque;
                        c7280 = c7280;
                    } else {
                        if ("image".equals(name)) {
                            throw new C1801("SVG embedded images are not supported");
                        }
                        C7280 c7281 = new C7280(i3);
                        ArrayList arrayList2 = c7281.f22347;
                        String str5 = "radialGradient";
                        String str6 = "pattern";
                        String str7 = "mask";
                        c7281.f22348 = "defs".equals(name) || "symbol".equals(name) || "marker".equals(name) || "clipPath".equals(name) || "pattern".equals(name) || "mask".equals(name) || "view".equals(name) || "linearGradient".equals(name) || "radialGradient".equals(name);
                        boolean z5 = "title".equals(name) || "desc".equals(name) || "style".equals(name);
                        if ("style".equals(name)) {
                            z2 = true;
                        }
                        if ("mask".equals(name) || "pattern".equals(name) || MessageHandler.Properties.Filter.equals(name) || "style".equals(name)) {
                            z3 = false;
                        }
                        ((C7280) arrayDeque.peek()).f22346.add(c7281);
                        arrayDeque.push(c7281);
                        int i9 = 0;
                        ArrayList arrayList3 = arrayList2;
                        int i10 = i7;
                        long j5 = j4;
                        boolean z6 = false;
                        while (i9 < xmlPullParserNewPullParser.getAttributeCount()) {
                            String attributeName = xmlPullParserNewPullParser.getAttributeName(i9);
                            String str8 = str6;
                            String strTrim = xmlPullParserNewPullParser.getAttributeValue(i9).trim();
                            HashMap map2 = map;
                            boolean z7 = z5;
                            String str9 = str5;
                            String str10 = name;
                            int i11 = i9;
                            c7281.f22345 += (long) strTrim.length();
                            long jMax = Math.max(j5, strTrim.length());
                            if ("d".equals(attributeName) || "points".equals(attributeName)) {
                                int i12 = 0;
                                boolean z8 = false;
                                boolean z9 = false;
                                long j6 = 0;
                                while (i12 < strTrim.length()) {
                                    char cCharAt = strTrim.charAt(i12);
                                    long j7 = jMax;
                                    if ((cCharAt < '0' || cCharAt > '9') && cCharAt != '.') {
                                        if (cCharAt == '-' || cCharAt == '+') {
                                            if (i12 != 0) {
                                                int i13 = i12 - 1;
                                                if (strTrim.charAt(i13) != 'e' && strTrim.charAt(i13) != 'E') {
                                                    j6++;
                                                    z9 = false;
                                                }
                                            } else {
                                                j6++;
                                                z9 = false;
                                            }
                                        } else if ((cCharAt != 'e' && cCharAt != 'E') || !z8) {
                                            if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                                                j6++;
                                            }
                                            z8 = false;
                                            z9 = false;
                                        }
                                        i12++;
                                        jMax = j7;
                                    } else {
                                        if (!z8 || (cCharAt == '.' && z9)) {
                                            j6++;
                                        }
                                        if (cCharAt == '.') {
                                            z9 = true;
                                        }
                                    }
                                    z8 = true;
                                    i12++;
                                    jMax = j7;
                                }
                                j2 = jMax;
                                j3 += j6;
                                c7281.f22350 += j6;
                            } else {
                                length += (long) strTrim.length();
                                j2 = jMax;
                            }
                            if (j3 > 262144 || length > 1048576) {
                                throw new C11514("SVG data exceeds safe parse limits");
                            }
                            if ("opacity".equals(attributeName) && C12785.m31100(strTrim)) {
                                c7281.f22349 = Math.max(c7281.f22349, 1);
                            }
                            if (str7.equals(attributeName) && !"none".equals(strTrim)) {
                                c7281.f22349 = 3;
                            }
                            if ("style".equals(attributeName) && (strTrim.contains("opacity") || strTrim.contains(str7))) {
                                z2 = true;
                            }
                            if ("opacity".equals(attributeName) || str7.equals(attributeName) || MessageHandler.Properties.Filter.equals(attributeName) || ("style".equals(attributeName) && (strTrim.contains("opacity") || strTrim.contains(str7) || strTrim.contains(MessageHandler.Properties.Filter)))) {
                                z3 = false;
                            }
                            String attributePrefix = xmlPullParserNewPullParser.getAttributePrefix(i11);
                            String attributeNamespace = xmlPullParserNewPullParser.getAttributeNamespace(i11);
                            if (z7 || z6 || !(attributePrefix == null || attributePrefix.isEmpty() || DocumentReader.RESERVED.equals(attributePrefix))) {
                                map = map2;
                            } else {
                                if ("id".equals(attributeName)) {
                                    map = map2;
                                    if (!map.containsKey(strTrim)) {
                                        map.put(strTrim, c7281);
                                    }
                                } else {
                                    map = map2;
                                    if (DocumentReader.RESERVED.equals(attributePrefix) && "space".equals(attributeName)) {
                                    }
                                }
                                z6 = true;
                            }
                            if ("href".equals(attributeName)) {
                                str3 = str10;
                                if ("use".equals(str3) || "tref".equals(str3) || "textPath".equals(str3) || "linearGradient".equals(str3)) {
                                    str = str7;
                                    str4 = str8;
                                    str2 = str9;
                                } else {
                                    str2 = str9;
                                    if (str2.equals(str3)) {
                                        str = str7;
                                        str4 = str8;
                                    } else {
                                        str = str7;
                                        str4 = str8;
                                        if (!str4.equals(str3)) {
                                            str8 = str4;
                                        }
                                        arrayList = arrayList3;
                                    }
                                }
                                if (attributeNamespace == null || attributeNamespace.isEmpty()) {
                                    str8 = str4;
                                } else {
                                    str8 = str4;
                                    if (!"http://www.w3.org/1999/xlink".equals(attributeNamespace)) {
                                        arrayList = arrayList3;
                                    }
                                }
                                String strM31099 = C12785.m31099(strTrim);
                                if (!strM31099.startsWith("#")) {
                                    throw new C1801("SVG external resources are not supported");
                                }
                                arrayList = arrayList3;
                                arrayList.add(strM31099.substring(1));
                            } else {
                                str = str7;
                                arrayList = arrayList3;
                                str2 = str9;
                                str3 = str10;
                            }
                            if (!z7) {
                                C12785.m31095(attributeName, strTrim, arrayList);
                                for (int size = arrayList.size(); size < arrayList.size(); size++) {
                                    String str11 = (String) arrayList.get(size);
                                    if (!str11.startsWith("#")) {
                                        throw new C1801("SVG external resources are not supported");
                                    }
                                    arrayList.set(size, str11.substring(1));
                                }
                            }
                            i9 = i11 + 1;
                            arrayList3 = arrayList;
                            name = str3;
                            str6 = str8;
                            str7 = str;
                            z5 = z7;
                            str5 = str2;
                            j5 = j2;
                        }
                        j4 = j5;
                        i7 = i10;
                    }
                    i6 = i6;
                    i8 = i8;
                } else {
                    i5 = i5;
                    bArr = bArr;
                    arrayDeque = arrayDeque;
                    c7280 = c7280;
                    int i14 = i7;
                    if (eventType == 3) {
                        i6--;
                        if (i14 > 0) {
                            i7 = i14 - 1;
                        } else {
                            arrayDeque.pop();
                        }
                    } else if (i14 == 0 && i8 > 0 && (eventType == 4 || eventType == 5)) {
                        ((C7280) arrayDeque.peek()).f22345 += (long) xmlPullParserNewPullParser.getText().length();
                        if (!xmlPullParserNewPullParser.isWhitespace()) {
                            length += (long) xmlPullParserNewPullParser.getText().length();
                        }
                        if (length > 1048576) {
                            throw new C11514("SVG text exceeds safe parse limits");
                        }
                    }
                    i7 = i14;
                }
                eventType = xmlPullParserNewPullParser.nextToken();
                i3 = 0;
                i4 = 1;
                i5 = i5;
                bArr = bArr;
                arrayDeque = arrayDeque;
                c7280 = c7280;
            }
            int i15 = i5;
            byte[] bArr2 = bArr;
            C7280 c7282 = c7280;
            if (i8 == 0) {
                throw new IOException("SVG root element is missing");
            }
            long[] jArr = {0, 0, 0, 0, 0};
            m42085(c7282, map, new HashSet(), jArr, 0, 0, z2, c9189);
            long j8 = (j4 * 2) + (length * 2) + (j3 * 32) + (((long) i8) * 512) + 65536;
            int i16 = (int) jArr[3];
            int i17 = i16 + 1;
            long j9 = jArr[0];
            int i18 = (int) j9;
            long j10 = jArr[2];
            boolean z10 = z3 && j9 <= 128 && jArr[1] <= 16 && j10 <= 16384;
            C22097 c22097M42085 = m42082(c19981, j8);
            try {
                C16312 c16312M38391 = C16312.m38391(new ByteArrayInputStream(bArr2, 0, i15));
                m42086(c9189);
                RectF rectFM38408 = c16312M38391.m38408();
                float fM38410 = c16312M38391.m38410();
                float fM38405 = c16312M38391.m38405();
                if (fM38410 <= 0.0f && rectFM38408 != null) {
                    fM38410 = rectFM38408.width();
                }
                if (fM38405 <= 0.0f && rectFM38408 != null) {
                    fM38405 = rectFM38408.height();
                }
                int iM42077 = m42077(fM38410);
                int iM42078 = m42077(fM38405);
                C20146.f65246.m46403(iM42077, iM42078);
                if (rectFM38408 == null) {
                    c16312M38391.m38400(iM42077, iM42078);
                }
                boolean z11 = !C12785.m31097(c16312M38391) && Build.VERSION.SDK_INT >= 28 && z10;
                c22097M42084 = z11 ? m42082(c19981, z11 ? (((long) i18) * 256) + (j10 * 8) + 65536 : 0L) : null;
                try {
                    long jMin = Math.min(j, c19981.m46067() - c19981.m46070());
                    int i19 = 1;
                    while (i19 <= 32768) {
                        if (C4623.m13562(iM42077, i19) > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX || C4623.m13562(iM42078, i19) > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) {
                            z = z11;
                        } else {
                            z = z11;
                            if (C4623.m13563(iM42077, iM42078, i19) * ((long) i17) <= jMin) {
                                int iM13562 = (int) C4623.m13562(iM42077, i19);
                                int iM13563 = (int) C4623.m13562(iM42078, i19);
                                long j11 = ((long) iM13562) * ((long) iM13563) * 4;
                                c22097M42082 = m42082(c19981, ((long) i16) * j11);
                                try {
                                    c22097M42083 = m42082(c19981, j11);
                                    try {
                                        bitmapCreateBitmap = Bitmap.createBitmap(iM13562, iM13563, Bitmap.Config.ARGB_8888);
                                        try {
                                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                                            float f = iM42077;
                                            float f2 = iM42078;
                                            canvas.scale(iM13562 / f, iM13563 / f2);
                                            c16312M38391.m38402(canvas, new RectF(0.0f, 0.0f, f, f2));
                                            m42086(c9189);
                                            if (!c22097M42083.m49683(bitmapCreateBitmap.getAllocationByteCount())) {
                                                throw new C1095("SVG raster allocation exceeds budget");
                                            }
                                            if (z) {
                                                try {
                                                    pictureM38396 = c16312M38391.m38396(iM42077, iM42078);
                                                    try {
                                                        m42086(c9189);
                                                        i = iM42077;
                                                        i2 = iM42078;
                                                        c17388 = new C17383(null, pictureM38396, iM42077, iM42078, i17, c22097M42084);
                                                        c22097M42084 = null;
                                                    } catch (C19136 e) {
                                                        e = e;
                                                        c17383 = null;
                                                        try {
                                                            throw new IOException("SVG could not be parsed", e);
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            if (bitmapCreateBitmap != null) {
                                                                bitmapCreateBitmap.recycle();
                                                            }
                                                            if (c22097M42083 != null) {
                                                                c22097M42083.close();
                                                            }
                                                            if (c22097M42082 != null) {
                                                                c22097M42082.close();
                                                            }
                                                            if (c17383 != null) {
                                                                c17383.m40731((C22097) null);
                                                            }
                                                            if (pictureM38396 != null) {
                                                                pictureM38396.beginRecording(1, 1);
                                                                pictureM38396.endRecording();
                                                            }
                                                            if (c22097M42084 != null) {
                                                                c22097M42084.close();
                                                            }
                                                            if (c22097M42085 != null) {
                                                                c22097M42085.close();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        c17383 = null;
                                                        if (bitmapCreateBitmap != null) {
                                                            bitmapCreateBitmap.recycle();
                                                        }
                                                        if (c22097M42083 != null) {
                                                            c22097M42083.close();
                                                        }
                                                        if (c22097M42082 != null) {
                                                            c22097M42082.close();
                                                        }
                                                        if (c17383 != null) {
                                                            c17383.m40731((C22097) null);
                                                        }
                                                        if (pictureM38396 != null) {
                                                            pictureM38396.beginRecording(1, 1);
                                                            pictureM38396.endRecording();
                                                        }
                                                        if (c22097M42084 != null) {
                                                            c22097M42084.close();
                                                        }
                                                        if (c22097M42085 != null) {
                                                            c22097M42085.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (C19136 e2) {
                                                    e = e2;
                                                    c17387 = null;
                                                    c17383 = c17387;
                                                    pictureM38396 = null;
                                                    throw new IOException("SVG could not be parsed", e);
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    c17383 = null;
                                                    pictureM38396 = null;
                                                    if (bitmapCreateBitmap != null) {
                                                        bitmapCreateBitmap.recycle();
                                                    }
                                                    if (c22097M42083 != null) {
                                                        c22097M42083.close();
                                                    }
                                                    if (c22097M42082 != null) {
                                                        c22097M42082.close();
                                                    }
                                                    if (c17383 != null) {
                                                        c17383.m40731((C22097) null);
                                                    }
                                                    if (pictureM38396 != null) {
                                                        pictureM38396.beginRecording(1, 1);
                                                        pictureM38396.endRecording();
                                                    }
                                                    if (c22097M42084 != null) {
                                                        c22097M42084.close();
                                                    }
                                                    if (c22097M42085 != null) {
                                                        c22097M42085.close();
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                i = iM42077;
                                                i2 = iM42078;
                                                c17388 = new C17383(c16312M38391, null, i, i2, i17, c22097M42085);
                                                c22097M42085 = null;
                                            }
                                            C22097 c22097 = c22097M42085;
                                            C22097 c22098 = c22097M42084;
                                            C17383 c17389 = c17388;
                                            try {
                                                C13629 c13629 = new C13629(new C15205(abstractC22967.mo6180(), i, i2, 1, "image/svg+xml", c11679), bitmapCreateBitmap, c22097M42083, c17389);
                                                c22097M42082.close();
                                                if (c22098 != null) {
                                                    c22098.close();
                                                }
                                                if (c22097 != null) {
                                                    c22097.close();
                                                }
                                                return c13629;
                                            } catch (C19136 e3) {
                                                e = e3;
                                                c17387 = c17389;
                                                c22097M42084 = c22098;
                                                c22097M42085 = c22097;
                                                c17383 = c17387;
                                                pictureM38396 = null;
                                                throw new IOException("SVG could not be parsed", e);
                                            } catch (Throwable th4) {
                                                th = th4;
                                                c17383 = c17389;
                                                c22097M42084 = c22098;
                                                c22097M42085 = c22097;
                                                pictureM38396 = null;
                                                if (bitmapCreateBitmap != null) {
                                                    bitmapCreateBitmap.recycle();
                                                }
                                                if (c22097M42083 != null) {
                                                    c22097M42083.close();
                                                }
                                                if (c22097M42082 != null) {
                                                    c22097M42082.close();
                                                }
                                                if (c17383 != null) {
                                                    c17383.m40731((C22097) null);
                                                }
                                                if (pictureM38396 != null) {
                                                    pictureM38396.beginRecording(1, 1);
                                                    pictureM38396.endRecording();
                                                }
                                                if (c22097M42084 != null) {
                                                    c22097M42084.close();
                                                }
                                                if (c22097M42085 != null) {
                                                    c22097M42085.close();
                                                }
                                                throw th;
                                            }
                                        } catch (C19136 e4) {
                                            e = e4;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            c17383 = null;
                                            pictureM38396 = null;
                                        }
                                    } catch (C19136 e5) {
                                        e = e5;
                                        c17387 = null;
                                        bitmapCreateBitmap = null;
                                        c17383 = c17387;
                                        pictureM38396 = null;
                                        throw new IOException("SVG could not be parsed", e);
                                    } catch (Throwable th6) {
                                        th = th6;
                                        c17386 = null;
                                        pictureM38396 = null;
                                        c17383 = c17386;
                                        bitmapCreateBitmap = null;
                                        if (bitmapCreateBitmap != null) {
                                            bitmapCreateBitmap.recycle();
                                        }
                                        if (c22097M42083 != null) {
                                            c22097M42083.close();
                                        }
                                        if (c22097M42082 != null) {
                                            c22097M42082.close();
                                        }
                                        if (c17383 != null) {
                                            c17383.m40731((C22097) null);
                                        }
                                        if (pictureM38396 != null) {
                                            pictureM38396.beginRecording(1, 1);
                                            pictureM38396.endRecording();
                                        }
                                        if (c22097M42084 != null) {
                                            c22097M42084.close();
                                        }
                                        if (c22097M42085 != null) {
                                            c22097M42085.close();
                                        }
                                        throw th;
                                    }
                                } catch (C19136 e6) {
                                    e = e6;
                                    c17385 = null;
                                    c17387 = c17385;
                                    c22097M42083 = null;
                                    bitmapCreateBitmap = null;
                                    c17383 = c17387;
                                    pictureM38396 = null;
                                    throw new IOException("SVG could not be parsed", e);
                                } catch (Throwable th7) {
                                    th = th7;
                                    c17384 = null;
                                    pictureM38396 = null;
                                    c17386 = c17384;
                                    c22097M42083 = null;
                                    c17383 = c17386;
                                    bitmapCreateBitmap = null;
                                    if (bitmapCreateBitmap != null) {
                                        bitmapCreateBitmap.recycle();
                                    }
                                    if (c22097M42083 != null) {
                                        c22097M42083.close();
                                    }
                                    if (c22097M42082 != null) {
                                        c22097M42082.close();
                                    }
                                    if (c17383 != null) {
                                        c17383.m40731((C22097) null);
                                    }
                                    if (pictureM38396 != null) {
                                        pictureM38396.beginRecording(1, 1);
                                        pictureM38396.endRecording();
                                    }
                                    if (c22097M42084 != null) {
                                        c22097M42084.close();
                                    }
                                    if (c22097M42085 != null) {
                                        c22097M42085.close();
                                    }
                                    throw th;
                                }
                            }
                        }
                        i19 *= 2;
                        z11 = z;
                        iM42077 = iM42077;
                        iM42078 = iM42078;
                    }
                    throw new C1095("Animation frames do not fit allocation limit");
                } catch (C19136 e7) {
                    e = e7;
                    c17385 = null;
                    c22097M42082 = null;
                } catch (Throwable th8) {
                    th = th8;
                    c17384 = null;
                    pictureM38396 = null;
                    c22097M42082 = null;
                }
            } catch (C19136 e8) {
                e = e8;
                c22097M42082 = null;
                c22097M42083 = null;
                bitmapCreateBitmap = null;
                pictureM38396 = null;
                c17383 = null;
                c22097M42084 = null;
            } catch (Throwable th9) {
                th = th9;
                c17383 = null;
                pictureM38396 = null;
                c22097M42082 = null;
                c22097M42083 = null;
                bitmapCreateBitmap = null;
                c22097M42084 = null;
            }
        } catch (XmlPullParserException e9) {
            throw new IOException("SVG XML could not be parsed", e9);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42085(C7280 c7280, HashMap map, HashSet hashSet, long[] jArr, int i, int i2, boolean z, C9189 c9189) throws C11514, InterruptedIOException {
        m42086(c9189);
        long j = jArr[0] + 1;
        jArr[0] = j;
        if (j > X931RNG.BLOCK64_RESEED_MAX || i > 64 || !hashSet.add(c7280)) {
            throw new C11514("SVG references exceed safe render limits");
        }
        jArr[1] = Math.max(jArr[1], i);
        jArr[2] = jArr[2] + c7280.f22345;
        long j2 = jArr[4] + c7280.f22350;
        jArr[4] = j2;
        if (j2 > 1048576) {
            throw new C11514("SVG expanded geometry exceeds safe render limits");
        }
        int i3 = i2 + ((!z || i <= 0) ? c7280.f22349 : 3);
        jArr[3] = Math.max(jArr[3], i3);
        for (C7280 c7281 : c7280.f22346) {
            if (!c7281.f22348 || z) {
                m42085(c7281, map, hashSet, jArr, i + 1, i3, z, c9189);
            }
        }
        Iterator it = c7280.f22347.iterator();
        while (it.hasNext()) {
            C7280 c7282 = (C7280) map.get((String) it.next());
            if (c7282 != null) {
                m42085(c7282, map, hashSet, jArr, i + 1, i3, z, c9189);
            }
        }
        hashSet.remove(c7280);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m42077(float f) throws IOException {
        if (f <= 0.0f || Float.isInfinite(f) || f > 1000000.0f) {
            throw new IOException("Image has no finite dimensions");
        }
        return Math.max(1, (int) Math.ceil(f));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22097 m42082(C19981 c19981, long j) throws C1095 {
        C22097 c22097M46068 = c19981.m46068(j);
        if (c22097M46068 != null) {
            return c22097M46068;
        }
        throw new C1095("Special image reservation exceeds budget");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42086(InterfaceC17066 interfaceC17066) throws InterruptedIOException {
        if (interfaceC17066.mo1526()) {
            throw new InterruptedIOException("Image decode cancelled");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m42087(String str, int i, byte[] bArr) {
        if (i >= 0 && str.length() + i <= bArr.length) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (bArr[i + i2] == str.charAt(i2)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m42078(int i, byte[] bArr) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m42088(int i, byte[] bArr) {
        return ((bArr[i + 2] & 255) << 16) | m42078(i, bArr);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static long m42090(int i, byte[] bArr) {
        return ((((long) bArr[i + 3]) & 255) << 24) | (((long) m42088(i, bArr)) & 16777215);
    }
}
