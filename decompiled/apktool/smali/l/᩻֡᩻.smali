.class public final Ll/᩻֡᩻;
.super Ll/ۗ᩻᩻;
.source "QA0A"


# instance fields
.field public ֫֫:Ljava/lang/String;

.field public ۧ֫:Ljava/lang/String;

.field public ܽ֫:Ljava/lang/String;

.field public ܿ֫:Ljava/lang/String;

.field public ᩳ֫:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 54
    invoke-direct {p0, p1}, Ll/ۗ᩻᩻;-><init>(I)V

    const-string p1, ""

    .line 47
    iput-object p1, p0, Ll/᩻֡᩻;->ۧ֫:Ljava/lang/String;

    const/16 v0, 0x1bd

    .line 48
    iput v0, p0, Ll/᩻֡᩻;->ᩳ֫:I

    .line 49
    iput-object p1, p0, Ll/᩻֡᩻;->֫֫:Ljava/lang/String;

    .line 50
    iput-object p1, p0, Ll/᩻֡᩻;->ܿ֫:Ljava/lang/String;

    .line 51
    iput-object p1, p0, Ll/᩻֡᩻;->ܽ֫:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lbin/mt/json/JSONObject;)V
    .locals 2

    const-string v0, "rk"

    const-string v1, "7"

    .line 68
    invoke-static {p1, v0, v1}, Ll/ۗ᩻᩻;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ip"

    const-string v1, "6"

    .line 69
    invoke-static {p1, v0, v1}, Ll/ۗ᩻᩻;->ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "hs"

    const-string v1, "8"

    .line 70
    invoke-static {p1, v0, v1}, Ll/ۗ᩻᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mt"

    const-string v1, "9"

    .line 71
    invoke-static {p1, v0, v1}, Ll/ۗ᩻᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    invoke-direct {p0, p1}, Ll/ۗ᩻᩻;-><init>(Lbin/mt/json/JSONObject;)V

    const-string v0, ""

    .line 47
    iput-object v0, p0, Ll/᩻֡᩻;->ۧ֫:Ljava/lang/String;

    const/16 v1, 0x1bd

    .line 48
    iput v1, p0, Ll/᩻֡᩻;->ᩳ֫:I

    .line 49
    iput-object v0, p0, Ll/᩻֡᩻;->֫֫:Ljava/lang/String;

    .line 50
    iput-object v0, p0, Ll/᩻֡᩻;->ܿ֫:Ljava/lang/String;

    .line 51
    iput-object v0, p0, Ll/᩻֡᩻;->ܽ֫:Ljava/lang/String;

    const-string v0, "1"

    .line 59
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/᩻֡᩻;->ۧ֫:Ljava/lang/String;

    const-string v0, "2"

    .line 60
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Ll/᩻֡᩻;->ᩳ֫:I

    const-string v0, "3"

    .line 61
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/᩻֡᩻;->֫֫:Ljava/lang/String;

    const-string v0, "4"

    .line 62
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/᩻֡᩻;->ܿ֫:Ljava/lang/String;

    const-string v0, "5"

    .line 63
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩻֡᩻;->ܽ֫:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ᩴۡ᩵;
    .locals 2

    .line 180
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 10
    invoke-static {}, Ll/ܿܺ᩵;->ۘ()Ll/ܿܺ᩵;

    move-result-object p0

    .line 181
    invoke-virtual {p0}, Ll/֫ܺ᩵;->ۧ()Ll/ᩴۡ᩵;

    move-result-object p0

    return-object p0

    :cond_0
    const-string v0, "guest"

    .line 182
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 10
    invoke-static {}, Ll/ܿܺ᩵;->ۘ()Ll/ܿܺ᩵;

    move-result-object p0

    .line 183
    invoke-virtual {p0}, Ll/֫ܺ᩵;->ܺ()Ll/ᩴۡ᩵;

    move-result-object p0

    return-object p0

    .line 14
    :cond_1
    new-instance v0, Ll/ᩴۚ᩵;

    .line 106
    sget-object v1, Ll/ۘۚ᩵;->ۙ:Ll/ۘۚ᩵;

    invoke-direct {v0, p0, p1, p2, v1}, Ll/ᩴۚ᩵;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ۘۚ᩵;)V

    .line 10
    invoke-static {}, Ll/ܿܺ᩵;->ۘ()Ll/ܿܺ᩵;

    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    new-instance p1, Ll/ܽܺ᩵;

    invoke-direct {p1, p0, v0}, Ll/ܽܺ᩵;-><init>(Ll/֫ܺ᩵;Ll/ۛ֡᩵;)V

    return-object p1
.end method

.method public static ֫(Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Ll/ۗۘ;Ll/ۗۘ;Ll/ۙ᩻᩻;)Ll/᩻֡᩻;
    .locals 2

    .line 252
    invoke-static {p0}, Ll/ۗ᩻᩻;->ۧ(Landroid/widget/EditText;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 253
    new-instance v0, Ll/᩻֡᩻;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Ll/᩻֡᩻;-><init>(I)V

    .line 363
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 254
    iput-object p0, v0, Ll/᩻֡᩻;->ۧ֫:Ljava/lang/String;

    .line 363
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

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
    const/16 p0, 0x1bd

    .line 255
    :goto_0
    iput p0, v0, Ll/᩻֡᩻;->ᩳ֫:I

    .line 363
    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 256
    iput-object p0, v0, Ll/᩻֡᩻;->֫֫:Ljava/lang/String;

    .line 363
    invoke-virtual {p3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 257
    iput-object p0, v0, Ll/᩻֡᩻;->ܿ֫:Ljava/lang/String;

    .line 363
    invoke-virtual {p4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 258
    iput-object p0, v0, Ll/᩻֡᩻;->ܽ֫:Ljava/lang/String;

    .line 363
    invoke-virtual {p5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 259
    iput-object p0, v0, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    .line 260
    iget-object p0, v0, Ll/᩻֡᩻;->֫֫:Ljava/lang/String;

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    iget-object p0, v0, Ll/᩻֡᩻;->ۧ֫:Ljava/lang/String;

    goto :goto_1

    :cond_0
    iget-object p0, v0, Ll/᩻֡᩻;->֫֫:Ljava/lang/String;

    :goto_1
    invoke-static {p6, p0}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    .line 261
    invoke-virtual {p7}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p0

    iput-boolean p0, v0, Ll/ۗ᩻᩻;->᩹:Z

    .line 262
    invoke-virtual {p8}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p0

    iput-boolean p0, v0, Ll/ۗ᩻᩻;->ۛ:Z

    .line 263
    invoke-virtual {v0, p9}, Ll/ۗ᩻᩻;->ۧ(Ll/ۗ᩻᩻;)V

    return-object v0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/ۗܺ᩷;Ll/᩻֡᩻;)V
    .locals 14

    const v0, 0x7f0d00f8

    .line 210
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0631

    .line 211
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f0a026d

    .line 212
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Landroid/widget/EditText;

    const v2, 0x7f0a0446

    .line 213
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Landroid/widget/EditText;

    const v2, 0x7f0a015b

    .line 214
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Landroid/widget/EditText;

    const v2, 0x7f0a0670

    .line 215
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    const v3, 0x7f0a0429

    .line 216
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Landroid/widget/EditText;

    const v3, 0x7f0a04a5

    .line 217
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Landroid/widget/EditText;

    const v3, 0x7f0a04a4

    .line 218
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Landroid/widget/EditText;

    const v3, 0x7f0a025f

    .line 219
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Ll/ۗۘ;

    const v3, 0x7f0a03d2

    .line 220
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v12, v3

    check-cast v12, Ll/ۗۘ;

    const v3, 0x7f0a05d0

    .line 221
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/google/android/material/textfield/TextInputLayout;

    .line 222
    new-instance v7, Ll/ۧ֡᩻;

    invoke-direct {v7, p0, v4, v5, v10}, Ll/ۧ֡᩻;-><init>(Ll/ۗܺ᩷;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;)V

    invoke-virtual {v3, v7}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconOnClickListener(Landroid/view/View$OnClickListener;)V

    const v3, 0x7f0a062d

    .line 227
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    invoke-static {p0, v3, p1}, Ll/ۙ᩻᩻;->֫(Ll/ۗܺ᩷;Landroid/widget/TextView;Ll/ۗ᩻᩻;)Ll/ۙ᩻᩻;

    move-result-object v13

    .line 229
    iget v3, p1, Ll/ۗ᩻᩻;->᩶:I

    const/4 v7, -0x1

    if-ne v3, v7, :cond_0

    const v3, 0x7f1205ad

    goto :goto_0

    :cond_0
    const v3, 0x7f1202dd

    :goto_0
    invoke-static {v3}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v3

    const-string v7, " SMB"

    invoke-virtual {v3, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 230
    iget-object v1, p1, Ll/᩻֡᩻;->ۧ֫:Ljava/lang/String;

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 231
    iget v1, p1, Ll/᩻֡᩻;->ᩳ֫:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 232
    iget-object v1, p1, Ll/᩻֡᩻;->֫֫:Ljava/lang/String;

    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 233
    iget-object v1, p1, Ll/᩻֡᩻;->ܿ֫:Ljava/lang/String;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 234
    iget-object v1, p1, Ll/᩻֡᩻;->ܽ֫:Ljava/lang/String;

    invoke-virtual {v8, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 235
    iget-object v1, p1, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    invoke-virtual {v9, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 236
    iget-object v1, p1, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    invoke-virtual {v10, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 237
    iget-boolean v1, p1, Ll/ۗ᩻᩻;->᩹:Z

    invoke-virtual {v11, v1}, Ll/ۗۘ;->setChecked(Z)V

    .line 238
    iget-boolean v1, p1, Ll/ۗ᩻᩻;->ۛ:Z

    invoke-virtual {v12, v1}, Ll/ۗۘ;->setChecked(Z)V

    .line 588
    new-instance v1, Ll/֫۬ܳ;

    const/4 v3, 0x1

    invoke-direct {v1, v3}, Ll/֫۬ܳ;-><init>(I)V

    invoke-virtual {v12, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 240
    new-instance v1, Ll/ۛۜ᩷;

    const/4 v3, 0x2

    invoke-direct {v1, v3, v6}, Ll/ۛۜ᩷;-><init>(ILjava/lang/Object;)V

    invoke-static {v4, v10, v1}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;Landroid/widget/EditText;Ljava/util/function/Function;)V

    .line 241
    new-instance v1, Ll/ۘᩳ֨;

    invoke-direct {v1, v3, v4}, Ll/ۘᩳ֨;-><init>(ILjava/lang/Object;)V

    invoke-static {v6, v10, v1}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;Landroid/widget/EditText;Ljava/util/function/Function;)V

    .line 242
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v0, 0x7f1205fc

    const/4 v3, 0x0

    .line 243
    invoke-virtual {v1, v0, v3}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f12015e

    .line 244
    invoke-virtual {v1, v0, v3}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f1206b8

    .line 245
    invoke-virtual {v1, v0, v3}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    const/4 v0, 0x0

    .line 246
    invoke-virtual {v1, v0}, Ll/᩵ۚۢ;->֫(Z)V

    .line 247
    invoke-virtual {v1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v0

    .line 248
    invoke-static {v0}, Ll/ۚۗܿ;->֫(Ll/֡ۚۢ;)V

    .line 249
    invoke-static {v4}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    .line 251
    new-instance v1, Ll/ܽ֡᩻;

    move-object v3, v1

    move-object v7, v2

    invoke-direct/range {v3 .. v13}, Ll/ܽ֡᩻;-><init>(Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Ll/ۗۘ;Ll/ۗۘ;Ll/ۙ᩻᩻;)V

    .line 268
    invoke-virtual {v0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v3

    new-instance v4, Ll/ۨ᩻ۡ;

    const/4 v5, 0x1

    invoke-direct {v4, v1, p1, v0, v5}, Ll/ۨ᩻ۡ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 283
    invoke-virtual {v0}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Ll/ᩳ֡᩻;

    invoke-direct {v0, v1, p0, v2}, Ll/ᩳ֡᩻;-><init>(Ll/ܽ֡᩻;Ll/ۗܺ᩷;Landroid/widget/EditText;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܽ֡᩻;Ll/᩻֡᩻;Ll/֡ۚۢ;)V
    .locals 2

    .line 269
    invoke-virtual {p0}, Ll/ܽ֡᩻;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩻֡᩻;

    if-nez p0, :cond_0

    return-void

    .line 273
    :cond_0
    iget v0, p1, Ll/ۗ᩻᩻;->᩶:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 274
    new-instance p1, Ll/᩻֡᩻;

    invoke-static {}, Ll/ۗ᩻᩻;->᩷()I

    move-result v0

    invoke-direct {p1, v0}, Ll/᩻֡᩻;-><init>(I)V

    .line 275
    invoke-virtual {p1, p0}, Ll/᩻֡᩻;->֫(Ll/ۗ᩻᩻;)V

    .line 276
    invoke-static {p1}, Ll/۫᩻᩻;->֫(Ll/ۗ᩻᩻;)V

    goto :goto_0

    .line 278
    :cond_1
    invoke-virtual {p1, p0}, Ll/᩻֡᩻;->֫(Ll/ۗ᩻᩻;)V

    .line 279
    invoke-static {}, Ll/۫᩻᩻;->֫()V

    .line 281
    :goto_0
    invoke-virtual {p2}, Ll/֡ۚۢ;->dismiss()V

    return-void
.end method

.method public static ۧ(Ll/ۗܺ᩷;)V
    .locals 2

    .line 205
    new-instance v0, Ll/᩻֡᩻;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Ll/᩻֡᩻;-><init>(I)V

    invoke-static {p0, v0}, Ll/᩻֡᩻;->֫(Ll/ۗܺ᩷;Ll/᩻֡᩻;)V

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
    const-class v2, Ll/᩻֡᩻;

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
    check-cast p1, Ll/᩻֡᩻;

    .line 137
    iget v2, p0, Ll/᩻֡᩻;->ᩳ֫:I

    iget v3, p1, Ll/᩻֡᩻;->ᩳ֫:I

    if-ne v2, v3, :cond_3

    iget-object v2, p0, Ll/᩻֡᩻;->ۧ֫:Ljava/lang/String;

    iget-object v3, p1, Ll/᩻֡᩻;->ۧ֫:Ljava/lang/String;

    .line 138
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ll/᩻֡᩻;->֫֫:Ljava/lang/String;

    iget-object v3, p1, Ll/᩻֡᩻;->֫֫:Ljava/lang/String;

    .line 139
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ll/᩻֡᩻;->ܿ֫:Ljava/lang/String;

    iget-object v3, p1, Ll/᩻֡᩻;->ܿ֫:Ljava/lang/String;

    .line 140
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ll/᩻֡᩻;->ܽ֫:Ljava/lang/String;

    iget-object p1, p1, Ll/᩻֡᩻;->ܽ֫:Ljava/lang/String;

    .line 141
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

    .line 191
    sget-object v0, Ll/᩶ۖܳ;->۠֫:Ll/᩶ۖܳ;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 106
    iget-object v0, p0, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    .line 146
    invoke-super {p0}, Ll/ۗ᩻᩻;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    .line 147
    iget-object v2, p0, Ll/᩻֡᩻;->ۧ֫:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 148
    iget v2, p0, Ll/᩻֡᩻;->ᩳ֫:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 149
    iget-object v2, p0, Ll/᩻֡᩻;->֫֫:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 150
    iget-object v2, p0, Ll/᩻֡᩻;->ܿ֫:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 151
    iget-object v1, p0, Ll/᩻֡᩻;->ܽ֫:Ljava/lang/String;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final ֫()Ljava/lang/String;
    .locals 4

    .line 77
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "smb://"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩻֡᩻;->ܿ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    iget-object v1, p0, Ll/᩻֡᩻;->֫֫:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const-string v2, ":"

    if-nez v1, :cond_0

    .line 79
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩻֡᩻;->֫֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    const-string v1, "@"

    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩻֡᩻;->ۧ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    iget v1, p0, Ll/᩻֡᩻;->ᩳ֫:I

    const/16 v3, 0x1bd

    if-eq v1, v3, :cond_1

    .line 83
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩻֡᩻;->ᩳ֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)Ll/ۗۢ᩻;
    .locals 2

    .line 157
    new-instance v0, Ll/۬֡᩻;

    invoke-virtual {p0}, Ll/ۗ᩻᩻;->clone()Ll/ۗ᩻᩻;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ll/۬֡᩻;-><init>(ILl/ۗ᩻᩻;)V

    return-object v0
.end method

.method public final ֫(Ll/ۗܺ᩷;)V
    .locals 0

    .line 201
    invoke-static {p1, p0}, Ll/᩻֡᩻;->֫(Ll/ۗܺ᩷;Ll/᩻֡᩻;)V

    return-void
.end method

.method public final ֫(Ll/ۗ᩻᩻;)V
    .locals 1

    .line 119
    invoke-super {p0, p1}, Ll/ۗ᩻᩻;->֫(Ll/ۗ᩻᩻;)V

    .line 120
    instance-of v0, p1, Ll/᩻֡᩻;

    if-eqz v0, :cond_0

    check-cast p1, Ll/᩻֡᩻;

    .line 123
    iget-object v0, p1, Ll/᩻֡᩻;->ۧ֫:Ljava/lang/String;

    iput-object v0, p0, Ll/᩻֡᩻;->ۧ֫:Ljava/lang/String;

    .line 124
    iget v0, p1, Ll/᩻֡᩻;->ᩳ֫:I

    iput v0, p0, Ll/᩻֡᩻;->ᩳ֫:I

    .line 125
    iget-object v0, p1, Ll/᩻֡᩻;->֫֫:Ljava/lang/String;

    iput-object v0, p0, Ll/᩻֡᩻;->֫֫:Ljava/lang/String;

    .line 126
    iget-object v0, p1, Ll/᩻֡᩻;->ܿ֫:Ljava/lang/String;

    iput-object v0, p0, Ll/᩻֡᩻;->ܿ֫:Ljava/lang/String;

    .line 127
    iget-object p1, p1, Ll/᩻֡᩻;->ܽ֫:Ljava/lang/String;

    iput-object p1, p0, Ll/᩻֡᩻;->ܽ֫:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public final ܳ()Lbin/mt/json/JSONObject;
    .locals 3

    .line 90
    invoke-super {p0}, Ll/ۗ᩻᩻;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "1"

    .line 91
    iget-object v2, p0, Ll/᩻֡᩻;->ۧ֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "2"

    .line 92
    iget v2, p0, Ll/᩻֡᩻;->ᩳ֫:I

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    const-string v1, "3"

    .line 93
    iget-object v2, p0, Ll/᩻֡᩻;->֫֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "4"

    .line 94
    iget-object v2, p0, Ll/᩻֡᩻;->ܿ֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "5"

    .line 95
    iget-object v2, p0, Ll/᩻֡᩻;->ܽ֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 3

    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "smb://"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩻֡᩻;->ܿ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩻֡᩻;->ۧ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/"

    .line 112
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

    .line 196
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "smb@"

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

    const-string v0, "SMB"

    return-object v0
.end method
