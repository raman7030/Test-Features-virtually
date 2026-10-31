.class public Ll/ᩴܿ;
.super Ljava/lang/Object;
.source "G58J"


# instance fields
.field public final P:Ll/ۢܿ;

.field public final mTheme:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 312
    invoke-static {p1, v0}, Ll/᩵ܿ;->֫(Landroid/content/Context;I)I

    move-result v0

    invoke-direct {p0, p1, v0}, Ll/ᩴܿ;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 3

    .line 341
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 342
    new-instance v0, Ll/ۢܿ;

    new-instance v1, Landroid/view/ContextThemeWrapper;

    .line 343
    invoke-static {p1, p2}, Ll/᩵ܿ;->֫(Landroid/content/Context;I)I

    move-result v2

    invoke-direct {v1, p1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    invoke-direct {v0, v1}, Ll/ۢܿ;-><init>(Landroid/view/ContextThemeWrapper;)V

    iput-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    .line 344
    iput p2, p0, Ll/ᩴܿ;->mTheme:I

    return-void
.end method


# virtual methods
.method public create()Ll/᩵ܿ;
    .locals 13

    .line 982
    new-instance v0, Ll/᩵ܿ;

    iget-object v1, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iget-object v1, v1, Ll/ۢܿ;->ܿ:Landroid/view/ContextThemeWrapper;

    iget v2, p0, Ll/ᩴܿ;->mTheme:I

    invoke-direct {v0, v1, v2}, Ll/᩵ܿ;-><init>(Landroid/view/ContextThemeWrapper;I)V

    .line 983
    iget-object v1, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    .line 931
    iget-object v2, v1, Ll/ۢܿ;->᩻:Landroid/view/View;

    iget-object v5, v1, Ll/ۢܿ;->ܿ:Landroid/view/ContextThemeWrapper;

    iget-object v9, v0, Ll/᩵ܿ;->᩸:Ll/ۘܿ;

    if-eqz v2, :cond_0

    .line 932
    invoke-virtual {v9, v2}, Ll/ۘܿ;->֫(Landroid/view/View;)V

    goto :goto_0

    .line 934
    :cond_0
    iget-object v2, v1, Ll/ۢܿ;->᩺:Ljava/lang/CharSequence;

    if-eqz v2, :cond_1

    .line 935
    invoke-virtual {v9, v2}, Ll/ۘܿ;->ۧ(Ljava/lang/CharSequence;)V

    .line 937
    :cond_1
    iget-object v2, v1, Ll/ۢܿ;->ۜ:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_2

    .line 938
    invoke-virtual {v9, v2}, Ll/ۘܿ;->֫(Landroid/graphics/drawable/Drawable;)V

    .line 940
    :cond_2
    iget v2, v1, Ll/ۢܿ;->᩷:I

    if-eqz v2, :cond_3

    .line 941
    invoke-virtual {v9, v2}, Ll/ۘܿ;->֫(I)V

    .line 947
    :cond_3
    :goto_0
    iget-object v2, v1, Ll/ۢܿ;->᩵:Ljava/lang/CharSequence;

    if-eqz v2, :cond_4

    .line 948
    invoke-virtual {v9, v2}, Ll/ۘܿ;->֫(Ljava/lang/CharSequence;)V

    .line 950
    :cond_4
    iget-object v2, v1, Ll/ۢܿ;->ۨ:Ljava/lang/CharSequence;

    if-nez v2, :cond_5

    iget-object v3, v1, Ll/ۢܿ;->ۤ:Landroid/graphics/drawable/Drawable;

    if-eqz v3, :cond_6

    .line 951
    :cond_5
    iget-object v3, v1, Ll/ۢܿ;->ۛ:Landroid/content/DialogInterface$OnClickListener;

    iget-object v4, v1, Ll/ۢܿ;->ۤ:Landroid/graphics/drawable/Drawable;

    const/4 v6, -0x1

    invoke-virtual {v9, v6, v2, v3, v4}, Ll/ۘܿ;->֫(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;Landroid/graphics/drawable/Drawable;)V

    .line 954
    :cond_6
    iget-object v2, v1, Ll/ۢܿ;->֨:Ljava/lang/CharSequence;

    if-nez v2, :cond_7

    iget-object v3, v1, Ll/ۢܿ;->֡:Landroid/graphics/drawable/Drawable;

    if-eqz v3, :cond_8

    .line 955
    :cond_7
    iget-object v3, v1, Ll/ۢܿ;->ۚ:Landroid/content/DialogInterface$OnClickListener;

    iget-object v4, v1, Ll/ۢܿ;->֡:Landroid/graphics/drawable/Drawable;

    const/4 v6, -0x2

    invoke-virtual {v9, v6, v2, v3, v4}, Ll/ۘܿ;->֫(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;Landroid/graphics/drawable/Drawable;)V

    .line 958
    :cond_8
    iget-object v2, v1, Ll/ۢܿ;->᩸:Ljava/lang/CharSequence;

    if-nez v2, :cond_9

    iget-object v3, v1, Ll/ۢܿ;->۠:Landroid/graphics/drawable/Drawable;

    if-eqz v3, :cond_a

    .line 959
    :cond_9
    iget-object v3, v1, Ll/ۢܿ;->ܶ:Landroid/content/DialogInterface$OnClickListener;

    iget-object v4, v1, Ll/ۢܿ;->۠:Landroid/graphics/drawable/Drawable;

    const/4 v6, -0x3

    invoke-virtual {v9, v6, v2, v3, v4}, Ll/ۘܿ;->֫(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;Landroid/graphics/drawable/Drawable;)V

    .line 964
    :cond_a
    iget-object v2, v1, Ll/ۢܿ;->ۘ:[Ljava/lang/CharSequence;

    const/4 v12, 0x1

    if-nez v2, :cond_b

    iget-object v2, v1, Ll/ۢܿ;->ܳ:Landroid/database/Cursor;

    if-nez v2, :cond_b

    iget-object v2, v1, Ll/ۢܿ;->֫:Landroid/widget/ListAdapter;

    if-eqz v2, :cond_16

    .line 988
    :cond_b
    iget-object v2, v1, Ll/ۢܿ;->ۢ:Landroid/view/LayoutInflater;

    iget v3, v9, Ll/ۘܿ;->ۗ:I

    const/4 v4, 0x0

    .line 989
    invoke-virtual {v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/ۖܿ;

    .line 992
    iget-boolean v3, v1, Ll/ۢܿ;->ܺ:Z

    if-eqz v3, :cond_d

    .line 993
    iget-object v3, v1, Ll/ۢܿ;->ܳ:Landroid/database/Cursor;

    if-nez v3, :cond_c

    .line 994
    new-instance v10, Ll/ܳܿ;

    iget v6, v9, Ll/ۘܿ;->ۛ:I

    iget-object v7, v1, Ll/ۢܿ;->ۘ:[Ljava/lang/CharSequence;

    move-object v3, v10

    move-object v4, v1

    move-object v8, v2

    invoke-direct/range {v3 .. v8}, Ll/ܳܿ;-><init>(Ll/ۢܿ;Landroid/view/ContextThemeWrapper;I[Ljava/lang/CharSequence;Ll/ۖܿ;)V

    goto :goto_3

    .line 1009
    :cond_c
    new-instance v10, Ll/᩻ܿ;

    iget-object v6, v1, Ll/ۢܿ;->ܳ:Landroid/database/Cursor;

    move-object v3, v10

    move-object v4, v1

    move-object v7, v2

    move-object v8, v9

    invoke-direct/range {v3 .. v8}, Ll/᩻ܿ;-><init>(Ll/ۢܿ;Landroid/view/ContextThemeWrapper;Landroid/database/Cursor;Ll/ۖܿ;Ll/ۘܿ;)V

    goto :goto_3

    .line 1038
    :cond_d
    iget-boolean v3, v1, Ll/ۢܿ;->ۖ:Z

    if-eqz v3, :cond_e

    .line 1039
    iget v3, v9, Ll/ۘܿ;->ܰ:I

    goto :goto_1

    .line 1041
    :cond_e
    iget v3, v9, Ll/ۘܿ;->ۙ:I

    :goto_1
    move v6, v3

    .line 1044
    iget-object v3, v1, Ll/ۢܿ;->ܳ:Landroid/database/Cursor;

    if-eqz v3, :cond_f

    const v3, 0x1020014

    .line 1045
    new-instance v10, Landroid/widget/SimpleCursorAdapter;

    iget-object v7, v1, Ll/ۢܿ;->ܳ:Landroid/database/Cursor;

    iget-object v4, v1, Ll/ۢܿ;->ᩴ:Ljava/lang/String;

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v8

    filled-new-array {v3}, [I

    move-result-object v11

    move-object v3, v10

    move-object v4, v5

    move v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v11

    invoke-direct/range {v3 .. v8}, Landroid/widget/SimpleCursorAdapter;-><init>(Landroid/content/Context;ILandroid/database/Cursor;[Ljava/lang/String;[I)V

    goto :goto_3

    :cond_f
    const v3, 0x1020014

    .line 1047
    iget-object v4, v1, Ll/ۢܿ;->֫:Landroid/widget/ListAdapter;

    if-eqz v4, :cond_10

    :goto_2
    move-object v10, v4

    goto :goto_3

    .line 1050
    :cond_10
    new-instance v4, Ll/ܺܿ;

    iget-object v7, v1, Ll/ۢܿ;->ۘ:[Ljava/lang/CharSequence;

    .line 1104
    invoke-direct {v4, v5, v6, v3, v7}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    goto :goto_2

    .line 1061
    :goto_3
    iput-object v10, v9, Ll/ۘܿ;->֫:Landroid/widget/ListAdapter;

    .line 1062
    iget v3, v1, Ll/ۢܿ;->ܽ:I

    iput v3, v9, Ll/ۘܿ;->֡:I

    .line 1064
    iget-object v3, v1, Ll/ۢܿ;->ۙ:Landroid/content/DialogInterface$OnClickListener;

    if-eqz v3, :cond_11

    .line 1065
    new-instance v3, Ll/ۜܿ;

    invoke-direct {v3, v1, v9}, Ll/ۜܿ;-><init>(Ll/ۢܿ;Ll/ۘܿ;)V

    invoke-virtual {v2, v3}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    goto :goto_4

    .line 1074
    :cond_11
    iget-object v3, v1, Ll/ۢܿ;->᩶:Landroid/content/DialogInterface$OnMultiChoiceClickListener;

    if-eqz v3, :cond_12

    .line 1075
    new-instance v3, Ll/᩷ܿ;

    invoke-direct {v3, v1, v2, v9}, Ll/᩷ܿ;-><init>(Ll/ۢܿ;Ll/ۖܿ;Ll/ۘܿ;)V

    invoke-virtual {v2, v3}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 1088
    :cond_12
    :goto_4
    iget-object v3, v1, Ll/ۢܿ;->۬:Landroid/widget/AdapterView$OnItemSelectedListener;

    if-eqz v3, :cond_13

    .line 1089
    invoke-virtual {v2, v3}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 1092
    :cond_13
    iget-boolean v3, v1, Ll/ۢܿ;->ۖ:Z

    if-eqz v3, :cond_14

    .line 1093
    invoke-virtual {v2, v12}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    goto :goto_5

    .line 1094
    :cond_14
    iget-boolean v3, v1, Ll/ۢܿ;->ܺ:Z

    if-eqz v3, :cond_15

    const/4 v3, 0x2

    .line 1095
    invoke-virtual {v2, v3}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    .line 1097
    :cond_15
    :goto_5
    iput-object v2, v9, Ll/ۘܿ;->۬:Ll/ۖܿ;

    .line 967
    :cond_16
    iget-object v7, v1, Ll/ۢܿ;->ܰ:Landroid/view/View;

    if-eqz v7, :cond_18

    .line 968
    iget-boolean v2, v1, Ll/ۢܿ;->ᩳ֫:Z

    if-eqz v2, :cond_17

    .line 969
    iget v8, v1, Ll/ۢܿ;->ۧ֫:I

    iget v2, v1, Ll/ۢܿ;->ܿ֫:I

    iget v10, v1, Ll/ۢܿ;->ܽ֫:I

    iget v11, v1, Ll/ۢܿ;->֫֫:I

    move-object v6, v9

    move v9, v2

    invoke-virtual/range {v6 .. v11}, Ll/ۘܿ;->֫(Landroid/view/View;IIII)V

    goto :goto_6

    .line 972
    :cond_17
    invoke-virtual {v9, v7}, Ll/ۘܿ;->ۧ(Landroid/view/View;)V

    goto :goto_6

    .line 974
    :cond_18
    iget v1, v1, Ll/ۢܿ;->۟:I

    if-eqz v1, :cond_19

    .line 975
    invoke-virtual {v9, v1}, Ll/ۘܿ;->ۧ(I)V

    .line 984
    :cond_19
    :goto_6
    iget-object v1, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iget-boolean v1, v1, Ll/ۢܿ;->ۧ:Z

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 985
    iget-object v1, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iget-boolean v1, v1, Ll/ۢܿ;->ۧ:Z

    if-eqz v1, :cond_1a

    .line 986
    invoke-virtual {v0, v12}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 988
    :cond_1a
    iget-object v1, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iget-object v1, v1, Ll/ۢܿ;->᩹:Landroid/content/DialogInterface$OnCancelListener;

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 989
    iget-object v1, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iget-object v1, v1, Ll/ۢܿ;->ۗ:Landroid/content/DialogInterface$OnDismissListener;

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 990
    iget-object v1, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iget-object v1, v1, Ll/ۢܿ;->۫:Landroid/content/DialogInterface$OnKeyListener;

    if-eqz v1, :cond_1b

    .line 991
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    :cond_1b
    return-object v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    .line 357
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iget-object v0, v0, Ll/ۢܿ;->ܿ:Landroid/view/ContextThemeWrapper;

    return-object v0
.end method

.method public setAdapter(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)Ll/ᩴܿ;
    .locals 1

    .line 658
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-object p1, v0, Ll/ۢܿ;->֫:Landroid/widget/ListAdapter;

    .line 659
    iput-object p2, v0, Ll/ۢܿ;->ۙ:Landroid/content/DialogInterface$OnClickListener;

    return-object p0
.end method

.method public setCancelable(Z)Ll/ᩴܿ;
    .locals 1

    .line 578
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-boolean p1, v0, Ll/ۢܿ;->ۧ:Z

    return-object p0
.end method

.method public setCursor(Landroid/database/Cursor;Landroid/content/DialogInterface$OnClickListener;Ljava/lang/String;)Ll/ᩴܿ;
    .locals 1

    .line 677
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-object p1, v0, Ll/ۢܿ;->ܳ:Landroid/database/Cursor;

    .line 678
    iput-object p3, v0, Ll/ۢܿ;->ᩴ:Ljava/lang/String;

    .line 679
    iput-object p2, v0, Ll/ۢܿ;->ۙ:Landroid/content/DialogInterface$OnClickListener;

    return-object p0
.end method

.method public setCustomTitle(Landroid/view/View;)Ll/ᩴܿ;
    .locals 1

    .line 397
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-object p1, v0, Ll/ۢܿ;->᩻:Landroid/view/View;

    return-object p0
.end method

.method public setIcon(I)Ll/ᩴܿ;
    .locals 1

    .line 429
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput p1, v0, Ll/ۢܿ;->᩷:I

    return-object p0
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)Ll/ᩴܿ;
    .locals 1

    .line 444
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-object p1, v0, Ll/ۢܿ;->ۜ:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public setIconAttribute(I)Ll/ᩴܿ;
    .locals 3

    .line 458
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 459
    iget-object v1, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iget-object v1, v1, Ll/ۢܿ;->ܿ:Landroid/view/ContextThemeWrapper;

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 460
    iget-object p1, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    iput v0, p1, Ll/ۢܿ;->᩷:I

    return-object p0
.end method

.method public setInverseBackgroundForced(Z)Ll/ᩴܿ;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 957
    iget-object p1, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public setItems(ILandroid/content/DialogInterface$OnClickListener;)Ll/ᩴܿ;
    .locals 2

    .line 630
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iget-object v1, v0, Ll/ۢܿ;->ܿ:Landroid/view/ContextThemeWrapper;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getTextArray(I)[Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, Ll/ۢܿ;->ۘ:[Ljava/lang/CharSequence;

    .line 631
    iget-object p1, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-object p2, p1, Ll/ۢܿ;->ۙ:Landroid/content/DialogInterface$OnClickListener;

    return-object p0
.end method

.method public setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Ll/ᩴܿ;
    .locals 1

    .line 642
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-object p1, v0, Ll/ۢܿ;->ۘ:[Ljava/lang/CharSequence;

    .line 643
    iput-object p2, v0, Ll/ۢܿ;->ۙ:Landroid/content/DialogInterface$OnClickListener;

    return-object p0
.end method

.method public setMessage(I)Ll/ᩴܿ;
    .locals 2

    .line 407
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iget-object v1, v0, Ll/ۢܿ;->ܿ:Landroid/view/ContextThemeWrapper;

    invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, Ll/ۢܿ;->᩵:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public setMessage(Ljava/lang/CharSequence;)Ll/ᩴܿ;
    .locals 1

    .line 417
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-object p1, v0, Ll/ۢܿ;->᩵:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public setMultiChoiceItems(I[ZLandroid/content/DialogInterface$OnMultiChoiceClickListener;)Ll/ᩴܿ;
    .locals 2

    .line 703
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iget-object v1, v0, Ll/ۢܿ;->ܿ:Landroid/view/ContextThemeWrapper;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getTextArray(I)[Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, Ll/ۢܿ;->ۘ:[Ljava/lang/CharSequence;

    .line 704
    iget-object p1, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-object p3, p1, Ll/ۢܿ;->᩶:Landroid/content/DialogInterface$OnMultiChoiceClickListener;

    .line 705
    iput-object p2, p1, Ll/ۢܿ;->ᩳ:[Z

    const/4 p2, 0x1

    .line 706
    iput-boolean p2, p1, Ll/ۢܿ;->ܺ:Z

    return-object p0
.end method

.method public setMultiChoiceItems(Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnMultiChoiceClickListener;)Ll/ᩴܿ;
    .locals 1

    .line 757
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-object p1, v0, Ll/ۢܿ;->ܳ:Landroid/database/Cursor;

    .line 758
    iput-object p4, v0, Ll/ۢܿ;->᩶:Landroid/content/DialogInterface$OnMultiChoiceClickListener;

    .line 759
    iput-object p2, v0, Ll/ۢܿ;->ۡ:Ljava/lang/String;

    .line 760
    iput-object p3, v0, Ll/ۢܿ;->ᩴ:Ljava/lang/String;

    const/4 p1, 0x1

    .line 761
    iput-boolean p1, v0, Ll/ۢܿ;->ܺ:Z

    return-object p0
.end method

.method public setMultiChoiceItems([Ljava/lang/CharSequence;[ZLandroid/content/DialogInterface$OnMultiChoiceClickListener;)Ll/ᩴܿ;
    .locals 1

    .line 729
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-object p1, v0, Ll/ۢܿ;->ۘ:[Ljava/lang/CharSequence;

    .line 730
    iput-object p3, v0, Ll/ۢܿ;->᩶:Landroid/content/DialogInterface$OnMultiChoiceClickListener;

    .line 731
    iput-object p2, v0, Ll/ۢܿ;->ᩳ:[Z

    const/4 p1, 0x1

    .line 732
    iput-boolean p1, v0, Ll/ۢܿ;->ܺ:Z

    return-object p0
.end method

.method public setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Ll/ᩴܿ;
    .locals 2

    .line 508
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iget-object v1, v0, Ll/ۢܿ;->ܿ:Landroid/view/ContextThemeWrapper;

    invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, Ll/ۢܿ;->֨:Ljava/lang/CharSequence;

    .line 509
    iget-object p1, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-object p2, p1, Ll/ۢܿ;->ۚ:Landroid/content/DialogInterface$OnClickListener;

    return-object p0
.end method

.method public setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Ll/ᩴܿ;
    .locals 1

    .line 521
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-object p1, v0, Ll/ۢܿ;->֨:Ljava/lang/CharSequence;

    .line 522
    iput-object p2, v0, Ll/ۢܿ;->ۚ:Landroid/content/DialogInterface$OnClickListener;

    return-object p0
.end method

.method public setNegativeButtonIcon(Landroid/graphics/drawable/Drawable;)Ll/ᩴܿ;
    .locals 1

    .line 532
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-object p1, v0, Ll/ۢܿ;->֡:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Ll/ᩴܿ;
    .locals 2

    .line 544
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iget-object v1, v0, Ll/ۢܿ;->ܿ:Landroid/view/ContextThemeWrapper;

    invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, Ll/ۢܿ;->᩸:Ljava/lang/CharSequence;

    .line 545
    iget-object p1, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-object p2, p1, Ll/ۢܿ;->ܶ:Landroid/content/DialogInterface$OnClickListener;

    return-object p0
.end method

.method public setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Ll/ᩴܿ;
    .locals 1

    .line 557
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-object p1, v0, Ll/ۢܿ;->᩸:Ljava/lang/CharSequence;

    .line 558
    iput-object p2, v0, Ll/ۢܿ;->ܶ:Landroid/content/DialogInterface$OnClickListener;

    return-object p0
.end method

.method public setNeutralButtonIcon(Landroid/graphics/drawable/Drawable;)Ll/ᩴܿ;
    .locals 1

    .line 568
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-object p1, v0, Ll/ۢܿ;->۠:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Ll/ᩴܿ;
    .locals 1

    .line 599
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-object p1, v0, Ll/ۢܿ;->᩹:Landroid/content/DialogInterface$OnCancelListener;

    return-object p0
.end method

.method public setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)Ll/ᩴܿ;
    .locals 1

    .line 609
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-object p1, v0, Ll/ۢܿ;->ۗ:Landroid/content/DialogInterface$OnDismissListener;

    return-object p0
.end method

.method public setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)Ll/ᩴܿ;
    .locals 1

    .line 867
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-object p1, v0, Ll/ۢܿ;->۬:Landroid/widget/AdapterView$OnItemSelectedListener;

    return-object p0
.end method

.method public setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)Ll/ᩴܿ;
    .locals 1

    .line 619
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-object p1, v0, Ll/ۢܿ;->۫:Landroid/content/DialogInterface$OnKeyListener;

    return-object p0
.end method

.method public setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Ll/ᩴܿ;
    .locals 2

    .line 472
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iget-object v1, v0, Ll/ۢܿ;->ܿ:Landroid/view/ContextThemeWrapper;

    invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, Ll/ۢܿ;->ۨ:Ljava/lang/CharSequence;

    .line 473
    iget-object p1, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-object p2, p1, Ll/ۢܿ;->ۛ:Landroid/content/DialogInterface$OnClickListener;

    return-object p0
.end method

.method public setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Ll/ᩴܿ;
    .locals 1

    .line 485
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-object p1, v0, Ll/ۢܿ;->ۨ:Ljava/lang/CharSequence;

    .line 486
    iput-object p2, v0, Ll/ۢܿ;->ۛ:Landroid/content/DialogInterface$OnClickListener;

    return-object p0
.end method

.method public setPositiveButtonIcon(Landroid/graphics/drawable/Drawable;)Ll/ᩴܿ;
    .locals 1

    .line 496
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-object p1, v0, Ll/ۢܿ;->ۤ:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public setRecycleOnMeasureEnabled(Z)Ll/ᩴܿ;
    .locals 0

    .line 965
    iget-object p1, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public setSingleChoiceItems(IILandroid/content/DialogInterface$OnClickListener;)Ll/ᩴܿ;
    .locals 2

    .line 782
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iget-object v1, v0, Ll/ۢܿ;->ܿ:Landroid/view/ContextThemeWrapper;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getTextArray(I)[Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, Ll/ۢܿ;->ۘ:[Ljava/lang/CharSequence;

    .line 783
    iget-object p1, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-object p3, p1, Ll/ۢܿ;->ۙ:Landroid/content/DialogInterface$OnClickListener;

    .line 784
    iput p2, p1, Ll/ۢܿ;->ܽ:I

    const/4 p2, 0x1

    .line 785
    iput-boolean p2, p1, Ll/ۢܿ;->ۖ:Z

    return-object p0
.end method

.method public setSingleChoiceItems(Landroid/database/Cursor;ILjava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Ll/ᩴܿ;
    .locals 1

    .line 807
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-object p1, v0, Ll/ۢܿ;->ܳ:Landroid/database/Cursor;

    .line 808
    iput-object p4, v0, Ll/ۢܿ;->ۙ:Landroid/content/DialogInterface$OnClickListener;

    .line 809
    iput p2, v0, Ll/ۢܿ;->ܽ:I

    .line 810
    iput-object p3, v0, Ll/ۢܿ;->ᩴ:Ljava/lang/String;

    const/4 p1, 0x1

    .line 811
    iput-boolean p1, v0, Ll/ۢܿ;->ۖ:Z

    return-object p0
.end method

.method public setSingleChoiceItems(Landroid/widget/ListAdapter;ILandroid/content/DialogInterface$OnClickListener;)Ll/ᩴܿ;
    .locals 1

    .line 852
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-object p1, v0, Ll/ۢܿ;->֫:Landroid/widget/ListAdapter;

    .line 853
    iput-object p3, v0, Ll/ۢܿ;->ۙ:Landroid/content/DialogInterface$OnClickListener;

    .line 854
    iput p2, v0, Ll/ۢܿ;->ܽ:I

    const/4 p1, 0x1

    .line 855
    iput-boolean p1, v0, Ll/ۢܿ;->ۖ:Z

    return-object p0
.end method

.method public setSingleChoiceItems([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)Ll/ᩴܿ;
    .locals 1

    .line 830
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-object p1, v0, Ll/ۢܿ;->ۘ:[Ljava/lang/CharSequence;

    .line 831
    iput-object p3, v0, Ll/ۢܿ;->ۙ:Landroid/content/DialogInterface$OnClickListener;

    .line 832
    iput p2, v0, Ll/ۢܿ;->ܽ:I

    const/4 p1, 0x1

    .line 833
    iput-boolean p1, v0, Ll/ۢܿ;->ۖ:Z

    return-object p0
.end method

.method public setTitle(I)Ll/ᩴܿ;
    .locals 2

    .line 366
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iget-object v1, v0, Ll/ۢܿ;->ܿ:Landroid/view/ContextThemeWrapper;

    invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, Ll/ۢܿ;->᩺:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public setTitle(Ljava/lang/CharSequence;)Ll/ᩴܿ;
    .locals 1

    .line 376
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-object p1, v0, Ll/ۢܿ;->᩺:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public setView(I)Ll/ᩴܿ;
    .locals 2

    .line 882
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    const/4 v1, 0x0

    iput-object v1, v0, Ll/ۢܿ;->ܰ:Landroid/view/View;

    .line 883
    iput p1, v0, Ll/ۢܿ;->۟:I

    const/4 p1, 0x0

    .line 884
    iput-boolean p1, v0, Ll/ۢܿ;->ᩳ֫:Z

    return-object p0
.end method

.method public setView(Landroid/view/View;)Ll/ᩴܿ;
    .locals 1

    .line 903
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-object p1, v0, Ll/ۢܿ;->ܰ:Landroid/view/View;

    const/4 p1, 0x0

    .line 904
    iput p1, v0, Ll/ۢܿ;->۟:I

    .line 905
    iput-boolean p1, v0, Ll/ۢܿ;->ᩳ֫:Z

    return-object p0
.end method

.method public setView(Landroid/view/View;IIII)Ll/ᩴܿ;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 935
    iget-object v0, p0, Ll/ᩴܿ;->P:Ll/ۢܿ;

    iput-object p1, v0, Ll/ۢܿ;->ܰ:Landroid/view/View;

    const/4 p1, 0x0

    .line 936
    iput p1, v0, Ll/ۢܿ;->۟:I

    const/4 p1, 0x1

    .line 937
    iput-boolean p1, v0, Ll/ۢܿ;->ᩳ֫:Z

    .line 938
    iput p2, v0, Ll/ۢܿ;->ۧ֫:I

    .line 939
    iput p3, v0, Ll/ۢܿ;->ܿ֫:I

    .line 940
    iput p4, v0, Ll/ۢܿ;->ܽ֫:I

    .line 941
    iput p5, v0, Ll/ۢܿ;->֫֫:I

    return-object p0
.end method

.method public show()Ll/᩵ܿ;
    .locals 1

    .line 1007
    invoke-virtual {p0}, Ll/ᩴܿ;->create()Ll/᩵ܿ;

    move-result-object v0

    .line 1008
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-object v0
.end method
