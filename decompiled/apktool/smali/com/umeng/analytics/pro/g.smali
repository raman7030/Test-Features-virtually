.class public Lcom/umeng/analytics/pro/g;
.super Ljava/lang/Object;
.source "V59J"


# static fields
.field public static b:Landroid/database/sqlite/SQLiteOpenHelper;

.field public static d:Landroid/content/Context;


# instance fields
.field public a:Ljava/util/concurrent/atomic/AtomicInteger;

.field public c:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lcom/umeng/analytics/pro/g;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/umeng/analytics/pro/g$1;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/umeng/analytics/pro/g;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/umeng/analytics/pro/g;
    .locals 1

    .line 31
    sget-object v0, Lcom/umeng/analytics/pro/g;->d:Landroid/content/Context;

    if-nez v0, :cond_0

    if-eqz p0, :cond_0

    .line 33
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sput-object p0, Lcom/umeng/analytics/pro/g;->d:Landroid/content/Context;

    .line 34
    invoke-static {p0}, Lcom/umeng/analytics/pro/f;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/f;

    move-result-object p0

    sput-object p0, Lcom/umeng/analytics/pro/g;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    .line 37
    :cond_0
    invoke-static {}, Lcom/umeng/analytics/pro/g$a;->a()Lcom/umeng/analytics/pro/g;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public declared-synchronized a()Landroid/database/sqlite/SQLiteDatabase;
    .locals 3

    move-object v0, p0

    monitor-enter v0

    .line 41
    :try_start_0
    iget-object v1, p0, Lcom/umeng/analytics/pro/g;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 43
    sget-object v1, Lcom/umeng/analytics/pro/g;->b:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    iput-object v1, p0, Lcom/umeng/analytics/pro/g;->c:Landroid/database/sqlite/SQLiteDatabase;

    .line 45
    :cond_0
    iget-object v1, p0, Lcom/umeng/analytics/pro/g;->c:Landroid/database/sqlite/SQLiteDatabase;
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

    .line 50
    :try_start_0
    iget-object v1, p0, Lcom/umeng/analytics/pro/g;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v1

    if-nez v1, :cond_0

    .line 52
    iget-object v1, p0, Lcom/umeng/analytics/pro/g;->c:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteClosable;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    :catchall_0
    :cond_0
    monitor-exit v0

    return-void
.end method
