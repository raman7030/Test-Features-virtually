.class public abstract Ll/᩶ۗۚ;
.super Ljava/lang/Object;
.source "Z7D2"

# interfaces
.implements Ll/ۗۗۚ;


# instance fields
.field public ۧ:Z

.field public ܳ:Z

.field public ܽ:Ll/᩻۬ۚ;

.field public ܿ:Ll/֨۬ۚ;

.field public ᩳ:Ll/ܰۗۚ;

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/᩹ۗۚ;)V
    .locals 1

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 46
    iput-boolean v0, p0, Ll/᩶ۗۚ;->ۧ:Z

    .line 64
    iget-object v0, p1, Ll/᩹ۗۚ;->ۧ:Ll/ۘ۬ۚ;

    iput-object v0, p0, Ll/᩶ۗۚ;->ܿ:Ll/֨۬ۚ;

    .line 65
    iget-object p1, p1, Ll/᩹ۗۚ;->֫:Ll/ܰۗۚ;

    iput-object p1, p0, Ll/᩶ۗۚ;->ᩳ:Ll/ܰۗۚ;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/io/DataInputStream;
    .locals 2

    .line 120
    iget-object v0, p0, Ll/᩶ۗۚ;->ܽ:Ll/᩻۬ۚ;

    const-string v1, "Input must be defined."

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 121
    iget-object v0, p0, Ll/᩶ۗۚ;->ܽ:Ll/᩻۬ۚ;

    invoke-static {p0}, Ll/ܽ۫ᩴ;->of(Ljava/lang/Object;)Ll/ܽ۫ᩴ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/᩻۬ۚ;->֫(Ll/ܽ۫ᩴ;)Ljava/io/DataInputStream;

    move-result-object v0

    return-object v0
.end method

.method public varargs ֫(JLjava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 46
    new-instance p1, Ll/۬ۗۚ;

    invoke-direct {p1}, Ll/۬ۗۚ;-><init>()V

    throw p1
.end method

.method public varargs ֫(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 144
    iget-object v0, p0, Ll/᩶ۗۚ;->ᩳ:Ll/ܰۗۚ;

    invoke-virtual {v0, p1, p2}, Ll/ܰۗۚ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Throwable;)V
    .locals 1

    .line 149
    iget-object v0, p0, Ll/᩶ۗۚ;->ᩳ:Ll/ܰۗۚ;

    invoke-virtual {v0, p1}, Ll/ܰۗۚ;->֫(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final ֫(Ljava/util/function/Supplier;)V
    .locals 1

    .line 131
    iget-boolean v0, p0, Ll/᩶ۗۚ;->ܳ:Z

    if-eqz v0, :cond_0

    .line 132
    invoke-interface {p1}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 203
    iget-object v0, p0, Ll/᩶ۗۚ;->ᩳ:Ll/ܰۗۚ;

    .line 75
    iget-object v0, v0, Ll/ܰۗۚ;->ۧ:Ll/ܶ۬ۚ;

    .line 77
    invoke-virtual {v0, p1}, Ll/ܶ۬ۚ;->ܿ(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۖ۬ۚ;)V
    .locals 0

    .line 190
    iput-object p1, p0, Ll/᩶ۗۚ;->ܿ:Ll/֨۬ۚ;

    return-void
.end method

.method public final ֫(Ll/۠۬ۚ;)V
    .locals 1

    .line 203
    iget-object v0, p0, Ll/᩶ۗۚ;->ᩳ:Ll/ܰۗۚ;

    .line 80
    iput-object p1, v0, Ll/ܰۗۚ;->ۧ:Ll/ܶ۬ۚ;

    return-void
.end method

.method public ֫(Ll/᩻۬ۚ;)V
    .locals 1

    .line 69
    iput-object p1, p0, Ll/᩶ۗۚ;->ܽ:Ll/᩻۬ۚ;

    .line 70
    iget-object v0, p0, Ll/᩶ۗۚ;->ᩳ:Ll/ܰۗۚ;

    invoke-virtual {v0, p1}, Ll/ܰۗۚ;->֫(Ll/᩻۬ۚ;)V

    return-void
.end method

.method public final ۖ()V
    .locals 1

    const/4 v0, 0x1

    .line 198
    iput-boolean v0, p0, Ll/᩶ۗۚ;->᩻:Z

    return-void
.end method

.method public final ۜ()Z
    .locals 1

    .line 194
    iget-boolean v0, p0, Ll/᩶ۗۚ;->᩻:Z

    return v0
.end method

.method public final ۡ()V
    .locals 1

    const/4 v0, 0x1

    .line 91
    iput-boolean v0, p0, Ll/᩶ۗۚ;->ۧ:Z

    return-void
.end method

.method public final ۢ()Z
    .locals 1

    .line 55
    iget-boolean v0, p0, Ll/᩶ۗۚ;->ܳ:Z

    return v0
.end method

.method public final varargs ۧ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 164
    iget-object v0, p0, Ll/᩶ۗۚ;->ᩳ:Ll/ܰۗۚ;

    invoke-virtual {v0, p1, p2}, Ll/ܰۗۚ;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()Ll/ܰۗۚ;
    .locals 1

    .line 203
    iget-object v0, p0, Ll/᩶ۗۚ;->ᩳ:Ll/ܰۗۚ;

    return-object v0
.end method

.method public varargs ۧ(JLjava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 42
    new-instance p1, Ll/۬ۗۚ;

    invoke-direct {p1}, Ll/۬ۗۚ;-><init>()V

    throw p1
.end method

.method public final ۧ(Ljava/lang/Throwable;)V
    .locals 1

    .line 169
    iget-boolean v0, p0, Ll/᩶ۗۚ;->᩻:Z

    if-eqz v0, :cond_0

    .line 170
    iget-object v0, p0, Ll/᩶ۗۚ;->ᩳ:Ll/ܰۗۚ;

    .line 75
    iget-object v0, v0, Ll/ܰۗۚ;->ۧ:Ll/ܶ۬ۚ;

    .line 89
    invoke-virtual {v0, p1}, Ll/ܶ۬ۚ;->֫(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final ܳ()Ll/᩻۬ۚ;
    .locals 1

    .line 113
    iget-object v0, p0, Ll/᩶ۗۚ;->ܽ:Ll/᩻۬ۚ;

    return-object v0
.end method

.method public final ܺ()V
    .locals 1

    const/4 v0, 0x1

    .line 74
    iput-boolean v0, p0, Ll/᩶ۗۚ;->ܳ:Z

    return-void
.end method

.method public final ܽ()Ll/ܶ۬ۚ;
    .locals 1

    .line 203
    iget-object v0, p0, Ll/᩶ۗۚ;->ᩳ:Ll/ܰۗۚ;

    .line 75
    iget-object v0, v0, Ll/ܰۗۚ;->ۧ:Ll/ܶ۬ۚ;

    return-object v0
.end method

.method public final varargs ܽ(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 138
    iget-boolean v0, p0, Ll/᩶ۗۚ;->ܳ:Z

    if-eqz v0, :cond_1

    .line 203
    iget-object v0, p0, Ll/᩶ۗۚ;->ᩳ:Ll/ܰۗۚ;

    .line 75
    iget-object v0, v0, Ll/ܰۗۚ;->ۧ:Ll/ܶ۬ۚ;

    .line 82
    array-length v1, p2

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {v0, p1}, Ll/ܶ۬ۚ;->ᩳ(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 3

    .line 96
    iget-object v0, p0, Ll/᩶ۗۚ;->ᩳ:Ll/ܰۗۚ;

    invoke-virtual {v0}, Ll/ܰۗۚ;->ۧ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "."

    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x2e

    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public varargs ܿ(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 65
    new-instance p1, Ll/۬ۗۚ;

    invoke-direct {p1}, Ll/۬ۗۚ;-><init>()V

    throw p1
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 96
    iget-object v0, p0, Ll/᩶ۗۚ;->ᩳ:Ll/ܰۗۚ;

    invoke-virtual {v0}, Ll/ܰۗۚ;->ۧ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final varargs ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 126
    iget-boolean v0, p0, Ll/᩶ۗۚ;->ܳ:Z

    if-eqz v0, :cond_1

    .line 203
    iget-object v0, p0, Ll/᩶ۗۚ;->ᩳ:Ll/ܰۗۚ;

    .line 75
    iget-object v0, v0, Ll/ܰۗۚ;->ۧ:Ll/ܶ۬ۚ;

    .line 77
    array-length v1, p2

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {v0, p1}, Ll/ܶ۬ۚ;->ܿ(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final ᩷()Z
    .locals 1

    .line 87
    iget-boolean v0, p0, Ll/᩶ۗۚ;->ۧ:Z

    return v0
.end method

.method public final ᩻()Ll/֨۬ۚ;
    .locals 1

    .line 185
    iget-object v0, p0, Ll/᩶ۗۚ;->ܿ:Ll/֨۬ۚ;

    return-object v0
.end method
