.class public Ll/ۖ֨᩵;
.super Ljava/lang/Object;
.source "1A1B"


# static fields
.field public static final synthetic ۜ:I

.field public static final ۢ:Ll/֫᩻֨;

.field public static final ᩷:Ljava/util/Random;


# instance fields
.field public final ֫:Ll/ᩴۡ᩵;

.field public final ۧ:Ll/ۖ֨᩵;

.field public volatile ܳ:Z

.field public volatile ܽ:Z

.field public ܿ:Ll/᩵֨᩵;

.field public ᩳ:Ll/ۢ֨᩵;

.field public final ᩻:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 62
    const-class v0, Ll/ۖ֨᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ۖ֨᩵;->ۢ:Ll/֫᩻֨;

    .line 75
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sput-object v0, Ll/ۖ֨᩵;->᩷:Ljava/util/Random;

    return-void
.end method

.method public constructor <init>(Ll/ۖ֨᩵;)V
    .locals 1

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Ll/ۖ֨᩵;->᩻:Ljava/util/concurrent/atomic/AtomicLong;

    .line 85
    iget-object v0, p1, Ll/ۖ֨᩵;->֫:Ll/ᩴۡ᩵;

    iput-object v0, p0, Ll/ۖ֨᩵;->֫:Ll/ᩴۡ᩵;

    .line 86
    iput-object p1, p0, Ll/ۖ֨᩵;->ۧ:Ll/ۖ֨᩵;

    return-void
.end method

.method public constructor <init>(Ll/ᩴۡ᩵;)V
    .locals 1

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Ll/ۖ֨᩵;->᩻:Ljava/util/concurrent/atomic/AtomicLong;

    .line 79
    iput-object p1, p0, Ll/ۖ֨᩵;->֫:Ll/ᩴۡ᩵;

    const/4 p1, 0x0

    .line 80
    iput-object p1, p0, Ll/ۖ֨᩵;->ۧ:Ll/ۖ֨᩵;

    return-void
.end method

.method private ֫(Ll/ᩳ֨᩵;Ll/۟ܺ᩵;Ll/֫ۖ᩵;Ljava/util/EnumSet;)Ll/֫ۖ᩵;
    .locals 4

    const/16 v0, 0xa

    :goto_0
    if-lez v0, :cond_3

    .line 386
    instance-of v1, p2, Ll/ܽۖ᩵;

    if-eqz v1, :cond_0

    .line 387
    move-object v1, p2

    check-cast v1, Ll/ܽۖ᩵;

    invoke-virtual {p0, p1, v1}, Ll/ۖ֨᩵;->֫(Ll/ᩳ֨᩵;Ll/ܽۖ᩵;)Ll/ۛۡ᩵;

    .line 389
    :cond_0
    :try_start_0
    invoke-direct {p0}, Ll/ۖ֨᩵;->᩷()Ll/᩵֨᩵;

    move-result-object v1
    :try_end_0
    .catch Ll/۟֡᩵; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_1

    .line 394
    :try_start_1
    invoke-virtual {v1, p2, p3, p4}, Ll/᩵֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;Ljava/util/Set;)Ll/֫ۖ᩵;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 190
    :try_start_2
    invoke-virtual {v1}, Ll/᩵֨᩵;->֡()V
    :try_end_2
    .catch Ll/۟֡᩵; {:try_start_2 .. :try_end_2} :catch_0

    return-object v2

    .line 391
    :cond_1
    :try_start_3
    new-instance v2, Ll/᩵ۡ᩵;

    const-string v3, "Failed to get tree connection"

    .line 58
    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 391
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception v2

    if-eqz v1, :cond_2

    .line 190
    :try_start_4
    invoke-virtual {v1}, Ll/᩵֨᩵;->֡()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    .line 389
    :try_start_5
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    throw v2
    :try_end_5
    .catch Ll/۟֡᩵; {:try_start_5 .. :try_end_5} :catch_0

    :catch_0
    move-exception v1

    .line 396
    invoke-virtual {v1}, Ll/۟֡᩵;->ۧ()Ll/ܺۖ᩵;

    move-result-object v2

    check-cast v2, Ll/ۡۖ᩵;

    invoke-virtual {v2}, Ll/ۡۖ᩵;->ۧ()Ll/ۡۖ᩵;

    .line 399
    invoke-interface {p2}, Ll/ܰܺ᩵;->reset()V

    .line 400
    sget-object v2, Ll/ۖ֨᩵;->ۢ:Ll/֫᩻֨;

    const-string v3, "send0"

    invoke-interface {v2, v3, v1}, Ll/֫᩻֨;->ܽ(Ljava/lang/String;Ljava/lang/Exception;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 404
    :cond_3
    new-instance p1, Ll/᩵ۡ᩵;

    const-string p2, "Loop in DFS referrals"

    .line 58
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 404
    throw p1
.end method

.method private ֫(Ll/ᩳ֨᩵;Ljava/lang/String;Ljava/lang/String;Ll/ۢ֨᩵;Ll/᩵֨᩵;Ll/ܺۖ᩵;)Ll/᩵֨᩵;
    .locals 5

    const-string v0, "doConnect: "

    .line 585
    sget-object v1, Ll/ۖ֨᩵;->ۢ:Ll/֫᩻֨;

    invoke-interface {v1}, Ll/֫᩻֨;->֫()Z

    move-result v2

    iget-object v3, p0, Ll/ۖ֨᩵;->֫:Ll/ᩴۡ᩵;

    if-eqz v2, :cond_0

    move-object v2, p4

    check-cast v2, Ll/᩷֨᩵;

    invoke-virtual {v2}, Ll/᩷֨᩵;->᩺()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Ll/ᩳ֨᩵;->ܺ()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v3}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 586
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Signatures for file enabled but not required "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_0
    if-eqz p6, :cond_1

    .line 590
    invoke-virtual {p5}, Ll/᩵֨᩵;->᩵()V

    :cond_1
    const/4 v2, 0x0

    .line 594
    :try_start_0
    invoke-interface {v1}, Ll/֫᩻֨;->ܽ()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 595
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v1, p2}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 597
    :cond_2
    invoke-virtual {p5, v2, v2}, Ll/᩵֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;)Ll/֫ۖ᩵;

    .line 136
    invoke-virtual {p5}, Ll/᩵֨᩵;->֫()V
    :try_end_0
    .catch Ll/᩹ۚ᩵; {:try_start_0 .. :try_end_0} :catch_0

    return-object p5

    :catch_0
    move-exception p2

    const-string v0, "Authentication failed"

    .line 600
    invoke-interface {v1, v0, p2}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 608
    invoke-virtual {p5}, Ll/᩵֨᩵;->ܽ()Ll/᩻֨᩵;

    move-result-object p5

    .line 609
    :try_start_1
    invoke-virtual {p5}, Ll/᩻֨᩵;->ᩳ()Ll/ۛ֡᩵;

    move-result-object v0

    invoke-interface {v0}, Ll/ۛ֡᩵;->ܰ֫()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p5}, Ll/᩻֨᩵;->ᩳ()Ll/ۛ֡᩵;

    move-result-object v0

    invoke-interface {v0}, Ll/ۛ֡᩵;->ۗۧ()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_2

    .line 622
    :cond_3
    invoke-virtual {p1}, Ll/ᩳ֨᩵;->ۢ()Ljava/net/URL;

    move-result-object p1

    invoke-virtual {p1}, Ljava/net/URL;->toString()Ljava/lang/String;

    invoke-interface {v3}, Ll/ᩴۡ᩵;->᩻()Z

    move-result p1

    if-eqz p1, :cond_5

    const-string p1, "Trying to renew credentials after auth error"

    .line 623
    invoke-interface {v1, p1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 624
    invoke-virtual {p5}, Ll/᩻֨᩵;->ۖ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p5}, Ll/᩻֨᩵;->ۜ()Ljava/lang/String;

    move-result-object p2

    check-cast p4, Ll/᩷֨᩵;

    .line 106
    invoke-virtual {p4, v3, p1, p2}, Ll/᩷֨᩵;->֫(Ll/ᩴۡ᩵;Ljava/lang/String;Ljava/lang/String;)Ll/᩻֨᩵;

    move-result-object p1

    .line 625
    invoke-virtual {p1}, Ll/᩻֨᩵;->ۧ()Ll/ۜ֨᩵;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_8

    .line 75
    :try_start_2
    invoke-virtual {p1, p3}, Ll/᩻֨᩵;->֫(Ljava/lang/String;)Ll/᩵֨᩵;

    move-result-object p2

    .line 626
    invoke-virtual {p2}, Ll/᩵֨᩵;->ۧ()Ll/᩺ۡ᩵;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz p6, :cond_4

    .line 628
    :try_start_3
    invoke-virtual {p2}, Ll/᩵֨᩵;->᩵()V

    .line 630
    :cond_4
    invoke-virtual {p2, v2, v2}, Ll/᩵֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;)Ll/֫ۖ᩵;

    .line 136
    invoke-virtual {p2}, Ll/᩵֨᩵;->֫()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 190
    :try_start_4
    invoke-virtual {p2}, Ll/᩵֨᩵;->֡()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 213
    :try_start_5
    invoke-virtual {p1}, Ll/᩻֨᩵;->᩸()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_8

    invoke-virtual {p5}, Ll/᩻֨᩵;->᩸()V

    goto :goto_3

    :catchall_0
    move-exception p3

    .line 190
    :try_start_6
    invoke-virtual {p2}, Ll/᩵֨᩵;->֡()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    .line 624
    :try_start_7
    invoke-virtual {p3, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catchall_2
    move-exception p2

    .line 213
    :try_start_8
    invoke-virtual {p1}, Ll/᩻֨᩵;->᩸()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception p1

    .line 624
    :try_start_9
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p2

    .line 634
    :cond_5
    throw p2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 612
    :cond_6
    :goto_2
    :try_start_a
    invoke-interface {v3}, Ll/ᩴۡ᩵;->ۧ()Ll/ᩴۡ᩵;

    move-result-object p1

    invoke-virtual {p5}, Ll/᩻֨᩵;->ۖ()Ljava/lang/String;

    move-result-object p6

    invoke-virtual {p5}, Ll/᩻֨᩵;->ۜ()Ljava/lang/String;

    move-result-object v0

    check-cast p4, Ll/᩷֨᩵;

    .line 106
    invoke-virtual {p4, p1, p6, v0}, Ll/᩷֨᩵;->֫(Ll/ᩴۡ᩵;Ljava/lang/String;Ljava/lang/String;)Ll/᩻֨᩵;

    move-result-object p1

    .line 613
    invoke-virtual {p1}, Ll/᩻֨᩵;->ۧ()Ll/ۜ֨᩵;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 75
    :try_start_b
    invoke-virtual {p1, p3}, Ll/᩻֨᩵;->֫(Ljava/lang/String;)Ll/᩵֨᩵;

    move-result-object p3

    .line 614
    invoke-virtual {p3}, Ll/᩵֨᩵;->ۧ()Ll/᩺ۡ᩵;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 615
    :try_start_c
    invoke-virtual {p3, v2, v2}, Ll/᩵֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;)Ll/֫ۖ᩵;

    const-string p4, "Anonymous retry succeeded"

    .line 616
    invoke-interface {v1, p4}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 136
    invoke-virtual {p3}, Ll/᩵֨᩵;->֫()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 190
    :try_start_d
    invoke-virtual {p3}, Ll/᩵֨᩵;->֡()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 213
    :try_start_e
    invoke-virtual {p1}, Ll/᩻֨᩵;->᩸()V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_1
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    invoke-virtual {p5}, Ll/᩻֨᩵;->᩸()V

    move-object p2, p3

    :goto_3
    return-object p2

    :catchall_4
    move-exception p4

    .line 190
    :try_start_f
    invoke-virtual {p3}, Ll/᩵֨᩵;->֡()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    goto :goto_4

    :catchall_5
    move-exception p3

    .line 611
    :try_start_10
    invoke-virtual {p4, p3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p4
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    :catchall_6
    move-exception p3

    .line 213
    :try_start_11
    invoke-virtual {p1}, Ll/᩻֨᩵;->᩸()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    goto :goto_5

    :catchall_7
    move-exception p1

    .line 611
    :try_start_12
    invoke-virtual {p3, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw p3
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_1
    .catchall {:try_start_12 .. :try_end_12} :catchall_8

    :catch_1
    move-exception p1

    :try_start_13
    const-string p3, "Retry also failed"

    .line 619
    invoke-interface {v1, p3, p1}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 620
    throw p2
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_8

    :catchall_8
    move-exception p1

    .line 213
    :try_start_14
    invoke-virtual {p5}, Ll/᩻֨᩵;->᩸()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_9

    goto :goto_6

    :catchall_9
    move-exception p2

    .line 608
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw p1
.end method

.method private declared-synchronized ֫(Ll/᩵֨᩵;)V
    .locals 6

    const-string v1, "Acquired tree on switch "

    move-object v0, p0

    .line 3
    monitor-enter v0

    .line 145
    :try_start_0
    invoke-direct {p0}, Ll/ۖ֨᩵;->᩷()Ll/᩵֨᩵;

    move-result-object v2

    if-ne v2, p1, :cond_1

    if-eqz v2, :cond_0

    .line 190
    invoke-virtual {v2}, Ll/᩵֨᩵;->֡()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 147
    :cond_0
    monitor-exit v0

    return-void

    .line 149
    :cond_1
    :try_start_1
    iget-boolean v3, p0, Ll/ۖ֨᩵;->ܳ:Z

    .line 150
    sget-object v4, Ll/ۖ֨᩵;->ۢ:Ll/֫᩻֨;

    const-string v5, "Switching tree"

    invoke-interface {v4, v5}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 152
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 136
    invoke-virtual {p1}, Ll/᩵֨᩵;->֫()V

    const/4 v1, 0x1

    .line 154
    iput-boolean v1, p0, Ll/ۖ֨᩵;->ܳ:Z

    .line 159
    iput-object p1, p0, Ll/ۖ֨᩵;->ܿ:Ll/᩵֨᩵;

    if-eqz v2, :cond_2

    if-eqz v3, :cond_2

    .line 163
    invoke-virtual {v2}, Ll/᩵֨᩵;->֡()V

    .line 166
    :cond_2
    iget-object p1, p0, Ll/ۖ֨᩵;->ۧ:Ll/ۖ֨᩵;

    if-eqz p1, :cond_3

    iget-boolean p1, p0, Ll/ۖ֨᩵;->ܽ:Z

    if-eqz p1, :cond_3

    const-string p1, "Releasing delegate"

    .line 167
    invoke-interface {v4, p1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 168
    iput-boolean p1, p0, Ll/ۖ֨᩵;->ܽ:Z

    .line 169
    iget-object p1, p0, Ll/ۖ֨᩵;->ۧ:Ll/ۖ֨᩵;

    invoke-virtual {p1}, Ll/ۖ֨᩵;->ۜ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    if-eqz v2, :cond_4

    .line 190
    :try_start_2
    invoke-virtual {v2}, Ll/᩵֨᩵;->֡()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 172
    :cond_4
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    if-eqz v2, :cond_5

    .line 190
    :try_start_3
    invoke-virtual {v2}, Ll/᩵֨᩵;->֡()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    .line 145
    :try_start_4
    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_0
    throw p1

    :catchall_2
    move-exception p1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p1
.end method

.method private declared-synchronized ۢ()Ll/᩵֨᩵;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 130
    :try_start_0
    iget-object v1, p0, Ll/ۖ֨᩵;->ܿ:Ll/᩵֨᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 132
    monitor-exit v0

    return-object v1

    .line 134
    :cond_0
    :try_start_1
    iget-object v1, p0, Ll/ۖ֨᩵;->ۧ:Ll/ۖ֨᩵;

    if-eqz v1, :cond_1

    .line 135
    invoke-direct {v1}, Ll/ۖ֨᩵;->ۢ()Ll/᩵֨᩵;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object v1

    .line 137
    :cond_1
    monitor-exit v0

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public static ۧ(Ll/ۖ֨᩵;)Ll/ۖ֨᩵;
    .locals 1

    .line 99
    iget-object v0, p0, Ll/ۖ֨᩵;->֫:Ll/ᩴۡ᩵;

    invoke-interface {v0}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    new-instance v0, Ll/ۖ֨᩵;

    invoke-direct {v0, p0}, Ll/ۖ֨᩵;-><init>(Ll/ۖ֨᩵;)V

    return-object v0
.end method

.method private ۧ(Ll/ᩳ֨᩵;Ll/ܽۖ᩵;)Ll/ۛۡ᩵;
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    .line 681
    iget-object v3, v1, Ll/ۖ֨᩵;->֫:Ll/ᩴۡ᩵;

    const-string v4, "No referral but in domain DFS "

    const-string v5, "No referral available for  "

    const-string v6, "Resolved "

    const-string v7, "\\"

    invoke-virtual/range {p0 .. p1}, Ll/ۖ֨᩵;->ۧ(Ll/ᩳ֨᩵;)Ll/ۘ֨᩵;

    move-result-object v8

    .line 682
    :try_start_0
    invoke-virtual {v8}, Ll/ۘ֨᩵;->ᩴ()Ll/᩻֨᩵;

    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    .line 683
    :try_start_1
    invoke-virtual {v9}, Ll/᩻֨᩵;->ۘ()Ll/᩷֨᩵;

    move-result-object v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    .line 684
    :try_start_2
    invoke-direct/range {p0 .. p0}, Ll/ۖ֨᩵;->᩷()Ll/᩵֨᩵;

    move-result-object v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 685
    :try_start_3
    invoke-virtual {v10}, Ll/᩷֨᩵;->ᩴ()Z

    if-eqz v0, :cond_0

    .line 687
    invoke-interface/range {p2 .. p2}, Ll/ܽۖ᩵;->getPath()Ljava/lang/String;

    move-result-object v12

    goto :goto_0

    :cond_0
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨᩵;->᩷()Ljava/lang/String;

    move-result-object v12

    :goto_0
    if-eqz v0, :cond_1

    .line 688
    invoke-interface/range {p2 .. p2}, Ll/ܽۖ᩵;->᩵()Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    :cond_1
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨᩵;->ᩳ()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v7, 0x5c

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨᩵;->ܳ()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨᩵;->᩷()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 689
    :goto_1
    invoke-virtual {v11}, Ll/᩵֨᩵;->ۘ()Z

    move-result v13
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    const-string v14, "Not in DFS"

    sget-object v15, Ll/ۖ֨᩵;->ۢ:Ll/֫᩻֨;

    if-nez v13, :cond_2

    :try_start_4
    invoke-virtual {v11}, Ll/᩵֨᩵;->ᩴ()Z

    move-result v13

    if-nez v13, :cond_6

    .line 690
    :cond_2
    invoke-virtual {v11}, Ll/᩵֨᩵;->ۘ()Z

    move-result v13

    if-eqz v13, :cond_10

    .line 692
    invoke-virtual {v11}, Ll/᩵֨᩵;->᩻()Ll/ܺۖ᩵;

    move-result-object v13

    if-eqz v13, :cond_5

    .line 694
    invoke-interface {v15}, Ll/֫᩻֨;->֫()Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v3, "Need to adjust request path %s (full: %s) -> %s"

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v12, v4, v5

    const/4 v5, 0x1

    aput-object v7, v4, v5

    const/4 v5, 0x2

    aput-object v13, v4, v5

    .line 695
    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v15, v3}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 697
    :cond_3
    invoke-virtual {v2, v13, v12}, Ll/ᩳ֨᩵;->֫(Ll/ܺۖ᩵;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v0, :cond_4

    .line 699
    invoke-interface {v0, v3}, Ll/ܽۖ᩵;->֫(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 190
    :cond_4
    :try_start_5
    invoke-virtual {v11}, Ll/᩵֨᩵;->֡()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 122
    :try_start_6
    invoke-virtual {v10}, Ll/۟֨᩵;->ۘ()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 213
    :try_start_7
    invoke-virtual {v9}, Ll/᩻֨᩵;->᩸()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_8

    .line 760
    invoke-virtual {v8}, Ll/ۘ֨᩵;->close()V

    return-object v2

    :cond_5
    :try_start_8
    const-string v13, "No tree referral but in DFS"

    .line 705
    invoke-interface {v15, v13}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_6
    if-eqz v0, :cond_7

    .line 713
    invoke-virtual {v9}, Ll/᩻֨᩵;->ۜ()Ljava/lang/String;

    move-result-object v13

    move-object/from16 v16, v14

    invoke-virtual {v9}, Ll/᩻֨᩵;->ۖ()Ljava/lang/String;

    move-result-object v14

    invoke-interface {v0, v13, v14, v7}, Ll/ܽۖ᩵;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_7
    move-object/from16 v16, v14

    .line 717
    :goto_2
    invoke-interface {v3}, Ll/ᩴۡ᩵;->ᩳ()Ll/ܶۡ᩵;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨᩵;->ᩳ()Ljava/lang/String;

    move-result-object v14

    move-object/from16 v17, v4

    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨᩵;->ܳ()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v18, v5

    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨᩵;->᩷()Ljava/lang/String;

    move-result-object v5

    check-cast v13, Ll/ܰ֡᩵;

    invoke-virtual {v13, v3, v14, v4, v5}, Ll/ܰ֡᩵;->֫(Ll/ᩴۡ᩵;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ܺۖ᩵;

    move-result-object v3

    if-eqz v3, :cond_d

    .line 719
    invoke-interface {v15}, Ll/֫᩻֨;->֫()Z

    move-result v4

    if-eqz v4, :cond_8

    .line 720
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " -> "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v15, v4}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 723
    :cond_8
    invoke-virtual {v2, v3, v12}, Ll/ᩳ֨᩵;->֫(Ll/ܺۖ᩵;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v0, :cond_9

    .line 725
    invoke-interface {v0, v4}, Ll/ܽۖ᩵;->֫(Ljava/lang/String;)V

    .line 728
    :cond_9
    invoke-virtual {v11}, Ll/᩵֨᩵;->ᩳ()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3}, Ll/ܺۖ᩵;->ܳ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    move-object v4, v3

    .line 733
    :goto_3
    invoke-interface {v15}, Ll/֫᩻֨;->֫()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 734
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Need to switch tree for "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v15, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 736
    :cond_a
    :try_start_9
    invoke-virtual {v9}, Ll/᩻֨᩵;->ۖ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0, v4}, Ll/ۖ֨᩵;->֫(Ll/ᩳ֨᩵;Ljava/lang/String;Ll/ܺۖ᩵;)Ll/ۘ֨᩵;

    move-result-object v5
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :try_start_a
    const-string v0, "Switched tree"

    .line 737
    invoke-interface {v15, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 739
    :try_start_b
    invoke-virtual {v5}, Ll/ۘ֨᩵;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_0
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 190
    :try_start_c
    invoke-virtual {v11}, Ll/᩵֨᩵;->֡()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 122
    :try_start_d
    invoke-virtual {v10}, Ll/۟֨᩵;->ۘ()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 213
    :try_start_e
    invoke-virtual {v9}, Ll/᩻֨᩵;->᩸()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 760
    invoke-virtual {v8}, Ll/ۘ֨᩵;->close()V

    return-object v2

    :catchall_0
    move-exception v0

    move-object v6, v0

    .line 736
    :try_start_f
    invoke-virtual {v5}, Ll/ۘ֨᩵;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v5, v0

    :try_start_10
    invoke-virtual {v6, v5}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v6
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_0
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    :catch_0
    move-exception v0

    :try_start_11
    const-string v5, "Failed to connect tree"

    .line 740
    invoke-interface {v15, v5, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 743
    invoke-interface {v4}, Ll/ܺۖ᩵;->next()Ll/ۡۖ᩵;

    move-result-object v4

    if-eq v4, v3, :cond_b

    goto :goto_3

    .line 746
    :cond_b
    new-instance v2, Ll/᩵ۡ᩵;

    const-string v3, "All referral tree connections failed"

    .line 50
    invoke-direct {v2, v3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 746
    throw v2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    .line 190
    :cond_c
    :try_start_12
    invoke-virtual {v11}, Ll/᩵֨᩵;->֡()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_4

    .line 122
    :try_start_13
    invoke-virtual {v10}, Ll/۟֨᩵;->ۘ()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_6

    .line 213
    :try_start_14
    invoke-virtual {v9}, Ll/᩻֨᩵;->᩸()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_8

    .line 760
    invoke-virtual {v8}, Ll/ۘ֨᩵;->close()V

    return-object v2

    .line 750
    :cond_d
    :try_start_15
    invoke-virtual {v11}, Ll/᩵֨᩵;->ۘ()Z

    move-result v3

    if-eqz v3, :cond_f

    instance-of v3, v0, Ll/֫ۘ᩵;

    if-nez v3, :cond_f

    instance-of v0, v0, Ll/ܿۘ᩵;

    if-nez v0, :cond_f

    .line 752
    invoke-interface {v15}, Ll/֫᩻֨;->֫()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 753
    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v2, v18

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v15, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 755
    :cond_e
    new-instance v0, Ll/᩵ۡ᩵;

    new-instance v2, Ljava/lang/StringBuilder;

    move-object/from16 v3, v17

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 58
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 755
    throw v0

    :cond_f
    move-object/from16 v0, v16

    .line 757
    invoke-interface {v15, v0}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_2

    .line 190
    :try_start_16
    invoke-virtual {v11}, Ll/᩵֨᩵;->֡()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_4

    .line 122
    :try_start_17
    invoke-virtual {v10}, Ll/۟֨᩵;->ۘ()V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_6

    .line 213
    :try_start_18
    invoke-virtual {v9}, Ll/᩻֨᩵;->᩸()V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_8

    .line 760
    invoke-virtual {v8}, Ll/ۘ֨᩵;->close()V

    return-object v2

    :catchall_2
    move-exception v0

    goto :goto_5

    :cond_10
    move-object v0, v14

    .line 707
    :try_start_19
    invoke-interface {v15, v0}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_2

    .line 190
    :try_start_1a
    invoke-virtual {v11}, Ll/᩵֨᩵;->֡()V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_4

    .line 122
    :try_start_1b
    invoke-virtual {v10}, Ll/۟֨᩵;->ۘ()V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_6

    .line 213
    :try_start_1c
    invoke-virtual {v9}, Ll/᩻֨᩵;->᩸()V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_8

    .line 760
    invoke-virtual {v8}, Ll/ۘ֨᩵;->close()V

    return-object v2

    :goto_5
    move-object v2, v0

    if-eqz v11, :cond_11

    .line 190
    :try_start_1d
    invoke-virtual {v11}, Ll/᩵֨᩵;->֡()V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_3

    goto :goto_6

    :catchall_3
    move-exception v0

    move-object v3, v0

    .line 681
    :try_start_1e
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_11
    :goto_6
    throw v2
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_4

    :catchall_4
    move-exception v0

    move-object v2, v0

    .line 122
    :try_start_1f
    invoke-virtual {v10}, Ll/۟֨᩵;->ۘ()V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_5

    goto :goto_7

    :catchall_5
    move-exception v0

    move-object v3, v0

    .line 681
    :try_start_20
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_7
    throw v2
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_6

    :catchall_6
    move-exception v0

    move-object v2, v0

    if-eqz v9, :cond_12

    .line 213
    :try_start_21
    invoke-virtual {v9}, Ll/᩻֨᩵;->᩸()V
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_7

    goto :goto_8

    :catchall_7
    move-exception v0

    move-object v3, v0

    .line 681
    :try_start_22
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_12
    :goto_8
    throw v2
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_8

    :catchall_8
    move-exception v0

    move-object v2, v0

    :try_start_23
    invoke-virtual {v8}, Ll/ۘ֨᩵;->close()V
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_9

    goto :goto_9

    :catchall_9
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_9
    throw v2
.end method

.method private declared-synchronized ᩷()Ll/᩵֨᩵;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 115
    :try_start_0
    iget-object v1, p0, Ll/ۖ֨᩵;->ܿ:Ll/᩵֨᩵;

    if-eqz v1, :cond_0

    .line 117
    invoke-virtual {v1}, Ll/᩵֨᩵;->֫()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    .line 118
    :cond_0
    :try_start_1
    iget-object v2, p0, Ll/ۖ֨᩵;->ۧ:Ll/ۖ֨᩵;

    if-eqz v2, :cond_1

    .line 119
    invoke-direct {v2}, Ll/ۖ֨᩵;->᩷()Ll/᩵֨᩵;

    move-result-object v1

    iput-object v1, p0, Ll/ۖ֨᩵;->ܿ:Ll/᩵֨᩵;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 120
    monitor-exit v0

    return-object v1

    .line 122
    :cond_1
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method


# virtual methods
.method public final varargs ֫(Ll/ᩳ֨᩵;Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v0, p4

    .line 291
    array-length v4, v0

    if-nez v4, :cond_0

    const-class v0, Ll/֡ۚ᩵;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static/range {p4 .. p4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    move-result-object v0

    :goto_0
    move-object v4, v0

    const-string v5, "send"

    .line 298
    instance-of v0, v2, Ll/ܽۖ᩵;

    const/4 v6, 0x0

    if-eqz v0, :cond_1

    move-object v0, v2

    check-cast v0, Ll/ܽۖ᩵;

    move-object v7, v0

    goto :goto_1

    :cond_1
    move-object v7, v6

    :goto_1
    if-eqz v7, :cond_2

    .line 299
    invoke-interface {v7}, Ll/ܽۖ᩵;->getPath()Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    goto :goto_2

    :cond_2
    move-object v8, v6

    :goto_2
    if-eqz v7, :cond_3

    .line 300
    invoke-interface {v7}, Ll/ܽۖ᩵;->᩵()Ljava/lang/String;

    move-result-object v0

    move-object v9, v0

    goto :goto_3

    :cond_3
    move-object v9, v6

    .line 302
    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v10, "\\"

    invoke-direct {v0, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨᩵;->ᩳ()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨᩵;->ܳ()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨᩵;->᩷()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 303
    iget-object v0, v1, Ll/ۖ֨᩵;->֫:Ll/ᩴۡ᩵;

    invoke-interface {v0}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    check-cast v0, Ll/ܰۡ᩵;

    invoke-virtual {v0}, Ll/ܰۡ᩵;->ᩴ()I

    move-result v11

    const/4 v0, 0x1

    move-object v0, v6

    move-object v12, v0

    const/4 v6, 0x1

    .line 304
    :goto_4
    sget-object v13, Ll/ۖ֨᩵;->ۢ:Ll/֫᩻֨;

    if-gt v6, v11, :cond_d

    if-eqz v7, :cond_4

    .line 307
    invoke-interface {v7, v0, v0, v10}, Ll/ܽۖ᩵;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    move-object/from16 v12, p1

    .line 311
    :try_start_0
    invoke-direct {v1, v12, v2, v3, v4}, Ll/ۖ֨᩵;->֫(Ll/ᩳ֨᩵;Ll/۟ܺ᩵;Ll/֫ۖ᩵;Ljava/util/EnumSet;)Ll/֫ۖ᩵;

    move-result-object v0
    :try_end_0
    .catch Ll/ۗۚ᩵; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/᩵ۡ᩵; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    move-object v14, v0

    .line 323
    invoke-interface {v13, v5, v14}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    const/4 v0, 0x1

    goto :goto_5

    :catch_1
    move-exception v0

    move-object v14, v0

    .line 315
    sget-object v0, Ll/֡ۚ᩵;->᩶:Ll/֡ۚ᩵;

    invoke-interface {v4, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 316
    invoke-virtual {v14}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Ll/֫۠᩵;

    if-nez v0, :cond_5

    invoke-virtual {v14}, Ll/ۗۚ᩵;->֫()I

    move-result v0

    const v15, -0x3ffffff3    # -2.000003f

    if-ne v0, v15, :cond_c

    :cond_5
    const/4 v0, 0x1

    .line 320
    invoke-interface {v13, v5, v14}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 329
    :goto_5
    invoke-interface {v13}, Ll/֫᩻֨;->֫()Z

    move-result v15

    if-eqz v15, :cond_6

    .line 330
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/16 v17, 0x0

    aput-object v15, v1, v17

    aput-object v16, v1, v0

    const/4 v0, 0x2

    aput-object v2, v1, v0

    const-string v0, "Retrying (%d/%d) request %s"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v13, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_6
    const-string v0, "Disconnecting tree on send retry"

    .line 335
    invoke-interface {v13, v0, v14}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 336
    invoke-virtual/range {p0 .. p0}, Ll/ۖ֨᩵;->ۧ()V

    if-lt v6, v11, :cond_7

    move-object v12, v14

    goto :goto_9

    :cond_7
    const/4 v0, 0x1

    if-eq v6, v0, :cond_8

    .line 346
    :try_start_1
    sget-object v0, Ll/ۖ֨᩵;->᩷:Ljava/util/Random;

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    add-int/lit16 v0, v0, 0x1f4

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_6

    :catch_2
    move-exception v0

    const-string v1, "interrupted sleep in send"

    .line 349
    invoke-interface {v13, v1, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_8
    :goto_6
    if-eqz v2, :cond_9

    const-string v0, "Restting request"

    .line 353
    invoke-interface {v13, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 354
    invoke-interface/range {p2 .. p2}, Ll/ܰܺ᩵;->reset()V

    :cond_9
    if-eqz v7, :cond_a

    .line 360
    invoke-interface {v7, v8}, Ll/ܽۖ᩵;->֫(Ljava/lang/String;)V

    .line 361
    invoke-interface {v7}, Ll/ܽۖ᩵;->ܽ()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7}, Ll/ܽۖ᩵;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1, v9}, Ll/ܽۖ᩵;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_a
    if-eqz v3, :cond_b

    .line 364
    invoke-interface/range {p3 .. p3}, Ll/ܰܺ᩵;->reset()V

    .line 367
    :cond_b
    :try_start_2
    invoke-virtual/range {p0 .. p1}, Ll/ۖ֨᩵;->ۧ(Ll/ᩳ֨᩵;)Ll/ۘ֨᩵;

    move-result-object v1
    :try_end_2
    .catch Ll/ۗۚ᩵; {:try_start_2 .. :try_end_2} :catch_3

    :try_start_3
    const-string v0, "Have new tree connection for retry"

    .line 368
    invoke-interface {v13, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 369
    :try_start_4
    invoke-virtual {v1}, Ll/ۘ֨᩵;->close()V
    :try_end_4
    .catch Ll/ۗۚ᩵; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_8

    :catchall_0
    move-exception v0

    move-object v14, v0

    .line 367
    :try_start_5
    invoke-virtual {v1}, Ll/ۘ֨᩵;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_7

    :catchall_1
    move-exception v0

    move-object v1, v0

    :try_start_6
    invoke-virtual {v14, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_7
    throw v14
    :try_end_6
    .catch Ll/ۗۚ᩵; {:try_start_6 .. :try_end_6} :catch_3

    :catch_3
    move-exception v0

    const-string v1, "Failed to connect tree on retry"

    .line 370
    invoke-interface {v13, v1, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    move-object v14, v0

    :goto_8
    add-int/lit8 v6, v6, 0x1

    const/4 v0, 0x0

    move-object/from16 v1, p0

    move-object v12, v14

    goto/16 :goto_4

    :cond_c
    const-string v0, "Not retrying"

    .line 317
    invoke-interface {v13, v0, v14}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 318
    throw v14

    :cond_d
    :goto_9
    if-eqz v12, :cond_e

    const-string v0, "All attempts have failed, last exception"

    .line 376
    invoke-interface {v13, v0, v12}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 377
    throw v12

    .line 379
    :cond_e
    new-instance v0, Ll/ۗۚ᩵;

    const-string v1, "All attempts failed, but no exception"

    invoke-direct {v0, v1}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final declared-synchronized ֫(Ll/ᩳ֨᩵;)Ll/ۘ֨᩵;
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 432
    :try_start_0
    invoke-virtual {p0}, Ll/ۖ֨᩵;->ᩳ()Ll/᩻֨᩵;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 433
    :try_start_1
    invoke-virtual {p0}, Ll/ۖ֨᩵;->᩻()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 434
    invoke-virtual {v1}, Ll/᩻֨᩵;->ۘ()Ll/᩷֨᩵;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 435
    :try_start_2
    invoke-virtual {v2}, Ll/᩷֨᩵;->᩻()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Ll/᩷֨᩵;->ۗ()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    .line 440
    :cond_0
    sget-object v3, Ll/ۖ֨᩵;->ۢ:Ll/֫᩻֨;

    const-string v4, "Disconnecting failed tree and session"

    invoke-interface {v3, v4}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 441
    invoke-virtual {p0}, Ll/ۖ֨᩵;->ۧ()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 122
    :cond_1
    :try_start_3
    invoke-virtual {v2}, Ll/۟֨᩵;->ۘ()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_1

    :catchall_0
    move-exception p1

    :try_start_4
    invoke-virtual {v2}, Ll/۟֨᩵;->ۘ()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v2

    .line 434
    :try_start_5
    invoke-virtual {p1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1

    .line 446
    :cond_2
    :goto_1
    invoke-virtual {p0}, Ll/ۖ֨᩵;->᩻()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 447
    sget-object v2, Ll/ۖ֨᩵;->ۢ:Ll/֫᩻֨;

    const-string v3, "Already connected"

    invoke-interface {v2, v3}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 448
    new-instance v2, Ll/ۘ֨᩵;

    invoke-direct {v2, p1, p0}, Ll/ۘ֨᩵;-><init>(Ll/ᩳ֨᩵;Ll/ۖ֨᩵;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    if-eqz v1, :cond_3

    .line 213
    :try_start_6
    invoke-virtual {v1}, Ll/᩻֨᩵;->᩸()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 448
    :cond_3
    monitor-exit v0

    return-object v2

    .line 451
    :cond_4
    :try_start_7
    invoke-virtual {p1}, Ll/ᩳ֨᩵;->ܿ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, p1, v2}, Ll/ۖ֨᩵;->֫(Ll/ᩳ֨᩵;Ljava/lang/String;)Ll/ۘ֨᩵;

    move-result-object p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    if-eqz v1, :cond_5

    .line 213
    :try_start_8
    invoke-virtual {v1}, Ll/᩻֨᩵;->᩸()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 451
    :cond_5
    monitor-exit v0

    return-object p1

    :catchall_2
    move-exception p1

    if-eqz v1, :cond_6

    .line 213
    :try_start_9
    invoke-virtual {v1}, Ll/᩻֨᩵;->᩸()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v1

    .line 432
    :try_start_a
    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_6
    :goto_2
    throw p1

    :catchall_4
    move-exception p1

    monitor-exit v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    throw p1
.end method

.method public final declared-synchronized ֫(Ll/ᩳ֨᩵;Ljava/lang/String;)Ll/ۘ֨᩵;
    .locals 2

    move-object v0, p0

    monitor-enter v0

    const/4 v1, 0x0

    .line 474
    :try_start_0
    invoke-virtual {p0, p1, p2, v1}, Ll/ۖ֨᩵;->֫(Ll/ᩳ֨᩵;Ljava/lang/String;Ll/ܺۖ᩵;)Ll/ۘ֨᩵;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Ll/ᩳ֨᩵;Ljava/lang/String;Ll/ܺۖ᩵;)Ll/ۘ֨᩵;
    .locals 23

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    const-string v0, "Tree is "

    move-object/from16 v16, p0

    monitor-enter v16

    .line 487
    :try_start_0
    invoke-direct/range {p0 .. p0}, Ll/ۖ֨᩵;->᩷()Ll/᩵֨᩵;

    move-result-object v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_12

    const/4 v1, 0x0

    if-eqz v10, :cond_2

    .line 489
    :try_start_1
    sget-object v2, Ll/ۖ֨᩵;->ۢ:Ll/֫᩻֨;

    invoke-interface {v2}, Ll/֫᩻֨;->֫()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 490
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 493
    :cond_0
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨᩵;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10}, Ll/᩵֨᩵;->ᩳ()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 494
    invoke-virtual {v10}, Ll/᩵֨᩵;->ܽ()Ll/᩻֨᩵;

    move-result-object v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    .line 495
    :try_start_2
    invoke-virtual {v11}, Ll/᩻֨᩵;->ۜ()Ljava/lang/String;

    move-result-object v0

    .line 496
    invoke-virtual {v11}, Ll/᩻֨᩵;->᩵()Z

    move-result v3

    if-nez v3, :cond_1

    .line 497
    invoke-virtual {v11}, Ll/᩻֨᩵;->ۘ()Ll/᩷֨᩵;

    move-result-object v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 498
    :try_start_3
    invoke-virtual {v10}, Ll/᩵֨᩵;->ᩳ()Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object v5, v12

    move-object v6, v10

    invoke-direct/range {v1 .. v7}, Ll/ۖ֨᩵;->֫(Ll/ᩳ֨᩵;Ljava/lang/String;Ljava/lang/String;Ll/ۢ֨᩵;Ll/᩵֨᩵;Ll/ܺۖ᩵;)Ll/᩵֨᩵;

    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 499
    :try_start_4
    invoke-direct {v8, v1}, Ll/ۖ֨᩵;->֫(Ll/᩵֨᩵;)V

    .line 500
    new-instance v0, Ll/ۘ֨᩵;

    invoke-direct {v0, v9, v8}, Ll/ۘ֨᩵;-><init>(Ll/ᩳ֨᩵;Ll/ۖ֨᩵;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 190
    :try_start_5
    invoke-virtual {v1}, Ll/᩵֨᩵;->֡()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 122
    :try_start_6
    invoke-virtual {v12}, Ll/۟֨᩵;->ۘ()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 213
    :try_start_7
    invoke-virtual {v11}, Ll/᩻֨᩵;->᩸()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 190
    :try_start_8
    invoke-virtual {v10}, Ll/᩵֨᩵;->֡()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_12

    .line 500
    monitor-exit v16

    return-object v0

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 190
    :try_start_9
    invoke-virtual {v1}, Ll/᩵֨᩵;->֡()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v1, v0

    .line 497
    :try_start_a
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    :catchall_2
    move-exception v0

    move-object v1, v0

    .line 122
    :try_start_b
    invoke-virtual {v12}, Ll/۟֨᩵;->ۘ()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception v0

    move-object v2, v0

    .line 497
    :try_start_c
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v1

    :cond_1
    const-string v3, "Session no longer valid"

    .line 503
    invoke-interface {v2, v3}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 213
    :try_start_d
    invoke-virtual {v11}, Ll/᩻֨᩵;->᩸()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    goto :goto_4

    :catchall_4
    move-exception v0

    move-object v1, v0

    :try_start_e
    invoke-virtual {v11}, Ll/᩻֨᩵;->᩸()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    goto :goto_2

    :catchall_5
    move-exception v0

    move-object v2, v0

    .line 494
    :try_start_f
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    :catchall_6
    move-exception v0

    move-object v1, v0

    .line 190
    :try_start_10
    invoke-virtual {v10}, Ll/᩵֨᩵;->֡()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    goto :goto_3

    :catchall_7
    move-exception v0

    move-object v2, v0

    .line 487
    :try_start_11
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v1

    :cond_2
    move-object v0, v1

    :goto_4
    if-eqz v10, :cond_3

    .line 190
    invoke-virtual {v10}, Ll/᩵֨᩵;->֡()V

    .line 509
    :cond_3
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨᩵;->ܿ()Ljava/lang/String;

    move-result-object v2

    .line 510
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨᩵;->ۜ()I

    move-result v3

    const/16 v4, 0x8

    if-eq v3, v4, :cond_5

    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨᩵;->᩷()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_5

    const-string v3, "\\"

    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨᩵;->᩷()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_5

    .line 511
    :cond_4
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨᩵;->᩷()Ljava/lang/String;

    move-result-object v1

    .line 512
    :cond_5
    :goto_5
    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨᩵;->ܳ()Ljava/lang/String;

    move-result-object v3

    if-eqz p3, :cond_6

    move-object/from16 v10, p3

    goto :goto_6

    .line 514
    :cond_6
    iget-object v4, v8, Ll/ۖ֨᩵;->֫:Ll/ᩴۡ᩵;

    invoke-interface {v4}, Ll/ᩴۡ᩵;->ᩳ()Ll/ܶۡ᩵;

    move-result-object v4

    iget-object v5, v8, Ll/ۖ֨᩵;->֫:Ll/ᩴۡ᩵;

    invoke-virtual/range {p1 .. p1}, Ll/ᩳ֨᩵;->ܳ()Ljava/lang/String;

    move-result-object v6

    check-cast v4, Ll/ܰ֡᩵;

    invoke-virtual {v4, v5, v2, v6, v1}, Ll/ܰ֡᩵;->֫(Ll/ᩴۡ᩵;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ܺۖ᩵;

    move-result-object v1

    move-object v10, v1

    :goto_6
    move-object v1, v0

    move-object v2, v9

    move-object v11, v10

    move-object/from16 v0, p2

    :goto_7
    if-eqz v11, :cond_7

    .line 519
    invoke-interface {v11}, Ll/ܺۖ᩵;->ܽ()Ljava/lang/String;

    move-result-object v0

    .line 520
    invoke-interface {v11}, Ll/ܺۖ᩵;->֫()Ljava/lang/String;

    move-result-object v1

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    .line 521
    invoke-interface {v11}, Ll/ܺۖ᩵;->ܳ()Ljava/lang/String;

    move-result-object v3
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_12

    move-object v13, v0

    move-object v12, v1

    goto :goto_8

    :cond_7
    move-object v12, v0

    move-object v13, v1

    :goto_8
    move-object v14, v3

    .line 548
    :try_start_12
    iget-object v0, v8, Ll/ۖ֨᩵;->֫:Ll/ᩴۡ᩵;

    invoke-interface {v0}, Ll/ᩴۡ᩵;->ܳ()Ll/ۨۡ᩵;

    move-result-object v0

    iget-object v1, v8, Ll/ۖ֨᩵;->֫:Ll/ᩴۡ᩵;

    .line 549
    invoke-virtual {v2}, Ll/ᩳ֨᩵;->ܽ()I

    move-result v20

    invoke-virtual {v2}, Ll/ᩳ֨᩵;->᩵()Z

    move-result v22

    move-object/from16 v17, v0

    check-cast v17, Ll/ܺ֨᩵;

    const/16 v21, 0x0

    move-object/from16 v18, v1

    move-object/from16 v19, v12

    invoke-virtual/range {v17 .. v22}, Ll/ܺ֨᩵;->֫(Ll/ᩴۡ᩵;Ljava/lang/String;IZZ)Ll/ۢ֨᩵;

    move-result-object v0

    const-class v1, Ll/ۢ֨᩵;

    move-object v15, v0

    check-cast v15, Ll/᩷֨᩵;

    invoke-virtual {v15, v1}, Ll/᩷֨᩵;->֫(Ljava/lang/Class;)Ll/ۢ֨᩵;
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_1
    .catchall {:try_start_12 .. :try_end_12} :catchall_12

    .line 550
    :try_start_13
    iget-object v0, v8, Ll/ۖ֨᩵;->֫:Ll/ᩴۡ᩵;

    .line 106
    invoke-virtual {v15, v0, v12, v13}, Ll/᩷֨᩵;->֫(Ll/ᩴۡ᩵;Ljava/lang/String;Ljava/lang/String;)Ll/᩻֨᩵;

    move-result-object v7

    .line 550
    invoke-virtual {v7}, Ll/᩻֨᩵;->ۧ()Ll/ۜ֨᩵;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_10

    .line 75
    :try_start_14
    invoke-virtual {v7, v14}, Ll/᩻֨᩵;->֫(Ljava/lang/String;)Ll/᩵֨᩵;

    move-result-object v17

    .line 551
    invoke-virtual/range {v17 .. v17}, Ll/᩵֨᩵;->ۧ()Ll/᩺ۡ᩵;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_d

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v12

    move-object v4, v14

    move-object v5, v15

    move-object/from16 v6, v17

    move-object/from16 v18, v7

    move-object v7, v11

    .line 552
    :try_start_15
    invoke-direct/range {v1 .. v7}, Ll/ۖ֨᩵;->֫(Ll/ᩳ֨᩵;Ljava/lang/String;Ljava/lang/String;Ll/ۢ֨᩵;Ll/᩵֨᩵;Ll/ܺۖ᩵;)Ll/᩵֨᩵;

    move-result-object v1
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_a

    if-eqz v11, :cond_8

    .line 554
    :try_start_16
    invoke-virtual {v1, v11}, Ll/᩵֨᩵;->֫(Ll/ܺۖ᩵;)V

    if-eq v11, v10, :cond_8

    .line 556
    invoke-interface {v11}, Ll/ܺۖ᩵;->ۧ()Ll/ۡۖ᩵;

    move-result-object v0

    invoke-interface {v0}, Ll/ܺۖ᩵;->᩷()V

    .line 559
    :cond_8
    invoke-direct {v8, v1}, Ll/ۖ֨᩵;->֫(Ll/᩵֨᩵;)V

    .line 560
    new-instance v0, Ll/ۘ֨᩵;

    invoke-direct {v0, v9, v8}, Ll/ۘ֨᩵;-><init>(Ll/ᩳ֨᩵;Ll/ۖ֨᩵;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_8

    .line 190
    :try_start_17
    invoke-virtual {v1}, Ll/᩵֨᩵;->֡()V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_a

    :try_start_18
    invoke-virtual/range {v17 .. v17}, Ll/᩵֨᩵;->֡()V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_c

    .line 213
    :try_start_19
    invoke-virtual/range {v18 .. v18}, Ll/᩻֨᩵;->᩸()V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_f

    .line 122
    :try_start_1a
    invoke-virtual {v15}, Ll/۟֨᩵;->ۘ()V
    :try_end_1a
    .catch Ljava/io/IOException; {:try_start_1a .. :try_end_1a} :catch_0
    .catchall {:try_start_1a .. :try_end_1a} :catchall_12

    .line 560
    monitor-exit v16

    return-object v0

    :catch_0
    move-exception v0

    move-object v2, v9

    goto :goto_f

    :catchall_8
    move-exception v0

    move-object v2, v0

    .line 190
    :try_start_1b
    invoke-virtual {v1}, Ll/᩵֨᩵;->֡()V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_9

    goto :goto_9

    :catchall_9
    move-exception v0

    move-object v1, v0

    .line 548
    :try_start_1c
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_9
    throw v2
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_a

    :catchall_a
    move-exception v0

    move-object v1, v0

    .line 190
    :try_start_1d
    invoke-virtual/range {v17 .. v17}, Ll/᩵֨᩵;->֡()V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_b

    goto :goto_a

    :catchall_b
    move-exception v0

    move-object v2, v0

    .line 548
    :try_start_1e
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_a
    throw v1
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_c

    :catchall_c
    move-exception v0

    goto :goto_b

    :catchall_d
    move-exception v0

    move-object/from16 v18, v7

    :goto_b
    move-object v1, v0

    .line 213
    :try_start_1f
    invoke-virtual/range {v18 .. v18}, Ll/᩻֨᩵;->᩸()V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_e

    goto :goto_c

    :catchall_e
    move-exception v0

    move-object v2, v0

    .line 548
    :try_start_20
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_c
    throw v1
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_f

    :catchall_f
    move-exception v0

    move-object v1, v0

    move-object v2, v9

    goto :goto_d

    :catchall_10
    move-exception v0

    move-object v1, v0

    .line 122
    :goto_d
    :try_start_21
    invoke-virtual {v15}, Ll/۟֨᩵;->ۘ()V
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_11

    goto :goto_e

    :catchall_11
    move-exception v0

    move-object v3, v0

    .line 548
    :try_start_22
    invoke-virtual {v1, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_e
    throw v1
    :try_end_22
    .catch Ljava/io/IOException; {:try_start_22 .. :try_end_22} :catch_1
    .catchall {:try_start_22 .. :try_end_22} :catchall_12

    :catch_1
    move-exception v0

    .line 564
    :goto_f
    :try_start_23
    sget-object v1, Ll/ۖ֨᩵;->ۢ:Ll/֫᩻֨;

    const-string v3, "Referral failed, trying next"

    invoke-interface {v1, v3, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    if-eqz v11, :cond_9

    .line 568
    invoke-interface {v11}, Ll/ܺۖ᩵;->next()Ll/ۡۖ᩵;

    move-result-object v11

    :cond_9
    if-eq v11, v10, :cond_a

    move-object v0, v12

    move-object v1, v13

    move-object v3, v14

    goto/16 :goto_7

    .line 572
    :cond_a
    throw v0

    :catchall_12
    move-exception v0

    .line 571
    monitor-exit v16
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_12

    throw v0
.end method

.method public final ֫(Ll/ᩳ֨᩵;Ll/ܽۖ᩵;)Ll/ۛۡ᩵;
    .locals 6

    .line 646
    instance-of v0, p2, Ll/֫ۘ᩵;

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    const/4 v0, 0x0

    .line 649
    :goto_0
    iget-object v1, p0, Ll/ۖ֨᩵;->֫:Ll/ᩴۡ᩵;

    invoke-interface {v1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v1

    check-cast v1, Ll/ܰۡ᩵;

    invoke-virtual {v1}, Ll/ܰۡ᩵;->ᩴ()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    if-ge v0, v1, :cond_4

    .line 651
    :try_start_0
    invoke-direct {p0, p1, p2}, Ll/ۖ֨᩵;->ۧ(Ll/ᩳ֨᩵;Ll/ܽۖ᩵;)Ll/ۛۡ᩵;

    move-result-object p1
    :try_end_0
    .catch Ll/ۗۚ᩵; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v1

    .line 654
    invoke-virtual {v1}, Ll/ۗۚ᩵;->֫()I

    move-result v2

    const v3, -0x3ffffddb    # -2.000131f

    if-eq v2, v3, :cond_2

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    instance-of v2, v2, Ll/֫۠᩵;

    if-eqz v2, :cond_1

    goto :goto_1

    .line 655
    :cond_1
    throw v1

    .line 657
    :cond_2
    :goto_1
    sget-object v2, Ll/ۖ֨᩵;->ۢ:Ll/֫᩻֨;

    const-string v3, "resolveDfs"

    invoke-interface {v2, v3, v1}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 661
    invoke-interface {v2}, Ll/֫᩻֨;->֫()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 662
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "Retrying ("

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ") resolveDfs: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_3
    const-string v1, "Disconnecting tree on DFS retry"

    .line 664
    invoke-interface {v2, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 665
    invoke-virtual {p0}, Ll/ۖ֨᩵;->ۧ()V

    .line 667
    :try_start_1
    sget-object v1, Ll/ۖ֨᩵;->᩷:Ljava/util/Random;

    const/16 v4, 0x1388

    invoke-virtual {v1, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    add-int/lit16 v1, v1, 0x1f4

    int-to-long v4, v1

    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v1

    .line 669
    invoke-interface {v2, v3, v1}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 672
    :goto_2
    invoke-virtual {p0, p1}, Ll/ۖ֨᩵;->ۧ(Ll/ᩳ֨᩵;)Ll/ۘ֨᩵;

    move-result-object v1

    .line 673
    invoke-virtual {v1}, Ll/ۘ֨᩵;->close()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return-object p1
.end method

.method public final ֫()V
    .locals 7

    const-string v1, "Acquire tree on first usage "

    .line 179
    iget-object v0, p0, Ll/ۖ֨᩵;->᩻:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v2

    .line 180
    sget-object v4, Ll/ۖ֨᩵;->ۢ:Ll/֫᩻֨;

    invoke-interface {v4}, Ll/֫᩻֨;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 181
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "Acquire tree connection "

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v5, " "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    :cond_0
    const-wide/16 v5, 0x1

    cmp-long v0, v2, v5

    if-nez v0, :cond_5

    move-object v0, p0

    .line 185
    monitor-enter v0

    .line 186
    :try_start_0
    invoke-direct {p0}, Ll/ۖ֨᩵;->᩷()Ll/᩵֨᩵;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    .line 188
    :try_start_1
    iget-boolean v5, p0, Ll/ۖ֨᩵;->ܳ:Z

    if-nez v5, :cond_2

    .line 189
    invoke-interface {v4}, Ll/֫᩻֨;->֫()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 190
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 136
    :cond_1
    invoke-virtual {v2}, Ll/᩵֨᩵;->֫()V

    .line 193
    iput-boolean v3, p0, Ll/ۖ֨᩵;->ܳ:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    .line 190
    :try_start_2
    invoke-virtual {v2}, Ll/᩵֨᩵;->֡()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v2

    .line 186
    :try_start_3
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1

    :cond_2
    :goto_1
    if-eqz v2, :cond_3

    .line 190
    invoke-virtual {v2}, Ll/᩵֨᩵;->֡()V

    .line 197
    :cond_3
    iget-object v1, p0, Ll/ۖ֨᩵;->ۧ:Ll/ۖ֨᩵;

    if-eqz v1, :cond_4

    iget-boolean v1, p0, Ll/ۖ֨᩵;->ܽ:Z

    if-nez v1, :cond_4

    const-string v1, "Acquire delegate on first usage"

    .line 198
    invoke-interface {v4, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 199
    iget-object v1, p0, Ll/ۖ֨᩵;->ۧ:Ll/ۖ֨᩵;

    invoke-virtual {v1}, Ll/ۖ֨᩵;->֫()V

    .line 200
    iput-boolean v3, p0, Ll/ۖ֨᩵;->ܽ:Z

    .line 202
    :cond_4
    monitor-exit v0

    return-void

    :catchall_2
    move-exception v1

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw v1

    :cond_5
    return-void
.end method

.method public final ֫(Ll/ۖ֨᩵;)Z
    .locals 2

    .line 855
    invoke-direct {p0}, Ll/ۖ֨᩵;->᩷()Ll/᩵֨᩵;

    move-result-object v0

    .line 856
    :try_start_0
    invoke-direct {p1}, Ll/ۖ֨᩵;->᩷()Ll/᩵֨᩵;

    move-result-object p1

    if-ne v0, p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 190
    invoke-virtual {p1}, Ll/᩵֨᩵;->֡()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ll/᩵֨᩵;->֡()V

    :cond_2
    return v1

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_3

    :try_start_1
    invoke-virtual {v0}, Ll/᩵֨᩵;->֡()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    .line 855
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    throw p1
.end method

.method public final ۜ()V
    .locals 8

    const-string v1, "Tree connection no longer in use, release tree "

    .line 214
    iget-object v0, p0, Ll/ۖ֨᩵;->᩻:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->decrementAndGet()J

    move-result-wide v2

    .line 215
    sget-object v4, Ll/ۖ֨᩵;->ۢ:Ll/֫᩻֨;

    invoke-interface {v4}, Ll/֫᩻֨;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 216
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "Release tree connection "

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v5, " "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    :cond_0
    const-wide/16 v5, 0x0

    cmp-long v7, v2, v5

    if-nez v7, :cond_6

    move-object v0, p0

    .line 220
    monitor-enter v0

    .line 221
    :try_start_0
    invoke-direct {p0}, Ll/ۖ֨᩵;->᩷()Ll/᩵֨᩵;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 222
    :try_start_1
    iget-boolean v3, p0, Ll/ۖ֨᩵;->ܳ:Z

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    if-eqz v2, :cond_2

    .line 223
    invoke-interface {v4}, Ll/֫᩻֨;->֫()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 224
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 226
    :cond_1
    iput-boolean v5, p0, Ll/ۖ֨᩵;->ܳ:Z

    .line 195
    invoke-virtual {v2}, Ll/᩵֨᩵;->֡()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :cond_2
    if-eqz v2, :cond_3

    .line 190
    :try_start_2
    invoke-virtual {v2}, Ll/᩵֨᩵;->֡()V

    .line 230
    :cond_3
    iget-object v1, p0, Ll/ۖ֨᩵;->ۧ:Ll/ۖ֨᩵;

    if-eqz v1, :cond_4

    iget-boolean v1, p0, Ll/ۖ֨᩵;->ܽ:Z

    if-eqz v1, :cond_4

    .line 231
    iput-boolean v5, p0, Ll/ۖ֨᩵;->ܽ:Z

    .line 232
    iget-object v1, p0, Ll/ۖ֨᩵;->ۧ:Ll/ۖ֨᩵;

    invoke-virtual {v1}, Ll/ۖ֨᩵;->ۜ()V

    .line 234
    :cond_4
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 236
    iget-object v1, p0, Ll/ۖ֨᩵;->ᩳ:Ll/ۢ֨᩵;

    if-eqz v1, :cond_7

    move-object v0, p0

    .line 238
    monitor-enter v0

    :try_start_3
    const-string v2, "Disconnecting exclusive transport"

    .line 240
    invoke-interface {v4, v2}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 241
    iput-object v2, p0, Ll/ۖ֨᩵;->ᩳ:Ll/ۢ֨᩵;

    .line 242
    iput-object v2, p0, Ll/ۖ֨᩵;->ܿ:Ll/᩵֨᩵;

    .line 243
    iput-boolean v5, p0, Ll/ۖ֨᩵;->ܳ:Z

    .line 244
    move-object v2, v1

    check-cast v2, Ll/۟֨᩵;

    .line 122
    invoke-virtual {v2}, Ll/۟֨᩵;->ۘ()V

    .line 245
    check-cast v1, Ll/۟֨᩵;

    invoke-virtual {v1, v5, v5}, Ll/۟֨᩵;->֫(ZZ)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v1

    .line 247
    :try_start_4
    sget-object v2, Ll/ۖ֨᩵;->ۢ:Ll/֫᩻֨;

    const-string v3, "Failed to close exclusive transport"

    invoke-interface {v2, v3, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 249
    :goto_0
    monitor-exit v0

    goto :goto_3

    :goto_1
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v1

    :catchall_1
    move-exception v1

    if-eqz v2, :cond_5

    .line 190
    :try_start_5
    invoke-virtual {v2}, Ll/᩵֨᩵;->֡()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v2

    .line 221
    :try_start_6
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_2
    throw v1

    :catchall_3
    move-exception v1

    .line 234
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    throw v1

    :cond_6
    if-ltz v7, :cond_8

    :cond_7
    :goto_3
    return-void

    .line 252
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Usage count dropped below zero "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;)V

    .line 253
    new-instance v0, Ll/۬ۡ᩵;

    const-string v1, "Usage count dropped below zero"

    .line 58
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 253
    throw v0
.end method

.method public final ۧ(Ll/ᩳ֨᩵;)Ll/ۘ֨᩵;
    .locals 2

    const-string v0, "Failed to connect to server"

    .line 415
    :try_start_0
    invoke-virtual {p0, p1}, Ll/ۖ֨᩵;->֫(Ll/ᩳ֨᩵;)Ll/ۘ֨᩵;

    move-result-object p1
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ll/ۗۚ᩵; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 421
    new-instance v1, Ll/ۗۚ᩵;

    invoke-direct {v1, v0, p1}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1

    :catch_1
    move-exception p1

    .line 419
    throw p1

    :catch_2
    move-exception p1

    .line 417
    new-instance v1, Ll/ۗۚ᩵;

    invoke-direct {v1, v0, p1}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1
.end method

.method public final declared-synchronized ۧ()V
    .locals 8

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 266
    :try_start_0
    invoke-virtual {p0}, Ll/ۖ֨᩵;->ᩳ()Ll/᩻֨᩵;

    move-result-object v2

    if-nez v2, :cond_1

    if-eqz v2, :cond_0

    .line 213
    invoke-virtual {v2}, Ll/᩻֨᩵;->᩸()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 268
    :cond_0
    monitor-exit v0

    return-void

    .line 270
    :cond_1
    :try_start_1
    invoke-virtual {v2}, Ll/᩻֨᩵;->ۘ()Ll/᩷֨᩵;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    move-object v1, v3

    .line 271
    :try_start_2
    monitor-enter v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 272
    :try_start_3
    invoke-direct {p0}, Ll/ۖ֨᩵;->ۢ()Ll/᩵֨᩵;

    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v4, :cond_2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 275
    :try_start_4
    invoke-virtual {v4, v5, v5}, Ll/᩵֨᩵;->֫(ZZ)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 277
    :try_start_5
    iput-object v7, p0, Ll/ۖ֨᩵;->ܿ:Ll/᩵֨᩵;

    .line 278
    iput-boolean v6, p0, Ll/ۖ֨᩵;->ܳ:Z

    goto :goto_0

    :catchall_0
    move-exception v4

    .line 277
    iput-object v7, p0, Ll/ۖ֨᩵;->ܿ:Ll/᩵֨᩵;

    .line 278
    iput-boolean v6, p0, Ll/ۖ֨᩵;->ܳ:Z

    .line 279
    throw v4

    .line 281
    :cond_2
    iget-object v4, p0, Ll/ۖ֨᩵;->ۧ:Ll/ۖ֨᩵;

    invoke-virtual {v4}, Ll/ۖ֨᩵;->ۧ()V

    .line 283
    :goto_0
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 122
    :try_start_6
    invoke-virtual {v3}, Ll/۟֨᩵;->ۘ()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 213
    :try_start_7
    invoke-virtual {v2}, Ll/᩻֨᩵;->᩸()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 286
    monitor-exit v0

    return-void

    :catchall_1
    move-exception v4

    .line 283
    :try_start_8
    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :try_start_9
    throw v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :catchall_2
    move-exception v1

    .line 122
    :try_start_a
    invoke-virtual {v3}, Ll/۟֨᩵;->ۘ()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception v3

    .line 270
    :try_start_b
    invoke-virtual {v1, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    :catchall_4
    move-exception v1

    .line 213
    :try_start_c
    invoke-virtual {v2}, Ll/᩻֨᩵;->᩸()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    goto :goto_2

    :catchall_5
    move-exception v2

    .line 266
    :try_start_d
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1

    :catchall_6
    move-exception v1

    monitor-exit v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    throw v1
.end method

.method public final ܳ()I
    .locals 2

    .line 830
    invoke-direct {p0}, Ll/ۖ֨᩵;->᩷()Ll/᩵֨᩵;

    move-result-object v0

    .line 831
    :try_start_0
    invoke-virtual {v0}, Ll/᩵֨᩵;->ۜ()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 190
    invoke-virtual {v0}, Ll/᩵֨᩵;->֡()V

    return v1

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_0

    :try_start_1
    invoke-virtual {v0}, Ll/᩵֨᩵;->֡()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    .line 830
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    throw v1
.end method

.method public final ܽ()Ll/֨ۡ᩵;
    .locals 1

    .line 110
    iget-object v0, p0, Ll/ۖ֨᩵;->֫:Ll/ᩴۡ᩵;

    invoke-interface {v0}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()J
    .locals 2

    .line 782
    invoke-direct {p0}, Ll/ۖ֨᩵;->ۢ()Ll/᩵֨᩵;

    move-result-object v0

    if-nez v0, :cond_0

    const-wide/16 v0, -0x1

    return-wide v0

    .line 786
    :cond_0
    invoke-virtual {v0}, Ll/᩵֨᩵;->ܳ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ᩳ()Ll/᩻֨᩵;
    .locals 1

    .line 797
    invoke-direct {p0}, Ll/ۖ֨᩵;->ۢ()Ll/᩵֨᩵;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 799
    invoke-virtual {v0}, Ll/᩵֨᩵;->ܽ()Ll/᩻֨᩵;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final declared-synchronized ᩻()Z
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 462
    :try_start_0
    invoke-direct {p0}, Ll/ۖ֨᩵;->ۢ()Ll/᩵֨᩵;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 463
    invoke-virtual {v1}, Ll/᩵֨᩵;->ۖ()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
