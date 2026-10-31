.class public final Ll/ۚ֨ۜ;
.super Ljava/lang/Object;
.source "I73O"


# static fields
.field public static final ۖ:[B

.field public static final ۜ:[B

.field public static final ۡ:[B

.field public static final ۢ:[B

.field public static final ܳ:[B

.field public static final ܺ:[B

.field public static final ᩷:[B

.field public static final ᩻:[B


# instance fields
.field public ֫:Z

.field public ۧ:Z

.field public ܽ:Z

.field public final ܿ:[B

.field public ᩳ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "#EXT-X-TARGETDURATION"

    .line 193
    invoke-static {v0}, Ll/ۚ֨ۜ;->֫(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Ll/ۚ֨ۜ;->ۖ:[B

    const-string v0, "#EXT-X-MEDIA-SEQUENCE"

    .line 194
    invoke-static {v0}, Ll/ۚ֨ۜ;->֫(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Ll/ۚ֨ۜ;->ܺ:[B

    const-string v0, "#EXTINF"

    .line 195
    invoke-static {v0}, Ll/ۚ֨ۜ;->֫(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Ll/ۚ֨ۜ;->ۡ:[B

    const-string v0, "#EXT-X-KEY"

    .line 196
    invoke-static {v0}, Ll/ۚ֨ۜ;->֫(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Ll/ۚ֨ۜ;->ۢ:[B

    const-string v0, "#EXT-X-BYTERANGE"

    .line 197
    invoke-static {v0}, Ll/ۚ֨ۜ;->֫(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Ll/ۚ֨ۜ;->ܳ:[B

    const-string v0, "#EXT-X-DISCONTINUITY"

    .line 198
    invoke-static {v0}, Ll/ۚ֨ۜ;->֫(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Ll/ۚ֨ۜ;->᩻:[B

    const-string v0, "#EXT-X-DISCONTINUITY-SEQUENCE"

    .line 200
    invoke-static {v0}, Ll/ۚ֨ۜ;->֫(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Ll/ۚ֨ۜ;->ۜ:[B

    const-string v0, "#EXT-X-ENDLIST"

    .line 201
    invoke-static {v0}, Ll/ۚ֨ۜ;->֫(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Ll/ۚ֨ۜ;->᩷:[B

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 191
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x60

    new-array v0, v0, [B

    .line 203
    iput-object v0, p0, Ll/ۚ֨ۜ;->ܿ:[B

    return-void
.end method

.method private ֫(ZII[B)Z
    .locals 2

    sub-int/2addr p3, p2

    .line 265
    array-length v0, p4

    const/4 v1, 0x0

    if-lt p3, v0, :cond_3

    if-nez p1, :cond_0

    array-length p1, p4

    if-eq p3, p1, :cond_0

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    .line 269
    :goto_0
    array-length p3, p4

    if-ge p1, p3, :cond_2

    .line 270
    iget-object p3, p0, Ll/ۚ֨ۜ;->ܿ:[B

    add-int v0, p2, p1

    aget-byte p3, p3, v0

    aget-byte v0, p4, p1

    if-eq p3, v0, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_1
    return v1
.end method

.method public static ֫(Ljava/lang/String;)[B
    .locals 3

    .line 279
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    new-array v0, v0, [B

    const/4 v1, 0x0

    .line 280
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 281
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private ۧ()V
    .locals 8

    .line 240
    iget v0, p0, Ll/ۚ֨ۜ;->ᩳ:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0xc

    const/16 v4, 0x9

    const/16 v5, 0x20

    .line 241
    iget-object v6, p0, Ll/ۚ֨ۜ;->ܿ:[B

    if-ge v2, v0, :cond_1

    aget-byte v7, v6, v2

    if-eq v7, v5, :cond_0

    if-eq v7, v4, :cond_0

    if-ne v7, v3, :cond_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-le v0, v2, :cond_3

    add-int/lit8 v7, v0, -0x1

    .line 244
    aget-byte v7, v6, v7

    if-eq v7, v5, :cond_2

    if-eq v7, v4, :cond_2

    if-ne v7, v3, :cond_3

    :cond_2
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    .line 247
    :cond_3
    sget-object v3, Ll/ۚ֨ۜ;->᩷:[B

    invoke-direct {p0, v1, v2, v0, v3}, Ll/ۚ֨ۜ;->֫(ZII[B)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_4

    .line 248
    iput-boolean v4, p0, Ll/ۚ֨ۜ;->ۧ:Z

    .line 249
    iput-boolean v4, p0, Ll/ۚ֨ۜ;->ܽ:Z

    goto :goto_2

    .line 250
    :cond_4
    sget-object v3, Ll/ۚ֨ۜ;->ۖ:[B

    invoke-direct {p0, v4, v2, v0, v3}, Ll/ۚ֨ۜ;->֫(ZII[B)Z

    move-result v3

    if-nez v3, :cond_5

    sget-object v3, Ll/ۚ֨ۜ;->ܺ:[B

    .line 251
    invoke-direct {p0, v4, v2, v0, v3}, Ll/ۚ֨ۜ;->֫(ZII[B)Z

    move-result v3

    if-nez v3, :cond_5

    sget-object v3, Ll/ۚ֨ۜ;->ۡ:[B

    .line 252
    invoke-direct {p0, v4, v2, v0, v3}, Ll/ۚ֨ۜ;->֫(ZII[B)Z

    move-result v3

    if-nez v3, :cond_5

    sget-object v3, Ll/ۚ֨ۜ;->ۢ:[B

    .line 253
    invoke-direct {p0, v4, v2, v0, v3}, Ll/ۚ֨ۜ;->֫(ZII[B)Z

    move-result v3

    if-nez v3, :cond_5

    sget-object v3, Ll/ۚ֨ۜ;->ܳ:[B

    .line 254
    invoke-direct {p0, v4, v2, v0, v3}, Ll/ۚ֨ۜ;->֫(ZII[B)Z

    move-result v3

    if-nez v3, :cond_5

    sget-object v3, Ll/ۚ֨ۜ;->᩻:[B

    .line 255
    invoke-direct {p0, v1, v2, v0, v3}, Ll/ۚ֨ۜ;->֫(ZII[B)Z

    move-result v3

    if-nez v3, :cond_5

    sget-object v3, Ll/ۚ֨ۜ;->ۜ:[B

    .line 256
    invoke-direct {p0, v1, v2, v0, v3}, Ll/ۚ֨ۜ;->֫(ZII[B)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 258
    :cond_5
    iput-boolean v4, p0, Ll/ۚ֨ۜ;->ܽ:Z

    .line 260
    :cond_6
    :goto_2
    iput v1, p0, Ll/ۚ֨ۜ;->ᩳ:I

    return-void
.end method


# virtual methods
.method public final ֫()Ll/֨֨ۜ;
    .locals 1

    .line 228
    iget-boolean v0, p0, Ll/ۚ֨ۜ;->֫:Z

    if-nez v0, :cond_0

    .line 229
    invoke-direct {p0}, Ll/ۚ֨ۜ;->ۧ()V

    const/4 v0, 0x1

    .line 230
    iput-boolean v0, p0, Ll/ۚ֨ۜ;->֫:Z

    .line 232
    :cond_0
    iget-boolean v0, p0, Ll/ۚ֨ۜ;->ܽ:Z

    if-nez v0, :cond_1

    .line 233
    sget-object v0, Ll/֨֨ۜ;->᩶:Ll/֨֨ۜ;

    return-object v0

    .line 235
    :cond_1
    iget-boolean v0, p0, Ll/ۚ֨ۜ;->ۧ:Z

    if-eqz v0, :cond_2

    sget-object v0, Ll/֨֨ۜ;->ۙ:Ll/֨֨ۜ;

    return-object v0

    :cond_2
    sget-object v0, Ll/֨֨ۜ;->᩹:Ll/֨֨ۜ;

    return-object v0
.end method

.method public final ֫(II[B)V
    .locals 4

    .line 211
    iget-boolean v0, p0, Ll/ۚ֨ۜ;->֫:Z

    if-nez v0, :cond_3

    add-int/2addr p2, p1

    :goto_0
    if-ge p1, p2, :cond_2

    .line 216
    aget-byte v0, p3, p1

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    .line 218
    invoke-direct {p0}, Ll/ۚ֨ۜ;->ۧ()V

    goto :goto_1

    :cond_0
    const/16 v1, 0xd

    if-eq v0, v1, :cond_1

    .line 219
    iget v1, p0, Ll/ۚ֨ۜ;->ᩳ:I

    iget-object v2, p0, Ll/ۚ֨ۜ;->ܿ:[B

    array-length v3, v2

    if-ge v1, v3, :cond_1

    add-int/lit8 v3, v1, 0x1

    .line 220
    iput v3, p0, Ll/ۚ֨ۜ;->ᩳ:I

    aput-byte v0, v2, v1

    :cond_1
    :goto_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    return-void

    .line 212
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "HLS playlist classifier is already finished"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
