.class public final Ll/ۤᩳ᩻;
.super Ljava/lang/Object;
.source "195F"


# instance fields
.field public final ֫:Ll/۬ᩳ᩻;

.field public ۧ:I

.field public ܽ:I

.field public final ᩳ:Ljava/io/BufferedReader;


# direct methods
.method public constructor <init>(Ljava/io/BufferedReader;Ll/۬ᩳ᩻;)V
    .locals 1

    .line 1663
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x2

    .line 1660
    iput v0, p0, Ll/ۤᩳ᩻;->ܽ:I

    .line 1661
    iput v0, p0, Ll/ۤᩳ᩻;->ۧ:I

    .line 1664
    iput-object p1, p0, Ll/ۤᩳ᩻;->ᩳ:Ljava/io/BufferedReader;

    .line 1665
    iput-object p2, p0, Ll/ۤᩳ᩻;->֫:Ll/۬ᩳ᩻;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 6

    .line 1684
    iget v0, p0, Ll/ۤᩳ᩻;->ۧ:I

    const/4 v1, -0x2

    if-eq v0, v1, :cond_0

    .line 1686
    iput v1, p0, Ll/ۤᩳ᩻;->ۧ:I

    return v0

    .line 1711
    :cond_0
    iget v0, p0, Ll/ۤᩳ᩻;->ܽ:I

    iget-object v2, p0, Ll/ۤᩳ᩻;->ᩳ:Ljava/io/BufferedReader;

    if-eq v0, v1, :cond_1

    .line 1713
    iput v1, p0, Ll/ۤᩳ᩻;->ܽ:I

    goto :goto_0

    .line 1716
    :cond_1
    invoke-virtual {v2}, Ljava/io/Reader;->read()I

    move-result v0

    :goto_0
    const/4 v3, -0x1

    if-ne v0, v3, :cond_2

    return v3

    :cond_2
    const/16 v3, 0xd

    .line 1693
    iget-object v4, p0, Ll/ۤᩳ᩻;->֫:Ll/۬ᩳ᩻;

    const/16 v5, 0xa

    if-ne v0, v3, :cond_6

    .line 1711
    iget v0, p0, Ll/ۤᩳ᩻;->ܽ:I

    if-eq v0, v1, :cond_3

    .line 1713
    iput v1, p0, Ll/ۤᩳ᩻;->ܽ:I

    goto :goto_1

    .line 1716
    :cond_3
    invoke-virtual {v2}, Ljava/io/Reader;->read()I

    move-result v0

    :goto_1
    if-ne v0, v5, :cond_4

    if-eqz v4, :cond_7

    const-string v0, "\r\n"

    .line 1721
    invoke-virtual {v4, v0}, Ll/۬ᩳ᩻;->֫(Ljava/lang/String;)V

    return v5

    :cond_4
    if-eqz v4, :cond_5

    const-string v1, "\r"

    invoke-virtual {v4, v1}, Ll/۬ᩳ᩻;->֫(Ljava/lang/String;)V

    .line 1699
    :cond_5
    iput v0, p0, Ll/ۤᩳ᩻;->ܽ:I

    return v5

    :cond_6
    if-ne v0, v5, :cond_8

    if-eqz v4, :cond_7

    const-string v0, "\n"

    .line 1721
    invoke-virtual {v4, v0}, Ll/۬ᩳ᩻;->֫(Ljava/lang/String;)V

    :cond_7
    return v5

    :cond_8
    return v0
.end method

.method public final ۧ()I
    .locals 5

    .line 1669
    invoke-virtual {p0}, Ll/ۤᩳ᩻;->֫()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    int-to-char v2, v0

    .line 1673
    invoke-static {v2}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 1674
    invoke-virtual {p0}, Ll/ۤᩳ᩻;->֫()I

    move-result v3

    if-eq v3, v1, :cond_1

    int-to-char v1, v3

    .line 1675
    invoke-static {v1}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 1676
    invoke-static {v2, v1}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v0

    return v0

    .line 1678
    :cond_1
    iput v3, p0, Ll/ۤᩳ᩻;->ۧ:I

    :cond_2
    return v0
.end method
