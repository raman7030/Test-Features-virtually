.class public Ll/ۚܶ۠;
.super Ll/֨ܶ۠;
.source "93Z4"


# instance fields
.field public ۧ:Ll/ᩴܶ۠;

.field public final ܽ:Ljava/util/function/Predicate;


# direct methods
.method public constructor <init>(Ll/᩹ܶ۠;Ljava/util/function/Predicate;)V
    .locals 1

    .line 141
    invoke-direct {p0}, Ll/֨ܶ۠;-><init>()V

    .line 134
    new-instance v0, Ll/ᩴܶ۠;

    invoke-direct {v0}, Ll/ᩴܶ۠;-><init>()V

    iput-object v0, p0, Ll/ۚܶ۠;->ۧ:Ll/ᩴܶ۠;

    .line 142
    iput-object p2, p0, Ll/ۚܶ۠;->ܽ:Ljava/util/function/Predicate;

    .line 104
    invoke-static {p1}, Ll/᩹ܶ۠;->֫(Ll/᩹ܶ۠;)Ll/֨ܶ۠;

    move-result-object p2

    iput-object p2, p0, Ll/֨ܶ۠;->֫:Ll/֨ܶ۠;

    .line 105
    invoke-static {p1, p0}, Ll/᩹ܶ۠;->֫(Ll/᩹ܶ۠;Ll/֨ܶ۠;)V

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/Queue;
    .locals 1

    .line 157
    iget-object v0, p0, Ll/ۚܶ۠;->ۧ:Ll/ᩴܶ۠;

    return-object v0
.end method

.method public final ֫(Ljava/util/function/Predicate;)V
    .locals 2

    .line 168
    :cond_0
    :goto_0
    iget-object v0, p0, Ll/ۚܶ۠;->ۧ:Ll/ᩴܶ۠;

    .line 263
    invoke-virtual {v0}, Ll/ᩴܶ۠;->ܽ()Ljava/lang/Object;

    move-result-object v0

    .line 168
    check-cast v0, Ll/ܽܶ۠;

    if-eqz v0, :cond_1

    .line 169
    invoke-interface {p1, v0}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 170
    iget-object v1, p0, Ll/֨ܶ۠;->֫:Ll/֨ܶ۠;

    invoke-virtual {v1, v0}, Ll/֨ܶ۠;->֫(Ll/ܽܶ۠;)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 172
    iput-object p1, p0, Ll/ۚܶ۠;->ۧ:Ll/ᩴܶ۠;

    return-void
.end method

.method public final ֫(Ll/ܽܶ۠;)V
    .locals 1

    .line 148
    sget-object v0, Ll/᩶۠۠;->ۗ:Ll/᩶۠۠;

    invoke-virtual {p1, v0}, Ll/ܽܶ۠;->֫(Ll/᩶۠۠;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۚܶ۠;->ܽ:Ljava/util/function/Predicate;

    if-eqz v0, :cond_0

    .line 149
    invoke-interface {v0, p1}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 150
    :cond_0
    iget-object v0, p0, Ll/ۚܶ۠;->ۧ:Ll/ᩴܶ۠;

    .line 227
    invoke-virtual {v0, p1}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    return-void

    .line 152
    :cond_1
    iget-object v0, p0, Ll/֨ܶ۠;->֫:Ll/֨ܶ۠;

    invoke-virtual {v0, p1}, Ll/֨ܶ۠;->֫(Ll/ܽܶ۠;)V

    return-void
.end method
