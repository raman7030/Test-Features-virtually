.class public final Ll/᩷۬᩵;
.super Ljava/lang/Object;
.source "2AXS"


# direct methods
.method public static final ֫(Ll/ۜۗ᩵;Ll/ۨܶ᩵;Z)V
    .locals 4

    .line 173
    invoke-virtual {p0}, Ll/ۜۗ᩵;->ܽ()Ljava/lang/Object;

    move-result-object v0

    .line 174
    invoke-virtual {p0, v0}, Ll/ۜۗ᩵;->ۧ(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 175
    invoke-static {v1}, Ll/ᩴ۠᩵;->֫(Ljava/lang/Throwable;)Ll/ۖ۠᩵;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Ll/ۜۗ᩵;->ܽ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    if-eqz p2, :cond_4

    .line 177
    check-cast p1, Ll/ۧۛ᩵;

    .line 255
    iget-object p2, p1, Ll/ۧۛ᩵;->ۗ:Ll/ᩴ᩸᩵;

    iget-object v0, p1, Ll/ۧۛ᩵;->۬:Ljava/lang/Object;

    .line 107
    invoke-interface {p2}, Ll/ۨܶ᩵;->getContext()Ll/ܳ᩸᩵;

    move-result-object v1

    .line 108
    invoke-static {v1, v0}, Ll/۬ۛ᩵;->ۧ(Ll/ܳ᩸᩵;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 109
    sget-object v2, Ll/۬ۛ᩵;->֫:Ll/ܶۛ᩵;

    const/4 v3, 0x0

    if-eq v0, v2, :cond_1

    .line 111
    invoke-static {p2, v1}, Ll/᩹ۗ᩵;->֫(Ll/ۨܶ᩵;Ll/ܳ᩸᩵;)Ll/ᩴ۫᩵;

    move-result-object p2

    goto :goto_1

    :cond_1
    move-object p2, v3

    .line 256
    :goto_1
    :try_start_0
    iget-object p1, p1, Ll/ۧۛ᩵;->ۗ:Ll/ᩴ᩸᩵;

    invoke-virtual {p1, p0}, Ll/ۖ᩸᩵;->֫(Ljava/lang/Object;)V

    .line 257
    sget-object p0, Ll/۠۠᩵;->֫:Ll/۠۠᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p2, :cond_2

    .line 119
    invoke-static {v1, v0}, Ll/۬ۛ᩵;->֫(Ll/ܳ᩸᩵;Ljava/lang/Object;)V

    return-void

    .line 220
    :cond_2
    throw v3

    :catchall_0
    move-exception p0

    if-eqz p2, :cond_3

    throw v3

    .line 119
    :cond_3
    invoke-static {v1, v0}, Ll/۬ۛ᩵;->֫(Ll/ܳ᩸᩵;Ljava/lang/Object;)V

    throw p0

    .line 178
    :cond_4
    invoke-interface {p1, p0}, Ll/ۨܶ᩵;->֫(Ljava/lang/Object;)V

    return-void
.end method
