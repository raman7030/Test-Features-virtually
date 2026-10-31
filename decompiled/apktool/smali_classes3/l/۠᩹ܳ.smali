.class public final Ll/۠᩹ܳ;
.super Ljava/lang/Object;
.source "164Z"

# interfaces
.implements Ll/֫᩶ܳ;


# instance fields
.field public final ֫:Ll/᩵ܶ᩷;


# direct methods
.method public constructor <init>(Ll/᩵ܶ᩷;)V
    .locals 0

    .line 227
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 228
    iput-object p1, p0, Ll/۠᩹ܳ;->֫:Ll/᩵ܶ᩷;

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 3

    const-string v0, "ad_title"

    const-string v1, ""

    .line 233
    iget-object v2, p0, Ll/۠᩹ܳ;->֫:Ll/᩵ܶ᩷;

    invoke-virtual {v2, v0, v1}, Ll/᩵ܶ᩷;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic ֫()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ֫(Lbin/mt/plus/Main;)V
    .locals 7

    .line 132
    iget-object v0, p0, Ll/۠᩹ܳ;->֫:Ll/᩵ܶ᩷;

    const-string v1, "ad_title"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ll/᩵ܶ᩷;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "ad_msg"

    invoke-virtual {v0, v3, v2}, Ll/᩵ܶ᩷;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "ad_button"

    invoke-virtual {v0, v4, v2}, Ll/᩵ܶ᩷;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "ad_copy_text"

    invoke-virtual {v0, v5, v2}, Ll/᩵ܶ᩷;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "ad_open_url"

    invoke-virtual {v0, v6, v2}, Ll/᩵ܶ᩷;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 248
    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v6

    .line 249
    invoke-virtual {v6, v1}, Ll/᩵ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    .line 250
    invoke-virtual {v6, v3}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    .line 251
    invoke-virtual {v6, v4, v2}, Ll/᩵ۚۢ;->ܽ(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    const v3, 0x7f120189

    .line 252
    invoke-virtual {v6, v3, v2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    const-string v3, "\u4e0d\u518d\u663e\u793a"

    .line 253
    invoke-virtual {v6, v3, v2}, Ll/᩵ۚۢ;->ۧ(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    const/4 v2, 0x0

    .line 254
    invoke-virtual {v6, v2}, Ll/᩵ۚۢ;->֫(Z)V

    .line 255
    invoke-virtual {v6}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v2

    .line 256
    invoke-static {v2}, Ll/ۚۗܿ;->֫(Ll/֡ۚۢ;)V

    .line 257
    invoke-virtual {v2}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v3

    new-instance v4, Ll/֡᩹ܳ;

    invoke-direct {v4, v0, p1, v5}, Ll/֡᩹ܳ;-><init>(Ljava/lang/String;Lbin/mt/plus/Main;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 267
    invoke-virtual {v2}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v0

    new-instance v3, Ll/ۚ᩹ܳ;

    invoke-direct {v3, p0, p1, v1, v2}, Ll/ۚ᩹ܳ;-><init>(Ll/۠᩹ܳ;Lbin/mt/plus/Main;Ljava/lang/String;Ll/֡ۚۢ;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 278
    invoke-virtual {v2}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object p1

    sget-object v0, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 279
    invoke-virtual {v2}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object p1

    const v0, 0x3f333333    # 0.7f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 280
    invoke-virtual {v2}, Ll/֡ۚۢ;->ܳ()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_0

    const v0, 0x102000b

    .line 282
    invoke-virtual {p1, v0}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 283
    instance-of v0, p1, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 284
    check-cast p1, Landroid/widget/TextView;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    const/4 v0, 0x0

    const v1, 0x3f99999a    # 1.2f

    .line 285
    invoke-virtual {p1, v0, v1}, Landroid/widget/TextView;->setLineSpacing(FF)V

    :cond_0
    return-void
.end method

.method public final ۧ()Ll/ۨܺ᩷;
    .locals 1

    .line 238
    sget-object v0, Ll/᩶ۖܳ;->ܽ֫:Ll/᩶ۖܳ;

    .line 252
    iget-object v0, v0, Ll/᩶ۖܳ;->ۧ:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final synthetic ܽ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
