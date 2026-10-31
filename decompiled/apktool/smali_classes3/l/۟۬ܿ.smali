.class public final synthetic Ll/۟۬ܿ;
.super Ljava/lang/Object;
.source "P5BR"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# instance fields
.field public final synthetic ᩸:Ll/֫۫ܿ;


# direct methods
.method public synthetic constructor <init>(Ll/֫۫ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟۬ܿ;->᩸:Ll/֫۫ܿ;

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 2
    iget-object v0, p0, Ll/۟۬ܿ;->᩸:Ll/֫۫ܿ;

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p3

    if-nez p3, :cond_0

    const/4 p3, 0x4

    if-ne p2, p3, :cond_0

    .line 51
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
