.class public final Ll/ܳۨ֡;
.super Ll/᩹۟֡;
.source "36B9"


# instance fields
.field public final synthetic ۗ:I

.field public final synthetic ۙ:Ll/᩷ۨ֡;

.field public final synthetic ۫:I

.field public final synthetic ۬:Ljava/util/BitSet;


# direct methods
.method public constructor <init>(Ll/᩷ۨ֡;Ll/۬ۛ֡;IILjava/util/BitSet;I)V
    .locals 0

    .line 161
    iput-object p1, p0, Ll/ܳۨ֡;->ۙ:Ll/᩷ۨ֡;

    iput p4, p0, Ll/ܳۨ֡;->ۗ:I

    iput-object p5, p0, Ll/ܳۨ֡;->۬:Ljava/util/BitSet;

    iput p6, p0, Ll/ܳۨ֡;->۫:I

    invoke-direct {p0, p2, p3}, Ll/᩹۟֡;-><init>(Ll/۬ۛ֡;I)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ᩴۨ֡;)Ljava/lang/Object;
    .locals 7

    .line 164
    iget-object v0, p0, Ll/ܳۨ֡;->ۙ:Ll/᩷ۨ֡;

    iget-object v1, v0, Ll/᩷ۨ֡;->ۧ:Ll/۬ۛ֡;

    invoke-virtual {p1}, Ll/ᩴۨ֡;->ۧ()I

    move-result v2

    const/4 v3, 0x0

    iget v4, p0, Ll/ܳۨ֡;->ۗ:I

    if-lt v2, v4, :cond_0

    .line 165
    invoke-virtual {p0}, Ll/֨᩶ܺ;->ۧ()V

    return-object v3

    .line 168
    :cond_0
    iget-object v2, p0, Ll/ܳۨ֡;->۬:Ljava/util/BitSet;

    if-eqz v2, :cond_1

    invoke-virtual {p1}, Ll/ᩴۨ֡;->ۧ()I

    move-result v5

    iget v6, p0, Ll/ܳۨ֡;->۫:I

    sub-int/2addr v5, v6

    const/4 v6, 0x2

    div-int/2addr v5, v6

    invoke-virtual {v2, v5}, Ljava/util/BitSet;->get(I)Z

    move-result v2

    if-nez v2, :cond_1

    .line 169
    new-instance v0, Ll/ۡ᩺֡;

    sget-object v2, Ll/֨ۗ֡;->ۖܳ:Ll/֨ۗ֡;

    invoke-virtual {p1}, Ll/ᩴۨ֡;->ۧ()I

    move-result v3

    .line 44
    invoke-direct {v0, v1, v2, v3}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    .line 170
    invoke-virtual {p1, v6}, Ll/ᩴۨ֡;->֫(I)V

    return-object v0

    .line 174
    :cond_1
    invoke-static {v1, p1}, Ll/ۢܰ֡;->֫(Ll/۬ۛ֡;Ll/ᩴۨ֡;)Ll/ۢܰ֡;

    move-result-object v1

    .line 177
    invoke-virtual {p1}, Ll/ᩴۨ֡;->ۧ()I

    move-result p1

    if-gt p1, v4, :cond_2

    if-ltz p1, :cond_2

    return-object v1

    .line 179
    :cond_2
    new-instance p1, Ll/ܶ᩵ۚ;

    iget-object v0, v0, Ll/᩷ۨ֡;->ᩳ:Ll/ܽۨ֡;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-string v0, "The last instruction in method %s is truncated"

    .line 46
    invoke-direct {p1, v3, v0, v1}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    throw p1
.end method
