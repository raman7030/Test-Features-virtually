.class public Ll/۬ۚ᩵;
.super Ljava/net/URLConnection;
.source "69ZM"

# interfaces
.implements Ll/ۤۡ᩵;


# static fields
.field public static ܰ:Ll/֫᩻֨;

.field public static final synthetic ᩺:I


# instance fields
.field public ۗ:J

.field public ۙ:Z

.field public ۛ:Ll/ۖ֨᩵;

.field public ۤ:Ll/ᩴۡ᩵;

.field public ۨ:Ll/ۘ֨᩵;

.field public ۫:J

.field public ۬:J

.field public final ᩶:Ll/ᩳ֨᩵;

.field public ᩸:J

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 357
    const-class v0, Ll/۬ۚ᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/۬ۚ᩵;->ܰ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/ᩴۡ᩵;)V
    .locals 3

    .line 430
    new-instance v0, Ljava/net/URL;

    const/4 v1, 0x0

    invoke-interface {p2}, Ll/ᩴۡ᩵;->ۜ()Ll/ۜۚ᩵;

    move-result-object v2

    invoke-direct {v0, v1, p1, v2}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;Ljava/net/URLStreamHandler;)V

    invoke-direct {p0, v0, p2}, Ll/۬ۚ᩵;-><init>(Ljava/net/URL;Ll/ᩴۡ᩵;)V

    return-void
.end method

.method public constructor <init>(Ljava/net/URL;Ll/ᩴۡ᩵;)V
    .locals 2

    .line 442
    invoke-direct {p0, p1}, Ljava/net/URLConnection;-><init>(Ljava/net/URL;)V

    .line 443
    invoke-virtual {p1}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x2f

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 444
    :cond_0
    new-instance p2, Ljava/net/MalformedURLException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid SMB URL: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/net/MalformedURLException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 446
    :cond_1
    :goto_0
    iput-object p2, p0, Ll/۬ۚ᩵;->ۤ:Ll/ᩴۡ᩵;

    .line 447
    new-instance v0, Ll/ᩳ֨᩵;

    invoke-direct {v0, p1, p2}, Ll/ᩳ֨᩵;-><init>(Ljava/net/URL;Ll/ᩴۡ᩵;)V

    iput-object v0, p0, Ll/۬ۚ᩵;->᩶:Ll/ᩳ֨᩵;

    .line 448
    sget p1, Ll/ۖ֨᩵;->ۜ:I

    .line 91
    invoke-interface {p2}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    new-instance p1, Ll/ۖ֨᩵;

    invoke-direct {p1, p2}, Ll/ۖ֨᩵;-><init>(Ll/ᩴۡ᩵;)V

    .line 448
    iput-object p1, p0, Ll/۬ۚ᩵;->ۛ:Ll/ۖ֨᩵;

    return-void
.end method

.method public constructor <init>(Ll/ۤۡ᩵;Ljava/lang/String;ZIIJJ)V
    .locals 6

    .line 455
    invoke-static {p1}, Ll/۬ۚ᩵;->ۧ(Ll/ۤۡ᩵;)Z

    move-result v0

    const-string v1, ""

    const-string v2, "/"

    if-eqz v0, :cond_0

    new-instance v0, Ljava/net/URL;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "smb://"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Ll/۬ۚ᩵;->ۧ(Ljava/lang/String;)V

    .line 0
    invoke-static {v3, p2, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 455
    invoke-interface {p1}, Ll/ۤۡ᩵;->getContext()Ll/ᩴۡ᩵;

    move-result-object v4

    invoke-interface {v4}, Ll/ᩴۡ᩵;->ۜ()Ll/ۜۚ᩵;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {v0, v5, v3, v4}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;Ljava/net/URLStreamHandler;)V

    goto :goto_1

    .line 456
    :cond_0
    new-instance v0, Ljava/net/URL;

    .line 457
    invoke-interface {p1}, Ll/ۤۡ᩵;->ۚۧ()Ll/ۛۡ᩵;

    move-result-object v3

    check-cast v3, Ll/ᩳ֨᩵;

    invoke-virtual {v3}, Ll/ᩳ֨᩵;->ۢ()Ljava/net/URL;

    move-result-object v3

    .line 458
    invoke-static {p2}, Ll/۬ۚ᩵;->ۧ(Ljava/lang/String;)V

    and-int/lit8 v4, p5, 0x10

    if-lez v4, :cond_1

    move-object v4, v2

    goto :goto_0

    :cond_1
    move-object v4, v1

    :goto_0
    invoke-virtual {p2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v3, v4}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    .line 459
    :goto_1
    invoke-interface {p1}, Ll/ۤۡ᩵;->getContext()Ll/ᩴۡ᩵;

    move-result-object v3

    .line 454
    invoke-direct {p0, v0, v3}, Ll/۬ۚ᩵;-><init>(Ljava/net/URL;Ll/ᩴۡ᩵;)V

    .line 461
    invoke-static {p1}, Ll/۬ۚ᩵;->ۧ(Ll/ۤۡ᩵;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 0
    invoke-static {p2}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    and-int/lit8 v0, p5, 0x10

    if-lez v0, :cond_2

    move-object v1, v2

    .line 462
    :cond_2
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Ll/۬ۚ᩵;->֫(Ll/ۤۡ᩵;Ljava/lang/String;)V

    .line 469
    :cond_3
    iget-object p1, p0, Ll/۬ۚ᩵;->᩶:Ll/ᩳ֨᩵;

    invoke-virtual {p1, p4}, Ll/ᩳ֨᩵;->֫(I)V

    .line 470
    iput p5, p0, Ll/۬ۚ᩵;->᩹:I

    .line 472
    iput-wide p6, p0, Ll/۬ۚ᩵;->ۗ:J

    .line 474
    iput-wide p8, p0, Ll/۬ۚ᩵;->۬:J

    const/4 p1, 0x1

    .line 475
    iput-boolean p1, p0, Ll/۬ۚ᩵;->ۙ:Z

    if-eqz p3, :cond_4

    .line 478
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    .line 601
    iget-object p3, p0, Ll/۬ۚ᩵;->ۤ:Ll/ᩴۡ᩵;

    .line 478
    invoke-interface {p3}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p3

    check-cast p3, Ll/ܰۡ᩵;

    invoke-virtual {p3}, Ll/ܰۡ᩵;->֫()J

    move-result-wide p3

    add-long/2addr p3, p1

    iput-wide p3, p0, Ll/۬ۚ᩵;->۫:J

    iput-wide p3, p0, Ll/۬ۚ᩵;->᩸:J

    :cond_4
    return-void
.end method

.method public constructor <init>(Ll/۬ۚ᩵;Ljava/lang/String;)V
    .locals 4

    .line 415
    invoke-static {p1}, Ll/۬ۚ᩵;->ۧ(Ll/ۤۡ᩵;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/net/URL;

    invoke-static {p2}, Ll/۬ۚ᩵;->ۧ(Ljava/lang/String;)V

    const-string v1, "smb://"

    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 601
    iget-object v2, p1, Ll/۬ۚ᩵;->ۤ:Ll/ᩴۡ᩵;

    .line 415
    invoke-interface {v2}, Ll/ᩴۡ᩵;->ۜ()Ll/ۜۚ᩵;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;Ljava/net/URLStreamHandler;)V

    goto :goto_0

    .line 416
    :cond_0
    new-instance v0, Ljava/net/URL;

    .line 607
    iget-object v1, p1, Ll/۬ۚ᩵;->᩶:Ll/ᩳ֨᩵;

    .line 416
    invoke-virtual {v1}, Ll/ᩳ֨᩵;->ۢ()Ljava/net/URL;

    move-result-object v1

    invoke-static {p2}, Ll/۬ۚ᩵;->ۧ(Ljava/lang/String;)V

    .line 601
    iget-object v2, p1, Ll/۬ۚ᩵;->ۤ:Ll/ᩴۡ᩵;

    .line 416
    invoke-interface {v2}, Ll/ᩴۡ᩵;->ۜ()Ll/ۜۚ᩵;

    move-result-object v2

    invoke-direct {v0, v1, p2, v2}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;Ljava/net/URLStreamHandler;)V

    .line 601
    :goto_0
    iget-object v1, p1, Ll/۬ۚ᩵;->ۤ:Ll/ᩴۡ᩵;

    .line 414
    invoke-direct {p0, v0, v1}, Ll/۬ۚ᩵;-><init>(Ljava/net/URL;Ll/ᩴۡ᩵;)V

    .line 418
    invoke-direct {p0, p1, p2}, Ll/۬ۚ᩵;->֫(Ll/ۤۡ᩵;Ljava/lang/String;)V

    return-void
.end method

.method private ֫(Ll/ۘ֨᩵;B)Ll/۬ۖ᩵;
    .locals 4

    .line 1571
    invoke-virtual {p1}, Ll/ۘ֨᩵;->᩸()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 1572
    new-instance v0, Ll/ܿ᩵᩵;

    invoke-virtual {p1}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v2

    invoke-direct {v0, v2}, Ll/ܿ᩵᩵;-><init>(Ll/֨ۡ᩵;)V

    .line 1573
    invoke-virtual {v0, p2}, Ll/ܿ᩵᩵;->֫(B)V

    const/16 p2, 0x80

    new-array v1, v1, [Ll/۬ᩴ᩵;

    .line 1574
    invoke-virtual {p0, p1, p2, v0, v1}, Ll/۬ۚ᩵;->֫(Ll/ۘ֨᩵;ILl/۬ᩴ᩵;[Ll/۬ᩴ᩵;)Ll/۫ᩴ᩵;

    move-result-object p1

    check-cast p1, Ll/ܳ᩵᩵;

    .line 1580
    invoke-virtual {p1}, Ll/ܳ᩵᩵;->᩵֫()Ll/۠ۡ᩵;

    move-result-object p1

    check-cast p1, Ll/۬ۖ᩵;

    return-object p1

    .line 1582
    :cond_0
    new-instance v0, Ll/۠ᩴ᩵;

    invoke-virtual {p1}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v2

    invoke-direct {v0, v2, p2}, Ll/۠ᩴ᩵;-><init>(Ll/֨ۡ᩵;I)V

    .line 1583
    new-instance v2, Ll/֨ᩴ᩵;

    invoke-virtual {p1}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v3

    invoke-direct {v2, v3, p2}, Ll/֨ᩴ᩵;-><init>(Ll/֨ۡ᩵;I)V

    new-array p2, v1, [Ll/֡ۚ᩵;

    invoke-virtual {p1, v2, v0, p2}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    .line 1584
    invoke-virtual {v0}, Ll/۠ᩴ᩵;->֡֫()Ll/᩺ܺ᩵;

    move-result-object p1

    return-object p1
.end method

.method private ֫(Ll/ۤۡ᩵;Ljava/lang/String;)V
    .locals 2

    .line 565
    iget-object v0, p0, Ll/۬ۚ᩵;->᩶:Ll/ᩳ֨᩵;

    invoke-interface {p1}, Ll/ۤۡ᩵;->ۚۧ()Ll/ۛۡ᩵;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Ll/ᩳ֨᩵;->֫(Ll/ۛۡ᩵;Ljava/lang/String;)V

    .line 566
    invoke-interface {p1}, Ll/ۤۡ᩵;->ۚۧ()Ll/ۛۡ᩵;

    move-result-object p2

    check-cast p2, Ll/ᩳ֨᩵;

    invoke-virtual {p2}, Ll/ᩳ֨᩵;->ܳ()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    instance-of p2, p1, Ll/۬ۚ᩵;

    if-eqz p2, :cond_0

    .line 567
    check-cast p1, Ll/۬ۚ᩵;

    iget-object p1, p1, Ll/۬ۚ᩵;->ۛ:Ll/ۖ֨᩵;

    invoke-static {p1}, Ll/ۖ֨᩵;->ۧ(Ll/ۖ֨᩵;)Ll/ۖ֨᩵;

    move-result-object p1

    iput-object p1, p0, Ll/۬ۚ᩵;->ۛ:Ll/ۖ֨᩵;

    return-void

    .line 569
    :cond_0
    invoke-interface {p1}, Ll/ۤۡ᩵;->getContext()Ll/ᩴۡ᩵;

    move-result-object p1

    sget p2, Ll/ۖ֨᩵;->ۜ:I

    .line 91
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    new-instance p2, Ll/ۖ֨᩵;

    invoke-direct {p2, p1}, Ll/ۖ֨᩵;-><init>(Ll/ᩴۡ᩵;)V

    .line 569
    iput-object p2, p0, Ll/۬ۚ᩵;->ۛ:Ll/ۖ֨᩵;

    return-void
.end method

.method public static ۧ(Ljava/lang/String;)V
    .locals 1

    if-eqz p0, :cond_0

    .line 575
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    if-eqz p0, :cond_0

    return-void

    .line 576
    :cond_0
    new-instance p0, Ljava/net/MalformedURLException;

    const-string v0, "Name must not be empty"

    invoke-direct {p0, v0}, Ljava/net/MalformedURLException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(Ll/ۤۡ᩵;)Z
    .locals 2

    .line 493
    :try_start_0
    invoke-interface {p0}, Ll/ۤۡ᩵;->ۚۧ()Ll/ۛۡ᩵;

    move-result-object p0

    check-cast p0, Ll/ᩳ֨᩵;

    invoke-virtual {p0}, Ll/ᩳ֨᩵;->ۘ()Z

    move-result p0
    :try_end_0
    .catch Ll/᩵ۡ᩵; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p0

    .line 495
    sget-object v0, Ll/۬ۚ᩵;->ܰ:Ll/֫᩻֨;

    const-string v1, "Failed to check for workgroup"

    invoke-interface {v0, v1, p0}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 529
    :try_start_0
    iget-object v1, p0, Ll/۬ۚ᩵;->ۨ:Ll/ۘ֨᩵;

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 531
    iput-object v1, p0, Ll/۬ۚ᩵;->ۨ:Ll/ۘ֨᩵;

    .line 532
    iget-object v1, p0, Ll/۬ۚ᩵;->ۤ:Ll/ᩴۡ᩵;

    invoke-interface {v1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 536
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final connect()V
    .locals 1

    .line 508
    invoke-virtual {p0}, Ll/۬ۚ᩵;->ᩳ()Ll/ۘ֨᩵;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 509
    invoke-virtual {v0}, Ll/ۘ֨᩵;->close()V

    :cond_0
    return-void
.end method

.method public final delete()V
    .locals 1

    .line 1416
    :try_start_0
    iget-object v0, p0, Ll/۬ۚ᩵;->᩶:Ll/ᩳ֨᩵;

    invoke-virtual {v0}, Ll/ᩳ֨᩵;->᩷()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/۬ۚ᩵;->֫(Ljava/lang/String;)V
    :try_end_0
    .catch Ll/᩵ۡ᩵; {:try_start_0 .. :try_end_0} :catch_0

    .line 1420
    invoke-virtual {p0}, Ll/۬ۚ᩵;->close()V

    return-void

    :catch_0
    move-exception v0

    .line 1418
    invoke-static {v0}, Ll/ۗۚ᩵;->֫(Ll/᩵ۡ᩵;)Ll/ۗۚ᩵;

    move-result-object v0

    throw v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1961
    instance-of v0, p1, Ll/۬ۚ᩵;

    if-eqz v0, :cond_1

    .line 1962
    check-cast p1, Ll/ۤۡ᩵;

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 1967
    :cond_0
    iget-object v0, p0, Ll/۬ۚ᩵;->᩶:Ll/ᩳ֨᩵;

    invoke-interface {p1}, Ll/ۤۡ᩵;->ۚۧ()Ll/ۛۡ᩵;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ᩳ֨᩵;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final getContentLength()I
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2000
    :try_start_0
    invoke-virtual {p0}, Ll/۬ۚ᩵;->length()J

    move-result-wide v0
    :try_end_0
    .catch Ll/ۗۚ᩵; {:try_start_0 .. :try_end_0} :catch_0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int v1, v0

    return v1

    :catch_0
    move-exception v0

    .line 2002
    sget-object v1, Ll/۬ۚ᩵;->ܰ:Ll/֫᩻֨;

    const-string v2, "getContentLength"

    invoke-interface {v1, v2, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    const/4 v0, 0x0

    return v0
.end method

.method public final getContentLengthLong()J
    .locals 3

    .line 2016
    :try_start_0
    invoke-virtual {p0}, Ll/۬ۚ᩵;->length()J

    move-result-wide v0
    :try_end_0
    .catch Ll/ۗۚ᩵; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    move-exception v0

    .line 2018
    sget-object v1, Ll/۬ۚ᩵;->ܰ:Ll/֫᩻֨;

    const-string v2, "getContentLength"

    invoke-interface {v1, v2, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getContext()Ll/ᩴۡ᩵;
    .locals 1

    .line 601
    iget-object v0, p0, Ll/۬ۚ᩵;->ۤ:Ll/ᩴۡ᩵;

    return-object v0
.end method

.method public final getDate()J
    .locals 3

    .line 2032
    :try_start_0
    invoke-virtual {p0}, Ll/۬ۚ᩵;->ۚ()J

    move-result-wide v0
    :try_end_0
    .catch Ll/ۗۚ᩵; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    move-exception v0

    .line 2034
    sget-object v1, Ll/۬ۚ᩵;->ܰ:Ll/֫᩻֨;

    const-string v2, "getDate"

    invoke-interface {v1, v2, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getInputStream()Ljava/io/InputStream;
    .locals 1

    .line 2063
    new-instance v0, Ll/ۤۚ᩵;

    invoke-direct {v0, p0}, Ll/ۤۚ᩵;-><init>(Ll/۬ۚ᩵;)V

    return-object v0
.end method

.method public final getLastModified()J
    .locals 3

    .line 2048
    :try_start_0
    invoke-virtual {p0}, Ll/۬ۚ᩵;->ۚ()J

    move-result-wide v0
    :try_end_0
    .catch Ll/ۗۚ᩵; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    move-exception v0

    .line 2050
    sget-object v1, Ll/۬ۚ᩵;->ܰ:Ll/֫᩻֨;

    const-string v2, "getLastModified"

    invoke-interface {v1, v2, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 892
    iget-object v0, p0, Ll/۬ۚ᩵;->᩶:Ll/ᩳ֨᩵;

    invoke-virtual {v0}, Ll/ᩳ֨᩵;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getOutputStream()Ljava/io/OutputStream;
    .locals 1

    .line 2087
    new-instance v0, Ll/ۛۚ᩵;

    invoke-direct {v0, p0}, Ll/ۛۚ᩵;-><init>(Ll/۬ۚ᩵;)V

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1928
    iget-object v0, p0, Ll/۬ۚ᩵;->᩶:Ll/ᩳ֨᩵;

    invoke-virtual {v0}, Ll/ᩳ֨᩵;->hashCode()I

    move-result v0

    return v0
.end method

.method public final isDirectory()Z
    .locals 4

    .line 1045
    iget-object v0, p0, Ll/۬ۚ᩵;->᩶:Ll/ᩳ֨᩵;

    invoke-virtual {v0}, Ll/ᩳ֨᩵;->ۖ()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 1048
    :cond_0
    invoke-virtual {p0}, Ll/۬ۚ᩵;->ܳ()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    .line 1050
    :cond_1
    iget v0, p0, Ll/۬ۚ᩵;->᩹:I

    const/16 v3, 0x10

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_2

    return v1

    :cond_2
    return v2
.end method

.method public final length()J
    .locals 6

    .line 1505
    iget-object v0, p0, Ll/۬ۚ᩵;->᩶:Ll/ᩳ֨᩵;

    iget-wide v1, p0, Ll/۬ۚ᩵;->۫:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    .line 1506
    iget-wide v0, p0, Ll/۬ۚ᩵;->۬:J

    return-wide v0

    .line 1509
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ll/۬ۚ᩵;->ᩳ()Ll/ۘ֨᩵;

    move-result-object v1
    :try_end_0
    .catch Ll/᩵ۡ᩵; {:try_start_0 .. :try_end_0} :catch_1

    .line 1510
    :try_start_1
    invoke-virtual {p0}, Ll/۬ۚ᩵;->᩻()I

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/16 v3, 0x8

    if-ne v2, v3, :cond_3

    const/4 v0, 0x3

    .line 1551
    :try_start_2
    invoke-direct {p0, v1, v0}, Ll/۬ۚ᩵;->֫(Ll/ۘ֨᩵;B)Ll/۬ۖ᩵;

    move-result-object v0

    check-cast v0, Ll/᩺ܺ᩵;
    :try_end_2
    .catch Ll/ۗۚ᩵; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 1553
    :try_start_3
    sget-object v2, Ll/۬ۚ᩵;->ܰ:Ll/֫᩻֨;

    const-string v3, "getDiskFreeSpace"

    invoke-interface {v2, v3, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 1554
    invoke-virtual {v0}, Ll/ۗۚ᩵;->֫()I

    move-result v2

    const v3, -0x3fffffff    # -2.0000002f

    if-eq v2, v3, :cond_1

    const v3, -0x3ffffffd    # -2.0000007f

    if-ne v2, v3, :cond_2

    .line 1557
    :cond_1
    invoke-virtual {v1}, Ll/ۘ֨᩵;->᩸()Z

    move-result v2

    if-nez v2, :cond_2

    const/4 v0, -0x1

    .line 1559
    invoke-direct {p0, v1, v0}, Ll/۬ۚ᩵;->֫(Ll/ۘ֨᩵;B)Ll/۬ۖ᩵;

    move-result-object v0

    check-cast v0, Ll/᩺ܺ᩵;

    .line 1512
    :goto_0
    invoke-interface {v0}, Ll/᩺ܺ᩵;->ᩳ()J

    move-result-wide v2

    iput-wide v2, p0, Ll/۬ۚ᩵;->۬:J

    goto :goto_2

    .line 1563
    :cond_2
    throw v0

    .line 570
    :cond_3
    invoke-virtual {v0}, Ll/ᩳ֨᩵;->ܳ()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_4

    invoke-virtual {v0}, Ll/ᩳ֨᩵;->᩷()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x1

    if-gt v3, v4, :cond_4

    goto :goto_1

    :cond_4
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_5

    const/16 v3, 0x10

    if-eq v2, v3, :cond_5

    .line 1514
    invoke-virtual {v0}, Ll/ᩳ֨᩵;->᩷()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x5

    invoke-virtual {p0, v1, v0, v2}, Ll/۬ۚ᩵;->֫(Ll/ۘ֨᩵;Ljava/lang/String;I)V

    goto :goto_2

    :cond_5
    const-wide/16 v2, 0x0

    .line 1516
    iput-wide v2, p0, Ll/۬ۚ᩵;->۬:J

    .line 1518
    :goto_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 601
    iget-object v0, p0, Ll/۬ۚ᩵;->ۤ:Ll/ᩴۡ᩵;

    .line 1518
    invoke-interface {v0}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    check-cast v0, Ll/ܰۡ᩵;

    invoke-virtual {v0}, Ll/ܰۡ᩵;->֫()J

    move-result-wide v4

    add-long/2addr v2, v4

    iput-wide v2, p0, Ll/۬ۚ᩵;->۫:J

    .line 1519
    iget-wide v2, p0, Ll/۬ۚ᩵;->۬:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v1, :cond_6

    .line 1520
    :try_start_4
    invoke-virtual {v1}, Ll/ۘ֨᩵;->close()V
    :try_end_4
    .catch Ll/᩵ۡ᩵; {:try_start_4 .. :try_end_4} :catch_1

    :cond_6
    return-wide v2

    :catchall_0
    move-exception v0

    if-eqz v1, :cond_7

    .line 1509
    :try_start_5
    invoke-virtual {v1}, Ll/ۘ֨᩵;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v1

    :try_start_6
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_7
    :goto_3
    throw v0
    :try_end_6
    .catch Ll/᩵ۡ᩵; {:try_start_6 .. :try_end_6} :catch_1

    :catch_1
    move-exception v0

    .line 1521
    invoke-static {v0}, Ll/ۗۚ᩵;->֫(Ll/᩵ۡ᩵;)Ll/ۗۚ᩵;

    move-result-object v0

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1985
    iget-object v0, p0, Ljava/net/URLConnection;->url:Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֨()Z
    .locals 4

    .line 1066
    iget-object v0, p0, Ll/۬ۚ᩵;->᩶:Ll/ᩳ֨᩵;

    invoke-virtual {v0}, Ll/ᩳ֨᩵;->ܳ()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    .line 1068
    :cond_0
    invoke-virtual {v0}, Ll/ᩳ֨᩵;->ۖ()Z

    move-result v1

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    .line 1069
    invoke-virtual {v0}, Ll/ᩳ֨᩵;->ܳ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "$"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v3

    :cond_1
    return v2

    .line 1074
    :cond_2
    invoke-virtual {p0}, Ll/۬ۚ᩵;->ܳ()Z

    .line 1075
    iget v0, p0, Ll/۬ۚ᩵;->᩹:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_3

    return v3

    :cond_3
    return v2
.end method

.method public final ֫()Ll/ۚۡ᩵;
    .locals 1

    .line 1258
    invoke-static {p0}, Ll/ۙۚ᩵;->֫(Ll/۬ۚ᩵;)Ll/ۚۡ᩵;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(IIIII)Ll/۫ۚ᩵;
    .locals 8

    .line 732
    iget-object v0, p0, Ll/۬ۚ᩵;->᩶:Ll/ᩳ֨᩵;

    invoke-virtual {v0}, Ll/ᩳ֨᩵;->᩷()Ljava/lang/String;

    move-result-object v2

    move-object v1, p0

    move v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    move v7, p5

    .line 628
    invoke-virtual/range {v1 .. v7}, Ll/۬ۚ᩵;->֫(Ljava/lang/String;IIIII)Ll/۫ۚ᩵;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;IIIII)Ll/۫ۚ᩵;
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v10, p1

    .line 633
    sget-object v9, Ll/۬ۚ᩵;->ܰ:Ll/֫᩻֨;

    .line 634
    invoke-virtual/range {p0 .. p0}, Ll/۬ۚ᩵;->ᩳ()Ll/ۘ֨᩵;

    move-result-object v13

    .line 636
    :try_start_0
    invoke-interface {v9}, Ll/֫᩻֨;->֫()Z

    move-result v0

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x5

    const/4 v11, 0x2

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eqz v0, :cond_0

    const-string v0, "openUnshared: %s flags: %x access: %x attrs: %x options: %x"

    .line 637
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static/range {p5 .. p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    new-array v12, v4, [Ljava/lang/Object;

    aput-object v10, v12, v15

    aput-object v5, v12, v14

    aput-object v6, v12, v11

    aput-object v7, v12, v3

    aput-object v8, v12, v2

    invoke-static {v0, v12}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v9, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 640
    :cond_0
    invoke-virtual {v13}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v12

    .line 644
    invoke-virtual {v13}, Ll/ۘ֨᩵;->᩸()Z

    move-result v0

    const/16 v5, 0x10

    if-eqz v0, :cond_5

    .line 645
    new-instance v0, Ll/֫᩵᩵;

    invoke-direct {v0, v10, v12}, Ll/֫᩵᩵;-><init>(Ljava/lang/String;Ll/֨ۡ᩵;)V

    move/from16 v8, p3

    .line 646
    invoke-virtual {v0, v8}, Ll/֫᩵᩵;->ۘ(I)V

    and-int/lit8 v6, p2, 0x40

    const/16 v7, 0x40

    if-ne v6, v7, :cond_1

    and-int/lit8 v9, p2, 0x10

    if-ne v9, v5, :cond_1

    .line 649
    invoke-virtual {v0, v4}, Ll/֫᩵᩵;->ܺ(I)V

    goto :goto_0

    :cond_1
    if-ne v6, v7, :cond_2

    .line 651
    invoke-virtual {v0, v2}, Ll/֫᩵᩵;->ܺ(I)V

    goto :goto_0

    :cond_2
    and-int/lit8 v2, p2, 0x20

    const/16 v4, 0x20

    if-ne v2, v4, :cond_3

    .line 653
    invoke-virtual {v0, v11}, Ll/֫᩵᩵;->ܺ(I)V

    goto :goto_0

    :cond_3
    and-int/lit8 v2, p2, 0x10

    if-ne v2, v5, :cond_4

    .line 655
    invoke-virtual {v0, v3}, Ll/֫᩵᩵;->ܺ(I)V

    goto :goto_0

    .line 657
    :cond_4
    invoke-virtual {v0, v14}, Ll/֫᩵᩵;->ܺ(I)V

    :goto_0
    move/from16 v7, p4

    .line 660
    invoke-virtual {v0, v7}, Ll/֫᩵᩵;->᩵(I)V

    move/from16 v6, p5

    .line 661
    invoke-virtual {v0, v6}, Ll/֫᩵᩵;->ᩴ(I)V

    new-array v2, v15, [Ll/֡ۚ᩵;

    const/4 v3, 0x0

    .line 115
    invoke-virtual {v13, v0, v3, v2}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    move-result-object v0

    .line 662
    check-cast v0, Ll/ۧ᩵᩵;

    .line 664
    invoke-virtual {v0}, Ll/ۧ᩵᩵;->᩵֫()J

    move-result-wide v15

    .line 665
    new-instance v11, Ll/۫ۚ᩵;

    invoke-virtual {v0}, Ll/ۧ᩵᩵;->֡֫()[B

    move-result-object v4

    invoke-virtual {v0}, Ll/ۧ᩵᩵;->᩵֫()J

    move-result-wide v17

    move-object v2, v11

    move-object v3, v12

    move-object v5, v13

    move-object/from16 v6, p1

    move/from16 v7, p2

    move/from16 v8, p3

    move-wide/from16 v9, v17

    invoke-direct/range {v2 .. v10}, Ll/۫ۚ᩵;-><init>(Ll/֨ۡ᩵;[BLl/ۘ֨᩵;Ljava/lang/String;IIJ)V

    move-wide/from16 v17, v15

    move-object v15, v12

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :cond_5
    move/from16 v8, p3

    move/from16 v7, p4

    move/from16 v6, p5

    .line 666
    invoke-virtual {v13, v5}, Ll/ۘ֨᩵;->֫(I)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v5, v1, Ll/۬ۚ᩵;->᩶:Ll/ᩳ֨᩵;

    if-eqz v0, :cond_6

    .line 667
    :try_start_1
    new-instance v0, Ll/᩷ۘ᩵;

    invoke-direct {v0, v12}, Ll/᩷ۘ᩵;-><init>(Ll/֨ۡ᩵;)V

    .line 668
    new-instance v11, Ll/ۜۘ᩵;

    move-object v2, v11

    move-object v3, v12

    move-object/from16 v4, p1

    move-object v9, v5

    move/from16 v5, p2

    move/from16 v6, p3

    move/from16 v7, p4

    move/from16 v8, p5

    move-object v14, v9

    move/from16 v9, p6

    invoke-direct/range {v2 .. v9}, Ll/ۜۘ᩵;-><init>(Ll/֨ۡ᩵;Ljava/lang/String;IIIII)V

    .line 669
    invoke-virtual {v1, v11, v0}, Ll/۬ۚ᩵;->֫(Ll/ۜۘ᩵;Ll/᩷ۘ᩵;)V

    new-array v2, v15, [Ll/֡ۚ᩵;

    .line 671
    invoke-virtual {v13, v11, v0, v2}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    .line 673
    invoke-virtual {v0}, Ll/᩷ۘ᩵;->ܺ֫()J

    move-result-wide v17

    .line 674
    invoke-virtual {v0}, Ll/᩷ۘ᩵;->ۘ֫()I

    move-result v2

    invoke-virtual {v14, v2}, Ll/ᩳ֨᩵;->֫(I)V

    .line 675
    new-instance v14, Ll/۫ۚ᩵;

    invoke-virtual {v0}, Ll/᩷ۘ᩵;->ۖ֫()I

    move-result v4

    invoke-virtual {v0}, Ll/᩷ۘ᩵;->ܺ֫()J

    move-result-wide v19

    move-object v2, v14

    move-object v3, v12

    move-object v5, v13

    move-object/from16 v6, p1

    move/from16 v7, p2

    move/from16 v8, p3

    move/from16 v9, p5

    move/from16 v10, p6

    move-object v15, v12

    move-wide/from16 v11, v19

    invoke-direct/range {v2 .. v12}, Ll/۫ۚ᩵;-><init>(Ll/֨ۡ᩵;ILl/ۘ֨᩵;Ljava/lang/String;IIIIJ)V

    move-object v11, v14

    :goto_1
    const/4 v2, 0x1

    const/4 v3, 0x1

    move-object/from16 v20, v15

    move-wide/from16 v4, v17

    const/4 v15, 0x1

    goto/16 :goto_3

    :cond_6
    move-object v14, v5

    .line 677
    new-instance v8, Ll/ۖۘ᩵;

    invoke-direct {v8, v12}, Ll/ۖۘ᩵;-><init>(Ll/֨ۡ᩵;)V

    .line 678
    new-instance v0, Ll/ܺۘ᩵;

    move-object v2, v0

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p2

    move/from16 v6, p5

    move-object/from16 v7, p1

    move-object v10, v8

    move-object v8, v12

    invoke-direct/range {v2 .. v8}, Ll/ܺۘ᩵;-><init>(IIIILjava/lang/String;Ll/֨ۡ᩵;)V

    new-array v2, v15, [Ll/֡ۚ᩵;

    invoke-virtual {v13, v0, v10, v2}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    .line 679
    invoke-virtual {v10}, Ll/ۖۘ᩵;->ۘ֫()I

    move-result v0

    invoke-virtual {v14, v0}, Ll/ᩳ֨᩵;->֫(I)V

    .line 681
    invoke-virtual {v10}, Ll/ۖۘ᩵;->ܺ֫()I

    move-result v0

    int-to-long v2, v0

    .line 690
    new-instance v0, Ll/֨ۘ᩵;

    invoke-direct {v0, v12}, Ll/֨ۘ᩵;-><init>(Ll/֨ۡ᩵;)V

    .line 691
    invoke-virtual {v0}, Ll/֨ۘ᩵;->ۡ֫()V

    .line 692
    new-instance v4, Ll/۠ۘ᩵;

    invoke-direct {v4, v12}, Ll/۠ۘ᩵;-><init>(Ll/֨ۡ᩵;)V

    .line 693
    invoke-virtual {v10}, Ll/ۖۘ᩵;->ۖ֫()I

    move-result v5

    invoke-virtual {v0, v5}, Ll/֨ۘ᩵;->ۢ(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    new-array v5, v15, [Ll/֡ۚ᩵;

    .line 695
    invoke-virtual {v13, v0, v4, v5}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    .line 696
    invoke-interface {v9}, Ll/֫᩻֨;->֫()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v4}, Ll/۠ۘ᩵;->ۡ֫()J

    move-result-wide v5

    cmp-long v0, v5, v2

    if-eqz v0, :cond_7

    const-string v0, "Open returned wrong size %d != %d"

    .line 697
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v4}, Ll/۠ۘ᩵;->ۡ֫()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    new-array v7, v11, [Ljava/lang/Object;

    aput-object v5, v7, v15

    const/4 v5, 0x1

    aput-object v6, v7, v5

    invoke-static {v0, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v9, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 699
    :cond_7
    invoke-virtual {v4}, Ll/۠ۘ᩵;->ۡ֫()J

    move-result-wide v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v0, 0x1

    goto :goto_2

    :catch_0
    move-exception v0

    :try_start_3
    const-string v4, "Seek failed"

    .line 701
    invoke-interface {v9, v4, v0}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    const/4 v0, 0x0

    :goto_2
    move-wide/from16 v17, v2

    .line 704
    new-instance v14, Ll/۫ۚ᩵;

    invoke-virtual {v10}, Ll/ۖۘ᩵;->ۖ֫()I

    move-result v4

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object v2, v14

    move-object v3, v12

    move-object v5, v13

    move-object/from16 v6, p1

    move/from16 v7, p2

    move/from16 v8, p3

    move-object/from16 v19, v10

    move v10, v11

    move-object/from16 v20, v12

    move-wide/from16 v11, v17

    invoke-direct/range {v2 .. v12}, Ll/۫ۚ᩵;-><init>(Ll/֨ۡ᩵;ILl/ۘ֨᩵;Ljava/lang/String;IIIIJ)V

    move v3, v0

    move-object v11, v14

    move-wide/from16 v4, v17

    move-object/from16 v0, v19

    .line 707
    :goto_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    move-object/from16 v12, v20

    check-cast v12, Ll/ܰۡ᩵;

    invoke-virtual {v12}, Ll/ܰۡ᩵;->֫()J

    move-result-wide v8

    add-long/2addr v6, v8

    if-eqz v3, :cond_8

    .line 710
    iput-wide v4, v1, Ll/۬ۚ᩵;->۬:J

    .line 711
    iput-wide v6, v1, Ll/۬ۚ᩵;->۫:J

    :cond_8
    if-eqz v15, :cond_9

    .line 716
    invoke-interface {v0}, Ll/ܳۖ᩵;->ۛ()J

    move-result-wide v2

    iput-wide v2, v1, Ll/۬ۚ᩵;->ۗ:J

    .line 718
    invoke-interface {v0}, Ll/ܳۖ᩵;->getAttributes()I

    move-result v0

    and-int/lit16 v0, v0, 0x7fff

    iput v0, v1, Ll/۬ۚ᩵;->᩹:I

    .line 719
    iput-wide v6, v1, Ll/۬ۚ᩵;->᩸:J

    :cond_9
    const/4 v2, 0x1

    .line 722
    iput-boolean v2, v1, Ll/۬ۚ᩵;->ۙ:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 724
    invoke-virtual {v13}, Ll/ۘ֨᩵;->close()V

    return-object v11

    :goto_4
    move-object v2, v0

    if-eqz v13, :cond_a

    .line 634
    :try_start_4
    invoke-virtual {v13}, Ll/ۘ֨᩵;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_a
    :goto_5
    throw v2
.end method

.method public final varargs ֫(Ll/ۘ֨᩵;ILl/۬ᩴ᩵;[Ll/۬ᩴ᩵;)Ll/۫ᩴ᩵;
    .locals 9

    .line 1679
    new-instance v0, Ll/֫᩵᩵;

    invoke-virtual {p1}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v1

    .line 732
    iget-object v2, p0, Ll/۬ۚ᩵;->᩶:Ll/ᩳ֨᩵;

    invoke-virtual {v2}, Ll/ᩳ֨᩵;->᩷()Ljava/lang/String;

    move-result-object v3

    .line 1679
    invoke-direct {v0, v3, v1}, Ll/֫᩵᩵;-><init>(Ljava/lang/String;Ll/֨ۡ᩵;)V

    const/4 v1, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 1681
    :try_start_0
    invoke-virtual {v0, v1}, Ll/֫᩵᩵;->ܺ(I)V

    .line 1682
    invoke-virtual {v0, v3}, Ll/֫᩵᩵;->ۖ(I)V

    const/16 v5, 0x80

    .line 1683
    invoke-virtual {v0, v5}, Ll/֫᩵᩵;->ᩴ(I)V

    .line 1684
    invoke-virtual {v0, p2}, Ll/֫᩵᩵;->ۘ(I)V

    const/4 p2, 0x3

    .line 1685
    invoke-virtual {v0, p2}, Ll/֫᩵᩵;->᩵(I)V

    if-eqz p3, :cond_0

    .line 1690
    invoke-virtual {v0, p3}, Ll/ۗᩴ᩵;->֫(Ll/ۗᩴ᩵;)Z

    .line 1693
    array-length p2, p4

    const/4 v5, 0x0

    :goto_0
    if-ge v5, p2, :cond_1

    aget-object v6, p4, v5

    .line 1694
    invoke-virtual {p3, v6}, Ll/ۗᩴ᩵;->֫(Ll/ۗᩴ᩵;)Z

    add-int/lit8 v5, v5, 0x1

    move-object p3, v6

    goto :goto_0

    :cond_0
    move-object p3, v0

    .line 1699
    :cond_1
    new-instance p2, Ll/ܰᩴ᩵;

    invoke-virtual {p1}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object p4

    .line 732
    invoke-virtual {v2}, Ll/ᩳ֨᩵;->᩷()Ljava/lang/String;

    move-result-object v2

    .line 1699
    invoke-direct {p2, v2, p4}, Ll/ܰᩴ᩵;-><init>(Ljava/lang/String;Ll/֨ۡ᩵;)V

    .line 1700
    invoke-virtual {p2}, Ll/ܰᩴ᩵;->ۘ֫()V

    .line 1701
    invoke-virtual {p3, p2}, Ll/ۗᩴ᩵;->֫(Ll/ۗᩴ᩵;)Z

    new-array p3, v3, [Ll/֡ۚ᩵;

    .line 115
    invoke-virtual {p1, v0, v4, p3}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    move-result-object p3

    .line 1703
    check-cast p3, Ll/ۧ᩵᩵;

    .line 1705
    invoke-virtual {p2}, Ll/۬ᩴ᩵;->ۧ()Ll/۫ᩴ᩵;

    move-result-object p2

    check-cast p2, Ll/۟ᩴ᩵;

    .line 1708
    invoke-virtual {p2}, Ll/۟ᩴ᩵;->᩵֫()I

    move-result p4

    and-int/2addr p4, v1

    if-eqz p4, :cond_2

    goto :goto_1

    :cond_2
    move-object p2, p3

    .line 1714
    :goto_1
    iput-boolean v1, p0, Ll/۬ۚ᩵;->ۙ:Z

    .line 1715
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1716
    invoke-interface {p2}, Ll/ܳۖ᩵;->ۛ()J

    move-result-wide v5

    iput-wide v5, p0, Ll/۬ۚ᩵;->ۗ:J

    .line 1718
    invoke-interface {p2}, Ll/ܳۖ᩵;->getAttributes()I

    move-result p4

    and-int/lit16 p4, p4, 0x7fff

    iput p4, p0, Ll/۬ۚ᩵;->᩹:I

    .line 1719
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {p1}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object p4

    check-cast p4, Ll/ܰۡ᩵;

    invoke-virtual {p4}, Ll/ܰۡ᩵;->֫()J

    move-result-wide v7

    add-long/2addr v5, v7

    iput-wide v5, p0, Ll/۬ۚ᩵;->᩸:J

    .line 1721
    invoke-interface {p2}, Ll/ܳۖ᩵;->getSize()J

    move-result-wide v5

    iput-wide v5, p0, Ll/۬ۚ᩵;->۬:J

    .line 1722
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {p1}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object p2

    check-cast p2, Ll/ܰۡ᩵;

    invoke-virtual {p2}, Ll/ܰۡ᩵;->֫()J

    move-result-wide v7

    add-long/2addr v5, v7

    iput-wide v5, p0, Ll/۬ۚ᩵;->۫:J

    .line 1723
    invoke-virtual {p3}, Ll/ۗᩴ᩵;->᩹()Ll/֫ۖ᩵;

    move-result-object p2

    check-cast p2, Ll/۫ᩴ᩵;
    :try_end_0
    .catch Ll/᩵ۡ᩵; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p2

    goto :goto_2

    :catch_1
    move-exception p2

    .line 1729
    :goto_2
    :try_start_1
    invoke-virtual {v0}, Ll/۬ᩴ᩵;->ۧ()Ll/۫ᩴ᩵;

    move-result-object p3

    check-cast p3, Ll/ۧ᩵᩵;

    .line 1730
    invoke-virtual {p3}, Ll/۫ᩴ᩵;->۟()Z

    move-result p4

    if-eqz p4, :cond_3

    invoke-virtual {p3}, Ll/ۗᩴ᩵;->ۢ֫()I

    move-result p4

    if-nez p4, :cond_3

    .line 1731
    new-instance p4, Ll/ܰᩴ᩵;

    invoke-virtual {p1}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v0

    invoke-virtual {p3}, Ll/ۧ᩵᩵;->֡֫()[B

    move-result-object p3

    invoke-direct {p4, v0, p3}, Ll/ܰᩴ᩵;-><init>(Ll/֨ۡ᩵;[B)V

    new-array p3, v1, [Ll/֡ۚ᩵;

    sget-object v0, Ll/֡ۚ᩵;->᩶:Ll/֡ۚ᩵;

    aput-object v0, p3, v3

    .line 115
    invoke-virtual {p1, p4, v4, p3}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_3

    :catch_2
    move-exception p1

    .line 1734
    sget-object p3, Ll/۬ۚ᩵;->ܰ:Ll/֫᩻֨;

    const-string p4, "Failed to close after failure"

    invoke-interface {p3, p4, p1}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 1735
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 1737
    :cond_3
    :goto_3
    throw p2
.end method

.method public final ֫(IJJJ)V
    .locals 23

    move-object/from16 v7, p0

    .line 1765
    invoke-virtual/range {p0 .. p0}, Ll/۬ۚ᩵;->ᩳ()Ll/ۘ֨᩵;

    move-result-object v8

    .line 1766
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Ll/۬ۚ᩵;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1770
    iget v0, v7, Ll/۬ۚ᩵;->᩹:I

    const/16 v1, 0x10

    and-int/lit8 v0, v0, 0x10

    .line 1772
    invoke-virtual {v8}, Ll/ۘ֨᩵;->᩸()Z

    move-result v2

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    if-eqz v2, :cond_0

    .line 1774
    new-instance v1, Ll/᩻᩵᩵;

    invoke-virtual {v8}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v2

    invoke-direct {v1, v2}, Ll/᩻᩵᩵;-><init>(Ll/֨ۡ᩵;)V

    .line 1775
    new-instance v2, Ll/ۚۖ᩵;

    or-int v13, p1, v0

    move-object v12, v2

    move-wide/from16 v14, p2

    move-wide/from16 v16, p6

    move-wide/from16 v18, p4

    invoke-direct/range {v12 .. v19}, Ll/ۚۖ᩵;-><init>(IJJJ)V

    invoke-virtual {v1, v2}, Ll/᩻᩵᩵;->֫(Ll/᩹ۖ᩵;)V

    new-array v0, v9, [Ll/۬ᩴ᩵;

    const/16 v2, 0x100

    .line 1776
    invoke-virtual {v7, v8, v2, v1, v0}, Ll/۬ۚ᩵;->֫(Ll/ۘ֨᩵;ILl/۬ᩴ᩵;[Ll/۬ᩴ᩵;)Ll/۫ᩴ᩵;

    goto/16 :goto_2

    .line 1777
    :cond_0
    invoke-virtual {v8, v1}, Ll/ۘ֨᩵;->֫(I)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v12, 0x1

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    const/4 v6, 0x1

    goto :goto_0

    :cond_1
    const/16 v1, 0x40

    const/16 v6, 0x40

    :goto_0
    const/4 v2, 0x1

    const/16 v3, 0x100

    const/4 v4, 0x3

    move-object/from16 v1, p0

    move v5, v0

    .line 1779
    invoke-virtual/range {v1 .. v6}, Ll/۬ۚ᩵;->֫(IIIII)Ll/۫ۚ᩵;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 1785
    :try_start_1
    new-instance v2, Ll/᩹ᩴ᩵;

    .line 1786
    invoke-virtual {v8}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v14

    invoke-virtual {v1}, Ll/۫ۚ᩵;->ᩳ()I

    move-result v15

    or-int v16, p1, v0

    move-object v13, v2

    move-wide/from16 v17, p2

    move-wide/from16 v19, p4

    move-wide/from16 v21, p6

    invoke-direct/range {v13 .. v22}, Ll/᩹ᩴ᩵;-><init>(Ll/֨ۡ᩵;IIJJJ)V

    new-instance v0, Ll/᩶ᩴ᩵;

    .line 1787
    invoke-virtual {v8}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v3

    invoke-direct {v0, v3}, Ll/᩶ᩴ᩵;-><init>(Ll/֨ۡ᩵;)V

    new-array v3, v12, [Ll/֡ۚ᩵;

    sget-object v4, Ll/֡ۚ᩵;->᩶:Ll/֡ۚ᩵;

    aput-object v4, v3, v9

    .line 1785
    invoke-virtual {v8, v2, v0, v3}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 227
    :try_start_2
    invoke-virtual {v1}, Ll/۫ۚ᩵;->ۘ()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object v2, v0

    :try_start_3
    invoke-virtual {v1}, Ll/۫ۚ᩵;->ۘ()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v1, v0

    .line 1779
    :try_start_4
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v2

    :cond_2
    cmp-long v0, p2, v10

    if-nez v0, :cond_3

    cmp-long v0, p6, v10

    if-nez v0, :cond_3

    .line 1794
    new-instance v0, Ll/᩹ۘ᩵;

    .line 1795
    invoke-virtual {v8}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v1

    .line 732
    iget-object v2, v7, Ll/۬ۚ᩵;->᩶:Ll/ᩳ֨᩵;

    invoke-virtual {v2}, Ll/ᩳ֨᩵;->᩷()Ljava/lang/String;

    move-result-object v2

    .line 1795
    invoke-virtual {v8}, Ll/ۘ֨᩵;->ۘ()J

    move-result-wide v3

    sub-long v3, p4, v3

    move-object/from16 p2, v0

    move-object/from16 p3, v1

    move-object/from16 p4, v2

    move/from16 p5, p1

    move-wide/from16 p6, v3

    invoke-direct/range {p2 .. p7}, Ll/᩹ۘ᩵;-><init>(Ll/֨ۡ᩵;Ljava/lang/String;IJ)V

    new-instance v1, Ll/᩶ۘ᩵;

    .line 1796
    invoke-virtual {v8}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v2

    invoke-direct {v1, v2}, Ll/᩶ۘ᩵;-><init>(Ll/֨ۡ᩵;)V

    new-array v2, v9, [Ll/֡ۚ᩵;

    .line 1794
    invoke-virtual {v8, v0, v1, v2}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    .line 1799
    :goto_2
    iput-wide v10, v7, Ll/۬ۚ᩵;->᩸:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 1800
    invoke-virtual {v8}, Ll/ۘ֨᩵;->close()V

    return-void

    .line 1792
    :cond_3
    :try_start_5
    new-instance v0, Ll/֡֨᩵;

    const-string v1, "Cannot set creation or access time without CAP_NT_SMBS"

    .line 44
    invoke-direct {v0, v1}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    .line 1792
    throw v0

    .line 1767
    :cond_4
    new-instance v0, Ll/ۗۚ᩵;

    const v1, -0x3fffffcc    # -2.0000124f

    invoke-direct {v0, v1}, Ll/ۗۚ᩵;-><init>(I)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v0

    move-object v1, v0

    if-eqz v8, :cond_5

    .line 1765
    :try_start_6
    invoke-virtual {v8}, Ll/ۘ֨᩵;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_3
    throw v1
.end method

.method public final ֫(JJJ)V
    .locals 9

    .line 1806
    iget-object v0, p0, Ll/۬ۚ᩵;->᩶:Ll/ᩳ֨᩵;

    invoke-virtual {v0}, Ll/ᩳ֨᩵;->ۖ()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v2, 0x0

    move-object v1, p0

    move-wide v3, p1

    move-wide v5, p3

    move-wide v7, p5

    .line 1811
    :try_start_0
    invoke-virtual/range {v1 .. v8}, Ll/۬ۚ᩵;->֫(IJJJ)V
    :try_end_0
    .catch Ll/᩵ۡ᩵; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 1813
    invoke-static {p1}, Ll/ۗۚ᩵;->֫(Ll/᩵ۡ᩵;)Ll/ۗۚ᩵;

    move-result-object p1

    throw p1

    .line 1807
    :cond_0
    new-instance p1, Ll/ۗۚ᩵;

    const-string p2, "Invalid operation for workgroups, servers, or shares"

    invoke-direct {p1, p2}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 9

    .line 1425
    sget-object v0, Ll/۬ۚ᩵;->ܰ:Ll/֫᩻֨;

    const-string v1, "delete: "

    iget-object v2, p0, Ll/۬ۚ᩵;->᩶:Ll/ᩳ֨᩵;

    invoke-virtual {v2}, Ll/ᩳ֨᩵;->ۖ()Z

    move-result v2

    if-nez v2, :cond_b

    .line 1429
    invoke-virtual {p0}, Ll/۬ۚ᩵;->ᩳ()Ll/ۘ֨᩵;

    move-result-object v2

    .line 1430
    :try_start_0
    invoke-virtual {p0}, Ll/۬ۚ᩵;->ܳ()Z

    move-result v3

    if-eqz v3, :cond_9

    .line 1434
    iget v3, p0, Ll/۬ۚ᩵;->᩹:I

    const/4 v4, 0x1

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    .line 1435
    invoke-virtual {p0}, Ll/۬ۚ᩵;->ۘ()V

    .line 1442
    :cond_0
    invoke-interface {v0}, Ll/֫᩻֨;->֫()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 1443
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 1446
    :cond_1
    iget v1, p0, Ll/۬ۚ᩵;->᩹:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    and-int/lit8 v1, v1, 0x10

    const/high16 v3, 0x10000

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v1, :cond_6

    .line 1453
    :try_start_1
    invoke-static {p0}, Ll/ۙۚ᩵;->֫(Ll/۬ۚ᩵;)Ll/ۚۡ᩵;

    move-result-object v1
    :try_end_1
    .catch Ll/ۗۚ᩵; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 1454
    :goto_0
    :try_start_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    .line 1455
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۤۡ᩵;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1457
    :try_start_3
    invoke-interface {v7}, Ll/ۤۡ᩵;->delete()V
    :try_end_3
    .catch Ll/᩵ۡ᩵; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1461
    :try_start_4
    invoke-interface {v7}, Ljava/lang/AutoCloseable;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_0

    :catchall_0
    move-exception v8

    goto :goto_1

    :catch_0
    move-exception v8

    .line 1459
    :try_start_5
    invoke-static {v8}, Ll/ۗۚ᩵;->֫(Ll/᩵ۡ᩵;)Ll/ۗۚ᩵;

    move-result-object v8

    throw v8
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_1
    if-eqz v7, :cond_2

    .line 1455
    :try_start_6
    invoke-interface {v7}, Ljava/lang/AutoCloseable;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v7

    :try_start_7
    invoke-virtual {v8, v7}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_2
    throw v8
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 1463
    :cond_3
    :try_start_8
    invoke-interface {v1}, Ll/ۚۡ᩵;->close()V
    :try_end_8
    .catch Ll/ۗۚ᩵; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    goto :goto_4

    :catchall_2
    move-exception v7

    .line 1452
    :try_start_9
    invoke-interface {v1}, Ll/ۚۡ᩵;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception v1

    :try_start_a
    invoke-virtual {v7, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v7
    :try_end_a
    .catch Ll/ۗۚ᩵; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    :catch_1
    move-exception v1

    :try_start_b
    const-string v7, "delete"

    .line 1469
    invoke-interface {v0, v7, v1}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 1470
    invoke-virtual {v1}, Ll/ۗۚ᩵;->֫()I

    move-result v0

    const v7, -0x3ffffff1    # -2.0000036f

    if-ne v0, v7, :cond_5

    .line 1475
    :goto_4
    invoke-virtual {v2}, Ll/ۘ֨᩵;->᩸()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1476
    new-instance v0, Ll/֫᩵᩵;

    invoke-virtual {v2}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ll/֫᩵᩵;-><init>(Ljava/lang/String;Ll/֨ۡ᩵;)V

    .line 1477
    invoke-virtual {v0, v3}, Ll/֫᩵᩵;->ۘ(I)V

    const/16 v1, 0x1001

    .line 1478
    invoke-virtual {v0, v1}, Ll/֫᩵᩵;->ۖ(I)V

    .line 1479
    invoke-virtual {v0, v4}, Ll/֫᩵᩵;->ܺ(I)V

    .line 1480
    new-instance v1, Ll/ܰᩴ᩵;

    invoke-virtual {v2}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v3

    invoke-direct {v1, p1, v3}, Ll/ܰᩴ᩵;-><init>(Ljava/lang/String;Ll/֨ۡ᩵;)V

    invoke-virtual {v0, v1}, Ll/ۗᩴ᩵;->֫(Ll/ۗᩴ᩵;)Z

    new-array p1, v5, [Ll/֡ۚ᩵;

    .line 115
    invoke-virtual {v2, v0, v6, p1}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    goto :goto_5

    .line 1483
    :cond_4
    new-instance v0, Ll/ᩳۘ᩵;

    invoke-virtual {v2}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ll/ᩳۘ᩵;-><init>(Ljava/lang/String;Ll/֨ۡ᩵;)V

    new-instance p1, Ll/۟ۖ᩵;

    invoke-virtual {v2}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v1

    invoke-direct {p1, v1}, Ll/۟ۖ᩵;-><init>(Ll/֨ۡ᩵;)V

    new-array v1, v5, [Ll/֡ۚ᩵;

    invoke-virtual {v2, v0, p1, v1}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    goto :goto_5

    .line 1471
    :cond_5
    throw v1

    .line 1487
    :cond_6
    invoke-virtual {v2}, Ll/ۘ֨᩵;->᩸()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1488
    new-instance v0, Ll/֫᩵᩵;

    invoke-virtual {v2}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v1

    invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4, v1}, Ll/֫᩵᩵;-><init>(Ljava/lang/String;Ll/֨ۡ᩵;)V

    .line 1489
    invoke-virtual {v0, v3}, Ll/֫᩵᩵;->ۘ(I)V

    const/16 v1, 0x1000

    .line 1490
    invoke-virtual {v0, v1}, Ll/֫᩵᩵;->ۖ(I)V

    .line 1491
    new-instance v1, Ll/ܰᩴ᩵;

    invoke-virtual {v2}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v3

    invoke-direct {v1, p1, v3}, Ll/ܰᩴ᩵;-><init>(Ljava/lang/String;Ll/֨ۡ᩵;)V

    invoke-virtual {v0, v1}, Ll/ۗᩴ᩵;->֫(Ll/ۗᩴ᩵;)Z

    new-array p1, v5, [Ll/֡ۚ᩵;

    .line 115
    invoke-virtual {v2, v0, v6, p1}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    goto :goto_5

    .line 1494
    :cond_7
    new-instance v0, Ll/ܽۘ᩵;

    invoke-virtual {v2}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ll/ܽۘ᩵;-><init>(Ljava/lang/String;Ll/֨ۡ᩵;)V

    new-instance p1, Ll/۟ۖ᩵;

    invoke-virtual {v2}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v1

    invoke-direct {p1, v1}, Ll/۟ۖ᩵;-><init>(Ll/֨ۡ᩵;)V

    new-array v1, v5, [Ll/֡ۚ᩵;

    invoke-virtual {v2, v0, p1, v1}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    :goto_5
    const-wide/16 v0, 0x0

    .line 1497
    iput-wide v0, p0, Ll/۬ۚ᩵;->۫:J

    iput-wide v0, p0, Ll/۬ۚ᩵;->᩸:J
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    if-eqz v2, :cond_8

    .line 1498
    invoke-virtual {v2}, Ll/ۘ֨᩵;->close()V

    :cond_8
    return-void

    .line 1431
    :cond_9
    :try_start_c
    new-instance p1, Ll/ۗۚ᩵;

    const v0, -0x3fffffcc    # -2.0000124f

    invoke-direct {p1, v0}, Ll/ۗۚ᩵;-><init>(I)V

    throw p1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    :catchall_4
    move-exception p1

    if-eqz v2, :cond_a

    .line 1429
    :try_start_d
    invoke-virtual {v2}, Ll/ۘ֨᩵;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    goto :goto_6

    :catchall_5
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_a
    :goto_6
    throw p1

    .line 1426
    :cond_b
    new-instance p1, Ll/ۗۚ᩵;

    const-string v0, "Invalid operation for workgroups, servers, or shares"

    invoke-direct {p1, v0}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۘ֨᩵;Ljava/lang/String;I)V
    .locals 6

    .line 745
    sget-object v0, Ll/۬ۚ᩵;->ܰ:Ll/֫᩻֨;

    invoke-interface {v0}, Ll/֫᩻֨;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 746
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "queryPath: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 757
    :cond_0
    invoke-virtual {p1}, Ll/ۘ֨᩵;->᩸()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    const/4 p2, 0x0

    new-array p3, v2, [Ll/۬ᩴ᩵;

    const/16 v0, 0x80

    .line 759
    invoke-virtual {p0, p1, v0, p2, p3}, Ll/۬ۚ᩵;->֫(Ll/ۘ֨᩵;ILl/۬ᩴ᩵;[Ll/۬ᩴ᩵;)Ll/۫ᩴ᩵;

    move-result-object p1

    check-cast p1, Ll/ܳۖ᩵;

    return-void

    :cond_1
    const/16 v1, 0x10

    .line 765
    invoke-virtual {p1, v1}, Ll/ۘ֨᩵;->֫(I)Z

    move-result v1

    const/4 v3, 0x1

    if-eqz v1, :cond_5

    .line 769
    new-instance v1, Ll/᩸ᩴ᩵;

    invoke-virtual {p1}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v4

    invoke-direct {v1, v4, p3}, Ll/᩸ᩴ᩵;-><init>(Ll/֨ۡ᩵;I)V

    .line 770
    new-instance v4, Ll/ܶᩴ᩵;

    invoke-virtual {p1}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v5

    invoke-direct {v4, v5, p2, p3}, Ll/ܶᩴ᩵;-><init>(Ll/֨ۡ᩵;Ljava/lang/String;I)V

    new-array p2, v2, [Ll/֡ۚ᩵;

    invoke-virtual {p1, v4, v1, p2}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    move-result-object p2

    check-cast p2, Ll/᩸ᩴ᩵;

    .line 772
    invoke-interface {v0}, Ll/֫᩻֨;->֫()Z

    move-result p3

    if-eqz p3, :cond_2

    .line 773
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v1, "Path information "

    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-interface {v0, p3}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 775
    :cond_2
    invoke-virtual {p2}, Ll/᩸ᩴ᩵;->֡֫()Ll/᩹ۖ᩵;

    move-result-object p2

    check-cast p2, Ll/֡ۖ᩵;

    .line 776
    iput-boolean v3, p0, Ll/۬ۚ᩵;->ۙ:Z

    .line 777
    instance-of p3, p2, Ll/ۚۖ᩵;

    if-eqz p3, :cond_3

    .line 778
    check-cast p2, Ll/ۚۖ᩵;

    invoke-virtual {p2}, Ll/ۚۖ᩵;->getAttributes()I

    move-result p3

    and-int/lit16 p3, p3, 0x7fff

    iput p3, p0, Ll/۬ۚ᩵;->᩹:I

    .line 780
    invoke-virtual {p2}, Ll/ۚۖ᩵;->ۛ()J

    move-result-wide p2

    iput-wide p2, p0, Ll/۬ۚ᩵;->ۗ:J

    .line 782
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    invoke-virtual {p1}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object p1

    check-cast p1, Ll/ܰۡ᩵;

    invoke-virtual {p1}, Ll/ܰۡ᩵;->֫()J

    move-result-wide v0

    add-long/2addr v0, p2

    iput-wide v0, p0, Ll/۬ۚ᩵;->᩸:J

    return-void

    .line 783
    :cond_3
    instance-of p3, p2, Ll/ۗۖ᩵;

    if-eqz p3, :cond_4

    .line 784
    check-cast p2, Ll/ۗۖ᩵;

    invoke-virtual {p2}, Ll/ۗۖ᩵;->getSize()J

    move-result-wide p2

    iput-wide p2, p0, Ll/۬ۚ᩵;->۬:J

    .line 785
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    invoke-virtual {p1}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object p1

    check-cast p1, Ll/ܰۡ᩵;

    invoke-virtual {p1}, Ll/ܰۡ᩵;->֫()J

    move-result-wide v0

    add-long/2addr v0, p2

    iput-wide v0, p0, Ll/۬ۚ᩵;->۫:J

    :cond_4
    return-void

    .line 793
    :cond_5
    new-instance p3, Ll/ᩴۘ᩵;

    invoke-virtual {p1}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۘ֨᩵;->ۘ()J

    move-result-wide v4

    invoke-direct {p3, v1, v4, v5}, Ll/ᩴۘ᩵;-><init>(Ll/֨ۡ᩵;J)V

    .line 794
    new-instance v1, Ll/ۘۘ᩵;

    invoke-virtual {p1}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v4

    invoke-direct {v1, p2, v4}, Ll/ۘۘ᩵;-><init>(Ljava/lang/String;Ll/֨ۡ᩵;)V

    new-array p2, v2, [Ll/֡ۚ᩵;

    invoke-virtual {p1, v1, p3, p2}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    move-result-object p2

    check-cast p2, Ll/ᩴۘ᩵;

    .line 795
    invoke-interface {v0}, Ll/֫᩻֨;->֫()Z

    move-result p3

    if-eqz p3, :cond_6

    .line 796
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v1, "Legacy path information "

    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-interface {v0, p3}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 799
    :cond_6
    iput-boolean v3, p0, Ll/۬ۚ᩵;->ۙ:Z

    .line 800
    invoke-virtual {p2}, Ll/ᩴۘ᩵;->getAttributes()I

    move-result p3

    and-int/lit16 p3, p3, 0x7fff

    iput p3, p0, Ll/۬ۚ᩵;->᩹:I

    .line 801
    invoke-virtual {p2}, Ll/ᩴۘ᩵;->ۛ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/۬ۚ᩵;->ۗ:J

    .line 802
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object p3

    check-cast p3, Ll/ܰۡ᩵;

    invoke-virtual {p3}, Ll/ܰۡ᩵;->֫()J

    move-result-wide v2

    add-long/2addr v2, v0

    iput-wide v2, p0, Ll/۬ۚ᩵;->᩸:J

    .line 804
    invoke-virtual {p2}, Ll/ᩴۘ᩵;->getSize()J

    move-result-wide p2

    iput-wide p2, p0, Ll/۬ۚ᩵;->۬:J

    .line 805
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    invoke-virtual {p1}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object p1

    check-cast p1, Ll/ܰۡ᩵;

    invoke-virtual {p1}, Ll/ܰۡ᩵;->֫()J

    move-result-wide v0

    add-long/2addr v0, p2

    iput-wide v0, p0, Ll/۬ۚ᩵;->۫:J

    return-void
.end method

.method public ֫(Ll/ۜۘ᩵;Ll/᩷ۘ᩵;)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ۤۡ᩵;)V
    .locals 8

    .line 1288
    iget-object v0, p0, Ll/۬ۚ᩵;->᩶:Ll/ᩳ֨᩵;

    const-string v1, "renameTo: "

    instance-of v2, p1, Ll/۬ۚ᩵;

    if-eqz v2, :cond_9

    .line 1291
    check-cast p1, Ll/۬ۚ᩵;

    iget-object v2, p1, Ll/۬ۚ᩵;->᩶:Ll/ᩳ֨᩵;

    .line 1292
    :try_start_0
    invoke-virtual {p0}, Ll/۬ۚ᩵;->ᩳ()Ll/ۘ֨᩵;

    move-result-object v3
    :try_end_0
    .catch Ll/᩵ۡ᩵; {:try_start_0 .. :try_end_0} :catch_0

    .line 1293
    :try_start_1
    invoke-virtual {p1}, Ll/۬ۚ᩵;->ᩳ()Ll/ۘ֨᩵;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 1296
    :try_start_2
    invoke-virtual {p0}, Ll/۬ۚ᩵;->ܳ()Z

    move-result v5

    if-eqz v5, :cond_6

    .line 1299
    invoke-virtual {p1}, Ll/۬ۚ᩵;->ܳ()Z

    .line 1301
    invoke-virtual {v0}, Ll/ᩳ֨᩵;->ۖ()Z

    move-result v5

    if-nez v5, :cond_5

    invoke-virtual {v2}, Ll/ᩳ֨᩵;->ۖ()Z

    move-result v5

    if-nez v5, :cond_5

    .line 1305
    invoke-virtual {v3, v4}, Ll/ۘ֨᩵;->֫(Ll/ᩴ֨᩵;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 1307
    invoke-virtual {p0}, Ll/۬ۚ᩵;->ܳ()Z

    .line 1308
    invoke-virtual {p1}, Ll/۬ۚ᩵;->ܳ()Z

    .line 987
    invoke-virtual {v0}, Ll/ᩳ֨᩵;->ܿ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Ll/ᩳ֨᩵;->ܿ()Ljava/lang/String;

    move-result-object v6

    .line 1310
    invoke-static {v5, v6}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 976
    invoke-virtual {v0}, Ll/ᩳ֨᩵;->ܳ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Ll/ᩳ֨᩵;->ܳ()Ljava/lang/String;

    move-result-object v6

    .line 1310
    invoke-static {v5, v6}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    .line 1311
    :cond_0
    new-instance p1, Ll/ۗۚ᩵;

    const-string v0, "Cannot rename between different trees"

    invoke-direct {p1, v0}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1315
    :cond_1
    :goto_0
    sget-object v5, Ll/۬ۚ᩵;->ܰ:Ll/֫᩻֨;

    invoke-interface {v5}, Ll/֫᩻֨;->֫()Z

    move-result v6

    if-eqz v6, :cond_2

    .line 1316
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 732
    invoke-virtual {v0}, Ll/ᩳ֨᩵;->᩷()Ljava/lang/String;

    move-result-object v1

    .line 1316
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> "

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 732
    invoke-virtual {v2}, Ll/ᩳ֨᩵;->᩷()Ljava/lang/String;

    move-result-object v1

    .line 1316
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_2
    const-wide/16 v5, 0x0

    .line 1319
    iput-wide v5, p1, Ll/۬ۚ᩵;->۫:J

    iput-wide v5, p1, Ll/۬ۚ᩵;->᩸:J

    .line 1323
    invoke-virtual {v3}, Ll/ۘ֨᩵;->᩸()Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    .line 1324
    new-instance p1, Ll/᩻᩵᩵;

    invoke-virtual {v3}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v0

    invoke-direct {p1, v0}, Ll/᩻᩵᩵;-><init>(Ll/֨ۡ᩵;)V

    .line 1325
    new-instance v0, Ll/ۙۖ᩵;

    .line 732
    invoke-virtual {v2}, Ll/ᩳ֨᩵;->᩷()Ljava/lang/String;

    move-result-object v2

    const/4 v7, 0x1

    .line 1325
    invoke-virtual {v2, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ll/ۙۖ᩵;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ll/᩻᩵᩵;->֫(Ll/᩹ۖ᩵;)V

    new-array v0, v1, [Ll/۬ᩴ᩵;

    const v1, 0x10100

    .line 1326
    invoke-virtual {p0, v3, v1, p1, v0}, Ll/۬ۚ᩵;->֫(Ll/ۘ֨᩵;ILl/۬ᩴ᩵;[Ll/۬ᩴ᩵;)Ll/۫ᩴ᩵;

    goto :goto_1

    .line 1332
    :cond_3
    new-instance p1, Ll/ۚۘ᩵;

    invoke-virtual {v3}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v7

    .line 732
    invoke-virtual {v0}, Ll/ᩳ֨᩵;->᩷()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Ll/ᩳ֨᩵;->᩷()Ljava/lang/String;

    move-result-object v2

    .line 1332
    invoke-direct {p1, v7, v0, v2}, Ll/ۚۘ᩵;-><init>(Ll/֨ۡ᩵;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ll/۟ۖ᩵;

    invoke-virtual {v3}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v2

    invoke-direct {v0, v2}, Ll/۟ۖ᩵;-><init>(Ll/֨ۡ᩵;)V

    new-array v1, v1, [Ll/֡ۚ᩵;

    invoke-virtual {v3, p1, v0, v1}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    .line 1335
    :goto_1
    iput-wide v5, p0, Ll/۬ۚ᩵;->۫:J

    iput-wide v5, p0, Ll/۬ۚ᩵;->᩸:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v4, :cond_4

    .line 1336
    :try_start_3
    invoke-virtual {v4}, Ll/ۘ֨᩵;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :cond_4
    :try_start_4
    invoke-virtual {v3}, Ll/ۘ֨᩵;->close()V
    :try_end_4
    .catch Ll/᩵ۡ᩵; {:try_start_4 .. :try_end_4} :catch_0

    return-void

    .line 1302
    :cond_5
    :try_start_5
    new-instance p1, Ll/ۗۚ᩵;

    const-string v0, "Invalid operation for workgroups, servers, or shares"

    invoke-direct {p1, v0}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1297
    :cond_6
    new-instance p1, Ll/ۗۚ᩵;

    const v0, -0x3fffffcc    # -2.0000124f

    invoke-direct {p1, v0}, Ll/ۗۚ᩵;-><init>(I)V

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catchall_0
    move-exception p1

    if-eqz v4, :cond_7

    .line 1292
    :try_start_6
    invoke-virtual {v4}, Ll/ۘ֨᩵;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    :try_start_7
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_7
    :goto_2
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catchall_2
    move-exception p1

    if-eqz v3, :cond_8

    :try_start_8
    invoke-virtual {v3}, Ll/ۘ֨᩵;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception v0

    :try_start_9
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_8
    :goto_3
    throw p1
    :try_end_9
    .catch Ll/᩵ۡ᩵; {:try_start_9 .. :try_end_9} :catch_0

    :catch_0
    move-exception p1

    .line 1337
    invoke-static {p1}, Ll/ۗۚ᩵;->֫(Ll/᩵ۡ᩵;)Ll/ۗۚ᩵;

    move-result-object p1

    throw p1

    .line 1289
    :cond_9
    new-instance p1, Ll/ۗۚ᩵;

    const-string v0, "Invalid target resource"

    invoke-direct {p1, v0}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۖ()V
    .locals 1

    .line 586
    iget-object v0, p0, Ll/۬ۚ᩵;->ۛ:Ll/ۖ֨᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final ۘ()V
    .locals 10

    .line 1862
    iget-object v0, p0, Ll/۬ۚ᩵;->᩶:Ll/ᩳ֨᩵;

    invoke-virtual {v0}, Ll/ᩳ֨᩵;->ۖ()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 1865
    :cond_0
    invoke-virtual {p0}, Ll/۬ۚ᩵;->ܳ()Z

    .line 1866
    iget v1, p0, Ll/۬ۚ᩵;->᩹:I

    and-int/lit16 v1, v1, 0x7fff

    .line 1872
    :goto_0
    invoke-virtual {v0}, Ll/ᩳ֨᩵;->ۖ()Z

    move-result v0

    if-nez v0, :cond_2

    and-int/lit16 v3, v1, 0x30a6

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v4, 0x0

    move-object v2, p0

    .line 1876
    :try_start_0
    invoke-virtual/range {v2 .. v9}, Ll/۬ۚ᩵;->֫(IJJJ)V
    :try_end_0
    .catch Ll/ۗۚ᩵; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/᩵ۡ᩵; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 1883
    invoke-static {v0}, Ll/ۗۚ᩵;->֫(Ll/᩵ۡ᩵;)Ll/ۗۚ᩵;

    move-result-object v0

    throw v0

    :catch_1
    move-exception v0

    .line 1878
    invoke-virtual {v0}, Ll/ۗۚ᩵;->֫()I

    move-result v1

    const v2, -0x3fffff45    # -2.0000446f

    if-eq v1, v2, :cond_1

    .line 1879
    throw v0

    .line 1881
    :cond_1
    new-instance v0, Ll/֡֨᩵;

    const-string v1, "Attribute not supported by server"

    .line 44
    invoke-direct {v0, v1}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    .line 1881
    throw v0

    .line 1873
    :cond_2
    new-instance v0, Ll/ۗۚ᩵;

    const-string v1, "Invalid operation for workgroups, servers, or shares"

    invoke-direct {v0, v1}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۚ()J
    .locals 2

    .line 1091
    iget-object v0, p0, Ll/۬ۚ᩵;->᩶:Ll/ᩳ֨᩵;

    invoke-virtual {v0}, Ll/ᩳ֨᩵;->ۖ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1092
    invoke-virtual {p0}, Ll/۬ۚ᩵;->ܳ()Z

    .line 1093
    iget-wide v0, p0, Ll/۬ۚ᩵;->ۗ:J

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final ۚۧ()Ll/ۛۡ᩵;
    .locals 1

    .line 607
    iget-object v0, p0, Ll/۬ۚ᩵;->᩶:Ll/ᩳ֨᩵;

    return-object v0
.end method

.method public final ۜ()V
    .locals 6

    const-string v0, "mkdir: "

    .line 1590
    iget-object v1, p0, Ll/۬ۚ᩵;->᩶:Ll/ᩳ֨᩵;

    invoke-virtual {v1}, Ll/ᩳ֨᩵;->᩷()Ljava/lang/String;

    move-result-object v2

    .line 1592
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_3

    .line 1596
    :try_start_0
    invoke-virtual {p0}, Ll/۬ۚ᩵;->ᩳ()Ll/ۘ֨᩵;

    move-result-object v2
    :try_end_0
    .catch Ll/᩵ۡ᩵; {:try_start_0 .. :try_end_0} :catch_0

    .line 1600
    :try_start_1
    invoke-virtual {p0}, Ll/۬ۚ᩵;->ܳ()Z

    .line 1602
    invoke-virtual {v1}, Ll/ᩳ֨᩵;->᩷()Ljava/lang/String;

    move-result-object v1

    .line 1608
    sget-object v4, Ll/۬ۚ᩵;->ܰ:Ll/֫᩻֨;

    invoke-interface {v4}, Ll/֫᩻֨;->֫()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 1609
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 1612
    :cond_0
    invoke-virtual {v2}, Ll/ۘ֨᩵;->᩸()Z

    move-result v0

    const/4 v4, 0x0

    if-eqz v0, :cond_1

    .line 1613
    new-instance v0, Ll/֫᩵᩵;

    invoke-virtual {v2}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v5

    invoke-direct {v0, v1, v5}, Ll/֫᩵᩵;-><init>(Ljava/lang/String;Ll/֨ۡ᩵;)V

    const/4 v5, 0x2

    .line 1614
    invoke-virtual {v0, v5}, Ll/֫᩵᩵;->ܺ(I)V

    .line 1615
    invoke-virtual {v0, v3}, Ll/֫᩵᩵;->ۖ(I)V

    .line 1616
    new-instance v3, Ll/ܰᩴ᩵;

    invoke-virtual {v2}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v5

    invoke-direct {v3, v1, v5}, Ll/ܰᩴ᩵;-><init>(Ljava/lang/String;Ll/֨ۡ᩵;)V

    invoke-virtual {v0, v3}, Ll/ۗᩴ᩵;->֫(Ll/ۗᩴ᩵;)Z

    new-array v1, v4, [Ll/֡ۚ᩵;

    const/4 v3, 0x0

    .line 115
    invoke-virtual {v2, v0, v3, v1}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    goto :goto_0

    .line 1619
    :cond_1
    new-instance v0, Ll/ۧۘ᩵;

    invoke-virtual {v2}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v3

    invoke-direct {v0, v1, v3}, Ll/ۧۘ᩵;-><init>(Ljava/lang/String;Ll/֨ۡ᩵;)V

    new-instance v1, Ll/۟ۖ᩵;

    invoke-virtual {v2}, Ll/ۘ֨᩵;->ܳ()Ll/֨ۡ᩵;

    move-result-object v3

    invoke-direct {v1, v3}, Ll/۟ۖ᩵;-><init>(Ll/֨ۡ᩵;)V

    new-array v3, v4, [Ll/֡ۚ᩵;

    invoke-virtual {v2, v0, v1, v3}, Ll/ۘ֨᩵;->֫(Ll/۟ܺ᩵;Ll/֫ۖ᩵;[Ll/֡ۚ᩵;)Ll/֫ۖ᩵;

    :goto_0
    const-wide/16 v0, 0x0

    .line 1621
    iput-wide v0, p0, Ll/۬ۚ᩵;->۫:J

    iput-wide v0, p0, Ll/۬ۚ᩵;->᩸:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1622
    :try_start_2
    invoke-virtual {v2}, Ll/ۘ֨᩵;->close()V
    :try_end_2
    .catch Ll/᩵ۡ᩵; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catchall_0
    move-exception v0

    if-eqz v2, :cond_2

    .line 1596
    :try_start_3
    invoke-virtual {v2}, Ll/ۘ֨᩵;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    throw v0
    :try_end_4
    .catch Ll/᩵ۡ᩵; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception v0

    .line 1623
    invoke-static {v0}, Ll/ۗۚ᩵;->֫(Ll/᩵ۡ᩵;)Ll/ۗۚ᩵;

    move-result-object v0

    throw v0

    .line 1593
    :cond_3
    new-instance v0, Ll/ۗۚ᩵;

    const-string v1, "Invalid operation for workgroups, servers, or shares"

    invoke-direct {v0, v1}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܳ()Z
    .locals 8

    .line 813
    iget-object v0, p0, Ll/۬ۚ᩵;->ۤ:Ll/ᩴۡ᩵;

    iget-object v1, p0, Ll/۬ۚ᩵;->᩶:Ll/ᩳ֨᩵;

    iget-wide v2, p0, Ll/۬ۚ᩵;->᩸:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sget-object v6, Ll/۬ۚ᩵;->ܰ:Ll/֫᩻֨;

    cmp-long v7, v2, v4

    if-lez v7, :cond_0

    const-string v0, "Using cached attributes"

    .line 814
    invoke-interface {v6, v0}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 815
    iget-boolean v0, p0, Ll/۬ۚ᩵;->ۙ:Z

    return v0

    :cond_0
    const/16 v2, 0x11

    .line 818
    iput v2, p0, Ll/۬ۚ᩵;->᩹:I

    const-wide/16 v2, 0x0

    .line 820
    iput-wide v2, p0, Ll/۬ۚ᩵;->ۗ:J

    const/4 v2, 0x0

    .line 822
    iput-boolean v2, p0, Ll/۬ۚ᩵;->ۙ:Z

    .line 825
    :try_start_0
    iget-object v3, p0, Ljava/net/URLConnection;->url:Ljava/net/URL;

    invoke-virtual {v3}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_1

    goto :goto_1

    .line 826
    :cond_1
    invoke-virtual {v1}, Ll/ᩳ֨᩵;->ܳ()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    .line 827
    invoke-virtual {v1}, Ll/ᩳ֨᩵;->ۜ()I

    move-result v1

    const/4 v3, 0x2

    if-ne v1, v3, :cond_2

    .line 828
    invoke-interface {v0}, Ll/ᩴۡ᩵;->ܽ()Ll/᩶ۡ᩵;

    move-result-object v1

    iget-object v3, p0, Ljava/net/URLConnection;->url:Ljava/net/URL;

    invoke-virtual {v3}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v3

    check-cast v1, Ll/ۢ֡᩵;

    .line 933
    invoke-virtual {v1, v3, v4}, Ll/ۢ֡᩵;->֫(Ljava/lang/String;Z)[Ll/֡֡᩵;

    move-result-object v1

    aget-object v1, v1, v2

    goto :goto_1

    .line 830
    :cond_2
    invoke-interface {v0}, Ll/ᩴۡ᩵;->ܽ()Ll/᩶ۡ᩵;

    move-result-object v1

    iget-object v3, p0, Ljava/net/URLConnection;->url:Ljava/net/URL;

    invoke-virtual {v3}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v3

    check-cast v1, Ll/ۢ֡᩵;

    .line 933
    invoke-virtual {v1, v3, v2}, Ll/ۢ֡᩵;->֫(Ljava/lang/String;Z)[Ll/֡֡᩵;

    move-result-object v1

    aget-object v1, v1, v2

    .line 830
    invoke-virtual {v1}, Ll/֡֡᩵;->ۧ()Ljava/lang/String;

    goto :goto_1

    .line 835
    :cond_3
    invoke-virtual {p0}, Ll/۬ۚ᩵;->ᩳ()Ll/ۘ֨᩵;

    move-result-object v2
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ll/ۗۚ᩵; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/᩵ۡ᩵; {:try_start_0 .. :try_end_0} :catch_0

    .line 836
    :try_start_1
    invoke-virtual {v1}, Ll/ᩳ֨᩵;->ۜ()I

    move-result v3

    const/16 v5, 0x8

    if-ne v3, v5, :cond_4

    .line 838
    invoke-virtual {p0}, Ll/۬ۚ᩵;->ᩳ()Ll/ۘ֨᩵;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 839
    invoke-virtual {v1}, Ll/ۘ֨᩵;->close()V

    goto :goto_0

    .line 841
    :cond_4
    invoke-virtual {v1}, Ll/ᩳ֨᩵;->᩷()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x4

    invoke-virtual {p0, v2, v1, v3}, Ll/۬ۚ᩵;->֫(Ll/ۘ֨᩵;Ljava/lang/String;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_5
    :goto_0
    if-eqz v2, :cond_6

    .line 843
    :try_start_2
    invoke-virtual {v2}, Ll/ۘ֨᩵;->close()V

    .line 850
    :cond_6
    :goto_1
    iput-boolean v4, p0, Ll/۬ۚ᩵;->ۙ:Z
    :try_end_2
    .catch Ljava/net/UnknownHostException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ll/ۗۚ᩵; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ll/᩵ۡ᩵; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    :catchall_0
    move-exception v1

    if-eqz v2, :cond_7

    .line 835
    :try_start_3
    invoke-virtual {v2}, Ll/ۘ֨᩵;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v2

    :try_start_4
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_7
    :goto_2
    throw v1
    :try_end_4
    .catch Ljava/net/UnknownHostException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ll/ۗۚ᩵; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ll/᩵ۡ᩵; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception v0

    .line 866
    invoke-static {v0}, Ll/ۗۚ᩵;->֫(Ll/᩵ۡ᩵;)Ll/ۗۚ᩵;

    move-result-object v0

    throw v0

    :catch_1
    move-exception v1

    const-string v2, "exists:"

    .line 855
    invoke-interface {v6, v2, v1}, Ll/֫᩻֨;->ܽ(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 856
    invoke-virtual {v1}, Ll/ۗۚ᩵;->֫()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    .line 863
    throw v1

    :catch_2
    move-exception v1

    const-string v2, "Unknown host"

    .line 853
    invoke-interface {v6, v2, v1}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 869
    :goto_3
    :sswitch_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-interface {v0}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    check-cast v0, Ll/ܰۡ᩵;

    invoke-virtual {v0}, Ll/ܰۡ᩵;->֫()J

    move-result-wide v3

    add-long/2addr v3, v1

    iput-wide v3, p0, Ll/۬ۚ᩵;->᩸:J

    .line 870
    iget-boolean v0, p0, Ll/۬ۚ᩵;->ۙ:Z

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x3ffffff1 -> :sswitch_0
        -0x3fffffcd -> :sswitch_0
        -0x3fffffcc -> :sswitch_0
        -0x3fffffc6 -> :sswitch_0
    .end sparse-switch
.end method

.method public final ܽ()V
    .locals 2

    const-wide/16 v0, 0x0

    .line 1357
    iput-wide v0, p0, Ll/۬ۚ᩵;->᩸:J

    .line 1358
    iput-wide v0, p0, Ll/۬ۚ᩵;->۫:J

    return-void
.end method

.method public final declared-synchronized ᩳ()Ll/ۘ֨᩵;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 544
    :try_start_0
    iget-object v1, p0, Ll/۬ۚ᩵;->ۨ:Ll/ۘ֨᩵;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ll/ۘ֨᩵;->ܶ()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 556
    :cond_0
    iget-object v1, p0, Ll/۬ۚ᩵;->ۨ:Ll/ۘ֨᩵;

    invoke-virtual {v1}, Ll/ۘ֨᩵;->֫()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    .line 545
    :cond_1
    :goto_0
    :try_start_1
    iget-object v1, p0, Ll/۬ۚ᩵;->ۨ:Ll/ۘ֨᩵;

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/۬ۚ᩵;->ۤ:Ll/ᩴۡ᩵;

    invoke-interface {v1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 548
    :cond_2
    iget-object v1, p0, Ll/۬ۚ᩵;->ۛ:Ll/ۖ֨᩵;

    iget-object v2, p0, Ll/۬ۚ᩵;->᩶:Ll/ᩳ֨᩵;

    invoke-virtual {v1, v2}, Ll/ۖ֨᩵;->ۧ(Ll/ᩳ֨᩵;)Ll/ۘ֨᩵;

    move-result-object v1

    iput-object v1, p0, Ll/۬ۚ᩵;->ۨ:Ll/ۘ֨᩵;

    .line 549
    invoke-virtual {v1}, Ll/ۘ֨᩵;->ᩳ()V

    .line 550
    iget-object v1, p0, Ll/۬ۚ᩵;->ۤ:Ll/ᩴۡ᩵;

    invoke-interface {v1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 554
    iget-object v1, p0, Ll/۬ۚ᩵;->ۨ:Ll/ۘ֨᩵;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

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

.method public ᩻()I
    .locals 4

    .line 877
    iget-object v0, p0, Ll/۬ۚ᩵;->᩶:Ll/ᩳ֨᩵;

    :try_start_0
    invoke-virtual {v0}, Ll/ᩳ֨᩵;->ۜ()I

    move-result v1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_1

    .line 879
    invoke-virtual {p0}, Ll/۬ۚ᩵;->ᩳ()Ll/ۘ֨᩵;

    move-result-object v2
    :try_end_0
    .catch Ll/᩵ۡ᩵; {:try_start_0 .. :try_end_0} :catch_0

    .line 880
    :try_start_1
    invoke-virtual {v2}, Ll/ۘ֨᩵;->֡()I

    move-result v3

    invoke-virtual {v0, v3}, Ll/ᩳ֨᩵;->֫(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 881
    :try_start_2
    invoke-virtual {v2}, Ll/ۘ֨᩵;->close()V
    :try_end_2
    .catch Ll/᩵ۡ᩵; {:try_start_2 .. :try_end_2} :catch_0

    return v1

    :catchall_0
    move-exception v0

    if-eqz v2, :cond_0

    .line 879
    :try_start_3
    invoke-virtual {v2}, Ll/ۘ֨᩵;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    throw v0
    :try_end_4
    .catch Ll/᩵ۡ᩵; {:try_start_4 .. :try_end_4} :catch_0

    :cond_1
    return v1

    :catch_0
    move-exception v0

    .line 885
    invoke-static {v0}, Ll/ۗۚ᩵;->֫(Ll/᩵ۡ᩵;)Ll/ۗۚ᩵;

    move-result-object v0

    throw v0
.end method
