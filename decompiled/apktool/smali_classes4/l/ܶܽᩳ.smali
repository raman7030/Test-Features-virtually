.class public abstract Ll/ܶܽᩳ;
.super Ljava/lang/Object;
.source "B1VV"


# static fields
.field public static final ܽ:Ljava/util/HashMap;


# instance fields
.field public ֫:[B

.field public ۧ:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 29
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/ܶܽᩳ;->ܽ:Ljava/util/HashMap;

    const/16 v1, 0x101

    .line 35
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ll/ۜܽᩳ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x102

    .line 36
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ll/᩷ܽᩳ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x103

    .line 37
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ll/ۢܽᩳ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x104

    .line 38
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ll/ۡܽᩳ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x201

    .line 39
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ll/ܺܽᩳ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x202

    .line 40
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ll/ۖܽᩳ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x301

    .line 41
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ll/ۘܽᩳ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x421

    .line 42
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ll/ᩴܽᩳ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x423

    .line 43
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ll/᩵ܽᩳ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x425

    .line 44
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ll/֡ܽᩳ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(J)I
    .locals 2

    const-wide/32 v0, 0xfffff

    add-long/2addr p0, v0

    const-wide/32 v0, 0x100000

    .line 132
    div-long/2addr p0, v0

    long-to-int p1, p0

    return p1
.end method

.method public static ֫(I)Ll/ܶܽᩳ;
    .locals 1

    .line 60
    sget-object v0, Ll/ܶܽᩳ;->ܽ:Ljava/util/HashMap;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/function/Supplier;

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 64
    :cond_0
    invoke-interface {p0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܶܽᩳ;

    return-object p0
.end method

.method public static ֫(Ljava/security/MessageDigest;Ll/֡ܿᩳ;Ljava/io/OutputStream;Ll/ܿۖ᩷;)V
    .locals 12

    .line 111
    invoke-interface {p1}, Ll/֡ܿᩳ;->size()J

    move-result-wide v0

    const-wide/32 v2, 0xfffff

    add-long/2addr v0, v2

    const-wide/32 v2, 0x100000

    .line 132
    div-long/2addr v0, v2

    long-to-int v1, v0

    const/4 v0, 0x5

    new-array v0, v0, [B

    const/16 v4, -0x5b

    const/4 v5, 0x0

    aput-byte v4, v0, v5

    :goto_0
    if-ge v5, v1, :cond_1

    .line 116
    invoke-interface {p1}, Ll/֡ܿᩳ;->֫()J

    move-result-wide v6

    add-long v8, v6, v2

    .line 117
    invoke-interface {p1}, Ll/֡ܿᩳ;->size()J

    move-result-wide v10

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v8

    sub-long/2addr v8, v6

    long-to-int v4, v8

    const/4 v6, 0x1

    .line 119
    invoke-static {v4, v6, v0}, Ll/᩺ۧᩳ;->֫(II[B)V

    .line 121
    invoke-virtual {p0, v0}, Ljava/security/MessageDigest;->update([B)V

    int-to-long v6, v4

    .line 122
    invoke-interface {p1, p0, v6, v7}, Ll/֡ܿᩳ;->֫(Ljava/security/MessageDigest;J)V

    .line 124
    invoke-virtual {p0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v4

    .line 126
    invoke-virtual {p2, v4}, Ljava/io/OutputStream;->write([B)V

    .line 127
    invoke-interface {p3}, Ll/ܿۖ᩷;->᩻()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public static ۧ(I)Ll/ܶܽᩳ;
    .locals 3

    .line 52
    sget-object v0, Ll/ܶܽᩳ;->ܽ:Ljava/util/HashMap;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/function/Supplier;

    if-eqz v0, :cond_0

    .line 56
    invoke-interface {v0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܶܽᩳ;

    return-object p0

    .line 54
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported signature algorithm id: 0x"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v1, p0}, Ll/ܰۗ;->֫(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    move-result-object p0

    .line 54
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public abstract ֫()I
.end method

.method public final ֫(Ljava/security/PrivateKey;Ljava/security/PublicKey;[B)V
    .locals 6

    const-string v0, "Failed to sign using "

    const-string v1, " signature using public key from certificate"

    const-string v2, "Failed to verify generated "

    .line 171
    invoke-virtual {p0}, Ll/ܶܽᩳ;->ᩳ()Ljava/lang/String;

    move-result-object v3

    .line 172
    invoke-virtual {p0}, Ll/ܶܽᩳ;->ܿ()Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object v4

    .line 175
    :try_start_0
    invoke-static {v3}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v5

    .line 176
    invoke-virtual {v5, p1}, Ljava/security/Signature;->initSign(Ljava/security/PrivateKey;)V

    if-eqz v4, :cond_0

    .line 178
    invoke-virtual {v5, v4}, Ljava/security/Signature;->setParameter(Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 180
    :cond_0
    invoke-virtual {v5, p3}, Ljava/security/Signature;->update([B)V

    .line 181
    invoke-virtual {v5}, Ljava/security/Signature;->sign()[B

    move-result-object p1
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/security/SignatureException; {:try_start_0 .. :try_end_0} :catch_3

    .line 188
    :try_start_1
    invoke-static {v3}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v0

    .line 189
    invoke-virtual {v0, p2}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    if-eqz v4, :cond_1

    .line 191
    invoke-virtual {v0, v4}, Ljava/security/Signature;->setParameter(Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 193
    :cond_1
    invoke-virtual {v0, p3}, Ljava/security/Signature;->update([B)V

    .line 194
    invoke-virtual {v0, p1}, Ljava/security/Signature;->verify([B)Z

    move-result p2
    :try_end_1
    .catch Ljava/security/InvalidKeyException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/SignatureException; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz p2, :cond_2

    .line 208
    iput-object p1, p0, Ll/ܶܽᩳ;->ۧ:[B

    return-void

    .line 195
    :cond_2
    :try_start_2
    new-instance p1, Ljava/security/SignatureException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catch Ljava/security/InvalidKeyException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/security/SignatureException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 204
    :goto_0
    new-instance p2, Ljava/security/SignatureException;

    .line 0
    invoke-static {v2, v3, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 204
    invoke-direct {p2, p3, p1}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_2
    move-exception p1

    .line 200
    new-instance p2, Ljava/security/InvalidKeyException;

    .line 0
    invoke-static {v2, v3, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 200
    invoke-direct {p2, p3, p1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_3
    move-exception p1

    goto :goto_1

    :catch_4
    move-exception p1

    .line 185
    :goto_1
    new-instance p2, Ljava/security/SignatureException;

    .line 0
    invoke-static {v0, v3}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 185
    invoke-direct {p2, p3, p1}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_5
    move-exception p1

    .line 183
    new-instance p2, Ljava/security/InvalidKeyException;

    .line 0
    invoke-static {v0, v3}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 183
    invoke-direct {p2, p3, p1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public abstract ֫(Ll/֡ܿᩳ;Ll/֡ܿᩳ;Ll/֡ܿᩳ;Ll/ܿۖ᩷;)V
.end method

.method public final ֫(Ljava/security/PublicKey;[B[B)Z
    .locals 5

    const-string v0, " signature using public key from certificate"

    const-string v1, "Failed to verify generated "

    .line 149
    invoke-virtual {p0}, Ll/ܶܽᩳ;->ᩳ()Ljava/lang/String;

    move-result-object v2

    .line 150
    invoke-virtual {p0}, Ll/ܶܽᩳ;->ܿ()Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object v3

    .line 152
    :try_start_0
    invoke-static {v2}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v4

    .line 153
    invoke-virtual {v4, p1}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    if-eqz v3, :cond_0

    .line 155
    invoke-virtual {v4, v3}, Ljava/security/Signature;->setParameter(Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 157
    :cond_0
    invoke-virtual {v4, p2}, Ljava/security/Signature;->update([B)V

    .line 158
    invoke-virtual {v4, p3}, Ljava/security/Signature;->verify([B)Z

    move-result p1
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/SignatureException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 164
    :goto_0
    new-instance p2, Ljava/security/SignatureException;

    .line 0
    invoke-static {v1, v2, v0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 164
    invoke-direct {p2, p3, p1}, Ljava/security/SignatureException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_2
    move-exception p1

    .line 160
    new-instance p2, Ljava/security/InvalidKeyException;

    .line 0
    invoke-static {v1, v2, v0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 160
    invoke-direct {p2, p3, p1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public abstract ۧ()Ljava/lang/String;
.end method

.method public abstract ܽ()I
.end method

.method public abstract ܿ()Ljava/security/spec/AlgorithmParameterSpec;
.end method

.method public abstract ᩳ()Ljava/lang/String;
.end method
