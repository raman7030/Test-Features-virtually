.class public final synthetic Ll/᩻ۚ᩷;
.super Ljava/lang/Object;
.source "E72G"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic ᩸:Landroid/webkit/JsResult;


# direct methods
.method public synthetic constructor <init>(Landroid/webkit/JsResult;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻ۚ᩷;->᩸:Landroid/webkit/JsResult;

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .line 2
    sget-object p1, Ll/֨ۚ᩷;->᩺ۧ:Ll/᩵ۚ᩷;

    .line 993
    iget-object p1, p0, Ll/᩻ۚ᩷;->᩸:Landroid/webkit/JsResult;

    invoke-virtual {p1}, Landroid/webkit/JsResult;->cancel()V

    return-void
.end method
