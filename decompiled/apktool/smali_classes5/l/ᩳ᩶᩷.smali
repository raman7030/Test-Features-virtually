.class public final synthetic Ll/ᩳ᩶᩷;
.super Ljava/lang/Object;
.source "V933"

# interfaces
.implements Ll/۬ۤ;


# instance fields
.field public final synthetic ֫:Ll/ۨ᩹᩷;

.field public final synthetic ۧ:Landroid/widget/ImageView;

.field public final synthetic ܽ:Ll/ܳ᩶᩷;

.field public final synthetic ܿ:Ll/֡ۚۢ;

.field public final synthetic ᩳ:Ll/᩸֡ᩴ;


# direct methods
.method public synthetic constructor <init>(Ll/ۨ᩹᩷;Landroid/widget/ImageView;Ll/ܳ᩶᩷;Ll/᩸֡ᩴ;Ll/֡ۚۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳ᩶᩷;->֫:Ll/ۨ᩹᩷;

    iput-object p2, p0, Ll/ᩳ᩶᩷;->ۧ:Landroid/widget/ImageView;

    iput-object p3, p0, Ll/ᩳ᩶᩷;->ܽ:Ll/ܳ᩶᩷;

    iput-object p4, p0, Ll/ᩳ᩶᩷;->ᩳ:Ll/᩸֡ᩴ;

    iput-object p5, p0, Ll/ᩳ᩶᩷;->ܿ:Ll/֡ۚۢ;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 2
    check-cast p1, Ll/᩹ۖܳ;

    .line 63
    iget-object v0, p0, Ll/ᩳ᩶᩷;->֫:Ll/ۨ᩹᩷;

    iput-object p1, v0, Ll/ۨ᩹᩷;->ۧ:Ll/᩹ۖܳ;

    .line 64
    iget-object p1, p0, Ll/ᩳ᩶᩷;->ܽ:Ll/ܳ᩶᩷;

    invoke-interface {p1, v0}, Ll/ܳ᩶᩷;->ۧ(Ll/ۨ᩹᩷;)Landroid/graphics/Bitmap;

    move-result-object p1

    iget-object v0, p0, Ll/ᩳ᩶᩷;->ۧ:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 65
    iget-object p1, p0, Ll/ᩳ᩶᩷;->ᩳ:Ll/᩸֡ᩴ;

    invoke-virtual {p1}, Ll/᩸֡ᩴ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 66
    invoke-virtual {p1}, Ll/᩸֡ᩴ;->ܳ()V

    .line 67
    invoke-virtual {p1}, Ll/᩸֡ᩴ;->ܽ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֡ۚۢ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/֡ۚۢ;->֫(Z)V

    .line 69
    :cond_0
    iget-object p1, p0, Ll/ᩳ᩶᩷;->ܿ:Ll/֡ۚۢ;

    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V

    return-void
.end method
