.class public Ll/֡֡֨;
.super Ll/᩶֡֨;
.source "643O"

# interfaces
.implements Ll/ܿ᩹۠;


# instance fields
.field public ֫֫:Ll/ܳ֡֨;

.field public ۖ֫:Ll/ۤܶ۠;

.field public ۘ֫:Ljava/util/Map;

.field public ۛ:Ll/֫᩶۠;

.field public final ۜ֫:Ljava/util/EnumSet;

.field public final ۟:Ljava/util/EnumSet;

.field public ۡ֫:Ll/ۖܶ۠;

.field public ۢ֫:Ll/۠֡֨;

.field public ۧ֫:Ll/ۖܶ۠;

.field public ۨ:Ll/ۖܶ۠;

.field public ܰ:Ll/ۖܶ۠;

.field public ܳ֫:Ljava/util/HashSet;

.field public ܺ֫:Ll/ۜ֡֨;

.field public ܽ֫:Ll/֫᩶۠;

.field public ܿ֫:Ll/ۖܶ۠;

.field public ᩳ֫:Ll/֫᩶۠;

.field public ᩷֫:Ll/֫᩶۠;

.field public ᩺:Ll/ۖܶ۠;

.field public ᩻֫:Ll/ۖܶ۠;


# direct methods
.method public constructor <init>(Ll/ۤܶ۠;)V
    .locals 7

    .line 1004
    sget-object v1, Ll/֨ᩴ֨;->۟:Ll/֨ᩴ֨;

    const-wide/16 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v4, p1

    .line 799
    invoke-direct/range {v0 .. v6}, Ll/ۛ֡֨;-><init>(Ll/֨ᩴ֨;JLl/ۤܶ۠;Ll/ۙ֨֨;Ll/ۛ֡֨;)V

    .line 984
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    iput-object v0, p0, Ll/֡֡֨;->᩺:Ll/ۖܶ۠;

    .line 986
    sget-object v0, Ll/ۜ֡֨;->ܶ:Ll/ۜ֡֨;

    iput-object v0, p0, Ll/֡֡֨;->ܺ֫:Ll/ۜ֡֨;

    .line 987
    const-class v0, Ll/ᩴ֡֨;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    iput-object v0, p0, Ll/֡֡֨;->۟:Ljava/util/EnumSet;

    .line 988
    const-class v0, Ll/᩵֡֨;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    iput-object v0, p0, Ll/֡֡֨;->ۜ֫:Ljava/util/EnumSet;

    .line 1005
    invoke-static {p1}, Ll/۫ۙ;->֫(Ljava/lang/Object;)V

    .line 1006
    new-instance p1, Ll/ܽ֨֨;

    .line 1581
    sget-object v0, Ll/᩷۠֨;->ۧ:Ll/᩷۠֨;

    invoke-direct {p1, p0, v0}, Ll/ۙ֨֨;-><init>(Ll/᩶֡֨;Ll/᩷۠֨;)V

    .line 1006
    iput-object p1, p0, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 1067
    iget-object v0, p0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    if-nez v0, :cond_0

    const-string v0, "<unknown>"

    return-object v0

    .line 1068
    :cond_0
    invoke-virtual {v0}, Ll/ۤܶ۠;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "<unnamed>"

    return-object v0

    .line 1069
    :cond_1
    iget-object v0, p0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/۠᩹۠;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1075
    invoke-virtual {p1, p0, p2}, Ll/۠᩹۠;->֫(Ll/֡֡֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ll/᩺᩸۠;
    .locals 1

    .line 1040
    sget-object v0, Ll/᩺᩸۠;->֫֫:Ll/᩺᩸۠;

    return-object v0
.end method

.method public final ۘ()I
    .locals 1

    const/16 v0, 0x13

    return v0
.end method

.method public final ۙ֫()Z
    .locals 1

    .line 1026
    iget-object v0, p0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {v0}, Ll/ۤܶ۠;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۠֫()Ll/ܳ֡֨;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۢ֫()Z
    .locals 5

    .line 375
    iget-wide v0, p0, Ll/ۛ֡֨;->᩶:J

    const-wide/high16 v2, 0x40000000000000L

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

.method public final ۧ()Ll/ۤܶ۠;
    .locals 1

    .line 471
    iget-object v0, p0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    return-object v0
.end method

.method public final bridge synthetic ܺ()Ljava/util/List;
    .locals 1

    .line 962
    invoke-virtual {p0}, Ll/֡֡֨;->ܺ()Ll/ۖܶ۠;

    move-result-object v0

    return-object v0
.end method

.method public final ܺ()Ll/ۖܶ۠;
    .locals 6

    .line 1080
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    .line 1081
    iget-object v1, p0, Ll/֡֡֨;->᩺:Ll/ۖܶ۠;

    invoke-virtual {v1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛ֡֨;

    .line 1082
    invoke-virtual {v2}, Ll/ۛ֡֨;->֨֫()Ll/ܰ᩵֨;

    move-result-object v3

    new-instance v4, Ll/ᩴۧ֨;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Ll/ᩴۧ֨;-><init>(I)V

    invoke-virtual {v3, v4}, Ll/۟᩵֨;->֫(Ll/ᩴۧ֨;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1083
    invoke-virtual {v0, v2}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v0

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final ܽ֫()Ll/ۤܶ۠;
    .locals 1

    .line 1016
    iget-object v0, p0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-static {v0}, Ll/۬֨۠;->ܽ(Ll/ۤܶ۠;)Ll/ۤܶ۠;

    move-result-object v0

    return-object v0
.end method

.method public final ᩴ()Ll/ۤܶ۠;
    .locals 1

    .line 1016
    iget-object v0, p0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-static {v0}, Ll/۬֨۠;->ܽ(Ll/ۤܶ۠;)Ll/ۤܶ۠;

    move-result-object v0

    return-object v0
.end method
