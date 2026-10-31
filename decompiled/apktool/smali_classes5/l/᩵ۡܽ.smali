.class public final Ll/᩵ۡܽ;
.super Ljava/lang/Object;
.source "A63D"

# interfaces
.implements Ll/ۖۢܽ;


# virtual methods
.method public final ֫(Ll/ܺܺܽ;)V
    .locals 9

    .line 90
    new-instance v0, Ll/ۨ᩷ܽ;

    invoke-direct {v0}, Ll/ۨ᩷ܽ;-><init>()V

    .line 92
    :try_start_0
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨ᩷ܽ;

    invoke-virtual {v1}, Ll/ۨ᩷ܽ;->ۢ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡۖܽ;

    .line 77
    invoke-virtual {v1}, Ll/ۡۖܽ;->ܿ()I

    move-result v2

    int-to-long v2, v2

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    invoke-virtual {v1}, Ll/ۡۖܽ;->ܿ()I

    move-result v6

    int-to-long v6, v6

    and-long/2addr v6, v4

    const/16 v8, 0x8

    shl-long/2addr v6, v8

    or-long/2addr v2, v6

    invoke-virtual {v1}, Ll/ۡۖܽ;->ܿ()I

    move-result v6

    int-to-long v6, v6

    and-long/2addr v6, v4

    const/16 v8, 0x10

    shl-long/2addr v6, v8

    or-long/2addr v2, v6

    invoke-virtual {v1}, Ll/ۡۖܽ;->ܿ()I

    move-result v6

    int-to-long v6, v6

    and-long/2addr v6, v4

    const/16 v8, 0x18

    shl-long/2addr v6, v8

    or-long/2addr v2, v6

    .line 78
    invoke-virtual {v1}, Ll/ۡۖܽ;->ܿ()I

    move-result v6

    int-to-long v6, v6

    and-long/2addr v6, v4

    const/16 v8, 0x20

    shl-long/2addr v6, v8

    or-long/2addr v2, v6

    invoke-virtual {v1}, Ll/ۡۖܽ;->ܿ()I

    move-result v6

    int-to-long v6, v6

    and-long/2addr v6, v4

    const/16 v8, 0x28

    shl-long/2addr v6, v8

    or-long/2addr v2, v6

    invoke-virtual {v1}, Ll/ۡۖܽ;->ܿ()I

    move-result v6

    int-to-long v6, v6

    and-long/2addr v6, v4

    const/16 v8, 0x30

    shl-long/2addr v6, v8

    or-long/2addr v2, v6

    invoke-virtual {v1}, Ll/ۡۖܽ;->ܿ()I

    move-result v1

    int-to-long v6, v1

    and-long/2addr v4, v6

    const/16 v1, 0x38

    shl-long/2addr v4, v1

    or-long v1, v2, v4

    .line 93
    invoke-virtual {v0, v1, v2}, Ll/ۨ᩷ܽ;->֫(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-wide/16 v1, 0x0

    .line 95
    invoke-virtual {v0, v1, v2}, Ll/ۨ᩷ܽ;->֫(J)V

    .line 97
    :goto_0
    invoke-virtual {p1, v0}, Ll/ܺܺܽ;->֫(Ll/ۨ᩷ܽ;)V

    return-void
.end method
