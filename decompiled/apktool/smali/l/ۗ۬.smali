.class public Ll/ۗ۬;
.super Ljava/lang/Object;
.source "N22M"


# static fields
.field public static ۘܳ᩻:I


# direct methods
.method static native constructor <clinit>()V
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֡᩷ܶ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/ܶ᩵ܿ;

    check-cast p1, [B

    invoke-virtual {p0, p1}, Ll/ܶ᩵ܿ;->֫([B)V

    return-void
.end method

.method public static ֨᩹ܿ(Ljava/lang/Object;I)V
    .locals 0

    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public static ֫(Ll/۫᩺ۧ;)Ll/ۙ۬;
    .locals 4

    .line 11
    new-instance v0, Ll/ۙ۬;

    invoke-direct {v0}, Ll/ۙ۬;-><init>()V

    .line 12
    iget v1, v0, Ll/ۙ۬;->ۢ:I

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2}, Ll/۫᩺ۧ;->֫(II)I

    move-result v1

    iput v1, v0, Ll/ۙ۬;->ۢ:I

    .line 13
    iget-object v1, v0, Ll/ۙ۬;->֫:[B

    invoke-virtual {p0, v1}, Ll/۫᩺ۧ;->֫([B)[B

    move-result-object v1

    iput-object v1, v0, Ll/ۙ۬;->֫:[B

    .line 14
    iget-object v1, v0, Ll/ۙ۬;->ܿ:Landroid/os/Parcelable;

    const/4 v2, 0x3

    invoke-virtual {p0, v1, v2}, Ll/۫᩺ۧ;->֫(Landroid/os/Parcelable;I)Landroid/os/Parcelable;

    move-result-object v1

    iput-object v1, v0, Ll/ۙ۬;->ܿ:Landroid/os/Parcelable;

    .line 15
    iget v1, v0, Ll/ۙ۬;->ۧ:I

    const/4 v3, 0x4

    invoke-virtual {p0, v1, v3}, Ll/۫᩺ۧ;->֫(II)I

    move-result v1

    iput v1, v0, Ll/ۙ۬;->ۧ:I

    .line 16
    iget v1, v0, Ll/ۙ۬;->ܽ:I

    const/4 v3, 0x5

    invoke-virtual {p0, v1, v3}, Ll/۫᩺ۧ;->֫(II)I

    move-result v1

    iput v1, v0, Ll/ۙ۬;->ܽ:I

    .line 17
    iget-object v1, v0, Ll/ۙ۬;->᩻:Landroid/content/res/ColorStateList;

    const/4 v3, 0x6

    invoke-virtual {p0, v1, v3}, Ll/۫᩺ۧ;->֫(Landroid/os/Parcelable;I)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/content/res/ColorStateList;

    iput-object v1, v0, Ll/ۙ۬;->᩻:Landroid/content/res/ColorStateList;

    .line 18
    iget-object v1, v0, Ll/ۙ۬;->᩷:Ljava/lang/String;

    const/4 v3, 0x7

    invoke-virtual {p0, v3, v1}, Ll/۫᩺ۧ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ۙ۬;->᩷:Ljava/lang/String;

    .line 19
    iget-object v1, v0, Ll/ۙ۬;->ܳ:Ljava/lang/String;

    const/16 v3, 0x8

    invoke-virtual {p0, v3, v1}, Ll/۫᩺ۧ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Ll/ۙ۬;->ܳ:Ljava/lang/String;

    .line 873
    iget-object p0, v0, Ll/ۙ۬;->᩷:Ljava/lang/String;

    invoke-static {p0}, Landroid/graphics/PorterDuff$Mode;->valueOf(Ljava/lang/String;)Landroid/graphics/PorterDuff$Mode;

    move-result-object p0

    iput-object p0, v0, Ll/ۙ۬;->ۜ:Landroid/graphics/PorterDuff$Mode;

    .line 874
    iget p0, v0, Ll/ۙ۬;->ۢ:I

    const/4 v1, 0x0

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 909
    :pswitch_1
    iget-object p0, v0, Ll/ۙ۬;->֫:[B

    iput-object p0, v0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    return-object v0

    .line 897
    :pswitch_2
    new-instance p0, Ljava/lang/String;

    iget-object v2, v0, Ll/ۙ۬;->֫:[B

    const-string v3, "UTF-16"

    invoke-static {v3}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v3

    invoke-direct {p0, v2, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    iput-object p0, v0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    .line 902
    iget v2, v0, Ll/ۙ۬;->ۢ:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_2

    .line 903
    iget-object v2, v0, Ll/ۙ۬;->ܳ:Ljava/lang/String;

    if-nez v2, :cond_2

    const-string v2, ":"

    const/4 v3, -0x1

    .line 904
    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p0

    aget-object p0, p0, v1

    iput-object p0, v0, Ll/ۙ۬;->ܳ:Ljava/lang/String;

    goto :goto_0

    .line 884
    :pswitch_3
    iget-object p0, v0, Ll/ۙ۬;->ܿ:Landroid/os/Parcelable;

    if-eqz p0, :cond_0

    .line 885
    iput-object p0, v0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    return-object v0

    .line 888
    :cond_0
    iget-object p0, v0, Ll/ۙ۬;->֫:[B

    iput-object p0, v0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    .line 889
    iput v2, v0, Ll/ۙ۬;->ۢ:I

    .line 890
    iput v1, v0, Ll/ۙ۬;->ۧ:I

    .line 891
    array-length p0, p0

    iput p0, v0, Ll/ۙ۬;->ܽ:I

    return-object v0

    .line 876
    :pswitch_4
    iget-object p0, v0, Ll/ۙ۬;->ܿ:Landroid/os/Parcelable;

    if-eqz p0, :cond_1

    .line 877
    iput-object p0, v0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    return-object v0

    .line 879
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid icon"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public static ֫(Ll/ۙ۬;Ll/۫᩺ۧ;)V
    .locals 2

    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 836
    iget-object v0, p0, Ll/ۙ۬;->ۜ:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۙ۬;->᩷:Ljava/lang/String;

    .line 837
    iget v0, p0, Ll/ۙ۬;->ۢ:I

    const-string v1, "UTF-16"

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 860
    :pswitch_1
    iget-object v0, p0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    iput-object v0, p0, Ll/ۙ۬;->֫:[B

    goto :goto_0

    .line 866
    :pswitch_2
    iget-object v0, p0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    check-cast v0, [B

    iput-object v0, p0, Ll/ۙ۬;->֫:[B

    goto :goto_0

    .line 863
    :pswitch_3
    iget-object v0, p0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    iput-object v0, p0, Ll/ۙ۬;->֫:[B

    goto :goto_0

    .line 855
    :pswitch_4
    iget-object v0, p0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    check-cast v0, Landroid/os/Parcelable;

    iput-object v0, p0, Ll/ۙ۬;->ܿ:Landroid/os/Parcelable;

    goto :goto_0

    .line 844
    :pswitch_5
    iget-object v0, p0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    check-cast v0, Landroid/os/Parcelable;

    iput-object v0, p0, Ll/ۙ۬;->ܿ:Landroid/os/Parcelable;

    .line 28
    :goto_0
    iget v0, p0, Ll/ۙ۬;->ۢ:I

    const/4 v1, -0x1

    if-eq v1, v0, :cond_0

    const/4 v1, 0x1

    .line 29
    invoke-virtual {p1, v0, v1}, Ll/۫᩺ۧ;->ۧ(II)V

    .line 31
    :cond_0
    iget-object v0, p0, Ll/ۙ۬;->֫:[B

    if-eqz v0, :cond_1

    .line 32
    invoke-virtual {p1, v0}, Ll/۫᩺ۧ;->ܽ([B)V

    .line 34
    :cond_1
    iget-object v0, p0, Ll/ۙ۬;->ܿ:Landroid/os/Parcelable;

    if-eqz v0, :cond_2

    const/4 v1, 0x3

    .line 35
    invoke-virtual {p1, v0, v1}, Ll/۫᩺ۧ;->ۧ(Landroid/os/Parcelable;I)V

    .line 37
    :cond_2
    iget v0, p0, Ll/ۙ۬;->ۧ:I

    if-eqz v0, :cond_3

    const/4 v1, 0x4

    .line 38
    invoke-virtual {p1, v0, v1}, Ll/۫᩺ۧ;->ۧ(II)V

    .line 40
    :cond_3
    iget v0, p0, Ll/ۙ۬;->ܽ:I

    if-eqz v0, :cond_4

    const/4 v1, 0x5

    .line 41
    invoke-virtual {p1, v0, v1}, Ll/۫᩺ۧ;->ۧ(II)V

    .line 43
    :cond_4
    iget-object v0, p0, Ll/ۙ۬;->᩻:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_5

    const/4 v1, 0x6

    .line 44
    invoke-virtual {p1, v0, v1}, Ll/۫᩺ۧ;->ۧ(Landroid/os/Parcelable;I)V

    .line 46
    :cond_5
    iget-object v0, p0, Ll/ۙ۬;->᩷:Ljava/lang/String;

    if-eqz v0, :cond_6

    const/4 v1, 0x7

    .line 47
    invoke-virtual {p1, v1, v0}, Ll/۫᩺ۧ;->ۧ(ILjava/lang/String;)V

    .line 49
    :cond_6
    iget-object p0, p0, Ll/ۙ۬;->ܳ:Ljava/lang/String;

    if-eqz p0, :cond_7

    const/16 v0, 0x8

    .line 50
    invoke-virtual {p1, v0, p0}, Ll/۫᩺ۧ;->ۧ(ILjava/lang/String;)V

    :cond_7
    return-void

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_4
        :pswitch_1
    .end packed-switch
.end method

.method public static ۙܶ᩶(Z)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static ۛ۠۬(Ljava/lang/Object;I)V
    .locals 0

    check-cast p0, Ljava/io/DataOutputStream;

    invoke-virtual {p0, p1}, Ljava/io/DataOutputStream;->writeInt(I)V

    return-void
.end method

.method public static ۢۗܽ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;
    .locals 0

    check-cast p0, Ljava/lang/StringBuilder;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static ۧܰ۟(ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p1, [Ljava/lang/Object;

    invoke-static {p0, p1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۨۨܳ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public static ۨ᩹ۘ(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ll/ܶ᩵ܿ;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result p0

    return p0
.end method

.method public static ۬᩵᩸(ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ܶ֫ۜ()Ll/ܿ۠ۢ;
    .locals 1

    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0
.end method

.method public static ᩳ᩺᩺(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[B
    .locals 0

    check-cast p0, Ll/ᩳܰۡ;

    check-cast p1, Ll/ۗ᩺ۡ;

    check-cast p2, Ll/᩵ۛۡ;

    invoke-virtual {p0, p1, p2}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;Ll/᩵ۛۡ;)[B

    move-result-object p0

    return-object p0
.end method

.method public static ᩴۤ᩹(Ljava/lang/Object;)Ljava/io/InputStream;
    .locals 0

    check-cast p0, Ll/ܶ᩵ܿ;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object p0

    return-object p0
.end method

.method public static ᩶᩵᩻(I)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static ᩷ۢᩴ(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Ll/۫ۨᩳ;

    invoke-virtual {p0}, Ll/۫ۨᩳ;->۫֫()I

    move-result p0

    return p0
.end method

.method public static ᩹ۙۛ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ll/ۘ۠ۢ;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static ᩹ۨ᩹([SIII)Ljava/lang/String;
    .locals 3

    new-array v1, p2, [C

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    add-int v2, p1, v0

    aget-short v2, p0, v2

    xor-int/2addr v2, p3

    int-to-char v2, v2

    aput-char v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method
