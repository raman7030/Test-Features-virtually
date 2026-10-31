.class public final synthetic Ll/֡ۢۢ;
.super Ljava/lang/Object;
.source "K1PX"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ܺۢۢ;

.field public final synthetic ᩹:Landroid/graphics/drawable/Drawable;


# direct methods
.method public synthetic constructor <init>(Ll/ܺۢۢ;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ۢۢ;->᩸:Ll/ܺۢۢ;

    iput-object p2, p0, Ll/֡ۢۢ;->᩹:Landroid/graphics/drawable/Drawable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 272
    iget-object v0, p0, Ll/֡ۢۢ;->᩸:Ll/ܺۢۢ;

    iget-boolean v1, v0, Ll/ܺۢۢ;->֫:Z

    iget-object v0, v0, Ll/ܺۢۢ;->ܽ:Ll/֡᩻;

    iget-object v2, p0, Ll/֡ۢۢ;->᩹:Landroid/graphics/drawable/Drawable;

    if-nez v1, :cond_0

    .line 273
    invoke-virtual {v0, v2}, Ll/֡᩻;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 275
    :cond_0
    invoke-virtual {v0}, Ll/֡᩻;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 277
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 278
    new-instance v3, Landroid/graphics/drawable/TransitionDrawable;

    const/4 v4, 0x2

    new-array v4, v4, [Landroid/graphics/drawable/Drawable;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v1, 0x1

    aput-object v2, v4, v1

    invoke-direct {v3, v4}, Landroid/graphics/drawable/TransitionDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 279
    invoke-virtual {v0, v3}, Ll/֡᩻;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 280
    invoke-virtual {v3, v1}, Landroid/graphics/drawable/TransitionDrawable;->setCrossFadeEnabled(Z)V

    const/16 v0, 0x12c

    .line 281
    invoke-virtual {v3, v0}, Landroid/graphics/drawable/TransitionDrawable;->startTransition(I)V

    return-void
.end method
