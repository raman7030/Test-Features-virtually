.class public final Ll/֡ۗܿ;
.super Ljava/lang/Object;
.source "D4GG"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# instance fields
.field public final synthetic ᩶:I

.field public ᩸:Ll/ۡۤۡ;

.field public final synthetic ᩹:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(ILjava/lang/Runnable;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/֡ۗܿ;->᩶:I

    iput-object p2, p0, Ll/֡ۗܿ;->᩹:Ljava/lang/Runnable;

    .line 32
    invoke-static {}, Ll/ۡۤۡ;->ܳ()Ll/ۡۤۡ;

    move-result-object p1

    iput-object p1, p0, Ll/֡ۗܿ;->᩸:Ll/ۡۤۡ;

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 36
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x4

    if-ne p2, p1, :cond_1

    .line 38
    iget-object p1, p0, Ll/֡ۗܿ;->᩸:Ll/ۡۤۡ;

    invoke-virtual {p1}, Ll/ۡۤۡ;->֫()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 39
    iget p1, p0, Ll/֡ۗܿ;->᩶:I

    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    goto :goto_0

    .line 41
    :cond_0
    invoke-static {}, Ll/᩸ۚۢ;->ܽ()V

    .line 42
    iget-object p1, p0, Ll/֡ۗܿ;->᩹:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
