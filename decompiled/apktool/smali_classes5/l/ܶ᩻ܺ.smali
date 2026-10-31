.class public final Ll/ܶ᩻ܺ;
.super Ll/ܺۜܺ;
.source "13OM"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ᩶:Ll/᩻ܺܺ;

.field public ᩹:Ll/᩹᩻ܺ;


# direct methods
.method public constructor <init>(Ll/᩻ܺܺ;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ll/ܺۜܺ;-><init>()V

    .line 46
    iput-object p1, p0, Ll/ܶ᩻ܺ;->᩶:Ll/᩻ܺܺ;

    const/4 p1, 0x0

    .line 47
    iput-object p1, p0, Ll/ܶ᩻ܺ;->᩹:Ll/᩹᩻ܺ;

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 101
    check-cast p1, Ll/ܶ᩻ܺ;

    .line 102
    iget-object v0, p0, Ll/ܶ᩻ܺ;->᩶:Ll/᩻ܺܺ;

    iget-object p1, p1, Ll/ܶ᩻ܺ;->᩶:Ll/᩻ܺܺ;

    invoke-virtual {v0, p1}, Ll/ܰۡܺ;->֫(Ll/ܰۡܺ;)I

    move-result p1

    return p1
.end method

.method public final ֫()Ll/ۘۜܺ;
    .locals 1

    .line 55
    sget-object v0, Ll/ۘۜܺ;->ۨ:Ll/ۘۜܺ;

    return-object v0
.end method

.method public final ֫(Ll/֫ۜܺ;)V
    .locals 3

    .line 71
    iget-object v0, p0, Ll/ܶ᩻ܺ;->᩶:Ll/᩻ܺܺ;

    invoke-virtual {v0}, Ll/᩻ܺܺ;->ܺ()Ll/ܳܺܺ;

    move-result-object v0

    .line 72
    invoke-virtual {p1}, Ll/֫ۜܺ;->ۧ()Ll/᩸᩻ܺ;

    move-result-object v1

    .line 73
    invoke-virtual {v1, v0}, Ll/᩸᩻ܺ;->֫(Ll/ܳܺܺ;)Ll/᩹᩻ܺ;

    move-result-object v2

    if-nez v2, :cond_0

    .line 75
    invoke-virtual {p1}, Ll/֫ۜܺ;->֫()Ll/ۙۜܺ;

    move-result-object p1

    .line 76
    new-instance v2, Ll/᩹᩻ܺ;

    invoke-direct {v2, v0}, Ll/᩹᩻ܺ;-><init>(Ll/ܳܺܺ;)V

    .line 77
    invoke-virtual {p1, v2}, Ll/ۙۜܺ;->֫(Ll/ۗۜܺ;)V

    .line 78
    invoke-virtual {v1, v0, v2}, Ll/᩸᩻ܺ;->֫(Ll/ܳܺܺ;Ll/᩹᩻ܺ;)V

    .line 80
    :cond_0
    iput-object v2, p0, Ll/ܶ᩻ܺ;->᩹:Ll/᩹᩻ܺ;

    return-void
.end method

.method public final ֫(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V
    .locals 2

    .line 88
    iget-object p1, p0, Ll/ܶ᩻ܺ;->᩹:Ll/᩹᩻ܺ;

    invoke-virtual {p1}, Ll/ۗۜܺ;->ܿ()I

    move-result p1

    .line 89
    invoke-virtual {p2}, Ll/ᩳᩴܺ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 90
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ܺۜܺ;->᩷()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܶ᩻ܺ;->᩶:Ll/᩻ܺܺ;

    invoke-virtual {v1}, Ll/᩻ܺܺ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p2, v1, v0}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 91
    invoke-static {p1}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "call_site_off: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {p2, v1, v0}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 93
    :cond_0
    invoke-virtual {p2, p1}, Ll/ᩳᩴܺ;->ܿ(I)V

    return-void
.end method

.method public final ۧ()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method
