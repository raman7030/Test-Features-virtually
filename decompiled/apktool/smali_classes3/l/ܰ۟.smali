.class public final Ll/ܰ۟;
.super Ljava/lang/Object;
.source "V5Y3"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/۟۟;


# direct methods
.method public constructor <init>(Ll/۟۟;)V
    .locals 0

    .line 695
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ۟;->᩸:Ll/۟۟;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    .line 700
    iget-object v0, p0, Ll/ܰ۟;->᩸:Ll/۟۟;

    iget-object v1, v0, Ll/۟۟;->ܽ֫:Landroid/view/View;

    iget-object v2, v0, Ll/۟۟;->ۧ֫:Ll/᩺۟;

    iget-boolean v3, v0, Ll/۟۟;->᩶:Z

    if-nez v3, :cond_0

    return-void

    .line 704
    :cond_0
    iget-boolean v3, v0, Ll/۟۟;->᩺:Z

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    .line 705
    iput-boolean v4, v0, Ll/۟۟;->᩺:Z

    .line 706
    invoke-virtual {v2}, Ll/᩺۟;->᩷()V

    .line 710
    :cond_1
    invoke-virtual {v2}, Ll/᩺۟;->ܿ()Z

    move-result v3

    if-nez v3, :cond_4

    .line 503
    invoke-virtual {v2}, Ll/᩺۟;->ᩳ()I

    move-result v3

    .line 504
    invoke-virtual {v2}, Ll/᩺۟;->ܽ()V

    if-eqz v3, :cond_4

    .line 506
    invoke-virtual {v0, v3}, Ll/۟۟;->֫(I)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    .line 715
    :cond_2
    iget-boolean v3, v0, Ll/۟۟;->ۨ:Z

    if-eqz v3, :cond_3

    .line 716
    iput-boolean v4, v0, Ll/۟۟;->ۨ:Z

    .line 687
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v7

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v9, 0x3

    const/4 v10, 0x0

    move-wide v5, v7

    .line 688
    invoke-static/range {v5 .. v12}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v3

    .line 690
    invoke-virtual {v1, v3}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 691
    invoke-virtual {v3}, Landroid/view/MotionEvent;->recycle()V

    .line 720
    :cond_3
    invoke-virtual {v2}, Ll/᩺۟;->֫()V

    .line 723
    invoke-virtual {v2}, Ll/᩺۟;->ۧ()I

    move-result v2

    .line 724
    invoke-virtual {v0, v2}, Ll/۟۟;->ۧ(I)V

    .line 727
    sget v0, Ll/ܿ᩺;->֫:I

    .line 1359
    invoke-virtual {v1, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    return-void

    .line 711
    :cond_4
    :goto_0
    iput-boolean v4, v0, Ll/۟۟;->᩶:Z

    return-void
.end method
