package p067l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۖۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes3.dex */
public final class C4623 extends AbstractC16985 implements Cloneable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ۗ */
    public transient InterfaceC4206 f10361;

    /* JADX INFO: renamed from: ۙ */
    public transient C15823 f10362;

    /* JADX INFO: renamed from: ۛ */
    public transient InterfaceC21210 f10363;

    /* JADX INFO: renamed from: ۫ */
    public transient boolean f10365;

    /* JADX INFO: renamed from: ۬ */
    public transient C15823 f10366;

    /* JADX INFO: renamed from: ᩶ */
    public transient InterfaceC3242 f10367;

    /* JADX INFO: renamed from: ᩹ */
    public transient boolean[] f10369 = new boolean[48];

    /* JADX INFO: renamed from: ۤ */
    public transient C15823 f10364 = null;

    /* JADX INFO: renamed from: ᩸ */
    public int f10368 = 0;

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // p067l.InterfaceC4031
    /* JADX INFO: renamed from: ۫ */
    public final void mo8083() {
    }

    /* JADX INFO: renamed from: ܽ */
    public final C15823 m9748(int i) {
        C15823 c15823M35906 = this.f10364;
        while (c15823M35906 != null) {
            int iCompare = Integer.compare(i, c15823M35906.f19896);
            if (iCompare == 0) {
                break;
            }
            c15823M35906 = iCompare < 0 ? c15823M35906.m35906() : c15823M35906.m35901();
        }
        return c15823M35906;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C15823 m9749(int i) {
        C15823 c15823M35906 = this.f10364;
        C15823 c15823 = c15823M35906;
        int iCompare = 0;
        while (c15823M35906 != null) {
            iCompare = Integer.compare(i, c15823M35906.f19896);
            if (iCompare == 0) {
                break;
            }
            c15823 = c15823M35906;
            c15823M35906 = iCompare < 0 ? c15823M35906.m35906() : c15823M35906.m35901();
        }
        return iCompare == 0 ? c15823M35906 : c15823;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0198  */
    /* JADX WARN: Code duplicated, block: B:86:0x019b  */
    /* JADX WARN: Code duplicated, block: B:88:0x019f  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a2  */
    @Override // p067l.AbstractC2904, p067l.InterfaceC14680
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4686(int i, Object obj) {
        C15823 c15823;
        C15823 c15824;
        C15823 c15825;
        C15823 c15826;
        C15823 c15827;
        this.f10365 = false;
        C15823 c15828 = this.f10364;
        if (c15828 == null) {
            this.f10368++;
            c15823 = new C15823(i, null);
            this.f10362 = c15823;
            this.f10366 = c15823;
            this.f10364 = c15823;
            this.f10365 = true;
        } else {
            C15823 c15829 = c15828;
            C15823 c158210 = null;
            C15823 c158211 = null;
            int i2 = 0;
            while (true) {
                int iCompare = Integer.compare(i, c15828.f19896);
                if (iCompare == 0) {
                    c15823 = c15828;
                } else {
                    if (((byte) c15828.f45806) != 0) {
                        i2 = 0;
                        c15829 = c15828;
                        c158211 = c158210;
                    }
                    boolean[] zArr = this.f10369;
                    int i3 = i2 + 1;
                    boolean z = iCompare > 0;
                    zArr[i2] = z;
                    if (z) {
                        if (c15828.m35902()) {
                            this.f10368++;
                            c15824 = new C15823(i, null);
                            this.f10365 = true;
                            C15823 c158212 = c15828.f45804;
                            if (c158212 == null) {
                                this.f10366 = c15824;
                            }
                            c15824.f45805 = c15828;
                            c15824.f45804 = c158212;
                            c15828.f45806 &= Integer.MAX_VALUE;
                            c15828.f45804 = c15824;
                            break;
                        }
                        c15825 = c15828.f45804;
                        c158210 = c15828;
                        c15828 = c15825;
                        i2 = i3;
                    } else {
                        if (c15828.m35905()) {
                            this.f10368++;
                            c15824 = new C15823(i, null);
                            this.f10365 = true;
                            C15823 c158213 = c15828.f45805;
                            if (c158213 == null) {
                                this.f10362 = c15824;
                            }
                            c15824.f45804 = c15828;
                            c15824.f45805 = c158213;
                            c15828.f45806 &= -1073741825;
                            c15828.f45805 = c15824;
                            break;
                        }
                        c15825 = c15828.f45805;
                        c158210 = c15828;
                        c15828 = c15825;
                        i2 = i3;
                    }
                }
            }
            int i4 = 0;
            C15823 c158214 = c15829;
            while (c158214 != c15824) {
                boolean z2 = this.f10369[i4];
                if (z2) {
                    int i5 = c158214.f45806;
                    c158214.f45806 = ((((byte) i5) + 1) & 255) | (i5 & (-256));
                } else {
                    int i6 = c158214.f45806;
                    c158214.f45806 = ((((byte) i6) - 1) & 255) | (i6 & (-256));
                }
                i4++;
                c158214 = z2 ? c158214.f45804 : c158214.f45805;
            }
            byte b = (byte) c15829.f45806;
            if (b == -2) {
                c15826 = c15829.f45805;
                if (((byte) c15826.f45806) == -1) {
                    if (c15826.m35902()) {
                        c15826.m35907(false);
                        c15829.m35899(c15826);
                    } else {
                        c15829.f45805 = c15826.f45804;
                    }
                    c15826.f45804 = c15829;
                    c15826.m35898(0);
                    c15829.m35898(0);
                } else {
                    c15827 = c15826.f45804;
                    c15826.f45804 = c15827.f45805;
                    c15827.f45805 = c15826;
                    c15829.f45805 = c15827.f45804;
                    c15827.f45804 = c15829;
                    byte b2 = (byte) c15827.f45806;
                    if (b2 == -1) {
                        c15826.m35898(0);
                        c15829.m35898(1);
                    } else if (b2 == 0) {
                        c15826.m35898(0);
                        c15829.m35898(0);
                    } else {
                        c15826.m35898(-1);
                        c15829.m35898(0);
                    }
                    c15827.m35898(0);
                    if (c15827.m35905()) {
                        c15826.m35904(c15827);
                        c15827.m35900(false);
                    }
                    if (c15827.m35902()) {
                        c15829.m35899(c15827);
                        c15827.m35907(false);
                    }
                    c15826 = c15827;
                }
                if (c158211 == null) {
                    this.f10364 = c15826;
                } else if (c158211.f45805 == c15829) {
                    c158211.f45805 = c15826;
                } else {
                    c158211.f45804 = c15826;
                }
            } else if (b == 2) {
                c15826 = c15829.f45804;
                if (((byte) c15826.f45806) == 1) {
                    if (c15826.m35905()) {
                        c15826.m35900(false);
                        c15829.m35904(c15826);
                    } else {
                        c15829.f45804 = c15826.f45805;
                    }
                    c15826.f45805 = c15829;
                    c15826.m35898(0);
                    c15829.m35898(0);
                } else {
                    c15827 = c15826.f45805;
                    c15826.f45805 = c15827.f45804;
                    c15827.f45804 = c15826;
                    c15829.f45804 = c15827.f45805;
                    c15827.f45805 = c15829;
                    byte b3 = (byte) c15827.f45806;
                    if (b3 == 1) {
                        c15826.m35898(0);
                        c15829.m35898(-1);
                    } else if (b3 == 0) {
                        c15826.m35898(0);
                        c15829.m35898(0);
                    } else {
                        c15826.m35898(1);
                        c15829.m35898(0);
                    }
                    c15827.m35898(0);
                    if (c15827.m35905()) {
                        c15829.m35904(c15827);
                        c15827.m35900(false);
                    }
                    if (c15827.m35902()) {
                        c15826.m35899(c15827);
                        c15827.m35907(false);
                    }
                    c15826 = c15827;
                }
                if (c158211 == null) {
                    this.f10364 = c15826;
                } else if (c158211.f45805 == c15829) {
                    c158211.f45805 = c15826;
                } else {
                    c158211.f45804 = c15826;
                }
            }
            c15823 = c15824;
        }
        Object obj2 = c15823.f19897;
        c15823.f19897 = obj;
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:171:0x0285 A[LOOP:1: B:65:0x00f1->B:171:0x0285, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:192:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0115  */
    /* JADX WARN: Code duplicated, block: B:85:0x0122 A[LOOP:2: B:83:0x011c->B:85:0x0122, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00a1 -> B:60:0x00e7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // p067l.AbstractC2904, p067l.InterfaceC14680
    public final java.lang.Object remove(int r12) {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C4623.remove(int):java.lang.Object");
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C17362 c17362 = new C17362(this);
        int i = this.f10368;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (C12826.equals(c17362.m24509().f19897, obj)) {
                return true;
            }
            i = i2;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        this.f10368 = 0;
        this.f10364 = null;
        this.f10367 = null;
        this.f10363 = null;
        this.f10361 = null;
        this.f10366 = null;
        this.f10362 = null;
    }

    @Override // p067l.AbstractC3575, p067l.InterfaceC14680
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4793(int i) {
        return m9748(i) != null;
    }

    @Override // p067l.AbstractC2904, p067l.InterfaceC11771
    public final int size() {
        return this.f10368;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f10368 == 0;
    }

    @Override // p067l.InterfaceC14680
    public final Object get(int i) {
        C15823 c15823M9748 = m9748(i);
        if (c15823M9748 == null) {
            return null;
        }
        return c15823M9748.f19897;
    }

    @Override // p067l.InterfaceC4031
    /* JADX INFO: renamed from: ۡ */
    public final int mo8080() {
        if (this.f10364 == null) {
            throw new NoSuchElementException();
        }
        return this.f10362.f19896;
    }

    @Override // p067l.InterfaceC4031
    /* JADX INFO: renamed from: ۛ */
    public final int mo8078() {
        if (this.f10364 == null) {
            throw new NoSuchElementException();
        }
        return this.f10366.f19896;
    }

    @Override // p067l.AbstractC16985, p067l.InterfaceC15350
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC3242 mo8079() {
        if (this.f10367 == null) {
            this.f10367 = new C13813(this);
        }
        return this.f10367;
    }

    @Override // p067l.AbstractC16985, java.util.Map, p067l.InterfaceC4031, java.util.SortedMap
    public final InterfaceC4206 keySet() {
        if (this.f10361 == null) {
            this.f10361 = new C12670(this);
        }
        return this.f10361;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final InterfaceC21210 values() {
        if (this.f10363 == null) {
            this.f10363 = new C24541(this);
        }
        return this.f10363;
    }

    @Override // p067l.InterfaceC4031
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC4031 mo8084(int i) {
        return new C11329(this, 0, true, i, false);
    }

    @Override // p067l.InterfaceC4031
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC4031 mo8081(int i) {
        return new C11329(this, i, false, 0, true);
    }

    @Override // p067l.InterfaceC4031
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC4031 mo8082(int i, int i2) {
        return new C11329(this, i, false, i2, false);
    }

    public final Object clone() {
        try {
            C4623 c4623 = (C4623) super.clone();
            c4623.f10361 = null;
            c4623.f10363 = null;
            c4623.f10367 = null;
            c4623.f10369 = new boolean[48];
            if (this.f10368 != 0) {
                C15823 c15823 = new C15823();
                C15823 c15824 = new C15823();
                C15823 c15825 = this.f10364;
                c15823.f45806 &= -1073741825;
                c15823.f45805 = c15825;
                c15824.m35899((C15823) null);
                C15823 c15826 = c15824;
                loop0: while (true) {
                    if (!c15823.m35905()) {
                        C15823 c15823Clone = c15823.f45805.clone();
                        c15823Clone.m35899(c15826.f45805);
                        c15823Clone.m35904(c15826);
                        c15826.f45806 &= -1073741825;
                        c15826.f45805 = c15823Clone;
                        c15823 = c15823.f45805;
                        c15826 = c15823Clone;
                    } else {
                        while (c15823.m35902()) {
                            c15823 = c15823.f45804;
                            if (c15823 == null) {
                                break loop0;
                            }
                            c15826 = c15826.f45804;
                        }
                        c15823 = c15823.f45804;
                        c15826 = c15826.f45804;
                    }
                    if (!c15823.m35902()) {
                        C15823 c15823Clone2 = c15823.f45804.clone();
                        c15823Clone2.m35904(c15826.f45804);
                        c15823Clone2.m35899(c15826);
                        c15826.f45806 &= Integer.MAX_VALUE;
                        c15826.f45804 = c15823Clone2;
                    }
                }
                c15826.f45804 = null;
                C15823 c15827 = c15824.f45805;
                c4623.f10364 = c15827;
                c4623.f10362 = c15827;
                while (true) {
                    C15823 c15828 = c4623.f10362.f45805;
                    if (c15828 == null) {
                        break;
                    }
                    c4623.f10362 = c15828;
                }
                c4623.f10366 = c4623.f10364;
                while (true) {
                    C15823 c15829 = c4623.f10366.f45804;
                    if (c15829 == null) {
                        break;
                    }
                    c4623.f10366 = c15829;
                }
            }
            return c4623;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i = this.f10368;
        C9789 c9789 = new C9789(this);
        objectOutputStream.defaultWriteObject();
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            C15823 c15823M24509 = c9789.m24509();
            objectOutputStream.writeInt(c15823M24509.f19896);
            objectOutputStream.writeObject(c15823M24509.f19897);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15823 m9747(ObjectInputStream objectInputStream, int i, C15823 c15823, C15823 c15824) {
        if (i == 1) {
            C15823 c15825 = new C15823(objectInputStream.readInt(), objectInputStream.readObject());
            c15825.m35899(c15823);
            c15825.m35904(c15824);
            return c15825;
        }
        if (i == 2) {
            C15823 c15826 = new C15823(objectInputStream.readInt(), objectInputStream.readObject());
            C15823 c15827 = new C15823(objectInputStream.readInt(), objectInputStream.readObject());
            c15826.f45806 &= Integer.MAX_VALUE;
            c15826.f45804 = c15827;
            c15827.m35899(c15826);
            c15826.m35898(1);
            c15826.m35899(c15823);
            c15826.f45804.m35904(c15824);
            return c15826;
        }
        int i2 = i / 2;
        C15823 c15828 = new C15823();
        C15823 c15823M9747 = m9747(objectInputStream, (i - i2) - 1, c15823, c15828);
        c15828.f45806 &= -1073741825;
        c15828.f45805 = c15823M9747;
        c15828.f19896 = objectInputStream.readInt();
        c15828.f19897 = objectInputStream.readObject();
        C15823 c15823M9748 = m9747(objectInputStream, i2, c15828, c15824);
        c15828.f45806 &= Integer.MAX_VALUE;
        c15828.f45804 = c15823M9748;
        if (i == ((-i) & i)) {
            c15828.m35898(1);
        }
        return c15828;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f10369 = new boolean[48];
        int i = this.f10368;
        if (i != 0) {
            C15823 c15823M9747 = m9747(objectInputStream, i, null, null);
            this.f10364 = c15823M9747;
            while (c15823M9747.m35906() != null) {
                c15823M9747 = c15823M9747.m35906();
            }
            this.f10362 = c15823M9747;
            C15823 c15823M35901 = this.f10364;
            while (c15823M35901.m35901() != null) {
                c15823M35901 = c15823M35901.m35901();
            }
            this.f10366 = c15823M35901;
        }
    }
}
