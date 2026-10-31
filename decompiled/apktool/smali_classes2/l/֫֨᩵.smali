.class public final Ll/֫֨᩵;
.super Ll/ۛۚ᩵;
.source "F9W6"


# instance fields
.field public ᩳ֫:Ll/᩺ۚ᩵;


# direct methods
.method public constructor <init>(Ll/᩺ۚ᩵;Ll/ۘ֨᩵;)V
    .locals 1

    .line 37
    invoke-virtual {p1}, Ll/᩺ۚ᩵;->᩻()Ll/ۨۚ᩵;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Ll/ۛۚ᩵;-><init>(Ll/ۨۚ᩵;Ll/ۘ֨᩵;)V

    .line 38
    iput-object p1, p0, Ll/֫֨᩵;->ᩳ֫:Ll/᩺ۚ᩵;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    return-void
.end method

.method public final isOpen()Z
    .locals 1

    .line 49
    iget-object v0, p0, Ll/֫֨᩵;->ᩳ֫:Ll/᩺ۚ᩵;

    invoke-virtual {v0}, Ll/᩺ۚ᩵;->isOpen()Z

    move-result v0

    return v0
.end method

.method public final declared-synchronized ֫()Ll/۫ۚ᩵;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 61
    :try_start_0
    iget-object v1, p0, Ll/֫֨᩵;->ᩳ֫:Ll/᩺ۚ᩵;

    invoke-virtual {v1}, Ll/᩺ۚ᩵;->֫()Ll/۫ۚ᩵;

    move-result-object v1
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
