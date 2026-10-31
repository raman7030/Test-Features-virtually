.class public final Ll/ᩳۨۘ;
.super Ljava/lang/Object;
.source "E8ZU"

# interfaces
.implements Landroid/graphics/drawable/Drawable$Callback;


# instance fields
.field public final ᩸:Landroid/graphics/drawable/Drawable$Callback;

.field public final synthetic ᩹:Ll/ܿۨۘ;


# direct methods
.method public constructor <init>(Ll/ܿۨۘ;Landroid/graphics/drawable/Drawable$Callback;)V
    .locals 0

    .line 405
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳۨۘ;->᩹:Ll/ܿۨۘ;

    .line 406
    iput-object p2, p0, Ll/ᩳۨۘ;->᩸:Landroid/graphics/drawable/Drawable$Callback;

    return-void
.end method


# virtual methods
.method public final invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 411
    iget-object p1, p0, Ll/ᩳۨۘ;->᩸:Landroid/graphics/drawable/Drawable$Callback;

    iget-object v0, p0, Ll/ᩳۨۘ;->᩹:Ll/ܿۨۘ;

    invoke-interface {p1, v0}, Landroid/graphics/drawable/Drawable$Callback;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V
    .locals 1

    .line 416
    iget-object p1, p0, Ll/ᩳۨۘ;->᩸:Landroid/graphics/drawable/Drawable$Callback;

    iget-object v0, p0, Ll/ᩳۨۘ;->᩹:Ll/ܿۨۘ;

    invoke-interface {p1, v0, p2, p3, p4}, Landroid/graphics/drawable/Drawable$Callback;->scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public final unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V
    .locals 1

    .line 421
    iget-object p1, p0, Ll/ᩳۨۘ;->᩸:Landroid/graphics/drawable/Drawable$Callback;

    iget-object v0, p0, Ll/ᩳۨۘ;->᩹:Ll/ܿۨۘ;

    invoke-interface {p1, v0, p2}, Landroid/graphics/drawable/Drawable$Callback;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V

    return-void
.end method
