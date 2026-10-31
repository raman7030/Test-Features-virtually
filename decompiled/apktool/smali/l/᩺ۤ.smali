.class public final Ll/᩺ۤ;
.super Ll/ۨۤ;
.source "R5O3"


# instance fields
.field public final ܽ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 123
    invoke-direct {p0, p1}, Ll/ۨۤ;-><init>(I)V

    .line 124
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ۤ;->ܽ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 2

    .line 126
    iget-object v0, p0, Ll/᩺ۤ;->ܽ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-super {p0}, Ll/ۨۤ;->֫()Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final ֫(Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "instance"

    .line 130
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ll/᩺ۤ;->ܽ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-super {p0, p1}, Ll/ۨۤ;->֫(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method
