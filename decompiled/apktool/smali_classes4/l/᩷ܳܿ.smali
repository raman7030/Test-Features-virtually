.class public final synthetic Ll/᩷ܳܿ;
.super Ljava/lang/Object;
.source "4AWI"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۘܳܿ;


# direct methods
.method public synthetic constructor <init>(Ll/ۘܳܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ܳܿ;->᩸:Ll/ۘܳܿ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 850
    iget-object p1, p0, Ll/᩷ܳܿ;->᩸:Ll/ۘܳܿ;

    iget-object v0, p1, Ll/ۘܳܿ;->ܿ:Ll/֡ܳܿ;

    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    const v1, 0x7f120428

    .line 851
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 852
    sget v1, Ll/۠ܳܿ;->֫:I

    .line 267
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "tfgi"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v1

    .line 852
    new-instance v2, Ll/ܺܳܿ;

    invoke-direct {v2, p1}, Ll/ܺܳܿ;-><init>(Ll/ۘܳܿ;)V

    const p1, 0x7f030017

    invoke-virtual {v0, p1, v1, v2}, Ll/᩵ۚۢ;->֫(IILandroid/content/DialogInterface$OnClickListener;)V

    .line 857
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method
