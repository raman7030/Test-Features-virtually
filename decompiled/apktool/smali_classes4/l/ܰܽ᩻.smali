.class public final Ll/ܰܽ᩻;
.super Ll/۟ܶۡ;
.source "J951"


# instance fields
.field public final synthetic ۖ:Ll/ۖۢܳ;

.field public final synthetic ۘ:Landroid/view/View;

.field public final synthetic ۜ:Landroid/widget/CheckBox;

.field public final synthetic ۡ:Lcom/google/android/material/textfield/TextInputLayout;

.field public final synthetic ۢ:Landroid/widget/EditText;

.field public final synthetic ܳ:Lbin/mt/plus/Main;

.field public final synthetic ܺ:Ljava/lang/String;

.field public final synthetic ᩷:Ll/֡ۚۢ;

.field public final synthetic ᩻:Ll/ܳᩳ᩻;


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;Ll/ۖۢܳ;Ljava/lang/String;Ll/֡ۚۢ;Ll/ܳᩳ᩻;Landroid/widget/CheckBox;Landroid/view/View;Lcom/google/android/material/textfield/TextInputLayout;Landroid/widget/EditText;)V
    .locals 0

    .line 89
    iput-object p1, p0, Ll/ܰܽ᩻;->ܳ:Lbin/mt/plus/Main;

    iput-object p2, p0, Ll/ܰܽ᩻;->ۖ:Ll/ۖۢܳ;

    iput-object p3, p0, Ll/ܰܽ᩻;->ܺ:Ljava/lang/String;

    iput-object p4, p0, Ll/ܰܽ᩻;->᩷:Ll/֡ۚۢ;

    iput-object p5, p0, Ll/ܰܽ᩻;->᩻:Ll/ܳᩳ᩻;

    iput-object p6, p0, Ll/ܰܽ᩻;->ۜ:Landroid/widget/CheckBox;

    iput-object p7, p0, Ll/ܰܽ᩻;->ۘ:Landroid/view/View;

    iput-object p8, p0, Ll/ܰܽ᩻;->ۡ:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p9, p0, Ll/ܰܽ᩻;->ۢ:Landroid/widget/EditText;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 120
    iget-object v0, p0, Ll/ܰܽ᩻;->᩷:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->dismiss()V

    .line 121
    iget-object v0, p0, Ll/ܰܽ᩻;->᩻:Ll/ܳᩳ᩻;

    iget-boolean v1, v0, Ll/ܳᩳ᩻;->֫:Z

    iget-object v2, p0, Ll/ܰܽ᩻;->ۜ:Landroid/widget/CheckBox;

    invoke-virtual {v2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v3

    if-eq v1, v3, :cond_0

    .line 122
    invoke-virtual {v2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    iput-boolean v1, v0, Ll/ܳᩳ᩻;->֫:Z

    .line 123
    invoke-virtual {v0}, Ll/ܳᩳ᩻;->ۧ()V

    .line 125
    :cond_0
    sget v0, Ll/ܶ۠ۢ;->֫:I

    .line 268
    new-instance v0, Ll/֨۠ۢ;

    const-class v1, Ll/ۧᩳ᩻;

    invoke-direct {v0, v1}, Ll/֨۠ۢ;-><init>(Ljava/lang/Class;)V

    .line 126
    iget-object v1, p0, Ll/ܰܽ᩻;->ۖ:Ll/ۖۢܳ;

    invoke-virtual {v0, v1}, Ll/֨۠ۢ;->ܽ(Ll/ۖۢܳ;)V

    .line 127
    invoke-virtual {v1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/֨۠ۢ;->֫(Ljava/util/List;)V

    const-string v1, "password"

    iget-object v3, p0, Ll/ܰܽ᩻;->ܺ:Ljava/lang/String;

    .line 128
    invoke-virtual {v0, v1, v3}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "removeSource"

    .line 129
    invoke-virtual {v2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Z)V

    .line 130
    invoke-virtual {v0}, Ll/֨۠ۢ;->֫()I

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 135
    iget-object v0, p0, Ll/ܰܽ᩻;->ۘ:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 136
    instance-of v0, p1, Ll/᩵ۤۡ;

    if-eqz v0, :cond_0

    .line 137
    iget-object v0, p0, Ll/ܰܽ᩻;->ۡ:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 138
    iget-object p1, p0, Ll/ܰܽ᩻;->ۢ:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    return-void

    .line 140
    :cond_0
    iget-object v0, p0, Ll/ܰܽ᩻;->ܳ:Lbin/mt/plus/Main;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 93
    iget-object v0, p0, Ll/ܰܽ᩻;->ܳ:Lbin/mt/plus/Main;

    const/16 v1, 0xfa

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->ۧ(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 8

    .line 98
    iget-object v0, p0, Ll/ܰܽ᩻;->ۖ:Ll/ۖۢܳ;

    invoke-virtual {v0}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    .line 99
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 100
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۜܳ;

    invoke-interface {v2}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v2

    const/4 v3, 0x1

    if-nez v1, :cond_0

    const/4 v4, 0x1

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    .line 103
    :goto_1
    :try_start_0
    new-instance v5, Ll/᩵ܰۡ;

    iget-object v6, p0, Ll/ܰܽ᩻;->ܺ:Ljava/lang/String;

    new-instance v7, Ll/᩺ܽ᩻;

    invoke-direct {v7, v2, v4}, Ll/᩺ܽ᩻;-><init>(Ll/ܶ᩵ܿ;Z)V

    invoke-direct {v5, v2, v6, v7}, Ll/᩵ܰۡ;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;Ll/ۛܶܺ;)V

    .line 104
    invoke-static {v5}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v4, "Bad magic"

    .line 106
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 107
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const v1, 0x7f1206fd

    if-ne v0, v3, :cond_1

    .line 108
    new-instance v0, Ll/᩵ۤۡ;

    invoke-direct {v0, v1}, Ll/᩵ۤۡ;-><init>(I)V

    throw v0

    .line 110
    :cond_1
    new-instance v0, Ll/᩵ۤۡ;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 110
    throw v0

    .line 113
    :cond_2
    throw v1

    :cond_3
    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 146
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
