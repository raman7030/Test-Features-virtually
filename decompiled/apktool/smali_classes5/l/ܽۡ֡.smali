.class public Ll/ܽۡ֡;
.super Ll/ۜۡ֡;
.source "B7IH"


# static fields
.field public static final synthetic ۗ:I


# instance fields
.field public final ۙ:Ll/ܰۢ֡;

.field public final ᩶:Ljava/util/function/UnaryOperator;

.field public final ᩹:Ll/ۖۡ֡;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ll/ۧۡ֡;)V
    .locals 1

    .line 186
    invoke-direct {p0, p1}, Ll/ۜۡ֡;-><init>(Ll/ۧۡ֡;)V

    .line 187
    invoke-virtual {p1}, Ll/֫ۡ֡;->ᩳ()Ll/ܰۢ֡;

    move-result-object v0

    iput-object v0, p0, Ll/ܽۡ֡;->ۙ:Ll/ܰۢ֡;

    .line 188
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    invoke-virtual {p1}, Ll/֫ۡ֡;->֫()Ll/ۖۡ֡;

    move-result-object v0

    iput-object v0, p0, Ll/ܽۡ֡;->᩹:Ll/ۖۡ֡;

    .line 190
    invoke-virtual {p1}, Ll/֫ۡ֡;->ۧ()Ljava/util/function/UnaryOperator;

    move-result-object p1

    iput-object p1, p0, Ll/ܽۡ֡;->᩶:Ljava/util/function/UnaryOperator;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 257
    :cond_0
    instance-of v0, p1, Ll/ܽۡ֡;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 260
    :cond_1
    check-cast p1, Ll/ܽۡ֡;

    .line 261
    iget-object v0, p0, Ll/ܽۡ֡;->ۙ:Ll/ܰۢ֡;

    iget-object p1, p1, Ll/ܽۡ֡;->ۙ:Ll/ܰۢ֡;

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 275
    iget-object v2, p0, Ll/ܽۡ֡;->ۙ:Ll/ܰۢ֡;

    aput-object v2, v0, v1

    invoke-static {v0}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 292
    iget-object v0, p0, Ll/ܽۡ֡;->ۙ:Ll/ܰۢ֡;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ܰۢ֡;
    .locals 1

    .line 270
    iget-object v0, p0, Ll/ܽۡ֡;->ۙ:Ll/ܰۢ֡;

    return-object v0
.end method

.method public ֫(Ll/᩷۠ᩴ;Ll/ܶ۠ᩴ;)Ll/ܽ۠ᩴ;
    .locals 0

    .line 286
    iget-object p1, p0, Ll/ܽۡ֡;->᩹:Ll/ۖۡ֡;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    sget-object p1, Ll/ܽ۠ᩴ;->CONTINUE:Ll/ܽ۠ᩴ;

    return-object p1
.end method

.method public final ֫(Ll/ܶ۠ᩴ;)V
    .locals 3

    .line 313
    iget-object v0, p0, Ll/ܽۡ֡;->ۙ:Ll/ܰۢ֡;

    check-cast v0, Ll/ۤۢ֡;

    invoke-virtual {v0}, Ll/ۤۢ֡;->ۧ()Ll/ۛۢ֡;

    move-result-object v1

    invoke-interface {v1}, Ll/ۛۢ֡;->֫()V

    .line 314
    invoke-virtual {v0}, Ll/ۤۢ֡;->ܽ()Ll/ۛۢ֡;

    move-result-object v0

    invoke-interface {p1}, Ll/ܶ۠ᩴ;->size()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Ll/ۛۢ֡;->add(J)V

    return-void
.end method

.method public ֫(Ll/᩷۠ᩴ;Ljava/io/IOException;)V
    .locals 0

    .line 280
    iget-object p2, p0, Ll/ܽۡ֡;->᩶:Ljava/util/function/UnaryOperator;

    invoke-interface {p2, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩷۠ᩴ;

    .line 303
    iget-object p1, p0, Ll/ܽۡ֡;->ۙ:Ll/ܰۢ֡;

    check-cast p1, Ll/ۤۢ֡;

    invoke-virtual {p1}, Ll/ۤۢ֡;->֫()Ll/ۛۢ֡;

    move-result-object p1

    invoke-interface {p1}, Ll/ۛۢ֡;->֫()V

    .line 281
    sget-object p1, Ll/ܽ۠ᩴ;->CONTINUE:Ll/ܽ۠ᩴ;

    return-void
.end method
