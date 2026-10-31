.class public abstract Ll/֫֨ۘ;
.super Ljava/lang/Object;
.source "P8A8"

# interfaces
.implements Ll/ᩴۚۘ;


# instance fields
.field public ֫:Ll/ܿ֨ۘ;


# virtual methods
.method public final ֫()Ll/ܿ֨ۘ;
    .locals 1

    .line 60
    iget-object v0, p0, Ll/֫֨ۘ;->֫:Ll/ܿ֨ۘ;

    return-object v0
.end method

.method public final ֫(Ll/ܺۚۘ;)V
    .locals 1

    .line 60
    iget-object v0, p0, Ll/֫֨ۘ;->֫:Ll/ܿ֨ۘ;

    if-eqz v0, :cond_0

    .line 99
    invoke-virtual {p1, v0}, Ll/ܺۚۘ;->֫(Ll/ᩴۚۘ;)V

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/ܺۚۘ;)V
    .locals 6

    .line 73
    sget-object v0, Ll/ۘۚۘ;->ۙ:Ll/ۘۚۘ;

    invoke-virtual {p1, v0}, Ll/ܺۚۘ;->֫(Ll/ۘۚۘ;)V

    .line 76
    invoke-virtual {p1}, Ll/ܺۚۘ;->ܽ()I

    move-result v0

    .line 118
    sget-object v1, Ll/ܰۚۘ;->ۙ:Ll/ܰۚۘ;

    .line 77
    invoke-virtual {v1}, Ll/ܰۚۘ;->֫()I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-ne v0, v2, :cond_2

    .line 83
    invoke-virtual {p1}, Ll/ܺۚۘ;->ܽ()I

    move-result v1

    if-ne v1, v0, :cond_1

    .line 57
    invoke-virtual {p1}, Ll/ܺۚۘ;->ܽ()I

    move-result p1

    if-eqz p1, :cond_0

    .line 123
    new-instance p1, Ll/ܿ֨ۘ;

    .line 32
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 91
    iput-object p1, p0, Ll/֫֨ۘ;->֫:Ll/ܿ֨ۘ;

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 93
    iput-object p1, p0, Ll/֫֨ۘ;->֫:Ll/ܿ֨ۘ;

    return-void

    .line 85
    :cond_1
    new-instance p1, Ll/ۡۚۘ;

    .line 86
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v2, v5, [Ljava/lang/Object;

    aput-object v0, v2, v4

    aput-object v1, v2, v3

    const-string v0, "Expected info level %d to match enum level, got: %d"

    .line 85
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 62
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 85
    throw p1

    .line 78
    :cond_2
    new-instance p1, Ll/ۡۚۘ;

    .line 79
    invoke-virtual {v1}, Ll/ܰۚۘ;->֫()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v2, v5, [Ljava/lang/Object;

    aput-object v1, v2, v4

    aput-object v0, v2, v3

    const-string v0, "Expected info level %d, got: %d"

    .line 78
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 62
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 78
    throw p1
.end method

.method public final ܽ(Ll/ܺۚۘ;)V
    .locals 0

    return-void
.end method
