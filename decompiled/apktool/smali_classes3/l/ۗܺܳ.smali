.class public Ll/ۗܺܳ;
.super Ll/ۗܺ᩷;
.source "47JB"


# static fields
.field public static volatile ۜۧ:Ll/᩸ܺܳ;

.field public static final synthetic ᩻ۧ:I


# instance fields
.field public final ܳۧ:Ljava/util/List;

.field public ܿۧ:Ll/֫ۗۧ;

.field public ᩳۧ:Ll/ܶܺܳ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 46
    invoke-direct {p0}, Ll/ۗܺ᩷;-><init>()V

    .line 54
    invoke-static {}, Ll/ۤܺܳ;->ܽ()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ۗܺܳ;->ܳۧ:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۗܺܳ;)Ll/ܶܺܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗܺܳ;->ᩳۧ:Ll/ܶܺܳ;

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 78
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 82
    :cond_0
    new-instance v0, Ll/᩸ܺܳ;

    invoke-direct {v0, p0, p1}, Ll/᩸ܺܳ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Ll/ۗܺܳ;->ۜۧ:Ll/᩸ܺܳ;

    return-void

    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 79
    sput-object p0, Ll/ۗܺܳ;->ۜۧ:Ll/᩸ܺܳ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۗܺܳ;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ۗܺܳ;->ᩳ(I)V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۗܺܳ;)Ll/֫ۗۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗܺܳ;->ܿۧ:Ll/֫ۗۧ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۗܺܳ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗܺܳ;->ܳۧ:Ljava/util/List;

    return-object p0
.end method

.method private ᩳ(I)V
    .locals 4

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 241
    new-instance v1, Ll/۫ܺܳ;

    const-string v2, ""

    invoke-direct {v1, v2, v2}, Ll/۫ܺܳ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ll/ۗܺܳ;->ܳۧ:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫ܺܳ;

    .line 242
    :goto_0
    new-instance v2, Ll/֨ܺܳ;

    invoke-direct {v2, p0, p0, p1, v1}, Ll/֨ܺܳ;-><init>(Ll/ۗܺܳ;Ll/ۗܺܳ;ILl/۫ܺܳ;)V

    if-ne p1, v0, :cond_1

    const p1, 0x7f1205ad

    goto :goto_1

    :cond_1
    const p1, 0x7f1202dd

    .line 283
    :goto_1
    invoke-virtual {v2, p1}, Ll/ܶ۬ܿ;->ܽ(I)V

    const p1, 0x7f1206c2

    .line 210
    iget-object v0, v1, Ll/۫ܺܳ;->ۧ:Ljava/lang/String;

    .line 284
    invoke-virtual {v2, p1, v0}, Ll/ܶ۬ܿ;->֫(ILjava/lang/String;)V

    const p1, 0x7f1206c4

    .line 206
    iget-object v0, v1, Ll/۫ܺܳ;->֫:Ljava/lang/String;

    .line 285
    invoke-virtual {v2, p1, v0}, Ll/ܶ۬ܿ;->֫(ILjava/lang/String;)V

    .line 286
    invoke-virtual {v2}, Ll/ܶ۬ܿ;->ᩳ()V

    .line 67
    new-instance p1, Ll/۟ۤᩳ;

    const/4 v0, 0x4

    invoke-direct {p1, v0, v2}, Ll/۟ۤᩳ;-><init>(ILjava/lang/Object;)V

    const-wide/16 v0, 0xc8

    invoke-static {p1, v0, v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    const/4 p1, 0x0

    .line 288
    invoke-virtual {v2, p1}, Ll/ܶ۬ܿ;->ۧ(I)Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v0

    const/4 v1, 0x1

    .line 289
    invoke-virtual {v2, v1}, Ll/ܶ۬ܿ;->ۧ(I)Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v1

    .line 290
    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v2

    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Ll/۠ܺܳ;

    invoke-direct {v3, v0, v1}, Ll/۠ܺܳ;-><init>(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;)V

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 299
    invoke-virtual {v1, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setExpandedHintEnabled(Z)V

    .line 300
    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object p1

    const v0, 0x7f120728

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setHint(I)V

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 100
    invoke-super {p0, p1}, Ll/ۗܺ᩷;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0d004d

    .line 101
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f1201a7

    .line 102
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f0a063a

    .line 103
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/ۢᩴ;

    iput-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    .line 104
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->֫(Ll/ۢᩴ;)V

    .line 105
    invoke-virtual {p0}, Ll/ۗܺ᩷;->ۗ()V

    .line 106
    iget-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    new-instance v0, Ll/۬᩸ۢ;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Ll/۬᩸ۢ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Ll/ۢᩴ;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f0a0486

    .line 107
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/۬۬ۧ;

    const v0, 0x7f0a0191

    .line 108
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f1206eb

    .line 109
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 110
    new-instance v1, Ll/ܶܺܳ;

    invoke-direct {v1, p0}, Ll/ܶܺܳ;-><init>(Ll/ۗܺܳ;)V

    iput-object v1, p0, Ll/ۗܺܳ;->ᩳۧ:Ll/ܶܺܳ;

    .line 111
    new-instance v2, Ll/֡ܺܳ;

    invoke-direct {v2, p0, v0}, Ll/֡ܺܳ;-><init>(Ll/ۗܺܳ;Landroid/widget/TextView;)V

    invoke-virtual {v1, v2}, Ll/᩶ۗۧ;->registerAdapterDataObserver(Ll/ۗۗۧ;)V

    .line 142
    iget-object v1, p0, Ll/ۗܺܳ;->ܳۧ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 143
    iget-object v0, p0, Ll/ۗܺܳ;->ᩳۧ:Ll/ܶܺܳ;

    invoke-virtual {p1, v0}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    .line 144
    new-instance v0, Ll/֫ۗۧ;

    new-instance v1, Ll/ۚܺܳ;

    invoke-direct {v1, p0}, Ll/ۚܺܳ;-><init>(Ll/ۗܺܳ;)V

    invoke-direct {v0, v1}, Ll/֫ۗۧ;-><init>(Ll/ۤۙۧ;)V

    iput-object v0, p0, Ll/ۗܺܳ;->ܿۧ:Ll/֫ۗۧ;

    .line 181
    invoke-virtual {v0, p1}, Ll/֫ۗۧ;->֫(Ll/۬۬ۧ;)V

    return-void
.end method

.method public final onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 4

    const v0, 0x7f0a0327

    const v1, 0x7f1205ad

    const/4 v2, 0x0

    .line 186
    invoke-interface {p1, v2, v0, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x2

    .line 187
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setShowAsAction(I)V

    const v3, 0x7f0801a4

    .line 188
    invoke-interface {v0, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const v0, 0x7f0a0363

    const v3, 0x7f1202dd

    .line 191
    invoke-interface {p1, v2, v0, v2, v3}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    .line 192
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setShowAsAction(I)V

    const v3, 0x7f0801ad

    .line 193
    invoke-interface {v0, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const v0, 0x7f0a0355

    const v3, 0x7f120385

    .line 195
    invoke-interface {p1, v2, v0, v2, v3}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    .line 196
    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setShowAsAction(I)V

    const v0, 0x7f0801b8

    .line 197
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const/4 p1, 0x1

    return p1
.end method

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 8

    .line 204
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f0a0327

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    const/4 p1, -0x1

    .line 205
    invoke-direct {p0, p1}, Ll/ۗܺܳ;->ᩳ(I)V

    return v2

    .line 207
    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f0a0363

    if-ne v0, v1, :cond_1

    .line 209
    new-instance p1, Landroid/content/Intent;

    const-class v0, Ll/᩷᩻ܳ;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V

    return v2

    .line 211
    :cond_1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x7f0a0355

    const/4 v1, 0x0

    if-ne p1, v0, :cond_3

    const p1, 0x7f0d008d

    .line 212
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object p1

    .line 90
    sget-object v0, Ll/ۗܺܳ;->ۜۧ:Ll/᩸ܺܳ;

    if-eqz v0, :cond_2

    const v3, 0x7f0a0264

    .line 216
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 217
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    const/4 v4, 0x0

    const v5, 0x3f866666    # 1.05f

    .line 218
    invoke-virtual {v3, v4, v5}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 219
    new-instance v4, Landroid/text/SpannableStringBuilder;

    invoke-direct {v4}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 220
    iget-object v5, v0, Ll/᩸ܺܳ;->ۧ:Ljava/lang/String;

    invoke-virtual {v4, v5}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 221
    new-instance v5, Landroid/text/style/ForegroundColorSpan;

    sget v6, Ll/᩹֡᩷;->ܳ֫:I

    invoke-direct {v5, v6}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v4}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v6

    const/16 v7, 0x21

    invoke-virtual {v4, v5, v1, v6, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    const-string v1, "\n"

    .line 222
    invoke-virtual {v4, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    iget-object v0, v0, Ll/᩸ܺܳ;->֫:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 223
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 225
    :cond_2
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const p1, 0x7f120189

    const/4 v1, 0x0

    .line 226
    invoke-virtual {v0, p1, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 227
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return v2

    :cond_3
    return v1
.end method

.method public final onResume()V
    .locals 1

    .line 235
    invoke-super {p0}, Ll/ۗܺ᩷;->onResume()V

    .line 237
    iget-object v0, p0, Ll/ۗܺܳ;->ᩳۧ:Ll/ܶܺܳ;

    invoke-virtual {v0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    return-void
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "PasswordManager"

    return-object v0
.end method
