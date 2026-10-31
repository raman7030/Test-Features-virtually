.class public final Ll/᩺ۡܽ;
.super Ljava/lang/Object;
.source "T5YJ"

# interfaces
.implements Ll/ۖۢܽ;


# virtual methods
.method public final ֫(Ll/ܺܺܽ;)V
    .locals 4

    .line 149
    new-instance v0, Ll/ۨ᩷ܽ;

    invoke-direct {v0}, Ll/ۨ᩷ܽ;-><init>()V

    .line 150
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨ᩷ܽ;

    invoke-virtual {v1}, Ll/ۨ᩷ܽ;->ۜ()I

    move-result v1

    .line 151
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨ᩷ܽ;

    invoke-virtual {v2}, Ll/ۨ᩷ܽ;->ۜ()I

    move-result v2

    .line 152
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۨ᩷ܽ;

    invoke-virtual {v3}, Ll/ۨ᩷ܽ;->ܺ()Ljava/lang/String;

    move-result-object v3

    .line 153
    invoke-virtual {v3, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۨ᩷ܽ;->֫(Ljava/lang/String;)V

    .line 154
    invoke-virtual {p1, v0}, Ll/ܺܺܽ;->֫(Ll/ۨ᩷ܽ;)V

    return-void
.end method
