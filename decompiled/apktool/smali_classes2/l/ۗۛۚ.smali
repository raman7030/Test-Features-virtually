.class public final Ll/ۗۛۚ;
.super Ljava/lang/Object;
.source "K3OA"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final ۗ:Ll/ܺۤۚ;

.field public final ۙ:Ll/ᩴ۫ۚ;

.field public final ۫:Ll/ᩴ۫ۚ;

.field public final ۬:Ljava/util/ArrayList;

.field public ᩶:Ll/ۘۨۚ;

.field public ᩸:Ljava/util/LinkedHashMap;

.field public final ᩹:Ll/᩹ۛۚ;


# direct methods
.method public constructor <init>(Ll/ۘۨۚ;)V
    .locals 5

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Ll/᩹ۛۚ;

    const-string v1, ""

    invoke-direct {v0, v1}, Ll/᩹ۛۚ;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ll/ۗۛۚ;->᩹:Ll/᩹ۛۚ;

    .line 48
    new-instance v0, Ll/ܺۤۚ;

    const/4 v1, -0x1

    const/4 v2, 0x0

    .line 45
    invoke-direct {v0, v1, v2}, Ll/ܺۤۚ;-><init>(ILl/ۖۤۚ;)V

    .line 48
    iput-object v0, p0, Ll/ۗۛۚ;->ۗ:Ll/ܺۤۚ;

    .line 49
    new-instance v0, Ll/ܺۤۚ;

    new-instance v3, Ll/᩶ۛۚ;

    .line 623
    sget-object v4, Ll/ۧۤۚ;->ۛ֫:Ll/ۧۤۚ;

    invoke-direct {v3, v4, v2}, Ll/ۖۤۚ;-><init>(Ll/ۧۤۚ;Ljava/lang/Object;)V

    .line 45
    invoke-direct {v0, v1, v3}, Ll/ܺۤۚ;-><init>(ILl/ۖۤۚ;)V

    .line 51
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0x28

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Ll/ۗۛۚ;->۬:Ljava/util/ArrayList;

    .line 53
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    iput-object v3, p0, Ll/ۗۛۚ;->᩸:Ljava/util/LinkedHashMap;

    .line 55
    new-instance v2, Ll/֫ۛۚ;

    invoke-direct {v2, p0}, Ll/֫ۛۚ;-><init>(Ll/ۗۛۚ;)V

    iput-object v2, p0, Ll/ۗۛۚ;->ۙ:Ll/ᩴ۫ۚ;

    new-instance v2, Ll/ۧۛۚ;

    invoke-direct {v2, p0}, Ll/ۧۛۚ;-><init>(Ll/ۗۛۚ;)V

    iput-object v2, p0, Ll/ۗۛۚ;->۫:Ll/ᩴ۫ۚ;

    .line 93
    iput-object p1, p0, Ll/ۗۛۚ;->᩶:Ll/ۘۨۚ;

    .line 94
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic ֫(Ll/ۗۛۚ;)Ljava/lang/String;
    .locals 2

    .line 264
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "pool_size : "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p0, p0, Ll/ۗۛۚ;->۬:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private ֫(ILl/ܺۤۚ;I)V
    .locals 9

    .line 262
    new-instance v0, Ll/ۘۤۚ;

    invoke-direct {v0, p1, p2}, Ll/ۘۤۚ;-><init>(ILl/ܺۤۚ;)V

    iget-object v1, p0, Ll/ۗۛۚ;->᩶:Ll/ۘۨۚ;

    invoke-virtual {v1, v0}, Ll/᩶ۗۚ;->֫(Ljava/util/function/Supplier;)V

    .line 263
    new-instance v0, Ll/᩶ۤۚ;

    invoke-direct {v0, p3}, Ll/᩶ۤۚ;-><init>(I)V

    invoke-virtual {v1, v0}, Ll/᩶ۗۚ;->֫(Ljava/util/function/Supplier;)V

    .line 264
    new-instance v0, Ll/۫ۤۚ;

    invoke-direct {v0, p0}, Ll/۫ۤۚ;-><init>(Ll/ۗۛۚ;)V

    invoke-virtual {v1, v0}, Ll/᩶ۗۚ;->֫(Ljava/util/function/Supplier;)V

    .line 265
    iput p1, p2, Ll/ۜۨۚ;->᩸:I

    add-int v0, p1, p3

    .line 266
    iget-object v2, p0, Ll/ۗۛۚ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x2

    if-lt v0, v3, :cond_2

    .line 267
    new-instance v3, Ll/ۤۤۚ;

    invoke-direct {v3, p1, p3}, Ll/ۤۤۚ;-><init>(II)V

    invoke-virtual {v1, v3}, Ll/᩶ۗۚ;->֫(Ljava/util/function/Supplier;)V

    .line 268
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int v5, v0, v3

    const/4 v6, 0x0

    if-le v5, p3, :cond_1

    sub-int/2addr v0, p3

    const/4 v7, 0x1

    sub-int/2addr v0, v7

    if-ne v3, v0, :cond_0

    .line 271
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v3, v7, [Ljava/lang/Object;

    aput-object v0, v3, v6

    const-string v0, "#%d"

    .line 19
    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 271
    :cond_0
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v8, v4, [Ljava/lang/Object;

    aput-object v3, v8, v6

    aput-object v0, v8, v7

    const-string v0, "#%d-#%d"

    .line 19
    invoke-static {v0, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-array v3, v7, [Ljava/lang/Object;

    aput-object v0, v3, v6

    const-string v0, "Missing Constant Pool entry(ies) {0} might be auto-filled with Utf8[null] "

    .line 272
    invoke-virtual {v1, v0, v3}, Ll/ۘۨۚ;->ܿ(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    :goto_1
    if-ge v6, v5, :cond_2

    .line 275
    iget-object v0, p0, Ll/ۗۛۚ;->ۗ:Ll/ܺۤۚ;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 278
    :cond_2
    invoke-virtual {v2, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    if-ne p3, v4, :cond_3

    add-int/lit8 p3, p1, 0x1

    .line 280
    new-instance v0, Ll/ܺۤۚ;

    iget-object v3, p0, Ll/ۗۛۚ;->᩹:Ll/᩹ۛۚ;

    invoke-direct {v0, p3, v3}, Ll/ܺۤۚ;-><init>(ILl/ۖۤۚ;)V

    invoke-virtual {v2, p3, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 282
    :cond_3
    new-instance p3, Ll/ۛۤۚ;

    invoke-direct {p3, p1, p2}, Ll/ۛۤۚ;-><init>(ILl/ܺۤۚ;)V

    invoke-virtual {v1, p3}, Ll/᩶ۗۚ;->֫(Ljava/util/function/Supplier;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܺۤۚ;Ll/ۗۛۚ;)V
    .locals 0

    .line 0
    invoke-direct {p1, p0}, Ll/ۗۛۚ;->ᩳ(Ll/ܺۤۚ;)Z

    return-void
.end method

.method public static ֫(Ll/ܺۤۚ;Ll/ܶۤۚ;)V
    .locals 2

    if-eqz p0, :cond_0

    .line 310
    invoke-virtual {p1, p0}, Ll/ܶۤۚ;->accept(Ljava/lang/Object;)V

    .line 311
    iget-object p0, p0, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    if-eqz p0, :cond_0

    .line 313
    sget-object v0, Ll/ܽۛۚ;->֫:[I

    iget-object v1, p0, Ll/ۖۤۚ;->֫:Ll/ۧۤۚ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 320
    :pswitch_0
    iget-object p0, p0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast p0, Ll/ۜۗۚ;

    .line 321
    iget-object v0, p0, Ll/ۜۗۚ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ܺۤۚ;

    invoke-static {v0, p1}, Ll/ۗۛۚ;->֫(Ll/ܺۤۚ;Ll/ܶۤۚ;)V

    .line 322
    iget-object p0, p0, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    check-cast p0, Ll/ܺۤۚ;

    invoke-static {p0, p1}, Ll/ۗۛۚ;->֫(Ll/ܺۤۚ;Ll/ܶۤۚ;)V

    return-void

    .line 316
    :pswitch_1
    iget-object p0, p0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast p0, Ll/ܺۤۚ;

    invoke-static {p0, p1}, Ll/ۗۛۚ;->֫(Ll/ܺۤۚ;Ll/ܶۤۚ;)V

    :cond_0
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static bridge synthetic ۧ(Ll/ܺۤۚ;Ll/ۗۛۚ;)V
    .locals 0

    .line 0
    invoke-direct {p1, p0}, Ll/ۗۛۚ;->ܿ(Ll/ܺۤۚ;)Z

    return-void
.end method

.method private ܳ(Ll/ܺۤۚ;)Ll/ܺۤۚ;
    .locals 6

    .line 386
    invoke-virtual {p0, p1}, Ll/ۗۛۚ;->֫(Ll/ܺۤۚ;)Ll/ܽ۫ᩴ;

    move-result-object v0

    .line 387
    invoke-virtual {v0}, Ll/ܽ۫ᩴ;->isPresent()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 388
    invoke-virtual {v0}, Ll/ܽ۫ᩴ;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺۤۚ;

    .line 389
    iget-object v1, v0, Ll/ܺۤۚ;->᩶:Ll/ۙۛۚ;

    iget-object p1, p1, Ll/ܺۤۚ;->᩶:Ll/ۙۛۚ;

    if-eq v1, p1, :cond_0

    .line 89
    iget v1, v1, Ll/ۙۛۚ;->᩸:I

    iget v2, p1, Ll/ۙۛۚ;->᩸:I

    if-le v1, v2, :cond_0

    .line 90
    iput-object p1, v0, Ll/ܺۤۚ;->᩶:Ll/ۙۛۚ;

    :cond_0
    return-object v0

    .line 394
    :cond_1
    iget-object v0, p1, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    invoke-virtual {v0}, Ll/ۖۤۚ;->ۧ()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x1

    .line 421
    :goto_0
    iget-object v3, p0, Ll/ۗۛۚ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v2, v4, :cond_3

    .line 422
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, p0, Ll/ۗۛۚ;->ۗ:Ll/ܺۤۚ;

    if-ne v4, v5, :cond_2

    if-eq v0, v1, :cond_3

    add-int/lit8 v4, v2, 0x1

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 396
    :cond_3
    :goto_1
    invoke-direct {p0, v2, p1, v0}, Ll/ۗۛۚ;->֫(ILl/ܺۤۚ;I)V

    .line 397
    invoke-virtual {p0, v2}, Ll/ۗۛۚ;->ᩳ(I)Ll/ܺۤۚ;

    move-result-object p1

    return-object p1
.end method

.method private ܿ(I)V
    .locals 4

    .line 286
    new-instance v0, Ll/۠ۤۚ;

    invoke-direct {v0, p1}, Ll/۠ۤۚ;-><init>(I)V

    iget-object v1, p0, Ll/ۗۛۚ;->᩶:Ll/ۘۨۚ;

    invoke-virtual {v1, v0}, Ll/᩶ۗۚ;->֫(Ljava/util/function/Supplier;)V

    .line 287
    new-instance v0, Ll/ܶۤۚ;

    invoke-direct {v0, p0, p1}, Ll/ܶۤۚ;-><init>(Ll/ۗۛۚ;I)V

    const/4 v1, 0x1

    .line 296
    :goto_0
    iget-object v2, p0, Ll/ۗۛۚ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    if-eq v1, p1, :cond_0

    .line 298
    invoke-virtual {p0, v1}, Ll/ۗۛۚ;->ᩳ(I)Ll/ܺۤۚ;

    move-result-object v2

    .line 299
    invoke-static {v2, v0}, Ll/ۗۛۚ;->֫(Ll/ܺۤۚ;Ll/ܶۤۚ;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 302
    :cond_1
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 303
    new-instance p1, Ll/᩸ۤۚ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-static {v2, p1}, Ll/᩶֨ᩴ;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-void
.end method

.method private ܿ(Ll/ܺۤۚ;)Z
    .locals 3

    .line 126
    iget-object v0, p1, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    if-nez v0, :cond_1

    .line 127
    iget v0, p1, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {p0, v0}, Ll/ۗۛۚ;->ۧ(I)Ll/ܺۤۚ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 223
    iget-object v1, v0, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    if-eqz v1, :cond_0

    .line 225
    iget-object v2, p0, Ll/ۗۛۚ;->۫:Ll/ᩴ۫ۚ;

    check-cast v2, Ll/ۧۛۚ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v1}, Ll/ۖ۫ۚ;->֫(Ll/ᩴ۫ۚ;Ll/ۖۤۚ;)V

    .line 130
    :cond_0
    iget-object v0, v0, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    iput-object v0, p1, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private ᩳ(Ll/ܺۤۚ;)Z
    .locals 2

    .line 161
    iget-object v0, p1, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ll/ܺۤۚ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    .line 162
    invoke-virtual {p0, p1}, Ll/ۗۛۚ;->֫(Ll/ܺۤۚ;)Ll/ܽ۫ᩴ;

    move-result-object v0

    .line 163
    invoke-virtual {v0}, Ll/ܽ۫ᩴ;->isPresent()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 164
    invoke-virtual {v0}, Ll/ܽ۫ᩴ;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺۤۚ;

    iget v0, v0, Ll/ۜۨۚ;->᩸:I

    iput v0, p1, Ll/ۜۨۚ;->᩸:I

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 99
    iget-object v0, p0, Ll/ۗۛۚ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final varargs ֫([Ll/ۧۤۚ;)Ljava/util/ArrayList;
    .locals 2

    .line 561
    iget-object v0, p0, Ll/ۗۛۚ;->۬:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/۬ۤۚ;

    invoke-direct {v1, p1}, Ll/۬ۤۚ;-><init>([Ll/ۧۤۚ;)V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v0, Ll/᩺ۤۚ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ll/᩺ۨᩴ;->toCollection(Ljava/util/function/Supplier;)Ll/ۨۨᩴ;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    return-object p1
.end method

.method public final ֫(I)Ll/ܺۤۚ;
    .locals 2

    .line 335
    invoke-virtual {p0, p1}, Ll/ۗۛۚ;->ۧ(I)Ll/ܺۤۚ;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 339
    :cond_0
    new-instance v0, Ll/ܺۤۚ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/ܺۤۚ;-><init>(ILl/ۖۤۚ;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ll/ܺۤۚ;
    .locals 1

    .line 486
    new-instance v0, Ll/᩹ۛۚ;

    invoke-direct {v0, p1}, Ll/᩹ۛۚ;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ll/ۗۛۚ;->֫(Ll/ۖۤۚ;)Ll/ܺۤۚ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/util/function/Function;)Ll/ܺۤۚ;
    .locals 2

    .line 490
    iget-object v0, p0, Ll/ۗۛۚ;->᩸:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/۟ۤۚ;

    invoke-direct {v1, p1}, Ll/۟ۤۚ;-><init>(Ljava/util/function/Function;)V

    .line 491
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    .line 492
    invoke-interface {p1}, Ll/ܿ᩺ᩴ;->findFirst()Ll/ܽ۫ᩴ;

    move-result-object p1

    new-instance v0, Ll/᩹᩻ܽ;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ll/᩹᩻ܽ;-><init>(I)V

    invoke-virtual {p1, v0}, Ll/ܽ۫ᩴ;->map(Ljava/util/function/Function;)Ll/ܽ۫ᩴ;

    move-result-object p1

    const/4 v0, 0x0

    .line 493
    invoke-virtual {p1, v0}, Ll/ܽ۫ᩴ;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܺۤۚ;

    return-object p1
.end method

.method public final ֫(Ll/ۖۤۚ;)Ll/ܺۤۚ;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 445
    iget-object v2, p0, Ll/ۗۛۚ;->᩶:Ll/ۘۨۚ;

    if-eqz p1, :cond_2

    .line 448
    iget-object v3, p0, Ll/ۗۛۚ;->᩸:Ljava/util/LinkedHashMap;

    invoke-virtual {v3, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܺۤۚ;

    const/4 v5, 0x1

    const/4 v6, 0x2

    if-eqz v4, :cond_1

    .line 451
    iget-object v3, v4, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    .line 452
    invoke-virtual {v3, p1}, Ll/ۖۤۚ;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    new-array v0, v6, [Ljava/lang/Object;

    aput-object v4, v0, v1

    aput-object p1, v0, v5

    const-string p1, "ConstantPoolHashByValue.got (\'%s\') for \'%s\'"

    .line 455
    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v1, [Ljava/lang/Object;

    invoke-virtual {v2, p1, v0}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v4

    .line 453
    :cond_0
    invoke-virtual {p1}, Ll/ۖۤۚ;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3}, Ll/ۖۤۚ;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v4, v6, [Ljava/lang/Object;

    aput-object p1, v4, v1

    aput-object v3, v4, v5

    const-string p1, "Seeking value {0} is not equal to found {1}"

    invoke-virtual {v2, p1, v4}, Ll/ۘۨۚ;->ܳ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0

    .line 458
    :cond_1
    new-instance v0, Ll/ܺۤۚ;

    const/4 v4, -0x1

    .line 45
    invoke-direct {v0, v4, p1}, Ll/ܺۤۚ;-><init>(ILl/ۖۤۚ;)V

    .line 459
    invoke-virtual {v3, p1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-array v3, v6, [Ljava/lang/Object;

    aput-object p1, v3, v1

    aput-object v0, v3, v5

    const-string p1, "ConstantPoolHashByValue.put (\'%s\',\'%s\')"

    .line 460
    invoke-virtual {v2, p1, v3}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0

    :cond_2
    const-string p1, "ConstCell.value can\'\'t be null"

    new-array v1, v1, [Ljava/lang/Object;

    .line 446
    invoke-virtual {v2, p1, v1}, Ll/ۘۨۚ;->ܳ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0
.end method

.method public final ֫(Ll/ۧۤۚ;Ll/֨᩺ۚ;)Ll/ܺۤۚ;
    .locals 6

    .line 529
    invoke-virtual {p2}, Ll/֨᩺ۚ;->ۧ()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    iget-object v4, p0, Ll/ۗۛۚ;->᩶:Ll/ۘۨۚ;

    if-nez v0, :cond_2

    .line 532
    invoke-virtual {p2}, Ll/֨᩺ۚ;->֫()I

    move-result v0

    if-lez v0, :cond_1

    .line 534
    invoke-virtual {p2}, Ll/֨᩺ۚ;->֫()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ۗۛۚ;->ۧ(I)Ll/ܺۤۚ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 535
    iget-object v5, v0, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    iget-object v5, v5, Ll/ۖۤۚ;->֫:Ll/ۧۤۚ;

    if-ne v5, p1, :cond_0

    return-object v0

    .line 538
    :cond_0
    invoke-virtual {p2}, Ll/֨᩺ۚ;->֫()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array p2, v2, [Ljava/lang/Object;

    aput-object p1, p2, v1

    const-string p1, "Constant Pool index {0} is not found"

    invoke-virtual {v4, p1, p2}, Ll/ۘۨۚ;->ܳ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v3

    .line 43
    :cond_1
    iget-object p2, p2, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    .line 540
    invoke-virtual {p0, p2}, Ll/ۗۛۚ;->֫(Ljava/lang/String;)Ll/ܺۤۚ;

    move-result-object p2

    .line 521
    new-instance v0, Ll/ܿۛۚ;

    .line 738
    invoke-direct {v0, p1, p2}, Ll/ۖۤۚ;-><init>(Ll/ۧۤۚ;Ljava/lang/Object;)V

    .line 521
    invoke-virtual {p0, v0}, Ll/ۗۛۚ;->֫(Ll/ۖۤۚ;)Ll/ܺۤۚ;

    move-result-object p1

    return-object p1

    :cond_2
    new-array p1, v2, [Ljava/lang/Object;

    const-string p2, "ConstantPool::FindCell"

    aput-object p2, p1, v1

    const-string p2, "{0} emptyInfo"

    .line 531
    invoke-virtual {v4, p2, p1}, Ll/ۘۨۚ;->ܳ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v3
.end method

.method public final ֫(Ll/ܺۤۚ;)Ll/ܽ۫ᩴ;
    .locals 4

    .line 368
    iget-object v0, p1, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    if-nez v0, :cond_2

    .line 370
    invoke-virtual {p0}, Ll/ۗۛۚ;->ܿ()Ll/᩷ۗۚ;

    move-result-object v0

    iget v1, p1, Ll/ۜۨۚ;->᩸:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/᩷ۗۚ;->֫(Ljava/lang/Integer;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 371
    iget p1, p1, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {p0, p1}, Ll/ۗۛۚ;->ۧ(I)Ll/ܺۤۚ;

    move-result-object p1

    invoke-static {p1}, Ll/ܽ۫ᩴ;->ofNullable(Ljava/lang/Object;)Ll/ܽ۫ᩴ;

    move-result-object p1

    return-object p1

    .line 372
    :cond_0
    invoke-virtual {p1}, Ll/ܺۤۚ;->֫()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    iget-object v3, p0, Ll/ۗۛۚ;->᩶:Ll/ۘۨۚ;

    if-eqz v0, :cond_1

    .line 373
    iget p1, p1, Ll/ۜۨۚ;->᩸:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v1

    const-string p1, "Constant Pool Cell {0} without value"

    invoke-virtual {v3, p1, v0}, Ll/ۘۨۚ;->ܳ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    :cond_1
    const-string p1, "Const Cell has undefined Constant pool index and null value"

    new-array v0, v1, [Ljava/lang/Object;

    .line 375
    invoke-virtual {v3, p1, v0}, Ll/ۘۨۚ;->ܳ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v2

    .line 378
    :cond_2
    iget-object p1, p0, Ll/ۗۛۚ;->᩸:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-static {p1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v1, Ll/ܰۤۚ;

    invoke-direct {v1, v0}, Ll/ܰۤۚ;-><init>(Ll/ۖۤۚ;)V

    .line 379
    invoke-interface {p1, v1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    .line 382
    invoke-interface {p1}, Ll/ܿ᩺ᩴ;->findFirst()Ll/ܽ۫ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(ILl/ܺۤۚ;)V
    .locals 7

    .line 344
    iget-object v0, p2, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 345
    iget-object v3, p0, Ll/ۗۛۚ;->᩶:Ll/ۘۨۚ;

    if-eqz v0, :cond_4

    .line 348
    invoke-virtual {v0}, Ll/ۖۤۚ;->ۧ()I

    move-result v4

    if-nez p1, :cond_0

    const-string v0, "Re-declaration of Constant #0 cannot be written to the class file"

    new-array v1, v2, [Ljava/lang/Object;

    .line 353
    invoke-virtual {v3, v0, v1}, Ll/ۘۨۚ;->ܿ(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 355
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۗۛۚ;->ۧ(I)Ll/ܺۤۚ;

    move-result-object v5

    const/4 v6, 0x2

    if-nez v5, :cond_3

    if-ne v4, v6, :cond_1

    add-int/lit8 v5, p1, 0x1

    invoke-virtual {p0, v5}, Ll/ۗۛۚ;->ۧ(I)Ll/ܺۤۚ;

    move-result-object v5

    if-eqz v5, :cond_1

    goto :goto_1

    .line 359
    :cond_1
    invoke-virtual {p2}, Ll/ܺۤۚ;->֫()Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p2, Ll/ۜۨۚ;->᩸:I

    if-eq v1, p1, :cond_2

    .line 360
    new-instance p2, Ll/ܺۤۚ;

    const/4 v1, -0x1

    .line 45
    invoke-direct {p2, v1, v0}, Ll/ܺۤۚ;-><init>(ILl/ۖۤۚ;)V

    .line 361
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "setCell: new ConstCell "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Object;

    invoke-virtual {v3, v0, v1}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    :cond_2
    :goto_0
    invoke-direct {p0, p1, p2, v4}, Ll/ۗۛۚ;->֫(ILl/ܺۤۚ;I)V

    return-void

    :cond_3
    :goto_1
    const-string p2, "#"

    .line 0
    invoke-static {p1, p2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 356
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sub-int/2addr p1, v1

    invoke-static {p1, v2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array p2, v6, [Ljava/lang/Object;

    aput-object v0, p2, v2

    aput-object p1, p2, v1

    const-string p1, "Constant Pool entry {0} has been redeclared or overlaps with entry {1}"

    invoke-virtual {v3, p1, p2}, Ll/ۘۨۚ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 346
    :cond_4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array p2, v1, [Ljava/lang/Object;

    aput-object p1, p2, v2

    const-string p1, "Constant Pool Cell {0} without value"

    invoke-virtual {v3, p1, p2}, Ll/ۘۨۚ;->ܳ(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 8

    .line 545
    iget-object v0, p0, Ll/ۗۛۚ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 546
    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 548
    new-instance v2, Ll/۟ܽ֨;

    const/4 v3, 0x1

    invoke-direct {v2, v1, v3}, Ll/۟ܽ֨;-><init>(II)V

    iget-object v4, p0, Ll/ۗۛۚ;->᩶:Ll/ۘۨۚ;

    invoke-virtual {v4, v2}, Ll/᩶ۗۚ;->֫(Ljava/util/function/Supplier;)V

    const/4 v2, 0x1

    :goto_0
    if-ge v2, v1, :cond_1

    .line 550
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܺۤۚ;

    .line 551
    iget-object v6, v5, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    .line 552
    iget v7, v5, Ll/ۜۨۚ;->᩸:I

    if-ne v7, v2, :cond_0

    .line 555
    invoke-virtual {v6, p1}, Ll/ۖۤۚ;->֫(Ll/֡۫ۚ;)V

    .line 556
    invoke-virtual {v6}, Ll/ۖۤۚ;->ۧ()I

    move-result v5

    add-int/2addr v2, v5

    goto :goto_0

    .line 553
    :cond_0
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    iget v0, v5, Ll/ۜۨۚ;->᩸:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    aput-object v0, v1, v3

    const-string p1, "Cell[{0}] has #{1}"

    invoke-virtual {v4, p1, v1}, Ll/ۘۨۚ;->ܳ(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ܶۛۚ;)V
    .locals 3

    .line 145
    iget-object v0, p1, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ll/ۜۗۚ;

    .line 146
    iget-object v1, v0, Ll/ۜۗۚ;->᩸:Ljava/lang/Object;

    check-cast v1, Ll/ܺۤۚ;

    invoke-direct {p0, v1}, Ll/ۗۛۚ;->ᩳ(Ll/ܺۤۚ;)Z

    move-result v1

    iget-object v2, p0, Ll/ۗۛۚ;->᩶:Ll/ۘۨۚ;

    if-eqz v1, :cond_0

    .line 147
    new-instance v1, Ll/ۚۤۚ;

    invoke-direct {v1, v0, p1}, Ll/ۚۤۚ;-><init>(Ll/ۜۗۚ;Ll/ܶۛۚ;)V

    invoke-virtual {v2, v1}, Ll/᩶ۗۚ;->֫(Ljava/util/function/Supplier;)V

    .line 149
    :cond_0
    iget-object v1, v0, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    check-cast v1, Ll/ܺۤۚ;

    invoke-direct {p0, v1}, Ll/ۗۛۚ;->ᩳ(Ll/ܺۤۚ;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 150
    new-instance v1, Ll/֨ۤۚ;

    invoke-direct {v1, v0, p1}, Ll/֨ۤۚ;-><init>(Ll/ۜۗۚ;Ll/ܶۛۚ;)V

    invoke-virtual {v2, v1}, Ll/᩶ۗۚ;->֫(Ljava/util/function/Supplier;)V

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ܿۛۚ;)V
    .locals 2

    .line 138
    iget-object v0, p1, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ll/ܺۤۚ;

    .line 139
    invoke-direct {p0, v0}, Ll/ۗۛۚ;->ᩳ(Ll/ܺۤۚ;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 140
    new-instance v1, Ll/᩹ۤۚ;

    invoke-direct {v1, v0, p1}, Ll/᩹ۤۚ;-><init>(Ll/ܺۤۚ;Ll/ܿۛۚ;)V

    iget-object p1, p0, Ll/ۗۛۚ;->᩶:Ll/ۘۨۚ;

    invoke-virtual {p1, v1}, Ll/᩶ۗۚ;->֫(Ljava/util/function/Supplier;)V

    :cond_0
    return-void
.end method

.method public final varargs ۧ([Ll/ۧۤۚ;)Ljava/util/ArrayList;
    .locals 2

    .line 565
    iget-object v0, p0, Ll/ۗۛۚ;->۬:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ۨۤۚ;

    invoke-direct {v1, p1}, Ll/ۨۤۚ;-><init>([Ll/ۧۤۚ;)V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v0, Ll/᩺ۤۚ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 566
    invoke-static {v0}, Ll/᩺ۨᩴ;->toCollection(Ljava/util/function/Supplier;)Ll/ۨۨᩴ;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    return-object p1
.end method

.method public final ۧ(I)Ll/ܺۤۚ;
    .locals 2

    .line 255
    iget-object v0, p0, Ll/ۗۛۚ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt p1, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 258
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܺۤۚ;

    return-object p1
.end method

.method public final ۧ(Ljava/lang/Integer;)Ll/ܺۤۚ;
    .locals 2

    .line 470
    new-instance v0, Ll/ۡۛۚ;

    sget-object v1, Ll/ۧۤۚ;->ۖ֫:Ll/ۧۤۚ;

    .line 664
    invoke-direct {v0, v1, p1}, Ll/ۖۤۚ;-><init>(Ll/ۧۤۚ;Ljava/lang/Object;)V

    .line 470
    invoke-virtual {p0, v0}, Ll/ۗۛۚ;->֫(Ll/ۖۤۚ;)Ll/ܺۤۚ;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()V
    .locals 7

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    .line 202
    iget-object v2, p0, Ll/ۗۛۚ;->᩶:Ll/ۘۨۚ;

    const-string v3, "Checking Globals"

    invoke-virtual {v2, v3, v1}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v1, 0x1

    const/4 v3, 0x1

    .line 205
    :goto_0
    iget-object v4, p0, Ll/ۗۛۚ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v3, v5, :cond_2

    .line 206
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܺۤۚ;

    .line 207
    iget-object v6, p0, Ll/ۗۛۚ;->ۗ:Ll/ܺۤۚ;

    if-ne v5, v6, :cond_0

    .line 208
    new-instance v5, Ll/ܺۤۚ;

    iget-object v6, p0, Ll/ۗۛۚ;->᩹:Ll/᩹ۛۚ;

    invoke-direct {v5, v3, v6}, Ll/ܺۤۚ;-><init>(ILl/ۖۤۚ;)V

    .line 209
    invoke-virtual {v4, v3, v5}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 211
    :cond_0
    invoke-virtual {v5}, Ll/ܺۤۚ;->֫()Z

    move-result v4

    if-nez v4, :cond_1

    .line 212
    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    new-array v5, v1, [Ljava/lang/Object;

    aput-object v4, v5, v0

    const-string v4, "Constant #{0} not declared"

    .line 213
    invoke-virtual {v2, v4, v5}, Ll/ۘۨۚ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ۧ(Ll/ܶۛۚ;)V
    .locals 3

    .line 110
    iget-object v0, p1, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ll/ۜۗۚ;

    .line 111
    iget-object v1, v0, Ll/ۜۗۚ;->᩸:Ljava/lang/Object;

    check-cast v1, Ll/ܺۤۚ;

    invoke-direct {p0, v1}, Ll/ۗۛۚ;->ܿ(Ll/ܺۤۚ;)Z

    move-result v1

    iget-object v2, p0, Ll/ۗۛۚ;->᩶:Ll/ۘۨۚ;

    if-eqz v1, :cond_0

    .line 112
    new-instance v1, Ll/᩵ۤۚ;

    invoke-direct {v1, v0, p1}, Ll/᩵ۤۚ;-><init>(Ll/ۜۗۚ;Ll/ܶۛۚ;)V

    invoke-virtual {v2, v1}, Ll/᩶ۗۚ;->֫(Ljava/util/function/Supplier;)V

    .line 114
    :cond_0
    iget-object v1, v0, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    check-cast v1, Ll/ܺۤۚ;

    invoke-direct {p0, v1}, Ll/ۗۛۚ;->ܿ(Ll/ܺۤۚ;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 115
    new-instance v1, Ll/֡ۤۚ;

    invoke-direct {v1, v0, p1}, Ll/֡ۤۚ;-><init>(Ll/ۜۗۚ;Ll/ܶۛۚ;)V

    invoke-virtual {v2, v1}, Ll/᩶ۗۚ;->֫(Ljava/util/function/Supplier;)V

    :cond_1
    return-void
.end method

.method public final ۧ(Ll/ܺۤۚ;)V
    .locals 3

    if-eqz p1, :cond_4

    .line 577
    invoke-virtual {p1}, Ll/ܺۤۚ;->ᩳ()Ll/ۧۤۚ;

    move-result-object v0

    sget-object v1, Ll/ۧۤۚ;->᩺:Ll/ۧۤۚ;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_3

    .line 578
    iget-object v0, p1, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    if-eqz v0, :cond_1

    .line 579
    check-cast v0, Ll/ܳۛۚ;

    iget-object v0, v0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ll/ܺۤۚ;

    .line 597
    iget-object v1, v0, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    check-cast v1, Ll/᩹ۛۚ;

    iget-object v1, v1, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    if-eqz v1, :cond_0

    .line 598
    check-cast v1, Ljava/lang/String;

    const-string v2, "java/"

    .line 599
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_4

    const-string v2, "javax/"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 582
    :cond_0
    iget v2, v0, Ll/ۜۨۚ;->᩸:I

    .line 584
    :cond_1
    iget p1, p1, Ll/ۜۨۚ;->᩸:I

    .line 585
    invoke-direct {p0, p1}, Ll/ۗۛۚ;->ܿ(I)V

    if-le p1, v2, :cond_2

    goto :goto_0

    :cond_2
    add-int/lit8 v2, v2, -0x1

    .line 586
    :goto_0
    invoke-direct {p0, v2}, Ll/ۗۛۚ;->ܿ(I)V

    return-void

    :cond_3
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v2

    .line 588
    iget-object p1, p0, Ll/ۗۛۚ;->᩶:Ll/ۘۨۚ;

    const-string v1, "Cannot delete Constant Pool entry \"{0}\" because only class cells are accepted"

    invoke-virtual {p1, v1, v0}, Ll/ۘۨۚ;->ܿ(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public final ۧ(Ll/ܿۛۚ;)V
    .locals 2

    .line 103
    iget-object v0, p1, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ll/ܺۤۚ;

    .line 104
    invoke-direct {p0, v0}, Ll/ۗۛۚ;->ܿ(Ll/ܺۤۚ;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 105
    new-instance v1, Ll/ᩴۤۚ;

    invoke-direct {v1, v0, p1}, Ll/ᩴۤۚ;-><init>(Ll/ܺۤۚ;Ll/ܿۛۚ;)V

    iget-object p1, p0, Ll/ۗۛۚ;->᩶:Ll/ۘۨۚ;

    invoke-virtual {p1, v1}, Ll/᩶ۗۚ;->֫(Ljava/util/function/Supplier;)V

    :cond_0
    return-void
.end method

.method public final ܳ()V
    .locals 7

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    .line 402
    iget-object v2, p0, Ll/ۗۛۚ;->᩶:Ll/ۘۨۚ;

    const-string v3, "itemizePool"

    invoke-virtual {v2, v3, v1}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 403
    invoke-static {}, Ll/ۙۛۚ;->values()[Ll/ۙۛۚ;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 404
    iget-object v5, p0, Ll/ۗۛۚ;->᩸:Ljava/util/LinkedHashMap;

    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v5

    invoke-static {v5}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v5

    new-instance v6, Ll/ۙۤۚ;

    invoke-direct {v6, v4}, Ll/ۙۤۚ;-><init>(Ll/ۙۛۚ;)V

    invoke-interface {v5, v6}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v4

    invoke-interface {v4}, Ll/ܿ᩺ᩴ;->toList()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܺۤۚ;

    .line 407
    invoke-direct {p0, v5}, Ll/ۗۛۚ;->ܳ(Ll/ܺۤۚ;)Ll/ܺۤۚ;

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 410
    :cond_1
    invoke-virtual {p0, v0}, Ll/ۗۛۚ;->ۧ(I)Ll/ܺۤۚ;

    move-result-object v1

    .line 411
    iput v0, v1, Ll/ۜۨۚ;->᩸:I

    return-void
.end method

.method public final ܽ(Ll/ܺۤۚ;)Ll/ܺۤۚ;
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 415
    iget-object v1, p0, Ll/ۗۛۚ;->᩶:Ll/ۘۨۚ;

    const-string v2, "itemizeCell"

    invoke-virtual {v1, v2, v0}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 416
    invoke-virtual {p1}, Ll/ܺۤۚ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, Ll/ۗۛۚ;->ܳ(Ll/ܺۤۚ;)Ll/ܺۤۚ;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ()V
    .locals 4

    .line 195
    iget-object v0, p0, Ll/ۗۛۚ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    iget-object v1, p0, Ll/ۗۛۚ;->᩶:Ll/ۘۨۚ;

    const-string v3, "fixIndexesInPool: Fixing CP for %d explicit Constant Entries."

    invoke-virtual {v1, v3, v2}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺۤۚ;

    .line 234
    iget-object v1, v1, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    if-eqz v1, :cond_0

    .line 236
    iget-object v2, p0, Ll/ۗۛۚ;->ۙ:Ll/ᩴ۫ۚ;

    check-cast v2, Ll/֫ۛۚ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v1}, Ll/ۖ۫ۚ;->֫(Ll/ᩴ۫ۚ;Ll/ۖۤۚ;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ܿ()Ll/᩷ۗۚ;
    .locals 4

    .line 251
    new-instance v0, Ll/᩷ۗۚ;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, p0, Ll/ۗۛۚ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Ll/᩷ۗۚ;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public final ᩳ(I)Ll/ܺۤۚ;
    .locals 1

    .line 331
    iget-object v0, p0, Ll/ۗۛۚ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܺۤۚ;

    return-object p1
.end method

.method public final ᩳ()V
    .locals 4

    .line 183
    iget-object v0, p0, Ll/ۗۛۚ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    iget-object v1, p0, Ll/ۗۛۚ;->᩶:Ll/ۘۨۚ;

    const-string v3, "fixRefsInPool: Fixing CP for %d explicit Constant Entries"

    invoke-virtual {v1, v3, v2}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺۤۚ;

    .line 223
    iget-object v1, v1, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    if-eqz v1, :cond_0

    .line 225
    iget-object v2, p0, Ll/ۗۛۚ;->۫:Ll/ᩴ۫ۚ;

    check-cast v2, Ll/ۧۛۚ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v1}, Ll/ۖ۫ۚ;->֫(Ll/ᩴ۫ۚ;Ll/ۖۤۚ;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ᩻()V
    .locals 6

    .line 245
    iget-object v0, p0, Ll/ۗۛۚ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܺۤۚ;

    add-int/lit8 v4, v2, 0x1

    .line 246
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v2, v5, v1

    const/4 v2, 0x1

    aput-object v3, v5, v2

    const-string v2, " const #%4d: %s"

    .line 19
    invoke-static {v2, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-array v3, v1, [Ljava/lang/Object;

    .line 246
    iget-object v5, p0, Ll/ۗۛۚ;->᩶:Ll/ۘۨۚ;

    invoke-virtual {v5, v2, v3}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    move v2, v4

    goto :goto_0

    :cond_0
    return-void
.end method
