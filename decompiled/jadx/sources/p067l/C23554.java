package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C23554 {

    /* JADX INFO: renamed from: a */
    public static final C9296 f75020a = new C9296();

    /* JADX INFO: renamed from: b */
    public static final C12650 f75021b = new C12650();

    /* JADX INFO: renamed from: c */
    public static final C13320 f75022c = new C13320();

    /* JADX INFO: renamed from: d */
    public static final C15448 f75023d = new C15448();

    public static InterfaceC20202 spliterator(int[] iArr, int i, int i2, int i3) {
        m52341a(((int[]) C12826.requireNonNull(iArr)).length, i, i2);
        return new C18170(iArr, i, i2, i3);
    }

    /* JADX INFO: renamed from: a */
    public static void m52341a(int i, int i2, int i3) {
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

    public static InterfaceC16847 spliterator(Collection collection, int i) {
        return new C16158((Collection) C12826.requireNonNull(collection), i);
    }

    /* JADX INFO: renamed from: b */
    public static C16158 m52342b(Iterator it, int i) {
        return new C16158((Iterator) C12826.requireNonNull(it), i);
    }

    public static Iterator iterator(InterfaceC16847 interfaceC16847) {
        C12826.requireNonNull(interfaceC16847);
        return new C14225(interfaceC16847);
    }
}
