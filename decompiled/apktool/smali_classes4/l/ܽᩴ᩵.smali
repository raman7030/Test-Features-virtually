.class public Ll/ܽᩴ᩵;
.super Ljava/lang/Object;
.source "09W2"

# interfaces
.implements Ll/ܳۚ᩵;


# instance fields
.field public ᩶:I

.field public ᩸:Ljava/lang/String;

.field public ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Ll/ܽᩴ᩵;->᩸:Ljava/lang/String;

    const/4 p1, 0x0

    .line 55
    iput p1, p0, Ll/ܽᩴ᩵;->᩶:I

    const/4 p1, 0x0

    .line 56
    iput-object p1, p0, Ll/ܽᩴ᩵;->᩹:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 129
    instance-of v0, p1, Ll/ܽᩴ᩵;

    if-eqz v0, :cond_0

    .line 130
    check-cast p1, Ll/ܽᩴ᩵;

    .line 131
    iget-object v0, p0, Ll/ܽᩴ᩵;->᩸:Ljava/lang/String;

    iget-object p1, p1, Ll/ܽᩴ᩵;->᩸:Ljava/lang/String;

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getAttributes()I
    .locals 1

    const/16 v0, 0x11

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Ll/ܽᩴ᩵;->᩸:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()I
    .locals 2

    .line 82
    iget v0, p0, Ll/ܽᩴ᩵;->᩶:I

    const v1, 0xffff

    and-int/2addr v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/16 v0, 0x8

    return v0

    :cond_0
    const/16 v0, 0x10

    return v0

    :cond_1
    const/16 v0, 0x20

    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 139
    iget-object v0, p0, Ll/ܽᩴ᩵;->᩸:Ljava/lang/String;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final length()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 145
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SmbShareInfo[netName="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ܽᩴ᩵;->᩸:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",type=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ܽᩴ᩵;->᩶:I

    const/16 v3, 0x8

    const-string v4, ",remark="

    .line 0
    invoke-static {v2, v3, v4, v1}, Ll/ᩴ᩸ܿ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 146
    iget-object v2, p0, Ll/ܽᩴ᩵;->᩹:Ljava/lang/String;

    const-string v3, "]"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 146
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۚ()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final ܽ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
