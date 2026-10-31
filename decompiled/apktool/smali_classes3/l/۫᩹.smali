.class public final Ll/۫᩹;
.super Landroid/os/AsyncTask;
.source "268P"


# instance fields
.field public final synthetic ֫:Ll/ۧ᩶;


# direct methods
.method public constructor <init>(Ll/ۧ᩶;)V
    .locals 0

    .line 387
    iput-object p1, p0, Ll/۫᩹;->֫:Ll/ۧ᩶;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 387
    check-cast p1, [Ljava/lang/Void;

    .line 394
    :goto_0
    iget-object p1, p0, Ll/۫᩹;->֫:Ll/ۧ᩶;

    .line 644
    iget-object v0, p1, Ll/ۧ᩶;->ۗ:Ll/ܰ᩹;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 645
    invoke-virtual {v0}, Ll/ܰ᩹;->ۧ()Ll/᩺᩹;

    move-result-object p1

    goto :goto_1

    .line 647
    :cond_0
    iget-object v0, p1, Ll/ۧ᩶;->᩸:Ljava/util/ArrayList;

    monitor-enter v0

    .line 648
    :try_start_0
    iget-object v2, p1, Ll/ۧ᩶;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_1

    .line 649
    iget-object p1, p1, Ll/ۧ᩶;->᩸:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۨ᩹;

    monitor-exit v0

    goto :goto_1

    .line 651
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object p1, v1

    :goto_1
    if-eqz p1, :cond_2

    .line 396
    iget-object v0, p0, Ll/۫᩹;->֫:Ll/ۧ᩶;

    invoke-interface {p1}, Ll/ۨ᩹;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۧ᩶;->֫(Landroid/content/Intent;)V

    .line 398
    invoke-interface {p1}, Ll/ۨ᩹;->֫()V

    goto :goto_0

    :cond_2
    return-object v1

    :catchall_0
    move-exception p1

    .line 653
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final onCancelled(Ljava/lang/Object;)V
    .locals 0

    .line 387
    check-cast p1, Ljava/lang/Void;

    .line 408
    iget-object p1, p0, Ll/۫᩹;->֫:Ll/ۧ᩶;

    invoke-virtual {p1}, Ll/ۧ᩶;->֫()V

    return-void
.end method

.method public final onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 387
    check-cast p1, Ljava/lang/Void;

    .line 413
    iget-object p1, p0, Ll/۫᩹;->֫:Ll/ۧ᩶;

    invoke-virtual {p1}, Ll/ۧ᩶;->֫()V

    return-void
.end method
