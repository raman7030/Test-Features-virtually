.class public final Ll/ܳܿ᩵;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ܶ۫ᩴ;


# instance fields
.field public a:I

.field public final b:I

.field public c:I

.field public final d:I

.field public e:[Ljava/lang/Object;

.field public final synthetic f:Ll/᩶ܰᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 280
    const-class v0, Ll/᩶ܰᩴ;

    return-void
.end method

.method public constructor <init>(Ll/᩶ܰᩴ;IIII)V
    .locals 0

    .line 302
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳܿ᩵;->f:Ll/᩶ܰᩴ;

    .line 303
    iput p2, p0, Ll/ܳܿ᩵;->a:I

    .line 304
    iput p3, p0, Ll/ܳܿ᩵;->b:I

    .line 305
    iput p4, p0, Ll/ܳܿ᩵;->c:I

    .line 306
    iput p5, p0, Ll/ܳܿ᩵;->d:I

    .line 308
    iget-object p3, p1, Ll/᩶ܰᩴ;->f:[[Ljava/lang/Object;

    if-nez p3, :cond_0

    iget-object p1, p1, Ll/᩶ܰᩴ;->e:[Ljava/lang/Object;

    goto :goto_0

    :cond_0
    aget-object p1, p3, p2

    :goto_0
    iput-object p1, p0, Ll/ܳܿ᩵;->e:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final characteristics()I
    .locals 1

    const/16 v0, 0x4050

    return v0
.end method

.method public final estimateSize()J
    .locals 6

    .line 313
    iget v0, p0, Ll/ܳܿ᩵;->a:I

    iget v1, p0, Ll/ܳܿ᩵;->d:I

    iget v2, p0, Ll/ܳܿ᩵;->b:I

    if-ne v0, v2, :cond_0

    int-to-long v0, v1

    .line 314
    iget v2, p0, Ll/ܳܿ᩵;->c:I

    int-to-long v2, v2

    sub-long/2addr v0, v2

    return-wide v0

    .line 318
    :cond_0
    iget-object v3, p0, Ll/ܳܿ᩵;->f:Ll/᩶ܰᩴ;

    iget-object v3, v3, Ll/᩵ܰᩴ;->d:[J

    aget-wide v4, v3, v2

    int-to-long v1, v1

    add-long/2addr v4, v1

    aget-wide v0, v3, v0

    sub-long/2addr v4, v0

    iget v0, p0, Ll/ܳܿ᩵;->c:I

    int-to-long v0, v0

    sub-long/2addr v4, v0

    return-wide v4
.end method

.method public final forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 6

    .line 347
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    iget v0, p0, Ll/ܳܿ᩵;->a:I

    iget v1, p0, Ll/ܳܿ᩵;->d:I

    iget v2, p0, Ll/ܳܿ᩵;->b:I

    if-lt v0, v2, :cond_1

    if-ne v0, v2, :cond_0

    iget v3, p0, Ll/ܳܿ᩵;->c:I

    if-ge v3, v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 351
    :cond_1
    :goto_0
    iget v3, p0, Ll/ܳܿ᩵;->c:I

    .line 353
    :goto_1
    iget-object v4, p0, Ll/ܳܿ᩵;->f:Ll/᩶ܰᩴ;

    if-ge v0, v2, :cond_3

    .line 354
    iget-object v4, v4, Ll/᩶ܰᩴ;->f:[[Ljava/lang/Object;

    aget-object v4, v4, v0

    .line 355
    :goto_2
    array-length v5, v4

    if-ge v3, v5, :cond_2

    .line 356
    aget-object v5, v4, v3

    invoke-interface {p1, v5}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    const/4 v3, 0x0

    goto :goto_1

    .line 361
    :cond_3
    iget v0, p0, Ll/ܳܿ᩵;->a:I

    if-ne v0, v2, :cond_4

    iget-object v0, p0, Ll/ܳܿ᩵;->e:[Ljava/lang/Object;

    goto :goto_3

    :cond_4
    iget-object v0, v4, Ll/᩶ܰᩴ;->f:[[Ljava/lang/Object;

    aget-object v0, v0, v2

    :goto_3
    if-ge v3, v1, :cond_5

    .line 364
    aget-object v4, v0, v3

    invoke-interface {p1, v4}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 367
    :cond_5
    iput v2, p0, Ll/ܳܿ᩵;->a:I

    .line 368
    iput v1, p0, Ll/ܳܿ᩵;->c:I

    return-void
.end method

.method public final synthetic getComparator()Ljava/util/Comparator;
    .locals 1

    invoke-static {p0}, Ll/ۖ۫ᩴ;->$default$getComparator(Ll/ܶ۫ᩴ;)Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic getExactSizeIfKnown()J
    .locals 2

    invoke-static {p0}, Ll/ۖ۫ᩴ;->$default$getExactSizeIfKnown(Ll/ܶ۫ᩴ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic hasCharacteristics(I)Z
    .locals 0

    invoke-static {p0, p1}, Ll/ۖ۫ᩴ;->$default$hasCharacteristics(Ll/ܶ۫ᩴ;I)Z

    move-result p1

    return p1
.end method

.method public final tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 5

    .line 328
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    iget v0, p0, Ll/ܳܿ᩵;->a:I

    const/4 v1, 0x0

    iget v2, p0, Ll/ܳܿ᩵;->b:I

    if-lt v0, v2, :cond_1

    if-ne v0, v2, :cond_0

    iget v0, p0, Ll/ܳܿ᩵;->c:I

    iget v3, p0, Ll/ܳܿ᩵;->d:I

    if-ge v0, v3, :cond_0

    goto :goto_0

    :cond_0
    return v1

    .line 332
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ܳܿ᩵;->e:[Ljava/lang/Object;

    iget v3, p0, Ll/ܳܿ᩵;->c:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Ll/ܳܿ᩵;->c:I

    aget-object v0, v0, v3

    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 334
    iget p1, p0, Ll/ܳܿ᩵;->c:I

    iget-object v0, p0, Ll/ܳܿ᩵;->e:[Ljava/lang/Object;

    array-length v0, v0

    const/4 v3, 0x1

    if-ne p1, v0, :cond_2

    .line 335
    iput v1, p0, Ll/ܳܿ᩵;->c:I

    .line 336
    iget p1, p0, Ll/ܳܿ᩵;->a:I

    add-int/2addr p1, v3

    iput p1, p0, Ll/ܳܿ᩵;->a:I

    .line 337
    iget-object v0, p0, Ll/ܳܿ᩵;->f:Ll/᩶ܰᩴ;

    iget-object v0, v0, Ll/᩶ܰᩴ;->f:[[Ljava/lang/Object;

    if-eqz v0, :cond_2

    if-gt p1, v2, :cond_2

    .line 338
    aget-object p1, v0, p1

    iput-object p1, p0, Ll/ܳܿ᩵;->e:[Ljava/lang/Object;

    :cond_2
    return v3
.end method

.method public final trySplit()Ll/ܶ۫ᩴ;
    .locals 9

    .line 374
    iget v2, p0, Ll/ܳܿ᩵;->a:I

    iget v6, p0, Ll/ܳܿ᩵;->b:I

    if-ge v2, v6, :cond_0

    .line 376
    new-instance v7, Ll/ܳܿ᩵;

    add-int/lit8 v3, v6, -0x1

    iget v4, p0, Ll/ܳܿ᩵;->c:I

    iget-object v8, p0, Ll/ܳܿ᩵;->f:Ll/᩶ܰᩴ;

    iget-object v0, v8, Ll/᩶ܰᩴ;->f:[[Ljava/lang/Object;

    aget-object v0, v0, v3

    array-length v5, v0

    move-object v0, v7

    move-object v1, v8

    invoke-direct/range {v0 .. v5}, Ll/ܳܿ᩵;-><init>(Ll/᩶ܰᩴ;IIII)V

    .line 379
    iput v6, p0, Ll/ܳܿ᩵;->a:I

    const/4 v0, 0x0

    .line 380
    iput v0, p0, Ll/ܳܿ᩵;->c:I

    .line 381
    iget-object v0, v8, Ll/᩶ܰᩴ;->f:[[Ljava/lang/Object;

    aget-object v0, v0, v6

    iput-object v0, p0, Ll/ܳܿ᩵;->e:[Ljava/lang/Object;

    return-object v7

    :cond_0
    if-ne v2, v6, :cond_2

    .line 385
    iget v0, p0, Ll/ܳܿ᩵;->c:I

    iget v1, p0, Ll/ܳܿ᩵;->d:I

    sub-int/2addr v1, v0

    div-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_1

    goto :goto_0

    .line 389
    :cond_1
    iget-object v2, p0, Ll/ܳܿ᩵;->e:[Ljava/lang/Object;

    add-int v3, v0, v1

    invoke-static {v2, v0, v3}, Ll/᩹۬ᩴ;->a([Ljava/lang/Object;II)Ll/᩺۫ᩴ;

    move-result-object v0

    .line 390
    iget v2, p0, Ll/ܳܿ᩵;->c:I

    add-int/2addr v2, v1

    iput v2, p0, Ll/ܳܿ᩵;->c:I

    return-object v0

    :cond_2
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
