.class public final Ll/ۛۧۜ;
.super Ljava/lang/Object;
.source "26KG"


# instance fields
.field public final ֫:I

.field public ۧ:I

.field public final ܽ:Ll/ۘ᩻ܽ;

.field public final ܿ:Ljava/util/HashMap;

.field public final ᩳ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ll/ۘ᩻ܽ;)V
    .locals 3

    .line 281
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 277
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۛۧۜ;->ܿ:Ljava/util/HashMap;

    .line 278
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۛۧۜ;->ᩳ:Ljava/util/HashMap;

    .line 282
    iput-object p1, p0, Ll/ۛۧۜ;->ܽ:Ll/ۘ᩻ܽ;

    .line 283
    invoke-interface {p1}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v0

    iput v0, p0, Ll/ۛۧۜ;->֫:I

    .line 284
    invoke-interface {p1}, Ll/ۘ᩻ܽ;->ۜۧ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۛۧۜ;->ۧ:I

    .line 285
    invoke-interface {p1}, Ll/ۘ᩻ܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡᩻ܽ;

    .line 286
    iget-object v1, p0, Ll/ۛۧۜ;->ᩳ:Ljava/util/HashMap;

    invoke-interface {v0}, Ll/֡᩻ܽ;->ۘ֫()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    .line 287
    iget v1, p0, Ll/ۛۧۜ;->ۧ:I

    invoke-interface {v0}, Ll/֡᩻ܽ;->ۘ֫()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Ll/ۛۧۜ;->ۧ:I

    goto :goto_0

    :cond_0
    const-string p1, "RESOURCE_TARGET_AMBIGUOUS"

    const-string v0, "Duplicate type IDs prevent adding resources safely."

    .line 286
    invoke-static {p1, v0}, Ll/۟ۧۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    :cond_1
    return-void
.end method


# virtual methods
.method public final ֫(I)Ll/ܰۧۜ;
    .locals 10

    .line 293
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Ll/ۛۧۜ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܰۧۜ;

    if-nez v0, :cond_5

    .line 295
    iget-object v2, p0, Ll/ۛۧۜ;->ᩳ:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡᩻ܽ;

    if-eqz v2, :cond_5

    .line 297
    new-instance v0, Ll/ܰۧۜ;

    .line 350
    invoke-interface {v2}, Ll/֡᩻ܽ;->ۘ֫()I

    move-result v3

    invoke-interface {v2}, Ll/֡᩻ܽ;->getTypeName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v3, v4}, Ll/ܰۧۜ;-><init>(ILjava/lang/String;)V

    .line 351
    iput-object v2, v0, Ll/ܰۧۜ;->ۜ:Ll/֡᩻ܽ;

    .line 352
    invoke-interface {v2}, Ll/֡᩻ܽ;->᩷()I

    move-result v3

    iput v3, v0, Ll/ܰۧۜ;->ܿ:I

    .line 353
    invoke-interface {v2}, Ll/֡᩻ܽ;->ۢ()Ljava/lang/Iterable;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۜ᩻ܽ;

    .line 354
    iget v4, v0, Ll/ܰۧۜ;->ܿ:I

    invoke-interface {v3}, Ll/ۜ᩻ܽ;->֨()I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    iput v4, v0, Ll/ܰۧۜ;->ܿ:I

    .line 355
    invoke-static {v3}, Ll/ۖᩳۜ;->֫(Ll/ۜ᩻ܽ;)Ljava/lang/String;

    move-result-object v4

    .line 356
    invoke-interface {v3}, Ll/ۜ᩻ܽ;->ᩳ()Ljava/lang/Iterable;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩷᩻ܽ;

    .line 357
    invoke-interface {v5}, Ll/᩷᩻ܽ;->ۚۧ()I

    move-result v6

    .line 358
    invoke-interface {v5}, Ll/᩷᩻ܽ;->۟֫()Ljava/lang/String;

    move-result-object v5

    .line 359
    iget-object v7, v0, Ll/ܰۧۜ;->֫:Ljava/util/HashMap;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v7, v8, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    const-string v8, "RESOURCE_TARGET_AMBIGUOUS"

    if-eqz v7, :cond_2

    .line 360
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "Resource variants disagree about the entry name."

    invoke-static {v8, p1}, Ll/۟ۧۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    .line 361
    :cond_2
    :goto_1
    iget-object v7, v0, Ll/ܰۧۜ;->ᩳ:Ljava/util/HashMap;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v7, v5, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 362
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, "\n"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    iget-object v6, v0, Ll/ܰۧۜ;->᩷:Ljava/util/HashSet;

    invoke-virtual {v6, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_0

    :cond_3
    const-string p1, "Duplicate resource variants prevent adding resources safely."

    invoke-static {v8, p1}, Ll/۟ۧۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    .line 298
    :cond_4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ll/ܰۧۜ;
    .locals 5

    .line 307
    iget-object v0, p0, Ll/ۛۧۜ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, -0x1

    const/4 v2, -0x1

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡᩻ܽ;

    .line 308
    invoke-interface {v3}, Ll/֡᩻ܽ;->getTypeName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/ۖᩳۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    if-ne v2, v1, :cond_1

    .line 310
    invoke-interface {v3}, Ll/֡᩻ܽ;->ۘ֫()I

    move-result v2

    goto :goto_0

    :cond_1
    const-string p1, "RESOURCE_TARGET_AMBIGUOUS"

    const-string v0, "Multiple types have the requested resource type name."

    .line 309
    invoke-static {p1, v0}, Ll/۟ۧۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    :cond_2
    if-eq v2, v1, :cond_3

    .line 313
    invoke-virtual {p0, v2}, Ll/ۛۧۜ;->֫(I)Ll/ܰۧۜ;

    move-result-object p1

    return-object p1

    .line 314
    :cond_3
    iget-object v0, p0, Ll/ۛۧۜ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰۧۜ;

    .line 315
    iget-object v3, v2, Ll/ܰۧۜ;->ܽ:Ljava/lang/String;

    invoke-static {v3}, Ll/ۖᩳۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    return-object v2

    .line 317
    :cond_5
    iget v1, p0, Ll/ۛۧۜ;->ۧ:I

    const/16 v2, 0xff

    if-gt v1, v2, :cond_6

    .line 318
    new-instance v2, Ll/ܰۧۜ;

    add-int/lit8 v3, v1, 0x1

    iput v3, p0, Ll/ۛۧۜ;->ۧ:I

    invoke-direct {v2, v1, p1}, Ll/ܰۧۜ;-><init>(ILjava/lang/String;)V

    .line 319
    iget p1, v2, Ll/ܰۧۜ;->ۧ:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2

    :cond_6
    const-string p1, "RESOURCE_ID_EXHAUSTED"

    const-string v0, "No unused type ID remains in this package."

    .line 317
    invoke-static {p1, v0}, Ll/۟ۧۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method
