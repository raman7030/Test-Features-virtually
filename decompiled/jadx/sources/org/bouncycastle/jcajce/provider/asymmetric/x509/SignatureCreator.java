package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.security.Signature;

/* JADX INFO: loaded from: classes.dex */
public interface SignatureCreator {
    Signature createSignature(String str);
}
