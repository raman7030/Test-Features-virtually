.class public abstract Ll/۫᩺ᩴ;
.super Ll/ۡ᩺ᩴ;
.source "N673"

# interfaces
.implements Ll/۫ۨᩴ;


# instance fields
.field public final h:Ll/۫᩺ᩴ;

.field public final i:Ll/۫᩺ᩴ;

.field public final j:I

.field public final k:Ll/۫᩺ᩴ;

.field public l:I

.field public m:I

.field public n:Ll/ܶ۫ᩴ;

.field public o:Z

.field public final p:Z

.field public q:Ljava/lang/Runnable;

.field public r:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 72
    const-class v0, Ll/۫᩺ᩴ;

    return-void
.end method

.method public constructor <init>(Ll/۫᩺ᩴ;I)V
    .locals 2

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 202
    iget-boolean v0, p1, Ll/۫᩺ᩴ;->o:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 204
    iput-boolean v0, p1, Ll/۫᩺ᩴ;->o:Z

    .line 205
    iput-object p0, p1, Ll/۫᩺ᩴ;->k:Ll/۫᩺ᩴ;

    .line 207
    iput-object p1, p0, Ll/۫᩺ᩴ;->i:Ll/۫᩺ᩴ;

    .line 208
    sget v1, Ll/۟۟ᩴ;->h:I

    and-int/2addr v1, p2

    iput v1, p0, Ll/۫᩺ᩴ;->j:I

    .line 209
    iget v1, p1, Ll/۫᩺ᩴ;->m:I

    invoke-static {p2, v1}, Ll/۟۟ᩴ;->l(II)I

    move-result p2

    iput p2, p0, Ll/۫᩺ᩴ;->m:I

    .line 210
    iget-object p2, p1, Ll/۫᩺ᩴ;->h:Ll/۫᩺ᩴ;

    iput-object p2, p0, Ll/۫᩺ᩴ;->h:Ll/۫᩺ᩴ;

    .line 211
    invoke-virtual {p0}, Ll/۫᩺ᩴ;->p0()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 212
    iput-boolean v0, p2, Ll/۫᩺ᩴ;->p:Z

    .line 213
    :cond_0
    iget p1, p1, Ll/۫᩺ᩴ;->l:I

    add-int/2addr p1, v0

    iput p1, p0, Ll/۫᩺ᩴ;->l:I

    return-void

    .line 203
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "stream has already been operated upon or closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ll/ܶ۫ᩴ;IZ)V
    .locals 1

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 182
    iput-object v0, p0, Ll/۫᩺ᩴ;->i:Ll/۫᩺ᩴ;

    .line 183
    iput-object p1, p0, Ll/۫᩺ᩴ;->n:Ll/ܶ۫ᩴ;

    .line 184
    iput-object p0, p0, Ll/۫᩺ᩴ;->h:Ll/۫᩺ᩴ;

    .line 185
    sget p1, Ll/۟۟ᩴ;->g:I

    and-int/2addr p1, p2

    iput p1, p0, Ll/۫᩺ᩴ;->j:I

    shl-int/lit8 p1, p1, 0x1

    not-int p1, p1

    .line 188
    sget p2, Ll/۟۟ᩴ;->l:I

    and-int/2addr p1, p2

    iput p1, p0, Ll/۫᩺ᩴ;->m:I

    const/4 p1, 0x0

    .line 189
    iput p1, p0, Ll/۫᩺ᩴ;->l:I

    .line 190
    iput-boolean p3, p0, Ll/۫᩺ᩴ;->r:Z

    return-void
.end method


# virtual methods
.method public final M(Ll/ܶ۫ᩴ;Ll/֡ᩳ᩵;)V
    .locals 2

    .line 480
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    sget-object v0, Ll/۟۟ᩴ;->SHORT_CIRCUIT:Ll/۟۟ᩴ;

    .line 509
    iget v1, p0, Ll/۫᩺ᩴ;->m:I

    .line 482
    invoke-virtual {v0, v1}, Ll/۟۟ᩴ;->s(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 483
    invoke-interface {p1}, Ll/ܶ۫ᩴ;->getExactSizeIfKnown()J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, Ll/֡ᩳ᩵;->c(J)V

    .line 484
    invoke-interface {p1, p2}, Ll/ܶ۫ᩴ;->forEachRemaining(Ljava/util/function/Consumer;)V

    .line 485
    invoke-interface {p2}, Ll/֡ᩳ᩵;->end()V

    return-void

    .line 488
    :cond_0
    invoke-virtual {p0, p1, p2}, Ll/۫᩺ᩴ;->N(Ll/ܶ۫ᩴ;Ll/֡ᩳ᩵;)Z

    return-void
.end method

.method public final N(Ll/ܶ۫ᩴ;Ll/֡ᩳ᩵;)Z
    .locals 3

    move-object v0, p0

    .line 497
    :goto_0
    iget v1, v0, Ll/۫᩺ᩴ;->l:I

    if-lez v1, :cond_0

    .line 498
    iget-object v0, v0, Ll/۫᩺ᩴ;->i:Ll/۫᩺ᩴ;

    goto :goto_0

    .line 501
    :cond_0
    invoke-interface {p1}, Ll/ܶ۫ᩴ;->getExactSizeIfKnown()J

    move-result-wide v1

    invoke-interface {p2, v1, v2}, Ll/֡ᩳ᩵;->c(J)V

    .line 502
    invoke-virtual {v0, p1, p2}, Ll/۫᩺ᩴ;->l0(Ll/ܶ۫ᩴ;Ll/֡ᩳ᩵;)Z

    move-result p1

    .line 503
    invoke-interface {p2}, Ll/֡ᩳ᩵;->end()V

    return p1
.end method

.method public final Q(Ll/ܶ۫ᩴ;ZLjava/util/function/IntFunction;)Ll/ۚ۟ᩴ;
    .locals 2

    .line 373
    iget-object v0, p0, Ll/۫᩺ᩴ;->h:Ll/۫᩺ᩴ;

    iget-boolean v0, v0, Ll/۫᩺ᩴ;->r:Z

    if-eqz v0, :cond_0

    .line 545
    invoke-virtual {p0, p0, p1, p2, p3}, Ll/۫᩺ᩴ;->k0(Ll/۫᩺ᩴ;Ll/ܶ۫ᩴ;ZLjava/util/function/IntFunction;)Ll/ۚ۟ᩴ;

    move-result-object p1

    return-object p1

    .line 549
    :cond_0
    invoke-virtual {p0, p1}, Ll/۫᩺ᩴ;->R(Ll/ܶ۫ᩴ;)J

    move-result-wide v0

    .line 548
    invoke-virtual {p0, v0, v1, p3}, Ll/ۡ᩺ᩴ;->c0(JLjava/util/function/IntFunction;)Ll/ۡܳ᩵;

    move-result-object p2

    .line 550
    invoke-virtual {p0, p1, p2}, Ll/۫᩺ᩴ;->f0(Ll/ܶ۫ᩴ;Ll/֡ᩳ᩵;)Ll/֡ᩳ᩵;

    invoke-interface {p2}, Ll/ۡܳ᩵;->build()Ll/ۚ۟ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final R(Ll/ܶ۫ᩴ;)J
    .locals 2

    .line 469
    sget-object v0, Ll/۟۟ᩴ;->SIZED:Ll/۟۟ᩴ;

    .line 509
    iget v1, p0, Ll/۫᩺ᩴ;->m:I

    .line 469
    invoke-virtual {v0, v1}, Ll/۟۟ᩴ;->s(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ll/ܶ۫ᩴ;->getExactSizeIfKnown()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public final close()V
    .locals 3

    const/4 v0, 0x1

    .line 317
    iput-boolean v0, p0, Ll/۫᩺ᩴ;->o:Z

    const/4 v0, 0x0

    .line 319
    iput-object v0, p0, Ll/۫᩺ᩴ;->n:Ll/ܶ۫ᩴ;

    .line 320
    iget-object v1, p0, Ll/۫᩺ᩴ;->h:Ll/۫᩺ᩴ;

    iget-object v2, v1, Ll/۫᩺ᩴ;->q:Ljava/lang/Runnable;

    if-eqz v2, :cond_0

    .line 322
    iput-object v0, v1, Ll/۫᩺ᩴ;->q:Ljava/lang/Runnable;

    .line 323
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method

.method public final f0(Ll/ܶ۫ᩴ;Ll/֡ᩳ᩵;)Ll/֡ᩳ᩵;
    .locals 1

    .line 474
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡ᩳ᩵;

    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->g0(Ll/֡ᩳ᩵;)Ll/֡ᩳ᩵;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Ll/۫᩺ᩴ;->M(Ll/ܶ۫ᩴ;Ll/֡ᩳ᩵;)V

    return-object p2
.end method

.method public final g0(Ll/֡ᩳ᩵;)Ll/֡ᩳ᩵;
    .locals 2

    .line 519
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, p0

    .line 521
    :goto_0
    iget v1, v0, Ll/۫᩺ᩴ;->l:I

    if-lez v1, :cond_0

    .line 522
    iget-object v1, v0, Ll/۫᩺ᩴ;->i:Ll/۫᩺ᩴ;

    iget v1, v1, Ll/۫᩺ᩴ;->m:I

    invoke-virtual {v0, v1, p1}, Ll/۫᩺ᩴ;->q0(ILl/֡ᩳ᩵;)Ll/֡ᩳ᩵;

    move-result-object p1

    .line 521
    iget-object v0, v0, Ll/۫᩺ᩴ;->i:Ll/۫᩺ᩴ;

    goto :goto_0

    :cond_0
    return-object p1
.end method

.method public final h0(Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;
    .locals 2

    .line 530
    iget v0, p0, Ll/۫᩺ᩴ;->l:I

    if-nez v0, :cond_0

    return-object p1

    .line 534
    :cond_0
    new-instance v0, Ll/֡᩺ᩴ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Ll/֡᩺ᩴ;-><init>(ILjava/lang/Object;)V

    .line 373
    iget-object p1, p0, Ll/۫᩺ᩴ;->h:Ll/۫᩺ᩴ;

    iget-boolean p1, p1, Ll/۫᩺ᩴ;->r:Z

    .line 534
    invoke-virtual {p0, p0, v0, p1}, Ll/۫᩺ᩴ;->t0(Ll/۫᩺ᩴ;Ljava/util/function/Supplier;Z)Ll/ܶ۫ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final i0(Ll/᩷ᩳ᩵;)Ljava/lang/Object;
    .locals 1

    .line 228
    iget-boolean v0, p0, Ll/۫᩺ᩴ;->o:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 230
    iput-boolean v0, p0, Ll/۫᩺ᩴ;->o:Z

    .line 373
    iget-object v0, p0, Ll/۫᩺ᩴ;->h:Ll/۫᩺ᩴ;

    iget-boolean v0, v0, Ll/۫᩺ᩴ;->r:Z

    if-eqz v0, :cond_0

    .line 233
    invoke-interface {p1}, Ll/᩷ᩳ᩵;->j()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->r0(I)Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-interface {p1, p0, v0}, Ll/᩷ᩳ᩵;->e(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 234
    :cond_0
    invoke-interface {p1}, Ll/᩷ᩳ᩵;->j()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/۫᩺ᩴ;->r0(I)Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-interface {p1, p0, v0}, Ll/᩷ᩳ᩵;->b(Ll/۫᩺ᩴ;Ll/ܶ۫ᩴ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 229
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "stream has already been operated upon or closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final isParallel()Z
    .locals 1

    .line 373
    iget-object v0, p0, Ll/۫᩺ᩴ;->h:Ll/۫᩺ᩴ;

    iget-boolean v0, v0, Ll/۫᩺ᩴ;->r:Z

    return v0
.end method

.method public final j0(Ljava/util/function/IntFunction;)Ll/ۚ۟ᩴ;
    .locals 3

    .line 245
    iget-boolean v0, p0, Ll/۫᩺ᩴ;->o:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 247
    iput-boolean v0, p0, Ll/۫᩺ᩴ;->o:Z

    .line 373
    iget-object v1, p0, Ll/۫᩺ᩴ;->h:Ll/۫᩺ᩴ;

    iget-boolean v1, v1, Ll/۫᩺ᩴ;->r:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 251
    iget-object v1, p0, Ll/۫᩺ᩴ;->i:Ll/۫᩺ᩴ;

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ll/۫᩺ᩴ;->p0()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 256
    iput v2, p0, Ll/۫᩺ᩴ;->l:I

    .line 257
    iget-object v0, p0, Ll/۫᩺ᩴ;->i:Ll/۫᩺ᩴ;

    invoke-virtual {v0, v2}, Ll/۫᩺ᩴ;->r0(I)Ll/ܶ۫ᩴ;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, Ll/۫᩺ᩴ;->n0(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;)Ll/ۚ۟ᩴ;

    move-result-object p1

    return-object p1

    .line 260
    :cond_0
    invoke-virtual {p0, v2}, Ll/۫᩺ᩴ;->r0(I)Ll/ܶ۫ᩴ;

    move-result-object v1

    invoke-virtual {p0, v1, v0, p1}, Ll/۫᩺ᩴ;->Q(Ll/ܶ۫ᩴ;ZLjava/util/function/IntFunction;)Ll/ۚ۟ᩴ;

    move-result-object p1

    return-object p1

    .line 246
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "stream has already been operated upon or closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract k0(Ll/۫᩺ᩴ;Ll/ܶ۫ᩴ;ZLjava/util/function/IntFunction;)Ll/ۚ۟ᩴ;
.end method

.method public abstract l0(Ll/ܶ۫ᩴ;Ll/֡ᩳ᩵;)Z
.end method

.method public abstract m0()Ll/ۡ֫᩵;
.end method

.method public n0(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;)Ll/ۚ۟ᩴ;
    .locals 0

    .line 684
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Parallel evaluation is not supported"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public o0(Ll/۫᩺ᩴ;Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;
    .locals 2

    .line 710
    new-instance v0, Ll/ۡ֨ᩴ;

    const/16 v1, 0xd

    .line 0
    invoke-direct {v0, v1}, Ll/ۡ֨ᩴ;-><init>(I)V

    .line 710
    invoke-virtual {p0, p1, p2, v0}, Ll/۫᩺ᩴ;->n0(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;)Ll/ۚ۟ᩴ;

    move-result-object p1

    invoke-interface {p1}, Ll/ۚ۟ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final onClose(Ljava/lang/Runnable;)Ll/۫ۨᩴ;
    .locals 3

    .line 330
    iget-boolean v0, p0, Ll/۫᩺ᩴ;->o:Z

    if-nez v0, :cond_1

    .line 332
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    iget-object v0, p0, Ll/۫᩺ᩴ;->h:Ll/۫᩺ᩴ;

    iget-object v1, v0, Ll/۫᩺ᩴ;->q:Ljava/lang/Runnable;

    if-nez v1, :cond_0

    goto :goto_0

    .line 836
    :cond_0
    new-instance v2, Ll/᩸ۧ᩵;

    invoke-direct {v2, v1, p1}, Ll/᩸ۧ᩵;-><init>(Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    move-object p1, v2

    .line 337
    :goto_0
    iput-object p1, v0, Ll/۫᩺ᩴ;->q:Ljava/lang/Runnable;

    return-object p0

    .line 331
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "stream has already been operated upon or closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract p0()Z
.end method

.method public final parallel()Ll/۫ۨᩴ;
    .locals 2

    .line 311
    iget-object v0, p0, Ll/۫᩺ᩴ;->h:Ll/۫᩺ᩴ;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/۫᩺ᩴ;->r:Z

    return-object p0
.end method

.method public abstract q0(ILl/֡ᩳ᩵;)Ll/֡ᩳ᩵;
.end method

.method public final r0(I)Ll/ܶ۫ᩴ;
    .locals 7

    .line 400
    iget-object v0, p0, Ll/۫᩺ᩴ;->h:Ll/۫᩺ᩴ;

    iget-object v1, v0, Ll/۫᩺ᩴ;->n:Ll/ܶ۫ᩴ;

    if-eqz v1, :cond_5

    const/4 v2, 0x0

    .line 402
    iput-object v2, v0, Ll/۫᩺ᩴ;->n:Ll/ܶ۫ᩴ;

    .line 373
    iget-boolean v2, v0, Ll/۫᩺ᩴ;->r:Z

    if-eqz v2, :cond_3

    .line 412
    iget-boolean v2, v0, Ll/۫᩺ᩴ;->p:Z

    if-eqz v2, :cond_3

    .line 417
    iget-object v2, v0, Ll/۫᩺ᩴ;->k:Ll/۫᩺ᩴ;

    const/4 v3, 0x1

    :goto_0
    if-eq v0, p0, :cond_3

    .line 421
    iget v4, v2, Ll/۫᩺ᩴ;->j:I

    .line 422
    invoke-virtual {v2}, Ll/۫᩺ᩴ;->p0()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 425
    sget-object v3, Ll/۟۟ᩴ;->SHORT_CIRCUIT:Ll/۟۟ᩴ;

    invoke-virtual {v3, v4}, Ll/۟۟ᩴ;->s(I)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 431
    sget v3, Ll/۟۟ᩴ;->u:I

    not-int v3, v3

    and-int/2addr v4, v3

    .line 434
    :cond_0
    invoke-virtual {v2, v0, v1}, Ll/۫᩺ᩴ;->o0(Ll/۫᩺ᩴ;Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;

    move-result-object v1

    const/16 v3, 0x40

    .line 438
    invoke-interface {v1, v3}, Ll/ܶ۫ᩴ;->hasCharacteristics(I)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 439
    sget v3, Ll/۟۟ᩴ;->t:I

    not-int v3, v3

    and-int/2addr v3, v4

    sget v4, Ll/۟۟ᩴ;->s:I

    goto :goto_1

    .line 440
    :cond_1
    sget v3, Ll/۟۟ᩴ;->s:I

    not-int v3, v3

    and-int/2addr v3, v4

    sget v4, Ll/۟۟ᩴ;->t:I

    :goto_1
    or-int/2addr v4, v3

    const/4 v3, 0x0

    :cond_2
    add-int/lit8 v5, v3, 0x1

    .line 442
    iput v3, v2, Ll/۫᩺ᩴ;->l:I

    .line 443
    iget v0, v0, Ll/۫᩺ᩴ;->m:I

    invoke-static {v4, v0}, Ll/۟۟ᩴ;->l(II)I

    move-result v0

    iput v0, v2, Ll/۫᩺ᩴ;->m:I

    .line 419
    iget-object v0, v2, Ll/۫᩺ᩴ;->k:Ll/۫᩺ᩴ;

    move v3, v5

    move-object v6, v2

    move-object v2, v0

    move-object v0, v6

    goto :goto_0

    :cond_3
    if-eqz p1, :cond_4

    .line 449
    iget v0, p0, Ll/۫᩺ᩴ;->m:I

    invoke-static {p1, v0}, Ll/۟۟ᩴ;->l(II)I

    move-result p1

    iput p1, p0, Ll/۫᩺ᩴ;->m:I

    :cond_4
    return-object v1

    .line 409
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "source already consumed or closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final s0()Ll/ܶ۫ᩴ;
    .locals 3

    .line 275
    iget-object v0, p0, Ll/۫᩺ᩴ;->h:Ll/۫᩺ᩴ;

    if-ne p0, v0, :cond_2

    .line 278
    iget-boolean v1, p0, Ll/۫᩺ᩴ;->o:Z

    if-nez v1, :cond_1

    const/4 v1, 0x1

    .line 280
    iput-boolean v1, p0, Ll/۫᩺ᩴ;->o:Z

    .line 282
    iget-object v1, v0, Ll/۫᩺ᩴ;->n:Ll/ܶ۫ᩴ;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    .line 285
    iput-object v2, v0, Ll/۫᩺ᩴ;->n:Ll/ܶ۫ᩴ;

    return-object v1

    .line 295
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "source already consumed or closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 279
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "stream has already been operated upon or closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 276
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final sequential()Ll/۫ۨᩴ;
    .locals 2

    .line 304
    iget-object v0, p0, Ll/۫᩺ᩴ;->h:Ll/۫᩺ᩴ;

    const/4 v1, 0x0

    iput-boolean v1, v0, Ll/۫᩺ᩴ;->r:Z

    return-object p0
.end method

.method public spliterator()Ll/ܶ۫ᩴ;
    .locals 3

    .line 345
    iget-boolean v0, p0, Ll/۫᩺ᩴ;->o:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    .line 347
    iput-boolean v0, p0, Ll/۫᩺ᩴ;->o:Z

    .line 349
    iget-object v0, p0, Ll/۫᩺ᩴ;->h:Ll/۫᩺ᩴ;

    if-ne p0, v0, :cond_1

    .line 350
    iget-object v1, v0, Ll/۫᩺ᩴ;->n:Ll/ܶ۫ᩴ;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    .line 353
    iput-object v2, v0, Ll/۫᩺ᩴ;->n:Ll/ܶ۫ᩴ;

    return-object v1

    .line 363
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "source already consumed or closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 367
    :cond_1
    new-instance v1, Ll/֡᩺ᩴ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0}, Ll/֡᩺ᩴ;-><init>(ILjava/lang/Object;)V

    .line 373
    iget-boolean v0, v0, Ll/۫᩺ᩴ;->r:Z

    .line 367
    invoke-virtual {p0, p0, v1, v0}, Ll/۫᩺ᩴ;->t0(Ll/۫᩺ᩴ;Ljava/util/function/Supplier;Z)Ll/ܶ۫ᩴ;

    move-result-object v0

    return-object v0

    .line 346
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "stream has already been operated upon or closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public abstract t0(Ll/۫᩺ᩴ;Ljava/util/function/Supplier;Z)Ll/ܶ۫ᩴ;
.end method
