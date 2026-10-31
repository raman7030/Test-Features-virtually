.class public final Ll/ۜܳ֨;
.super Ll/ۡܳ֨;
.source "34PY"


# instance fields
.field public final ֫:Ll/ۡܳ֨;

.field public final ۧ:Ljava/util/List;

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/ۡܳ֨;Ljava/util/ArrayList;)V
    .locals 0

    .line 301
    invoke-direct {p0}, Ll/ۡܳ֨;-><init>()V

    .line 302
    iput-object p1, p0, Ll/ۜܳ֨;->ܽ:Ljava/lang/String;

    .line 303
    iput-object p2, p0, Ll/ۜܳ֨;->֫:Ll/ۡܳ֨;

    .line 304
    iput-object p3, p0, Ll/ۜܳ֨;->ۧ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 313
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 314
    iget-object v1, p0, Ll/ۜܳ֨;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " & "

    const-string v2, " extends "

    .line 316
    iget-object v3, p0, Ll/ۜܳ֨;->֫:Ll/ۡܳ֨;

    if-eqz v3, :cond_0

    .line 317
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-object v2, v1

    .line 321
    :cond_0
    iget-object v3, p0, Ll/ۜܳ֨;->ۧ:Ljava/util/List;

    if-eqz v3, :cond_1

    .line 322
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۡܳ֨;

    .line 323
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-object v2, v1

    goto :goto_0

    .line 328
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
