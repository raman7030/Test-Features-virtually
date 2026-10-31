.class public final Ll/۬۬֫;
.super Ljava/lang/Object;
.source "O8L1"


# static fields
.field public static final ۜ:Ll/ۙ۬֫;

.field public static final ᩷:Ljava/util/Random;


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:Ll/ۙ᩵֫;

.field public final ܳ:Ljava/util/HashMap;

.field public ܽ:J

.field public final ܿ:Ll/᩹᩵֫;

.field public ᩳ:Ll/ۨ۬֫;

.field public final ᩻:Ll/᩶᩵֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 48
    new-instance v0, Ll/ۙ۬֫;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/۬۬֫;->ۜ:Ll/ۙ۬֫;

    .line 51
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sput-object v0, Ll/۬۬֫;->᩷:Ljava/util/Random;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    new-instance v0, Ll/᩶᩵֫;

    invoke-direct {v0}, Ll/᩶᩵֫;-><init>()V

    iput-object v0, p0, Ll/۬۬֫;->᩻:Ll/᩶᩵֫;

    .line 80
    new-instance v0, Ll/᩹᩵֫;

    invoke-direct {v0}, Ll/᩹᩵֫;-><init>()V

    iput-object v0, p0, Ll/۬۬֫;->ܿ:Ll/᩹᩵֫;

    .line 81
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/۬۬֫;->ܳ:Ljava/util/HashMap;

    .line 82
    sget-object v0, Ll/ۙ᩵֫;->֫:Ll/ۙ᩵֫;

    iput-object v0, p0, Ll/۬۬֫;->ۧ:Ll/ۙ᩵֫;

    const-wide/16 v0, -0x1

    .line 83
    iput-wide v0, p0, Ll/۬۬֫;->ܽ:J

    return-void
.end method

.method private ֫(ILl/ܺۧۧ;)Ll/ۗ۬֫;
    .locals 11

    .line 302
    iget-object v0, p0, Ll/۬۬֫;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    const-wide v3, 0x7fffffffffffffffL

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۗ۬֫;

    .line 303
    invoke-virtual {v5, p1, p2}, Ll/ۗ۬֫;->ۧ(ILl/ܺۧۧ;)V

    .line 304
    invoke-virtual {v5, p1, p2}, Ll/ۗ۬֫;->֫(ILl/ܺۧۧ;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 305
    invoke-static {v5}, Ll/ۗ۬֫;->ܳ(Ll/ۗ۬֫;)J

    move-result-wide v6

    const-wide/16 v8, -0x1

    cmp-long v10, v6, v8

    if-eqz v10, :cond_2

    cmp-long v8, v6, v3

    if-gez v8, :cond_1

    goto :goto_1

    :cond_1
    if-nez v8, :cond_0

    .line 311
    sget-object v6, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-static {v2}, Ll/ۗ۬֫;->֫(Ll/ۗ۬֫;)Ll/ܺۧۧ;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-static {v5}, Ll/ۗ۬֫;->֫(Ll/ۗ۬֫;)Ll/ܺۧۧ;

    move-result-object v6

    if-eqz v6, :cond_0

    move-object v2, v5

    goto :goto_0

    :cond_2
    :goto_1
    move-object v2, v5

    move-wide v3, v6

    goto :goto_0

    :cond_3
    if-nez v2, :cond_4

    .line 318
    invoke-static {}, Ll/۬۬֫;->ۧ()Ljava/lang/String;

    move-result-object v1

    .line 319
    new-instance v2, Ll/ۗ۬֫;

    invoke-direct {v2, p0, v1, p1, p2}, Ll/ۗ۬֫;-><init>(Ll/۬۬֫;Ljava/lang/String;ILl/ܺۧۧ;)V

    .line 320
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-object v2
.end method

.method public static bridge synthetic ֫(Ll/۬۬֫;)Ll/᩹᩵֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬۬֫;->ܿ:Ll/᩹᩵֫;

    return-object p0
.end method

.method private ֫(Ll/ۗ۬֫;)V
    .locals 5

    .line 281
    invoke-static {p1}, Ll/ۗ۬֫;->ܳ(Ll/ۗ۬֫;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 282
    invoke-static {p1}, Ll/ۗ۬֫;->ܳ(Ll/ۗ۬֫;)J

    move-result-wide v0

    iput-wide v0, p0, Ll/۬۬֫;->ܽ:J

    :cond_0
    const/4 p1, 0x0

    .line 284
    iput-object p1, p0, Ll/۬۬֫;->֫:Ljava/lang/String;

    return-void
.end method

.method public static ۧ()Ljava/lang/String;
    .locals 2

    const/16 v0, 0xc

    new-array v0, v0, [B

    .line 327
    sget-object v1, Ll/۬۬֫;->᩷:Ljava/util/Random;

    invoke-virtual {v1, v0}, Ljava/util/Random;->nextBytes([B)V

    const/16 v1, 0xa

    .line 328
    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static bridge synthetic ۧ(Ll/۬۬֫;)Ll/᩶᩵֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬۬֫;->᩻:Ll/᩶᩵֫;

    return-object p0
.end method

.method private ܽ()J
    .locals 6

    .line 288
    iget-object v0, p0, Ll/۬۬֫;->ܳ:Ljava/util/HashMap;

    iget-object v1, p0, Ll/۬۬֫;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۗ۬֫;

    if-eqz v0, :cond_0

    .line 289
    invoke-static {v0}, Ll/ۗ۬֫;->ܳ(Ll/ۗ۬֫;)J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    .line 290
    invoke-static {v0}, Ll/ۗ۬֫;->ܳ(Ll/ۗ۬֫;)J

    move-result-wide v0

    return-wide v0

    .line 291
    :cond_0
    iget-wide v0, p0, Ll/۬۬֫;->ܽ:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public static bridge synthetic ܽ(Ll/۬۬֫;)J
    .locals 2

    .line 0
    invoke-direct {p0}, Ll/۬۬֫;->ܽ()J

    move-result-wide v0

    return-wide v0
.end method

.method private ᩳ(Ll/֡۬֫;)V
    .locals 7
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "listener"
        }
    .end annotation

    .line 247
    iget-object v0, p1, Ll/֡۬֫;->ۜ:Ll/ۙ᩵֫;

    iget v1, p1, Ll/֡۬֫;->ۢ:I

    iget-object v2, p1, Ll/֡۬֫;->ܳ:Ll/ܺۧۧ;

    invoke-virtual {v0}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v0

    iget-object v3, p0, Ll/۬۬֫;->ܳ:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    .line 249
    iget-object p1, p0, Ll/۬۬֫;->֫:Ljava/lang/String;

    if-eqz p1, :cond_2

    .line 250
    invoke-virtual {v3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۗ۬֫;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    invoke-direct {p0, p1}, Ll/۬۬֫;->֫(Ll/ۗ۬֫;)V

    return-void

    .line 254
    :cond_0
    iget-object v0, p0, Ll/۬۬֫;->֫:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۗ۬֫;

    .line 256
    invoke-direct {p0, v1, v2}, Ll/۬۬֫;->֫(ILl/ܺۧۧ;)Ll/ۗ۬֫;

    move-result-object v3

    .line 257
    invoke-static {v3}, Ll/ۗ۬֫;->ᩳ(Ll/ۗ۬֫;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Ll/۬۬֫;->֫:Ljava/lang/String;

    .line 258
    invoke-virtual {p0, p1}, Ll/۬۬֫;->ۧ(Ll/֡۬֫;)V

    if-eqz v2, :cond_2

    .line 259
    iget-wide v3, v2, Ll/ܺۧۧ;->ܿ:J

    .line 260
    invoke-virtual {v2}, Ll/ܺۧۧ;->֫()Z

    move-result p1

    if-eqz p1, :cond_2

    if-eqz v0, :cond_1

    invoke-static {v0}, Ll/ۗ۬֫;->ܳ(Ll/ۗ۬֫;)J

    move-result-wide v5

    cmp-long p1, v5, v3

    if-nez p1, :cond_1

    invoke-static {v0}, Ll/ۗ۬֫;->֫(Ll/ۗ۬֫;)Ll/ܺۧۧ;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {v0}, Ll/ۗ۬֫;->֫(Ll/ۗ۬֫;)Ll/ܺۧۧ;

    move-result-object p1

    iget p1, p1, Ll/ܺۧۧ;->֫:I

    iget v5, v2, Ll/ܺۧۧ;->֫:I

    if-ne p1, v5, :cond_1

    invoke-static {v0}, Ll/ۗ۬֫;->֫(Ll/ۗ۬֫;)Ll/ܺۧۧ;

    move-result-object p1

    iget p1, p1, Ll/ܺۧۧ;->ۧ:I

    iget v0, v2, Ll/ܺۧۧ;->ۧ:I

    if-eq p1, v0, :cond_2

    .line 270
    :cond_1
    new-instance p1, Ll/ܺۧۧ;

    iget-object v0, v2, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    invoke-direct {p1, v3, v4, v0}, Ll/ܺۧۧ;-><init>(JLjava/lang/Object;)V

    .line 274
    invoke-direct {p0, v1, p1}, Ll/۬۬֫;->֫(ILl/ܺۧۧ;)Ll/ۗ۬֫;

    .line 275
    iget-object p1, p0, Ll/۬۬֫;->ᩳ:Ll/ۨ۬֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_2
    return-void
.end method


# virtual methods
.method public final declared-synchronized ֫()Ljava/lang/String;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 226
    :try_start_0
    iget-object v1, p0, Ll/۬۬֫;->֫:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ֫(Ll/ۙ᩵֫;Ll/ܺۧۧ;)Ljava/lang/String;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 94
    :try_start_0
    iget-object v1, p2, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    iget-object v2, p0, Ll/۬۬֫;->ܿ:Ll/᩹᩵֫;

    invoke-virtual {p1, v1, v2}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    move-result-object p1

    iget p1, p1, Ll/᩹᩵֫;->᩻:I

    .line 95
    invoke-direct {p0, p1, p2}, Ll/۬۬֫;->֫(ILl/ܺۧۧ;)Ll/ۗ۬֫;

    move-result-object p1

    invoke-static {p1}, Ll/ۗ۬֫;->ᩳ(Ll/ۗ۬֫;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Ll/֡۬֫;)V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 231
    :try_start_0
    iget-object v1, p0, Ll/۬۬֫;->֫:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 232
    iget-object v2, p0, Ll/۬۬֫;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗ۬֫;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    invoke-direct {p0, v1}, Ll/۬۬֫;->֫(Ll/ۗ۬֫;)V

    .line 234
    :cond_0
    iget-object v1, p0, Ll/۬۬֫;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 235
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 236
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗ۬֫;

    .line 237
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 238
    invoke-static {v2}, Ll/ۗ۬֫;->ܽ(Ll/ۗ۬֫;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Ll/۬۬֫;->ᩳ:Ll/ۨ۬֫;

    if-eqz v3, :cond_1

    .line 239
    invoke-static {v2}, Ll/ۗ۬֫;->ᩳ(Ll/ۗ۬֫;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, p1, v2}, Ll/ۨ۬֫;->ۧ(Ll/֡۬֫;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 243
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Ll/֡۬֫;I)V
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 202
    :try_start_0
    iget-object v1, p0, Ll/۬۬֫;->ᩳ:Ll/ۨ۬֫;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 204
    :goto_0
    iget-object v1, p0, Ll/۬۬֫;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 205
    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 206
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗ۬֫;

    .line 207
    invoke-virtual {v2, p1}, Ll/ۗ۬֫;->֫(Ll/֡۬֫;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 208
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 209
    invoke-static {v2}, Ll/ۗ۬֫;->ܽ(Ll/ۗ۬֫;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 210
    invoke-static {v2}, Ll/ۗ۬֫;->ᩳ(Ll/ۗ۬֫;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Ll/۬۬֫;->֫:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz p2, :cond_2

    if-eqz v3, :cond_2

    .line 211
    invoke-static {v2}, Ll/ۗ۬֫;->ۧ(Ll/ۗ۬֫;)Z

    :cond_2
    if-eqz v3, :cond_3

    .line 214
    invoke-direct {p0, v2}, Ll/۬۬֫;->֫(Ll/ۗ۬֫;)V

    .line 216
    :cond_3
    iget-object v3, p0, Ll/۬۬֫;->ᩳ:Ll/ۨ۬֫;

    invoke-static {v2}, Ll/ۗ۬֫;->ᩳ(Ll/ۗ۬֫;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, p1, v2}, Ll/ۨ۬֫;->ۧ(Ll/֡۬֫;Ljava/lang/String;)V

    goto :goto_1

    .line 220
    :cond_4
    invoke-direct {p0, p1}, Ll/۬۬֫;->ᩳ(Ll/֡۬֫;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 221
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/ۨ۬֫;)V
    .locals 0

    .line 88
    iput-object p1, p0, Ll/۬۬֫;->ᩳ:Ll/ۨ۬֫;

    return-void
.end method

.method public final declared-synchronized ۧ(Ll/֡۬֫;)V
    .locals 8

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 110
    :try_start_0
    iget-object v1, p0, Ll/۬۬֫;->ᩳ:Ll/ۨ۬֫;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    iget-object v1, p1, Ll/֡۬֫;->ۜ:Ll/ۙ᩵֫;

    invoke-virtual {v1}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 113
    monitor-exit v0

    return-void

    .line 115
    :cond_0
    :try_start_1
    iget-object v1, p1, Ll/֡۬֫;->ܳ:Ll/ܺۧۧ;

    if-eqz v1, :cond_2

    .line 116
    iget-wide v1, v1, Ll/ܺۧۧ;->ܿ:J

    invoke-direct {p0}, Ll/۬۬֫;->ܽ()J

    move-result-wide v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long v5, v1, v3

    if-gez v5, :cond_1

    .line 118
    monitor-exit v0

    return-void

    .line 120
    :cond_1
    :try_start_2
    iget-object v1, p0, Ll/۬۬֫;->ܳ:Ljava/util/HashMap;

    iget-object v2, p0, Ll/۬۬֫;->֫:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗ۬֫;

    if-eqz v1, :cond_2

    .line 121
    invoke-static {v1}, Ll/ۗ۬֫;->ܳ(Ll/ۗ۬֫;)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    invoke-static {v1}, Ll/ۗ۬֫;->ܿ(Ll/ۗ۬֫;)I

    move-result v1

    iget v2, p1, Ll/֡۬֫;->ۢ:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eq v1, v2, :cond_2

    .line 126
    monitor-exit v0

    return-void

    .line 129
    :cond_2
    :try_start_3
    iget v1, p1, Ll/֡۬֫;->ۢ:I

    iget-object v2, p1, Ll/֡۬֫;->ܳ:Ll/ܺۧۧ;

    .line 130
    invoke-direct {p0, v1, v2}, Ll/۬۬֫;->֫(ILl/ܺۧۧ;)Ll/ۗ۬֫;

    move-result-object v1

    .line 131
    iget-object v2, p0, Ll/۬۬֫;->֫:Ljava/lang/String;

    if-nez v2, :cond_3

    .line 132
    invoke-static {v1}, Ll/ۗ۬֫;->ᩳ(Ll/ۗ۬֫;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Ll/۬۬֫;->֫:Ljava/lang/String;

    .line 134
    :cond_3
    iget-object v2, p1, Ll/֡۬֫;->ܳ:Ll/ܺۧۧ;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ll/ܺۧۧ;->֫()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 136
    new-instance v2, Ll/ܺۧۧ;

    iget-object v3, p1, Ll/֡۬֫;->ܳ:Ll/ܺۧۧ;

    iget-object v4, v3, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    iget-wide v5, v3, Ll/ܺۧۧ;->ܿ:J

    iget v3, v3, Ll/ܺۧۧ;->֫:I

    invoke-direct {v2, v3, v5, v6, v4}, Ll/ܺۧۧ;-><init>(IJLjava/lang/Object;)V

    .line 141
    iget v3, p1, Ll/֡۬֫;->ۢ:I

    .line 142
    invoke-direct {p0, v3, v2}, Ll/۬۬֫;->֫(ILl/ܺۧۧ;)Ll/ۗ۬֫;

    move-result-object v2

    .line 143
    invoke-static {v2}, Ll/ۗ۬֫;->ܽ(Ll/ۗ۬֫;)Z

    move-result v3

    if-nez v3, :cond_4

    .line 144
    invoke-static {v2}, Ll/ۗ۬֫;->ۜ(Ll/ۗ۬֫;)V

    .line 145
    iget-object v2, p1, Ll/֡۬֫;->ۜ:Ll/ۙ᩵֫;

    iget-object v3, p1, Ll/֡۬֫;->ܳ:Ll/ܺۧۧ;

    iget-object v3, v3, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    iget-object v4, p0, Ll/۬۬֫;->ܿ:Ll/᩹᩵֫;

    invoke-virtual {v2, v3, v4}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    .line 146
    iget-object v2, p0, Ll/۬۬֫;->ܿ:Ll/᩹᩵֫;

    iget-object v3, p1, Ll/֡۬֫;->ܳ:Ll/ܺۧۧ;

    iget v3, v3, Ll/ܺۧۧ;->֫:I

    .line 147
    invoke-virtual {v2, v3}, Ll/᩹᩵֫;->֫(I)J

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v4

    iget-object v6, p0, Ll/۬۬֫;->ܿ:Ll/᩹᩵֫;

    .line 684
    iget-wide v6, v6, Ll/᩹᩵֫;->ܿ:J

    invoke-static {v6, v7}, Ll/ۘ֨֫;->ۧ(J)J

    move-result-wide v6

    add-long/2addr v4, v6

    .line 150
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 163
    iget-object v2, p0, Ll/۬۬֫;->ᩳ:Ll/ۨ۬֫;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    :cond_4
    invoke-static {v1}, Ll/ۗ۬֫;->ܽ(Ll/ۗ۬֫;)Z

    move-result v2

    if-nez v2, :cond_5

    .line 167
    invoke-static {v1}, Ll/ۗ۬֫;->ۜ(Ll/ۗ۬֫;)V

    .line 168
    iget-object v2, p0, Ll/۬۬֫;->ᩳ:Ll/ۨ۬֫;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    :cond_5
    invoke-static {v1}, Ll/ۗ۬֫;->ᩳ(Ll/ۗ۬֫;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Ll/۬۬֫;->֫:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-static {v1}, Ll/ۗ۬֫;->ۧ(Ll/ۗ۬֫;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 171
    invoke-static {v1}, Ll/ۗ۬֫;->᩻(Ll/ۗ۬֫;)V

    .line 172
    iget-object v2, p0, Ll/۬۬֫;->ᩳ:Ll/ۨ۬֫;

    invoke-static {v1}, Ll/ۗ۬֫;->ᩳ(Ll/ۗ۬֫;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, p1, v1}, Ll/ۨ۬֫;->֫(Ll/֡۬֫;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 174
    :cond_6
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ܽ(Ll/֡۬֫;)V
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 178
    :try_start_0
    iget-object v1, p0, Ll/۬۬֫;->ᩳ:Ll/ۨ۬֫;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    iget-object v1, p0, Ll/۬۬֫;->ۧ:Ll/ۙ᩵֫;

    .line 180
    iget-object v2, p1, Ll/֡۬֫;->ۜ:Ll/ۙ᩵֫;

    iput-object v2, p0, Ll/۬۬֫;->ۧ:Ll/ۙ᩵֫;

    .line 181
    iget-object v2, p0, Ll/۬۬֫;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 182
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 183
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۗ۬֫;

    .line 184
    iget-object v4, p0, Ll/۬۬֫;->ۧ:Ll/ۙ᩵֫;

    invoke-virtual {v3, v1, v4}, Ll/ۗ۬֫;->֫(Ll/ۙ᩵֫;Ll/ۙ᩵֫;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 185
    invoke-virtual {v3, p1}, Ll/ۗ۬֫;->֫(Ll/֡۬֫;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 186
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 187
    invoke-static {v3}, Ll/ۗ۬֫;->ܽ(Ll/ۗ۬֫;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 188
    invoke-static {v3}, Ll/ۗ۬֫;->ᩳ(Ll/ۗ۬֫;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Ll/۬۬֫;->֫:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 189
    invoke-direct {p0, v3}, Ll/۬۬֫;->֫(Ll/ۗ۬֫;)V

    .line 191
    :cond_2
    iget-object v4, p0, Ll/۬۬֫;->ᩳ:Ll/ۨ۬֫;

    invoke-static {v3}, Ll/ۗ۬֫;->ᩳ(Ll/ۗ۬֫;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, p1, v3}, Ll/ۨ۬֫;->ۧ(Ll/֡۬֫;Ljava/lang/String;)V

    goto :goto_0

    .line 196
    :cond_3
    invoke-direct {p0, p1}, Ll/۬۬֫;->ᩳ(Ll/֡۬֫;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 197
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
