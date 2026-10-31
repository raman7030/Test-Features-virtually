.class public final Ll/ۖۡܽ;
.super Ljava/lang/Object;
.source "A63D"

# interfaces
.implements Ll/ۖۢܽ;


# virtual methods
.method public final ֫(Ll/ܺܺܽ;)V
    .locals 2

    .line 105
    new-instance v0, Ll/ۨ᩷ܽ;

    invoke-direct {v0}, Ll/ۨ᩷ܽ;-><init>()V

    .line 107
    :try_start_0
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨ᩷ܽ;

    invoke-virtual {v1}, Ll/ۨ᩷ܽ;->ۢ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡۖܽ;

    .line 108
    invoke-virtual {v1}, Ll/ۡۖܽ;->ܿ()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۨ᩷ܽ;->֫(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v1, 0x0

    .line 110
    invoke-virtual {v0, v1}, Ll/ۨ᩷ܽ;->֫(I)V

    .line 112
    :goto_0
    invoke-virtual {p1, v0}, Ll/ܺܺܽ;->֫(Ll/ۨ᩷ܽ;)V

    return-void
.end method
