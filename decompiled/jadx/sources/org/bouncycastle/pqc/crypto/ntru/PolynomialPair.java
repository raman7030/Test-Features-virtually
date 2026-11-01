package org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.pqc.math.ntru.Polynomial;

/* JADX INFO: loaded from: classes2.dex */
public class PolynomialPair {

    /* JADX INFO: renamed from: a */
    public final Polynomial f81684a;

    /* JADX INFO: renamed from: b */
    public final Polynomial f81685b;

    public PolynomialPair(Polynomial polynomial, Polynomial polynomial2) {
        this.f81684a = polynomial;
        this.f81685b = polynomial2;
    }

    /* JADX INFO: renamed from: f */
    public Polynomial m55423f() {
        return this.f81684a;
    }

    /* JADX INFO: renamed from: g */
    public Polynomial m55424g() {
        return this.f81685b;
    }

    /* JADX INFO: renamed from: m */
    public Polynomial m55425m() {
        return this.f81685b;
    }

    /* JADX INFO: renamed from: r */
    public Polynomial m55426r() {
        return this.f81684a;
    }
}
