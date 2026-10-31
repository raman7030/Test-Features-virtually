.class public final Ll/ܿۢۧ;
.super Ljava/lang/Object;
.source "L8OU"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܳ:I

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:Ljava/lang/String;

.field public ᩻:I


# virtual methods
.method public final ֫(I)Z
    .locals 8

    const/high16 v0, -0x200000

    and-int v1, p1, v0

    const/4 v2, 0x0

    if-ne v1, v0, :cond_10

    ushr-int/lit8 v0, p1, 0x13

    const/4 v1, 0x3

    and-int/2addr v0, v1

    const/4 v3, 0x1

    if-ne v0, v3, :cond_0

    goto/16 :goto_5

    :cond_0
    ushr-int/lit8 v4, p1, 0x11

    and-int/2addr v4, v1

    if-nez v4, :cond_1

    goto/16 :goto_5

    :cond_1
    ushr-int/lit8 v5, p1, 0xc

    const/16 v6, 0xf

    and-int/2addr v5, v6

    if-eqz v5, :cond_10

    if-ne v5, v6, :cond_2

    goto/16 :goto_5

    :cond_2
    ushr-int/lit8 v6, p1, 0xa

    and-int/2addr v6, v1

    if-ne v6, v1, :cond_3

    goto/16 :goto_5

    .line 100
    :cond_3
    iput v0, p0, Ll/ܿۢۧ;->᩻:I

    .line 101
    invoke-static {}, Ll/ܳۢۧ;->ܳ()[Ljava/lang/String;

    move-result-object v2

    rsub-int/lit8 v7, v4, 0x3

    aget-object v2, v2, v7

    iput-object v2, p0, Ll/ܿۢۧ;->ᩳ:Ljava/lang/String;

    .line 102
    invoke-static {}, Ll/ܳۢۧ;->᩻()[I

    move-result-object v2

    aget v2, v2, v6

    iput v2, p0, Ll/ܿۢۧ;->ܿ:I

    const/4 v6, 0x2

    if-ne v0, v6, :cond_4

    .line 105
    div-int/2addr v2, v6

    iput v2, p0, Ll/ܿۢۧ;->ܿ:I

    goto :goto_0

    :cond_4
    if-nez v0, :cond_5

    .line 108
    div-int/lit8 v2, v2, 0x4

    iput v2, p0, Ll/ܿۢۧ;->ܿ:I

    :cond_5
    :goto_0
    ushr-int/lit8 v2, p1, 0x9

    and-int/2addr v2, v3

    if-eq v4, v3, :cond_7

    if-eq v4, v6, :cond_8

    if-ne v4, v1, :cond_6

    const/16 v7, 0x180

    goto :goto_1

    .line 284
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_7
    if-ne v0, v1, :cond_9

    :cond_8
    const/16 v7, 0x480

    goto :goto_1

    :cond_9
    const/16 v7, 0x240

    .line 111
    :goto_1
    iput v7, p0, Ll/ܿۢۧ;->ܳ:I

    if-ne v4, v1, :cond_b

    if-ne v0, v1, :cond_a

    .line 114
    invoke-static {}, Ll/ܳۢۧ;->֫()[I

    move-result-object v0

    sub-int/2addr v5, v3

    aget v0, v0, v5

    goto :goto_2

    :cond_a
    invoke-static {}, Ll/ܳۢۧ;->ܿ()[I

    move-result-object v0

    sub-int/2addr v5, v3

    aget v0, v0, v5

    :goto_2
    iput v0, p0, Ll/ܿۢۧ;->֫:I

    mul-int/lit8 v0, v0, 0xc

    .line 115
    iget v4, p0, Ll/ܿۢۧ;->ܿ:I

    div-int/2addr v0, v4

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x4

    iput v0, p0, Ll/ܿۢۧ;->ܽ:I

    goto :goto_4

    :cond_b
    const/16 v7, 0x90

    if-ne v0, v1, :cond_d

    if-ne v4, v6, :cond_c

    .line 120
    invoke-static {}, Ll/ܳۢۧ;->ۧ()[I

    move-result-object v0

    sub-int/2addr v5, v3

    aget v0, v0, v5

    goto :goto_3

    :cond_c
    invoke-static {}, Ll/ܳۢۧ;->ܽ()[I

    move-result-object v0

    sub-int/2addr v5, v3

    aget v0, v0, v5

    :goto_3
    iput v0, p0, Ll/ܿۢۧ;->֫:I

    mul-int/lit16 v0, v0, 0x90

    .line 121
    iget v4, p0, Ll/ܿۢۧ;->ܿ:I

    div-int/2addr v0, v4

    add-int/2addr v0, v2

    iput v0, p0, Ll/ܿۢۧ;->ܽ:I

    goto :goto_4

    .line 124
    :cond_d
    invoke-static {}, Ll/ܳۢۧ;->ᩳ()[I

    move-result-object v0

    sub-int/2addr v5, v3

    aget v0, v0, v5

    iput v0, p0, Ll/ܿۢۧ;->֫:I

    if-ne v4, v3, :cond_e

    const/16 v7, 0x48

    :cond_e
    mul-int v7, v7, v0

    .line 125
    iget v0, p0, Ll/ܿۢۧ;->ܿ:I

    div-int/2addr v7, v0

    add-int/2addr v7, v2

    iput v7, p0, Ll/ܿۢۧ;->ܽ:I

    :goto_4
    shr-int/lit8 p1, p1, 0x6

    and-int/2addr p1, v1

    if-ne p1, v1, :cond_f

    const/4 v6, 0x1

    .line 128
    :cond_f
    iput v6, p0, Ll/ܿۢۧ;->ۧ:I

    return v3

    :cond_10
    :goto_5
    return v2
.end method
