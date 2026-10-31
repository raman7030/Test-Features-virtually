package l;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩺ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes.dex */
public final class C22951 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f73933;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final FileChannel f73934;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17471 f73936;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final RandomAccessFile f73938;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f73939;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final TreeMap f73937 = new TreeMap();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f73935 = true;

    public C22951(RandomAccessFile randomAccessFile, C17471 c17471) {
        this.f73938 = randomAccessFile;
        this.f73934 = C12084.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
        this.f73936 = c17471;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22951 m51063(File file) throws Throwable {
        C17471 c17471;
        if (!file.isDirectory()) {
            throw new IOException("Hex clipboard cache directory is unavailable");
        }
        File fileCreateTempFile = File.createTempFile("hex-clipboard-arena-", ".tmp", file);
        RandomAccessFile randomAccessFile = null;
        try {
            C17471 c17471M34938 = C14648.m34938();
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(fileCreateTempFile, "rw");
                try {
                    if (!fileCreateTempFile.delete()) {
                        throw new IOException("Could not unlink hex clipboard arena file");
                    }
                    return new C22951(randomAccessFile2, c17471M34938);
                } catch (IOException | Error | RuntimeException e) {
                    e = e;
                    randomAccessFile = randomAccessFile2;
                    c17471 = c17471M34938;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                    }
                    if (c17471 != null) {
                        c17471.close();
                    }
                    if (fileCreateTempFile.exists() && !fileCreateTempFile.delete()) {
                        e.addSuppressed(new IOException("Could not delete hex clipboard arena file"));
                        throw e;
                    }
                    throw e;
                }
            } catch (IOException | Error | RuntimeException e3) {
                c17471 = c17471M34938;
                e = e3;
            }
        } catch (IOException | Error | RuntimeException e4) {
            e = e4;
            c17471 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2491 m51070(int i) throws IOException {
        Map.Entry entry;
        m51068();
        m51067();
        Iterator it = this.f73937.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                entry = null;
                break;
            }
            entry = (Map.Entry) it.next();
        } while (((Long) entry.getValue()).longValue() < i);
        if (entry != null) {
            return m51062(entry, i);
        }
        long j = this.f73939;
        long j2 = i;
        long j3 = j + j2;
        if (!((j2 ^ j) < 0) && !((j ^ j3) >= 0)) {
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException e) {
                throw new IOException("Hex clipboard arena offset overflow", e);
            }
        }
        if (j3 > 2348810239L) {
            throw new IOException("Hex clipboard shared arena exceeds storage limit");
        }
        this.f73939 = j3;
        int i2 = this.f73933;
        if (i2 == Integer.MAX_VALUE) {
            throw new ArithmeticException();
        }
        this.f73933 = i2 + 1;
        return new C2491(i, j, this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2491 m51071(int i, long j) throws ClosedChannelException {
        m51068();
        m51067();
        for (Map.Entry entry : this.f73937.entrySet()) {
            if (((Long) entry.getKey()).longValue() >= j) {
                return null;
            }
            if (((Long) entry.getValue()).longValue() >= i) {
                return m51062(entry, i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m51075(int i, long j) {
        m51068();
        if (!this.f73935) {
            return false;
        }
        for (Map.Entry entry : this.f73937.entrySet()) {
            if (((Long) entry.getKey()).longValue() >= j) {
                return false;
            }
            if (((Long) entry.getValue()).longValue() >= i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51073() {
        m51068();
        Iterator it = this.f73937.values().iterator();
        long jM3495 = 0;
        while (it.hasNext()) {
            jM3495 = C1005.m3495(jM3495, ((Long) it.next()).longValue());
            if (jM3495 > 33554432) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C2491 m51062(Map.Entry entry, int i) {
        Long l2 = (Long) entry.getKey();
        long jLongValue = l2.longValue();
        long jLongValue2 = ((Long) entry.getValue()).longValue();
        TreeMap treeMap = this.f73937;
        treeMap.remove(l2);
        long j = i;
        if (jLongValue2 > j) {
            treeMap.put(Long.valueOf(jLongValue + j), Long.valueOf(jLongValue2 - j));
        }
        int i2 = this.f73933;
        if (i2 == Integer.MAX_VALUE) {
            throw new ArithmeticException();
        }
        this.f73933 = i2 + 1;
        return new C2491(i, jLongValue, this);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m51076(int i, long j) {
        synchronized (C18177.f56530) {
            m51067();
            int i2 = this.f73933;
            if (i2 <= 0) {
                throw new IllegalStateException("Hex clipboard arena allocation underflow");
            }
            int i3 = i2 - 1;
            this.f73933 = i3;
            if (i3 == 0) {
                this.f73935 = false;
                this.f73937.clear();
                this.f73939 = 0L;
                if (C18177.f56534 == this) {
                    C18177.f56534 = null;
                }
                C17471 c17471 = this.f73936;
                try {
                    this.f73938.close();
                    c17471.close();
                    return;
                } catch (Throwable th) {
                    c17471.close();
                    throw th;
                }
            }
            m51064(j, i);
            m51069();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m51074(long j, byte[] bArr, int i, int i2) throws IOException {
        m51067();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        while (byteBufferWrap.hasRemaining()) {
            int iWrite = this.f73934.write(byteBufferWrap, j);
            if (iWrite == 0) {
                Thread.yield();
            } else {
                j += (long) iWrite;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51072(long j, byte[] bArr, int i, int i2) throws IOException {
        m51067();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        while (byteBufferWrap.hasRemaining()) {
            int i3 = this.f73934.read(byteBufferWrap, j);
            if (i3 < 0) {
                throw new EOFException("Unexpected end of hex clipboard arena");
            }
            if (i3 == 0) {
                Thread.yield();
            } else {
                j += (long) i3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51064(long j, long j2) {
        long jLongValue;
        long j3 = j + j2;
        if (!((j ^ j2) < 0) && !((j ^ j3) >= 0)) {
            throw new ArithmeticException();
        }
        Long lValueOf = Long.valueOf(j);
        TreeMap treeMap = this.f73937;
        Map.Entry entryFloorEntry = treeMap.floorEntry(lValueOf);
        if (entryFloorEntry != null) {
            long jLongValue2 = ((Long) entryFloorEntry.getKey()).longValue();
            long jLongValue3 = ((Long) entryFloorEntry.getValue()).longValue();
            long j4 = jLongValue2 + jLongValue3;
            if (!((jLongValue2 ^ j4) >= 0) && !(((jLongValue3 ^ jLongValue2) > 0 ? 1 : ((jLongValue3 ^ jLongValue2) == 0 ? 0 : -1)) < 0)) {
                throw new ArithmeticException();
            }
            if (j4 > j) {
                throw new IllegalStateException("Overlapping hex clipboard free block");
            }
            if (j4 == j) {
                jLongValue = ((Long) entryFloorEntry.getKey()).longValue();
                treeMap.remove(entryFloorEntry.getKey());
            } else {
                jLongValue = j;
            }
        } else {
            jLongValue = j;
        }
        Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Long.valueOf(jLongValue));
        if (entryCeilingEntry != null) {
            if (((Long) entryCeilingEntry.getKey()).longValue() < j3) {
                throw new IllegalStateException("Overlapping hex clipboard free block");
            }
            if (((Long) entryCeilingEntry.getKey()).longValue() == j3) {
                long jLongValue4 = ((Long) entryCeilingEntry.getKey()).longValue();
                long jLongValue5 = ((Long) entryCeilingEntry.getValue()).longValue();
                long j5 = jLongValue4 + jLongValue5;
                if (!((jLongValue5 ^ jLongValue4) < 0) && !((jLongValue4 ^ j5) >= 0)) {
                    throw new ArithmeticException();
                }
                treeMap.remove(entryCeilingEntry.getKey());
                j3 = j5;
            }
        }
        treeMap.put(Long.valueOf(jLongValue), Long.valueOf(j3 - jLongValue));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m51069() throws IOException {
        TreeMap treeMap;
        long jLongValue = this.f73939;
        ArrayList arrayList = new ArrayList();
        while (true) {
            Long lValueOf = Long.valueOf(1 + jLongValue);
            treeMap = this.f73937;
            Map.Entry entryLowerEntry = treeMap.lowerEntry(lValueOf);
            if (entryLowerEntry == null) {
                break;
            }
            if (((Long) entryLowerEntry.getValue()).longValue() + ((Long) entryLowerEntry.getKey()).longValue() != jLongValue) {
                break;
            }
            arrayList.add((Long) entryLowerEntry.getKey());
            jLongValue = ((Long) entryLowerEntry.getKey()).longValue();
        }
        if (jLongValue == this.f73939) {
            return;
        }
        this.f73934.truncate(jLongValue);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            treeMap.remove((Long) it.next());
        }
        this.f73939 = jLongValue;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m51067() throws ClosedChannelException {
        if (!this.f73935) {
            throw new ClosedChannelException();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m51068() {
        if (!Thread.holdsLock(C18177.f56530)) {
            throw new IllegalStateException("Hex clipboard arena lock is not held");
        }
    }
}
