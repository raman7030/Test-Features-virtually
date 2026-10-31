.class public final Ll/ۛ۟ܳ;
.super Ljava/lang/Object;
.source "18AW"

# interfaces
.implements Ll/᩺ܺܳ;


# instance fields
.field public final synthetic ᩶:Ljava/util/HashMap;

.field public final synthetic ᩸:Ll/۟۟ܳ;

.field public final synthetic ᩹:[Ljava/io/IOException;


# direct methods
.method public constructor <init>(Ll/۟۟ܳ;Ljava/util/HashMap;[Ljava/io/IOException;)V
    .locals 0

    .line 439
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛ۟ܳ;->᩸:Ll/۟۟ܳ;

    iput-object p2, p0, Ll/ۛ۟ܳ;->᩶:Ljava/util/HashMap;

    iput-object p3, p0, Ll/ۛ۟ܳ;->᩹:[Ljava/io/IOException;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ᩳۜܳ;Ljava/io/InputStream;)V
    .locals 7

    .line 442
    iget-object v0, p0, Ll/ۛ۟ܳ;->᩶:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚ۬ܳ;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 443
    iget-object v1, p0, Ll/ۛ۟ܳ;->᩸:Ll/۟۟ܳ;

    if-nez p2, :cond_0

    .line 444
    invoke-static {v1}, Ll/۟۟ܳ;->ۧ(Ll/۟۟ܳ;)Ll/ܶ۬ܳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩷۫ܳ;->᩷()V

    return-void

    .line 448
    :cond_0
    :try_start_0
    invoke-static {v1, v0}, Ll/۟۟ܳ;->֫(Ll/۟۟ܳ;Ll/ۚ۬ܳ;)V

    .line 449
    invoke-static {v1, v0, p1}, Ll/۟۟ܳ;->֫(Ll/۟۟ܳ;Ll/ۚ۬ܳ;Ll/ᩳۜܳ;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 450
    invoke-static {v1}, Ll/۟۟ܳ;->֫(Ll/۟۟ܳ;)Ll/ۨ۟ܳ;

    move-result-object v2

    check-cast v2, Ll/ۤ᩺ܳ;

    .line 131
    iget-object v2, v2, Ll/ۤ᩺ܳ;->᩸:Ll/ۛ᩺ܳ;

    .line 301
    invoke-virtual {v2}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v2

    if-nez v2, :cond_1

    .line 451
    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v2

    invoke-static {v1, p2, v2, v3}, Ll/۟۟ܳ;->֫(Ll/۟۟ܳ;Ljava/io/InputStream;J)V

    .line 452
    invoke-static {v1}, Ll/۟۟ܳ;->֫(Ll/۟۟ܳ;)Ll/ۨ۟ܳ;

    move-result-object p1

    check-cast p1, Ll/ۤ᩺ܳ;

    .line 131
    iget-object p1, p1, Ll/ۤ᩺ܳ;->᩸:Ll/ۛ᩺ܳ;

    .line 301
    invoke-virtual {p1}, Ll/ۘ۠ۢ;->᩻()Z

    move-result p1

    if-nez p1, :cond_1

    .line 453
    invoke-static {v1}, Ll/۟۟ܳ;->ۧ(Ll/۟۟ܳ;)Ll/ܶ۬ܳ;

    move-result-object p1

    invoke-virtual {v0}, Ll/֨۬ܳ;->᩻()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ll/᩷۫ܳ;->֫(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 490
    :cond_1
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    return-void

    .line 458
    :cond_2
    :try_start_1
    invoke-virtual {v0}, Ll/֨۬ܳ;->ۡ()Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 459
    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v3

    new-instance p1, Ll/ۤ۟ܳ;

    invoke-direct {p1, p0}, Ll/ۤ۟ܳ;-><init>(Ll/ۛ۟ܳ;)V

    invoke-virtual {v2, p2, v3, v4, p1}, Ll/ܶ᩵ܿ;->֫(Ljava/io/InputStream;JLl/ۚ᩸ܿ;)V

    .line 471
    invoke-static {v1}, Ll/۟۟ܳ;->֫(Ll/۟۟ܳ;)Ll/ۨ۟ܳ;

    move-result-object p1

    check-cast p1, Ll/ۤ᩺ܳ;

    .line 131
    iget-object p1, p1, Ll/ۤ᩺ܳ;->᩸:Ll/ۛ᩺ܳ;

    .line 301
    invoke-virtual {p1}, Ll/ۘ۠ۢ;->᩻()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 472
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->۫()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 490
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    return-void

    .line 475
    :cond_3
    :try_start_2
    invoke-virtual {v0}, Ll/֨۬ܳ;->ܿ()Ll/ᩳ᩵ܿ;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 476
    new-instance p1, Ll/ܿ᩵ܿ;

    invoke-direct {p1}, Ll/ܿ᩵ܿ;-><init>()V

    .line 477
    invoke-virtual {v0}, Ll/֨۬ܳ;->ܿ()Ll/ᩳ᩵ܿ;

    move-result-object v3

    invoke-virtual {p1, v3}, Ll/ܿ᩵ܿ;->֫(Ll/ᩳ᩵ܿ;)V

    .line 478
    invoke-virtual {p1, v2}, Ll/ܿ᩵ܿ;->ᩳ(Ll/ܶ᩵ܿ;)V

    .line 480
    :cond_4
    invoke-static {v1}, Ll/۟۟ܳ;->ܽ(Ll/۟۟ܳ;)Ll/֡ۨܳ;

    move-result-object p1

    .line 481
    invoke-virtual {v0}, Ll/֨۬ܳ;->ܳ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v4

    .line 480
    invoke-virtual {p1, v3, v4}, Ll/֡ۨܳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 482
    invoke-static {v1}, Ll/۟۟ܳ;->ۧ(Ll/۟۟ܳ;)Ll/ܶ۬ܳ;

    move-result-object p1

    invoke-virtual {v0}, Ll/֨۬ܳ;->᩻()J

    move-result-wide v3

    invoke-virtual {p1, v3, v4}, Ll/᩷۫ܳ;->֫(J)V

    .line 483
    invoke-virtual {v0}, Ll/֨۬ܳ;->ܺ()Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x1

    .line 217
    invoke-static {p1, v3}, Ll/ܳۤܳ;->֫(Ljava/lang/String;Z)V

    .line 484
    invoke-virtual {v0}, Ll/֨۬ܳ;->ۢ()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 485
    invoke-static {v1}, Ll/۟۟ܳ;->ܿ(Ll/۟۟ܳ;)Ljava/util/HashSet;

    move-result-object p1

    invoke-virtual {v0}, Ll/֨۬ܳ;->ۢ()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 487
    :cond_5
    invoke-static {v1}, Ll/۟۟ܳ;->ܳ(Ll/۟۟ܳ;)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {v0}, Ll/֨۬ܳ;->ۖ()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long p1, v3, v5

    if-lez p1, :cond_6

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->֨ۧ()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 488
    invoke-static {v1}, Ll/۟۟ܳ;->ᩳ(Ll/۟۟ܳ;)Ll/ܰ۟ܳ;

    move-result-object p1

    invoke-virtual {v0}, Ll/֨۬ܳ;->ۖ()J

    move-result-wide v0

    invoke-virtual {p1, v2, v0, v1}, Ll/ܰ۟ܳ;->֫(Ll/ܶ᩵ܿ;J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 490
    :cond_6
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    return-void

    :catchall_0
    move-exception p1

    .line 447
    :try_start_3
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final ֫(Ljava/io/IOException;)Z
    .locals 2

    .line 495
    iget-object v0, p0, Ll/ۛ۟ܳ;->᩹:[Ljava/io/IOException;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    return v1
.end method

.method public final ᩻()Z
    .locals 1

    .line 501
    iget-object v0, p0, Ll/ۛ۟ܳ;->᩸:Ll/۟۟ܳ;

    invoke-static {v0}, Ll/۟۟ܳ;->֫(Ll/۟۟ܳ;)Ll/ۨ۟ܳ;

    move-result-object v0

    check-cast v0, Ll/ۤ᩺ܳ;

    invoke-virtual {v0}, Ll/ۤ᩺ܳ;->᩻()Z

    move-result v0

    return v0
.end method
