.class public final Ll/ۙᩴܳ;
.super Ljava/lang/Object;
.source "715M"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field public final synthetic ֫:Ll/ܳ᩷ۡ;

.field public final synthetic ۧ:Ll/֡ۚۢ;

.field public final synthetic ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/֡ۚۢ;Ljava/lang/String;Ll/ܳ᩷ۡ;)V
    .locals 0

    .line 588
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙᩴܳ;->ۧ:Ll/֡ۚۢ;

    iput-object p2, p0, Ll/ۙᩴܳ;->ܽ:Ljava/lang/String;

    iput-object p3, p0, Ll/ۙᩴܳ;->֫:Ll/ܳ᩷ۡ;

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 0

    const/16 p3, 0x14

    if-ge p2, p3, :cond_0

    .line 592
    invoke-virtual {p1, p3}, Landroid/widget/ProgressBar;->setProgress(I)V

    return-void

    .line 594
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p3, p0, Ll/ۙᩴܳ;->ܽ:Ljava/lang/String;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, "%)"

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object p3, p0, Ll/ۙᩴܳ;->ۧ:Ll/֡ۚۢ;

    invoke-virtual {p3, p1}, Ll/֡ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    int-to-float p1, p2

    const/high16 p2, 0x42c80000    # 100.0f

    div-float/2addr p1, p2

    .line 595
    iget-object p2, p0, Ll/ۙᩴܳ;->֫:Ll/ܳ᩷ۡ;

    invoke-virtual {p2, p1}, Ll/ܳ᩷ۡ;->֫(F)V

    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    .line 606
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p1

    iget-object v0, p0, Ll/ۙᩴܳ;->֫:Ll/ܳ᩷ۡ;

    .line 607
    invoke-virtual {v0}, Ll/ܳ᩷ۡ;->ᩳ()F

    move-result v0

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float v0, v0, v1

    float-to-int v0, v0

    const-string v1, "bottom_content_view_ratio_int"

    .line 606
    invoke-interface {p1, v0, v1}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p1

    .line 607
    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    return-void
.end method
