package p067l;

import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C11442 implements AutoCloseable {

    /* JADX INFO: renamed from: ۛ */
    public final C14279[] f31899;

    /* JADX INFO: renamed from: ۟ */
    public boolean f31900;

    /* JADX INFO: renamed from: ۤ */
    public final DataInput f31901;

    /* JADX INFO: renamed from: ۬ */
    public InterfaceC8759 f31904;

    /* JADX INFO: renamed from: ܰ */
    public final C23179 f31905;

    /* JADX INFO: renamed from: ᩶ */
    public final C7574 f31906;

    /* JADX INFO: renamed from: ᩸ */
    public final C18817 f31907;

    /* JADX INFO: renamed from: ᩺ */
    public long f31909;

    /* JADX INFO: renamed from: ᩹ */
    public final C22841 f31908 = new C22841();

    /* JADX INFO: renamed from: ۙ */
    public final ArrayList f31898 = new ArrayList();

    /* JADX INFO: renamed from: ۗ */
    public final ArrayList f31897 = new ArrayList();

    /* JADX INFO: renamed from: ۫ */
    public C10967[] f31903 = new C10967[0];

    /* JADX INFO: renamed from: ֫֫ */
    public boolean[] f31896 = new boolean[0];

    /* JADX INFO: renamed from: ۨ */
    public C8088[] f31902 = new C8088[0];

    /* JADX INFO: renamed from: ֫ */
    public static /* bridge */ /* synthetic */ C22841 m26429(C11442 c11442) {
        return c11442.f31908;
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* bridge */ /* synthetic */ C8088[] m26430(C11442 c11442) {
        return c11442.f31902;
    }

    public C11442(C7574 c7574, DataInput dataInput, C14279[] c14279Arr, C23179 c23179, C18817 c18817) {
        this.f31906 = c7574;
        this.f31901 = dataInput;
        this.f31899 = c14279Arr;
        this.f31905 = c23179;
        this.f31907 = c18817;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m26435() throws IOException {
        DataInput dataInput = this.f31901;
        int i = dataInput.readInt();
        if (i < 0 || i > 1048576) {
            throw C19644.m44613("Invalid delta table size");
        }
        long jM47390 = C21026.m47390(i);
        C18817 c18817 = this.f31907;
        c18817.m42870(jM47390);
        this.f31903 = new C10967[i];
        this.f31896 = new boolean[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = dataInput.readInt();
            if (i3 <= 0) {
                throw C19644.m44613("Invalid delta table payload length");
            }
            C10967[] c10967Arr = this.f31903;
            int iMin = Math.min(65536, i3);
            byte[] bArr = new byte[iMin];
            C10967 c10967M47404 = null;
            C23179 c23179 = this.f31905;
            if (c23179 == null) {
                long j = (((long) i3) + 65535) / 65536;
                if (j > 1) {
                    c18817.m42870(C21026.m47390(j - 1));
                }
                while (i3 > 0) {
                    int iMin2 = Math.min(iMin, i3);
                    dataInput.readFully(bArr, 0, iMin2);
                    c10967M47404 = C21026.m47435(c10967M47404, this.f31908.m51042(iMin2, bArr));
                    i3 -= iMin2;
                }
            } else {
                if (this.f31904 == null) {
                    this.f31904 = c23179.m51629();
                }
                InterfaceC16134 interfaceC16134Mo20242 = this.f31904.mo20242(i3);
                int i4 = i3;
                while (i4 > 0) {
                    int iMin3 = Math.min(iMin, i4);
                    dataInput.readFully(bArr, 0, iMin3);
                    interfaceC16134Mo20242.mo33976(iMin3, bArr);
                    i4 -= iMin3;
                }
                interfaceC16134Mo20242.finish();
                if (interfaceC16134Mo20242.position() != i3) {
                    throw C19644.m44613("Incomplete delta table payload");
                }
                InterfaceC20315 interfaceC20315Mo33975 = interfaceC16134Mo20242.mo33975();
                C12826.requireNonNull(interfaceC20315Mo33975, "checkpoint delta source");
                this.f31898.add(interfaceC20315Mo33975);
                c10967M47404 = C21026.m47404(new C22367(interfaceC20315Mo33975, 0, i3, null));
            }
            c10967Arr[i2] = c10967M47404;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m26436() throws IOException {
        DataInput dataInput = this.f31901;
        int i = dataInput.readInt();
        if (i >= 0) {
            int i2 = 1048576;
            if (i <= 1048576) {
                long j = ((long) i) * 24;
                C18817 c18817 = this.f31907;
                c18817.m42870(16 + j);
                ArrayList arrayList = this.f31897;
                arrayList.ensureCapacity(i);
                this.f31909 = j;
                String str = "Replacement recipe table exceeds memory limit";
                long j2 = 67108864;
                if (j > 67108864) {
                    throw C19644.m44613("Replacement recipe table exceeds memory limit");
                }
                this.f31902 = new C8088[i];
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
                            long jM55743 = C0892.m55743(this.f31909, C0892.m55743(j3, 64L));
                            this.f31909 = jM55743;
                            if (jM55743 > 67108864) {
                                throw C19644.m44613(str2);
                            }
                            c18817.m42870(C0892.m55743(j3, 64L));
                            byte[] bArr = new byte[i7];
                            dataInput.readFully(bArr);
                            int i8 = dataInput.readInt();
                            if (i8 <= 0 || i8 > i2) {
                                throw C19644.m44613("Invalid replacement recipe index size");
                            }
                            c18817.m42870(C19644.m44560(i8));
                            AbstractC12979[] abstractC12979Arr = new AbstractC12979[i8];
                            long[] jArr = new long[i8];
                            long jM55744 = 0;
                            int iMo23869 = -1;
                            int i9 = 0;
                            long jM55745 = 0;
                            while (i9 < i8) {
                                int i10 = i;
                                byte[] bArr2 = bArr;
                                AbstractC12979 abstractC12979M29749 = AbstractC12979.m29749(dataInput, 0, c18817);
                                int iMo238610 = abstractC12979M29749.mo23869(0);
                                if (iMo238610 < 0 || (i9 != 0 && iMo238610 <= iMo23869)) {
                                    throw C19644.m44613("Replacement recipe starts are not sorted");
                                }
                                iMo23869 = abstractC12979M29749.mo23869(abstractC12979M29749.mo23868() - 1);
                                DataInput dataInput2 = dataInput;
                                jM55744 = C0892.m55743(jM55744, abstractC12979M29749.mo23860());
                                if (C19644.m44562(i8, jM55744) > 67108864) {
                                    throw C19644.m44613("Replacement recipe index exceeds memory limit");
                                }
                                jM55745 = C0892.m55743(jM55745, abstractC12979M29749.mo23868());
                                abstractC12979Arr[i9] = abstractC12979M29749;
                                jArr[i9] = jM55745;
                                i9++;
                                i = i10;
                                bArr = bArr2;
                                dataInput = dataInput2;
                            }
                            DataInput dataInput3 = dataInput;
                            int i11 = i;
                            byte[] bArr3 = bArr;
                            C14793 c14793 = new C14793(abstractC12979Arr, jArr, jM55745, C19644.m44562(i8, jM55744));
                            long jM55746 = C0892.m55743(this.f31909, c14793.m33766());
                            this.f31909 = jM55746;
                            if (jM55746 > 67108864) {
                                throw C19644.m44613(str2);
                            }
                            C8088 c8088 = new C8088(m26431(i4, dataInput3.readInt(), i3), i4, i5, i6, bArr3, c14793);
                            this.f31902[i3] = c8088;
                            arrayList2.add(c8088);
                            i3++;
                            i2 = 1048576;
                            j2 = 67108864;
                            str = str2;
                            i = i11;
                            arrayList = arrayList2;
                            dataInput = dataInput3;
                        }
                    }
                    throw C19644.m44613("Invalid replacement recipe header");
                }
                return;
            }
        }
        throw C19644.m44613("Invalid recipe table size");
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10967 m26431(int i, int i2, int i3) throws IOException {
        long j;
        C8088 c8088;
        C10967 c10967M47404;
        int i4;
        int i5;
        C10967 c10967M47405;
        int i6 = i;
        int i7 = i2;
        if (i7 < 0 || (i6 != 0 ? i7 == 0 || i7 > i6 : i7 != 0)) {
            throw C19644.m44613("Invalid extent count");
        }
        if (C21026.m47390(i7) > 67108864) {
            throw C19644.m44613("Span structure exceeds memory limit");
        }
        C10967 c10967M47435 = null;
        long j2 = 0;
        int i8 = 0;
        while (i8 < i7) {
            DataInput dataInput = this.f31901;
            int unsignedByte = dataInput.readUnsignedByte();
            int i9 = (int) (((long) i6) - j2);
            C14279[] c14279Arr = this.f31899;
            C18817 c18817 = this.f31907;
            if (unsignedByte == 1) {
                int i10 = dataInput.readInt();
                i5 = dataInput.readInt();
                C19644.m44578(i5, i9);
                long j3 = ((long) i10) + ((long) i5);
                if (i10 >= 0) {
                    C7574 c7574 = this.f31906;
                    j = j2;
                    if (j3 <= c7574.length()) {
                        c18817.m42870(C21026.m47390(1L));
                        c10967M47405 = C21026.m47404(new C22367(c7574, i10, i5, C19013.m43164(dataInput, i10, i5, c14279Arr, c18817)));
                    }
                }
                throw C19644.m44613("BASE range is outside source");
            }
            j = j2;
            if (unsignedByte == 2) {
                int i11 = dataInput.readInt();
                if (i11 >= 0) {
                    C10967[] c10967Arr = this.f31903;
                    if (i11 < c10967Arr.length) {
                        c10967M47404 = c10967Arr[i11];
                        i4 = c10967M47404 == null ? 0 : c10967M47404.f30368;
                        C19644.m44578(i4, i9);
                        if (this.f31896[i11]) {
                            c18817.m42870(C21026.m47414(c10967M47404));
                        }
                        this.f31896[i11] = true;
                    }
                }
                throw C19644.m44613("Invalid delta identity");
            }
            if (unsignedByte == 3) {
                byte b = dataInput.readByte();
                i5 = dataInput.readInt();
                C19644.m44578(i5, i9);
                c18817.m42870(C21026.m47390(1L));
                c10967M47405 = C21026.m47403(new C21500(b, i5));
            } else if (unsignedByte == 5) {
                byte b2 = dataInput.readByte();
                i5 = dataInput.readInt();
                C19644.m44578(i5, i9);
                c18817.m42870(C21026.m47390(1L));
                C19013 c19013M43164 = C19013.m43164(dataInput, 0, i5, c14279Arr, c18817);
                if (c19013M43164 == null) {
                    throw C19644.m44613("Patched FILL has no patches");
                }
                c10967M47405 = C21026.m47404(new C22367(new C21500(b2, i5), 0, i5, c19013M43164));
            } else {
                if (unsignedByte != 4) {
                    throw C19644.m44613(C20778.m46922(unsignedByte, "Unknown extent tag "));
                }
                int i12 = dataInput.readInt();
                int i13 = dataInput.readInt();
                int i14 = dataInput.readInt();
                C19644.m44578(i14, i9);
                if (i12 < 0 || i12 >= i3 || (c8088 = this.f31902[i12]) == null || i13 < 0 || ((long) i13) + ((long) i14) > c8088.length()) {
                    throw C19644.m44613("Invalid replacement recipe extent");
                }
                C19013 c19013M43165 = C19013.m43164(dataInput, i13, i14, c14279Arr, c18817);
                c18817.m42870(C21026.m47390(1L));
                c10967M47404 = C21026.m47404(new C22367(this.f31902[i12], i13, i14, c19013M43165));
                i4 = i14;
            }
            c10967M47435 = C21026.m47435(c10967M47435, c10967M47404);
            j2 = j + ((long) i4);
            i8++;
            i6 = i;
            i7 = i2;
            c10967M47404 = c10967M47405;
            i4 = i5;
            c10967M47435 = C21026.m47435(c10967M47435, c10967M47404);
            j2 = j + ((long) i4);
            i8++;
            i6 = i;
            i7 = i2;
        }
        if (j2 == i6) {
            return c10967M47435;
        }
        throw C19644.m44613("Extent lengths do not match document length");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26433(C10967 c10967) throws IOException {
        ArrayList arrayList = new ArrayList();
        C19644.m44618(c10967, arrayList);
        IdentityHashMap identityHashMap = new IdentityHashMap();
        ArrayDeque arrayDeque = new ArrayDeque(arrayList);
        while (!arrayDeque.isEmpty()) {
            C8088 c8088 = (C8088) arrayDeque.pop();
            if (identityHashMap.put(c8088, Boolean.TRUE) == null) {
                arrayList.clear();
                C19644.m44618(c8088.f21331, arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayDeque.push((C8088) it.next());
                }
            }
        }
        if (identityHashMap.size() != this.f31902.length) {
            throw C19644.m44613("Unreachable replacement recipe definition");
        }
        for (boolean z : this.f31896) {
            if (!z) {
                throw C19644.m44613("Unreachable delta definition");
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26432() {
        InterfaceC8759 interfaceC8759 = this.f31904;
        if (interfaceC8759 != null) {
            interfaceC8759.finish();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26434(C19644 c19644) {
        if (this.f31900) {
            throw new IllegalStateException("Checkpoint sources already transferred");
        }
        ArrayList arrayList = this.f31898;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c19644.f59759.put((InterfaceC20315) it.next(), Boolean.TRUE);
        }
        ArrayList arrayList2 = this.f31897;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            c19644.f59759.put((C8088) it2.next(), Boolean.TRUE);
        }
        InterfaceC8759 interfaceC8759 = this.f31904;
        if (interfaceC8759 != null) {
            interfaceC8759.mo20241();
        }
        arrayList.clear();
        arrayList2.clear();
        this.f31904 = null;
        this.f31900 = true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f31900) {
            return;
        }
        ArrayList arrayList = this.f31897;
        Throwable th = null;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            try {
                ((C8088) arrayList.get(size)).close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    th.addSuppressed(th2);
                }
            }
        }
        arrayList.clear();
        this.f31898.clear();
        InterfaceC8759 interfaceC8759 = this.f31904;
        if (interfaceC8759 != null) {
            try {
                interfaceC8759.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                } else {
                    th.addSuppressed(th3);
                }
            }
            this.f31904 = null;
        }
        if (th == null) {
            return;
        }
        C19644.m44581(th);
        throw null;
    }
}
