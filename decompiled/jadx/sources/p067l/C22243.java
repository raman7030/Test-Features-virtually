package p067l;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩷ܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56JK */
/* JADX INFO: loaded from: classes4.dex */
public final class C22243 {
    /* JADX INFO: renamed from: ֫ */
    public static C23526 m50077(AbstractC24196 abstractC24196, C16819 c16819, C21358 c21358, long j, C15535 c15535, InterfaceC18588 interfaceC18588, C21515 c21515) throws C3409 {
        C11971 c11971 = c16819.f49785;
        C13468 c13468 = c16819.f49789;
        int i = c11971.f33380;
        int i2 = c11971.f33383;
        Rect rect = new Rect(0, 0, i, i2);
        long jMin = Math.min(j, c21358.m48381());
        int i3 = 1;
        while (i3 > 0 && i3 <= 1073741824) {
            AbstractC24196.m53499(interfaceC18588);
            int iM15437 = (int) C6762.m15437(c11971.f33380, i3);
            int iM15438 = (int) C6762.m15437(i2, i3);
            long j2 = ((long) iM15437) * ((long) iM15438);
            long j3 = 4 * j2;
            c21515.getClass();
            int i4 = i2;
            if (iM15437 <= 2048 && iM15438 <= 2048 && j2 <= 4194304 && j3 <= jMin) {
                if (c15535 != null) {
                    try {
                        return c15535.m35330(rect, i3, c21358, interfaceC18588);
                    } catch (C3409 e) {
                        if (iM15437 == 1 && iM15438 == 1) {
                            throw e;
                        }
                    }
                } else {
                    C23369 c23369M48382 = c21358.m48382(c11971.m27406(false) + j3 + j3);
                    if (c23369M48382 != null) {
                        Bitmap bitmapM53284 = null;
                        try {
                            abstractC24196.m53500(c13468);
                            InputStream inputStreamMo8380 = abstractC24196.mo8380();
                            try {
                                c11971.m27407(C24040.m53285(inputStreamMo8380));
                                bitmapM53284 = C24040.m53284(inputStreamMo8380, c11971, rect, i3, interfaceC18588);
                                if (inputStreamMo8380 != null) {
                                    inputStreamMo8380.close();
                                }
                                abstractC24196.m53500(c13468);
                                AbstractC24196.m53499(interfaceC18588);
                                if (!c23369M48382.m52021(bitmapM53284.getAllocationByteCount())) {
                                    throw new C3409("TGA preview allocation exceeds budget");
                                }
                                return new C23526(bitmapM53284, c23369M48382, i3);
                            } catch (Throwable th) {
                                if (inputStreamMo8380 == null) {
                                    throw th;
                                }
                                try {
                                    inputStreamMo8380.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            if (bitmapM53284 != null) {
                                bitmapM53284.recycle();
                            }
                            c23369M48382.close();
                            throw th3;
                        }
                    }
                    if (iM15437 == 1 && iM15438 == 1) {
                        break;
                    }
                }
            }
            i3 *= 2;
            i2 = i4;
        }
        throw new C3409("TGA preview does not fit bitmap budget");
    }
}
