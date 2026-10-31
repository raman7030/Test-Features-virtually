.class public final Ll/ۚۧۘ;
.super Ljava/lang/Object;
.source "V9EH"


# static fields
.field public static final ܿ:Ll/֫᩻֨;


# instance fields
.field public final ֫:Ll/ۙ֫ۘ;

.field public ۧ:Ll/᩻ۧۘ;

.field public final ܽ:Ll/ۜۧۘ;

.field public ᩳ:Ll/֡ۧۘ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 60
    const-class v0, Ll/ۚۧۘ;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ۚۧۘ;->ܿ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ll/᩻ۧۘ;Ll/ۙ֫ۘ;Ll/ۜۧۘ;)V
    .locals 1

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    new-instance v0, Ll/֡ۧۘ;

    invoke-direct {v0}, Ll/֡ۧۘ;-><init>()V

    iput-object v0, p0, Ll/ۚۧۘ;->ᩳ:Ll/֡ۧۘ;

    .line 70
    iput-object p1, p0, Ll/ۚۧۘ;->ۧ:Ll/᩻ۧۘ;

    .line 71
    iput-object p2, p0, Ll/ۚۧۘ;->֫:Ll/ۙ֫ۘ;

    .line 72
    iput-object p3, p0, Ll/ۚۧۘ;->ܽ:Ll/ۜۧۘ;

    return-void
.end method

.method private ۧ()Ll/᩺ۨۖ;
    .locals 8

    const/16 v0, 0x20

    new-array v6, v0, [B

    .line 198
    iget-object v0, p0, Ll/ۚۧۘ;->֫:Ll/ۙ֫ۘ;

    invoke-virtual {v0}, Ll/ۙ֫ۘ;->ᩳ()Ljava/util/Random;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/util/Random;->nextBytes([B)V

    .line 199
    new-instance v7, Ll/ۨۨۖ;

    invoke-virtual {v0}, Ll/ۙ֫ۘ;->ۡ()Ljava/util/EnumSet;

    move-result-object v2

    iget-object v1, p0, Ll/ۚۧۘ;->ܽ:Ll/ۜۧۘ;

    invoke-virtual {v1}, Ll/ۜۧۘ;->ᩳ()Ljava/util/UUID;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0}, Ll/ۙ֫ۘ;->֫()Ljava/util/EnumSet;

    move-result-object v5

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Ll/ۨۨۖ;-><init>(Ljava/util/EnumSet;Ljava/util/UUID;ZLjava/util/EnumSet;[B)V

    .line 200
    iget-object v0, p0, Ll/ۚۧۘ;->ᩳ:Ll/֡ۧۘ;

    invoke-static {v0, v7}, Ll/֡ۧۘ;->֫(Ll/֡ۧۘ;Ll/֨֫ۘ;)V

    .line 201
    iget-object v0, p0, Ll/ۚۧۘ;->ۧ:Ll/᩻ۧۘ;

    invoke-virtual {v0, v7}, Ll/᩻ۧۘ;->֫(Ll/ܽۨۖ;)Ll/ܽۨۖ;

    move-result-object v0

    check-cast v0, Ll/᩺ۨۖ;

    return-object v0
.end method


# virtual methods
.method public final ֫()V
    .locals 14

    .line 76
    iget-object v0, p0, Ll/ۚۧۘ;->֫:Ll/ۙ֫ۘ;

    invoke-virtual {v0}, Ll/ۙ֫ۘ;->ۡ()Ljava/util/EnumSet;

    move-result-object v1

    sget-object v2, Ll/ۚۧۘ;->ܿ:Ll/֫᩻֨;

    const-string v3, "Negotiating dialects {}"

    invoke-interface {v2, v1, v3}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-virtual {v0}, Ll/ۙ֫ۘ;->֨()Z

    move-result v1

    const/4 v3, 0x0

    const/4 v4, 0x1

    iget-object v5, p0, Ll/ۚۧۘ;->ۧ:Ll/᩻ۧۘ;

    iget-object v6, p0, Ll/ۚۧۘ;->ᩳ:Ll/֡ۧۘ;

    if-eqz v1, :cond_2

    .line 205
    new-instance v1, Ll/᩵ۛۖ;

    invoke-virtual {v0}, Ll/ۙ֫ۘ;->ۡ()Ljava/util/EnumSet;

    move-result-object v7

    invoke-direct {v1, v7}, Ll/᩵ۛۖ;-><init>(Ljava/util/EnumSet;)V

    .line 206
    iget-object v7, v5, Ll/᩻ۧۘ;->ܰ:Ll/᩸ۧۘ;

    .line 46
    invoke-virtual {v7, v4}, Ll/᩸ۧۘ;->ۧ(I)[J

    move-result-object v7

    aget-wide v9, v7, v3

    const-wide/16 v7, 0x0

    cmp-long v11, v9, v7

    if-nez v11, :cond_1

    .line 210
    new-instance v13, Ll/ᩴۧۘ;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v11

    const/4 v12, 0x0

    move-object v7, v13

    move-object v8, v1

    .line 47
    invoke-direct/range {v7 .. v12}, Ll/ᩴۧۘ;-><init>(Ll/֨֫ۘ;JLjava/util/UUID;Z)V

    .line 211
    iget-object v7, v5, Ll/᩻ۧۘ;->ۤ:Ll/ۢۧۘ;

    invoke-virtual {v7, v13}, Ll/ۢۧۘ;->֫(Ll/ᩴۧۘ;)V

    .line 212
    invoke-static {v6, v1}, Ll/֡ۧۘ;->֫(Ll/֡ۧۘ;Ll/֨֫ۘ;)V

    .line 213
    iget-object v7, v5, Ll/᩻ۧۘ;->ܽ֫:Ll/֨ᩳۘ;

    invoke-virtual {v7, v1}, Ll/֨ᩳۘ;->֫(Ll/֨֫ۘ;)V

    const/4 v1, 0x0

    .line 214
    invoke-virtual {v13, v1}, Ll/ᩴۧۘ;->֫(Ll/֫۟ۖ;)Ll/ۧ۟ۖ;

    move-result-object v1

    .line 215
    invoke-virtual {v0}, Ll/ۙ֫ۘ;->ۖ()J

    move-result-wide v7

    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    sget-object v9, Ll/ۖ۟ۖ;->᩸:Ll/ܽ۟ۖ;

    invoke-static {v7, v8, v1}, Ll/ᩳ۟ۖ;->֫(JLjava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽۨۖ;

    .line 216
    instance-of v7, v1, Ll/᩺ۨۖ;

    if-eqz v7, :cond_0

    .line 219
    check-cast v1, Ll/᩺ۨۖ;

    .line 221
    invoke-virtual {v1}, Ll/᩺ۨۖ;->᩷()Ll/᩹ۛۖ;

    move-result-object v7

    sget-object v8, Ll/᩹ۛۖ;->᩶:Ll/᩹ۛۖ;

    if-ne v7, v8, :cond_3

    .line 222
    invoke-direct {p0}, Ll/ۚۧۘ;->ۧ()Ll/᩺ۨۖ;

    move-result-object v1

    goto :goto_0

    .line 217
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Expected a SMB2 NEGOTIATE Response to our SMB_COM_NEGOTIATE, but got: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 208
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The SMBv1 SMB_COM_NEGOTIATE packet needs to be the first packet sent."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 81
    :cond_2
    invoke-direct {p0}, Ll/ۚۧۘ;->ۧ()Ll/᩺ۨۖ;

    move-result-object v1

    .line 83
    :cond_3
    :goto_0
    invoke-static {v6, v1}, Ll/֡ۧۘ;->֫(Ll/֡ۧۘ;Ll/᩺ۨۖ;)V

    .line 85
    invoke-virtual {v1}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v7

    check-cast v7, Ll/᩻ۨۖ;

    invoke-virtual {v7}, Ll/᩻ۨۖ;->ۡ()J

    move-result-wide v7

    invoke-static {v7, v8}, Ll/۟۫ۖ;->ܽ(J)Z

    move-result v7

    if-eqz v7, :cond_13

    .line 97
    invoke-static {v6}, Ll/֡ۧۘ;->ۧ(Ll/֡ۧۘ;)Ll/᩺ۨۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩺ۨۖ;->᩷()Ll/᩹ۛۖ;

    move-result-object v1

    .line 98
    sget-object v7, Ll/᩹ۛۖ;->ۤ:Ll/᩹ۛۖ;

    if-ne v1, v7, :cond_f

    .line 99
    invoke-static {v6}, Ll/֡ۧۘ;->ۧ(Ll/֡ۧۘ;)Ll/᩺ۨۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩺ۨۖ;->ۖ()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_e

    .line 104
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_10

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/֨᩺ۖ;

    .line 105
    sget-object v11, Ll/᩵ۧۘ;->֫:[I

    invoke-virtual {v10}, Ll/֨᩺ۖ;->֫()Ll/۠᩺ۖ;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    aget v11, v11, v12

    if-eq v11, v4, :cond_b

    const/4 v12, 0x2

    if-eq v11, v12, :cond_8

    const/4 v12, 0x3

    if-ne v11, v12, :cond_7

    if-nez v9, :cond_6

    .line 125
    check-cast v10, Ll/᩵᩺ۖ;

    .line 143
    invoke-virtual {v10}, Ll/᩵᩺ۖ;->ۧ()Ljava/util/ArrayList;

    move-result-object v9

    .line 144
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-eqz v10, :cond_5

    .line 146
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-ne v10, v4, :cond_4

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    sget-object v11, Ll/ۘۨۖ;->۬:Ll/ۘۨۖ;

    if-ne v10, v11, :cond_4

    const-string v9, "SMB3CompressionAlgorithm is \'NONE\', continuing without compression"

    .line 147
    invoke-interface {v2, v9}, Ll/֫᩻֨;->ܽ(Ljava/lang/String;)V

    goto :goto_2

    .line 152
    :cond_4
    invoke-static {v9}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    move-result-object v9

    invoke-static {v6, v9}, Ll/֡ۧۘ;->֫(Ll/֡ۧۘ;Ljava/util/EnumSet;)V

    :goto_2
    const/4 v9, 0x1

    goto :goto_1

    .line 145
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The SMB2CompressionCapabilities NegotiateContext should contain at least 1 algorithm"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 122
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "SMB2_COMPRESSION_CAPABILITIES should only appear once in the NegotiateContextList"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 128
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unknown negotiate context type"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    if-nez v8, :cond_a

    .line 118
    check-cast v10, Ll/֡᩺ۖ;

    .line 156
    invoke-virtual {v10}, Ll/֡᩺ۖ;->ۧ()Ljava/util/List;

    move-result-object v8

    .line 157
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v10

    if-ne v10, v4, :cond_9

    .line 160
    invoke-interface {v8, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/֡ۨۖ;

    invoke-static {v6, v8}, Ll/֡ۧۘ;->֫(Ll/֡ۧۘ;Ll/֡ۨۖ;)V

    const/4 v8, 0x1

    goto :goto_1

    .line 158
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The SMB2EncryptionCapabilities NegotiateContext does not contain exactly 1 cipher"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 115
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "SMB2_ENCRYPTION_CAPABILITIES should only appear once in the NegotiateContextList"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    if-nez v7, :cond_d

    .line 111
    check-cast v10, Ll/᩸᩺ۖ;

    .line 164
    invoke-virtual {v10}, Ll/᩸᩺ۖ;->ۧ()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-ne v7, v4, :cond_c

    .line 167
    invoke-virtual {v10}, Ll/᩸᩺ۖ;->ۧ()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۚۨۖ;

    .line 169
    invoke-static {v6, v7}, Ll/֡ۧۘ;->֫(Ll/֡ۧۘ;Ll/ۚۨۖ;)V

    .line 175
    invoke-static {v6}, Ll/֡ۧۘ;->֫(Ll/֡ۧۘ;)Ll/֨֫ۘ;

    move-result-object v7

    invoke-static {v7}, Ll/᩵֫ۘ;->֫(Ll/֨֫ۘ;)[B

    move-result-object v7

    .line 176
    invoke-static {v6}, Ll/֡ۧۘ;->ۧ(Ll/֡ۧۘ;)Ll/᩺ۨۖ;

    move-result-object v10

    invoke-static {v10}, Ll/᩵֫ۘ;->֫(Ll/֨֫ۘ;)[B

    move-result-object v10

    .line 179
    invoke-static {v6}, Ll/֡ۧۘ;->ܽ(Ll/֡ۧۘ;)Ll/ۚۨۖ;

    move-result-object v11

    invoke-virtual {v11}, Ll/ۚۨۖ;->֫()Ljava/lang/String;

    move-result-object v11

    .line 181
    :try_start_0
    invoke-virtual {v0}, Ll/ۙ֫ۘ;->᩻()Ll/ۖ֫ۘ;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v11}, Ll/ۖ֫ۘ;->֫(Ljava/lang/String;)Ll/ܺ֫ۘ;

    move-result-object v11
    :try_end_0
    .catch Ll/۠۟ۖ; {:try_start_0 .. :try_end_0} :catch_0

    .line 187
    invoke-virtual {v11}, Ll/ܺ֫ۘ;->ۧ()I

    move-result v12

    new-array v12, v12, [B

    .line 23
    invoke-virtual {v11}, Ll/ܺ֫ۘ;->ܽ()V

    .line 24
    invoke-virtual {v11, v12}, Ll/ܺ֫ۘ;->֫([B)V

    .line 25
    invoke-virtual {v11, v7}, Ll/ܺ֫ۘ;->֫([B)V

    .line 26
    invoke-virtual {v11}, Ll/ܺ֫ۘ;->֫()[B

    move-result-object v7

    .line 23
    invoke-virtual {v11}, Ll/ܺ֫ۘ;->ܽ()V

    .line 24
    invoke-virtual {v11, v7}, Ll/ܺ֫ۘ;->֫([B)V

    .line 25
    invoke-virtual {v11, v10}, Ll/ܺ֫ۘ;->֫([B)V

    .line 26
    invoke-virtual {v11}, Ll/ܺ֫ۘ;->֫()[B

    move-result-object v7

    .line 170
    invoke-static {v6, v7}, Ll/֡ۧۘ;->֫(Ll/֡ۧۘ;[B)V

    const/4 v7, 0x1

    goto/16 :goto_1

    :catch_0
    move-exception v0

    .line 183
    new-instance v1, Ll/ۧۧۘ;

    const-string v2, "Cannot get the message digest for "

    .line 0
    invoke-static {v2, v11}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 42
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 183
    throw v1

    .line 165
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The SMB2PreauthIntegrityCapabilities NegotiateContext does not contain exactly 1 hash algorithm"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 108
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "SMB2_PREAUTH_INTEGRITY_CAPABILITIES should only appear once in the NegotiateContextList"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 132
    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "negotiate context list is null for SMB 3.1.1 dialect"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 136
    :cond_f
    invoke-virtual {v1}, Ll/᩹ۛۖ;->֫()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {v6}, Ll/֡ۧۘ;->ۧ(Ll/֡ۧۘ;)Ll/᩺ۨۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩺ۨۖ;->ۜ()Ljava/util/Set;

    move-result-object v0

    sget-object v1, Ll/ۛۛۖ;->ۗ:Ll/ۛۛۖ;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 137
    sget-object v0, Ll/֡ۨۖ;->۬:Ll/֡ۨۖ;

    invoke-static {v6, v0}, Ll/֡ۧۘ;->֫(Ll/֡ۧۘ;Ll/֡ۨۖ;)V

    .line 228
    :cond_10
    iget-object v0, p0, Ll/ۚۧۘ;->ܽ:Ll/ۜۧۘ;

    invoke-virtual {v0}, Ll/ۜۧۘ;->᩷()Ll/֡ܽۘ;

    move-result-object v1

    .line 229
    invoke-static {v6}, Ll/֡ۧۘ;->ۧ(Ll/֡ۧۘ;)Ll/᩺ۨۖ;

    move-result-object v3

    .line 230
    invoke-virtual {v3}, Ll/᩺ۨۖ;->ᩴ()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v3}, Ll/᩺ۨۖ;->᩷()Ll/᩹ۛۖ;

    move-result-object v7

    invoke-virtual {v3}, Ll/᩺ۨۖ;->ۘ()I

    move-result v8

    invoke-virtual {v3}, Ll/᩺ۨۖ;->ۜ()Ljava/util/Set;

    move-result-object v3

    invoke-virtual {v1, v4, v7, v8, v3}, Ll/֡ܽۘ;->֫(Ljava/util/UUID;Ll/᩹ۛۖ;ILjava/util/Set;)V

    .line 232
    iget-object v3, v5, Ll/᩻ۧۘ;->۟:Ll/ۚܽۘ;

    invoke-virtual {v1}, Ll/֡ܽۘ;->ܿ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ll/ۚܽۘ;->֫(Ljava/lang/String;)Ll/֡ܽۘ;

    move-result-object v3

    if-nez v3, :cond_11

    .line 234
    iget-object v3, v5, Ll/᩻ۧۘ;->۟:Ll/ۚܽۘ;

    invoke-virtual {v3, v1}, Ll/ۚܽۘ;->֫(Ll/֡ܽۘ;)V

    .line 235
    invoke-static {v6, v1}, Ll/֡ۧۘ;->֫(Ll/֡ۧۘ;Ll/֡ܽۘ;)V

    goto :goto_3

    .line 236
    :cond_11
    invoke-virtual {v1, v3}, Ll/֡ܽۘ;->֫(Ll/֡ܽۘ;)Z

    move-result v4

    if-eqz v4, :cond_12

    .line 237
    invoke-static {v6, v3}, Ll/֡ۧۘ;->֫(Ll/֡ۧۘ;Ll/֡ܽۘ;)V

    .line 91
    :goto_3
    invoke-virtual {v0, v6}, Ll/ۜۧۘ;->֫(Ll/֡ۧۘ;)V

    const-string v1, "Negotiated the following connection settings: {}"

    .line 92
    invoke-interface {v2, v0, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    .line 239
    :cond_12
    new-instance v0, Ll/ۖ۟ۖ;

    invoke-virtual {v1}, Ll/֡ܽۘ;->ܿ()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Different server found for same hostname \'"

    const-string v3, "\', disconnecting..."

    .line 0
    invoke-static {v2, v1, v3}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 39
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 239
    throw v0

    .line 86
    :cond_13
    new-instance v0, Ll/֨ۨۖ;

    invoke-virtual {v1}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v1

    check-cast v1, Ll/᩻ۨۖ;

    const-string v2, "Failure during dialect negotiation"

    invoke-direct {v0, v1, v2}, Ll/֨ۨۖ;-><init>(Ll/᩻ۨۖ;Ljava/lang/String;)V

    throw v0
.end method
