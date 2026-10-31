.class public final synthetic Ll/۟֡᩷;
.super Ljava/lang/Object;
.source "E72G"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Landroid/webkit/JsPromptResult;

.field public final synthetic ᩹:Landroid/widget/EditText;


# direct methods
.method public synthetic constructor <init>(Landroid/webkit/JsPromptResult;Landroid/widget/EditText;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟֡᩷;->᩸:Landroid/webkit/JsPromptResult;

    iput-object p2, p0, Ll/۟֡᩷;->᩹:Landroid/widget/EditText;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 2
    sget-object p1, Ll/֨ۚ᩷;->᩺ۧ:Ll/᩵ۚ᩷;

    .line 1033
    iget-object p1, p0, Ll/۟֡᩷;->᩹:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Ll/۟֡᩷;->᩸:Landroid/webkit/JsPromptResult;

    invoke-virtual {p2, p1}, Landroid/webkit/JsPromptResult;->confirm(Ljava/lang/String;)V

    return-void
.end method
