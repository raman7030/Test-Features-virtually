package l;

import java.io.FileWriter;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.֡᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C0677 implements Iterable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ConcurrentLinkedQueue f2606;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AtomicInteger f2607;

    public C0677() {
        this.f2606 = null;
        this.f2607 = null;
        this.f2606 = new ConcurrentLinkedQueue();
        this.f2607 = new AtomicInteger(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2750(String str) {
        int length = str.length();
        this.f2606.add(str);
        this.f2607.addAndGet(length);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2749(FileWriter fileWriter, char[] cArr) {
        if (fileWriter == null || cArr == null || cArr.length == 0) {
            return;
        }
        int length = cArr.length;
        int i = 0;
        int i2 = length;
        for (String str : this.f2606) {
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m2751() {
        return this.f2607.get();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m2752() {
        this.f2606.clear();
        this.f2607.set(0);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f2606.iterator();
    }
}
