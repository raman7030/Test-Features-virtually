package p067l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13523 extends AbstractC18216 implements Cloneable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ۗ */
    public transient char[] f38005;

    /* JADX INFO: renamed from: ۙ */
    public int f38006;

    /* JADX INFO: renamed from: ۬ */
    public transient InterfaceC7838 f38007;

    /* JADX INFO: renamed from: ᩶ */
    public transient InterfaceC13458 f38008;

    /* JADX INFO: renamed from: ᩸ */
    public transient InterfaceC19383 f38009;

    /* JADX INFO: renamed from: ᩹ */
    public transient char[] f38010;

    public C13523() {
        char[] cArr = C14543.f41497;
        this.f38010 = cArr;
        this.f38005 = cArr;
    }

    public C13523(int i) {
        this.f38010 = new char[i];
        this.f38005 = new char[i];
    }

    @Override // p067l.InterfaceC18712
    /* JADX INFO: renamed from: ۨ֫ */
    public final InterfaceC20007 mo30689() {
        if (this.f38009 == null) {
            this.f38009 = new C23581(this);
        }
        return this.f38009;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public int m30688(char c) {
        char[] cArr = this.f38010;
        int i = this.f38006;
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

    @Override // p067l.InterfaceC15533
    /* JADX INFO: renamed from: ۧ */
    public final char mo22106(char c) {
        char[] cArr = this.f38010;
        int i = this.f38006;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return (char) 0;
            }
            if (cArr[i2] == c) {
                return this.f38005[i2];
            }
            i = i2;
        }
    }

    @Override // p067l.InterfaceC11771
    public final int size() {
        return this.f38006;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f38006 = 0;
    }

    @Override // p067l.InterfaceC15533
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22105(char c) {
        return m30688(c) != -1;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f38006 == 0;
    }

    @Override // p067l.AbstractC12853, p067l.InterfaceC15533
    /* JADX INFO: renamed from: ֫ */
    public final char mo29435(char c, char c2) {
        int iM30688 = m30688(c);
        if (iM30688 != -1) {
            char[] cArr = this.f38005;
            char c3 = cArr[iM30688];
            cArr[iM30688] = c2;
            return c3;
        }
        int i = this.f38006;
        if (i == this.f38010.length) {
            char[] cArr2 = new char[i == 0 ? 2 : i * 2];
            char[] cArr3 = new char[i != 0 ? i * 2 : 2];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                cArr2[i2] = this.f38010[i2];
                cArr3[i2] = this.f38005[i2];
                i = i2;
            }
            this.f38010 = cArr2;
            this.f38005 = cArr3;
        }
        char[] cArr4 = this.f38010;
        int i3 = this.f38006;
        cArr4[i3] = c;
        this.f38005[i3] = c2;
        this.f38006 = i3 + 1;
        return (char) 0;
    }

    /* JADX INFO: renamed from: ܿ */
    public final char m30690(char c) {
        int iM30688 = m30688(c);
        if (iM30688 == -1) {
            return (char) 0;
        }
        char c2 = this.f38005[iM30688];
        int i = (this.f38006 - iM30688) - 1;
        char[] cArr = this.f38010;
        int i2 = iM30688 + 1;
        System.arraycopy(cArr, i2, cArr, iM30688, i);
        char[] cArr2 = this.f38005;
        System.arraycopy(cArr2, i2, cArr2, iM30688, i);
        this.f38006--;
        return c2;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f38008 == null) {
            this.f38008 = new C5476(this);
        }
        return this.f38008;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f38007 == null) {
            this.f38007 = new C8158(this);
        }
        return this.f38007;
    }

    public final Object clone() {
        try {
            C13523 c13523 = (C13523) super.clone();
            c13523.f38010 = (char[]) this.f38010.clone();
            c13523.f38005 = (char[]) this.f38005.clone();
            c13523.f38009 = null;
            c13523.f38008 = null;
            c13523.f38007 = null;
            return c13523;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        char[] cArr = this.f38010;
        char[] cArr2 = this.f38005;
        int i = this.f38006;
        for (int i2 = 0; i2 < i; i2++) {
            objectOutputStream.writeChar(cArr[i2]);
            objectOutputStream.writeChar(cArr2[i2]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = this.f38006;
        char[] cArr = new char[i];
        this.f38010 = cArr;
        char[] cArr2 = new char[i];
        this.f38005 = cArr2;
        for (int i2 = 0; i2 < this.f38006; i2++) {
            cArr[i2] = objectInputStream.readChar();
            cArr2[i2] = objectInputStream.readChar();
        }
    }
}
