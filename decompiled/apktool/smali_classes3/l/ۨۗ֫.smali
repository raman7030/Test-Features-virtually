.class public final Ll/ۨۗ֫;
.super Ljava/lang/Object;
.source "Z8PT"


# instance fields
.field public ֫:Z

.field public ۧ:Landroid/os/Looper;

.field public ܳ:I

.field public ܽ:Ljava/lang/Object;

.field public final ܿ:Ll/ۛۗ֫;

.field public final ᩳ:Ll/ۤۗ֫;


# direct methods
.method public constructor <init>(Ll/ۤۗ֫;Ll/ۛۗ֫;Ll/ۙ᩵֫;ILl/ܳ֨֫;Landroid/os/Looper;)V
    .locals 0

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    iput-object p1, p0, Ll/ۨۗ֫;->ᩳ:Ll/ۤۗ֫;

    .line 102
    iput-object p2, p0, Ll/ۨۗ֫;->ܿ:Ll/ۛۗ֫;

    .line 104
    iput-object p6, p0, Ll/ۨۗ֫;->ۧ:Landroid/os/Looper;

    return-void
.end method


# virtual methods
.method public final ֫()Landroid/os/Looper;
    .locals 1

    .line 176
    iget-object v0, p0, Ll/ۨۗ֫;->ۧ:Landroid/os/Looper;

    return-object v0
.end method

.method public final ֫(I)V
    .locals 1

    .line 130
    iget-boolean v0, p0, Ll/ۨۗ֫;->֫:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 131
    iput p1, p0, Ll/ۨۗ֫;->ܳ:I

    return-void
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 1

    .line 149
    iget-boolean v0, p0, Ll/ۨۗ֫;->֫:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 150
    iput-object p1, p0, Ll/ۨۗ֫;->ܽ:Ljava/lang/Object;

    return-void
.end method

.method public final declared-synchronized ֫(Z)V
    .locals 1

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 304
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 305
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

.method public final ۧ()Ljava/lang/Object;
    .locals 1

    .line 157
    iget-object v0, p0, Ll/ۨۗ֫;->ܽ:Ljava/lang/Object;

    return-object v0
.end method

.method public final ܽ()Ll/ۛۗ֫;
    .locals 1

    .line 118
    iget-object v0, p0, Ll/ۨۗ֫;->ܿ:Ll/ۛۗ֫;

    return-object v0
.end method

.method public final ܿ()V
    .locals 2

    .line 265
    iget-boolean v0, p0, Ll/ۨۗ֫;->֫:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 269
    iput-boolean v1, p0, Ll/ۨۗ֫;->֫:Z

    .line 270
    iget-object v0, p0, Ll/ۨۗ֫;->ᩳ:Ll/ۤۗ֫;

    check-cast v0, Ll/᩶ۙ֫;

    invoke-virtual {v0, p0}, Ll/᩶ۙ֫;->֫(Ll/ۨۗ֫;)V

    return-void
.end method

.method public final ᩳ()I
    .locals 1

    .line 137
    iget v0, p0, Ll/ۨۗ֫;->ܳ:I

    return v0
.end method
