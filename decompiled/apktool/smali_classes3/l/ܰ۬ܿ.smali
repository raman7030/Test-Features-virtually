.class public final Ll/ܰ۬ܿ;
.super Ljava/lang/Object;
.source "K7A7"


# direct methods
.method public static ֫(Ljava/util/ArrayList;Ljava/util/ArrayList;Ll/ܽۢܳ;I)V
    .locals 3

    const-string v0, "local"

    .line 88
    invoke-virtual {p2, v0}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 91
    :cond_0
    invoke-virtual {p2}, Ll/ܽۢܳ;->ۚ()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/String;

    invoke-static {p2, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p2

    .line 92
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    .line 93
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    const v1, 0x7f1208bf

    .line 94
    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    :cond_1
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v1, v2, v0

    .line 96
    invoke-static {p3, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;Lcom/google/android/material/textfield/TextInputLayout;Landroid/widget/EditText;Ll/᩷۫᩻;)V
    .locals 1

    const/4 v0, -0x1

    .line 43
    invoke-virtual {p1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconMode(I)V

    const v0, 0x7f080221

    .line 44
    invoke-virtual {p1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconDrawable(I)V

    .line 45
    new-instance v0, Ll/᩺۬ܿ;

    invoke-direct {v0, p0, p3, p2}, Ll/᩺۬ܿ;-><init>(Ll/ۗܺ᩷;Ljava/lang/Runnable;Landroid/widget/EditText;)V

    invoke-virtual {p1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;Ljava/lang/Runnable;Landroid/widget/EditText;)V
    .locals 5

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 47
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 73
    instance-of v2, p0, Lbin/mt/plus/Main;

    if-eqz v2, :cond_1

    move-object v2, p0

    check-cast v2, Lbin/mt/plus/Main;

    .line 76
    invoke-virtual {v2}, Lbin/mt/plus/Main;->ܿ֫()Ll/ۢۘܳ;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 80
    :cond_0
    invoke-virtual {v2}, Ll/ۢۘܳ;->᩷()Ll/ܽۢܳ;

    move-result-object v3

    const v4, 0x7f12020c

    invoke-static {v0, v1, v3, v4}, Ll/ܰ۬ܿ;->֫(Ljava/util/ArrayList;Ljava/util/ArrayList;Ll/ܽۢܳ;I)V

    .line 81
    invoke-virtual {v2}, Ll/ۢۘܳ;->ۡ()Ll/ܽۢܳ;

    move-result-object v2

    const v3, 0x7f12020d

    invoke-static {v0, v1, v2, v3}, Ll/ܰ۬ܿ;->֫(Ljava/util/ArrayList;Ljava/util/ArrayList;Ll/ܽۢܳ;I)V

    :cond_1
    :goto_0
    const v2, 0x7f1209e3

    .line 49
    invoke-static {v2}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    sget-object v2, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    invoke-static {}, Ll/᩵᩸ܿ;->ۧ()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۘ᩸ܿ;

    .line 52
    iget-object v4, v3, Ll/ۘ᩸ܿ;->ۧ:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    iget-object v3, v3, Ll/ۘ᩸ܿ;->ܽ:Ljava/io/File;

    invoke-static {v3}, Ll/ܿ֡ܿ;->֫(Ljava/io/File;)Ll/ܶ᩵ܿ;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    if-eqz p1, :cond_3

    const v2, 0x7f120927

    .line 56
    invoke-static {v2}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    :cond_3
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/CharSequence;

    new-instance v2, Ll/᩻۬᩻;

    const/4 v3, 0x1

    invoke-direct {v2, p1, v0, p2, v3}, Ll/᩻۬᩻;-><init>(Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;I)V

    invoke-virtual {p0, v1, v2}, Ll/᩵ۚۢ;->֫([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 65
    invoke-virtual {p0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method
