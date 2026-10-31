package l;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۢۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes3.dex */
public final class C9291 extends AbstractC0823 implements InterfaceC13292 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C5057 f28162;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f28163;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C2235[] f28164;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public HashMap f28165;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C2235[] f28166;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C23233 f28167;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f28168;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ReferenceQueue f28169;

    @Override // l.AbstractC0823
    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC23338 mo1132() {
        return this.f28167;
    }

    @Override // l.AbstractC0823
    public final String getName() {
        return this.f28167.getName();
    }

    @Override // l.AbstractC0823
    /* JADX INFO: renamed from: ܿ */
    public final String mo1141() {
        return this.f28168;
    }

    @Override // l.AbstractC0823
    /* JADX INFO: renamed from: ۧ */
    public final C5057 mo1134() {
        return this.f28162;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final List m23854() {
        return C20195.unmodifiableList(Arrays.asList(this.f28164));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2235 m23852(String str) {
        C23401 c23401 = this.f28162.f15895;
        String str2 = this.f28168 + '.' + str;
        c23401.getClass();
        AbstractC0823 abstractC0823M51848 = c23401.m51848(str2, EnumC14228.ALL_SYMBOLS);
        if (abstractC0823M51848 instanceof C2235) {
            return (C2235) abstractC0823M51848;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2235 m23853(int i) {
        C2235 c2235;
        C2235 c2235M23851 = m23851(i);
        if (c2235M23851 != null) {
            return c2235M23851;
        }
        synchronized (this) {
            if (this.f28169 == null) {
                this.f28169 = new ReferenceQueue();
                this.f28165 = new HashMap();
            } else {
                while (true) {
                    C20580 c20580 = (C20580) this.f28169.poll();
                    if (c20580 == null) {
                        break;
                    }
                    this.f28165.remove(Integer.valueOf(c20580.f66264));
                }
            }
            WeakReference weakReference = (WeakReference) this.f28165.get(Integer.valueOf(i));
            c2235 = weakReference == null ? null : (C2235) weakReference.get();
            if (c2235 == null) {
                c2235 = new C2235(this, Integer.valueOf(i));
                this.f28165.put(Integer.valueOf(i), new C20580(i, c2235));
            }
        }
        return c2235;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C9291(C23233 c23233, C5057 c5057, C17757 c17757) throws C6468 {
        int i = 0;
        super(i);
        this.f28165 = null;
        this.f28169 = null;
        if (c17757 == null) {
            this.f2993 = c5057;
        } else {
            this.f2993 = c17757;
        }
        this.f28167 = c23233;
        this.f28168 = C21991.m49472(c5057, c17757, c23233.getName());
        this.f28162 = c5057;
        if (c23233.m51559() == 0) {
            throw new C6468(this, "Enums must contain at least one value.", i);
        }
        this.f28164 = new C2235[c23233.m51559()];
        for (int i2 = 0; i2 < c23233.m51559(); i2++) {
            this.f28164[i2] = new C2235(c23233.m51556(i2), c5057, this, i2);
        }
        C2235[] c2235Arr = (C2235[]) this.f28164.clone();
        this.f28166 = c2235Arr;
        Arrays.sort(c2235Arr, C2235.f7298);
        for (int i3 = 1; i3 < c23233.m51559(); i3++) {
            C2235[] c2235Arr2 = this.f28166;
            C2235 c2235 = c2235Arr2[i];
            C2235 c2236 = c2235Arr2[i3];
            if (c2235.getNumber() != c2236.getNumber()) {
                i++;
                this.f28166[i] = c2236;
            }
        }
        int i4 = i + 1;
        this.f28163 = i4;
        Arrays.fill(this.f28166, i4, c23233.m51559(), (Object) null);
        c5057.f15895.m51849(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23849(C9291 c9291) {
        c9291.m3070(c9291.f28167.m51557().m5804());
        for (C2235 c2235 : c9291.f28164) {
            C2235.m7417(c2235);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2235 m23851(int i) {
        int i2 = this.f28163 - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            C2235 c2235 = this.f28166[i4];
            int number = c2235.getNumber();
            if (i < number) {
                i2 = i4 - 1;
            } else {
                if (i <= number) {
                    return c2235;
                }
                i3 = i4 + 1;
            }
        }
        return null;
    }
}
