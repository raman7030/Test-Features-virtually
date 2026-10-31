.class public final Ll/ۙ᩺ܽ;
.super Ll/۬ۗܿ;
.source "Y184"


# instance fields
.field public final synthetic ֫֫:Ll/۬᩺ܽ;

.field public final synthetic ۟:Ll/۬᩺ܽ;

.field public final synthetic ۧ֫:Ll/۬᩺ܽ;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Ll/۬᩺ܽ;Ll/۬᩺ܽ;Ll/۬᩺ܽ;)V
    .locals 0

    .line 457
    iput-object p2, p0, Ll/ۙ᩺ܽ;->۟:Ll/۬᩺ܽ;

    iput-object p3, p0, Ll/ۙ᩺ܽ;->֫֫:Ll/۬᩺ܽ;

    iput-object p4, p0, Ll/ۙ᩺ܽ;->ۧ֫:Ll/۬᩺ܽ;

    const/4 p2, -0x1

    .line 40
    invoke-direct {p0, p1, p2}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 7

    .line 460
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v3, "->"

    .line 542
    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 543
    array-length v3, v0

    const/4 v4, 0x2

    if-eq v3, v4, :cond_1

    :goto_0
    move-object v0, v1

    move-object v4, v0

    goto :goto_3

    .line 546
    :cond_1
    aget-object v3, v0, v2

    .line 547
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    if-le v5, v4, :cond_5

    const-string v5, "L"

    invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_5

    const-string v5, ";"

    invoke-virtual {v3, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    const/4 v5, 0x1

    .line 550
    aget-object v0, v0, v5

    const-string v6, ":"

    invoke-virtual {v0, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 551
    array-length v6, v0

    if-eq v6, v4, :cond_3

    goto :goto_1

    .line 554
    :cond_3
    aget-object v4, v0, v2

    .line 555
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_4

    goto :goto_2

    .line 558
    :cond_4
    aget-object v1, v0, v5

    const-string v0, "\\[*([VCZBISJDF]|L[^;:()\\r\\n]+;)"

    .line 559
    invoke-virtual {v1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_2

    :cond_5
    :goto_1
    move-object v4, v1

    :goto_2
    move-object v0, v1

    move-object v1, v3

    :goto_3
    const/4 v5, 0x0

    move-object v3, v1

    move-object v1, v0

    :cond_6
    if-nez v5, :cond_7

    const v0, 0x7f120392

    .line 462
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 465
    :cond_7
    iget-object v0, p0, Ll/ۙ᩺ܽ;->۟:Ll/۬᩺ܽ;

    iget-object v5, v0, Ll/۬᩺ܽ;->᩹:Landroid/widget/EditText;

    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 466
    iget-object v3, p0, Ll/ۙ᩺ܽ;->֫֫:Ll/۬᩺ܽ;

    iget-object v5, v3, Ll/۬᩺ܽ;->᩹:Landroid/widget/EditText;

    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 467
    iget-object v4, p0, Ll/ۙ᩺ܽ;->ۧ֫:Ll/۬᩺ܽ;

    iget-object v5, v4, Ll/۬᩺ܽ;->᩹:Landroid/widget/EditText;

    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 468
    iget-object v1, v0, Ll/۬᩺ܽ;->᩸:Landroid/widget/CheckBox;

    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 469
    iget-object v0, v0, Ll/۬᩺ܽ;->۬:Landroid/widget/CheckBox;

    invoke-virtual {v0, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 470
    iget-object v0, v3, Ll/۬᩺ܽ;->᩸:Landroid/widget/CheckBox;

    invoke-virtual {v0, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 471
    iget-object v0, v3, Ll/۬᩺ܽ;->۬:Landroid/widget/CheckBox;

    invoke-virtual {v0, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 472
    iget-object v0, v4, Ll/۬᩺ܽ;->᩸:Landroid/widget/CheckBox;

    invoke-virtual {v0, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 473
    iget-object v0, v4, Ll/۬᩺ܽ;->۬:Landroid/widget/CheckBox;

    invoke-virtual {v0, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 474
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void
.end method
