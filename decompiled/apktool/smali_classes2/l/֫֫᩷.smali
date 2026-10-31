.class public final Ll/֫֫᩷;
.super Ljava/lang/Object;
.source "99K3"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field public final synthetic ֫:Ll/ۧ֫᩷;


# direct methods
.method public constructor <init>(Ll/ۧ֫᩷;)V
    .locals 0

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫֫᩷;->֫:Ll/ۧ֫᩷;

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 0

    if-eqz p3, :cond_0

    int-to-float p1, p2

    const/high16 p2, 0x42c80000    # 100.0f

    div-float/2addr p1, p2

    .line 89
    iget-object p2, p0, Ll/֫֫᩷;->֫:Ll/ۧ֫᩷;

    invoke-virtual {p2, p1}, Ll/ۧ֫᩷;->ۧ(F)V

    :cond_0
    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method
