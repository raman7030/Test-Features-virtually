.class public final enum Ll/۟۟ᩴ;
.super Ljava/lang/Enum;
.source "N673"


# static fields
.field public static final enum DISTINCT:Ll/۟۟ᩴ;

.field public static final enum ORDERED:Ll/۟۟ᩴ;

.field public static final enum SHORT_CIRCUIT:Ll/۟۟ᩴ;

.field public static final enum SIZED:Ll/۟۟ᩴ;

.field public static final enum SORTED:Ll/۟۟ᩴ;

.field public static final f:I

.field public static final g:I

.field public static final h:I

.field public static final i:I

.field public static final j:I

.field public static final k:I

.field public static final l:I

.field public static final m:I

.field public static final n:I

.field public static final o:I

.field public static final p:I

.field public static final q:I

.field public static final r:I

.field public static final s:I

.field public static final t:I

.field public static final u:I

.field public static final synthetic v:[Ll/۟۟ᩴ;


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I


# direct methods
.method public static constructor <clinit>()V
    .locals 17

    .line 247
    new-instance v0, Ll/۟۟ᩴ;

    sget-object v1, Ll/᩹۟ᩴ;->SPLITERATOR:Ll/᩹۟ᩴ;

    .line 248
    invoke-static {v1}, Ll/۟۟ᩴ;->C(Ll/᩹۟ᩴ;)Ll/ܿ֨ᩴ;

    move-result-object v2

    sget-object v3, Ll/᩹۟ᩴ;->STREAM:Ll/᩹۟ᩴ;

    invoke-virtual {v2, v3}, Ll/ܿ֨ᩴ;->a(Ll/᩹۟ᩴ;)V

    sget-object v4, Ll/᩹۟ᩴ;->OP:Ll/᩹۟ᩴ;

    const/4 v5, 0x3

    .line 408
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 395
    iget-object v7, v2, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    check-cast v7, Ljava/util/Map;

    check-cast v7, Ljava/util/EnumMap;

    invoke-virtual {v7, v4, v6}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "DISTINCT"

    const/4 v8, 0x0

    .line 248
    invoke-direct {v0, v7, v8, v8, v2}, Ll/۟۟ᩴ;-><init>(Ljava/lang/String;IILl/ܿ֨ᩴ;)V

    sput-object v0, Ll/۟۟ᩴ;->DISTINCT:Ll/۟۟ᩴ;

    .line 268
    new-instance v2, Ll/۟۟ᩴ;

    .line 269
    invoke-static {v1}, Ll/۟۟ᩴ;->C(Ll/᩹۟ᩴ;)Ll/ܿ֨ᩴ;

    move-result-object v7

    invoke-virtual {v7, v3}, Ll/ܿ֨ᩴ;->a(Ll/᩹۟ᩴ;)V

    .line 395
    iget-object v8, v7, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    check-cast v8, Ljava/util/Map;

    check-cast v8, Ljava/util/EnumMap;

    invoke-virtual {v8, v4, v6}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v8, "SORTED"

    const/4 v9, 0x1

    .line 269
    invoke-direct {v2, v8, v9, v9, v7}, Ll/۟۟ᩴ;-><init>(Ljava/lang/String;IILl/ܿ֨ᩴ;)V

    sput-object v2, Ll/۟۟ᩴ;->SORTED:Ll/۟۟ᩴ;

    .line 281
    new-instance v7, Ll/۟۟ᩴ;

    const/4 v8, 0x2

    .line 404
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    .line 282
    invoke-static {v1}, Ll/۟۟ᩴ;->C(Ll/᩹۟ᩴ;)Ll/ܿ֨ᩴ;

    move-result-object v11

    invoke-virtual {v11, v3}, Ll/ܿ֨ᩴ;->a(Ll/᩹۟ᩴ;)V

    .line 395
    iget-object v12, v11, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    check-cast v12, Ljava/util/Map;

    check-cast v12, Ljava/util/EnumMap;

    invoke-virtual {v12, v4, v6}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    sget-object v6, Ll/᩹۟ᩴ;->TERMINAL_OP:Ll/᩹۟ᩴ;

    .line 395
    iget-object v12, v11, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    check-cast v12, Ljava/util/Map;

    check-cast v12, Ljava/util/EnumMap;

    invoke-virtual {v12, v6, v10}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    sget-object v12, Ll/᩹۟ᩴ;->UPSTREAM_TERMINAL_OP:Ll/᩹۟ᩴ;

    .line 395
    iget-object v13, v11, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    check-cast v13, Ljava/util/Map;

    check-cast v13, Ljava/util/EnumMap;

    invoke-virtual {v13, v12, v10}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v13, "ORDERED"

    .line 283
    invoke-direct {v7, v13, v8, v8, v11}, Ll/۟۟ᩴ;-><init>(Ljava/lang/String;IILl/ܿ֨ᩴ;)V

    sput-object v7, Ll/۟۟ᩴ;->ORDERED:Ll/۟۟ᩴ;

    .line 296
    new-instance v11, Ll/۟۟ᩴ;

    .line 297
    invoke-static {v1}, Ll/۟۟ᩴ;->C(Ll/᩹۟ᩴ;)Ll/ܿ֨ᩴ;

    move-result-object v13

    invoke-virtual {v13, v3}, Ll/ܿ֨ᩴ;->a(Ll/᩹۟ᩴ;)V

    .line 395
    iget-object v14, v13, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    check-cast v14, Ljava/util/Map;

    check-cast v14, Ljava/util/EnumMap;

    invoke-virtual {v14, v4, v10}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v10, "SIZED"

    .line 297
    invoke-direct {v11, v10, v5, v5, v13}, Ll/۟۟ᩴ;-><init>(Ljava/lang/String;IILl/ܿ֨ᩴ;)V

    sput-object v11, Ll/۟۟ᩴ;->SIZED:Ll/۟۟ᩴ;

    .line 327
    new-instance v5, Ll/۟۟ᩴ;

    .line 328
    invoke-static {v4}, Ll/۟۟ᩴ;->C(Ll/᩹۟ᩴ;)Ll/ܿ֨ᩴ;

    move-result-object v10

    invoke-virtual {v10, v6}, Ll/ܿ֨ᩴ;->a(Ll/᩹۟ᩴ;)V

    const-string v13, "SHORT_CIRCUIT"

    const/4 v15, 0x4

    const/16 v16, 0x0

    const/16 v14, 0xc

    invoke-direct {v5, v13, v15, v14, v10}, Ll/۟۟ᩴ;-><init>(Ljava/lang/String;IILl/ܿ֨ᩴ;)V

    sput-object v5, Ll/۟۟ᩴ;->SHORT_CIRCUIT:Ll/۟۟ᩴ;

    const/4 v10, 0x5

    new-array v10, v10, [Ll/۟۟ᩴ;

    aput-object v0, v10, v16

    aput-object v2, v10, v9

    aput-object v7, v10, v8

    const/4 v0, 0x3

    aput-object v11, v10, v0

    aput-object v5, v10, v15

    .line 204
    sput-object v10, Ll/۟۟ᩴ;->v:[Ll/۟۟ᩴ;

    .line 528
    invoke-static {v1}, Ll/۟۟ᩴ;->m(Ll/᩹۟ᩴ;)I

    move-result v0

    sput v0, Ll/۟۟ᩴ;->f:I

    .line 533
    invoke-static {v3}, Ll/۟۟ᩴ;->m(Ll/᩹۟ᩴ;)I

    move-result v0

    sput v0, Ll/۟۟ᩴ;->g:I

    .line 538
    invoke-static {v4}, Ll/۟۟ᩴ;->m(Ll/᩹۟ᩴ;)I

    move-result v0

    sput v0, Ll/۟۟ᩴ;->h:I

    .line 543
    invoke-static {v6}, Ll/۟۟ᩴ;->m(Ll/᩹۟ᩴ;)I

    .line 548
    invoke-static {v12}, Ll/۟۟ᩴ;->m(Ll/᩹۟ᩴ;)I

    .line 565
    invoke-static {}, Ll/۟۟ᩴ;->values()[Ll/۟۟ᩴ;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 566
    iget v3, v3, Ll/۟۟ᩴ;->e:I

    or-int v16, v16, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 561
    :cond_0
    sput v16, Ll/۟۟ᩴ;->i:I

    .line 574
    sget v0, Ll/۟۟ᩴ;->g:I

    sput v0, Ll/۟۟ᩴ;->j:I

    shl-int/lit8 v1, v0, 0x1

    .line 579
    sput v1, Ll/۟۟ᩴ;->k:I

    or-int/2addr v0, v1

    .line 585
    sput v0, Ll/۟۟ᩴ;->l:I

    .line 590
    sget-object v0, Ll/۟۟ᩴ;->DISTINCT:Ll/۟۟ᩴ;

    iget v1, v0, Ll/۟۟ᩴ;->c:I

    sput v1, Ll/۟۟ᩴ;->m:I

    .line 595
    iget v0, v0, Ll/۟۟ᩴ;->d:I

    sput v0, Ll/۟۟ᩴ;->n:I

    .line 600
    sget-object v0, Ll/۟۟ᩴ;->SORTED:Ll/۟۟ᩴ;

    iget v1, v0, Ll/۟۟ᩴ;->c:I

    sput v1, Ll/۟۟ᩴ;->o:I

    .line 605
    iget v0, v0, Ll/۟۟ᩴ;->d:I

    sput v0, Ll/۟۟ᩴ;->p:I

    .line 610
    sget-object v0, Ll/۟۟ᩴ;->ORDERED:Ll/۟۟ᩴ;

    iget v1, v0, Ll/۟۟ᩴ;->c:I

    sput v1, Ll/۟۟ᩴ;->q:I

    .line 615
    iget v0, v0, Ll/۟۟ᩴ;->d:I

    sput v0, Ll/۟۟ᩴ;->r:I

    .line 620
    sget-object v0, Ll/۟۟ᩴ;->SIZED:Ll/۟۟ᩴ;

    iget v1, v0, Ll/۟۟ᩴ;->c:I

    sput v1, Ll/۟۟ᩴ;->s:I

    .line 625
    iget v0, v0, Ll/۟۟ᩴ;->d:I

    sput v0, Ll/۟۟ᩴ;->t:I

    .line 630
    sget-object v0, Ll/۟۟ᩴ;->SHORT_CIRCUIT:Ll/۟۟ᩴ;

    iget v0, v0, Ll/۟۟ᩴ;->c:I

    sput v0, Ll/۟۟ᩴ;->u:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILl/ܿ֨ᩴ;)V
    .locals 5

    .line 445
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 412
    invoke-static {}, Ll/᩹۟ᩴ;->values()[Ll/᩹۟ᩴ;

    move-result-object p1

    array-length p2, p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    aget-object v2, p1, v1

    .line 413
    iget-object v3, p4, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    check-cast v3, Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v2, v4}, Ll/ܰ۬ᩴ;->putIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 415
    :cond_0
    iget-object p1, p4, Ll/ܿ֨ᩴ;->b:Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    .line 446
    iput-object p1, p0, Ll/۟۟ᩴ;->a:Ljava/util/Map;

    const/4 p1, 0x2

    mul-int/lit8 p3, p3, 0x2

    .line 449
    iput p3, p0, Ll/۟۟ᩴ;->b:I

    const/4 p2, 0x1

    shl-int/2addr p2, p3

    .line 450
    iput p2, p0, Ll/۟۟ᩴ;->c:I

    shl-int/2addr p1, p3

    .line 451
    iput p1, p0, Ll/۟۟ᩴ;->d:I

    const/4 p1, 0x3

    shl-int/2addr p1, p3

    .line 452
    iput p1, p0, Ll/۟۟ᩴ;->e:I

    return-void
.end method

.method public static C(Ll/᩹۟ᩴ;)Ll/ܿ֨ᩴ;
    .locals 3

    .line 384
    new-instance v0, Ll/ܿ֨ᩴ;

    new-instance v1, Ljava/util/EnumMap;

    const-class v2, Ll/᩹۟ᩴ;

    invoke-direct {v1, v2}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    const/16 v2, 0xf

    invoke-direct {v0, v2, v1}, Ll/ܿ֨ᩴ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, p0}, Ll/ܿ֨ᩴ;->a(Ll/᩹۟ᩴ;)V

    return-object v0
.end method

.method public static l(II)I
    .locals 2

    if-nez p0, :cond_0

    .line 633
    sget v0, Ll/۟۟ᩴ;->i:I

    goto :goto_0

    .line 635
    :cond_0
    sget v0, Ll/۟۟ᩴ;->j:I

    and-int/2addr v0, p0

    shl-int/lit8 v0, v0, 0x1

    or-int/2addr v0, p0

    sget v1, Ll/۟۟ᩴ;->k:I

    and-int/2addr v1, p0

    shr-int/lit8 v1, v1, 0x1

    or-int/2addr v0, v1

    not-int v0, v0

    :goto_0
    and-int/2addr p1, v0

    or-int/2addr p0, p1

    return p0
.end method

.method public static m(Ll/᩹۟ᩴ;)I
    .locals 6

    .line 552
    invoke-static {}, Ll/۟۟ᩴ;->values()[Ll/۟۟ᩴ;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    .line 553
    iget-object v5, v4, Ll/۟۟ᩴ;->a:Ljava/util/Map;

    invoke-interface {v5, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget v4, v4, Ll/۟۟ᩴ;->b:I

    shl-int v4, v5, v4

    or-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v3
.end method

.method public static n(Ll/ܶ۫ᩴ;)I
    .locals 3

    .line 733
    invoke-interface {p0}, Ll/ܶ۫ᩴ;->characteristics()I

    move-result v0

    and-int/lit8 v1, v0, 0x4

    .line 734
    sget v2, Ll/۟۟ᩴ;->f:I

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ll/ܶ۫ᩴ;->getComparator()Ljava/util/Comparator;

    move-result-object p0

    if-eqz p0, :cond_0

    and-int p0, v0, v2

    and-int/lit8 p0, p0, -0x5

    return p0

    :cond_0
    and-int p0, v0, v2

    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Ll/۟۟ᩴ;
    .locals 1

    .line 204
    const-class v0, Ll/۟۟ᩴ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/۟۟ᩴ;

    return-object p0
.end method

.method public static values()[Ll/۟۟ᩴ;
    .locals 1

    .line 204
    sget-object v0, Ll/۟۟ᩴ;->v:[Ll/۟۟ᩴ;

    invoke-virtual {v0}, [Ll/۟۟ᩴ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/۟۟ᩴ;

    return-object v0
.end method


# virtual methods
.method public final s(I)Z
    .locals 1

    .line 491
    iget v0, p0, Ll/۟۟ᩴ;->e:I

    and-int/2addr p1, v0

    iget v0, p0, Ll/۟۟ᩴ;->c:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
