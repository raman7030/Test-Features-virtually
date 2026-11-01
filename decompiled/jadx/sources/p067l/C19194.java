package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: renamed from: l.ᩳ֡ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16VB */
/* JADX INFO: loaded from: classes4.dex */
public final class C19194 {

    /* JADX INFO: renamed from: ֫ */
    public final Object[] f57369;

    /* JADX INFO: renamed from: ۧ */
    public final int f57370;

    /* JADX INFO: renamed from: ܽ */
    public final int f57371;

    /* JADX INFO: renamed from: ᩳ */
    public final int f57372;

    public C19194(int i, int i2, Object[] objArr) {
        this.f57369 = objArr;
        this.f57371 = i;
        this.f57370 = i2;
        int iMax = 1;
        int i3 = 0;
        for (Object obj : objArr) {
            if (obj instanceof int[]) {
                iMax = Math.max(iMax, ((int[]) obj).length);
            }
        }
        long j = ((long) iMax) * ((long) i2);
        if (i2 <= 64 && j <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            i3 = (int) ((j / 64) + 1);
        }
        this.f57372 = i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19194 m43680(C14638 c14638) {
        int i;
        int i2;
        C7933 c7933;
        C7933 c7934;
        C13160 c13160;
        C7933 c7935;
        C7933[] c7933Arr;
        int i3;
        C7933 c7936;
        C7933 c7937;
        C3239 c3239;
        int[] iArr;
        if (c14638 == null) {
            return null;
        }
        int i4 = c14638.f41777;
        if (c14638.getClass() != C14638.class || c14638.f41782 != -1 || (i = c14638.f41780) < 0 || c14638.f41781 < i || c14638.f20809 == null || i4 < 0 || (i2 = c14638.f41778) < 0 || i4 == i2 || (c7933 = c14638.f41779) == null || c7933.getClass() != C7263.class) {
            return null;
        }
        C7263 c7263 = (C7263) c14638.f41779;
        boolean z = c7263.f18932;
        int i5 = c7263.f18931;
        if (!z || i5 != i4 || (c7934 = c7263.f20809) == null || c7934.getClass() != C13160.class || (c7935 = (c13160 = (C13160) c7263.f20809).f36988) == null || c7935.getClass() != C23888.class || (c7933Arr = c13160.f36986) == null || (i3 = c13160.f36987) < 2 || i3 > c7933Arr.length || (c7937 = (c7936 = c13160.f36988).f20809) == null || c7937.getClass() != C3239.class || c7263.f18933 != (c3239 = (C3239) c7936.f20809) || !c3239.f6279 || c3239.f6277 != 0 || c3239.f6278 != i5 || c3239.f20809 != c14638) {
            return null;
        }
        Object[] objArr = new Object[c13160.f36987];
        for (int i6 = 0; i6 < c13160.f36987; i6++) {
            C7933 c7938 = c13160.f36986[i6];
            if (c7938 == null || c7938.f20809 != c7936) {
                return null;
            }
            if (c7938.getClass() == C21207.class) {
                InterfaceC12628 interfaceC12628 = ((C24697) c7938).f78179;
                if (interfaceC12628 == null) {
                    return null;
                }
                objArr[i6] = interfaceC12628;
            } else {
                if (c7938.getClass() != C11168.class || (iArr = ((C11168) c7938).f10016) == null || iArr.length == 0) {
                    return null;
                }
                for (int i7 : iArr) {
                    if (i7 < 0 || i7 > 65535) {
                        return null;
                    }
                }
                objArr[i6] = iArr.clone();
            }
        }
        return new C19194(c14638.f41780, c14638.f41781, objArr);
    }
}
