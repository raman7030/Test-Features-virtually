.class public final synthetic Ll/ܶ᩷᩻;
.super Ljava/lang/Object;
.source "W79N"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic ᩸:Ll/᩷ۢ᩻;

.field public final synthetic ᩹:Ll/ܰ᩷᩻;


# direct methods
.method public synthetic constructor <init>(Ll/ܰ᩷᩻;Ll/᩷ۢ᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/ܶ᩷᩻;->᩸:Ll/᩷ۢ᩻;

    iput-object p1, p0, Ll/ܶ᩷᩻;->᩹:Ll/ܰ᩷᩻;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 0

    .line 895
    iget-object p1, p0, Ll/ܶ᩷᩻;->᩸:Ll/᩷ۢ᩻;

    invoke-virtual {p1}, Ll/᩷ۢ᩻;->֫()V

    .line 896
    iget-object p1, p0, Ll/ܶ᩷᩻;->᩹:Ll/ܰ᩷᩻;

    invoke-static {p1}, Ll/ܰ᩷᩻;->ܿ(Ll/ܰ᩷᩻;)V

    return-void
.end method
