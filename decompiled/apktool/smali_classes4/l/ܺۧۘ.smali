.class public final Ll/ܺۧۘ;
.super Ljava/lang/Object;
.source "V9I0"


# static fields
.field public static final ᩳ:Ll/֫᩻֨;


# instance fields
.field public ֫:Ll/֡ۨۖ;

.field public ۧ:Ll/᩹ۛۖ;

.field public ܽ:Ll/ۖ֫ۘ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 43
    const-class v0, Ll/ܺۧۘ;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ܺۧۘ;->ᩳ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ll/ۖ֫ۘ;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Ll/ܺۧۘ;->ܽ:Ll/ۖ֫ۘ;

    return-void
.end method

.method public static ֫(Ll/ᩴۨۖ;Ll/֡֫ۘ;)I
    .locals 0

    .line 294
    invoke-virtual {p0}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object p0

    check-cast p0, Ll/ۡۨۖ;

    invoke-virtual {p0}, Ll/ۡۨۖ;->ܿ()I

    move-result p0

    .line 295
    invoke-virtual {p1}, Ll/ۤܰۖ;->ܽ()I

    move-result p1

    if-lt p1, p0, :cond_0

    return p0

    .line 296
    :cond_0
    new-instance p0, Ll/۬ܰۖ;

    const-string p1, "Underflow"

    .line 36
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 296
    throw p0
.end method

.method public static bridge synthetic ֫(Ll/ܺۧۘ;)Ll/֡ۨۖ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۧۘ;->֫:Ll/֡ۨۖ;

    return-object p0
.end method

.method public static ֫(JI[B)V
    .locals 3

    long-to-int v0, p0

    int-to-byte v0, v0

    .line 330
    aput-byte v0, p3, p2

    add-int/lit8 v0, p2, 0x1

    const/16 v1, 0x8

    ushr-long v1, p0, v1

    long-to-int v2, v1

    int-to-byte v1, v2

    .line 331
    aput-byte v1, p3, v0

    add-int/lit8 v0, p2, 0x2

    const/16 v1, 0x10

    ushr-long v1, p0, v1

    long-to-int v2, v1

    int-to-byte v1, v2

    .line 332
    aput-byte v1, p3, v0

    add-int/lit8 v0, p2, 0x3

    const/16 v1, 0x18

    ushr-long v1, p0, v1

    long-to-int v2, v1

    int-to-byte v1, v2

    .line 333
    aput-byte v1, p3, v0

    add-int/lit8 v0, p2, 0x4

    const/16 v1, 0x20

    ushr-long v1, p0, v1

    long-to-int v2, v1

    int-to-byte v1, v2

    .line 334
    aput-byte v1, p3, v0

    add-int/lit8 v0, p2, 0x5

    const/16 v1, 0x28

    ushr-long v1, p0, v1

    long-to-int v2, v1

    int-to-byte v1, v2

    .line 335
    aput-byte v1, p3, v0

    add-int/lit8 v0, p2, 0x6

    const/16 v1, 0x30

    ushr-long v1, p0, v1

    long-to-int v2, v1

    int-to-byte v1, v2

    .line 336
    aput-byte v1, p3, v0

    add-int/lit8 p2, p2, 0x7

    const/16 v0, 0x38

    ushr-long/2addr p0, v0

    long-to-int p1, p0

    int-to-byte p0, p1

    .line 337
    aput-byte p0, p3, p2

    return-void
.end method

.method public static ֫(Ll/ۡۨۖ;)[B
    .locals 5

    const/16 v0, 0x20

    new-array v0, v0, [B

    .line 138
    invoke-virtual {p0}, Ll/ۡۨۖ;->ᩳ()[B

    move-result-object v1

    .line 305
    array-length v2, v1

    const/16 v3, 0x10

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/4 v4, 0x0

    invoke-static {v1, v4, v0, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 139
    invoke-virtual {p0}, Ll/ۡۨۖ;->ܿ()I

    move-result v1

    int-to-byte v2, v1

    aput-byte v2, v0, v3

    ushr-int/lit8 v2, v1, 0x8

    int-to-byte v2, v2

    const/16 v3, 0x11

    aput-byte v2, v0, v3

    ushr-int/lit8 v2, v1, 0x10

    int-to-byte v2, v2

    const/16 v3, 0x12

    aput-byte v2, v0, v3

    const/16 v2, 0x18

    ushr-int/2addr v1, v2

    int-to-byte v1, v1

    const/16 v3, 0x13

    aput-byte v1, v0, v3

    .line 140
    invoke-virtual {p0}, Ll/ۡۨۖ;->ܳ()I

    move-result v1

    int-to-byte v3, v1

    const/16 v4, 0x14

    aput-byte v3, v0, v4

    ushr-int/lit8 v1, v1, 0x8

    int-to-byte v1, v1

    const/16 v3, 0x15

    aput-byte v1, v0, v3

    .line 141
    invoke-virtual {p0}, Ll/ۡۨۖ;->ܽ()I

    move-result v1

    int-to-byte v3, v1

    const/16 v4, 0x16

    aput-byte v3, v0, v4

    ushr-int/lit8 v1, v1, 0x8

    int-to-byte v1, v1

    const/16 v3, 0x17

    aput-byte v1, v0, v3

    .line 142
    invoke-virtual {p0}, Ll/ۡۨۖ;->᩻()J

    move-result-wide v3

    invoke-static {v3, v4, v2, v0}, Ll/ܺۧۘ;->֫(JI[B)V

    return-object v0
.end method

.method public static bridge synthetic ۧ()Ll/֫᩻֨;
    .locals 1

    .line 0
    sget-object v0, Ll/ܺۧۘ;->ᩳ:Ll/֫᩻֨;

    return-object v0
.end method

.method public static bridge synthetic ۧ(Ll/ܺۧۘ;)Ll/ۖ֫ۘ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۧۘ;->ܽ:Ll/ۖ֫ۘ;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ܽۨۖ;Ljavax/crypto/SecretKey;)Ll/ܽۨۖ;
    .locals 2

    if-eqz p2, :cond_0

    .line 126
    new-instance v0, Ll/ۡۧۘ;

    invoke-direct {v0, p0, p1, p2}, Ll/ۡۧۘ;-><init>(Ll/ܺۧۘ;Ll/ܽۨۖ;Ljavax/crypto/SecretKey;)V

    return-object v0

    .line 128
    :cond_0
    invoke-virtual {p1}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object p2

    check-cast p2, Ll/᩻ۨۖ;

    invoke-virtual {p2}, Ll/᩻ۨۖ;->᩻()Ll/᩺ۛۖ;

    move-result-object p2

    sget-object v0, Ll/ܺۧۘ;->ᩳ:Ll/֫᩻֨;

    const-string v1, "Not wrapping {} as encrypted, as no key is set."

    invoke-interface {v0, p2, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final ֫(Ll/ۜۧۘ;)V
    .locals 2

    .line 71
    invoke-virtual {p1}, Ll/ۜۧۘ;->ܳ()Ll/᩷ۧۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩷ۧۘ;->֫()Ll/᩹ۛۖ;

    move-result-object v0

    iput-object v0, p0, Ll/ܺۧۘ;->ۧ:Ll/᩹ۛۖ;

    .line 74
    invoke-virtual {p1}, Ll/ۜۧۘ;->ܳ()Ll/᩷ۧۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩷ۧۘ;->֫()Ll/᩹ۛۖ;

    move-result-object v0

    sget-object v1, Ll/᩹ۛۖ;->ۤ:Ll/᩹ۛۖ;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 75
    invoke-virtual {p1}, Ll/ۜۧۘ;->ۧ()Ll/֡ۨۖ;

    move-result-object p1

    iput-object p1, p0, Ll/ܺۧۘ;->֫:Ll/֡ۨۖ;

    goto :goto_0

    .line 77
    :cond_0
    sget-object p1, Ll/֡ۨۖ;->۬:Ll/֡ۨۖ;

    iput-object p1, p0, Ll/ܺۧۘ;->֫:Ll/֡ۨۖ;

    :goto_0
    const-string p1, "Initialized PacketEncryptor with Cipher << {} >>"

    .line 79
    iget-object v0, p0, Ll/ܺۧۘ;->֫:Ll/֡ۨۖ;

    sget-object v1, Ll/ܺۧۘ;->ᩳ:Ll/֫᩻֨;

    invoke-interface {v1, v0, p1}, Ll/֫᩻֨;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ll/ᩴۨۖ;)Z
    .locals 1

    .line 83
    iget-object v0, p0, Ll/ܺۧۘ;->ۧ:Ll/᩹ۛۖ;

    invoke-virtual {v0}, Ll/᩹ۛۖ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 84
    invoke-virtual {p1}, Ll/۠֫ۘ;->֫()Ll/֡֫ۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۤܰۖ;->ܽ()I

    move-result v0

    if-eqz v0, :cond_0

    .line 85
    invoke-virtual {p1}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object p1

    check-cast p1, Ll/ۡۨۖ;

    .line 158
    invoke-virtual {p1}, Ll/ۡۨۖ;->ܽ()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫()[B
    .locals 4

    .line 150
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    .line 151
    iget-object v2, p0, Ll/ܺۧۘ;->֫:Ll/֡ۨۖ;

    invoke-virtual {v2}, Ll/֡ۨۖ;->ܿ()I

    move-result v2

    new-array v2, v2, [B

    const/4 v3, 0x0

    .line 152
    invoke-static {v0, v1, v3, v2}, Ll/ܺۧۘ;->֫(JI[B)V

    return-object v2
.end method

.method public final ֫(Ll/ᩴۨۖ;Ljavax/crypto/SecretKey;)[B
    .locals 12

    .line 93
    sget-object v0, Ll/ܺۧۘ;->ᩳ:Ll/֫᩻֨;

    :try_start_0
    invoke-virtual {p1}, Ll/۠֫ۘ;->֫()Ll/֡֫ۘ;

    move-result-object v1

    .line 94
    invoke-static {p1, v1}, Ll/ܺۧۘ;->֫(Ll/ᩴۨۖ;Ll/֡֫ۘ;)I

    move-result v2

    .line 95
    invoke-virtual {p1}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v3

    check-cast v3, Ll/ۡۨۖ;

    invoke-static {v3}, Ll/ܺۧۘ;->֫(Ll/ۡۨۖ;)[B

    move-result-object v3

    .line 96
    invoke-virtual {p1}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v4

    check-cast v4, Ll/ۡۨۖ;

    invoke-virtual {v4}, Ll/ۡۨۖ;->ۜ()[B

    move-result-object v4
    :try_end_0
    .catch Ll/۬ܰۖ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/۠۟ۖ; {:try_start_0 .. :try_end_0} :catch_0

    .line 103
    :try_start_1
    iget-object v5, p0, Ll/ܺۧۘ;->ܽ:Ll/ۖ֫ۘ;

    iget-object v6, p0, Ll/ܺۧۘ;->֫:Ll/֡ۨۖ;

    invoke-virtual {v6}, Ll/֡ۨۖ;->֫()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    invoke-static {v6}, Ll/ۗ۟ۖ;->֫(Ljava/lang/String;)Ll/ۘ۟ۖ;

    move-result-object v5

    .line 104
    sget-object v6, Ll/ᩴ۟ۖ;->᩹:Ll/ᩴ۟ۖ;

    invoke-interface {p2}, Ljava/security/Key;->getEncoded()[B

    move-result-object p2

    new-instance v7, Ljavax/crypto/spec/GCMParameterSpec;

    .line 105
    invoke-virtual {p1}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v8

    check-cast v8, Ll/ۡۨۖ;

    invoke-virtual {v8}, Ll/ۡۨۖ;->ᩳ()[B

    move-result-object v8

    iget-object v9, p0, Ll/ܺۧۘ;->֫:Ll/֡ۨۖ;

    invoke-virtual {v9}, Ll/֡ۨۖ;->ܿ()I

    move-result v9

    const/4 v10, 0x0

    const/16 v11, 0x80

    invoke-direct {v7, v11, v8, v10, v9}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[BII)V

    .line 104
    invoke-interface {v5, v6, p2, v7}, Ll/ۘ۟ۖ;->֫(Ll/ᩴ۟ۖ;[BLjavax/crypto/spec/GCMParameterSpec;)V

    .line 106
    invoke-interface {v5, v3}, Ll/ۘ۟ۖ;->֫([B)V

    .line 107
    invoke-virtual {v1}, Ll/ۤܰۖ;->֫()[B

    move-result-object p2

    invoke-virtual {v1}, Ll/ۤܰۖ;->ۡ()I

    move-result v1

    invoke-interface {v5, p2, v1, v2}, Ll/ۘ۟ۖ;->update([BII)[B

    move-result-object p2

    .line 108
    array-length v1, v4

    invoke-interface {v5, v1, v4}, Ll/ۘ۟ۖ;->ۧ(I[B)[B

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 276
    :try_start_2
    array-length v2, p2

    .line 277
    array-length v3, v1

    if-nez v2, :cond_0

    return-object v1

    :cond_0
    if-nez v3, :cond_1

    return-object p2

    :cond_1
    add-int v4, v2, v3

    .line 284
    new-array v4, v4, [B

    .line 285
    invoke-static {p2, v10, v4, v10, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 286
    invoke-static {v1, v10, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v4

    :catchall_0
    move-exception p2

    .line 113
    throw p2
    :try_end_2
    .catch Ll/۬ܰۖ; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ll/۠۟ۖ; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception p2

    const-string v1, "Security exception while decrypting packet << {} >>"

    .line 119
    invoke-interface {v0, p1, v1}, Ll/֫᩻֨;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    new-instance p1, Ll/ۧۧۘ;

    .line 34
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 120
    throw p1

    :catch_1
    move-exception p2

    const-string v1, "Could not read cipherText from packet << {} >>"

    .line 116
    invoke-interface {v0, p1, v1}, Ll/֫᩻֨;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    new-instance p1, Ll/ۧۧۘ;

    const-string v0, "Could not read cipherText from packet"

    .line 42
    invoke-direct {p1, v0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 117
    throw p1
.end method
