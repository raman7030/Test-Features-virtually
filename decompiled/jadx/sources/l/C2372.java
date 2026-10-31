package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۖۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes3.dex */
public final class C2372 extends AbstractC15379 implements Cloneable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC1933 f7570;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient C14156 f7571;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC19825 f7572;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient boolean f7574;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient C14156 f7575;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC0919 f7576;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient boolean[] f7578 = new boolean[48];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public transient C14156 f7573 = null;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f7577 = 0;

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // l.InterfaceC1749
    /* JADX INFO: renamed from: ۫ */
    public final void mo5873() {
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14156 m7687(int i) {
        C14156 c14156M33773 = this.f7573;
        while (c14156M33773 != null) {
            int iCompare = Integer.compare(i, c14156M33773.f17057);
            if (iCompare == 0) {
                break;
            }
            c14156M33773 = iCompare < 0 ? c14156M33773.m33773() : c14156M33773.m33768();
        }
        return c14156M33773;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C14156 m7688(int i) {
        C14156 c14156M33773 = this.f7573;
        C14156 c14156 = c14156M33773;
        int iCompare = 0;
        while (c14156M33773 != null) {
            iCompare = Integer.compare(i, c14156M33773.f17057);
            if (iCompare == 0) {
                break;
            }
            c14156 = c14156M33773;
            c14156M33773 = iCompare < 0 ? c14156M33773.m33773() : c14156M33773.m33768();
        }
        return iCompare == 0 ? c14156M33773 : c14156;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0198  */
    /* JADX WARN: Code duplicated, block: B:86:0x019b  */
    /* JADX WARN: Code duplicated, block: B:88:0x019f  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a2  */
    @Override // l.AbstractC0563, l.InterfaceC12954
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2318(int i, Object obj) {
        C14156 c14156;
        C14156 c14157;
        C14156 c14158;
        C14156 c14159;
        C14156 c141510;
        this.f7574 = false;
        C14156 c141511 = this.f7573;
        if (c141511 == null) {
            this.f7577++;
            c14156 = new C14156(i, null);
            this.f7571 = c14156;
            this.f7575 = c14156;
            this.f7573 = c14156;
            this.f7574 = true;
        } else {
            C14156 c141512 = c141511;
            C14156 c141513 = null;
            C14156 c141514 = null;
            int i2 = 0;
            while (true) {
                int iCompare = Integer.compare(i, c141511.f17057);
                if (iCompare == 0) {
                    c14156 = c141511;
                } else {
                    if (((byte) c141511.f42717) != 0) {
                        i2 = 0;
                        c141512 = c141511;
                        c141514 = c141513;
                    }
                    boolean[] zArr = this.f7578;
                    int i3 = i2 + 1;
                    boolean z = iCompare > 0;
                    zArr[i2] = z;
                    if (z) {
                        if (c141511.m33769()) {
                            this.f7577++;
                            c14157 = new C14156(i, null);
                            this.f7574 = true;
                            C14156 c141515 = c141511.f42715;
                            if (c141515 == null) {
                                this.f7575 = c14157;
                            }
                            c14157.f42716 = c141511;
                            c14157.f42715 = c141515;
                            c141511.f42717 &= Integer.MAX_VALUE;
                            c141511.f42715 = c14157;
                            break;
                        }
                        c14158 = c141511.f42715;
                        c141513 = c141511;
                        c141511 = c14158;
                        i2 = i3;
                    } else {
                        if (c141511.m33772()) {
                            this.f7577++;
                            c14157 = new C14156(i, null);
                            this.f7574 = true;
                            C14156 c141516 = c141511.f42716;
                            if (c141516 == null) {
                                this.f7571 = c14157;
                            }
                            c14157.f42715 = c141511;
                            c14157.f42716 = c141516;
                            c141511.f42717 &= -1073741825;
                            c141511.f42716 = c14157;
                            break;
                        }
                        c14158 = c141511.f42716;
                        c141513 = c141511;
                        c141511 = c14158;
                        i2 = i3;
                    }
                }
            }
            int i4 = 0;
            C14156 c141517 = c141512;
            while (c141517 != c14157) {
                boolean z2 = this.f7578[i4];
                if (z2) {
                    int i5 = c141517.f42717;
                    c141517.f42717 = ((((byte) i5) + 1) & 255) | (i5 & (-256));
                } else {
                    int i6 = c141517.f42717;
                    c141517.f42717 = ((((byte) i6) - 1) & 255) | (i6 & (-256));
                }
                i4++;
                c141517 = z2 ? c141517.f42715 : c141517.f42716;
            }
            byte b = (byte) c141512.f42717;
            if (b == -2) {
                c14159 = c141512.f42716;
                if (((byte) c14159.f42717) == -1) {
                    if (c14159.m33769()) {
                        c14159.m33774(false);
                        c141512.m33766(c14159);
                    } else {
                        c141512.f42716 = c14159.f42715;
                    }
                    c14159.f42715 = c141512;
                    c14159.m33765(0);
                    c141512.m33765(0);
                } else {
                    c141510 = c14159.f42715;
                    c14159.f42715 = c141510.f42716;
                    c141510.f42716 = c14159;
                    c141512.f42716 = c141510.f42715;
                    c141510.f42715 = c141512;
                    byte b2 = (byte) c141510.f42717;
                    if (b2 == -1) {
                        c14159.m33765(0);
                        c141512.m33765(1);
                    } else if (b2 == 0) {
                        c14159.m33765(0);
                        c141512.m33765(0);
                    } else {
                        c14159.m33765(-1);
                        c141512.m33765(0);
                    }
                    c141510.m33765(0);
                    if (c141510.m33772()) {
                        c14159.m33771(c141510);
                        c141510.m33767(false);
                    }
                    if (c141510.m33769()) {
                        c141512.m33766(c141510);
                        c141510.m33774(false);
                    }
                    c14159 = c141510;
                }
                if (c141514 == null) {
                    this.f7573 = c14159;
                } else if (c141514.f42716 == c141512) {
                    c141514.f42716 = c14159;
                } else {
                    c141514.f42715 = c14159;
                }
            } else if (b == 2) {
                c14159 = c141512.f42715;
                if (((byte) c14159.f42717) == 1) {
                    if (c14159.m33772()) {
                        c14159.m33767(false);
                        c141512.m33771(c14159);
                    } else {
                        c141512.f42715 = c14159.f42716;
                    }
                    c14159.f42716 = c141512;
                    c14159.m33765(0);
                    c141512.m33765(0);
                } else {
                    c141510 = c14159.f42716;
                    c14159.f42716 = c141510.f42715;
                    c141510.f42715 = c14159;
                    c141512.f42715 = c141510.f42716;
                    c141510.f42716 = c141512;
                    byte b3 = (byte) c141510.f42717;
                    if (b3 == 1) {
                        c14159.m33765(0);
                        c141512.m33765(-1);
                    } else if (b3 == 0) {
                        c14159.m33765(0);
                        c141512.m33765(0);
                    } else {
                        c14159.m33765(1);
                        c141512.m33765(0);
                    }
                    c141510.m33765(0);
                    if (c141510.m33772()) {
                        c141512.m33771(c141510);
                        c141510.m33767(false);
                    }
                    if (c141510.m33769()) {
                        c14159.m33766(c141510);
                        c141510.m33774(false);
                    }
                    c14159 = c141510;
                }
                if (c141514 == null) {
                    this.f7573 = c14159;
                } else if (c141514.f42716 == c141512) {
                    c141514.f42716 = c14159;
                } else {
                    c141514.f42715 = c14159;
                }
            }
            c14156 = c14157;
        }
        Object obj2 = c14156.f17058;
        c14156.f17058 = obj;
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
    @Override // l.AbstractC0563, l.InterfaceC12954
    public final java.lang.Object remove(int r12) {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2372.remove(int):java.lang.Object");
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C15776 c15776 = new C15776(this);
        int i = this.f7577;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (C11003.equals(c15776.m22540().f17058, obj)) {
                return true;
            }
            i = i2;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        this.f7577 = 0;
        this.f7573 = null;
        this.f7576 = null;
        this.f7572 = null;
        this.f7570 = null;
        this.f7575 = null;
        this.f7571 = null;
    }

    @Override // l.AbstractC1269, l.InterfaceC12954
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2422(int i) {
        return m7687(i) != null;
    }

    @Override // l.AbstractC0563, l.InterfaceC9893
    public final int size() {
        return this.f7577;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f7577 == 0;
    }

    @Override // l.InterfaceC12954
    public final Object get(int i) {
        C14156 c14156M7687 = m7687(i);
        if (c14156M7687 == null) {
            return null;
        }
        return c14156M7687.f17058;
    }

    @Override // l.InterfaceC1749
    /* JADX INFO: renamed from: ۡ */
    public final int mo5870() {
        if (this.f7573 == null) {
            throw new NoSuchElementException();
        }
        return this.f7571.f17057;
    }

    @Override // l.InterfaceC1749
    /* JADX INFO: renamed from: ۛ */
    public final int mo5868() {
        if (this.f7573 == null) {
            throw new NoSuchElementException();
        }
        return this.f7575.f17057;
    }

    @Override // l.AbstractC15379, l.InterfaceC13659
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC0919 mo5869() {
        if (this.f7576 == null) {
            this.f7576 = new C12041(this);
        }
        return this.f7576;
    }

    @Override // l.AbstractC15379, java.util.Map, l.InterfaceC1749, java.util.SortedMap
    public final InterfaceC1933 keySet() {
        if (this.f7570 == null) {
            this.f7570 = new C10839(this);
        }
        return this.f7570;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final InterfaceC19825 values() {
        if (this.f7572 == null) {
            this.f7572 = new C23329(this);
        }
        return this.f7572;
    }

    @Override // l.InterfaceC1749
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC1749 mo5874(int i) {
        return new C9428(this, 0, true, i, false);
    }

    @Override // l.InterfaceC1749
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC1749 mo5871(int i) {
        return new C9428(this, i, false, 0, true);
    }

    @Override // l.InterfaceC1749
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC1749 mo5872(int i, int i2) {
        return new C9428(this, i, false, i2, false);
    }

    public final Object clone() {
        try {
            C2372 c2372 = (C2372) super.clone();
            c2372.f7570 = null;
            c2372.f7572 = null;
            c2372.f7576 = null;
            c2372.f7578 = new boolean[48];
            if (this.f7577 != 0) {
                C14156 c14156 = new C14156();
                C14156 c14157 = new C14156();
                C14156 c14158 = this.f7573;
                c14156.f42717 &= -1073741825;
                c14156.f42716 = c14158;
                c14157.m33766((C14156) null);
                C14156 c14159 = c14157;
                loop0: while (true) {
                    if (!c14156.m33772()) {
                        C14156 c14156Clone = c14156.f42716.clone();
                        c14156Clone.m33766(c14159.f42716);
                        c14156Clone.m33771(c14159);
                        c14159.f42717 &= -1073741825;
                        c14159.f42716 = c14156Clone;
                        c14156 = c14156.f42716;
                        c14159 = c14156Clone;
                    } else {
                        while (c14156.m33769()) {
                            c14156 = c14156.f42715;
                            if (c14156 == null) {
                                break loop0;
                            }
                            c14159 = c14159.f42715;
                        }
                        c14156 = c14156.f42715;
                        c14159 = c14159.f42715;
                    }
                    if (!c14156.m33769()) {
                        C14156 c14156Clone2 = c14156.f42715.clone();
                        c14156Clone2.m33771(c14159.f42715);
                        c14156Clone2.m33766(c14159);
                        c14159.f42717 &= Integer.MAX_VALUE;
                        c14159.f42715 = c14156Clone2;
                    }
                }
                c14159.f42715 = null;
                C14156 c141510 = c14157.f42716;
                c2372.f7573 = c141510;
                c2372.f7571 = c141510;
                while (true) {
                    C14156 c141511 = c2372.f7571.f42716;
                    if (c141511 == null) {
                        break;
                    }
                    c2372.f7571 = c141511;
                }
                c2372.f7575 = c2372.f7573;
                while (true) {
                    C14156 c141512 = c2372.f7575.f42715;
                    if (c141512 == null) {
                        break;
                    }
                    c2372.f7575 = c141512;
                }
            }
            return c2372;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i = this.f7577;
        C7807 c7807 = new C7807(this);
        objectOutputStream.defaultWriteObject();
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            C14156 c14156M22540 = c7807.m22540();
            objectOutputStream.writeInt(c14156M22540.f17057);
            objectOutputStream.writeObject(c14156M22540.f17058);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14156 m7686(ObjectInputStream objectInputStream, int i, C14156 c14156, C14156 c14157) {
        if (i == 1) {
            C14156 c14158 = new C14156(objectInputStream.readInt(), objectInputStream.readObject());
            c14158.m33766(c14156);
            c14158.m33771(c14157);
            return c14158;
        }
        if (i == 2) {
            C14156 c14159 = new C14156(objectInputStream.readInt(), objectInputStream.readObject());
            C14156 c141510 = new C14156(objectInputStream.readInt(), objectInputStream.readObject());
            c14159.f42717 &= Integer.MAX_VALUE;
            c14159.f42715 = c141510;
            c141510.m33766(c14159);
            c14159.m33765(1);
            c14159.m33766(c14156);
            c14159.f42715.m33771(c14157);
            return c14159;
        }
        int i2 = i / 2;
        C14156 c141511 = new C14156();
        C14156 c14156M7686 = m7686(objectInputStream, (i - i2) - 1, c14156, c141511);
        c141511.f42717 &= -1073741825;
        c141511.f42716 = c14156M7686;
        c141511.f17057 = objectInputStream.readInt();
        c141511.f17058 = objectInputStream.readObject();
        C14156 c14156M7687 = m7686(objectInputStream, i2, c141511, c14157);
        c141511.f42717 &= Integer.MAX_VALUE;
        c141511.f42715 = c14156M7687;
        if (i == ((-i) & i)) {
            c141511.m33765(1);
        }
        return c141511;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f7578 = new boolean[48];
        int i = this.f7577;
        if (i != 0) {
            C14156 c14156M7686 = m7686(objectInputStream, i, null, null);
            this.f7573 = c14156M7686;
            while (c14156M7686.m33773() != null) {
                c14156M7686 = c14156M7686.m33773();
            }
            this.f7571 = c14156M7686;
            C14156 c14156M33768 = this.f7573;
            while (c14156M33768.m33768() != null) {
                c14156M33768 = c14156M33768.m33768();
            }
            this.f7575 = c14156M33768;
        }
    }
}
