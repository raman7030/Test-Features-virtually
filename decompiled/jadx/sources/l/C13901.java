package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܰܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: H38Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C13901 implements InterfaceC6141 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C23074 f41425 = new C23074();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f41426;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC6141 f41427;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Object f41428 = new Object();

    public C13901(InterfaceC6141 interfaceC6141) {
        this.f41427 = interfaceC6141;
    }

    @Override // l.InterfaceC6141
    public final Object get() {
        InterfaceC6141 interfaceC6141 = this.f41427;
        C23074 c23074 = f41425;
        if (interfaceC6141 != c23074) {
            synchronized (this.f41428) {
                if (this.f41427 != c23074) {
                    Object obj = this.f41427.get();
                    this.f41426 = obj;
                    this.f41427 = c23074;
                    return obj;
                }
            }
        }
        return this.f41426;
    }

    public final String toString() {
        Object obj = this.f41427;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == f41425) {
            obj = "<supplier that returned " + this.f41426 + ">";
        }
        sb.append(obj);
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }
}
