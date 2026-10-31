.class public final Ll/ܰ᩺᩵;
.super Ljava/lang/Object;
.source "V4E2"


# static fields
.field public static final ۡ:Ljava/lang/String;

.field public static final ܺ:Ljava/lang/String;


# instance fields
.field public final ֫:I

.field public final ۜ:J

.field public final ۢ:Ll/ۤܰ᩵;

.field public final ۧ:Ll/۬ܰ᩵;

.field public final ܳ:Ljava/lang/String;

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:J

.field public final ᩳ:Ll/ܳ۟᩵;

.field public final ᩷:Ljava/lang/String;

.field public final ᩻:Ll/ۤܰ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 480
    invoke-static {}, Ll/ᩴܽ֡;->ܽ()Ll/ᩴܽ֡;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "OkHttp-Sent-Millis"

    sput-object v0, Ll/ܰ᩺᩵;->ܺ:Ljava/lang/String;

    .line 483
    invoke-static {}, Ll/ᩴܽ֡;->ܽ()Ll/ᩴܽ֡;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "OkHttp-Received-Millis"

    sput-object v0, Ll/ܰ᩺᩵;->ۡ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ll/֨ᩳ֡;)V
    .locals 8

    .line 544
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 546
    :try_start_0
    invoke-static {p1}, Ll/᩻ᩳ֡;->֫(Ll/֨ᩳ֡;)Ll/ۛܽ֡;

    move-result-object v0

    .line 547
    invoke-interface {v0}, Ll/ۛܽ֡;->֡֫()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ܰ᩺᩵;->᩷:Ljava/lang/String;

    .line 548
    invoke-interface {v0}, Ll/ۛܽ֡;->֡֫()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ܰ᩺᩵;->ܳ:Ljava/lang/String;

    .line 549
    new-instance v1, Ll/۫ܰ᩵;

    invoke-direct {v1}, Ll/۫ܰ᩵;-><init>()V

    .line 550
    invoke-static {v0}, Ll/۟᩺᩵;->֫(Ll/ۛܽ֡;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    .line 552
    invoke-interface {v0}, Ll/ۛܽ֡;->֡֫()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ll/۫ܰ᩵;->֫(Ljava/lang/String;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 401
    :cond_0
    new-instance v2, Ll/ۤܰ᩵;

    invoke-direct {v2, v1}, Ll/ۤܰ᩵;-><init>(Ll/۫ܰ᩵;)V

    .line 554
    iput-object v2, p0, Ll/ܰ᩺᩵;->ۢ:Ll/ۤܰ᩵;

    .line 556
    invoke-interface {v0}, Ll/ۛܽ֡;->֡֫()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩹֫֡;->֫(Ljava/lang/String;)Ll/᩹֫֡;

    move-result-object v1

    .line 557
    iget-object v2, v1, Ll/᩹֫֡;->ܽ:Ll/ܳ۟᩵;

    iput-object v2, p0, Ll/ܰ᩺᩵;->ᩳ:Ll/ܳ۟᩵;

    .line 558
    iget v2, v1, Ll/᩹֫֡;->֫:I

    iput v2, p0, Ll/ܰ᩺᩵;->֫:I

    .line 559
    iget-object v1, v1, Ll/᩹֫֡;->ۧ:Ljava/lang/String;

    iput-object v1, p0, Ll/ܰ᩺᩵;->ܽ:Ljava/lang/String;

    .line 560
    new-instance v1, Ll/۫ܰ᩵;

    invoke-direct {v1}, Ll/۫ܰ᩵;-><init>()V

    .line 561
    invoke-static {v0}, Ll/۟᩺᩵;->֫(Ll/ۛܽ֡;)I

    move-result v2

    :goto_1
    if-ge v3, v2, :cond_1

    .line 563
    invoke-interface {v0}, Ll/ۛܽ֡;->֡֫()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ll/۫ܰ᩵;->֫(Ljava/lang/String;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 565
    :cond_1
    sget-object v2, Ll/ܰ᩺᩵;->ܺ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ll/۫ܰ᩵;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 566
    sget-object v4, Ll/ܰ᩺᩵;->ۡ:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ll/۫ܰ᩵;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 567
    invoke-virtual {v1, v2}, Ll/۫ܰ᩵;->ܽ(Ljava/lang/String;)V

    .line 568
    invoke-virtual {v1, v4}, Ll/۫ܰ᩵;->ܽ(Ljava/lang/String;)V

    const-wide/16 v6, 0x0

    if-eqz v3, :cond_2

    .line 570
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    goto :goto_2

    :cond_2
    move-wide v2, v6

    .line 571
    :goto_2
    iput-wide v2, p0, Ll/ܰ᩺᩵;->ۜ:J

    if-eqz v5, :cond_3

    .line 573
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    .line 574
    :cond_3
    iput-wide v6, p0, Ll/ܰ᩺᩵;->ܿ:J

    .line 401
    new-instance v2, Ll/ۤܰ᩵;

    invoke-direct {v2, v1}, Ll/ۤܰ᩵;-><init>(Ll/۫ܰ᩵;)V

    .line 575
    iput-object v2, p0, Ll/ܰ᩺᩵;->᩻:Ll/ۤܰ᩵;

    .line 658
    iget-object v1, p0, Ll/ܰ᩺᩵;->᩷:Ljava/lang/String;

    const-string v2, "https://"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 578
    invoke-interface {v0}, Ll/ۛܽ֡;->֡֫()Ljava/lang/String;

    move-result-object v1

    .line 579
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-gtz v2, :cond_5

    .line 582
    invoke-interface {v0}, Ll/ۛܽ֡;->֡֫()Ljava/lang/String;

    move-result-object v1

    .line 583
    invoke-static {v1}, Ll/᩷ܰ᩵;->֫(Ljava/lang/String;)Ll/᩷ܰ᩵;

    move-result-object v1

    .line 584
    invoke-static {v0}, Ll/ܰ᩺᩵;->֫(Ll/ۛܽ֡;)Ljava/util/List;

    move-result-object v2

    .line 585
    invoke-static {v0}, Ll/ܰ᩺᩵;->֫(Ll/ۛܽ֡;)Ljava/util/List;

    move-result-object v3

    .line 586
    invoke-interface {v0}, Ll/ۛܽ֡;->ۢۧ()Z

    move-result v4

    if-nez v4, :cond_4

    .line 587
    invoke-interface {v0}, Ll/ۛܽ֡;->֡֫()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֨۟᩵;->֫(Ljava/lang/String;)Ll/֨۟᩵;

    move-result-object v0

    goto :goto_3

    .line 588
    :cond_4
    sget-object v0, Ll/֨۟᩵;->᩶:Ll/֨۟᩵;

    .line 589
    :goto_3
    invoke-static {v0, v1, v2, v3}, Ll/۬ܰ᩵;->֫(Ll/֨۟᩵;Ll/᩷ܰ᩵;Ljava/util/List;Ljava/util/List;)Ll/۬ܰ᩵;

    move-result-object v0

    iput-object v0, p0, Ll/ܰ᩺᩵;->ۧ:Ll/۬ܰ᩵;

    goto :goto_4

    .line 580
    :cond_5
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "expected \"\" but was \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\""

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    const/4 v0, 0x0

    .line 591
    iput-object v0, p0, Ll/ܰ᩺᩵;->ۧ:Ll/۬ܰ᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 594
    :goto_4
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    return-void

    :catchall_0
    move-exception v0

    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    throw v0
.end method

.method public constructor <init>(Ll/ᩴ۟᩵;)V
    .locals 9

    .line 598
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    iget-object v0, p1, Ll/ᩴ۟᩵;->ܰ:Ll/ۡ۟᩵;

    .line 49
    iget-object v1, v0, Ll/ۡ۟᩵;->ܳ:Ll/ۨܰ᩵;

    .line 599
    invoke-virtual {v1}, Ll/ۨܰ᩵;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ܰ᩺᩵;->᩷:Ljava/lang/String;

    .line 600
    sget v1, Ll/֨֫֡;->֫:I

    .line 205
    iget-object v1, p1, Ll/ᩴ۟᩵;->ۤ:Ll/ᩴ۟᩵;

    .line 86
    iget-object v1, v1, Ll/ᩴ۟᩵;->ܰ:Ll/ۡ۟᩵;

    .line 57
    iget-object v1, v1, Ll/ۡ۟᩵;->ܽ:Ll/ۤܰ᩵;

    .line 136
    iget-object v2, p1, Ll/ᩴ۟᩵;->۬:Ll/ۤܰ᩵;

    .line 134
    invoke-static {v2}, Ll/֨֫֡;->֫(Ll/ۤܰ᩵;)Ljava/util/Set;

    move-result-object v3

    .line 135
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    new-instance v1, Ll/۫ܰ᩵;

    invoke-direct {v1}, Ll/۫ܰ᩵;-><init>()V

    .line 401
    new-instance v3, Ll/ۤܰ᩵;

    invoke-direct {v3, v1}, Ll/ۤܰ᩵;-><init>(Ll/۫ܰ᩵;)V

    goto :goto_1

    .line 137
    :cond_0
    new-instance v4, Ll/۫ܰ᩵;

    invoke-direct {v4}, Ll/۫ܰ᩵;-><init>()V

    .line 138
    invoke-virtual {v1}, Ll/ۤܰ᩵;->ۧ()I

    move-result v5

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_2

    .line 139
    invoke-virtual {v1, v6}, Ll/ۤܰ᩵;->֫(I)Ljava/lang/String;

    move-result-object v7

    .line 140
    invoke-interface {v3, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 141
    invoke-virtual {v1, v6}, Ll/ۤܰ᩵;->ۧ(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v7, v8}, Ll/۫ܰ᩵;->֫(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 401
    :cond_2
    new-instance v3, Ll/ۤܰ᩵;

    invoke-direct {v3, v4}, Ll/ۤܰ᩵;-><init>(Ll/۫ܰ᩵;)V

    .line 600
    :goto_1
    iput-object v3, p0, Ll/ܰ᩺᩵;->ۢ:Ll/ۤܰ᩵;

    .line 53
    iget-object v0, v0, Ll/ۡ۟᩵;->ᩳ:Ljava/lang/String;

    .line 601
    iput-object v0, p0, Ll/ܰ᩺᩵;->ܳ:Ljava/lang/String;

    .line 93
    iget-object v0, p1, Ll/ᩴ۟᩵;->ۨ:Ll/ܳ۟᩵;

    .line 602
    iput-object v0, p0, Ll/ܰ᩺᩵;->ᩳ:Ll/ܳ۟᩵;

    .line 98
    iget v0, p1, Ll/ᩴ۟᩵;->ۙ:I

    .line 603
    iput v0, p0, Ll/ܰ᩺᩵;->֫:I

    .line 111
    iget-object v0, p1, Ll/ᩴ۟᩵;->۫:Ljava/lang/String;

    .line 604
    iput-object v0, p0, Ll/ܰ᩺᩵;->ܽ:Ljava/lang/String;

    .line 605
    iput-object v2, p0, Ll/ܰ᩺᩵;->᩻:Ll/ۤܰ᩵;

    .line 119
    iget-object v0, p1, Ll/ᩴ۟᩵;->ۗ:Ll/۬ܰ᩵;

    .line 606
    iput-object v0, p0, Ll/ܰ᩺᩵;->ۧ:Ll/۬ܰ᩵;

    .line 265
    iget-wide v0, p1, Ll/ᩴ۟᩵;->۟:J

    .line 607
    iput-wide v0, p0, Ll/ܰ᩺᩵;->ۜ:J

    .line 274
    iget-wide v0, p1, Ll/ᩴ۟᩵;->᩺:J

    .line 608
    iput-wide v0, p0, Ll/ܰ᩺᩵;->ܿ:J

    return-void
.end method

.method public static ֫(Ll/ۛܽ֡;)Ljava/util/List;
    .locals 6

    .line 662
    invoke-static {p0}, Ll/۟᩺᩵;->֫(Ll/ۛܽ֡;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 663
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p0

    :cond_0
    :try_start_0
    const-string v1, "X.509"

    .line 666
    invoke-static {v1}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v1

    .line 667
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_1

    .line 669
    invoke-interface {p0}, Ll/ۛܽ֡;->֡֫()Ljava/lang/String;

    move-result-object v4

    .line 670
    new-instance v5, Ll/۫ܽ֡;

    invoke-direct {v5}, Ll/۫ܽ֡;-><init>()V

    .line 671
    invoke-static {v4}, Ll/ۨܽ֡;->֫(Ljava/lang/String;)Ll/ۨܽ֡;

    move-result-object v4

    invoke-virtual {v5, v4}, Ll/۫ܽ֡;->֫(Ll/ۨܽ֡;)V

    .line 672
    invoke-virtual {v5}, Ll/۫ܽ֡;->ۡܽ()Ljava/io/InputStream;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v2

    :catch_0
    move-exception p0

    .line 676
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ll/ۤܽ֡;Ljava/util/List;)V
    .locals 4

    .line 683
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v0, v0

    invoke-interface {p0, v0, v1}, Ll/ۤܽ֡;->ܳ(J)Ll/ۤܽ֡;

    const/16 v0, 0xa

    .line 684
    invoke-interface {p0, v0}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    .line 685
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 686
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/security/cert/Certificate;

    invoke-virtual {v3}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v3

    .line 687
    invoke-static {v3}, Ll/ۨܽ֡;->֫([B)Ll/ۨܽ֡;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۨܽ֡;->֫()Ljava/lang/String;

    move-result-object v3

    .line 688
    invoke-interface {p0, v3}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    .line 689
    invoke-interface {p0, v0}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;
    :try_end_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void

    :catch_0
    move-exception p0

    .line 692
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫(Ll/֫֫֡;)Ll/ᩴ۟᩵;
    .locals 6

    const-string v0, "Content-Type"

    .line 703
    iget-object v1, p0, Ll/ܰ᩺᩵;->᩻:Ll/ۤܰ᩵;

    invoke-virtual {v1, v0}, Ll/ۤܰ᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "Content-Length"

    .line 704
    invoke-virtual {v1, v2}, Ll/ۤܰ᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 705
    new-instance v3, Ll/ۢ۟᩵;

    invoke-direct {v3}, Ll/ۢ۟᩵;-><init>()V

    iget-object v4, p0, Ll/ܰ᩺᩵;->᩷:Ljava/lang/String;

    .line 706
    invoke-virtual {v3, v4}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;)V

    iget-object v4, p0, Ll/ܰ᩺᩵;->ܳ:Ljava/lang/String;

    const/4 v5, 0x0

    .line 707
    invoke-virtual {v3, v4, v5}, Ll/ۢ۟᩵;->֫(Ljava/lang/String;Ll/ۖ۟᩵;)V

    iget-object v4, p0, Ll/ܰ᩺᩵;->ۢ:Ll/ۤܰ᩵;

    .line 208
    invoke-virtual {v4}, Ll/ۤܰ᩵;->֫()Ll/۫ܰ᩵;

    move-result-object v4

    iput-object v4, v3, Ll/ۢ۟᩵;->ۧ:Ll/۫ܰ᩵;

    .line 709
    invoke-virtual {v3}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object v3

    .line 710
    new-instance v4, Ll/ۘ۟᩵;

    invoke-direct {v4}, Ll/ۘ۟᩵;-><init>()V

    .line 337
    iput-object v3, v4, Ll/ۘ۟᩵;->ۡ:Ll/ۡ۟᩵;

    .line 711
    iget-object v3, p0, Ll/ܰ᩺᩵;->ᩳ:Ll/ܳ۟᩵;

    .line 342
    iput-object v3, v4, Ll/ۘ۟᩵;->᩷:Ll/ܳ۟᩵;

    .line 712
    iget v3, p0, Ll/ܰ᩺᩵;->֫:I

    .line 347
    iput v3, v4, Ll/ۘ۟᩵;->ܽ:I

    .line 713
    iget-object v3, p0, Ll/ܰ᩺᩵;->ܽ:Ljava/lang/String;

    .line 352
    iput-object v3, v4, Ll/ۘ۟᩵;->ܳ:Ljava/lang/String;

    .line 386
    invoke-virtual {v1}, Ll/ۤܰ᩵;->֫()Ll/۫ܰ᩵;

    move-result-object v1

    iput-object v1, v4, Ll/ۘ۟᩵;->ܿ:Ll/۫ܰ᩵;

    .line 715
    new-instance v1, Ll/᩺᩺᩵;

    invoke-direct {v1, p1, v0, v2}, Ll/᩺᩺᩵;-><init>(Ll/֫֫֡;Ljava/lang/String;Ljava/lang/String;)V

    .line 391
    iput-object v1, v4, Ll/ۘ۟᩵;->֫:Ll/֡۟᩵;

    .line 716
    iget-object p1, p0, Ll/ܰ᩺᩵;->ۧ:Ll/۬ܰ᩵;

    .line 357
    iput-object p1, v4, Ll/ۘ۟᩵;->ᩳ:Ll/۬ܰ᩵;

    .line 717
    iget-wide v0, p0, Ll/ܰ᩺᩵;->ۜ:J

    .line 432
    iput-wide v0, v4, Ll/ۘ۟᩵;->ܺ:J

    .line 718
    iget-wide v0, p0, Ll/ܰ᩺᩵;->ܿ:J

    .line 437
    iput-wide v0, v4, Ll/ۘ۟᩵;->ۢ:J

    .line 720
    invoke-virtual {v4}, Ll/ۘ۟᩵;->֫()Ll/ᩴ۟᩵;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܰ۟᩵;)V
    .locals 8

    const/4 v0, 0x0

    .line 612
    invoke-virtual {p1, v0}, Ll/ܰ۟᩵;->֫(I)Ll/ۚᩳ֡;

    move-result-object p1

    invoke-static {p1}, Ll/᩻ᩳ֡;->֫(Ll/ۚᩳ֡;)Ll/ۤܽ֡;

    move-result-object p1

    .line 614
    iget-object v1, p0, Ll/ܰ᩺᩵;->᩷:Ljava/lang/String;

    invoke-interface {p1, v1}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    const/16 v2, 0xa

    .line 615
    invoke-interface {p1, v2}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    .line 616
    iget-object v3, p0, Ll/ܰ᩺᩵;->ܳ:Ljava/lang/String;

    invoke-interface {p1, v3}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    .line 617
    invoke-interface {p1, v2}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    .line 618
    iget-object v3, p0, Ll/ܰ᩺᩵;->ۢ:Ll/ۤܰ᩵;

    invoke-virtual {v3}, Ll/ۤܰ᩵;->ۧ()I

    move-result v4

    int-to-long v4, v4

    invoke-interface {p1, v4, v5}, Ll/ۤܽ֡;->ܳ(J)Ll/ۤܽ֡;

    .line 619
    invoke-interface {p1, v2}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    .line 620
    invoke-virtual {v3}, Ll/ۤܰ᩵;->ۧ()I

    move-result v4

    const/4 v5, 0x0

    :goto_0
    const-string v6, ": "

    if-ge v5, v4, :cond_0

    .line 621
    invoke-virtual {v3, v5}, Ll/ۤܰ᩵;->֫(I)Ljava/lang/String;

    move-result-object v7

    invoke-interface {p1, v7}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    .line 622
    invoke-interface {p1, v6}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    .line 623
    invoke-virtual {v3, v5}, Ll/ۤܰ᩵;->ۧ(I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {p1, v6}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    .line 624
    invoke-interface {p1, v2}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 97
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    sget-object v4, Ll/ܳ۟᩵;->ۙ:Ll/ܳ۟᩵;

    iget-object v5, p0, Ll/ܰ᩺᩵;->ᩳ:Ll/ܳ۟᩵;

    if-ne v5, v4, :cond_1

    const-string v4, "HTTP/1.0"

    goto :goto_1

    :cond_1
    const-string v4, "HTTP/1.1"

    :goto_1
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x20

    .line 99
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v5, p0, Ll/ܰ᩺᩵;->֫:I

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 100
    iget-object v5, p0, Ll/ܰ᩺᩵;->ܽ:Ljava/lang/String;

    if-eqz v5, :cond_2

    .line 101
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    :cond_2
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 627
    invoke-interface {p1, v3}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    .line 628
    invoke-interface {p1, v2}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    .line 629
    iget-object v3, p0, Ll/ܰ᩺᩵;->᩻:Ll/ۤܰ᩵;

    invoke-virtual {v3}, Ll/ۤܰ᩵;->ۧ()I

    move-result v4

    add-int/lit8 v4, v4, 0x2

    int-to-long v4, v4

    invoke-interface {p1, v4, v5}, Ll/ۤܽ֡;->ܳ(J)Ll/ۤܽ֡;

    .line 630
    invoke-interface {p1, v2}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    .line 631
    invoke-virtual {v3}, Ll/ۤܰ᩵;->ۧ()I

    move-result v4

    :goto_2
    if-ge v0, v4, :cond_3

    .line 632
    invoke-virtual {v3, v0}, Ll/ۤܰ᩵;->֫(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1, v5}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    .line 633
    invoke-interface {p1, v6}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    .line 634
    invoke-virtual {v3, v0}, Ll/ۤܰ᩵;->ۧ(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1, v5}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    .line 635
    invoke-interface {p1, v2}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 637
    :cond_3
    sget-object v0, Ll/ܰ᩺᩵;->ܺ:Ljava/lang/String;

    invoke-interface {p1, v0}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    .line 638
    invoke-interface {p1, v6}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    iget-wide v3, p0, Ll/ܰ᩺᩵;->ۜ:J

    .line 639
    invoke-interface {p1, v3, v4}, Ll/ۤܽ֡;->ܳ(J)Ll/ۤܽ֡;

    .line 640
    invoke-interface {p1, v2}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    .line 641
    sget-object v0, Ll/ܰ᩺᩵;->ۡ:Ljava/lang/String;

    invoke-interface {p1, v0}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    .line 642
    invoke-interface {p1, v6}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    iget-wide v3, p0, Ll/ܰ᩺᩵;->ܿ:J

    .line 643
    invoke-interface {p1, v3, v4}, Ll/ۤܽ֡;->ܳ(J)Ll/ۤܽ֡;

    .line 644
    invoke-interface {p1, v2}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    const-string v0, "https://"

    .line 658
    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 647
    invoke-interface {p1, v2}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    .line 648
    iget-object v0, p0, Ll/ܰ᩺᩵;->ۧ:Ll/۬ܰ᩵;

    invoke-virtual {v0}, Ll/۬ܰ᩵;->֫()Ll/᩷ܰ᩵;

    move-result-object v1

    .line 469
    iget-object v1, v1, Ll/᩷ܰ᩵;->֫:Ljava/lang/String;

    .line 648
    invoke-interface {p1, v1}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    .line 649
    invoke-interface {p1, v2}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    .line 650
    invoke-virtual {v0}, Ll/۬ܰ᩵;->ܽ()Ljava/util/List;

    move-result-object v1

    invoke-static {p1, v1}, Ll/ܰ᩺᩵;->֫(Ll/ۤܽ֡;Ljava/util/List;)V

    .line 651
    invoke-virtual {v0}, Ll/۬ܰ᩵;->ۧ()Ljava/util/List;

    move-result-object v1

    invoke-static {p1, v1}, Ll/ܰ᩺᩵;->֫(Ll/ۤܽ֡;Ljava/util/List;)V

    .line 652
    invoke-virtual {v0}, Ll/۬ܰ᩵;->ᩳ()Ll/֨۟᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/֨۟᩵;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    invoke-interface {p1, v2}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    .line 654
    :cond_4
    invoke-interface {p1}, Ll/ۚᩳ֡;->close()V

    return-void
.end method

.method public final ֫(Ll/ۡ۟᩵;Ll/ᩴ۟᩵;)Z
    .locals 3

    .line 49
    iget-object v0, p1, Ll/ۡ۟᩵;->ܳ:Ll/ۨܰ᩵;

    .line 697
    invoke-virtual {v0}, Ll/ۨܰ᩵;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ܰ᩺᩵;->᩷:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ܰ᩺᩵;->ܳ:Ljava/lang/String;

    .line 53
    iget-object v1, p1, Ll/ۡ۟᩵;->ᩳ:Ljava/lang/String;

    .line 698
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 699
    sget v0, Ll/֨֫֡;->֫:I

    .line 136
    iget-object p2, p2, Ll/ᩴ۟᩵;->۬:Ll/ۤܰ᩵;

    .line 94
    invoke-static {p2}, Ll/֨֫֡;->֫(Ll/ۤܰ᩵;)Ljava/util/Set;

    move-result-object p2

    .line 73
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 74
    iget-object v1, p0, Ll/ܰ᩺᩵;->ۢ:Ll/ۤܰ᩵;

    invoke-virtual {v1, v0}, Ll/ۤܰ᩵;->ۧ(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 65
    iget-object v2, p1, Ll/ۡ۟᩵;->ܽ:Ll/ۤܰ᩵;

    invoke-virtual {v2, v0}, Ll/ۤܰ᩵;->ۧ(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 74
    invoke-static {v1, v0}, Ll/᩶۟᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
