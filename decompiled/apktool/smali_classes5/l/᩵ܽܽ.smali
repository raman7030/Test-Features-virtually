.class public final Ll/᩵ܽܽ;
.super Ll/֡ܽܽ;
.source "CAOF"


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 177
    iget-object v0, p0, Ll/֡ܽܽ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public final ֫(Ljava/lang/StringBuilder;I)V
    .locals 0

    .line 171
    iget-object p2, p0, Ll/֡ܽܽ;->ܽ:Ljava/lang/String;

    invoke-static {p1, p2}, Ll/֡ܽܽ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ll/֡ܽܽ;)V
    .locals 0

    .line 166
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method
