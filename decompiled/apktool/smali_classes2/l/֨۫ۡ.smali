.class public final Ll/֨۫ۡ;
.super Ljava/lang/Object;
.source "GAQ7"


# instance fields
.field public final synthetic ֫:I

.field public ۧ:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ll/֨۫ۡ;->֫:I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Ll/֡ۛۡ;

    invoke-direct {v0}, Ll/֡ۛۡ;-><init>()V

    iput-object v0, p0, Ll/֨۫ۡ;->ۧ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll/ۛܳۘ;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ll/֨۫ۡ;->֫:I

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Ll/֨۫ۡ;->ۧ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 2
    iget v0, p0, Ll/֨۫ۡ;->֫:I

    packed-switch v0, :pswitch_data_0

    .line 8
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 76
    :pswitch_0
    iget-object v0, p0, Ll/֨۫ۡ;->ۧ:Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public ֫()Ljava/lang/Object;
    .locals 1

    .line 58
    iget-object v0, p0, Ll/֨۫ۡ;->ۧ:Ljava/lang/Object;

    return-object v0
.end method

.method public declared-synchronized ֫(Ljava/util/ArrayList;)V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 34
    :try_start_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/16 v2, 0x1000

    if-ge v1, v2, :cond_0

    iget-object v1, p0, Ll/֨۫ۡ;->ۧ:Ljava/lang/Object;

    check-cast v1, Ll/֡ۛۡ;

    invoke-virtual {v1}, Ll/֡ۛۡ;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 35
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 36
    iget-object v1, p0, Ll/֨۫ۡ;->ۧ:Ljava/lang/Object;

    check-cast v1, Ll/֡ۛۡ;

    invoke-virtual {v1, p1}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    :cond_0
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

.method public declared-synchronized ۧ()Ljava/util/ArrayList;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 26
    :try_start_0
    iget-object v1, p0, Ll/֨۫ۡ;->ۧ:Ljava/lang/Object;

    check-cast v1, Ll/֡ۛۡ;

    invoke-virtual {v1}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    if-nez v1, :cond_0

    .line 28
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    :cond_0
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
