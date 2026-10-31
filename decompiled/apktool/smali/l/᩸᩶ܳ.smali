.class public final synthetic Ll/᩸᩶ܳ;
.super Ljava/lang/Object;
.source "X5LN"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ۙ:Landroid/view/View;

.field public final synthetic ᩶:Ll/֡ۚۢ;

.field public final synthetic ᩸:Ll/ܳۙܳ;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/ܳۙܳ;ILl/֡ۚۢ;Landroid/view/View;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸᩶ܳ;->᩸:Ll/ܳۙܳ;

    iput p2, p0, Ll/᩸᩶ܳ;->᩹:I

    iput-object p3, p0, Ll/᩸᩶ܳ;->᩶:Ll/֡ۚۢ;

    iput-object p4, p0, Ll/᩸᩶ܳ;->ۙ:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 0
    iget-object p1, p0, Ll/᩸᩶ܳ;->᩶:Ll/֡ۚۢ;

    iget-object p2, p0, Ll/᩸᩶ܳ;->ۙ:Landroid/view/View;

    iget-object v0, p0, Ll/᩸᩶ܳ;->᩸:Ll/ܳۙܳ;

    iget v1, p0, Ll/᩸᩶ܳ;->᩹:I

    invoke-static {v0, v1, p1, p2}, Ll/ܳۙܳ;->֫(Ll/ܳۙܳ;ILl/֡ۚۢ;Landroid/view/View;)V

    return-void
.end method
