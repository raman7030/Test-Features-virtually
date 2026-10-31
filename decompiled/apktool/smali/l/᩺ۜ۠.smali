.class public final Ll/᩺ۜ۠;
.super Ll/֫᩷۠;
.source "M664"


# instance fields
.field public final ֫:[Ll/ۙ֨֨;

.field public final ۧ:I

.field public final ܽ:[Ll/ۙ֨֨;


# direct methods
.method public constructor <init>(I[Ll/ۙ֨֨;[Ll/ۙ֨֨;)V
    .locals 0

    .line 1353
    invoke-direct {p0}, Ll/֫᩷۠;-><init>()V

    .line 1354
    iput p1, p0, Ll/᩺ۜ۠;->ۧ:I

    .line 1355
    iput-object p2, p0, Ll/᩺ۜ۠;->֫:[Ll/ۙ֨֨;

    .line 1356
    iput-object p3, p0, Ll/᩺ۜ۠;->ܽ:[Ll/ۙ֨֨;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    const/16 v0, 0xff

    return v0
.end method

.method public final ֫(Ll/ܽ᩷۠;)V
    .locals 8

    .line 1361
    invoke-super {p0, p1}, Ll/֫᩷۠;->֫(Ll/ܽ᩷۠;)V

    .line 1362
    iget-object v0, p1, Ll/ܽ᩷۠;->ܽ:Ll/ܶ֨۠;

    iget v1, p0, Ll/᩺ۜ۠;->ۧ:I

    invoke-virtual {v0, v1}, Ll/ܶ֨۠;->ۧ(I)V

    .line 1363
    iget-object v2, p0, Ll/᩺ۜ۠;->֫:[Ll/ۙ֨֨;

    array-length v3, v2

    invoke-virtual {v0, v3}, Ll/ܶ֨۠;->ۧ(I)V

    .line 1364
    invoke-static {p1}, Ll/ܽ᩷۠;->֫(Ll/ܽ᩷۠;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1365
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, " offset_delta="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 1366
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, " nlocals="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v4, v2

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    :cond_0
    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 1368
    :goto_0
    array-length v4, v2

    const-string v5, "]="

    if-ge v3, v4, :cond_2

    .line 1369
    invoke-static {p1}, Ll/ܽ᩷۠;->֫(Ll/ܽ᩷۠;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, " locals["

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 1370
    :cond_1
    aget-object v4, v2, v3

    invoke-virtual {p1, v4}, Ll/ܽ᩷۠;->֫(Ll/ۙ֨֨;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1373
    :cond_2
    iget-object v2, p0, Ll/᩺ۜ۠;->ܽ:[Ll/ۙ֨֨;

    array-length v3, v2

    invoke-virtual {v0, v3}, Ll/ܶ֨۠;->ۧ(I)V

    .line 1374
    invoke-static {p1}, Ll/ܽ᩷۠;->֫(Ll/ܽ᩷۠;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, " nstack="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v4, v2

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 1375
    :cond_3
    :goto_1
    array-length v0, v2

    if-ge v1, v0, :cond_5

    .line 1376
    invoke-static {p1}, Ll/ܽ᩷۠;->֫(Ll/ܽ᩷۠;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, " stack["

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 1377
    :cond_4
    aget-object v0, v2, v1

    invoke-virtual {p1, v0}, Ll/ܽ᩷۠;->֫(Ll/ۙ֨֨;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_5
    return-void
.end method
