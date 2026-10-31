package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CryptoServicePurpose;

/* JADX INFO: loaded from: classes.dex */
public class Utils {
    public static CryptoServicePurpose getPurpose(boolean z) {
        return z ? CryptoServicePurpose.ENCRYPTION : CryptoServicePurpose.DECRYPTION;
    }
}
