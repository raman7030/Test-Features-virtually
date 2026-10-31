package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰ᩵ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6VW */
/* JADX INFO: loaded from: classes4.dex */
public final class C14028 implements InterfaceC10795 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f42418;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f42419;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10795[] f42420;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f42421;

    @Override // l.InterfaceC10795
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
        return C1622.m5502(this, interfaceC10795);
    }

    @Override // l.InterfaceC10795
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
        return C1622.m5503(this, interfaceC10795);
    }

    public C14028(ArrayList arrayList, int i) {
        int size = arrayList.size();
        this.f42420 = new InterfaceC10795[size];
        this.f42419 = new int[size];
        this.f42418 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            C23201 c23201 = (C23201) arrayList.get(i2);
            this.f42420[i2] = c23201.f74583;
            this.f42419[i2] = c23201.f74582;
            this.f42418[i2] = c23201.f74581;
        }
        this.f42421 = i;
    }

    @Override // l.InterfaceC10795
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2465(int i) {
        int i2 = this.f42421;
        while (i2 >= 0) {
            i2 = this.f42420[i2].mo2465(i) ? this.f42419[i2] : this.f42418[i2];
        }
        return i2 == -1;
    }

    @Override // l.InterfaceC10795
    public final C7679 negate() {
        C5855 c5855 = C14403.f44164;
        return C7679.m20568(this);
    }
}
