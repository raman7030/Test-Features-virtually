.class public final Ll/ܺۘۜ;
.super Ljava/lang/Object;
.source "U6V6"


# static fields
.field public static final ᩵:[B


# instance fields
.field public ֫:J

.field public final ۖ:Ljava/lang/String;

.field public ۘ:J

.field public ۜ:J

.field public ۡ:Z

.field public final ۢ:Ljava/lang/String;

.field public ۧ:J

.field public ܳ:J

.field public final ܺ:Ljava/lang/String;

.field public ܽ:J

.field public final ܿ:Ljava/lang/String;

.field public ᩳ:J

.field public final ᩴ:J

.field public ᩷:J

.field public final ᩻:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x20

    new-array v0, v0, [B

    .line 19
    sput-object v0, Ll/ܺۘۜ;->᩵:[B

    .line 20
    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v1, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;)V
    .locals 2

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 34
    iput-wide v0, p0, Ll/ܺۘۜ;->ᩳ:J

    .line 35
    iput-wide v0, p0, Ll/ܺۘۜ;->֫:J

    .line 40
    iput-object p1, p0, Ll/ܺۘۜ;->ۢ:Ljava/lang/String;

    .line 41
    iput-object p2, p0, Ll/ܺۘۜ;->ܺ:Ljava/lang/String;

    .line 42
    iput-object p3, p0, Ll/ܺۘۜ;->ܿ:Ljava/lang/String;

    .line 43
    iput-wide p4, p0, Ll/ܺۘۜ;->ᩴ:J

    .line 44
    iput-wide p6, p0, Ll/ܺۘۜ;->᩻:J

    .line 45
    iput-object p8, p0, Ll/ܺۘۜ;->ۖ:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܺۘۜ;
    .locals 11

    const-string v0, "path"

    .line 61
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const v2, 0x8000

    if-gt v1, v2, :cond_3

    const/16 v1, 0x2e

    .line 62
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-lez v2, :cond_2

    .line 63
    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    if-ne v2, v1, :cond_2

    const/4 v1, 0x0

    .line 64
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const/16 v3, 0xb

    invoke-static {v1, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v1

    .line 65
    invoke-static {v1}, Ll/ܺۘۜ;->֫([B)[B

    move-result-object v4

    const/4 v5, 0x1

    add-int/2addr v2, v5

    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p0

    invoke-static {v4, p0}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 68
    new-instance p0, Ljava/lang/String;

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {p0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-static {p0}, Lbin/mt/json/JSON;->parse(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "v"

    .line 69
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    if-ne v1, v5, :cond_0

    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 72
    new-instance v1, Ll/ܺۘۜ;

    const-string v2, "query"

    invoke-virtual {p0, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v2, "encoding"

    .line 73
    invoke-virtual {p0, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v2, "size"

    invoke-virtual {p0, v2}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v6

    const-string v2, "modified"

    invoke-virtual {p0, v2}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v8

    const-string v2, "sample"

    invoke-virtual {p0, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    move-object v2, v1

    move-object v3, p1

    invoke-direct/range {v2 .. v10}, Ll/ܺۘۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;)V

    const-string v2, "anchorLine"

    .line 74
    invoke-virtual {p0, v2}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, v1, Ll/ܺۘۜ;->ܽ:J

    const-string v2, "anchorByte"

    .line 75
    invoke-virtual {p0, v2}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, v1, Ll/ܺۘۜ;->ۧ:J

    const-string v2, "line"

    .line 76
    invoke-virtual {p0, v2}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, v1, Ll/ܺۘۜ;->ܳ:J

    const-string v2, "pending"

    .line 77
    invoke-virtual {p0, v2}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, v1, Ll/ܺۘۜ;->ۡ:Z

    const-string v2, "outputLine"

    .line 78
    invoke-virtual {p0, v2}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, v1, Ll/ܺۘۜ;->᩷:J

    const-string v2, "outputColumn"

    .line 79
    invoke-virtual {p0, v2}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, v1, Ll/ܺۘۜ;->ۜ:J

    const-string v2, "delivered"

    .line 80
    invoke-virtual {p0, v2}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, v1, Ll/ܺۘۜ;->ᩳ:J

    const-string v2, "afterThrough"

    .line 81
    invoke-virtual {p0, v2}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, v1, Ll/ܺۘۜ;->֫:J

    const-string v2, "searched"

    .line 82
    invoke-virtual {p0, v2}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, v1, Ll/ܺۘۜ;->ۘ:J

    return-object v1

    .line 70
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    .line 66
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    .line 63
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    .line 61
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 92
    :catch_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "FILE_INVALID_CURSOR"

    const-string v0, "The text search cursor is invalid or does not match this request. Restart with cursor=\"\"."

    const-string v1, "warning"

    const/4 v2, 0x0

    .line 90
    invoke-static {p1, v0, v1, v2, p0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 85
    throw p0
.end method

.method public static ֫([B)[B
    .locals 4

    const-string v0, "HmacSHA256"

    .line 97
    :try_start_0
    invoke-static {v0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v1

    .line 98
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    sget-object v3, Ll/ܺۘۜ;->᩵:[B

    invoke-direct {v2, v3, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    invoke-virtual {v1, v2}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 99
    invoke-virtual {v1, p0}, Ljavax/crypto/Mac;->doFinal([B)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 101
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "HmacSHA256 unavailable"

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 4

    .line 49
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "v"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "path"

    iget-object v2, p0, Ll/ܺۘۜ;->ۢ:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "query"

    iget-object v2, p0, Ll/ܺۘۜ;->ܺ:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "encoding"

    iget-object v2, p0, Ll/ܺۘۜ;->ܿ:Ljava/lang/String;

    .line 50
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "size"

    iget-wide v2, p0, Ll/ܺۘۜ;->ᩴ:J

    invoke-virtual {v0, v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "modified"

    iget-wide v2, p0, Ll/ܺۘۜ;->᩻:J

    invoke-virtual {v0, v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "sample"

    iget-object v2, p0, Ll/ܺۘۜ;->ۖ:Ljava/lang/String;

    .line 51
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "anchorLine"

    iget-wide v2, p0, Ll/ܺۘۜ;->ܽ:J

    invoke-virtual {v0, v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "anchorByte"

    iget-wide v2, p0, Ll/ܺۘۜ;->ۧ:J

    invoke-virtual {v0, v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "line"

    iget-wide v2, p0, Ll/ܺۘۜ;->ܳ:J

    .line 52
    invoke-virtual {v0, v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "pending"

    iget-boolean v2, p0, Ll/ܺۘۜ;->ۡ:Z

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "outputLine"

    iget-wide v2, p0, Ll/ܺۘۜ;->᩷:J

    invoke-virtual {v0, v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "outputColumn"

    iget-wide v2, p0, Ll/ܺۘۜ;->ۜ:J

    .line 53
    invoke-virtual {v0, v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "delivered"

    iget-wide v2, p0, Ll/ܺۘۜ;->ᩳ:J

    invoke-virtual {v0, v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "afterThrough"

    iget-wide v2, p0, Ll/ܺۘۜ;->֫:J

    .line 54
    invoke-virtual {v0, v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "searched"

    iget-wide v2, p0, Ll/ܺۘۜ;->ۘ:J

    invoke-virtual {v0, v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 55
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 56
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0xb

    invoke-static {v0, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "."

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Ll/ܺۘۜ;->֫([B)[B

    move-result-object v0

    invoke-static {v0, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
