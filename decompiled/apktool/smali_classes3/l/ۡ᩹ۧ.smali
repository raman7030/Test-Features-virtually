.class public final Ll/ۡ᩹ۧ;
.super Ljava/lang/Object;
.source "D6A1"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field public final synthetic ֫:Ll/ᩴ᩹ۧ;


# direct methods
.method public constructor <init>(Ll/ᩴ᩹ۧ;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡ᩹ۧ;->֫:Ll/ᩴ᩹ۧ;

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 1

    .line 80
    iget-object v0, p0, Ll/ۡ᩹ۧ;->֫:Ll/ᩴ᩹ۧ;

    if-eqz p3, :cond_1

    iget-boolean p3, v0, Ll/ᩴ᩹ۧ;->ܿۧ:Z

    if-nez p3, :cond_0

    iget-boolean p3, v0, Ll/ᩴ᩹ۧ;->ᩳۧ:Z

    if-nez p3, :cond_1

    .line 81
    :cond_0
    invoke-virtual {v0, p1}, Ll/ᩴ᩹ۧ;->֫(Landroid/widget/SeekBar;)V

    return-void

    .line 84
    :cond_1
    iget p1, v0, Ll/ᩴ᩹ۧ;->ۛ֫:I

    add-int/2addr p2, p1

    invoke-virtual {v0, p2}, Ll/ᩴ᩹ۧ;->ܳ(I)V

    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 1

    .line 90
    iget-object p1, p0, Ll/ۡ᩹ۧ;->֫:Ll/ᩴ᩹ۧ;

    const/4 v0, 0x1

    iput-boolean v0, p1, Ll/ᩴ᩹ۧ;->ᩳۧ:Z

    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 3

    const/4 v0, 0x0

    .line 95
    iget-object v1, p0, Ll/ۡ᩹ۧ;->֫:Ll/ᩴ᩹ۧ;

    iput-boolean v0, v1, Ll/ᩴ᩹ۧ;->ᩳۧ:Z

    .line 96
    invoke-virtual {p1}, Landroid/widget/ProgressBar;->getProgress()I

    move-result v0

    iget v2, v1, Ll/ᩴ᩹ۧ;->ۛ֫:I

    add-int/2addr v0, v2

    iget v2, v1, Ll/ᩴ᩹ۧ;->֫ۧ:I

    if-eq v0, v2, :cond_0

    .line 97
    invoke-virtual {v1, p1}, Ll/ᩴ᩹ۧ;->֫(Landroid/widget/SeekBar;)V

    :cond_0
    return-void
.end method
