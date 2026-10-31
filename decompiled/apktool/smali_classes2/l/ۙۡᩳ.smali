.class public final Ll/ۙۡᩳ;
.super Ljava/lang/Object;
.source "N1X5"


# static fields
.field public static ܳ:Ljava/lang/Boolean;


# instance fields
.field public final ֫:Ll/۠ۡᩳ;

.field public volatile ۧ:Z

.field public volatile ܽ:Ll/ᩴܺᩳ;

.field public volatile ܿ:I

.field public volatile ᩳ:I


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, -0x80000000

    .line 49
    iput v0, p0, Ll/ۙۡᩳ;->ܿ:I

    .line 50
    iput v0, p0, Ll/ۙۡᩳ;->ᩳ:I

    .line 58
    sget-object v0, Ll/ۙۡᩳ;->ܳ:Ljava/lang/Boolean;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 59
    new-instance v0, Landroid/content/Intent;

    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v2

    const-class v3, Ll/᩹ܺᩳ;

    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 60
    new-instance v2, Ll/᩸ۡᩳ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 89
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v3

    invoke-virtual {v3, v0, v2, v1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 90
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sput-object v0, Ll/ۙۡᩳ;->ܳ:Ljava/lang/Boolean;

    .line 93
    :cond_0
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v0

    .line 94
    new-instance v2, Landroid/content/Intent;

    const-class v3, Ll/ܺܺᩳ;

    invoke-direct {v2, v0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 95
    new-instance v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 96
    new-instance v4, Ll/᩹ۡᩳ;

    invoke-direct {v4, p0}, Ll/᩹ۡᩳ;-><init>(Ll/ۙۡᩳ;)V

    .line 111
    invoke-virtual {v0, v2, v4, v1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 112
    new-instance v1, Ll/۠ۡᩳ;

    invoke-direct {v1, p0, v3, v0, v4}, Ll/۠ۡᩳ;-><init>(Ll/ۙۡᩳ;Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/app/Application;Landroid/content/ServiceConnection;)V

    iput-object v1, p0, Ll/ۙۡᩳ;->֫:Ll/۠ۡᩳ;

    return-void

    :cond_1
    const/4 v0, 0x0

    .line 124
    iput-object v0, p0, Ll/ۙۡᩳ;->֫:Ll/۠ۡᩳ;

    return-void
.end method

.method public static bridge synthetic ֫(Ljava/lang/Boolean;)V
    .locals 0

    .line 0
    sput-object p0, Ll/ۙۡᩳ;->ܳ:Ljava/lang/Boolean;

    return-void
.end method

.method public static synthetic ֫(Ll/ۙۡᩳ;Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/app/Application;Landroid/content/ServiceConnection;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 114
    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 117
    iput-object p1, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    .line 119
    :try_start_0
    invoke-virtual {p2, p3}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۙۡᩳ;Ll/ᩴܺᩳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    return-void
.end method

.method public static bridge synthetic ۧ()Ljava/lang/Boolean;
    .locals 1

    .line 0
    sget-object v0, Ll/ۙۡᩳ;->ܳ:Ljava/lang/Boolean;

    return-object v0
.end method

.method private ܽ()V
    .locals 5

    .line 580
    iget-object v0, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    const-string v1, "Disconnected after load failure"

    if-eqz v0, :cond_5

    .line 585
    :try_start_0
    iget-object v0, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    invoke-interface {v0}, Ll/ᩴܺᩳ;->ۚ()[Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_4

    const/4 v1, 0x0

    .line 593
    aget-object v1, v0, v1

    .line 200
    iget-boolean v2, p0, Ll/ۙۡᩳ;->ۧ:Z

    const/high16 v3, -0x80000000

    if-nez v2, :cond_0

    const/high16 v2, -0x80000000

    goto :goto_0

    .line 203
    :cond_0
    iget v2, p0, Ll/ۙۡᩳ;->ܿ:I

    :goto_0
    const v4, 0x7f120280

    if-eq v2, v3, :cond_2

    const/16 v3, -0x3e8

    if-le v2, v3, :cond_1

    goto :goto_1

    .line 567
    :cond_1
    invoke-static {v4}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    const-string v2, "Seccomp fatal:"

    .line 569
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 570
    invoke-static {v4}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    .line 594
    :cond_3
    :goto_2
    new-instance v2, Ll/᩶ۡᩳ;

    invoke-direct {v2, v1, v0}, Ll/᩶ۡᩳ;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    throw v2

    :cond_4
    return-void

    .line 590
    :catch_0
    new-instance v0, Ll/ۗۡᩳ;

    .line 6
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 590
    throw v0

    .line 581
    :cond_5
    new-instance v0, Ll/ۗۡᩳ;

    .line 6
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 581
    throw v0
.end method


# virtual methods
.method public final ֫([B)I
    .locals 1

    .line 282
    iget-object v0, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    if-eqz v0, :cond_1

    .line 291
    iget-object v0, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    invoke-interface {v0, p1}, Ll/ᩴܺᩳ;->ܳ([B)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    .line 293
    invoke-direct {p0}, Ll/ۙۡᩳ;->ܽ()V

    .line 298
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    return p1

    .line 283
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Disconnected"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()V
    .locals 1

    .line 172
    iget-object v0, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    if-eqz v0, :cond_0

    .line 174
    :try_start_0
    iget-object v0, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    invoke-interface {v0}, Ll/ᩴܺᩳ;->exit()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    nop

    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 185
    iput-object v0, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    .line 186
    iget-object v0, p0, Ll/ۙۡᩳ;->֫:Ll/۠ۡᩳ;

    if-nez v0, :cond_1

    goto :goto_1

    .line 190
    :cond_1
    :try_start_1
    invoke-virtual {v0}, Ll/۠ۡᩳ;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    :goto_1
    return-void
.end method

.method public final ֫(Ljava/lang/String;ZZ)V
    .locals 5

    .line 149
    iget-object v0, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    if-eqz v0, :cond_0

    sget-object v0, Ll/ۙۡᩳ;->ܳ:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    .line 150
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x7d0

    add-long/2addr v0, v2

    .line 151
    :goto_0
    iget-object v2, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    if-eqz v2, :cond_6

    sget-object v2, Ll/ۙۡᩳ;->ܳ:Ljava/lang/Boolean;

    if-nez v2, :cond_1

    goto :goto_2

    :cond_1
    const-string v0, "/"

    .line 158
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    .line 0
    invoke-static {v1, v2, p1}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_2
    const/high16 v0, -0x80000000

    .line 161
    iput v0, p0, Ll/ۙۡᩳ;->ܿ:I

    .line 162
    iput-boolean v2, p0, Ll/ۙۡᩳ;->ۧ:Z

    .line 163
    iget-object v2, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    sget-object v3, Ll/ۙۡᩳ;->ܳ:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-interface {v2, p1, p2, v3, p3}, Ll/ᩴܺᩳ;->֫(Ljava/lang/String;ZZZ)Z

    move-result p1

    .line 518
    iget p2, p0, Ll/ۙۡᩳ;->ᩳ:I

    .line 519
    iget-object p3, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    if-nez p3, :cond_4

    if-ne p2, v0, :cond_3

    goto :goto_1

    .line 558
    :cond_3
    invoke-static {p2}, Ll/֨ۧܺ;->֫(I)Ljava/lang/String;

    goto :goto_1

    .line 528
    :cond_4
    :try_start_0
    iget-object p3, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    invoke-interface {p3}, Ll/ᩴܺᩳ;->֨()I

    move-result p3

    iput p3, p0, Ll/ۙۡᩳ;->ܿ:I

    .line 529
    iget p3, p0, Ll/ۙۡᩳ;->ܿ:I

    iput p3, p0, Ll/ۙۡᩳ;->ᩳ:I

    .line 530
    iput-boolean v1, p0, Ll/ۙۡᩳ;->ۧ:Z

    .line 531
    iget p3, p0, Ll/ۙۡᩳ;->ܿ:I

    invoke-static {p3}, Ll/֨ۧܺ;->֫(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    nop

    if-ne p2, v0, :cond_3

    :goto_1
    if-nez p1, :cond_5

    .line 167
    invoke-direct {p0}, Ll/ۙۡᩳ;->ܽ()V

    :cond_5
    return-void

    .line 152
    :cond_6
    :goto_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v4, v2, v0

    if-gtz v4, :cond_7

    goto :goto_0

    .line 153
    :cond_7
    new-instance p1, Ljava/lang/Exception;

    const-string p2, "Connection timeout"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)[B
    .locals 1

    .line 393
    new-instance v0, Ll/ۤۜܽ;

    invoke-direct {v0}, Ll/ۤۜܽ;-><init>()V

    .line 394
    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 395
    invoke-virtual {v0, p2}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    const/4 p1, 0x0

    .line 396
    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->writeByte(I)V

    .line 397
    invoke-virtual {v0}, Ll/ۤۜܽ;->᩻()[B

    move-result-object p1

    .line 302
    iget-object p2, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    if-eqz p2, :cond_1

    .line 311
    iget-object p2, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    invoke-interface {p2, p1}, Ll/ᩴܺᩳ;->ۧ([B)[B

    move-result-object p1

    if-nez p1, :cond_0

    .line 313
    invoke-direct {p0}, Ll/ۙۡᩳ;->ܽ()V

    :cond_0
    return-object p1

    .line 303
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Disconnected"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۜ(Ljava/lang/String;Ljava/lang/String;)[I
    .locals 1

    .line 489
    iget-object v0, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    if-eqz v0, :cond_1

    .line 494
    iget-object v0, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    invoke-interface {v0, p1, p2}, Ll/ᩴܺᩳ;->ܽ(Ljava/lang/String;Ljava/lang/String;)[I

    move-result-object p1

    if-nez p1, :cond_0

    .line 496
    invoke-direct {p0}, Ll/ۙۡᩳ;->ܽ()V

    :cond_0
    return-object p1

    .line 490
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Disconnected"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۢ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 441
    iget-object v0, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    if-eqz v0, :cond_1

    .line 446
    iget-object v0, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    invoke-interface {v0, p1, p2}, Ll/ᩴܺᩳ;->ܳ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    .line 448
    invoke-direct {p0}, Ll/ۙۡᩳ;->ܽ()V

    :cond_0
    return-object p1

    .line 442
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Disconnected"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ([B)Ljava/lang/String;
    .locals 1

    .line 262
    iget-object v0, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    if-eqz v0, :cond_1

    .line 271
    iget-object v0, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    invoke-interface {v0, p1}, Ll/ᩴܺᩳ;->ᩳ([B)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    .line 273
    invoke-direct {p0}, Ll/ۙۡᩳ;->ܽ()V

    :cond_0
    return-object p1

    .line 263
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Disconnected"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(Ljava/lang/String;Ljava/lang/String;)[C
    .locals 3

    .line 409
    new-instance v0, Ll/ۤۜܽ;

    invoke-direct {v0}, Ll/ۤۜܽ;-><init>()V

    .line 410
    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 411
    invoke-virtual {v0, p2}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    const/4 p1, 0x0

    .line 412
    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->writeByte(I)V

    .line 413
    invoke-virtual {v0}, Ll/ۤۜܽ;->᩻()[B

    move-result-object p2

    .line 347
    iget-object v0, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    if-eqz v0, :cond_2

    .line 356
    iget-object v0, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    invoke-interface {v0, p2}, Ll/ᩴܺᩳ;->ܽ([B)[I

    move-result-object p2

    if-nez p2, :cond_0

    .line 358
    invoke-direct {p0}, Ll/ۙۡᩳ;->ܽ()V

    const/4 p1, 0x0

    return-object p1

    .line 361
    :cond_0
    array-length v0, p2

    new-array v1, v0, [C

    :goto_0
    if-ge p1, v0, :cond_1

    .line 363
    aget v2, p2, p1

    int-to-char v2, v2

    aput-char v2, v1, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return-object v1

    .line 348
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Disconnected"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܳ(Ljava/lang/String;Ljava/lang/String;)[I
    .locals 1

    .line 473
    iget-object v0, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    if-eqz v0, :cond_1

    .line 478
    iget-object v0, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    invoke-interface {v0, p1, p2}, Ll/ᩴܺᩳ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)[I

    move-result-object p1

    if-nez p1, :cond_0

    .line 480
    invoke-direct {p0}, Ll/ۙۡᩳ;->ܽ()V

    :cond_0
    return-object p1

    .line 474
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Disconnected"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܽ(Ljava/lang/String;Ljava/lang/String;)[I
    .locals 1

    .line 417
    new-instance v0, Ll/ۤۜܽ;

    invoke-direct {v0}, Ll/ۤۜܽ;-><init>()V

    .line 418
    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 419
    invoke-virtual {v0, p2}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    const/4 p1, 0x0

    .line 420
    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->writeByte(I)V

    .line 421
    invoke-virtual {v0}, Ll/ۤۜܽ;->᩻()[B

    move-result-object p1

    .line 372
    iget-object p2, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    if-eqz p2, :cond_1

    .line 381
    iget-object p2, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    invoke-interface {p2, p1}, Ll/ᩴܺᩳ;->֫([B)[I

    move-result-object p1

    if-nez p1, :cond_0

    .line 383
    invoke-direct {p0}, Ll/ۙۡᩳ;->ܽ()V

    const/4 p1, 0x0

    :cond_0
    return-object p1

    .line 373
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Disconnected"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܿ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 505
    iget-object v0, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    if-eqz v0, :cond_0

    .line 510
    iget-object v0, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    invoke-interface {v0, p1, p2}, Ll/ᩴܺᩳ;->ܿ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 506
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Disconnected"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ᩳ(Ljava/lang/String;Ljava/lang/String;)[S
    .locals 3

    .line 401
    new-instance v0, Ll/ۤۜܽ;

    invoke-direct {v0}, Ll/ۤۜܽ;-><init>()V

    .line 402
    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 403
    invoke-virtual {v0, p2}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    const/4 p1, 0x0

    .line 404
    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->writeByte(I)V

    .line 405
    invoke-virtual {v0}, Ll/ۤۜܽ;->᩻()[B

    move-result-object p2

    .line 322
    iget-object v0, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    if-eqz v0, :cond_2

    .line 331
    iget-object v0, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    invoke-interface {v0, p2}, Ll/ᩴܺᩳ;->ܿ([B)[I

    move-result-object p2

    if-nez p2, :cond_0

    .line 333
    invoke-direct {p0}, Ll/ۙۡᩳ;->ܽ()V

    const/4 p1, 0x0

    return-object p1

    .line 336
    :cond_0
    array-length v0, p2

    new-array v1, v0, [S

    :goto_0
    if-ge p1, v0, :cond_1

    .line 338
    aget v2, p2, p1

    int-to-short v2, v2

    aput-short v2, v1, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return-object v1

    .line 323
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Disconnected"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ᩷(Ljava/lang/String;Ljava/lang/String;)[I
    .locals 1

    .line 457
    iget-object v0, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    if-eqz v0, :cond_1

    .line 462
    iget-object v0, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    invoke-interface {v0, p1, p2}, Ll/ᩴܺᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)[I

    move-result-object p1

    if-nez p1, :cond_0

    .line 464
    invoke-direct {p0}, Ll/ۙۡᩳ;->ܽ()V

    :cond_0
    return-object p1

    .line 458
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Disconnected"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ᩻(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 425
    iget-object v0, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    if-eqz v0, :cond_1

    .line 430
    iget-object v0, p0, Ll/ۙۡᩳ;->ܽ:Ll/ᩴܺᩳ;

    invoke-interface {v0, p1, p2}, Ll/ᩴܺᩳ;->ۧ(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    .line 432
    invoke-direct {p0}, Ll/ۙۡᩳ;->ܽ()V

    :cond_0
    return p1

    .line 426
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Disconnected"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
