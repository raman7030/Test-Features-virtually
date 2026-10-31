.class public Lorg/bouncycastle/crypto/examples/ECJPAKEExample;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static deriveSessionKey(Ljava/math/BigInteger;)Ljava/math/BigInteger;
    .locals 4

    .line 0
    invoke-static {}, Lorg/bouncycastle/crypto/digests/SHA256Digest;->newInstance()Lorg/bouncycastle/crypto/SavableDigest;

    move-result-object v0

    invoke-virtual {p0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p0

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v1

    new-array v1, v1, [B

    array-length v2, p0

    const/4 v3, 0x0

    invoke-interface {v0, p0, v3, v2}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    invoke-interface {v0, v1, v3}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    new-instance p0, Ljava/math/BigInteger;

    invoke-direct {p0, v1}, Ljava/math/BigInteger;-><init>([B)V

    return-object p0
.end method

.method public static main([Ljava/lang/String;)V
    .locals 14

    .line 0
    sget-object p0, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKECurves;->NIST_P256:Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKECurve;

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKECurve;->getA()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKECurve;->getB()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKECurve;->getG()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v2

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKECurve;->getH()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKECurve;->getN()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKECurve;->getQ()Ljava/math/BigInteger;

    move-result-object v5

    sget-object v6, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v7, "********* Initialization **********"

    invoke-virtual {v6, v7}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v6, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v7, "Public parameters for the elliptic curve over prime field:"

    invoke-virtual {v6, v7}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v6, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Curve param a ("

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, " bits): "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v9, 0x10

    invoke-virtual {v0, v9}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Curve param b ("

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/math/BigInteger;->bitLength()I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v6, "Co-factor h ("

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/math/BigInteger;->bitLength()I

    move-result v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Base point G ("

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v6, 0x1

    invoke-virtual {v2, v6}, Lorg/bouncycastle/math/ec/ECPoint;->getEncoded(Z)[B

    move-result-object v3

    array-length v3, v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " bytes): "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v3, Ljava/math/BigInteger;

    invoke-virtual {v2, v6}, Lorg/bouncycastle/math/ec/ECPoint;->getEncoded(Z)[B

    move-result-object v7

    invoke-direct {v3, v7}, Ljava/math/BigInteger;-><init>([B)V

    invoke-virtual {v3, v9}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "X coord of G (G not normalised) ("

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lorg/bouncycastle/math/ec/ECPoint;->getXCoord()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v3

    invoke-virtual {v3}, Lorg/bouncycastle/math/ec/ECFieldElement;->toBigInteger()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3}, Ljava/math/BigInteger;->bitLength()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lorg/bouncycastle/math/ec/ECPoint;->getXCoord()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v3

    invoke-virtual {v3}, Lorg/bouncycastle/math/ec/ECFieldElement;->toBigInteger()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3, v9}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "y coord of G (G not normalised) ("

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lorg/bouncycastle/math/ec/ECPoint;->getYCoord()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v3

    invoke-virtual {v3}, Lorg/bouncycastle/math/ec/ECFieldElement;->toBigInteger()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3}, Ljava/math/BigInteger;->bitLength()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lorg/bouncycastle/math/ec/ECPoint;->getYCoord()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v2

    invoke-virtual {v2}, Lorg/bouncycastle/math/ec/ECFieldElement;->toBigInteger()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Order of the base point n ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/math/BigInteger;->bitLength()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Prime field q ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/math/BigInteger;->bitLength()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v9}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v7, ""

    invoke-virtual {v0, v7}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "(Secret passwords used by Alice and Bob: \"password\" and \"password\")\n"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-static {}, Lorg/bouncycastle/crypto/digests/SHA256Digest;->newInstance()Lorg/bouncycastle/crypto/SavableDigest;

    move-result-object v8

    new-instance v10, Ljava/security/SecureRandom;

    invoke-direct {v10}, Ljava/security/SecureRandom;-><init>()V

    new-instance v11, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKEParticipant;

    const-string v1, "alice"

    const-string v12, "password"

    invoke-virtual {v12}, Ljava/lang/String;->toCharArray()[C

    move-result-object v2

    move-object v0, v11

    move-object v3, p0

    move-object v4, v8

    move-object v5, v10

    invoke-direct/range {v0 .. v5}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKEParticipant;-><init>(Ljava/lang/String;[CLorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKECurve;Lorg/bouncycastle/crypto/Digest;Ljava/security/SecureRandom;)V

    new-instance v13, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKEParticipant;

    const-string v1, "bob"

    invoke-virtual {v12}, Ljava/lang/String;->toCharArray()[C

    move-result-object v2

    move-object v0, v13

    invoke-direct/range {v0 .. v5}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKEParticipant;-><init>(Ljava/lang/String;[CLorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKECurve;Lorg/bouncycastle/crypto/Digest;Ljava/security/SecureRandom;)V

    invoke-virtual {v11}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKEParticipant;->createRound1PayloadToSend()Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound1Payload;

    move-result-object p0

    invoke-virtual {v13}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKEParticipant;->createRound1PayloadToSend()Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound1Payload;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "************ Round 1 **************"

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "Alice sends to Bob: "

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "g^{x1}="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v4, Ljava/math/BigInteger;

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound1Payload;->getGx1()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v5

    invoke-virtual {v5, v6}, Lorg/bouncycastle/math/ec/ECPoint;->getEncoded(Z)[B

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/math/BigInteger;-><init>([B)V

    invoke-virtual {v4, v9}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "g^{x2}="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v4, Ljava/math/BigInteger;

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound1Payload;->getGx2()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v5

    invoke-virtual {v5, v6}, Lorg/bouncycastle/math/ec/ECPoint;->getEncoded(Z)[B

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/math/BigInteger;-><init>([B)V

    invoke-virtual {v4, v9}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "KP{x1}: {V="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v4, Ljava/math/BigInteger;

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound1Payload;->getKnowledgeProofForX1()Lorg/bouncycastle/crypto/agreement/ecjpake/ECSchnorrZKP;

    move-result-object v5

    invoke-virtual {v5}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECSchnorrZKP;->getV()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v5

    invoke-virtual {v5, v6}, Lorg/bouncycastle/math/ec/ECPoint;->getEncoded(Z)[B

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/math/BigInteger;-><init>([B)V

    invoke-virtual {v4, v9}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "; r="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound1Payload;->getKnowledgeProofForX1()Lorg/bouncycastle/crypto/agreement/ecjpake/ECSchnorrZKP;

    move-result-object v5

    invoke-virtual {v5}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECSchnorrZKP;->getr()Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v5, v9}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "}"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v8, "KP{x2}: {V="

    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v8, Ljava/math/BigInteger;

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound1Payload;->getKnowledgeProofForX2()Lorg/bouncycastle/crypto/agreement/ecjpake/ECSchnorrZKP;

    move-result-object v10

    invoke-virtual {v10}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECSchnorrZKP;->getV()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v10

    invoke-virtual {v10, v6}, Lorg/bouncycastle/math/ec/ECPoint;->getEncoded(Z)[B

    move-result-object v10

    invoke-direct {v8, v10}, Ljava/math/BigInteger;-><init>([B)V

    invoke-virtual {v8, v9}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound1Payload;->getKnowledgeProofForX2()Lorg/bouncycastle/crypto/agreement/ecjpake/ECSchnorrZKP;

    move-result-object v8

    invoke-virtual {v8}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECSchnorrZKP;->getr()Ljava/math/BigInteger;

    move-result-object v8

    invoke-virtual {v8, v9}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v7}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v3, "Bob sends to Alice: "

    invoke-virtual {v1, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v10, "g^{x3}="

    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v10, Ljava/math/BigInteger;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound1Payload;->getGx1()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v12

    invoke-virtual {v12, v6}, Lorg/bouncycastle/math/ec/ECPoint;->getEncoded(Z)[B

    move-result-object v12

    invoke-direct {v10, v12}, Ljava/math/BigInteger;-><init>([B)V

    invoke-virtual {v10, v9}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v10, "g^{x4}="

    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v10, Ljava/math/BigInteger;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound1Payload;->getGx2()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v12

    invoke-virtual {v12, v6}, Lorg/bouncycastle/math/ec/ECPoint;->getEncoded(Z)[B

    move-result-object v12

    invoke-direct {v10, v12}, Ljava/math/BigInteger;-><init>([B)V

    invoke-virtual {v10, v9}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v10, "KP{x3}: {V="

    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v10, Ljava/math/BigInteger;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound1Payload;->getKnowledgeProofForX1()Lorg/bouncycastle/crypto/agreement/ecjpake/ECSchnorrZKP;

    move-result-object v12

    invoke-virtual {v12}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECSchnorrZKP;->getV()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v12

    invoke-virtual {v12, v6}, Lorg/bouncycastle/math/ec/ECPoint;->getEncoded(Z)[B

    move-result-object v12

    invoke-direct {v10, v12}, Ljava/math/BigInteger;-><init>([B)V

    invoke-virtual {v10, v9}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound1Payload;->getKnowledgeProofForX1()Lorg/bouncycastle/crypto/agreement/ecjpake/ECSchnorrZKP;

    move-result-object v10

    invoke-virtual {v10}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECSchnorrZKP;->getr()Ljava/math/BigInteger;

    move-result-object v10

    invoke-virtual {v10, v9}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v10, "KP{x4}: {V="

    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v10, Ljava/math/BigInteger;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound1Payload;->getKnowledgeProofForX2()Lorg/bouncycastle/crypto/agreement/ecjpake/ECSchnorrZKP;

    move-result-object v12

    invoke-virtual {v12}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECSchnorrZKP;->getV()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v12

    invoke-virtual {v12, v6}, Lorg/bouncycastle/math/ec/ECPoint;->getEncoded(Z)[B

    move-result-object v12

    invoke-direct {v10, v12}, Ljava/math/BigInteger;-><init>([B)V

    invoke-virtual {v10, v9}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound1Payload;->getKnowledgeProofForX2()Lorg/bouncycastle/crypto/agreement/ecjpake/ECSchnorrZKP;

    move-result-object v4

    invoke-virtual {v4}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECSchnorrZKP;->getr()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v4, v9}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v7}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKEParticipant;->validateRound1PayloadReceived(Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound1Payload;)V

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "Alice checks g^{x4}!=1: OK"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "Alice checks KP{x3}: OK"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "Alice checks KP{x4}: OK"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v7}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-virtual {v13, p0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKEParticipant;->validateRound1PayloadReceived(Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound1Payload;)V

    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v0, "Bob checks g^{x2}!=1: OK"

    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v0, "Bob checks KP{x1},: OK"

    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v0, "Bob checks KP{x2},: OK"

    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {p0, v7}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-virtual {v11}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKEParticipant;->createRound2PayloadToSend()Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound2Payload;

    move-result-object p0

    invoke-virtual {v13}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKEParticipant;->createRound2PayloadToSend()Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound2Payload;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v4, "************ Round 2 **************"

    invoke-virtual {v1, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v8, "A="

    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v8, Ljava/math/BigInteger;

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound2Payload;->getA()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v10

    invoke-virtual {v10, v6}, Lorg/bouncycastle/math/ec/ECPoint;->getEncoded(Z)[B

    move-result-object v10

    invoke-direct {v8, v10}, Ljava/math/BigInteger;-><init>([B)V

    invoke-virtual {v8, v9}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v8, "KP{x2*s}: {V="

    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v8, Ljava/math/BigInteger;

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound2Payload;->getKnowledgeProofForX2s()Lorg/bouncycastle/crypto/agreement/ecjpake/ECSchnorrZKP;

    move-result-object v10

    invoke-virtual {v10}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECSchnorrZKP;->getV()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v10

    invoke-virtual {v10, v6}, Lorg/bouncycastle/math/ec/ECPoint;->getEncoded(Z)[B

    move-result-object v10

    invoke-direct {v8, v10}, Ljava/math/BigInteger;-><init>([B)V

    invoke-virtual {v8, v9}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ", r="

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound2Payload;->getKnowledgeProofForX2s()Lorg/bouncycastle/crypto/agreement/ecjpake/ECSchnorrZKP;

    move-result-object v10

    invoke-virtual {v10}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECSchnorrZKP;->getr()Ljava/math/BigInteger;

    move-result-object v10

    invoke-virtual {v10, v9}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v7}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v4, "Bob sends to Alice"

    invoke-virtual {v1, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v10, "B="

    invoke-direct {v4, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v10, Ljava/math/BigInteger;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound2Payload;->getA()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v12

    invoke-virtual {v12, v6}, Lorg/bouncycastle/math/ec/ECPoint;->getEncoded(Z)[B

    move-result-object v12

    invoke-direct {v10, v12}, Ljava/math/BigInteger;-><init>([B)V

    invoke-virtual {v10, v9}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v10, "KP{x4*s}: {V="

    invoke-direct {v4, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v10, Ljava/math/BigInteger;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound2Payload;->getKnowledgeProofForX2s()Lorg/bouncycastle/crypto/agreement/ecjpake/ECSchnorrZKP;

    move-result-object v12

    invoke-virtual {v12}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECSchnorrZKP;->getV()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v12

    invoke-virtual {v12, v6}, Lorg/bouncycastle/math/ec/ECPoint;->getEncoded(Z)[B

    move-result-object v6

    invoke-direct {v10, v6}, Ljava/math/BigInteger;-><init>([B)V

    invoke-virtual {v10, v9}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound2Payload;->getKnowledgeProofForX2s()Lorg/bouncycastle/crypto/agreement/ecjpake/ECSchnorrZKP;

    move-result-object v6

    invoke-virtual {v6}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECSchnorrZKP;->getr()Ljava/math/BigInteger;

    move-result-object v6

    invoke-virtual {v6, v9}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v7}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKEParticipant;->validateRound2PayloadReceived(Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound2Payload;)V

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "Alice checks KP{x4*s}: OK\n"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-virtual {v13, p0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKEParticipant;->validateRound2PayloadReceived(Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound2Payload;)V

    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v0, "Bob checks KP{x2*s}: OK\n"

    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-virtual {v11}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKEParticipant;->calculateKeyingMaterial()Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {v13}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKEParticipant;->calculateKeyingMaterial()Ljava/math/BigInteger;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v4, "********* After round 2 ***********"

    invoke-virtual {v1, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Alice computes key material \t K="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v9}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Bob computes key material \t K="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1}, Ljava/io/PrintStream;->println()V

    invoke-static {p0}, Lorg/bouncycastle/crypto/examples/ECJPAKEExample;->deriveSessionKey(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    invoke-static {v0}, Lorg/bouncycastle/crypto/examples/ECJPAKEExample;->deriveSessionKey(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    invoke-virtual {v11, p0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKEParticipant;->createRound3PayloadToSend(Ljava/math/BigInteger;)Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound3Payload;

    move-result-object v1

    invoke-virtual {v13, v0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKEParticipant;->createRound3PayloadToSend(Ljava/math/BigInteger;)Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound3Payload;

    move-result-object v4

    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v6, "************ Round 3 **************"

    invoke-virtual {v5, v6}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v5, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "MacTag="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound3Payload;->getMacTag()Ljava/math/BigInteger;

    move-result-object v8

    invoke-virtual {v8, v9}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v7}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound3Payload;->getMacTag()Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v5, v9}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v7}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-virtual {v11, v4, p0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKEParticipant;->validateRound3PayloadReceived(Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound3Payload;Ljava/math/BigInteger;)V

    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "Alice checks MacTag: OK\n"

    invoke-virtual {p0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-virtual {v13, v1, v0}, Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKEParticipant;->validateRound3PayloadReceived(Lorg/bouncycastle/crypto/agreement/ecjpake/ECJPAKERound3Payload;Ljava/math/BigInteger;)V

    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v0, "Bob checks MacTag: OK\n"

    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {p0}, Ljava/io/PrintStream;->println()V

    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v0, "MacTags validated, therefore the keying material matches."

    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method
