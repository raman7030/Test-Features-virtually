package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.io.EOFException;
import java.security.MessageDigest;
import java.util.ArrayList;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ۘᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1VP */
/* JADX INFO: loaded from: classes2.dex */
public final class C6277 {

    /* JADX INFO: renamed from: ֫ */
    public final MessageDigest f15879 = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);

    /* JADX INFO: renamed from: ۧ */
    public final byte[] f15880;

    public C6277(byte[] bArr) {
        this.f15880 = bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m14249(InterfaceC2903 interfaceC2903, InterfaceC2903 interfaceC2904, InterfaceC2903 interfaceC2905, InterfaceC18588 interfaceC18588) throws EOFException {
        long j;
        InterfaceC2903 interfaceC2903M17548;
        if (interfaceC2903.size() % ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF != 0) {
            throw new IllegalStateException("APK Signing Block size not a multiple of 4096: " + interfaceC2903.size());
        }
        C17655 c17655M17549 = C7598.m17549(interfaceC2903, interfaceC2904, interfaceC2905);
        MessageDigest messageDigest = this.f15879;
        int digestLength = messageDigest.getDigestLength();
        long size = c17655M17549.size();
        ArrayList arrayList = new ArrayList();
        do {
            j = digestLength;
            size = ((size + 4095) / ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) * j;
            arrayList.add(Long.valueOf(((size + 4095) / ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) * ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF));
        } while (size > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF);
        int size2 = arrayList.size();
        int[] iArr = new int[size2 + 1];
        iArr[0] = 0;
        int i = 0;
        while (i < arrayList.size()) {
            int i2 = i + 1;
            int i3 = iArr[i];
            long jLongValue = ((Long) arrayList.get((arrayList.size() - i) - 1)).longValue();
            int i4 = (int) jLongValue;
            if (i4 != jLongValue) {
                throw new ArithmeticException("integer overflow");
            }
            iArr[i2] = i3 + i4;
            i = i2;
        }
        byte[] bArr = new byte[iArr[size2]];
        int i5 = size2 - 1;
        int i6 = i5;
        while (true) {
            byte[] bArr2 = this.f15880;
            if (i6 < 0) {
                messageDigest.reset();
                messageDigest.update(bArr2);
                messageDigest.update(bArr, 0, 4096);
                return messageDigest.digest();
            }
            int i7 = i6 + 1;
            C11622 c11622M10446 = C4916.m10446(iArr[i6], iArr[i7], bArr);
            if (i6 == i5) {
                interfaceC2903M17548 = c17655M17549;
            } else {
                int i8 = iArr[i7];
                interfaceC2903M17548 = C7598.m17548(i8, iArr[i6 + 2] - i8, bArr);
            }
            InterfaceC2903 interfaceC2903Mo4685 = interfaceC2903M17548.mo4685();
            long size3 = interfaceC2903Mo4685.size();
            long j2 = 0;
            while (true) {
                j2 += ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
                if (j2 > size3) {
                    break;
                }
                messageDigest.reset();
                messageDigest.update(bArr2);
                interfaceC2903Mo4685.mo4683(messageDigest, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF);
                byte[] bArrDigest = messageDigest.digest();
                c11622M10446.m26740(bArrDigest.length, bArrDigest);
            }
            int i9 = (int) (size3 % ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF);
            if (i9 > 0) {
                throw new IllegalStateException(C20778.m46922(i9, "Remaining: "));
            }
            int size4 = (int) ((((interfaceC2903M17548.size() + 4095) / ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) * j) % ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF);
            if (size4 > 0) {
                int i10 = 4096 - size4;
                c11622M10446.m26740(i10, new byte[i10]);
            }
            if (interfaceC18588.mo3924()) {
                return null;
            }
            i6--;
        }
    }
}
