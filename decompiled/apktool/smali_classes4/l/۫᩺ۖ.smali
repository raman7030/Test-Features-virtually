.class public final Ll/۫᩺ۖ;
.super Ll/۬᩺ۖ;
.source "V9KS"


# virtual methods
.method public final ֫(Ll/۫ܰۖ;)V
    .locals 2

    .line 33
    iget-object v0, p0, Ll/۬᩺ۖ;->֫:Ll/ۗ᩺ۖ;

    invoke-virtual {v0}, Ll/ۗ᩺ۖ;->getValue()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-virtual {p1, v1}, Ll/ۤܰۖ;->ۧ(I)V

    .line 34
    iget-object v0, p0, Ll/۬᩺ۖ;->ۧ:Ljava/lang/Object;

    check-cast v0, [B

    array-length v0, v0

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    .line 35
    iget-object v0, p0, Ll/۬᩺ۖ;->ۧ:Ljava/lang/Object;

    check-cast v0, [B

    .line 318
    array-length v1, v0

    invoke-virtual {p1, v1, v0}, Ll/ۤܰۖ;->֫(I[B)V

    return-void
.end method
