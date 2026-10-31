.class public final Ll/ۢۢܽ;
.super Ljava/lang/Object;
.source "86A1"

# interfaces
.implements Ll/ۖۢܽ;


# virtual methods
.method public final ֫(Ll/ܺܺܽ;)V
    .locals 5

    .line 152
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ᩷ܽ;

    invoke-virtual {v0}, Ll/ۨ᩷ܽ;->᩷()J

    move-result-wide v0

    .line 153
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨ᩷ܽ;

    invoke-virtual {v2}, Ll/ۨ᩷ܽ;->ܺ()Ljava/lang/String;

    move-result-object v2

    .line 154
    new-instance v3, Ll/ۨ᩷ܽ;

    invoke-direct {v3}, Ll/ۨ᩷ܽ;-><init>()V

    .line 155
    sget-object v4, Ll/ۙ᩸᩷;->᩻:Ll/۫ۤۡ;

    invoke-interface {v4}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v4

    invoke-interface {v4, v0, v1, v2}, Ll/۬ۤۡ;->֫(JLjava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    invoke-interface {v0}, Ll/۬ۤۡ;->commit()Z

    move-result v0

    invoke-virtual {v3, v0}, Ll/ۨ᩷ܽ;->֫(Z)V

    .line 156
    invoke-virtual {p1, v3}, Ll/ܺܺܽ;->֫(Ll/ۨ᩷ܽ;)V

    return-void
.end method
