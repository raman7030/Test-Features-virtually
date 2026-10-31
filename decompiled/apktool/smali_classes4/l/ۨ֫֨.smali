.class public abstract Ll/ۨ֫֨;
.super Ll/ۢܽ֨;
.source "T7EH"


# instance fields
.field public ۗ֫:I

.field public ۙ֫:I

.field public ۛ֫:Ll/ܰۗۚ;

.field public ۟֫:Ll/ۤۧ֨;

.field public ۤ֫:Ll/᩹֫֨;

.field public ۨ֫:I

.field public ۫֫:Ll/᩶֫֨;

.field public ۬֫:Ljava/util/function/Supplier;

.field public ܰ֫:Ll/ۛ֫֨;

.field public ᩺֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩷ۧ֨;Ll/֨۟ۚ;)V
    .locals 2

    .line 67
    iget-object v0, p1, Ll/ۢܽ֨;->֡֫:Ll/֨۬ۚ;

    invoke-direct {p0, v0}, Ll/ۢܽ֨;-><init>(Ll/֨۬ۚ;)V

    const/4 v0, 0x0

    .line 49
    iput v0, p0, Ll/ۨ֫֨;->ۙ֫:I

    const/4 v1, 0x0

    .line 51
    iput-object v1, p0, Ll/ۨ֫֨;->᩺֫:Ljava/lang/String;

    .line 57
    iput v0, p0, Ll/ۨ֫֨;->ۨ֫:I

    .line 61
    new-instance v0, Ll/᩹֫֨;

    invoke-direct {v0, p0}, Ll/᩹֫֨;-><init>(Ll/ۨ֫֨;)V

    iput-object v0, p0, Ll/ۨ֫֨;->ۤ֫:Ll/᩹֫֨;

    .line 63
    new-instance v0, Ll/᩶֫֨;

    invoke-direct {v0, p0}, Ll/᩶֫֨;-><init>(Ll/ۨ֫֨;)V

    iput-object v0, p0, Ll/ۨ֫֨;->۫֫:Ll/᩶֫֨;

    .line 68
    iget-object v0, p1, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    iput-object v0, p0, Ll/ۨ֫֨;->۟֫:Ll/ۤۧ֨;

    .line 69
    iget-object p1, p1, Ll/ۨܽ֨;->ۤ֫:Ll/ۨܽ֨;

    check-cast p1, Ll/᩷ۧ֨;

    iget-object p1, p1, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    invoke-virtual {p1}, Ll/᩶ۗۚ;->ۧ()Ll/ܰۗۚ;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ֫֨;->ۛ֫:Ll/ܰۗۚ;

    .line 70
    iput-object p2, p0, Ll/ۢܽ֨;->᩵֫:Ll/֨۟ۚ;

    .line 71
    sget-object p1, Ll/ۤ֫֨;->֫:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    const/4 p2, 0x1

    const/4 v0, 0x2

    if-eq p1, p2, :cond_2

    if-eq p1, v0, :cond_1

    const/4 p2, 0x3

    if-ne p1, p2, :cond_0

    const/4 p1, 0x4

    .line 83
    iput p1, p0, Ll/ۨ֫֨;->ۙ֫:I

    .line 84
    new-instance p1, Ll/۬֫֨;

    invoke-direct {p1, p0}, Ll/۬֫֨;-><init>(Ll/ۨ֫֨;)V

    iput-object p1, p0, Ll/ۨ֫֨;->۬֫:Ljava/util/function/Supplier;

    .line 85
    new-instance p1, Ll/۫֫֨;

    invoke-direct {p1, p0}, Ll/۫֫֨;-><init>(Ll/ۨ֫֨;)V

    iput-object p1, p0, Ll/ۨ֫֨;->ܰ֫:Ll/ۛ֫֨;

    return-void

    .line 87
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    iget-object p2, p0, Ll/ۢܽ֨;->᩵֫:Ll/֨۟ۚ;

    .line 88
    invoke-virtual {p2}, Ll/֨۟ۚ;->᩻()Ljava/lang/String;

    move-result-object p2

    const-string v0, "Implementation of \""

    const-string v1, "\" is not supported"

    .line 0
    invoke-static {v0, p2, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 88
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 78
    :cond_1
    iput v0, p0, Ll/ۨ֫֨;->ۙ֫:I

    .line 79
    new-instance p1, Ll/᩹ܿ֨;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Ll/᩹ܿ֨;-><init>(Ll/ۢܽ֨;I)V

    iput-object p1, p0, Ll/ۨ֫֨;->۬֫:Ljava/util/function/Supplier;

    .line 80
    new-instance p1, Ll/ۗ֫֨;

    invoke-direct {p1, p0}, Ll/ۗ֫֨;-><init>(Ll/ۨ֫֨;)V

    iput-object p1, p0, Ll/ۨ֫֨;->ܰ֫:Ll/ۛ֫֨;

    return-void

    .line 73
    :cond_2
    iput v0, p0, Ll/ۨ֫֨;->ۙ֫:I

    .line 74
    new-instance p1, Ll/᩸ܿ֨;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Ll/᩸ܿ֨;-><init>(Ll/ۢܽ֨;I)V

    iput-object p1, p0, Ll/ۨ֫֨;->۬֫:Ljava/util/function/Supplier;

    .line 75
    new-instance p1, Ll/ۙ֫֨;

    invoke-direct {p1, p0}, Ll/ۙ֫֨;-><init>(Ll/ۨ֫֨;)V

    iput-object p1, p0, Ll/ۨ֫֨;->ܰ֫:Ll/ۛ֫֨;

    return-void
.end method


# virtual methods
.method public abstract ֨()Ljava/lang/String;
.end method

.method public final ֫(ILjava/io/DataInputStream;)V
    .locals 6

    .line 93
    iget v0, p0, Ll/ۨ֫֨;->ۙ֫:I

    if-eq p1, v0, :cond_1

    .line 94
    iget-boolean v0, p0, Ll/ۢܽ֨;->᩹:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    const-string v4, "{0}: Invalid attribute length #{1}"

    iget-object v5, p0, Ll/ۨ֫֨;->ۛ֫:Ll/ܰۗۚ;

    if-eqz v0, :cond_0

    .line 95
    iget-object v0, p0, Ll/ۢܽ֨;->᩵֫:Ll/֨۟ۚ;

    .line 96
    invoke-virtual {v0}, Ll/֨۟ۚ;->֫()Ll/ۙ۬ۚ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۙ۬ۚ;->ܿ()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v2

    aput-object p1, v3, v1

    .line 95
    invoke-virtual {v5, v4, v3}, Ll/ܰۗۚ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 98
    :cond_0
    new-instance p2, Ll/ۙۗۚ;

    iget-object v0, p0, Ll/ۢܽ֨;->᩵֫:Ll/֨۟ۚ;

    .line 100
    invoke-virtual {v0}, Ll/֨۟ۚ;->֫()Ll/ۙ۬ۚ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۙ۬ۚ;->ܿ()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v2

    aput-object p1, v3, v1

    invoke-direct {p2, v5, v4, v3}, Ll/ۙۗۚ;-><init>(Ll/ܰۗۚ;Ljava/lang/String;[Ljava/lang/Object;)V

    throw p2

    .line 103
    :cond_1
    :goto_0
    invoke-virtual {p2}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result p1

    iput p1, p0, Ll/ۨ֫֨;->ۗ֫:I

    .line 104
    iget-object p1, p0, Ll/ۢܽ֨;->᩵֫:Ll/֨۟ۚ;

    sget-object v0, Ll/֨۟ۚ;->ۛ:Ll/֨۟ۚ;

    if-ne p1, v0, :cond_2

    .line 105
    invoke-virtual {p2}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result p1

    iput p1, p0, Ll/ۨ֫֨;->ۨ֫:I

    :cond_2
    return-void
.end method

.method public final ۚ()V
    .locals 0

    .line 131
    invoke-virtual {p0}, Ll/ۨ֫֨;->ᩴ()V

    return-void
.end method

.method public final ᩴ()V
    .locals 2

    .line 112
    invoke-virtual {p0}, Ll/ۨ֫֨;->֨()Ljava/lang/String;

    .line 113
    iget-object v0, p0, Ll/ۢܽ֨;->᩵֫:Ll/֨۟ۚ;

    invoke-virtual {v0}, Ll/֨۟ۚ;->ۧ()Ll/ܶۨۚ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶۨۚ;->᩷()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ll/ۢܽ֨;->ۡ()I

    move-result v1

    invoke-virtual {p0, v1, v0}, Ll/ۢܽ֨;->ܽ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ܽ(Ljava/lang/String;)V

    .line 114
    iget-boolean v0, p0, Ll/ۢܽ֨;->֫֫:Z

    if-eqz v0, :cond_1

    .line 115
    iget-boolean v0, p0, Ll/ۢܽ֨;->ܺ֫:Z

    if-eqz v0, :cond_0

    .line 116
    iget-object v0, p0, Ll/ۨ֫֨;->ۤ֫:Ll/᩹֫֨;

    invoke-virtual {v0}, Ll/᩹֫֨;->ۧ()V

    return-void

    .line 118
    :cond_0
    iget-object v0, p0, Ll/ۨ֫֨;->۫֫:Ll/᩶֫֨;

    invoke-virtual {v0}, Ll/᩶֫֨;->ۧ()V

    return-void

    .line 121
    :cond_1
    iget-object v0, p0, Ll/ۨ֫֨;->ܰ֫:Ll/ۛ֫֨;

    invoke-interface {v0}, Ll/ۛ֫֨;->ۧ()V

    return-void
.end method
