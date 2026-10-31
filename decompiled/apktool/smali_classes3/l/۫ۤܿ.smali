.class public final Ll/۫ۤܿ;
.super Ljava/lang/Object;
.source "I4HH"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# instance fields
.field public ᩸:Ll/ۡۤۡ;

.field public final synthetic ᩹:Ll/᩺ۤܿ;


# direct methods
.method public constructor <init>(Ll/᩺ۤܿ;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ۤܿ;->᩹:Ll/᩺ۤܿ;

    .line 72
    invoke-static {}, Ll/ۡۤۡ;->ܳ()Ll/ۡۤۡ;

    move-result-object p1

    iput-object p1, p0, Ll/۫ۤܿ;->᩸:Ll/ۡۤۡ;

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 76
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_2

    const/4 p1, 0x4

    if-ne p2, p1, :cond_2

    .line 77
    iget-object p1, p0, Ll/۫ۤܿ;->᩹:Ll/᩺ۤܿ;

    iget-boolean p2, p1, Ll/᩺ۤܿ;->ۧ:Z

    if-nez p2, :cond_1

    .line 78
    iget-object p2, p0, Ll/۫ۤܿ;->᩸:Ll/ۡۤۡ;

    invoke-virtual {p2}, Ll/ۡۤۡ;->ܽ()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 79
    invoke-virtual {p1}, Ll/᩺ۤܿ;->ۧ()V

    goto :goto_0

    :cond_0
    const p1, 0x7f12015f

    .line 81
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method
