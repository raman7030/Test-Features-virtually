package l;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: l.ۗ᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 85A3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3454 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C0176 f10926;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f10927;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3000 f10928;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C0176 f10929;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f10930;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C0176 f10931;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3000[] f10932;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C3000 f10933;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C3000 f10934;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f10935;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C19228 f10936;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C0176 f10937;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C3000 f10938;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AbstractC10056[] f10939;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C0176 f10940;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C3454 f10941;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C21345 f10942;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3000 f10943;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C3000 f10944;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C3000 f10945;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C3000 f10946;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C0176 f10947;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f10948;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3000 f10949;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f10950;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C0176[] f10951;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C3000 f10952;

    public C3454(int i) {
        this.f10941 = this;
        this.f10948 = false;
        this.f10936 = new C19228(this);
        this.f10942 = new C21345(this);
        C0176 c0176 = new C0176(this, EnumC14993.TYPE_STRING_ID_ITEM);
        this.f10947 = c0176;
        C0176 c0177 = new C0176(this, EnumC14993.TYPE_TYPE_ID_ITEM);
        this.f10926 = c0177;
        C0176 c0178 = new C0176(this, EnumC14993.TYPE_PROTO_ID_ITEM);
        this.f10931 = c0178;
        C0176 c0179 = new C0176(this, EnumC14993.TYPE_FIELD_ID_ITEM);
        this.f10937 = c0179;
        C0176 c01710 = new C0176(this, EnumC14993.TYPE_METHOD_ID_ITEM);
        this.f10929 = c01710;
        C4865 c4865 = new C4865(this, this, EnumC14993.TYPE_CLASS_DEF_ITEM);
        this.f10940 = c4865;
        C3000 c3000 = new C3000(this, EnumC14993.TYPE_TYPE_LIST);
        this.f10933 = c3000;
        C3000 c3001 = new C3000(this, EnumC14993.TYPE_ANNOTATION_SET_REF_LIST);
        this.f10938 = c3001;
        C3000 c3002 = new C3000(this, EnumC14993.TYPE_ANNOTATION_SET_ITEM);
        this.f10943 = c3002;
        C3000 c3003 = new C3000(this, EnumC14993.TYPE_CLASS_DATA_ITEM);
        this.f10944 = c3003;
        C3000 c3004 = new C3000(this, EnumC14993.TYPE_CODE_ITEM);
        this.f10952 = c3004;
        C3000 c3005 = new C3000(this, EnumC14993.TYPE_STRING_DATA_ITEM);
        this.f10946 = c3005;
        C3000 c3006 = new C3000(this, EnumC14993.TYPE_DEBUG_INFO_ITEM);
        this.f10934 = c3006;
        C3000 c3007 = new C3000(this, EnumC14993.TYPE_ANNOTATION_ITEM);
        this.f10945 = c3007;
        C3000 c3008 = new C3000(this, EnumC14993.TYPE_ENCODED_ARRAY_ITEM);
        this.f10949 = c3008;
        C3000 c3009 = new C3000(this, EnumC14993.TYPE_ANNOTATIONS_DIRECTORY_ITEM);
        this.f10928 = c3009;
        this.f10930 = true;
        this.f10939 = new AbstractC10056[]{c0176, c0177, c0178, c0179, c01710, c4865, c3000, c3001, c3002, c3003, c3004, c3009, c3005, c3006, c3007, c3008, null, null};
        this.f10951 = new C0176[]{c0176, c0177, c0178, c0179, c01710, c4865};
        this.f10932 = new C3000[]{c3001, c3002, c3004, c3009, c3000, c3005, c3007, c3008, c3003, c3006};
    }

    public C3454(InputStream inputStream) throws IOException {
        boolean z;
        C10720 c10720;
        C12172 c12172;
        C10720 c10721;
        this(0);
        InputStream bufferedInputStream = !inputStream.markSupported() ? new BufferedInputStream(inputStream) : inputStream;
        bufferedInputStream.mark(8);
        byte[] bArrM41633 = C17775.m41633(bufferedInputStream, 8);
        bufferedInputStream.reset();
        try {
            this.f10948 = false;
            boolean zEquals = Arrays.equals(bArrM41633, C19228.f60535);
            byte[] bArr = C4411.f14116;
            byte[] bArr2 = C4411.f14115;
            if (zEquals || Arrays.equals(bArrM41633, C19228.f60534)) {
                z = true;
            } else {
                if (Arrays.equals(bArrM41633, bArr2) || Arrays.equals(bArrM41633, bArr)) {
                    this.f10948 = true;
                }
                z = false;
            }
            if (this.f10948) {
                C10720 c10722 = new C10720(C17775.m41633(bufferedInputStream, 40));
                byte[] bArrM26902 = c10722.m26902(8);
                if (!Arrays.equals(bArr2, bArrM26902) && !Arrays.equals(bArr, bArrM26902)) {
                    throw new RuntimeException("The magic value is not one of the expected values");
                }
                int iM26904 = c10722.m26904();
                int iM26905 = c10722.m26904();
                int iM26906 = c10722.m26904();
                int iM26907 = c10722.m26904();
                c10722.m26904();
                c10722.m26904();
                c10722.m26904();
                c10722.m26904();
                int i = (iM26906 - iM26904) - iM26905;
                if (i < 0) {
                    throw new C16363("Unexpected placement of the odex dependency data", null);
                }
                if (iM26904 > 40) {
                    C17775.m41633(bufferedInputStream, iM26904 - 40);
                }
                c10720 = new C10720(C17775.m41633(bufferedInputStream, iM26905));
                if (i > 0) {
                    C17775.m41633(bufferedInputStream, i);
                }
                new C19934(new C10720(C17775.m41633(bufferedInputStream, iM26907)));
            } else if (z) {
                byte[] bArr3 = new byte[10240];
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int i2 = bufferedInputStream.read(bArr3);
                    if (i2 == -1) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr3, 0, i2);
                    }
                }
                c10720 = new C10720(byteArrayOutputStream.toByteArray());
            } else {
                StringBuilder sb = new StringBuilder("bad magic value:");
                for (int i3 = 0; i3 < 8; i3++) {
                    sb.append(" ");
                    sb.append(C7746.m20771(bArrM41633[i3]));
                }
                throw new RuntimeException(sb.toString());
            }
            bufferedInputStream.close();
            C12172 c12173 = new C12172();
            this.f10936.m14657(c10720, 0, c12173);
            c10720.m26905(c12173.m29646(EnumC14993.TYPE_MAP_LIST));
            this.f10942.m14657(c10720, 0, c12173);
            C10720 c10723 = c10720;
            C12172 c12174 = c12173;
            AbstractC10056[] abstractC10056Arr = {this.f10946, this.f10947, this.f10926, this.f10933, this.f10931, this.f10937, this.f10929, this.f10945, this.f10943, this.f10938, this.f10928, this.f10934, this.f10952, this.f10944, this.f10949, this.f10940};
            int i4 = 0;
            while (i4 < 16) {
                AbstractC10056 abstractC10056 = abstractC10056Arr[i4];
                if (abstractC10056 == null) {
                    c10721 = c10723;
                    c12172 = c12174;
                } else {
                    EnumC14993 enumC14993 = abstractC10056.f30233;
                    c12172 = c12174;
                    int iM29646 = c12172.m29646(enumC14993);
                    if (iM29646 > 0) {
                        int iM29650 = c12172.m29650(enumC14993);
                        c10721 = c10723;
                        c10721.m26905(iM29646);
                        ArrayList arrayList = abstractC10056.f30234;
                        arrayList.ensureCapacity(iM29650);
                        for (int size = arrayList.size(); size < iM29650; size++) {
                            arrayList.add(null);
                        }
                        c10721.m26899(enumC14993.f45741);
                        abstractC10056.f30236 = c10721.m26898();
                        abstractC10056.mo1313(c10721, c12172);
                    } else {
                        c10721 = c10723;
                    }
                }
                i4++;
                c12174 = c12172;
                c10723 = c10721;
            }
        } catch (Throwable th) {
            bufferedInputStream.close();
            throw th;
        }
    }

    public C3454() {
        this(0);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m10580() {
        return this.f10930;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m10579() {
        return this.f10950;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m10577() {
        return this.f10935;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m10575() {
        return this.f10927;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC10056[] m10581() {
        AbstractC10056[] abstractC10056Arr = this.f10939;
        int i = 0;
        for (AbstractC10056 abstractC10056 : abstractC10056Arr) {
            if (abstractC10056 != null && abstractC10056.f30234.size() > 0) {
                i++;
            }
        }
        AbstractC10056[] abstractC10056Arr2 = new AbstractC10056[i];
        int i2 = 0;
        for (AbstractC10056 abstractC10057 : abstractC10056Arr) {
            if (abstractC10057 != null && abstractC10057.f30234.size() > 0) {
                abstractC10056Arr2[i2] = abstractC10057;
                i2++;
            }
        }
        Arrays.sort(abstractC10056Arr2, new C22504());
        return abstractC10056Arr2;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m10578() {
        int iM14658 = this.f10936.m14658(0, 0);
        C0176[] c0176Arr = this.f10951;
        int length = c0176Arr.length;
        C3000[] c3000Arr = this.f10932;
        int length2 = length + c3000Arr.length;
        AbstractC10056[] abstractC10056Arr = new AbstractC10056[length2];
        System.arraycopy(c0176Arr, 0, abstractC10056Arr, 0, c0176Arr.length);
        System.arraycopy(c3000Arr, 0, abstractC10056Arr, c0176Arr.length, c3000Arr.length);
        int i = 0;
        while (i < length2 && abstractC10056Arr[i].f30233.m35521()) {
            AbstractC10056 abstractC10056 = abstractC10056Arr[i];
            Collections.sort(abstractC10056.f30234);
            iM14658 = abstractC10056.mo14223(iM14658);
            i++;
        }
        this.f10927 = iM14658;
        while (i < length2) {
            iM14658 = abstractC10056Arr[i].mo14223(iM14658);
            i++;
        }
        int i2 = EnumC14993.TYPE_MAP_LIST.f45741 - 1;
        int iM14659 = this.f10942.m14658((iM14658 + i2) & (~i2), 0);
        this.f10950 = iM14659;
        this.f10935 = iM14659 - this.f10927;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10576(C1547 c1547) {
        this.f10936.m14660(c1547);
        C0176[] c0176Arr = this.f10951;
        int length = c0176Arr.length;
        C3000[] c3000Arr = this.f10932;
        int length2 = length + c3000Arr.length;
        AbstractC10056[] abstractC10056Arr = new AbstractC10056[length2];
        System.arraycopy(c0176Arr, 0, abstractC10056Arr, 0, c0176Arr.length);
        System.arraycopy(c3000Arr, 0, abstractC10056Arr, c0176Arr.length, c3000Arr.length);
        for (int i = 0; i < length2; i++) {
            AbstractC10056 abstractC10056 = abstractC10056Arr[i];
            abstractC10056.getClass();
            EnumC14993 enumC14993 = abstractC10056.f30233;
            String str = enumC14993.f45739;
            for (AbstractC5116 abstractC5116 : abstractC10056.f30234) {
                c1547.m5296(enumC14993.f45741);
                abstractC5116.m14660(c1547);
            }
        }
        C21345 c21345 = this.f10942;
        c21345.getClass();
        c1547.m5296(EnumC14993.TYPE_MAP_LIST.f45741);
        c21345.m14660(c1547);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10574(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr, 32, bArr.length - 32);
            try {
                int iDigest = messageDigest.digest(bArr, 12, 20);
                if (iDigest == 20) {
                    return;
                }
                throw new RuntimeException("unexpected digest write: " + iDigest + " bytes");
            } catch (DigestException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }
}
