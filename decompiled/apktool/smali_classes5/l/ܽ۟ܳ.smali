.class public Ll/ܽ۟ܳ;
.super Ll/᩶ܶۢ;
.source "E2B3"


# static fields
.field public static final synthetic ܳۧ:I


# instance fields
.field public ֫ۧ:Ljava/lang/ThreadLocal;

.field public ۗ֫:Ll/᩹ۚۢ;

.field public ۛ֫:Ljava/util/concurrent/atomic/AtomicReference;

.field public ۟֫:Ljava/util/List;

.field public ۤ֫:Ll/ۙۤܳ;

.field public ۧۧ:Z

.field public ۨ֫:Ljava/util/concurrent/ExecutorService;

.field public ۫֫:Ll/ܶ۬ܳ;

.field public ۬֫:Ll/᩵۬ܳ;

.field public ܰ֫:Ljava/util/concurrent/locks/ReentrantLock;

.field public ܽۧ:Ljava/util/List;

.field public ܿۧ:Ll/᩹᩸ܿ;

.field public ᩳۧ:Ll/ۙ֡ܿ;

.field public ᩺֫:Ljava/util/HashSet;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 89
    invoke-direct {p0}, Ll/᩶ܶۢ;-><init>()V

    .line 90
    invoke-static {}, Ll/ۙ᩸᩷;->ۚ()Z

    move-result v0

    iput-boolean v0, p0, Ll/ܽ۟ܳ;->ۧۧ:Z

    .line 0
    invoke-static {}, Ll/ܽ᩷ᩳ;->ܽ()Ljava/util/List;

    move-result-object v0

    .line 91
    iput-object v0, p0, Ll/ܽ۟ܳ;->ܽۧ:Ljava/util/List;

    .line 94
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Ll/ܽ۟ܳ;->ۛ֫:Ljava/util/concurrent/atomic/AtomicReference;

    .line 0
    invoke-static {}, Ll/ܽ᩷ᩳ;->ܽ()Ljava/util/List;

    move-result-object v0

    .line 95
    iput-object v0, p0, Ll/ܽ۟ܳ;->۟֫:Ljava/util/List;

    .line 96
    new-instance v0, Ll/ۙ֡ܿ;

    invoke-direct {v0}, Ll/ۙ֡ܿ;-><init>()V

    iput-object v0, p0, Ll/ܽ۟ܳ;->ᩳۧ:Ll/ۙ֡ܿ;

    .line 97
    new-instance v0, Ll/᩹ۚۢ;

    invoke-direct {v0}, Ll/᩹ۚۢ;-><init>()V

    iput-object v0, p0, Ll/ܽ۟ܳ;->ۗ֫:Ll/᩹ۚۢ;

    .line 98
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Ll/ܽ۟ܳ;->֫ۧ:Ljava/lang/ThreadLocal;

    .line 99
    new-instance v0, Ll/ۙۤܳ;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/ۙۤܳ;-><init>(Z)V

    iput-object v0, p0, Ll/ܽ۟ܳ;->ۤ֫:Ll/ۙۤܳ;

    .line 100
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ܽ۟ܳ;->᩺֫:Ljava/util/HashSet;

    .line 101
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Ll/ܽ۟ܳ;->ܰ֫:Ljava/util/concurrent/locks/ReentrantLock;

    .line 102
    new-instance v0, Ll/֫۟ܳ;

    invoke-direct {v0, p0}, Ll/֫۟ܳ;-><init>(Ll/ܽ۟ܳ;)V

    iput-object v0, p0, Ll/ܽ۟ܳ;->ܿۧ:Ll/᩹᩸ܿ;

    .line 130
    new-instance v0, Ll/ۧ۟ܳ;

    invoke-direct {v0, p0}, Ll/ۧ۟ܳ;-><init>(Ll/ܽ۟ܳ;)V

    iput-object v0, p0, Ll/ܽ۟ܳ;->۬֫:Ll/᩵۬ܳ;

    return-void
.end method

.method private ۧ(Ll/֨۬ܳ;)V
    .locals 2

    .line 251
    iget-object v0, p0, Ll/ܽ۟ܳ;->ۨ֫:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/۟ܰܳ;

    invoke-direct {v1, p0, p1}, Ll/۟ܰܳ;-><init>(Ll/ܽ۟ܳ;Ll/֨۬ܳ;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 397
    invoke-virtual {p1}, Ll/֨۬ܳ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 398
    invoke-virtual {p1}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/֡۬ܳ;->᩶()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨۬ܳ;

    .line 399
    invoke-direct {p0, v0}, Ll/ܽ۟ܳ;->ۧ(Ll/֨۬ܳ;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ۧ(Ll/ܶ᩵ܿ;)V
    .locals 3

    const/4 v0, 0x1

    .line 413
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object p0

    .line 172
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ᩵ܿ;

    .line 173
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 174
    invoke-static {v1}, Ll/ܽ۟ܳ;->ۧ(Ll/ܶ᩵ܿ;)V

    goto :goto_0

    .line 176
    :cond_0
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    .line 217
    invoke-static {v1, v0}, Ll/ܳۤܳ;->֫(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 0

    .line 406
    invoke-virtual {p4}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p2}, Ll/ۘ۠ۢ;->ۧ(Ll/ܽۢܳ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 407
    invoke-virtual {p2}, Ll/ܽۢܳ;->ܳ()V

    .line 409
    :cond_0
    iget-object p1, p0, Ll/ܽ۟ܳ;->۟֫:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p0, p3}, Ll/ۘ۠ۢ;->֫(Ll/ܽۢܳ;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 410
    invoke-virtual {p3, p1}, Ll/ܽۢܳ;->֫(Ljava/util/Collection;)V

    .line 411
    invoke-virtual {p3}, Ll/ܽۢܳ;->ۖ֫()V

    :cond_1
    return-void
.end method

.method public final ۘ֫()Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "targetPath"

    .line 159
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۚ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120a2c

    .line 655
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()Ll/ۨܺ᩷;
    .locals 1

    .line 154
    sget-object v0, Ll/᩻ܶۢ;->ܿ:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public ۢ()Ll/ܿ۠ۢ;
    .locals 8

    const-string v0, "ARG_PATHS"

    .line 141
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const-string v1, "sourcePath"

    .line 189
    invoke-virtual {p0, v1}, Ll/ۘ۠ۢ;->۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "targetPath"

    .line 190
    invoke-virtual {p0, v2}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 192
    sget v3, Ll/ᩴܶܿ;->֫:I

    .line 294
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Ll/ᩴܶܿ;->֫(Ljava/io/File;)Ll/ۡܶܿ;

    move-result-object v3

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    .line 193
    invoke-virtual {v3}, Ll/ۡܶܿ;->֫ܽ()Ll/ۘܶܿ;

    move-result-object v3

    .line 461
    iget-object v3, v3, Ll/ۘܶܿ;->ܽ:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    .line 194
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v3

    iput-object v3, p0, Ll/ܽ۟ܳ;->ۨ֫:Ljava/util/concurrent/ExecutorService;

    goto :goto_0

    .line 380
    :cond_0
    sget-object v3, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v5, "optimize_external_storage_dt"

    invoke-interface {v3, v5, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 195
    invoke-static {v0}, Ll/ܺ᩺ܳ;->֫([Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/ܺ᩺ܳ;->֫([Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 196
    :cond_1
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v3

    iput-object v3, p0, Ll/ܽ۟ܳ;->ۨ֫:Ljava/util/concurrent/ExecutorService;

    goto :goto_0

    :cond_2
    const/4 v3, 0x3

    .line 198
    invoke-static {v3}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v3

    iput-object v3, p0, Ll/ܽ۟ܳ;->ۨ֫:Ljava/util/concurrent/ExecutorService;

    .line 0
    :goto_0
    instance-of v3, p0, Ll/ᩴ᩸᩻;

    const/4 v5, 0x0

    if-eqz v3, :cond_3

    .line 202
    sget-object v1, Ll/ܽ֨ۢ;->ۙ:Ll/ܽ֨ۢ;

    invoke-static {v2, v1}, Ll/ᩳ֨ۢ;->֫(Ljava/lang/String;Ll/ܽ֨ۢ;)V

    goto :goto_1

    .line 204
    :cond_3
    sget-object v6, Ll/ܽ֨ۢ;->ۙ:Ll/ܽ֨ۢ;

    .line 58
    invoke-static {v1, v6}, Ll/֫֨ۢ;->֫(Ljava/lang/String;Ll/ܽ֨ۢ;)Ll/֫֨ۢ;

    move-result-object v1

    invoke-static {v2, v6}, Ll/֫֨ۢ;->֫(Ljava/lang/String;Ll/ܽ֨ۢ;)Ll/֫֨ۢ;

    move-result-object v6

    const/4 v7, 0x2

    new-array v7, v7, [Ll/֫֨ۢ;

    aput-object v1, v7, v5

    aput-object v6, v7, v4

    invoke-static {v7}, Ll/ᩳ֨ۢ;->֫([Ll/֫֨ۢ;)V

    :goto_1
    new-array v1, v5, [Ljava/lang/String;

    .line 206
    invoke-static {v2, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۛ()V

    .line 207
    iget-object v1, p0, Ll/ܽ۟ܳ;->ۤ֫:Ll/ۙۤܳ;

    iget-object v5, p0, Ll/ܽ۟ܳ;->۬֫:Ll/᩵۬ܳ;

    invoke-static {v2, v1, v5}, Ll/ܶ۬ܳ;->֫(Ljava/lang/String;Ll/ۙۤܳ;Ll/᩵۬ܳ;)Ll/ܶ۬ܳ;

    move-result-object v1

    iput-object v1, p0, Ll/ܽ۟ܳ;->۫֫:Ll/ܶ۬ܳ;

    .line 208
    invoke-virtual {v1, v0}, Ll/ܶ۬ܳ;->֫([Ljava/lang/String;)V

    .line 209
    iget-object v0, p0, Ll/ܽ۟ܳ;->۫֫:Ll/ܶ۬ܳ;

    invoke-virtual {v0}, Ll/ܶ۬ܳ;->ۖ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨۬ܳ;

    .line 210
    invoke-virtual {v1}, Ll/֨۬ܳ;->ۢ()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 211
    invoke-virtual {v1}, Ll/֨۬ܳ;->ۢ()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v5, p0, Ll/ܽ۟ܳ;->۟֫:Ljava/util/List;

    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 212
    invoke-virtual {v1}, Ll/֨۬ܳ;->ۘ()Z

    move-result v2

    if-nez v2, :cond_6

    if-nez v3, :cond_5

    .line 214
    invoke-virtual {v1}, Ll/֨۬ܳ;->᩷()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/ܳۤܳ;->ᩳ(Ljava/lang/String;)V

    .line 216
    :cond_5
    invoke-virtual {v1}, Ll/֨۬ܳ;->ܺ()Ljava/lang/String;

    move-result-object v1

    .line 217
    invoke-static {v1, v4}, Ll/ܳۤܳ;->֫(Ljava/lang/String;Z)V

    goto :goto_2

    :cond_6
    if-nez v3, :cond_7

    .line 219
    invoke-virtual {v1}, Ll/֨۬ܳ;->᩷()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/ܳۤܳ;->ܿ(Ljava/lang/String;)V

    .line 221
    :cond_7
    invoke-virtual {v1}, Ll/֨۬ܳ;->ۡ()Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-static {v1}, Ll/ܽ۟ܳ;->ۧ(Ll/ܶ᩵ܿ;)V

    goto :goto_2

    .line 225
    :cond_8
    iget-object v0, p0, Ll/ܽ۟ܳ;->۫֫:Ll/ܶ۬ܳ;

    invoke-virtual {p0, v0}, Ll/᩶ܶۢ;->ۧ(Ll/᩷۫ܳ;)V

    .line 226
    invoke-virtual {p0, v4}, Ll/᩶ܶۢ;->ᩳ(Z)V

    .line 227
    iget-object v0, p0, Ll/ܽ۟ܳ;->ۗ֫:Ll/᩹ۚۢ;

    invoke-virtual {v0}, Ll/᩹ۚۢ;->֫()V

    .line 228
    iget-object v0, p0, Ll/ܽ۟ܳ;->ᩳۧ:Ll/ۙ֡ܿ;

    invoke-virtual {v0}, Ll/ۙ֡ܿ;->ۧ()V

    .line 229
    iget-object v0, p0, Ll/ܽ۟ܳ;->۫֫:Ll/ܶ۬ܳ;

    invoke-virtual {v0}, Ll/ܶ۬ܳ;->ܺ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨۬ܳ;

    .line 230
    invoke-direct {p0, v1}, Ll/ܽ۟ܳ;->ۧ(Ll/֨۬ܳ;)V

    goto :goto_3

    .line 232
    :cond_9
    iget-object v0, p0, Ll/ܽ۟ܳ;->ۨ֫:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0}, Ll/֫ۨۡ;->֫(Ljava/util/concurrent/ExecutorService;)V

    .line 233
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 234
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    .line 236
    :cond_a
    iget-object v0, p0, Ll/ܽ۟ܳ;->ۛ֫:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_d

    .line 240
    iget-object v0, p0, Ll/ܽ۟ܳ;->۫֫:Ll/ܶ۬ܳ;

    invoke-virtual {v0}, Ll/ܶ۬ܳ;->ܺ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨۬ܳ;

    .line 241
    invoke-static {v1}, Ll/ᩳ۟ܳ;->֫(Ll/֨۬ܳ;)V

    goto :goto_4

    .line 243
    :cond_b
    iget-object v0, p0, Ll/ܽ۟ܳ;->ܽۧ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    .line 244
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_5

    :cond_c
    const-wide/16 v0, 0x64

    .line 246
    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    .line 247
    invoke-static {}, Ll/ܿ۠ۢ;->ܳ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    .line 237
    :cond_d
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    throw v0
.end method

.method public ۧ(Ll/ܿ۠ۢ;)V
    .locals 0

    .line 417
    iget-object p1, p0, Ll/ܽ۟ܳ;->ۨ֫:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result p1

    if-nez p1, :cond_0

    .line 418
    iget-object p1, p0, Ll/ܽ۟ܳ;->ۨ֫:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 420
    :cond_0
    iget-object p1, p0, Ll/ܽ۟ܳ;->ᩳۧ:Ll/ۙ֡ܿ;

    invoke-virtual {p1}, Ll/ۙ֡ܿ;->ܽ()V

    .line 421
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    .line 422
    invoke-static {}, Ll/ۡᩴܳ;->᩻()V

    return-void
.end method

.method public ᩷()V
    .locals 1

    const v0, 0x7f120647

    .line 164
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    const-string v0, "..."

    .line 165
    invoke-virtual {p0, v0}, Ll/᩶ܶۢ;->ۧ(Ljava/lang/CharSequence;)V

    return-void
.end method
