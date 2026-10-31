.class public final Ll/ۧۛ֫;
.super Ljava/lang/Object;
.source "58TM"

# interfaces
.implements Ll/֡ۛ֫;


# instance fields
.field public final ֡:Ll/ۨۤ֫;

.field public ֨:Landroid/os/HandlerThread;

.field public final ֫:Ll/᩻ۨ֫;

.field public final ۖ:Landroid/os/Looper;

.field public final ۘ:Ll/ܰ۬֫;

.field public ۚ:Ll/᩺ۤ֫;

.field public ۜ:Ll/᩵ۛ֫;

.field public final ۠:Ll/۟ۤ֫;

.field public ۡ:[B

.field public final ۢ:Ll/۟ۛ֫;

.field public ۧ:Ll/ᩴ᩸֫;

.field public final ܳ:Z

.field public final ܶ:Ljava/util/List;

.field public final ܺ:Z

.field public ܽ:Ll/ۛۛ֫;

.field public final ܿ:Ll/ۜۚ֫;

.field public ᩳ:Ll/ܰۛ֫;

.field public final ᩴ:Ll/ۛۤ֫;

.field public ᩵:I

.field public final ᩶:Ljava/util/UUID;

.field public final ᩷:Ll/ۧܳۧ;

.field public ᩸:[B

.field public ᩹:I

.field public final ᩻:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ljava/util/UUID;Ll/۟ۛ֫;Ll/ۛۤ֫;Ll/ۨۤ֫;Ljava/util/List;ZZ[BLjava/util/HashMap;Ll/ܿۨ֫;Landroid/os/Looper;Ll/ۧܳۧ;Ll/ܰ۬֫;)V
    .locals 0

    .line 187
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 192
    iput-object p1, p0, Ll/ۧۛ֫;->᩶:Ljava/util/UUID;

    .line 193
    iput-object p3, p0, Ll/ۧۛ֫;->ᩴ:Ll/ۛۤ֫;

    .line 194
    iput-object p4, p0, Ll/ۧۛ֫;->֡:Ll/ۨۤ֫;

    .line 195
    iput-object p2, p0, Ll/ۧۛ֫;->ۢ:Ll/۟ۛ֫;

    .line 197
    iput-boolean p6, p0, Ll/ۧۛ֫;->ܺ:Z

    .line 198
    iput-boolean p7, p0, Ll/ۧۛ֫;->ܳ:Z

    if-eqz p8, :cond_0

    .line 200
    iput-object p8, p0, Ll/ۧۛ֫;->ۡ:[B

    const/4 p1, 0x0

    .line 201
    iput-object p1, p0, Ll/ۧۛ֫;->ܶ:Ljava/util/List;

    goto :goto_0

    .line 155
    :cond_0
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    invoke-static {p5}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۧۛ֫;->ܶ:Ljava/util/List;

    .line 205
    :goto_0
    iput-object p9, p0, Ll/ۧۛ֫;->᩻:Ljava/util/HashMap;

    .line 206
    iput-object p10, p0, Ll/ۧۛ֫;->֫:Ll/᩻ۨ֫;

    .line 207
    new-instance p1, Ll/ۜۚ֫;

    invoke-direct {p1}, Ll/ۜۚ֫;-><init>()V

    iput-object p1, p0, Ll/ۧۛ֫;->ܿ:Ll/ۜۚ֫;

    .line 208
    iput-object p12, p0, Ll/ۧۛ֫;->᩷:Ll/ۧܳۧ;

    .line 209
    iput-object p13, p0, Ll/ۧۛ֫;->ۘ:Ll/ܰ۬֫;

    const/4 p1, 0x2

    .line 210
    iput p1, p0, Ll/ۧۛ֫;->᩹:I

    .line 211
    iput-object p11, p0, Ll/ۧۛ֫;->ۖ:Landroid/os/Looper;

    .line 212
    new-instance p1, Ll/۟ۤ֫;

    invoke-direct {p1, p0, p11}, Ll/۟ۤ֫;-><init>(Ll/ۧۛ֫;Landroid/os/Looper;)V

    iput-object p1, p0, Ll/ۧۛ֫;->۠:Ll/۟ۤ֫;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۧۛ֫;)Ll/᩻ۨ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۧۛ֫;->֫:Ll/᩻ۨ֫;

    return-object p0
.end method

.method private ֫(ILjava/lang/Throwable;)V
    .locals 4

    .line 566
    new-instance v0, Ll/᩵ۛ֫;

    .line 89
    instance-of v1, p2, Landroid/media/MediaDrm$MediaDrmStateException;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 91
    move-object p1, p2

    check-cast p1, Landroid/media/MediaDrm$MediaDrmStateException;

    invoke-virtual {p1}, Landroid/media/MediaDrm$MediaDrmStateException;->getDiagnosticInfo()Ljava/lang/String;

    move-result-object p1

    .line 92
    invoke-static {p1}, Ll/ۘ֨֫;->֫(Ljava/lang/String;)I

    move-result p1

    .line 93
    invoke-static {p1}, Ll/ۘ֨֫;->ᩳ(I)I

    move-result p1

    goto :goto_2

    .line 94
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-lt v1, v3, :cond_1

    invoke-static {p2}, Ll/ۗۛ֫;->֫(Ljava/lang/Throwable;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 96
    :cond_1
    instance-of v1, p2, Landroid/media/NotProvisionedException;

    if-nez v1, :cond_a

    .line 97
    invoke-static {p2}, Ll/۬ۛ֫;->֫(Ljava/lang/Throwable;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    .line 99
    :cond_2
    instance-of v1, p2, Landroid/media/DeniedByServerException;

    if-eqz v1, :cond_3

    const/16 p1, 0x1777

    goto :goto_2

    .line 101
    :cond_3
    instance-of v1, p2, Ll/᩷ۨ֫;

    if-eqz v1, :cond_4

    const/16 p1, 0x1771

    goto :goto_2

    .line 103
    :cond_4
    instance-of v1, p2, Ll/ܳۛ֫;

    if-eqz v1, :cond_5

    const/16 p1, 0x1773

    goto :goto_2

    .line 105
    :cond_5
    instance-of v1, p2, Ll/ܳۨ֫;

    if-eqz v1, :cond_6

    const/16 p1, 0x1778

    goto :goto_2

    :cond_6
    if-ne p1, v2, :cond_7

    :goto_0
    const/16 p1, 0x1776

    goto :goto_2

    :cond_7
    const/4 v1, 0x2

    if-ne p1, v1, :cond_8

    const/16 p1, 0x1774

    goto :goto_2

    :cond_8
    const/4 v1, 0x3

    if-ne p1, v1, :cond_9

    goto :goto_1

    .line 117
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_a
    :goto_1
    const/16 p1, 0x1772

    .line 567
    :goto_2
    invoke-direct {v0, p1, p2}, Ll/᩵ۛ֫;-><init>(ILjava/lang/Throwable;)V

    iput-object v0, p0, Ll/ۧۛ֫;->ۜ:Ll/᩵ۛ֫;

    const-string p1, "DRM session error"

    .line 568
    invoke-static {p1, p2}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 569
    instance-of p1, p2, Ljava/lang/Exception;

    if-eqz p1, :cond_b

    .line 592
    iget-object p1, p0, Ll/ۧۛ֫;->ܿ:Ll/ۜۚ֫;

    invoke-virtual {p1}, Ll/ۜۚ֫;->ۧۧ()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶۛ֫;

    .line 570
    move-object v1, p2

    check-cast v1, Ljava/lang/Exception;

    invoke-virtual {v0, v1}, Ll/ܶۛ֫;->֫(Ljava/lang/Exception;)V

    goto :goto_3

    .line 571
    :cond_b
    instance-of p1, p2, Ljava/lang/Error;

    if-eqz p1, :cond_f

    .line 573
    invoke-static {p2}, Ll/۬ۛ֫;->ۧ(Ljava/lang/Throwable;)Z

    move-result p1

    if-nez p1, :cond_d

    .line 574
    invoke-static {p2}, Ll/۬ۛ֫;->֫(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_c

    goto :goto_4

    .line 575
    :cond_c
    check-cast p2, Ljava/lang/Error;

    throw p2

    .line 580
    :cond_d
    :goto_4
    iget p1, p0, Ll/ۧۛ֫;->᩹:I

    const/4 p2, 0x4

    if-eq p1, p2, :cond_e

    .line 581
    iput v2, p0, Ll/ۧۛ֫;->᩹:I

    :cond_e
    return-void

    .line 578
    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Unexpected Throwable subclass"

    invoke-direct {p1, v0, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method private ֫(Ljava/lang/Throwable;Z)V
    .locals 1

    .line 550
    instance-of v0, p1, Landroid/media/NotProvisionedException;

    if-nez v0, :cond_2

    .line 551
    invoke-static {p1}, Ll/۬ۛ֫;->֫(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x2

    .line 554
    :goto_0
    invoke-direct {p0, p2, p1}, Ll/ۧۛ֫;->֫(ILjava/lang/Throwable;)V

    return-void

    .line 552
    :cond_2
    :goto_1
    iget-object p1, p0, Ll/ۧۛ֫;->ᩴ:Ll/ۛۤ֫;

    check-cast p1, Ll/ۢۛ֫;

    invoke-virtual {p1, p0}, Ll/ۢۛ֫;->ۧ(Ll/ۧۛ֫;)V

    return-void
.end method

.method public static ֫(Ll/ۧۛ֫;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 506
    iget-object v0, p0, Ll/ۧۛ֫;->ܿ:Ll/ۜۚ֫;

    iget-object v1, p0, Ll/ۧۛ֫;->ۢ:Ll/۟ۛ֫;

    iget-object v2, p0, Ll/ۧۛ֫;->ܽ:Ll/ۛۛ֫;

    if-ne p1, v2, :cond_4

    invoke-direct {p0}, Ll/ۧۛ֫;->ܳ()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_3

    :cond_0
    const/4 p1, 0x0

    .line 510
    iput-object p1, p0, Ll/ۧۛ֫;->ܽ:Ll/ۛۛ֫;

    .line 512
    instance-of p1, p2, Ljava/lang/Exception;

    if-nez p1, :cond_3

    instance-of p1, p2, Ljava/lang/NoSuchMethodError;

    if-eqz p1, :cond_1

    goto :goto_2

    .line 518
    :cond_1
    :try_start_0
    check-cast p2, [B

    .line 523
    iget-object p1, p0, Ll/ۧۛ֫;->᩸:[B

    invoke-interface {v1, p1, p2}, Ll/۟ۛ֫;->ۧ([B[B)[B

    move-result-object p1

    .line 524
    iget-object p2, p0, Ll/ۧۛ֫;->ۡ:[B

    if-eqz p2, :cond_2

    if-eqz p1, :cond_2

    array-length p2, p1

    if-eqz p2, :cond_2

    .line 529
    iput-object p1, p0, Ll/ۧۛ֫;->ۡ:[B

    :cond_2
    const/4 p1, 0x4

    .line 531
    iput p1, p0, Ll/ۧۛ֫;->᩹:I

    .line 592
    invoke-virtual {v0}, Ll/ۜۚ֫;->ۧۧ()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܶۛ֫;

    .line 593
    invoke-virtual {p2}, Ll/ܶۛ֫;->֫()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    :goto_1
    const/4 p2, 0x1

    .line 535
    invoke-direct {p0, p1, p2}, Ll/ۧۛ֫;->֫(Ljava/lang/Throwable;Z)V

    return-void

    .line 513
    :cond_3
    :goto_2
    check-cast p2, Ljava/lang/Throwable;

    const/4 p1, 0x0

    invoke-direct {p0, p2, p1}, Ll/ۧۛ֫;->֫(Ljava/lang/Throwable;Z)V

    :cond_4
    :goto_3
    return-void
.end method

.method private ֫(Z)V
    .locals 9
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "sessionId"
        }
    .end annotation

    .line 433
    iget-boolean v0, p0, Ll/ۧۛ֫;->ܳ:Z

    if-eqz v0, :cond_0

    goto/16 :goto_7

    .line 436
    :cond_0
    iget-object v0, p0, Ll/ۧۛ֫;->᩸:[B

    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 440
    iget-object v1, p0, Ll/ۧۛ֫;->ۡ:[B

    const/4 v2, 0x1

    if-nez v1, :cond_1

    .line 441
    invoke-direct {p0, v0, v2, p1}, Ll/ۧۛ֫;->֫([BIZ)V

    return-void

    .line 442
    :cond_1
    iget v1, p0, Ll/ۧۛ֫;->᩹:I

    iget-object v3, p0, Ll/ۧۛ֫;->ۢ:Ll/۟ۛ֫;

    const/4 v4, 0x4

    if-eq v1, v4, :cond_2

    .line 478
    :try_start_0
    iget-object v1, p0, Ll/ۧۛ֫;->᩸:[B

    iget-object v5, p0, Ll/ۧۛ֫;->ۡ:[B

    invoke-interface {v3, v1, v5}, Ll/۟ۛ֫;->֫([B[B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    .line 481
    :goto_0
    invoke-direct {p0, v2, v1}, Ll/ۧۛ֫;->֫(ILjava/lang/Throwable;)V

    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_a

    .line 487
    :cond_2
    sget-object v1, Ll/᩻ᩴ֫;->ܿ:Ljava/util/UUID;

    iget-object v2, p0, Ll/ۧۛ֫;->᩶:Ljava/util/UUID;

    invoke-virtual {v1, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-wide v1, 0x7fffffffffffffffL

    goto :goto_5

    .line 292
    :cond_3
    invoke-direct {p0}, Ll/ۧۛ֫;->ۜ()V

    .line 293
    iget-object v1, p0, Ll/ۧۛ֫;->᩸:[B

    const/4 v2, 0x0

    if-nez v1, :cond_4

    move-object v1, v2

    goto :goto_2

    :cond_4
    invoke-interface {v3, v1}, Ll/۟ۛ֫;->֫([B)Ljava/util/Map;

    move-result-object v1

    :goto_2
    if-nez v1, :cond_5

    goto :goto_4

    .line 49
    :cond_5
    new-instance v2, Landroid/util/Pair;

    const-string v3, "LicenseDurationRemaining"

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 57
    :try_start_1
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_6

    .line 59
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_3

    :catch_2
    :cond_6
    move-wide v7, v5

    .line 50
    :goto_3
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v7, "PlaybackDurationRemaining"

    .line 57
    :try_start_2
    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_7

    .line 59
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_3

    .line 51
    :catch_3
    :cond_7
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 155
    :goto_4
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 492
    iget-object v1, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iget-object v1, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v5, v6, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    :goto_5
    const-wide/16 v5, 0x3c

    const/4 v3, 0x2

    cmp-long v7, v1, v5

    if-gtz v7, :cond_8

    .line 446
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Offline license has expired or will expire soon. Remaining seconds: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶ۚ֫;->֫(Ljava/lang/String;)V

    .line 451
    invoke-direct {p0, v0, v3, p1}, Ll/ۧۛ֫;->֫([BIZ)V

    return-void

    :cond_8
    const-wide/16 v5, 0x0

    cmp-long p1, v1, v5

    if-gtz p1, :cond_9

    .line 453
    new-instance p1, Ll/ܳۨ֫;

    .line 22
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 453
    invoke-direct {p0, v3, p1}, Ll/ۧۛ֫;->֫(ILjava/lang/Throwable;)V

    return-void

    .line 455
    :cond_9
    iput v4, p0, Ll/ۧۛ֫;->᩹:I

    .line 592
    iget-object p1, p0, Ll/ۧۛ֫;->ܿ:Ll/ۜۚ֫;

    invoke-virtual {p1}, Ll/ۜۚ֫;->ۧۧ()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶۛ֫;

    .line 593
    invoke-virtual {v0}, Ll/ܶۛ֫;->ۧ()V

    goto :goto_6

    :cond_a
    :goto_7
    return-void
.end method

.method private ֫([BIZ)V
    .locals 10

    .line 497
    :try_start_0
    iget-object v0, p0, Ll/ۧۛ֫;->ۢ:Ll/۟ۛ֫;

    iget-object v1, p0, Ll/ۧۛ֫;->ܶ:Ljava/util/List;

    iget-object v2, p0, Ll/ۧۛ֫;->᩻:Ljava/util/HashMap;

    invoke-interface {v0, p1, v1, p2, v2}, Ll/۟ۛ֫;->֫([BLjava/util/List;ILjava/util/HashMap;)Ll/ۛۛ֫;

    move-result-object v9

    iput-object v9, p0, Ll/ۧۛ֫;->ܽ:Ll/ۛۛ֫;

    .line 498
    iget-object p1, p0, Ll/ۧۛ֫;->ۚ:Ll/᩺ۤ֫;

    sget-object p2, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 155
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 499
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 648
    new-instance p2, Ll/ܰۤ֫;

    .line 650
    invoke-static {}, Ll/ۧۧۧ;->֫()J

    move-result-wide v4

    .line 652
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v7

    move-object v3, p2

    move v6, p3

    invoke-direct/range {v3 .. v9}, Ll/ܰۤ֫;-><init>(JZJLjava/lang/Object;)V

    const/4 p3, 0x2

    .line 654
    invoke-virtual {p1, p3, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    const/4 p2, 0x1

    .line 501
    invoke-direct {p0, p1, p2}, Ll/ۧۛ֫;->֫(Ljava/lang/Throwable;Z)V

    return-void
.end method

.method private ۜ()V
    .locals 3

    .line 598
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Ll/ۧۛ֫;->ۖ:Landroid/os/Looper;

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v2

    if-eq v0, v2, :cond_0

    .line 599
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 602
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\nExpected thread: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 604
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 599
    invoke-static {v0, v1}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۧۛ֫;)Ll/ۧܳۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۧۛ֫;->᩷:Ll/ۧܳۧ;

    return-object p0
.end method

.method public static ۧ(Ll/ۧۛ֫;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 410
    iget-object v0, p0, Ll/ۧۛ֫;->ᩴ:Ll/ۛۤ֫;

    iget-object v1, p0, Ll/ۧۛ֫;->ᩳ:Ll/ܰۛ֫;

    if-ne p1, v1, :cond_2

    iget p1, p0, Ll/ۧۛ֫;->᩹:I

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    invoke-direct {p0}, Ll/ۧۛ֫;->ܳ()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 414
    iput-object p1, p0, Ll/ۧۛ֫;->ᩳ:Ll/ܰۛ֫;

    .line 416
    instance-of p1, p2, Ljava/lang/Exception;

    if-eqz p1, :cond_1

    .line 417
    check-cast p2, Ljava/lang/Exception;

    const/4 p0, 0x0

    check-cast v0, Ll/ۢۛ֫;

    invoke-virtual {v0, p2, p0}, Ll/ۢۛ֫;->֫(Ljava/lang/Exception;Z)V

    return-void

    .line 422
    :cond_1
    :try_start_0
    iget-object p0, p0, Ll/ۧۛ֫;->ۢ:Ll/۟ۛ֫;

    check-cast p2, [B

    invoke-interface {p0, p2}, Ll/۟ۛ֫;->ۧ([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 428
    check-cast v0, Ll/ۢۛ֫;

    invoke-virtual {v0}, Ll/ۢۛ֫;->֫()V

    return-void

    :catch_0
    move-exception p0

    const/4 p1, 0x1

    .line 424
    check-cast v0, Ll/ۢۛ֫;

    invoke-virtual {v0, p0, p1}, Ll/ۢۛ֫;->֫(Ljava/lang/Exception;Z)V

    :cond_2
    :goto_0
    return-void
.end method

.method private ܳ()Z
    .locals 2
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNullIf;
        expression = {
            "sessionId"
        }
        result = true
    .end annotation

    .line 588
    iget v0, p0, Ll/ۧۛ֫;->᩹:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public static bridge synthetic ܽ(Ll/ۧۛ֫;)Ll/۟ۤ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۧۛ֫;->۠:Ll/۟ۤ֫;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۧۛ֫;)Ljava/util/UUID;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۧۛ֫;->᩶:Ljava/util/UUID;

    return-object p0
.end method

.method private ᩻()Z
    .locals 5
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNullIf;
        expression = {
            "sessionId"
        }
        result = true
    .end annotation

    .line 380
    iget-object v0, p0, Ll/ۧۛ֫;->ᩴ:Ll/ۛۤ֫;

    iget-object v1, p0, Ll/ۧۛ֫;->ۢ:Ll/۟ۛ֫;

    invoke-direct {p0}, Ll/ۧۛ֫;->ܳ()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    return v3

    .line 386
    :cond_0
    :try_start_0
    invoke-interface {v1}, Ll/۟ۛ֫;->ܽ()[B

    move-result-object v2

    iput-object v2, p0, Ll/ۧۛ֫;->᩸:[B

    .line 387
    iget-object v4, p0, Ll/ۧۛ֫;->ۘ:Ll/ܰ۬֫;

    invoke-interface {v1, v2, v4}, Ll/۟ۛ֫;->֫([BLl/ܰ۬֫;)V

    .line 388
    iget-object v2, p0, Ll/ۧۛ֫;->᩸:[B

    invoke-interface {v1, v2}, Ll/۟ۛ֫;->ܽ([B)Ll/ᩴ᩸֫;

    move-result-object v1

    iput-object v1, p0, Ll/ۧۛ֫;->ۧ:Ll/ᩴ᩸֫;

    const/4 v1, 0x3

    .line 389
    iput v1, p0, Ll/ۧۛ֫;->᩹:I

    .line 592
    iget-object v2, p0, Ll/ۧۛ֫;->ܿ:Ll/ۜۚ֫;

    invoke-virtual {v2}, Ll/ۜۚ֫;->ۧۧ()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܶۛ֫;

    .line 392
    invoke-virtual {v4, v1}, Ll/ܶۛ֫;->֫(I)V

    goto :goto_0

    .line 393
    :cond_1
    iget-object v1, p0, Ll/ۧۛ֫;->᩸:[B

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Landroid/media/NotProvisionedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return v3

    :catch_0
    move-exception v1

    goto :goto_1

    :catch_1
    move-exception v1

    .line 399
    :goto_1
    invoke-static {v1}, Ll/۬ۛ֫;->֫(Ljava/lang/Throwable;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 400
    check-cast v0, Ll/ۢۛ֫;

    invoke-virtual {v0, p0}, Ll/ۢۛ֫;->ۧ(Ll/ۧۛ֫;)V

    goto :goto_2

    .line 402
    :cond_2
    invoke-direct {p0, v3, v1}, Ll/ۧۛ֫;->֫(ILjava/lang/Throwable;)V

    goto :goto_2

    .line 396
    :catch_2
    check-cast v0, Ll/ۢۛ֫;

    invoke-virtual {v0, p0}, Ll/ۢۛ֫;->ۧ(Ll/ۧۛ֫;)V

    :goto_2
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final getError()Ll/᩵ۛ֫;
    .locals 2

    .line 272
    invoke-direct {p0}, Ll/ۧۛ֫;->ۜ()V

    .line 273
    iget v0, p0, Ll/ۧۛ֫;->᩹:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ۧۛ֫;->ۜ:Ll/᩵ۛ֫;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getState()I
    .locals 1

    .line 259
    invoke-direct {p0}, Ll/ۧۛ֫;->ۜ()V

    .line 260
    iget v0, p0, Ll/ۧۛ֫;->᩹:I

    return v0
.end method

.method public final ֫()Ljava/util/UUID;
    .locals 1

    .line 278
    invoke-direct {p0}, Ll/ۧۛ֫;->ۜ()V

    .line 279
    iget-object v0, p0, Ll/ۧۛ֫;->᩶:Ljava/util/UUID;

    return-object v0
.end method

.method public final ֫(I)V
    .locals 1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 540
    :cond_0
    iget p1, p0, Ll/ۧۛ֫;->᩹:I

    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    .line 541
    sget-object p1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const/4 p1, 0x0

    .line 542
    invoke-direct {p0, p1}, Ll/ۧۛ֫;->֫(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫(Ljava/lang/Exception;Z)V
    .locals 0

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x3

    .line 248
    :goto_0
    invoke-direct {p0, p2, p1}, Ll/ۧۛ֫;->֫(ILjava/lang/Throwable;)V

    return-void
.end method

.method public final ֫(Ll/ܶۛ֫;)V
    .locals 5

    .line 311
    invoke-direct {p0}, Ll/ۧۛ֫;->ۜ()V

    .line 312
    iget v0, p0, Ll/ۧۛ֫;->᩵:I

    const/4 v1, 0x0

    if-gez v0, :cond_0

    .line 313
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Session reference count less than zero: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ll/ۧۛ֫;->᩵:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;)V

    .line 314
    iput v1, p0, Ll/ۧۛ֫;->᩵:I

    .line 316
    :cond_0
    iget-object v0, p0, Ll/ۧۛ֫;->ܿ:Ll/ۜۚ֫;

    if-eqz p1, :cond_1

    .line 317
    invoke-virtual {v0, p1}, Ll/ۜۚ֫;->֫(Ll/ܶۛ֫;)V

    .line 319
    :cond_1
    iget v2, p0, Ll/ۧۛ֫;->᩵:I

    const/4 v3, 0x1

    add-int/2addr v2, v3

    iput v2, p0, Ll/ۧۛ֫;->᩵:I

    if-ne v2, v3, :cond_3

    .line 320
    iget p1, p0, Ll/ۧۛ֫;->᩹:I

    const/4 v0, 0x2

    if-ne p1, v0, :cond_2

    const/4 v1, 0x1

    :cond_2
    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 321
    new-instance p1, Landroid/os/HandlerThread;

    const-string v0, "ExoPlayer:DrmRequestHandler"

    invoke-direct {p1, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Ll/ۧۛ֫;->֨:Landroid/os/HandlerThread;

    .line 322
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 323
    new-instance p1, Ll/᩺ۤ֫;

    iget-object v0, p0, Ll/ۧۛ֫;->֨:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, p0, v0}, Ll/᩺ۤ֫;-><init>(Ll/ۧۛ֫;Landroid/os/Looper;)V

    iput-object p1, p0, Ll/ۧۛ֫;->ۚ:Ll/᩺ۤ֫;

    .line 324
    invoke-direct {p0}, Ll/ۧۛ֫;->᩻()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 325
    invoke-direct {p0, v3}, Ll/ۧۛ֫;->֫(Z)V

    goto :goto_0

    :cond_3
    if-eqz p1, :cond_4

    .line 328
    invoke-direct {p0}, Ll/ۧۛ֫;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 329
    invoke-virtual {v0, p1}, Ll/ۜۚ֫;->ۧ(Ll/ܶۛ֫;)I

    move-result v0

    if-ne v0, v3, :cond_4

    .line 332
    iget v0, p0, Ll/ۧۛ֫;->᩹:I

    invoke-virtual {p1, v0}, Ll/ܶۛ֫;->֫(I)V

    .line 334
    :cond_4
    :goto_0
    iget-object p1, p0, Ll/ۧۛ֫;->֡:Ll/ۨۤ֫;

    check-cast p1, Ll/ܺۛ֫;

    .line 880
    iget-object p1, p1, Ll/ܺۛ֫;->֫:Ll/ۖۛ֫;

    invoke-static {p1}, Ll/ۖۛ֫;->᩷(Ll/ۖۛ֫;)J

    move-result-wide v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_5

    .line 882
    invoke-static {p1}, Ll/ۖۛ֫;->֫(Ll/ۖۛ֫;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 883
    invoke-static {p1}, Ll/ۖۛ֫;->ᩳ(Ll/ۖۛ֫;)Landroid/os/Handler;

    move-result-object p1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 883
    invoke-virtual {p1, p0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :cond_5
    return-void
.end method

.method public final ֫(Ljava/lang/String;)Z
    .locals 2

    .line 305
    invoke-direct {p0}, Ll/ۧۛ֫;->ۜ()V

    .line 306
    iget-object v0, p0, Ll/ۧۛ֫;->᩸:[B

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    iget-object v1, p0, Ll/ۧۛ֫;->ۢ:Ll/۟ۛ֫;

    invoke-interface {v1, p1, v0}, Ll/۟ۛ֫;->֫(Ljava/lang/String;[B)Z

    move-result p1

    return p1
.end method

.method public final ֫([B)Z
    .locals 1

    .line 216
    invoke-direct {p0}, Ll/ۧۛ֫;->ۜ()V

    .line 217
    iget-object v0, p0, Ll/ۧۛ֫;->᩸:[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1
.end method

.method public final ۧ(Ll/ܶۛ֫;)V
    .locals 6

    .line 339
    invoke-direct {p0}, Ll/ۧۛ֫;->ۜ()V

    .line 340
    iget v0, p0, Ll/ۧۛ֫;->᩵:I

    if-gtz v0, :cond_0

    const-string p1, "release() called on a session that\'s already fully released."

    .line 341
    invoke-static {p1}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v1, 0x1

    sub-int/2addr v0, v1

    .line 344
    iput v0, p0, Ll/ۧۛ֫;->᩵:I

    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 346
    iput v0, p0, Ll/ۧۛ֫;->᩹:I

    .line 347
    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    iget-object v0, p0, Ll/ۧۛ֫;->۠:Ll/۟ۤ֫;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 348
    iget-object v0, p0, Ll/ۧۛ֫;->ۚ:Ll/᩺ۤ֫;

    invoke-virtual {v0}, Ll/᩺ۤ֫;->֫()V

    .line 349
    iput-object v2, p0, Ll/ۧۛ֫;->ۚ:Ll/᩺ۤ֫;

    .line 350
    iget-object v0, p0, Ll/ۧۛ֫;->֨:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 351
    iput-object v2, p0, Ll/ۧۛ֫;->֨:Landroid/os/HandlerThread;

    .line 352
    iput-object v2, p0, Ll/ۧۛ֫;->ۧ:Ll/ᩴ᩸֫;

    .line 353
    iput-object v2, p0, Ll/ۧۛ֫;->ۜ:Ll/᩵ۛ֫;

    .line 354
    iput-object v2, p0, Ll/ۧۛ֫;->ܽ:Ll/ۛۛ֫;

    .line 355
    iput-object v2, p0, Ll/ۧۛ֫;->ᩳ:Ll/ܰۛ֫;

    .line 356
    iget-object v0, p0, Ll/ۧۛ֫;->᩸:[B

    if-eqz v0, :cond_1

    .line 357
    iget-object v3, p0, Ll/ۧۛ֫;->ۢ:Ll/۟ۛ֫;

    invoke-interface {v3, v0}, Ll/۟ۛ֫;->ᩳ([B)V

    .line 358
    iput-object v2, p0, Ll/ۧۛ֫;->᩸:[B

    :cond_1
    if-eqz p1, :cond_2

    .line 362
    iget-object v0, p0, Ll/ۧۛ֫;->ܿ:Ll/ۜۚ֫;

    invoke-virtual {v0, p1}, Ll/ۜۚ֫;->ܽ(Ll/ܶۛ֫;)V

    .line 363
    invoke-virtual {v0, p1}, Ll/ۜۚ֫;->ۧ(Ll/ܶۛ֫;)I

    move-result v0

    if-nez v0, :cond_2

    .line 365
    invoke-virtual {p1}, Ll/ܶۛ֫;->ܽ()V

    .line 368
    :cond_2
    iget p1, p0, Ll/ۧۛ֫;->᩵:I

    iget-object v0, p0, Ll/ۧۛ֫;->֡:Ll/ۨۤ֫;

    check-cast v0, Ll/ܺۛ֫;

    .line 889
    iget-object v0, v0, Ll/ܺۛ֫;->֫:Ll/ۖۛ֫;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    if-ne p1, v1, :cond_3

    invoke-static {v0}, Ll/ۖۛ֫;->᩻(Ll/ۖۛ֫;)I

    move-result v1

    if-lez v1, :cond_3

    invoke-static {v0}, Ll/ۖۛ֫;->᩷(Ll/ۖۛ֫;)J

    move-result-wide v4

    cmp-long v1, v4, v2

    if-eqz v1, :cond_3

    .line 893
    invoke-static {v0}, Ll/ۖۛ֫;->֫(Ll/ۖۛ֫;)Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 894
    invoke-static {v0}, Ll/ۖۛ֫;->ᩳ(Ll/ۖۛ֫;)Landroid/os/Handler;

    move-result-object p1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 894
    new-instance v1, Ll/ۡۛ֫;

    invoke-direct {v1, p0}, Ll/ۡۛ֫;-><init>(Ll/ۧۛ֫;)V

    .line 898
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    invoke-static {v0}, Ll/ۖۛ֫;->᩷(Ll/ۖۛ֫;)J

    move-result-wide v4

    add-long/2addr v2, v4

    .line 895
    invoke-virtual {p1, v1, p0, v2, v3}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    goto :goto_0

    :cond_3
    if-nez p1, :cond_6

    .line 901
    invoke-static {v0}, Ll/ۖۛ֫;->ۢ(Ll/ۖۛ֫;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 902
    invoke-static {v0}, Ll/ۖۛ֫;->ܽ(Ll/ۖۛ֫;)Ll/ۧۛ֫;

    move-result-object p1

    if-ne p1, p0, :cond_4

    .line 903
    invoke-static {v0}, Ll/ۖۛ֫;->ܺ(Ll/ۖۛ֫;)V

    .line 905
    :cond_4
    invoke-static {v0}, Ll/ۖۛ֫;->ۧ(Ll/ۖۛ֫;)Ll/ۧۛ֫;

    move-result-object p1

    if-ne p1, p0, :cond_5

    .line 906
    invoke-static {v0}, Ll/ۖۛ֫;->ۡ(Ll/ۖۛ֫;)V

    .line 908
    :cond_5
    invoke-static {v0}, Ll/ۖۛ֫;->ۜ(Ll/ۖۛ֫;)Ll/ۢۛ֫;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/ۢۛ֫;->֫(Ll/ۧۛ֫;)V

    .line 909
    invoke-static {v0}, Ll/ۖۛ֫;->᩷(Ll/ۖۛ֫;)J

    move-result-wide v4

    cmp-long p1, v4, v2

    if-eqz p1, :cond_6

    .line 910
    invoke-static {v0}, Ll/ۖۛ֫;->ᩳ(Ll/ۖۛ֫;)Landroid/os/Handler;

    move-result-object p1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 910
    invoke-virtual {p1, p0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 911
    invoke-static {v0}, Ll/ۖۛ֫;->֫(Ll/ۖۛ֫;)Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 914
    :cond_6
    :goto_0
    invoke-static {v0}, Ll/ۖۛ֫;->ۖ(Ll/ۖۛ֫;)V

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 265
    invoke-direct {p0}, Ll/ۧۛ֫;->ۜ()V

    .line 266
    iget-boolean v0, p0, Ll/ۧۛ֫;->ܺ:Z

    return v0
.end method

.method public final ܽ()Ll/ᩴ᩸֫;
    .locals 1

    .line 285
    invoke-direct {p0}, Ll/ۧۛ֫;->ۜ()V

    .line 286
    iget-object v0, p0, Ll/ۧۛ֫;->ۧ:Ll/ᩴ᩸֫;

    return-object v0
.end method

.method public final ܿ()V
    .locals 10

    .line 233
    iget-object v0, p0, Ll/ۧۛ֫;->ۢ:Ll/۟ۛ֫;

    invoke-interface {v0}, Ll/۟ۛ֫;->ۧ()Ll/ܰۛ֫;

    move-result-object v7

    iput-object v7, p0, Ll/ۧۛ֫;->ᩳ:Ll/ܰۛ֫;

    .line 234
    iget-object v0, p0, Ll/ۧۛ֫;->ۚ:Ll/᩺ۤ֫;

    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 155
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 648
    new-instance v8, Ll/ܰۤ֫;

    .line 650
    invoke-static {}, Ll/ۧۧۧ;->֫()J

    move-result-wide v2

    .line 652
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    const/4 v9, 0x1

    move-object v1, v8

    move v4, v9

    invoke-direct/range {v1 .. v7}, Ll/ܰۤ֫;-><init>(JZJLjava/lang/Object;)V

    .line 654
    invoke-virtual {v0, v9, v8}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    .line 242
    invoke-direct {p0}, Ll/ۧۛ֫;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 243
    invoke-direct {p0, v0}, Ll/ۧۛ֫;->֫(Z)V

    :cond_0
    return-void
.end method
