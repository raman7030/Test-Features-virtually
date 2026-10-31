package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: l.۬۠, reason: contains not printable characters */
/* JADX INFO: compiled from: W1DE */
/* JADX INFO: loaded from: classes4.dex */
public class C12978 extends C15094 {

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public C15094[] f38882 = new C15094[4];

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public int f38881 = 0;

    /* JADX INFO: renamed from: ᩻֫ */
    public void mo25519() {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31543(C15094 c15094) {
        if (c15094 == this || c15094 == null) {
            return;
        }
        int i = this.f38881 + 1;
        C15094[] c15094Arr = this.f38882;
        if (i > c15094Arr.length) {
            this.f38882 = (C15094[]) Arrays.copyOf(c15094Arr, c15094Arr.length * 2);
        }
        C15094[] c15094Arr2 = this.f38882;
        int i2 = this.f38881;
        c15094Arr2[i2] = c15094;
        this.f38881 = i2 + 1;
    }

    @Override // l.C15094
    /* JADX INFO: renamed from: ֫ */
    public void mo7758(C15094 c15094, HashMap map) {
        super.mo7758(c15094, map);
        C12978 c12978 = (C12978) c15094;
        this.f38881 = 0;
        int i = c12978.f38881;
        for (int i2 = 0; i2 < i; i2++) {
            m31543((C15094) map.get(c12978.f38882[i2]));
        }
    }

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final void m31544() {
        this.f38881 = 0;
        Arrays.fill(this.f38882, (Object) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31542(int i, C0483 c0483, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.f38881; i2++) {
            c0483.m2139(this.f38882[i2]);
        }
        for (int i3 = 0; i3 < this.f38881; i3++) {
            C6834.m18516(this.f38882[i3], i, arrayList, c0483);
        }
    }
}
