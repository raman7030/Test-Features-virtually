.class public final Ll/ۜܺ᩻;
.super Ll/ۗ᩻᩻;
.source "CAG8"


# instance fields
.field public ֫֫:Ljava/lang/String;

.field public ۜ֫:Ljava/lang/String;

.field public ۧ֫:Z

.field public ܳ֫:I

.field public ܽ֫:Ljava/lang/String;

.field public ܿ֫:Ljava/lang/String;

.field public ᩳ֫:Z

.field public ᩻֫:Z


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 54
    invoke-direct {p0, p1}, Ll/ۗ᩻᩻;-><init>(I)V

    const-string p1, ""

    .line 42
    iput-object p1, p0, Ll/ۜܺ᩻;->ܽ֫:Ljava/lang/String;

    const/16 v0, 0x15

    .line 43
    iput v0, p0, Ll/ۜܺ᩻;->ܳ֫:I

    const-string v0, "anonymous"

    .line 44
    iput-object v0, p0, Ll/ۜܺ᩻;->ۜ֫:Ljava/lang/String;

    .line 45
    iput-object p1, p0, Ll/ۜܺ᩻;->ܿ֫:Ljava/lang/String;

    const-string p1, "UTF-8"

    .line 46
    iput-object p1, p0, Ll/ۜܺ᩻;->֫֫:Ljava/lang/String;

    const/4 p1, 0x1

    .line 47
    iput-boolean p1, p0, Ll/ۜܺ᩻;->ᩳ֫:Z

    .line 48
    iput-boolean p1, p0, Ll/ۜܺ᩻;->ۧ֫:Z

    .line 51
    iput-boolean p1, p0, Ll/ۜܺ᩻;->᩻֫:Z

    return-void
.end method

.method public constructor <init>(Lbin/mt/json/JSONObject;)V
    .locals 2

    const-string v0, "rk"

    const-string v1, "4"

    .line 71
    invoke-static {p1, v0, v1}, Ll/ۗ᩻᩻;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ip"

    const-string v1, "7"

    .line 72
    invoke-static {p1, v0, v1}, Ll/ۗ᩻᩻;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "hs"

    const-string v1, "b"

    .line 73
    invoke-static {p1, v0, v1}, Ll/ۗ᩻᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mt"

    const-string v1, "c"

    .line 74
    invoke-static {p1, v0, v1}, Ll/ۗ᩻᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    invoke-direct {p0, p1}, Ll/ۗ᩻᩻;-><init>(Lbin/mt/json/JSONObject;)V

    const-string v0, ""

    .line 42
    iput-object v0, p0, Ll/ۜܺ᩻;->ܽ֫:Ljava/lang/String;

    const/16 v1, 0x15

    .line 43
    iput v1, p0, Ll/ۜܺ᩻;->ܳ֫:I

    const-string v1, "anonymous"

    .line 44
    iput-object v1, p0, Ll/ۜܺ᩻;->ۜ֫:Ljava/lang/String;

    .line 45
    iput-object v0, p0, Ll/ۜܺ᩻;->ܿ֫:Ljava/lang/String;

    const-string v0, "UTF-8"

    .line 46
    iput-object v0, p0, Ll/ۜܺ᩻;->֫֫:Ljava/lang/String;

    const/4 v0, 0x1

    .line 47
    iput-boolean v0, p0, Ll/ۜܺ᩻;->ᩳ֫:Z

    .line 48
    iput-boolean v0, p0, Ll/ۜܺ᩻;->ۧ֫:Z

    .line 51
    iput-boolean v0, p0, Ll/ۜܺ᩻;->᩻֫:Z

    const-string v0, "2"

    .line 59
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۜܺ᩻;->ܽ֫:Ljava/lang/String;

    const-string v0, "3"

    .line 60
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Ll/ۜܺ᩻;->ܳ֫:I

    const-string v0, "5"

    .line 61
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۜܺ᩻;->ۜ֫:Ljava/lang/String;

    const-string v0, "6"

    .line 62
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۜܺ᩻;->ܿ֫:Ljava/lang/String;

    const-string v0, "8"

    .line 63
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۜܺ᩻;->֫֫:Ljava/lang/String;

    const-string v0, "9"

    .line 64
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۜܺ᩻;->ᩳ֫:Z

    const-string v0, "a"

    .line 65
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Ll/ۜܺ᩻;->ۧ֫:Z

    return-void
.end method

.method public static ֫(Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Ll/ۗۘ;Ll/ۗۘ;Ll/ۗۘ;Ll/ۙ᩻᩻;)Ll/ۜܺ᩻;
    .locals 2

    .line 280
    invoke-static {p0}, Ll/ۗ᩻᩻;->ۧ(Landroid/widget/EditText;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 281
    new-instance v0, Ll/ۜܺ᩻;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Ll/ۜܺ᩻;-><init>(I)V

    .line 363
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 282
    iput-object p0, v0, Ll/ۜܺ᩻;->ܽ֫:Ljava/lang/String;

    .line 363
    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 356
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/16 p0, 0x15

    .line 283
    :goto_0
    iput p0, v0, Ll/ۜܺ᩻;->ܳ֫:I

    const-string p0, "anonymous"

    .line 284
    invoke-static {p3, p0}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Ll/ۜܺ᩻;->ۜ֫:Ljava/lang/String;

    .line 363
    invoke-virtual {p4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 285
    iput-object p0, v0, Ll/ۜܺ᩻;->ܿ֫:Ljava/lang/String;

    .line 363
    invoke-virtual {p5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 286
    iput-object p0, v0, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    .line 287
    iget-object p0, v0, Ll/ۜܺ᩻;->ܽ֫:Ljava/lang/String;

    invoke-static {p6, p0}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    const-string p0, "UTF-8"

    .line 288
    invoke-static {p1, p0}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Ll/ۜܺ᩻;->֫֫:Ljava/lang/String;

    .line 289
    invoke-virtual {p7}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p0

    iput-boolean p0, v0, Ll/ۜܺ᩻;->ᩳ֫:Z

    .line 290
    invoke-virtual {p8}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p0

    iput-boolean p0, v0, Ll/ۜܺ᩻;->ۧ֫:Z

    .line 291
    invoke-virtual {p9}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p0

    iput-boolean p0, v0, Ll/ۗ᩻᩻;->᩹:Z

    .line 292
    invoke-virtual {p10}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p0

    iput-boolean p0, v0, Ll/ۗ᩻᩻;->ۛ:Z

    .line 293
    invoke-virtual {p11}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p0

    iput-boolean p0, v0, Ll/ۗ᩻᩻;->۟:Z

    .line 294
    invoke-virtual {v0, p12}, Ll/ۗ᩻᩻;->ۧ(Ll/ۗ᩻᩻;)V

    return-object v0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/ۗܺ᩷;Ll/ۜܺ᩻;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 198
    invoke-virtual/range {p0 .. p0}, Ll/֨ܿ;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f050008

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v2

    if-eqz v2, :cond_0

    const v2, 0x7f0d00b6

    .line 199
    invoke-virtual {v0, v2}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v2

    goto :goto_0

    :cond_0
    const v2, 0x7f0d00b7

    .line 201
    invoke-virtual {v0, v2}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v2

    :goto_0
    const v3, 0x7f0a0631

    .line 203
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const v4, 0x7f0a026d

    .line 204
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Landroid/widget/EditText;

    const v4, 0x7f0a0446

    .line 205
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Landroid/widget/EditText;

    const v4, 0x7f0a0670

    .line 206
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Landroid/widget/EditText;

    const v4, 0x7f0a0429

    .line 207
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Landroid/widget/EditText;

    const v4, 0x7f0a04a5

    .line 208
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Landroid/widget/EditText;

    const v4, 0x7f0a04a4

    .line 209
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v12, v4

    check-cast v12, Landroid/widget/EditText;

    const v4, 0x7f0a00d7

    .line 210
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Landroid/widget/EditText;

    const v4, 0x7f0a0479

    .line 211
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v13, v4

    check-cast v13, Landroid/widget/RadioButton;

    const v4, 0x7f0a047a

    .line 212
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/RadioButton;

    const v5, 0x7f0a047b

    .line 213
    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    move-object v14, v5

    check-cast v14, Landroid/widget/RadioButton;

    const v5, 0x7f0a047c

    .line 214
    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/RadioButton;

    const v15, 0x7f0a025f

    .line 215
    invoke-virtual {v2, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v15

    check-cast v15, Ll/ۗۘ;

    move-object/from16 v16, v15

    const v15, 0x7f0a03d2

    .line 216
    invoke-virtual {v2, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v15

    check-cast v15, Ll/ۗۘ;

    move-object/from16 v17, v15

    const v15, 0x7f0a059e

    .line 217
    invoke-virtual {v2, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v15

    check-cast v15, Ll/ۗۘ;

    move-object/from16 v18, v15

    const v15, 0x7f0a062d

    .line 218
    invoke-virtual {v2, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v15

    check-cast v15, Landroid/widget/TextView;

    invoke-static {v0, v15, v1}, Ll/ۙ᩻᩻;->֫(Ll/ۗܺ᩷;Landroid/widget/TextView;Ll/ۗ᩻᩻;)Ll/ۙ᩻᩻;

    move-result-object v19

    .line 220
    iget v15, v1, Ll/ۗ᩻᩻;->᩶:I

    move-object/from16 v20, v2

    const/4 v2, -0x1

    if-ne v15, v2, :cond_1

    const v2, 0x7f1205ad

    goto :goto_1

    :cond_1
    const v2, 0x7f1202dd

    :goto_1
    invoke-static {v2}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    const-string v15, " FTPS"

    invoke-virtual {v2, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 221
    iget-object v2, v1, Ll/ۜܺ᩻;->ܽ֫:Ljava/lang/String;

    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 222
    iget v2, v1, Ll/ۜܺ᩻;->ܳ֫:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 223
    iget-object v2, v1, Ll/ۜܺ᩻;->ۜ֫:Ljava/lang/String;

    const-string v3, "anonymous"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, ""

    goto :goto_2

    :cond_2
    iget-object v2, v1, Ll/ۜܺ᩻;->ۜ֫:Ljava/lang/String;

    :goto_2
    invoke-virtual {v9, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 224
    iget-object v2, v1, Ll/ۜܺ᩻;->ܿ֫:Ljava/lang/String;

    invoke-virtual {v10, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 225
    iget-object v2, v1, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    invoke-virtual {v11, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 226
    iget-object v2, v1, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    invoke-virtual {v12, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 227
    iget-object v2, v1, Ll/ۜܺ᩻;->֫֫:Ljava/lang/String;

    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 228
    iget-boolean v2, v1, Ll/ۜܺ᩻;->ᩳ֫:Z

    invoke-virtual {v13, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 229
    iget-boolean v2, v1, Ll/ۜܺ᩻;->ᩳ֫:Z

    xor-int/lit8 v2, v2, 0x1

    invoke-virtual {v4, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 230
    iget-boolean v2, v1, Ll/ۜܺ᩻;->ۧ֫:Z

    invoke-virtual {v14, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 231
    iget-boolean v2, v1, Ll/ۜܺ᩻;->ۧ֫:Z

    xor-int/lit8 v2, v2, 0x1

    invoke-virtual {v5, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 232
    iget-boolean v2, v1, Ll/ۗ᩻᩻;->᩹:Z

    move-object/from16 v15, v16

    invoke-virtual {v15, v2}, Ll/ۗۘ;->setChecked(Z)V

    .line 233
    iget-boolean v2, v1, Ll/ۗ᩻᩻;->ۛ:Z

    move-object/from16 v3, v17

    invoke-virtual {v3, v2}, Ll/ۗۘ;->setChecked(Z)V

    .line 234
    iget-boolean v2, v1, Ll/ۗ᩻᩻;->۟:Z

    move-object/from16 v1, v18

    invoke-virtual {v1, v2}, Ll/ۗۘ;->setChecked(Z)V

    .line 588
    new-instance v2, Ll/֫۬ܳ;

    const/4 v1, 0x1

    invoke-direct {v2, v1}, Ll/֫۬ܳ;-><init>(I)V

    invoke-virtual {v3, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 236
    invoke-static {v7, v0}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;Ll/ۗܺ᩷;)V

    .line 237
    new-instance v1, Ll/ܽܺ᩻;

    invoke-direct {v1, v13, v4}, Ll/ܽܺ᩻;-><init>(Landroid/widget/RadioButton;Landroid/widget/RadioButton;)V

    .line 247
    invoke-virtual {v13, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 248
    invoke-virtual {v4, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 249
    new-instance v1, Ll/ᩳܺ᩻;

    invoke-direct {v1, v14, v5, v8}, Ll/ᩳܺ᩻;-><init>(Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/widget/EditText;)V

    .line 268
    invoke-virtual {v14, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 269
    invoke-virtual {v5, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 270
    invoke-static {v6, v12}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;Landroid/widget/EditText;)V

    .line 271
    invoke-virtual/range {p0 .. p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v1

    move-object/from16 v2, v20

    invoke-virtual {v1, v2}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v2, 0x7f1205fc

    const/4 v4, 0x0

    .line 272
    invoke-virtual {v1, v2, v4}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v2, 0x7f12015e

    .line 273
    invoke-virtual {v1, v2, v4}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v2, 0x7f1206b8

    .line 274
    invoke-virtual {v1, v2, v4}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    const/4 v2, 0x0

    .line 275
    invoke-virtual {v1, v2}, Ll/᩵ۚۢ;->֫(Z)V

    .line 276
    invoke-virtual {v1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v1

    .line 277
    invoke-static {v1}, Ll/ۚۗܿ;->֫(Ll/֡ۚۢ;)V

    .line 278
    invoke-static {v6}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    .line 279
    new-instance v2, Ll/ܿܺ᩻;

    move-object v5, v2

    move-object/from16 v4, v18

    move-object/from16 v16, v3

    move-object/from16 v17, v4

    move-object/from16 v18, v19

    invoke-direct/range {v5 .. v18}, Ll/ܿܺ᩻;-><init>(Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Ll/ۗۘ;Ll/ۗۘ;Ll/ۗۘ;Ll/ۙ᩻᩻;)V

    .line 299
    invoke-virtual {v1}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v3

    new-instance v4, Ll/֡᩹ܳ;

    move-object/from16 v5, p1

    invoke-direct {v4, v2, v5, v1}, Ll/֡᩹ܳ;-><init>(Ll/ܿܺ᩻;Ll/ۜܺ᩻;Ll/֡ۚۢ;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 314
    invoke-virtual {v1}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v1

    new-instance v3, Ll/ܳܺ᩻;

    invoke-direct {v3, v2, v0}, Ll/ܳܺ᩻;-><init>(Ll/ܿܺ᩻;Ll/ۗܺ᩷;)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܿܺ᩻;Ll/ۜܺ᩻;Ll/֡ۚۢ;)V
    .locals 2

    .line 300
    invoke-virtual {p0}, Ll/ܿܺ᩻;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۜܺ᩻;

    if-nez p0, :cond_0

    return-void

    .line 304
    :cond_0
    iget v0, p1, Ll/ۗ᩻᩻;->᩶:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 305
    new-instance p1, Ll/ۜܺ᩻;

    invoke-static {}, Ll/ۗ᩻᩻;->᩷()I

    move-result v0

    invoke-direct {p1, v0}, Ll/ۜܺ᩻;-><init>(I)V

    .line 306
    invoke-virtual {p1, p0}, Ll/ۜܺ᩻;->֫(Ll/ۗ᩻᩻;)V

    .line 307
    invoke-static {p1}, Ll/۫᩻᩻;->֫(Ll/ۗ᩻᩻;)V

    goto :goto_0

    .line 309
    :cond_1
    invoke-virtual {p1, p0}, Ll/ۜܺ᩻;->֫(Ll/ۗ᩻᩻;)V

    .line 310
    invoke-static {}, Ll/۫᩻᩻;->֫()V

    .line 312
    :goto_0
    invoke-virtual {p2}, Ll/֡ۚۢ;->dismiss()V

    return-void
.end method

.method public static ۧ(Ll/ۗܺ᩷;)V
    .locals 2

    .line 192
    new-instance v0, Ll/ۜܺ᩻;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Ll/ۜܺ᩻;-><init>(I)V

    invoke-static {p0, v0}, Ll/ۜܺ᩻;->֫(Ll/ۗܺ᩷;Ll/ۜܺ᩻;)V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_3

    .line 143
    const-class v0, Ll/ۜܺ᩻;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_1

    .line 144
    :cond_1
    invoke-super {p0, p1}, Ll/ۗ᩻᩻;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    .line 146
    :cond_2
    check-cast p1, Ll/ۜܺ᩻;

    .line 147
    iget v0, p0, Ll/ۜܺ᩻;->ܳ֫:I

    iget v1, p1, Ll/ۜܺ᩻;->ܳ֫:I

    if-ne v0, v1, :cond_3

    iget-boolean v0, p0, Ll/ۜܺ᩻;->ᩳ֫:Z

    iget-boolean v1, p1, Ll/ۜܺ᩻;->ᩳ֫:Z

    if-ne v0, v1, :cond_3

    iget-boolean v0, p0, Ll/ۜܺ᩻;->ۧ֫:Z

    iget-boolean v1, p1, Ll/ۜܺ᩻;->ۧ֫:Z

    if-ne v0, v1, :cond_3

    iget-boolean v0, p0, Ll/ۜܺ᩻;->᩻֫:Z

    iget-boolean v1, p1, Ll/ۜܺ᩻;->᩻֫:Z

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Ll/ۜܺ᩻;->ܽ֫:Ljava/lang/String;

    iget-object v1, p1, Ll/ۜܺ᩻;->ܽ֫:Ljava/lang/String;

    .line 151
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll/ۜܺ᩻;->ۜ֫:Ljava/lang/String;

    iget-object v1, p1, Ll/ۜܺ᩻;->ۜ֫:Ljava/lang/String;

    .line 152
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll/ۜܺ᩻;->ܿ֫:Ljava/lang/String;

    iget-object v1, p1, Ll/ۜܺ᩻;->ܿ֫:Ljava/lang/String;

    .line 153
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll/ۜܺ᩻;->֫֫:Ljava/lang/String;

    iget-object p1, p1, Ll/ۜܺ᩻;->֫֫:Ljava/lang/String;

    .line 154
    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final getIcon()Ll/᩶ۖܳ;
    .locals 1

    .line 178
    sget-object v0, Ll/᩶ۖܳ;->᩸:Ll/᩶ۖܳ;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 108
    iget-object v0, p0, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    .line 159
    invoke-super {p0}, Ll/ۗ᩻᩻;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    .line 160
    iget-object v2, p0, Ll/ۜܺ᩻;->ܽ֫:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 161
    iget v2, p0, Ll/ۜܺ᩻;->ܳ֫:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 162
    iget-object v2, p0, Ll/ۜܺ᩻;->ۜ֫:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 163
    iget-object v2, p0, Ll/ۜܺ᩻;->ܿ֫:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 164
    iget-object v2, p0, Ll/ۜܺ᩻;->֫֫:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 165
    iget-boolean v1, p0, Ll/ۜܺ᩻;->ᩳ֫:Z

    const/16 v2, 0x4d5

    if-eqz v1, :cond_0

    const/16 v1, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v1, 0x4d5

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 166
    iget-boolean v1, p0, Ll/ۜܺ᩻;->ۧ֫:Z

    if-eqz v1, :cond_1

    const/16 v1, 0x4cf

    goto :goto_1

    :cond_1
    const/16 v1, 0x4d5

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 167
    iget-boolean v1, p0, Ll/ۜܺ᩻;->᩻֫:Z

    if-eqz v1, :cond_2

    const/16 v2, 0x4cf

    :cond_2
    add-int/2addr v0, v2

    return v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 4

    .line 80
    iget v0, p0, Ll/ۜܺ᩻;->ܳ֫:I

    const/16 v1, 0x15

    const-string v2, "@"

    const-string v3, "ftps://"

    if-ne v0, v1, :cond_0

    .line 81
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۜܺ᩻;->ۜ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۜܺ᩻;->ܽ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 83
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۜܺ᩻;->ۜ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۜܺ᩻;->ܽ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۜܺ᩻;->ܳ֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)Ll/ۗۢ᩻;
    .locals 2

    .line 173
    new-instance v0, Ll/ۙܺ᩻;

    invoke-virtual {p0}, Ll/ۗ᩻᩻;->clone()Ll/ۗ᩻᩻;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ll/ۙܺ᩻;-><init>(ILl/ۗ᩻᩻;)V

    return-object v0
.end method

.method public final ֫(Ll/ۗܺ᩷;)V
    .locals 0

    .line 188
    invoke-static {p1, p0}, Ll/ۜܺ᩻;->֫(Ll/ۗܺ᩷;Ll/ۜܺ᩻;)V

    return-void
.end method

.method public final ֫(Ll/ۗ᩻᩻;)V
    .locals 1

    .line 121
    invoke-super {p0, p1}, Ll/ۗ᩻᩻;->֫(Ll/ۗ᩻᩻;)V

    .line 122
    instance-of v0, p1, Ll/ۜܺ᩻;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۜܺ᩻;

    .line 125
    iget-object v0, p1, Ll/ۜܺ᩻;->ܽ֫:Ljava/lang/String;

    iput-object v0, p0, Ll/ۜܺ᩻;->ܽ֫:Ljava/lang/String;

    .line 126
    iget v0, p1, Ll/ۜܺ᩻;->ܳ֫:I

    iput v0, p0, Ll/ۜܺ᩻;->ܳ֫:I

    .line 127
    iget-object v0, p1, Ll/ۜܺ᩻;->ۜ֫:Ljava/lang/String;

    iput-object v0, p0, Ll/ۜܺ᩻;->ۜ֫:Ljava/lang/String;

    .line 128
    iget-object v0, p1, Ll/ۜܺ᩻;->ܿ֫:Ljava/lang/String;

    iput-object v0, p0, Ll/ۜܺ᩻;->ܿ֫:Ljava/lang/String;

    .line 129
    iget-object v0, p1, Ll/ۜܺ᩻;->֫֫:Ljava/lang/String;

    iput-object v0, p0, Ll/ۜܺ᩻;->֫֫:Ljava/lang/String;

    .line 130
    iget-boolean v0, p1, Ll/ۜܺ᩻;->ᩳ֫:Z

    iput-boolean v0, p0, Ll/ۜܺ᩻;->ᩳ֫:Z

    .line 131
    iget-boolean p1, p1, Ll/ۜܺ᩻;->ۧ֫:Z

    iput-boolean p1, p0, Ll/ۜܺ᩻;->ۧ֫:Z

    :cond_0
    return-void
.end method

.method public final ۜ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܳ()Lbin/mt/json/JSONObject;
    .locals 3

    .line 89
    invoke-super {p0}, Ll/ۗ᩻᩻;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "2"

    .line 90
    iget-object v2, p0, Ll/ۜܺ᩻;->ܽ֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "3"

    .line 91
    iget v2, p0, Ll/ۜܺ᩻;->ܳ֫:I

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    const-string v1, "5"

    .line 92
    iget-object v2, p0, Ll/ۜܺ᩻;->ۜ֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "6"

    .line 93
    iget-object v2, p0, Ll/ۜܺ᩻;->ܿ֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "8"

    .line 94
    iget-object v2, p0, Ll/ۜܺ᩻;->֫֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "9"

    .line 95
    iget-boolean v2, p0, Ll/ۜܺ᩻;->ᩳ֫:Z

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    const-string v1, "a"

    .line 96
    iget-boolean v2, p0, Ll/ۜܺ᩻;->ۧ֫:Z

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 3

    .line 113
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ftps://"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۜܺ᩻;->ۜ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۜܺ᩻;->ܽ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/"

    .line 114
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

    .line 183
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ftps@"

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

    const-string v0, "FTPS"

    return-object v0
.end method
