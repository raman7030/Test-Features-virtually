.class public Ll/ۧܽ;
.super Ljava/lang/Object;
.source "V22O"

# interfaces
.implements Ll/ܿۡ֫;


# instance fields
.field public final synthetic ᩸:Ll/᩻ܽ;


# direct methods
.method public constructor <init>(Ll/᩻ܽ;)V
    .locals 0

    .line 714
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧܽ;->᩸:Ll/᩻ܽ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;)V
    .locals 1

    .line 718
    sget-object v0, Ll/᩺ۢ֫;->ۙ:Ll/᩺ۢ֫;

    if-ne p2, v0, :cond_0

    .line 719
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p2, v0, :cond_0

    .line 720
    iget-object p2, p0, Ll/ۧܽ;->᩸:Ll/᩻ܽ;

    invoke-static {p2}, Ll/᩻ܽ;->ᩳ(Ll/᩻ܽ;)Ll/ۨܽ;

    move-result-object p2

    check-cast p1, Ll/᩻ܽ;

    .line 721
    invoke-static {p1}, Ll/ܽܽ;->֫(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object p1

    .line 720
    invoke-virtual {p2, p1}, Ll/ۨܽ;->֫(Landroid/window/OnBackInvokedDispatcher;)V

    :cond_0
    return-void
.end method
