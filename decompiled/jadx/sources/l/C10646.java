package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۧ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8NY */
/* JADX INFO: loaded from: classes4.dex */
public final class C10646 implements InterfaceC13571 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long[] f32030;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List f32031;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long[] f32032;

    public C10646(ArrayList arrayList) {
        this.f32031 = C20195.unmodifiableList(new ArrayList(arrayList));
        this.f32032 = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            C3443 c3443 = (C3443) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = this.f32032;
            jArr[i2] = c3443.f10890;
            jArr[i2 + 1] = c3443.f10889;
        }
        long[] jArr2 = this.f32032;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f32030 = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // l.InterfaceC13571
    /* JADX INFO: renamed from: ֫ */
    public final int mo4659(long j) {
        long[] jArr = this.f32030;
        int iM11012 = C3603.m11012(jArr, j, false);
        if (iM11012 < jArr.length) {
            return iM11012;
        }
        return -1;
    }

    @Override // l.InterfaceC13571
    /* JADX INFO: renamed from: ֫ */
    public final int mo4658() {
        return this.f32030.length;
    }

    @Override // l.InterfaceC13571
    /* JADX INFO: renamed from: ֫ */
    public final long mo4660(int i) {
        C22632.m50631(i >= 0);
        long[] jArr = this.f32030;
        C22632.m50631(i < jArr.length);
        return jArr[i];
    }

    @Override // l.InterfaceC13571
    /* JADX INFO: renamed from: ܽ */
    public final List mo4661(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = this.f32031;
            if (i >= list.size()) {
                break;
            }
            int i2 = i * 2;
            long[] jArr = this.f32032;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                C3443 c3443 = (C3443) list.get(i);
                C19811 c19811 = c3443.f10888;
                if (c19811.f63997 == -3.4028235E38f) {
                    arrayList2.add(c3443);
                } else {
                    arrayList.add(c19811);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new C1473(0));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            C21927 c21927M45556 = ((C3443) arrayList2.get(i3)).f10888.m45556();
            c21927M45556.m49385((-1) - i3, 1);
            arrayList.add(c21927M45556.m49383());
        }
        return arrayList;
    }
}
