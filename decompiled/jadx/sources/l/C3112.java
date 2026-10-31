package l;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: l.ۗ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B2S5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3112 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Comparator f9722 = new C20046();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f9723;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10168[] f9724;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f9725;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final float[] f9726 = new float[3];

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f9727;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m9486(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    public C3112(int[] iArr, int i, InterfaceC10168[] interfaceC10168Arr) {
        C4523 c4523;
        this.f9724 = interfaceC10168Arr;
        int[] iArr2 = new int[32768];
        this.f9725 = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            int iM9486 = m9486(Color.blue(i3), 8, 5) | (m9486(Color.red(i3), 8, 5) << 10) | (m9486(Color.green(i3), 8, 5) << 5);
            iArr[i2] = iM9486;
            iArr2[iM9486] = iArr2[iM9486] + 1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0) {
                int iM9484 = m9484((i5 >> 10) & 31, (i5 >> 5) & 31, i5 & 31);
                float[] fArr = this.f9726;
                C7191.m19272(iM9484, fArr);
                InterfaceC10168[] interfaceC10168Arr2 = this.f9724;
                if (interfaceC10168Arr2 != null && interfaceC10168Arr2.length > 0) {
                    for (InterfaceC10168 interfaceC10168 : interfaceC10168Arr2) {
                        if (!interfaceC10168.mo25526(fArr)) {
                            iArr2[i5] = 0;
                            break;
                        }
                    }
                }
            }
            if (iArr2[i5] > 0) {
                i4++;
            }
        }
        int[] iArr3 = new int[i4];
        this.f9723 = iArr3;
        int i6 = 0;
        for (int i7 = 0; i7 < 32768; i7++) {
            if (iArr2[i7] > 0) {
                iArr3[i6] = i7;
                i6++;
            }
        }
        if (i4 <= i) {
            this.f9727 = new ArrayList();
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = iArr3[i8];
                this.f9727.add(new C5934(m9484((i9 >> 10) & 31, (i9 >> 5) & 31, i9 & 31), iArr2[i9]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i, f9722);
        priorityQueue.offer(new C4523(this, 0, this.f9723.length - 1));
        while (priorityQueue.size() < i && (c4523 = (C4523) priorityQueue.poll()) != null && c4523.m13294()) {
            priorityQueue.offer(c4523.m13297());
            priorityQueue.offer(c4523);
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            C5934 c5934M13296 = ((C4523) it.next()).m13296();
            float[] fArrM16660 = c5934M13296.m16660();
            InterfaceC10168[] interfaceC10168Arr3 = this.f9724;
            if (interfaceC10168Arr3 != null && interfaceC10168Arr3.length > 0) {
                int length = interfaceC10168Arr3.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        if (!interfaceC10168Arr3[i10].mo25526(fArrM16660)) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            arrayList.add(c5934M13296);
        }
        this.f9727 = arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9485(int i, int i2, int i3, int[] iArr) {
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
    public static int m9484(int i, int i2, int i3) {
        return Color.rgb(m9486(i, 5, 8), m9486(i2, 5, 8), m9486(i3, 5, 8));
    }
}
