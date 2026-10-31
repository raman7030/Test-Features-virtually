package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C22291 {
    public static final C7289 a = new C7289();
    public static final C10818 b = new C10818();
    public static final C11523 c = new C11523();
    public static final C13762 d = new C13762();

    public static InterfaceC18764 spliterator(int[] iArr, int i, int i2, int i3) {
        a(((int[]) C11003.requireNonNull(iArr)).length, i, i2);
        return new C16626(iArr, i, i2, i3);
    }

    public static void a(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException(i2);
            }
            if (i3 > i) {
                throw new ArrayIndexOutOfBoundsException(i3);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i2 + ") > fence(" + i3 + MotionUtils.EASING_TYPE_FORMAT_END);
    }

    public static InterfaceC15234 spliterator(Collection collection, int i) {
        return new C14509((Collection) C11003.requireNonNull(collection), i);
    }

    public static C14509 b(Iterator it, int i) {
        return new C14509((Iterator) C11003.requireNonNull(it), i);
    }

    public static Iterator iterator(InterfaceC15234 interfaceC15234) {
        C11003.requireNonNull(interfaceC15234);
        return new C12475(interfaceC15234);
    }
}
