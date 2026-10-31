.class public final Ll/ܺܺ᩵;
.super Ljava/lang/Object;
.source "D9YD"

# interfaces
.implements Ll/ۜܺ᩵;
.implements Ljava/lang/AutoCloseable;


# static fields
.field public static final ۛ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static final synthetic ۤ:I


# instance fields
.field public ۗ:Ll/ۨۚ᩵;

.field public ۙ:I

.field public ۫:Ll/ᩴۡ᩵;

.field public ۬:I

.field public ᩶:I

.field public final ᩸:Ll/᩻ܺ᩵;

.field public ᩹:Ll/ܰۚ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 125
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Ll/ܺܺ᩵;->ۛ:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/ᩴۡ᩵;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 55
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 61
    :cond_0
    aget-char v11, v3, v5

    const/4 v12, 0x1

    if-eqz v6, :cond_b

    const/16 v13, 0x5d

    const/4 v14, 0x5

    const/4 v15, 0x2

    if-eq v6, v12, :cond_6

    if-eq v6, v15, :cond_8

    if-eq v6, v14, :cond_1

    .line 112
    array-length v5, v3

    goto/16 :goto_2

    :cond_1
    const/16 v14, 0x3d

    if-ne v11, v14, :cond_2

    .line 98
    invoke-virtual {v1, v7, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    :cond_2
    const/16 v14, 0x2c

    if-eq v11, v14, :cond_3

    if-ne v11, v13, :cond_c

    .line 101
    :cond_3
    invoke-virtual {v1, v7, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    add-int/lit8 v11, v5, 0x1

    if-nez v8, :cond_4

    const-string v8, "endpoint"

    :cond_4
    if-eqz v9, :cond_5

    .line 106
    invoke-virtual {v9, v8, v7}, Ll/᩻ܺ᩵;->֫(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    const/4 v7, 0x0

    move-object v8, v7

    move v7, v11

    goto :goto_2

    :cond_6
    const/16 v14, 0x5c

    if-ne v11, v14, :cond_7

    :goto_0
    add-int/lit8 v7, v5, 0x1

    goto :goto_2

    :cond_7
    const/4 v6, 0x2

    :cond_8
    const/16 v14, 0x5b

    if-ne v11, v14, :cond_c

    .line 79
    invoke-virtual {v1, v7, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    .line 80
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_a

    add-int/lit8 v6, v5, 0x1

    .line 82
    invoke-virtual {v1, v14, v6}, Ljava/lang/String;->indexOf(II)I

    move-result v6

    .line 83
    invoke-virtual {v1, v13, v5}, Ljava/lang/String;->indexOf(II)I

    move-result v7

    if-ltz v6, :cond_9

    if-ltz v7, :cond_9

    add-int/lit8 v9, v6, -0x1

    if-ne v7, v9, :cond_9

    add-int/lit8 v7, v7, 0x1

    .line 85
    invoke-virtual {v1, v5, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    move/from16 v16, v6

    move-object v6, v5

    move/from16 v5, v16

    goto :goto_1

    :cond_9
    const-string v6, "127.0.0.1"

    .line 91
    :cond_a
    :goto_1
    new-instance v7, Ll/᩻ܺ᩵;

    invoke-direct {v7, v10, v6}, Ll/᩻ܺ᩵;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v6, v5, 0x1

    const/4 v9, 0x5

    move-object v9, v7

    move v7, v6

    const/4 v6, 0x5

    goto :goto_2

    :cond_b
    const/16 v13, 0x3a

    if-ne v11, v13, :cond_c

    .line 66
    invoke-virtual {v1, v7, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    add-int/lit8 v7, v5, 0x1

    const/4 v10, 0x1

    move-object v10, v6

    const/4 v6, 0x1

    :cond_c
    :goto_2
    add-int/2addr v5, v12

    .line 117
    array-length v11, v3

    if-lt v5, v11, :cond_0

    if-eqz v9, :cond_10

    .line 119
    invoke-virtual {v9}, Ll/᩻ܺ᩵;->֫()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_10

    .line 148
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const/16 v1, 0x10b8

    .line 128
    iput v1, v0, Ll/ܺܺ᩵;->ۙ:I

    .line 129
    iput v1, v0, Ll/ܺܺ᩵;->᩶:I

    .line 130
    iput v4, v0, Ll/ܺܺ᩵;->۬:I

    .line 149
    iput-object v2, v0, Ll/ܺܺ᩵;->۫:Ll/ᩴۡ᩵;

    .line 150
    iput-object v9, v0, Ll/ܺܺ᩵;->᩸:Ll/᩻ܺ᩵;

    .line 55
    new-instance v1, Ll/ۨۚ᩵;

    .line 62
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "smb://"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, Ll/᩻ܺ᩵;->ᩳ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "/IPC$/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ll/᩻ܺ᩵;->֫()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x6

    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "server"

    .line 65
    invoke-virtual {v9, v4}, Ll/᩻ܺ᩵;->֫(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_d

    const-string v5, "&server="

    .line 67
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_3

    :cond_d
    const-string v4, ""

    :goto_3
    const-string v5, "address"

    .line 69
    invoke-virtual {v9, v5}, Ll/᩻ܺ᩵;->֫(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_e

    const-string v6, "&address="

    .line 0
    invoke-static {v4, v6, v5}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 73
    :cond_e
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_f

    const-string v5, "?"

    .line 0
    invoke-static {v3, v5}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v12, v4, v3}, Ll/᩶ۢۢ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v3

    .line 55
    :cond_f
    invoke-direct {v1, v3, v2}, Ll/ۨۚ᩵;-><init>(Ljava/lang/String;Ll/ᩴۡ᩵;)V

    iput-object v1, v0, Ll/ܺܺ᩵;->ۗ:Ll/ۨۚ᩵;

    .line 56
    invoke-virtual {v1}, Ll/ۨۚ᩵;->᩵()Ll/ܰۚ᩵;

    move-result-object v1

    invoke-interface {v1}, Ll/ܰۚ᩵;->ۧ()Ll/ܰۚ᩵;

    iput-object v1, v0, Ll/ܺܺ᩵;->᩹:Ll/ܰۚ᩵;

    return-void

    .line 120
    :cond_10
    new-instance v2, Ll/ۢܺ᩵;

    const-string v3, "Invalid binding URL: "

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 58
    invoke-direct {v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 120
    throw v2
.end method

.method private ֫(Ll/ۡܺ᩵;[BLl/۬ܺ᩵;)I
    .locals 7

    .line 128
    iget-object v0, p3, Ll/۬ܺ᩵;->ۧ:Ll/۬ܺ᩵;

    iget v0, v0, Ll/۬ܺ᩵;->ᩳ:I

    add-int/lit8 v0, v0, -0x18

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_5

    sub-int v3, v0, v2

    add-int/lit8 v4, v3, 0x18

    const/4 v5, 0x2

    .line 288
    iget v6, p0, Ll/ܺܺ᩵;->ۙ:I

    if-le v4, v6, :cond_0

    .line 290
    iget v3, p1, Ll/ۡܺ᩵;->᩶:I

    and-int/lit8 v3, v3, -0x3

    iput v3, p1, Ll/ۡܺ᩵;->᩶:I

    add-int/lit8 v3, v6, -0x18

    goto :goto_1

    .line 293
    :cond_0
    iget v4, p1, Ll/ۡܺ᩵;->᩶:I

    or-int/2addr v4, v5

    iput v4, p1, Ll/ۡܺ᩵;->᩶:I

    .line 294
    iput v3, p1, Ll/ۡܺ᩵;->᩸:I

    :goto_1
    add-int/lit8 v4, v3, 0x18

    .line 297
    iput v4, p1, Ll/ۡܺ᩵;->ۙ:I

    if-lez v2, :cond_1

    .line 300
    iget v4, p1, Ll/ۡܺ᩵;->᩶:I

    and-int/lit8 v4, v4, -0x2

    iput v4, p1, Ll/ۡܺ᩵;->᩶:I

    .line 303
    :cond_1
    iget v4, p1, Ll/ۡܺ᩵;->᩶:I

    const/4 v6, 0x3

    and-int/2addr v4, v6

    if-eq v4, v6, :cond_2

    .line 304
    iput v2, p3, Ll/۬ܺ᩵;->ܿ:I

    .line 73
    iput v2, p3, Ll/۬ܺ᩵;->ܽ:I

    .line 74
    iput v1, p3, Ll/۬ܺ᩵;->ᩳ:I

    .line 75
    iput-object p3, p3, Ll/۬ܺ᩵;->ۧ:Ll/۬ܺ᩵;

    .line 306
    invoke-virtual {p1, p3}, Ll/ۡܺ᩵;->ܿ(Ll/۬ܺ᩵;)V

    .line 307
    iget v4, p1, Ll/ۡܺ᩵;->᩸:I

    invoke-virtual {p3, v4}, Ll/۬ܺ᩵;->ᩳ(I)V

    .line 308
    invoke-virtual {p3, v1}, Ll/۬ܺ᩵;->ܿ(I)V

    .line 309
    invoke-virtual {p1}, Ll/ۡܺ᩵;->֫()I

    move-result v4

    invoke-virtual {p3, v4}, Ll/۬ܺ᩵;->ܿ(I)V

    .line 312
    :cond_2
    iget v4, p1, Ll/ۡܺ᩵;->᩶:I

    and-int/2addr v4, v5

    if-eq v4, v5, :cond_4

    .line 314
    iget v4, p1, Ll/ۡܺ᩵;->ۙ:I

    .line 137
    iget-object v5, p0, Ll/ܺܺ᩵;->᩹:Ll/ܰۚ᩵;

    invoke-interface {v5}, Ll/ܰۚ᩵;->ۛ֫()Z

    move-result v6

    if-nez v6, :cond_3

    .line 140
    invoke-interface {v5, v2, v4, p2}, Ll/ܰۚ᩵;->֫(II[B)V

    add-int/2addr v2, v3

    goto :goto_0

    .line 138
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "DCERPC pipe is no longer open"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return v2

    .line 320
    :cond_5
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    throw p1
.end method

.method private ֫(Ll/ۡܺ᩵;[B)[B
    .locals 12

    .line 335
    iget v0, p1, Ll/ۡܺ᩵;->ۗ:I

    const/16 v1, 0x18

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    iget v0, p1, Ll/ۡܺ᩵;->ۙ:I

    goto :goto_0

    :cond_0
    const/16 v0, 0x18

    .line 336
    :goto_0
    iget v3, p0, Ll/ܺܺ᩵;->᩶:I

    new-array v4, v3, [B

    .line 337
    new-instance v5, Ll/۬ܺ᩵;

    const/4 v6, 0x0

    invoke-direct {v5, v4, v6}, Ll/۬ܺ᩵;-><init>([BI)V

    .line 46
    :goto_1
    iget v7, p1, Ll/ۡܺ᩵;->᩶:I

    and-int/2addr v7, v2

    if-ne v7, v2, :cond_1

    return-object p2

    .line 150
    :cond_1
    iget-object v7, p0, Ll/ܺܺ᩵;->᩹:Ll/ܰۚ᩵;

    invoke-interface {v7, v6, v3, v4}, Ll/ܰۚ᩵;->ܽ(II[B)I

    move-result v8

    .line 151
    aget-byte v9, v4, v6

    const/4 v10, 0x5

    if-ne v9, v10, :cond_6

    const/4 v9, 0x1

    aget-byte v9, v4, v9

    if-nez v9, :cond_6

    const/16 v9, 0x8

    .line 155
    invoke-static {v9, v4}, Ll/ۗ֨᩵;->ۧ(I[B)S

    move-result v10

    if-gt v10, v3, :cond_5

    :goto_2
    if-ge v8, v10, :cond_3

    sub-int v11, v10, v8

    .line 161
    invoke-interface {v7, v8, v11, v4}, Ll/ܰۚ᩵;->ܽ(II[B)I

    move-result v11

    if-eqz v11, :cond_2

    add-int/2addr v8, v11

    goto :goto_2

    .line 163
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Unexpected EOF"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 74
    :cond_3
    iput v6, v5, Ll/۬ܺ᩵;->ᩳ:I

    .line 75
    iput-object v5, v5, Ll/۬ܺ᩵;->ۧ:Ll/۬ܺ᩵;

    .line 85
    iput v9, v5, Ll/۬ܺ᩵;->ܽ:I

    .line 364
    invoke-virtual {v5}, Ll/۬ܺ᩵;->ۧ()I

    move-result v7

    .line 133
    iget-object v8, v5, Ll/۬ܺ᩵;->ۧ:Ll/۬ܺ᩵;

    iput v7, v8, Ll/۬ܺ᩵;->ᩳ:I

    .line 73
    iget v7, v5, Ll/۬ܺ᩵;->ܿ:I

    iput v7, v5, Ll/۬ܺ᩵;->ܽ:I

    .line 74
    iput v6, v5, Ll/۬ܺ᩵;->ᩳ:I

    .line 75
    iput-object v5, v5, Ll/۬ܺ᩵;->ۧ:Ll/۬ܺ᩵;

    .line 342
    invoke-virtual {p1, v5}, Ll/ۡܺ᩵;->ܽ(Ll/۬ܺ᩵;)V

    .line 343
    iget v7, p1, Ll/ۡܺ᩵;->ۙ:I

    sub-int/2addr v7, v1

    add-int v8, v0, v7

    .line 344
    array-length v9, p2

    if-le v8, v9, :cond_4

    .line 346
    new-array v9, v8, [B

    .line 347
    invoke-static {p2, v6, v9, v6, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p2, v9

    .line 350
    :cond_4
    invoke-static {v4, v1, p2, v0, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v0, v8

    goto :goto_1

    .line 157
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Unexpected fragment length: "

    .line 0
    invoke-static {v10, p2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 157
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 152
    :cond_6
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Unexpected DCERPC PDU header"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 173
    iget-object v0, p0, Ll/ܺܺ᩵;->ۗ:Ll/ۨۚ᩵;

    const/4 v1, 0x0

    .line 445
    iput v1, p0, Ll/ܺܺ᩵;->۬:I

    .line 175
    :try_start_0
    iget-object v1, p0, Ll/ܺܺ᩵;->᩹:Ll/ܰۚ᩵;

    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 177
    invoke-virtual {v0}, Ll/۬ۚ᩵;->close()V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Ll/۬ۚ᩵;->close()V

    .line 178
    throw v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 430
    iget-object v0, p0, Ll/ܺܺ᩵;->᩸:Ll/᩻ܺ᩵;

    invoke-virtual {v0}, Ll/᩻ܺ᩵;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 166
    iget v0, p0, Ll/ܺܺ᩵;->᩶:I

    return v0
.end method

.method public final ֫(II[B[B)I
    .locals 7

    .line 112
    iget-object v6, p0, Ll/ܺܺ᩵;->᩹:Ll/ܰۚ᩵;

    invoke-interface {v6}, Ll/ܰۚ᩵;->ۛ֫()Z

    move-result v0

    if-nez v0, :cond_3

    .line 166
    iget v5, p0, Ll/ܺܺ᩵;->᩶:I

    move-object v0, v6

    move v1, p1

    move-object v2, p3

    move v3, p2

    move-object v4, p4

    .line 116
    invoke-interface/range {v0 .. v5}, Ll/ܰۚ᩵;->֫(I[BI[BI)I

    move-result p1

    const/16 p2, 0x8

    .line 118
    invoke-static {p2, p4}, Ll/ۗ֨᩵;->ۧ(I[B)S

    move-result p2

    .line 166
    iget p3, p0, Ll/ܺܺ᩵;->᩶:I

    if-gt p2, p3, :cond_2

    :goto_0
    if-ge p1, p2, :cond_1

    sub-int p3, p2, p1

    .line 124
    invoke-interface {v6, p1, p3, p4}, Ll/ܰۚ᩵;->ܽ(II[B)I

    move-result p3

    if-eqz p3, :cond_0

    add-int/2addr p1, p3

    goto :goto_0

    .line 126
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Unexpected EOF"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return p1

    .line 120
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p3, "Unexpected fragment length: "

    .line 0
    invoke-static {p2, p3}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 120
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 113
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "DCERPC pipe is no longer open"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۡܺ᩵;)V
    .locals 8

    .line 236
    iget v0, p0, Ll/ܺܺ᩵;->۬:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move-object v0, p0

    .line 217
    monitor-enter v0

    .line 219
    :try_start_0
    iput v1, p0, Ll/ܺܺ᩵;->۬:I

    .line 220
    new-instance v3, Ll/ܳܺ᩵;

    iget-object v4, p0, Ll/ܺܺ᩵;->᩸:Ll/᩻ܺ᩵;

    invoke-direct {v3, v4, p0}, Ll/ܳܺ᩵;-><init>(Ll/᩻ܺ᩵;Ll/ܺܺ᩵;)V

    .line 221
    invoke-virtual {p0, v3}, Ll/ܺܺ᩵;->֫(Ll/ۡܺ᩵;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 226
    :try_start_1
    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 223
    iput v2, p0, Ll/ܺܺ᩵;->۬:I

    .line 224
    throw p1

    .line 226
    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 239
    :cond_0
    :goto_1
    iget-object v0, p0, Ll/ܺܺ᩵;->۫:Ll/ᩴۡ᩵;

    invoke-interface {v0}, Ll/ᩴۡ᩵;->᩷()Ll/ۤ֡᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۤ֡᩵;->֫()[B

    move-result-object v0

    .line 240
    iget-object v3, p0, Ll/ܺܺ᩵;->۫:Ll/ᩴۡ᩵;

    invoke-interface {v3}, Ll/ᩴۡ᩵;->᩷()Ll/ۤ֡᩵;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۤ֡᩵;->֫()[B

    move-result-object v3

    .line 380
    :try_start_2
    new-instance v4, Ll/۬ܺ᩵;

    invoke-direct {v4, v3, v2}, Ll/۬ܺ᩵;-><init>([BI)V

    const/4 v5, 0x3

    .line 382
    iput v5, p1, Ll/ۡܺ᩵;->᩶:I

    .line 383
    sget-object v5, Ll/ܺܺ᩵;->ۛ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v5

    iput v5, p1, Ll/ۡܺ᩵;->᩹:I

    .line 385
    invoke-virtual {p1, v4}, Ll/ۡܺ᩵;->ۧ(Ll/۬ܺ᩵;)V

    .line 243
    invoke-direct {p0, p1, v3, v4}, Ll/ܺܺ᩵;->֫(Ll/ۡܺ᩵;[BLl/۬ܺ᩵;)I

    move-result v4

    .line 246
    iget v5, p1, Ll/ۡܺ᩵;->ۙ:I

    invoke-virtual {p0, v4, v5, v3, v0}, Ll/ܺܺ᩵;->֫(II[B[B)I

    move-result v4

    if-eqz v4, :cond_1

    .line 249
    new-instance v5, Ll/۬ܺ᩵;

    invoke-direct {v5, v0, v2}, Ll/۬ܺ᩵;-><init>([BI)V

    .line 74
    iput v2, v5, Ll/۬ܺ᩵;->ᩳ:I

    .line 75
    iput-object v5, v5, Ll/۬ܺ᩵;->ۧ:Ll/۬ܺ᩵;

    const/16 v6, 0x8

    .line 85
    iput v6, v5, Ll/۬ܺ᩵;->ܽ:I

    .line 364
    invoke-virtual {v5}, Ll/۬ܺ᩵;->ۧ()I

    move-result v6

    .line 133
    iget-object v7, v5, Ll/۬ܺ᩵;->ۧ:Ll/۬ܺ᩵;

    iput v6, v7, Ll/۬ܺ᩵;->ᩳ:I

    .line 85
    iput v2, v5, Ll/۬ܺ᩵;->ܽ:I

    .line 252
    invoke-virtual {p1, v5}, Ll/ۡܺ᩵;->ܽ(Ll/۬ܺ᩵;)V

    :cond_1
    if-eqz v4, :cond_3

    .line 46
    iget v4, p1, Ll/ۡܺ᩵;->᩶:I

    const/4 v5, 0x2

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_2

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    if-nez v1, :cond_3

    .line 257
    new-instance v1, Ll/۬ܺ᩵;

    invoke-direct {p0, p1, v0}, Ll/ܺܺ᩵;->֫(Ll/ۡܺ᩵;[B)[B

    move-result-object v4

    invoke-direct {v1, v4, v2}, Ll/۬ܺ᩵;-><init>([BI)V

    goto :goto_3

    .line 259
    :cond_3
    new-instance v1, Ll/۬ܺ᩵;

    invoke-direct {v1, v0, v2}, Ll/۬ܺ᩵;-><init>([BI)V

    .line 261
    :goto_3
    invoke-virtual {p1, v1}, Ll/ۡܺ᩵;->֫(Ll/۬ܺ᩵;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 263
    iget-object v1, p0, Ll/ܺܺ᩵;->۫:Ll/ᩴۡ᩵;

    invoke-interface {v1}, Ll/ᩴۡ᩵;->᩷()Ll/ۤ֡᩵;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ۤ֡᩵;->֫([B)V

    .line 264
    iget-object v0, p0, Ll/ܺܺ᩵;->۫:Ll/ᩴۡ᩵;

    invoke-interface {v0}, Ll/ᩴۡ᩵;->᩷()Ll/ۤ֡᩵;

    move-result-object v0

    invoke-virtual {v0, v3}, Ll/ۤ֡᩵;->֫([B)V

    .line 268
    invoke-virtual {p1}, Ll/ۡܺ᩵;->ۧ()Ll/ۢܺ᩵;

    move-result-object p1

    if-nez p1, :cond_4

    return-void

    .line 269
    :cond_4
    throw p1

    :catchall_1
    move-exception p1

    .line 263
    iget-object v1, p0, Ll/ܺܺ᩵;->۫:Ll/ᩴۡ᩵;

    invoke-interface {v1}, Ll/ᩴۡ᩵;->᩷()Ll/ۤ֡᩵;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ۤ֡᩵;->֫([B)V

    .line 264
    iget-object v0, p0, Ll/ܺܺ᩵;->۫:Ll/ᩴۡ᩵;

    invoke-interface {v0}, Ll/ᩴۡ᩵;->᩷()Ll/ۤ֡᩵;

    move-result-object v0

    invoke-virtual {v0, v3}, Ll/ۤ֡᩵;->֫([B)V

    .line 265
    throw p1
.end method

.method public final ܽ()I
    .locals 1

    .line 174
    iget v0, p0, Ll/ܺܺ᩵;->ۙ:I

    return v0
.end method
