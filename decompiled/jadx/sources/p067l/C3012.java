package p067l;

import java.io.FileWriter;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.֡᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C3012 implements Iterable {

    /* JADX INFO: renamed from: ᩸ */
    public ConcurrentLinkedQueue f5379;

    /* JADX INFO: renamed from: ᩹ */
    public AtomicInteger f5380;

    public C3012() {
        this.f5379 = null;
        this.f5380 = null;
        this.f5379 = new ConcurrentLinkedQueue();
        this.f5380 = new AtomicInteger(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5089(String str) {
        int length = str.length();
        this.f5379.add(str);
        this.f5380.addAndGet(length);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5088(FileWriter fileWriter, char[] cArr) {
        if (fileWriter == null || cArr == null || cArr.length == 0) {
            return;
        }
        int length = cArr.length;
        int i = 0;
        int i2 = length;
        for (String str : this.f5379) {
            int length2 = str.length();
            int i3 = 0;
            while (length2 > 0) {
                int i4 = i2 > length2 ? length2 : i2;
                int i5 = i3 + i4;
                str.getChars(i3, i5, cArr, i);
                i2 -= i4;
                i += i4;
                length2 -= i4;
                if (i2 == 0) {
                    try {
                        fileWriter.write(cArr, 0, length);
                    } catch (Exception unused) {
                    }
                    i = 0;
                    i2 = length;
                }
                i3 = i5;
            }
        }
        if (i > 0) {
            try {
                fileWriter.write(cArr, 0, i);
            } catch (Exception unused2) {
            }
        }
        try {
            fileWriter.flush();
        } catch (Exception unused3) {
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m5090() {
        return this.f5380.get();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m5091() {
        this.f5379.clear();
        this.f5380.set(0);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f5379.iterator();
    }
}
