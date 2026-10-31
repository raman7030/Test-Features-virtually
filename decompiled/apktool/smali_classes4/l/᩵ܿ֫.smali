.class public final Ll/᩵ܿ֫;
.super Landroid/view/inputmethod/InputConnectionWrapper;
.source "ZB20"


# instance fields
.field public final ֫:Ll/ᩴܿ֫;

.field public final ۧ:Landroid/widget/EditText;


# direct methods
.method public constructor <init>(Landroid/widget/EditText;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)V
    .locals 2

    .line 49
    new-instance v0, Ll/ᩴܿ֫;

    .line 83
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    .line 58
    invoke-direct {p0, p2, v1}, Landroid/view/inputmethod/InputConnectionWrapper;-><init>(Landroid/view/inputmethod/InputConnection;Z)V

    .line 59
    iput-object p1, p0, Ll/᩵ܿ֫;->ۧ:Landroid/widget/EditText;

    .line 60
    iput-object v0, p0, Ll/᩵ܿ֫;->֫:Ll/ᩴܿ֫;

    .line 95
    invoke-static {}, Ll/ۜᩳ֫;->ܿ()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 96
    invoke-static {}, Ll/ۜᩳ֫;->ᩳ()Ll/ۜᩳ֫;

    move-result-object p1

    invoke-virtual {p1, p3}, Ll/ۜᩳ֫;->֫(Landroid/view/inputmethod/EditorInfo;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final deleteSurroundingText(II)Z
    .locals 2

    .line 80
    iget-object v0, p0, Ll/᩵ܿ֫;->ۧ:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/TextView;->getEditableText()Landroid/text/Editable;

    move-result-object v0

    .line 66
    iget-object v1, p0, Ll/᩵ܿ֫;->֫:Ll/ᩴܿ֫;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    .line 90
    invoke-static {p0, v0, p1, p2, v1}, Ll/ۜᩳ֫;->֫(Landroid/view/inputmethod/InputConnection;Landroid/text/Editable;IIZ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 68
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;->deleteSurroundingText(II)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final deleteSurroundingTextInCodePoints(II)Z
    .locals 2

    .line 80
    iget-object v0, p0, Ll/᩵ܿ֫;->ۧ:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/TextView;->getEditableText()Landroid/text/Editable;

    move-result-object v0

    .line 74
    iget-object v1, p0, Ll/᩵ܿ֫;->֫:Ll/ᩴܿ֫;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    .line 90
    invoke-static {p0, v0, p1, p2, v1}, Ll/ۜᩳ֫;->֫(Landroid/view/inputmethod/InputConnection;Landroid/text/Editable;IIZ)Z

    move-result v0

    if-nez v0, :cond_1

    .line 76
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;->deleteSurroundingTextInCodePoints(II)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    return v1
.end method
