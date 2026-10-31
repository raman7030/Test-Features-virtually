.class public final synthetic Ll/֫ۚ᩷;
.super Ljava/lang/Object;
.source "E72G"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Landroid/webkit/JsPromptResult;


# direct methods
.method public synthetic constructor <init>(Landroid/webkit/JsPromptResult;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫ۚ᩷;->᩸:Landroid/webkit/JsPromptResult;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 2
    sget-object p1, Ll/֨ۚ᩷;->᩺ۧ:Ll/᩵ۚ᩷;

    .line 1034
    iget-object p1, p0, Ll/֫ۚ᩷;->᩸:Landroid/webkit/JsPromptResult;

    invoke-virtual {p1}, Landroid/webkit/JsResult;->cancel()V

    return-void
.end method
