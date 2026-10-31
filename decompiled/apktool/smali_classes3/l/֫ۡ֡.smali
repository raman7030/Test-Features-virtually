.class public abstract Ll/֫ۡ֡;
.super Ll/᩻ۡ֡;
.source "B7IH"


# instance fields
.field public ֫:Ll/ۖۡ֡;

.field public ۧ:Ljava/util/function/UnaryOperator;

.field public ܽ:Ll/ܺۡ֡;

.field public ᩳ:Ll/ܰۢ֡;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    sget v0, Ll/ܽۡ֡;->ۗ:I

    .line 159
    invoke-static {}, Ll/۟ۢ֡;->֫()Ll/ܰۢ֡;

    move-result-object v0

    .line 51
    iput-object v0, p0, Ll/֫ۡ֡;->ᩳ:Ll/ܰۢ֡;

    .line 155
    new-instance v0, Ll/ܺۡ֡;

    sget-object v1, Ll/ܽ۠ᩴ;->TERMINATE:Ll/ܽ۠ᩴ;

    sget-object v1, Ll/ܽ۠ᩴ;->CONTINUE:Ll/ܽ۠ᩴ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ܺۡ֡;-><init>(I)V

    .line 52
    iput-object v0, p0, Ll/֫ۡ֡;->ܽ:Ll/ܺۡ֡;

    .line 53
    sget-object v0, Ll/ۖۡ֡;->᩸:Ll/ۖۡ֡;

    iput-object v0, p0, Ll/֫ۡ֡;->֫:Ll/ۖۡ֡;

    .line 151
    invoke-static {}, Ll/֡ۛᩴ;->identity()Ljava/util/function/UnaryOperator;

    move-result-object v0

    .line 54
    iput-object v0, p0, Ll/֫ۡ֡;->ۧ:Ljava/util/function/UnaryOperator;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۖۡ֡;
    .locals 1

    .line 64
    iget-object v0, p0, Ll/֫ۡ֡;->֫:Ll/ۖۡ֡;

    return-object v0
.end method

.method public final ֫(Ll/ܰۢ֡;)V
    .locals 0

    .line 119
    iput-object p1, p0, Ll/֫ۡ֡;->ᩳ:Ll/ܰۢ֡;

    return-void
.end method

.method public final ۧ()Ljava/util/function/UnaryOperator;
    .locals 1

    .line 68
    iget-object v0, p0, Ll/֫ۡ֡;->ۧ:Ljava/util/function/UnaryOperator;

    return-object v0
.end method

.method public final ܽ()Ll/ܺۡ֡;
    .locals 1

    .line 72
    iget-object v0, p0, Ll/֫ۡ֡;->ܽ:Ll/ܺۡ֡;

    return-object v0
.end method

.method public final ᩳ()Ll/ܰۢ֡;
    .locals 1

    .line 76
    iget-object v0, p0, Ll/֫ۡ֡;->ᩳ:Ll/ܰۢ֡;

    return-object v0
.end method
