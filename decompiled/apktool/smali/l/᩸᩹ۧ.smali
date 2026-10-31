.class public abstract Ll/᩸᩹ۧ;
.super Ll/֫᩸ۧ;
.source "Z681"


# instance fields
.field public ۛ֫:Z

.field public ۤ֫:Z

.field public ۨ֫:Ljava/lang/CharSequence;

.field public ۫֫:Z

.field public ᩺֫:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 63
    invoke-direct {p0, p1, v0}, Ll/᩸᩹ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 59
    invoke-direct {p0, p1, p2, v0}, Ll/᩸᩹ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, 0x0

    .line 55
    invoke-direct {p0, p1, p2, p3, v0}, Ll/᩸᩹ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 50
    invoke-direct {p0, p1, p2, p3, p4}, Ll/֫᩸ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/content/res/TypedArray;I)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    .line 199
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Landroid/os/Parcelable;)V
    .locals 2

    .line 271
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ll/ܶ᩹ۧ;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 273
    invoke-super {p0, p1}, Ll/֫᩸ۧ;->֫(Landroid/os/Parcelable;)V

    return-void

    .line 277
    :cond_0
    check-cast p1, Ll/ܶ᩹ۧ;

    .line 278
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Ll/֫᩸ۧ;->֫(Landroid/os/Parcelable;)V

    .line 279
    iget-boolean p1, p1, Ll/ܶ᩹ۧ;->᩸:Z

    invoke-virtual {p0, p1}, Ll/᩸᩹ۧ;->᩻(Z)V

    return-void
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 0

    if-nez p1, :cond_0

    .line 205
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 207
    :cond_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Ll/֫᩸ۧ;->֫(Z)Z

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩸᩹ۧ;->᩻(Z)V

    return-void
.end method

.method public final ۛ()V
    .locals 2

    .line 82
    iget-boolean v0, p0, Ll/᩸᩹ۧ;->۫֫:Z

    xor-int/lit8 v0, v0, 0x1

    .line 71
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/֫᩸ۧ;->֫(Ljava/io/Serializable;)V

    .line 72
    invoke-virtual {p0, v0}, Ll/᩸᩹ۧ;->᩻(Z)V

    return-void
.end method

.method public final ۜ(Z)V
    .locals 0

    .line 194
    iput-boolean p1, p0, Ll/᩸᩹ۧ;->ۛ֫:Z

    return-void
.end method

.method public final ۜ֫()Z
    .locals 1

    .line 82
    iget-boolean v0, p0, Ll/᩸᩹ۧ;->۫֫:Z

    return v0
.end method

.method public final ۧ(Landroid/view/View;)V
    .locals 4

    .line 226
    instance-of v0, p1, Landroid/widget/TextView;

    if-nez v0, :cond_0

    goto :goto_3

    .line 229
    :cond_0
    check-cast p1, Landroid/widget/TextView;

    .line 231
    iget-boolean v0, p0, Ll/᩸᩹ۧ;->۫֫:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/᩸᩹ۧ;->᩺֫:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 232
    iget-object v0, p0, Ll/᩸᩹ۧ;->᩺֫:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 234
    :cond_1
    iget-boolean v0, p0, Ll/᩸᩹ۧ;->۫֫:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/᩸᩹ۧ;->ۨ֫:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 235
    iget-object v0, p0, Ll/᩸᩹ۧ;->ۨ֫:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_3

    .line 239
    invoke-virtual {p0}, Ll/֫᩸ۧ;->ۚ()Ljava/lang/CharSequence;

    move-result-object v2

    .line 240
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 241
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, 0x0

    :cond_3
    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    const/16 v1, 0x8

    .line 250
    :goto_2
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq v1, v0, :cond_5

    .line 251
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_5
    :goto_3
    return-void
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 0

    .line 152
    iput-object p1, p0, Ll/᩸᩹ۧ;->ۨ֫:Ljava/lang/CharSequence;

    .line 82
    iget-boolean p1, p0, Ll/᩸᩹ۧ;->۫֫:Z

    if-nez p1, :cond_0

    .line 154
    invoke-virtual {p0}, Ll/֫᩸ۧ;->۬()V

    :cond_0
    return-void
.end method

.method public final ܿ֫()Z
    .locals 3

    .line 106
    iget-boolean v0, p0, Ll/᩸᩹ۧ;->ۛ֫:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/᩸᩹ۧ;->۫֫:Z

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Ll/᩸᩹ۧ;->۫֫:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_3

    .line 107
    invoke-super {p0}, Ll/֫᩸ۧ;->ܿ֫()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    return v1

    :cond_3
    :goto_1
    return v2
.end method

.method public final ᩳ(Ljava/lang/String;)V
    .locals 0

    .line 119
    iput-object p1, p0, Ll/᩸᩹ۧ;->᩺֫:Ljava/lang/CharSequence;

    .line 82
    iget-boolean p1, p0, Ll/᩸᩹ۧ;->۫֫:Z

    if-eqz p1, :cond_0

    .line 121
    invoke-virtual {p0}, Ll/֫᩸ۧ;->۬()V

    :cond_0
    return-void
.end method

.method public final ᩺()Landroid/os/Parcelable;
    .locals 2

    .line 258
    invoke-super {p0}, Ll/֫᩸ۧ;->᩺()Landroid/os/Parcelable;

    sget-object v0, Landroid/view/AbsSavedState;->EMPTY_STATE:Landroid/view/AbsSavedState;

    .line 259
    invoke-virtual {p0}, Ll/֫᩸ۧ;->ۙ()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 264
    :cond_0
    new-instance v0, Ll/ܶ᩹ۧ;

    invoke-direct {v0}, Ll/ܶ᩹ۧ;-><init>()V

    .line 82
    iget-boolean v1, p0, Ll/᩸᩹ۧ;->۫֫:Z

    .line 265
    iput-boolean v1, v0, Ll/ܶ᩹ۧ;->᩸:Z

    return-object v0
.end method

.method public final ᩻(Z)V
    .locals 3

    .line 92
    iget-boolean v0, p0, Ll/᩸᩹ۧ;->۫֫:Z

    const/4 v1, 0x1

    if-eq v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    .line 93
    iget-boolean v2, p0, Ll/᩸᩹ۧ;->ۤ֫:Z

    if-nez v2, :cond_2

    .line 94
    :cond_1
    iput-boolean p1, p0, Ll/᩸᩹ۧ;->۫֫:Z

    .line 95
    iput-boolean v1, p0, Ll/᩸᩹ۧ;->ۤ֫:Z

    .line 96
    invoke-virtual {p0, p1}, Ll/֫᩸ۧ;->ᩳ(Z)V

    if-eqz v0, :cond_2

    .line 98
    invoke-virtual {p0}, Ll/᩸᩹ۧ;->ܿ֫()Z

    move-result p1

    invoke-virtual {p0, p1}, Ll/֫᩸ۧ;->ۧ(Z)V

    .line 99
    invoke-virtual {p0}, Ll/֫᩸ۧ;->۬()V

    :cond_2
    return-void
.end method
