.class public final Ll/᩺᩹;
.super Ljava/lang/Object;
.source "268P"

# interfaces
.implements Ll/ۨ᩹;


# instance fields
.field public final ֫:Landroid/app/job/JobWorkItem;

.field public final synthetic ۧ:Ll/ܰ᩹;


# direct methods
.method public constructor <init>(Ll/ܰ᩹;Landroid/app/job/JobWorkItem;)V
    .locals 0

    .line 259
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺᩹;->ۧ:Ll/ܰ᩹;

    .line 260
    iput-object p2, p0, Ll/᩺᩹;->֫:Landroid/app/job/JobWorkItem;

    return-void
.end method


# virtual methods
.method public final getIntent()Landroid/content/Intent;
    .locals 1

    .line 265
    iget-object v0, p0, Ll/᩺᩹;->֫:Landroid/app/job/JobWorkItem;

    invoke-virtual {v0}, Landroid/app/job/JobWorkItem;->getIntent()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()V
    .locals 3

    .line 270
    iget-object v0, p0, Ll/᩺᩹;->ۧ:Ll/ܰ᩹;

    iget-object v0, v0, Ll/ܰ᩹;->֫:Ljava/lang/Object;

    monitor-enter v0

    .line 271
    :try_start_0
    iget-object v1, p0, Ll/᩺᩹;->ۧ:Ll/ܰ᩹;

    iget-object v1, v1, Ll/ܰ᩹;->ۧ:Landroid/app/job/JobParameters;

    if-eqz v1, :cond_0

    .line 272
    iget-object v2, p0, Ll/᩺᩹;->֫:Landroid/app/job/JobWorkItem;

    invoke-virtual {v1, v2}, Landroid/app/job/JobParameters;->completeWork(Landroid/app/job/JobWorkItem;)V

    .line 274
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
