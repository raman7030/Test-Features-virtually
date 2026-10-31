.class public final Ll/ۗܶܺ;
.super Ljava/lang/Object;
.source "O3OZ"


# instance fields
.field public final ֫:I

.field public final ۧ:Ll/ۙܶܺ;

.field public final ܽ:Ll/ۨ۠ܺ;


# direct methods
.method public constructor <init>(Ll/ۙܶܺ;)V
    .locals 1

    .line 129
    sget-object v0, Ll/ۤ۠ܺ;->᩹:Ll/ۨ۠ܺ;

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 113
    iput-object p1, p0, Ll/ۗܶܺ;->ۧ:Ll/ۙܶܺ;

    .line 115
    iput-object v0, p0, Ll/ۗܶܺ;->ܽ:Ll/ۨ۠ܺ;

    const p1, 0x7fffffff

    .line 116
    iput p1, p0, Ll/ۗܶܺ;->֫:I

    return-void
.end method

.method public static ֫(Ll/ۗܶܺ;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 1

    .line 388
    iget-object v0, p0, Ll/ۗܶܺ;->ۧ:Ll/ۙܶܺ;

    invoke-interface {v0, p0, p1}, Ll/ۙܶܺ;->֫(Ll/ۗܶܺ;Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public static ֫()Ll/ۗܶܺ;
    .locals 3

    .line 110
    new-instance v0, Ll/᩻ܶܺ;

    const-string v1, "\r\n|\n|\r"

    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/᩻ܶܺ;-><init>(Ljava/util/regex/Pattern;)V

    const-string v1, ""

    .line 215
    invoke-virtual {v0, v1}, Ll/᩻ܶܺ;->֫(Ljava/lang/CharSequence;)Ll/ܳܶܺ;

    move-result-object v1

    .line 61
    iget-object v1, v1, Ll/ܳܶܺ;->֫:Ljava/util/regex/Matcher;

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    const-string v2, "The pattern may not match the empty string: %s"

    .line 214
    invoke-static {v0, v2, v1}, Ll/ۘܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 219
    new-instance v1, Ll/ۗܶܺ;

    new-instance v2, Ll/֨ܶܺ;

    invoke-direct {v2, v0}, Ll/֨ܶܺ;-><init>(Ll/᩻ܶܺ;)V

    invoke-direct {v1, v2}, Ll/ۗܶܺ;-><init>(Ll/ۙܶܺ;)V

    return-object v1
.end method

.method public static ֫(C)Ll/ۗܶܺ;
    .locals 2

    .line 298
    new-instance v0, Ll/᩹۠ܺ;

    invoke-direct {v0, p0}, Ll/᩹۠ܺ;-><init>(C)V

    .line 143
    new-instance p0, Ll/ۗܶܺ;

    new-instance v1, Ll/۠ܶܺ;

    invoke-direct {v1, v0}, Ll/۠ܶܺ;-><init>(Ll/ۨ۠ܺ;)V

    invoke-direct {p0, v1}, Ll/ۗܶܺ;-><init>(Ll/ۙܶܺ;)V

    return-object p0
.end method

.method public static synthetic ֫(Ll/ۗܶܺ;)Ll/ۨ۠ܺ;
    .locals 0

    .line 102
    iget-object p0, p0, Ll/ۗܶܺ;->ܽ:Ll/ۨ۠ܺ;

    return-object p0
.end method

.method public static synthetic ۧ(Ll/ۗܶܺ;)I
    .locals 0

    .line 102
    iget p0, p0, Ll/ۗܶܺ;->֫:I

    return p0
.end method


# virtual methods
.method public final ֫(Ljava/lang/CharSequence;)Ljava/lang/Iterable;
    .locals 1

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    new-instance v0, Ll/᩹ܶܺ;

    invoke-direct {v0, p0, p1}, Ll/᩹ܶܺ;-><init>(Ll/ۗܶܺ;Ljava/lang/CharSequence;)V

    return-object v0
.end method

.method public final ۧ(Ljava/lang/CharSequence;)Ljava/util/List;
    .locals 3

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    iget-object v0, p0, Ll/ۗܶܺ;->ۧ:Ll/ۙܶܺ;

    invoke-interface {v0, p0, p1}, Ll/ۙܶܺ;->֫(Ll/ۗܶܺ;Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object p1

    .line 403
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 405
    :goto_0
    move-object v1, p1

    check-cast v1, Ll/۠۠ܺ;

    invoke-virtual {v1}, Ll/۠۠ܺ;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 406
    invoke-virtual {v1}, Ll/۠۠ܺ;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 409
    :cond_0
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
