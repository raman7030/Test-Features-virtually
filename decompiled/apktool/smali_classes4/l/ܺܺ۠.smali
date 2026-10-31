.class public final enum Ll/ܺܺ۠;
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

    .line 447
    invoke-direct/range {v0 .. v8}, Ll/֡ۖ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ᩴۖ۠;Ll/ۘۖ۠;)V
    .locals 8

    const-string v4, "opt.arg.default.module.for.created.files"

    const-string v5, "opt.default.module.for.created.files"

    const-string v1, "DEFAULT_MODULE_FOR_CREATED_FILES"

    const/16 v2, 0x2d

    const-string v3, "--default-module-for-created-files"

    move-object v0, p0

    move-object v6, p1

    move-object v7, p2

    .line 0
    invoke-direct/range {v0 .. v7}, Ll/ܺܺ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/֨ۖ۠;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 452
    sget-object v0, Ll/֡ۖ۠;->ۢ֫:Ll/֡ۖ۠;

    invoke-virtual {p1, v0}, Ll/֨ۖ۠;->֫(Ll/֡ۖ۠;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    .line 455
    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 457
    invoke-virtual {p0}, Ll/ܺܺ۠;->ܿ()Ljava/util/regex/Pattern;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 458
    iget-object p2, v0, Ll/֡ۖ۠;->ۛ:Ljava/lang/String;

    invoke-virtual {p1, p2, p3}, Ll/֨ۖ۠;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 460
    :cond_0
    invoke-static {p2, p3}, Ll/ۛᩴ۠;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/۫۠۠;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/֨ۖ۠;->֫(Ll/۫۠۠;)Ll/ۖۖ۠;

    move-result-object p1

    throw p1

    .line 456
    :cond_1
    invoke-static {p2}, Ll/ۛᩴ۠;->֫(Ljava/lang/String;)Ll/۫۠۠;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/֨ۖ۠;->֫(Ll/۫۠۠;)Ll/ۖۖ۠;

    move-result-object p1

    throw p1

    .line 454
    :cond_2
    iget-object p2, v0, Ll/֡ۖ۠;->ۛ:Ljava/lang/String;

    sget-object p3, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2908
    new-instance p3, Ll/۫۠۠;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    const-string p2, "compiler"

    const-string v1, "option.too.many"

    invoke-direct {p3, p2, v1, v0}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 454
    invoke-virtual {p1, p3}, Ll/֨ۖ۠;->֫(Ll/۫۠۠;)Ll/ۖۖ۠;

    move-result-object p1

    throw p1
.end method

.method public ܿ()Ljava/util/regex/Pattern;
    .locals 1

    const-string v0, "[^,].*"

    .line 466
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    return-object v0
.end method
