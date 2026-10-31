package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۙ۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes3.dex */
public final class C4497 extends AbstractC6798 implements Cloneable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC1954 f14305;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient C8731 f14306;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC19825 f14307;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient boolean f14309;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient C8731 f14310;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC0919 f14311;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient boolean[] f14313 = new boolean[48];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public transient C8731 f14308 = null;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f14312 = 0;

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // l.InterfaceC0109, java.util.SortedMap
    public final void comparator() {
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8731 m13250(char c) {
        C8731 c8731M22569 = this.f14308;
        while (c8731M22569 != null) {
            int iCompare = Character.compare(c, c8731M22569.f53201);
            if (iCompare == 0) {
                break;
            }
            c8731M22569 = iCompare < 0 ? c8731M22569.m22569() : c8731M22569.m22564();
        }
        return c8731M22569;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C8731 m13248(char c) {
        C8731 c8731M22569 = this.f14308;
        C8731 c8731 = c8731M22569;
        int iCompare = 0;
        while (c8731M22569 != null) {
            iCompare = Character.compare(c, c8731M22569.f53201);
            if (iCompare == 0) {
                break;
            }
            c8731 = c8731M22569;
            c8731M22569 = iCompare < 0 ? c8731M22569.m22569() : c8731M22569.m22564();
        }
        return iCompare == 0 ? c8731M22569 : c8731;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0198  */
    /* JADX WARN: Code duplicated, block: B:86:0x019b  */
    /* JADX WARN: Code duplicated, block: B:88:0x019f  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a2  */
    @Override // l.AbstractC18087, l.InterfaceC12963
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo13246(char c, Object obj) {
        C8731 c8731;
        C8731 c8732;
        C8731 c8733;
        C8731 c8734;
        C8731 c8735;
        this.f14309 = false;
        C8731 c8736 = this.f14308;
        if (c8736 == null) {
            this.f14312++;
            c8731 = new C8731(c, null);
            this.f14306 = c8731;
            this.f14310 = c8731;
            this.f14308 = c8731;
            this.f14309 = true;
        } else {
            C8731 c8737 = c8736;
            C8731 c8738 = null;
            C8731 c8739 = null;
            int i = 0;
            while (true) {
                int iCompare = Character.compare(c, c8736.f53201);
                if (iCompare == 0) {
                    c8731 = c8736;
                } else {
                    if (((byte) c8736.f26578) != 0) {
                        i = 0;
                        c8737 = c8736;
                        c8739 = c8738;
                    }
                    boolean[] zArr = this.f14313;
                    int i2 = i + 1;
                    boolean z = iCompare > 0;
                    zArr[i] = z;
                    if (z) {
                        if (c8736.m22565()) {
                            this.f14312++;
                            c8732 = new C8731(c, null);
                            this.f14309 = true;
                            C8731 c87310 = c8736.f26576;
                            if (c87310 == null) {
                                this.f14310 = c8732;
                            }
                            c8732.f26577 = c8736;
                            c8732.f26576 = c87310;
                            c8736.f26578 &= Integer.MAX_VALUE;
                            c8736.f26576 = c8732;
                            break;
                        }
                        c8733 = c8736.f26576;
                        c8738 = c8736;
                        c8736 = c8733;
                        i = i2;
                    } else {
                        if (c8736.m22568()) {
                            this.f14312++;
                            c8732 = new C8731(c, null);
                            this.f14309 = true;
                            C8731 c87311 = c8736.f26577;
                            if (c87311 == null) {
                                this.f14306 = c8732;
                            }
                            c8732.f26576 = c8736;
                            c8732.f26577 = c87311;
                            c8736.f26578 &= -1073741825;
                            c8736.f26577 = c8732;
                            break;
                        }
                        c8733 = c8736.f26577;
                        c8738 = c8736;
                        c8736 = c8733;
                        i = i2;
                    }
                }
            }
            int i3 = 0;
            C8731 c87312 = c8737;
            while (c87312 != c8732) {
                boolean z2 = this.f14313[i3];
                if (z2) {
                    int i4 = c87312.f26578;
                    c87312.f26578 = ((((byte) i4) + 1) & 255) | (i4 & (-256));
                } else {
                    int i5 = c87312.f26578;
                    c87312.f26578 = ((((byte) i5) - 1) & 255) | (i5 & (-256));
                }
                i3++;
                c87312 = z2 ? c87312.f26576 : c87312.f26577;
            }
            byte b = (byte) c8737.f26578;
            if (b == -2) {
                c8734 = c8737.f26577;
                if (((byte) c8734.f26578) == -1) {
                    if (c8734.m22565()) {
                        c8734.m22570(false);
                        c8737.m22562(c8734);
                    } else {
                        c8737.f26577 = c8734.f26576;
                    }
                    c8734.f26576 = c8737;
                    c8734.m22561(0);
                    c8737.m22561(0);
                } else {
                    c8735 = c8734.f26576;
                    c8734.f26576 = c8735.f26577;
                    c8735.f26577 = c8734;
                    c8737.f26577 = c8735.f26576;
                    c8735.f26576 = c8737;
                    byte b2 = (byte) c8735.f26578;
                    if (b2 == -1) {
                        c8734.m22561(0);
                        c8737.m22561(1);
                    } else if (b2 == 0) {
                        c8734.m22561(0);
                        c8737.m22561(0);
                    } else {
                        c8734.m22561(-1);
                        c8737.m22561(0);
                    }
                    c8735.m22561(0);
                    if (c8735.m22568()) {
                        c8734.m22567(c8735);
                        c8735.m22563(false);
                    }
                    if (c8735.m22565()) {
                        c8737.m22562(c8735);
                        c8735.m22570(false);
                    }
                    c8734 = c8735;
                }
                if (c8739 == null) {
                    this.f14308 = c8734;
                } else if (c8739.f26577 == c8737) {
                    c8739.f26577 = c8734;
                } else {
                    c8739.f26576 = c8734;
                }
            } else if (b == 2) {
                c8734 = c8737.f26576;
                if (((byte) c8734.f26578) == 1) {
                    if (c8734.m22568()) {
                        c8734.m22563(false);
                        c8737.m22567(c8734);
                    } else {
                        c8737.f26576 = c8734.f26577;
                    }
                    c8734.f26577 = c8737;
                    c8734.m22561(0);
                    c8737.m22561(0);
                } else {
                    c8735 = c8734.f26577;
                    c8734.f26577 = c8735.f26576;
                    c8735.f26576 = c8734;
                    c8737.f26576 = c8735.f26577;
                    c8735.f26577 = c8737;
                    byte b3 = (byte) c8735.f26578;
                    if (b3 == 1) {
                        c8734.m22561(0);
                        c8737.m22561(-1);
                    } else if (b3 == 0) {
                        c8734.m22561(0);
                        c8737.m22561(0);
                    } else {
                        c8734.m22561(1);
                        c8737.m22561(0);
                    }
                    c8735.m22561(0);
                    if (c8735.m22568()) {
                        c8737.m22567(c8735);
                        c8735.m22563(false);
                    }
                    if (c8735.m22565()) {
                        c8734.m22562(c8735);
                        c8735.m22570(false);
                    }
                    c8734 = c8735;
                }
                if (c8739 == null) {
                    this.f14308 = c8734;
                } else if (c8739.f26577 == c8737) {
                    c8739.f26577 = c8734;
                } else {
                    c8739.f26576 = c8734;
                }
            }
            c8731 = c8732;
        }
        Object obj2 = c8731.f53202;
        c8731.f53202 = obj;
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
    @Override // l.AbstractC18087, l.InterfaceC12963
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final java.lang.Object mo13251(char r12) {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4497.mo13251(char):java.lang.Object");
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C20020 c20020 = new C20020(this);
        int i = this.f14312;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (C11003.equals(c20020.m49736().f53202, obj)) {
                return true;
            }
            i = i2;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        this.f14312 = 0;
        this.f14308 = null;
        this.f14311 = null;
        this.f14307 = null;
        this.f14305 = null;
        this.f14310 = null;
        this.f14306 = null;
    }

    @Override // l.AbstractC14558, l.InterfaceC12963
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo13247(char c) {
        return m13250(c) != null;
    }

    @Override // l.AbstractC18087, l.InterfaceC9893
    public final int size() {
        return this.f14312;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f14312 == 0;
    }

    @Override // l.InterfaceC12963
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object mo13249(char c) {
        C8731 c8731M13250 = m13250(c);
        if (c8731M13250 == null) {
            return null;
        }
        return c8731M13250.f53202;
    }

    @Override // l.InterfaceC0109
    /* JADX INFO: renamed from: ۬֫ */
    public final char mo1095() {
        if (this.f14308 == null) {
            throw new NoSuchElementException();
        }
        return this.f14306.f53201;
    }

    @Override // l.InterfaceC0109
    /* JADX INFO: renamed from: ܳ֫ */
    public final char mo1098() {
        if (this.f14308 == null) {
            throw new NoSuchElementException();
        }
        return this.f14310.f53201;
    }

    @Override // l.AbstractC6798, l.InterfaceC13668
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC0919 mo1097() {
        if (this.f14311 == null) {
            this.f14311 = new C20726(this);
        }
        return this.f14311;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final InterfaceC1954 keySet() {
        if (this.f14305 == null) {
            this.f14305 = new C3792(this);
        }
        return this.f14305;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final InterfaceC19825 values() {
        if (this.f14307 == null) {
            this.f14307 = new C9437(this);
        }
        return this.f14307;
    }

    @Override // l.InterfaceC0109
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC0109 mo1099(char c) {
        return new C21431(this, (char) 0, true, c, false);
    }

    @Override // l.InterfaceC0109
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC0109 mo1096(char c) {
        return new C21431(this, c, false, (char) 0, true);
    }

    @Override // l.InterfaceC0109
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC0109 mo1094(char c, char c2) {
        return new C21431(this, c, false, c2, false);
    }

    public final Object clone() {
        try {
            C4497 c4497 = (C4497) super.clone();
            c4497.f14305 = null;
            c4497.f14307 = null;
            c4497.f14311 = null;
            c4497.f14313 = new boolean[48];
            if (this.f14312 != 0) {
                C8731 c8731 = new C8731();
                C8731 c8732 = new C8731();
                C8731 c8733 = this.f14308;
                c8731.f26578 &= -1073741825;
                c8731.f26577 = c8733;
                c8732.m22562((C8731) null);
                C8731 c8734 = c8732;
                loop0: while (true) {
                    if (!c8731.m22568()) {
                        C8731 c8731Clone = c8731.f26577.clone();
                        c8731Clone.m22562(c8734.f26577);
                        c8731Clone.m22567(c8734);
                        c8734.f26578 &= -1073741825;
                        c8734.f26577 = c8731Clone;
                        c8731 = c8731.f26577;
                        c8734 = c8731Clone;
                    } else {
                        while (c8731.m22565()) {
                            c8731 = c8731.f26576;
                            if (c8731 == null) {
                                break loop0;
                            }
                            c8734 = c8734.f26576;
                        }
                        c8731 = c8731.f26576;
                        c8734 = c8734.f26576;
                    }
                    if (!c8731.m22565()) {
                        C8731 c8731Clone2 = c8731.f26576.clone();
                        c8731Clone2.m22567(c8734.f26576);
                        c8731Clone2.m22562(c8734);
                        c8734.f26578 &= Integer.MAX_VALUE;
                        c8734.f26576 = c8731Clone2;
                    }
                }
                c8734.f26576 = null;
                C8731 c8735 = c8732.f26577;
                c4497.f14308 = c8735;
                c4497.f14306 = c8735;
                while (true) {
                    C8731 c8736 = c4497.f14306.f26577;
                    if (c8736 == null) {
                        break;
                    }
                    c4497.f14306 = c8736;
                }
                c4497.f14310 = c4497.f14308;
                while (true) {
                    C8731 c8737 = c4497.f14310.f26576;
                    if (c8737 == null) {
                        break;
                    }
                    c4497.f14310 = c8737;
                }
            }
            return c4497;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i = this.f14312;
        C15785 c15785 = new C15785(this);
        objectOutputStream.defaultWriteObject();
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            C8731 c8731M49736 = c15785.m49736();
            objectOutputStream.writeChar(c8731M49736.f53201);
            objectOutputStream.writeObject(c8731M49736.f53202);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8731 m13245(ObjectInputStream objectInputStream, int i, C8731 c8731, C8731 c8732) {
        if (i == 1) {
            C8731 c8733 = new C8731(objectInputStream.readChar(), objectInputStream.readObject());
            c8733.m22562(c8731);
            c8733.m22567(c8732);
            return c8733;
        }
        if (i == 2) {
            C8731 c8734 = new C8731(objectInputStream.readChar(), objectInputStream.readObject());
            C8731 c8735 = new C8731(objectInputStream.readChar(), objectInputStream.readObject());
            c8734.f26578 &= Integer.MAX_VALUE;
            c8734.f26576 = c8735;
            c8735.m22562(c8734);
            c8734.m22561(1);
            c8734.m22562(c8731);
            c8734.f26576.m22567(c8732);
            return c8734;
        }
        int i2 = i / 2;
        C8731 c8736 = new C8731();
        C8731 c8731M13245 = m13245(objectInputStream, (i - i2) - 1, c8731, c8736);
        c8736.f26578 &= -1073741825;
        c8736.f26577 = c8731M13245;
        c8736.f53201 = objectInputStream.readChar();
        c8736.f53202 = objectInputStream.readObject();
        C8731 c8731M13246 = m13245(objectInputStream, i2, c8736, c8732);
        c8736.f26578 &= Integer.MAX_VALUE;
        c8736.f26576 = c8731M13246;
        if (i == ((-i) & i)) {
            c8736.m22561(1);
        }
        return c8736;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f14313 = new boolean[48];
        int i = this.f14312;
        if (i != 0) {
            C8731 c8731M13245 = m13245(objectInputStream, i, null, null);
            this.f14308 = c8731M13245;
            while (c8731M13245.m22569() != null) {
                c8731M13245 = c8731M13245.m22569();
            }
            this.f14306 = c8731M13245;
            C8731 c8731M22564 = this.f14308;
            while (c8731M22564.m22564() != null) {
                c8731M22564 = c8731M22564.m22564();
            }
            this.f14310 = c8731M22564;
        }
    }
}
