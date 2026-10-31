.class public final Ll/֡֫ᩳ;
.super Ljava/lang/Object;
.source "B9R5"


# instance fields
.field public final ֫:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    .line 569
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7f0a05ef

    .line 570
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ll/֡֫ᩳ;->֫:Landroid/widget/TextView;

    const v0, 0x7f0a05e4

    .line 571
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f0a05f1

    .line 572
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
