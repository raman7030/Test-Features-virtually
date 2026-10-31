package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.۬ܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45YI */
/* JADX INFO: loaded from: classes4.dex */
public final class C13260 extends AbstractC21023 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f39708 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f39709;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public HashMap f39712 = new HashMap();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public HashMap f39711 = new HashMap();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f39710 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m32182(String str) {
        C3383 c3383 = new C3383(this, str);
        this.f39710.add(c3383);
        this.f39712.put(str, c3383);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13260 m32176(InterfaceC12743 interfaceC12743) {
        C3383 c3383;
        C21916[] c21916ArrMo10320;
        C13260 c13260 = new C13260();
        c13260.f39709 = interfaceC12743.mo3391();
        for (InterfaceC3571 interfaceC3571 : ((AbstractC21023) interfaceC12743).m47857()) {
            if (interfaceC3571.mo10323()) {
                if (interfaceC3571 instanceof C3383) {
                    c21916ArrMo10320 = interfaceC3571.mo10322();
                } else {
                    c21916ArrMo10320 = interfaceC3571.mo10320();
                }
                c3383 = new C3383(c13260, interfaceC3571.getValue(), c21916ArrMo10320, false);
            } else {
                c3383 = new C3383(c13260, interfaceC3571.getValue());
            }
            c13260.f39710.add(c3383);
            if (c3383.mo10323()) {
                c13260.f39711.put(c3383, c3383);
            } else {
                c13260.f39712.put(c3383.getValue(), c3383);
            }
        }
        return c13260;
    }

    @Override // l.InterfaceC12743
    public final int size() {
        return this.f39710.size();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m32185() {
        return this.f39710.size();
    }

    @Override // l.InterfaceC12743
    public final C3383 getItem(int i) {
        if (i < 0 || i >= this.f39710.size()) {
            return new C3383(this, "Error!!");
        }
        return (C3383) this.f39710.get(i);
    }

    @Override // l.InterfaceC12743
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC3571 mo3389(int i) {
        if (i < 0 || i >= this.f39710.size()) {
            throw C22412.m50343(i, this.f39710.size());
        }
        return (InterfaceC3571) this.f39710.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32181(boolean z) {
        this.f39709 = z;
    }

    @Override // l.InterfaceC12743
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3391() {
        return this.f39709;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m32183() {
        Iterator it = this.f39710.iterator();
        while (it.hasNext()) {
            ((C3383) it.next()).f10682 = false;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m32188() {
        HashSet hashSet = new HashSet();
        for (C3383 c3383 : this.f39710) {
            if (c3383.f10682 && c3383.mo10323()) {
                for (C21916 c21916 : c3383.mo10322()) {
                    hashSet.add(c21916.f70169);
                }
            }
        }
        ArrayList arrayList = new ArrayList(this.f39710.size());
        for (C3383 c3384 : this.f39710) {
            if (c3384.f10682 || (!c3384.mo10323() && hashSet.contains(c3384.getValue()))) {
                arrayList.add(c3384);
            } else if (c3384.mo10323()) {
                this.f39711.remove(c3384);
            } else {
                this.f39712.remove(c3384.getValue());
            }
        }
        this.f39710 = arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C3383 m32179(String str, C21916[] c21916Arr) {
        try {
            if (c21916Arr != null) {
                C3383 c3383 = new C3383(this, str, c21916Arr, true);
                C3383 c3384 = (C3383) this.f39711.get(c3383);
                if (c3384 != null) {
                    return c3384;
                }
                this.f39710.add(c3383);
                this.f39711.put(c3383, c3383);
                return c3383;
            }
            return m32186(str);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized C3383 m32186(String str) {
        C3383 c3383 = (C3383) this.f39712.get(str);
        if (c3383 != null) {
            if (c3383.mo10323() || !c3383.getValue().equals(str)) {
                throw new RuntimeException("No-Style item from map has been modified.");
            }
            return c3383;
        }
        C3383 c3384 = new C3383(this, str);
        this.f39710.add(c3384);
        this.f39712.put(str, c3384);
        return c3384;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m32187() {
        boolean z = true;
        for (int i = 0; i < this.f39710.size(); i++) {
            C3383 c3383 = (C3383) this.f39710.get(i);
            if (c3383.mo10323()) {
                if (!z) {
                    LinkedList linkedList = new LinkedList();
                    LinkedList linkedList2 = new LinkedList();
                    for (C3383 c3384 : this.f39710) {
                        if (c3384.mo10323()) {
                            linkedList.add(c3384);
                        } else {
                            linkedList2.add(c3384);
                        }
                    }
                    this.f39710.clear();
                    this.f39710.addAll(linkedList);
                    this.f39710.addAll(linkedList2);
                    for (int i2 = 0; i2 < this.f39710.size(); i2++) {
                        ((C3383) this.f39710.get(i2)).f10684 = i2;
                    }
                    return;
                }
            } else if (z) {
                z = false;
            }
            c3383.f10684 = i;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m32184(String str) {
        for (int i = 0; i < this.f39710.size(); i++) {
            C3383 c3383 = (C3383) this.f39710.get(i);
            if (!c3383.mo10323() && c3383.getValue().equals(str)) {
                return i;
            }
        }
        C3383 c3384 = new C3383(this, str);
        this.f39710.add(c3384);
        this.f39712.put(str, c3384);
        return this.f39710.size() - 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m32178(C3383 c3383) {
        for (int i = 0; i < this.f39710.size(); i++) {
            if (this.f39710.get(i) == c3383) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32180(InterfaceC4485 interfaceC4485, boolean z, C19277 c19277) {
        int[] iArr;
        long j;
        ArrayList arrayList;
        int i;
        int[] iArr2;
        long j2;
        int i2;
        long j3;
        if (z) {
            m32187();
        } else {
            for (int i3 = 0; i3 < this.f39710.size(); i3++) {
                ((C3383) this.f39710.get(i3)).f10684 = i3;
            }
        }
        int i4 = 1;
        interfaceC4485.mo13229((short) 1);
        interfaceC4485.mo13229((short) 28);
        long position = interfaceC4485.getPosition();
        interfaceC4485.mo13232();
        int size = this.f39710.size();
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC3571 interfaceC3571 : m47857()) {
            if (!interfaceC3571.mo10323()) {
                break;
            } else {
                arrayList2.add(interfaceC3571.getStyle());
            }
        }
        boolean z2 = this.f39709;
        if (!z2) {
            iArr = null;
            break;
        }
        iArr = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            String value = getItem(i5).getValue();
            long jM16234 = C5773.m16234(value, true);
            if (value.length() > 32767 || jM16234 > 32767) {
                z2 = false;
                iArr = null;
                break;
            }
            iArr[i5] = (int) jM16234;
        }
        interfaceC4485.writeInt(size);
        interfaceC4485.writeInt(arrayList2.size());
        interfaceC4485.writeInt(z2 ? 256 : 0);
        long j4 = size;
        int iM32174 = m32174(((((long) arrayList2.size()) + j4) * 4) + 28, "strings offset");
        interfaceC4485.writeInt(iM32174);
        long position2 = interfaceC4485.getPosition();
        interfaceC4485.mo13232();
        interfaceC4485.skipBytes(m32174(j4 * 4, "string offset array size"));
        interfaceC4485.skipBytes(m32174(((long) arrayList2.size()) * 4, "style offset array size"));
        int[] iArr3 = new int[size];
        if (z2) {
            C21415 c21415 = new C21415(interfaceC4485);
            int i6 = 0;
            j2 = 0;
            while (i6 < size) {
                int i7 = iM32174;
                if (c19277 != null) {
                    c19277.m44460(1);
                }
                iArr3[i6] = m32174(j2, "string offset");
                String value2 = getItem(i6).getValue();
                long j5 = position;
                int length = value2.length();
                int i8 = iArr[i6];
                int i9 = size;
                long j6 = i8;
                m32174(((long) (m32177(length) + m32177(i8))) + j6 + 1 + j2, "string data size");
                long jM32175 = j2 + ((long) m32175(interfaceC4485, length)) + ((long) m32175(interfaceC4485, i8));
                C5773.m16238((InterfaceC2077) c21415, (CharSequence) value2, true);
                interfaceC4485.writeByte(0);
                j2 = jM32175 + j6 + 1;
                i6++;
                iM32174 = i7;
                size = i9;
                iArr = iArr;
                position = j5;
                iArr3 = iArr3;
                arrayList2 = arrayList2;
            }
            j = position;
            arrayList = arrayList2;
            i = iM32174;
            iArr2 = iArr3;
        } else {
            j = position;
            arrayList = arrayList2;
            i = iM32174;
            iArr2 = iArr3;
            int i10 = 0;
            j2 = 0;
            while (i10 < size) {
                if (c19277 != null) {
                    c19277.m44460(i4);
                }
                iArr2[i10] = m32174(j2, "string offset");
                String value3 = getItem(i10).getValue();
                int length2 = value3.length();
                if (length2 < 0) {
                    throw new IOException(C19370.m44628(length2, "UTF-16 string length is out of range: "));
                }
                long j7 = ((long) length2) * 2;
                m32174(((long) (length2 <= 32767 ? 2 : 4)) + j7 + 2 + j2, "string data size");
                if (length2 < 0) {
                    throw new IOException(C19370.m44628(length2, "UTF-16 string length is out of range: "));
                }
                if (length2 <= 32767) {
                    interfaceC4485.mo13229((short) length2);
                    i2 = 2;
                } else {
                    interfaceC4485.mo13229((short) ((length2 >>> 16) | 32768));
                    interfaceC4485.mo13229((short) (65535 & length2));
                    i2 = 4;
                }
                long j8 = j2 + ((long) i2);
                for (int i11 = 0; i11 < length2; i11++) {
                    interfaceC4485.mo13227(value3.charAt(i11));
                }
                interfaceC4485.mo13229((short) 0);
                j2 = j8 + j7 + 2;
                i10++;
                i4 = 1;
            }
        }
        int i12 = (int) (j2 % 4);
        if (i12 != 0) {
            int i13 = 4 - i12;
            for (int i14 = 0; i14 < i13; i14++) {
                interfaceC4485.writeByte(0);
                j2++;
            }
        }
        int iM32175 = m32174(j2, "string data size");
        int size2 = arrayList.size();
        int[] iArr4 = new int[size2];
        if (size2 > 0) {
            long jM21450 = 0;
            for (int i15 = 0; i15 < size2; i15++) {
                iArr4[i15] = m32174(jM21450, "style offset");
                int[] iArr5 = (int[]) arrayList.get(i15);
                jM21450 = C8083.m21450(iArr5.length, 4L, 4L, jM21450);
                m32174(jM21450, "style data size");
                interfaceC4485.mo13230(iArr5);
                interfaceC4485.writeInt(-1);
            }
            j3 = jM21450 + 8;
            m32174(j3, "style data size");
            interfaceC4485.writeInt(-1);
            interfaceC4485.writeInt(-1);
        } else {
            j3 = 0;
        }
        m32174(j3, "style data size");
        long position3 = interfaceC4485.getPosition();
        long j9 = j;
        interfaceC4485.seek(j9);
        interfaceC4485.writeInt(m32174((position3 - j9) + 4, "string pool chunk size"));
        interfaceC4485.seek(position2);
        interfaceC4485.writeInt(arrayList.isEmpty() ? 0 : m32174(((long) i) + ((long) iM32175), "style offset"));
        interfaceC4485.mo13230(iArr2);
        interfaceC4485.mo13230(iArr4);
        interfaceC4485.seek(position3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m32175(InterfaceC4485 interfaceC4485, int i) throws IOException {
        if (i < 0 || i > 32767) {
            throw new IOException(C19370.m44628(i, "UTF-8 string length is out of range: "));
        }
        if (i <= 127) {
            interfaceC4485.writeByte(i);
            return 1;
        }
        interfaceC4485.writeByte((i >>> 8) | 128);
        interfaceC4485.writeByte(i & 255);
        return 2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m32177(int i) throws IOException {
        if (i < 0 || i > 32767) {
            throw new IOException(C19370.m44628(i, "UTF-8 string length is out of range: "));
        }
        return i <= 127 ? 1 : 2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m32174(long j, String str) throws IOException {
        if (j >= 0 && j <= 2147483647L) {
            return (int) j;
        }
        throw new IOException(str + " is too large: " + j);
    }
}
