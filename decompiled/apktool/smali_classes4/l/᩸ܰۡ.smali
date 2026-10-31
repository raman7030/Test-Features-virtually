.class public final Ll/᩸ܰۡ;
.super Ljava/lang/Object;
.source "D4GD"


# instance fields
.field public ֫:Ll/᩹ܰۡ;

.field public ۧ:Ll/ܶܰۡ;


# direct methods
.method public constructor <init>(Ll/᩹ܰۡ;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Ll/᩸ܰۡ;->֫:Ll/᩹ܰۡ;

    const/4 p1, 0x0

    .line 31
    iput-object p1, p0, Ll/᩸ܰۡ;->ۧ:Ll/ܶܰۡ;

    return-void
.end method


# virtual methods
.method public final ֫(I[B)[B
    .locals 17

    move-object/from16 v0, p0

    .line 36
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    iget-object v1, v0, Ll/᩸ܰۡ;->ۧ:Ll/ܶܰۡ;

    if-nez v1, :cond_0

    .line 47
    new-instance v1, Ll/ܶܰۡ;

    invoke-direct {v1}, Ll/ܶܰۡ;-><init>()V

    iput-object v1, v0, Ll/᩸ܰۡ;->ۧ:Ll/ܶܰۡ;

    .line 49
    :cond_0
    iget-object v1, v0, Ll/᩸ܰۡ;->ۧ:Ll/ܶܰۡ;

    move-object/from16 v2, p2

    invoke-virtual {v1, v2}, Ll/ܶܰۡ;->֫([B)V

    if-nez p1, :cond_1

    .line 40
    iget-object v1, v0, Ll/᩸ܰۡ;->ۧ:Ll/ܶܰۡ;

    .line 56
    iget v1, v1, Ll/ܶܰۡ;->֫:I

    goto :goto_0

    :cond_1
    move/from16 v1, p1

    .line 42
    :goto_0
    iget-object v2, v0, Ll/᩸ܰۡ;->ۧ:Ll/ܶܰۡ;

    .line 22
    iget-object v3, v0, Ll/᩸ܰۡ;->֫:Ll/᩹ܰۡ;

    iget-object v3, v3, Ll/᩹ܰۡ;->֫:[B

    .line 56
    iget v4, v2, Ll/ܶܰۡ;->֫:I

    .line 76
    rem-int v5, v1, v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-lez v5, :cond_2

    const/4 v5, 0x1

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    .line 79
    :goto_1
    div-int v8, v1, v4

    add-int/2addr v8, v5

    add-int/lit8 v5, v8, -0x1

    mul-int v5, v5, v4

    sub-int v5, v1, v5

    mul-int v9, v8, v4

    .line 59
    new-array v9, v9, [B

    const/4 v10, 0x0

    :goto_2
    if-gt v6, v8, :cond_5

    .line 56
    iget v11, v2, Ll/ܶܰۡ;->֫:I

    .line 85
    new-array v12, v11, [B

    .line 88
    array-length v13, v3

    add-int/lit8 v13, v13, 0x4

    new-array v13, v13, [B

    .line 89
    array-length v14, v3

    invoke-static {v3, v7, v13, v7, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 90
    array-length v7, v3

    const/high16 v14, 0x1000000

    .line 106
    div-int v14, v6, v14

    int-to-byte v14, v14

    aput-byte v14, v13, v7

    add-int/lit8 v14, v7, 0x1

    const/high16 v15, 0x10000

    .line 107
    div-int v15, v6, v15

    int-to-byte v15, v15

    aput-byte v15, v13, v14

    add-int/lit8 v14, v7, 0x2

    .line 108
    div-int/lit16 v15, v6, 0x100

    int-to-byte v15, v15

    aput-byte v15, v13, v14

    add-int/lit8 v7, v7, 0x3

    int-to-byte v14, v6

    .line 109
    aput-byte v14, v13, v7

    const/4 v7, 0x0

    :goto_3
    const/16 v14, 0x3e8

    if-ge v7, v14, :cond_4

    .line 48
    iget-object v14, v2, Ll/ܶܰۡ;->ۧ:Ljavax/crypto/Mac;

    invoke-virtual {v14, v13}, Ljavax/crypto/Mac;->doFinal([B)[B

    move-result-object v13

    const/4 v14, 0x0

    :goto_4
    if-ge v14, v11, :cond_3

    .line 101
    aget-byte v15, v12, v14

    aget-byte v16, v13, v14

    xor-int v15, v15, v16

    int-to-byte v15, v15

    aput-byte v15, v12, v14

    add-int/lit8 v14, v14, 0x1

    goto :goto_4

    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_4
    const/4 v7, 0x0

    .line 96
    invoke-static {v12, v7, v9, v10, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v10, v4

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_5
    if-ge v5, v4, :cond_6

    .line 67
    new-array v2, v1, [B

    .line 68
    invoke-static {v9, v7, v2, v7, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2

    :cond_6
    return-object v9
.end method
