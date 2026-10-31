.class public Ll/ۧ᩻֫;
.super Ljava/lang/Object;
.source "J4LB"

# interfaces
.implements Ll/ܿۡ֫;


# instance fields
.field public final synthetic ᩸:Ll/ۡ᩻֫;


# direct methods
.method public constructor <init>(Ll/ۡ᩻֫;)V
    .locals 0

    .line 3077
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧ᩻֫;->᩸:Ll/ۡ᩻֫;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;)V
    .locals 0

    .line 3081
    sget-object p1, Ll/᩺ۢ֫;->ۛ:Ll/᩺ۢ֫;

    if-ne p2, p1, :cond_0

    .line 3082
    iget-object p1, p0, Ll/ۧ᩻֫;->᩸:Ll/ۡ᩻֫;

    iget-object p1, p1, Ll/ۡ᩻֫;->mView:Landroid/view/View;

    if-eqz p1, :cond_0

    .line 3697
    invoke-virtual {p1}, Landroid/view/View;->cancelPendingInputEvents()V

    :cond_0
    return-void
.end method
