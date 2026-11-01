package p067l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.util.Xml;
import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
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
public final class C19503 {
    /* JADX INFO: renamed from: ֫ */
    public static C24039 m44334(final AbstractC24196 abstractC24196, final C11773 c11773) {
        m44337(c11773);
        C13468 c13468Mo8381 = abstractC24196.mo8381();
        final C21515 c21515 = C21515.f67888;
        C6762.m15443(c13468Mo8381, c21515);
        C10115 c10115M15441 = C6762.m15441(abstractC24196, c21515);
        try {
            C12028 c12028M18539 = C8004.m18539(c10115M15441, new InterfaceC14709() { // from class: l.۫ۛۜ
                @Override // p067l.InterfaceC14709
                public final BitmapFactory.Options read() {
                    return C19503.m44330(c11773, abstractC24196, c21515);
                }
            });
            c10115M15441.m23591();
            c10115M15441.close();
            abstractC24196.m53500(c13468Mo8381);
            m44337(c11773);
            return new C24039(c13468Mo8381, c12028M18539);
        } catch (Throwable th) {
            try {
                c10115M15441.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ BitmapFactory.Options m44330(C11773 c11773, AbstractC24196 abstractC24196, C21515 c21515) throws InterruptedIOException {
        m44337(c11773);
        return C6762.m15445(abstractC24196, c21515);
    }

    /* JADX WARN: Code duplicated, block: B:170:0x0295  */
    /* JADX WARN: Code duplicated, block: B:74:0x0114 A[Catch: all -> 0x00e1, TRY_ENTER, TryCatch #1 {all -> 0x00e1, blocks: (B:27:0x0099, B:28:0x00a0, B:74:0x0114, B:75:0x0117, B:53:0x00eb, B:55:0x00f3, B:57:0x00f7, B:59:0x00fb, B:60:0x00fd, B:61:0x00fe, B:62:0x0105, B:63:0x0106, B:64:0x0108, B:65:0x0109, B:66:0x010b, B:40:0x00da, B:41:0x00dd), top: B:183:0x0099 }] */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
    
        r21.m53500(r7);
        p067l.AbstractC24196.m53499(r28);
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C15321 m44332(AbstractC24196 abstractC24196, C24039 c24039, final C21358 c21358, long j, final long j2, final C11102 c11102) {
        EnumC14039 enumC14039;
        long j3;
        C13468 c13468;
        int i;
        C15321 c15321M44331;
        final AbstractC24196 c14808;
        C7433 c7433;
        m44337(c11102);
        if (j <= 0 || j2 <= 0) {
            throw new IllegalArgumentException("Format allocation limit must be positive");
        }
        C13468 c13469 = c24039.f76361;
        abstractC24196.m53500(c13469);
        long jMin = c13469.f37803;
        EnumC14039 enumC140310 = c24039.f76360.f33529;
        if (enumC140310 == EnumC14039.BITMAP || enumC140310 == EnumC14039.TGA || enumC140310 == EnumC14039.UNKNOWN || (enumC140310 == (enumC14039 = EnumC14039.ANIMATED_WEBP) && Build.VERSION.SDK_INT < 28)) {
            return null;
        }
        long jMin2 = Math.min(j, c21358.m48381());
        if (enumC140310 == EnumC14039.GIF) {
            File fileMo19605 = abstractC24196.mo19605();
            if (fileMo19605 == null) {
                c14808 = abstractC24196;
            } else {
                File absoluteFile = fileMo19605.getAbsoluteFile();
                c14808 = new C14808(absoluteFile, "file:" + absoluteFile.getPath());
            }
            final C13468 c13468Mo8381 = fileMo19605 == null ? c13469 : c14808.mo8381();
            final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC10786());
            scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
            FutureTask futureTask = new FutureTask(new Callable() { // from class: l.ܺۨۜ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C7433.m17172(c14808, c13468Mo8381, c21358, j2, c11102, scheduledThreadPoolExecutor);
                }
            });
            scheduledThreadPoolExecutor.execute(futureTask);
            boolean z = false;
            boolean z2 = false;
            while (true) {
                try {
                    try {
                        try {
                            c7433 = (C7433) futureTask.get();
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
                                c7433.mo5663(null);
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
            return new C15321(new C16819(abstractC24196.mo8382(), c7433.f19466, c7433.f19460, 1, "image/gif", c13469), c7433);
        }
        if (enumC140310 == enumC14039 && Build.VERSION.SDK_INT >= 28) {
            C12184 c12184M28128 = C12184.m28128(abstractC24196, c13469, c21358, j2, c11102);
            return new C15321(new C16819(abstractC24196.mo8382(), c12184M28128.f34062, c12184M28128.f34040, c12184M28128.f34064, "image/webp", c13469), c12184M28128);
        }
        long jM48381 = c21358.m48381();
        long jMin3 = Math.min(X931RNG.BLOCK128_RESEED_MAX, jM48381 / 2);
        int i2 = (jMin > 0L ? 1 : (jMin == 0L ? 0 : -1));
        if (i2 < 0) {
            jMin = Math.min(X931RNG.BLOCK64_RESEED_MAX, jMin3);
        }
        if (jMin <= 0) {
            throw new IOException("Special image input is empty");
        }
        if (jMin > X931RNG.BLOCK128_RESEED_MAX) {
            throw new C13311("Special image input exceeds byte limit");
        }
        if (jMin >= jM48381) {
            throw new C3409("Special image input exceeds allocation limit");
        }
        C23369 c23369M44333 = m44333(c21358, jMin);
        try {
            byte[] bArr = new byte[(int) jMin];
            abstractC24196.m53500(c13469);
            InputStream inputStreamMo8380 = abstractC24196.mo8380();
            int i3 = 0;
            C21358 c21359 = c21358;
            while (true) {
                try {
                    m44337(c11102);
                    if (i3 == bArr.length) {
                        int i4 = inputStreamMo8380.read();
                        if (i4 < 0) {
                            j3 = jMin2;
                            c13468 = c13469;
                            break;
                        }
                        if (i2 >= 0) {
                            throw new IOException("Special image input size changed");
                        }
                        j3 = jMin2;
                        if (bArr.length >= 8388608) {
                            throw new C13311("Special image input exceeds byte limit");
                        }
                        if (bArr.length >= jMin3) {
                            throw new C3409("Input growth exceeds allocation limit");
                        }
                        int iMin = (int) Math.min(jMin3, ((long) bArr.length) * 2);
                        C13468 c134610 = c13469;
                        long j4 = iMin;
                        if (((long) bArr.length) + j4 > jM48381) {
                            throw new C3409("Input growth exceeds allocation limit");
                        }
                        C23369 c23369M44334 = m44333(c21359, j4);
                        try {
                            byte[] bArr2 = new byte[iMin];
                            System.arraycopy(bArr, 0, bArr2, 0, i3);
                            int i5 = i3 + 1;
                            bArr2[i3] = (byte) i4;
                            c23369M44333.close();
                            c23369M44333 = c23369M44334;
                            i3 = i5;
                            bArr = bArr2;
                            c13468 = c134610;
                            i2 = i2;
                            jMin3 = jMin3;
                            c13469 = c13468;
                            jMin2 = j3;
                        } catch (Throwable th2) {
                            c23369M44334.close();
                            throw th2;
                        }
                    } else {
                        j3 = jMin2;
                        c13468 = c13469;
                        int i6 = inputStreamMo8380.read(bArr, i3, bArr.length - i3);
                        if (i6 < 0) {
                            break;
                        }
                        if (i6 == 0) {
                            int i7 = inputStreamMo8380.read();
                            if (i7 < 0) {
                                break;
                            }
                            i = i3 + 1;
                            bArr[i3] = (byte) i7;
                        } else {
                            i = i3 + i6;
                        }
                        c21359 = c21358;
                        i3 = i;
                        i2 = i2;
                        jMin3 = jMin3;
                        c13469 = c13468;
                        jMin2 = j3;
                    }
                } catch (Throwable th3) {
                    if (inputStreamMo8380 == null) {
                        throw th3;
                    }
                    try {
                        inputStreamMo8380.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
                if (c23369M44333 != null) {
                    c23369M44333.close();
                }
                throw th;
            }
            if (inputStreamMo8380 != null) {
                inputStreamMo8380.close();
            }
            C13468 c134611 = c13468;
            abstractC24196.m53500(c134611);
            C11970 c11970 = new C11970(bArr, i3, c23369M44333);
            try {
                m44337(c11102);
                c15321M44331 = m44331(abstractC24196, c134611, c11970, c21358, j3, c11102);
                try {
                    abstractC24196.m53500(c134611);
                    m44337(c11102);
                    c11970.close();
                    return c15321M44331;
                } catch (Throwable th5) {
                    th = th5;
                    if (c15321M44331 != null) {
                        try {
                            c15321M44331.m34874(null);
                        } catch (Throwable th6) {
                            try {
                                c11970.close();
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
                c15321M44331 = null;
            }
        } catch (Throwable th9) {
            if (c23369M44333 != null) {
                c23369M44333.close();
            }
            throw th9;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m44340(String str, int i, byte[] bArr) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            bArr[i + i2] = (byte) str.charAt(i2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m44335(int i, int i2, byte[] bArr) {
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
    /* JADX INFO: renamed from: ֫ */
    public static C15321 m44331(AbstractC24196 abstractC24196, C13468 c13468, C11970 c11970, C21358 c21358, long j, C11102 c11102) throws Throwable {
        C18889 c18889;
        Picture pictureM40611;
        C23369 c23369M44333;
        C23369 c23369M44334;
        Bitmap bitmapCreateBitmap;
        C23369 c23369M44335;
        C18889 c188810;
        C18889 c188811;
        C18889 c188812;
        C18889 c188813;
        boolean z;
        C18889 c188814;
        int i;
        int i2;
        long j2;
        String str;
        ArrayList arrayList;
        String str2;
        String str3;
        String str4;
        byte[] bArr = c11970.f33370;
        try {
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            int i3 = 0;
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
            int i4 = 1;
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            int i5 = c11970.f33369;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i5), null);
            C9287 c9287 = new C9287(0);
            ArrayDeque arrayDeque = new ArrayDeque();
            HashMap map = new HashMap();
            arrayDeque.push(c9287);
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
                m44337(c11102);
                if (eventType == 10 && xmlPullParserNewPullParser.getText().contains("<!ENTITY")) {
                    throw new C4080("SVG entity declarations are not supported");
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
                        throw new C13311("SVG structure exceeds safe render limits");
                    }
                    String name = xmlPullParserNewPullParser.getName();
                    String namespace2 = xmlPullParserNewPullParser.getNamespace();
                    boolean z4 = namespace2 == null || namespace2.isEmpty() || "http://www.w3.org/2000/svg".equals(namespace2);
                    if (i7 != 0 || (z4 && !C14519.m33182(name))) {
                        i7++;
                    } else if (!z4) {
                        arrayDeque.push((C9287) arrayDeque.peek());
                        i5 = i5;
                        bArr = bArr;
                        arrayDeque = arrayDeque;
                        c9287 = c9287;
                    } else {
                        if ("image".equals(name)) {
                            throw new C4080("SVG embedded images are not supported");
                        }
                        C9287 c9288 = new C9287(i3);
                        ArrayList arrayList2 = c9288.f25238;
                        String str5 = "radialGradient";
                        String str6 = "pattern";
                        String str7 = "mask";
                        c9288.f25239 = "defs".equals(name) || "symbol".equals(name) || "marker".equals(name) || "clipPath".equals(name) || "pattern".equals(name) || "mask".equals(name) || "view".equals(name) || "linearGradient".equals(name) || "radialGradient".equals(name);
                        boolean z5 = "title".equals(name) || "desc".equals(name) || "style".equals(name);
                        if ("style".equals(name)) {
                            z2 = true;
                        }
                        if ("mask".equals(name) || "pattern".equals(name) || MessageHandler.Properties.Filter.equals(name) || "style".equals(name)) {
                            z3 = false;
                        }
                        ((C9287) arrayDeque.peek()).f25237.add(c9288);
                        arrayDeque.push(c9288);
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
                            c9288.f25236 += (long) strTrim.length();
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
                                c9288.f25241 += j6;
                            } else {
                                length += (long) strTrim.length();
                                j2 = jMax;
                            }
                            if (j3 > 262144 || length > 1048576) {
                                throw new C13311("SVG data exceeds safe parse limits");
                            }
                            if ("opacity".equals(attributeName) && C14519.m33184(strTrim)) {
                                c9288.f25240 = Math.max(c9288.f25240, 1);
                            }
                            if (str7.equals(attributeName) && !"none".equals(strTrim)) {
                                c9288.f25240 = 3;
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
                                        map.put(strTrim, c9288);
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
                                String strM33183 = C14519.m33183(strTrim);
                                if (!strM33183.startsWith("#")) {
                                    throw new C4080("SVG external resources are not supported");
                                }
                                arrayList = arrayList3;
                                arrayList.add(strM33183.substring(1));
                            } else {
                                str = str7;
                                arrayList = arrayList3;
                                str2 = str9;
                                str3 = str10;
                            }
                            if (!z7) {
                                C14519.m33179(attributeName, strTrim, arrayList);
                                for (int size = arrayList.size(); size < arrayList.size(); size++) {
                                    String str11 = (String) arrayList.get(size);
                                    if (!str11.startsWith("#")) {
                                        throw new C4080("SVG external resources are not supported");
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
                    c9287 = c9287;
                    int i14 = i7;
                    if (eventType == 3) {
                        i6--;
                        if (i14 > 0) {
                            i7 = i14 - 1;
                        } else {
                            arrayDeque.pop();
                        }
                    } else if (i14 == 0 && i8 > 0 && (eventType == 4 || eventType == 5)) {
                        ((C9287) arrayDeque.peek()).f25236 += (long) xmlPullParserNewPullParser.getText().length();
                        if (!xmlPullParserNewPullParser.isWhitespace()) {
                            length += (long) xmlPullParserNewPullParser.getText().length();
                        }
                        if (length > 1048576) {
                            throw new C13311("SVG text exceeds safe parse limits");
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
                c9287 = c9287;
            }
            int i15 = i5;
            byte[] bArr2 = bArr;
            C9287 c9289 = c9287;
            if (i8 == 0) {
                throw new IOException("SVG root element is missing");
            }
            long[] jArr = {0, 0, 0, 0, 0};
            m44336(c9289, map, new HashSet(), jArr, 0, 0, z2, c11102);
            long j8 = (j4 * 2) + (length * 2) + (j3 * 32) + (((long) i8) * 512) + 65536;
            int i16 = (int) jArr[3];
            int i17 = i16 + 1;
            long j9 = jArr[0];
            int i18 = (int) j9;
            long j10 = jArr[2];
            boolean z10 = z3 && j9 <= 128 && jArr[1] <= 16 && j10 <= 16384;
            C23369 c23369M44336 = m44333(c21358, j8);
            try {
                C17871 c17871M40606 = C17871.m40606(new ByteArrayInputStream(bArr2, 0, i15));
                m44337(c11102);
                RectF rectFM40623 = c17871M40606.m40623();
                float fM40625 = c17871M40606.m40625();
                float fM40620 = c17871M40606.m40620();
                if (fM40625 <= 0.0f && rectFM40623 != null) {
                    fM40625 = rectFM40623.width();
                }
                if (fM40620 <= 0.0f && rectFM40623 != null) {
                    fM40620 = rectFM40623.height();
                }
                int iM44328 = m44328(fM40625);
                int iM44329 = m44328(fM40620);
                C21515.f67888.m48719(iM44328, iM44329);
                if (rectFM40623 == null) {
                    c17871M40606.m40615(iM44328, iM44329);
                }
                boolean z11 = !C14519.m33181(c17871M40606) && Build.VERSION.SDK_INT >= 28 && z10;
                c23369M44335 = z11 ? m44333(c21358, z11 ? (((long) i18) * 256) + (j10 * 8) + 65536 : 0L) : null;
                try {
                    long jMin = Math.min(j, c21358.m48381() - c21358.m48384());
                    int i19 = 1;
                    while (i19 <= 32768) {
                        if (C6762.m15437(iM44328, i19) > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX || C6762.m15437(iM44329, i19) > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) {
                            z = z11;
                        } else {
                            z = z11;
                            if (C6762.m15438(iM44328, iM44329, i19) * ((long) i17) <= jMin) {
                                int iM15437 = (int) C6762.m15437(iM44328, i19);
                                int iM15438 = (int) C6762.m15437(iM44329, i19);
                                long j11 = ((long) iM15437) * ((long) iM15438) * 4;
                                c23369M44333 = m44333(c21358, ((long) i16) * j11);
                                try {
                                    c23369M44334 = m44333(c21358, j11);
                                    try {
                                        bitmapCreateBitmap = Bitmap.createBitmap(iM15437, iM15438, Bitmap.Config.ARGB_8888);
                                        try {
                                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                                            float f = iM44328;
                                            float f2 = iM44329;
                                            canvas.scale(iM15437 / f, iM15438 / f2);
                                            c17871M40606.m40617(canvas, new RectF(0.0f, 0.0f, f, f2));
                                            m44337(c11102);
                                            if (!c23369M44334.m52021(bitmapCreateBitmap.getAllocationByteCount())) {
                                                throw new C3409("SVG raster allocation exceeds budget");
                                            }
                                            if (z) {
                                                try {
                                                    pictureM40611 = c17871M40606.m40611(iM44328, iM44329);
                                                    try {
                                                        m44337(c11102);
                                                        i = iM44328;
                                                        i2 = iM44329;
                                                        c188814 = new C18889(null, pictureM40611, iM44328, iM44329, i17, c23369M44335);
                                                        c23369M44335 = null;
                                                    } catch (C20555 e) {
                                                        e = e;
                                                        c18889 = null;
                                                        try {
                                                            throw new IOException("SVG could not be parsed", e);
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            if (bitmapCreateBitmap != null) {
                                                                bitmapCreateBitmap.recycle();
                                                            }
                                                            if (c23369M44334 != null) {
                                                                c23369M44334.close();
                                                            }
                                                            if (c23369M44333 != null) {
                                                                c23369M44333.close();
                                                            }
                                                            if (c18889 != null) {
                                                                c18889.m42984((C23369) null);
                                                            }
                                                            if (pictureM40611 != null) {
                                                                pictureM40611.beginRecording(1, 1);
                                                                pictureM40611.endRecording();
                                                            }
                                                            if (c23369M44335 != null) {
                                                                c23369M44335.close();
                                                            }
                                                            if (c23369M44336 != null) {
                                                                c23369M44336.close();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        c18889 = null;
                                                        if (bitmapCreateBitmap != null) {
                                                            bitmapCreateBitmap.recycle();
                                                        }
                                                        if (c23369M44334 != null) {
                                                            c23369M44334.close();
                                                        }
                                                        if (c23369M44333 != null) {
                                                            c23369M44333.close();
                                                        }
                                                        if (c18889 != null) {
                                                            c18889.m42984((C23369) null);
                                                        }
                                                        if (pictureM40611 != null) {
                                                            pictureM40611.beginRecording(1, 1);
                                                            pictureM40611.endRecording();
                                                        }
                                                        if (c23369M44335 != null) {
                                                            c23369M44335.close();
                                                        }
                                                        if (c23369M44336 != null) {
                                                            c23369M44336.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (C20555 e2) {
                                                    e = e2;
                                                    c188813 = null;
                                                    c18889 = c188813;
                                                    pictureM40611 = null;
                                                    throw new IOException("SVG could not be parsed", e);
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    c18889 = null;
                                                    pictureM40611 = null;
                                                    if (bitmapCreateBitmap != null) {
                                                        bitmapCreateBitmap.recycle();
                                                    }
                                                    if (c23369M44334 != null) {
                                                        c23369M44334.close();
                                                    }
                                                    if (c23369M44333 != null) {
                                                        c23369M44333.close();
                                                    }
                                                    if (c18889 != null) {
                                                        c18889.m42984((C23369) null);
                                                    }
                                                    if (pictureM40611 != null) {
                                                        pictureM40611.beginRecording(1, 1);
                                                        pictureM40611.endRecording();
                                                    }
                                                    if (c23369M44335 != null) {
                                                        c23369M44335.close();
                                                    }
                                                    if (c23369M44336 != null) {
                                                        c23369M44336.close();
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                i = iM44328;
                                                i2 = iM44329;
                                                c188814 = new C18889(c17871M40606, null, i, i2, i17, c23369M44336);
                                                c23369M44336 = null;
                                            }
                                            C23369 c23369 = c23369M44336;
                                            C23369 c233610 = c23369M44335;
                                            C18889 c188815 = c188814;
                                            try {
                                                C15321 c15321 = new C15321(new C16819(abstractC24196.mo8382(), i, i2, 1, "image/svg+xml", c13468), bitmapCreateBitmap, c23369M44334, c188815);
                                                c23369M44333.close();
                                                if (c233610 != null) {
                                                    c233610.close();
                                                }
                                                if (c23369 != null) {
                                                    c23369.close();
                                                }
                                                return c15321;
                                            } catch (C20555 e3) {
                                                e = e3;
                                                c188813 = c188815;
                                                c23369M44335 = c233610;
                                                c23369M44336 = c23369;
                                                c18889 = c188813;
                                                pictureM40611 = null;
                                                throw new IOException("SVG could not be parsed", e);
                                            } catch (Throwable th4) {
                                                th = th4;
                                                c18889 = c188815;
                                                c23369M44335 = c233610;
                                                c23369M44336 = c23369;
                                                pictureM40611 = null;
                                                if (bitmapCreateBitmap != null) {
                                                    bitmapCreateBitmap.recycle();
                                                }
                                                if (c23369M44334 != null) {
                                                    c23369M44334.close();
                                                }
                                                if (c23369M44333 != null) {
                                                    c23369M44333.close();
                                                }
                                                if (c18889 != null) {
                                                    c18889.m42984((C23369) null);
                                                }
                                                if (pictureM40611 != null) {
                                                    pictureM40611.beginRecording(1, 1);
                                                    pictureM40611.endRecording();
                                                }
                                                if (c23369M44335 != null) {
                                                    c23369M44335.close();
                                                }
                                                if (c23369M44336 != null) {
                                                    c23369M44336.close();
                                                }
                                                throw th;
                                            }
                                        } catch (C20555 e4) {
                                            e = e4;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            c18889 = null;
                                            pictureM40611 = null;
                                        }
                                    } catch (C20555 e5) {
                                        e = e5;
                                        c188813 = null;
                                        bitmapCreateBitmap = null;
                                        c18889 = c188813;
                                        pictureM40611 = null;
                                        throw new IOException("SVG could not be parsed", e);
                                    } catch (Throwable th6) {
                                        th = th6;
                                        c188812 = null;
                                        pictureM40611 = null;
                                        c18889 = c188812;
                                        bitmapCreateBitmap = null;
                                        if (bitmapCreateBitmap != null) {
                                            bitmapCreateBitmap.recycle();
                                        }
                                        if (c23369M44334 != null) {
                                            c23369M44334.close();
                                        }
                                        if (c23369M44333 != null) {
                                            c23369M44333.close();
                                        }
                                        if (c18889 != null) {
                                            c18889.m42984((C23369) null);
                                        }
                                        if (pictureM40611 != null) {
                                            pictureM40611.beginRecording(1, 1);
                                            pictureM40611.endRecording();
                                        }
                                        if (c23369M44335 != null) {
                                            c23369M44335.close();
                                        }
                                        if (c23369M44336 != null) {
                                            c23369M44336.close();
                                        }
                                        throw th;
                                    }
                                } catch (C20555 e6) {
                                    e = e6;
                                    c188811 = null;
                                    c188813 = c188811;
                                    c23369M44334 = null;
                                    bitmapCreateBitmap = null;
                                    c18889 = c188813;
                                    pictureM40611 = null;
                                    throw new IOException("SVG could not be parsed", e);
                                } catch (Throwable th7) {
                                    th = th7;
                                    c188810 = null;
                                    pictureM40611 = null;
                                    c188812 = c188810;
                                    c23369M44334 = null;
                                    c18889 = c188812;
                                    bitmapCreateBitmap = null;
                                    if (bitmapCreateBitmap != null) {
                                        bitmapCreateBitmap.recycle();
                                    }
                                    if (c23369M44334 != null) {
                                        c23369M44334.close();
                                    }
                                    if (c23369M44333 != null) {
                                        c23369M44333.close();
                                    }
                                    if (c18889 != null) {
                                        c18889.m42984((C23369) null);
                                    }
                                    if (pictureM40611 != null) {
                                        pictureM40611.beginRecording(1, 1);
                                        pictureM40611.endRecording();
                                    }
                                    if (c23369M44335 != null) {
                                        c23369M44335.close();
                                    }
                                    if (c23369M44336 != null) {
                                        c23369M44336.close();
                                    }
                                    throw th;
                                }
                            }
                        }
                        i19 *= 2;
                        z11 = z;
                        iM44328 = iM44328;
                        iM44329 = iM44329;
                    }
                    throw new C3409("Animation frames do not fit allocation limit");
                } catch (C20555 e7) {
                    e = e7;
                    c188811 = null;
                    c23369M44333 = null;
                } catch (Throwable th8) {
                    th = th8;
                    c188810 = null;
                    pictureM40611 = null;
                    c23369M44333 = null;
                }
            } catch (C20555 e8) {
                e = e8;
                c23369M44333 = null;
                c23369M44334 = null;
                bitmapCreateBitmap = null;
                pictureM40611 = null;
                c18889 = null;
                c23369M44335 = null;
            } catch (Throwable th9) {
                th = th9;
                c18889 = null;
                pictureM40611 = null;
                c23369M44333 = null;
                c23369M44334 = null;
                bitmapCreateBitmap = null;
                c23369M44335 = null;
            }
        } catch (XmlPullParserException e9) {
            throw new IOException("SVG XML could not be parsed", e9);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m44336(C9287 c9287, HashMap map, HashSet hashSet, long[] jArr, int i, int i2, boolean z, C11102 c11102) throws C13311, InterruptedIOException {
        m44337(c11102);
        long j = jArr[0] + 1;
        jArr[0] = j;
        if (j > X931RNG.BLOCK64_RESEED_MAX || i > 64 || !hashSet.add(c9287)) {
            throw new C13311("SVG references exceed safe render limits");
        }
        jArr[1] = Math.max(jArr[1], i);
        jArr[2] = jArr[2] + c9287.f25236;
        long j2 = jArr[4] + c9287.f25241;
        jArr[4] = j2;
        if (j2 > 1048576) {
            throw new C13311("SVG expanded geometry exceeds safe render limits");
        }
        int i3 = i2 + ((!z || i <= 0) ? c9287.f25240 : 3);
        jArr[3] = Math.max(jArr[3], i3);
        for (C9287 c9288 : c9287.f25237) {
            if (!c9288.f25239 || z) {
                m44336(c9288, map, hashSet, jArr, i + 1, i3, z, c11102);
            }
        }
        Iterator it = c9287.f25238.iterator();
        while (it.hasNext()) {
            C9287 c9289 = (C9287) map.get((String) it.next());
            if (c9289 != null) {
                m44336(c9289, map, hashSet, jArr, i + 1, i3, z, c11102);
            }
        }
        hashSet.remove(c9287);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m44328(float f) throws IOException {
        if (f <= 0.0f || Float.isInfinite(f) || f > 1000000.0f) {
            throw new IOException("Image has no finite dimensions");
        }
        return Math.max(1, (int) Math.ceil(f));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23369 m44333(C21358 c21358, long j) throws C3409 {
        C23369 c23369M48382 = c21358.m48382(j);
        if (c23369M48382 != null) {
            return c23369M48382;
        }
        throw new C3409("Special image reservation exceeds budget");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m44337(InterfaceC18588 interfaceC18588) throws InterruptedIOException {
        if (interfaceC18588.mo3924()) {
            throw new InterruptedIOException("Image decode cancelled");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m44338(String str, int i, byte[] bArr) {
        if (i >= 0 && str.length() + i <= bArr.length) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (bArr[i + i2] == str.charAt(i2)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m44329(int i, byte[] bArr) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m44339(int i, byte[] bArr) {
        return ((bArr[i + 2] & 255) << 16) | m44329(i, bArr);
    }

    /* JADX INFO: renamed from: ܽ */
    public static long m44341(int i, byte[] bArr) {
        return ((((long) bArr[i + 3]) & 255) << 24) | (((long) m44339(i, bArr)) & 16777215);
    }
}
