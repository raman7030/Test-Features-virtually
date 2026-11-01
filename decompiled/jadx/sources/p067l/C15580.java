package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܰܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: H38Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C15580 implements InterfaceC8205 {

    /* JADX INFO: renamed from: ۙ */
    public static final C24298 f44506 = new C24298();

    /* JADX INFO: renamed from: ᩶ */
    public Object f44507;

    /* JADX INFO: renamed from: ᩸ */
    public volatile InterfaceC8205 f44508;

    /* JADX INFO: renamed from: ᩹ */
    public final Object f44509 = new Object();

    public C15580(InterfaceC8205 interfaceC8205) {
        this.f44508 = interfaceC8205;
    }

    @Override // p067l.InterfaceC8205
    public final Object get() {
        InterfaceC8205 interfaceC8205 = this.f44508;
        C24298 c24298 = f44506;
        if (interfaceC8205 != c24298) {
            synchronized (this.f44509) {
                if (this.f44508 != c24298) {
                    Object obj = this.f44508.get();
                    this.f44507 = obj;
                    this.f44508 = c24298;
                    return obj;
                }
            }
        }
        return this.f44507;
    }

    public final String toString() {
        Object obj = this.f44508;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == f44506) {
            obj = "<supplier that returned " + this.f44507 + ">";
        }
        sb.append(obj);
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }
}
