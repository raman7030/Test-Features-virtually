.class public final Ll/ܰۛܽ;
.super Ll/᩶ۡۡ;
.source "H5BW"


# instance fields
.field public final synthetic ᩺:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;I)V
    .locals 0

    .line 301
    iput p3, p0, Ll/ܰۛܽ;->᩺:I

    invoke-direct {p0, p1, p2}, Ll/᩶ۡۡ;-><init>(Landroid/content/Context;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/widget/TextView;Z)V
    .locals 0

    if-nez p2, :cond_0

    .line 305
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    iget p2, p0, Ll/ܰۛܽ;->᩺:I

    iput p2, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    :cond_0
    return-void
.end method
