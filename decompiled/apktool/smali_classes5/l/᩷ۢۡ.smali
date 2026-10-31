.class public final Ll/᩷ۢۡ;
.super Ll/֡᩻;
.source "J5HS"


# instance fields
.field public final synthetic ᩸:Ll/ۢۢۡ;


# direct methods
.method public constructor <init>(Ll/ۢۢۡ;)V
    .locals 0

    .line 185
    iput-object p1, p0, Ll/᩷ۢۡ;->᩸:Ll/ۢۢۡ;

    .line 186
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    invoke-static {}, Ll/᩶ۖ᩷;->֫()Landroid/graphics/drawable/StateListDrawable;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/֡᩻;-><init>(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 191
    iget-object v0, p0, Ll/᩷ۢۡ;->᩸:Ll/ۢۢۡ;

    invoke-static {v0}, Ll/ۢۢۡ;->ᩳ(Ll/ۢۢۡ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 192
    invoke-super {p0, p1}, Ll/֡᩻;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    return-void
.end method
