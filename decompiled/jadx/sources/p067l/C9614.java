package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.۟ᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 667N */
/* JADX INFO: loaded from: classes3.dex */
public class C9614 extends C16299 {

    /* JADX INFO: renamed from: ۫ */
    public int f26484;

    public C9614() {
        this.f26484 = 0;
    }

    public C9614(int i, InterfaceC13638 interfaceC13638) {
        super(interfaceC13638);
        this.f26484 = i;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder("MismatchedTokenException(");
        sb.append(m37092());
        sb.append("!=");
        return C5410.m11876(this.f26484, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }
}
