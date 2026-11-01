package p067l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ۖܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44RQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4914 extends AbstractC8957 {

    /* JADX INFO: renamed from: ۗ */
    public boolean f11191;

    /* JADX INFO: renamed from: ۙ */
    public boolean f11192;

    /* JADX INFO: renamed from: ᩶ */
    public C20337[] f11193;

    public C4914(C21678 c21678, C22999 c22999) {
        super(c21678);
        if (c22999.m51370() != ((C10278) super.mo10442()).mo14712()) {
            throw new IllegalArgumentException("Config layout differs from package");
        }
        this.f24275 = c22999;
        this.f11193 = new C20337[c21678.f68292.size()];
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10440(C22999 c22999) {
        if (c22999.m51370() != ((C10278) super.mo10442()).mo14712()) {
            throw new IllegalArgumentException("Config layout differs from package");
        }
        this.f24275 = c22999;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20337 m10438(int i) {
        C20337[] c20337Arr = this.f11193;
        if (i < c20337Arr.length) {
            C20337 c20337 = c20337Arr[i];
            if (c20337 != null) {
                return c20337;
            }
            C20337 c20338 = new C20337(this, i);
            c20337Arr[i] = c20338;
            return c20338;
        }
        ((C21678) super.getType()).m48932(i);
        C20337[] c20337Arr2 = new C20337[((C21678) super.getType()).f68292.size()];
        C20337[] c20337Arr3 = this.f11193;
        System.arraycopy(c20337Arr3, 0, c20337Arr2, 0, c20337Arr3.length);
        this.f11193 = c20337Arr2;
        C20337 c20339 = new C20337(this, i);
        c20337Arr2[i] = c20339;
        return c20339;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m10445(int i) {
        this.f11193[i] = null;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m10444() {
        int i = 0;
        for (C20337 c20337 : this.f11193) {
            if (c20337 != null) {
                i++;
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public final void m10439(InterfaceC6631 interfaceC6631, C14301 c14301, C20689 c20689) throws IOException {
        C22999 c22999Mo20693 = mo20693();
        short sM51376 = (short) (c22999Mo20693.m51376() + 24);
        interfaceC6631.mo15111(ColorResourcesTableCreator.HEADER_TYPE_TYPE);
        interfaceC6631.mo15111(sM51376);
        long position = interfaceC6631.getPosition();
        interfaceC6631.mo15114();
        interfaceC6631.writeByte(((C21678) super.getType()).mo5199());
        boolean z = this.f11191;
        int i = z;
        if (this.f11192) {
            i = (z ? 1 : 0) | 2;
        }
        interfaceC6631.writeByte(i);
        int i2 = 0;
        interfaceC6631.writeByte(0);
        interfaceC6631.writeByte(0);
        int i3 = 1;
        if (this.f11191) {
            List list = (List) C23573.stream(this.f11193).filter(new C17653(0)).collect(C24205.toList());
            int size = list.size();
            interfaceC6631.writeInt(size);
            int i4 = size * 4;
            interfaceC6631.writeInt(sM51376 + i4);
            c22999Mo20693.m51371(interfaceC6631);
            long position2 = interfaceC6631.getPosition();
            interfaceC6631.skipBytes(i4);
            int[] iArr = new int[size];
            long position3 = interfaceC6631.getPosition();
            while (i2 < size) {
                if (c20689 != null) {
                    c20689.m46754(i3);
                }
                C20337 c20337 = (C20337) list.get(i2);
                int iMo50213 = c20337.mo50213();
                long position4 = interfaceC6631.getPosition() - position3;
                if (position4 % 4 != 0) {
                    throw new RuntimeException();
                }
                long j = position3;
                long j2 = position4 / 4;
                if (j2 < 0 || j2 > 65535) {
                    throw new IOException("Sparse offset out of range");
                }
                iArr[i2] = iMo50213 | (((int) j2) << 16);
                c20337.m45909(interfaceC6631, c14301);
                i2++;
                i3 = 1;
                position3 = j;
            }
            long position5 = interfaceC6631.getPosition();
            interfaceC6631.seek(position);
            interfaceC6631.writeInt((int) ((position5 - position) + 4));
            interfaceC6631.seek(position2);
            interfaceC6631.mo15112(iArr);
            interfaceC6631.seek(position5);
            return;
        }
        if (this.f11192) {
            int size2 = ((C21678) super.getType()).f68292.size();
            interfaceC6631.writeInt(size2);
            int i5 = size2 * 2;
            if (i5 % 4 != 0) {
                i5 += 2;
            }
            interfaceC6631.writeInt(sM51376 + i5);
            c22999Mo20693.m51371(interfaceC6631);
            long position6 = interfaceC6631.getPosition();
            interfaceC6631.skipBytes(i5);
            int[] iArr2 = new int[size2];
            Arrays.fill(iArr2, -1);
            long position7 = interfaceC6631.getPosition();
            for (C20337 c20338 : m20695()) {
                if (c20689 != null) {
                    c20689.m46754(1);
                }
                int position8 = (int) (interfaceC6631.getPosition() - position7);
                if (position8 % 4 != 0) {
                    throw new RuntimeException();
                }
                int i6 = position8 / 4;
                if (i6 == 65535) {
                    throw new IOException("Offset 16 out of range");
                }
                iArr2[c20338.mo50213()] = i6;
                c20338.m45909(interfaceC6631, c14301);
            }
            long position9 = interfaceC6631.getPosition();
            interfaceC6631.seek(position);
            interfaceC6631.writeInt((int) ((position9 - position) + 4));
            interfaceC6631.seek(position6);
            for (int i7 = 0; i7 < size2; i7++) {
                int i8 = iArr2[i7];
                if (i8 == -1) {
                    i8 = 65535;
                }
                interfaceC6631.mo15113(i8);
            }
            interfaceC6631.seek(position9);
            return;
        }
        int size3 = ((C21678) super.getType()).f68292.size();
        interfaceC6631.writeInt(size3);
        int i9 = size3 * 4;
        interfaceC6631.writeInt(sM51376 + i9);
        c22999Mo20693.m51371(interfaceC6631);
        long position10 = interfaceC6631.getPosition();
        interfaceC6631.skipBytes(i9);
        int[] iArr3 = new int[size3];
        Arrays.fill(iArr3, -1);
        long position11 = interfaceC6631.getPosition();
        for (C20337 c20339 : m20695()) {
            if (c20689 != null) {
                c20689.m46754(1);
            }
            iArr3[c20339.mo50213()] = (int) (interfaceC6631.getPosition() - position11);
            c20339.m45909(interfaceC6631, c14301);
        }
        long position12 = interfaceC6631.getPosition();
        interfaceC6631.seek(position);
        interfaceC6631.writeInt((int) ((position12 - position) + 4));
        interfaceC6631.seek(position10);
        interfaceC6631.mo15112(iArr3);
        interfaceC6631.seek(position12);
    }

    @Override // p067l.InterfaceC9116
    /* JADX INFO: renamed from: ֨ */
    public final int mo4715() {
        return this.f11193.length - 1;
    }

    @Override // p067l.InterfaceC9116
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo4718(int i) {
        C20337[] c20337Arr = this.f11193;
        return i < c20337Arr.length && c20337Arr[i] != null;
    }

    @Override // p067l.InterfaceC9116
    /* JADX INFO: renamed from: ۚ֫ */
    public final boolean mo4716() {
        return this.f11191;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m10443(boolean z) {
        this.f11191 = z;
    }

    @Override // p067l.InterfaceC9116
    /* JADX INFO: renamed from: ᩷ۧ */
    public final boolean mo4720() {
        return this.f11192;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10441(boolean z) {
        this.f11192 = z;
    }

    @Override // p067l.InterfaceC9116
    /* JADX INFO: renamed from: ܽ */
    public final String mo4719(int i) {
        return this.f11193[i].mo31468();
    }

    @Override // p067l.InterfaceC9116
    /* JADX INFO: renamed from: ۧ */
    public final C20337 mo4717(int i) {
        if (i < 0) {
            return null;
        }
        C20337[] c20337Arr = this.f11193;
        if (i >= c20337Arr.length) {
            return null;
        }
        return c20337Arr[i];
    }

    @Override // p067l.AbstractC8957, p067l.InterfaceC9116
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11799 mo10437() {
        return (C10949) super.mo10437();
    }

    @Override // p067l.AbstractC8957, p067l.InterfaceC9116
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC6434 mo10442() {
        return (C10278) super.mo10442();
    }

    @Override // p067l.AbstractC8957, p067l.InterfaceC9116
    public final InterfaceC3080 getType() {
        return (C21678) super.getType();
    }

    @Override // p067l.AbstractC8957, p067l.InterfaceC9116
    public final C21678 getType() {
        return (C21678) super.getType();
    }
}
