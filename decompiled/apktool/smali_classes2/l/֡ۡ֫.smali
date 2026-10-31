.class public abstract Ll/֡ۡ֫;
.super Ljava/lang/Object;
.source "X4YZ"


# static fields
.field public static final ۡ:Ljava/lang/Object;


# instance fields
.field public ֫:I

.field public volatile ۜ:Ljava/lang/Object;

.field public ۢ:I

.field public ۧ:Z

.field public ܳ:Z

.field public volatile ܽ:Ljava/lang/Object;

.field public ܿ:Z

.field public final ᩳ:Ljava/lang/Object;

.field public final ᩷:Ljava/lang/Runnable;

.field public ᩻:Ll/ۧ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 64
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/֡ۡ֫;->ۡ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/֡ۡ֫;->ᩳ:Ljava/lang/Object;

    .line 66
    new-instance v0, Ll/ۧ᩵;

    invoke-direct {v0}, Ll/ۧ᩵;-><init>()V

    iput-object v0, p0, Ll/֡ۡ֫;->᩻:Ll/ۧ᩵;

    const/4 v0, 0x0

    .line 70
    iput v0, p0, Ll/֡ۡ֫;->֫:I

    .line 77
    sget-object v0, Ll/֡ۡ֫;->ۡ:Ljava/lang/Object;

    iput-object v0, p0, Ll/֡ۡ֫;->ۜ:Ljava/lang/Object;

    .line 84
    new-instance v1, Ll/ۖۡ֫;

    invoke-direct {v1, p0}, Ll/ۖۡ֫;-><init>(Ll/֡ۡ֫;)V

    iput-object v1, p0, Ll/֡ۡ֫;->᩷:Ljava/lang/Runnable;

    .line 111
    iput-object v0, p0, Ll/֡ۡ֫;->ܽ:Ljava/lang/Object;

    const/4 v0, -0x1

    .line 112
    iput v0, p0, Ll/֡ۡ֫;->ۢ:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 2

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/֡ۡ֫;->ᩳ:Ljava/lang/Object;

    .line 66
    new-instance v0, Ll/ۧ᩵;

    invoke-direct {v0}, Ll/ۧ᩵;-><init>()V

    iput-object v0, p0, Ll/֡ۡ֫;->᩻:Ll/ۧ᩵;

    const/4 v0, 0x0

    .line 70
    iput v0, p0, Ll/֡ۡ֫;->֫:I

    .line 77
    sget-object v1, Ll/֡ۡ֫;->ۡ:Ljava/lang/Object;

    iput-object v1, p0, Ll/֡ۡ֫;->ۜ:Ljava/lang/Object;

    .line 84
    new-instance v1, Ll/ۖۡ֫;

    invoke-direct {v1, p0}, Ll/ۖۡ֫;-><init>(Ll/֡ۡ֫;)V

    iput-object v1, p0, Ll/֡ۡ֫;->᩷:Ljava/lang/Runnable;

    .line 103
    iput-object p1, p0, Ll/֡ۡ֫;->ܽ:Ljava/lang/Object;

    .line 104
    iput v0, p0, Ll/֡ۡ֫;->ۢ:I

    return-void
.end method

.method public static ֫(Ljava/lang/String;)V
    .locals 3

    .line 501
    invoke-static {}, Ll/ۙᩴ;->ۧ()Ll/ۙᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۙᩴ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 502
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot invoke "

    const-string v2, " on a background thread"

    .line 0
    invoke-static {v1, p0, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 502
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ۧ(Ll/᩵ۡ֫;)V
    .locals 2

    .line 117
    iget-boolean v0, p1, Ll/᩵ۡ֫;->᩸:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 125
    :cond_0
    invoke-virtual {p1}, Ll/᩵ۡ֫;->ۧ()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 126
    invoke-virtual {p1, v0}, Ll/᩵ۡ֫;->֫(Z)V

    return-void

    .line 129
    :cond_1
    iget v0, p1, Ll/᩵ۡ֫;->᩹:I

    iget v1, p0, Ll/֡ۡ֫;->ۢ:I

    if-lt v0, v1, :cond_2

    :goto_0
    return-void

    .line 132
    :cond_2
    iput v1, p1, Ll/᩵ۡ֫;->᩹:I

    .line 133
    iget-object p1, p1, Ll/᩵ۡ֫;->᩶:Ll/֨ۡ֫;

    iget-object v0, p0, Ll/֡ۡ֫;->ܽ:Ljava/lang/Object;

    invoke-interface {p1, v0}, Ll/֨ۡ֫;->֫(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 2

    .line 323
    iget-object v0, p0, Ll/֡ۡ֫;->ܽ:Ljava/lang/Object;

    .line 324
    sget-object v1, Ll/֡ۡ֫;->ۡ:Ljava/lang/Object;

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ֫(I)V
    .locals 3

    .line 393
    iget v0, p0, Ll/֡ۡ֫;->֫:I

    add-int/2addr p1, v0

    .line 394
    iput p1, p0, Ll/֡ۡ֫;->֫:I

    .line 395
    iget-boolean p1, p0, Ll/֡ۡ֫;->ۧ:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    .line 398
    iput-boolean p1, p0, Ll/֡ۡ֫;->ۧ:Z

    :goto_0
    const/4 p1, 0x0

    .line 400
    :try_start_0
    iget v1, p0, Ll/֡ۡ֫;->֫:I

    if-eq v0, v1, :cond_5

    if-nez v0, :cond_1

    if-lez v1, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-lez v0, :cond_2

    if-nez v1, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    if-eqz v2, :cond_3

    .line 405
    invoke-virtual {p0}, Ll/֡ۡ֫;->ܽ()V

    goto :goto_3

    :cond_3
    if-eqz v0, :cond_4

    .line 407
    invoke-virtual {p0}, Ll/֡ۡ֫;->ᩳ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    :goto_3
    move v0, v1

    goto :goto_0

    .line 411
    :cond_5
    iput-boolean p1, p0, Ll/֡ۡ֫;->ۧ:Z

    return-void

    :catchall_0
    move-exception v0

    iput-boolean p1, p0, Ll/֡ۡ֫;->ۧ:Z

    .line 412
    throw v0
.end method

.method public ֫(Ljava/lang/Object;)V
    .locals 3

    .line 286
    iget-object v0, p0, Ll/֡ۡ֫;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 287
    :try_start_0
    iget-object v1, p0, Ll/֡ۡ֫;->ۜ:Ljava/lang/Object;

    sget-object v2, Ll/֡ۡ֫;->ۡ:Ljava/lang/Object;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 288
    :goto_0
    iput-object p1, p0, Ll/֡ۡ֫;->ۜ:Ljava/lang/Object;

    .line 289
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_1

    return-void

    .line 293
    :cond_1
    invoke-static {}, Ll/ۙᩴ;->ۧ()Ll/ۙᩴ;

    move-result-object p1

    iget-object v0, p0, Ll/֡ۡ֫;->᩷:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Ll/ۙᩴ;->֫(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception p1

    .line 289
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/֨ۡ֫;)V
    .locals 2

    const-string v0, "observeForever"

    .line 224
    invoke-static {v0}, Ll/֡ۡ֫;->֫(Ljava/lang/String;)V

    .line 225
    new-instance v0, Ll/ۘۡ֫;

    .line 491
    invoke-direct {v0, p0, p1}, Ll/᩵ۡ֫;-><init>(Ll/֡ۡ֫;Ll/֨ۡ֫;)V

    .line 226
    iget-object v1, p0, Ll/֡ۡ֫;->᩻:Ll/ۧ᩵;

    invoke-virtual {v1, p1, v0}, Ll/ۧ᩵;->ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵ۡ֫;

    .line 227
    instance-of v1, p1, Ll/ᩴۡ֫;

    if-nez v1, :cond_1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    .line 234
    invoke-virtual {v0, p1}, Ll/᩵ۡ֫;->֫(Z)V

    return-void

    .line 228
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot add the same observer with different lifecycles"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/᩵ۡ֫;)V
    .locals 3

    .line 138
    iget-boolean v0, p0, Ll/֡ۡ֫;->ܳ:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 139
    iput-boolean v1, p0, Ll/֡ۡ֫;->ܿ:Z

    return-void

    .line 142
    :cond_0
    iput-boolean v1, p0, Ll/֡ۡ֫;->ܳ:Z

    :cond_1
    const/4 v0, 0x0

    .line 144
    iput-boolean v0, p0, Ll/֡ۡ֫;->ܿ:Z

    if-eqz p1, :cond_2

    .line 146
    invoke-direct {p0, p1}, Ll/֡ۡ֫;->ۧ(Ll/᩵ۡ֫;)V

    const/4 p1, 0x0

    goto :goto_0

    .line 149
    :cond_2
    iget-object v1, p0, Ll/֡ۡ֫;->᩻:Ll/ۧ᩵;

    .line 150
    invoke-virtual {v1}, Ll/ۧ᩵;->ܽ()Ll/ܰᩴ;

    move-result-object v1

    :cond_3
    invoke-virtual {v1}, Ll/ܰᩴ;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 151
    invoke-virtual {v1}, Ll/ܰᩴ;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩵ۡ֫;

    invoke-direct {p0, v2}, Ll/֡ۡ֫;->ۧ(Ll/᩵ۡ֫;)V

    .line 152
    iget-boolean v2, p0, Ll/֡ۡ֫;->ܿ:Z

    if-eqz v2, :cond_3

    .line 157
    :cond_4
    :goto_0
    iget-boolean v1, p0, Ll/֡ۡ֫;->ܿ:Z

    if-nez v1, :cond_1

    .line 158
    iput-boolean v0, p0, Ll/֡ۡ֫;->ܳ:Z

    return-void
.end method

.method public final ֫(Ll/᩻ۡ֫;)V
    .locals 3

    const-string v0, "removeObservers"

    .line 261
    invoke-static {v0}, Ll/֡ۡ֫;->֫(Ljava/lang/String;)V

    .line 262
    iget-object v0, p0, Ll/֡ۡ֫;->᩻:Ll/ۧ᩵;

    invoke-virtual {v0}, Ll/ۧ᩵;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 263
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩵ۡ֫;

    invoke-virtual {v2, p1}, Ll/᩵ۡ֫;->᩻(Ll/᩻ۡ֫;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 264
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨ۡ֫;

    invoke-virtual {p0, v1}, Ll/֡ۡ֫;->ۧ(Ll/֨ۡ֫;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V
    .locals 2

    const-string v0, "observe"

    .line 191
    invoke-static {v0}, Ll/֡ۡ֫;->֫(Ljava/lang/String;)V

    .line 192
    invoke-interface {p1}, Ll/᩻ۡ֫;->getLifecycle()Ll/۟ۢ֫;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v0

    sget-object v1, Ll/ܰۢ֫;->᩶:Ll/ܰۢ֫;

    if-ne v0, v1, :cond_0

    goto :goto_1

    .line 196
    :cond_0
    new-instance v0, Ll/ᩴۡ֫;

    invoke-direct {v0, p0, p1, p2}, Ll/ᩴۡ֫;-><init>(Ll/֡ۡ֫;Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    .line 197
    iget-object v1, p0, Ll/֡ۡ֫;->᩻:Ll/ۧ᩵;

    invoke-virtual {v1, p2, v0}, Ll/ۧ᩵;->ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩵ۡ֫;

    if-eqz p2, :cond_2

    .line 198
    invoke-virtual {p2, p1}, Ll/᩵ۡ֫;->᩻(Ll/᩻ۡ֫;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 199
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Cannot add the same observer with different lifecycles"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    if-eqz p2, :cond_3

    :goto_1
    return-void

    .line 205
    :cond_3
    invoke-interface {p1}, Ll/᩻ۡ֫;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/۟ۢ֫;->֫(Ll/ܳۡ֫;)V

    return-void
.end method

.method public ۧ(Ljava/lang/Object;)V
    .locals 1

    const-string v0, "setValue"

    .line 306
    invoke-static {v0}, Ll/֡ۡ֫;->֫(Ljava/lang/String;)V

    .line 307
    iget v0, p0, Ll/֡ۡ֫;->ۢ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/֡ۡ֫;->ۢ:I

    .line 308
    iput-object p1, p0, Ll/֡ۡ֫;->ܽ:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 309
    invoke-virtual {p0, p1}, Ll/֡ۡ֫;->֫(Ll/᩵ۡ֫;)V

    return-void
.end method

.method public ۧ(Ll/֨ۡ֫;)V
    .locals 1

    const-string v0, "removeObserver"

    .line 244
    invoke-static {v0}, Ll/֡ۡ֫;->֫(Ljava/lang/String;)V

    .line 245
    iget-object v0, p0, Ll/֡ۡ֫;->᩻:Ll/ۧ᩵;

    invoke-virtual {v0, p1}, Ll/ۧ᩵;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵ۡ֫;

    if-nez p1, :cond_0

    return-void

    .line 249
    :cond_0
    invoke-virtual {p1}, Ll/᩵ۡ֫;->֫()V

    const/4 v0, 0x0

    .line 250
    invoke-virtual {p1, v0}, Ll/᩵ۡ֫;->֫(Z)V

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 378
    iget-object v0, p0, Ll/֡ۡ֫;->᩻:Ll/ۧ᩵;

    invoke-virtual {v0}, Ll/ۧ᩵;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ܽ()V
    .locals 0

    return-void
.end method

.method public ᩳ()V
    .locals 0

    return-void
.end method
