package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۘܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1FC */
/* JADX INFO: loaded from: classes3.dex */
public final class C4005 extends C19528 {
    @Override // l.C19528
    /* JADX INFO: renamed from: ֫ */
    public final String mo2086(InterfaceC1454 interfaceC1454) {
        int iMo5004 = interfaceC1454.mo5004();
        return (iMo5004 == 1 || iMo5004 == 2 || iMo5004 == 3) ? MotionUtils.EASING_TYPE_PATH : C9650.m24587(interfaceC1454);
    }
}
