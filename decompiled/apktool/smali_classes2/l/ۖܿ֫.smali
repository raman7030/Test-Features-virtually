.class public final Ll/ۖܿ֫;
.super Ljava/lang/Object;
.source "7B23"


# instance fields
.field public final ֫:Ll/ۡܿ֫;


# direct methods
.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 1

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    new-instance v0, Ll/ۡܿ֫;

    invoke-direct {v0, p1}, Ll/ۡܿ֫;-><init>(Landroid/widget/EditText;)V

    iput-object v0, p0, Ll/ۖܿ֫;->֫:Ll/ۡܿ֫;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;
    .locals 1

    .line 155
    iget-object v0, p0, Ll/ۖܿ֫;->֫:Ll/ۡܿ֫;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    instance-of v0, p1, Ll/۠ܿ֫;

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 293
    :cond_1
    instance-of v0, p1, Landroid/text/method/NumberKeyListener;

    if-eqz v0, :cond_2

    return-object p1

    .line 299
    :cond_2
    new-instance v0, Ll/۠ܿ֫;

    invoke-direct {v0, p1}, Ll/۠ܿ֫;-><init>(Landroid/text/method/KeyListener;)V

    return-object v0
.end method

.method public final ֫(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 174
    :cond_0
    iget-object v0, p0, Ll/ۖܿ֫;->֫:Ll/ۡܿ֫;

    invoke-virtual {v0, p1, p2}, Ll/ۡܿ֫;->֫(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Z)V
    .locals 1

    .line 227
    iget-object v0, p0, Ll/ۖܿ֫;->֫:Ll/ۡܿ֫;

    invoke-virtual {v0, p1}, Ll/ۡܿ֫;->֫(Z)V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 214
    iget-object v0, p0, Ll/ۖܿ֫;->֫:Ll/ۡܿ֫;

    invoke-virtual {v0}, Ll/ۡܿ֫;->֫()Z

    move-result v0

    return v0
.end method
