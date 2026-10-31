.class public final Ll/ܺۧ᩵;
.super Ll/ܿܰᩴ;
.source "N673"


# instance fields
.field public final j:Ll/۫᩺ᩴ;

.field public final k:Ljava/util/function/IntFunction;

.field public final l:Z

.field public m:J

.field public n:Z

.field public volatile o:Z


# direct methods
.method public constructor <init>(Ll/۫᩺ᩴ;Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;)V
    .locals 0

    .line 1180
    invoke-direct {p0, p2, p3}, Ll/ܿܰᩴ;-><init>(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;)V

    .line 1181
    iput-object p1, p0, Ll/ܺۧ᩵;->j:Ll/۫᩺ᩴ;

    .line 1182
    iput-object p4, p0, Ll/ܺۧ᩵;->k:Ljava/util/function/IntFunction;

    .line 1183
    sget-object p1, Ll/۟۟ᩴ;->ORDERED:Ll/۟۟ᩴ;

    check-cast p2, Ll/۫᩺ᩴ;

    .line 509
    iget p2, p2, Ll/۫᩺ᩴ;->m:I

    .line 1183
    invoke-virtual {p1, p2}, Ll/۟۟ᩴ;->s(I)Z

    move-result p1

    iput-boolean p1, p0, Ll/ܺۧ᩵;->l:Z

    return-void
.end method

.method public constructor <init>(Ll/ܺۧ᩵;Ll/ܶ۫ᩴ;)V
    .locals 0

    .line 1187
    invoke-direct {p0, p1, p2}, Ll/ܿܰᩴ;-><init>(Ll/ܿܰᩴ;Ll/ܶ۫ᩴ;)V

    .line 1188
    iget-object p2, p1, Ll/ܺۧ᩵;->j:Ll/۫᩺ᩴ;

    iput-object p2, p0, Ll/ܺۧ᩵;->j:Ll/۫᩺ᩴ;

    .line 1189
    iget-object p2, p1, Ll/ܺۧ᩵;->k:Ljava/util/function/IntFunction;

    iput-object p2, p0, Ll/ܺۧ᩵;->k:Ljava/util/function/IntFunction;

    .line 1190
    iget-boolean p1, p1, Ll/ܺۧ᩵;->l:Z

    iput-boolean p1, p0, Ll/ܺۧ᩵;->l:Z

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    .line 1205
    iget-object v0, p0, Ll/۬ܰᩴ;->a:Ll/ۡ᩺ᩴ;

    const-wide/16 v1, -0x1

    iget-object v3, p0, Ll/ܺۧ᩵;->k:Ljava/util/function/IntFunction;

    invoke-virtual {v0, v1, v2, v3}, Ll/ۡ᩺ᩴ;->c0(JLjava/util/function/IntFunction;)Ll/ۡܳ᩵;

    move-result-object v0

    .line 1206
    iget-object v1, p0, Ll/ܺۧ᩵;->j:Ll/۫᩺ᩴ;

    iget-object v2, p0, Ll/۬ܰᩴ;->a:Ll/ۡ᩺ᩴ;

    check-cast v2, Ll/۫᩺ᩴ;

    .line 509
    iget v2, v2, Ll/۫᩺ᩴ;->m:I

    .line 1206
    invoke-virtual {v1, v2, v0}, Ll/۫᩺ᩴ;->q0(ILl/֡ᩳ᩵;)Ll/֡ᩳ᩵;

    move-result-object v1

    .line 1208
    iget-object v2, p0, Ll/۬ܰᩴ;->a:Ll/ۡ᩺ᩴ;

    invoke-virtual {v2, v1}, Ll/ۡ᩺ᩴ;->g0(Ll/֡ᩳ᩵;)Ll/֡ᩳ᩵;

    move-result-object v1

    iget-object v3, p0, Ll/۬ܰᩴ;->b:Ll/ܶ۫ᩴ;

    invoke-virtual {v2, v3, v1}, Ll/ۡ᩺ᩴ;->N(Ll/ܶ۫ᩴ;Ll/֡ᩳ᩵;)Z

    move-result v1

    iput-boolean v1, p0, Ll/ܺۧ᩵;->n:Z

    if-eqz v1, :cond_0

    .line 1211
    invoke-virtual {p0}, Ll/ܿܰᩴ;->g()V

    .line 1214
    :cond_0
    invoke-interface {v0}, Ll/ۡܳ᩵;->build()Ll/ۚ۟ᩴ;

    move-result-object v0

    .line 1215
    invoke-interface {v0}, Ll/ۚ۟ᩴ;->count()J

    move-result-wide v1

    iput-wide v1, p0, Ll/ܺۧ᩵;->m:J

    return-object v0
.end method

.method public final c(Ll/ܶ۫ᩴ;)Ll/۬ܰᩴ;
    .locals 1

    .line 1195
    new-instance v0, Ll/ܺۧ᩵;

    invoke-direct {v0, p0, p1}, Ll/ܺۧ᩵;-><init>(Ll/ܺۧ᩵;Ll/ܶ۫ᩴ;)V

    return-object v0
.end method

.method public final f()V
    .locals 1

    const/4 v0, 0x1

    .line 197
    iput-boolean v0, p0, Ll/ܿܰᩴ;->i:Z

    .line 1267
    iget-boolean v0, p0, Ll/ܺۧ᩵;->l:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ܺۧ᩵;->o:Z

    if-eqz v0, :cond_0

    .line 1200
    iget-object v0, p0, Ll/ܺۧ᩵;->j:Ll/۫᩺ᩴ;

    invoke-virtual {v0}, Ll/۫᩺ᩴ;->m0()Ll/ۡ֫᩵;

    move-result-object v0

    invoke-static {v0}, Ll/ۡ᩺ᩴ;->P(Ll/ۡ֫᩵;)Ll/ۢ᩺ᩴ;

    move-result-object v0

    .line 1270
    invoke-virtual {p0, v0}, Ll/ܿܰᩴ;->d(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final h()Ljava/lang/Object;
    .locals 1

    .line 1200
    iget-object v0, p0, Ll/ܺۧ᩵;->j:Ll/۫᩺ᩴ;

    invoke-virtual {v0}, Ll/۫᩺ᩴ;->m0()Ll/ۡ֫᩵;

    move-result-object v0

    invoke-static {v0}, Ll/ۡ᩺ᩴ;->P(Ll/ۡ֫᩵;)Ll/ۢ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final onCompletion(Ljava/util/concurrent/CountedCompleter;)V
    .locals 8

    .line 267
    iget-object v0, p0, Ll/۬ܰᩴ;->d:Ll/۬ܰᩴ;

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 1223
    :cond_0
    check-cast v0, Ll/ܺۧ᩵;

    iget-boolean v0, v0, Ll/ܺۧ᩵;->n:Z

    iget-object v1, p0, Ll/۬ܰᩴ;->e:Ll/۬ܰᩴ;

    check-cast v1, Ll/ܺۧ᩵;

    iget-boolean v1, v1, Ll/ܺۧ᩵;->n:Z

    or-int/2addr v0, v1

    iput-boolean v0, p0, Ll/ܺۧ᩵;->n:Z

    .line 1224
    iget-boolean v0, p0, Ll/ܺۧ᩵;->l:Z

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ll/ܿܰᩴ;->i:Z

    if-eqz v0, :cond_1

    .line 1225
    iput-wide v1, p0, Ll/ܺۧ᩵;->m:J

    .line 1200
    iget-object v0, p0, Ll/ܺۧ᩵;->j:Ll/۫᩺ᩴ;

    invoke-virtual {v0}, Ll/۫᩺ᩴ;->m0()Ll/ۡ֫᩵;

    move-result-object v0

    invoke-static {v0}, Ll/ۡ᩺ᩴ;->P(Ll/ۡ֫᩵;)Ll/ۢ᩺ᩴ;

    move-result-object v0

    goto :goto_0

    .line 1228
    :cond_1
    iget-boolean v0, p0, Ll/ܺۧ᩵;->l:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/۬ܰᩴ;->d:Ll/۬ܰᩴ;

    check-cast v0, Ll/ܺۧ᩵;

    iget-boolean v3, v0, Ll/ܺۧ᩵;->n:Z

    if-eqz v3, :cond_2

    .line 1231
    iget-wide v1, v0, Ll/ܺۧ᩵;->m:J

    iput-wide v1, p0, Ll/ܺۧ᩵;->m:J

    .line 1232
    invoke-virtual {v0}, Ll/ܿܰᩴ;->i()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚ۟ᩴ;

    goto :goto_0

    .line 1235
    :cond_2
    iget-object v0, p0, Ll/۬ܰᩴ;->d:Ll/۬ܰᩴ;

    check-cast v0, Ll/ܺۧ᩵;

    iget-wide v3, v0, Ll/ܺۧ᩵;->m:J

    iget-object v5, p0, Ll/۬ܰᩴ;->e:Ll/۬ܰᩴ;

    check-cast v5, Ll/ܺۧ᩵;

    iget-wide v6, v5, Ll/ܺۧ᩵;->m:J

    add-long/2addr v3, v6

    iput-wide v3, p0, Ll/ܺۧ᩵;->m:J

    .line 1247
    iget-wide v3, v0, Ll/ܺۧ᩵;->m:J

    cmp-long v6, v3, v1

    if-nez v6, :cond_3

    .line 1250
    invoke-virtual {v5}, Ll/ܿܰᩴ;->i()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚ۟ᩴ;

    goto :goto_0

    .line 1252
    :cond_3
    iget-wide v3, v5, Ll/ܺۧ᩵;->m:J

    cmp-long v5, v3, v1

    if-nez v5, :cond_4

    .line 1255
    invoke-virtual {v0}, Ll/ܿܰᩴ;->i()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚ۟ᩴ;

    goto :goto_0

    .line 1259
    :cond_4
    iget-object v0, p0, Ll/ܺۧ᩵;->j:Ll/۫᩺ᩴ;

    invoke-virtual {v0}, Ll/۫᩺ᩴ;->m0()Ll/ۡ֫᩵;

    move-result-object v0

    iget-object v1, p0, Ll/۬ܰᩴ;->d:Ll/۬ܰᩴ;

    check-cast v1, Ll/ܺۧ᩵;

    .line 1260
    invoke-virtual {v1}, Ll/ܿܰᩴ;->i()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚ۟ᩴ;

    iget-object v2, p0, Ll/۬ܰᩴ;->e:Ll/۬ܰᩴ;

    check-cast v2, Ll/ܺۧ᩵;

    invoke-virtual {v2}, Ll/ܿܰᩴ;->i()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۚ۟ᩴ;

    .line 1259
    invoke-static {v0, v1, v2}, Ll/ۡ᩺ᩴ;->L(Ll/ۡ֫᩵;Ll/ۚ۟ᩴ;Ll/ۚ۟ᩴ;)Ll/ܳ֫᩵;

    move-result-object v0

    .line 1239
    :goto_0
    invoke-virtual {p0, v0}, Ll/ܿܰᩴ;->d(Ljava/lang/Object;)V

    :goto_1
    const/4 v0, 0x1

    .line 1242
    iput-boolean v0, p0, Ll/ܺۧ᩵;->o:Z

    .line 1243
    invoke-super {p0, p1}, Ll/۬ܰᩴ;->onCompletion(Ljava/util/concurrent/CountedCompleter;)V

    return-void
.end method
