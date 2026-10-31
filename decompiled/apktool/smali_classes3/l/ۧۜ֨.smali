.class public final Ll/ۧۜ֨;
.super Ljava/lang/Object;
.source "E1RG"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final ۛ:[I

.field public static final ۤ:[I


# instance fields
.field public ۗ:I

.field public ۙ:I

.field public ۫:I

.field public ۬:I

.field public ᩶:I

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/16 v0, 0xa

    new-array v0, v0, [I

    .line 121
    fill-array-data v0, :array_0

    sput-object v0, Ll/ۧۜ֨;->ۛ:[I

    const/16 v0, 0x18

    const/16 v1, 0x30

    const/4 v2, 0x4

    const/16 v3, 0x8

    .line 125
    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    sput-object v0, Ll/ۧۜ֨;->ۤ:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x40000
        0x100000
        0x200000
        0x400000
        0x400000
        0x800000
        0x800000
        0x1000000
        0x2000000
        0x4000000
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x6

    .line 143
    :try_start_0
    invoke-virtual {p0, v0}, Ll/ۧۜ֨;->ܽ(I)V
    :try_end_0
    .catch Ll/ۢۜ֨; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 146
    :catch_0
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 578
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 581
    :catch_0
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
.end method

.method public final ֫()I
    .locals 1

    .line 518
    iget v0, p0, Ll/ۧۜ֨;->᩸:I

    return v0
.end method

.method public final ֫(Ll/ۛ᩻֨;Ll/ۘ᩻֨;)Ll/ۛ᩻֨;
    .locals 1

    .line 531
    iget v0, p0, Ll/ۧۜ֨;->ۗ:I

    if-nez v0, :cond_0

    .line 532
    new-instance v0, Ll/᩷ۜ֨;

    invoke-direct {v0, p1, p2}, Ll/᩷ۜ֨;-><init>(Ll/ۛ᩻֨;Ll/ۘ᩻֨;)V

    return-object v0

    .line 534
    :cond_0
    new-instance v0, Ll/ܽۜ֨;

    invoke-direct {v0, p1, p0, p2}, Ll/ܽۜ֨;-><init>(Ll/ۛ᩻֨;Ll/ۧۜ֨;Ll/ۘ᩻֨;)V

    return-object v0
.end method

.method public final ֫(I)V
    .locals 3

    const/16 v0, 0x1000

    const-string v1, " B"

    if-lt p1, v0, :cond_1

    const/high16 v0, 0x30000000

    if-gt p1, v0, :cond_0

    .line 243
    iput p1, p0, Ll/ۧۜ֨;->᩹:I

    return-void

    .line 239
    :cond_0
    new-instance v0, Ll/ۢۜ֨;

    const-string v2, "LZMA2 dictionary size must not exceed 768 MiB: "

    .line 0
    invoke-static {p1, v2, v1}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 20
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 239
    throw v0

    .line 234
    :cond_1
    new-instance v0, Ll/ۢۜ֨;

    const-string v2, "LZMA2 dictionary size must be at least 4 KiB: "

    .line 0
    invoke-static {p1, v2, v1}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 20
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 234
    throw v0
.end method

.method public final ۜ()I
    .locals 1

    .line 460
    iget v0, p0, Ll/ۧۜ֨;->۬:I

    return v0
.end method

.method public final ܳ()I
    .locals 1

    .line 429
    iget v0, p0, Ll/ۧۜ֨;->ۗ:I

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 250
    iget v0, p0, Ll/ۧۜ֨;->᩹:I

    return v0
.end method

.method public final ܽ(I)V
    .locals 3

    if-ltz p1, :cond_4

    const/16 v0, 0x9

    if-gt p1, v0, :cond_4

    const/4 v0, 0x3

    .line 199
    iput v0, p0, Ll/ۧۜ֨;->᩶:I

    const/4 v1, 0x2

    .line 201
    iput v1, p0, Ll/ۧۜ֨;->۫:I

    .line 202
    sget-object v2, Ll/ۧۜ֨;->ۛ:[I

    aget v2, v2, p1

    iput v2, p0, Ll/ۧۜ֨;->᩹:I

    const/4 v2, 0x4

    if-gt p1, v0, :cond_1

    const/4 v0, 0x1

    .line 205
    iput v0, p0, Ll/ۧۜ֨;->ۗ:I

    .line 206
    iput v2, p0, Ll/ۧۜ֨;->ۙ:I

    if-gt p1, v0, :cond_0

    const/16 v0, 0x80

    goto :goto_0

    :cond_0
    const/16 v0, 0x111

    .line 207
    :goto_0
    iput v0, p0, Ll/ۧۜ֨;->۬:I

    .line 208
    sget-object v0, Ll/ۧۜ֨;->ۤ:[I

    aget p1, v0, p1

    iput p1, p0, Ll/ۧۜ֨;->᩸:I

    return-void

    .line 210
    :cond_1
    iput v1, p0, Ll/ۧۜ֨;->ۗ:I

    const/16 v0, 0x14

    .line 211
    iput v0, p0, Ll/ۧۜ֨;->ۙ:I

    if-ne p1, v2, :cond_2

    const/16 p1, 0x10

    goto :goto_1

    :cond_2
    const/4 v0, 0x5

    if-ne p1, v0, :cond_3

    const/16 p1, 0x20

    goto :goto_1

    :cond_3
    const/16 p1, 0x40

    .line 212
    :goto_1
    iput p1, p0, Ll/ۧۜ֨;->۬:I

    const/4 p1, 0x0

    .line 213
    iput p1, p0, Ll/ۧۜ֨;->᩸:I

    return-void

    .line 196
    :cond_4
    new-instance v0, Ll/ۢۜ֨;

    const-string v1, "Unsupported preset: "

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 20
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 196
    throw v0
.end method

.method public final ܿ()I
    .locals 1

    .line 486
    iget v0, p0, Ll/ۧۜ֨;->ۙ:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 350
    iget v0, p0, Ll/ۧۜ֨;->᩶:I

    return v0
.end method

.method public final ᩷()I
    .locals 1

    .line 396
    iget v0, p0, Ll/ۧۜ֨;->۫:I

    return v0
.end method
