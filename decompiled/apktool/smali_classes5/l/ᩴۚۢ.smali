.class public final synthetic Ll/ᩴۚۢ;
.super Ljava/lang/Object;
.source "K1Z9"

# interfaces
.implements Ll/۠ۛ;


# instance fields
.field public final synthetic ᩸:Ll/۠ۛ;


# direct methods
.method public synthetic constructor <init>(Ll/۠ۛ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴۚۢ;->᩸:Ll/۠ۛ;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ᩴۚۢ;->᩸:Ll/۠ۛ;

    .line 54
    :try_start_0
    invoke-interface {v0, p1}, Ll/۠ۛ;->֫(Landroid/view/KeyEvent;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method
