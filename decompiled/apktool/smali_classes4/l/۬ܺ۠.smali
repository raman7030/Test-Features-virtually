.class public final enum Ll/۬ܺ۠;
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

    .line 677
    invoke-direct/range {v0 .. v8}, Ll/֡ۖ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ᩴۖ۠;Ll/ۘۖ۠;)V
    .locals 8

    const-string v4, "opt.arg.addmods"

    const-string v5, "opt.addmods"

    const-string v1, "ADD_MODULES"

    const/16 v2, 0x4c

    const-string v3, "--add-modules"

    move-object v0, p0

    move-object v6, p1

    move-object v7, p2

    .line 0
    invoke-direct/range {v0 .. v7}, Ll/۬ܺ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/֨ۖ۠;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 680
    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 682
    invoke-virtual {p0}, Ll/۬ܺ۠;->ܿ()Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 683
    sget-object p2, Ll/֡ۖ۠;->۟:Ll/֡ۖ۠;

    invoke-virtual {p1, p2}, Ll/֨ۖ۠;->֫(Ll/֡ۖ۠;)Ljava/lang/String;

    move-result-object v0

    .line 686
    iget-object p2, p2, Ll/֡ۖ۠;->ۛ:Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x2c

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    :goto_0
    invoke-virtual {p1, p2, p3}, Ll/֨ۖ۠;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 688
    :cond_1
    invoke-static {p2, p3}, Ll/ۛᩴ۠;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/۫۠۠;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/֨ۖ۠;->֫(Ll/۫۠۠;)Ll/ۖۖ۠;

    move-result-object p1

    throw p1

    .line 681
    :cond_2
    invoke-static {p2}, Ll/ۛᩴ۠;->֫(Ljava/lang/String;)Ll/۫۠۠;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/֨ۖ۠;->֫(Ll/۫۠۠;)Ll/ۖۖ۠;

    move-result-object p1

    throw p1
.end method

.method public ܿ()Ljava/util/regex/Pattern;
    .locals 1

    const-string v0, ",*[^,].*"

    .line 694
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    return-object v0
.end method
