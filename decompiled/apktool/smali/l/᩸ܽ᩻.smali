.class public final synthetic Ll/᩸ܽ᩻;
.super Ljava/lang/Object;
.source "29SR"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/᩹ܽ᩻;

.field public final synthetic ᩹:Landroid/graphics/drawable/BitmapDrawable;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ܽ᩻;Landroid/graphics/drawable/BitmapDrawable;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ܽ᩻;->᩸:Ll/᩹ܽ᩻;

    iput-object p2, p0, Ll/᩸ܽ᩻;->᩹:Landroid/graphics/drawable/BitmapDrawable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 303
    iget-object v0, p0, Ll/᩸ܽ᩻;->᩸:Ll/᩹ܽ᩻;

    iget-object v1, v0, Ll/᩹ܽ᩻;->ۧ:Ll/֡᩻;

    iget-boolean v0, v0, Ll/᩹ܽ᩻;->֫:Z

    iget-object v2, p0, Ll/᩸ܽ᩻;->᩹:Landroid/graphics/drawable/BitmapDrawable;

    if-nez v0, :cond_0

    .line 304
    invoke-virtual {v1, v2}, Ll/֡᩻;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 306
    :cond_0
    invoke-virtual {v1}, Ll/֡᩻;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 308
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 309
    new-instance v3, Landroid/graphics/drawable/TransitionDrawable;

    const/4 v4, 0x2

    new-array v4, v4, [Landroid/graphics/drawable/Drawable;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v2, v4, v0

    invoke-direct {v3, v4}, Landroid/graphics/drawable/TransitionDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 310
    invoke-virtual {v1, v3}, Ll/֡᩻;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 311
    invoke-virtual {v3, v0}, Landroid/graphics/drawable/TransitionDrawable;->setCrossFadeEnabled(Z)V

    const/16 v0, 0x12c

    .line 312
    invoke-virtual {v3, v0}, Landroid/graphics/drawable/TransitionDrawable;->startTransition(I)V

    return-void
.end method
