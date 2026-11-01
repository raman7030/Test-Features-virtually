package p067l;

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
public final class C24181 {

    /* JADX INFO: renamed from: ֫ */
    public int f76663;

    /* JADX INFO: renamed from: ۧ */
    public final FileChannel f76664;

    /* JADX INFO: renamed from: ܽ */
    public final C18973 f76666;

    /* JADX INFO: renamed from: ᩳ */
    public final RandomAccessFile f76668;

    /* JADX INFO: renamed from: ᩻ */
    public long f76669;

    /* JADX INFO: renamed from: ܿ */
    public final TreeMap f76667 = new TreeMap();

    /* JADX INFO: renamed from: ܳ */
    public volatile boolean f76665 = true;

    public C24181(RandomAccessFile randomAccessFile, C18973 c18973) {
        this.f76668 = randomAccessFile;
        this.f76664 = C13853.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
        this.f76666 = c18973;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24181 m53454(File file) throws Throwable {
        C18973 c18973;
        if (!file.isDirectory()) {
            throw new IOException("Hex clipboard cache directory is unavailable");
        }
        File fileCreateTempFile = File.createTempFile("hex-clipboard-arena-", ".tmp", file);
        RandomAccessFile randomAccessFile = null;
        try {
            C18973 c18973M37085 = C16290.m37085();
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(fileCreateTempFile, "rw");
                try {
                    if (!fileCreateTempFile.delete()) {
                        throw new IOException("Could not unlink hex clipboard arena file");
                    }
                    return new C24181(randomAccessFile2, c18973M37085);
                } catch (IOException | Error | RuntimeException e) {
                    e = e;
                    randomAccessFile = randomAccessFile2;
                    c18973 = c18973M37085;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                    }
                    if (c18973 != null) {
                        c18973.close();
                    }
                    if (fileCreateTempFile.exists() && !fileCreateTempFile.delete()) {
                        e.addSuppressed(new IOException("Could not delete hex clipboard arena file"));
                        throw e;
                    }
                    throw e;
                }
            } catch (IOException | Error | RuntimeException e3) {
                c18973 = c18973M37085;
                e = e3;
            }
        } catch (IOException | Error | RuntimeException e4) {
            e = e4;
            c18973 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4736 m53461(int i) throws IOException {
        Map.Entry entry;
        m53459();
        m53458();
        Iterator it = this.f76667.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                entry = null;
                break;
            }
            entry = (Map.Entry) it.next();
        } while (((Long) entry.getValue()).longValue() < i);
        if (entry != null) {
            return m53453(entry, i);
        }
        long j = this.f76669;
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
        this.f76669 = j3;
        int i2 = this.f76663;
        if (i2 == Integer.MAX_VALUE) {
            throw new ArithmeticException();
        }
        this.f76663 = i2 + 1;
        return new C4736(i, j, this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4736 m53462(int i, long j) throws ClosedChannelException {
        m53459();
        m53458();
        for (Map.Entry entry : this.f76667.entrySet()) {
            if (((Long) entry.getKey()).longValue() >= j) {
                return null;
            }
            if (((Long) entry.getValue()).longValue() >= i) {
                return m53453(entry, i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m53466(int i, long j) {
        m53459();
        if (!this.f76665) {
            return false;
        }
        for (Map.Entry entry : this.f76667.entrySet()) {
            if (((Long) entry.getKey()).longValue() >= j) {
                return false;
            }
            if (((Long) entry.getValue()).longValue() >= i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m53464() {
        m53459();
        Iterator it = this.f76667.values().iterator();
        long jM55743 = 0;
        while (it.hasNext()) {
            jM55743 = C0892.m55743(jM55743, ((Long) it.next()).longValue());
            if (jM55743 > 33554432) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    private C4736 m53453(Map.Entry entry, int i) {
        Long l2 = (Long) entry.getKey();
        long jLongValue = l2.longValue();
        long jLongValue2 = ((Long) entry.getValue()).longValue();
        TreeMap treeMap = this.f76667;
        treeMap.remove(l2);
        long j = i;
        if (jLongValue2 > j) {
            treeMap.put(Long.valueOf(jLongValue + j), Long.valueOf(jLongValue2 - j));
        }
        int i2 = this.f76663;
        if (i2 == Integer.MAX_VALUE) {
            throw new ArithmeticException();
        }
        this.f76663 = i2 + 1;
        return new C4736(i, jLongValue, this);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m53467(int i, long j) {
        synchronized (C19644.f59744) {
            m53458();
            int i2 = this.f76663;
            if (i2 <= 0) {
                throw new IllegalStateException("Hex clipboard arena allocation underflow");
            }
            int i3 = i2 - 1;
            this.f76663 = i3;
            if (i3 == 0) {
                this.f76665 = false;
                this.f76667.clear();
                this.f76669 = 0L;
                if (C19644.f59747 == this) {
                    C19644.f59747 = null;
                }
                C18973 c18973 = this.f76666;
                try {
                    this.f76668.close();
                    c18973.close();
                    return;
                } catch (Throwable th) {
                    c18973.close();
                    throw th;
                }
            }
            m53455(j, i);
            m53460();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m53465(long j, byte[] bArr, int i, int i2) throws IOException {
        m53458();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        while (byteBufferWrap.hasRemaining()) {
            int iWrite = this.f76664.write(byteBufferWrap, j);
            if (iWrite == 0) {
                Thread.yield();
            } else {
                j += (long) iWrite;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53463(long j, byte[] bArr, int i, int i2) throws IOException {
        m53458();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        while (byteBufferWrap.hasRemaining()) {
            int i3 = this.f76664.read(byteBufferWrap, j);
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
    /* JADX INFO: renamed from: ֫ */
    private void m53455(long j, long j2) {
        long jLongValue;
        long j3 = j + j2;
        if (!((j ^ j2) < 0) && !((j ^ j3) >= 0)) {
            throw new ArithmeticException();
        }
        Long lValueOf = Long.valueOf(j);
        TreeMap treeMap = this.f76667;
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

    /* JADX INFO: renamed from: ᩳ */
    private void m53460() throws IOException {
        TreeMap treeMap;
        long jLongValue = this.f76669;
        ArrayList arrayList = new ArrayList();
        while (true) {
            Long lValueOf = Long.valueOf(1 + jLongValue);
            treeMap = this.f76667;
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
        if (jLongValue == this.f76669) {
            return;
        }
        this.f76664.truncate(jLongValue);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            treeMap.remove((Long) it.next());
        }
        this.f76669 = jLongValue;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m53458() throws ClosedChannelException {
        if (!this.f76665) {
            throw new ClosedChannelException();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m53459() {
        if (!Thread.holdsLock(C19644.f59744)) {
            throw new IllegalStateException("Hex clipboard arena lock is not held");
        }
    }
}
