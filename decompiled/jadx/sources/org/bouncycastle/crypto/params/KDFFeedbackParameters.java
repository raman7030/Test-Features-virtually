package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class KDFFeedbackParameters implements DerivationParameters {
    public static final int UNUSED_R = -1;
    public final byte[] fixedInputData;

    /* JADX INFO: renamed from: iv */
    public final byte[] f81270iv;

    /* JADX INFO: renamed from: ki */
    public final byte[] f81271ki;

    /* JADX INFO: renamed from: r */
    public final int f81272r;
    public final boolean useCounter;

    public KDFFeedbackParameters(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, boolean z) {
        if (bArr == null) {
            throw new IllegalArgumentException("A KDF requires Ki (a seed) as input");
        }
        this.f81271ki = Arrays.clone(bArr);
        if (bArr3 == null) {
            this.fixedInputData = new byte[0];
        } else {
            this.fixedInputData = Arrays.clone(bArr3);
        }
        this.f81272r = i;
        if (bArr2 == null) {
            this.f81270iv = new byte[0];
        } else {
            this.f81270iv = Arrays.clone(bArr2);
        }
        this.useCounter = z;
    }

    public static KDFFeedbackParameters createWithCounter(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        if (i == 8 || i == 16 || i == 24 || i == 32) {
            return new KDFFeedbackParameters(bArr, bArr2, bArr3, i, true);
        }
        throw new IllegalArgumentException("Length of counter should be 8, 16, 24 or 32");
    }

    public static KDFFeedbackParameters createWithoutCounter(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return new KDFFeedbackParameters(bArr, bArr2, bArr3, -1, false);
    }

    public byte[] getFixedInputData() {
        return Arrays.clone(this.fixedInputData);
    }

    public byte[] getIV() {
        return this.f81270iv;
    }

    public byte[] getKI() {
        return this.f81271ki;
    }

    public int getR() {
        return this.f81272r;
    }

    public boolean useCounter() {
        return this.useCounter;
    }
}
