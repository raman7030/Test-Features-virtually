.class public final Ll/ۙ۫᩵;
.super Ll/᩻ۤ᩵;
.source "3ANU"


# instance fields
.field public final ۗ:Ll/᩶۫᩵;

.field public final ۙ:Ll/ۜۗ᩵;


# direct methods
.method public constructor <init>(Ll/᩶۫᩵;Ll/ۜۗ᩵;)V
    .locals 0

    .line 931
    invoke-direct {p0}, Ll/᩻ۤ᩵;-><init>()V

    .line 929
    iput-object p1, p0, Ll/ۙ۫᩵;->ۗ:Ll/᩶۫᩵;

    .line 930
    iput-object p2, p0, Ll/ۙ۫᩵;->ۙ:Ll/ۜۗ᩵;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 965
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ReceiveHasNext@"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ll/ۧ۬᩵;->֫(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ܿܽܽ;)V
    .locals 1

    .line 946
    iget-object v0, p0, Ll/ۙ۫᩵;->ۗ:Ll/᩶۫᩵;

    invoke-virtual {v0, p1}, Ll/᩶۫᩵;->֫(Ljava/lang/Object;)V

    .line 947
    iget-object p1, p0, Ll/ۙ۫᩵;->ۙ:Ll/ۜۗ᩵;

    invoke-virtual {p1}, Ll/ۜۗ᩵;->ᩳ()V

    return-void
.end method

.method public final ֫(Ll/ᩳۤ᩵;)V
    .locals 2

    .line 78
    iget-object v0, p0, Ll/ۙ۫᩵;->ۙ:Ll/ۜۗ᩵;

    invoke-virtual {v0}, Ll/ۜۗ᩵;->ۜ()Ll/ܶۛ᩵;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 957
    iget-object v1, p0, Ll/ۙ۫᩵;->ۗ:Ll/᩶۫᩵;

    invoke-virtual {v1, p1}, Ll/᩶۫᩵;->֫(Ljava/lang/Object;)V

    .line 958
    invoke-virtual {v0}, Ll/ۜۗ᩵;->ᩳ()V

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/ܿܽܽ;)Ll/ܶۛ᩵;
    .locals 1

    .line 963
    iget-object p1, p0, Ll/ۙ۫᩵;->ۗ:Ll/᩶۫᩵;

    iget-object p1, p1, Ll/᩶۫᩵;->֫:Ll/۫۫᩵;

    .line 933
    iget-object p1, p0, Ll/ۙ۫᩵;->ۙ:Ll/ۜۗ᩵;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ۜۗ᩵;->ܽ(Ll/ܺ᩹᩵;)Ll/ܶۛ᩵;

    move-result-object p1

    if-nez p1, :cond_0

    return-object v0

    .line 938
    :cond_0
    sget-object p1, Ll/᩷ۗ᩵;->֫:Ll/ܶۛ᩵;

    return-object p1
.end method
