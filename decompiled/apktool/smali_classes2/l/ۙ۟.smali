.class public final Ll/ۙ۟;
.super Landroid/view/inputmethod/InputConnectionWrapper;
.source "33S4"


# instance fields
.field public final synthetic ֫:Ll/֫ܶܽ;


# direct methods
.method public constructor <init>(Landroid/view/inputmethod/InputConnection;Ll/֫ܶܽ;)V
    .locals 0

    .line 280
    iput-object p2, p0, Ll/ۙ۟;->֫:Ll/֫ܶܽ;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;-><init>(Landroid/view/inputmethod/InputConnection;Z)V

    return-void
.end method


# virtual methods
.method public final commitContent(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z
    .locals 2

    .line 285
    iget-object v0, p0, Ll/ۙ۟;->֫:Ll/֫ܶܽ;

    invoke-static {p1}, Ll/ۨ۟;->֫(Ljava/lang/Object;)Ll/ۨ۟;

    move-result-object v1

    invoke-virtual {v0, v1, p2, p3}, Ll/֫ܶܽ;->֫(Ll/ۨ۟;ILandroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 289
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/view/inputmethod/InputConnectionWrapper;->commitContent(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method
