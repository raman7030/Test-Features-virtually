.class public final Ll/ܿۢܽ;
.super Ljava/lang/Object;
.source "86A1"

# interfaces
.implements Ll/ۖۢܽ;


# virtual methods
.method public final ֫(Ll/ܺܺܽ;)V
    .locals 5

    .line 88
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ᩷ܽ;

    invoke-virtual {v0}, Ll/ۨ᩷ܽ;->ܺ()Ljava/lang/String;

    move-result-object v0

    .line 89
    new-instance v1, Ll/ۨ᩷ܽ;

    invoke-direct {v1}, Ll/ۨ᩷ܽ;-><init>()V

    .line 90
    sget-object v2, Ll/ۙ᩸᩷;->᩻:Ll/۫ۤۡ;

    const-wide/16 v3, 0x0

    invoke-interface {v2, v0, v3, v4}, Ll/۫ۤۡ;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    .line 91
    invoke-virtual {v1, v2, v3}, Ll/ۨ᩷ܽ;->֫(J)V

    .line 92
    invoke-virtual {p1, v1}, Ll/ܺܺܽ;->֫(Ll/ۨ᩷ܽ;)V

    return-void
.end method
