.class public final synthetic Ll/ۧ᩻ܿ;
.super Ljava/lang/Object;
.source "89CO"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ᩳ᩻ܿ;


# direct methods
.method public synthetic constructor <init>(Ll/ᩳ᩻ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧ᩻ܿ;->᩸:Ll/ᩳ᩻ܿ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 2
    iget-object p1, p0, Ll/ۧ᩻ܿ;->᩸:Ll/ᩳ᩻ܿ;

    .line 337
    iget-object p1, p1, Ll/ᩳ᩻ܿ;->᩶:Ll/ۢ᩻ܿ;

    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    const v0, 0x7f120414

    .line 338
    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->ۧ(I)V

    const v0, 0x7f1203f1

    .line 339
    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->֫(I)V

    const v0, 0x7f120189

    const/4 v1, 0x0

    .line 340
    invoke-virtual {p1, v0, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 341
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method
