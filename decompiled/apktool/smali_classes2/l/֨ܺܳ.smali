.class public final Ll/֨ܺܳ;
.super Ll/ܶ۬ܿ;
.source "47JB"


# instance fields
.field public final synthetic ۜ:Ll/۫ܺܳ;

.field public final synthetic ᩷:I

.field public final synthetic ᩻:Ll/ۗܺܳ;


# direct methods
.method public constructor <init>(Ll/ۗܺܳ;Ll/ۗܺܳ;ILl/۫ܺܳ;)V
    .locals 0

    .line 242
    iput-object p1, p0, Ll/֨ܺܳ;->᩻:Ll/ۗܺܳ;

    iput p3, p0, Ll/֨ܺܳ;->᩷:I

    iput-object p4, p0, Ll/֨ܺܳ;->ۜ:Ll/۫ܺܳ;

    invoke-direct {p0, p2}, Ll/ܶ۬ܿ;-><init>(Ll/ۗܺ᩷;)V

    return-void
.end method


# virtual methods
.method public final ܽ()Z
    .locals 12

    const/4 v0, 0x0

    .line 245
    invoke-virtual {p0, v0}, Ll/ܶ۬ܿ;->ۧ(I)Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v1

    const/4 v2, 0x1

    .line 246
    invoke-virtual {p0, v2}, Ll/ܶ۬ܿ;->ۧ(I)Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v3

    .line 247
    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v4

    invoke-static {v4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    invoke-virtual {v3}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v5

    invoke-static {v5}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    invoke-virtual {v4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    .line 250
    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 251
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_0

    return v2

    .line 254
    :cond_0
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    const/high16 v7, 0x41000000    # 8.0f

    const/4 v8, -0x1

    iget-object v9, p0, Ll/֨ܺܳ;->᩻:Ll/ۗܺܳ;

    if-eqz v6, :cond_1

    const v2, 0x7f120305

    .line 255
    invoke-virtual {v9, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 256
    invoke-static {v7}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v1

    .line 27
    :goto_0
    invoke-static {v3, v8, v1, v8, v8}, Ll/ۢ᩹ۡ;->֫(Landroid/view/View;IIII)V

    return v0

    .line 260
    :cond_1
    invoke-static {v9}, Ll/ۗܺܳ;->ܽ(Ll/ۗܺܳ;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    const/4 v10, 0x0

    :goto_1
    if-ge v10, v6, :cond_3

    .line 261
    invoke-static {v9}, Ll/ۗܺܳ;->ܽ(Ll/ۗܺܳ;)Ljava/util/List;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/۫ܺܳ;

    .line 210
    iget-object v11, v11, Ll/۫ܺܳ;->ۧ:Ljava/lang/String;

    .line 262
    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_3
    const/4 v10, -0x1

    .line 267
    :goto_2
    iget v6, p0, Ll/֨ܺܳ;->᩷:I

    if-eq v10, v8, :cond_4

    if-eq v10, v6, :cond_4

    const v2, 0x7f1201a6

    .line 268
    invoke-virtual {v9, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 269
    invoke-static {v7}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v1

    goto :goto_0

    :cond_4
    if-ne v6, v8, :cond_5

    .line 273
    invoke-static {v9}, Ll/ۗܺܳ;->ܽ(Ll/ۗܺܳ;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ll/۫ܺܳ;

    invoke-direct {v1, v4, v5}, Ll/۫ܺܳ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 274
    invoke-static {v9}, Ll/ۗܺܳ;->֫(Ll/ۗܺܳ;)Ll/ܶܺܳ;

    move-result-object v0

    invoke-static {v9}, Ll/ۗܺܳ;->ܽ(Ll/ۗܺܳ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ll/᩶ۗۧ;->notifyItemInserted(I)V

    goto :goto_3

    .line 276
    :cond_5
    iget-object v0, p0, Ll/֨ܺܳ;->ۜ:Ll/۫ܺܳ;

    iput-object v4, v0, Ll/۫ܺܳ;->ۧ:Ljava/lang/String;

    .line 277
    iput-object v5, v0, Ll/۫ܺܳ;->֫:Ljava/lang/String;

    .line 278
    invoke-static {v9}, Ll/ۗܺܳ;->֫(Ll/ۗܺܳ;)Ll/ܶܺܳ;

    move-result-object v0

    invoke-virtual {v0, v6}, Ll/᩶ۗۧ;->notifyItemChanged(I)V

    .line 280
    :goto_3
    invoke-static {}, Ll/ۤܺܳ;->ܳ()V

    return v2
.end method
