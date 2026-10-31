.class public final Ll/֫֡᩻;
.super Ljava/lang/Object;
.source "R9JP"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Ll/ᩴۤܳ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 119
    new-instance v0, Ll/ᩴۤܳ;

    new-instance v1, Ll/۫᩵᩻;

    .line 24
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 119
    new-instance v2, Ll/ۛܳ᩻;

    invoke-direct {v2}, Ll/ۛܳ᩻;-><init>()V

    invoke-direct {v0, v1, v2}, Ll/ᩴۤܳ;-><init>(Ll/ۗۖ֡;Ll/ۛܳ᩻;)V

    sput-object v0, Ll/֫֡᩻;->ۧ:Ll/ᩴۤܳ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۫֡᩻;)Ll/ۗ֫ۘ;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/֫֡᩻;->ܽ(Ll/۫֡᩻;)Ll/ۗ֫ۘ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(ZLl/۟᩵᩻;Ll/ۨ᩵᩻;)Ll/ۙ֫ۘ;
    .locals 6

    .line 92
    sget-object v0, Ll/۟᩵᩻;->᩹:Ll/۟᩵᩻;

    if-eq p1, v0, :cond_1

    sget-object v1, Ll/ۨ᩵᩻;->᩶:Ll/ۨ᩵᩻;

    if-ne p2, v1, :cond_0

    goto :goto_0

    .line 93
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Unsigned SMB mode requires SMB2 dialects"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 95
    :cond_1
    :goto_0
    invoke-static {}, Ll/ۙ֫ۘ;->۠()Ll/᩶֫ۘ;

    move-result-object v1

    .line 96
    invoke-virtual {v1}, Ll/᩶֫ۘ;->ᩳ()V

    .line 97
    sget-object v2, Ll/ۨ᩵᩻;->᩶:Ll/ۨ᩵᩻;

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-ne p2, v2, :cond_2

    .line 98
    invoke-virtual {v1, v5}, Ll/᩶֫ۘ;->֫(Z)V

    new-array p2, v3, [Ll/᩹ۛۖ;

    sget-object v2, Ll/᩹ۛۖ;->ۗ:Ll/᩹ۛۖ;

    aput-object v2, p2, v5

    sget-object v2, Ll/᩹ۛۖ;->ۙ:Ll/᩹ۛۖ;

    aput-object v2, p2, v4

    .line 99
    invoke-virtual {v1, p2}, Ll/᩶֫ۘ;->֫([Ll/᩹ۛۖ;)V

    goto :goto_1

    .line 101
    :cond_2
    invoke-virtual {v1, v4}, Ll/᩶֫ۘ;->֫(Z)V

    .line 102
    sget-object v2, Ll/ۨ᩵᩻;->ۙ:Ll/ۨ᩵᩻;

    if-ne p2, v2, :cond_3

    const/4 p2, 0x3

    new-array p2, p2, [Ll/᩹ۛۖ;

    .line 103
    sget-object v2, Ll/᩹ۛۖ;->ۤ:Ll/᩹ۛۖ;

    aput-object v2, p2, v5

    sget-object v2, Ll/᩹ۛۖ;->۫:Ll/᩹ۛۖ;

    aput-object v2, p2, v4

    sget-object v2, Ll/᩹ۛۖ;->۬:Ll/᩹ۛۖ;

    aput-object v2, p2, v3

    invoke-virtual {v1, p2}, Ll/᩶֫ۘ;->֫([Ll/᩹ۛۖ;)V

    :cond_3
    :goto_1
    if-eq p1, v0, :cond_4

    .line 107
    invoke-virtual {v1, v5}, Ll/᩶֫ۘ;->ܽ(Z)V

    .line 108
    invoke-virtual {v1}, Ll/᩶֫ۘ;->ܳ()V

    .line 109
    sget-object p2, Ll/۟᩵᩻;->᩶:Ll/۟᩵᩻;

    if-ne p1, p2, :cond_4

    .line 110
    invoke-virtual {v1}, Ll/᩶֫ۘ;->ܿ()V

    :cond_4
    if-eqz p0, :cond_5

    .line 114
    invoke-virtual {v1, v4}, Ll/᩶֫ۘ;->ۧ(Z)V

    .line 116
    :cond_5
    invoke-virtual {v1}, Ll/᩶֫ۘ;->֫()Ll/ۙ֫ۘ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/۫֡᩻;Ll/ۨ᩵᩻;ZLl/ܺ֡᩻;)Ll/ۜ֡᩻;
    .locals 4

    .line 546
    new-instance v0, Ll/᩶۫᩷;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 85
    sget-object v1, Ll/۟᩵᩻;->᩹:Ll/۟᩵᩻;

    invoke-static {p2, v1, p1}, Ll/֫֡᩻;->֫(ZLl/۟᩵᩻;Ll/ۨ᩵᩻;)Ll/ۙ֫ۘ;

    move-result-object p2

    .line 571
    :try_start_0
    invoke-static {p0}, Ll/֫֡᩻;->ܽ(Ll/۫֡᩻;)Ll/ۗ֫ۘ;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    const/4 v2, 0x0

    .line 574
    :try_start_1
    invoke-static {p0, p2, v1, v0}, Ll/֫֡᩻;->֫(Ll/۫֡᩻;Ll/ۙ֫ۘ;Ll/ۗ֫ۘ;Ll/᩶۫᩷;)Ll/ܰ᩵᩻;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    .line 576
    :try_start_2
    sget-object v3, Ll/ۨ᩵᩻;->ۙ:Ll/ۨ᩵᩻;

    if-eq p1, v3, :cond_1

    invoke-static {p0, p2}, Ll/֫֡᩻;->֫(Ll/۫֡᩻;Ljava/lang/Exception;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 579
    sget-object p1, Ll/۟᩵᩻;->᩶:Ll/۟᩵᩻;

    sget-object v3, Ll/ۨ᩵᩻;->᩶:Ll/ۨ᩵᩻;

    invoke-static {v2, p1, v3}, Ll/֫֡᩻;->֫(ZLl/۟᩵᩻;Ll/ۨ᩵᩻;)Ll/ۙ֫ۘ;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 586
    :try_start_3
    invoke-static {p0, p1, v1, v0}, Ll/֫֡᩻;->֫(Ll/۫֡᩻;Ll/ۙ֫ۘ;Ll/ۗ֫ۘ;Ll/᩶۫᩷;)Ll/ܰ᩵᩻;

    move-result-object p0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 606
    :goto_0
    :try_start_4
    sget-object p1, Ll/ܺ֡᩻;->ۙ:Ll/ܺ֡᩻;

    const/4 p2, 0x0

    if-ne p3, p1, :cond_0

    .line 42
    new-instance p0, Ll/ۜ֡᩻;

    invoke-direct {p0, p1, p2, v2}, Ll/ۜ֡᩻;-><init>(Ll/ܺ֡᩻;Ljava/lang/Throwable;Z)V

    goto :goto_1

    .line 609
    :cond_0
    invoke-virtual {p0}, Ll/ܰ᩵᩻;->֫()Z

    move-result p0

    .line 35
    new-instance p1, Ll/ۜ֡᩻;

    sget-object p3, Ll/ܺ֡᩻;->᩶:Ll/ܺ֡᩻;

    invoke-direct {p1, p3, p2, p0}, Ll/ۜ֡᩻;-><init>(Ll/ܺ֡᩻;Ljava/lang/Throwable;Z)V

    move-object p0, p1

    goto :goto_1

    :catch_1
    move-exception p0

    .line 593
    invoke-static {p0, p2}, Ll/֫֡᩻;->֫(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    throw p0

    .line 577
    :cond_1
    throw p2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    :catch_2
    move-exception p0

    .line 611
    invoke-static {p0}, Ll/᩷֡᩻;->֫(Ljava/lang/Exception;)Ll/ۜ֡᩻;

    move-result-object p0

    :goto_1
    return-object p0
.end method

.method public static ֫(Ll/ۛ᩵᩻;)Ll/ۤ᩵᩻;
    .locals 2

    .line 405
    :try_start_0
    sget-object v0, Ll/֫֡᩻;->ۧ:Ll/ᩴۤܳ;

    invoke-virtual {v0, p0}, Ll/ᩴۤܳ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۤ᩵᩻;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 407
    instance-of v0, p0, Ljava/io/IOException;

    if-nez v0, :cond_1

    .line 410
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 411
    instance-of v1, v0, Ljava/io/IOException;

    if-eqz v1, :cond_0

    .line 412
    check-cast v0, Ljava/io/IOException;

    throw v0

    .line 414
    :cond_0
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 408
    :cond_1
    check-cast p0, Ljava/io/IOException;

    throw p0
.end method

.method public static ֫(Ll/۫֡᩻;Ll/ۨ᩵᩻;ZZ)Ll/ۤ᩵᩻;
    .locals 4

    .line 359
    sget-object v0, Ll/֫֡᩻;->ۧ:Ll/ᩴۤܳ;

    if-eqz p3, :cond_0

    sget-object p3, Ll/ۨ᩵᩻;->ۙ:Ll/ۨ᩵᩻;

    if-eq p1, p3, :cond_0

    .line 361
    :try_start_0
    new-instance p3, Ll/ۛ᩵᩻;

    sget-object v1, Ll/۟᩵᩻;->᩶:Ll/۟᩵᩻;

    sget-object v2, Ll/ۨ᩵᩻;->᩶:Ll/ۨ᩵᩻;

    invoke-direct {p3, p0, v1, v2}, Ll/ۛ᩵᩻;-><init>(Ll/۫֡᩻;Ll/۟᩵᩻;Ll/ۨ᩵᩻;)V

    invoke-static {p3}, Ll/֫֡᩻;->֫(Ll/ۛ᩵᩻;)Ll/ۤ᩵᩻;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p3

    .line 367
    sget-object v1, Ll/ۨ᩵᩻;->᩶:Ll/ۨ᩵᩻;

    .line 426
    new-instance v2, Ll/ۛ᩵᩻;

    sget-object v3, Ll/۟᩵᩻;->᩶:Ll/۟᩵᩻;

    invoke-direct {v2, p0, v3, v1}, Ll/ۛ᩵᩻;-><init>(Ll/۫֡᩻;Ll/۟᩵᩻;Ll/ۨ᩵᩻;)V

    invoke-virtual {v0, v2}, Ll/ᩴۤܳ;->ۧ(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    if-eqz p2, :cond_1

    .line 370
    sget-object p2, Ll/ۨ᩵᩻;->ۙ:Ll/ۨ᩵᩻;

    if-eq p1, p2, :cond_1

    .line 372
    :try_start_1
    new-instance p2, Ll/ۛ᩵᩻;

    sget-object v1, Ll/۟᩵᩻;->ۙ:Ll/۟᩵᩻;

    sget-object v2, Ll/ۨ᩵᩻;->᩶:Ll/ۨ᩵᩻;

    invoke-direct {p2, p0, v1, v2}, Ll/ۛ᩵᩻;-><init>(Ll/۫֡᩻;Ll/۟᩵᩻;Ll/ۨ᩵᩻;)V

    invoke-static {p2}, Ll/֫֡᩻;->֫(Ll/ۛ᩵᩻;)Ll/ۤ᩵᩻;

    move-result-object p0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p0

    .line 377
    :catch_1
    sget-object p2, Ll/ۨ᩵᩻;->᩶:Ll/ۨ᩵᩻;

    .line 419
    new-instance v1, Ll/ۛ᩵᩻;

    sget-object v2, Ll/۟᩵᩻;->ۙ:Ll/۟᩵᩻;

    invoke-direct {v1, p0, v2, p2}, Ll/ۛ᩵᩻;-><init>(Ll/۫֡᩻;Ll/۟᩵᩻;Ll/ۨ᩵᩻;)V

    invoke-virtual {v0, v1}, Ll/ᩴۤܳ;->ۧ(Ljava/lang/Object;)V

    .line 381
    :cond_1
    :try_start_2
    new-instance p2, Ll/ۛ᩵᩻;

    sget-object v0, Ll/۟᩵᩻;->᩹:Ll/۟᩵᩻;

    invoke-direct {p2, p0, v0, p1}, Ll/ۛ᩵᩻;-><init>(Ll/۫֡᩻;Ll/۟᩵᩻;Ll/ۨ᩵᩻;)V

    invoke-static {p2}, Ll/֫֡᩻;->֫(Ll/ۛ᩵᩻;)Ll/ۤ᩵᩻;

    move-result-object p0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    return-object p0

    :catch_2
    move-exception p2

    .line 383
    sget-object v0, Ll/ۨ᩵᩻;->ۙ:Ll/ۨ᩵᩻;

    if-eq p1, v0, :cond_3

    invoke-static {p0, p2}, Ll/֫֡᩻;->֫(Ll/۫֡᩻;Ljava/lang/Exception;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 388
    :try_start_3
    new-instance p1, Ll/ۛ᩵᩻;

    sget-object v0, Ll/۟᩵᩻;->᩶:Ll/۟᩵᩻;

    sget-object v1, Ll/ۨ᩵᩻;->᩶:Ll/ۨ᩵᩻;

    invoke-direct {p1, p0, v0, v1}, Ll/ۛ᩵᩻;-><init>(Ll/۫֡᩻;Ll/۟᩵᩻;Ll/ۨ᩵᩻;)V

    invoke-static {p1}, Ll/֫֡᩻;->֫(Ll/ۛ᩵᩻;)Ll/ۤ᩵᩻;

    move-result-object p0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    return-object p0

    :catch_3
    move-exception p0

    .line 390
    invoke-static {p0, p2}, Ll/֫֡᩻;->֫(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    if-eqz p3, :cond_2

    .line 392
    invoke-static {p0, p3}, Ll/֫֡᩻;->֫(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 394
    :cond_2
    throw p0

    .line 384
    :cond_3
    throw p2
.end method

.method public static ֫(Ll/۫֡᩻;Ll/ۙ֫ۘ;Ll/ۗ֫ۘ;Ll/᩶۫᩷;)Ll/ܰ᩵᩻;
    .locals 1

    .line 641
    new-instance p3, Ll/᩹֫ۘ;

    invoke-direct {p3, p1}, Ll/᩹֫ۘ;-><init>(Ll/ۙ֫ۘ;)V

    .line 643
    :try_start_0
    iget-object p1, p0, Ll/۫֡᩻;->ۧ:Ljava/lang/String;

    iget p0, p0, Ll/۫֡᩻;->ܿ:I

    invoke-virtual {p3, p0, p1}, Ll/᩹֫ۘ;->ۧ(ILjava/lang/String;)Ll/᩻ۧۘ;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    const/4 p1, 0x1

    .line 648
    :try_start_1
    invoke-virtual {p0, p2}, Ll/᩻ۧۘ;->֫(Ll/ۗ֫ۘ;)Ll/ܶܽۘ;

    .line 649
    new-instance p2, Ll/ܰ᩵᩻;

    .line 697
    invoke-virtual {p0}, Ll/᩻ۧۘ;->ۜ()Ll/᩷ۧۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩷ۧۘ;->֫()Ll/᩹ۛۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩹ۛۖ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    .line 698
    invoke-virtual {p0}, Ll/᩻ۧۘ;->᩻()Ll/ۜۧۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۜۧۘ;->ۢ()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 650
    :goto_0
    invoke-direct {p2, v0}, Ll/ܰ᩵᩻;-><init>(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 659
    :try_start_2
    invoke-virtual {p0, p1}, Ll/᩻ۧۘ;->֫(Z)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    .line 665
    invoke-static {p3}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 666
    throw p0

    .line 665
    :catch_0
    :goto_1
    invoke-static {p3}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-object p2

    :catchall_1
    move-exception p2

    .line 659
    :try_start_3
    invoke-virtual {p0, p1}, Ll/᩻ۧۘ;->֫(Z)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception p0

    .line 665
    :try_start_4
    invoke-static {p3}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 666
    throw p0

    .line 665
    :catch_1
    :goto_2
    invoke-static {p3}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception p0

    .line 631
    invoke-virtual {p2, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p2

    :catch_2
    move-exception p0

    .line 670
    invoke-static {p3}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 671
    throw p0
.end method

.method public static ֫(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 0

    if-eq p0, p1, :cond_0

    .line 754
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ۤ᩵᩻;)V
    .locals 2

    .line 690
    :try_start_0
    sget-object v0, Ll/֫֡᩻;->ۧ:Ll/ᩴۤܳ;

    invoke-static {p0}, Ll/ۤ᩵᩻;->֫(Ll/ۤ᩵᩻;)Ll/ۛ᩵᩻;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Ll/ᩴۤܳ;->֫(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static ֫(Ll/۫֡᩻;Ll/ۗ֫ۘ;Ll/۟᩵᩻;Ll/ۨ᩵᩻;Ll/᩻ܶ᩷;)V
    .locals 4

    .line 459
    new-instance v0, Ll/᩹֫ۘ;

    const/4 v1, 0x0

    invoke-static {v1, p2, p3}, Ll/֫֡᩻;->֫(ZLl/۟᩵᩻;Ll/ۨ᩵᩻;)Ll/ۙ֫ۘ;

    move-result-object p3

    invoke-direct {v0, p3}, Ll/᩹֫ۘ;-><init>(Ll/ۙ֫ۘ;)V

    const/4 p3, 0x1

    const/4 v2, 0x0

    .line 462
    :try_start_0
    iget-object v3, p0, Ll/۫֡᩻;->ۧ:Ljava/lang/String;

    iget p0, p0, Ll/۫֡᩻;->ܿ:I

    invoke-virtual {v0, p0, v3}, Ll/᩹֫ۘ;->ۧ(ILjava/lang/String;)Ll/᩻ۧۘ;

    move-result-object v2

    .line 705
    sget-object p0, Ll/۟᩵᩻;->ۙ:Ll/۟᩵᩻;

    if-ne p2, p0, :cond_0

    const/4 v1, 0x1

    :cond_0
    if-eqz v1, :cond_2

    .line 464
    invoke-virtual {v2}, Ll/᩻ۧۘ;->᩻()Ll/ۜۧۘ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ۜۧۘ;->ۢ()Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    .line 465
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string p1, "SMB server requires signing"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 467
    :cond_2
    :goto_0
    invoke-virtual {v2, p1}, Ll/᩻ۧۘ;->֫(Ll/ۗ֫ۘ;)Ll/ܶܽۘ;

    move-result-object p0

    iget-object p1, p4, Ll/᩻ܶ᩷;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/۫֡᩻;

    .line 374
    new-instance p2, Ll/ۗۚۘ;

    sget-object p4, Ll/ۖ֨ۘ;->ۤ:Ll/ۖ֨ۘ;

    invoke-virtual {p4, p0}, Ll/ۖ֨ۘ;->֫(Ll/ܶܽۘ;)Ll/ۢ֨ۘ;

    move-result-object p0

    invoke-direct {p2, p0}, Ll/ۗۚۘ;-><init>(Ll/ۢ֨ۘ;)V

    iget-object p0, p1, Ll/۫֡᩻;->ۧ:Ljava/lang/String;

    invoke-virtual {p2, p0}, Ll/ۗۚۘ;->֫(Ljava/lang/String;)Ljava/util/ArrayList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 471
    :try_start_1
    invoke-virtual {v2, p3}, Ll/᩻ۧۘ;->֫(Z)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 478
    :catch_0
    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-void

    :catchall_0
    move-exception p0

    if-eqz v2, :cond_3

    .line 471
    :try_start_2
    invoke-virtual {v2, p3}, Ll/᩻ۧۘ;->֫(Z)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 478
    :catch_1
    :cond_3
    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 479
    throw p0
.end method

.method public static ֫(Ll/۫֡᩻;Ll/ۗ֫ۘ;Ll/ۨ᩵᩻;Ll/᩻ܶ᩷;)V
    .locals 2

    .line 443
    :try_start_0
    sget-object v0, Ll/۟᩵᩻;->᩹:Ll/۟᩵᩻;

    invoke-static {p0, p1, v0, p2, p3}, Ll/֫֡᩻;->֫(Ll/۫֡᩻;Ll/ۗ֫ۘ;Ll/۟᩵᩻;Ll/ۨ᩵᩻;Ll/᩻ܶ᩷;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 445
    sget-object v1, Ll/ۨ᩵᩻;->ۙ:Ll/ۨ᩵᩻;

    if-eq p2, v1, :cond_0

    invoke-static {p0, v0}, Ll/֫֡᩻;->֫(Ll/۫֡᩻;Ljava/lang/Exception;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 449
    :try_start_1
    sget-object p2, Ll/۟᩵᩻;->᩶:Ll/۟᩵᩻;

    sget-object v1, Ll/ۨ᩵᩻;->᩶:Ll/ۨ᩵᩻;

    invoke-static {p0, p1, p2, v1, p3}, Ll/֫֡᩻;->֫(Ll/۫֡᩻;Ll/ۗ֫ۘ;Ll/۟᩵᩻;Ll/ۨ᩵᩻;Ll/᩻ܶ᩷;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception p0

    .line 451
    invoke-static {p0, v0}, Ll/֫֡᩻;->֫(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    throw p0

    .line 446
    :cond_0
    throw v0
.end method

.method public static ֫(Ljava/lang/Throwable;Ljava/util/Set;)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p0, :cond_4

    .line 735
    invoke-interface {p1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 738
    :cond_0
    instance-of v1, p0, Ll/֨ܽۘ;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    return v2

    .line 741
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getSuppressed()[Ljava/lang/Throwable;

    move-result-object v1

    array-length v3, v1

    :goto_0
    if-ge v0, v3, :cond_3

    aget-object v4, v1, v0

    .line 742
    invoke-static {v4, p1}, Ll/֫֡᩻;->֫(Ljava/lang/Throwable;Ljava/util/Set;)Z

    move-result v4

    if-eqz v4, :cond_2

    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 746
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {p0, p1}, Ll/֫֡᩻;->֫(Ljava/lang/Throwable;Ljava/util/Set;)Z

    move-result p0

    return p0

    :cond_4
    :goto_1
    return v0
.end method

.method public static ֫(Ll/۫֡᩻;Ljava/lang/Exception;)Z
    .locals 1

    .line 719
    iget-object v0, p0, Ll/۫֡᩻;->ᩳ:Ljava/lang/String;

    iget-object p0, p0, Ll/۫֡᩻;->ܳ:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 720
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "guest"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 727
    :cond_0
    new-instance p0, Ljava/util/IdentityHashMap;

    invoke-direct {p0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 728
    invoke-static {p0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object p0

    invoke-static {p1, p0}, Ll/֫֡᩻;->֫(Ljava/lang/Throwable;Ljava/util/Set;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ(Ll/ۤ᩵᩻;)V
    .locals 2

    .line 677
    :try_start_0
    sget-object v0, Ll/֫֡᩻;->ۧ:Ll/ᩴۤܳ;

    invoke-static {p0}, Ll/ۤ᩵᩻;->֫(Ll/ۤ᩵᩻;)Ll/ۛ᩵᩻;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Ll/ᩴۤܳ;->ۧ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static ۧ(Ll/۫֡᩻;)V
    .locals 9

    .line 205
    invoke-static {}, Ll/ۨ᩵᩻;->values()[Ll/ۨ᩵᩻;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v3, v0, v2

    .line 206
    invoke-static {}, Ll/۟᩵᩻;->values()[Ll/۟᩵᩻;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_2

    aget-object v7, v4, v6

    .line 712
    sget-object v8, Ll/۟᩵᩻;->᩹:Ll/۟᩵᩻;

    if-eq v7, v8, :cond_0

    sget-object v8, Ll/ۨ᩵᩻;->᩶:Ll/ۨ᩵᩻;

    if-ne v3, v8, :cond_1

    .line 208
    :cond_0
    new-instance v8, Ll/ۛ᩵᩻;

    invoke-direct {v8, p0, v7, v3}, Ll/ۛ᩵᩻;-><init>(Ll/۫֡᩻;Ll/۟᩵᩻;Ll/ۨ᩵᩻;)V

    sget-object v7, Ll/֫֡᩻;->ۧ:Ll/ᩴۤܳ;

    invoke-virtual {v7, v8}, Ll/ᩴۤܳ;->ۧ(Ljava/lang/Object;)V

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static ܽ(Ll/۫֡᩻;)Ll/ۗ֫ۘ;
    .locals 5

    .line 763
    iget-object v0, p0, Ll/۫֡᩻;->ܳ:Ljava/lang/String;

    iget-object v1, p0, Ll/۫֡᩻;->ᩳ:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 32
    new-instance p0, Ll/ۗ֫ۘ;

    const-string v0, ""

    new-array v1, v4, [C

    invoke-direct {p0, v0, v1, v3}, Ll/ۗ֫ۘ;-><init>(Ljava/lang/String;[CLjava/lang/String;)V

    return-object p0

    :cond_0
    const-string v2, "guest"

    .line 765
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 36
    new-instance p0, Ll/ۗ֫ۘ;

    const-string v0, "Guest"

    new-array v1, v4, [C

    invoke-direct {p0, v0, v1, v3}, Ll/ۗ֫ۘ;-><init>(Ljava/lang/String;[CLjava/lang/String;)V

    return-object p0

    .line 768
    :cond_1
    new-instance v2, Ll/ۗ֫ۘ;

    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    iget-object p0, p0, Ll/۫֡᩻;->֫:Ljava/lang/String;

    invoke-direct {v2, v0, v1, p0}, Ll/ۗ֫ۘ;-><init>(Ljava/lang/String;[CLjava/lang/String;)V

    return-object v2
.end method
