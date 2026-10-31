package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۨܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: H38Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C11786 implements InterfaceC6141, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient Object f35167;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient Object f35168 = new Object();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC6141 f35169;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile transient boolean f35170;

    public C11786(InterfaceC6141 interfaceC6141) {
        this.f35169 = interfaceC6141;
    }

    @Override // l.InterfaceC6141
    public final Object get() {
        if (!this.f35170) {
            synchronized (this.f35168) {
                if (!this.f35170) {
                    Object obj = this.f35169.get();
                    this.f35167 = obj;
                    this.f35170 = true;
                    return obj;
                }
            }
        }
        return this.f35167;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.f35170) {
            obj = "<supplier that returned " + this.f35167 + ">";
        } else {
            obj = this.f35169;
        }
        sb.append(obj);
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f35168 = new Object();
    }
}
