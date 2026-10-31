.class public final Ll/᩷۟ܺ;
.super Ll/ۘ۟ܺ;
.source "57R8"

# interfaces
.implements Ll/۫۟ܺ;


# static fields
.field public static final ۬:Ll/᩷۟ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 532
    new-instance v0, Ll/᩷۟ܺ;

    .line 534
    invoke-direct {v0}, Ll/ۘ۟ܺ;-><init>()V

    .line 532
    sput-object v0, Ll/᩷۟ܺ;->۬:Ll/᩷۟ܺ;

    return-void
.end method

.method public static ᩷()Ll/᩷۟ܺ;
    .locals 1

    .line 543
    sget-object v0, Ll/᩷۟ܺ;->۬:Ll/᩷۟ܺ;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 578
    invoke-static {p0}, Ll/ܺܶܺ;->֫(Ljava/lang/Object;)Ll/ۡܶܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡܶܺ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    const-string v0, " "

    return-object v0
.end method

.method public final ֫(Ll/ۧ۟ܺ;Ll/ۢ۟ܺ;)Ll/ۢ۟ܺ;
    .locals 0

    .line 568
    iget p1, p2, Ll/ۢ۟ܺ;->֫:I

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p2, p1}, Ll/ۢ۟ܺ;->֫(I)Ll/ۢ۟ܺ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ᩴ۟ܺ;)V
    .locals 0

    .line 548
    invoke-virtual {p1, p0}, Ll/ᩴ۟ܺ;->֫(Ll/ۘ۟ܺ;)V

    return-void
.end method

.method public final ֫(Ll/ᩴۧۖ;)V
    .locals 2

    const-string v0, " "

    .line 573
    invoke-virtual {p0}, Ll/ۘ۟ܺ;->ܳ()Ll/ܰۤܺ;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ll/ᩴۧۖ;->֫(Ll/ܰۤܺ;Ljava/lang/String;)V

    return-void
.end method

.method public final ۧ()Ll/ܰۤܺ;
    .locals 1

    .line 563
    invoke-static {}, Ll/ۘ۟ܺ;->᩻()Ll/ܰۤܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
