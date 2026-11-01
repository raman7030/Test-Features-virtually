package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۨܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: H38Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C13570 implements InterfaceC8205, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۙ */
    public transient Object f38166;

    /* JADX INFO: renamed from: ᩶ */
    public transient Object f38167 = new Object();

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC8205 f38168;

    /* JADX INFO: renamed from: ᩹ */
    public volatile transient boolean f38169;

    public C13570(InterfaceC8205 interfaceC8205) {
        this.f38168 = interfaceC8205;
    }

    @Override // p067l.InterfaceC8205
    public final Object get() {
        if (!this.f38169) {
            synchronized (this.f38167) {
                if (!this.f38169) {
                    Object obj = this.f38168.get();
                    this.f38166 = obj;
                    this.f38169 = true;
                    return obj;
                }
            }
        }
        return this.f38166;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.f38169) {
            obj = "<supplier that returned " + this.f38166 + ">";
        } else {
            obj = this.f38168;
        }
        sb.append(obj);
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f38167 = new Object();
    }
}
