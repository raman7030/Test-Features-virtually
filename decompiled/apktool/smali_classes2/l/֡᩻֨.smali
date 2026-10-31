.class public final Ll/֡᩻֨;
.super Ljava/lang/Object;
.source "0CLW"


# instance fields
.field public final ֫:[Ljava/lang/Object;

.field public ۧ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x200

    new-array v0, v0, [Ljava/lang/Object;

    .line 61
    iput-object v0, p0, Ll/֡᩻֨;->֫:[Ljava/lang/Object;

    const/4 v0, 0x0

    .line 75
    iput v0, p0, Ll/֡᩻֨;->ۧ:I

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ll/֡᩻֨;-><init>()V

    return-void
.end method


# virtual methods
.method public final declared-synchronized ֫()Ljava/lang/Object;
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 82
    :try_start_0
    iget-object v1, p0, Ll/֡᩻֨;->֫:[Ljava/lang/Object;

    iget v2, p0, Ll/֡᩻֨;->ۧ:I

    aget-object v3, v1, v2

    const/4 v4, 0x0

    .line 83
    aput-object v4, v1, v2

    add-int/lit8 v2, v2, -0x1

    and-int/lit16 v1, v2, 0x1ff

    .line 84
    iput v1, p0, Ll/֡᩻֨;->ۧ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    monitor-exit v0

    return-object v3

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ֫(Ljava/lang/ref/SoftReference;)V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 93
    :try_start_0
    iget v1, p0, Ll/֡᩻֨;->ۧ:I

    add-int/lit8 v1, v1, 0x1

    and-int/lit16 v1, v1, 0x1ff

    iput v1, p0, Ll/֡᩻֨;->ۧ:I

    .line 94
    iget-object v2, p0, Ll/֡᩻֨;->֫:[Ljava/lang/Object;

    aput-object p1, v2, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
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
