.class public final Ll/ۨۡܽ;
.super Ljava/lang/Object;
.source "T5YJ"

# interfaces
.implements Ll/ۖۢܽ;


# virtual methods
.method public final ֫(Ll/ܺܺܽ;)V
    .locals 4

    .line 90
    new-instance v0, Ll/ۨ᩷ܽ;

    invoke-direct {v0}, Ll/ۨ᩷ܽ;-><init>()V

    .line 91
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨ᩷ܽ;

    invoke-virtual {v1}, Ll/ۨ᩷ܽ;->ܺ()Ljava/lang/String;

    move-result-object v1

    .line 92
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨ᩷ܽ;

    invoke-virtual {v2}, Ll/ۨ᩷ܽ;->ܺ()Ljava/lang/String;

    move-result-object v2

    .line 93
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۨ᩷ܽ;

    invoke-virtual {v3}, Ll/ۨ᩷ܽ;->ܺ()Ljava/lang/String;

    move-result-object v3

    .line 94
    invoke-virtual {v3, v2, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۨ᩷ܽ;->֫(Ljava/lang/String;)V

    .line 95
    invoke-virtual {p1, v0}, Ll/ܺܺܽ;->֫(Ll/ۨ᩷ܽ;)V

    return-void
.end method
