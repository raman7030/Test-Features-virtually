.class public abstract Ll/֨ۖ֨;
.super Ljava/lang/Object;
.source "R7L8"

# interfaces
.implements Ll/᩻ۖ֨;


# direct methods
.method public static declared-synchronized ֫()Ll/֨ۖ֨;
    .locals 2

    .line 2
    const-class v0, Ll/֨ۖ֨;

    .line 3
    monitor-enter v0

    .line 51
    :try_start_0
    new-instance v1, Ll/ۚۖ֨;

    .line 41
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
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


# virtual methods
.method public abstract ֫(Ljava/lang/String;)Z
.end method
