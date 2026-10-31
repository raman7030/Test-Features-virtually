.class public final Ll/ܳܿۢ;
.super Ll/᩶ۡۡ;
.source "81J9"


# instance fields
.field public final synthetic ᩺:I


# direct methods
.method public constructor <init>(Landroid/content/Context;[Ljava/lang/String;I)V
    .locals 0

    .line 424
    iput p3, p0, Ll/ܳܿۢ;->᩺:I

    invoke-direct {p0, p1, p2}, Ll/᩶ۡۡ;-><init>(Landroid/content/Context;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/widget/TextView;Z)V
    .locals 1

    .line 427
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    .line 428
    iget v0, p0, Ll/ܳܿۢ;->᩺:I

    iput v0, p2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 429
    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method
