.class public final Ll/ܰۖܺ;
.super Ll/ܳۘܺ;
.source "2BFT"


# instance fields
.field public ۗ:Ll/᩶ۡܺ;

.field public final ۙ:I

.field public final ᩶:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(ILl/ܽۘܺ;)V
    .locals 1

    .line 78
    sget-object v0, Ll/۟ܺܺ;->ۨ֫:Ll/۟ܺܺ;

    invoke-static {p1, v0}, Ll/᩸ۡܺ;->֫(ILl/֫ۖܺ;)Ll/᩸ۡܺ;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Ll/ܳۘܺ;-><init>(Ll/᩸ۡܺ;Ll/ܽۘܺ;)V

    .line 49
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Ll/ܰۖܺ;->᩶:Ljava/util/ArrayList;

    .line 79
    iput p1, p0, Ll/ܰۖܺ;->ۙ:I

    return-void
.end method

.method public constructor <init>(Ll/᩸ۡܺ;Ll/ܽۘܺ;)V
    .locals 0

    .line 63
    invoke-direct {p0, p1, p2}, Ll/ܳۘܺ;-><init>(Ll/᩸ۡܺ;Ll/ܽۘܺ;)V

    .line 49
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Ll/ܰۖܺ;->᩶:Ljava/util/ArrayList;

    .line 64
    invoke-virtual {p1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result p1

    iput p1, p0, Ll/ܰۖܺ;->ۙ:I

    return-void
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 87
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "can\'t clone phi"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final clone()Ll/ܳۘܺ;
    .locals 2

    .line 87
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "can\'t clone phi"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֨()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 6

    .line 361
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x50

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 363
    sget-object v1, Ll/ۤۡܺ;->ᩳ:Ll/ۤۡܺ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ": phi"

    .line 364
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    invoke-virtual {p0}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v1

    const-string v2, " "

    const-string v3, " ."

    if-nez v1, :cond_0

    .line 375
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 377
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 378
    invoke-virtual {v1}, Ll/᩸ۡܺ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const-string v1, " <-"

    .line 381
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    invoke-virtual {p0}, Ll/ܰۖܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܿᩴܺ;->size()I

    move-result v1

    if-nez v1, :cond_1

    .line 385
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_2

    .line 388
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Ll/ܰۖܺ;->ۗ:Ll/᩶ۡܺ;

    invoke-virtual {v5, v3}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v5

    invoke-virtual {v5}, Ll/᩸ۡܺ;->֫()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "[b="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Ll/ܰۖܺ;->᩶:Ljava/util/ArrayList;

    .line 391
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۨۖܺ;

    iget v5, v5, Ll/ۨۖܺ;->ܽ:I

    invoke-static {v5}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "]"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 389
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 395
    :cond_2
    :goto_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(ILl/᩷ۘܺ;)Ljava/util/ArrayList;
    .locals 4

    .line 310
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 312
    iget-object v1, p0, Ll/ܰۖܺ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨۖܺ;

    .line 313
    iget-object v3, v2, Ll/ۨۖܺ;->ۧ:Ll/᩸ۡܺ;

    invoke-virtual {v3}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v3

    if-ne v3, p1, :cond_0

    .line 314
    invoke-virtual {p2}, Ll/᩷ۘܺ;->ۧ()Ljava/util/ArrayList;

    move-result-object v3

    iget v2, v2, Ll/ۨۖܺ;->֫:I

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽۘܺ;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final ֫(Ll/ܿۘܺ;)V
    .locals 0

    .line 342
    invoke-interface {p1, p0}, Ll/ܿۘܺ;->֫(Ll/ܰۖܺ;)V

    return-void
.end method

.method public final ֫(Ll/᩷ۘܺ;)V
    .locals 4

    .line 100
    iget-object v0, p0, Ll/ܰۖܺ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨۖܺ;

    .line 101
    iget-object v2, v1, Ll/ۨۖܺ;->ۧ:Ll/᩸ۡܺ;

    .line 103
    invoke-virtual {v2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v2

    .line 102
    invoke-virtual {p1, v2}, Ll/᩷ۘܺ;->ܽ(I)Ll/ܳۘܺ;

    move-result-object v2

    .line 103
    invoke-virtual {v2}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v2

    .line 105
    iget-object v3, v1, Ll/ۨۖܺ;->ۧ:Ll/᩸ۡܺ;

    invoke-virtual {v2}, Ll/᩸ۡܺ;->getType()Ll/۟ܺܺ;

    move-result-object v2

    invoke-virtual {v3, v2}, Ll/᩸ۡܺ;->֫(Ll/֫ۖܺ;)Ll/᩸ۡܺ;

    move-result-object v2

    iput-object v2, v1, Ll/ۨۖܺ;->ۧ:Ll/᩸ۡܺ;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 108
    iput-object p1, p0, Ll/ܰۖܺ;->ۗ:Ll/᩶ۡܺ;

    return-void
.end method

.method public final ֫(Ll/᩸ۡܺ;Ll/ܽۘܺ;)V
    .locals 2

    .line 139
    new-instance v0, Ll/ۨۖܺ;

    invoke-virtual {p2}, Ll/ܽۘܺ;->ۧ()I

    move-result v1

    .line 140
    invoke-virtual {p2}, Ll/ܽۘܺ;->ۡ()I

    move-result p2

    invoke-direct {v0, p1, v1, p2}, Ll/ۨۖܺ;-><init>(Ll/᩸ۡܺ;II)V

    .line 139
    iget-object p1, p0, Ll/ܰۖܺ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    .line 143
    iput-object p1, p0, Ll/ܰۖܺ;->ۗ:Ll/᩶ۡܺ;

    return-void
.end method

.method public final ۘ()Ll/᩶ۡܺ;
    .locals 5

    .line 214
    iget-object v0, p0, Ll/ܰۖܺ;->ۗ:Ll/᩶ۡܺ;

    if-eqz v0, :cond_0

    return-object v0

    .line 218
    :cond_0
    iget-object v0, p0, Ll/ܰۖܺ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_1

    .line 220
    sget-object v0, Ll/᩶ۡܺ;->᩶:Ll/᩶ۡܺ;

    return-object v0

    .line 223
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 224
    new-instance v2, Ll/᩶ۡܺ;

    .line 105
    invoke-direct {v2, v1}, Ll/ܿᩴܺ;-><init>(I)V

    .line 224
    iput-object v2, p0, Ll/ܰۖܺ;->ۗ:Ll/᩶ۡܺ;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    .line 227
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۨۖܺ;

    .line 229
    iget-object v4, p0, Ll/ܰۖܺ;->ۗ:Ll/᩶ۡܺ;

    iget-object v3, v3, Ll/ۨۖܺ;->ۧ:Ll/᩸ۡܺ;

    invoke-virtual {v4, v2, v3}, Ll/ܿᩴܺ;->֫(ILl/᩸ۡܺ;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 232
    :cond_2
    iget-object v0, p0, Ll/ܰۖܺ;->ۗ:Ll/᩶ۡܺ;

    invoke-virtual {v0}, Ll/ᩴᩴܺ;->ܺ()V

    .line 233
    iget-object v0, p0, Ll/ܰۖܺ;->ۗ:Ll/᩶ۡܺ;

    return-object v0
.end method

.method public final ۜ()Ll/ۗۡܺ;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۠()Ll/ܺۡܺ;
    .locals 2

    .line 297
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot convert phi insns to rop form"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ(Ll/ۗۘۢ;)V
    .locals 4

    .line 279
    iget-object v0, p0, Ll/ܰۖܺ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨۖܺ;

    .line 280
    iget-object v2, v1, Ll/ۨۖܺ;->ۧ:Ll/᩸ۡܺ;

    .line 281
    invoke-virtual {p1, v2}, Ll/ۗۘۢ;->֫(Ll/᩸ۡܺ;)Ll/᩸ۡܺ;

    move-result-object v3

    iput-object v3, v1, Ll/ۨۖܺ;->ۧ:Ll/᩸ۡܺ;

    if-eq v2, v3, :cond_0

    .line 283
    invoke-virtual {p0}, Ll/ܳۘܺ;->ᩳ()Ll/ܽۘܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܽۘܺ;->ܿ()Ll/᩷ۘܺ;

    move-result-object v3

    iget-object v1, v1, Ll/ۨۖܺ;->ۧ:Ll/᩸ۡܺ;

    invoke-virtual {v3, p0, v2, v1}, Ll/᩷ۘܺ;->֫(Ll/ܳۘܺ;Ll/᩸ۡܺ;Ll/᩸ۡܺ;)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 286
    iput-object p1, p0, Ll/ܰۖܺ;->ۗ:Ll/᩶ۡܺ;

    return-void
.end method

.method public final ۧ(Ll/᩸ۡܺ;)V
    .locals 6

    .line 152
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 153
    iget-object v1, p0, Ll/ܰۖܺ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۨۖܺ;

    .line 154
    iget-object v4, v3, Ll/ۨۖܺ;->ۧ:Ll/᩸ۡܺ;

    invoke-virtual {v4}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v4

    invoke-virtual {p1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v5

    if-ne v4, v5, :cond_0

    .line 155
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 159
    :cond_1
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    const/4 p1, 0x0

    .line 162
    iput-object p1, p0, Ll/ܰۖܺ;->ۗ:Ll/᩶ۡܺ;

    return-void
.end method

.method public final ܶ()I
    .locals 1

    .line 128
    iget v0, p0, Ll/ܰۖܺ;->ۙ:I

    return v0
.end method

.method public final ܺ()Ll/ܺۡܺ;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ܽ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ(I)I
    .locals 1

    .line 173
    iget-object v0, p0, Ll/ܰۖܺ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۨۖܺ;

    iget p1, p1, Ll/ۨۖܺ;->֫:I

    return p1
.end method

.method public final ᩵()Z
    .locals 1

    .line 334
    invoke-static {}, Ll/ۛۖܺ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/ܳۘܺ;->ܳ()Ll/᩸ۡܺ;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
