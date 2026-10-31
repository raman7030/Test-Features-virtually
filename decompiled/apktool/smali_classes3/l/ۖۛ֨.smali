.class public final Ll/ۖۛ֨;
.super Ll/ܳۛ֨;
.source "M43N"


# instance fields
.field public final synthetic ۜ:Ll/ۜۨ֨;


# direct methods
.method public constructor <init>(Ll/ۜۨ֨;Ll/֨֨֨;Ll/ۙ֨֨;Ll/᩵֨֨;)V
    .locals 7

    .line 815
    iput-object p1, p0, Ll/ۖۛ֨;->ۜ:Ll/ۜۨ֨;

    .line 816
    new-instance v4, Ll/ۡۛ֨;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Ll/ܺۛ֨;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Ll/ܳۛ֨;-><init>(Ll/ۜۨ֨;Ll/֨֨֨;Ll/ۙ֨֨;Ljava/util/function/BiFunction;Ljava/util/function/BiPredicate;Ll/᩵֨֨;)V

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/EnumSet;
    .locals 2

    .line 826
    sget-object v0, Ll/᩵֨֨;->᩹:Ll/᩵֨֨;

    iget-object v1, p0, Ll/ܳۛ֨;->ᩳ:Ll/᩵֨֨;

    if-ne v1, v0, :cond_0

    .line 827
    const-class v0, Ll/᩵֨֨;

    invoke-static {v0}, Ljava/util/EnumSet;->allOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    return-object v0

    .line 828
    :cond_0
    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֨֨֨;)Ll/᩸ۛ֨;
    .locals 4

    .line 821
    new-instance v0, Ll/ۖۛ֨;

    iget-object v1, p0, Ll/᩸ۛ֨;->֫:Ll/ۙ֨֨;

    iget-object v2, p0, Ll/ܳۛ֨;->ᩳ:Ll/᩵֨֨;

    iget-object v3, p0, Ll/ۖۛ֨;->ۜ:Ll/ۜۨ֨;

    invoke-direct {v0, v3, p1, v1, v2}, Ll/ۖۛ֨;-><init>(Ll/ۜۨ֨;Ll/֨֨֨;Ll/ۙ֨֨;Ll/᩵֨֨;)V

    return-object v0
.end method
