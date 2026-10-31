.class public final synthetic Ll/ۗۛܿ;
.super Ljava/lang/Object;
.source "C4QU"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۙ:Landroid/widget/Button;

.field public final synthetic ᩶:Landroid/widget/Button;

.field public final synthetic ᩸:Ll/ۨۛܿ;

.field public final synthetic ᩹:Ll/֡ۚۢ;


# direct methods
.method public synthetic constructor <init>(Ll/ۨۛܿ;Ll/֡ۚۢ;Landroid/widget/Button;Landroid/widget/Button;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗۛܿ;->᩸:Ll/ۨۛܿ;

    iput-object p2, p0, Ll/ۗۛܿ;->᩹:Ll/֡ۚۢ;

    iput-object p3, p0, Ll/ۗۛܿ;->᩶:Landroid/widget/Button;

    iput-object p4, p0, Ll/ۗۛܿ;->ۙ:Landroid/widget/Button;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 0
    iget-object p1, p0, Ll/ۗۛܿ;->᩶:Landroid/widget/Button;

    iget-object v0, p0, Ll/ۗۛܿ;->ۙ:Landroid/widget/Button;

    iget-object v1, p0, Ll/ۗۛܿ;->᩸:Ll/ۨۛܿ;

    iget-object v2, p0, Ll/ۗۛܿ;->᩹:Ll/֡ۚۢ;

    invoke-static {v1, v2, p1, v0}, Ll/ܳۨܿ;->֫(Ll/ۨۛܿ;Ll/֡ۚۢ;Landroid/widget/Button;Landroid/widget/Button;)V

    return-void
.end method
