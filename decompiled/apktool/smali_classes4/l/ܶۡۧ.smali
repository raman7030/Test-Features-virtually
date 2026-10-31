.class public abstract Ll/ܶۡۧ;
.super Ljava/lang/Object;
.source "B8K8"


# virtual methods
.method public final ֫(Ll/۠ۡۧ;)Ll/᩻᩵֫;
    .locals 2

    .line 31
    iget-object v0, p1, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 32
    :goto_0
    invoke-static {v1}, Ll/᩺֡֫;->֫(Z)V

    .line 34
    invoke-virtual {p0, p1, v0}, Ll/ܶۡۧ;->֫(Ll/۠ۡۧ;Ljava/nio/ByteBuffer;)Ll/᩻᩵֫;

    move-result-object p1

    return-object p1
.end method

.method public abstract ֫(Ll/۠ۡۧ;Ljava/nio/ByteBuffer;)Ll/᩻᩵֫;
.end method
