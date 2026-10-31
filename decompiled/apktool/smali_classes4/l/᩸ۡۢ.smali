.class public final synthetic Ll/᩸ۡۢ;
.super Ljava/lang/Object;
.source "31PG"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ܰۡۢ;


# direct methods
.method public synthetic constructor <init>(Ll/ܰۡۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ۡۢ;->᩸:Ll/ܰۡۢ;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 2

    .line 872
    iget-object p1, p0, Ll/᩸ۡۢ;->᩸:Ll/ܰۡۢ;

    iget-object v0, p1, Ll/ܰۡۢ;->۬:Ll/۟ۡۢ;

    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    const v1, 0x7f120b7b

    .line 873
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    const v1, 0x7f1200b4

    .line 874
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(I)V

    new-instance v1, Ll/᩹ۡۢ;

    invoke-direct {v1, p1}, Ll/᩹ۡۢ;-><init>(Ll/ܰۡۢ;)V

    const p1, 0x7f1205ca

    .line 875
    invoke-virtual {v0, p1, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    const/4 v1, 0x0

    .line 876
    invoke-virtual {v0, p1, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 877
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    const/4 p1, 0x1

    return p1
.end method
