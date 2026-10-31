package l;

import bin.mt.plus.R;
import com.github.luben.zstd.RecyclingBufferPool;
import com.github.luben.zstd.ZstdInputStreamNoFinalizer;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
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
public final class C18437 implements InterfaceC0091 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final byte[] f57206 = new byte[524288];

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7889 f57207;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f57208;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f57209 = new ArrayList();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f57210;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f57211;

    public C18437(InterfaceC7889 interfaceC7889) throws IOException {
        this.f57207 = interfaceC7889;
        int i = interfaceC7889.readInt();
        if (i != 1430352451) {
            throw new IOException(String.format("Incorrect magic: %08x", Integer.valueOf(i)));
        }
        long jReverseBytes = Long.reverseBytes(interfaceC7889.readLong());
        if (jReverseBytes != 2) {
            throw new IOException(C16014.m37865(jReverseBytes, "Unsupported payload version: "));
        }
        long jReverseBytes2 = Long.reverseBytes(interfaceC7889.readLong());
        if (jReverseBytes2 <= 0 || jReverseBytes2 > 2147483647L) {
            throw new IOException(C16014.m37865(jReverseBytes2, "Incorrect manifest length: "));
        }
        int iReverseBytes = Integer.reverseBytes(interfaceC7889.readInt());
        if (iReverseBytes <= 0) {
            throw new IOException(C19370.m44628(iReverseBytes, "Incorrect metadata signature length: "));
        }
        byte[] bArr = new byte[(int) jReverseBytes2];
        interfaceC7889.readFully(bArr);
        C2416 from = C2416.parseFrom(bArr);
        this.f57210 = jReverseBytes2 + 24 + ((long) iReverseBytes);
        int blockSize = from.getBlockSize();
        this.f57211 = blockSize;
        for (C8971 c8971 : from.getPartitionsList()) {
            if (c8971.hasPartitionName()) {
                Iterator it = c8971.getOperationsList().iterator();
                long numBlocks = 0;
                while (true) {
                    if (!it.hasNext()) {
                        this.f57209.add(new C13621(c8971, blockSize));
                        break;
                    }
                    C1915 c1915 = (C1915) it.next();
                    int i2 = C20554.f66230[c1915.getType().ordinal()];
                    if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
                        if (c1915.getDstExtentsCount() == 1 && c1915.getDstExtents(0).getStartBlock() == numBlocks) {
                            numBlocks += c1915.getDstExtents(0).getNumBlocks();
                        }
                    } else if (i2 == 5) {
                        Iterator it2 = c1915.getDstExtentsList().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                C12293 c12293 = (C12293) it2.next();
                                if (c12293.getStartBlock() == numBlocks) {
                                    numBlocks += c12293.getNumBlocks();
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
            System.out.println("check failed: " + c8971.getPartitionName());
        }
        if (this.f57209.isEmpty() && from.getPartitionsCount() > 0) {
            throw new IOException(C4925.m14327(R.string.MT_Protector));
        }
    }

    @Override // l.InterfaceC0091
    /* JADX INFO: renamed from: ᩶ۧ */
    public final List mo1052() {
        return this.f57209;
    }

    @Override // l.InterfaceC0091
    public final C13621 getEntry(String str) {
        HashMap map = this.f57208;
        if (map == null) {
            ArrayList<C13621> arrayList = this.f57209;
            map = new HashMap(arrayList.size());
            this.f57208 = map;
            for (C13621 c13621 : arrayList) {
                map.put(c13621.m32740(), c13621);
            }
        }
        return (C13621) map.get(str);
    }

    @Override // l.InterfaceC0091
    /* JADX INFO: renamed from: ᩷ */
    public final C13621 mo1053(String str) throws IOException {
        C13621 entry = getEntry(str);
        if (entry != null) {
            return entry;
        }
        throw new IOException(C20094.m46315("Entry not found: ", str));
    }

    @Override // l.InterfaceC0091
    /* JADX INFO: renamed from: ֫ */
    public final C18030 mo1050(C13621 c13621) {
        return new C18030(new C23375(this, c13621.f40625.getOperationsList().iterator(), this.f57211, this.f57210));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m42915(C18437 c18437, InterfaceC8559 interfaceC8559, AtomicReference atomicReference, C1915 c1915, C23411 c23411, FileChannel fileChannel, C17025 c17025, C14202 c14202) {
        try {
            if (!interfaceC8559.mo17797() && atomicReference.get() == null) {
                c18437.m42911(c1915, c18437.f57207, c23411, fileChannel, interfaceC8559, (byte[]) c17025.get(), (byte[]) c14202.get());
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
    @Override // l.InterfaceC0091
    /* JADX INFO: renamed from: ֫ */
    public final void mo1051(C13621 c13621, C23411 c23411, final InterfaceC8559 interfaceC8559) throws IOException {
        C14614 c14614;
        final ?? r21;
        final ?? r22;
        C8971 c8971 = c13621.f40625;
        if (c8971.hasNewPartitionInfo()) {
            C14614 newPartitionInfo = c8971.getNewPartitionInfo();
            if (newPartitionInfo.hasSize() && newPartitionInfo.hasHash()) {
                if (newPartitionInfo.getSize() != c13621.m32741() || newPartitionInfo.getHash().size() != 32) {
                    throw new IOException("Invalid partition verification metadata: " + c13621.m32740());
                }
                c14614 = newPartitionInfo;
            } else {
                c14614 = null;
            }
        } else {
            c14614 = null;
        }
        c23411.setLength(0L);
        InterfaceC2245 interfaceC2245Mo21173 = c23411.mo21173();
        final FileChannel fileChannelMo7436 = interfaceC2245Mo21173.mo7436();
        boolean z = fileChannelMo7436 != null && interfaceC2245Mo21173.mo7441();
        int i = this.f57211;
        final C7272 c7272 = new C7272();
        ThreadLocal threadLocal = new ThreadLocal() { // from class: l.ܿ֨᩻
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                c7272.getClass();
                return new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
            }
        };
        final C1503 c1503 = new C1503();
        ThreadLocal threadLocal2 = new ThreadLocal() { // from class: l.ܳ֨᩻
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                c1503.getClass();
                return new byte[524288];
            }
        };
        ExecutorService executorService = C1802.f6211;
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C17615.f53826);
        final AtomicReference atomicReference = new AtomicReference();
        ArrayList arrayList = new ArrayList();
        C23411 c23412 = c23411;
        final C18437 c18437 = this;
        ?? r14 = threadLocal2;
        ?? r15 = threadLocal;
        for (final C1915 c1915 : c8971.getOperationsList()) {
            if (c1915.getType() == EnumC7354.ZERO) {
                arrayList.add(c1915);
                r21 = r14;
                r22 = r15;
            } else {
                r21 = r14;
                r22 = r15;
                final C23411 c23413 = c23412;
                executorServiceNewFixedThreadPool.submit(new Runnable() { // from class: l.ۧ֨᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18437.m42915(this.f32120, interfaceC8559, atomicReference, c1915, c23413, fileChannelMo7436, r22, r21);
                    }
                });
                c23412 = c23411;
                c18437 = this;
            }
            arrayList = arrayList;
            r14 = r21;
            r15 = r22;
        }
        ArrayList arrayList2 = arrayList;
        C1802.m5992(executorServiceNewFixedThreadPool);
        if (interfaceC8559.mo17797()) {
            return;
        }
        if (atomicReference.get() != null) {
            throw ((IOException) atomicReference.get());
        }
        try {
            m42913(c13621, c23411, interfaceC8559, fileChannelMo7436, z, arrayList2, i);
            if (interfaceC8559.mo17797() || c14614 == null) {
                return;
            }
            long size = c14614.getSize();
            byte[] bArrM16503 = c14614.getHash().m16503();
            C19277 c19277 = new C19277(Math.max(size, 1L));
            c19277.m44459(new C23684(3, interfaceC8559));
            c19277.m44460(0);
            c23411.flush();
            long length = c23411.length();
            if (length != size) {
                StringBuilder sbM31106 = C12803.m31106("Extracted partition size mismatch: expected ", ", actual ", size);
                sbM31106.append(length);
                sbM31106.append(" (");
                sbM31106.append(c13621.m32740());
                sbM31106.append(')');
                throw new IOException(sbM31106.toString());
            }
            MessageDigest messageDigestM34534 = C14460.m34534();
            int i2 = 524288;
            byte[] bArr = new byte[524288];
            long j = 0;
            c23411.seek(0L);
            long j2 = size;
            while (j2 > j) {
                if (interfaceC8559.mo17797()) {
                    return;
                }
                int iMin = (int) Math.min(j2, i2);
                c23411.m51858(bArr, 0, iMin);
                messageDigestM34534.update(bArr, 0, iMin);
                j2 -= (long) iMin;
                c19277.m44460(iMin);
                j = 0;
                i2 = 524288;
            }
            if (size == 0) {
                c19277.m44460(1);
            }
            if (MessageDigest.isEqual(bArrM16503, messageDigestM34534.digest())) {
                return;
            }
            throw new IOException("Partition SHA-256 mismatch: " + c13621.m32740());
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42916(C13621 c13621, final C23411 c23411, InterfaceC8559 interfaceC8559, int i) {
        ArrayList arrayList;
        int i2;
        boolean z;
        long dataLength;
        int i3;
        if (i <= 0 || i > 16) {
            throw new IOException("Download thread count must be between 1 and 16");
        }
        c23411.setLength(0L);
        InterfaceC2245 interfaceC2245Mo21173 = c23411.mo21173();
        final FileChannel fileChannelMo7436 = interfaceC2245Mo21173.mo7436();
        boolean z2 = fileChannelMo7436 != null && interfaceC2245Mo21173.mo7441();
        int i4 = this.f57211;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        long j = 0;
        for (C1915 c1915 : c13621.f40625.getOperationsList()) {
            if (c1915.getType() == EnumC7354.ZERO) {
                arrayList3.add(c1915);
            } else {
                long dataLength2 = c1915.getDataLength();
                if (dataLength2 < 0 || j > C13132.FOREVER_NS - dataLength2) {
                    throw new IOException("Payload operation data length overflow");
                }
                j += dataLength2;
                arrayList2.add(c1915);
            }
        }
        C6083.sort(arrayList2, C8200.comparingLong(new C16319()));
        final AtomicReference atomicReference = new AtomicReference();
        final C9265 c9265 = new C9265();
        C6442 c6442 = new C6442(interfaceC8559, atomicReference);
        int iMin = Math.min(i, arrayList2.size());
        if (iMin > 0) {
            ThreadPoolExecutor threadPoolExecutorM5988 = C1802.m5988(iMin);
            long j2 = j;
            int i5 = 0;
            int i6 = 0;
            while (i5 < iMin) {
                ThreadPoolExecutor threadPoolExecutor = threadPoolExecutorM5988;
                int i7 = iMin - i5;
                int i8 = iMin;
                if (i7 == 1) {
                    int size = arrayList2.size();
                    long dataLength3 = 0;
                    for (int i9 = i6; i9 < size; i9++) {
                        dataLength3 = ((C1915) arrayList2.get(i9)).getDataLength() + dataLength3;
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
                        dataLength = ((C1915) arrayList2.get(i10)).getDataLength() + dataLength;
                        i10++;
                    }
                    i3 = i10;
                }
                final int i11 = i6;
                final ArrayList arrayList4 = arrayList2;
                final int i12 = i3;
                ArrayList arrayList5 = arrayList2;
                final InterfaceC8559 interfaceC85510 = c6442;
                threadPoolExecutor.submit(new Runnable() { // from class: l.ᩳ֨᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18437.m42914(this.f54247, arrayList4, i11, i12, c23411, fileChannelMo7436, interfaceC85510, atomicReference, c9265);
                    }
                });
                j2 -= dataLength;
                i5++;
                c6442 = c6442;
                threadPoolExecutorM5988 = threadPoolExecutor;
                iMin = i8;
                i6 = i3;
                z2 = z2;
                arrayList3 = arrayList3;
                arrayList2 = arrayList5;
                i4 = i4;
            }
            ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutorM5988;
            C6442 c6443 = c6442;
            arrayList = arrayList3;
            i2 = i4;
            z = z2;
            threadPoolExecutor2.shutdown();
            while (!threadPoolExecutor2.awaitTermination(100L, TimeUnit.MILLISECONDS)) {
                try {
                    if (c6443.mo17797()) {
                        c9265.m23786();
                        threadPoolExecutor2.shutdownNow();
                    }
                } catch (InterruptedException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("Payload extraction was interrupted");
                    interruptedIOException.initCause(e);
                    while (!atomicReference.compareAndSet(null, interruptedIOException) && atomicReference.get() == null) {
                    }
                    c9265.m23786();
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
        if (interfaceC8559.mo17797()) {
            return;
        }
        IOException iOException = (IOException) atomicReference.get();
        if (iOException != null) {
            throw iOException;
        }
        try {
            m42913(c13621, c23411, interfaceC8559, fileChannelMo7436, z, arrayList, i2);
        } catch (IOException e2) {
            throw e2;
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00e8: INVOKE (r2v0 ?? I:l.ۢ֨᩻), (r13 I:l.۠ۖܽ) VIRTUAL call: l.ۢ֨᩻.ۧ(l.۠ۖܽ):void A[MD:(l.۠ۖܽ):void (m)] (LINE:579), block:B:86:0x00e8 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00eb: IF  (r13 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:145:?, block:B:87:0x00eb */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42914(C18437 c18437, ArrayList arrayList, int i, int i2, C23411 c23411, FileChannel fileChannel, InterfaceC8559 interfaceC8559, AtomicReference atomicReference, C9265 c9265) {
        C23411 c23411Mo21174;
        C23411 c23412;
        InterfaceC7889 interfaceC7889M23788;
        try {
            try {
                c23411Mo21174 = c18437.f57207.mo21174();
                try {
                    boolean zM23787 = c9265.m23787(c23411Mo21174);
                    if (zM23787) {
                        byte[] bArr = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
                        byte[] bArr2 = new byte[524288];
                        int i3 = i;
                        while (i3 < i2 && !((C6442) interfaceC8559).mo17797()) {
                            int i4 = i3;
                            c18437.m42911((C1915) arrayList.get(i3), c23411Mo21174, c23411, fileChannel, interfaceC8559, bArr, bArr2);
                            i3 = i4 + 1;
                        }
                        if (zM23787) {
                            c9265.m23788(c23411Mo21174);
                        }
                        try {
                            c23411Mo21174.close();
                            return;
                        } catch (IOException e) {
                            while (!atomicReference.compareAndSet(null, e)) {
                                if (atomicReference.get() != null) {
                                    return;
                                }
                            }
                        }
                    } else {
                        if (zM23787) {
                            c9265.m23788(c23411Mo21174);
                        }
                        try {
                            c23411Mo21174.close();
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
                            c9265.m23786();
                            break;
                        }
                    } while (atomicReference.get() == null);
                    if (0 != 0) {
                        c9265.m23788(c23411Mo21174);
                    }
                    if (c23411Mo21174 == null) {
                        return;
                    }
                    try {
                        c23411Mo21174.close();
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
                            c9265.m23786();
                            break;
                        }
                    } while (atomicReference.get() == null);
                    if (0 != 0) {
                        c9265.m23788(c23411Mo21174);
                    }
                    if (c23411Mo21174 == null) {
                        return;
                    }
                    try {
                        c23411Mo21174.close();
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
                    c9265.m23788(interfaceC7889M23788);
                }
                if (c23412 == null) {
                    throw th2;
                }
                try {
                    c23412.close();
                    throw th2;
                } catch (IOException e6) {
                    while (!atomicReference.compareAndSet(null, e6)) {
                        if (atomicReference.get() != null) {
                            throw th2;
                        }
                    }
                    c9265.m23786();
                    throw th2;
                }
            }
        } catch (IOException e7) {
            e = e7;
            c23411Mo21174 = null;
        } catch (Throwable th3) {
            th = th3;
            c23411Mo21174 = null;
        }
        c9265.m23786();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42911(C1915 c1915, InterfaceC7889 interfaceC7889, C23411 c23411, FileChannel fileChannel, InterfaceC8559 interfaceC8559, byte[] bArr, byte[] bArr2) throws IOException {
        OutputStream c15613;
        long dataLength = c1915.getDataLength();
        long dataOffset = c1915.getDataOffset() + this.f57210;
        long startBlock = c1915.getDstExtents(0).getStartBlock();
        long j = this.f57211;
        long j2 = startBlock * j;
        InputStream c2209 = new C2209(interfaceC7889, dataOffset, dataLength);
        int i = C20554.f66230[c1915.getType().ordinal()];
        if (i != 1) {
            if (i == 2) {
                c2209 = new C9453(new C18867(c2209, bArr));
            } else if (i == 3) {
                c2209 = C1096.m3765(new C18867(c2209, bArr));
            } else if (i == 4) {
                c2209 = new ZstdInputStreamNoFinalizer(c2209, RecyclingBufferPool.INSTANCE);
            } else {
                throw new IOException("Unsupported operation type: " + c1915.getType().getNumber());
            }
        }
        try {
            long numBlocks = c1915.getDstExtents(0).getNumBlocks() * j;
            if (fileChannel == null) {
                c15613 = new C3620(j2, c23411);
            } else {
                c15613 = new C15613(fileChannel, j2);
            }
            m42910(c2209, c15613, interfaceC8559, bArr2, numBlocks);
            c2209.close();
        } catch (Throwable th) {
            try {
                c2209.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42913(C13621 c13621, C23411 c23411, InterfaceC8559 interfaceC8559, FileChannel fileChannel, boolean z, ArrayList arrayList, int i) throws IOException {
        if (z) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C1915) it.next()).getDstExtentsList().iterator();
                while (it2.hasNext()) {
                    long numBlocks = ((C12293) it2.next()).getNumBlocks() * ((long) i);
                    while (numBlocks > 0) {
                        int iMin = (int) Math.min(numBlocks, 524288);
                        synchronized (interfaceC8559) {
                            interfaceC8559.mo17795(iMin);
                        }
                        numBlocks -= (long) iMin;
                        if (interfaceC8559.mo17797()) {
                            break;
                        }
                    }
                }
                if (interfaceC8559.mo17797()) {
                    return;
                }
            }
            if (fileChannel.size() > c13621.m32741()) {
                throw new IOException("Extracted data exceeds entry size");
            }
            c23411.setLength(c13621.m32741());
            return;
        }
        if (fileChannel != null) {
            c23411.setLength(fileChannel.size());
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            m42912((C1915) it3.next(), c23411, interfaceC8559, i);
            if (interfaceC8559.mo17797()) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42910(InputStream inputStream, OutputStream outputStream, InterfaceC8559 interfaceC8559, byte[] bArr, long j) throws IOException {
        long j2 = 0;
        do {
            int i = inputStream.read(bArr);
            if (i == -1) {
                if (j2 == j) {
                    return;
                }
                StringBuilder sbM31106 = C12803.m31106("Operation size mismatch: expected ", ", actual ", j);
                sbM31106.append(j2);
                throw new IOException(sbM31106.toString());
            }
            long j3 = i;
            if (j3 > j - j2) {
                throw new IOException("Operation data exceeds destination extent");
            }
            synchronized (interfaceC8559) {
                interfaceC8559.mo17795(i);
            }
            outputStream.write(bArr, 0, i);
            j2 += j3;
        } while (!interfaceC8559.mo17797());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42912(C1915 c1915, C23411 c23411, InterfaceC8559 interfaceC8559, int i) {
        for (C12293 c12293 : c1915.getDstExtentsList()) {
            long j = i;
            long numBlocks = c12293.getNumBlocks() * j;
            synchronized (c23411) {
                c23411.seek(c12293.getStartBlock() * j);
                while (numBlocks > 0) {
                    byte[] bArr = f57206;
                    int iMin = (int) Math.min(numBlocks, 524288);
                    synchronized (interfaceC8559) {
                        interfaceC8559.mo17795(iMin);
                    }
                    c23411.write(bArr, 0, iMin);
                    numBlocks -= (long) iMin;
                    if (interfaceC8559.mo17797()) {
                        return;
                    }
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f57207.close();
    }
}
