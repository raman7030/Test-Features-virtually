.class public final Ll/ۗۡܽ;
.super Ljava/lang/Object;
.source "T5YJ"

# interfaces
.implements Ll/ۖۢܽ;


# virtual methods
.method public final ֫(Ll/ܺܺܽ;)V
    .locals 3

    .line 177
    new-instance v0, Ll/ۨ᩷ܽ;

    invoke-direct {v0}, Ll/ۨ᩷ܽ;-><init>()V

    .line 178
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨ᩷ܽ;

    invoke-virtual {v1}, Ll/ۨ᩷ܽ;->ܺ()Ljava/lang/String;

    move-result-object v1

    .line 180
    :try_start_0
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ۨ᩷ܽ;->֫(J)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-wide/16 v1, 0x0

    .line 182
    invoke-virtual {v0, v1, v2}, Ll/ۨ᩷ܽ;->֫(J)V

    .line 184
    :goto_0
    invoke-virtual {p1, v0}, Ll/ܺܺܽ;->֫(Ll/ۨ᩷ܽ;)V

    return-void
.end method
