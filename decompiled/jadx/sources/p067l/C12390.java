package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۤ᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5BR */
/* JADX INFO: loaded from: classes3.dex */
public final class C12390 {

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC4699[] f34620 = new InterfaceC4699[10];

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f34619 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final void m28505(String str, InterfaceC4699 interfaceC4699) {
        ArrayList arrayList = this.f34619;
        int size = arrayList.size();
        InterfaceC4699[] interfaceC4699Arr = this.f34620;
        if (size == interfaceC4699Arr.length) {
            InterfaceC4699[] interfaceC4699Arr2 = new InterfaceC4699[interfaceC4699Arr.length + 10];
            this.f34620 = interfaceC4699Arr2;
            System.arraycopy(interfaceC4699Arr, 0, interfaceC4699Arr2, 0, interfaceC4699Arr.length);
        }
        this.f34620[arrayList.size()] = interfaceC4699;
        arrayList.add(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m28504(String str) {
        int iIndexOf = this.f34619.indexOf(str);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        throw new RuntimeException("Null");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28506(C21778 c21778, int i) {
        this.f34620[i].mo4126(c21778.f68561);
    }

    public C12390() {
        m28505("FqEbNJXkJJiNHyALXoAPmNssdfAfNBwo", new C2805());
        m28505("VccaTcBCLZNJJFdPoFgCfDEXEfyLbLRc", new C8702());
        m28505("EPBCJBqAFiXcEDiZdDcukBwcwgiRscVA", new C6040());
        m28505("CTHiqssoBaukCbPJsgNBkFeCwooFJZbf", new C4965());
        m28505("qoNZDuCTyLXAuEZHyHscRAodgmRgkJVA", new C15426());
        m28505("ybqoPJTkJJFqmNPBdfToJBZDdTDCNdiR", new C8597());
        m28505("NBwgiNDasoayTwBCayNZeyybZTbXcyHi", new C12710());
        C17438.m39717(this);
        C9372.m21785(this);
        C11580.m26650(this);
        C24795.m54474(this);
        C14756.m33701(this);
        C20793.m46940(this);
        C24144.m53389(this);
        C10043.m23407(this);
    }
}
