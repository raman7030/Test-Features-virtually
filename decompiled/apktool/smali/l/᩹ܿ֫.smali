.class public final Ll/᩹ܿ֫;
.super Ll/᩸ܿ֫;
.source "FB0V"


# instance fields
.field public final ֫:Ll/ܶܿ֫;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    .line 184
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 233
    new-instance v0, Ll/ܶܿ֫;

    invoke-direct {v0, p1}, Ll/ܶܿ֫;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Ll/᩹ܿ֫;->֫:Ll/ܶܿ֫;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;
    .locals 1

    .line 237
    invoke-static {}, Ll/ۜᩳ֫;->ܿ()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    .line 279
    :cond_0
    iget-object v0, p0, Ll/᩹ܿ֫;->֫:Ll/ܶܿ֫;

    invoke-virtual {v0, p1}, Ll/ܶܿ֫;->֫(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Z)V
    .locals 1

    .line 237
    invoke-static {}, Ll/ۜᩳ֫;->ܿ()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 292
    :cond_0
    iget-object v0, p0, Ll/᩹ܿ֫;->֫:Ll/ܶܿ֫;

    invoke-virtual {v0, p1}, Ll/ܶܿ֫;->֫(Z)V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 312
    iget-object v0, p0, Ll/᩹ܿ֫;->֫:Ll/ܶܿ֫;

    invoke-virtual {v0}, Ll/ܶܿ֫;->֫()Z

    move-result v0

    return v0
.end method

.method public final ֫([Landroid/text/InputFilter;)[Landroid/text/InputFilter;
    .locals 1

    .line 237
    invoke-static {}, Ll/ۜᩳ֫;->ܿ()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    .line 264
    :cond_0
    iget-object v0, p0, Ll/᩹ܿ֫;->֫:Ll/ܶܿ֫;

    invoke-virtual {v0, p1}, Ll/ܶܿ֫;->֫([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Z)V
    .locals 2

    .line 237
    invoke-static {}, Ll/ۜᩳ֫;->ܿ()Z

    move-result v0

    .line 303
    iget-object v1, p0, Ll/᩹ܿ֫;->֫:Ll/ܶܿ֫;

    if-nez v0, :cond_0

    .line 304
    invoke-virtual {v1, p1}, Ll/ܶܿ֫;->ܽ(Z)V

    return-void

    .line 306
    :cond_0
    invoke-virtual {v1, p1}, Ll/ܶܿ֫;->ۧ(Z)V

    return-void
.end method
