.class public final Ll/᩷ۗܳ;
.super Ljava/lang/Object;
.source "8AJ9"

# interfaces
.implements Ll/᩸۬ܳ;


# instance fields
.field public ۗ:Z

.field public ۙ:Z

.field public volatile ۛ:Z

.field public ۤ:Z

.field public ۫:Z

.field public ۬:Z

.field public ᩶:Z

.field public ᩸:I

.field public final ᩹:Ll/ۗܺ᩷;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;)V
    .locals 4

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Ll/᩷ۗܳ;->᩶:Z

    .line 20
    invoke-static {}, Ll/᩹֡ܿ;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 60
    sget-object v1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v2, "def_mov_recycle_bin"

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 20
    :goto_0
    iput-boolean v3, p0, Ll/᩷ۗܳ;->ۤ:Z

    .line 21
    iput v0, p0, Ll/᩷ۗܳ;->᩸:I

    .line 33
    iput-object p1, p0, Ll/᩷ۗܳ;->᩹:Ll/ۗܺ᩷;

    .line 34
    iput-boolean v0, p0, Ll/᩷ۗܳ;->۫:Z

    return-void
.end method

.method public static synthetic ֫(Ll/᩷ۗܳ;)V
    .locals 1

    const/4 v0, 0x1

    .line 115
    iput-boolean v0, p0, Ll/᩷ۗܳ;->ۙ:Z

    const/4 v0, 0x0

    .line 116
    iput-boolean v0, p0, Ll/᩷ۗܳ;->ۛ:Z

    return-void
.end method

.method public static ֫(Ll/᩷ۗܳ;Ljava/lang/String;Ll/᩹۬ܳ;Ll/᩹۬ܳ;Z)V
    .locals 7

    .line 65
    iget-object v0, p0, Ll/᩷ۗܳ;->᩹:Ll/ۗܺ᩷;

    const v1, 0x7f0d00af

    invoke-virtual {v0, v1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0a03b2

    .line 66
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    invoke-static {v1, p2, p3}, Ll/ۙ۬ܳ;->֫(Landroid/view/View;Ll/᩹۬ܳ;Ll/᩹۬ܳ;)V

    const p1, 0x7f0a0479

    .line 69
    invoke-virtual {v1, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RadioButton;

    const p2, 0x7f0a047a

    .line 70
    invoke-virtual {v1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/RadioButton;

    const p3, 0x7f0a047b

    .line 71
    invoke-virtual {v1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/RadioButton;

    const/4 v2, 0x3

    new-array v3, v2, [Landroid/widget/RadioButton;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 p1, 0x1

    aput-object p2, v3, p1

    const/4 p1, 0x2

    aput-object p3, v3, p1

    .line 72
    iget-boolean p2, p0, Ll/᩷ۗܳ;->۫:Z

    if-eqz p2, :cond_0

    .line 73
    aget-object p2, v3, v4

    const p3, 0x7f1203ab

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(I)V

    .line 74
    aget-object p2, v3, p1

    const p3, 0x7f1203ac

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(I)V

    .line 76
    :cond_0
    iget-boolean p2, p0, Ll/᩷ۗܳ;->۬:Z

    const/16 p3, 0x8

    if-eqz p2, :cond_1

    .line 77
    aget-object p1, v3, p1

    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    const p1, 0x7f0a00da

    .line 79
    invoke-virtual {v1, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    .line 80
    iget-boolean p2, p0, Ll/᩷ۗܳ;->ۗ:Z

    if-eqz p2, :cond_2

    .line 81
    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    const p2, 0x7f0a0543

    .line 82
    invoke-virtual {v1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    const p2, 0x7f0a00de

    .line 84
    invoke-virtual {v1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/CheckBox;

    .line 85
    iget-boolean v5, p0, Ll/᩷ۗܳ;->ۤ:Z

    invoke-virtual {p2, v5}, Landroid/widget/CompoundButton;->setChecked(Z)V

    if-eqz p4, :cond_3

    .line 86
    invoke-static {}, Ll/᩹֡ܿ;->ܳ()Z

    move-result p4

    if-eqz p4, :cond_3

    const/4 p4, 0x1

    goto :goto_0

    :cond_3
    const/4 p4, 0x0

    :goto_0
    if-eqz p4, :cond_5

    .line 88
    iget v5, p0, Ll/᩷ۗܳ;->᩸:I

    if-nez v5, :cond_4

    const/4 p3, 0x0

    :cond_4
    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    .line 90
    :cond_5
    new-instance p3, Ll/᩻ۗܳ;

    invoke-direct {p3, v3, p4, p2}, Ll/᩻ۗܳ;-><init>([Landroid/widget/RadioButton;ZLandroid/widget/CheckBox;)V

    const/4 p4, 0x0

    :goto_1
    if-ge p4, v2, :cond_7

    .line 98
    aget-object v5, v3, p4

    iget v6, p0, Ll/᩷ۗܳ;->᩸:I

    if-ne p4, v6, :cond_6

    const/4 v6, 0x1

    goto :goto_2

    :cond_6
    const/4 v6, 0x0

    :goto_2
    invoke-virtual {v5, v6}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 99
    aget-object v5, v3, p4

    invoke-virtual {v5, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    add-int/lit8 p4, p4, 0x1

    goto :goto_1

    .line 101
    :cond_7
    sget p3, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance p3, Ll/᩵ۚۢ;

    invoke-direct {p3, v0}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 102
    invoke-virtual {p3, v1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    .line 103
    invoke-virtual {p3, v4}, Ll/᩵ۚۢ;->֫(Z)V

    new-instance p4, Ll/ۜۗܳ;

    invoke-direct {p4, p0, v3, p1, p2}, Ll/ۜۗܳ;-><init>(Ll/᩷ۗܳ;[Landroid/widget/RadioButton;Landroid/widget/CheckBox;Landroid/widget/CheckBox;)V

    const p1, 0x7f12070a

    .line 104
    invoke-virtual {p3, p1, p4}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance p1, Ll/ᩳ᩸ۢ;

    invoke-direct {p1, v2, p0}, Ll/ᩳ᩸ۢ;-><init>(ILjava/lang/Object;)V

    const p0, 0x7f12015e

    .line 114
    invoke-virtual {p3, p0, p1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 117
    invoke-virtual {p3}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method

.method public static synthetic ֫(Ll/᩷ۗܳ;[Landroid/widget/RadioButton;Landroid/widget/CheckBox;Landroid/widget/CheckBox;)V
    .locals 2

    const/4 v0, 0x0

    .line 105
    iput-boolean v0, p0, Ll/᩷ۗܳ;->ۛ:Z

    .line 106
    aget-object v1, p1, v0

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 107
    iput v0, p0, Ll/᩷ۗܳ;->᩸:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 108
    aget-object p1, p1, v0

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 109
    iput v0, p0, Ll/᩷ۗܳ;->᩸:I

    goto :goto_0

    :cond_1
    const/4 p1, 0x2

    .line 111
    iput p1, p0, Ll/᩷ۗܳ;->᩸:I

    .line 112
    :goto_0
    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    iput-boolean p1, p0, Ll/᩷ۗܳ;->᩶:Z

    .line 113
    invoke-virtual {p3}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    iput-boolean p1, p0, Ll/᩷ۗܳ;->ۤ:Z

    return-void
.end method


# virtual methods
.method public final synthetic ֫(Ljava/lang/String;Ll/᩹۬ܳ;Ll/᩹۬ܳ;ZZ)I
    .locals 0

    .line 0
    invoke-static/range {p0 .. p5}, Ll/ۘ᩺ۘ;->֫(Ll/᩸۬ܳ;Ljava/lang/String;Ll/᩹۬ܳ;Ll/᩹۬ܳ;ZZ)I

    move-result p1

    return p1
.end method

.method public final ֫(Ljava/lang/String;Ll/᩹۬ܳ;Ll/᩹۬ܳ;Z)V
    .locals 7

    .line 62
    invoke-static {}, Ll/ۧۨۡ;->ܽ()V

    const/4 v0, 0x1

    .line 63
    iput-boolean v0, p0, Ll/᩷ۗܳ;->ۛ:Z

    .line 64
    new-instance v0, Ll/ܳۗܳ;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move v6, p4

    invoke-direct/range {v1 .. v6}, Ll/ܳۗܳ;-><init>(Ll/᩷ۗܳ;Ljava/lang/String;Ll/᩹۬ܳ;Ll/᩹۬ܳ;Z)V

    .line 119
    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 120
    :goto_0
    iget-boolean p1, p0, Ll/᩷ۗܳ;->ۛ:Z

    if-eqz p1, :cond_0

    const-wide/16 p1, 0xc8

    .line 122
    :try_start_0
    invoke-static {p1, p2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Z)Z
    .locals 0

    if-nez p1, :cond_0

    .line 18
    invoke-virtual {p0}, Ll/᩷ۗܳ;->᩵()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x1

    .line 43
    iput-boolean v0, p0, Ll/᩷ۗܳ;->ۗ:Z

    return-void
.end method

.method public final ۬()I
    .locals 1

    .line 140
    iget v0, p0, Ll/᩷ۗܳ;->᩸:I

    return v0
.end method

.method public final ܶ()Z
    .locals 1

    .line 135
    iget-boolean v0, p0, Ll/᩷ۗܳ;->ۤ:Z

    return v0
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    .line 54
    sget-object v1, Ll/᩹۬ܳ;->ܽ:Ll/᩹۬ܳ;

    invoke-virtual {p0, p1, v1, v1, v0}, Ll/᩷ۗܳ;->֫(Ljava/lang/String;Ll/᩹۬ܳ;Ll/᩹۬ܳ;Z)V

    return-void
.end method

.method public final ܿ()V
    .locals 1

    const/4 v0, 0x1

    .line 48
    iput-boolean v0, p0, Ll/᩷ۗܳ;->۬:Z

    return-void
.end method

.method public final ܿ֫()V
    .locals 1

    const/4 v0, 0x1

    .line 39
    iput-boolean v0, p0, Ll/᩷ۗܳ;->۫:Z

    return-void
.end method

.method public final ᩵()Z
    .locals 1

    .line 130
    iget-boolean v0, p0, Ll/᩷ۗܳ;->᩶:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 145
    iget-boolean v0, p0, Ll/᩷ۗܳ;->ۙ:Z

    return v0
.end method
