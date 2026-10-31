.class public final synthetic Ll/ܰۙ᩵;
.super Ljava/lang/Object;
.source "97S2"

# interfaces
.implements Ll/᩵᩹᩵;


# instance fields
.field public final synthetic ᩸:[C


# direct methods
.method public synthetic constructor <init>([C)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰۙ᩵;->᩸:[C

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 2
    check-cast p1, Ljava/lang/CharSequence;

    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 7
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const-string v0, "$this$DelimitedRangesSequence"

    .line 13
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<this>"

    .line 1342
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 969
    iget-object v0, p0, Ll/ܰۙ᩵;->᩸:[C

    const/4 v1, 0x0

    array-length v2, v0

    const/4 v3, 0x1

    if-ne v2, v3, :cond_2

    instance-of v2, p1, Ljava/lang/String;

    if-eqz v2, :cond_2

    .line 3043
    array-length v1, v0

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    .line 3045
    aget-char v0, v0, v1

    .line 971
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1, v0, p2}, Ljava/lang/String;->indexOf(II)I

    move-result p1

    goto :goto_2

    .line 3046
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Array has more than one element."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3044
    :cond_1
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string p2, "Array is empty."

    invoke-direct {p1, p2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    if-gez p2, :cond_3

    const/4 p2, 0x0

    .line 974
    :cond_3
    invoke-static {p1}, Ll/۟ۙ᩵;->֫(Ljava/lang/CharSequence;)I

    move-result v2

    if-gt p2, v2, :cond_6

    .line 975
    :goto_0
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    .line 1794
    array-length v4, v0

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_5

    aget-char v6, v0, v5

    .line 976
    invoke-static {v6, v3, v1}, Ll/֨ۙ᩵;->֫(CCZ)Z

    move-result v6

    if-eqz v6, :cond_4

    move p1, p2

    goto :goto_2

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_5
    if-eq p2, v2, :cond_6

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_6
    const/4 p1, -0x1

    :goto_2
    if-gez p1, :cond_7

    const/4 p1, 0x0

    return-object p1

    .line 1342
    :cond_7
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    .line 44
    new-instance v0, Ll/ܺ۠᩵;

    invoke-direct {v0, p1, p2}, Ll/ܺ۠᩵;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method
