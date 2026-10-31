.class public Ll/ܳۡ;
.super Landroid/widget/PopupWindow;
.source "J4W4"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 41
    invoke-direct {p0, p1, p2, p3}, Ll/ܳۡ;->֫(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    const/4 p4, 0x0

    .line 46
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 47
    invoke-direct {p0, p1, p2, p3}, Ll/ܳۡ;->֫(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private ֫(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 51
    sget-object v0, Ll/ۗᩳ;->ܶ:[I

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, p3, v1}, Ll/᩺ۘ;->֫(Landroid/content/Context;Landroid/util/AttributeSet;[III)Ll/᩺ۘ;

    move-result-object p1

    const/4 p2, 0x2

    .line 53
    invoke-virtual {p1, p2}, Ll/᩺ۘ;->ۜ(I)Z

    move-result p3

    if-eqz p3, :cond_0

    .line 54
    invoke-virtual {p1, p2, v1}, Ll/᩺ۘ;->֫(IZ)Z

    move-result p2

    .line 93
    invoke-static {p0, p2}, Ll/֨֫֫;->֫(Landroid/widget/PopupWindow;Z)V

    .line 57
    :cond_0
    invoke-virtual {p1, v1}, Ll/᩺ۘ;->ᩳ(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 59
    invoke-virtual {p1}, Ll/᩺ۘ;->ܿ()V

    return-void
.end method
