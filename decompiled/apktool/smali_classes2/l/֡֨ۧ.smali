.class public final synthetic Ll/֡֨ۧ;
.super Ljava/lang/Object;
.source "28G3"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۙ:Ll/᩵֨ۧ;

.field public final synthetic ᩶:Ll/۬᩵֫;

.field public final synthetic ᩸:Ll/ۚ֨ۧ;

.field public final synthetic ᩹:Ll/֨᩵֫;


# direct methods
.method public synthetic constructor <init>(Ll/ۚ֨ۧ;Ll/֨᩵֫;Ll/۬᩵֫;Ll/᩵֨ۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡֨ۧ;->᩸:Ll/ۚ֨ۧ;

    iput-object p2, p0, Ll/֡֨ۧ;->᩹:Ll/֨᩵֫;

    iput-object p3, p0, Ll/֡֨ۧ;->᩶:Ll/۬᩵֫;

    iput-object p4, p0, Ll/֡֨ۧ;->ۙ:Ll/᩵֨ۧ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    const/16 p1, 0x1d

    .line 2432
    iget-object v0, p0, Ll/֡֨ۧ;->᩹:Ll/֨᩵֫;

    invoke-interface {v0, p1}, Ll/֨᩵֫;->ۧ(I)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 2436
    :cond_0
    invoke-interface {v0}, Ll/֨᩵֫;->۠()Ll/ۨ᩵֫;

    move-result-object p1

    .line 2439
    invoke-virtual {p1}, Ll/ۨ᩵֫;->֫()Ll/ۛ᩵֫;

    move-result-object p1

    new-instance v1, Ll/۫᩵֫;

    iget-object v2, p0, Ll/֡֨ۧ;->ۙ:Ll/᩵֨ۧ;

    iget v3, v2, Ll/᩵֨ۧ;->ۧ:I

    .line 2442
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v3

    iget-object v4, p0, Ll/֡֨ۧ;->᩶:Ll/۬᩵֫;

    invoke-direct {v1, v4, v3}, Ll/۫᩵֫;-><init>(Ll/۬᩵֫;Ljava/util/List;)V

    .line 2440
    invoke-virtual {p1, v1}, Ll/ۛ᩵֫;->֫(Ll/۫᩵֫;)Ll/ۛ᩵֫;

    move-result-object p1

    iget-object v1, v2, Ll/᩵֨ۧ;->֫:Ll/᩺᩵֫;

    .line 2443
    invoke-virtual {v1}, Ll/᩺᩵֫;->ۧ()I

    move-result v1

    const/4 v3, 0x0

    invoke-virtual {p1, v1, v3}, Ll/ۛ᩵֫;->֫(IZ)Ll/ۛ᩵֫;

    move-result-object p1

    .line 2444
    invoke-virtual {p1}, Ll/ۛ᩵֫;->֫()Ll/ۨ᩵֫;

    move-result-object p1

    .line 2437
    invoke-interface {v0, p1}, Ll/֨᩵֫;->֫(Ll/ۨ᩵֫;)V

    .line 2445
    iget-object p1, v2, Ll/᩵֨ۧ;->ܽ:Ljava/lang/String;

    iget-object v0, p0, Ll/֡֨ۧ;->᩸:Ll/ۚ֨ۧ;

    invoke-virtual {v0, p1}, Ll/ۚ֨ۧ;->ۧ(Ljava/lang/String;)V

    .line 2446
    iget-object p1, v0, Ll/ۚ֨ۧ;->֫:Ll/۠֨ۧ;

    invoke-static {p1}, Ll/۠֨ۧ;->᩶(Ll/۠֨ۧ;)Landroid/widget/PopupWindow;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method
