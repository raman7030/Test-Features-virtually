package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֡֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: L8R4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0074 implements InterfaceC14723 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f988;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f989;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f990;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] f991;

    @Override // l.InterfaceC14723
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8353 mo1025() {
        return null;
    }

    @Override // l.InterfaceC14723
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo1026(C18252 c18252) {
    }

    @Override // l.InterfaceC14723
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] mo1027() {
        return null;
    }

    public C0074(int i, int i2, String str, byte[] bArr) {
        byte b;
        str.getClass();
        boolean z = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i2 == 23 && bArr.length == 4) {
                    z = true;
                }
                C22632.m50631(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                C22632.m50631(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i2 == 78 && bArr.length == 8) {
                    z = true;
                }
                C22632.m50631(z);
                break;
            case "auxiliary.tracks.map":
                C22632.m50631(i2 == 0);
                break;
        }
        this.f988 = str;
        this.f991 = bArr;
        this.f989 = i;
        this.f990 = i2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList m1028() {
        C22632.m50633("Metadata is not an auxiliary tracks map", this.f988.equals("auxiliary.tracks.map"));
        byte[] bArr = this.f991;
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
        if (obj != null && C0074.class == obj.getClass()) {
            C0074 c0074 = (C0074) obj;
            if (this.f988.equals(c0074.f988) && Arrays.equals(this.f991, c0074.f991) && this.f989 == c0074.f989 && this.f990 == c0074.f990) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f991) + C11010.m27349(527, 31, this.f988)) * 31) + this.f989) * 31) + this.f990;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009e  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ab A[LOOP:0: B:32:0x00a8->B:34:0x00ab, LOOP_END] */
    public final String toString() {
        String string;
        StringBuilder sb;
        String str = this.f988;
        byte[] bArr = this.f991;
        int i = this.f990;
        if (i != 0) {
            if (i == 1) {
                string = C3603.m11021(bArr);
            } else if (i == 23) {
                C4025.m12108("array too small: %s < %s", bArr.length, 4, bArr.length >= 4);
                string = String.valueOf(Float.intBitsToFloat(C13426.m32444(bArr[0], bArr[1], bArr[2], bArr[3])));
            } else if (i == 67) {
                C4025.m12108("array too small: %s < %s", bArr.length, 4, bArr.length >= 4);
                string = String.valueOf(C13426.m32444(bArr[0], bArr[1], bArr[2], bArr[3]));
            } else if (i == 75) {
                string = String.valueOf(bArr[0] & 255);
            } else if (i != 78) {
                String str2 = C3603.f11424;
                sb = new StringBuilder(bArr.length * 2);
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    sb.append(Character.forDigit((bArr[i2] >> 4) & 15, 16));
                    sb.append(Character.forDigit(bArr[i2] & 15, 16));
                }
                string = sb.toString();
            } else {
                string = String.valueOf(new C17714(bArr).m41466());
            }
        } else if (str.equals("auxiliary.tracks.map")) {
            ArrayList arrayListM1028 = m1028();
            StringBuilder sbM15339 = C5368.m15339("track types = ");
            C6847.m18530().m18534(sbM15339, arrayListM1028.iterator());
            string = sbM15339.toString();
        } else {
            String str3 = C3603.f11424;
            sb = new StringBuilder(bArr.length * 2);
            while (i2 < bArr.length) {
                sb.append(Character.forDigit((bArr[i2] >> 4) & 15, 16));
                sb.append(Character.forDigit(bArr[i2] & 15, 16));
            }
            string = sb.toString();
        }
        return C19462.m44858("mdta: key=", str, ", value=", string);
    }
}
