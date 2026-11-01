package p067l;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: l.ۗ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B2S5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5326 {

    /* JADX INFO: renamed from: ܳ */
    public static final Comparator f12525 = new C21420();

    /* JADX INFO: renamed from: ֫ */
    public final int[] f12526;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC12032[] f12527;

    /* JADX INFO: renamed from: ܽ */
    public final int[] f12528;

    /* JADX INFO: renamed from: ܿ */
    public final float[] f12529 = new float[3];

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f12530;

    /* JADX INFO: renamed from: ۧ */
    public static int m11529(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    public C5326(int[] iArr, int i, InterfaceC12032[] interfaceC12032Arr) {
        C6667 c6667;
        this.f12527 = interfaceC12032Arr;
        int[] iArr2 = new int[32768];
        this.f12528 = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            int iM11529 = m11529(Color.blue(i3), 8, 5) | (m11529(Color.red(i3), 8, 5) << 10) | (m11529(Color.green(i3), 8, 5) << 5);
            iArr[i2] = iM11529;
            iArr2[iM11529] = iArr2[iM11529] + 1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0) {
                int iM11527 = m11527((i5 >> 10) & 31, (i5 >> 5) & 31, i5 & 31);
                float[] fArr = this.f12529;
                C1199.m21219(iM11527, fArr);
                InterfaceC12032[] interfaceC12032Arr2 = this.f12527;
                if (interfaceC12032Arr2 != null && interfaceC12032Arr2.length > 0) {
                    for (InterfaceC12032 interfaceC12032 : interfaceC12032Arr2) {
                        if (!interfaceC12032.mo27545(fArr)) {
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
        this.f12526 = iArr3;
        int i6 = 0;
        for (int i7 = 0; i7 < 32768; i7++) {
            if (iArr2[i7] > 0) {
                iArr3[i6] = i7;
                i6++;
            }
        }
        if (i4 <= i) {
            this.f12530 = new ArrayList();
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = iArr3[i8];
                this.f12530.add(new C8008(m11527((i9 >> 10) & 31, (i9 >> 5) & 31, i9 & 31), iArr2[i9]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i, f12525);
        priorityQueue.offer(new C6667(this, 0, this.f12526.length - 1));
        while (priorityQueue.size() < i && (c6667 = (C6667) priorityQueue.poll()) != null && c6667.m15177()) {
            priorityQueue.offer(c6667.m15180());
            priorityQueue.offer(c6667);
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            C8008 c8008M15179 = ((C6667) it.next()).m15179();
            float[] fArrM18586 = c8008M15179.m18586();
            InterfaceC12032[] interfaceC12032Arr3 = this.f12527;
            if (interfaceC12032Arr3 != null && interfaceC12032Arr3.length > 0) {
                int length = interfaceC12032Arr3.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        if (!interfaceC12032Arr3[i10].mo27545(fArrM18586)) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            arrayList.add(c8008M15179);
        }
        this.f12530 = arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m11528(int i, int i2, int i3, int[] iArr) {
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
    public static int m11527(int i, int i2, int i3) {
        return Color.rgb(m11529(i, 5, 8), m11529(i2, 5, 8), m11529(i3, 5, 8));
    }
}
