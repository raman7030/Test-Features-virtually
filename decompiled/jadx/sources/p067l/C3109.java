package p067l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֨֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X8SG */
/* JADX INFO: loaded from: classes2.dex */
public final class C3109 extends AbstractC16520 {

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f5656;

    /* JADX INFO: renamed from: ܽ */
    public final long f5657;

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f5658;

    public C3109(int i, long j) {
        super(i);
        this.f5657 = j;
        this.f5658 = new ArrayList();
        this.f5656 = new ArrayList();
    }

    /* JADX INFO: renamed from: ܽ */
    public final C9815 m5304(int i) {
        ArrayList arrayList = this.f5658;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C9815 c9815 = (C9815) arrayList.get(i2);
            if (c9815.f48556 == i) {
                return c9815;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C3109 m5303(int i) {
        ArrayList arrayList = this.f5656;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3109 c3109 = (C3109) arrayList.get(i2);
            if (c3109.f48556 == i) {
                return c3109;
            }
        }
        return null;
    }

    @Override // p067l.AbstractC16520
    public final String toString() {
        return AbstractC16520.m37479(this.f48556) + " leaves: " + Arrays.toString(this.f5658.toArray()) + " containers: " + Arrays.toString(this.f5656.toArray());
    }
}
