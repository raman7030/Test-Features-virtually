.class public final Ll/ۛۜ᩻;
.super Ljava/lang/Object;
.source "37SW"


# instance fields
.field public final ֫:Landroid/widget/CheckBox;

.field public final ۜ:Landroid/widget/Spinner;

.field public final ۢ:Landroid/widget/TextView;

.field public final ۧ:Landroid/widget/CheckBox;

.field public ܳ:I

.field public final ܽ:Z

.field public ܿ:Ll/᩶ۢ᩻;

.field public ᩳ:Ll/֡ۚۢ;

.field public final ᩷:Landroid/widget/Spinner;

.field public ᩻:I


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;Ll/ۗۢ᩻;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V
    .locals 9

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-boolean p5, p0, Ll/ۛۜ᩻;->ܽ:Z

    const v0, 0x7f0d00ad

    .line 35
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v5

    const v0, 0x7f0a0631

    .line 36
    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ll/ۛۜ᩻;->ۢ:Landroid/widget/TextView;

    const v0, 0x7f0a0553

    .line 37
    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p0, Ll/ۛۜ᩻;->ۜ:Landroid/widget/Spinner;

    const v0, 0x7f0a0555

    .line 38
    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p0, Ll/ۛۜ᩻;->᩷:Landroid/widget/Spinner;

    const v0, 0x7f0a0074

    .line 39
    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Ll/ۛۜ᩻;->֫:Landroid/widget/CheckBox;

    const v1, 0x7f0a0075

    .line 40
    invoke-virtual {v5, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/CheckBox;

    iput-object v1, p0, Ll/ۛۜ᩻;->ۧ:Landroid/widget/CheckBox;

    if-nez p5, :cond_0

    const/16 p5, 0x8

    .line 43
    invoke-virtual {v0, p5}, Landroid/view/View;->setVisibility(I)V

    .line 44
    invoke-virtual {v1, p5}, Landroid/view/View;->setVisibility(I)V

    .line 47
    :cond_0
    new-instance p5, Ll/ۤۜ᩻;

    move-object v1, p5

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p6

    move-object v7, p3

    move-object v8, p4

    invoke-direct/range {v1 .. v8}, Ll/ۤۜ᩻;-><init>(Ll/ۛۜ᩻;Ll/ۗܺ᩷;Ll/ۗۢ᩻;Landroid/view/View;Ljava/lang/Runnable;Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    invoke-virtual {p5}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method

.method public static ֫(Ll/ۛۜ᩻;Ljava/lang/String;)I
    .locals 4

    .line 144
    iget-object p0, p0, Ll/ۛۜ᩻;->ܿ:Ll/᩶ۢ᩻;

    invoke-virtual {p0}, Ll/᩶ۢ᩻;->֫()Ljava/util/List;

    move-result-object p0

    .line 145
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 147
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۙۢ᩻;

    invoke-virtual {v3}, Ll/ۙۢ᩻;->֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return v2

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static bridge synthetic ֫(Ll/ۛۜ᩻;)Ll/֡ۚۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛۜ᩻;->ᩳ:Ll/֡ۚۢ;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ۛۜ᩻;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۛۜ᩻;->ܳ:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۛۜ᩻;Ll/֡ۚۢ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۛۜ᩻;->ᩳ:Ll/֡ۚۢ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۛۜ᩻;Ll/᩶ۢ᩻;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۛۜ᩻;->ܿ:Ll/᩶ۢ᩻;

    return-void
.end method

.method public static ۧ(Ll/ۛۜ᩻;Ljava/lang/String;)I
    .locals 4

    .line 133
    iget-object p0, p0, Ll/ۛۜ᩻;->ܿ:Ll/᩶ۢ᩻;

    invoke-virtual {p0}, Ll/᩶ۢ᩻;->ܽ()Ljava/util/List;

    move-result-object p0

    .line 134
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 136
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۙۢ᩻;

    invoke-virtual {v3}, Ll/ۙۢ᩻;->֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return v2

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static bridge synthetic ۧ(Ll/ۛۜ᩻;)Ll/᩶ۢ᩻;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛۜ᩻;->ܿ:Ll/᩶ۢ᩻;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۛۜ᩻;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۛۜ᩻;->᩻:I

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ۛۜ᩻;)Landroid/widget/Spinner;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛۜ᩻;->ۜ:Landroid/widget/Spinner;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۛۜ᩻;)Landroid/widget/Spinner;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛۜ᩻;->᩷:Landroid/widget/Spinner;

    return-object p0
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 121
    iget-object v0, p0, Ll/ۛۜ᩻;->ܿ:Ll/᩶ۢ᩻;

    invoke-virtual {v0}, Ll/᩶ۢ᩻;->֫()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Ll/ۛۜ᩻;->᩷:Landroid/widget/Spinner;

    invoke-virtual {v1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۙۢ᩻;

    invoke-virtual {v0}, Ll/ۙۢ᩻;->ܽ()I

    move-result v0

    return v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 155
    iget-object v0, p0, Ll/ۛۜ᩻;->ۢ:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 2

    .line 129
    iget-object v0, p0, Ll/ۛۜ᩻;->ܿ:Ll/᩶ۢ᩻;

    invoke-virtual {v0}, Ll/᩶ۢ᩻;->֫()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Ll/ۛۜ᩻;->᩷:Landroid/widget/Spinner;

    invoke-virtual {v1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۙۢ᩻;

    invoke-virtual {v0}, Ll/ۙۢ᩻;->֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Z
    .locals 1

    .line 113
    iget-boolean v0, p0, Ll/ۛۜ᩻;->ܽ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۛۜ᩻;->ۧ:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()I
    .locals 2

    .line 117
    iget-object v0, p0, Ll/ۛۜ᩻;->ܿ:Ll/᩶ۢ᩻;

    invoke-virtual {v0}, Ll/᩶ۢ᩻;->ܽ()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Ll/ۛۜ᩻;->ۜ:Landroid/widget/Spinner;

    invoke-virtual {v1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۙۢ᩻;

    invoke-virtual {v0}, Ll/ۙۢ᩻;->ܽ()I

    move-result v0

    return v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 109
    iget-boolean v0, p0, Ll/ۛۜ᩻;->ܽ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۛۜ᩻;->֫:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 2

    .line 125
    iget-object v0, p0, Ll/ۛۜ᩻;->ܿ:Ll/᩶ۢ᩻;

    invoke-virtual {v0}, Ll/᩶ۢ᩻;->ܽ()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Ll/ۛۜ᩻;->ۜ:Landroid/widget/Spinner;

    invoke-virtual {v1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۙۢ᩻;

    invoke-virtual {v0}, Ll/ۙۢ᩻;->֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻()Z
    .locals 2

    .line 103
    iget-object v0, p0, Ll/ۛۜ᩻;->ۜ:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v0

    iget v1, p0, Ll/ۛۜ᩻;->ܳ:I

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Ll/ۛۜ᩻;->᩷:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v0

    iget v1, p0, Ll/ۛۜ᩻;->᩻:I

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 105
    :cond_0
    invoke-virtual {p0}, Ll/ۛۜ᩻;->ܿ()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Ll/ۛۜ᩻;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return v0

    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
