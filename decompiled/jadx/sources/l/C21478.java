package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩸ۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8QM */
/* JADX INFO: loaded from: classes5.dex */
public final class C21478 implements InterfaceC14723 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f69105;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f69106;

    @Override // l.InterfaceC14723
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C8353 mo1025() {
        return null;
    }

    @Override // l.InterfaceC14723
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo1026(C18252 c18252) {
    }

    @Override // l.InterfaceC14723
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ byte[] mo1027() {
        return null;
    }

    public C21478(int i, String str) {
        this.f69105 = i;
        this.f69106 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.f69105);
        sb.append(",url=");
        return C9045.m23341(sb, this.f69106, MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
