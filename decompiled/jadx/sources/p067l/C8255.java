package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.bouncycastle.util.encoders.UTF8;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.ۛܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 057Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C8255 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f21861;

    /* JADX INFO: renamed from: ۧ */
    public final long f21862;

    /* JADX INFO: renamed from: ܽ */
    public final int f21863;

    /* JADX INFO: renamed from: ᩳ */
    public final int f21864;

    public C8255(int i, int i2, byte[] bArr) {
        this(-1L, bArr, i, i2);
    }

    public C8255(long j, byte[] bArr, int i, int i2) {
        this.f21863 = i;
        this.f21864 = i2;
        this.f21862 = j;
        this.f21861 = bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8255 m19046(int i, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C9596.f26423[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i}[0]);
        return new C8255(3, 1, byteBufferWrap.array());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8255 m19047(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C9596.f26423[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new C8255(4, 1, byteBufferWrap.array());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8255 m19048(String str) {
        byte[] bytes = str.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(C9596.f26414);
        return new C8255(2, bytes.length, bytes);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8255 m19049(C24348 c24348, ByteOrder byteOrder) {
        C24348[] c24348Arr = {c24348};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C9596.f26423[5]]);
        byteBufferWrap.order(byteOrder);
        C24348 c24349 = c24348Arr[0];
        byteBufferWrap.putInt((int) c24349.f77120);
        byteBufferWrap.putInt((int) c24349.f77119);
        return new C8255(5, 1, byteBufferWrap.array());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
        sb.append(C9596.f26417[this.f21863]);
        sb.append(", data length:");
        return C5410.m11876(this.f21861.length, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }

    /* JADX WARN: Type inference failed for: r12v18, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.io.Serializable, l.᩺ܿ֫[]] */
    /* JADX WARN: Type inference failed for: r12v21, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v22, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v23, types: [java.io.Serializable, l.᩺ܿ֫[]] */
    /* JADX WARN: Type inference failed for: r12v24, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v25, types: [double[], java.io.Serializable] */
    /* JADX INFO: renamed from: ᩳ */
    public final Serializable m19053(ByteOrder byteOrder) throws Throwable {
        C12279 c12279;
        byte b;
        byte[] bArr = this.f21861;
        C12279 c122710 = null;
        try {
            c12279 = new C12279(bArr);
            try {
                c12279.m28301(byteOrder);
                int i = this.f21863;
                int length = 0;
                int i2 = this.f21864;
                switch (i) {
                    case 1:
                    case 6:
                        if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                            String str = new String(bArr, C9596.f26414);
                            try {
                                c12279.close();
                                break;
                            } catch (IOException unused) {
                            }
                            return str;
                        }
                        String str2 = new String(new char[]{(char) (b + UTF8.S_P3A)});
                        try {
                            c12279.close();
                            break;
                        } catch (IOException unused2) {
                        }
                        return str2;
                    case 2:
                    case 7:
                        if (i2 >= C9596.f26416.length) {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= C9596.f26416.length) {
                                    length = C9596.f26416.length;
                                } else if (bArr[i3] == C9596.f26416[i3]) {
                                    i3++;
                                }
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        try {
                            while (length < i2) {
                                byte b2 = bArr[length];
                                if (b2 == 0) {
                                    String string = sb.toString();
                                    c12279.close();
                                    return string;
                                }
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                length++;
                            }
                            c12279.close();
                            break;
                        } catch (IOException unused3) {
                        }
                        String string2 = sb.toString();
                        return string2;
                    case 3:
                        ?? r12 = new int[i2];
                        while (length < i2) {
                            r12[length] = c12279.readUnsignedShort();
                            length++;
                        }
                        try {
                            c12279.close();
                            break;
                        } catch (IOException unused4) {
                        }
                        return r12;
                    case 4:
                        ?? r13 = new long[i2];
                        while (length < i2) {
                            r13[length] = ((long) c12279.readInt()) & 4294967295L;
                            length++;
                        }
                        try {
                            c12279.close();
                            break;
                        } catch (IOException unused5) {
                        }
                        return r13;
                    case 5:
                        ?? r14 = new C24348[i2];
                        while (length < i2) {
                            r14[length] = new C24348(((long) c12279.readInt()) & 4294967295L, ((long) c12279.readInt()) & 4294967295L);
                            length++;
                        }
                        try {
                            c12279.close();
                            break;
                        } catch (IOException unused6) {
                        }
                        return r14;
                    case 8:
                        ?? r15 = new int[i2];
                        while (length < i2) {
                            r15[length] = c12279.readShort();
                            length++;
                        }
                        try {
                            c12279.close();
                            break;
                        } catch (IOException unused7) {
                        }
                        return r15;
                    case 9:
                        ?? r16 = new int[i2];
                        while (length < i2) {
                            r16[length] = c12279.readInt();
                            length++;
                        }
                        try {
                            c12279.close();
                            break;
                        } catch (IOException unused8) {
                        }
                        return r16;
                    case 10:
                        ?? r17 = new C24348[i2];
                        while (length < i2) {
                            r17[length] = new C24348(c12279.readInt(), c12279.readInt());
                            length++;
                        }
                        try {
                            c12279.close();
                            break;
                        } catch (IOException unused9) {
                        }
                        return r17;
                    case 11:
                        ?? r18 = new double[i2];
                        while (length < i2) {
                            r18[length] = c12279.readFloat();
                            length++;
                        }
                        try {
                            c12279.close();
                            break;
                        } catch (IOException unused10) {
                        }
                        return r18;
                    case 12:
                        ?? r19 = new double[i2];
                        while (length < i2) {
                            r19[length] = c12279.readDouble();
                            length++;
                        }
                        try {
                            c12279.close();
                            break;
                        } catch (IOException unused11) {
                        }
                        return r19;
                    default:
                        try {
                            c12279.close();
                            break;
                        } catch (IOException unused12) {
                        }
                        return null;
                }
            } catch (IOException unused13) {
                if (c12279 != null) {
                    try {
                        c12279.close();
                    } catch (IOException unused14) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                c122710 = c12279;
                if (c122710 != null) {
                    try {
                        c122710.close();
                    } catch (IOException unused15) {
                    }
                }
                throw th;
            }
        } catch (IOException unused16) {
            c12279 = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final double m19050(ByteOrder byteOrder) throws Throwable {
        Object objM19053 = m19053(byteOrder);
        if (objM19053 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objM19053 instanceof String) {
            return Double.parseDouble((String) objM19053);
        }
        if (objM19053 instanceof long[]) {
            long[] jArr = (long[]) objM19053;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM19053 instanceof int[]) {
            int[] iArr = (int[]) objM19053;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM19053 instanceof double[]) {
            double[] dArr = (double[]) objM19053;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM19053 instanceof C24348[]) {
            C24348[] c24348Arr = (C24348[]) objM19053;
            if (c24348Arr.length == 1) {
                C24348 c24348 = c24348Arr[0];
                return c24348.f77120 / c24348.f77119;
            }
            throw new NumberFormatException("There are more than one component");
        }
        throw new NumberFormatException("Couldn't find a double value");
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m19051(ByteOrder byteOrder) {
        Object objM19053 = m19053(byteOrder);
        if (objM19053 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objM19053 instanceof String) {
            return Integer.parseInt((String) objM19053);
        }
        if (objM19053 instanceof long[]) {
            long[] jArr = (long[]) objM19053;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM19053 instanceof int[]) {
            int[] iArr = (int[]) objM19053;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        throw new NumberFormatException("Couldn't find a integer value");
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m19052(ByteOrder byteOrder) {
        Object objM19053 = m19053(byteOrder);
        if (objM19053 == null) {
            return null;
        }
        if (objM19053 instanceof String) {
            return (String) objM19053;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objM19053 instanceof long[]) {
            long[] jArr = (long[]) objM19053;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM19053 instanceof int[]) {
            int[] iArr = (int[]) objM19053;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM19053 instanceof double[]) {
            double[] dArr = (double[]) objM19053;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objM19053 instanceof C24348[])) {
            return null;
        }
        C24348[] c24348Arr = (C24348[]) objM19053;
        while (i < c24348Arr.length) {
            sb.append(c24348Arr[i].f77120);
            sb.append('/');
            sb.append(c24348Arr[i].f77119);
            i++;
            if (i != c24348Arr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }
}
