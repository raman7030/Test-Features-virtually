.class public final Ll/ܺ᩹ۧ;
.super Ljava/lang/Object;
.source "D6A1"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field public final synthetic ᩸:Ll/ᩴ᩹ۧ;


# direct methods
.method public constructor <init>(Ll/ᩴ᩹ۧ;)V
    .locals 0

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺ᩹ۧ;->᩸:Ll/ᩴ᩹ۧ;

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 110
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    return v0

    .line 114
    :cond_0
    iget-object p1, p0, Ll/ܺ᩹ۧ;->᩸:Ll/ᩴ᩹ۧ;

    iget-boolean v1, p1, Ll/ᩴ᩹ۧ;->۫֫:Z

    if-nez v1, :cond_2

    const/16 v1, 0x15

    if-eq p2, v1, :cond_1

    const/16 v1, 0x16

    if-ne p2, v1, :cond_2

    :cond_1
    return v0

    :cond_2
    const/16 v1, 0x17

    if-eq p2, v1, :cond_5

    const/16 v1, 0x42

    if-ne p2, v1, :cond_3

    goto :goto_0

    .line 126
    :cond_3
    iget-object p1, p1, Ll/ᩴ᩹ۧ;->ۨ֫:Landroid/widget/SeekBar;

    if-nez p1, :cond_4

    return v0

    .line 130
    :cond_4
    invoke-virtual {p1, p2, p3}, Landroid/view/View;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_5
    :goto_0
    return v0
.end method
