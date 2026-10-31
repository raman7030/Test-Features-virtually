.class public final synthetic Ll/᩶ۤ᩻;
.super Ljava/lang/Object;
.source "I6X2"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۙ:Landroid/graphics/drawable/GradientDrawable;

.field public final synthetic ᩶:Landroid/widget/ImageView;

.field public final synthetic ᩸:[I

.field public final synthetic ᩹:Ll/ۗܺ᩷;


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/drawable/GradientDrawable;Landroid/widget/ImageView;Ll/ۗܺ᩷;[I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Ll/᩶ۤ᩻;->᩸:[I

    iput-object p3, p0, Ll/᩶ۤ᩻;->᩹:Ll/ۗܺ᩷;

    iput-object p2, p0, Ll/᩶ۤ᩻;->᩶:Landroid/widget/ImageView;

    iput-object p1, p0, Ll/᩶ۤ᩻;->ۙ:Landroid/graphics/drawable/GradientDrawable;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 61
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Ll/᩶ۤ᩻;->᩸:[I

    const/4 v1, 0x0

    aput p1, v0, v1

    .line 173
    iget-object v0, p0, Ll/᩶ۤ᩻;->᩹:Ll/ۗܺ᩷;

    invoke-static {v0, p1}, Ll/᩸ۛ᩻;->֫(Landroid/content/Context;I)I

    move-result p1

    .line 164
    iget-object v0, p0, Ll/᩶ۤ᩻;->ۙ:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 212
    invoke-static {p1}, Ll/۟۫ۡ;->֫(I)I

    move-result p1

    const/16 v0, 0xdc

    if-le p1, v0, :cond_0

    const p1, -0xc4c4c5

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    .line 165
    :goto_0
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    iget-object v0, p0, Ll/᩶ۤ᩻;->᩶:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method
