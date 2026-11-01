package p067l;

/* JADX INFO: renamed from: l.ۤ᩵ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6VP */
/* JADX INFO: loaded from: classes3.dex */
public final class C12350 {

    /* JADX INFO: renamed from: ֫ */
    public final int[] f34462 = new int[128];

    /* JADX INFO: renamed from: ۧ */
    public final int f34463;

    /* JADX INFO: renamed from: ܽ */
    public final int f34464;

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC12628[] f34465;

    /* JADX INFO: renamed from: ᩳ */
    public final int[] f34466;

    public C12350(InterfaceC12628[] interfaceC12628Arr, int[] iArr, int i, int i2) {
        this.f34465 = interfaceC12628Arr;
        this.f34466 = iArr;
        this.f34464 = i;
        this.f34463 = i2;
        for (int i3 = 0; i3 < this.f34462.length; i3++) {
            for (int i4 = 0; i4 < interfaceC12628Arr.length; i4++) {
                if (interfaceC12628Arr[i4].mo4821(i3)) {
                    this.f34462[i3] = iArr[i4];
                    break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12350 m28436(C14638 c14638) {
        int i;
        C7933 c7933;
        C7933 c7934;
        C7933 c7935;
        int i2;
        C7933 c7936;
        C3239 c3239;
        C7933 c7937;
        C7933 c7938;
        C3239 c32310;
        int i3;
        if (c14638 == null) {
            return null;
        }
        int i4 = c14638.f41778;
        int i5 = c14638.f41777;
        if (c14638.getClass() != C14638.class || (i = c14638.f41780) < 0 || c14638.f41781 < i || c14638.f41782 < -1 || i5 < 0 || i4 < 0 || i5 == i4 || (c7933 = c14638.f20809) == null || c7933.getClass() != C16649.class || (c7934 = c14638.f41779) == null || c7934.getClass() != C7263.class) {
            return null;
        }
        C7263 c7263 = (C7263) c14638.f41779;
        boolean z = c7263.f18932;
        int i6 = c7263.f18931;
        if (!z || i6 != i5 || (c7935 = c7263.f20809) == null || c7935.getClass() != C13160.class) {
            return null;
        }
        C13160 c13160 = (C13160) c7263.f20809;
        C7933[] c7933Arr = c13160.f36986;
        C7933 c7939 = c13160.f36988;
        if (c7933Arr == null || (i2 = c13160.f36987) < 1 || i2 > c7933Arr.length || c7939 == null || c7939.getClass() != C23888.class || (c7936 = c7939.f20809) == null || c7936.getClass() != C3239.class || c7263.f18933 != (c3239 = (C3239) c7939.f20809) || !c3239.f6279 || c3239.f6277 != 0 || c3239.f6278 != i6 || c3239.f20809 != c14638) {
            return null;
        }
        int i7 = c13160.f36987;
        InterfaceC12628[] interfaceC12628Arr = new InterfaceC12628[i7];
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < c13160.f36987; i8++) {
            C7933 c79310 = c13160.f36986[i8];
            if (c79310 == null) {
                return null;
            }
            if (c79310.getClass() != C7263.class && c79310.getClass() != C14500.class) {
                return null;
            }
            C7263 c7264 = (C7263) c79310;
            int i9 = c7264.f18931;
            if (!c7264.f18932 || i9 < 0 || i9 == i5 || i9 == i4 || (c7937 = c7264.f20809) == null || c7937.getClass() != C21207.class) {
                return null;
            }
            C24697 c24697 = (C24697) c7264.f20809;
            if (c24697.f78179 == null || (c7938 = c24697.f20809) == null || c7938.getClass() != C3239.class || c7264.f18933 != (c32310 = (C3239) c24697.f20809) || !c32310.f6279 || c32310.f6278 != i9 || (i3 = c32310.f6277) <= 0 || (i3 & 1) != 0 || c32310.f20809 != c7939) {
                return null;
            }
            interfaceC12628Arr[i8] = c24697.f78179;
            iArr[i8] = i3;
        }
        return new C12350(interfaceC12628Arr, iArr, c14638.f41780, c14638.f41781);
    }
}
