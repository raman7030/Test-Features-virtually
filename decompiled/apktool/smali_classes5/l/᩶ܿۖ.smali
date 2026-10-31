.class public final Ll/᩶ܿۖ;
.super Ll/۠ᩳۖ;
.source "O878"


# instance fields
.field public final ֫:Ll/᩷ܿۖ;

.field public final ۧ:Ll/۠ᩳۖ;


# direct methods
.method public constructor <init>(Ll/۠ᩳۖ;Ll/᩷ܿۖ;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Ll/۠ᩳۖ;-><init>()V

    .line 70
    iput-object p1, p0, Ll/᩶ܿۖ;->ۧ:Ll/۠ᩳۖ;

    .line 71
    iput-object p2, p0, Ll/᩶ܿۖ;->֫:Ll/᩷ܿۖ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿۜۖ;)Ljava/lang/Object;
    .locals 2

    .line 76
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۤ()Ll/ܳۜۖ;

    move-result-object v0

    sget-object v1, Ll/ܳۜۖ;->ۛ:Ll/ܳۜۖ;

    if-ne v0, v1, :cond_0

    .line 77
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۗ()V

    const/4 p1, 0x0

    return-object p1

    .line 81
    :cond_0
    iget-object v0, p0, Ll/᩶ܿۖ;->֫:Ll/᩷ܿۖ;

    invoke-interface {v0}, Ll/᩷ܿۖ;->ۧ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 82
    invoke-virtual {p1}, Ll/ܿۜۖ;->֫()V

    .line 83
    :goto_0
    invoke-virtual {p1}, Ll/ܿۜۖ;->ᩴ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 84
    iget-object v1, p0, Ll/᩶ܿۖ;->ۧ:Ll/۠ᩳۖ;

    invoke-virtual {v1, p1}, Ll/۠ᩳۖ;->֫(Ll/ܿۜۖ;)Ljava/lang/Object;

    move-result-object v1

    .line 85
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 87
    :cond_1
    invoke-virtual {p1}, Ll/ܿۜۖ;->ܳ()V

    return-object v0
.end method

.method public final ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    .locals 2

    .line 64
    check-cast p2, Ljava/util/Collection;

    if-nez p2, :cond_0

    .line 94
    invoke-virtual {p1}, Ll/᩻ۜۖ;->ۘ()Ll/᩻ۜۖ;

    return-void

    .line 98
    :cond_0
    invoke-virtual {p1}, Ll/᩻ۜۖ;->֫()V

    .line 99
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 100
    iget-object v1, p0, Ll/᩶ܿۖ;->ۧ:Ll/۠ᩳۖ;

    invoke-virtual {v1, p1, v0}, Ll/۠ᩳۖ;->֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V

    goto :goto_0

    .line 102
    :cond_1
    invoke-virtual {p1}, Ll/᩻ۜۖ;->ᩳ()V

    return-void
.end method
