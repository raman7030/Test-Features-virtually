.class public final Ll/ۡܿ֫;
.super Ll/ܺܿ֫;
.source "7B23"


# instance fields
.field public final ֫:Landroid/widget/EditText;

.field public final ۧ:Ll/ۗܿ֫;


# direct methods
.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 1

    .line 231
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 266
    iput-object p1, p0, Ll/ۡܿ֫;->֫:Landroid/widget/EditText;

    .line 267
    new-instance v0, Ll/ۗܿ֫;

    invoke-direct {v0, p1}, Ll/ۗܿ֫;-><init>(Landroid/widget/EditText;)V

    iput-object v0, p0, Ll/ۡܿ֫;->ۧ:Ll/ۗܿ֫;

    .line 268
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 269
    invoke-static {}, Ll/ۘܿ֫;->getInstance()Landroid/text/Editable$Factory;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setEditableFactory(Landroid/text/Editable$Factory;)V

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 2

    .line 305
    instance-of v0, p1, Ll/᩵ܿ֫;

    if-eqz v0, :cond_0

    return-object p1

    .line 310
    :cond_0
    new-instance v0, Ll/᩵ܿ֫;

    iget-object v1, p0, Ll/ۡܿ֫;->֫:Landroid/widget/EditText;

    invoke-direct {v0, v1, p1, p2}, Ll/᩵ܿ֫;-><init>(Landroid/widget/EditText;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)V

    return-object v0
.end method

.method public final ֫(Z)V
    .locals 1

    .line 315
    iget-object v0, p0, Ll/ۡܿ֫;->ۧ:Ll/ۗܿ֫;

    invoke-virtual {v0, p1}, Ll/ۗܿ֫;->֫(Z)V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 324
    iget-object v0, p0, Ll/ۡܿ֫;->ۧ:Ll/ۗܿ֫;

    invoke-virtual {v0}, Ll/ۗܿ֫;->֫()Z

    move-result v0

    return v0
.end method
