package p067l;

import bin.p000mt.plus.R;
import com.github.luben.zstd.RecyclingBufferPool;
import com.github.luben.zstd.ZstdInputStreamNoFinalizer;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ᩴ֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M9Q4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19891 implements InterfaceC2455 {

    /* JADX INFO: renamed from: ۬ */
    public static final byte[] f60424 = new byte[524288];

    /* JADX INFO: renamed from: ۗ */
    public final InterfaceC9866 f60425;

    /* JADX INFO: renamed from: ۙ */
    public HashMap f60426;

    /* JADX INFO: renamed from: ᩶ */
    public final ArrayList f60427 = new ArrayList();

    /* JADX INFO: renamed from: ᩸ */
    public final long f60428;

    /* JADX INFO: renamed from: ᩹ */
    public final int f60429;

    public C19891(InterfaceC9866 interfaceC9866) throws IOException {
        this.f60425 = interfaceC9866;
        int i = interfaceC9866.readInt();
        if (i != 1430352451) {
            throw new IOException(String.format("Incorrect magic: %08x", Integer.valueOf(i)));
        }
        long jReverseBytes = Long.reverseBytes(interfaceC9866.readLong());
        if (jReverseBytes != 2) {
            throw new IOException(C17588.m40051(jReverseBytes, "Unsupported payload version: "));
        }
        long jReverseBytes2 = Long.reverseBytes(interfaceC9866.readLong());
        if (jReverseBytes2 <= 0 || jReverseBytes2 > 2147483647L) {
            throw new IOException(C17588.m40051(jReverseBytes2, "Incorrect manifest length: "));
        }
        int iReverseBytes = Integer.reverseBytes(interfaceC9866.readInt());
        if (iReverseBytes <= 0) {
            throw new IOException(C20778.m46922(iReverseBytes, "Incorrect metadata signature length: "));
        }
        byte[] bArr = new byte[(int) jReverseBytes2];
        interfaceC9866.readFully(bArr);
        C4665 from = C4665.parseFrom(bArr);
        this.f60428 = jReverseBytes2 + 24 + ((long) iReverseBytes);
        int blockSize = from.getBlockSize();
        this.f60429 = blockSize;
        for (C10895 c10895 : from.getPartitionsList()) {
            if (c10895.hasPartitionName()) {
                Iterator it = c10895.getOperationsList().iterator();
                long numBlocks = 0;
                while (true) {
                    if (!it.hasNext()) {
                        this.f60427.add(new C15314(c10895, blockSize));
                        break;
                    }
                    C4189 c4189 = (C4189) it.next();
                    int i2 = C21903.f68911[c4189.getType().ordinal()];
                    if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
                        if (c4189.getDstExtentsCount() == 1 && c4189.getDstExtents(0).getStartBlock() == numBlocks) {
                            numBlocks += c4189.getDstExtents(0).getNumBlocks();
                        }
                    } else if (i2 == 5) {
                        Iterator it2 = c4189.getDstExtentsList().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                C14052 c14052 = (C14052) it2.next();
                                if (c14052.getStartBlock() == numBlocks) {
                                    numBlocks += c14052.getNumBlocks();
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
            System.out.println("check failed: " + c10895.getPartitionName());
        }
        if (this.f60427.isEmpty() && from.getPartitionsCount() > 0) {
            throw new IOException(C7050.m16224(R.string.MT_Protector));
        }
    }

    @Override // p067l.InterfaceC2455
    /* JADX INFO: renamed from: ᩶ۧ */
    public final List mo3448() {
        return this.f60427;
    }

    @Override // p067l.InterfaceC2455
    public final C15314 getEntry(String str) {
        HashMap map = this.f60426;
        if (map == null) {
            ArrayList<C15314> arrayList = this.f60427;
            map = new HashMap(arrayList.size());
            this.f60426 = map;
            for (C15314 c15314 : arrayList) {
                map.put(c15314.m34854(), c15314);
            }
        }
        return (C15314) map.get(str);
    }

    @Override // p067l.InterfaceC2455
    /* JADX INFO: renamed from: ᩷ */
    public final C15314 mo3449(String str) throws IOException {
        C15314 entry = getEntry(str);
        if (entry != null) {
            return entry;
        }
        throw new IOException(C21466.m48631("Entry not found: ", str));
    }

    @Override // p067l.InterfaceC2455
    /* JADX INFO: renamed from: ֫ */
    public final C19504 mo3446(C15314 c15314) {
        return new C19504(new C24584(this, c15314.f43705.getOperationsList().iterator(), this.f60429, this.f60428));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m45188(C19891 c19891, InterfaceC10503 interfaceC10503, AtomicReference atomicReference, C4189 c4189, C24618 c24618, FileChannel fileChannel, C18549 c18549, C15866 c15866) {
        try {
            if (!interfaceC10503.mo19744() && atomicReference.get() == null) {
                c19891.m45184(c4189, c19891.f60425, c24618, fileChannel, interfaceC10503, (byte[]) c18549.get(), (byte[]) c15866.get());
            }
        } catch (IOException e) {
            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
            }
        } catch (Throwable th) {
            IOException iOException = new IOException(th);
            while (!atomicReference.compareAndSet(null, iOException) && atomicReference.get() == null) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r21v0, types: [l.ܳ֨᩻] */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r22v0, types: [l.ܿ֨᩻] */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2 */
    @Override // p067l.InterfaceC2455
    /* JADX INFO: renamed from: ֫ */
    public final void mo3447(C15314 c15314, C24618 c24618, final InterfaceC10503 interfaceC10503) throws IOException {
        C16258 c16258;
        final ?? r21;
        final ?? r22;
        C10895 c10895 = c15314.f43705;
        if (c10895.hasNewPartitionInfo()) {
            C16258 newPartitionInfo = c10895.getNewPartitionInfo();
            if (newPartitionInfo.hasSize() && newPartitionInfo.hasHash()) {
                if (newPartitionInfo.getSize() != c15314.m34855() || newPartitionInfo.getHash().size() != 32) {
                    throw new IOException("Invalid partition verification metadata: " + c15314.m34854());
                }
                c16258 = newPartitionInfo;
            } else {
                c16258 = null;
            }
        } else {
            c16258 = null;
        }
        c24618.setLength(0L);
        InterfaceC4502 interfaceC4502Mo23138 = c24618.mo23138();
        final FileChannel fileChannelMo9518 = interfaceC4502Mo23138.mo9518();
        boolean z = fileChannelMo9518 != null && interfaceC4502Mo23138.mo9523();
        int i = this.f60429;
        final C9280 c9280 = new C9280();
        ThreadLocal threadLocal = new ThreadLocal() { // from class: l.ܿ֨᩻
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                c9280.getClass();
                return new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
            }
        };
        final C3797 c3797 = new C3797();
        ThreadLocal threadLocal2 = new ThreadLocal() { // from class: l.ܳ֨᩻
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                c3797.getClass();
                return new byte[524288];
            }
        };
        ExecutorService executorService = C4081.f8990;
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C19110.f57020);
        final AtomicReference atomicReference = new AtomicReference();
        ArrayList arrayList = new ArrayList();
        C24618 c24619 = c24618;
        final C19891 c19891 = this;
        ?? r14 = threadLocal2;
        ?? r15 = threadLocal;
        for (final C4189 c4189 : c10895.getOperationsList()) {
            if (c4189.getType() == EnumC9358.ZERO) {
                arrayList.add(c4189);
                r21 = r14;
                r22 = r15;
            } else {
                r21 = r14;
                r22 = r15;
                final C24618 c246110 = c24619;
                executorServiceNewFixedThreadPool.submit(new Runnable() { // from class: l.ۧ֨᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        C19891.m45188(this.f35091, interfaceC10503, atomicReference, c4189, c246110, fileChannelMo9518, r22, r21);
                    }
                });
                c24619 = c24618;
                c19891 = this;
            }
            arrayList = arrayList;
            r14 = r21;
            r15 = r22;
        }
        ArrayList arrayList2 = arrayList;
        C4081.m8189(executorServiceNewFixedThreadPool);
        if (interfaceC10503.mo19744()) {
            return;
        }
        if (atomicReference.get() != null) {
            throw ((IOException) atomicReference.get());
        }
        try {
            m45186(c15314, c24618, interfaceC10503, fileChannelMo9518, z, arrayList2, i);
            if (interfaceC10503.mo19744() || c16258 == null) {
                return;
            }
            long size = c16258.getSize();
            byte[] bArrM18429 = c16258.getHash().m18429();
            C20689 c20689 = new C20689(Math.max(size, 1L));
            c20689.m46753(new C24878(3, interfaceC10503));
            c20689.m46754(0);
            c24618.flush();
            long length = c24618.length();
            if (length != size) {
                StringBuilder sbM33191 = C14536.m33191("Extracted partition size mismatch: expected ", ", actual ", size);
                sbM33191.append(length);
                sbM33191.append(" (");
                sbM33191.append(c15314.m34854());
                sbM33191.append(')');
                throw new IOException(sbM33191.toString());
            }
            MessageDigest messageDigestM36668 = C16111.m36668();
            int i2 = 524288;
            byte[] bArr = new byte[524288];
            long j = 0;
            c24618.seek(0L);
            long j2 = size;
            while (j2 > j) {
                if (interfaceC10503.mo19744()) {
                    return;
                }
                int iMin = (int) Math.min(j2, i2);
                c24618.m54256(bArr, 0, iMin);
                messageDigestM36668.update(bArr, 0, iMin);
                j2 -= (long) iMin;
                c20689.m46754(iMin);
                j = 0;
                i2 = 524288;
            }
            if (size == 0) {
                c20689.m46754(1);
            }
            if (MessageDigest.isEqual(bArrM18429, messageDigestM36668.digest())) {
                return;
            }
            throw new IOException("Partition SHA-256 mismatch: " + c15314.m34854());
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45189(C15314 c15314, final C24618 c24618, InterfaceC10503 interfaceC10503, int i) {
        ArrayList arrayList;
        int i2;
        boolean z;
        long dataLength;
        int i3;
        if (i <= 0 || i > 16) {
            throw new IOException("Download thread count must be between 1 and 16");
        }
        c24618.setLength(0L);
        InterfaceC4502 interfaceC4502Mo23138 = c24618.mo23138();
        final FileChannel fileChannelMo9518 = interfaceC4502Mo23138.mo9518();
        boolean z2 = fileChannelMo9518 != null && interfaceC4502Mo23138.mo9523();
        int i4 = this.f60429;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        long j = 0;
        for (C4189 c4189 : c15314.f43705.getOperationsList()) {
            if (c4189.getType() == EnumC9358.ZERO) {
                arrayList3.add(c4189);
            } else {
                long dataLength2 = c4189.getDataLength();
                if (dataLength2 < 0 || j > C14849.FOREVER_NS - dataLength2) {
                    throw new IOException("Payload operation data length overflow");
                }
                j += dataLength2;
                arrayList2.add(c4189);
            }
        }
        C8150.sort(arrayList2, C10162.comparingLong(new C17878()));
        final AtomicReference atomicReference = new AtomicReference();
        final C11174 c11174 = new C11174();
        C8491 c8491 = new C8491(interfaceC10503, atomicReference);
        int iMin = Math.min(i, arrayList2.size());
        if (iMin > 0) {
            ThreadPoolExecutor threadPoolExecutorM8185 = C4081.m8185(iMin);
            long j2 = j;
            int i5 = 0;
            int i6 = 0;
            while (i5 < iMin) {
                ThreadPoolExecutor threadPoolExecutor = threadPoolExecutorM8185;
                int i7 = iMin - i5;
                int i8 = iMin;
                if (i7 == 1) {
                    int size = arrayList2.size();
                    long dataLength3 = 0;
                    for (int i9 = i6; i9 < size; i9++) {
                        dataLength3 = ((C4189) arrayList2.get(i9)).getDataLength() + dataLength3;
                    }
                    dataLength = dataLength3;
                    i3 = size;
                } else {
                    long j3 = i7;
                    long j4 = (j2 / j3) + ((long) (j2 % j3 == 0 ? 0 : 1));
                    int size2 = (arrayList2.size() - i7) + 1;
                    int i10 = i6;
                    dataLength = 0;
                    while (i10 < size2 && (i10 == i6 || dataLength < j4)) {
                        dataLength = ((C4189) arrayList2.get(i10)).getDataLength() + dataLength;
                        i10++;
                    }
                    i3 = i10;
                }
                final int i11 = i6;
                final ArrayList arrayList4 = arrayList2;
                final int i12 = i3;
                ArrayList arrayList5 = arrayList2;
                final InterfaceC10503 interfaceC10504 = c8491;
                threadPoolExecutor.submit(new Runnable() { // from class: l.ᩳ֨᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        C19891.m45187(this.f57439, arrayList4, i11, i12, c24618, fileChannelMo9518, interfaceC10504, atomicReference, c11174);
                    }
                });
                j2 -= dataLength;
                i5++;
                c8491 = c8491;
                threadPoolExecutorM8185 = threadPoolExecutor;
                iMin = i8;
                i6 = i3;
                z2 = z2;
                arrayList3 = arrayList3;
                arrayList2 = arrayList5;
                i4 = i4;
            }
            ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutorM8185;
            C8491 c8492 = c8491;
            arrayList = arrayList3;
            i2 = i4;
            z = z2;
            threadPoolExecutor2.shutdown();
            while (!threadPoolExecutor2.awaitTermination(100L, TimeUnit.MILLISECONDS)) {
                try {
                    if (c8492.mo19744()) {
                        c11174.m25795();
                        threadPoolExecutor2.shutdownNow();
                    }
                } catch (InterruptedException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("Payload extraction was interrupted");
                    interruptedIOException.initCause(e);
                    while (!atomicReference.compareAndSet(null, interruptedIOException) && atomicReference.get() == null) {
                    }
                    c11174.m25795();
                    threadPoolExecutor2.shutdownNow();
                    while (!threadPoolExecutor2.isTerminated()) {
                        try {
                            threadPoolExecutor2.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                        }
                    }
                    Thread.currentThread().interrupt();
                    throw interruptedIOException;
                }
            }
        } else {
            arrayList = arrayList3;
            i2 = i4;
            z = z2;
        }
        if (interfaceC10503.mo19744()) {
            return;
        }
        IOException iOException = (IOException) atomicReference.get();
        if (iOException != null) {
            throw iOException;
        }
        try {
            m45186(c15314, c24618, interfaceC10503, fileChannelMo9518, z, arrayList, i2);
        } catch (IOException e2) {
            throw e2;
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00e8: INVOKE (r2v0 ?? I:l.ۢ֨᩻), (r13 I:l.۠ۖܽ) VIRTUAL call: l.ۢ֨᩻.ۧ(l.۠ۖܽ):void A[MD:(l.۠ۖܽ):void (m)] (LINE:579), block:B:86:0x00e8 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00eb: IF  (r13 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:145:?, block:B:87:0x00eb */
    /* JADX INFO: renamed from: ֫ */
    public static void m45187(C19891 c19891, ArrayList arrayList, int i, int i2, C24618 c24618, FileChannel fileChannel, InterfaceC10503 interfaceC10503, AtomicReference atomicReference, C11174 c11174) {
        C24618 c24618Mo23139;
        C24618 c24619;
        InterfaceC9866 interfaceC9866M25797;
        try {
            try {
                c24618Mo23139 = c19891.f60425.mo23139();
                try {
                    boolean zM25796 = c11174.m25796(c24618Mo23139);
                    if (zM25796) {
                        byte[] bArr = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
                        byte[] bArr2 = new byte[524288];
                        int i3 = i;
                        while (i3 < i2 && !((C8491) interfaceC10503).mo19744()) {
                            int i4 = i3;
                            c19891.m45184((C4189) arrayList.get(i3), c24618Mo23139, c24618, fileChannel, interfaceC10503, bArr, bArr2);
                            i3 = i4 + 1;
                        }
                        if (zM25796) {
                            c11174.m25797(c24618Mo23139);
                        }
                        try {
                            c24618Mo23139.close();
                            return;
                        } catch (IOException e) {
                            while (!atomicReference.compareAndSet(null, e)) {
                                if (atomicReference.get() != null) {
                                    return;
                                }
                            }
                        }
                    } else {
                        if (zM25796) {
                            c11174.m25797(c24618Mo23139);
                        }
                        try {
                            c24618Mo23139.close();
                            return;
                        } catch (IOException e2) {
                            while (!atomicReference.compareAndSet(null, e2)) {
                                if (atomicReference.get() != null) {
                                    return;
                                }
                            }
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    do {
                        if (atomicReference.compareAndSet(null, e)) {
                            c11174.m25795();
                            break;
                        }
                    } while (atomicReference.get() == null);
                    if (0 != 0) {
                        c11174.m25797(c24618Mo23139);
                    }
                    if (c24618Mo23139 == null) {
                        return;
                    }
                    try {
                        c24618Mo23139.close();
                        return;
                    } catch (IOException e4) {
                        while (!atomicReference.compareAndSet(null, e4)) {
                            if (atomicReference.get() != null) {
                                return;
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    IOException iOException = new IOException(th);
                    do {
                        if (atomicReference.compareAndSet(null, iOException)) {
                            c11174.m25795();
                            break;
                        }
                    } while (atomicReference.get() == null);
                    if (0 != 0) {
                        c11174.m25797(c24618Mo23139);
                    }
                    if (c24618Mo23139 == null) {
                        return;
                    }
                    try {
                        c24618Mo23139.close();
                        return;
                    } catch (IOException e5) {
                        while (!atomicReference.compareAndSet(null, e5)) {
                            if (atomicReference.get() != null) {
                                return;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                if (0 != 0) {
                    c11174.m25797(interfaceC9866M25797);
                }
                if (c24619 == null) {
                    throw th2;
                }
                try {
                    c24619.close();
                    throw th2;
                } catch (IOException e6) {
                    while (!atomicReference.compareAndSet(null, e6)) {
                        if (atomicReference.get() != null) {
                            throw th2;
                        }
                    }
                    c11174.m25795();
                    throw th2;
                }
            }
        } catch (IOException e7) {
            e = e7;
            c24618Mo23139 = null;
        } catch (Throwable th3) {
            th = th3;
            c24618Mo23139 = null;
        }
        c11174.m25795();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m45184(C4189 c4189, InterfaceC9866 interfaceC9866, C24618 c24618, FileChannel fileChannel, InterfaceC10503 interfaceC10503, byte[] bArr, byte[] bArr2) throws IOException {
        OutputStream c17207;
        long dataLength = c4189.getDataLength();
        long dataOffset = c4189.getDataOffset() + this.f60428;
        long startBlock = c4189.getDstExtents(0).getStartBlock();
        long j = this.f60429;
        long j2 = startBlock * j;
        InputStream c4468 = new C4468(interfaceC9866, dataOffset, dataLength);
        int i = C21903.f68911[c4189.getType().ordinal()];
        if (i != 1) {
            if (i == 2) {
                c4468 = new C11352(new C20300(c4468, bArr));
            } else if (i == 3) {
                c4468 = C3410.m6038(new C20300(c4468, bArr));
            } else if (i == 4) {
                c4468 = new ZstdInputStreamNoFinalizer(c4468, RecyclingBufferPool.INSTANCE);
            } else {
                throw new IOException("Unsupported operation type: " + c4189.getType().getNumber());
            }
        }
        try {
            long numBlocks = c4189.getDstExtents(0).getNumBlocks() * j;
            if (fileChannel == null) {
                c17207 = new C5809(j2, c24618);
            } else {
                c17207 = new C17207(fileChannel, j2);
            }
            m45183(c4468, c17207, interfaceC10503, bArr2, numBlocks);
            c4468.close();
        } catch (Throwable th) {
            try {
                c4468.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45186(C15314 c15314, C24618 c24618, InterfaceC10503 interfaceC10503, FileChannel fileChannel, boolean z, ArrayList arrayList, int i) throws IOException {
        if (z) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C4189) it.next()).getDstExtentsList().iterator();
                while (it2.hasNext()) {
                    long numBlocks = ((C14052) it2.next()).getNumBlocks() * ((long) i);
                    while (numBlocks > 0) {
                        int iMin = (int) Math.min(numBlocks, 524288);
                        synchronized (interfaceC10503) {
                            interfaceC10503.mo19742(iMin);
                        }
                        numBlocks -= (long) iMin;
                        if (interfaceC10503.mo19744()) {
                            break;
                        }
                    }
                }
                if (interfaceC10503.mo19744()) {
                    return;
                }
            }
            if (fileChannel.size() > c15314.m34855()) {
                throw new IOException("Extracted data exceeds entry size");
            }
            c24618.setLength(c15314.m34855());
            return;
        }
        if (fileChannel != null) {
            c24618.setLength(fileChannel.size());
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            m45185((C4189) it3.next(), c24618, interfaceC10503, i);
            if (interfaceC10503.mo19744()) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45183(InputStream inputStream, OutputStream outputStream, InterfaceC10503 interfaceC10503, byte[] bArr, long j) throws IOException {
        long j2 = 0;
        do {
            int i = inputStream.read(bArr);
            if (i == -1) {
                if (j2 == j) {
                    return;
                }
                StringBuilder sbM33191 = C14536.m33191("Operation size mismatch: expected ", ", actual ", j);
                sbM33191.append(j2);
                throw new IOException(sbM33191.toString());
            }
            long j3 = i;
            if (j3 > j - j2) {
                throw new IOException("Operation data exceeds destination extent");
            }
            synchronized (interfaceC10503) {
                interfaceC10503.mo19742(i);
            }
            outputStream.write(bArr, 0, i);
            j2 += j3;
        } while (!interfaceC10503.mo19744());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45185(C4189 c4189, C24618 c24618, InterfaceC10503 interfaceC10503, int i) {
        for (C14052 c14052 : c4189.getDstExtentsList()) {
            long j = i;
            long numBlocks = c14052.getNumBlocks() * j;
            synchronized (c24618) {
                c24618.seek(c14052.getStartBlock() * j);
                while (numBlocks > 0) {
                    byte[] bArr = f60424;
                    int iMin = (int) Math.min(numBlocks, 524288);
                    synchronized (interfaceC10503) {
                        interfaceC10503.mo19742(iMin);
                    }
                    c24618.write(bArr, 0, iMin);
                    numBlocks -= (long) iMin;
                    if (interfaceC10503.mo19744()) {
                        return;
                    }
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f60425.close();
    }
}
