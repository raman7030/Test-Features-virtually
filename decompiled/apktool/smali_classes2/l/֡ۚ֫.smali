.class public abstract Ll/֡ۚ֫;
.super Ljava/lang/Object;
.source "R4WE"


# instance fields
.field public ֫:Z

.field public ۧ:Z

.field public ܽ:[Ljava/lang/String;


# direct methods
.method public varargs constructor <init>([Ljava/lang/String;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Ll/֡ۚ֫;->ܽ:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public abstract ֫(Ljava/lang/String;)V
.end method

.method public final declared-synchronized ֫()Z
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 48
    :try_start_0
    iget-boolean v1, p0, Ll/֡ۚ֫;->ۧ:Z

    if-eqz v1, :cond_0

    .line 49
    iget-boolean v1, p0, Ll/֡ۚ֫;->֫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :cond_0
    const/4 v1, 0x1

    .line 51
    :try_start_1
    iput-boolean v1, p0, Ll/֡ۚ֫;->ۧ:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    :try_start_2
    iget-object v2, p0, Ll/֡ۚ֫;->ܽ:[Ljava/lang/String;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    .line 54
    invoke-virtual {p0, v5}, Ll/֡ۚ֫;->֫(Ljava/lang/String;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 56
    :cond_1
    iput-boolean v1, p0, Ll/֡ۚ֫;->֫:Z
    :try_end_2
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 60
    :catch_0
    :try_start_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to load "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/֡ۚ֫;->ܽ:[Ljava/lang/String;

    invoke-static {v2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 62
    :goto_1
    iget-boolean v1, p0, Ll/֡ۚ֫;->֫:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v1
.end method
