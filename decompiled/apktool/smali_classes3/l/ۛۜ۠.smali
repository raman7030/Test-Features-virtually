.class public final Ll/ۛۜ۠;
.super Ll/֫᩷۠;
.source "M664"


# instance fields
.field public final ֫:I

.field public final ۧ:[Ll/ۙ֨֨;

.field public final ܽ:I


# direct methods
.method public constructor <init>(II[Ll/ۙ֨֨;)V
    .locals 0

    .line 1329
    invoke-direct {p0}, Ll/֫᩷۠;-><init>()V

    .line 1330
    iput p1, p0, Ll/ۛۜ۠;->֫:I

    .line 1331
    iput p2, p0, Ll/ۛۜ۠;->ܽ:I

    .line 1332
    iput-object p3, p0, Ll/ۛۜ۠;->ۧ:[Ll/ۙ֨֨;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 1334
    iget v0, p0, Ll/ۛۜ۠;->֫:I

    return v0
.end method

.method public final ֫(Ll/ܽ᩷۠;)V
    .locals 5

    .line 1337
    invoke-super {p0, p1}, Ll/֫᩷۠;->֫(Ll/ܽ᩷۠;)V

    .line 1338
    iget-object v0, p1, Ll/ܽ᩷۠;->ܽ:Ll/ܶ֨۠;

    iget v1, p0, Ll/ۛۜ۠;->ܽ:I

    invoke-virtual {v0, v1}, Ll/ܶ֨۠;->ۧ(I)V

    .line 1339
    invoke-static {p1}, Ll/ܽ᩷۠;->֫(Ll/ܽ᩷۠;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1340
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, " offset_delta="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    .line 1342
    :goto_0
    iget-object v1, p0, Ll/ۛۜ۠;->ۧ:[Ll/ۙ֨֨;

    array-length v2, v1

    if-ge v0, v2, :cond_2

    .line 1343
    invoke-static {p1}, Ll/ܽ᩷۠;->֫(Ll/ܽ᩷۠;)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, " locals["

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "]="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 1344
    :cond_1
    aget-object v1, v1, v0

    invoke-virtual {p1, v1}, Ll/ܽ᩷۠;->֫(Ll/ۙ֨֨;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method
