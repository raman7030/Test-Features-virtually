.class public final synthetic Ll/ۡᩴܿ;
.super Ljava/lang/Object;
.source "N15M"

# interfaces
.implements Ll/ܶۖ;


# instance fields
.field public final synthetic ۗ:Ll/᩵ᩴܿ;

.field public final synthetic ۙ:Ll/֡ᩴܿ;

.field public final synthetic ᩶:Ll/֡ۚۢ;

.field public final synthetic ᩸:Landroid/widget/TextView;

.field public final synthetic ᩹:Ll/۫ۨᩳ;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/TextView;Ll/۫ۨᩳ;Ll/᩵ᩴܿ;Ll/֡ᩴܿ;Ll/֡ۚۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡᩴܿ;->᩸:Landroid/widget/TextView;

    iput-object p2, p0, Ll/ۡᩴܿ;->᩹:Ll/۫ۨᩳ;

    iput-object p5, p0, Ll/ۡᩴܿ;->᩶:Ll/֡ۚۢ;

    iput-object p4, p0, Ll/ۡᩴܿ;->ۙ:Ll/֡ᩴܿ;

    iput-object p3, p0, Ll/ۡᩴܿ;->ۗ:Ll/᩵ᩴܿ;

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 6

    .line 0
    iget-object v3, p0, Ll/ۡᩴܿ;->ۙ:Ll/֡ᩴܿ;

    iget-object v4, p0, Ll/ۡᩴܿ;->ۗ:Ll/᩵ᩴܿ;

    iget-object v0, p0, Ll/ۡᩴܿ;->᩸:Landroid/widget/TextView;

    iget-object v1, p0, Ll/ۡᩴܿ;->᩹:Ll/۫ۨᩳ;

    iget-object v2, p0, Ll/ۡᩴܿ;->᩶:Ll/֡ۚۢ;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Ll/֡ᩴܿ;->֫(Landroid/widget/TextView;Ll/۫ۨᩳ;Ll/֡ۚۢ;Ll/֡ᩴܿ;Ll/᩵ᩴܿ;Landroid/view/MenuItem;)V

    const/4 p1, 0x1

    return p1
.end method
