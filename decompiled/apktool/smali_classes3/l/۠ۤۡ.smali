.class public final Ll/۠ۤۡ;
.super Ljava/lang/Object;
.source "TATF"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 313
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 314
    iput p1, p0, Ll/۠ۤۡ;->ۧ:I

    .line 315
    iput p2, p0, Ll/۠ۤۡ;->֫:I

    .line 316
    iput-object p3, p0, Ll/۠ۤۡ;->ܽ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 322
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/۠ۤۡ;->ۧ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/۠ۤۡ;->֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") => "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۠ۤۡ;->ܽ:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 330
    iget v0, p0, Ll/۠ۤۡ;->֫:I

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 326
    iget v0, p0, Ll/۠ۤۡ;->ۧ:I

    return v0
.end method

.method public final ܽ()Ljava/lang/Object;
    .locals 1

    .line 334
    iget-object v0, p0, Ll/۠ۤۡ;->ܽ:Ljava/lang/Object;

    return-object v0
.end method
