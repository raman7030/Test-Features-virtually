.class public abstract Ll/ۧܶۧ;
.super Ll/֫᩸ۧ;
.source "85PM"


# instance fields
.field public ۛ֫:Ljava/lang/String;

.field public ۤ֫:I

.field public ۨ֫:Ljava/lang/CharSequence;

.field public ۫֫:Landroid/graphics/drawable/Drawable;

.field public ܰ֫:Ljava/lang/String;

.field public ᩺֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 98
    invoke-direct {p0, p1, v0}, Ll/ۧܶۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const v0, 0x7f040189

    const v1, 0x1010091

    .line 93
    invoke-static {p1, v0, v1}, Ll/ۗۗ;->֫(Landroid/content/Context;II)I

    move-result v0

    invoke-direct {p0, p1, p2, v0}, Ll/ۧܶۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, 0x0

    .line 89
    invoke-direct {p0, p1, p2, p3, v0}, Ll/ۧܶۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1

    .line 53
    invoke-direct {p0, p1, p2, p3, p4}, Ll/֫᩸ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 55
    sget-object v0, Ll/ۢ᩹ۧ;->ܽ:[I

    invoke-virtual {p1, p2, v0, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const/16 p2, 0x9

    .line 309
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    if-nez p2, :cond_0

    .line 311
    invoke-virtual {p1, p3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 58
    :cond_0
    iput-object p2, p0, Ll/ۧܶۧ;->ۨ֫:Ljava/lang/CharSequence;

    if-nez p2, :cond_1

    .line 63
    invoke-virtual {p0}, Ll/֫᩸ۧ;->۠()Ljava/lang/CharSequence;

    move-result-object p2

    iput-object p2, p0, Ll/ۧܶۧ;->ۨ֫:Ljava/lang/CharSequence;

    :cond_1
    const/16 p2, 0x8

    .line 309
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_2

    const/4 p2, 0x1

    .line 311
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 66
    :cond_2
    iput-object p2, p0, Ll/ۧܶۧ;->ۛ֫:Ljava/lang/String;

    const/4 p2, 0x6

    .line 274
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-nez p2, :cond_3

    const/4 p2, 0x2

    .line 276
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    .line 69
    :cond_3
    iput-object p2, p0, Ll/ۧܶۧ;->۫֫:Landroid/graphics/drawable/Drawable;

    const/16 p2, 0xb

    .line 309
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_4

    const/4 p2, 0x3

    .line 311
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 72
    :cond_4
    iput-object p2, p0, Ll/ۧܶۧ;->ܰ֫:Ljava/lang/String;

    const/16 p2, 0xa

    .line 309
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_5

    const/4 p2, 0x4

    .line 311
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 76
    :cond_5
    iput-object p2, p0, Ll/ۧܶۧ;->᩺֫:Ljava/lang/String;

    const/4 p2, 0x5

    .line 298
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    const/4 p3, 0x7

    .line 299
    invoke-virtual {p1, p3, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    .line 80
    iput p2, p0, Ll/ۧܶۧ;->ۤ֫:I

    .line 84
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public final ۖ֫()Ljava/lang/String;
    .locals 1

    .line 239
    iget-object v0, p0, Ll/ۧܶۧ;->᩺֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ۘ֫()Ljava/lang/String;
    .locals 1

    .line 212
    iget-object v0, p0, Ll/ۧܶۧ;->ܰ֫:Ljava/lang/String;

    return-object v0
.end method

.method public ۛ()V
    .locals 1

    .line 264
    invoke-virtual {p0}, Ll/֫᩸ۧ;->ᩴ()Ll/ܿ᩹ۧ;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/ܿ᩹ۧ;->֫(Ll/ۧܶۧ;)V

    return-void
.end method

.method public final ۜ֫()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 185
    iget-object v0, p0, Ll/ۧܶۧ;->۫֫:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final ۡ֫()Ljava/lang/String;
    .locals 1

    .line 157
    iget-object v0, p0, Ll/ۧܶۧ;->ۛ֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ۢ֫()I
    .locals 1

    .line 259
    iget v0, p0, Ll/ۧܶۧ;->ۤ֫:I

    return v0
.end method

.method public final ܺ֫()Ljava/lang/CharSequence;
    .locals 1

    .line 125
    iget-object v0, p0, Ll/ۧܶۧ;->ۨ֫:Ljava/lang/CharSequence;

    return-object v0
.end method
