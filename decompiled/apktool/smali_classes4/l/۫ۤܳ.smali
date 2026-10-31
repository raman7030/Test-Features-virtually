.class public final Ll/۫ۤܳ;
.super Ll/ۘۘܳ;
.source "CB5W"


# static fields
.field public static final ᩳ:Ll/۫ۤܳ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 24
    new-instance v0, Ll/۫ۤܳ;

    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    sput-object v0, Ll/۫ۤܳ;->ᩳ:Ll/۫ۤܳ;

    return-void
.end method

.method public static ֫(Ll/ۘܳᩳ;)Ljava/lang/String;
    .locals 10

    .line 107
    invoke-virtual {p0}, Ll/ۘܳᩳ;->ۧ()Ljava/lang/Integer;

    move-result-object v0

    const-wide v1, 0xffffffffL

    if-eqz v0, :cond_0

    .line 110
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    .line 112
    :cond_0
    invoke-virtual {p0}, Ll/ۘܳᩳ;->֫()J

    move-result-wide v3

    invoke-virtual {p0}, Ll/ۘܳᩳ;->᩷()J

    move-result-wide v5

    invoke-virtual {p0}, Ll/ۘܳᩳ;->ܿ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    int-to-long v7, v0

    const/4 v0, 0x3

    new-array v0, v0, [J

    const/4 v9, 0x0

    aput-wide v3, v0, v9

    const/4 v3, 0x1

    aput-wide v5, v0, v3

    const/4 v3, 0x2

    aput-wide v7, v0, v3

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([J)I

    move-result v0

    :goto_0
    int-to-long v3, v0

    and-long v0, v3, v1

    .line 115
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "archive:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۘܳᩳ;->ۜ()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 116
    invoke-static {p0}, Ll/ܳۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/ۘܳᩳ;)I
    .locals 6

    .line 48
    invoke-virtual {p0}, Ll/ۘܳᩳ;->ۢ()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_5

    invoke-virtual {p0}, Ll/ۘܳᩳ;->ۡ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {p0}, Ll/ۘܳᩳ;->᩻()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۖ֨ܿ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 52
    invoke-virtual {p0}, Ll/ۘܳᩳ;->ۜ()J

    move-result-wide v2

    const-string p0, "image/svg+xml"

    .line 53
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    const-wide/32 v4, 0xc8000

    cmp-long p0, v2, v4

    if-gtz p0, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    return v1

    :cond_2
    const-string p0, "text/xml"

    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    const-wide/32 v4, 0x25800

    cmp-long p0, v2, v4

    if-gtz p0, :cond_3

    const/4 p0, 0x3

    return p0

    :cond_3
    return v1

    :cond_4
    const-string p0, "image/"

    .line 57
    invoke-virtual {v0, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_5

    const-wide/32 v4, 0x800000

    cmp-long p0, v2, v4

    if-gtz p0, :cond_5

    const/4 p0, 0x1

    return p0

    :cond_5
    :goto_0
    return v1
.end method

.method public static ۧ()Ll/۫ۤܳ;
    .locals 1

    .line 27
    sget-object v0, Ll/۫ۤܳ;->ᩳ:Ll/۫ۤܳ;

    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/ᩳۜܳ;I)Ljava/lang/String;
    .locals 0

    .line 36
    check-cast p1, Ll/ۤۤܳ;

    invoke-virtual {p1}, Ll/ۤۤܳ;->ܽ()Ll/ۘܳᩳ;

    move-result-object p1

    invoke-static {p1}, Ll/۫ۤܳ;->֫(Ll/ۘܳᩳ;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܽ᩷ܳ;Ll/ᩳۜܳ;I)Ll/ۨܺ᩷;
    .locals 6

    .line 66
    check-cast p1, Ll/ۚۛܳ;

    .line 67
    move-object v0, p2

    check-cast v0, Ll/ۤۤܳ;

    const/4 v1, 0x0

    .line 71
    :try_start_0
    invoke-virtual {p1}, Ll/ۚۛܳ;->ܳ֫()Lnet/sf/sevenzipjbinding/IInArchive;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    :try_start_1
    new-instance v3, Ll/᩶᩺᩵;

    invoke-virtual {v0}, Ll/ۤۤܳ;->ܽ()Ll/ۘܳᩳ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۘܳᩳ;->ۜ()J

    move-result-wide v4

    long-to-int v5, v4

    invoke-direct {v3, v5}, Ll/᩶᩺᩵;-><init>(I)V

    .line 73
    invoke-virtual {v0}, Ll/ۤۤܳ;->ܽ()Ll/ۘܳᩳ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۘܳᩳ;->ܽ()I

    move-result v4

    invoke-interface {v2, v4, v3}, Lnet/sf/sevenzipjbinding/IInArchive;->extractSlow(ILnet/sf/sevenzipjbinding/ISequentialOutStream;)Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    move-result-object v4

    sget-object v5, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->OK:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    if-ne v4, v5, :cond_0

    .line 74
    invoke-virtual {p1, v2}, Ll/ۚۛܳ;->֫(Lnet/sf/sevenzipjbinding/IInArchive;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 76
    :try_start_2
    new-instance p1, Ll/۟ۡۡ;

    invoke-virtual {v3}, Ll/᩶᩺᩵;->֫()[B

    move-result-object v2

    invoke-direct {p1, v2}, Ll/۟ۡۡ;-><init>([B)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    move-object v1, v2

    .line 81
    :goto_0
    invoke-static {v1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    move-object v1, p1

    goto :goto_1

    :catchall_0
    move-object v2, v1

    :catchall_1
    invoke-static {v2}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 83
    :goto_1
    invoke-virtual {v0}, Ll/ۤۤܳ;->ܽ()Ll/ۘܳᩳ;

    move-result-object p1

    invoke-static {p1}, Ll/۫ۤܳ;->֫(Ll/ۘܳᩳ;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    if-eq p3, v0, :cond_3

    const/4 v2, 0x2

    if-eq p3, v2, :cond_3

    const/4 v2, 0x3

    if-ne p3, v2, :cond_2

    .line 94
    sget-object p3, Ll/᩶ۖܳ;->ۛ֫:Ll/᩶ۖܳ;

    new-instance v2, Ll/᩶᩵ܳ;

    invoke-direct {v2, v1}, Ll/᩶᩵ܳ;-><init>(Ljava/lang/Object;)V

    invoke-static {p1, p3, v0, v2}, Ll/ۘۘܳ;->֫(Ljava/lang/String;Ll/᩶ۖܳ;ZLl/ۙ۫ۡ;)Ll/ۨܺ᩷;

    move-result-object p1

    .line 97
    iget-object p3, p3, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    if-eq p1, p3, :cond_1

    const p3, 0x7f0a02a4

    .line 98
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p2, p3, v0}, Ll/ᩳۜܳ;->ۧ(ILjava/lang/Object;)V

    :cond_1
    return-object p1

    .line 103
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 89
    :cond_3
    sget-object p2, Ll/᩶ۖܳ;->۬:Ll/᩶ۖܳ;

    new-instance p3, Ll/ۜۛۡ;

    invoke-direct {p3, v1}, Ll/ۜۛۡ;-><init>(Ljava/lang/Object;)V

    invoke-static {p1, p2, v0, p3}, Ll/ۘۘܳ;->֫(Ljava/lang/String;Ll/᩶ۖܳ;ZLl/ۙ۫ۡ;)Ll/ۨܺ᩷;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/ᩳۜܳ;)I
    .locals 1

    .line 41
    invoke-interface {p1}, Ll/ᩳۜܳ;->ۙ֫()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 43
    :cond_0
    check-cast p1, Ll/ۤۤܳ;

    .line 44
    invoke-virtual {p1}, Ll/ۤۤܳ;->ܽ()Ll/ۘܳᩳ;

    move-result-object p1

    invoke-static {p1}, Ll/۫ۤܳ;->ۧ(Ll/ۘܳᩳ;)I

    move-result p1

    return p1
.end method
