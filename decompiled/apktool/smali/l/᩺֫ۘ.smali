.class public final Ll/᩺֫ۘ;
.super Ljava/lang/Object;
.source "N9H1"

# interfaces
.implements Ll/۬֫ۘ;


# static fields
.field public static final ۜ:[B

.field public static final ᩷:Ll/֫᩻֨;

.field public static final ᩻:[B


# instance fields
.field public ֫:Ljava/util/ArrayList;

.field public ۧ:[B

.field public ܳ:Ll/ۨ֫ۘ;

.field public ܽ:Ll/ۖ֫ۘ;

.field public ܿ:[B

.field public ᩳ:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 48
    const-class v0, Ll/᩺֫ۘ;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/᩺֫ۘ;->᩷:Ll/֫᩻֨;

    .line 49
    sget-object v0, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    const-string v1, "session key to client-to-server signing key magic constant\u0000"

    .line 50
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    sput-object v1, Ll/᩺֫ۘ;->ۜ:[B

    const-string v1, "session key to client-to-server sealing key magic constant\u0000"

    .line 52
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    sput-object v0, Ll/᩺֫ۘ;->᩻:[B

    return-void
.end method

.method public constructor <init>(Ll/ۨ֫ۘ;)V
    .locals 2

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Ll/᩺֫ۘ;->ᩳ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 63
    iput-object p1, p0, Ll/᩺֫ۘ;->ܳ:Ll/ۨ֫ۘ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗ֫ۘ;[BLl/ۜۧۘ;)Ll/᩻ۖ᩵;
    .locals 17

    move-object/from16 v1, p0

    .line 69
    iget-object v0, v1, Ll/᩺֫ۘ;->ܳ:Ll/ۨ֫ۘ;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    invoke-virtual {v0, v2, v3, v4}, Ll/ۨ֫ۘ;->֫(Ll/ۗ֫ۘ;[BLl/ۜۧۘ;)Ll/᩻ۖ᩵;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    return-object v2

    .line 74
    :cond_0
    invoke-virtual {v0}, Ll/᩻ۖ᩵;->᩻()[B

    move-result-object v3

    .line 75
    invoke-virtual {v0}, Ll/᩻ۖ᩵;->ۧ()Ljava/util/Set;

    move-result-object v4

    const/4 v5, 0x1

    const/4 v6, 0x2

    .line 76
    sget-object v7, Ll/᩺֫ۘ;->᩷:Ll/֫᩻֨;

    const/16 v8, 0x8

    const/4 v9, 0x0

    if-eqz v3, :cond_8

    const-string v10, "Calculating signing and sealing keys for NTLM Extended Session Security"

    .line 77
    invoke-interface {v7, v10}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 141
    sget-object v10, Ll/᩷ܰۖ;->ۤ:Ll/᩷ܰۖ;

    invoke-interface {v4, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    .line 142
    iget-object v2, v1, Ll/᩺֫ۘ;->ܽ:Ll/ۖ֫ۘ;

    new-array v11, v6, [[B

    aput-object v3, v11, v9

    sget-object v12, Ll/᩺֫ۘ;->ۜ:[B

    aput-object v12, v11, v5

    invoke-static {v2, v11}, Ll/ܽܰۖ;->֫(Ll/ۖ֫ۘ;[[B)[B

    move-result-object v2

    .line 78
    :cond_1
    iput-object v2, v1, Ll/᩺֫ۘ;->ܿ:[B

    .line 79
    invoke-virtual {v0}, Ll/᩻ۖ᩵;->ۜ()Ll/᩵ܰۖ;

    move-result-object v2

    .line 151
    invoke-interface {v4, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v10

    const/4 v11, 0x5

    const/4 v12, 0x7

    if-eqz v10, :cond_4

    .line 152
    sget-object v2, Ll/᩷ܰۖ;->᩶:Ll/᩷ܰۖ;

    invoke-interface {v4, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    .line 154
    :cond_2
    sget-object v2, Ll/᩷ܰۖ;->ۙ:Ll/᩷ܰۖ;

    invoke-interface {v4, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 155
    invoke-static {v3, v12}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v3

    goto :goto_0

    .line 157
    :cond_3
    invoke-static {v3, v11}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v3

    .line 160
    :goto_0
    iget-object v2, v1, Ll/᩺֫ۘ;->ܽ:Ll/ۖ֫ۘ;

    new-array v10, v6, [[B

    aput-object v3, v10, v9

    sget-object v3, Ll/᩺֫ۘ;->᩻:[B

    aput-object v3, v10, v5

    invoke-static {v2, v10}, Ll/ܽܰۖ;->֫(Ll/ۖ֫ۘ;[[B)[B

    move-result-object v2

    goto :goto_2

    .line 161
    :cond_4
    sget-object v10, Ll/᩷ܰۖ;->᩺:Ll/᩷ܰۖ;

    invoke-interface {v4, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_6

    sget-object v10, Ll/᩷ܰۖ;->۫:Ll/᩷ܰۖ;

    .line 162
    invoke-interface {v4, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    .line 163
    invoke-virtual {v2}, Ll/᩵ܰۖ;->֫()Ll/ۖܰۖ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۖܰۖ;->getValue()J

    move-result-wide v13

    sget-object v2, Ll/ۖܰۖ;->᩶:Ll/ۖܰۖ;

    .line 164
    invoke-virtual {v2}, Ll/ۖܰۖ;->getValue()J

    move-result-wide v15

    cmp-long v2, v13, v15

    if-ltz v2, :cond_5

    goto :goto_1

    .line 178
    :cond_5
    array-length v2, v3

    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v2

    goto :goto_2

    :cond_6
    :goto_1
    new-array v2, v8, [B

    .line 166
    sget-object v10, Ll/᩷ܰۖ;->ۙ:Ll/᩷ܰۖ;

    invoke-interface {v4, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    .line 167
    invoke-static {v3, v9, v2, v9, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v3, -0x60

    aput-byte v3, v2, v12

    goto :goto_2

    .line 170
    :cond_7
    invoke-static {v3, v9, v2, v9, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v3, -0x1b

    aput-byte v3, v2, v11

    const/4 v3, 0x6

    const/16 v10, 0x38

    aput-byte v10, v2, v3

    const/16 v3, -0x50

    aput-byte v3, v2, v12

    .line 79
    :goto_2
    iput-object v2, v1, Ll/᩺֫ۘ;->ۧ:[B

    .line 82
    :cond_8
    invoke-virtual {v0}, Ll/᩻ۖ᩵;->֫()Ll/ۙᩳۘ;

    move-result-object v2

    instance-of v2, v2, Ll/ܶᩳۘ;

    if-eqz v2, :cond_9

    .line 83
    invoke-virtual {v0}, Ll/᩻ۖ᩵;->֫()Ll/ۙᩳۘ;

    move-result-object v2

    check-cast v2, Ll/ܶᩳۘ;

    .line 84
    invoke-virtual {v2}, Ll/ܶᩳۘ;->֫()Ljava/util/ArrayList;

    move-result-object v2

    iput-object v2, v1, Ll/᩺֫ۘ;->֫:Ljava/util/ArrayList;

    .line 87
    :cond_9
    iget-object v2, v1, Ll/᩺֫ۘ;->ܿ:[B

    if-eqz v2, :cond_b

    invoke-virtual {v0}, Ll/᩻ۖ᩵;->֫()Ll/ۙᩳۘ;

    move-result-object v2

    instance-of v2, v2, Ll/᩸ᩳۘ;

    if-eqz v2, :cond_b

    .line 88
    invoke-virtual {v0}, Ll/᩻ۖ᩵;->֫()Ll/ۙᩳۘ;

    move-result-object v2

    check-cast v2, Ll/᩸ᩳۘ;

    const-string v3, "Signing with NTLM Extended Session Security"

    .line 89
    invoke-interface {v7, v3}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 90
    iget-object v3, v1, Ll/᩺֫ۘ;->ᩳ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v3

    .line 91
    iget-object v7, v1, Ll/᩺֫ۘ;->ܿ:[B

    and-int/lit16 v10, v3, 0xff

    int-to-byte v10, v10

    shr-int/lit8 v11, v3, 0x8

    and-int/lit16 v11, v11, 0xff

    int-to-byte v11, v11

    shr-int/lit8 v12, v3, 0x10

    and-int/lit16 v12, v12, 0xff

    int-to-byte v12, v12

    shr-int/lit8 v13, v3, 0x18

    and-int/lit16 v13, v13, 0xff

    int-to-byte v13, v13

    const/4 v14, 0x4

    new-array v14, v14, [B

    aput-byte v10, v14, v9

    aput-byte v11, v14, v5

    aput-byte v12, v14, v6

    const/4 v10, 0x3

    aput-byte v13, v14, v10

    .line 110
    iget-object v10, v1, Ll/᩺֫ۘ;->֫:Ljava/util/ArrayList;

    .line 129
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 130
    new-instance v10, Ll/֫۫ۖ;

    invoke-direct {v10, v11}, Ll/֫۫ۖ;-><init>(Ljava/util/ArrayList;)V

    .line 132
    new-instance v11, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v11}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 133
    new-instance v12, Ll/ܺ۬ۖ;

    new-instance v13, Ll/۠᩵ۚ;

    .line 20
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 133
    invoke-direct {v12, v13, v11}, Ll/ܺ۬ۖ;-><init>(Ll/۠᩵ۚ;Ljava/io/ByteArrayOutputStream;)V

    .line 134
    :try_start_0
    invoke-virtual {v12, v10}, Ll/ܺ۬ۖ;->֫(Ll/ۚ۬ۖ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    invoke-virtual {v12}, Ljava/io/OutputStream;->close()V

    .line 137
    invoke-virtual {v11}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v10

    .line 111
    iget-object v11, v1, Ll/᩺֫ۘ;->ܽ:Ll/ۖ֫ۘ;

    new-array v6, v6, [[B

    aput-object v14, v6, v9

    aput-object v10, v6, v5

    invoke-static {v11, v7, v6}, Ll/ܽܰۖ;->֫(Ll/ۖ֫ۘ;[B[[B)[B

    move-result-object v5

    new-array v6, v8, [B

    .line 114
    invoke-static {v5, v9, v6, v9, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 93
    sget-object v5, Ll/᩷ܰۖ;->ۨ:Ll/᩷ܰۖ;

    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    .line 94
    iget-object v4, v1, Ll/᩺֫ۘ;->ܽ:Ll/ۖ֫ۘ;

    iget-object v5, v1, Ll/᩺֫ۘ;->ۧ:[B

    invoke-static {v4, v5, v6}, Ll/ܽܰۖ;->֫(Ll/ۖ֫ۘ;[B[B)[B

    move-result-object v6

    .line 97
    :cond_a
    new-instance v4, Ll/֡֫ۘ;

    invoke-direct {v4}, Ll/֡֫ۘ;-><init>()V

    const-wide/16 v9, 0x1

    .line 98
    invoke-virtual {v4, v9, v10}, Ll/ۤܰۖ;->ۧ(J)V

    .line 99
    invoke-virtual {v4, v8, v6}, Ll/ۤܰۖ;->֫(I[B)V

    int-to-long v5, v3

    .line 100
    invoke-virtual {v4, v5, v6}, Ll/ۤܰۖ;->ۧ(J)V

    .line 102
    invoke-virtual {v4}, Ll/ۤܰۖ;->ᩳ()[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/᩸ᩳۘ;->ۧ([B)V

    return-object v0

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 133
    :try_start_1
    invoke-virtual {v12}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v2

    :cond_b
    return-object v0
.end method

.method public final ֫(Ll/ۙ֫ۘ;)V
    .locals 1

    .line 184
    iget-object v0, p0, Ll/᩺֫ۘ;->ܳ:Ll/ۨ֫ۘ;

    invoke-virtual {v0, p1}, Ll/ۨ֫ۘ;->֫(Ll/ۙ֫ۘ;)V

    .line 185
    invoke-virtual {p1}, Ll/ۙ֫ۘ;->᩻()Ll/ۖ֫ۘ;

    move-result-object p1

    iput-object p1, p0, Ll/᩺֫ۘ;->ܽ:Ll/ۖ֫ۘ;

    return-void
.end method

.method public final ֫(Ll/ۗ֫ۘ;)Z
    .locals 1

    .line 190
    iget-object v0, p0, Ll/᩺֫ۘ;->ܳ:Ll/ۨ֫ۘ;

    invoke-virtual {v0, p1}, Ll/ۨ֫ۘ;->֫(Ll/ۗ֫ۘ;)Z

    move-result p1

    return p1
.end method
