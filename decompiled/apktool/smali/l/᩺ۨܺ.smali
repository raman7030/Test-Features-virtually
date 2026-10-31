.class public final Ll/᩺ۨܺ;
.super Ll/֫᩺ܺ;
.source "L3BC"


# instance fields
.field public final ܳ:[C


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 955
    new-instance v0, Ll/ۨۨܺ;

    const-string v1, "0123456789ABCDEF"

    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    const-string v2, "base16()"

    invoke-direct {v0, v2, v1}, Ll/ۨۨܺ;-><init>(Ljava/lang/String;[C)V

    invoke-direct {p0, v0}, Ll/᩺ۨܺ;-><init>(Ll/ۨۨܺ;)V

    return-void
.end method

.method public constructor <init>(Ll/ۨۨܺ;)V
    .locals 4

    const/4 v0, 0x0

    .line 959
    invoke-direct {p0, p1, v0}, Ll/֫᩺ܺ;-><init>(Ll/ۨۨܺ;Ljava/lang/Character;)V

    const/16 v0, 0x200

    new-array v0, v0, [C

    .line 952
    iput-object v0, p0, Ll/᩺ۨܺ;->ܳ:[C

    .line 960
    invoke-static {p1}, Ll/ۨۨܺ;->֫(Ll/ۨۨܺ;)[C

    move-result-object v0

    array-length v0, v0

    const/16 v1, 0x10

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/ۘܶܺ;->֫(Z)V

    :goto_1
    const/16 v0, 0x100

    if-ge v2, v0, :cond_1

    .line 962
    iget-object v0, p0, Ll/᩺ۨܺ;->ܳ:[C

    ushr-int/lit8 v1, v2, 0x4

    invoke-virtual {p1, v1}, Ll/ۨۨܺ;->֫(I)C

    move-result v1

    aput-char v1, v0, v2

    .line 963
    iget-object v0, p0, Ll/᩺ۨܺ;->ܳ:[C

    or-int/lit16 v1, v2, 0x100

    and-int/lit8 v3, v2, 0xf

    invoke-virtual {p1, v3}, Ll/ۨۨܺ;->֫(I)C

    move-result v3

    aput-char v3, v0, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method


# virtual methods
.method public final ֫([BLjava/lang/CharSequence;)I
    .locals 5

    .line 981
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    rem-int/lit8 v0, v0, 0x2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 985
    :goto_0
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 986
    invoke-interface {p2, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    iget-object v3, p0, Ll/֫᩺ܺ;->ܽ:Ll/ۨۨܺ;

    invoke-virtual {v3, v2}, Ll/ۨۨܺ;->֫(C)I

    move-result v2

    shl-int/lit8 v2, v2, 0x4

    add-int/lit8 v4, v0, 0x1

    invoke-interface {p2, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    invoke-virtual {v3, v4}, Ll/ۨۨܺ;->֫(C)I

    move-result v3

    or-int/2addr v2, v3

    add-int/lit8 v3, v1, 0x1

    int-to-byte v2, v2

    .line 987
    aput-byte v2, p1, v1

    add-int/lit8 v0, v0, 0x2

    move v1, v3

    goto :goto_0

    :cond_0
    return v1

    .line 982
    :cond_1
    new-instance p1, Ll/۟ۨܺ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid input length "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 141
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 982
    throw p1
.end method

.method public final ֫(Ll/ۨۨܺ;Ljava/lang/Character;)Ll/ۧ᩺ܺ;
    .locals 0

    .line 994
    new-instance p2, Ll/᩺ۨܺ;

    invoke-direct {p2, p1}, Ll/᩺ۨܺ;-><init>(Ll/ۨۨܺ;)V

    return-object p2
.end method

.method public final ֫(Ljava/lang/StringBuilder;[BI)V
    .locals 4

    .line 970
    array-length v0, p2

    const/4 v1, 0x0

    invoke-static {v1, p3, v0}, Ll/ۘܶܺ;->֫(III)V

    :goto_0
    if-ge v1, p3, :cond_0

    .line 972
    aget-byte v0, p2, v1

    and-int/lit16 v0, v0, 0xff

    .line 973
    iget-object v2, p0, Ll/᩺ۨܺ;->ܳ:[C

    aget-char v3, v2, v0

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    or-int/lit16 v0, v0, 0x100

    .line 974
    aget-char v0, v2, v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
