.class public final Ll/֫ܺ᩻;
.super Ll/ۗ᩻᩻;
.source "3AGE"


# instance fields
.field public ֫֫:Ljava/lang/String;

.field public ۧ֫:Ljava/lang/String;

.field public ܳ֫:Ljava/lang/String;

.field public ܽ֫:Z

.field public ܿ֫:I

.field public ᩳ֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 50
    invoke-direct {p0, p1}, Ll/ۗ᩻᩻;-><init>(I)V

    const-string p1, ""

    .line 42
    iput-object p1, p0, Ll/֫ܺ᩻;->ۧ֫:Ljava/lang/String;

    const/16 v0, 0x15

    .line 43
    iput v0, p0, Ll/֫ܺ᩻;->ܿ֫:I

    const-string v0, "anonymous"

    .line 44
    iput-object v0, p0, Ll/֫ܺ᩻;->ܳ֫:Ljava/lang/String;

    .line 45
    iput-object p1, p0, Ll/֫ܺ᩻;->ᩳ֫:Ljava/lang/String;

    const-string p1, "UTF-8"

    .line 46
    iput-object p1, p0, Ll/֫ܺ᩻;->֫֫:Ljava/lang/String;

    const/4 p1, 0x1

    .line 47
    iput-boolean p1, p0, Ll/֫ܺ᩻;->ܽ֫:Z

    return-void
.end method

.method public constructor <init>(Lbin/mt/json/JSONObject;)V
    .locals 2

    const-string v0, "rk"

    const-string v1, "4"

    .line 65
    invoke-static {p1, v0, v1}, Ll/ۗ᩻᩻;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ip"

    const-string v1, "7"

    .line 66
    invoke-static {p1, v0, v1}, Ll/ۗ᩻᩻;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "hs"

    const-string v1, "a"

    .line 67
    invoke-static {p1, v0, v1}, Ll/ۗ᩻᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mt"

    const-string v1, "b"

    .line 68
    invoke-static {p1, v0, v1}, Ll/ۗ᩻᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    invoke-direct {p0, p1}, Ll/ۗ᩻᩻;-><init>(Lbin/mt/json/JSONObject;)V

    const-string v0, ""

    .line 42
    iput-object v0, p0, Ll/֫ܺ᩻;->ۧ֫:Ljava/lang/String;

    const/16 v1, 0x15

    .line 43
    iput v1, p0, Ll/֫ܺ᩻;->ܿ֫:I

    const-string v1, "anonymous"

    .line 44
    iput-object v1, p0, Ll/֫ܺ᩻;->ܳ֫:Ljava/lang/String;

    .line 45
    iput-object v0, p0, Ll/֫ܺ᩻;->ᩳ֫:Ljava/lang/String;

    const-string v0, "UTF-8"

    .line 46
    iput-object v0, p0, Ll/֫ܺ᩻;->֫֫:Ljava/lang/String;

    const/4 v0, 0x1

    .line 47
    iput-boolean v0, p0, Ll/֫ܺ᩻;->ܽ֫:Z

    const-string v0, "2"

    .line 55
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/֫ܺ᩻;->ۧ֫:Ljava/lang/String;

    const-string v0, "3"

    .line 56
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Ll/֫ܺ᩻;->ܿ֫:I

    const-string v0, "5"

    .line 57
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/֫ܺ᩻;->ܳ֫:Ljava/lang/String;

    const-string v0, "6"

    .line 58
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/֫ܺ᩻;->ᩳ֫:Ljava/lang/String;

    const-string v0, "8"

    .line 59
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/֫ܺ᩻;->֫֫:Ljava/lang/String;

    const-string v0, "9"

    .line 60
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Ll/֫ܺ᩻;->ܽ֫:Z

    return-void
.end method

.method public static ֫(Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/RadioButton;Ll/ۗۘ;Ll/ۗۘ;Ll/ۗۘ;Ll/ۙ᩻᩻;)Ll/֫ܺ᩻;
    .locals 2

    .line 242
    invoke-static {p0}, Ll/ۗ᩻᩻;->ۧ(Landroid/widget/EditText;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 243
    new-instance v0, Ll/֫ܺ᩻;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Ll/֫ܺ᩻;-><init>(I)V

    .line 363
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 244
    iput-object p0, v0, Ll/֫ܺ᩻;->ۧ֫:Ljava/lang/String;

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

    .line 245
    :goto_0
    iput p0, v0, Ll/֫ܺ᩻;->ܿ֫:I

    const-string p0, "anonymous"

    .line 246
    invoke-static {p3, p0}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Ll/֫ܺ᩻;->ܳ֫:Ljava/lang/String;

    .line 363
    invoke-virtual {p4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 247
    iput-object p0, v0, Ll/֫ܺ᩻;->ᩳ֫:Ljava/lang/String;

    .line 363
    invoke-virtual {p5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 248
    iput-object p0, v0, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    .line 249
    iget-object p0, v0, Ll/֫ܺ᩻;->ۧ֫:Ljava/lang/String;

    invoke-static {p6, p0}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    const-string p0, "UTF-8"

    .line 250
    invoke-static {p1, p0}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Ll/֫ܺ᩻;->֫֫:Ljava/lang/String;

    .line 251
    invoke-virtual {p7}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p0

    iput-boolean p0, v0, Ll/֫ܺ᩻;->ܽ֫:Z

    .line 252
    invoke-virtual {p8}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p0

    iput-boolean p0, v0, Ll/ۗ᩻᩻;->᩹:Z

    .line 253
    invoke-virtual {p9}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p0

    iput-boolean p0, v0, Ll/ۗ᩻᩻;->ۛ:Z

    .line 254
    invoke-virtual {p10}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p0

    iput-boolean p0, v0, Ll/ۗ᩻᩻;->۟:Z

    .line 255
    invoke-virtual {v0, p11}, Ll/ۗ᩻᩻;->ۧ(Ll/ۗ᩻᩻;)V

    return-object v0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/ۗܺ᩷;Ll/֫ܺ᩻;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 184
    invoke-virtual/range {p0 .. p0}, Ll/֨ܿ;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f050008

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v2

    if-eqz v2, :cond_0

    const v2, 0x7f0d00b6

    .line 185
    invoke-virtual {v0, v2}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v2

    goto :goto_0

    :cond_0
    const v2, 0x7f0d00b7

    .line 187
    invoke-virtual {v0, v2}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v2

    :goto_0
    const v3, 0x7f0a0631

    .line 189
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const v4, 0x7f0a026d

    .line 190
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Landroid/widget/EditText;

    const v4, 0x7f0a0446

    .line 191
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Landroid/widget/EditText;

    const v4, 0x7f0a0670

    .line 192
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Landroid/widget/EditText;

    const v4, 0x7f0a0429

    .line 193
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Landroid/widget/EditText;

    const v4, 0x7f0a04a5

    .line 194
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Landroid/widget/EditText;

    const v4, 0x7f0a04a4

    .line 195
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v12, v4

    check-cast v12, Landroid/widget/EditText;

    const v4, 0x7f0a00d7

    .line 196
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Landroid/widget/EditText;

    const v4, 0x7f0a0479

    .line 197
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v13, v4

    check-cast v13, Landroid/widget/RadioButton;

    const v4, 0x7f0a047a

    .line 198
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/RadioButton;

    const v5, 0x7f0a025f

    .line 199
    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    move-object v14, v5

    check-cast v14, Ll/ۗۘ;

    const v5, 0x7f0a03d2

    .line 200
    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    move-object v15, v5

    check-cast v15, Ll/ۗۘ;

    const v5, 0x7f0a059e

    .line 201
    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Ll/ۗۘ;

    move-object/from16 v16, v5

    const v5, 0x7f0a062d

    .line 202
    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    invoke-static {v0, v5, v1}, Ll/ۙ᩻᩻;->֫(Ll/ۗܺ᩷;Landroid/widget/TextView;Ll/ۗ᩻᩻;)Ll/ۙ᩻᩻;

    move-result-object v17

    .line 204
    iget v5, v1, Ll/ۗ᩻᩻;->᩶:I

    move-object/from16 v18, v2

    const/4 v2, -0x1

    if-ne v5, v2, :cond_1

    const v2, 0x7f1205ad

    goto :goto_1

    :cond_1
    const v2, 0x7f1202dd

    :goto_1
    invoke-static {v2}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    const-string v5, " FTP"

    invoke-virtual {v2, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 205
    iget-object v2, v1, Ll/֫ܺ᩻;->ۧ֫:Ljava/lang/String;

    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 206
    iget v2, v1, Ll/֫ܺ᩻;->ܿ֫:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 207
    iget-object v2, v1, Ll/֫ܺ᩻;->ܳ֫:Ljava/lang/String;

    const-string v3, "anonymous"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, ""

    goto :goto_2

    :cond_2
    iget-object v2, v1, Ll/֫ܺ᩻;->ܳ֫:Ljava/lang/String;

    :goto_2
    invoke-virtual {v9, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 208
    iget-object v2, v1, Ll/֫ܺ᩻;->ᩳ֫:Ljava/lang/String;

    invoke-virtual {v10, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 209
    iget-object v2, v1, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    invoke-virtual {v11, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 210
    iget-object v2, v1, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    invoke-virtual {v12, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 211
    iget-object v2, v1, Ll/֫ܺ᩻;->֫֫:Ljava/lang/String;

    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 212
    iget-boolean v2, v1, Ll/֫ܺ᩻;->ܽ֫:Z

    invoke-virtual {v13, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 213
    iget-boolean v2, v1, Ll/֫ܺ᩻;->ܽ֫:Z

    xor-int/lit8 v2, v2, 0x1

    invoke-virtual {v4, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 214
    iget-boolean v2, v1, Ll/ۗ᩻᩻;->᩹:Z

    invoke-virtual {v14, v2}, Ll/ۗۘ;->setChecked(Z)V

    .line 215
    iget-boolean v2, v1, Ll/ۗ᩻᩻;->ۛ:Z

    invoke-virtual {v15, v2}, Ll/ۗۘ;->setChecked(Z)V

    .line 216
    iget-boolean v2, v1, Ll/ۗ᩻᩻;->۟:Z

    move-object/from16 v5, v16

    invoke-virtual {v5, v2}, Ll/ۗۘ;->setChecked(Z)V

    .line 588
    new-instance v2, Ll/֫۬ܳ;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Ll/֫۬ܳ;-><init>(I)V

    invoke-virtual {v15, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 218
    invoke-static {v7, v0}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;Ll/ۗܺ᩷;)V

    .line 219
    new-instance v2, Ll/ۤۡ᩻;

    invoke-direct {v2, v13, v4}, Ll/ۤۡ᩻;-><init>(Landroid/widget/RadioButton;Landroid/widget/RadioButton;)V

    .line 229
    invoke-virtual {v13, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 230
    invoke-virtual {v4, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v2, 0x7f0a0223

    move-object/from16 v3, v18

    .line 231
    invoke-virtual {v3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const/16 v4, 0x8

    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 232
    invoke-static {v6, v12}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;Landroid/widget/EditText;)V

    .line 233
    invoke-virtual/range {p0 .. p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v2

    invoke-virtual {v2, v3}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v3, 0x7f1205fc

    const/4 v4, 0x0

    .line 234
    invoke-virtual {v2, v3, v4}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v3, 0x7f12015e

    .line 235
    invoke-virtual {v2, v3, v4}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v3, 0x7f1206b8

    .line 236
    invoke-virtual {v2, v3, v4}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    const/4 v3, 0x0

    .line 237
    invoke-virtual {v2, v3}, Ll/᩵ۚۢ;->֫(Z)V

    .line 238
    invoke-virtual {v2}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v2

    .line 239
    invoke-static {v2}, Ll/ۚۗܿ;->֫(Ll/֡ۚۢ;)V

    .line 240
    invoke-static {v6}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    .line 241
    new-instance v3, Ll/ۛۡ᩻;

    move-object v4, v5

    move-object v5, v3

    move-object/from16 v16, v4

    invoke-direct/range {v5 .. v17}, Ll/ۛۡ᩻;-><init>(Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/RadioButton;Ll/ۗۘ;Ll/ۗۘ;Ll/ۗۘ;Ll/ۙ᩻᩻;)V

    .line 260
    invoke-virtual {v2}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v4

    new-instance v5, Ll/ۨۡ᩻;

    invoke-direct {v5, v3, v1, v2}, Ll/ۨۡ᩻;-><init>(Ll/ۛۡ᩻;Ll/֫ܺ᩻;Ll/֡ۚۢ;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 275
    invoke-virtual {v2}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v1

    new-instance v2, Ll/᩺ۡ᩻;

    invoke-direct {v2, v3, v0}, Ll/᩺ۡ᩻;-><init>(Ll/ۛۡ᩻;Ll/ۗܺ᩷;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۛۡ᩻;Ll/֫ܺ᩻;Ll/֡ۚۢ;)V
    .locals 2

    .line 261
    invoke-virtual {p0}, Ll/ۛۡ᩻;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֫ܺ᩻;

    if-nez p0, :cond_0

    return-void

    .line 265
    :cond_0
    iget v0, p1, Ll/ۗ᩻᩻;->᩶:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 266
    new-instance p1, Ll/֫ܺ᩻;

    invoke-static {}, Ll/ۗ᩻᩻;->᩷()I

    move-result v0

    invoke-direct {p1, v0}, Ll/֫ܺ᩻;-><init>(I)V

    .line 267
    invoke-virtual {p1, p0}, Ll/֫ܺ᩻;->֫(Ll/ۗ᩻᩻;)V

    .line 268
    invoke-static {p1}, Ll/۫᩻᩻;->֫(Ll/ۗ᩻᩻;)V

    goto :goto_0

    .line 270
    :cond_1
    invoke-virtual {p1, p0}, Ll/֫ܺ᩻;->֫(Ll/ۗ᩻᩻;)V

    .line 271
    invoke-static {}, Ll/۫᩻᩻;->֫()V

    .line 273
    :goto_0
    invoke-virtual {p2}, Ll/֡ۚۢ;->dismiss()V

    return-void
.end method

.method public static ۧ(Ll/ۗܺ᩷;)V
    .locals 2

    .line 178
    new-instance v0, Ll/֫ܺ᩻;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Ll/֫ܺ᩻;-><init>(I)V

    invoke-static {p0, v0}, Ll/֫ܺ᩻;->֫(Ll/ۗܺ᩷;Ll/֫ܺ᩻;)V

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

    .line 133
    const-class v2, Ll/֫ܺ᩻;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 134
    :cond_1
    invoke-super {p0, p1}, Ll/ۗ᩻᩻;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    .line 136
    :cond_2
    check-cast p1, Ll/֫ܺ᩻;

    .line 137
    iget v2, p0, Ll/֫ܺ᩻;->ܿ֫:I

    iget v3, p1, Ll/֫ܺ᩻;->ܿ֫:I

    if-ne v2, v3, :cond_3

    iget-boolean v2, p0, Ll/֫ܺ᩻;->ܽ֫:Z

    iget-boolean v3, p1, Ll/֫ܺ᩻;->ܽ֫:Z

    if-ne v2, v3, :cond_3

    iget-object v2, p0, Ll/֫ܺ᩻;->ۧ֫:Ljava/lang/String;

    iget-object v3, p1, Ll/֫ܺ᩻;->ۧ֫:Ljava/lang/String;

    .line 139
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ll/֫ܺ᩻;->ܳ֫:Ljava/lang/String;

    iget-object v3, p1, Ll/֫ܺ᩻;->ܳ֫:Ljava/lang/String;

    .line 140
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ll/֫ܺ᩻;->ᩳ֫:Ljava/lang/String;

    iget-object v3, p1, Ll/֫ܺ᩻;->ᩳ֫:Ljava/lang/String;

    .line 141
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ll/֫ܺ᩻;->֫֫:Ljava/lang/String;

    iget-object p1, p1, Ll/֫ܺ᩻;->֫֫:Ljava/lang/String;

    .line 142
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

    .line 164
    sget-object v0, Ll/᩶ۖܳ;->ܶ:Ll/᩶ۖܳ;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 100
    iget-object v0, p0, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    .line 147
    invoke-super {p0}, Ll/ۗ᩻᩻;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    .line 148
    iget-object v2, p0, Ll/֫ܺ᩻;->ۧ֫:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 149
    iget v2, p0, Ll/֫ܺ᩻;->ܿ֫:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 150
    iget-object v2, p0, Ll/֫ܺ᩻;->ܳ֫:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 151
    iget-object v2, p0, Ll/֫ܺ᩻;->ᩳ֫:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 152
    iget-object v2, p0, Ll/֫ܺ᩻;->֫֫:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 153
    iget-boolean v1, p0, Ll/֫ܺ᩻;->ܽ֫:Z

    if-eqz v1, :cond_0

    const/16 v1, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v1, 0x4d5

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 4

    .line 74
    iget v0, p0, Ll/֫ܺ᩻;->ܿ֫:I

    const/16 v1, 0x15

    const-string v2, "@"

    const-string v3, "ftp://"

    if-ne v0, v1, :cond_0

    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/֫ܺ᩻;->ܳ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/֫ܺ᩻;->ۧ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 77
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/֫ܺ᩻;->ܳ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/֫ܺ᩻;->ۧ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/֫ܺ᩻;->ܿ֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)Ll/ۗۢ᩻;
    .locals 2

    .line 159
    new-instance v0, Ll/ۙܺ᩻;

    invoke-virtual {p0}, Ll/ۗ᩻᩻;->clone()Ll/ۗ᩻᩻;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ll/ۙܺ᩻;-><init>(ILl/ۗ᩻᩻;)V

    return-object v0
.end method

.method public final ֫(Ll/ۗܺ᩷;)V
    .locals 0

    .line 174
    invoke-static {p1, p0}, Ll/֫ܺ᩻;->֫(Ll/ۗܺ᩷;Ll/֫ܺ᩻;)V

    return-void
.end method

.method public final ֫(Ll/ۗ᩻᩻;)V
    .locals 1

    .line 113
    invoke-super {p0, p1}, Ll/ۗ᩻᩻;->֫(Ll/ۗ᩻᩻;)V

    .line 114
    instance-of v0, p1, Ll/֫ܺ᩻;

    if-eqz v0, :cond_0

    check-cast p1, Ll/֫ܺ᩻;

    .line 117
    iget-object v0, p1, Ll/֫ܺ᩻;->ۧ֫:Ljava/lang/String;

    iput-object v0, p0, Ll/֫ܺ᩻;->ۧ֫:Ljava/lang/String;

    .line 118
    iget v0, p1, Ll/֫ܺ᩻;->ܿ֫:I

    iput v0, p0, Ll/֫ܺ᩻;->ܿ֫:I

    .line 119
    iget-object v0, p1, Ll/֫ܺ᩻;->ܳ֫:Ljava/lang/String;

    iput-object v0, p0, Ll/֫ܺ᩻;->ܳ֫:Ljava/lang/String;

    .line 120
    iget-object v0, p1, Ll/֫ܺ᩻;->ᩳ֫:Ljava/lang/String;

    iput-object v0, p0, Ll/֫ܺ᩻;->ᩳ֫:Ljava/lang/String;

    .line 121
    iget-object v0, p1, Ll/֫ܺ᩻;->֫֫:Ljava/lang/String;

    iput-object v0, p0, Ll/֫ܺ᩻;->֫֫:Ljava/lang/String;

    .line 122
    iget-boolean p1, p1, Ll/֫ܺ᩻;->ܽ֫:Z

    iput-boolean p1, p0, Ll/֫ܺ᩻;->ܽ֫:Z

    :cond_0
    return-void
.end method

.method public final ܳ()Lbin/mt/json/JSONObject;
    .locals 3

    .line 83
    invoke-super {p0}, Ll/ۗ᩻᩻;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "2"

    .line 84
    iget-object v2, p0, Ll/֫ܺ᩻;->ۧ֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "3"

    .line 85
    iget v2, p0, Ll/֫ܺ᩻;->ܿ֫:I

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    const-string v1, "5"

    .line 86
    iget-object v2, p0, Ll/֫ܺ᩻;->ܳ֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "6"

    .line 87
    iget-object v2, p0, Ll/֫ܺ᩻;->ᩳ֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "8"

    .line 88
    iget-object v2, p0, Ll/֫ܺ᩻;->֫֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "9"

    .line 89
    iget-boolean v2, p0, Ll/֫ܺ᩻;->ܽ֫:Z

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 3

    .line 105
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ftp://"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/֫ܺ᩻;->ܳ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/֫ܺ᩻;->ۧ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/"

    .line 106
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

    .line 169
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ftp@"

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

    const-string v0, "FTP"

    return-object v0
.end method
