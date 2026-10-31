.class public Ll/ܶۡۡ;
.super Ll/ۤۤᩳ;
.source "E7F1"


# instance fields
.field public ܶܿ:Ll/۟ۢۡ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 34
    invoke-direct {p0, p1, p2}, Ll/ۤۤᩳ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 50
    iget-object p1, p0, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    invoke-virtual {p1}, Ll/᩺֫ܿ;->ܶ()V

    const p2, 0x66ffffff

    .line 51
    sget v0, Ll/᩹֡᩷;->֫:I

    and-int/2addr p2, v0

    invoke-virtual {p1, p2}, Ll/᩺֫ܿ;->ܽ(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 42
    invoke-direct {p0, p1, p2, p3}, Ll/ۤۤᩳ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 50
    iget-object p1, p0, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    invoke-virtual {p1}, Ll/᩺֫ܿ;->ܶ()V

    const p2, 0x66ffffff

    .line 51
    sget p3, Ll/᩹֡᩷;->֫:I

    and-int/2addr p2, p3

    invoke-virtual {p1, p2}, Ll/᩺֫ܿ;->ܽ(I)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܶۡۡ;)Ll/۠ۡۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶۡۡ;->ܶܿ:Ll/۟ۢۡ;

    return-object p0
.end method


# virtual methods
.method public final onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 1

    .line 75
    invoke-super {p0, p1}, Ll/۫ۨᩳ;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 79
    :cond_0
    new-instance v0, Ll/֨ۡۡ;

    invoke-direct {v0, p0, p1}, Ll/֨ۡۡ;-><init>(Ll/ܶۡۡ;Landroid/view/inputmethod/InputConnection;)V

    return-object v0
.end method

.method public final ֫(Ll/۟ۢۡ;)V
    .locals 0

    .line 70
    iput-object p1, p0, Ll/ܶۡۡ;->ܶܿ:Ll/۟ۢۡ;

    return-void
.end method

.method public final ۬ۧ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()V
    .locals 2

    .line 56
    invoke-super {p0}, Ll/ۤۤᩳ;->ܽ()V

    const v0, 0x66ffffff

    .line 57
    sget v1, Ll/᩹֡᩷;->֫:I

    and-int/2addr v0, v1

    iget-object v1, p0, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    invoke-virtual {v1, v0}, Ll/᩺֫ܿ;->ܽ(I)V

    return-void
.end method
