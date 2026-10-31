.class public final Ll/ᩳܰۖ;
.super Ljava/lang/Object;
.source "W9GW"


# instance fields
.field public ֫:Ljava/util/Random;

.field public ۧ:Ll/ۖ֫ۘ;


# direct methods
.method public constructor <init>(Ljava/util/Random;Ll/ۖ֫ۘ;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Ll/ᩳܰۖ;->֫:Ljava/util/Random;

    .line 34
    iput-object p2, p0, Ll/ᩳܰۖ;->ۧ:Ll/ۖ֫ۘ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ljava/lang/String;[CLl/ܳܰۖ;JLl/ۡܰۖ;)Ll/ۧܰۖ;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p7

    const/16 v4, 0x8

    new-array v5, v4, [B

    .line 65
    iget-object v6, v0, Ll/ᩳܰۖ;->֫:Ljava/util/Random;

    invoke-virtual {v6, v5}, Ljava/util/Random;->nextBytes([B)V

    .line 67
    invoke-static/range {p3 .. p3}, Ljava/lang/String;->valueOf([C)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6, v1, v2}, Ll/ᩳܰۖ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v6

    .line 68
    invoke-static/range {p3 .. p3}, Ljava/lang/String;->valueOf([C)Ljava/lang/String;

    move-result-object v7

    .line 108
    invoke-virtual {v0, v7, v1, v2}, Ll/ᩳܰۖ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v1

    .line 70
    invoke-virtual/range {p4 .. p4}, Ll/ܳܰۖ;->ۧ()[B

    move-result-object v2

    .line 121
    new-instance v7, Ll/۫ܰۖ;

    .line 42
    invoke-direct {v7}, Ll/ۤܰۖ;-><init>()V

    const/4 v8, 0x2

    new-array v9, v8, [[B

    const/4 v10, 0x0

    aput-object v2, v9, v10

    const/4 v2, 0x1

    aput-object v5, v9, v2

    .line 122
    iget-object v11, v0, Ll/ᩳܰۖ;->ۧ:Ll/ۖ֫ۘ;

    invoke-static {v11, v1, v9}, Ll/ܽܰۖ;->֫(Ll/ۖ֫ۘ;[B[[B)[B

    move-result-object v1

    .line 318
    array-length v9, v1

    invoke-virtual {v7, v9, v1}, Ll/ۤܰۖ;->֫(I[B)V

    invoke-virtual {v7, v4, v5}, Ll/ۤܰۖ;->֫(I[B)V

    .line 125
    invoke-virtual {v7}, Ll/ۤܰۖ;->ᩳ()[B

    move-result-object v1

    .line 73
    invoke-virtual/range {p4 .. p4}, Ll/ܳܰۖ;->ۧ()[B

    move-result-object v7

    .line 174
    new-instance v9, Ll/۫ܰۖ;

    .line 42
    invoke-direct {v9}, Ll/ۤܰۖ;-><init>()V

    .line 175
    invoke-virtual {v9, v2}, Ll/ۤܰۖ;->֫(B)V

    .line 176
    invoke-virtual {v9, v2}, Ll/ۤܰۖ;->֫(B)V

    .line 177
    invoke-virtual {v9, v10}, Ll/ۤܰۖ;->ۧ(I)V

    const-wide/16 v12, 0x0

    .line 178
    invoke-virtual {v9, v12, v13}, Ll/ۤܰۖ;->ۧ(J)V

    move-wide/from16 v14, p5

    .line 179
    invoke-virtual {v9, v14, v15}, Ll/ۤܰۖ;->֫(J)V

    .line 318
    invoke-virtual {v9, v4, v5}, Ll/ۤܰۖ;->֫(I[B)V

    .line 181
    invoke-virtual {v9, v12, v13}, Ll/ۤܰۖ;->ۧ(J)V

    if-eqz v3, :cond_0

    .line 183
    invoke-virtual {v3, v9}, Ll/ۡܰۖ;->ۧ(Ll/۫ܰۖ;)V

    .line 185
    :cond_0
    invoke-virtual {v9, v12, v13}, Ll/ۤܰۖ;->ۧ(J)V

    .line 187
    invoke-virtual {v9}, Ll/ۤܰۖ;->ᩳ()[B

    move-result-object v3

    new-array v4, v8, [[B

    aput-object v7, v4, v10

    aput-object v3, v4, v2

    .line 201
    invoke-static {v11, v6, v4}, Ll/ܽܰۖ;->֫(Ll/ۖ֫ۘ;[B[[B)[B

    move-result-object v4

    .line 144
    array-length v5, v4

    array-length v7, v3

    add-int/2addr v5, v7

    new-array v5, v5, [B

    .line 145
    array-length v7, v4

    invoke-static {v4, v10, v5, v10, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 146
    array-length v4, v4

    array-length v7, v3

    invoke-static {v3, v10, v5, v4, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v3, 0x10

    .line 76
    invoke-static {v5, v10, v3}, Lorg/bouncycastle/util/Arrays;->copyOfRange([BII)[B

    move-result-object v3

    new-array v2, v2, [[B

    aput-object v3, v2, v10

    .line 161
    invoke-static {v11, v6, v2}, Ll/ܽܰۖ;->֫(Ll/ۖ֫ۘ;[B[[B)[B

    move-result-object v2

    .line 79
    new-instance v3, Ll/ۧܰۖ;

    invoke-direct {v3, v5, v1, v2}, Ll/ۧܰۖ;-><init>([B[B[B)V

    return-object v3
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[B
    .locals 3

    .line 92
    iget-object v0, p0, Ll/ᩳܰۖ;->ۧ:Ll/ۖ֫ۘ;

    const/4 v1, 0x0

    if-nez p1, :cond_0

    sget-object p1, Ll/ܽܰۖ;->֫:Ljava/nio/charset/Charset;

    new-array p1, v1, [B

    goto :goto_0

    .line 48
    :cond_0
    sget-object v2, Ll/ܽܰۖ;->֫:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    :goto_0
    :try_start_0
    const-string v2, "MD4"

    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Ll/ۖ֫ۘ;->֫(Ljava/lang/String;)Ll/ܺ֫ۘ;

    move-result-object v2

    .line 75
    invoke-virtual {v2, p1}, Ll/ܺ֫ۘ;->֫([B)V

    .line 76
    invoke-virtual {v2}, Ll/ܺ֫ۘ;->֫()[B

    move-result-object p1
    :try_end_0
    .catch Ll/۠۟ۖ; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    invoke-virtual {p2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_1

    new-array p2, v1, [B

    goto :goto_1

    .line 48
    :cond_1
    sget-object v2, Ll/ܽܰۖ;->֫:Ljava/nio/charset/Charset;

    invoke-virtual {p2, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p2

    :goto_1
    if-nez p3, :cond_2

    new-array p3, v1, [B

    goto :goto_2

    :cond_2
    sget-object v2, Ll/ܽܰۖ;->֫:Ljava/nio/charset/Charset;

    invoke-virtual {p3, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p3

    :goto_2
    const/4 v2, 0x2

    new-array v2, v2, [[B

    aput-object p2, v2, v1

    const/4 p2, 0x1

    aput-object p3, v2, p2

    .line 95
    invoke-static {v0, p1, v2}, Ll/ܽܰۖ;->֫(Ll/ۖ֫ۘ;[B[[B)[B

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 78
    new-instance p2, Ll/ۙ᩺ۖ;

    .line 34
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 78
    throw p2
.end method
