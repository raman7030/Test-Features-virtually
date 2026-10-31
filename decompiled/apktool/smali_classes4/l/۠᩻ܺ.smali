.class public final Ll/۠᩻ܺ;
.super Ll/ۗۜܺ;
.source "8BDC"


# instance fields
.field public ۗ:Ll/֡᩻ܺ;

.field public ۤ:Ljava/util/ArrayList;

.field public ۫:Ljava/util/ArrayList;

.field public ۬:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x4

    const/4 v1, -0x1

    .line 73
    invoke-direct {p0, v0, v1}, Ll/ۗۜܺ;-><init>(II)V

    const/4 v0, 0x0

    .line 75
    iput-object v0, p0, Ll/۠᩻ܺ;->ۗ:Ll/֡᩻ܺ;

    .line 76
    iput-object v0, p0, Ll/۠᩻ܺ;->۬:Ljava/util/ArrayList;

    .line 77
    iput-object v0, p0, Ll/۠᩻ܺ;->۫:Ljava/util/ArrayList;

    .line 78
    iput-object v0, p0, Ll/۠᩻ܺ;->ۤ:Ljava/util/ArrayList;

    return-void
.end method

.method public static ֫(Ljava/util/ArrayList;)I
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 381
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    return p0
.end method


# virtual methods
.method public final hashCode()I
    .locals 1

    .line 122
    iget-object v0, p0, Ll/۠᩻ܺ;->ۗ:Ll/֡᩻ܺ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 126
    :cond_0
    invoke-virtual {v0}, Ll/֡᩻ܺ;->hashCode()I

    move-result v0

    return v0
.end method

.method public final ֫(Ll/ۗۜܺ;)I
    .locals 3

    .line 139
    invoke-virtual {p0}, Ll/۠᩻ܺ;->ܺ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 143
    check-cast p1, Ll/۠᩻ܺ;

    .line 145
    iget-object v0, p0, Ll/۠᩻ܺ;->ۗ:Ll/֡᩻ܺ;

    iget-object p1, p1, Ll/۠᩻ܺ;->ۗ:Ll/֡᩻ܺ;

    if-ne v0, p1, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    return p1

    .line 124
    :cond_0
    invoke-virtual {v0}, Ll/֡᩻ܺ;->֫()Ll/ۘۜܺ;

    move-result-object v1

    .line 125
    invoke-virtual {p1}, Ll/֡᩻ܺ;->֫()Ll/ۘۜܺ;

    move-result-object v2

    if-eq v1, v2, :cond_1

    .line 128
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p1

    return p1

    .line 131
    :cond_1
    invoke-virtual {v0, p1}, Ll/֡᩻ܺ;->֫(Ll/ۗۜܺ;)I

    move-result p1

    return p1

    .line 140
    :cond_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "uninternable instance"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()Ll/ۘۜܺ;
    .locals 1

    .line 86
    sget-object v0, Ll/ۘۜܺ;->ۗ:Ll/ۘۜܺ;

    return-object v0
.end method

.method public final ֫(Ll/֫ۜܺ;)V
    .locals 2

    .line 266
    invoke-virtual {p1}, Ll/֫ۜܺ;->ۚ()Ll/ۙۜܺ;

    move-result-object v0

    .line 268
    iget-object v1, p0, Ll/۠᩻ܺ;->ۗ:Ll/֡᩻ܺ;

    if-eqz v1, :cond_0

    .line 269
    invoke-virtual {v0, v1}, Ll/ۙۜܺ;->ۧ(Ll/ۗۜܺ;)Ll/ۗۜܺ;

    move-result-object v0

    check-cast v0, Ll/֡᩻ܺ;

    iput-object v0, p0, Ll/۠᩻ܺ;->ۗ:Ll/֡᩻ܺ;

    .line 272
    :cond_0
    iget-object v0, p0, Ll/۠᩻ܺ;->۬:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 273
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳۜܺ;

    .line 274
    invoke-virtual {v1, p1}, Ll/ܳۜܺ;->֫(Ll/֫ۜܺ;)V

    goto :goto_0

    .line 278
    :cond_1
    iget-object v0, p0, Ll/۠᩻ܺ;->۫:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 279
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚۜܺ;

    .line 280
    invoke-virtual {v1, p1}, Ll/ۚۜܺ;->֫(Ll/֫ۜܺ;)V

    goto :goto_1

    .line 284
    :cond_2
    iget-object v0, p0, Ll/۠᩻ܺ;->ۤ:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    .line 285
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ۜܺ;

    .line 286
    invoke-virtual {v1, p1}, Ll/۬ۜܺ;->֫(Ll/֫ۜܺ;)V

    goto :goto_2

    :cond_3
    return-void
.end method

.method public final ֫(Ll/ۡܺܺ;Ll/᩺ۢܺ;Ll/֫ۜܺ;)V
    .locals 3

    .line 178
    iget-object v0, p0, Ll/۠᩻ܺ;->۬:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 179
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۠᩻ܺ;->۬:Ljava/util/ArrayList;

    .line 182
    :cond_0
    iget-object v0, p0, Ll/۠᩻ܺ;->۬:Ljava/util/ArrayList;

    new-instance v1, Ll/ܳۜܺ;

    new-instance v2, Ll/֡᩻ܺ;

    invoke-direct {v2, p2, p3}, Ll/֡᩻ܺ;-><init>(Ll/᩺ۢܺ;Ll/֫ۜܺ;)V

    invoke-direct {v1, p1, v2}, Ll/ܳۜܺ;-><init>(Ll/ۡܺܺ;Ll/֡᩻ܺ;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/᩹ܺܺ;Ll/ܰۢܺ;Ll/֫ۜܺ;)V
    .locals 2

    .line 212
    iget-object v0, p0, Ll/۠᩻ܺ;->ۤ:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 213
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۠᩻ܺ;->ۤ:Ljava/util/ArrayList;

    .line 216
    :cond_0
    iget-object v0, p0, Ll/۠᩻ܺ;->ۤ:Ljava/util/ArrayList;

    new-instance v1, Ll/۬ۜܺ;

    invoke-direct {v1, p1, p2, p3}, Ll/۬ۜܺ;-><init>(Ll/᩹ܺܺ;Ll/ܰۢܺ;Ll/֫ۜܺ;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/᩹ܺܺ;Ll/᩺ۢܺ;Ll/֫ۜܺ;)V
    .locals 3

    .line 195
    iget-object v0, p0, Ll/۠᩻ܺ;->۫:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 196
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۠᩻ܺ;->۫:Ljava/util/ArrayList;

    .line 199
    :cond_0
    iget-object v0, p0, Ll/۠᩻ܺ;->۫:Ljava/util/ArrayList;

    new-instance v1, Ll/ۚۜܺ;

    new-instance v2, Ll/֡᩻ܺ;

    invoke-direct {v2, p2, p3}, Ll/֡᩻ܺ;-><init>(Ll/᩺ۢܺ;Ll/֫ۜܺ;)V

    invoke-direct {v1, p1, v2}, Ll/ۚۜܺ;-><init>(Ll/᩹ܺܺ;Ll/֡᩻ܺ;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/᩺ۢܺ;Ll/֫ۜܺ;)V
    .locals 1

    .line 161
    iget-object v0, p0, Ll/۠᩻ܺ;->ۗ:Ll/֡᩻ܺ;

    if-nez v0, :cond_0

    .line 166
    new-instance v0, Ll/֡᩻ܺ;

    invoke-direct {v0, p1, p2}, Ll/֡᩻ܺ;-><init>(Ll/᩺ۢܺ;Ll/֫ۜܺ;)V

    iput-object v0, p0, Ll/۠᩻ܺ;->ۗ:Ll/֡᩻ܺ;

    return-void

    .line 162
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "class annotations already set"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۡ()Z
    .locals 1

    .line 96
    iget-object v0, p0, Ll/۠᩻ܺ;->ۗ:Ll/֡᩻ܺ;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/۠᩻ܺ;->۬:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/۠᩻ܺ;->۫:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/۠᩻ܺ;->ۤ:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 2

    .line 296
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "unsupported"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V
    .locals 9

    .line 316
    invoke-virtual {p2}, Ll/ᩳᩴܺ;->֫()Z

    move-result v0

    .line 317
    iget-object v1, p0, Ll/۠᩻ܺ;->ۗ:Ll/֡᩻ܺ;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 63
    :cond_0
    invoke-virtual {v1}, Ll/ۗۜܺ;->ܿ()I

    move-result v1

    .line 318
    :goto_0
    iget-object v3, p0, Ll/۠᩻ܺ;->۬:Ljava/util/ArrayList;

    invoke-static {v3}, Ll/۠᩻ܺ;->֫(Ljava/util/ArrayList;)I

    move-result v3

    .line 319
    iget-object v4, p0, Ll/۠᩻ܺ;->۫:Ljava/util/ArrayList;

    invoke-static {v4}, Ll/۠᩻ܺ;->֫(Ljava/util/ArrayList;)I

    move-result v4

    .line 320
    iget-object v5, p0, Ll/۠᩻ܺ;->ۤ:Ljava/util/ArrayList;

    invoke-static {v5}, Ll/۠᩻ܺ;->֫(Ljava/util/ArrayList;)I

    move-result v5

    if-eqz v0, :cond_1

    .line 323
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ۗۜܺ;->᩷()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " annotations directory"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2, v2, v6}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 324
    invoke-static {v1}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v6

    const-string v7, "  class_annotations_off: "

    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x4

    invoke-virtual {p2, v7, v6}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 326
    invoke-static {v3}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v6

    const-string v8, "  fields_size:           "

    invoke-virtual {v8, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 325
    invoke-virtual {p2, v7, v6}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 328
    invoke-static {v4}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v6

    const-string v8, "  methods_size:          "

    invoke-virtual {v8, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 327
    invoke-virtual {p2, v7, v6}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 330
    invoke-static {v5}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v6

    const-string v8, "  parameters_size:       "

    invoke-virtual {v8, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 329
    invoke-virtual {p2, v7, v6}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 333
    :cond_1
    invoke-virtual {p2, v1}, Ll/ᩳᩴܺ;->ܿ(I)V

    .line 334
    invoke-virtual {p2, v3}, Ll/ᩳᩴܺ;->ܿ(I)V

    .line 335
    invoke-virtual {p2, v4}, Ll/ᩳᩴܺ;->ܿ(I)V

    .line 336
    invoke-virtual {p2, v5}, Ll/ᩳᩴܺ;->ܿ(I)V

    if-eqz v3, :cond_3

    .line 339
    iget-object v1, p0, Ll/۠᩻ܺ;->۬:Ljava/util/ArrayList;

    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    if-eqz v0, :cond_2

    const-string v1, "  fields:"

    .line 341
    invoke-virtual {p2, v2, v1}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 343
    :cond_2
    iget-object v1, p0, Ll/۠᩻ܺ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܳۜܺ;

    .line 344
    invoke-virtual {v3, p1, p2}, Ll/ܳۜܺ;->֫(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V

    goto :goto_1

    :cond_3
    if-eqz v4, :cond_5

    .line 349
    iget-object v1, p0, Ll/۠᩻ܺ;->۫:Ljava/util/ArrayList;

    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    if-eqz v0, :cond_4

    const-string v1, "  methods:"

    .line 351
    invoke-virtual {p2, v2, v1}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 353
    :cond_4
    iget-object v1, p0, Ll/۠᩻ܺ;->۫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۚۜܺ;

    .line 354
    invoke-virtual {v3, p1, p2}, Ll/ۚۜܺ;->֫(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V

    goto :goto_2

    :cond_5
    if-eqz v5, :cond_7

    .line 359
    iget-object v1, p0, Ll/۠᩻ܺ;->ۤ:Ljava/util/ArrayList;

    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    if-eqz v0, :cond_6

    const-string v0, "  parameters:"

    .line 361
    invoke-virtual {p2, v2, v0}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 363
    :cond_6
    iget-object v0, p0, Ll/۠᩻ܺ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ۜܺ;

    .line 364
    invoke-virtual {v1, p1, p2}, Ll/۬ۜܺ;->֫(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V

    goto :goto_3

    :cond_7
    return-void
.end method

.method public final ۧ(Ll/ۙۜܺ;I)V
    .locals 0

    .line 306
    iget-object p1, p0, Ll/۠᩻ܺ;->۬:Ljava/util/ArrayList;

    invoke-static {p1}, Ll/۠᩻ܺ;->֫(Ljava/util/ArrayList;)I

    move-result p1

    iget-object p2, p0, Ll/۠᩻ܺ;->۫:Ljava/util/ArrayList;

    .line 307
    invoke-static {p2}, Ll/۠᩻ܺ;->֫(Ljava/util/ArrayList;)I

    move-result p2

    add-int/2addr p1, p2

    iget-object p2, p0, Ll/۠᩻ܺ;->ۤ:Ljava/util/ArrayList;

    invoke-static {p2}, Ll/۠᩻ܺ;->֫(Ljava/util/ArrayList;)I

    move-result p2

    add-int/2addr p1, p2

    mul-int/lit8 p1, p1, 0x8

    add-int/lit8 p1, p1, 0x10

    .line 308
    invoke-virtual {p0, p1}, Ll/ۗۜܺ;->֫(I)V

    return-void
.end method

.method public final ܺ()Z
    .locals 1

    .line 111
    iget-object v0, p0, Ll/۠᩻ܺ;->ۗ:Ll/֡᩻ܺ;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/۠᩻ܺ;->۬:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/۠᩻ܺ;->۫:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/۠᩻ܺ;->ۤ:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
