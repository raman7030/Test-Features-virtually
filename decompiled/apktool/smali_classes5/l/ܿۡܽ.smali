.class public final Ll/ܿۡܽ;
.super Ljava/lang/Object;
.source "X66Z"

# interfaces
.implements Ll/ۖۢܽ;


# virtual methods
.method public final ֫(Ll/ܺܺܽ;)V
    .locals 3

    .line 66
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ᩷ܽ;

    invoke-virtual {v0}, Ll/ۨ᩷ܽ;->ܺ()Ljava/lang/String;

    move-result-object v0

    .line 67
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨ᩷ܽ;

    invoke-virtual {v1}, Ll/ۨ᩷ܽ;->ۢ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/json/JSONObject;

    .line 68
    new-instance v2, Ll/ۨ᩷ܽ;

    invoke-direct {v2}, Ll/ۨ᩷ܽ;-><init>()V

    .line 70
    :try_start_0
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Ll/ۨ᩷ܽ;->֫(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    :catchall_0
    invoke-virtual {p1, v2}, Ll/ܺܺܽ;->֫(Ll/ۨ᩷ܽ;)V

    return-void
.end method
