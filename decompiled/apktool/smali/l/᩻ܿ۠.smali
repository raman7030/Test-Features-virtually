.class public final Ll/᩻ܿ۠;
.super Ljava/lang/Object;
.source "F43P"


# instance fields
.field public ֫:Ljava/nio/ByteBuffer;


# virtual methods
.method public final ֫(I)Ljava/nio/ByteBuffer;
    .locals 1

    const/16 v0, 0x5000

    if-ge p1, v0, :cond_0

    const/16 p1, 0x5000

    .line 433
    :cond_0
    iget-object v0, p0, Ll/᩻ܿ۠;->֫:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    if-lt v0, p1, :cond_1

    .line 434
    iget-object p1, p0, Ll/᩻ܿ۠;->֫:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    move-result-object p1

    check-cast p1, Ljava/nio/ByteBuffer;

    goto :goto_0

    :cond_1
    add-int/2addr p1, p1

    shr-int/lit8 p1, p1, 0x1

    .line 435
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    :goto_0
    const/4 v0, 0x0

    .line 436
    iput-object v0, p0, Ll/᩻ܿ۠;->֫:Ljava/nio/ByteBuffer;

    return-object p1
.end method

.method public final ֫(Ljava/nio/ByteBuffer;)V
    .locals 0

    .line 440
    iput-object p1, p0, Ll/᩻ܿ۠;->֫:Ljava/nio/ByteBuffer;

    return-void
.end method
