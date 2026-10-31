.class public final Ll/ۚۢۧ;
.super Ljava/lang/Object;
.source "J8H8"


# instance fields
.field public ֫:I

.field public final ۧ:I

.field public ܽ:I

.field public final ᩳ:[B


# direct methods
.method public constructor <init>([B)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Ll/ۚۢۧ;->ᩳ:[B

    .line 45
    array-length p1, p1

    iput p1, p0, Ll/ۚۢۧ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 102
    iget v0, p0, Ll/ۚۢۧ;->ܽ:I

    mul-int/lit8 v0, v0, 0x8

    iget v1, p0, Ll/ۚۢۧ;->֫:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final ֫(I)I
    .locals 6

    .line 72
    iget v0, p0, Ll/ۚۢۧ;->ܽ:I

    .line 73
    iget v1, p0, Ll/ۚۢۧ;->֫:I

    rsub-int/lit8 v1, v1, 0x8

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    add-int/lit8 v2, v0, 0x1

    .line 74
    iget-object v3, p0, Ll/ۚۢۧ;->ᩳ:[B

    aget-byte v0, v3, v0

    const/16 v4, 0xff

    and-int/2addr v0, v4

    iget v5, p0, Ll/ۚۢۧ;->֫:I

    shr-int/2addr v0, v5

    rsub-int/lit8 v5, v1, 0x8

    shr-int v5, v4, v5

    and-int/2addr v0, v5

    :goto_0
    if-ge v1, p1, :cond_0

    add-int/lit8 v5, v2, 0x1

    .line 76
    aget-byte v2, v3, v2

    and-int/2addr v2, v4

    shl-int/2addr v2, v1

    or-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x8

    move v2, v5

    goto :goto_0

    :cond_0
    rsub-int/lit8 v1, p1, 0x20

    const/4 v2, -0x1

    ushr-int v1, v2, v1

    and-int/2addr v0, v1

    .line 80
    invoke-virtual {p0, p1}, Ll/ۚۢۧ;->ۧ(I)V

    return v0
.end method

.method public final ۧ(I)V
    .locals 3

    .line 90
    div-int/lit8 v0, p1, 0x8

    .line 91
    iget v1, p0, Ll/ۚۢۧ;->ܽ:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/ۚۢۧ;->ܽ:I

    .line 92
    iget v2, p0, Ll/ۚۢۧ;->֫:I

    mul-int/lit8 v0, v0, 0x8

    sub-int/2addr p1, v0

    add-int/2addr p1, v2

    iput p1, p0, Ll/ۚۢۧ;->֫:I

    const/4 v0, 0x7

    const/4 v2, 0x1

    if-le p1, v0, :cond_0

    add-int/2addr v1, v2

    .line 94
    iput v1, p0, Ll/ۚۢۧ;->ܽ:I

    add-int/lit8 p1, p1, -0x8

    .line 95
    iput p1, p0, Ll/ۚۢۧ;->֫:I

    .line 123
    :cond_0
    iget p1, p0, Ll/ۚۢۧ;->ܽ:I

    if-ltz p1, :cond_1

    iget v0, p0, Ll/ۚۢۧ;->ۧ:I

    if-lt p1, v0, :cond_2

    if-ne p1, v0, :cond_1

    iget p1, p0, Ll/ۚۢۧ;->֫:I

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :cond_2
    :goto_0
    invoke-static {v2}, Ll/᩺֡֫;->ۧ(Z)V

    return-void
.end method

.method public final ۧ()Z
    .locals 2

    .line 60
    iget-object v0, p0, Ll/ۚۢۧ;->ᩳ:[B

    iget v1, p0, Ll/ۚۢۧ;->ܽ:I

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    iget v1, p0, Ll/ۚۢۧ;->֫:I

    shr-int/2addr v0, v1

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 61
    :goto_0
    invoke-virtual {p0, v1}, Ll/ۚۢۧ;->ۧ(I)V

    return v0
.end method
