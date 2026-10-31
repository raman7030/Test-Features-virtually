.class public Ll/ۜܶۧ;
.super Ll/ۧܶۧ;
.source "C682"


# instance fields
.field public ۟֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 68
    invoke-direct {p0, p1, v0}, Ll/ۜܶۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const v0, 0x7f0401b8

    const v1, 0x1010092

    .line 63
    invoke-static {p1, v0, v1}, Ll/ۗۗ;->֫(Landroid/content/Context;II)I

    move-result v0

    invoke-direct {p0, p1, p2, v0}, Ll/ۜܶۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, 0x0

    .line 59
    invoke-direct {p0, p1, p2, p3, v0}, Ll/ۜܶۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1

    .line 44
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ۧܶۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 46
    sget-object v0, Ll/ۢ᩹ۧ;->ᩳ:[I

    invoke-virtual {p1, p2, v0, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x0

    .line 263
    invoke-virtual {p1, p2, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    .line 264
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 51
    invoke-static {}, Ll/᩻ܶۧ;->֫()Ll/᩻ܶۧ;

    move-result-object p2

    invoke-virtual {p0, p2}, Ll/֫᩸ۧ;->֫(Ll/۟ܶۧ;)V

    .line 54
    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/content/res/TypedArray;I)Ljava/lang/Object;
    .locals 0

    .line 103
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Landroid/os/Parcelable;)V
    .locals 2

    .line 132
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ll/ܳܶۧ;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 134
    invoke-super {p0, p1}, Ll/֫᩸ۧ;->֫(Landroid/os/Parcelable;)V

    return-void

    .line 138
    :cond_0
    check-cast p1, Ll/ܳܶۧ;

    .line 139
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Ll/֫᩸ۧ;->֫(Landroid/os/Parcelable;)V

    .line 140
    iget-object p1, p1, Ll/ܳܶۧ;->᩸:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ll/ۜܶۧ;->ܽ(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 0

    .line 108
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ll/֫᩸ۧ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۜܶۧ;->ܽ(Ljava/lang/String;)V

    return-void
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 1

    .line 77
    invoke-virtual {p0}, Ll/ۜܶۧ;->ܿ֫()Z

    move-result v0

    .line 79
    iput-object p1, p0, Ll/ۜܶۧ;->۟֫:Ljava/lang/String;

    .line 81
    invoke-virtual {p0, p1}, Ll/֫᩸ۧ;->ۧ(Ljava/lang/String;)V

    .line 83
    invoke-virtual {p0}, Ll/ۜܶۧ;->ܿ֫()Z

    move-result p1

    if-eq p1, v0, :cond_0

    .line 85
    invoke-virtual {p0, p1}, Ll/֫᩸ۧ;->ۧ(Z)V

    .line 88
    :cond_0
    invoke-virtual {p0}, Ll/֫᩸ۧ;->۬()V

    return-void
.end method

.method public final ܿ֫()Z
    .locals 1

    .line 113
    iget-object v0, p0, Ll/ۜܶۧ;->۟֫:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0}, Ll/֫᩸ۧ;->ܿ֫()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩴ֫()Ljava/lang/String;
    .locals 1

    .line 98
    iget-object v0, p0, Ll/ۜܶۧ;->۟֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩺()Landroid/os/Parcelable;
    .locals 2

    .line 119
    invoke-super {p0}, Ll/֫᩸ۧ;->᩺()Landroid/os/Parcelable;

    sget-object v0, Landroid/view/AbsSavedState;->EMPTY_STATE:Landroid/view/AbsSavedState;

    .line 120
    invoke-virtual {p0}, Ll/֫᩸ۧ;->ۙ()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 125
    :cond_0
    new-instance v0, Ll/ܳܶۧ;

    invoke-direct {v0}, Ll/ܳܶۧ;-><init>()V

    .line 98
    iget-object v1, p0, Ll/ۜܶۧ;->۟֫:Ljava/lang/String;

    .line 126
    iput-object v1, v0, Ll/ܳܶۧ;->᩸:Ljava/lang/String;

    return-object v0
.end method
