.class public final synthetic Ll/᩷ۜܳ;
.super Ljava/lang/Object;
.source "C76R"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۗ:Z

.field public final synthetic ۙ:Lcom/google/android/material/textfield/TextInputLayout;

.field public final synthetic ۫:Ll/֡ۚۢ;

.field public final synthetic ۬:Ll/֡ۜܳ;

.field public final synthetic ᩶:Lcom/google/android/material/textfield/TextInputLayout;

.field public final synthetic ᩸:Landroid/widget/EditText;

.field public final synthetic ᩹:Landroid/widget/EditText;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;Landroid/widget/EditText;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;ZLl/֡ۜܳ;Ll/֡ۚۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ۜܳ;->᩸:Landroid/widget/EditText;

    iput-object p2, p0, Ll/᩷ۜܳ;->᩹:Landroid/widget/EditText;

    iput-object p3, p0, Ll/᩷ۜܳ;->᩶:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p4, p0, Ll/᩷ۜܳ;->ۙ:Lcom/google/android/material/textfield/TextInputLayout;

    iput-boolean p5, p0, Ll/᩷ۜܳ;->ۗ:Z

    iput-object p6, p0, Ll/᩷ۜܳ;->۬:Ll/֡ۜܳ;

    iput-object p7, p0, Ll/᩷ۜܳ;->۫:Ll/֡ۚۢ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 14

    .line 170
    iget-object p1, p0, Ll/᩷ۜܳ;->᩸:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 171
    iget-object v1, p0, Ll/᩷ۜܳ;->᩹:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 172
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    iget-object v4, p0, Ll/᩷ۜܳ;->᩶:Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 173
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    const p1, 0x7f120302

    .line 174
    invoke-static {p1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    return-void

    .line 177
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    const-wide/16 v5, -0x1

    if-eqz v3, :cond_1

    move-wide v7, v5

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ll/ۚۜܳ;->ۧ(Ljava/lang/String;)J

    move-result-wide v7

    .line 178
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    const v9, 0x7f12022a

    const-wide/16 v10, 0x0

    if-nez v3, :cond_2

    cmp-long v3, v7, v10

    if-gez v3, :cond_2

    .line 179
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 180
    invoke-static {v9}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    return-void

    .line 183
    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    move-wide v12, v5

    goto :goto_1

    :cond_3
    invoke-static {v2}, Ll/ۚۜܳ;->ۧ(Ljava/lang/String;)J

    move-result-wide v12

    .line 184
    :goto_1
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_4

    cmp-long v3, v12, v10

    if-gez v3, :cond_4

    .line 185
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 186
    invoke-static {v9}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/᩷ۜܳ;->ۙ:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    return-void

    :cond_4
    cmp-long v1, v7, v5

    if-eqz v1, :cond_5

    cmp-long v1, v12, v5

    if-eqz v1, :cond_5

    cmp-long v1, v7, v12

    if-ltz v1, :cond_5

    .line 190
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    const p1, 0x7f12062c

    .line 191
    invoke-static {p1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    return-void

    .line 194
    :cond_5
    iget-boolean p1, p0, Ll/᩷ۜܳ;->ۗ:Z

    if-eqz p1, :cond_6

    .line 195
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p1

    const-string v1, "smint"

    invoke-interface {p1, v1, v0}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object p1

    const-string v0, "smaxt"

    .line 196
    invoke-interface {p1, v0, v2}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object p1

    .line 197
    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    .line 199
    :cond_6
    iget-object p1, p0, Ll/᩷ۜܳ;->۬:Ll/֡ۜܳ;

    invoke-interface {p1, v7, v8, v12, v13}, Ll/֡ۜܳ;->֫(JJ)V

    .line 200
    iget-object p1, p0, Ll/᩷ۜܳ;->۫:Ll/֡ۚۢ;

    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V

    return-void
.end method
