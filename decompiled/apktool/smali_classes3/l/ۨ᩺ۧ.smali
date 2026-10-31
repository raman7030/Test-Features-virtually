.class public abstract Ll/ۨ᩺ۧ;
.super Ljava/lang/Object;
.source "L5VS"


# instance fields
.field public final ֫:Landroid/database/DataSetObservable;

.field public ۧ:Landroid/database/DataSetObserver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    new-instance v0, Landroid/database/DataSetObservable;

    invoke-direct {v0}, Landroid/database/DataSetObservable;-><init>()V

    iput-object v0, p0, Ll/ۨ᩺ۧ;->֫:Landroid/database/DataSetObservable;

    return-void
.end method


# virtual methods
.method public ֫(I)Ljava/lang/CharSequence;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public ֫(Ll/֡ܰۧ;I)Ljava/lang/Object;
    .locals 0

    .line 184
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Required method instantiateItem was not overridden"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(Landroid/database/DataSetObserver;)V
    .locals 1

    .line 303
    iget-object v0, p0, Ll/ۨ᩺ۧ;->֫:Landroid/database/DataSetObservable;

    invoke-virtual {v0, p1}, Landroid/database/Observable;->registerObserver(Ljava/lang/Object;)V

    return-void
.end method

.method public ֫(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public ֫(Ll/֡ܰۧ;)V
    .locals 0

    return-void
.end method

.method public ֫(Ll/֡ܰۧ;ILjava/lang/Object;)V
    .locals 0

    .line 202
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Required method destroyItem was not overridden"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract ֫(Landroid/view/View;Ljava/lang/Object;)Z
.end method

.method public abstract ۧ()I
.end method

.method public final ۧ(Landroid/database/DataSetObserver;)V
    .locals 1

    move-object v0, p0

    .line 316
    monitor-enter v0

    .line 317
    :try_start_0
    iput-object p1, p0, Ll/ۨ᩺ۧ;->ۧ:Landroid/database/DataSetObserver;

    .line 318
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ܽ()V
    .locals 2

    move-object v0, p0

    .line 289
    monitor-enter v0

    .line 290
    :try_start_0
    iget-object v1, p0, Ll/ۨ᩺ۧ;->ۧ:Landroid/database/DataSetObserver;

    if-eqz v1, :cond_0

    .line 291
    invoke-virtual {v1}, Landroid/database/DataSetObserver;->onChanged()V

    .line 293
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 294
    iget-object v0, p0, Ll/ۨ᩺ۧ;->֫:Landroid/database/DataSetObservable;

    invoke-virtual {v0}, Landroid/database/DataSetObservable;->notifyChanged()V

    return-void

    :catchall_0
    move-exception v1

    .line 293
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ܽ(Landroid/database/DataSetObserver;)V
    .locals 1

    .line 312
    iget-object v0, p0, Ll/ۨ᩺ۧ;->֫:Landroid/database/DataSetObservable;

    invoke-virtual {v0, p1}, Landroid/database/Observable;->unregisterObserver(Ljava/lang/Object;)V

    return-void
.end method
