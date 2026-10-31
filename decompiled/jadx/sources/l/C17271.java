package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܿۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25I */
/* JADX INFO: loaded from: classes5.dex */
public final class C17271 extends AbstractC11853 implements Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f52940;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f52941;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14448 f52942;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f52943;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f52944;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        C10922 c10922 = this.f52942.f44289;
        return !(m40560() != null);
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        comparator();
        return null;
    }

    public C17271(C14448 c14448, int i, boolean z, int i2, boolean z2) {
        this.f52942 = c14448;
        if (!z && !z2 && Integer.compare(i, i2) > 0) {
            throw new IllegalArgumentException(C19373.m44634("Start element (", i, ") is larger than end element (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
        }
        this.f52944 = i;
        this.f52943 = z;
        this.f52941 = i2;
        this.f52940 = z2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        C17977 c17977 = new C17977(this);
        while (c17977.hasNext()) {
            c17977.nextInt();
            c17977.remove();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40559(int i) {
        if (this.f52943 || Integer.compare(i, this.f52944) >= 0) {
            return this.f52940 || Integer.compare(i, this.f52941) < 0;
        }
        return false;
    }

    @Override // l.InterfaceC1043
    public final boolean contains(int i) {
        return m40559(i) && this.f52942.contains(i);
    }

    @Override // l.AbstractC21731, l.InterfaceC1043
    public final boolean add(int i) {
        if (m40559(i)) {
            return this.f52942.add(i);
        }
        StringBuilder sbM32308 = C13325.m32308(i, "Element (", ") out of range [");
        sbM32308.append(this.f52943 ? "-" : String.valueOf(this.f52944));
        sbM32308.append(", ");
        throw new IllegalArgumentException(C9045.m23341(sbM32308, this.f52940 ? "-" : String.valueOf(this.f52941), MotionUtils.EASING_TYPE_FORMAT_END));
    }

    @Override // l.AbstractC6208
    public final boolean remove(int i) {
        if (m40559(i)) {
            return this.f52942.remove(i);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        C17977 c17977 = new C17977(this);
        int i = 0;
        while (c17977.hasNext()) {
            i++;
            c17977.nextInt();
        }
        return i;
    }

    @Override // l.InterfaceC1933, java.util.SortedSet
    public final InterfaceC4571 comparator() {
        this.f52942.getClass();
        return null;
    }

    @Override // l.AbstractC11853, l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C17977(this);
    }

    @Override // l.AbstractC11853, l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC6667 iterator() {
        return new C17977(this);
    }

    @Override // l.InterfaceC1933
    /* JADX INFO: renamed from: ۗ */
    public final InterfaceC15132 mo6350() {
        return new C17977(this);
    }

    @Override // l.InterfaceC1933
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC1933 mo6353(int i) {
        boolean z = this.f52940;
        C14448 c14448 = this.f52942;
        if (z) {
            return new C17271(c14448, this.f52944, this.f52943, i, false);
        }
        if (Integer.compare(i, this.f52941) >= 0) {
            return this;
        }
        return new C17271(c14448, this.f52944, this.f52943, i, false);
    }

    @Override // l.InterfaceC1933
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC1933 mo6351(int i) {
        boolean z = this.f52943;
        C14448 c14448 = this.f52942;
        if (z) {
            return new C17271(c14448, i, false, this.f52941, this.f52940);
        }
        return Integer.compare(i, this.f52944) > 0 ? new C17271(c14448, i, false, this.f52941, this.f52940) : this;
    }

    @Override // l.InterfaceC1933
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC1933 mo6352(int i, int i2) {
        C14448 c14448 = this.f52942;
        boolean z = this.f52943;
        boolean z2 = this.f52940;
        if (z2 && z) {
            return new C17271(c14448, i, false, i2, false);
        }
        int i3 = this.f52941;
        int i4 = (z2 || Integer.compare(i2, i3) < 0) ? i2 : i3;
        int i5 = this.f52944;
        if (!z && Integer.compare(i, i5) <= 0) {
            i = i5;
        }
        return (z2 || z || i != i5 || i4 != i3) ? new C17271(c14448, i, false, i4, false) : this;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C10922 m40560() {
        C10922 c10922M34503;
        C14448 c14448 = this.f52942;
        if (c14448.f44287 == null) {
            return null;
        }
        if (this.f52943) {
            c10922M34503 = c14448.f44289;
        } else {
            int i = this.f52944;
            c10922M34503 = c14448.m34503(i);
            if (Integer.compare(c10922M34503.f32829, i) < 0) {
                c10922M34503 = c10922M34503.m27236();
            }
        }
        if (c10922M34503 == null) {
            return null;
        }
        if (this.f52940 || Integer.compare(c10922M34503.f32829, this.f52941) < 0) {
            return c10922M34503;
        }
        return null;
    }

    @Override // l.InterfaceC1933
    /* JADX INFO: renamed from: ᩻֫ */
    public final int mo6354() {
        C10922 c10922M34503;
        C14448 c14448 = this.f52942;
        C10922 c10922 = null;
        if (c14448.f44287 != null) {
            if (this.f52940) {
                c10922M34503 = c14448.f44288;
            } else {
                int i = this.f52941;
                c10922M34503 = c14448.m34503(i);
                if (Integer.compare(c10922M34503.f32829, i) >= 0) {
                    c10922M34503 = c10922M34503.m27238();
                }
            }
            if (c10922M34503 != null && (this.f52943 || Integer.compare(c10922M34503.f32829, this.f52944) >= 0)) {
                c10922 = c10922M34503;
            }
        }
        if (c10922 == null) {
            throw new NoSuchElementException();
        }
        return c10922.f32829;
    }

    @Override // l.InterfaceC1933
    /* JADX INFO: renamed from: ֡ */
    public final int mo6349() {
        C10922 c10922M40560 = m40560();
        if (c10922M40560 == null) {
            throw new NoSuchElementException();
        }
        return c10922M40560.f32829;
    }
}
