.class public final Ll/᩻۬᩷;
.super Ljava/lang/Object;
.source "49SX"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field public final synthetic ֫:Ll/֡ۚۢ;

.field public final synthetic ۧ:Ll/ۛۢᩴ;

.field public final synthetic ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/֡ۚۢ;Ljava/lang/String;Ll/ۛۢᩴ;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻۬᩷;->֫:Ll/֡ۚۢ;

    iput-object p2, p0, Ll/᩻۬᩷;->ܽ:Ljava/lang/String;

    iput-object p3, p0, Ll/᩻۬᩷;->ۧ:Ll/ۛۢᩴ;

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 0

    .line 76
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p3, p0, Ll/᩻۬᩷;->ܽ:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/widget/ProgressBar;->getProgress()I

    move-result p1

    add-int/lit8 p1, p1, 0x5

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "s)"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Ll/᩻۬᩷;->֫:Ll/֡ۚۢ;

    invoke-virtual {p2, p1}, Ll/֡ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 1

    .line 85
    invoke-virtual {p1}, Landroid/widget/ProgressBar;->getProgress()I

    move-result p1

    add-int/lit8 p1, p1, 0x5

    iget-object v0, p0, Ll/᩻۬᩷;->ۧ:Ll/ۛۢᩴ;

    invoke-interface {v0, p1}, Ljava/util/function/IntConsumer;->accept(I)V

    return-void
.end method
