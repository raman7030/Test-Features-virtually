package l;

import com.google.android.material.motion.MotionUtils;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۗܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UC70 */
/* JADX INFO: loaded from: classes3.dex */
public class C3344 extends C10400 implements RandomAccess {
    public static final long serialVersionUID = -107070782945191929L;

    @Override // java.util.List
    public final List subList(int i, int i2) {
        m17069(i);
        m17069(i2);
        if (i <= i2) {
            return new C3344(this, i, i2);
        }
        throw new IllegalArgumentException(C19373.m44634("Start index (", i, ") is greater than end index (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
    }
}
