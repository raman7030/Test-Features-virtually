.class public Ll/۠֡֨;
.super Ll/᩶֡֨;
.source "643O"

# interfaces
.implements Ll/᩷᩹۠;


# instance fields
.field public ۛ:Ll/ۤܶ۠;

.field public ۟:Ll/ᩳ᩶۠;

.field public ۨ:Ll/ܰ᩵֨;

.field public ܰ:Ll/ܳ֡֨;

.field public ᩺:Ll/֡֡֨;


# direct methods
.method public constructor <init>(Ll/ۤܶ۠;Ll/ۛ֡֨;)V
    .locals 7

    .line 1151
    sget-object v1, Ll/֨ᩴ֨;->ᩳ֫:Ll/֨ᩴ֨;

    const-wide/16 v2, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v4, p1

    move-object v6, p2

    .line 799
    invoke-direct/range {v0 .. v6}, Ll/ۛ֡֨;-><init>(Ll/֨ᩴ֨;JLl/ۤܶ۠;Ll/ۙ֨֨;Ll/ۛ֡֨;)V

    const/4 v0, 0x0

    .line 1152
    iput-object v0, p0, Ll/۠֡֨;->ۨ:Ll/ܰ᩵֨;

    .line 1153
    invoke-static {p1, p2}, Ll/᩶֡֨;->ۧ(Ll/ۤܶ۠;Ll/ۛ֡֨;)Ll/ۤܶ۠;

    move-result-object p1

    iput-object p1, p0, Ll/۠֡֨;->ۛ:Ll/ۤܶ۠;

    .line 1158
    new-instance p1, Ll/ᩳ֨֨;

    .line 1543
    sget-object p2, Ll/᩷۠֨;->ۧ:Ll/᩷۠֨;

    invoke-direct {p1, p0, p2}, Ll/ۙ֨֨;-><init>(Ll/᩶֡֨;Ll/᩷۠֨;)V

    .line 1158
    iput-object p1, p0, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 1162
    iget-object v0, p0, Ll/۠֡֨;->ۛ:Ll/ۤܶ۠;

    invoke-virtual {v0}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֨֫()Ll/ܰ᩵֨;
    .locals 1

    .line 1176
    invoke-virtual {p0}, Ll/ۛ֡֨;->᩶()V

    .line 1177
    iget-object v0, p0, Ll/۠֡֨;->ۨ:Ll/ܰ᩵֨;

    return-object v0
.end method

.method public final ֫(Ll/۠᩹۠;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1227
    invoke-virtual {p1, p0, p2}, Ll/۠᩹۠;->֫(Ll/۠֡֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۤ֡֨;Ljava/util/Locale;)Ljava/lang/Object;
    .locals 0

    .line 1231
    invoke-interface {p1, p0, p2}, Ll/ۤ֡֨;->֫(Ll/۠֡֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ll/᩺᩸۠;
    .locals 1

    .line 1217
    sget-object v0, Ll/᩺᩸۠;->ܽ֫:Ll/᩺᩸۠;

    return-object v0
.end method

.method public final ֫֫()Ll/ۖܶ۠;
    .locals 2

    .line 1192
    invoke-virtual {p0}, Ll/ۛ֡֨;->᩶()V

    .line 1193
    iget-object v0, p0, Ll/۠֡֨;->ܰ:Ll/ܳ֡֨;

    if-eqz v0, :cond_0

    .line 1194
    invoke-virtual {v0}, Ll/ܳ֡֨;->᩶()V

    .line 1201
    iget-object v0, p0, Ll/ۛ֡֨;->ۗ:Ll/ۨ֡֨;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/۠֡֨;->ܰ:Ll/ܳ֡֨;

    iget-object v0, v0, Ll/ۛ֡֨;->ۗ:Ll/ۨ֡֨;

    if-eqz v0, :cond_0

    .line 1203
    new-instance v0, Ll/ۨ֡֨;

    invoke-direct {v0, p0}, Ll/ۨ֡֨;-><init>(Ll/ۛ֡֨;)V

    iput-object v0, p0, Ll/ۛ֡֨;->ۗ:Ll/ۨ֡֨;

    .line 1204
    iget-object v1, p0, Ll/۠֡֨;->ܰ:Ll/ܳ֡֨;

    iget-object v1, v1, Ll/ۛ֡֨;->ۗ:Ll/ۨ֡֨;

    invoke-virtual {v0, v1}, Ll/ۨ֡֨;->֫(Ll/ۨ֡֨;)V

    .line 1197
    :cond_0
    invoke-super {p0}, Ll/ۛ֡֨;->֫֫()Ll/ۖܶ۠;

    move-result-object v0

    return-object v0
.end method

.method public final ۗ()Z
    .locals 5

    .line 1212
    iget-wide v0, p0, Ll/ۛ֡֨;->᩶:J

    const-wide/32 v2, 0x800000

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

.method public final ۗ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 1236
    iput-object v0, p0, Ll/ۛ֡֨;->ۗ:Ll/ۨ֡֨;

    return-void
.end method

.method public final ۘ()I
    .locals 1

    const/16 v0, 0x14

    return v0
.end method

.method public final ۙ֫()Z
    .locals 1

    .line 1172
    iget-object v0, p0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {v0}, Ll/ۤܶ۠;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۜ()Ll/ۛ֡֨;
    .locals 1

    .line 1222
    iget-object v0, p0, Ll/۠֡֨;->᩺:Ll/֡֡֨;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v0, v0, Ll/ܳۚ֨;

    if-nez v0, :cond_0

    .line 1222
    iget-object v0, p0, Ll/۠֡֨;->᩺:Ll/֡֡֨;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final bridge synthetic ۜ()Ll/ۨ᩸۠;
    .locals 1

    .line 1140
    invoke-virtual {p0}, Ll/۠֡֨;->ۜ()Ll/ۛ֡֨;

    move-result-object v0

    return-object v0
.end method

.method public final ۟()Ll/ۤܶ۠;
    .locals 1

    .line 1167
    iget-object v0, p0, Ll/۠֡֨;->ۛ:Ll/ۤܶ۠;

    return-object v0
.end method

.method public final ۧ()Ll/ۤܶ۠;
    .locals 1

    .line 1167
    iget-object v0, p0, Ll/۠֡֨;->ۛ:Ll/ۤܶ۠;

    return-object v0
.end method

.method public final ۬()J
    .locals 2

    .line 1186
    invoke-virtual {p0}, Ll/ۛ֡֨;->᩶()V

    .line 1187
    iget-wide v0, p0, Ll/ۛ֡֨;->᩶:J

    return-wide v0
.end method
