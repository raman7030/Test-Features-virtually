package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.۟ᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 667N */
/* JADX INFO: loaded from: classes3.dex */
public class C7624 extends C14658 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f23571;

    public C7624() {
        this.f23571 = 0;
    }

    public C7624(int i, InterfaceC11858 interfaceC11858) {
        super(interfaceC11858);
        this.f23571 = i;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder("MismatchedTokenException(");
        sb.append(m34945());
        sb.append("!=");
        return C3200.m9831(this.f23571, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }
}
