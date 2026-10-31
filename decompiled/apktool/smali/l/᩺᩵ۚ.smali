.class public final Ll/᩺᩵ۚ;
.super Ljava/lang/Object;
.source "F4XQ"


# instance fields
.field public ֫:[I

.field public ۧ:I

.field public ܽ:[I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xa

    new-array v1, v0, [I

    .line 57
    iput-object v1, p0, Ll/᩺᩵ۚ;->֫:[I

    new-array v0, v0, [I

    .line 58
    iput-object v0, p0, Ll/᩺᩵ۚ;->ܽ:[I

    const/4 v0, 0x0

    .line 59
    iput v0, p0, Ll/᩺᩵ۚ;->ۧ:I

    return-void
.end method

.method public static ֫(II[I)I
    .locals 4

    const/4 v0, -0x1

    move v1, p0

    :goto_0
    sub-int v2, v1, v0

    const/4 v3, 0x1

    if-le v2, v3, :cond_1

    add-int v2, v1, v0

    .line 66
    div-int/lit8 v2, v2, 0x2

    .line 68
    aget v3, p2, v2

    if-ge v3, p1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    if-ne v1, p0, :cond_2

    not-int p0, p0

    return p0

    .line 76
    :cond_2
    aget p0, p2, v1

    if-ne p0, p1, :cond_3

    return v1

    :cond_3
    not-int p0, v1

    return p0
.end method


# virtual methods
.method public final ֫(I)I
    .locals 2

    .line 95
    iget-object v0, p0, Ll/᩺᩵ۚ;->֫:[I

    iget v1, p0, Ll/᩺᩵ۚ;->ۧ:I

    invoke-static {v1, p1, v0}, Ll/᩺᩵ۚ;->֫(II[I)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, -0x1

    return p1

    .line 100
    :cond_0
    iget-object v0, p0, Ll/᩺᩵ۚ;->ܽ:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 236
    iput v0, p0, Ll/᩺᩵ۚ;->ۧ:I

    return-void
.end method

.method public final ֫(II)V
    .locals 6

    .line 244
    iget v0, p0, Ll/᩺᩵ۚ;->ۧ:I

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-object v2, p0, Ll/᩺᩵ۚ;->֫:[I

    add-int/lit8 v3, v0, -0x1

    aget v3, v2, v3

    if-gt p1, v3, :cond_3

    .line 148
    invoke-static {v0, p1, v2}, Ll/᩺᩵ۚ;->֫(II[I)I

    move-result v0

    if-ltz v0, :cond_0

    .line 151
    iget-object p1, p0, Ll/᩺᩵ۚ;->ܽ:[I

    aput p2, p1, v0

    return-void

    :cond_0
    not-int v0, v0

    .line 155
    iget v2, p0, Ll/᩺᩵ۚ;->ۧ:I

    iget-object v3, p0, Ll/᩺᩵ۚ;->֫:[I

    array-length v4, v3

    if-lt v2, v4, :cond_1

    add-int/lit8 v2, v2, 0x1

    .line 156
    array-length v3, v3

    mul-int/lit8 v3, v3, 0x2

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 158
    new-array v3, v2, [I

    .line 159
    new-array v2, v2, [I

    .line 162
    iget-object v4, p0, Ll/᩺᩵ۚ;->֫:[I

    array-length v5, v4

    invoke-static {v4, v1, v3, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 163
    iget-object v4, p0, Ll/᩺᩵ۚ;->ܽ:[I

    array-length v5, v4

    invoke-static {v4, v1, v2, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 165
    iput-object v3, p0, Ll/᩺᩵ۚ;->֫:[I

    .line 166
    iput-object v2, p0, Ll/᩺᩵ۚ;->ܽ:[I

    .line 169
    :cond_1
    iget v1, p0, Ll/᩺᩵ۚ;->ۧ:I

    sub-int/2addr v1, v0

    if-eqz v1, :cond_2

    .line 171
    iget-object v2, p0, Ll/᩺᩵ۚ;->֫:[I

    add-int/lit8 v3, v0, 0x1

    invoke-static {v2, v0, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 172
    iget-object v1, p0, Ll/᩺᩵ۚ;->ܽ:[I

    iget v2, p0, Ll/᩺᩵ۚ;->ۧ:I

    sub-int/2addr v2, v0

    invoke-static {v1, v0, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 175
    :cond_2
    iget-object v1, p0, Ll/᩺᩵ۚ;->֫:[I

    aput p1, v1, v0

    .line 176
    iget-object p1, p0, Ll/᩺᩵ۚ;->ܽ:[I

    aput p2, p1, v0

    .line 177
    iget p1, p0, Ll/᩺᩵ۚ;->ۧ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/᩺᩵ۚ;->ۧ:I

    return-void

    .line 250
    :cond_3
    iget-object v2, p0, Ll/᩺᩵ۚ;->֫:[I

    array-length v3, v2

    if-lt v0, v3, :cond_4

    add-int/lit8 v3, v0, 0x1

    .line 251
    array-length v2, v2

    mul-int/lit8 v2, v2, 0x2

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 253
    new-array v3, v2, [I

    .line 254
    new-array v2, v2, [I

    .line 257
    iget-object v4, p0, Ll/᩺᩵ۚ;->֫:[I

    array-length v5, v4

    invoke-static {v4, v1, v3, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 258
    iget-object v4, p0, Ll/᩺᩵ۚ;->ܽ:[I

    array-length v5, v4

    invoke-static {v4, v1, v2, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 260
    iput-object v3, p0, Ll/᩺᩵ۚ;->֫:[I

    .line 261
    iput-object v2, p0, Ll/᩺᩵ۚ;->ܽ:[I

    .line 264
    :cond_4
    iget-object v1, p0, Ll/᩺᩵ۚ;->֫:[I

    aput p1, v1, v0

    .line 265
    iget-object p1, p0, Ll/᩺᩵ۚ;->ܽ:[I

    aput p2, p1, v0

    add-int/lit8 v0, v0, 0x1

    .line 266
    iput v0, p0, Ll/᩺᩵ۚ;->ۧ:I

    return-void
.end method
