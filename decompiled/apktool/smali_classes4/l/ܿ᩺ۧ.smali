.class public final Ll/ܿ᩺ۧ;
.super Ljava/lang/Object;
.source "560O"

# interfaces
.implements Landroid/graphics/drawable/Drawable$Callback;


# instance fields
.field public final synthetic ᩸:Ll/᩷᩺ۧ;


# direct methods
.method public constructor <init>(Ll/᩷᩺ۧ;)V
    .locals 0

    .line 733
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿ᩺ۧ;->᩸:Ll/᩷᩺ۧ;

    return-void
.end method


# virtual methods
.method public final invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 736
    iget-object p1, p0, Ll/ܿ᩺ۧ;->᩸:Ll/᩷᩺ۧ;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V
    .locals 0

    .line 741
    iget-object p1, p0, Ll/ܿ᩺ۧ;->᩸:Ll/᩷᩺ۧ;

    invoke-virtual {p1, p2, p3, p4}, Landroid/graphics/drawable/Drawable;->scheduleSelf(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public final unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V
    .locals 0

    .line 746
    iget-object p1, p0, Ll/ܿ᩺ۧ;->᩸:Ll/᩷᩺ۧ;

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->unscheduleSelf(Ljava/lang/Runnable;)V

    return-void
.end method
