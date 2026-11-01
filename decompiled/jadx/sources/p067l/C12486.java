package p067l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۧ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8NY */
/* JADX INFO: loaded from: classes4.dex */
public final class C12486 implements InterfaceC15266 {

    /* JADX INFO: renamed from: ᩶ */
    public final long[] f35001;

    /* JADX INFO: renamed from: ᩸ */
    public final List f35002;

    /* JADX INFO: renamed from: ᩹ */
    public final long[] f35003;

    public C12486(ArrayList arrayList) {
        this.f35002 = C21562.unmodifiableList(new ArrayList(arrayList));
        this.f35003 = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            C5641 c5641 = (C5641) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = this.f35003;
            jArr[i2] = c5641.f13692;
            jArr[i2 + 1] = c5641.f13691;
        }
        long[] jArr2 = this.f35003;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f35001 = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // p067l.InterfaceC15266
    /* JADX INFO: renamed from: ֫ */
    public final int mo6891(long j) {
        long[] jArr = this.f35001;
        int iM12988 = C5792.m12988(jArr, j, false);
        if (iM12988 < jArr.length) {
            return iM12988;
        }
        return -1;
    }

    @Override // p067l.InterfaceC15266
    /* JADX INFO: renamed from: ֫ */
    public final int mo6890() {
        return this.f35001.length;
    }

    @Override // p067l.InterfaceC15266
    /* JADX INFO: renamed from: ֫ */
    public final long mo6892(int i) {
        C23877.m52957(i >= 0);
        long[] jArr = this.f35001;
        C23877.m52957(i < jArr.length);
        return jArr[i];
    }

    @Override // p067l.InterfaceC15266
    /* JADX INFO: renamed from: ܽ */
    public final List mo6893(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = this.f35002;
            if (i >= list.size()) {
                break;
            }
            int i2 = i * 2;
            long[] jArr = this.f35003;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                C5641 c5641 = (C5641) list.get(i);
                C21196 c21196 = c5641.f13690;
                if (c21196.f66634 == -3.4028235E38f) {
                    arrayList2.add(c5641);
                } else {
                    arrayList.add(c21196);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new C3768(0));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            C23207 c23207M47867 = ((C5641) arrayList2.get(i3)).f13690.m47867();
            c23207M47867.m51722((-1) - i3, 1);
            arrayList.add(c23207M47867.m51720());
        }
        return arrayList;
    }
}
