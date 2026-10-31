.class public final synthetic Ll/ۜ᩹ۜ;
.super Ljava/lang/Object;
.source "K5ZN"

# interfaces
.implements Ll/֨ۡ֫;


# instance fields
.field public final synthetic ᩸:Landroid/widget/ImageView;

.field public final synthetic ᩹:Ll/᩸᩷ۡ;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/ImageView;Ll/᩸᩷ۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜ᩹ۜ;->᩸:Landroid/widget/ImageView;

    iput-object p2, p0, Ll/ۜ᩹ۜ;->᩹:Ll/᩸᩷ۡ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 2

    .line 2
    check-cast p1, Ljava/lang/Boolean;

    .line 279
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f08027e

    goto :goto_0

    :cond_0
    const v0, 0x7f08027f

    :goto_0
    iget-object v1, p0, Ll/ۜ᩹ۜ;->᩸:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 280
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x7f120699

    goto :goto_1

    :cond_1
    const v0, 0x7f12069a

    :goto_1
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 281
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Ll/ۜ᩹ۜ;->᩹:Ll/᩸᩷ۡ;

    invoke-virtual {v0, p1}, Ll/᩸᩷ۡ;->֫(Z)V

    return-void
.end method
