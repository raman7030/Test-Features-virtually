.class public final synthetic Ll/֨᩹ܳ;
.super Ljava/lang/Object;
.source "164Z"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/۠᩹ܳ;

.field public final synthetic ᩹:Ll/֡ۚۢ;


# direct methods
.method public synthetic constructor <init>(Ll/۠᩹ܳ;Ll/֡ۚۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨᩹ܳ;->᩸:Ll/۠᩹ܳ;

    iput-object p2, p0, Ll/֨᩹ܳ;->᩹:Ll/֡ۚۢ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 271
    iget-object p1, p0, Ll/֨᩹ܳ;->᩸:Ll/۠᩹ܳ;

    iget-object p1, p1, Ll/۠᩹ܳ;->֫:Ll/᩵ܶ᩷;

    const-string p2, "ad_hide_obj"

    const-string v0, ""

    invoke-virtual {p1, p2, v0}, Ll/᩵ܶ᩷;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 272
    sget-object p2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p2}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p2

    const-string v0, "show_ad_in_tools"

    invoke-interface {p2, v0, p1}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object p1

    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    .line 273
    iget-object p1, p0, Ll/֨᩹ܳ;->᩹:Ll/֡ۚۢ;

    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V

    .line 274
    invoke-static {}, Ll/ܽ᩶ܳ;->᩷()V

    return-void
.end method
