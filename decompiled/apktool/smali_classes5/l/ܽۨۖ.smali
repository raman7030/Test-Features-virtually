.class public Ll/ܽۨۖ;
.super Ll/֨֫ۘ;
.source "R9K4"


# instance fields
.field public ܽ:Ll/۬ۛۖ;

.field public ᩳ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 32
    new-instance v0, Ll/᩻ۨۖ;

    invoke-direct {v0}, Ll/᩻ۨۖ;-><init>()V

    invoke-direct {p0, v0}, Ll/֨֫ۘ;-><init>(Ll/ۚ֫ۘ;)V

    return-void
.end method

.method public constructor <init>(ILl/᩹ۛۖ;Ll/᩺ۛۖ;JJ)V
    .locals 1

    .line 44
    new-instance v0, Ll/᩻ۨۖ;

    invoke-direct {v0}, Ll/᩻ۨۖ;-><init>()V

    invoke-direct {p0, v0}, Ll/֨֫ۘ;-><init>(Ll/ۚ֫ۘ;)V

    .line 45
    iput p1, p0, Ll/ܽۨۖ;->ᩳ:I

    .line 46
    invoke-virtual {v0, p2}, Ll/᩻ۨۖ;->֫(Ll/᩹ۛۖ;)V

    .line 47
    iget-object p1, p0, Ll/֨֫ۘ;->ۧ:Ll/ۚ֫ۘ;

    check-cast p1, Ll/᩻ۨۖ;

    invoke-virtual {p1, p3}, Ll/᩻ۨۖ;->֫(Ll/᩺ۛۖ;)V

    .line 48
    iget-object p1, p0, Ll/֨֫ۘ;->ۧ:Ll/ۚ֫ۘ;

    check-cast p1, Ll/᩻ۨۖ;

    invoke-virtual {p1, p4, p5}, Ll/᩻ۨۖ;->ܽ(J)V

    .line 49
    iget-object p1, p0, Ll/֨֫ۘ;->ۧ:Ll/ۚ֫ۘ;

    check-cast p1, Ll/᩻ۨۖ;

    invoke-virtual {p1, p6, p7}, Ll/᩻ۨۖ;->ᩳ(J)V

    return-void
.end method

.method public constructor <init>(Ll/᩹ۛۖ;Ll/᩺ۛۖ;)V
    .locals 8

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/16 v1, 0x19

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    .line 36
    invoke-direct/range {v0 .. v7}, Ll/ܽۨۖ;-><init>(ILl/᩹ۛۖ;Ll/᩺ۛۖ;JJ)V

    return-void
.end method

.method public constructor <init>(Ll/᩹ۛۖ;Ll/᩺ۛۖ;J)V
    .locals 8

    const/4 v1, 0x4

    const-wide/16 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    .line 40
    invoke-direct/range {v0 .. v7}, Ll/ܽۨۖ;-><init>(ILl/᩹ۛۖ;Ll/᩺ۛۖ;JJ)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    .line 163
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/֨֫ۘ;->ۧ:Ll/ۚ֫ۘ;

    check-cast v1, Ll/᩻ۨۖ;

    invoke-virtual {v1}, Ll/᩻ۨۖ;->᩻()Ll/᩺ۛۖ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " with message id << "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/֨֫ۘ;->ۧ:Ll/ۚ֫ۘ;

    check-cast v1, Ll/᩻ۨۖ;

    invoke-virtual {v1}, Ll/᩻ۨۖ;->ۜ()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " >>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/֡֫ۘ;
    .locals 1

    .line 66
    iget-object v0, p0, Ll/֨֫ۘ;->֫:Ll/֡֫ۘ;

    return-object v0
.end method

.method public bridge synthetic ֫(Ll/֡֫ۘ;)V
    .locals 0

    .line 25
    invoke-virtual {p0, p1}, Ll/ܽۨۖ;->ܽ(Ll/֡֫ۘ;)V

    return-void
.end method

.method public final ֫(Ll/ᩳۨۖ;)V
    .locals 1

    .line 87
    invoke-virtual {p1}, Ll/۠֫ۘ;->֫()Ll/֡֫ۘ;

    move-result-object v0

    iput-object v0, p0, Ll/֨֫ۘ;->֫:Ll/֡֫ۘ;

    .line 88
    invoke-virtual {p1}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object p1

    iput-object p1, p0, Ll/֨֫ۘ;->ۧ:Ll/ۚ֫ۘ;

    .line 89
    iget-object p1, p0, Ll/֨֫ۘ;->֫:Ll/֡֫ۘ;

    invoke-virtual {p0, p1}, Ll/ܽۨۖ;->ۧ(Ll/֡֫ۘ;)V

    .line 90
    iget-object p1, p0, Ll/֨֫ۘ;->֫:Ll/֡֫ۘ;

    iget-object v0, p0, Ll/֨֫ۘ;->ۧ:Ll/ۚ֫ۘ;

    check-cast v0, Ll/᩻ۨۖ;

    invoke-virtual {v0}, Ll/᩻ۨۖ;->ۧ()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ᩳ(I)V

    return-void
.end method

.method public ۧ(Ll/֡֫ۘ;)V
    .locals 1

    .line 107
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Should be implemented by specific message type"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(Ll/ᩳۨۖ;)V
    .locals 2

    .line 94
    invoke-virtual {p1}, Ll/۠֫ۘ;->֫()Ll/֡֫ۘ;

    move-result-object v0

    iput-object v0, p0, Ll/֨֫ۘ;->֫:Ll/֡֫ۘ;

    .line 95
    invoke-virtual {p1}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object p1

    iput-object p1, p0, Ll/֨֫ۘ;->ۧ:Ll/ۚ֫ۘ;

    .line 96
    new-instance p1, Ll/۬ۛۖ;

    invoke-direct {p1}, Ll/۬ۛۖ;-><init>()V

    iget-object v0, p0, Ll/֨֫ۘ;->ۧ:Ll/ۚ֫ۘ;

    check-cast v0, Ll/᩻ۨۖ;

    iget-object v1, p0, Ll/֨֫ۘ;->֫:Ll/֡֫ۘ;

    invoke-virtual {p1, v0, v1}, Ll/۬ۛۖ;->֫(Ll/᩻ۨۖ;Ll/֡֫ۘ;)V

    iput-object p1, p0, Ll/ܽۨۖ;->ܽ:Ll/۬ۛۖ;

    .line 97
    iget-object p1, p0, Ll/֨֫ۘ;->֫:Ll/֡֫ۘ;

    iget-object v0, p0, Ll/֨֫ۘ;->ۧ:Ll/ۚ֫ۘ;

    check-cast v0, Ll/᩻ۨۖ;

    invoke-virtual {v0}, Ll/᩻ۨۖ;->ۧ()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ᩳ(I)V

    return-void
.end method

.method public ܳ()Ll/ܽۨۖ;
    .locals 0

    return-object p0
.end method

.method public ܽ(Ll/֡֫ۘ;)V
    .locals 1

    .line 71
    iput-object p1, p0, Ll/֨֫ۘ;->֫:Ll/֡֫ۘ;

    .line 72
    iget-object v0, p0, Ll/֨֫ۘ;->ۧ:Ll/ۚ֫ۘ;

    check-cast v0, Ll/᩻ۨۖ;

    invoke-virtual {v0, p1}, Ll/᩻ۨۖ;->ۧ(Ll/֡֫ۘ;)V

    .line 73
    invoke-virtual {p0, p1}, Ll/ܽۨۖ;->ᩳ(Ll/֡֫ۘ;)V

    .line 74
    iget-object v0, p0, Ll/֨֫ۘ;->ۧ:Ll/ۚ֫ۘ;

    check-cast v0, Ll/᩻ۨۖ;

    invoke-virtual {p1}, Ll/ۤܰۖ;->ܺ()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/᩻ۨۖ;->ܽ(I)V

    return-void
.end method

.method public ܿ()I
    .locals 1

    const/high16 v0, 0x10000

    return v0
.end method

.method public final ᩳ()Ll/۬ۛۖ;
    .locals 1

    .line 145
    iget-object v0, p0, Ll/ܽۨۖ;->ܽ:Ll/۬ۛۖ;

    return-object v0
.end method

.method public ᩳ(Ll/֡֫ۘ;)V
    .locals 1

    .line 83
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Should be implemented by specific message type"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ᩻()Z
    .locals 1

    .line 116
    iget-object v0, p0, Ll/ܽۨۖ;->ܽ:Ll/۬ۛۖ;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
