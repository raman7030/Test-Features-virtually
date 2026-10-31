.class public final Ll/ᩴܺۢ;
.super Ljava/lang/Object;
.source "J754"


# instance fields
.field public final ֫:J

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:I

.field public final ܿ:I

.field public final ᩳ:[B


# direct methods
.method public constructor <init>(Lbin/mt/json/JSONObject;)V
    .locals 6

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "arch"

    const-string v1, ""

    .line 18
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ᩴܺۢ;->ۧ:Ljava/lang/String;

    const-string v0, "bits"

    const/4 v2, 0x0

    .line 19
    invoke-virtual {p1, v0, v2}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ll/ᩴܺۢ;->ܽ:I

    const-string v0, "address"

    const-wide/16 v3, 0x0

    .line 20
    invoke-static {p1, v0, v3, v4}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v3

    iput-wide v3, p0, Ll/ᩴܺۢ;->֫:J

    const-string v0, "hex"

    .line 21
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "size"

    .line 22
    invoke-virtual {p1, v1, v2}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Ll/ᩴܺۢ;->ܿ:I

    .line 41
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p1

    and-int/lit8 v1, p1, 0x1

    if-nez v1, :cond_2

    .line 45
    div-int/lit8 p1, p1, 0x2

    new-array v1, p1, [B

    :goto_0
    if-ge v2, p1, :cond_1

    mul-int/lit8 v3, v2, 0x2

    .line 47
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x10

    invoke-static {v4, v5}, Ljava/lang/Character;->digit(CI)I

    move-result v4

    add-int/lit8 v3, v3, 0x1

    .line 48
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3, v5}, Ljava/lang/Character;->digit(CI)I

    move-result v3

    if-ltz v4, :cond_0

    if-ltz v3, :cond_0

    shl-int/lit8 v4, v4, 0x4

    or-int/2addr v3, v4

    int-to-byte v3, v3

    .line 52
    aput-byte v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 50
    :cond_0
    new-instance p1, Ll/᩺ܺۢ;

    const-string v0, "Invalid hex digit from radare2"

    .line 12
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 50
    throw p1

    .line 23
    :cond_1
    iput-object v1, p0, Ll/ᩴܺۢ;->ᩳ:[B

    return-void

    .line 43
    :cond_2
    new-instance p1, Ll/᩺ܺۢ;

    const-string v0, "Invalid hex length from radare2"

    .line 12
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 43
    throw p1
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Ll/ᩴܺۢ;
    .locals 1

    .line 30
    new-instance v0, Ll/ᩴܺۢ;

    invoke-direct {v0, p0}, Ll/ᩴܺۢ;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0
.end method


# virtual methods
.method public final ֫()[B
    .locals 1

    .line 37
    iget-object v0, p0, Ll/ᩴܺۢ;->ᩳ:[B

    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method
