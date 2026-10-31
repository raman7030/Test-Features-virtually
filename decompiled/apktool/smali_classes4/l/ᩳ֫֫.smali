.class public Ll/ᩳ֫֫;
.super Landroid/widget/ProgressBar;
.source "N52K"


# static fields
.field public static final synthetic ᩶:I


# instance fields
.field public final ᩸:Ll/᩵᩺ᩳ;

.field public final ᩹:Ll/ۘ᩷ᩳ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 63
    invoke-direct {p0, p1, p2, v0}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 44
    new-instance p1, Ll/᩵᩺ᩳ;

    const/4 p2, 0x3

    invoke-direct {p1, p2, p0}, Ll/᩵᩺ᩳ;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, Ll/ᩳ֫֫;->᩸:Ll/᩵᩺ᩳ;

    .line 50
    new-instance p1, Ll/ۘ᩷ᩳ;

    const/4 p2, 0x1

    invoke-direct {p1, p2, p0}, Ll/ۘ᩷ᩳ;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, Ll/ᩳ֫֫;->᩹:Ll/ۘ᩷ᩳ;

    return-void
.end method


# virtual methods
.method public final onAttachedToWindow()V
    .locals 1

    .line 68
    invoke-super {p0}, Landroid/widget/ProgressBar;->onAttachedToWindow()V

    .line 79
    iget-object v0, p0, Ll/ᩳ֫֫;->᩸:Ll/᩵᩺ᩳ;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 80
    iget-object v0, p0, Ll/ᩳ֫֫;->᩹:Ll/ۘ᩷ᩳ;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 74
    invoke-super {p0}, Landroid/widget/ProgressBar;->onDetachedFromWindow()V

    .line 79
    iget-object v0, p0, Ll/ᩳ֫֫;->᩸:Ll/᩵᩺ᩳ;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 80
    iget-object v0, p0, Ll/ᩳ֫֫;->᩹:Ll/ۘ᩷ᩳ;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method
