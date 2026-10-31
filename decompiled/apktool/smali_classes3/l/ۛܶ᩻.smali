.class public final Ll/ۛܶ᩻;
.super Ll/ۘۘܳ;
.source "R8F6"


# static fields
.field public static final ᩳ:Ll/ۛܶ᩻;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 22
    new-instance v0, Ll/ۛܶ᩻;

    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 22
    sput-object v0, Ll/ۛܶ᩻;->ᩳ:Ll/ۛܶ᩻;

    return-void
.end method

.method public static ֫(Ll/֨᩷֡;)Ljava/lang/String;
    .locals 8

    .line 96
    invoke-virtual {p0}, Ll/֨᩷֡;->᩵()J

    move-result-wide v0

    invoke-virtual {p0}, Ll/֨᩷֡;->ܺ()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-virtual {p0}, Ll/֨᩷֡;->ۘ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    int-to-long v4, v4

    const/4 v6, 0x3

    new-array v6, v6, [J

    const/4 v7, 0x0

    aput-wide v0, v6, v7

    const/4 v0, 0x1

    aput-wide v2, v6, v0

    const/4 v0, 0x2

    aput-wide v4, v6, v0

    invoke-static {v6}, Ljava/util/Arrays;->hashCode([J)I

    move-result v0

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    .line 97
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "tar:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/֨᩷֡;->֡()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 98
    invoke-static {p0}, Ll/ܳۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ()Ll/ۛܶ᩻;
    .locals 1

    .line 25
    sget-object v0, Ll/ۛܶ᩻;->ᩳ:Ll/ۛܶ᩻;

    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/ᩳۜܳ;I)Ljava/lang/String;
    .locals 0

    .line 34
    check-cast p1, Ll/ۨܶ᩻;

    invoke-virtual {p1}, Ll/ۨܶ᩻;->ܽ()Ll/֨᩷֡;

    move-result-object p1

    invoke-static {p1}, Ll/ۛܶ᩻;->֫(Ll/֨᩷֡;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܽ᩷ܳ;Ll/ᩳۜܳ;I)Ll/ۨܺ᩷;
    .locals 5

    .line 56
    check-cast p1, Ll/ۡ᩸᩻;

    .line 57
    move-object v0, p2

    check-cast v0, Ll/ۨܶ᩻;

    .line 58
    invoke-virtual {v0}, Ll/ۨܶ᩻;->ܽ()Ll/֨᩷֡;

    move-result-object v0

    .line 59
    :try_start_0
    invoke-virtual {p1}, Ll/ۡ᩸᩻;->ܳ֫()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    .line 191
    invoke-static {p1, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-static {p1}, Ll/ۤ᩷֡;->֫(Ll/ܶ᩵ܿ;)Ll/ۤ᩷֡;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 60
    :try_start_1
    invoke-static {v0}, Ll/ۛܶ᩻;->֫(Ll/֨᩷֡;)Ljava/lang/String;

    move-result-object v1

    .line 61
    new-instance v2, Ll/ۤܶ᩻;

    invoke-direct {v2, p1, v0}, Ll/ۤܶ᩻;-><init>(Ll/ۤ᩷֡;Ll/֨᩷֡;)V

    const/4 v0, 0x1

    if-eq p3, v0, :cond_2

    const/4 v3, 0x2

    if-eq p3, v3, :cond_2

    const/4 v3, 0x3

    if-ne p3, v3, :cond_1

    .line 80
    sget-object p3, Ll/᩶ۖܳ;->ۛ֫:Ll/᩶ۖܳ;

    new-instance v3, Ll/ۛۢۢ;

    const/4 v4, 0x1

    invoke-direct {v3, v4, v2}, Ll/ۛۢۢ;-><init>(ILjava/lang/Object;)V

    invoke-static {v1, p3, v0, v3}, Ll/ۘۘܳ;->֫(Ljava/lang/String;Ll/᩶ۖܳ;ZLl/ۙ۫ۡ;)Ll/ۨܺ᩷;

    move-result-object v0

    .line 83
    iget-object p3, p3, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    if-eq v0, p3, :cond_0

    .line 84
    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const v1, 0x7f0a02a4

    invoke-interface {p2, v1, p3}, Ll/ᩳۜܳ;->ۧ(ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    :cond_0
    :try_start_2
    invoke-virtual {p1}, Ll/ۤ᩷֡;->close()V

    return-object v0

    :cond_1
    invoke-virtual {p1}, Ll/ۤ᩷֡;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    .line 75
    :cond_2
    :try_start_3
    sget-object p2, Ll/᩶ۖܳ;->۬:Ll/᩶ۖܳ;

    new-instance p3, Ll/ܿۡܳ;

    const/4 v3, 0x2

    invoke-direct {p3, v3, v2}, Ll/ܿۡܳ;-><init>(ILjava/lang/Object;)V

    invoke-static {v1, p2, v0, p3}, Ll/ۘۘܳ;->֫(Ljava/lang/String;Ll/᩶ۖܳ;ZLl/ۙ۫ۡ;)Ll/ۨܺ᩷;

    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 89
    :try_start_4
    invoke-virtual {p1}, Ll/ۤ᩷֡;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    return-object p2

    :catchall_0
    move-exception p2

    .line 59
    :try_start_5
    invoke-virtual {p1}, Ll/ۤ᩷֡;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_6
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 92
    :catchall_2
    :goto_1
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public final ۧ(Ll/ᩳۜܳ;)I
    .locals 1

    .line 39
    invoke-interface {p1}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 41
    :cond_0
    check-cast p1, Ll/ۨܶ᩻;

    .line 42
    invoke-virtual {p1}, Ll/ܺۘܳ;->۠֫()Ljava/lang/String;

    move-result-object p1

    const-string v0, "image/svg+xml"

    .line 43
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x2

    return p1

    :cond_1
    const-string v0, "text/xml"

    .line 45
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p1, 0x3

    return p1

    :cond_2
    const-string v0, "image/"

    .line 47
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
