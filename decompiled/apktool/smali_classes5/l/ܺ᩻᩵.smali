.class public final Ll/ܺ᩻᩵;
.super Ll/ۡ᩻᩵;
.source "I6PU"


# virtual methods
.method public final ֫(I)Ll/ۗ᩻᩵;
    .locals 7

    .line 1486
    iget-object v0, p0, Ll/֨᩻᩵;->᩺:Ll/ۗ᩻᩵;

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    iget-object v2, v0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-eqz v2, :cond_8

    iget-object v3, p0, Ll/ۡ᩻᩵;->ܰ:Ll/ۗ᩻᩵;

    if-eqz v3, :cond_8

    iget-object v4, v3, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-eqz v4, :cond_8

    iget-object v5, p0, Ll/֨᩻᩵;->ۛ:Ll/ۗ᩻᩵;

    if-nez v5, :cond_0

    goto :goto_1

    .line 1490
    :cond_0
    iget-object v6, v5, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-nez v6, :cond_4

    .line 1491
    instance-of v6, v2, Ll/᩻᩻᩵;

    if-eqz v6, :cond_1

    move-object v6, v2

    check-cast v6, Ll/᩻᩻᩵;

    iget-object v6, v6, Ll/᩻᩻᩵;->֫:Ljava/lang/Throwable;

    if-nez v6, :cond_2

    :cond_1
    instance-of v2, v4, Ll/᩻᩻᩵;

    if-eqz v2, :cond_3

    move-object v2, v4

    check-cast v2, Ll/᩻᩻᩵;

    iget-object v6, v2, Ll/᩻᩻᩵;->֫:Ljava/lang/Throwable;

    if-eqz v6, :cond_3

    move-object v2, v4

    .line 1495
    :cond_2
    invoke-virtual {v5, v2, v6}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 1497
    :cond_3
    invoke-virtual {v5}, Ll/ۗ᩻᩵;->ܽ()V

    .line 1499
    :cond_4
    :goto_0
    iput-object v1, p0, Ll/֨᩻᩵;->᩺:Ll/ۗ᩻᩵;

    iput-object v1, p0, Ll/ۡ᩻᩵;->ܰ:Ll/ۗ᩻᩵;

    iput-object v1, p0, Ll/֨᩻᩵;->ۛ:Ll/ۗ᩻᩵;

    .line 1248
    iget-object v1, v3, Ll/ۗ᩻᩵;->᩹:Ll/ۘ᩻᩵;

    if-eqz v1, :cond_7

    .line 1250
    iget-object v1, v3, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-nez v1, :cond_5

    .line 1251
    invoke-virtual {v3}, Ll/ۗ᩻᩵;->ۧ()V

    :cond_5
    if-ltz p1, :cond_7

    if-nez v1, :cond_6

    .line 1252
    iget-object v1, v3, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-eqz v1, :cond_7

    .line 1253
    :cond_6
    invoke-virtual {v3}, Ll/ۗ᩻᩵;->ܳ()V

    .line 1255
    :cond_7
    invoke-virtual {v5, v0, p1}, Ll/ۗ᩻᩵;->֫(Ll/ۗ᩻᩵;I)Ll/ۗ᩻᩵;

    move-result-object p1

    return-object p1

    :cond_8
    :goto_1
    return-object v1
.end method
