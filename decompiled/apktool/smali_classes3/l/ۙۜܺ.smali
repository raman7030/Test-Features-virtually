.class public final Ll/ۙۜܺ;
.super Ll/ۛۜܺ;
.source "6BDM"


# static fields
.field public static final ۢ:Ljava/util/Comparator;


# instance fields
.field public final ۜ:Ll/᩶ۜܺ;

.field public final ܳ:Ljava/util/HashMap;

.field public ᩷:I

.field public final ᩻:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 64
    new-instance v0, Ll/᩹ۜܺ;

    .line 65
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 64
    sput-object v0, Ll/ۙۜܺ;->ۢ:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/֫ۜܺ;ILl/᩶ۜܺ;)V
    .locals 0

    .line 107
    invoke-direct {p0, p1, p2, p3}, Ll/ۛۜܺ;-><init>(Ljava/lang/String;Ll/֫ۜܺ;I)V

    .line 109
    new-instance p1, Ljava/util/ArrayList;

    const/16 p2, 0x64

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Ll/ۙۜܺ;->᩻:Ljava/util/ArrayList;

    .line 110
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1, p2}, Ljava/util/HashMap;-><init>(I)V

    iput-object p1, p0, Ll/ۙۜܺ;->ܳ:Ljava/util/HashMap;

    .line 111
    iput-object p4, p0, Ll/ۙۜܺ;->ۜ:Ll/᩶ۜܺ;

    const/4 p1, -0x1

    .line 112
    iput p1, p0, Ll/ۙۜܺ;->᩷:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۖۜܺ;)I
    .locals 0

    .line 137
    check-cast p1, Ll/ۗۜܺ;

    .line 138
    invoke-virtual {p1}, Ll/ۗۜܺ;->ܿ()I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ۗۜܺ;)V
    .locals 2

    .line 193
    invoke-virtual {p0}, Ll/ۛۜܺ;->ۜ()V

    .line 196
    :try_start_0
    invoke-virtual {p1}, Ll/ۗۜܺ;->᩻()I

    move-result v0

    invoke-virtual {p0}, Ll/ۛۜܺ;->֫()I

    move-result v1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    if-gt v0, v1, :cond_0

    .line 205
    iget-object v0, p0, Ll/ۙۜܺ;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 197
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "incompatible item alignment"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 202
    :catch_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "item == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ᩳᩴܺ;Ll/ۘۜܺ;)V
    .locals 4

    .line 259
    invoke-virtual {p0}, Ll/ۛۜܺ;->᩻()V

    .line 261
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 264
    iget-object v1, p0, Ll/ۙۜܺ;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗۜܺ;

    .line 265
    invoke-virtual {v2}, Ll/ۖۜܺ;->֫()Ll/ۘۜܺ;

    move-result-object v3

    if-ne v3, p2, :cond_0

    .line 266
    invoke-virtual {v2}, Ll/ۗۜܺ;->ۢ()Ljava/lang/String;

    move-result-object v3

    .line 267
    invoke-virtual {v0, v3, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 271
    :cond_1
    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    move-result p2

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    const/4 p2, 0x0

    const-string v1, "\nmethod code index:\n\n"

    .line 275
    invoke-virtual {p1, p2, v1}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 277
    invoke-virtual {v0}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 278
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 279
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗۜܺ;

    .line 280
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ll/ۗۜܺ;->᩷()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, p2, v1}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    goto :goto_1

    :cond_3
    :goto_2
    return-void
.end method

.method public final ۢ()V
    .locals 6

    .line 319
    invoke-virtual {p0}, Ll/ۛۜܺ;->᩻()V

    .line 321
    iget-object v0, p0, Ll/ۙۜܺ;->ۜ:Ll/᩶ۜܺ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    iget-object v2, p0, Ll/ۙۜܺ;->᩻:Ljava/util/ArrayList;

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 323
    :cond_0
    invoke-static {v2}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    goto :goto_0

    .line 327
    :cond_1
    sget-object v0, Ll/ۙۜܺ;->ۢ:Ljava/util/Comparator;

    invoke-static {v2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 332
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v3, 0x0

    :goto_1
    if-ge v1, v0, :cond_3

    .line 335
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۗۜܺ;

    .line 337
    :try_start_0
    invoke-virtual {v4, p0, v3}, Ll/ۗۜܺ;->֫(Ll/ۙۜܺ;I)I

    move-result v5

    if-lt v5, v3, :cond_2

    .line 344
    invoke-virtual {v4}, Ll/ۗۜܺ;->ۧ()I

    move-result v3

    add-int/2addr v3, v5

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 340
    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bogus place() result for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    .line 346
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "...while placing "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ll/۠ۧܺ;->֫(Ljava/lang/String;Ljava/lang/Exception;)Ll/۠ۧܺ;

    move-result-object v0

    throw v0

    .line 351
    :cond_3
    iput v3, p0, Ll/ۙۜܺ;->᩷:I

    return-void
.end method

.method public final declared-synchronized ۧ(Ll/ۗۜܺ;)Ll/ۗۜܺ;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 217
    :try_start_0
    invoke-virtual {p0}, Ll/ۛۜܺ;->ۜ()V

    .line 219
    iget-object v1, p0, Ll/ۙۜܺ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗۜܺ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 222
    monitor-exit v0

    return-object v1

    .line 225
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Ll/ۙۜܺ;->֫(Ll/ۗۜܺ;)V

    .line 226
    iget-object v1, p0, Ll/ۙۜܺ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v1, p1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 227
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final ۧ(Ll/ᩳᩴܺ;)V
    .locals 9

    .line 359
    invoke-virtual {p1}, Ll/ᩳᩴܺ;->֫()Z

    move-result v0

    .line 361
    invoke-virtual {p0}, Ll/ۛۜܺ;->ۧ()Ll/֫ۜܺ;

    move-result-object v1

    .line 364
    iget-object v2, p0, Ll/ۙۜܺ;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۗۜܺ;

    if-eqz v0, :cond_1

    if-eqz v5, :cond_0

    const/4 v5, 0x0

    goto :goto_1

    :cond_0
    const-string v7, "\n"

    .line 369
    invoke-virtual {p1, v3, v7}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 373
    :cond_1
    :goto_1
    invoke-virtual {v6}, Ll/ۗۜܺ;->᩻()I

    move-result v7

    add-int/lit8 v7, v7, -0x1

    add-int v8, v4, v7

    not-int v7, v7

    and-int/2addr v7, v8

    if-eq v4, v7, :cond_2

    sub-int v4, v7, v4

    .line 377
    invoke-virtual {p1, v4}, Ll/ᩳᩴܺ;->᩷(I)V

    move v4, v7

    .line 381
    :cond_2
    invoke-virtual {v6, v1, p1}, Ll/ۗۜܺ;->֫(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V

    .line 382
    invoke-virtual {v6}, Ll/ۗۜܺ;->ۧ()I

    move-result v6

    add-int/2addr v4, v6

    goto :goto_0

    .line 385
    :cond_3
    iget p1, p0, Ll/ۙۜܺ;->᩷:I

    if-ne v4, p1, :cond_4

    return-void

    .line 386
    :cond_4
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "output size mismatch"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܳ()V
    .locals 5

    .line 289
    invoke-virtual {p0}, Ll/ۛۜܺ;->ۧ()Ll/֫ۜܺ;

    move-result-object v0

    const/4 v1, 0x0

    .line 298
    :cond_0
    iget-object v2, p0, Ll/ۙۜܺ;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lt v1, v3, :cond_1

    return-void

    :cond_1
    :goto_0
    if-ge v1, v3, :cond_0

    .line 304
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۗۜܺ;

    .line 305
    invoke-virtual {v4, v0}, Ll/ۖۜܺ;->֫(Ll/֫ۜܺ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method public final ᩳ()Ljava/util/Collection;
    .locals 1

    .line 120
    iget-object v0, p0, Ll/ۙۜܺ;->᩻:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ᩷()I
    .locals 1

    .line 128
    invoke-virtual {p0}, Ll/ۛۜܺ;->᩻()V

    .line 129
    iget v0, p0, Ll/ۙۜܺ;->᩷:I

    return v0
.end method
