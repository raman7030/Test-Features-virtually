.class public final Ll/ۤᩴ֨;
.super Ljava/lang/Object;
.source "67L9"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ۗ:Ll/ۛᩴ֨;

.field public ۙ:Ljava/util/Iterator;

.field public ᩶:Ll/᩷᩶۠;

.field public ᩸:Ljava/util/Iterator;

.field public ᩹:Ljava/util/Set;


# direct methods
.method public constructor <init>(Ll/ۛᩴ֨;)V
    .locals 3

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤᩴ֨;->ۗ:Ll/ۛᩴ֨;

    const/4 p1, 0x0

    .line 121
    iput-object p1, p0, Ll/ۤᩴ֨;->᩹:Ljava/util/Set;

    const/4 v0, 0x4

    new-array v0, v0, [Ll/᩷᩶۠;

    .line 123
    sget-object v1, Ll/᩷᩶۠;->۫:Ll/᩷᩶۠;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/᩷᩶۠;->֫֫:Ll/᩷᩶۠;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/᩷᩶۠;->۟:Ll/᩷᩶۠;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/᩷᩶۠;->۬:Ll/᩷᩶۠;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 128
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Ll/ۤᩴ֨;->ۙ:Ljava/util/Iterator;

    .line 129
    iput-object p1, p0, Ll/ۤᩴ֨;->᩸:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 4

    .line 133
    :cond_0
    :goto_0
    iget-object v0, p0, Ll/ۤᩴ֨;->᩹:Ljava/util/Set;

    if-nez v0, :cond_4

    .line 134
    :goto_1
    iget-object v0, p0, Ll/ۤᩴ֨;->᩸:Ljava/util/Iterator;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_2

    .line 146
    :cond_1
    iget-object v0, p0, Ll/ۤᩴ֨;->᩸:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 147
    iget-object v0, p0, Ll/ۤᩴ֨;->᩸:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    iput-object v0, p0, Ll/ۤᩴ֨;->᩹:Ljava/util/Set;

    goto :goto_0

    .line 135
    :cond_2
    :goto_2
    iget-object v0, p0, Ll/ۤᩴ֨;->ۙ:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 136
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷᩶۠;

    iput-object v0, p0, Ll/ۤᩴ֨;->᩶:Ll/᩷᩶۠;

    .line 138
    :try_start_0
    iget-object v0, p0, Ll/ۤᩴ֨;->ۗ:Ll/ۛᩴ֨;

    invoke-static {v0}, Ll/ۛᩴ֨;->ۧ(Ll/ۛᩴ֨;)Ll/ۧ᩶۠;

    move-result-object v0

    iget-object v1, p0, Ll/ۤᩴ֨;->᩶:Ll/᩷᩶۠;

    invoke-interface {v0, v1}, Ll/ۧ᩶۠;->ۧ(Ll/֫᩶۠;)Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Ll/ۤᩴ֨;->᩸:Ljava/util/Iterator;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 140
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "error listing module locations for "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Ll/ۤᩴ֨;->᩶:Ll/᩷᩶۠;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    return v0

    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 154
    invoke-virtual {p0}, Ll/ۤᩴ֨;->hasNext()Z

    .line 155
    iget-object v0, p0, Ll/ۤᩴ֨;->᩹:Ljava/util/Set;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 157
    iput-object v1, p0, Ll/ۤᩴ֨;->᩹:Ljava/util/Set;

    return-object v0

    .line 160
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
