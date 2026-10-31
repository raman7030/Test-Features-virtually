.class public final Ll/ۢۖᩳ;
.super Ljava/lang/Object;
.source "U5MD"

# interfaces
.implements Landroid/text/TextWatcher;


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
    .locals 1

    .line 689
    instance-of p3, p1, Landroid/text/Spannable;

    if-eqz p3, :cond_0

    .line 690
    check-cast p1, Landroid/text/Spannable;

    add-int/2addr p4, p2

    .line 692
    const-class p3, Landroid/text/style/UpdateAppearance;

    invoke-interface {p1, p2, p4, p3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Landroid/text/style/UpdateAppearance;

    if-eqz p2, :cond_0

    .line 693
    array-length p3, p2

    if-lez p3, :cond_0

    .line 694
    array-length p3, p2

    const/4 p4, 0x0

    :goto_0
    if-ge p4, p3, :cond_0

    aget-object v0, p2, p4

    .line 695
    invoke-interface {p1, v0}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
