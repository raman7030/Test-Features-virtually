.class public final Ll/֨ۙ᩷;
.super Ll/᩶ۗۧ;
.source "657B"


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 216
    invoke-static {}, Ll/ܶۙ᩷;->ۢ֫()[I

    move-result-object v0

    array-length v0, v0

    return v0
.end method

.method public final onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 2

    .line 168
    check-cast p1, Ll/۠ۙ᩷;

    .line 180
    invoke-static {}, Ll/ܶۙ᩷;->ۢ֫()[I

    move-result-object v0

    aget p2, v0, p2

    const-string v0, " ->"

    packed-switch p2, :pswitch_data_0

    return-void

    :pswitch_0
    const p2, 0x7f1205ae

    const v0, 0x7f0801cf

    .line 209
    invoke-virtual {p1, p2, v0}, Ll/۠ۙ᩷;->֫(II)V

    return-void

    :pswitch_1
    const p2, 0x7f1205f0

    const v0, 0x7f080223

    .line 206
    invoke-virtual {p1, p2, v0}, Ll/۠ۙ᩷;->֫(II)V

    return-void

    :pswitch_2
    const p2, 0x7f120606

    const v0, 0x7f08023e

    .line 203
    invoke-virtual {p1, p2, v0}, Ll/۠ۙ᩷;->֫(II)V

    return-void

    :pswitch_3
    const p2, 0x7f1205f2

    const v0, 0x7f080227

    .line 200
    invoke-virtual {p1, p2, v0}, Ll/۠ۙ᩷;->֫(II)V

    return-void

    :pswitch_4
    const p2, 0x7f1205be

    const v0, 0x7f080254

    .line 197
    invoke-virtual {p1, p2, v0}, Ll/۠ۙ᩷;->֫(II)V

    return-void

    :pswitch_5
    const p2, 0x7f1205ca

    const v0, 0x7f0801e6

    .line 194
    invoke-virtual {p1, p2, v0}, Ll/۠ۙ᩷;->֫(II)V

    return-void

    :pswitch_6
    const p2, 0x7f1205f9

    const v0, 0x7f080231

    .line 191
    invoke-virtual {p1, p2, v0}, Ll/۠ۙ᩷;->֫(II)V

    return-void

    :pswitch_7
    const p2, 0x7f120a88

    const v0, 0x7f0801e8

    .line 188
    invoke-virtual {p1, p2, v0}, Ll/۠ۙ᩷;->֫(II)V

    return-void

    .line 163
    :pswitch_8
    iget-object p2, p1, Ll/۠ۙ᩷;->ۧ:Landroid/widget/TextView;

    const v1, 0x7f1205ec

    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 164
    iget-object p1, p1, Ll/۠ۙ᩷;->֫:Landroid/widget/ImageView;

    const p2, 0x7f0801e5

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void

    .line 163
    :pswitch_9
    iget-object p2, p1, Ll/۠ۙ᩷;->ۧ:Landroid/widget/TextView;

    const v1, 0x7f1205c2

    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 164
    iget-object p1, p1, Ll/۠ۙ᩷;->֫:Landroid/widget/ImageView;

    const p2, 0x7f0801e3

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 1

    const p2, 0x7f0d0136

    const/4 v0, 0x0

    .line 0
    invoke-static {p1, p2, p1, v0}, Ll/ܰۗ;->֫(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 175
    new-instance p2, Ll/۠ۙ᩷;

    invoke-direct {p2, p1}, Ll/۠ۙ᩷;-><init>(Landroid/view/View;)V

    return-object p2
.end method
