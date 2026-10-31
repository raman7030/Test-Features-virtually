.class public final synthetic Ll/᩷۠ܿ;
.super Ljava/lang/Object;
.source "313O"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۢ۠ܿ;


# direct methods
.method public synthetic constructor <init>(Ll/ۢ۠ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷۠ܿ;->᩸:Ll/ۢ۠ܿ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 635
    iget-object v0, p0, Ll/᩷۠ܿ;->᩸:Ll/ۢ۠ܿ;

    iget-object v1, v0, Ll/ۢ۠ܿ;->᩶:Ll/ۡ۠ܿ;

    iget-object v2, v1, Ll/ۡ۠ܿ;->֫:Ll/ۗ֨ܿ;

    .line 636
    iget-object v0, v0, Ll/ۢ۠ܿ;->᩹:Landroid/widget/ImageView;

    .line 637
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_0

    .line 638
    iget-object v1, v1, Ll/ۡ۠ܿ;->ܽ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method
