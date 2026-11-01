package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩸᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes.dex */
public final class C23078 implements InterfaceC7655 {

    /* JADX INFO: renamed from: ֫ */
    public List f72507;

    public C23078(List list) {
        this.f72507 = list;
    }

    @Override // p067l.InterfaceC7655
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo6894(AbstractC20674 abstractC20674) {
        Iterator it = this.f72507.iterator();
        while (it.hasNext()) {
            if (C24418.m53888((C12349) it.next(), abstractC20674)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m51477() {
        Iterator it = this.f72507.iterator();
        int i = Integer.MIN_VALUE;
        while (it.hasNext()) {
            int i2 = ((C12349) it.next()).f34461;
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    public final String toString() {
        return "not(" + this.f72507 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
