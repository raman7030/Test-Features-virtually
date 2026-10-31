.class public final Ll/ۗ۟ۚ;
.super Ll/ܰ۟ۚ;
.source "A7FF"


# instance fields
.field public ᩹:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ᩳ֫֨;I)V
    .locals 0

    .line 324
    invoke-direct {p0, p1}, Ll/ܰ۟ۚ;-><init>(Ll/ᩳ֫֨;)V

    .line 325
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Ll/ۗ۟ۚ;->᩹:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final getLength()I
    .locals 1

    .line 343
    iget-object v0, p0, Ll/ۗ۟ۚ;->᩹:Ljava/util/ArrayList;

    .line 344
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x6

    add-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 3

    .line 359
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 360
    iget-object v1, p0, Ll/ۗ۟ۚ;->᩹:Ljava/util/ArrayList;

    invoke-static {v1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    new-instance v2, Ll/᩶۟ۚ;

    invoke-direct {v2, v0}, Ll/᩶۟ۚ;-><init>(Ljava/lang/StringBuilder;)V

    invoke-interface {v1, v2}, Ll/ܿ᩺ᩴ;->forEach(Ljava/util/function/Consumer;)V

    .line 361
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(III)V
    .locals 1

    .line 329
    new-instance v0, Ll/ۙ۟ۚ;

    .line 370
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 371
    iput p1, v0, Ll/ۙ۟ۚ;->ܽ:I

    .line 372
    iput p2, v0, Ll/ۙ۟ۚ;->ۧ:I

    .line 373
    iput p3, v0, Ll/ۙ۟ۚ;->֫:I

    .line 330
    iget-object p1, p0, Ll/ۗ۟ۚ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 3

    .line 335
    iget-object v0, p0, Ll/ۗ۟ۚ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 336
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ۟ۚ;

    .line 377
    iget v2, v1, Ll/ۙ۟ۚ;->ܽ:I

    invoke-virtual {p1, v2}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 378
    iget v2, v1, Ll/ۙ۟ۚ;->ۧ:I

    invoke-virtual {p1, v2}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 379
    iget v1, v1, Ll/ۙ۟ۚ;->֫:I

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ܽ(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 8

    .line 350
    iget-object v0, p0, Ll/ۗ۟ۚ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const-string v1, "{ %d {"

    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 351
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۙ۟ۚ;

    add-int/lit8 v6, v3, 0x1

    .line 352
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v5}, Ll/ۙ۟ۚ;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v3, v7, v4

    aput-object v5, v7, v2

    const-string v3, " [%d]: %s;"

    invoke-static {v3, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move v3, v6

    goto :goto_0

    :cond_0
    const-string v0, " } }"

    .line 354
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
