.class public final Ll/᩵᩵;
.super Ljava/lang/Object;
.source "L3KT"


# instance fields
.field public ֫:I

.field public ۧ:[I

.field public ܽ:I

.field public ᩳ:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    .line 70
    invoke-static {v0}, Ljava/lang/Integer;->bitCount(I)I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    const/4 v0, 0x7

    .line 71
    invoke-static {v0}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v0

    shl-int/2addr v0, v2

    :cond_0
    add-int/lit8 v1, v0, -0x1

    .line 76
    iput v1, p0, Ll/᩵᩵;->֫:I

    .line 77
    new-array v0, v0, [I

    iput-object v0, p0, Ll/᩵᩵;->ۧ:[I

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 133
    iget v0, p0, Ll/᩵᩵;->ܽ:I

    iput v0, p0, Ll/᩵᩵;->ᩳ:I

    return-void
.end method

.method public final ֫(I)V
    .locals 6

    .line 97
    iget-object v0, p0, Ll/᩵᩵;->ۧ:[I

    iget v1, p0, Ll/᩵᩵;->ᩳ:I

    aput p1, v0, v1

    add-int/lit8 v1, v1, 0x1

    .line 98
    iget p1, p0, Ll/᩵᩵;->֫:I

    and-int/2addr p1, v1

    iput p1, p0, Ll/᩵᩵;->ᩳ:I

    .line 99
    iget v1, p0, Ll/᩵᩵;->ܽ:I

    if-ne p1, v1, :cond_1

    .line 31
    array-length p1, v0

    sub-int v2, p1, v1

    shl-int/lit8 v3, p1, 0x1

    if-ltz v3, :cond_0

    .line 37
    new-array v4, v3, [I

    const/4 v5, 0x0

    .line 38
    invoke-static {v0, v1, v4, v5, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 39
    iget-object v0, p0, Ll/᩵᩵;->ۧ:[I

    iget v1, p0, Ll/᩵᩵;->ܽ:I

    invoke-static {v0, v5, v4, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 40
    iput-object v4, p0, Ll/᩵᩵;->ۧ:[I

    .line 41
    iput v5, p0, Ll/᩵᩵;->ܽ:I

    .line 42
    iput p1, p0, Ll/᩵᩵;->ᩳ:I

    add-int/lit8 v3, v3, -0x1

    .line 43
    iput v3, p0, Ll/᩵᩵;->֫:I

    return-void

    .line 35
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Max array capacity exceeded"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void
.end method

.method public final ۧ()Z
    .locals 2

    .line 214
    iget v0, p0, Ll/᩵᩵;->ܽ:I

    iget v1, p0, Ll/᩵᩵;->ᩳ:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()I
    .locals 3

    .line 110
    iget v0, p0, Ll/᩵᩵;->ܽ:I

    iget v1, p0, Ll/᩵᩵;->ᩳ:I

    if-eq v0, v1, :cond_0

    .line 111
    iget-object v1, p0, Ll/᩵᩵;->ۧ:[I

    aget v1, v1, v0

    add-int/lit8 v0, v0, 0x1

    .line 112
    iget v2, p0, Ll/᩵᩵;->֫:I

    and-int/2addr v0, v2

    iput v0, p0, Ll/᩵᩵;->ܽ:I

    return v1

    .line 110
    :cond_0
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    throw v0
.end method
