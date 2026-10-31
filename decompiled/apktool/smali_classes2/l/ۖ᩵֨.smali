.class public final Ll/ۖ᩵֨;
.super Ll/ۘ᩵֨;
.source "R450"


# instance fields
.field public final synthetic ܳ:Ljava/util/function/Predicate;

.field public final synthetic ܿ:Ll/ۤܶ۠;

.field public final synthetic ᩳ:Ll/֨᩵֨;


# direct methods
.method public constructor <init>(Ll/ᩴ᩵֨;ZLl/ۤܶ۠;Ljava/util/function/Predicate;Ll/֨᩵֨;)V
    .locals 0

    .line 961
    iput-object p3, p0, Ll/ۖ᩵֨;->ܿ:Ll/ۤܶ۠;

    iput-object p4, p0, Ll/ۖ᩵֨;->ܳ:Ljava/util/function/Predicate;

    iput-object p5, p0, Ll/ۖ᩵֨;->ᩳ:Ll/֨᩵֨;

    invoke-direct {p0, p1, p2}, Ll/ۘ᩵֨;-><init>(Ll/ᩴ᩵֨;Z)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩶֡֨;)Ljava/lang/Iterable;
    .locals 3

    .line 964
    invoke-virtual {p1}, Ll/ۛ֡֨;->֨֫()Ll/ܰ᩵֨;

    move-result-object p1

    iget-object v0, p0, Ll/ۖ᩵֨;->ܳ:Ljava/util/function/Predicate;

    iget-object v1, p0, Ll/ۖ᩵֨;->ᩳ:Ll/֨᩵֨;

    iget-object v2, p0, Ll/ۖ᩵֨;->ܿ:Ll/ۤܶ۠;

    invoke-virtual {p1, v2, v0, v1}, Ll/۟᩵֨;->֫(Ll/ۤܶ۠;Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method
