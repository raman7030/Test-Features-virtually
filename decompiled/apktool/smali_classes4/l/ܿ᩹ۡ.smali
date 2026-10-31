.class public final Ll/ܿ᩹ۡ;
.super Ljava/lang/Object;
.source "N9T7"


# instance fields
.field public final ֫:[I

.field public final ۧ:Ljava/util/concurrent/locks/Condition;

.field public final ܽ:Ljava/util/concurrent/locks/Condition;

.field public final ܿ:Ljava/util/concurrent/locks/Lock;

.field public final ᩳ:I


# direct methods
.method public constructor <init>(ILjava/util/concurrent/locks/ReentrantLock;Ljava/util/concurrent/locks/Condition;Ljava/util/concurrent/locks/Condition;[I)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput p1, p0, Ll/ܿ᩹ۡ;->ᩳ:I

    .line 20
    iput-object p2, p0, Ll/ܿ᩹ۡ;->ܿ:Ljava/util/concurrent/locks/Lock;

    .line 21
    iput-object p3, p0, Ll/ܿ᩹ۡ;->ۧ:Ljava/util/concurrent/locks/Condition;

    .line 22
    iput-object p4, p0, Ll/ܿ᩹ۡ;->ܽ:Ljava/util/concurrent/locks/Condition;

    .line 24
    iput-object p5, p0, Ll/ܿ᩹ۡ;->֫:[I

    return-void
.end method

.method public static ܽ()[Ll/ܿ᩹ۡ;
    .locals 15

    const/4 v0, 0x2

    new-array v1, v0, [Ll/ܿ᩹ۡ;

    .line 35
    new-instance v8, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v8}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    new-array v9, v0, [Ljava/util/concurrent/locks/Condition;

    const/4 v10, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 38
    invoke-virtual {v8}, Ljava/util/concurrent/locks/ReentrantLock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object v3

    aput-object v3, v9, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 40
    :cond_0
    filled-new-array {v10}, [I

    move-result-object v11

    const/4 v2, 0x0

    const/4 v12, 0x0

    :goto_1
    if-ge v12, v0, :cond_2

    .line 42
    aget-object v5, v9, v12

    add-int/lit8 v13, v12, 0x1

    if-ne v13, v0, :cond_1

    .line 43
    aget-object v2, v9, v10

    goto :goto_2

    :cond_1
    aget-object v2, v9, v13

    :goto_2
    move-object v6, v2

    .line 44
    new-instance v14, Ll/ܿ᩹ۡ;

    move-object v2, v14

    move v3, v12

    move-object v4, v8

    move-object v7, v11

    invoke-direct/range {v2 .. v7}, Ll/ܿ᩹ۡ;-><init>(ILjava/util/concurrent/locks/ReentrantLock;Ljava/util/concurrent/locks/Condition;Ljava/util/concurrent/locks/Condition;[I)V

    aput-object v14, v1, v12

    move v12, v13

    goto :goto_1

    :cond_2
    return-object v1
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 57
    iget-object v0, p0, Ll/ܿ᩹ۡ;->ܿ:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 58
    iget-object v0, p0, Ll/ܿ᩹ۡ;->֫:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    rem-int/lit8 v0, v0, 0x2

    iget v1, p0, Ll/ܿ᩹ۡ;->ᩳ:I

    if-eq v0, v1, :cond_0

    .line 59
    iget-object v0, p0, Ll/ܿ᩹ۡ;->ۧ:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->await()V

    :cond_0
    return-void
.end method

.method public final ۧ()V
    .locals 4

    .line 64
    iget-object v0, p0, Ll/ܿ᩹ۡ;->ܿ:Ljava/util/concurrent/locks/Lock;

    .line 69
    :try_start_0
    iget-object v1, p0, Ll/ܿ᩹ۡ;->֫:[I

    const/4 v2, 0x0

    aget v3, v1, v2

    add-int/lit8 v3, v3, 0x1

    aput v3, v1, v2

    .line 70
    iget-object v1, p0, Ll/ܿ᩹ۡ;->ܽ:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Condition;->signal()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 73
    throw v1
.end method
