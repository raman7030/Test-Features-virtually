.class public final enum Ll/᩻ۜ֡;
.super Ljava/lang/Enum;
.source "D971"


# static fields
.field public static final enum ۙ:Ll/᩻ۜ֡;

.field public static final enum ᩶:Ll/᩻ۜ֡;

.field public static final synthetic ᩸:[Ll/᩻ۜ֡;

.field public static final enum ᩹:Ll/᩻ۜ֡;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 46
    new-instance v0, Ll/᩻ۜ֡;

    const-string v1, "SLL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/᩻ۜ֡;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/᩻ۜ֡;->ۙ:Ll/᩻ۜ֡;

    .line 65
    new-instance v0, Ll/᩻ۜ֡;

    const-string v1, "LL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll/᩻ۜ֡;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/᩻ۜ֡;->᩹:Ll/᩻ۜ֡;

    .line 83
    new-instance v0, Ll/᩻ۜ֡;

    const-string v1, "LL_EXACT_AMBIG_DETECTION"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ll/᩻ۜ֡;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/᩻ۜ֡;->᩶:Ll/᩻ۜ֡;

    .line 24
    invoke-static {}, Ll/᩻ۜ֡;->֫()[Ll/᩻ۜ֡;

    move-result-object v0

    sput-object v0, Ll/᩻ۜ֡;->᩸:[Ll/᩻ۜ֡;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/᩻ۜ֡;
    .locals 1

    .line 24
    const-class v0, Ll/᩻ۜ֡;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/᩻ۜ֡;

    return-object p0
.end method

.method public static values()[Ll/᩻ۜ֡;
    .locals 1

    .line 24
    sget-object v0, Ll/᩻ۜ֡;->᩸:[Ll/᩻ۜ֡;

    invoke-virtual {v0}, [Ll/᩻ۜ֡;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩻ۜ֡;

    return-object v0
.end method

.method public static ֫(Ljava/util/Collection;)Z
    .locals 0

    .line 441
    invoke-static {p0}, Ll/᩻ۜ֡;->᩻(Ljava/util/Collection;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static ֫(Ll/۬ܳ֡;)Z
    .locals 1

    .line 359
    iget-object p0, p0, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 278
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹ܳ֡;

    .line 279
    iget-object v0, v0, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    instance-of v0, v0, Ll/ۢۜ֡;

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static ֫(Ll/᩻ۜ֡;Ll/۬ܳ֡;)Z
    .locals 5

    .line 218
    invoke-static {p1}, Ll/᩻ۜ֡;->֫(Ll/۬ܳ֡;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 223
    :cond_0
    sget-object v0, Ll/᩻ۜ֡;->ۙ:Ll/᩻ۜ֡;

    if-ne p0, v0, :cond_2

    .line 227
    iget-boolean p0, p1, Ll/۬ܳ֡;->ۤ:Z

    if-eqz p0, :cond_2

    .line 229
    new-instance p0, Ll/۬ܳ֡;

    invoke-direct {p0}, Ll/۬ܳ֡;-><init>()V

    .line 359
    iget-object p1, p1, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 230
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹ܳ֡;

    .line 231
    new-instance v1, Ll/᩹ܳ֡;

    sget-object v2, Ll/ۖۜ֡;->֫:Ll/ۖۜ֡;

    .line 109
    iget-object v3, v0, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    iget-object v4, v0, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    invoke-direct {v1, v0, v3, v4, v2}, Ll/᩹ܳ֡;-><init>(Ll/᩹ܳ֡;Ll/᩺ܳ֡;Ll/ܽۜ֡;Ll/ۚۜ֡;)V

    const/4 v0, 0x0

    .line 132
    invoke-virtual {p0, v1, v0}, Ll/۬ܳ֡;->֫(Ll/᩹ܳ֡;Ll/ۧ᩷֡;)V

    goto :goto_0

    :cond_1
    move-object p1, p0

    .line 241
    :cond_2
    invoke-static {p1}, Ll/᩻ۜ֡;->ܽ(Ll/۬ܳ֡;)Ljava/util/Collection;

    move-result-object p0

    .line 243
    invoke-static {p0}, Ll/᩻ۜ֡;->ܳ(Ljava/util/Collection;)Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {p1}, Ll/᩻ۜ֡;->ܳ(Ll/۬ܳ֡;)Z

    move-result p0

    if-nez p0, :cond_3

    :goto_1
    const/4 p0, 0x1

    return p0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic ֫()[Ll/᩻ۜ֡;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ll/᩻ۜ֡;

    .line 24
    sget-object v1, Ll/᩻ۜ֡;->ۙ:Ll/᩻ۜ֡;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/᩻ۜ֡;->᩹:Ll/᩻ۜ֡;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/᩻ۜ֡;->᩶:Ll/᩻ۜ֡;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static ۜ(Ljava/util/Collection;)I
    .locals 0

    .line 429
    invoke-static {p0}, Ll/᩻ۜ֡;->ᩳ(Ljava/util/Collection;)I

    move-result p0

    return p0
.end method

.method public static ۧ(Ll/۬ܳ֡;)Ljava/util/BitSet;
    .locals 2

    .line 530
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    .line 359
    iget-object p0, p0, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 531
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹ܳ֡;

    .line 532
    iget v1, v1, Ll/᩹ܳ֡;->֫:I

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static ۧ(Ljava/util/Collection;)Z
    .locals 2

    .line 486
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 487
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/BitSet;

    .line 488
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 489
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/BitSet;

    .line 490
    invoke-virtual {v1, v0}, Ljava/util/BitSet;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static ܳ(Ljava/util/Collection;)Z
    .locals 2

    .line 470
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/BitSet;

    .line 471
    invoke-virtual {v0}, Ljava/util/BitSet;->cardinality()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    return v1

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static ܳ(Ll/۬ܳ֡;)Z
    .locals 2

    .line 581
    invoke-static {p0}, Ll/᩻ۜ֡;->ᩳ(Ll/۬ܳ֡;)Ljava/util/Map;

    move-result-object p0

    .line 582
    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/BitSet;

    .line 583
    invoke-virtual {v0}, Ljava/util/BitSet;->cardinality()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static ܽ(Ljava/util/Collection;)Ljava/util/BitSet;
    .locals 2

    .line 517
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    .line 518
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/BitSet;

    .line 519
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static ܽ(Ll/۬ܳ֡;)Ljava/util/Collection;
    .locals 3

    .line 547
    new-instance v0, Ll/ܳۜ֡;

    .line 88
    sget-object v1, Ll/ܿۜ֡;->ۧ:Ll/ܿۜ֡;

    invoke-direct {v0, v1}, Ll/ᩳ᩷֡;-><init>(Ll/ۖ᩹ۢ;)V

    .line 359
    iget-object p0, p0, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 548
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹ܳ֡;

    .line 549
    invoke-virtual {v0, v1}, Ll/ᩳ᩷֡;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/BitSet;

    if-nez v2, :cond_0

    .line 551
    new-instance v2, Ljava/util/BitSet;

    invoke-direct {v2}, Ljava/util/BitSet;-><init>()V

    .line 552
    invoke-virtual {v0, v1, v2}, Ll/ᩳ᩷֡;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 554
    :cond_0
    iget v1, v1, Ll/᩹ܳ֡;->֫:I

    invoke-virtual {v2, v1}, Ljava/util/BitSet;->set(I)V

    goto :goto_0

    .line 556
    :cond_1
    invoke-virtual {v0}, Ll/ᩳ᩷֡;->values()Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method public static ܿ(Ljava/util/Collection;)I
    .locals 3

    .line 503
    invoke-static {p0}, Ll/᩻ۜ֡;->ܽ(Ljava/util/Collection;)Ljava/util/BitSet;

    move-result-object p0

    .line 504
    invoke-virtual {p0}, Ljava/util/BitSet;->cardinality()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result p0

    return p0

    :cond_0
    return v2
.end method

.method public static ܿ(Ll/۬ܳ֡;)Z
    .locals 1

    .line 359
    iget-object p0, p0, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 258
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹ܳ֡;

    .line 259
    iget-object v0, v0, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    instance-of v0, v0, Ll/ۢۜ֡;

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static ᩳ(Ljava/util/Collection;)I
    .locals 4

    .line 589
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    .line 590
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/BitSet;

    .line 591
    invoke-virtual {v1, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v1

    .line 592
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 593
    invoke-virtual {v0}, Ljava/util/BitSet;->cardinality()I

    move-result v1

    const/4 v3, 0x1

    if-le v1, v3, :cond_0

    return v2

    .line 597
    :cond_1
    invoke-virtual {v0, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result p0

    return p0
.end method

.method public static ᩳ(Ll/۬ܳ֡;)Ljava/util/Map;
    .locals 4

    .line 568
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 359
    iget-object p0, p0, Ll/۬ܳ֡;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 569
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹ܳ֡;

    .line 570
    iget-object v2, v1, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/BitSet;

    if-nez v2, :cond_0

    .line 572
    new-instance v2, Ljava/util/BitSet;

    invoke-direct {v2}, Ljava/util/BitSet;-><init>()V

    .line 573
    iget-object v3, v1, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 575
    :cond_0
    iget v1, v1, Ll/᩹ܳ֡;->֫:I

    invoke-virtual {v2, v1}, Ljava/util/BitSet;->set(I)V

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static ᩻(Ljava/util/Collection;)Z
    .locals 2

    .line 453
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/BitSet;

    .line 454
    invoke-virtual {v0}, Ljava/util/BitSet;->cardinality()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_1
    const/4 p0, 0x0

    return p0
.end method
