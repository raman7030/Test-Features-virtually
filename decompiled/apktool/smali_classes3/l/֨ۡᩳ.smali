.class public final Ll/֨ۡᩳ;
.super Ll/ܽۡᩳ;
.source "XAOV"


# instance fields
.field public ۡ:Ll/۬ᩳۚ;

.field public ܺ:Ll/֫ۖᩳ;


# direct methods
.method public constructor <init>(Ll/ܿۡᩳ;Ll/ۚۢᩳ;)V
    .locals 3

    .line 26
    invoke-direct {p0, p1, p2}, Ll/ܽۡᩳ;-><init>(Ll/ܿۡᩳ;Ll/ۚۢᩳ;)V

    .line 23
    new-instance p2, Ll/۬ᩳۚ;

    const-string v0, "intern"

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const-string v2, "Ljava/lang/String;"

    invoke-direct {p2, v2, v0, v2, v1}, Ll/۬ᩳۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    iput-object p2, p0, Ll/֨ۡᩳ;->ۡ:Ll/۬ᩳۚ;

    .line 40
    new-instance p2, Ll/֫ۖᩳ;

    invoke-direct {p2, p1}, Ll/֫ۖᩳ;-><init>(Ll/ܿۡᩳ;)V

    iput-object p2, p0, Ll/֨ۡᩳ;->ܺ:Ll/֫ۖᩳ;

    .line 27
    sget-object p1, Ll/ۨܺᩳ;->۬:Ll/ۨܺᩳ;

    iput-object p1, p0, Ll/ܽۡᩳ;->᩻:Ll/ۨܺᩳ;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    const-string v0, "String.intern"

    return-object v0
.end method

.method public final ֫(Ll/֨ۢۚ;Ll/ܶۢᩳ;Ll/᩺ܺᩳ;I)Ljava/lang/String;
    .locals 1

    .line 50
    invoke-virtual {p3}, Ll/᩺ܺᩳ;->ᩳ()I

    move-result p3

    .line 51
    iget-object v0, p0, Ll/֨ۡᩳ;->ܺ:Ll/֫ۖᩳ;

    invoke-virtual {v0, p2, p4, p3}, Ll/֫ۖᩳ;->֫(Ll/ܶۢᩳ;II)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 52
    invoke-virtual {v0}, Ll/֫ۖᩳ;->֫()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 54
    :cond_0
    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/ܿۡᩳ;)Ljava/util/List;
    .locals 0

    .line 37
    iget-object p1, p0, Ll/֨ۡᩳ;->ۡ:Ll/۬ᩳۚ;

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܶۢᩳ;Ll/֡ۢᩳ;Ll/᩺ܺᩳ;Ll/ܰܺᩳ;)V
    .locals 0

    .line 61
    invoke-super {p0, p1, p2, p3, p4}, Ll/ܽۡᩳ;->֫(Ll/ܶۢᩳ;Ll/֡ۢᩳ;Ll/᩺ܺᩳ;Ll/ܰܺᩳ;)V

    .line 62
    iget-object p2, p0, Ll/֨ۡᩳ;->ܺ:Ll/֫ۖᩳ;

    invoke-virtual {p2, p1}, Ll/֫ۖᩳ;->֫(Ll/ܶۢᩳ;)V

    return-void
.end method
