.class public final synthetic Ll/ۢۙۜ;
.super Ljava/lang/Object;
.source "M74S"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field public final synthetic ᩸:Ll/֫۫ܿ;


# direct methods
.method public synthetic constructor <init>(Ll/֫۫ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢۙۜ;->᩸:Ll/֫۫ܿ;

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 1

    const/16 v0, 0x42

    if-eq p2, v0, :cond_1

    const/16 v0, 0xa0

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    .line 119
    :cond_1
    :goto_0
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p2

    const/4 p3, 0x1

    if-ne p2, p3, :cond_2

    .line 120
    iget-object p2, p0, Ll/ۢۙۜ;->᩸:Ll/֫۫ܿ;

    invoke-virtual {p2, p1}, Ll/֫۫ܿ;->onClick(Landroid/view/View;)V

    :cond_2
    return p3
.end method
