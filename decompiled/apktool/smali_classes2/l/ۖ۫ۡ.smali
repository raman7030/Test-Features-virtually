.class public final Ll/ۖ۫ۡ;
.super Ljava/lang/Object;
.source "28V5"


# static fields
.field public static final ۜ:I

.field public static final ܳ:Landroid/util/LruCache;

.field public static final synthetic ܿ:I

.field public static final ᩻:[C


# instance fields
.field public final ֫:Z

.field public final ۧ:Ll/ܺ۫ۡ;

.field public final ܽ:Ljava/util/concurrent/atomic/AtomicIntegerArray;

.field public final ᩳ:Landroid/graphics/Typeface;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"

    .line 16
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Ll/ۖ۫ۡ;->᩻:[C

    .line 17
    array-length v0, v0

    sput v0, Ll/ۖ۫ۡ;->ۜ:I

    .line 23
    new-instance v0, Landroid/util/LruCache;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Landroid/util/LruCache;-><init>(I)V

    sput-object v0, Ll/ۖ۫ۡ;->ܳ:Landroid/util/LruCache;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Typeface;)V
    .locals 4

    .line 44
    sget-object v0, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {v0, p1}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Ll/ܺ۫ۡ;

    invoke-direct {v1, p1}, Ll/ܺ۫ۡ;-><init>(Landroid/graphics/Typeface;)V

    .line 50
    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v2, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    sget v3, Ll/ۖ۫ۡ;->ۜ:I

    mul-int v3, v3, v3

    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicIntegerArray;-><init>(I)V

    iput-object v2, p0, Ll/ۖ۫ۡ;->ܽ:Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 51
    iput-object p1, p0, Ll/ۖ۫ۡ;->ᩳ:Landroid/graphics/Typeface;

    .line 52
    iput-object v1, p0, Ll/ۖ۫ۡ;->ۧ:Ll/ܺ۫ۡ;

    .line 53
    invoke-virtual {v0, p1}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    move-result p1

    iput-boolean p1, p0, Ll/ۖ۫ۡ;->֫:Z

    return-void
.end method

.method public static ֫(C)I
    .locals 2

    const/16 v0, 0x61

    if-gt v0, p0, :cond_0

    const/16 v1, 0x7a

    if-gt p0, v1, :cond_0

    sub-int/2addr p0, v0

    return p0

    :cond_0
    const/16 v0, 0x41

    if-gt v0, p0, :cond_1

    const/16 v0, 0x5a

    if-gt p0, v0, :cond_1

    add-int/lit8 p0, p0, -0x27

    return p0

    :cond_1
    add-int/lit8 p0, p0, 0x4

    return p0
.end method

.method public static declared-synchronized ֫(Landroid/graphics/Typeface;)Ll/ۖ۫ۡ;
    .locals 3

    .line 2
    const-class v0, Ll/ۖ۫ۡ;

    .line 3
    monitor-enter v0

    if-nez p0, :cond_0

    .line 32
    :try_start_0
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 34
    :cond_0
    sget-object v1, Ll/ۖ۫ۡ;->ܳ:Landroid/util/LruCache;

    invoke-virtual {v1, p0}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖ۫ۡ;

    if-nez v2, :cond_1

    .line 36
    new-instance v2, Ll/ۖ۫ۡ;

    invoke-direct {v2, p0}, Ll/ۖ۫ۡ;-><init>(Landroid/graphics/Typeface;)V

    .line 37
    invoke-virtual {v1, p0, v2}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    :cond_1
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static bridge synthetic ֫()[C
    .locals 1

    .line 0
    sget-object v0, Ll/ۖ۫ۡ;->᩻:[C

    return-object v0
.end method

.method public static bridge synthetic ۧ()I
    .locals 1

    .line 0
    sget v0, Ll/ۖ۫ۡ;->ۜ:I

    return v0
.end method


# virtual methods
.method public final ֫(CC)Z
    .locals 7

    .line 62
    iget-boolean v0, p0, Ll/ۖ۫ۡ;->֫:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    const/16 v0, 0x5a

    const/16 v2, 0x41

    const/16 v3, 0x7a

    const/16 v4, 0x61

    if-gt v4, p1, :cond_1

    if-gt p1, v3, :cond_1

    add-int/lit8 v5, p1, -0x61

    goto :goto_0

    :cond_1
    if-gt v2, p1, :cond_2

    if-gt p1, v0, :cond_2

    add-int/lit8 v5, p1, -0x27

    goto :goto_0

    :cond_2
    add-int/lit8 v5, p1, 0x4

    .line 66
    :goto_0
    sget v6, Ll/ۖ۫ۡ;->ۜ:I

    mul-int v5, v5, v6

    if-gt v4, p2, :cond_3

    if-gt p2, v3, :cond_3

    add-int/lit8 v0, p2, -0x61

    goto :goto_1

    :cond_3
    if-gt v2, p2, :cond_4

    if-gt p2, v0, :cond_4

    add-int/lit8 v0, p2, -0x27

    goto :goto_1

    :cond_4
    add-int/lit8 v0, p2, 0x4

    :goto_1
    add-int/2addr v5, v0

    .line 67
    iget-object v0, p0, Ll/ۖ۫ۡ;->ܽ:Ljava/util/concurrent/atomic/AtomicIntegerArray;

    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->get(I)I

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_6

    if-ne v2, v1, :cond_5

    :goto_2
    return v1

    :cond_5
    return v3

    :cond_6
    const/4 v2, 0x2

    .line 74
    :try_start_0
    iget-object v4, p0, Ll/ۖ۫ۡ;->ۧ:Ll/ܺ۫ۡ;

    invoke-virtual {v4, p1, p2}, Ll/ܺ۫ۡ;->֫(CC)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_7

    const/4 v2, 0x1

    goto :goto_3

    :catch_0
    nop

    .line 80
    :cond_7
    :goto_3
    invoke-virtual {v0, v5, v3, v2}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->compareAndSet(III)Z

    move-result p1

    if-nez p1, :cond_8

    .line 81
    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->get(I)I

    move-result v2

    :cond_8
    if-ne v2, v1, :cond_9

    goto :goto_4

    :cond_9
    const/4 v1, 0x0

    :goto_4
    return v1
.end method
