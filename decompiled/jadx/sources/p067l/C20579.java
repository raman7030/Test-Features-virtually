package p067l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.᩵֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes5.dex */
public final class C20579 extends AbstractC16204 implements Cloneable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ */
    public transient InterfaceC13458 f63606;

    /* JADX INFO: renamed from: ۙ */
    public transient char[] f63607;

    /* JADX INFO: renamed from: ۛ */
    public transient int f63608;

    /* JADX INFO: renamed from: ۤ */
    public final transient int f63609;

    /* JADX INFO: renamed from: ۨ */
    public int f63610;

    /* JADX INFO: renamed from: ۫ */
    public transient int f63611;

    /* JADX INFO: renamed from: ۬ */
    public transient int f63612;

    /* JADX INFO: renamed from: ܰ */
    public transient InterfaceC21210 f63613;

    /* JADX INFO: renamed from: ᩶ */
    public final float f63614;

    /* JADX INFO: renamed from: ᩸ */
    public transient boolean f63615;

    /* JADX INFO: renamed from: ᩹ */
    public transient InterfaceC24076 f63616;

    /* JADX INFO: renamed from: ᩺ */
    public transient Object[] f63617;

    public C20579(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        this.f63614 = 0.75f;
        int iM34880 = C15322.m34880(0.75f, i);
        this.f63608 = iM34880;
        this.f63609 = iM34880;
        this.f63612 = iM34880 - 1;
        this.f63611 = C15322.m34887(0.75f, iM34880);
        int i2 = this.f63608 + 1;
        this.f63607 = new char[i2];
        this.f63617 = new Object[i2];
    }

    public C20579() {
        this(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܿ */
    public Object m46537(int i) {
        char c;
        Object[] objArr = this.f63617;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f63610--;
        char[] cArr = this.f63607;
        loop0: while (true) {
            int i2 = (i + 1) & this.f63612;
            while (true) {
                c = cArr[i2];
                if (c != 0) {
                    int iM34881 = C15322.m34881((int) c);
                    int i3 = this.f63612;
                    int i4 = iM34881 & i3;
                    if (i > i2) {
                        if (i >= i4 && i4 > i2) {
                            break;
                        }
                        i2 = (i2 + 1) & i3;
                    } else {
                        if (i >= i4 || i4 > i2) {
                            break;
                        }
                        i2 = (i2 + 1) & i3;
                    }
                } else {
                    break loop0;
                }
            }
            cArr[i] = c;
            objArr[i] = objArr[i2];
            i = i2;
        }
        cArr[i] = 0;
        objArr[i] = null;
        int i5 = this.f63608;
        if (i5 > this.f63609 && this.f63610 < this.f63611 / 4 && i5 > 16) {
            m46538(i5 / 2);
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public Object m46534() {
        this.f63615 = false;
        Object[] objArr = this.f63617;
        int i = this.f63608;
        Object obj = objArr[i];
        objArr[i] = null;
        int i2 = this.f63610 - 1;
        this.f63610 = i2;
        if (i > this.f63609 && i2 < this.f63611 / 4 && i > 16) {
            m46538(i / 2);
        }
        return obj;
    }

    @Override // p067l.AbstractC16204, java.util.Map
    public final void putAll(Map map) {
        float f = this.f63614;
        if (f <= 0.5d) {
            int iM34880 = C15322.m34880(f, map.size());
            if (iM34880 > this.f63608) {
                m46538(iM34880);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C15322.m34883((long) Math.ceil((map.size() + this.f63610) / f))));
            if (iMin > this.f63608) {
                m46538(iMin);
            }
        }
        super.putAll(map);
    }

    @Override // p067l.AbstractC19558, p067l.InterfaceC14688
    /* JADX INFO: renamed from: ֫ */
    public final Object mo15129(char c, Object obj) {
        int i;
        if (c == 0) {
            i = this.f63615 ? this.f63608 : -(this.f63608 + 1);
        } else {
            char[] cArr = this.f63607;
            int iM34881 = C15322.m34881((int) c) & this.f63612;
            char c2 = cArr[iM34881];
            if (c2 != 0) {
                if (c != c2) {
                    while (true) {
                        iM34881 = (iM34881 + 1) & this.f63612;
                        char c3 = cArr[iM34881];
                        if (c3 == 0) {
                            i = -(iM34881 + 1);
                        } else if (c == c3) {
                        }
                    }
                }
                i = iM34881;
            } else {
                i = -(iM34881 + 1);
            }
        }
        if (i < 0) {
            int i2 = (-i) - 1;
            if (i2 == this.f63608) {
                this.f63615 = true;
            }
            this.f63607[i2] = c;
            this.f63617[i2] = obj;
            int i3 = this.f63610;
            this.f63610 = i3 + 1;
            if (i3 < this.f63611) {
                return null;
            }
            m46538(C15322.m34880(this.f63614, i3 + 2));
            return null;
        }
        Object[] objArr = this.f63617;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // p067l.AbstractC19558, p067l.InterfaceC14688
    /* JADX INFO: renamed from: ܿ */
    public final Object mo15134(char c) {
        char c2;
        if (c == 0) {
            if (this.f63615) {
                return m46534();
            }
            return null;
        }
        char[] cArr = this.f63607;
        int iM34881 = C15322.m34881((int) c) & this.f63612;
        char c3 = cArr[iM34881];
        if (c3 == 0) {
            return null;
        }
        if (c == c3) {
            return m46537(iM34881);
        }
        do {
            iM34881 = (iM34881 + 1) & this.f63612;
            c2 = cArr[iM34881];
            if (c2 == 0) {
                return null;
            }
        } while (c != c2);
        return m46537(iM34881);
    }

    @Override // p067l.InterfaceC14688
    /* JADX INFO: renamed from: ۧ */
    public final Object mo15132(char c) {
        char c2;
        if (c == 0) {
            if (this.f63615) {
                return this.f63617[this.f63608];
            }
            return null;
        }
        char[] cArr = this.f63607;
        int iM34881 = C15322.m34881((int) c) & this.f63612;
        char c3 = cArr[iM34881];
        if (c3 == 0) {
            return null;
        }
        if (c == c3) {
            return this.f63617[iM34881];
        }
        do {
            iM34881 = (iM34881 + 1) & this.f63612;
            c2 = cArr[iM34881];
            if (c2 == 0) {
                return null;
            }
        } while (c != c2);
        return this.f63617[iM34881];
    }

    @Override // p067l.AbstractC16204, p067l.InterfaceC14688
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo15130(char c) {
        char c2;
        if (c == 0) {
            return this.f63615;
        }
        char[] cArr = this.f63607;
        int iM34881 = C15322.m34881((int) c) & this.f63612;
        char c3 = cArr[iM34881];
        if (c3 == 0) {
            return false;
        }
        if (c != c3) {
            do {
                iM34881 = (iM34881 + 1) & this.f63612;
                c2 = cArr[iM34881];
                if (c2 == 0) {
                    return false;
                }
            } while (c != c2);
        }
        return true;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        char[] cArr = this.f63607;
        Object[] objArr = this.f63617;
        if (this.f63615 && C12826.equals(objArr[this.f63608], obj)) {
            return true;
        }
        int i = this.f63608;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (cArr[i2] != 0 && C12826.equals(objArr[i2], obj)) {
                return true;
            }
            i = i2;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.f63610 == 0) {
            return;
        }
        this.f63610 = 0;
        this.f63615 = false;
        Arrays.fill(this.f63607, (char) 0);
        Arrays.fill(this.f63617, (Object) null);
    }

    @Override // p067l.AbstractC19558, p067l.InterfaceC11771
    public final int size() {
        return this.f63610;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f63610 == 0;
    }

    @Override // p067l.InterfaceC15358
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC20007 mo3493() {
        if (this.f63616 == null) {
            this.f63616 = new C10520(this);
        }
        return this.f63616;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f63606 == null) {
            this.f63606 = new C8508(this);
        }
        return this.f63606;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f63613 == null) {
            this.f63613 = new C17895(this);
        }
        return this.f63613;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m46538(int i) {
        char c;
        char[] cArr = this.f63607;
        Object[] objArr = this.f63617;
        int i2 = i - 1;
        int i3 = i + 1;
        char[] cArr2 = new char[i3];
        Object[] objArr2 = new Object[i3];
        int i4 = this.f63608;
        int i5 = this.f63615 ? this.f63610 - 1 : this.f63610;
        while (true) {
            int i6 = i5 - 1;
            if (i5 != 0) {
                do {
                    i4--;
                    c = cArr[i4];
                } while (c == 0);
                int iM34881 = C15322.m34881((int) c) & i2;
                if (cArr2[iM34881] != 0) {
                    do {
                        iM34881 = (iM34881 + 1) & i2;
                    } while (cArr2[iM34881] != 0);
                }
                cArr2[iM34881] = cArr[i4];
                objArr2[iM34881] = objArr[i4];
                i5 = i6;
            } else {
                objArr2[i] = objArr[this.f63608];
                this.f63608 = i;
                this.f63612 = i2;
                this.f63611 = C15322.m34887(this.f63614, i);
                this.f63607 = cArr2;
                this.f63617 = objArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C20579 c20579 = (C20579) super.clone();
            c20579.f63606 = null;
            c20579.f63613 = null;
            c20579.f63616 = null;
            c20579.f63615 = this.f63615;
            c20579.f63607 = (char[]) this.f63607.clone();
            c20579.f63617 = (Object[]) this.f63617.clone();
            return c20579;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.AbstractC16204, java.util.Map
    public final int hashCode() {
        char cHashCode;
        char[] cArr = this.f63607;
        Object[] objArr = this.f63617;
        int i = this.f63615 ? this.f63610 - 1 : this.f63610;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i - 1;
            if (i == 0) {
                break;
            }
            while (true) {
                cHashCode = cArr[i2];
                if (cHashCode != 0) {
                    break;
                }
                i2++;
            }
            Object obj = objArr[i2];
            if (this != obj) {
                cHashCode ^= obj == null ? 0 : obj.hashCode();
            }
            i3 += cHashCode;
            i2++;
            i = i4;
        }
        if (!this.f63615) {
            return i3;
        }
        Object obj2 = objArr[this.f63608];
        return i3 + (obj2 != null ? obj2.hashCode() : 0);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        char[] cArr = this.f63607;
        Object[] objArr = this.f63617;
        C19237 c19237 = new C19237(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f63610;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int iM38995 = c19237.m38995();
            objectOutputStream.writeChar(cArr[iM38995]);
            objectOutputStream.writeObject(objArr[iM38995]);
            i = i2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        int i2 = this.f63610;
        float f = this.f63614;
        int iM34880 = C15322.m34880(f, i2);
        this.f63608 = iM34880;
        this.f63611 = C15322.m34887(f, iM34880);
        int i3 = this.f63608;
        this.f63612 = i3 - 1;
        char[] cArr = new char[i3 + 1];
        this.f63607 = cArr;
        Object[] objArr = new Object[i3 + 1];
        this.f63617 = objArr;
        int i4 = this.f63610;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            char c = objectInputStream.readChar();
            Object object = objectInputStream.readObject();
            if (c == 0) {
                i = this.f63608;
                this.f63615 = true;
            } else {
                int iM34881 = C15322.m34881((int) c);
                int i6 = this.f63612;
                while (true) {
                    i = iM34881 & i6;
                    if (cArr[i] != 0) {
                        iM34881 = i + 1;
                        i6 = this.f63612;
                    }
                }
            }
            cArr[i] = c;
            objArr[i] = object;
            i4 = i5;
        }
    }
}
