.class public final Ll/ܳᩴ᩻;
.super Ll/ۗ᩻᩻;
.source "1AFL"


# instance fields
.field public ֫֫:Ljava/lang/String;

.field public ۜ֫:Ljava/lang/String;

.field public ۢ֫:Ljava/lang/String;

.field public ۧ֫:Ljava/lang/String;

.field public ܳ֫:Ljava/lang/String;

.field public ܽ֫:Ljava/lang/String;

.field public ܿ֫:Ljava/lang/String;

.field public ᩳ֫:I

.field public ᩷֫:I

.field public ᩻֫:Z


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 63
    invoke-direct {p0, p1}, Ll/ۗ᩻᩻;-><init>(I)V

    const-string p1, ""

    .line 50
    iput-object p1, p0, Ll/ܳᩴ᩻;->ۧ֫:Ljava/lang/String;

    const/16 v0, 0x16

    .line 51
    iput v0, p0, Ll/ܳᩴ᩻;->᩷֫:I

    const-string v0, "root"

    .line 52
    iput-object v0, p0, Ll/ܳᩴ᩻;->ۢ֫:Ljava/lang/String;

    .line 53
    iput-object p1, p0, Ll/ܳᩴ᩻;->ۜ֫:Ljava/lang/String;

    .line 54
    iput-object p1, p0, Ll/ܳᩴ᩻;->ܿ֫:Ljava/lang/String;

    .line 55
    iput-object p1, p0, Ll/ܳᩴ᩻;->ܳ֫:Ljava/lang/String;

    const/4 v0, 0x0

    .line 56
    iput-boolean v0, p0, Ll/ܳᩴ᩻;->᩻֫:Z

    const-string v0, "UTF-8"

    .line 57
    iput-object v0, p0, Ll/ܳᩴ᩻;->֫֫:Ljava/lang/String;

    const/4 v0, -0x1

    .line 59
    iput v0, p0, Ll/ܳᩴ᩻;->ᩳ֫:I

    .line 60
    iput-object p1, p0, Ll/ܳᩴ᩻;->ܽ֫:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lbin/mt/json/JSONObject;)V
    .locals 3

    const-string v0, "rk"

    const-string v1, "3"

    .line 84
    invoke-static {p1, v0, v1}, Ll/ۗ᩻᩻;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ip"

    const-string v1, "8"

    .line 85
    invoke-static {p1, v0, v1}, Ll/ۗ᩻᩻;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "hs"

    const-string v1, "a"

    .line 86
    invoke-static {p1, v0, v1}, Ll/ۗ᩻᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mt"

    const-string v1, "b"

    .line 87
    invoke-static {p1, v0, v1}, Ll/ۗ᩻᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    invoke-direct {p0, p1}, Ll/ۗ᩻᩻;-><init>(Lbin/mt/json/JSONObject;)V

    const-string v0, ""

    .line 50
    iput-object v0, p0, Ll/ܳᩴ᩻;->ۧ֫:Ljava/lang/String;

    const/16 v1, 0x16

    .line 51
    iput v1, p0, Ll/ܳᩴ᩻;->᩷֫:I

    const-string v1, "root"

    .line 52
    iput-object v1, p0, Ll/ܳᩴ᩻;->ۢ֫:Ljava/lang/String;

    .line 53
    iput-object v0, p0, Ll/ܳᩴ᩻;->ۜ֫:Ljava/lang/String;

    .line 54
    iput-object v0, p0, Ll/ܳᩴ᩻;->ܿ֫:Ljava/lang/String;

    .line 55
    iput-object v0, p0, Ll/ܳᩴ᩻;->ܳ֫:Ljava/lang/String;

    const/4 v1, 0x0

    .line 56
    iput-boolean v1, p0, Ll/ܳᩴ᩻;->᩻֫:Z

    const-string v1, "UTF-8"

    .line 57
    iput-object v1, p0, Ll/ܳᩴ᩻;->֫֫:Ljava/lang/String;

    const/4 v1, -0x1

    .line 59
    iput v1, p0, Ll/ܳᩴ᩻;->ᩳ֫:I

    .line 60
    iput-object v0, p0, Ll/ܳᩴ᩻;->ܽ֫:Ljava/lang/String;

    const-string v1, "1"

    .line 68
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ܳᩴ᩻;->ۧ֫:Ljava/lang/String;

    const-string v1, "2"

    .line 69
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Ll/ܳᩴ᩻;->᩷֫:I

    const-string v1, "4"

    .line 70
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ܳᩴ᩻;->ۢ֫:Ljava/lang/String;

    const-string v1, "5"

    .line 71
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ܳᩴ᩻;->ۜ֫:Ljava/lang/String;

    const-string v1, "6"

    .line 72
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ܳᩴ᩻;->ܿ֫:Ljava/lang/String;

    const-string v1, "c"

    .line 73
    invoke-virtual {p1, v1, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ܳᩴ᩻;->ܳ֫:Ljava/lang/String;

    const-string v1, "7"

    .line 74
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Ll/ܳᩴ᩻;->᩻֫:Z

    const-string v1, "9"

    .line 75
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ܳᩴ᩻;->֫֫:Ljava/lang/String;

    const-string v1, "e"

    .line 76
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->contains(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 77
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Ll/ܳᩴ᩻;->ᩳ֫:I

    const-string v1, "f"

    .line 78
    invoke-virtual {p1, v1, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܳᩴ᩻;->ܽ֫:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public static ֫(Landroid/widget/EditText;Landroid/widget/EditText;Ll/ۗۘ;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Ll/᩵ۘ᩻;Ll/ۗۘ;Ll/ۗۘ;Ll/ۗۘ;Ll/ۙ᩻᩻;)Ll/ܳᩴ᩻;
    .locals 5

    .line 359
    invoke-static {p0}, Ll/ۗ᩻᩻;->ۧ(Landroid/widget/EditText;)Z

    move-result v0

    if-eqz v0, :cond_7

    const v0, 0x7f1206d3

    move-object v1, p1

    .line 411
    invoke-static {p1, v0}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;I)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 362
    :cond_0
    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_2

    const v0, 0x7f1206d0

    move-object v2, p3

    .line 419
    invoke-static {p3, v0}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;I)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_2

    :cond_1
    move-object v3, p4

    goto :goto_0

    :cond_2
    move-object v2, p3

    const v0, 0x7f1206d1

    move-object v3, p4

    .line 415
    invoke-static {p4, v0}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;I)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_2

    .line 367
    :cond_3
    :goto_0
    invoke-static {p5}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_2

    .line 370
    :cond_4
    new-instance v0, Ll/ܳᩴ᩻;

    const/4 v4, -0x1

    invoke-direct {v0, v4}, Ll/ܳᩴ᩻;-><init>(I)V

    .line 363
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    .line 371
    iput-object v4, v0, Ll/ܳᩴ᩻;->ۧ֫:Ljava/lang/String;

    .line 363
    invoke-virtual {p6}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    .line 356
    :try_start_0
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const/16 v4, 0x16

    .line 372
    :goto_1
    iput v4, v0, Ll/ܳᩴ᩻;->᩷֫:I

    .line 363
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 373
    iput-object v1, v0, Ll/ܳᩴ᩻;->ۢ֫:Ljava/lang/String;

    .line 363
    invoke-virtual {p4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 374
    iput-object v1, v0, Ll/ܳᩴ᩻;->ۜ֫:Ljava/lang/String;

    .line 363
    invoke-virtual {p3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 375
    iput-object v1, v0, Ll/ܳᩴ᩻;->ܿ֫:Ljava/lang/String;

    .line 363
    invoke-virtual {p7}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 376
    iput-object v1, v0, Ll/ܳᩴ᩻;->ܳ֫:Ljava/lang/String;

    .line 377
    iget-object v1, v0, Ll/ܳᩴ᩻;->ܿ֫:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x5000

    if-le v1, v2, :cond_5

    .line 378
    iget-object v1, v0, Ll/ܳᩴ᩻;->ܿ֫:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ܳᩴ᩻;->ܿ֫:Ljava/lang/String;

    .line 380
    :cond_5
    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    iput-boolean v1, v0, Ll/ܳᩴ᩻;->᩻֫:Z

    .line 363
    invoke-virtual {p8}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 381
    iput-object v1, v0, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    .line 382
    iget-object v1, v0, Ll/ܳᩴ᩻;->ۧ֫:Ljava/lang/String;

    move-object v2, p9

    invoke-static {p9, v1}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    const-string v1, "UTF-8"

    move-object v2, p5

    .line 383
    invoke-static {p5, v1}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ܳᩴ᩻;->֫֫:Ljava/lang/String;

    .line 384
    invoke-virtual {p10}, Ll/᩵ۘ᩻;->֫()Ll/ۖۘ᩻;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 386
    iget v2, v1, Ll/ۗ᩻᩻;->᩶:I

    iput v2, v0, Ll/ܳᩴ᩻;->ᩳ֫:I

    .line 387
    invoke-virtual {v1}, Ll/ۖۘ᩻;->֫()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ܳᩴ᩻;->ܽ֫:Ljava/lang/String;

    .line 389
    :cond_6
    invoke-virtual/range {p11 .. p11}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    iput-boolean v1, v0, Ll/ۗ᩻᩻;->᩹:Z

    .line 390
    invoke-virtual/range {p12 .. p12}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    iput-boolean v1, v0, Ll/ۗ᩻᩻;->ۛ:Z

    .line 391
    invoke-virtual/range {p13 .. p13}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    iput-boolean v1, v0, Ll/ۗ᩻᩻;->۟:Z

    move-object/from16 v1, p14

    .line 392
    invoke-virtual {v0, v1}, Ll/ۗ᩻᩻;->ۧ(Ll/ۗ᩻᩻;)V

    return-object v0

    :cond_7
    :goto_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public static ֫(Ll/ۗܺ᩷;Ll/ܳᩴ᩻;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const v2, 0x7f0d00f6

    .line 235
    invoke-virtual {v0, v2}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f0a02aa

    .line 236
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v15, v3

    check-cast v15, Ll/᩵ۘ᩻;

    const v3, 0x7f0a0631

    .line 237
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const v4, 0x7f0a026d

    .line 238
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Landroid/widget/EditText;

    const v4, 0x7f0a0446

    .line 239
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Landroid/widget/EditText;

    const v4, 0x7f0a0670

    .line 240
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Landroid/widget/EditText;

    const v4, 0x7f0a0429

    .line 241
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Landroid/widget/EditText;

    const v4, 0x7f0a02ad

    .line 242
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Landroid/widget/EditText;

    const v4, 0x7f0a02ae

    .line 243
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v12, v4

    check-cast v12, Landroid/widget/EditText;

    const v4, 0x7f0a04a5

    .line 244
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v13, v4

    check-cast v13, Landroid/widget/EditText;

    const v4, 0x7f0a04a4

    .line 245
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v14, v4

    check-cast v14, Landroid/widget/EditText;

    const v4, 0x7f0a00d7

    .line 246
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Landroid/widget/EditText;

    const v4, 0x7f0a02ed

    .line 247
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Ll/ۗۘ;

    const v4, 0x7f0a025f

    .line 248
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Ll/ۗۘ;

    move-object/from16 v16, v13

    const v13, 0x7f0a03d2

    .line 249
    invoke-virtual {v2, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Ll/ۗۘ;

    move-object/from16 v17, v7

    const v7, 0x7f0a059e

    .line 250
    invoke-virtual {v2, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Ll/ۗۘ;

    move-object/from16 v18, v10

    const v10, 0x7f0a05d0

    .line 251
    invoke-virtual {v2, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Lcom/google/android/material/textfield/TextInputLayout;

    move-object/from16 v19, v7

    .line 252
    new-instance v7, Ll/۫ۘ᩻;

    invoke-direct {v7, v0, v5, v11, v14}, Ll/۫ۘ᩻;-><init>(Ll/ۗܺ᩷;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;)V

    invoke-virtual {v10, v7}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 260
    iget v7, v1, Ll/ܳᩴ᩻;->ᩳ֫:I

    const/4 v10, -0x1

    if-eq v7, v10, :cond_0

    .line 261
    invoke-static {v7}, Ll/۫᩻᩻;->ᩳ(I)Ll/ۖۘ᩻;

    move-result-object v7

    if-nez v7, :cond_1

    .line 263
    iget-object v7, v1, Ll/ܳᩴ᩻;->ܽ֫:Ljava/lang/String;

    invoke-static {v7}, Ll/۫᩻᩻;->ۧ(Ljava/lang/String;)Ll/ۖۘ᩻;

    move-result-object v7

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    .line 266
    :cond_1
    :goto_0
    invoke-virtual {v15, v7}, Ll/᩵ۘ᩻;->֫(Ll/ۖۘ᩻;)V

    const/high16 v7, 0x40c00000    # 6.0f

    .line 267
    invoke-static {v7}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v7

    .line 74
    invoke-virtual {v15}, Landroid/view/View;->getPaddingLeft()I

    move-result v10

    .line 75
    invoke-virtual {v15}, Landroid/view/View;->getPaddingTop()I

    move-result v20

    add-int v7, v20, v7

    move-object/from16 v20, v14

    .line 76
    invoke-virtual {v15}, Landroid/view/View;->getPaddingRight()I

    move-result v14

    move-object/from16 v21, v13

    .line 77
    invoke-virtual {v15}, Landroid/view/View;->getPaddingBottom()I

    move-result v13

    .line 78
    invoke-virtual {v15, v10, v7, v14, v13}, Landroid/view/View;->setPadding(IIII)V

    const v7, 0x7f0a00a4

    .line 269
    invoke-virtual {v2, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    const v10, 0x7f0a02ee

    .line 270
    invoke-virtual {v2, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    const v13, 0x7f0a05d4

    .line 271
    invoke-virtual {v2, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v13

    const v14, 0x7f0a062d

    .line 272
    invoke-virtual {v2, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v14

    check-cast v14, Landroid/widget/TextView;

    invoke-static {v0, v14, v1}, Ll/ۙ᩻᩻;->֫(Ll/ۗܺ᩷;Landroid/widget/TextView;Ll/ۗ᩻᩻;)Ll/ۙ᩻᩻;

    move-result-object v22

    .line 274
    iget v14, v1, Ll/ۗ᩻᩻;->᩶:I

    move-object/from16 v23, v15

    const/4 v15, -0x1

    if-ne v14, v15, :cond_2

    const v14, 0x7f1205ad

    goto :goto_1

    :cond_2
    const v14, 0x7f1202dd

    :goto_1
    invoke-static {v14}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v14

    const-string v15, " SFTP"

    invoke-virtual {v14, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v3, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 275
    iget-object v3, v1, Ll/ܳᩴ᩻;->ۧ֫:Ljava/lang/String;

    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 276
    iget v3, v1, Ll/ܳᩴ᩻;->᩷֫:I

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 277
    iget-object v3, v1, Ll/ܳᩴ᩻;->ۢ֫:Ljava/lang/String;

    invoke-virtual {v6, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 278
    iget-object v3, v1, Ll/ܳᩴ᩻;->ۜ֫:Ljava/lang/String;

    invoke-virtual {v9, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 279
    iget-object v3, v1, Ll/ܳᩴ᩻;->ܿ֫:Ljava/lang/String;

    invoke-virtual {v8, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 280
    iget-object v3, v1, Ll/ܳᩴ᩻;->ܳ֫:Ljava/lang/String;

    invoke-virtual {v12, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 281
    iget-boolean v3, v1, Ll/ۗ᩻᩻;->᩹:Z

    invoke-virtual {v4, v3}, Ll/ۗۘ;->setChecked(Z)V

    .line 282
    iget-boolean v3, v1, Ll/ۗ᩻᩻;->ۛ:Z

    move-object/from16 v14, v21

    invoke-virtual {v14, v3}, Ll/ۗۘ;->setChecked(Z)V

    .line 283
    iget-boolean v3, v1, Ll/ۗ᩻᩻;->۟:Z

    move-object/from16 v15, v19

    invoke-virtual {v15, v3}, Ll/ۗۘ;->setChecked(Z)V

    .line 588
    new-instance v3, Ll/֫۬ܳ;

    move-object/from16 v19, v4

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Ll/֫۬ܳ;-><init>(I)V

    invoke-virtual {v14, v3}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    move-object/from16 v3, v18

    .line 285
    invoke-static {v3, v0}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;Ll/ۗܺ᩷;)V

    .line 286
    new-instance v4, Ll/ۤۘ᩻;

    invoke-direct {v4, v10, v13}, Ll/ۤۘ᩻;-><init>(Landroid/view/View;Landroid/view/View;)V

    .line 295
    iget-boolean v10, v1, Ll/ܳᩴ᩻;->᩻֫:Z

    move-object/from16 v13, v17

    invoke-virtual {v4, v13, v10}, Ll/ۤۘ᩻;->onCheckedChanged(Landroid/widget/CompoundButton;Z)V

    .line 296
    iget-boolean v10, v1, Ll/ܳᩴ᩻;->᩻֫:Z

    invoke-virtual {v13, v10}, Ll/ۗۘ;->setChecked(Z)V

    .line 297
    invoke-virtual {v13, v4}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 299
    iget-object v4, v1, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    move-object/from16 v10, v16

    invoke-virtual {v10, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 300
    iget-object v4, v1, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    move-object/from16 v14, v20

    invoke-virtual {v14, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 301
    iget-object v4, v1, Ll/ܳᩴ᩻;->֫֫:Ljava/lang/String;

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 302
    invoke-static {v5, v14}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;Landroid/widget/EditText;)V

    .line 303
    invoke-virtual/range {p0 .. p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v4

    invoke-virtual {v4, v2}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v2, 0x7f1205fc

    const/4 v10, 0x0

    .line 304
    invoke-virtual {v4, v2, v10}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v2, 0x7f12015e

    .line 305
    invoke-virtual {v4, v2, v10}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v2, 0x7f1206b8

    .line 306
    invoke-virtual {v4, v2, v10}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    const/4 v2, 0x0

    .line 307
    invoke-virtual {v4, v2}, Ll/᩵ۚۢ;->֫(Z)V

    .line 308
    invoke-virtual {v4}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v2

    .line 309
    invoke-static {v2}, Ll/ۚۗܿ;->֫(Ll/֡ۚۢ;)V

    .line 311
    instance-of v4, v0, Lbin/mt/plus/Main;

    if-eqz v4, :cond_3

    move-object v4, v0

    check-cast v4, Lbin/mt/plus/Main;

    .line 312
    invoke-virtual {v4}, Lbin/mt/plus/Main;->ᩳ֫()Ll/ۚۡ֫;

    move-result-object v10

    .line 313
    invoke-virtual {v4}, Lbin/mt/plus/Main;->ܽ֫()Ll/ۛ᩵᩷;

    move-result-object v4

    .line 314
    invoke-virtual {v10, v2}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;)V

    move-object/from16 v17, v15

    const/4 v15, 0x0

    .line 315
    invoke-virtual {v10, v15}, Ll/ۚۡ֫;->ۧ(Ljava/lang/Object;)V

    .line 316
    new-instance v15, Ll/ۛۘ᩻;

    invoke-direct {v15, v8, v0}, Ll/ۛۘ᩻;-><init>(Landroid/widget/EditText;Ll/ۗܺ᩷;)V

    invoke-virtual {v10, v2, v15}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    .line 351
    new-instance v10, Ll/ۧܺ᩷;

    const/4 v15, 0x1

    invoke-direct {v10, v15, v4}, Ll/ۧܺ᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v7, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_3
    move-object/from16 v17, v15

    const/4 v4, 0x0

    .line 353
    invoke-virtual {v7, v4}, Landroid/view/View;->setEnabled(Z)V

    const/4 v4, 0x0

    .line 354
    invoke-virtual {v7, v4}, Landroid/view/View;->setAlpha(F)V

    .line 357
    :goto_2
    invoke-static {v5}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    .line 358
    new-instance v15, Ll/ۨۘ᩻;

    move-object/from16 v18, v19

    move-object v4, v15

    move-object/from16 v19, v17

    move-object v7, v13

    move-object/from16 v13, v16

    move-object v10, v3

    move-object/from16 v3, v21

    move-object v0, v15

    move-object/from16 v15, v23

    move-object/from16 v16, v18

    move-object/from16 v17, v3

    move-object/from16 v18, v19

    move-object/from16 v19, v22

    invoke-direct/range {v4 .. v19}, Ll/ۨۘ᩻;-><init>(Landroid/widget/EditText;Landroid/widget/EditText;Ll/ۗۘ;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Ll/᩵ۘ᩻;Ll/ۗۘ;Ll/ۗۘ;Ll/ۗۘ;Ll/ۙ᩻᩻;)V

    .line 395
    invoke-virtual {v2}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v3

    new-instance v4, Ll/᩺ۘ᩻;

    invoke-direct {v4, v0, v1, v2}, Ll/᩺ۘ᩻;-><init>(Ll/ۨۘ᩻;Ll/ܳᩴ᩻;Ll/֡ۚۢ;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 410
    invoke-virtual {v2}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v1

    new-instance v2, Ll/ܰۘ᩻;

    move-object v3, v0

    move-object/from16 v0, p0

    invoke-direct {v2, v3, v0}, Ll/ܰۘ᩻;-><init>(Ll/ۨۘ᩻;Ll/ۗܺ᩷;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۨۘ᩻;Ll/ܳᩴ᩻;Ll/֡ۚۢ;)V
    .locals 2

    .line 396
    invoke-virtual {p0}, Ll/ۨۘ᩻;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܳᩴ᩻;

    if-nez p0, :cond_0

    return-void

    .line 400
    :cond_0
    iget v0, p1, Ll/ۗ᩻᩻;->᩶:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 401
    new-instance p1, Ll/ܳᩴ᩻;

    invoke-static {}, Ll/ۗ᩻᩻;->᩷()I

    move-result v0

    invoke-direct {p1, v0}, Ll/ܳᩴ᩻;-><init>(I)V

    .line 402
    invoke-virtual {p1, p0}, Ll/ܳᩴ᩻;->֫(Ll/ۗ᩻᩻;)V

    .line 403
    invoke-static {p1}, Ll/۫᩻᩻;->֫(Ll/ۗ᩻᩻;)V

    goto :goto_0

    .line 405
    :cond_1
    invoke-virtual {p1, p0}, Ll/ܳᩴ᩻;->֫(Ll/ۗ᩻᩻;)V

    .line 406
    invoke-static {}, Ll/۫᩻᩻;->֫()V

    .line 408
    :goto_0
    invoke-virtual {p2}, Ll/֡ۚۢ;->dismiss()V

    return-void
.end method

.method public static ۧ(Ll/ۗܺ᩷;)V
    .locals 2

    .line 230
    new-instance v0, Ll/ܳᩴ᩻;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Ll/ܳᩴ᩻;-><init>(I)V

    invoke-static {p0, v0}, Ll/ܳᩴ᩻;->֫(Ll/ۗܺ᩷;Ll/ܳᩴ᩻;)V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    .line 177
    const-class v2, Ll/ܳᩴ᩻;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 178
    :cond_1
    invoke-super {p0, p1}, Ll/ۗ᩻᩻;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    .line 180
    :cond_2
    check-cast p1, Ll/ܳᩴ᩻;

    .line 181
    iget v2, p0, Ll/ܳᩴ᩻;->᩷֫:I

    iget v3, p1, Ll/ܳᩴ᩻;->᩷֫:I

    if-ne v2, v3, :cond_3

    iget-boolean v2, p0, Ll/ܳᩴ᩻;->᩻֫:Z

    iget-boolean v3, p1, Ll/ܳᩴ᩻;->᩻֫:Z

    if-ne v2, v3, :cond_3

    iget-object v2, p0, Ll/ܳᩴ᩻;->ۧ֫:Ljava/lang/String;

    iget-object v3, p1, Ll/ܳᩴ᩻;->ۧ֫:Ljava/lang/String;

    .line 183
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ll/ܳᩴ᩻;->ۢ֫:Ljava/lang/String;

    iget-object v3, p1, Ll/ܳᩴ᩻;->ۢ֫:Ljava/lang/String;

    .line 184
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ll/ܳᩴ᩻;->ۜ֫:Ljava/lang/String;

    iget-object v3, p1, Ll/ܳᩴ᩻;->ۜ֫:Ljava/lang/String;

    .line 185
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ll/ܳᩴ᩻;->ܿ֫:Ljava/lang/String;

    iget-object v3, p1, Ll/ܳᩴ᩻;->ܿ֫:Ljava/lang/String;

    .line 186
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ll/ܳᩴ᩻;->ܳ֫:Ljava/lang/String;

    iget-object v3, p1, Ll/ܳᩴ᩻;->ܳ֫:Ljava/lang/String;

    .line 187
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ll/ܳᩴ᩻;->֫֫:Ljava/lang/String;

    iget-object v3, p1, Ll/ܳᩴ᩻;->֫֫:Ljava/lang/String;

    .line 188
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget v2, p0, Ll/ܳᩴ᩻;->ᩳ֫:I

    .line 189
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Ll/ܳᩴ᩻;->ᩳ֫:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ll/ܳᩴ᩻;->ܽ֫:Ljava/lang/String;

    iget-object p1, p1, Ll/ܳᩴ᩻;->ܽ֫:Ljava/lang/String;

    .line 190
    invoke-static {v2, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v0

    :cond_3
    :goto_0
    return v1
.end method

.method public final getIcon()Ll/᩶ۖܳ;
    .locals 1

    .line 216
    sget-object v0, Ll/᩶ۖܳ;->֨֫:Ll/᩶ۖܳ;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 140
    iget-object v0, p0, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    .line 195
    invoke-super {p0}, Ll/ۗ᩻᩻;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    .line 196
    iget-object v2, p0, Ll/ܳᩴ᩻;->ۧ֫:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 197
    iget v2, p0, Ll/ܳᩴ᩻;->᩷֫:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 198
    iget-object v2, p0, Ll/ܳᩴ᩻;->ۢ֫:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 199
    iget-object v2, p0, Ll/ܳᩴ᩻;->ۜ֫:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 200
    iget-object v2, p0, Ll/ܳᩴ᩻;->ܿ֫:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 201
    iget-object v2, p0, Ll/ܳᩴ᩻;->ܳ֫:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 202
    iget-boolean v2, p0, Ll/ܳᩴ᩻;->᩻֫:Z

    if-eqz v2, :cond_0

    const/16 v2, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v2, 0x4d5

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 203
    iget-object v2, p0, Ll/ܳᩴ᩻;->֫֫:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 204
    iget v1, p0, Ll/ܳᩴ᩻;->ᩳ֫:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 205
    iget-object v1, p0, Ll/ܳᩴ᩻;->ܽ֫:Ljava/lang/String;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final ֫()Ljava/lang/String;
    .locals 4

    .line 93
    iget v0, p0, Ll/ܳᩴ᩻;->᩷֫:I

    const/16 v1, 0x16

    const-string v2, "@"

    const-string v3, "sftp://"

    if-ne v0, v1, :cond_0

    .line 94
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܳᩴ᩻;->ۢ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܳᩴ᩻;->ۧ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 96
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܳᩴ᩻;->ۢ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܳᩴ᩻;->ۧ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ܳᩴ᩻;->᩷֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)Ll/ۗۢ᩻;
    .locals 2

    .line 211
    new-instance v0, Ll/ᩴᩴ᩻;

    invoke-virtual {p0}, Ll/ۗ᩻᩻;->clone()Ll/ۗ᩻᩻;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ll/ᩴᩴ᩻;-><init>(ILl/ۗ᩻᩻;)V

    return-object v0
.end method

.method public final ֫(Ll/ۗܺ᩷;)V
    .locals 0

    .line 226
    invoke-static {p1, p0}, Ll/ܳᩴ᩻;->֫(Ll/ۗܺ᩷;Ll/ܳᩴ᩻;)V

    return-void
.end method

.method public final ֫(Ll/ۗ᩻᩻;)V
    .locals 1

    .line 153
    invoke-super {p0, p1}, Ll/ۗ᩻᩻;->֫(Ll/ۗ᩻᩻;)V

    .line 154
    instance-of v0, p1, Ll/ܳᩴ᩻;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ܳᩴ᩻;

    .line 157
    iget-object v0, p1, Ll/ܳᩴ᩻;->ۧ֫:Ljava/lang/String;

    iput-object v0, p0, Ll/ܳᩴ᩻;->ۧ֫:Ljava/lang/String;

    .line 158
    iget v0, p1, Ll/ܳᩴ᩻;->᩷֫:I

    iput v0, p0, Ll/ܳᩴ᩻;->᩷֫:I

    .line 159
    iget-object v0, p1, Ll/ܳᩴ᩻;->ۢ֫:Ljava/lang/String;

    iput-object v0, p0, Ll/ܳᩴ᩻;->ۢ֫:Ljava/lang/String;

    .line 160
    iget-object v0, p1, Ll/ܳᩴ᩻;->ۜ֫:Ljava/lang/String;

    iput-object v0, p0, Ll/ܳᩴ᩻;->ۜ֫:Ljava/lang/String;

    .line 161
    iget-object v0, p1, Ll/ܳᩴ᩻;->ܿ֫:Ljava/lang/String;

    iput-object v0, p0, Ll/ܳᩴ᩻;->ܿ֫:Ljava/lang/String;

    .line 162
    iget-object v0, p1, Ll/ܳᩴ᩻;->ܳ֫:Ljava/lang/String;

    iput-object v0, p0, Ll/ܳᩴ᩻;->ܳ֫:Ljava/lang/String;

    .line 163
    iget-boolean v0, p1, Ll/ܳᩴ᩻;->᩻֫:Z

    iput-boolean v0, p0, Ll/ܳᩴ᩻;->᩻֫:Z

    .line 164
    iget-object v0, p1, Ll/ܳᩴ᩻;->֫֫:Ljava/lang/String;

    iput-object v0, p0, Ll/ܳᩴ᩻;->֫֫:Ljava/lang/String;

    .line 165
    iget v0, p1, Ll/ܳᩴ᩻;->ᩳ֫:I

    iput v0, p0, Ll/ܳᩴ᩻;->ᩳ֫:I

    .line 166
    iget-object p1, p1, Ll/ܳᩴ᩻;->ܽ֫:Ljava/lang/String;

    iput-object p1, p0, Ll/ܳᩴ᩻;->ܽ֫:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public final ۜ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ۢ()Ll/ۖۘ᩻;
    .locals 3

    .line 122
    iget v0, p0, Ll/ܳᩴ᩻;->ᩳ֫:I

    iget-object v1, p0, Ll/ܳᩴ᩻;->ܽ֫:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/᩵ᩴ᩻;->֫(ILjava/lang/String;)Ll/ۖۘ᩻;

    move-result-object v0

    .line 123
    iget v1, p0, Ll/ܳᩴ᩻;->ᩳ֫:I

    iget v2, v0, Ll/ۗ᩻᩻;->᩶:I

    if-eq v1, v2, :cond_0

    .line 124
    iput v2, p0, Ll/ܳᩴ᩻;->ᩳ֫:I

    :cond_0
    return-object v0
.end method

.method public final ܳ()Lbin/mt/json/JSONObject;
    .locals 3

    .line 102
    invoke-super {p0}, Ll/ۗ᩻᩻;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "1"

    .line 103
    iget-object v2, p0, Ll/ܳᩴ᩻;->ۧ֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "2"

    .line 104
    iget v2, p0, Ll/ܳᩴ᩻;->᩷֫:I

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    const-string v1, "4"

    .line 105
    iget-object v2, p0, Ll/ܳᩴ᩻;->ۢ֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "5"

    .line 106
    iget-object v2, p0, Ll/ܳᩴ᩻;->ۜ֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "6"

    .line 107
    iget-object v2, p0, Ll/ܳᩴ᩻;->ܿ֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "c"

    .line 108
    iget-object v2, p0, Ll/ܳᩴ᩻;->ܳ֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "7"

    .line 109
    iget-boolean v2, p0, Ll/ܳᩴ᩻;->᩻֫:Z

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    const-string v1, "9"

    .line 110
    iget-object v2, p0, Ll/ܳᩴ᩻;->֫֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 111
    iget v1, p0, Ll/ܳᩴ᩻;->ᩳ֫:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    const-string v2, "e"

    .line 112
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    const-string v1, "f"

    .line 113
    iget-object v2, p0, Ll/ܳᩴ᩻;->ܽ֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    :cond_0
    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 3

    .line 145
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "sftp://"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܳᩴ᩻;->ۢ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܳᩴ᩻;->ۧ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/"

    .line 146
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 0
    invoke-static {v2, v1, v0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 3

    .line 221
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "sftp@"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    const-string v2, " "

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "SFTP"

    return-object v0
.end method
