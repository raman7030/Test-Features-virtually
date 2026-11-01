package p067l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܳۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25I */
/* JADX INFO: loaded from: classes4.dex */
public final class C16100 extends AbstractC13634 implements Serializable {
    public static final long serialVersionUID = -7046029254386353130L;

    /* JADX INFO: renamed from: ۙ */
    public transient C12749 f47382;

    /* JADX INFO: renamed from: ᩶ */
    public transient C12749 f47383;

    /* JADX INFO: renamed from: ᩹ */
    public transient boolean[] f47385 = new boolean[48];

    /* JADX INFO: renamed from: ۗ */
    public transient C12749 f47381 = null;

    /* JADX INFO: renamed from: ᩸ */
    public int f47384 = 0;

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // p067l.InterfaceC4206, java.util.SortedSet
    public final InterfaceC6713 comparator() {
        return null;
    }

    @Override // p067l.InterfaceC3360
    public final boolean contains(int i) {
        C12749 c12749M29274 = this.f47381;
        while (c12749M29274 != null) {
            int iCompare = Integer.compare(i, c12749M29274.f35807);
            if (iCompare == 0) {
                break;
            }
            c12749M29274 = iCompare < 0 ? c12749M29274.m29274() : c12749M29274.m29280();
        }
        return c12749M29274 != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12749 m36636(int i) {
        C12749 c12749M29274 = this.f47381;
        C12749 c12749 = c12749M29274;
        int iCompare = 0;
        while (c12749M29274 != null) {
            iCompare = Integer.compare(i, c12749M29274.f35807);
            if (iCompare == 0) {
                break;
            }
            c12749 = c12749M29274;
            c12749M29274 = iCompare < 0 ? c12749M29274.m29274() : c12749M29274.m29280();
        }
        return iCompare == 0 ? c12749M29274 : c12749;
    }

    /* JADX WARN: Code duplicated, block: B:86:0x018d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0190  */
    /* JADX WARN: Code duplicated, block: B:90:0x0194  */
    /* JADX WARN: Code duplicated, block: B:92:0x0197  */
    @Override // p067l.AbstractC23022, p067l.InterfaceC3360
    public final boolean add(int i) {
        C12749 c12749;
        C12749 c127410;
        C12749 c127411;
        C12749 c127412;
        C12749 c127413 = this.f47381;
        if (c127413 == null) {
            this.f47384++;
            C12749 c127414 = new C12749(i);
            this.f47383 = c127414;
            this.f47382 = c127414;
            this.f47381 = c127414;
            return true;
        }
        C12749 c127415 = null;
        C12749 c127416 = null;
        int i2 = 0;
        C12749 c127417 = c127413;
        while (true) {
            int iCompare = Integer.compare(i, c127413.f35807);
            if (iCompare == 0) {
                return false;
            }
            if (((byte) c127413.f35806) != 0) {
                i2 = 0;
                c127417 = c127413;
                c127416 = c127415;
            }
            boolean[] zArr = this.f47385;
            int i3 = i2 + 1;
            boolean z = iCompare > 0;
            zArr[i2] = z;
            if (z) {
                if (c127413.m29278()) {
                    this.f47384++;
                    c12749 = new C12749(i);
                    C12749 c127418 = c127413.f35804;
                    if (c127418 == null) {
                        this.f47382 = c12749;
                    }
                    c12749.f35805 = c127413;
                    c12749.f35804 = c127418;
                    c127413.f35806 &= Integer.MAX_VALUE;
                    c127413.f35804 = c12749;
                    break;
                }
                c127410 = c127413.f35804;
                i2 = i3;
                C12749 c127419 = c127410;
                c127415 = c127413;
                c127413 = c127419;
            } else {
                if (c127413.m29284()) {
                    this.f47384++;
                    c12749 = new C12749(i);
                    C12749 c127420 = c127413.f35805;
                    if (c127420 == null) {
                        this.f47383 = c12749;
                    }
                    c12749.f35804 = c127413;
                    c12749.f35805 = c127420;
                    c127413.f35806 &= -1073741825;
                    c127413.f35805 = c12749;
                    break;
                }
                c127410 = c127413.f35805;
                i2 = i3;
                C12749 c1274110 = c127410;
                c127415 = c127413;
                c127413 = c1274110;
            }
        }
        int i4 = 0;
        C12749 c127421 = c127417;
        while (c127421 != c12749) {
            boolean z2 = this.f47385[i4];
            if (z2) {
                int i5 = c127421.f35806;
                c127421.f35806 = ((((byte) i5) + 1) & 255) | (i5 & (-256));
            } else {
                int i6 = c127421.f35806;
                c127421.f35806 = ((((byte) i6) - 1) & 255) | (i6 & (-256));
            }
            i4++;
            c127421 = z2 ? c127421.f35804 : c127421.f35805;
        }
        byte b = (byte) c127417.f35806;
        if (b == -2) {
            c127411 = c127417.f35805;
            if (((byte) c127411.f35806) == -1) {
                if (c127411.m29278()) {
                    c127411.m29282(false);
                    c127417.m29276(c127411);
                } else {
                    c127417.f35805 = c127411.f35804;
                }
                c127411.f35804 = c127417;
                c127411.m29275(0);
                c127417.m29275(0);
            } else {
                c127412 = c127411.f35804;
                c127411.f35804 = c127412.f35805;
                c127412.f35805 = c127411;
                c127417.f35805 = c127412.f35804;
                c127412.f35804 = c127417;
                byte b2 = (byte) c127412.f35806;
                if (b2 == -1) {
                    c127411.m29275(0);
                    c127417.m29275(1);
                } else if (b2 == 0) {
                    c127411.m29275(0);
                    c127417.m29275(0);
                } else {
                    c127411.m29275(-1);
                    c127417.m29275(0);
                }
                c127412.m29275(0);
                if (c127412.m29284()) {
                    c127411.m29279(c127412);
                    c127412.m29277(false);
                }
                if (c127412.m29278()) {
                    c127417.m29276(c127412);
                    c127412.m29282(false);
                }
                c127411 = c127412;
            }
            if (c127416 == null) {
                this.f47381 = c127411;
                return true;
            }
            if (c127416.f35805 == c127417) {
                c127416.f35805 = c127411;
                return true;
            }
            c127416.f35804 = c127411;
        } else if (b == 2) {
            c127411 = c127417.f35804;
            if (((byte) c127411.f35806) == 1) {
                if (c127411.m29284()) {
                    c127411.m29277(false);
                    c127417.m29279(c127411);
                } else {
                    c127417.f35804 = c127411.f35805;
                }
                c127411.f35805 = c127417;
                c127411.m29275(0);
                c127417.m29275(0);
            } else {
                c127412 = c127411.f35805;
                c127411.f35805 = c127412.f35804;
                c127412.f35804 = c127411;
                c127417.f35804 = c127412.f35805;
                c127412.f35805 = c127417;
                byte b3 = (byte) c127412.f35806;
                if (b3 == 1) {
                    c127411.m29275(0);
                    c127417.m29275(-1);
                } else if (b3 == 0) {
                    c127411.m29275(0);
                    c127417.m29275(0);
                } else {
                    c127411.m29275(1);
                    c127417.m29275(0);
                }
                c127412.m29275(0);
                if (c127412.m29284()) {
                    c127417.m29279(c127412);
                    c127412.m29277(false);
                }
                if (c127412.m29278()) {
                    c127411.m29276(c127412);
                    c127412.m29282(false);
                }
                c127411 = c127412;
            }
            if (c127416 == null) {
                this.f47381 = c127411;
                return true;
            }
            if (c127416.f35805 == c127417) {
                c127416.f35805 = c127411;
                return true;
            }
            c127416.f35804 = c127411;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:171:0x0284 A[LOOP:1: B:65:0x00f0->B:171:0x0284, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:192:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x010a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0114  */
    /* JADX WARN: Code duplicated, block: B:85:0x0121 A[LOOP:2: B:83:0x011b->B:85:0x0121, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00a0 -> B:60:0x00e6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p067l.AbstractC8269
    public final boolean remove(int r11) {
        /*
            Method dump skipped, instruction units count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C16100.remove(int):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f47384 = 0;
        this.f47381 = null;
        this.f47382 = null;
        this.f47383 = null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f47384;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f47384 == 0;
    }

    @Override // p067l.InterfaceC4206
    /* JADX INFO: renamed from: ֡ */
    public final int mo8522() {
        if (this.f47381 == null) {
            throw new NoSuchElementException();
        }
        return this.f47383.f35807;
    }

    @Override // p067l.InterfaceC4206
    /* JADX INFO: renamed from: ᩻֫ */
    public final int mo8527() {
        if (this.f47381 == null) {
            throw new NoSuchElementException();
        }
        return this.f47382.f35807;
    }

    @Override // p067l.AbstractC13634, p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C18112(this);
    }

    @Override // p067l.AbstractC13634, p067l.AbstractC23022, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC8705 iterator() {
        return new C18112(this);
    }

    @Override // p067l.InterfaceC4206
    /* JADX INFO: renamed from: ۗ */
    public final InterfaceC16750 mo8523() {
        return new C18112(this);
    }

    @Override // p067l.InterfaceC4206
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC4206 mo8526(int i) {
        return new C18783(this, 0, true, i, false);
    }

    @Override // p067l.InterfaceC4206
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC4206 mo8524(int i) {
        return new C18783(this, i, false, 0, true);
    }

    @Override // p067l.InterfaceC4206
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC4206 mo8525(int i, int i2) {
        return new C18783(this, i, false, i2, false);
    }

    public final Object clone() {
        try {
            C16100 c16100 = (C16100) super.clone();
            c16100.f47385 = new boolean[48];
            if (this.f47384 != 0) {
                C12749 c12749 = new C12749();
                C12749 c127410 = new C12749();
                C12749 c127411 = this.f47381;
                c12749.f35806 &= -1073741825;
                c12749.f35805 = c127411;
                c127410.m29276((C12749) null);
                C12749 c127412 = c127410;
                loop0: while (true) {
                    if (!c12749.m29284()) {
                        C12749 c12749Clone = c12749.f35805.clone();
                        c12749Clone.m29276(c127412.f35805);
                        c12749Clone.m29279(c127412);
                        c127412.f35806 &= -1073741825;
                        c127412.f35805 = c12749Clone;
                        c12749 = c12749.f35805;
                        c127412 = c12749Clone;
                    } else {
                        while (c12749.m29278()) {
                            c12749 = c12749.f35804;
                            if (c12749 == null) {
                                break loop0;
                            }
                            c127412 = c127412.f35804;
                        }
                        c12749 = c12749.f35804;
                        c127412 = c127412.f35804;
                    }
                    if (!c12749.m29278()) {
                        C12749 c12749Clone2 = c12749.f35804.clone();
                        c12749Clone2.m29279(c127412.f35804);
                        c12749Clone2.m29276(c127412);
                        c127412.f35806 &= Integer.MAX_VALUE;
                        c127412.f35804 = c12749Clone2;
                    }
                }
                c127412.f35804 = null;
                C12749 c127413 = c127410.f35805;
                c16100.f47381 = c127413;
                c16100.f47383 = c127413;
                while (true) {
                    C12749 c127414 = c16100.f47383.f35805;
                    if (c127414 == null) {
                        break;
                    }
                    c16100.f47383 = c127414;
                }
                c16100.f47382 = c16100.f47381;
                while (true) {
                    C12749 c127415 = c16100.f47382.f35804;
                    if (c127415 == null) {
                        break;
                    }
                    c16100.f47382 = c127415;
                }
            }
            return c16100;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i = this.f47384;
        C18112 c18112 = new C18112(this);
        objectOutputStream.defaultWriteObject();
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            objectOutputStream.writeInt(c18112.nextInt());
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12749 m36635(ObjectInputStream objectInputStream, int i, C12749 c12749, C12749 c127410) {
        if (i == 1) {
            C12749 c127411 = new C12749(objectInputStream.readInt());
            c127411.m29276(c12749);
            c127411.m29279(c127410);
            return c127411;
        }
        if (i == 2) {
            C12749 c127412 = new C12749(objectInputStream.readInt());
            C12749 c127413 = new C12749(objectInputStream.readInt());
            c127412.f35806 &= Integer.MAX_VALUE;
            c127412.f35804 = c127413;
            c127413.m29276(c127412);
            c127412.m29275(1);
            c127412.m29276(c12749);
            c127412.f35804.m29279(c127410);
            return c127412;
        }
        int i2 = i / 2;
        C12749 c127414 = new C12749();
        C12749 c12749M36635 = m36635(objectInputStream, (i - i2) - 1, c12749, c127414);
        c127414.f35806 &= -1073741825;
        c127414.f35805 = c12749M36635;
        c127414.f35807 = objectInputStream.readInt();
        C12749 c12749M36636 = m36635(objectInputStream, i2, c127414, c127410);
        c127414.f35806 &= Integer.MAX_VALUE;
        c127414.f35804 = c12749M36636;
        if (i == ((-i) & i)) {
            c127414.m29275(1);
        }
        return c127414;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f47385 = new boolean[48];
        int i = this.f47384;
        if (i != 0) {
            C12749 c12749M36635 = m36635(objectInputStream, i, null, null);
            this.f47381 = c12749M36635;
            while (c12749M36635.m29274() != null) {
                c12749M36635 = c12749M36635.m29274();
            }
            this.f47383 = c12749M36635;
            C12749 c12749M29280 = this.f47381;
            while (c12749M29280.m29280() != null) {
                c12749M29280 = c12749M29280.m29280();
            }
            this.f47382 = c12749M29280;
        }
    }
}
