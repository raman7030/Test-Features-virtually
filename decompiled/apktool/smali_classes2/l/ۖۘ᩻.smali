.class public final Ll/ۖۘ᩻;
.super Ll/ۗ᩻᩻;
.source "27JL"


# instance fields
.field public ֫֫:Ljava/lang/String;

.field public ۧ֫:Ljava/lang/String;

.field public ܳ֫:I

.field public ܽ֫:Ljava/lang/String;

.field public ܿ֫:Ljava/lang/String;

.field public ᩳ֫:Z

.field public ᩻֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 55
    invoke-direct {p0, p1}, Ll/ۗ᩻᩻;-><init>(I)V

    const-string p1, ""

    .line 46
    iput-object p1, p0, Ll/ۖۘ᩻;->֫֫:Ljava/lang/String;

    const/16 v0, 0x16

    .line 47
    iput v0, p0, Ll/ۖۘ᩻;->ܳ֫:I

    const-string v0, "root"

    .line 48
    iput-object v0, p0, Ll/ۖۘ᩻;->᩻֫:Ljava/lang/String;

    .line 49
    iput-object p1, p0, Ll/ۖۘ᩻;->ܿ֫:Ljava/lang/String;

    .line 50
    iput-object p1, p0, Ll/ۖۘ᩻;->ۧ֫:Ljava/lang/String;

    .line 51
    iput-object p1, p0, Ll/ۖۘ᩻;->ܽ֫:Ljava/lang/String;

    const/4 p1, 0x0

    .line 52
    iput-boolean p1, p0, Ll/ۖۘ᩻;->ᩳ֫:Z

    return-void
.end method

.method public constructor <init>(Lbin/mt/json/JSONObject;)V
    .locals 2

    .line 59
    invoke-direct {p0, p1}, Ll/ۗ᩻᩻;-><init>(Lbin/mt/json/JSONObject;)V

    const-string v0, ""

    .line 46
    iput-object v0, p0, Ll/ۖۘ᩻;->֫֫:Ljava/lang/String;

    const/16 v1, 0x16

    .line 47
    iput v1, p0, Ll/ۖۘ᩻;->ܳ֫:I

    const-string v1, "root"

    .line 48
    iput-object v1, p0, Ll/ۖۘ᩻;->᩻֫:Ljava/lang/String;

    .line 49
    iput-object v0, p0, Ll/ۖۘ᩻;->ܿ֫:Ljava/lang/String;

    .line 50
    iput-object v0, p0, Ll/ۖۘ᩻;->ۧ֫:Ljava/lang/String;

    .line 51
    iput-object v0, p0, Ll/ۖۘ᩻;->ܽ֫:Ljava/lang/String;

    const/4 v1, 0x0

    .line 52
    iput-boolean v1, p0, Ll/ۖۘ᩻;->ᩳ֫:Z

    const-string v1, "1"

    .line 60
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ۖۘ᩻;->֫֫:Ljava/lang/String;

    const-string v1, "2"

    .line 61
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Ll/ۖۘ᩻;->ܳ֫:I

    const-string v1, "3"

    .line 62
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ۖۘ᩻;->᩻֫:Ljava/lang/String;

    const-string v1, "4"

    .line 63
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ۖۘ᩻;->ܿ֫:Ljava/lang/String;

    const-string v1, "5"

    .line 64
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ۖۘ᩻;->ۧ֫:Ljava/lang/String;

    const-string v1, "6"

    .line 65
    invoke-virtual {p1, v1, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۖۘ᩻;->ܽ֫:Ljava/lang/String;

    const-string v0, "7"

    .line 66
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Ll/ۖۘ᩻;->ᩳ֫:Z

    return-void
.end method

.method public static ֫(Landroid/widget/EditText;Landroid/widget/EditText;Ll/ۗۘ;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;)Ll/ۖۘ᩻;
    .locals 2

    .line 287
    invoke-static {p0}, Ll/ۗ᩻᩻;->ۧ(Landroid/widget/EditText;)Z

    move-result v0

    if-eqz v0, :cond_4

    const v0, 0x7f1206d3

    .line 411
    invoke-static {p1, v0}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;I)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 290
    :cond_0
    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x7f1206d0

    .line 419
    invoke-static {p3, v0}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;I)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_1
    const v0, 0x7f1206d1

    .line 415
    invoke-static {p4, v0}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;I)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    .line 295
    :cond_2
    new-instance v0, Ll/ۖۘ᩻;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Ll/ۖۘ᩻;-><init>(I)V

    .line 363
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 296
    iput-object p0, v0, Ll/ۖۘ᩻;->֫֫:Ljava/lang/String;

    .line 363
    invoke-virtual {p5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

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
    const/16 p0, 0x16

    .line 297
    :goto_0
    iput p0, v0, Ll/ۖۘ᩻;->ܳ֫:I

    .line 363
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 298
    iput-object p0, v0, Ll/ۖۘ᩻;->᩻֫:Ljava/lang/String;

    .line 363
    invoke-virtual {p4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 299
    iput-object p0, v0, Ll/ۖۘ᩻;->ܿ֫:Ljava/lang/String;

    .line 363
    invoke-virtual {p3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 300
    iput-object p0, v0, Ll/ۖۘ᩻;->ۧ֫:Ljava/lang/String;

    .line 363
    invoke-virtual {p6}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 301
    iput-object p0, v0, Ll/ۖۘ᩻;->ܽ֫:Ljava/lang/String;

    .line 302
    iget-object p0, v0, Ll/ۖۘ᩻;->ۧ֫:Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    const/16 p1, 0x5000

    if-le p0, p1, :cond_3

    .line 303
    iget-object p0, v0, Ll/ۖۘ᩻;->ۧ֫:Ljava/lang/String;

    const/4 p3, 0x0

    invoke-virtual {p0, p3, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Ll/ۖۘ᩻;->ۧ֫:Ljava/lang/String;

    .line 305
    :cond_3
    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p0

    iput-boolean p0, v0, Ll/ۖۘ᩻;->ᩳ֫:Z

    .line 306
    iget-object p0, v0, Ll/ۖۘ᩻;->֫֫:Ljava/lang/String;

    invoke-static {p7, p0}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    return-object v0

    :cond_4
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/ۗܺ᩷;Ll/ۖۘ᩻;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const v2, 0x7f0d00f6

    .line 180
    invoke-virtual {v0, v2}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f0a05d5

    .line 181
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    const v3, 0x7f0a05d7

    .line 182
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    const v3, 0x7f0a05d1

    .line 183
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    const v3, 0x7f0a03d2

    .line 184
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    const v3, 0x7f0a059e

    .line 185
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    const v3, 0x7f0a025f

    .line 186
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    const v3, 0x7f0a062d

    .line 187
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

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

    move-object v11, v4

    check-cast v11, Landroid/widget/EditText;

    const v4, 0x7f0a0670

    .line 192
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Landroid/widget/EditText;

    const v4, 0x7f0a0429

    .line 193
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Landroid/widget/EditText;

    const v4, 0x7f0a02ad

    .line 194
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Landroid/widget/EditText;

    const v4, 0x7f0a02ae

    .line 195
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v12, v4

    check-cast v12, Landroid/widget/EditText;

    const v4, 0x7f0a04a4

    .line 196
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v13, v4

    check-cast v13, Landroid/widget/EditText;

    const v4, 0x7f0a02ed

    .line 197
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Ll/ۗۘ;

    const v4, 0x7f0a05d0

    .line 198
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/google/android/material/textfield/TextInputLayout;

    .line 199
    new-instance v5, Ll/ܽۘ᩻;

    invoke-direct {v5, v0, v6, v11, v13}, Ll/ܽۘ᩻;-><init>(Ll/ۗܺ᩷;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;)V

    invoke-virtual {v4, v5}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconOnClickListener(Landroid/view/View$OnClickListener;)V

    const v4, 0x7f0a00a4

    .line 205
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    const v5, 0x7f0a02ee

    .line 206
    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    const v14, 0x7f0a05d4

    .line 207
    invoke-virtual {v2, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v14

    .line 209
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v16, v4

    iget v4, v1, Ll/ۗ᩻᩻;->᩶:I

    const/4 v0, -0x1

    if-ne v4, v0, :cond_0

    const v0, 0x7f1205ad

    goto :goto_0

    :cond_0
    const v0, 0x7f1202dd

    :goto_0
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0x7f1204c8

    .line 97
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    .line 209
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 210
    iget-object v0, v1, Ll/ۖۘ᩻;->֫֫:Ljava/lang/String;

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 211
    iget v0, v1, Ll/ۖۘ᩻;->ܳ֫:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 212
    iget-object v0, v1, Ll/ۖۘ᩻;->᩻֫:Ljava/lang/String;

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 213
    iget-object v0, v1, Ll/ۖۘ᩻;->ܿ֫:Ljava/lang/String;

    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 214
    iget-object v0, v1, Ll/ۖۘ᩻;->ۧ֫:Ljava/lang/String;

    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 215
    iget-object v0, v1, Ll/ۖۘ᩻;->ܽ֫:Ljava/lang/String;

    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 216
    new-instance v0, Ll/ᩳۘ᩻;

    invoke-direct {v0, v5, v14}, Ll/ᩳۘ᩻;-><init>(Landroid/view/View;Landroid/view/View;)V

    .line 225
    iget-boolean v3, v1, Ll/ۖۘ᩻;->ᩳ֫:Z

    invoke-virtual {v0, v8, v3}, Ll/ᩳۘ᩻;->onCheckedChanged(Landroid/widget/CompoundButton;Z)V

    .line 226
    iget-boolean v3, v1, Ll/ۖۘ᩻;->ᩳ֫:Z

    invoke-virtual {v8, v3}, Ll/ۗۘ;->setChecked(Z)V

    .line 227
    invoke-virtual {v8, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 229
    iget-object v0, v1, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    invoke-virtual {v13, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 230
    invoke-static {v6, v13}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;Landroid/widget/EditText;)V

    .line 231
    invoke-virtual/range {p0 .. p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    invoke-virtual {v0, v2}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v2, 0x7f1205fc

    const/4 v3, 0x0

    .line 232
    invoke-virtual {v0, v2, v3}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v2, 0x7f12015e

    .line 233
    invoke-virtual {v0, v2, v3}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v2, 0x7f1206b8

    .line 234
    invoke-virtual {v0, v2, v3}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    const/4 v2, 0x0

    .line 235
    invoke-virtual {v0, v2}, Ll/᩵ۚۢ;->֫(Z)V

    .line 236
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v0

    .line 237
    invoke-static {v0}, Ll/ۚۗܿ;->֫(Ll/֡ۚۢ;)V

    move-object/from16 v4, p0

    .line 239
    instance-of v5, v4, Ll/᩶ۘ᩻;

    if-eqz v5, :cond_1

    move-object v2, v4

    check-cast v2, Ll/᩶ۘ᩻;

    .line 240
    invoke-virtual {v2}, Ll/᩶ۘ᩻;->᩺()Ll/ۚۡ֫;

    move-result-object v5

    .line 241
    invoke-virtual {v2}, Ll/᩶ۘ᩻;->ۨ()Ll/ۛ᩵᩷;

    move-result-object v2

    .line 242
    invoke-virtual {v5, v0}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;)V

    .line 243
    invoke-virtual {v5, v3}, Ll/ۚۡ֫;->ۧ(Ljava/lang/Object;)V

    .line 244
    new-instance v3, Ll/ܿۘ᩻;

    invoke-direct {v3, v9, v4}, Ll/ܿۘ᩻;-><init>(Landroid/widget/EditText;Ll/ۗܺ᩷;)V

    invoke-virtual {v5, v0, v3}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    .line 279
    new-instance v3, Ll/۬᩸ۢ;

    const/4 v5, 0x4

    invoke-direct {v3, v5, v2}, Ll/۬᩸ۢ;-><init>(ILjava/lang/Object;)V

    move-object/from16 v5, v16

    invoke-virtual {v5, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    move-object/from16 v5, v16

    .line 281
    invoke-virtual {v5, v2}, Landroid/view/View;->setEnabled(Z)V

    const/4 v2, 0x0

    .line 282
    invoke-virtual {v5, v2}, Landroid/view/View;->setAlpha(F)V

    .line 285
    :goto_1
    invoke-static {v6}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    .line 286
    new-instance v2, Ll/ܳۘ᩻;

    move-object v5, v2

    invoke-direct/range {v5 .. v13}, Ll/ܳۘ᩻;-><init>(Landroid/widget/EditText;Landroid/widget/EditText;Ll/ۗۘ;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;)V

    .line 309
    invoke-virtual {v0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v3

    new-instance v5, Ll/᩻ۘ᩻;

    invoke-direct {v5, v2, v1, v4, v0}, Ll/᩻ۘ᩻;-><init>(Ll/ܳۘ᩻;Ll/ۖۘ᩻;Ll/ۗܺ᩷;Ll/֡ۚۢ;)V

    invoke-virtual {v3, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 330
    invoke-virtual {v0}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/ۜۘ᩻;

    invoke-direct {v1, v2, v4}, Ll/ۜۘ᩻;-><init>(Ll/ܳۘ᩻;Ll/ۗܺ᩷;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܳۘ᩻;Ll/ۖۘ᩻;Ll/ۗܺ᩷;Ll/֡ۚۢ;)V
    .locals 0

    .line 0
    invoke-static {p0, p1, p2, p3}, Ll/ۖۘ᩻;->ۧ(Ll/ܳۘ᩻;Ll/ۖۘ᩻;Ll/ۗܺ᩷;Ll/֡ۚۢ;)V

    return-void
.end method

.method public static ֫(Ll/᩶ۘ᩻;)V
    .locals 2

    .line 175
    new-instance v0, Ll/ۖۘ᩻;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Ll/ۖۘ᩻;-><init>(I)V

    invoke-static {p0, v0}, Ll/ۖۘ᩻;->֫(Ll/ۗܺ᩷;Ll/ۖۘ᩻;)V

    return-void
.end method

.method public static synthetic ۧ(Ll/ܳۘ᩻;Ll/ۖۘ᩻;Ll/ۗܺ᩷;Ll/֡ۚۢ;)V
    .locals 2

    .line 310
    invoke-virtual {p0}, Ll/ܳۘ᩻;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۖۘ᩻;

    if-nez p0, :cond_0

    return-void

    .line 314
    :cond_0
    iget v0, p1, Ll/ۗ᩻᩻;->᩶:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 315
    new-instance p1, Ll/ۖۘ᩻;

    invoke-static {}, Ll/ۗ᩻᩻;->᩷()I

    move-result v0

    invoke-direct {p1, v0}, Ll/ۖۘ᩻;-><init>(I)V

    .line 316
    invoke-virtual {p1, p0}, Ll/ۖۘ᩻;->֫(Ll/ۗ᩻᩻;)V

    .line 317
    invoke-static {p1}, Ll/۫᩻᩻;->֫(Ll/ۗ᩻᩻;)V

    .line 318
    instance-of p0, p2, Ll/᩶ۘ᩻;

    if-eqz p0, :cond_2

    check-cast p2, Ll/᩶ۘ᩻;

    .line 319
    invoke-virtual {p2}, Ll/᩶ۘ᩻;->ܰ()V

    goto :goto_0

    .line 322
    :cond_1
    invoke-virtual {p1, p0}, Ll/ۖۘ᩻;->֫(Ll/ۗ᩻᩻;)V

    .line 323
    invoke-static {}, Ll/۫᩻᩻;->֫()V

    .line 324
    instance-of p0, p2, Ll/᩶ۘ᩻;

    if-eqz p0, :cond_2

    check-cast p2, Ll/᩶ۘ᩻;

    .line 325
    invoke-virtual {p2}, Ll/᩶ۘ᩻;->۟()V

    .line 328
    :cond_2
    :goto_0
    invoke-virtual {p3}, Ll/֡ۚۢ;->dismiss()V

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

    .line 123
    const-class v2, Ll/ۖۘ᩻;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 124
    :cond_1
    invoke-super {p0, p1}, Ll/ۗ᩻᩻;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    .line 126
    :cond_2
    check-cast p1, Ll/ۖۘ᩻;

    .line 127
    iget v2, p0, Ll/ۖۘ᩻;->ܳ֫:I

    iget v3, p1, Ll/ۖۘ᩻;->ܳ֫:I

    if-ne v2, v3, :cond_3

    iget-boolean v2, p0, Ll/ۖۘ᩻;->ᩳ֫:Z

    iget-boolean v3, p1, Ll/ۖۘ᩻;->ᩳ֫:Z

    if-ne v2, v3, :cond_3

    iget-object v2, p0, Ll/ۖۘ᩻;->֫֫:Ljava/lang/String;

    iget-object v3, p1, Ll/ۖۘ᩻;->֫֫:Ljava/lang/String;

    .line 129
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ll/ۖۘ᩻;->᩻֫:Ljava/lang/String;

    iget-object v3, p1, Ll/ۖۘ᩻;->᩻֫:Ljava/lang/String;

    .line 130
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ll/ۖۘ᩻;->ܿ֫:Ljava/lang/String;

    iget-object v3, p1, Ll/ۖۘ᩻;->ܿ֫:Ljava/lang/String;

    .line 131
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ll/ۖۘ᩻;->ۧ֫:Ljava/lang/String;

    iget-object v3, p1, Ll/ۖۘ᩻;->ۧ֫:Ljava/lang/String;

    .line 132
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ll/ۖۘ᩻;->ܽ֫:Ljava/lang/String;

    iget-object p1, p1, Ll/ۖۘ᩻;->ܽ֫:Ljava/lang/String;

    .line 133
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

    .line 161
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 102
    iget-object v0, p0, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    .line 138
    invoke-super {p0}, Ll/ۗ᩻᩻;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    .line 139
    iget-object v2, p0, Ll/ۖۘ᩻;->֫֫:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 140
    iget v2, p0, Ll/ۖۘ᩻;->ܳ֫:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 141
    iget-object v2, p0, Ll/ۖۘ᩻;->᩻֫:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 142
    iget-object v2, p0, Ll/ۖۘ᩻;->ܿ֫:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 143
    iget-object v2, p0, Ll/ۖۘ᩻;->ۧ֫:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 144
    iget-object v2, p0, Ll/ۖۘ᩻;->ܽ֫:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 145
    iget-boolean v1, p0, Ll/ۖۘ᩻;->ᩳ֫:Z

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

    .line 71
    iget v0, p0, Ll/ۖۘ᩻;->ܳ֫:I

    const/16 v1, 0x16

    const-string v2, "@"

    const-string v3, "sshj://"

    if-ne v0, v1, :cond_0

    .line 72
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۖۘ᩻;->᩻֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۖۘ᩻;->֫֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 74
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۖۘ᩻;->᩻֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۖۘ᩻;->֫֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۖۘ᩻;->ܳ֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)Ll/ۗۢ᩻;
    .locals 0

    .line 156
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ֫(Ll/ۗܺ᩷;)V
    .locals 0

    .line 171
    invoke-static {p1, p0}, Ll/ۖۘ᩻;->֫(Ll/ۗܺ᩷;Ll/ۖۘ᩻;)V

    return-void
.end method

.method public final ֫(Ll/ۗ᩻᩻;)V
    .locals 1

    .line 107
    invoke-super {p0, p1}, Ll/ۗ᩻᩻;->֫(Ll/ۗ᩻᩻;)V

    .line 108
    instance-of v0, p1, Ll/ۖۘ᩻;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۖۘ᩻;

    .line 111
    iget-object v0, p1, Ll/ۖۘ᩻;->֫֫:Ljava/lang/String;

    iput-object v0, p0, Ll/ۖۘ᩻;->֫֫:Ljava/lang/String;

    .line 112
    iget v0, p1, Ll/ۖۘ᩻;->ܳ֫:I

    iput v0, p0, Ll/ۖۘ᩻;->ܳ֫:I

    .line 113
    iget-object v0, p1, Ll/ۖۘ᩻;->᩻֫:Ljava/lang/String;

    iput-object v0, p0, Ll/ۖۘ᩻;->᩻֫:Ljava/lang/String;

    .line 114
    iget-object v0, p1, Ll/ۖۘ᩻;->ܿ֫:Ljava/lang/String;

    iput-object v0, p0, Ll/ۖۘ᩻;->ܿ֫:Ljava/lang/String;

    .line 115
    iget-object v0, p1, Ll/ۖۘ᩻;->ۧ֫:Ljava/lang/String;

    iput-object v0, p0, Ll/ۖۘ᩻;->ۧ֫:Ljava/lang/String;

    .line 116
    iget-object v0, p1, Ll/ۖۘ᩻;->ܽ֫:Ljava/lang/String;

    iput-object v0, p0, Ll/ۖۘ᩻;->ܽ֫:Ljava/lang/String;

    .line 117
    iget-boolean p1, p1, Ll/ۖۘ᩻;->ᩳ֫:Z

    iput-boolean p1, p0, Ll/ۖۘ᩻;->ᩳ֫:Z

    :cond_0
    return-void
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 1

    .line 92
    iget-object v0, p0, Ll/ۖۘ᩻;->ܽ֫:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Ll/ۖۘ᩻;->ܽ֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ܳ()Lbin/mt/json/JSONObject;
    .locals 3

    .line 80
    invoke-super {p0}, Ll/ۗ᩻᩻;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "1"

    .line 81
    iget-object v2, p0, Ll/ۖۘ᩻;->֫֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "2"

    .line 82
    iget v2, p0, Ll/ۖۘ᩻;->ܳ֫:I

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    const-string v1, "3"

    .line 83
    iget-object v2, p0, Ll/ۖۘ᩻;->᩻֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "4"

    .line 84
    iget-object v2, p0, Ll/ۖۘ᩻;->ܿ֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "5"

    .line 85
    iget-object v2, p0, Ll/ۖۘ᩻;->ۧ֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "6"

    .line 86
    iget-object v2, p0, Ll/ۖۘ᩻;->ܽ֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "7"

    .line 87
    iget-boolean v2, p0, Ll/ۖۘ᩻;->ᩳ֫:Z

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 151
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 166
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const v0, 0x7f1204c8

    .line 97
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
