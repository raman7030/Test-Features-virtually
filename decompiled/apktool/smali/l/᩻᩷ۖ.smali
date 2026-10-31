.class public final Ll/᩻᩷ۖ;
.super Ljava/lang/Object;
.source "U9Q2"

# interfaces
.implements Ll/ۜ۠ۖ;


# instance fields
.field public final ֫:Ll/ܳ᩷ۖ;


# direct methods
.method public constructor <init>(Ll/ܳ᩷ۖ;)V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "output"

    .line 32
    invoke-static {p1, v0}, Ll/ܰᩴۖ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    .line 33
    iput-object p0, p1, Ll/ܳ᩷ۖ;->֫:Ll/᩻᩷ۖ;

    return-void
.end method

.method public static ֫(Ll/ܳ᩷ۖ;)Ll/᩻᩷ۖ;
    .locals 1

    .line 25
    iget-object v0, p0, Ll/ܳ᩷ۖ;->֫:Ll/᩻᩷ۖ;

    if-eqz v0, :cond_0

    return-object v0

    .line 28
    :cond_0
    new-instance v0, Ll/᩻᩷ۖ;

    invoke-direct {v0, p0}, Ll/᩻᩷ۖ;-><init>(Ll/ܳ᩷ۖ;)V

    return-object v0
.end method


# virtual methods
.method public final ֫(FI)V
    .locals 1

    .line 62
    iget-object v0, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    invoke-virtual {v0, p2, p1}, Ll/ܳ᩷ۖ;->֫(II)V

    return-void
.end method

.method public final ֫(I)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 155
    iget-object v0, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    const/4 v1, 0x4

    invoke-virtual {v0, p1, v1}, Ll/ܳ᩷ۖ;->ܽ(II)V

    return-void
.end method

.method public final ֫(ID)V
    .locals 1

    .line 67
    iget-object v0, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    invoke-static {p2, p3}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p2

    invoke-virtual {v0, p1, p2, p3}, Ll/ܳ᩷ۖ;->֫(IJ)V

    return-void
.end method

.method public final ֫(II)V
    .locals 1

    .line 72
    iget-object v0, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    .line 275
    invoke-virtual {v0, p1, p2}, Ll/ܳ᩷ۖ;->ۧ(II)V

    return-void
.end method

.method public final ֫(IJ)V
    .locals 1

    .line 87
    iget-object v0, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ܳ᩷ۖ;->֫(IJ)V

    return-void
.end method

.method public final ֫(ILjava/lang/Object;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 138
    iget-object v0, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    check-cast p2, Ll/ۡ֡ۖ;

    invoke-virtual {v0, p1, p2}, Ll/ܳ᩷ۖ;->֫(ILl/ۡ֡ۖ;)V

    return-void
.end method

.method public final ֫(ILjava/lang/Object;Ll/ۢۚۖ;)V
    .locals 2

    .line 143
    check-cast p2, Ll/ۡ֡ۖ;

    const/4 v0, 0x3

    .line 1007
    iget-object v1, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    invoke-virtual {v1, p1, v0}, Ll/ܳ᩷ۖ;->ܽ(II)V

    .line 1029
    iget-object v0, v1, Ll/ܳ᩷ۖ;->֫:Ll/᩻᩷ۖ;

    invoke-interface {p3, p2, v0}, Ll/ۢۚۖ;->֫(Ljava/lang/Object;Ll/ۜ۠ۖ;)V

    const/4 p2, 0x4

    .line 1009
    invoke-virtual {v1, p1, p2}, Ll/ܳ᩷ۖ;->ܽ(II)V

    return-void
.end method

.method public final ֫(ILjava/lang/String;)V
    .locals 1

    .line 102
    iget-object v0, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    invoke-virtual {v0, p1, p2}, Ll/ܳ᩷ۖ;->֫(ILjava/lang/String;)V

    return-void
.end method

.method public final ֫(ILjava/util/List;)V
    .locals 3

    const/4 v0, 0x0

    .line 406
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 407
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛۜۖ;

    iget-object v2, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    invoke-virtual {v2, p1, v1}, Ll/ܳ᩷ۖ;->֫(ILl/ۛۜۖ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(ILjava/util/Map;)V
    .locals 2

    .line 563
    iget-object v0, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 567
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    const/4 v1, 0x2

    .line 568
    invoke-virtual {v0, p1, v1}, Ll/ܳ᩷ۖ;->ܽ(II)V

    .line 570
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    const/4 p1, 0x0

    .line 91
    throw p1
.end method

.method public final ֫(ILl/ۛۜۖ;)V
    .locals 1

    .line 107
    iget-object v0, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    invoke-virtual {v0, p1, p2}, Ll/ܳ᩷ۖ;->֫(ILl/ۛۜۖ;)V

    return-void
.end method

.method public final ֫(IZ)V
    .locals 1

    .line 97
    iget-object v0, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    invoke-virtual {v0, p1, p2}, Ll/ܳ᩷ۖ;->֫(IZ)V

    return-void
.end method

.method public final ֫(IZLjava/util/List;)V
    .locals 3

    const/4 v0, 0x0

    .line 361
    iget-object v1, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    if-eqz p2, :cond_1

    const/4 p2, 0x2

    .line 362
    invoke-virtual {v1, p1, p2}, Ll/ܳ᩷ۖ;->ܽ(II)V

    const/4 p1, 0x0

    const/4 p2, 0x0

    .line 366
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    if-ge p1, v2, :cond_0

    .line 367
    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v2, Ll/ܳ᩷ۖ;->ۧ:I

    add-int/lit8 p2, p2, 0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 369
    :cond_0
    invoke-virtual {v1, p2}, Ll/ܳ᩷ۖ;->ܽ(I)V

    .line 372
    :goto_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    .line 373
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    int-to-byte p1, p1

    .line 426
    invoke-virtual {v1, p1}, Ll/ܳ᩷ۖ;->֫(B)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 376
    :cond_1
    :goto_2
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p2

    if-ge v0, p2, :cond_2

    .line 377
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {v1, p1, p2}, Ll/ܳ᩷ۖ;->֫(IZ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final ۖ(IZLjava/util/List;)V
    .locals 3

    const/4 v0, 0x0

    .line 414
    iget-object v1, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    if-eqz p2, :cond_1

    const/4 p2, 0x2

    .line 415
    invoke-virtual {v1, p1, p2}, Ll/ܳ᩷ۖ;->ܽ(II)V

    const/4 p1, 0x0

    const/4 p2, 0x0

    .line 419
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    if-ge p1, v2, :cond_0

    .line 420
    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v2

    add-int/2addr p2, v2

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 422
    :cond_0
    invoke-virtual {v1, p2}, Ll/ܳ᩷ۖ;->ܽ(I)V

    .line 425
    :goto_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    .line 426
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v1, p1}, Ll/ܳ᩷ۖ;->ܽ(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 429
    :cond_1
    :goto_2
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p2

    if-ge v0, p2, :cond_2

    .line 430
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {v1, p1, p2}, Ll/ܳ᩷ۖ;->ᩳ(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final ۘ(IZLjava/util/List;)V
    .locals 4

    const/4 v0, 0x0

    .line 241
    iget-object v1, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    if-eqz p2, :cond_1

    const/4 p2, 0x2

    .line 242
    invoke-virtual {v1, p1, p2}, Ll/ܳ᩷ۖ;->ܽ(II)V

    const/4 p1, 0x0

    const/4 p2, 0x0

    .line 246
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    if-ge p1, v2, :cond_0

    .line 247
    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll/ܳ᩷ۖ;->ܽ(J)I

    move-result v2

    add-int/2addr p2, v2

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 249
    :cond_0
    invoke-virtual {v1, p2}, Ll/ܳ᩷ۖ;->ܽ(I)V

    .line 252
    :goto_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    .line 253
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {v1, p1, p2}, Ll/ܳ᩷ۖ;->ۧ(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 256
    :cond_1
    :goto_2
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p2

    if-ge v0, p2, :cond_2

    .line 257
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v1, p1, v2, v3}, Ll/ܳ᩷ۖ;->ۧ(IJ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final ۜ(IZLjava/util/List;)V
    .locals 4

    const/4 v0, 0x0

    .line 217
    iget-object v1, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    if-eqz p2, :cond_1

    const/4 p2, 0x2

    .line 218
    invoke-virtual {v1, p1, p2}, Ll/ܳ᩷ۖ;->ܽ(II)V

    const/4 p1, 0x0

    const/4 p2, 0x0

    .line 222
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    if-ge p1, v2, :cond_0

    .line 223
    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 764
    invoke-static {v2, v3}, Ll/ܳ᩷ۖ;->ܽ(J)I

    move-result v2

    add-int/2addr p2, v2

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 225
    :cond_0
    invoke-virtual {v1, p2}, Ll/ܳ᩷ۖ;->ܽ(I)V

    .line 228
    :goto_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    .line 229
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    .line 393
    invoke-virtual {v1, p1, p2}, Ll/ܳ᩷ۖ;->ۧ(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 232
    :cond_1
    :goto_2
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p2

    if-ge v0, p2, :cond_2

    .line 233
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 235
    invoke-virtual {v1, p1, v2, v3}, Ll/ܳ᩷ۖ;->ۧ(IJ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final ۡ(IZLjava/util/List;)V
    .locals 4

    const/4 v0, 0x0

    .line 486
    iget-object v1, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    if-eqz p2, :cond_1

    const/4 p2, 0x2

    .line 487
    invoke-virtual {v1, p1, p2}, Ll/ܳ᩷ۖ;->ܽ(II)V

    const/4 p1, 0x0

    const/4 p2, 0x0

    .line 491
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    if-ge p1, v2, :cond_0

    .line 492
    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    shl-int/lit8 v3, v2, 0x1

    shr-int/lit8 v2, v2, 0x1f

    xor-int/2addr v2, v3

    .line 746
    invoke-static {v2}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v2

    add-int/2addr p2, v2

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 494
    :cond_0
    invoke-virtual {v1, p2}, Ll/ܳ᩷ۖ;->ܽ(I)V

    .line 497
    :goto_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    .line 498
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    shl-int/lit8 p2, p1, 0x1

    shr-int/lit8 p1, p1, 0x1f

    xor-int/2addr p1, p2

    .line 379
    invoke-virtual {v1, p1}, Ll/ܳ᩷ۖ;->ܽ(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 501
    :cond_1
    :goto_2
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p2

    if-ge v0, p2, :cond_2

    .line 502
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    shl-int/lit8 v2, p2, 0x1

    shr-int/lit8 p2, p2, 0x1f

    xor-int/2addr p2, v2

    .line 221
    invoke-virtual {v1, p1, p2}, Ll/ܳ᩷ۖ;->ᩳ(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final ۢ(IZLjava/util/List;)V
    .locals 4

    const/4 v0, 0x0

    .line 462
    iget-object v1, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    if-eqz p2, :cond_1

    const/4 p2, 0x2

    .line 463
    invoke-virtual {v1, p1, p2}, Ll/ܳ᩷ۖ;->ܽ(II)V

    const/4 p1, 0x0

    const/4 p2, 0x0

    .line 467
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    if-ge p1, v2, :cond_0

    .line 468
    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v2, Ll/ܳ᩷ۖ;->ۧ:I

    add-int/lit8 p2, p2, 0x8

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 470
    :cond_0
    invoke-virtual {v1, p2}, Ll/ܳ᩷ۖ;->ܽ(I)V

    .line 473
    :goto_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    .line 474
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    .line 411
    invoke-virtual {v1, p1, p2}, Ll/ܳ᩷ۖ;->֫(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 477
    :cond_1
    :goto_2
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p2

    if-ge v0, p2, :cond_2

    .line 478
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 253
    invoke-virtual {v1, p1, v2, v3}, Ll/ܳ᩷ۖ;->֫(IJ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final ۧ(I)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 149
    iget-object v0, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    const/4 v1, 0x3

    invoke-virtual {v0, p1, v1}, Ll/ܳ᩷ۖ;->ܽ(II)V

    return-void
.end method

.method public final ۧ(II)V
    .locals 1

    .line 92
    iget-object v0, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    invoke-virtual {v0, p1, p2}, Ll/ܳ᩷ۖ;->֫(II)V

    return-void
.end method

.method public final ۧ(IJ)V
    .locals 1

    .line 52
    iget-object v0, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    .line 235
    invoke-virtual {v0, p1, p2, p3}, Ll/ܳ᩷ۖ;->ۧ(IJ)V

    return-void
.end method

.method public final ۧ(ILjava/lang/Object;)V
    .locals 1

    .line 127
    iget-object v0, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    check-cast p2, Ll/ۡ֡ۖ;

    invoke-virtual {v0, p1, p2}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    return-void
.end method

.method public final ۧ(ILjava/lang/Object;Ll/ۢۚۖ;)V
    .locals 1

    .line 132
    iget-object v0, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    check-cast p2, Ll/ۡ֡ۖ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ܳ᩷ۖ;->֫(ILl/ۡ֡ۖ;Ll/ۢۚۖ;)V

    return-void
.end method

.method public final ۧ(ILjava/util/List;)V
    .locals 5

    .line 384
    instance-of v0, p2, Ll/ۘ᩵ۖ;

    iget-object v1, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 385
    move-object v0, p2

    check-cast v0, Ll/ۘ᩵ۖ;

    .line 386
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 387
    invoke-interface {v0, v2}, Ll/ۘ᩵ۖ;->᩵(I)Ljava/lang/Object;

    move-result-object v3

    .line 397
    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_0

    .line 398
    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, p1, v3}, Ll/ܳ᩷ۖ;->֫(ILjava/lang/String;)V

    goto :goto_1

    .line 400
    :cond_0
    check-cast v3, Ll/ۛۜۖ;

    invoke-virtual {v1, p1, v3}, Ll/ܳ᩷ۖ;->֫(ILl/ۛۜۖ;)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 390
    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_2

    .line 391
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, p1, v0}, Ll/ܳ᩷ۖ;->֫(ILjava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final ۧ(IZLjava/util/List;)V
    .locals 4

    const/4 v0, 0x0

    .line 313
    iget-object v1, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    if-eqz p2, :cond_1

    const/4 p2, 0x2

    .line 314
    invoke-virtual {v1, p1, p2}, Ll/ܳ᩷ۖ;->ܽ(II)V

    const/4 p1, 0x0

    const/4 p2, 0x0

    .line 318
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    if-ge p1, v2, :cond_0

    .line 319
    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v2, Ll/ܳ᩷ۖ;->ۧ:I

    add-int/lit8 p2, p2, 0x8

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 321
    :cond_0
    invoke-virtual {v1, p2}, Ll/ܳ᩷ۖ;->ܽ(I)V

    .line 324
    :goto_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    .line 325
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    .line 421
    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p1

    invoke-virtual {v1, p1, p2}, Ll/ܳ᩷ۖ;->֫(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 328
    :cond_1
    :goto_2
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p2

    if-ge v0, p2, :cond_2

    .line 329
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v2

    invoke-virtual {v1, p1, v2, v3}, Ll/ܳ᩷ۖ;->֫(IJ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final ܳ(II)V
    .locals 1

    .line 112
    iget-object v0, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    invoke-virtual {v0, p1, p2}, Ll/ܳ᩷ۖ;->ᩳ(II)V

    return-void
.end method

.method public final ܳ(IZLjava/util/List;)V
    .locals 3

    const/4 v0, 0x0

    .line 289
    iget-object v1, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    if-eqz p2, :cond_1

    const/4 p2, 0x2

    .line 290
    invoke-virtual {v1, p1, p2}, Ll/ܳ᩷ۖ;->ܽ(II)V

    const/4 p1, 0x0

    const/4 p2, 0x0

    .line 294
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    if-ge p1, v2, :cond_0

    .line 295
    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v2, Ll/ܳ᩷ۖ;->ۧ:I

    add-int/lit8 p2, p2, 0x4

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 297
    :cond_0
    invoke-virtual {v1, p2}, Ll/ܳ᩷ۖ;->ܽ(I)V

    .line 300
    :goto_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    .line 301
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    .line 416
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    invoke-virtual {v1, p1}, Ll/ܳ᩷ۖ;->֫(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 304
    :cond_1
    :goto_2
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p2

    if-ge v0, p2, :cond_2

    .line 305
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    invoke-virtual {v1, p1, p2}, Ll/ܳ᩷ۖ;->֫(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final ܺ(IZLjava/util/List;)V
    .locals 8

    const/16 v0, 0x3f

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 510
    iget-object v3, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    if-eqz p2, :cond_1

    const/4 p2, 0x2

    .line 511
    invoke-virtual {v3, p1, p2}, Ll/ܳ᩷ۖ;->ܽ(II)V

    const/4 p1, 0x0

    const/4 p2, 0x0

    .line 515
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v4

    if-ge p1, v4, :cond_0

    .line 516
    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    shl-long v6, v4, v1

    shr-long/2addr v4, v0

    xor-long/2addr v4, v6

    .line 779
    invoke-static {v4, v5}, Ll/ܳ᩷ۖ;->ܽ(J)I

    move-result v4

    add-int/2addr p2, v4

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 518
    :cond_0
    invoke-virtual {v3, p2}, Ll/ܳ᩷ۖ;->ܽ(I)V

    .line 521
    :goto_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_2

    .line 522
    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    shl-long v4, p1, v1

    shr-long/2addr p1, v0

    xor-long/2addr p1, v4

    .line 402
    invoke-virtual {v3, p1, p2}, Ll/ܳ᩷ۖ;->ۧ(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 525
    :cond_1
    :goto_2
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p2

    if-ge v2, p2, :cond_2

    .line 526
    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    shl-long v6, v4, v1

    shr-long/2addr v4, v0

    xor-long/2addr v4, v6

    .line 244
    invoke-virtual {v3, p1, v4, v5}, Ll/ܳ᩷ۖ;->ۧ(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final ܽ(II)V
    .locals 1

    .line 82
    iget-object v0, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    invoke-virtual {v0, p1, p2}, Ll/ܳ᩷ۖ;->ۧ(II)V

    return-void
.end method

.method public final ܽ(IJ)V
    .locals 1

    .line 57
    iget-object v0, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    .line 253
    invoke-virtual {v0, p1, p2, p3}, Ll/ܳ᩷ۖ;->֫(IJ)V

    return-void
.end method

.method public final ܽ(ILjava/lang/Object;)V
    .locals 2

    .line 160
    instance-of v0, p2, Ll/ۛۜۖ;

    iget-object v1, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    if-eqz v0, :cond_0

    .line 161
    check-cast p2, Ll/ۛۜۖ;

    invoke-virtual {v1, p1, p2}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۛۜۖ;)V

    return-void

    .line 163
    :cond_0
    check-cast p2, Ll/ۡ֡ۖ;

    invoke-virtual {v1, p1, p2}, Ll/ܳ᩷ۖ;->ܽ(ILl/ۡ֡ۖ;)V

    return-void
.end method

.method public final ܽ(IZLjava/util/List;)V
    .locals 4

    const/4 v0, 0x0

    .line 337
    iget-object v1, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    if-eqz p2, :cond_1

    const/4 p2, 0x2

    .line 338
    invoke-virtual {v1, p1, p2}, Ll/ܳ᩷ۖ;->ܽ(II)V

    const/4 p1, 0x0

    const/4 p2, 0x0

    .line 342
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    if-ge p1, v2, :cond_0

    .line 343
    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v2, v2

    .line 696
    invoke-static {v2, v3}, Ll/ܳ᩷ۖ;->ܽ(J)I

    move-result v2

    add-int/2addr p2, v2

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 345
    :cond_0
    invoke-virtual {v1, p2}, Ll/ܳ᩷ۖ;->ܽ(I)V

    .line 348
    :goto_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    .line 349
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 434
    invoke-virtual {v1, p1}, Ll/ܳ᩷ۖ;->ۧ(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 352
    :cond_1
    :goto_2
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p2

    if-ge v0, p2, :cond_2

    .line 353
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    .line 275
    invoke-virtual {v1, p1, p2}, Ll/ܳ᩷ۖ;->ۧ(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final ܿ(II)V
    .locals 1

    shl-int/lit8 v0, p2, 0x1

    shr-int/lit8 p2, p2, 0x1f

    xor-int/2addr p2, v0

    .line 221
    iget-object v0, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    invoke-virtual {v0, p1, p2}, Ll/ܳ᩷ۖ;->ᩳ(II)V

    return-void
.end method

.method public final ܿ(IJ)V
    .locals 1

    .line 77
    iget-object v0, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ܳ᩷ۖ;->ۧ(IJ)V

    return-void
.end method

.method public final ܿ(IZLjava/util/List;)V
    .locals 4

    const/4 v0, 0x0

    .line 265
    iget-object v1, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    if-eqz p2, :cond_1

    const/4 p2, 0x2

    .line 266
    invoke-virtual {v1, p1, p2}, Ll/ܳ᩷ۖ;->ܽ(II)V

    const/4 p1, 0x0

    const/4 p2, 0x0

    .line 270
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    if-ge p1, v2, :cond_0

    .line 271
    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v2, Ll/ܳ᩷ۖ;->ۧ:I

    add-int/lit8 p2, p2, 0x8

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 273
    :cond_0
    invoke-virtual {v1, p2}, Ll/ܳ᩷ۖ;->ܽ(I)V

    .line 276
    :goto_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    .line 277
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {v1, p1, p2}, Ll/ܳ᩷ۖ;->֫(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 280
    :cond_1
    :goto_2
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p2

    if-ge v0, p2, :cond_2

    .line 281
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v1, p1, v2, v3}, Ll/ܳ᩷ۖ;->֫(IJ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final ᩳ(II)V
    .locals 1

    .line 47
    iget-object v0, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    .line 230
    invoke-virtual {v0, p1, p2}, Ll/ܳ᩷ۖ;->֫(II)V

    return-void
.end method

.method public final ᩳ(IJ)V
    .locals 3

    const/4 v0, 0x1

    shl-long v0, p2, v0

    const/16 v2, 0x3f

    shr-long/2addr p2, v2

    xor-long/2addr p2, v0

    .line 244
    iget-object v0, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ܳ᩷ۖ;->ۧ(IJ)V

    return-void
.end method

.method public final ᩳ(IZLjava/util/List;)V
    .locals 3

    const/4 v0, 0x0

    .line 194
    iget-object v1, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    if-eqz p2, :cond_1

    const/4 p2, 0x2

    .line 195
    invoke-virtual {v1, p1, p2}, Ll/ܳ᩷ۖ;->ܽ(II)V

    const/4 p1, 0x0

    const/4 p2, 0x0

    .line 199
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    if-ge p1, v2, :cond_0

    .line 200
    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v2, Ll/ܳ᩷ۖ;->ۧ:I

    add-int/lit8 p2, p2, 0x4

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 202
    :cond_0
    invoke-virtual {v1, p2}, Ll/ܳ᩷ۖ;->ܽ(I)V

    .line 205
    :goto_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    .line 206
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v1, p1}, Ll/ܳ᩷ۖ;->֫(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 209
    :cond_1
    :goto_2
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p2

    if-ge v0, p2, :cond_2

    .line 210
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {v1, p1, p2}, Ll/ܳ᩷ۖ;->֫(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final ᩷(IZLjava/util/List;)V
    .locals 3

    const/4 v0, 0x0

    .line 438
    iget-object v1, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    if-eqz p2, :cond_1

    const/4 p2, 0x2

    .line 439
    invoke-virtual {v1, p1, p2}, Ll/ܳ᩷ۖ;->ܽ(II)V

    const/4 p1, 0x0

    const/4 p2, 0x0

    .line 443
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    if-ge p1, v2, :cond_0

    .line 444
    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v2, Ll/ܳ᩷ۖ;->ۧ:I

    add-int/lit8 p2, p2, 0x4

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 446
    :cond_0
    invoke-virtual {v1, p2}, Ll/ܳ᩷ۖ;->ܽ(I)V

    .line 449
    :goto_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    .line 450
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 388
    invoke-virtual {v1, p1}, Ll/ܳ᩷ۖ;->֫(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 453
    :cond_1
    :goto_2
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p2

    if-ge v0, p2, :cond_2

    .line 454
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    .line 230
    invoke-virtual {v1, p1, p2}, Ll/ܳ᩷ۖ;->֫(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final ᩻(IZLjava/util/List;)V
    .locals 4

    const/4 v0, 0x0

    .line 170
    iget-object v1, p0, Ll/᩻᩷ۖ;->֫:Ll/ܳ᩷ۖ;

    if-eqz p2, :cond_1

    const/4 p2, 0x2

    .line 171
    invoke-virtual {v1, p1, p2}, Ll/ܳ᩷ۖ;->ܽ(II)V

    const/4 p1, 0x0

    const/4 p2, 0x0

    .line 175
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    if-ge p1, v2, :cond_0

    .line 176
    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v2, v2

    .line 696
    invoke-static {v2, v3}, Ll/ܳ᩷ۖ;->ܽ(J)I

    move-result v2

    add-int/2addr p2, v2

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 178
    :cond_0
    invoke-virtual {v1, p2}, Ll/ܳ᩷ۖ;->ܽ(I)V

    .line 181
    :goto_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    .line 182
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v1, p1}, Ll/ܳ᩷ۖ;->ۧ(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 185
    :cond_1
    :goto_2
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p2

    if-ge v0, p2, :cond_2

    .line 186
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {v1, p1, p2}, Ll/ܳ᩷ۖ;->ۧ(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method
