.class public final enum Ll/᩻ۖ۠;
.super Ll/֡ۖ۠;
.source "H7RN"


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;)V
    .locals 9

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    .line 212
    invoke-direct/range {v0 .. v8}, Ll/֡ۖ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ᩴۖ۠;Ll/ۘۖ۠;)V
    .locals 8

    const-string v4, "opt.arg.patch"

    const-string v5, "opt.patch"

    const-string v1, "PATCH_MODULE"

    const/16 v2, 0x11

    const-string v3, "--patch-module"

    move-object v0, p0

    move-object v6, p1

    move-object v7, p2

    .line 0
    invoke-direct/range {v0 .. v7}, Ll/᩻ۖ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;)V

    return-void
.end method

.method public static synthetic ܿ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/16 v0, 0x3d

    .line 229
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ᩳ(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/᩻ۖ۠;->ܿ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public ֫(Ll/֨ۖ۠;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 220
    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 222
    invoke-virtual {p0}, Ll/᩻ۖ۠;->ܿ()Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 223
    sget-object v0, Ll/֡ۖ۠;->ܿۧ:Ll/֡ۖ۠;

    invoke-virtual {p1, v0}, Ll/֨ۖ۠;->֫(Ll/֡ۖ۠;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 225
    invoke-super {p0, p1, p2, p3}, Ll/֡ۖ۠;->֫(Ll/֨ۖ۠;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const/16 v1, 0x3d

    .line 227
    invoke-virtual {p3, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p3, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string v3, "\u0000"

    .line 228
    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/᩹۬ᩴ;->stream([Ljava/lang/Object;)Ll/ܿ᩺ᩴ;

    move-result-object v3

    new-instance v4, Ll/ܳۖ۠;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 229
    invoke-interface {v3, v4}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v3

    .line 230
    invoke-static {}, Ll/᩺ۨᩴ;->toSet()Ll/ۨۨᩴ;

    move-result-object v4

    invoke-interface {v3, v4}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Set;

    .line 231
    invoke-interface {v3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 235
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-super {p0, p1, p2, p3}, Ll/֡ۖ۠;->֫(Ll/֨ۖ۠;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 233
    :cond_1
    sget-object p2, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 3442
    new-instance p2, Ll/۫۠۠;

    const/4 p3, 0x1

    new-array p3, p3, [Ljava/lang/Object;

    aput-object v1, p3, v2

    const-string v0, "compiler"

    const-string v1, "repeated.value.for.patch.module"

    invoke-direct {p2, v0, v1, p3}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    invoke-virtual {p1, p2}, Ll/֨ۖ۠;->֫(Ll/۫۠۠;)Ll/ۖۖ۠;

    move-result-object p1

    throw p1

    .line 239
    :cond_2
    invoke-static {p2, p3}, Ll/ۛᩴ۠;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/۫۠۠;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/֨ۖ۠;->֫(Ll/۫۠۠;)Ll/ۖۖ۠;

    move-result-object p1

    throw p1

    .line 221
    :cond_3
    invoke-static {p2}, Ll/ۛᩴ۠;->֫(Ljava/lang/String;)Ll/۫۠۠;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/֨ۖ۠;->֫(Ll/۫۠۠;)Ll/ۖۖ۠;

    move-result-object p1

    throw p1
.end method

.method public ܿ()Ljava/util/regex/Pattern;
    .locals 1

    const-string v0, "([^/]+)=(,*[^,].*)"

    .line 245
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    return-object v0
.end method
