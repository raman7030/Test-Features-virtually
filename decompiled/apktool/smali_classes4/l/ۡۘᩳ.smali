.class public Ll/ۡۘᩳ;
.super Ll/֫ۙ᩷;
.source "CAHS"


# direct methods
.method public constructor <init>()V
    .locals 1

    const v0, 0x7f150001

    .line 18
    invoke-direct {p0, v0}, Ll/֫ۙ᩷;-><init>(I)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/۟᩶᩷;Ll/ۜ᩹ۧ;)V
    .locals 1

    const-string p1, "edit_show_line_numbers"

    .line 133
    invoke-virtual {p2, p1}, Ll/ۗ᩸ۧ;->ۧ(Ljava/lang/CharSequence;)Ll/֫᩸ۧ;

    move-result-object p1

    check-cast p1, Ll/֨᩹ۧ;

    .line 135
    invoke-virtual {p1}, Ll/᩸᩹ۧ;->ۜ֫()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "edit_fixed_line_numbers"

    .line 141
    invoke-virtual {p2, p1}, Ll/ۗ᩸ۧ;->ۧ(Ljava/lang/CharSequence;)Ll/֫᩸ۧ;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/֫᩸ۧ;->ܿ(Z)V

    :cond_0
    const-string p1, "edit_show_blank_symbol"

    .line 133
    invoke-virtual {p2, p1}, Ll/ۗ᩸ۧ;->ۧ(Ljava/lang/CharSequence;)Ll/֫᩸ۧ;

    move-result-object p1

    check-cast p1, Ll/֨᩹ۧ;

    .line 135
    invoke-virtual {p1}, Ll/᩸᩹ۧ;->ۜ֫()Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "hide_single_space"

    .line 141
    invoke-virtual {p2, p1}, Ll/ۗ᩸ۧ;->ۧ(Ljava/lang/CharSequence;)Ll/֫᩸ۧ;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/֫᩸ۧ;->ܿ(Z)V

    :cond_1
    const-string p1, "symbol_input"

    .line 133
    invoke-virtual {p2, p1}, Ll/ۗ᩸ۧ;->ۧ(Ljava/lang/CharSequence;)Ll/֫᩸ۧ;

    move-result-object p1

    check-cast p1, Ll/֨᩹ۧ;

    .line 135
    invoke-virtual {p1}, Ll/᩸᩹ۧ;->ۜ֫()Z

    move-result p1

    if-nez p1, :cond_2

    const-string p1, "custom_symbols"

    .line 141
    invoke-virtual {p2, p1}, Ll/ۗ᩸ۧ;->ۧ(Ljava/lang/CharSequence;)Ll/֫᩸ۧ;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/֫᩸ۧ;->ܿ(Z)V

    :cond_2
    return-void
.end method

.method public final ֫(Ll/۟᩶᩷;Ll/֫᩸ۧ;Ljava/lang/Object;)Z
    .locals 4

    .line 28
    invoke-virtual {p1}, Ll/᩸᩸ۧ;->ᩳ()Ll/ۜ᩹ۧ;

    move-result-object p1

    .line 29
    invoke-virtual {p2}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "edit_show_blank_symbol"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_1
    const-string v0, "edit_show_line_numbers"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x1

    goto :goto_0

    :sswitch_2
    const-string v0, "symbol_input"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    packed-switch v3, :pswitch_data_0

    return v1

    .line 34
    :pswitch_0
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    const-string p3, "hide_single_space"

    .line 141
    :goto_1
    invoke-virtual {p1, p3}, Ll/ۗ᩸ۧ;->ۧ(Ljava/lang/CharSequence;)Ll/֫᩸ۧ;

    move-result-object p1

    invoke-virtual {p1, p2}, Ll/֫᩸ۧ;->ܿ(Z)V

    return v2

    .line 31
    :pswitch_1
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    const-string p3, "edit_fixed_line_numbers"

    goto :goto_1

    .line 37
    :pswitch_2
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    const-string p3, "custom_symbols"

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x61c7619d -> :sswitch_2
        0x56466c0c -> :sswitch_1
        0x590635f0 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "FullEditorPreferences"

    return-object v0
.end method
