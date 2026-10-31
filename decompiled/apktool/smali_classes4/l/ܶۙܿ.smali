.class public final Ll/ܶۙܿ;
.super Landroid/widget/LinearLayout;
.source "L9CC"


# instance fields
.field public final ᩸:Ll/۠ۙܿ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ll/۠ۙܿ;)V
    .locals 0

    .line 1662
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1663
    iput-object p2, p0, Ll/ܶۙܿ;->᩸:Ll/۠ۙܿ;

    return-void
.end method


# virtual methods
.method public final dispatchHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1668
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x7

    iget-object v2, p0, Ll/ܶۙܿ;->᩸:Ll/۠ۙܿ;

    if-eq v0, v1, :cond_1

    const/16 v1, 0x9

    if-eq v0, v1, :cond_1

    const/16 v1, 0xa

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 1674
    :cond_0
    invoke-virtual {v2}, Ll/۠ۙܿ;->ᩳ()V

    goto :goto_0

    .line 1671
    :cond_1
    invoke-virtual {v2}, Ll/۠ۙܿ;->ۧ()V

    .line 1677
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->dispatchHoverEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
