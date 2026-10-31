.class public final Ll/ۡۨܽ;
.super Ljava/lang/Object;
.source "H5BW"


# static fields
.field public static final ֫:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 51
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    sput-object v0, Ll/ۡۨܽ;->֫:Ljava/util/ArrayList;

    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;Landroid/view/View;Ljava/lang/String;)Ll/ۜۨܽ;
    .locals 9

    const v0, 0x7f0a0577

    .line 189
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ۗۘ;

    .line 190
    invoke-static {p2}, Ll/ᩳ᩺ܽ;->֫(Ljava/lang/String;)Ll/ܽ᩺ܽ;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p2, :cond_1

    .line 191
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    new-array v4, v2, [Ljava/lang/Object;

    aput-object p2, v4, v3

    const v5, 0x7f120125

    .line 194
    invoke-static {v5, v4}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_1
    :goto_0
    const/16 v4, 0x8

    .line 192
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    :goto_1
    const/4 v4, 0x0

    if-eqz v1, :cond_2

    .line 197
    invoke-virtual {v1}, Ll/ܽ᩺ܽ;->ܽ()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/ۡۨܽ;->֫(Ljava/lang/String;)Ll/۬ܿᩳ;

    move-result-object v5

    if-nez v5, :cond_2

    move-object v1, v4

    :cond_2
    if-nez v1, :cond_3

    .line 201
    invoke-virtual {v0, v3}, Ll/ۗۘ;->setChecked(Z)V

    .line 202
    new-instance v1, Ll/ܽ᩺ܽ;

    .line 618
    sget-object v5, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v6, "auto_signature_key"

    const-string v7, ""

    invoke-interface {v5, v6, v7}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 204
    invoke-static {}, Ll/ۡۨܽ;->֫()Ll/۠ۧᩳ;

    move-result-object v6

    .line 642
    sget-object v7, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v8, "v1_signature_filename"

    invoke-interface {v7, v8, v4}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 646
    sget-object v7, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v8, "kv1sd"

    invoke-interface {v7, v8, v3}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    .line 206
    invoke-direct {v1, v5, v6, v4, v3}, Ll/ܽ᩺ܽ;-><init>(Ljava/lang/String;Ll/۠ۧᩳ;Ljava/lang/String;Z)V

    goto :goto_2

    .line 208
    :cond_3
    invoke-virtual {v0, v2}, Ll/ۗۘ;->setChecked(Z)V

    .line 211
    :goto_2
    invoke-static {p0, p1, v1}, Ll/ۡۨܽ;->ۧ(Ll/ۗܺ᩷;Landroid/view/View;Ll/ܽ᩺ܽ;)Ll/᩻ۨܽ;

    move-result-object p0

    .line 212
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_4

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    .line 214
    :goto_3
    new-instance p1, Ll/᩺ۛܽ;

    invoke-direct {p1, p0, v2, v0, p2}, Ll/᩺ۛܽ;-><init>(Ll/᩻ۨܽ;ZLl/ۗۘ;Ljava/lang/String;)V

    return-object p1
.end method

.method public static ֫()Ll/۠ۧᩳ;
    .locals 4

    .line 622
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "auto_signature_scheme"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-ltz v0, :cond_1

    .line 623
    invoke-static {}, Ll/۠ۧᩳ;->values()[Ll/۠ۧᩳ;

    move-result-object v3

    array-length v3, v3

    if-lt v0, v3, :cond_0

    goto :goto_0

    :cond_0
    move v2, v0

    goto :goto_1

    .line 624
    :cond_1
    :goto_0
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    invoke-interface {v0, v2, v1}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    .line 627
    :goto_1
    invoke-static {}, Ll/۠ۧᩳ;->values()[Ll/۠ۧᩳ;

    move-result-object v0

    aget-object v0, v0, v2

    return-object v0
.end method

.method public static ֫(Ll/ܽ᩺ܽ;)Ll/ۨۧᩳ;
    .locals 4

    .line 653
    new-instance v0, Ll/ۨۧᩳ;

    invoke-virtual {p0}, Ll/ܽ᩺ܽ;->ܽ()Ljava/lang/String;

    move-result-object v1

    .line 737
    invoke-static {v1}, Ll/ۡۨܽ;->֫(Ljava/lang/String;)Ll/۬ܿᩳ;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 741
    :cond_0
    sget-object v1, Ll/ۡۨܽ;->֫:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ܿᩳ;

    .line 653
    :goto_0
    invoke-virtual {p0}, Ll/ܽ᩺ܽ;->ᩳ()Ll/۠ۧᩳ;

    move-result-object v2

    .line 654
    invoke-virtual {p0}, Ll/ܽ᩺ܽ;->ܳ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Ll/ܽ᩺ܽ;->֫()Z

    move-result p0

    invoke-direct {v0, v1, v2, v3, p0}, Ll/ۨۧᩳ;-><init>(Ll/۬ܿᩳ;Ll/۠ۧᩳ;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Ll/۬ܿᩳ;
    .locals 3

    .line 746
    invoke-static {}, Ll/ۡۨܽ;->ᩳ()V

    if-eqz p0, :cond_1

    .line 747
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 748
    sget-object v0, Ll/ۡۨܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ܿᩳ;

    .line 749
    invoke-virtual {v1}, Ll/۬ܿᩳ;->ۘ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/ۗܺ᩷;Landroid/view/View;Ll/ܽ᩺ܽ;)Ll/᩻ۨܽ;
    .locals 2

    const v0, 0x7f0a0577

    .line 144
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ۗۘ;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    .line 146
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 148
    :cond_0
    invoke-static {p0, p1, p2}, Ll/ۡۨܽ;->ۧ(Ll/ۗܺ᩷;Landroid/view/View;Ll/ܽ᩺ܽ;)Ll/᩻ۨܽ;

    move-result-object p0

    .line 149
    new-instance p1, Ll/ۨۛܽ;

    invoke-direct {p1, p0}, Ll/ۨۛܽ;-><init>(Ll/᩻ۨܽ;)V

    return-object p1
.end method

.method public static ֫(Landroid/view/View;Z)V
    .locals 0

    if-eqz p0, :cond_0

    .line 135
    invoke-virtual {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    :cond_0
    return-void
.end method

.method public static ֫(Landroid/widget/TextView;Ll/᩸ܿᩳ;)V
    .locals 2

    if-nez p1, :cond_0

    const/16 p1, 0x8

    .line 64
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 69
    :cond_0
    invoke-virtual {p1}, Ll/᩸ܿᩳ;->ۧ()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const p1, 0x7f12098d

    .line 67
    invoke-static {p1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public static ֫(Ll/֡ۚۢ;Landroid/view/View;Z)V
    .locals 1

    xor-int/lit8 p2, p2, 0x1

    .line 118
    invoke-virtual {p0, p2}, Ll/֡ۚۢ;->֫(Z)V

    .line 119
    invoke-virtual {p0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v0

    invoke-static {v0, p2}, Ll/ۡۨܽ;->֫(Landroid/view/View;Z)V

    .line 120
    invoke-virtual {p0}, Ll/֡ۚۢ;->ܽ()Landroid/widget/Button;

    move-result-object v0

    invoke-static {v0, p2}, Ll/ۡۨܽ;->֫(Landroid/view/View;Z)V

    .line 121
    invoke-virtual {p0}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object p0

    invoke-static {p0, p2}, Ll/ۡۨܽ;->֫(Landroid/view/View;Z)V

    const p0, 0x7f0a0553

    .line 123
    invoke-virtual {p1, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    invoke-static {p0, p2}, Ll/ۡۨܽ;->֫(Landroid/view/View;Z)V

    const p0, 0x7f0a0555

    .line 124
    invoke-virtual {p1, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    invoke-static {p0, p2}, Ll/ۡۨܽ;->֫(Landroid/view/View;Z)V

    const p0, 0x7f0a0576

    .line 125
    invoke-virtual {p1, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    invoke-static {p0, p2}, Ll/ۡۨܽ;->֫(Landroid/view/View;Z)V

    const p0, 0x7f0a0577

    .line 126
    invoke-virtual {p1, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    invoke-static {p0, p2}, Ll/ۡۨܽ;->֫(Landroid/view/View;Z)V

    const p0, 0x7f0a0578

    .line 127
    invoke-virtual {p1, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    invoke-static {p0, p2}, Ll/ۡۨܽ;->֫(Landroid/view/View;Z)V

    return-void
.end method

.method public static ֫(Ll/᩷ۨܽ;Ll/۬ܿᩳ;Ll/ۗܺ᩷;)V
    .locals 1

    .line 658
    instance-of v0, p1, Ll/᩹ܿᩳ;

    if-eqz v0, :cond_0

    .line 659
    new-instance v0, Ll/ۤۛܽ;

    invoke-direct {v0, p0, p1, p2}, Ll/ۤۛܽ;-><init>(Ll/᩷ۨܽ;Ll/۬ܿᩳ;Ll/ۗܺ᩷;)V

    .line 687
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    return-void

    .line 690
    :cond_0
    new-instance v0, Ll/ۛۛܽ;

    invoke-direct {v0, p0, p1, p2}, Ll/ۛۛܽ;-><init>(Ll/᩷ۨܽ;Ll/۬ܿᩳ;Ll/ۗܺ᩷;)V

    .line 714
    invoke-virtual {p1}, Ll/۬ܿᩳ;->ۡ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/ۨ۬ܿ;->ۧ(Ljava/lang/String;)V

    .line 715
    invoke-virtual {v0}, Ll/ۨ۬ܿ;->᩻()V

    .line 717
    invoke-virtual {p1}, Ll/۬ܿᩳ;->ۘ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/ۨ۬ܿ;->֫(Ljava/lang/String;)V

    .line 718
    invoke-virtual {v0}, Ll/ۨ۬ܿ;->ܳ()V

    .line 719
    invoke-virtual {v0}, Ll/ۨ۬ܿ;->ۜ()V

    return-void
.end method

.method public static ۧ()Ljava/util/List;
    .locals 3

    .line 54
    invoke-static {}, Ll/ۡۨܽ;->ᩳ()V

    .line 55
    sget-object v0, Ll/ۡۨܽ;->֫:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ۙۛܽ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/ۙۛܽ;-><init>(I)V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 56
    invoke-static {}, Ll/᩺ۨᩴ;->toUnmodifiableList()Ll/ۨۨᩴ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public static ۧ(Ll/ۗܺ᩷;Landroid/view/View;Ll/ܽ᩺ܽ;)Ll/᩻ۨܽ;
    .locals 13

    const v0, 0x7f0a0553

    .line 293
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/Spinner;

    const v0, 0x7f0a0555

    .line 294
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/Spinner;

    const v0, 0x7f0a0576

    .line 295
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ll/ۗۘ;

    const v0, 0x7f0a0578

    .line 296
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ll/ۗۘ;

    .line 297
    new-instance v6, Ll/ۢۨܽ;

    invoke-direct {v6, v2}, Ll/ۢۨܽ;-><init>(Landroid/widget/Spinner;)V

    .line 298
    invoke-static {}, Ll/ۡۨܽ;->ᩳ()V

    const/high16 v0, 0x42100000    # 36.0f

    .line 299
    invoke-static {v0}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v0

    .line 301
    new-instance v1, Ll/ܰۛܽ;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    sget-object v8, Ll/ۡۨܽ;->֫:Ljava/util/ArrayList;

    invoke-direct {v1, v7, v8, v0}, Ll/ܰۛܽ;-><init>(Landroid/content/Context;Ljava/util/ArrayList;I)V

    invoke-virtual {v2, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 309
    new-instance v1, Ll/۟ۛܽ;

    invoke-direct {v1, v6}, Ll/۟ۛܽ;-><init>(Ll/ۢۨܽ;)V

    invoke-virtual {v2, v1}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 320
    invoke-virtual {p2}, Ll/ܽ᩺ܽ;->ܽ()Ljava/lang/String;

    move-result-object v1

    .line 321
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    const/4 v9, 0x0

    if-nez v7, :cond_1

    const/4 v7, 0x0

    .line 322
    :goto_0
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-ge v7, v10, :cond_1

    .line 323
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/۬ܿᩳ;

    invoke-virtual {v10}, Ll/۬ܿᩳ;->ۘ()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    move v9, v7

    goto :goto_1

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 328
    :cond_1
    :goto_1
    invoke-virtual {v2, v9}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 330
    new-instance v7, Ll/֫ۨܽ;

    invoke-direct {v7, v1, v2, v6}, Ll/֫ۨܽ;-><init>(Ljava/lang/String;Landroid/widget/Spinner;Ll/ۢۨܽ;)V

    .line 368
    new-instance v1, Ll/ۧۨܽ;

    invoke-direct {v1, p0, v7}, Ll/ۧۨܽ;-><init>(Ll/ۗܺ᩷;Ll/ܳۡ֫;)V

    invoke-virtual {v2, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 381
    invoke-static {}, Ll/۠ۧᩳ;->values()[Ll/۠ۧᩳ;

    move-result-object v1

    invoke-static {v1}, Ll/᩹۬ᩴ;->stream([Ljava/lang/Object;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    new-instance v7, Ll/ۗۛܽ;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Ll/ۗۛܽ;-><init>(I)V

    invoke-interface {v1, v7}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v7

    invoke-interface {v1, v7}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 382
    new-instance v7, Ll/ܽۨܽ;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v7, v0, p1, v1}, Ll/ܽۨܽ;-><init>(ILandroid/content/Context;Ljava/util/List;)V

    invoke-virtual {v3, v7}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 390
    new-instance p1, Ll/ᩳۨܽ;

    invoke-direct {p1, v4, v5}, Ll/ᩳۨܽ;-><init>(Ll/ۗۘ;Ll/ۗۘ;)V

    invoke-virtual {v3, p1}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 411
    invoke-virtual {p2}, Ll/ܽ᩺ܽ;->ᩳ()Ll/۠ۧᩳ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    .line 412
    invoke-virtual {v3, v10}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 413
    invoke-virtual {v3}, Landroid/widget/AdapterView;->getOnItemSelectedListener()Landroid/widget/AdapterView$OnItemSelectedListener;

    move-result-object v7

    invoke-static {v7}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v9, 0x0

    const-wide/16 v11, 0x0

    const/4 v8, 0x0

    invoke-interface/range {v7 .. v12}, Landroid/widget/AdapterView$OnItemSelectedListener;->onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 415
    invoke-virtual {p2}, Ll/ܽ᩺ܽ;->ܳ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 416
    invoke-virtual {p2}, Ll/ܽ᩺ܽ;->ܳ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {v4, p1}, Ll/ۗۘ;->setChecked(Z)V

    .line 417
    new-instance p1, Ll/۬ۛܽ;

    invoke-direct {p1, p0, v4}, Ll/۬ۛܽ;-><init>(Ll/ۗܺ᩷;Ll/ۗۘ;)V

    invoke-virtual {v4, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz v5, :cond_2

    .line 436
    invoke-virtual {p2}, Ll/ܽ᩺ܽ;->֫()Z

    move-result p0

    invoke-virtual {v5, p0}, Ll/ۗۘ;->setChecked(Z)V

    .line 439
    :cond_2
    new-instance p0, Ll/۫ۛܽ;

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Ll/۫ۛܽ;-><init>(Landroid/widget/Spinner;Landroid/widget/Spinner;Ll/ۗۘ;Ll/ۗۘ;Ll/ۢۨܽ;)V

    return-object p0
.end method

.method public static ܽ()Ll/ܶ᩵ܿ;
    .locals 2

    .line 786
    invoke-static {}, Ll/ܽ֡ܿ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object v0

    const-string v1, "keys"

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    return-object v0
.end method

.method public static ᩳ()V
    .locals 6

    .line 756
    sget-object v0, Ll/ۡۨܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 757
    invoke-static {}, Ll/ܶܿᩳ;->ۚ()Ll/ܶܿᩳ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 758
    invoke-static {}, Ll/ۡۨܽ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 759
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, 0x1

    .line 413
    invoke-virtual {v1, v2}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v2

    .line 760
    invoke-static {v2}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v2

    new-instance v3, Ll/ܺۘܽ;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Ll/ܺۘܽ;-><init>(I)V

    .line 761
    invoke-interface {v2, v3}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v2

    new-instance v3, Ll/ۗᩳܽ;

    invoke-direct {v3, v4}, Ll/ۗᩳܽ;-><init>(I)V

    .line 766
    invoke-interface {v2, v3}, Ll/ܿ᩺ᩴ;->sorted(Ljava/util/Comparator;)Ll/ܿ᩺ᩴ;

    move-result-object v2

    .line 767
    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v3

    invoke-interface {v2, v3}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 768
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܶ᩵ܿ;

    .line 769
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    const-string v5, ".pk8"

    .line 770
    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 771
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ۧ֫()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ".x509.pem"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 772
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 773
    new-instance v5, Ll/۫ܿᩳ;

    invoke-direct {v5, v4, v3}, Ll/۫ܿᩳ;-><init>(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const-string v5, "aes"

    .line 774
    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 775
    new-instance v4, Ll/᩶ܿᩳ;

    invoke-direct {v4, v3}, Ll/᩶ܿᩳ;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    const-string v5, "enc"

    .line 776
    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 777
    new-instance v4, Ll/᩹ܿᩳ;

    invoke-direct {v4, v3}, Ll/᩹ܿᩳ;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 779
    :cond_3
    new-instance v4, Ll/ۙܿᩳ;

    invoke-direct {v4, v3}, Ll/ۙܿᩳ;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    return-void
.end method
