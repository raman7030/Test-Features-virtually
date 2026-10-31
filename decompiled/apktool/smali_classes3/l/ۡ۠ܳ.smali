.class public final synthetic Ll/ۡ۠ܳ;
.super Ljava/lang/Object;
.source "052E"

# interfaces
.implements Landroid/widget/AdapterView$OnItemLongClickListener;


# instance fields
.field public final synthetic ۙ:Landroid/view/View;

.field public final synthetic ᩶:Ll/֡ۚۢ;

.field public final synthetic ᩸:Ll/ۚ۠ܳ;

.field public final synthetic ᩹:[Ljava/lang/CharSequence;


# direct methods
.method public synthetic constructor <init>(Ll/ۚ۠ܳ;[Ljava/lang/CharSequence;Ll/֡ۚۢ;Landroid/view/View;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡ۠ܳ;->᩸:Ll/ۚ۠ܳ;

    iput-object p2, p0, Ll/ۡ۠ܳ;->᩹:[Ljava/lang/CharSequence;

    iput-object p3, p0, Ll/ۡ۠ܳ;->᩶:Ll/֡ۚۢ;

    iput-object p4, p0, Ll/ۡ۠ܳ;->ۙ:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 1

    .line 173
    iget-object p1, p0, Ll/ۡ۠ܳ;->᩸:Ll/ۚ۠ܳ;

    iget-object p2, p1, Ll/ۚ۠ܳ;->᩸:Ll/ۗܺ᩷;

    invoke-virtual {p2}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p2

    const p4, 0x7f1205ca

    .line 174
    invoke-virtual {p2, p4}, Ll/᩵ۚۢ;->ۧ(I)V

    iget-object p4, p0, Ll/ۡ۠ܳ;->᩹:[Ljava/lang/CharSequence;

    aget-object p4, p4, p3

    .line 175
    invoke-virtual {p2, p4}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance p4, Ll/ܺ۠ܳ;

    iget-object p5, p0, Ll/ۡ۠ܳ;->᩶:Ll/֡ۚۢ;

    iget-object v0, p0, Ll/ۡ۠ܳ;->ۙ:Landroid/view/View;

    invoke-direct {p4, p1, p3, p5, v0}, Ll/ܺ۠ܳ;-><init>(Ll/ۚ۠ܳ;ILl/֡ۚۢ;Landroid/view/View;)V

    const p1, 0x7f12070a

    .line 176
    invoke-virtual {p2, p1, p4}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    const/4 p3, 0x0

    .line 186
    invoke-virtual {p2, p1, p3}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 187
    invoke-virtual {p2}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    const/4 p1, 0x1

    return p1
.end method
