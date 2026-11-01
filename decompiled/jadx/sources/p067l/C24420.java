package p067l;

import android.os.Message;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.pqc.jcajce.provider.snova.SnovaKeyFactorySpi;

/* JADX INFO: renamed from: l.᩺᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D18B */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24420 implements InterfaceC9934, InterfaceC16692, InterfaceC10399, InterfaceC7259 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f77327;

    public /* synthetic */ C24420(int i) {
        this.f77327 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m53892(int i, int i2, int i3, int i4) {
        return (i * i2) + i3 + i4;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x009e A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ long m53893(String str) {
        long j;
        long j2;
        long j3;
        int length = str.length();
        if (length == 0) {
            throw new NumberFormatException("empty string");
        }
        long j4 = 10;
        int i = 0;
        long j5 = Long.MIN_VALUE;
        if (j4 < 0) {
            j = C14849.FOREVER_NS < (j4 ^ Long.MIN_VALUE) ? 0L : 1L;
        } else {
            long j6 = (C14849.FOREVER_NS / j4) << 1;
            j = j6 + ((long) ((((-1) - (j6 * j4)) ^ Long.MIN_VALUE) >= (j4 ^ Long.MIN_VALUE) ? 1 : 0));
        }
        if (str.charAt(0) == '+' && length > 1) {
            i = 1;
        }
        long j7 = 0;
        int i2 = 10;
        while (i < length) {
            int iDigit = Character.digit(str.charAt(i), i2);
            if (iDigit == -1) {
                throw new NumberFormatException(str.toString());
            }
            if (j7 >= 0 && j7 <= j) {
                if (j7 == j) {
                    if (j4 < 0) {
                        if (C14849.FOREVER_NS < (j4 ^ j5)) {
                            j3 = -1;
                        } else {
                            j2 = (-1) - j4;
                        }
                        if (iDigit <= ((int) j3)) {
                        }
                    } else {
                        long j8 = (-1) - (((C14849.FOREVER_NS / j4) << 1) * j4);
                        j2 = j8 - ((j8 ^ j5) >= (j4 ^ j5) ? j4 : 0L);
                    }
                    j3 = j2;
                    if (iDigit <= ((int) j3)) {
                    }
                }
                j7 = (j7 * j4) + ((long) iDigit);
                i++;
                i2 = 10;
                j5 = Long.MIN_VALUE;
            }
            throw new NumberFormatException("Too large for unsigned long: ".concat(str.toString()));
        }
        return j7;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m53894(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53895(BouncyCastleProvider bouncyCastleProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        bouncyCastleProvider.addKeyInfoConverter(aSN1ObjectIdentifier, new SnovaKeyFactorySpi());
    }

    @Override // p067l.InterfaceC10399
    public InterfaceC17103 get() {
        int i = C18524.f55316;
        return null;
    }

    @Override // p067l.InterfaceC16692
    /* JADX INFO: renamed from: ֫ */
    public Object mo27141(Object obj, Throwable th) {
        return null;
    }

    @Override // p067l.InterfaceC7259
    /* JADX INFO: renamed from: ֫ */
    public void mo9163(Object obj, Message message) {
        C23469.m52200((C23469) obj);
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        InterfaceC3443 interfaceC3443 = (InterfaceC3443) obj;
        switch (this.f77327) {
            case 4:
                interfaceC3443.getClass();
                break;
            default:
                interfaceC3443.getClass();
                break;
        }
    }
}
