.class public final Ll/ۗۖۧ;
.super Ljava/lang/Object;
.source "K8QR"


# instance fields
.field public final ֫:Ll/۠ᩴ֫;

.field public final ۖ:Ll/ᩳ֨֫;

.field public final ۜ:Ll/ᩳ֨֫;

.field public ۡ:Ll/᩷ۘۧ;

.field public final ۢ:Ll/ۜۘۧ;

.field public ۧ:I

.field public final ܳ:Ll/ᩳ֨֫;

.field public final ܺ:Ll/᩵ۢۧ;

.field public ܽ:I

.field public ܿ:Z

.field public ᩳ:I

.field public ᩷:I

.field public ᩻:Ll/᩶ۖۧ;


# direct methods
.method public constructor <init>(Ll/᩵ۢۧ;Ll/᩷ۘۧ;Ll/᩶ۖۧ;Ll/۠ᩴ֫;)V
    .locals 0

    .line 2003
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2004
    iput-object p1, p0, Ll/ۗۖۧ;->ܺ:Ll/᩵ۢۧ;

    .line 2005
    iput-object p2, p0, Ll/ۗۖۧ;->ۡ:Ll/᩷ۘۧ;

    .line 2006
    iput-object p3, p0, Ll/ۗۖۧ;->᩻:Ll/᩶ۖۧ;

    .line 2007
    iput-object p4, p0, Ll/ۗۖۧ;->֫:Ll/۠ᩴ֫;

    .line 2008
    new-instance p1, Ll/ۜۘۧ;

    invoke-direct {p1}, Ll/ۜۘۧ;-><init>()V

    iput-object p1, p0, Ll/ۗۖۧ;->ۢ:Ll/ۜۘۧ;

    .line 2009
    new-instance p1, Ll/ᩳ֨֫;

    invoke-direct {p1}, Ll/ᩳ֨֫;-><init>()V

    iput-object p1, p0, Ll/ۗۖۧ;->ۖ:Ll/ᩳ֨֫;

    .line 2010
    new-instance p1, Ll/ᩳ֨֫;

    const/4 p4, 0x1

    invoke-direct {p1, p4}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object p1, p0, Ll/ۗۖۧ;->ۜ:Ll/ᩳ֨֫;

    .line 2011
    new-instance p1, Ll/ᩳ֨֫;

    invoke-direct {p1}, Ll/ᩳ֨֫;-><init>()V

    iput-object p1, p0, Ll/ۗۖۧ;->ܳ:Ll/ᩳ֨֫;

    .line 2012
    invoke-virtual {p0, p2, p3}, Ll/ۗۖۧ;->֫(Ll/᩷ۘۧ;Ll/᩶ۖۧ;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۗۖۧ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۗۖۧ;->ܿ:Z

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ۗۖۧ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/ۗۖۧ;->ܿ:Z

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 2084
    iget-boolean v0, p0, Ll/ۗۖۧ;->ܿ:Z

    if-nez v0, :cond_0

    .line 2085
    iget-object v0, p0, Ll/ۗۖۧ;->ۡ:Ll/᩷ۘۧ;

    iget-object v0, v0, Ll/᩷ۘۧ;->ۧ:[I

    iget v1, p0, Ll/ۗۖۧ;->ܽ:I

    aget v0, v0, v1

    goto :goto_0

    .line 2086
    :cond_0
    iget-object v0, p0, Ll/ۗۖۧ;->ۢ:Ll/ۜۘۧ;

    iget-object v0, v0, Ll/ۜۘۧ;->ۡ:[Z

    iget v1, p0, Ll/ۗۖۧ;->ܽ:I

    aget-boolean v0, v0, v1

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 2087
    :goto_0
    invoke-virtual {p0}, Ll/ۗۖۧ;->ܿ()Ll/᩻ۘۧ;

    move-result-object v1

    if-eqz v1, :cond_2

    const/high16 v1, 0x40000000    # 2.0f

    or-int/2addr v0, v1

    :cond_2
    return v0
.end method

.method public final ֫(II)I
    .locals 11

    .line 2132
    invoke-virtual {p0}, Ll/ۗۖۧ;->ܿ()Ll/᩻ۘۧ;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2139
    :cond_0
    iget v2, v0, Ll/᩻ۘۧ;->ᩳ:I

    iget-object v3, p0, Ll/ۗۖۧ;->ۢ:Ll/ۜۘۧ;

    if-eqz v2, :cond_1

    .line 2140
    iget-object v0, v3, Ll/ۜۘۧ;->ۜ:Ll/ᩳ֨֫;

    goto :goto_0

    .line 2144
    :cond_1
    iget-object v0, v0, Ll/᩻ۘۧ;->ۧ:[B

    sget-object v2, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 2145
    array-length v2, v0

    iget-object v4, p0, Ll/ۗۖۧ;->ܳ:Ll/ᩳ֨֫;

    invoke-virtual {v4, v2, v0}, Ll/ᩳ֨֫;->֫(I[B)V

    .line 2147
    array-length v2, v0

    move-object v0, v4

    .line 2150
    :goto_0
    iget v4, p0, Ll/ۗۖۧ;->ܽ:I

    .line 194
    iget-boolean v5, v3, Ll/ۜۘۧ;->ܽ:Z

    const/4 v6, 0x1

    if-eqz v5, :cond_2

    iget-object v5, v3, Ll/ۜۘۧ;->ۢ:[Z

    aget-boolean v4, v5, v4

    if-eqz v4, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_4

    if-eqz p2, :cond_3

    goto :goto_2

    :cond_3
    const/4 v5, 0x0

    goto :goto_3

    :cond_4
    :goto_2
    const/4 v5, 0x1

    .line 2155
    :goto_3
    iget-object v7, p0, Ll/ۗۖۧ;->ۜ:Ll/ᩳ֨֫;

    invoke-virtual {v7}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v8

    if-eqz v5, :cond_5

    const/16 v9, 0x80

    goto :goto_4

    :cond_5
    const/4 v9, 0x0

    :goto_4
    or-int/2addr v9, v2

    int-to-byte v9, v9

    .line 2156
    aput-byte v9, v8, v1

    .line 2157
    invoke-virtual {v7, v1}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 2158
    iget-object v8, p0, Ll/ۗۖۧ;->ܺ:Ll/᩵ۢۧ;

    invoke-interface {v8, v7, v6, v6}, Ll/᩵ۢۧ;->֫(Ll/ᩳ֨֫;II)V

    .line 2160
    invoke-interface {v8, v0, v2, v6}, Ll/᩵ۢۧ;->֫(Ll/ᩳ֨֫;II)V

    if-nez v5, :cond_6

    add-int/2addr v2, v6

    return v2

    :cond_6
    const/4 v0, 0x6

    const/4 v5, 0x3

    const/4 v7, 0x2

    const/16 v9, 0x8

    .line 2167
    iget-object v10, p0, Ll/ۗۖۧ;->ۖ:Ll/ᩳ֨֫;

    if-nez v4, :cond_7

    .line 2171
    invoke-virtual {v10, v9}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 2173
    invoke-virtual {v10}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    .line 2174
    aput-byte v1, v3, v1

    .line 2175
    aput-byte v6, v3, v6

    int-to-byte v1, v1

    .line 2177
    aput-byte v1, v3, v7

    and-int/lit16 p2, p2, 0xff

    int-to-byte p2, p2

    .line 2178
    aput-byte p2, v3, v5

    shr-int/lit8 p2, p1, 0x18

    and-int/lit16 p2, p2, 0xff

    int-to-byte p2, p2

    const/4 v1, 0x4

    .line 2180
    aput-byte p2, v3, v1

    shr-int/lit8 p2, p1, 0x10

    and-int/lit16 p2, p2, 0xff

    int-to-byte p2, p2

    const/4 v1, 0x5

    .line 2181
    aput-byte p2, v3, v1

    shr-int/lit8 p2, p1, 0x8

    and-int/lit16 p2, p2, 0xff

    int-to-byte p2, p2

    .line 2182
    aput-byte p2, v3, v0

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    const/4 p2, 0x7

    .line 2183
    aput-byte p1, v3, p2

    .line 2184
    invoke-interface {v8, v10, v9, v6}, Ll/᩵ۢۧ;->֫(Ll/ᩳ֨֫;II)V

    add-int/lit8 v2, v2, 0x9

    return v2

    .line 2191
    :cond_7
    iget-object p1, v3, Ll/ۜۘۧ;->ۜ:Ll/ᩳ֨֫;

    .line 2192
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ۗ()I

    move-result v0

    const/4 v3, -0x2

    .line 2193
    invoke-virtual {p1, v3}, Ll/ᩳ֨֫;->ܳ(I)V

    mul-int/lit8 v0, v0, 0x6

    add-int/2addr v0, v7

    if-eqz p2, :cond_8

    .line 2199
    invoke-virtual {v10, v0}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 2200
    invoke-virtual {v10}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    .line 2201
    invoke-virtual {p1, v1, v0, v3}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 2203
    aget-byte p1, v3, v7

    and-int/lit16 p1, p1, 0xff

    shl-int/2addr p1, v9

    aget-byte v1, v3, v5

    and-int/lit16 v1, v1, 0xff

    or-int/2addr p1, v1

    add-int/2addr p1, p2

    shr-int/lit8 p2, p1, 0x8

    and-int/lit16 p2, p2, 0xff

    int-to-byte p2, p2

    .line 2205
    aput-byte p2, v3, v7

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    .line 2206
    aput-byte p1, v3, v5

    goto :goto_5

    :cond_8
    move-object v10, p1

    .line 2210
    :goto_5
    invoke-interface {v8, v10, v0, v6}, Ll/᩵ۢۧ;->֫(Ll/ᩳ֨֫;II)V

    add-int/2addr v2, v6

    add-int/2addr v2, v0

    return v2
.end method

.method public final ֫(Ll/᩵ᩴ֫;)V
    .locals 3

    .line 2024
    iget-object v0, p0, Ll/ۗۖۧ;->ۡ:Ll/᩷ۘۧ;

    iget-object v0, v0, Ll/᩷ۘۧ;->ۜ:Ll/ܳۘۧ;

    iget-object v1, p0, Ll/ۗۖۧ;->ۢ:Ll/ۜۘۧ;

    iget-object v1, v1, Ll/ۜۘۧ;->ᩳ:Ll/᩶ۖۧ;

    .line 2026
    sget-object v2, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    iget v1, v1, Ll/᩶ۖۧ;->ܽ:I

    .line 2025
    invoke-virtual {v0, v1}, Ll/ܳۘۧ;->֫(I)Ll/᩻ۘۧ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2027
    iget-object v0, v0, Ll/᩻ۘۧ;->ܿ:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2028
    :goto_0
    invoke-virtual {p1, v0}, Ll/᩵ᩴ֫;->֫(Ljava/lang/String;)Ll/᩵ᩴ֫;

    move-result-object p1

    .line 2029
    iget-object v0, p0, Ll/ۗۖۧ;->֫:Ll/۠ᩴ֫;

    invoke-virtual {v0}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/֨ᩴ֫;->֫(Ll/᩵ᩴ֫;)V

    invoke-virtual {v0}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p1

    .line 2030
    iget-object v0, p0, Ll/ۗۖۧ;->ܺ:Ll/᩵ۢۧ;

    invoke-interface {v0, p1}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    return-void
.end method

.method public final ֫(Ll/᩷ۘۧ;Ll/᩶ۖۧ;)V
    .locals 0

    .line 2016
    iput-object p1, p0, Ll/ۗۖۧ;->ۡ:Ll/᩷ۘۧ;

    .line 2017
    iput-object p2, p0, Ll/ۗۖۧ;->᩻:Ll/᩶ۖۧ;

    .line 2018
    iget-object p1, p0, Ll/ۗۖۧ;->ܺ:Ll/᩵ۢۧ;

    iget-object p2, p0, Ll/ۗۖۧ;->֫:Ll/۠ᩴ֫;

    invoke-interface {p1, p2}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    .line 2019
    invoke-virtual {p0}, Ll/ۗۖۧ;->᩻()V

    return-void
.end method

.method public final ۧ()J
    .locals 3

    .line 2069
    iget-boolean v0, p0, Ll/ۗۖۧ;->ܿ:Z

    if-nez v0, :cond_0

    .line 2070
    iget-object v0, p0, Ll/ۗۖۧ;->ۡ:Ll/᩷ۘۧ;

    iget-object v0, v0, Ll/᩷ۘۧ;->ᩳ:[J

    iget v1, p0, Ll/ۗۖۧ;->ܽ:I

    aget-wide v1, v0, v1

    return-wide v1

    .line 2071
    :cond_0
    iget-object v0, p0, Ll/ۗۖۧ;->ۢ:Ll/ۜۘۧ;

    iget-object v0, v0, Ll/ۜۘۧ;->᩵:[J

    iget v1, p0, Ll/ۗۖۧ;->ᩳ:I

    aget-wide v1, v0, v1

    return-wide v1
.end method

.method public final ܳ()Z
    .locals 5

    .line 2107
    iget v0, p0, Ll/ۗۖۧ;->ܽ:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Ll/ۗۖۧ;->ܽ:I

    .line 2108
    iget-boolean v0, p0, Ll/ۗۖۧ;->ܿ:Z

    const/4 v2, 0x0

    if-nez v0, :cond_0

    return v2

    .line 2111
    :cond_0
    iget v0, p0, Ll/ۗۖۧ;->ۧ:I

    add-int/2addr v0, v1

    iput v0, p0, Ll/ۗۖۧ;->ۧ:I

    .line 2112
    iget-object v3, p0, Ll/ۗۖۧ;->ۢ:Ll/ۜۘۧ;

    iget-object v3, v3, Ll/ۜۘۧ;->֡:[I

    iget v4, p0, Ll/ۗۖۧ;->ᩳ:I

    aget v3, v3, v4

    if-ne v0, v3, :cond_1

    add-int/2addr v4, v1

    .line 2113
    iput v4, p0, Ll/ۗۖۧ;->ᩳ:I

    .line 2114
    iput v2, p0, Ll/ۗۖۧ;->ۧ:I

    return v2

    :cond_1
    return v1
.end method

.method public final ܽ()J
    .locals 3

    .line 2062
    iget-boolean v0, p0, Ll/ۗۖۧ;->ܿ:Z

    if-nez v0, :cond_0

    .line 2063
    iget-object v0, p0, Ll/ۗۖۧ;->ۡ:Ll/᩷ۘۧ;

    iget-object v0, v0, Ll/᩷ۘۧ;->᩻:[J

    iget v1, p0, Ll/ۗۖۧ;->ܽ:I

    aget-wide v1, v0, v1

    return-wide v1

    .line 2064
    :cond_0
    iget v0, p0, Ll/ۗۖۧ;->ܽ:I

    .line 189
    iget-object v1, p0, Ll/ۗۖۧ;->ۢ:Ll/ۜۘۧ;

    iget-object v1, v1, Ll/ۜۘۧ;->ܺ:[J

    aget-wide v0, v1, v0

    return-wide v0
.end method

.method public final ܿ()Ll/᩻ۘۧ;
    .locals 3

    .line 2237
    iget-boolean v0, p0, Ll/ۗۖۧ;->ܿ:Z

    if-nez v0, :cond_0

    goto :goto_1

    .line 2241
    :cond_0
    iget-object v0, p0, Ll/ۗۖۧ;->ۢ:Ll/ۜۘۧ;

    iget-object v1, v0, Ll/ۜۘۧ;->ᩳ:Ll/᩶ۖۧ;

    sget-object v2, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    iget v1, v1, Ll/᩶ۖۧ;->ܽ:I

    .line 2244
    iget-object v0, v0, Ll/ۜۘۧ;->ۘ:Ll/᩻ۘۧ;

    if-eqz v0, :cond_1

    goto :goto_0

    .line 2246
    :cond_1
    iget-object v0, p0, Ll/ۗۖۧ;->ۡ:Ll/᩷ۘۧ;

    iget-object v0, v0, Ll/᩷ۘۧ;->ۜ:Ll/ܳۘۧ;

    invoke-virtual {v0, v1}, Ll/ܳۘۧ;->֫(I)Ll/᩻ۘۧ;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    .line 2247
    iget-boolean v1, v0, Ll/᩻ۘۧ;->ܽ:Z

    if-eqz v1, :cond_2

    return-object v0

    :cond_2
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ᩳ()I
    .locals 2

    .line 2076
    iget-boolean v0, p0, Ll/ۗۖۧ;->ܿ:Z

    if-nez v0, :cond_0

    .line 2077
    iget-object v0, p0, Ll/ۗۖۧ;->ۡ:Ll/᩷ۘۧ;

    iget-object v0, v0, Ll/᩷ۘۧ;->ܳ:[I

    iget v1, p0, Ll/ۗۖۧ;->ܽ:I

    aget v0, v0, v1

    return v0

    .line 2078
    :cond_0
    iget-object v0, p0, Ll/ۗۖۧ;->ۢ:Ll/ۜۘۧ;

    iget-object v0, v0, Ll/ۜۘۧ;->ۖ:[I

    iget v1, p0, Ll/ۗۖۧ;->ܽ:I

    aget v0, v0, v1

    return v0
.end method

.method public final ᩻()V
    .locals 4

    .line 112
    iget-object v0, p0, Ll/ۗۖۧ;->ۢ:Ll/ۜۘۧ;

    const/4 v1, 0x0

    iput v1, v0, Ll/ۜۘۧ;->ᩴ:I

    const-wide/16 v2, 0x0

    .line 113
    iput-wide v2, v0, Ll/ۜۘۧ;->ܿ:J

    .line 114
    iput-boolean v1, v0, Ll/ۜۘۧ;->ܳ:Z

    .line 115
    iput-boolean v1, v0, Ll/ۜۘۧ;->ܽ:Z

    .line 116
    iput-boolean v1, v0, Ll/ۜۘۧ;->᩷:Z

    const/4 v2, 0x0

    .line 117
    iput-object v2, v0, Ll/ۜۘۧ;->ۘ:Ll/᩻ۘۧ;

    .line 2036
    iput v1, p0, Ll/ۗۖۧ;->ܽ:I

    .line 2037
    iput v1, p0, Ll/ۗۖۧ;->ᩳ:I

    .line 2038
    iput v1, p0, Ll/ۗۖۧ;->ۧ:I

    .line 2039
    iput v1, p0, Ll/ۗۖۧ;->᩷:I

    .line 2040
    iput-boolean v1, p0, Ll/ۗۖۧ;->ܿ:Z

    return-void
.end method
