package l;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: l.ܰ۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: B2S5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13815 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C11700 f41213 = new C11700();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f41214;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f41215;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f41216;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m33172(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    public C13815(int[] iArr) {
        C22988 c22988;
        int[] iArr2 = new int[32768];
        this.f41215 = iArr2;
        for (int i : iArr) {
            int iM33172 = m33172(Color.blue(i), 8, 5) | (m33172(Color.red(i), 8, 5) << 10) | (m33172(Color.green(i), 8, 5) << 5);
            iArr2[iM33172] = iArr2[iM33172] + 1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 32768; i3++) {
            if (iArr2[i3] > 0) {
                i2++;
            }
        }
        int[] iArr3 = new int[i2];
        this.f41214 = iArr3;
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0) {
                iArr3[i4] = i5;
                i4++;
            }
        }
        if (i2 <= 1) {
            this.f41216 = new ArrayList();
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = iArr3[i6];
                this.f41216.add(new C5934(m33170((i7 >> 10) & 31, (i7 >> 5) & 31, i7 & 31), iArr2[i7]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(1, f41213);
        priorityQueue.offer(new C22988(this, 0, this.f41214.length - 1));
        while (priorityQueue.size() < 1 && (c22988 = (C22988) priorityQueue.poll()) != null && c22988.m51140()) {
            priorityQueue.offer(c22988.m51143());
            priorityQueue.offer(c22988);
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            arrayList.add(((C22988) it.next()).m51142());
        }
        this.f41216 = arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33171(int i, int i2, int i3, int[] iArr) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                i2++;
            }
            return;
        }
        if (i != -1) {
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
            i2++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m33170(int i, int i2, int i3) {
        return Color.rgb(m33172(i, 5, 8), m33172(i2, 5, 8), m33172(i3, 5, 8));
    }
}
