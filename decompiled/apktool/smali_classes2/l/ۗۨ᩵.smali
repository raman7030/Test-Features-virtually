.class public final Ll/ۗۨ᩵;
.super Ll/ۖ᩹ۢ;
.source "48CI"


# static fields
.field public static final ۧ:Ll/ۖ᩹ۢ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 21
    new-instance v0, Ll/ۗۨ᩵;

    const/4 v1, 0x5

    .line 29
    invoke-direct {v0, v1}, Ll/ۖ᩹ۢ;-><init>(I)V

    .line 21
    sput-object v0, Ll/ۗۨ᩵;->ۧ:Ll/ۖ᩹ۢ;

    return-void
.end method


# virtual methods
.method public final ֫(II[B[B)I
    .locals 17

    move/from16 v0, p1

    move/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    const/4 v4, 0x0

    .line 28
    invoke-static {v4, v0, v2}, Ll/ۛ᩸ۘ;->֫(II[B)V

    .line 29
    invoke-static {v4, v1, v3}, Ll/ۛ᩸ۘ;->֫(II[B)V

    const/4 v5, 0x1

    if-nez v1, :cond_1

    if-ne v0, v5, :cond_0

    .line 44
    aget-byte v0, v2, v4

    if-nez v0, :cond_0

    return v4

    .line 33
    :cond_0
    new-instance v0, Ll/ۘۨ᩵;

    const-string v1, "Output buffer too small"

    .line 31
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 33
    throw v0

    :cond_1
    const/4 v4, 0x0

    const/4 v6, 0x0

    .line 44
    :goto_0
    aget-byte v7, v2, v4

    and-int/lit16 v8, v7, 0xff

    add-int/2addr v4, v5

    ushr-int/lit8 v8, v8, 0x4

    const/16 v9, 0xf

    const/4 v10, -0x1

    if-ne v8, v9, :cond_4

    const/4 v11, -0x1

    :goto_1
    if-ge v4, v0, :cond_3

    add-int/lit8 v11, v4, 0x1

    aget-byte v4, v2, v4

    if-ne v4, v10, :cond_2

    add-int/lit16 v8, v8, 0xff

    move/from16 v16, v11

    move v11, v4

    move/from16 v4, v16

    goto :goto_1

    :cond_2
    move/from16 v16, v11

    move v11, v4

    move/from16 v4, v16

    :cond_3
    and-int/lit16 v11, v11, 0xff

    add-int/2addr v8, v11

    :cond_4
    add-int v11, v6, v8

    add-int/lit8 v12, v1, -0x8

    const-string v13, "Malformed input at "

    if-gt v11, v12, :cond_e

    add-int v14, v4, v8

    add-int/lit8 v15, v0, -0x8

    if-le v14, v15, :cond_5

    goto/16 :goto_5

    .line 76
    :cond_5
    invoke-static {v4, v2, v6, v3, v8}, Ll/۬ۨ᩵;->֫(I[BI[BI)V

    .line 90
    aget-byte v4, v2, v14

    and-int/lit16 v4, v4, 0xff

    add-int/lit8 v6, v14, 0x1

    aget-byte v6, v2, v6

    and-int/lit16 v6, v6, 0xff

    const/16 v8, 0x8

    shl-int/2addr v6, v8

    or-int/2addr v4, v6

    add-int/lit8 v14, v14, 0x2

    sub-int v4, v11, v4

    if-ltz v4, :cond_d

    and-int/lit8 v6, v7, 0xf

    if-ne v6, v9, :cond_8

    const/4 v7, -0x1

    :goto_2
    if-ge v14, v0, :cond_7

    add-int/lit8 v7, v14, 0x1

    .line 44
    aget-byte v9, v2, v14

    if-ne v9, v10, :cond_6

    add-int/lit16 v6, v6, 0xff

    move v14, v7

    move v7, v9

    goto :goto_2

    :cond_6
    move v14, v7

    move v7, v9

    :cond_7
    and-int/lit16 v7, v7, 0xff

    add-int/2addr v6, v7

    :cond_8
    move v7, v6

    move v6, v14

    add-int/lit8 v7, v7, 0x4

    add-int v9, v11, v7

    if-le v9, v12, :cond_a

    if-gt v9, v1, :cond_9

    const/4 v8, 0x0

    :goto_3
    if-ge v8, v7, :cond_c

    add-int v10, v11, v8

    add-int v12, v4, v8

    .line 42
    aget-byte v12, v3, v12

    aput-byte v12, v3, v10

    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    .line 103
    :cond_9
    new-instance v0, Ll/ۘۨ᩵;

    .line 0
    invoke-static {v6, v13}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 31
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 103
    throw v0

    :cond_a
    const/4 v7, 0x0

    :goto_4
    if-ge v7, v8, :cond_b

    add-int v10, v11, v7

    add-int v12, v4, v7

    .line 56
    aget-byte v12, v3, v12

    aput-byte v12, v3, v10

    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_b
    add-int/lit8 v4, v4, 0x8

    add-int/lit8 v11, v11, 0x8

    if-lt v11, v9, :cond_a

    :cond_c
    move v4, v6

    move v6, v9

    goto/16 :goto_0

    .line 86
    :cond_d
    new-instance v0, Ll/ۘۨ᩵;

    .line 0
    invoke-static {v14, v13}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 31
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 86
    throw v0

    :cond_e
    :goto_5
    if-gt v11, v1, :cond_10

    add-int v1, v4, v8

    if-ne v1, v0, :cond_f

    .line 77
    invoke-static {v2, v4, v3, v6, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return v11

    .line 66
    :cond_f
    new-instance v0, Ll/ۘۨ᩵;

    .line 0
    invoke-static {v4, v13}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 31
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 66
    throw v0

    .line 64
    :cond_10
    new-instance v0, Ll/ۘۨ᩵;

    .line 35
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 64
    throw v0
.end method
