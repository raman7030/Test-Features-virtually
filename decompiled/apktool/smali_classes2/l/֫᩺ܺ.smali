.class public Ll/֫᩺ܺ;
.super Ll/ۧ᩺ܺ;
.source "L3BC"


# instance fields
.field public final ܽ:Ll/ۨۨܺ;

.field public final ܿ:Ljava/lang/Character;

.field public volatile ᩳ:Ll/ۧ᩺ܺ;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const/16 v0, 0x3d

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    .line 620
    new-instance v1, Ll/ۨۨܺ;

    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    move-result-object p2

    invoke-direct {v1, p1, p2}, Ll/ۨۨܺ;-><init>(Ljava/lang/String;[C)V

    invoke-direct {p0, v1, v0}, Ll/֫᩺ܺ;-><init>(Ll/ۨۨܺ;Ljava/lang/Character;)V

    return-void
.end method

.method public constructor <init>(Ll/ۨۨܺ;Ljava/lang/Character;)V
    .locals 1

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 624
    iput-object p1, p0, Ll/֫᩺ܺ;->ܽ:Ll/ۨۨܺ;

    if-eqz p2, :cond_1

    .line 626
    invoke-virtual {p2}, Ljava/lang/Character;->charValue()C

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۨۨܺ;->ۧ(C)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    const-string v0, "Padding character %s was already in alphabet"

    .line 625
    invoke-static {p2, v0, p1}, Ll/ۘܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 629
    iput-object p2, p0, Ll/֫᩺ܺ;->ܿ:Ljava/lang/Character;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 937
    instance-of v0, p1, Ll/֫᩺ܺ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 938
    check-cast p1, Ll/֫᩺ܺ;

    .line 939
    iget-object v0, p0, Ll/֫᩺ܺ;->ܽ:Ll/ۨۨܺ;

    iget-object v2, p1, Ll/֫᩺ܺ;->ܽ:Ll/ۨۨܺ;

    invoke-virtual {v0, v2}, Ll/ۨۨܺ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/֫᩺ܺ;->ܿ:Ljava/lang/Character;

    iget-object p1, p1, Ll/֫᩺ܺ;->ܿ:Ljava/lang/Character;

    .line 940
    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 947
    iget-object v0, p0, Ll/֫᩺ܺ;->ܽ:Ll/ۨۨܺ;

    invoke-virtual {v0}, Ll/ۨۨܺ;->hashCode()I

    move-result v0

    iget-object v1, p0, Ll/֫᩺ܺ;->ܿ:Ljava/lang/Character;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 923
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BaseEncoding."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 924
    iget-object v1, p0, Ll/֫᩺ܺ;->ܽ:Ll/ۨۨܺ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x8

    .line 925
    iget v1, v1, Ll/ۨۨܺ;->֫:I

    rem-int/2addr v2, v1

    if-eqz v2, :cond_1

    .line 926
    iget-object v1, p0, Ll/֫᩺ܺ;->ܿ:Ljava/lang/Character;

    if-nez v1, :cond_0

    const-string v1, ".omitPadding()"

    .line 927
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v2, ".withPadChar(\'"

    .line 929
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\')"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 932
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֫([BLjava/lang/CharSequence;)I
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 756
    invoke-virtual {v0, v1}, Ll/֫᩺ܺ;->֫(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    .line 757
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    iget-object v3, v0, Ll/֫᩺ܺ;->ܽ:Ll/ۨۨܺ;

    invoke-virtual {v3, v2}, Ll/ۨۨܺ;->ۧ(I)Z

    move-result v2

    iget v4, v3, Ll/ۨۨܺ;->֫:I

    iget v5, v3, Ll/ۨۨܺ;->ᩳ:I

    if-eqz v2, :cond_4

    const/4 v2, 0x0

    const/4 v6, 0x0

    .line 761
    :goto_0
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-ge v2, v7, :cond_3

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_1
    if-ge v9, v5, :cond_1

    shl-long/2addr v7, v4

    add-int v11, v2, v9

    .line 766
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v12

    if-ge v11, v12, :cond_0

    add-int/lit8 v11, v10, 0x1

    add-int/2addr v10, v2

    .line 767
    invoke-interface {v1, v10}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    invoke-virtual {v3, v10}, Ll/ۨۨܺ;->֫(C)I

    move-result v10

    int-to-long v12, v10

    or-long/2addr v7, v12

    move v10, v11

    :cond_0
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 770
    :cond_1
    iget v9, v3, Ll/ۨۨܺ;->ۧ:I

    mul-int/lit8 v11, v9, 0x8

    mul-int v10, v10, v4

    sub-int/2addr v11, v10

    add-int/lit8 v9, v9, -0x1

    mul-int/lit8 v9, v9, 0x8

    :goto_2
    if-lt v9, v11, :cond_2

    add-int/lit8 v10, v6, 0x1

    ushr-long v12, v7, v9

    const-wide/16 v14, 0xff

    and-long/2addr v12, v14

    long-to-int v13, v12

    int-to-byte v12, v13

    .line 772
    aput-byte v12, p1, v6

    add-int/lit8 v9, v9, -0x8

    move v6, v10

    goto :goto_2

    :cond_2
    add-int/2addr v2, v5

    goto :goto_0

    :cond_3
    return v6

    .line 758
    :cond_4
    new-instance v2, Ll/۟ۨܺ;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Invalid input length "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 141
    invoke-direct {v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 758
    throw v2
.end method

.method public final ֫(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 3

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 725
    iget-object v0, p0, Ll/֫᩺ܺ;->ܿ:Ljava/lang/Character;

    if-nez v0, :cond_0

    return-object p1

    .line 728
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v0

    .line 730
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    :cond_1
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_2

    .line 731
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    if-eq v2, v0, :cond_1

    :cond_2
    const/4 v0, 0x0

    add-int/lit8 v1, v1, 0x1

    .line 735
    invoke-interface {p1, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ll/ۧ᩺ܺ;
    .locals 2

    .line 899
    iget-object v0, p0, Ll/֫᩺ܺ;->ᩳ:Ll/ۧ᩺ܺ;

    if-nez v0, :cond_1

    .line 901
    iget-object v0, p0, Ll/֫᩺ܺ;->ܽ:Ll/ۨۨܺ;

    invoke-virtual {v0}, Ll/ۨۨܺ;->֫()Ll/ۨۨܺ;

    move-result-object v0

    .line 902
    iget-object v1, p0, Ll/֫᩺ܺ;->ܽ:Ll/ۨۨܺ;

    if-ne v0, v1, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ll/֫᩺ܺ;->ܿ:Ljava/lang/Character;

    invoke-virtual {p0, v0, v1}, Ll/֫᩺ܺ;->֫(Ll/ۨۨܺ;Ljava/lang/Character;)Ll/ۧ᩺ܺ;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Ll/֫᩺ܺ;->ᩳ:Ll/ۧ᩺ܺ;

    :cond_1
    return-object v0
.end method

.method public ֫(Ll/ۨۨܺ;Ljava/lang/Character;)Ll/ۧ᩺ܺ;
    .locals 1

    .line 918
    new-instance v0, Ll/֫᩺ܺ;

    invoke-direct {v0, p1, p2}, Ll/֫᩺ܺ;-><init>(Ll/ۨۨܺ;Ljava/lang/Character;)V

    return-object v0
.end method

.method public ֫(Ljava/lang/StringBuilder;[BI)V
    .locals 4

    .line 686
    array-length v0, p2

    const/4 v1, 0x0

    invoke-static {v1, p3, v0}, Ll/ۘܶܺ;->֫(III)V

    :goto_0
    if-ge v1, p3, :cond_0

    .line 688
    iget-object v0, p0, Ll/֫᩺ܺ;->ܽ:Ll/ۨۨܺ;

    iget v2, v0, Ll/ۨۨܺ;->ۧ:I

    sub-int v3, p3, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-virtual {p0, p1, p2, v1, v2}, Ll/֫᩺ܺ;->֫(Ljava/lang/StringBuilder;[BII)V

    .line 687
    iget v0, v0, Ll/ۨۨܺ;->ۧ:I

    add-int/2addr v1, v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/StringBuilder;[BII)V
    .locals 9

    add-int v0, p3, p4

    .line 694
    array-length v1, p2

    invoke-static {p3, v0, v1}, Ll/ۘܶܺ;->֫(III)V

    .line 695
    iget-object v0, p0, Ll/֫᩺ܺ;->ܽ:Ll/ۨۨܺ;

    iget v1, v0, Ll/ۨۨܺ;->ۧ:I

    iget v2, v0, Ll/ۨۨܺ;->֫:I

    const/4 v3, 0x0

    if-gt p4, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ll/ۘܶܺ;->֫(Z)V

    const-wide/16 v4, 0x0

    const/4 v1, 0x0

    :goto_1
    const/16 v6, 0x8

    if-ge v1, p4, :cond_1

    add-int v7, p3, v1

    .line 698
    aget-byte v7, p2, v7

    and-int/lit16 v7, v7, 0xff

    int-to-long v7, v7

    or-long/2addr v4, v7

    shl-long/2addr v4, v6

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 p2, p4, 0x1

    mul-int/lit8 p2, p2, 0x8

    sub-int/2addr p2, v2

    :goto_2
    mul-int/lit8 p3, p4, 0x8

    if-ge v3, p3, :cond_2

    sub-int p3, p2, v3

    ushr-long v6, v4, p3

    long-to-int p3, v6

    .line 705
    iget v1, v0, Ll/ۨۨܺ;->᩻:I

    and-int/2addr p3, v1

    .line 706
    invoke-virtual {v0, p3}, Ll/ۨۨܺ;->֫(I)C

    move-result p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    add-int/2addr v3, v2

    goto :goto_2

    .line 709
    :cond_2
    iget-object p2, p0, Ll/֫᩺ܺ;->ܿ:Ljava/lang/Character;

    if-eqz p2, :cond_3

    .line 710
    :goto_3
    iget p3, v0, Ll/ۨۨܺ;->ۧ:I

    mul-int/lit8 p3, p3, 0x8

    if-ge v3, p3, :cond_3

    .line 711
    invoke-virtual {p2}, Ljava/lang/Character;->charValue()C

    move-result p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    add-int/2addr v3, v2

    goto :goto_3

    :cond_3
    return-void
.end method

.method public final ۧ()Ll/ۧ᩺ܺ;
    .locals 2

    .line 853
    iget-object v0, p0, Ll/֫᩺ܺ;->ܿ:Ljava/lang/Character;

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Ll/֫᩺ܺ;->ܽ:Ll/ۨۨܺ;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Ll/֫᩺ܺ;->֫(Ll/ۨۨܺ;Ljava/lang/Character;)Ll/ۧ᩺ܺ;

    move-result-object v0

    return-object v0
.end method
