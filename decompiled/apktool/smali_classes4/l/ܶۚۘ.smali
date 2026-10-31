.class public abstract Ll/ܶۚۘ;
.super Ll/ۤ᩵ۚ;
.source "H89S"


# instance fields
.field public ֫:I


# virtual methods
.method public final ֫()I
    .locals 1

    .line 75
    iget v0, p0, Ll/ܶۚۘ;->֫:I

    return v0
.end method

.method public final ֫(Ll/ܺۚۘ;)V
    .locals 1

    .line 88
    invoke-virtual {p0, p1}, Ll/ܶۚۘ;->ۧ(Ll/ܺۚۘ;)V

    .line 90
    sget-object v0, Ll/ۘۚۘ;->ۙ:Ll/ۘۚۘ;

    invoke-virtual {p1, v0}, Ll/ܺۚۘ;->֫(Ll/ۘۚۘ;)V

    .line 91
    invoke-virtual {p1}, Ll/ܺۚۘ;->ܽ()I

    move-result v0

    iput v0, p0, Ll/ܶۚۘ;->֫:I

    .line 94
    :try_start_0
    invoke-virtual {p1}, Ll/ܺۚۘ;->֫()B
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    new-instance p1, Ll/ۡۚۘ;

    const-string v0, "At least one byte remained after reading the return code. Is this response aligned properly?"

    .line 62
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 98
    throw p1

    :catch_0
    return-void
.end method

.method public abstract ۧ(Ll/ܺۚۘ;)V
.end method
