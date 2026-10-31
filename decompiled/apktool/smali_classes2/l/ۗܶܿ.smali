.class public final Ll/ۗܶܿ;
.super Ljava/lang/Object;
.source "49SV"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public ۙ:I

.field public ᩶:I

.field public ᩸:I

.field public ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(IIILjava/lang/String;)V
    .locals 0

    .line 370
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 371
    iput p1, p0, Ll/ۗܶܿ;->᩶:I

    .line 372
    iput p2, p0, Ll/ۗܶܿ;->ۙ:I

    .line 373
    iput p3, p0, Ll/ۗܶܿ;->᩸:I

    .line 374
    iput-object p4, p0, Ll/ۗܶܿ;->᩹:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۗܶܿ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗܶܿ;->᩹:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ۗܶܿ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۗܶܿ;->᩶:I

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۗܶܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۗܶܿ;->᩶:I

    return p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 409
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MtExtras{mode="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ۗܶܿ;->᩶:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", uid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۗܶܿ;->ۙ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", gid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۗܶܿ;->᩸:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", link=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۗܶܿ;->᩹:Ljava/lang/String;

    const-string v2, "\'}"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 399
    iget v0, p0, Ll/ۗܶܿ;->᩸:I

    return v0
.end method

.method public final ۧ()C
    .locals 1

    .line 382
    iget v0, p0, Ll/ۗܶܿ;->᩶:I

    invoke-static {v0}, Ll/ۧ۠᩵;->֫(I)C

    move-result v0

    return v0
.end method

.method public final ܳ()I
    .locals 1

    .line 395
    iget v0, p0, Ll/ۗܶܿ;->ۙ:I

    return v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 403
    iget-object v0, p0, Ll/ۗܶܿ;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final ܿ()I
    .locals 1

    .line 391
    iget v0, p0, Ll/ۗܶܿ;->᩶:I

    and-int/lit16 v0, v0, 0xfff

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 378
    iget v0, p0, Ll/ۗܶܿ;->᩶:I

    return v0
.end method
