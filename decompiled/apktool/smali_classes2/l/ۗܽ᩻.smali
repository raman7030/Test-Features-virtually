.class public final synthetic Ll/ۗܽ᩻;
.super Ljava/lang/Object;
.source "795C"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۗ:Ll/֡ۚۢ;

.field public final synthetic ۙ:Lcom/google/android/material/textfield/TextInputLayout;

.field public final synthetic ۫:Ll/ۖۢܳ;

.field public final synthetic ۬:Ll/ܽۢܳ;

.field public final synthetic ᩶:Landroid/widget/EditText;

.field public final synthetic ᩸:Landroid/widget/EditText;

.field public final synthetic ᩹:Landroid/widget/EditText;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Lcom/google/android/material/textfield/TextInputLayout;Ll/֡ۚۢ;Ll/ܽۢܳ;Ll/ۖۢܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗܽ᩻;->᩸:Landroid/widget/EditText;

    iput-object p2, p0, Ll/ۗܽ᩻;->᩹:Landroid/widget/EditText;

    iput-object p3, p0, Ll/ۗܽ᩻;->᩶:Landroid/widget/EditText;

    iput-object p4, p0, Ll/ۗܽ᩻;->ۙ:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p5, p0, Ll/ۗܽ᩻;->ۗ:Ll/֡ۚۢ;

    iput-object p6, p0, Ll/ۗܽ᩻;->۬:Ll/ܽۢܳ;

    iput-object p7, p0, Ll/ۗܽ᩻;->۫:Ll/ۖۢܳ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 2
    iget-object p1, p0, Ll/ۗܽ᩻;->ۗ:Ll/֡ۚۢ;

    .line 4
    iget-object v0, p0, Ll/ۗܽ᩻;->۬:Ll/ܽۢܳ;

    .line 6
    iget-object v1, p0, Ll/ۗܽ᩻;->۫:Ll/ۖۢܳ;

    .line 137
    iget-object v2, p0, Ll/ۗܽ᩻;->᩸:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 138
    iget-object v3, p0, Ll/ۗܽ᩻;->᩹:Landroid/widget/EditText;

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 139
    iget-object v4, p0, Ll/ۗܽ᩻;->᩶:Landroid/widget/EditText;

    invoke-virtual {v4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    .line 140
    invoke-static {v3, v2}, Ll/ۢۤۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/String;

    invoke-static {v2, v5}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 141
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v5

    if-eqz v5, :cond_0

    const p1, 0x7f1203a1

    .line 142
    invoke-static {p1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/ۗܽ᩻;->ۙ:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    return-void

    .line 146
    :cond_0
    :try_start_0
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۨ()V

    .line 147
    invoke-virtual {v2, v4}, Ll/ܶ᩵ܿ;->ܽ(Ljava/lang/String;)V

    .line 148
    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V

    const-string v4, "local"

    .line 149
    invoke-virtual {v0, v4}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v0}, Ll/ܽۢܳ;->۫()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v0}, Ll/ܽۢܳ;->᩵()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 150
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ܽۢܳ;->ᩳ(Ljava/lang/String;)V

    .line 151
    invoke-virtual {v0}, Ll/ܽۢܳ;->ۖ֫()V

    goto :goto_0

    .line 153
    :cond_1
    invoke-virtual {v1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object v0

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ܽۢܳ;->ᩳ(Ljava/lang/String;)V

    .line 154
    invoke-virtual {v1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v3, v2}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;Z)V

    .line 156
    :goto_0
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    .line 157
    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 159
    invoke-virtual {v1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v0

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method
