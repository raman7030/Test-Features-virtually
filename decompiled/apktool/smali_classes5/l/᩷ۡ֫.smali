.class public final Ll/᩷ۡ֫;
.super Ll/۟ۢ֫;
.source "H4Y9"


# instance fields
.field public ֫:I

.field public ۜ:Ll/ܰۢ֫;

.field public final ۧ:Z

.field public ܳ:Ll/ۤᩴ;

.field public ܽ:Z

.field public ܿ:Z

.field public final ᩳ:Ljava/lang/ref/WeakReference;

.field public ᩻:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/᩻ۡ֫;)V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    const/4 v0, 0x1

    .line 33
    iput-boolean v0, p0, Ll/᩷ۡ֫;->ۧ:Z

    .line 42
    new-instance v0, Ll/ۤᩴ;

    invoke-direct {v0}, Ll/ۤᩴ;-><init>()V

    iput-object v0, p0, Ll/᩷ۡ֫;->ܳ:Ll/ۤᩴ;

    .line 47
    sget-object v0, Ll/ܰۢ֫;->ۙ:Ll/ܰۢ֫;

    iput-object v0, p0, Ll/᩷ۡ֫;->ۜ:Ll/ܰۢ֫;

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩷ۡ֫;->᩻:Ljava/util/ArrayList;

    .line 82
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/᩷ۡ֫;->ᩳ:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method private final ֫(Ljava/lang/String;)V
    .locals 2

    .line 295
    iget-boolean v0, p0, Ll/᩷ۡ֫;->ۧ:Z

    if-eqz v0, :cond_1

    .line 296
    invoke-static {}, Ll/ۙᩴ;->ۧ()Ll/ۙᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۙᩴ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "Method "

    const-string v1, " must be called on the main thread"

    .line 0
    invoke-static {v0, p1, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 296
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method private final ۧ()V
    .locals 7

    .line 275
    iget-object v0, p0, Ll/᩷ۡ֫;->ᩳ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩻ۡ֫;

    if-eqz v0, :cond_8

    .line 145
    :cond_0
    iget-object v1, p0, Ll/᩷ۡ֫;->ܳ:Ll/ۤᩴ;

    invoke-virtual {v1}, Ll/ۧ᩵;->size()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    goto :goto_0

    .line 148
    :cond_1
    iget-object v1, p0, Ll/᩷ۡ֫;->ܳ:Ll/ۤᩴ;

    invoke-virtual {v1}, Ll/ۧ᩵;->ۧ()Ljava/util/Map$Entry;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜۡ֫;

    invoke-virtual {v1}, Ll/ۜۡ֫;->֫()Ll/ܰۢ֫;

    move-result-object v1

    .line 149
    iget-object v3, p0, Ll/᩷ۡ֫;->ܳ:Ll/ۤᩴ;

    invoke-virtual {v3}, Ll/ۧ᩵;->ᩳ()Ljava/util/Map$Entry;

    move-result-object v3

    invoke-static {v3}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۜۡ֫;

    invoke-virtual {v3}, Ll/ۜۡ֫;->֫()Ll/ܰۢ֫;

    move-result-object v3

    if-ne v1, v3, :cond_2

    .line 150
    iget-object v1, p0, Ll/᩷ۡ֫;->ۜ:Ll/ܰۢ֫;

    if-ne v1, v3, :cond_2

    .line 290
    :goto_0
    iput-boolean v2, p0, Ll/᩷ۡ֫;->ܿ:Z

    return-void

    .line 281
    :cond_2
    iput-boolean v2, p0, Ll/᩷ۡ֫;->ܿ:Z

    .line 282
    iget-object v1, p0, Ll/᩷ۡ֫;->ۜ:Ll/ܰۢ֫;

    iget-object v2, p0, Ll/᩷ۡ֫;->ܳ:Ll/ۤᩴ;

    invoke-virtual {v2}, Ll/ۧ᩵;->ۧ()Ljava/util/Map$Entry;

    move-result-object v2

    invoke-static {v2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۜۡ֫;

    invoke-virtual {v2}, Ll/ۜۡ֫;->֫()Ll/ܰۢ֫;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    iget-object v2, p0, Ll/᩷ۡ֫;->᩻:Ljava/util/ArrayList;

    if-gez v1, :cond_5

    .line 258
    iget-object v1, p0, Ll/᩷ۡ֫;->ܳ:Ll/ۤᩴ;

    invoke-virtual {v1}, Ll/ۧ᩵;->descendingIterator()Ljava/util/Iterator;

    move-result-object v1

    .line 259
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    iget-boolean v3, p0, Ll/᩷ۡ֫;->ܿ:Z

    if-nez v3, :cond_5

    .line 260
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    const-string v4, "next()"

    invoke-static {v3, v4}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܳۡ֫;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۜۡ֫;

    .line 261
    :goto_1
    invoke-virtual {v3}, Ll/ۜۡ֫;->֫()Ll/ܰۢ֫;

    move-result-object v5

    iget-object v6, p0, Ll/᩷ۡ֫;->ۜ:Ll/ܰۢ֫;

    invoke-virtual {v5, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v5

    if-lez v5, :cond_3

    iget-boolean v5, p0, Ll/᩷ۡ֫;->ܿ:Z

    if-nez v5, :cond_3

    iget-object v5, p0, Ll/᩷ۡ֫;->ܳ:Ll/ۤᩴ;

    invoke-virtual {v5, v4}, Ll/ۤᩴ;->ۧ(Ll/ܳۡ֫;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 263
    sget-object v5, Ll/᩺ۢ֫;->᩹:Ll/ۛۢ֫;

    invoke-virtual {v3}, Ll/ۜۡ֫;->֫()Ll/ܰۢ֫;

    move-result-object v6

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6}, Ll/ۛۢ֫;->֫(Ll/ܰۢ֫;)Ll/᩺ۢ֫;

    move-result-object v5

    if-eqz v5, :cond_4

    .line 265
    invoke-virtual {v5}, Ll/᩺ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v6

    .line 209
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 266
    invoke-virtual {v3, v0, v5}, Ll/ۜۡ֫;->֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;)V

    .line 205
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    .line 264
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "no event down from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ll/ۜۡ֫;->֫()Ll/ܰۢ֫;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 285
    :cond_5
    iget-object v1, p0, Ll/᩷ۡ֫;->ܳ:Ll/ۤᩴ;

    invoke-virtual {v1}, Ll/ۧ᩵;->ᩳ()Ljava/util/Map$Entry;

    move-result-object v1

    .line 286
    iget-boolean v3, p0, Ll/᩷ۡ֫;->ܿ:Z

    if-nez v3, :cond_0

    if-eqz v1, :cond_0

    iget-object v3, p0, Ll/᩷ۡ֫;->ۜ:Ll/ܰۢ֫;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜۡ֫;

    invoke-virtual {v1}, Ll/ۜۡ֫;->֫()Ll/ܰۢ֫;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-lez v1, :cond_0

    .line 243
    iget-object v1, p0, Ll/᩷ۡ֫;->ܳ:Ll/ۤᩴ;

    invoke-virtual {v1}, Ll/ۧ᩵;->ܽ()Ll/ܰᩴ;

    move-result-object v1

    .line 244
    :cond_6
    invoke-virtual {v1}, Ll/ܰᩴ;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-boolean v3, p0, Ll/᩷ۡ֫;->ܿ:Z

    if-nez v3, :cond_0

    .line 245
    invoke-virtual {v1}, Ll/ܰᩴ;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܳۡ֫;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۜۡ֫;

    .line 246
    :goto_2
    invoke-virtual {v3}, Ll/ۜۡ֫;->֫()Ll/ܰۢ֫;

    move-result-object v5

    iget-object v6, p0, Ll/᩷ۡ֫;->ۜ:Ll/ܰۢ֫;

    invoke-virtual {v5, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v5

    if-gez v5, :cond_6

    iget-boolean v5, p0, Ll/᩷ۡ֫;->ܿ:Z

    if-nez v5, :cond_6

    iget-object v5, p0, Ll/᩷ۡ֫;->ܳ:Ll/ۤᩴ;

    invoke-virtual {v5, v4}, Ll/ۤᩴ;->ۧ(Ll/ܳۡ֫;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 248
    invoke-virtual {v3}, Ll/ۜۡ֫;->֫()Ll/ܰۢ֫;

    move-result-object v5

    .line 209
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 249
    sget-object v5, Ll/᩺ۢ֫;->᩹:Ll/ۛۢ֫;

    invoke-virtual {v3}, Ll/ۜۡ֫;->֫()Ll/ܰۢ֫;

    move-result-object v6

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6}, Ll/ۛۢ֫;->ۧ(Ll/ܰۢ֫;)Ll/᩺ۢ֫;

    move-result-object v5

    if-eqz v5, :cond_7

    .line 251
    invoke-virtual {v3, v0, v5}, Ll/ۜۡ֫;->֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;)V

    .line 205
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_2

    .line 250
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "no event up from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ll/ۜۡ֫;->֫()Ll/ܰۢ֫;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 276
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final ۧ(Ll/ܰۢ֫;)V
    .locals 2

    .line 123
    iget-object v0, p0, Ll/᩷ۡ֫;->ۜ:Ll/ܰۢ֫;

    if-ne v0, p1, :cond_0

    goto :goto_1

    .line 126
    :cond_0
    sget-object v1, Ll/ܰۢ֫;->ۙ:Ll/ܰۢ֫;

    if-ne v0, v1, :cond_2

    sget-object v0, Ll/ܰۢ֫;->᩶:Ll/ܰۢ֫;

    if-eq p1, v0, :cond_1

    goto :goto_0

    .line 127
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "no event down from "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Ll/᩷ۡ֫;->ۜ:Ll/ܰۢ֫;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " in component "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ll/᩷ۡ֫;->ᩳ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 126
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 129
    :cond_2
    :goto_0
    iput-object p1, p0, Ll/᩷ۡ֫;->ۜ:Ll/ܰۢ֫;

    .line 130
    iget-boolean p1, p0, Ll/᩷ۡ֫;->ܽ:Z

    const/4 v0, 0x1

    if-nez p1, :cond_5

    iget p1, p0, Ll/᩷ۡ֫;->֫:I

    if-eqz p1, :cond_3

    goto :goto_2

    .line 135
    :cond_3
    iput-boolean v0, p0, Ll/᩷ۡ֫;->ܽ:Z

    .line 136
    invoke-direct {p0}, Ll/᩷ۡ֫;->ۧ()V

    const/4 p1, 0x0

    .line 137
    iput-boolean p1, p0, Ll/᩷ۡ֫;->ܽ:Z

    .line 138
    iget-object p1, p0, Ll/᩷ۡ֫;->ۜ:Ll/ܰۢ֫;

    sget-object v0, Ll/ܰۢ֫;->᩶:Ll/ܰۢ֫;

    if-ne p1, v0, :cond_4

    .line 139
    new-instance p1, Ll/ۤᩴ;

    invoke-direct {p1}, Ll/ۤᩴ;-><init>()V

    iput-object p1, p0, Ll/᩷ۡ֫;->ܳ:Ll/ۤᩴ;

    :cond_4
    :goto_1
    return-void

    .line 131
    :cond_5
    :goto_2
    iput-boolean v0, p0, Ll/᩷ۡ֫;->ܿ:Z

    return-void
.end method

.method private final ܽ(Ll/ܳۡ֫;)Ll/ܰۢ֫;
    .locals 3

    .line 154
    iget-object v0, p0, Ll/᩷ۡ֫;->ܳ:Ll/ۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۤᩴ;->֫(Ll/ܳۡ֫;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 155
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۜۡ֫;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll/ۜۡ֫;->֫()Ll/ܰۢ֫;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    .line 157
    :goto_0
    iget-object v1, p0, Ll/᩷ۡ֫;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    const/4 v0, 0x1

    .line 0
    invoke-static {v1, v0}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    .line 157
    check-cast v0, Ll/ܰۢ֫;

    .line 158
    :cond_1
    iget-object v1, p0, Ll/᩷ۡ֫;->ۜ:Ll/ܰۢ֫;

    const-string v2, "state1"

    invoke-static {v1, v2}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_2

    .line 336
    invoke-virtual {p1, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v2

    if-gez v2, :cond_2

    goto :goto_1

    :cond_2
    move-object p1, v1

    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {v0, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-gez v1, :cond_3

    return-object v0

    :cond_3
    return-object p1
.end method


# virtual methods
.method public final ֫()Ll/ܰۢ֫;
    .locals 1

    .line 98
    iget-object v0, p0, Ll/᩷ۡ֫;->ۜ:Ll/ܰۢ֫;

    return-object v0
.end method

.method public final ֫(Ll/ܰۢ֫;)V
    .locals 1

    const-string v0, "state"

    .line 6
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setCurrentState"

    .line 105
    invoke-direct {p0, v0}, Ll/᩷ۡ֫;->֫(Ljava/lang/String;)V

    .line 106
    invoke-direct {p0, p1}, Ll/᩷ۡ֫;->ۧ(Ll/ܰۢ֫;)V

    return-void
.end method

.method public final ֫(Ll/ܳۡ֫;)V
    .locals 6

    const-string v0, "observer"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addObserver"

    .line 174
    invoke-direct {p0, v0}, Ll/᩷ۡ֫;->֫(Ljava/lang/String;)V

    .line 175
    iget-object v0, p0, Ll/᩷ۡ֫;->ۜ:Ll/ܰۢ֫;

    sget-object v1, Ll/ܰۢ֫;->᩶:Ll/ܰۢ֫;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Ll/ܰۢ֫;->ۙ:Ll/ܰۢ֫;

    .line 176
    :goto_0
    new-instance v0, Ll/ۜۡ֫;

    invoke-direct {v0, p1, v1}, Ll/ۜۡ֫;-><init>(Ll/ܳۡ֫;Ll/ܰۢ֫;)V

    .line 177
    iget-object v1, p0, Ll/᩷ۡ֫;->ܳ:Ll/ۤᩴ;

    invoke-virtual {v1, p1, v0}, Ll/ۤᩴ;->ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜۡ֫;

    if-eqz v1, :cond_1

    goto :goto_1

    .line 181
    :cond_1
    iget-object v1, p0, Ll/᩷ۡ֫;->ᩳ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻ۡ֫;

    if-nez v1, :cond_2

    :goto_1
    return-void

    .line 184
    :cond_2
    iget v2, p0, Ll/᩷ۡ֫;->֫:I

    if-nez v2, :cond_4

    iget-boolean v2, p0, Ll/᩷ۡ֫;->ܽ:Z

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    goto :goto_3

    :cond_4
    :goto_2
    const/4 v2, 0x1

    .line 185
    :goto_3
    invoke-direct {p0, p1}, Ll/᩷ۡ֫;->ܽ(Ll/ܳۡ֫;)Ll/ܰۢ֫;

    move-result-object v3

    .line 186
    iget v4, p0, Ll/᩷ۡ֫;->֫:I

    add-int/lit8 v4, v4, 0x1

    iput v4, p0, Ll/᩷ۡ֫;->֫:I

    .line 187
    :goto_4
    invoke-virtual {v0}, Ll/ۜۡ֫;->֫()Ll/ܰۢ֫;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-gez v3, :cond_6

    iget-object v3, p0, Ll/᩷ۡ֫;->ܳ:Ll/ۤᩴ;

    invoke-virtual {v3, p1}, Ll/ۤᩴ;->ۧ(Ll/ܳۡ֫;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 189
    invoke-virtual {v0}, Ll/ۜۡ֫;->֫()Ll/ܰۢ֫;

    move-result-object v3

    .line 209
    iget-object v4, p0, Ll/᩷ۡ֫;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 190
    sget-object v3, Ll/᩺ۢ֫;->᩹:Ll/ۛۢ֫;

    invoke-virtual {v0}, Ll/ۜۡ֫;->֫()Ll/ܰۢ֫;

    move-result-object v5

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, Ll/ۛۢ֫;->ۧ(Ll/ܰۢ֫;)Ll/᩺ۢ֫;

    move-result-object v3

    if-eqz v3, :cond_5

    .line 192
    invoke-virtual {v0, v1, v3}, Ll/ۜۡ֫;->֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;)V

    .line 205
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 195
    invoke-direct {p0, p1}, Ll/᩷ۡ֫;->ܽ(Ll/ܳۡ֫;)Ll/ܰۢ֫;

    move-result-object v3

    goto :goto_4

    .line 191
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "no event up from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/ۜۡ֫;->֫()Ll/ܰۢ֫;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    if-nez v2, :cond_7

    .line 199
    invoke-direct {p0}, Ll/᩷ۡ֫;->ۧ()V

    .line 201
    :cond_7
    iget p1, p0, Ll/᩷ۡ֫;->֫:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/᩷ۡ֫;->֫:I

    return-void
.end method

.method public final ֫(Ll/᩺ۢ֫;)V
    .locals 1

    const-string v0, "event"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handleLifecycleEvent"

    .line 118
    invoke-direct {p0, v0}, Ll/᩷ۡ֫;->֫(Ljava/lang/String;)V

    .line 119
    invoke-virtual {p1}, Ll/᩺ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/᩷ۡ֫;->ۧ(Ll/ܰۢ֫;)V

    return-void
.end method

.method public final ۧ(Ll/ܳۡ֫;)V
    .locals 1

    const-string v0, "observer"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "removeObserver"

    .line 213
    invoke-direct {p0, v0}, Ll/᩷ۡ֫;->֫(Ljava/lang/String;)V

    .line 226
    iget-object v0, p0, Ll/᩷ۡ֫;->ܳ:Ll/ۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۤᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
