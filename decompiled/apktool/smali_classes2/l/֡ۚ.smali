.class public Ll/֡ۚ;
.super Ll/۟ܶ;
.source "J1AU"

# interfaces
.implements Ll/۬ۚ;


# instance fields
.field public ۛ:Z

.field public ۨ:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1, p2}, Ll/۟ܶ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 17
    iput-boolean p1, p0, Ll/֡ۚ;->ۨ:Z

    .line 18
    iput-boolean p1, p0, Ll/֡ۚ;->ۛ:Z

    .line 28
    invoke-virtual {p0, p2}, Ll/֡ۚ;->֫(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 32
    invoke-direct {p0, p1, p2, p3}, Ll/۟ܶ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 17
    iput-boolean p1, p0, Ll/֡ۚ;->ۨ:Z

    .line 18
    iput-boolean p1, p0, Ll/֡ۚ;->ۛ:Z

    .line 33
    invoke-virtual {p0, p2}, Ll/֡ۚ;->֫(Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/util/AttributeSet;)V
    .locals 4

    .line 40
    invoke-super {p0, p1}, Ll/۟ܶ;->֫(Landroid/util/AttributeSet;)V

    if-eqz p1, :cond_3

    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Ll/᩸᩸;->ᩴ:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 43
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 45
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    .line 47
    iget-boolean v3, p0, Ll/֡ۚ;->ۨ:Z

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, p0, Ll/֡ۚ;->ۨ:Z

    goto :goto_1

    :cond_0
    if-nez v2, :cond_1

    .line 49
    iget-boolean v3, p0, Ll/֡ۚ;->ۛ:Z

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, p0, Ll/֡ۚ;->ۛ:Z

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 52
    :cond_2
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_3
    return-void
.end method

.method public final ܿ()Z
    .locals 1

    .line 62
    iget-boolean v0, p0, Ll/֡ۚ;->ۨ:Z

    return v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 71
    iget-boolean v0, p0, Ll/֡ۚ;->ۛ:Z

    return v0
.end method
