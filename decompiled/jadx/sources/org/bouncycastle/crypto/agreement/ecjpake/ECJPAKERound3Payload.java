package org.bouncycastle.crypto.agreement.ecjpake;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class ECJPAKERound3Payload {
    public final BigInteger macTag;
    public final String participantId;

    public ECJPAKERound3Payload(String str, BigInteger bigInteger) {
        this.participantId = str;
        this.macTag = bigInteger;
    }

    public BigInteger getMacTag() {
        return this.macTag;
    }

    public String getParticipantId() {
        return this.participantId;
    }
}
