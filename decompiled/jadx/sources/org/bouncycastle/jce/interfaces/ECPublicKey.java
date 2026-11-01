package org.bouncycastle.jce.interfaces;

import java.security.PublicKey;
import org.bouncycastle.math.p080ec.ECPoint;

/* JADX INFO: loaded from: classes.dex */
public interface ECPublicKey extends ECKey, PublicKey {
    ECPoint getQ();
}
