.class public final Ll/᩺᩹ۜ;
.super Ljava/lang/Object;
.source "K5ZN"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field public final synthetic ֫:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 0

    .line 297
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺᩹ۜ;->֫:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 0

    mul-int/lit8 p2, p2, 0x32

    int-to-long p1, p2

    .line 301
    invoke-static {p1, p2}, Ll/᩷᩶ۜ;->֫(J)I

    move-result p1

    invoke-static {p1}, Ll/᩷᩶ۜ;->֫(I)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Ll/᩺᩹ۜ;->֫:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 1

    .line 306
    invoke-static {}, Ll/᩷᩶ۜ;->ܽ()Ll/ۜ᩶ۜ;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 307
    invoke-static {}, Ll/᩷᩶ۜ;->ܽ()Ll/ۜ᩶ۜ;

    move-result-object p1

    const/4 v0, 0x1

    .line 938
    iput-boolean v0, p1, Ll/ۜ᩶ۜ;->ܺ:Z

    :cond_0
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    .line 313
    invoke-virtual {p1}, Landroid/widget/ProgressBar;->getProgress()I

    move-result p1

    mul-int/lit8 p1, p1, 0x32

    int-to-long v0, p1

    .line 314
    invoke-static {v0, v1}, Ll/᩷᩶ۜ;->֫(J)I

    move-result v0

    invoke-static {v0}, Ll/᩷᩶ۜ;->֫(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/᩺᩹ۜ;->֫:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 315
    invoke-static {}, Ll/᩷᩶ۜ;->ܽ()Ll/ۜ᩶ۜ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 316
    invoke-static {}, Ll/᩷᩶ۜ;->ܽ()Ll/ۜ᩶ۜ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۜ᩶ۜ;->֫(I)V

    :cond_0
    return-void
.end method
