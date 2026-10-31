.class public abstract Ll/ۙᩳۘ;
.super Ljava/lang/Object;
.source "CA2B"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:I


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput p1, p0, Ll/ۙᩳۘ;->ۧ:I

    .line 40
    iput-object p2, p0, Ll/ۙᩳۘ;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۚ۬ۖ;)V
    .locals 5

    .line 60
    instance-of v0, p1, Ll/᩻۫ۖ;

    iget v1, p0, Ll/ۙᩳۘ;->ۧ:I

    iget-object v2, p0, Ll/ۙᩳۘ;->֫:Ljava/lang/String;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Ll/᩻۫ۖ;

    invoke-virtual {v0}, Ll/᩻۫ۖ;->ܿ()I

    move-result v3

    if-ne v3, v1, :cond_3

    .line 65
    invoke-virtual {v0}, Ll/᩻۫ۖ;->ᩳ()Ll/ۚ۬ۖ;

    move-result-object p1

    .line 66
    instance-of v0, p1, Ll/֫۫ۖ;

    if-eqz v0, :cond_2

    .line 70
    check-cast p1, Ll/֫۫ۖ;

    invoke-virtual {p1}, Ll/֫۫ۖ;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚ۬ۖ;

    .line 71
    instance-of v1, v0, Ll/᩻۫ۖ;

    if-eqz v1, :cond_0

    .line 75
    check-cast v0, Ll/᩻۫ۖ;

    .line 76
    invoke-virtual {p0, v0}, Ll/ۙᩳۘ;->֫(Ll/᩻۫ۖ;)V

    goto :goto_0

    .line 72
    :cond_0
    new-instance p1, Ll/᩶ᩳۘ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Expected an ASN.1 TaggedObject as "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " contents, not: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 23
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 72
    throw p1

    :cond_1
    return-void

    .line 67
    :cond_2
    new-instance v0, Ll/᩶ᩳۘ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Expected a "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " (SEQUENCE), not: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 23
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 67
    throw v0

    .line 61
    :cond_3
    new-instance v0, Ll/᩶ᩳۘ;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Expected to find the "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " (CHOICE ["

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "]) header, not: "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 23
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 61
    throw v0
.end method

.method public abstract ֫(Ll/۫ܰۖ;)V
.end method

.method public ֫(Ll/۫ܰۖ;Ll/֫۫ۖ;)V
    .locals 4

    .line 44
    new-instance v0, Ll/᩻۫ۖ;

    sget-object v1, Ll/ۨ۬ۖ;->ܿ:Ll/ۨ۬ۖ;

    .line 202
    sget-object v1, Ll/᩺۬ۖ;->ۙ:Ll/᩺۬ۖ;

    iget v2, p0, Ll/ۙᩳۘ;->ۧ:I

    invoke-static {v1, v2}, Ll/ۨ۬ۖ;->֫(Ll/᩺۬ۖ;I)Ll/ۨ۬ۖ;

    move-result-object v1

    .line 170
    sget-object v2, Ll/֡۬ۖ;->᩶:Ll/֡۬ۖ;

    invoke-virtual {v1, v2}, Ll/ۨ۬ۖ;->֫(Ll/֡۬ۖ;)Ll/ۨ۬ۖ;

    move-result-object v1

    const/4 v2, 0x1

    .line 44
    invoke-direct {v0, v1, p2, v2}, Ll/᩻۫ۖ;-><init>(Ll/ۨ۬ۖ;Ll/ۚ۬ۖ;Z)V

    .line 47
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 48
    sget-object v1, Ll/᩹ᩳۘ;->֫:Ll/᩸۫ۖ;

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    new-instance v0, Ll/᩻۫ۖ;

    .line 198
    sget-object v1, Ll/᩺۬ۖ;->᩶:Ll/᩺۬ۖ;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ll/ۨ۬ۖ;->֫(Ll/᩺۬ۖ;I)Ll/ۨ۬ۖ;

    move-result-object v1

    .line 51
    new-instance v3, Ll/֫۫ۖ;

    invoke-direct {v3, p2}, Ll/֫۫ۖ;-><init>(Ljava/util/ArrayList;)V

    invoke-direct {v0, v1, v3, v2}, Ll/᩻۫ۖ;-><init>(Ll/ۨ۬ۖ;Ll/ۚ۬ۖ;Z)V

    .line 52
    new-instance p2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 53
    new-instance v1, Ll/ܺ۬ۖ;

    new-instance v2, Ll/۠᩵ۚ;

    .line 20
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 53
    invoke-direct {v1, v2, p2}, Ll/ܺ۬ۖ;-><init>(Ll/۠᩵ۚ;Ljava/io/ByteArrayOutputStream;)V

    .line 54
    :try_start_0
    invoke-virtual {v1, v0}, Ll/ܺ۬ۖ;->֫(Ll/ۚ۬ۖ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 56
    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p2

    .line 318
    array-length v0, p2

    invoke-virtual {p1, v0, p2}, Ll/ۤܰۖ;->֫(I[B)V

    return-void

    :catchall_0
    move-exception p1

    .line 53
    :try_start_1
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public abstract ֫(Ll/᩻۫ۖ;)V
.end method
