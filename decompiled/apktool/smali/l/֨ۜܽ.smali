.class public Ll/֨ۜܽ;
.super Ll/᩷ܿܽ;
.source "E998"


# static fields
.field private static final ۬ۗۢ:[S


# instance fields
.field public ۖ:I

.field public ۘ:I

.field public ۜ:Z

.field public ۡ:I

.field public ۢ:[Ll/᩷ۜܽ;

.field public final ܳ:I

.field public ܺ:[I

.field public ܽ:I

.field public final ܿ:I

.field public final ᩳ:Ll/ۗۜܽ;

.field public ᩴ:[I

.field public ᩷:I

.field public ᩻:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xd

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    const/16 v0, 0x11

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/֨ۜܽ;->۬ۗۢ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x1cf6s
        -0x6854s
        -0x6869s
        -0x6869s
        -0x6828s
        -0x686bs
        -0x6867s
        -0x686as
        -0x687fs
        -0x6828s
        -0x6875s
        -0x6874s
        -0x6876s
        -0x686fs
        -0x686as
        -0x6861s
        -0x6875s
    .end array-data
.end method

.method public native constructor <init>(Ll/ۛۜܽ;Ll/ۢۗ᩻;)V
.end method

.method private ܽ(I)I
    .locals 6

    .line 197
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getPreviousStringEndOffset "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩹ܽܽ;->֫(Ljava/lang/String;)V

    .line 198
    iget v0, p0, Ll/֨ۜܽ;->ܽ:I

    if-nez p1, :cond_0

    .line 199
    iget p1, p0, Ll/֨ۜܽ;->ۡ:I

    add-int/2addr v0, p1

    return v0

    .line 201
    :cond_0
    iget v1, p0, Ll/֨ۜܽ;->ۡ:I

    add-int/2addr v0, v1

    add-int/lit8 p1, p1, -0x1

    .line 215
    iget-object v1, p0, Ll/֨ۜܽ;->ܺ:[I

    aget v1, v1, p1

    add-int/2addr v0, v1

    .line 202
    iget-object v1, p0, Ll/֨ۜܽ;->ᩳ:Ll/ۗۜܽ;

    iget-boolean v2, p0, Ll/֨ۜܽ;->ۜ:Z

    iget v3, p0, Ll/֨ۜܽ;->ܿ:I

    invoke-static {v1, v0, v2, v3}, Ll/᩷ܿܽ;->ۧ(Ll/ۗۜܽ;IZI)I

    move-result v0

    .line 203
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "new offset "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/᩹ܽܽ;->֫(Ljava/lang/String;)V

    const/4 v4, -0x1

    if-eq v0, v4, :cond_1

    return v0

    .line 207
    :cond_1
    invoke-direct {p0, p1}, Ll/֨ۜܽ;->ܽ(I)I

    move-result p1

    if-ne p1, v4, :cond_2

    return v4

    .line 210
    :cond_2
    invoke-static {v1, p1, v2, v3}, Ll/᩷ܿܽ;->ۧ(Ll/ۗۜܽ;IZI)I

    move-result p1

    return p1
.end method

.method private ܿ(I)[I
    .locals 4

    const/4 v0, 0x0

    if-ltz p1, :cond_2

    .line 224
    iget v1, p0, Ll/֨ۜܽ;->ۖ:I

    if-lt p1, v1, :cond_0

    goto :goto_1

    .line 226
    :cond_0
    iget v1, p0, Ll/֨ۜܽ;->ܽ:I

    iget v2, p0, Ll/֨ۜܽ;->ۘ:I

    add-int/2addr v1, v2

    iget-object v2, p0, Ll/֨ۜܽ;->ᩴ:[I

    aget p1, v2, p1

    add-int/2addr v1, p1

    .line 227
    iget-object p1, p0, Ll/֨ۜܽ;->ᩳ:Ll/ۗۜܽ;

    invoke-virtual {p1, v1}, Ll/ۗۜܽ;->᩻(I)Ll/ۛۜܽ;

    move-result-object p1

    .line 228
    new-instance v1, Ll/ܺۢᩴ;

    invoke-direct {v1}, Ll/ܺۢᩴ;-><init>()V

    .line 231
    :goto_0
    :try_start_0
    invoke-virtual {p1}, Ll/ۛۜܽ;->ᩳ()I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    .line 232
    invoke-virtual {v1, v2}, Ll/ܺۢᩴ;->add(I)Z
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 237
    :cond_1
    invoke-virtual {v1}, Ll/ۤܿᩴ;->ܶ()[I

    move-result-object p1

    return-object p1

    :catch_0
    :cond_2
    :goto_1
    return-object v0
.end method

.method private ᩳ(I)Ljava/lang/String;
    .locals 7

    if-ltz p1, :cond_5

    .line 170
    iget v0, p0, Ll/֨ۜܽ;->᩷:I

    if-lt p1, v0, :cond_0

    goto :goto_1

    .line 173
    :cond_0
    iget v0, p0, Ll/֨ۜܽ;->ۡ:I

    iget v1, p0, Ll/֨ۜܽ;->ܽ:I

    add-int/2addr v0, v1

    .line 215
    iget-object v2, p0, Ll/֨ۜܽ;->ܺ:[I

    aget v2, v2, p1

    add-int/2addr v0, v2

    .line 174
    iget v2, p0, Ll/֨ۜܽ;->ܳ:I

    if-lt v0, v2, :cond_4

    iget v2, p0, Ll/֨ۜܽ;->ܿ:I

    if-lt v0, v2, :cond_1

    goto :goto_0

    .line 177
    :cond_1
    iget-object v3, p0, Ll/֨ۜܽ;->ᩳ:Ll/ۗۜܽ;

    iget-boolean v4, p0, Ll/֨ۜܽ;->ۜ:Z

    invoke-virtual {p0, v3, v0, v4, v2}, Ll/᩷ܿܽ;->֫(Ll/ۗۜܽ;IZI)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    .line 181
    invoke-direct {p0, p1}, Ll/֨ۜܽ;->ܽ(I)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_2

    .line 183
    invoke-virtual {p0, v3, v5, v4, v2}, Ll/᩷ܿܽ;->֫(Ll/ۗۜܽ;IZI)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    sub-int/2addr v5, v1

    .line 186
    iget v1, p0, Ll/֨ۜܽ;->ۡ:I

    sub-int/2addr v5, v1

    .line 220
    iget-object v1, p0, Ll/֨ۜܽ;->ܺ:[I

    aput v5, v1, p1

    :cond_2
    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    return-object v0

    :cond_4
    :goto_0
    const-string p1, ""

    return-object p1

    .line 171
    :cond_5
    :goto_1
    iget v0, p0, Ll/֨ۜܽ;->᩷:I

    .line 47
    invoke-static {p1, v0}, Ll/᩹ܽܽ;->ۧ(II)Ljava/lang/IndexOutOfBoundsException;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final bridge synthetic getItem(I)Ll/ۗ᩻ܽ;
    .locals 0

    .line 18
    invoke-virtual {p0, p1}, Ll/֨ۜܽ;->getItem(I)Ll/᩷ۜܽ;

    move-result-object p1

    return-object p1
.end method

.method public final getItem(I)Ll/᩷ۜܽ;
    .locals 4

    .line 142
    iget-object v0, p0, Ll/֨ۜܽ;->ۢ:[Ll/᩷ۜܽ;

    if-eqz v0, :cond_1

    if-ltz p1, :cond_1

    iget v1, p0, Ll/֨ۜܽ;->᩷:I

    if-ge p1, v1, :cond_1

    .line 143
    aget-object v0, v0, p1

    if-eqz v0, :cond_0

    return-object v0

    .line 146
    :cond_0
    invoke-direct {p0, p1}, Ll/֨ۜܽ;->ᩳ(I)Ljava/lang/String;

    move-result-object v0

    .line 147
    invoke-direct {p0, p1}, Ll/֨ۜܽ;->ܿ(I)[I

    move-result-object v1

    .line 148
    iget-object v2, p0, Ll/֨ۜܽ;->ۢ:[Ll/᩷ۜܽ;

    new-instance v3, Ll/᩷ۜܽ;

    invoke-direct {v3, p0, v0, v1}, Ll/᩷ۜܽ;-><init>(Ll/᩷ܿܽ;Ljava/lang/String;[I)V

    aput-object v3, v2, p1

    return-object v3

    .line 150
    :cond_1
    invoke-direct {p0, p1}, Ll/֨ۜܽ;->ᩳ(I)Ljava/lang/String;

    move-result-object v0

    .line 151
    invoke-direct {p0, p1}, Ll/֨ۜܽ;->ܿ(I)[I

    move-result-object p1

    .line 152
    new-instance v1, Ll/᩷ۜܽ;

    invoke-direct {v1, p0, v0, p1}, Ll/᩷ۜܽ;-><init>(Ll/᩷ܿܽ;Ljava/lang/String;[I)V

    return-object v1
.end method

.method public final size()I
    .locals 1

    .line 133
    iget v0, p0, Ll/֨ۜܽ;->᩷:I

    return v0
.end method

.method public final ֫(I)Ll/ۗ᩻ܽ;
    .locals 1

    if-ltz p1, :cond_0

    .line 158
    iget v0, p0, Ll/֨ۜܽ;->᩷:I

    if-ge p1, v0, :cond_0

    .line 161
    invoke-virtual {p0, p1}, Ll/֨ۜܽ;->getItem(I)Ll/᩷ۜܽ;

    move-result-object p1

    return-object p1

    .line 159
    :cond_0
    iget v0, p0, Ll/֨ۜܽ;->᩷:I

    invoke-static {p1, v0}, Ll/᩹ܽܽ;->ۧ(II)Ljava/lang/IndexOutOfBoundsException;

    move-result-object p1

    throw p1
.end method

.method public native ֫(Ll/᩷ۗ᩻;)V
.end method

.method public final ֫()Z
    .locals 1

    .line 166
    iget-boolean v0, p0, Ll/֨ۜܽ;->ۜ:Z

    return v0
.end method

.method public final ᩳ()V
    .locals 1

    const/4 v0, 0x0

    .line 137
    iput-object v0, p0, Ll/֨ۜܽ;->ۢ:[Ll/᩷ۜܽ;

    return-void
.end method
