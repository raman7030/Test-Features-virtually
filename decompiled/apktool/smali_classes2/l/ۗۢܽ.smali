.class public final Ll/ۗۢܽ;
.super Ljava/lang/Object;
.source "T5RH"

# interfaces
.implements Ll/ۖۢܽ;


# virtual methods
.method public final ֫(Ll/ܺܺܽ;)V
    .locals 3

    .line 258
    new-instance v0, Ll/ۨ᩷ܽ;

    invoke-direct {v0}, Ll/ۨ᩷ܽ;-><init>()V

    .line 259
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨ᩷ܽ;

    invoke-virtual {v1}, Ll/ۨ᩷ܽ;->ܺ()Ljava/lang/String;

    move-result-object v1

    .line 260
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨ᩷ܽ;

    invoke-virtual {v2}, Ll/ۨ᩷ܽ;->ܺ()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Ll/۬֨ᩴ;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۨ᩷ܽ;->֫(Ljava/lang/String;)V

    .line 261
    invoke-virtual {p1, v0}, Ll/ܺܺܽ;->֫(Ll/ۨ᩷ܽ;)V

    return-void
.end method
