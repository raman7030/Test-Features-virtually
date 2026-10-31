.class public final Ll/ܳ᩹ۧ;
.super Ll/ܽۛ;
.source "J634"


# instance fields
.field public final synthetic ֫:Ll/᩻᩹ۧ;


# direct methods
.method public constructor <init>(Ll/᩻᩹ۧ;)V
    .locals 0

    .line 61
    iput-object p1, p0, Ll/ܳ᩹ۧ;->֫:Ll/᩻᩹ۧ;

    invoke-direct {p0}, Ll/ܽۛ;-><init>()V

    return-void
.end method


# virtual methods
.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ܳ۟;)V
    .locals 2

    .line 64
    iget-object v0, p0, Ll/ܳ᩹ۧ;->֫:Ll/᩻᩹ۧ;

    iget-object v1, v0, Ll/᩻᩹ۧ;->֫:Ll/ܽۛ;

    invoke-virtual {v1, p1, p2}, Ll/ܽۛ;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ܳ۟;)V

    .line 65
    iget-object p2, v0, Ll/᩻᩹ۧ;->ܽ:Ll/۬۬ۧ;

    invoke-virtual {p2, p1}, Ll/۬۬ۧ;->getChildAdapterPosition(Landroid/view/View;)I

    move-result p1

    .line 67
    iget-object p2, v0, Ll/᩻᩹ۧ;->ܽ:Ll/۬۬ۧ;

    invoke-virtual {p2}, Ll/۬۬ۧ;->getAdapter()Ll/᩶ۗۧ;

    move-result-object p2

    .line 68
    instance-of v0, p2, Ll/ۛ᩸ۧ;

    if-nez v0, :cond_0

    return-void

    .line 72
    :cond_0
    check-cast p2, Ll/ۛ᩸ۧ;

    .line 73
    invoke-virtual {p2, p1}, Ll/ۛ᩸ۧ;->֫(I)Ll/֫᩸ۧ;

    return-void
.end method

.method public final performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 1

    .line 84
    iget-object v0, p0, Ll/ܳ᩹ۧ;->֫:Ll/᩻᩹ۧ;

    iget-object v0, v0, Ll/᩻᩹ۧ;->֫:Ll/ܽۛ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ܽۛ;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method
