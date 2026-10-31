.class public final Ll/֫ܽۘ;
.super Ll/ۙۧۘ;
.source "J9JT"


# static fields
.field public static final ᩳ:Ll/֫᩻֨;


# instance fields
.field public ۧ:Ll/ܺۧۘ;

.field public ܽ:Ll/᩹ۧۘ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 92
    const-class v0, Ll/֫ܽۘ;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/֫ܽۘ;->ᩳ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ll/᩹ۧۘ;Ll/ܺۧۘ;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    iput-object p1, p0, Ll/֫ܽۘ;->ܽ:Ll/᩹ۧۘ;

    .line 98
    iput-object p2, p0, Ll/֫ܽۘ;->ۧ:Ll/ܺۧۘ;

    return-void
.end method

.method private ֫(Ll/ᩴۨۖ;)V
    .locals 7

    .line 123
    iget-object v0, p0, Ll/֫ܽۘ;->ۧ:Ll/ܺۧۘ;

    invoke-virtual {v0, p1}, Ll/ܺۧۘ;->֫(Ll/ᩴۨۖ;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 124
    iget-object v0, p0, Ll/ۙۧۘ;->֫:Ll/ۙۧۘ;

    new-instance v1, Ll/֡ۛۖ;

    invoke-virtual {p1}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object p1

    invoke-direct {v1, p1}, Ll/֡ۛۖ;-><init>(Ll/ۚ֫ۘ;)V

    invoke-virtual {v0, v1}, Ll/ۙۧۘ;->ܽ(Ll/۠֫ۘ;)V

    return-void

    .line 128
    :cond_0
    invoke-virtual {p1}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v1

    check-cast v1, Ll/ۡۨۖ;

    invoke-virtual {v1}, Ll/ۡۨۖ;->᩻()J

    move-result-wide v1

    .line 129
    iget-object v3, p0, Ll/֫ܽۘ;->ܽ:Ll/᩹ۧۘ;

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v1}, Ll/᩹ۧۘ;->֫(Ljava/lang/Long;)Ll/ܶܽۘ;

    move-result-object v1

    if-nez v1, :cond_1

    .line 131
    iget-object v0, p0, Ll/ۙۧۘ;->֫:Ll/ۙۧۘ;

    new-instance v1, Ll/֡ۛۖ;

    invoke-virtual {p1}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object p1

    invoke-direct {v1, p1}, Ll/֡ۛۖ;-><init>(Ll/ۚ֫ۘ;)V

    invoke-virtual {v0, v1}, Ll/ۙۧۘ;->ܽ(Ll/۠֫ۘ;)V

    return-void

    .line 135
    :cond_1
    invoke-virtual {v1}, Ll/ܶܽۘ;->ܽ()Ll/᩸ܽۘ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩸ܽۘ;->֫()Ljavax/crypto/SecretKey;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ll/ܺۧۘ;->֫(Ll/ᩴۨۖ;Ljavax/crypto/SecretKey;)[B

    move-result-object v0

    .line 138
    invoke-static {v0}, Ll/ۡۨۖ;->֫([B)Z

    move-result v1

    sget-object v2, Ll/֫ܽۘ;->ᩳ:Ll/֫᩻֨;

    if-nez v1, :cond_5

    .line 141
    invoke-static {v0}, Ll/ۚۛۖ;->֫([B)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "Packet {} is compressed."

    .line 154
    invoke-interface {v2, p1, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    :try_start_0
    iget-object p1, p0, Ll/ۙۧۘ;->֫:Ll/ۙۧۘ;

    new-instance v1, Ll/ܺۨۖ;

    invoke-direct {v1, v0}, Ll/ܺۨۖ;-><init>([B)V

    invoke-virtual {p1, v1}, Ll/ۙۧۘ;->ܽ(Ll/۠֫ۘ;)V
    :try_end_0
    .catch Ll/۬ܰۖ; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 160
    new-instance v0, Ll/ۧۧۘ;

    const-string v1, "Could not load compression header"

    .line 42
    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 160
    throw v0

    .line 144
    :cond_2
    invoke-static {v0}, Ll/᩻ۨۖ;->֫([B)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 166
    :try_start_1
    new-instance v1, Ll/᩸ۛۖ;

    .line 27
    invoke-direct {v1, v0}, Ll/ᩳۨۖ;-><init>([B)V

    const-string v0, "Decrypted packet {} is packet {}."

    .line 167
    invoke-interface {v2, v0, p1, v1}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 168
    invoke-virtual {v1}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v0

    check-cast v0, Ll/᩻ۨۖ;

    invoke-virtual {v0}, Ll/᩻ۨۖ;->ۢ()J

    move-result-wide v3

    invoke-virtual {p1}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v0

    check-cast v0, Ll/ۡۨۖ;

    invoke-virtual {v0}, Ll/ۡۨۖ;->᩻()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-eqz v0, :cond_3

    const-string v0, "Mismatched sessionId between encrypted packet {} and decrypted contents {}"

    .line 169
    invoke-interface {v2, v0, p1, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 170
    iget-object p1, p0, Ll/ۙۧۘ;->֫:Ll/ۙۧۘ;

    new-instance v0, Ll/֡ۛۖ;

    invoke-virtual {v1}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/֡ۛۖ;-><init>(Ll/ۚ֫ۘ;)V

    invoke-virtual {p1, v0}, Ll/ۙۧۘ;->ܽ(Ll/۠֫ۘ;)V

    return-void

    .line 172
    :cond_3
    iget-object p1, p0, Ll/ۙۧۘ;->֫:Ll/ۙۧۘ;

    invoke-virtual {p1, v1}, Ll/ۙۧۘ;->ܽ(Ll/۠֫ۘ;)V
    :try_end_1
    .catch Ll/۬ܰۖ; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception p1

    .line 176
    new-instance v0, Ll/ۧۧۘ;

    const-string v1, "Could not load SMB2 Packet"

    .line 42
    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 176
    throw v0

    :cond_4
    const-string v0, "Could not determine the encrypted packet contents of packet {}"

    .line 148
    invoke-interface {v2, p1, v0}, Ll/֫᩻֨;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    new-instance p1, Ll/ۖ۟ۖ;

    const-string v0, "Could not determine the encrypted packet data, disconnecting"

    .line 39
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 149
    throw p1

    :cond_5
    const-string v0, "Encountered a nested encrypted packet in packet {}, disconnecting the transport"

    .line 139
    invoke-interface {v2, p1, v0}, Ll/֫᩻֨;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    new-instance v0, Ll/ۖ۟ۖ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot nest an encrypted packet in encrypted packet "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 39
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 140
    throw v0
.end method


# virtual methods
.method public final ֫(Ll/۠֫ۘ;)Z
    .locals 0

    .line 103
    instance-of p1, p1, Ll/ᩴۨۖ;

    return p1
.end method

.method public final ۧ(Ll/۠֫ۘ;)V
    .locals 3

    .line 108
    iget-object v0, p0, Ll/֫ܽۘ;->ۧ:Ll/ܺۧۘ;

    check-cast p1, Ll/ᩴۨۖ;

    .line 109
    sget-object v1, Ll/֫ܽۘ;->ᩳ:Ll/֫᩻֨;

    const-string v2, "Decrypting packet {}"

    invoke-interface {v1, p1, v2}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    :try_start_0
    invoke-direct {p0, p1}, Ll/֫ܽۘ;->֫(Ll/ᩴۨۖ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    throw p1
.end method
