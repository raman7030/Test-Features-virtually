.class public final Ll/۠۠֨;
.super Ll/ۘ᩸֨;
.source "X43L"


# instance fields
.field public ᩸:Ljava/util/HashSet;

.field public final synthetic ᩹:Ll/ۛ᩸֨;


# direct methods
.method public constructor <init>(Ll/ۛ᩸֨;)V
    .locals 0

    .line 4899
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2159
    iput-object p1, p0, Ll/۠۠֨;->᩹:Ll/ۛ᩸֨;

    .line 2161
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Ll/۠۠֨;->᩸:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final bridge synthetic ֫(Ljava/lang/Object;Ll/ۙ֨֨;)Ljava/lang/Object;
    .locals 0

    .line 2159
    check-cast p1, Ll/ۛ֡֨;

    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/ۚۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 2159
    check-cast p2, Ll/ۛ֡֨;

    .line 2200
    iget-object v0, p2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    const/4 v1, 0x1

    .line 1071
    iget-object v2, p0, Ll/۠۠֨;->᩹:Ll/ۛ᩸֨;

    invoke-virtual {v2, p1, v0, v1}, Ll/ۛ᩸֨;->ܽ(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2200
    iget-object p1, p2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/ۡ֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 2159
    check-cast p2, Ll/ۛ֡֨;

    .line 2205
    iget-object v0, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    if-ne v0, p2, :cond_0

    return-object p1

    .line 2208
    :cond_0
    iget-object v0, p0, Ll/۠۠֨;->᩹:Ll/ۛ᩸֨;

    invoke-virtual {p1}, Ll/ۡ֨֨;->ᩳ֫()Ll/ۙ֨֨;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Ll/ۛ᩸֨;->ۧ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/۫ۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2159
    check-cast p2, Ll/ۛ֡֨;

    return-object p1
.end method

.method public final ֫(Ll/᩶ۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 2159
    check-cast p2, Ll/ۛ֡֨;

    .line 2169
    iget-object v0, p0, Ll/۠۠֨;->᩹:Ll/ۛ᩸֨;

    iget-object v1, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    if-ne v1, p2, :cond_0

    return-object p1

    .line 2173
    :cond_0
    iget-object v2, p0, Ll/۠۠֨;->᩸:Ljava/util/HashSet;

    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_1

    return-object v4

    .line 2177
    :cond_1
    :try_start_0
    invoke-virtual {v0, p1}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v3

    .line 2178
    sget-object v5, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    invoke-virtual {v3, v5}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v5

    if-nez v5, :cond_2

    sget-object v5, Ll/ۢ۠֨;->ۢ֫:Ll/ۢ۠֨;

    invoke-virtual {v3, v5}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 2179
    :cond_2
    invoke-virtual {v0, p2, v3}, Ll/ۛ᩸֨;->ۧ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_3

    .line 2194
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-object v3

    .line 2183
    :cond_3
    :try_start_1
    invoke-virtual {p2}, Ll/ۛ֡֨;->۬()J

    move-result-wide v5

    const-wide/16 v7, 0x200

    and-long/2addr v5, v7

    const-wide/16 v7, 0x0

    cmp-long v3, v5, v7

    if-eqz v3, :cond_5

    .line 2184
    invoke-virtual {v0, p1}, Ll/ۛ᩸֨;->ۖ(Ll/ۙ֨֨;)Ll/ۖܶ۠;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Ll/ۖܶ۠;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 2185
    iget-object v3, p1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v3, Ll/ۙ֨֨;

    sget-object v5, Ll/ۢ۠֨;->۟:Ll/ۢ۠֨;

    invoke-virtual {v3, v5}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v3

    if-nez v3, :cond_4

    .line 2186
    iget-object v3, p1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v3, Ll/ۙ֨֨;

    invoke-virtual {v0, p2, v3}, Ll/ۛ᩸֨;->ۧ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v3, :cond_4

    .line 2194
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-object v3

    .line 2184
    :cond_4
    :try_start_2
    iget-object p1, p1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 2194
    :cond_5
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-object v4

    :catchall_0
    move-exception p1

    invoke-virtual {v2, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 2195
    throw p1
.end method
