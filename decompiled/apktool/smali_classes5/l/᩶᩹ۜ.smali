.class public final synthetic Ll/᩶᩹ۜ;
.super Ljava/lang/Object;
.source "K5ZN"

# interfaces
.implements Ll/֨ۡ֫;


# instance fields
.field public final synthetic ᩸:Landroid/widget/ImageView;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/ImageView;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶᩹ۜ;->᩸:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 2

    .line 2
    check-cast p1, Ljava/lang/Integer;

    .line 292
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget-object v1, Ll/ᩳ᩹ۜ;->ۨ:[F

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const v0, 0x7f080284

    goto :goto_0

    :cond_0
    const v0, 0x7f080280

    goto :goto_0

    :cond_1
    const v0, 0x7f080286

    goto :goto_0

    :cond_2
    const v0, 0x7f080285

    :goto_0
    iget-object v1, p0, Ll/᩶᩹ۜ;->᩸:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 293
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Ll/ᩳ᩹ۜ;->ܿ(I)I

    move-result p1

    invoke-static {p1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method
