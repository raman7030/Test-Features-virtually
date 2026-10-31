.class public final Ll/ܺۡۘ;
.super Ll/ۢۡۘ;
.source "B7ZY"


# instance fields
.field public ܿ:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ll/ۢۡۘ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 129
    iget-object v0, p0, Ll/ܺۡۘ;->ܿ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ll/۟ۢۘ;)Z
    .locals 7

    .line 37
    invoke-super {p0, p1}, Ll/ۢۡۘ;->֫(Ll/۟ۢۘ;)Z

    .line 42
    iget-object v0, p0, Ll/ۢۡۘ;->ۧ:Ll/۠ۢۘ;

    invoke-virtual {v0}, Ll/۠ۢۘ;->֫()V

    .line 43
    iget-object v0, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 44
    iget-object v0, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    .line 397
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v3, "ssh-userauth"

    .line 393
    invoke-virtual {v3, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    .line 44
    invoke-virtual {v0, v3}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 45
    iget-object v0, p0, Ll/ۢۡۘ;->ۧ:Ll/۠ۢۘ;

    invoke-virtual {p1, v0}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V

    .line 3560
    iget-object v0, p1, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {v0}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v3

    .line 47
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    iget-object v3, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {p1, v3}, Ll/۟ۢۘ;->֫(Ll/ܺ᩻ۘ;)V

    iput-object v3, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    .line 242
    iget-object v3, v3, Ll/ܺ᩻ۘ;->֫:[B

    aget-byte v3, v3, v1

    const/4 v4, 0x6

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-ne v3, v4, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 3560
    :goto_0
    invoke-virtual {v0}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object v0

    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v0, "enable_auth_none"

    .line 65
    invoke-virtual {p1, v0}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "yes"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :goto_1
    return v6

    .line 69
    :cond_2
    iget-object v0, p0, Ll/ۢۡۘ;->ᩳ:Ljava/lang/String;

    .line 397
    invoke-static {v0, v2}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 76
    iget-object v3, p0, Ll/ۢۡۘ;->ۧ:Ll/۠ۢۘ;

    invoke-virtual {v3}, Ll/۠ۢۘ;->֫()V

    .line 77
    iget-object v3, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    const/16 v4, 0x32

    invoke-virtual {v3, v4}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 78
    iget-object v3, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v3, v0}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 79
    iget-object v0, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    const-string v3, "ssh-connection"

    .line 393
    invoke-virtual {v3, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    .line 79
    invoke-virtual {v0, v3}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 80
    iget-object v0, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    const-string v3, "none"

    .line 393
    invoke-virtual {v3, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    .line 80
    invoke-virtual {v0, v2}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 81
    iget-object v0, p0, Ll/ۢۡۘ;->ۧ:Ll/۠ۢۘ;

    invoke-virtual {p1, v0}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V

    .line 84
    :goto_2
    iget-object v0, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {p1, v0}, Ll/۟ۢۘ;->֫(Ll/ܺ᩻ۘ;)V

    iput-object v0, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    .line 242
    iget-object v2, v0, Ll/ܺ᩻ۘ;->֫:[B

    aget-byte v2, v2, v1

    and-int/lit16 v2, v2, 0xff

    const/16 v3, 0x34

    if-ne v2, v3, :cond_3

    return v5

    :cond_3
    const/16 v3, 0x35

    if-ne v2, v3, :cond_4

    .line 91
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 92
    iget-object v0, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->֫()I

    .line 93
    iget-object v0, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->֫()I

    .line 94
    iget-object v0, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v0

    .line 95
    iget-object v2, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->᩷()[B

    .line 409
    array-length v2, v0

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 405
    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v0, v6, v2, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    goto :goto_2

    :cond_4
    const/16 p1, 0x33

    if-ne v2, p1, :cond_5

    .line 106
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 107
    iget-object p1, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->֫()I

    .line 108
    iget-object p1, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->֫()I

    .line 109
    iget-object p1, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object p1

    .line 110
    iget-object v0, p0, Ll/ۢۡۘ;->֫:Ll/ܺ᩻ۘ;

    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->֫()I

    .line 409
    array-length v0, p1

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 405
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, p1, v6, v0, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 133
    iput-object v2, p0, Ll/ܺۡۘ;->ܿ:Ljava/lang/String;

    return v6

    .line 121
    :cond_5
    new-instance p1, Ll/۫᩷ۘ;

    const-string v0, "USERAUTH fail ("

    const-string v1, ")"

    .line 0
    invoke-static {v2, v0, v1}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 39
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 121
    throw p1
.end method
