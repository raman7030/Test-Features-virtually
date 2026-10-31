.class public final Ll/ᩴ۟ܺ;
.super Ljava/lang/Object;
.source "T7NA"


# instance fields
.field public ֫:Ll/ۜ۟ܺ;

.field public final ۧ:Ll/ۜ۟ܺ;

.field public final ܽ:Ljava/util/ArrayDeque;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    sget-object v0, Ll/ۚ۟ܺ;->ܽ:Ll/ۚ۟ܺ;

    invoke-static {v0}, Ll/ۜ۟ܺ;->֫(Ll/۠۟ܺ;)Ll/ۜ۟ܺ;

    move-result-object v0

    iput-object v0, p0, Ll/ᩴ۟ܺ;->ۧ:Ll/ۜ۟ܺ;

    .line 27
    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v1, p0, Ll/ᩴ۟ܺ;->ܽ:Ljava/util/ArrayDeque;

    .line 45
    iput-object v0, p0, Ll/ᩴ۟ܺ;->֫:Ll/ۜ۟ܺ;

    .line 51
    invoke-virtual {v1, v0}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 115
    invoke-static {p0}, Ll/ܺܶܺ;->֫(Ljava/lang/Object;)Ll/ۡܶܺ;

    move-result-object v0

    const-string v1, "base"

    iget-object v2, p0, Ll/ᩴ۟ܺ;->ۧ:Ll/ۜ۟ܺ;

    .line 116
    invoke-virtual {v0, v2, v1}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "stack"

    iget-object v2, p0, Ll/ᩴ۟ܺ;->ܽ:Ljava/util/ArrayDeque;

    .line 117
    invoke-virtual {v0, v2, v1}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "appendLevel"

    iget-object v2, p0, Ll/ᩴ۟ܺ;->֫:Ll/ۜ۟ܺ;

    .line 118
    invoke-virtual {v0, v2, v1}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    invoke-virtual {v0}, Ll/ۡܶܺ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ۘ۟ܺ;
    .locals 1

    .line 110
    iget-object v0, p0, Ll/ᩴ۟ܺ;->ۧ:Ll/ۜ۟ܺ;

    return-object v0
.end method

.method public final ֫(Ll/ۘ۟ܺ;)V
    .locals 1

    .line 91
    iget-object v0, p0, Ll/ᩴ۟ܺ;->֫:Ll/ۜ۟ܺ;

    invoke-virtual {v0, p1}, Ll/ۜ۟ܺ;->֫(Ll/ۘ۟ܺ;)V

    return-void
.end method

.method public final ֫(Ll/۠۟ܺ;)V
    .locals 1

    .line 73
    invoke-static {p1}, Ll/ۜ۟ܺ;->֫(Ll/۠۟ܺ;)Ll/ۜ۟ܺ;

    move-result-object p1

    .line 74
    iget-object v0, p0, Ll/ᩴ۟ܺ;->ܽ:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ll/ܳ۟ܺ;)V
    .locals 1

    .line 100
    iget-object v0, p0, Ll/ᩴ۟ܺ;->ܽ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۜ۟ܺ;

    iput-object v0, p0, Ll/ᩴ۟ܺ;->֫:Ll/ۜ۟ܺ;

    .line 101
    invoke-virtual {v0, p1}, Ll/ۜ۟ܺ;->֫(Ll/ۘ۟ܺ;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 81
    iget-object v0, p0, Ll/ᩴ۟ܺ;->ܽ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜ۟ܺ;

    .line 82
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۜ۟ܺ;

    invoke-virtual {v0, v1}, Ll/ۜ۟ܺ;->֫(Ll/ۘ۟ܺ;)V

    return-void
.end method
