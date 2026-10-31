.class public final Ll/ۜۗ֡;
.super Ljava/lang/Object;
.source "F4XQ"


# instance fields
.field public ֫:[I

.field public ۧ:I

.field public ܽ:[I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0xa

    .line 37
    invoke-direct {p0, v0}, Ll/ۜۗ֡;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-array v0, p1, [I

    iput-object v0, p0, Ll/ۜۗ֡;->֫:[I

    .line 47
    new-array p1, p1, [I

    iput-object p1, p0, Ll/ۜۗ֡;->ܽ:[I

    const/4 p1, 0x0

    .line 48
    iput p1, p0, Ll/ۜۗ֡;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    const/4 v0, 0x0

    .line 158
    iget-object v1, p0, Ll/ۜۗ֡;->֫:[I

    aget v0, v1, v0

    return v0
.end method

.method public final ֫(II)V
    .locals 7

    .line 99
    iget-object v0, p0, Ll/ۜۗ֡;->֫:[I

    iget v1, p0, Ll/ۜۗ֡;->ۧ:I

    const/4 v2, -0x1

    move v3, v1

    :goto_0
    sub-int v4, v3, v2

    const/4 v5, 0x1

    if-le v4, v5, :cond_1

    add-int v4, v3, v2

    .line 236
    div-int/lit8 v4, v4, 0x2

    .line 238
    aget v5, v0, v4

    if-ge v5, p1, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v3, v4

    goto :goto_0

    :cond_1
    if-ne v3, v1, :cond_2

    not-int v3, v1

    goto :goto_1

    .line 246
    :cond_2
    aget v0, v0, v3

    if-ne v0, p1, :cond_3

    goto :goto_1

    :cond_3
    not-int v3, v3

    :goto_1
    if-ltz v3, :cond_4

    .line 102
    iget-object p1, p0, Ll/ۜۗ֡;->ܽ:[I

    aput p2, p1, v3

    return-void

    :cond_4
    not-int v0, v3

    .line 106
    iget v1, p0, Ll/ۜۗ֡;->ۧ:I

    iget-object v2, p0, Ll/ۜۗ֡;->֫:[I

    array-length v3, v2

    if-lt v1, v3, :cond_5

    add-int/2addr v1, v5

    .line 107
    array-length v2, v2

    mul-int/lit8 v2, v2, 0x2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 109
    new-array v2, v1, [I

    .line 110
    new-array v1, v1, [I

    .line 113
    iget-object v3, p0, Ll/ۜۗ֡;->֫:[I

    array-length v4, v3

    const/4 v6, 0x0

    invoke-static {v3, v6, v2, v6, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 114
    iget-object v3, p0, Ll/ۜۗ֡;->ܽ:[I

    array-length v4, v3

    invoke-static {v3, v6, v1, v6, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 116
    iput-object v2, p0, Ll/ۜۗ֡;->֫:[I

    .line 117
    iput-object v1, p0, Ll/ۜۗ֡;->ܽ:[I

    .line 120
    :cond_5
    iget v1, p0, Ll/ۜۗ֡;->ۧ:I

    sub-int v2, v1, v0

    if-eqz v2, :cond_6

    .line 122
    iget-object v2, p0, Ll/ۜۗ֡;->֫:[I

    add-int/lit8 v3, v0, 0x1

    sub-int/2addr v1, v0

    invoke-static {v2, v0, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 123
    iget-object v1, p0, Ll/ۜۗ֡;->ܽ:[I

    iget v2, p0, Ll/ۜۗ֡;->ۧ:I

    sub-int/2addr v2, v0

    invoke-static {v1, v0, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 126
    :cond_6
    iget-object v1, p0, Ll/ۜۗ֡;->֫:[I

    aput p1, v1, v0

    .line 127
    iget-object p1, p0, Ll/ۜۗ֡;->ܽ:[I

    aput p2, p1, v0

    .line 128
    iget p1, p0, Ll/ۜۗ֡;->ۧ:I

    add-int/2addr p1, v5

    iput p1, p0, Ll/ۜۗ֡;->ۧ:I

    return-void
.end method

.method public final ۧ()[I
    .locals 4

    .line 133
    iget v0, p0, Ll/ۜۗ֡;->ۧ:I

    new-array v1, v0, [I

    .line 134
    iget-object v2, p0, Ll/ۜۗ֡;->֫:[I

    const/4 v3, 0x0

    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1
.end method

.method public final ܽ()I
    .locals 1

    .line 149
    iget v0, p0, Ll/ۜۗ֡;->ۧ:I

    return v0
.end method

.method public final ᩳ()[I
    .locals 4

    .line 139
    iget v0, p0, Ll/ۜۗ֡;->ۧ:I

    new-array v1, v0, [I

    .line 140
    iget-object v2, p0, Ll/ۜۗ֡;->ܽ:[I

    const/4 v3, 0x0

    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1
.end method
