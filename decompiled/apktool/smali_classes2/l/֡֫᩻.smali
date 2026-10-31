.class public final Ll/֡֫᩻;
.super Ljava/lang/Object;
.source "O515"


# instance fields
.field public final ֫:Landroid/widget/CheckBox;

.field public final ۜ:Landroid/widget/Spinner;

.field public final ۢ:Landroid/widget/TextView;

.field public final ۧ:Landroid/widget/CheckBox;

.field public final ܳ:I

.field public final ܽ:Z

.field public final ܿ:Ljava/util/ArrayList;

.field public final ᩳ:Ll/֡ۚۢ;

.field public final ᩷:Landroid/widget/Spinner;

.field public final ᩻:I


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V
    .locals 6

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-boolean p4, p0, Ll/֡֫᩻;->ܽ:Z

    const v0, 0x7f0d00ad

    .line 36
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0631

    .line 37
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Ll/֡֫᩻;->ۢ:Landroid/widget/TextView;

    const v1, 0x7f0a0553

    .line 38
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Spinner;

    iput-object v1, p0, Ll/֡֫᩻;->ۜ:Landroid/widget/Spinner;

    const v1, 0x7f0a0555

    .line 39
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Spinner;

    iput-object v1, p0, Ll/֡֫᩻;->᩷:Landroid/widget/Spinner;

    const v1, 0x7f0a0074

    .line 40
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/CheckBox;

    iput-object v1, p0, Ll/֡֫᩻;->֫:Landroid/widget/CheckBox;

    const v2, 0x7f0a0075

    .line 41
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/CheckBox;

    iput-object v2, p0, Ll/֡֫᩻;->ۧ:Landroid/widget/CheckBox;

    if-nez p4, :cond_0

    const/16 p4, 0x8

    .line 44
    invoke-virtual {v1, p4}, Landroid/view/View;->setVisibility(I)V

    .line 45
    invoke-virtual {v2, p4}, Landroid/view/View;->setVisibility(I)V

    .line 48
    :cond_0
    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p4

    invoke-virtual {p4, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    invoke-virtual {p4}, Ll/᩵ۚۢ;->֫()Ll/֡ۚۢ;

    move-result-object p4

    iput-object p4, p0, Ll/֡֫᩻;->ᩳ:Ll/֡ۚۢ;

    .line 49
    invoke-static {}, Ll/᩺֨ۢ;->֫()Ljava/util/ArrayList;

    move-result-object p4

    iput-object p4, p0, Ll/֡֫᩻;->ܿ:Ljava/util/ArrayList;

    .line 50
    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    move-result p4

    new-array v0, p4, [Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p4, :cond_1

    .line 52
    iget-object v3, p0, Ll/֡֫᩻;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۨ֨ۢ;

    .line 69
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v3, Ll/ۨ֨ۢ;->ۧ:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " - "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v3, Ll/ۨ֨ۢ;->ᩳ:I

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 52
    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 53
    :cond_1
    new-instance p4, Ll/᩶ۡۡ;

    invoke-direct {p4, p1, v0}, Ll/᩶ۡۡ;-><init>(Landroid/content/Context;[Ljava/lang/Object;)V

    .line 54
    iget-object v0, p0, Ll/֡֫᩻;->ۜ:Landroid/widget/Spinner;

    invoke-virtual {v0, p4}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 55
    iget-object v0, p0, Ll/֡֫᩻;->᩷:Landroid/widget/Spinner;

    invoke-virtual {v0, p4}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 56
    iget-object p4, p0, Ll/֡֫᩻;->ۜ:Landroid/widget/Spinner;

    new-instance v0, Ll/ܺ֫᩻;

    invoke-direct {v0, p0, p1}, Ll/ܺ֫᩻;-><init>(Ll/֡֫᩻;Ll/ۗܺ᩷;)V

    invoke-virtual {p4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 61
    iget-object p4, p0, Ll/֡֫᩻;->᩷:Landroid/widget/Spinner;

    new-instance v0, Ll/ۖ֫᩻;

    invoke-direct {v0, p0, p1}, Ll/ۖ֫᩻;-><init>(Ll/֡֫᩻;Ll/ۗܺ᩷;)V

    invoke-virtual {p4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-nez p2, :cond_2

    .line 68
    iget-object p1, p0, Ll/֡֫᩻;->ۜ:Landroid/widget/Spinner;

    iput v1, p0, Ll/֡֫᩻;->ܳ:I

    invoke-virtual {p1, v1}, Landroid/widget/AdapterView;->setSelection(I)V

    goto :goto_3

    .line 70
    :cond_2
    iget-object p1, p0, Ll/֡֫᩻;->ۜ:Landroid/widget/Spinner;

    .line 111
    iget-object p4, p0, Ll/֡֫᩻;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v0, :cond_4

    .line 113
    invoke-virtual {p4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۨ֨ۢ;

    iget-object v3, v3, Ll/ۨ֨ۢ;->ۧ:Ljava/lang/String;

    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    .line 70
    :goto_2
    iput v2, p0, Ll/֡֫᩻;->ܳ:I

    invoke-virtual {p1, v2}, Landroid/widget/AdapterView;->setSelection(I)V

    :goto_3
    if-nez p3, :cond_5

    .line 72
    iget-object p1, p0, Ll/֡֫᩻;->᩷:Landroid/widget/Spinner;

    iput v1, p0, Ll/֡֫᩻;->᩻:I

    invoke-virtual {p1, v1}, Landroid/widget/AdapterView;->setSelection(I)V

    goto :goto_6

    .line 74
    :cond_5
    iget-object p1, p0, Ll/֡֫᩻;->᩷:Landroid/widget/Spinner;

    .line 111
    iget-object p2, p0, Ll/֡֫᩻;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p4

    const/4 v0, 0x0

    :goto_4
    if-ge v0, p4, :cond_7

    .line 113
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨ֨ۢ;

    iget-object v2, v2, Ll/ۨ֨ۢ;->ۧ:Ljava/lang/String;

    invoke-virtual {v2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    move v1, v0

    goto :goto_5

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 74
    :cond_7
    :goto_5
    iput v1, p0, Ll/֡֫᩻;->᩻:I

    invoke-virtual {p1, v1}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 76
    :goto_6
    iget-object p1, p0, Ll/֡֫᩻;->ᩳ:Ll/֡ۚۢ;

    const p2, 0x7f12070a

    invoke-static {p2}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ll/ۘ֫᩻;

    invoke-direct {p3, p5}, Ll/ۘ֫᩻;-><init>(Ljava/lang/Runnable;)V

    const/4 p4, -0x1

    invoke-virtual {p1, p4, p2, p3}, Ll/֡ۚۢ;->֫(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 77
    iget-object p1, p0, Ll/֡֫᩻;->ᩳ:Ll/֡ۚۢ;

    const p2, 0x7f12015e

    invoke-static {p2}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    const/4 p4, -0x2

    invoke-virtual {p1, p4, p2, p3}, Ll/֡ۚۢ;->֫(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    return-void
.end method

.method public static synthetic ֫(Ll/֡֫᩻;I)V
    .locals 0

    .line 59
    iget-object p0, p0, Ll/֡֫᩻;->ۜ:Landroid/widget/Spinner;

    invoke-virtual {p0, p1}, Landroid/widget/AdapterView;->setSelection(I)V

    return-void
.end method

.method public static synthetic ֫(Ll/֡֫᩻;Ll/ۗܺ᩷;)V
    .locals 2

    .line 56
    new-instance v0, Ll/ۙܽ᩻;

    iget-object v1, p0, Ll/֡֫᩻;->ܿ:Ljava/util/ArrayList;

    invoke-direct {v0, p1, v1}, Ll/ۙܽ᩻;-><init>(Ll/ۗܺ᩷;Ljava/util/ArrayList;)V

    const p1, 0x7f120743

    .line 57
    invoke-virtual {v0, p1}, Ll/ۙܽ᩻;->ۧ(I)V

    iget-object p1, p0, Ll/֡֫᩻;->ۜ:Landroid/widget/Spinner;

    .line 58
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۙܽ᩻;->֫(I)V

    new-instance p1, Ll/᩵֫᩻;

    invoke-direct {p1, p0}, Ll/᩵֫᩻;-><init>(Ljava/lang/Object;)V

    .line 59
    invoke-virtual {v0, p1}, Ll/ۙܽ᩻;->֫(Ll/᩶ܽ᩻;)V

    .line 60
    invoke-virtual {v0}, Ll/ۙܽ᩻;->֫()V

    return-void
.end method

.method public static synthetic ۧ(Ll/֡֫᩻;I)V
    .locals 0

    .line 64
    iget-object p0, p0, Ll/֡֫᩻;->᩷:Landroid/widget/Spinner;

    invoke-virtual {p0, p1}, Landroid/widget/AdapterView;->setSelection(I)V

    return-void
.end method

.method public static synthetic ۧ(Ll/֡֫᩻;Ll/ۗܺ᩷;)V
    .locals 2

    .line 61
    new-instance v0, Ll/ۙܽ᩻;

    iget-object v1, p0, Ll/֡֫᩻;->ܿ:Ljava/util/ArrayList;

    invoke-direct {v0, p1, v1}, Ll/ۙܽ᩻;-><init>(Ll/ۗܺ᩷;Ljava/util/ArrayList;)V

    const p1, 0x7f120740

    .line 62
    invoke-virtual {v0, p1}, Ll/ۙܽ᩻;->ۧ(I)V

    iget-object p1, p0, Ll/֡֫᩻;->᩷:Landroid/widget/Spinner;

    .line 63
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۙܽ᩻;->֫(I)V

    new-instance p1, Ll/ᩴ֫᩻;

    invoke-direct {p1, p0}, Ll/ᩴ֫᩻;-><init>(Ll/֡֫᩻;)V

    .line 64
    invoke-virtual {v0, p1}, Ll/ۙܽ᩻;->֫(Ll/᩶ܽ᩻;)V

    .line 65
    invoke-virtual {v0}, Ll/ۙܽ᩻;->֫()V

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 99
    iget-object v0, p0, Ll/֡֫᩻;->᩷:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v0

    iget-object v1, p0, Ll/֡֫᩻;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ֨ۢ;

    iget v0, v0, Ll/ۨ֨ۢ;->ᩳ:I

    return v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 125
    iget-object v0, p0, Ll/֡֫᩻;->ۢ:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ۧ()I
    .locals 2

    .line 95
    iget-object v0, p0, Ll/֡֫᩻;->ۜ:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v0

    iget-object v1, p0, Ll/֡֫᩻;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ֨ۢ;

    iget v0, v0, Ll/ۨ֨ۢ;->ᩳ:I

    return v0
.end method

.method public final ܳ()V
    .locals 1

    .line 119
    iget-object v0, p0, Ll/֡֫᩻;->ᩳ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->᩷()V

    .line 120
    invoke-static {v0}, Ll/ۡܶۡ;->ۧ(Ll/֡ۚۢ;)V

    return-void
.end method

.method public final ܽ()Z
    .locals 1

    .line 87
    iget-boolean v0, p0, Ll/֡֫᩻;->ܽ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/֡֫᩻;->֫:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܿ()Z
    .locals 2

    .line 81
    iget-object v0, p0, Ll/֡֫᩻;->ۜ:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v0

    iget v1, p0, Ll/֡֫᩻;->ܳ:I

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Ll/֡֫᩻;->᩷:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v0

    iget v1, p0, Ll/֡֫᩻;->᩻:I

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 83
    :cond_0
    invoke-virtual {p0}, Ll/֡֫᩻;->ܽ()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Ll/֡֫᩻;->ᩳ()Z

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

.method public final ᩳ()Z
    .locals 1

    .line 91
    iget-boolean v0, p0, Ll/֡֫᩻;->ܽ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/֡֫᩻;->ۧ:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
