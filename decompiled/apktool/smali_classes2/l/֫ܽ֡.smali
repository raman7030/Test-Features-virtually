.class public final Ll/֫ܽ֡;
.super Ljava/lang/Object;
.source "A4EI"


# instance fields
.field public ֫:I

.field public final ۧ:[I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xa

    new-array v0, v0, [I

    .line 51
    iput-object v0, p0, Ll/֫ܽ֡;->ۧ:[I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 88
    iget v0, p0, Ll/֫ܽ֡;->֫:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/֫ܽ֡;->ۧ:[I

    const/4 v1, 0x1

    aget v0, v0, v1

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public final ֫(I)I
    .locals 1

    .line 77
    iget-object v0, p0, Ll/֫ܽ֡;->ۧ:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ֫(II)V
    .locals 3

    if-ltz p1, :cond_1

    .line 59
    iget-object v0, p0, Ll/֫ܽ֡;->ۧ:[I

    array-length v1, v0

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    shl-int/2addr v1, p1

    .line 64
    iget v2, p0, Ll/֫ܽ֡;->֫:I

    or-int/2addr v1, v2

    iput v1, p0, Ll/֫ܽ֡;->֫:I

    .line 65
    aput p2, v0, p1

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫(Ll/֫ܽ֡;)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0xa

    if-ge v0, v1, :cond_1

    .line 123
    invoke-virtual {p1, v0}, Ll/֫ܽ֡;->ܽ(I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 77
    :cond_0
    iget-object v1, p1, Ll/֫ܽ֡;->ۧ:[I

    aget v1, v1, v0

    .line 124
    invoke-virtual {p0, v0, v1}, Ll/֫ܽ֡;->֫(II)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۧ()I
    .locals 2

    .line 114
    iget v0, p0, Ll/֫ܽ֡;->֫:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/֫ܽ֡;->ۧ:[I

    const/4 v1, 0x7

    aget v0, v0, v1

    return v0

    :cond_0
    const v0, 0xffff

    return v0
.end method

.method public final ۧ(I)I
    .locals 1

    .line 104
    iget v0, p0, Ll/֫ܽ֡;->֫:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    iget-object p1, p0, Ll/֫ܽ֡;->ۧ:[I

    const/4 v0, 0x5

    aget p1, p1, v0

    :cond_0
    return p1
.end method

.method public final ܽ()I
    .locals 2

    .line 99
    iget v0, p0, Ll/֫ܽ֡;->֫:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/֫ܽ֡;->ۧ:[I

    const/4 v1, 0x4

    aget v0, v0, v1

    return v0

    :cond_0
    const v0, 0x7fffffff

    return v0
.end method

.method public final ܽ(I)Z
    .locals 2

    const/4 v0, 0x1

    shl-int p1, v0, p1

    .line 72
    iget v1, p0, Ll/֫ܽ֡;->֫:I

    and-int/2addr p1, v1

    if-eqz p1, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩳ()I
    .locals 1

    .line 82
    iget v0, p0, Ll/֫ܽ֡;->֫:I

    invoke-static {v0}, Ljava/lang/Integer;->bitCount(I)I

    move-result v0

    return v0
.end method
