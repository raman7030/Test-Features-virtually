.class public final synthetic Ll/᩵᩻ۡ;
.super Ljava/lang/Object;
.source "A924"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic ᩸:Landroid/widget/TextView;

.field public final synthetic ᩹:Landroid/text/method/MovementMethod;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/TextView;Landroid/text/method/MovementMethod;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵᩻ۡ;->᩸:Landroid/widget/TextView;

    iput-object p2, p0, Ll/᩵᩻ۡ;->᩹:Landroid/text/method/MovementMethod;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .line 140
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p1

    if-nez p1, :cond_0

    .line 141
    iget-object p1, p0, Ll/᩵᩻ۡ;->᩸:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getMovementMethod()Landroid/text/method/MovementMethod;

    move-result-object p2

    iget-object v0, p0, Ll/᩵᩻ۡ;->᩹:Landroid/text/method/MovementMethod;

    if-eq p2, v0, :cond_0

    .line 142
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
