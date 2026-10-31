.class public final Ll/ܳ᩻ܺ;
.super Ll/ۨܿܺ;
.source "OBGT"


# static fields
.field public static final ֫:Ll/ܳ᩻ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 35
    new-instance v0, Ll/ܳ᩻ܺ;

    .line 36
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    sput-object v0, Ll/ܳ᩻ܺ;->֫:Ll/ܳ᩻ܺ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public final ֫(Ll/ۤܿܺ;)Ljava/lang/String;
    .locals 3

    .line 50
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v0

    .line 51
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸ۡܺ;->۠()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ll/ۨܿܺ;->ᩳ(Ll/ۤܿܺ;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۙܿܺ;)Ljava/util/BitSet;
    .locals 2

    .line 91
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object p1

    .line 92
    new-instance v0, Ljava/util/BitSet;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    const/4 v1, 0x0

    .line 94
    invoke-virtual {p1, v1}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result p1

    invoke-static {p1}, Ll/ۨܿܺ;->֫(I)Z

    move-result p1

    invoke-virtual {v0, v1, p1}, Ljava/util/BitSet;->set(IZ)V

    return-object v0
.end method

.method public final ֫(Ll/ᩳᩴܺ;Ll/ۤܿܺ;)V
    .locals 3

    .line 111
    invoke-virtual {p2}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v0

    .line 112
    move-object v1, p2

    check-cast v1, Ll/ۚܳܺ;

    invoke-virtual {v1}, Ll/ۚܳܺ;->ᩴ()I

    move-result v1

    const/4 v2, 0x0

    .line 114
    invoke-virtual {v0, v2}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    invoke-static {p2, v0}, Ll/ۨܿܺ;->֫(Ll/ۙܿܺ;I)S

    move-result p2

    invoke-static {p1, p2, v1}, Ll/ۨܿܺ;->֫(Ll/ᩳᩴܺ;SI)V

    return-void
.end method

.method public final ֫(Ll/ۚܳܺ;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final ۧ(Ll/ۤܿܺ;)Ljava/lang/String;
    .locals 0

    .line 59
    invoke-static {p1}, Ll/ۨܿܺ;->ܽ(Ll/ۤܿܺ;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/ۙܿܺ;)Z
    .locals 3

    .line 75
    invoke-virtual {p1}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v0

    .line 77
    instance-of p1, p1, Ll/ۚܳܺ;

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    .line 78
    invoke-virtual {v0}, Ll/ܿᩴܺ;->size()I

    move-result p1

    const/4 v2, 0x1

    if-ne p1, v2, :cond_1

    .line 79
    invoke-virtual {v0, v1}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result p1

    invoke-static {p1}, Ll/ۨܿܺ;->֫(I)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return v2

    :cond_1
    :goto_0
    return v1
.end method
