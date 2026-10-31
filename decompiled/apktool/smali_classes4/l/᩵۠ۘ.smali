.class public final Ll/᩵۠ۘ;
.super Ljava/lang/Object;
.source "51RR"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic ᩸:Ll/ۘ᩹ۘ;

.field public final synthetic ᩹:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>(Ll/ۘ᩹ۘ;Lorg/json/JSONObject;)V
    .locals 0

    .line 718
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵۠ۘ;->᩸:Ll/ۘ᩹ۘ;

    iput-object p2, p0, Ll/᩵۠ۘ;->᩹:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .line 722
    iget-object p1, p0, Ll/᩵۠ۘ;->᩸:Ll/ۘ᩹ۘ;

    if-eqz p1, :cond_0

    .line 723
    iget-object v0, p0, Ll/᩵۠ۘ;->᩹:Lorg/json/JSONObject;

    invoke-interface {p1, v0}, Ll/ۘ᩹ۘ;->֫(Lorg/json/JSONObject;)V

    :cond_0
    return-void
.end method
