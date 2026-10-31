.class public final Ll/ۙ᩻ܺ;
.super Ll/ۗۜܺ;
.source "E5GV"


# instance fields
.field public final ۗ:Ljava/util/ArrayList;

.field public final ۛ:Ljava/util/HashMap;

.field public final ۤ:Ljava/util/ArrayList;

.field public ۨ:Ll/ۧܺܺ;

.field public final ۫:Ljava/util/ArrayList;

.field public ۬:[B

.field public final ܰ:Ljava/util/ArrayList;

.field public final ᩺:Ll/۫ܺܺ;


# direct methods
.method public constructor <init>(Ll/۫ܺܺ;)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, -0x1

    .line 90
    invoke-direct {p0, v0, v1}, Ll/ۗۜܺ;-><init>(II)V

    if-eqz p1, :cond_0

    .line 96
    iput-object p1, p0, Ll/ۙ᩻ܺ;->᩺:Ll/۫ܺܺ;

    .line 97
    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0x14

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Ll/ۙ᩻ܺ;->ۤ:Ljava/util/ArrayList;

    .line 98
    new-instance p1, Ljava/util/HashMap;

    const/16 v1, 0x28

    invoke-direct {p1, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object p1, p0, Ll/ۙ᩻ܺ;->ۛ:Ljava/util/HashMap;

    .line 99
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Ll/ۙ᩻ܺ;->۫:Ljava/util/ArrayList;

    .line 100
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Ll/ۙ᩻ܺ;->ۗ:Ljava/util/ArrayList;

    .line 101
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Ll/ۙ᩻ܺ;->ܰ:Ljava/util/ArrayList;

    const/4 p1, 0x0

    .line 102
    iput-object p1, p0, Ll/ۙ᩻ܺ;->ۨ:Ll/ۧܺܺ;

    return-void

    .line 93
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "thisClass == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ll/֫ۜܺ;Ll/ᩳᩴܺ;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 4

    .line 416
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 423
    :cond_0
    invoke-virtual {p1}, Ll/ᩳᩴܺ;->֫()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 424
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "  "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ":"

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v2, p2}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    :cond_1
    const/4 p2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    .line 428
    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۜܺ;

    invoke-virtual {v1, p0, p1, p2, v2}, Ll/ᩳۜܺ;->֫(Ll/֫ۜܺ;Ll/ᩳᩴܺ;II)I

    move-result p2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public static ֫(Ll/ᩳᩴܺ;Ljava/lang/String;I)V
    .locals 3

    .line 396
    invoke-virtual {p0}, Ll/ᩳᩴܺ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "_size:"

    .line 397
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 398
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object v0, v1, p1

    const-string p1, "  %-21s %08x"

    .line 397
    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ᩳᩴܺ;->֫(Ljava/lang/String;)V

    .line 401
    :cond_0
    invoke-virtual {p0, p2}, Ll/ᩳᩴܺ;->ۜ(I)I

    return-void
.end method

.method private ܽ(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V
    .locals 10

    .line 363
    invoke-virtual {p2}, Ll/ᩳᩴܺ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 366
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ۗۜܺ;->᩷()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " class data for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ۙ᩻ܺ;->᩺:Ll/۫ܺܺ;

    .line 367
    invoke-virtual {v2}, Ll/۫ܺܺ;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 366
    invoke-virtual {p2, v2, v1}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 370
    :cond_0
    iget-object v1, p0, Ll/ۙ᩻ܺ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const-string v3, "static_fields"

    invoke-static {p2, v3, v2}, Ll/ۙ᩻ܺ;->֫(Ll/ᩳᩴܺ;Ljava/lang/String;I)V

    .line 371
    iget-object v2, p0, Ll/ۙ᩻ܺ;->۫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    const-string v5, "instance_fields"

    invoke-static {p2, v5, v4}, Ll/ۙ᩻ܺ;->֫(Ll/ᩳᩴܺ;Ljava/lang/String;I)V

    .line 372
    iget-object v4, p0, Ll/ۙ᩻ܺ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    const-string v7, "direct_methods"

    invoke-static {p2, v7, v6}, Ll/ۙ᩻ܺ;->֫(Ll/ᩳᩴܺ;Ljava/lang/String;I)V

    .line 373
    iget-object v6, p0, Ll/ۙ᩻ܺ;->ܰ:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v8

    const-string v9, "virtual_methods"

    invoke-static {p2, v9, v8}, Ll/ۙ᩻ܺ;->֫(Ll/ᩳᩴܺ;Ljava/lang/String;I)V

    .line 375
    invoke-static {p1, p2, v3, v1}, Ll/ۙ᩻ܺ;->֫(Ll/֫ۜܺ;Ll/ᩳᩴܺ;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 376
    invoke-static {p1, p2, v5, v2}, Ll/ۙ᩻ܺ;->֫(Ll/֫ۜܺ;Ll/ᩳᩴܺ;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 377
    invoke-static {p1, p2, v7, v4}, Ll/ۙ᩻ܺ;->֫(Ll/֫ۜܺ;Ll/ᩳᩴܺ;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 378
    invoke-static {p1, p2, v9, v6}, Ll/ۙ᩻ܺ;->֫(Ll/֫ۜܺ;Ll/ᩳᩴܺ;Ljava/lang/String;Ljava/util/ArrayList;)V

    if-eqz v0, :cond_1

    .line 381
    invoke-virtual {p2}, Ll/ᩳᩴܺ;->ۧ()V

    :cond_1
    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۘۜܺ;
    .locals 1

    .line 110
    sget-object v0, Ll/ۘۜܺ;->᩺:Ll/ۘۜܺ;

    return-object v0
.end method

.method public final ֫(Ll/֫ۜܺ;)V
    .locals 2

    .line 247
    iget-object v0, p0, Ll/ۙ᩻ܺ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 248
    invoke-virtual {p0}, Ll/ۙ᩻ܺ;->ۡ()Ll/ۧܺܺ;

    .line 249
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽۜܺ;

    .line 250
    invoke-virtual {v1, p1}, Ll/ܽۜܺ;->֫(Ll/֫ۜܺ;)V

    goto :goto_0

    .line 254
    :cond_0
    iget-object v0, p0, Ll/ۙ᩻ܺ;->۫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 255
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 256
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽۜܺ;

    .line 257
    invoke-virtual {v1, p1}, Ll/ܽۜܺ;->֫(Ll/֫ۜܺ;)V

    goto :goto_1

    .line 261
    :cond_1
    iget-object v0, p0, Ll/ۙ᩻ܺ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 262
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 263
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿۜܺ;

    .line 264
    invoke-virtual {v1, p1}, Ll/ܿۜܺ;->֫(Ll/֫ۜܺ;)V

    goto :goto_2

    .line 268
    :cond_2
    iget-object v0, p0, Ll/ۙ᩻ܺ;->ܰ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    .line 269
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 270
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿۜܺ;

    .line 271
    invoke-virtual {v1, p1}, Ll/ܿۜܺ;->֫(Ll/֫ۜܺ;)V

    goto :goto_3

    :cond_3
    return-void
.end method

.method public final ֫(Ll/ܽۜܺ;)V
    .locals 1

    .line 162
    iget-object v0, p0, Ll/ۙ᩻ܺ;->۫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/ܽۜܺ;Ll/ܰۡܺ;)V
    .locals 1

    .line 143
    iget-object v0, p0, Ll/ۙ᩻ܺ;->ۨ:Ll/ۧܺܺ;

    if-nez v0, :cond_0

    .line 148
    iget-object v0, p0, Ll/ۙ᩻ܺ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    iget-object v0, p0, Ll/ۙ᩻ܺ;->ۛ:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 144
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "static fields already sorted"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ܿۜܺ;)V
    .locals 1

    .line 175
    iget-object v0, p0, Ll/ۙ᩻ܺ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۡ()Ll/ۧܺܺ;
    .locals 8

    .line 284
    iget-object v0, p0, Ll/ۙ᩻ܺ;->ۨ:Ll/ۧܺܺ;

    if-nez v0, :cond_6

    iget-object v0, p0, Ll/ۙ᩻ܺ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-eqz v1, :cond_6

    .line 300
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 307
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 308
    :goto_0
    iget-object v2, p0, Ll/ۙ᩻ܺ;->ۛ:Ljava/util/HashMap;

    if-lez v1, :cond_2

    add-int/lit8 v3, v1, -0x1

    .line 309
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܽۜܺ;

    .line 310
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܰۡܺ;

    .line 311
    instance-of v4, v3, Ll/֨ܺܺ;

    if-eqz v4, :cond_0

    .line 313
    check-cast v3, Ll/֨ܺܺ;

    invoke-virtual {v3}, Ll/֨ܺܺ;->֡()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-eqz v7, :cond_1

    goto :goto_1

    :cond_0
    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-nez v1, :cond_3

    const/4 v0, 0x0

    goto :goto_3

    .line 328
    :cond_3
    new-instance v3, Ll/֫ܺܺ;

    .line 126
    invoke-direct {v3, v1}, Ll/ܿᩴܺ;-><init>(I)V

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v1, :cond_5

    .line 330
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܽۜܺ;

    .line 331
    invoke-virtual {v2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܰۡܺ;

    if-nez v6, :cond_4

    .line 333
    invoke-virtual {v5}, Ll/ܽۜܺ;->ۧ()Ll/ۡܺܺ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۡܺܺ;->getType()Ll/۟ܺܺ;

    move-result-object v5

    invoke-static {v5}, Ll/ۨܺܺ;->֫(Ll/۟ܺܺ;)Ll/֨ܺܺ;

    move-result-object v6

    .line 335
    :cond_4
    invoke-virtual {v3, v4, v6}, Ll/ܿᩴܺ;->֫(ILl/ܰۡܺ;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 337
    :cond_5
    invoke-virtual {v3}, Ll/ᩴᩴܺ;->ܺ()V

    .line 339
    new-instance v0, Ll/ۧܺܺ;

    invoke-direct {v0, v3}, Ll/ۧܺܺ;-><init>(Ll/֫ܺܺ;)V

    .line 285
    :goto_3
    iput-object v0, p0, Ll/ۙ᩻ܺ;->ۨ:Ll/ۧܺܺ;

    .line 288
    :cond_6
    iget-object v0, p0, Ll/ۙ᩻ܺ;->ۨ:Ll/ۧܺܺ;

    return-object v0
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 1

    .line 118
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V
    .locals 1

    .line 437
    invoke-virtual {p2}, Ll/ᩳᩴܺ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 445
    invoke-direct {p0, p1, p2}, Ll/ۙ᩻ܺ;->ܽ(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V

    return-void

    .line 447
    :cond_0
    iget-object p1, p0, Ll/ۙ᩻ܺ;->۬:[B

    invoke-virtual {p2, p1}, Ll/ᩳᩴܺ;->֫([B)V

    return-void
.end method

.method public final ۧ(Ll/ۙۜܺ;I)V
    .locals 0

    .line 349
    new-instance p2, Ll/ᩳᩴܺ;

    invoke-direct {p2}, Ll/ᩳᩴܺ;-><init>()V

    .line 351
    invoke-virtual {p1}, Ll/ۛۜܺ;->ۧ()Ll/֫ۜܺ;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Ll/ۙ᩻ܺ;->ܽ(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V

    .line 352
    invoke-virtual {p2}, Ll/ᩳᩴܺ;->᩻()[B

    move-result-object p1

    iput-object p1, p0, Ll/ۙ᩻ܺ;->۬:[B

    .line 353
    array-length p1, p1

    invoke-virtual {p0, p1}, Ll/ۗۜܺ;->֫(I)V

    return-void
.end method

.method public final ۧ(Ll/ܿۜܺ;)V
    .locals 1

    .line 188
    iget-object v0, p0, Ll/ۙ᩻ܺ;->ܰ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ܺ()Z
    .locals 1

    .line 128
    iget-object v0, p0, Ll/ۙ᩻ܺ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۙ᩻ܺ;->۫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۙ᩻ܺ;->ۗ:Ljava/util/ArrayList;

    .line 129
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۙ᩻ܺ;->ܰ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
