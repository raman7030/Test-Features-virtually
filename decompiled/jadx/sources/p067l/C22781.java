package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩸ۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8QM */
/* JADX INFO: loaded from: classes5.dex */
public final class C22781 implements InterfaceC16361 {

    /* JADX INFO: renamed from: ֫ */
    public final int f71803;

    /* JADX INFO: renamed from: ۧ */
    public final String f71804;

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

    public C22781(int i, String str) {
        this.f71803 = i;
        this.f71804 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.f71803);
        sb.append(",url=");
        return C10965.m25286(sb, this.f71804, MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
