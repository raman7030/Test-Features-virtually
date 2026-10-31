.class public final Ll/ᩴ᩵ܿ;
.super Ll/᩷᩵ܿ;
.source "A186"


# virtual methods
.method public final ֫()J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public final ֫(I)V
    .locals 0

    return-void
.end method

.method public final ֫(J)V
    .locals 0

    return-void
.end method

.method public final ۧ()I
    .locals 2

    .line 388
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unsupported"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
