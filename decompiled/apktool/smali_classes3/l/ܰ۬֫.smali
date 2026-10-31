.class public final Ll/ܰ۬֫;
.super Ljava/lang/Object;
.source "N8HX"


# instance fields
.field public final ֫:Ljava/lang/Object;

.field public final ۧ:Ll/᩺۬֫;

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 36
    new-instance v0, Ll/ܰ۬֫;

    const-string v1, ""

    invoke-direct {v0, v1}, Ll/ܰ۬֫;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object p1, p0, Ll/ܰ۬֫;->ܽ:Ljava/lang/String;

    .line 58
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1f

    if-lt p1, v0, :cond_0

    new-instance p1, Ll/᩺۬֫;

    invoke-direct {p1}, Ll/᩺۬֫;-><init>()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Ll/ܰ۬֫;->ۧ:Ll/᩺۬֫;

    .line 59
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ۬֫;->֫:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 67
    :cond_0
    instance-of v1, p1, Ll/ܰ۬֫;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 70
    :cond_1
    check-cast p1, Ll/ܰ۬֫;

    .line 71
    iget-object v1, p0, Ll/ܰ۬֫;->ܽ:Ljava/lang/String;

    iget-object v3, p1, Ll/ܰ۬֫;->ܽ:Ljava/lang/String;

    invoke-static {v1, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/ܰ۬֫;->ۧ:Ll/᩺۬֫;

    iget-object v3, p1, Ll/ܰ۬֫;->ۧ:Ll/᩺۬֫;

    .line 72
    invoke-static {v1, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/ܰ۬֫;->֫:Ljava/lang/Object;

    iget-object p1, p1, Ll/ܰ۬֫;->֫:Ljava/lang/Object;

    .line 73
    invoke-static {v1, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 78
    iget-object v2, p0, Ll/ܰ۬֫;->ܽ:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Ll/ܰ۬֫;->ۧ:Ll/᩺۬֫;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Ll/ܰ۬֫;->֫:Ljava/lang/Object;

    aput-object v2, v0, v1

    invoke-static {v0}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final declared-synchronized ֫()Landroid/media/metrics/LogSessionId;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 84
    :try_start_0
    iget-object v1, p0, Ll/ܰ۬֫;->ۧ:Ll/᩺۬֫;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    iget-object v1, v1, Ll/᩺۬֫;->֫:Landroid/media/metrics/LogSessionId;
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

.method public final declared-synchronized ֫(Landroid/media/metrics/LogSessionId;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 94
    :try_start_0
    iget-object v1, p0, Ll/ܰ۬֫;->ۧ:Ll/᩺۬֫;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    invoke-virtual {v1, p1}, Ll/᩺۬֫;->֫(Landroid/media/metrics/LogSessionId;)V
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
