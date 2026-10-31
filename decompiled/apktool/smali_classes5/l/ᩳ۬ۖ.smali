.class public final Ll/ᩳ۬ۖ;
.super Ljava/lang/Object;
.source "A4XC"

# interfaces
.implements Ll/֡ۙۖ;


# instance fields
.field public ֫:Ll/֫ۙۖ;

.field public ۧ:[Ll/ۜ۬ۖ;

.field public final synthetic ܽ:Ljava/util/HashMap;

.field public final synthetic ܿ:Ljava/util/ArrayList;

.field public final synthetic ᩳ:I


# direct methods
.method public constructor <init>(ILjava/util/ArrayList;Ljava/util/HashMap;)V
    .locals 0

    .line 273
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/ᩳ۬ۖ;->ᩳ:I

    iput-object p2, p0, Ll/ᩳ۬ۖ;->ܿ:Ljava/util/ArrayList;

    iput-object p3, p0, Ll/ᩳ۬ۖ;->ܽ:Ljava/util/HashMap;

    .line 308
    new-array p1, p1, [Ll/ۜ۬ۖ;

    .line 311
    iput-object p1, p0, Ll/ᩳ۬ۖ;->ۧ:[Ll/ۜ۬ۖ;

    return-void
.end method

.method private ֫(Ll/۠᩶ۖ;)V
    .locals 3

    .line 375
    sget-object v0, Ll/ܳ۬ۖ;->֫:[I

    iget-object v1, p1, Ll/۠᩶ۖ;->᩸:Ll/֡᩹ۖ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    goto :goto_1

    .line 394
    :cond_0
    invoke-virtual {p1}, Ll/۠᩶ۖ;->ܿ()[Ll/۠᩶ۖ;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_4

    aget-object v2, p1, v1

    .line 395
    invoke-direct {p0, v2}, Ll/ᩳ۬ۖ;->֫(Ll/۠᩶ۖ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 390
    :cond_1
    invoke-virtual {p1}, Ll/۠᩶ۖ;->ܽ()Ll/۠᩶ۖ;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ᩳ۬ۖ;->֫(Ll/۠᩶ۖ;)V

    .line 391
    invoke-virtual {p1}, Ll/۠᩶ۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ᩳ۬ۖ;->֫(Ll/۠᩶ۖ;)V

    return-void

    .line 387
    :cond_2
    invoke-virtual {p1}, Ll/۠᩶ۖ;->֫()Ll/۠᩶ۖ;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ᩳ۬ۖ;->֫(Ll/۠᩶ۖ;)V

    return-void

    .line 377
    :cond_3
    iget-object v0, p1, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v2, Ll/֨᩶ۖ;->᩸֫:Ll/֨᩶ۖ;

    if-ne v0, v2, :cond_4

    .line 378
    check-cast p1, Ll/ᩳ᩶ۖ;

    .line 379
    iget p1, p1, Ll/ᩳ᩶ۖ;->ۗ:I

    if-ltz p1, :cond_4

    .line 380
    iget-object v0, p0, Ll/ᩳ۬ۖ;->ۧ:[Ll/ۜ۬ۖ;

    aget-object p1, v0, p1

    .line 381
    iget-object v0, p1, Ll/ۜ۬ۖ;->֫:Ll/᩻۬ۖ;

    iget-object v0, v0, Ll/᩻۬ۖ;->ܿ:Ljava/util/ArrayList;

    iget-object v2, p0, Ll/ᩳ۬ۖ;->֫:Ll/֫ۙۖ;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 382
    iput-boolean v1, p1, Ll/ۜ۬ۖ;->ܳ:Z

    :cond_4
    :goto_1
    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 1

    .line 308
    iget v0, p0, Ll/ᩳ۬ۖ;->ᩳ:I

    new-array v0, v0, [Ll/ۜ۬ۖ;

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;Ll/֫ۙۖ;Ll/֫ۙۖ;)Ljava/lang/Object;
    .locals 3

    .line 273
    check-cast p1, [Ll/ۜ۬ۖ;

    check-cast p2, [Ll/ۜ۬ۖ;

    const/4 p3, 0x0

    .line 278
    iget p4, p0, Ll/ᩳ۬ۖ;->ᩳ:I

    if-nez p2, :cond_2

    .line 279
    new-array p2, p4, [Ll/ۜ۬ۖ;

    :goto_0
    if-ge p3, p4, :cond_1

    .line 281
    aget-object v0, p1, p3

    if-eqz v0, :cond_0

    .line 283
    new-instance v1, Ll/ۜ۬ۖ;

    iget-object v2, v0, Ll/ۜ۬ۖ;->ۧ:Ll/ᩳ᩶ۖ;

    invoke-direct {v1, v2}, Ll/ۜ۬ۖ;-><init>(Ll/ᩳ᩶ۖ;)V

    .line 284
    iget-object v2, p0, Ll/ᩳ۬ۖ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 285
    iget-object v2, v0, Ll/ۜ۬ۖ;->֫:Ll/᩻۬ۖ;

    iput-object v2, v1, Ll/ۜ۬ۖ;->֫:Ll/᩻۬ۖ;

    .line 286
    iput-object v0, v1, Ll/ۜ۬ۖ;->ᩳ:Ll/ۜ۬ۖ;

    .line 287
    iget-object v0, v0, Ll/ۜ۬ۖ;->ܿ:Ljava/util/BitSet;

    invoke-virtual {v0}, Ljava/util/BitSet;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/BitSet;

    iput-object v0, v1, Ll/ۜ۬ۖ;->ܿ:Ljava/util/BitSet;

    .line 288
    aput-object v1, p2, p3

    :cond_0
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_1
    return-object p2

    :cond_2
    :goto_1
    if-ge p3, p4, :cond_5

    .line 293
    aget-object v0, p1, p3

    .line 294
    aget-object v1, p2, p3

    if-eqz v0, :cond_4

    if-eqz v1, :cond_4

    .line 296
    iget-object v2, v1, Ll/ۜ۬ۖ;->ܽ:Ljava/util/HashSet;

    if-nez v2, :cond_3

    .line 297
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, v1, Ll/ۜ۬ۖ;->ܽ:Ljava/util/HashSet;

    .line 299
    :cond_3
    iget-object v1, v1, Ll/ۜ۬ۖ;->ܽ:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_4
    add-int/lit8 p3, p3, 0x1

    goto :goto_1

    :cond_5
    return-object p2
.end method

.method public final ֫(Ljava/lang/Object;Ll/֫ۙۖ;)Ljava/lang/Object;
    .locals 4

    .line 273
    check-cast p1, [Ll/ۜ۬ۖ;

    .line 316
    iput-object p2, p0, Ll/ᩳ۬ۖ;->֫:Ll/֫ۙۖ;

    .line 317
    iget v0, p0, Ll/ᩳ۬ۖ;->ᩳ:I

    const/4 v1, 0x0

    iget-object v2, p0, Ll/ᩳ۬ۖ;->ۧ:[Ll/ۜ۬ۖ;

    invoke-static {p1, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 318
    iget-object p1, p2, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    sget-object v0, Ll/۟᩶ۖ;->ۙ:Ll/۟᩶ۖ;

    if-ne p1, v0, :cond_1

    .line 319
    invoke-virtual {p2}, Ll/֫ۙۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object p1

    iget-object p1, p1, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v0, Ll/֨᩶ۖ;->᩸֫:Ll/֨᩶ۖ;

    if-ne p1, v0, :cond_0

    .line 320
    invoke-virtual {p2}, Ll/֫ۙۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object p1

    check-cast p1, Ll/ᩳ᩶ۖ;

    .line 321
    iget p1, p1, Ll/ᩳ᩶ۖ;->ۗ:I

    if-ltz p1, :cond_6

    .line 322
    aget-object p1, v2, p1

    .line 323
    invoke-virtual {p2}, Ll/֫ۙۖ;->ܿ()Ll/۠᩶ۖ;

    move-result-object p2

    check-cast p2, Ll/ۨ᩹ۖ;

    .line 324
    iget-object p2, p2, Ll/ۨ᩹ۖ;->ۗ:Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result p2

    .line 325
    iget-object p1, p1, Ll/ۜ۬ۖ;->ܿ:Ljava/util/BitSet;

    invoke-virtual {p1, v1, p2}, Ljava/util/BitSet;->set(II)V

    return-object v2

    .line 328
    :cond_0
    invoke-virtual {p2}, Ll/֫ۙۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ᩳ۬ۖ;->֫(Ll/۠᩶ۖ;)V

    return-object v2

    .line 330
    :cond_1
    sget-object v0, Ll/۟᩶ۖ;->᩶:Ll/۟᩶ۖ;

    if-ne p1, v0, :cond_4

    invoke-virtual {p2}, Ll/֫ۙۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object v1

    iget-object v1, v1, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v3, Ll/֨᩶ۖ;->۬:Ll/֨᩶ۖ;

    if-ne v1, v3, :cond_4

    .line 331
    invoke-virtual {p2}, Ll/֫ۙۖ;->ܿ()Ll/۠᩶ۖ;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ᩳ۬ۖ;->֫(Ll/۠᩶ۖ;)V

    .line 332
    invoke-virtual {p2}, Ll/֫ۙۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object p1

    check-cast p1, Ll/۫᩹ۖ;

    .line 113
    iget-object p2, p1, Ll/֡᩶ۖ;->ۗ:Ll/۠᩶ۖ;

    .line 333
    iget-object v0, p2, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v1, Ll/֨᩶ۖ;->᩸֫:Ll/֨᩶ۖ;

    if-ne v0, v1, :cond_3

    .line 334
    check-cast p2, Ll/ᩳ᩶ۖ;

    .line 335
    iget v0, p2, Ll/ᩳ᩶ۖ;->ۗ:I

    if-ltz v0, :cond_2

    .line 118
    iget-object p1, p1, Ll/֡᩶ۖ;->۬:Ll/۠᩶ۖ;

    .line 336
    check-cast p1, Ll/ۨ᩹ۖ;

    iget-object p1, p1, Ll/ۨ᩹ۖ;->ۗ:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    .line 337
    iget p2, p2, Ll/ᩳ᩶ۖ;->ۗ:I

    aget-object p2, v2, p2

    .line 338
    iget-object p2, p2, Ll/ۜ۬ۖ;->ܿ:Ljava/util/BitSet;

    invoke-virtual {p2, p1}, Ljava/util/BitSet;->set(I)V

    return-object v2

    .line 340
    :cond_2
    invoke-direct {p0, p1}, Ll/ᩳ۬ۖ;->֫(Ll/۠᩶ۖ;)V

    return-object v2

    .line 343
    :cond_3
    invoke-direct {p0, p1}, Ll/ᩳ۬ۖ;->֫(Ll/۠᩶ۖ;)V

    return-object v2

    :cond_4
    if-ne p1, v0, :cond_5

    .line 345
    invoke-virtual {p2}, Ll/֫ۙۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object p1

    iget-object p1, p1, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v0, Ll/֨᩶ۖ;->᩸֫:Ll/֨᩶ۖ;

    if-ne p1, v0, :cond_5

    .line 346
    invoke-virtual {p2}, Ll/֫ۙۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object p1

    check-cast p1, Ll/ᩳ᩶ۖ;

    .line 347
    invoke-virtual {p2}, Ll/֫ۙۖ;->ܿ()Ll/۠᩶ۖ;

    move-result-object p2

    invoke-direct {p0, p2}, Ll/ᩳ۬ۖ;->֫(Ll/۠᩶ۖ;)V

    .line 349
    iget p2, p1, Ll/ᩳ᩶ۖ;->ۗ:I

    if-ltz p2, :cond_6

    .line 350
    new-instance p2, Ll/ۜ۬ۖ;

    invoke-direct {p2, p1}, Ll/ۜ۬ۖ;-><init>(Ll/ᩳ᩶ۖ;)V

    .line 351
    iget-object v0, p0, Ll/ᩳ۬ۖ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩻۬ۖ;

    iput-object v0, p2, Ll/ۜ۬ۖ;->֫:Ll/᩻۬ۖ;

    .line 352
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    iput-object v0, p2, Ll/ۜ۬ۖ;->ܿ:Ljava/util/BitSet;

    .line 353
    iget-object v0, p0, Ll/ᩳ۬ۖ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 354
    iget p1, p1, Ll/ᩳ᩶ۖ;->ۗ:I

    aput-object p2, v2, p1

    return-object v2

    .line 357
    :cond_5
    sget-object p1, Ll/ܳ۬ۖ;->֫:[I

    iget-object v0, p2, Ll/֫ۙۖ;->ۧ:Ll/֡᩹ۖ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p1, p1, v0

    const/4 v0, 0x2

    if-eq p1, v0, :cond_9

    const/4 v0, 0x3

    if-eq p1, v0, :cond_8

    const/4 p2, 0x4

    if-eq p1, p2, :cond_7

    :cond_6
    return-object v2

    .line 368
    :cond_7
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 364
    :cond_8
    invoke-virtual {p2}, Ll/֫ۙۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ᩳ۬ۖ;->֫(Ll/۠᩶ۖ;)V

    .line 365
    invoke-virtual {p2}, Ll/֫ۙۖ;->ܿ()Ll/۠᩶ۖ;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ᩳ۬ۖ;->֫(Ll/۠᩶ۖ;)V

    return-object v2

    .line 361
    :cond_9
    invoke-virtual {p2}, Ll/֫ۙۖ;->ܽ()Ll/۠᩶ۖ;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ᩳ۬ۖ;->֫(Ll/۠᩶ۖ;)V

    return-object v2
.end method
