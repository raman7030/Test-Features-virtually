.class public final Ll/ܰۢ;
.super Ljava/lang/Object;
.source "FAZN"


# instance fields
.field public final ֫:Ll/ۖܿ֫;

.field public final ۧ:Landroid/widget/EditText;


# direct methods
.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 1

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p1, p0, Ll/ܰۢ;->ۧ:Landroid/widget/EditText;

    .line 52
    new-instance v0, Ll/ۖܿ֫;

    invoke-direct {v0, p1}, Ll/ۖܿ֫;-><init>(Landroid/widget/EditText;)V

    iput-object v0, p0, Ll/ܰۢ;->֫:Ll/ۖܿ֫;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;
    .locals 1

    .line 86
    instance-of v0, p1, Landroid/text/method/NumberKeyListener;

    if-nez v0, :cond_0

    .line 124
    iget-object v0, p0, Ll/ܰۢ;->֫:Ll/ۖܿ֫;

    invoke-virtual {v0, p1}, Ll/ۖܿ֫;->֫(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public final ֫(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 1

    .line 148
    iget-object v0, p0, Ll/ܰۢ;->֫:Ll/ۖܿ֫;

    invoke-virtual {v0, p1, p2}, Ll/ۖܿ֫;->֫(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Landroid/util/AttributeSet;I)V
    .locals 3

    .line 63
    iget-object v0, p0, Ll/ܰۢ;->ۧ:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 64
    sget-object v1, Ll/ۗᩳ;->ۢ:[I

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const/16 p2, 0xe

    .line 68
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 69
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 74
    invoke-virtual {p0, v1}, Ll/ܰۢ;->֫(Z)V

    return-void

    :catchall_0
    move-exception p2

    .line 72
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 73
    throw p2
.end method

.method public final ֫(Z)V
    .locals 1

    .line 96
    iget-object v0, p0, Ll/ܰۢ;->֫:Ll/ۖܿ֫;

    invoke-virtual {v0, p1}, Ll/ۖܿ֫;->֫(Z)V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 103
    iget-object v0, p0, Ll/ܰۢ;->֫:Ll/ۖܿ֫;

    invoke-virtual {v0}, Ll/ۖܿ֫;->֫()Z

    move-result v0

    return v0
.end method
