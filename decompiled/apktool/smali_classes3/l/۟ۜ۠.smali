.class public final Ll/۟ۜ۠;
.super Ll/֫᩷۠;
.source "M664"


# instance fields
.field public final ֫:I

.field public final ۧ:Ll/ۙ֨֨;


# direct methods
.method public constructor <init>(ILl/ۙ֨֨;)V
    .locals 0

    .line 1282
    invoke-direct {p0}, Ll/֫᩷۠;-><init>()V

    .line 1283
    iput p1, p0, Ll/۟ۜ۠;->֫:I

    .line 1284
    iput-object p2, p0, Ll/۟ۜ۠;->ۧ:Ll/ۙ֨֨;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 1287
    iget v0, p0, Ll/۟ۜ۠;->֫:I

    const/16 v1, 0x40

    if-ge v0, v1, :cond_0

    add-int/2addr v0, v1

    return v0

    :cond_0
    const/16 v0, 0xf7

    return v0
.end method

.method public final ֫(Ll/ܽ᩷۠;)V
    .locals 4

    .line 1293
    invoke-super {p0, p1}, Ll/֫᩷۠;->֫(Ll/ܽ᩷۠;)V

    .line 1294
    invoke-virtual {p0}, Ll/۟ۜ۠;->֫()I

    move-result v0

    const/16 v1, 0xf7

    if-ne v0, v1, :cond_0

    .line 1295
    iget-object v0, p1, Ll/ܽ᩷۠;->ܽ:Ll/ܶ֨۠;

    iget v1, p0, Ll/۟ۜ۠;->֫:I

    invoke-virtual {v0, v1}, Ll/ܶ֨۠;->ۧ(I)V

    .line 1296
    invoke-static {p1}, Ll/ܽ᩷۠;->֫(Ll/ܽ᩷۠;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1297
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, " offset_delta="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 1300
    :cond_0
    invoke-static {p1}, Ll/ܽ᩷۠;->֫(Ll/ܽ᩷۠;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1301
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, " stack[0]="

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 1303
    :cond_1
    iget-object v0, p0, Ll/۟ۜ۠;->ۧ:Ll/ۙ֨֨;

    invoke-virtual {p1, v0}, Ll/ܽ᩷۠;->֫(Ll/ۙ֨֨;)V

    return-void
.end method
