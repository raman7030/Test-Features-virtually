.class public abstract Ll/᩶ۨ;
.super Ljava/lang/Object;
.source "95QI"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:I

.field public final ᩳ:Ljava/lang/Class;


# direct methods
.method public constructor <init>(IIILjava/lang/Class;)V
    .locals 0

    .line 4818
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4819
    iput p1, p0, Ll/᩶ۨ;->ܽ:I

    .line 4820
    iput-object p4, p0, Ll/᩶ۨ;->ᩳ:Ljava/lang/Class;

    .line 4821
    iput p2, p0, Ll/᩶ۨ;->֫:I

    .line 4822
    iput p3, p0, Ll/᩶ۨ;->ۧ:I

    return-void
.end method


# virtual methods
.method public abstract ֫(Landroid/view/View;)Ljava/lang/Object;
.end method

.method public abstract ֫(Landroid/view/View;Ljava/lang/Object;)V
.end method

.method public abstract ֫(Ljava/lang/Object;Ljava/lang/Object;)Z
.end method

.method public final ۧ(Landroid/view/View;)Ljava/lang/Object;
    .locals 2

    .line 4853
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    iget v1, p0, Ll/᩶ۨ;->ۧ:I

    if-lt v0, v1, :cond_0

    .line 4842
    invoke-virtual {p0, p1}, Ll/᩶ۨ;->֫(Landroid/view/View;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 4844
    :cond_0
    iget v0, p0, Ll/᩶ۨ;->ܽ:I

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    .line 4845
    iget-object v0, p0, Ll/᩶ۨ;->ᩳ:Ljava/lang/Class;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۧ(Landroid/view/View;Ljava/lang/Object;)V
    .locals 2

    .line 4853
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    iget v1, p0, Ll/᩶ۨ;->ۧ:I

    if-lt v0, v1, :cond_0

    .line 4828
    invoke-virtual {p0, p1, p2}, Ll/᩶ۨ;->֫(Landroid/view/View;Ljava/lang/Object;)V

    return-void

    .line 4829
    :cond_0
    invoke-virtual {p0, p1}, Ll/᩶ۨ;->ۧ(Landroid/view/View;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Ll/᩶ۨ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1239
    invoke-static {p1}, Ll/ܿ᩺;->ۧ(Landroid/view/View;)Ll/ܽۛ;

    move-result-object v0

    if-nez v0, :cond_1

    .line 1241
    new-instance v0, Ll/ܽۛ;

    invoke-direct {v0}, Ll/ܽۛ;-><init>()V

    .line 1243
    :cond_1
    invoke-static {p1, v0}, Ll/ܿ᩺;->֫(Landroid/view/View;Ll/ܽۛ;)V

    .line 4831
    iget v0, p0, Ll/᩶ۨ;->ܽ:I

    invoke-virtual {p1, v0, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 4835
    iget p2, p0, Ll/᩶ۨ;->֫:I

    invoke-static {p2, p1}, Ll/ܿ᩺;->֫(ILandroid/view/View;)V

    :cond_2
    return-void
.end method
