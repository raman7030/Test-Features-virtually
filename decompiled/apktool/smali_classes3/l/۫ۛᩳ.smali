.class public final Ll/۫ۛᩳ;
.super Ljava/lang/Object;
.source "X68P"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:Ll/۟᩺ᩳ;

.field public final synthetic ۙ:Ll/ۗۤᩳ;

.field public final synthetic ۬:I

.field public final synthetic ᩶:J

.field public final synthetic ᩸:Ll/۫ۨᩳ;

.field public final synthetic ᩹:Ll/ۗ᩻᩵;


# direct methods
.method public constructor <init>(Ll/۫ۨᩳ;Ll/ۗ᩻᩵;Ll/۟᩺ᩳ;Ll/ۗۤᩳ;IJ)V
    .locals 0

    .line 3951
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ۛᩳ;->᩸:Ll/۫ۨᩳ;

    iput-object p2, p0, Ll/۫ۛᩳ;->᩹:Ll/ۗ᩻᩵;

    iput-object p3, p0, Ll/۫ۛᩳ;->ۗ:Ll/۟᩺ᩳ;

    iput-object p4, p0, Ll/۫ۛᩳ;->ۙ:Ll/ۗۤᩳ;

    iput p5, p0, Ll/۫ۛᩳ;->۬:I

    iput-wide p6, p0, Ll/۫ۛᩳ;->᩶:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    move-object v1, p0

    .line 3953
    iget-object v0, v1, Ll/۫ۛᩳ;->᩸:Ll/۫ۨᩳ;

    iget-object v2, v0, Ll/۫ۨᩳ;->ۤᩳ:Ll/ۜܺܿ;

    iget-object v3, v1, Ll/۫ۛᩳ;->᩹:Ll/ۗ᩻᩵;

    invoke-virtual {v3}, Ll/ۗ᩻᩵;->isDone()Z

    move-result v4

    if-eqz v4, :cond_0

    return-void

    .line 3955
    :cond_0
    :try_start_0
    invoke-static {v0}, Ll/۫ۨᩳ;->ۙ(Ll/۫ۨᩳ;)Ll/۟᩺ᩳ;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v5, v1, Ll/۫ۛᩳ;->ۗ:Ll/۟᩺ᩳ;

    if-ne v4, v5, :cond_8

    :try_start_1
    iget-object v4, v0, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v6, v1, Ll/۫ۛᩳ;->ۙ:Ll/ۗۤᩳ;

    if-ne v4, v6, :cond_8

    :try_start_2
    invoke-interface {v5}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v4

    iget v7, v1, Ll/۫ۛᩳ;->۬:I

    if-ne v4, v7, :cond_8

    .line 3958
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v4

    if-eqz v4, :cond_7

    iget-object v4, v0, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    iget-boolean v4, v4, Ll/᩺֫ܿ;->ܰۧ:Z

    if-eqz v4, :cond_7

    invoke-virtual {v2}, Ll/ۜܺܿ;->ۢ()Z

    move-result v4

    if-eqz v4, :cond_7

    .line 3959
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-eqz v4, :cond_7

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-wide v9, v1, Ll/۫ۛᩳ;->᩶:J

    cmp-long v4, v7, v9

    if-ltz v4, :cond_1

    goto/16 :goto_1

    .line 3963
    :cond_1
    :try_start_3
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ܽܽ()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-virtual {v6}, Ll/ۗۤᩳ;->ۖ()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v0, v6}, Ll/۫ۨᩳ;->ܽ(Ll/ۗۤᩳ;)Z

    move-result v4

    if-eqz v4, :cond_6

    :cond_2
    invoke-static {v0}, Ll/۫ۨᩳ;->۟(Ll/۫ۨᩳ;)Ll/᩹ۨᩳ;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 3964
    invoke-virtual {v0, v6}, Ll/۫ۨᩳ;->ܽ(Ll/ۗۤᩳ;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 3965
    :cond_3
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v4

    const/4 v7, 0x0

    invoke-static {v7, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 3966
    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩻֫()I

    move-result v0

    const/4 v7, 0x1

    invoke-static {v7, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 3967
    invoke-virtual {v6, v4, v0}, Ll/ۗۤᩳ;->ܽ(II)J

    move-result-wide v7

    const-wide/16 v11, 0x0

    cmp-long v13, v7, v11

    if-ltz v13, :cond_6

    const/16 v13, 0x20

    ushr-long v13, v7, v13

    long-to-int v14, v13

    long-to-int v8, v7

    .line 3970
    invoke-virtual {v2, v5, v14, v8}, Ll/ۜܺܿ;->ᩳ(Ll/᩶᩸ᩳ;II)V

    .line 3971
    invoke-virtual {v2, v14, v8}, Ll/ۜܺܿ;->ܳ(II)Z

    move-result v7

    if-eqz v7, :cond_4

    move v13, v8

    .line 3972
    invoke-virtual {v6, v4, v0}, Ll/ۗۤᩳ;->ۧ(II)J

    move-result-wide v7

    cmp-long v0, v7, v11

    if-eqz v0, :cond_5

    const/16 v0, 0x20

    ushr-long v11, v7, v0

    long-to-int v0, v11

    long-to-int v4, v7

    .line 3973
    invoke-virtual {v2, v5, v0, v4}, Ll/ۜܺܿ;->ܽ(Ll/᩶᩸ᩳ;II)V

    goto :goto_0

    :cond_4
    move v13, v8

    .line 3975
    :cond_5
    :goto_0
    invoke-virtual {v2, v14, v13}, Ll/ۜܺܿ;->ܿ(II)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v0, 0x0

    .line 3976
    invoke-virtual {v3, v0}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;)V

    return-void

    .line 3982
    :cond_6
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    sub-long/2addr v9, v4

    const-wide/16 v4, 0x1

    invoke-static {v4, v5, v9, v10}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    const-wide/16 v6, 0xa

    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    invoke-static {p0, v4, v5}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    return-void

    :cond_7
    :goto_1
    const/4 v0, 0x0

    .line 3960
    invoke-virtual {v3, v0}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;)V

    return-void

    .line 3956
    :cond_8
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v2, "Initial highlight preparation was superseded"

    invoke-direct {v0, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception v0

    .line 3984
    invoke-virtual {v3, v0}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    return-void
.end method
