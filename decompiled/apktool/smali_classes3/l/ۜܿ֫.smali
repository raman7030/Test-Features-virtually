.class public final Ll/ۜܿ֫;
.super Ll/᩷ܿ֫;
.source "QB0L"


# direct methods
.method public static ֫(Ljava/nio/ByteBuffer;)Ll/ۜܿ֫;
    .locals 3

    .line 30
    new-instance v0, Ll/ۜܿ֫;

    .line 28
    invoke-direct {v0}, Ll/᩷ܿ֫;-><init>()V

    .line 31
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v1

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v2

    add-int/2addr v2, v1

    .line 32
    invoke-virtual {v0, p0, v2}, Ll/᩷ܿ֫;->֫(Ljava/nio/ByteBuffer;I)V

    return-object v0
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    const/4 v0, 0x6

    .line 38
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

.method public final ֫(Ll/᩻ܿ֫;I)V
    .locals 2

    const/4 v0, 0x6

    .line 37
    invoke-virtual {p0, v0}, Ll/᩷ܿ֫;->֫(I)I

    move-result v0

    if-eqz v0, :cond_0

    .line 135
    iget v1, p0, Ll/᩷ܿ֫;->ۧ:I

    add-int/2addr v0, v1

    .line 136
    iget-object v1, p0, Ll/᩷ܿ֫;->֫:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    add-int/2addr v1, v0

    add-int/lit8 v1, v1, 0x4

    mul-int/lit8 p2, p2, 0x4

    add-int/2addr p2, v1

    .line 68
    iget-object v0, p0, Ll/᩷ܿ֫;->֫:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr v0, p2

    .line 37
    iget-object p2, p0, Ll/᩷ܿ֫;->֫:Ljava/nio/ByteBuffer;

    .line 32
    invoke-virtual {p1, p2, v0}, Ll/᩷ܿ֫;->֫(Ljava/nio/ByteBuffer;I)V

    :cond_0
    return-void
.end method

.method public final ۧ()I
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
