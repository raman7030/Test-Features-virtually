.class public final Ll/᩹֫ۖ;
.super Ljava/lang/Object;
.source "97QO"

# interfaces
.implements Ll/᩸۟ܺ;


# instance fields
.field public final ֫:Ll/᩸֫ۖ;

.field public final ۧ:Ll/ܳ۬ܺ;

.field public final ܽ:Ll/ܳ۬ܺ;


# direct methods
.method public constructor <init>(Ljava/util/List;Ll/᩸֫ۖ;Ljava/util/List;)V
    .locals 0

    .line 209
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 210
    invoke-static {p1}, Ll/ܳ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/᩹֫ۖ;->ܽ:Ll/ܳ۬ܺ;

    .line 211
    iput-object p2, p0, Ll/᩹֫ۖ;->֫:Ll/᩸֫ۖ;

    .line 212
    invoke-static {p3}, Ll/ܳ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/᩹֫ۖ;->ۧ:Ll/ܳ۬ܺ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 247
    invoke-static {p0}, Ll/ܺܶܺ;->֫(Ljava/lang/Object;)Ll/ۡܶܺ;

    move-result-object v0

    const-string v1, "tok"

    iget-object v2, p0, Ll/᩹֫ۖ;->֫:Ll/᩸֫ۖ;

    .line 248
    invoke-virtual {v0, v2, v1}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "toksBefore"

    iget-object v2, p0, Ll/᩹֫ۖ;->ܽ:Ll/ܳ۬ܺ;

    .line 249
    invoke-virtual {v0, v2, v1}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "toksAfter"

    iget-object v2, p0, Ll/᩹֫ۖ;->ۧ:Ll/ܳ۬ܺ;

    .line 250
    invoke-virtual {v0, v2, v1}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 251
    invoke-virtual {v0}, Ll/ۡܶܺ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ܶ۟ܺ;
    .locals 1

    .line 222
    iget-object v0, p0, Ll/᩹֫ۖ;->֫:Ll/᩸֫ۖ;

    return-object v0
.end method

.method public final ֫()Ll/᩸֫ۖ;
    .locals 1

    .line 222
    iget-object v0, p0, Ll/᩹֫ۖ;->֫:Ll/᩸֫ۖ;

    return-object v0
.end method

.method public final ۧ()Ll/ܳ۬ܺ;
    .locals 1

    .line 232
    iget-object v0, p0, Ll/᩹֫ۖ;->ܽ:Ll/ܳ۬ܺ;

    return-object v0
.end method

.method public final ܽ()Ll/ܳ۬ܺ;
    .locals 1

    .line 242
    iget-object v0, p0, Ll/᩹֫ۖ;->ۧ:Ll/ܳ۬ܺ;

    return-object v0
.end method
