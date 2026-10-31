.class public final synthetic Ll/ܺۛܿ;
.super Ljava/lang/Object;
.source "C4QU"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic ᩸:Ll/ܳۨܿ;

.field public final synthetic ᩹:Landroid/widget/Button;


# direct methods
.method public synthetic constructor <init>(Ll/ܳۨܿ;Landroid/widget/Button;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺۛܿ;->᩸:Ll/ܳۨܿ;

    iput-object p2, p0, Ll/ܺۛܿ;->᩹:Landroid/widget/Button;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 0
    iget-object p1, p0, Ll/ܺۛܿ;->᩸:Ll/ܳۨܿ;

    iget-object v0, p0, Ll/ܺۛܿ;->᩹:Landroid/widget/Button;

    invoke-static {p1, v0}, Ll/ܳۨܿ;->֫(Ll/ܳۨܿ;Landroid/widget/Button;)V

    return-void
.end method
