package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ۖܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44RQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C2678 extends AbstractC6932 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f8396;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f8397;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C18906[] f8398;

    public C2678(C20317 c20317, C21707 c21707) {
        super(c20317);
        if (c21707.m49021() != ((C8322) super.mo8396()).mo12848()) {
            throw new IllegalArgumentException("Config layout differs from package");
        }
        this.f21394 = c21707;
        this.f8398 = new C18906[c20317.f65617.size()];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8394(C21707 c21707) {
        if (c21707.m49021() != ((C8322) super.mo8396()).mo12848()) {
            throw new IllegalArgumentException("Config layout differs from package");
        }
        this.f21394 = c21707;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18906 m8392(int i) {
        C18906[] c18906Arr = this.f8398;
        if (i < c18906Arr.length) {
            C18906 c18906 = c18906Arr[i];
            if (c18906 != null) {
                return c18906;
            }
            C18906 c18907 = new C18906(this, i);
            c18906Arr[i] = c18907;
            return c18907;
        }
        ((C20317) super.getType()).m46609(i);
        C18906[] c18906Arr2 = new C18906[((C20317) super.getType()).f65617.size()];
        C18906[] c18906Arr3 = this.f8398;
        System.arraycopy(c18906Arr3, 0, c18906Arr2, 0, c18906Arr3.length);
        this.f8398 = c18906Arr2;
        C18906 c18908 = new C18906(this, i);
        c18906Arr2[i] = c18908;
        return c18908;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m8399(int i) {
        this.f8398[i] = null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m8398() {
        int i = 0;
        for (C18906 c18906 : this.f8398) {
            if (c18906 != null) {
                i++;
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8393(InterfaceC4485 interfaceC4485, C12555 c12555, C19277 c19277) throws IOException {
        C21707 c21707Mo18743 = mo18743();
        short sM49027 = (short) (c21707Mo18743.m49027() + 24);
        interfaceC4485.mo13229(ColorResourcesTableCreator.HEADER_TYPE_TYPE);
        interfaceC4485.mo13229(sM49027);
        long position = interfaceC4485.getPosition();
        interfaceC4485.mo13232();
        interfaceC4485.writeByte(((C20317) super.getType()).mo2870());
        boolean z = this.f8396;
        int i = z;
        if (this.f8397) {
            i = (z ? 1 : 0) | 2;
        }
        interfaceC4485.writeByte(i);
        int i2 = 0;
        interfaceC4485.writeByte(0);
        interfaceC4485.writeByte(0);
        int i3 = 1;
        if (this.f8396) {
            List list = (List) C22311.stream(this.f8398).filter(new C16082(0)).collect(C22976.toList());
            int size = list.size();
            interfaceC4485.writeInt(size);
            int i4 = size * 4;
            interfaceC4485.writeInt(sM49027 + i4);
            c21707Mo18743.m49022(interfaceC4485);
            long position2 = interfaceC4485.getPosition();
            interfaceC4485.skipBytes(i4);
            int[] iArr = new int[size];
            long position3 = interfaceC4485.getPosition();
            while (i2 < size) {
                if (c19277 != null) {
                    c19277.m44460(i3);
                }
                C18906 c18906 = (C18906) list.get(i2);
                int iMo47883 = c18906.mo47883();
                long position4 = interfaceC4485.getPosition() - position3;
                if (position4 % 4 != 0) {
                    throw new RuntimeException();
                }
                long j = position3;
                long j2 = position4 / 4;
                if (j2 < 0 || j2 > 65535) {
                    throw new IOException("Sparse offset out of range");
                }
                iArr[i2] = iMo47883 | (((int) j2) << 16);
                c18906.m43643(interfaceC4485, c12555);
                i2++;
                i3 = 1;
                position3 = j;
            }
            long position5 = interfaceC4485.getPosition();
            interfaceC4485.seek(position);
            interfaceC4485.writeInt((int) ((position5 - position) + 4));
            interfaceC4485.seek(position2);
            interfaceC4485.mo13230(iArr);
            interfaceC4485.seek(position5);
            return;
        }
        if (this.f8397) {
            int size2 = ((C20317) super.getType()).f65617.size();
            interfaceC4485.writeInt(size2);
            int i5 = size2 * 2;
            if (i5 % 4 != 0) {
                i5 += 2;
            }
            interfaceC4485.writeInt(sM49027 + i5);
            c21707Mo18743.m49022(interfaceC4485);
            long position6 = interfaceC4485.getPosition();
            interfaceC4485.skipBytes(i5);
            int[] iArr2 = new int[size2];
            Arrays.fill(iArr2, -1);
            long position7 = interfaceC4485.getPosition();
            for (C18906 c18907 : m18745()) {
                if (c19277 != null) {
                    c19277.m44460(1);
                }
                int position8 = (int) (interfaceC4485.getPosition() - position7);
                if (position8 % 4 != 0) {
                    throw new RuntimeException();
                }
                int i6 = position8 / 4;
                if (i6 == 65535) {
                    throw new IOException("Offset 16 out of range");
                }
                iArr2[c18907.mo47883()] = i6;
                c18907.m43643(interfaceC4485, c12555);
            }
            long position9 = interfaceC4485.getPosition();
            interfaceC4485.seek(position);
            interfaceC4485.writeInt((int) ((position9 - position) + 4));
            interfaceC4485.seek(position6);
            for (int i7 = 0; i7 < size2; i7++) {
                int i8 = iArr2[i7];
                if (i8 == -1) {
                    i8 = 65535;
                }
                interfaceC4485.mo13231(i8);
            }
            interfaceC4485.seek(position9);
            return;
        }
        int size3 = ((C20317) super.getType()).f65617.size();
        interfaceC4485.writeInt(size3);
        int i9 = size3 * 4;
        interfaceC4485.writeInt(sM49027 + i9);
        c21707Mo18743.m49022(interfaceC4485);
        long position10 = interfaceC4485.getPosition();
        interfaceC4485.skipBytes(i9);
        int[] iArr3 = new int[size3];
        Arrays.fill(iArr3, -1);
        long position11 = interfaceC4485.getPosition();
        for (C18906 c18908 : m18745()) {
            if (c19277 != null) {
                c19277.m44460(1);
            }
            iArr3[c18908.mo47883()] = (int) (interfaceC4485.getPosition() - position11);
            c18908.m43643(interfaceC4485, c12555);
        }
        long position12 = interfaceC4485.getPosition();
        interfaceC4485.seek(position);
        interfaceC4485.writeInt((int) ((position12 - position) + 4));
        interfaceC4485.seek(position10);
        interfaceC4485.mo13230(iArr3);
        interfaceC4485.seek(position12);
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ֨ */
    public final int mo2344() {
        return this.f8398.length - 1;
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo2347(int i) {
        C18906[] c18906Arr = this.f8398;
        return i < c18906Arr.length && c18906Arr[i] != null;
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ۚ֫ */
    public final boolean mo2345() {
        return this.f8396;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m8397(boolean z) {
        this.f8396 = z;
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ᩷ۧ */
    public final boolean mo2349() {
        return this.f8397;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8395(boolean z) {
        this.f8397 = z;
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ܽ */
    public final String mo2348(int i) {
        return this.f8398[i].mo29406();
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ۧ */
    public final C18906 mo2346(int i) {
        if (i < 0) {
            return null;
        }
        C18906[] c18906Arr = this.f8398;
        if (i >= c18906Arr.length) {
            return null;
        }
        return c18906Arr[i];
    }

    @Override // l.AbstractC6932, l.InterfaceC7099
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9922 mo8391() {
        return (C9028) super.mo8391();
    }

    @Override // l.AbstractC6932, l.InterfaceC7099
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4277 mo8396() {
        return (C8322) super.mo8396();
    }

    @Override // l.AbstractC6932, l.InterfaceC7099
    public final InterfaceC0748 getType() {
        return (C20317) super.getType();
    }

    @Override // l.AbstractC6932, l.InterfaceC7099
    public final C20317 getType() {
        return (C20317) super.getType();
    }
}
