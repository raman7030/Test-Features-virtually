.class public final Ll/ܽ֨ܳ;
.super Ll/᩶ۡۡ;
.source "QB4F"


# instance fields
.field public final synthetic ۟:I

.field public final synthetic ܰ:Z

.field public final synthetic ᩺:Ll/᩷֨ܳ;


# direct methods
.method public constructor <init>(Ll/᩷֨ܳ;Landroid/content/Context;[Ll/ۜ֨ܳ;ZI)V
    .locals 0

    .line 201
    iput-object p1, p0, Ll/ܽ֨ܳ;->᩺:Ll/᩷֨ܳ;

    iput-boolean p4, p0, Ll/ܽ֨ܳ;->ܰ:Z

    iput p5, p0, Ll/ܽ֨ܳ;->۟:I

    invoke-direct {p0, p2, p3}, Ll/᩶ۡۡ;-><init>(Landroid/content/Context;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final areAllItemsEnabled()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getCount()I
    .locals 3

    .line 218
    iget-boolean v0, p0, Ll/ܽ֨ܳ;->ܰ:Z

    iget-object v1, p0, Ll/ܽ֨ܳ;->᩺:Ll/᩷֨ܳ;

    if-nez v0, :cond_0

    iget v0, p0, Ll/ܽ֨ܳ;->۟:I

    const/4 v2, 0x1

    if-le v0, v2, :cond_1

    invoke-static {v1}, Ll/᩷֨ܳ;->ۧ(Ll/᩷֨ܳ;)Ll/ۗۘ;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-nez v0, :cond_1

    .line 219
    :cond_0
    invoke-static {v1}, Ll/᩷֨ܳ;->ܿ(Ll/᩷֨ܳ;)Landroid/widget/Spinner;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v0

    invoke-static {v1}, Ll/᩷֨ܳ;->ᩳ(Ll/᩷֨ܳ;)[Ll/ۜ֨ܳ;

    move-result-object v2

    array-length v2, v2

    add-int/lit8 v2, v2, -0x5

    if-lt v0, v2, :cond_1

    .line 220
    invoke-static {v1}, Ll/᩷֨ܳ;->ܿ(Ll/᩷֨ܳ;)Landroid/widget/Spinner;

    move-result-object v0

    invoke-static {v1}, Ll/᩷֨ܳ;->ܿ(Ll/᩷֨ܳ;)Landroid/widget/Spinner;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v2

    add-int/lit8 v2, v2, -0x5

    invoke-virtual {v0, v2}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 223
    :cond_1
    invoke-static {v1}, Ll/᩷֨ܳ;->ᩳ(Ll/᩷֨ܳ;)[Ll/ۜ֨ܳ;

    move-result-object v0

    array-length v0, v0

    return v0
.end method

.method public final isEnabled(I)Z
    .locals 3

    .line 210
    iget-boolean v0, p0, Ll/ܽ֨ܳ;->ܰ:Z

    iget-object v1, p0, Ll/ܽ֨ܳ;->᩺:Ll/᩷֨ܳ;

    const/4 v2, 0x1

    if-nez v0, :cond_0

    iget v0, p0, Ll/ܽ֨ܳ;->۟:I

    if-le v0, v2, :cond_1

    invoke-static {v1}, Ll/᩷֨ܳ;->ۧ(Ll/᩷֨ܳ;)Ll/ۗۘ;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-nez v0, :cond_1

    .line 211
    :cond_0
    invoke-static {v1}, Ll/᩷֨ܳ;->ᩳ(Ll/᩷֨ܳ;)[Ll/ۜ֨ܳ;

    move-result-object v0

    array-length v0, v0

    add-int/lit8 v0, v0, -0x5

    if-ge p1, v0, :cond_2

    :cond_1
    return v2

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Landroid/widget/TextView;IZ)V
    .locals 0

    if-eqz p3, :cond_1

    .line 229
    invoke-virtual {p0, p2}, Ll/ܽ֨ܳ;->isEnabled(I)Z

    move-result p2

    if-eqz p2, :cond_0

    const/high16 p2, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const p2, 0x3e99999a    # 0.3f

    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    :cond_1
    return-void
.end method
