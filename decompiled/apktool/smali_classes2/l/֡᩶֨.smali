.class public final Ll/֡᩶֨;
.super Ljava/lang/Object;
.source "I7LP"


# instance fields
.field public ֫:I

.field public ۧ:Ll/ܳ۠۠;


# direct methods
.method public constructor <init>(Ll/ۚ᩶֨;Ll/ۚۚ۠;)V
    .locals 0

    .line 734
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 735
    iget p2, p2, Ll/ۚۚ۠;->᩸:I

    iput p2, p0, Ll/֡᩶֨;->֫:I

    .line 736
    invoke-static {p1}, Ll/ۚ᩶֨;->ᩳ(Ll/ۚ᩶֨;)Ll/᩹ܶ۠;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۖ֨۠;->֫()Ll/ܳ۠۠;

    move-result-object p1

    iput-object p1, p0, Ll/֡᩶֨;->ۧ:Ll/ܳ۠۠;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 748
    instance-of v0, p1, Ll/֡᩶֨;

    if-eqz v0, :cond_0

    .line 746
    check-cast p1, Ll/֡᩶֨;

    iget v0, p0, Ll/֡᩶֨;->֫:I

    iget v1, p1, Ll/֡᩶֨;->֫:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/֡᩶֨;->ۧ:Ll/ܳ۠۠;

    iget-object p1, p1, Ll/֡᩶֨;->ۧ:Ll/ܳ۠۠;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 741
    iget-object v0, p0, Ll/֡᩶֨;->ۧ:Ll/ܳ۠۠;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit8 v0, v0, 0x10

    iget v1, p0, Ll/֡᩶֨;->֫:I

    shl-int v0, v1, v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 753
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/֡᩶֨;->ۧ:Ll/ܳ۠۠;

    invoke-virtual {v1}, Ll/ܳ۠۠;->֫()Ll/ᩳ᩶۠;

    move-result-object v2

    invoke-interface {v2}, Ll/۟᩹۠;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " @ "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/֡᩶֨;->֫:I

    invoke-virtual {v1, v2}, Ll/ܳ۠۠;->ۧ(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
