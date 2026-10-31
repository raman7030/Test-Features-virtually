.class public final Ll/ܽۛ᩵;
.super Ljava/lang/Object;
.source "5AY1"


# static fields
.field public static final ֫:Ll/ܶۛ᩵;

.field public static final ۧ:Ll/ܶۛ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 14
    new-instance v0, Ll/ܶۛ᩵;

    const-string v1, "UNDEFINED"

    invoke-direct {v0, v1}, Ll/ܶۛ᩵;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/ܽۛ᩵;->ۧ:Ll/ܶۛ᩵;

    .line 17
    new-instance v0, Ll/ܶۛ᩵;

    const-string v1, "REUSABLE_CLAIMED"

    invoke-direct {v0, v1}, Ll/ܶۛ᩵;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/ܽۛ᩵;->֫:Ll/ܶۛ᩵;

    return-void
.end method

.method public static final synthetic ֫()Ll/ܶۛ᩵;
    .locals 1

    .line 1
    sget-object v0, Ll/ܽۛ᩵;->ۧ:Ll/ܶۛ᩵;

    return-object v0
.end method

.method public static final ֫(Ljava/lang/Object;Ll/ۨܶ᩵;)V
    .locals 6

    .line 282
    instance-of v0, p1, Ll/ۧۛ᩵;

    if-eqz v0, :cond_8

    check-cast p1, Ll/ۧۛ᩵;

    iget-object v0, p1, Ll/ۧۛ᩵;->۫:Ll/ۗۗ᩵;

    iget-object v1, p1, Ll/ۧۛ᩵;->ۗ:Ll/ᩴ᩸᩵;

    .line 14
    invoke-static {p0}, Ll/ۘ۠᩵;->֫(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_0

    move-object v3, p0

    goto :goto_0

    .line 16
    :cond_0
    new-instance v3, Ll/ᩴۗ᩵;

    const/4 v4, 0x0

    .line 42
    invoke-direct {v3, v2, v4}, Ll/ᩴۗ᩵;-><init>(Ljava/lang/Throwable;Z)V

    .line 0
    :goto_0
    invoke-interface {v1}, Ll/ۨܶ᩵;->getContext()Ll/ܳ᩸᩵;

    .line 219
    invoke-virtual {v0}, Ll/ۗۗ᩵;->ۖ()Z

    move-result v2

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    .line 220
    iput-object v3, p1, Ll/ۧۛ᩵;->ۙ:Ljava/lang/Object;

    .line 221
    iput v4, p1, Ll/ۜ۬᩵;->᩶:I

    .line 0
    invoke-interface {v1}, Ll/ۨܶ᩵;->getContext()Ll/ܳ᩸᩵;

    move-result-object p0

    .line 222
    invoke-virtual {v0, p0, p1}, Ll/ۗۗ᩵;->֫(Ll/ܳ᩸᩵;Ljava/lang/Runnable;)V

    return-void

    .line 302
    :cond_1
    invoke-static {}, Ll/ۖ۫᩵;->֫()Ll/ۖ۬᩵;

    move-result-object v0

    .line 305
    invoke-virtual {v0}, Ll/ۖ۬᩵;->᩵()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 307
    iput-object v3, p1, Ll/ۧۛ᩵;->ۙ:Ljava/lang/Object;

    .line 308
    iput v4, p1, Ll/ۜ۬᩵;->᩶:I

    .line 309
    invoke-virtual {v0, p1}, Ll/ۖ۬᩵;->֫(Ll/ۜ۬᩵;)V

    goto :goto_4

    .line 199
    :cond_2
    invoke-virtual {v0, v4}, Ll/ۖ۬᩵;->֫(Z)V

    const/4 v2, 0x0

    .line 0
    :try_start_0
    invoke-interface {v1}, Ll/ۨܶ᩵;->getContext()Ll/ܳ᩸᩵;

    move-result-object v4

    .line 243
    sget-object v5, Ll/ۤ۬᩵;->֨:Ll/۫۬᩵;

    invoke-interface {v4, v5}, Ll/ܳ᩸᩵;->֫(Ll/ܿ᩸᩵;)Ll/ᩳ᩸᩵;

    move-result-object v4

    check-cast v4, Ll/ۤ۬᩵;

    if-eqz v4, :cond_3

    .line 244
    invoke-interface {v4}, Ll/ۤ۬᩵;->ܽ()Z

    move-result v5

    if-nez v5, :cond_3

    .line 245
    invoke-interface {v4}, Ll/ۤ۬᩵;->ᩳ()Ljava/util/concurrent/CancellationException;

    move-result-object p0

    .line 246
    invoke-virtual {p1, v3, p0}, Ll/ۧۛ᩵;->֫(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V

    .line 247
    invoke-static {p0}, Ll/ᩴ۠᩵;->֫(Ljava/lang/Throwable;)Ll/ۖ۠᩵;

    move-result-object p0

    invoke-virtual {p1, p0}, Ll/ۧۛ᩵;->֫(Ljava/lang/Object;)V

    goto :goto_2

    .line 255
    :cond_3
    iget-object v3, p1, Ll/ۧۛ᩵;->۬:Ljava/lang/Object;

    .line 107
    invoke-interface {v1}, Ll/ۨܶ᩵;->getContext()Ll/ܳ᩸᩵;

    move-result-object v4

    .line 108
    invoke-static {v4, v3}, Ll/۬ۛ᩵;->ۧ(Ll/ܳ᩸᩵;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 109
    sget-object v5, Ll/۬ۛ᩵;->֫:Ll/ܶۛ᩵;

    if-eq v3, v5, :cond_4

    .line 111
    invoke-static {v1, v4}, Ll/᩹ۗ᩵;->֫(Ll/ۨܶ᩵;Ll/ܳ᩸᩵;)Ll/ᩴ۫᩵;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_1

    :cond_4
    move-object v5, v2

    .line 256
    :goto_1
    :try_start_1
    invoke-virtual {v1, p0}, Ll/ۖ᩸᩵;->֫(Ljava/lang/Object;)V

    .line 257
    sget-object p0, Ll/۠۠᩵;->֫:Ll/۠۠᩵;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v5, :cond_6

    .line 119
    :try_start_2
    invoke-static {v4, v3}, Ll/۬ۛ᩵;->֫(Ll/ܳ᩸᩵;Ljava/lang/Object;)V

    .line 204
    :cond_5
    :goto_2
    invoke-virtual {v0}, Ll/ۖ۬᩵;->᩹()Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_3

    .line 220
    :cond_6
    throw v2

    :catchall_0
    move-exception p0

    if-eqz v5, :cond_7

    throw v2

    .line 119
    :cond_7
    invoke-static {v4, v3}, Ll/۬ۛ᩵;->֫(Ll/ܳ᩸᩵;Ljava/lang/Object;)V

    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p0

    .line 211
    :try_start_3
    invoke-virtual {p1, p0, v2}, Ll/ۜ۬᩵;->֫(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 213
    :goto_3
    invoke-virtual {v0}, Ll/ۖ۬᩵;->ۘ()V

    :goto_4
    return-void

    :catchall_2
    move-exception p0

    invoke-virtual {v0}, Ll/ۖ۬᩵;->ۘ()V

    throw p0

    .line 283
    :cond_8
    invoke-interface {p1, p0}, Ll/ۨܶ᩵;->֫(Ljava/lang/Object;)V

    return-void
.end method
