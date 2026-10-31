.class public final Ll/᩸ܰܿ;
.super Ljava/lang/Object;
.source "95HF"

# interfaces
.implements Landroid/view/View$OnLongClickListener;
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public ۗ:Landroid/widget/TextView;

.field public ۙ:Landroid/widget/TextView;

.field public ۬:Landroid/view/ViewGroup;

.field public final synthetic ᩶:Ll/᩶ܰܿ;

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/᩶ܰܿ;II)V
    .locals 0

    .line 174
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ܰܿ;->᩶:Ll/᩶ܰܿ;

    .line 175
    iput p2, p0, Ll/᩸ܰܿ;->᩹:I

    .line 176
    iput p3, p0, Ll/᩸ܰܿ;->᩸:I

    .line 177
    invoke-static {p1}, Ll/᩶ܰܿ;->ܽ(Ll/᩶ܰܿ;)Ll/ۚܰܿ;

    move-result-object p1

    invoke-virtual {p1, p3}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Ll/᩸ܰܿ;->۬:Landroid/view/ViewGroup;

    .line 178
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 179
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    const/4 p2, 0x1

    .line 180
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Ll/᩸ܰܿ;->ۗ:Landroid/widget/TextView;

    const/4 p2, 0x0

    .line 181
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/᩸ܰܿ;->ۙ:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 303
    new-instance p1, Landroid/text/SpannableString;

    iget-object v0, p0, Ll/᩸ܰܿ;->᩶:Ll/᩶ܰܿ;

    invoke-static {v0}, Ll/᩶ܰܿ;->ۧ(Ll/᩶ܰܿ;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 304
    invoke-static {v0}, Ll/᩶ܰܿ;->֫(Ll/᩶ܰܿ;)Landroid/text/style/BackgroundColorSpan;

    move-result-object v1

    iget v2, p0, Ll/᩸ܰܿ;->᩹:I

    mul-int/lit8 v2, v2, 0x3

    add-int/lit8 v2, v2, -0x1

    const/16 v3, 0x21

    const/4 v4, 0x0

    invoke-virtual {p1, v1, v4, v2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 305
    invoke-static {v0}, Ll/᩶ܰܿ;->ۧ(Ll/᩶ܰܿ;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final onLongClick(Landroid/view/View;)Z
    .locals 16

    move-object/from16 v10, p0

    .line 235
    iget-object v0, v10, Ll/᩸ܰܿ;->᩶:Ll/᩶ܰܿ;

    invoke-static {v0}, Ll/᩶ܰܿ;->ܽ(Ll/᩶ܰܿ;)Ll/ۚܰܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۚܰܿ;->۟()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    .line 238
    :cond_0
    invoke-static {v0}, Ll/᩶ܰܿ;->ܽ(Ll/᩶ܰܿ;)Ll/ۚܰܿ;

    move-result-object v1

    iget-object v3, v1, Ll/ۚܰܿ;->᩵ۧ:Ll/ۜܰܿ;

    .line 290
    iget-object v1, v3, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v1}, Ll/ۧܰܿ;->ܿ()Ll/ᩳܽܳ;

    move-result-object v4

    .line 240
    invoke-virtual {v4}, Ll/ᩳܽܳ;->ۖ()J

    move-result-wide v5

    .line 922
    iget-object v1, v3, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v1}, Ll/ۧܰܿ;->᩷()I

    move-result v7

    .line 242
    iget-object v1, v10, Ll/᩸ܰܿ;->ۗ:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v9

    const/4 v1, 0x0

    .line 243
    invoke-virtual {v10, v1}, Ll/᩸ܰܿ;->onClick(Landroid/view/View;)V

    .line 244
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    const v11, 0x7f0d00b9

    invoke-static {v8, v11, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v8

    const v11, 0x7f0a017d

    .line 245
    invoke-virtual {v8, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Landroid/widget/EditText;

    const v12, 0x7f0a0631

    .line 246
    invoke-virtual {v8, v12}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Landroid/widget/TextView;

    const v13, 0x7f0a05e4

    .line 247
    invoke-virtual {v8, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Landroid/widget/TextView;

    .line 248
    iget-object v14, v10, Ll/᩸ܰܿ;->ۙ:Landroid/widget/TextView;

    invoke-virtual {v14}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v14

    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 249
    invoke-virtual {v11, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 250
    invoke-virtual {v11}, Landroid/widget/TextView;->length()I

    move-result v12

    invoke-virtual {v11, v2, v12}, Landroid/widget/EditText;->setSelection(II)V

    const v12, 0x7f0a0527

    const/4 v14, 0x1

    .line 251
    iget v15, v10, Ll/᩸ܰܿ;->᩸:I

    if-eq v15, v12, :cond_5

    const v12, 0x7f0a052a

    if-eq v15, v12, :cond_5

    const v12, 0x7f0a0528

    if-eq v15, v12, :cond_5

    const v12, 0x7f0a0529

    if-ne v15, v12, :cond_1

    goto :goto_1

    :cond_1
    const v12, 0x7f0a065f

    if-eq v15, v12, :cond_4

    const v12, 0x7f0a0662

    if-eq v15, v12, :cond_4

    const v12, 0x7f0a0660

    if-eq v15, v12, :cond_4

    const v12, 0x7f0a0661

    if-ne v15, v12, :cond_2

    goto :goto_0

    :cond_2
    const v2, 0x7f0a025c

    if-eq v15, v2, :cond_3

    const v2, 0x7f0a025b

    if-ne v15, v2, :cond_6

    :cond_3
    const-string v2, "0123456789-.eE"

    .line 256
    invoke-static {v2}, Landroid/text/method/DigitsKeyListener;->getInstance(Ljava/lang/String;)Landroid/text/method/DigitsKeyListener;

    move-result-object v2

    invoke-virtual {v11, v2}, Landroid/widget/TextView;->setKeyListener(Landroid/text/method/KeyListener;)V

    goto :goto_2

    .line 254
    :cond_4
    :goto_0
    invoke-static {v2, v2}, Landroid/text/method/DigitsKeyListener;->getInstance(ZZ)Landroid/text/method/DigitsKeyListener;

    move-result-object v2

    invoke-virtual {v11, v2}, Landroid/widget/TextView;->setKeyListener(Landroid/text/method/KeyListener;)V

    goto :goto_2

    .line 252
    :cond_5
    :goto_1
    invoke-static {v14, v2}, Landroid/text/method/DigitsKeyListener;->getInstance(ZZ)Landroid/text/method/DigitsKeyListener;

    move-result-object v2

    invoke-virtual {v11, v2}, Landroid/widget/TextView;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 258
    :cond_6
    :goto_2
    new-instance v2, Ll/᩹ܰܿ;

    invoke-static {v0}, Ll/᩶ܰܿ;->ᩳ(Ll/᩶ܰܿ;)Landroid/widget/CompoundButton;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    invoke-direct {v2, v11, v13, v15, v0}, Ll/᩹ܰܿ;-><init>(Landroid/widget/EditText;Landroid/widget/TextView;IZ)V

    .line 259
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v12, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v12, Ll/᩵ۚۢ;

    invoke-direct {v12, v0}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 260
    invoke-virtual {v12, v8}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v0, 0x7f12070a

    .line 261
    invoke-virtual {v12, v0, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f12015e

    .line 262
    invoke-virtual {v12, v0, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 263
    invoke-virtual {v12}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v8

    .line 264
    invoke-virtual {v8}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v12

    new-instance v13, Ll/ܶܰܿ;

    move-object v0, v13

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v9}, Ll/ܶܰܿ;-><init>(Ll/᩸ܰܿ;Ll/᩹ܰܿ;Ll/ۜܰܿ;Ll/ᩳܽܳ;JILl/֡ۚۢ;Ljava/lang/String;)V

    invoke-virtual {v12, v13}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 297
    invoke-static {v11}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    return v14
.end method

.method public final ֫([B)J
    .locals 7

    .line 219
    iget-object v0, p0, Ll/᩸ܰܿ;->᩶:Ll/᩶ܰܿ;

    invoke-static {v0}, Ll/᩶ܰܿ;->ᩳ(Ll/᩶ܰܿ;)Landroid/widget/CompoundButton;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    const/16 v1, 0x8

    iget v2, p0, Ll/᩸ܰܿ;->᩹:I

    const-wide/16 v3, 0x0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    shl-long/2addr v3, v1

    .line 222
    aget-byte v5, p1, v0

    and-int/lit16 v5, v5, 0xff

    int-to-long v5, v5

    or-long/2addr v3, v5

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-wide v3

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, -0x1

    if-ltz v2, :cond_2

    shl-long/2addr v3, v1

    .line 227
    aget-byte v0, p1, v2

    and-int/lit16 v0, v0, 0xff

    int-to-long v5, v0

    or-long/2addr v3, v5

    goto :goto_1

    :cond_2
    return-wide v3
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 202
    iget-object v0, p0, Ll/᩸ܰܿ;->ۗ:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(I)Z
    .locals 4

    .line 185
    iget v0, p0, Ll/᩸ܰܿ;->᩹:I

    iget-object v1, p0, Ll/᩸ܰܿ;->۬:Landroid/view/ViewGroup;

    iget-object v2, p0, Ll/᩸ܰܿ;->ۙ:Landroid/widget/TextView;

    iget-object v3, p0, Ll/᩸ܰܿ;->ۗ:Landroid/widget/TextView;

    if-lt p1, v0, :cond_0

    const/4 p1, 0x1

    .line 186
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setEnabled(Z)V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 187
    invoke-virtual {v3, v0}, Landroid/view/View;->setAlpha(F)V

    .line 188
    invoke-virtual {v2, v0}, Landroid/view/View;->setAlpha(F)V

    .line 189
    invoke-virtual {v1, p1}, Landroid/view/View;->setEnabled(Z)V

    return p1

    :cond_0
    const-string p1, "----"

    .line 192
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p1, 0x0

    .line 193
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setEnabled(Z)V

    const v0, 0x3e99999a    # 0.3f

    .line 194
    invoke-virtual {v3, v0}, Landroid/view/View;->setAlpha(F)V

    .line 195
    invoke-virtual {v2, v0}, Landroid/view/View;->setAlpha(F)V

    .line 196
    invoke-virtual {v1, p1}, Landroid/view/View;->setEnabled(Z)V

    return p1
.end method
