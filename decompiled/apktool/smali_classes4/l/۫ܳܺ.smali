.class public final Ll/۫ܳܺ;
.super Ll/ۨܿܺ;
.source "2BD5"


# static fields
.field public static final ֫:Ll/۫ܳܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 37
    new-instance v0, Ll/۫ܳܺ;

    .line 36
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 37
    sput-object v0, Ll/۫ܳܺ;->֫:Ll/۫ܳܺ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final ֫(Ll/ۤܿܺ;)Ljava/lang/String;
    .locals 3

    .line 52
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v0

    .line 53
    check-cast p1, Ll/᩸ܿܺ;

    invoke-virtual {p1}, Ll/᩸ܿܺ;->ۖ()Ll/ܰۡܺ;

    move-result-object p1

    check-cast p1, Ll/֨ܺܺ;

    .line 55
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸ۡܺ;->۠()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ll/ۨܿܺ;->֫(Ll/֨ܺܺ;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۙܿܺ;)Ljava/util/BitSet;
    .locals 2

    .line 115
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object p1

    .line 116
    new-instance v0, Ljava/util/BitSet;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    const/4 v1, 0x0

    .line 118
    invoke-virtual {p1, v1}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result p1

    invoke-static {p1}, Ll/ۨܿܺ;->֫(I)Z

    move-result p1

    invoke-virtual {v0, v1, p1}, Ljava/util/BitSet;->set(IZ)V

    return-object v0
.end method

.method public final ֫(Ll/ᩳᩴܺ;Ll/ۤܿܺ;)V
    .locals 5

    .line 127
    invoke-virtual {p2}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v0

    .line 128
    move-object v1, p2

    check-cast v1, Ll/᩸ܿܺ;

    invoke-virtual {v1}, Ll/᩸ܿܺ;->ۖ()Ll/ܰۡܺ;

    move-result-object v1

    check-cast v1, Ll/֨ܺܺ;

    const/4 v2, 0x0

    .line 132
    invoke-virtual {v0, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩸ۡܺ;->ۧ()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    .line 133
    invoke-virtual {v1}, Ll/֨ܺܺ;->ᩴ()I

    move-result v1

    ushr-int/lit8 v1, v1, 0x10

    goto :goto_0

    .line 135
    :cond_0
    invoke-virtual {v1}, Ll/֨ܺܺ;->֡()J

    move-result-wide v3

    const/16 v1, 0x30

    ushr-long/2addr v3, v1

    long-to-int v1, v3

    :goto_0
    int-to-short v1, v1

    .line 138
    invoke-virtual {v0, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    invoke-static {p2, v0}, Ll/ۨܿܺ;->֫(Ll/ۙܿܺ;I)S

    move-result p2

    invoke-static {p1, p2, v1}, Ll/ۨܿܺ;->֫(Ll/ۛۘܺ;SS)V

    return-void
.end method

.method public final ۧ(Ll/ۤܿܺ;)Ljava/lang/String;
    .locals 2

    .line 63
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v0

    .line 64
    check-cast p1, Ll/᩸ܿܺ;

    invoke-virtual {p1}, Ll/᩸ܿܺ;->ۖ()Ll/ܰۡܺ;

    move-result-object p1

    check-cast p1, Ll/֨ܺܺ;

    const/4 v1, 0x0

    .line 68
    invoke-virtual {v0, v1}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸ۡܺ;->ۧ()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/16 v0, 0x20

    goto :goto_0

    :cond_0
    const/16 v0, 0x40

    .line 67
    :goto_0
    invoke-static {p1, v0}, Ll/ۨܿܺ;->֫(Ll/֨ܺܺ;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/ۙܿܺ;)Z
    .locals 6

    .line 84
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v0

    .line 85
    instance-of v1, p1, Ll/᩸ܿܺ;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 86
    invoke-virtual {v0}, Ll/ܿᩴܺ;->size()I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_3

    .line 87
    invoke-virtual {v0, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v1

    invoke-static {v1}, Ll/ۨܿܺ;->֫(I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 91
    :cond_0
    check-cast p1, Ll/᩸ܿܺ;

    .line 92
    invoke-virtual {p1}, Ll/᩸ܿܺ;->ۖ()Ll/ܰۡܺ;

    move-result-object p1

    .line 94
    instance-of v1, p1, Ll/֨ܺܺ;

    if-nez v1, :cond_1

    goto :goto_1

    .line 98
    :cond_1
    check-cast p1, Ll/֨ܺܺ;

    .line 101
    invoke-virtual {v0, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸ۡܺ;->ۧ()I

    move-result v0

    if-ne v0, v3, :cond_2

    .line 102
    invoke-virtual {p1}, Ll/֨ܺܺ;->ᩴ()I

    move-result p1

    const v0, 0xffff

    and-int/2addr p1, v0

    if-nez p1, :cond_3

    goto :goto_0

    .line 105
    :cond_2
    invoke-virtual {p1}, Ll/֨ܺܺ;->֡()J

    move-result-wide v0

    const-wide v4, 0xffffffffffffL

    and-long/2addr v0, v4

    const-wide/16 v4, 0x0

    cmp-long p1, v0, v4

    if-nez p1, :cond_3

    :goto_0
    return v3

    :cond_3
    :goto_1
    return v2
.end method
