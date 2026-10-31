.class public final Ll/᩷ۙܽ;
.super Ll/ۗ۬ۧ;
.source "28VT"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final ᩸:Z

.field public final synthetic ᩹:Ll/᩹ۙܽ;


# direct methods
.method public constructor <init>(Ll/᩹ۙܽ;Landroid/view/View;Z)V
    .locals 4

    .line 380
    iput-object p1, p0, Ll/᩷ۙܽ;->᩹:Ll/᩹ۙܽ;

    .line 381
    invoke-direct {p0, p2}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    .line 382
    iput-boolean p3, p0, Ll/᩷ۙܽ;->᩸:Z

    const v0, 0x7f0a05e2

    .line 383
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f0a0321

    .line 384
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    const v2, 0x7f0a0322

    .line 385
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    const v2, 0x7f120b5f

    if-eqz p3, :cond_0

    .line 387
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const v3, 0x7f12048c

    invoke-virtual {p1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " (MT2/keys)"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 p1, 0x8

    .line 388
    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 389
    invoke-static {v2}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Ll/ᩴᩴ;->֫(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 390
    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    .line 392
    :cond_0
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const v3, 0x7f12048b

    invoke-virtual {p1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " (MT2/keystore)"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 393
    invoke-static {v2}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Ll/ᩴᩴ;->֫(Landroid/view/View;Ljava/lang/CharSequence;)V

    const p1, 0x7f12041c

    .line 394
    invoke-static {p1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Ll/ᩴᩴ;->֫(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 395
    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 396
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 402
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a0321

    iget-object v1, p0, Ll/᩷ۙܽ;->᩹:Ll/᩹ۙܽ;

    if-ne p1, v0, :cond_1

    .line 403
    invoke-static {}, Ll/ܽ֡ܿ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object p1

    iget-boolean v0, p0, Ll/᩷ۙܽ;->᩸:Z

    if-eqz v0, :cond_0

    const-string v0, "keys"

    goto :goto_0

    :cond_0
    const-string v0, "keystore"

    :goto_0
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1}, Ll/᩹ۙܽ;->ܽ(Ll/᩹ۙܽ;)Z

    move-result v0

    invoke-static {v1, p1, v0}, Lbin/mt/plus/Main;->֫(Landroid/app/Activity;Ljava/lang/String;Z)V

    return-void

    .line 405
    :cond_1
    new-instance p1, Ll/ܳۛܽ;

    new-instance v0, Ll/ۜۙܽ;

    invoke-direct {v0, p0}, Ll/ۜۙܽ;-><init>(Ll/᩷ۙܽ;)V

    invoke-direct {p1, v1, v0}, Ll/ܳۛܽ;-><init>(Ll/ۗܺ᩷;Ll/۬ۤ;)V

    .line 408
    invoke-virtual {p1}, Ll/ܳۛܽ;->֫()V

    return-void
.end method
