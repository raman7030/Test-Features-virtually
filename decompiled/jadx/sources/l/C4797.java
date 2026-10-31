package l;

import com.google.android.material.motion.MotionUtils;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۙܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21QH */
/* JADX INFO: loaded from: classes3.dex */
public class C4797 extends C12558 implements RandomAccess {
    public static final long serialVersionUID = -107070782945191929L;

    @Override // l.AbstractC10442, l.InterfaceC1022, java.util.List
    public final InterfaceC1022 subList(int i, int i2) {
        m26281(i);
        m26281(i2);
        if (i <= i2) {
            return new C4797(this, i, i2);
        }
        throw new IllegalArgumentException(C19373.m44634("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }
}
