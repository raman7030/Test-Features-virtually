.class public abstract Ll/۬ۙܽ;
.super Ljava/lang/Object;
.source "C627"


# instance fields
.field public final ֫:Ll/֡ۚۢ;

.field public ۧ:Z

.field public final ܳ:Landroid/widget/TextView;

.field public ܽ:Z

.field public final ܿ:Ll/ۚۖۡ;

.field public ᩳ:Ll/ۙۙܽ;


# direct methods
.method public constructor <init>(ILl/ۗܺ᩷;Ljava/lang/String;)V
    .locals 12

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 24
    iput-boolean v0, p0, Ll/۬ۙܽ;->ۧ:Z

    .line 25
    iput-boolean v0, p0, Ll/۬ۙܽ;->ܽ:Z

    .line 29
    invoke-virtual {p2, p1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object p1

    const v1, 0x7f0a017d

    .line 30
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/ۚۖۡ;

    const v2, 0x7f0a0479

    .line 31
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Landroid/widget/RadioButton;

    const v2, 0x7f0a047a

    .line 32
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Landroid/widget/RadioButton;

    const v2, 0x7f0a047b

    .line 33
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Landroid/widget/RadioButton;

    const v2, 0x7f0a0631

    .line 34
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Ll/۬ۙܽ;->ܳ:Landroid/widget/TextView;

    .line 35
    iput-object v1, p0, Ll/۬ۙܽ;->ܿ:Ll/ۚۖۡ;

    .line 37
    new-instance v11, Ll/᩶ۙܽ;

    move-object v2, v11

    move-object v3, p0

    move-object v4, v8

    move-object v5, v9

    move-object v6, v10

    move-object v7, v1

    invoke-direct/range {v2 .. v7}, Ll/᩶ۙܽ;-><init>(Ll/۬ۙܽ;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Ll/ۚۖۡ;)V

    .line 73
    invoke-virtual {v8, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    invoke-virtual {v9, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 75
    invoke-virtual {v10, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 76
    sget-object v2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v2, p3, v0}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    .line 86
    invoke-virtual {v8, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    goto :goto_0

    .line 82
    :cond_0
    invoke-virtual {v10, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 83
    iput-boolean v2, p0, Ll/۬ۙܽ;->ۧ:Z

    goto :goto_0

    .line 78
    :cond_1
    invoke-virtual {v9, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 79
    iput-boolean v2, p0, Ll/۬ۙܽ;->ܽ:Z

    .line 89
    :goto_0
    invoke-virtual {v8}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    invoke-virtual {v1, v0}, Ll/ۚۖۡ;->֫(Z)V

    .line 90
    sget v0, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v0, Ll/᩵ۚۢ;

    invoke-direct {v0, p2}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 91
    invoke-virtual {v0, p1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const p1, 0x7f12070a

    const/4 v2, 0x0

    .line 92
    invoke-virtual {v0, p1, v2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    .line 93
    invoke-virtual {v0, p1, v2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 94
    invoke-virtual {v0}, Ll/᩵ۚۢ;->֫()Ll/֡ۚۢ;

    move-result-object p1

    iput-object p1, p0, Ll/۬ۙܽ;->֫:Ll/֡ۚۢ;

    .line 95
    new-instance p1, Ll/ۙۙܽ;

    move-object v2, p1

    move-object v3, p0

    move-object v4, v9

    move-object v5, v10

    move-object v6, v1

    move-object v7, p3

    move-object v9, p2

    invoke-direct/range {v2 .. v9}, Ll/ۙۙܽ;-><init>(Ll/۬ۙܽ;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Ll/ۚۖۡ;Ljava/lang/String;Landroid/widget/RadioButton;Ll/ۗܺ᩷;)V

    iput-object p1, p0, Ll/۬ۙܽ;->ᩳ:Ll/ۙۙܽ;

    return-void
.end method

.method public static synthetic ֫(Ll/۬ۙܽ;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Ll/ۚۖۡ;Landroid/view/View;)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p5, p1, :cond_0

    .line 39
    invoke-virtual {p2, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 40
    invoke-virtual {p3, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 41
    invoke-virtual {p4, v0}, Ll/ۚۖۡ;->֫(I)V

    .line 42
    iput-boolean v1, p0, Ll/۬ۙܽ;->ۧ:Z

    .line 43
    iput-boolean v1, p0, Ll/۬ۙܽ;->ܽ:Z

    goto/16 :goto_0

    :cond_0
    if-ne p5, p2, :cond_2

    .line 45
    invoke-virtual {p1, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 46
    invoke-virtual {p3, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    const/4 p2, 0x2

    .line 47
    invoke-virtual {p4, p2}, Ll/ۚۖۡ;->֫(I)V

    .line 49
    :try_start_0
    iget-boolean p2, p0, Ll/۬ۙܽ;->ۧ:Z

    if-eqz p2, :cond_1

    invoke-virtual {p4}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ll/۬ۙܽ;->֫(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 50
    invoke-virtual {p4}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    const/16 p3, 0x10

    invoke-static {p2, p3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p2}, Ll/ۚۖۡ;->֫(Ljava/lang/CharSequence;)V

    .line 51
    :cond_1
    iput-boolean v1, p0, Ll/۬ۙܽ;->ۧ:Z

    .line 52
    iput-boolean v0, p0, Ll/۬ۙܽ;->ܽ:Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 54
    :catch_0
    iput-boolean v1, p0, Ll/۬ۙܽ;->ۧ:Z

    .line 55
    iput-boolean v1, p0, Ll/۬ۙܽ;->ܽ:Z

    goto :goto_0

    .line 58
    :cond_2
    invoke-virtual {p1, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 59
    invoke-virtual {p2, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 60
    invoke-virtual {p4, v0}, Ll/ۚۖۡ;->֫(I)V

    .line 62
    :try_start_1
    iget-boolean p2, p0, Ll/۬ۙܽ;->ܽ:Z

    if-eqz p2, :cond_3

    invoke-virtual {p4}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ll/۬ۙܽ;->ۧ(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 63
    invoke-virtual {p4}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p2}, Ll/ۚۖۡ;->֫(Ljava/lang/CharSequence;)V

    .line 64
    :cond_3
    iput-boolean v0, p0, Ll/۬ۙܽ;->ۧ:Z

    .line 65
    iput-boolean v1, p0, Ll/۬ۙܽ;->ܽ:Z
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 67
    :catch_1
    iput-boolean v1, p0, Ll/۬ۙܽ;->ۧ:Z

    .line 68
    iput-boolean v1, p0, Ll/۬ۙܽ;->ܽ:Z

    .line 71
    :goto_0
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p0

    invoke-virtual {p4, p0}, Ll/ۚۖۡ;->֫(Z)V

    return-void
.end method

.method public static ֫(Ll/۬ۙܽ;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Ll/ۚۖۡ;Ljava/lang/String;Landroid/widget/RadioButton;Ll/ۗܺ᩷;)V
    .locals 9

    .line 97
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    .line 99
    :cond_0
    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x2

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 101
    :goto_0
    invoke-virtual {p3}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    .line 103
    sget-object p2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p2}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p2

    .line 104
    invoke-interface {p2, p1, p4}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p2

    .line 105
    invoke-interface {p2}, Ll/۬ۤۡ;->apply()V

    .line 106
    invoke-virtual {p3}, Ll/ۚۖۡ;->ܳ()V

    const p2, 0x7f120b48

    if-eq p1, v1, :cond_5

    if-eq p1, v0, :cond_2

    move-object v6, v7

    goto :goto_3

    .line 116
    :cond_2
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p3

    .line 117
    invoke-static {p3}, Ll/۬ۙܽ;->֫(Ljava/lang/String;)Z

    move-result p4

    if-nez p4, :cond_3

    .line 118
    invoke-static {p2}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 256
    :cond_3
    invoke-virtual {p3}, Ljava/lang/String;->toCharArray()[C

    move-result-object p3

    array-length p4, p3

    const-wide/16 v0, 0x0

    :goto_1
    if-ge v2, p4, :cond_4

    aget-char v3, p3, v2

    const/4 v4, 0x4

    shl-long/2addr v0, v4

    .line 257
    invoke-static {v3}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v3

    int-to-long v3, v3

    or-long/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 121
    :cond_4
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p3

    goto :goto_2

    .line 109
    :cond_5
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p3

    .line 110
    invoke-static {p3}, Ll/۬ۙܽ;->ۧ(Ljava/lang/String;)Z

    move-result p4

    if-nez p4, :cond_6

    .line 111
    invoke-static {p2}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    :cond_6
    :goto_2
    move-object v6, p3

    .line 124
    :goto_3
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result p3

    if-lez p3, :cond_8

    if-eqz p1, :cond_7

    .line 127
    :try_start_0
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    .line 129
    :catch_0
    invoke-static {p2}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 134
    :cond_7
    :goto_4
    invoke-virtual {p5}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v8

    .line 135
    new-instance p1, Ll/ۗۙܽ;

    move-object v3, p1

    move-object v4, p0

    move-object v5, p6

    invoke-direct/range {v3 .. v8}, Ll/ۗۙܽ;-><init>(Ll/۬ۙܽ;Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 164
    invoke-virtual {p1}, Ll/۟ܶۡ;->᩻()V

    .line 166
    :cond_8
    iget-object p0, p0, Ll/۬ۙܽ;->֫:Ll/֡ۚۢ;

    invoke-virtual {p0}, Ll/֡ۚۢ;->dismiss()V

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 4

    .line 186
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    .line 188
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_6

    .line 189
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x30

    if-lt v2, v3, :cond_1

    const/16 v3, 0x39

    if-le v2, v3, :cond_3

    :cond_1
    const/16 v3, 0x41

    if-lt v2, v3, :cond_2

    const/16 v3, 0x46

    if-le v2, v3, :cond_3

    :cond_2
    const/16 v3, 0x61

    if-lt v2, v3, :cond_5

    :cond_3
    const/16 v3, 0x66

    if-le v2, v3, :cond_4

    goto :goto_1

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    :goto_1
    return v1

    :cond_6
    const/4 p0, 0x1

    return p0
.end method

.method public static ۧ(Ljava/lang/String;)Z
    .locals 4

    .line 197
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    .line 199
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_3

    .line 200
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x30

    if-lt v2, v3, :cond_2

    const/16 v3, 0x39

    if-le v2, v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v1

    :cond_3
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public abstract ֫()V
.end method

.method public abstract ֫(Ljava/lang/String;Ljava/lang/String;Z)V
.end method

.method public final ֫(Z)V
    .locals 1

    if-eqz p1, :cond_0

    const p1, 0x7f12090f

    goto :goto_0

    :cond_0
    const p1, 0x7f1208f5

    .line 171
    :goto_0
    iget-object v0, p0, Ll/۬ۙܽ;->ܳ:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 172
    iget-object p1, p0, Ll/۬ۙܽ;->֫:Ll/֡ۚۢ;

    invoke-virtual {p1}, Ll/֡ۚۢ;->᩷()V

    .line 173
    invoke-virtual {p1}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object p1

    iget-object v0, p0, Ll/۬ۙܽ;->ᩳ:Ll/ۙۙܽ;

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 174
    iget-object p1, p0, Ll/۬ۙܽ;->ܿ:Ll/ۚۖۡ;

    invoke-virtual {p1}, Ll/ۚۖۡ;->᩷()V

    .line 175
    invoke-virtual {p1}, Ll/ۚۖۡ;->ۧ()Ll/ۤۤᩳ;

    move-result-object p1

    invoke-static {p1}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 179
    iget-object v0, p0, Ll/۬ۙܽ;->֫:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->᩷()V

    .line 180
    invoke-virtual {v0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v0

    iget-object v1, p0, Ll/۬ۙܽ;->ᩳ:Ll/ۙۙܽ;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 181
    iget-object v0, p0, Ll/۬ۙܽ;->ܿ:Ll/ۚۖۡ;

    invoke-virtual {v0}, Ll/ۚۖۡ;->᩷()V

    .line 182
    invoke-virtual {v0}, Ll/ۚۖۡ;->ۧ()Ll/ۤۤᩳ;

    move-result-object v0

    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    return-void
.end method
