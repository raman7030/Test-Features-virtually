.class public final synthetic Ll/ܽ᩶᩷;
.super Ljava/lang/Object;
.source "V933"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۙ:Ll/᩸֡ᩴ;

.field public final synthetic ᩶:Ll/ܳ᩶᩷;

.field public final synthetic ᩸:Ll/ۨ᩹᩷;

.field public final synthetic ᩹:Landroid/widget/ImageView;


# direct methods
.method public synthetic constructor <init>(Ll/ۨ᩹᩷;Landroid/widget/ImageView;Ll/ܳ᩶᩷;Ll/᩸֡ᩴ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽ᩶᩷;->᩸:Ll/ۨ᩹᩷;

    iput-object p2, p0, Ll/ܽ᩶᩷;->᩹:Landroid/widget/ImageView;

    iput-object p3, p0, Ll/ܽ᩶᩷;->᩶:Ll/ܳ᩶᩷;

    iput-object p4, p0, Ll/ܽ᩶᩷;->ۙ:Ll/᩸֡ᩴ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 127
    check-cast p1, Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getImageTintList()Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result p1

    .line 128
    sget-object v0, Ll/ۛ᩹᩷;->ۙ:Ll/ۛ᩹᩷;

    .line 37
    iget-object v1, p0, Ll/ܽ᩶᩷;->᩸:Ll/ۨ᩹᩷;

    iput p1, v1, Ll/ۨ᩹᩷;->֫:I

    .line 38
    iput-object v0, v1, Ll/ۨ᩹᩷;->ܽ:Ll/ۛ᩹᩷;

    .line 129
    iget-object p1, p0, Ll/ܽ᩶᩷;->᩶:Ll/ܳ᩶᩷;

    invoke-interface {p1, v1}, Ll/ܳ᩶᩷;->ۧ(Ll/ۨ᩹᩷;)Landroid/graphics/Bitmap;

    move-result-object p1

    iget-object v0, p0, Ll/ܽ᩶᩷;->᩹:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 130
    iget-object p1, p0, Ll/ܽ᩶᩷;->ۙ:Ll/᩸֡ᩴ;

    invoke-virtual {p1}, Ll/᩸֡ᩴ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 131
    invoke-virtual {p1}, Ll/᩸֡ᩴ;->ܳ()V

    .line 132
    invoke-virtual {p1}, Ll/᩸֡ᩴ;->ܽ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֡ۚۢ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/֡ۚۢ;->֫(Z)V

    :cond_0
    return-void
.end method
