.class public abstract Ll/ۨۖ᩵;
.super Ljava/lang/Object;
.source "V9VM"

# interfaces
.implements Ll/۟ܺ᩵;
.implements Ll/֫ۖ᩵;
.implements Ll/ܽۖ᩵;


# static fields
.field public static final ᩵֫:Ll/֫᩻֨;


# instance fields
.field public ֫֫:Z

.field public ۖ֫:Z

.field public ۗ:Ljava/lang/String;

.field public ۘ֫:Z

.field public ۙ:Ll/ۛۖ᩵;

.field public ۛ:Z

.field public ۜ֫:Z

.field public ۟:I

.field public ۡ֫:I

.field public ۢ֫:I

.field public ۤ:Ljava/lang/Long;

.field public ۧ֫:I

.field public ۨ:B

.field public ۫:Ljava/lang/Exception;

.field public ۬:I

.field public ܰ:Ljava/lang/String;

.field public volatile ܳ֫:Z

.field public ܺ֫:I

.field public ܽ֫:I

.field public ܿ֫:I

.field public ᩳ֫:Ljava/lang/String;

.field public ᩴ֫:I

.field public ᩶:Ll/֨ۡ᩵;

.field public ᩷֫:Ljava/lang/String;

.field public ᩸:I

.field public ᩹:B

.field public ᩺:I

.field public ᩻֫:Ll/ۨۖ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 45
    const-class v0, Ll/ۨۖ᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ۨۖ᩵;->᩵֫:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ll/֨ۡ᩵;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 251
    invoke-direct {p0, p1, v0, v1}, Ll/ۨۖ᩵;-><init>(Ll/֨ۡ᩵;BLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ll/֨ۡ᩵;B)V
    .locals 1

    const/4 v0, 0x0

    .line 251
    invoke-direct {p0, p1, p2, v0}, Ll/ۨۖ᩵;-><init>(Ll/֨ۡ᩵;BLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ll/֨ۡ᩵;BLjava/lang/String;)V
    .locals 1

    .line 255
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0xffff

    .line 217
    iput v0, p0, Ll/ۨۖ᩵;->ۡ֫:I

    const/4 v0, 0x0

    .line 223
    iput-object v0, p0, Ll/ۨۖ᩵;->ۙ:Ll/ۛۖ᩵;

    .line 256
    iput-object p1, p0, Ll/ۨۖ᩵;->᩶:Ll/֨ۡ᩵;

    .line 257
    iput-byte p2, p0, Ll/ۨۖ᩵;->᩹:B

    .line 258
    iput-object p3, p0, Ll/ۨۖ᩵;->ᩳ֫:Ljava/lang/String;

    const/16 p2, 0x18

    .line 259
    iput-byte p2, p0, Ll/ۨۖ᩵;->ۨ:B

    .line 260
    check-cast p1, Ll/ܰۡ᩵;

    invoke-virtual {p1}, Ll/ܰۡ᩵;->۫()I

    move-result p1

    iput p1, p0, Ll/ۨۖ᩵;->ܿ֫:I

    return-void
.end method


# virtual methods
.method public decode([B)I
    .locals 6

    const/4 v0, 0x4

    .line 1134
    iput v0, p0, Ll/ۨۖ᩵;->۟:I

    .line 1136
    invoke-virtual {p0, p1}, Ll/ۨۖ᩵;->֫([B)V

    const/16 v1, 0x24

    .line 1138
    aget-byte v1, p1, v1

    iput v1, p0, Ll/ۨۖ᩵;->ᩴ֫:I

    .line 1139
    sget-object v2, Ll/ۨۖ᩵;->᩵֫:Ll/֫᩻֨;

    const/16 v3, 0x25

    if-eqz v1, :cond_1

    .line 1141
    invoke-virtual {p0, v3, p1}, Ll/ۨۖ᩵;->ܽ(I[B)I

    move-result v1

    iget v4, p0, Ll/ۨۖ᩵;->ᩴ֫:I

    mul-int/lit8 v4, v4, 0x2

    if-eq v1, v4, :cond_0

    .line 1142
    invoke-interface {v2}, Ll/֫᩻֨;->ܽ()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 1143
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "wordCount * 2="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v5, p0, Ll/ۨۖ᩵;->ᩴ֫:I

    mul-int/lit8 v5, v5, 0x2

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " but readParameterWordsWireFormat returned "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 1146
    :cond_0
    iget v1, p0, Ll/ۨۖ᩵;->ᩴ֫:I

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v3, v1

    .line 1149
    :cond_1
    invoke-static {v3, p1}, Ll/֫֡᩵;->֫(I[B)I

    move-result v1

    iput v1, p0, Ll/ۨۖ᩵;->᩸:I

    add-int/lit8 v3, v3, 0x2

    if-eqz v1, :cond_3

    .line 1154
    invoke-virtual {p0, v3, p1}, Ll/ۨۖ᩵;->ۧ(I[B)I

    move-result v1

    iget v4, p0, Ll/ۨۖ᩵;->᩸:I

    if-eq v1, v4, :cond_2

    .line 1155
    invoke-interface {v2}, Ll/֫᩻֨;->ܽ()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 1156
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "byteCount="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v5, p0, Ll/ۨۖ᩵;->᩸:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " but readBytesWireFormat returned "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 1162
    :cond_2
    iget v1, p0, Ll/ۨۖ᩵;->᩸:I

    add-int/2addr v3, v1

    :cond_3
    sub-int/2addr v3, v0

    .line 1166
    iput v3, p0, Ll/ۨۖ᩵;->ۧ֫:I

    .line 911
    iget-boolean v1, p0, Ll/ۨۖ᩵;->ۜ֫:Z

    if-eqz v1, :cond_4

    .line 1169
    new-array v1, v3, [B

    const/4 v2, 0x0

    .line 1170
    invoke-static {p1, v0, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1174
    :cond_4
    invoke-virtual {p0, v0, v3, p1}, Ll/ۨۖ᩵;->֫(II[B)Z

    move-result p1

    if-eqz p1, :cond_5

    return v3

    .line 1175
    :cond_5
    new-instance p1, Ll/ᩳۖ᩵;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Signature verification failed for "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 58
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1175
    throw p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1255
    instance-of v0, p1, Ll/ۨۖ᩵;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۨۖ᩵;

    iget p1, p1, Ll/ۨۖ᩵;->ܽ֫:I

    iget v0, p0, Ll/ۨۖ᩵;->ܽ֫:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getDigest()Ll/ۛۖ᩵;
    .locals 1

    .line 618
    iget-object v0, p0, Ll/ۨۖ᩵;->ۙ:Ll/ۛۖ᩵;

    return-object v0
.end method

.method public final getDigest()Ll/ܿۖ᩵;
    .locals 1

    .line 618
    iget-object v0, p0, Ll/ۨۖ᩵;->ۙ:Ll/ۛۖ᩵;

    return-object v0
.end method

.method public final getErrorCode()I
    .locals 1

    .line 537
    iget v0, p0, Ll/ۨۖ᩵;->۬:I

    return v0
.end method

.method public final getException()Ljava/lang/Exception;
    .locals 1

    .line 867
    iget-object v0, p0, Ll/ۨۖ᩵;->۫:Ljava/lang/Exception;

    return-object v0
.end method

.method public bridge synthetic getNext()Ll/۟ܺ᩵;
    .locals 1

    .line 43
    invoke-virtual {p0}, Ll/ۨۖ᩵;->getNext()Ll/ۨۖ᩵;

    move-result-object v0

    return-object v0
.end method

.method public getNext()Ll/ۨۖ᩵;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getPath()Ljava/lang/String;
    .locals 1

    .line 554
    iget-object v0, p0, Ll/ۨۖ᩵;->ᩳ֫:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1249
    iget v0, p0, Ll/ۨۖ᩵;->ܽ֫:I

    return v0
.end method

.method public reset()V
    .locals 2

    const/16 v0, 0x18

    .line 961
    iput-byte v0, p0, Ll/ۨۖ᩵;->ۨ:B

    const/4 v0, 0x0

    .line 962
    iput v0, p0, Ll/ۨۖ᩵;->᩺:I

    .line 963
    iput v0, p0, Ll/ۨۖ᩵;->۬:I

    .line 964
    iput-boolean v0, p0, Ll/ۨۖ᩵;->ܳ֫:Z

    const/4 v1, 0x0

    .line 965
    iput-object v1, p0, Ll/ۨۖ᩵;->ۙ:Ll/ۛۖ᩵;

    .line 966
    iput v0, p0, Ll/ۨۖ᩵;->ܺ֫:I

    const v0, 0xffff

    .line 967
    iput v0, p0, Ll/ۨۖ᩵;->ۡ֫:I

    return-void
.end method

.method public final size()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1262
    iget-byte v0, p0, Ll/ۨۖ᩵;->᩹:B

    const/4 v1, 0x4

    if-eqz v0, :cond_a

    const/4 v2, 0x1

    if-eq v0, v2, :cond_9

    if-eq v0, v1, :cond_8

    const/16 v2, 0x10

    if-eq v0, v2, :cond_7

    const/16 v2, 0x32

    if-eq v0, v2, :cond_6

    const/16 v2, 0x34

    if-eq v0, v2, :cond_5

    const/4 v2, 0x6

    if-eq v0, v2, :cond_4

    const/4 v2, 0x7

    if-eq v0, v2, :cond_3

    const/16 v2, 0x8

    if-eq v0, v2, :cond_2

    const/16 v2, 0x2a

    if-eq v0, v2, :cond_1

    const/16 v2, 0x2b

    if-eq v0, v2, :cond_0

    packed-switch v0, :pswitch_data_0

    packed-switch v0, :pswitch_data_1

    packed-switch v0, :pswitch_data_2

    packed-switch v0, :pswitch_data_3

    const-string v0, "UNKNOWN"

    goto :goto_0

    :pswitch_0
    const-string v0, "SMB_COM_NT_CREATE_ANDX"

    goto :goto_0

    :pswitch_1
    const-string v0, "SMB_COM_NT_TRANSACT_SECONDARY"

    goto :goto_0

    :pswitch_2
    const-string v0, "SMB_COM_NT_TRANSACT"

    goto :goto_0

    :pswitch_3
    const-string v0, "SMB_COM_TRANSACTION_SECONDARY"

    goto :goto_0

    :pswitch_4
    const-string v0, "SMB_COM_TRANSACTION"

    goto :goto_0

    :pswitch_5
    const-string v0, "SMB_COM_LOCKING_ANDX"

    goto :goto_0

    :pswitch_6
    const-string v0, "SMB_COM_WRITE_ANDX"

    goto :goto_0

    :pswitch_7
    const-string v0, "SMB_COM_READ_ANDX"

    goto :goto_0

    :pswitch_8
    const-string v0, "SMB_COM_OPEN_ANDX"

    goto :goto_0

    :pswitch_9
    const-string v0, "SMB_COM_TREE_CONNECT_ANDX"

    goto :goto_0

    :pswitch_a
    const-string v0, "SMB_COM_LOGOFF_ANDX"

    goto :goto_0

    :pswitch_b
    const-string v0, "SMB_COM_SESSION_SETUP_ANDX"

    goto :goto_0

    :pswitch_c
    const-string v0, "SMB_COM_NEGOTIATE"

    goto :goto_0

    :pswitch_d
    const-string v0, "SMB_COM_TREE_DISCONNECT"

    goto :goto_0

    :cond_0
    const-string v0, "SMB_COM_ECHO"

    goto :goto_0

    :cond_1
    const-string v0, "SMB_COM_MOVE"

    goto :goto_0

    :cond_2
    const-string v0, "SMB_COM_QUERY_INFORMATION"

    goto :goto_0

    :cond_3
    const-string v0, "SMB_COM_RENAME"

    goto :goto_0

    :cond_4
    const-string v0, "SMB_COM_DELETE"

    goto :goto_0

    :cond_5
    const-string v0, "SMB_COM_FIND_CLOSE2"

    goto :goto_0

    :cond_6
    const-string v0, "SMB_COM_TRANSACTION2"

    goto :goto_0

    :cond_7
    const-string v0, "SMB_COM_CHECK_DIRECTORY"

    goto :goto_0

    :cond_8
    const-string v0, "SMB_COM_CLOSE"

    goto :goto_0

    :cond_9
    const-string v0, "SMB_COM_DELETE_DIRECTORY"

    goto :goto_0

    :cond_a
    const-string v0, "SMB_COM_CREATE_DIRECTORY"

    .line 1341
    :goto_0
    iget v2, p0, Ll/ۨۖ᩵;->۬:I

    if-nez v2, :cond_b

    const-string v2, "0"

    goto :goto_1

    :cond_b
    invoke-static {v2}, Ll/ۗۚ᩵;->֫(I)Ljava/lang/String;

    move-result-object v2

    .line 1342
    :goto_1
    new-instance v3, Ljava/lang/String;

    const-string v4, "command="

    const-string v5, ",received="

    .line 0
    invoke-static {v4, v0, v5}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1342
    iget-boolean v4, p0, Ll/ۨۖ᩵;->ܳ֫:Z

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, ",errorCode="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",flags=0x"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v2, p0, Ll/ۨۖ᩵;->ۨ:B

    and-int/lit16 v2, v2, 0xff

    const-string v4, ",flags2=0x"

    .line 0
    invoke-static {v2, v1, v4, v0}, Ll/ᩴ᩸ܿ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 1343
    iget v2, p0, Ll/ۨۖ᩵;->᩺:I

    const-string v4, ",signSeq="

    .line 0
    invoke-static {v2, v1, v4, v0}, Ll/ᩴ᩸ܿ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 1344
    iget v1, p0, Ll/ۨۖ᩵;->ۢ֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",tid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۨۖ᩵;->ۡ֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",pid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۨۖ᩵;->ܿ֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",uid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۨۖ᩵;->ܺ֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۨۖ᩵;->ܽ֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",wordCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۨۖ᩵;->ᩴ֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",byteCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۨۖ᩵;->᩸:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v3

    nop

    :pswitch_data_0
    .packed-switch -0x60
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x24
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x2d
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x71
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch
.end method

.method public final ֡()V
    .locals 1

    const/4 v0, 0x1

    .line 922
    iput-boolean v0, p0, Ll/ۨۖ᩵;->ۜ֫:Z

    return-void
.end method

.method public final ֨()Ll/۟ܺ᩵;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ֫(ILjava/lang/String;)I
    .locals 2

    .line 1088
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 1089
    iget-boolean v1, p0, Ll/ۨۖ᩵;->ۖ֫:Z

    if-eqz v1, :cond_0

    .line 1090
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    mul-int/lit8 p2, p2, 0x2

    add-int/lit8 v0, p2, 0x2

    .line 1091
    rem-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_0

    add-int/lit8 p2, p2, 0x3

    return p2

    :cond_0
    return v0
.end method

.method public ֫(I[B)I
    .locals 7

    .line 1110
    iput p1, p0, Ll/ۨۖ᩵;->۟:I

    .line 1112
    invoke-virtual {p0, p1, p2}, Ll/ۨۖ᩵;->ܳ(I[B)V

    add-int/lit8 v0, p1, 0x20

    add-int/lit8 v1, p1, 0x21

    .line 1113
    invoke-virtual {p0, v1, p2}, Ll/ۨۖ᩵;->᩻(I[B)I

    move-result v2

    iput v2, p0, Ll/ۨۖ᩵;->ᩴ֫:I

    .line 1114
    div-int/lit8 v3, v2, 0x2

    and-int/lit16 v4, v3, 0xff

    int-to-byte v4, v4

    aput-byte v4, p2, v0

    add-int/2addr v1, v2

    .line 1116
    iput v3, p0, Ll/ۨۖ᩵;->ᩴ֫:I

    add-int/lit8 v0, v1, 0x2

    .line 1117
    invoke-virtual {p0, v0, p2}, Ll/ۨۖ᩵;->ܿ(I[B)I

    move-result v2

    iput v2, p0, Ll/ۨۖ᩵;->᩸:I

    add-int/lit8 v3, v1, 0x1

    and-int/lit16 v4, v2, 0xff

    int-to-byte v4, v4

    .line 1118
    aput-byte v4, p2, v1

    shr-int/lit8 v1, v2, 0x8

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    .line 1119
    aput-byte v1, p2, v3

    add-int/2addr v0, v2

    sub-int v4, v0, p1

    .line 1122
    iput v4, p0, Ll/ۨۖ᩵;->ۧ֫:I

    .line 1124
    iget-object v1, p0, Ll/ۨۖ᩵;->ۙ:Ll/ۛۖ᩵;

    if-eqz v1, :cond_0

    .line 1125
    iget v3, p0, Ll/ۨۖ᩵;->۟:I

    iget-object v6, p0, Ll/ۨۖ᩵;->᩻֫:Ll/ۨۖ᩵;

    move-object v2, p2

    move-object v5, p0

    invoke-virtual/range {v1 .. v6}, Ll/ۛۖ᩵;->֫([BIILl/ܰܺ᩵;Ll/ܰܺ᩵;)V

    .line 1128
    :cond_0
    iget p1, p0, Ll/ۨۖ᩵;->ۧ֫:I

    return p1
.end method

.method public final ֫(Ljava/lang/String;I[B)I
    .locals 1

    .line 1006
    iget-boolean v0, p0, Ll/ۨۖ᩵;->ۖ֫:Z

    invoke-virtual {p0, p1, p3, p2, v0}, Ll/ۨۖ᩵;->֫(Ljava/lang/String;[BIZ)I

    move-result p1

    return p1
.end method

.method public final ֫(Ljava/lang/String;[BIZ)I
    .locals 3

    const/4 v0, 0x0

    if-eqz p4, :cond_1

    .line 1014
    iget p4, p0, Ll/ۨۖ᩵;->۟:I

    sub-int p4, p3, p4

    rem-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    add-int/lit8 p4, p3, 0x1

    .line 1015
    aput-byte v0, p2, p3

    goto :goto_0

    :cond_0
    move p4, p3

    .line 1017
    :goto_0
    invoke-static {p1}, Ll/ۤ֨᩵;->ۧ(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    mul-int/lit8 v2, v2, 0x2

    invoke-static {v1, v0, p2, p4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1018
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    add-int/2addr p1, p4

    add-int/lit8 p4, p1, 0x1

    .line 1019
    aput-byte v0, p2, p1

    add-int/lit8 p1, p1, 0x2

    .line 1020
    aput-byte v0, p2, p4

    goto :goto_1

    .line 952
    :cond_1
    iget-object p4, p0, Ll/ۨۖ᩵;->᩶:Ll/֨ۡ᩵;

    .line 1022
    invoke-static {p1, p4}, Ll/ۤ֨᩵;->֫(Ljava/lang/String;Ll/֨ۡ᩵;)[B

    move-result-object p1

    .line 1023
    array-length p4, p1

    invoke-static {p1, v0, p2, p3, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1024
    array-length p1, p1

    add-int/2addr p1, p3

    add-int/lit8 p4, p1, 0x1

    .line 1025
    aput-byte v0, p2, p1

    move p1, p4

    :goto_1
    sub-int/2addr p1, p3

    return p1
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 587
    iget-object v0, p0, Ll/ۨۖ᩵;->᩷֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(ZII[B)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_1

    .line 1051
    iget p1, p0, Ll/ۨۖ᩵;->۟:I

    sub-int p1, p2, p1

    rem-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_0

    add-int/lit8 p2, p2, 0x1

    .line 1054
    :cond_0
    invoke-static {p2, p3, p4}, Ll/ۤ֨᩵;->ۧ(II[B)I

    move-result p1

    invoke-static {p2, p1, p4}, Ll/ۤ֨᩵;->ܽ(II[B)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 1057
    :cond_1
    invoke-static {p2, p3, p4}, Ll/ۤ֨᩵;->֫(II[B)I

    move-result p1

    .line 952
    iget-object p3, p0, Ll/ۨۖ᩵;->᩶:Ll/֨ۡ᩵;

    .line 1057
    invoke-static {p4, p2, p1, p3}, Ll/ۤ֨᩵;->֫([BIILl/֨ۡ᩵;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫([BIZ)Ljava/lang/String;
    .locals 1

    const/16 v0, 0xff

    if-eqz p3, :cond_1

    .line 1072
    iget p3, p0, Ll/ۨۖ᩵;->۟:I

    sub-int p3, p2, p3

    rem-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    add-int/lit8 p2, p2, 0x1

    .line 1075
    :cond_0
    invoke-static {p2, v0, p1}, Ll/ۤ֨᩵;->ۧ(II[B)I

    move-result p3

    invoke-static {p2, p3, p1}, Ll/ۤ֨᩵;->ܽ(II[B)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 1078
    :cond_1
    invoke-static {p2, v0, p1}, Ll/ۤ֨᩵;->֫(II[B)I

    move-result p3

    .line 952
    iget-object v0, p0, Ll/ۨۖ᩵;->᩶:Ll/֨ۡ᩵;

    .line 1078
    invoke-static {p1, p2, p3, v0}, Ll/ۤ֨᩵;->֫([BIILl/֨ۡ᩵;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(B)V
    .locals 0

    .line 470
    iput-byte p1, p0, Ll/ۨۖ᩵;->ۨ:B

    return-void
.end method

.method public final ֫(I)V
    .locals 0

    return-void
.end method

.method public final ֫(J)V
    .locals 0

    long-to-int p2, p1

    .line 781
    iput p2, p0, Ll/ۨۖ᩵;->ܽ֫:I

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 1

    .line 706
    iput-object p1, p0, Ll/ۨۖ᩵;->۫:Ljava/lang/Exception;

    move-object v0, p0

    .line 707
    monitor-enter v0

    .line 708
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 709
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Ljava/lang/Long;)V
    .locals 0

    .line 944
    iput-object p1, p0, Ll/ۨۖ᩵;->ۤ:Ljava/lang/Long;

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 609
    iput-object p1, p0, Ll/ۨۖ᩵;->ᩳ֫:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 598
    iput-object p1, p0, Ll/ۨۖ᩵;->ۗ:Ljava/lang/String;

    .line 599
    iput-object p2, p0, Ll/ۨۖ᩵;->᩷֫:Ljava/lang/String;

    .line 600
    iput-object p3, p0, Ll/ۨۖ᩵;->ܰ:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ll/֫ۖ᩵;)V
    .locals 1

    .line 749
    instance-of v0, p1, Ll/ۨۖ᩵;

    if-eqz v0, :cond_0

    .line 752
    check-cast p1, Ll/ۨۖ᩵;

    iput-object p1, p0, Ll/ۨۖ᩵;->᩻֫:Ll/ۨۖ᩵;

    return-void

    .line 750
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final ֫(Ll/۟ܺ᩵;)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ܿۖ᩵;)V
    .locals 0

    .line 627
    check-cast p1, Ll/ۛۖ᩵;

    iput-object p1, p0, Ll/ۨۖ᩵;->ۙ:Ll/ۛۖ᩵;

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 650
    iput-boolean p1, p0, Ll/ۨۖ᩵;->ۛ:Z

    return-void
.end method

.method public final ֫([B)V
    .locals 1

    const/16 v0, 0x8

    .line 1197
    aget-byte v0, p1, v0

    iput-byte v0, p0, Ll/ۨۖ᩵;->᩹:B

    const/16 v0, 0x9

    .line 1198
    invoke-static {v0, p1}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v0

    iput v0, p0, Ll/ۨۖ᩵;->۬:I

    const/16 v0, 0xd

    .line 1199
    aget-byte v0, p1, v0

    iput-byte v0, p0, Ll/ۨۖ᩵;->ۨ:B

    const/16 v0, 0xe

    .line 1200
    invoke-static {v0, p1}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, p0, Ll/ۨۖ᩵;->᩺:I

    const/16 v0, 0x1c

    .line 1201
    invoke-static {v0, p1}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, p0, Ll/ۨۖ᩵;->ۡ֫:I

    const/16 v0, 0x1e

    .line 1202
    invoke-static {v0, p1}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, p0, Ll/ۨۖ᩵;->ܿ֫:I

    const/16 v0, 0x20

    .line 1203
    invoke-static {v0, p1}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, p0, Ll/ۨۖ᩵;->ܺ֫:I

    const/16 v0, 0x22

    .line 1204
    invoke-static {v0, p1}, Ll/֫֡᩵;->֫(I[B)I

    move-result p1

    iput p1, p0, Ll/ۨۖ᩵;->ܽ֫:I

    return-void
.end method

.method public final ֫(II[B)Z
    .locals 2

    .line 996
    iget-object p1, p0, Ll/ۨۖ᩵;->ۙ:Ll/ۛۖ᩵;

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    .line 537
    iget v1, p0, Ll/ۨۖ᩵;->۬:I

    if-nez v1, :cond_0

    const/4 v1, 0x4

    .line 997
    invoke-virtual {p1, p3, v1, p2, p0}, Ll/ۛۖ᩵;->֫([BIILl/ܰܺ᩵;)Z

    move-result p1

    .line 998
    iput-boolean p1, p0, Ll/ۨۖ᩵;->ۘ֫:Z

    xor-int/2addr p1, v0

    return p1

    :cond_0
    return v0
.end method

.method public final ֫֫()I
    .locals 1

    .line 438
    iget v0, p0, Ll/ۨۖ᩵;->᩸:I

    return v0
.end method

.method public final ۗ()V
    .locals 2

    const/4 v0, 0x1

    .line 720
    iput-boolean v0, p0, Ll/ۨۖ᩵;->֫֫:Z

    move-object v0, p0

    .line 721
    monitor-enter v0

    .line 722
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 723
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ۘ()Z
    .locals 1

    .line 878
    iget-boolean v0, p0, Ll/ۨۖ᩵;->֫֫:Z

    return v0
.end method

.method public final ۜ()J
    .locals 2

    .line 772
    iget v0, p0, Ll/ۨۖ᩵;->ܽ֫:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public final ۜ(I)V
    .locals 0

    .line 486
    iput p1, p0, Ll/ۨۖ᩵;->᩺:I

    return-void
.end method

.method public final ۜ֫()Z
    .locals 2

    .line 1210
    iget-byte v0, p0, Ll/ۨۖ᩵;->ۨ:B

    const/16 v1, 0x80

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۟()Z
    .locals 1

    .line 675
    iget-boolean v0, p0, Ll/ۨۖ᩵;->ܳ֫:Z

    return v0
.end method

.method public final ۢ()Z
    .locals 1

    .line 856
    iget-boolean v0, p0, Ll/ۨۖ᩵;->ۘ֫:Z

    return v0
.end method

.method public final ۢ֫()Z
    .locals 1

    .line 658
    iget-boolean v0, p0, Ll/ۨۖ᩵;->ۖ֫:Z

    return v0
.end method

.method public final ۤ()V
    .locals 1

    const/4 v0, 0x0

    .line 681
    iput-boolean v0, p0, Ll/ۨۖ᩵;->ܳ֫:Z

    return-void
.end method

.method public abstract ۧ(I[B)I
.end method

.method public bridge synthetic ۧ()Ll/֫ۖ᩵;
    .locals 1

    .line 43
    invoke-virtual {p0}, Ll/ۨۖ᩵;->ۧ()Ll/ۨۖ᩵;

    move-result-object v0

    return-object v0
.end method

.method public ۧ()Ll/ۨۖ᩵;
    .locals 1

    .line 732
    iget-object v0, p0, Ll/ۨۖ᩵;->᩻֫:Ll/ۨۖ᩵;

    return-object v0
.end method

.method public bridge synthetic ۧ()Ll/ܰ֨᩵;
    .locals 1

    .line 43
    invoke-virtual {p0}, Ll/ۨۖ᩵;->ۧ()Ll/ۨۖ᩵;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(I)V
    .locals 0

    .line 831
    iput p1, p0, Ll/ۨۖ᩵;->ܺ֫:I

    return-void
.end method

.method public final ۧ(J)V
    .locals 0

    return-void
.end method

.method public final ۧ(Z)V
    .locals 0

    .line 666
    iput-boolean p1, p0, Ll/ۨۖ᩵;->ۖ֫:Z

    return-void
.end method

.method public final ۧ֫()Ll/֨ۡ᩵;
    .locals 1

    .line 952
    iget-object v0, p0, Ll/ۨۖ᩵;->᩶:Ll/֨ۡ᩵;

    return-object v0
.end method

.method public final ۨ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ۬()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ܳ()V
    .locals 1

    const/16 v0, 0x1000

    .line 514
    invoke-virtual {p0, v0}, Ll/ۨۖ᩵;->ܳ(I)V

    return-void
.end method

.method public final ܳ(I)V
    .locals 1

    .line 494
    iget v0, p0, Ll/ۨۖ᩵;->᩺:I

    or-int/2addr p1, v0

    iput p1, p0, Ll/ۨۖ᩵;->᩺:I

    return-void
.end method

.method public final ܳ(I[B)V
    .locals 3

    const/4 v0, 0x0

    const/16 v1, 0x18

    .line 1183
    sget-object v2, Ll/֫֡᩵;->ۧ:[B

    invoke-static {v2, v0, p2, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v0, p1, 0x4

    .line 1184
    iget-byte v1, p0, Ll/ۨۖ᩵;->᩹:B

    aput-byte v1, p2, v0

    add-int/lit8 v0, p1, 0x9

    .line 1185
    iget-byte v1, p0, Ll/ۨۖ᩵;->ۨ:B

    aput-byte v1, p2, v0

    .line 1186
    iget v0, p0, Ll/ۨۖ᩵;->᩺:I

    int-to-long v0, v0

    add-int/lit8 v2, p1, 0xa

    invoke-static {v0, v1, v2, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, p1, 0x18

    .line 1188
    iget v1, p0, Ll/ۨۖ᩵;->ۡ֫:I

    int-to-long v1, v1

    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->֫(JI[B)V

    .line 1189
    iget v0, p0, Ll/ۨۖ᩵;->ܿ֫:I

    int-to-long v0, v0

    add-int/lit8 v2, p1, 0x1a

    invoke-static {v0, v1, v2, p2}, Ll/֫֡᩵;->֫(JI[B)V

    .line 1190
    iget v0, p0, Ll/ۨۖ᩵;->ܺ֫:I

    int-to-long v0, v0

    add-int/lit8 v2, p1, 0x1c

    invoke-static {v0, v1, v2, p2}, Ll/֫֡᩵;->֫(JI[B)V

    .line 1191
    iget v0, p0, Ll/ۨۖ᩵;->ܽ֫:I

    int-to-long v0, v0

    add-int/lit8 p1, p1, 0x1e

    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    return-void
.end method

.method public final ܳ֫()Z
    .locals 1

    .line 635
    iget-boolean v0, p0, Ll/ۨۖ᩵;->ۛ:Z

    return v0
.end method

.method public final ܶ()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public abstract ܽ(I[B)I
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 576
    iget-object v0, p0, Ll/ۨۖ᩵;->ۗ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ(Ll/۟ܺ᩵;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ֫()B
    .locals 1

    .line 462
    iget-byte v0, p0, Ll/ۨۖ᩵;->ۨ:B

    return v0
.end method

.method public abstract ܿ(I[B)I
.end method

.method public bridge synthetic ܿ()Ll/۟ܺ᩵;
    .locals 1

    .line 43
    invoke-virtual {p0}, Ll/ۨۖ᩵;->getNext()Ll/ۨۖ᩵;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ(I)V
    .locals 0

    int-to-byte p1, p1

    .line 430
    iput-byte p1, p0, Ll/ۨۖ᩵;->᩹:B

    return-void
.end method

.method public final ܿ֫()I
    .locals 1

    .line 822
    iget v0, p0, Ll/ۨۖ᩵;->ܺ֫:I

    return v0
.end method

.method public final ᩳ()Ljava/lang/Long;
    .locals 1

    .line 933
    iget-object v0, p0, Ll/ۨۖ᩵;->ۤ:Ljava/lang/Long;

    return-object v0
.end method

.method public final ᩳ(I[B)Ljava/lang/String;
    .locals 2

    const/16 v0, 0xff

    .line 1037
    iget-boolean v1, p0, Ll/ۨۖ᩵;->ۖ֫:Z

    invoke-virtual {p0, v1, p1, v0, p2}, Ll/ۨۖ᩵;->֫(ZII[B)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ᩳ(I)V
    .locals 0

    .line 798
    iput p1, p0, Ll/ۨۖ᩵;->ۡ֫:I

    return-void
.end method

.method public final ᩳ֫()I
    .locals 1

    .line 839
    iget v0, p0, Ll/ۨۖ᩵;->ۢ֫:I

    return v0
.end method

.method public final ᩵()Ljava/lang/String;
    .locals 1

    .line 565
    iget-object v0, p0, Ll/ۨۖ᩵;->ܰ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩶()I
    .locals 1

    .line 421
    iget-byte v0, p0, Ll/ۨۖ᩵;->᩹:B

    return v0
.end method

.method public final ᩷()V
    .locals 2

    const/4 v0, 0x1

    .line 692
    iput-boolean v0, p0, Ll/ۨۖ᩵;->ܳ֫:Z

    move-object v0, p0

    .line 693
    monitor-enter v0

    .line 694
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 695
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ᩷(I)V
    .locals 0

    .line 847
    iput p1, p0, Ll/ۨۖ᩵;->ۢ֫:I

    return-void
.end method

.method public final ᩷֫()Z
    .locals 1

    .line 911
    iget-boolean v0, p0, Ll/ۨۖ᩵;->ۜ֫:Z

    return v0
.end method

.method public final ᩺()I
    .locals 1

    .line 789
    iget v0, p0, Ll/ۨۖ᩵;->ۡ֫:I

    return v0
.end method

.method public abstract ᩻(I[B)I
.end method

.method public final ᩻(I)V
    .locals 0

    .line 545
    iput p1, p0, Ll/ۨۖ᩵;->۬:I

    return-void
.end method

.method public ᩻֫()Z
    .locals 1

    .line 0
    instance-of v0, p0, Ll/֡ᩴ᩵;

    return v0
.end method
