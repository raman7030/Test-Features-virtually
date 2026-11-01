package p067l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.۬ܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45YI */
/* JADX INFO: loaded from: classes4.dex */
public final class C14971 extends AbstractC22349 {

    /* JADX INFO: renamed from: ᩻ */
    public static final /* synthetic */ int f42772 = 0;

    /* JADX INFO: renamed from: ܳ */
    public boolean f42773;

    /* JADX INFO: renamed from: ᩳ */
    public HashMap f42776 = new HashMap();

    /* JADX INFO: renamed from: ܿ */
    public HashMap f42775 = new HashMap();

    /* JADX INFO: renamed from: ܽ */
    public ArrayList f42774 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m34281(String str) {
        C5584 c5584 = new C5584(this, str);
        this.f42774.add(c5584);
        this.f42776.put(str, c5584);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14971 m34275(InterfaceC14480 interfaceC14480) {
        C5584 c5584;
        C23198[] c23198ArrMo12358;
        C14971 c14971 = new C14971();
        c14971.f42773 = interfaceC14480.mo5710();
        for (InterfaceC5763 interfaceC5763 : ((AbstractC22349) interfaceC14480).m50187()) {
            if (interfaceC5763.mo12361()) {
                if (interfaceC5763 instanceof C5584) {
                    c23198ArrMo12358 = interfaceC5763.mo12360();
                } else {
                    c23198ArrMo12358 = interfaceC5763.mo12358();
                }
                c5584 = new C5584(c14971, interfaceC5763.getValue(), c23198ArrMo12358, false);
            } else {
                c5584 = new C5584(c14971, interfaceC5763.getValue());
            }
            c14971.f42774.add(c5584);
            if (c5584.mo12361()) {
                c14971.f42775.put(c5584, c5584);
            } else {
                c14971.f42776.put(c5584.getValue(), c5584);
            }
        }
        return c14971;
    }

    @Override // p067l.InterfaceC14480
    public final int size() {
        return this.f42774.size();
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m34284() {
        return this.f42774.size();
    }

    @Override // p067l.InterfaceC14480
    public final C5584 getItem(int i) {
        if (i < 0 || i >= this.f42774.size()) {
            return new C5584(this, "Error!!");
        }
        return (C5584) this.f42774.get(i);
    }

    @Override // p067l.InterfaceC14480
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC5763 mo5708(int i) {
        if (i < 0 || i >= this.f42774.size()) {
            throw C23669.m52683(i, this.f42774.size());
        }
        return (InterfaceC5763) this.f42774.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34280(boolean z) {
        this.f42773 = z;
    }

    @Override // p067l.InterfaceC14480
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5710() {
        return this.f42773;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m34282() {
        Iterator it = this.f42774.iterator();
        while (it.hasNext()) {
            ((C5584) it.next()).f13489 = false;
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m34287() {
        HashSet hashSet = new HashSet();
        for (C5584 c5584 : this.f42774) {
            if (c5584.f13489 && c5584.mo12361()) {
                for (C23198 c23198 : c5584.mo12360()) {
                    hashSet.add(c23198.f72883);
                }
            }
        }
        ArrayList arrayList = new ArrayList(this.f42774.size());
        for (C5584 c5585 : this.f42774) {
            if (c5585.f13489 || (!c5585.mo12361() && hashSet.contains(c5585.getValue()))) {
                arrayList.add(c5585);
            } else if (c5585.mo12361()) {
                this.f42775.remove(c5585);
            } else {
                this.f42776.remove(c5585.getValue());
            }
        }
        this.f42774 = arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C5584 m34278(String str, C23198[] c23198Arr) {
        try {
            if (c23198Arr != null) {
                C5584 c5584 = new C5584(this, str, c23198Arr, true);
                C5584 c5585 = (C5584) this.f42775.get(c5584);
                if (c5585 != null) {
                    return c5585;
                }
                this.f42774.add(c5584);
                this.f42775.put(c5584, c5584);
                return c5584;
            }
            return m34285(str);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final synchronized C5584 m34285(String str) {
        C5584 c5584 = (C5584) this.f42776.get(str);
        if (c5584 != null) {
            if (c5584.mo12361() || !c5584.getValue().equals(str)) {
                throw new RuntimeException("No-Style item from map has been modified.");
            }
            return c5584;
        }
        C5584 c5585 = new C5584(this, str);
        this.f42774.add(c5585);
        this.f42776.put(str, c5585);
        return c5585;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m34286() {
        boolean z = true;
        for (int i = 0; i < this.f42774.size(); i++) {
            C5584 c5584 = (C5584) this.f42774.get(i);
            if (c5584.mo12361()) {
                if (!z) {
                    LinkedList linkedList = new LinkedList();
                    LinkedList linkedList2 = new LinkedList();
                    for (C5584 c5585 : this.f42774) {
                        if (c5585.mo12361()) {
                            linkedList.add(c5585);
                        } else {
                            linkedList2.add(c5585);
                        }
                    }
                    this.f42774.clear();
                    this.f42774.addAll(linkedList);
                    this.f42774.addAll(linkedList2);
                    for (int i2 = 0; i2 < this.f42774.size(); i2++) {
                        ((C5584) this.f42774.get(i2)).f13491 = i2;
                    }
                    return;
                }
            } else if (z) {
                z = false;
            }
            c5584.f13491 = i;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m34283(String str) {
        for (int i = 0; i < this.f42774.size(); i++) {
            C5584 c5584 = (C5584) this.f42774.get(i);
            if (!c5584.mo12361() && c5584.getValue().equals(str)) {
                return i;
            }
        }
        C5584 c5585 = new C5584(this, str);
        this.f42774.add(c5585);
        this.f42776.put(str, c5585);
        return this.f42774.size() - 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m34277(C5584 c5584) {
        for (int i = 0; i < this.f42774.size(); i++) {
            if (this.f42774.get(i) == c5584) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34279(InterfaceC6631 interfaceC6631, boolean z, C20689 c20689) {
        int[] iArr;
        long j;
        ArrayList arrayList;
        int i;
        int[] iArr2;
        long j2;
        int i2;
        long j3;
        if (z) {
            m34286();
        } else {
            for (int i3 = 0; i3 < this.f42774.size(); i3++) {
                ((C5584) this.f42774.get(i3)).f13491 = i3;
            }
        }
        int i4 = 1;
        interfaceC6631.mo15111((short) 1);
        interfaceC6631.mo15111((short) 28);
        long position = interfaceC6631.getPosition();
        interfaceC6631.mo15114();
        int size = this.f42774.size();
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC5763 interfaceC5763 : m50187()) {
            if (!interfaceC5763.mo12361()) {
                break;
            } else {
                arrayList2.add(interfaceC5763.getStyle());
            }
        }
        boolean z2 = this.f42773;
        if (!z2) {
            iArr = null;
            break;
        }
        iArr = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            String value = getItem(i5).getValue();
            long jM18153 = C7855.m18153(value, true);
            if (value.length() > 32767 || jM18153 > 32767) {
                z2 = false;
                iArr = null;
                break;
            }
            iArr[i5] = (int) jM18153;
        }
        interfaceC6631.writeInt(size);
        interfaceC6631.writeInt(arrayList2.size());
        interfaceC6631.writeInt(z2 ? 256 : 0);
        long j4 = size;
        int iM34273 = m34273(((((long) arrayList2.size()) + j4) * 4) + 28, "strings offset");
        interfaceC6631.writeInt(iM34273);
        long position2 = interfaceC6631.getPosition();
        interfaceC6631.mo15114();
        interfaceC6631.skipBytes(m34273(j4 * 4, "string offset array size"));
        interfaceC6631.skipBytes(m34273(((long) arrayList2.size()) * 4, "style offset array size"));
        int[] iArr3 = new int[size];
        if (z2) {
            C22721 c22721 = new C22721(interfaceC6631);
            int i6 = 0;
            j2 = 0;
            while (i6 < size) {
                int i7 = iM34273;
                if (c20689 != null) {
                    c20689.m46754(1);
                }
                iArr3[i6] = m34273(j2, "string offset");
                String value2 = getItem(i6).getValue();
                long j5 = position;
                int length = value2.length();
                int i8 = iArr[i6];
                int i9 = size;
                long j6 = i8;
                m34273(((long) (m34276(length) + m34276(i8))) + j6 + 1 + j2, "string data size");
                long jM34274 = j2 + ((long) m34274(interfaceC6631, length)) + ((long) m34274(interfaceC6631, i8));
                C7855.m18157((InterfaceC4343) c22721, (CharSequence) value2, true);
                interfaceC6631.writeByte(0);
                j2 = jM34274 + j6 + 1;
                i6++;
                iM34273 = i7;
                size = i9;
                iArr = iArr;
                position = j5;
                iArr3 = iArr3;
                arrayList2 = arrayList2;
            }
            j = position;
            arrayList = arrayList2;
            i = iM34273;
            iArr2 = iArr3;
        } else {
            j = position;
            arrayList = arrayList2;
            i = iM34273;
            iArr2 = iArr3;
            int i10 = 0;
            j2 = 0;
            while (i10 < size) {
                if (c20689 != null) {
                    c20689.m46754(i4);
                }
                iArr2[i10] = m34273(j2, "string offset");
                String value3 = getItem(i10).getValue();
                int length2 = value3.length();
                if (length2 < 0) {
                    throw new IOException(C20778.m46922(length2, "UTF-16 string length is out of range: "));
                }
                long j7 = ((long) length2) * 2;
                m34273(((long) (length2 <= 32767 ? 2 : 4)) + j7 + 2 + j2, "string data size");
                if (length2 < 0) {
                    throw new IOException(C20778.m46922(length2, "UTF-16 string length is out of range: "));
                }
                if (length2 <= 32767) {
                    interfaceC6631.mo15111((short) length2);
                    i2 = 2;
                } else {
                    interfaceC6631.mo15111((short) ((length2 >>> 16) | 32768));
                    interfaceC6631.mo15111((short) (65535 & length2));
                    i2 = 4;
                }
                long j8 = j2 + ((long) i2);
                for (int i11 = 0; i11 < length2; i11++) {
                    interfaceC6631.mo15109(value3.charAt(i11));
                }
                interfaceC6631.mo15111((short) 0);
                j2 = j8 + j7 + 2;
                i10++;
                i4 = 1;
            }
        }
        int i12 = (int) (j2 % 4);
        if (i12 != 0) {
            int i13 = 4 - i12;
            for (int i14 = 0; i14 < i13; i14++) {
                interfaceC6631.writeByte(0);
                j2++;
            }
        }
        int iM34274 = m34273(j2, "string data size");
        int size2 = arrayList.size();
        int[] iArr4 = new int[size2];
        if (size2 > 0) {
            long jM23418 = 0;
            for (int i15 = 0; i15 < size2; i15++) {
                iArr4[i15] = m34273(jM23418, "style offset");
                int[] iArr5 = (int[]) arrayList.get(i15);
                jM23418 = C10050.m23418(iArr5.length, 4L, 4L, jM23418);
                m34273(jM23418, "style data size");
                interfaceC6631.mo15112(iArr5);
                interfaceC6631.writeInt(-1);
            }
            j3 = jM23418 + 8;
            m34273(j3, "style data size");
            interfaceC6631.writeInt(-1);
            interfaceC6631.writeInt(-1);
        } else {
            j3 = 0;
        }
        m34273(j3, "style data size");
        long position3 = interfaceC6631.getPosition();
        long j9 = j;
        interfaceC6631.seek(j9);
        interfaceC6631.writeInt(m34273((position3 - j9) + 4, "string pool chunk size"));
        interfaceC6631.seek(position2);
        interfaceC6631.writeInt(arrayList.isEmpty() ? 0 : m34273(((long) i) + ((long) iM34274), "style offset"));
        interfaceC6631.mo15112(iArr2);
        interfaceC6631.mo15112(iArr4);
        interfaceC6631.seek(position3);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m34274(InterfaceC6631 interfaceC6631, int i) throws IOException {
        if (i < 0 || i > 32767) {
            throw new IOException(C20778.m46922(i, "UTF-8 string length is out of range: "));
        }
        if (i <= 127) {
            interfaceC6631.writeByte(i);
            return 1;
        }
        interfaceC6631.writeByte((i >>> 8) | 128);
        interfaceC6631.writeByte(i & 255);
        return 2;
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m34276(int i) throws IOException {
        if (i < 0 || i > 32767) {
            throw new IOException(C20778.m46922(i, "UTF-8 string length is out of range: "));
        }
        return i <= 127 ? 1 : 2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m34273(long j, String str) throws IOException {
        if (j >= 0 && j <= 2147483647L) {
            return (int) j;
        }
        throw new IOException(str + " is too large: " + j);
    }
}
