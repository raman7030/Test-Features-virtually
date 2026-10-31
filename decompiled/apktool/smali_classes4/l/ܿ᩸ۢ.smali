.class public final synthetic Ll/ܿ᩸ۢ;
.super Ljava/lang/Object;
.source "Y9AZ"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic ᩸:Ll/ۗܺ᩷;

.field public final synthetic ᩹:Ll/ܳۡ֫;


# direct methods
.method public synthetic constructor <init>(Ll/ۗܺ᩷;Ll/ܳۡ֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿ᩸ۢ;->᩸:Ll/ۗܺ᩷;

    iput-object p2, p0, Ll/ܿ᩸ۢ;->᩹:Ll/ܳۡ֫;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 2
    iget-object p1, p0, Ll/ܿ᩸ۢ;->᩹:Ll/ܳۡ֫;

    .line 358
    iget-object v0, p0, Ll/ܿ᩸ۢ;->᩸:Ll/ۗܺ᩷;

    invoke-virtual {v0}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/۟ۢ֫;->ۧ(Ll/ܳۡ֫;)V

    return-void
.end method
