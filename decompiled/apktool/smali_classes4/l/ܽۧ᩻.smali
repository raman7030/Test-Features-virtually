.class public final Ll/ܽۧ᩻;
.super Ljava/lang/Object;
.source "Q98G"


# instance fields
.field public final ֫:Landroid/widget/TextView;

.field public final ۖ:Landroid/widget/TextView;

.field public final ۘ:Landroid/widget/TextView;

.field public final ۜ:Landroid/view/View;

.field public final ۡ:Landroid/widget/CheckBox;

.field public final ۢ:Landroid/widget/TextView;

.field public final ۧ:Z

.field public ܳ:J

.field public final ܺ:Landroid/widget/TextView;

.field public ܽ:Z

.field public ܿ:I

.field public ᩳ:I

.field public final ᩴ:Landroid/widget/TextView;

.field public final ᩵:Landroid/view/View;

.field public final ᩷:Landroid/widget/CheckBox;

.field public final ᩻:Landroid/view/View;


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;)V
    .locals 6

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 33
    iput-wide v0, p0, Ll/ܽۧ᩻;->ܳ:J

    const/4 v0, 0x0

    .line 34
    iput v0, p0, Ll/ܽۧ᩻;->ᩳ:I

    .line 35
    iput v0, p0, Ll/ܽۧ᩻;->ܿ:I

    const v1, 0x7f0d00a8

    .line 38
    invoke-virtual {p1, v1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Ll/ܽۧ᩻;->᩵:Landroid/view/View;

    const v2, 0x7f0a0631

    .line 39
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Ll/ܽۧ᩻;->ᩴ:Landroid/widget/TextView;

    const v2, 0x7f0a03b2

    .line 40
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Ll/ܽۧ᩻;->ۢ:Landroid/widget/TextView;

    const v2, 0x7f0a0235

    .line 41
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Ll/ܽۧ᩻;->᩻:Landroid/view/View;

    const v2, 0x7f0a0238

    .line 42
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Ll/ܽۧ᩻;->ۜ:Landroid/view/View;

    const v2, 0x7f0a05dd

    .line 43
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Ll/ܽۧ᩻;->ۘ:Landroid/widget/TextView;

    const v2, 0x7f0a05ca

    .line 44
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Ll/ܽۧ᩻;->ܺ:Landroid/widget/TextView;

    const v2, 0x7f0a05cb

    .line 45
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Ll/ܽۧ᩻;->ۖ:Landroid/widget/TextView;

    const v2, 0x7f0a00d9

    .line 46
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/CheckBox;

    iput-object v2, p0, Ll/ܽۧ᩻;->᩷:Landroid/widget/CheckBox;

    const v2, 0x7f0a00de

    .line 47
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/CheckBox;

    iput-object v2, p0, Ll/ܽۧ᩻;->ۡ:Landroid/widget/CheckBox;

    const v3, 0x7f0a05e2

    .line 48
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, p0, Ll/ܽۧ᩻;->֫:Landroid/widget/TextView;

    const v4, 0x7f0a054d

    .line 49
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v4, Ll/ۡܰܿ;

    const/4 v5, 0x1

    invoke-direct {v4, v5, p1}, Ll/ۡܰܿ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 57
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "dfsmd"

    invoke-interface {p1, v1, v0}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    invoke-virtual {v2, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 58
    sget-object p1, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v0, "deletion_warning"

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Ll/ܽۧ᩻;->ۧ:Z

    if-nez p1, :cond_0

    const/16 p1, 0x8

    .line 60
    invoke-virtual {v3, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/ܽۧ᩻;)V
    .locals 3

    .line 104
    iget-object v0, p0, Ll/ܽۧ᩻;->ۘ:Landroid/widget/TextView;

    iget-wide v1, p0, Ll/ܽۧ᩻;->ܳ:J

    invoke-static {v1, v2}, Ll/᩺ۤۡ;->֫(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 105
    iget-object v0, p0, Ll/ܽۧ᩻;->ܺ:Landroid/widget/TextView;

    iget v1, p0, Ll/ܽۧ᩻;->ᩳ:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 106
    iget-object v0, p0, Ll/ܽۧ᩻;->ۖ:Landroid/widget/TextView;

    iget p0, p0, Ll/ܽۧ᩻;->ܿ:I

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܽۧ᩻;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 3

    .line 71
    iget-boolean v0, p0, Ll/ܽۧ᩻;->ۧ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 72
    iget-object v0, p0, Ll/ܽۧ᩻;->֫:Landroid/widget/TextView;

    if-eqz p3, :cond_0

    const/16 v2, 0x8

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 74
    :cond_1
    iget-object v0, p0, Ll/ܽۧ᩻;->ۢ:Landroid/widget/TextView;

    if-eqz p3, :cond_2

    goto :goto_1

    :cond_2
    move-object p1, p2

    :goto_1
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    iget-boolean p1, p0, Ll/ܽۧ᩻;->ܽ:Z

    if-eqz p1, :cond_4

    .line 76
    iget-object p0, p0, Ll/ܽۧ᩻;->ۜ:Landroid/view/View;

    if-eqz p3, :cond_3

    const/16 v1, 0x8

    :cond_3
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_4
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 85
    iget-object v0, p0, Ll/ܽۧ᩻;->ۜ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    .line 86
    iput-boolean v0, p0, Ll/ܽۧ᩻;->ܽ:Z

    .line 87
    invoke-virtual {p0}, Ll/ܽۧ᩻;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 88
    new-instance v0, Ll/᩵ۢܳ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/᩵ۢܳ;-><init>(ILjava/lang/Object;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x0

    .line 69
    iget-object v1, p0, Ll/ܽۧ᩻;->᩷:Landroid/widget/CheckBox;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 70
    new-instance v0, Ll/ۧۧ᩻;

    invoke-direct {v0, p0, p2, p1}, Ll/ۧۧ᩻;-><init>(Ll/ܽۧ᩻;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    sget p1, Ll/᩹֡ܿ;->֫:I

    .line 60
    sget-object p1, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string p2, "def_mov_recycle_bin"

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    .line 79
    invoke-virtual {v1, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 80
    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    invoke-virtual {v0, v1, p1}, Ll/ۧۧ᩻;->onCheckedChanged(Landroid/widget/CompoundButton;Z)V

    .line 81
    invoke-virtual {v1, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    return-void
.end method

.method public final ۧ()Z
    .locals 2

    .line 65
    iget-object v0, p0, Ll/ܽۧ᩻;->᩷:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Z
    .locals 3

    .line 94
    iget-object v0, p0, Ll/ܽۧ᩻;->ۜ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 95
    iget-object v0, p0, Ll/ܽۧ᩻;->ۡ:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    .line 96
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "dfsmd"

    .line 0
    invoke-static {v1, v2, v0}, Ll/᩺۠ܽ;->֫(Ll/۫ۤۡ;Ljava/lang/String;Z)V

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
