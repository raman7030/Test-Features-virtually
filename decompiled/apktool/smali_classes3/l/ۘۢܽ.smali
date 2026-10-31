.class public final Ll/ۘۢܽ;
.super Ljava/lang/Object;
.source "Q5UU"

# interfaces
.implements Ll/ۖۢܽ;


# direct methods
.method public static ֫(ILjava/lang/String;)V
    .locals 2

    .line 28
    invoke-static {p1}, Ll/ۘۢܽ;->֫(Ljava/lang/String;)V

    .line 29
    invoke-static {p0}, Ll/ۖۖۢ;->ۧ(I)V

    const-string v0, "data"

    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x4

    if-eqz v0, :cond_1

    if-ne p0, v1, :cond_0

    goto :goto_0

    .line 32
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "scanKind=data requires referenceKinds=[data]"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    const-string v0, "both"

    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    and-int/2addr p0, v1

    if-eqz p0, :cond_2

    goto :goto_0

    .line 36
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "scanKind=both requires referenceKinds containing data"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    :goto_0
    return-void
.end method

.method public static ֫(Ljava/lang/String;)V
    .locals 1

    const-string v0, "code"

    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "data"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "both"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    .line 21
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid scanKind"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public ֫(Ll/ܺܺܽ;)V
    .locals 3

    .line 15
    new-instance v0, Ll/ۨ᩷ܽ;

    invoke-direct {v0}, Ll/ۨ᩷ܽ;-><init>()V

    .line 16
    new-instance v1, Ljava/util/zip/CRC32;

    invoke-direct {v1}, Ljava/util/zip/CRC32;-><init>()V

    .line 17
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨ᩷ܽ;

    invoke-virtual {v2}, Ll/ۨ᩷ܽ;->ۢ()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    invoke-virtual {v1, v2}, Ljava/util/zip/CRC32;->update([B)V

    .line 18
    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ۨ᩷ܽ;->֫(J)V

    .line 19
    invoke-virtual {p1, v0}, Ll/ܺܺܽ;->֫(Ll/ۨ᩷ܽ;)V

    return-void
.end method
