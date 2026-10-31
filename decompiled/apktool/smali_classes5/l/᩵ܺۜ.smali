.class public final Ll/᩵ܺۜ;
.super Ll/۬ᩴܺ;
.source "P6V4"


# instance fields
.field public final ֫:Z

.field public final ۜ:Z

.field public final ۧ:I

.field public final ܳ:I

.field public final ܽ:I

.field public final ܿ:I

.field public final ᩳ:Ljava/lang/String;

.field public final ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZIIIIZLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p7, p0, Ll/᩵ܺۜ;->ᩳ:Ljava/lang/String;

    iput-object p8, p0, Ll/᩵ܺۜ;->᩻:Ljava/lang/String;

    iput-boolean p1, p0, Ll/᩵ܺۜ;->ۜ:Z

    iput-boolean p6, p0, Ll/᩵ܺۜ;->֫:Z

    iput p2, p0, Ll/᩵ܺۜ;->ܽ:I

    iput p3, p0, Ll/᩵ܺۜ;->ۧ:I

    iput p4, p0, Ll/᩵ܺۜ;->ܿ:I

    iput p5, p0, Ll/᩵ܺۜ;->ܳ:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩵ܺۜ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩵ܺۜ;->֫:Z

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/᩵ܺۜ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩵ܺۜ;->ᩳ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/᩵ܺۜ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩵ܺۜ;->᩻:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/᩵ܺۜ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩵ܺۜ;->ۜ:Z

    return p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 57
    instance-of v0, p1, Ll/᩵ܺۜ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/᩵ܺۜ;

    iget-boolean v0, p0, Ll/᩵ܺۜ;->ۜ:Z

    iget-boolean v1, p1, Ll/᩵ܺۜ;->ۜ:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/᩵ܺۜ;->֫:Z

    iget-boolean v1, p1, Ll/᩵ܺۜ;->֫:Z

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/᩵ܺۜ;->ܽ:I

    iget v1, p1, Ll/᩵ܺۜ;->ܽ:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/᩵ܺۜ;->ۧ:I

    iget v1, p1, Ll/᩵ܺۜ;->ۧ:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/᩵ܺۜ;->ܿ:I

    iget v1, p1, Ll/᩵ܺۜ;->ܿ:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/᩵ܺۜ;->ܳ:I

    iget v1, p1, Ll/᩵ܺۜ;->ܳ:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/᩵ܺۜ;->ᩳ:Ljava/lang/String;

    iget-object v1, p1, Ll/᩵ܺۜ;->ᩳ:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩵ܺۜ;->᩻:Ljava/lang/String;

    iget-object p1, p1, Ll/᩵ܺۜ;->᩻:Ljava/lang/String;

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 0
    iget-boolean v0, p0, Ll/᩵ܺۜ;->ۜ:Z

    const/16 v1, 0x4d5

    if-eqz v0, :cond_0

    const/16 v0, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v0, 0x4d5

    :goto_0
    const/16 v2, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v3, p0, Ll/᩵ܺۜ;->֫:Z

    if-eqz v3, :cond_1

    const/16 v1, 0x4cf

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 57
    iget v1, p0, Ll/᩵ܺۜ;->ܽ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/᩵ܺۜ;->ۧ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/᩵ܺۜ;->ܿ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/᩵ܺۜ;->ܳ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 0
    iget-object v1, p0, Ll/᩵ܺۜ;->ᩳ:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 57
    iget-object v1, p0, Ll/᩵ܺۜ;->᩻:Ljava/lang/String;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    .line 57
    iget-boolean v0, p0, Ll/᩵ܺۜ;->ۜ:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-boolean v1, p0, Ll/᩵ܺۜ;->֫:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget v2, p0, Ll/᩵ܺۜ;->ܽ:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p0, Ll/᩵ܺۜ;->ۧ:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget v4, p0, Ll/᩵ܺۜ;->ܿ:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget v5, p0, Ll/᩵ܺۜ;->ܳ:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v6, 0x8

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    iget-object v8, p0, Ll/᩵ܺۜ;->ᩳ:Ljava/lang/String;

    aput-object v8, v6, v7

    const/4 v8, 0x1

    iget-object v9, p0, Ll/᩵ܺۜ;->᩻:Ljava/lang/String;

    aput-object v9, v6, v8

    const/4 v9, 0x2

    aput-object v0, v6, v9

    const/4 v0, 0x3

    aput-object v1, v6, v0

    const/4 v0, 0x4

    aput-object v2, v6, v0

    const/4 v0, 0x5

    aput-object v3, v6, v0

    const/4 v0, 0x6

    aput-object v4, v6, v0

    const/4 v0, 0x7

    aput-object v5, v6, v0

    const-string v0, "encoding;pattern;regex;caseSensitive;contextBefore;contextAfter;limit;maxChars"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    new-array v0, v7, [Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "["

    .line 0
    const-class v3, Ll/᩵ܺۜ;

    invoke-static {v3, v1, v2}, Ll/ۘ᩺ۘ;->֫(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 57
    :goto_1
    array-length v2, v0

    if-ge v7, v2, :cond_2

    aget-object v2, v0, v7

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v2, v6, v7

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v2, v0

    sub-int/2addr v2, v8

    if-eq v7, v2, :cond_1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 57
    iget v0, p0, Ll/᩵ܺۜ;->ۧ:I

    return v0
.end method

.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 60
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "encoding"

    invoke-virtual {v0, v1, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "pattern"

    iget-object v1, p0, Ll/᩵ܺۜ;->᩻:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "regex"

    iget-boolean v1, p0, Ll/᩵ܺۜ;->ۜ:Z

    .line 61
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "case"

    iget-boolean v1, p0, Ll/᩵ܺۜ;->֫:Z

    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "before"

    iget v1, p0, Ll/᩵ܺۜ;->ܽ:I

    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "after"

    iget v1, p0, Ll/᩵ܺۜ;->ۧ:I

    .line 62
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "limit"

    iget v1, p0, Ll/᩵ܺۜ;->ܿ:I

    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "chars"

    iget v1, p0, Ll/᩵ܺۜ;->ܳ:I

    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object p1

    .line 63
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v0

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p1

    invoke-static {p1}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ܳ()I
    .locals 1

    .line 57
    iget v0, p0, Ll/᩵ܺۜ;->ܳ:I

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 57
    iget v0, p0, Ll/᩵ܺۜ;->ܽ:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 57
    iget v0, p0, Ll/᩵ܺۜ;->ܿ:I

    return v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Ll/᩵ܺۜ;->᩻:Ljava/lang/String;

    return-object v0
.end method
