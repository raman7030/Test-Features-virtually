.class public final Ll/ۘۡܽ;
.super Ljava/lang/Object;
.source "A63D"

# interfaces
.implements Ll/ۖۢܽ;


# virtual methods
.method public final ֫(Ll/ܺܺܽ;)V
    .locals 6

    .line 162
    new-instance v0, Ll/ۨ᩷ܽ;

    invoke-direct {v0}, Ll/ۨ᩷ܽ;-><init>()V

    .line 164
    :try_start_0
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨ᩷ܽ;

    invoke-virtual {v1}, Ll/ۨ᩷ܽ;->ۜ()I

    move-result v1

    .line 165
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨ᩷ܽ;

    invoke-virtual {v2}, Ll/ۨ᩷ܽ;->ۢ()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡۖܽ;

    .line 166
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    new-array v3, v1, [B

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_0

    .line 64
    invoke-virtual {v2}, Ll/ۡۖܽ;->ܿ()I

    move-result v5

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 166
    :cond_0
    invoke-virtual {v0, v3}, Ll/ۨ᩷ܽ;->֫(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 169
    :catch_0
    invoke-virtual {p1, v0}, Ll/ܺܺܽ;->֫(Ll/ۨ᩷ܽ;)V

    return-void
.end method
