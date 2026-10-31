.class public final Ll/ܽ᩶ܽ;
.super Ll/ܶ۬ܿ;
.source "P676"


# instance fields
.field public ۖ:Ljava/util/HashSet;

.field public ۘ:Z

.field public ۜ:Z

.field public final synthetic ۡ:Ll/᩷᩶ܽ;

.field public ۢ:I

.field public ܺ:Z

.field public ᩷:Z

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/᩷᩶ܽ;)V
    .locals 4

    .line 1686
    iput-object p1, p0, Ll/ܽ᩶ܽ;->ۡ:Ll/᩷᩶ܽ;

    .line 1687
    invoke-direct {p0, p1}, Ll/ܶ۬ܿ;-><init>(Ll/ۗܺ᩷;)V

    .line 1684
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Ll/ܽ᩶ܽ;->ۖ:Ljava/util/HashSet;

    const/4 v0, 0x0

    .line 1705
    iput-boolean v0, p0, Ll/ܽ᩶ܽ;->᩻:Z

    .line 1706
    iput-boolean v0, p0, Ll/ܽ᩶ܽ;->ܺ:Z

    const/4 v0, 0x1

    .line 1707
    iput-boolean v0, p0, Ll/ܽ᩶ܽ;->ۘ:Z

    .line 1708
    iput-boolean v0, p0, Ll/ܽ᩶ܽ;->᩷:Z

    const v0, 0x7f120240

    const v1, 0x7f1201ec

    const v2, 0x7f12001e

    const v3, 0x7f120391

    .line 1688
    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ܶ۬ܿ;->֫([I)V

    const-string v0, "Ljava/lang/String;"

    .line 1689
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v0, "C"

    .line 1690
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v0, "Z"

    .line 1691
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v0, "B"

    .line 1692
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v0, "I"

    .line 1693
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v0, "S"

    .line 1694
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v0, "J"

    .line 1695
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v0, "D"

    .line 1696
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v0, "F"

    .line 1697
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const p1, 0x7f120387

    .line 1698
    invoke-virtual {p0, p1}, Ll/ܶ۬ܿ;->ܽ(I)V

    return-void
.end method


# virtual methods
.method public final ֫(ILl/᩺ܶ֡;)V
    .locals 5

    .line 1725
    iget-boolean v0, p0, Ll/ܽ᩶ܽ;->᩷:Z

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 1751
    iput-boolean v2, p0, Ll/ܽ᩶ܽ;->᩷:Z

    .line 1752
    invoke-virtual {p0, v2}, Ll/ܶ۬ܿ;->֫(I)Landroid/widget/EditText;

    move-result-object v0

    new-instance v3, Ll/֫᩶ܽ;

    invoke-direct {v3, p0}, Ll/֫᩶ܽ;-><init>(Ll/ܽ᩶ܽ;)V

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 1778
    invoke-virtual {p0, v1}, Ll/ܶ۬ܿ;->֫(I)Landroid/widget/EditText;

    move-result-object v0

    new-instance v3, Ll/ۧ᩶ܽ;

    invoke-direct {v3, p0}, Ll/ۧ᩶ܽ;-><init>(Ll/ܽ᩶ܽ;)V

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 1727
    :cond_0
    iput p1, p0, Ll/ܽ᩶ܽ;->ۢ:I

    .line 1728
    invoke-virtual {p2}, Ll/᩺ܶ֡;->ۧ()Z

    move-result v0

    iget-object v3, p2, Ll/᩺ܶ֡;->᩹:Ll/ᩴۙ֡;

    iput-boolean v0, p0, Ll/ܽ᩶ܽ;->ۜ:Z

    .line 1729
    invoke-virtual {p0, v2}, Ll/ܶ۬ܿ;->֫(I)Landroid/widget/EditText;

    move-result-object v0

    iget v4, p2, Ll/᩺ܶ֡;->᩸:I

    invoke-static {v4}, Ll/۟ۙ֡;->ۧ(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, 0x1

    .line 1730
    invoke-virtual {p0, v0}, Ll/ܶ۬ܿ;->֫(I)Landroid/widget/EditText;

    move-result-object v0

    .line 200
    iget-object v4, v3, Ll/ᩴۙ֡;->۬:Ll/ۨۙ֡;

    .line 1730
    invoke-virtual {v4}, Ll/ۨۙ֡;->᩻()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1731
    invoke-virtual {p0, v1}, Ll/ܶ۬ܿ;->֫(I)Landroid/widget/EditText;

    move-result-object v0

    .line 193
    iget-object v1, v3, Ll/ᩴۙ֡;->۫:Ll/᩺ۙ֡;

    .line 1731
    invoke-virtual {v1}, Ll/᩺ۙ֡;->᩷()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1732
    iget-boolean v0, p0, Ll/ܽ᩶ܽ;->ۜ:Z

    const/16 v1, 0x8

    const/4 v3, 0x0

    const/4 v4, 0x3

    if-eqz v0, :cond_4

    invoke-virtual {p2}, Ll/᩺ܶ֡;->֫()Z

    move-result p2

    if-eqz p2, :cond_4

    .line 1733
    iget-object p2, p0, Ll/ܽ᩶ܽ;->ۡ:Ll/᩷᩶ܽ;

    invoke-static {p2}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object p2

    iget-object p2, p2, Ll/ᩳ᩶ܽ;->ۙ:Ll/ۧ᩸֡;

    invoke-virtual {p2}, Ll/ۧ᩸֡;->ۢ()Ll/۬᩶֡;

    move-result-object p2

    invoke-virtual {p2}, Ll/۬᩶֡;->᩻()Ll/ۛ᩶֡;

    move-result-object p2

    iget-object p2, p2, Ll/ۛ᩶֡;->᩹:[Ll/ܽۙ֡;

    .line 1734
    array-length v0, p2

    if-ge p1, v0, :cond_1

    .line 1735
    aget-object p1, p2, p1

    goto :goto_0

    :cond_1
    move-object p1, v3

    :goto_0
    if-nez p1, :cond_2

    .line 1737
    invoke-virtual {p0, v4}, Ll/ܶ۬ܿ;->ۧ(I)Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_2

    .line 1739
    :cond_2
    invoke-virtual {p0, v4}, Ll/ܶ۬ܿ;->֫(I)Landroid/widget/EditText;

    move-result-object p2

    .line 1806
    sget-object v0, Ll/ܶ᩹ܽ;->ܽ:[I

    invoke-virtual {p1}, Ll/ܽۙ֡;->ۖ()Ll/ۘۙ֡;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 1825
    :pswitch_0
    check-cast p1, Ll/ܺۙ֡;

    iget-object p1, p1, Ll/ܺۙ֡;->᩸:Ll/ۨۙ֡;

    invoke-virtual {p1}, Ll/ۨۙ֡;->᩻()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    .line 1823
    :pswitch_1
    check-cast p1, Ll/ۡۙ֡;

    iget-short p1, p1, Ll/ۡۙ֡;->᩸:S

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    .line 1821
    :pswitch_2
    check-cast p1, Ll/ۜۙ֡;

    iget-wide v0, p1, Ll/ۜۙ֡;->᩸:J

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    .line 1819
    :pswitch_3
    check-cast p1, Ll/᩻ۙ֡;

    iget p1, p1, Ll/᩻ۙ֡;->᩸:I

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    .line 1817
    :pswitch_4
    check-cast p1, Ll/ܳۙ֡;

    iget p1, p1, Ll/ܳۙ֡;->᩸:F

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    .line 1815
    :pswitch_5
    check-cast p1, Ll/֫ۙ֡;

    iget-wide v0, p1, Ll/֫ۙ֡;->᩸:D

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    .line 1813
    :pswitch_6
    check-cast p1, Ll/۟᩶֡;

    iget-char p1, p1, Ll/۟᩶֡;->᩸:C

    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    .line 1811
    :pswitch_7
    check-cast p1, Ll/ܰ᩶֡;

    iget-byte p1, p1, Ll/ܰ᩶֡;->᩸:B

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    .line 1808
    :pswitch_8
    check-cast p1, Ll/᩺᩶֡;

    iget-boolean p1, p1, Ll/᩺᩶֡;->᩸:Z

    if-eqz p1, :cond_3

    const-string v3, "true"

    goto :goto_1

    :cond_3
    const-string v3, "false"

    .line 1739
    :goto_1
    invoke-virtual {p2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1740
    invoke-virtual {p0, v4}, Ll/ܶ۬ܿ;->ۧ(I)Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 1743
    :cond_4
    invoke-virtual {p0, v4}, Ll/ܶ۬ܿ;->֫(I)Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1744
    invoke-virtual {p0, v4}, Ll/ܶ۬ܿ;->ۧ(I)Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1746
    :goto_2
    invoke-virtual {p0}, Ll/ܶ۬ܿ;->ᩳ()V

    .line 1747
    invoke-virtual {p0}, Ll/ܶ۬ܿ;->ۧ()Landroid/widget/Button;

    move-result-object p1

    const p2, 0x7f12070a

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ܽ()Z
    .locals 11

    .line 1833
    iget v0, p0, Ll/ܽ᩶ܽ;->ۢ:I

    const/4 v1, -0x1

    const v2, 0x7f12001d

    const/4 v3, 0x2

    const-string v4, ""

    const/4 v5, 0x1

    const/4 v6, 0x0

    iget-object v7, p0, Ll/ܽ᩶ܽ;->ۡ:Ll/᩷᩶ܽ;

    if-eq v0, v1, :cond_5

    .line 1875
    iget-boolean v0, p0, Ll/ܽ᩶ܽ;->ۜ:Z

    .line 1877
    invoke-virtual {p0, v6}, Ll/ܶ۬ܿ;->֫(I)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    const-string v8, "static"

    if-eqz v0, :cond_0

    .line 1879
    invoke-virtual {v1, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_1

    const-string v8, "static "

    .line 1880
    invoke-virtual {v8, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 1881
    :cond_0
    invoke-virtual {v1, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 1882
    invoke-virtual {v1, v8, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    const-string v8, "  "

    const-string v9, " "

    invoke-virtual {v1, v8, v9}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 1884
    :cond_1
    :goto_0
    :try_start_0
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 1885
    sget-object v4, Ll/᩷᩶ܽ;->ۢۧ:Ljava/util/regex/Pattern;

    invoke-virtual {v4, v1}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 1887
    array-length v4, v1

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_1
    if-ge v8, v4, :cond_2

    aget-object v10, v1, v8

    .line 1889
    invoke-static {v10}, Ll/۟ۙ֡;->֫(Ljava/lang/String;)Ll/۟ۙ֡;

    move-result-object v10

    .line 1890
    invoke-virtual {v10}, Ll/۟ۙ֡;->getValue()I

    move-result v10
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    or-int/2addr v9, v10

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_2
    move v6, v9

    .line 1897
    :cond_3
    invoke-static {v7}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    iget-object v1, v1, Ll/ᩳ᩶ܽ;->ۤ:Ll/ۗ᩶֡;

    invoke-static {v7}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v2

    iget-object v2, v2, Ll/ᩳ᩶ܽ;->ۙ:Ll/ۧ᩸֡;

    .line 1898
    invoke-virtual {v2}, Ll/ۧ᩸֡;->᩷()Ll/᩺ۙ֡;

    move-result-object v2

    invoke-static {v7}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v4

    iget-object v4, v4, Ll/ᩳ᩶ܽ;->ۤ:Ll/ۗ᩶֡;

    .line 1899
    invoke-virtual {p0, v3}, Ll/ܶ۬ܿ;->֫(I)Landroid/widget/EditText;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 1900
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 1898
    invoke-static {v3, v4}, Ll/᩺ۙ֡;->֫(Ljava/lang/String;Ll/ۗ᩶֡;)Ll/᩺ۙ֡;

    move-result-object v3

    invoke-static {v7}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v4

    iget-object v4, v4, Ll/ᩳ᩶ܽ;->ۤ:Ll/ۗ᩶֡;

    .line 1901
    invoke-virtual {p0, v5}, Ll/ܶ۬ܿ;->֫(I)Landroid/widget/EditText;

    move-result-object v8

    .line 1902
    invoke-virtual {v8}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    .line 1901
    invoke-static {v8, v4}, Ll/ۨۙ֡;->֫(Ljava/lang/String;Ll/ۗ᩶֡;)Ll/ۨۙ֡;

    move-result-object v4

    .line 1897
    invoke-static {v1, v2, v3, v4}, Ll/ᩴۙ֡;->֫(Ll/ۗ᩶֡;Ll/᩺ۙ֡;Ll/᩺ۙ֡;Ll/ۨۙ֡;)Ll/ᩴۙ֡;

    move-result-object v1

    .line 1903
    new-instance v2, Ll/᩺ܶ֡;

    invoke-direct {v2, v1, v6}, Ll/᩺ܶ֡;-><init>(Ll/ᩴۙ֡;I)V

    if-eqz v0, :cond_4

    .line 1905
    invoke-static {v7}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ᩳ᩶ܽ;->ۙ:Ll/ۧ᩸֡;

    invoke-virtual {v0}, Ll/ۧ᩸֡;->᩻()Ll/۟ܶ֡;

    move-result-object v0

    iget v1, p0, Ll/ܽ᩶ܽ;->ۢ:I

    const/4 v3, 0x3

    .line 1906
    invoke-virtual {p0, v3}, Ll/ܶ۬ܿ;->֫(I)Landroid/widget/EditText;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 1905
    invoke-virtual {v0, v1, v2, v3}, Ll/۟ܶ֡;->֫(ILl/᩺ܶ֡;Ljava/lang/String;)V

    .line 1907
    invoke-static {v7}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ᩳ᩶ܽ;->ۜ֫:Ljava/util/ArrayList;

    iget v1, p0, Ll/ܽ᩶ܽ;->ۢ:I

    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 1909
    :cond_4
    invoke-static {v7}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ᩳ᩶ܽ;->ۙ:Ll/ۧ᩸֡;

    invoke-virtual {v0}, Ll/ۧ᩸֡;->᩻()Ll/۟ܶ֡;

    move-result-object v0

    iget v1, p0, Ll/ܽ᩶ܽ;->ۢ:I

    invoke-virtual {v0, v1, v2}, Ll/۟ܶ֡;->֫(ILl/᩺ܶ֡;)V

    .line 1910
    invoke-static {v7}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ᩳ᩶ܽ;->ۛ:Ljava/util/ArrayList;

    iget v1, p0, Ll/ܽ᩶ܽ;->ۢ:I

    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1912
    :goto_2
    sput-boolean v5, Ll/᩷᩶ܽ;->ܺۧ:Z

    goto/16 :goto_4

    .line 1894
    :catch_0
    invoke-static {v2}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return v6

    .line 1847
    :cond_5
    invoke-virtual {p0, v6}, Ll/ܶ۬ܿ;->֫(I)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 1849
    :try_start_1
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 1850
    sget-object v1, Ll/᩷᩶ܽ;->ۢۧ:Ljava/util/regex/Pattern;

    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 1852
    array-length v1, v0

    const/4 v4, 0x0

    const/4 v8, 0x0

    :goto_3
    if-ge v4, v1, :cond_6

    aget-object v9, v0, v4

    .line 1854
    invoke-static {v9}, Ll/۟ۙ֡;->֫(Ljava/lang/String;)Ll/۟ۙ֡;

    move-result-object v9

    .line 1855
    invoke-virtual {v9}, Ll/۟ۙ֡;->getValue()I

    move-result v9
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    or-int/2addr v8, v9

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_6
    move v6, v8

    .line 1862
    :cond_7
    invoke-static {v7}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ᩳ᩶ܽ;->ۤ:Ll/ۗ᩶֡;

    invoke-static {v7}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    iget-object v1, v1, Ll/ᩳ᩶ܽ;->ۙ:Ll/ۧ᩸֡;

    .line 1863
    invoke-virtual {v1}, Ll/ۧ᩸֡;->᩷()Ll/᩺ۙ֡;

    move-result-object v1

    invoke-static {v7}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v2

    iget-object v2, v2, Ll/ᩳ᩶ܽ;->ۤ:Ll/ۗ᩶֡;

    .line 1864
    invoke-virtual {p0, v3}, Ll/ܶ۬ܿ;->֫(I)Landroid/widget/EditText;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 1865
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 1863
    invoke-static {v3, v2}, Ll/᩺ۙ֡;->֫(Ljava/lang/String;Ll/ۗ᩶֡;)Ll/᩺ۙ֡;

    move-result-object v2

    invoke-static {v7}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v3

    iget-object v3, v3, Ll/ᩳ᩶ܽ;->ۤ:Ll/ۗ᩶֡;

    .line 1866
    invoke-virtual {p0, v5}, Ll/ܶ۬ܿ;->֫(I)Landroid/widget/EditText;

    move-result-object v4

    .line 1867
    invoke-virtual {v4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    .line 1866
    invoke-static {v4, v3}, Ll/ۨۙ֡;->֫(Ljava/lang/String;Ll/ۗ᩶֡;)Ll/ۨۙ֡;

    move-result-object v3

    .line 1862
    invoke-static {v0, v1, v2, v3}, Ll/ᩴۙ֡;->֫(Ll/ۗ᩶֡;Ll/᩺ۙ֡;Ll/᩺ۙ֡;Ll/ۨۙ֡;)Ll/ᩴۙ֡;

    move-result-object v0

    .line 1868
    new-instance v1, Ll/᩺ܶ֡;

    invoke-direct {v1, v0, v6}, Ll/᩺ܶ֡;-><init>(Ll/ᩴۙ֡;I)V

    .line 1869
    invoke-static {v7}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ᩳ᩶ܽ;->ۙ:Ll/ۧ᩸֡;

    invoke-virtual {v0}, Ll/ۧ᩸֡;->᩻()Ll/۟ܶ֡;

    move-result-object v0

    invoke-virtual {v0, v1}, Ll/۟ܶ֡;->֫(Ll/᩺ܶ֡;)V

    .line 1870
    sput-boolean v5, Ll/᩷᩶ܽ;->ܺۧ:Z

    .line 1839
    invoke-static {v7}, Ll/᩷᩶ܽ;->᩷(Ll/᩷᩶ܽ;)V

    .line 1841
    :goto_4
    invoke-static {v7}, Ll/᩷᩶ܽ;->ۧ(Ll/᩷᩶ܽ;)Ll/۫᩵ۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۙ᩵ۘ;->notifyDataSetChanged()V

    return v5

    .line 1859
    :catch_1
    invoke-static {v2}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return v6
.end method
