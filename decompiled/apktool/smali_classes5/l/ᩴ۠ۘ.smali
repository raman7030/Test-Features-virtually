.class public final Ll/ᩴ۠ۘ;
.super Ll/֡۠ۘ;
.source "51RR"


# instance fields
.field public final synthetic ᩶:Lorg/json/JSONObject;

.field public final synthetic ᩹:Ll/ۘ᩹ۘ;


# direct methods
.method public constructor <init>(Landroid/app/Dialog;Ll/ۘ᩹ۘ;Lorg/json/JSONObject;)V
    .locals 0

    .line 697
    iput-object p2, p0, Ll/ᩴ۠ۘ;->᩹:Ll/ۘ᩹ۘ;

    iput-object p3, p0, Ll/ᩴ۠ۘ;->᩶:Lorg/json/JSONObject;

    invoke-direct {p0, p1}, Ll/֡۠ۘ;-><init>(Landroid/app/Dialog;)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 701
    iget-object p1, p0, Ll/֡۠ۘ;->᩸:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 702
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 704
    :cond_0
    iget-object p1, p0, Ll/ᩴ۠ۘ;->᩹:Ll/ۘ᩹ۘ;

    if-eqz p1, :cond_1

    .line 705
    iget-object v0, p0, Ll/ᩴ۠ۘ;->᩶:Lorg/json/JSONObject;

    invoke-interface {p1, v0}, Ll/ۘ᩹ۘ;->֫(Lorg/json/JSONObject;)V

    :cond_1
    return-void
.end method
