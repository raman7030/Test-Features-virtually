.class public Lcom/umeng/analytics/process/c$a;
.super Ljava/lang/Object;
.source "EBML"


# instance fields
.field public a:Ljava/util/concurrent/atomic/AtomicInteger;

.field public b:Landroid/database/sqlite/SQLiteOpenHelper;

.field public c:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lcom/umeng/analytics/process/c$a;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Lcom/umeng/analytics/process/c$a;
    .locals 1

    .line 88
    invoke-static {p0}, Lcom/umeng/commonsdk/service/UMGlobalContext;->getAppContext(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    .line 90
    new-instance v0, Lcom/umeng/analytics/process/c$a;

    invoke-direct {v0}, Lcom/umeng/analytics/process/c$a;-><init>()V

    .line 91
    invoke-static {p0, p1}, Lcom/umeng/analytics/process/b;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/umeng/analytics/process/b;

    move-result-object p0

    iput-object p0, v0, Lcom/umeng/analytics/process/c$a;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a()Landroid/database/sqlite/SQLiteDatabase;
    .locals 3

    move-object v0, p0

    monitor-enter v0

    .line 97
    :try_start_0
    iget-object v1, p0, Lcom/umeng/analytics/process/c$a;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 98
    iget-object v1, p0, Lcom/umeng/analytics/process/c$a;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    iput-object v1, p0, Lcom/umeng/analytics/process/c$a;->c:Landroid/database/sqlite/SQLiteDatabase;

    .line 100
    :cond_0
    iget-object v1, p0, Lcom/umeng/analytics/process/c$a;->c:Landroid/database/sqlite/SQLiteDatabase;
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

.method public declared-synchronized b()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 105
    :try_start_0
    iget-object v1, p0, Lcom/umeng/analytics/process/c$a;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v1

    if-nez v1, :cond_0

    .line 106
    iget-object v1, p0, Lcom/umeng/analytics/process/c$a;->c:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    :catchall_0
    :cond_0
    monitor-exit v0

    return-void
.end method
