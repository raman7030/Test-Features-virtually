package l;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: E9O4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3911 implements Iterator {

    /* JADX INFO: renamed from: ۫᩸۠, reason: not valid java name and contains not printable characters */
    public static int f12484;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Iterator f12487;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC16233 f12486 = C2832.f9064;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f12485 = new ArrayList();

    /* JADX INFO: renamed from: ֨ᩳۜ, reason: not valid java name and contains not printable characters */
    public static C12918 m11917(Object obj) {
        return C12918.m31381((byte[]) obj);
    }

    /* JADX INFO: renamed from: ۖۙۗ, reason: not valid java name and contains not printable characters */
    public static void m11918(Object obj, Object obj2, int i) {
        ((C12823) obj).m31193((String) obj2, i);
    }

    /* JADX INFO: renamed from: ۖܿۤ, reason: not valid java name and contains not printable characters */
    public static String m11919(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۙ᩻۠, reason: not valid java name and contains not printable characters */
    public static void m11920(Object obj) {
        ((C13136) obj).m31857();
    }

    /* JADX INFO: renamed from: ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static SpannableStringBuilder m11921(Object obj, Object obj2) {
        return ((SpannableStringBuilder) obj).append((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m11922(Object obj) {
        return ((C16560) obj).m39040();
    }

    /* JADX INFO: renamed from: ۡ᩵ۖ, reason: not valid java name and contains not printable characters */
    public static C17793 m11923(Object obj, Object obj2) {
        return ((C17793) obj).m41710((C17793) obj2);
    }

    /* JADX INFO: renamed from: ۢۖ᩸, reason: not valid java name and contains not printable characters */
    public static int m11924() {
        return 1467598485;
    }

    /* JADX INFO: renamed from: ۬ۙۘ, reason: not valid java name and contains not printable characters */
    public static C7473 m11925(Object obj) {
        return ((ActivityC1748) obj).f6064;
    }

    /* JADX INFO: renamed from: ܰۛ᩵, reason: not valid java name and contains not printable characters */
    public static void m11926(Object obj) {
        C4925.m14315((Runnable) obj);
    }

    /* JADX INFO: renamed from: ܺܿ᩺, reason: not valid java name and contains not printable characters */
    public static void m11927(Object obj) {
        ((AbstractC7548) obj).m20273();
    }

    /* JADX INFO: renamed from: ᩳܽ۟, reason: not valid java name and contains not printable characters */
    public static int m11928(Object obj) {
        return ((StringBuilder) obj).length();
    }

    /* JADX INFO: renamed from: ᩵᩶᩵, reason: not valid java name and contains not printable characters */
    public static void m11929(Object obj, Object obj2) {
        ((C19277) obj).m44459((InterfaceC2343) obj2);
    }

    /* JADX INFO: renamed from: ᩶֫᩵, reason: not valid java name and contains not printable characters */
    public static void m11930(Object obj, Object obj2, boolean z) {
        ((C0994) obj).m3475((String) obj2, z);
    }

    /* JADX INFO: renamed from: ᩶᩸ܶ, reason: not valid java name and contains not printable characters */
    public static int m11931(Object obj) {
        return ((View) obj).getWidth();
    }

    /* JADX INFO: renamed from: ᩺۬֨, reason: not valid java name and contains not printable characters */
    public static int m11932(int i, int i2) {
        return Math.max(i, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C3911(C4243 c4243) {
        this.f12487 = c4243;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12487.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.f12487.next();
        View view = (View) next;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        C4243 c4243 = viewGroup != null ? new C4243(viewGroup) : null;
        ArrayList arrayList = this.f12485;
        if (c4243 != null && c4243.hasNext()) {
            arrayList.add(this.f12487);
            this.f12487 = c4243;
            return next;
        }
        while (!this.f12487.hasNext() && !arrayList.isEmpty()) {
            if (!arrayList.isEmpty()) {
                this.f12487 = (Iterator) arrayList.get(C1913.m6271((List) arrayList));
                if (arrayList.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                arrayList.remove(C1913.m6271((List) arrayList));
            } else {
                throw new NoSuchElementException("List is empty.");
            }
        }
        return next;
    }
}
