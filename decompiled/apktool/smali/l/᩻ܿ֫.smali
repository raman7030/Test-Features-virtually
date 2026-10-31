.class public final Ll/᩻ܿ֫;
.super Ll/᩷ܿ֫;
.source "9B0Q"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ll/᩷ܿ֫;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    const/16 v0, 0x10

    .line 42
    invoke-virtual {p0, v0}, Ll/᩷ܿ֫;->֫(I)I

    move-result v0

    if-eqz v0, :cond_0

    .line 123
    iget v1, p0, Ll/᩷ܿ֫;->ۧ:I

    add-int/2addr v0, v1

    .line 124
    iget-object v1, p0, Ll/᩷ܿ֫;->֫:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    add-int/2addr v1, v0

    .line 125
    iget-object v0, p0, Ll/᩷ܿ֫;->֫:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ(I)I
    .locals 3

    const/16 v0, 0x10

    .line 41
    invoke-virtual {p0, v0}, Ll/᩷ܿ֫;->֫(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Ll/᩷ܿ֫;->֫:Ljava/nio/ByteBuffer;

    .line 135
    iget v2, p0, Ll/᩷ܿ֫;->ۧ:I

    add-int/2addr v0, v2

    .line 136
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    add-int/2addr v2, v0

    add-int/lit8 v2, v2, 0x4

    mul-int/lit8 p1, p1, 0x4

    add-int/2addr p1, v2

    .line 41
    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()Z
    .locals 4

    const/4 v0, 0x6

    .line 36
    invoke-virtual {p0, v0}, Ll/᩷ܿ֫;->֫(I)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, Ll/᩷ܿ֫;->֫:Ljava/nio/ByteBuffer;

    iget v3, p0, Ll/᩷ܿ֫;->ۧ:I

    add-int/2addr v0, v3

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public final ܳ()S
    .locals 3

    const/16 v0, 0xc

    .line 39
    invoke-virtual {p0, v0}, Ll/᩷ܿ֫;->֫(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Ll/᩷ܿ֫;->֫:Ljava/nio/ByteBuffer;

    iget v2, p0, Ll/᩷ܿ֫;->ۧ:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()S
    .locals 3

    const/16 v0, 0xe

    .line 40
    invoke-virtual {p0, v0}, Ll/᩷ܿ֫;->֫(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Ll/᩷ܿ֫;->֫:Ljava/nio/ByteBuffer;

    iget v2, p0, Ll/᩷ܿ֫;->ۧ:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܿ()S
    .locals 3

    const/16 v0, 0x8

    .line 37
    invoke-virtual {p0, v0}, Ll/᩷ܿ֫;->֫(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Ll/᩷ܿ֫;->֫:Ljava/nio/ByteBuffer;

    iget v2, p0, Ll/᩷ܿ֫;->ۧ:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()I
    .locals 3

    const/4 v0, 0x4

    .line 35
    invoke-virtual {p0, v0}, Ll/᩷ܿ֫;->֫(I)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Ll/᩷ܿ֫;->֫:Ljava/nio/ByteBuffer;

    iget v2, p0, Ll/᩷ܿ֫;->ۧ:I

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
