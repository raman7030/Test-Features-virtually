.class public final Ll/ۛ۠۠;
.super Ljava/lang/Object;
.source "544J"


# static fields
.field public static final ᩳ:Ll/ۙ֨۠;


# instance fields
.field public final ֫:Ljava/util/EnumSet;

.field public ۧ:Ll/ۚ֨۠;

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 55
    new-instance v0, Ll/ۙ֨۠;

    invoke-direct {v0}, Ll/ۙ֨۠;-><init>()V

    sput-object v0, Ll/ۛ۠۠;->ᩳ:Ll/ۙ֨۠;

    return-void
.end method

.method public constructor <init>(Ll/ۗ֨۠;)V
    .locals 3

    .line 71
    invoke-static {p1}, Ll/ܳܶ۠;->֫(Ll/ۗ֨۠;)Ll/ܳܶ۠;

    move-result-object v0

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "compiler"

    .line 86
    iput-object v1, p0, Ll/ۛ۠۠;->ܽ:Ljava/lang/String;

    .line 87
    new-instance v1, Ll/ۚ֨۠;

    .line 85
    new-instance v2, Ll/֡֨۠;

    invoke-direct {v2}, Ll/֡֨۠;-><init>()V

    invoke-direct {v1, v0, v2}, Ll/ܺ֨۠;-><init>(Ll/ܳܶ۠;Ll/ۡ֨۠;)V

    .line 87
    iput-object v1, p0, Ll/ۛ۠۠;->ۧ:Ll/ۚ֨۠;

    .line 88
    sget-object v0, Ll/᩶۠۠;->ۙ:Ll/᩶۠۠;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    iput-object v0, p0, Ll/ۛ۠۠;->֫:Ljava/util/EnumSet;

    .line 72
    sget-object v1, Ll/ۛ۠۠;->ᩳ:Ll/ۙ֨۠;

    invoke-virtual {p1, v1, p0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;Ljava/lang/Object;)V

    .line 74
    invoke-static {p1}, Ll/ۨܶ۠;->֫(Ll/ۗ֨۠;)Ll/ۨܶ۠;

    move-result-object p1

    const-string v1, "onlySyntaxErrorsUnrecoverable"

    .line 80
    invoke-virtual {p1, v1}, Ll/ۨܶ۠;->ۧ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 81
    sget-object v1, Ll/᩶۠۠;->۬:Ll/᩶۠۠;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 76
    :cond_0
    new-instance v0, Ll/ۤ۠۠;

    invoke-direct {v0, p0, p1}, Ll/ۤ۠۠;-><init>(Ll/ۛ۠۠;Ll/ۨܶ۠;)V

    invoke-virtual {p1, v0}, Ll/ۨܶ۠;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static ֫(Ll/ۗ֨۠;)Ll/ۛ۠۠;
    .locals 1

    .line 59
    sget-object v0, Ll/ۛ۠۠;->ᩳ:Ll/ۙ֨۠;

    invoke-virtual {p0, v0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛ۠۠;

    if-nez v0, :cond_0

    .line 61
    new-instance v0, Ll/ۛ۠۠;

    invoke-direct {v0, p0}, Ll/ۛ۠۠;-><init>(Ll/ۗ֨۠;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final varargs ֫(Ljava/lang/String;[Ljava/lang/Object;)Ll/۫۠۠;
    .locals 2

    .line 299
    sget-object v0, Ll/۬۠۠;->᩶:Ll/۬۠۠;

    iget-object v1, p0, Ll/ۛ۠۠;->ܽ:Ljava/lang/String;

    invoke-static {v0, v1, p1, p2}, Ll/ۙ۠۠;->֫(Ll/۬۠۠;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ll/ۙ۠۠;

    move-result-object p1

    check-cast p1, Ll/۫۠۠;

    return-object p1
.end method

.method public final ֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;
    .locals 7

    .line 229
    const-class v0, Ll/᩶۠۠;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v1, p0

    move-object v6, p1

    invoke-virtual/range {v1 .. v6}, Ll/ۛ۠۠;->֫(Ll/᩶ᩴ֨;Ljava/util/Set;Ll/ܳ۠۠;Ll/ۗ۠۠;Ll/ۙ۠۠;)Ll/ܽܶ۠;

    move-result-object p1

    return-object p1
.end method

.method public final varargs ֫(Ll/۬۠۠;Ljava/util/EnumSet;Ll/ܳ۠۠;Ll/ۗ۠۠;[Ljava/lang/Object;)Ll/ܽܶ۠;
    .locals 8

    const-string v0, "cant.apply.symbols"

    .line 270
    iget-object v1, p0, Ll/ۛ۠۠;->ܽ:Ljava/lang/String;

    invoke-static {p1, v1, v0, p5}, Ll/ۙ۠۠;->֫(Ll/۬۠۠;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ll/ۙ۠۠;

    move-result-object v7

    const/4 v3, 0x0

    move-object v2, p0

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-virtual/range {v2 .. v7}, Ll/ۛ۠۠;->֫(Ll/᩶ᩴ֨;Ljava/util/Set;Ll/ܳ۠۠;Ll/ۗ۠۠;Ll/ۙ۠۠;)Ll/ܽܶ۠;

    move-result-object p1

    return-object p1
.end method

.method public final varargs ֫(Ll/۬۠۠;Ll/ܳ۠۠;Ll/ۗ۠۠;Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;
    .locals 7

    .line 243
    const-class v0, Ll/᩶۠۠;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v3

    iget-object v0, p0, Ll/ۛ۠۠;->ܽ:Ljava/lang/String;

    invoke-static {p1, v0, p4, p5}, Ll/ۙ۠۠;->֫(Ll/۬۠۠;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ll/ۙ۠۠;

    move-result-object v6

    const/4 v2, 0x0

    move-object v1, p0

    move-object v4, p2

    move-object v5, p3

    invoke-virtual/range {v1 .. v6}, Ll/ۛ۠۠;->֫(Ll/᩶ᩴ֨;Ljava/util/Set;Ll/ܳ۠۠;Ll/ۗ۠۠;Ll/ۙ۠۠;)Ll/ܽܶ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩶۠۠;Ll/ܳ۠۠;Ll/ۗ۠۠;Ll/۫۠۠;)Ll/ܽܶ۠;
    .locals 7

    .line 111
    iget-object v0, p0, Ll/ۛ۠۠;->֫:Ljava/util/EnumSet;

    invoke-static {v0}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    move-result-object v3

    const/4 v2, 0x0

    move-object v1, p0

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-virtual/range {v1 .. v6}, Ll/ۛ۠۠;->֫(Ll/᩶ᩴ֨;Ljava/util/Set;Ll/ܳ۠۠;Ll/ۗ۠۠;Ll/ۙ۠۠;)Ll/ܽܶ۠;

    move-result-object p2

    if-eqz p1, :cond_0

    .line 113
    invoke-virtual {p2, p1}, Ll/ܽܶ۠;->ۧ(Ll/᩶۠۠;)V

    :cond_0
    return-object p2
.end method

.method public final ֫(Ll/᩶ᩴ֨;Ljava/util/Set;Ll/ܳ۠۠;Ll/ۗ۠۠;Ll/ۙ۠۠;)Ll/ܽܶ۠;
    .locals 8

    .line 283
    new-instance v7, Ll/ܽܶ۠;

    .line 288
    iget-object v0, p5, Ll/ۙ۠۠;->ᩳ:Ll/۬۠۠;

    iget-object v1, p5, Ll/ۙ۠۠;->ܽ:Ljava/lang/String;

    iget-object v2, p5, Ll/ۙ۠۠;->ۧ:Ljava/lang/String;

    iget-object p5, p5, Ll/ۙ۠۠;->֫:[Ljava/lang/Object;

    .line 289
    invoke-static {p5}, Ll/ܽ᩺ᩴ;->of([Ljava/lang/Object;)Ll/ܿ᩺ᩴ;

    move-result-object p5

    new-instance v3, Ll/ۖᩳ֨;

    const/4 v4, 0x1

    invoke-direct {v3, v4, p0}, Ll/ۖᩳ֨;-><init>(ILjava/lang/Object;)V

    invoke-interface {p5, v3}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p5

    .line 292
    invoke-interface {p5}, Ll/ܿ᩺ᩴ;->toArray()[Ljava/lang/Object;

    move-result-object p5

    .line 288
    invoke-static {v0, v1, v2, p5}, Ll/ۙ۠۠;->֫(Ll/۬۠۠;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ll/ۙ۠۠;

    move-result-object v2

    .line 283
    iget-object v1, p0, Ll/ۛ۠۠;->ۧ:Ll/ۚ֨۠;

    move-object v0, v7

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Ll/ܽܶ۠;-><init>(Ll/۬ۖ֨;Ll/ۙ۠۠;Ll/᩶ᩴ֨;Ljava/util/Set;Ll/ܳ۠۠;Ll/ۗ۠۠;)V

    return-object v7
.end method

.method public final varargs ۧ(Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;
    .locals 2

    .line 320
    sget-object v0, Ll/۬۠۠;->ۙ:Ll/۬۠۠;

    iget-object v1, p0, Ll/ۛ۠۠;->ܽ:Ljava/lang/String;

    invoke-static {v0, v1, p1, p2}, Ll/ۙ۠۠;->֫(Ll/۬۠۠;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ll/ۙ۠۠;

    move-result-object p1

    check-cast p1, Ll/ۨ۠۠;

    .line 221
    invoke-virtual {p0, p1}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object p1

    return-object p1
.end method

.method public final varargs ܽ(Ljava/lang/String;[Ljava/lang/Object;)Ll/ܰ۠۠;
    .locals 2

    .line 313
    sget-object v0, Ll/۬۠۠;->ۗ:Ll/۬۠۠;

    iget-object v1, p0, Ll/ۛ۠۠;->ܽ:Ljava/lang/String;

    invoke-static {v0, v1, p1, p2}, Ll/ۙ۠۠;->֫(Ll/۬۠۠;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ll/ۙ۠۠;

    move-result-object p1

    check-cast p1, Ll/ܰ۠۠;

    return-object p1
.end method
