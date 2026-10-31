.class public final Ll/᩶᩻᩵;
.super Ll/֨᩻᩵;
.source "I6PU"


# instance fields
.field public ܰ:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Ll/ۗ᩻᩵;Ll/ۗ᩻᩵;Ljava/lang/Runnable;)V
    .locals 0

    .line 762
    invoke-direct {p0, p1, p2, p3}, Ll/֨᩻᩵;-><init>(Ljava/util/concurrent/Executor;Ll/ۗ᩻᩵;Ll/ۗ᩻᩵;)V

    iput-object p4, p0, Ll/᩶᩻᩵;->ܰ:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final ֫(I)Ll/ۗ᩻᩵;
    .locals 6

    .line 767
    iget-object v0, p0, Ll/֨᩻᩵;->᩺:Ll/ۗ᩻᩵;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    iget-object v2, v0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-eqz v2, :cond_4

    iget-object v3, p0, Ll/֨᩻᩵;->ۛ:Ll/ۗ᩻᩵;

    if-eqz v3, :cond_4

    iget-object v4, p0, Ll/᩶᩻᩵;->ܰ:Ljava/lang/Runnable;

    if-nez v4, :cond_0

    goto :goto_1

    .line 770
    :cond_0
    iget-object v5, v3, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-nez v5, :cond_3

    .line 771
    instance-of v5, v2, Ll/᩻᩻᩵;

    if-eqz v5, :cond_1

    move-object v5, v2

    check-cast v5, Ll/᩻᩻᩵;

    iget-object v5, v5, Ll/᩻᩻᩵;->֫:Ljava/lang/Throwable;

    if-eqz v5, :cond_1

    .line 772
    invoke-virtual {v3, v2, v5}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    if-gtz p1, :cond_2

    .line 775
    :try_start_0
    invoke-virtual {p0}, Ll/֨᩻᩵;->ۜ()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    .line 778
    :cond_2
    invoke-interface {v4}, Ljava/lang/Runnable;->run()V

    .line 779
    invoke-virtual {v3}, Ll/ۗ᩻᩵;->ܽ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    .line 782
    invoke-virtual {v3, v2}, Ll/ۗ᩻᩵;->ۧ(Ljava/lang/Throwable;)V

    .line 785
    :cond_3
    :goto_0
    iput-object v1, p0, Ll/֨᩻᩵;->᩺:Ll/ۗ᩻᩵;

    iput-object v1, p0, Ll/֨᩻᩵;->ۛ:Ll/ۗ᩻᩵;

    iput-object v1, p0, Ll/᩶᩻᩵;->ܰ:Ljava/lang/Runnable;

    .line 786
    invoke-virtual {v3, v0, p1}, Ll/ۗ᩻᩵;->֫(Ll/ۗ᩻᩵;I)Ll/ۗ᩻᩵;

    move-result-object p1

    return-object p1

    :cond_4
    :goto_1
    return-object v1
.end method
