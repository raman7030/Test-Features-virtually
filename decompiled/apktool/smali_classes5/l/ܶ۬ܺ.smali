.class public final Ll/ܶ۬ܺ;
.super Ll/᩶۬ܺ;
.source "V5XH"


# instance fields
.field public final synthetic ۗ:Ll/᩶۬ܺ;

.field public final synthetic ۬:Ll/ܰۤܺ;


# direct methods
.method public constructor <init>(Ll/ܳ۬ܺ;Ll/ܳ۬ܺ;Ll/ܰۤܺ;Ll/᩶۬ܺ;)V
    .locals 0

    .line 367
    iput-object p3, p0, Ll/ܶ۬ܺ;->۬:Ll/ܰۤܺ;

    iput-object p4, p0, Ll/ܶ۬ܺ;->ۗ:Ll/᩶۬ܺ;

    invoke-direct {p0, p1, p2}, Ll/᩶۬ܺ;-><init>(Ll/ܳ۬ܺ;Ll/ܳ۬ܺ;)V

    return-void
.end method


# virtual methods
.method public writeReplace()Ljava/lang/Object;
    .locals 1

    .line 382
    invoke-super {p0}, Ll/᩶۬ܺ;->writeReplace()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic ֫()Ljava/util/Map;
    .locals 1

    .line 367
    invoke-virtual {p0}, Ll/᩶۬ܺ;->֫()Ll/ۢ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ܰۤܺ;)Ll/᩶۬ܺ;
    .locals 2

    .line 370
    iget-object v0, p0, Ll/ܶ۬ܺ;->۬:Ll/ܰۤܺ;

    invoke-virtual {v0, p1}, Ll/ܰۤܺ;->ܽ(Ll/ܰۤܺ;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 371
    iget-object v1, p0, Ll/ܶ۬ܺ;->ۗ:Ll/᩶۬ܺ;

    invoke-virtual {p1, v0}, Ll/ܰۤܺ;->ۧ(Ll/ܰۤܺ;)Ll/ܰۤܺ;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/᩶۬ܺ;->֫(Ll/ܰۤܺ;)Ll/᩶۬ܺ;

    move-result-object p1

    return-object p1

    .line 373
    :cond_0
    invoke-static {}, Ll/᩶۬ܺ;->ۧ()Ll/᩶۬ܺ;

    move-result-object p1

    return-object p1
.end method
