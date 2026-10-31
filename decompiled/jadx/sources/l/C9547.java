package l;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C9547 implements AutoCloseable {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C12532[] f28953;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f28954;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final DataInput f28955;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InterfaceC6724 f28958;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21896 f28959;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C5477 f28960;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C17307 f28961;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f28963;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C21541 f28962 = new C21541();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f28952 = new ArrayList();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ArrayList f28951 = new ArrayList();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C9047[] f28957 = new C9047[0];

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean[] f28950 = new boolean[0];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C6018[] f28956 = new C6018[0];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ C21541 m24418(C9547 c9547) {
        return c9547.f28962;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ C6018[] m24419(C9547 c9547) {
        return c9547.f28956;
    }

    public C9547(C5477 c5477, DataInput dataInput, C12532[] c12532Arr, C21896 c21896, C17307 c17307) {
        this.f28960 = c5477;
        this.f28955 = dataInput;
        this.f28953 = c12532Arr;
        this.f28959 = c21896;
        this.f28961 = c17307;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m24424() throws IOException {
        DataInput dataInput = this.f28955;
        int i = dataInput.readInt();
        if (i < 0 || i > 1048576) {
            throw C18177.m42352("Invalid delta table size");
        }
        long jM45094 = C19631.m45094(i);
        C17307 c17307 = this.f28961;
        c17307.m40619(jM45094);
        this.f28957 = new C9047[i];
        this.f28950 = new boolean[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = dataInput.readInt();
            if (i3 <= 0) {
                throw C18177.m42352("Invalid delta table payload length");
            }
            C9047[] c9047Arr = this.f28957;
            int iMin = Math.min(65536, i3);
            byte[] bArr = new byte[iMin];
            C9047 c9047M45108 = null;
            C21896 c21896 = this.f28959;
            if (c21896 == null) {
                long j = (((long) i3) + 65535) / 65536;
                if (j > 1) {
                    c17307.m40619(C19631.m45094(j - 1));
                }
                while (i3 > 0) {
                    int iMin2 = Math.min(iMin, i3);
                    dataInput.readFully(bArr, 0, iMin2);
                    c9047M45108 = C19631.m45139(c9047M45108, this.f28962.m48697(iMin2, bArr));
                    i3 -= iMin2;
                }
            } else {
                if (this.f28958 == null) {
                    this.f28958 = c21896.m49276();
                }
                InterfaceC14484 interfaceC14484Mo18294 = this.f28958.mo18294(i3);
                int i4 = i3;
                while (i4 > 0) {
                    int iMin3 = Math.min(iMin, i4);
                    dataInput.readFully(bArr, 0, iMin3);
                    interfaceC14484Mo18294.mo31883(iMin3, bArr);
                    i4 -= iMin3;
                }
                interfaceC14484Mo18294.finish();
                if (interfaceC14484Mo18294.position() != i3) {
                    throw C18177.m42352("Incomplete delta table payload");
                }
                InterfaceC18883 interfaceC18883Mo31882 = interfaceC14484Mo18294.mo31882();
                C11003.requireNonNull(interfaceC18883Mo31882, "checkpoint delta source");
                this.f28952.add(interfaceC18883Mo31882);
                c9047M45108 = C19631.m45108(new C21042(interfaceC18883Mo31882, 0, i3, null));
            }
            c9047Arr[i2] = c9047M45108;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m24425() throws IOException {
        DataInput dataInput = this.f28955;
        int i = dataInput.readInt();
        if (i >= 0) {
            int i2 = 1048576;
            if (i <= 1048576) {
                long j = ((long) i) * 24;
                C17307 c17307 = this.f28961;
                c17307.m40619(16 + j);
                ArrayList arrayList = this.f28951;
                arrayList.ensureCapacity(i);
                this.f28963 = j;
                String str = "Replacement recipe table exceeds memory limit";
                long j2 = 67108864;
                if (j > 67108864) {
                    throw C18177.m42352("Replacement recipe table exceeds memory limit");
                }
                this.f28956 = new C6018[i];
                int i3 = 0;
                while (i3 < i) {
                    int i4 = dataInput.readInt();
                    int i5 = dataInput.readInt();
                    int i6 = dataInput.readInt();
                    int i7 = dataInput.readInt();
                    if (i4 >= 0 && i5 > 0 && i6 > 0 && i7 >= 0) {
                        long j3 = i7;
                        if (j3 <= j2) {
                            ArrayList arrayList2 = arrayList;
                            String str2 = str;
                            long jM3495 = C1005.m3495(this.f28963, C1005.m3495(j3, 64L));
                            this.f28963 = jM3495;
                            if (jM3495 > 67108864) {
                                throw C18177.m42352(str2);
                            }
                            c17307.m40619(C1005.m3495(j3, 64L));
                            byte[] bArr = new byte[i7];
                            dataInput.readFully(bArr);
                            int i8 = dataInput.readInt();
                            if (i8 <= 0 || i8 > i2) {
                                throw C18177.m42352("Invalid replacement recipe index size");
                            }
                            c17307.m40619(C18177.m42299(i8));
                            AbstractC11164[] abstractC11164Arr = new AbstractC11164[i8];
                            long[] jArr = new long[i8];
                            long jM3496 = 0;
                            int iMo21899 = -1;
                            int i9 = 0;
                            long jM3497 = 0;
                            while (i9 < i8) {
                                int i10 = i;
                                byte[] bArr2 = bArr;
                                AbstractC11164 abstractC11164M27687 = AbstractC11164.m27687(dataInput, 0, c17307);
                                int iMo218910 = abstractC11164M27687.mo21899(0);
                                if (iMo218910 < 0 || (i9 != 0 && iMo218910 <= iMo21899)) {
                                    throw C18177.m42352("Replacement recipe starts are not sorted");
                                }
                                iMo21899 = abstractC11164M27687.mo21899(abstractC11164M27687.mo21898() - 1);
                                DataInput dataInput2 = dataInput;
                                jM3496 = C1005.m3495(jM3496, abstractC11164M27687.mo21890());
                                if (C18177.m42301(i8, jM3496) > 67108864) {
                                    throw C18177.m42352("Replacement recipe index exceeds memory limit");
                                }
                                jM3497 = C1005.m3495(jM3497, abstractC11164M27687.mo21898());
                                abstractC11164Arr[i9] = abstractC11164M27687;
                                jArr[i9] = jM3497;
                                i9++;
                                i = i10;
                                bArr = bArr2;
                                dataInput = dataInput2;
                            }
                            DataInput dataInput3 = dataInput;
                            int i11 = i;
                            byte[] bArr3 = bArr;
                            C13073 c13073 = new C13073(abstractC11164Arr, jArr, jM3497, C18177.m42301(i8, jM3496));
                            long jM3498 = C1005.m3495(this.f28963, c13073.m31678());
                            this.f28963 = jM3498;
                            if (jM3498 > 67108864) {
                                throw C18177.m42352(str2);
                            }
                            C6018 c6018 = new C6018(m24420(i4, dataInput3.readInt(), i3), i4, i5, i6, bArr3, c13073);
                            this.f28956[i3] = c6018;
                            arrayList2.add(c6018);
                            i3++;
                            i2 = 1048576;
                            j2 = 67108864;
                            str = str2;
                            i = i11;
                            arrayList = arrayList2;
                            dataInput = dataInput3;
                        }
                    }
                    throw C18177.m42352("Invalid replacement recipe header");
                }
                return;
            }
        }
        throw C18177.m42352("Invalid recipe table size");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9047 m24420(int i, int i2, int i3) throws IOException {
        long j;
        C6018 c6018;
        C9047 c9047M45108;
        int i4;
        int i5;
        C9047 c9047M45109;
        int i6 = i;
        int i7 = i2;
        if (i7 < 0 || (i6 != 0 ? i7 == 0 || i7 > i6 : i7 != 0)) {
            throw C18177.m42352("Invalid extent count");
        }
        if (C19631.m45094(i7) > 67108864) {
            throw C18177.m42352("Span structure exceeds memory limit");
        }
        C9047 c9047M45139 = null;
        long j2 = 0;
        int i8 = 0;
        while (i8 < i7) {
            DataInput dataInput = this.f28955;
            int unsignedByte = dataInput.readUnsignedByte();
            int i9 = (int) (((long) i6) - j2);
            C12532[] c12532Arr = this.f28953;
            C17307 c17307 = this.f28961;
            if (unsignedByte == 1) {
                int i10 = dataInput.readInt();
                i5 = dataInput.readInt();
                C18177.m42317(i5, i9);
                long j3 = ((long) i10) + ((long) i5);
                if (i10 >= 0) {
                    C5477 c5477 = this.f28960;
                    j = j2;
                    if (j3 <= c5477.length()) {
                        c17307.m40619(C19631.m45094(1L));
                        c9047M45109 = C19631.m45108(new C21042(c5477, i10, i5, C17513.m40906(dataInput, i10, i5, c12532Arr, c17307)));
                    }
                }
                throw C18177.m42352("BASE range is outside source");
            }
            j = j2;
            if (unsignedByte == 2) {
                int i11 = dataInput.readInt();
                if (i11 >= 0) {
                    C9047[] c9047Arr = this.f28957;
                    if (i11 < c9047Arr.length) {
                        c9047M45108 = c9047Arr[i11];
                        i4 = c9047M45108 == null ? 0 : c9047M45108.f27431;
                        C18177.m42317(i4, i9);
                        if (this.f28950[i11]) {
                            c17307.m40619(C19631.m45118(c9047M45108));
                        }
                        this.f28950[i11] = true;
                    }
                }
                throw C18177.m42352("Invalid delta identity");
            }
            if (unsignedByte == 3) {
                byte b = dataInput.readByte();
                i5 = dataInput.readInt();
                C18177.m42317(i5, i9);
                c17307.m40619(C19631.m45094(1L));
                c9047M45109 = C19631.m45107(new C20130(b, i5));
            } else if (unsignedByte == 5) {
                byte b2 = dataInput.readByte();
                i5 = dataInput.readInt();
                C18177.m42317(i5, i9);
                c17307.m40619(C19631.m45094(1L));
                C17513 c17513M40906 = C17513.m40906(dataInput, 0, i5, c12532Arr, c17307);
                if (c17513M40906 == null) {
                    throw C18177.m42352("Patched FILL has no patches");
                }
                c9047M45109 = C19631.m45108(new C21042(new C20130(b2, i5), 0, i5, c17513M40906));
            } else {
                if (unsignedByte != 4) {
                    throw C18177.m42352(C19370.m44628(unsignedByte, "Unknown extent tag "));
                }
                int i12 = dataInput.readInt();
                int i13 = dataInput.readInt();
                int i14 = dataInput.readInt();
                C18177.m42317(i14, i9);
                if (i12 < 0 || i12 >= i3 || (c6018 = this.f28956[i12]) == null || i13 < 0 || ((long) i13) + ((long) i14) > c6018.length()) {
                    throw C18177.m42352("Invalid replacement recipe extent");
                }
                C17513 c17513M40907 = C17513.m40906(dataInput, i13, i14, c12532Arr, c17307);
                c17307.m40619(C19631.m45094(1L));
                c9047M45108 = C19631.m45108(new C21042(this.f28956[i12], i13, i14, c17513M40907));
                i4 = i14;
            }
            c9047M45139 = C19631.m45139(c9047M45139, c9047M45108);
            j2 = j + ((long) i4);
            i8++;
            i6 = i;
            i7 = i2;
            c9047M45108 = c9047M45109;
            i4 = i5;
            c9047M45139 = C19631.m45139(c9047M45139, c9047M45108);
            j2 = j + ((long) i4);
            i8++;
            i6 = i;
            i7 = i2;
        }
        if (j2 == i6) {
            return c9047M45139;
        }
        throw C18177.m42352("Extent lengths do not match document length");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24422(C9047 c9047) throws IOException {
        ArrayList arrayList = new ArrayList();
        C18177.m42357(c9047, arrayList);
        IdentityHashMap identityHashMap = new IdentityHashMap();
        ArrayDeque arrayDeque = new ArrayDeque(arrayList);
        while (!arrayDeque.isEmpty()) {
            C6018 c6018 = (C6018) arrayDeque.pop();
            if (identityHashMap.put(c6018, Boolean.TRUE) == null) {
                arrayList.clear();
                C18177.m42357(c6018.f18476, arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayDeque.push((C6018) it.next());
                }
            }
        }
        if (identityHashMap.size() != this.f28956.length) {
            throw C18177.m42352("Unreachable replacement recipe definition");
        }
        for (boolean z : this.f28950) {
            if (!z) {
                throw C18177.m42352("Unreachable delta definition");
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24421() {
        InterfaceC6724 interfaceC6724 = this.f28958;
        if (interfaceC6724 != null) {
            interfaceC6724.finish();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24423(C18177 c18177) {
        if (this.f28954) {
            throw new IllegalStateException("Checkpoint sources already transferred");
        }
        ArrayList arrayList = this.f28952;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c18177.f56546.put((InterfaceC18883) it.next(), Boolean.TRUE);
        }
        ArrayList arrayList2 = this.f28951;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            c18177.f56546.put((C6018) it2.next(), Boolean.TRUE);
        }
        InterfaceC6724 interfaceC6724 = this.f28958;
        if (interfaceC6724 != null) {
            interfaceC6724.mo18293();
        }
        arrayList.clear();
        arrayList2.clear();
        this.f28958 = null;
        this.f28954 = true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f28954) {
            return;
        }
        ArrayList arrayList = this.f28951;
        Throwable th = null;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            try {
                ((C6018) arrayList.get(size)).close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    th.addSuppressed(th2);
                }
            }
        }
        arrayList.clear();
        this.f28952.clear();
        InterfaceC6724 interfaceC6724 = this.f28958;
        if (interfaceC6724 != null) {
            try {
                interfaceC6724.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                } else {
                    th.addSuppressed(th3);
                }
            }
            this.f28958 = null;
        }
        if (th == null) {
            return;
        }
        C18177.m42320(th);
        throw null;
    }
}
