package l;

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
public final class C6194 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f19000;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f19001;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f19002;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f19003;

    public C6194(int i, int i2, byte[] bArr) {
        this(-1L, bArr, i, i2);
    }

    public C6194(long j, byte[] bArr, int i, int i2) {
        this.f19002 = i;
        this.f19003 = i2;
        this.f19001 = j;
        this.f19000 = bArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6194 m17114(int i, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C7605.f23510[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i}[0]);
        return new C6194(3, 1, byteBufferWrap.array());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6194 m17115(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C7605.f23510[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new C6194(4, 1, byteBufferWrap.array());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6194 m17116(String str) {
        byte[] bytes = str.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(C7605.f23501);
        return new C6194(2, bytes.length, bytes);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6194 m17117(C23127 c23127, ByteOrder byteOrder) {
        C23127[] c23127Arr = {c23127};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C7605.f23510[5]]);
        byteBufferWrap.order(byteOrder);
        C23127 c23128 = c23127Arr[0];
        byteBufferWrap.putInt((int) c23128.f74374);
        byteBufferWrap.putInt((int) c23128.f74373);
        return new C6194(5, 1, byteBufferWrap.array());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
        sb.append(C7605.f23504[this.f19002]);
        sb.append(", data length:");
        return C3200.m9831(this.f19000.length, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }

    /* JADX WARN: Type inference failed for: r12v18, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.io.Serializable, l.᩺ܿ֫[]] */
    /* JADX WARN: Type inference failed for: r12v21, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v22, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v23, types: [java.io.Serializable, l.᩺ܿ֫[]] */
    /* JADX WARN: Type inference failed for: r12v24, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v25, types: [double[], java.io.Serializable] */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Serializable m17121(ByteOrder byteOrder) throws Throwable {
        C10428 c10428;
        byte b;
        byte[] bArr = this.f19000;
        C10428 c10429 = null;
        try {
            c10428 = new C10428(bArr);
            try {
                c10428.m26272(byteOrder);
                int i = this.f19002;
                int length = 0;
                int i2 = this.f19003;
                switch (i) {
                    case 1:
                    case 6:
                        if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                            String str = new String(bArr, C7605.f23501);
                            try {
                                c10428.close();
                                break;
                            } catch (IOException unused) {
                            }
                            return str;
                        }
                        String str2 = new String(new char[]{(char) (b + UTF8.S_P3A)});
                        try {
                            c10428.close();
                            break;
                        } catch (IOException unused2) {
                        }
                        return str2;
                    case 2:
                    case 7:
                        if (i2 >= C7605.f23503.length) {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= C7605.f23503.length) {
                                    length = C7605.f23503.length;
                                } else if (bArr[i3] == C7605.f23503[i3]) {
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
                                    c10428.close();
                                    return string;
                                }
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                length++;
                            }
                            c10428.close();
                            break;
                        } catch (IOException unused3) {
                        }
                        String string2 = sb.toString();
                        return string2;
                    case 3:
                        ?? r12 = new int[i2];
                        while (length < i2) {
                            r12[length] = c10428.readUnsignedShort();
                            length++;
                        }
                        try {
                            c10428.close();
                            break;
                        } catch (IOException unused4) {
                        }
                        return r12;
                    case 4:
                        ?? r13 = new long[i2];
                        while (length < i2) {
                            r13[length] = ((long) c10428.readInt()) & 4294967295L;
                            length++;
                        }
                        try {
                            c10428.close();
                            break;
                        } catch (IOException unused5) {
                        }
                        return r13;
                    case 5:
                        ?? r14 = new C23127[i2];
                        while (length < i2) {
                            r14[length] = new C23127(((long) c10428.readInt()) & 4294967295L, ((long) c10428.readInt()) & 4294967295L);
                            length++;
                        }
                        try {
                            c10428.close();
                            break;
                        } catch (IOException unused6) {
                        }
                        return r14;
                    case 8:
                        ?? r15 = new int[i2];
                        while (length < i2) {
                            r15[length] = c10428.readShort();
                            length++;
                        }
                        try {
                            c10428.close();
                            break;
                        } catch (IOException unused7) {
                        }
                        return r15;
                    case 9:
                        ?? r16 = new int[i2];
                        while (length < i2) {
                            r16[length] = c10428.readInt();
                            length++;
                        }
                        try {
                            c10428.close();
                            break;
                        } catch (IOException unused8) {
                        }
                        return r16;
                    case 10:
                        ?? r17 = new C23127[i2];
                        while (length < i2) {
                            r17[length] = new C23127(c10428.readInt(), c10428.readInt());
                            length++;
                        }
                        try {
                            c10428.close();
                            break;
                        } catch (IOException unused9) {
                        }
                        return r17;
                    case 11:
                        ?? r18 = new double[i2];
                        while (length < i2) {
                            r18[length] = c10428.readFloat();
                            length++;
                        }
                        try {
                            c10428.close();
                            break;
                        } catch (IOException unused10) {
                        }
                        return r18;
                    case 12:
                        ?? r19 = new double[i2];
                        while (length < i2) {
                            r19[length] = c10428.readDouble();
                            length++;
                        }
                        try {
                            c10428.close();
                            break;
                        } catch (IOException unused11) {
                        }
                        return r19;
                    default:
                        try {
                            c10428.close();
                            break;
                        } catch (IOException unused12) {
                        }
                        return null;
                }
            } catch (IOException unused13) {
                if (c10428 != null) {
                    try {
                        c10428.close();
                    } catch (IOException unused14) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                c10429 = c10428;
                if (c10429 != null) {
                    try {
                        c10429.close();
                    } catch (IOException unused15) {
                    }
                }
                throw th;
            }
        } catch (IOException unused16) {
            c10428 = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final double m17118(ByteOrder byteOrder) throws Throwable {
        Object objM17121 = m17121(byteOrder);
        if (objM17121 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objM17121 instanceof String) {
            return Double.parseDouble((String) objM17121);
        }
        if (objM17121 instanceof long[]) {
            long[] jArr = (long[]) objM17121;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM17121 instanceof int[]) {
            int[] iArr = (int[]) objM17121;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM17121 instanceof double[]) {
            double[] dArr = (double[]) objM17121;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM17121 instanceof C23127[]) {
            C23127[] c23127Arr = (C23127[]) objM17121;
            if (c23127Arr.length == 1) {
                C23127 c23127 = c23127Arr[0];
                return c23127.f74374 / c23127.f74373;
            }
            throw new NumberFormatException("There are more than one component");
        }
        throw new NumberFormatException("Couldn't find a double value");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m17119(ByteOrder byteOrder) {
        Object objM17121 = m17121(byteOrder);
        if (objM17121 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objM17121 instanceof String) {
            return Integer.parseInt((String) objM17121);
        }
        if (objM17121 instanceof long[]) {
            long[] jArr = (long[]) objM17121;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM17121 instanceof int[]) {
            int[] iArr = (int[]) objM17121;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        throw new NumberFormatException("Couldn't find a integer value");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m17120(ByteOrder byteOrder) {
        Object objM17121 = m17121(byteOrder);
        if (objM17121 == null) {
            return null;
        }
        if (objM17121 instanceof String) {
            return (String) objM17121;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objM17121 instanceof long[]) {
            long[] jArr = (long[]) objM17121;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM17121 instanceof int[]) {
            int[] iArr = (int[]) objM17121;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM17121 instanceof double[]) {
            double[] dArr = (double[]) objM17121;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objM17121 instanceof C23127[])) {
            return null;
        }
        C23127[] c23127Arr = (C23127[]) objM17121;
        while (i < c23127Arr.length) {
            sb.append(c23127Arr[i].f74374);
            sb.append('/');
            sb.append(c23127Arr[i].f74373);
            i++;
            if (i != c23127Arr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }
}
