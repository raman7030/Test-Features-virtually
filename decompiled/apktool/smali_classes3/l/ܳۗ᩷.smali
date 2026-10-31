.class public final Ll/ܳۗ᩷;
.super Ljava/lang/Object;
.source "B6LU"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field public final synthetic ֫:Ll/۬ۗܿ;


# direct methods
.method public constructor <init>(Ll/۬ۗܿ;)V
    .locals 0

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳۗ᩷;->֫:Ll/۬ۗܿ;

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 1

    if-eqz p3, :cond_0

    mul-int/lit8 p2, p2, 0x5

    add-int/lit8 p2, p2, 0x50

    .line 43
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    int-to-float p2, p2

    const/high16 p3, 0x42c80000    # 100.0f

    div-float/2addr p2, p3

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    const/4 p3, 0x1

    new-array p3, p3, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p2, p3, v0

    const-string p2, "%.2f"

    invoke-static {p1, p2, p3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 137
    iget-object p2, p0, Ll/ܳۗ᩷;->֫:Ll/۬ۗܿ;

    invoke-virtual {p2, p1}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

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
