package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۙܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21QH */
/* JADX INFO: loaded from: classes3.dex */
public class C6928 extends C14304 implements RandomAccess {
    public static final long serialVersionUID = -107070782945191929L;

    @Override // p067l.AbstractC12293, p067l.InterfaceC3340, java.util.List
    public final InterfaceC3340 subList(int i, int i2) {
        m28310(i);
        m28310(i2);
        if (i <= i2) {
            return new C6928(this, i, i2);
        }
        throw new IllegalArgumentException(C20780.m46928("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }
}
