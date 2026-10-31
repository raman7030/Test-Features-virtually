.class public final enum Ll/ۢܺ۠;
.super Ll/֡ۖ۠;
.source "H7RN"


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;Ll/ۢۖ۠;)V
    .locals 10

    const/4 v9, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    .line 420
    invoke-direct/range {v0 .. v9}, Ll/֡ۖ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;Ll/ۢۖ۠;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ᩴۖ۠;Ll/ۘۖ۠;Ll/ۢۖ۠;)V
    .locals 9

    const-string v4, "opt.arg.key.equals.value"

    const-string v5, "opt.A"

    const-string v1, "A"

    const/16 v2, 0x2c

    const-string v3, "-A"

    move-object v0, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    .line 0
    invoke-direct/range {v0 .. v8}, Ll/ۢܺ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;Ll/ۢۖ۠;)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/֨ۖ۠;Ljava/lang/String;)V
    .locals 5

    .line 434
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/16 v2, 0x3d

    .line 438
    invoke-virtual {p2, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    move v0, v2

    .line 439
    :cond_0
    invoke-virtual {p2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 440
    sget-object v1, Ll/֨ᩴ۠;->᩸֫:Ljava/util/regex/Pattern;

    const-string v1, "\\."

    .line 1811
    invoke-virtual {v0, v1, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v4, v0, v3

    .line 1812
    invoke-static {v4}, Ll/ۗ᩸۠;->֫(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 441
    :cond_1
    sget-object v0, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 1981
    new-instance v0, Ll/۫۠۠;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p2, v1, v2

    const-string p2, "compiler"

    const-string v2, "invalid.A.key"

    invoke-direct {v0, p2, v2, v1}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 441
    invoke-virtual {p1, v0}, Ll/֨ۖ۠;->֫(Ll/۫۠۠;)Ll/ۖۖ۠;

    move-result-object p1

    throw p1

    .line 443
    :cond_2
    invoke-virtual {p1, p2, p2}, Ll/֨ۖ۠;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 436
    :cond_3
    sget-object p2, Ll/ۛᩴ۠;->ۧ֫:Ll/۫۠۠;

    invoke-virtual {p1, p2}, Ll/֨ۖ۠;->֫(Ll/۫۠۠;)Ll/ۖۖ۠;

    move-result-object p1

    throw p1
.end method

.method public ֫(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "-A"

    .line 423
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public ᩷()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
