.class public abstract Ll/ۗۧ֨;
.super Ljava/lang/Object;
.source "K3OA"


# instance fields
.field public ֫:I

.field public final ۧ:Ljava/util/ArrayList;

.field public final ܽ:Ll/۫ۧ֨;

.field public final ܿ:Ljava/lang/Object;

.field public final synthetic ᩳ:Ll/ۤۧ֨;


# direct methods
.method public constructor <init>(Ll/ۤۧ֨;Ll/۫ۧ֨;Ljava/lang/Object;)V
    .locals 0

    .line 706
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗۧ֨;->ᩳ:Ll/ۤۧ֨;

    .line 702
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۗۧ֨;->ۧ:Ljava/util/ArrayList;

    .line 704
    sget p1, Ll/ۢܽ֨;->۠֫:I

    iput p1, p0, Ll/ۗۧ֨;->֫:I

    .line 707
    iput-object p2, p0, Ll/ۗۧ֨;->ܽ:Ll/۫ۧ֨;

    .line 708
    iput-object p3, p0, Ll/ۗۧ֨;->ܿ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 742
    :cond_0
    instance-of v0, p1, Ll/ۗۧ֨;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    .line 743
    :cond_1
    check-cast p1, Ll/ۗۧ֨;

    .line 744
    iget-object v0, p0, Ll/ۗۧ֨;->ܽ:Ll/۫ۧ֨;

    iget-object v2, p1, Ll/ۗۧ֨;->ܽ:Ll/۫ۧ֨;

    if-eq v0, v2, :cond_2

    return v1

    .line 745
    :cond_2
    iget-object v0, p0, Ll/ۗۧ֨;->ܿ:Ljava/lang/Object;

    iget-object p1, p1, Ll/ۗۧ֨;->ܿ:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 2

    .line 750
    iget-object v0, p0, Ll/ۗۧ֨;->ܽ:Ll/۫ۧ֨;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 751
    iget-object v1, p0, Ll/ۗۧ֨;->ܿ:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 757
    invoke-virtual {p0}, Ll/ۗۧ֨;->ܽ()Ljava/lang/String;

    move-result-object v0

    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "<CONSTANT "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ۗۧ֨;->ܽ:Ll/۫ۧ֨;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ">"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/util/ArrayList;
    .locals 1

    .line 724
    iget-object v0, p0, Ll/ۗۧ֨;->ۧ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ֫(Ljava/io/IOException;)V
    .locals 1

    .line 728
    iget-object v0, p0, Ll/ۗۧ֨;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public ֫(Ll/֨۬ۚ;I)V
    .locals 2

    .line 712
    iget-object v0, p0, Ll/ۗۧ֨;->ܽ:Ll/۫ۧ֨;

    invoke-virtual {v0}, Ll/۫ۧ֨;->᩻()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ۗۧ֨;->ᩳ:Ll/ۤۧ֨;

    invoke-virtual {v1, p2, v0}, Ll/ۢܽ֨;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ll/֨۬ۚ;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public ۧ()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ۧ(Ll/֨۬ۚ;I)V
    .locals 2

    .line 716
    iget-object v0, p0, Ll/ۗۧ֨;->ܽ:Ll/۫ۧ֨;

    invoke-virtual {v0}, Ll/۫ۧ֨;->ܿ()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ۗۧ֨;->ᩳ:Ll/ۤۧ֨;

    invoke-virtual {v1, p2, v0}, Ll/ۢܽ֨;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ll/֨۬ۚ;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public ܽ()Ljava/lang/String;
    .locals 1

    .line 736
    iget-object v0, p0, Ll/ۗۧ֨;->ܿ:Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
