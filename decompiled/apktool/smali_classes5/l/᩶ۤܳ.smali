.class public final Ll/᩶ۤܳ;
.super Ll/۠ܶۢ;
.source "9AJ5"


# instance fields
.field public final synthetic ۖ:Ll/᩹۬ܳ;

.field public final synthetic ۘ:Ljava/lang/String;

.field public ۜ:Landroid/widget/Button;

.field public final synthetic ۡ:Ll/ۙۤܳ;

.field public ۢ:Landroid/widget/TextView;

.field public final synthetic ܺ:Ll/᩹۬ܳ;

.field public final synthetic ᩴ:I

.field public final synthetic ᩵:[I

.field public final ᩷:[Landroid/widget/RadioButton;


# direct methods
.method public constructor <init>(Ll/ۙۤܳ;Ljava/lang/String;Ll/᩹۬ܳ;Ll/᩹۬ܳ;I[I)V
    .locals 0

    .line 146
    iput-object p1, p0, Ll/᩶ۤܳ;->ۡ:Ll/ۙۤܳ;

    iput-object p2, p0, Ll/᩶ۤܳ;->ۘ:Ljava/lang/String;

    iput-object p3, p0, Ll/᩶ۤܳ;->ۖ:Ll/᩹۬ܳ;

    iput-object p4, p0, Ll/᩶ۤܳ;->ܺ:Ll/᩹۬ܳ;

    iput p5, p0, Ll/᩶ۤܳ;->ᩴ:I

    iput-object p6, p0, Ll/᩶ۤܳ;->᩵:[I

    invoke-direct {p0}, Ll/۠ܶۢ;-><init>()V

    const/4 p1, 0x3

    new-array p1, p1, [Landroid/widget/RadioButton;

    .line 147
    iput-object p1, p0, Ll/᩶ۤܳ;->᩷:[Landroid/widget/RadioButton;

    return-void
.end method

.method private ֫()V
    .locals 3

    .line 188
    iget-object v0, p0, Ll/᩶ۤܳ;->᩷:[Landroid/widget/RadioButton;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    .line 189
    iget-object v2, p0, Ll/᩶ۤܳ;->ۢ:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 190
    iget-object v1, p0, Ll/᩶ۤܳ;->ۜ:Landroid/widget/Button;

    if-eqz v1, :cond_1

    xor-int/lit8 v0, v0, 0x1

    .line 191
    invoke-virtual {v1, v0}, Landroid/view/View;->setEnabled(Z)V

    :cond_1
    return-void
.end method

.method public static synthetic ֫(Ll/᩶ۤܳ;Landroid/view/View;)V
    .locals 5

    .line 171
    iget-object v0, p0, Ll/᩶ۤܳ;->᩷:[Landroid/widget/RadioButton;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    if-ne v3, p1, :cond_0

    const/4 v4, 0x1

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    .line 172
    :goto_1
    invoke-virtual {v3, v4}, Landroid/widget/CompoundButton;->setChecked(Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 174
    :cond_1
    invoke-direct {p0}, Ll/᩶ۤܳ;->֫()V

    return-void
.end method


# virtual methods
.method public final ֫(Lbin/mt/plus/Main;)Landroid/view/View;
    .locals 5

    const v0, 0x7f0d00af

    .line 153
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object p1

    const v0, 0x7f0a03b2

    .line 154
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Ll/᩶ۤܳ;->ۘ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 155
    iget-object v0, p0, Ll/᩶ۤܳ;->ۖ:Ll/᩹۬ܳ;

    iget-object v1, p0, Ll/᩶ۤܳ;->ܺ:Ll/᩹۬ܳ;

    invoke-static {p1, v0, v1}, Ll/ۙ۬ܳ;->֫(Landroid/view/View;Ll/᩹۬ܳ;Ll/᩹۬ܳ;)V

    const v0, 0x7f0a0479

    .line 156
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iget-object v1, p0, Ll/᩶ۤܳ;->᩷:[Landroid/widget/RadioButton;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const v0, 0x7f0a047a

    .line 157
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    const/4 v3, 0x1

    aput-object v0, v1, v3

    const v0, 0x7f0a047b

    .line 158
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    const/4 v3, 0x2

    aput-object v0, v1, v3

    .line 159
    iget-object v0, p0, Ll/᩶ۤܳ;->ۡ:Ll/ۙۤܳ;

    invoke-static {v0}, Ll/ۙۤܳ;->ۧ(Ll/ۙۤܳ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 160
    aget-object v0, v1, v2

    const v2, 0x7f1203ab

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 161
    aget-object v0, v1, v3

    const v2, 0x7f1203ac

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    const v0, 0x7f0a00da

    .line 166
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f0a0543

    .line 167
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f0a00de

    .line 168
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f0a01e7

    .line 169
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ll/᩶ۤܳ;->ۢ:Landroid/widget/TextView;

    .line 170
    new-instance v0, Ll/᩹ۤܳ;

    invoke-direct {v0, p0}, Ll/᩹ۤܳ;-><init>(Ll/᩶ۤܳ;)V

    const/4 v2, 0x0

    .line 178
    :goto_0
    array-length v3, v1

    if-ge v2, v3, :cond_2

    .line 179
    aget-object v3, v1, v2

    iget v4, p0, Ll/᩶ۤܳ;->ᩴ:I

    if-ne v2, v4, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    invoke-virtual {v3, v4}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 180
    aget-object v3, v1, v2

    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 182
    :cond_2
    invoke-direct {p0}, Ll/᩶ۤܳ;->֫()V

    return-object p1
.end method

.method public final ֫(Ll/֡ۚۢ;)V
    .locals 0

    .line 197
    invoke-virtual {p1}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object p1

    iput-object p1, p0, Ll/᩶ۤܳ;->ۜ:Landroid/widget/Button;

    .line 198
    invoke-direct {p0}, Ll/᩶ۤܳ;->֫()V

    return-void
.end method

.method public final ֫(Landroid/view/View;)Z
    .locals 3

    .line 203
    iget-object p1, p0, Ll/᩶ۤܳ;->᩷:[Landroid/widget/RadioButton;

    const/4 v0, 0x0

    aget-object v1, p1, v0

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x1

    .line 206
    aget-object p1, p1, v1

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x2

    :goto_0
    iget-object v2, p0, Ll/᩶ۤܳ;->᩵:[I

    aput p1, v2, v0

    return v1
.end method
