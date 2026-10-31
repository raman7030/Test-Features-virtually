.class public final Ll/ܰ᩹;
.super Landroid/app/job/JobServiceEngine;
.source "268P"


# instance fields
.field public final ֫:Ljava/lang/Object;

.field public ۧ:Landroid/app/job/JobParameters;

.field public final ܽ:Ll/ۧ᩶;


# direct methods
.method public constructor <init>(Ll/ۧ᩶;)V
    .locals 1

    .line 279
    invoke-direct {p0, p1}, Landroid/app/job/JobServiceEngine;-><init>(Landroid/app/Service;)V

    .line 253
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ܰ᩹;->֫:Ljava/lang/Object;

    .line 280
    iput-object p1, p0, Ll/ܰ᩹;->ܽ:Ll/ۧ᩶;

    return-void
.end method


# virtual methods
.method public final onStartJob(Landroid/app/job/JobParameters;)Z
    .locals 1

    .line 291
    iput-object p1, p0, Ll/ܰ᩹;->ۧ:Landroid/app/job/JobParameters;

    .line 293
    iget-object p1, p0, Ll/ܰ᩹;->ܽ:Ll/ۧ᩶;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ۧ᩶;->֫(Z)V

    const/4 p1, 0x1

    return p1
.end method

.method public final onStopJob(Landroid/app/job/JobParameters;)Z
    .locals 1

    .line 300
    iget-object p1, p0, Ll/ܰ᩹;->ܽ:Ll/ۧ᩶;

    .line 603
    iget-object p1, p1, Ll/ۧ᩶;->᩶:Ll/۫᩹;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 604
    invoke-virtual {p1, v0}, Landroid/os/AsyncTask;->cancel(Z)Z

    .line 301
    :cond_0
    iget-object p1, p0, Ll/ܰ᩹;->֫:Ljava/lang/Object;

    move-object v0, p1

    monitor-enter v0

    const/4 p1, 0x0

    .line 304
    :try_start_0
    iput-object p1, p0, Ll/ܰ᩹;->ۧ:Landroid/app/job/JobParameters;

    const/4 p1, 0x1

    .line 305
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫()Landroid/os/IBinder;
    .locals 1

    .line 285
    invoke-virtual {p0}, Landroid/app/job/JobServiceEngine;->getBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ll/᩺᩹;
    .locals 3

    .line 315
    iget-object v0, p0, Ll/ܰ᩹;->֫:Ljava/lang/Object;

    monitor-enter v0

    .line 316
    :try_start_0
    iget-object v1, p0, Ll/ܰ᩹;->ۧ:Landroid/app/job/JobParameters;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 317
    monitor-exit v0

    return-object v2

    .line 319
    :cond_0
    invoke-virtual {v1}, Landroid/app/job/JobParameters;->dequeueWork()Landroid/app/job/JobWorkItem;

    move-result-object v1

    .line 320
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 322
    invoke-virtual {v1}, Landroid/app/job/JobWorkItem;->getIntent()Landroid/content/Intent;

    move-result-object v0

    iget-object v2, p0, Ll/ܰ᩹;->ܽ:Ll/ۧ᩶;

    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    .line 323
    new-instance v0, Ll/᩺᩹;

    invoke-direct {v0, p0, v1}, Ll/᩺᩹;-><init>(Ll/ܰ᩹;Landroid/app/job/JobWorkItem;)V

    return-object v0

    :cond_1
    return-object v2

    :catchall_0
    move-exception v1

    .line 320
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
