.class public final Ll/᩺۟᩵;
.super Ll/ܽ֫֡;
.source "A4DP"


# instance fields
.field public final synthetic ᩶:Ll/ܰ۟᩵;


# direct methods
.method public constructor <init>(Ll/ܰ۟᩵;Ll/ۚᩳ֡;)V
    .locals 0

    .line 904
    iput-object p1, p0, Ll/᩺۟᩵;->᩶:Ll/ܰ۟᩵;

    .line 28
    invoke-direct {p0, p2}, Ll/᩺ܽ֡;-><init>(Ll/ۚᩳ֡;)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 906
    iget-object v0, p0, Ll/᩺۟᩵;->᩶:Ll/ܰ۟᩵;

    iget-object v0, v0, Ll/ܰ۟᩵;->ܽ:Ll/ۧ֫֡;

    monitor-enter v0

    .line 907
    :try_start_0
    iget-object v1, p0, Ll/᩺۟᩵;->᩶:Ll/ܰ۟᩵;

    invoke-virtual {v1}, Ll/ܰ۟᩵;->ܽ()V

    .line 908
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
