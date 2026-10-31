package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩸۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes5.dex */
public final class C21431 extends AbstractC6798 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4497 f68999;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC1954 f69000;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC19825 f69001;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f69002;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public char f69003;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public char f69004;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f69005;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient InterfaceC0919 f69006;

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // l.InterfaceC0109, java.util.SortedMap
    public final void comparator() {
    }

    public C21431(C4497 c4497, char c, boolean z, char c2, boolean z2) {
        this.f68999 = c4497;
        if (!z && !z2 && Character.compare(c, c2) > 0) {
            throw new IllegalArgumentException("Start key (" + c + ") is larger than end key (" + c2 + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f69004 = c;
        this.f69005 = z;
        this.f69003 = c2;
        this.f69002 = z2;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        C8731 c8731 = this.f68999.f14306;
        return !(firstEntry() != null);
    }

    @Override // java.util.Map
    public final void clear() {
        C0969 c0969 = new C0969(this);
        while (c0969.hasNext()) {
            c0969.m49736();
            c0969.remove();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m48545(char c) {
        if (this.f69005 || Character.compare(c, this.f69004) >= 0) {
            return this.f69002 || Character.compare(c, this.f69003) < 0;
        }
        return false;
    }

    @Override // l.AbstractC6798, l.InterfaceC13668
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC0919 mo1097() {
        if (this.f69006 == null) {
            this.f69006 = new C18609(this);
        }
        return this.f69006;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final InterfaceC1954 keySet() {
        if (this.f69000 == null) {
            this.f69000 = new C0263(this);
        }
        return this.f69000;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final Collection values() {
        if (this.f69001 == null) {
            this.f69001 = new C19315(this);
        }
        return this.f69001;
    }

    @Override // l.AbstractC14558, l.InterfaceC12963
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo13247(char c) {
        return m48545(c) && this.f68999.mo13247(c);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C0969 c0969 = new C0969(this);
        while (c0969.hasNext()) {
            if (C11003.equals(c0969.m49736().f53202, obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC12963
    /* JADX INFO: renamed from: ۧ */
    public final Object mo13249(char c) {
        C8731 c8731M13250;
        if (!m48545(c) || (c8731M13250 = this.f68999.m13250(c)) == null) {
            return null;
        }
        return c8731M13250.f53202;
    }

    @Override // l.AbstractC18087, l.InterfaceC12963
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13246(char c, Object obj) {
        C4497 c4497 = this.f68999;
        c4497.f14309 = false;
        if (m48545(c)) {
            Object objMo13246 = c4497.mo13246(c, obj);
            if (c4497.f14309) {
                return null;
            }
            return objMo13246;
        }
        StringBuilder sb = new StringBuilder("Key (");
        sb.append(c);
        sb.append(") out of range [");
        sb.append(this.f69005 ? "-" : String.valueOf(this.f69004));
        sb.append(", ");
        throw new IllegalArgumentException(C9045.m23341(sb, this.f69002 ? "-" : String.valueOf(this.f69003), MotionUtils.EASING_TYPE_FORMAT_END));
    }

    @Override // l.AbstractC18087, l.InterfaceC12963
    /* JADX INFO: renamed from: ܿ */
    public final Object mo13251(char c) {
        C4497 c4497 = this.f68999;
        c4497.f14309 = false;
        if (!m48545(c)) {
            return null;
        }
        Object objMo13251 = c4497.mo13251(c);
        if (c4497.f14309) {
            return objMo13251;
        }
        return null;
    }

    @Override // l.AbstractC18087, l.InterfaceC9893
    public final int size() {
        C0969 c0969 = new C0969(this);
        int i = 0;
        while (c0969.hasNext()) {
            i++;
            c0969.m49736();
        }
        return i;
    }

    @Override // l.InterfaceC0109
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC0109 mo1099(char c) {
        boolean z = this.f69002;
        C4497 c4497 = this.f68999;
        if (z) {
            return new C21431(c4497, this.f69004, this.f69005, c, false);
        }
        if (Character.compare(c, this.f69003) >= 0) {
            return this;
        }
        return new C21431(c4497, this.f69004, this.f69005, c, false);
    }

    @Override // l.InterfaceC0109
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC0109 mo1096(char c) {
        boolean z = this.f69005;
        C4497 c4497 = this.f68999;
        if (z) {
            return new C21431(c4497, c, false, this.f69003, this.f69002);
        }
        return Character.compare(c, this.f69004) > 0 ? new C21431(c4497, c, false, this.f69003, this.f69002) : this;
    }

    @Override // l.InterfaceC0109
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC0109 mo1094(char c, char c2) {
        C4497 c4497 = this.f68999;
        boolean z = this.f69005;
        boolean z2 = this.f69002;
        if (z2 && z) {
            return new C21431(c4497, c, false, c2, false);
        }
        char c3 = this.f69003;
        char c4 = (z2 || Character.compare(c2, c3) < 0) ? c2 : c3;
        char c5 = this.f69004;
        if (!z && Character.compare(c, c5) <= 0) {
            c = c5;
        }
        return (z2 || z || c != c5 || c4 != c3) ? new C21431(c4497, c, false, c4, false) : this;
    }

    public final C8731 firstEntry() {
        C8731 c8731M13248;
        C4497 c4497 = this.f68999;
        if (c4497.f14308 == null) {
            return null;
        }
        if (this.f69005) {
            c8731M13248 = c4497.f14306;
        } else {
            char c = this.f69004;
            c8731M13248 = c4497.m13248(c);
            if (Character.compare(c8731M13248.f53201, c) < 0) {
                c8731M13248 = c8731M13248.m22571();
            }
        }
        if (c8731M13248 == null) {
            return null;
        }
        if (this.f69002 || Character.compare(c8731M13248.f53201, this.f69003) < 0) {
            return c8731M13248;
        }
        return null;
    }

    public final C8731 lastEntry() {
        C8731 c8731M13248;
        C4497 c4497 = this.f68999;
        if (c4497.f14308 == null) {
            return null;
        }
        if (this.f69002) {
            c8731M13248 = c4497.f14310;
        } else {
            char c = this.f69003;
            c8731M13248 = c4497.m13248(c);
            if (Character.compare(c8731M13248.f53201, c) >= 0) {
                c8731M13248 = c8731M13248.m22566();
            }
        }
        if (c8731M13248 == null) {
            return null;
        }
        if (this.f69005 || Character.compare(c8731M13248.f53201, this.f69004) >= 0) {
            return c8731M13248;
        }
        return null;
    }

    @Override // l.InterfaceC0109
    /* JADX INFO: renamed from: ۬֫ */
    public final char mo1095() {
        C8731 c8731FirstEntry = firstEntry();
        if (c8731FirstEntry == null) {
            throw new NoSuchElementException();
        }
        return c8731FirstEntry.f53201;
    }

    @Override // l.InterfaceC0109
    /* JADX INFO: renamed from: ܳ֫ */
    public final char mo1098() {
        C8731 c8731LastEntry = lastEntry();
        if (c8731LastEntry == null) {
            throw new NoSuchElementException();
        }
        return c8731LastEntry.f53201;
    }
}
