.class public Ll/ۘ֡֨;
.super Ll/ۛ֡֨;
.source "643O"

# interfaces
.implements Ll/ܰ᩸۠;


# static fields
.field public static final ֫֫:Ll/ᩴ֡ܿ;


# instance fields
.field public ۛ:Ll/ۖܶ۠;

.field public ۟:Ll/ۖܶ۠;

.field public ۨ:Ll/֨᩷۠;

.field public ܰ:Ll/ۖܶ۠;

.field public ᩺:Ll/ۡۘ֨;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 2172
    new-instance v0, Ll/ᩴ֡ܿ;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ll/ᩴ֡ܿ;-><init>(I)V

    sput-object v0, Ll/ۘ֡֨;->֫֫:Ll/ᩴ֡ܿ;

    return-void
.end method

.method public constructor <init>(JLl/ۤܶ۠;Ll/ۙ֨֨;Ll/ۛ֡֨;)V
    .locals 7

    .line 1922
    sget-object v1, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    move-object v0, p0

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Ll/ۛ֡֨;-><init>(Ll/֨ᩴ֨;JLl/ۤܶ۠;Ll/ۙ֨֨;Ll/ۛ֡֨;)V

    const/4 p1, 0x0

    .line 1902
    iput-object p1, p0, Ll/ۘ֡֨;->ۨ:Ll/֨᩷۠;

    .line 1905
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object p2

    iput-object p2, p0, Ll/ۘ֡֨;->ܰ:Ll/ۖܶ۠;

    .line 1908
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object p2

    iput-object p2, p0, Ll/ۘ֡֨;->ۛ:Ll/ۖܶ۠;

    .line 1911
    iput-object p1, p0, Ll/ۘ֡֨;->۟:Ll/ۖܶ۠;

    .line 1917
    iput-object p1, p0, Ll/ۘ֡֨;->᩺:Ll/ۡۘ֨;

    .line 1923
    iget-object p2, p5, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    sget-object p4, Ll/ۢ۠֨;->ۢ֫:Ll/ۢ۠֨;

    invoke-virtual {p2, p4}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p4, "."

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ll/۫ۙ;->֫(Ljava/lang/String;)V

    throw p1
.end method

.method private ֫(Ll/᩶֡֨;)Z
    .locals 9

    .line 2122
    iget-wide v0, p0, Ll/ۛ֡֨;->᩶:J

    const-wide/16 v2, 0x7

    and-long/2addr v0, v2

    long-to-int v1, v0

    const-wide/16 v2, 0x200

    const-wide/16 v4, 0x0

    const/4 v0, 0x0

    const/4 v6, 0x1

    if-eqz v1, :cond_5

    if-eq v1, v6, :cond_2

    const/4 v7, 0x4

    if-eq v1, v7, :cond_0

    return v0

    .line 2129
    :cond_0
    invoke-virtual {p1}, Ll/ۛ֡֨;->۬()J

    move-result-wide v7

    and-long v1, v7, v2

    cmp-long p1, v1, v4

    if-nez p1, :cond_1

    return v6

    :cond_1
    return v0

    .line 2126
    :cond_2
    iget-object p1, p0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    invoke-virtual {p1}, Ll/ۛ֡֨;->ۘ֫()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-wide v1, p0, Ll/ۛ֡֨;->᩶:J

    const-wide/16 v7, 0x8

    and-long/2addr v1, v7

    cmp-long p1, v1, v4

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    return v0

    :cond_4
    :goto_0
    return v6

    .line 2134
    :cond_5
    invoke-virtual {p0}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object v7

    if-ne v1, v7, :cond_6

    .line 2135
    invoke-virtual {p1}, Ll/ۛ֡֨;->۬()J

    move-result-wide v7

    and-long v1, v7, v2

    cmp-long p1, v1, v4

    if-nez p1, :cond_6

    return v6

    :cond_6
    return v0
.end method


# virtual methods
.method public getParameters()Ll/ۖܶ۠;
    .locals 1

    .line 2233
    invoke-virtual {p0}, Ll/ۘ֡֨;->ۗ֫()Ll/ۖܶ۠;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    .line 111
    iget-wide v0, p0, Ll/ۛ֡֨;->᩶:J

    const-wide/32 v2, 0x100000

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 1954
    iget-object v0, p0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v0, v0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {v0}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1956
    :cond_0
    iget-object v0, p0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v1, v0, Ll/ۤܶ۠;->᩸:Ll/۫ܶ۠;

    iget-object v1, v1, Ll/۫ܶ۠;->֫:Ll/ۛܶ۠;

    iget-object v1, v1, Ll/ۛܶ۠;->ᩴۧ:Ll/ۤܶ۠;

    if-ne v0, v1, :cond_1

    .line 1957
    iget-object v0, p0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v0, v0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {v0}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1958
    :cond_1
    invoke-virtual {v0}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1959
    :goto_0
    iget-object v1, p0, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    if-eqz v1, :cond_8

    .line 1960
    sget-object v4, Ll/ۢ۠֨;->ۧ֫:Ll/ۢ۠֨;

    invoke-virtual {v1, v4}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1961
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "<"

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    check-cast v4, Ll/ۤۚ֨;

    .line 1848
    iget-object v4, v4, Ll/ۤۚ֨;->ۨ:Ll/ۖܶ۠;

    .line 1961
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ">"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_2
    const-string v1, "("

    .line 0
    invoke-static {v0, v1}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1962
    iget-object v1, p0, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 111
    iget-wide v4, p0, Ll/ۛ֡֨;->᩶:J

    const-wide v6, 0x400000000L

    and-long/2addr v4, v6

    cmp-long v6, v4, v2

    if-eqz v6, :cond_3

    const/4 v2, 0x1

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    .line 522
    :goto_1
    invoke-virtual {v1}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object v1

    if-nez v2, :cond_4

    const-string v2, ","

    .line 339
    invoke-virtual {v1, v2}, Ll/ۖܶ۠;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    .line 524
    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 525
    :goto_2
    iget-object v3, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    invoke-virtual {v3}, Ll/ۖܶ۠;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 526
    iget-object v3, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 527
    iget-object v1, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    const/16 v3, 0x2c

    .line 528
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 530
    :cond_5
    iget-object v3, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v3, Ll/ۙ֨֨;

    sget-object v4, Ll/ۢ۠֨;->ۗ:Ll/ۢ۠֨;

    invoke-virtual {v3, v4}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 531
    iget-object v3, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v3, Ll/ۚۚ֨;

    iget-object v3, v3, Ll/ۚۚ֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 532
    iget-object v3, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v3, Ll/ۙ֨֨;

    invoke-virtual {v3}, Ll/ۙ֨֨;->۬()Ll/ۖܶ۠;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۖܶ۠;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_6

    .line 533
    iget-object v1, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v1, Ll/ۙ֨֨;

    invoke-virtual {v1}, Ll/ۙ֨֨;->۬()Ll/ۖܶ۠;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_6
    const-string v1, "..."

    .line 535
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 537
    :cond_7
    iget-object v1, v1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 539
    :goto_3
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_4
    const-string v2, ")"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_8
    return-object v0
.end method

.method public final ֡()Z
    .locals 5

    .line 111
    iget-wide v0, p0, Ll/ۛ֡֨;->᩶:J

    const-wide v2, 0x400000000L

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ֨()Ll/ۖܶ۠;
    .locals 1

    .line 702
    iget-object v0, p0, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 2268
    invoke-virtual {v0}, Ll/ۙ֨֨;->ۧ֫()Ll/ۖܶ۠;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/۠᩹۠;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2248
    invoke-virtual {p1, p0, p2}, Ll/۠᩹۠;->֫(Ll/ۘ֡֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Ll/ۤ֡֨;Ljava/util/Locale;)Ljava/lang/Object;
    .locals 0

    .line 2252
    invoke-interface {p1, p0, p2}, Ll/ۤ֡֨;->֫(Ll/ۘ֡֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܳ֡֨;Ll/ۛ᩸֨;)Ll/ۘ֡֨;
    .locals 8

    move-object v0, p1

    :goto_0
    if-eqz v0, :cond_5

    .line 2044
    invoke-virtual {v0}, Ll/ۛ֡֨;->֨֫()Ll/ܰ᩵֨;

    move-result-object v1

    iget-object v2, p0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {v1, v2}, Ll/۟᩵֨;->֫(Ll/ۤܶ۠;)Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛ֡֨;

    .line 2045
    iget-object v3, v2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v4, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-ne v3, v4, :cond_0

    check-cast v2, Ll/ۘ֡֨;

    .line 2018
    invoke-virtual {v2}, Ll/ۛ֡֨;->ۜ֫()Z

    move-result v3

    if-nez v3, :cond_0

    iget-object v3, p0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    if-eq v3, v4, :cond_1

    goto :goto_1

    :cond_1
    if-ne v2, p0, :cond_2

    goto :goto_2

    .line 2024
    :cond_2
    iget-object v3, v2, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    check-cast v3, Ll/᩶֡֨;

    invoke-direct {p0, v3}, Ll/ۘ֡֨;->֫(Ll/᩶֡֨;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, v2, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v3, v3, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    iget-object v4, p0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    .line 2025
    invoke-virtual {p2, v4, v3}, Ll/ۛ᩸֨;->ۧ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 2026
    invoke-virtual {v2, p2}, Ll/ۛ֡֨;->ܽ(Ll/ۛ᩸֨;)Ll/ۙ֨֨;

    move-result-object v3

    invoke-virtual {p0, p2}, Ll/ۛ֡֨;->ܽ(Ll/ۛ᩸֨;)Ll/ۙ֨֨;

    move-result-object v4

    invoke-virtual {p2, v3, v4}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_2

    .line 111
    :cond_3
    iget-wide v3, v2, Ll/ۛ֡֨;->᩶:J

    const-wide/16 v5, 0x400

    and-long/2addr v3, v5

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-nez v7, :cond_0

    .line 2032
    invoke-direct {p0, p1}, Ll/ۘ֡֨;->֫(Ll/᩶֡֨;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 2033
    invoke-virtual {v2, p1, p2}, Ll/ۛ֡֨;->֫(Ll/᩶֡֨;Ll/ۛ᩸֨;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 2034
    invoke-virtual {v2, p2}, Ll/ۛ֡֨;->ܽ(Ll/ۛ᩸֨;)Ll/ۙ֨֨;

    move-result-object v3

    invoke-virtual {p0, p2}, Ll/ۛ֡֨;->ܽ(Ll/ۛ᩸֨;)Ll/ۙ֨֨;

    move-result-object v4

    invoke-virtual {p2, v3, v4}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v3

    if-eqz v3, :cond_0

    :goto_2
    return-object v2

    .line 2043
    :cond_4
    iget-object v0, v0, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {p2, v0}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v0

    iget-object v0, v0, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    goto/16 :goto_0

    :cond_5
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/᩶֡֨;Ll/ۛ᩸֨;Z)Ll/ۘ֡֨;
    .locals 1

    .line 2169
    sget-object v0, Ll/ۘ֡֨;->֫֫:Ll/ᩴ֡ܿ;

    .line 2176
    invoke-virtual {p2, p0, p1, p3, v0}, Ll/ۛ᩸֨;->֫(Ll/ۘ֡֨;Ll/᩶֡֨;ZLjava/util/function/Predicate;)Ll/ۘ֡֨;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 2182
    :cond_0
    iget-object v0, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {p2, v0}, Ll/ۛ᩸֨;->ᩴ(Ll/ۙ֨֨;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ll/ۛ֡֨;->ۘ֫()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2183
    iget-object p1, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {p2, p1}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    iget-object p1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {p0, p1, p2, p3}, Ll/ۘ֡֨;->֫(Ll/᩶֡֨;Ll/ۛ᩸֨;Z)Ll/ۘ֡֨;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/ۙ֨֨;Ll/ۛ᩸֨;)Ll/ۛ֡֨;
    .locals 7

    .line 2206
    new-instance v6, Ll/ۘ֡֨;

    iget-wide v1, p0, Ll/ۛ֡֨;->᩶:J

    iget-object v3, p0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {p2, p0, p1}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v4

    iget-object v5, p0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/ۘ֡֨;-><init>(JLl/ۤܶ۠;Ll/ۙ֨֨;Ll/ۛ֡֨;)V

    return-object v6
.end method

.method public final ֫()Ll/᩺᩸۠;
    .locals 5

    .line 2211
    iget-object v0, p0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v1, v0, Ll/ۤܶ۠;->᩸:Ll/۫ܶ۠;

    iget-object v1, v1, Ll/۫ܶ۠;->֫:Ll/ۛܶ۠;

    iget-object v2, v1, Ll/ۛܶ۠;->ᩴۧ:Ll/ۤܶ۠;

    if-ne v0, v2, :cond_0

    .line 2212
    sget-object v0, Ll/᩺᩸۠;->ۗ:Ll/᩺᩸۠;

    return-object v0

    .line 2213
    :cond_0
    iget-object v1, v1, Ll/ۛܶ۠;->ۨ֫:Ll/ۤܶ۠;

    if-ne v0, v1, :cond_1

    .line 2214
    sget-object v0, Ll/᩺᩸۠;->ۜ֫:Ll/᩺᩸۠;

    return-object v0

    .line 111
    :cond_1
    iget-wide v0, p0, Ll/ۛ֡֨;->᩶:J

    const-wide/32 v2, 0x100000

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_3

    .line 2216
    invoke-virtual {p0}, Ll/ۛ֡֨;->֡֫()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Ll/᩺᩸۠;->ۜ֫:Ll/᩺᩸۠;

    return-object v0

    :cond_2
    sget-object v0, Ll/᩺᩸۠;->ۨ:Ll/᩺᩸۠;

    return-object v0

    .line 2218
    :cond_3
    sget-object v0, Ll/᩺᩸۠;->۟:Ll/᩺᩸۠;

    return-object v0
.end method

.method public final ֫(Ll/ۛ֡֨;Ll/ۛ᩸֨;)Z
    .locals 4

    .line 2143
    iget-wide v0, p0, Ll/ۛ֡֨;->᩶:J

    const-wide/16 v2, 0x7

    and-long/2addr v0, v2

    long-to-int v1, v0

    const/4 v0, 0x1

    if-eq v1, v0, :cond_0

    .line 2149
    invoke-super {p0, p1, p2}, Ll/ۛ֡֨;->֫(Ll/ۛ֡֨;Ll/ۛ᩸֨;)Z

    move-result p1

    return p1

    .line 2145
    :cond_0
    iget-object p2, p0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    invoke-virtual {p2}, Ll/ۛ֡֨;->ۘ֫()Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    if-eq p1, p2, :cond_2

    iget-wide p1, p0, Ll/ۛ֡֨;->᩶:J

    const-wide/16 v1, 0x8

    and-long/2addr p1, v1

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    return v0
.end method

.method public final ֫(Ll/ۛ֡֨;Ll/᩶֡֨;Ll/ۛ᩸֨;Z)Z
    .locals 8

    .line 2087
    invoke-virtual {p0}, Ll/ۛ֡֨;->ۜ֫()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v1, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-eq v0, v1, :cond_0

    goto/16 :goto_1

    :cond_0
    const/4 v0, 0x1

    if-ne p0, p1, :cond_1

    goto/16 :goto_0

    .line 2090
    :cond_1
    check-cast p1, Ll/ۘ֡֨;

    .line 2093
    iget-object v1, p0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    check-cast v1, Ll/᩶֡֨;

    invoke-direct {p1, v1}, Ll/ۘ֡֨;->֫(Ll/᩶֡֨;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v1, v1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    iget-object v2, p1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    .line 2094
    invoke-virtual {p3, v2, v1}, Ll/ۛ᩸֨;->ۧ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 2095
    iget-object v1, p0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v1, v1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {p3, p0, v1}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v1

    .line 2096
    iget-object v2, p0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v2, v2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {p3, p1, v2}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v2

    .line 2796
    invoke-virtual {p3, v1, v2, v0}, Ll/ۛ᩸֨;->ۧ(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    move-result v3

    if-eqz v3, :cond_3

    if-nez p4, :cond_2

    goto :goto_0

    .line 2100
    :cond_2
    invoke-virtual {p3, v1, v2}, Ll/ۛ᩸֨;->᩷(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    .line 111
    :cond_3
    iget-wide v1, p0, Ll/ۛ֡֨;->᩶:J

    const-wide/16 v3, 0x400

    and-long/2addr v1, v3

    const-wide/16 v5, 0x0

    cmp-long v7, v1, v5

    if-eqz v7, :cond_4

    goto :goto_1

    :cond_4
    iget-wide v1, p1, Ll/ۛ֡֨;->᩶:J

    and-long/2addr v3, v1

    cmp-long v7, v3, v5

    if-nez v7, :cond_5

    const-wide v3, 0x80000000000L

    and-long/2addr v1, v3

    cmp-long v3, v1, v5

    if-eqz v3, :cond_8

    .line 2108
    :cond_5
    invoke-direct {p1, p2}, Ll/ۘ֡֨;->֫(Ll/᩶֡֨;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 2109
    invoke-virtual {p0, p2, p3}, Ll/ۛ֡֨;->֫(Ll/᩶֡֨;Ll/ۛ᩸֨;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_1

    .line 2113
    :cond_6
    iget-object v1, p2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {p3, p0, v1}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v1

    .line 2114
    iget-object p2, p2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {p3, p1, p2}, Ll/ۛ᩸֨;->ܽ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    .line 2796
    invoke-virtual {p3, v1, p1, v0}, Ll/ۛ᩸֨;->ۧ(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    move-result p2

    if-eqz p2, :cond_8

    if-eqz p4, :cond_7

    .line 2116
    iget-object p2, p3, Ll/ۛ᩸֨;->ܿ֫:Ll/֨᩸۠;

    .line 4250
    invoke-virtual {v1}, Ll/ۙ֨֨;->ܽ֫()Ll/ۖܶ۠;

    move-result-object p4

    .line 4251
    invoke-virtual {p1}, Ll/ۙ֨֨;->ܽ֫()Ll/ۖܶ۠;

    move-result-object v2

    .line 4252
    invoke-virtual {v1}, Ll/ۙ֨֨;->۟()Ll/ۙ֨֨;

    move-result-object v1

    .line 4253
    invoke-virtual {p1}, Ll/ۙ֨֨;->۟()Ll/ۙ֨֨;

    move-result-object p1

    invoke-virtual {p3, p1, v2, p4}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۙ֨֨;

    move-result-object p1

    .line 4254
    invoke-virtual {p3, v1, p1, p2}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)Z

    move-result p1

    if-eqz p1, :cond_8

    :cond_7
    :goto_0
    return v0

    :cond_8
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public ۖ()Ll/ۡۘ֨;
    .locals 1

    .line 2228
    iget-object v0, p0, Ll/ۘ֡֨;->᩺:Ll/ۡۘ֨;

    return-object v0
.end method

.method public final ۗ֫()Ll/ۖܶ۠;
    .locals 10

    .line 2189
    iget-object v0, p0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    invoke-virtual {v0}, Ll/ۛ֡֨;->᩶()V

    .line 2190
    iget-object v0, p0, Ll/ۘ֡֨;->۟:Ll/ۖܶ۠;

    if-nez v0, :cond_1

    .line 2191
    new-instance v0, Ll/ᩴܶ۠;

    invoke-direct {v0}, Ll/ᩴܶ۠;-><init>()V

    .line 2193
    iget-object v1, p0, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v1}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Ll/ۙ֨֨;

    .line 2194
    iget-object v3, p0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v3, v3, Ll/ۤܶ۠;->᩸:Ll/۫ܶ۠;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "arg"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ll/۫ܶ۠;->֫(Ljava/lang/String;)Ll/ۤܶ۠;

    move-result-object v7

    .line 2195
    new-instance v3, Ll/۫֡֨;

    const-wide v5, 0x200000000L

    move-object v4, v3

    move-object v9, p0

    invoke-direct/range {v4 .. v9}, Ll/۫֡֨;-><init>(JLl/ۤܶ۠;Ll/ۙ֨֨;Ll/ۛ֡֨;)V

    .line 2196
    invoke-virtual {v0, v3}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 2199
    :cond_0
    invoke-virtual {v0}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v0

    iput-object v0, p0, Ll/ۘ֡֨;->۟:Ll/ۖܶ۠;

    .line 2201
    :cond_1
    iget-object v0, p0, Ll/ۘ֡֨;->۟:Ll/ۖܶ۠;

    invoke-static {v0}, Ll/۫ۙ;->֫(Ljava/lang/Object;)V

    .line 2202
    iget-object v0, p0, Ll/ۘ֡֨;->۟:Ll/ۖܶ۠;

    return-object v0
.end method

.method public ۘ()I
    .locals 1

    .line 1970
    iget-object v0, p0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    invoke-virtual {v0}, Ll/ۛ֡֨;->ۘ֫()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0xb

    return v0

    :cond_0
    const/16 v0, 0xa

    return v0
.end method

.method public ۙ֫()Ll/ۘ֡֨;
    .locals 0

    return-object p0
.end method

.method public ۜ()Ll/ۨ᩸۠;
    .locals 1

    .line 707
    iget-object v0, p0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    return-object v0
.end method

.method public ۧ(Ll/ۛ֡֨;)Ll/ۛ֡֨;
    .locals 9

    .line 1929
    new-instance v8, Ll/ۖ֡֨;

    iget-wide v2, p0, Ll/ۛ֡֨;->᩶:J

    iget-object v4, p0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    iget-object v5, p0, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    move-object v0, v8

    move-object v1, p0

    move-object v6, p1

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Ll/ۖ֡֨;-><init>(Ll/ۘ֡֨;JLl/ۤܶ۠;Ll/ۙ֨֨;Ll/ۛ֡֨;Ll/ۛ֡֨;)V

    .line 1940
    iget-object p1, p0, Ll/ۘ֡֨;->ۨ:Ll/֨᩷۠;

    iput-object p1, v8, Ll/ۘ֡֨;->ۨ:Ll/֨᩷۠;

    return-object v8
.end method

.method public final ܳ()Ljava/util/Set;
    .locals 7

    .line 111
    iget-wide v0, p0, Ll/ۛ֡֨;->᩶:J

    const-wide v2, 0x80000000000L

    and-long/2addr v2, v0

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-eqz v6, :cond_0

    const-wide/16 v2, -0x401

    and-long/2addr v0, v2

    .line 1947
    :cond_0
    invoke-static {v0, v1}, Ll/᩵ᩴ֨;->ۧ(J)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public ᩳ()Ll/ۙ֨֨;
    .locals 1

    .line 702
    iget-object v0, p0, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 2263
    invoke-virtual {v0}, Ll/ۙ֨֨;->۟()Ll/ۙ֨֨;

    move-result-object v0

    return-object v0
.end method

.method public ᩴ()Ll/ۤܶ۠;
    .locals 1

    .line 723
    iget-object v0, p0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    return-object v0
.end method

.method public final ᩶֫()Z
    .locals 2

    .line 2222
    invoke-virtual {p0}, Ll/ۘ֡֨;->֫()Ll/᩺᩸۠;

    move-result-object v0

    sget-object v1, Ll/᩺᩸۠;->ۜ֫:Ll/᩺᩸۠;

    if-eq v0, v1, :cond_1

    .line 2223
    invoke-virtual {p0}, Ll/ۘ֡֨;->֫()Ll/᩺᩸۠;

    move-result-object v0

    sget-object v1, Ll/᩺᩸۠;->ۨ:Ll/᩺᩸۠;

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

.method public bridge synthetic ᩷()Ll/ۖܶ۠;
    .locals 1

    .line 1899
    invoke-virtual {p0}, Ll/ۛ֡֨;->ۤ()Ll/ۖܶ۠;

    move-result-object v0

    return-object v0
.end method

.method public ᩹֫()Ll/ܺ֡֨;
    .locals 2

    .line 1980
    new-instance v0, Ll/ܺ֡֨;

    const/4 v1, 0x0

    .line 2357
    invoke-direct {v0, p0, v1}, Ll/ܺ֡֨;-><init>(Ll/ۛ֡֨;Z)V

    return-object v0
.end method
