.class public final Ll/᩸۫ܿ;
.super Ljava/lang/Object;
.source "G7AW"


# static fields
.field public static final synthetic ֫:I

.field public static ۧ:Z

.field public static final ܳ:Landroid/content/BroadcastReceiver;

.field public static ܽ:Z

.field public static ܿ:I

.field public static ᩳ:Ll/֡ۖۢ;

.field public static final ᩻:Ljava/util/Set;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 74
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ll/᩸۫ܿ;->᩻:Ljava/util/Set;

    .line 820
    new-instance v0, Ll/֨۫ܿ;

    invoke-direct {v0}, Landroid/content/BroadcastReceiver;-><init>()V

    sput-object v0, Ll/᩸۫ܿ;->ܳ:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method public static ֫(ILjava/lang/String;)Landroid/graphics/Bitmap;
    .locals 13

    if-lez p0, :cond_9

    .line 333
    sget-object v0, Ll/᩷۠ۖ;->᩹:Ll/᩷۠ۖ;

    .line 54
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    if-ltz p0, :cond_7

    if-ltz p0, :cond_7

    .line 67
    sget-object v0, Ll/֡۠ۖ;->ۗ:Ll/֡۠ۖ;

    .line 78
    invoke-static {p1, v0}, Ll/ۙ۠ۖ;->֫(Ljava/lang/String;Ll/֡۠ۖ;)Ll/۫۠ۖ;

    move-result-object v0

    .line 103
    invoke-virtual {v0}, Ll/۫۠ۖ;->֫()Ll/᩹۠ۖ;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 107
    invoke-virtual {v0}, Ll/᩹۠ۖ;->ᩳ()I

    move-result v1

    .line 108
    invoke-virtual {v0}, Ll/᩹۠ۖ;->ܽ()I

    move-result v2

    add-int/lit8 v3, v1, 0x8

    add-int/lit8 v4, v2, 0x8

    .line 111
    invoke-static {p0, v3}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 112
    invoke-static {p0, v4}, Ljava/lang/Math;->max(II)I

    move-result v6

    .line 114
    div-int v3, v5, v3

    div-int v4, v6, v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    mul-int v4, v1, v3

    sub-int v4, v5, v4

    .line 119
    div-int/lit8 v4, v4, 0x2

    mul-int v8, v2, v3

    sub-int v8, v6, v8

    .line 120
    div-int/lit8 v8, v8, 0x2

    .line 122
    new-instance v9, Ll/ܺ۠ۖ;

    invoke-direct {v9, v5, v6}, Ll/ܺ۠ۖ;-><init>(II)V

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_2

    const/4 v6, 0x0

    move v10, v4

    :goto_1
    if-ge v6, v1, :cond_1

    .line 127
    invoke-virtual {v0, v6, v5}, Ll/᩹۠ۖ;->֫(II)B

    move-result v11

    const/4 v12, 0x1

    if-ne v11, v12, :cond_0

    .line 128
    invoke-virtual {v9, v10, v8, v3, v3}, Ll/ܺ۠ۖ;->֫(IIII)V

    :cond_0
    add-int/lit8 v6, v6, 0x1

    add-int/2addr v10, v3

    goto :goto_1

    :cond_1
    add-int/lit8 v5, v5, 0x1

    add-int/2addr v8, v3

    goto :goto_0

    :cond_2
    mul-int v0, p0, p0

    .line 334
    new-array v1, v0, [I

    const/4 v0, 0x0

    :goto_2
    if-ge v0, p0, :cond_5

    mul-int v2, v0, p0

    const/4 v3, 0x0

    :goto_3
    if-ge v3, p0, :cond_4

    add-int v4, v2, v3

    .line 338
    invoke-virtual {v9, v3, v0}, Ll/ܺ۠ۖ;->֫(II)Z

    move-result v5

    if-eqz v5, :cond_3

    const/high16 v5, -0x1000000

    goto :goto_4

    :cond_3
    const/4 v5, -0x1

    :goto_4
    aput v5, v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 341
    :cond_5
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p0, p0, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v8

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, v8

    move v3, p0

    move v6, p0

    move v7, p0

    .line 342
    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    return-object v8

    .line 105
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 63
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Requested dimensions are too small: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0x78

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 55
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Found empty contents"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 331
    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "size must be greater than 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫()V
    .locals 3

    .line 252
    invoke-static {}, Ll/᩸۫ܿ;->᩷()V

    .line 253
    new-instance v0, Ll/֡۫ܿ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v1, 0x3e8

    invoke-static {v0, v1, v2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    .line 254
    new-instance v0, Ll/֡۫ܿ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v1, 0xbb8

    invoke-static {v0, v1, v2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public static ֫(I[I)V
    .locals 3

    const v0, 0x7f0a0465

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 163
    :goto_0
    aput p0, p1, v2

    .line 228
    sget-object p1, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    if-ne p0, v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    const-string p0, "remote_manager_last_protocol"

    invoke-interface {p1, p0, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 165
    invoke-static {}, Ll/᩸۫ܿ;->᩷()V

    return-void
.end method

.method public static ֫(Lcom/google/android/material/textfield/TextInputLayout;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Ll/֡ۚۢ;)V
    .locals 0

    .line 712
    invoke-static {p0, p1}, Ll/᩸۫ܿ;->֫(Lcom/google/android/material/textfield/TextInputLayout;Landroid/widget/EditText;)Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    .line 716
    :cond_0
    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 717
    invoke-virtual {p3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    .line 718
    invoke-virtual {p4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    .line 719
    invoke-virtual {p5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p4

    .line 720
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 715
    invoke-static {p0, p2, p3, p4, p1}, Ll/ܶۘۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 771
    invoke-static {}, Ll/۠ۘۢ;->ᩳ()Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    .line 772
    sput-boolean p0, Ll/᩸۫ܿ;->ۧ:Z

    .line 87
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object p0

    .line 88
    new-instance p1, Landroid/content/Intent;

    const-class p2, Ll/۠ۘۢ;

    invoke-direct {p1, p0, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 89
    invoke-virtual {p0, p1}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    .line 722
    :cond_1
    invoke-virtual {p6}, Ll/֡ۚۢ;->dismiss()V

    return-void
.end method

.method public static ֫(Lcom/google/android/material/textfield/TextInputLayout;Landroid/widget/EditText;Landroid/widget/EditText;Lcom/google/android/material/textfield/TextInputLayout;Landroid/widget/EditText;Ll/֡ۚۢ;)V
    .locals 1

    .line 437
    invoke-static {p0, p1}, Ll/᩸۫ܿ;->֫(Lcom/google/android/material/textfield/TextInputLayout;Landroid/widget/EditText;)Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    .line 440
    :cond_0
    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 441
    invoke-static {p0}, Ll/ۘۚۢ;->֫(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const p0, 0x7f120834

    .line 443
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p3, p0}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 444
    invoke-virtual {p2}, Landroid/view/View;->requestFocus()Z

    return-void

    :cond_1
    const/4 p2, 0x0

    .line 447
    invoke-virtual {p3, p2}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    const/4 p2, 0x0

    .line 448
    invoke-virtual {p3, p2}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorEnabled(Z)V

    .line 450
    invoke-virtual {p4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    .line 451
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 449
    invoke-static {p2, p1, p0}, Ll/ۘۚۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 761
    invoke-static {}, Ll/֫ۚۢ;->ۜ()Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 p0, 0x1

    .line 762
    sput-boolean p0, Ll/᩸۫ܿ;->ܽ:Z

    .line 124
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object p0

    .line 125
    new-instance p1, Landroid/content/Intent;

    const-class p2, Ll/֫ۚۢ;

    invoke-direct {p1, p0, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    .line 454
    :cond_2
    invoke-virtual {p5}, Ll/֡ۚۢ;->dismiss()V

    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;)V
    .locals 2

    .line 144
    new-instance v0, Ll/ᩳ۫ܿ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->֫(Ljava/lang/Runnable;)V

    .line 145
    invoke-static {p0}, Ll/ۧ᩹ۡ;->ۧ(Landroid/content/Context;)V

    .line 252
    invoke-static {}, Ll/᩸۫ܿ;->᩷()V

    .line 253
    new-instance p0, Ll/֡۫ܿ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x3e8

    invoke-static {p0, v0, v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    .line 254
    new-instance p0, Ll/֡۫ܿ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0xbb8

    invoke-static {p0, v0, v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;I)V
    .locals 29

    move-object/from16 v0, p0

    .line 91
    new-instance v1, Ll/᩸۫ܿ;

    .line 97
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const v2, 0x7f0d00e8

    .line 98
    invoke-virtual {v0, v2}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v15

    const v2, 0x7f0a03b2

    .line 99
    invoke-virtual {v15, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Landroid/widget/TextView;

    const v2, 0x7f0a02a3

    .line 100
    invoke-virtual {v15, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Landroid/widget/TextView;

    const v2, 0x7f0a008b

    .line 101
    invoke-virtual {v15, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v14

    const v2, 0x7f0a0470

    .line 102
    invoke-virtual {v15, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Landroid/widget/ImageView;

    const v2, 0x7f0a0439

    .line 103
    invoke-virtual {v15, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v16

    const v2, 0x7f0a0421

    .line 104
    invoke-virtual {v15, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Landroid/widget/TextView;

    const v2, 0x7f0a0422

    .line 105
    invoke-virtual {v15, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    const v2, 0x7f0a0423

    .line 106
    invoke-virtual {v15, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Ll/᩹۫ܿ;

    const v2, 0x7f0a0288

    .line 107
    invoke-virtual {v15, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Landroid/widget/ImageView;

    const v2, 0x7f0a0466

    .line 108
    invoke-virtual {v15, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RadioGroup;

    const/16 v19, 0x0

    const/4 v3, 0x1

    move/from16 v4, p1

    if-ne v4, v3, :cond_0

    const/4 v4, 0x1

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    const/4 v8, 0x0

    .line 110
    :goto_0
    filled-new-array {v8}, [I

    move-result-object v7

    const/4 v4, 0x0

    .line 111
    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v6

    new-array v5, v3, [Z

    aput-boolean v3, v5, v19

    new-array v4, v3, [J

    const-wide/16 v20, 0x0

    aput-wide v20, v4, v19

    new-array v3, v3, [Ljava/lang/Runnable;

    .line 115
    new-instance v20, Ll/ۧ۫ܿ;

    move-object/from16 v21, v11

    const/4 v11, 0x0

    move-object/from16 p1, v3

    move-object/from16 v3, v20

    move-object/from16 v22, v4

    move-object/from16 v23, v5

    move-object v5, v10

    move-object/from16 v24, v6

    move-object/from16 v6, v23

    move-object/from16 v25, v7

    move-object v7, v9

    move/from16 v26, v8

    move-object/from16 v8, p1

    invoke-direct/range {v3 .. v8}, Ll/ۧ۫ܿ;-><init>([JLl/᩹۫ܿ;[ZLandroid/view/View;[Ljava/lang/Runnable;)V

    move-object/from16 v6, p1

    aput-object v20, v6, v19

    .line 124
    invoke-virtual/range {p0 .. p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v3

    invoke-virtual {v3, v15}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v4, 0x7f120818

    .line 125
    invoke-virtual {v3, v4, v11}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v4, 0x7f12081a

    .line 126
    invoke-virtual {v3, v4, v11}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v4, 0x7f12081b

    .line 127
    invoke-virtual {v3, v4, v11}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v4, Ll/ۢ۫ܿ;

    move-object/from16 v5, v23

    invoke-direct {v4, v5, v10, v6, v0}, Ll/ۢ۫ܿ;-><init>([ZLl/᩹۫ܿ;[Ljava/lang/Runnable;Ll/ۗܺ᩷;)V

    .line 128
    invoke-virtual {v3, v4}, Ll/᩵ۚۢ;->֫(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 136
    invoke-virtual {v3}, Ll/᩵ۚۢ;->֫()Ll/֡ۚۢ;

    move-result-object v3

    .line 137
    new-instance v4, Ll/ۡ۫ܿ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v3, v4}, Ll/֡ۚۢ;->֫(Landroid/content/DialogInterface$OnShowListener;)V

    .line 138
    invoke-virtual {v3}, Ll/֡ۚۢ;->᩷()V

    const v4, 0x7f0a02e9

    .line 141
    invoke-virtual {v15, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    .line 140
    invoke-static {v4, v0, v3}, Ll/ۛ᩸ۡ;->֫(Landroid/view/View;Ll/ۗܺ᩷;Ll/֡ۚۢ;)Ll/ۤ᩸ۡ;

    move-result-object v4

    .line 142
    invoke-static {v12}, Ll/ܳ᩹ۡ;->֫(Landroid/widget/TextView;)V

    .line 143
    new-instance v7, Ll/ܺ۫ܿ;

    invoke-direct {v7, v0}, Ll/ܺ۫ܿ;-><init>(Ll/ۗܺ᩷;)V

    invoke-virtual {v14, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 148
    new-instance v7, Ll/ۖ۫ܿ;

    move-object/from16 v11, v24

    move-object/from16 v8, v25

    invoke-direct {v7, v1, v0, v8, v11}, Ll/ۖ۫ܿ;-><init>(Ll/᩸۫ܿ;Ll/ۗܺ᩷;[I[Ljava/lang/String;)V

    invoke-virtual {v13, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 149
    invoke-virtual {v3}, Ll/֡ۚۢ;->ܽ()Landroid/widget/Button;

    move-result-object v7

    new-instance v11, Ll/ۘ۫ܿ;

    invoke-direct {v11, v1, v0, v8}, Ll/ۘ۫ܿ;-><init>(Ll/᩸۫ܿ;Ll/ۗܺ᩷;[I)V

    invoke-virtual {v7, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 150
    invoke-virtual {v3}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v11

    .line 151
    invoke-virtual {v3}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v19

    .line 152
    new-instance v0, Ll/᩵ۗܳ;

    const/4 v3, 0x1

    invoke-direct {v0, v3, v8}, Ll/᩵ۗܳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v11, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    move/from16 v0, v26

    if-ne v0, v3, :cond_1

    const v0, 0x7f0a0465

    goto :goto_1

    :cond_1
    const v0, 0x7f0a0467

    .line 159
    :goto_1
    invoke-virtual {v2, v0}, Landroid/widget/RadioGroup;->check(I)V

    .line 160
    new-instance v0, Ll/ᩴ۫ܿ;

    invoke-direct {v0, v8}, Ll/ᩴ۫ܿ;-><init>([I)V

    invoke-virtual {v2, v0}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 168
    new-instance v7, Ll/᩵۫ܿ;

    move-object v0, v7

    move-object v2, v5

    move-object v3, v4

    move-object v4, v8

    move-object v5, v10

    move-object v10, v7

    move-object v7, v9

    move-object/from16 v8, v19

    move-object v9, v11

    move-object v11, v10

    move-object/from16 v10, v18

    move-object/from16 v27, v11

    move-object/from16 v18, v24

    move-object/from16 v11, v21

    move-object/from16 v19, v13

    move-object/from16 v13, v22

    move-object/from16 v20, v14

    move-object/from16 v14, v17

    move-object/from16 v28, v15

    move-object/from16 v15, v19

    move-object/from16 v17, v18

    move-object/from16 v18, v20

    invoke-direct/range {v0 .. v18}, Ll/᩵۫ܿ;-><init>(Ll/᩸۫ܿ;[ZLl/ۤ᩸ۡ;[ILl/᩹۫ܿ;[Ljava/lang/Runnable;Landroid/view/View;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;[JLandroid/widget/TextView;Landroid/widget/ImageView;Landroid/view/View;[Ljava/lang/String;Landroid/view/View;)V

    move-object/from16 v1, v27

    move-object/from16 v0, v28

    .line 212
    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 745
    sget-object v0, Ll/᩸۫ܿ;->᩻:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 214
    invoke-static {}, Ll/᩸۫ܿ;->᩷()V

    return-void
.end method

.method public static ֫([ZLl/᩹۫ܿ;[Ljava/lang/Runnable;Ll/ۗܺ᩷;)V
    .locals 1

    const/4 v0, 0x0

    .line 129
    aput-boolean v0, p0, v0

    .line 130
    aget-object p0, p2, v0

    invoke-virtual {p1, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 877
    sget p0, Ll/᩸۫ܿ;->ܿ:I

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 p0, p0, -0x1

    .line 880
    sput p0, Ll/᩸۫ܿ;->ܿ:I

    if-nez p0, :cond_1

    .line 882
    sget-object p0, Ll/᩸۫ܿ;->ᩳ:Ll/֡ۖۢ;

    invoke-virtual {p0}, Ll/֡ۖۢ;->֫()V

    const/4 p0, 0x0

    .line 883
    sput-object p0, Ll/᩸۫ܿ;->ᩳ:Ll/֡ۖۢ;

    .line 884
    sget-object p0, Ll/᩸۫ܿ;->ܳ:Landroid/content/BroadcastReceiver;

    invoke-static {p0}, Ll/ۙ᩸᩷;->֫(Landroid/content/BroadcastReceiver;)V

    .line 132
    :cond_1
    :goto_0
    instance-of p0, p3, Ll/ܶ᩶᩷;

    if-eqz p0, :cond_2

    .line 133
    invoke-virtual {p3}, Landroid/app/Activity;->finish()V

    :cond_2
    return-void
.end method

.method public static ֫(ILjava/lang/String;Z)Z
    .locals 0

    if-nez p0, :cond_2

    if-eqz p2, :cond_2

    .line 279
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    .line 282
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object p0

    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "http://"

    .line 283
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "https://"

    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(Lcom/google/android/material/textfield/TextInputLayout;Landroid/widget/EditText;)Z
    .locals 2

    .line 731
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩸ۗۡ;->֫(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const v0, 0x7f12085b

    .line 732
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 733
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    return v1

    :cond_0
    const/4 p1, 0x0

    .line 736
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 737
    invoke-virtual {p0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorEnabled(Z)V

    const/4 p0, 0x1

    return p0
.end method

.method public static bridge synthetic ۜ()V
    .locals 0

    .line 0
    invoke-static {}, Ll/᩸۫ܿ;->᩷()V

    return-void
.end method

.method public static ۧ()V
    .locals 3

    .line 857
    sget v0, Ll/᩸۫ܿ;->ܿ:I

    if-nez v0, :cond_0

    .line 858
    new-instance v0, Ll/֡ۖۢ;

    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v1

    new-instance v2, Ll/֡۫ܿ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-direct {v0, v1, v2}, Ll/֡ۖۢ;-><init>(Landroid/content/ContextWrapper;Ljava/lang/Runnable;)V

    sput-object v0, Ll/᩸۫ܿ;->ᩳ:Ll/֡ۖۢ;

    .line 860
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "bin.mt.remote.RemoteServerService.ACTION_STARTED"

    .line 861
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "bin.mt.remote.RemoteServerService.ACTION_STOPPED"

    .line 862
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "bin.mt.remote.RemoteServerService.ACTION_FAILED_TO_START"

    .line 863
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "bin.mt.remote.RemoteServerService.ACTION_PAIRING_CODE_CHANGED"

    .line 864
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "bin.mt.plus.FTP_SERVER_STARTED"

    .line 865
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "bin.mt.plus.FTP_SERVER_STOPPED"

    .line 866
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "bin.mt.plus.FTP_SERVER_FAILED_TO_START"

    .line 867
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 868
    sget-object v1, Ll/᩸۫ܿ;->ܳ:Landroid/content/BroadcastReceiver;

    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 870
    :cond_0
    sget v0, Ll/᩸۫ܿ;->ܿ:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Ll/᩸۫ܿ;->ܿ:I

    return-void
.end method

.method public static bridge synthetic ܳ()V
    .locals 1

    const/4 v0, 0x0

    .line 0
    sput-boolean v0, Ll/᩸۫ܿ;->ۧ:Z

    return-void
.end method

.method public static synthetic ܽ()V
    .locals 0

    .line 0
    invoke-static {}, Ll/᩸۫ܿ;->᩷()V

    return-void
.end method

.method public static bridge synthetic ܿ()Z
    .locals 1

    .line 0
    sget-boolean v0, Ll/᩸۫ܿ;->ܽ:Z

    return v0
.end method

.method public static bridge synthetic ᩳ()Z
    .locals 1

    .line 0
    sget-boolean v0, Ll/᩸۫ܿ;->ۧ:Z

    return v0
.end method

.method public static ᩷()V
    .locals 2

    .line 752
    sget-object v0, Ll/᩸۫ܿ;->᩻:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    .line 753
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static bridge synthetic ᩻()V
    .locals 1

    const/4 v0, 0x0

    .line 0
    sput-boolean v0, Ll/᩸۫ܿ;->ܽ:Z

    return-void
.end method
