package l;

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
public final class C14448 extends AbstractC11853 implements Serializable {
    public static final long serialVersionUID = -7046029254386353130L;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient C10922 f44288;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient C10922 f44289;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient boolean[] f44291 = new boolean[48];

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient C10922 f44287 = null;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f44290 = 0;

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // l.InterfaceC1933, java.util.SortedSet
    public final InterfaceC4571 comparator() {
        return null;
    }

    @Override // l.InterfaceC1043
    public final boolean contains(int i) {
        C10922 c10922M27229 = this.f44287;
        while (c10922M27229 != null) {
            int iCompare = Integer.compare(i, c10922M27229.f32829);
            if (iCompare == 0) {
                break;
            }
            c10922M27229 = iCompare < 0 ? c10922M27229.m27229() : c10922M27229.m27235();
        }
        return c10922M27229 != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10922 m34503(int i) {
        C10922 c10922M27229 = this.f44287;
        C10922 c10922 = c10922M27229;
        int iCompare = 0;
        while (c10922M27229 != null) {
            iCompare = Integer.compare(i, c10922M27229.f32829);
            if (iCompare == 0) {
                break;
            }
            c10922 = c10922M27229;
            c10922M27229 = iCompare < 0 ? c10922M27229.m27229() : c10922M27229.m27235();
        }
        return iCompare == 0 ? c10922M27229 : c10922;
    }

    /* JADX WARN: Code duplicated, block: B:86:0x018d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0190  */
    /* JADX WARN: Code duplicated, block: B:90:0x0194  */
    /* JADX WARN: Code duplicated, block: B:92:0x0197  */
    @Override // l.AbstractC21731, l.InterfaceC1043
    public final boolean add(int i) {
        C10922 c10922;
        C10922 c10923;
        C10922 c10924;
        C10922 c10925;
        C10922 c10926 = this.f44287;
        if (c10926 == null) {
            this.f44290++;
            C10922 c10927 = new C10922(i);
            this.f44289 = c10927;
            this.f44288 = c10927;
            this.f44287 = c10927;
            return true;
        }
        C10922 c10928 = null;
        C10922 c10929 = null;
        int i2 = 0;
        C10922 c109210 = c10926;
        while (true) {
            int iCompare = Integer.compare(i, c10926.f32829);
            if (iCompare == 0) {
                return false;
            }
            if (((byte) c10926.f32828) != 0) {
                i2 = 0;
                c109210 = c10926;
                c10929 = c10928;
            }
            boolean[] zArr = this.f44291;
            int i3 = i2 + 1;
            boolean z = iCompare > 0;
            zArr[i2] = z;
            if (z) {
                if (c10926.m27233()) {
                    this.f44290++;
                    c10922 = new C10922(i);
                    C10922 c109211 = c10926.f32826;
                    if (c109211 == null) {
                        this.f44288 = c10922;
                    }
                    c10922.f32827 = c10926;
                    c10922.f32826 = c109211;
                    c10926.f32828 &= Integer.MAX_VALUE;
                    c10926.f32826 = c10922;
                    break;
                }
                c10923 = c10926.f32826;
                i2 = i3;
                C10922 c109212 = c10923;
                c10928 = c10926;
                c10926 = c109212;
            } else {
                if (c10926.m27239()) {
                    this.f44290++;
                    c10922 = new C10922(i);
                    C10922 c109213 = c10926.f32827;
                    if (c109213 == null) {
                        this.f44289 = c10922;
                    }
                    c10922.f32826 = c10926;
                    c10922.f32827 = c109213;
                    c10926.f32828 &= -1073741825;
                    c10926.f32827 = c10922;
                    break;
                }
                c10923 = c10926.f32827;
                i2 = i3;
                C10922 c109214 = c10923;
                c10928 = c10926;
                c10926 = c109214;
            }
        }
        int i4 = 0;
        C10922 c109215 = c109210;
        while (c109215 != c10922) {
            boolean z2 = this.f44291[i4];
            if (z2) {
                int i5 = c109215.f32828;
                c109215.f32828 = ((((byte) i5) + 1) & 255) | (i5 & (-256));
            } else {
                int i6 = c109215.f32828;
                c109215.f32828 = ((((byte) i6) - 1) & 255) | (i6 & (-256));
            }
            i4++;
            c109215 = z2 ? c109215.f32826 : c109215.f32827;
        }
        byte b = (byte) c109210.f32828;
        if (b == -2) {
            c10924 = c109210.f32827;
            if (((byte) c10924.f32828) == -1) {
                if (c10924.m27233()) {
                    c10924.m27237(false);
                    c109210.m27231(c10924);
                } else {
                    c109210.f32827 = c10924.f32826;
                }
                c10924.f32826 = c109210;
                c10924.m27230(0);
                c109210.m27230(0);
            } else {
                c10925 = c10924.f32826;
                c10924.f32826 = c10925.f32827;
                c10925.f32827 = c10924;
                c109210.f32827 = c10925.f32826;
                c10925.f32826 = c109210;
                byte b2 = (byte) c10925.f32828;
                if (b2 == -1) {
                    c10924.m27230(0);
                    c109210.m27230(1);
                } else if (b2 == 0) {
                    c10924.m27230(0);
                    c109210.m27230(0);
                } else {
                    c10924.m27230(-1);
                    c109210.m27230(0);
                }
                c10925.m27230(0);
                if (c10925.m27239()) {
                    c10924.m27234(c10925);
                    c10925.m27232(false);
                }
                if (c10925.m27233()) {
                    c109210.m27231(c10925);
                    c10925.m27237(false);
                }
                c10924 = c10925;
            }
            if (c10929 == null) {
                this.f44287 = c10924;
                return true;
            }
            if (c10929.f32827 == c109210) {
                c10929.f32827 = c10924;
                return true;
            }
            c10929.f32826 = c10924;
        } else if (b == 2) {
            c10924 = c109210.f32826;
            if (((byte) c10924.f32828) == 1) {
                if (c10924.m27239()) {
                    c10924.m27232(false);
                    c109210.m27234(c10924);
                } else {
                    c109210.f32826 = c10924.f32827;
                }
                c10924.f32827 = c109210;
                c10924.m27230(0);
                c109210.m27230(0);
            } else {
                c10925 = c10924.f32827;
                c10924.f32827 = c10925.f32826;
                c10925.f32826 = c10924;
                c109210.f32826 = c10925.f32827;
                c10925.f32827 = c109210;
                byte b3 = (byte) c10925.f32828;
                if (b3 == 1) {
                    c10924.m27230(0);
                    c109210.m27230(-1);
                } else if (b3 == 0) {
                    c10924.m27230(0);
                    c109210.m27230(0);
                } else {
                    c10924.m27230(1);
                    c109210.m27230(0);
                }
                c10925.m27230(0);
                if (c10925.m27239()) {
                    c109210.m27234(c10925);
                    c10925.m27232(false);
                }
                if (c10925.m27233()) {
                    c10924.m27231(c10925);
                    c10925.m27237(false);
                }
                c10924 = c10925;
            }
            if (c10929 == null) {
                this.f44287 = c10924;
                return true;
            }
            if (c10929.f32827 == c109210) {
                c10929.f32827 = c10924;
                return true;
            }
            c10929.f32826 = c10924;
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
    @Override // l.AbstractC6208
    public final boolean remove(int r11) {
        /*
            Method dump skipped, instruction units count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14448.remove(int):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f44290 = 0;
        this.f44287 = null;
        this.f44288 = null;
        this.f44289 = null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f44290;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f44290 == 0;
    }

    @Override // l.InterfaceC1933
    /* JADX INFO: renamed from: ֡ */
    public final int mo6349() {
        if (this.f44287 == null) {
            throw new NoSuchElementException();
        }
        return this.f44289.f32829;
    }

    @Override // l.InterfaceC1933
    /* JADX INFO: renamed from: ᩻֫ */
    public final int mo6354() {
        if (this.f44287 == null) {
            throw new NoSuchElementException();
        }
        return this.f44288.f32829;
    }

    @Override // l.AbstractC11853, l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C16565(this);
    }

    @Override // l.AbstractC11853, l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC6667 iterator() {
        return new C16565(this);
    }

    @Override // l.InterfaceC1933
    /* JADX INFO: renamed from: ۗ */
    public final InterfaceC15132 mo6350() {
        return new C16565(this);
    }

    @Override // l.InterfaceC1933
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC1933 mo6353(int i) {
        return new C17271(this, 0, true, i, false);
    }

    @Override // l.InterfaceC1933
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC1933 mo6351(int i) {
        return new C17271(this, i, false, 0, true);
    }

    @Override // l.InterfaceC1933
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC1933 mo6352(int i, int i2) {
        return new C17271(this, i, false, i2, false);
    }

    public final Object clone() {
        try {
            C14448 c14448 = (C14448) super.clone();
            c14448.f44291 = new boolean[48];
            if (this.f44290 != 0) {
                C10922 c10922 = new C10922();
                C10922 c10923 = new C10922();
                C10922 c10924 = this.f44287;
                c10922.f32828 &= -1073741825;
                c10922.f32827 = c10924;
                c10923.m27231((C10922) null);
                C10922 c10925 = c10923;
                loop0: while (true) {
                    if (!c10922.m27239()) {
                        C10922 c10922Clone = c10922.f32827.clone();
                        c10922Clone.m27231(c10925.f32827);
                        c10922Clone.m27234(c10925);
                        c10925.f32828 &= -1073741825;
                        c10925.f32827 = c10922Clone;
                        c10922 = c10922.f32827;
                        c10925 = c10922Clone;
                    } else {
                        while (c10922.m27233()) {
                            c10922 = c10922.f32826;
                            if (c10922 == null) {
                                break loop0;
                            }
                            c10925 = c10925.f32826;
                        }
                        c10922 = c10922.f32826;
                        c10925 = c10925.f32826;
                    }
                    if (!c10922.m27233()) {
                        C10922 c10922Clone2 = c10922.f32826.clone();
                        c10922Clone2.m27234(c10925.f32826);
                        c10922Clone2.m27231(c10925);
                        c10925.f32828 &= Integer.MAX_VALUE;
                        c10925.f32826 = c10922Clone2;
                    }
                }
                c10925.f32826 = null;
                C10922 c10926 = c10923.f32827;
                c14448.f44287 = c10926;
                c14448.f44289 = c10926;
                while (true) {
                    C10922 c10927 = c14448.f44289.f32827;
                    if (c10927 == null) {
                        break;
                    }
                    c14448.f44289 = c10927;
                }
                c14448.f44288 = c14448.f44287;
                while (true) {
                    C10922 c10928 = c14448.f44288.f32826;
                    if (c10928 == null) {
                        break;
                    }
                    c14448.f44288 = c10928;
                }
            }
            return c14448;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i = this.f44290;
        C16565 c16565 = new C16565(this);
        objectOutputStream.defaultWriteObject();
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            objectOutputStream.writeInt(c16565.nextInt());
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10922 m34502(ObjectInputStream objectInputStream, int i, C10922 c10922, C10922 c10923) {
        if (i == 1) {
            C10922 c10924 = new C10922(objectInputStream.readInt());
            c10924.m27231(c10922);
            c10924.m27234(c10923);
            return c10924;
        }
        if (i == 2) {
            C10922 c10925 = new C10922(objectInputStream.readInt());
            C10922 c10926 = new C10922(objectInputStream.readInt());
            c10925.f32828 &= Integer.MAX_VALUE;
            c10925.f32826 = c10926;
            c10926.m27231(c10925);
            c10925.m27230(1);
            c10925.m27231(c10922);
            c10925.f32826.m27234(c10923);
            return c10925;
        }
        int i2 = i / 2;
        C10922 c10927 = new C10922();
        C10922 c10922M34502 = m34502(objectInputStream, (i - i2) - 1, c10922, c10927);
        c10927.f32828 &= -1073741825;
        c10927.f32827 = c10922M34502;
        c10927.f32829 = objectInputStream.readInt();
        C10922 c10922M34503 = m34502(objectInputStream, i2, c10927, c10923);
        c10927.f32828 &= Integer.MAX_VALUE;
        c10927.f32826 = c10922M34503;
        if (i == ((-i) & i)) {
            c10927.m27230(1);
        }
        return c10927;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f44291 = new boolean[48];
        int i = this.f44290;
        if (i != 0) {
            C10922 c10922M34502 = m34502(objectInputStream, i, null, null);
            this.f44287 = c10922M34502;
            while (c10922M34502.m27229() != null) {
                c10922M34502 = c10922M34502.m27229();
            }
            this.f44289 = c10922M34502;
            C10922 c10922M27235 = this.f44287;
            while (c10922M27235.m27235() != null) {
                c10922M27235 = c10922M27235.m27235();
            }
            this.f44288 = c10922M27235;
        }
    }
}
