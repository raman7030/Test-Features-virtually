package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11737 extends AbstractC16675 implements Cloneable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient char[] f35005;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f35006;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient InterfaceC5755 f35007;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC11668 f35008;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient InterfaceC17903 f35009;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient char[] f35010;

    public C11737() {
        char[] cArr = C12810.f38455;
        this.f35010 = cArr;
        this.f35005 = cArr;
    }

    public C11737(int i) {
        this.f35010 = new char[i];
        this.f35005 = new char[i];
    }

    @Override // l.InterfaceC17197
    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18559 mo28641() {
        if (this.f35009 == null) {
            this.f35009 = new C22320(this);
        }
        return this.f35009;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int m28640(char c) {
        char[] cArr = this.f35010;
        int i = this.f35006;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return -1;
            }
            if (cArr[i2] == c) {
                return i2;
            }
            i = i2;
        }
    }

    @Override // l.InterfaceC13852
    /* JADX INFO: renamed from: ۧ */
    public final char mo20130(char c) {
        char[] cArr = this.f35010;
        int i = this.f35006;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return (char) 0;
            }
            if (cArr[i2] == c) {
                return this.f35005[i2];
            }
            i = i2;
        }
    }

    @Override // l.InterfaceC9893
    public final int size() {
        return this.f35006;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f35006 = 0;
    }

    @Override // l.InterfaceC13852
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20129(char c) {
        return m28640(c) != -1;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f35006 == 0;
    }

    @Override // l.AbstractC11032, l.InterfaceC13852
    /* JADX INFO: renamed from: ֫ */
    public final char mo27373(char c, char c2) {
        int iM28640 = m28640(c);
        if (iM28640 != -1) {
            char[] cArr = this.f35005;
            char c3 = cArr[iM28640];
            cArr[iM28640] = c2;
            return c3;
        }
        int i = this.f35006;
        if (i == this.f35010.length) {
            char[] cArr2 = new char[i == 0 ? 2 : i * 2];
            char[] cArr3 = new char[i != 0 ? i * 2 : 2];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                cArr2[i2] = this.f35010[i2];
                cArr3[i2] = this.f35005[i2];
                i = i2;
            }
            this.f35010 = cArr2;
            this.f35005 = cArr3;
        }
        char[] cArr4 = this.f35010;
        int i3 = this.f35006;
        cArr4[i3] = c;
        this.f35005[i3] = c2;
        this.f35006 = i3 + 1;
        return (char) 0;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final char m28642(char c) {
        int iM28640 = m28640(c);
        if (iM28640 == -1) {
            return (char) 0;
        }
        char c2 = this.f35005[iM28640];
        int i = (this.f35006 - iM28640) - 1;
        char[] cArr = this.f35010;
        int i2 = iM28640 + 1;
        System.arraycopy(cArr, i2, cArr, iM28640, i);
        char[] cArr2 = this.f35005;
        System.arraycopy(cArr2, i2, cArr2, iM28640, i);
        this.f35006--;
        return c2;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f35008 == null) {
            this.f35008 = new C3270(this);
        }
        return this.f35008;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f35007 == null) {
            this.f35007 = new C6092(this);
        }
        return this.f35007;
    }

    public final Object clone() {
        try {
            C11737 c11737 = (C11737) super.clone();
            c11737.f35010 = (char[]) this.f35010.clone();
            c11737.f35005 = (char[]) this.f35005.clone();
            c11737.f35009 = null;
            c11737.f35008 = null;
            c11737.f35007 = null;
            return c11737;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        char[] cArr = this.f35010;
        char[] cArr2 = this.f35005;
        int i = this.f35006;
        for (int i2 = 0; i2 < i; i2++) {
            objectOutputStream.writeChar(cArr[i2]);
            objectOutputStream.writeChar(cArr2[i2]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = this.f35006;
        char[] cArr = new char[i];
        this.f35010 = cArr;
        char[] cArr2 = new char[i];
        this.f35005 = cArr2;
        for (int i2 = 0; i2 < this.f35006; i2++) {
            cArr[i2] = objectInputStream.readChar();
            cArr2[i2] = objectInputStream.readChar();
        }
    }
}
