package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۘܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1FC */
/* JADX INFO: loaded from: classes3.dex */
public final class C6175 extends C20928 {
    @Override // p067l.C20928
    /* JADX INFO: renamed from: ֫ */
    public final String mo4467(InterfaceC3751 interfaceC3751) {
        int iMo7247 = interfaceC3751.mo7247();
        return (iMo7247 == 1 || iMo7247 == 2 || iMo7247 == 3) ? MotionUtils.EASING_TYPE_PATH : C11540.m26601(interfaceC3751);
    }
}
