.class public Ll/᩺ۧ;
.super Ljava/lang/Object;
.source "V22O"

# interfaces
.implements Ll/ܿۡ֫;


# instance fields
.field public final synthetic ᩸:Ll/᩻ܽ;


# direct methods
.method public constructor <init>(Ll/᩻ܽ;)V
    .locals 0

    .line 273
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ۧ;->᩸:Ll/᩻ܽ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;)V
    .locals 0

    .line 277
    sget-object p1, Ll/᩺ۢ֫;->ۛ:Ll/᩺ۢ֫;

    if-ne p2, p1, :cond_1

    .line 278
    iget-object p1, p0, Ll/᩺ۧ;->᩸:Ll/᩻ܽ;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 279
    invoke-virtual {p1}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 1153
    invoke-virtual {p1}, Landroid/view/View;->cancelPendingInputEvents()V

    :cond_1
    return-void
.end method
