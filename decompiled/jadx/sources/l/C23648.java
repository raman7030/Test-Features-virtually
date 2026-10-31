package l;

import android.graphics.Rect;
import java.util.Comparator;

/* JADX INFO: renamed from: l.᩻ۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D33U */
/* JADX INFO: loaded from: classes.dex */
public final class C23648 implements Comparator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC17298 f76601;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f76602;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Rect f76600 = new Rect();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Rect f76599 = new Rect();

    public C23648(boolean z, InterfaceC17298 interfaceC17298) {
        this.f76602 = z;
        this.f76601 = interfaceC17298;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C1776 c1776 = (C1776) this.f76601;
        c1776.getClass();
        Rect rect = this.f76600;
        ((C14369) obj).m34278(rect);
        c1776.getClass();
        Rect rect2 = this.f76599;
        ((C14369) obj2).m34278(rect2);
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
        boolean z = this.f76602;
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
