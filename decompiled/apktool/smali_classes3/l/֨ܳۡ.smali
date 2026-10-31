.class public final Ll/֨ܳۡ;
.super Ll/ܿ᩻ۡ;
.source "K1JK"

# interfaces
.implements Ll/ۤۡۡ;


# instance fields
.field public ۗ:Landroid/widget/ImageView;

.field public ۙ:Landroid/widget/ImageView;

.field public ۬:Landroid/widget/TextView;


# direct methods
.method public static ֫(Ljava/util/List;)V
    .locals 2

    .line 65
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۟ܳۡ;

    .line 66
    invoke-virtual {v0}, Ll/۟ܳۡ;->֫()V

    .line 67
    invoke-virtual {v0}, Ll/۟ܳۡ;->ۡ()V

    .line 68
    invoke-virtual {v0}, Ll/۟ܳۡ;->᩻()Z

    move-result v1

    if-nez v1, :cond_0

    .line 69
    iget-object v0, v0, Ll/۟ܳۡ;->ۧ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/֨ܳۡ;->֫(Ljava/util/List;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ۧ(Ljava/util/List;)V
    .locals 2

    .line 74
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۟ܳۡ;

    .line 75
    invoke-virtual {v0}, Ll/۟ܳۡ;->ۧ()V

    .line 76
    invoke-virtual {v0}, Ll/۟ܳۡ;->ۡ()V

    .line 77
    invoke-virtual {v0}, Ll/۟ܳۡ;->᩻()Z

    move-result v1

    if-nez v1, :cond_0

    .line 78
    iget-object v0, v0, Ll/۟ܳۡ;->ۧ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/֨ܳۡ;->ۧ(Ljava/util/List;)V

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 34
    iget-object p1, p0, Ll/֨ܳۡ;->ۙ:Landroid/widget/ImageView;

    sget-object v0, Ll/ܰܳۡ;->ۢ֫:Ll/ۡۤۡ;

    invoke-virtual {v0}, Ll/ۡۤۡ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 37
    :cond_0
    iget-object v0, p0, Ll/ܿ᩻ۡ;->᩶:Ll/۟ܳۡ;

    invoke-virtual {v0}, Ll/۟ܳۡ;->ܳ()Z

    move-result v0

    const/4 v1, 0x2

    const-wide/16 v2, 0x64

    const-string v4, "rotation"

    iget-object v5, p0, Ll/ܿ᩻ۡ;->᩸:Ll/ܰܳۡ;

    if-eqz v0, :cond_1

    .line 38
    iget-object v0, p0, Ll/ܿ᩻ۡ;->᩶:Ll/۟ܳۡ;

    invoke-virtual {v5, v0}, Ll/ܰܳۡ;->ܽ(Ll/۟ܳۡ;)V

    new-array v0, v1, [F

    .line 39
    fill-array-data v0, :array_0

    invoke-static {p1, v4, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    .line 40
    invoke-virtual {p1, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object p1

    .line 41
    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    return-void

    .line 43
    :cond_1
    iget-object v0, p0, Ll/ܿ᩻ۡ;->᩶:Ll/۟ܳۡ;

    invoke-virtual {v5, v0}, Ll/ܰܳۡ;->֫(Ll/۟ܳۡ;)V

    new-array v0, v1, [F

    .line 44
    fill-array-data v0, :array_1

    invoke-static {p1, v4, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    .line 45
    invoke-virtual {p1, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object p1

    .line 46
    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    return-void

    :array_0
    .array-data 4
        0x43070000    # 135.0f
        0x42b40000    # 90.0f
    .end array-data

    :array_1
    .array-data 4
        0x42b40000    # 90.0f
        0x43070000    # 135.0f
    .end array-data
.end method

.method public final ֫(I)V
    .locals 2

    const/4 v0, 0x0

    .line 52
    iget-object v1, p0, Ll/ܿ᩻ۡ;->᩸:Ll/ܰܳۡ;

    iput-object v0, v1, Ll/ܰܳۡ;->᩶:Ll/۟ܳۡ;

    if-nez p1, :cond_0

    .line 54
    iget-object p1, p0, Ll/ܿ᩻ۡ;->᩶:Ll/۟ܳۡ;

    invoke-virtual {p1}, Ll/۟ܳۡ;->֫()V

    .line 55
    iget-object p1, p0, Ll/ܿ᩻ۡ;->᩶:Ll/۟ܳۡ;

    iget-object p1, p1, Ll/۟ܳۡ;->ۧ:Ljava/util/ArrayList;

    invoke-static {p1}, Ll/֨ܳۡ;->֫(Ljava/util/List;)V

    goto :goto_0

    .line 57
    :cond_0
    iget-object p1, p0, Ll/ܿ᩻ۡ;->᩶:Ll/۟ܳۡ;

    invoke-virtual {p1}, Ll/۟ܳۡ;->ۧ()V

    .line 58
    iget-object p1, p0, Ll/ܿ᩻ۡ;->᩶:Ll/۟ܳۡ;

    iget-object p1, p1, Ll/۟ܳۡ;->ۧ:Ljava/util/ArrayList;

    invoke-static {p1}, Ll/֨ܳۡ;->ۧ(Ljava/util/List;)V

    .line 60
    :goto_0
    iget-object p1, p0, Ll/ܿ᩻ۡ;->᩶:Ll/۟ܳۡ;

    const/4 v0, 0x1

    .line 187
    invoke-virtual {p1, v0}, Ll/۟ܳۡ;->֫(Z)V

    .line 61
    invoke-virtual {v1}, Ll/ܰܳۡ;->ۧ()V

    return-void
.end method
