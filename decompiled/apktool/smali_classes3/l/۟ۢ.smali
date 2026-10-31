.class public final Ll/۟ۢ;
.super Ljava/lang/Object;
.source "OB0Y"


# instance fields
.field public final ֫:Ll/᩶ܿ֫;

.field public final ۧ:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Ll/۟ۢ;->ۧ:Landroid/widget/TextView;

    .line 43
    new-instance v0, Ll/᩶ܿ֫;

    invoke-direct {v0, p1}, Ll/᩶ܿ֫;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Ll/۟ۢ;->֫:Ll/᩶ܿ֫;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;
    .locals 1

    .line 122
    iget-object v0, p0, Ll/۟ۢ;->֫:Ll/᩶ܿ֫;

    invoke-virtual {v0, p1}, Ll/᩶ܿ֫;->֫(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Landroid/util/AttributeSet;I)V
    .locals 3

    .line 52
    iget-object v0, p0, Ll/۟ۢ;->ۧ:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 53
    sget-object v1, Ll/ۗᩳ;->ۢ:[I

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const/16 p2, 0xe

    .line 57
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 58
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 63
    invoke-virtual {p0, v1}, Ll/۟ۢ;->ۧ(Z)V

    return-void

    :catchall_0
    move-exception p2

    .line 61
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 62
    throw p2
.end method

.method public final ֫(Z)V
    .locals 1

    .line 109
    iget-object v0, p0, Ll/۟ۢ;->֫:Ll/᩶ܿ֫;

    invoke-virtual {v0, p1}, Ll/᩶ܿ֫;->֫(Z)V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 84
    iget-object v0, p0, Ll/۟ۢ;->֫:Ll/᩶ܿ֫;

    invoke-virtual {v0}, Ll/᩶ܿ֫;->֫()Z

    move-result v0

    return v0
.end method

.method public final ֫([Landroid/text/InputFilter;)[Landroid/text/InputFilter;
    .locals 1

    .line 99
    iget-object v0, p0, Ll/۟ۢ;->֫:Ll/᩶ܿ֫;

    invoke-virtual {v0, p1}, Ll/᩶ܿ֫;->֫([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Z)V
    .locals 1

    .line 77
    iget-object v0, p0, Ll/۟ۢ;->֫:Ll/᩶ܿ֫;

    invoke-virtual {v0, p1}, Ll/᩶ܿ֫;->ۧ(Z)V

    return-void
.end method
