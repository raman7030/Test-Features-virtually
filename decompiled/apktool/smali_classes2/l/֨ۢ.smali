.class public Ll/֨ۢ;
.super Landroid/widget/LinearLayout;
.source "S696"


# static fields
.field public static final ᩸:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const v0, 0x10100d4

    .line 868
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Ll/֨ۢ;->᩸:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 873
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 874
    sget-object v0, Ll/֨ۢ;->᩸:[I

    invoke-static {p1, p2, v0}, Ll/᩺ۘ;->֫(Landroid/content/Context;Landroid/util/AttributeSet;[I)Ll/᩺ۘ;

    move-result-object p1

    const/4 p2, 0x0

    .line 875
    invoke-virtual {p1, p2}, Ll/᩺ۘ;->ᩳ(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 876
    invoke-virtual {p1}, Ll/᩺ۘ;->ܿ()V

    return-void
.end method
