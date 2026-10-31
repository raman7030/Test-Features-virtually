.class public final Ll/ۡۤۡ;
.super Ljava/lang/Object;
.source "J2BI"


# instance fields
.field public ֫:J

.field public final ۧ:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput p1, p0, Ll/ۡۤۡ;->ۧ:I

    return-void
.end method

.method public static ֫(I)Ll/ۡۤۡ;
    .locals 1

    .line 45
    new-instance v0, Ll/ۡۤۡ;

    invoke-direct {v0, p0}, Ll/ۡۤۡ;-><init>(I)V

    return-object v0
.end method

.method public static ܳ()Ll/ۡۤۡ;
    .locals 2

    .line 24
    new-instance v0, Ll/ۡۤۡ;

    const/16 v1, 0x7d0

    invoke-direct {v0, v1}, Ll/ۡۤۡ;-><init>(I)V

    return-object v0
.end method

.method public static ܿ()Ll/ۡۤۡ;
    .locals 2

    .line 31
    new-instance v0, Ll/ۡۤۡ;

    const/16 v1, 0xfa

    invoke-direct {v0, v1}, Ll/ۡۤۡ;-><init>(I)V

    return-object v0
.end method

.method public static ᩳ()Ll/ۡۤۡ;
    .locals 2

    .line 38
    new-instance v0, Ll/ۡۤۡ;

    const/16 v1, 0x96

    invoke-direct {v0, v1}, Ll/ۡۤۡ;-><init>(I)V

    return-object v0
.end method

.method public static ᩻()Ll/ۡۤۡ;
    .locals 2

    .line 17
    new-instance v0, Ll/ۡۤۡ;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ll/ۡۤۡ;-><init>(I)V

    return-object v0
.end method


# virtual methods
.method public final ֫()Z
    .locals 1

    .line 49
    invoke-virtual {p0}, Ll/ۡۤۡ;->ܽ()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ۧ()V
    .locals 2

    .line 66
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۡۤۡ;->֫:J

    return-void
.end method

.method public final declared-synchronized ܽ()Z
    .locals 8

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 53
    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    .line 54
    iget-wide v3, p0, Ll/ۡۤۡ;->֫:J

    sub-long v3, v1, v3

    iget v5, p0, Ll/ۡۤۡ;->ۧ:I

    int-to-long v5, v5

    cmp-long v7, v3, v5

    if-lez v7, :cond_0

    .line 55
    iput-wide v1, p0, Ll/ۡۤۡ;->֫:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    monitor-exit v0

    const/4 v0, 0x0

    return v0

    .line 58
    :cond_0
    monitor-exit v0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
