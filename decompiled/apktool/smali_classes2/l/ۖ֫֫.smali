.class public final Ll/ۖ֫֫;
.super Ljava/lang/Object;
.source "E6AF"

# interfaces
.implements Ll/᩵ۛ;


# instance fields
.field public final synthetic ֫:Ll/֡֫֫;


# direct methods
.method public constructor <init>(Ll/֡֫֫;)V
    .locals 0

    .line 2575
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖ֫֫;->֫:Ll/֡֫֫;

    return-void
.end method


# virtual methods
.method public final ֫()F
    .locals 1

    .line 2593
    iget-object v0, p0, Ll/ۖ֫֫;->֫:Ll/֡֫֫;

    invoke-virtual {v0}, Ll/֡֫֫;->ۧ()F

    move-result v0

    neg-float v0, v0

    return v0
.end method

.method public final ֫(F)Z
    .locals 1

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2581
    :cond_0
    invoke-virtual {p0}, Ll/ۖ֫֫;->ۧ()V

    .line 2582
    iget-object v0, p0, Ll/ۖ֫֫;->֫:Ll/֡֫֫;

    float-to-int p1, p1

    invoke-virtual {v0, p1}, Ll/֡֫֫;->ۧ(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public final ۧ()V
    .locals 1

    .line 2588
    iget-object v0, p0, Ll/ۖ֫֫;->֫:Ll/֡֫֫;

    invoke-static {v0}, Ll/֡֫֫;->֫(Ll/֡֫֫;)Landroid/widget/OverScroller;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    return-void
.end method
