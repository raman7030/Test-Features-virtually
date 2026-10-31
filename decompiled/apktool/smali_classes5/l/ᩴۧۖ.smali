.class public final Ll/ᩴۧۖ;
.super Ll/֫֫ۖ;
.source "57O6"


# instance fields
.field public final ۖ:Ljava/util/ArrayList;

.field public ۘ:I

.field public final ۜ:Ll/᩶֫ۖ;

.field public ۡ:Ljava/lang/StringBuilder;

.field public ۢ:I

.field public final ܳ:Ll/֡֫ۖ;

.field public final ܺ:Ljava/lang/String;

.field public final ܿ:Ljava/util/HashMap;

.field public final ᩴ:Ll/᩹ۨܺ;

.field public ᩵:Ljava/lang/StringBuilder;

.field public final ᩷:I

.field public ᩻:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/᩶֫ۖ;Ll/֡֫ۖ;)V
    .locals 2

    .line 26
    invoke-direct {p0}, Ll/᩶۟ܺ;-><init>()V

    .line 54
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ᩴۧۖ;->ܿ:Ljava/util/HashMap;

    .line 55
    invoke-static {}, Ll/᩹ۨܺ;->ۧ()Ll/᩹ۨܺ;

    move-result-object v0

    iput-object v0, p0, Ll/ᩴۧۖ;->ᩴ:Ll/᩹ۨܺ;

    .line 57
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ᩴۧۖ;->ۖ:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 59
    iput v0, p0, Ll/ᩴۧۖ;->᩻:I

    const/4 v1, -0x1

    .line 60
    iput v1, p0, Ll/ᩴۧۖ;->ۢ:I

    .line 61
    iput v0, p0, Ll/ᩴۧۖ;->ۘ:I

    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/ᩴۧۖ;->ۡ:Ljava/lang/StringBuilder;

    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/ᩴۧۖ;->᩵:Ljava/lang/StringBuilder;

    .line 72
    iput-object p1, p0, Ll/ᩴۧۖ;->ܺ:Ljava/lang/String;

    .line 73
    iput-object p2, p0, Ll/ᩴۧۖ;->ۜ:Ll/᩶֫ۖ;

    .line 74
    iput-object p3, p0, Ll/ᩴۧۖ;->ܳ:Ll/֡֫ۖ;

    .line 75
    invoke-virtual {p2}, Ll/᩶֫ۖ;->ܿ()I

    move-result p1

    iput p1, p0, Ll/ᩴۧۖ;->᩷:I

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    .locals 4

    .line 342
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 343
    new-instance p1, Ll/ۧۨ᩷;

    const/4 v1, 0x7

    invoke-direct {p1, v1}, Ll/ۧۨ᩷;-><init>(I)V

    invoke-static {p1}, Ll/۠۬ᩴ;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object p1

    invoke-static {p1}, Ll/ܶ۬ᩴ;->reversed(Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 344
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 345
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙۧۖ;

    .line 347
    invoke-virtual {v1}, Ll/ۙۧۖ;->֫()Ll/ܰۤܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܰۤܺ;->ۧ()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 348
    invoke-virtual {v1}, Ll/ۙۧۖ;->֫()Ll/ܰۤܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܰۤܺ;->ܽ()Ljava/lang/Comparable;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 349
    invoke-virtual {v1}, Ll/ۙۧۖ;->ۧ()Ljava/lang/String;

    move-result-object v1

    .line 346
    invoke-virtual {p1, v2, v3, v1}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v0, "\n"

    .line 351
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_1

    .line 352
    :goto_1
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result p0

    const/16 v0, 0xa

    if-ne p0, v0, :cond_1

    .line 353
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 356
    :cond_1
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/᩸۟ܺ;)Ll/ܶ۟ܺ;
    .locals 3

    .line 386
    invoke-interface {p0}, Ll/᩸۟ܺ;->ܽ()Ll/ܳ۬ܺ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1

    .line 387
    invoke-interface {p0}, Ll/᩸۟ܺ;->ܽ()Ll/ܳ۬ܺ;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ۟ܺ;

    .line 388
    invoke-interface {v1}, Ll/ܶ۟ܺ;->getIndex()I

    move-result v2

    if-ltz v2, :cond_0

    return-object v1

    .line 392
    :cond_1
    invoke-interface {p0}, Ll/᩸۟ܺ;->֫()Ll/ܶ۟ܺ;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/᩸۟ܺ;)Ll/ܶ۟ܺ;
    .locals 3

    .line 374
    invoke-interface {p0}, Ll/᩸۟ܺ;->ۧ()Ll/ܳ۬ܺ;

    move-result-object v0

    const/4 v1, 0x0

    .line 375
    invoke-virtual {v0, v1}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v0

    .line 374
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ۟ܺ;

    .line 375
    invoke-interface {v1}, Ll/ܶ۟ܺ;->getIndex()I

    move-result v2

    if-ltz v2, :cond_0

    return-object v1

    .line 379
    :cond_1
    invoke-interface {p0}, Ll/᩸۟ܺ;->֫()Ll/ܶ۟ܺ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 405
    invoke-static {p0}, Ll/ܺܶܺ;->֫(Ljava/lang/Object;)Ll/ۡܶܺ;

    move-result-object v0

    const-string v1, "iLine"

    iget v2, p0, Ll/ᩴۧۖ;->᩻:I

    .line 406
    invoke-virtual {v0, v1, v2}, Ll/ۡܶܺ;->֫(Ljava/lang/String;I)V

    const-string v1, "lastK"

    iget v2, p0, Ll/ᩴۧۖ;->ۢ:I

    .line 407
    invoke-virtual {v0, v1, v2}, Ll/ۡܶܺ;->֫(Ljava/lang/String;I)V

    iget-object v1, p0, Ll/ᩴۧۖ;->᩵:Ljava/lang/StringBuilder;

    .line 408
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\t"

    const-string v3, "\\t"

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "spacesPending"

    invoke-virtual {v0, v1, v2}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "newlinesPending"

    iget v2, p0, Ll/ᩴۧۖ;->ۘ:I

    .line 409
    invoke-virtual {v0, v1, v2}, Ll/ۡܶܺ;->֫(Ljava/lang/String;I)V

    const-string v1, "blankLines"

    iget-object v2, p0, Ll/ᩴۧۖ;->ܿ:Ljava/util/HashMap;

    .line 410
    invoke-virtual {v0, v2, v1}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "super"

    .line 411
    invoke-super {p0}, Ll/֫֫ۖ;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 412
    invoke-virtual {v0}, Ll/ۡܶܺ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩹ۨܺ;)Ll/ܳ۬ܺ;
    .locals 14

    .line 216
    sget v0, Ll/ܳ۬ܺ;->᩹:I

    .line 726
    new-instance v0, Ll/֫۬ܺ;

    invoke-direct {v0}, Ll/֫۬ܺ;-><init>()V

    .line 217
    invoke-static {p0}, Ll/᩶۟ܺ;->֫(Ll/ᩴۧۖ;)Ljava/util/HashMap;

    move-result-object v1

    .line 220
    invoke-static {}, Ll/᩹ۨܺ;->ۧ()Ll/᩹ۨܺ;

    move-result-object v2

    const/4 v3, 0x0

    .line 221
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget-object v5, p0, Ll/ᩴۧۖ;->ۜ:Ll/᩶֫ۖ;

    invoke-virtual {v5}, Ll/᩶֫ۖ;->ܿ()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Ll/ܰۤܺ;->֫(Ljava/lang/Integer;Ljava/lang/Integer;)Ll/ܰۤܺ;

    move-result-object v4

    invoke-virtual {p1, v4}, Ll/᩹ۨܺ;->ۧ(Ll/ܰۤܺ;)Ll/֫ۛܺ;

    move-result-object p1

    .line 222
    check-cast p1, Ll/᩹ۨܺ;

    invoke-virtual {p1}, Ll/᩹ۨܺ;->֫()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܰۤܺ;

    .line 223
    invoke-static {}, Ll/᩵ۗܺ;->֫()Ll/᩵ۗܺ;

    move-result-object v6

    invoke-virtual {v4, v6}, Ll/ܰۤܺ;->֫(Ll/᩵ۗܺ;)Ll/ܰۤܺ;

    move-result-object v4

    .line 329
    invoke-virtual {v4}, Ll/ܰۤܺ;->ۧ()Ljava/lang/Comparable;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    invoke-virtual {v4}, Ll/ܰۤܺ;->ܽ()Ljava/lang/Comparable;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    .line 333
    iget-object v7, p0, Ll/ᩴۧۖ;->ᩴ:Ll/᩹ۨܺ;

    invoke-virtual {v7, v6}, Ll/᩹ۨܺ;->ۧ(Ljava/lang/Integer;)Z

    move-result v8

    sget-object v9, Ll/᩶۟ܺ;->ܽ:Ll/ܰۤܺ;

    if-eqz v8, :cond_1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v7, v8}, Ll/᩹ۨܺ;->ۧ(Ljava/lang/Integer;)Z

    move-result v8

    if-nez v8, :cond_0

    goto :goto_1

    .line 336
    :cond_0
    invoke-virtual {v7, v6}, Ll/᩹ۨܺ;->֫(Ljava/lang/Integer;)Ll/ܰۤܺ;

    move-result-object v6

    invoke-virtual {v6}, Ll/ܰۤܺ;->ۧ()Ljava/lang/Comparable;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 337
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v7, v4}, Ll/᩹ۨܺ;->֫(Ljava/lang/Integer;)Ll/ܰۤܺ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ܰۤܺ;->ܽ()Ljava/lang/Comparable;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    .line 338
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v6, v4}, Ll/ܰۤܺ;->ۧ(Ljava/lang/Integer;Ljava/lang/Integer;)Ll/ܰۤܺ;

    move-result-object v4

    goto :goto_2

    :cond_1
    :goto_1
    move-object v4, v9

    .line 224
    :goto_2
    invoke-virtual {v4, v9}, Ll/ܰۤܺ;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_0

    .line 228
    :cond_2
    invoke-virtual {v2, v4}, Ll/᩹ۨܺ;->֫(Ll/ܰۤܺ;)V

    goto :goto_0

    .line 232
    :cond_3
    invoke-virtual {v2}, Ll/᩹ۨܺ;->֫()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ll/᩹ۗܺ;

    invoke-virtual {p1}, Ll/᩹ۗܺ;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰۤܺ;

    .line 234
    invoke-virtual {v2}, Ll/ܰۤܺ;->ۧ()Ljava/lang/Comparable;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v5, v4}, Ll/᩶֫ۖ;->ܿ(I)Ll/᩸۟ܺ;

    move-result-object v4

    invoke-static {v4}, Ll/ᩴۧۖ;->ۧ(Ll/᩸۟ܺ;)Ll/ܶ۟ܺ;

    move-result-object v4

    .line 235
    invoke-virtual {v2}, Ll/ܰۤܺ;->ܽ()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v5, v2}, Ll/᩶֫ۖ;->ܿ(I)Ll/᩸۟ܺ;

    move-result-object v2

    invoke-static {v2}, Ll/ᩴۧۖ;->֫(Ll/᩸۟ܺ;)Ll/ܶ۟ܺ;

    move-result-object v2

    .line 238
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 240
    invoke-interface {v4}, Ll/ܶ۟ܺ;->getPosition()I

    move-result v7

    :goto_4
    if-lez v7, :cond_5

    .line 243
    invoke-virtual {v5}, Ll/᩶֫ۖ;->ܽ()Ljava/lang/String;

    move-result-object v8

    add-int/lit8 v9, v7, -0x1

    invoke-virtual {v8, v9}, Ljava/lang/String;->charAt(I)C

    move-result v8

    .line 244
    invoke-static {}, Ll/ۨ۠ܺ;->ᩳ()Ll/ۨ۠ܺ;

    move-result-object v9

    invoke-virtual {v9, v8}, Ll/ۨ۠ܺ;->֫(C)Z

    move-result v8

    if-nez v8, :cond_4

    goto :goto_5

    :cond_4
    add-int/lit8 v7, v7, -0x1

    goto :goto_4

    .line 250
    :cond_5
    :goto_5
    invoke-interface {v4}, Ll/ܶ۟ܺ;->getIndex()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܰۤܺ;

    invoke-virtual {v4}, Ll/ܰۤܺ;->ۧ()Ljava/lang/Comparable;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    :goto_6
    if-lez v4, :cond_6

    add-int/lit8 v8, v4, -0x1

    .line 253
    invoke-virtual {p0, v8}, Ll/᩶۟ܺ;->֫(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_6

    add-int/lit8 v4, v4, -0x1

    goto :goto_6

    .line 257
    :cond_6
    :goto_7
    invoke-interface {v2}, Ll/ܶ۟ܺ;->getIndex()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v1, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܰۤܺ;

    invoke-virtual {v8}, Ll/ܰۤܺ;->ܽ()Ljava/lang/Comparable;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v9, p0, Ll/ᩴۧۖ;->ܺ:Ljava/lang/String;

    if-ge v4, v8, :cond_9

    .line 260
    invoke-virtual {p0}, Ll/᩶۟ܺ;->֫()I

    move-result v8

    if-ge v4, v8, :cond_8

    if-lez v4, :cond_7

    .line 262
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    :cond_7
    invoke-virtual {p0, v4}, Ll/᩶۟ܺ;->֫(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    add-int/lit8 v4, v4, 0x1

    goto :goto_7

    .line 268
    :cond_9
    invoke-interface {v2}, Ll/ܶ۟ܺ;->getPosition()I

    move-result v8

    invoke-interface {v2}, Ll/ܶ۟ܺ;->length()I

    move-result v10

    add-int/2addr v10, v8

    invoke-virtual {v5}, Ll/᩶֫ۖ;->ܽ()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    invoke-static {v10, v8}, Ljava/lang/Math;->min(II)I

    move-result v8

    .line 271
    invoke-interface {v2}, Ll/ܶ۟ܺ;->getIndex()I

    move-result v2

    invoke-virtual {v5}, Ll/᩶֫ۖ;->ܿ()I

    move-result v10

    add-int/lit8 v10, v10, -0x1

    if-ne v2, v10, :cond_a

    .line 272
    invoke-virtual {v5}, Ll/᩶֫ۖ;->ܽ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v8

    :cond_a
    const/4 v2, -0x1

    const/4 v10, -0x1

    .line 279
    :goto_8
    invoke-virtual {v5}, Ll/᩶֫ۖ;->ܽ()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v11

    if-ge v8, v11, :cond_d

    .line 280
    invoke-virtual {v5}, Ll/᩶֫ۖ;->ܽ()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11, v8}, Ljava/lang/String;->charAt(I)C

    move-result v11

    .line 281
    invoke-static {}, Ll/ۨ۠ܺ;->ᩳ()Ll/ۨ۠ܺ;

    move-result-object v12

    invoke-virtual {v12, v11}, Ll/ۨ۠ܺ;->֫(C)Z

    move-result v11

    if-nez v11, :cond_b

    goto :goto_9

    .line 284
    :cond_b
    invoke-virtual {v5}, Ll/᩶֫ۖ;->ܽ()Ljava/lang/String;

    move-result-object v11

    invoke-static {v8, v11}, Ll/۬۟ܺ;->֫(ILjava/lang/String;)I

    move-result v11

    if-eq v11, v2, :cond_c

    add-int v10, v11, v8

    move v13, v10

    move v10, v8

    move v8, v13

    goto :goto_8

    :cond_c
    add-int/lit8 v8, v8, 0x1

    goto :goto_8

    :cond_d
    :goto_9
    if-eq v10, v2, :cond_e

    move v8, v10

    :cond_e
    if-ne v10, v2, :cond_f

    .line 299
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    :cond_f
    :goto_a
    invoke-virtual {p0}, Ll/᩶۟ܺ;->֫()I

    move-result v11

    if-ge v4, v11, :cond_11

    .line 302
    invoke-virtual {p0, v4}, Ll/᩶۟ܺ;->֫(I)Ljava/lang/String;

    move-result-object v11

    .line 303
    invoke-static {}, Ll/ۨ۠ܺ;->ᩳ()Ll/ۨ۠ܺ;

    move-result-object v12

    invoke-virtual {v12}, Ll/ۨ۠ܺ;->֫()Ll/ۨ۠ܺ;

    move-result-object v12

    invoke-virtual {v12, v11}, Ll/ۨ۠ܺ;->ۧ(Ljava/lang/CharSequence;)I

    move-result v12

    if-ne v12, v2, :cond_10

    .line 306
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_a

    :cond_10
    if-ne v10, v2, :cond_11

    .line 310
    invoke-virtual {v6, v11, v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 316
    :cond_11
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v7, v8, v2}, Ll/ۙۧۖ;->֫(IILjava/lang/String;)Ll/ۙۧۖ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    goto/16 :goto_3

    .line 318
    :cond_12
    invoke-virtual {v0}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(ILl/᩺۟ܺ;)V
    .locals 2

    .line 80
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Ll/ᩴۧۖ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 81
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩺۟ܺ;

    invoke-virtual {p1, p2}, Ll/᩺۟ܺ;->֫(Ll/᩺۟ܺ;)Ll/᩺۟ܺ;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 83
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ll/ܰۤܺ;Ljava/lang/String;)V
    .locals 7

    .line 97
    invoke-virtual {p1}, Ll/ܰۤܺ;->֫()Z

    move-result v0

    if-nez v0, :cond_5

    .line 100
    iget-object v0, p0, Ll/ᩴۧۖ;->ۜ:Ll/᩶֫ۖ;

    invoke-virtual {v0}, Ll/᩶۟ܺ;->֫()I

    move-result v1

    const/4 v2, 0x0

    .line 101
    :goto_0
    iget v3, p0, Ll/ᩴۧۖ;->᩻:I

    if-ge v3, v1, :cond_2

    .line 102
    invoke-virtual {v0, v3}, Ll/᩶۟ܺ;->ۧ(I)Ll/ܰۤܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܰۤܺ;->֫()Z

    move-result v3

    if-nez v3, :cond_0

    iget v3, p0, Ll/ᩴۧۖ;->᩻:I

    .line 103
    invoke-virtual {v0, v3}, Ll/᩶۟ܺ;->ۧ(I)Ll/ܰۤܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܰۤܺ;->ܽ()Ljava/lang/Comparable;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {p1}, Ll/ܰۤܺ;->ۧ()Ljava/lang/Comparable;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-gt v3, v4, :cond_2

    .line 104
    :cond_0
    iget v3, p0, Ll/ᩴۧۖ;->᩻:I

    invoke-virtual {v0, v3}, Ll/᩶۟ܺ;->ۧ(I)Ll/ܰۤܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܰۤܺ;->֫()Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v2, 0x1

    .line 108
    :cond_1
    iget v3, p0, Ll/ᩴۧۖ;->᩻:I

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Ll/ᩴۧۖ;->᩻:I

    goto :goto_0

    .line 114
    :cond_2
    iget v0, p0, Ll/ᩴۧۖ;->ۢ:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ll/᩺۟ܺ;->֫:Ll/᩺۟ܺ;

    iget-object v3, p0, Ll/ᩴۧۖ;->ܿ:Ljava/util/HashMap;

    invoke-static {v3, v0, v1}, Ll/ܰ۬ᩴ;->getOrDefault(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺۟ܺ;

    if-eqz v2, :cond_3

    const-string v1, "//"

    .line 396
    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "/*"

    invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    .line 115
    :cond_3
    invoke-virtual {v0}, Ll/᩺۟ܺ;->֫()Ll/ܽ۫ᩴ;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܽ۫ᩴ;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 116
    :cond_4
    :goto_1
    iget v0, p0, Ll/ᩴۧۖ;->ۘ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ᩴۧۖ;->ۘ:I

    .line 119
    :cond_5
    invoke-static {p2}, Ll/۬۟ܺ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 124
    iget p2, p0, Ll/ᩴۧۖ;->ۘ:I

    if-nez p2, :cond_6

    add-int/lit8 p2, p2, 0x1

    .line 125
    iput p2, p0, Ll/ᩴۧۖ;->ۘ:I

    .line 127
    :cond_6
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iput-object p2, p0, Ll/ᩴۧۖ;->᩵:Ljava/lang/StringBuilder;

    goto/16 :goto_7

    .line 130
    :cond_7
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_2
    if-ge v1, v0, :cond_14

    .line 132
    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x9

    if-eq v3, v4, :cond_12

    const/16 v4, 0xa

    if-eq v3, v4, :cond_11

    const/16 v5, 0xd

    if-eq v3, v5, :cond_10

    const/16 v4, 0x20

    if-eq v3, v4, :cond_f

    .line 150
    :goto_3
    iget v4, p0, Ll/ᩴۧۖ;->ۘ:I

    iget-object v5, p0, Ll/ᩴۧۖ;->ۖ:Ljava/util/ArrayList;

    if-lez v4, :cond_a

    .line 152
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v2, p0, Ll/ᩴۧۖ;->ۡ:Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-lez v2, :cond_9

    .line 153
    :cond_8
    iget-object v2, p0, Ll/ᩴۧۖ;->ۡ:Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    :cond_9
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v2, p0, Ll/ᩴۧۖ;->ۡ:Ljava/lang/StringBuilder;

    .line 157
    iget v2, p0, Ll/ᩴۧۖ;->ۘ:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/ᩴۧۖ;->ۘ:I

    const/4 v2, 0x0

    goto :goto_3

    .line 159
    :cond_a
    iget-object v4, p0, Ll/ᩴۧۖ;->᩵:Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    if-lez v4, :cond_b

    .line 160
    iget-object v4, p0, Ll/ᩴۧۖ;->ۡ:Ljava/lang/StringBuilder;

    iget-object v6, p0, Ll/ᩴۧۖ;->᩵:Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 161
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v4, p0, Ll/ᩴۧۖ;->᩵:Ljava/lang/StringBuilder;

    .line 163
    :cond_b
    iget-object v4, p0, Ll/ᩴۧۖ;->ۡ:Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 164
    invoke-virtual {p1}, Ll/ܰۤܺ;->֫()Z

    move-result v3

    if-nez v3, :cond_13

    if-nez v2, :cond_13

    .line 166
    :goto_4
    iget-object v2, p0, Ll/᩶۟ܺ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-gt v3, v4, :cond_c

    .line 167
    sget-object v3, Ll/ۘ֫ۖ;->ۧ:Ll/ܰۤܺ;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 169
    :cond_c
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܰۤܺ;

    .line 400
    invoke-virtual {v4}, Ll/ܰۤܺ;->֫()Z

    move-result v5

    if-eqz v5, :cond_d

    move-object v4, p1

    goto :goto_5

    :cond_d
    invoke-virtual {p1}, Ll/ܰۤܺ;->֫()Z

    move-result v5

    if-eqz v5, :cond_e

    goto :goto_5

    :cond_e
    invoke-virtual {v4, p1}, Ll/ܰۤܺ;->ᩳ(Ll/ܰۤܺ;)Ll/ܰۤܺ;

    move-result-object v4

    invoke-static {}, Ll/᩵ۗܺ;->֫()Ll/᩵ۗܺ;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll/ܰۤܺ;->֫(Ll/᩵ۗܺ;)Ll/ܰۤܺ;

    move-result-object v4

    .line 169
    :goto_5
    invoke-virtual {v2, v3, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x1

    goto :goto_6

    .line 135
    :cond_f
    iget-object v3, p0, Ll/ᩴۧۖ;->᩵:Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_6

    :cond_10
    add-int/lit8 v3, v1, 0x1

    .line 141
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v3, v5, :cond_11

    invoke-virtual {p2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-ne v5, v4, :cond_11

    move v1, v3

    .line 146
    :cond_11
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v3, p0, Ll/ᩴۧۖ;->᩵:Ljava/lang/StringBuilder;

    .line 147
    iget v3, p0, Ll/ᩴۧۖ;->ۘ:I

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Ll/ᩴۧۖ;->ۘ:I

    goto :goto_6

    .line 138
    :cond_12
    iget-object v3, p0, Ll/ᩴۧۖ;->᩵:Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_13
    :goto_6
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_2

    .line 176
    :cond_14
    :goto_7
    invoke-virtual {p1}, Ll/ܰۤܺ;->֫()Z

    move-result p2

    if-nez p2, :cond_15

    .line 177
    invoke-virtual {p1}, Ll/ܰۤܺ;->ܽ()Ljava/lang/Comparable;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Ll/ᩴۧۖ;->ۢ:I

    :cond_15
    return-void
.end method

.method public final ֫(Ll/᩸۟ܺ;Ll/᩸۟ܺ;)V
    .locals 0

    .line 89
    invoke-static {p1}, Ll/ᩴۧۖ;->ۧ(Ll/᩸۟ܺ;)Ll/ܶ۟ܺ;

    move-result-object p1

    invoke-interface {p1}, Ll/ܶ۟ܺ;->getIndex()I

    move-result p1

    .line 90
    invoke-static {p2}, Ll/ᩴۧۖ;->֫(Ll/᩸۟ܺ;)Ll/ܶ۟ܺ;

    move-result-object p2

    invoke-interface {p2}, Ll/ܶ۟ܺ;->getIndex()I

    move-result p2

    .line 91
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1, p2}, Ll/ܰۤܺ;->֫(Ljava/lang/Integer;Ljava/lang/Integer;)Ll/ܰۤܺ;

    move-result-object p1

    iget-object p2, p0, Ll/ᩴۧۖ;->ᩴ:Ll/᩹ۨܺ;

    invoke-virtual {p2, p1}, Ll/᩹ۨܺ;->֫(Ll/ܰۤܺ;)V

    return-void
.end method

.method public final ۧ()V
    .locals 5

    .line 190
    iget-object v0, p0, Ll/ᩴۧۖ;->ۡ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 191
    invoke-static {}, Ll/ۨ۠ܺ;->ᩳ()Ll/ۨ۠ܺ;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ۨ۠ܺ;->ܽ(Ljava/lang/CharSequence;)Z

    move-result v1

    iget-object v2, p0, Ll/ᩴۧۖ;->ۖ:Ljava/util/ArrayList;

    if-nez v1, :cond_0

    .line 192
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 194
    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 195
    iget v1, p0, Ll/ᩴۧۖ;->᩷:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    add-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v3, v1}, Ll/ܰۤܺ;->ۧ(Ljava/lang/Integer;Ljava/lang/Integer;)Ll/ܰۤܺ;

    move-result-object v1

    .line 196
    :goto_0
    iget-object v3, p0, Ll/᩶۟ܺ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v4, v0, :cond_1

    .line 197
    sget-object v4, Ll/ۘ֫ۖ;->ۧ:Ll/ܰۤܺ;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 199
    :cond_1
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    invoke-static {v2}, Ll/ܳ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/᩶۟ܺ;->ۧ(Ll/ܳ۬ܺ;)V

    return-void
.end method

.method public final ܽ()Ll/ۧ۟ܺ;
    .locals 1

    .line 207
    iget-object v0, p0, Ll/ᩴۧۖ;->ܳ:Ll/֡֫ۖ;

    return-object v0
.end method

.method public final ܽ(I)V
    .locals 2

    .line 183
    iget-object v0, p0, Ll/ᩴۧۖ;->᩵:Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-static {p1, v1}, Ll/ۤܶܺ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method
