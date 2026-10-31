.class public final Ll/ۤ᩺ܽ;
.super Ljava/lang/Object;
.source "Y184"


# instance fields
.field public ֫:Landroid/widget/TextView;

.field public ۧ:Landroid/view/View;

.field public ܳ:Landroid/view/View;

.field public ܽ:Landroid/widget/TextView;

.field public ܿ:Ll/᩷᩺ܽ;

.field public ᩳ:Landroid/view/View;

.field public ᩻:Landroid/widget/Spinner;


# virtual methods
.method public final ֫(I)V
    .locals 11

    .line 138
    iget-object v0, p0, Ll/ۤ᩺ܽ;->֫:Landroid/widget/TextView;

    iget-object v1, p0, Ll/ۤ᩺ܽ;->ᩳ:Landroid/view/View;

    iget-object v2, p0, Ll/ۤ᩺ܽ;->ۧ:Landroid/view/View;

    iget-object v3, p0, Ll/ۤ᩺ܽ;->ܳ:Landroid/view/View;

    iget-object v4, p0, Ll/ۤ᩺ܽ;->ܿ:Ll/᩷᩺ܽ;

    iget-object v5, p0, Ll/ۤ᩺ܽ;->ܽ:Landroid/widget/TextView;

    const/4 v6, 0x2

    const v7, 0x7f120626

    const/4 v8, 0x0

    const/16 v9, 0x8

    if-nez p1, :cond_0

    .line 139
    invoke-virtual {v3, v8}, Landroid/view/View;->setVisibility(I)V

    .line 140
    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    .line 141
    invoke-virtual {v1, v9}, Landroid/view/View;->setVisibility(I)V

    .line 142
    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    :cond_0
    const/4 v10, 0x1

    if-ne p1, v10, :cond_1

    .line 144
    invoke-virtual {v3, v8}, Landroid/view/View;->setVisibility(I)V

    .line 145
    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    .line 146
    invoke-virtual {v1, v9}, Landroid/view/View;->setVisibility(I)V

    .line 147
    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    :cond_1
    if-ne p1, v6, :cond_5

    .line 149
    invoke-virtual {v3, v9}, Landroid/view/View;->setVisibility(I)V

    .line 150
    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    .line 151
    invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V

    const v1, 0x7f12038e

    .line 152
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    :goto_0
    if-eq p1, v6, :cond_3

    .line 155
    iget-object p1, v4, Ll/᩷᩺ܽ;->ܽ:Ll/᩵᩺ܽ;

    .line 80
    iget-object v0, p1, Ll/᩵᩺ܽ;->֫:Ll/ᩳܰܽ;

    invoke-virtual {v0}, Ll/ᩳܰܽ;->֫()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p1, Ll/᩵᩺ܽ;->ܿ:Ll/ᩳܰܽ;

    invoke-virtual {v0}, Ll/ᩳܰܽ;->֫()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p1, p1, Ll/᩵᩺ܽ;->᩻:Ll/ᩳܰܽ;

    invoke-virtual {p1}, Ll/ᩳܰܽ;->֫()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 156
    iget-object p1, v4, Ll/᩷᩺ܽ;->ܽ:Ll/᩵᩺ܽ;

    invoke-virtual {p1}, Ll/᩵᩺ܽ;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 157
    invoke-virtual {v5, v8}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 159
    :cond_2
    invoke-virtual {v5, v9}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 162
    :cond_3
    iget-object p1, v4, Ll/᩷᩺ܽ;->֫:Ll/᩻᩺ܽ;

    .line 112
    iget-object v0, p1, Ll/᩻᩺ܽ;->֫:Ll/ᩳܰܽ;

    invoke-virtual {v0}, Ll/ᩳܰܽ;->֫()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p1, Ll/᩻᩺ܽ;->ܳ:Ll/ᩳܰܽ;

    invoke-virtual {v0}, Ll/ᩳܰܽ;->֫()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object p1, p1, Ll/᩻᩺ܽ;->᩻:Ll/ᩳܰܽ;

    invoke-virtual {p1}, Ll/ᩳܰܽ;->֫()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 163
    iget-object p1, v4, Ll/᩷᩺ܽ;->֫:Ll/᩻᩺ܽ;

    invoke-virtual {p1}, Ll/᩻᩺ܽ;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 164
    invoke-virtual {v5, v8}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 166
    :cond_4
    invoke-virtual {v5, v9}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 153
    :cond_5
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method
