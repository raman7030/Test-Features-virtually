.class public abstract Ll/ܽۙ֡;
.super Ljava/lang/Object;
.source "855A"

# interfaces
.implements Ljava/lang/Comparable;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ll/ۗ᩶֡;Ll/ۧۗ֡;)Ll/ܽۙ֡;
    .locals 3

    .line 55
    invoke-virtual {p1}, Ll/ۧۗ֡;->ۧ()B

    move-result v0

    and-int/lit8 v1, v0, 0x1f

    int-to-byte v1, v1

    .line 56
    invoke-static {v1}, Ll/ۘۙ֡;->֫(B)Ll/ۘۙ֡;

    move-result-object v1

    and-int/lit16 v0, v0, 0xff

    shr-int/lit8 v0, v0, 0x5

    int-to-byte v0, v0

    .line 59
    sget-object v2, Ll/ۧۙ֡;->֫:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    packed-switch v1, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    if-nez v0, :cond_0

    .line 60
    sget-object p0, Ll/᩺᩶֡;->᩹:Ll/᩺᩶֡;

    return-object p0

    :cond_0
    const/4 p0, 0x1

    if-ne v0, p0, :cond_1

    .line 62
    sget-object p0, Ll/᩺᩶֡;->᩶:Ll/᩺᩶֡;

    return-object p0

    .line 91
    :cond_1
    sget-object p0, Ll/᩺᩶֡;->᩶:Ll/᩺᩶֡;

    .line 64
    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "valueArg must be either 0 or 1"

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 89
    :pswitch_1
    sget-object p0, Ll/ۢۙ֡;->᩸:Ll/ۢۙ֡;

    return-object p0

    .line 87
    :pswitch_2
    new-instance v0, Ll/ۤ᩶֡;

    .line 46
    invoke-direct {v0, p0, p1}, Ll/۫᩶֡;-><init>(Ll/ۗ᩶֡;Ll/ۧۗ֡;)V

    return-object v0

    .line 85
    :pswitch_3
    new-instance v0, Ll/ۨ᩶֡;

    .line 44
    invoke-direct {v0, p0, p1}, Ll/ۛ᩶֡;-><init>(Ll/ۗ᩶֡;Ll/ۧۗ֡;)V

    return-object v0

    .line 83
    :pswitch_4
    new-instance v1, Ll/ᩳۙ֡;

    invoke-direct {v1, p0, p1, v0}, Ll/ᩳۙ֡;-><init>(Ll/ۗ᩶֡;Ll/ۧۗ֡;B)V

    return-object v1

    .line 81
    :pswitch_5
    new-instance v1, Ll/᩷ۙ֡;

    invoke-direct {v1, p0, p1, v0}, Ll/᩷ۙ֡;-><init>(Ll/ۗ᩶֡;Ll/ۧۗ֡;B)V

    return-object v1

    .line 79
    :pswitch_6
    new-instance v1, Ll/ܿۙ֡;

    invoke-direct {v1, p0, p1, v0}, Ll/ܿۙ֡;-><init>(Ll/ۗ᩶֡;Ll/ۧۗ֡;B)V

    return-object v1

    .line 77
    :pswitch_7
    new-instance v1, Ll/ۖۙ֡;

    invoke-direct {v1, p0, p1, v0}, Ll/ۖۙ֡;-><init>(Ll/ۗ᩶֡;Ll/ۧۗ֡;B)V

    return-object v1

    .line 75
    :pswitch_8
    new-instance v1, Ll/ܺۙ֡;

    invoke-direct {v1, p0, p1, v0}, Ll/ܺۙ֡;-><init>(Ll/ۗ᩶֡;Ll/ۧۗ֡;B)V

    return-object v1

    .line 73
    :pswitch_9
    new-instance p0, Ll/֫ۙ֡;

    invoke-direct {p0, p1, v0}, Ll/֫ۙ֡;-><init>(Ll/ۧۗ֡;B)V

    return-object p0

    .line 71
    :pswitch_a
    new-instance p0, Ll/ܳۙ֡;

    invoke-direct {p0, p1, v0}, Ll/ܳۙ֡;-><init>(Ll/ۧۗ֡;B)V

    return-object p0

    .line 69
    :pswitch_b
    new-instance p0, Ll/ۜۙ֡;

    invoke-direct {p0, p1, v0}, Ll/ۜۙ֡;-><init>(Ll/ۧۗ֡;B)V

    return-object p0

    .line 67
    :pswitch_c
    new-instance p0, Ll/᩻ۙ֡;

    invoke-direct {p0, p1, v0}, Ll/᩻ۙ֡;-><init>(Ll/ۧۗ֡;B)V

    return-object p0

    .line 65
    :pswitch_d
    new-instance p0, Ll/۟᩶֡;

    invoke-direct {p0, p1, v0}, Ll/۟᩶֡;-><init>(Ll/ۧۗ֡;B)V

    return-object p0

    .line 63
    :pswitch_e
    new-instance p0, Ll/ۡۙ֡;

    invoke-direct {p0, p1, v0}, Ll/ۡۙ֡;-><init>(Ll/ۧۗ֡;B)V

    return-object p0

    .line 61
    :pswitch_f
    new-instance p0, Ll/ܰ᩶֡;

    invoke-direct {p0, p1}, Ll/ܰ᩶֡;-><init>(Ll/ۧۗ֡;)V

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ll/ۗ᩶֡;Ll/ܽۙ֡;)Ll/ܽۙ֡;
    .locals 7

    .line 99
    sget-object v0, Ll/ۧۙ֡;->֫:[I

    invoke-virtual {p1}, Ll/ܽۙ֡;->ۖ()Ll/ۘۙ֡;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    return-object v2

    .line 161
    :pswitch_0
    check-cast p1, Ll/᩺᩶֡;

    iget-boolean p0, p1, Ll/᩺᩶֡;->᩸:Z

    if-eqz p0, :cond_0

    .line 75
    sget-object p0, Ll/᩺᩶֡;->᩶:Ll/᩺᩶֡;

    return-object p0

    .line 77
    :cond_0
    sget-object p0, Ll/᩺᩶֡;->᩹:Ll/᩺᩶֡;

    return-object p0

    .line 159
    :pswitch_1
    sget-object p0, Ll/ۢۙ֡;->᩸:Ll/ۢۙ֡;

    return-object p0

    .line 157
    :pswitch_2
    check-cast p1, Ll/ۤ᩶֡;

    .line 50
    new-instance v0, Ll/ۤ᩶֡;

    iget-object v3, p1, Ll/۫᩶֡;->᩸:Ll/᩺ۙ֡;

    .line 53
    invoke-virtual {v3}, Ll/᩺ۙ֡;->᩷()Ljava/lang/String;

    move-result-object v3

    .line 51
    invoke-static {v3, p0}, Ll/᩺ۙ֡;->֫(Ljava/lang/String;Ll/ۗ᩶֡;)Ll/᩺ۙ֡;

    move-result-object v3

    .line 86
    iget-object v4, p1, Ll/۫᩶֡;->᩶:[Ll/ۨۙ֡;

    if-nez v4, :cond_1

    goto :goto_1

    .line 89
    :cond_1
    array-length v2, v4

    new-array v5, v2, [Ll/ۨۙ֡;

    :goto_0
    if-ge v1, v2, :cond_2

    .line 91
    aget-object v6, v4, v1

    .line 93
    invoke-virtual {v6}, Ll/ۨۙ֡;->᩻()Ljava/lang/String;

    move-result-object v6

    .line 91
    invoke-static {v6, p0}, Ll/ۨۙ֡;->֫(Ljava/lang/String;Ll/ۗ᩶֡;)Ll/ۨۙ֡;

    move-result-object v6

    aput-object v6, v5, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    move-object v2, v5

    .line 56
    :goto_1
    invoke-virtual {p1, p0}, Ll/۫᩶֡;->֫(Ll/ۗ᩶֡;)[Ll/ܽۙ֡;

    move-result-object p0

    .line 70
    invoke-direct {v0, v3, v2, p0}, Ll/۫᩶֡;-><init>(Ll/᩺ۙ֡;[Ll/ۨۙ֡;[Ll/ܽۙ֡;)V

    return-object v0

    .line 149
    :pswitch_3
    check-cast p1, Ll/ۨ᩶֡;

    iget-object p1, p1, Ll/ۛ᩶֡;->᩹:[Ll/ܽۙ֡;

    .line 150
    array-length v0, p1

    new-array v2, v0, [Ll/ܽۙ֡;

    :goto_2
    if-ge v1, v0, :cond_3

    .line 152
    aget-object v3, p1, v1

    invoke-static {p0, v3}, Ll/ܽۙ֡;->֫(Ll/ۗ᩶֡;Ll/ܽۙ֡;)Ll/ܽۙ֡;

    move-result-object v3

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 154
    :cond_3
    new-instance p0, Ll/ۨ᩶֡;

    .line 53
    invoke-direct {p0, v2}, Ll/ۛ᩶֡;-><init>([Ll/ܽۙ֡;)V

    return-object p0

    .line 143
    :pswitch_4
    new-instance v0, Ll/ᩳۙ֡;

    check-cast p1, Ll/ᩳۙ֡;

    iget-object p1, p1, Ll/ᩳۙ֡;->᩸:Ll/ᩴۙ֡;

    .line 144
    invoke-virtual {p1, p0}, Ll/ᩴۙ֡;->֫(Ll/ۗ᩶֡;)Ll/ᩴۙ֡;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ᩳۙ֡;-><init>(Ll/ᩴۙ֡;)V

    return-object v0

    .line 137
    :pswitch_5
    new-instance v0, Ll/᩷ۙ֡;

    check-cast p1, Ll/᩷ۙ֡;

    iget-object p1, p1, Ll/᩷ۙ֡;->᩸:Ll/᩹ۙ֡;

    .line 138
    invoke-virtual {p1, p0}, Ll/᩹ۙ֡;->֫(Ll/ۗ᩶֡;)Ll/᩹ۙ֡;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/᩷ۙ֡;-><init>(Ll/᩹ۙ֡;)V

    return-object v0

    .line 130
    :pswitch_6
    new-instance v0, Ll/ܿۙ֡;

    check-cast p1, Ll/ܿۙ֡;

    iget-object p1, p1, Ll/ܿۙ֡;->᩸:Ll/ᩴۙ֡;

    .line 131
    invoke-virtual {p1, p0}, Ll/ᩴۙ֡;->֫(Ll/ۗ᩶֡;)Ll/ᩴۙ֡;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ܿۙ֡;-><init>(Ll/ᩴۙ֡;)V

    return-object v0

    .line 123
    :pswitch_7
    new-instance v0, Ll/ۖۙ֡;

    check-cast p1, Ll/ۖۙ֡;

    iget-object p1, p1, Ll/ۖۙ֡;->᩸:Ll/᩺ۙ֡;

    .line 126
    invoke-virtual {p1}, Ll/᩺ۙ֡;->᩷()Ljava/lang/String;

    move-result-object p1

    .line 124
    invoke-static {p1, p0}, Ll/᩺ۙ֡;->֫(Ljava/lang/String;Ll/ۗ᩶֡;)Ll/᩺ۙ֡;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ۖۙ֡;-><init>(Ll/᩺ۙ֡;)V

    return-object v0

    .line 115
    :pswitch_8
    new-instance v0, Ll/ܺۙ֡;

    check-cast p1, Ll/ܺۙ֡;

    iget-object p1, p1, Ll/ܺۙ֡;->᩸:Ll/ۨۙ֡;

    .line 118
    invoke-virtual {p1}, Ll/ۨۙ֡;->᩻()Ljava/lang/String;

    move-result-object p1

    .line 116
    invoke-static {p1, p0}, Ll/ۨۙ֡;->֫(Ljava/lang/String;Ll/ۗ᩶֡;)Ll/ۨۙ֡;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ܺۙ֡;-><init>(Ll/ۨۙ֡;)V

    return-object v0

    .line 113
    :pswitch_9
    new-instance p0, Ll/֫ۙ֡;

    check-cast p1, Ll/֫ۙ֡;

    iget-wide v0, p1, Ll/֫ۙ֡;->᩸:D

    invoke-direct {p0, v0, v1}, Ll/֫ۙ֡;-><init>(D)V

    return-object p0

    .line 111
    :pswitch_a
    new-instance p0, Ll/ܳۙ֡;

    check-cast p1, Ll/ܳۙ֡;

    iget p1, p1, Ll/ܳۙ֡;->᩸:F

    invoke-direct {p0, p1}, Ll/ܳۙ֡;-><init>(F)V

    return-object p0

    .line 109
    :pswitch_b
    new-instance p0, Ll/ۜۙ֡;

    check-cast p1, Ll/ۜۙ֡;

    iget-wide v0, p1, Ll/ۜۙ֡;->᩸:J

    invoke-direct {p0, v0, v1}, Ll/ۜۙ֡;-><init>(J)V

    return-object p0

    .line 107
    :pswitch_c
    new-instance p0, Ll/᩻ۙ֡;

    check-cast p1, Ll/᩻ۙ֡;

    iget p1, p1, Ll/᩻ۙ֡;->᩸:I

    invoke-direct {p0, p1}, Ll/᩻ۙ֡;-><init>(I)V

    return-object p0

    .line 105
    :pswitch_d
    new-instance p0, Ll/۟᩶֡;

    check-cast p1, Ll/۟᩶֡;

    iget-char p1, p1, Ll/۟᩶֡;->᩸:C

    invoke-direct {p0, p1}, Ll/۟᩶֡;-><init>(C)V

    return-object p0

    .line 103
    :pswitch_e
    new-instance p0, Ll/ۡۙ֡;

    check-cast p1, Ll/ۡۙ֡;

    iget-short p1, p1, Ll/ۡۙ֡;->᩸:S

    invoke-direct {p0, p1}, Ll/ۡۙ֡;-><init>(S)V

    return-object p0

    .line 101
    :pswitch_f
    new-instance p0, Ll/ܰ᩶֡;

    check-cast p1, Ll/ܰ᩶֡;

    iget-byte p1, p1, Ll/ܰ᩶֡;->᩸:B

    invoke-direct {p0, p1}, Ll/ܰ᩶֡;-><init>(B)V

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 37
    check-cast p1, Ll/ܽۙ֡;

    invoke-virtual {p0, p1}, Ll/ܽۙ֡;->֫(Ll/ܽۙ֡;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 197
    instance-of v2, p1, Ll/ܽۙ֡;

    if-nez v2, :cond_1

    goto :goto_0

    .line 201
    :cond_1
    check-cast p1, Ll/ܽۙ֡;

    invoke-virtual {p0, p1}, Ll/ܽۙ֡;->֫(Ll/ܽۙ֡;)I

    move-result p1

    if-nez p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public abstract ֫(I)I
.end method

.method public final ֫(Ll/ܽۙ֡;)I
    .locals 2

    .line 171
    invoke-virtual {p0}, Ll/ܽۙ֡;->ۖ()Ll/ۘۙ֡;

    move-result-object v0

    invoke-virtual {p1}, Ll/ܽۙ֡;->ۖ()Ll/ۘۙ֡;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-nez v0, :cond_0

    .line 173
    invoke-virtual {p0, p1}, Ll/ܽۙ֡;->ۧ(Ll/ܽۙ֡;)I

    move-result p1

    return p1

    :cond_0
    return v0
.end method

.method public abstract ֫(Ll/֫ۗ֡;)V
.end method

.method public abstract ۖ()Ll/ۘۙ֡;
.end method

.method public abstract ۧ(Ll/ܽۙ֡;)I
.end method
