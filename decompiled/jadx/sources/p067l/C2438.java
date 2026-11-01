package p067l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֡֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: L8R4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2438 implements InterfaceC16361 {

    /* JADX INFO: renamed from: ֫ */
    public final String f3762;

    /* JADX INFO: renamed from: ۧ */
    public final int f3763;

    /* JADX INFO: renamed from: ܽ */
    public final int f3764;

    /* JADX INFO: renamed from: ᩳ */
    public final byte[] f3765;

    @Override // p067l.InterfaceC16361
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C10307 mo3421() {
        return null;
    }

    @Override // p067l.InterfaceC16361
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo3422(C19715 c19715) {
    }

    @Override // p067l.InterfaceC16361
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ byte[] mo3423() {
        return null;
    }

    public C2438(int i, int i2, String str, byte[] bArr) {
        byte b;
        str.getClass();
        boolean z = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i2 == 23 && bArr.length == 4) {
                    z = true;
                }
                C23877.m52957(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                C23877.m52957(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i2 == 78 && bArr.length == 8) {
                    z = true;
                }
                C23877.m52957(z);
                break;
            case "auxiliary.tracks.map":
                C23877.m52957(i2 == 0);
                break;
        }
        this.f3762 = str;
        this.f3765 = bArr;
        this.f3763 = i;
        this.f3764 = i2;
    }

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList m3424() {
        C23877.m52959("Metadata is not an auxiliary tracks map", this.f3762.equals("auxiliary.tracks.map"));
        byte[] bArr = this.f3765;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2438.class == obj.getClass()) {
            C2438 c2438 = (C2438) obj;
            if (this.f3762.equals(c2438.f3762) && Arrays.equals(this.f3765, c2438.f3765) && this.f3763 == c2438.f3763 && this.f3764 == c2438.f3764) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f3765) + C12832.m29411(527, 31, this.f3762)) * 31) + this.f3763) * 31) + this.f3764;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ab A[LOOP:0: B:32:0x00a8->B:34:0x00ab, LOOP_END] */
    public final String toString() {
        String string;
        StringBuilder sb;
        String str = this.f3762;
        byte[] bArr = this.f3765;
        int i = this.f3764;
        if (i != 0) {
            if (i == 1) {
                string = C5792.m12997(bArr);
            } else if (i == 23) {
                C6194.m14028("array too small: %s < %s", bArr.length, 4, bArr.length >= 4);
                string = String.valueOf(Float.intBitsToFloat(C15129.m34546(bArr[0], bArr[1], bArr[2], bArr[3])));
            } else if (i == 67) {
                C6194.m14028("array too small: %s < %s", bArr.length, 4, bArr.length >= 4);
                string = String.valueOf(C15129.m34546(bArr[0], bArr[1], bArr[2], bArr[3]));
            } else if (i == 75) {
                string = String.valueOf(bArr[0] & 255);
            } else if (i != 78) {
                String str2 = C5792.f14228;
                sb = new StringBuilder(bArr.length * 2);
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    sb.append(Character.forDigit((bArr[i2] >> 4) & 15, 16));
                    sb.append(Character.forDigit(bArr[i2] & 15, 16));
                }
                string = sb.toString();
            } else {
                string = String.valueOf(new C19203(bArr).m43712());
            }
        } else if (str.equals("auxiliary.tracks.map")) {
            ArrayList arrayListM3424 = m3424();
            StringBuilder sbM17248 = C7470.m17248("track types = ");
            C8876.m20479().m20483(sbM17248, arrayListM3424.iterator());
            string = sbM17248.toString();
        } else {
            String str3 = C5792.f14228;
            sb = new StringBuilder(bArr.length * 2);
            while (i2 < bArr.length) {
                sb.append(Character.forDigit((bArr[i2] >> 4) & 15, 16));
                sb.append(Character.forDigit(bArr[i2] & 15, 16));
            }
            string = sb.toString();
        }
        return C20865.m47154("mdta: key=", str, ", value=", string);
    }
}
