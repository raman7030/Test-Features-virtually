.class public final Ll/۠ۙ۠;
.super Ljava/lang/Object;
.source "14SR"


# instance fields
.field public final ֫:Landroid/widget/OverScroller;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Landroid/widget/OverScroller;

    invoke-direct {v0, p1}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ll/۠ۙ۠;->֫:Landroid/widget/OverScroller;

    return-void
.end method


# virtual methods
.method public final ֫(IIIIIIII)V
    .locals 12

    const/4 v10, 0x0

    move-object v11, p0

    .line 44
    iget-object v0, v11, Ll/۠ۙ۠;->֫:Landroid/widget/OverScroller;

    const/4 v9, 0x0

    move v1, p1

    move v2, p2

    move v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-virtual/range {v0 .. v10}, Landroid/widget/OverScroller;->fling(IIIIIIIIII)V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 28
    iget-object v0, p0, Ll/۠ۙ۠;->֫:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    move-result v0

    return v0
.end method

.method public final ۧ()V
    .locals 2

    const/4 v0, 0x1

    .line 49
    iget-object v1, p0, Ll/۠ۙ۠;->֫:Landroid/widget/OverScroller;

    invoke-virtual {v1, v0}, Landroid/widget/OverScroller;->forceFinished(Z)V

    return-void
.end method

.method public final ܽ()I
    .locals 1

    .line 59
    iget-object v0, p0, Ll/۠ۙ۠;->֫:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v0

    return v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 54
    iget-object v0, p0, Ll/۠ۙ۠;->֫:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v0

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 64
    iget-object v0, p0, Ll/۠ۙ۠;->֫:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v0

    return v0
.end method
