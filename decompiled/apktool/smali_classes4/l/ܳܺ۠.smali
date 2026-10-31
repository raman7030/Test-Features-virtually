.class public final enum Ll/ܳܺ۠;
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

    .line 376
    invoke-direct/range {v0 .. v8}, Ll/֡ۖ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ᩴۖ۠;Ll/ۘۖ۠;)V
    .locals 8

    const-string v4, "opt.arg.profile"

    const-string v5, "opt.profile"

    const-string v1, "PROFILE"

    const/16 v2, 0x28

    const-string v3, "-profile"

    move-object v0, p0

    move-object v6, p1

    move-object v7, p2

    .line 0
    invoke-direct/range {v0 .. v7}, Ll/ܳܺ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/֨ۖ۠;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 379
    invoke-static {p3}, Ll/ۛۢ۠;->֫(Ljava/lang/String;)Ll/ۛۢ۠;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 383
    invoke-super {p0, p1, p2, p3}, Ll/֡ۖ۠;->֫(Ll/֨ۖ۠;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 381
    :cond_0
    sget-object p2, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 2097
    new-instance p2, Ll/۫۠۠;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p3, v0, v1

    const-string p3, "compiler"

    const-string v1, "invalid.profile"

    invoke-direct {p2, p3, v1, v0}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 381
    invoke-virtual {p1, p2}, Ll/֨ۖ۠;->֫(Ll/۫۠۠;)Ll/ۖۖ۠;

    move-result-object p1

    throw p1
.end method
