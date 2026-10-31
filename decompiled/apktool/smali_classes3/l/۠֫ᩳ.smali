.class public final Ll/۠֫ᩳ;
.super Ljava/util/ArrayList;
.source "D9R8"


# static fields
.field public static final ۗ:[B


# instance fields
.field public ۙ:Z

.field public ᩶:J

.field public ᩸:Ljava/lang/String;

.field public ᩹:Ll/ܶ᩵ܿ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    new-array v0, v0, [B

    .line 80
    sput-object v0, Ll/۠֫ᩳ;->ۗ:[B

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    iput-object p1, p0, Ll/۠֫ᩳ;->᩸:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 24
    iput-object p1, p0, Ll/۠֫ᩳ;->᩹:Ll/ܶ᩵ܿ;

    .line 25
    invoke-virtual {p0}, Ll/۠֫ᩳ;->ܳ()V

    return-void
.end method

.method private ֫(Z)V
    .locals 3

    .line 41
    iget-object v0, p0, Ll/۠֫ᩳ;->᩹:Ll/ܶ᩵ܿ;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    new-instance v0, Ll/ۤۜܽ;

    invoke-direct {v0}, Ll/ۤۜܽ;-><init>()V

    .line 43
    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->֫(Z)V

    .line 44
    iget-object p1, p0, Ll/۠֫ᩳ;->᩸:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 45
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 46
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ֫ᩳ;

    .line 14
    iget v2, v1, Ll/ܶ֫ᩳ;->֫:I

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 15
    iget v2, v1, Ll/ܶ֫ᩳ;->ܿ:I

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->ۡ(I)V

    .line 16
    iget-object v2, v1, Ll/ܶ֫ᩳ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 17
    iget-object v2, v1, Ll/ܶ֫ᩳ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->ۧ(Ljava/lang/String;)V

    .line 18
    iget-object v1, v1, Ll/ܶ֫ᩳ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 49
    :cond_0
    iget-object p1, p0, Ll/۠֫ᩳ;->᩹:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ۤۜܽ;->ۖ()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->֫([B)V

    .line 94
    iget-object p1, p0, Ll/۠֫ᩳ;->᩹:Ll/ܶ᩵ܿ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v0

    iput-wide v0, p0, Ll/۠֫ᩳ;->᩶:J

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/security/MessageDigest;)V
    .locals 5

    .line 83
    sget-object v1, Ll/۠֫ᩳ;->ۗ:[B

    move-object v0, v1

    monitor-enter v0

    .line 84
    :try_start_0
    iget-wide v2, p0, Ll/۠֫ᩳ;->᩶:J

    const/4 v4, 0x0

    invoke-static {v2, v3, v4, v1}, Ll/ܺܰۡ;->֫(JI[B)V

    .line 85
    invoke-virtual {p1, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 86
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/ܶ᩵ܿ;)V
    .locals 1

    .line 29
    iget-object v0, p0, Ll/۠֫ᩳ;->᩹:Ll/ܶ᩵ܿ;

    if-nez v0, :cond_0

    .line 32
    iput-object p1, p0, Ll/۠֫ᩳ;->᩹:Ll/ܶ᩵ܿ;

    const/4 p1, 0x0

    .line 33
    invoke-direct {p0, p1}, Ll/۠֫ᩳ;->֫(Z)V

    return-void

    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final ۜ()V
    .locals 5

    .line 74
    iget-wide v0, p0, Ll/۠֫ᩳ;->᩶:J

    iget-object v2, p0, Ll/۠֫ᩳ;->᩹:Ll/ܶ᩵ܿ;

    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 75
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "File changed: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/۠֫ᩳ;->᩹:Ll/ܶ᩵ܿ;

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 76
    invoke-virtual {p0}, Ll/۠֫ᩳ;->ܳ()V

    :cond_0
    return-void
.end method

.method public final ܳ()V
    .locals 5

    .line 54
    iget-object v0, p0, Ll/۠֫ᩳ;->᩹:Ll/ܶ᩵ܿ;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    iget-object v0, p0, Ll/۠֫ᩳ;->᩹:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object v0

    invoke-static {v0}, Ll/۬ۜܽ;->ۧ([B)Ll/۬ۜܽ;

    move-result-object v0

    .line 56
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->clear()V

    .line 57
    invoke-virtual {v0}, Ll/۬ۜܽ;->ܳ()Z

    move-result v1

    iput-boolean v1, p0, Ll/۠֫ᩳ;->ۙ:Z

    .line 58
    invoke-virtual {v0}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v1

    .line 59
    iget-object v2, p0, Ll/۠֫ᩳ;->᩸:Ljava/lang/String;

    if-nez v2, :cond_0

    .line 60
    iput-object v1, p0, Ll/۠֫ᩳ;->᩸:Ljava/lang/String;

    goto :goto_0

    .line 61
    :cond_0
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 64
    :goto_0
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_1

    .line 66
    new-instance v3, Ll/ܶ֫ᩳ;

    invoke-direct {v3}, Ll/ܶ֫ᩳ;-><init>()V

    .line 22
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v4

    iput v4, v3, Ll/ܶ֫ᩳ;->֫:I

    .line 23
    invoke-virtual {v0}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v4

    iput v4, v3, Ll/ܶ֫ᩳ;->ܿ:I

    .line 24
    invoke-virtual {v0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Ll/ܶ֫ᩳ;->ۧ:Ljava/lang/String;

    .line 25
    invoke-virtual {v0}, Ll/۬ۜܽ;->֡()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Ll/ܶ֫ᩳ;->ᩳ:Ljava/lang/String;

    .line 26
    invoke-virtual {v0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Ll/ܶ֫ᩳ;->ܽ:Ljava/lang/String;

    .line 68
    invoke-virtual {p0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 94
    :cond_1
    iget-object v0, p0, Ll/۠֫ᩳ;->᩹:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v0

    iput-wide v0, p0, Ll/۠֫ᩳ;->᩶:J

    return-void

    .line 62
    :cond_2
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0
.end method

.method public final ܶۧ()Ll/ܶ᩵ܿ;
    .locals 1

    .line 98
    iget-object v0, p0, Ll/۠֫ᩳ;->᩹:Ll/ܶ᩵ܿ;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 3

    .line 102
    iget-object v0, p0, Ll/۠֫ᩳ;->᩸:Ljava/lang/String;

    const-string v1, ""

    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 102
    iget-object v0, p0, Ll/۠֫ᩳ;->᩸:Ljava/lang/String;

    const/4 v1, 0x0

    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x2d

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0

    :cond_1
    const-string v0, "[DEFAULT]"

    return-object v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 90
    iget-boolean v0, p0, Ll/۠֫ᩳ;->ۙ:Z

    return v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 102
    iget-object v0, p0, Ll/۠֫ᩳ;->᩸:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩷()V
    .locals 1

    const/4 v0, 0x1

    .line 37
    invoke-direct {p0, v0}, Ll/۠֫ᩳ;->֫(Z)V

    return-void
.end method
