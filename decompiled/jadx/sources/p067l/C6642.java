package p067l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۙ۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes3.dex */
public final class C6642 extends AbstractC8829 implements Cloneable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ۗ */
    public transient InterfaceC4226 f17132;

    /* JADX INFO: renamed from: ۙ */
    public transient C10666 f17133;

    /* JADX INFO: renamed from: ۛ */
    public transient InterfaceC21210 f17134;

    /* JADX INFO: renamed from: ۫ */
    public transient boolean f17136;

    /* JADX INFO: renamed from: ۬ */
    public transient C10666 f17137;

    /* JADX INFO: renamed from: ᩶ */
    public transient InterfaceC3242 f17138;

    /* JADX INFO: renamed from: ᩹ */
    public transient boolean[] f17140 = new boolean[48];

    /* JADX INFO: renamed from: ۤ */
    public transient C10666 f17135 = null;

    /* JADX INFO: renamed from: ᩸ */
    public int f17139 = 0;

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // p067l.InterfaceC2472, java.util.SortedMap
    public final void comparator() {
    }

    /* JADX INFO: renamed from: ܽ */
    public final C10666 m15133(char c) {
        C10666 c10666M24539 = this.f17135;
        while (c10666M24539 != null) {
            int iCompare = Character.compare(c, c10666M24539.f56387);
            if (iCompare == 0) {
                break;
            }
            c10666M24539 = iCompare < 0 ? c10666M24539.m24539() : c10666M24539.m24534();
        }
        return c10666M24539;
    }

    /* JADX INFO: renamed from: ۜ */
    public final C10666 m15131(char c) {
        C10666 c10666M24539 = this.f17135;
        C10666 c10666 = c10666M24539;
        int iCompare = 0;
        while (c10666M24539 != null) {
            iCompare = Character.compare(c, c10666M24539.f56387);
            if (iCompare == 0) {
                break;
            }
            c10666 = c10666M24539;
            c10666M24539 = iCompare < 0 ? c10666M24539.m24539() : c10666M24539.m24534();
        }
        return iCompare == 0 ? c10666M24539 : c10666;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0198  */
    /* JADX WARN: Code duplicated, block: B:86:0x019b  */
    /* JADX WARN: Code duplicated, block: B:88:0x019f  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a2  */
    @Override // p067l.AbstractC19558, p067l.InterfaceC14688
    /* JADX INFO: renamed from: ֫ */
    public final Object mo15129(char c, Object obj) {
        C10666 c10666;
        C10666 c10667;
        C10666 c10668;
        C10666 c10669;
        C10666 c106610;
        this.f17136 = false;
        C10666 c106611 = this.f17135;
        if (c106611 == null) {
            this.f17139++;
            c10666 = new C10666(c, null);
            this.f17133 = c10666;
            this.f17137 = c10666;
            this.f17135 = c10666;
            this.f17136 = true;
        } else {
            C10666 c106612 = c106611;
            C10666 c106613 = null;
            C10666 c106614 = null;
            int i = 0;
            while (true) {
                int iCompare = Character.compare(c, c106611.f56387);
                if (iCompare == 0) {
                    c10666 = c106611;
                } else {
                    if (((byte) c106611.f29503) != 0) {
                        i = 0;
                        c106612 = c106611;
                        c106614 = c106613;
                    }
                    boolean[] zArr = this.f17140;
                    int i2 = i + 1;
                    boolean z = iCompare > 0;
                    zArr[i] = z;
                    if (z) {
                        if (c106611.m24535()) {
                            this.f17139++;
                            c10667 = new C10666(c, null);
                            this.f17136 = true;
                            C10666 c106615 = c106611.f29501;
                            if (c106615 == null) {
                                this.f17137 = c10667;
                            }
                            c10667.f29502 = c106611;
                            c10667.f29501 = c106615;
                            c106611.f29503 &= Integer.MAX_VALUE;
                            c106611.f29501 = c10667;
                            break;
                        }
                        c10668 = c106611.f29501;
                        c106613 = c106611;
                        c106611 = c10668;
                        i = i2;
                    } else {
                        if (c106611.m24538()) {
                            this.f17139++;
                            c10667 = new C10666(c, null);
                            this.f17136 = true;
                            C10666 c106616 = c106611.f29502;
                            if (c106616 == null) {
                                this.f17133 = c10667;
                            }
                            c10667.f29501 = c106611;
                            c10667.f29502 = c106616;
                            c106611.f29503 &= -1073741825;
                            c106611.f29502 = c10667;
                            break;
                        }
                        c10668 = c106611.f29502;
                        c106613 = c106611;
                        c106611 = c10668;
                        i = i2;
                    }
                }
            }
            int i3 = 0;
            C10666 c106617 = c106612;
            while (c106617 != c10667) {
                boolean z2 = this.f17140[i3];
                if (z2) {
                    int i4 = c106617.f29503;
                    c106617.f29503 = ((((byte) i4) + 1) & 255) | (i4 & (-256));
                } else {
                    int i5 = c106617.f29503;
                    c106617.f29503 = ((((byte) i5) - 1) & 255) | (i5 & (-256));
                }
                i3++;
                c106617 = z2 ? c106617.f29501 : c106617.f29502;
            }
            byte b = (byte) c106612.f29503;
            if (b == -2) {
                c10669 = c106612.f29502;
                if (((byte) c10669.f29503) == -1) {
                    if (c10669.m24535()) {
                        c10669.m24540(false);
                        c106612.m24532(c10669);
                    } else {
                        c106612.f29502 = c10669.f29501;
                    }
                    c10669.f29501 = c106612;
                    c10669.m24531(0);
                    c106612.m24531(0);
                } else {
                    c106610 = c10669.f29501;
                    c10669.f29501 = c106610.f29502;
                    c106610.f29502 = c10669;
                    c106612.f29502 = c106610.f29501;
                    c106610.f29501 = c106612;
                    byte b2 = (byte) c106610.f29503;
                    if (b2 == -1) {
                        c10669.m24531(0);
                        c106612.m24531(1);
                    } else if (b2 == 0) {
                        c10669.m24531(0);
                        c106612.m24531(0);
                    } else {
                        c10669.m24531(-1);
                        c106612.m24531(0);
                    }
                    c106610.m24531(0);
                    if (c106610.m24538()) {
                        c10669.m24537(c106610);
                        c106610.m24533(false);
                    }
                    if (c106610.m24535()) {
                        c106612.m24532(c106610);
                        c106610.m24540(false);
                    }
                    c10669 = c106610;
                }
                if (c106614 == null) {
                    this.f17135 = c10669;
                } else if (c106614.f29502 == c106612) {
                    c106614.f29502 = c10669;
                } else {
                    c106614.f29501 = c10669;
                }
            } else if (b == 2) {
                c10669 = c106612.f29501;
                if (((byte) c10669.f29503) == 1) {
                    if (c10669.m24538()) {
                        c10669.m24533(false);
                        c106612.m24537(c10669);
                    } else {
                        c106612.f29501 = c10669.f29502;
                    }
                    c10669.f29502 = c106612;
                    c10669.m24531(0);
                    c106612.m24531(0);
                } else {
                    c106610 = c10669.f29502;
                    c10669.f29502 = c106610.f29501;
                    c106610.f29501 = c10669;
                    c106612.f29501 = c106610.f29502;
                    c106610.f29502 = c106612;
                    byte b3 = (byte) c106610.f29503;
                    if (b3 == 1) {
                        c10669.m24531(0);
                        c106612.m24531(-1);
                    } else if (b3 == 0) {
                        c10669.m24531(0);
                        c106612.m24531(0);
                    } else {
                        c10669.m24531(1);
                        c106612.m24531(0);
                    }
                    c106610.m24531(0);
                    if (c106610.m24538()) {
                        c106612.m24537(c106610);
                        c106610.m24533(false);
                    }
                    if (c106610.m24535()) {
                        c10669.m24532(c106610);
                        c106610.m24540(false);
                    }
                    c10669 = c106610;
                }
                if (c106614 == null) {
                    this.f17135 = c10669;
                } else if (c106614.f29502 == c106612) {
                    c106614.f29502 = c10669;
                } else {
                    c106614.f29501 = c10669;
                }
            }
            c10666 = c10667;
        }
        Object obj2 = c10666.f56388;
        c10666.f56388 = obj;
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
    @Override // p067l.AbstractC19558, p067l.InterfaceC14688
    /* JADX INFO: renamed from: ܿ */
    public final java.lang.Object mo15134(char r12) {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C6642.mo15134(char):java.lang.Object");
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C21395 c21395 = new C21395(this);
        int i = this.f17139;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (C12826.equals(c21395.m52074().f56388, obj)) {
                return true;
            }
            i = i2;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        this.f17139 = 0;
        this.f17135 = null;
        this.f17138 = null;
        this.f17134 = null;
        this.f17132 = null;
        this.f17137 = null;
        this.f17133 = null;
    }

    @Override // p067l.AbstractC16204, p067l.InterfaceC14688
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo15130(char c) {
        return m15133(c) != null;
    }

    @Override // p067l.AbstractC19558, p067l.InterfaceC11771
    public final int size() {
        return this.f17139;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f17139 == 0;
    }

    @Override // p067l.InterfaceC14688
    /* JADX INFO: renamed from: ۧ */
    public final Object mo15132(char c) {
        C10666 c10666M15133 = m15133(c);
        if (c10666M15133 == null) {
            return null;
        }
        return c10666M15133.f56388;
    }

    @Override // p067l.InterfaceC2472
    /* JADX INFO: renamed from: ۬֫ */
    public final char mo3491() {
        if (this.f17135 == null) {
            throw new NoSuchElementException();
        }
        return this.f17133.f56387;
    }

    @Override // p067l.InterfaceC2472
    /* JADX INFO: renamed from: ܳ֫ */
    public final char mo3494() {
        if (this.f17135 == null) {
            throw new NoSuchElementException();
        }
        return this.f17137.f56387;
    }

    @Override // p067l.AbstractC8829, p067l.InterfaceC15358
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC3242 mo3493() {
        if (this.f17138 == null) {
            this.f17138 = new C22066(this);
        }
        return this.f17138;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final InterfaceC4226 keySet() {
        if (this.f17132 == null) {
            this.f17132 = new C5972(this);
        }
        return this.f17132;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final InterfaceC21210 values() {
        if (this.f17134 == null) {
            this.f17134 = new C11337(this);
        }
        return this.f17134;
    }

    @Override // p067l.InterfaceC2472
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC2472 mo3495(char c) {
        return new C22736(this, (char) 0, true, c, false);
    }

    @Override // p067l.InterfaceC2472
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC2472 mo3492(char c) {
        return new C22736(this, c, false, (char) 0, true);
    }

    @Override // p067l.InterfaceC2472
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC2472 mo3490(char c, char c2) {
        return new C22736(this, c, false, c2, false);
    }

    public final Object clone() {
        try {
            C6642 c6642 = (C6642) super.clone();
            c6642.f17132 = null;
            c6642.f17134 = null;
            c6642.f17138 = null;
            c6642.f17140 = new boolean[48];
            if (this.f17139 != 0) {
                C10666 c10666 = new C10666();
                C10666 c10667 = new C10666();
                C10666 c10668 = this.f17135;
                c10666.f29503 &= -1073741825;
                c10666.f29502 = c10668;
                c10667.m24532((C10666) null);
                C10666 c10669 = c10667;
                loop0: while (true) {
                    if (!c10666.m24538()) {
                        C10666 c10666Clone = c10666.f29502.clone();
                        c10666Clone.m24532(c10669.f29502);
                        c10666Clone.m24537(c10669);
                        c10669.f29503 &= -1073741825;
                        c10669.f29502 = c10666Clone;
                        c10666 = c10666.f29502;
                        c10669 = c10666Clone;
                    } else {
                        while (c10666.m24535()) {
                            c10666 = c10666.f29501;
                            if (c10666 == null) {
                                break loop0;
                            }
                            c10669 = c10669.f29501;
                        }
                        c10666 = c10666.f29501;
                        c10669 = c10669.f29501;
                    }
                    if (!c10666.m24535()) {
                        C10666 c10666Clone2 = c10666.f29501.clone();
                        c10666Clone2.m24537(c10669.f29501);
                        c10666Clone2.m24532(c10669);
                        c10669.f29503 &= Integer.MAX_VALUE;
                        c10669.f29501 = c10666Clone2;
                    }
                }
                c10669.f29501 = null;
                C10666 c106610 = c10667.f29502;
                c6642.f17135 = c106610;
                c6642.f17133 = c106610;
                while (true) {
                    C10666 c106611 = c6642.f17133.f29502;
                    if (c106611 == null) {
                        break;
                    }
                    c6642.f17133 = c106611;
                }
                c6642.f17137 = c6642.f17135;
                while (true) {
                    C10666 c106612 = c6642.f17137.f29501;
                    if (c106612 == null) {
                        break;
                    }
                    c6642.f17137 = c106612;
                }
            }
            return c6642;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i = this.f17139;
        C17370 c17370 = new C17370(this);
        objectOutputStream.defaultWriteObject();
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            C10666 c10666M52074 = c17370.m52074();
            objectOutputStream.writeChar(c10666M52074.f56387);
            objectOutputStream.writeObject(c10666M52074.f56388);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10666 m15128(ObjectInputStream objectInputStream, int i, C10666 c10666, C10666 c10667) {
        if (i == 1) {
            C10666 c10668 = new C10666(objectInputStream.readChar(), objectInputStream.readObject());
            c10668.m24532(c10666);
            c10668.m24537(c10667);
            return c10668;
        }
        if (i == 2) {
            C10666 c10669 = new C10666(objectInputStream.readChar(), objectInputStream.readObject());
            C10666 c106610 = new C10666(objectInputStream.readChar(), objectInputStream.readObject());
            c10669.f29503 &= Integer.MAX_VALUE;
            c10669.f29501 = c106610;
            c106610.m24532(c10669);
            c10669.m24531(1);
            c10669.m24532(c10666);
            c10669.f29501.m24537(c10667);
            return c10669;
        }
        int i2 = i / 2;
        C10666 c106611 = new C10666();
        C10666 c10666M15128 = m15128(objectInputStream, (i - i2) - 1, c10666, c106611);
        c106611.f29503 &= -1073741825;
        c106611.f29502 = c10666M15128;
        c106611.f56387 = objectInputStream.readChar();
        c106611.f56388 = objectInputStream.readObject();
        C10666 c10666M15129 = m15128(objectInputStream, i2, c106611, c10667);
        c106611.f29503 &= Integer.MAX_VALUE;
        c106611.f29501 = c10666M15129;
        if (i == ((-i) & i)) {
            c106611.m24531(1);
        }
        return c106611;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f17140 = new boolean[48];
        int i = this.f17139;
        if (i != 0) {
            C10666 c10666M15128 = m15128(objectInputStream, i, null, null);
            this.f17135 = c10666M15128;
            while (c10666M15128.m24539() != null) {
                c10666M15128 = c10666M15128.m24539();
            }
            this.f17133 = c10666M15128;
            C10666 c10666M24534 = this.f17135;
            while (c10666M24534.m24534() != null) {
                c10666M24534 = c10666M24534.m24534();
            }
            this.f17137 = c10666M24534;
        }
    }
}
