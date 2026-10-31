.class public final Ll/ۧ֡᩷;
.super Ljava/lang/Object;
.source "6AY4"


# instance fields
.field public final ֫:Landroid/widget/CheckBox;

.field public final ۧ:[Landroid/widget/RadioButton;

.field public final ܽ:Ljava/lang/String;

.field public final synthetic ܿ:Ll/᩵֡᩷;

.field public final ᩳ:Landroid/widget/CheckBox;


# direct methods
.method public constructor <init>(Ll/᩵֡᩷;)V
    .locals 9

    .line 1902
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧ֡᩷;->ܿ:Ll/᩵֡᩷;

    .line 1903
    invoke-static {p1}, Ll/᩵֡᩷;->᩹(Ll/᩵֡᩷;)Ll/ܽܽ᩻;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-static {p1}, Ll/᩵֡᩷;->᩹(Ll/᩵֡᩷;)Ll/ܽܽ᩻;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ll/ܽ᩷ܳ;->ܶ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "local:"

    .line 0
    invoke-static {v1, v0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1903
    iput-object v0, p0, Ll/ۧ֡᩷;->ܽ:Ljava/lang/String;

    const v0, 0x7f0d00f9

    .line 1920
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x4

    new-array v1, v0, [Landroid/widget/RadioButton;

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x1

    if-ge v3, v0, :cond_3

    if-eqz v3, :cond_2

    if-eq v3, v4, :cond_1

    const/4 v4, 0x2

    if-eq v3, v4, :cond_0

    const v4, 0x7f0a0480

    .line 1926
    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/RadioButton;

    goto :goto_1

    :cond_0
    const v4, 0x7f0a047f

    .line 1925
    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/RadioButton;

    goto :goto_1

    :cond_1
    const v4, 0x7f0a047d

    .line 1924
    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/RadioButton;

    goto :goto_1

    :cond_2
    const v4, 0x7f0a047e

    .line 1923
    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/RadioButton;

    .line 1922
    :goto_1
    invoke-static {v4}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    aput-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1921
    :cond_3
    iput-object v1, p0, Ll/ۧ֡᩷;->ۧ:[Landroid/widget/RadioButton;

    const/4 v3, 0x0

    const/4 v5, 0x0

    :goto_2
    if-ge v3, v0, :cond_4

    .line 14126
    aget-object v6, v1, v3

    add-int/lit8 v7, v5, 0x1

    .line 1930
    new-instance v8, Ll/ܰ᩵᩷;

    invoke-direct {v8, p0, v5}, Ll/ܰ᩵᩷;-><init>(Ll/ۧ֡᩷;I)V

    invoke-virtual {v6, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    add-int/lit8 v3, v3, 0x1

    move v5, v7

    goto :goto_2

    :cond_4
    const v0, 0x7f0a0540

    .line 1934
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "findViewById(...)"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Ll/ۧ֡᩷;->֫:Landroid/widget/CheckBox;

    const v3, 0x7f0a053f

    .line 1935
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/widget/CheckBox;

    iput-object v3, p0, Ll/ۧ֡᩷;->ᩳ:Landroid/widget/CheckBox;

    .line 1938
    sget-object v1, Ll/᩶ۖ᩷;->ܺ:Ljava/util/HashMap;

    iget-object v5, p0, Ll/ۧ֡᩷;->ܽ:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 1939
    invoke-virtual {v3, v4}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 1940
    iget-object v2, p0, Ll/ۧ֡᩷;->ܽ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 1941
    invoke-static {v1}, Ll/۟۬ܳ;->֫(I)I

    move-result v2

    invoke-virtual {p0, v2}, Ll/ۧ֡᩷;->֫(I)V

    .line 1942
    invoke-static {v1}, Ll/۟۬ܳ;->ۧ(I)Z

    move-result v1

    .line 1916
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    const/4 v2, 0x1

    goto :goto_3

    .line 1945
    :cond_5
    iget-object v1, p0, Ll/ۧ֡᩷;->ܿ:Ll/᩵֡᩷;

    invoke-static {v1}, Ll/᩵֡᩷;->֡(Ll/᩵֡᩷;)I

    move-result v1

    invoke-virtual {p0, v1}, Ll/ۧ֡᩷;->֫(I)V

    .line 1946
    iget-object v1, p0, Ll/ۧ֡᩷;->ܿ:Ll/᩵֡᩷;

    invoke-static {v1}, Ll/᩵֡᩷;->᩵(Ll/᩵֡᩷;)Z

    move-result v1

    .line 1916
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 1948
    :goto_3
    iget-object v0, p0, Ll/ۧ֡᩷;->ܿ:Ll/᩵֡᩷;

    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    .line 1949
    iget-object p1, p0, Ll/ۧ֡᩷;->ܿ:Ll/᩵֡᩷;

    new-instance v1, Ll/۟᩵᩷;

    invoke-direct {v1, p0, p1}, Ll/۟᩵᩷;-><init>(Ll/ۧ֡᩷;Ll/᩵֡᩷;)V

    const p1, 0x7f12070a

    invoke-virtual {v0, p1, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    const/4 v1, 0x0

    .line 1971
    invoke-virtual {v0, p1, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    if-eqz v2, :cond_6

    const p1, 0x7f12017c

    .line 1973
    invoke-virtual {v0, p1, v1}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p1

    .line 1974
    invoke-virtual {p1}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object p1

    iget-object v0, p0, Ll/ۧ֡᩷;->ܿ:Ll/᩵֡᩷;

    new-instance v1, Ll/֫֡᩷;

    invoke-direct {v1, p0, v0}, Ll/֫֡᩷;-><init>(Ll/ۧ֡᩷;Ll/᩵֡᩷;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    .line 1981
    :cond_6
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method

.method public static ֫(Ll/ۧ֡᩷;Ll/᩵֡᩷;)V
    .locals 8

    .line 1950
    iget-object v0, p0, Ll/ۧ֡᩷;->ۧ:[Landroid/widget/RadioButton;

    .line 1951
    iget-object v1, p0, Ll/ۧ֡᩷;->ᩳ:Landroid/widget/CheckBox;

    iget-object v2, p0, Ll/ۧ֡᩷;->֫:Landroid/widget/CheckBox;

    iget-object p0, p0, Ll/ۧ֡᩷;->ܽ:Ljava/lang/String;

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    const/4 v3, -0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    .line 1952
    sget-object v1, Ll/᩶ۖ᩷;->ܺ:Ljava/util/HashMap;

    const-string v5, "sortOnlyInPathList"

    invoke-static {v1, v5}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1791
    array-length v5, v0

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    .line 1792
    aget-object v7, v0, v6

    .line 1909
    invoke-virtual {v7}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v7

    if-eqz v7, :cond_0

    move v3, v6

    goto :goto_1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 1914
    :cond_1
    :goto_1
    invoke-virtual {v2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    .line 1953
    invoke-static {v3, v0}, Ll/۟۬ܳ;->֫(IZ)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 1952
    invoke-virtual {v1, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 1791
    :cond_2
    array-length v1, v0

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v1, :cond_4

    .line 1792
    aget-object v6, v0, v5

    .line 1909
    invoke-virtual {v6}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v6

    if-eqz v6, :cond_3

    move v3, v5

    goto :goto_3

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 1956
    :cond_4
    :goto_3
    invoke-static {p1, v3}, Ll/᩵֡᩷;->ܽ(Ll/᩵֡᩷;I)V

    .line 1914
    invoke-virtual {v2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    .line 1957
    invoke-static {p1, v0}, Ll/᩵֡᩷;->֫(Ll/᩵֡᩷;Z)V

    .line 1958
    sget-object v0, Ll/᩶ۖ᩷;->ܺ:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 1959
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1964
    :goto_4
    sget-object p0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p0

    .line 1966
    sget-object v0, Ll/᩶ۖ᩷;->ܺ:Ljava/util/HashMap;

    invoke-static {v0}, Ll/᩶ۖ᩷;->֫(Ljava/util/HashMap;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "sort_only_in_path_list"

    .line 1964
    invoke-interface {p0, v1, v0}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    .line 1967
    invoke-interface {p0}, Ll/۬ۤۡ;->apply()V

    :cond_5
    const/4 p0, 0x0

    const/4 v0, 0x2

    .line 610
    invoke-static {p1, v4, p0, v0}, Ll/᩵֡᩷;->֫(Ll/᩵֡᩷;ZLl/֫᩹᩵;I)V

    return-void
.end method

.method public static ֫(Ll/ۧ֡᩷;Ll/᩵֡᩷;Landroid/view/View;)V
    .locals 1

    .line 1975
    invoke-static {p2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    const/16 v0, 0x8

    .line 298
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1976
    invoke-static {p1}, Ll/᩵֡᩷;->֡(Ll/᩵֡᩷;)I

    move-result p2

    invoke-virtual {p0, p2}, Ll/ۧ֡᩷;->֫(I)V

    .line 1977
    invoke-static {p1}, Ll/᩵֡᩷;->᩵(Ll/᩵֡᩷;)Z

    move-result p1

    .line 1916
    iget-object p2, p0, Ll/ۧ֡᩷;->֫:Landroid/widget/CheckBox;

    invoke-virtual {p2, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 1978
    iget-object p0, p0, Ll/ۧ֡᩷;->ᩳ:Landroid/widget/CheckBox;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 6

    .line 14126
    iget-object v0, p0, Ll/ۧ֡᩷;->ۧ:[Landroid/widget/RadioButton;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v4, v0, v2

    add-int/lit8 v5, v3, 0x1

    if-ne v3, p1, :cond_0

    const/4 v3, 0x1

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    .line 1911
    :goto_1
    invoke-virtual {v4, v3}, Landroid/widget/CompoundButton;->setChecked(Z)V

    add-int/lit8 v2, v2, 0x1

    move v3, v5

    goto :goto_0

    :cond_1
    return-void
.end method
