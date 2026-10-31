.class public final Ll/֡᩺ۚ;
.super Ljava/lang/Object;
.source "B7FA"

# interfaces
.implements Ll/֫ۨۚ;


# instance fields
.field public final ᩸:Ljava/util/ArrayList;

.field public final ᩹:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/Set;Ljava/util/function/Function;Ll/ܽ᩺ۚ;)V
    .locals 1

    .line 256
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 251
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֡᩺ۚ;->᩹:Ljava/util/ArrayList;

    .line 252
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֡᩺ۚ;->᩸:Ljava/util/ArrayList;

    .line 257
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    new-instance v0, Ll/᩵᩺ۚ;

    invoke-direct {v0, p0, p2, p3}, Ll/᩵᩺ۚ;-><init>(Ll/֡᩺ۚ;Ljava/util/function/Function;Ljava/util/function/Function;)V

    invoke-static {p1, v0}, Ll/᩶֨ᩴ;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-void
.end method


# virtual methods
.method public final getLength()I
    .locals 2

    .line 290
    iget-object v0, p0, Ll/֡᩺ۚ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 292
    iget-object v0, p0, Ll/֡᩺ۚ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x6

    goto :goto_0

    .line 294
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    :goto_0
    add-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 3

    .line 274
    iget-object v0, p0, Ll/֡᩺ۚ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 275
    iget-object v0, p0, Ll/֡᩺ۚ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 276
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩵ۗۚ;

    .line 277
    iget-object v2, v1, Ll/ۜۗۚ;->᩸:Ljava/lang/Object;

    check-cast v2, Ll/ܺۤۚ;

    iget v2, v2, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {p1, v2}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 278
    iget-object v2, v1, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p1, v2}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 279
    iget-object v1, v1, Ll/᩵ۗۚ;->᩶:Ljava/lang/Object;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_1

    :cond_0
    check-cast v1, Ll/ܺۤۚ;

    iget v1, v1, Ll/ۜۨۚ;->᩸:I

    :goto_1
    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ܽ(I)V

    goto :goto_0

    .line 282
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 283
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺۤۚ;

    .line 284
    iget v1, v1, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ܽ(I)V

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final synthetic ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
