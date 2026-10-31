.class public final synthetic Ll/᩺᩻ۡ;
.super Ljava/lang/Object;
.source "98W2"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public final synthetic ᩸:Landroid/view/Window;


# direct methods
.method public synthetic constructor <init>(Landroid/view/Window;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺᩻ۡ;->᩸:Landroid/view/Window;

    return-void
.end method


# virtual methods
.method public final onDismiss()V
    .locals 3

    .line 312
    iget-object v0, p0, Ll/᩺᩻ۡ;->᩸:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    .line 313
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->alpha:F

    const/4 v2, 0x2

    .line 314
    invoke-virtual {v0, v2}, Landroid/view/Window;->clearFlags(I)V

    .line 315
    invoke-virtual {v0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    return-void
.end method
