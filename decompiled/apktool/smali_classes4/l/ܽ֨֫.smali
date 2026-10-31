.class public final Ll/ܽ֨֫;
.super Ljava/lang/Object;
.source "O8HF"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:I

.field public ᩳ:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    sget-object v0, Ll/ۘ֨֫;->ܿ:[B

    iput-object v0, p0, Ll/ܽ֨֫;->ᩳ:[B

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Ll/ܽ֨֫;->ᩳ:[B

    .line 59
    iput p2, p0, Ll/ܽ֨֫;->ۧ:I

    return-void
.end method

.method private ᩻()V
    .locals 2

    .line 344
    iget v0, p0, Ll/ܽ֨֫;->ܽ:I

    if-ltz v0, :cond_1

    iget v1, p0, Ll/ܽ֨֫;->ۧ:I

    if-lt v0, v1, :cond_0

    if-ne v0, v1, :cond_1

    iget v0, p0, Ll/ܽ֨֫;->֫:I

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 97
    iget v0, p0, Ll/ܽ֨֫;->ۧ:I

    iget v1, p0, Ll/ܽ֨֫;->ܽ:I

    sub-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x8

    iget v1, p0, Ll/ܽ֨֫;->֫:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final ֫(I)V
    .locals 9

    and-int/lit16 p1, p1, 0x3fff

    .line 319
    iget v0, p0, Ll/ܽ֨֫;->֫:I

    const/16 v1, 0x8

    rsub-int/lit8 v0, v0, 0x8

    const/16 v2, 0xe

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 320
    iget v3, p0, Ll/ܽ֨֫;->֫:I

    rsub-int/lit8 v4, v3, 0x8

    sub-int/2addr v4, v0

    const v5, 0xff00

    shr-int v3, v5, v3

    const/4 v5, 0x1

    shl-int v6, v5, v4

    sub-int/2addr v6, v5

    or-int/2addr v3, v6

    .line 322
    iget-object v6, p0, Ll/ܽ֨֫;->ᩳ:[B

    iget v7, p0, Ll/ܽ֨֫;->ܽ:I

    aget-byte v8, v6, v7

    and-int/2addr v3, v8

    int-to-byte v3, v3

    aput-byte v3, v6, v7

    rsub-int/lit8 v0, v0, 0xe

    ushr-int v8, p1, v0

    shl-int v4, v8, v4

    or-int/2addr v3, v4

    int-to-byte v3, v3

    .line 324
    aput-byte v3, v6, v7

    add-int/2addr v7, v5

    :goto_0
    if-le v0, v1, :cond_0

    .line 329
    iget-object v3, p0, Ll/ܽ֨֫;->ᩳ:[B

    add-int/lit8 v4, v7, 0x1

    add-int/lit8 v6, v0, -0x8

    ushr-int v6, p1, v6

    int-to-byte v6, v6

    aput-byte v6, v3, v7

    add-int/lit8 v0, v0, -0x8

    move v7, v4

    goto :goto_0

    :cond_0
    rsub-int/lit8 v1, v0, 0x8

    .line 333
    iget-object v3, p0, Ll/ܽ֨֫;->ᩳ:[B

    aget-byte v4, v3, v7

    shl-int v6, v5, v1

    sub-int/2addr v6, v5

    and-int/2addr v4, v6

    int-to-byte v4, v4

    aput-byte v4, v3, v7

    shl-int v0, v5, v0

    sub-int/2addr v0, v5

    and-int/2addr p1, v0

    shl-int/2addr p1, v1

    or-int/2addr p1, v4

    int-to-byte p1, p1

    .line 336
    aput-byte p1, v3, v7

    .line 338
    invoke-virtual {p0, v2}, Ll/ܽ֨֫;->ܿ(I)V

    .line 339
    invoke-direct {p0}, Ll/ܽ֨֫;->᩻()V

    return-void
.end method

.method public final ֫(I[B)V
    .locals 9

    shr-int/lit8 v0, p1, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0xff

    const/16 v4, 0x8

    if-ge v2, v0, :cond_0

    .line 214
    iget-object v5, p0, Ll/ܽ֨֫;->ᩳ:[B

    iget v6, p0, Ll/ܽ֨֫;->ܽ:I

    add-int/lit8 v7, v6, 0x1

    iput v7, p0, Ll/ܽ֨֫;->ܽ:I

    aget-byte v6, v5, v6

    iget v8, p0, Ll/ܽ֨֫;->֫:I

    shl-int/2addr v6, v8

    int-to-byte v6, v6

    aput-byte v6, p2, v2

    .line 215
    aget-byte v5, v5, v7

    and-int/2addr v3, v5

    sub-int/2addr v4, v8

    shr-int/2addr v3, v4

    or-int/2addr v3, v6

    int-to-byte v3, v3

    aput-byte v3, p2, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    and-int/lit8 p1, p1, 0x7

    if-nez p1, :cond_1

    return-void

    .line 223
    :cond_1
    aget-byte v2, p2, v0

    shr-int v5, v3, p1

    and-int/2addr v2, v5

    int-to-byte v2, v2

    aput-byte v2, p2, v0

    .line 224
    iget v5, p0, Ll/ܽ֨֫;->֫:I

    add-int v6, v5, p1

    if-le v6, v4, :cond_2

    .line 226
    iget-object v6, p0, Ll/ܽ֨֫;->ᩳ:[B

    iget v7, p0, Ll/ܽ֨֫;->ܽ:I

    add-int/lit8 v8, v7, 0x1

    iput v8, p0, Ll/ܽ֨֫;->ܽ:I

    aget-byte v6, v6, v7

    and-int/2addr v6, v3

    shl-int/2addr v6, v5

    or-int/2addr v2, v6

    int-to-byte v2, v2

    aput-byte v2, p2, v0

    sub-int/2addr v5, v4

    .line 227
    iput v5, p0, Ll/ܽ֨֫;->֫:I

    .line 229
    :cond_2
    iget v2, p0, Ll/ܽ֨֫;->֫:I

    add-int/2addr v2, p1

    iput v2, p0, Ll/ܽ֨֫;->֫:I

    .line 230
    iget-object v5, p0, Ll/ܽ֨֫;->ᩳ:[B

    iget v6, p0, Ll/ܽ֨֫;->ܽ:I

    aget-byte v5, v5, v6

    and-int/2addr v3, v5

    rsub-int/lit8 v5, v2, 0x8

    shr-int/2addr v3, v5

    .line 231
    aget-byte v5, p2, v0

    rsub-int/lit8 p1, p1, 0x8

    shl-int p1, v3, p1

    int-to-byte p1, p1

    or-int/2addr p1, v5

    int-to-byte p1, p1

    aput-byte p1, p2, v0

    if-ne v2, v4, :cond_3

    .line 233
    iput v1, p0, Ll/ܽ֨֫;->֫:I

    add-int/lit8 v6, v6, 0x1

    .line 234
    iput v6, p0, Ll/ܽ֨֫;->ܽ:I

    .line 236
    :cond_3
    invoke-direct {p0}, Ll/ܽ֨֫;->᩻()V

    return-void
.end method

.method public final ֫(Ll/ᩳ֨֫;)V
    .locals 2

    .line 78
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v0

    invoke-virtual {p1}, Ll/ᩳ֨֫;->ܿ()I

    move-result v1

    invoke-virtual {p0, v1, v0}, Ll/ܽ֨֫;->ܽ(I[B)V

    .line 79
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ᩳ()I

    move-result p1

    mul-int/lit8 p1, p1, 0x8

    invoke-virtual {p0, p1}, Ll/ܽ֨֫;->ᩳ(I)V

    return-void
.end method

.method public final ۧ(I)I
    .locals 7

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 173
    :cond_0
    iget v1, p0, Ll/ܽ֨֫;->֫:I

    add-int/2addr v1, p1

    iput v1, p0, Ll/ܽ֨֫;->֫:I

    const/4 v1, 0x0

    .line 174
    :goto_0
    iget v2, p0, Ll/ܽ֨֫;->֫:I

    const/16 v3, 0x8

    if-le v2, v3, :cond_1

    add-int/lit8 v2, v2, -0x8

    .line 175
    iput v2, p0, Ll/ܽ֨֫;->֫:I

    .line 176
    iget-object v3, p0, Ll/ܽ֨֫;->ᩳ:[B

    iget v4, p0, Ll/ܽ֨֫;->ܽ:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Ll/ܽ֨֫;->ܽ:I

    aget-byte v3, v3, v4

    and-int/lit16 v3, v3, 0xff

    shl-int v2, v3, v2

    or-int/2addr v1, v2

    goto :goto_0

    .line 178
    :cond_1
    iget-object v4, p0, Ll/ܽ֨֫;->ᩳ:[B

    iget v5, p0, Ll/ܽ֨֫;->ܽ:I

    aget-byte v4, v4, v5

    and-int/lit16 v4, v4, 0xff

    rsub-int/lit8 v6, v2, 0x8

    shr-int/2addr v4, v6

    or-int/2addr v1, v4

    rsub-int/lit8 p1, p1, 0x20

    const/4 v4, -0x1

    ushr-int p1, v4, p1

    and-int/2addr p1, v1

    if-ne v2, v3, :cond_2

    .line 181
    iput v0, p0, Ll/ܽ֨֫;->֫:I

    add-int/lit8 v5, v5, 0x1

    .line 182
    iput v5, p0, Ll/ܽ֨֫;->ܽ:I

    .line 184
    :cond_2
    invoke-direct {p0}, Ll/ܽ֨֫;->᩻()V

    return p1
.end method

.method public final ۧ()V
    .locals 1

    .line 243
    iget v0, p0, Ll/ܽ֨֫;->֫:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 246
    iput v0, p0, Ll/ܽ֨֫;->֫:I

    .line 247
    iget v0, p0, Ll/ܽ֨֫;->ܽ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܽ֨֫;->ܽ:I

    .line 248
    invoke-direct {p0}, Ll/ܽ֨֫;->᩻()V

    return-void
.end method

.method public final ۧ(I[B)V
    .locals 3

    .line 262
    iget v0, p0, Ll/ܽ֨֫;->֫:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 263
    iget-object v0, p0, Ll/ܽ֨֫;->ᩳ:[B

    iget v2, p0, Ll/ܽ֨֫;->ܽ:I

    invoke-static {v0, v2, p2, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 264
    iget p2, p0, Ll/ܽ֨֫;->ܽ:I

    add-int/2addr p2, p1

    iput p2, p0, Ll/ܽ֨֫;->ܽ:I

    .line 265
    invoke-direct {p0}, Ll/ܽ֨֫;->᩻()V

    return-void
.end method

.method public final ܳ()V
    .locals 2

    .line 128
    iget v0, p0, Ll/ܽ֨֫;->֫:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܽ֨֫;->֫:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    .line 129
    iput v0, p0, Ll/ܽ֨֫;->֫:I

    .line 130
    iget v0, p0, Ll/ܽ֨֫;->ܽ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܽ֨֫;->ܽ:I

    .line 132
    :cond_0
    invoke-direct {p0}, Ll/ܽ֨֫;->᩻()V

    return-void
.end method

.method public final ܳ(I)V
    .locals 1

    .line 275
    iget v0, p0, Ll/ܽ֨֫;->֫:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 276
    iget v0, p0, Ll/ܽ֨֫;->ܽ:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/ܽ֨֫;->ܽ:I

    .line 277
    invoke-direct {p0}, Ll/ܽ֨֫;->᩻()V

    return-void
.end method

.method public final ܽ()I
    .locals 1

    .line 111
    iget v0, p0, Ll/ܽ֨֫;->֫:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 112
    iget v0, p0, Ll/ܽ֨֫;->ܽ:I

    return v0
.end method

.method public final ܽ(I)J
    .locals 6

    const-wide v0, 0xffffffffL

    const/16 v2, 0x20

    if-gt p1, v2, :cond_0

    .line 196
    invoke-virtual {p0, p1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result p1

    sget-object v2, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    int-to-long v2, p1

    and-long/2addr v0, v2

    return-wide v0

    :cond_0
    sub-int/2addr p1, v2

    .line 198
    invoke-virtual {p0, p1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result p1

    invoke-virtual {p0, v2}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v3

    sget-object v4, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    int-to-long v4, p1

    and-long/2addr v4, v0

    shl-long/2addr v4, v2

    int-to-long v2, v3

    and-long/2addr v0, v2

    or-long/2addr v0, v4

    return-wide v0
.end method

.method public final ܽ(I[B)V
    .locals 0

    .line 89
    iput-object p2, p0, Ll/ܽ֨֫;->ᩳ:[B

    const/4 p2, 0x0

    .line 90
    iput p2, p0, Ll/ܽ֨֫;->ܽ:I

    .line 91
    iput p2, p0, Ll/ܽ֨֫;->֫:I

    .line 92
    iput p1, p0, Ll/ܽ֨֫;->ۧ:I

    return-void
.end method

.method public final ܿ(I)V
    .locals 3

    .line 141
    div-int/lit8 v0, p1, 0x8

    .line 142
    iget v1, p0, Ll/ܽ֨֫;->ܽ:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/ܽ֨֫;->ܽ:I

    .line 143
    iget v2, p0, Ll/ܽ֨֫;->֫:I

    mul-int/lit8 v0, v0, 0x8

    sub-int/2addr p1, v0

    add-int/2addr p1, v2

    iput p1, p0, Ll/ܽ֨֫;->֫:I

    const/4 v0, 0x7

    if-le p1, v0, :cond_0

    add-int/lit8 v1, v1, 0x1

    .line 145
    iput v1, p0, Ll/ܽ֨֫;->ܽ:I

    add-int/lit8 p1, p1, -0x8

    .line 146
    iput p1, p0, Ll/ܽ֨֫;->֫:I

    .line 148
    :cond_0
    invoke-direct {p0}, Ll/ܽ֨֫;->᩻()V

    return-void
.end method

.method public final ܿ()Z
    .locals 3

    .line 157
    iget-object v0, p0, Ll/ܽ֨֫;->ᩳ:[B

    iget v1, p0, Ll/ܽ֨֫;->ܽ:I

    aget-byte v0, v0, v1

    const/16 v1, 0x80

    iget v2, p0, Ll/ܽ֨֫;->֫:I

    shr-int/2addr v1, v2

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 158
    :goto_0
    invoke-virtual {p0}, Ll/ܽ֨֫;->ܳ()V

    return v0
.end method

.method public final ᩳ()I
    .locals 2

    .line 102
    iget v0, p0, Ll/ܽ֨֫;->ܽ:I

    mul-int/lit8 v0, v0, 0x8

    iget v1, p0, Ll/ܽ֨֫;->֫:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final ᩳ(I)V
    .locals 1

    .line 121
    div-int/lit8 v0, p1, 0x8

    iput v0, p0, Ll/ܽ֨֫;->ܽ:I

    mul-int/lit8 v0, v0, 0x8

    sub-int/2addr p1, v0

    .line 122
    iput p1, p0, Ll/ܽ֨֫;->֫:I

    .line 123
    invoke-direct {p0}, Ll/ܽ֨֫;->᩻()V

    return-void
.end method
