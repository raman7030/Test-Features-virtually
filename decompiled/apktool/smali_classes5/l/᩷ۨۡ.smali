.class public final Ll/᩷ۨۡ;
.super Ljava/lang/Object;
.source "K7K5"

# interfaces
.implements Ll/֡ۤۖ;
.implements Ll/۠᩶ۢ;


# direct methods
.method public static ֫(Landroid/view/ViewGroup;FF)Landroid/view/View;
    .locals 6

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr p1, v0

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr p2, v0

    const/4 v0, 0x0

    .line 14
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 15
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 32
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v2

    .line 33
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v3

    .line 34
    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v4

    .line 35
    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v5

    int-to-float v2, v2

    cmpl-float v2, p1, v2

    if-ltz v2, :cond_1

    int-to-float v2, v4

    cmpg-float v2, p1, v2

    if-gtz v2, :cond_1

    int-to-float v2, v3

    cmpl-float v2, p2, v2

    if-ltz v2, :cond_1

    int-to-float v2, v5

    cmpg-float v2, p2, v2

    if-gtz v2, :cond_1

    .line 17
    instance-of p0, v1, Landroid/view/ViewGroup;

    if-eqz p0, :cond_0

    move-object p0, v1

    check-cast p0, Landroid/view/ViewGroup;

    .line 18
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr p1, v0

    .line 19
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr p2, v0

    .line 20
    invoke-static {p0, p1, p2}, Ll/᩷ۨۡ;->֫(Landroid/view/ViewGroup;FF)Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    return-object v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(I)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, -0x1

    if-ge p0, v1, :cond_0

    return v0

    :cond_0
    const/4 v2, 0x1

    if-ne p0, v1, :cond_1

    return v2

    :cond_1
    and-int/lit16 v1, p0, 0xff

    if-eqz v1, :cond_4

    const/16 v3, 0xff

    if-ne v1, v3, :cond_2

    goto :goto_0

    :cond_2
    const v1, 0xff00

    and-int/2addr p0, v1

    if-nez p0, :cond_3

    return v2

    :cond_3
    return v0

    :cond_4
    :goto_0
    return v2
.end method


# virtual methods
.method public ֫(Ljava/lang/CharSequence;Ll/ۗ᩶ۢ;Ll/ᩴ᩷ܿ;)V
    .locals 4

    .line 20
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    .line 21
    new-instance p2, Ll/᩵ܺۚ;

    invoke-direct {p2}, Ll/᩵ܺۚ;-><init>()V

    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p2, Ll/᩵ܺۚ;->֫:Z

    const/16 v0, 0x1c

    .line 23
    iput v0, p2, Ll/᩵ܺۚ;->ۧ:I

    .line 24
    invoke-virtual {p2}, Ll/᩵ܺۚ;->֫()Ll/᩵ۡۚ;

    move-result-object v1

    .line 25
    invoke-static {p1, v1, p2}, Ll/ۢܺۚ;->֫(Ljava/lang/String;Ll/᩵ۡۚ;Ll/᩵ܺۚ;)Ll/֡᩷ۚ;

    move-result-object p2

    .line 26
    new-instance v1, Ll/᩹ܶ֡;

    invoke-direct {v1}, Ll/᩹ܶ֡;-><init>()V

    .line 27
    iput v0, v1, Ll/᩹ܶ֡;->֫:I

    .line 29
    new-instance v0, Ll/ۨۖܽ;

    invoke-direct {v0}, Ll/ۨۖܽ;-><init>()V

    .line 31
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/StringReader;

    invoke-direct {v3, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 33
    :goto_0
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 34
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    const-string v3, "#"

    .line 35
    invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 36
    invoke-virtual {v0, p1}, Ll/ۨۖܽ;->ۧ(Ljava/lang/String;)V

    const/16 p1, 0xa

    invoke-virtual {v0, p1}, Ll/ۨۖܽ;->append(C)V

    goto :goto_0

    .line 43
    :cond_0
    new-instance p1, Ll/᩺ۖܽ;

    invoke-direct {p1, v0}, Ll/᩺ۖܽ;-><init>(Ll/ۨۖܽ;)V

    invoke-static {p1, p2, v1}, Ll/᩸ܶ֡;->֫(Ljava/io/Writer;Ll/ۡ֫ۚ;Ll/᩹ܶ֡;)V

    .line 42
    invoke-virtual {v0}, Ll/ۨۖܽ;->toString()Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-virtual {p3, p1}, Ll/ᩴ᩷ܿ;->append(Ljava/lang/CharSequence;)Ll/ᩴ᩷ܿ;

    return-void
.end method
