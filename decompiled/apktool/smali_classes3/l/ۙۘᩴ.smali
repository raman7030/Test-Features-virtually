.class public final Ll/ۙۘᩴ;
.super Ljava/lang/Object;
.source "DAOW"

# interfaces
.implements Ll/֨ۘᩴ;


# instance fields
.field public ۗ:J

.field public ۙ:I

.field public final ᩶:Ll/᩻ۘᩴ;

.field public final ᩸:I

.field public ᩹:Ll/֨ۘᩴ;


# direct methods
.method public constructor <init>(Ll/᩻ۘᩴ;JI)V
    .locals 1

    .line 1310
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x400

    .line 1300
    iput v0, p0, Ll/ۙۘᩴ;->ۙ:I

    const/4 v0, 0x0

    .line 1302
    iput-object v0, p0, Ll/ۙۘᩴ;->᩹:Ll/֨ۘᩴ;

    .line 1311
    iput-object p1, p0, Ll/ۙۘᩴ;->᩶:Ll/᩻ۘᩴ;

    .line 1313
    iput-wide p2, p0, Ll/ۙۘᩴ;->ۗ:J

    or-int/lit16 p1, p4, 0x4140

    .line 1317
    iput p1, p0, Ll/ۙۘᩴ;->᩸:I

    return-void
.end method


# virtual methods
.method public final characteristics()I
    .locals 1

    .line 1355
    iget v0, p0, Ll/ۙۘᩴ;->᩸:I

    return v0
.end method

.method public final estimateSize()J
    .locals 5

    .line 1346
    iget-object v0, p0, Ll/ۙۘᩴ;->᩹:Ll/֨ۘᩴ;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ll/ܶ۫ᩴ;->estimateSize()J

    move-result-wide v0

    return-wide v0

    .line 1347
    :cond_0
    iget-object v0, p0, Ll/ۙۘᩴ;->᩶:Ll/᩻ۘᩴ;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-nez v0, :cond_1

    return-wide v1

    .line 1350
    :cond_1
    iget-wide v3, p0, Ll/ۙۘᩴ;->ۗ:J

    cmp-long v0, v3, v1

    if-ltz v0, :cond_2

    return-wide v3

    :cond_2
    const-wide v0, 0x7fffffffffffffffL

    return-wide v0
.end method

.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 1287
    check-cast p1, Ljava/util/function/LongConsumer;

    invoke-virtual {p0, p1}, Ll/ۙۘᩴ;->forEachRemaining(Ljava/util/function/LongConsumer;)V

    return-void
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۚۘᩴ;->֫(Ll/֨ۘᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final forEachRemaining(Ljava/util/function/LongConsumer;)V
    .locals 2

    .line 1336
    iget-object v0, p0, Ll/ۙۘᩴ;->᩹:Ll/֨ۘᩴ;

    if-eqz v0, :cond_0

    .line 1337
    invoke-interface {v0, p1}, Ll/֡۫ᩴ;->forEachRemaining(Ljava/util/function/LongConsumer;)V

    const/4 v0, 0x0

    .line 1338
    iput-object v0, p0, Ll/ۙۘᩴ;->᩹:Ll/֨ۘᩴ;

    .line 1340
    :cond_0
    iget-object v0, p0, Ll/ۙۘᩴ;->᩶:Ll/᩻ۘᩴ;

    invoke-interface {v0, p1}, Ll/ۜ۫ᩴ;->forEachRemaining(Ljava/util/function/LongConsumer;)V

    const-wide/16 v0, 0x0

    .line 1341
    iput-wide v0, p0, Ll/ۙۘᩴ;->ۗ:J

    return-void
.end method

.method public final getComparator()Ljava/util/Comparator;
    .locals 1

    .line 158
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public synthetic getExactSizeIfKnown()J
    .locals 2

    .line 0
    invoke-static {p0}, Ll/ۖ۫ᩴ;->$default$getExactSizeIfKnown(Ll/ܶ۫ᩴ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic hasCharacteristics(I)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۖ۫ᩴ;->$default$hasCharacteristics(Ll/ܶ۫ᩴ;I)Z

    move-result p1

    return p1
.end method

.method public final bridge synthetic tryAdvance(Ljava/lang/Object;)Z
    .locals 0

    .line 1287
    check-cast p1, Ljava/util/function/LongConsumer;

    invoke-virtual {p0, p1}, Ll/ۙۘᩴ;->tryAdvance(Ljava/util/function/LongConsumer;)Z

    move-result p1

    return p1
.end method

.method public final synthetic tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۚۘᩴ;->ۧ(Ll/֨ۘᩴ;Ljava/util/function/Consumer;)Z

    move-result p1

    return p1
.end method

.method public final tryAdvance(Ljava/util/function/LongConsumer;)Z
    .locals 5

    .line 1323
    iget-object v0, p0, Ll/ۙۘᩴ;->᩹:Ll/֨ۘᩴ;

    if-eqz v0, :cond_1

    .line 1324
    invoke-interface {v0, p1}, Ll/֡۫ᩴ;->tryAdvance(Ljava/util/function/LongConsumer;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    .line 1325
    iput-object v0, p0, Ll/ۙۘᩴ;->᩹:Ll/֨ۘᩴ;

    :cond_0
    return p1

    .line 1328
    :cond_1
    iget-object v0, p0, Ll/ۙۘᩴ;->᩶:Ll/᩻ۘᩴ;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_2

    const/4 p1, 0x0

    return p1

    .line 1329
    :cond_2
    iget-wide v1, p0, Ll/ۙۘᩴ;->ۗ:J

    const-wide/16 v3, 0x1

    sub-long/2addr v1, v3

    iput-wide v1, p0, Ll/ۙۘᩴ;->ۗ:J

    .line 1330
    invoke-interface {v0}, Ll/ۜ۫ᩴ;->nextLong()J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Ljava/util/function/LongConsumer;->accept(J)V

    const/4 p1, 0x1

    return p1
.end method

.method public final bridge synthetic trySplit()Ll/֡۫ᩴ;
    .locals 1

    .line 1287
    invoke-virtual {p0}, Ll/ۙۘᩴ;->trySplit()Ll/֨ۘᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final trySplit()Ll/֨ۘᩴ;
    .locals 10

    .line 1364
    iget-object v0, p0, Ll/ۙۘᩴ;->᩶:Ll/᩻ۘᩴ;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 1365
    :cond_0
    iget-wide v1, p0, Ll/ۙۘᩴ;->ۗ:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_1

    iget v3, p0, Ll/ۙۘᩴ;->ۙ:I

    int-to-long v3, v3

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v2, v1

    goto :goto_0

    :cond_1
    iget v2, p0, Ll/ۙۘᩴ;->ۙ:I

    .line 1367
    :goto_0
    new-array v1, v2, [J

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_1
    const-wide/16 v5, 0x1

    if-ge v4, v2, :cond_2

    .line 1369
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    add-int/lit8 v7, v4, 0x1

    .line 1370
    invoke-interface {v0}, Ll/ۜ۫ᩴ;->nextLong()J

    move-result-wide v8

    aput-wide v8, v1, v4

    .line 1371
    iget-wide v8, p0, Ll/ۙۘᩴ;->ۗ:J

    sub-long/2addr v8, v5

    iput-wide v8, p0, Ll/ۙۘᩴ;->ۗ:J

    move v4, v7

    goto :goto_1

    .line 1375
    :cond_2
    iget v7, p0, Ll/ۙۘᩴ;->ۙ:I

    if-ge v2, v7, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 1376
    iget v2, p0, Ll/ۙۘᩴ;->ۙ:I

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v1

    .line 1377
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    iget v2, p0, Ll/ۙۘᩴ;->ۙ:I

    if-ge v4, v2, :cond_3

    add-int/lit8 v2, v4, 0x1

    .line 1378
    invoke-interface {v0}, Ll/ۜ۫ᩴ;->nextLong()J

    move-result-wide v7

    aput-wide v7, v1, v4

    .line 1379
    iget-wide v7, p0, Ll/ۙۘᩴ;->ۗ:J

    sub-long/2addr v7, v5

    iput-wide v7, p0, Ll/ۙۘᩴ;->ۗ:J

    move v4, v2

    goto :goto_2

    .line 1382
    :cond_3
    iget v2, p0, Ll/ۙۘᩴ;->ۙ:I

    add-int/lit16 v2, v2, 0x400

    const/high16 v5, 0x2000000

    invoke-static {v5, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    iput v2, p0, Ll/ۙۘᩴ;->ۙ:I

    .line 357
    array-length v2, v1

    invoke-static {v2, v3, v4}, Ll/ۢ᩹ۡ;->ۧ(III)V

    .line 360
    new-instance v2, Ll/ܶۘᩴ;

    iget v5, p0, Ll/ۙۘᩴ;->᩸:I

    invoke-direct {v2, v1, v3, v4, v5}, Ll/ܶۘᩴ;-><init>([JIII)V

    .line 1385
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_4

    .line 1386
    iput-object v2, p0, Ll/ۙۘᩴ;->᩹:Ll/֨ۘᩴ;

    .line 1387
    invoke-virtual {v2}, Ll/ܶۘᩴ;->trySplit()Ll/֨ۘᩴ;

    move-result-object v0

    return-object v0

    :cond_4
    return-object v2
.end method

.method public final bridge synthetic trySplit()Ll/֨۫ᩴ;
    .locals 1

    .line 1287
    invoke-virtual {p0}, Ll/ۙۘᩴ;->trySplit()Ll/֨ۘᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic trySplit()Ll/ܶ۫ᩴ;
    .locals 1

    .line 1287
    invoke-virtual {p0}, Ll/ۙۘᩴ;->trySplit()Ll/֨ۘᩴ;

    move-result-object v0

    return-object v0
.end method
