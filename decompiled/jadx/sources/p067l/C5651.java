package p067l;

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
public final class C5651 {

    /* JADX INFO: renamed from: ֡ */
    public final C2535 f13727;

    /* JADX INFO: renamed from: ֨ */
    public int f13728;

    /* JADX INFO: renamed from: ֫ */
    public final C5219 f13729;

    /* JADX INFO: renamed from: ۖ */
    public final C2535 f13730;

    /* JADX INFO: renamed from: ۗ */
    public final boolean f13731;

    /* JADX INFO: renamed from: ۘ */
    public final C2535 f13732;

    /* JADX INFO: renamed from: ۙ */
    public final C5219[] f13733;

    /* JADX INFO: renamed from: ۚ */
    public final C5219 f13734;

    /* JADX INFO: renamed from: ۜ */
    public final C5219 f13735;

    /* JADX INFO: renamed from: ۠ */
    public int f13736;

    /* JADX INFO: renamed from: ۡ */
    public final C20642 f13737;

    /* JADX INFO: renamed from: ۢ */
    public final C2535 f13738;

    /* JADX INFO: renamed from: ۧ */
    public final C5219 f13739;

    /* JADX INFO: renamed from: ۬ */
    public final AbstractC11925[] f13740;

    /* JADX INFO: renamed from: ܳ */
    public final C2535 f13741;

    /* JADX INFO: renamed from: ܶ */
    public final C5651 f13742;

    /* JADX INFO: renamed from: ܺ */
    public final C22654 f13743;

    /* JADX INFO: renamed from: ܽ */
    public final C5219 f13744;

    /* JADX INFO: renamed from: ܿ */
    public final C5219 f13745;

    /* JADX INFO: renamed from: ᩳ */
    public final C5219 f13746;

    /* JADX INFO: renamed from: ᩴ */
    public final C5219 f13747;

    /* JADX INFO: renamed from: ᩵ */
    public final C2535 f13748;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f13749;

    /* JADX INFO: renamed from: ᩷ */
    public final C5219 f13750;

    /* JADX INFO: renamed from: ᩸ */
    public int f13751;

    /* JADX INFO: renamed from: ᩹ */
    public final C2535[] f13752;

    /* JADX INFO: renamed from: ᩻ */
    public final C5219 f13753;

    public C5651(int i) {
        this.f13742 = this;
        this.f13749 = false;
        this.f13737 = new C20642(this);
        this.f13743 = new C22654(this);
        C2535 c2535 = new C2535(this, EnumC16617.TYPE_STRING_ID_ITEM);
        this.f13748 = c2535;
        C2535 c2536 = new C2535(this, EnumC16617.TYPE_TYPE_ID_ITEM);
        this.f13727 = c2536;
        C2535 c2537 = new C2535(this, EnumC16617.TYPE_PROTO_ID_ITEM);
        this.f13732 = c2537;
        C2535 c2538 = new C2535(this, EnumC16617.TYPE_FIELD_ID_ITEM);
        this.f13738 = c2538;
        C2535 c2539 = new C2535(this, EnumC16617.TYPE_METHOD_ID_ITEM);
        this.f13730 = c2539;
        C6992 c6992 = new C6992(this, this, EnumC16617.TYPE_CLASS_DEF_ITEM);
        this.f13741 = c6992;
        C5219 c5219 = new C5219(this, EnumC16617.TYPE_TYPE_LIST);
        this.f13734 = c5219;
        C5219 c52110 = new C5219(this, EnumC16617.TYPE_ANNOTATION_SET_REF_LIST);
        this.f13739 = c52110;
        C5219 c52111 = new C5219(this, EnumC16617.TYPE_ANNOTATION_SET_ITEM);
        this.f13744 = c52111;
        C5219 c52112 = new C5219(this, EnumC16617.TYPE_CLASS_DATA_ITEM);
        this.f13745 = c52112;
        C5219 c52113 = new C5219(this, EnumC16617.TYPE_CODE_ITEM);
        this.f13753 = c52113;
        C5219 c52114 = new C5219(this, EnumC16617.TYPE_STRING_DATA_ITEM);
        this.f13747 = c52114;
        C5219 c52115 = new C5219(this, EnumC16617.TYPE_DEBUG_INFO_ITEM);
        this.f13735 = c52115;
        C5219 c52116 = new C5219(this, EnumC16617.TYPE_ANNOTATION_ITEM);
        this.f13746 = c52116;
        C5219 c52117 = new C5219(this, EnumC16617.TYPE_ENCODED_ARRAY_ITEM);
        this.f13750 = c52117;
        C5219 c52118 = new C5219(this, EnumC16617.TYPE_ANNOTATIONS_DIRECTORY_ITEM);
        this.f13729 = c52118;
        this.f13731 = true;
        this.f13740 = new AbstractC11925[]{c2535, c2536, c2537, c2538, c2539, c6992, c5219, c52110, c52111, c52112, c52113, c52118, c52114, c52115, c52116, c52117, null, null};
        this.f13752 = new C2535[]{c2535, c2536, c2537, c2538, c2539, c6992};
        this.f13733 = new C5219[]{c52110, c52111, c52113, c52118, c5219, c52114, c52116, c52117, c52112, c52115};
    }

    public C5651(InputStream inputStream) throws IOException {
        boolean z;
        C12556 c12556;
        C13936 c13936;
        C12556 c12557;
        this(0);
        InputStream bufferedInputStream = !inputStream.markSupported() ? new BufferedInputStream(inputStream) : inputStream;
        bufferedInputStream.mark(8);
        byte[] bArrM43879 = C19261.m43879(bufferedInputStream, 8);
        bufferedInputStream.reset();
        try {
            this.f13749 = false;
            boolean zEquals = Arrays.equals(bArrM43879, C20642.f63766);
            byte[] bArr = C6560.f16932;
            byte[] bArr2 = C6560.f16931;
            if (zEquals || Arrays.equals(bArrM43879, C20642.f63765)) {
                z = true;
            } else {
                if (Arrays.equals(bArrM43879, bArr2) || Arrays.equals(bArrM43879, bArr)) {
                    this.f13749 = true;
                }
                z = false;
            }
            if (this.f13749) {
                C12556 c12558 = new C12556(C19261.m43879(bufferedInputStream, 40));
                byte[] bArrM28942 = c12558.m28942(8);
                if (!Arrays.equals(bArr2, bArrM28942) && !Arrays.equals(bArr, bArrM28942)) {
                    throw new RuntimeException("The magic value is not one of the expected values");
                }
                int iM28944 = c12558.m28944();
                int iM28945 = c12558.m28944();
                int iM28946 = c12558.m28944();
                int iM28947 = c12558.m28944();
                c12558.m28944();
                c12558.m28944();
                c12558.m28944();
                c12558.m28944();
                int i = (iM28946 - iM28944) - iM28945;
                if (i < 0) {
                    throw new C17919("Unexpected placement of the odex dependency data", null);
                }
                if (iM28944 > 40) {
                    C19261.m43879(bufferedInputStream, iM28944 - 40);
                }
                c12556 = new C12556(C19261.m43879(bufferedInputStream, iM28945));
                if (i > 0) {
                    C19261.m43879(bufferedInputStream, i);
                }
                new C21313(new C12556(C19261.m43879(bufferedInputStream, iM28947)));
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
                c12556 = new C12556(byteArrayOutputStream.toByteArray());
            } else {
                StringBuilder sb = new StringBuilder("bad magic value:");
                for (int i3 = 0; i3 < 8; i3++) {
                    sb.append(" ");
                    sb.append(C9731.m22752(bArrM43879[i3]));
                }
                throw new RuntimeException(sb.toString());
            }
            bufferedInputStream.close();
            C13936 c13937 = new C13936();
            this.f13737.m16565(c12556, 0, c13937);
            c12556.m28945(c13937.m31708(EnumC16617.TYPE_MAP_LIST));
            this.f13743.m16565(c12556, 0, c13937);
            C12556 c12559 = c12556;
            C13936 c13938 = c13937;
            AbstractC11925[] abstractC11925Arr = {this.f13747, this.f13748, this.f13727, this.f13734, this.f13732, this.f13738, this.f13730, this.f13746, this.f13744, this.f13739, this.f13729, this.f13735, this.f13753, this.f13745, this.f13750, this.f13741};
            int i4 = 0;
            while (i4 < 16) {
                AbstractC11925 abstractC11925 = abstractC11925Arr[i4];
                if (abstractC11925 == null) {
                    c12557 = c12559;
                    c13936 = c13938;
                } else {
                    EnumC16617 enumC16617 = abstractC11925.f33191;
                    c13936 = c13938;
                    int iM31708 = c13936.m31708(enumC16617);
                    if (iM31708 > 0) {
                        int iM31712 = c13936.m31712(enumC16617);
                        c12557 = c12559;
                        c12557.m28945(iM31708);
                        ArrayList arrayList = abstractC11925.f33192;
                        arrayList.ensureCapacity(iM31712);
                        for (int size = arrayList.size(); size < iM31712; size++) {
                            arrayList.add(null);
                        }
                        c12557.m28939(enumC16617.f48854);
                        abstractC11925.f33194 = c12557.m28938();
                        abstractC11925.mo3721(c12557, c13936);
                    } else {
                        c12557 = c12559;
                    }
                }
                i4++;
                c13938 = c13936;
                c12559 = c12557;
            }
        } catch (Throwable th) {
            bufferedInputStream.close();
            throw th;
        }
    }

    public C5651() {
        this(0);
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m12588() {
        return this.f13731;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m12587() {
        return this.f13751;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m12585() {
        return this.f13736;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m12583() {
        return this.f13728;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC11925[] m12589() {
        AbstractC11925[] abstractC11925Arr = this.f13740;
        int i = 0;
        for (AbstractC11925 abstractC11925 : abstractC11925Arr) {
            if (abstractC11925 != null && abstractC11925.f33192.size() > 0) {
                i++;
            }
        }
        AbstractC11925[] abstractC11925Arr2 = new AbstractC11925[i];
        int i2 = 0;
        for (AbstractC11925 abstractC11926 : abstractC11925Arr) {
            if (abstractC11926 != null && abstractC11926.f33192.size() > 0) {
                abstractC11925Arr2[i2] = abstractC11926;
                i2++;
            }
        }
        Arrays.sort(abstractC11925Arr2, new C23756());
        return abstractC11925Arr2;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m12586() {
        int iM16566 = this.f13737.m16566(0, 0);
        C2535[] c2535Arr = this.f13752;
        int length = c2535Arr.length;
        C5219[] c5219Arr = this.f13733;
        int length2 = length + c5219Arr.length;
        AbstractC11925[] abstractC11925Arr = new AbstractC11925[length2];
        System.arraycopy(c2535Arr, 0, abstractC11925Arr, 0, c2535Arr.length);
        System.arraycopy(c5219Arr, 0, abstractC11925Arr, c2535Arr.length, c5219Arr.length);
        int i = 0;
        while (i < length2 && abstractC11925Arr[i].f33191.m37677()) {
            AbstractC11925 abstractC11925 = abstractC11925Arr[i];
            Collections.sort(abstractC11925.f33192);
            iM16566 = abstractC11925.mo16104(iM16566);
            i++;
        }
        this.f13728 = iM16566;
        while (i < length2) {
            iM16566 = abstractC11925Arr[i].mo16104(iM16566);
            i++;
        }
        int i2 = EnumC16617.TYPE_MAP_LIST.f48854 - 1;
        int iM16567 = this.f13743.m16566((iM16566 + i2) & (~i2), 0);
        this.f13751 = iM16567;
        this.f13736 = iM16567 - this.f13728;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12584(C3838 c3838) {
        this.f13737.m16568(c3838);
        C2535[] c2535Arr = this.f13752;
        int length = c2535Arr.length;
        C5219[] c5219Arr = this.f13733;
        int length2 = length + c5219Arr.length;
        AbstractC11925[] abstractC11925Arr = new AbstractC11925[length2];
        System.arraycopy(c2535Arr, 0, abstractC11925Arr, 0, c2535Arr.length);
        System.arraycopy(c5219Arr, 0, abstractC11925Arr, c2535Arr.length, c5219Arr.length);
        for (int i = 0; i < length2; i++) {
            AbstractC11925 abstractC11925 = abstractC11925Arr[i];
            abstractC11925.getClass();
            EnumC16617 enumC16617 = abstractC11925.f33191;
            String str = enumC16617.f48852;
            for (AbstractC7230 abstractC7230 : abstractC11925.f33192) {
                c3838.m7525(enumC16617.f48854);
                abstractC7230.m16568(c3838);
            }
        }
        C22654 c22654 = this.f13743;
        c22654.getClass();
        c3838.m7525(EnumC16617.TYPE_MAP_LIST.f48854);
        c22654.m16568(c3838);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m12582(byte[] bArr) {
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
