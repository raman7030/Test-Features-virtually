.class public abstract Ll/۫ܶܳ;
.super Ll/ۨ۠ܳ;
.source "R4LW"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final ۗ:Ljava/lang/String;

.field public ۙ:Z

.field public final ۫:Ljava/lang/String;

.field public ۬:Ll/۬ܶܳ;

.field public final ᩶:Ljava/util/ArrayList;

.field public final ᩹:Ll/ۗܶܳ;


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;Ljava/lang/String;Ljava/lang/String;Ll/ۗܶܳ;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Ll/ۨ۠ܳ;-><init>(Lbin/mt/plus/Main;)V

    .line 23
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/۫ܶܳ;->᩶:Ljava/util/ArrayList;

    .line 33
    iput-object p2, p0, Ll/۫ܶܳ;->۫:Ljava/lang/String;

    .line 34
    iput-object p3, p0, Ll/۫ܶܳ;->ۗ:Ljava/lang/String;

    .line 35
    iput-object p4, p0, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    .line 36
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const/4 p2, 0x1

    invoke-interface {p1, p3, p2}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Ll/۫ܶܳ;->ۙ:Z

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 63
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p1

    iget-boolean v0, p0, Ll/۫ܶܳ;->ۙ:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Ll/۫ܶܳ;->ۙ:Z

    iget-object v1, p0, Ll/۫ܶܳ;->ۗ:Ljava/lang/String;

    invoke-interface {p1, v1, v0}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p1

    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    .line 64
    iget-boolean p1, p0, Ll/۫ܶܳ;->ۙ:Z

    const/4 v0, 0x2

    iget-object v1, p0, Ll/۫ܶܳ;->᩶:Ljava/util/ArrayList;

    iget-object v2, p0, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    const-wide/16 v3, 0xc8

    const-string v5, "rotationX"

    if-eqz p1, :cond_0

    .line 65
    invoke-virtual {p0}, Ll/۫ܶܳ;->ᩳ()V

    .line 66
    iget-object p1, p0, Ll/۫ܶܳ;->۬:Ll/۬ܶܳ;

    iget-object p1, p1, Ll/۬ܶܳ;->ۤ:Landroid/widget/ImageView;

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    .line 67
    invoke-static {p1, v5, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    .line 68
    invoke-virtual {p1, v3, v4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object p1

    .line 69
    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    .line 93
    invoke-virtual {v2, p0}, Ll/ۗܶܳ;->֫(Ll/۫ܶܳ;)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    .line 70
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {v2, p1, v0}, Ll/᩶ۗۧ;->notifyItemRangeInserted(II)V

    return-void

    .line 72
    :cond_0
    iget-object p1, p0, Ll/۫ܶܳ;->۬:Ll/۬ܶܳ;

    iget-object p1, p1, Ll/۬ܶܳ;->ۤ:Landroid/widget/ImageView;

    new-array v0, v0, [F

    fill-array-data v0, :array_1

    .line 73
    invoke-static {p1, v5, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    .line 74
    invoke-virtual {p1, v3, v4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object p1

    .line 75
    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    .line 93
    invoke-virtual {v2, p0}, Ll/ۗܶܳ;->֫(Ll/۫ܶܳ;)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    .line 76
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {v2, p1, v0}, Ll/᩶ۗۧ;->notifyItemRangeRemoved(II)V

    return-void

    nop

    :array_0
    .array-data 4
        0x43340000    # 180.0f
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x43340000    # 180.0f
    .end array-data
.end method

.method public onLongClick(Landroid/view/View;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public ֫(Ll/ܳܶܳ;)V
    .locals 1

    .line 53
    check-cast p1, Ll/۬ܶܳ;

    iput-object p1, p0, Ll/۫ܶܳ;->۬:Ll/۬ܶܳ;

    .line 54
    iput-object p0, p1, Ll/۬ܶܳ;->ۛ:Ll/۫ܶܳ;

    .line 55
    iget-object p1, p1, Ll/ܳܶܳ;->۬:Landroid/widget/TextView;

    iget-object v0, p0, Ll/۫ܶܳ;->۫:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    iget-object p1, p0, Ll/۫ܶܳ;->۬:Ll/۬ܶܳ;

    iget-object p1, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 57
    iget-object p1, p0, Ll/۫ܶܳ;->۬:Ll/۬ܶܳ;

    iget-object p1, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 58
    iget-object p1, p0, Ll/۫ܶܳ;->۬:Ll/۬ܶܳ;

    iget-object p1, p1, Ll/۬ܶܳ;->ۤ:Landroid/widget/ImageView;

    iget-boolean v0, p0, Ll/۫ܶܳ;->ۙ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/high16 v0, 0x43340000    # 180.0f

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setRotationX(F)V

    return-void
.end method

.method public abstract ֫(Ll/ܳܶܳ;I)V
.end method

.method public ܽ()I
    .locals 3

    .line 40
    iget-object v0, p0, Ll/۫ܶܳ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 43
    :cond_0
    iget-boolean v1, p0, Ll/۫ܶܳ;->ۙ:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/2addr v0, v2

    return v0

    :cond_1
    return v2
.end method

.method public ᩳ()V
    .locals 0

    return-void
.end method
