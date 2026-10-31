.class public final Ll/۟ۢܽ;
.super Ljava/lang/Object;
.source "X66Z"

# interfaces
.implements Ll/ۖۢܽ;


# virtual methods
.method public final ֫(Ll/ܺܺܽ;)V
    .locals 3

    .line 97
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ᩷ܽ;

    invoke-virtual {v0}, Ll/ۨ᩷ܽ;->ۜ()I

    move-result v0

    .line 98
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨ᩷ܽ;

    invoke-virtual {v1}, Ll/ۨ᩷ܽ;->ۢ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/json/JSONArray;

    .line 99
    new-instance v2, Ll/ۨ᩷ܽ;

    invoke-direct {v2}, Ll/ۨ᩷ܽ;-><init>()V

    .line 101
    :try_start_0
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Ll/ۨ᩷ܽ;->֫(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    :catchall_0
    invoke-virtual {p1, v2}, Ll/ܺܺܽ;->֫(Ll/ۨ᩷ܽ;)V

    return-void
.end method
