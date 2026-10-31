.class public final Ll/ۗܿ֫;
.super Ljava/lang/Object;
.source "NB2C"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public ᩶:Ll/ܽᩳ֫;

.field public final ᩸:Landroid/widget/EditText;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Ll/ۗܿ֫;->᩸:Landroid/widget/EditText;

    const/4 p1, 0x1

    .line 52
    iput-boolean p1, p0, Ll/ۗܿ֫;->᩹:Z

    return-void
.end method

.method public static ֫(Landroid/widget/EditText;I)V
    .locals 4

    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    if-eqz p0, :cond_3

    .line 152
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 153
    invoke-virtual {p0}, Landroid/widget/TextView;->getEditableText()Landroid/text/Editable;

    move-result-object p0

    .line 155
    invoke-static {p0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result p1

    .line 156
    invoke-static {p0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v0

    .line 158
    invoke-static {}, Ll/ۜᩳ֫;->ᩳ()Ll/ۜᩳ֫;

    move-result-object v1

    const/4 v2, 0x0

    if-nez p0, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 984
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    .line 1057
    :goto_0
    invoke-virtual {v1, v2, v3, p0}, Ll/ۜᩳ֫;->֫(IILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    if-ltz p1, :cond_1

    if-ltz v0, :cond_1

    .line 164
    invoke-static {p0, p1, v0}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;II)V

    return-void

    :cond_1
    if-ltz p1, :cond_2

    .line 166
    invoke-static {p0, p1}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;I)V

    return-void

    :cond_2
    if-ltz v0, :cond_3

    .line 168
    invoke-static {p0, v0}, Landroid/text/Selection;->setSelection(Landroid/text/Spannable;I)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    .line 74
    iget-object v0, p0, Ll/ۗܿ֫;->᩸:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    move-result v1

    if-nez v1, :cond_4

    .line 98
    iget-boolean v1, p0, Ll/ۗܿ֫;->᩹:Z

    if-eqz v1, :cond_4

    invoke-static {}, Ll/ۜᩳ֫;->ܿ()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    if-gt p3, p4, :cond_4

    .line 79
    instance-of p3, p1, Landroid/text/Spannable;

    if-eqz p3, :cond_4

    .line 80
    invoke-static {}, Ll/ۜᩳ֫;->ᩳ()Ll/ۜᩳ֫;

    move-result-object p3

    invoke-virtual {p3}, Ll/ۜᩳ֫;->֫()I

    move-result p3

    if-eqz p3, :cond_2

    const/4 v1, 0x1

    if-eq p3, v1, :cond_1

    const/4 p1, 0x3

    if-eq p3, p1, :cond_2

    goto :goto_0

    .line 82
    :cond_1
    check-cast p1, Landroid/text/Spannable;

    .line 83
    invoke-static {}, Ll/ۜᩳ֫;->ᩳ()Ll/ۜᩳ֫;

    move-result-object p3

    add-int/2addr p4, p2

    invoke-virtual {p3, p2, p4, p1}, Ll/ۜᩳ֫;->֫(IILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    return-void

    .line 88
    :cond_2
    invoke-static {}, Ll/ۜᩳ֫;->ᩳ()Ll/ۜᩳ֫;

    move-result-object p1

    .line 112
    iget-object p2, p0, Ll/ۗܿ֫;->᩶:Ll/ܽᩳ֫;

    if-nez p2, :cond_3

    .line 113
    new-instance p2, Ll/ۙܿ֫;

    invoke-direct {p2, v0}, Ll/ۙܿ֫;-><init>(Landroid/widget/EditText;)V

    iput-object p2, p0, Ll/ۗܿ֫;->᩶:Ll/ܽᩳ֫;

    .line 115
    :cond_3
    iget-object p2, p0, Ll/ۗܿ֫;->᩶:Ll/ܽᩳ֫;

    .line 88
    invoke-virtual {p1, p2}, Ll/ۜᩳ֫;->֫(Ll/ܽᩳ֫;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public final ֫(Z)V
    .locals 2

    .line 123
    iget-boolean v0, p0, Ll/ۗܿ֫;->᩹:Z

    if-eq v0, p1, :cond_1

    .line 124
    iget-object v0, p0, Ll/ۗܿ֫;->᩶:Ll/ܽᩳ֫;

    if-eqz v0, :cond_0

    .line 125
    invoke-static {}, Ll/ۜᩳ֫;->ᩳ()Ll/ۜᩳ֫;

    move-result-object v0

    iget-object v1, p0, Ll/ۗܿ֫;->᩶:Ll/ܽᩳ֫;

    invoke-virtual {v0, v1}, Ll/ۜᩳ֫;->ۧ(Ll/ܽᩳ֫;)V

    .line 127
    :cond_0
    iput-boolean p1, p0, Ll/ۗܿ֫;->᩹:Z

    if-eqz p1, :cond_1

    .line 129
    invoke-static {}, Ll/ۜᩳ֫;->ᩳ()Ll/ۜᩳ֫;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۜᩳ֫;->֫()I

    move-result p1

    iget-object v0, p0, Ll/ۗܿ֫;->᩸:Landroid/widget/EditText;

    invoke-static {v0, p1}, Ll/ۗܿ֫;->֫(Landroid/widget/EditText;I)V

    :cond_1
    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 119
    iget-boolean v0, p0, Ll/ۗܿ֫;->᩹:Z

    return v0
.end method
