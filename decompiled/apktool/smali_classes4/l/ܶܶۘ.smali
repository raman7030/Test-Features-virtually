.class public final Ll/ܶܶۘ;
.super Ljava/lang/Object;
.source "51RR"

# interfaces
.implements Ll/ۙܶۘ;


# instance fields
.field public ֫:Ll/ᩴ۟᩵;

.field public ۧ:Ljava/lang/String;

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:I


# direct methods
.method public constructor <init>(Ll/ᩴ۟᩵;I)V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Ll/ܶܶۘ;->ۧ:Ljava/lang/String;

    .line 23
    iput-object p1, p0, Ll/ܶܶۘ;->֫:Ll/ᩴ۟᩵;

    .line 24
    iput p2, p0, Ll/ܶܶۘ;->ᩳ:I

    .line 25
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result p2

    iput p2, p0, Ll/ܶܶۘ;->ܽ:I

    .line 26
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->֫()Ll/֡۟᩵;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 28
    invoke-virtual {p1}, Ll/֡۟᩵;->ᩳ()J

    move-result-wide p1

    long-to-int p2, p1

    iput p2, p0, Ll/ܶܶۘ;->ܿ:I

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 30
    iput p1, p0, Ll/ܶܶۘ;->ܿ:I

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Ll/ܶܶۘ;->ۧ:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 37
    iget-object v0, p0, Ll/ܶܶۘ;->֫:Ll/ᩴ۟᩵;

    invoke-virtual {v0}, Ll/ᩴ۟᩵;->֫()Ll/֡۟᩵;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 39
    invoke-virtual {v0}, Ll/֡۟᩵;->ۜ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ܶܶۘ;->ۧ:Ljava/lang/String;

    .line 41
    :cond_0
    iget-object v0, p0, Ll/ܶܶۘ;->ۧ:Ljava/lang/String;

    if-nez v0, :cond_1

    const-string v0, ""

    .line 42
    iput-object v0, p0, Ll/ܶܶۘ;->ۧ:Ljava/lang/String;

    .line 45
    :cond_1
    iget-object v0, p0, Ll/ܶܶۘ;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final b()I
    .locals 1

    .line 50
    iget v0, p0, Ll/ܶܶۘ;->ܿ:I

    return v0
.end method

.method public final c()I
    .locals 1

    .line 55
    iget v0, p0, Ll/ܶܶۘ;->ᩳ:I

    return v0
.end method

.method public final d()I
    .locals 1

    .line 60
    iget v0, p0, Ll/ܶܶۘ;->ܽ:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 94
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "d@"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܶܶۘ;->ۧ:Ljava/lang/String;

    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ܶܶۘ;->ܽ:I

    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ܶܶۘ;->ᩳ:I

    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ܶܶۘ;->ܿ:I

    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 100
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
