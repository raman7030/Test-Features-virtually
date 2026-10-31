.class public final Ll/ۘۗۡ;
.super Ljava/lang/Object;
.source "31TZ"


# instance fields
.field public final ֫:Ljava/lang/Object;

.field public final ۧ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    packed-switch p1, :pswitch_data_0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/ۘۗۡ;->ۧ:Ljava/lang/Object;

    .line 20
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/ۘۗۡ;->֫:Ljava/lang/Object;

    return-void

    .line 32
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    const/16 v0, 0x200

    invoke-direct {p1, v0}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    iput-object p1, p0, Ll/ۘۗۡ;->ۧ:Ljava/lang/Object;

    .line 34
    new-instance v0, Ljava/io/DataOutputStream;

    invoke-direct {v0, p1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    iput-object v0, p0, Ll/ۘۗۡ;->֫:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public ֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    .line 58
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x5b

    if-ne v1, v2, :cond_1

    const/16 v1, 0x4c

    .line 59
    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    goto :goto_1

    .line 62
    :cond_0
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 63
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 67
    :goto_0
    invoke-virtual {p0, p1}, Ll/ۘۗۡ;->ۧ(Ljava/lang/String;)Ll/ۖۗۡ;

    move-result-object p1

    if-eqz p1, :cond_3

    if-eqz v0, :cond_2

    .line 0
    invoke-static {v0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 69
    invoke-virtual {p1}, Ll/ۖۗۡ;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p1}, Ll/ۖۗۡ;->֫()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_1
    return-object p2
.end method

.method public ֫(Ll/ۖۗۡ;)V
    .locals 8

    .line 23
    iget-object v0, p0, Ll/ۘۗۡ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {p1}, Ll/ۖۗۡ;->ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖۗۡ;

    .line 24
    iget-object v1, p0, Ll/ۘۗۡ;->֫:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {p1}, Ll/ۖۗۡ;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖۗۡ;

    const-string v2, "]"

    const-string v3, "], ["

    const-string v4, ", ["

    const-string v5, ", "

    if-nez v0, :cond_1

    if-nez v1, :cond_0

    return-void

    .line 32
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "New Name conflict: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/ۖۗۡ;->֫()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    invoke-virtual {p1}, Ll/ۖۗۡ;->ۧ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll/ۖۗۡ;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    invoke-virtual {v1}, Ll/ۖۗۡ;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ll/ۖۗۡ;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 26
    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Old Name conflict: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/ۖۗۡ;->ۧ()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    invoke-virtual {p1}, Ll/ۖۗۡ;->ۧ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll/ۖۗۡ;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    invoke-virtual {v0}, Ll/ۖۗۡ;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ll/ۖۗۡ;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public ֫(Ljava/lang/String;)Z
    .locals 1

    .line 48
    iget-object v0, p0, Ll/ۘۗۡ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public ֫(Ll/᩶ۡۧ;)[B
    .locals 4

    .line 45
    iget-object v0, p0, Ll/ۘۗۡ;->֫:Ljava/lang/Object;

    check-cast v0, Ljava/io/DataOutputStream;

    iget-object v1, p0, Ll/ۘۗۡ;->ۧ:Ljava/lang/Object;

    check-cast v1, Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 47
    :try_start_0
    iget-object v2, p1, Ll/᩶ۡۧ;->ܿ:Ljava/lang/String;

    .line 63
    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 64
    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 48
    iget-object v3, p1, Ll/᩶ۡۧ;->ܳ:Ljava/lang/String;

    .line 63
    invoke-virtual {v0, v3}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    .line 64
    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 50
    iget-wide v2, p1, Ll/᩶ۡۧ;->֫:J

    invoke-virtual {v0, v2, v3}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 51
    iget-wide v2, p1, Ll/᩶ۡۧ;->ܽ:J

    invoke-virtual {v0, v2, v3}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 52
    iget-object p1, p1, Ll/᩶ۡۧ;->ᩳ:[B

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 53
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    .line 54
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 57
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public ۧ(Ljava/lang/String;)Ll/ۖۗۡ;
    .locals 2

    .line 42
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 44
    :cond_0
    iget-object v0, p0, Ll/ۘۗۡ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۖۗۡ;

    return-object p1
.end method
