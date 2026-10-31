package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: l.ۘۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: T2R9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3878 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f12396 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C0225 f12397 = new C0225(5);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C0225 f12398 = new C0225(5);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m11705(int i, final byte[] bArr) {
        if (i <= 131072) {
            return m11704(0, i, bArr);
        }
        C10130 c10130 = new C10130();
        c10130.mo13231(10847);
        c10130.writeInt(i);
        ArrayList arrayList = new ArrayList((i / 10847) + 1);
        final int i2 = 0;
        while (i > 0) {
            final int iMin = Math.min(i, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
            arrayList.add(new Callable() { // from class: l.ۖۤۡ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C3878.m11704(i2, iMin, bArr);
                }
            });
            i2 += iMin;
            i -= iMin;
        }
        try {
            List listInvokeAll = C1802.f6207.invokeAll(arrayList);
            c10130.mo13231(listInvokeAll.size());
            Iterator it = listInvokeAll.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) ((Future) it.next()).get();
                c10130.m25441(bArr2.length);
                c10130.write(bArr2, 0, bArr2.length);
            }
            return c10130.m25444();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m11706(String str) {
        C0521 c0521M11702 = m11702();
        C0225 c0225 = f12398;
        byte[] bArr = (byte[]) c0225.m1479();
        if (bArr == null) {
            bArr = new byte[8192];
        }
        try {
            C2951 c2951 = new C2951(bArr, new GZIPOutputStream(c0521M11702));
            try {
                C5773.m16236(c2951, str);
                c2951.close();
                byte[] bArrCopyOf = Arrays.copyOf(c0521M11702.f2176, c0521M11702.f2177);
                m11703(c0521M11702);
                c0225.m1477(bArr);
                return bArrCopyOf;
            } catch (Throwable th) {
                try {
                    c2951.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            m11703(c0521M11702);
            c0225.m1477(bArr);
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m11707(byte[] bArr, int i) {
        C0521 c0521M11702 = m11702();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(c0521M11702);
            try {
                gZIPOutputStream.write(bArr, 0, i);
                gZIPOutputStream.close();
                byte[] bArrCopyOf = Arrays.copyOf(c0521M11702.f2176, c0521M11702.f2177);
                m11703(c0521M11702);
                return bArrCopyOf;
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            m11703(c0521M11702);
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m11704(int i, int i2, byte[] bArr) {
        C0521 c0521M11702 = m11702();
        try {
            C10007 c10007 = new C10007(c0521M11702);
            try {
                c10007.write(bArr, i, i2);
                c10007.close();
                byte[] bArrCopyOf = Arrays.copyOf(c0521M11702.f2176, c0521M11702.f2177);
                m11703(c0521M11702);
                return bArrCopyOf;
            } catch (Throwable th) {
                try {
                    c10007.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            m11703(c0521M11702);
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m11701(byte[] bArr) {
        int length = bArr.length;
        C0521 c0521M11702 = m11702();
        try {
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr, 0, length));
                try {
                    C22194.m49852(gZIPInputStream, c0521M11702);
                    String str = new String(c0521M11702.f2176, 0, c0521M11702.f2177, StandardCharsets.UTF_8);
                    gZIPInputStream.close();
                    m11703(c0521M11702);
                    return str;
                } catch (Throwable th) {
                    try {
                        gZIPInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th3) {
            m11703(c0521M11702);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m11708(byte[] bArr, int i) {
        C0521 c0521M11702 = m11702();
        try {
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr, 0, i));
                try {
                    C22194.m49852(gZIPInputStream, c0521M11702);
                    byte[] bArrCopyOf = Arrays.copyOf(c0521M11702.f2176, c0521M11702.f2177);
                    gZIPInputStream.close();
                    m11703(c0521M11702);
                    return bArrCopyOf;
                } catch (Throwable th) {
                    try {
                        gZIPInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th3) {
            m11703(c0521M11702);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0521 m11702() {
        C0521 c0521 = (C0521) f12397.m1479();
        return c0521 == null ? new C0521() : c0521;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11703(C0521 c0521) {
        if (c0521.f2176.length < 2097152) {
            c0521.m2232();
            f12397.m1477(c0521);
        }
    }
}
