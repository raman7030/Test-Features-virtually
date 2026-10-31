.class public final Ll/ܰ᩺ۖ;
.super Ll/۬᩺ۖ;
.source "09DH"


# instance fields
.field public ܽ:[B


# virtual methods
.method public final ֫(Ll/۫ܰۖ;)V
    .locals 2

    .line 44
    iget-object v0, p0, Ll/۬᩺ۖ;->֫:Ll/ۗ᩺ۖ;

    invoke-virtual {v0}, Ll/ۗ᩺ۖ;->getValue()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-virtual {p1, v1}, Ll/ۤܰۖ;->ۧ(I)V

    const/16 v0, 0x30

    .line 45
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    const-wide/16 v0, 0x30

    .line 46
    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->ۧ(J)V

    const-wide/16 v0, 0x0

    .line 47
    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->ۧ(J)V

    .line 48
    iget-object v0, p0, Ll/۬᩺ۖ;->ۧ:Ljava/lang/Object;

    check-cast v0, [B

    .line 318
    array-length v1, v0

    invoke-virtual {p1, v1, v0}, Ll/ۤܰۖ;->֫(I[B)V

    .line 49
    iget-object v0, p0, Ll/ܰ᩺ۖ;->ܽ:[B

    .line 318
    array-length v1, v0

    invoke-virtual {p1, v1, v0}, Ll/ۤܰۖ;->֫(I[B)V

    return-void
.end method

.method public final ۧ(Ll/۫ܰۖ;)V
    .locals 2

    .line 34
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩻()I

    .line 35
    invoke-virtual {p1}, Ll/ۤܰۖ;->ۜ()J

    const/4 v0, 0x4

    .line 36
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ܿ(I)V

    const/16 v0, 0x8

    new-array v1, v0, [B

    .line 293
    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->ۧ(I[B)V

    .line 37
    iput-object v1, p0, Ll/۬᩺ۖ;->ۧ:Ljava/lang/Object;

    const/16 v0, 0x20

    new-array v1, v0, [B

    .line 293
    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->ۧ(I[B)V

    .line 38
    iput-object v1, p0, Ll/ܰ᩺ۖ;->ܽ:[B

    return-void
.end method
