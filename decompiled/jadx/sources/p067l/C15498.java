package p067l;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: l.ܰ۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: B2S5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15498 {

    /* JADX INFO: renamed from: ᩳ */
    public static final C13488 f44291 = new C13488();

    /* JADX INFO: renamed from: ֫ */
    public final int[] f44292;

    /* JADX INFO: renamed from: ۧ */
    public final int[] f44293;

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList f44294;

    /* JADX INFO: renamed from: ۧ */
    public static int m35289(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    public C15498(int[] iArr) {
        C24216 c24216;
        int[] iArr2 = new int[32768];
        this.f44293 = iArr2;
        for (int i : iArr) {
            int iM35289 = m35289(Color.blue(i), 8, 5) | (m35289(Color.red(i), 8, 5) << 10) | (m35289(Color.green(i), 8, 5) << 5);
            iArr2[iM35289] = iArr2[iM35289] + 1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 32768; i3++) {
            if (iArr2[i3] > 0) {
                i2++;
            }
        }
        int[] iArr3 = new int[i2];
        this.f44292 = iArr3;
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0) {
                iArr3[i4] = i5;
                i4++;
            }
        }
        if (i2 <= 1) {
            this.f44294 = new ArrayList();
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = iArr3[i6];
                this.f44294.add(new C8008(m35287((i7 >> 10) & 31, (i7 >> 5) & 31, i7 & 31), iArr2[i7]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(1, f44291);
        priorityQueue.offer(new C24216(this, 0, this.f44292.length - 1));
        while (priorityQueue.size() < 1 && (c24216 = (C24216) priorityQueue.poll()) != null && c24216.m53533()) {
            priorityQueue.offer(c24216.m53536());
            priorityQueue.offer(c24216);
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            arrayList.add(((C24216) it.next()).m53535());
        }
        this.f44294 = arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35288(int i, int i2, int i3, int[] iArr) {
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

    /* JADX INFO: renamed from: ֫ */
    public static int m35287(int i, int i2, int i3) {
        return Color.rgb(m35289(i, 5, 8), m35289(i2, 5, 8), m35289(i3, 5, 8));
    }
}
