package p067l;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۘۨ */
/* JADX INFO: compiled from: E9O4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1036 implements Iterator {

    /* JADX INFO: renamed from: ۫᩸۠, reason: not valid java name and contains not printable characters */
    public static int f81953;

    /* JADX INFO: renamed from: ᩹ */
    public Iterator f15295;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC17797 f15294 = C0982.f11861;

    /* JADX INFO: renamed from: ᩶ */
    public final ArrayList f15293 = new ArrayList();

    /* JADX INFO: renamed from: ֨ᩳۜ, reason: not valid java name and contains not printable characters */
    public static C14645 m56250(Object obj) {
        return C14645.m33467((byte[]) obj);
    }

    /* JADX INFO: renamed from: ۖۙۗ, reason: not valid java name and contains not printable characters */
    public static void m56251(Object obj, Object obj2, int i) {
        ((C14555) obj).m33279((String) obj2, i);
    }

    /* JADX INFO: renamed from: ۖܿۤ, reason: not valid java name and contains not printable characters */
    public static String m56252(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۙ᩻۠, reason: not valid java name and contains not printable characters */
    public static void m56253(Object obj) {
        ((C14853) obj).m33949();
    }

    /* JADX INFO: renamed from: ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static SpannableStringBuilder m56254(Object obj, Object obj2) {
        return ((SpannableStringBuilder) obj).append((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ۡ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m56255(Object obj) {
        return ((C18107) obj).m41266();
    }

    /* JADX INFO: renamed from: ۡ᩵ۖ, reason: not valid java name and contains not printable characters */
    public static C19279 m56256(Object obj, Object obj2) {
        return ((C19279) obj).m43956((C19279) obj2);
    }

    /* JADX INFO: renamed from: ۢۖ᩸, reason: not valid java name and contains not printable characters */
    public static int m56257() {
        return 1467598485;
    }

    /* JADX INFO: renamed from: ۬ۙۘ, reason: not valid java name and contains not printable characters */
    public static C9471 m56258(Object obj) {
        return ((ActivityC4030) obj).f8840;
    }

    /* JADX INFO: renamed from: ܰۛ᩵, reason: not valid java name and contains not printable characters */
    public static void m56259(Object obj) {
        C7050.m16212((Runnable) obj);
    }

    /* JADX INFO: renamed from: ܺܿ᩺, reason: not valid java name and contains not printable characters */
    public static void m56260(Object obj) {
        ((AbstractC9542) obj).m22249();
    }

    /* JADX INFO: renamed from: ᩳܽ۟, reason: not valid java name and contains not printable characters */
    public static int m56261(Object obj) {
        return ((StringBuilder) obj).length();
    }

    /* JADX INFO: renamed from: ᩵᩶᩵, reason: not valid java name and contains not printable characters */
    public static void m56262(Object obj, Object obj2) {
        ((C20689) obj).m46753((InterfaceC4595) obj2);
    }

    /* JADX INFO: renamed from: ᩶֫᩵, reason: not valid java name and contains not printable characters */
    public static void m56263(Object obj, Object obj2, boolean z) {
        ((C3313) obj).m5778((String) obj2, z);
    }

    /* JADX INFO: renamed from: ᩶᩸ܶ, reason: not valid java name and contains not printable characters */
    public static int m56264(Object obj) {
        return ((View) obj).getWidth();
    }

    /* JADX INFO: renamed from: ᩺۬֨, reason: not valid java name and contains not printable characters */
    public static int m56265(int i, int i2) {
        return Math.max(i, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C1036(C1052 c1052) {
        this.f15295 = c1052;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15295.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.f15295.next();
        View view = (View) next;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        C1052 c1052 = viewGroup != null ? new C1052(viewGroup) : null;
        ArrayList arrayList = this.f15293;
        if (c1052 != null && c1052.hasNext()) {
            arrayList.add(this.f15295);
            this.f15295 = c1052;
            return next;
        }
        while (!this.f15295.hasNext() && !arrayList.isEmpty()) {
            if (!arrayList.isEmpty()) {
                this.f15295 = (Iterator) arrayList.get(C4187.m8473((List) arrayList));
                if (arrayList.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                arrayList.remove(C4187.m8473((List) arrayList));
            } else {
                throw new NoSuchElementException("List is empty.");
            }
        }
        return next;
    }
}
