package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰ᩵ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6VW */
/* JADX INFO: loaded from: classes4.dex */
public final class C15701 implements InterfaceC12628 {

    /* JADX INFO: renamed from: ֫ */
    public final int[] f45501;

    /* JADX INFO: renamed from: ۧ */
    public final int[] f45502;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC12628[] f45503;

    /* JADX INFO: renamed from: ᩳ */
    public final int f45504;

    @Override // p067l.InterfaceC12628
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC12628 mo4820(InterfaceC12628 interfaceC12628) {
        return C3910.m7732(this, interfaceC12628);
    }

    @Override // p067l.InterfaceC12628
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC12628 mo4822(InterfaceC12628 interfaceC12628) {
        return C3910.m7733(this, interfaceC12628);
    }

    public C15701(ArrayList arrayList, int i) {
        int size = arrayList.size();
        this.f45503 = new InterfaceC12628[size];
        this.f45502 = new int[size];
        this.f45501 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            C24419 c24419 = (C24419) arrayList.get(i2);
            this.f45503[i2] = c24419.f77326;
            this.f45502[i2] = c24419.f77325;
            this.f45501[i2] = c24419.f77324;
        }
        this.f45504 = i;
    }

    @Override // p067l.InterfaceC12628
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4821(int i) {
        int i2 = this.f45504;
        while (i2 >= 0) {
            i2 = this.f45503[i2].mo4821(i) ? this.f45502[i2] : this.f45501[i2];
        }
        return i2 == -1;
    }

    @Override // p067l.InterfaceC12628
    public final C9667 negate() {
        C7933 c7933 = C16057.f47257;
        return C9667.m22548(this);
    }
}
