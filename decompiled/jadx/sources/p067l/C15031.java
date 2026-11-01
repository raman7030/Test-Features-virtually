package p067l;

import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.۬᩵ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6VE */
/* JADX INFO: loaded from: classes3.dex */
public final class C15031 {

    /* JADX INFO: renamed from: ܿ */
    public static final int[] f42941 = new int[0];

    /* JADX INFO: renamed from: ֫ */
    public final C5644 f42942;

    /* JADX INFO: renamed from: ۧ */
    public final int[][] f42943;

    /* JADX INFO: renamed from: ܽ */
    public final C5644 f42944;

    /* JADX INFO: renamed from: ᩳ */
    public final int[][] f42945;

    public C15031(C5644 c5644, C5644 c5645, int[][] iArr, int[][] iArr2) {
        this.f42944 = c5644;
        this.f42942 = c5645;
        this.f42945 = iArr;
        this.f42943 = iArr2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15031 m34404(C7795 c7795) {
        C7933 c7933M34403;
        int i;
        C7933 c7933M34404;
        int[] iArr;
        if (c7795 == null || (c7933M34403 = m34403(c7795.f20809)) == null || c7933M34403.getClass() != C13160.class) {
            return null;
        }
        C13160 c13160 = (C13160) c7933M34403;
        C7933 c7933 = c13160.f36988;
        C7933[] c7933Arr = c13160.f36986;
        if (c7933Arr == null || (i = c13160.f36987) < 2 || i > c7933Arr.length || c7933 == null || c7933.getClass() != C23888.class || (c7933M34404 = m34403(c7933.f20809)) == null || c7933M34404.getClass() != C7795.class) {
            return null;
        }
        C7795 c7796 = (C7795) c7933M34404;
        C7933 c7933M34405 = m34403(c7796.f20809);
        if (c7933M34405 == null || c7933M34405.getClass() != C16649.class) {
            return null;
        }
        int i2 = c13160.f36987;
        int[][] iArr2 = new int[i2][];
        int[] iArr3 = new int[128];
        for (int i3 = 0; i3 < c13160.f36987; i3++) {
            C7933 c7934 = c13160.f36986[i3];
            if (c7934 == null || c7934.getClass() != C11168.class || c7934.f20809 != c7933 || (iArr = ((C11168) c7934).f10016) == null || iArr.length == 0) {
                return null;
            }
            for (int i4 : iArr) {
                if (i4 < 0 || i4 > 65535) {
                    return null;
                }
            }
            iArr2[i3] = (int[]) iArr.clone();
            int i5 = iArr[0];
            if (i5 < 128) {
                iArr3[i5] = iArr3[i5] + 1;
            }
        }
        int[][] iArr4 = new int[128][];
        for (int i6 = 0; i6 < 128; i6++) {
            int i7 = iArr3[i6];
            iArr4[i6] = i7 == 0 ? f42941 : new int[i7];
            iArr3[i6] = 0;
        }
        for (int i8 = 0; i8 < i2; i8++) {
            int i9 = iArr2[i8][0];
            if (i9 < 128) {
                int[] iArr5 = iArr4[i9];
                int i10 = iArr3[i9];
                iArr3[i9] = i10 + 1;
                iArr5[i10] = i8;
            }
        }
        return new C15031(new C5644(c7795.f20438, c7795.f20439), new C5644(c7796.f20438, c7796.f20439), iArr2, iArr4);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C7933 m34403(C7933 c7933) {
        C3239 c3239;
        IdentityHashMap identityHashMap = new IdentityHashMap();
        while (c7933 != null) {
            if (c7933.getClass() == C7263.class) {
                C7263 c7263 = (C7263) c7933;
                if (c7263.f18932 || (c3239 = c7263.f18933) == null || c3239.f6279 || c3239.f6277 != 0 || c7263.f18931 != c3239.f6278) {
                    return null;
                }
            } else {
                if (c7933.getClass() != C3239.class) {
                    return c7933;
                }
                C3239 c32310 = (C3239) c7933;
                if (c32310.f6279 || c32310.f6277 != 0) {
                    return null;
                }
            }
            if (identityHashMap.put(c7933, Boolean.TRUE) != null) {
                return null;
            }
            c7933 = c7933.f20809;
        }
        return null;
    }
}
