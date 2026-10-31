package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩸᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes.dex */
public final class C21790 implements InterfaceC5562 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public List f69799;

    public C21790(List list) {
        this.f69799 = list;
    }

    @Override // l.InterfaceC5562
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4662(AbstractC19261 abstractC19261) {
        Iterator it = this.f69799.iterator();
        while (it.hasNext()) {
            if (C23200.m51492((C10501) it.next(), abstractC19261)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m49127() {
        Iterator it = this.f69799.iterator();
        int i = Integer.MIN_VALUE;
        while (it.hasNext()) {
            int i2 = ((C10501) it.next()).f31499;
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    public final String toString() {
        return "not(" + this.f69799 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
