.class public final synthetic Ll/ۗ᩻ܿ;
.super Ljava/lang/Object;
.source "A7IB"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/۫᩻ܿ;

.field public final synthetic ᩹:Ll/ۙ᩻ܿ;


# direct methods
.method public synthetic constructor <init>(Ll/۫᩻ܿ;Ll/ۙ᩻ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗ᩻ܿ;->᩸:Ll/۫᩻ܿ;

    iput-object p2, p0, Ll/ۗ᩻ܿ;->᩹:Ll/ۙ᩻ܿ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 234
    iget-object p1, p0, Ll/ۗ᩻ܿ;->᩸:Ll/۫᩻ܿ;

    iget-object p1, p1, Ll/۫᩻ܿ;->᩶:Ll/ۛ᩻ܿ;

    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    iget-object v0, p0, Ll/ۗ᩻ܿ;->᩹:Ll/ۙ᩻ܿ;

    iget-object v0, v0, Ll/ۙ᩻ܿ;->ܽ:Ll/ܺ᩻ܿ;

    .line 235
    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    const v0, 0x7f120615

    .line 236
    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->֫(I)V

    const v0, 0x7f120189

    const/4 v1, 0x0

    .line 237
    invoke-virtual {p1, v0, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 238
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method
