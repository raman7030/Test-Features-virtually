package p067l;

import android.graphics.Rect;
import java.util.Comparator;

/* JADX INFO: renamed from: l.᩻ۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D33U */
/* JADX INFO: loaded from: classes.dex */
public final class C24843 implements Comparator {

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC18808 f79347;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f79348;

    /* JADX INFO: renamed from: ᩶ */
    public final Rect f79346 = new Rect();

    /* JADX INFO: renamed from: ۙ */
    public final Rect f79345 = new Rect();

    public C24843(boolean z, InterfaceC18808 interfaceC18808) {
        this.f79348 = z;
        this.f79347 = interfaceC18808;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C4056 c4056 = (C4056) this.f79347;
        c4056.getClass();
        Rect rect = this.f79346;
        ((C1555) obj).m36411(rect);
        c4056.getClass();
        Rect rect2 = this.f79345;
        ((C1555) obj2).m36411(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z = this.f79348;
        if (i3 < i4) {
            return z ? 1 : -1;
        }
        if (i3 > i4) {
            return z ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return z ? 1 : -1;
        }
        if (i7 > i8) {
            return z ? -1 : 1;
        }
        return 0;
    }
}
