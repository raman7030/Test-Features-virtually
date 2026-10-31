package l;

import com.google.android.material.motion.MotionUtils;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.᩵ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H32 */
/* JADX INFO: loaded from: classes5.dex */
public class C19594 extends C1248 implements RandomAccess {
    public static final long serialVersionUID = -107070782945191929L;

    @Override // java.util.List
    public final List subList(int i, int i2) {
        m36401(i);
        m36401(i2);
        if (i <= i2) {
            return new C19594(this, i, i2);
        }
        throw new IllegalArgumentException(C19373.m44634("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }
}
