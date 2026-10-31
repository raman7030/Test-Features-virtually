.class public final Ll/۬᩶᩻;
.super Ll/ۘۘܳ;
.source "Y20N"


# static fields
.field public static final ᩳ:Ll/۬᩶᩻;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 21
    new-instance v0, Ll/۬᩶᩻;

    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    sput-object v0, Ll/۬᩶᩻;->ᩳ:Ll/۬᩶᩻;

    return-void
.end method

.method public static ֫(Ll/ۗ᩺ۡ;)Ljava/lang/String;
    .locals 3

    .line 129
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "zip:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->۫()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 130
    invoke-static {p0}, Ll/ܳۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ()Ll/۬᩶᩻;
    .locals 1

    .line 24
    sget-object v0, Ll/۬᩶᩻;->ᩳ:Ll/۬᩶᩻;

    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/ᩳۜܳ;I)Ljava/lang/String;
    .locals 0

    .line 33
    check-cast p1, Ll/۫᩶᩻;

    invoke-virtual {p1}, Ll/۫᩶᩻;->ܽ()Ll/ۗ᩺ۡ;

    move-result-object p1

    invoke-static {p1}, Ll/۬᩶᩻;->֫(Ll/ۗ᩺ۡ;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܽ᩷ܳ;Ll/ᩳۜܳ;I)Ll/ۨܺ᩷;
    .locals 5

    .line 71
    check-cast p1, Ll/ۧۗ᩻;

    .line 72
    move-object v0, p2

    check-cast v0, Ll/۫᩶᩻;

    const/4 v1, 0x0

    .line 74
    :try_start_0
    invoke-virtual {p1}, Ll/ۧۗ᩻;->ܳ֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ll/ۧۗ᩻;->᩻֫()[B

    move-result-object v3

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/String;

    .line 114
    invoke-static {v2, v4}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-static {v2, v3}, Ll/ᩳܰۡ;->֫(Ll/ܶ᩵ܿ;[B)Ll/ᩳܰۡ;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 75
    :try_start_1
    invoke-virtual {v0}, Ll/۫᩶᩻;->ܽ()Ll/ۗ᩺ۡ;

    move-result-object v3

    .line 1757
    invoke-virtual {v2, v3, v1}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;Ll/᩵ۛۡ;)[B

    move-result-object v3

    .line 76
    new-instance v4, Ll/۟ۡۡ;

    invoke-direct {v4, v3}, Ll/۟ۡۡ;-><init>([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    :try_start_2
    invoke-virtual {v2}, Ll/ᩳܰۡ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :catchall_0
    move-object v1, v4

    goto :goto_1

    :catchall_1
    move-exception v3

    .line 74
    :try_start_3
    invoke-virtual {v2}, Ll/ᩳܰۡ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception v2

    :try_start_4
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :catchall_3
    :goto_1
    move-object v4, v1

    .line 80
    :goto_2
    invoke-virtual {v0}, Ll/۫᩶᩻;->ܽ()Ll/ۗ᩺ۡ;

    move-result-object v0

    invoke-static {v0}, Ll/۬᩶᩻;->֫(Ll/ۗ᩺ۡ;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-eq p3, v1, :cond_3

    const/4 v2, 0x2

    if-eq p3, v2, :cond_3

    const/4 v2, 0x3

    if-ne p3, v2, :cond_2

    .line 91
    invoke-virtual {p1}, Ll/ۧۗ᩻;->᩶()Ll/᩵ۙ᩻;

    move-result-object p1

    .line 92
    invoke-virtual {p1}, Ll/᩵ۙ᩻;->ۜ()Ll/۫ܽܽ;

    move-result-object p1

    if-eqz p1, :cond_0

    if-eqz v4, :cond_0

    .line 95
    sget-object p3, Ll/᩶ۖܳ;->ۛ֫:Ll/᩶ۖܳ;

    new-instance v2, Ll/ۙ᩶᩻;

    invoke-direct {v2, p0, p1, v4}, Ll/ۙ᩶᩻;-><init>(Ll/۬᩶᩻;Ll/۫ܽܽ;Ll/۟ۡۡ;)V

    invoke-static {v0, p3, v1, v2}, Ll/ۘۘܳ;->֫(Ljava/lang/String;Ll/᩶ۖܳ;ZLl/ۙ۫ۡ;)Ll/ۨܺ᩷;

    move-result-object p1

    goto :goto_3

    .line 115
    :cond_0
    sget-object p1, Ll/᩶ۖܳ;->ۛ֫:Ll/᩶ۖܳ;

    new-instance p3, Ll/ۗۖܳ;

    const/4 v2, 0x4

    invoke-direct {p3, v2, v4}, Ll/ۗۖܳ;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, p1, v1, p3}, Ll/ۘۘܳ;->֫(Ljava/lang/String;Ll/᩶ۖܳ;ZLl/ۙ۫ۡ;)Ll/ۨܺ᩷;

    move-result-object p1

    .line 119
    :goto_3
    sget-object p3, Ll/᩶ۖܳ;->ۛ֫:Ll/᩶ۖܳ;

    iget-object p3, p3, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    if-eq p1, p3, :cond_1

    const p3, 0x7f0a02a4

    .line 120
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p2, p3, v0}, Ll/ᩳۜܳ;->ۧ(ILjava/lang/Object;)V

    :cond_1
    return-object p1

    .line 125
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 86
    :cond_3
    sget-object p1, Ll/᩶ۖܳ;->۬:Ll/᩶ۖܳ;

    new-instance p2, Ll/᩶᩶᩻;

    invoke-direct {p2, v4}, Ll/᩶᩶᩻;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, p1, v1, p2}, Ll/ۘۘܳ;->֫(Ljava/lang/String;Ll/᩶ۖܳ;ZLl/ۙ۫ۡ;)Ll/ۨܺ᩷;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;
    .locals 2

    .line 33
    invoke-static {p1}, Ll/ۗ۬ܳ;->֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;

    move-result-object v0

    .line 39
    sget-object v1, Ll/᩶ۖܳ;->ۚ:Ll/᩶ۖܳ;

    if-ne v0, v1, :cond_0

    .line 40
    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const-string v1, "mapping"

    .line 41
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, ".bin"

    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 42
    sget-object p1, Ll/᩶ۖܳ;->᩸֫:Ll/᩶ۖܳ;

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final ۧ(Ll/ᩳۜܳ;)I
    .locals 5

    .line 50
    invoke-interface {p1}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 52
    :cond_0
    check-cast p1, Ll/۫᩶᩻;

    .line 53
    invoke-virtual {p1}, Ll/۫᩶᩻;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 56
    :cond_1
    invoke-virtual {p1}, Ll/ܺۘܳ;->۠֫()Ljava/lang/String;

    move-result-object v0

    .line 57
    invoke-virtual {p1}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v1

    const-string p1, "image/svg+xml"

    .line 58
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const-wide/32 v3, 0xc8000

    cmp-long p1, v1, v3

    if-gtz p1, :cond_4

    const/4 p1, 0x2

    return p1

    :cond_2
    const-string p1, "text/xml"

    .line 60
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const-wide/32 v3, 0x25800

    cmp-long p1, v1, v3

    if-gtz p1, :cond_4

    const/4 p1, 0x3

    return p1

    :cond_3
    const-string p1, "image/"

    .line 62
    invoke-virtual {v0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    const-wide/32 v3, 0x800000

    cmp-long p1, v1, v3

    if-gtz p1, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
