.class public final synthetic Ll/֫ܽܿ;
.super Ljava/lang/Object;
.source "35OM"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:I

.field public final synthetic ᩶:Ll/᩷۟ᩳ;

.field public final synthetic ᩸:Ll/ۧܽܿ;

.field public final synthetic ᩹:Z


# direct methods
.method public synthetic constructor <init>(Ll/ۧܽܿ;ZLl/᩷۟ᩳ;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫ܽܿ;->᩸:Ll/ۧܽܿ;

    iput-boolean p2, p0, Ll/֫ܽܿ;->᩹:Z

    iput-object p3, p0, Ll/֫ܽܿ;->᩶:Ll/᩷۟ᩳ;

    iput p4, p0, Ll/֫ܽܿ;->ۙ:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 2
    iget-object v1, p0, Ll/֫ܽܿ;->᩸:Ll/ۧܽܿ;

    .line 4
    iget-boolean v2, p0, Ll/֫ܽܿ;->᩹:Z

    .line 6
    iget-object v3, p0, Ll/֫ܽܿ;->᩶:Ll/᩷۟ᩳ;

    .line 8
    iget v4, p0, Ll/֫ܽܿ;->ۙ:I

    .line 577
    invoke-virtual {v1}, Ll/ۧܽܿ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 578
    :cond_0
    iget-object v0, v1, Ll/ۧܽܿ;->۬:Ll/ᩴۨᩳ;

    iget-object v5, v1, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    iget-object v5, v5, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v5}, Ll/۫ۨᩳ;->᩻ܽ()Ll/ᩴۨᩳ;

    move-result-object v5

    invoke-virtual {v0, v5}, Ll/ᩴۨᩳ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget v0, v1, Ll/ۧܽܿ;->ۙ:I

    iget-object v5, v1, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    invoke-static {v5}, Ll/ܿܽܿ;->ᩳ(Ll/ܿܽܿ;)I

    move-result v5

    iget-object v6, v1, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    .line 579
    invoke-virtual {v6}, Ll/ۗۤᩳ;->ܳ()I

    move-result v6

    sub-int/2addr v5, v6

    iget-object v6, v1, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    invoke-virtual {v6}, Ll/ۗۤᩳ;->ۜ()I

    move-result v6

    sub-int/2addr v5, v6

    if-eq v0, v5, :cond_1

    goto/16 :goto_3

    :cond_1
    if-nez v2, :cond_2

    .line 585
    iget v0, v1, Ll/ۧܽܿ;->۫:I

    iget-object v5, v1, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    iget-object v5, v5, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v5}, Ll/۫ۨᩳ;->ۜܽ()I

    move-result v5

    if-eq v0, v5, :cond_2

    :goto_0
    return-void

    .line 586
    :cond_2
    iget-object v0, v1, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    monitor-enter v0

    .line 587
    :try_start_0
    iget-object v5, v1, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    const/4 v6, 0x0

    iput-boolean v6, v5, Ll/ۗۤᩳ;->ܳ֫:Z

    .line 588
    iget-object v5, v1, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    iput-object v3, v5, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    if-eqz v2, :cond_3

    const/4 v6, 0x0

    goto :goto_1

    :cond_3
    move-object v6, v3

    .line 589
    :goto_1
    invoke-static {v5, v6}, Ll/ܿܽܿ;->ۧ(Ll/ܿܽܿ;Ll/᩷۟ᩳ;)V

    if-eqz v2, :cond_4

    .line 591
    iget-object v2, v1, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    invoke-static {v2, v3}, Ll/ܿܽܿ;->֫(Ll/ܿܽܿ;Ll/᩷۟ᩳ;)V

    .line 592
    iget-object v2, v1, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    iget v3, v1, Ll/ۧܽܿ;->ۙ:I

    invoke-static {v2, v3}, Ll/ܿܽܿ;->֫(Ll/ܿܽܿ;I)V

    .line 593
    iget-object v2, v1, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    iget-object v3, v1, Ll/ۧܽܿ;->۬:Ll/ᩴۨᩳ;

    iput-object v3, v2, Ll/ۗۤᩳ;->ܳ:Ll/ᩴۨᩳ;

    .line 595
    :cond_4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 596
    iget v0, v1, Ll/ۧܽܿ;->۫:I

    iget-object v2, v1, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    iget-object v2, v2, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v2}, Ll/۫ۨᩳ;->ۜܽ()I

    move-result v2

    if-ne v0, v2, :cond_5

    iget-object v0, v1, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    iget-object v2, v0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v2, v0}, Ll/۫ۨᩳ;->֫(Ll/ۗۤᩳ;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 597
    iget-object v0, v1, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    iget-object v0, v0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    iget-object v2, v1, Ll/ۧܽܿ;->ۤ:Ll/ᩳܽܿ;

    invoke-static {v2}, Ll/ᩳܽܿ;->ᩳ(Ll/ᩳܽܿ;)Ll/ۢ۫ۡ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v2

    int-to-float v3, v4

    mul-float v2, v2, v3

    float-to-int v2, v2

    iget v3, v1, Ll/ۧܽܿ;->᩺:I

    add-int/2addr v2, v3

    invoke-virtual {v0, v2}, Ll/۫ۨᩳ;->᩷(I)I

    move-result v2

    invoke-virtual {v0, v2}, Ll/۫ۨᩳ;->ۖ(I)V

    goto :goto_2

    .line 600
    :cond_5
    iget-object v0, v1, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    iget-object v0, v0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v2

    invoke-virtual {v0, v2}, Ll/۫ۨᩳ;->᩷(I)I

    move-result v2

    invoke-virtual {v0, v2}, Ll/۫ۨᩳ;->ۖ(I)V

    .line 601
    :goto_2
    iget-object v0, v1, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    iget-object v0, v0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void

    :catchall_0
    move-exception v1

    .line 595
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    .line 581
    :cond_6
    :goto_3
    iget-object v0, v1, Ll/ۧܽܿ;->ۨ:Ll/ܿܽܿ;

    invoke-static {v0}, Ll/ܿܽܿ;->ܳ(Ll/ܿܽܿ;)V

    return-void
.end method
