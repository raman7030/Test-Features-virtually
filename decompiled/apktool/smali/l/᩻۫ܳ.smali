.class public final Ll/᩻۫ܳ;
.super Ll/ۗ۬ۧ;
.source "A940"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public ᩸:Ll/ܿۜܳ;

.field public ᩹:Ll/֫ۗۧ;


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 194
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_0

    .line 195
    iget-object p1, p0, Ll/᩻۫ܳ;->᩹:Ll/֫ۗۧ;

    invoke-virtual {p1, p0}, Ll/֫ۗۧ;->ۧ(Ll/ۗ۬ۧ;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
